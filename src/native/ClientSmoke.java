import com.sun.tools.attach.VirtualMachine;
import java.nio.file.*;
public class ClientSmoke {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("child")) {
            System.out.println(ProcessHandle.current().pid());
            System.out.flush();
            Thread.sleep(60000);
            return;
        }
        Path folder = Path.of(args[0]);
        Process child =
            new ProcessBuilder(Path.of(System.getProperty("java.home"), "bin", "java.exe").toString(), "-cp",
                               System.getProperty("java.class.path"), "ClientSmoke", "child")
                .redirectErrorStream(true)
                .start();
        try {
            String pid = child.inputReader().readLine();
            var vm = VirtualMachine.attach(pid);
            try {
                vm.loadAgentPath(folder.resolve("PrestigeBridge.dll").toString(), folder + "|selftest");
            } finally {
                vm.detach();
            }
            Thread.sleep(1000);
            if (!child.isAlive())
                throw new IllegalStateException("Native test process stopped unexpectedly.");
            System.out.println("Local native initialization passed.");
        } finally {
            child.destroy();
            child.waitFor();
        }
    }
}
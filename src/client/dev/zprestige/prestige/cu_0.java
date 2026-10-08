/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cv_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.cu
 */
public final class cu_0
implements cz_0 {
    private static int a;
    private static boolean c;
    private static final long d;
    private static final Object[] e;
    private static final String[] f;

    private cu_0() {
    }

    static {
        d = hc.a(2038856935757642996L, 962162074698052554L, MethodHandles.lookup().lookupClass()).a(136083135366004L);
        e = new Object[30];
        f = new String[30];
        cu_0.a();
        a = 0;
        c = 0;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 55;
            case 1 -> 59;
            case 2 -> 57;
            case 3 -> 5;
            case 4 -> 3;
            case 5 -> 8;
            case 6 -> 54;
            case 7 -> 29;
            case 8 -> 19;
            case 9 -> 21;
            case 10 -> 18;
            case 11 -> 53;
            case 12 -> 2;
            case 13 -> 52;
            case 14 -> 9;
            case 15 -> 48;
            case 16 -> 30;
            case 17 -> 15;
            case 18 -> 33;
            case 19 -> 51;
            case 20 -> 7;
            case 21 -> 14;
            case 22 -> 4;
            case 23 -> 47;
            case 24 -> 24;
            case 25 -> 58;
            case 26 -> 62;
            case 27 -> 12;
            case 28 -> 41;
            case 29 -> 39;
            case 30 -> 60;
            case 31 -> 17;
            case 32 -> 20;
            case 33 -> 50;
            case 34 -> 23;
            case 35 -> 56;
            case 36 -> 27;
            case 37 -> 26;
            case 38 -> 38;
            case 39 -> 16;
            case 40 -> 45;
            case 41 -> 37;
            case 42 -> 35;
            case 43 -> 63;
            case 44 -> 6;
            case 45 -> 32;
            case 46 -> 10;
            case 47 -> 61;
            case 48 -> 22;
            case 49 -> 28;
            case 50 -> 42;
            case 51 -> 13;
            case 52 -> 36;
            case 53 -> 49;
            case 54 -> 25;
            case 55 -> 31;
            case 56 -> 11;
            case 57 -> 40;
            case 58 -> 34;
            case 59 -> 43;
            case 60 -> 46;
            case 61 -> 0;
            case 62 -> 44;
            default -> 1;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        cu_0.f[n3] = new String(cArray);
        return n3;
    }

    public static void b(Object[] objectArray) {
        block3: {
            int n;
            long l;
            long l2;
            block2: {
                l2 = (Long)objectArray[0];
                l = (l2 = d ^ l2) ^ 0x7E9CBFE17E1CL;
                CallSite callSite = cu_0.a("M", (long)-7950447763453537954L, (long)l2);
                try {
                    n = a;
                    if (callSite != null) break block2;
                    if (n <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw cu_0.a("M", (Object)matchException, (long)-7950054950727775194L, (long)l2);
                }
                n = 0;
            }
            a = n;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            cu_0.a("M", (Object)objectArray2, (long)-7951075845976490620L, (long)l2);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cu_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == '\u00d5' || c == '\u00cc' || c == '\u00d2') {
                field = cu_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cu_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static void c(Object[] objectArray) {
        block5: {
            class_310 class_3102;
            long l;
            block4: {
                l = (Long)objectArray[0];
                l = d ^ l;
                CallSite callSite = cu_0.a("M", (long)1339678425479320163L, (long)l);
                try {
                    try {
                        class_3102 = b;
                        if (callSite != null) break block4;
                        if (cu_0.a("M", (Object)cu_0.a("\u00e2", (Object)class_3102, (long)1339516682055714430L, (long)l), (int)cu_0.a("\u00e2", (Object)cu_0.a("\u00e2", (Object)cu_0.a("\u00ef", (Object)cu_0.a("\u00ef", (Object)b, (long)1338707676044853280L, (long)l), (long)1339759930239293451L, (long)l), (long)1339539418614009358L, (long)l), (long)1339050369317239627L, (long)l), (long)1338926222623116060L, (long)l) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cu_0.a("M", (Object)matchException, (long)1339417004594401051L, (long)l);
                    }
                    class_3102 = b;
                }
                catch (MatchException matchException) {
                    throw cu_0.a("M", (Object)matchException, (long)1339417004594401051L, (long)l);
                }
            }
            cu_0.a("\u00e2", (Object)cu_0.a("\u00ef", (Object)cu_0.a("\u00ef", (Object)class_3102, (long)1338707676044853280L, (long)l), (long)1339759930239293451L, (long)l), (boolean)false, (long)1338868130846812276L, (long)l);
        }
    }

    private static Method h(long l, long l2) {
        int n = cu_0.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = cu_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = cu_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cu_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cu_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cu_0.f(1257461769932581L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cu_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cu_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cu_0.f(1257461769932581L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cu_0.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                cu_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cu_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cu_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cu_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cu_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0003zFI^}\u0003zQ\u0015Rr\u00191Q\u000bRg\u001e@\u0001V\u0003";
        objectArray[1] = "*\tM\u0012(5*\tZN$:0BZP$/73\b\fqm";
        objectArray[2] = "V#4X^9@#1\u0002M.Wh2\u0004A:F/%\u0013\n*G";
        objectArray[3] = "\u001b\u0003drq \u0010\fu=\u0012-\u0005\u0001zV'/\u0014\u0012fz0\"";
        objectArray[4] = "0^Qm\r\u001c&^T7\u001e\u000b1\u0015W1\u0012\u001f R@&Y\r\u001c";
        objectArray[5] = "r-\u0017k\u0017d\u0007\r\u001cd\u0006+z\u0015\u000fc\u000fb\u0012";
        objectArray[6] = ".Z\u000bH\u0015\u0017.Z\u001c\u0014\u0019\u00184\u0011\u001c\n\u0019\r3`LVL";
        objectArray[7] = "O\u001d\u001d,lTO\u001d\np`[UV\nn`NR'Z46\b\u0005\u001b\u0005crN~KY4";
        objectArray[8] = "\u001dR[c|\u000f\u001dRL?p\u0000\u0007\u0019L!p\u0015\u0000h\u001c{&S";
        objectArray[9] = Integer.TYPE;
        cu_0.f[9] = "java/lang/Integer";
        objectArray[10] = Boolean.TYPE;
        cu_0.f[10] = "java/lang/Boolean";
        objectArray[11] = "\\\u0012\u001a\u00152\u0005\\\u0012\rI>\nFY\rW>\u001fA(]\nj";
        objectArray[12] = Void.TYPE;
        cu_0.f[12] = "java/lang/Void";
        objectArray[13] = "\u0019\u0001(v\u000f\u0018\u000f\u0001-,\u001c\u000f\u0018J.*\u0010\u001b\t\r9=[\u000b\u0011\r;6\u0001F-\u0016;+\u0001\u0001\u001a\u0001";
        objectArray[14] = "$\tJiFV2\tO3UA%BL5YU4\u0005[\"\u0012D\u000f";
        objectArray[15] = "\u001dA/{\u0006.ha$t\u0017a\to/\u007f\u0013;}";
        objectArray[16] = "L@~Bo=9`uM~rXn~Fz(,";
        objectArray[17] = "'2\u001f.Y\u0012,=\u000ea8\u001c'6\n;";
        objectArray[18] = "P\u0012\u000eLHTBDN\"N\u0003OHXN|T\t\u0016\u000f\u0019+\u0010\tM\\\u001f\u0013QKR?";
        objectArray[19] = "&N8<!1s\r1=\u0019>\u001cNa?'mm\u001b&2rW&H>b#&s\u000f37\u0019";
        objectArray[20] = "bk{6\u001f;5i'%d>Ymd.\u000b-(-f3\u001eT";
        objectArray[21] = "\u0013\u000et`QmO\u0013#l=uB\n$7QG\u0016J~a=,^\u0010}5\u0007.P\b.P";
        objectArray[22] = "'Pg\u0002\f\u0012t\u0000bQr\u0018v\u0004b\u0005%O&Q=iN\u000e'Yj\u0014\u0012\u0013pU";
        objectArray[23] = "OTzu\u00038\u0007Hoi<;~PbbV.\u0000V6hM";
        objectArray[24] = "BMW\u0019lOD\u0019]\u0002\u0013X+NTO+LVF@\u0001r1\u001bT\b\u0011/OA\u001eK\u0016\u0013";
        objectArray[25] = "87/7u\u0019*aoYxB6ir\u000e/\u001dj5\u001ei/B0sz:\u007fGc";
        objectArray[26] = "}lg[e\u0003{1}\u0007\u0014\u001a..x\u0006x(zo)Q+\u007f=h}\u0002)G|*ba*\u0003*1xZ/\u001e,=\u0018^\u007f\u001a3.z\ns\u001f=R";
        objectArray[27] = "\\\feX=?\u0000\u00112TQ'\r\b5\u000f=\u0015ZOiXhB_\u001f0\u0018- \u000b\u00135\u0016Qr\u0010M7T/(Z\u000e0h";
        objectArray[28] = "#H@Bp\u0011!FX\u0011\u0015NrEF\u001cy|&\u0005\u001aG\u0015\u0015cPE\u001b.\u0010~VI{";
        Object[] objectArray2 = objectArray;
        objectArray[29] = "bMkw*\u00037\u000ebv\u0012\u000eX\u001dk+*\u0018%\u0015\u007feseh\u00077u.\u001b2Mtr\u0012";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a(Object[] objectArray) {
        int n;
        block4: {
            long l;
            block5: {
                l = (Long)objectArray[0];
                long l2 = (l = d ^ l) ^ 0x49D132573841L;
                CallSite callSite = cu_0.a("M", (long)-1062277602075872842L, (long)l);
                try {
                    try {
                        n = c;
                        if (callSite != null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cu_0.a("M", (Object)matchException, (long)-1061751222611120946L, (long)l);
                    }
                    c = 1;
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = new cv_0();
                    cu_0.a("\u00e2", (Object)cu_0.a("\u00cc", (long)-1062042243264921536L, (long)l), (Object)objectArray2, (long)-1062503946109443962L, (long)l);
                }
                catch (MatchException matchException) {
                    throw cu_0.a("M", (Object)matchException, (long)-1061751222611120946L, (long)l);
                }
            }
            cu_0.a("\u00e2", (Object)cu_0.a("\u00ef", (Object)cu_0.a("\u00ef", (Object)b, (long)-1062429765507161099L, (long)l), (long)-1062076800824378402L, (long)l), (boolean)true, (long)-1062309443264459871L, (long)l);
            n = 2;
        }
        a = n;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = cu_0.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = cu_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cu_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cu_0.c(clazz3, string2, clazz2)) != null) {
                    cu_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cu_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cu_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cu_0.f(1257461769932581L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cu_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


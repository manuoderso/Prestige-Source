/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.g
 */
final class g_0
extends Enum {
    public static final g_0 NONE;
    public static final g_0 EQUIP;
    public static final g_0 RESTORE;
    private static final g_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = hc.a(340650140455791964L, 6909754616383949939L, MethodHandles.lookup().lookupClass()).a(25873297125188L);
        long l = b ^ 0x39F05FD317B6L;
        c = new Object[9];
        d = new String[9];
        g_0.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "l>\u00f9\u0085M\u0088\u0081\u00b8\bl\u00cf\u00dd/%\u00da\u0090\u00ad\bU\u00cc\u00cd\u00bc\u00c6\u00e4\u0082e";
        int n2 = "l>\u00f9\u0085M\u0088\u0081\u00b8\bl\u00cf\u00dd/%\u00da\u0090\u00ad\bU\u00cc\u00cd\u00bc\u00c6\u00e4\u0082e".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = g_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                NONE = new g_0(stringArray[1], 0);
                EQUIP = new g_0(stringArray[2], 1);
                RESTORE = new g_0(stringArray[0], 2);
                a = g_0.a("r", (Object)new Object[0], (long)8875334405098468700L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static g_0[] values() {
        return (g_0[])a.clone();
    }

    public static g_0 valueOf(String string, long l) {
        l = b ^ l;
        return (g_0)((Object)g_0.a("r", g_0.class, (Object)string, (long)9083337781051472131L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = g_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                g_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = g_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = g_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g_0.a(clazz3, string2, clazz2)) != null) {
                    g_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g_0.b(429893578945413L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = g_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = g_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g_0.b(429893578945413L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g_0.b(429893578945413L, 0L);
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

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00ba' || c == '\u00ed' || c == '\u00e5') {
                field = g_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = g_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static g_0[] a(Object[] objectArray) {
        return new g_0[]{NONE, EQUIP, RESTORE};
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 45;
            case 1 -> 3;
            case 2 -> 6;
            case 3 -> 17;
            case 4 -> 47;
            case 5 -> 36;
            case 6 -> 29;
            case 7 -> 62;
            case 8 -> 7;
            case 9 -> 59;
            case 10 -> 49;
            case 11 -> 32;
            case 12 -> 20;
            case 13 -> 41;
            case 14 -> 24;
            case 15 -> 42;
            case 16 -> 43;
            case 17 -> 16;
            case 18 -> 22;
            case 19 -> 52;
            case 20 -> 60;
            case 21 -> 0;
            case 22 -> 31;
            case 23 -> 46;
            case 24 -> 28;
            case 25 -> 55;
            case 26 -> 30;
            case 27 -> 38;
            case 28 -> 63;
            case 29 -> 54;
            case 30 -> 50;
            case 31 -> 48;
            case 32 -> 39;
            case 33 -> 23;
            case 34 -> 21;
            case 35 -> 33;
            case 36 -> 10;
            case 37 -> 27;
            case 38 -> 12;
            case 39 -> 57;
            case 40 -> 51;
            case 41 -> 37;
            case 42 -> 19;
            case 43 -> 11;
            case 44 -> 56;
            case 45 -> 53;
            case 46 -> 40;
            case 47 -> 4;
            case 48 -> 25;
            case 49 -> 61;
            case 50 -> 14;
            case 51 -> 13;
            case 52 -> 44;
            case 53 -> 2;
            case 54 -> 9;
            case 55 -> 34;
            case 56 -> 58;
            case 57 -> 26;
            case 58 -> 5;
            case 59 -> 15;
            case 60 -> 1;
            case 61 -> 35;
            case 62 -> 18;
            default -> 8;
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
        g_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "W!1nS|A!44@kVj72L\u007fG- %\u0007k";
        objectArray[1] = "-!0v\u000b\tX\u0001;y\u001aF9\u000f0r\u001e\u001cM";
        objectArray[2] = "l@J3(EM|\\3-\u001f^kKx.\u0019R\u007fZ?9\u000e\u0019k\u0015";
        objectArray[3] = "Ue\u0019\u000b4_^j\bD_]Ji";
        objectArray[4] = "=\u000f#3\u0019&6\u00002|t&6\u001d&";
        objectArray[5] = "u.\fzj4~!\u001d5\u0017,m&\u0014|";
        objectArray[6] = "\"NoK~\u0002)A~\u0004\u001f\f\"Jz^";
        objectArray[7] = ":\u0014\u0003E-\u0019\"K\u0003;z}aI\u0012\\*\u0006:\u001a\u0006J\u0013D=\u0010\u001aRb\u0018%GB;";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "Qn\nv)&\u0000b\u001f+X'\u0002e\f&\u001f7k;\u000b7!0\u0004<Kt\"YPa\u00143(c\u000e|I9Xc\u0004zL:'2\bo\u0011K";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


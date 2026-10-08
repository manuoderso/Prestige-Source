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
 * Renamed from dev.zprestige.prestige.f
 */
final class f_0
extends Enum {
    public static final f_0 IDLE;
    public static final f_0 PLACE_OBSIDIAN;
    public static final f_0 PLACE_CRYSTAL;
    public static final f_0 BREAK_CRYSTAL;
    private static final f_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                f_0.b = hc.a(9170415815636266908L, -4266510643954670784L, MethodHandles.lookup().lookupClass()).a(161530044308052L);
                var9 = f_0.b ^ 114504945365678L;
                f_0.c = new Object[9];
                f_0.d = new String[9];
                f_0.a();
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "r\u00a6s\u00ae5C\u008f\u00a2\u00c8\u00cb\u00ba\u0001\u008c\u00dd\u00d1\f\u0010/\u008a\u0004n\u00dd\u0095I\n\u00ad\u001a\u0017 n-\u00db\u00b4";
                var7_6 = "r\u00a6s\u00ae5C\u008f\u00a2\u00c8\u00cb\u00ba\u0001\u008c\u00dd\u00d1\f\u0010/\u008a\u0004n\u00dd\u0095I\n\u00ad\u001a\u0017 n-\u00db\u00b4".length();
                var4_7 = 16;
                var3_8 = -1;
lbl31:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = f_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00cd',\u009c\u00bb\u00f1\u00ba\u00d7\u0003\u00b9\u00f5\u00e3\u001dU\u001c@\b\u00b7\u0007F\u008d\u00a7kI\u0011";
                    var7_6 = "\u00cd',\u009c\u00bb\u00f1\u00ba\u00d7\u0003\u00b9\u00f5\u00e3\u001dU\u001c@\b\u00b7\u0007F\u008d\u00a7kI\u0011".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl45:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = f_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl62:
                // 1 sources

                ** continue;
            }
        }
        f_0.IDLE = new f_0(var0_3[3], 0);
        f_0.PLACE_OBSIDIAN = new f_0(var0_3[0], 1);
        f_0.PLACE_CRYSTAL = new f_0(var0_3[1], 2);
        f_0.BREAK_CRYSTAL = new f_0(var0_3[2], 3);
        f_0.a = f_0.a("w", (Object)new Object[0], (long)-209662511700345805L, (long)var9);
    }

    public static f_0[] values() {
        return (f_0[])a.clone();
    }

    public static f_0 valueOf(String string, long l) {
        l = b ^ l;
        return (f_0)((Object)f_0.a("w", f_0.class, (Object)string, (long)-3643513843161245453L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = f_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f_0.b(classArray[i], string, clazz2);
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
            int n = f_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                f_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = f_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = f_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f_0.a(clazz3, string2, clazz2)) != null) {
                    f_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f_0.b(478521459640462L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = f_0.a(l, l2);
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
                clazz3 = f_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        f_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f_0.b(478521459640462L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f_0.b(478521459640462L, 0L);
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
            if (c == '\u00f1' || c == '\u00ff' || c == 't' || c == '\u00d8') {
                field = f_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = f_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static f_0[] a(Object[] objectArray) {
        return new f_0[]{IDLE, PLACE_OBSIDIAN, PLACE_CRYSTAL, BREAK_CRYSTAL};
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
            case 0 -> 18;
            case 1 -> 38;
            case 2 -> 29;
            case 3 -> 35;
            case 4 -> 2;
            case 5 -> 27;
            case 6 -> 10;
            case 7 -> 5;
            case 8 -> 22;
            case 9 -> 53;
            case 10 -> 11;
            case 11 -> 63;
            case 12 -> 16;
            case 13 -> 23;
            case 14 -> 12;
            case 15 -> 48;
            case 16 -> 1;
            case 17 -> 51;
            case 18 -> 39;
            case 19 -> 30;
            case 20 -> 32;
            case 21 -> 31;
            case 22 -> 49;
            case 23 -> 36;
            case 24 -> 20;
            case 25 -> 28;
            case 26 -> 58;
            case 27 -> 13;
            case 28 -> 52;
            case 29 -> 62;
            case 30 -> 14;
            case 31 -> 6;
            case 32 -> 0;
            case 33 -> 45;
            case 34 -> 56;
            case 35 -> 3;
            case 36 -> 61;
            case 37 -> 17;
            case 38 -> 55;
            case 39 -> 33;
            case 40 -> 42;
            case 41 -> 9;
            case 42 -> 43;
            case 43 -> 41;
            case 44 -> 4;
            case 45 -> 26;
            case 46 -> 59;
            case 47 -> 47;
            case 48 -> 21;
            case 49 -> 15;
            case 50 -> 44;
            case 51 -> 7;
            case 52 -> 50;
            case 53 -> 19;
            case 54 -> 25;
            case 55 -> 24;
            case 56 -> 46;
            case 57 -> 60;
            case 58 -> 37;
            case 59 -> 54;
            case 60 -> 34;
            case 61 -> 57;
            case 62 -> 8;
            default -> 40;
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
        f_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u0018`5m\u001ew\u0013o$\"uu\u0007l";
        objectArray[1] = "-UY\u000fM_&ZH@ _&G\\";
        objectArray[2] = "dD\u0012{\u0013&oK\u00034n>|L\n}";
        objectArray[3] = "\u0007mY8Di\u0011m\\bW~\u0006&_d[j\u0017aHs\u0010\u007f";
        objectArray[4] = "N\u00117V\u001b?;1<Y\npZ?7R\u000e*.";
        objectArray[5] = "p_ky\\(Qc}yYrBtj2ZtN`{uMc\u0005u4";
        objectArray[6] = "\b\u0002^\u0017#f\u0003\rOXBh\b\u0006K\u0002";
        objectArray[7] = "n\u0015\u000f[xf4\u0010D)jojTXnz\u0006|SR\u0018rgv\u0013^)-gtVQ\u0010i7`Y5I(<|EU\u0013-w\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "m\u001c;yu\u0000,\u001cp=E\u0010W\u0016;4)F,\u0017)duyk\u0017pb\"\u001b*H&5E";
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
            return MethodHandles.lookup().findStatic(f_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


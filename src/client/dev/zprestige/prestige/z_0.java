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
 * Renamed from dev.zprestige.prestige.z
 */
public final class z_0
extends Enum {
    public static final z_0 MULTIPLY;
    public static final z_0 OVERLAY;
    public static final z_0 REPLACE;
    public static final z_0 ADD;
    public static final z_0 SCREEN;
    private static final z_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private z_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                z_0.b = hc.a(-42792825476387664L, 1233150382049457443L, MethodHandles.lookup().lookupClass()).a(66572224435129L);
                var9 = z_0.b ^ 125068892260108L;
                z_0.c = new Object[9];
                z_0.d = new String[9];
                z_0.a();
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
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "k\u00ceI\u0005#\u00e7,U\u0010^%\f\u00e3\u00dd\u0087\u00bc#\u00c3\u0080\u00f2\u00ce\u0000R9\u00d1\b\u0080\u0090H\u0089\u00b94\u00a2\u0011";
                var7_6 = "k\u00ceI\u0005#\u00e7,U\u0010^%\f\u00e3\u00dd\u0087\u00bc#\u00c3\u0080\u00f2\u00ce\u0000R9\u00d1\b\u0080\u0090H\u0089\u00b94\u00a2\u0011".length();
                var4_7 = 8;
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
                    var0_3[var6_4++] = z_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00ee>\n~\u001dm$\u00d4\b\u00b4`\u00ff\u008c\u00c9\f\u0082\u00c8";
                    var7_6 = "\u00ee>\n~\u001dm$\u00d4\b\u00b4`\u00ff\u008c\u00c9\f\u0082\u00c8".length();
                    var4_7 = 8;
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
                    var0_3[var6_4++] = z_0.a(var8_9).intern();
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
        z_0.MULTIPLY = new z_0(var0_3[1], 0);
        z_0.OVERLAY = new z_0(var0_3[3], 1);
        z_0.REPLACE = new z_0(var0_3[4], 2);
        z_0.ADD = new z_0(var0_3[0], 3);
        z_0.SCREEN = new z_0(var0_3[2], 4);
        z_0.a = z_0.a("\u00e8", (Object)new Object[0], (long)-3647283434559630097L, (long)var9);
    }

    public static z_0[] values() {
        return (z_0[])a.clone();
    }

    public static z_0 valueOf(String string, long l) {
        l = b ^ l;
        return (z_0)((Object)z_0.a("\u00e8", z_0.class, (Object)string, (long)4040224247463610763L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = z_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = z_0.b(classArray[i], string, clazz2);
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
            int n = z_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                z_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = z_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = z_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = z_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = z_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = z_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = z_0.a(clazz3, string2, clazz2)) != null) {
                    z_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = z_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        z_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = z_0.b(475636747927429L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = z_0.a(l, l2);
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
                clazz3 = z_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = z_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = z_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        z_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = z_0.b(475636747927429L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = z_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        z_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = z_0.b(475636747927429L, 0L);
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
            if (c == '\u00ba' || c == '\u00c0' || c == '\u00d3' || c == '\u00c2') {
                field = z_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ba' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = z_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = z_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static z_0[] a(Object[] objectArray) {
        return new z_0[]{MULTIPLY, OVERLAY, REPLACE, ADD, SCREEN};
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
            case 0 -> 30;
            case 1 -> 6;
            case 2 -> 32;
            case 3 -> 55;
            case 4 -> 8;
            case 5 -> 49;
            case 6 -> 34;
            case 7 -> 35;
            case 8 -> 7;
            case 9 -> 12;
            case 10 -> 37;
            case 11 -> 50;
            case 12 -> 17;
            case 13 -> 43;
            case 14 -> 36;
            case 15 -> 52;
            case 16 -> 58;
            case 17 -> 46;
            case 18 -> 4;
            case 19 -> 47;
            case 20 -> 62;
            case 21 -> 0;
            case 22 -> 45;
            case 23 -> 48;
            case 24 -> 28;
            case 25 -> 23;
            case 26 -> 33;
            case 27 -> 61;
            case 28 -> 2;
            case 29 -> 42;
            case 30 -> 63;
            case 31 -> 26;
            case 32 -> 27;
            case 33 -> 20;
            case 34 -> 19;
            case 35 -> 18;
            case 36 -> 56;
            case 37 -> 31;
            case 38 -> 25;
            case 39 -> 59;
            case 40 -> 53;
            case 41 -> 14;
            case 42 -> 44;
            case 43 -> 5;
            case 44 -> 24;
            case 45 -> 40;
            case 46 -> 16;
            case 47 -> 41;
            case 48 -> 21;
            case 49 -> 15;
            case 50 -> 54;
            case 51 -> 51;
            case 52 -> 9;
            case 53 -> 22;
            case 54 -> 13;
            case 55 -> 38;
            case 56 -> 29;
            case 57 -> 10;
            case 58 -> 11;
            case 59 -> 60;
            case 60 -> 1;
            case 61 -> 57;
            case 62 -> 3;
            default -> 39;
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
        z_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "uqgBD ~~v\r/\"j}";
        objectArray[1] = "a\u0005\u0019\u0014Ioj\n\b[$oj\u0017\u001c";
        objectArray[2] = "\u0007G\u0014\r;0\fH\u0005BF(\u001fO\f\u000b";
        objectArray[3] = "~f9\u0005Vhhf<_E\u007f\u007f-?YIknj(N\u0002b";
        objectArray[4] = "u5r4PU\u0000\u0015y;A\u001aa\u001br0E@\u0015";
        objectArray[5] = "+\u0006CNy\u0000\n:UN|Z\u0019-B\u0005\u007f\\\u00159SBhK^0\u001c";
        objectArray[6] = "\u00105\u0015bI\u0001\u001b:\u0004-(\u000f\u00101\u0000w";
        objectArray[7] = "{Y(76n}M8S8g\"]/\u0014(\u000e\u007f\u001b/>>p'Z!*F7:[/!6h4A-S{w,D23}c< ";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "$.\f\u0017}\u001cr&\n\b\u0018\r\u001e$P\u0013#\u001b`f\u000e\u001efd\"&\u0006]'\u0005o%U\u000f\u0018";
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
            return MethodHandles.lookup().findStatic(z_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


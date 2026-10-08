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

public final class A
extends Enum {
    public static final A CRYSTAL;
    public static final A ANCHOR;
    public static final A OBSIDIAN;
    public static final A MACE;
    public final float confidence;
    private static final A[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private A() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.confidence = var3_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                A.b = hc.a(-8376178325159975347L, -6575083009884594011L, MethodHandles.lookup().lookupClass()).a(160828748621505L);
                var9 = A.b ^ 98872741674400L;
                A.c = new Object[9];
                A.d = new String[9];
                A.a();
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
                var5_5 = "Z\u00ff\u00fd2\u00f1\u00beW\u00ec\b\u0016$\u00063\u00c6\u00c3\u00d2\u00fb";
                var7_6 = "Z\u00ff\u00fd2\u00f1\u00beW\u00ec\b\u0016$\u00063\u00c6\u00c3\u00d2\u00fb".length();
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
                    var0_3[var6_4++] = A.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0081\u000b\u0094\u00bc\u001d\u00a3\u0015\u00b0\u0010\u0004\u00f5ud{%[z)I%\u0082\u00a8\u0013c\u00d2";
                    var7_6 = "\u0081\u000b\u0094\u00bc\u001d\u00a3\u0015\u00b0\u0010\u0004\u00f5ud{%[z)I%\u0082\u00a8\u0013c\u00d2".length();
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
                    var0_3[var6_4++] = A.a(var8_9).intern();
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
        A.CRYSTAL = new A(var0_3[1], 0, 1.0f);
        A.ANCHOR = new A(var0_3[0], 1, 1.0f);
        A.OBSIDIAN = new A(var0_3[3], 2, 0.5f);
        A.MACE = new A(var0_3[2], 3, 1.0f);
        A.a = A.a("D", (Object)new Object[0], (long)-3145473199727418750L, (long)var9);
    }

    public static A[] values() {
        return (A[])a.clone();
    }

    public static A valueOf(String string, long l) {
        l = b ^ l;
        return (A)((Object)A.a("D", A.class, (Object)string, (long)8701740706822835470L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = A.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = A.b(classArray[i], string, clazz2);
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
            int n = A.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                A.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = A.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = A.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = A.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = A.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = A.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = A.a(clazz3, string2, clazz2)) != null) {
                    A.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = A.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        A.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = A.b(473062997469345L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = A.a(l, l2);
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
                clazz3 = A.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = A.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = A.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        A.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = A.b(473062997469345L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = A.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        A.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = A.b(473062997469345L, 0L);
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
            if (c == 'd' || c == 'R' || c == '\u00c7' || c == 'q') {
                field = A.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = A.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = A.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static A[] a(Object[] objectArray) {
        return new A[]{CRYSTAL, ANCHOR, OBSIDIAN, MACE};
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
            case 0 -> 0;
            case 1 -> 37;
            case 2 -> 46;
            case 3 -> 9;
            case 4 -> 47;
            case 5 -> 36;
            case 6 -> 19;
            case 7 -> 38;
            case 8 -> 15;
            case 9 -> 10;
            case 10 -> 58;
            case 11 -> 17;
            case 12 -> 26;
            case 13 -> 2;
            case 14 -> 27;
            case 15 -> 48;
            case 16 -> 28;
            case 17 -> 61;
            case 18 -> 5;
            case 19 -> 52;
            case 20 -> 31;
            case 21 -> 21;
            case 22 -> 23;
            case 23 -> 30;
            case 24 -> 62;
            case 25 -> 63;
            case 26 -> 18;
            case 27 -> 56;
            case 28 -> 1;
            case 29 -> 33;
            case 30 -> 11;
            case 31 -> 8;
            case 32 -> 40;
            case 33 -> 24;
            case 34 -> 35;
            case 35 -> 6;
            case 36 -> 3;
            case 37 -> 59;
            case 38 -> 42;
            case 39 -> 53;
            case 40 -> 44;
            case 41 -> 29;
            case 42 -> 13;
            case 43 -> 41;
            case 44 -> 49;
            case 45 -> 20;
            case 46 -> 43;
            case 47 -> 22;
            case 48 -> 4;
            case 49 -> 34;
            case 50 -> 12;
            case 51 -> 51;
            case 52 -> 7;
            case 53 -> 45;
            case 54 -> 50;
            case 55 -> 54;
            case 56 -> 57;
            case 57 -> 16;
            case 58 -> 55;
            case 59 -> 60;
            case 60 -> 39;
            case 61 -> 25;
            case 62 -> 32;
            default -> 14;
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
        A.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "w\u0007\u0010\u000b=\b|\b\u0001DV\nh\u000b";
        objectArray[1] = "\u007fD#!\u001adtK2nwdtV&";
        objectArray[2] = "\u0010\u0016_\"2^\u001b\u0019NmOF\b\u001eG$";
        objectArray[3] = "+G8Y$}=G=\u00037j*\f>\u0005;~;K)\u0012pL";
        objectArray[4] = "5@\u001f>2\t@`\u00141#F!n\u001f:'\u001cU";
        objectArray[5] = "Y*uvX,x\u0016cv]vk\u0001t=^pg\u0015ezIg,'*";
        objectArray[6] = "t. d\u0006\u0014\u007f!1+g\u001at*5q";
        objectArray[7] = "\u0006YLK\u0018&\u001f_D,Yp\u0005NFkI\u0019\u001a_QL@k\u0018]K,\u001e\u007f\u0006PT]\u001ec\u0001\u0003+KM~\u0006\f\u0014RKva";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "?\u007f3E/\u007fxq&JT)\u0005!-Q3;d|/B&@>h!\u0011nquy%GT";
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
            return MethodHandles.lookup().findStatic(A.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


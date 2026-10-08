/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.awt.Color;
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
 * Renamed from dev.zprestige.prestige.cn
 */
public final class cn_0 {
    public static final float a = 0.65f;
    public static final float b = 0.75f;
    public static final float c = 0.9f;
    public static final float d = 1.0f;
    public static final float e = 1.0f;
    public static final float f = 1.0f;
    public static final float g = 4.0f;
    public static final float h = 3.0f;
    public static final float i = 1.5f;
    public static final int j;
    public static final float k = 5.5f;
    public static final float l = 3.0f;
    public static final float m = 3.0f;
    public static final float n = 1.0f;
    public static final float o = 0.5f;
    public static final float p = 4.0f;
    public static final float q = 1.0f;
    public static final Color r;
    public static final Color s;
    public static final Color t;
    public static final Color u;
    public static final Color v;
    private static final Object[] w;
    private static final String[] x;

    private cn_0() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = hc.a(-1958453769665008637L, -8146794429264150779L, MethodHandles.lookup().lookupClass()).a(228416610541395L) ^ 116913846666644L;
                cn_0.w = new Object[3];
                cn_0.x = new String[3];
                cn_0.a();
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[12];
                var4_4 = 0;
                var5_5 = "\u0019\u00e3\u0085x:\u00db\u009cR\u00ce\u008f}\u0093\u00d7\u00a5\u0093\u00a2,\u00f8\u009e\u00dcH\u0083\u008dS\u00a5\u0012d\u00a8p\u0080\u008eo8\u00d5\u00a5\u00bd\u001c\u0089\u00be\u00e0N\u00a6C\u0017\u0005s\u001c\u008d\u000b\u0012r\u00bdvB\u0099\u0018'\u00a8\u00e8ERu\u00a5\u0000<\u0083R\u001d\u00b3\u0003\u00fe\u001eyA\u00d2\u009f1\u0006Mf";
                var6_6 = "\u0019\u00e3\u0085x:\u00db\u009cR\u00ce\u008f}\u0093\u00d7\u00a5\u0093\u00a2,\u00f8\u009e\u00dcH\u0083\u008dS\u00a5\u0012d\u00a8p\u0080\u008eo8\u00d5\u00a5\u00bd\u001c\u0089\u00be\u00e0N\u00a6C\u0017\u0005s\u001c\u008d\u000b\u0012r\u00bdvB\u0099\u0018'\u00a8\u00e8ERu\u00a5\u0000<\u0083R\u001d\u00b3\u0003\u00fe\u001eyA\u00d2\u009f1\u0006Mf".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u0003\u00a5\u0019\u0080\u00e0o\u00ee\u00fe\u00ef7\u0081\u0080JT\u00e7Y";
                    var6_6 = "\u0003\u00a5\u0019\u0080\u00e0o\u00ee\u00fe\u00ef7\u0081\u0080JT\u00e7Y".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl71:
                // 1 sources

                ** continue;
            }
        }
        cn_0.j = (int)var0_3[4];
        cn_0.r = new Color((int)var0_3[6], (int)var0_3[8], (int)var0_3[8], (int)var0_3[5]);
        cn_0.s = cn_0.a("i", (long)7717154576676800407L, (long)var11);
        cn_0.t = new Color((int)var0_3[9], (int)var0_3[9], (int)var0_3[9], (int)var0_3[10]);
        cn_0.u = new Color((int)var0_3[0], (int)var0_3[11], (int)var0_3[2], (int)var0_3[9]);
        cn_0.v = new Color((int)var0_3[1], (int)var0_3[3], (int)var0_3[3], (int)var0_3[7]);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cn_0.a(l, l2);
            object = w[n];
            try {
                if (!(object instanceof String)) break block2;
                cn_0.w[n] = clazz = Class.forName(x[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cn_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cn_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cn_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cn_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static float b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return 3.0f + f * 1.0f + 1.0f + 4.0f + 3.0f;
    }

    private static Field c(long l, long l2) {
        int n = cn_0.a(l, l2);
        Object object = w[n];
        if (object instanceof String) {
            String string = x[n];
            int n2 = string.indexOf(8);
            Class clazz = cn_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cn_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cn_0.a(clazz3, string2, clazz2)) != null) {
                    cn_0.w[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cn_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cn_0.w[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cn_0.b(102607858446123L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cn_0.a(l, l2);
        Object object = w[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = x[n];
                int n3 = string2.indexOf(8);
                clazz3 = cn_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cn_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cn_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cn_0.w[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cn_0.b(102607858446123L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cn_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cn_0.w[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cn_0.b(102607858446123L, 0L);
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

    public static float a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        return f * f10 + 6.0f;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fa' || c == 'q' || c == 'i' || c == 'm') {
                field = cn_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cn_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cn_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = w;
        w[0] = "=j[\u0011N_ \u007f\u00033\u000fR8y";
        objectArray[1] = "zk\u001bWj}qd\n\u0018\u000bszo\u000eB";
        Object[] objectArray2 = objectArray;
        objectArray[2] = "Ft\n\u0014\u007f5\u001a?Fl\u0018Md\u0012vl$7\u00146\u0003Tx|X";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (x[n3] != null) {
            return n3;
        }
        Object object = w[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 60;
            case 2 -> 0;
            case 3 -> 44;
            case 4 -> 42;
            case 5 -> 19;
            case 6 -> 6;
            case 7 -> 1;
            case 8 -> 29;
            case 9 -> 51;
            case 10 -> 39;
            case 11 -> 56;
            case 12 -> 24;
            case 13 -> 58;
            case 14 -> 7;
            case 15 -> 55;
            case 16 -> 35;
            case 17 -> 63;
            case 18 -> 3;
            case 19 -> 47;
            case 20 -> 27;
            case 21 -> 20;
            case 22 -> 18;
            case 23 -> 26;
            case 24 -> 53;
            case 25 -> 11;
            case 26 -> 61;
            case 27 -> 25;
            case 28 -> 17;
            case 29 -> 13;
            case 30 -> 2;
            case 31 -> 4;
            case 32 -> 32;
            case 33 -> 10;
            case 34 -> 34;
            case 35 -> 33;
            case 36 -> 21;
            case 37 -> 52;
            case 38 -> 57;
            case 39 -> 31;
            case 40 -> 28;
            case 41 -> 36;
            case 42 -> 16;
            case 43 -> 62;
            case 44 -> 14;
            case 45 -> 45;
            case 46 -> 50;
            case 47 -> 5;
            case 48 -> 9;
            case 49 -> 15;
            case 50 -> 48;
            case 51 -> 40;
            case 52 -> 37;
            case 53 -> 46;
            case 54 -> 38;
            case 55 -> 12;
            case 56 -> 30;
            case 57 -> 8;
            case 58 -> 22;
            case 59 -> 49;
            case 60 -> 23;
            case 61 -> 43;
            case 62 -> 59;
            default -> 54;
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
        cn_0.x[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cn_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


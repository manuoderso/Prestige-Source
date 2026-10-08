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
 * Renamed from dev.zprestige.prestige.x
 */
public final class x_0
extends Enum {
    public static final x_0 ERROR;
    public static final x_0 INFO;
    public static final x_0 WARNING;
    public static final x_0 SUCCESS;
    public static final x_0 NEUTRAL;
    private final Color a;
    private static final x_0[] b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        x_0.c = hc.a(-3611069352103223973L, 1625055734255497796L, MethodHandles.lookup().lookupClass()).a(60681341397176L);
                        var20 = x_0.c ^ 117488928793906L;
                        x_0.d = new Object[9];
                        x_0.e = new String[9];
                        x_0.a();
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[5];
                        var17_4 = 0;
                        var16_5 = "\u00f3\u0006\u0000\u00da\u00b4\u00e3h\u0097\b\u0006\u0003\u00d8^\u00a8\u00d8\u00dd~\b\u0017\u009e\u00cc\u00dd\u0015(u\u001d";
                        var18_6 = "\u00f3\u0006\u0000\u00da\u00b4\u00e3h\u0097\b\u0006\u0003\u00d8^\u00a8\u00d8\u00dd~\b\u0017\u009e\u00cc\u00dd\u0015(u\u001d".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = x_0.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u008d\u0092i\u00df{\u001fa\u00cd\b\u00f5\u008d\u0003a^\u000b\u00a9\u009f";
                            var18_6 = "\u008d\u0092i\u00df{\u001fa\u00cd\b\u00f5\u008d\u0003a^\u000b\u00a9\u009f".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl45:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = x_0.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[13];
                var4_13 = 0;
                var5_14 = "\u0015.\u00de^T\u0084v\u00ad\u00ffT\u001c\u00ab\u009eB.\u0082a\u0011\u00b7\u00ae,\u001f\u00f2\u0086\u00b9\u00c6c'\u00dd\u00dcr-\u00a1z\u00e1\u0084\u00d6\u0018\u00cad\u009e\u00e4v/\u0087L\u00b1\u0097Q/\u00a6\u00f7\n\u00b7\u00d0\u00d5\u0087(^\u008dQaV\u00b5\u00f05T@\"\u00a7.g{\u00c6\u00beL+\u00f3\u0087XyX\u00c8\u00d6\u00ba&\u00fc_";
                var6_15 = "\u0015.\u00de^T\u0084v\u00ad\u00ffT\u001c\u00ab\u009eB.\u0082a\u0011\u00b7\u00ae,\u001f\u00f2\u0086\u00b9\u00c6c'\u00dd\u00dcr-\u00a1z\u00e1\u0084\u00d6\u0018\u00cad\u009e\u00e4v/\u0087L\u00b1\u0097Q/\u00a6\u00f7\n\u00b7\u00d0\u00d5\u0087(^\u008dQaV\u00b5\u00f05T@\"\u00a7.g{\u00c6\u00beL+\u00f3\u0087XyX\u00c8\u00d6\u00ba&\u00fc_".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl95:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "u\r\u00a0\u0011\u00122\u0000V\u001a\u00cc1&\u0083\u00e7\u0084\u0085";
                    var6_15 = "u\r\u00a0\u0011\u00122\u0000V\u001a\u00cc1&\u0083\u00e7\u0084\u0085".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl114:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl127:
                // 1 sources

                ** continue;
            }
        }
        x_0.ERROR = new x_0(var11_3[2], 0, new Color((int)var0_12[11], (int)var0_12[10], (int)var0_12[12]));
        x_0.INFO = new x_0(var11_3[4], 1, new Color((int)var0_12[3], (int)var0_12[8], (int)var0_12[6]));
        x_0.WARNING = new x_0(var11_3[1], 2, new Color((int)var0_12[5], (int)var0_12[9], 0));
        x_0.SUCCESS = new x_0(var11_3[0], 3, new Color((int)var0_12[2], (int)var0_12[4], (int)var0_12[7]));
        x_0.NEUTRAL = new x_0(var11_3[3], 4, new Color((int)var0_12[0], (int)var0_12[1], (int)var0_12[1]));
        x_0.b = x_0.a("c", (Object)new Object[0], (long)-1741393391709860180L, (long)var20);
    }

    public static x_0[] values() {
        return (x_0[])b.clone();
    }

    public static x_0 valueOf(String string, long l) {
        l = c ^ l;
        return (x_0)((Object)x_0.a("c", x_0.class, (Object)string, (long)-5715670814683605958L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = x_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = x_0.b(classArray[i], string, clazz2);
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
            int n = x_0.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                x_0.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = x_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = x_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = x_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = x_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = x_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x_0.a(clazz3, string2, clazz2)) != null) {
                    x_0.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = x_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        x_0.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x_0.b(449527839371668L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = x_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = x_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = x_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        x_0.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x_0.b(449527839371668L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = x_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        x_0.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x_0.b(449527839371668L, 0L);
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
            if (c == '\u00ce' || c == '\u00e7' || c == '\u00ec' || c == 'V') {
                field = x_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = x_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static x_0[] a(Object[] objectArray) {
        return new x_0[]{ERROR, INFO, WARNING, SUCCESS, NEUTRAL};
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
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 24;
            case 2 -> 16;
            case 3 -> 38;
            case 4 -> 19;
            case 5 -> 33;
            case 6 -> 40;
            case 7 -> 35;
            case 8 -> 41;
            case 9 -> 12;
            case 10 -> 27;
            case 11 -> 36;
            case 12 -> 3;
            case 13 -> 18;
            case 14 -> 25;
            case 15 -> 34;
            case 16 -> 22;
            case 17 -> 32;
            case 18 -> 63;
            case 19 -> 50;
            case 20 -> 5;
            case 21 -> 1;
            case 22 -> 42;
            case 23 -> 29;
            case 24 -> 61;
            case 25 -> 60;
            case 26 -> 56;
            case 27 -> 54;
            case 28 -> 10;
            case 29 -> 6;
            case 30 -> 44;
            case 31 -> 47;
            case 32 -> 26;
            case 33 -> 17;
            case 34 -> 7;
            case 35 -> 46;
            case 36 -> 21;
            case 37 -> 8;
            case 38 -> 49;
            case 39 -> 52;
            case 40 -> 39;
            case 41 -> 15;
            case 42 -> 59;
            case 43 -> 0;
            case 44 -> 57;
            case 45 -> 2;
            case 46 -> 28;
            case 47 -> 58;
            case 48 -> 14;
            case 49 -> 37;
            case 50 -> 13;
            case 51 -> 62;
            case 52 -> 20;
            case 53 -> 51;
            case 54 -> 30;
            case 55 -> 31;
            case 56 -> 53;
            case 57 -> 48;
            case 58 -> 45;
            case 59 -> 9;
            case 60 -> 4;
            case 61 -> 55;
            case 62 -> 11;
            default -> 43;
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
        x_0.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "B\u0013K\u0015i>I\u001cZZ\u0002<]\u001f";
        objectArray[1] = "9b\u0000C];2m\u0011\f0;2p\u0005";
        objectArray[2] = "'\"+\u0002]8,-:M  ?*3\u0004";
        objectArray[3] = "6U5\rq\t U0Wb\u001e7\u001e3Qn\n&Y$F%\u0001";
        objectArray[4] = "p/,=o6\u0005\u000f'2~yd\u0001,9z#\u0010";
        objectArray[5] = "\u0000( tFA!\u00146tC\u001b2\u0003!?@\u001d>\u00170xW\nu\u001c\u007f";
        objectArray[6] = "\u0003-^h\u001c\u000f\b\"O'}\u0001\u0003)K}";
        objectArray[7] = "nPQ#F\u0003l\u0004_D\\\u0016cGC\u0003L\u007f>\u0004\u0011+\\\u0015}UT}\"E>\u0002\u0017{X\u0014uJUDK\u0015x]J8IAv:";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "t\u0007)\\0\u00070\\q^N\u000eN\u0002n\u0000~\u001e)T)\u00073gr\u0000s\u00160\u0001?[(YN";
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
            return MethodHandles.lookup().findStatic(x_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


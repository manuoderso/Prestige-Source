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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.e
 */
final class e_0
extends Enum {
    public static final e_0 IDLE;
    public static final e_0 SWITCH_RAIL;
    public static final e_0 SWITCH_CART;
    public static final e_0 SWITCH_SAFE;
    public static final e_0 WAIT_BACK;
    public static final e_0 SWITCH_WEAPON;
    public static final e_0 USE_WEAPON;
    public static final e_0 CHARGE_BOW;
    public static final e_0 RELEASE_BOW;
    private static final e_0[] a;
    private static final long b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        e_0.b = hc.a(3136222605732478684L, 429148055423024979L, MethodHandles.lookup().lookupClass()).a(46491446509344L);
                        var20 = e_0.b ^ 22322293846872L;
                        var22_1 = var20 ^ 94863778031914L;
                        e_0.f = new Object[9];
                        e_0.g = new String[9];
                        e_0.a();
                        var12_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_3 = 1; var13_3 < 8; ++var13_3) {
                            v2 = v2;
                            v2[var13_3] = (byte)(var20 << var13_3 * 8 >>> 56);
                        }
                        var12_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_4 = new String[9];
                        var17_5 = 0;
                        var16_6 = "\u00bd\u0099\u00f1R$n<i\u0000M\u0099\ne%\u00c0\u00a0\u0010\u00de\u0089\u00e4a\u00de\u0013\tg\u00cf\u008a?\u00a9\u001d\u00b1OV\b\u001d\u00e9\u00b9q\u0016/\u0017\u0016\u0010|\u00ad12@`7b\u0000D$\u00cc\u0092\u00e7F\u00ce\u0010Ly\u00e0\u00e1\u00a7\u0097\u00db%m\u00c7\u00d4$F\u00cb\u00c7x\u0010\u0094\u00ec\u001d\u009f\u0018MN\u00b4\u00da\u00f6a\u00a99\u00c0\"\u00db\u00109\u00daI\u00891X\u00b2\u00eb|c\u000f\u00cf\u0019\u00ceL\t";
                        var18_7 = "\u00bd\u0099\u00f1R$n<i\u0000M\u0099\ne%\u00c0\u00a0\u0010\u00de\u0089\u00e4a\u00de\u0013\tg\u00cf\u008a?\u00a9\u001d\u00b1OV\b\u001d\u00e9\u00b9q\u0016/\u0017\u0016\u0010|\u00ad12@`7b\u0000D$\u00cc\u0092\u00e7F\u00ce\u0010Ly\u00e0\u00e1\u00a7\u0097\u00db%m\u00c7\u00d4$F\u00cb\u00c7x\u0010\u0094\u00ec\u001d\u009f\u0018MN\u00b4\u00da\u00f6a\u00a99\u00c0\"\u00db\u00109\u00daI\u00891X\u00b2\u00eb|c\u000f\u00cf\u0019\u00ceL\t".length();
                        var15_8 = 16;
                        var14_9 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_9;
                            v4 = var16_6.substring(v3, v3 + var15_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = e_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = "\"\u0007\u00d6\u00d9Pv\u00e4k\u00de\u00cd\u00c1\u00f4\u00a7\u00f5\u0017\u00be\u0010\u0098%CaE\u00d8(\u00ec\u00e5Z\u0097\u00fa\u00ab\u008f\\\u00ab";
                            var18_7 = "\"\u0007\u00d6\u00d9Pv\u00e4k\u00de\u00cd\u00c1\u00f4\u00a7\u00f5\u0017\u00be\u0010\u0098%CaE\u00d8(\u00ec\u00e5Z\u0097\u00fa\u00ab\u008f\\\u00ab".length();
                            var15_8 = 16;
                            var14_9 = -1;
lbl47:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_9;
                                v4 = var16_6.substring(v6, v6 + var15_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = e_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var12_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl64:
                        // 1 sources

                        ** continue;
                    }
                }
                e_0.e = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[7];
                var3_14 = 0;
                var4_15 = "Z\u0018\u00b8\u00e7\u00b2\u0011\u00a1\u00a7TaD\u009e\u00aa}\u00e9S$\u00e5\u0013r\u00c8\u0097\u00b7\u0096\u0081\u00cd\u0085\u00b6\u00d4\f\u00bb\u00beD/U\u00e5L\u00fdM\u0092";
                var5_16 = "Z\u0018\u00b8\u00e7\u00b2\u0011\u00a1\u00a7TaD\u009e\u00aa}\u00e9S$\u00e5\u0013r\u00c8\u0097\u00b7\u0096\u0081\u00cd\u0085\u00b6\u00d4\f\u00bb\u00beD/U\u00e5L\u00fdM\u0092".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl101:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u00bd\u00d9$<H\u0004\u0085B\u00f0tp\u0094\u00f0\u00dcp'";
                    var5_16 = "\u00bd\u00d9$<H\u0004\u0085B\u00f0tp\u0094\u00f0\u00dcp'".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl120:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl133:
                // 1 sources

                ** continue;
            }
        }
        e_0.c = var6_13;
        e_0.d = new Integer[7];
        e_0.IDLE = new e_0(var11_4[2], 0);
        e_0.SWITCH_RAIL = new e_0(var11_4[7], 1);
        e_0.SWITCH_CART = new e_0(var11_4[1], 2);
        e_0.SWITCH_SAFE = new e_0(var11_4[8], 3);
        e_0.WAIT_BACK = new e_0(var11_4[5], 4);
        e_0.SWITCH_WEAPON = new e_0(var11_4[6], 5);
        e_0.USE_WEAPON = new e_0(var11_4[0], (int)e_0.a("k", (int)20774, (long)(5427139927137567652L ^ var20)));
        e_0.CHARGE_BOW = new e_0(var11_4[3], (int)e_0.a("k", (int)7498, (long)(7425613340730822607L ^ var20)));
        e_0.RELEASE_BOW = new e_0(var11_4[4], (int)e_0.a("k", (int)17243, (long)(8792686894718374364L ^ var20)));
        v15 = new Object[1];
        v15[0] = var22_1;
        e_0.a = e_0.b("i", (Object)v15, (long)-8716432097359112868L, (long)var20);
    }

    public static e_0[] values() {
        return (e_0[])a.clone();
    }

    public static e_0 valueOf(String string, long l) {
        l = b ^ l;
        return (e_0)((Object)e_0.b("i", e_0.class, (Object)string, (long)-6376616334952374656L, (long)l));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                e_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = e_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = e_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = e_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e_0.a(clazz3, string2, clazz2)) != null) {
                    e_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e_0.b(454719933839529L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = e_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = e_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        e_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e_0.b(454719933839529L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e_0.b(454719933839529L, 0L);
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

    private static e_0[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        e_0[] e_0Array = new e_0[e_0.a("k", (int)15059, (long)(0xCD59BA291BB52BL ^ l))];
        e_0Array[0] = IDLE;
        e_0Array[1] = SWITCH_RAIL;
        e_0Array[2] = SWITCH_CART;
        e_0Array[3] = SWITCH_SAFE;
        e_0Array[4] = WAIT_BACK;
        e_0Array[5] = SWITCH_WEAPON;
        e_0Array[e_0.a("k", (int)19189, (long)(0x5A9212A1937A450FL ^ l))] = USE_WEAPON;
        e_0Array[e_0.a("k", (int)12804, (long)(0x15ABA22C29D83DF9L ^ l))] = CHARGE_BOW;
        e_0Array[e_0.a("k", (int)12966, (long)(0xD81A0AED417BD5FL ^ l))] = RELEASE_BOW;
        return e_0Array;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == '\u00c6' || c == 'M' || c == 'S') {
                field = e_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = e_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "t\u007fU\u000e\u001b\u0010\u007fpDAp\u0012ks";
        objectArray[1] = "\u001dB\t\u0000\u0012`\u0016M\u0018O\u007f`\u0016P\f";
        objectArray[2] = "[\u0013Z#@\u0004P\u001cKl=\u001cC\u001bB%";
        objectArray[3] = "\u0002\u0016mNd\u0000\u0014\u0016h\u0014w\u0017\u0003]k\u0012{\u0003\u0012\u001a|\u00050\u0015";
        objectArray[4] = "DiAB\b\u001c1IJM\u0019SPGAF\u001d\t$";
        objectArray[5] = "lk;ODBMW-OA\u0018^@:\u0004B\u001eRT+CU\t\u0019Bd";
        objectArray[6] = "\u00177Z/\u0012\u0018\u001c8K`s\u0016\u00173O:";
        objectArray[7] = "J\u001b\"\u0012e\u0019@S=y$\u0001\u0014V1>4h\u000b\u0014lHj\u0019OW'yc\u0012\u0017E'A9\u0001\u0002M\\Cj\u0016\u001b\u0014-I\"\tp";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "cA-xn0&\u0011, \u001f+Y@cx|)5Eb${Bb\u0005<#f;>\u0014i$\u001f";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 60;
            case 1 -> 26;
            case 2 -> 13;
            case 3 -> 31;
            case 4 -> 49;
            case 5 -> 7;
            case 6 -> 28;
            case 7 -> 56;
            case 8 -> 17;
            case 9 -> 27;
            case 10 -> 52;
            case 11 -> 24;
            case 12 -> 63;
            case 13 -> 43;
            case 14 -> 5;
            case 15 -> 55;
            case 16 -> 58;
            case 17 -> 23;
            case 18 -> 20;
            case 19 -> 8;
            case 20 -> 10;
            case 21 -> 46;
            case 22 -> 50;
            case 23 -> 36;
            case 24 -> 16;
            case 25 -> 0;
            case 26 -> 41;
            case 27 -> 1;
            case 28 -> 51;
            case 29 -> 29;
            case 30 -> 30;
            case 31 -> 33;
            case 32 -> 9;
            case 33 -> 21;
            case 34 -> 12;
            case 35 -> 22;
            case 36 -> 44;
            case 37 -> 40;
            case 38 -> 39;
            case 39 -> 53;
            case 40 -> 59;
            case 41 -> 57;
            case 42 -> 45;
            case 43 -> 11;
            case 44 -> 34;
            case 45 -> 37;
            case 46 -> 3;
            case 47 -> 25;
            case 48 -> 32;
            case 49 -> 2;
            case 50 -> 42;
            case 51 -> 18;
            case 52 -> 19;
            case 53 -> 4;
            case 54 -> 47;
            case 55 -> 61;
            case 56 -> 35;
            case 57 -> 6;
            case 58 -> 54;
            case 59 -> 14;
            case 60 -> 15;
            case 61 -> 38;
            case 62 -> 48;
            default -> 62;
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
        e_0.g[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x158A;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e_0.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(e_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


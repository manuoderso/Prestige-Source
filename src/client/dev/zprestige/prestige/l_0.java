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
 * Renamed from dev.zprestige.prestige.l
 */
final class l_0
extends Enum {
    public static final l_0 IDLE;
    public static final l_0 PLACE_1;
    public static final l_0 GLOW_1;
    public static final l_0 EXPLODE_DOUBLE_1;
    public static final l_0 GLOW_2;
    public static final l_0 EXPLODE_2;
    public static final l_0 RESTORE;
    private static final l_0[] a;
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
    private l_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        l_0.b = hc.a(-1491005502377227798L, -666395684832298606L, MethodHandles.lookup().lookupClass()).a(158707900563063L);
                        var20 = l_0.b ^ 57637143448375L;
                        var22_1 = var20 ^ 21768276524370L;
                        l_0.f = new Object[9];
                        l_0.g = new String[9];
                        l_0.a();
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
                        var11_4 = new String[7];
                        var17_5 = 0;
                        var16_6 = "VA\u0012D\u009dvA\u00cde\u00a1\u00c2-oE\u0080\u0005\u0018VA\u0012D\u009dvA\u00cd\u00d8B\u00f1kM\u0002q\u0083?\bf5R\n\u00f2\u00ad\b\u00aa\u00f1\u008d\u0011\u00b3~\u00d3\u00e8\bz\u00e0\u00e8\u00d8\u00a5G\u00bd\u007f\b\u0006UV\u00f8\u0099)\u00985";
                        var18_7 = "VA\u0012D\u009dvA\u00cde\u00a1\u00c2-oE\u0080\u0005\u0018VA\u0012D\u009dvA\u00cd\u00d8B\u00f1kM\u0002q\u0083?\bf5R\n\u00f2\u00ad\b\u00aa\u00f1\u008d\u0011\u00b3~\u00d3\u00e8\bz\u00e0\u00e8\u00d8\u00a5G\u00bd\u007f\b\u0006UV\u00f8\u0099)\u00985".length();
                        var15_8 = 16;
                        var14_9 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_9;
                            v4 = var16_6.substring(v3, v3 + var15_8);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = l_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = "'wE\u00f6\u0018c\u0088\u00e4\bu\u00b5\u0085\u00ea@\u00e7\u0099\u00fb";
                            var18_7 = "'wE\u00f6\u0018c\u0088\u00e4\bu\u00b5\u0085\u00ea@\u00e7\u0099\u00fb".length();
                            var15_8 = 8;
                            var14_9 = -1;
lbl47:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_9;
                                v4 = var16_6.substring(v6, v6 + var15_8);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl52:
                        // 1 sources

                        while (true) {
                            var11_4[var17_5++] = l_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            break block14;
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
                l_0.e = new HashMap<K, V>(13);
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
                var6_13 = new long[3];
                var3_14 = 0;
                var4_15 = "\u00f2\u0013\u00e7\u00d6\u000e\u001a\u00a9]\u00c8}\u0091!\u0093\u008f\u00b2m|\u0088e\u00fc\u0084\u00c9N<";
                var5_16 = "\u00f2\u0013\u00e7\u00d6\u000e\u001a\u00a9]\u00c8}\u0091!\u0093\u008f\u00b2m|\u0088e\u00fc\u0084\u00c9N<".length();
                var2_17 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl93:
                // 1 sources

                while (true) {
                    var6_13[v10] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block16;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v10 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        l_0.c = var6_13;
        l_0.d = new Integer[3];
        l_0.IDLE = new l_0(var11_4[6], 0);
        l_0.PLACE_1 = new l_0(var11_4[3], 1);
        l_0.GLOW_1 = new l_0(var11_4[2], 2);
        l_0.EXPLODE_DOUBLE_1 = new l_0(var11_4[1], 3);
        l_0.GLOW_2 = new l_0(var11_4[5], 4);
        l_0.EXPLODE_2 = new l_0(var11_4[0], 5);
        l_0.RESTORE = new l_0(var11_4[4], (int)l_0.a("j", (int)1882, (long)(4413285183518542161L ^ var20)));
        v11 = new Object[1];
        v11[0] = var22_1;
        l_0.a = l_0.b("\u00a5", (Object)v11, (long)2781635761902758561L, (long)var20);
    }

    public static l_0[] values() {
        return (l_0[])a.clone();
    }

    public static l_0 valueOf(String string, long l) {
        l = b ^ l;
        return (l_0)((Object)l_0.b("\u00a5", l_0.class, (Object)string, (long)-4101481005011482583L, (long)l));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = l_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                l_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = l_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = l_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = l_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = l_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = l_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = l_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = l_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = l_0.a(clazz3, string2, clazz2)) != null) {
                    l_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = l_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        l_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = l_0.b(486199397315830L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = l_0.a(l, l2);
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
                clazz3 = l_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = l_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = l_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        l_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = l_0.b(486199397315830L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = l_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        l_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = l_0.b(486199397315830L, 0L);
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

    private static l_0[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        l_0[] l_0Array = new l_0[l_0.a("j", (int)6132, (long)(0x4FCF474B20A78900L ^ l))];
        l_0Array[0] = IDLE;
        l_0Array[1] = PLACE_1;
        l_0Array[2] = GLOW_1;
        l_0Array[3] = EXPLODE_DOUBLE_1;
        l_0Array[4] = GLOW_2;
        l_0Array[5] = EXPLODE_2;
        l_0Array[l_0.a("j", (int)1443, (long)(0x3BEFD0953FEC9B54L ^ l))] = RESTORE;
        return l_0Array;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == 'O' || c == '\u00e9' || c == '\u00d6') {
                field = l_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = l_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = l_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = ",;*c/\u0012:;/9<\u0005-p,?0\u0011<7;({\u000e";
        objectArray[1] = "\u0017[\u0010Tgxb{\u001b[v7\u0003u\u0010Prmw";
        objectArray[2] = "\u001dqXU\u001dk<MNU\u00181/ZY\u001e\u001b7#NHY\f hQ\u0007";
        objectArray[3] = "Tpn|\"3_\u007f\u007f3I1K|";
        objectArray[4] = "UE|/\u0001b^Jm`lb^Wy";
        objectArray[5] = "\u001aT{\u001bne\u0011[jT\u0013}\u0002\\c\u001d";
        objectArray[6] = "}\u00135)\u0014+v\u001c$fu%}\u0017 <";
        objectArray[7] = "E\n\u001alD/\u0004IC>um\u0016\u0017Zl2}\u007fH\u0017g\u000b/\u0005\u0014\u001ab\r\u0013D\u0013\u001dn\u000f~\u0014\b@eu)\u0006NJ0IhE\u0017\u0018\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "L%5\n1DE+cre-_9iIiU^+br6\u0017Z,>\bf\u001dA=R";
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
            case 0 -> 32;
            case 1 -> 22;
            case 2 -> 20;
            case 3 -> 21;
            case 4 -> 53;
            case 5 -> 58;
            case 6 -> 7;
            case 7 -> 4;
            case 8 -> 38;
            case 9 -> 17;
            case 10 -> 43;
            case 11 -> 12;
            case 12 -> 46;
            case 13 -> 6;
            case 14 -> 26;
            case 15 -> 11;
            case 16 -> 44;
            case 17 -> 30;
            case 18 -> 35;
            case 19 -> 16;
            case 20 -> 51;
            case 21 -> 1;
            case 22 -> 40;
            case 23 -> 13;
            case 24 -> 39;
            case 25 -> 59;
            case 26 -> 25;
            case 27 -> 28;
            case 28 -> 41;
            case 29 -> 29;
            case 30 -> 52;
            case 31 -> 54;
            case 32 -> 57;
            case 33 -> 27;
            case 34 -> 2;
            case 35 -> 34;
            case 36 -> 48;
            case 37 -> 0;
            case 38 -> 42;
            case 39 -> 14;
            case 40 -> 18;
            case 41 -> 19;
            case 42 -> 15;
            case 43 -> 31;
            case 44 -> 45;
            case 45 -> 63;
            case 46 -> 47;
            case 47 -> 50;
            case 48 -> 56;
            case 49 -> 62;
            case 50 -> 8;
            case 51 -> 36;
            case 52 -> 3;
            case 53 -> 9;
            case 54 -> 61;
            case 55 -> 10;
            case 56 -> 24;
            case 57 -> 23;
            case 58 -> 5;
            case 59 -> 55;
            case 60 -> 33;
            case 61 -> 49;
            case 62 -> 60;
            default -> 37;
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
        l_0.g[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = l_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2893;
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
                throw new RuntimeException("dev/zprestige/prestige/l", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            l_0.d[n2] = n3;
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
            throw new RuntimeException("dev/zprestige/prestige/l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(l_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


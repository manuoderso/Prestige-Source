/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.c9;
import dev.zprestige.prestige.cp_0;
import dev.zprestige.prestige.de_0;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gJ;
import dev.zprestige.prestige.gf_0;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.dg
 */
public class dg_0
extends de_0 {
    private final Color a;
    private static final long m;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;
    private static final long[] v;
    private static final Integer[] w;
    private static final Map x;
    private static final Object[] y;
    private static final String[] z;

    public dg_0(long l) {
        long l2 = (l = m ^ l) ^ 0x38B3BF9453FFL;
        super((String)((Object)dg_0.a("w", (int)23481, (long)(0x128A0F150A51FB4AL ^ l))), (String)((Object)dg_0.a("w", (int)26530, (long)(0x5BC301E9A0B4C753L ^ l))), l2);
        this.a = dg_0.d("\u00e6", (long)-7519520012564326441L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        dg_0.m = hc.a(7443513572369385588L, -7166414280648150504L, MethodHandles.lookup().lookupClass()).a(40190802401269L);
                        var20 = dg_0.m ^ 67755953520137L;
                        var22_1 = var20 ^ 133122702121757L;
                        dg_0.y = new Object[61];
                        dg_0.z = new String[61];
                        dg_0.c();
                        dg_0.r = new HashMap<K, V>(13);
                        var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                            v2 = v2;
                            v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                        }
                        var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_4 = new String[7];
                        var16_5 = 0;
                        var15_6 = "\u00acC\u0099\u001e,|\u00e5D>i\rw\u00c8\u00f5\u00f9\u00de(\u00d6Uz\u00b4\u00c0Y-6\u0010}0$\u007fa\u0081\u00cd*,qN\u00b4J\u008f\u0019P\u00a94\u00cd\u0097:n\u00d0\u00cc\\!y\u00b7\u00f7\u00f0- $v\u0091oe6\u0082\u008a\u00e9\u007f\u00e8\u00ac\u00fa\u00f9'N\u008d\u0091\u000b*\u00c6\u0005\u0004\u00d5\\\u00e3^o\u00a0#O\u00f30z\u00f9\u008fN\u00c4\u001b\u00be4\u0088X\u001d?l)\u001f\u00a1g\u00fa\u001f\u00eet[\u00e4\u009d\u0099s\u00fd\u00f7\u00f6\u00b5\u00d8W\u007fz\u00ee\u0081\u00cc%\u00d9\u001dn\u00e7\u00de\t\u00a3\u00eb\u00ed\u0015 \r,\u00e32\u00a8\u00e7\u0095{\u00a9Z\u007f\u00bb\t\u008c\u00b0^\u000fJ\u008c\u00d0E_\u00a1l]\u00bd\u00d7\u009e\u00a4p\u00e47";
                        var17_7 = "\u00acC\u0099\u001e,|\u00e5D>i\rw\u00c8\u00f5\u00f9\u00de(\u00d6Uz\u00b4\u00c0Y-6\u0010}0$\u007fa\u0081\u00cd*,qN\u00b4J\u008f\u0019P\u00a94\u00cd\u0097:n\u00d0\u00cc\\!y\u00b7\u00f7\u00f0- $v\u0091oe6\u0082\u008a\u00e9\u007f\u00e8\u00ac\u00fa\u00f9'N\u008d\u0091\u000b*\u00c6\u0005\u0004\u00d5\\\u00e3^o\u00a0#O\u00f30z\u00f9\u008fN\u00c4\u001b\u00be4\u0088X\u001d?l)\u001f\u00a1g\u00fa\u001f\u00eet[\u00e4\u009d\u0099s\u00fd\u00f7\u00f6\u00b5\u00d8W\u007fz\u00ee\u0081\u00cc%\u00d9\u001dn\u00e7\u00de\t\u00a3\u00eb\u00ed\u0015 \r,\u00e32\u00a8\u00e7\u0095{\u00a9Z\u007f\u00bb\t\u008c\u00b0^\u000fJ\u008c\u00d0E_\u00a1l]\u00bd\u00d7\u009e\u00a4p\u00e47".length();
                        var14_8 = 16;
                        var13_9 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_9;
                            v4 = var15_6.substring(v3, v3 + var14_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = dg_0.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "\u009b\u00d3\u0082\u0012\u00fdI?\u0003\u0089u\u00d99\u0087\u00a5UX\u0018sq\u0087\u00ba\u0093p?\u00ca\u00b2\u00f3\u0093\u001f\u007fGL\u00e6s\u009f\u0007\u00a4\u00f5E\u00a7:";
                            var17_7 = "\u009b\u00d3\u0082\u0012\u00fdI?\u0003\u0089u\u00d99\u0087\u00a5UX\u0018sq\u0087\u00ba\u0093p?\u00ca\u00b2\u00f3\u0093\u001f\u007fGL\u00e6s\u009f\u0007\u00a4\u00f5E\u00a7:".length();
                            var14_8 = 16;
                            var13_9 = -1;
lbl48:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_9;
                                v4 = var15_6.substring(v6, v6 + var14_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = dg_0.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var11_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl65:
                        // 1 sources

                        ** continue;
                    }
                }
                dg_0.p = var18_4;
                dg_0.q = new String[7];
                dg_0.x = new HashMap<K, V>(13);
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
                var6_13 = new long[8];
                var3_14 = 0;
                var4_15 = "\u00fa@\u00da\u0093Z\u000b\u00cb\u001c\u00e8\u00a2m\u00e8|d?P<\u0082\u00ca\u008d\u0088\u00f0\u00d2\u0084#\u001b\u00b2\u00e6\u00f9m\u00c5GU\u0095s;`\u0001j(\u00fb@o\u00b2\u00fa\u00f0.\u00e4";
                var5_16 = "\u00fa@\u00da\u0093Z\u000b\u00cb\u001c\u00e8\u00a2m\u00e8|d?P<\u0082\u00ca\u008d\u0088\u00f0\u00d2\u0084#\u001b\u00b2\u00e6\u00f9m\u00c5GU\u0095s;`\u0001j(\u00fb@o\u00b2\u00fa\u00f0.\u00e4".length();
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
lbl104:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u00b2l\u00c5\n.\u00bf(\u009d*\u0012%,\r=\u00fd'";
                    var5_16 = "\u00b2l\u00c5\n.\u00bf(\u009d*\u0012%,\r=\u00fd'".length();
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
lbl123:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        dg_0.v = var6_13;
        dg_0.w = new Integer[8];
        v15 = new Object[3];
        v15[2] = var22_1;
        v15[1] = 0;
        v15[0] = dg_0.a("w", (int)17538, (long)(5143512684366370001L ^ var20));
        dg_0.d("A", (Object)cp_0.b, (Object)v15, (long)-1800458242711343722L, (long)var20);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (z[n3] != null) {
            return n3;
        }
        Object object = y[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 25;
            case 1 -> 1;
            case 2 -> 46;
            case 3 -> 3;
            case 4 -> 51;
            case 5 -> 39;
            case 6 -> 26;
            case 7 -> 30;
            case 8 -> 19;
            case 9 -> 20;
            case 10 -> 14;
            case 11 -> 7;
            case 12 -> 18;
            case 13 -> 17;
            case 14 -> 42;
            case 15 -> 15;
            case 16 -> 37;
            case 17 -> 10;
            case 18 -> 22;
            case 19 -> 28;
            case 20 -> 21;
            case 21 -> 56;
            case 22 -> 16;
            case 23 -> 40;
            case 24 -> 8;
            case 25 -> 34;
            case 26 -> 27;
            case 27 -> 35;
            case 28 -> 60;
            case 29 -> 61;
            case 30 -> 52;
            case 31 -> 4;
            case 32 -> 54;
            case 33 -> 58;
            case 34 -> 5;
            case 35 -> 2;
            case 36 -> 31;
            case 37 -> 41;
            case 38 -> 6;
            case 39 -> 44;
            case 40 -> 63;
            case 41 -> 62;
            case 42 -> 29;
            case 43 -> 53;
            case 44 -> 0;
            case 45 -> 36;
            case 46 -> 49;
            case 47 -> 13;
            case 48 -> 48;
            case 49 -> 12;
            case 50 -> 59;
            case 51 -> 23;
            case 52 -> 50;
            case 53 -> 32;
            case 54 -> 55;
            case 55 -> 43;
            case 56 -> 38;
            case 57 -> 33;
            case 58 -> 24;
            case 59 -> 11;
            case 60 -> 57;
            case 61 -> 9;
            case 62 -> 45;
            default -> 47;
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
        dg_0.z[n3] = new String(cArray);
        return n3;
    }

    @Override
    protected bT b(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x6F71286D06BCL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (dt_0)((Object)dg_0.d("A", (Object)this.j, (Object)dg_0.d("\u00e1", (int)n, (long)-2444344525081091251L, (long)l), arg_0 -> this.lambda$createBuffer$1(n, arg_0), (long)-2445207215921533976L, (long)l));
        return dg_0.d("A", (Object)aq_02, (Object)objectArray2, (long)-2444647401101819502L, (long)l);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dg_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x11E3;
        if (w[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])x.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    x.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dg_0.w[n2] = n3;
        }
        return w[n2];
    }

    private static void c() {
        Object[] objectArray = y;
        y[0] = ":G\u000b\u001fL\u0001?R\u0000\u001fO\u00060[\u000b]\u000e1\u0019\u0004_";
        objectArray[1] = Integer.TYPE;
        dg_0.z[1] = "java/lang/Integer";
        objectArray[2] = Void.TYPE;
        dg_0.z[2] = "java/lang/Void";
        objectArray[3] = "&$W=h70$Rg{ 'oQaw46(Fv<#'";
        objectArray[4] = "\t\u0016\u0010\u0004I\u000e|6\u001b\u000bXA\u001d8\u0010\u0000\\\u001bi";
        objectArray[5] = "\u0017rB\u0017f\u000b\u0001rGMu\u001c\u00169DKy\b\u0007~S\\2\u001f\u0010";
        objectArray[6] = "p\u000e(=\u000eh\u0005.#2\u001f'd (9\u001b}\u0010";
        objectArray[7] = "{\u0019'_Q/m\u0019\"\u0005B8zR!\u0003N,k\u00156\u0014\u00059K";
        objectArray[8] = "jz:y\u0014x|z?#\u0007ok1<%\u000b{zv+2@oD";
        objectArray[9] = "=*\u0013\u0007w\u00016%\u0002H\n\u0019%\"\u000b\u0001";
        objectArray[10] = Float.TYPE;
        dg_0.z[10] = "java/lang/Float";
        objectArray[11] = "|r\u0000\u0007V&\tR\u000b\bGih\\\u0000\u0003C3\u001c";
        objectArray[12] = "WG7\u0006}\u0017RR<\u0006~\u0010][7D?'t\u0004a";
        objectArray[13] = "\u0000\n\u001f\u0002*/\u001d\u001fG k\"\u0005\u0019";
        objectArray[14] = "['A\u0000>@M'DZ-WZlG\\!CK+PKjVh";
        objectArray[15] = "Hh~rBf=Hu}S)\\F~vWs(";
        objectArray[16] = "@6sJQXV6v\u0010BOA}u\u0016N[P:b\u0001\u0005Ou";
        objectArray[17] = "mBN+n8\u0018bE$\u007fwylN/{-\r";
        objectArray[18] = ")\u000e\u0014S\u0010N\\.\u001f\\\u0001\u0001= \u0014W\u0005[I";
        objectArray[19] = "eT(5</sT-o/8d\u001f.i#,uX9~h8U";
        objectArray[20] = "h\u0013|\u0010~Y\u001d3w\u001fo\u0016|=|\u0014kL\b";
        objectArray[21] = "\u001ffkAo\u0000\tfn\u001b|\u0017\u001e-m\u001dp\u0003\u000fjz\n;\u00174";
        objectArray[22] = "9\"GDW+L\u0002LKFd-\fG@B>Y";
        objectArray[23] = "0I^<J\t&I[fY\u001e1\u0002X`U\n EOw\u001e\u001e\u0001";
        objectArray[24] = "h\u001ed$*8\u001d>o+;w|0d ?-\b";
        objectArray[25] = "3#LlSM%#I6@Z2hJ0LN#/]'\u0007Z\u0004";
        objectArray[26] = "\u0011=n\u0002t?\u0007=kXg(\u0010vh^k<\u00011\u007fI ,L";
        objectArray[27] = "\tsY\t\u0011\u001a|SR\u0006\u0000U\u001d]Y\r\u0004\u000fi";
        objectArray[28] = "\u0015S\u0016\u000b\f-`s\u001d\u0004\u001db\u0001}\u0016\u000f\u00198u";
        objectArray[29] = "_\nR\u0003N\u001fA\u0002HL-\u000bE";
        objectArray[30] = "g\"\u0011 qCl-\u0000o\u0010Mg&\u00045";
        objectArray[31] = "\u0016_l%\u0001_\bWvjI_\u0012]n-@DRxo*L^\u0015Qt";
        objectArray[32] = "RJ\"\u0014*$YE3[M&LN3\u0010v";
        objectArray[33] = "2 \u001dV#,$ \u0018\f0;3k\u001b\n</\",\f\u001dw='";
        objectArray[34] = "\b\u0000~hj\\} ug{\u0013\u001c.~l\u007fIh";
        objectArray[35] = "T\u0000@-R\u0011B\u0000EwA\u0006UKFqM\u0012D\fQf\u0006\u0003d";
        objectArray[36] = "N>T`kBFr\u0001g\u0002N\u0012\u007f#|oL\u0019\u0003U8<\u001dNj\u0017`m^\u007f";
        objectArray[37] = "\u000bxbXw\u001a\\r}\u001b\u0006\u00171tyM:\u0017\u000fl&\u001b8z\bc{\u0019y\u0011RnyF\u0006";
        objectArray[38] = "\u0019\u001c\u0016f\u0005\u0005\u0014\f\u0002gc\u0012\u001d\u0003\u0001w\u001f\u0014;\b0`\u0018\u0014\u001c\u001aynZ\u0006\u0015W\u001f;\r\u0001Cf\u001dk\u001c\u000b\u001a_\u0013vSGz\u0002@u\fH\u001cW\u0017rZy";
        objectArray[39] = "e\u001bmF\u0007\u0017mW8An\u001b9Z\u000fM\u0002tm\u0018k\u001c_\u001d/@:_n";
        objectArray[40] = "\u0001\u00067kCJ_\b~-sY<[da\u0014I\u0003\u0018cmL0\u0003Tj*\u001fA\u0004\fq3s\u000f\r\u0001u=\u0002\bU\u001alQNS\u0005_>+\u0010]L\u0019\u000e";
        objectArray[41] = "-Mk\u001e\u001cQsC\"X,B\u0010\u00108\u0014KR/S?\u0018\u0013+/\u001f6_@Z(G-F,\u0014!J)H]\u0013yQ0$\u0013\u001atU>U\u0014BoLR\u001b\u001dOkB#\u001cETr.oG\u0015\u0011 T1I\\W\u0010";
        objectArray[42] = "r\u0014}\u0018\n!tU.\u00163c~\roDts\u0017P,\u0017\u000f,~\u0012tFL\u001dr\u0014}\u0018\n!tU.\u00163";
        objectArray[43] = "h\u0018yqj\u001e?V`r\u0004\u0015Y\u000fw&8\u0011g\u0017(p:|h\u0018yqj\u001e?V`r\u0004";
        objectArray[44] = "'>\u0001\u0006Q9y0H@a*\u001ad\u0006\u0002]rs&^S\u001eC'>\u0001\u0006Q9y0H@a";
        objectArray[45] = "Rjk!!\u0013P\u007f-|P\u0000n}p/l\u0004Pe/yniWjr{/\u0002\rgp$P";
        objectArray[46] = "I'93O1M<g45h/#;>\tl\u0011;dh\u000b\u0001H\"e2MbNx>i5";
        objectArray[47] = "\u000b\u0007QAsV\\IHB\u001d]:\u0010_\u0016!Y\u0004\b\u0000@#4W\tR\u0006,KXNEG\u001d";
        objectArray[48] = "gc?:\f\u00130-&9b\u0018Vt1m^\u001chln;\\q9+ne\u000f\u00184h+ob";
        objectArray[49] = "6\u000b\u0012zSEaE\u000by=N\u0007\u001c\u001c-\u0001J9\u0004C{\u0003'g\u0015B!Z\\hD\u0012.=";
        objectArray[50] = "i\u0012\u0019\u0016+\u0005a^L\u0011B\t5Sh\u0014:\u00061/\u0018N|ZiFZ\u0016-\u0019X";
        objectArray[51] = "\u001f\u0013#\u0018\u0013tA\u001dj^#g\"Np\u0012Dw\u001d\rw\u001e\u001c\u000e\u001dA~YO\u007f\u001a\u0019e@#3AI \u0012YmO\u0000f\"";
        objectArray[52] = "P\u001b\u000b}\u0013PY\u001f\u0006\u0013\u0006Y}\u0011\u0014r\u0017Ph\u0017\u0018o\u0014GYzQ-W\u0001\u0005\u0013\u0013u\u0006B4C\u0019vTB_\u0019\u0014t\u000b=";
        objectArray[53] = "t/-M\\\u0000p's\u0012>YO1s@\u0002]q),\u0016\u00000s&hNOJq3.\u0013>";
        objectArray[54] = "!~>*\u0004+v0')j#\u0010i0}V$.qo+TIzchiRwls'yj";
        objectArray[55] = "t\"\u000bg&\u000ej0\f>\u001e\u001a\u0015(\n2\"\u001d+0Ud pt\"\u000bg&\u000ej0\f>\u001e";
        objectArray[56] = "\n:Ry\u000e\u0000\u0002v\u0007~g<{F6RgR\u0006?\fv\u0004ZJj\u000b";
        objectArray[57] = "k1S\u001dK\u000bi$\u0015@:\u0018W&H\u0013\u0006\u001ci>\u0017E\u0004qn~\u0011F\u000b\u0018,&@\u0005:";
        objectArray[58] = "S\u0019RKFA[U\u0007L/M\u000fX IROb\u001dT\u0013\u0013\u0013\u000b_\fBP\"";
        objectArray[59] = "\u001cxO!xO\u001dl\b4BRHHT;.aArI 8P,;\u000bc~\fEyS2==\u0015<\u000basTWdZ\"B\u0004]g\b\")^PeW]";
        Object[] objectArray2 = objectArray;
        objectArray[60] = "@\u000ehptC\u0017@qs\u001aHq\u0019f'&LO\u00019q$!\u001d\u0007j6kE\u0017\u0010mr\u001a";
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d4' || c == '\u00a3' || c == '\u00e6' || c == 'k') {
                field = dg_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dg_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dg_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void c(Object[] objectArray) {
        gJ gJ2 = (gJ)objectArray[0];
        long l = (Long)objectArray[1];
        dg_0.d("A", (Object)dg_0.d("A", (Object)dg_0.d("A", (Object)gJ2, (Object)dg_0.a("w", (int)19917, (long)(0x1F724AD73C4B0D61L ^ l)), (float)((float)dg_0.d("A", (Object)this.a, (long)8645098723657284828L, (long)l) / 255.0f), (float)((float)dg_0.d("A", (Object)this.a, (long)8645018141153258407L, (long)l) / 255.0f), (float)((float)dg_0.d("A", (Object)this.a, (long)8646593891136525497L, (long)l) / 255.0f), (float)((float)dg_0.d("A", (Object)this.a, (long)8646051410098592779L, (long)l) / 255.0f), (long)8645247013903887811L, (long)l), (Object)dg_0.a("w", (int)7793, (long)(0x1C9D4286EF5ED8L ^ l)), (float)0.5f, (long)8645980908169861829L, (long)l), (Object)dg_0.a("w", (int)7896, (long)(0x367F48070AEFDE77L ^ l)), (float)2.0f, (long)8645980908169861829L, (long)l);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = dg_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dg_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dg_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dg_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = dg_0.i(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = z[n];
                int n3 = string2.indexOf(8);
                clazz3 = dg_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dg_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dg_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        dg_0.y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dg_0.j(2138123264979637L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dg_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dg_0.y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dg_0.j(2138123264979637L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3759;
        if (q[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])r.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n2].getBytes("ISO-8859-1");
            dg_0.q[n2] = dg_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
    }

    @Override
    public c9 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x59EB766A2C2FL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = dp_0::a;
        objectArray2[1] = this::lambda$getPipeline$2;
        objectArray2[0] = dg_0.d("A", (Object)this, (Object)new Object[0], (long)-2006305285889719193L, (long)l);
        return dg_0.d("A", (Object)new c9(), (Object)objectArray2, (long)-2006169232067834730L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dg_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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

    private static Field k(long l, long l2) {
        int n = dg_0.i(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            String string = z[n];
            int n2 = string.indexOf(8);
            Class clazz = dg_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dg_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dg_0.e(clazz3, string2, clazz2)) != null) {
                    dg_0.y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dg_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dg_0.y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dg_0.j(2138123264979637L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dg_0.i(l, l2);
            object = y[n];
            try {
                if (!(object instanceof String)) break block2;
                dg_0.y[n] = clazz = Class.forName(z[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void lambda$getPipeline$2(dy_0 dy_02) {
        long l = m ^ 0x30C0A93606B8L;
        long l2 = l ^ 0x1FDA123DA51BL;
        dg_0.d("\u00e1", (int)dg_0.c("i", (int)27688, (long)(0x6A2049087BF4E272L ^ l)), (long)-6938892162780831638L, (long)l);
        dg_0.d("\u00e1", (int)dg_0.c("i", (int)17218, (long)(0x68853FE5E62ECD1DL ^ l)), (int)this.h.a, (long)-6937815685649010956L, (long)l);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        dg_0.d("A", (Object)this, (Object)objectArray, (long)-6939938871146117203L, (long)l);
        dg_0.d("A", (Object)dg_0.d("\u00e1", (int)dg_0.d("A", (Object)dg_0.d("A", (Object)this, (Object)new Object[0], (long)-6938848519890370565L, (long)l), (Object)new Object[0], (long)-6937979147325263208L, (long)l), (long)-6939416586685180340L, (long)l), (Object)dg_0.a("w", (int)10178, (long)(0x7CDD324A1A938F26L ^ l)), (float)(1.0f / (float)this.d), (float)(1.0f / (float)this.e), (long)-6939182400729870618L, (long)l);
    }

    private dt_0 lambda$createBuffer$1(int n, Integer n2) {
        long l = m ^ 0x51BCD906A93FL;
        long l2 = l ^ 0x187E29175477L;
        fW[] fWArray = new fW[dg_0.c("i", (int)26702, (long)(0x7A555592C3C14990L ^ l))];
        fWArray[0] = dg_0.d("\u00e1", (Object)new Object[]{this.g.a}, (long)3472977047247368749L, (long)l);
        fWArray[1] = dg_0.d("\u00e1", (Object)new Object[]{cp_0.b}, (long)3472887545265821179L, (long)l);
        Object[] objectArray = new Object[3];
        objectArray[2] = true;
        objectArray[1] = false;
        objectArray[0] = (int)dg_0.c("i", (int)4876, (long)(0x467D7D4D71C9B2D5L ^ l));
        fWArray[2] = dg_0.d("\u00e1", (Object)objectArray, (long)3473344382923722720L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = true;
        objectArray2[0] = true;
        fWArray[3] = dg_0.d("\u00e1", (Object)objectArray2, (long)3472690117786937465L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (int)dg_0.c("i", (int)14776, (long)(0x4A03379310841863L ^ l));
        objectArray3[0] = (int)dg_0.c("i", (int)4330, (long)(0x4BA6B2D26ABF3130L ^ l));
        fWArray[4] = dg_0.d("\u00e1", (Object)objectArray3, (long)3473858655194636534L, (long)l);
        fWArray[5] = dg_0.d("\u00e1", (Object)new Object[]{arg_0 -> dg_0.lambda$createBuffer$0(n, arg_0)}, (long)3473601200112561944L, (long)l);
        return new dt_0(gf_0.c, 4, true, fWArray, l2);
    }

    private static void lambda$createBuffer$0(int n, dy_0 dy_02) {
        long l = m ^ 0x443DCF1792L;
        dg_0.d("\u00e1", (int)dg_0.c("i", (int)6738, (long)(0x58CECA7648640520L ^ l)), (long)-8170045584346058432L, (long)l);
        dg_0.d("\u00e1", (int)dg_0.c("i", (int)27228, (long)(0x4DE6B633A7E7752DL ^ l)), (int)n, (long)-8170130191361179682L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dg_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dg_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(dg_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


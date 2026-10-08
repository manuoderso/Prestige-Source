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
 * Renamed from dev.zprestige.prestige.df
 */
public class df_0
extends de_0 {
    private final Color a;
    private final int b;
    private final float c;
    private final float f;
    private final float i;
    private final float k;
    private final float l;
    private static final long m;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;
    private static final long[] v;
    private static final Integer[] w;
    private static final Map x;
    private static final long[] y;
    private static final Long[] z;
    private static final Map A;
    private static final Object[] F;
    private static final String[] G;

    public df_0(long l) {
        long l2 = (l = m ^ l) ^ 0x18FAA342640BL;
        super((String)((Object)df_0.a("a", (int)14067, (long)(0x30F11407001DDD9DL ^ l))), (String)((Object)df_0.a("a", (int)8716, (long)(0x2A0CB228655D496FL ^ l))), l2);
        this.a = df_0.g("K", (long)-6895437949019114590L, (long)l);
        this.b = (int)df_0.c("y", (int)13435, (long)(0x10AE2D476854D25DL ^ l));
        this.c = 15.0f;
        this.f = 0.0f;
        this.i = 2.0f;
        this.k = 0.7f;
        this.l = 0.8f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                df_0.m = hc.a(4207763641895838115L, -3425811002770668895L, MethodHandles.lookup().lookupClass()).a(125813498804019L);
                                var31 = df_0.m ^ 83466448873496L;
                                var33_1 = var31 ^ 74122505140885L;
                                df_0.F = new Object[75];
                                df_0.G = new String[75];
                                df_0.c();
                                df_0.r = new HashMap<K, V>(13);
                                var22_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var31 >>> 56);
                                for (var23_3 = 1; var23_3 < 8; ++var23_3) {
                                    v2 = v2;
                                    v2[var23_3] = (byte)(var31 << var23_3 * 8 >>> 56);
                                }
                                var22_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var29_4 = new String[11];
                                var27_5 = 0;
                                var26_6 = "\u000fR\u00ed;\u00cfR\u00e0\u00cd\u00dc\u0094\u0085\u0081\u009f\u00b6\u00b8\u00eb\u00feP\u008e6-\u00a3\u008a4\u0018\u00c4\u00b97\u00c4\u0096\u0092\u0018S\u00b1\u001d\u00eb\u001c\u00ac<\u00f5&\u00c9 \u00d6\u00ba\u008b\u00c8\u0090U\u0010\u00dc\u00ca\u00e6<\u00dc\u008d^\u00fbC\u00ba\u007f\u0010:\u00dc\u00d8\u00eb\u0010\u00af\u00dc]\u0097B\u000e\u00a9\f\u00fd^\u00be\u0011\u0005\u00b4\u0006U8\u00f5tr\u00f7\u00f7\u00bb\u00f3\u00cb.\u008f\u00e9\u00f3\u00cb\u0099\n\u00eb\u00ba\u00e4\u00f5\u009ein\u0013\u00a4y\u009d\u008cr\u0085\u00d9\u0087\u00e9\u00c7\u0094\u0082\nf\u000e\u00bf=\u009c\u0019q8Gm\u00edJ\u0015)1M!\u00a3\u008bC\u0018\u00f4\u00a8+\u00a3\u00a3P\u00fd\u00e6e\u00bd\u008e8\u0089\u00ab\u00ee\n\u0084\u001d\u009dp\u00a8v\u00de\u00a9\u0010@G\u008f\u001c\u0003\u00f2W\u00b6\u00c2*yy]\u001b\u00ca\u009f 8\u00d3Ls\u00d8\u009en\u000f\u000e\u00a3\u0091b\\?1\u00fe\u00fetg\u0085\u00b0K\u0004\u009a\u0004\\&\u0081\u00d4\u0088\u0011\u00ac Z\u00f9v0\u00fd\u0003\u0094\u00fb\u008d\u0098\u00bb\u00cbc\u00c2\u000e\u008e\u00b35\u00a1\u0090P\u0005\u00e6\t\u00a0xc\u00f5\u00da\u008cO\u001a";
                                var28_7 = "\u000fR\u00ed;\u00cfR\u00e0\u00cd\u00dc\u0094\u0085\u0081\u009f\u00b6\u00b8\u00eb\u00feP\u008e6-\u00a3\u008a4\u0018\u00c4\u00b97\u00c4\u0096\u0092\u0018S\u00b1\u001d\u00eb\u001c\u00ac<\u00f5&\u00c9 \u00d6\u00ba\u008b\u00c8\u0090U\u0010\u00dc\u00ca\u00e6<\u00dc\u008d^\u00fbC\u00ba\u007f\u0010:\u00dc\u00d8\u00eb\u0010\u00af\u00dc]\u0097B\u000e\u00a9\f\u00fd^\u00be\u0011\u0005\u00b4\u0006U8\u00f5tr\u00f7\u00f7\u00bb\u00f3\u00cb.\u008f\u00e9\u00f3\u00cb\u0099\n\u00eb\u00ba\u00e4\u00f5\u009ein\u0013\u00a4y\u009d\u008cr\u0085\u00d9\u0087\u00e9\u00c7\u0094\u0082\nf\u000e\u00bf=\u009c\u0019q8Gm\u00edJ\u0015)1M!\u00a3\u008bC\u0018\u00f4\u00a8+\u00a3\u00a3P\u00fd\u00e6e\u00bd\u008e8\u0089\u00ab\u00ee\n\u0084\u001d\u009dp\u00a8v\u00de\u00a9\u0010@G\u008f\u001c\u0003\u00f2W\u00b6\u00c2*yy]\u001b\u00ca\u009f 8\u00d3Ls\u00d8\u009en\u000f\u000e\u00a3\u0091b\\?1\u00fe\u00fetg\u0085\u00b0K\u0004\u009a\u0004\\&\u0081\u00d4\u0088\u0011\u00ac Z\u00f9v0\u00fd\u0003\u0094\u00fb\u008d\u0098\u00bb\u00cbc\u00c2\u000e\u008e\u00b35\u00a1\u0090P\u0005\u00e6\t\u00a0xc\u00f5\u00da\u008cO\u001a".length();
                                var25_8 = 24;
                                var24_9 = -1;
lbl34:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_9;
                                    v4 = var26_6.substring(v3, v3 + var25_8);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var29_4[var27_5++] = df_0.a(var30_10).intern();
                                    if ((var24_9 += var25_8) < var28_7) {
                                        var25_8 = var26_6.charAt(var24_9);
                                        ** continue;
                                    }
                                    var26_6 = "6\u0005\u00ae\u00cc\u00faYa\u008d\u0096\u000bjj\\\u00b5\u0019\u008cz\u00b0$\u0011#\u008a\u00a8\u00ff\u0016,\u00a0.\u00bf\u00d5E\u0091\u00e0\u00c7\u00f8\u0080`\u00fc=\u00b9\u0010\u0080\u0017\u0085\u0002#\u0014\u00ed\u001a\u0098m\u00d0SRs\u00cb\u00ca";
                                    var28_7 = "6\u0005\u00ae\u00cc\u00faYa\u008d\u0096\u000bjj\\\u00b5\u0019\u008cz\u00b0$\u0011#\u008a\u00a8\u00ff\u0016,\u00a0.\u00bf\u00d5E\u0091\u00e0\u00c7\u00f8\u0080`\u00fc=\u00b9\u0010\u0080\u0017\u0085\u0002#\u0014\u00ed\u001a\u0098m\u00d0SRs\u00cb\u00ca".length();
                                    var25_8 = 40;
                                    var24_9 = -1;
lbl48:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_9;
                                        v4 = var26_6.substring(v6, v6 + var25_8);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl53:
                                // 1 sources

                                while (true) {
                                    var29_4[var27_5++] = df_0.a(var30_10).intern();
                                    if ((var24_9 += var25_8) < var28_7) {
                                        var25_8 = var26_6.charAt(var24_9);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var30_10 = var22_2.doFinal(v4.getBytes("ISO-8859-1"));
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
                        df_0.p = var29_4;
                        df_0.q = new String[11];
                        df_0.x = new HashMap<K, V>(13);
                        var11_11 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_12 = 1; var12_12 < 8; ++var12_12) {
                            v9 = v9;
                            v9[var12_12] = (byte)(var31 << var12_12 * 8 >>> 56);
                        }
                        var11_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_13 = new long[11];
                        var14_14 = 0;
                        var15_15 = "J\u00f7\u00c4h\u00c7\u00c0\u00ceF\u00af\u0086N\u0014E#\u00ca\u00dc\u001aK\u00bd\u00aa);2N\u009a\u00c5.\u0014O\u00d5\u00fd \u00c9\u009f\u00ce\u00f4V\u001ei|\u00cbI\u00dbdU\u00cc\u001c\u00d4\bW\u00d95\u00eb\b\u00d0|y\u00d2dA\u00de\u00bf\u00fe\u00e4\n#\u0088G5\u00b8\u0094P";
                        var16_16 = "J\u00f7\u00c4h\u00c7\u00c0\u00ceF\u00af\u0086N\u0014E#\u00ca\u00dc\u001aK\u00bd\u00aa);2N\u009a\u00c5.\u0014O\u00d5\u00fd \u00c9\u009f\u00ce\u00f4V\u001ei|\u00cbI\u00dbdU\u00cc\u001c\u00d4\bW\u00d95\u00eb\b\u00d0|y\u00d2dA\u00de\u00bf\u00fe\u00e4\n#\u0088G5\u00b8\u0094P".length();
                        var13_17 = 0;
                        while (true) {
                            var18_18 = var15_15.substring(var13_17, var13_17 += 8).getBytes("ISO-8859-1");
                            v10 = var17_13;
                            v11 = var14_14++;
                            v12 = ((long)var18_18[0] & 255L) << 56 | ((long)var18_18[1] & 255L) << 48 | ((long)var18_18[2] & 255L) << 40 | ((long)var18_18[3] & 255L) << 32 | ((long)var18_18[4] & 255L) << 24 | ((long)var18_18[5] & 255L) << 16 | ((long)var18_18[6] & 255L) << 8 | (long)var18_18[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl104:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_17 < var16_16) ** continue;
                            var15_15 = "\u0084S\u00ceb\u00a7{W\\\u008d\u00bb\u00b3\u0003`\u00bb\u00d4X";
                            var16_16 = "\u0084S\u00ceb\u00a7{W\\\u008d\u00bb\u00b3\u0003`\u00bb\u00d4X".length();
                            var13_17 = 0;
                            while (true) {
                                var18_18 = var15_15.substring(var13_17, var13_17 += 8).getBytes("ISO-8859-1");
                                v10 = var17_13;
                                v11 = var14_14++;
                                v12 = ((long)var18_18[0] & 255L) << 56 | ((long)var18_18[1] & 255L) << 48 | ((long)var18_18[2] & 255L) << 40 | ((long)var18_18[3] & 255L) << 32 | ((long)var18_18[4] & 255L) << 24 | ((long)var18_18[5] & 255L) << 16 | ((long)var18_18[6] & 255L) << 8 | (long)var18_18[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl123:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_17 < var16_16) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_19 = v12;
                    var21_20 = var11_11.doFinal(new byte[]{(byte)(var19_19 >>> 56), (byte)(var19_19 >>> 48), (byte)(var19_19 >>> 40), (byte)(var19_19 >>> 32), (byte)(var19_19 >>> 24), (byte)(var19_19 >>> 16), (byte)(var19_19 >>> 8), (byte)var19_19});
                    v14 = ((long)var21_20[0] & 255L) << 56 | ((long)var21_20[1] & 255L) << 48 | ((long)var21_20[2] & 255L) << 40 | ((long)var21_20[3] & 255L) << 32 | ((long)var21_20[4] & 255L) << 24 | ((long)var21_20[5] & 255L) << 16 | ((long)var21_20[6] & 255L) << 8 | (long)var21_20[7] & 255L;
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
                df_0.v = var17_13;
                df_0.w = new Integer[11];
                df_0.A = new HashMap<K, V>(13);
                var0_21 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var31 >>> 56);
                for (var1_22 = 1; var1_22 < 8; ++var1_22) {
                    v17 = v17;
                    v17[var1_22] = (byte)(var31 << var1_22 * 8 >>> 56);
                }
                var0_21.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_23 = new long[2];
                var3_24 = 0;
                var4_25 = "\u0001\u00b0z\u00e3\u0011h0o<\u00b3\u00ba\u009e\t\u00fd\u00baP";
                var5_26 = "\u0001\u00b0z\u00e3\u0011h0o<\u00b3\u00ba\u009e\t\u00fd\u00baP".length();
                var2_27 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl167:
                // 1 sources

                while (true) {
                    var6_23[v18] = ((long)var10_30[0] & 255L) << 56 | ((long)var10_30[1] & 255L) << 48 | ((long)var10_30[2] & 255L) << 40 | ((long)var10_30[3] & 255L) << 32 | ((long)var10_30[4] & 255L) << 24 | ((long)var10_30[5] & 255L) << 16 | ((long)var10_30[6] & 255L) << 8 | (long)var10_30[7] & 255L;
                    if (var2_27 < var5_26) ** continue;
                    break block26;
                    break;
                }
            }
            var7_28 = var4_25.substring(var2_27, var2_27 += 8).getBytes("ISO-8859-1");
            v18 = var3_24++;
            var8_29 = ((long)var7_28[0] & 255L) << 56 | ((long)var7_28[1] & 255L) << 48 | ((long)var7_28[2] & 255L) << 40 | ((long)var7_28[3] & 255L) << 32 | ((long)var7_28[4] & 255L) << 24 | ((long)var7_28[5] & 255L) << 16 | ((long)var7_28[6] & 255L) << 8 | (long)var7_28[7] & 255L;
            var10_30 = var0_21.doFinal(new byte[]{(byte)(var8_29 >>> 56), (byte)(var8_29 >>> 48), (byte)(var8_29 >>> 40), (byte)(var8_29 >>> 32), (byte)(var8_29 >>> 24), (byte)(var8_29 >>> 16), (byte)(var8_29 >>> 8), (byte)var8_29});
            ** while (true)
        }
        df_0.y = var6_23;
        df_0.z = new Long[2];
        v19 = new Object[3];
        v19[2] = var33_1;
        v19[1] = 0;
        v19[0] = df_0.a("a", (int)18689, (long)(388743120256451768L ^ var31));
        df_0.g("f", (Object)cp_0.b, (Object)v19, (long)5084039625231178302L, (long)var31);
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
        if (G[n3] != null) {
            return n3;
        }
        Object object = F[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 6;
            case 2 -> 51;
            case 3 -> 20;
            case 4 -> 52;
            case 5 -> 60;
            case 6 -> 11;
            case 7 -> 49;
            case 8 -> 46;
            case 9 -> 27;
            case 10 -> 38;
            case 11 -> 61;
            case 12 -> 23;
            case 13 -> 39;
            case 14 -> 48;
            case 15 -> 53;
            case 16 -> 43;
            case 17 -> 13;
            case 18 -> 62;
            case 19 -> 59;
            case 20 -> 63;
            case 21 -> 7;
            case 22 -> 37;
            case 23 -> 54;
            case 24 -> 34;
            case 25 -> 50;
            case 26 -> 58;
            case 27 -> 56;
            case 28 -> 41;
            case 29 -> 45;
            case 30 -> 0;
            case 31 -> 42;
            case 32 -> 26;
            case 33 -> 15;
            case 34 -> 24;
            case 35 -> 8;
            case 36 -> 4;
            case 37 -> 9;
            case 38 -> 36;
            case 39 -> 22;
            case 40 -> 5;
            case 41 -> 10;
            case 42 -> 44;
            case 43 -> 14;
            case 44 -> 55;
            case 45 -> 17;
            case 46 -> 21;
            case 47 -> 19;
            case 48 -> 28;
            case 49 -> 2;
            case 50 -> 25;
            case 51 -> 1;
            case 52 -> 29;
            case 53 -> 30;
            case 54 -> 32;
            case 55 -> 3;
            case 56 -> 31;
            case 57 -> 12;
            case 58 -> 16;
            case 59 -> 18;
            case 60 -> 35;
            case 61 -> 57;
            case 62 -> 33;
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
        df_0.G[n3] = new String(cArray);
        return n3;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    @Override
    protected bT b(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x6F71286D06BCL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (dt_0)((Object)df_0.g("f", (Object)this.j, (Object)df_0.g("\u00ea", (int)n, (long)-2443904469002270737L, (long)l), arg_0 -> this.lambda$createBuffer$1(n, arg_0), (long)-2444713325503278462L, (long)l));
        return df_0.g("f", (Object)aq_02, (Object)objectArray2, (long)-2444142981623286865L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/df" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x467C;
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
                throw new RuntimeException("dev/zprestige/prestige/df", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            df_0.w[n2] = n3;
        }
        return w[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = df_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void c() {
        Object[] objectArray = F;
        F[0] = "m\u000e\u0011\rmm{\u000e\u0014W~zlE\u0017Qrn}\u0002\u0000F9zC";
        objectArray[1] = "?(ct;=4'r;F%' {r";
        objectArray[2] = Float.TYPE;
        df_0.G[2] = "java/lang/Float";
        objectArray[3] = ";\u000b\u0006\u0004X\u001e&\u001e^&\u0019\u0013>\u0018";
        objectArray[4] = Integer.TYPE;
        df_0.G[4] = "java/lang/Integer";
        objectArray[5] = "42\u0001=\u0014L1'\n=\u0017K>.\u0001\u007fV|\u0017qU";
        objectArray[6] = Void.TYPE;
        df_0.G[6] = "java/lang/Void";
        objectArray[7] = "\u0002zXq.(\u0007oSq-/\bfX3l\u0018!9\u000e";
        objectArray[8] = "u\u0007bp\rtc\u0007g*\u001ectLd,\u0012we\u000bs;Y`t";
        objectArray[9] = "!jz]37TJqR\"x5DzY&\"A";
        objectArray[10] = "j</\u0003*B|<*Y9Ukw)_5Az0>H~SF";
        objectArray[11] = "\u0004\u001b&\u000f 2q;-\u00001}\f#>\u000784d";
        objectArray[12] = "\u000f[+It\u001c\u0019[.\u0013g\u000b\u000e\u0010-\u0015k\u001f\u001fW:\u0002 \b\b";
        objectArray[13] = "VS(.\u0003K#s#!\u0012\u0004B}(*\u0016^6";
        objectArray[14] = "6L\"\u001f\u000b^ L'E\u0018I7\u0007$C\u0014]&@3T_H\u0006";
        objectArray[15] = "^\u0012+%\nSH\u0012.\u007f\u0019D_Y-y\u0015PN\u001e:n^GJ";
        objectArray[16] = "\\\u00116\u001f\u0018\\)1=\u0010\t\u0013H?6\u001b\rI<";
        objectArray[17] = Long.TYPE;
        df_0.G[17] = "java/lang/Long";
        objectArray[18] = " ?D,b%%*O,a\"*#Dn \u0015\u0003~\u0013";
        objectArray[19] = "Ok>c<\u0013:K5l-\\[E>g)\u0006/";
        objectArray[20] = "*\u001f4\u001be\u0011<\u001f1Av\u0006+T2Gz\u0012:\u0013%P1\u0005(";
        objectArray[21] = "e\u000f\u000bQ\u0005+n\u0000\u001a\u001ef&{\r\u0015uS$j\u001e\tYD)";
        objectArray[22] = "8L\u001dQPo&D\u0007\u001e3{\"";
        objectArray[23] = "7_^Vt0<PO\u0019\u0015>7[KC";
        objectArray[24] = "^d*|j\t@l03\"\tZf(t+\u0012\u001aC)s'\b]j2";
        objectArray[25] = "\u001f\f+2\u001da\u0014\u0003:}zc\u0001\b:6A";
        objectArray[26] = "3i\u001e-@4%i\u001bwS#2\"\u0018q_7#e\u000ff\u0014%&";
        objectArray[27] = "c)WjQ$\u0016\t\\e@kw\u0007WnD1\u0003";
        objectArray[28] = "\nO\u0006\u001cxf\u001cO\u0003Fkq\u000b\u0004\u0000@ge\u001aC\u0017W,t:";
        objectArray[29] = "SmNROLEmK\b\\[R&H\u000ePOCa_\u0019\u001b_\u000e";
        objectArray[30] = "\u001fK\u000bSi&jk\u0000\\xi\u000be\u000bW|3\u007f";
        objectArray[31] = "W:E6;LA:@l([VqCj$OG6T}oZd";
        objectArray[32] = "Md\u001cs\r!8D\u0017|\u001cnYJ\u001cw\u00184-";
        objectArray[33] = "^\u000fm\u000bOyH\u000fhQ\\n_DkWPzN\u0003|@\u001bnk";
        objectArray[34] = ")6ir`k\\\u0016b}q$=\u0018ivu~I";
        objectArray[35] = "Ysy\u00140W,Sr\u001b!\u0018M]y\u0010%B9";
        objectArray[36] = "\u001f=C\u001aXa\t=F@Kv\u001evEFGb\u000f1RQ\fv/";
        objectArray[37] = "]\u001e#4yS(>(;h\u001cI0#0lF=";
        objectArray[38] = "\fs\u0010,.H\u001as\u0015v=_\r8\u0016p1K\u001c\u007f\u0001gz_'";
        objectArray[39] = "0\u0015+\u0014\u0019\u0012E5 \u001b\b]$;+\u0010\f\u0007P";
        objectArray[40] = "\fN+\u001aZ!\u001aN.@I6\r\u0005-FE\"\u001cB:Q\u000e6=";
        objectArray[41] = "uYz\bL\u0010\u0000yq\u0007]_awz\fY\u0005\u0015";
        objectArray[42] = "ViVaWj@iS;D}W\"P=HiFeG*\u0003}a";
        objectArray[43] = "\u001bB?\u0017\u0002pnb4\u0018\u0013?\u000fl?\u0013\u0017e{";
        objectArray[44] = "v\u0016&V975F \u001bWd!\u000bQ\u0013:f*w$\u001b0fpM{\u0018owL";
        objectArray[45] = "G\bI\f!\u001a\u0010\b\u001b\u001aC\u001ez\u0004\u001e\b?H\b\u0014\u001a\u0014<sF\u0000H\u0010s\u0011A\u0015K\u0018C";
        objectArray[46] = "\u00171\u0007:\u0019TK3Hih@(:I'\u000fT\u00173\u0002kR*";
        objectArray[47] = "c!ug\u001f\u0019h-~y~\u001bj-7k\u0002\u001dL&\u0006|\u0005\u001dk4OyN\u00142\"p/AMjH/'\u0006J5(wu\u0004\u000f\r'\u007frA\u001a2qp+\u0019p";
        objectArray[48] = "|x\nnP:?(\f#>i+eh<R\u0006|kU<\u0002<#h\n->";
        objectArray[49] = "t\u0003\u000f+zz+\u0014\u001cD\"\u0013sM\u001c?*ut\u000e[*K*7\u000b\u000f$.j;O\u0007Drn0\u001a\u0004!2bt\u0012dz9x%@\r%.kJ";
        objectArray[50] = "T]G]\u00148\u000bJT2LQS\u0013TID7TP\u0013\\%h\u0017UGR@(\u001b\u0011O2\u001c,\u0010DLW\\ TL,\u000bX+\u0001OIKTo\t/\u0015O_:\nJUC\u001b2j\u0011^YJ`\u0003NIJ%";
        objectArray[51] = "RNk9n:C[ 2\u001e/[PldY?2\u000ecnsm\bQ`1bQRNk9n:C[ 2\u001e";
        objectArray[52] = "N]\u0017'Q\u007fR\u001eG -u*YE!Q'XIA=R\u001cN]\u0017'Q\u007fR\u001eG -";
        objectArray[53] = "\r-W\\wQR:D3/8\t-[^z\u0002V.\u0004OF\u0006A4S\u0002/YV'<";
        objectArray[54] = "\tpAGaG\nv\u0010\u0017Q\u001dd#\u0012\u0005i\u001e^6\u0017\b+w\ntV@8M\u001fq[\u0002Q";
        objectArray[55] = "&\tYOOww\r_Q2tG\u0012UAN&5\u0002Q]M\u001d%\u0014]A\u0002\":\u000e\u0001E2";
        objectArray[56] = "\u0002_IYfeW^\u0011\n\rkk\u001d@\tq9\u0019\rD\u0015r\u0002W\u0019\u0016\u0011=`P\f\u0015\u0019\r";
        objectArray[57] = "\u001eOhkKS\u0002\f8l7YzK:mK\u000b\b[>qH0\u0003L)1W\u0000JT?j7";
        objectArray[58] = "'hR\rUL;+\u0002\n)FCl\u0000\u000bU\u00141|\u0004\u0017V/8{\u0015\u0006BC?(W\u001b)";
        objectArray[59] = "=}\r\"@F15Tt/Xd\u0019\u0005<w^z,\r!SZz$hv]PmyR)^\u000f|ER>HZ<\u007f\r=\u0017K\u0000\u007f\u001a+B\u000b: \u0019tS7<<U4\u001fU;)V</";
        objectArray[60] = "P\u0011uJ2qLR%MN{4\u0015'L2)F\u0005#P1\u0012HU>L1m\b\u00070HN";
        objectArray[61] = "4\u007fTV\u001cpw/R\u001br#cb%\r\n,g\u001eV\u001b\u0015!2$\t\u0018J0\u000e";
        objectArray[62] = "_'\u0000\u000f!%\u00000\u0013`yLXi\u0013\u001bq*_*T\u000e\u0010u\u001c/\u0000\u0000u5\u0010k\b`.>\n:Z\tq)\u0019U";
        objectArray[63] = "\b<<7@O\\*k8)@W\u0004l:HQ^\u0011j6URI \u0007|[H^q=#X\u0017OM;?\u0014W\u0003/<*\u0017_3";
        objectArray[64] = "U3\u0018DjnX<\u001bB\u00106e+OHld\u0017;KTo_\fiF\u0018{8Yh\u001eK\u0010";
        objectArray[65] = ")~B<\\\u00015=\u0012; \bMz\u0010:\\Y?j\u0014&_b(u\u0002cB\u0013#6@0 ";
        objectArray[66] = "fW\u001b\u0000Yd?RC\u0010iu\u0005K\u0017\u0001\u0015$w[\u0013\u001d\u0016\u001ffW\u001b\u0000Yd?RC\u0010i";
        objectArray[67] = "tRANQH~O@G=\u001c\u001dWVJANoGRVBuwUA\u001bG\beTAM=";
        objectArray[68] = ":2ym\u001f{yb\u007f q\u0018@\u0012\u001d\u001fq}ak~<M>1m3";
        objectArray[69] = "q@AP9\bk@\n\u0016R^~n\u001dH?Ks]\u001dk3I\u007fH\b.hC}LL\u00147@\"]p\u0012+\fb\u0011\u0012\u0015>\u000fj!";
        objectArray[70] = "\\1\u0016\tQ\u0015\t0NZ:\u001b5s\u001fYFIGc\u001bEEr\u000f|\u0013T\u0006HP\u007fLE:";
        objectArray[71] = "b\u001c\u001b\u000ePu!L\u001dC>&5\u0001iUC$XGQVSub\u0018R\tBI";
        objectArray[72] = "Ot{/hB\u0010ch@0+H:h;8MOy/.Y\u0011\u0003a}|cN\u0000>l@gY\u001ai!)8N\t\u0006";
        objectArray[73] = "c\u0004O\u001fN\u0012oL\u0016I!\f:vK\u0017M?3LV\f[\u000e^\u0006X\u0016L_dY[I]cdNM\u001c\u001dY;M\u0012\r!_'\u0001RACX2\u0002Zq";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "0bb(6\u0007,!2/J\rTf0.6_&v425d,r+>7\u0019hx  J";
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == 'F' || c == 'K' || c == 'e') {
                field = df_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = df_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = df_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void c(Object[] objectArray) {
        gJ gJ2 = (gJ)objectArray[0];
        long l = (Long)objectArray[1];
        df_0.g("f", (Object)df_0.g("f", (Object)df_0.g("f", (Object)df_0.g("f", (Object)df_0.g("f", (Object)df_0.g("f", (Object)df_0.g("f", (Object)gJ2, (Object)df_0.a("a", (int)27729, (long)(0x2D6855179290D09AL ^ l)), (float)((float)df_0.g("f", (Object)this.a, (long)8645905207176299980L, (long)l) / 255.0f), (float)((float)df_0.g("f", (Object)this.a, (long)8645627960924437960L, (long)l) / 255.0f), (float)((float)df_0.g("f", (Object)this.a, (long)8638380053256357120L, (long)l) / 255.0f), (float)((float)df_0.g("f", (Object)this.a, (long)8646670614544166286L, (long)l) / 255.0f), (long)8646001757880898817L, (long)l), (Object)df_0.a("a", (int)32015, (long)(0x7458BE6AFA19C1C1L ^ l)), (int)5, (long)8638588129414858785L, (long)l), (Object)df_0.a("a", (int)29433, (long)(0xEEC1E13123E4E3BL ^ l)), (float)15.0f, (long)8646867921687815997L, (long)l), (Object)df_0.a("a", (int)14059, (long)(0x2F10BA9DABC68A21L ^ l)), (float)0.0f, (long)8646867921687815997L, (long)l), (Object)df_0.a("a", (int)13488, (long)(0x24E6A925A9AB0878L ^ l)), (float)2.0f, (long)8646867921687815997L, (long)l), (Object)df_0.a("a", (int)8928, (long)(0x4F7004E307749E20L ^ l)), (float)0.7f, (long)8646867921687815997L, (long)l), (Object)df_0.a("a", (int)31199, (long)(0x13C20862D4F64512L ^ l)), (float)0.8f, (long)8646867921687815997L, (long)l);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = df_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = df_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = df_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = df_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = df_0.i(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = G[n];
                int n3 = string2.indexOf(8);
                clazz3 = df_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = df_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = df_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        df_0.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = df_0.j(1649189747817852L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = df_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        df_0.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = df_0.j(1649189747817852L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/df" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = df_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1268;
        if (z[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = y[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])A.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/df", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            df_0.z[n2] = l4;
        }
        return z[n2];
    }

    @Override
    public c9 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x59EB766A2C2FL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = dp_0::a;
        objectArray2[1] = this::lambda$getPipeline$2;
        objectArray2[0] = df_0.g("f", (Object)this, (Object)new Object[0], (long)-2002573658679753638L, (long)l);
        return df_0.g("f", (Object)new c9(), (Object)objectArray2, (long)-2002425111759051106L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/df" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = df_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B38;
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
                throw new RuntimeException("dev/zprestige/prestige/df", exception);
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
            df_0.q[n2] = df_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
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
        int n = df_0.i(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = G[n];
            int n2 = string.indexOf(8);
            Class clazz = df_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = df_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = df_0.e(clazz3, string2, clazz2)) != null) {
                    df_0.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = df_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        df_0.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = df_0.j(1649189747817852L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/df" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = df_0.i(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                df_0.F[n] = clazz = Class.forName(G[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void lambda$getPipeline$2(dy_0 dy_02) {
        float f;
        float f10;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        block8: {
            long l2;
            block9: {
                l = m ^ 0x236BA583BE1EL;
                l2 = l ^ 0x407DCDC2EA24L;
                df_0.g("\u00ea", (int)df_0.c("y", (int)32571, (long)(0x7F6A4AA15CA969C5L ^ l)), (long)-3420024562574806578L, (long)l);
                CallSite callSite4 = df_0.g("\u00ea", (long)-3418827464632636879L, (long)l);
                df_0.g("\u00ea", (int)df_0.c("y", (int)9965, (long)(0x2180F339C17B3017L ^ l)), (int)this.h.a, (long)-3417084748830858449L, (long)l);
                CallSite callSite5 = callSite4;
                try {
                    try {
                        reference cfr_temp_0 = (df_0.g("\u00ea", (Object)new Object[0], (long)-3416390768782591588L, (long)l) & df_0.d("j", (int)17110, (long)(0x153CDBF999180039L ^ l))) - df_0.d("j", (int)15745, (long)(0x3F866790360FFF6FL ^ l));
                        callSite3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (callSite5 != null) break block8;
                        if (callSite3 != false) break block9;
                    }
                    catch (MatchException matchException) {
                        throw df_0.g("\u00ea", (Object)matchException, (long)-3419418880081592827L, (long)l);
                    }
                    df_0.g("\u00ea", (int)df_0.c("y", (int)9965, (long)(0x2180F339C17B3017L ^ l)), (long)-3416238359381697934L, (long)l);
                }
                catch (MatchException matchException) {
                    throw df_0.g("\u00ea", (Object)matchException, (long)-3419418880081592827L, (long)l);
                }
            }
            df_0.g("\u00ea", (int)df_0.c("y", (int)9965, (long)(0x2180F339C17B3017L ^ l)), (int)df_0.c("y", (int)20301, (long)(0x58FB6E090248D9B6L ^ l)), (int)df_0.c("y", (int)28470, (long)(0x55045F04C733F9CAL ^ l)), (long)-3420296455909526044L, (long)l);
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            df_0.g("f", (Object)this, (Object)objectArray, (long)-3419062324988987004L, (long)l);
            callSite3 = df_0.g("f", (Object)df_0.g("f", (Object)this, (Object)new Object[0], (long)-3416442620055392007L, (long)l), (Object)new Object[0], (long)-3416000860739243763L, (long)l);
        }
        try {
            CallSite callSite = df_0.g("\u00ea", (int)callSite3, (long)-3419607159968105157L, (long)l);
            callSite = df_0.a("a", (int)3349, (long)(0x7CEA0821C54C16ACL ^ l));
            f10 = this.d > 0 ? 1.0f / (float)this.d : 0.0f;
        }
        catch (MatchException matchException) {
            throw df_0.g("\u00ea", (Object)matchException, (long)-3419418880081592827L, (long)l);
        }
        try {
            f = this.e > 0 ? 1.0f / (float)this.e : 0.0f;
        }
        catch (MatchException matchException) {
            throw df_0.g("\u00ea", (Object)matchException, (long)-3419418880081592827L, (long)l);
        }
        df_0.g("f", (Object)callSite2, (Object)callSite, (float)f10, (float)f, (long)-3419884450365378275L, (long)l);
    }

    private dt_0 lambda$createBuffer$1(int n, Integer n2) {
        long l = m ^ 0x7A1698E31E6CL;
        long l2 = l ^ 0x7FD8BBB814BDL;
        fW[] fWArray = new fW[df_0.c("y", (int)3390, (long)(0x7AE2AA745F453BB1L ^ l))];
        fWArray[0] = df_0.g("\u00ea", (Object)new Object[]{this.g.a}, (long)8140970216820288587L, (long)l);
        fWArray[1] = df_0.g("\u00ea", (Object)new Object[]{cp_0.b}, (long)8141132867243608895L, (long)l);
        Object[] objectArray = new Object[3];
        objectArray[2] = true;
        objectArray[1] = false;
        objectArray[0] = (int)df_0.c("y", (int)13816, (long)(0xE841BCC770D8373L ^ l));
        fWArray[2] = df_0.g("\u00ea", (Object)objectArray, (long)8134702475605355011L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = true;
        objectArray2[0] = true;
        fWArray[3] = df_0.g("\u00ea", (Object)objectArray2, (long)8135354108119258369L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (int)df_0.c("y", (int)13896, (long)(0x55C78656B9E180C8L ^ l));
        objectArray3[0] = (int)df_0.c("y", (int)9031, (long)(0x4F877ACE81FB15C6L ^ l));
        fWArray[4] = df_0.g("\u00ea", (Object)objectArray3, (long)8140937177867127814L, (long)l);
        fWArray[5] = df_0.g("\u00ea", (Object)new Object[]{arg_0 -> df_0.lambda$createBuffer$0(n, arg_0)}, (long)8140595051925952207L, (long)l);
        return new dt_0(gf_0.c, 4, true, fWArray, l2);
    }

    private static void lambda$createBuffer$0(int n, dy_0 dy_02) {
        long l = m ^ 0x5CFF55CE5695L;
        df_0.g("\u00ea", (int)df_0.c("y", (int)14887, (long)(0x64995FB41A3C4454L ^ l)), (long)4036032665094445381L, (long)l);
        df_0.g("\u00ea", (int)df_0.c("y", (int)19069, (long)(0x59752CD053FC3406L ^ l)), (int)n, (long)4044069816892771236L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(df_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(df_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(df_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(df_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


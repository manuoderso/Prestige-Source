/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.cL;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.x_0;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.cb
 */
public class cb_0
extends b4 {
    public static cb_0 a;
    private static final long c;
    private static final int d;
    private static final float m = 10.0f;
    private static final float i = 90.0f;
    private static final float j = 12.0f;
    private final ArrayList k;
    private final Map l;
    private long n;
    private float o;
    private float p;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long[] B;
    private static final Integer[] C;
    private static final Map D;
    private static final long[] H;
    private static final Long[] I;
    private static final Map J;
    private static final Object[] K;
    private static final String[] L;

    public cb_0(long l) {
        long l2 = (l = v ^ l) ^ 0x62366E158C77L;
        super((String)((Object)cb_0.a("c", (int)29500, (long)(0x3F4FECC2FA778BB7L ^ l))), (String)((Object)cb_0.a("c", (int)14666, (long)(0x17D32EBB0BDEC1C0L ^ l))), l2);
        this.k = new ArrayList();
        this.l = new HashMap();
        this.n = (long)cb_0.d("h", (int)21614, (long)(0x249BD79FA041D5B6L ^ l));
        this.o = 0.0f;
        this.p = 0.0f;
        a = this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                cb_0.v = hc.a(-7594836246431742180L, 1641821613892112280L, MethodHandles.lookup().lookupClass()).a(93020590192913L);
                                var31 = cb_0.v ^ 89121501847683L;
                                var33_1 = var31 ^ 35296564275174L;
                                cb_0.K = new Object[113];
                                cb_0.L = new String[113];
                                cb_0.b();
                                cb_0.y = new HashMap<K, V>(13);
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
                                var29_4 = new String[8];
                                var27_5 = 0;
                                var26_6 = "\u00bb[\u00df\u00d7:\u00ad\u00f6#\u0007;\u00af!\u00abT\u00dc\u009e\u00a3\u0006\u00c3W6\u00de\u0017w(\u00f2w\u00ac\u00f5R\u00bd\u00db\u00181\u00c2}\u00c7\u00f0F[(\u0015\u00bb\u00ac\u00edu\u00c6\u00e36o\u0007<\u001b\u00dd\u0081\u0007\u00b0R\u0000Ga\u00f9\u00b6\u001b\u009d\b\u0080\u00ff\u0089<\u00d3^\u0086\u00f4\u0010\u0007s&\u0013\u00be[(>\u00a7.\u007f2\u00e1\u0083'\u00e8)\u00ac\u00c2\u00ca\u008e4\u00c74\u00f2\u00a7u\u0094dpZ\u0098\u0010\u00c1\u00eb=$\u0096.\u00b7\u00a9nR\u00d4\u00ee.\u0004\u0010\u00e7\u0010\u00adkr\f\u000b\u0019H=\u00a0p\u00bc\u00f3\u00f9\u00b1P\u00f8z\u0088\u0016\u001eYU\u00134=(j\u00ff\u0090\u00b0\u00df/\u00cb\u000f\u00d63\u00935\u00a7m\u00c3\u00fc\u00fd\u00ce:\u00dd\fQ\u0011\u0091\u00f6T\u00a7\u009d\u008c\u00fc\u00de\u0096;\u0097\u00ff\u0098\u00d5Cr\t\u0081\n\u0090G\u00b2\u008e\u00bb\u0012\u00cf\u00bf/\u00cb}b|{U8\u0080\u00af\u00f8\u00fdcA\u00b4p\u0011\u00c9:(\u0095\b\u00de\u00ec7\u00df\u0093U1\u0018\u00d4<\u00a5\u00f7pP\u00ddQ\u001d^\u00a1\u00dbp\u00ce\u00f2\u00da\u00b0C\u00a6\u0095\u0012\u0090fw\u0018\u0018\u001e\u00a1\u0018\u0092";
                                var28_7 = "\u00bb[\u00df\u00d7:\u00ad\u00f6#\u0007;\u00af!\u00abT\u00dc\u009e\u00a3\u0006\u00c3W6\u00de\u0017w(\u00f2w\u00ac\u00f5R\u00bd\u00db\u00181\u00c2}\u00c7\u00f0F[(\u0015\u00bb\u00ac\u00edu\u00c6\u00e36o\u0007<\u001b\u00dd\u0081\u0007\u00b0R\u0000Ga\u00f9\u00b6\u001b\u009d\b\u0080\u00ff\u0089<\u00d3^\u0086\u00f4\u0010\u0007s&\u0013\u00be[(>\u00a7.\u007f2\u00e1\u0083'\u00e8)\u00ac\u00c2\u00ca\u008e4\u00c74\u00f2\u00a7u\u0094dpZ\u0098\u0010\u00c1\u00eb=$\u0096.\u00b7\u00a9nR\u00d4\u00ee.\u0004\u0010\u00e7\u0010\u00adkr\f\u000b\u0019H=\u00a0p\u00bc\u00f3\u00f9\u00b1P\u00f8z\u0088\u0016\u001eYU\u00134=(j\u00ff\u0090\u00b0\u00df/\u00cb\u000f\u00d63\u00935\u00a7m\u00c3\u00fc\u00fd\u00ce:\u00dd\fQ\u0011\u0091\u00f6T\u00a7\u009d\u008c\u00fc\u00de\u0096;\u0097\u00ff\u0098\u00d5Cr\t\u0081\n\u0090G\u00b2\u008e\u00bb\u0012\u00cf\u00bf/\u00cb}b|{U8\u0080\u00af\u00f8\u00fdcA\u00b4p\u0011\u00c9:(\u0095\b\u00de\u00ec7\u00df\u0093U1\u0018\u00d4<\u00a5\u00f7pP\u00ddQ\u001d^\u00a1\u00dbp\u00ce\u00f2\u00da\u00b0C\u00a6\u0095\u0012\u0090fw\u0018\u0018\u001e\u00a1\u0018\u0092".length();
                                var25_8 = 40;
                                var24_9 = -1;
lbl34:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_9;
                                    v4 = var26_6.substring(v3, v3 + var25_8);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var29_4[var27_5++] = cb_0.b(var30_10).intern();
                                    if ((var24_9 += var25_8) < var28_7) {
                                        var25_8 = var26_6.charAt(var24_9);
                                        ** continue;
                                    }
                                    var26_6 = "\u00f4/2<\u00d5\rj\u00a0'M\u00e0P\u0082>\u0003\u0085\u00c6u\u001cAo\u001f\u00ce\u00ab\u0094\u0012\u008b%\u0012z\u00d7o\u001d\u00845-\"\u00fc\u0086qmiy\u00dd\u0092\u00986\u00a4\u00a0/k\u0012\u00b2\u00f70\u00dd\u00db2\u00d4\u00f5\u00b5\u00b5>D0\u0013)\u00edoq\u00c7\u009d\u00a4\u00a0QY\r~7\u00c8\u00ff\u00f0\"\u00ce\u00camc\u00ecu,7v\u00ab\u00c342\u00d6\u00c6k_\u0094s\u00ef\u009f\u0087\u00f5\u00db\u00e1\u00b2\u0012\u00b8\u00e3\u0095";
                                    var28_7 = "\u00f4/2<\u00d5\rj\u00a0'M\u00e0P\u0082>\u0003\u0085\u00c6u\u001cAo\u001f\u00ce\u00ab\u0094\u0012\u008b%\u0012z\u00d7o\u001d\u00845-\"\u00fc\u0086qmiy\u00dd\u0092\u00986\u00a4\u00a0/k\u0012\u00b2\u00f70\u00dd\u00db2\u00d4\u00f5\u00b5\u00b5>D0\u0013)\u00edoq\u00c7\u009d\u00a4\u00a0QY\r~7\u00c8\u00ff\u00f0\"\u00ce\u00camc\u00ecu,7v\u00ab\u00c342\u00d6\u00c6k_\u0094s\u00ef\u009f\u0087\u00f5\u00db\u00e1\u00b2\u0012\u00b8\u00e3\u0095".length();
                                    var25_8 = 64;
                                    var24_9 = -1;
lbl48:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_9;
                                        v4 = var26_6.substring(v6, v6 + var25_8);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl53:
                                // 1 sources

                                while (true) {
                                    var29_4[var27_5++] = cb_0.b(var30_10).intern();
                                    if ((var24_9 += var25_8) < var28_7) {
                                        var25_8 = var26_6.charAt(var24_9);
                                        ** continue;
                                    }
                                    break block27;
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
                        cb_0.w = var29_4;
                        cb_0.x = new String[8];
                        cb_0.D = new HashMap<K, V>(13);
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
                        var17_13 = new long[15];
                        var14_14 = 0;
                        var15_15 = "\u008b\u00ea\u00d3\u0010F\u00bf\u00c3\u00e8cS\u00ad\u00ca\u0098~,<\u00fe\u0081\u00cbC\u0011\u0006\u00ac\u00a2\u00e4\u0007S-\u0000\u00a7`\b\u001e1\u00c1=\u00f2\u0017\u00b5]\u0087\u00de[\u00b6\u0089g\u0097\u0086\u00a0 \u00b9w\u0017\u00bc\u00148\u00b4\u00fd\u0089\u0011\u0094\u00bc\u00c5\u00bf\u00e6\u00f9\u00fbT\u00cfl\u00bc\bKbR\u00e3R\u00d9!\u00c8X\u0084\u00b0\u00cd\u009a~6R\\\u0096?\u00c3\u00b1m\b\u00e9'?l\u00c5\u00c0\u00d8\u00c3\u0012";
                        var16_16 = "\u008b\u00ea\u00d3\u0010F\u00bf\u00c3\u00e8cS\u00ad\u00ca\u0098~,<\u00fe\u0081\u00cbC\u0011\u0006\u00ac\u00a2\u00e4\u0007S-\u0000\u00a7`\b\u001e1\u00c1=\u00f2\u0017\u00b5]\u0087\u00de[\u00b6\u0089g\u0097\u0086\u00a0 \u00b9w\u0017\u00bc\u00148\u00b4\u00fd\u0089\u0011\u0094\u00bc\u00c5\u00bf\u00e6\u00f9\u00fbT\u00cfl\u00bc\bKbR\u00e3R\u00d9!\u00c8X\u0084\u00b0\u00cd\u009a~6R\\\u0096?\u00c3\u00b1m\b\u00e9'?l\u00c5\u00c0\u00d8\u00c3\u0012".length();
                        var13_17 = 0;
                        while (true) {
                            var18_18 = var15_15.substring(var13_17, var13_17 += 8).getBytes("ISO-8859-1");
                            v10 = var17_13;
                            v11 = var14_14++;
                            v12 = ((long)var18_18[0] & 255L) << 56 | ((long)var18_18[1] & 255L) << 48 | ((long)var18_18[2] & 255L) << 40 | ((long)var18_18[3] & 255L) << 32 | ((long)var18_18[4] & 255L) << 24 | ((long)var18_18[5] & 255L) << 16 | ((long)var18_18[6] & 255L) << 8 | (long)var18_18[7] & 255L;
                            v13 = -1;
                            break block28;
                            break;
                        }
lbl104:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_17 < var16_16) ** continue;
                            var15_15 = "\n\u00ceN,#\u00d9\u0086\u00a4\u0019';F\u00cb\u00a8\u0001\u0087";
                            var16_16 = "\n\u00ceN,#\u00d9\u0086\u00a4\u0019';F\u00cb\u00a8\u0001\u0087".length();
                            var13_17 = 0;
                            while (true) {
                                var18_18 = var15_15.substring(var13_17, var13_17 += 8).getBytes("ISO-8859-1");
                                v10 = var17_13;
                                v11 = var14_14++;
                                v12 = ((long)var18_18[0] & 255L) << 56 | ((long)var18_18[1] & 255L) << 48 | ((long)var18_18[2] & 255L) << 40 | ((long)var18_18[3] & 255L) << 32 | ((long)var18_18[4] & 255L) << 24 | ((long)var18_18[5] & 255L) << 16 | ((long)var18_18[6] & 255L) << 8 | (long)var18_18[7] & 255L;
                                v13 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl123:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_17 < var16_16) ** continue;
                            break block29;
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
                cb_0.B = var17_13;
                cb_0.C = new Integer[15];
                cb_0.d = (int)cb_0.c("p", (int)6643, (long)(var31 ^ 860259605848967572L));
                cb_0.J = new HashMap<K, V>(13);
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
                var6_23 = new long[4];
                var3_24 = 0;
                var4_25 = "g\u0098\u00fd\u00d1\\\u0019\u00e6]\u00aa\u00a18Q\u0002yK\u00a6";
                var5_26 = "g\u0098\u00fd\u00d1\\\u0019\u00e6]\u00aa\u00a18Q\u0002yK\u00a6".length();
                var2_27 = 0;
                while (true) {
                    var7_28 = var4_25.substring(var2_27, var2_27 += 8).getBytes("ISO-8859-1");
                    v18 = var6_23;
                    v19 = var3_24++;
                    v20 = ((long)var7_28[0] & 255L) << 56 | ((long)var7_28[1] & 255L) << 48 | ((long)var7_28[2] & 255L) << 40 | ((long)var7_28[3] & 255L) << 32 | ((long)var7_28[4] & 255L) << 24 | ((long)var7_28[5] & 255L) << 16 | ((long)var7_28[6] & 255L) << 8 | (long)var7_28[7] & 255L;
                    v21 = -1;
                    break block30;
                    break;
                }
lbl176:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_27 < var5_26) ** continue;
                    var4_25 = "\u00f6\u0011\u0087xk\u00ea i\u00ac\u00d9\u00b3\u00aa\u00bc3?(";
                    var5_26 = "\u00f6\u0011\u0087xk\u00ea i\u00ac\u00d9\u00b3\u00aa\u00bc3?(".length();
                    var2_27 = 0;
                    while (true) {
                        var7_28 = var4_25.substring(var2_27, var2_27 += 8).getBytes("ISO-8859-1");
                        v18 = var6_23;
                        v19 = var3_24++;
                        v20 = ((long)var7_28[0] & 255L) << 56 | ((long)var7_28[1] & 255L) << 48 | ((long)var7_28[2] & 255L) << 40 | ((long)var7_28[3] & 255L) << 32 | ((long)var7_28[4] & 255L) << 24 | ((long)var7_28[5] & 255L) << 16 | ((long)var7_28[6] & 255L) << 8 | (long)var7_28[7] & 255L;
                        v21 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl195:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_27 < var5_26) ** continue;
                    break block31;
                    break;
                }
            }
            var8_29 = v20;
            var10_30 = var0_21.doFinal(new byte[]{(byte)(var8_29 >>> 56), (byte)(var8_29 >>> 48), (byte)(var8_29 >>> 40), (byte)(var8_29 >>> 32), (byte)(var8_29 >>> 24), (byte)(var8_29 >>> 16), (byte)(var8_29 >>> 8), (byte)var8_29});
            v22 = ((long)var10_30[0] & 255L) << 56 | ((long)var10_30[1] & 255L) << 48 | ((long)var10_30[2] & 255L) << 40 | ((long)var10_30[3] & 255L) << 32 | ((long)var10_30[4] & 255L) << 24 | ((long)var10_30[5] & 255L) << 16 | ((long)var10_30[6] & 255L) << 8 | (long)var10_30[7] & 255L;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl208:
                // 1 sources

                ** continue;
            }
        }
        cb_0.H = var6_23;
        cb_0.I = new Long[4];
        cb_0.c = (long)cb_0.d("h", (int)4199, (long)(var31 ^ 225535808012151594L));
        cb_0.a = new cb_0(var33_1);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (L[n3] != null) {
            return n3;
        }
        Object object = K[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 24;
            case 1 -> 2;
            case 2 -> 46;
            case 3 -> 53;
            case 4 -> 60;
            case 5 -> 4;
            case 6 -> 31;
            case 7 -> 38;
            case 8 -> 56;
            case 9 -> 7;
            case 10 -> 22;
            case 11 -> 27;
            case 12 -> 11;
            case 13 -> 25;
            case 14 -> 26;
            case 15 -> 32;
            case 16 -> 58;
            case 17 -> 16;
            case 18 -> 44;
            case 19 -> 43;
            case 20 -> 39;
            case 21 -> 61;
            case 22 -> 50;
            case 23 -> 9;
            case 24 -> 6;
            case 25 -> 19;
            case 26 -> 49;
            case 27 -> 62;
            case 28 -> 54;
            case 29 -> 34;
            case 30 -> 28;
            case 31 -> 40;
            case 32 -> 36;
            case 33 -> 13;
            case 34 -> 48;
            case 35 -> 52;
            case 36 -> 17;
            case 37 -> 37;
            case 38 -> 1;
            case 39 -> 10;
            case 40 -> 18;
            case 41 -> 51;
            case 42 -> 29;
            case 43 -> 21;
            case 44 -> 0;
            case 45 -> 47;
            case 46 -> 57;
            case 47 -> 41;
            case 48 -> 15;
            case 49 -> 55;
            case 50 -> 14;
            case 51 -> 45;
            case 52 -> 23;
            case 53 -> 3;
            case 54 -> 5;
            case 55 -> 33;
            case 56 -> 12;
            case 57 -> 8;
            case 58 -> 35;
            case 59 -> 20;
            case 60 -> 30;
            case 61 -> 59;
            case 62 -> 42;
            default -> 63;
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
        cb_0.L[n3] = new String(cArray);
        return n3;
    }

    private static Color b(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = v ^ l) ^ 0x29252ABDB0D7L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return new Color((int)cb_0.g("o", (Object)color, (long)2753336427168954591L, (long)l), (int)cb_0.g("o", (Object)color, (long)2751123855753136979L, (long)l), (int)cb_0.g("o", (Object)color, (long)2754277366065457274L, (long)l), (int)cb_0.g("\u00e0", (Object)objectArray2, (long)2752466471573432343L, (long)l));
    }

    private static void b() {
        Object[] objectArray = K;
        K[0] = "\u001b;f\u001a\rT\r;c@\u001eC\u001ap`F\u0012W\u000b7wQYE7";
        objectArray[1] = "/v\u0004YetZV\u000fVt;'N\u001cQ}rO";
        objectArray[2] = "n#\r\u000e\u0012cx#\bT\u0001toh\u000bR\r`~/\u001cEFph";
        objectArray[3] = "dDPO\u001d8oKA\u0000~5zFNkK7kURG\\:";
        objectArray[4] = ":*]V\t41%L\u0019j9$#";
        objectArray[5] = Integer.TYPE;
        cb_0.L[5] = "java/lang/Integer";
        objectArray[6] = "~!uEhUh!p\u001f{B\u007fjs\u0019wVn-d\u000e<D_";
        objectArray[7] = "I*^%t\u0015<\nU*eZ]\u0004^!a\u0000)";
        objectArray[8] = Float.TYPE;
        cb_0.L[8] = "java/lang/Float";
        objectArray[9] = "|*\u00061\u0005.a?^\u0013D#y9";
        objectArray[10] = "\u0012?h\u0007U{g\u001fc\bD4\u0006\u0011h\u0003@nr";
        objectArray[11] = "^mY[*'+MRT;hJCY_?2>";
        objectArray[12] = "EaK!TlEa\\}Xc_*\\cXvX[\f>\t";
        objectArray[13] = "~;f*Vx~;qvZwdpqhZbc\u0001#4\u000f ";
        objectArray[14] = "tDF0yobDCjjxu\u000f@lfldHW{-{Q";
        objectArray[15] = "xz4\r~x\rZ?\u0002o7lT4\tkm\u0018";
        objectArray[16] = Void.TYPE;
        cb_0.L[16] = "java/lang/Void";
        objectArray[17] = "%qnE!o;yt\nFn*byP`h";
        objectArray[18] = "bZ\nw\u001fytZ\u000f-\fnc\u0011\f+\u0000zrV\u001b<Kk2";
        objectArray[19] = "Ip\u0011|\u0006l<P\u001as\u0017#]^\u0011x\u0013y)";
        objectArray[20] = "}X\u0016`u<kX\u0013:f+|\u0013\u0010<j?mT\u0007+!+!";
        objectArray[21] = "d:4O\\t\u0011\u001a?@M;p\u00144KIa\u0004";
        objectArray[22] = "XJ'A84-j,N){Ld'E-!8";
        objectArray[23] = ";\u0010\u0002m#L;\u0010\u00151/C![\u0015//V&*Bpy";
        objectArray[24] = Boolean.TYPE;
        cb_0.L[24] = "java/lang/Boolean";
        objectArray[25] = "\\#g\u0019$\u0017B+}VF\u000bE6";
        objectArray[26] = "O\u001d\u0012=uhY\u001d\u0017gf\u007fNV\u0014ajk_\u0011\u0003v!{G\u0011\u0001}{6{\n\u0001`{qL\u001d";
        objectArray[27] = "$R\u0004F/j2R\u0001\u001c<}%\u0019\u0002\u001a0i4^\u0015\r{y\u0003";
        objectArray[28] = "E\u0007{\u00151\u00020'p\u001a MQ){\u0011$\u0017%";
        objectArray[29] = "8Ir#\u001avMiy,\u000b9,gr'\u000fcX";
        objectArray[30] = "^N8(\u0007C+n3'\u0016\fJ`8,\u0012V>";
        objectArray[31] = "BPZCT~TP_\u0019GiC\u001b\\\u001fK}R\\K\b\u0000mg";
        objectArray[32] = "(-\u0012lY ]\r\u0019cHo<\u0003\u0012hL5H";
        objectArray[33] = "Z\u0002k36NL\u0002ni%Y[Imo)MJ\u000ezxb\\i";
        objectArray[34] = "Tp\u007f\u00034\u0001_\u007fnLU\u000fTtj\u0016";
        objectArray[35] = "+& \u0014]\u0012^\u0006+\u001bL]?\b \u0010H\u0007K";
        objectArray[36] = "\f'nUE0y\u0007eZT\u007f\u0018\tnQP%l";
        objectArray[37] = "O\u0015!z\u0014CY\u0015$ \u0007TN^'&\u000b@_\u001901@W@";
        objectArray[38] = "2|\u0000RN\u0019G\\\u000b]_V&R\u0000V[\fR";
        objectArray[39] = "I\u0019yAwt_\u0019|\u001bdcHR\u007f\u001dhwY\u0015h\n#`I";
        objectArray[40] = "R\u0012<`\u0018''27o\thF<<d\r22";
        objectArray[41] = "D>#Chi1\u001e(Ly&P\u0010#G}|$";
        objectArray[42] = "L>\nD?DZ>\u000f\u001e,SMu\f\u0018 G\\2\u001b\u000fkPD";
        objectArray[43] = ")(beK_\\\bijZ\u0010=\u0006ba^JI";
        objectArray[44] = "8K\u001c}N\u0001&C\u00062!\u0006 K\u0013P\t\u0007&";
        objectArray[45] = " { 07GU[+?&\b4U 4\"R@";
        objectArray[46] = "@h|Rb<Kgm\u001d\u001f)Y}o^";
        objectArray[47] = Long.TYPE;
        cb_0.L[47] = "java/lang/Long";
        objectArray[48] = "\u0013ftH1LfF\u007fG \u0003\u0007HtL$Ys";
        objectArray[49] = "R}k\u0017qs']`\u0018`<FSk\u0013df2";
        objectArray[50] = "pDoCE1fDj\u0019V&q\u000fi\u001fZ2`H~\b\u0011%B";
        objectArray[51] = "E4%s\u001b\u0007N;4<f\u001f]<=u";
        objectArray[52] = "\u0011V\u007f\u0005?\u0005dvt\n.J\u0005x\u007f\u0001*\u0010q";
        objectArray[53] = "mqc\b:7\u0018Qh\u0007+xy_c\f/\"\r";
        objectArray[54] = "z5;D?\u0005l5>\u001e,\u0012{~=\u0018 \u0006j9*\u000fk\r";
        objectArray[55] = "f3\u0016G\u000bJp3\u0013\u001d\u0018]gx\u0010\u001b\u0014Iv?\u0007\f_^o";
        objectArray[56] = "Z.\u0006\u001b\u0014q/\u000e\r\u0014\u0005>N\u0000\u0006\u001f\u0001d:";
        objectArray[57] = "\r\u001d\u0019\rB\r\u0013\u0015\u0003B!\u0019\u0017";
        objectArray[58] = "<,|AR58#+\u000e#&o/U\u0006N$dS!\u0007\u0018.>cdFCw\u0002";
        objectArray[59] = ">Y \u0014DXh\u001dh\r%P\u0007\u0018\"SA\u0006mAkP_Y\u0007\u001c{\u0010\u001a\u000b}C'\u000eD;";
        objectArray[60] = "'_wZ:\u007f'I#[QdzQr\\=V-\u0017,\u000bj\u0001&L~\n!jhK(]Q";
        objectArray[61] = "\u001f4Q&\rP\u000f<\u00079r[\u0019`]$\u001f!\u001ec\n4\n\u001a\fjQdr";
        objectArray[62] = "XJ\r\u0017k<S\u0015\bP\u0014&3\u0012M\u0013pzYK\u0004\u0010n%3A\u0010\u0019z?\bS\u0019B*G";
        objectArray[63] = "Ks\u0015qEeJ8OhI\u0018\n5\n\nDf\f*\u001diH!\u0002svl\\f\u0010#\u0015`\u001bhIH\u0010t\\z\u0019+\u001c3R#r";
        objectArray[64] = "d:l2uAysm?\u0016T\t3<br\u0003cjual\\\t7e!)\u000esh9?w>";
        objectArray[65] = "'d\u001c\u0002/g&/F\u001b#\u001aq2\u0003y.d`=\u0014\u001a\"#nd\u007f\u001f6d|4\u001c\u0013qj%_";
        objectArray[66] = "_\u0018\te5;_\u000e]d^+\u000e\u0007\bh\t|PWQ\u00041*S\u0010\\v;#US";
        objectArray[67] = "]\u001at\u0017?uM\u0012\"\b@d_PY\u00060x6K'V'k\\W'\u000e~\u0004";
        objectArray[68] = "\u0019Q'*\\q\u0005Ugz%t\u0018^wJ\u001etBK&z[5\u0019\u0012\u001a";
        objectArray[69] = "+C\u001c\t\u0001rr[\u001c\u0000fsJCX\u0012[h#Q\r\u001d_";
        objectArray[70] = "`AKP&&k\u001eN\u0017Y1\u000b\u0019\u000bT=`a@BW#?\u000b@\bS>2a\\\b\u000bg]";
        objectArray[71] = "ENN\u0015\u001ba\u0013\n\u0006\fzk|\u000fLR\u001e?\u0016V\u0005Q\u0000`|\r\fS\u001d>LHM\bD\u0002";
        objectArray[72] = "R>^$C\n\u001a}\u0010y\u001cg\u0002\u0004[#F\u0003Vn\u0002jE\u001d\t\u0004\u0004yFW\u000et\u0018z\u001cYk";
        objectArray[73] = "\u0004wg9\u0004\u000f\u000f(b~{\u001do/'=\u001fI\u0005vn>\u0001\u0016o|z7\u0015\fTnslEt";
        objectArray[74] = "/GoU Ly\u0003'LAF\u0016\u0005=F}Kq\u00078V-/,T8\u0014%H.Q(DA";
        objectArray[75] = "e}\u0015}l-+n\u001dm\u0006v\u0017e\u001crj%&p\u001cl\u007f\u001c";
        objectArray[76] = "E_\u001a3\r`\u0005GN=a5=\u001b\u001cf\u0005cWBUe\u001b<=HAl\u000f&\u0006ZH7_^";
        objectArray[77] = "\f\u0015\u0007n5F\u000f\f\u0005?L\u0017pGPi(A\u001a\u001e\u0019j6\u001ep\u0014\rc\"\u0004K\u0006\u00048r|";
        objectArray[78] = "ek^h4\u0005n4[/K\u0015\u000e3\u001el/CdjWo1\u001c\u000ej\u001dk,\u0011dv\u001d3u~";
        objectArray[79] = "B\u0018l2 !RYh}\u00104A\u0012s-v#`\tl-U>X\fh;\u0010 LTtza/@\bl@";
        objectArray[80] = "2)\u001eBIo')\u0000Wp397\u0015J\u000b^&4\u0002L\u001b=*s\f\u0015p>xw\u001bA\u001a\"x/B.";
        objectArray[81] = "\f\u000e\u001f7Av_\u0000F.1jW\u0019\"jJ4QC\u0012/\u000bo\b\u007f\u0019*\nh\nO\\kQ16DYjV3\u0006\u0001\u00181\u000f\u000f";
        objectArray[82] = "\u0006o\u000eUH[\r0\u000b\u00127Mm7NQS\u001d\u0007n\u0007RMBmnMVPO\u0007rM\u000e\t ";
        objectArray[83] = "*0{9#\u0016>:y.]\u00028g@0#\u00156`#<d\u001bo\u000b n`\f;a<n8UT";
        objectArray[84] = "\u0005G\u0012'b<K@Dp\u00122YZ\u001eq~\u0000\b\u001aN'\u0012lO\u001d\u0019*\")\u000eF@\u0016";
        objectArray[85] = "w6w\u001bx\u0000!r?\u0002\u0019\u001fNwu\\}^$.<_c\u0001N$(Vw\u001bu6!\r'c";
        objectArray[86] = "(/\u0015R\u0011aqo\u000f\u001eoz\u0014oR\u0014\u000b.~6\u001b\u0017\u0015q\u0014k\u000bWP#n4WI\u000e\u0013";
        objectArray[87] = "9'Q{\u0002Toc\u0019bc]\u0000fS<\u0007\nj?\u001a?\u0019U\u0000a\u0017`^F|e\u00187\u00117";
        objectArray[88] = "yz&|\u001fqqm*\u0018\nIq=4~\u001ct-\u007f+j`";
        objectArray[89] = "6^1\u001fw,?\u001bk\u001e\u001e:_[0Izc5\u0002yJd<_\bmCp&d\u001ad\u0018 ^";
        objectArray[90] = "\u0010% EU\u001f\u0014*w\n$\fC&\u001c\u0015Hc\u0015!}\u001f\u0018SP`&F$";
        objectArray[91] = "\u0018]\u000e\b\u000b|VN\u0006\u0018a$jW\\X\u0006\"\u0000K\\\u0000_M";
        objectArray[92] = "?\u0010_\u0015LMiT\u0017\f-G\u0006Q]RI\u0013l\b\u0014QWL\u0006V\u0019\u000e\u0010_zR\u0016Y_.";
        objectArray[93] = ">#p!~\u001f,v\u007f%\u000e\u001f\\$\"&jK6}k%t\u0014\\x#dkG&| %jv";
        objectArray[94] = "\u00024t~Az\u001e04.8e\u0019\u0004,fDub)q#_k\b5q{\u0006\u0004";
        objectArray[95] = "\u001fa})\u0013VQf+~cXC|q\u007f\u000fj\u0012=)&c\u0006U;v$SC\u0014`/\u0018";
        objectArray[96] = "Nc6\u001dh1JlaR\u0019\"\u001d`\u0019Da-\u0019\u001ck[\"*L,.\u001aysp";
        objectArray[97] = "\bv@ed2^2\b|\u0005817B\"al[n\u000b!\u007f31h\u0018\"54At\u001bx;Q";
        objectArray[98] = "O]f\u001fo:_U0\u0000\u0010-I\u001cqcv5Z\u000ef\u0000zrTW\r";
        objectArray[99] = "\u001e.,W|\\\u000b.2BE\u0011\u000b\t)D(\u0017'$5VE\u001f\u000f/\"\u0002t\n\u000f17;";
        objectArray[100] = "ZC\u001d;NY\tK\u000f;\u001f4\u0004\u0000\r(\u0012]\u0007zZ2OS_J\u001fs\u0014\nc";
        objectArray[101] = "sk\u0013\u0003A7whR\u0002p&\u0016hP\\\u0014p|1\u0019_\n/\u0016l\t\u001fO}l3U\u0001\u0011M";
        objectArray[102] = "~\r%\u007fi)b\te/\u0010>r\u001c\u0018yn)|\u001b{u)'%px'-0q\u001ad'ui\u001e";
        objectArray[103] = "\u001c\rL#\u0017B\u0018\u000e\r\"&Qy\u000e\u000f|B\u0005\u0013WF\u007f\\Zy\nV?\u0019\b\u0003U\n!G8";
        objectArray[104] = "CD\u00134\u0005\u001bA[\u000e#5K9\u001dDgQ\u001bSD\rdOD9N\u0019m[^\u0002\\\u00106\u000b&";
        objectArray[105] = ";\u0014\u000f\u001f\u0012\\?\u001bXPcOh\u0017#F\u001eM\u0005P\u0012\u0019\u0004\u001c5\u0015SB] ";
        objectArray[106] = "!c\u0002\u0011p'x#\u0018]\u000e?\u001d#EWjhwz\fTt7\u001d'\u001c\u00141egx@\noU";
        objectArray[107] = "ga?4Z\u0015sk=#$\te7~2X\u000fcZojO\u0014f+\u007fb\u0019\u000b\u0019";
        objectArray[108] = "$lZ\u0004\u007fP8h\u001aT\u0006O8|\u001d\rzI>\u0011\fUmR;`\u001c];MD";
        objectArray[109] = "\r{u\u0010\u0007y\u0011\u007f5@~h\u0000zHK\u0005<\n:x\u000eDgS\u0006.\u000e\u0000e\u0006e\"I\u000e<m";
        objectArray[110] = "!`]LQ\u0010%c\u001cM`\u0015Dc\u001e\u0013\u0004W.:W\u0010\u001a\bD0C\u0019\u000e\u0012\u007f\"JB^j";
        objectArray[111] = "5;rjnmf3`j?\u0000jkkuTro`b!ego~w\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[112] = "\"\u000by\u0002t~q\u0005 \u001b\u0004bq\nDYf~'J>\u0006:`yzy\u0006}8(\u0000&Zcf\u0018G&\u001d;7b\u0018z\u0003e\u0007";
    }

    private static String b(byte[] byArray) {
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

    public static void s(Object[] objectArray) {
        cb_0 cb_02;
        long l;
        long l2;
        x_0 x_02;
        String string;
        dV dV2;
        block4: {
            block5: {
                dV2 = (dV)objectArray[0];
                string = (String)objectArray[1];
                x_02 = (x_0)((Object)objectArray[2]);
                l2 = (Long)objectArray[3];
                long l3 = l2 = v ^ l2;
                long l4 = l3 ^ 0x58A896A526FAL;
                l = l3 ^ 0x482B7EA7E3E3L;
                CallSite callSite = cb_0.g("\u00e0", (long)-8691025306878503672L, (long)l2);
                try {
                    try {
                        cb_02 = a;
                        if (callSite != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        if (cb_0.g("o", (Object)cb_02, (Object)objectArray2, (long)-8691453389419924168L, (long)l2) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cb_0.g("\u00e0", (Object)matchException, (long)-8689713224671115755L, (long)l2);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw cb_0.g("\u00e0", (Object)matchException, (long)-8689713224671115755L, (long)l2);
                }
            }
            cb_02 = a;
        }
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l;
        objectArray3[2] = x_02;
        objectArray3[1] = string;
        objectArray3[0] = cb_0.g("o", (Object)dV2, (long)-8689805391755146921L, (long)l2);
        cb_0.g("o", (Object)cb_02, (Object)objectArray3, (long)-8691896198266482190L, (long)l2);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D9F;
        if (C[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = B[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])D.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cb_0.C[n2] = n3;
        }
        return C[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cb_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'U' || c == 'Y' || c == '\u00c7' || c == 'y') {
                field = cb_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'U' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cb_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cb_0.c(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private float c(Object[] objectArray) {
        cL cL2 = (cL)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = v ^ l;
        long l3 = l2 ^ 0x5C0C80F558FL;
        long l4 = l2 ^ 0x2F5800ACB9DDL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = cL2.a;
        reference var9_6 = cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)5516158249337522608L, (long)l), (Object)objectArray2, (long)5515609628296516661L, (long)l), (Object)objectArray3, (long)5514092605670960731L, (long)l) * 0.9f;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l4;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l3;
        objectArray5[0] = cL2.b;
        reference var10_7 = cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)5516158249337522608L, (long)l), (Object)objectArray4, (long)5515609628296516661L, (long)l), (Object)objectArray5, (long)5514092605670960731L, (long)l) * 0.75f;
        CallSite callSite = cb_0.g("\u00e0", (float)var9_6, (float)var10_7, (long)5512435696708099636L, (long)l);
        return (float)cb_0.g("\u00e0", (float)90.0f, (float)(18.5f + callSite + 5.5f), (long)5512435696708099636L, (long)l);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cb_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cb_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = cb_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cb_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l(Object[] var1_1) {
        block124: {
            block122: {
                block123: {
                    block118: {
                        block117: {
                            block119: {
                                block120: {
                                    block121: {
                                        block115: {
                                            block116: {
                                                block113: {
                                                    block114: {
                                                        block105: {
                                                            block103: {
                                                                block101: {
                                                                    block102: {
                                                                        var5_2 = (aq_0)var1_1[0];
                                                                        var2_3 = (gK)var1_1[1];
                                                                        var6_4 = (Matrix4f)var1_1[2];
                                                                        var3_5 = (Long)var1_1[3];
                                                                        v0 = var3_5;
                                                                        var7_6 = v0 ^ 48964852101235L;
                                                                        var9_7 = v0 ^ 95334181894420L;
                                                                        var11_8 = v0 ^ 54030867045760L;
                                                                        var13_9 = v0 ^ 104134194455071L;
                                                                        var15_10 = v0 ^ 33668147527298L;
                                                                        var17_11 = v0 ^ 93148276620004L;
                                                                        var19_12 = v0 ^ 132449650111663L;
                                                                        var21_13 = v0 ^ 78957407708937L;
                                                                        var23_14 = v0 ^ 115271282653595L;
                                                                        var25_15 = v0 ^ 8572711703332L;
                                                                        var27_16 = v0 ^ 89135395443612L;
                                                                        var29_17 = v0 ^ 102693909475685L;
                                                                        var31_18 = v0 ^ 6014253680539L;
                                                                        var33_19 = v0 ^ 131934975778103L;
                                                                        var35_20 = v0 ^ 19313467402120L;
                                                                        var37_21 = v0 ^ 101037798966850L;
                                                                        var39_22 = v0 ^ 26124314106062L;
                                                                        var42_23 = cb_0.g("\u00e0", (long)-6312493658137349373L, (long)var3_5);
                                                                        var41_24 = cb_0.g("\u00e0", (long)-6313935605151843829L, (long)var3_5);
                                                                        try {
                                                                            try {
                                                                                v1 /* !! */  = this.n;
                                                                                v2 /* !! */  = cb_0.d("h", (int)18427, (long)(2853003896744192305L ^ var3_5));
                                                                                if (var41_24 != null) break block101;
                                                                                if (v1 /* !! */  != v2 /* !! */ ) break block102;
                                                                            }
                                                                            catch (MatchException v3) {
                                                                                throw cb_0.g("\u00e0", (Object)v3, (long)-6312696071908824810L, (long)var3_5);
                                                                            }
                                                                            v4 = 0.0f;
                                                                            break block103;
                                                                        }
                                                                        catch (MatchException v5) {
                                                                            throw cb_0.g("\u00e0", (Object)v5, (long)-6312696071908824810L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    v1 /* !! */  = (long)var42_23;
                                                                    v2 /* !! */  = (CallSite)this.n;
                                                                }
                                                                v4 = (float)(v1 /* !! */  - v2 /* !! */ ) * 0.005f;
                                                            }
                                                            var44_25 = v4;
                                                            this.n = (long)var42_23;
                                                            var45_26 = cb_0.g("U", (Object)cb_0.b, (long)-6312144176942781814L, (long)var3_5) instanceof g8;
                                                            var46_27 = cb_0.g("o", (Object)this.k, (long)-6310459935831296744L, (long)var3_5);
                                                            while (cb_0.g("o", (Object)var46_27, (long)-6312194328704630162L, (long)var3_5) != false) {
                                                                block108: {
                                                                    block107: {
                                                                        block104: {
                                                                            block106: {
                                                                                var47_28 = (cL)cb_0.g("o", (Object)var46_27, (long)-6309894679694537852L, (long)var3_5);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v6 = var47_28;
                                                                                                if (var41_24 != null) break block104;
                                                                                                v7 = v6.f;
                                                                                                if (var41_24 != null) break block105;
                                                                                            }
                                                                                            catch (MatchException v8) {
                                                                                                throw cb_0.g("\u00e0", (Object)v8, (long)-6312696071908824810L, (long)var3_5);
                                                                                            }
                                                                                            if (v7 != 0) break block106;
                                                                                        }
                                                                                        catch (MatchException v9) {
                                                                                            throw cb_0.g("\u00e0", (Object)v9, (long)-6312696071908824810L, (long)var3_5);
                                                                                        }
                                                                                        if (var42_23 - var47_28.d < cb_0.d("h", (int)14396, (long)(5925685537230968564L ^ var3_5))) break block106;
                                                                                    }
                                                                                    catch (MatchException v10) {
                                                                                        throw cb_0.g("\u00e0", (Object)v10, (long)-6312696071908824810L, (long)var3_5);
                                                                                    }
                                                                                    var47_28.f = true;
                                                                                }
                                                                                catch (MatchException v11) {
                                                                                    throw cb_0.g("\u00e0", (Object)v11, (long)-6312696071908824810L, (long)var3_5);
                                                                                }
                                                                            }
                                                                            v6 = var47_28;
                                                                        }
                                                                        try {
                                                                            v12 = var47_28.e;
                                                                            v13 = var47_28.f != false ? 0.0f : 1.0f;
                                                                        }
                                                                        catch (MatchException v14) {
                                                                            throw cb_0.g("\u00e0", (Object)v14, (long)-6312696071908824810L, (long)var3_5);
                                                                        }
                                                                        try {
                                                                            v15 = var47_28.f != false ? var44_25 * 2.0f : var44_25;
                                                                        }
                                                                        catch (MatchException v16) {
                                                                            throw cb_0.g("\u00e0", (Object)v16, (long)-6312696071908824810L, (long)var3_5);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v17 = new Object[4];
                                                                                v17[3] = var31_18;
                                                                                v17[2] = Float.valueOf(v15);
                                                                                v17[1] = Float.valueOf(v13);
                                                                                v17[0] = Float.valueOf(v12);
                                                                                v6.e = (float)cb_0.g("\u00e0", (Object)v17, (long)-6310397218034877065L, (long)var3_5);
                                                                                v18 = var47_28.f;
                                                                                if (var41_24 != null) break block107;
                                                                                if (v18 == 0) break block108;
                                                                            }
                                                                            catch (MatchException v19) {
                                                                                throw cb_0.g("\u00e0", (Object)v19, (long)-6312696071908824810L, (long)var3_5);
                                                                            }
                                                                            cfr_temp_0 = var47_28.e - 0.01f;
                                                                            v18 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                        }
                                                                        catch (MatchException v20) {
                                                                            throw cb_0.g("\u00e0", (Object)v20, (long)-6312696071908824810L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v18 <= 0) {
                                                                            cb_0.g("o", (Object)var46_27, (long)-6306975123236160084L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    catch (MatchException v21) {
                                                                        throw cb_0.g("\u00e0", (Object)v21, (long)-6312696071908824810L, (long)var3_5);
                                                                    }
                                                                }
                                                                if (var41_24 == null) continue;
                                                            }
                                                            v7 = 0;
                                                        }
                                                        var47_29 = v7;
                                                        var48_30 = cb_0.g("o", (Object)this.k, (long)-6310459935831296744L, (long)var3_5);
                                                        while (cb_0.g("o", (Object)var48_30, (long)-6312194328704630162L, (long)var3_5) != false) {
                                                            block109: {
                                                                var49_31 = (cL)cb_0.g("o", (Object)var48_30, (long)-6309894679694537852L, (long)var3_5);
                                                                try {
                                                                    v22 /* !! */  = var49_31.f;
                                                                    if (var41_24 == null) {
                                                                        if (v22 /* !! */ ) break block109;
                                                                    }
                                                                    ** GOTO lbl136
                                                                }
                                                                catch (MatchException v23) {
                                                                    throw cb_0.g("\u00e0", (Object)v23, (long)-6312696071908824810L, (long)var3_5);
                                                                }
                                                                ++var47_29;
                                                            }
                                                            if (var41_24 == null) continue;
                                                        }
                                                        var48_30 = cb_0.g("o", (Object)this.k, (long)-6310459935831296744L, (long)var3_5);
                                                        do {
                                                            block112: {
                                                                block110: {
                                                                    v22 /* !! */  = cb_0.g("o", (Object)var48_30, (long)-6312194328704630162L, (long)var3_5);
lbl136:
                                                                    // 2 sources

                                                                    if (!v22 /* !! */ ) break;
                                                                    var49_31 = (cL)cb_0.g("o", (Object)var48_30, (long)-6309894679694537852L, (long)var3_5);
                                                                    try {
                                                                        try {
                                                                            v24 = var47_29;
                                                                            if (var41_24 != null) break block110;
                                                                            if (v24 <= 5) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        catch (MatchException v25) {
                                                                            throw cb_0.g("\u00e0", (Object)v25, (long)-6312696071908824810L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    catch (MatchException v26) {
                                                                        throw cb_0.g("\u00e0", (Object)v26, (long)-6312696071908824810L, (long)var3_5);
                                                                    }
                                                                    try {
                                                                        v27 = var49_31;
                                                                        if (var41_24 != null) break block112;
                                                                        v24 = (int)v27.f;
                                                                    }
                                                                    catch (MatchException v28) {
                                                                        throw cb_0.g("\u00e0", (Object)v28, (long)-6312696071908824810L, (long)var3_5);
                                                                    }
                                                                }
                                                                if (v24 != 0) continue;
                                                                v27 = var49_31;
                                                            }
                                                            v27.f = true;
                                                            --var47_29;
                                                        } while (var41_24 == null);
                                                        var48_30 = new ArrayList<E>(this.k);
                                                        try {
                                                            try {
                                                                try {
                                                                    v29 /* !! */  = var45_26;
                                                                    if (var41_24 != null) break block113;
                                                                    if (!v29 /* !! */ ) break block114;
                                                                }
                                                                catch (MatchException v30) {
                                                                    throw cb_0.g("\u00e0", (Object)v30, (long)-6312696071908824810L, (long)var3_5);
                                                                }
                                                                v29 /* !! */  = cb_0.g("o", (Object)var48_30, (long)-6313508716389812896L, (long)var3_5);
                                                                if (var41_24 != null) break block113;
                                                            }
                                                            catch (MatchException v31) {
                                                                throw cb_0.g("\u00e0", (Object)v31, (long)-6312696071908824810L, (long)var3_5);
                                                            }
                                                            if (!v29 /* !! */ ) break block114;
                                                        }
                                                        catch (MatchException v32) {
                                                            throw cb_0.g("\u00e0", (Object)v32, (long)-6312696071908824810L, (long)var3_5);
                                                        }
                                                        var49_31 = new cL((String)cb_0.a("c", (int)22083, (long)(3476184673741291996L ^ var3_5)), (String)cb_0.a("c", (int)31879, (long)(3260921187954715418L ^ var3_5)), x_0.SUCCESS, var13_9);
                                                        var49_31.e = 1.0f;
                                                        cb_0.g("o", (Object)var48_30, (Object)var49_31, (long)-6309582962278809982L, (long)var3_5);
                                                    }
                                                    v29 /* !! */  = cb_0.g("o", (Object)var48_30, (long)-6313508716389812896L, (long)var3_5);
                                                }
                                                try {
                                                    try {
                                                        if (var41_24 != null) break block115;
                                                        if (!v29 /* !! */ ) break block116;
                                                    }
                                                    catch (MatchException v33) {
                                                        throw cb_0.g("\u00e0", (Object)v33, (long)-6312696071908824810L, (long)var3_5);
                                                    }
                                                    v34 = new Object[2];
                                                    v34[1] = Float.valueOf(0.0f);
                                                    v34[0] = Float.valueOf(0.0f);
                                                    cb_0.g("o", (Object)this, (Object)v34, (long)-6306741397420914683L, (long)var3_5);
                                                    this.o = 0.0f;
                                                    this.p = 0.0f;
                                                    return;
                                                }
                                                catch (MatchException v35) {
                                                    throw cb_0.g("\u00e0", (Object)v35, (long)-6312696071908824810L, (long)var3_5);
                                                }
                                            }
                                            v29 /* !! */  = cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.b, (long)-6306922758819556907L, (long)var3_5), (long)-6313068733562859550L, (long)var3_5);
                                        }
                                        v36 = new Object[1];
                                        v36[0] = var7_6;
                                        var49_32 = (float)v29 /* !! */  / cb_0.g("\u00e0", (Object)v36, (long)-6312249212245526196L, (long)var3_5);
                                        v37 = new Object[1];
                                        v37[0] = var7_6;
                                        var50_33 = (float)cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.b, (long)-6306922758819556907L, (long)var3_5), (long)-6313585252800635058L, (long)var3_5) / cb_0.g("\u00e0", (Object)v37, (long)-6312249212245526196L, (long)var3_5);
                                        var51_34 = cb_0.g("o", (Object)this, (Object)new Object[0], (long)-6312366954350371860L, (long)var3_5);
                                        var52_35 = cb_0.g("o", (Object)this, (Object)new Object[0], (long)-6311799977267025153L, (long)var3_5);
                                        v38 = new Object[1];
                                        v38[0] = var33_19;
                                        v39 = new Object[1];
                                        v39[0] = var11_8;
                                        var53_36 = cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)-6312063067573490342L, (long)var3_5), (Object)v38, (long)-6313702404140863265L, (long)var3_5), (Object)v39, (long)-6309798419706308803L, (long)var3_5);
                                        var54_37 = var53_36 * 1.65f + 6.0f;
                                        var55_38 /* !! */  = 0.0f;
                                        var56_39 = 0.0f;
                                        var57_40 = cb_0.g("o", (Object)var48_30, (long)-6310312344447261497L, (long)var3_5);
                                        while (cb_0.g("o", (Object)var57_40, (long)-6312194328704630162L, (long)var3_5) != false) {
                                            var58_42 = (cL)cb_0.g("o", (Object)var57_40, (long)-6309894679694537852L, (long)var3_5);
                                            v40 = new Object[2];
                                            v40[1] = var23_14;
                                            v40[0] = var58_42;
                                            var55_38 /* !! */  = (float)cb_0.g("\u00e0", (float)var55_38 /* !! */ , (float)cb_0.g("o", (Object)this, (Object)v40, (long)-6307142238105809497L, (long)var3_5), (long)-6311157530977764642L, (long)var3_5);
                                            var56_39 += (var54_37 + 3.0f) * var58_42.e;
                                            try {
                                                if (var41_24 == null) {
                                                    if (var41_24 == null) continue;
                                                    break;
                                                }
                                                break block117;
                                            }
                                            catch (MatchException v41) {
                                                throw cb_0.g("\u00e0", (Object)v41, (long)-6312696071908824810L, (long)var3_5);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v42 /* !! */  = var45_26;
                                                                if (var41_24 != null) break block118;
                                                                if (v42 /* !! */  != false) break block119;
                                                            }
                                                            catch (MatchException v43) {
                                                                throw cb_0.g("\u00e0", (Object)v43, (long)-6312696071908824810L, (long)var3_5);
                                                            }
                                                            v42 /* !! */  = var52_35;
                                                            if (var41_24 != null) break block120;
                                                        }
                                                        catch (MatchException v44) {
                                                            throw cb_0.g("\u00e0", (Object)v44, (long)-6312696071908824810L, (long)var3_5);
                                                        }
                                                        if (v42 /* !! */  == false) break block121;
                                                    }
                                                    catch (MatchException v45) {
                                                        throw cb_0.g("\u00e0", (Object)v45, (long)-6312696071908824810L, (long)var3_5);
                                                    }
                                                    cfr_temp_1 = this.o - 0.0f;
                                                    v42 /* !! */  = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                    if (var41_24 != null) break block120;
                                                }
                                                catch (MatchException v46) {
                                                    throw cb_0.g("\u00e0", (Object)v46, (long)-6312696071908824810L, (long)var3_5);
                                                }
                                                if (v42 /* !! */  <= 0) break block121;
                                            }
                                            catch (MatchException v47) {
                                                throw cb_0.g("\u00e0", (Object)v47, (long)-6312696071908824810L, (long)var3_5);
                                            }
                                            this.f -= var56_39 - this.o;
                                        }
                                        catch (MatchException v48) {
                                            throw cb_0.g("\u00e0", (Object)v48, (long)-6312696071908824810L, (long)var3_5);
                                        }
                                    }
                                    v42 /* !! */  = var51_34;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var41_24 != null) break block118;
                                                if (v42 /* !! */  == false) break block119;
                                            }
                                            catch (MatchException v49) {
                                                throw cb_0.g("\u00e0", (Object)v49, (long)-6312696071908824810L, (long)var3_5);
                                            }
                                            cfr_temp_2 = this.p - 0.0f;
                                            v42 /* !! */  = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                            if (var41_24 != null) break block118;
                                        }
                                        catch (MatchException v50) {
                                            throw cb_0.g("\u00e0", (Object)v50, (long)-6312696071908824810L, (long)var3_5);
                                        }
                                        if (v42 /* !! */  <= 0) break block119;
                                    }
                                    catch (MatchException v51) {
                                        throw cb_0.g("\u00e0", (Object)v51, (long)-6312696071908824810L, (long)var3_5);
                                    }
                                    this.e -= var55_38 /* !! */  - this.p;
                                }
                                catch (MatchException v52) {
                                    throw cb_0.g("\u00e0", (Object)v52, (long)-6312696071908824810L, (long)var3_5);
                                }
                            }
                            try {
                                this.o = var56_39;
                                this.p = var55_38 /* !! */ ;
                                v53 = this;
                                if (var41_24 != null) break block122;
                                v54 = new Object[2];
                                v54[1] = Float.valueOf(var56_39);
                                v54[0] = Float.valueOf(var55_38 /* !! */ );
                                cb_0.g("o", (Object)v53, (Object)v54, (long)-6306741397420914683L, (long)var3_5);
                            }
                            catch (MatchException v55) {
                                throw cb_0.g("\u00e0", (Object)v55, (long)-6312696071908824810L, (long)var3_5);
                            }
                        }
                        v42 /* !! */  = (int)var52_35;
                    }
                    try {
                        if (v42 /* !! */  == false) break block123;
                        v56 = this.f + var56_39 - var54_37;
                        break block124;
                    }
                    catch (MatchException v57) {
                        throw cb_0.g("\u00e0", (Object)v57, (long)-6312696071908824810L, (long)var3_5);
                    }
                }
                v53 = this;
            }
            v56 = v53.f;
        }
        var57_41 = v56;
        for (var58_43 = cb_0.g("o", (Object)var48_30, (long)-6311976835833934764L, (long)var3_5) - true; var58_43 >= 0; --var58_43) {
            block133: {
                block132: {
                    block129: {
                        block130: {
                            block131: {
                                block128: {
                                    block127: {
                                        block125: {
                                            block126: {
                                                var59_44 = (cL)cb_0.g("o", (Object)var48_30, (int)var58_43, (long)-6310328000677924801L, (long)var3_5);
                                                var60_45 = var59_44.e;
                                                v58 = new Object[2];
                                                v58[1] = var23_14;
                                                v58[0] = var59_44;
                                                var61_46 = cb_0.g("o", (Object)this, (Object)v58, (long)-6307142238105809497L, (long)var3_5);
                                                v59 = new Object[2];
                                                v59[1] = var39_22;
                                                v59[0] = var59_44.c;
                                                var62_47 = cb_0.g("\u00e0", (Object)v59, (long)-6313659898576685622L, (long)var3_5);
                                                var63_48 = (1.0f - var60_45) * 12.0f;
                                                try {
                                                    v60 = var51_34 != false ? this.e + var55_38 /* !! */  - var61_46 + var63_48 : this.e - var63_48;
                                                }
                                                catch (MatchException v61) {
                                                    throw cb_0.g("\u00e0", (Object)v61, (long)-6312696071908824810L, (long)var3_5);
                                                }
                                                var64_49 = v60;
                                                var65_50 = var64_49 + var61_46;
                                                v62 = new Object[2];
                                                v62[1] = var15_10;
                                                v62[0] = (int)((float)cb_0.g("o", (Object)cn_0.r, (long)-6310032997381243608L, (long)var3_5) * var60_45);
                                                var66_51 = new Color((int)cb_0.g("o", (Object)cn_0.r, (long)-6313792280825629046L, (long)var3_5), (int)cb_0.g("o", (Object)cn_0.r, (long)-6307076693915843322L, (long)var3_5), (int)cb_0.g("o", (Object)cn_0.r, (long)-6310634823694260689L, (long)var3_5), (int)cb_0.g("\u00e0", (Object)v62, (long)-6311920119458421182L, (long)var3_5));
                                                v63 = new Object[3];
                                                v63[2] = var25_15;
                                                v63[1] = (int)(230.0f * var60_45);
                                                v63[0] = var62_47;
                                                var67_52 = cb_0.g("\u00e0", (Object)v63, (long)-6313010333429772238L, (long)var3_5);
                                                v64 = new Object[2];
                                                v64[1] = var15_10;
                                                v64[0] = (int)(255.0f * var60_45);
                                                var68_53 = new Color((int)cb_0.c("p", (int)5431, (long)(6986515760495120595L ^ var3_5)), (int)cb_0.c("p", (int)13580, (long)(2120800936310599913L ^ var3_5)), (int)cb_0.c("p", (int)13580, (long)(2120800936310599913L ^ var3_5)), (int)cb_0.g("\u00e0", (Object)v64, (long)-6311920119458421182L, (long)var3_5));
                                                v65 = new Object[2];
                                                v65[1] = var15_10;
                                                v65[0] = (int)(255.0f * var60_45);
                                                var69_54 = new Color((int)cb_0.g("o", (Object)cn_0.u, (long)-6313792280825629046L, (long)var3_5), (int)cb_0.g("o", (Object)cn_0.u, (long)-6307076693915843322L, (long)var3_5), (int)cb_0.g("o", (Object)cn_0.u, (long)-6310634823694260689L, (long)var3_5), (int)cb_0.g("\u00e0", (Object)v65, (long)-6311920119458421182L, (long)var3_5));
                                                try {
                                                    try {
                                                        if (var41_24 != null) break block125;
                                                        if (!(var60_45 > 0.7f)) break block126;
                                                    }
                                                    catch (MatchException v66) {
                                                        throw cb_0.g("\u00e0", (Object)v66, (long)-6312696071908824810L, (long)var3_5);
                                                    }
                                                    v67 = new Object[10];
                                                    v67[9] = var9_7;
                                                    v67[8] = Float.valueOf(4.0f);
                                                    v67[7] = 5;
                                                    v67[6] = Float.valueOf((float)var54_37);
                                                    v67[5] = Float.valueOf((float)var61_46);
                                                    v67[4] = Float.valueOf(var57_41);
                                                    v67[3] = Float.valueOf(var64_49);
                                                    v67[2] = var6_4;
                                                    v67[1] = var2_3;
                                                    v67[0] = var5_2;
                                                    cb_0.g("\u00e0", (Object)v67, (long)-6310597830877445327L, (long)var3_5);
                                                }
                                                catch (MatchException v68) {
                                                    throw cb_0.g("\u00e0", (Object)v68, (long)-6312696071908824810L, (long)var3_5);
                                                }
                                            }
                                            v69 = new Object[10];
                                            v69[9] = var19_12;
                                            v69[8] = Float.valueOf(4.0f);
                                            v69[7] = var66_51;
                                            v69[6] = Float.valueOf((float)var54_37);
                                            v69[5] = Float.valueOf((float)var61_46);
                                            v69[4] = Float.valueOf(var57_41);
                                            v69[3] = Float.valueOf(var64_49);
                                            v69[2] = var6_4;
                                            v69[1] = var2_3;
                                            v69[0] = var5_2;
                                            cb_0.g("\u00e0", (Object)v69, (long)-6312530264100790612L, (long)var3_5);
                                        }
                                        v70 = new Object[2];
                                        v70[1] = var21_13;
                                        v70[0] = var59_44.c;
                                        var70_55 = cb_0.g("o", (Object)this, (Object)v70, (long)-6310047215211901979L, (long)var3_5);
                                        try {
                                            v71 = var51_34 != false ? var65_50 - 5.5f - 10.0f : var64_49 + 5.5f;
                                        }
                                        catch (MatchException v72) {
                                            throw cb_0.g("\u00e0", (Object)v72, (long)-6312696071908824810L, (long)var3_5);
                                        }
                                        var71_56 = v71;
                                        v73 = new Object[10];
                                        v73[9] = var35_20;
                                        v73[8] = var67_52;
                                        v73[7] = Float.valueOf(10.0f);
                                        v73[6] = Float.valueOf(10.0f);
                                        v73[5] = Float.valueOf(var57_41 + (var54_37 - 10.0f) / 2.0f);
                                        v73[4] = Float.valueOf(var71_56);
                                        v73[3] = var70_55;
                                        v73[2] = var6_4;
                                        v73[1] = var2_3;
                                        v73[0] = var5_2;
                                        cb_0.g("\u00e0", (Object)v73, (long)-6312578338253842600L, (long)var3_5);
                                        v74 = new Object[1];
                                        v74[0] = var33_19;
                                        v75 = new Object[2];
                                        v75[1] = var29_17;
                                        v75[0] = var59_44.a;
                                        var72_57 = cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)-6312063067573490342L, (long)var3_5), (Object)v74, (long)-6313702404140863265L, (long)var3_5), (Object)v75, (long)-6309641329444795727L, (long)var3_5) * 0.9f;
                                        v76 = new Object[1];
                                        v76[0] = var33_19;
                                        v77 = new Object[2];
                                        v77[1] = var29_17;
                                        v77[0] = var59_44.b;
                                        var73_58 = cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)-6312063067573490342L, (long)var3_5), (Object)v76, (long)-6313702404140863265L, (long)var3_5), (Object)v77, (long)-6309641329444795727L, (long)var3_5) * 0.75f;
                                        try {
                                            v78 = var51_34 != false ? var71_56 - 3.0f - var72_57 : var71_56 + 10.0f + 3.0f;
                                        }
                                        catch (MatchException v79) {
                                            throw cb_0.g("\u00e0", (Object)v79, (long)-6312696071908824810L, (long)var3_5);
                                        }
                                        var74_59 = v78;
                                        try {
                                            v80 = var51_34 != false ? var71_56 - 3.0f - var73_58 : var71_56 + 10.0f + 3.0f;
                                        }
                                        catch (MatchException v81) {
                                            throw cb_0.g("\u00e0", (Object)v81, (long)-6312696071908824810L, (long)var3_5);
                                        }
                                        var75_60 = v80;
                                        try {
                                            v82 = new Object[1];
                                            v82[0] = var33_19;
                                            v83 = new Object[7];
                                            v83[6] = var37_21;
                                            v83[5] = var68_53;
                                            v83[4] = Float.valueOf(0.9f);
                                            v83[3] = Float.valueOf(var57_41 + 3.0f);
                                            v83[2] = Float.valueOf(var74_59);
                                            v83[1] = var59_44.a;
                                            v83[0] = var6_4;
                                            cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)-6312063067573490342L, (long)var3_5), (Object)v82, (long)-6313702404140863265L, (long)var3_5), (Object)v83, (long)-6310147881946507647L, (long)var3_5);
                                            v84 = new Object[1];
                                            v84[0] = var33_19;
                                            v85 = new Object[7];
                                            v85[6] = var37_21;
                                            v85[5] = var69_54;
                                            v85[4] = Float.valueOf(0.75f);
                                            v85[3] = Float.valueOf(var57_41 + 3.0f + var53_36 * 0.9f);
                                            v85[2] = Float.valueOf(var75_60);
                                            v85[1] = var59_44.b;
                                            v85[0] = var6_4;
                                            cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.g("\u00c7", (long)-6312063067573490342L, (long)var3_5), (Object)v84, (long)-6313702404140863265L, (long)var3_5), (Object)v85, (long)-6310147881946507647L, (long)var3_5);
                                            if (!var59_44.f) break block127;
                                            v86 /* !! */  = 0.0f;
                                            break block128;
                                        }
                                        catch (MatchException v87) {
                                            throw cb_0.g("\u00e0", (Object)v87, (long)-6312696071908824810L, (long)var3_5);
                                        }
                                    }
                                    v88 = new Object[4];
                                    v88[3] = var17_11;
                                    v88[2] = Float.valueOf(1.0f);
                                    v88[1] = Float.valueOf(0.0f);
                                    v88[0] = Float.valueOf(1.0f - (float)(var42_23 - var59_44.d) / 2000.0f);
                                    v86 /* !! */  = (float)cb_0.g("\u00e0", (Object)v88, (long)-6312984529812251667L, (long)var3_5);
                                }
                                var76_61 = v86 /* !! */ ;
                                var77_62 = (var61_46 - 11.0f) * var76_61;
                                try {
                                    v89 = var77_62;
                                    v90 = 0.5f;
                                    if (var41_24 != null) break block129;
                                    if (!(v89 > v90)) break block130;
                                }
                                catch (MatchException v91) {
                                    throw cb_0.g("\u00e0", (Object)v91, (long)-6312696071908824810L, (long)var3_5);
                                }
                                v92 = new Object[3];
                                v92[2] = var25_15;
                                v92[1] = (int)(150.0f * var60_45);
                                v92[0] = var62_47;
                                var78_64 = cb_0.g("\u00e0", (Object)v92, (long)-6313010333429772238L, (long)var3_5);
                                try {
                                    try {
                                        if (var41_24 != null) break block131;
                                        if (var51_34 != false) {
                                        }
                                        ** GOTO lbl543
                                    }
                                    catch (MatchException v93) {
                                        throw cb_0.g("\u00e0", (Object)v93, (long)-6312696071908824810L, (long)var3_5);
                                    }
                                    v94 = new Object[7];
                                    v94[6] = var27_16;
                                    v94[5] = var78_64;
                                    v94[4] = Float.valueOf(var57_41 + var54_37 - 2.0f);
                                    v94[3] = Float.valueOf(var65_50 - 5.5f);
                                    v94[2] = Float.valueOf(var57_41 + var54_37 - 3.0f);
                                    v94[1] = Float.valueOf(var65_50 - 5.5f - var77_62);
                                    v94[0] = var6_4;
                                    cb_0.g("\u00e0", (Object)v94, (long)-6314009006010105371L, (long)var3_5);
                                }
                                catch (MatchException v95) {
                                    throw cb_0.g("\u00e0", (Object)v95, (long)-6312696071908824810L, (long)var3_5);
                                }
                            }
                            try {
                                if (var41_24 == null) break block130;
lbl543:
                                // 2 sources

                                v96 = new Object[7];
                                v96[6] = var27_16;
                                v96[5] = var78_64;
                                v96[4] = Float.valueOf(var57_41 + var54_37 - 2.0f);
                                v96[3] = Float.valueOf(var64_49 + 5.5f + var77_62);
                                v96[2] = Float.valueOf(var57_41 + var54_37 - 3.0f);
                                v96[1] = Float.valueOf(var64_49 + 5.5f);
                                v96[0] = var6_4;
                                cb_0.g("\u00e0", (Object)v96, (long)-6314009006010105371L, (long)var3_5);
                            }
                            catch (MatchException v97) {
                                throw cb_0.g("\u00e0", (Object)v97, (long)-6312696071908824810L, (long)var3_5);
                            }
                        }
                        v89 = var54_37 + 3.0f;
                        v90 = var60_45;
                    }
                    var78_63 = v89 * v90;
                    try {
                        if (var41_24 != null) break block132;
                        if (var52_35 == false) break block133;
                    }
                    catch (MatchException v98) {
                        throw cb_0.g("\u00e0", (Object)v98, (long)-6312696071908824810L, (long)var3_5);
                    }
                    var57_41 -= var78_63;
                }
                if (var41_24 == null) continue;
            }
            var57_41 += var78_63;
            if (var41_24 == null) continue;
        }
    }

    private static Method l(long l, long l2) {
        int n = cb_0.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = L[n];
                int n3 = string2.indexOf(8);
                clazz3 = cb_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cb_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cb_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        cb_0.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cb_0.j(2425804818158199L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cb_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cb_0.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cb_0.j(2425804818158199L, 0L);
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

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x46BD;
        if (I[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = H[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])J.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    J.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cb", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cb_0.I[n2] = l4;
        }
        return I[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = cb_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cb_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3FEB;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            cb_0.x[n2] = cb_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private bW a(Object[] objectArray) {
        bW bW2;
        block2: {
            Object object;
            block3: {
                x_0 x_02 = (x_0)((Object)objectArray[0]);
                long l = (Long)objectArray[1];
                long l2 = (l = v ^ l) ^ 0x444A74566839L;
                object = (bW)((Object)cb_0.g("o", (Object)this.l, (Object)((Object)x_02), (long)-7917767950967935650L, (long)l));
                CallSite callSite = cb_0.g("\u00e0", (long)-7919559352339562381L, (long)l);
                try {
                    bW2 = object;
                    if (callSite != null) break block2;
                    if (bW2 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw cb_0.g("\u00e0", (Object)matchException, (long)-7918247465608227986L, (long)l);
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = (String)((Object)cb_0.a("c", (int)7906, (long)(0x37699BF9613FB301L ^ l))) + (String)((Object)cb_0.g("o", (Object)cb_0.g("o", (Object)((Object)x_02), (long)-7920181977564386137L, (long)l), (long)-7919911433770622862L, (long)l)) + (String)((Object)cb_0.a("c", (int)13953, (long)(0x346B8FE0832F9B67L ^ l)));
                object = cb_0.g("\u00e0", (Object)objectArray2, (long)-7918446940550190721L, (long)l);
                cb_0.g("o", (Object)this.l, (Object)((Object)x_02), (Object)object, (long)-7925793097160913622L, (long)l);
            }
            bW2 = object;
        }
        return bW2;
    }

    /*
     * Exception decompiling
     */
    private static Color a(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int a(Object[] objectArray) {
        Object object;
        block6: {
            int n;
            long l;
            block4: {
                int n2;
                block5: {
                    n2 = (Integer)objectArray[0];
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    CallSite callSite = cb_0.g("\u00e0", (long)-8389278204817729032L, (long)l);
                    try {
                        try {
                            n = n2;
                            if (callSite != null) break block4;
                            if (n >= 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw cb_0.g("\u00e0", (Object)matchException, (long)-8387986532374623515L, (long)l);
                        }
                        object = 0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw cb_0.g("\u00e0", (Object)matchException, (long)-8387986532374623515L, (long)l);
                    }
                }
                n = n2;
            }
            object = cb_0.g("\u00e0", (int)n, (int)cb_0.c("p", (int)13580, (long)(0x1D6EB7D9C7C9D31AL ^ l)), (long)-8389912371403244629L, (long)l);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void m(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2;
                var4_3 = v0 ^ 111341298698524L;
                var6_4 = v0 ^ 115520954206759L;
                var8_5 = cb_0.g("\u00e0", (long)-3382435530814209180L, (long)var2_2);
                try {
                    try {
                        v1 = cb_0.g("o", (Object)cb_0.b, (long)-3380506903759509318L, (long)var2_2);
                        if (var8_5 != null) break block8;
                        if (v1 != null) {
                        }
                        ** GOTO lbl38
                    }
                    catch (MatchException v2) {
                        throw cb_0.g("\u00e0", (Object)v2, (long)-3383463818753634183L, (long)var2_2);
                    }
                    v1 = cb_0.g("o", (Object)cb_0.b, (long)-3380506903759509318L, (long)var2_2);
                }
                catch (MatchException v3) {
                    throw cb_0.g("\u00e0", (Object)v3, (long)-3383463818753634183L, (long)var2_2);
                }
            }
            v4 = new Object[1];
            v4[0] = var4_3;
            var9_6 = (float)cb_0.g("o", (Object)v1, (long)-3383275737060526451L, (long)var2_2) / cb_0.g("\u00e0", (Object)v4, (long)-3384126356658929629L, (long)var2_2);
            v5 = new Object[1];
            v5[0] = var4_3;
            var10_7 = (float)cb_0.g("o", (Object)cb_0.g("o", (Object)cb_0.b, (long)-3380506903759509318L, (long)var2_2), (long)-3382508559223806431L, (long)var2_2) / cb_0.g("\u00e0", (Object)v5, (long)-3384126356658929629L, (long)var2_2);
            try {
                v6 = new Object[3];
                v6[2] = var6_4;
                v6[1] = Float.valueOf(var10_7 - 70.0f);
                v6[0] = Float.valueOf(var9_6 - 90.0f - 4.0f);
                cb_0.g("o", (Object)this, (Object)v6, (long)-3383471985716000849L, (long)var2_2);
                if (var8_5 == null) break block9;
lbl38:
                // 2 sources

                v7 = new Object[3];
                v7[2] = var6_4;
                v7[1] = Float.valueOf(150.0f);
                v7[0] = Float.valueOf(200.0f);
                cb_0.g("o", (Object)this, (Object)v7, (long)-3383471985716000849L, (long)var2_2);
            }
            catch (MatchException v8) {
                throw cb_0.g("\u00e0", (Object)v8, (long)-3383463818753634183L, (long)var2_2);
            }
        }
    }

    private static Field k(long l, long l2) {
        int n = cb_0.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = cb_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cb_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cb_0.e(clazz3, string2, clazz2)) != null) {
                    cb_0.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cb_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cb_0.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cb_0.j(2425804818158199L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void t(Object[] objectArray) {
        block11: {
            CallSite callSite;
            String string = (String)objectArray[0];
            String string2 = (String)objectArray[1];
            x_0 x_02 = (x_0)((Object)objectArray[2]);
            long l = (Long)objectArray[3];
            long l2 = (l = v ^ l) ^ 0x56C288FB38EL;
            CallSite callSite2 = cb_0.g("o", (Object)this.k, (long)8790434690194744457L, (long)l);
            CallSite callSite3 = cb_0.g("\u00e0", (long)8786873465159248794L, (long)l);
            while (cb_0.g("o", (Object)callSite2, (long)8788721252504671231L, (long)l) != false) {
                block13: {
                    block14: {
                        boolean bl;
                        cL cL2;
                        cL cL3;
                        block12: {
                            cL3 = (cL)((Object)cb_0.g("o", (Object)callSite2, (long)8790916392070863381L, (long)l));
                            try {
                                try {
                                    try {
                                        try {
                                            callSite = cb_0.g("o", cL3.a, (Object)string, (long)8787375876728913547L, (long)l);
                                            if (callSite3 != null) break block11;
                                            if (callSite3 != null) break block12;
                                        }
                                        catch (MatchException matchException) {
                                            throw cb_0.g("\u00e0", (Object)matchException, (long)8788096857918814343L, (long)l);
                                        }
                                        if (callSite == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw cb_0.g("\u00e0", (Object)matchException, (long)8788096857918814343L, (long)l);
                                    }
                                    cL2 = cL3;
                                    if (callSite3 != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw cb_0.g("\u00e0", (Object)matchException, (long)8788096857918814343L, (long)l);
                                }
                                bl = cL2.f;
                            }
                            catch (MatchException matchException) {
                                throw cb_0.g("\u00e0", (Object)matchException, (long)8788096857918814343L, (long)l);
                            }
                        }
                        if (bl) break block13;
                        cL2 = cL3;
                    }
                    cL2.f = 1;
                }
                if (callSite3 == null) continue;
            }
            callSite = cb_0.g("o", (Object)this.k, (Object)new cL(string, string2, x_02, l2), (long)8787620640666896406L, (long)l);
        }
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cb_0.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                cb_0.K[n] = clazz = Class.forName(L[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void q(Object[] objectArray) {
        cb_0 cb_02;
        long l;
        Matrix4f matrix4f;
        block10: {
            block11: {
                block9: {
                    float f;
                    block8: {
                        matrix4f = (Matrix4f)objectArray[0];
                        long l2 = (Long)objectArray[1];
                        l = l2 ^ 0L;
                        CallSite callSite = cb_0.g("\u00e0", (long)-3301383447699603388L, (long)l2);
                        try {
                            try {
                                try {
                                    float f10 = this.g - 0.0f;
                                    f = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                    if (callSite != null) break block8;
                                    if (f <= 0) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw cb_0.g("\u00e0", (Object)matchException, (long)-3302395931715464359L, (long)l2);
                                }
                                cb_02 = this;
                                if (callSite != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw cb_0.g("\u00e0", (Object)matchException, (long)-3302395931715464359L, (long)l2);
                            }
                            float f11 = cb_02.h - 0.0f;
                            f = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw cb_0.g("\u00e0", (Object)matchException, (long)-3302395931715464359L, (long)l2);
                        }
                    }
                    if (f > 0) break block11;
                }
                return;
            }
            cb_02 = this;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = matrix4f;
        super.q(objectArray2);
    }

    public static void r(Object[] objectArray) {
        block9: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            dV dV2;
            block6: {
                block7: {
                    dV2 = (dV)objectArray[0];
                    l2 = (Long)objectArray[1];
                    long l3 = l2 = v ^ l2;
                    long l4 = l3 ^ 0x74F8E087A11FL;
                    l = l3 ^ 0x647B08856406L;
                    callSite2 = cb_0.g("\u00e0", (long)37835121745793773L, (long)l2);
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        callSite = cb_0.g("o", (Object)a, (Object)objectArray2, (long)37415699871707869L, (long)l2);
                        if (callSite2 != null) break block6;
                        if (callSite != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw cb_0.g("\u00e0", (Object)matchException, (long)36806756480074224L, (long)l2);
                    }
                    return;
                }
                callSite = cb_0.g("o", (Object)dV2, (long)37905657726435532L, (long)l2);
            }
            try {
                block8: {
                    try {
                        if (callSite == false) break block8;
                        Object[] objectArray3 = new Object[4];
                        objectArray3[3] = l;
                        objectArray3[2] = x_0.SUCCESS;
                        objectArray3[1] = cb_0.a("c", (int)11069, (long)(0x7F89FAEA85169441L ^ l2));
                        objectArray3[0] = cb_0.g("o", (Object)dV2, (long)36785643791814322L, (long)l2);
                        cb_0.g("o", (Object)a, (Object)objectArray3, (long)37438533662709271L, (long)l2);
                        if (callSite2 == null) break block9;
                    }
                    catch (MatchException matchException) {
                        throw cb_0.g("\u00e0", (Object)matchException, (long)36806756480074224L, (long)l2);
                    }
                }
                Object[] objectArray4 = new Object[4];
                objectArray4[3] = l;
                objectArray4[2] = x_0.ERROR;
                objectArray4[1] = cb_0.a("c", (int)27392, (long)(0x364999AF24FD47AL ^ l2));
                objectArray4[0] = cb_0.g("o", (Object)dV2, (long)36785643791814322L, (long)l2);
                cb_0.g("o", (Object)a, (Object)objectArray4, (long)37438533662709271L, (long)l2);
            }
            catch (MatchException matchException) {
                throw cb_0.g("\u00e0", (Object)matchException, (long)36806756480074224L, (long)l2);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cb_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cb_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(cb_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cb_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


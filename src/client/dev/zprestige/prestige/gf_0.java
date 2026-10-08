/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.g0;
import dev.zprestige.prestige.ge_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.gf
 */
public class gf_0 {
    public static final ge_0 a;
    public static final ge_0 b;
    public static final ge_0 c;
    public static final ge_0 d;
    public static final ge_0 e;
    public static final ge_0 f;
    public static final ge_0 g;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = hc.a(-3537823122075425908L, 2771771826148694844L, MethodHandles.lookup().lookupClass()).a(134795508011491L) ^ 138130484782536L;
                var13_1 = var11 ^ 76604088248438L;
                var1_2 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_3 = 1; var2_3 < 8; ++var2_3) {
                    v2 = v2;
                    v2[var2_3] = (byte)(var11 << var2_3 * 8 >>> 56);
                }
                var1_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_4 = new long[4];
                var4_5 = 0;
                var5_6 = "\u00d5\u0005\u00e3\tb7g\u00e1\u00fd\u00de\u001a\rp\u00ad5\u0095";
                var6_7 = "\u00d5\u0005\u00e3\tb7g\u00e1\u00fd\u00de\u001a\rp\u00ad5\u0095".length();
                var3_8 = 0;
                while (true) {
                    var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                    v3 = var0_4;
                    v4 = var4_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    var5_6 = "\u00de\u00ee$=r\u00ab\u00ae:\u0091\u00aa((\u0018\u00aa\u00d9O";
                    var6_7 = "\u00de\u00ee$=r\u00ab\u00ae:\u0091\u00aa((\u0018\u00aa\u00d9O".length();
                    var3_8 = 0;
                    while (true) {
                        var7_9 = var5_6.substring(var3_8, var3_8 += 8).getBytes("ISO-8859-1");
                        v3 = var0_4;
                        v4 = var4_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_8 < var6_7) ** continue;
                    break block9;
                    break;
                }
            }
            var8_10 = v5;
            var10_11 = var1_2.doFinal(new byte[]{(byte)(var8_10 >>> 56), (byte)(var8_10 >>> 48), (byte)(var8_10 >>> 40), (byte)(var8_10 >>> 32), (byte)(var8_10 >>> 24), (byte)(var8_10 >>> 16), (byte)(var8_10 >>> 8), (byte)var8_10});
            v7 = ((long)var10_11[0] & 255L) << 56 | ((long)var10_11[1] & 255L) << 48 | ((long)var10_11[2] & 255L) << 40 | ((long)var10_11[3] & 255L) << 32 | ((long)var10_11[4] & 255L) << 24 | ((long)var10_11[5] & 255L) << 16 | ((long)var10_11[6] & 255L) << 8 | (long)var10_11[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl70:
                // 1 sources

                ** continue;
            }
        }
        gf_0.a = new ge_0(new g0[]{new g0(3, (int)var0_4[0], 4, false)}, var13_1);
        gf_0.b = new ge_0(new g0[]{new g0(3, (int)var0_4[1], 4, false), new g0(4, (int)var0_4[3], 1, true)}, var13_1);
        gf_0.c = new ge_0(new g0[]{new g0(3, (int)var0_4[1], 4, false), new g0(4, (int)var0_4[2], 1, true), new g0(2, (int)var0_4[1], 4, false)}, var13_1);
        gf_0.d = new ge_0(new g0[]{new g0(3, (int)var0_4[1], 4, false), new g0(3, (int)var0_4[1], 4, false), new g0(4, (int)var0_4[2], 1, true), new g0(2, (int)var0_4[1], 4, false)}, var13_1);
        gf_0.e = new ge_0(new g0[]{new g0(3, (int)var0_4[1], 4, false), new g0(2, (int)var0_4[1], 4, false), new g0(2, (int)var0_4[1], 4, false), new g0(4, (int)var0_4[2], 1, true)}, var13_1);
        gf_0.f = new ge_0(new g0[]{new g0(3, (int)var0_4[1], 4, false), new g0(2, (int)var0_4[1], 4, false)}, var13_1);
        gf_0.g = new ge_0(new g0[]{new g0(3, (int)var0_4[1], 4, false), new g0(2, (int)var0_4[1], 4, false), new g0(2, (int)var0_4[1], 4, false)}, var13_1);
    }
}


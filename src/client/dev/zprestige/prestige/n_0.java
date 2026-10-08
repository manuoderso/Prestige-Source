/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.n
 */
public final class n_0
extends Enum {
    public static final n_0 LINEAR;
    public static final n_0 SINE_IN;
    public static final n_0 SINE_OUT;
    public static final n_0 SINE_IN_OUT;
    public static final n_0 CUBIC_IN;
    public static final n_0 CUBIC_OUT;
    public static final n_0 CUBIC_IN_OUT;
    public static final n_0 QUAD_IN;
    public static final n_0 QUAD_OUT;
    public static final n_0 QUAD_IN_OUT;
    public static final n_0 QUART_IN;
    public static final n_0 QUART_OUT;
    public static final n_0 QUART_IN_OUT;
    public static final n_0 QUINT_IN;
    public static final n_0 QUINT_OUT;
    public static final n_0 QUINT_IN_OUT;
    public static final n_0 CIRC_IN;
    public static final n_0 CIRC_OUT;
    public static final n_0 CIRC_IN_OUT;
    public static final n_0 EXPO_IN;
    public static final n_0 EXPO_OUT;
    public static final n_0 EXPO_IN_OUT;
    public static final n_0 ELASTIC_IN;
    public static final n_0 ELASTIC_OUT;
    public static final n_0 ELASTIC_IN_OUT;
    public static final n_0 BACK_IN;
    public static final n_0 BACK_OUT;
    public static final n_0 BACK_IN_OUT;
    private final DoubleUnaryOperator a;
    private static final n_0[] b;
    private static final long c;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] g;
    private static final String[] h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n_0() {
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
                        n_0.c = hc.a(8755366413072454123L, -7704111163851247396L, MethodHandles.lookup().lookupClass()).a(84202431297533L);
                        var20 = n_0.c ^ 78759806436544L;
                        var22_1 = var20 ^ 51290414302833L;
                        n_0.g = new Object[22];
                        n_0.h = new String[22];
                        n_0.a();
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
                        var11_4 = new String[28];
                        var17_5 = 0;
                        var16_6 = "\u0013/\u00bd\u00c4\u00e7\u0094|[\u0010\u00e0\u00f4\u009f\u00bb\u0088\u00c9\u00df\u00f6\u008eY\u00d1\u00f0N\u00c3H7\u0010\u008a\u00d3\u00ce\u00f6\u00f6R\u007f\u00e5\u00c8]\u00e9\u00fd\u00d5c\u00c9\u00a2\bP\r\u009f\u0011U\u00c8\u0001;\u0010Cg\u00ccjxS\u00f4\u00c5\u00d7p\u00ef\u00ab\u00f0\u0013\u0005\u00d0\u0010}\u0088#;\u00f7F\u00fc\r\u00bf\u0093!\u0001Yck\u00ae\b\u00e0#\u009ad'A\u0017P\u0010\u0096\u0014\u0097\u00af\u0092\tR\u00c5\u0081\u00df\u001ef\u0000\r\u00b9}\u0010\u0013 \u000e\u008d.q\u00a9 \u00f8:\u00fb\u00bfu\u00ca\u00b0B\u0010?6\u00f68=\u00c5\u00c8\u0019K\u008b\u00f54\u008f\u0095\u00164\u0010Cg\u00ccjxS\u00f4\u00c5\u00de\u001a\u0080\u001b/\u00f6\b*\u0010\u00c1\u00975)\u00bf\u001b\u0098\u00b6\u00b0\u0080\u008ca\u0006\u00a0d(\b\fuK\u00e5\\\b\u0012\u0005\u0010$\f\u00ab\u00f3\"\u0013\u00e9\u00f8\u00a9\u00a0]1\u00a0\u009e\u00c4_\u0010z\u001e\u00cd\u00ec\u00cd|\u00e4\u0095\u0006\u0003\u00efE\u00bcV7\u0099\bY\u009dy\u00d6\u00b5\u009b\u0003\u008c\u0010}\u0088#;\u00f7F\u00fc\r\u00fc\u00b7\u00029P\u00f2\u00cf\u00d9\u0010\u00e4x\u00des\u00faX`\u00b1Yl\u001fN\u00bb\u0096s{\u0010\u00e4x\u00des\u00faX`\u00b1g\u0081\u007fVk\u008d\u0007<\u00100[\u00b2\u00e8=\u00cf\r\u00c1X\u0016\t\u00d2D\r\u0095\u00e2\u0010\u00e4x\u00des\u00faX`\u00b1\u00af\u00b2<\u00a2\u00a0\u00ba08\u0010\u00d4\u00aaI\u00e9r#\u0084\u00ea\u00c89\u001f\u00b1\u00bf\u00c7\u00c2\u009c\u0010w\u0002N)\u0080\u009fD\u00a6i\u0095\u00a5l\u00ae\u0086\u00ac%\u0010\u008e\u00e2\u0014\u0088\u0010\u009a\u008ajE\u008a\u00e8X\u00fa\u0000h\u00a5\u0010\u00a7}\u0094\u00d0up2w8\u00e7C\u00ce\u0011.z\u00f4\u0010\u00c1\u00975)\u00bf\u001b\u0098\u00b6M\u00d3u[o\u00f4\u00b8\u00e6";
                        var18_7 = "\u0013/\u00bd\u00c4\u00e7\u0094|[\u0010\u00e0\u00f4\u009f\u00bb\u0088\u00c9\u00df\u00f6\u008eY\u00d1\u00f0N\u00c3H7\u0010\u008a\u00d3\u00ce\u00f6\u00f6R\u007f\u00e5\u00c8]\u00e9\u00fd\u00d5c\u00c9\u00a2\bP\r\u009f\u0011U\u00c8\u0001;\u0010Cg\u00ccjxS\u00f4\u00c5\u00d7p\u00ef\u00ab\u00f0\u0013\u0005\u00d0\u0010}\u0088#;\u00f7F\u00fc\r\u00bf\u0093!\u0001Yck\u00ae\b\u00e0#\u009ad'A\u0017P\u0010\u0096\u0014\u0097\u00af\u0092\tR\u00c5\u0081\u00df\u001ef\u0000\r\u00b9}\u0010\u0013 \u000e\u008d.q\u00a9 \u00f8:\u00fb\u00bfu\u00ca\u00b0B\u0010?6\u00f68=\u00c5\u00c8\u0019K\u008b\u00f54\u008f\u0095\u00164\u0010Cg\u00ccjxS\u00f4\u00c5\u00de\u001a\u0080\u001b/\u00f6\b*\u0010\u00c1\u00975)\u00bf\u001b\u0098\u00b6\u00b0\u0080\u008ca\u0006\u00a0d(\b\fuK\u00e5\\\b\u0012\u0005\u0010$\f\u00ab\u00f3\"\u0013\u00e9\u00f8\u00a9\u00a0]1\u00a0\u009e\u00c4_\u0010z\u001e\u00cd\u00ec\u00cd|\u00e4\u0095\u0006\u0003\u00efE\u00bcV7\u0099\bY\u009dy\u00d6\u00b5\u009b\u0003\u008c\u0010}\u0088#;\u00f7F\u00fc\r\u00fc\u00b7\u00029P\u00f2\u00cf\u00d9\u0010\u00e4x\u00des\u00faX`\u00b1Yl\u001fN\u00bb\u0096s{\u0010\u00e4x\u00des\u00faX`\u00b1g\u0081\u007fVk\u008d\u0007<\u00100[\u00b2\u00e8=\u00cf\r\u00c1X\u0016\t\u00d2D\r\u0095\u00e2\u0010\u00e4x\u00des\u00faX`\u00b1\u00af\u00b2<\u00a2\u00a0\u00ba08\u0010\u00d4\u00aaI\u00e9r#\u0084\u00ea\u00c89\u001f\u00b1\u00bf\u00c7\u00c2\u009c\u0010w\u0002N)\u0080\u009fD\u00a6i\u0095\u00a5l\u00ae\u0086\u00ac%\u0010\u008e\u00e2\u0014\u0088\u0010\u009a\u008ajE\u008a\u00e8X\u00fa\u0000h\u00a5\u0010\u00a7}\u0094\u00d0up2w8\u00e7C\u00ce\u0011.z\u00f4\u0010\u00c1\u00975)\u00bf\u001b\u0098\u00b6M\u00d3u[o\u00f4\u00b8\u00e6".length();
                        var15_8 = 8;
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
                            var11_4[var17_5++] = n_0.a(var19_10).intern();
                            if ((var14_9 += var15_8) < var18_7) {
                                var15_8 = var16_6.charAt(var14_9);
                                ** continue;
                            }
                            var16_6 = "d\u0097\u009a\u00e1<\u00b0\u00f4\u00dc\u00d7\u00e6~\u00ce\u0018!\u0000\u00f9\b\u00e3\u00c0'?\u00cd>\u00b9\u0099";
                            var18_7 = "d\u0097\u009a\u00e1<\u00b0\u00f4\u00dc\u00d7\u00e6~\u00ce\u0018!\u0000\u00f9\b\u00e3\u00c0'?\u00cd>\u00b9\u0099".length();
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
                            var11_4[var17_5++] = n_0.a(var19_10).intern();
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
                n_0.f = new HashMap<K, V>(13);
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
                var6_13 = new long[45];
                var3_14 = 0;
                var4_15 = "\u00c2\u00f8~9m\u008e\u00acgP\u00a1\r[\u00c5&\u00d6\u00b9q\u00c6\u00f1\u0084\u0001\u00d1\u0082\u0006@2\u00be66Q3\u00d7\u00ac\u0006_\u00b9h9\u0096Z\u0019\u00a0\u00a3\u0095\u0081\r\u00e0\u00d0\u0014g\u00b1\u00f0:t\u0092\u00c3].g2\u0089S\u0099!;\u00ed3\u00bbMEX@\u0000I\u008b\u00d0~\u00a0\u008b\u0012O3\u00d02|\u00cb\u0003\u00ef\u00e6\u0013cK\u00e1d\u0010^\u000e\u00f0\u00f2@\u0090Jk\u001cT#\u00174\nd\u00b3j}\u009c\u00d0\u00c3:\u009e\u00b6*K9a\u00c9\u00bf\u00a3\u00fdt\u00a1\u0001Hk\u000bA\u00c7\u009be\u001b\u00eb\u00d3\u0097\u00cf\u00e2\u00ce\u00f7\u00da\u00de\u0011\u008ah\u00c2\u00c1\u001819\u00b0\u0094\u0019hVy\u00cf\"\u00a2\u000b\u0018\u0091\u0005\u00d5\u0004\u00fc\u00b6\u00cf\u001d5\u00ff\u00f2\u0017\u008e\u00f3\u00d2\u009e\u001aA\u00d2\u00c6\u00e0\u00d3HD\u0080\u00d8\u0081\u00b6\r\u00f5\\\u00f3-\f\u00c0'\u00df\u00bf\u007f\u00aa\u00f0&\u007f#p\u0084\u001f\u00da6\u00d3Fu\u0092\u008aE{\u0006s)@\u00b9C\u0017\u00a7\bZ\u00c0\u00f2^\u00c6\u00bd\u00b4^\u0084-\u0013\u00a0\u00d1\u00a8 \b%\u00f5y\u00fe\u0000\u00f3\u0081T#m\u00a4\u00e3\u00e1\u00db\\\u00fb\u00fc\u0092r}\u0000\u009e:?\u00a8\u0095\u00edq\u00f4\u0095\u009e\n\u0098\u00c1\u00f32hL\u00dd\u000b\u00e8\u0094<\u009di\u00d1\u00a5!VF\u00c9}\u00c7\u0011\u00d3\u00cd\u00b1\u00fb(\u0001^\u0019\"\u00f1G\u000fW\u00baG\u00b8\u00c6#\u00af\u0080\u0098\u00e0\u00d9c\u008a\u000b^\n\u0095\u00a8\u0091\u00d8\u00aa\u0092\u0010\u0097\u00f0\u00cf\u00ech\u008cY\u00cf";
                var5_16 = "\u00c2\u00f8~9m\u008e\u00acgP\u00a1\r[\u00c5&\u00d6\u00b9q\u00c6\u00f1\u0084\u0001\u00d1\u0082\u0006@2\u00be66Q3\u00d7\u00ac\u0006_\u00b9h9\u0096Z\u0019\u00a0\u00a3\u0095\u0081\r\u00e0\u00d0\u0014g\u00b1\u00f0:t\u0092\u00c3].g2\u0089S\u0099!;\u00ed3\u00bbMEX@\u0000I\u008b\u00d0~\u00a0\u008b\u0012O3\u00d02|\u00cb\u0003\u00ef\u00e6\u0013cK\u00e1d\u0010^\u000e\u00f0\u00f2@\u0090Jk\u001cT#\u00174\nd\u00b3j}\u009c\u00d0\u00c3:\u009e\u00b6*K9a\u00c9\u00bf\u00a3\u00fdt\u00a1\u0001Hk\u000bA\u00c7\u009be\u001b\u00eb\u00d3\u0097\u00cf\u00e2\u00ce\u00f7\u00da\u00de\u0011\u008ah\u00c2\u00c1\u001819\u00b0\u0094\u0019hVy\u00cf\"\u00a2\u000b\u0018\u0091\u0005\u00d5\u0004\u00fc\u00b6\u00cf\u001d5\u00ff\u00f2\u0017\u008e\u00f3\u00d2\u009e\u001aA\u00d2\u00c6\u00e0\u00d3HD\u0080\u00d8\u0081\u00b6\r\u00f5\\\u00f3-\f\u00c0'\u00df\u00bf\u007f\u00aa\u00f0&\u007f#p\u0084\u001f\u00da6\u00d3Fu\u0092\u008aE{\u0006s)@\u00b9C\u0017\u00a7\bZ\u00c0\u00f2^\u00c6\u00bd\u00b4^\u0084-\u0013\u00a0\u00d1\u00a8 \b%\u00f5y\u00fe\u0000\u00f3\u0081T#m\u00a4\u00e3\u00e1\u00db\\\u00fb\u00fc\u0092r}\u0000\u009e:?\u00a8\u0095\u00edq\u00f4\u0095\u009e\n\u0098\u00c1\u00f32hL\u00dd\u000b\u00e8\u0094<\u009di\u00d1\u00a5!VF\u00c9}\u00c7\u0011\u00d3\u00cd\u00b1\u00fb(\u0001^\u0019\"\u00f1G\u000fW\u00baG\u00b8\u00c6#\u00af\u0080\u0098\u00e0\u00d9c\u008a\u000b^\n\u0095\u00a8\u0091\u00d8\u00aa\u0092\u0010\u0097\u00f0\u00cf\u00ech\u008cY\u00cf".length();
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
                    var4_15 = "\u00d0\u009f\u0084\u009d\u009f\u0085+I\n\u00f4Z\u0019\u00f1:\u0084Q";
                    var5_16 = "\u00d0\u009f\u0084\u009d\u009f\u0085+I\n\u00f4Z\u0019\u00f1:\u0084Q".length();
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
        n_0.d = var6_13;
        n_0.e = new Integer[45];
        n_0.LINEAR = new n_0(var11_4[12], 0, (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$0(double ), (D)D)());
        n_0.SINE_IN = new n_0(var11_4[6], 1, (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$1(double ), (D)D)());
        n_0.SINE_OUT = new n_0(var11_4[24], 2, (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$2(double ), (D)D)());
        n_0.SINE_IN_OUT = new n_0(var11_4[7], 3, (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$3(double ), (D)D)());
        n_0.CUBIC_IN = new n_0(var11_4[11], 4, (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$4(double ), (D)D)());
        n_0.CUBIC_OUT = new n_0(var11_4[22], 5, (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$5(double ), (D)D)());
        n_0.CUBIC_IN_OUT = new n_0(var11_4[25], (int)n_0.a("w", (int)24055, (long)(5335126140379382328L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$6(double ), (D)D)());
        n_0.QUAD_IN = new n_0(var11_4[15], (int)n_0.a("w", (int)12189, (long)(478019998400327766L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$7(double ), (D)D)());
        n_0.QUAD_OUT = new n_0(var11_4[1], (int)n_0.a("w", (int)18175, (long)(4052733552711162136L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$8(double ), (D)D)());
        n_0.QUAD_IN_OUT = new n_0(var11_4[13], (int)n_0.a("w", (int)29254, (long)(3370874344101703093L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$9(double ), (D)D)());
        n_0.QUART_IN = new n_0(var11_4[5], (int)n_0.a("w", (int)27693, (long)(7377150908463281099L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$10(double ), (D)D)());
        n_0.QUART_OUT = new n_0(var11_4[26], (int)n_0.a("w", (int)1150, (long)(2844894867731487623L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$11(double ), (D)D)());
        n_0.QUART_IN_OUT = new n_0(var11_4[16], (int)n_0.a("w", (int)22756, (long)(6160718868860913438L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$12(double ), (D)D)());
        n_0.QUINT_IN = new n_0(var11_4[4], (int)n_0.a("w", (int)32558, (long)(2879217580860825824L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$13(double ), (D)D)());
        n_0.QUINT_OUT = new n_0(var11_4[2], (int)n_0.a("w", (int)29228, (long)(7295266447192878548L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$14(double ), (D)D)());
        n_0.QUINT_IN_OUT = new n_0(var11_4[10], (int)n_0.a("w", (int)4174, (long)(4672126862251855747L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$15(double ), (D)D)());
        n_0.CIRC_IN = new n_0(var11_4[0], (int)n_0.a("w", (int)13286, (long)(5281798534047968259L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$16(double ), (D)D)());
        n_0.CIRC_OUT = new n_0(var11_4[8], (int)n_0.a("w", (int)6371, (long)(7950907671873259284L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$17(double ), (D)D)());
        n_0.CIRC_IN_OUT = new n_0(var11_4[9], (int)n_0.a("w", (int)22961, (long)(67100552025294400L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$18(double ), (D)D)());
        n_0.EXPO_IN = new n_0(var11_4[3], (int)n_0.a("w", (int)13317, (long)(4916748439120948203L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$19(double ), (D)D)());
        n_0.EXPO_OUT = new n_0(var11_4[19], (int)n_0.a("w", (int)4935, (long)(61945856024644772L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$20(double ), (D)D)());
        n_0.EXPO_IN_OUT = new n_0(var11_4[21], (int)n_0.a("w", (int)15804, (long)(5144928945488962136L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$21(double ), (D)D)());
        n_0.ELASTIC_IN = new n_0(var11_4[17], (int)n_0.a("w", (int)5160, (long)(2409020706297580521L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$22(double ), (D)D)());
        n_0.ELASTIC_OUT = new n_0(var11_4[18], (int)n_0.a("w", (int)1582, (long)(7588813850402134510L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$23(double ), (D)D)());
        n_0.ELASTIC_IN_OUT = new n_0(var11_4[20], (int)n_0.a("w", (int)18791, (long)(854422732373579399L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$24(double ), (D)D)());
        n_0.BACK_IN = new n_0(var11_4[27], (int)n_0.a("w", (int)4719, (long)(1720379155502304654L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$25(double ), (D)D)());
        n_0.BACK_OUT = new n_0(var11_4[23], (int)n_0.a("w", (int)11349, (long)(6800794905164460986L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$26(double ), (D)D)());
        n_0.BACK_IN_OUT = new n_0(var11_4[14], (int)n_0.a("w", (int)1755, (long)(2008269311926737170L ^ var20)), (DoubleUnaryOperator)LambdaMetafactory.metafactory(null, null, null, (D)D, lambda$static$27(double ), (D)D)());
        v15 = new Object[1];
        v15[0] = var22_1;
        n_0.b = n_0.b("H", (Object)v15, (long)-7811719337246003049L, (long)var20);
    }

    public static n_0[] values() {
        return (n_0[])b.clone();
    }

    public static n_0 valueOf(String string, long l) {
        l = c ^ l;
        return (n_0)((Object)n_0.b("H", n_0.class, (Object)string, (long)9118394870904846445L, (long)l));
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = n_0.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                n_0.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = n_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = n_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = n_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = n_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = n_0.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = n_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = n_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = n_0.a(clazz3, string2, clazz2)) != null) {
                    n_0.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = n_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        n_0.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = n_0.b(914189406452820L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = n_0.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = n_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = n_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = n_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        n_0.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = n_0.b(914189406452820L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = n_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        n_0.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = n_0.b(914189406452820L, 0L);
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

    public double a(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        return (double)n_0.b("s", (Object)this.a, (double)d, (long)-1559605118077394079L, (long)l);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC7E;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/n", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            n_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = n_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static n_0[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        n_0[] n_0Array = new n_0[n_0.a("w", (int)20291, (long)(0x465AED8AA9398196L ^ l))];
        n_0Array[0] = LINEAR;
        n_0Array[1] = SINE_IN;
        n_0Array[2] = SINE_OUT;
        n_0Array[3] = SINE_IN_OUT;
        n_0Array[4] = CUBIC_IN;
        n_0Array[5] = CUBIC_OUT;
        n_0Array[n_0.a("w", (int)4599, (long)(0x56B834442F1BDF10L ^ l))] = CUBIC_IN_OUT;
        n_0Array[n_0.a("w", (int)20824, (long)(0x28FEF045754C1F9FL ^ l))] = QUAD_IN;
        n_0Array[n_0.a("w", (int)15115, (long)(0x7B588EB9B2EB75D3L ^ l))] = QUAD_OUT;
        n_0Array[n_0.a("w", (int)30836, (long)(0x5544301ECF2C36AFL ^ l))] = QUAD_IN_OUT;
        n_0Array[n_0.a("w", (int)7656, (long)(0x187B959E4B545320L ^ l))] = QUART_IN;
        n_0Array[n_0.a("w", (int)5062, (long)(0x29BB00B66A40DD0BL ^ l))] = QUART_OUT;
        n_0Array[n_0.a("w", (int)22905, (long)(0x7E526F7AFFCD979FL ^ l))] = QUART_IN_OUT;
        n_0Array[n_0.a("w", (int)27197, (long)(0x2F5DE9C6EEF524E7L ^ l))] = QUINT_IN;
        n_0Array[n_0.a("w", (int)14405, (long)(0x50883463A14276ACL ^ l))] = QUINT_OUT;
        n_0Array[n_0.a("w", (int)3289, (long)(0x4C91ED058C31C200L ^ l))] = QUINT_IN_OUT;
        n_0Array[n_0.a("w", (int)23674, (long)(0x558A9FEA092F9295L ^ l))] = CIRC_IN;
        n_0Array[n_0.a("w", (int)30575, (long)(0x1B17B50A86F0B9B1L ^ l))] = CIRC_OUT;
        n_0Array[n_0.a("w", (int)29256, (long)(0x18F578C007893CABL ^ l))] = CIRC_IN_OUT;
        n_0Array[n_0.a("w", (int)3338, (long)(0x43ECBD43DE2943C6L ^ l))] = EXPO_IN;
        n_0Array[n_0.a("w", (int)25169, (long)(0x282F3B8674732C82L ^ l))] = EXPO_OUT;
        n_0Array[n_0.a("w", (int)29946, (long)(0x55976FE7830F3A2DL ^ l))] = EXPO_IN_OUT;
        n_0Array[n_0.a("w", (int)655, (long)(0x6CD97EA73A17CC5EL ^ l))] = ELASTIC_IN;
        n_0Array[n_0.a("w", (int)3304, (long)(0x28FF4C1783874227L ^ l))] = ELASTIC_OUT;
        n_0Array[n_0.a("w", (int)17335, (long)(0x5CAD828D13260D79L ^ l))] = ELASTIC_IN_OUT;
        n_0Array[n_0.a("w", (int)31831, (long)(0x6EFEA84E8ADD329EL ^ l))] = BACK_IN;
        n_0Array[n_0.a("w", (int)13572, (long)(0x2C27BDA77E407BE9L ^ l))] = BACK_OUT;
        n_0Array[n_0.a("w", (int)8364, (long)(0x1E716FF46DB6EE7CL ^ l))] = BACK_IN_OUT;
        return n_0Array;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = n_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "nJ\fpk3xJ\t*x$o\u0001\n,t0~F\u001d;?\"B";
        objectArray[1] = "Kj~]n\u001c>JuR\u007fSCRfUv\u001a+";
        objectArray[2] = "k@k\u0014\tc`Oz[jnuI";
        objectArray[3] = Double.TYPE;
        n_0.h[3] = "java/lang/Double";
        objectArray[4] = "\u001fs=>^B\ts8dMU\u001e8;bAA\u000f\u007f,u\n\\";
        objectArray[5] = "s\u0000/R@\u0016x\u000f>\u001d#\u001bm\u00021v\u0016\u0019|\u0011-Z\u0001\u0014";
        objectArray[6] = "7XB\u0003N\u0018BxI\f_W#vB\u0007[\rW";
        objectArray[7] = "\u0000o\\u\u0017\u0019!SJu\u0012C2D]>\u0011E>PLy\u0006RuM\u0003";
        objectArray[8] = "@x\u0019H\u001d\u0019^p\u0003\u0007U\u0019Dz\u001b@\\\u0002\u0004]\u0000\\Q\u0000OL\u0001HA\u0015ei\n[R\u0018Ek";
        objectArray[9] = "?\\I\u007f\u001f\u000e4SX0t\f P";
        objectArray[10] = "\u0011?*9\\\u0019\u001a0;v1\u0019\u001a-/";
        objectArray[11] = "6{\tXD\u0012=t\u0018\u00179\n.s\u0011^";
        objectArray[12] = "]\u001cIxoqV\u0013X7\u000e\u007f]\u0018\\m";
        objectArray[13] = " :L*Q\u0000acJp<\u0010\u001b;W-G\u0007|u\\/\u0005y'wQpNIxzS\u007f<";
        objectArray[14] = "+M7A\u0017x+\u000b)Nwah\u000e0>M's\u001a5DLkpML\u0004Jx\u007f\r6\u0005\u0006{(t";
        objectArray[15] = "s&le\u0015O/)$\u0006\u0011/?8`\u007fFR7x%\u0006";
        objectArray[16] = "\u001a3uSpp[js\t\u001d`!5i\t yPdq\t'\t\u001am5\u000bmxKu5\f\u001d";
        objectArray[17] = "p[M\u0018;(6LDM\u000b.'B\\\u0011L>N\u0019\u001c\u00024<(W\u001e\u001ejP~\u001c\u001d\u0012e)r]\u001aF\u000bn3JELs($C\u0010|";
        objectArray[18] = "\u0003&4>S;\u0003`*13\"XyO{\u000e;Wf5zB8\u0000\u001fu|Q7@et0R`9";
        objectArray[19] = "\"lyu2A\"*gzRH\u007f.\u00020oAv,x1#B!U870Ma/9{3\u001a\u0018";
        objectArray[20] = "taD=fMt'Z2\u0006W)'?x;M !EywNwX\u0005\u007fdA7\"\u00043g\u0016Nb\u0002 hV4cN#?/";
        Object[] objectArray2 = objectArray;
        objectArray[21] = ":\u001fX\u007foW=\f\u0012$\u000fU\u007f\u001eMkFGK\u0001TpkQ\u0007\\\u0014xaE}]X{6<=[KtvF<\u0017H#\u000f";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'b' || c == 'h' || c == '\u00e6') {
                field = n_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = n_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 's' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 28;
            case 1 -> 2;
            case 2 -> 53;
            case 3 -> 59;
            case 4 -> 54;
            case 5 -> 36;
            case 6 -> 52;
            case 7 -> 35;
            case 8 -> 6;
            case 9 -> 13;
            case 10 -> 31;
            case 11 -> 0;
            case 12 -> 51;
            case 13 -> 43;
            case 14 -> 32;
            case 15 -> 55;
            case 16 -> 23;
            case 17 -> 19;
            case 18 -> 4;
            case 19 -> 11;
            case 20 -> 18;
            case 21 -> 58;
            case 22 -> 34;
            case 23 -> 61;
            case 24 -> 29;
            case 25 -> 10;
            case 26 -> 9;
            case 27 -> 22;
            case 28 -> 25;
            case 29 -> 3;
            case 30 -> 47;
            case 31 -> 24;
            case 32 -> 16;
            case 33 -> 12;
            case 34 -> 62;
            case 35 -> 41;
            case 36 -> 45;
            case 37 -> 57;
            case 38 -> 15;
            case 39 -> 1;
            case 40 -> 56;
            case 41 -> 38;
            case 42 -> 44;
            case 43 -> 40;
            case 44 -> 14;
            case 45 -> 20;
            case 46 -> 26;
            case 47 -> 42;
            case 48 -> 30;
            case 49 -> 21;
            case 50 -> 50;
            case 51 -> 49;
            case 52 -> 37;
            case 53 -> 63;
            case 54 -> 39;
            case 55 -> 46;
            case 56 -> 27;
            case 57 -> 7;
            case 58 -> 48;
            case 59 -> 60;
            case 60 -> 8;
            case 61 -> 33;
            case 62 -> 17;
            default -> 5;
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
        n_0.h[n3] = new String(cArray);
        return n3;
    }

    private static double lambda$static$0(double d) {
        return d;
    }

    private static double lambda$static$1(double d) {
        long l = c ^ 0x4571A4E7D4D0L;
        return 1.0 - n_0.b("H", (double)(d * Math.PI / 2.0), (long)4864034807150818102L, (long)l);
    }

    private static double lambda$static$7(double d) {
        return d * d;
    }

    private static double lambda$static$9(double d) {
        double d10;
        block6: {
            Object object;
            double d11;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x536930558C0BL;
                    CallSite callSite = n_0.b("H", (long)1971597183489255152L, (long)l);
                    try {
                        try {
                            d11 = d;
                            object = 0.5;
                            if (callSite != null) break block4;
                            if (!(d11 < object)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)1971284876610258811L, (long)l);
                        }
                        d10 = 2.0 * d * d;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)1971284876610258811L, (long)l);
                    }
                }
                d11 = 1.0;
                object = n_0.b("H", (double)(-2.0 * d + 2.0), (double)2.0, (long)1970998444016023810L, (long)l) / 2.0;
            }
            d10 = d11 - object;
        }
        return d10;
    }

    private static double lambda$static$8(double d) {
        return 1.0 - (1.0 - d) * (1.0 - d);
    }

    private static double lambda$static$16(double d) {
        long l = c ^ 0x47354F1ED224L;
        return 1.0 - n_0.b("H", (double)(1.0 - n_0.b("H", (double)d, (double)2.0, (long)5005030771936159533L, (long)l)), (long)5004618870912582225L, (long)l);
    }

    private static double lambda$static$21(double d) {
        Object object;
        block14: {
            double d10;
            double d11;
            block17: {
                long l;
                block18: {
                    double d12;
                    block15: {
                        CallSite callSite;
                        block16: {
                            block12: {
                                block13: {
                                    l = c ^ 0x7BF08CA8D334L;
                                    callSite = n_0.b("H", (long)4927973358617033167L, (long)l);
                                    try {
                                        try {
                                            double d13 = d - 0.0;
                                            d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (callSite != null) break block12;
                                            if (d12 != false) break block13;
                                        }
                                        catch (MatchException matchException) {
                                            throw n_0.b("H", (Object)matchException, (long)4928136181273139268L, (long)l);
                                        }
                                        object = 0.0;
                                        break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw n_0.b("H", (Object)matchException, (long)4928136181273139268L, (long)l);
                                    }
                                }
                                double d14 = d - 1.0;
                                d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            }
                            try {
                                try {
                                    if (callSite != null) break block15;
                                    if (d12 != false) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw n_0.b("H", (Object)matchException, (long)4928136181273139268L, (long)l);
                                }
                                object = 1.0;
                                break block14;
                            }
                            catch (MatchException matchException) {
                                throw n_0.b("H", (Object)matchException, (long)4928136181273139268L, (long)l);
                            }
                        }
                        try {
                            d11 = d;
                            d10 = 0.5;
                            if (callSite != null) break block17;
                            double d15 = d11 - d10;
                            d12 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)4928136181273139268L, (long)l);
                        }
                    }
                    try {
                        if (d12 >= 0) break block18;
                        object = n_0.b("H", (double)2.0, (double)(20.0 * d - 10.0), (long)4928429195871217213L, (long)l) / 2.0;
                        break block14;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)4928136181273139268L, (long)l);
                    }
                }
                d11 = 2.0 - n_0.b("H", (double)2.0, (double)(-20.0 * d + 10.0), (long)4928429195871217213L, (long)l);
                d10 = 2.0;
            }
            object = d11 / d10;
        }
        return object;
    }

    private static double lambda$static$24(double d) {
        Object object;
        block14: {
            double d10;
            double d11;
            block17: {
                long l;
                block18: {
                    double d12;
                    block15: {
                        CallSite callSite;
                        block16: {
                            block12: {
                                block13: {
                                    l = c ^ 0x79A5F859E862L;
                                    callSite = n_0.b("H", (long)9166426120059732633L, (long)l);
                                    try {
                                        try {
                                            double d13 = d - 0.0;
                                            d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                            if (callSite != null) break block12;
                                            if (d12 != false) break block13;
                                        }
                                        catch (MatchException matchException) {
                                            throw n_0.b("H", (Object)matchException, (long)9165462865790378770L, (long)l);
                                        }
                                        object = 0.0;
                                        break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw n_0.b("H", (Object)matchException, (long)9165462865790378770L, (long)l);
                                    }
                                }
                                double d14 = d - 1.0;
                                d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                            }
                            try {
                                try {
                                    if (callSite != null) break block15;
                                    if (d12 != false) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw n_0.b("H", (Object)matchException, (long)9165462865790378770L, (long)l);
                                }
                                object = 1.0;
                                break block14;
                            }
                            catch (MatchException matchException) {
                                throw n_0.b("H", (Object)matchException, (long)9165462865790378770L, (long)l);
                            }
                        }
                        try {
                            d11 = d;
                            d10 = 0.5;
                            if (callSite != null) break block17;
                            double d15 = d11 - d10;
                            d12 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)9165462865790378770L, (long)l);
                        }
                    }
                    try {
                        if (d12 >= 0) break block18;
                        object = -(n_0.b("H", (double)2.0, (double)(20.0 * d - 10.0), (long)9165755877701999979L, (long)l) * n_0.b("H", (double)((20.0 * d - 11.125) * 1.3962634015954636), (long)9165624542249452473L, (long)l)) / 2.0;
                        break block14;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)9165462865790378770L, (long)l);
                    }
                }
                d11 = (double)(n_0.b("H", (double)2.0, (double)(-20.0 * d + 10.0), (long)9165755877701999979L, (long)l) * n_0.b("H", (double)((20.0 * d - 11.125) * 1.3962634015954636), (long)9165624542249452473L, (long)l) / 2.0);
                d10 = 1.0;
            }
            object = d11 + d10;
        }
        return object;
    }

    private static double lambda$static$25(double d) {
        return 2.70158 * d * d * d - 1.70158 * d * d;
    }

    private static double lambda$static$26(double d) {
        long l = c ^ 0x232766DE4157L;
        return 1.0 + 2.70158 * n_0.b("H", (double)(d - 1.0), (double)3.0, (long)-3024707104294833058L, (long)l) + 1.70158 * n_0.b("H", (double)(d - 1.0), (double)2.0, (long)-3024707104294833058L, (long)l);
    }

    private static double lambda$static$13(double d) {
        return d * d * d * d * d;
    }

    private static double lambda$static$27(double d) {
        Object object;
        block6: {
            double d10;
            Object object2;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x773ECB9F13DDL;
                    CallSite callSite = n_0.b("H", (long)-8896120651341678298L, (long)l);
                    try {
                        try {
                            object2 = d;
                            d10 = 0.5;
                            if (callSite != null) break block4;
                            if (!(object2 < d10)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)-8895368539670652755L, (long)l);
                        }
                        object = n_0.b("H", (double)(2.0 * d), (double)2.0, (long)-8895663748729624876L, (long)l) * (7.189819 * d - 2.5949095) / 2.0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)-8895368539670652755L, (long)l);
                    }
                }
                object2 = n_0.b("H", (double)(2.0 * d - 2.0), (double)2.0, (long)-8895663748729624876L, (long)l) * (3.5949095 * (d * 2.0 - 2.0) + 2.5949095) + 2.0;
                d10 = 2.0;
            }
            object = object2 / d10;
        }
        return object;
    }

    private static double lambda$static$15(double d) {
        double d10;
        block6: {
            Object object;
            double d11;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x61957DC2D4BEL;
                    CallSite callSite = n_0.b("H", (long)4893644561473011269L, (long)l);
                    try {
                        try {
                            d11 = d;
                            object = 0.5;
                            if (callSite != null) break block4;
                            if (!(d11 < object)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)4894950840766504910L, (long)l);
                        }
                        d10 = 16.0 * d * d * d * d * d;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)4894950840766504910L, (long)l);
                    }
                }
                d11 = 1.0;
                object = n_0.b("H", (double)(-2.0 * d + 2.0), (double)5.0, (long)4895226256233816503L, (long)l) / 2.0;
            }
            d10 = d11 - object;
        }
        return d10;
    }

    private static double lambda$static$10(double d) {
        return d * d * d * d;
    }

    private static double lambda$static$11(double d) {
        long l = c ^ 0x16CE0596BC97L;
        return 1.0 - n_0.b("H", (double)(1.0 - d), (double)4.0, (long)3154244887561308574L, (long)l);
    }

    private static double lambda$static$3(double d) {
        long l = c ^ 0x3007781E672EL;
        return (double)(-(n_0.b("H", (double)(Math.PI * d), (long)-1117191138094776120L, (long)l) - 1.0) / 2.0);
    }

    private static double lambda$static$22(double d) {
        double d10;
        block10: {
            Object object;
            double d11;
            block11: {
                long l;
                block12: {
                    double d12;
                    block8: {
                        CallSite callSite;
                        block9: {
                            l = c ^ 0x60438FB5ACFCL;
                            callSite = n_0.b("H", (long)4299730500595582471L, (long)l);
                            try {
                                try {
                                    double d13 = d - 0.0;
                                    d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                    if (callSite != null) break block8;
                                    if (d12 != false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw n_0.b("H", (Object)matchException, (long)4299910752264021900L, (long)l);
                                }
                                d10 = 0.0;
                                break block10;
                            }
                            catch (MatchException matchException) {
                                throw n_0.b("H", (Object)matchException, (long)4299910752264021900L, (long)l);
                            }
                        }
                        try {
                            d11 = d;
                            object = 1.0;
                            if (callSite != null) break block11;
                            double d14 = d11 - object;
                            d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)4299910752264021900L, (long)l);
                        }
                    }
                    try {
                        if (d12 != false) break block12;
                        d10 = 1.0;
                        break block10;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)4299910752264021900L, (long)l);
                    }
                }
                d11 = (double)(-n_0.b("H", (double)2.0, (double)(10.0 * d - 10.0), (long)4300189490423273973L, (long)l));
                object = n_0.b("H", (double)((d * 10.0 - 10.75) * 2.0943951023931953), (long)4300039428477142823L, (long)l);
            }
            d10 = d11 * object;
        }
        return d10;
    }

    private static double lambda$static$18(double d) {
        double d10;
        block6: {
            double d11;
            Object object;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x75B759775D87L;
                    CallSite callSite = n_0.b("H", (long)-3832383035275511940L, (long)l);
                    try {
                        try {
                            object = d;
                            d11 = 0.5;
                            if (callSite != null) break block4;
                            if (!(object < d11)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)-3830505028056606985L, (long)l);
                        }
                        d10 = (1.0 - n_0.b("H", (double)(1.0 - n_0.b("H", (double)(2.0 * d), (double)2.0, (long)-3830801340384221042L, (long)l)), (long)-3832342440461758990L, (long)l)) / 2.0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)-3830505028056606985L, (long)l);
                    }
                }
                object = n_0.b("H", (double)(1.0 - n_0.b("H", (double)(-2.0 * d + 2.0), (double)2.0, (long)-3830801340384221042L, (long)l)), (long)-3832342440461758990L, (long)l) + 1.0;
                d11 = 2.0;
            }
            d10 = object / d11;
        }
        return d10;
    }

    private static double lambda$static$14(double d) {
        long l = c ^ 0x7D6D28282377L;
        return 1.0 - n_0.b("H", (double)(1.0 - d), (double)5.0, (long)-5465599045570292098L, (long)l);
    }

    private static double lambda$static$23(double d) {
        double d10;
        block10: {
            double d11;
            double d12;
            block11: {
                long l;
                block12: {
                    double d13;
                    block8: {
                        CallSite callSite;
                        block9: {
                            l = c ^ 0x5220403B9A26L;
                            callSite = n_0.b("H", (long)968701046637965533L, (long)l);
                            try {
                                try {
                                    double d14 = d - 0.0;
                                    d13 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                    if (callSite != null) break block8;
                                    if (d13 != false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw n_0.b("H", (Object)matchException, (long)970077599270850902L, (long)l);
                                }
                                d10 = 0.0;
                                break block10;
                            }
                            catch (MatchException matchException) {
                                throw n_0.b("H", (Object)matchException, (long)970077599270850902L, (long)l);
                            }
                        }
                        try {
                            d12 = d;
                            d11 = 1.0;
                            if (callSite != null) break block11;
                            double d15 = d12 - d11;
                            d13 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)970077599270850902L, (long)l);
                        }
                    }
                    try {
                        if (d13 != false) break block12;
                        d10 = 1.0;
                        break block10;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)970077599270850902L, (long)l);
                    }
                }
                d12 = (double)(n_0.b("H", (double)2.0, (double)(-10.0 * d), (long)970356314041626415L, (long)l) * n_0.b("H", (double)((d * 10.0 - 0.75) * 2.0943951023931953), (long)970241427508556285L, (long)l));
                d11 = 1.0;
            }
            d10 = d12 + d11;
        }
        return d10;
    }

    private static double lambda$static$4(double d) {
        return d * d * d;
    }

    private static double lambda$static$5(double d) {
        long l = c ^ 0x300B97939401L;
        return 1.0 - n_0.b("H", (double)(1.0 - d), (double)3.0, (long)238699331457786120L, (long)l);
    }

    private static double lambda$static$6(double d) {
        double d10;
        block6: {
            Object object;
            double d11;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x29BD4E65DFDEL;
                    CallSite callSite = n_0.b("H", (long)5226990202563196197L, (long)l);
                    try {
                        try {
                            d11 = d;
                            object = 0.5;
                            if (callSite != null) break block4;
                            if (!(d11 < object)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)5228138151205409966L, (long)l);
                        }
                        d10 = 4.0 * d * d * d;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)5228138151205409966L, (long)l);
                    }
                }
                d11 = 1.0;
                object = n_0.b("H", (double)(-2.0 * d + 2.0), (double)3.0, (long)5228431159362087639L, (long)l) / 2.0;
            }
            d10 = d11 - object;
        }
        return d10;
    }

    private static double lambda$static$19(double d) {
        Object object;
        block6: {
            double d10;
            double d11;
            long l;
            block4: {
                block5: {
                    l = c ^ 0x67CAB7EB8E5L;
                    CallSite callSite = n_0.b("H", (long)3437038322317431326L, (long)l);
                    try {
                        try {
                            d11 = d;
                            d10 = 0.0;
                            if (callSite != null) break block4;
                            if (d11 != d10) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)3437720081354683285L, (long)l);
                        }
                        object = 0.0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)3437720081354683285L, (long)l);
                    }
                }
                d11 = 2.0;
                d10 = 10.0 * d - 10.0;
            }
            object = n_0.b("H", (double)d11, (double)d10, (long)3437427055212826092L, (long)l);
        }
        return (double)object;
    }

    private static double lambda$static$12(double d) {
        double d10;
        block6: {
            Object object;
            double d11;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x666369D77F4CL;
                    CallSite callSite = n_0.b("H", (long)-1721588664627407433L, (long)l);
                    try {
                        try {
                            d11 = d;
                            object = 0.5;
                            if (callSite != null) break block4;
                            if (!(d11 < object)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)-1721399609270029252L, (long)l);
                        }
                        d10 = 8.0 * d * d * d * d;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)-1721399609270029252L, (long)l);
                    }
                }
                d11 = 1.0;
                object = n_0.b("H", (double)(-2.0 * d + 2.0), (double)4.0, (long)-1721129674719966651L, (long)l) / 2.0;
            }
            d10 = d11 - object;
        }
        return d10;
    }

    private static double lambda$static$17(double d) {
        long l = c ^ 0x76C3C49A9193L;
        return (double)n_0.b("H", (double)(1.0 - n_0.b("H", (double)(d - 1.0), (double)2.0, (long)487023240924046490L, (long)l)), (long)487738609985798630L, (long)l);
    }

    private static double lambda$static$20(double d) {
        double d10;
        block6: {
            Object object;
            double d11;
            block4: {
                long l;
                block5: {
                    l = c ^ 0x49D22146763DL;
                    CallSite callSite = n_0.b("H", (long)-2203773651195896634L, (long)l);
                    try {
                        try {
                            d11 = d;
                            object = 1.0;
                            if (callSite != null) break block4;
                            if (d11 != object) break block5;
                        }
                        catch (MatchException matchException) {
                            throw n_0.b("H", (Object)matchException, (long)-2202977521540547251L, (long)l);
                        }
                        d10 = 1.0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw n_0.b("H", (Object)matchException, (long)-2202977521540547251L, (long)l);
                    }
                }
                d11 = 1.0;
                object = n_0.b("H", (double)2.0, (double)(-10.0 * d), (long)-2203247444781710540L, (long)l);
            }
            d10 = d11 - object;
        }
        return d10;
    }

    private static double lambda$static$2(double d) {
        long l = c ^ 0xDC62E8521A6L;
        return (double)n_0.b("H", (double)(d * Math.PI / 2.0), (long)-5262840347263939971L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(n_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(n_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


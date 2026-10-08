/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.az_0;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dA;
import dev.zprestige.prestige.dI;
import dev.zprestige.prestige.dc_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gN;
import dev.zprestige.prestige.ga_0;
import dev.zprestige.prestige.gf_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
import dev.zprestige.prestige.z_0;
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
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dl
 */
public class dl_0
extends dc_0 {
    private static final dl_0 a;
    private static final Map b;
    private final int c;
    private final int d;
    private static final long e;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] l;
    private static final String[] m;

    private dl_0(long l) {
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x37640A210DF2L;
        long l4 = l2 ^ 0x6C1019661E38L;
        long l5 = l2 ^ 0x3D87D09729D8L;
        super((String)((Object)dl_0.a("r", (int)32154, (long)(0x170CC2B1A278E62DL ^ l))), (String)((Object)dl_0.a("r", (int)29003, (long)(0x122CE203CF936AFFL ^ l))), l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = dl_0.a("r", (int)21643, (long)(0x415022253B67CF3DL ^ l));
        this.c = (int)dl_0.c("P", (Object)dl_0.c("P", (Object)this, (Object)new Object[0], (long)-3035974309157723502L, (long)l), (Object)objectArray, (long)-3038785262071303584L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = dl_0.a("r", (int)6252, (long)(0x7038D0B0153703DCL ^ l));
        this.d = (int)dl_0.c("P", (Object)dl_0.c("P", (Object)this, (Object)new Object[0], (long)-3035974309157723502L, (long)l), (Object)objectArray2, (long)-3038785262071303584L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l5;
        objectArray3[1] = 0;
        objectArray3[0] = dl_0.a("r", (int)25389, (long)(0x5BCC2715456F898L ^ l));
        dl_0.c("P", (Object)dl_0.c("P", (Object)this, (Object)new Object[0], (long)-3035974309157723502L, (long)l), (Object)objectArray3, (long)-3035680891878800692L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        dl_0.e = hc.a(-4662735705754685130L, 7824065118574269580L, MethodHandles.lookup().lookupClass()).a(116745337467020L);
                        var20 = dl_0.e ^ 93511342026074L;
                        var22_1 = var20 ^ 26671283189911L;
                        dl_0.l = new Object[102];
                        dl_0.m = new String[102];
                        dl_0.b();
                        dl_0.h = new HashMap<K, V>(13);
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
                        var18_4 = new String[5];
                        var16_5 = 0;
                        var15_6 = "xw\u00c0\b\u00d47f\u00b1\u001fH\u00de\u0019v\u0018\u00ed\u001d\r\n\u009bK\u0016\u0094*c\u00d0FNu\u00f7\u008a^\u00a1\u00bf\u00d6\u0002\u0014u#\u00f0L\t\u0011Y\u00827O\u00e2\u00c8\f\u0005[O\u00063\u0014  I\u00a4\u00d9c\u00e21\u00bd\u00eb\u00ab]\u00d1y\u00e70\u00e6\u00dbR+\u00bd\u00ba\n\u00c5_}^!a\u00c2\u00bf\u0017\u00d1\u008b \u0088\u001a\u00ad\u00daAj=\u00bdc1\u0001\u00d0\u00bb:H\u009a\u007f\u0086\n\u0015\u00eb\u0017\u0002\u0014[\u00afZ\u009bP@^7";
                        var17_7 = "xw\u00c0\b\u00d47f\u00b1\u001fH\u00de\u0019v\u0018\u00ed\u001d\r\n\u009bK\u0016\u0094*c\u00d0FNu\u00f7\u008a^\u00a1\u00bf\u00d6\u0002\u0014u#\u00f0L\t\u0011Y\u00827O\u00e2\u00c8\f\u0005[O\u00063\u0014  I\u00a4\u00d9c\u00e21\u00bd\u00eb\u00ab]\u00d1y\u00e70\u00e6\u00dbR+\u00bd\u00ba\n\u00c5_}^!a\u00c2\u00bf\u0017\u00d1\u008b \u0088\u001a\u00ad\u00daAj=\u00bdc1\u0001\u00d0\u00bb:H\u009a\u007f\u0086\n\u0015\u00eb\u0017\u0002\u0014[\u00afZ\u009bP@^7".length();
                        var14_8 = 56;
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
                            var18_4[var16_5++] = dl_0.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "mt\u00ec\u00f4\u00d2\u00be\u0017\u00db\u00be\u00e3\u00db\u0015H5\u008b=\u0097\u00c87\u00c2\u00c2\u001d\u0087\u0089l8\u00c5\u00a3j\u009ao\u00c4\u0097\u00f4~\u00df\u00f5\u007f\u00e0\u000fYK\u0014\u0094\u00f7\u00b36\u00b7\u00ff\u00c2\u00a2\u00d7\u0004\u00e0\u001fx\u0018_ec\u00c9-^\u00c0}3\u0099\u008cLp\u00f0t\u0014\u00ef\u008aOw\u0003\u008e\u008a\u00dc";
                            var17_7 = "mt\u00ec\u00f4\u00d2\u00be\u0017\u00db\u00be\u00e3\u00db\u0015H5\u008b=\u0097\u00c87\u00c2\u00c2\u001d\u0087\u0089l8\u00c5\u00a3j\u009ao\u00c4\u0097\u00f4~\u00df\u00f5\u007f\u00e0\u000fYK\u0014\u0094\u00f7\u00b36\u00b7\u00ff\u00c2\u00a2\u00d7\u0004\u00e0\u001fx\u0018_ec\u00c9-^\u00c0}3\u0099\u008cLp\u00f0t\u0014\u00ef\u008aOw\u0003\u008e\u008a\u00dc".length();
                            var14_8 = 56;
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
                            var18_4[var16_5++] = dl_0.a(var19_10).intern();
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
                dl_0.f = var18_4;
                dl_0.g = new String[5];
                dl_0.k = new HashMap<K, V>(13);
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
                var6_13 = new long[20];
                var3_14 = 0;
                var4_15 = "\u00f0AH\u00ca6n\u00b1\u0086\u00fa+:\u00dc\u00f8\u00c6\u0000\u0099h\u000ej\u00f0\u007fSI\u00ce >g\u0006R\u00a6\u000b\u00b5p\u009d\u00ae\u0085\u00d7#n\u00e4D\u0083\u0005w\u0083\u00db\u00f54\u00e8\u00b9\u001a\u00e8\u00f1\u0016\u00dd}\u00d4!\u00d2\u00cf\u009fb$2\u00fc\n\u00afL\u008b)\u0003\u00dfo\u00fdK\u00c7z\u00f2\u00ca\u0093\u0087\u008a7M\u00fevZ L\u0083A\u00d2\u0007\u00c3\u0087\u0004&[\u001f\u00a6\u0007\u00cc\u0016\t\f\u00fcZU`>hW\u00d0Y\u0018\u00bc.\u00b3\u0004\u00f6M+\u00c5^\u008cp$t\u00d5\u008b\u00c56{\\\u000f\u0089\u008e<\u00dd\u0099#\u00f4\u0018i";
                var5_16 = "\u00f0AH\u00ca6n\u00b1\u0086\u00fa+:\u00dc\u00f8\u00c6\u0000\u0099h\u000ej\u00f0\u007fSI\u00ce >g\u0006R\u00a6\u000b\u00b5p\u009d\u00ae\u0085\u00d7#n\u00e4D\u0083\u0005w\u0083\u00db\u00f54\u00e8\u00b9\u001a\u00e8\u00f1\u0016\u00dd}\u00d4!\u00d2\u00cf\u009fb$2\u00fc\n\u00afL\u008b)\u0003\u00dfo\u00fdK\u00c7z\u00f2\u00ca\u0093\u0087\u008a7M\u00fevZ L\u0083A\u00d2\u0007\u00c3\u0087\u0004&[\u001f\u00a6\u0007\u00cc\u0016\t\f\u00fcZU`>hW\u00d0Y\u0018\u00bc.\u00b3\u0004\u00f6M+\u00c5^\u008cp$t\u00d5\u008b\u00c56{\\\u000f\u0089\u008e<\u00dd\u0099#\u00f4\u0018i".length();
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
                    var4_15 = "\u0093\u00e1<K\u00c8}\u00ad*R\u00b6\u000e}KO\u00e8.";
                    var5_16 = "\u0093\u00e1<K\u00c8}\u00ad*R\u00b6\u000e}KO\u00e8.".length();
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
        dl_0.i = var6_13;
        dl_0.j = new Integer[20];
        dl_0.a = new dl_0(var22_1);
        dl_0.b = new HashMap<K, V>();
    }

    public static void B(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        float f15 = ((Float)objectArray[9]).floatValue();
        float f16 = ((Float)objectArray[10]).floatValue();
        Color color = (Color)objectArray[11];
        long l = (Long)objectArray[12];
        long l2 = (l = e ^ l) ^ 0x3A79364D7F09L;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = l2;
        objectArray2[14] = z_0.MULTIPLY;
        objectArray2[13] = color;
        objectArray2[12] = new Vector4f(0.0f);
        objectArray2[11] = Float.valueOf(f16);
        objectArray2[10] = Float.valueOf(f15);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)1909482875161662051L, (long)l);
    }

    public static void C(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        float f15 = ((Float)objectArray[9]).floatValue();
        float f16 = ((Float)objectArray[10]).floatValue();
        float f17 = ((Float)objectArray[11]).floatValue();
        Color color = (Color)objectArray[12];
        long l = (Long)objectArray[13];
        long l2 = (l = e ^ l) ^ 0x4D9A2408EDC7L;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = l2;
        objectArray2[14] = z_0.MULTIPLY;
        objectArray2[13] = color;
        objectArray2[12] = new Vector4f(f17);
        objectArray2[11] = Float.valueOf(f16);
        objectArray2[10] = Float.valueOf(f15);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-8596897327548579667L, (long)l);
    }

    public static void D(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        float f15 = ((Float)objectArray[9]).floatValue();
        float f16 = ((Float)objectArray[10]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[11];
        Color color = (Color)objectArray[12];
        long l = (Long)objectArray[13];
        long l2 = (l = e ^ l) ^ 0x7E22AD87CA36L;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = l2;
        objectArray2[14] = z_0.MULTIPLY;
        objectArray2[13] = color;
        objectArray2[12] = vector4f;
        objectArray2[11] = Float.valueOf(f16);
        objectArray2[10] = Float.valueOf(f15);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-5818478278755129508L, (long)l);
    }

    private void F(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        Color color2 = (Color)objectArray[9];
        Color color3 = (Color)objectArray[10];
        Color color4 = (Color)objectArray[11];
        Vector4f vector4f = (Vector4f)objectArray[12];
        z_0 z_02 = (z_0)((Object)objectArray[13]);
        long l = (Long)objectArray[14];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x1AF28C1016L;
        long l4 = l2 ^ 0x406F670A73A3L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = true;
        objectArray2[2] = z_02;
        objectArray2[1] = vector4f;
        objectArray2[0] = bW2;
        CallSite callSite = dl_0.c("P", (Object)this, (Object)objectArray2, (long)4496894680443912316L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0((dt_0)((Object)callSite), (arg_0, arg_1) -> dl_0.lambda$drawGradientInternal$2(color, color2, color3, color4, matrix4f, f, f10, f12, f11, arg_0, arg_1));
        dl_0.c("P", (Object)((ga_0)((Object)dl_0.c("P", (Object)dA.a, (long)4498656976905531042L, (long)l))), (Object)objectArray3, (long)4497472313386838596L, (long)l);
    }

    public static void I(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = e ^ l;
        dl_0.c("P", (Object)b, (long)6157174888278852940L, (long)l);
    }

    public static void e(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = (l = e ^ l) ^ 0x715FC63EC8E3L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = dl_0.c("e", (long)7467050086604545488L, (long)l);
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)7470838442352251263L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = dl_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 57;
            case 2 -> 9;
            case 3 -> 59;
            case 4 -> 62;
            case 5 -> 55;
            case 6 -> 3;
            case 7 -> 8;
            case 8 -> 13;
            case 9 -> 21;
            case 10 -> 47;
            case 11 -> 17;
            case 12 -> 44;
            case 13 -> 33;
            case 14 -> 40;
            case 15 -> 34;
            case 16 -> 4;
            case 17 -> 49;
            case 18 -> 41;
            case 19 -> 6;
            case 20 -> 61;
            case 21 -> 11;
            case 22 -> 39;
            case 23 -> 27;
            case 24 -> 24;
            case 25 -> 46;
            case 26 -> 22;
            case 27 -> 35;
            case 28 -> 32;
            case 29 -> 5;
            case 30 -> 7;
            case 31 -> 54;
            case 32 -> 1;
            case 33 -> 0;
            case 34 -> 63;
            case 35 -> 51;
            case 36 -> 48;
            case 37 -> 10;
            case 38 -> 52;
            case 39 -> 36;
            case 40 -> 12;
            case 41 -> 37;
            case 42 -> 38;
            case 43 -> 31;
            case 44 -> 26;
            case 45 -> 16;
            case 46 -> 60;
            case 47 -> 43;
            case 48 -> 45;
            case 49 -> 18;
            case 50 -> 53;
            case 51 -> 15;
            case 52 -> 56;
            case 53 -> 25;
            case 54 -> 29;
            case 55 -> 20;
            case 56 -> 14;
            case 57 -> 28;
            case 58 -> 58;
            case 59 -> 2;
            case 60 -> 19;
            case 61 -> 50;
            case 62 -> 42;
            default -> 30;
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
        dl_0.m[n3] = new String(cArray);
        return n3;
    }

    public static void i(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x33CEFE78B35FL;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = dl_0.c("e", (long)2025503745946379884L, (long)l);
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)2022676339692890819L, (long)l);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x35FA;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dl_0.j[n2] = n3;
        }
        return j[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dl_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dl_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void b(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = e ^ l) ^ 0x1719FC73359CL;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = color;
        objectArray2[8] = new Vector4f(0.0f);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-7290525440703140864L, (long)l);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d9' || c == '\u00a2' || c == 'e' || c == '\u00a3') {
                field = dl_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dl_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = l;
        l[0] = ".q\tO\u000e\"8q\f\u0015\u001d5/:\u000f\u0013\u0011!>}\u0018\u0004Z1\f";
        objectArray[1] = "m`\u001f\u001f24\u0018@\u0014\u0010#{yN\u001f\u001b'!\r";
        objectArray[2] = "Gs\u000beJ\u00022S\u0000j[MS]\u000ba_\u0017'";
        objectArray[3] = "861\u0006\u001dQM\u0016:\t\f\u001e,\u00181\u0002\bDX";
        objectArray[4] = "%i\u0007X X8|_zaU z";
        objectArray[5] = Integer.TYPE;
        dl_0.m[5] = "java/lang/Integer";
        objectArray[6] = "\f\u001c&IN2y<-F_}\u00182&M['l";
        objectArray[7] = "*RKV\u0002@!]Z\u0019j@/RI";
        objectArray[8] = Float.TYPE;
        dl_0.m[8] = "java/lang/Float";
        objectArray[9] = "-<n\r3zX\u001ce\u0002\"59\u0012n\t&oM";
        objectArray[10] = "\u001f.\u0000Y nj\u000e\u000bV1!\u000b\u0000\u0000]5{\u007f";
        objectArray[11] = "+=\u0003v0T==\u0006,#C*v\u0005*/W;1\u0012=d@#";
        objectArray[12] = "h@\u0010bUN\u001d`\u001bmD\u0001|n\u0010f@[\b";
        objectArray[13] = Void.TYPE;
        dl_0.m[13] = "java/lang/Void";
        objectArray[14] = "\u0018\\yK\u000fLm|rD\u001e\u0003\fryO\u001aYx";
        objectArray[15] = "boy\u0002ZZ\u0017Or\rK\u0015vAy\u0006OO\u0002";
        objectArray[16] = "\u0018R4'4Amr?(%\u000e\f|4#!Tx";
        objectArray[17] = "I\u000e\u0018\u0014I\"<.\u0013\u001bXm] \u0018\u0010\\7)";
        objectArray[18] = "\u0010\u0014/,0F\u0015\u0001$,3A\u001a\b/nrv3W{";
        objectArray[19] = "[f\u0019\u0012c\u007fYxPjls@{\f\bo";
        objectArray[20] = "OsHn!\rYsM42\u001aN8N2>\u000e_\u007fY%u\u0007";
        objectArray[21] = "s\u0001Z\bo4v\u0014Q\bl3y\u001dZJ-\u0004PA\r";
        objectArray[22] = "gC;\bP_bV0\bSXm_;J\u0012oD\u0000m";
        objectArray[23] = "\fh\u0017k$}yH\u001cd52\u0018F\u0017o1hl";
        objectArray[24] = "7\r@[^0!\rE\u0001M'6FF\u0007A3'\u0001Q\u0010\n\"\u0007";
        objectArray[25] = "N\u0002^\\t(;\"USegZ,^Xa=.";
        objectArray[26] = "z-C~m\u0007\u000f\rHq|Hn\u0003Czx\u0012\u001a";
        objectArray[27] = "6XJc[\u001dCxAlJR\"vJgN\bV";
        objectArray[28] = "o(VoO\u0003d'G ,\u000eq!";
        objectArray[29] = "(6fE#@]\u0016mJ2\u000f<\u0018fA6UH";
        objectArray[30] = "B/QK-\"7\u000fZD<mV\u0001QO87\"";
        objectArray[31] = "<\\kQ\u001fE*\\n\u000b\fR=\u0017m\r\u0000F,Pz\u001aKQ;";
        objectArray[32] = "%={:6\u0004P\u001dp5'K1\u0013{>#\u0011E";
        objectArray[33] = "\u0006<9\u0000)F\u0010<<Z:Q\u0007w?\\6E\u00160(K}P6";
        objectArray[34] = "qr\u001aF#\u001bgr\u001f\u001c0\fp9\u001c\u001a<\u0018a~\u000b\rw\rB";
        objectArray[35] = "I?y)\u001aP<\u001fr&\u000b\u001f]\u0011y-\u000fE)";
        objectArray[36] = "]O\u001d{t~KO\u0018!gi\\\u0004\u001b'k}MC\f0 ii";
        objectArray[37] = "%G\u0005}#\u000fPg\u000er2@1i\u0005y6\u001aE";
        objectArray[38] = "FTW#dq3t\\,u>RzW'qd&";
        objectArray[39] = "q@t\u0007K\u0004g@q]X\u0013p\u000br[T\u0007aLeL\u001f\u0013D";
        objectArray[40] = "\u0015h1\f^+`H:\u0003Od\u0001F1\bK>u";
        objectArray[41] = "\f|>E\u0011{\u001a|;\u001f\u0002l\r78\u0019\u000ex\u001cp/\u000eEl;";
        objectArray[42] = "\u0013C!7=I\rK;x^]\t";
        objectArray[43] = "\r\u001e\u0018\bsm\u0013\u0016\u0002G>w\t\u001c\u001b\u001b/}\t\u000b@\b)w\n\u0016\rG\u001cl\b\u0012\u0007\n\u000f}\u0001\u001a\u001c\f3{\u0002";
        objectArray[44] = "\"\u0013\u0001I^y)\u001c\u0010\u0006?w\"\u0017\u0014\\";
        objectArray[45] = "\u000e^\u0014e\u0010W\u0018^\u0011?\u0003@\u000f\u0015\u00129\u000fT\u001eR\u0005.D@\u000b";
        objectArray[46] = "\"\u0012].UMW2V!D\u00026<]*@XB";
        objectArray[47] = "\u0006}v_U$s]}PDk\u0012Sv[@1f";
        objectArray[48] = "~b\u001e\u001f.Lhb\u001bE=[\u007f)\u0018C1Onn\u000fTzXn";
        objectArray[49] = "F,\u001e\u001991X$\u0004Vq1B.\u001c\u0011x*\u0002\u000b\u001d\u0016t0E\"\u0006";
        objectArray[50] = "\u0016Zy2~\u001bczr=oT\u0002ty6k\u000ev";
        objectArray[51] = "\u001ds&g\f\u0013\u000bs#=\u001f\u0004\u001c8 ;\u0013\u0010\r\u007f7,X\u00078";
        objectArray[52] = "n#+\u000b!(\u001b\u0003 \u00040gz\r+\u000f4=\u000e";
        objectArray[53] = "_\"-^\u0004\u0005*\u0002&Q\u0015JK\f-Z\u0011\u0010?";
        objectArray[54] = "r=\u001d|\u0011\\\u0007\u001d\u0016s\u0000\u0013f\u0013\u001dx\u0004I\u0012";
        objectArray[55] = "S\u0015\u0007v\bHE\u0015\u0002,\u001b_R^\u0001*\u0017KC\u0019\u0016=\\YF";
        objectArray[56] = "J#`\u0007`\u0014?\u0003k\bq[^\r`\u0003u\u0001*";
        objectArray[57] = "@tdk-u\u0007w*t\u001cd\u007f6`gqh\u000ec9hzt\u007f4?`|3Cj%w#\r";
        objectArray[58] = "!(F\fr\u001e, \u0001OC\f:\"\u0000M?\n\u001c)1Z8\n;;xM\"\u00000 \u0013]{^mG\t\r9Zc&\u0011\u000b,\u0007]:\u0019W.\u00006*@\tsg";
        objectArray[59] = "J\u0014\u001cN?QLJ\u000fOO\u0006]F\u0010Q&\u0005'\u0011\u0015Y/_\u001bO\u000fNpa";
        objectArray[60] = "\u0017h\tU\f!\u001d)G]o2w`@\u0004\u0002=\u00065\u0019\u000b\t!w9J\u001fW;\u000e3\u000bQ_X";
        objectArray[61] = "ey'\u001904o8i\u0011S!\u0005qnH>(t$7G54\u0005(dSk.|\"%\u001dcM";
        objectArray[62] = "n\u0015n\nwWkW(U\u001d\u0015\u0002\u0014i\u0005#\u0016nM7O\u007f";
        objectArray[63] = "\fz\u0007+~WPi^iB\\j9\u0002z/S\u001bl[u$Ojx\u0004u0]\t>]s%6";
        objectArray[64] = "6.y462*msN7\u000en$|#3\u007f;}s(/\u000e6.y462*msN";
        objectArray[65] = "s@v}\u001bG4C8b*VL\u0002rqGZ=W+~LFL[xj\u0012\\5Q9$\u001a?";
        objectArray[66] = "{\u0010u(?r<\u0013;7\u000exDRq$co5\u0007(+hsDZv3\u007f`+\u0012v)r\n";
        objectArray[67] = "_-v#I=Zo0|#r3,q,\u001d|_u/fA";
        objectArray[68] = "#\t|f\u0017Oa\u000f.\u007fzI3\u0019A{\u001bA3\u0002*kB\u001fne";
        objectArray[69] = "\b?Cck \u0014|I\u0019g\u001cP5Ftnm\u0005lI\u007fr\u001c\b?Cck \u0014|I\u0019";
        objectArray[70] = ")\u0016\u0011N\u0011(\"L\u0018\u0015)  ,\u0007\u0014G(>\u0014X\u0014)t \u001f\u0001K\u0015*:\b^u\u0012+*\u0011_IL1=NaD\u001515\u001b\u000e\f\u0015+8q";
        objectArray[71] = "\r[\u000bW\u0005\u0011QHR\u00159\u0019k\u0018\u000e\u0006T\u0015\u001aMW\t_\tkGOQ\u0001L\n\u001b\\\bCp";
        objectArray[72] = "\u0001C0r&u]Pi0\u001a}g\u00005#wq\u0016Ul,|mgA3,h\u007f\u0004\u0007j*}\u0014";
        objectArray[73] = "v{\\IN\u001dr-\u001c\u0003+\u0017\u0010~V[F\u001ba+\u000fTM\u0007\u0010vQLZ\u0014\u007f>QVW~";
        objectArray[74] = "q5{&\u0016g6b!;\u001d\u001e!\u000f!c\u0015s-~t:\u001ax1\u000fxi\u000e&+vr(@.H";
        objectArray[75] = "QhS\u0007Of\r{\nEsn7+VV\u001ebF~\u000fY\u0015~7i\u0016M\u000f9Jj\u0007]\u000f\u0007";
        objectArray[76] = "zKT>@ h\u0005Gu|uupM2\u001dd|eK>\u0000gkT&u\u0018tq\u0007\u001a+\u0002c.9\u0017r\u0002k{V_r\u0018f\u0011";
        objectArray[77] = "o\u001do\u0010\u001281\u00037\u000bb:\u000bX4\u001a\u000f6z\rm\u0015\u0004*\u000b\u00073B\u00196h\u0003e\u0002SS";
        objectArray[78] = "Cl\u0016$\u000e\u0004\\e\u0017e?R1$A1R]@q\u0018>YA1&\u001e6_\u0006\rx\u0004!\u00008";
        objectArray[79] = "Q\u007fRYe\"T=\u0014\u0006\u000fo=~UV1cQ'\u000b\u001cm";
        objectArray[80] = "\u0018\bg\u0002+)_\u000b)\u001d\u001a\u001f'Jc\u000ew4V\u001f:\u0001|('Bd\u0019k;H\nd\u0003fQ";
        objectArray[81] = "\n\"^\u0006\u0010\u0002\u000f`\u0018YzNf#Y\tDC\nz\u0007C\u0018";
        objectArray[82] = "O\tr0uy\b\n</DNpKv<)d\u0001\u001e/3\"xpCq+5k\u001f\u000bq18\u0001";
        objectArray[83] = "QWP/;}\\_\u0017l\noIU\u0007i\n5\u0011F\u001fye}\u0011\\\u0012\u0013";
        objectArray[84] = "N[Be?]\u0019P\u000f;Ma5plGM\u0005\u001fC_x.R\u0014\u000e\u0001";
        objectArray[85] = ")OQQ\u007f\u001a2\u0011\u0011N\u0018AW\u0015\u0011_uN&@HP~RW\u001d\u0016HiA8U\u0016Rd+";
        objectArray[86] = " >>t\u0003e+d7/;m)\u0004(.Ue7<r!;9)7.q\u0007g3 qO\u00059}g2#\\g7;Nq\u00002s%\"(^x/Ypt\u000b<15)*A`Mgu\u007f\u0005~!>+5Y\u0002|e0>Qm4e*3;";
        objectArray[87] = "rd\u007fI\u001b\u0016n'u3\u0011**nz^\u001e[\u007f7uU\u0002*rd\u007fI\u001b\u0016n'u3";
        objectArray[88] = "1yf&J\u0007fr+x8\u000bgoN\u0006rd1wz)\u0006Xommv8";
        objectArray[89] = "@j]T\u0017f\u0007i\u0013K&^\u007f(YXK{\u000e}\u0000W@g\u007f ^OWt\u0010h^UZ\u001e";
        objectArray[90] = "y5\"\u0005\u0005;h0!\u00039)pv^\u0002\u0002p$q2[\\:x\r`\u0007\t~fa9YC\"\u001a";
        objectArray[91] = "z\u0013HyL}pR\u0006q/i\u001a\u001b\u0001(BakNX'I}\u001aB\u000b3\u0017gcHJ}\u001f\u0004";
        objectArray[92] = "b[\u00152$3h\u001a[:G*\u0002S\\c*/s\u0006\u0005l!3\u0002\nVx\u007f){\u0000\u00176wJ";
        objectArray[93] = "\u00106}.N\u000eW531\u007f\u001f/ty\"\u0012\u0013^! -\u0019\u000f/=!.\u0011\u0017E*$v\u0000v";
        objectArray[94] = "\u000e\b\u001cZSz\u0012K\u0016 SFV\u0002\u0019MV7\u0003[\u0016FJF\u000e\b\u001cZSz\u0012K\u0016 ";
        objectArray[95] = "\u000fVC5>f\u0003\u0007V#TbV[M6\neVAIJj7\u0002\u0002X&3iH^$";
        objectArray[96] = "\u0011H:\u00003&\r\u000b0z0\u001aIB?\u00176k\u001c\u001b0\u001c*\u001a\u0011H:\u00003&\r\u000b0z";
        objectArray[97] = "1\u0013/O/p1\u000fzNPb;' \u0018<Q2\u001d=\u0003*`_V%\u001003c\b?\u0007o\rd\t/\u001en1:\u00138AP<c\u00130\u0014?tc\t=~";
        objectArray[98] = "\u0018[&\u001f\b\"\u0004\u0018,e\u0005\u001e@Q#\b\ro\u0015\b,\u0003\u0011\u001e\u0018[&\u001f\b\"\u0004\u0018,e";
        objectArray[99] = "?\u0000\tp`Fx\u0003GoQO\u0000B\r|<[q\u0017Ts7G\u0000J\nk To\u0002\nq->";
        objectArray[100] = "0JFfSulY\u001f$o}V\tC7\u0002q'\\\u001a8\tmVJ\u0019n\u0001j0\nH2\u001e\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[101] = "t3x\u0003Yype8I<v\u00126r\u0011Q\u007fcc+\u001eZc\u00124-\u0016\\$.j7\u0001\u0003\u001a";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void x(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        Color color2 = (Color)objectArray[8];
        Color color3 = (Color)objectArray[9];
        Color color4 = (Color)objectArray[10];
        Vector4f vector4f = (Vector4f)objectArray[11];
        z_0 z_02 = (z_0)((Object)objectArray[12]);
        long l = (Long)objectArray[13];
        long l2 = (l = e ^ l) ^ 0x6EC389E91742L;
        Object[] objectArray2 = new Object[15];
        objectArray2[14] = l2;
        objectArray2[13] = z_02;
        objectArray2[12] = vector4f;
        objectArray2[11] = color4;
        objectArray2[10] = color3;
        objectArray2[9] = color2;
        objectArray2[8] = color;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-6273688134311036655L, (long)l);
    }

    public static void s(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[8];
        Color color = (Color)objectArray[9];
        z_0 z_02 = (z_0)((Object)objectArray[10]);
        long l = (Long)objectArray[11];
        long l2 = (l = e ^ l) ^ 0x774F98AE227DL;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_02;
        objectArray2[9] = color;
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-8272063669631845407L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void c(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0xC91A07BA16EL;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = color;
        objectArray2[8] = new Vector4f(0.0f);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)1018027049966139634L, (long)l);
    }

    public static void n(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        Color color = (Color)objectArray[10];
        Vector4f vector4f = (Vector4f)objectArray[11];
        long l = (Long)objectArray[12];
        long l2 = (l = e ^ l) ^ 0x610C3FEE1209L;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_0.MULTIPLY;
        objectArray2[11] = vector4f;
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)7251710923674865680L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)7251290949391483580L, (long)l);
    }

    public static void h(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[7];
        Color color = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x794532FBCA45L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = color;
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)7281115403302474713L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = dl_0.e(l, l2);
        Object object = dl_0.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = dl_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dl_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dl_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dl_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dl_0.f(3099491365274540L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dl_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dl_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dl_0.f(3099491365274540L, 0L);
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

    public static void f(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x69A656EB1918L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = color;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-5307871480650350460L, (long)l);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dl_0.e(l, l2);
            object = dl_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                dl_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void l(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        Color color = (Color)objectArray[9];
        Vector4f vector4f = (Vector4f)objectArray[10];
        long l = (Long)objectArray[11];
        long l2 = (l = e ^ l) ^ 0x723D30D2DC6DL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_0.MULTIPLY;
        objectArray2[11] = vector4f;
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)-6140847650363597196L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-6141272160066286376L, (long)l);
    }

    public static void d(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Matrix4f matrix4f = (Matrix4f)objectArray[7];
        Color color = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x214C4B9EE2EFL;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = color;
        objectArray2[8] = new Vector4f(0.0f);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)5594015994686028659L, (long)l);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dl_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dl_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dl_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dl_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private bT a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        bW bW2 = (bW)objectArray[1];
        Vector4f vector4f = (Vector4f)objectArray[2];
        z_0 z_02 = (z_0)((Object)objectArray[3]);
        boolean bl = (Boolean)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = e ^ l) ^ 0x25981DEBE0C1L;
        dI dI2 = new dI(bW2, vector4f, z_02, bl);
        dt_0 dt_02 = (dt_0)((Object)dl_0.c("P", (Object)b, (Object)dI2, arg_0 -> this.lambda$getBuffer$6(bl, bW2, z_02, vector4f, arg_0), (long)4065238675342834639L, (long)l));
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dt_02;
        return dl_0.c("P", (Object)aq_02, (Object)objectArray2, (long)4068617872059080758L, (long)l);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4E79;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dl", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            dl_0.g[n2] = dl_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dl_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private dt_0 a(Object[] objectArray) {
        bW bW2 = (bW)objectArray[0];
        Vector4f vector4f = (Vector4f)objectArray[1];
        z_0 z_02 = (z_0)((Object)objectArray[2]);
        boolean bl = (Boolean)objectArray[3];
        long l = (Long)objectArray[4];
        l = e ^ l;
        dI dI2 = new dI(bW2, vector4f, z_02, bl);
        return (dt_0)((Object)dl_0.c("P", (Object)b, (Object)dI2, arg_0 -> this.lambda$getRenderLayer$4(bl, bW2, z_02, vector4f, arg_0), (long)-5791178662076830716L, (long)l));
    }

    public static void a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        long l = (Long)objectArray[7];
        long l2 = (l = e ^ l) ^ 0x4B67DE813572L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = dl_0.c("e", (long)-7335958873055764415L, (long)l);
        objectArray2[8] = new Vector4f(0.0f);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-7332839019861840658L, (long)l);
    }

    private static int a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = e ^ l;
        int n2 = n >> dl_0.b("g", (int)25115, (long)(0xDB206479A6ACFC4L ^ l)) & dl_0.b("g", (int)7532, (long)(0x1C631919CEB0B0BDL ^ l));
        int n3 = n >> dl_0.b("g", (int)21060, (long)(0x1A81977EB8AC7F9EL ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A679C30CB8838L ^ l));
        int n4 = n >> dl_0.b("g", (int)32173, (long)(0x427BFDBF05F2D079L ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A679C30CB8838L ^ l));
        int n5 = n & dl_0.b("g", (int)9696, (long)(0x342A679C30CB8838L ^ l));
        return n2 << dl_0.b("g", (int)30032, (long)(0x7C9AFA1DD7AE5883L ^ l)) | n5 << dl_0.b("g", (int)20148, (long)(0x6B377368BFDCE378L ^ l)) | n4 << dl_0.b("g", (int)4014, (long)(0x1EBAD02393D5A273L ^ l)) | n3;
    }

    public static void m(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        Color color = (Color)objectArray[10];
        float f15 = ((Float)objectArray[11]).floatValue();
        long l = (Long)objectArray[12];
        long l2 = (l = e ^ l) ^ 0x55B6FB2BFA22L;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_0.MULTIPLY;
        objectArray2[11] = new Vector4f(f15);
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)-8320272685679495109L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-8319566839512700265L, (long)l);
    }

    public static void o(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        Color color = (Color)objectArray[10];
        Color color2 = (Color)objectArray[11];
        Color color3 = (Color)objectArray[12];
        Color color4 = (Color)objectArray[13];
        float f15 = ((Float)objectArray[14]).floatValue();
        boolean bl = (Boolean)objectArray[15];
        long l = (Long)objectArray[16];
        long l2 = (l = e ^ l) ^ 0x2A640607794FL;
        Object[] objectArray2 = new Object[18];
        objectArray2[17] = l2;
        objectArray2[16] = z_0.MULTIPLY;
        objectArray2[15] = bl;
        objectArray2[14] = new Vector4f(f15);
        objectArray2[13] = (int)dl_0.c("P", (Object)color4, (long)-828021394572427215L, (long)l);
        objectArray2[12] = (int)dl_0.c("P", (Object)color3, (long)-828021394572427215L, (long)l);
        objectArray2[11] = (int)dl_0.c("P", (Object)color2, (long)-828021394572427215L, (long)l);
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)-828021394572427215L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-828098380060709490L, (long)l);
    }

    public static void p(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        z_0 z_02 = (z_0)((Object)objectArray[8]);
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x6ACDAA6F046EL;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_02;
        objectArray2[9] = color;
        objectArray2[8] = new Vector4f(0.0f);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-6115707521900683790L, (long)l);
    }

    public static void k(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        Color color = (Color)objectArray[9];
        float f15 = ((Float)objectArray[10]).floatValue();
        long l = (Long)objectArray[11];
        long l2 = (l = e ^ l) ^ 0x524D3E9C1AFFL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_0.MULTIPLY;
        objectArray2[11] = new Vector4f(f15);
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)7806272973446830310L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)7806974501023779402L, (long)l);
    }

    public static void t(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        Color color = (Color)objectArray[9];
        float f15 = ((Float)objectArray[10]).floatValue();
        z_0 z_02 = (z_0)((Object)objectArray[11]);
        long l = (Long)objectArray[12];
        long l2 = (l = e ^ l) ^ 0x4BC1CB9990F3L;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_02;
        objectArray2[11] = new Vector4f(f15);
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)-1848329194212011286L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-1847627590399197114L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = dl_0.e(l, l2);
        Object object = dl_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = dl_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dl_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dl_0.c(clazz3, string2, clazz2)) != null) {
                    dl_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dl_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dl_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dl_0.f(3099491365274540L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void g(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = e ^ l) ^ 0x1842FB376340L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = dl_0.c("e", (long)-3746111566042057101L, (long)l);
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-3742817956569761060L, (long)l);
    }

    public static void v(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        Color color = (Color)objectArray[10];
        Vector4f vector4f = (Vector4f)objectArray[11];
        z_0 z_02 = (z_0)((Object)objectArray[12]);
        long l = (Long)objectArray[13];
        long l2 = (l = e ^ l) ^ 0x3C2A3F04AD8AL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_02;
        objectArray2[11] = vector4f;
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)-2657091276043751533L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-2656385367601136321L, (long)l);
    }

    public static void j(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[8];
        Color color = (Color)objectArray[9];
        long l = (Long)objectArray[10];
        long l2 = (l = e ^ l) ^ 0x76764927ADC7L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_0.MULTIPLY;
        objectArray2[9] = color;
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)182880474746877019L, (long)l);
    }

    public static void q(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        z_0 z_02 = (z_0)((Object)objectArray[9]);
        long l = (Long)objectArray[10];
        long l2 = (l = e ^ l) ^ 0x51DDF1FAA333L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_02;
        objectArray2[9] = color;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)900050843078326959L, (long)l);
    }

    private void z(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        float f15 = ((Float)objectArray[10]).floatValue();
        float f16 = ((Float)objectArray[11]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[12];
        Color color = (Color)objectArray[13];
        z_0 z_02 = (z_0)((Object)objectArray[14]);
        long l = (Long)objectArray[15];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x55791CE6CAC9L;
        long l4 = l2 ^ 0x150C8960A97CL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = true;
        objectArray2[2] = z_02;
        objectArray2[1] = vector4f;
        objectArray2[0] = bW2;
        CallSite callSite = dl_0.c("P", (Object)this, (Object)objectArray2, (long)-1965970216703829341L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0((dt_0)((Object)callSite), (arg_0, arg_1) -> dl_0.lambda$drawInternalWithUV$1(color, matrix4f, f, f10, f12, f13, f14, f11, f15, f16, arg_0, arg_1));
        dl_0.c("P", (Object)((ga_0)((Object)dl_0.c("P", (Object)dA.a, (long)-1967750002257972099L, (long)l))), (Object)objectArray3, (long)-1966544310577303397L, (long)l);
    }

    public static void w(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        Color color2 = (Color)objectArray[8];
        Color color3 = (Color)objectArray[9];
        Color color4 = (Color)objectArray[10];
        float f13 = ((Float)objectArray[11]).floatValue();
        z_0 z_02 = (z_0)((Object)objectArray[12]);
        long l = (Long)objectArray[13];
        long l2 = (l = e ^ l) ^ 0x6AEE84642E46L;
        Object[] objectArray2 = new Object[15];
        objectArray2[14] = l2;
        objectArray2[13] = z_02;
        objectArray2[12] = new Vector4f(f13);
        objectArray2[11] = color4;
        objectArray2[10] = color3;
        objectArray2[9] = color2;
        objectArray2[8] = color;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-7932134389297479659L, (long)l);
    }

    public static void u(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        Color color = (Color)objectArray[9];
        Vector4f vector4f = (Vector4f)objectArray[10];
        z_0 z_02 = (z_0)((Object)objectArray[11]);
        long l = (Long)objectArray[12];
        long l2 = (l = e ^ l) ^ 0x318D626F168EL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_02;
        objectArray2[11] = vector4f;
        objectArray2[10] = (int)dl_0.c("P", (Object)color, (long)6927679893722682519L, (long)l);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)6928385821493757499L, (long)l);
    }

    public static void r(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[7];
        Color color = (Color)objectArray[8];
        z_0 z_02 = (z_0)((Object)objectArray[9]);
        long l = (Long)objectArray[10];
        long l2 = (l = e ^ l) ^ 0x4B247C2C7A32L;
        Object[] objectArray2 = new Object[12];
        objectArray2[11] = l2;
        objectArray2[10] = z_02;
        objectArray2[9] = color;
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)-3063426859289042002L, (long)l);
    }

    private void y(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[8];
        Color color = (Color)objectArray[9];
        z_0 z_02 = (z_0)((Object)objectArray[10]);
        long l = (Long)objectArray[11];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x337CBB4400F9L;
        long l4 = l2 ^ 0x73092EC2634CL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = true;
        objectArray2[2] = z_02;
        objectArray2[1] = vector4f;
        objectArray2[0] = bW2;
        CallSite callSite = dl_0.c("P", (Object)this, (Object)objectArray2, (long)3352682002804117651L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0((dt_0)((Object)callSite), (arg_0, arg_1) -> dl_0.lambda$drawInternal$0(color, matrix4f, f, f10, f12, f11, arg_0, arg_1));
        dl_0.c("P", (Object)((ga_0)((Object)dl_0.c("P", (Object)dA.a, (long)3351034131713719885L, (long)l))), (Object)objectArray3, (long)3352094687859817131L, (long)l);
    }

    public static void E(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        float f15 = ((Float)objectArray[10]).floatValue();
        float f16 = ((Float)objectArray[11]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[12];
        Color color = (Color)objectArray[13];
        long l = (Long)objectArray[14];
        long l2 = (l = e ^ l) ^ 0x4299C5953B68L;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = l2;
        objectArray2[14] = z_0.MULTIPLY;
        objectArray2[13] = color;
        objectArray2[12] = vector4f;
        objectArray2[11] = Float.valueOf(f16);
        objectArray2[10] = Float.valueOf(f15);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)6782034483935417858L, (long)l);
    }

    public static void A(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        bW bW2 = (bW)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        float f15 = ((Float)objectArray[9]).floatValue();
        float f16 = ((Float)objectArray[10]).floatValue();
        long l = (Long)objectArray[11];
        long l2 = (l = e ^ l) ^ 0x7EB256594AF9L;
        Object[] objectArray2 = new Object[16];
        objectArray2[15] = l2;
        objectArray2[14] = z_0.MULTIPLY;
        objectArray2[13] = dl_0.c("e", (long)3425589593382606330L, (long)l);
        objectArray2[12] = new Vector4f(0.0f);
        objectArray2[11] = Float.valueOf(f16);
        objectArray2[10] = Float.valueOf(f15);
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = bW2;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dl_0.c("P", (Object)a, (Object)objectArray2, (long)3427129664817588115L, (long)l);
    }

    private void H(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        int n = (Integer)objectArray[10];
        int n2 = (Integer)objectArray[11];
        int n3 = (Integer)objectArray[12];
        int n4 = (Integer)objectArray[13];
        Vector4f vector4f = (Vector4f)objectArray[14];
        boolean bl = (Boolean)objectArray[15];
        z_0 z_02 = (z_0)((Object)objectArray[16]);
        long l = (Long)objectArray[17];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x75E9AE6948CEL;
        long l4 = l2 ^ 0x7E4E3E7A8D2BL;
        long l5 = l2 ^ 0x549216BF24C5L;
        long l6 = l2 ^ 0x6D7697305FBL;
        long l7 = l2 ^ 0x12210CF9F022L;
        long l8 = l2 ^ 0x423881849D32L;
        long l9 = l2 ^ 0x70D525CFB5BFL;
        CallSite callSite = dl_0.c("\u00e3", (float)(f12 - f), (long)867990981356070899L, (long)l);
        CallSite callSite2 = dl_0.c("\u00e3", (float)(f13 - f10), (long)867990981356070899L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l8;
        objectArray2[0] = n;
        CallSite callSite3 = dl_0.c("\u00e3", (Object)objectArray2, (long)868836338084061899L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l8;
        objectArray3[0] = n2;
        CallSite callSite4 = dl_0.c("\u00e3", (Object)objectArray3, (long)868836338084061899L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l8;
        objectArray4[0] = n3;
        CallSite callSite5 = dl_0.c("\u00e3", (Object)objectArray4, (long)868836338084061899L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l8;
        objectArray5[0] = n4;
        CallSite callSite6 = dl_0.c("\u00e3", (Object)objectArray5, (long)868836338084061899L, (long)l);
        Object[] objectArray6 = new Object[6];
        objectArray6[5] = l9;
        objectArray6[4] = bl;
        objectArray6[3] = z_02;
        objectArray6[2] = vector4f;
        objectArray6[1] = bW2;
        objectArray6[0] = aq_02;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l3;
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = l6;
        objectArray8[3] = Float.valueOf(f14);
        objectArray8[2] = Float.valueOf(f13);
        objectArray8[1] = Float.valueOf(f);
        objectArray8[0] = matrix4f;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l4;
        objectArray9[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l4;
        objectArray10[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l5;
        objectArray11[0] = (int)callSite3;
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = l6;
        objectArray12[3] = Float.valueOf(f14);
        objectArray12[2] = Float.valueOf(f13);
        objectArray12[1] = Float.valueOf(f12);
        objectArray12[0] = matrix4f;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l4;
        objectArray13[0] = new float[]{(float)callSite, 0.0f};
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l4;
        objectArray14[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l5;
        objectArray15[0] = (int)callSite4;
        Object[] objectArray16 = new Object[5];
        objectArray16[4] = l6;
        objectArray16[3] = Float.valueOf(f11);
        objectArray16[2] = Float.valueOf(f10);
        objectArray16[1] = Float.valueOf(f12);
        objectArray16[0] = matrix4f;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l4;
        objectArray17[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l4;
        objectArray18[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = (int)callSite5;
        Object[] objectArray20 = new Object[5];
        objectArray20[4] = l6;
        objectArray20[3] = Float.valueOf(f11);
        objectArray20[2] = Float.valueOf(f10);
        objectArray20[1] = Float.valueOf(f);
        objectArray20[0] = matrix4f;
        Object[] objectArray21 = new Object[2];
        objectArray21[1] = l4;
        objectArray21[0] = new float[]{0.0f, (float)callSite2};
        Object[] objectArray22 = new Object[2];
        objectArray22[1] = l4;
        objectArray22[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray23 = new Object[2];
        objectArray23[1] = l5;
        objectArray23[0] = (int)callSite6;
        Object[] objectArray24 = new Object[2];
        objectArray24[1] = l7;
        objectArray24[0] = m_0.QUADS;
        dl_0.c("P", (Object)((bT)((Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)((bT)((Object)dl_0.c("P", (Object)dl_0.c("P", (Object)this, (Object)objectArray6, (long)868433512999676099L, (long)l), (Object)objectArray7, (long)866112762574585223L, (long)l))), (Object)objectArray8, (long)869859297163869398L, (long)l), (Object)objectArray9, (long)869789704091213078L, (long)l), (Object)objectArray10, (long)869789704091213078L, (long)l), (Object)objectArray11, (long)868035687014273282L, (long)l), (Object)objectArray12, (long)869859297163869398L, (long)l), (Object)objectArray13, (long)869789704091213078L, (long)l), (Object)objectArray14, (long)869789704091213078L, (long)l), (Object)objectArray15, (long)868035687014273282L, (long)l), (Object)objectArray16, (long)869859297163869398L, (long)l), (Object)objectArray17, (long)869789704091213078L, (long)l), (Object)objectArray18, (long)869789704091213078L, (long)l), (Object)objectArray19, (long)868035687014273282L, (long)l), (Object)objectArray20, (long)869859297163869398L, (long)l), (Object)objectArray21, (long)869789704091213078L, (long)l), (Object)objectArray22, (long)869789704091213078L, (long)l), (Object)objectArray23, (long)868035687014273282L, (long)l), (Object)objectArray24, (long)868363367444413588L, (long)l))), (Object)new Object[0], (long)867555975295874297L, (long)l);
    }

    private static void lambda$drawGradientInternal$2(Color color, Color color2, Color color3, Color color4, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x74D20F96A79AL;
        long l3 = l2 ^ 0x686F5350628FL;
        long l4 = l2 ^ 0xBC8FA099E24L;
        long l5 = l2 ^ 0xFA7F1C0DA63L;
        long l6 = l2 ^ 0x6D9BE72FE051L;
        long l7 = l2 ^ 0x6722C4503A88L;
        long l8 = l2 ^ 0x662C8A2E0A7FL;
        long l9 = l2 ^ 0x7646E5E3FBEL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l9;
        objectArray[0] = (int)dl_0.c("P", (Object)color, (long)2759027255872688889L, (long)l);
        CallSite callSite = dl_0.c("\u00e3", (Object)objectArray, (long)2761384273620109167L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l9;
        objectArray2[0] = (int)dl_0.c("P", (Object)color2, (long)2759027255872688889L, (long)l);
        CallSite callSite2 = dl_0.c("\u00e3", (Object)objectArray2, (long)2761384273620109167L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l9;
        objectArray3[0] = (int)dl_0.c("P", (Object)color3, (long)2759027255872688889L, (long)l);
        CallSite callSite3 = dl_0.c("\u00e3", (Object)objectArray3, (long)2761384273620109167L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l9;
        objectArray4[0] = (int)dl_0.c("P", (Object)color4, (long)2759027255872688889L, (long)l);
        CallSite callSite4 = dl_0.c("\u00e3", (Object)objectArray4, (long)2761384273620109167L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l3;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l7;
        objectArray6[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)2759552979626896738L, (long)l));
        objectArray6[2] = Float.valueOf(f10 + f11);
        objectArray6[1] = Float.valueOf(f);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l8;
        objectArray7[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l8;
        objectArray8[0] = new float[]{f12, f11};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l6;
        objectArray9[0] = (int)callSite4;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l7;
        objectArray10[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)2759552979626896738L, (long)l));
        objectArray10[2] = Float.valueOf(f10 + f11);
        objectArray10[1] = Float.valueOf(f + f12);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l8;
        objectArray11[0] = new float[]{f12, 0.0f};
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l8;
        objectArray12[0] = new float[]{f12, f11};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l6;
        objectArray13[0] = (int)callSite3;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = l7;
        objectArray14[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)2759552979626896738L, (long)l));
        objectArray14[2] = Float.valueOf(f10);
        objectArray14[1] = Float.valueOf(f + f12);
        objectArray14[0] = matrix4f;
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l8;
        objectArray15[0] = new float[]{f12, f11};
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l8;
        objectArray16[0] = new float[]{f12, f11};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l6;
        objectArray17[0] = (int)callSite2;
        Object[] objectArray18 = new Object[5];
        objectArray18[4] = l7;
        objectArray18[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)2759552979626896738L, (long)l));
        objectArray18[2] = Float.valueOf(f10);
        objectArray18[1] = Float.valueOf(f);
        objectArray18[0] = matrix4f;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l8;
        objectArray19[0] = new float[]{0.0f, f11};
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = l8;
        objectArray20[0] = new float[]{f12, f11};
        Object[] objectArray21 = new Object[2];
        objectArray21[1] = l6;
        objectArray21[0] = (int)callSite;
        Object[] objectArray22 = new Object[2];
        objectArray22[1] = l5;
        objectArray22[0] = m_0.QUADS;
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l4;
        dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)cF2, (Object)objectArray5, (long)2757348048912357318L, (long)l), (Object)objectArray6, (long)2759948313224701380L, (long)l), (Object)objectArray7, (long)2758947491889391469L, (long)l), (Object)objectArray8, (long)2758947491889391469L, (long)l), (Object)objectArray9, (long)2757492011687701526L, (long)l), (Object)objectArray10, (long)2759948313224701380L, (long)l), (Object)objectArray11, (long)2758947491889391469L, (long)l), (Object)objectArray12, (long)2758947491889391469L, (long)l), (Object)objectArray13, (long)2757492011687701526L, (long)l), (Object)objectArray14, (long)2759948313224701380L, (long)l), (Object)objectArray15, (long)2758947491889391469L, (long)l), (Object)objectArray16, (long)2758947491889391469L, (long)l), (Object)objectArray17, (long)2757492011687701526L, (long)l), (Object)objectArray18, (long)2759948313224701380L, (long)l), (Object)objectArray19, (long)2758947491889391469L, (long)l), (Object)objectArray20, (long)2758947491889391469L, (long)l), (Object)objectArray21, (long)2757492011687701526L, (long)l), (Object)objectArray22, (long)2759605304269559509L, (long)l), (Object)objectArray23, (long)2759494786705773861L, (long)l);
    }

    private static void lambda$drawInternalWithUV$1(Color color, Matrix4f matrix4f, float f, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Float f17, cF cF2) {
        long l;
        long l2 = l = e ^ 0x74599E78B2D0L;
        long l3 = l2 ^ 0x68E4C2BE77C5L;
        long l4 = l2 ^ 0xB436BE78B6EL;
        long l5 = l2 ^ 0xF2C602ECF29L;
        long l6 = l2 ^ 0x6D1076C1F51BL;
        long l7 = l2 ^ 0x67A955BE2FC2L;
        long l8 = l2 ^ 0x66A71BC01F35L;
        CallSite callSite = dl_0.c("P", (Object)color, (long)3674946230641199027L, (long)l);
        int n = callSite >> dl_0.b("g", (int)30032, (long)(0x7C9A8456BADFF3B1L ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A19D75DBA230AL ^ l));
        int n2 = callSite >> dl_0.b("g", (int)20148, (long)(0x6B370D23D2AD484AL ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A19D75DBA230AL ^ l));
        int n3 = callSite >> dl_0.b("g", (int)4014, (long)(0x1EBAAE68FEA40941L ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A19D75DBA230AL ^ l));
        int n4 = callSite & dl_0.b("g", (int)9696, (long)(0x342A19D75DBA230AL ^ l));
        int n5 = n << dl_0.b("g", (int)30032, (long)(0x7C9A8456BADFF3B1L ^ l)) | n4 << dl_0.b("g", (int)20148, (long)(0x6B370D23D2AD484AL ^ l)) | n3 << dl_0.b("g", (int)4014, (long)(0x1EBAAE68FEA40941L ^ l)) | n2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l7;
        objectArray2[3] = Float.valueOf((float)dl_0.c("P", (Object)f17, (long)3675472053192243240L, (long)l));
        objectArray2[2] = Float.valueOf(f10 + f11);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l8;
        objectArray3[0] = new float[]{f12, f13};
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l8;
        objectArray4[0] = new float[]{f14, f11};
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l6;
        objectArray5[0] = n5;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l7;
        objectArray6[3] = Float.valueOf((float)dl_0.c("P", (Object)f17, (long)3675472053192243240L, (long)l));
        objectArray6[2] = Float.valueOf(f10 + f11);
        objectArray6[1] = Float.valueOf(f + f14);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l8;
        objectArray7[0] = new float[]{f12 + f15, f13};
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l8;
        objectArray8[0] = new float[]{f14, f11};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l6;
        objectArray9[0] = n5;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l7;
        objectArray10[3] = Float.valueOf((float)dl_0.c("P", (Object)f17, (long)3675472053192243240L, (long)l));
        objectArray10[2] = Float.valueOf(f10);
        objectArray10[1] = Float.valueOf(f + f14);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l8;
        objectArray11[0] = new float[]{f12 + f15, f13 + f16};
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l8;
        objectArray12[0] = new float[]{f14, f11};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l6;
        objectArray13[0] = n5;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = l7;
        objectArray14[3] = Float.valueOf((float)dl_0.c("P", (Object)f17, (long)3675472053192243240L, (long)l));
        objectArray14[2] = Float.valueOf(f10);
        objectArray14[1] = Float.valueOf(f);
        objectArray14[0] = matrix4f;
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l8;
        objectArray15[0] = new float[]{f12, f13 + f16};
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l8;
        objectArray16[0] = new float[]{f14, f11};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l6;
        objectArray17[0] = n5;
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l5;
        objectArray18[0] = m_0.QUADS;
        Object[] objectArray19 = new Object[1];
        objectArray19[0] = l4;
        dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)cF2, (Object)objectArray, (long)3678897713470472844L, (long)l), (Object)objectArray2, (long)3676994300356096142L, (long)l), (Object)objectArray3, (long)3675993564924064295L, (long)l), (Object)objectArray4, (long)3675993564924064295L, (long)l), (Object)objectArray5, (long)3679041585513855324L, (long)l), (Object)objectArray6, (long)3676994300356096142L, (long)l), (Object)objectArray7, (long)3675993564924064295L, (long)l), (Object)objectArray8, (long)3675993564924064295L, (long)l), (Object)objectArray9, (long)3679041585513855324L, (long)l), (Object)objectArray10, (long)3676994300356096142L, (long)l), (Object)objectArray11, (long)3675993564924064295L, (long)l), (Object)objectArray12, (long)3675993564924064295L, (long)l), (Object)objectArray13, (long)3679041585513855324L, (long)l), (Object)objectArray14, (long)3676994300356096142L, (long)l), (Object)objectArray15, (long)3675993564924064295L, (long)l), (Object)objectArray16, (long)3675993564924064295L, (long)l), (Object)objectArray17, (long)3679041585513855324L, (long)l), (Object)objectArray18, (long)3676651351492477855L, (long)l), (Object)objectArray19, (long)3675413834514677871L, (long)l);
    }

    private dt_0 lambda$getRenderLayer$4(boolean bl, bW bW2, z_0 z_02, Vector4f vector4f, dI dI2) {
        long l = e ^ 0x15D94924E96AL;
        long l2 = l ^ 0x11F9F3B80CE5L;
        fW[] fWArray = new fW[dl_0.b("g", (int)20923, (long)(0x7A613375EC6F0CFCL ^ l))];
        fWArray[0] = fW.a;
        fWArray[1] = dl_0.c("\u00e3", (Object)new Object[]{dl_0.c("P", (Object)this, (Object)new Object[0], (long)7547800166948577267L, (long)l)}, (long)7547675354554524292L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = bl;
        objectArray[0] = (int)dl_0.b("g", (int)29080, (long)(0x487D35C2A4D2ACDEL ^ l));
        fWArray[2] = dl_0.c("\u00e3", (Object)objectArray, (long)7545063511671627528L, (long)l);
        fWArray[3] = dl_0.c("\u00e3", (Object)new Object[]{true}, (long)7540077638787901914L, (long)l);
        fWArray[4] = new gN(true, true, (int)dl_0.b("g", (int)23684, (long)(0x1BA4A7498A5C01D2L ^ l)), (int)dl_0.b("g", (int)2805, (long)(0x2DC734A3F29ED7AAL ^ l)), 1, (int)dl_0.b("g", (int)2805, (long)(0x2DC734A3F29ED7AAL ^ l)));
        fWArray[5] = dl_0.c("\u00e3", (Object)new Object[]{arg_0 -> this.lambda$getRenderLayer$3(bW2, z_02, vector4f, arg_0)}, (long)7547395962117987356L, (long)l);
        return new dt_0(gf_0.e, 4, false, fWArray, l2);
    }

    private void lambda$getRenderLayer$3(bW bW2, z_0 z_02, Vector4f vector4f, dy_0 dy_02) {
        long l = e ^ 0x586D19B4AB1CL;
        dl_0.c("\u00e3", (int)dl_0.b("g", (int)8418, (long)(0x6FB598A5A96C3FCAL ^ l)), (long)3083009291255343225L, (long)l);
        dl_0.c("\u00e3", (int)dl_0.b("g", (int)26141, (long)(0x7C3A4C6BDB2793AL ^ l)), (int)bW2.a, (long)3081101926496741865L, (long)l);
        dl_0.c("\u00e3", (int)this.c, (int)dl_0.c("P", (Object)((Object)z_02), (long)3086358775201322363L, (long)l), (long)3083727191605462105L, (long)l);
        dl_0.c("\u00e3", (int)this.d, (float)dl_0.c("\u00d9", (Object)vector4f, (long)3083250455681508979L, (long)l), (float)dl_0.c("\u00d9", (Object)vector4f, (long)3084478857464707775L, (long)l), (float)dl_0.c("\u00d9", (Object)vector4f, (long)3083499429037512728L, (long)l), (float)dl_0.c("\u00d9", (Object)vector4f, (long)3086566756793075784L, (long)l), (long)3084893756100428148L, (long)l);
    }

    private static void lambda$drawInternal$0(Color color, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x6CF44B026EB7L;
        long l3 = l2 ^ 0x704917C4ABA2L;
        long l4 = l2 ^ 0x13EEBE9D5709L;
        long l5 = l2 ^ 0x1781B554134EL;
        long l6 = l2 ^ 0x75BDA3BB297CL;
        long l7 = l2 ^ 0x7F0480C4F3A5L;
        long l8 = l2 ^ 0x7E0ACEBAC352L;
        CallSite callSite = dl_0.c("P", (Object)color, (long)-1195968975792677932L, (long)l);
        int n = callSite >> dl_0.b("g", (int)30032, (long)(0x7C9A9CFB6FA52FD6L ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A017A88C0FF6DL ^ l));
        int n2 = callSite >> dl_0.b("g", (int)20148, (long)(0x6B37158E07D7942DL ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A017A88C0FF6DL ^ l));
        int n3 = callSite >> dl_0.b("g", (int)4014, (long)(0x1EBAB6C52BDED526L ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A017A88C0FF6DL ^ l));
        int n4 = callSite & dl_0.b("g", (int)9696, (long)(0x342A017A88C0FF6DL ^ l));
        int n5 = n << dl_0.b("g", (int)30032, (long)(0x7C9A9CFB6FA52FD6L ^ l)) | n4 << dl_0.b("g", (int)20148, (long)(0x6B37158E07D7942DL ^ l)) | n3 << dl_0.b("g", (int)4014, (long)(0x1EBAB6C52BDED526L ^ l)) | n2;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l7;
        objectArray2[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)-1195988317613792177L, (long)l));
        objectArray2[2] = Float.valueOf(f10 + f11);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l8;
        objectArray3[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l8;
        objectArray4[0] = new float[]{f12, f11};
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l6;
        objectArray5[0] = n5;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l7;
        objectArray6[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)-1195988317613792177L, (long)l));
        objectArray6[2] = Float.valueOf(f10 + f11);
        objectArray6[1] = Float.valueOf(f + f12);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l8;
        objectArray7[0] = new float[]{f12, 0.0f};
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l8;
        objectArray8[0] = new float[]{f12, f11};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l6;
        objectArray9[0] = n5;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l7;
        objectArray10[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)-1195988317613792177L, (long)l));
        objectArray10[2] = Float.valueOf(f10);
        objectArray10[1] = Float.valueOf(f + f12);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l8;
        objectArray11[0] = new float[]{f12, f11};
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l8;
        objectArray12[0] = new float[]{f12, f11};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l6;
        objectArray13[0] = n5;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = l7;
        objectArray14[3] = Float.valueOf((float)dl_0.c("P", (Object)f13, (long)-1195988317613792177L, (long)l));
        objectArray14[2] = Float.valueOf(f10);
        objectArray14[1] = Float.valueOf(f);
        objectArray14[0] = matrix4f;
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l8;
        objectArray15[0] = new float[]{0.0f, f11};
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l8;
        objectArray16[0] = new float[]{f12, f11};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l6;
        objectArray17[0] = n5;
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l5;
        objectArray18[0] = m_0.QUADS;
        Object[] objectArray19 = new Object[1];
        objectArray19[0] = l4;
        dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)cF2, (Object)objectArray, (long)-1195413955663798549L, (long)l), (Object)objectArray2, (long)-1197862425393189655L, (long)l), (Object)objectArray3, (long)-1196594080213012928L, (long)l), (Object)objectArray4, (long)-1196594080213012928L, (long)l), (Object)objectArray5, (long)-1195269771700230853L, (long)l), (Object)objectArray6, (long)-1197862425393189655L, (long)l), (Object)objectArray7, (long)-1196594080213012928L, (long)l), (Object)objectArray8, (long)-1196594080213012928L, (long)l), (Object)objectArray9, (long)-1195269771700230853L, (long)l), (Object)objectArray10, (long)-1197862425393189655L, (long)l), (Object)objectArray11, (long)-1196594080213012928L, (long)l), (Object)objectArray12, (long)-1196594080213012928L, (long)l), (Object)objectArray13, (long)-1195269771700230853L, (long)l), (Object)objectArray14, (long)-1197862425393189655L, (long)l), (Object)objectArray15, (long)-1196594080213012928L, (long)l), (Object)objectArray16, (long)-1196594080213012928L, (long)l), (Object)objectArray17, (long)-1195269771700230853L, (long)l), (Object)objectArray18, (long)-1197660351457288200L, (long)l), (Object)objectArray19, (long)-1196081986948097016L, (long)l);
    }

    private dt_0 lambda$getBuffer$6(boolean bl, bW bW2, z_0 z_02, Vector4f vector4f, dI dI2) {
        long l = e ^ 0x6DB985E673BCL;
        long l2 = l ^ 0x69993F7A9633L;
        fW[] fWArray = new fW[dl_0.b("g", (int)9624, (long)(0x531DD6D29036621DL ^ l))];
        fWArray[0] = fW.a;
        fWArray[1] = dl_0.c("\u00e3", (Object)new Object[]{dl_0.c("P", (Object)this, (Object)new Object[0], (long)-979158931348126427L, (long)l)}, (long)-979318659527477166L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = bl;
        objectArray[0] = (int)dl_0.b("g", (int)11005, (long)(0x271CF41323FA6D6EL ^ l));
        fWArray[2] = dl_0.c("\u00e3", (Object)objectArray, (long)-980928022709254690L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = true;
        objectArray2[0] = false;
        fWArray[3] = dl_0.c("\u00e3", (Object)objectArray2, (long)-979515814948980507L, (long)l);
        fWArray[4] = new gN(true, true, (int)dl_0.b("g", (int)17316, (long)(0x75B546AA5C110426L ^ l)), (int)dl_0.b("g", (int)11959, (long)(0x31E3E6632FFA693CL ^ l)), 1, (int)dl_0.b("g", (int)2805, (long)(0x2DC74CC33E5C4D7CL ^ l)));
        fWArray[5] = dl_0.c("\u00e3", (Object)new Object[]{arg_0 -> this.lambda$getBuffer$5(bW2, z_02, vector4f, arg_0)}, (long)-978472152065898806L, (long)l);
        return new dt_0(gf_0.e, 4, false, fWArray, l2);
    }

    private void lambda$getBuffer$5(bW bW2, z_0 z_02, Vector4f vector4f, dy_0 dy_02) {
        long l = e ^ 0x3CA165BAE54EL;
        dl_0.c("\u00e3", (int)dl_0.b("g", (int)26301, (long)(0x71FC8CD859A3B7C3L ^ l)), (long)7249502725783594539L, (long)l);
        dl_0.c("\u00e3", (int)dl_0.b("g", (int)3575, (long)(0x35391353CD5B5C8BL ^ l)), (int)bW2.a, (long)7246328276683220923L, (long)l);
        dl_0.c("\u00e3", (int)this.c, (int)dl_0.c("P", (Object)((Object)z_02), (long)7243642219297938217L, (long)l), (long)7249103555067709963L, (long)l);
        dl_0.c("\u00e3", (int)this.d, (float)dl_0.c("\u00d9", (Object)vector4f, (long)7249532303208835105L, (long)l), (float)dl_0.c("\u00d9", (Object)vector4f, (long)7249706753706472685L, (long)l), (float)dl_0.c("\u00d9", (Object)vector4f, (long)7248735639932819018L, (long)l), (float)dl_0.c("\u00d9", (Object)vector4f, (long)7243992519059441178L, (long)l), (long)7250190989353127718L, (long)l);
    }

    private void G(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        bW bW2 = (bW)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        int n = (Integer)objectArray[10];
        Vector4f vector4f = (Vector4f)objectArray[11];
        z_0 z_02 = (z_0)((Object)objectArray[12]);
        long l = (Long)objectArray[13];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x38C5DAE3B3A9L;
        long l4 = l2 ^ 0x33624AF0764CL;
        long l5 = l2 ^ 0x19BE6235DFA2L;
        long l6 = l2 ^ 0x4BFB1DF9FE9CL;
        long l7 = l2 ^ 0x5F0D78730B45L;
        long l8 = l2 ^ 0x3DF951454ED8L;
        CallSite callSite = dl_0.c("\u00e3", (float)(f12 - f), (long)-617850636294005612L, (long)l);
        CallSite callSite2 = dl_0.c("\u00e3", (float)(f13 - f10), (long)-617850636294005612L, (long)l);
        int n2 = n >> dl_0.b("g", (int)30032, (long)(0x7C9AD477A28237DDL ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A49F645E7E766L ^ l));
        int n3 = n >> dl_0.b("g", (int)20148, (long)(0x6B375D02CAF08C26L ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A49F645E7E766L ^ l));
        int n4 = n >> dl_0.b("g", (int)4014, (long)(0x1EBAFE49E6F9CD2DL ^ l)) & dl_0.b("g", (int)9696, (long)(0x342A49F645E7E766L ^ l));
        int n5 = n & dl_0.b("g", (int)9696, (long)(0x342A49F645E7E766L ^ l));
        int n6 = n2 << dl_0.b("g", (int)30032, (long)(0x7C9AD477A28237DDL ^ l)) | n5 << dl_0.b("g", (int)20148, (long)(0x6B375D02CAF08C26L ^ l)) | n4 << dl_0.b("g", (int)4014, (long)(0x1EBAFE49E6F9CD2DL ^ l)) | n3;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l8;
        objectArray2[4] = true;
        objectArray2[3] = z_02;
        objectArray2[2] = vector4f;
        objectArray2[1] = bW2;
        objectArray2[0] = aq_02;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l6;
        objectArray4[3] = Float.valueOf(f14);
        objectArray4[2] = Float.valueOf(f13);
        objectArray4[1] = Float.valueOf(f);
        objectArray4[0] = matrix4f;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l4;
        objectArray6[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = n6;
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = l6;
        objectArray8[3] = Float.valueOf(f14);
        objectArray8[2] = Float.valueOf(f13);
        objectArray8[1] = Float.valueOf(f12);
        objectArray8[0] = matrix4f;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l4;
        objectArray9[0] = new float[]{(float)callSite, 0.0f};
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l4;
        objectArray10[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l5;
        objectArray11[0] = n6;
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = l6;
        objectArray12[3] = Float.valueOf(f11);
        objectArray12[2] = Float.valueOf(f10);
        objectArray12[1] = Float.valueOf(f12);
        objectArray12[0] = matrix4f;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l4;
        objectArray13[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l4;
        objectArray14[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l5;
        objectArray15[0] = n6;
        Object[] objectArray16 = new Object[5];
        objectArray16[4] = l6;
        objectArray16[3] = Float.valueOf(f11);
        objectArray16[2] = Float.valueOf(f10);
        objectArray16[1] = Float.valueOf(f);
        objectArray16[0] = matrix4f;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l4;
        objectArray17[0] = new float[]{0.0f, (float)callSite2};
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l4;
        objectArray18[0] = new float[]{(float)callSite, (float)callSite2};
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = n6;
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = l7;
        objectArray20[0] = m_0.QUADS;
        dl_0.c("P", (Object)((bT)((Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)dl_0.c("P", (Object)((bT)((Object)dl_0.c("P", (Object)dl_0.c("P", (Object)this, (Object)objectArray2, (long)-618674844570414172L, (long)l), (Object)objectArray3, (long)-620861387484543264L, (long)l))), (Object)objectArray4, (long)-615566805467985999L, (long)l), (Object)objectArray5, (long)-615497758086994319L, (long)l), (Object)objectArray6, (long)-615497758086994319L, (long)l), (Object)objectArray7, (long)-617928868571649435L, (long)l), (Object)objectArray8, (long)-615566805467985999L, (long)l), (Object)objectArray9, (long)-615497758086994319L, (long)l), (Object)objectArray10, (long)-615497758086994319L, (long)l), (Object)objectArray11, (long)-617928868571649435L, (long)l), (Object)objectArray12, (long)-615566805467985999L, (long)l), (Object)objectArray13, (long)-615497758086994319L, (long)l), (Object)objectArray14, (long)-615497758086994319L, (long)l), (Object)objectArray15, (long)-617928868571649435L, (long)l), (Object)objectArray16, (long)-615566805467985999L, (long)l), (Object)objectArray17, (long)-615497758086994319L, (long)l), (Object)objectArray18, (long)-615497758086994319L, (long)l), (Object)objectArray19, (long)-617928868571649435L, (long)l), (Object)objectArray20, (long)-618604149558835213L, (long)l))), (Object)new Object[0], (long)-617731211853443170L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dl_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dl_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dl_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


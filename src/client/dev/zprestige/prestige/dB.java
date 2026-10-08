/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 *  net.minecraft.class_4730
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
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
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4730;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dB
implements cz_0 {
    private static final class_310 b;
    public static class_332 a;
    public static class_4587 c;
    public static Matrix4f d;
    public static Matrix4f e;
    public static Matrix4f f;
    public static aq_0 g;
    public static gK h;
    private static final int[] i;
    private static boolean j;
    private static final Matrix4f k;
    private static final Matrix4f l;
    private static final Vector3f m;
    private static final Vector4f n;
    private static long o;
    private static long p;
    private static final Matrix4f q;
    private static final float[] r;
    private static int s;
    private static final Vector4f t;
    private static final Color u;
    private static final Color v;
    private static float w;
    private static Color x;
    private static final class_2960 y;
    private static final long z;
    private static final String[] A;
    private static final String[] B;
    private static final Map C;
    private static final long[] D;
    private static final Integer[] E;
    private static final Map F;
    private static final long[] G;
    private static final Long[] H;
    private static final Map I;
    private static final Object[] J;
    private static final String[] K;

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            dB.z = hc.a(7186629206036117845L, -733863788830639703L, MethodHandles.lookup().lookupClass()).a(112440361157605L);
                            var31 = dB.z ^ 53911245093666L;
                            dB.J = new Object[190];
                            dB.K = new String[190];
                            dB.a();
                            dB.C = new HashMap<K, V>(13);
                            var22_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var31 >>> 56);
                            for (var23_2 = 1; var23_2 < 8; ++var23_2) {
                                v2 = v2;
                                v2[var23_2] = (byte)(var31 << var23_2 * 8 >>> 56);
                            }
                            var22_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var29_3 = new String[2];
                            var27_4 = 0;
                            var26_5 = "\u0098\u00d32\u00e8\u0012\u0090\u0087v\u00e2\u00cf\u00c6\u00ab\u00f5\u00193\u0001f\u0084\u00ef!\u00af\u00ac\u001c\u00a9JR\u00bb\u0018\u00b2U\u00d3T\u0010\u0099.\u00ebC\u00b6\u0011\u00c1n\u00d9(\u0010\u00c7\u00ae\u00f3X'";
                            var28_6 = "\u0098\u00d32\u00e8\u0012\u0090\u0087v\u00e2\u00cf\u00c6\u00ab\u00f5\u00193\u0001f\u0084\u00ef!\u00af\u00ac\u001c\u00a9JR\u00bb\u0018\u00b2U\u00d3T\u0010\u0099.\u00ebC\u00b6\u0011\u00c1n\u00d9(\u0010\u00c7\u00ae\u00f3X'".length();
                            var25_7 = 32;
                            var24_8 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var29_3[var27_4++] = dB.a(var30_9).intern();
                                if ((var24_8 += var25_7) < var28_6) {
                                    var25_7 = var26_5.charAt(var24_8);
                                    ** continue;
                                }
                                break block20;
                                break;
                            }
                            v3 = ++var24_8;
                            var30_9 = var22_1.doFinal(var26_5.substring(v3, v3 + var25_7).getBytes("ISO-8859-1"));
                            ** while (true)
                        }
                        dB.A = var29_3;
                        dB.B = new String[2];
                        dB.F = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v4 = SecretKeyFactory.getInstance("DES");
                        v5 = new byte[8];
                        v6 = v5;
                        v5[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v6 = v6;
                            v6[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[4];
                        var14_13 = 0;
                        var15_14 = "$\u009al\u0017A\u000b\u00fa{G\u00e2\u00ee(\r\u00c6J\u008d";
                        var16_15 = "$\u009al\u0017A\u000b\u00fa{G\u00e2\u00ee(\r\u00c6J\u008d".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v7 = var17_12;
                            v8 = var14_13++;
                            v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v10 = -1;
                            break block21;
                            break;
                        }
lbl61:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00dc\u00d0\u00df\u00e7\u008dF\u0084I\u00f8m\u0005\u00d3\")\u009d:";
                            var16_15 = "\u00dc\u00d0\u00df\u00e7\u008dF\u0084I\u00f8m\u0005\u00d3\")\u009d:".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v7 = var17_12;
                                v8 = var14_13++;
                                v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v10 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl74:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            break block22;
                            break;
                        }
                    }
                    var19_18 = v9;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v11 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v10) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl87:
                        // 1 sources

                        ** continue;
                    }
                }
                dB.D = var17_12;
                dB.E = new Integer[4];
                dB.I = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v12 = SecretKeyFactory.getInstance("DES");
                v13 = new byte[8];
                v14 = v13;
                v13[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v14 = v14;
                    v14[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[4];
                var3_23 = 0;
                var4_24 = "\u00cf 3\u00e2\u000f\u0011\f\u00aa8\u0083\u00b1Z\u0080\u0099tf";
                var5_25 = "\u00cf 3\u00e2\u000f\u0011\f\u00aa8\u0083\u00b1Z\u0080\u0099tf".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v15 = var6_22;
                    v16 = var3_23++;
                    v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v18 = -1;
                    break block23;
                    break;
                }
lbl114:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "\u0082\u00a6\u00ffr\u00ed\u0090\u00baRf\"\u0005\t\u00d0HM\u0090";
                    var5_25 = "\u0082\u00a6\u00ffr\u00ed\u0090\u00baRf\"\u0005\t\u00d0HM\u0090".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v15 = var6_22;
                        v16 = var3_23++;
                        v17 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v18 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl127:
                // 1 sources

                while (true) {
                    v15[v16] = v19;
                    if (var2_26 < var5_25) ** continue;
                    break block24;
                    break;
                }
            }
            var8_28 = v17;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v19 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v18) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl140:
                // 1 sources

                ** continue;
            }
        }
        dB.G = var6_22;
        dB.H = new Long[4];
        dB.b = dB.d("C", (long)-4677258165087746539L, (long)var31);
        dB.d = new Matrix4f();
        dB.e = new Matrix4f();
        dB.f = new Matrix4f();
        dB.i = new int[4];
        dB.j = false;
        dB.k = new Matrix4f();
        dB.l = new Matrix4f();
        dB.m = new Vector3f();
        dB.n = new Vector4f();
        dB.o = (long)dB.c("i", (int)9696, (long)(3676374455798618111L ^ var31));
        dB.p = (long)dB.c("i", (int)4459, (long)(3557179919571968885L ^ var31));
        dB.q = new Matrix4f();
        dB.r = new float[3];
        dB.s = 1;
        dB.t = new Vector4f();
        dB.u = new Color(0, 0, 0, 0);
        dB.v = new Color(0, 0, 0, (int)dB.b("m", (int)13160, (long)(7936474272833417646L ^ var31)));
        dB.w = NaNf;
        dB.x = dB.u;
        dB.y = dB.d("\u00a4", (long)-4679013319493089351L, (long)var31);
    }

    public static void e(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = z ^ l) ^ 0x43E9520AFC0AL;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)dB.d("K", (Object)color, (long)8632524560962327643L, (long)l);
        objectArray2[4] = Float.valueOf(1.0f);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        dB.d("C", (Object)objectArray2, (long)8631531927747084643L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (K[n3] != null) {
            return n3;
        }
        Object object = J[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 47;
            case 2 -> 5;
            case 3 -> 0;
            case 4 -> 31;
            case 5 -> 46;
            case 6 -> 33;
            case 7 -> 26;
            case 8 -> 61;
            case 9 -> 20;
            case 10 -> 4;
            case 11 -> 27;
            case 12 -> 21;
            case 13 -> 57;
            case 14 -> 48;
            case 15 -> 1;
            case 16 -> 15;
            case 17 -> 55;
            case 18 -> 17;
            case 19 -> 40;
            case 20 -> 44;
            case 21 -> 38;
            case 22 -> 34;
            case 23 -> 11;
            case 24 -> 37;
            case 25 -> 7;
            case 26 -> 16;
            case 27 -> 35;
            case 28 -> 30;
            case 29 -> 29;
            case 30 -> 18;
            case 31 -> 23;
            case 32 -> 49;
            case 33 -> 62;
            case 34 -> 50;
            case 35 -> 43;
            case 36 -> 12;
            case 37 -> 13;
            case 38 -> 53;
            case 39 -> 54;
            case 40 -> 60;
            case 41 -> 28;
            case 42 -> 9;
            case 43 -> 3;
            case 44 -> 8;
            case 45 -> 24;
            case 46 -> 19;
            case 47 -> 58;
            case 48 -> 39;
            case 49 -> 22;
            case 50 -> 6;
            case 51 -> 14;
            case 52 -> 25;
            case 53 -> 36;
            case 54 -> 42;
            case 55 -> 2;
            case 56 -> 32;
            case 57 -> 59;
            case 58 -> 52;
            case 59 -> 51;
            case 60 -> 45;
            case 61 -> 56;
            case 62 -> 63;
            default -> 10;
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
        dB.K[n3] = new String(cArray);
        return n3;
    }

    public static void i(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = z ^ l) ^ 0x47D5A33B0654L;
        CallSite callSite = dB.d("K", (Object)color, (long)-8414795448457598801L, (long)l);
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)callSite;
        objectArray2[4] = Float.valueOf(f10 + 2.5f * f11);
        objectArray2[3] = Float.valueOf(f + 2.5f);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = q;
        dB.d("C", (Object)objectArray2, (long)-8413188205157095647L, (long)l);
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = l2;
        objectArray3[5] = (int)callSite;
        objectArray3[4] = Float.valueOf(f10 + 2.5f * f11);
        objectArray3[3] = Float.valueOf(f + 2.5f);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f + 5.0f);
        objectArray3[0] = q;
        dB.d("C", (Object)objectArray3, (long)-8413188205157095647L, (long)l);
    }

    public static void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = z ^ l) ^ 0x781E367F830EL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = color;
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)-6780096238670118563L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3DF8;
        if (E[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = D[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])F.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dB.E[n2] = n3;
        }
        return E[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dB.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00b5' || c == '\u00a4' || c == '\u00f3') {
                field = dB.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dB.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static class_243 b(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = z ^ l;
        long l3 = l2 ^ 0x78910A4F233L;
        long l4 = l2 ^ 0x5BC26ACBD212L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = class_12972;
        CallSite callSite = dB.d("C", (Object)objectArray2, (long)-4405917500392893792L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l4;
        objectArray3[1] = (double)dB.d("\u00f8", (Object)callSite, (long)-4401177029817351020L, (long)l);
        objectArray3[0] = (double)dB.d("K", (Object)class_12972, (long)-4400290936730925484L, (long)l);
        CallSite callSite2 = dB.d("C", (Object)objectArray3, (long)-4405934949675475093L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l4;
        objectArray4[1] = (double)dB.d("\u00f8", (Object)callSite, (long)-4408460425530791252L, (long)l);
        objectArray4[0] = (double)dB.d("K", (Object)class_12972, (long)-4405594825042952396L, (long)l);
        CallSite callSite3 = dB.d("C", (Object)objectArray4, (long)-4405934949675475093L, (long)l);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l4;
        objectArray5[1] = (double)dB.d("\u00f8", (Object)callSite, (long)-4405748002681565743L, (long)l);
        objectArray5[0] = (double)dB.d("K", (Object)class_12972, (long)-4400850343212055805L, (long)l);
        CallSite callSite4 = dB.d("C", (Object)objectArray5, (long)-4405934949675475093L, (long)l);
        return new class_243((double)callSite2, (double)callSite3, (double)callSite4);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dB.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Color b(Object[] objectArray) {
        long l;
        long l2;
        int n;
        int n2;
        block5: {
            Object object;
            CallSite callSite;
            CallSite callSite2;
            Color color;
            block4: {
                color = (Color)objectArray[0];
                n2 = (Integer)objectArray[1];
                n = (Integer)objectArray[2];
                l2 = (Long)objectArray[3];
                l = (l2 = z ^ l2) ^ 0x184CE14C3628L;
                callSite2 = dB.d("K", (Object)color, (long)-2053659492311432984L, (long)l2);
                CallSite callSite3 = dB.d("C", (long)-2054626357045664635L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        object = s;
                        if (callSite3 != null) break block4;
                        if (callSite == object) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dB.d("C", (Object)matchException, (long)-2069578728331180981L, (long)l2);
                    }
                    callSite = dB.d("K", (Object)color, (long)-2054438639911696707L, (long)l2);
                    object = dB.d("K", (Object)color, (long)-2070405764977952022L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw dB.d("C", (Object)matchException, (long)-2069578728331180981L, (long)l2);
                }
            }
            dB.d("C", (int)callSite, (int)object, (int)dB.d("K", (Object)color, (long)-2068436910042020643L, (long)l2), (Object)r, (long)-2053929510901873732L, (long)l2);
            s = (int)callSite2;
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        float f = 0.5f + 0.5f * dB.d("C", (float)(((float)(dB.d("C", (Object)objectArray2, (long)-2055635294493084334L, (long)l2) % dB.c("i", (int)5250, (long)(0x5A5E30D547263AC7L ^ l2))) / 1000.0f + (float)n2 / (float)n * 2.0f) % 2.0f - 1.0f), (long)-2071458878281062995L, (long)l2);
        return new Color((int)dB.d("C", (float)r[0], (float)r[1], (float)dB.d("C", (float)f, (float)1.0f, (long)-2054816888752859495L, (long)l2), (long)-2068133691342297670L, (long)l2));
    }

    public static void x(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        float f13 = ((Float)objectArray[4]).floatValue();
        float f14 = ((Float)objectArray[5]).floatValue();
        float f15 = ((Float)objectArray[6]).floatValue();
        float f16 = ((Float)objectArray[7]).floatValue();
        float f17 = ((Float)objectArray[8]).floatValue();
        Matrix4f matrix4f = (Matrix4f)objectArray[9];
        bW bW2 = (bW)objectArray[10];
        Color color = (Color)objectArray[11];
        long l = (Long)objectArray[12];
        long l2 = (l = z ^ l) ^ 0x335EF01CFFEFL;
        Object[] objectArray2 = new Object[15];
        objectArray2[14] = l2;
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
        objectArray2[2] = matrix4f;
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)2322818758184837480L, (long)l);
    }

    public static void s(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = z ^ l) ^ 0x295A8F8EF06DL;
        CallSite callSite = dB.d("K", (Object)color, (long)9007703452388269718L, (long)l);
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)callSite;
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = q;
        dB.d("C", (Object)objectArray2, (long)9009230500194095384L, (long)l);
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = l2;
        objectArray3[5] = (int)callSite;
        objectArray3[4] = Float.valueOf(f10);
        objectArray3[3] = Float.valueOf(f11);
        objectArray3[2] = Float.valueOf(f12);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = q;
        dB.d("C", (Object)objectArray3, (long)9009230500194095384L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D23;
        if (H[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = G[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])I.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    I.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dB", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            dB.H[n2] = l4;
        }
        return H[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = dB.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    public static class_243 c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = z ^ l) ^ 0x712B0DC43C81L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dB.d("K", (Object)b, (long)-3318685405464813315L, (long)l);
        return dB.d("C", (Object)objectArray2, (long)-3331687306032555651L, (long)l);
    }

    public static void c(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = z ^ l) ^ 0x4FC66DB8AC23L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)dB.d("K", (Object)color, (long)7183768642160590886L, (long)l);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        dB.d("C", (Object)objectArray2, (long)7173247779693750190L, (long)l);
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

    public static void n(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        float f13 = ((Float)objectArray[6]).floatValue();
        long l = (Long)objectArray[7];
        long l2 = (l = z ^ l) ^ 0x45F17DFCFA82L;
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = l2;
        objectArray2[6] = dB.d("K", (Object)t, (float)f13, (long)1205678016766599144L, (long)l);
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        dB.d("C", (Object)objectArray2, (long)1203706334377135059L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = dB.e(l, l2);
        Object object = J[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = K[n];
                int n3 = string2.indexOf(8);
                clazz3 = dB.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dB.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dB.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dB.J[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dB.f(4096329071451717L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dB.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dB.J[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dB.f(4096329071451717L, 0L);
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

    public static void h(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        float f13 = ((Float)objectArray[5]).floatValue();
        long l = (Long)objectArray[6];
        long l2 = (l = z ^ l) ^ 0x1FF7E462CACDL;
        Color color2 = new Color(1.0f, 1.0f, 1.0f, f13);
        Color color3 = new Color((float)dB.d("K", (Object)color, (long)7312770236733620412L, (long)l) / 255.0f, (float)dB.d("K", (Object)color, (long)7297370528441302251L, (long)l) / 255.0f, (float)dB.d("K", (Object)color, (long)7298761246450844380L, (long)l) / 255.0f, f13);
        Color color4 = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        Color color5 = new Color(0.0f, 0.0f, 0.0f, f13);
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l2;
        objectArray2[7] = color2;
        objectArray2[6] = color3;
        objectArray2[5] = color3;
        objectArray2[4] = color2;
        objectArray2[3] = Float.valueOf(f12);
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)7299055792187989508L, (long)l);
        Object[] objectArray3 = new Object[9];
        objectArray3[8] = l2;
        objectArray3[7] = color4;
        objectArray3[6] = color4;
        objectArray3[5] = color5;
        objectArray3[4] = color5;
        objectArray3[3] = Float.valueOf(f12);
        objectArray3[2] = Float.valueOf(f11);
        objectArray3[1] = Float.valueOf(f10);
        objectArray3[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray3, (long)7299055792187989508L, (long)l);
    }

    public static void f(Object[] objectArray) {
        Color color;
        Color color2;
        Color color3;
        Color color4;
        float f;
        float f10;
        float f11;
        float f12;
        Color color5;
        long l;
        long l2;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        float f13;
        float f14;
        float f15;
        float f16;
        block13: {
            float f17;
            float f18;
            block12: {
                f16 = ((Float)objectArray[0]).floatValue();
                f15 = ((Float)objectArray[1]).floatValue();
                f14 = ((Float)objectArray[2]).floatValue();
                f13 = ((Float)objectArray[3]).floatValue();
                bl4 = (Boolean)objectArray[4];
                bl3 = (Boolean)objectArray[5];
                bl2 = (Boolean)objectArray[6];
                bl = (Boolean)objectArray[7];
                f18 = ((Float)objectArray[8]).floatValue();
                l2 = (Long)objectArray[9];
                l = (l2 = z ^ l2) ^ 0x239A85D88966L;
                color5 = u;
                CallSite callSite = dB.d("C", (long)2473851318021105069L, (long)l2);
                try {
                    try {
                        f17 = f18;
                        if (callSite != null) break block12;
                        if (f17 == w) break block13;
                    }
                    catch (MatchException matchException) {
                        throw dB.d("C", (Object)matchException, (long)2481205771903780195L, (long)l2);
                    }
                    f17 = f18;
                }
                catch (MatchException matchException) {
                    throw dB.d("C", (Object)matchException, (long)2481205771903780195L, (long)l2);
                }
            }
            w = f17;
            x = new Color(0.0f, 0.0f, 0.0f, f18);
        }
        Color color6 = x;
        try {
            f12 = f16;
            f11 = f15;
            f10 = f14;
            f = f13;
            color4 = bl4 ? color6 : color5;
        }
        catch (MatchException matchException) {
            throw dB.d("C", (Object)matchException, (long)2481205771903780195L, (long)l2);
        }
        try {
            color3 = bl3 ? color6 : color5;
        }
        catch (MatchException matchException) {
            throw dB.d("C", (Object)matchException, (long)2481205771903780195L, (long)l2);
        }
        try {
            color2 = bl2 ? color6 : color5;
        }
        catch (MatchException matchException) {
            throw dB.d("C", (Object)matchException, (long)2481205771903780195L, (long)l2);
        }
        try {
            color = bl ? color6 : color5;
        }
        catch (MatchException matchException) {
            throw dB.d("C", (Object)matchException, (long)2481205771903780195L, (long)l2);
        }
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l;
        objectArray2[7] = color;
        objectArray2[6] = color2;
        objectArray2[5] = color3;
        objectArray2[4] = color4;
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f11);
        objectArray2[0] = Float.valueOf(f12);
        dB.d("C", (Object)objectArray2, (long)2478935009786151881L, (long)l2);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dB.e(l, l2);
            object = J[n];
            try {
                if (!(object instanceof String)) break block2;
                dB.J[n] = clazz = Class.forName(K[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void l(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        float f13 = ((Float)objectArray[6]).floatValue();
        long l = (Long)objectArray[7];
        long l2 = (l = z ^ l) ^ 0xD977B5AF30BL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(0.25f);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = color;
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)-3991452960400415209L, (long)l);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dB.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dB.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dB.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dB.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void d(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = z ^ l) ^ 0x48EB923C2382L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = color;
        objectArray2[3] = Float.valueOf(1.0f);
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)-6644301940944549169L, (long)l);
    }

    public static Color a(Object[] objectArray) {
        long l;
        long l2;
        int n;
        int n2;
        block5: {
            Object object;
            CallSite callSite;
            CallSite callSite2;
            Color color;
            block4: {
                color = (Color)objectArray[0];
                n2 = (Integer)objectArray[1];
                n = (Integer)objectArray[2];
                l2 = (Long)objectArray[3];
                l = (l2 = z ^ l2) ^ 0xAA11954405BL;
                callSite2 = dB.d("K", (Object)color, (long)-7706506138435225957L, (long)l2);
                CallSite callSite3 = dB.d("C", (long)-7705778967403621642L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        object = s;
                        if (callSite3 != null) break block4;
                        if (callSite == object) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dB.d("C", (Object)matchException, (long)-7695398382482361800L, (long)l2);
                    }
                    callSite = dB.d("K", (Object)color, (long)-7706160215596306226L, (long)l2);
                    object = dB.d("K", (Object)color, (long)-7694573682348716903L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw dB.d("C", (Object)matchException, (long)-7695398382482361800L, (long)l2);
                }
            }
            dB.d("C", (int)callSite, (int)object, (int)dB.d("K", (Object)color, (long)-7694261995713072466L, (long)l2), (Object)r, (long)-7706244933189306929L, (long)l2);
            s = (int)callSite2;
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        CallSite callSite = dB.d("C", (float)(((float)(dB.d("C", (Object)objectArray2, (long)-7706793131292523743L, (long)l2) % dB.c("i", (int)3536, (long)(0x5070A9490421D5E7L ^ l2))) / 1000.0f + (float)n2 / (float)n * 2.0f) % 2.0f - 1.0f), (long)-7695629432494353442L, (long)l2);
        return new Color((int)dB.d("C", (float)r[0], (float)r[1], (float)(0.25f + 0.75f * callSite), (long)-7692269451217071159L, (long)l2));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dB.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA7F;
        if (B[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])C.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    C.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dB", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = A[n2].getBytes("ISO-8859-1");
            dB.B[n2] = dB.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return B[n2];
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

    private static void a() {
        Object[] objectArray = J;
        J[0] = "RtO2+1DtJh8&S?In42Bx^y\u007f%w";
        objectArray[1] = "^QGRJZ+qL][\u0015J\u007fGV_O>";
        objectArray[2] = Void.TYPE;
        dB.K[2] = "java/lang/Void";
        objectArray[3] = "9\n^^,M/\n[\u0004?Z8AX\u00023N)\u0006O\u0015x\\\u0015";
        objectArray[4] = "\u001a\u000bN~+Yo+Eq:\u0016\u00123Vv3_z";
        objectArray[5] = "\u0000KgY&\u000b\u0016Kb\u00035\u001c\u0001\u0000a\u00059\b\u0010Gv\u0012r\u001f&";
        objectArray[6] = "!VY#\u0000\u001bTvR,\u0011T5xY'\u0015\u000eA";
        objectArray[7] = "\u0006t\u0014(-r\r{\u0005gN\u007f\u0018v\n\f{}\te\u0016 lp";
        objectArray[8] = "2m\u0002\u0007I\u0014GM\t\bX[&C\u0002\u0003\\\u0001R";
        objectArray[9] = "2z@fIW/o\u0018D\bZ7i";
        objectArray[10] = Integer.TYPE;
        dB.K[10] = "java/lang/Integer";
        objectArray[11] = "oJ#\u0017\u0005K\u001aj(\u0018\u0014\u0004{d#\u0013\u0010^\u000f";
        objectArray[12] = "\u000e,DCw-\u0018,A\u0019d:\u000fgB\u001fh.\u001e U\b#9\u001a";
        objectArray[13] = "fH\n\u0018<\u0007\u0013h\u0001\u0017-Hrf\n\u001c)\u0012\u0006";
        objectArray[14] = Long.TYPE;
        dB.K[14] = "java/lang/Long";
        objectArray[15] = "8j\u001a?vL3e\u000bp\u000bY!\u007f\t3";
        objectArray[16] = "DH\u001c6<O1h\u00179-\u0000Pf\u001c2)Z$";
        objectArray[17] = Float.TYPE;
        dB.K[17] = "java/lang/Float";
        objectArray[18] = "E\u0007{\u001cM\u007f0'p\u0013\\0Q){\u0018Xj%";
        objectArray[19] = "\u00054?`\u0006O\u00134::\u0015X\u0004\u007f9<\u0019L\u00158.+R[\r";
        objectArray[20] = "X(h*;m-\bc%*\"L\u0006h..x8";
        objectArray[21] = "%\u001a_:J\u0005P:T5[J14_>_\u0010E";
        objectArray[22] = "\u0004J\b#\u000e9\u0006TA[\u00015\u001fW\u001d9\u0002";
        objectArray[23] = "}\"ou8?\b\u0002dz)pi\foq-*\u001d";
        objectArray[24] = "Zh)_\f5Zh>\u0003\u0000:@#>\u001d\u0000/GRlCXk";
        objectArray[25] = Double.TYPE;
        dB.K[25] = "java/lang/Double";
        objectArray[26] = "\u0012B\u007f?W\u0011\u0004BzeD\u0006\u0013\tycH\u0012\u0002Nnt\u0003\u0002N";
        objectArray[27] = "&KQ(m\u0005SkZ'|J2eQ,x\u0010F";
        objectArray[28] = "[7i@9\u000b[7~\u001c5\u0004A|~\u00025\u0011F\r/Zg";
        objectArray[29] = "z\u000f\fhHP\u000f/\u0007gY\u001fn!\fl]E\u001a";
        objectArray[30] = "q\tw3{F\u0004)|<j\te'w7nS\u0011";
        objectArray[31] = "\u0018t>i\u00159mT5f\u0004v\fZ>m\u0000,x";
        objectArray[32] = "M\u0006t\"FO8&\u007f-W\u0000Y(t&SZ-";
        objectArray[33] = "F~r%\u0000XCky%\u0003_LbrgBhe=$";
        objectArray[34] = "\u001a{";
        objectArray[35] = "\u0011\u0000\u007fb\u0017Y\u0011\u0000h>\u001bV\u000bKh \u001bC\f:8}J";
        objectArray[36] = "/xd?#b/xsc/m53s}/x2B!!z:";
        objectArray[37] = "m37\u001e~\r\u0018\u0013<\u0011oBy\u001d7\u001ak\u0018\r";
        objectArray[38] = "0S";
        objectArray[39] = "\u001c:`\u0007\u001d^\u001e$)d\u0016E\u0001!\u007f\u001d\u0011R";
        objectArray[40] = "\u001b3\u0017=[d\u0019-^ETh\u0000.\u0002 W";
        objectArray[41] = " W\u0019`\r\u0003 W\u000e<\u0001\f:\u001c\u000e\"\u0001\u0019=mUwX";
        objectArray[42] = "#z\u0011\u001d|\u0019#z\u0006Ap\u001691\u0006_p\u0003>@Q\u0002)D";
        objectArray[43] = "84\u0002L\u0019\u0005:*K/\u0012\u001e%/\u001dV\u0015";
        objectArray[44] = "Aa";
        objectArray[45] = "\fFvA\u0016\u001a\fFa\u001d\u001a\u0015\u0016\ra\u0003\u001a\u0000\u0011|3_NJ";
        objectArray[46] = "/q}3PA/qjo\\N5:jq\\[2K;$\u000b\u0018";
        objectArray[47] = "\u0018\u000bH\r.0m+C\u0002?\u007f\f%H\t;%x";
        objectArray[48] = "\u001d.<yZfh\u000e7vK)\t\u0000<}Os}";
        objectArray[49] = "\u0019H|4\u001crlhw;\r=\rf|0\tgy";
        objectArray[50] = "A\u0010T<^040_3O\u007fU>T8K%!";
        objectArray[51] = "M{\u0003dW\u00118[\bkF^YU\u0003`B\u0004-";
        objectArray[52] = "*#";
        objectArray[53] = "zt";
        objectArray[54] = "\u001f(r3O^j\by<^\u0011\u000b\u0006r7ZK\u007f";
        objectArray[55] = "1\u0007m>RD:\b|q1I/\u000e";
        objectArray[56] = "z\u0018IUJfz\u0018^\tFi`S^\u0017F|g\"\fL\u001e6";
        objectArray[57] = "IE*ovtIE=3z{S\u000e=-znT\u007fgr(,";
        objectArray[58] = "m\"8u?vf-):^xm&-`";
        objectArray[59] = ";Yn\u000bZ$;YyWV+!\u0012yIV>&c#\u0016\u0004y";
        objectArray[60] = "]>5X$\b]>\"\u0004(\u0007Gu\"\u001a(\u0012@\u0004vA\u007fU";
        objectArray[61] = "*rkI&[_R`F7\u0014>\\kM3NJ";
        objectArray[62] = "z^K\r\u0011\u0012\u000f~@\u0002\u0000]npK\t\u0004\u0007\u001a";
        objectArray[63] = "\u0005\r\\X1O\u0005\rK\u0004=@\u001fFK\u001a=U\u00187\u0019Ae\u0014";
        objectArray[64] = "}=)\u0001nqv28N\u0013ie51\u0007";
        objectArray[65] = "LGQ\"9\tLGF~5\u0006V\fF`5\u0013Q}\u0014<aX";
        objectArray[66] = "n\u001e\u0004k,Fx\u001e\u00011?QoU\u000273E~\u0012\u0015 xT]";
        objectArray[67] = "p\u0016\u000emQD\u00056\u0005b@\u000bd8\u000eiDQ\u0010";
        objectArray[68] = Boolean.TYPE;
        dB.K[68] = "java/lang/Boolean";
        objectArray[69] = "\\Rd+KR)ro$Z\u001dH|d/^G<";
        objectArray[70] = "/\u007f=C,\u001c9\u007f8\u0019?\u000b.4;\u001f3\u001f?s,\bx\u000f's.\u0003\"B\u001bh.\u001e\"\u0005,\u007f";
        objectArray[71] = "@gqstCVgt)gTA,w/k@Pk`8 Pg";
        objectArray[72] = "C&=2\u0011Q6\u00066=\u0000\u001eW\b=6\u0004D#";
        objectArray[73] = "Y\u0017B\u001fX2O\u0017GEK%X\\DCG1I\u001bST\f!|";
        objectArray[74] = "\u001e/P47\n\u001e/Gh;\u0005\u0004dGv;\u0010\u0003\u0015\u0015+lZG";
        objectArray[75] = "\u001f-g\u0015# j\rl\u001a2o\u000b\u0003g\u001165\u007f";
        objectArray[76] = "wa\u0012,\u0012\u001f\u0002A\u0019#\u0003PcO\u0012(\u0007\n\u0017";
        objectArray[77] = "GS.|U4GS9 Y;]\u00189>Y.Zine\u000bm";
        objectArray[78] = "\u0018\u001dUV\n`\u0018\u001dB\n\u0006o\u0002VB\u0014\u0006z\u0005'\u0016AU;";
        objectArray[79] = "\u001ah;\u0007DO\u001ah,[H@\u0000#,EHU\u0007Rx\u0010\u001b\u0015";
        objectArray[80] = "\\\u0007))fS)'\"&w\u001cH))-sF<";
        objectArray[81] = "NsxP\u001b\u001b;Ss_\nTZ]xT\u000e\u000e.";
        objectArray[82] = "\u0014J;Au\u0004aj0NdK\u0000d;E`\u0011t";
        objectArray[83] = "%\u0013 \u0018/\u0017P3+\u0017>X1= \u001c:\u0002E";
        objectArray[84] = "_,\u0012>-'*\f\u00191<hK\u0002\u0012:82?";
        objectArray[85] = "\u001eI\u001aWuI\u001eI\r\u000byF\u0004\u0002\r\u0015yS\u0003sWN/\u0019";
        objectArray[86] = "\u000e\u001cOR\u0016Z{<D]\u0007\u0015\u001a2OV\u0003On";
        objectArray[87] = "T\np'\u0013#!*{(\u0002l@$p#\u000664";
        objectArray[88] = "'(GZ<aqw\n^Mg-6VX!Uzp\b\u000fv\u00028 D_3p?pF\u0003M";
        objectArray[89] = "4*R\u0010ka.(\u0010\n\u001bc')I\twQtm\u0017S&\u0006seL\u0000e<+1@P%\u0006seL\u0000e<+1@P%\u00064*R\u0010ka.(\u0010\n\u001b";
        objectArray[90] = "\u0010\u001d,tH\u0004PWz{]4LA>jDX~\u0010\u007f:\u001e\r)\u0015\u007fnZQ\u0013N>`\u001cI)";
        objectArray[91] = "\u001fE\u0003pv\u0014I\u0004\u0003O\u0007jL]T/s\u0016\u001bAG$*jL][.u\t\u0018P]6M";
        objectArray[92] = ">G\u0019}NAh\u0006\u0019B\b?m_N\"KC:C])\u0012?m_A#M\\9RG;u";
        objectArray[93] = "\nI\u0005\u0005@6\u0001\b\u000f\u001e\"%\tX\n\u000furS\bWcB!\u001aGP\u0012KzUW";
        objectArray[94] = "x*LC\u007f\u00068`\u001aLj6$v^]sZ\u0016'\u001f\f/6+j\u001eS{J|+KP\u0014";
        objectArray[95] = "8\u001e\u000f0\u001c\u0012xTY?\t\"dB\u001d.\u0010NV\u0013\\qJ\"k^] \u0018^<\u001f\b#w";
        objectArray[96] = "e\u0016j7\bvb\u00005wmaf\u0005\u0005l\u001c&e\u0016y;]sfyki\u0002+n\u0015l\u007f]k\u000b";
        objectArray[97] = "R^|y tH\\>cPvA]g`<D\u0015\u001b7<n\u0013\u0015\u0011bi.)MEn9n\u0013";
        objectArray[98] = "$\u00189 H3y\u001e0%!\u0010U4\"\"a\u0011P~ax\u0018.zO4'@0\u001aAc|E*+\u0014<$[J%Cg!A{p\u001c??!s#B<,Prt\u0003%<!s#B<,Prt\u0003%<!";
        objectArray[99] = "O\u001cLx\\6\u0019C\u0001|-0E\u0002]zA\u0002\u0017D\u0002%\u0016U\u0011\u0010X`\u00105M\u0005\u0006~SU";
        objectArray[100] = "uDAW\u000bYr\u0014C\u000buN`RSP\u0019|1\u0013\u000b\bu\u00140\u0017WWDAoOI7";
        objectArray[101] = "[&?>\u001d0]\"oga2Y#0=\r\u0000\u000edkcQWT5\"(_&]nm8a";
        objectArray[102] = "\u001dSlbj#@Ueg\u00035NIQHIZ\u001c\b2cckIWj}\u0003";
        objectArray[103] = "7?\u001f=&I(0G(\u001fP'/&+sJ(3F)uH*S[=&Gs1D2~RJ";
        objectArray[104] = "uuk~EAsl 6Mp\"v=+L'p.ip\u0010puvo1\u001c\u001a,+/%\u0011";
        objectArray[105] = ">*\u0004)B\b~`R&W8bv\u00167NTP'Wf\u00158mjV9FD:+\u0003:)";
        objectArray[106] = "Ui\u007fp\tq\u0011t?1\u001e\u0010\tb>k\u0000|;1z5\\/l6(n\\`]vz1\u000ezle37\t\u007f\u00102rb\n\u0010";
        objectArray[107] = "7F|3w&aH8+\t7\r\u001d-5{4gT|*4]";
        objectArray[108] = ">\u0005\u0001Q[\f\"\u001b\u0004Te\u007fR]\\\u0005\u0005\f.\n@\u0016\u000eUR]\\\n\u0004\n1\tQ\f\u001c2";
        objectArray[109] = "rWWe%%/Q^`L3!Mjm \\s\f\td,m&SQzL";
        objectArray[110] = "Sd\u00049i\u000b\n?\u0001>\u0002\u001ao`\u0007+bM\u00137\u001b8i\u0014of]~f\u0013^3\u0002&xs";
        objectArray[111] = "i-\u0006OS\u00190v\u0003H8\u0007U)\u0005]X_)~\u0019NS\u0006U)\u0005RYY6}\bTAa";
        objectArray[112] = "a\u0011GG`j7PGx\u0012\u00142\t\u0010\u0018ehe\u0015\u0003\u0013<\u00142\t\u001f\u0019cwf\u0004\u0019\u0001[";
        objectArray[113] = "'\u001a>oz<u\u001em7k\u0006{L-ocjI\u001ah24>\u001e\u001el6`f/K3n~\u0006";
        objectArray[114] = "\u0000\u001f\tg\u0015AV@DcdG\n\u0001\u0018e\bu^@F;dY\u001c\u001e\u0019f\u001fK\u0002\r\u0012\u0002";
        objectArray[115] = "\u001axwy^>L':}/8\u0010ff{C\nD'8$/2\u0004ub`H4\u0000%;\u001c";
        objectArray[116] = "k3`9mk2he>\u0006cW7c+f-+`\u007f8mtW7c$g+4cn\"\u007f\u0013";
        objectArray[117] = "YT\u001fU5M\u0019\u0005\b\u0011q \t8_Jb@^D\bVqK\u00078_C2X\nT\nUq\u0010X8";
        objectArray[118] = "#~\u0014sW8h8@8OA\u007f%I\u0003W0&*@\u007f\u0000qs)/iL}t+S>\r(wDEr\u0001/u8\u00123T,\u001a";
        objectArray[119] = "'l\u0004Uc\u0016;r\u0001P]BK4Y\u0001=\u00167cE\u00126OK4Y\u000e<\u0010(`T\b$(";
        objectArray[120] = "-x\u001a\u0019c}*nEY\u0006cC}\u0004\u0014h~?*EAk\u0011";
        objectArray[121] = "G\u0018\u001b\u0019d7\u0018\u0015\\\u0005\u001d9&CA\u000e}lZ\u0014]\u001dv5&\u0018Z\t{0[\u0013\u001b\u0003`R";
        objectArray[122] = "\u001f<Q\u001ashFgT\u001d\u0018y#8R\bx._oN\u001bsw#h\u000eZxuYnJX%\u0010";
        objectArray[123] = "FJ{P\f)M\u000bqKn:E[tZ9m\u001f\u000b(6\u000e>VD.G\u0007e\u0019T";
        objectArray[124] = "\\.\r\u001bH-\t8NS\u001aA\u000e@\b\u0004N![<_\u0018]*\u0002@[\u0012\u001e/\n<\fSK,e";
        objectArray[125] = "/\u00117q~\u0003yP7N<}|\t`.{\u0001+\u0015s%\"}|\to/}\u001e(\u0004i7E";
        objectArray[126] = "\u0016V\u000bm[[O\r\u000ej0J*R\b\u007fP\u001dV\u0005\u0014l[D*\u000b\u0005aB\u001d[\u0002^.R#";
        objectArray[127] = "F\u0015 V)\u0014\u0010T i`j\u0015\rw\t,\u0016B\u0011d\u0002uj\u0015\rx\b*\tA\u0000~\u0010\u0012";
        objectArray[128] = "$dE\u0005[\\r%E:\u001c\"w|\u0012Z^^ `\u0001Q\u0007\"w|\u001d[XA#q\u001bC`";
        objectArray[129] = "Aw/+*F\u0018*o?',\u001d{l5q@//(o,\u0015x/,>.^\u001cv*hqHxho.h\\\u001frmlr,";
        objectArray[130] = "\u001b2Z|b,I6\t$s\u0016GdI|{zu6\u0004 #\u0016\u001d4\fx|'HkTf\u001c";
        objectArray[131] = "{^0\u000bw\u0001g@5\u000eI@\u0017\u0006m_)\u0001kQqL\"X\u0017\u0006mP(\u0007tR`V0?";
        objectArray[132] = "/H\u000f\u0000Pbv\u0013\n\u0007;s\u0013H\u0005\u0014T!t\u001eQ\u000eZ\u001a.\u001b\u0001\u0011\u0000}xO\u001b\u001f;";
        objectArray[133] = "*W(PG&7\u0012lR76PG \u000bY(,\u0010a^Z";
        objectArray[134] = "$F\u0003x\u001f~qP@0M\u0012b(\u0006g\u0019r#TQ{\nyz(\u0006g\u0016s%KRj\u0010k\u001d";
        objectArray[135] = ")6\u0014:7N\u007fiY>FH#(\u00058*zpmTax-w2X$(L3/\u0018e?-";
        objectArray[136] = "1\u0011FLSzl\u0017OI:lb\u000bnSWniw\u001e\u0014\u0003goFKK[y\u000f";
        objectArray[137] = "4e\u0005-!jfaVu0Ph3\u0016-8<ZcZsnl\rgQ3a/49U.9n\rgV&g\"i>Pp84\r";
        objectArray[138] = "\ti:7I\u000e\u000ed1\"\u001db^57)\u001a5\rhc|Gb\to$s\t[Wk9+H";
        objectArray[139] = "i|p?qD4~3e\u0015PhCc#TYpaa2oA\f33fq_=fl>o?qvj<eAm2n8\u0015\u0006koogvRfiw_";
        objectArray[140] = ";)G\"\u000fgmhG\u001dD\u0019h1\u0010}\ne?-\u0003vS\u0019h1\u001f|\fz<<\u0019d4";
        objectArray[141] = "6xt'X7$fg,<\",ns*kps3)F@4q~h%F<p?";
        objectArray[142] = "\u001f!\u0013\u0005\u0018\u000bI`\u0013:huL9DZ\u001d\t\u001b%WQDuL9K[\u001b\u0016\u00184MC#";
        objectArray[143] = "V=}~'D\u00143k8'&\u0003\f9%0FQpn9#M\b\f9s!\u001a\u0014n{}7\\\u0014\f";
        objectArray[144] = "Ar5ll+\u001735S&U\u0012jb3i)Evq80U\u0012jm2o6Fgk*W";
        objectArray[145] = "E$]pB(D R.\u0017I\u0017O\u0006\u007f_1G\"F.Hu\u0003";
        objectArray[146] = "\u0002Q$\u0016o\u000e[\n!\u0011\u0004\u001f>U'\u0004dHB\u0002;\u0017o\u0011>\u00061Tj\u0019BQp\u0001iv";
        objectArray[147] = "^L\u001b|\bA\u001e\u0006Ms\u001dq\u0002\u0010\tb\u0004\u001d0AH=\\q\r\fIl\f\rZM\u001coc";
        objectArray[148] = "\u0011\u0019n$!\tHBk#J\u0018-\u001dm6*OQJq%!\u0016-Yp>)\u0001SE4:-q";
        objectArray[149] = ",#b6-\"+5=vH+?(\r}$/ ,m\u007f\"-\"Lch'\u007f' d~x?B";
        objectArray[150] = "G\"\u001cm\u00187ZgXoh&=2\u00146\u00069AeUc\u0005";
        objectArray[151] = "9c`\u0000z_>u?@\u001fCWf~\rq\\+1?Xr3";
        objectArray[152] = "T\u0013H6\u0015`IV\f4es.\u0003@m\u000bnRT\u00018\b";
        objectArray[153] = "\u0002\u0006H-\u000e\u0018\u001e\u0018M(0Jn^\u0015yP\u0018\u0012\t\tj[An^\u0015vQ\u001e\r\n\u0018pI&";
        objectArray[154] = "%\tkDjf:\u00063QS|\"\u00020E8xX\u000f#\u0014=k$XbA>\u00042\u0014nF<xeU;ESn)Y<G/9h\f?(.~<\u0006\"V2:8\u0002RR)}?\u00153Ol9=e(R*c(\u00045\u0017naX";
        objectArray[155] = "Vtv|a0\u001d2\"7yI\u0006$6\fa8S \"p6y\u0006#Mfzu\u0001!11; \u0002N";
        objectArray[156] = "\f$BUA\rZeBj\u0005s_<\u0015\nD\u000f\b \u0006\u0001\u001ds_<\u001a\u000bB\u0010\u000b1\u001c\u0013z";
        objectArray[157] = "\u0001'1'a9\u0007/0f\u001e?\u0010#m=r\rBf4g Z\u001f#f<|'\u0014bl'\u001e";
        objectArray[158] = "S@\u0012\u0007}xAD\u001e\u001eCxGF\u0014\f%of]\u000b\f\u0006r^X\u000f\u001aCz\u0001\u0002\u000e\u00049|E\u0000Sa";
        objectArray[159] = "\u0000\\\u001de\u001c\"X\b\u00115\\\u0018T\u0015\u0005b\u0006c9UD`Zj]\fB6\u0005|9U\u0012nYh\b\u0015@1\u000br9";
        objectArray[160] = "\u0003i\u00172eFQmDjt|_?\u00042|\u0010miAo$M:mEk\u007f\u001c\u000b8\u001a3a|";
        objectArray[161] = "zk\u0017r\fT|oG+pVxn\u0018q\u001cd/)C,I3ux\ndNB|#Etp";
        objectArray[162] = "eTJc2M3\u0015J\\m36L\u001d<7OaP\u000e7n36L\u0012=1PbA\u0014%\t";
        objectArray[163] = "83oi\"uahjnIb\u00047l{)3x`ph\"j\u00047lt(5gcar0\r";
        objectArray[164] = "u,M\u001e\u0017L#s\u0000\u001afJ\u007f2\\\u001c\nx+s\u0001BfHp?Y\n\u0005\u001e/r]{";
        objectArray[165] = "MOy\u001f\u0007 \u0016\u000ewY\u001f\u001a\u0011\u001fa\u0006\u0005v#N V[$t\fb\u001d\u001cj\u0013\u0016`_\u0006\u001a";
        objectArray[166] = ":\u001d7.h\fh\u0019dvy6fK$.qZT\u0019iv'6:\u0019$+.\u000e9Icv*6";
        objectArray[167] = "#qn\u0004\rL9s,\u001e}N0ru\u001d\u0011|d4%AG+d>p\u0014\u0003\u0011<j|DC+";
        objectArray[168] = ">g(u\u0002[!hp`;\\>o\u0011cWX!kqaQZ#\u000blu\u0002UziszZ@C";
        objectArray[169] = "pywr)\nv}'+U\br|xq9:%;#/jm\u007fjjdk\u001cv1%tU";
        objectArray[170] = "FE\u0004 M\"\u0014AWx\\\u0018\u001a\u0013\u0017 Tt(ER}\f(\u007fG\u0001%\bhN\u0007SzZr\u007f";
        objectArray[171] = "F\u0016c\u001d\u001e?\u001b\u0010j\u0018w\u0006#:x\u001f-\t2pn\tK(\u0017\f9H\u001e+x\u001auD\u0019)\u0004M4\u0011\u001aF\u0012\u00018\u0016\u0018:E@m\u0015wyEI`\u0018F,\u001a\u0011~x";
        objectArray[172] = "K\u000b1$s\u0014\u000bAg+f$\u0017W#:\u007fH%\u0006bj%\u001erD !fT\u0015^\"c|$";
        objectArray[173] = "D\u001d_4\u0017+\u0012\\_\u000bNU\u0017\u0005\bk\u0012)@\u0019\u001b`KU\u0017\u0005\u0007j\u00146C\b\u0001r,";
        objectArray[174] = "[\u00160/\b\u001a\u0003B<\u007fH \u001cO1<\u001bg\f&j|OD\u0002\u0017?#\u0017Zb\u001fe$\u0018^XG1(H\u001eb";
        objectArray[175] = "s}\fj&l'~IoKhC(T;+??\u007fH( fCx\bi+d9~Lkv\u0001";
        objectArray[176] = "=\u0005!pF\u0014kD!O\u001bjn\u001dv/C\u00169\u0001e$\u001ajn\u001dy.E\t:\u0010\u007f6}";
        objectArray[177] = "q8\f\u0019U\t,>\u0005\u001c</\u000f\u001f71<N)9\u000e\u0015E\u0013/0\u000b";
        objectArray[178] = "zJ_`)t/\\\u001c({\u0018*$Z\u007f/x}X\rc<s$$\ti\u007fv,X^(*uC";
        objectArray[179] = "\u0016v(Kd\u0002\u0011&*\u0017\u001a\u0015\u0003`:Lv'R k\u0016\u001aOS%>K+\u001a\f} +";
        objectArray[180] = "\u001cliAs\u000fAj`D\u001a\u0019OvD@g\u001b\"53\u001d~\u0016\u0013`lE`v";
        objectArray[181] = "Dq\b\n\u0007p\u0018dV\u0014D\u0010\u0018r\u0011\u0017]|* VO\u0001(}&\r\rS,\u0005{\u0007\fD }&\\\u0019D{Mf\u0016OKn}";
        objectArray[182] = "Z ya\u0010D]6&!uY4%gl\u001bGHr&9\u0018(";
        objectArray[183] = ",6\bCLc+ W\u0003)t/%g\u0018X3,6\u001bO\u0019f/Y\r\u0003\u0015a-%ZB@bB3\u0016NG`>dW\u001bD\u000f(([\u001cFs\u007fi\u000e\u001f)a-6V\u0017Ef;i\u0016r";
        objectArray[184] = "7`&\n):hma\u0016P6V;|\u001d0a*l`\u000e;8V`g\u001a6=+k&\u0010-_";
        objectArray[185] = "AB2.k\u000f\u0017\u00032\u0011(q\u0012Zeqn\rEFvz7q\u0012Zjph\u0012FWlhP";
        objectArray[186] = "\u001e\u0003H>\u001eL\u0015BB%|_\u001d\u0012G4+\bGB\u0019X\u001c[\u000e\r\u001d)\u0015\u0000A\u001d";
        objectArray[187] = "\u0017uR|R&\u000faYf62\bf\\kabU7\u000686\"\u0016pFwQ8\u00142\\";
        objectArray[188] = "e\u00045\u001bW\n3E5$\u0012t6\u001cbDR\ba\u0000qO\u000bt6\u001cmET\u0017b\u0011k]l";
        Object[] objectArray2 = objectArray;
        objectArray[189] = "k)\u0012_\u0006dw7\u0017Z8\u0011\u0007qO\u000bXd{&S\u0018S=\u0007qO\u0004Ybd%B\u0002AZ";
    }

    private static double a(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = z ^ l) ^ 0x1C679362C2C8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return d10 + (d - d10) * (double)dB.d("C", (Object)objectArray2, (long)6120298007660873437L, (long)l);
    }

    public static class_243 a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = z ^ l) ^ 0xD0896BCAB83L;
        CallSite callSite = dB.d("\u00f8", (Object)dB.d("K", (Object)b, (long)4331289144562100591L, (long)l), (long)4333640480528685532L, (long)l);
        CallSite callSite2 = dB.d("K", (Object)dB.d("K", (Object)b, (long)4328349573606019352L, (long)l), (long)4332009952973236059L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        CallSite callSite3 = dB.d("C", (Object)objectArray2, (long)4333143720862123310L, (long)l);
        Vector3f vector3f = m;
        CallSite callSite4 = dB.d("K", (Object)callSite, (long)4332499619344754295L, (long)l);
        reference var11_9 = dB.d("\u00f8", (Object)class_2432, (long)4335248508673669718L, (long)l) - dB.d("\u00f8", (Object)callSite4, (long)4335248508673669718L, (long)l);
        reference var13_10 = dB.d("\u00f8", (Object)class_2432, (long)4327965677466375278L, (long)l) - dB.d("\u00f8", (Object)callSite4, (long)4327965677466375278L, (long)l);
        reference var15_11 = dB.d("\u00f8", (Object)class_2432, (long)4330675908557845267L, (long)l) - dB.d("\u00f8", (Object)callSite4, (long)4330675908557845267L, (long)l);
        CallSite callSite5 = dB.d("K", (Object)dB.d("K", (Object)n, (float)((float)var11_9), (float)((float)var13_10), (float)((float)var15_11), (float)1.0f, (long)4335425591685979820L, (long)l), (Object)f, (long)4333046825657605074L, (long)l);
        CallSite callSite6 = dB.d("K", (Object)k, (Object)d, (long)4332078651866783319L, (long)l);
        CallSite callSite7 = dB.d("K", (Object)dB.l, (Object)e, (long)4332078651866783319L, (long)l);
        dB.d("K", (Object)dB.d("K", (Object)callSite6, (Object)callSite7, (long)4336208626434300620L, (long)l), (float)dB.d("K", (Object)callSite5, (long)4333200087535775438L, (long)l), (float)dB.d("K", (Object)callSite5, (long)4335492723552958635L, (long)l), (float)dB.d("K", (Object)callSite5, (long)4330579136622733364L, (long)l), (Object)callSite3, (Object)vector3f, (long)4332994090476572051L, (long)l);
        return new class_243((double)(dB.d("\u00f8", (Object)vector3f, (long)4333253064788883219L, (long)l) / (float)dB.d("K", (Object)dB.d("K", (Object)b, (long)4328349573606019352L, (long)l), (long)4335729000949837945L, (long)l)), (double)(((float)callSite2 - dB.d("\u00f8", (Object)vector3f, (long)4334189454521815786L, (long)l)) / (float)dB.d("K", (Object)dB.d("K", (Object)b, (long)4328349573606019352L, (long)l), (long)4335729000949837945L, (long)l)), (double)dB.d("\u00f8", (Object)vector3f, (long)4332832191245451172L, (long)l));
    }

    private static long a(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = z ^ l;
                CallSite callSite = dB.d("C", (Object)new Object[0], (long)-7964144682951873809L, (long)l);
                CallSite callSite2 = dB.d("C", (long)-7977972824234518863L, (long)l);
                try {
                    try {
                        object = callSite;
                        if (callSite2 != null) break block4;
                        if (object == o) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dB.d("C", (Object)matchException, (long)-7965905848482990465L, (long)l);
                    }
                    o = (long)callSite;
                    p = (long)dB.d("C", (long)-7965195163466014495L, (long)l);
                }
                catch (MatchException matchException) {
                    throw dB.d("C", (Object)matchException, (long)-7965905848482990465L, (long)l);
                }
            }
            object = p;
        }
        return (long)object;
    }

    public static int a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = z ^ l;
        return n | dB.b("m", (int)26241, (long)(0x56A45785BF3A53E7L ^ l));
    }

    public static boolean a(Object[] objectArray) {
        Object object;
        block18: {
            block19: {
                CallSite callSite;
                long l;
                long l2;
                long l3;
                Matrix4f matrix4f;
                float f;
                float f10;
                float f11;
                class_1799 class_17992;
                block16: {
                    block17: {
                        CallSite callSite2;
                        CallSite callSite3;
                        long l4;
                        long l5;
                        long l6;
                        long l7;
                        long l8;
                        long l9;
                        block14: {
                            block15: {
                                class_2960 class_29602;
                                block13: {
                                    Object object2;
                                    block12: {
                                        class_17992 = (class_1799)objectArray[0];
                                        f11 = ((Float)objectArray[1]).floatValue();
                                        f10 = ((Float)objectArray[2]).floatValue();
                                        f = ((Float)objectArray[3]).floatValue();
                                        matrix4f = (Matrix4f)objectArray[4];
                                        l3 = (Long)objectArray[5];
                                        long l10 = l3 = z ^ l3;
                                        l2 = l10 ^ 0x8A9118BCA60L;
                                        l9 = l10 ^ 0x747DC3791FF2L;
                                        l8 = l10 ^ 0x5EE50BDAF3A0L;
                                        l7 = l10 ^ 0x183F8024B317L;
                                        l6 = l10 ^ 0x72FF389A68D5L;
                                        l5 = l10 ^ 0x519595CE0B29L;
                                        l = l10 ^ 0x145A9807525EL;
                                        l4 = l10 ^ 0x305E082D62DAL;
                                        class_29602 = (class_2960)dB.d("K", (Object)class_17992, (Object)dB.d("\u00a4", (long)487503615990990098L, (long)l3), (long)487298739704965566L, (long)l3);
                                        callSite = dB.d("C", (long)503157828745527554L, (long)l3);
                                        try {
                                            try {
                                                object2 = class_29602;
                                                if (callSite != null) break block12;
                                                if (object2 != null) break block13;
                                            }
                                            catch (MatchException matchException) {
                                                throw dB.d("C", (Object)matchException, (long)486514427905663436L, (long)l3);
                                            }
                                            object2 = dB.d("K", (Object)dB.d("\u00a4", (long)503115843406141548L, (long)l3), (Object)dB.d("K", (Object)class_17992, (long)488908333346805280L, (long)l3), (long)486701022103998546L, (long)l3);
                                        }
                                        catch (MatchException matchException) {
                                            throw dB.d("C", (Object)matchException, (long)486514427905663436L, (long)l3);
                                        }
                                    }
                                    class_29602 = object2;
                                }
                                class_4730 class_47302 = new class_4730(y, (class_2960)dB.d("C", (Object)dB.d("K", (Object)class_29602, (long)502497300491970883L, (long)l3), (Object)((String)((Object)dB.a("d", (int)19340, (long)(0x2A53D34451E1C713L ^ l3))) + (String)((Object)dB.d("K", (Object)class_29602, (long)488795088674996701L, (long)l3))), (long)501919350178848333L, (long)l3));
                                callSite3 = dB.d("K", (Object)dB.d("K", (Object)b, (long)502579793808646502L, (long)l3), (Object)class_47302, (long)489818556268572375L, (long)l3);
                                try {
                                    try {
                                        callSite2 = dB.d("K", (Object)dB.d("K", (Object)callSite3, (long)502117441264956439L, (long)l3), (long)488696648582250580L, (long)l3);
                                        if (callSite != null) break block14;
                                        if (dB.d("K", (Object)dB.d("K", (Object)callSite2, (long)488795088674996701L, (long)l3), (Object)dB.a("d", (int)25931, (long)(0xCE1801C6E6D69D5L ^ l3)), (long)488280586008433706L, (long)l3) == false) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw dB.d("C", (Object)matchException, (long)486514427905663436L, (long)l3);
                                    }
                                    return false;
                                }
                                catch (MatchException matchException) {
                                    throw dB.d("C", (Object)matchException, (long)486514427905663436L, (long)l3);
                                }
                            }
                            callSite2 = dB.d("K", (Object)callSite3, (long)489281745937751596L, (long)l3);
                        }
                        CallSite callSite4 = callSite2;
                        CallSite callSite5 = dB.d("K", (Object)callSite3, (long)503024157169724038L, (long)l3);
                        CallSite callSite6 = dB.d("K", (Object)callSite3, (long)487967462374442606L, (long)l3);
                        CallSite callSite7 = dB.d("K", (Object)callSite3, (long)501799542492360597L, (long)l3);
                        CallSite callSite8 = dB.d("K", (Object)callSite3, (long)501775287333199107L, (long)l3);
                        float f12 = 16.0f * f;
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l5;
                            objectArray2[0] = callSite4;
                            Object[] objectArray3 = new Object[13];
                            objectArray3[12] = l4;
                            objectArray3[11] = dB.d("\u00a4", (long)490092867774803572L, (long)l3);
                            objectArray3[10] = dB.d("C", (Object)objectArray2, (long)487157219915088136L, (long)l3);
                            objectArray3[9] = matrix4f;
                            objectArray3[8] = Float.valueOf(0.0f);
                            objectArray3[7] = Float.valueOf((float)((callSite8 - callSite7) * f12));
                            objectArray3[6] = Float.valueOf((float)((callSite6 - callSite5) * f12));
                            objectArray3[5] = Float.valueOf(f12 - callSite8 * f12);
                            objectArray3[4] = Float.valueOf((float)(callSite5 * f12));
                            objectArray3[3] = Float.valueOf(f12);
                            objectArray3[2] = Float.valueOf(f12);
                            objectArray3[1] = Float.valueOf(f10);
                            objectArray3[0] = Float.valueOf(f11);
                            dB.d("C", (Object)objectArray3, (long)503347837261927124L, (long)l3);
                            object = dB.d("K", (Object)class_17992, (long)486886845049561650L, (long)l3);
                            if (callSite != null) break block16;
                            if (object <= true) break block17;
                        }
                        catch (MatchException matchException) {
                            throw dB.d("C", (Object)matchException, (long)486514427905663436L, (long)l3);
                        }
                        CallSite callSite9 = dB.d("C", (int)dB.d("K", (Object)class_17992, (long)486886845049561650L, (long)l3), (long)489463447488775633L, (long)l3);
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l8;
                        Object[] objectArray5 = new Object[1];
                        objectArray5[0] = l8;
                        Object[] objectArray6 = new Object[2];
                        objectArray6[1] = l9;
                        objectArray6[0] = callSite9;
                        Object[] objectArray7 = new Object[1];
                        objectArray7[0] = l8;
                        Object[] objectArray8 = new Object[1];
                        objectArray8[0] = l7;
                        Object[] objectArray9 = new Object[7];
                        objectArray9[6] = l6;
                        objectArray9[5] = dB.d("\u00a4", (long)490092867774803572L, (long)l3);
                        objectArray9[4] = Float.valueOf(f);
                        objectArray9[3] = Float.valueOf(f10 + f12 - dB.d("K", (Object)dB.d("K", (Object)dB.d("\u00a4", (long)487804159542718082L, (long)l3), (Object)objectArray7, (long)503298696293405105L, (long)l3), (Object)objectArray8, (long)503933040766161199L, (long)l3) * f);
                        objectArray9[2] = Float.valueOf(f11 + f12 - dB.d("K", (Object)dB.d("K", (Object)dB.d("\u00a4", (long)487804159542718082L, (long)l3), (Object)objectArray5, (long)503298696293405105L, (long)l3), (Object)objectArray6, (long)490299761629850050L, (long)l3) * f);
                        objectArray9[1] = callSite9;
                        objectArray9[0] = matrix4f;
                        dB.d("K", (Object)dB.d("K", (Object)dB.d("\u00a4", (long)487804159542718082L, (long)l3), (Object)objectArray4, (long)503298696293405105L, (long)l3), (Object)objectArray9, (long)486632645038526890L, (long)l3);
                    }
                    object = dB.d("K", (Object)class_17992, (long)489739703784432066L, (long)l3);
                }
                try {
                    if (callSite != null) break block18;
                    if (object == false) break block19;
                }
                catch (MatchException matchException) {
                    throw dB.d("C", (Object)matchException, (long)486514427905663436L, (long)l3);
                }
                int n = (int)(f11 + 2.0f * f);
                int n2 = (int)(f10 + 16.0f * f);
                Object[] objectArray10 = new Object[8];
                objectArray10[7] = l;
                objectArray10[6] = Float.valueOf(2.0f);
                objectArray10[5] = v;
                objectArray10[4] = Float.valueOf((float)n2 + f);
                objectArray10[3] = Float.valueOf((float)n + 13.0f * f);
                objectArray10[2] = Float.valueOf(n2);
                objectArray10[1] = Float.valueOf(n);
                objectArray10[0] = matrix4f;
                dB.d("C", (Object)objectArray10, (long)502868557774430819L, (long)l3);
                Object[] objectArray11 = new Object[2];
                objectArray11[1] = l2;
                objectArray11[0] = (int)dB.d("K", (Object)class_17992, (long)503586860684060452L, (long)l3);
                Object[] objectArray12 = new Object[8];
                objectArray12[7] = l;
                objectArray12[6] = Float.valueOf(2.0f);
                objectArray12[5] = new Color((int)dB.d("C", (Object)objectArray11, (long)502928793056208592L, (long)l3));
                objectArray12[4] = Float.valueOf((float)n2 + f);
                objectArray12[3] = Float.valueOf((float)n + (float)dB.d("K", (Object)class_17992, (long)489019832986855362L, (long)l3) * f);
                objectArray12[2] = Float.valueOf(n2);
                objectArray12[1] = Float.valueOf(n);
                objectArray12[0] = matrix4f;
                dB.d("C", (Object)objectArray12, (long)502868557774430819L, (long)l3);
            }
            object = true;
        }
        return (boolean)object;
    }

    public static void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = z ^ l;
        dB.d("C", (int)dB.b("m", (int)6150, (long)(0x548A2EE21A62309AL ^ l)), (Object)i, (long)1533466152251489678L, (long)l);
        j = true;
    }

    private static int[] a(Object[] objectArray) {
        block5: {
            boolean bl;
            block4: {
                long l = (Long)objectArray[0];
                l = z ^ l;
                CallSite callSite = dB.d("C", (long)-3205854877182700421L, (long)l);
                try {
                    try {
                        bl = j;
                        if (callSite != null) break block4;
                        if (bl) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dB.d("C", (Object)matchException, (long)-3190410201678433099L, (long)l);
                    }
                    dB.d("C", (int)dB.b("m", (int)32340, (long)(0x333AD2E071E91036L ^ l)), (Object)i, (long)-3190054174785389709L, (long)l);
                    bl = true;
                }
                catch (MatchException matchException) {
                    throw dB.d("C", (Object)matchException, (long)-3190410201678433099L, (long)l);
                }
            }
            j = bl;
        }
        return i;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static float a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = z ^ l;
        return (float)dB.d("K", (Object)dB.d("K", (Object)b, (long)-3296958817169524684L, (long)l), (boolean)false, (long)-3313056459908558028L, (long)l);
    }

    public static void m(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        float f13 = ((Float)objectArray[5]).floatValue();
        long l = (Long)objectArray[6];
        long l2 = (l = z ^ l) ^ 0x10076634C584L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = Float.valueOf(f13);
        objectArray2[4] = color;
        objectArray2[3] = Float.valueOf(f12);
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)1838157126208344699L, (long)l);
    }

    public static void o(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        float f13 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        Color color3 = (Color)objectArray[7];
        Color color4 = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = z ^ l) ^ 0x525FF0400C6CL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = color4;
        objectArray2[6] = color3;
        objectArray2[5] = color2;
        objectArray2[4] = color;
        objectArray2[3] = Float.valueOf(f12);
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)8181658986519790885L, (long)l);
    }

    public static void p(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        float f13 = ((Float)objectArray[5]).floatValue();
        Color color = (Color)objectArray[6];
        Color color2 = (Color)objectArray[7];
        Color color3 = (Color)objectArray[8];
        Color color4 = (Color)objectArray[9];
        long l = (Long)objectArray[10];
        long l2 = (l = z ^ l) ^ 0x48C2B60AA75DL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = dB.d("K", (Object)t, (float)f13, (long)228562045204089983L, (long)l);
        objectArray2[8] = color4;
        objectArray2[7] = color3;
        objectArray2[6] = color2;
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        dB.d("C", (Object)objectArray2, (long)221540652673564731L, (long)l);
    }

    public static void k(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        float f13 = ((Float)objectArray[5]).floatValue();
        float f14 = ((Float)objectArray[6]).floatValue();
        long l = (Long)objectArray[7];
        long l2 = (l = z ^ l) ^ 0x2D8DEA11B3E4L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = color;
        objectArray2[5] = Float.valueOf(f12);
        objectArray2[4] = Float.valueOf(f11);
        objectArray2[3] = Float.valueOf(f10);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)5428464843324115806L, (long)l);
    }

    public static void t(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = z ^ l) ^ 0x7BFB6CCF9715L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)dB.d("K", (Object)color, (long)2686605823525439199L, (long)l);
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = q;
        dB.d("C", (Object)objectArray2, (long)2701987326879601345L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = dB.e(l, l2);
        Object object = J[n];
        if (object instanceof String) {
            String string = K[n];
            int n2 = string.indexOf(8);
            Class clazz = dB.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dB.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dB.c(clazz3, string2, clazz2)) != null) {
                    dB.J[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dB.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dB.J[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dB.f(4096329071451717L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void g(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        Color color2 = (Color)objectArray[5];
        Color color3 = (Color)objectArray[6];
        Color color4 = (Color)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = z ^ l) ^ 0x4A4F694D409EL;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l2;
        objectArray2[7] = color;
        objectArray2[6] = color2;
        objectArray2[5] = color4;
        objectArray2[4] = color3;
        objectArray2[3] = Float.valueOf(f12);
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)-1218187232176712617L, (long)l);
    }

    public static void v(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Matrix4f matrix4f = (Matrix4f)objectArray[4];
        bW bW2 = (bW)objectArray[5];
        Color color = (Color)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = (l = z ^ l) ^ 0x1BFB51E4C21DL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = color;
        objectArray2[7] = matrix4f;
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = bW2;
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)1027987639881082025L, (long)l);
    }

    public static void j(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        float f13 = ((Float)objectArray[5]).floatValue();
        long l = (Long)objectArray[6];
        long l2 = (l = z ^ l) ^ 0x44309AB694BDL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = Float.valueOf(0.25f);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = color;
        objectArray2[5] = Float.valueOf(f12);
        objectArray2[4] = Float.valueOf(f11);
        objectArray2[3] = Float.valueOf(f10);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)7785775697370344455L, (long)l);
    }

    public static void q(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = z ^ l) ^ 0x6D45E1B0575EL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = color;
        objectArray2[3] = Float.valueOf(f12);
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        dB.d("C", (Object)objectArray2, (long)7799212486353193490L, (long)l);
    }

    public static void w(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        float f13 = ((Float)objectArray[4]).floatValue();
        float f14 = ((Float)objectArray[5]).floatValue();
        float f15 = ((Float)objectArray[6]).floatValue();
        float f16 = ((Float)objectArray[7]).floatValue();
        float f17 = ((Float)objectArray[8]).floatValue();
        bW bW2 = (bW)objectArray[9];
        Color color = (Color)objectArray[10];
        long l = (Long)objectArray[11];
        long l2 = (l = z ^ l) ^ 0x6BB0682C2979L;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = color;
        objectArray2[11] = Float.valueOf(f17);
        objectArray2[10] = Float.valueOf(f16);
        objectArray2[9] = Float.valueOf(f15);
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = bW2;
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)2319760909923010922L, (long)l);
    }

    public static void u(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        bW bW2 = (bW)objectArray[4];
        Color color = (Color)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = z ^ l) ^ 0x117C51180FE0L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l2;
        objectArray2[7] = color;
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = bW2;
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)1509157080620225076L, (long)l);
    }

    public static void r(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = z ^ l) ^ 0x686A425FC216L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        dB.d("C", (Object)objectArray2, (long)8778917971505018159L, (long)l);
    }

    public static void y(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        bW bW2 = (bW)objectArray[4];
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = (l = z ^ l) ^ 0x3712E5BE4B4AL;
        Object[] objectArray2 = new Object[14];
        objectArray2[13] = l2;
        objectArray2[12] = z_0.MULTIPLY;
        objectArray2[11] = Float.valueOf(0.0f);
        objectArray2[10] = color2;
        objectArray2[9] = color;
        objectArray2[8] = color2;
        objectArray2[7] = color;
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = bW2;
        objectArray2[1] = h;
        objectArray2[0] = g;
        dB.d("C", (Object)objectArray2, (long)6580848895914749586L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dB.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dB.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(dB.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dB.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


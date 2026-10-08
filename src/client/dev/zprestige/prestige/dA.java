/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  org.joml.Matrix4f
 *  org.joml.Vector3d
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.az_0;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dB;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.du_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.ga_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_243;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dA {
    public static AtomicReference a;
    private static final ThreadLocal b;
    private static final Matrix4f c;
    private static final ThreadLocal d;
    private static final long e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                dA.e = hc.a(-4783959844470930600L, -8444799439584304114L, MethodHandles.lookup().lookupClass()).a(243756774195900L);
                var11 = dA.e ^ 118098287619162L;
                dA.i = new Object[118];
                dA.j = new String[118];
                dA.a();
                dA.h = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[16];
                var3_4 = 0;
                var4_5 = "n#\u00ce\u00c2,\u00ba\u0088b\u00ff\u00a42\"\f\u008e\u0001\u00d5\u008e\u00b7{\u00ba\u00e3W\u00cdX\u00db-[\u00be\u00f0V\u00be\u00f7\u0001w\u00c6a\u0086(\u00e6\u00de2?S\u00b5\u009f\u0088\u00e8uA\u00f5\u0015\u00898\u00f5j\u00c7\u0094\r\u00d4|\u00b3|T\u00d8G\u00c7\u00e0\u0011\u0088\u00a9\u00e5\u009e}\u008b\u00c6\u0002\u00c5n~K\u00ba\u0017\u00a2ZL\u0080T k\u0019\u001f\u00fb\u008e\u00fe\u00dc\u0095+z'D\u008b04\u00c7\u00bc\u00de{\u001f{\u008a:\u0016";
                var5_6 = "n#\u00ce\u00c2,\u00ba\u0088b\u00ff\u00a42\"\f\u008e\u0001\u00d5\u008e\u00b7{\u00ba\u00e3W\u00cdX\u00db-[\u00be\u00f0V\u00be\u00f7\u0001w\u00c6a\u0086(\u00e6\u00de2?S\u00b5\u009f\u0088\u00e8uA\u00f5\u0015\u00898\u00f5j\u00c7\u0094\r\u00d4|\u00b3|T\u00d8G\u00c7\u00e0\u0011\u0088\u00a9\u00e5\u009e}\u008b\u00c6\u0002\u00c5n~K\u00ba\u0017\u00a2ZL\u0080T k\u0019\u001f\u00fb\u008e\u00fe\u00dc\u0095+z'D\u008b04\u00c7\u00bc\u00de{\u001f{\u008a:\u0016".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00e0\u0007\u00b4M\u0095\u0089\u00ab\u0093\u00f8\u00a7<a\u0089.z\u00e8";
                    var5_6 = "\u00e0\u0007\u00b4M\u0095\u0089\u00ab\u0093\u00f8\u00a7<a\u0089.z\u00e8".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        dA.f = var6_3;
        dA.g = new Integer[16];
        dA.a = new AtomicReference<V>();
        dA.b = dA.b("\u00c0", (Supplier<Matrix4f>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, <init>(), ()Lorg/joml/Matrix4f;)(), (long)-5124681879664411768L, (long)var11);
        dA.c = new Matrix4f();
        dA.d = dA.b("\u00c0", (Supplier<Vector3d>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, <init>(), ()Lorg/joml/Vector3d;)(), (long)-5124681879664411768L, (long)var11);
    }

    public static void B(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        Color color = (Color)objectArray[6];
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x978DBA9D93CL;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = Float.valueOf(f14);
        objectArray2[7] = Float.valueOf(f13);
        objectArray2[6] = color;
        objectArray2[5] = Float.valueOf(f12 - f10);
        objectArray2[4] = Float.valueOf(f11 - f);
        objectArray2[3] = Float.valueOf(f10);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dA.b("\u00c0", (Object)objectArray2, (long)3175289210913047534L, (long)l);
    }

    public static void C(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        float f13 = ((Float)objectArray[8]).floatValue();
        float f14 = ((Float)objectArray[9]).floatValue();
        long l = (Long)objectArray[10];
        long l2 = (l = e ^ l) ^ 0x74D7420EF630L;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = color;
        objectArray2[6] = Float.valueOf(f12 - f10);
        objectArray2[5] = Float.valueOf(f11 - f);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dA.b("\u00c0", (Object)objectArray2, (long)-1220776326185862597L, (long)l);
    }

    public static void e(Object[] objectArray) {
        block4: {
            gK gK2 = (gK)objectArray[0];
            aq_0 aq_02 = (aq_0)objectArray[1];
            Matrix4f matrix4f = (Matrix4f)objectArray[2];
            float f = ((Float)objectArray[3]).floatValue();
            float f10 = ((Float)objectArray[4]).floatValue();
            float f11 = ((Float)objectArray[5]).floatValue();
            float f12 = ((Float)objectArray[6]).floatValue();
            Color color = (Color)objectArray[7];
            Color color2 = (Color)objectArray[8];
            long l = (Long)objectArray[9];
            long l2 = l = e ^ l;
            long l3 = l2 ^ 0x1A0428B83795L;
            long l4 = l2 ^ 0x4E08E53CF92AL;
            long l5 = l2 ^ 0x11BF68072259L;
            long l6 = l2 ^ 0x30C4D0D14E52L;
            long l7 = l2 ^ 0x6281AF1D6F6CL;
            long l8 = l2 ^ 0x7677CA979AB5L;
            long l9 = l2 ^ 0x48BF6C8BBE2FL;
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = l3;
            objectArray2[3] = (double)f11;
            objectArray2[2] = (double)f10;
            objectArray2[1] = (double)f;
            objectArray2[0] = gK2;
            CallSite callSite = dA.b("\u00c0", (Object)objectArray2, (long)7393004511988268444L, (long)l);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l9;
            objectArray3[0] = du_0.b;
            CallSite callSite2 = dA.b("K", (Object)aq_02, (Object)objectArray3, (long)7391526944554212172L, (long)l);
            float f13 = (float)dA.b("\u00f8", (Object)callSite, (long)7387559242251373773L, (long)l);
            float f14 = (float)dA.b("\u00f8", (Object)callSite, (long)7393823600628039294L, (long)l);
            float f15 = (float)dA.b("\u00f8", (Object)callSite, (long)7394615251186453294L, (long)l);
            CallSite callSite3 = dA.b("\u00c0", (long)7394168321486386673L, (long)l);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l4;
            objectArray4[0] = color;
            CallSite callSite4 = dA.b("\u00c0", (Object)objectArray4, (long)7393944834529096181L, (long)l);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l4;
            objectArray5[0] = color2;
            CallSite callSite5 = dA.b("\u00c0", (Object)objectArray5, (long)7393944834529096181L, (long)l);
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l5;
            dA.b("K", (Object)callSite2, (Object)objectArray6, (long)7392149657907191777L, (long)l);
            Object[] objectArray7 = new Object[5];
            objectArray7[4] = l7;
            objectArray7[3] = Float.valueOf(f15);
            objectArray7[2] = Float.valueOf(f14);
            objectArray7[1] = Float.valueOf(f13);
            objectArray7[0] = matrix4f;
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l6;
            objectArray8[0] = (int)callSite4;
            dA.b("K", (Object)dA.b("K", (Object)callSite2, (Object)objectArray7, (long)7394287394474441193L, (long)l), (Object)objectArray8, (long)7394523991840375556L, (long)l);
            for (int i = 0; i <= dA.a("w", (int)32289, (long)(0x1AB2DD0591818A08L ^ l)); ++i) {
                float f16 = (float)(Math.PI * 2 * (double)i / 100.0);
                float f17 = (float)dA.b("\u00c0", (double)f16, (long)7390493927167286960L, (long)l);
                float f18 = (float)dA.b("\u00c0", (double)f16, (long)7394844315493761998L, (long)l);
                float f19 = f13 + f12 * f17;
                float f20 = f15 + f12 * f18;
                try {
                    Object[] objectArray9 = new Object[5];
                    objectArray9[4] = l7;
                    objectArray9[3] = Float.valueOf(f20);
                    objectArray9[2] = Float.valueOf(f14);
                    objectArray9[1] = Float.valueOf(f19);
                    objectArray9[0] = matrix4f;
                    Object[] objectArray10 = new Object[2];
                    objectArray10[1] = l6;
                    objectArray10[0] = (int)callSite5;
                    dA.b("K", (Object)dA.b("K", (Object)callSite2, (Object)objectArray9, (long)7394287394474441193L, (long)l), (Object)objectArray10, (long)7394523991840375556L, (long)l);
                    if (callSite3 == null) {
                        if (callSite3 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)7390972517471304083L, (long)l);
                }
            }
            Object[] objectArray11 = new Object[2];
            objectArray11[1] = l8;
            objectArray11[0] = m_0.TRIANGLES_FAN;
            dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)callSite2, (Object)objectArray11, (long)7391066060678323325L, (long)l))), (Object)new Object[0], (long)7390896674392072266L, (long)l);
        }
    }

    public static void i(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        aq_0 aq_02 = (aq_0)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        int n = (Integer)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x7F437395B925L;
        long l4 = l2 ^ 0x74F8332AACE9L;
        long l5 = l2 ^ 0x55838BFCC0E2L;
        long l6 = l2 ^ 0x7C6F430E1DCL;
        long l7 = l2 ^ 0x133091BA1405L;
        long l8 = l2 ^ 0x43291CC77915L;
        long l9 = l2 ^ 0x2DF837A6309FL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = (double)f11;
        objectArray2[2] = (double)f10;
        objectArray2[1] = (double)f;
        objectArray2[0] = gK2;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray2, (long)-1717737156039527636L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l9;
        objectArray3[0] = du_0.c;
        CallSite callSite2 = dA.b("K", (Object)aq_02, (Object)objectArray3, (long)-1719354851276859908L, (long)l);
        float f12 = (float)dA.b("\u00f8", (Object)callSite, (long)-1714318147728604547L, (long)l);
        float f13 = (float)dA.b("\u00f8", (Object)callSite, (long)-1716920234742845234L, (long)l);
        float f14 = (float)dA.b("\u00f8", (Object)callSite, (long)-1716269327247080034L, (long)l);
        float f15 = (float)(dA.b("\u00f8", (Object)callSite, (long)-1714318147728604547L, (long)l) + 1.0);
        float f16 = (float)(dA.b("\u00f8", (Object)callSite, (long)-1716920234742845234L, (long)l) + 1.0);
        float f17 = (float)(dA.b("\u00f8", (Object)callSite, (long)-1716269327247080034L, (long)l) + 1.0);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l8;
        objectArray4[0] = n;
        CallSite callSite3 = dA.b("\u00c0", (Object)objectArray4, (long)-1717818590582898293L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l4;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l6;
        objectArray6[3] = Float.valueOf(f14);
        objectArray6[2] = Float.valueOf(f16);
        objectArray6[1] = Float.valueOf(f12);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = (int)callSite3;
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = l6;
        objectArray8[3] = Float.valueOf(f17);
        objectArray8[2] = Float.valueOf(f16);
        objectArray8[1] = Float.valueOf(f12);
        objectArray8[0] = matrix4f;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l5;
        objectArray9[0] = (int)callSite3;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l6;
        objectArray10[3] = Float.valueOf(f17);
        objectArray10[2] = Float.valueOf(f16);
        objectArray10[1] = Float.valueOf(f15);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l5;
        objectArray11[0] = (int)callSite3;
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = l6;
        objectArray12[3] = Float.valueOf(f14);
        objectArray12[2] = Float.valueOf(f16);
        objectArray12[1] = Float.valueOf(f15);
        objectArray12[0] = matrix4f;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l5;
        objectArray13[0] = (int)callSite3;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = l6;
        objectArray14[3] = Float.valueOf(f14);
        objectArray14[2] = Float.valueOf(f13);
        objectArray14[1] = Float.valueOf(f12);
        objectArray14[0] = matrix4f;
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l5;
        objectArray15[0] = (int)callSite3;
        Object[] objectArray16 = new Object[5];
        objectArray16[4] = l6;
        objectArray16[3] = Float.valueOf(f14);
        objectArray16[2] = Float.valueOf(f13);
        objectArray16[1] = Float.valueOf(f15);
        objectArray16[0] = matrix4f;
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l5;
        objectArray17[0] = (int)callSite3;
        Object[] objectArray18 = new Object[5];
        objectArray18[4] = l6;
        objectArray18[3] = Float.valueOf(f17);
        objectArray18[2] = Float.valueOf(f13);
        objectArray18[1] = Float.valueOf(f15);
        objectArray18[0] = matrix4f;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = (int)callSite3;
        Object[] objectArray20 = new Object[5];
        objectArray20[4] = l6;
        objectArray20[3] = Float.valueOf(f17);
        objectArray20[2] = Float.valueOf(f13);
        objectArray20[1] = Float.valueOf(f12);
        objectArray20[0] = matrix4f;
        Object[] objectArray21 = new Object[2];
        objectArray21[1] = l5;
        objectArray21[0] = (int)callSite3;
        Object[] objectArray22 = new Object[5];
        objectArray22[4] = l6;
        objectArray22[3] = Float.valueOf(f17);
        objectArray22[2] = Float.valueOf(f13);
        objectArray22[1] = Float.valueOf(f12);
        objectArray22[0] = matrix4f;
        Object[] objectArray23 = new Object[2];
        objectArray23[1] = l5;
        objectArray23[0] = (int)callSite3;
        Object[] objectArray24 = new Object[5];
        objectArray24[4] = l6;
        objectArray24[3] = Float.valueOf(f17);
        objectArray24[2] = Float.valueOf(f13);
        objectArray24[1] = Float.valueOf(f15);
        objectArray24[0] = matrix4f;
        Object[] objectArray25 = new Object[2];
        objectArray25[1] = l5;
        objectArray25[0] = (int)callSite3;
        Object[] objectArray26 = new Object[5];
        objectArray26[4] = l6;
        objectArray26[3] = Float.valueOf(f17);
        objectArray26[2] = Float.valueOf(f16);
        objectArray26[1] = Float.valueOf(f15);
        objectArray26[0] = matrix4f;
        Object[] objectArray27 = new Object[2];
        objectArray27[1] = l5;
        objectArray27[0] = (int)callSite3;
        Object[] objectArray28 = new Object[5];
        objectArray28[4] = l6;
        objectArray28[3] = Float.valueOf(f17);
        objectArray28[2] = Float.valueOf(f16);
        objectArray28[1] = Float.valueOf(f12);
        objectArray28[0] = matrix4f;
        Object[] objectArray29 = new Object[2];
        objectArray29[1] = l5;
        objectArray29[0] = (int)callSite3;
        Object[] objectArray30 = new Object[5];
        objectArray30[4] = l6;
        objectArray30[3] = Float.valueOf(f14);
        objectArray30[2] = Float.valueOf(f13);
        objectArray30[1] = Float.valueOf(f12);
        objectArray30[0] = matrix4f;
        Object[] objectArray31 = new Object[2];
        objectArray31[1] = l5;
        objectArray31[0] = (int)callSite3;
        Object[] objectArray32 = new Object[5];
        objectArray32[4] = l6;
        objectArray32[3] = Float.valueOf(f14);
        objectArray32[2] = Float.valueOf(f16);
        objectArray32[1] = Float.valueOf(f12);
        objectArray32[0] = matrix4f;
        Object[] objectArray33 = new Object[2];
        objectArray33[1] = l5;
        objectArray33[0] = (int)callSite3;
        Object[] objectArray34 = new Object[5];
        objectArray34[4] = l6;
        objectArray34[3] = Float.valueOf(f14);
        objectArray34[2] = Float.valueOf(f16);
        objectArray34[1] = Float.valueOf(f15);
        objectArray34[0] = matrix4f;
        Object[] objectArray35 = new Object[2];
        objectArray35[1] = l5;
        objectArray35[0] = (int)callSite3;
        Object[] objectArray36 = new Object[5];
        objectArray36[4] = l6;
        objectArray36[3] = Float.valueOf(f14);
        objectArray36[2] = Float.valueOf(f13);
        objectArray36[1] = Float.valueOf(f15);
        objectArray36[0] = matrix4f;
        Object[] objectArray37 = new Object[2];
        objectArray37[1] = l5;
        objectArray37[0] = (int)callSite3;
        Object[] objectArray38 = new Object[5];
        objectArray38[4] = l6;
        objectArray38[3] = Float.valueOf(f14);
        objectArray38[2] = Float.valueOf(f13);
        objectArray38[1] = Float.valueOf(f12);
        objectArray38[0] = matrix4f;
        Object[] objectArray39 = new Object[2];
        objectArray39[1] = l5;
        objectArray39[0] = (int)callSite3;
        Object[] objectArray40 = new Object[5];
        objectArray40[4] = l6;
        objectArray40[3] = Float.valueOf(f17);
        objectArray40[2] = Float.valueOf(f13);
        objectArray40[1] = Float.valueOf(f12);
        objectArray40[0] = matrix4f;
        Object[] objectArray41 = new Object[2];
        objectArray41[1] = l5;
        objectArray41[0] = (int)callSite3;
        Object[] objectArray42 = new Object[5];
        objectArray42[4] = l6;
        objectArray42[3] = Float.valueOf(f17);
        objectArray42[2] = Float.valueOf(f16);
        objectArray42[1] = Float.valueOf(f12);
        objectArray42[0] = matrix4f;
        Object[] objectArray43 = new Object[2];
        objectArray43[1] = l5;
        objectArray43[0] = (int)callSite3;
        Object[] objectArray44 = new Object[5];
        objectArray44[4] = l6;
        objectArray44[3] = Float.valueOf(f14);
        objectArray44[2] = Float.valueOf(f16);
        objectArray44[1] = Float.valueOf(f12);
        objectArray44[0] = matrix4f;
        Object[] objectArray45 = new Object[2];
        objectArray45[1] = l5;
        objectArray45[0] = (int)callSite3;
        Object[] objectArray46 = new Object[5];
        objectArray46[4] = l6;
        objectArray46[3] = Float.valueOf(f14);
        objectArray46[2] = Float.valueOf(f13);
        objectArray46[1] = Float.valueOf(f15);
        objectArray46[0] = matrix4f;
        Object[] objectArray47 = new Object[2];
        objectArray47[1] = l5;
        objectArray47[0] = (int)callSite3;
        Object[] objectArray48 = new Object[5];
        objectArray48[4] = l6;
        objectArray48[3] = Float.valueOf(f14);
        objectArray48[2] = Float.valueOf(f16);
        objectArray48[1] = Float.valueOf(f15);
        objectArray48[0] = matrix4f;
        Object[] objectArray49 = new Object[2];
        objectArray49[1] = l5;
        objectArray49[0] = (int)callSite3;
        Object[] objectArray50 = new Object[5];
        objectArray50[4] = l6;
        objectArray50[3] = Float.valueOf(f17);
        objectArray50[2] = Float.valueOf(f16);
        objectArray50[1] = Float.valueOf(f15);
        objectArray50[0] = matrix4f;
        Object[] objectArray51 = new Object[2];
        objectArray51[1] = l5;
        objectArray51[0] = (int)callSite3;
        Object[] objectArray52 = new Object[5];
        objectArray52[4] = l6;
        objectArray52[3] = Float.valueOf(f17);
        objectArray52[2] = Float.valueOf(f13);
        objectArray52[1] = Float.valueOf(f15);
        objectArray52[0] = matrix4f;
        Object[] objectArray53 = new Object[2];
        objectArray53[1] = l5;
        objectArray53[0] = (int)callSite3;
        Object[] objectArray54 = new Object[2];
        objectArray54[1] = l7;
        objectArray54[0] = m_0.QUADS;
        dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)callSite2, (Object)objectArray5, (long)-1718591969548512943L, (long)l))), (Object)objectArray6, (long)-1716526276495165607L, (long)l), (Object)objectArray7, (long)-1716217650317472332L, (long)l), (Object)objectArray8, (long)-1716526276495165607L, (long)l), (Object)objectArray9, (long)-1716217650317472332L, (long)l), (Object)objectArray10, (long)-1716526276495165607L, (long)l), (Object)objectArray11, (long)-1716217650317472332L, (long)l), (Object)objectArray12, (long)-1716526276495165607L, (long)l), (Object)objectArray13, (long)-1716217650317472332L, (long)l), (Object)objectArray14, (long)-1716526276495165607L, (long)l), (Object)objectArray15, (long)-1716217650317472332L, (long)l), (Object)objectArray16, (long)-1716526276495165607L, (long)l), (Object)objectArray17, (long)-1716217650317472332L, (long)l), (Object)objectArray18, (long)-1716526276495165607L, (long)l), (Object)objectArray19, (long)-1716217650317472332L, (long)l), (Object)objectArray20, (long)-1716526276495165607L, (long)l), (Object)objectArray21, (long)-1716217650317472332L, (long)l), (Object)objectArray22, (long)-1716526276495165607L, (long)l), (Object)objectArray23, (long)-1716217650317472332L, (long)l), (Object)objectArray24, (long)-1716526276495165607L, (long)l), (Object)objectArray25, (long)-1716217650317472332L, (long)l), (Object)objectArray26, (long)-1716526276495165607L, (long)l), (Object)objectArray27, (long)-1716217650317472332L, (long)l), (Object)objectArray28, (long)-1716526276495165607L, (long)l), (Object)objectArray29, (long)-1716217650317472332L, (long)l), (Object)objectArray30, (long)-1716526276495165607L, (long)l), (Object)objectArray31, (long)-1716217650317472332L, (long)l), (Object)objectArray32, (long)-1716526276495165607L, (long)l), (Object)objectArray33, (long)-1716217650317472332L, (long)l), (Object)objectArray34, (long)-1716526276495165607L, (long)l), (Object)objectArray35, (long)-1716217650317472332L, (long)l), (Object)objectArray36, (long)-1716526276495165607L, (long)l), (Object)objectArray37, (long)-1716217650317472332L, (long)l), (Object)objectArray38, (long)-1716526276495165607L, (long)l), (Object)objectArray39, (long)-1716217650317472332L, (long)l), (Object)objectArray40, (long)-1716526276495165607L, (long)l), (Object)objectArray41, (long)-1716217650317472332L, (long)l), (Object)objectArray42, (long)-1716526276495165607L, (long)l), (Object)objectArray43, (long)-1716217650317472332L, (long)l), (Object)objectArray44, (long)-1716526276495165607L, (long)l), (Object)objectArray45, (long)-1716217650317472332L, (long)l), (Object)objectArray46, (long)-1716526276495165607L, (long)l), (Object)objectArray47, (long)-1716217650317472332L, (long)l), (Object)objectArray48, (long)-1716526276495165607L, (long)l), (Object)objectArray49, (long)-1716217650317472332L, (long)l), (Object)objectArray50, (long)-1716526276495165607L, (long)l), (Object)objectArray51, (long)-1716217650317472332L, (long)l), (Object)objectArray52, (long)-1716526276495165607L, (long)l), (Object)objectArray53, (long)-1716217650317472332L, (long)l), (Object)objectArray54, (long)-1719756945675463987L, (long)l))), (Object)new Object[0], (long)-1719855973345202438L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dA.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                dA.i[n] = clazz = Class.forName(j[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/dA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = e ^ l;
        int n2 = n >> dA.a("w", (int)8040, (long)(0x11ACE67259C484DL ^ l)) & dA.a("w", (int)32590, (long)(0x5FC6AE05608C286CL ^ l));
        int n3 = n >> dA.a("w", (int)4675, (long)(0x7CCB6CE57870C565L ^ l)) & dA.a("w", (int)6352, (long)(0x199319CDD9664FFCL ^ l));
        int n4 = n >> dA.a("w", (int)22856, (long)(0x6389752A2D3D0E63L ^ l)) & dA.a("w", (int)6352, (long)(0x199319CDD9664FFCL ^ l));
        int n5 = n & dA.a("w", (int)6352, (long)(0x199319CDD9664FFCL ^ l));
        return n2 << dA.a("w", (int)2509, (long)(0x52AA2FE9C61E5EEAL ^ l)) | n5 << dA.a("w", (int)17529, (long)(0x81CA1977ECB1353L ^ l)) | n4 << dA.a("w", (int)805, (long)(0x4D7DC057F0FB5406L ^ l)) | n3;
    }

    public static void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x2129BA086538L;
        long l4 = l2 ^ 0x41B78D6C95B8L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = dB.h;
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)-4319679143862344667L, (long)l), (Object)objectArray3, (long)-4320498117444049750L, (long)l);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dA.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dA.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dA.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dA.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void x(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = e ^ l) ^ 0x13982FF639E3L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)dA.b("K", (Object)color, (long)-685557338247982354L, (long)l);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)-686452643483343193L, (long)l);
    }

    public static void s(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        float f13 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = (l = e ^ l) ^ 0x2B2D62CF54E2L;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l2;
        objectArray2[7] = color2;
        objectArray2[6] = color;
        objectArray2[5] = Float.valueOf(f13);
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)2959750723360737301L, (long)l);
    }

    public static void c(Object[] objectArray) {
        block10: {
            Object object;
            CallSite callSite;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            Color color;
            ArrayList arrayList;
            aq_0 aq_02;
            gK gK2;
            block8: {
                block9: {
                    gK2 = (gK)objectArray[0];
                    aq_02 = (aq_0)objectArray[1];
                    arrayList = (ArrayList)objectArray[2];
                    color = (Color)objectArray[3];
                    l8 = (Long)objectArray[4];
                    long l9 = l8 = e ^ l8;
                    l7 = l9 ^ 0x6DBE859C1983L;
                    l6 = l9 ^ 0x320908A7C2F0L;
                    l5 = l9 ^ 0x1372B071AEFBL;
                    l4 = l9 ^ 0x4137CFBD8FC5L;
                    l3 = l9 ^ 0x55C1AA377A1CL;
                    l2 = l9 ^ 0x482AC090B444L;
                    l = l9 ^ 0x6B090C2B5E86L;
                    callSite = dA.b("\u00c0", (long)-8776249723762469544L, (long)l8);
                    try {
                        try {
                            object = arrayList;
                            if (callSite != null) break block8;
                            if (dA.b("K", (Object)object, (long)-8776942684160507988L, (long)l8) == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw dA.b("\u00c0", (Object)matchException, (long)-8774382142509688518L, (long)l8);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw dA.b("\u00c0", (Object)matchException, (long)-8774382142509688518L, (long)l8);
                    }
                }
                object = dA.b("K", (Object)b, (long)-8777304457557030845L, (long)l8);
            }
            CallSite callSite2 = dA.b("K", (Object)((Matrix4f)object), (long)-8774162977842242227L, (long)l8);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = du_0.e;
            CallSite callSite3 = dA.b("K", (Object)aq_02, (Object)objectArray2, (long)-8774462130419057691L, (long)l8);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l7;
            objectArray3[0] = color;
            CallSite callSite4 = dA.b("\u00c0", (Object)objectArray3, (long)-8775912514550492836L, (long)l8);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l6;
            dA.b("K", (Object)callSite3, (Object)objectArray4, (long)-8773272363250368696L, (long)l8);
            Vector3d vector3d = (Vector3d)dA.b("K", (Object)d, (long)-8777304457557030845L, (long)l8);
            CallSite callSite5 = dA.b("K", (Object)arrayList, (long)-8773158565722427135L, (long)l8);
            while (dA.b("K", (Object)callSite5, (long)-8776397312338930061L, (long)l8) != false) {
                class_243 class_2432 = (class_243)dA.b("K", (Object)callSite5, (long)-8774977931789117026L, (long)l8);
                try {
                    Object[] objectArray5 = new Object[6];
                    objectArray5[5] = l2;
                    objectArray5[4] = vector3d;
                    objectArray5[3] = (double)dA.b("\u00f8", (Object)class_2432, (long)-8775180878227257068L, (long)l8);
                    objectArray5[2] = (double)dA.b("\u00f8", (Object)class_2432, (long)-8776966586964096252L, (long)l8);
                    objectArray5[1] = (double)dA.b("\u00f8", (Object)class_2432, (long)-8773464029549809386L, (long)l8);
                    objectArray5[0] = gK2;
                    dA.b("\u00c0", (Object)objectArray5, (long)-8775895386443202141L, (long)l8);
                    Object[] objectArray6 = new Object[5];
                    objectArray6[4] = l4;
                    objectArray6[3] = Float.valueOf((float)dA.b("\u00f8", (Object)vector3d, (long)-8775315744771052665L, (long)l8));
                    objectArray6[2] = Float.valueOf((float)dA.b("\u00f8", (Object)vector3d, (long)-8776107381349835049L, (long)l8));
                    objectArray6[1] = Float.valueOf((float)dA.b("\u00f8", (Object)vector3d, (long)-8778427946153218972L, (long)l8));
                    objectArray6[0] = callSite2;
                    Object[] objectArray7 = new Object[2];
                    objectArray7[1] = l5;
                    objectArray7[0] = (int)callSite4;
                    dA.b("K", (Object)dA.b("K", (Object)callSite3, (Object)objectArray6, (long)-8776131925301733056L, (long)l8), (Object)objectArray7, (long)-8775400407047396435L, (long)l8);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block10;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)-8774382142509688518L, (long)l8);
                }
            }
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l3;
            objectArray8[0] = m_0.DEBUG_LINE_STRIP;
            dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)callSite3, (Object)objectArray8, (long)-8774290967964566316L, (long)l8))), (Object)new Object[0], (long)-8775089139623034653L, (long)l8);
        }
    }

    private static Field c(long l, long l2) {
        int n = dA.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = dA.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dA.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dA.a(clazz3, string2, clazz2)) != null) {
                    dA.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dA.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dA.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dA.b(956926267420809L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void n(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        Color color2 = (Color)objectArray[5];
        Color color3 = (Color)objectArray[6];
        Color color4 = (Color)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = e ^ l) ^ 0x2CA7D08FF718L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = (int)dA.b("K", (Object)color4, (long)8868447303692492673L, (long)l);
        objectArray2[7] = (int)dA.b("K", (Object)color3, (long)8868447303692492673L, (long)l);
        objectArray2[6] = (int)dA.b("K", (Object)color2, (long)8868447303692492673L, (long)l);
        objectArray2[5] = (int)dA.b("K", (Object)color, (long)8868447303692492673L, (long)l);
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)8869435262948131519L, (long)l);
    }

    public static void h(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        aq_0 aq_02 = (aq_0)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        float f13 = ((Float)objectArray[6]).floatValue();
        float f14 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x1C5F803382ABL;
        long l4 = l2 ^ 0x48534DB74C14L;
        long l5 = l2 ^ 0x17E4C08C9767L;
        long l6 = l2 ^ 0x369F785AFB6CL;
        long l7 = l2 ^ 0x64DA0796DA52L;
        long l8 = l2 ^ 0x702C621C2F8BL;
        long l9 = l2 ^ 0x4EE4C4000B11L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = (double)f11;
        objectArray2[2] = (double)f10;
        objectArray2[1] = (double)f;
        objectArray2[0] = gK2;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray2, (long)-3195519213752022878L, (long)l);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l3;
        objectArray3[3] = (double)f14;
        objectArray3[2] = (double)f13;
        objectArray3[1] = (double)f12;
        objectArray3[0] = gK2;
        CallSite callSite2 = dA.b("\u00c0", (Object)objectArray3, (long)-3195519213752022878L, (long)l);
        CallSite callSite3 = dA.b("K", (Object)((Matrix4f)dA.b("K", (Object)b, (long)-3195332573086147116L, (long)l)), (long)-3193952981296936742L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l9;
        objectArray4[0] = du_0.b;
        CallSite callSite4 = dA.b("K", (Object)aq_02, (Object)objectArray4, (long)-3193618643109122446L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = color;
        CallSite callSite5 = dA.b("\u00c0", (Object)objectArray5, (long)-3196825671011973941L, (long)l);
        float f15 = (float)dA.b("\u00f8", (Object)callSite, (long)-3189701207437886989L, (long)l);
        float f16 = (float)dA.b("\u00f8", (Object)callSite, (long)-3196951861557015744L, (long)l);
        float f17 = (float)dA.b("\u00f8", (Object)callSite, (long)-3197286083810542064L, (long)l);
        float f18 = (float)dA.b("\u00f8", (Object)callSite2, (long)-3189701207437886989L, (long)l);
        float f19 = (float)dA.b("\u00f8", (Object)callSite2, (long)-3196951861557015744L, (long)l);
        float f20 = (float)dA.b("\u00f8", (Object)callSite2, (long)-3197286083810542064L, (long)l);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l5;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l7;
        objectArray7[3] = Float.valueOf(f17);
        objectArray7[2] = Float.valueOf(f19);
        objectArray7[1] = Float.valueOf(f15);
        objectArray7[0] = callSite3;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l6;
        objectArray8[0] = (int)callSite5;
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = l7;
        objectArray9[3] = Float.valueOf(f20);
        objectArray9[2] = Float.valueOf(f19);
        objectArray9[1] = Float.valueOf(f15);
        objectArray9[0] = callSite3;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l6;
        objectArray10[0] = (int)callSite5;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l7;
        objectArray11[3] = Float.valueOf(f20);
        objectArray11[2] = Float.valueOf(f19);
        objectArray11[1] = Float.valueOf(f18);
        objectArray11[0] = callSite3;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l6;
        objectArray12[0] = (int)callSite5;
        Object[] objectArray13 = new Object[5];
        objectArray13[4] = l7;
        objectArray13[3] = Float.valueOf(f17);
        objectArray13[2] = Float.valueOf(f19);
        objectArray13[1] = Float.valueOf(f18);
        objectArray13[0] = callSite3;
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l6;
        objectArray14[0] = (int)callSite5;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = l7;
        objectArray15[3] = Float.valueOf(f17);
        objectArray15[2] = Float.valueOf(f16);
        objectArray15[1] = Float.valueOf(f15);
        objectArray15[0] = callSite3;
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l6;
        objectArray16[0] = (int)callSite5;
        Object[] objectArray17 = new Object[5];
        objectArray17[4] = l7;
        objectArray17[3] = Float.valueOf(f17);
        objectArray17[2] = Float.valueOf(f16);
        objectArray17[1] = Float.valueOf(f18);
        objectArray17[0] = callSite3;
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l6;
        objectArray18[0] = (int)callSite5;
        Object[] objectArray19 = new Object[5];
        objectArray19[4] = l7;
        objectArray19[3] = Float.valueOf(f20);
        objectArray19[2] = Float.valueOf(f16);
        objectArray19[1] = Float.valueOf(f18);
        objectArray19[0] = callSite3;
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = l6;
        objectArray20[0] = (int)callSite5;
        Object[] objectArray21 = new Object[5];
        objectArray21[4] = l7;
        objectArray21[3] = Float.valueOf(f20);
        objectArray21[2] = Float.valueOf(f16);
        objectArray21[1] = Float.valueOf(f15);
        objectArray21[0] = callSite3;
        Object[] objectArray22 = new Object[2];
        objectArray22[1] = l6;
        objectArray22[0] = (int)callSite5;
        Object[] objectArray23 = new Object[5];
        objectArray23[4] = l7;
        objectArray23[3] = Float.valueOf(f20);
        objectArray23[2] = Float.valueOf(f16);
        objectArray23[1] = Float.valueOf(f15);
        objectArray23[0] = callSite3;
        Object[] objectArray24 = new Object[2];
        objectArray24[1] = l6;
        objectArray24[0] = (int)callSite5;
        Object[] objectArray25 = new Object[5];
        objectArray25[4] = l7;
        objectArray25[3] = Float.valueOf(f20);
        objectArray25[2] = Float.valueOf(f16);
        objectArray25[1] = Float.valueOf(f18);
        objectArray25[0] = callSite3;
        Object[] objectArray26 = new Object[2];
        objectArray26[1] = l6;
        objectArray26[0] = (int)callSite5;
        Object[] objectArray27 = new Object[5];
        objectArray27[4] = l7;
        objectArray27[3] = Float.valueOf(f20);
        objectArray27[2] = Float.valueOf(f19);
        objectArray27[1] = Float.valueOf(f18);
        objectArray27[0] = callSite3;
        Object[] objectArray28 = new Object[2];
        objectArray28[1] = l6;
        objectArray28[0] = (int)callSite5;
        Object[] objectArray29 = new Object[5];
        objectArray29[4] = l7;
        objectArray29[3] = Float.valueOf(f20);
        objectArray29[2] = Float.valueOf(f19);
        objectArray29[1] = Float.valueOf(f15);
        objectArray29[0] = callSite3;
        Object[] objectArray30 = new Object[2];
        objectArray30[1] = l6;
        objectArray30[0] = (int)callSite5;
        Object[] objectArray31 = new Object[5];
        objectArray31[4] = l7;
        objectArray31[3] = Float.valueOf(f17);
        objectArray31[2] = Float.valueOf(f16);
        objectArray31[1] = Float.valueOf(f15);
        objectArray31[0] = callSite3;
        Object[] objectArray32 = new Object[2];
        objectArray32[1] = l6;
        objectArray32[0] = (int)callSite5;
        Object[] objectArray33 = new Object[5];
        objectArray33[4] = l7;
        objectArray33[3] = Float.valueOf(f17);
        objectArray33[2] = Float.valueOf(f19);
        objectArray33[1] = Float.valueOf(f15);
        objectArray33[0] = callSite3;
        Object[] objectArray34 = new Object[2];
        objectArray34[1] = l6;
        objectArray34[0] = (int)callSite5;
        Object[] objectArray35 = new Object[5];
        objectArray35[4] = l7;
        objectArray35[3] = Float.valueOf(f17);
        objectArray35[2] = Float.valueOf(f19);
        objectArray35[1] = Float.valueOf(f18);
        objectArray35[0] = callSite3;
        Object[] objectArray36 = new Object[2];
        objectArray36[1] = l6;
        objectArray36[0] = (int)callSite5;
        Object[] objectArray37 = new Object[5];
        objectArray37[4] = l7;
        objectArray37[3] = Float.valueOf(f17);
        objectArray37[2] = Float.valueOf(f16);
        objectArray37[1] = Float.valueOf(f18);
        objectArray37[0] = callSite3;
        Object[] objectArray38 = new Object[2];
        objectArray38[1] = l6;
        objectArray38[0] = (int)callSite5;
        Object[] objectArray39 = new Object[5];
        objectArray39[4] = l7;
        objectArray39[3] = Float.valueOf(f17);
        objectArray39[2] = Float.valueOf(f16);
        objectArray39[1] = Float.valueOf(f15);
        objectArray39[0] = callSite3;
        Object[] objectArray40 = new Object[2];
        objectArray40[1] = l6;
        objectArray40[0] = (int)callSite5;
        Object[] objectArray41 = new Object[5];
        objectArray41[4] = l7;
        objectArray41[3] = Float.valueOf(f20);
        objectArray41[2] = Float.valueOf(f16);
        objectArray41[1] = Float.valueOf(f15);
        objectArray41[0] = callSite3;
        Object[] objectArray42 = new Object[2];
        objectArray42[1] = l6;
        objectArray42[0] = (int)callSite5;
        Object[] objectArray43 = new Object[5];
        objectArray43[4] = l7;
        objectArray43[3] = Float.valueOf(f20);
        objectArray43[2] = Float.valueOf(f19);
        objectArray43[1] = Float.valueOf(f15);
        objectArray43[0] = callSite3;
        Object[] objectArray44 = new Object[2];
        objectArray44[1] = l6;
        objectArray44[0] = (int)callSite5;
        Object[] objectArray45 = new Object[5];
        objectArray45[4] = l7;
        objectArray45[3] = Float.valueOf(f17);
        objectArray45[2] = Float.valueOf(f19);
        objectArray45[1] = Float.valueOf(f15);
        objectArray45[0] = callSite3;
        Object[] objectArray46 = new Object[2];
        objectArray46[1] = l6;
        objectArray46[0] = (int)callSite5;
        Object[] objectArray47 = new Object[5];
        objectArray47[4] = l7;
        objectArray47[3] = Float.valueOf(f17);
        objectArray47[2] = Float.valueOf(f16);
        objectArray47[1] = Float.valueOf(f18);
        objectArray47[0] = callSite3;
        Object[] objectArray48 = new Object[2];
        objectArray48[1] = l6;
        objectArray48[0] = (int)callSite5;
        Object[] objectArray49 = new Object[5];
        objectArray49[4] = l7;
        objectArray49[3] = Float.valueOf(f17);
        objectArray49[2] = Float.valueOf(f19);
        objectArray49[1] = Float.valueOf(f18);
        objectArray49[0] = callSite3;
        Object[] objectArray50 = new Object[2];
        objectArray50[1] = l6;
        objectArray50[0] = (int)callSite5;
        Object[] objectArray51 = new Object[5];
        objectArray51[4] = l7;
        objectArray51[3] = Float.valueOf(f20);
        objectArray51[2] = Float.valueOf(f19);
        objectArray51[1] = Float.valueOf(f18);
        objectArray51[0] = callSite3;
        Object[] objectArray52 = new Object[2];
        objectArray52[1] = l6;
        objectArray52[0] = (int)callSite5;
        Object[] objectArray53 = new Object[5];
        objectArray53[4] = l7;
        objectArray53[3] = Float.valueOf(f20);
        objectArray53[2] = Float.valueOf(f16);
        objectArray53[1] = Float.valueOf(f18);
        objectArray53[0] = callSite3;
        Object[] objectArray54 = new Object[2];
        objectArray54[1] = l6;
        objectArray54[0] = (int)callSite5;
        Object[] objectArray55 = new Object[2];
        objectArray55[1] = l8;
        objectArray55[0] = m_0.QUADS;
        dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)callSite4, (Object)objectArray6, (long)-3195243834017649953L, (long)l))), (Object)objectArray7, (long)-3196483235890098985L, (long)l), (Object)objectArray8, (long)-3197372945379592646L, (long)l), (Object)objectArray9, (long)-3196483235890098985L, (long)l), (Object)objectArray10, (long)-3197372945379592646L, (long)l), (Object)objectArray11, (long)-3196483235890098985L, (long)l), (Object)objectArray12, (long)-3197372945379592646L, (long)l), (Object)objectArray13, (long)-3196483235890098985L, (long)l), (Object)objectArray14, (long)-3197372945379592646L, (long)l), (Object)objectArray15, (long)-3196483235890098985L, (long)l), (Object)objectArray16, (long)-3197372945379592646L, (long)l), (Object)objectArray17, (long)-3196483235890098985L, (long)l), (Object)objectArray18, (long)-3197372945379592646L, (long)l), (Object)objectArray19, (long)-3196483235890098985L, (long)l), (Object)objectArray20, (long)-3197372945379592646L, (long)l), (Object)objectArray21, (long)-3196483235890098985L, (long)l), (Object)objectArray22, (long)-3197372945379592646L, (long)l), (Object)objectArray23, (long)-3196483235890098985L, (long)l), (Object)objectArray24, (long)-3197372945379592646L, (long)l), (Object)objectArray25, (long)-3196483235890098985L, (long)l), (Object)objectArray26, (long)-3197372945379592646L, (long)l), (Object)objectArray27, (long)-3196483235890098985L, (long)l), (Object)objectArray28, (long)-3197372945379592646L, (long)l), (Object)objectArray29, (long)-3196483235890098985L, (long)l), (Object)objectArray30, (long)-3197372945379592646L, (long)l), (Object)objectArray31, (long)-3196483235890098985L, (long)l), (Object)objectArray32, (long)-3197372945379592646L, (long)l), (Object)objectArray33, (long)-3196483235890098985L, (long)l), (Object)objectArray34, (long)-3197372945379592646L, (long)l), (Object)objectArray35, (long)-3196483235890098985L, (long)l), (Object)objectArray36, (long)-3197372945379592646L, (long)l), (Object)objectArray37, (long)-3196483235890098985L, (long)l), (Object)objectArray38, (long)-3197372945379592646L, (long)l), (Object)objectArray39, (long)-3196483235890098985L, (long)l), (Object)objectArray40, (long)-3197372945379592646L, (long)l), (Object)objectArray41, (long)-3196483235890098985L, (long)l), (Object)objectArray42, (long)-3197372945379592646L, (long)l), (Object)objectArray43, (long)-3196483235890098985L, (long)l), (Object)objectArray44, (long)-3197372945379592646L, (long)l), (Object)objectArray45, (long)-3196483235890098985L, (long)l), (Object)objectArray46, (long)-3197372945379592646L, (long)l), (Object)objectArray47, (long)-3196483235890098985L, (long)l), (Object)objectArray48, (long)-3197372945379592646L, (long)l), (Object)objectArray49, (long)-3196483235890098985L, (long)l), (Object)objectArray50, (long)-3197372945379592646L, (long)l), (Object)objectArray51, (long)-3196483235890098985L, (long)l), (Object)objectArray52, (long)-3197372945379592646L, (long)l), (Object)objectArray53, (long)-3196483235890098985L, (long)l), (Object)objectArray54, (long)-3197372945379592646L, (long)l), (Object)objectArray55, (long)-3194088736452843197L, (long)l))), (Object)new Object[0], (long)-3193127975125330572L, (long)l);
    }

    public static void f(Object[] objectArray) {
        block9: {
            Object object;
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block8: {
                gK gK2 = (gK)objectArray[0];
                aq_0 aq_02 = (aq_0)objectArray[1];
                float f = ((Float)objectArray[2]).floatValue();
                float f10 = ((Float)objectArray[3]).floatValue();
                float f11 = ((Float)objectArray[4]).floatValue();
                float f12 = ((Float)objectArray[5]).floatValue();
                float f13 = ((Float)objectArray[6]).floatValue();
                float f14 = ((Float)objectArray[7]).floatValue();
                Color color = (Color)objectArray[8];
                Color color2 = (Color)objectArray[9];
                l2 = (Long)objectArray[10];
                long l3 = l2 = e ^ l2;
                long l4 = l3 ^ 0x33CF56BA1518L;
                long l5 = l3 ^ 0x67C39B3EDBA7L;
                long l6 = l3 ^ 0x3874160500D4L;
                long l7 = l3 ^ 0x190FAED36CDFL;
                long l8 = l3 ^ 0x4B4AD11F4DE1L;
                long l9 = l3 ^ 0x3006A553A66CL;
                l = l3 ^ 0xC37B932E1F8L;
                long l10 = l3 ^ 0x617412899CA2L;
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = l4;
                objectArray2[3] = (double)f11;
                objectArray2[2] = (double)f10;
                objectArray2[1] = (double)f;
                objectArray2[0] = gK2;
                CallSite callSite3 = dA.b("\u00c0", (Object)objectArray2, (long)4905567491120013073L, (long)l2);
                CallSite callSite4 = dA.b("K", (Object)((Matrix4f)dA.b("K", (Object)b, (long)4905768427232070247L, (long)l2)), (long)4908891979770142569L, (long)l2);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l10;
                objectArray3[0] = du_0.b;
                callSite2 = dA.b("K", (Object)aq_02, (Object)objectArray3, (long)4908592999126268353L, (long)l2);
                float f15 = (float)dA.b("\u00f8", (Object)callSite3, (long)4902388329075322432L, (long)l2);
                float f16 = (float)dA.b("\u00f8", (Object)callSite3, (long)4904713188023950579L, (long)l2);
                callSite = dA.b("\u00c0", (long)4904548787082909564L, (long)l2);
                float f17 = (float)dA.b("\u00f8", (Object)callSite3, (long)4905504868579781027L, (long)l2);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l5;
                objectArray4[0] = color;
                CallSite callSite5 = dA.b("\u00c0", (Object)objectArray4, (long)4904904249771742072L, (long)l2);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l5;
                objectArray5[0] = color2;
                int n = dA.b("\u00c0", (Object)objectArray5, (long)4904904249771742072L, (long)l2) & dA.a("w", (int)13457, (long)(0x13AF008090BDE23AL ^ l2));
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l6;
                dA.b("K", (Object)callSite2, (Object)objectArray6, (long)4907543954374229356L, (long)l2);
                for (object = 0; object <= dA.a("w", (int)2358, (long)(0x4F0BE3E2A2645F93L ^ l2)); ++object) {
                    float f18 = (float)(Math.PI * 2 * (double)object / 100.0);
                    float f19 = (float)dA.b("\u00c0", (double)f18, (long)4908192257632304189L, (long)l2);
                    float f20 = (float)dA.b("\u00c0", (double)f18, (long)4905240722934899011L, (long)l2);
                    float f21 = f15 + (f12 + f13 / 2.0f + f14) * f19;
                    float f22 = f17 + (f12 + f13 / 2.0f + f14) * f20;
                    Object[] objectArray7 = new Object[5];
                    objectArray7[4] = l8;
                    objectArray7[3] = Float.valueOf(f22);
                    objectArray7[2] = Float.valueOf(f16);
                    objectArray7[1] = Float.valueOf(f21);
                    objectArray7[0] = callSite4;
                    Object[] objectArray8 = new Object[2];
                    objectArray8[1] = l7;
                    objectArray8[0] = n;
                    dA.b("K", (Object)dA.b("K", (Object)callSite2, (Object)objectArray7, (long)4904667376081836900L, (long)l2), (Object)objectArray8, (long)4905415807988523401L, (long)l2);
                    float f23 = f15 + (f12 + f13 / 2.0f) * f19;
                    float f24 = f17 + (f12 + f13 / 2.0f) * f20;
                    Object[] objectArray9 = new Object[5];
                    objectArray9[4] = l8;
                    objectArray9[3] = Float.valueOf(f24);
                    objectArray9[2] = Float.valueOf(f16);
                    objectArray9[1] = Float.valueOf(f23);
                    objectArray9[0] = callSite4;
                    Object[] objectArray10 = new Object[2];
                    objectArray10[1] = l7;
                    objectArray10[0] = (int)callSite5;
                    dA.b("K", (Object)dA.b("K", (Object)callSite2, (Object)objectArray9, (long)4904667376081836900L, (long)l2), (Object)objectArray10, (long)4905415807988523401L, (long)l2);
                    float f25 = f15 + (f12 - f13 / 2.0f) * f19;
                    float f26 = f17 + (f12 - f13 / 2.0f) * f20;
                    Object[] objectArray11 = new Object[5];
                    objectArray11[4] = l8;
                    objectArray11[3] = Float.valueOf(f26);
                    objectArray11[2] = Float.valueOf(f16);
                    objectArray11[1] = Float.valueOf(f25);
                    objectArray11[0] = callSite4;
                    Object[] objectArray12 = new Object[2];
                    objectArray12[1] = l7;
                    objectArray12[0] = (int)callSite5;
                    dA.b("K", (Object)dA.b("K", (Object)callSite2, (Object)objectArray11, (long)4904667376081836900L, (long)l2), (Object)objectArray12, (long)4905415807988523401L, (long)l2);
                    float f27 = f15 + (f12 - f13 / 2.0f - f14) * f19;
                    float f28 = f17 + (f12 - f13 / 2.0f - f14) * f20;
                    try {
                        Object[] objectArray13 = new Object[5];
                        objectArray13[4] = l8;
                        objectArray13[3] = Float.valueOf(f28);
                        objectArray13[2] = Float.valueOf(f16);
                        objectArray13[1] = Float.valueOf(f27);
                        objectArray13[0] = callSite4;
                        Object[] objectArray14 = new Object[2];
                        objectArray14[1] = l7;
                        objectArray14[0] = n;
                        dA.b("K", (Object)dA.b("K", (Object)callSite2, (Object)objectArray13, (long)4904667376081836900L, (long)l2), (Object)objectArray14, (long)4905415807988523401L, (long)l2);
                        if (callSite == null) {
                            if (callSite == null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw dA.b("\u00c0", (Object)matchException, (long)4908690029327358750L, (long)l2);
                    }
                }
                object = dA.a("w", (int)32289, (long)(0x1AB2F4CEEF83A885L ^ l2));
                Object[] objectArray15 = new Object[2];
                objectArray15[1] = l9;
                objectArray15[0] = object * dA.a("w", (int)8943, (long)(0x4D8E6F8C4D80F44EL ^ l2)) * 4;
                dA.b("K", (Object)callSite2, (Object)objectArray15, (long)4906353244039906273L, (long)l2);
            }
            for (int i = 0; i < object; ++i) {
                int n = i * 4;
                int n2 = (i + 1) % dA.a("w", (int)27736, (long)(0x15FBFD0B2776BAF4L ^ l2)) * 4;
                try {
                    int[] nArray = new int[dA.a("w", (int)15941, (long)(0x47172341484868EFL ^ l2))];
                    nArray[0] = n;
                    nArray[1] = n + 1;
                    nArray[2] = n2 + 1;
                    nArray[3] = n2 + 1;
                    nArray[4] = n2;
                    nArray[5] = n;
                    Object[] objectArray16 = new Object[2];
                    objectArray16[1] = l;
                    objectArray16[0] = nArray;
                    dA.b("K", (Object)callSite2, (Object)objectArray16, (long)4908533680855090974L, (long)l2);
                    int[] nArray2 = new int[dA.a("w", (int)479, (long)(0x4CF836FC248C5772L ^ l2))];
                    nArray2[0] = n + 1;
                    nArray2[1] = n + 2;
                    nArray2[2] = n2 + 2;
                    nArray2[3] = n2 + 2;
                    nArray2[4] = n2 + 1;
                    nArray2[5] = n + 1;
                    Object[] objectArray17 = new Object[2];
                    objectArray17[1] = l;
                    objectArray17[0] = nArray2;
                    dA.b("K", (Object)callSite2, (Object)objectArray17, (long)4908533680855090974L, (long)l2);
                    int[] nArray3 = new int[dA.a("w", (int)479, (long)(0x4CF836FC248C5772L ^ l2))];
                    nArray3[0] = n + 2;
                    nArray3[1] = n + 3;
                    nArray3[2] = n2 + 3;
                    nArray3[3] = n2 + 3;
                    nArray3[4] = n2 + 2;
                    nArray3[5] = n + 2;
                    Object[] objectArray18 = new Object[2];
                    objectArray18[1] = l;
                    objectArray18[0] = nArray3;
                    dA.b("K", (Object)callSite2, (Object)objectArray18, (long)4908533680855090974L, (long)l2);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block9;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)4908690029327358750L, (long)l2);
                }
            }
            dA.b("K", (Object)callSite2, (Object)new Object[0], (long)4907961068556600007L, (long)l2);
        }
    }

    public static void l(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = e ^ l) ^ 0x46227544D549L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)dA.b("K", (Object)color, (long)8021894204708785089L, (long)l);
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        dA.b("\u00c0", (Object)objectArray2, (long)8024989063448232422L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = dA.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = dA.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dA.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dA.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dA.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dA.b(956926267420809L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dA.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dA.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dA.b(956926267420809L, 0L);
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

    public static void d(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        aq_0 aq_02 = (aq_0)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        Color color = (Color)objectArray[6];
        Color color2 = (Color)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = e ^ l) ^ 0x73E556598C5L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = color2;
        objectArray2[7] = color;
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = dA.b("K", (Object)((Matrix4f)dA.b("K", (Object)b, (long)3094523765362910338L, (long)l)), (long)3097031389527011724L, (long)l);
        objectArray2[1] = aq_02;
        objectArray2[0] = gK2;
        dA.b("\u00c0", (Object)objectArray2, (long)3094661655460313492L, (long)l);
    }

    public static void a(Object[] objectArray) {
        block5: {
            AtomicReference atomicReference;
            long l;
            block4: {
                l = (Long)objectArray[0];
                l = e ^ l;
                CallSite callSite = dA.b("\u00c0", (long)5775048591246639945L, (long)l);
                try {
                    try {
                        atomicReference = a;
                        if (callSite != null) break block4;
                        if (dA.b("K", (Object)atomicReference, (long)5782026575343751973L, (long)l) != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dA.b("\u00c0", (Object)matchException, (long)5776507164974190379L, (long)l);
                    }
                    atomicReference = a;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)5776507164974190379L, (long)l);
                }
            }
            dA.b("K", (Object)atomicReference, null, (Object)new ga_0(), (long)5774278238084220369L, (long)l);
        }
    }

    public static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = e ^ l;
        float f10 = (float)dA.b("K", (Object)color, (long)6301138377676114447L, (long)l) / 255.0f;
        float f11 = (float)dA.b("K", (Object)color, (long)6298857777666668678L, (long)l) / 255.0f;
        float f12 = (float)dA.b("K", (Object)color, (long)6304738801958495517L, (long)l) / 255.0f;
        return new Color(f10, f11, f12, f);
    }

    public static ga_0 a(Object[] objectArray) {
        ga_0 ga_02;
        block2: {
            ga_0 ga_03;
            block3: {
                long l = (Long)objectArray[0];
                long l2 = (l = e ^ l) ^ 0x5427D9B2F112L;
                ga_03 = (ga_0)((Object)dA.b("K", (Object)a, (long)8467513624312002202L, (long)l));
                CallSite callSite = dA.b("\u00c0", (long)8474187176563599094L, (long)l);
                try {
                    ga_02 = ga_03;
                    if (callSite != null) break block2;
                    if (ga_02 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)8472681465800764052L, (long)l);
                }
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                dA.b("\u00c0", (Object)objectArray2, (long)8467463037102718035L, (long)l);
                ga_03 = (ga_0)((Object)dA.b("K", (Object)a, (long)8467513624312002202L, (long)l));
            }
            ga_02 = ga_03;
        }
        return ga_02;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x12A8;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dA.g[n2] = n3;
        }
        return g[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dA.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            if (c == '\u00f8' || c == 'E' || c == '\u00de' || c == '\u00e0') {
                field = dA.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dA.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dA.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = e ^ l) ^ 0x780F19BADA22L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)dA.b("K", (Object)color, (long)5411465387662356363L, (long)l);
        return (int)dA.b("\u00c0", (Object)objectArray2, (long)5412814593804411580L, (long)l);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 45;
            case 1 -> 27;
            case 2 -> 54;
            case 3 -> 53;
            case 4 -> 18;
            case 5 -> 52;
            case 6 -> 58;
            case 7 -> 1;
            case 8 -> 42;
            case 9 -> 33;
            case 10 -> 2;
            case 11 -> 17;
            case 12 -> 63;
            case 13 -> 48;
            case 14 -> 23;
            case 15 -> 24;
            case 16 -> 60;
            case 17 -> 21;
            case 18 -> 51;
            case 19 -> 46;
            case 20 -> 19;
            case 21 -> 36;
            case 22 -> 0;
            case 23 -> 4;
            case 24 -> 9;
            case 25 -> 37;
            case 26 -> 44;
            case 27 -> 11;
            case 28 -> 22;
            case 29 -> 41;
            case 30 -> 26;
            case 31 -> 57;
            case 32 -> 32;
            case 33 -> 13;
            case 34 -> 6;
            case 35 -> 49;
            case 36 -> 15;
            case 37 -> 10;
            case 38 -> 47;
            case 39 -> 30;
            case 40 -> 34;
            case 41 -> 40;
            case 42 -> 16;
            case 43 -> 8;
            case 44 -> 31;
            case 45 -> 29;
            case 46 -> 35;
            case 47 -> 59;
            case 48 -> 55;
            case 49 -> 43;
            case 50 -> 12;
            case 51 -> 61;
            case 52 -> 14;
            case 53 -> 5;
            case 54 -> 38;
            case 55 -> 7;
            case 56 -> 28;
            case 57 -> 20;
            case 58 -> 3;
            case 59 -> 50;
            case 60 -> 56;
            case 61 -> 62;
            case 62 -> 25;
            default -> 39;
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
        dA.j[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "UTs:\u0011\u007fWJ:B\u001esNIf'\u001f";
        objectArray[1] = Double.TYPE;
        dA.j[1] = "java/lang/Double";
        objectArray[2] = "!/o,BD7/jvQS dip]G1#~g\u0016P\u0004";
        objectArray[3] = "\u001dENq\u007f\u0018heE~nW\tkNuj\r}";
        objectArray[4] = Integer.TYPE;
        dA.j[4] = "java/lang/Integer";
        objectArray[5] = "#0m?\u001dO50he\u000eX\"{kc\u0002L3<|tI[7";
        objectArray[6] = "\u001bOM}PtnoFrA;\u000faMyEa{";
        objectArray[7] = ".#_ZoP8#Z\u0000|G/hY\u0006pS>/N\u0011;B\u001e";
        objectArray[8] = "8m\u001bb\u0018oMM\u0010m\t ,C\u001bf\rzX";
        objectArray[9] = "oHPR\nDyHU\b\u0019Sn\u0003V\u000e\u0015G\u007fDA\u0019^WM";
        objectArray[10] = "4\u001a$\u0005\fLA:/\n\u001d\u0003 4$\u0001\u0019YT";
        objectArray[11] = "[\u0003{27\u0003Y\u001d2Q<\u0018F\u0018d(;";
        objectArray[12] = "?Y\u001f\rB\t4V\u000eB8\r']\b\b \n6Y\u0005";
        objectArray[13] = "O\u0016\u001a7\u0012\bD\u0019\u000bxs\u0006O\u0012\u000f\"";
        objectArray[14] = "K%9E2s>\u00052J#<_\u000b9A'f+";
        objectArray[15] = "c$#T\r\u000eu$&\u000e\u001e\u0019bo%\b\u0012\rs(2\u001fY\u001fv";
        objectArray[16] = "\u000b[L^LG~{GQ]\b\u001fuLZYRk";
        objectArray[17] = "JbKrO\u0010?B@}^_^LKvZ\u0005*";
        objectArray[18] = "\u001a\u001afM\b|o:mB\u00193\u000e4fI\u001diz";
        objectArray[19] = "/P\u0002\u007f)*Zp\tp8e;~\u0002{<?O";
        objectArray[20] = Void.TYPE;
        dA.j[20] = "java/lang/Void";
        objectArray[21] = "<Y\r\u0003i9*Y\bYz.=\u0012\u000b_v:,U\u001cH=.9";
        objectArray[22] = "xcbXBY\rCiWS\u0016lMb\\WL\u0018";
        objectArray[23] = "\to3WQQ|O8X@\u001e\u001dA3SDDi";
        objectArray[24] = "sv>\u0019po\u0006V5\u0016a gX>\u001dez\u0013";
        objectArray[25] = "\u0000I*P=\u0012ui!_,]\u0014g*T(\u0007`";
        objectArray[26] = ");MW  \\\u001bFX1o=\u0015MS55I";
        objectArray[27] = "S1\u001fn\u0010\rX>\u000e!x\rV1\u001d";
        objectArray[28] = Float.TYPE;
        dA.j[28] = "java/lang/Float";
        objectArray[29] = "ItldA%<TgkPj]Zl`T0)";
        objectArray[30] = "\u001a[qXa}\f[t\u0002rj\u001b\u0010w\u0004~~\nW`\u00135l6";
        objectArray[31] = "]2TA'$(\u0012_N6kU\nLI?\"=";
        objectArray[32] = "#?\u0018[\u0000b(0\t\u0014co==\u0006\u007fVm,.\u001aSA`";
        objectArray[33] = "<wW/\u0017Y\"\u007fM`ZC8uT<KI8b\u000f/MC;\u007fB`xX9{H-kI0sS+WO3";
        objectArray[34] = Boolean.TYPE;
        dA.j[34] = "java/lang/Boolean";
        objectArray[35] = "\u0004{h5*q\u000ftyzI|\u001ar";
        objectArray[36] = "8t/ST+%awq\u0015&=g";
        objectArray[37] = "JI'N6B?i,A'\r^g'J#W*";
        objectArray[38] = "!9\u0006\u001cRoT\u0019\r\u0013C 5\u0017\u0006\u0018GzA";
        objectArray[39] = "%fA\u0010\u001ar3fDJ\te$-GL\u0005q5jP[Nf+";
        objectArray[40] = "G=<\\]92\u001d7SLvS\u0013<XH,'";
        objectArray[41] = "FRb:;\u001b3ri5*TR|b>.\u000e&";
        objectArray[42] = "\u0004u=Ks.\u001a}'\u0004\u0014/\u000bf*^2)";
        objectArray[43] = "q\u0007rCj q\u0007e\u001ff/kLe\u0001f:l=4Y4";
        objectArray[44] = "q\u001a}+)\u0018o\u0012gdF\u001fi\u001ar\u0006n\u001eo";
        objectArray[45] = "\u007fC\u0017\t}p\nc\u001c\u0006l?km\u0017\rhe\u001f";
        objectArray[46] = "*aN6\u0011\u000e_AE9\u0000A>ON2\u0004\u001bJ";
        objectArray[47] = "L/\u000eL\fv9\u000f\u0005C\u001d9X\u0001\u000eH\u0019c,";
        objectArray[48] = "\u0014=JQ^sa\u001dA^O<\u0000\u0013JUKft";
        objectArray[49] = "G$lw\u007fD2\u0004gxn\u000bS\nlsjQ'";
        objectArray[50] = "Sq!CU\f&Q*LDCG_!G@\u00193";
        objectArray[51] = "^rIs #HrL)34_9O/? N~X8t7O";
        objectArray[52] = "#H\u001f9y|Vh\u00146h37f\u001f=liC";
        objectArray[53] = "<E$J!g*E!\u00102p=\u000e\"\u0016>d,I5\u0001us,";
        objectArray[54] = "K\u0017=\u001d\u001bh>76\u0012\n'_9=\u0019\u000e}+";
        objectArray[55] = "\u0003\u001a^\u001b\u001arv:U\u0014\u000b=\u00174^\u001f\u000fgc";
        objectArray[56] = "@(TLt0^ N\u0003<0D*VD5+\u0004\u001aW]*)C,P";
        objectArray[57] = ">5\bU3ZK\u0015\u0003Z\"\u0015*\u001b\bQ&O^";
        objectArray[58] = "fud{aC\u0013Uotp\fr[d\u007ftV\u0006";
        objectArray[59] = "&w\u001a\u0006RbSW\u0011\tC-2Y\u001a\u0002GwF";
        objectArray[60] = "Wk\tR7M\u000bhM\\VHn+\f\n7\u0019TbW\u00010Jn~OH;\u0019S(\f_.!";
        objectArray[61] = "` \u0016hVY\"~\r.3Xu33o^Z~OG)L\t}\u007f\u001fx\u000fU\u0018";
        objectArray[62] = "\u0017\u0003aH2U\u0014Cf/25\u0010\u0006;I\u007f\u0005\u0014T0E";
        objectArray[63] = "#95@\u0011n=$9Bpn()UH\u001e>t(*\u0018\u0016y!U";
        objectArray[64] = "\u0011\u0005\u000bR}\u0000M\u0006O\\\u001c\u0001(E\u000e\n}T\u0012\fU\u0001z\u0007(\u0010MHqT\u0015F\u000e_dl";
        objectArray[65] = "V\rDQ\u0016PH\u0010HSwTW\u0004\\\u0001\rRy\u0007H3\u001aC0PJWFBO\u0000B\u0010\u0013?\u0001\u000f\u001bY\n@Q\u0007\\\fwYA\u0005\u0014\u0012\u0013\u0004[\u0006Ch";
        objectArray[66] = "JU\b!(}R@O=\u0010 _Kq>`<6VF7 :R\u000b\\4w@";
        objectArray[67] = "\u0002=\u000bY||\u0003<\\\u0007\u0019ox|Y\rx<B5\u0002\u0006\u007fox)\u001aOt<E\u007fYXa\u0004";
        objectArray[68] = "99/:\u000eqe:k4ol\u0000y*b\u000e%:0qi\tv\u0000,i \u0002%=z*7\u0017\u001d";
        objectArray[69] = "7g\r.\u0007s!g\t{gb1U\u0001f\u001brJ~\u0015zWy.#\u000fy\u0000\u0003";
        objectArray[70] = "qtaQ\u0015r/q;]g'M09\f\u0006vwyb\u0007\u0001%MezN\nvp39Y\u001fN";
        objectArray[71] = "9Q|\u0002\u0007WeR8\ff\\\u0000\u0011yZ\u0007\u0003:X\"Q\u0000P\u0000D:\u0018\u000b\u0003=\u0012y\u000f\u001e;";
        objectArray[72] = "'HlaB\u0019{K(o#\u000f\u001e\bi9BM$A22E\u001e\u001e]*{NM#\u000bil[u";
        objectArray[73] = "QF>6,-\rEz8M<h\u0006;n,yRO`e+*hSx, yU\u0005;;5A";
        objectArray[74] = "\u0013\u0017M\u0012D\n\u0007@\f\nz\u0019\u000fBU\u001f-NU\u0012\bsCK_I\fCG\u0019TE";
        objectArray[75] = "\u0000a'? fQo\"?\u001edm?y~\u007f7Wv\"uxdmj:<s7P<y+f\u000f";
        objectArray[76] = "26IYQrn5\rW0t\u000bvL\u0001Q&1?\u0017\nVu\u000btME\u000e{;,\u001c\u0006R\u001e";
        objectArray[77] = "\u0018\u0006Dna\u0001B_Y1\u0000\t#]\u00142aX\u0019\u0014O9f\u000b#Z\u0010bg\u0010CYPe\u0000";
        objectArray[78] = "onH_\"043F]\u001a12\u007fyPtan~\u0006\u0000|&;\u0003";
        objectArray[79] = "\u0005D\u0003j7NTJ\u0006j\tMh\u001a]+h\u001fRS\u0006 oLhO\u001eid\u001fU\u0019]~q'";
        objectArray[80] = "<Z%gOO0\r:w!Z\"O#\u0015\u0018\u001djSb%\u001cOa__,\u001d\u0010=\bo(O\u001b15";
        objectArray[81] = "xPx9{5:\u000ec\u007f\u001e4mCH\u000bT[;\u0003mz{kcR.&\u001e";
        objectArray[82] = "]$S}6\u007f^dT\u001a4\u001fZ!\t|{/^s\u0002p";
        objectArray[83] = "'h\u001d\u0017<=ymG\u001bNl\u001b,EJ/9!e\u001eA(j\u001b)\u0005\u0014(s'w\u0000N$\u0001";
        objectArray[84] = "]7\u000b(FH\u00014O&'Mdw\u000epF\u001c^>U{AOd#T(]\u001a\rrZ-]$";
        objectArray[85] = "X41\u0001BF\u00047u\u000f#Uat4YB\u0012[=oREAa!w\u001bN\u0012\\w4\f[*";
        objectArray[86] = ")3wTKA%dhD%T/:\r\u001f\u0019\u001e(a=\u001bK\u0015$\\4\u001a\u0014Isl0H\u001fEN";
        objectArray[87] = "L7[}\u000b8B:\u0013yenrn\u0014)\u0004;H'O\"\u0003hriI`\nmIgD(\u000e\u0003";
        objectArray[88] = "j\u0013Q9i41N_;Q%;\u0002\u0000F7;&\u001f\tcQc`\u0000Q<?<<\u001e\r`Qj7O^??1jA\\\u0007";
        objectArray[89] = "b\u0000E_u8a@B8tXe\u0005\u001f^8haW\u0014R";
        objectArray[90] = "\u007fP\u0016Vl\u001f%\t\u000b\t\r\u0014D\u000bF\nlF~B\u001d\u0001k\u0015D\fBZj\u000e$\u000f\u0002]\r";
        objectArray[91] = "=\u0000CEs\u000fa\u0003\u0007K\u0012\n\u0004@F\u001ds[>\t\u001d\u0016t\b\u0004BGY,\u00064\u001a\u0016\u001apc";
        objectArray[92] = "kG_6^\u000fd\u001d\u0012v,\u001b\u000f\u001dQ=\u0012\u001amCLoBq";
        objectArray[93] = "J.82lW\bp#t\tV_=\b\"e9\t}-ql\tQ,n-\t";
        objectArray[94] = "CtF\u0018y\u001c\u001dq\u001c\u0014\u000bL\u007f0\u001eEj\u0018EyENmK\u007f5^\u001bmRCk[Aa ";
        objectArray[95] = ",Pa|;q \u0007~lUz\"O\u001b5i`uZ+m8#)? 2*!.\u000fxci}K\u0004'qkz{\\v27\u001f";
        objectArray[96] = "y\u0017\rm-~w\u001aEiC$GNB9\"}}\u0007\u00192%.GI\u001fp,+|G\u00128(E";
        objectArray[97] = "\u00075{g|\u0014[6?i\u001d\u0011>)$k,\u0002_\"{~\u007fx[+,5g\u0019Pt9f\u001d";
        objectArray[98] = "8\u0000Si\u0013\u00028\u0016[rsZk\u000bRl\u0012Gvf\u000bv\u0014Bg_\u000b`\u001cY\u0007";
        objectArray[99] = "q #E0p\u007f-kA^'Oyl\u0011?su07\u001a8 O~1X1%tp<\u00105K";
        objectArray[100] = "m3Q'F;10\u0015)'\u001eTsT\u007fFon:\u000ftA<T&\u0017=JoipT*_W";
        objectArray[101] = ".\u0013\f\u0011C\nr\u0010H\u001f\"\u0003\u0017S\tIC^-\u001aRBD\r\u0017\u0006J\u000bO^*P\t\u001cZf";
        objectArray[102] = "w@W 9~ \u0003\u001faBt\u001e\u000b[f#%$B\u0000m$v\u001e\u000e\u001b8$o\"P\u001eb(\u001d";
        objectArray[103] = "~Wi\u001a5V R3\u0016G\u0005B\u00131G&RxZjL!\u0001B\u0016q\u0019!\u0018~HtC-j";
        objectArray[104] = "09&!?E<n91Q@0-\\jm\u001a1kln?\u0011=Veo`Mjfa=kAW";
        objectArray[105] = "9\u0017ON\u001c\u001f!\u0002\bR$D(\u0002\f<\u0015LzC\rCED=\u0016p";
        objectArray[106] = "whUH\u0013\u001ah6\u001cXn\u0017\u00050Y\u0018\u000fF?y\u0002\u0013\b\u0015\u00050]JT\u0015z2\u0006X^\u0012\u0005";
        objectArray[107] = "&Ni$LV'O>z)G\\\u000f;pH\u0016fF`{OE\\Zx2D\u0016a\f;%Q.";
        objectArray[108] = "y\u0002I1+CmU\b)\u0015PeWQ<B\u0007?\u0007\rP,\u00025\\\b`(P>P";
        objectArray[109] = "q/\rQ\u0015\u007f\u007f\"EU{.OvB\u0005\u001a|u?\u0019\u000e\u001d/Oq\u001fL\u0014*t\u007f\u0012\u0004\u0010D";
        objectArray[110] = "N\u0012=a(?\fL&'M>[\u0001\u001dx0<6Fkcs4\u0006\u001e: /Q";
        objectArray[111] = "\u0007]G\u0016{\u0000YX\u001d\u001a\t\\;\u0019\u001fKh\u0004\u0001PD@oW;\u001c_\u0015oN\u0007BZOc<";
        objectArray[112] = "\\@x\n5iJ@|_Ux]RkS)~[?m_jk\u0019\u0002uJ-w!";
        objectArray[113] = "CZ\u0011X;eMWY\\U=}\u0003^\f4fGJ\u0005\u000735}\u0004\u0003E:0F\n\u000e\r>^";
        objectArray[114] = "\u0019&xN{>\u0017+0J\u0015e'\u007f7\u001at=\u001d6l\u0011sn'xjSzk\u001cvg\u001b~\u0005";
        objectArray[115] = "OnFy[<A=M{ 2I6_e~5I,[\u0019B;Q1S`\u00112Q/6";
        objectArray[116] = "HSj:\u0019\u0003\\\u0004+\"'\u0010T\u0006r7pG\u000eV,[\u001eB\u0004\r+k\u001a\u0010\u000f\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[117] = "4o71<b88(!Ri:pM!5p3e4r<p-\u0000/$.l6y|-.rSb*?2i*1#?,\f";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void m(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x5A22B0FCF83L;
        long l4 = l2 ^ 0x793B4C35237FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.c, (arg_0, arg_1) -> dA.lambda$rect$1(n, matrix4f, f, f12, f11, f10, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)7977649822950510238L, (long)l), (Object)objectArray3, (long)7976018108889718888L, (long)l);
    }

    public static void o(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        int n2 = (Integer)objectArray[6];
        int n3 = (Integer)objectArray[7];
        int n4 = (Integer)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x1CB56276F992L;
        long l4 = l2 ^ 0x602C054C156EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.c, (arg_0, arg_1) -> dA.lambda$rectGradient$2(n, n2, n3, n4, matrix4f, f, f12, f11, f10, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)6388170427202893967L, (long)l), (Object)objectArray3, (long)6386556314219009657L, (long)l);
    }

    public static void p(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x111E2F1DC7C9L;
        long l4 = l2 ^ 0x6D8748272B35L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.d, (arg_0, arg_1) -> dA.lambda$rectOutline$3(n, matrix4f, f, f12, f11, f10, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)7420905805148210900L, (long)l), (Object)objectArray3, (long)7420408855804667938L, (long)l);
    }

    public static void k(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        float f13 = ((Float)objectArray[5]).floatValue();
        float f14 = ((Float)objectArray[6]).floatValue();
        int n = (Integer)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x18462E0B6E10L;
        long l4 = l2 ^ 0x64DF493182ECL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.c, (arg_0, arg_1) -> dA.lambda$triangle$0(n, matrix4f, f, f10, f11, f12, f13, f14, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)-3520315333214146803L, (long)l), (Object)objectArray3, (long)-3520794759055490565L, (long)l);
    }

    public static void t(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        float f13 = ((Float)objectArray[5]).floatValue();
        long l = (Long)objectArray[6];
        long l2 = (l = e ^ l) ^ 0x683F5713E2AAL;
        Object[] objectArray2 = new Object[8];
        objectArray2[7] = l2;
        objectArray2[6] = new Vector4f(f13);
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)619568705694344407L, (long)l);
    }

    public static void g(Object[] objectArray) {
        gK gK2 = (gK)objectArray[0];
        aq_0 aq_02 = (aq_0)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        float f13 = ((Float)objectArray[6]).floatValue();
        float f14 = ((Float)objectArray[7]).floatValue();
        Color color = (Color)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x12F5A567F83CL;
        long l4 = l2 ^ 0x46F968E33683L;
        long l5 = l2 ^ 0x194EE5D8EDF0L;
        long l6 = l2 ^ 0x38355D0E81FBL;
        long l7 = l2 ^ 0x6A7022C2A0C5L;
        long l8 = l2 ^ 0x7E864748551CL;
        long l9 = l2 ^ 0x404EE1547186L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = (double)f11;
        objectArray2[2] = (double)f10;
        objectArray2[1] = (double)f;
        objectArray2[0] = gK2;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray2, (long)-6255444226046922187L, (long)l);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l3;
        objectArray3[3] = (double)f14;
        objectArray3[2] = (double)f13;
        objectArray3[1] = (double)f12;
        objectArray3[0] = gK2;
        CallSite callSite2 = dA.b("\u00c0", (Object)objectArray3, (long)-6255444226046922187L, (long)l);
        CallSite callSite3 = dA.b("K", (Object)((Matrix4f)dA.b("K", (Object)b, (long)-6255241091501299901L, (long)l)), (long)-6252190327903653299L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l9;
        objectArray4[0] = du_0.e;
        CallSite callSite4 = dA.b("K", (Object)aq_02, (Object)objectArray4, (long)-6252418597310819099L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = color;
        CallSite callSite5 = dA.b("\u00c0", (Object)objectArray5, (long)-6253923906526167460L, (long)l);
        float f15 = (float)dA.b("\u00f8", (Object)callSite, (long)-6256369540644224156L, (long)l);
        float f16 = (float)dA.b("\u00f8", (Object)callSite, (long)-6254044599547153961L, (long)l);
        float f17 = (float)dA.b("\u00f8", (Object)callSite, (long)-6253252940002737017L, (long)l);
        float f18 = (float)dA.b("\u00f8", (Object)callSite2, (long)-6256369540644224156L, (long)l);
        float f19 = (float)dA.b("\u00f8", (Object)callSite2, (long)-6254044599547153961L, (long)l);
        float f20 = (float)dA.b("\u00f8", (Object)callSite2, (long)-6253252940002737017L, (long)l);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l5;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l7;
        objectArray7[3] = Float.valueOf(f17);
        objectArray7[2] = Float.valueOf(f16);
        objectArray7[1] = Float.valueOf(f15);
        objectArray7[0] = callSite3;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l6;
        objectArray8[0] = (int)callSite5;
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = l7;
        objectArray9[3] = Float.valueOf(f20);
        objectArray9[2] = Float.valueOf(f16);
        objectArray9[1] = Float.valueOf(f15);
        objectArray9[0] = callSite3;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l6;
        objectArray10[0] = (int)callSite5;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l7;
        objectArray11[3] = Float.valueOf(f20);
        objectArray11[2] = Float.valueOf(f16);
        objectArray11[1] = Float.valueOf(f18);
        objectArray11[0] = callSite3;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l6;
        objectArray12[0] = (int)callSite5;
        Object[] objectArray13 = new Object[5];
        objectArray13[4] = l7;
        objectArray13[3] = Float.valueOf(f17);
        objectArray13[2] = Float.valueOf(f16);
        objectArray13[1] = Float.valueOf(f18);
        objectArray13[0] = callSite3;
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l6;
        objectArray14[0] = (int)callSite5;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = l7;
        objectArray15[3] = Float.valueOf(f17);
        objectArray15[2] = Float.valueOf(f16);
        objectArray15[1] = Float.valueOf(f15);
        objectArray15[0] = callSite3;
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l6;
        objectArray16[0] = (int)callSite5;
        Object[] objectArray17 = new Object[5];
        objectArray17[4] = l7;
        objectArray17[3] = Float.valueOf(f17);
        objectArray17[2] = Float.valueOf(f19);
        objectArray17[1] = Float.valueOf(f15);
        objectArray17[0] = callSite3;
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l6;
        objectArray18[0] = (int)callSite5;
        Object[] objectArray19 = new Object[5];
        objectArray19[4] = l7;
        objectArray19[3] = Float.valueOf(f20);
        objectArray19[2] = Float.valueOf(f19);
        objectArray19[1] = Float.valueOf(f15);
        objectArray19[0] = callSite3;
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = l6;
        objectArray20[0] = (int)callSite5;
        Object[] objectArray21 = new Object[5];
        objectArray21[4] = l7;
        objectArray21[3] = Float.valueOf(f20);
        objectArray21[2] = Float.valueOf(f16);
        objectArray21[1] = Float.valueOf(f15);
        objectArray21[0] = callSite3;
        Object[] objectArray22 = new Object[2];
        objectArray22[1] = l6;
        objectArray22[0] = (int)callSite5;
        Object[] objectArray23 = new Object[5];
        objectArray23[4] = l7;
        objectArray23[3] = Float.valueOf(f20);
        objectArray23[2] = Float.valueOf(f16);
        objectArray23[1] = Float.valueOf(f18);
        objectArray23[0] = callSite3;
        Object[] objectArray24 = new Object[2];
        objectArray24[1] = l6;
        objectArray24[0] = (int)callSite5;
        Object[] objectArray25 = new Object[5];
        objectArray25[4] = l7;
        objectArray25[3] = Float.valueOf(f20);
        objectArray25[2] = Float.valueOf(f19);
        objectArray25[1] = Float.valueOf(f18);
        objectArray25[0] = callSite3;
        Object[] objectArray26 = new Object[2];
        objectArray26[1] = l6;
        objectArray26[0] = (int)callSite5;
        Object[] objectArray27 = new Object[5];
        objectArray27[4] = l7;
        objectArray27[3] = Float.valueOf(f20);
        objectArray27[2] = Float.valueOf(f19);
        objectArray27[1] = Float.valueOf(f15);
        objectArray27[0] = callSite3;
        Object[] objectArray28 = new Object[2];
        objectArray28[1] = l6;
        objectArray28[0] = (int)callSite5;
        Object[] objectArray29 = new Object[5];
        objectArray29[4] = l7;
        objectArray29[3] = Float.valueOf(f20);
        objectArray29[2] = Float.valueOf(f19);
        objectArray29[1] = Float.valueOf(f18);
        objectArray29[0] = callSite3;
        Object[] objectArray30 = new Object[2];
        objectArray30[1] = l6;
        objectArray30[0] = (int)callSite5;
        Object[] objectArray31 = new Object[5];
        objectArray31[4] = l7;
        objectArray31[3] = Float.valueOf(f17);
        objectArray31[2] = Float.valueOf(f19);
        objectArray31[1] = Float.valueOf(f18);
        objectArray31[0] = callSite3;
        Object[] objectArray32 = new Object[2];
        objectArray32[1] = l6;
        objectArray32[0] = (int)callSite5;
        Object[] objectArray33 = new Object[5];
        objectArray33[4] = l7;
        objectArray33[3] = Float.valueOf(f17);
        objectArray33[2] = Float.valueOf(f16);
        objectArray33[1] = Float.valueOf(f18);
        objectArray33[0] = callSite3;
        Object[] objectArray34 = new Object[2];
        objectArray34[1] = l6;
        objectArray34[0] = (int)callSite5;
        Object[] objectArray35 = new Object[5];
        objectArray35[4] = l7;
        objectArray35[3] = Float.valueOf(f17);
        objectArray35[2] = Float.valueOf(f19);
        objectArray35[1] = Float.valueOf(f18);
        objectArray35[0] = callSite3;
        Object[] objectArray36 = new Object[2];
        objectArray36[1] = l6;
        objectArray36[0] = (int)callSite5;
        Object[] objectArray37 = new Object[5];
        objectArray37[4] = l7;
        objectArray37[3] = Float.valueOf(f17);
        objectArray37[2] = Float.valueOf(f19);
        objectArray37[1] = Float.valueOf(f15);
        objectArray37[0] = callSite3;
        Object[] objectArray38 = new Object[2];
        objectArray38[1] = l6;
        objectArray38[0] = (int)callSite5;
        Object[] objectArray39 = new Object[2];
        objectArray39[1] = l8;
        objectArray39[0] = m_0.DEBUG_LINE_STRIP;
        dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)((bT)((Object)dA.b("K", (Object)callSite4, (Object)objectArray6, (long)-6251216170690899896L, (long)l))), (Object)objectArray7, (long)-6254160931076180416L, (long)l), (Object)objectArray8, (long)-6253344199586870099L, (long)l), (Object)objectArray9, (long)-6254160931076180416L, (long)l), (Object)objectArray10, (long)-6253344199586870099L, (long)l), (Object)objectArray11, (long)-6254160931076180416L, (long)l), (Object)objectArray12, (long)-6253344199586870099L, (long)l), (Object)objectArray13, (long)-6254160931076180416L, (long)l), (Object)objectArray14, (long)-6253344199586870099L, (long)l), (Object)objectArray15, (long)-6254160931076180416L, (long)l), (Object)objectArray16, (long)-6253344199586870099L, (long)l), (Object)objectArray17, (long)-6254160931076180416L, (long)l), (Object)objectArray18, (long)-6253344199586870099L, (long)l), (Object)objectArray19, (long)-6254160931076180416L, (long)l), (Object)objectArray20, (long)-6253344199586870099L, (long)l), (Object)objectArray21, (long)-6254160931076180416L, (long)l), (Object)objectArray22, (long)-6253344199586870099L, (long)l), (Object)objectArray23, (long)-6254160931076180416L, (long)l), (Object)objectArray24, (long)-6253344199586870099L, (long)l), (Object)objectArray25, (long)-6254160931076180416L, (long)l), (Object)objectArray26, (long)-6253344199586870099L, (long)l), (Object)objectArray27, (long)-6254160931076180416L, (long)l), (Object)objectArray28, (long)-6253344199586870099L, (long)l), (Object)objectArray29, (long)-6254160931076180416L, (long)l), (Object)objectArray30, (long)-6253344199586870099L, (long)l), (Object)objectArray31, (long)-6254160931076180416L, (long)l), (Object)objectArray32, (long)-6253344199586870099L, (long)l), (Object)objectArray33, (long)-6254160931076180416L, (long)l), (Object)objectArray34, (long)-6253344199586870099L, (long)l), (Object)objectArray35, (long)-6254160931076180416L, (long)l), (Object)objectArray36, (long)-6253344199586870099L, (long)l), (Object)objectArray37, (long)-6254160931076180416L, (long)l), (Object)objectArray38, (long)-6253344199586870099L, (long)l), (Object)objectArray39, (long)-6252298526538951724L, (long)l))), (Object)new Object[0], (long)-6253048330434203677L, (long)l);
    }

    public static void v(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        Color color2 = (Color)objectArray[5];
        Color color3 = (Color)objectArray[6];
        Color color4 = (Color)objectArray[7];
        float f13 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = (l = e ^ l) ^ 0x23F631F80D0CL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = new Vector4f(f13);
        objectArray2[8] = color4;
        objectArray2[7] = color3;
        objectArray2[6] = color2;
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)-6237426655153880405L, (long)l);
    }

    public static void j(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = e ^ l) ^ 0x1C89951C55EAL;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)dA.b("K", (Object)color, (long)-1157384504424920222L, (long)l);
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)-1153722348145049275L, (long)l);
    }

    public static void q(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x34EC474FF8F8L;
        long l4 = l2 ^ 0x487520751404L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.d, (arg_0, arg_1) -> dA.lambda$line$4(n, matrix4f, f, f10, f11, f12, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)6470968364841597413L, (long)l), (Object)objectArray3, (long)6470462619675547411L, (long)l);
    }

    public static void z(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = e ^ l) ^ 0x1F7AD2BFDF25L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = (int)dA.b("K", (Object)color, (long)6119922588358979708L, (long)l);
        objectArray2[4] = Float.valueOf(f12);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = c;
        dA.b("\u00c0", (Object)objectArray2, (long)6116749764480398347L, (long)l);
    }

    public static void w(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        Color color3 = (Color)objectArray[7];
        Color color4 = (Color)objectArray[8];
        Vector4f vector4f = (Vector4f)objectArray[9];
        long l = (Long)objectArray[10];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0xAC1F1C7D1E4L;
        long l4 = l2 ^ 0x2043ACAA786BL;
        long l5 = l2 ^ 0x765896FD3D18L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = vector4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = new az_0((dt_0)((Object)dA.b("\u00c0", (Object)objectArray3, (long)8133156061084355522L, (long)l)), (arg_0, arg_1) -> dA.lambda$roundedRectGradient$7(color, color2, color3, color4, f11, f, f12, f10, matrix4f, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)8129350669089132793L, (long)l), (Object)objectArray4, (long)8131123051887361551L, (long)l);
    }

    public static void u(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Vector4f vector4f = (Vector4f)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x69CE8D699FACL;
        long l4 = l2 ^ 0x434CD0043623L;
        long l5 = l2 ^ 0x1557EA537350L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = vector4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = new az_0((dt_0)((Object)dA.b("\u00c0", (Object)objectArray3, (long)4509973873681352074L, (long)l)), (arg_0, arg_1) -> dA.lambda$roundedRect$6(color, f11, f, f12, f10, matrix4f, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)4510674244770340529L, (long)l), (Object)objectArray4, (long)4512587424916975687L, (long)l);
    }

    public static void r(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        float f13 = ((Float)objectArray[5]).floatValue();
        Color color = (Color)objectArray[6];
        Color color2 = (Color)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x43C063A2086EL;
        long l4 = l2 ^ 0x3F590498E492L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.c, (arg_0, arg_1) -> dA.lambda$gradientLine$5(color, color2, f11, f, f12, f10, f13, matrix4f, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)-6243387261421778573L, (long)l), (Object)objectArray3, (long)-6242617641818019963L, (long)l);
    }

    public static void y(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x4764DC42BA06L;
        long l4 = l2 ^ 0x3BFDBB7856FAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.c, (arg_0, arg_1) -> dA.lambda$circle$8(n, matrix4f, f, f10, f11, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)1959924530317179675L, (long)l), (Object)objectArray3, (long)1960685353593017837L, (long)l);
    }

    public static void A(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x7796D19CFE52L;
        long l4 = l2 ^ 0xB0FB6A612AEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = new az_0(du_0.c, (arg_0, arg_1) -> dA.lambda$circleOutline$9(n, f12, f11, f, f10, matrix4f, arg_0, arg_1));
        dA.b("K", (Object)dA.b("\u00c0", (Object)objectArray2, (long)6874529378005385039L, (long)l), (Object)objectArray3, (long)6873038401699271097L, (long)l);
    }

    private static void lambda$roundedRectGradient$7(Color color, Color color2, Color color3, Color color4, float f, float f10, float f11, float f12, Matrix4f matrix4f, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x25C5B558DC67L;
        long l3 = l2 ^ 0xF024D08976AL;
        long l4 = l2 ^ 0x50B5C0334C19L;
        long l5 = l2 ^ 0x3312696AB0B2L;
        long l6 = l2 ^ 0x377D62A3F4F5L;
        long l7 = l2 ^ 0x5541744CCEC7L;
        long l8 = l2 ^ 0x5FF85733141EL;
        long l9 = l2 ^ 0x5EF6194D24E9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = color;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)638614685922664373L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = color2;
        CallSite callSite2 = dA.b("\u00c0", (Object)objectArray2, (long)638614685922664373L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = color3;
        CallSite callSite3 = dA.b("\u00c0", (Object)objectArray3, (long)638614685922664373L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l3;
        objectArray4[0] = color4;
        CallSite callSite4 = dA.b("\u00c0", (Object)objectArray4, (long)638614685922664373L, (long)l);
        float f14 = f - f10;
        float f15 = f11 - f12;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l4;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l8;
        objectArray6[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)636925520209860258L, (long)l));
        objectArray6[2] = Float.valueOf(f11);
        objectArray6[1] = Float.valueOf(f10);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l9;
        objectArray7[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l9;
        objectArray8[0] = new float[]{f14, f15};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l7;
        objectArray9[0] = (int)callSite;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l8;
        objectArray10[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)636925520209860258L, (long)l));
        objectArray10[2] = Float.valueOf(f11);
        objectArray10[1] = Float.valueOf(f);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l9;
        objectArray11[0] = new float[]{f14, 0.0f};
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l9;
        objectArray12[0] = new float[]{f14, f15};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l7;
        objectArray13[0] = (int)callSite2;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = l8;
        objectArray14[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)636925520209860258L, (long)l));
        objectArray14[2] = Float.valueOf(f12);
        objectArray14[1] = Float.valueOf(f);
        objectArray14[0] = matrix4f;
        Object[] objectArray15 = new Object[2];
        objectArray15[1] = l9;
        objectArray15[0] = new float[]{f14, f15};
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l9;
        objectArray16[0] = new float[]{f14, f15};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l7;
        objectArray17[0] = (int)callSite3;
        Object[] objectArray18 = new Object[5];
        objectArray18[4] = l8;
        objectArray18[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)636925520209860258L, (long)l));
        objectArray18[2] = Float.valueOf(f12);
        objectArray18[1] = Float.valueOf(f10);
        objectArray18[0] = matrix4f;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l9;
        objectArray19[0] = new float[]{0.0f, f15};
        Object[] objectArray20 = new Object[2];
        objectArray20[1] = l9;
        objectArray20[0] = new float[]{f14, f15};
        Object[] objectArray21 = new Object[2];
        objectArray21[1] = l7;
        objectArray21[0] = (int)callSite4;
        Object[] objectArray22 = new Object[2];
        objectArray22[1] = l6;
        objectArray22[0] = m_0.QUADS;
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l5;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray5, (long)636821709401436577L, (long)l), (Object)objectArray6, (long)635806558489129365L, (long)l), (Object)objectArray7, (long)635389323585550237L, (long)l), (Object)objectArray8, (long)635389323585550237L, (long)l), (Object)objectArray9, (long)639474047875510468L, (long)l), (Object)objectArray10, (long)635806558489129365L, (long)l), (Object)objectArray11, (long)635389323585550237L, (long)l), (Object)objectArray12, (long)635389323585550237L, (long)l), (Object)objectArray13, (long)639474047875510468L, (long)l), (Object)objectArray14, (long)635806558489129365L, (long)l), (Object)objectArray15, (long)635389323585550237L, (long)l), (Object)objectArray16, (long)635389323585550237L, (long)l), (Object)objectArray17, (long)639474047875510468L, (long)l), (Object)objectArray18, (long)635806558489129365L, (long)l), (Object)objectArray19, (long)635389323585550237L, (long)l), (Object)objectArray20, (long)635389323585550237L, (long)l), (Object)objectArray21, (long)639474047875510468L, (long)l), (Object)objectArray22, (long)635595127340479037L, (long)l), (Object)objectArray23, (long)636898513823094375L, (long)l);
    }

    private static void lambda$circle$8(int n, Matrix4f matrix4f, float f, float f10, float f11, Float f12, cF cF2) {
        block4: {
            long l;
            long l2 = l = e ^ 0xEF6BD2E8043L;
            long l3 = l2 ^ 0x7B86C845103DL;
            long l4 = l2 ^ 0x1821611CEC96L;
            long l5 = l2 ^ 0x1C4E6AD5A8D1L;
            long l6 = l2 ^ 0x4C57E7A8C5C1L;
            long l7 = l2 ^ 0x7E727C3A92E3L;
            long l8 = l2 ^ 0x74CB5F45483AL;
            Object[] objectArray = new Object[2];
            objectArray[1] = l6;
            objectArray[0] = n;
            CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)6124080107185323359L, (long)l);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            dA.b("K", (Object)cF2, (Object)objectArray2, (long)6121054673460227461L, (long)l);
            CallSite callSite2 = dA.b("\u00c0", (long)6122985436238727061L, (long)l);
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = l8;
            objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f12, (long)6121231172552559238L, (long)l));
            objectArray3[2] = Float.valueOf(f10);
            objectArray3[1] = Float.valueOf(f);
            objectArray3[0] = matrix4f;
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l7;
            objectArray4[0] = (int)callSite;
            dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray3, (long)6122359475172928945L, (long)l), (Object)objectArray4, (long)6123757984603778272L, (long)l);
            Object object = dA.b("\u00c0", (int)dA.a("w", (int)10924, (long)(0x6E08495B32F0ECEDL ^ l)), (int)((int)(f11 * 2.0f)), (long)6123173429862012624L, (long)l);
            CallSite callSite3 = callSite2;
            for (int i = 0; i < object; ++i) {
                float f13 = (float)(Math.PI * 2 * (double)i / (double)object);
                try {
                    Object[] objectArray5 = new Object[5];
                    objectArray5[4] = l8;
                    objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f12, (long)6121231172552559238L, (long)l));
                    objectArray5[2] = Float.valueOf((float)((double)f10 + dA.b("\u00c0", (double)f13, (long)6121558648763116756L, (long)l) * (double)f11));
                    objectArray5[1] = Float.valueOf((float)((double)f + dA.b("\u00c0", (double)f13, (long)6123674485864313258L, (long)l) * (double)f11));
                    objectArray5[0] = matrix4f;
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l7;
                    objectArray6[0] = (int)callSite;
                    dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray5, (long)6122359475172928945L, (long)l), (Object)objectArray6, (long)6123757984603778272L, (long)l);
                    if (callSite3 == null) {
                        if (callSite3 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)6122195512915332087L, (long)l);
                }
            }
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = l5;
            objectArray7[0] = m_0.TRIANGLES_FAN;
            Object[] objectArray8 = new Object[1];
            objectArray8[0] = l4;
            dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray7, (long)6122148181195058713L, (long)l), (Object)objectArray8, (long)6121127337524202051L, (long)l);
        }
    }

    private static void lambda$triangle$0(int n, Matrix4f matrix4f, float f, float f10, float f11, float f12, float f13, float f14, Float f15, cF cF2) {
        long l;
        long l2 = l = e ^ 0x2A0F9F1EE99CL;
        long l3 = l2 ^ 0x5F7FEA7579E2L;
        long l4 = l2 ^ 0x3CD8432C8549L;
        long l5 = l2 ^ 0x38B748E5C10EL;
        long l6 = l2 ^ 0x68AEC598AC1EL;
        long l7 = l2 ^ 0x5A8B5E0AFB3CL;
        long l8 = l2 ^ 0x50327D7521E5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = n;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)4405152173833409664L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l8;
        objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f15, (long)4408425527178388313L, (long)l));
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = (int)callSite;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l8;
        objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f15, (long)4408425527178388313L, (long)l));
        objectArray5[2] = Float.valueOf(f12);
        objectArray5[1] = Float.valueOf(f11);
        objectArray5[0] = matrix4f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = (int)callSite;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l8;
        objectArray7[3] = Float.valueOf((float)dA.b("K", (Object)f15, (long)4408425527178388313L, (long)l));
        objectArray7[2] = Float.valueOf(f14);
        objectArray7[1] = Float.valueOf(f13);
        objectArray7[0] = matrix4f;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = (int)callSite;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l5;
        objectArray9[0] = m_0.TRIANGLES;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray2, (long)4408318364895085658L, (long)l), (Object)objectArray3, (long)4407292821570946158L, (long)l), (Object)objectArray4, (long)4405876717537019199L, (long)l), (Object)objectArray5, (long)4407292821570946158L, (long)l), (Object)objectArray6, (long)4405876717537019199L, (long)l), (Object)objectArray7, (long)4407292821570946158L, (long)l), (Object)objectArray8, (long)4405876717537019199L, (long)l), (Object)objectArray9, (long)4407081939842828230L, (long)l), (Object)objectArray10, (long)4408382026707657628L, (long)l);
    }

    private static void lambda$rect$1(int n, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x1EE52555FE4EL;
        long l3 = l2 ^ 0x6B95503E6E30L;
        long l4 = l2 ^ 0x832F967929BL;
        long l5 = l2 ^ 0xC5DF2AED6DCL;
        long l6 = l2 ^ 0x5C447FD3BBCCL;
        long l7 = l2 ^ 0x6E61E441ECEEL;
        long l8 = l2 ^ 0x64D8C73E3637L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = n;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)3093984466271093586L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l8;
        objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)3098453738502780043L, (long)l));
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = (int)callSite;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l8;
        objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)3098453738502780043L, (long)l));
        objectArray5[2] = Float.valueOf(f10);
        objectArray5[1] = Float.valueOf(f11);
        objectArray5[0] = matrix4f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = (int)callSite;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l8;
        objectArray7[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)3098453738502780043L, (long)l));
        objectArray7[2] = Float.valueOf(f12);
        objectArray7[1] = Float.valueOf(f11);
        objectArray7[0] = matrix4f;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = (int)callSite;
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = l8;
        objectArray9[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)3098453738502780043L, (long)l));
        objectArray9[2] = Float.valueOf(f12);
        objectArray9[1] = Float.valueOf(f);
        objectArray9[0] = matrix4f;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l7;
        objectArray10[0] = (int)callSite;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l5;
        objectArray11[0] = m_0.QUADS;
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray2, (long)3098277364223447944L, (long)l), (Object)objectArray3, (long)3097330383567885244L, (long)l), (Object)objectArray4, (long)3095914006066385645L, (long)l), (Object)objectArray5, (long)3097330383567885244L, (long)l), (Object)objectArray6, (long)3095914006066385645L, (long)l), (Object)objectArray7, (long)3097330383567885244L, (long)l), (Object)objectArray8, (long)3095914006066385645L, (long)l), (Object)objectArray9, (long)3097330383567885244L, (long)l), (Object)objectArray10, (long)3095914006066385645L, (long)l), (Object)objectArray11, (long)3097118947587395604L, (long)l), (Object)objectArray12, (long)3098350041718027342L, (long)l);
    }

    private static void lambda$line$4(int n, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x325F06EC68E2L;
        long l3 = l2 ^ 0x472F7387F89CL;
        long l4 = l2 ^ 0x2488DADE0437L;
        long l5 = l2 ^ 0x20E7D1174070L;
        long l6 = l2 ^ 0x70FE5C6A2D60L;
        long l7 = l2 ^ 0x42DBC7F87A42L;
        long l8 = l2 ^ 0x4862E487A09BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = n;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)-4873978087977265666L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l8;
        objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-4876334101805014489L, (long)l));
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = (int)callSite;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l8;
        objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-4876334101805014489L, (long)l));
        objectArray5[2] = Float.valueOf(f12);
        objectArray5[1] = Float.valueOf(f11);
        objectArray5[0] = matrix4f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = (int)callSite;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = m_0.LINES;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray2, (long)-4876441396970158812L, (long)l), (Object)objectArray3, (long)-4875215689982474992L, (long)l), (Object)objectArray4, (long)-4874361714557598655L, (long)l), (Object)objectArray5, (long)-4875215689982474992L, (long)l), (Object)objectArray6, (long)-4874361714557598655L, (long)l), (Object)objectArray7, (long)-4875425889062648136L, (long)l), (Object)objectArray8, (long)-4876377738907032862L, (long)l);
    }

    private static void lambda$rectGradient$2(int n, int n2, int n3, int n4, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x1D9B47230CFL;
        long l3 = l2 ^ 0x74A9C119A0B1L;
        long l4 = l2 ^ 0x170E68405C1AL;
        long l5 = l2 ^ 0x13616389185DL;
        long l6 = l2 ^ 0x4378EEF4754DL;
        long l7 = l2 ^ 0x715D7566226FL;
        long l8 = l2 ^ 0x7BE45619F8B6L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = n;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)-1985782569537532461L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l6;
        objectArray2[0] = n2;
        CallSite callSite2 = dA.b("\u00c0", (Object)objectArray2, (long)-1985782569537532461L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l6;
        objectArray3[0] = n3;
        CallSite callSite3 = dA.b("\u00c0", (Object)objectArray3, (long)-1985782569537532461L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = n4;
        CallSite callSite4 = dA.b("\u00c0", (Object)objectArray4, (long)-1985782569537532461L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l3;
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = l8;
        objectArray6[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-1981877960414086646L, (long)l));
        objectArray6[2] = Float.valueOf(f10);
        objectArray6[1] = Float.valueOf(f);
        objectArray6[0] = matrix4f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l7;
        objectArray7[0] = (int)callSite;
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = l8;
        objectArray8[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-1981877960414086646L, (long)l));
        objectArray8[2] = Float.valueOf(f10);
        objectArray8[1] = Float.valueOf(f11);
        objectArray8[0] = matrix4f;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l7;
        objectArray9[0] = (int)callSite2;
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = l8;
        objectArray10[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-1981877960414086646L, (long)l));
        objectArray10[2] = Float.valueOf(f12);
        objectArray10[1] = Float.valueOf(f11);
        objectArray10[0] = matrix4f;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l7;
        objectArray11[0] = (int)callSite3;
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = l8;
        objectArray12[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-1981877960414086646L, (long)l));
        objectArray12[2] = Float.valueOf(f12);
        objectArray12[1] = Float.valueOf(f);
        objectArray12[0] = matrix4f;
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l7;
        objectArray13[0] = (int)callSite4;
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l5;
        objectArray14[0] = m_0.QUADS;
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray5, (long)-1982052346124051191L, (long)l), (Object)objectArray6, (long)-1983005855662908099L, (long)l), (Object)objectArray7, (long)-1983841828468056980L, (long)l), (Object)objectArray8, (long)-1983005855662908099L, (long)l), (Object)objectArray9, (long)-1983841828468056980L, (long)l), (Object)objectArray10, (long)-1983005855662908099L, (long)l), (Object)objectArray11, (long)-1983841828468056980L, (long)l), (Object)objectArray12, (long)-1983005855662908099L, (long)l), (Object)objectArray13, (long)-1983841828468056980L, (long)l), (Object)objectArray14, (long)-1983217183732015467L, (long)l), (Object)objectArray15, (long)-1981984269076219185L, (long)l);
    }

    private static void lambda$rectOutline$3(int n, Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x257D85779D50L;
        long l3 = l2 ^ 0x500DF01C0D2EL;
        long l4 = l2 ^ 0x33AA5945F185L;
        long l5 = l2 ^ 0x37C5528CB5C2L;
        long l6 = l2 ^ 0x67DCDFF1D8D2L;
        long l7 = l2 ^ 0x55F944638FF0L;
        long l8 = l2 ^ 0x5F40671C5529L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = n;
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)5327250256436928588L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l8;
        objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = (int)callSite;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l8;
        objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray5[2] = Float.valueOf(f10);
        objectArray5[1] = Float.valueOf(f11);
        objectArray5[0] = matrix4f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = (int)callSite;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l8;
        objectArray7[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray7[2] = Float.valueOf(f10);
        objectArray7[1] = Float.valueOf(f11);
        objectArray7[0] = matrix4f;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = (int)callSite;
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = l8;
        objectArray9[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray9[2] = Float.valueOf(f12);
        objectArray9[1] = Float.valueOf(f11);
        objectArray9[0] = matrix4f;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l7;
        objectArray10[0] = (int)callSite;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l8;
        objectArray11[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray11[2] = Float.valueOf(f12);
        objectArray11[1] = Float.valueOf(f11);
        objectArray11[0] = matrix4f;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l7;
        objectArray12[0] = (int)callSite;
        Object[] objectArray13 = new Object[5];
        objectArray13[4] = l8;
        objectArray13[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray13[2] = Float.valueOf(f12);
        objectArray13[1] = Float.valueOf(f);
        objectArray13[0] = matrix4f;
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l7;
        objectArray14[0] = (int)callSite;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = l8;
        objectArray15[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray15[2] = Float.valueOf(f12);
        objectArray15[1] = Float.valueOf(f);
        objectArray15[0] = matrix4f;
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l7;
        objectArray16[0] = (int)callSite;
        Object[] objectArray17 = new Object[5];
        objectArray17[4] = l8;
        objectArray17[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)5323765873080670101L, (long)l));
        objectArray17[2] = Float.valueOf(f10);
        objectArray17[1] = Float.valueOf(f);
        objectArray17[0] = matrix4f;
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l7;
        objectArray18[0] = (int)callSite;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = m_0.LINES;
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray2, (long)5323660755530051734L, (long)l), (Object)objectArray3, (long)5324897474764402850L, (long)l), (Object)objectArray4, (long)5325751725135245811L, (long)l), (Object)objectArray5, (long)5324897474764402850L, (long)l), (Object)objectArray6, (long)5325751725135245811L, (long)l), (Object)objectArray7, (long)5324897474764402850L, (long)l), (Object)objectArray8, (long)5325751725135245811L, (long)l), (Object)objectArray9, (long)5324897474764402850L, (long)l), (Object)objectArray10, (long)5325751725135245811L, (long)l), (Object)objectArray11, (long)5324897474764402850L, (long)l), (Object)objectArray12, (long)5325751725135245811L, (long)l), (Object)objectArray13, (long)5324897474764402850L, (long)l), (Object)objectArray14, (long)5325751725135245811L, (long)l), (Object)objectArray15, (long)5324897474764402850L, (long)l), (Object)objectArray16, (long)5325751725135245811L, (long)l), (Object)objectArray17, (long)5324897474764402850L, (long)l), (Object)objectArray18, (long)5325751725135245811L, (long)l), (Object)objectArray19, (long)5324687280029725450L, (long)l), (Object)objectArray20, (long)5323737904085276496L, (long)l);
    }

    private static void lambda$roundedRect$6(Color color, float f, float f10, float f11, float f12, Matrix4f matrix4f, Float f13, cF cF2) {
        long l;
        long l2 = l = e ^ 0x9A40BD746C1L;
        long l3 = l2 ^ 0x7CD47EBCD6BFL;
        long l4 = l2 ^ 0x1F73D7E52A14L;
        long l5 = l2 ^ 0x1B1CDC2C6E53L;
        long l6 = l2 ^ 0x4B0551510343L;
        long l7 = l2 ^ 0x7920CAC35461L;
        long l8 = l2 ^ 0x7399E9BC8EB8L;
        long l9 = l2 ^ 0x7297A7C2BE4FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = (int)dA.b("K", (Object)color, (long)-7892470304012470550L, (long)l);
        CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)-7890555880437384227L, (long)l);
        float f14 = f - f10;
        float f15 = f11 - f12;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l8;
        objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-7894533055171081212L, (long)l));
        objectArray3[2] = Float.valueOf(f11);
        objectArray3[1] = Float.valueOf(f10);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l9;
        objectArray4[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l9;
        objectArray5[0] = new float[]{f14, f15};
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = (int)callSite;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l8;
        objectArray7[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-7894533055171081212L, (long)l));
        objectArray7[2] = Float.valueOf(f11);
        objectArray7[1] = Float.valueOf(f);
        objectArray7[0] = matrix4f;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l9;
        objectArray8[0] = new float[]{f14, 0.0f};
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l9;
        objectArray9[0] = new float[]{f14, f15};
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l7;
        objectArray10[0] = (int)callSite;
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l8;
        objectArray11[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-7894533055171081212L, (long)l));
        objectArray11[2] = Float.valueOf(f12);
        objectArray11[1] = Float.valueOf(f);
        objectArray11[0] = matrix4f;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l9;
        objectArray12[0] = new float[]{f14, f15};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l9;
        objectArray13[0] = new float[]{f14, f15};
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l7;
        objectArray14[0] = (int)callSite;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = l8;
        objectArray15[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)-7894533055171081212L, (long)l));
        objectArray15[2] = Float.valueOf(f12);
        objectArray15[1] = Float.valueOf(f10);
        objectArray15[0] = matrix4f;
        Object[] objectArray16 = new Object[2];
        objectArray16[1] = l9;
        objectArray16[0] = new float[]{0.0f, f15};
        Object[] objectArray17 = new Object[2];
        objectArray17[1] = l9;
        objectArray17[0] = new float[]{f14, f15};
        Object[] objectArray18 = new Object[2];
        objectArray18[1] = l7;
        objectArray18[0] = (int)callSite;
        Object[] objectArray19 = new Object[2];
        objectArray19[1] = l5;
        objectArray19[0] = m_0.QUADS;
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray2, (long)-7894707231836427513L, (long)l), (Object)objectArray3, (long)-7893408458465858765L, (long)l), (Object)objectArray4, (long)-7892708599671296709L, (long)l), (Object)objectArray5, (long)-7892708599671296709L, (long)l), (Object)objectArray6, (long)-7892010637365286302L, (long)l), (Object)objectArray7, (long)-7893408458465858765L, (long)l), (Object)objectArray8, (long)-7892708599671296709L, (long)l), (Object)objectArray9, (long)-7892708599671296709L, (long)l), (Object)objectArray10, (long)-7892010637365286302L, (long)l), (Object)objectArray11, (long)-7893408458465858765L, (long)l), (Object)objectArray12, (long)-7892708599671296709L, (long)l), (Object)objectArray13, (long)-7892708599671296709L, (long)l), (Object)objectArray14, (long)-7892010637365286302L, (long)l), (Object)objectArray15, (long)-7893408458465858765L, (long)l), (Object)objectArray16, (long)-7892708599671296709L, (long)l), (Object)objectArray17, (long)-7892708599671296709L, (long)l), (Object)objectArray18, (long)-7892010637365286302L, (long)l), (Object)objectArray19, (long)-7893620444520601445L, (long)l), (Object)objectArray20, (long)-7894638952254419775L, (long)l);
    }

    private static void lambda$circleOutline$9(int n, float f, float f10, float f11, float f12, Matrix4f matrix4f, Float f13, cF cF2) {
        block4: {
            long l;
            long l2 = l = e ^ 0x50E5A86B8BFEL;
            long l3 = l2 ^ 0x2595DD001B80L;
            long l4 = l2 ^ 0x46327459E72BL;
            long l5 = l2 ^ 0x425D7F90A36CL;
            long l6 = l2 ^ 0x1244F2EDCE7CL;
            long l7 = l2 ^ 0x2061697F995EL;
            long l8 = l2 ^ 0x2AD84A004387L;
            Object[] objectArray = new Object[2];
            objectArray[1] = l6;
            objectArray[0] = n;
            CallSite callSite = dA.b("\u00c0", (Object)objectArray, (long)6863561123721131746L, (long)l);
            CallSite callSite2 = dA.a("w", (int)32289, (long)(0x1AB2E92F2486B3D1L ^ l));
            CallSite callSite3 = dA.b("\u00c0", (long)6864726919395626024L, (long)l);
            float f14 = f / 2.0f;
            float f15 = f10 + f14;
            CallSite callSite4 = dA.b("\u00c0", (float)0.0f, (float)(f10 - f14), (long)6867465707904462558L, (long)l);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            dA.b("K", (Object)cF2, (Object)objectArray2, (long)6867713284184892984L, (long)l);
            for (int i = 0; i <= callSite2; ++i) {
                float f16 = (float)(Math.PI * 2 * (double)i / (double)callSite2);
                float f17 = (float)dA.b("\u00c0", (double)f16, (long)6866154601553061737L, (long)l);
                float f18 = (float)dA.b("\u00c0", (double)f16, (long)6865446892828211735L, (long)l);
                float f19 = f11 + f15 * f17;
                float f20 = f12 + f15 * f18;
                float f21 = f11 + callSite4 * f17;
                float f22 = f12 + callSite4 * f18;
                try {
                    Object[] objectArray3 = new Object[5];
                    objectArray3[4] = l8;
                    objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)6867889663027052859L, (long)l));
                    objectArray3[2] = Float.valueOf(f20);
                    objectArray3[1] = Float.valueOf(f19);
                    objectArray3[0] = matrix4f;
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l7;
                    objectArray4[0] = (int)callSite;
                    dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray3, (long)6866761905888355852L, (long)l), (Object)objectArray4, (long)6865363120299190109L, (long)l);
                    Object[] objectArray5 = new Object[5];
                    objectArray5[4] = l8;
                    objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f13, (long)6867889663027052859L, (long)l));
                    objectArray5[2] = Float.valueOf(f22);
                    objectArray5[1] = Float.valueOf(f21);
                    objectArray5[0] = matrix4f;
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l7;
                    objectArray6[0] = (int)callSite;
                    dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray5, (long)6866761905888355852L, (long)l), (Object)objectArray6, (long)6865363120299190109L, (long)l);
                    if (callSite3 == null) {
                        if (callSite3 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)6866641923558998090L, (long)l);
                }
            }
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = l5;
            objectArray7[0] = m_0.QUAD_STRIP;
            Object[] objectArray8 = new Object[1];
            objectArray8[0] = l4;
            dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray7, (long)6866691211423016356L, (long)l), (Object)objectArray8, (long)6867922305550713342L, (long)l);
        }
    }

    private static void lambda$gradientLine$5(Color color, Color color2, float f, float f10, float f11, float f12, float f13, Matrix4f matrix4f, Float f14, cF cF2) {
        float f15;
        float f16;
        float f17;
        float f18;
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        block4: {
            float f19;
            block5: {
                long l7 = l6 = e ^ 0x10F5075205BCL;
                l5 = l7 ^ 0x6585723995C2L;
                l4 = l7 ^ 0x622DB606969L;
                l3 = l7 ^ 0x24DD0A92D2EL;
                long l8 = l7 ^ 0x52545DD4403EL;
                l2 = l7 ^ 0x6071C646171CL;
                l = l7 ^ 0x6AC8E539CDC5L;
                Object[] objectArray = new Object[2];
                objectArray[1] = l8;
                objectArray[0] = (int)dA.b("K", (Object)color, (long)-3385218996721601129L, (long)l6);
                callSite2 = dA.b("\u00c0", (Object)objectArray, (long)-3386139113853962080L, (long)l6);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l8;
                objectArray2[0] = (int)dA.b("K", (Object)color2, (long)-3385218996721601129L, (long)l6);
                callSite = dA.b("\u00c0", (Object)objectArray2, (long)-3386139113853962080L, (long)l6);
                f18 = f - f10;
                f19 = f11 - f12;
                f17 = (float)dA.b("\u00c0", (double)(f18 * f18 + f19 * f19), (long)-3385272109486104334L, (long)l6);
                CallSite callSite3 = dA.b("\u00c0", (long)-3384973180910517654L, (long)l6);
                try {
                    try {
                        f16 = f17;
                        f15 = 0.0f;
                        if (callSite3 != null) break block4;
                        if (f16 != f15) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dA.b("\u00c0", (Object)matchException, (long)-3384043480057410040L, (long)l6);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw dA.b("\u00c0", (Object)matchException, (long)-3384043480057410040L, (long)l6);
                }
            }
            f16 = -f19 / f17;
            f15 = f13 / 2.0f;
        }
        float f20 = f16 * f15;
        float f21 = f18 / f17 * (f13 / 2.0f);
        float f22 = f10 - f20;
        float f23 = f12 - f21;
        float f24 = f10 + f20;
        float f25 = f12 + f21;
        float f26 = f - f20;
        float f27 = f11 - f21;
        float f28 = f + f20;
        float f29 = f11 + f21;
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l;
        objectArray3[3] = Float.valueOf((float)dA.b("K", (Object)f14, (long)-3382795603016183943L, (long)l6));
        objectArray3[2] = Float.valueOf(f23);
        objectArray3[1] = Float.valueOf(f22);
        objectArray3[0] = matrix4f;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l2;
        objectArray4[0] = (int)callSite2;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l;
        objectArray5[3] = Float.valueOf((float)dA.b("K", (Object)f14, (long)-3382795603016183943L, (long)l6));
        objectArray5[2] = Float.valueOf(f25);
        objectArray5[1] = Float.valueOf(f24);
        objectArray5[0] = matrix4f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l2;
        objectArray6[0] = (int)callSite2;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = l;
        objectArray7[3] = Float.valueOf((float)dA.b("K", (Object)f14, (long)-3382795603016183943L, (long)l6));
        objectArray7[2] = Float.valueOf(f29);
        objectArray7[1] = Float.valueOf(f28);
        objectArray7[0] = matrix4f;
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l2;
        objectArray8[0] = (int)callSite;
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = l;
        objectArray9[3] = Float.valueOf((float)dA.b("K", (Object)f14, (long)-3382795603016183943L, (long)l6));
        objectArray9[2] = Float.valueOf(f27);
        objectArray9[1] = Float.valueOf(f26);
        objectArray9[0] = matrix4f;
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l2;
        objectArray10[0] = (int)callSite;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l3;
        objectArray11[0] = m_0.QUADS;
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l4;
        dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)dA.b("K", (Object)cF2, (Object)objectArray, (long)-3382972115875796870L, (long)l6), (Object)objectArray3, (long)-3383923493437347762L, (long)l6), (Object)objectArray4, (long)-3385322142454666977L, (long)l6), (Object)objectArray5, (long)-3383923493437347762L, (long)l6), (Object)objectArray6, (long)-3385322142454666977L, (long)l6), (Object)objectArray7, (long)-3383923493437347762L, (long)l6), (Object)objectArray8, (long)-3385322142454666977L, (long)l6), (Object)objectArray9, (long)-3383923493437347762L, (long)l6), (Object)objectArray10, (long)-3385322142454666977L, (long)l6), (Object)objectArray11, (long)-3384134792045663258L, (long)l6), (Object)objectArray12, (long)-3382903836427644996L, (long)l6);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


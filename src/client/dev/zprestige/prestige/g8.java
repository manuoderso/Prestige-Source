/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.b5;
import dev.zprestige.prestige.b6;
import dev.zprestige.prestige.b7;
import dev.zprestige.prestige.b8;
import dev.zprestige.prestige.b9;
import dev.zprestige.prestige.b_;
import dev.zprestige.prestige.ca_0;
import dev.zprestige.prestige.cb_0;
import dev.zprestige.prestige.cc_0;
import dev.zprestige.prestige.cd_0;
import dev.zprestige.prestige.ce_0;
import dev.zprestige.prestige.cf_0;
import dev.zprestige.prestige.cg_0;
import dev.zprestige.prestige.ch_0;
import dev.zprestige.prestige.ci_0;
import dev.zprestige.prestige.cj_0;
import dev.zprestige.prestige.cl_0;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dB;
import dev.zprestige.prestige.dr_0;
import dev.zprestige.prestige.g7;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.w_0;
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
import net.minecraft.class_11909;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_408;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g8
extends g7 {
    private final b4[] a;
    private final ArrayList b;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;
    private boolean i;
    private b4 j;
    private static final int[] k;
    private final long[] l;
    private final boolean[] m;
    private float n;
    private long o;
    private static final float p = 140.0f;
    private static final float q = 24.0f;
    private static final float r = 20.0f;
    private static final long s;
    private static final String[] t;
    private static final String[] u;
    private static final Map v;
    private static final long[] w;
    private static final Integer[] x;
    private static final Map y;
    private static final long[] z;
    private static final Long[] A;
    private static final Map B;
    private static final Object[] C;
    private static final String[] D;

    public g8(long l) {
        long l2 = l = s ^ l;
        long l3 = l2 ^ 0x4AD037312885L;
        long l4 = l2 ^ 0x295AC0B61149L;
        long l5 = l2 ^ 0x38D573A63FD7L;
        long l6 = l2 ^ 0x66A4F32031B4L;
        long l7 = l2 ^ 0xE5EBF237351L;
        long l8 = l2 ^ 0x5036D6265622L;
        long l9 = l2 ^ 0x322C163050DCL;
        long l10 = l2 ^ 0x4CDCC631E71AL;
        long l11 = l2 ^ 0x6A40E755FD9BL;
        long l12 = l2 ^ 0x7FAFAAF72DA3L;
        long l13 = l2 ^ 0x4D33505F4691L;
        long l14 = l2 ^ 0xC2D7CC363ABL;
        long l15 = l2 ^ 0x67FB43BC431EL;
        long l16 = l2 ^ 0x4F10B3C5DD88L;
        long l17 = l2 ^ 0x3F94BD2F5FCDL;
        long l18 = l2 ^ 0x67022B6EAFEAL;
        b4[] b4Array = new b4[g8.b("v", (int)18314, (long)(0x9DE82D0E040BD9CL ^ l))];
        b4Array[0] = new b7(l13);
        b4Array[1] = new b6(l8);
        b4Array[2] = new cc_0(l10);
        b4Array[3] = new cb_0(l14);
        b4Array[4] = new cg_0(l7);
        b4Array[5] = new b8(l11);
        b4Array[g8.b("v", (int)31374, (long)(0x383EC3713FD2808EL ^ l))] = new cf_0(l5);
        b4Array[g8.b("v", (int)6139, (long)(0x3F07BED7E92DEDFFL ^ l))] = new b9(l15);
        b4Array[g8.b("v", (int)25155, (long)(0x318A95DDBA279853L ^ l))] = new ca_0(l9);
        b4Array[g8.b("v", (int)27557, (long)(0x31E2E58028A291BFL ^ l))] = new b_(l16);
        b4Array[g8.b("v", (int)17812, (long)(0x3832B1A4C4F93F8FL ^ l))] = new ch_0(l18);
        b4Array[g8.b("v", (int)21760, (long)(0x4AD87B12D170AF05L ^ l))] = new cd_0(l4);
        b4Array[g8.b("v", (int)32533, (long)(0x49D37B59E3AD0514L ^ l))] = new ce_0(l3);
        b4Array[g8.b("v", (int)26962, (long)(0xDD611470DBD134FL ^ l))] = new b5(l6);
        b4Array[g8.b("v", (int)29539, (long)(0x4B6801357E730977L ^ l))] = new ci_0(l12);
        b4Array[g8.b("v", (int)7355, (long)(0x72FB7871E02066AEL ^ l))] = new cj_0(l17);
        this.a = b4Array;
        this.b = new ArrayList();
        this.c = false;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = -1.0f;
        this.g = -1.0f;
        this.h = 0;
        this.i = false;
        this.j = null;
        this.l = new long[k.length];
        this.m = new boolean[k.length];
        this.n = 0.0f;
        this.o = (long)g8.d("\u00ce", (long)4154530653487371450L, (long)l);
        g8.d("\u00d1", (Object)dr_0.a, this::lambda$new$0, (long)4151802438465337243L, (long)l);
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
                                g8.s = hc.a(-4222191034712262065L, -5370500251761151403L, MethodHandles.lookup().lookupClass()).a(82993147387393L);
                                var31 = g8.s ^ 6818280247620L;
                                g8.C = new Object[135];
                                g8.D = new String[135];
                                g8.a();
                                g8.v = new HashMap<K, V>(13);
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
                                var29_3 = new String[18];
                                var27_4 = 0;
                                var26_5 = "\u0096\u009bkG\u0003\u00de\u00ff\u008chu:+\u00f5\u00ba7\u000b y\u00c2\u00b0\u00df\u00b1\u00d4\u008d\u00f0;N+\u00ce\u00dc\u000e\u00eb\u00c2{'p\u001e\u0097\u00bd\u00db\u00b1i\u008f\u00a6\u00ae\u00fd\u0018\u00af\u00c1\u0010\u00b1%\u00c2\u00ac\u00d7Au\u00c2\u00f1\u009d(\u00d1\u00e2m\u00f8I\u0010\u00d2\u0007\u0084~\u00c1F\u00a9\u00b6\u00c7\u0005\u00a1\u0085 \u00ba\u00bb\u0096\u0010\u00ad\u00af\u0016\u009a4\u00d5\u0090\u00d2\u00ad\u009e\u0084p\u00f5\u0080t2\u0010\u0098f\u001f\u00cc\u00ae\u00dd\u00c9\u0082\u009d\u008b2\u00a7\u0019(\u00fb\u00ea\u0010\u00f0d\u009aLHFlR\u0095\u0002\u0004x\u00ad\u008c\u00991(\u00b6\u0004!\u00db\u0018\u009f\u00dd\u00d3f0\u00d8\u007fe\bX\u00a8$=\u00866,\u00fc4\u00b6\u00ae\u0013\\b\u0003\u00a3\u00d2Y\u001e\u0013*m1\u0097\u00ee:\u0010\u0017\u00e2\u0096\u000b\u00f0/\u0000\u0007\u0016-\u00f0\u009b{:\u001ev\u0010\u00c4V\u00e2H\u0005\u0015\u00e9\u0099O\u00906~r\u0099\u00ef.\u0010\u00e3\u00ecC@\u009fr\u009e\u00b1\u00b8/\u00ac\u00d6\t\u00beS\u0007\u0010\u00c1\u0099\u0018\n\u009a\u00bc'\u00e8\u0017\u00b3\u008b\u0003\u00b1\u00c9\u0017m\u0010\u00df\u009bA\u00b7\u0085\nZ\u00ef)\u0001\u00a3\u00b3C\u00b06\u0080\u0010.\u00e1\t\u0087\u0088\u00ac\u00d5/z\u001b^m\u008a\u00ab\u00e1\u00bc\u0018\u00f9\u00c3'\u00dc\u00baE\u00e8\u00bb\u0095\u0088\u00c5\u0093\u00c5-PE\u00a3\u0090kU[q8=\u0010\u009c/\u00a5Bu\u00dc\u008f\u00ce\u0000\u00eb\u001b7\u0095@\u00cbb";
                                var28_6 = "\u0096\u009bkG\u0003\u00de\u00ff\u008chu:+\u00f5\u00ba7\u000b y\u00c2\u00b0\u00df\u00b1\u00d4\u008d\u00f0;N+\u00ce\u00dc\u000e\u00eb\u00c2{'p\u001e\u0097\u00bd\u00db\u00b1i\u008f\u00a6\u00ae\u00fd\u0018\u00af\u00c1\u0010\u00b1%\u00c2\u00ac\u00d7Au\u00c2\u00f1\u009d(\u00d1\u00e2m\u00f8I\u0010\u00d2\u0007\u0084~\u00c1F\u00a9\u00b6\u00c7\u0005\u00a1\u0085 \u00ba\u00bb\u0096\u0010\u00ad\u00af\u0016\u009a4\u00d5\u0090\u00d2\u00ad\u009e\u0084p\u00f5\u0080t2\u0010\u0098f\u001f\u00cc\u00ae\u00dd\u00c9\u0082\u009d\u008b2\u00a7\u0019(\u00fb\u00ea\u0010\u00f0d\u009aLHFlR\u0095\u0002\u0004x\u00ad\u008c\u00991(\u00b6\u0004!\u00db\u0018\u009f\u00dd\u00d3f0\u00d8\u007fe\bX\u00a8$=\u00866,\u00fc4\u00b6\u00ae\u0013\\b\u0003\u00a3\u00d2Y\u001e\u0013*m1\u0097\u00ee:\u0010\u0017\u00e2\u0096\u000b\u00f0/\u0000\u0007\u0016-\u00f0\u009b{:\u001ev\u0010\u00c4V\u00e2H\u0005\u0015\u00e9\u0099O\u00906~r\u0099\u00ef.\u0010\u00e3\u00ecC@\u009fr\u009e\u00b1\u00b8/\u00ac\u00d6\t\u00beS\u0007\u0010\u00c1\u0099\u0018\n\u009a\u00bc'\u00e8\u0017\u00b3\u008b\u0003\u00b1\u00c9\u0017m\u0010\u00df\u009bA\u00b7\u0085\nZ\u00ef)\u0001\u00a3\u00b3C\u00b06\u0080\u0010.\u00e1\t\u0087\u0088\u00ac\u00d5/z\u001b^m\u008a\u00ab\u00e1\u00bc\u0018\u00f9\u00c3'\u00dc\u00baE\u00e8\u00bb\u0095\u0088\u00c5\u0093\u00c5-PE\u00a3\u0090kU[q8=\u0010\u009c/\u00a5Bu\u00dc\u008f\u00ce\u0000\u00eb\u001b7\u0095@\u00cbb".length();
                                var25_7 = 16;
                                var24_8 = -1;
lbl23:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_8;
                                    v4 = var26_5.substring(v3, v3 + var25_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = g8.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    var26_5 = "\u0097\u00d7,`A\u00f5\u00a8\u0000$J\u0089\u008f\u0084\u008c\u0091\u00f8\u0010\u00c4\u00b5N$#\tn\r\u00c1\u00896\u00cd\u00f0\u00ca&4";
                                    var28_6 = "\u0097\u00d7,`A\u00f5\u00a8\u0000$J\u0089\u008f\u0084\u008c\u0091\u00f8\u0010\u00c4\u00b5N$#\tn\r\u00c1\u00896\u00cd\u00f0\u00ca&4".length();
                                    var25_7 = 16;
                                    var24_8 = -1;
lbl37:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_8;
                                        v4 = var26_5.substring(v6, v6 + var25_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl42:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = g8.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var30_9 = var22_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl54:
                                // 1 sources

                                ** continue;
                            }
                        }
                        g8.t = var29_3;
                        g8.u = new String[18];
                        g8.y = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[24];
                        var14_13 = 0;
                        var15_14 = "\u00fa\u00f6\u00d9\u009be\u00f3\u00e7\u00a8\u009e\u0095\u00a4e\u00a3\u00ac,\br\u00cfl\u001a\u00a4\u00fed\u00d7\u00d4\u001c\u00cb\u00a8&7`X\u0082]%\u00f4\u00a2y\u0006\b>\u009a\u00d2\u00b3\u009f k}|\u00c8;\u0089a\u00c6#\u00b9a#jY\u00e3\u00d7@fR\u00dc\u0093Y\u008d\u00a3\u00db\u00fa\u0006\u00d5\f$n\u0011V\u00e5\u00a9S\u00c5\u007f\u00d9y_\u00ae\u008bk\u00cc\u00dba=x\u0002\u00a58\u001cR\u0097\u0017v\u00ffj\u009b$3\u0018\u00e2/\u00d1\u00a9\u009f(\u00df\u009d\u0001\u00db\u00b8O\u0010\u0095wpx\u00cf\u00f3I\u00b0F\u00c2\u0000\u0087\u00ab\be:P\u00ca\u00e2x\u00d9*2\u00e4u\u00c8\u00aaS\u00b1\u00a8\u00a8P\u00ef(\u00e4\u0011\u0093}s\u0019\u00a9\u00cbs\u001b\u0011i\u00dby\u0002\u0096\u00ac\u00e8\u0086r";
                        var16_15 = "\u00fa\u00f6\u00d9\u009be\u00f3\u00e7\u00a8\u009e\u0095\u00a4e\u00a3\u00ac,\br\u00cfl\u001a\u00a4\u00fed\u00d7\u00d4\u001c\u00cb\u00a8&7`X\u0082]%\u00f4\u00a2y\u0006\b>\u009a\u00d2\u00b3\u009f k}|\u00c8;\u0089a\u00c6#\u00b9a#jY\u00e3\u00d7@fR\u00dc\u0093Y\u008d\u00a3\u00db\u00fa\u0006\u00d5\f$n\u0011V\u00e5\u00a9S\u00c5\u007f\u00d9y_\u00ae\u008bk\u00cc\u00dba=x\u0002\u00a58\u001cR\u0097\u0017v\u00ffj\u009b$3\u0018\u00e2/\u00d1\u00a9\u009f(\u00df\u009d\u0001\u00db\u00b8O\u0010\u0095wpx\u00cf\u00f3I\u00b0F\u00c2\u0000\u0087\u00ab\be:P\u00ca\u00e2x\u00d9*2\u00e4u\u00c8\u00aaS\u00b1\u00a8\u00a8P\u00ef(\u00e4\u0011\u0093}s\u0019\u00a9\u00cbs\u001b\u0011i\u00dby\u0002\u0096\u00ac\u00e8\u0086r".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl81:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = ".\u00a6\u00aa\u0091\")\u0012\u009aP\u00a5R\u00114\u0082@9";
                            var16_15 = ".\u00a6\u00aa\u0091\")\u0012\u009aP\u00a5R\u00114\u0082@9".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl94:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl107:
                        // 1 sources

                        ** continue;
                    }
                }
                g8.w = var17_12;
                g8.x = new Integer[24];
                g8.B = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[3];
                var3_23 = 0;
                var4_24 = "\u001b9\u00b5\u00bf\u00f4&\u00cae\u00bf\u0087`\u0011\u00b6\u00b5\u0016u\u00cbh\u0007\u00c8j\u008f\u00b2\u0000";
                var5_25 = "\u001b9\u00b5\u00bf\u00f4&\u00cae\u00bf\u0087`\u0011\u00b6\u00b5\u0016u\u00cbh\u0007\u00c8j\u008f\u00b2\u0000".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        g8.z = var6_22;
        g8.A = new Long[3];
        g8.k = new int[]{(int)g8.b("v", (int)24082, (long)(1251774104138262112L ^ var31)), (int)g8.b("v", (int)22445, (long)(6552787238297743312L ^ var31)), (int)g8.b("v", (int)8093, (long)(8923924811381204981L ^ var31)), (int)g8.b("v", (int)21248, (long)(2679992111786699644L ^ var31)), (int)g8.b("v", (int)22228, (long)(6790134307897290424L ^ var31))};
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g8.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g8.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g8.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = g8.a(l, l2);
            object = C[n];
            try {
                if (!(object instanceof String)) break block2;
                g8.C[n] = clazz = Class.forName(D[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x43AD;
        if (x[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])y.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/g8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            g8.x[n2] = n3;
        }
        return x[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = g8.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Exception decompiling
     */
    private void b(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    public boolean b(Object[] objectArray) {
        Object object;
        block41: {
            boolean bl;
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            long l4;
            gK gK2;
            aq_0 aq_02;
            block38: {
                block39: {
                    Object object2;
                    long l5;
                    long l6;
                    block36: {
                        block37: {
                            block35: {
                                long l7;
                                block34: {
                                    CallSite callSite3;
                                    block33: {
                                        aq_02 = (aq_0)objectArray[0];
                                        gK2 = (gK)objectArray[1];
                                        l4 = (Long)objectArray[2];
                                        long l8 = l4 = s ^ l4;
                                        l6 = l8 ^ 0x2E5373D50A38L;
                                        l3 = l8 ^ 0x2DBF748BA4BL;
                                        l2 = l8 ^ 0x2A61B70965E5L;
                                        l7 = l8 ^ 0x785236A7F43BL;
                                        l5 = l8 ^ 0x4B10D95BC324L;
                                        l = l8 ^ 0x79F1B845B3B2L;
                                        callSite2 = g8.d("\u00ce", (long)1308075218110444186L, (long)l4);
                                        try {
                                            try {
                                                callSite3 = g8.d("s", (Object)cz_0.b, (long)1308698590626320434L, (long)l4);
                                                if (callSite2 != null) break block33;
                                                if (callSite3 == null) break block34;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                            }
                                            callSite3 = g8.d("s", (Object)cz_0.b, (long)1308698590626320434L, (long)l4);
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    object2 = callSite3 instanceof g8;
                                                    if (callSite2 != null) break block35;
                                                    if (object2) break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                                }
                                                object2 = g8.d("s", (Object)cz_0.b, (long)1308698590626320434L, (long)l4) instanceof class_408;
                                                if (callSite2 != null) break block35;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                            }
                                            if (object2) break block34;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                        }
                                        return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                    }
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l7;
                                object2 = g8.d("\u00d1", (Object)((Object)this), (Object)objectArray2, (long)1307510970030198097L, (long)l4);
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block36;
                                    if (object2) break block37;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                }
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                            }
                        }
                        object2 = g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)1310391914697915571L, (long)l4), (long)1306881479359301961L, (long)l4);
                    }
                    float f = (float)object2;
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l6;
                    reference var20_13 = g8.d("\u00ce", (Object)objectArray3, (long)1310151908961118284L, (long)l4) / f;
                    callSite = g8.d("\u00d1", (Object)new Matrix4f(), (float)var20_13, (float)var20_13, (float)1.0f, (long)1306961359071396571L, (long)l4);
                    try {
                        bl = this.i;
                        if (callSite2 != null) break block38;
                        if (bl) break block39;
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                    }
                    for (b4 b42 : this.a) {
                        try {
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l5;
                            g8.d("\u00d1", (Object)b42, (Object)objectArray4, (long)1306412653453842207L, (long)l4);
                            if (callSite2 == null) {
                                if (callSite2 == null) continue;
                                break;
                            }
                            break block39;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                        }
                    }
                    this.i = true;
                }
                bl = false;
            }
            Object object3 = bl;
            b4[] b4Array = this.a;
            int n = b4Array.length;
            int n2 = 0;
            while (n2 < n) {
                block40: {
                    block42: {
                        Object object4;
                        block43: {
                            b4 b43;
                            block44: {
                                b43 = b4Array[n2];
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != null) break block40;
                                                    Object[] objectArray5 = new Object[1];
                                                    objectArray5[0] = l;
                                                    object = g8.d("\u00d1", (Object)b43, (Object)objectArray5, (long)1307596176362215064L, (long)l4);
                                                    if (callSite2 != null) break block41;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                                }
                                                if (!object) break block42;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                            }
                                            object4 = g8.d("\u00d1", (Object)b43, (Object)new Object[0], (long)1310109331269297782L, (long)l4);
                                            if (callSite2 != null) break block43;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                        }
                                        if (object4 != false) break block44;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                    }
                                    Object[] objectArray6 = new Object[1];
                                    objectArray6[0] = l2;
                                    g8.d("\u00d1", (Object)b43, (Object)objectArray6, (long)1308616530805812344L, (long)l4);
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)1309336518312665834L, (long)l4);
                                }
                            }
                            Object[] objectArray7 = new Object[4];
                            objectArray7[3] = l3;
                            objectArray7[2] = callSite;
                            objectArray7[1] = gK2;
                            objectArray7[0] = aq_02;
                            g8.d("\u00d1", (Object)b43, (Object)objectArray7, (long)1305400017377130148L, (long)l4);
                            object4 = true;
                        }
                        object3 = object4;
                    }
                    ++n2;
                }
                if (callSite2 == null) continue;
            }
            object = object3;
        }
        return object;
    }

    public static float b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = s ^ l) ^ 0x4EA032A52EEEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return 2.0f * g8.d("\u00ce", (Object)objectArray2, (long)3652464362815044039L, (long)l);
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x69F2;
        if (A[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])B.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/g8", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            g8.A[n2] = l4;
        }
        return A[n2];
    }

    public boolean c(Object[] objectArray) {
        Object object;
        block16: {
            long l;
            long l2;
            block15: {
                CallSite callSite;
                CallSite callSite2;
                block14: {
                    block12: {
                        block13: {
                            l2 = (Long)objectArray[0];
                            l = (l2 = s ^ l2) ^ 0x5A60E2FF65ACL;
                            callSite2 = g8.d("\u00ce", (long)-8957636259074907379L, (long)l2);
                            try {
                                try {
                                    callSite = g8.d("s", (Object)cz_0.b, (long)-8953635043091250779L, (long)l2);
                                    if (callSite2 != null) break block12;
                                    if (callSite != this) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)-8954123000146185347L, (long)l2);
                                }
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)-8954123000146185347L, (long)l2);
                            }
                        }
                        callSite = g8.d("s", (Object)cz_0.b, (long)-8953635043091250779L, (long)l2);
                    }
                    try {
                        try {
                            if (callSite2 != null) break block14;
                            if (callSite == null) break block15;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)-8954123000146185347L, (long)l2);
                        }
                        callSite = g8.d("s", (Object)cz_0.b, (long)-8953635043091250779L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)-8954123000146185347L, (long)l2);
                    }
                }
                try {
                    try {
                        object = callSite instanceof class_408;
                        if (callSite2 != null) break block16;
                        if (object) break block15;
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)-8954123000146185347L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw g8.d("\u00ce", (Object)matchException, (long)-8954123000146185347L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            object = g8.d("\u00d1", (Object)((Object)this), (Object)objectArray2, (long)-8957074175729918778L, (long)l2);
        }
        return object;
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = g8.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void c(Object[] objectArray) {
        block4: {
            long l = (Long)objectArray[0];
            long l2 = (l = s ^ l) ^ 0x2598C5E2EF67L;
            b4[] b4Array = this.a;
            int n = b4Array.length;
            CallSite callSite = g8.d("\u00ce", (long)4495817227803549401L, (long)l);
            for (int i = 0; i < n; ++i) {
                b4 b42 = b4Array[i];
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    g8.d("\u00d1", (Object)b42, (Object)objectArray2, (long)4495192670859705180L, (long)l);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw g8.d("\u00ce", (Object)matchException, (long)4497086293590675113L, (long)l);
                }
            }
            this.j = null;
        }
    }

    private static Field c(long l, long l2) {
        int n = g8.a(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            String string = D[n];
            int n2 = string.indexOf(8);
            Class clazz = g8.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g8.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g8.a(clazz3, string2, clazz2)) != null) {
                    g8.C[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g8.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g8.C[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g8.b(1455147985109523L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private float c(Object[] objectArray) {
        return 24.0f + (float)this.a.length * 20.0f + 6.0f;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = g8.a(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = D[n];
                int n3 = string2.indexOf(8);
                clazz3 = g8.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g8.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g8.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g8.C[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g8.b(1455147985109523L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g8.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g8.C[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g8.b(1455147985109523L, 0L);
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

    private boolean d(Object[] objectArray) {
        Object object;
        block8: {
            long l = (Long)objectArray[0];
            long l2 = (l = s ^ l) ^ 0x1D3151986D1CL;
            b4[] b4Array = this.a;
            int n = b4Array.length;
            CallSite callSite = g8.d("\u00ce", (long)-3708340759512273868L, (long)l);
            int n2 = 0;
            while (n2 < n) {
                block7: {
                    block9: {
                        b4 b42 = b4Array[n2];
                        try {
                            try {
                                try {
                                    if (callSite != null) break block7;
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l2;
                                    object = g8.d("\u00d1", (Object)b42, (Object)objectArray2, (long)-3707615831490344906L, (long)l);
                                    if (callSite != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)-3709323007166710716L, (long)l);
                                }
                                if (!object) break block9;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)-3709323007166710716L, (long)l);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)-3709323007166710716L, (long)l);
                        }
                    }
                    ++n2;
                }
                if (callSite == null) continue;
            }
            object = false;
        }
        return object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == '\u00ec' || c == '\u00a2' || c == 't') {
                field = g8.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g8.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = g8.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = C;
        C[0] = "6WZ\u0010GE W_JTR7\u001c\\LXF&[K[\u0013Rj";
        objectArray[1] = Void.TYPE;
        g8.D[1] = "java/lang/Void";
        objectArray[2] = "<)\u001c0:[<)\u000bl6T&b\u000br6A!\u0013[/g";
        objectArray[3] = "\u00125\u001b\u001fO:\u00125\fCC5\b~\f]C \u000f\u000f^\u0001\u0016b";
        objectArray[4] = "(a\u001eWX|>a\u001b\rKk)*\u0018\u000bG\u007f8m\u000f\u001c\fm\u0004";
        objectArray[5] = "\u001e0p.-bk\u0010{!<-\u0016\bh&5d~";
        objectArray[6] = ",!\u001c{\u001f+,!\u000b'\u0013$6j\u000b9\u001311\u001bYdKr{";
        objectArray[7] = Double.TYPE;
        g8.D[7] = "java/lang/Double";
        objectArray[8] = "n\bE{a_e\u0007T4\u0002Rp\n[_7Pa\u0019Gs ]";
        objectArray[9] = "$i\u0005<_v2i\u0000fLa%\"\u0003`@u4e\u0014w\u000bdt";
        objectArray[10] = "D6,}6\u001d1\u0016'r'RP\u0018,y#\b$";
        objectArray[11] = Boolean.TYPE;
        g8.D[11] = "java/lang/Boolean";
        objectArray[12] = Integer.TYPE;
        g8.D[12] = "java/lang/Integer";
        objectArray[13] = "f\f{cl\u0012\u0013,pl}]r\"{gy\u0007\u0006";
        objectArray[14] = "\u0015*9\u000b}:`\n2\u0004lu\u0001\u00049\u000fh/u";
        objectArray[15] = Float.TYPE;
        g8.D[15] = "java/lang/Float";
        objectArray[16] = "\u0001\te(4kt)n'%$\u0015'e,!~a";
        objectArray[17] = "7<!\u0004XgB\u001c*\u000bI(#\u0012!\u0000MrW";
        objectArray[18] = "<Cc\u0005\u0005gIch\n\u0014((mc\u0001\u0010r\\";
        objectArray[19] = "5J^\u0006?\u00129]CK4\u0010uIKJ+\u001a8\u0001KX0]>YOF-]\u001eYOF-";
        objectArray[20] = "\fI;\u0017Rg\u0007F*X3i\fM.\u0002";
        objectArray[21] = "pFw|\be{If3upiSdp";
        objectArray[22] = Long.TYPE;
        g8.D[22] = "java/lang/Long";
        objectArray[23] = "r\u001bE&Q\u001aw\u000eN&Z\u0001{\u001e\fOq+J";
        objectArray[24] = "L(|V8|9\bwY)3X\u0006|R-i,";
        objectArray[25] = "\u0010b\u0005'K)eB\u000e(Zf\u0004L\u0005#^<p";
        objectArray[26] = "\u000eA\u0018ln\u0001\u000eA\u000f0b\u000e\u0014\n\u000f.b\u001b\u0013{Xq4";
        objectArray[27] = "\n\u001ef\\FA\u007f>mSW\u000e\u001e0fXSTj";
        objectArray[28] = "\u001e/]\u001c~Zk\u000fV\u0013o\u0015\n\u0001]\u0018kO~";
        objectArray[29] = "Y\u0000E\u0013|\u001fD\u0015\u001d1=\u0012\\\u0013";
        objectArray[30] = "\u0001\u0015\u0003UXTt5\bZI\u001b\u0015;\u0003QMAa";
        objectArray[31] = ";$#zGbN\u0004(uV-/\n#~Rw[";
        objectArray[32] = "WUJyQ,AUO#B;V\u001eL%N/GY[2\u0005?]";
        objectArray[33] = "@Km5.w5kf:?8Tem1;b ";
        objectArray[34] = "'\u0019Sl4Z1\u0019V6'M&RU0+Y7\u0015B'`K\u0006";
        objectArray[35] = "2\u0011\u0001xW\u0018G1\nwFW&?\u0001|B\rR";
        objectArray[36] = "0.\u0005_+e&.\u0000\u00058r1e\u0003\u00034f \"\u0014\u0014\u007fq\u0016";
        objectArray[37] = "xd\u007f4\u0004s\rDt;\u0015<lJ\u007f0\u0011f\u0018";
        objectArray[38] = "\u0006,\u0005#p;s\f\u000e,at\u0012\u0002\u0005'e.f";
        objectArray[39] = "i?w2sC\u007f?rh`Thtqnl@y3fy'Pa3dr}\u001d](do}Zj?";
        objectArray[40] = "\u000e{iB\u0015N\u0018{l\u0018\u0006Y\u000f0o\u001e\nM\u001ewx\tA])";
        objectArray[41] = "+$Bz\u000f\u001b=$G \u001c\f*oD&\u0010\u0018;(S1[\u000f\u000e";
        objectArray[42] = "$k\u000e\u0013k|QK\u0005\u001cz30E\u000e\u0017~iD";
        objectArray[43] = "3\r#OWmF-(@F\"'##KBxS";
        objectArray[44] = "QN \u001e^~GN%DMiP\u0005&BA}AB1U\nmt";
        objectArray[45] = ",\u0019/\u0004N?Y9$\u000b_p87/\u0000[*L";
        objectArray[46] = "!nB5687nGo%/ %Di);1bS~b,\u000e";
        objectArray[47] = "s*";
        objectArray[48] = "\u007fd\u0014\tE@\nD\u001f\u0006T\u000fkJ\u0014\rPU\u001f";
        objectArray[49] = "PX\u001bWK[%x\u0010XZ\u0014Dv\u001bS^N0";
        objectArray[50] = ".M'5*\u007f,SnV!d3V8/&";
        objectArray[51] = "/\r\u0013\fL5Z-\u0018\u0003]z;#\u0013\bY O";
        objectArray[52] = "U^ho]/ ~c`L`AphkH:5";
        objectArray[53] = "O)WT6\u0002Y)R\u000e%\u0015NbQ\b)\u0001_%F\u001fb\u0016@";
        objectArray[54] = "\"7U-ySW\u0017^\"h\u001c6\u0019U)lFB";
        objectArray[55] = ",K\\\u001eP\b:KYDC\u001f-\u0000ZBO\u000b<GMU\u0004\u001c,";
        objectArray[56] = "`\u000f\u0001(\u0012G\u0015/\n'\u0003\bt!\u0001,\u0007R\u0000";
        objectArray[57] = "GxV~_UYpL10R_xYS\u0018SY";
        objectArray[58] = "\u001e\"\u001ak8]k\u0002\u0011d)\u0012\n\f\u001ao-H~";
        objectArray[59] = "Y@";
        objectArray[60] = "%]k]\u000f\u0019.Rz\u0012l\u0014;T";
        objectArray[61] = "1S\u00182T8Ds\u0013=Ew%}\u00186A-Q";
        objectArray[62] = "<\u000e@\u0007CEI.K\bR\n( @\u0003VP\\";
        objectArray[63] = "Y0\u0001r\u0004k,\u0010\n}\u0015$M\u001e\u0001v\u0011~9";
        objectArray[64] = "UV\u001c}7\u0019UV\u000b!;\u0016O\u001d\u000b?;\u0003Hl[bh";
        objectArray[65] = "\u0010\u000b'\u001a_7e+,\u0015Nx\u0004%'\u001eJ\"p";
        objectArray[66] = "+v-_'\u0013=v(\u00054\u0004*=+\u00038\u0010;z<\u0014s\u0006\u0016";
        objectArray[67] = "gv\u001c)\rW\u0012V\u0017&\u001c\u0018sX\u001c-\u0018B\u0007";
        objectArray[68] = ".\u000f0hZs8\u000f52Id/D64Ep>\u0003!#\u000eds";
        objectArray[69] = "\u001e6`,)^k\u0016k#8\u0011\n\u0018`(<K~";
        objectArray[70] = "}&A@qk=1C9{~>;^UI)\u007fg\u0003\u0007\u001e*|\"\\\u0000xjr8D9";
        objectArray[71] = "Y\u0001WO7\u0014FZRHW\u0004W\u0019q\u000f:\u0006\\e\u000e\u0015;Q\\\u0001T\rh\u0017:";
        objectArray[72] = "cM\u0003\u0014nz5\u0016U\u0002Pd7U^\u0001<V`\u0013\u0000Vk\u0001`\u0018\u000f\u001c0x7@X\fP";
        objectArray[73] = "\u0007NI[l\"@LE_\u001e09\u000fI\u001asyYZ\u001dRaq9\u000f\u001c[{p_O\u0012AcI";
        objectArray[74] = "\u0000\u001bX)@KWC\u000f9 WWV\t4Le\u0006\u0016Xk \\X\u0012XlP\u0003HG\u0006S";
        objectArray[75] = ":\u001e)V\u0012u~\u0014iL+aa\u001d,{\u001757HT\u0011@o{\u00074\u0015Av~x";
        objectArray[76] = "\u0015O>\u0016\u0019%RM2\u0012k'+\u000e>W\u0006~K[j\u001f\u0014v+\b2\tU-ZV<RQN";
        objectArray[77] = "*Fcf*\u0014nL#|\u0013\u000e{\\~{\u007f<)\u001c$ .k&@r&u\u000f|X!`\u0013";
        objectArray[78] = "l\u0012Bus\u000e,\u0005@\fuvj\u0004\u0002a,\u0016?PJs$vl\b\\2\u007f\u00072\u0006\u00076\u001c";
        objectArray[79] = "FnAW\u0002\u0012\u0006yC.\u0007j@x\u0001C]\n\u0015,IQUj\u0010jP@\u0013\u0003\u0015*\u0002^m";
        objectArray[80] = "\u0010]EUm\u0015F\u0006\u0013CS\u0000HT\u001cK\u0004W\u0016\u0004E'2Q[PE]6T\u0014_";
        objectArray[81] = "^\u0015=\u0002\u001cL\u0019\u00171\u0006nJ`T=C\u0003\u0017\u0000\u0001i\u000b\u0011\u001f`Th\u0002\u000b\u001e\u0006\u0014f\u0018\u0013'";
        objectArray[82] = "\u0017\u001d\u001diS\\W\n\u001f\u0010U$\u0011\u000b]}\fDD_\u0015o\u0004$\u0011^\u001cu\u0005BQP\u0006m<";
        objectArray[83] = ":\fUNx{}\u000eYJ\nw\u0004MU\u000fg d\u0018\u0001Gu(\u0004M\u0000No)b\r\u000eTw\u0010";
        objectArray[84] = "FC\u00195\u0015F\\C\u0016=tM<R\b.ID\u0003\u0013\u00164\u001a";
        objectArray[85] = "*9_\u001ca\u00116=@F\u001bVV8T\u0019v\u001b6m\u0000Qd\u0013V8\u0001X~\u00120x\u000fBf+";
        objectArray[86] = "W.Zy\u001a+_`Uwwl/'L>\u001a&Or\u0018v\b./'\u0019\u007f\u0012/Ig\u0017e\n\u0016";
        objectArray[87] = "&B=dpBfU?\u001dt: T}p/Zu\u00005b': \u0001<x&\\`\u000f&`\u001f";
        objectArray[88] = ",\u0011!R,Q<BaZ]IQJ1\u00040\u00071\u001feL\"\u000fQJdE8\u000e7\nj_ 7";
        objectArray[89] = "V z gf^nu.\n2.)lggkN|8/uc.y~6d%G|>dz[";
        objectArray[90] = "VN\u001e\u0015RW\u0014\u001f\u0013\u0012Gh\u0005'\u001a\u0002\u0001\u0005_GOVI\u0017W'J\u0010P\u0006\u0011NOP\u0002\u0018o";
        objectArray[91] = "\rfg:/NMqeC)6\f%\"s8_Sxu2@\b\f&/;)WQqnC";
        objectArray[92] = "\u007fEoc2tw\u001f(:z\u0018<\u001c.`/\u0018{\u00106{<x\u007f\u0011/~Cv$Cb93)4\u0016<\u0006";
        objectArray[93] = "\u0018i\u0004c'3_k\bgU8&(\u0004\"8hF}Pj*`&(Qc0a@h_y(X";
        objectArray[94] = ">]Z\u000es\u0006gXU\u0001vcldR\u0017(\u000e7\u0004\u0007C`\u001c?dRBi\u0006>\u0002\u0012Ls\u001e\u0007";
        objectArray[95] = ",B\u001b`*w\u007f\u0001EsuI~\u001aHgoI,@\\k,/lNFs\u0015";
        objectArray[96] = "\u001an\\7RD\u00124\u001bn\u001a(X1\u0006R\u001eCF-\u001f2\u001aB_(`oHM^/\u0000kIT[P";
        objectArray[97] = "\u000424BD!D%6;GY\u0002$tV\u001b9Wp<D\u0013Y\u0004(*\u0005H(Z&q\u0001+";
        objectArray[98] = "^gN\u001fL\u0000\f5O\u00030\u0000M!E\u001fV\u0017l:Z\u001fu\nT?^\t0\u0005Rc\u000eM@ZB6Pr";
        objectArray[99] = "LkQ\u0017\u007fB\u000bi]\u0013\rDr*QV`\u0019\u0012\u007f\u0005\u001er\u0011r,]\b3J\u0003rSS7)";
        objectArray[100] = "\u0016\u007frm3[Ru2w\nOM|w@6\u001b\u001b(\u000f*aAWfo.`XR\u0019";
        objectArray[101] = "5V\u000e\u0002\u001d\u0002f\u0015P\u0011B<e\u0006\\lOVpSJSCMl\u00040SEZ2\tA\rK\u00016j";
        objectArray[102] = "@<t1Sv\u0017d#!3j\u0017q%,_XF1uz3?\u001aa\u007f-We\u000229K";
        objectArray[103] = "./J\u001ae\u0013n\u007fS\u0013o~rrM\u0001s\u0012@&\u000fY/~*tT\u001ck\u001e.uM\u0019\u0014";
        objectArray[104] = "\u007f8\u001ePP\u0004?/\u001c)U|y.^D\u000f\u001c,z\u0016V\u0007|y{\u001fL\u0006\u001a9u\u0005T?";
        objectArray[105] = "~^;7M~*R%w.nEX&xKfy\u001ch)Q\u0004";
        objectArray[106] = "K\u00050\u0019\u0011F\u000bU)\u0010\u001b+\u0017X7\u0002\u0007G%\fuZ\\+O^.\u001f\u001fKK_7\u001a`";
        objectArray[107] = "l\r+h\n\u0016sV.oj\u0006b\u0015\u0018?\u0006i?\t.h\f\re\u0011}.j";
        objectArray[108] = "%?o4\u0003\u0012sd9\"=\fq'2!Q>%fjy=\b#);{G\f&f4F\u0004We>k DY\u007f&R";
        objectArray[109] = "OE,\u0015\"\"\bG \u0011P/q\u0004,T=y\u0011Qx\u001c/qq\u0004y\u00155p\u0017Dw\u000f-I";
        objectArray[110] = ";\u000e\u0017\r\r|#\u000eZC=t^P@\u0004P->\u0005\u0014LB%^\u0000RUSc7\u0005\u0012\u0007M\u001d";
        objectArray[111] = "]G\u007fp\\>H\u0000~j /:Fn2MsZ\u0013:z_{:\u001cac\u001a#E\u0003:f\u001dC";
        objectArray[112] = "\u0006;Dx5\u0004A9H|G\n8zD9*_X/\u0010q8W8z\u0011x\"V^:\u001fb:o";
        objectArray[113] = "\u001aa\u0018\u0000\u0003<\u0012/\u0017\u000enebh\u000eG\u00031\u0002=Z\u000f\u00119bh[\u0006\u000b8\u0004(U\u001c\u0013\u0001";
        objectArray[114] = "G^Gid\b\u0007IE\u0010`pAH\u0007};\u0010\u0014\u001cOo3p\u0011ZV~u\u0019\u0014\u001a\u0004`\u000b";
        objectArray[115] = "e`N8\tvq#\u0018g5w\u001ahCc\u000b\u007f\"j\u0018dS&\u001a";
        objectArray[116] = "P\u0001(%Qw\u0011\u001f2v3!*J( ^xJ\u001f|hLp*\u000e!c]9L\u001er#UH";
        objectArray[117] = "c37Z*D4k`JJX4~fG&je?>\u001eJ\r9n<F.W!=z ";
        objectArray[118] = "\u0017_&Y\u001ea\b\u0004#^~q\u0019G\u0006\u0007\u0006~\u001d;\u007f\u0003\u0012$\u0012_%\u001bAbt";
        objectArray[119] = "\u001fp_\taR\u0012%@\u0004\u0006\u0002\u0014/G)k\u00113,Ifh\u000fHp\u0007\u00167\u001f\u001d.8Vf\u0001J'\\\f~R\fA\b\u0006jW\u0016%R\u001e9\u0011p";
        objectArray[120] = "2to\bsW/}}B\u0017\u0017+-a\u0014\u0017\u00059-k\u0007~\u0000y\u007fuy~\u0015)*{\u0010{U{4\u0005\u0010n\u0005.:l\u0015.W0DwI}\u001d$\u007fj@oW@";
        objectArray[121] = "\r\u000fV|9Z[T\u0000j\u0007OU\u0006\u000fbP\u0018\u000bQZ\u000e>\u0011O\u0010\u001ac~AV\u0019\u0010";
        objectArray[122] = "X1|;csHb<3\u0012~%jlm\u007f%E?8%m-%:~<|kL?>nb\u0015";
        objectArray[123] = "C\u0001\u0018\n,\u001eY\u0001\u0017\u0002M\u001d9S\u0011\u0001+\u0004\u0007\u001a\u001c\u001c2\f";
        objectArray[124] = "%\n^NF|l\u0007CWNBu`\u001cC\u0004/,\u0000I\u0017L=$`\u001c\u0016E'%\u0006\\\u0018_?\u001c";
        objectArray[125] = "y<\u0014\u0014(;ioT\u001cY4\u0004g\u0004B4md2P\n&e\u00047\u0016\u00137#m2VA)]";
        objectArray[126] = "\u0002\")\u0002@\u0017Uz~\u0012 \u000bUox\u001fL9\u0004/)E ^X\u007f\"\u001eD\u0004@,dx";
        objectArray[127] = "8IZ-P=x\u000eZp\u000bVls^}\r;1\u0013\u000b)E)9s^(L38\u0015\u001e&V+\u0001";
        objectArray[128] = "\n_\u001a\u0007K\u0001\u0015\u0004\u001f\u0000+\u0011\u0004G9YV\u0013i\u000b\u0013Q\u0011\u0018\rQ\u000b\u0002W~";
        objectArray[129] = "\u0002\u0005\u0001Ll<B\u0012\u00035jD\u0004\u0013AX3$QG\tJ;DT\u0001\u0010[}-QABE\u0003";
        objectArray[130] = "3C#Y5\u001f&\u0004\"CI\bTB2\u001b$R4\u0017fS6ZT\u0012 J'\u001c=\u0017`\u00189b";
        objectArray[131] = "\u0007C\u001ejU\u001c@A\u0012n'\u00139\u0002\u001e+JGYWJcXO9\u0002KjBN_BEpZw";
        objectArray[132] = "\u00115cn1@\u0005v51\rAn=n53IV?52k\u0010n=mvh\u0012\b}clp+";
        objectArray[133] = "Jnv=\u0014\u0001A6b0o\u001dKf{&\u0013\n\\\tw7\u0013^\\6{,\u000f\t&0$$\n^@p*>\u0012g";
        Object[] objectArray2 = objectArray;
        objectArray[134] = "+Iz A\u0019#\u0013=y\tuw\u001e6EY\f{\u00198,\\L)\u0007F,I\u001c|\t/)\tNbw/<Y\u001bl\u001e*|\u000b\u0005\u0012";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (D[n3] != null) {
            return n3;
        }
        Object object = C[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 18;
            case 1 -> 5;
            case 2 -> 46;
            case 3 -> 56;
            case 4 -> 43;
            case 5 -> 50;
            case 6 -> 41;
            case 7 -> 1;
            case 8 -> 31;
            case 9 -> 54;
            case 10 -> 8;
            case 11 -> 12;
            case 12 -> 28;
            case 13 -> 2;
            case 14 -> 59;
            case 15 -> 16;
            case 16 -> 27;
            case 17 -> 52;
            case 18 -> 47;
            case 19 -> 37;
            case 20 -> 17;
            case 21 -> 22;
            case 22 -> 24;
            case 23 -> 21;
            case 24 -> 30;
            case 25 -> 53;
            case 26 -> 40;
            case 27 -> 11;
            case 28 -> 61;
            case 29 -> 45;
            case 30 -> 48;
            case 31 -> 57;
            case 32 -> 10;
            case 33 -> 0;
            case 34 -> 39;
            case 35 -> 14;
            case 36 -> 3;
            case 37 -> 34;
            case 38 -> 32;
            case 39 -> 38;
            case 40 -> 42;
            case 41 -> 44;
            case 42 -> 23;
            case 43 -> 19;
            case 44 -> 9;
            case 45 -> 7;
            case 46 -> 33;
            case 47 -> 13;
            case 48 -> 26;
            case 49 -> 25;
            case 50 -> 63;
            case 51 -> 55;
            case 52 -> 20;
            case 53 -> 60;
            case 54 -> 6;
            case 55 -> 58;
            case 56 -> 62;
            case 57 -> 51;
            case 58 -> 29;
            case 59 -> 15;
            case 60 -> 49;
            case 61 -> 4;
            case 62 -> 36;
            default -> 35;
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
        g8.D[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static float a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = s ^ l) ^ 0x7C414F6D74EAL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (float)(g8.d("\u00ce", (Object)objectArray2, (long)3962528984441099416L, (long)l) / 100.0f);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public b4[] a(Object[] objectArray) {
        return this.a;
    }

    private boolean a(Object[] objectArray) {
        float f;
        block18: {
            block15: {
                CallSite callSite;
                long l;
                block17: {
                    int n;
                    block16: {
                        block14: {
                            int n2 = (Integer)objectArray[0];
                            n = (Integer)objectArray[1];
                            l = (Long)objectArray[2];
                            l = s ^ l;
                            callSite = g8.d("\u00ce", (long)783182066425064035L, (long)l);
                            try {
                                try {
                                    float f10 = (float)n2 - this.f;
                                    f = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                    if (callSite != null) break block14;
                                    if (f < 0) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                                }
                                float f11 = (float)n2 - (this.f + 140.0f);
                                f = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite != null) break block16;
                                if (f > 0) break block15;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                            }
                            float f12 = (float)n - this.g;
                            f = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block17;
                            if (f < 0) break block15;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                        }
                        float f13 = (float)n - (this.g + 24.0f);
                        f = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block18;
                    if (f > 0) break block15;
                }
                catch (MatchException matchException) {
                    throw g8.d("\u00ce", (Object)matchException, (long)779947550520588819L, (long)l);
                }
                f = 1.0f;
                break block18;
            }
            f = 0.0f;
        }
        return (boolean)f;
    }

    /*
     * WARNING - void declaration
     */
    public void a(Object[] objectArray) {
        block107: {
            reference v90;
            reference var72_65;
            CallSite callSite;
            b4[] b4Array;
            CallSite callSite2;
            CallSite callSite3;
            Object object;
            CallSite callSite4;
            float f;
            float f10;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            gK gK2;
            aq_0 aq_02;
            block106: {
                block105: {
                    void var75_75;
                    b4 b42;
                    void var75_73;
                    Object object2;
                    block101: {
                        block104: {
                            b4 b43;
                            long l7;
                            long l8;
                            block103: {
                                int n;
                                long l9;
                                block99: {
                                    Object object3;
                                    Object object4;
                                    float f11;
                                    float f12;
                                    long l10;
                                    block97: {
                                        float f13;
                                        Color color;
                                        CallSite callSite5;
                                        long l11;
                                        long l12;
                                        block95: {
                                            reference var47_27;
                                            long l13;
                                            long l14;
                                            block90: {
                                                b4 b432;
                                                int n2;
                                                int n3;
                                                long l15;
                                                block87: {
                                                    Object object5;
                                                    long l16;
                                                    block84: {
                                                        Object object6;
                                                        block85: {
                                                            float f14;
                                                            float f15;
                                                            long l17;
                                                            long l18;
                                                            block82: {
                                                                block83: {
                                                                    aq_02 = (aq_0)objectArray[0];
                                                                    gK2 = (gK)objectArray[1];
                                                                    int n4 = (Integer)objectArray[2];
                                                                    int n5 = (Integer)objectArray[3];
                                                                    float f16 = ((Float)objectArray[4]).floatValue();
                                                                    l6 = (Long)objectArray[5];
                                                                    long l19 = l6 = s ^ l6;
                                                                    long l20 = l19 ^ 0x15C7AAF8262AL;
                                                                    l14 = l19 ^ 0x200548C80A19L;
                                                                    l5 = l19 ^ 0x6FFB966E6F4DL;
                                                                    l8 = l19 ^ 0x57FEAD15B28BL;
                                                                    l9 = l19 ^ 0x7D74D2DCEC16L;
                                                                    l18 = l19 ^ 0x4F226B19A82CL;
                                                                    l13 = l19 ^ 0x86B24C68BD9L;
                                                                    l12 = l19 ^ 0x527935BED40EL;
                                                                    l15 = l19 ^ 0x6C035FA99887L;
                                                                    l11 = l19 ^ 0x13B26B0803CFL;
                                                                    l10 = l19 ^ 0x1466507BEF7FL;
                                                                    l4 = l19 ^ 0x4139783DE2F6L;
                                                                    l16 = l19 ^ 0x11F56E2449F7L;
                                                                    l3 = l19 ^ 0x6429679B273CL;
                                                                    l17 = l19 ^ 0x3C376311D1C2L;
                                                                    l2 = l19 ^ 0x4EB1AF38CB6EL;
                                                                    l7 = l19 ^ 0x426561689FA0L;
                                                                    l = l19 ^ 0x6E9EB050C8CFL;
                                                                    dB.g = aq_02;
                                                                    dB.h = gK2;
                                                                    float f17 = (float)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)4484821154870186145L, (long)l6), (long)4481295333343798619L, (long)l6);
                                                                    Object[] objectArray2 = new Object[1];
                                                                    objectArray2[0] = l20;
                                                                    var47_27 = g8.d("\u00ce", (Object)objectArray2, (long)4484639291946845278L, (long)l6) / f17;
                                                                    Object[] objectArray3 = new Object[1];
                                                                    objectArray3[0] = l20;
                                                                    f10 = (float)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)4484821154870186145L, (long)l6), (long)4483011324547453062L, (long)l6) / g8.d("\u00ce", (Object)objectArray3, (long)4484639291946845278L, (long)l6);
                                                                    Object[] objectArray4 = new Object[1];
                                                                    objectArray4[0] = l20;
                                                                    f = (float)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)4484821154870186145L, (long)l6), (long)4481671604375556708L, (long)l6) / g8.d("\u00ce", (Object)objectArray4, (long)4484639291946845278L, (long)l6);
                                                                    Object[] objectArray5 = new Object[1];
                                                                    objectArray5[0] = l20;
                                                                    f12 = (float)n4 * f17 / g8.d("\u00ce", (Object)objectArray5, (long)4484639291946845278L, (long)l6);
                                                                    callSite4 = g8.d("\u00ce", (long)4482503221060558472L, (long)l6);
                                                                    Object[] objectArray6 = new Object[1];
                                                                    objectArray6[0] = l20;
                                                                    f11 = (float)n5 * f17 / g8.d("\u00ce", (Object)objectArray6, (long)4484639291946845278L, (long)l6);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    float f14 = this.f;
                                                                                    f14 = -1.0f;
                                                                                    if (callSite4 != null) break block82;
                                                                                    if (f15 != f14) break block83;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                                }
                                                                                float f14 = this.g;
                                                                                f14 = -1.0f;
                                                                                if (callSite4 != null) break block82;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                            }
                                                                            if (f15 != f14) break block83;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                        }
                                                                        this.f = f10 / 2.0f - 70.0f;
                                                                        this.g = f / 2.0f - g8.d("\u00d1", (Object)((Object)this), (Object)new Object[0], (long)4482162633656709047L, (long)l6) / 2.0f;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                    }
                                                                }
                                                                float f14 = (float)(g8.d("\u00ce", (long)4483291068144161578L, (long)l6) - this.o);
                                                                f14 = 0.005f;
                                                            }
                                                            float f18 = f15 * f14;
                                                            try {
                                                                try {
                                                                    this.o = (long)g8.d("\u00ce", (long)4483291068144161578L, (long)l6);
                                                                    Object[] objectArray7 = new Object[4];
                                                                    objectArray7[3] = l17;
                                                                    objectArray7[2] = Float.valueOf(f18);
                                                                    objectArray7[1] = Float.valueOf(1.0f);
                                                                    objectArray7[0] = Float.valueOf(this.n);
                                                                    this.n = (float)g8.d("\u00ce", (Object)objectArray7, (long)4472057826801555800L, (long)l6);
                                                                    object6 = this.c;
                                                                    if (callSite4 != null) break block84;
                                                                    if (!object6) break block85;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                }
                                                                Object[] objectArray8 = new Object[1];
                                                                objectArray8[0] = l18;
                                                                Object[] objectArray9 = new Object[4];
                                                                objectArray9[3] = l17;
                                                                objectArray9[2] = Float.valueOf((float)(g8.d("\u00ce", (Object)objectArray8, (long)4483652444136782065L, (long)l6) / 10.0f));
                                                                objectArray9[1] = Float.valueOf(f12 + this.d);
                                                                objectArray9[0] = Float.valueOf(this.f);
                                                                this.f = (float)g8.d("\u00ce", (Object)objectArray9, (long)4472057826801555800L, (long)l6);
                                                                Object[] objectArray10 = new Object[1];
                                                                objectArray10[0] = l18;
                                                                Object[] objectArray11 = new Object[4];
                                                                objectArray11[3] = l17;
                                                                objectArray11[2] = Float.valueOf((float)(g8.d("\u00ce", (Object)objectArray10, (long)4483652444136782065L, (long)l6) / 10.0f));
                                                                objectArray11[1] = Float.valueOf(f11 + this.e);
                                                                objectArray11[0] = Float.valueOf(this.g);
                                                                this.g = (float)g8.d("\u00ce", (Object)objectArray11, (long)4472057826801555800L, (long)l6);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                            }
                                                        }
                                                        g8.d("\u00d1", (Object)this.b, (long)4483512435126855807L, (long)l6);
                                                        g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.Y, 3), (long)4482800688947240549L, (long)l6);
                                                        g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.X, 2), (long)4482800688947240549L, (long)l6);
                                                        g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.Y, (int)(f - 3.0f)), (long)4482800688947240549L, (long)l6);
                                                        g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.X, (int)(f10 - 3.0f)), (long)4482800688947240549L, (long)l6);
                                                        g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.X, (int)(f10 / 2.0f)), (long)4482800688947240549L, (long)l6);
                                                        object6 = g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.Y, (int)(f / 2.0f)), (long)4482800688947240549L, (long)l6);
                                                    }
                                                    object = this.a;
                                                    n3 = ((b4[])object).length;
                                                    n2 = 0;
                                                    while (n2 < n3) {
                                                        block86: {
                                                            block88: {
                                                                b4 b44;
                                                                block89: {
                                                                    b432 = object[n2];
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (callSite4 != null) break block86;
                                                                                        Object[] objectArray12 = new Object[1];
                                                                                        objectArray12[0] = l7;
                                                                                        object5 = g8.d("\u00d1", (Object)b432, (Object)objectArray12, (long)4483254675328973450L, (long)l6);
                                                                                        if (callSite4 != null) break block87;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                                    }
                                                                                    if (object5 == 0) break block88;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                                }
                                                                                b44 = b432;
                                                                                if (callSite4 != null) break block89;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                            }
                                                                            if (g8.d("\u00d1", (Object)b44, (Object)new Object[0], (long)4484541697871972964L, (long)l6) != false) break block88;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                        }
                                                                        b44 = b432;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                    }
                                                                }
                                                                Object[] objectArray13 = new Object[1];
                                                                objectArray13[0] = l16;
                                                                g8.d("\u00d1", (Object)b44, (Object)objectArray13, (long)4484204628548730986L, (long)l6);
                                                            }
                                                            ++n2;
                                                        }
                                                        if (callSite4 == null) continue;
                                                        g8.d("\u00ce", (Object)new int[1], (long)4471634760672277660L, (long)l6);
                                                        break;
                                                    }
                                                    object = this.a;
                                                    n3 = ((b4[])object).length;
                                                    object5 = n2 = 0;
                                                }
                                                while (n2 < n3) {
                                                    block91: {
                                                        block92: {
                                                            Object object7;
                                                            block93: {
                                                                b432 = object[n2];
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite4 != null) break block90;
                                                                                    if (callSite4 != null) break block91;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                                }
                                                                                Object[] objectArray14 = new Object[1];
                                                                                objectArray14[0] = l7;
                                                                                if (g8.d("\u00d1", (Object)b432, (Object)objectArray14, (long)4483254675328973450L, (long)l6) == false) break block92;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                            }
                                                                            object7 = g8.d("\u00d1", (Object)b432, (Object)new Object[0], (long)4484541697871972964L, (long)l6);
                                                                            if (callSite4 != null) break block93;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                        }
                                                                        if (object7 != false) break block92;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                    }
                                                                    float f16 = b432.g - 0.0f;
                                                                    object7 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                }
                                                            }
                                                            try {
                                                                block94: {
                                                                    try {
                                                                        try {
                                                                            if (callSite4 != null) break block92;
                                                                            if (object7 > 0) break block94;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                        }
                                                                        if (callSite4 == null) break block92;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                                    }
                                                                }
                                                                g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.X, (int)b432.e), (long)4482800688947240549L, (long)l6);
                                                                g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.X, (int)(b432.e + b432.g)), (long)4482800688947240549L, (long)l6);
                                                                g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.X, (int)(b432.e + b432.g / 2.0f)), (long)4482800688947240549L, (long)l6);
                                                                g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.Y, (int)b432.f), (long)4482800688947240549L, (long)l6);
                                                                g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.Y, (int)(b432.f + b432.h)), (long)4482800688947240549L, (long)l6);
                                                                object7 = g8.d("\u00d1", (Object)this.b, (Object)new cl_0(w_0.Y, (int)(b432.f + b432.h / 2.0f)), (long)4482800688947240549L, (long)l6);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                            }
                                                        }
                                                        ++n2;
                                                    }
                                                    if (callSite4 == null) continue;
                                                }
                                                Object[] objectArray15 = new Object[1];
                                                objectArray15[0] = l15;
                                                g8.d("\u00d1", (Object)((Object)this), (Object)objectArray15, (long)4482613710933810603L, (long)l6);
                                            }
                                            object = g8.d("\u00d1", (Object)new Matrix4f(), (float)var47_27, (float)var47_27, (float)1.0f, (long)4481497221806812873L, (long)l6);
                                            callSite5 = g8.d("\u00d1", (Object)((Object)this), (Object)new Object[0], (long)4482162633656709047L, (long)l6);
                                            Object[] objectArray16 = new Object[1];
                                            objectArray16[0] = l14;
                                            callSite3 = g8.d("\u00ce", (Object)objectArray16, (long)4482406678056441920L, (long)l6);
                                            Object[] objectArray17 = new Object[1];
                                            objectArray17[0] = l2;
                                            Object[] objectArray18 = new Object[1];
                                            objectArray18[0] = l13;
                                            callSite2 = g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray17, (long)4481747676127546692L, (long)l6), (Object)objectArray18, (long)4481629704873815429L, (long)l6);
                                            Object[] objectArray19 = new Object[7];
                                            objectArray19[6] = l11;
                                            objectArray19[5] = new Color(0, 0, 0, (int)(70.0f * this.n));
                                            objectArray19[4] = Float.valueOf(f);
                                            objectArray19[3] = Float.valueOf(f10);
                                            objectArray19[2] = Float.valueOf(0.0f);
                                            objectArray19[1] = Float.valueOf(0.0f);
                                            objectArray19[0] = object;
                                            g8.d("\u00ce", (Object)objectArray19, (long)4484166778133868048L, (long)l6);
                                            float f20 = 20.0f;
                                            color = new Color((int)g8.b("v", (int)20638, (long)(0x21E736A8AAE9AD1FL ^ l6)), (int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)(6.0f * this.n));
                                            for (f13 = 20.0f; f13 < f10; f13 += 20.0f) {
                                                Object[] objectArray20 = new Object[7];
                                                objectArray20[6] = l11;
                                                objectArray20[5] = color;
                                                objectArray20[4] = Float.valueOf(f);
                                                objectArray20[3] = Float.valueOf(f13 + 0.25f);
                                                objectArray20[2] = Float.valueOf(0.0f);
                                                objectArray20[1] = Float.valueOf(f13 - 0.25f);
                                                objectArray20[0] = object;
                                                g8.d("\u00ce", (Object)objectArray20, (long)4484166778133868048L, (long)l6);
                                                try {
                                                    if (callSite4 == null) {
                                                        if (callSite4 == null) continue;
                                                        break;
                                                    }
                                                    break block95;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                }
                                            }
                                            f13 = 20.0f;
                                        }
                                        while (f13 < f) {
                                            Object[] objectArray21 = new Object[7];
                                            objectArray21[6] = l11;
                                            objectArray21[5] = color;
                                            objectArray21[4] = Float.valueOf(f13 + 0.25f);
                                            objectArray21[3] = Float.valueOf(f10);
                                            objectArray21[2] = Float.valueOf(f13 - 0.25f);
                                            objectArray21[1] = Float.valueOf(0.0f);
                                            objectArray21[0] = object;
                                            g8.d("\u00ce", (Object)objectArray21, (long)4484166778133868048L, (long)l6);
                                            f13 += 20.0f;
                                            if (callSite4 == null) continue;
                                        }
                                        Color color2 = new Color((int)g8.d("\u00d1", (Object)callSite3, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4471872797609798228L, (long)l6), (int)(30.0f * this.n));
                                        Object[] objectArray22 = new Object[7];
                                        objectArray22[6] = l11;
                                        objectArray22[5] = color2;
                                        objectArray22[4] = Float.valueOf(f);
                                        objectArray22[3] = Float.valueOf(f10 / 2.0f + 0.25f);
                                        objectArray22[2] = Float.valueOf(0.0f);
                                        objectArray22[1] = Float.valueOf(f10 / 2.0f - 0.25f);
                                        objectArray22[0] = object;
                                        g8.d("\u00ce", (Object)objectArray22, (long)4484166778133868048L, (long)l6);
                                        Object[] objectArray23 = new Object[7];
                                        objectArray23[6] = l11;
                                        objectArray23[5] = color2;
                                        objectArray23[4] = Float.valueOf(f / 2.0f + 0.25f);
                                        objectArray23[3] = Float.valueOf(f10);
                                        objectArray23[2] = Float.valueOf(f / 2.0f - 0.25f);
                                        objectArray23[1] = Float.valueOf(0.0f);
                                        objectArray23[0] = object;
                                        g8.d("\u00ce", (Object)objectArray23, (long)4484166778133868048L, (long)l6);
                                        Object[] objectArray24 = new Object[8];
                                        objectArray24[7] = l8;
                                        objectArray24[6] = Float.valueOf(0.0f);
                                        objectArray24[5] = new Color((int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)(14.0f * this.n));
                                        objectArray24[4] = Float.valueOf(f - 3.0f);
                                        objectArray24[3] = Float.valueOf(f10 - 3.0f);
                                        objectArray24[2] = Float.valueOf(3.0f);
                                        objectArray24[1] = Float.valueOf(2.0f);
                                        objectArray24[0] = object;
                                        g8.d("\u00ce", (Object)objectArray24, (long)4481991020594345881L, (long)l6);
                                        Object[] objectArray25 = new Object[10];
                                        objectArray25[9] = l5;
                                        objectArray25[8] = Float.valueOf(4.0f);
                                        objectArray25[7] = 5;
                                        objectArray25[6] = Float.valueOf((float)callSite5);
                                        objectArray25[5] = Float.valueOf(140.0f);
                                        objectArray25[4] = Float.valueOf(this.g);
                                        objectArray25[3] = Float.valueOf(this.f);
                                        objectArray25[2] = object;
                                        objectArray25[1] = gK2;
                                        objectArray25[0] = aq_02;
                                        g8.d("\u00ce", (Object)objectArray25, (long)4481261325859051586L, (long)l6);
                                        Object[] objectArray26 = new Object[10];
                                        objectArray26[9] = l4;
                                        objectArray26[8] = Float.valueOf(4.0f);
                                        objectArray26[7] = new Color((int)g8.d("\u00d1", (Object)cn_0.r, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.r, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.r, (long)4471872797609798228L, (long)l6), (int)((float)g8.d("\u00d1", (Object)cn_0.r, (long)4481886837473182390L, (long)l6) * this.n));
                                        objectArray26[6] = Float.valueOf((float)callSite5);
                                        objectArray26[5] = Float.valueOf(140.0f);
                                        objectArray26[4] = Float.valueOf(this.g);
                                        objectArray26[3] = Float.valueOf(this.f);
                                        objectArray26[2] = object;
                                        objectArray26[1] = gK2;
                                        objectArray26[0] = aq_02;
                                        g8.d("\u00ce", (Object)objectArray26, (long)4483564358423257406L, (long)l6);
                                        Object[] objectArray27 = new Object[8];
                                        objectArray27[7] = l12;
                                        objectArray27[6] = new Vector4f(4.0f, 4.0f, 0.0f, 0.0f);
                                        objectArray27[5] = new Color((int)g8.b("v", (int)13351, (long)(0x7BAA29952D47C9B0L ^ l6)), (int)g8.b("v", (int)17034, (long)(0x61F28B9C4AE93F05L ^ l6)), (int)g8.b("v", (int)10659, (long)(0x44FFA912E7CE542DL ^ l6)), (int)(235.0f * this.n));
                                        objectArray27[4] = Float.valueOf(this.g + 24.0f);
                                        objectArray27[3] = Float.valueOf(this.f + 140.0f);
                                        objectArray27[2] = Float.valueOf(this.g);
                                        objectArray27[1] = Float.valueOf(this.f);
                                        objectArray27[0] = object;
                                        g8.d("\u00ce", (Object)objectArray27, (long)4483945084818876142L, (long)l6);
                                        float f21 = (float)(g8.d("\u00ce", (double)((double)g8.d("\u00ce", (long)4483291068144161578L, (long)l6) / 600.0), (long)4483142989450569742L, (long)l6) * 0.5 + 0.5);
                                        float f22 = 1.0f;
                                        Object[] objectArray28 = new Object[7];
                                        objectArray28[6] = l11;
                                        objectArray28[5] = new Color((int)g8.d("\u00d1", (Object)callSite3, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4471872797609798228L, (long)l6), (int)((150.0f + 90.0f * f21) * this.n));
                                        objectArray28[4] = Float.valueOf(this.g + 24.0f);
                                        objectArray28[3] = Float.valueOf(this.f + 140.0f - 4.0f);
                                        objectArray28[2] = Float.valueOf(this.g + 24.0f - f22);
                                        objectArray28[1] = Float.valueOf(this.f + 4.0f);
                                        objectArray28[0] = object;
                                        g8.d("\u00ce", (Object)objectArray28, (long)4484166778133868048L, (long)l6);
                                        Object[] objectArray29 = new Object[8];
                                        objectArray29[7] = l8;
                                        objectArray29[6] = Float.valueOf(4.0f);
                                        objectArray29[5] = new Color((int)g8.d("\u00d1", (Object)callSite3, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4471872797609798228L, (long)l6), (int)(70.0f * this.n));
                                        objectArray29[4] = Float.valueOf(this.g + callSite5);
                                        objectArray29[3] = Float.valueOf(this.f + 140.0f);
                                        objectArray29[2] = Float.valueOf(this.g);
                                        objectArray29[1] = Float.valueOf(this.f);
                                        objectArray29[0] = object;
                                        g8.d("\u00ce", (Object)objectArray29, (long)4481991020594345881L, (long)l6);
                                        CallSite callSite6 = g8.a("u", (int)27662, (long)(0xDED79B602E8894BL ^ l6));
                                        Object[] objectArray30 = new Object[1];
                                        objectArray30[0] = l2;
                                        Object[] objectArray31 = new Object[2];
                                        objectArray31[1] = l3;
                                        objectArray31[0] = callSite6;
                                        CallSite callSite7 = g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray30, (long)4481747676127546692L, (long)l6), (Object)objectArray31, (long)4481136083954301729L, (long)l6);
                                        Object[] objectArray32 = new Object[1];
                                        objectArray32[0] = l2;
                                        Object[] objectArray33 = new Object[6];
                                        objectArray33[5] = l;
                                        objectArray33[4] = new Color((int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)g8.b("v", (int)21033, (long)(0x1A3CFE63079F2FA1L ^ l6)), (int)(255.0f * this.n));
                                        objectArray33[3] = Float.valueOf(this.g + 12.0f - callSite2 / 2.0f);
                                        objectArray33[2] = Float.valueOf(this.f + 70.0f - callSite7 / 2.0f);
                                        objectArray33[1] = callSite6;
                                        objectArray33[0] = object;
                                        g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray32, (long)4481747676127546692L, (long)l6), (Object)objectArray33, (long)4483725570114457832L, (long)l6);
                                        int n6 = 0;
                                        object4 = this.a;
                                        int n7 = ((b4[])object4).length;
                                        int n8 = 0;
                                        while (n8 < n7) {
                                            block96: {
                                                block98: {
                                                    b4 b45 = object4[n8];
                                                    try {
                                                        try {
                                                            if (callSite4 != null) break block96;
                                                            Object[] objectArray34 = new Object[1];
                                                            objectArray34[0] = l7;
                                                            object3 = g8.d("\u00d1", (Object)b45, (Object)objectArray34, (long)4483254675328973450L, (long)l6);
                                                            if (callSite4 != null) break block97;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                        }
                                                        if (object3 == 0) break block98;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                    }
                                                    ++n6;
                                                }
                                                ++n8;
                                            }
                                            if (callSite4 == null) continue;
                                        }
                                        object3 = n6;
                                    }
                                    object4 = object3 + "/" + this.a.length;
                                    Object[] objectArray35 = new Object[1];
                                    objectArray35[0] = l2;
                                    Object[] objectArray36 = new Object[2];
                                    objectArray36[1] = l3;
                                    objectArray36[0] = object4;
                                    CallSite callSite8 = g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray35, (long)4481747676127546692L, (long)l6), (Object)objectArray36, (long)4481136083954301729L, (long)l6);
                                    Object[] objectArray37 = new Object[1];
                                    objectArray37[0] = l2;
                                    Object[] objectArray38 = new Object[6];
                                    objectArray38[5] = l;
                                    objectArray38[4] = new Color((int)g8.d("\u00d1", (Object)cn_0.u, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.u, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.u, (long)4471872797609798228L, (long)l6), (int)((float)g8.d("\u00d1", (Object)cn_0.u, (long)4481886837473182390L, (long)l6) * this.n));
                                    objectArray38[3] = Float.valueOf(this.g + 12.0f - callSite2 / 2.0f);
                                    objectArray38[2] = Float.valueOf(this.f + 140.0f - 5.5f - callSite8);
                                    objectArray38[1] = object4;
                                    objectArray38[0] = object;
                                    g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray37, (long)4481747676127546692L, (long)l6), (Object)objectArray38, (long)4483725570114457832L, (long)l6);
                                    float f23 = this.f + 5.5f;
                                    float f24 = this.g + 24.0f + 3.0f;
                                    for (b4 b46 : this.a) {
                                        Object[] objectArray39 = new Object[10];
                                        objectArray39[9] = l10;
                                        objectArray39[8] = this.b;
                                        objectArray39[7] = this.h;
                                        objectArray39[6] = (int)f11;
                                        objectArray39[5] = (int)f12;
                                        objectArray39[4] = Float.valueOf(17.0f);
                                        objectArray39[3] = Float.valueOf(129.0f);
                                        objectArray39[2] = Float.valueOf(f24);
                                        objectArray39[1] = Float.valueOf(f23);
                                        objectArray39[0] = object;
                                        g8.d("\u00d1", (Object)b46, (Object)objectArray39, (long)4482250013089349190L, (long)l6);
                                        f24 += 20.0f;
                                        try {
                                            if (callSite4 == null) {
                                                if (callSite4 == null) continue;
                                                break;
                                            }
                                            break block99;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                        }
                                    }
                                    b4Array = this.a;
                                    n = b4Array.length;
                                }
                                int n9 = 0;
                                while (n9 < n) {
                                    block100: {
                                        block102: {
                                            b4 b45 = b4Array[n9];
                                            try {
                                                try {
                                                    try {
                                                        if (callSite4 != null) break block100;
                                                        Object[] objectArray40 = new Object[1];
                                                        objectArray40[0] = l7;
                                                        object2 = g8.d("\u00d1", (Object)b45, (Object)objectArray40, (long)4483254675328973450L, (long)l6);
                                                        if (callSite4 != null) break block101;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                    }
                                                    if (object2 == 0) break block102;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                                }
                                                Object[] objectArray41 = new Object[2];
                                                objectArray41[1] = l9;
                                                objectArray41[0] = object;
                                                g8.d("\u00d1", (Object)b45, (Object)objectArray41, (long)4484803858156543937L, (long)l6);
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                            }
                                        }
                                        ++n9;
                                    }
                                    if (callSite4 == null) continue;
                                }
                                try {
                                    try {
                                        b43 = this.j;
                                        if (callSite4 != null) break block103;
                                        if (b43 == null) break block104;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                    }
                                    b43 = this.j;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                }
                            }
                            try {
                                try {
                                    Object[] objectArray42 = new Object[1];
                                    objectArray42[0] = l7;
                                    object2 = g8.d("\u00d1", (Object)b43, (Object)objectArray42, (long)4483254675328973450L, (long)l6);
                                    if (callSite4 != null) break block101;
                                    if (object2 == 0) break block104;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                                }
                                Object[] objectArray43 = new Object[8];
                                objectArray43[7] = l8;
                                objectArray43[6] = Float.valueOf(0.0f);
                                objectArray43[5] = new Color((int)g8.d("\u00d1", (Object)callSite3, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4471872797609798228L, (long)l6), (int)(200.0f * this.n));
                                objectArray43[4] = Float.valueOf(this.j.f + this.j.h + 1.5f);
                                objectArray43[3] = Float.valueOf(this.j.e + this.j.g + 1.5f);
                                objectArray43[2] = Float.valueOf(this.j.f - 1.5f);
                                objectArray43[1] = Float.valueOf(this.j.e - 1.5f);
                                objectArray43[0] = object;
                                g8.d("\u00ce", (Object)objectArray43, (long)4481991020594345881L, (long)l6);
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                            }
                        }
                        object2 = 5;
                    }
                    String[][] stringArrayArray = new String[object2][];
                    stringArrayArray[0] = new String[]{g8.a("u", (int)22398, (long)(0x4EBB7440166DB23DL ^ l6)), g8.a("u", (int)26283, (long)(0x666D724B5ACA83EAL ^ l6))};
                    stringArrayArray[1] = new String[]{g8.a("u", (int)5381, (long)(0x19AF20B56963F04BL ^ l6)), g8.a("u", (int)14925, (long)(0x360870DE413B5F05L ^ l6))};
                    stringArrayArray[2] = new String[]{g8.a("u", (int)2166, (long)(0x2C4224A484F0ED3BL ^ l6)), g8.a("u", (int)25698, (long)(0x3E98EEE456AD012EL ^ l6))};
                    stringArrayArray[3] = new String[]{g8.a("u", (int)1534, (long)(0x19FD5BB44F7CE0BAL ^ l6)), g8.a("u", (int)12252, (long)(0x2D993DA10454CA97L ^ l6))};
                    stringArrayArray[4] = new String[]{"R", g8.a("u", (int)7970, (long)(0x634D0AD60B72FA68L ^ l6))};
                    b4Array = stringArrayArray;
                    CallSite callSite9 = g8.a("u", (int)21772, (long)(0xFFBD9208B1BB04AL ^ l6));
                    Object[] objectArray44 = new Object[1];
                    objectArray44[0] = l2;
                    Object[] objectArray45 = new Object[2];
                    objectArray45[1] = l3;
                    objectArray45[0] = callSite9;
                    callSite = g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray44, (long)4481747676127546692L, (long)l6), (Object)objectArray45, (long)4481136083954301729L, (long)l6);
                    var72_65 = callSite * (float)(b4Array.length - 1);
                    b4[] b4Array2 = b4Array;
                    int n = b4Array2.length;
                    boolean bl = false;
                    while (var75_73 < n) {
                        b42 = b4Array2[var75_73];
                        Object[] objectArray46 = new Object[1];
                        objectArray46[0] = l2;
                        Object[] objectArray47 = new Object[2];
                        objectArray47[1] = l3;
                        objectArray47[0] = b42[0];
                        Object[] objectArray48 = new Object[1];
                        objectArray48[0] = l2;
                        Object[] objectArray49 = new Object[2];
                        objectArray49[1] = l3;
                        objectArray49[0] = (String)((Object)g8.a("u", (int)14309, (long)(0x43B6A5CFE094D2ACL ^ l6))) + (String)((Object)b42[1]);
                        var72_65 += g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray46, (long)4481747676127546692L, (long)l6), (Object)objectArray47, (long)4481136083954301729L, (long)l6) + g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray48, (long)4481747676127546692L, (long)l6), (Object)objectArray49, (long)4481136083954301729L, (long)l6);
                        try {
                            ++var75_73;
                            if (callSite4 == null) {
                                if (callSite4 == null) continue;
                                break;
                            }
                            break block105;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                        }
                    }
                    try {
                        v90 = var72_65 + 16.0f;
                        if (callSite4 != null) break block106;
                        if (!(v90 > f10 - 8.0f)) break block105;
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                    }
                    b4Array = new String[][]{{g8.a("u", (int)8902, (long)(0x6740C260B5EBC784L ^ l6)), g8.a("u", (int)2168, (long)(0x7BAD340DE2696D22L ^ l6))}, {g8.a("u", (int)14924, (long)(0x95C5B73CDC5DF03L ^ l6)), g8.a("u", (int)31123, (long)(0x5830D8DE04451CD3L ^ l6))}, {"R", g8.a("u", (int)12193, (long)(0x6601A75F0B66CAFAL ^ l6))}};
                    var72_65 = callSite * (float)(b4Array.length - 1);
                    b4[] b4Array3 = b4Array;
                    n = b4Array3.length;
                    boolean bl2 = false;
                    while (var75_75 < n) {
                        b42 = b4Array3[var75_75];
                        Object[] objectArray50 = new Object[1];
                        objectArray50[0] = l2;
                        Object[] objectArray51 = new Object[2];
                        objectArray51[1] = l3;
                        objectArray51[0] = b42[0];
                        Object[] objectArray52 = new Object[1];
                        objectArray52[0] = l2;
                        Object[] objectArray53 = new Object[2];
                        objectArray53[1] = l3;
                        objectArray53[0] = (String)((Object)g8.a("u", (int)4090, (long)(0x63234C0874496ABDL ^ l6))) + (String)((Object)b42[1]);
                        v90 = var72_65 + (g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray50, (long)4481747676127546692L, (long)l6), (Object)objectArray51, (long)4481136083954301729L, (long)l6) + g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray52, (long)4481747676127546692L, (long)l6), (Object)objectArray53, (long)4481136083954301729L, (long)l6));
                        if (callSite4 == null) {
                            var72_65 = v90;
                            ++var75_75;
                            if (callSite4 == null) continue;
                        }
                        break block106;
                    }
                }
                v90 = (reference)8.0f;
            }
            reference var73_69 = v90;
            Object[] objectArray54 = new Object[2];
            objectArray54[1] = Float.valueOf(1.0f);
            objectArray54[0] = Float.valueOf((float)callSite2);
            CallSite callSite5 = g8.d("\u00ce", (Object)objectArray54, (long)4482432555292991920L, (long)l6);
            reference var75_76 = var72_65 + var73_69 * 2.0f;
            CallSite callSite6 = g8.d("\u00ce", (float)4.0f, (float)(f10 / 2.0f - var75_76 / 2.0f), (long)4471772669088419592L, (long)l6);
            float f17 = f - callSite5 - 8.0f;
            Object[] objectArray55 = new Object[10];
            objectArray55[9] = l5;
            objectArray55[8] = Float.valueOf(4.0f);
            objectArray55[7] = 5;
            objectArray55[6] = Float.valueOf((float)callSite5);
            objectArray55[5] = Float.valueOf((float)var75_76);
            objectArray55[4] = Float.valueOf(f17);
            objectArray55[3] = Float.valueOf((float)callSite6);
            objectArray55[2] = object;
            objectArray55[1] = gK2;
            objectArray55[0] = aq_02;
            g8.d("\u00ce", (Object)objectArray55, (long)4481261325859051586L, (long)l6);
            Object[] objectArray56 = new Object[10];
            objectArray56[9] = l4;
            objectArray56[8] = Float.valueOf(4.0f);
            objectArray56[7] = new Color((int)g8.d("\u00d1", (Object)cn_0.r, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.r, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.r, (long)4471872797609798228L, (long)l6), (int)((float)g8.d("\u00d1", (Object)cn_0.r, (long)4481886837473182390L, (long)l6) * this.n));
            objectArray56[6] = Float.valueOf((float)callSite5);
            objectArray56[5] = Float.valueOf((float)var75_76);
            objectArray56[4] = Float.valueOf(f17);
            objectArray56[3] = Float.valueOf((float)callSite6);
            objectArray56[2] = object;
            objectArray56[1] = gK2;
            objectArray56[0] = aq_02;
            g8.d("\u00ce", (Object)objectArray56, (long)4483564358423257406L, (long)l6);
            Color color = new Color((int)g8.d("\u00d1", (Object)callSite3, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)callSite3, (long)4471872797609798228L, (long)l6), (int)(255.0f * this.n));
            Color color2 = new Color((int)g8.d("\u00d1", (Object)cn_0.t, (long)4482635910511029903L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.t, (long)4485178195687555794L, (long)l6), (int)g8.d("\u00d1", (Object)cn_0.t, (long)4471872797609798228L, (long)l6), (int)(230.0f * this.n));
            reference var80_82 = callSite6 + var73_69;
            float f18 = f17 + (callSite5 - callSite2) / 2.0f;
            int n = 0;
            while (n < b4Array.length) {
                block108: {
                    block109: {
                        Object[] objectArray57 = new Object[1];
                        objectArray57[0] = l2;
                        Object[] objectArray58 = new Object[6];
                        objectArray58[5] = l;
                        objectArray58[4] = color;
                        objectArray58[3] = Float.valueOf(f18);
                        objectArray58[2] = Float.valueOf((float)var80_82);
                        objectArray58[1] = b4Array[n][0];
                        objectArray58[0] = object;
                        g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray57, (long)4481747676127546692L, (long)l6), (Object)objectArray58, (long)4483725570114457832L, (long)l6);
                        Object[] objectArray59 = new Object[1];
                        objectArray59[0] = l2;
                        Object[] objectArray60 = new Object[2];
                        objectArray60[1] = l3;
                        objectArray60[0] = b4Array[n][0];
                        var80_82 += g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray59, (long)4481747676127546692L, (long)l6), (Object)objectArray60, (long)4481136083954301729L, (long)l6);
                        String string = (String)((Object)g8.a("u", (int)4090, (long)(0x63234C0874496ABDL ^ l6))) + (String)((Object)b4Array[n][1]);
                        Object[] objectArray61 = new Object[1];
                        objectArray61[0] = l2;
                        Object[] objectArray62 = new Object[6];
                        objectArray62[5] = l;
                        objectArray62[4] = color2;
                        objectArray62[3] = Float.valueOf(f18);
                        objectArray62[2] = Float.valueOf((float)var80_82);
                        objectArray62[1] = string;
                        objectArray62[0] = object;
                        g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray61, (long)4481747676127546692L, (long)l6), (Object)objectArray62, (long)4483725570114457832L, (long)l6);
                        Object[] objectArray63 = new Object[1];
                        objectArray63[0] = l2;
                        Object[] objectArray64 = new Object[2];
                        objectArray64[1] = l3;
                        objectArray64[0] = string;
                        var80_82 += g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)g8.d("\u00a2", (long)4483998990030024182L, (long)l6), (Object)objectArray63, (long)4481747676127546692L, (long)l6), (Object)objectArray64, (long)4481136083954301729L, (long)l6);
                        try {
                            try {
                                if (callSite4 != null) break block107;
                                if (callSite4 != null) break block108;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                            }
                            if (n >= b4Array.length - 1) break block109;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)4483765762742554360L, (long)l6);
                        }
                        var80_82 += callSite;
                    }
                    ++n;
                }
                if (callSite4 == null) continue;
            }
            this.h = 0;
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g8.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5B64;
        if (u[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])v.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/g8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = t[n2].getBytes("ISO-8859-1");
            g8.u[n2] = g8.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
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

    private void lambda$new$0(aq_0 aq_02, gK gK2) {
        class_310 class_3102;
        long l;
        long l2;
        long l3;
        block4: {
            block5: {
                long l4 = l3 = s ^ 0x5412B6647567L;
                l2 = l4 ^ 0x480C4C4AC9F1L;
                l = l4 ^ 0x1BBCF8294B48L;
                CallSite callSite = g8.d("\u00ce", (long)6910786547537723221L, (long)l3);
                try {
                    try {
                        class_3102 = cz_0.b;
                        if (callSite != null) break block4;
                        if (g8.d("s", (Object)class_3102, (long)6910301756419759613L, (long)l3) == this) break block5;
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)6909803973549977381L, (long)l3);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw g8.d("\u00ce", (Object)matchException, (long)6909803973549977381L, (long)l3);
                }
            }
            class_3102 = cz_0.b;
        }
        CallSite callSite = g8.d("s", (Object)class_3102, (long)6911942127821394630L, (long)l3);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l;
        objectArray2[4] = Float.valueOf((float)g8.d("\u00ce", (Object)objectArray, (long)6909688454687676716L, (long)l3));
        objectArray2[3] = (int)g8.d("\u00ce", (double)(g8.d("\u00d1", (Object)callSite, (long)6911051306966853720L, (long)l3) / (double)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)6908607839642759548L, (long)l3), (long)6912398100707525766L, (long)l3)), (long)6910024857067305443L, (long)l3);
        objectArray2[2] = (int)g8.d("\u00ce", (double)(g8.d("\u00d1", (Object)callSite, (long)6911814435455451112L, (long)l3) / (double)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)6908607839642759548L, (long)l3), (long)6912398100707525766L, (long)l3)), (long)6910024857067305443L, (long)l3);
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        g8.d("\u00d1", (Object)((Object)this), (Object)objectArray2, (long)6910428343002726088L, (long)l3);
    }

    public void method_25394(class_332 class_3322, int n, int n2, float f) {
    }

    public boolean method_25422() {
        long l = s ^ 0x723BC8B9B562L;
        g8.d("\u00d1", (Object)cz_0.b, (Object)g8.d("\u00a2", (long)-6923844582618240018L, (long)l), (long)-6923025927471125404L, (long)l);
        g8.d("\u00d1", (Object)g8.d("\u00a2", (long)-6923844582618240018L, (long)l), (Object)new Object[0], (long)-6924178001626813963L, (long)l);
        return false;
    }

    public void method_25426() {
        long l;
        block32: {
            g8 g82;
            block31: {
                CallSite callSite;
                int n;
                CallSite callSite2;
                block30: {
                    block29: {
                        g8 g83;
                        long l2;
                        block28: {
                            float f;
                            block26: {
                                block27: {
                                    long l3 = l = s ^ 0x416034984588L;
                                    long l4 = l3 ^ 0x79B0F577718L;
                                    l2 = l3 ^ 0x62D8A5D9BE04L;
                                    CallSite callSite3 = g8.d("\u00ce", (long)8000397015155773370L, (long)l);
                                    super.method_25426();
                                    callSite2 = callSite3;
                                    try {
                                        try {
                                            try {
                                                float f10 = this.f - -1.0f;
                                                f = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                if (callSite2 != null) break block26;
                                                if (f != false) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                                            }
                                            float f11 = this.g - -1.0f;
                                            f = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                            if (callSite2 != null) break block26;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                                        }
                                        if (f != false) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l4;
                                    float f12 = (float)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)8002715430015631763L, (long)l), (long)7999740186069762484L, (long)l) / g8.d("\u00ce", (Object)objectArray, (long)8002529233373959532L, (long)l);
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l4;
                                    float f13 = (float)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)8002715430015631763L, (long)l), (long)7998404796336685910L, (long)l) / g8.d("\u00ce", (Object)objectArray2, (long)8002529233373959532L, (long)l);
                                    this.f = f12 / 2.0f - 70.0f;
                                    this.g = f13 / 2.0f - g8.d("\u00d1", (Object)((Object)this), (Object)new Object[0], (long)7998891525143297669L, (long)l) / 2.0f;
                                }
                                try {
                                    g83 = this;
                                    if (callSite2 != null) break block28;
                                    f = (float)g83.i;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                                }
                            }
                            if (f != false) break block29;
                            g83 = this;
                        }
                        b4[] b4Array = g83.a;
                        int n2 = b4Array.length;
                        for (n = 0; n < n2; ++n) {
                            b4 b42 = b4Array[n];
                            try {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l2;
                                g8.d("\u00d1", (Object)b42, (Object)objectArray, (long)7998787295793867327L, (long)l);
                                if (callSite2 == null) {
                                    if (callSite2 == null) continue;
                                    break;
                                }
                                break block29;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                            }
                        }
                        this.i = true;
                    }
                    try {
                        try {
                            callSite = g8.d("\u00d1", (Object)cz_0.b, (long)8002715430015631763L, (long)l);
                            if (callSite2 != null) break block30;
                            if (callSite == null) break block31;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                        }
                        callSite = g8.d("\u00d1", (Object)cz_0.b, (long)8002715430015631763L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                    }
                }
                CallSite callSite4 = g8.d("\u00d1", (Object)callSite, (long)8002870392072632540L, (long)l);
                for (n = 0; n < k.length; ++n) {
                    Object object;
                    block33: {
                        block34: {
                            try {
                                try {
                                    try {
                                        g82 = this;
                                        if (callSite2 != null) break block32;
                                        boolean[] blArray = g82.m;
                                        int n3 = n;
                                        object = g8.d("\u00ce", (long)callSite4, (int)k[n], (long)7998570149123078037L, (long)l);
                                        if (callSite2 != null) break block33;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                                    }
                                    if (object != true) break block34;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                                }
                                object = true;
                                break block33;
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)8001660034704170954L, (long)l);
                            }
                        }
                        object = false;
                    }
                    blArray[n3] = object;
                    this.l[n] = (long)g8.c("a", (int)12315, (long)(0x10E2A69A80F36F6L ^ l));
                    if (callSite2 == null) continue;
                }
            }
            this.j = null;
            this.n = 0.0f;
            g82 = this;
        }
        g82.o = (long)g8.d("\u00ce", (long)8000023675833500184L, (long)l);
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block49: {
            block50: {
                reference var25_15;
                reference var23_14;
                reference var21_13;
                CallSite callSite;
                long l;
                long l2;
                long l3;
                block57: {
                    reference v11;
                    block54: {
                        block56: {
                            block55: {
                                block53: {
                                    block51: {
                                        reference cfr_temp_2;
                                        block52: {
                                            Object object2;
                                            CallSite callSite2;
                                            CallSite callSite3;
                                            CallSite callSite4;
                                            long l4;
                                            long l5;
                                            block47: {
                                                block48: {
                                                    long l6 = l3 = s ^ 0x683F7D801E48L;
                                                    l5 = l6 ^ 0x2EC4464F2CD8L;
                                                    l4 = l6 ^ 0x408F8FAE148CL;
                                                    l2 = l6 ^ 0x79668DDF9552L;
                                                    l = l6 ^ 0x5D6FABC4A3EDL;
                                                    callSite4 = g8.d("\u00d1", (Object)class_119092, (long)3805442445294186315L, (long)l3);
                                                    callSite3 = g8.d("\u00d1", (Object)class_119092, (long)3802276987685872138L, (long)l3);
                                                    callSite2 = g8.d("\u00d1", (Object)class_119092, (long)3805043269030925525L, (long)l3);
                                                    callSite = g8.d("\u00ce", (long)3803069904864466042L, (long)l3);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    float f = this.f - -1.0f;
                                                                    object2 = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                                                    if (callSite != null) break block47;
                                                                    if (object2 != false) break block48;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                                }
                                                                float f = this.g - -1.0f;
                                                                object2 = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                                                if (callSite != null) break block47;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                            }
                                                            if (object2 != false) break block48;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                        }
                                                        g8.d("\u00d1", (Object)((Object)this), (long)3804674351782947484L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                    }
                                                }
                                                object2 = g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)3805385656575122003L, (long)l3), (long)3801875222695882665L, (long)l3);
                                            }
                                            double d = object2;
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l5;
                                            var21_13 = callSite4 * d / (double)g8.d("\u00ce", (Object)objectArray, (long)3805146612745326252L, (long)l3);
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l5;
                                            var23_14 = callSite3 * d / (double)g8.d("\u00ce", (Object)objectArray2, (long)3805146612745326252L, (long)l3);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            object = callSite2;
                                                            if (callSite != null) break block49;
                                                            if (object != false) break block50;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                        }
                                                        Object[] objectArray3 = new Object[3];
                                                        objectArray3[2] = l4;
                                                        objectArray3[1] = (int)var23_14;
                                                        objectArray3[0] = (int)var21_13;
                                                        v11 = g8.d("\u00d1", (Object)((Object)this), (Object)objectArray3, (long)3805220464698058572L, (long)l3);
                                                        if (callSite != null) break block51;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                    }
                                                    if (v11 == false) break block52;
                                                }
                                                catch (MatchException matchException) {
                                                    throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                                }
                                                this.d = (float)((double)this.f - var21_13);
                                                this.e = (float)((double)this.g - var23_14);
                                                this.c = true;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                            }
                                        }
                                        v11 = (cfr_temp_2 = var21_13 - (double)this.f) == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block53;
                                            if (v11 < 0) break block54;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                        }
                                        reference v11 = var21_13 - (double)(this.f + 140.0f);
                                        v11 = v11 == 0 ? 0 : (v11 < 0 ? -1 : 1);
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block55;
                                        if (v11 > 0) break block54;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                    }
                                    reference v11 = var23_14 - (double)this.g;
                                    v11 = v11 == 0 ? 0 : (v11 > 0 ? 1 : -1);
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                }
                            }
                            try {
                                try {
                                    if (callSite != null) break block56;
                                    if (v11 < 0) break block54;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                }
                                reference v11 = var23_14 - (double)(this.g + g8.d("\u00d1", (Object)((Object)this), (Object)new Object[0], (long)3801579221719196997L, (long)l3));
                                v11 = v11 == 0 ? 0 : (v11 < 0 ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                            }
                        }
                        try {
                            if (callSite != null) break block57;
                            if (v11 > 0) break block54;
                        }
                        catch (MatchException matchException) {
                            throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                        }
                        v11 = (reference)true;
                        break block57;
                    }
                    v11 = var25_15 = (reference)false;
                }
                if (var25_15 == false) {
                    b4 b42;
                    int n;
                    int n2;
                    b4[] b4Array;
                    block59: {
                        Object object3;
                        b4Array = this.a;
                        n2 = b4Array.length;
                        n = 0;
                        while (n < n2) {
                            block58: {
                                block60: {
                                    b42 = b4Array[n];
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block58;
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l2;
                                                object3 = g8.d("\u00d1", (Object)b42, (Object)objectArray, (long)3802589892955910264L, (long)l3);
                                                if (callSite != null) break block59;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                            }
                                            if (object3 == 0) break block60;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                        }
                                        Object[] objectArray = new Object[4];
                                        objectArray[3] = l;
                                        objectArray[2] = false;
                                        objectArray[1] = (int)var23_14;
                                        objectArray[0] = (int)var21_13;
                                        g8.d("\u00d1", (Object)b42, (Object)objectArray, (long)3803753521324425201L, (long)l3);
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                    }
                                }
                                ++n;
                            }
                            if (callSite == null) continue;
                        }
                        b4Array = this.a;
                        n2 = b4Array.length;
                        object3 = n = 0;
                    }
                    while (n < n2) {
                        block61: {
                            block62: {
                                b42 = b4Array[n];
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block61;
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l2;
                                                object = g8.d("\u00d1", (Object)b42, (Object)objectArray, (long)3802589892955910264L, (long)l3);
                                                if (callSite != null) break block49;
                                            }
                                            catch (MatchException matchException) {
                                                throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                            }
                                            if (object == false) break block62;
                                        }
                                        catch (MatchException matchException) {
                                            throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                        }
                                        if (g8.d("\u00d1", (Object)b42, (Object)new Object[0], (long)3805103984719495318L, (long)l3) == false) break block62;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                    }
                                    this.j = b42;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)3804330261230060554L, (long)l3);
                                }
                            }
                            ++n;
                        }
                        if (callSite == null) continue;
                    }
                }
                this.h = 1;
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean method_25406(class_11909 class_119092) {
        Object object;
        block9: {
            block10: {
                long l;
                long l2 = l = s ^ 0x5FCFA3DAFF75L;
                long l3 = l2 ^ 0x19349815CDE5L;
                long l4 = l2 ^ 0x4E965385746FL;
                long l5 = l2 ^ 0x6A9F759E42D0L;
                CallSite callSite = g8.d("\u00d1", (Object)class_119092, (long)-3030198739006468490L, (long)l);
                CallSite callSite2 = g8.d("\u00ce", (long)-3028107674610420409L, (long)l);
                CallSite callSite3 = g8.d("\u00d1", (Object)class_119092, (long)-3028299978923424969L, (long)l);
                CallSite callSite4 = g8.d("\u00d1", (Object)class_119092, (long)-3030063548583725592L, (long)l);
                double d = (double)g8.d("\u00d1", (Object)g8.d("\u00d1", (Object)cz_0.b, (long)-3030282740359742610L, (long)l), (long)-3026473169536987500L, (long)l);
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                reference var18_11 = callSite * d / (double)g8.d("\u00ce", (Object)objectArray, (long)-3029885298165305455L, (long)l);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l3;
                reference var20_12 = callSite3 * d / (double)g8.d("\u00ce", (Object)objectArray2, (long)-3029885298165305455L, (long)l);
                try {
                    object = callSite4;
                    if (callSite2 != null) break block9;
                    if (object != false) break block10;
                }
                catch (MatchException matchException) {
                    throw g8.d("\u00ce", (Object)matchException, (long)-3029086606482348745L, (long)l);
                }
                this.c = false;
                b4[] b4Array = this.a;
                int n = b4Array.length;
                int n2 = 0;
                while (n2 < n) {
                    block11: {
                        block12: {
                            b4 b42 = b4Array[n2];
                            try {
                                try {
                                    try {
                                        if (callSite2 != null) break block11;
                                        Object[] objectArray3 = new Object[1];
                                        objectArray3[0] = l4;
                                        object = g8.d("\u00d1", (Object)b42, (Object)objectArray3, (long)-3028472096256011963L, (long)l);
                                        if (callSite2 != null) break block9;
                                    }
                                    catch (MatchException matchException) {
                                        throw g8.d("\u00ce", (Object)matchException, (long)-3029086606482348745L, (long)l);
                                    }
                                    if (object == false) break block12;
                                }
                                catch (MatchException matchException) {
                                    throw g8.d("\u00ce", (Object)matchException, (long)-3029086606482348745L, (long)l);
                                }
                                Object[] objectArray4 = new Object[4];
                                objectArray4[3] = l5;
                                objectArray4[2] = true;
                                objectArray4[1] = (int)var20_12;
                                objectArray4[0] = (int)var18_11;
                                g8.d("\u00d1", (Object)b42, (Object)objectArray4, (long)-3029635723499921716L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw g8.d("\u00ce", (Object)matchException, (long)-3029086606482348745L, (long)l);
                            }
                        }
                        ++n2;
                    }
                    if (callSite2 == null) continue;
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(g8.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(g8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(g8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


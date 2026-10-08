/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2761
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.gK;
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
import net.minecraft.class_2761;
import org.joml.Matrix4f;

/*
 * Renamed from dev.zprestige.prestige.cf
 */
public class cf_0
extends b4 {
    private static final int a;
    private static final long c;
    private static final float m = 20.0f;
    private bW d;
    private final float[] g;
    private int h;
    private long i;
    private float k;
    private long j;
    private float l;
    private float o;
    private float p;
    private float t;
    private float u;
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

    public cf_0(long l) {
        long l2 = (l = v ^ l) ^ 0x69897442855FL;
        super((String)((Object)cf_0.a("u", (int)24221, (long)(0x2C2399A8AC430811L ^ l))), (String)((Object)cf_0.a("u", (int)22842, (long)(0x3D40D32992458FB0L ^ l))), l2);
        this.g = new float[cf_0.c("l", (int)2823, (long)(0x7A31AB8FE7972A9BL ^ l))];
        this.h = 0;
        this.i = (long)cf_0.d("u", (int)16992, (long)(0x1B737AFD73E48DA5L ^ l));
        this.k = -1.0f;
        this.j = (long)cf_0.d("u", (int)16992, (long)(0x1B737AFD73E48DA5L ^ l));
        this.l = -1.0f;
        this.o = -1.0f;
        this.u = 0.0f;
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
                                cf_0.v = hc.a(-1160237943028507222L, 4520823487969724654L, MethodHandles.lookup().lookupClass()).a(241507502668192L);
                                cf_0.K = new Object[80];
                                cf_0.L = new String[80];
                                cf_0.b();
                                cf_0.y = new HashMap<K, V>(13);
                                var22 = cf_0.v ^ 96880065216267L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[7];
                                var29_4 = 0;
                                var28_5 = "\u00d4\u00f4q\u001e\u008d\u008b\u00c8\u00bd\u00ea\r.}P\u00a6\u00c4a\u0010`m\u00e6\u00f1\u0000\u0089\u00e5 ~\u0083X\u00ca\u00b0\u0099\u00fc\u00a7\u0010h\u00ea\u00d3U\u00dcUnN\u00e787\u0082C^\u00ef\u00c5@\u009d\u00c7\u00fa\u0084\u0084\u0002Q:X\u0095V\u00e6\u00a9R\u00ae/\u0016\u001aT6I\u009a9\u00fa\u0083\u00b9[\u00ca01H\u00ea\u00b7\u00b5Uwz\u00df\u00b7\u001dF\u00f04zR.\"\u00e0\u00a5r\u00fd#\u000e\u00db\u00fbY\u00a6\u00ceD\u00e1:q.B\u0088,\\SNh\u00c6\u0013\u00abP\u0093a\u00db\u000fE<F\u00c8\u00d1\u00bc\u00ab%\u00d3\u00fc\u000b\u00f0\u0013\u00c0T\u00ca\u00bb\u000b\u00c8!\u00973\u0002\u0090\u000e\u008ev\\;\u0005\u00c6\u009d\u00f0y\u00fc i}\u007f\u0019%\u00cb3\u00f7\u00f9\u0097\u008b\u009d\u0085/\u0093\u0083\u00da^V\u00b0\u00bb\u00be\u0001\f\u0015M\u00eb\u00bds\u00ea\f\u0093\u00cd\u00c0S:\u000br\u0090\u00bd\fK\u00cd\u001f\u00d1\u0095ba\u00c5{\u0018\u00c3\u009f\u00eb\u009c\u0015l\u0014\u00a7\u00deL\r\u008b\u008a\u00e1\u00e5\u00fd[\u00d7\u0010\u00d6\u00ee\u00f2)2\u001b\u00da\u00ab\u00a8\u00ca\u0017\u00dc\u00f6\u00d5\u00b2\u00e7\\";
                                var30_6 = "\u00d4\u00f4q\u001e\u008d\u008b\u00c8\u00bd\u00ea\r.}P\u00a6\u00c4a\u0010`m\u00e6\u00f1\u0000\u0089\u00e5 ~\u0083X\u00ca\u00b0\u0099\u00fc\u00a7\u0010h\u00ea\u00d3U\u00dcUnN\u00e787\u0082C^\u00ef\u00c5@\u009d\u00c7\u00fa\u0084\u0084\u0002Q:X\u0095V\u00e6\u00a9R\u00ae/\u0016\u001aT6I\u009a9\u00fa\u0083\u00b9[\u00ca01H\u00ea\u00b7\u00b5Uwz\u00df\u00b7\u001dF\u00f04zR.\"\u00e0\u00a5r\u00fd#\u000e\u00db\u00fbY\u00a6\u00ceD\u00e1:q.B\u0088,\\SNh\u00c6\u0013\u00abP\u0093a\u00db\u000fE<F\u00c8\u00d1\u00bc\u00ab%\u00d3\u00fc\u000b\u00f0\u0013\u00c0T\u00ca\u00bb\u000b\u00c8!\u00973\u0002\u0090\u000e\u008ev\\;\u0005\u00c6\u009d\u00f0y\u00fc i}\u007f\u0019%\u00cb3\u00f7\u00f9\u0097\u008b\u009d\u0085/\u0093\u0083\u00da^V\u00b0\u00bb\u00be\u0001\f\u0015M\u00eb\u00bds\u00ea\f\u0093\u00cd\u00c0S:\u000br\u0090\u00bd\fK\u00cd\u001f\u00d1\u0095ba\u00c5{\u0018\u00c3\u009f\u00eb\u009c\u0015l\u0014\u00a7\u00deL\r\u008b\u008a\u00e1\u00e5\u00fd[\u00d7\u0010\u00d6\u00ee\u00f2)2\u001b\u00da\u00ab\u00a8\u00ca\u0017\u00dc\u00f6\u00d5\u00b2\u00e7\\".length();
                                var27_7 = 16;
                                var26_8 = -1;
lbl32:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = cf_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u0015\u00c4\u0084W\u00b76\u0015\u00e2\u00a9\u00d8\u00f0\u0016\u00e4\"i\u00fa\u0010\u001c\u00c9HY\u00d7\u00d2r\u00d0Jv\u009bB\u00ab\u0099s\u007f";
                                    var30_6 = "\u0015\u00c4\u0084W\u00b76\u0015\u00e2\u00a9\u00d8\u00f0\u0016\u00e4\"i\u00fa\u0010\u001c\u00c9HY\u00d7\u00d2r\u00d0Jv\u009bB\u00ab\u0099s\u007f".length();
                                    var27_7 = 16;
                                    var26_8 = -1;
lbl46:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = cf_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block27;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl63:
                                // 1 sources

                                ** continue;
                            }
                        }
                        cf_0.w = var31_3;
                        cf_0.x = new String[7];
                        cf_0.D = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[18];
                        var14_13 = 0;
                        var15_14 = "3c\u00b7w\\,\u0093K\u0011\u0011~\u008a\u0098\u00aa-Fx\u0081 JZ\u00b1\u0092d7\nq\u00ec{\u00ac\u00b2D{z7\u0005\u00fb\u000e\u00bd'\u00e4\u00e1\u00ab-\u00d6?\u00d8\u00a5\u00aa6\rt\u00fa\u0003.\u00b0\u0001BV\u00e8N\u008b\u00aa\u0097\u00afNuHUf\u0083\n\u00e8\u00f9\u001b\u0082\u0089\u00bb\u0096V\u0017\u0007\u00e4V\u0006\u0006\u0015\u00a5\u00c7\u0082\u00a6\u00e9}\u00f4\u00e4\u00dd,\u00b2\u00ea&/\u008bM\u00d1\u00f2\u008b\u00d4\u00fd\u00fc\u00817\u00af\u00b0\u00b3p\u0087\u00af<\u0099\u00e6]H\u0001\u00d0\u0014\u0082gs";
                        var16_15 = "3c\u00b7w\\,\u0093K\u0011\u0011~\u008a\u0098\u00aa-Fx\u0081 JZ\u00b1\u0092d7\nq\u00ec{\u00ac\u00b2D{z7\u0005\u00fb\u000e\u00bd'\u00e4\u00e1\u00ab-\u00d6?\u00d8\u00a5\u00aa6\rt\u00fa\u0003.\u00b0\u0001BV\u00e8N\u008b\u00aa\u0097\u00afNuHUf\u0083\n\u00e8\u00f9\u001b\u0082\u0089\u00bb\u0096V\u0017\u0007\u00e4V\u0006\u0006\u0015\u00a5\u00c7\u0082\u00a6\u00e9}\u00f4\u00e4\u00dd,\u00b2\u00ea&/\u008bM\u00d1\u00f2\u008b\u00d4\u00fd\u00fc\u00817\u00af\u00b0\u00b3p\u0087\u00af<\u0099\u00e6]H\u0001\u00d0\u0014\u0082gs".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block28;
                            break;
                        }
lbl102:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u0003\u00df\u00ea\u00c2\u00f8\u00f2+}/\u0096X4\u0087\u00dae\u00d5";
                            var16_15 = "\u0003\u00df\u00ea\u00c2\u00f8\u00f2+}/\u0096X4\u0087\u00dae\u00d5".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl121:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block29;
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
lbl134:
                        // 1 sources

                        ** continue;
                    }
                }
                cf_0.B = var17_12;
                cf_0.C = new Integer[18];
                cf_0.a = (int)cf_0.c("l", (int)4256, (long)(var22 ^ 3721928357464787024L));
                cf_0.J = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[5];
                var3_23 = 0;
                var4_24 = "\u0081\u009d\u00dc\u0010\u00e7\u00e5\u00c8\u00e0\u001e\u00f0G\u00deG\u00cbdL:\u00ac\u00b0'\u0096EG\u0090";
                var5_25 = "\u0081\u009d\u00dc\u0010\u00e7\u00e5\u00c8\u00e0\u001e\u00f0G\u00deG\u00cbdL:\u00ac\u00b0'\u0096EG\u0090".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v18 = var6_22;
                    v19 = var3_23++;
                    v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v21 = -1;
                    break block30;
                    break;
                }
lbl174:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "Vy\u00d2\u00cd\r\u0087j\u00eb\u009c~\u00e5\u0097\u00e0\u0086\u00f2(";
                    var5_25 = "Vy\u00d2\u00cd\r\u0087j\u00eb\u009c~\u00e5\u0097\u00e0\u0086\u00f2(".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v18 = var6_22;
                        v19 = var3_23++;
                        v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v21 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl193:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    break block31;
                    break;
                }
            }
            var8_28 = v20;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v22 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl206:
                // 1 sources

                ** continue;
            }
        }
        cf_0.H = var6_22;
        cf_0.I = new Long[5];
        cf_0.c = (long)cf_0.d("u", (int)4617, (long)(var22 ^ 1644221525616403630L));
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
        if (L[n3] != null) {
            return n3;
        }
        Object object = K[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 28;
            case 2 -> 5;
            case 3 -> 4;
            case 4 -> 42;
            case 5 -> 18;
            case 6 -> 2;
            case 7 -> 62;
            case 8 -> 46;
            case 9 -> 23;
            case 10 -> 50;
            case 11 -> 25;
            case 12 -> 54;
            case 13 -> 0;
            case 14 -> 61;
            case 15 -> 51;
            case 16 -> 30;
            case 17 -> 20;
            case 18 -> 3;
            case 19 -> 52;
            case 20 -> 40;
            case 21 -> 7;
            case 22 -> 6;
            case 23 -> 38;
            case 24 -> 57;
            case 25 -> 47;
            case 26 -> 21;
            case 27 -> 34;
            case 28 -> 8;
            case 29 -> 1;
            case 30 -> 13;
            case 31 -> 16;
            case 32 -> 55;
            case 33 -> 11;
            case 34 -> 14;
            case 35 -> 27;
            case 36 -> 37;
            case 37 -> 44;
            case 38 -> 48;
            case 39 -> 36;
            case 40 -> 22;
            case 41 -> 10;
            case 42 -> 12;
            case 43 -> 41;
            case 44 -> 33;
            case 45 -> 9;
            case 46 -> 19;
            case 47 -> 49;
            case 48 -> 31;
            case 49 -> 35;
            case 50 -> 58;
            case 51 -> 53;
            case 52 -> 15;
            case 53 -> 24;
            case 54 -> 29;
            case 55 -> 63;
            case 56 -> 59;
            case 57 -> 56;
            case 58 -> 60;
            case 59 -> 26;
            case 60 -> 17;
            case 61 -> 45;
            case 62 -> 39;
            default -> 43;
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
        cf_0.L[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = K;
        K[0] = "xz~C\u001a!nz{\u0019\t6y1x\u001f\u0005\"hvo\bN0T";
        objectArray[1] = "D[\fOVI1{\u0007@G\u0006Lc\u0014GNO$";
        objectArray[2] = "\u00147*xD\u0011\u00027/\"W\u0006\u0015|,$[\u0012\u0004;;3\u0010\u0002\u0016";
        objectArray[3] = "%\u001ez'Xi.\u0011kh;d;\u001cd\u0003\u000ef*\u000fx/\u0019k";
        objectArray[4] = "\"dtM_z?q,o\u001ew'w";
        objectArray[5] = Integer.TYPE;
        cf_0.L[5] = "java/lang/Integer";
        objectArray[6] = ";\u0012ORLX%\u001aU\u001d.B2\u0012UV";
        objectArray[7] = "R\u001cTgl5D\u001cQ=\u007f\"SWR;s6B\u0010E,8!w";
        objectArray[8] = "iBce\u001d\u0010\u001cbhj\f_}lca\b\u0005\t";
        objectArray[9] = Void.TYPE;
        cf_0.L[9] = "java/lang/Void";
        objectArray[10] = "r@+d\u0017\u000b\u0007` k\u0006Dfn+`\u0002\u001e\u0012";
        objectArray[11] = "\u0014sZ\u0014\\A\u0002s_NOV\u00158\\HCB\u0004\u007fK_\bR\u001e";
        objectArray[12] = "\u000e\u001fB:kJ{?I5z\u0005\u001a1B>~_n";
        objectArray[13] = Float.TYPE;
        cf_0.L[13] = "java/lang/Float";
        objectArray[14] = "PJ2CFa[E#\f;yHB*E";
        objectArray[15] = "\fAbWl4yaiX}{\u0018obSy!l";
        objectArray[16] = "c+\u001c}'!u+\u0019'46b`\u001a!8\"s'\r6s33";
        objectArray[17] = "3/u`%OF\u000f~o4\u0000'\u0001ud0ZS";
        objectArray[18] = "K5\u0014<x\u000e]5\u0011fk\u0019J~\u0012`g\r[9\u0005w,\u001fj";
        objectArray[19] = "\nN_YZ7\u007fnTVKx\u001e`_]O\"j";
        objectArray[20] = "\u0015kV\u0004l?\u0015kAX`0\u000f AF`%\bQ\u0011\u001b1";
        objectArray[21] = "7=\u0002C.~7=\u0015\u001f\"q-v\u0015\u0001\"d*\u0007B^t";
        objectArray[22] = " ZQ\u001a3m6ZT@ z!\u0011WF,n0V@Qg~(VBZ=3\u0014MBG=t#Z";
        objectArray[23] = "]\rNJr\u0003K\rK\u0010a\u0014\\FH\u0016m\u0000M\u0001_\u0001&\u0010z";
        objectArray[24] = "\u000b2|`B\u0004~\u0012woSK\u001f\u001c|dW\u0011k";
        objectArray[25] = "@V\u0012/Y\tVV\u0017uJ\u001eA\u001d\u0014sF\nPZ\u0003d\r\u001ae";
        objectArray[26] = "Z\u0017=\u0004O^L\u00178^\\I[\\;XP]J\u001b,O\u001bJS";
        objectArray[27] = "ze8\u0018OV\u000fE3\u0017^\u0019nK8\u001cZC\u001a";
        objectArray[28] = ":g\u0006\u007fp$,g\u0003%c3;,\u0000#o'*k\u00174$6\t";
        objectArray[29] = "\u000b\u001a58p\n\u0000\u0015$w\u0018\n\u000e\u001a7";
        objectArray[30] = "\u001a,[jZOo\fPeK\u0000\u000e\u0002[nOZz";
        objectArray[31] = "\u000e\u001dOSD\u000e{=D\\UA\u001a3OWQ\u001bn";
        objectArray[32] = "+\u0007N#\u001di=\u0007Ky\u000e~*LH\u007f\u0002j;\u000b_hI}$";
        objectArray[33] = "4vRp\u000fnAVY\u007f\u001e! XRt\u001a{T";
        objectArray[34] = "EpI;\u0014DSpLa\u0007SD;Og\u000bGU|Xp@PE";
        objectArray[35] = "\u0003}\u001fuVJv]\u0014zG\u0005\u0017S\u001fqC_c";
        objectArray[36] = "pDXp[7\u0005dS\u007fJxdjXtN\"\u0010";
        objectArray[37] = "QcOk\"\u0001GcJ11\u0016P(I7=\u0002Ao^ v\u0015Y";
        objectArray[38] = "9WV4\u00001Lw];\u0011~-yV0\u0015$Y";
        objectArray[39] = "@n\u000e2ql5N\u0005=`#T@\u000e6dy ";
        objectArray[40] = Boolean.TYPE;
        cf_0.L[40] = "java/lang/Boolean";
        objectArray[41] = "\u001ab\u001c(N+\u0011m\rg3>\u0003w\u000f$";
        objectArray[42] = Long.TYPE;
        cf_0.L[42] = "java/lang/Long";
        objectArray[43] = "G`S\u000e\bn2@X\u0001\u0019!SNS\n\u001d{'";
        objectArray[44] = "\u0015\u00022e\u007fu\u001e\r#*\u001cx\u000b\u000b";
        objectArray[45] = "ixV@2N\u007fxS\u001a!Yh3P\u001c-MytG\u000bf\\j";
        objectArray[46] = "Kv#\u0018p\u0006>V(\u0017aI_X#\u001ce\u0013+";
        objectArray[47] = "kk\u001f\u001e}Nkk\bBqAq \b\\qTvQY\u0005)\u0011";
        objectArray[48] = "c\u00121\u000en\n\u00162:\u0001\u007fEw<1\n{\u001f\u0003";
        objectArray[49] = "v\u0016\u0003T\u000bh}\u0019\u0012\u001bjfv\u0012\u0016A";
        objectArray[50] = "BZd/y\u0001\u001aRsl\u0005U\u0014IM(hW\u001f5>jwV\u001eYe/4Vy";
        objectArray[51] = "fZ|y\\d`QmzgC\u001dqKD[u1\u000b,9]~ \b";
        objectArray[52] = "r\u0012\u0013I'},P\u00120*\u00182M\u0000V9$u\u0018\t0";
        objectArray[53] = "\"JWSL@!@\t_0\u001b\u001eH\u000bPJN{X\u001eTI\u007f @\u0011YV\u001du_TA0";
        objectArray[54] = "H\u000b\u000f\"/\u0011\nV\u001c(B\u0017q\u001a\u0010*8O\u0014\n\u0005.;~J\u0005\u0011>>E\u0012\r\u0006}B";
        objectArray[55] = "\u0005pI>9']x^}EsScu.)\u001c\u0002']/\"pYb\u001e/E";
        objectArray[56] = "e\u0001\u0006\u0014:\u0013+YQO\u0006IUJ\u0007\u0019|\u00120Z\u0012\u001d\u007f#d\u0003QJcRjB\u0001\t\u0006";
        objectArray[57] = "\u001ay\u0001\u0018gT\u0016(\u0012\u0006\u000eE\u0014o\u001b\u0016r+Oy\u0015B5VIr\u0004A\u000eB\u001fj\u0019\u0016qNNy\u0007\u007f~L\u001aoO\u001anY\u001el~\u0016bT\u0014|\u0001\u001a3G\n\u0015";
        objectArray[58] = "n*o?\u0015cj574ko\u00049ng\u0011?a){c\u0012\u000e:1tn\rlo.1vk";
        objectArray[59] = "[5\u0002\u0002 LI+\u0014\u0000FQ0>\u0015W<\fU.\u0000S?=\u000b!\u0014C:\u0006S)\u0003\u0000F";
        objectArray[60] = "l8iAEV~iq\u0000}]`:k\u0015*\n>j2y\u0010Cpn2ABT9i";
        objectArray[61] = "\\Nz*\u0004,^@k%`!2K#}\u001b3LO-(\u0003";
        objectArray[62] = "!7\u0005\u001e\u0004\u0001%9P\u0006}\u0016NwY\f\u0007N+gL\b\u0004\u007f.\u007f\u0001\b\u001b\rqh^\b}";
        objectArray[63] = "\rZri\u0013a\r\u001b!ia`\u0011@L6X4JC=8\u0019d\t&}>P?\u0015Ws\u007f\u0000|p\u0017u6[`\u0001\u00194f\u0018\u0005";
        objectArray[64] = "\ts2?>>\r(bc\u0000fhe>7z>\ru+3y\u000f\u000b/a9=qX\u007f5e\u0000";
        objectArray[65] = "\\v:\u0015seC;/S\fcV#?\u0000Ks?v{\\6xNx:\fu\u001d\\v:\u0015seC;/S\f";
        objectArray[66] = "]hOh2MYw\u0017cLI7{N06\u0011Rk[45 \tsT9*B\\l\u0011!L";
        objectArray[67] = "eT\u0002:cF:C]:\u0005_\u0005\\Z>\u007f\u0005`LO:|44\u0015\fm`E:T\\.\u0005";
        objectArray[68] = "IU\"\u001c-w\u0016B}\u001cKl)]z\u001814LMo\u001c2\u0005\u0018\u0014,K.t\u0016U|\bK";
        objectArray[69] = "a<\u007f\u001a\u001d1`~!Oq'\u001f|v\u001c\u000b\u007fzlc\u0018\bN`~-\f\u001b y|pJq";
        objectArray[70] = "Y8P6}<D9_$C3<+\t/9iY;\u001c+:X\u0002#\u0013&%:W<V>C";
        objectArray[71] = "Nk\u0005S$6\u0012qF\u000eJ&(~\\X0zMnI\\3K\u0016vFQ,)Ci\u0003IJ";
        objectArray[72] = "L\u001834Xn\u0014\u0010$w$:\u001a\u000b\u001f-Y8wKm;H2\u001b\u0010(xHU";
        objectArray[73] = "G\u0010VSaHU\u000e@Q\u0007S,\u001bA\u0006}\bI\u000bT\u0002~9\u001dR\u0017UbH\u0013\u0013G\u0016\u0007";
        objectArray[74] = "o 4VL]qs7\u00156M\u0016:n\u0004L\u0017s*{\u0000O&(2t\rPD}-1\u00156";
        objectArray[75] = "Qwgcl[Uh?h\u0012];df;h\u0007^ts?k6@,<+)[\u0001%lh\u0012";
        objectArray[76] = "\u007fc\u001e[\u0018)ii[Ej yh\u0019F\f7Xs\u0006F/*`v\u0002Pj79*[\u0017\u00140~t\u001b+";
        objectArray[77] = "\u0000}3\u0014\f>_jl\u0014j3`uk\u0010\u0010}\u0005e~\u0014\u0013L^}q\u0019\f.\u000bb4\u0001j";
        objectArray[78] = "0{jp\u0010%r&yz}#\t srCtpfpz\rJ3{q/C3uxya}";
        Object[] objectArray2 = objectArray;
        objectArray[79] = "K~\r\u0000L\u001bK?^\u0000>\u001a_r3_\u0007N\fgBQF\u001eO\u0002\u0002W\u000fESs\f\u0016_\u000663\n_\u0004\u001aG=K\u000fG\u007f";
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

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00cf' || c == '\u00e9' || c == 'P') {
                field = cf_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cf_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n2 = cf_0.c(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/cf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cf_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6FD7;
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
                throw new RuntimeException("dev/zprestige/prestige/cf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cf_0.C[n2] = n3;
        }
        return C[n2];
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cf_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cf_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = cf_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cf_0.f(classArray[i], string, clazz2);
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
        block79: {
            block85: {
                block84: {
                    block78: {
                        block76: {
                            block77: {
                                block75: {
                                    block73: {
                                        block72: {
                                            block70: {
                                                block71: {
                                                    block66: {
                                                        block69: {
                                                            block68: {
                                                                block67: {
                                                                    block65: {
                                                                        block64: {
                                                                            block63: {
                                                                                var6_2 = (aq_0)var1_1[0];
                                                                                var5_3 = (gK)var1_1[1];
                                                                                var4_4 = (Matrix4f)var1_1[2];
                                                                                var2_5 = (Long)var1_1[3];
                                                                                v0 = var2_5;
                                                                                var7_6 = v0 ^ 57131357196865L;
                                                                                var9_7 = v0 ^ 132449650111663L;
                                                                                var11_8 = v0 ^ 77544806110454L;
                                                                                var13_9 = v0 ^ 95334181894420L;
                                                                                var15_10 = v0 ^ 27807340928064L;
                                                                                var17_11 = v0 ^ 89135395443612L;
                                                                                var19_12 = v0 ^ 102693909475685L;
                                                                                var21_13 = v0 ^ 6014253680539L;
                                                                                var23_14 = v0 ^ 131934975778103L;
                                                                                var25_15 = v0 ^ 54030867045760L;
                                                                                var27_16 = v0 ^ 19313467402120L;
                                                                                var29_17 = v0 ^ 101037798966850L;
                                                                                var31_18 = cf_0.g("\u00d0", (long)-6306348021938595617L, (long)var2_5);
                                                                                try {
                                                                                    try {
                                                                                        v1 = this;
                                                                                        if (var31_18 != null) break block63;
                                                                                        if (v1.d != null) break block64;
                                                                                    }
                                                                                    catch (MatchException v2) {
                                                                                        throw cf_0.g("\u00d0", (Object)v2, (long)-6312389118546806632L, (long)var2_5);
                                                                                    }
                                                                                    v1 = this;
                                                                                }
                                                                                catch (MatchException v3) {
                                                                                    throw cf_0.g("\u00d0", (Object)v3, (long)-6312389118546806632L, (long)var2_5);
                                                                                }
                                                                            }
                                                                            v4 = new Object[2];
                                                                            v4[1] = var7_6;
                                                                            v4[0] = cf_0.a("u", (int)7429, (long)(5912351996583652787L ^ var2_5));
                                                                            v1.d = cf_0.g("\u00d0", (Object)v4, (long)-6312219515623149830L, (long)var2_5);
                                                                        }
                                                                        var32_19 = cf_0.g("\u00d0", (long)-6312531466001198557L, (long)var2_5);
                                                                        var34_20 = (float)(var32_19 - this.j) * 0.005f;
                                                                        try {
                                                                            this.j = (long)var32_19;
                                                                            cfr_temp_0 = this.k - 0.0f;
                                                                            v5 /* !! */  = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                            if (var31_18 != null) break block65;
                                                                            if (v5 /* !! */  < 0) {
                                                                            }
                                                                            ** GOTO lbl56
                                                                        }
                                                                        catch (MatchException v6) {
                                                                            throw cf_0.g("\u00d0", (Object)v6, (long)-6312389118546806632L, (long)var2_5);
                                                                        }
                                                                        var35_21 = 0.0f;
                                                                        var36_22 = cf_0.a("u", (int)19915, (long)(341581275521645944L ^ var2_5));
                                                                        try {
                                                                            if (var31_18 == null) break block66;
lbl56:
                                                                            // 2 sources

                                                                            v5 /* !! */  = (cfr_temp_1 = this.i - cf_0.d("u", (int)16992, (long)(1978055190263262110L ^ var2_5))) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                        }
                                                                        catch (MatchException v7) {
                                                                            throw cf_0.g("\u00d0", (Object)v7, (long)-6312389118546806632L, (long)var2_5);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var31_18 != null) break block67;
                                                                            if (v5 /* !! */  <= 0) break block68;
                                                                        }
                                                                        catch (MatchException v8) {
                                                                            throw cf_0.g("\u00d0", (Object)v8, (long)-6312389118546806632L, (long)var2_5);
                                                                        }
                                                                        cfr_temp_2 = var32_19 - this.i - cf_0.d("u", (int)21598, (long)(8385222388572945827L ^ var2_5));
                                                                        v5 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                                    }
                                                                    catch (MatchException v9) {
                                                                        throw cf_0.g("\u00d0", (Object)v9, (long)-6312389118546806632L, (long)var2_5);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var31_18 != null) break block69;
                                                                    if (v5 /* !! */  <= 0) break block68;
                                                                }
                                                                catch (MatchException v10) {
                                                                    throw cf_0.g("\u00d0", (Object)v10, (long)-6312389118546806632L, (long)var2_5);
                                                                }
                                                                v5 /* !! */  = (float)true;
                                                                break block69;
                                                            }
                                                            v5 /* !! */  = (float)false;
                                                        }
                                                        var37_23 = v5 /* !! */ ;
                                                        try {
                                                            v11 = var37_23 != false ? 0.0f : this.k;
                                                        }
                                                        catch (MatchException v12) {
                                                            throw cf_0.g("\u00d0", (Object)v12, (long)-6312389118546806632L, (long)var2_5);
                                                        }
                                                        var35_21 = v11;
                                                        var36_22 = cf_0.g("\u00d0", (Object)cf_0.g("\u00e9", (long)-6306550533598368801L, (long)var2_5), (Object)cf_0.a("u", (int)13716, (long)(7475797183508481313L ^ var2_5)), (Object)new Object[]{cf_0.g("\u00d0", (float)var35_21, (long)-6312288333907973138L, (long)var2_5)}, (long)-6307265697210386518L, (long)var2_5);
                                                    }
                                                    try {
                                                        try {
                                                            v13 = this;
                                                            v14 = this.l;
                                                            v15 = 0.0f;
                                                            if (var31_18 != null) break block70;
                                                            if (!(v14 < v15)) break block71;
                                                        }
                                                        catch (MatchException v16) {
                                                            throw cf_0.g("\u00d0", (Object)v16, (long)-6312389118546806632L, (long)var2_5);
                                                        }
                                                        v17 /* !! */  = var35_21;
                                                        break block72;
                                                    }
                                                    catch (MatchException v18) {
                                                        throw cf_0.g("\u00d0", (Object)v18, (long)-6312389118546806632L, (long)var2_5);
                                                    }
                                                }
                                                v14 = this.l;
                                                v15 = var35_21;
                                            }
                                            v19 = new Object[4];
                                            v19[3] = var21_13;
                                            v19[2] = Float.valueOf(var34_20 * 0.5f);
                                            v19[1] = Float.valueOf(v15);
                                            v19[0] = Float.valueOf(v14);
                                            v17 /* !! */  = (float)cf_0.g("\u00d0", (Object)v19, (long)-6312893490763468635L, (long)var2_5);
                                        }
                                        v13.l = v17 /* !! */ ;
                                        v20 = new Object[2];
                                        v20[1] = var11_8;
                                        v20[0] = Float.valueOf(this.l);
                                        var37_24 = cf_0.g("\u00d0", (Object)v20, (long)-6306232483579068023L, (long)var2_5);
                                        try {
                                            block74: {
                                                try {
                                                    try {
                                                        v21 = this;
                                                        if (var31_18 != null) break block73;
                                                        if (!(v21.o < 0.0f)) break block74;
                                                    }
                                                    catch (MatchException v22) {
                                                        throw cf_0.g("\u00d0", (Object)v22, (long)-6312389118546806632L, (long)var2_5);
                                                    }
                                                    this.o = (float)cf_0.g("\u00a2", (Object)var37_24, (long)-6306279304513594408L, (long)var2_5);
                                                    this.p = (float)cf_0.g("\u00a2", (Object)var37_24, (long)-6306452879501296581L, (long)var2_5);
                                                    this.t = (float)cf_0.g("\u00a2", (Object)var37_24, (long)-6312795189079454705L, (long)var2_5);
                                                    if (var31_18 == null) break block75;
                                                }
                                                catch (MatchException v23) {
                                                    throw cf_0.g("\u00d0", (Object)v23, (long)-6312389118546806632L, (long)var2_5);
                                                }
                                            }
                                            v24 = new Object[4];
                                            v24[3] = var21_13;
                                            v24[2] = Float.valueOf(var34_20);
                                            v24[1] = Float.valueOf((float)cf_0.g("\u00a2", (Object)var37_24, (long)-6306279304513594408L, (long)var2_5));
                                            v24[0] = Float.valueOf(this.o);
                                            this.o = (float)cf_0.g("\u00d0", (Object)v24, (long)-6312893490763468635L, (long)var2_5);
                                            v25 = new Object[4];
                                            v25[3] = var21_13;
                                            v25[2] = Float.valueOf(var34_20);
                                            v25[1] = Float.valueOf((float)cf_0.g("\u00a2", (Object)var37_24, (long)-6306452879501296581L, (long)var2_5));
                                            v25[0] = Float.valueOf(this.p);
                                            this.p = (float)cf_0.g("\u00d0", (Object)v25, (long)-6312893490763468635L, (long)var2_5);
                                            v21 = this;
                                        }
                                        catch (MatchException v26) {
                                            throw cf_0.g("\u00d0", (Object)v26, (long)-6312389118546806632L, (long)var2_5);
                                        }
                                    }
                                    v27 = new Object[4];
                                    v27[3] = var21_13;
                                    v27[2] = Float.valueOf(var34_20);
                                    v27[1] = Float.valueOf((float)cf_0.g("\u00a2", (Object)var37_24, (long)-6312795189079454705L, (long)var2_5));
                                    v27[0] = Float.valueOf(this.t);
                                    v21.t = (float)cf_0.g("\u00d0", (Object)v27, (long)-6312893490763468635L, (long)var2_5);
                                }
                                var38_25 = new Color((int)this.o, (int)this.p, (int)this.t);
                                v28 = new Object[1];
                                v28[0] = var23_14;
                                v29 = new Object[1];
                                v29[0] = var25_15;
                                var39_26 = cf_0.g("\u00a2", (Object)cf_0.g("\u00a2", (Object)cf_0.g("\u00e9", (long)-6306952466297279722L, (long)var2_5), (Object)v28, (long)-6306748864079594799L, (long)var2_5), (Object)v29, (long)-6312198618953725310L, (long)var2_5);
                                v30 = new Object[1];
                                v30[0] = var23_14;
                                v31 = new Object[2];
                                v31[1] = var19_12;
                                v31[0] = var36_22;
                                var40_27 = cf_0.g("\u00a2", (Object)cf_0.g("\u00a2", (Object)cf_0.g("\u00e9", (long)-6306952466297279722L, (long)var2_5), (Object)v30, (long)-6306748864079594799L, (long)var2_5), (Object)v31, (long)-6311947790565058085L, (long)var2_5) * 1.0f;
                                v32 = new Object[1];
                                v32[0] = var23_14;
                                v33 = new Object[2];
                                v33[1] = var19_12;
                                v33[0] = cf_0.a("u", (int)23163, (long)(6089553352549427915L ^ var2_5));
                                var41_28 = cf_0.g("\u00a2", (Object)cf_0.g("\u00a2", (Object)cf_0.g("\u00e9", (long)-6306952466297279722L, (long)var2_5), (Object)v32, (long)-6306748864079594799L, (long)var2_5), (Object)v33, (long)-6311947790565058085L, (long)var2_5) * 0.65f;
                                var42_29 = var39_26 * 1.0f;
                                var43_30 = var39_26 * 0.65f;
                                var44_31 = 7.5f;
                                var45_32 = 5.5f + var44_31 + 5.5f;
                                var46_33 = var45_32 + 0.5f + 5.5f;
                                var47_34 = cf_0.g("\u00d0", (float)(var40_27 + 3.0f + var41_28), (float)28.0f, (long)-6312441339134229792L, (long)var2_5);
                                var48_35 = var46_33 + var47_34 + 5.5f;
                                var49_36 = cf_0.g("\u00d0", (Object)new Object[]{Float.valueOf((float)var39_26)}, (long)-6307213763034281449L, (long)var2_5);
                                var50_37 = cf_0.g("\u00a2", (Object)this, (Object)new Object[0], (long)-6312760540354838272L, (long)var2_5);
                                var51_38 = cf_0.g("y", (Object)cf_0.b, (long)-6306901782798242885L, (long)var2_5) instanceof g8;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var31_18 != null) break block76;
                                                    if (var50_37 == false) break block77;
                                                }
                                                catch (MatchException v34) {
                                                    throw cf_0.g("\u00d0", (Object)v34, (long)-6312389118546806632L, (long)var2_5);
                                                }
                                                v35 = this.u;
                                                if (var31_18 != null) break block78;
                                            }
                                            catch (MatchException v36) {
                                                throw cf_0.g("\u00d0", (Object)v36, (long)-6312389118546806632L, (long)var2_5);
                                            }
                                            if (!(v35 > 0.0f)) break block77;
                                        }
                                        catch (MatchException v37) {
                                            throw cf_0.g("\u00d0", (Object)v37, (long)-6312389118546806632L, (long)var2_5);
                                        }
                                        if (var51_38) break block77;
                                    }
                                    catch (MatchException v38) {
                                        throw cf_0.g("\u00d0", (Object)v38, (long)-6312389118546806632L, (long)var2_5);
                                    }
                                    this.e -= var48_35 - this.u;
                                }
                                catch (MatchException v39) {
                                    throw cf_0.g("\u00d0", (Object)v39, (long)-6312389118546806632L, (long)var2_5);
                                }
                            }
                            this.u = var48_35;
                        }
                        v35 = this.e;
                    }
                    var52_39 = v35;
                    var53_40 = this.f;
                    v40 = new Object[10];
                    v40[9] = var13_9;
                    v40[8] = Float.valueOf(4.0f);
                    v40[7] = 5;
                    v40[6] = Float.valueOf((float)var49_36);
                    v40[5] = Float.valueOf(var48_35);
                    v40[4] = Float.valueOf(var53_40);
                    v40[3] = Float.valueOf(var52_39);
                    v40[2] = var4_4;
                    v40[1] = var5_3;
                    v40[0] = var6_2;
                    cf_0.g("\u00d0", (Object)v40, (long)-6311927471575268958L, (long)var2_5);
                    v41 = new Object[10];
                    v41[9] = var9_7;
                    v41[8] = Float.valueOf(4.0f);
                    v41[7] = cn_0.r;
                    v41[6] = Float.valueOf((float)var49_36);
                    v41[5] = Float.valueOf(var48_35);
                    v41[4] = Float.valueOf(var53_40);
                    v41[3] = Float.valueOf(var52_39);
                    v41[2] = var4_4;
                    v41[1] = var5_3;
                    v41[0] = var6_2;
                    cf_0.g("\u00d0", (Object)v41, (long)-6311809048767446227L, (long)var2_5);
                    v42 = new Object[1];
                    v42[0] = var15_10;
                    var54_41 = cf_0.g("\u00d0", (Object)v42, (long)-6307118374443537145L, (long)var2_5);
                    try {
                        v43 = var50_37 != false ? var52_39 + var48_35 - 5.5f - var44_31 : var52_39 + 5.5f;
                    }
                    catch (MatchException v44) {
                        throw cf_0.g("\u00d0", (Object)v44, (long)-6312389118546806632L, (long)var2_5);
                    }
                    var55_42 = v43;
                    try {
                        v45 = var50_37 != false ? var52_39 + var48_35 - var45_32 - 0.5f : var52_39 + var45_32;
                    }
                    catch (MatchException v46) {
                        throw cf_0.g("\u00d0", (Object)v46, (long)-6312389118546806632L, (long)var2_5);
                    }
                    var56_43 = v45;
                    v47 = new Object[10];
                    v47[9] = var27_16;
                    v47[8] = var54_41;
                    v47[7] = Float.valueOf(var44_31);
                    v47[6] = Float.valueOf(var44_31);
                    v47[5] = Float.valueOf(var53_40 + var49_36 / 2.0f - var44_31 / 2.0f);
                    v47[4] = Float.valueOf(var55_42);
                    v47[3] = this.d;
                    v47[2] = var4_4;
                    v47[1] = var5_3;
                    v47[0] = var6_2;
                    cf_0.g("\u00d0", (Object)v47, (long)-6312664630035818204L, (long)var2_5);
                    v48 = new Object[7];
                    v48[6] = var17_11;
                    v48[5] = cn_0.v;
                    v48[4] = Float.valueOf(var53_40 + var49_36 - 3.0f);
                    v48[3] = Float.valueOf(var56_43 + 0.5f);
                    v48[2] = Float.valueOf(var53_40 + 3.0f);
                    v48[1] = Float.valueOf(var56_43);
                    v48[0] = var4_4;
                    cf_0.g("\u00d0", (Object)v48, (long)-6306378501536238196L, (long)var2_5);
                    var57_44 = var53_40 + 3.0f;
                    if (var50_37 == false) break block84;
                    var60_45 = var52_39 + var48_35 - var46_33;
                    var59_46 = var60_45 - var41_28;
                    var58_47 = var59_46 - 3.0f - var40_27;
                    if (var31_18 == null) break block85;
                }
                var58_47 = var52_39 + var46_33;
                var59_46 = var58_47 + var40_27 + 3.0f;
            }
            v49 = new Object[1];
            v49[0] = var23_14;
            v50 = new Object[7];
            v50[6] = var29_17;
            v50[5] = var38_25;
            v50[4] = Float.valueOf(1.0f);
            v50[3] = Float.valueOf(var57_44);
            v50[2] = Float.valueOf(var58_47);
            v50[1] = var36_22;
            v50[0] = var4_4;
            cf_0.g("\u00a2", (Object)cf_0.g("\u00a2", (Object)cf_0.g("\u00e9", (long)-6306952466297279722L, (long)var2_5), (Object)v49, (long)-6306748864079594799L, (long)var2_5), (Object)v50, (long)-6312633391980815046L, (long)var2_5);
            v51 = new Object[1];
            v51[0] = var23_14;
            v52 = new Object[7];
            v52[6] = var29_17;
            v52[5] = cn_0.t;
            v52[4] = Float.valueOf(0.65f);
            v52[3] = Float.valueOf(var57_44 + (var42_29 - var43_30) - 0.5f);
            v52[2] = Float.valueOf(var59_46);
            v52[1] = cf_0.a("u", (int)15902, (long)(560089167049559722L ^ var2_5));
            v52[0] = var4_4;
            cf_0.g("\u00a2", (Object)cf_0.g("\u00a2", (Object)cf_0.g("\u00e9", (long)-6306952466297279722L, (long)var2_5), (Object)v51, (long)-6306748864079594799L, (long)var2_5), (Object)v52, (long)-6312633391980815046L, (long)var2_5);
            var60_45 = var57_44 + var42_29 + 1.0f + 4.0f;
            try {
                v53 = var50_37 != false ? var52_39 + 5.5f : var52_39 + var46_33;
            }
            catch (MatchException v54) {
                throw cf_0.g("\u00d0", (Object)v54, (long)-6312389118546806632L, (long)var2_5);
            }
            var61_48 = v53;
            try {
                v55 = var50_37 != false ? var52_39 + var48_35 - var46_33 : var52_39 + var48_35 - 5.5f;
            }
            catch (MatchException v56) {
                throw cf_0.g("\u00d0", (Object)v56, (long)-6312389118546806632L, (long)var2_5);
            }
            var62_49 = v55;
            var63_50 = (var62_49 - var61_48) / 24.0f;
            for (var64_51 = 0; var64_51 < cf_0.c("l", (int)2823, (long)(8805003214084754592L ^ var2_5)); ++var64_51) {
                block82: {
                    block83: {
                        block80: {
                            var65_52 = this.g[(this.h + var64_51) % cf_0.c("l", (int)2823, (long)(8805003214084754592L ^ var2_5))];
                            try {
                                try {
                                    try {
                                        if (var31_18 != null) break block79;
                                        v57 = var65_52;
                                        v58 = 0.0f;
                                        if (var31_18 != null) break block80;
                                    }
                                    catch (MatchException v59) {
                                        throw cf_0.g("\u00d0", (Object)v59, (long)-6312389118546806632L, (long)var2_5);
                                    }
                                    if (v57 <= v58) {
                                        continue;
                                    }
                                }
                                catch (MatchException v60) {
                                    throw cf_0.g("\u00d0", (Object)v60, (long)-6312389118546806632L, (long)var2_5);
                                }
                            }
                            catch (MatchException v61) {
                                throw cf_0.g("\u00d0", (Object)v61, (long)-6312389118546806632L, (long)var2_5);
                            }
                            v57 = 0.5f;
                            v58 = var65_52 / 20.0f * 3.5f;
                        }
                        var66_53 = v57 + v58;
                        var67_54 = var61_48 + (float)var64_51 * var63_50;
                        v62 = new Object[2];
                        v62[1] = var11_8;
                        v62[0] = Float.valueOf(var65_52);
                        var68_55 = cf_0.g("\u00d0", (Object)v62, (long)-6306232483579068023L, (long)var2_5);
                        try {
                            try {
                                v63 /* !! */  = var64_51;
                                if (var31_18 != null) break block82;
                                if (v63 /* !! */  != cf_0.c("l", (int)32148, (long)(5778685199501048374L ^ var2_5))) break block83;
                            }
                            catch (MatchException v64) {
                                throw cf_0.g("\u00d0", (Object)v64, (long)-6312389118546806632L, (long)var2_5);
                            }
                            v63 /* !! */  = (int)cf_0.c("l", (int)26749, (long)(3170983511234424790L ^ var2_5));
                            break block82;
                        }
                        catch (MatchException v65) {
                            throw cf_0.g("\u00d0", (Object)v65, (long)-6312389118546806632L, (long)var2_5);
                        }
                    }
                    v63 /* !! */  = (int)cf_0.c("l", (int)12773, (long)(622110465271985739L ^ var2_5));
                }
                var69_56 = v63 /* !! */ ;
                v66 = new Object[7];
                v66[6] = var17_11;
                v66[5] = new Color((int)cf_0.g("\u00a2", (Object)var68_55, (long)-6306279304513594408L, (long)var2_5), (int)cf_0.g("\u00a2", (Object)var68_55, (long)-6306452879501296581L, (long)var2_5), (int)cf_0.g("\u00a2", (Object)var68_55, (long)-6312795189079454705L, (long)var2_5), var69_56);
                v66[4] = Float.valueOf(var60_45);
                v66[3] = Float.valueOf(var67_54 + var63_50 - 0.2f);
                v66[2] = Float.valueOf(var60_45 - var66_53);
                v66[1] = Float.valueOf(var67_54 + 0.2f);
                v66[0] = var4_4;
                cf_0.g("\u00d0", (Object)v66, (long)-6306378501536238196L, (long)var2_5);
                if (var31_18 == null) continue;
            }
            v67 = new Object[2];
            v67[1] = Float.valueOf((float)var49_36);
            v67[0] = Float.valueOf(var48_35);
            cf_0.g("\u00a2", (Object)this, (Object)v67, (long)-6307071859990893999L, (long)var2_5);
        }
    }

    private static Method l(long l, long l2) {
        int n = cf_0.i(l, l2);
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
                clazz3 = cf_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cf_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cf_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        cf_0.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cf_0.j(3468005496809132L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cf_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cf_0.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cf_0.j(3468005496809132L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/cf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = cf_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x18A;
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
                throw new RuntimeException("dev/zprestige/prestige/cf", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cf_0.I[n2] = l4;
        }
        return I[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bg_0 bg_02) {
        block9: {
            CallSite callSite;
            block7: {
                cf_0 cf_02;
                block8: {
                    long l = v ^ 0x6CB5D360735FL;
                    CallSite callSite2 = cf_0.g("\u00d0", (long)4284977689448500179L, (long)l);
                    try {
                        if (!(cf_0.g("\u00a2", (Object)bg_02, (Object)new Object[0], (long)4281527842929228833L, (long)l) instanceof class_2761)) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw cf_0.g("\u00d0", (Object)matchException, (long)4281224401391217556L, (long)l);
                    }
                    callSite = cf_0.g("\u00d0", (long)4281084244380631343L, (long)l);
                    try {
                        cf_02 = this;
                        if (callSite2 != null) break block7;
                        if (cf_02.i <= cf_0.d("u", (int)16992, (long)(0x1B7363D4A993F892L ^ l))) break block8;
                    }
                    catch (MatchException matchException) {
                        throw cf_0.g("\u00d0", (Object)matchException, (long)4281224401391217556L, (long)l);
                    }
                    reference var7_5 = callSite - this.i;
                    try {
                        if (callSite2 != null) break block9;
                        if (var7_5 < cf_0.d("u", (int)23718, (long)(0x6B45B2E89C706652L ^ l))) break block8;
                    }
                    catch (MatchException matchException) {
                        throw cf_0.g("\u00d0", (Object)matchException, (long)4281224401391217556L, (long)l);
                    }
                    CallSite callSite3 = cf_0.g("\u00d0", (float)(20000.0f / (float)var7_5), (float)20.0f, (long)4284539786360434486L, (long)l);
                    this.k = (float)callSite3;
                    this.g[this.h] = (float)callSite3;
                    this.h = (this.h + 1) % cf_0.c("l", (int)2823, (long)(0x7A31B2A63DE05FACL ^ l));
                }
                cf_02 = this;
            }
            cf_02.i = (long)callSite;
        }
    }

    private static Color a(Object[] objectArray) {
        float f;
        long l;
        block13: {
            float f10;
            block14: {
                CallSite callSite;
                block11: {
                    block12: {
                        f10 = ((Float)objectArray[0]).floatValue();
                        l = (Long)objectArray[1];
                        l = v ^ l;
                        callSite = cf_0.g("\u00d0", (long)-5429071401995025396L, (long)l);
                        try {
                            try {
                                float f11 = f10 - 19.0f;
                                f = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                if (callSite != null) break block11;
                                if (f < 0) break block12;
                            }
                            catch (MatchException matchException) {
                                throw cf_0.g("\u00d0", (Object)matchException, (long)-5424961528635857845L, (long)l);
                            }
                            return new Color((int)cf_0.c("l", (int)9423, (long)(0x5F4A22A2465DFFB6L ^ l)), (int)cf_0.c("l", (int)21652, (long)(0x2B58CF45F9B90FEEL ^ l)), (int)cf_0.c("l", (int)9235, (long)(0x3B6A818D8983FF61L ^ l)));
                        }
                        catch (MatchException matchException) {
                            throw cf_0.g("\u00d0", (Object)matchException, (long)-5424961528635857845L, (long)l);
                        }
                    }
                    float f12 = f10 - 15.0f;
                    f = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (callSite != null) break block13;
                        if (f < 0) break block14;
                    }
                    catch (MatchException matchException) {
                        throw cf_0.g("\u00d0", (Object)matchException, (long)-5424961528635857845L, (long)l);
                    }
                    return new Color((int)cf_0.c("l", (int)4533, (long)(0x3B5148E3674E4AC6L ^ l)), (int)cf_0.c("l", (int)3510, (long)(0x6CBDA1E7872156C6L ^ l)), (int)cf_0.c("l", (int)1075, (long)(0x54555FCD7A4FDF45L ^ l)));
                }
                catch (MatchException matchException) {
                    throw cf_0.g("\u00d0", (Object)matchException, (long)-5424961528635857845L, (long)l);
                }
            }
            float f13 = f10 - 10.0f;
            f = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
        }
        try {
            if (f >= 0) {
                return new Color((int)cf_0.c("l", (int)30569, (long)(0x169A416730822C0AL ^ l)), (int)cf_0.c("l", (int)4320, (long)(0x2D1634597A3FCB9EL ^ l)), (int)cf_0.c("l", (int)25654, (long)(0x4FE8F128D3B6BF4AL ^ l)));
            }
        }
        catch (MatchException matchException) {
            throw cf_0.g("\u00d0", (Object)matchException, (long)-5424961528635857845L, (long)l);
        }
        return new Color((int)cf_0.c("l", (int)11653, (long)(0x54A436C48F976F2L ^ l)), (int)cf_0.c("l", (int)21849, (long)(0x663E2246E4400E26L ^ l)), (int)cf_0.c("l", (int)12064, (long)(0x2728EB994FBDF455L ^ l)));
    }

    @bP
    public void a(a5 a52) {
        block4: {
            long l = v ^ 0x362ECDDCEE3CL;
            CallSite callSite = cf_0.g("\u00d0", (long)-6479529661264963920L, (long)l);
            for (int i = 0; i < cf_0.c("l", (int)32423, (long)(0x161FD1009D1EB779L ^ l)); ++i) {
                try {
                    this.g[i] = 0.0f;
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw cf_0.g("\u00d0", (Object)matchException, (long)-6482179107515468041L, (long)l);
                }
            }
            this.h = 0;
            this.i = (long)cf_0.d("u", (int)12022, (long)(0x16D40965E6348965L ^ l));
            this.k = -1.0f;
            this.l = -1.0f;
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cf_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x18C3;
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
                throw new RuntimeException("dev/zprestige/prestige/cf", exception);
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
            cf_0.x[n2] = cf_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(45.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        cf_0.g("\u00a2", (Object)this, (Object)objectArray2, (long)-3383977950551408934L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = cf_0.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = cf_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cf_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cf_0.e(clazz3, string2, clazz2)) != null) {
                    cf_0.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cf_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cf_0.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cf_0.j(3468005496809132L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/cf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cf_0.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                cf_0.K[n] = clazz = Class.forName(L[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cf_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cf_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(cf_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cf_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


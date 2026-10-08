/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cn_0;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import org.joml.Matrix4f;

/*
 * Renamed from dev.zprestige.prestige.ce
 */
public class ce_0
extends b4 {
    private static final class_1792[] a;
    private static final String[] c;
    private static final int[] d;
    private static final long g;
    private static final long h;
    private static final int i;
    private final int[] j;
    private final int[] k;
    private final long[] l;
    private final class_1799[] m;
    private boolean n;
    private boolean q;
    private static final float o = 0.6f;
    private static final float p = 9.6f;
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

    public ce_0(long l) {
        long l2 = (l = v ^ l) ^ 0x4D5B75810BBDL;
        super((String)((Object)ce_0.a("i", (int)2419, (long)(0xA450497584AFB9BL ^ l))), (String)((Object)ce_0.a("i", (int)18370, (long)(0x31A8694E9CCEB52EL ^ l))), l2);
        this.j = new int[a.length];
        this.k = new int[a.length];
        this.l = new long[a.length];
        this.m = new class_1799[a.length];
        this.n = 0;
        this.q = 0;
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
                                ce_0.v = hc.a(5253311633651793413L, -7706457934121203330L, MethodHandles.lookup().lookupClass()).a(254690294648316L);
                                var31 = ce_0.v ^ 51045368360223L;
                                ce_0.K = new Object[97];
                                ce_0.L = new String[97];
                                ce_0.b();
                                ce_0.y = new HashMap<K, V>(13);
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
                                var29_3 = new String[8];
                                var27_4 = 0;
                                var26_5 = ",_\u00c2\\Z\u001cN#5\u00b6m\u009a\u00cd,\u00cbB\u0018[\u00f08\u00ccAF<>\u00d5\u0000%E\u0006\u00beeg \u00df\u0080\u00ff\u00daO\u00e8\u00f8\u0010K\u007f\u0005\u00fe\u00b0\u00aa\u00a7\u0018{%HI\u00e9\u00164\u00fe\u0010\u00d67^\u007fMr\u00b3\u00c3b\u0085$\u00a6\u00850]\u0018\u0010\u00ad&t\u00bc15\u00fe\u0081\u00a8|\u0001\n\u00f2w\u008f\u00f9\u0088\u00f0\u00fa\u00beO'0w\u00f7\n4\u00ae\u0087\u0088\u009b~%\u00c9j/\u00b3=\u00d2\u0084\u00db\u00d2\u0017\u00f2\u00f9P\u00d2\u008e\u001e\u00d8\u00e1\u00e1'R\u00fbJt\u00af\u009d\\\u00e3\u00b1h\u00e2\u00f3t\u00c7~\u00ee\u00c3\u00de\u00c4\u0081C\u00d4\u0082\r\u0085\u008f\u001dErj\u001dR\u00d6(%\u0088Z\u001e\u00dd\u0019\u0006\u00c6\u00b7vg\u00ba'M\u008b\u0093\u0085\u00b5\u008a\u0097zv\u000e\u00ca!\u000fJOV\u0091ov\u00cd\u009d\u00eeGy\u0090\u0086m\u0085kJ\u00f7>\u00c6p\u008d]\u0089\u00c3Q\u008cC\u00c9\u00fc\u00a3\u0006\u00b7U\u00b7\u00c8\u00aa\u00fd\u0005\u00b8";
                                var28_6 = ",_\u00c2\\Z\u001cN#5\u00b6m\u009a\u00cd,\u00cbB\u0018[\u00f08\u00ccAF<>\u00d5\u0000%E\u0006\u00beeg \u00df\u0080\u00ff\u00daO\u00e8\u00f8\u0010K\u007f\u0005\u00fe\u00b0\u00aa\u00a7\u0018{%HI\u00e9\u00164\u00fe\u0010\u00d67^\u007fMr\u00b3\u00c3b\u0085$\u00a6\u00850]\u0018\u0010\u00ad&t\u00bc15\u00fe\u0081\u00a8|\u0001\n\u00f2w\u008f\u00f9\u0088\u00f0\u00fa\u00beO'0w\u00f7\n4\u00ae\u0087\u0088\u009b~%\u00c9j/\u00b3=\u00d2\u0084\u00db\u00d2\u0017\u00f2\u00f9P\u00d2\u008e\u001e\u00d8\u00e1\u00e1'R\u00fbJt\u00af\u009d\\\u00e3\u00b1h\u00e2\u00f3t\u00c7~\u00ee\u00c3\u00de\u00c4\u0081C\u00d4\u0082\r\u0085\u008f\u001dErj\u001dR\u00d6(%\u0088Z\u001e\u00dd\u0019\u0006\u00c6\u00b7vg\u00ba'M\u008b\u0093\u0085\u00b5\u008a\u0097zv\u000e\u00ca!\u000fJOV\u0091ov\u00cd\u009d\u00eeGy\u0090\u0086m\u0085kJ\u00f7>\u00c6p\u008d]\u0089\u00c3Q\u008cC\u00c9\u00fc\u00a3\u0006\u00b7U\u00b7\u00c8\u00aa\u00fd\u0005\u00b8".length();
                                var25_7 = 16;
                                var24_8 = -1;
lbl32:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_8;
                                    v4 = var26_5.substring(v3, v3 + var25_7);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = ce_0.b(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    var26_5 = "\u008bE\u0091R\u00cf\u0091\u00f2\u007f\u00ff)\u0083\u00e7'\u00cc><\u00f3\u0017\u00cc\u00de\u00ea\u0085\u00daw\u0018\u00d4Q\u008b\t\u00ea\u00d7\"\u0019C\u0015,\u001b\u008dg\u00f6\u0004l&\u00caX\u00a5\u008e.-";
                                    var28_6 = "\u008bE\u0091R\u00cf\u0091\u00f2\u007f\u00ff)\u0083\u00e7'\u00cc><\u00f3\u0017\u00cc\u00de\u00ea\u0085\u00daw\u0018\u00d4Q\u008b\t\u00ea\u00d7\"\u0019C\u0015,\u001b\u008dg\u00f6\u0004l&\u00caX\u00a5\u008e.-".length();
                                    var25_7 = 24;
                                    var24_8 = -1;
lbl46:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_8;
                                        v4 = var26_5.substring(v6, v6 + var25_7);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = ce_0.b(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    break block27;
                                    break;
                                }
                            }
                            var30_9 = var22_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        ce_0.w = var29_3;
                        ce_0.x = new String[8];
                        ce_0.D = new HashMap<K, V>(13);
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
                        var17_12 = new long[10];
                        var14_13 = 0;
                        var15_14 = "\u001a\u008fiO\u0098\u009aE4\u0017F\u00e1N\u0015\u00db\u00ed\u00e77\u00c6\u0018\u0082\u001e\u00eb\u00b5\u00c3\f\u00b9\bRw)\u00fcfO3HTV8\u00a6\u001b\u0004!\u00fa\u00b2M\u00b5\u00c3\u0019\u00e6m)\u00c7z+\u00f5\u00a3\u00f30h\u00c0\u00c8\u0016\u00ce\u0006";
                        var16_15 = "\u001a\u008fiO\u0098\u009aE4\u0017F\u00e1N\u0015\u00db\u00ed\u00e77\u00c6\u0018\u0082\u001e\u00eb\u00b5\u00c3\f\u00b9\bRw)\u00fcfO3HTV8\u00a6\u001b\u0004!\u00fa\u00b2M\u00b5\u00c3\u0019\u00e6m)\u00c7z+\u00f5\u00a3\u00f30h\u00c0\u00c8\u0016\u00ce\u0006".length();
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
                            var15_14 = "^\u00f5\u00dceT_\u0095\u008f\u00b1\u0014k\u00f5J\u009d\u0003o";
                            var16_15 = "^\u00f5\u00dceT_\u0095\u008f\u00b1\u0014k\u00f5J\u009d\u0003o".length();
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
                ce_0.B = var17_12;
                ce_0.C = new Integer[10];
                ce_0.i = (int)ce_0.c("g", (int)29554, (long)(var31 ^ 7668361752683191371L));
                ce_0.J = new HashMap<K, V>(13);
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
                var6_22 = new long[4];
                var3_23 = 0;
                var4_24 = "hJ\u009b{\u00c9\u00b5\u0017\u009e\u00a0t\u00efMK\u0083k\u00e5";
                var5_25 = "hJ\u009b{\u00c9\u00b5\u0017\u009e\u00a0t\u00efMK\u0083k\u00e5".length();
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
                    var4_24 = "\u00faq\u00d2\u00f3X\u0091\u00d3\u00948o\u00e4t\u00ec>\u008b\u00da";
                    var5_25 = "\u00faq\u00d2\u00f3X\u0091\u00d3\u00948o\u00e4t\u00ec>\u008b\u00da".length();
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
        ce_0.H = var6_22;
        ce_0.I = new Long[4];
        ce_0.g = (long)ce_0.d("e", (int)4272, (long)(var31 ^ 9122540095415868265L));
        ce_0.h = (long)ce_0.d("e", (int)8289, (long)(var31 ^ 4801511805487082426L));
        ce_0.a = new class_1792[]{ce_0.g("\u00c8", (long)-4856179575564920654L, (long)var31), ce_0.g("\u00c8", (long)-4857033925209176844L, (long)var31), ce_0.g("\u00c8", (long)-4856979408207388797L, (long)var31), ce_0.g("\u00c8", (long)-4862522299799818668L, (long)var31)};
        ce_0.c = new String[]{ce_0.a("i", (int)23593, (long)(7704578464540742375L ^ var31)), ce_0.a("i", (int)29490, (long)(4430727449821969914L ^ var31)), ce_0.a("i", (int)877, (long)(9193912314217500070L ^ var31)), ce_0.a("i", (int)7965, (long)(3699947682721042898L ^ var31))};
        ce_0.d = new int[]{5, 2, (int)ce_0.c("g", (int)25577, (long)(3791148302437780691L ^ var31)), (int)ce_0.c("g", (int)30379, (long)(2333347213604395417L ^ var31))};
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
            case 0 -> 33;
            case 1 -> 35;
            case 2 -> 45;
            case 3 -> 30;
            case 4 -> 12;
            case 5 -> 0;
            case 6 -> 26;
            case 7 -> 39;
            case 8 -> 37;
            case 9 -> 54;
            case 10 -> 15;
            case 11 -> 51;
            case 12 -> 25;
            case 13 -> 43;
            case 14 -> 4;
            case 15 -> 18;
            case 16 -> 40;
            case 17 -> 57;
            case 18 -> 38;
            case 19 -> 50;
            case 20 -> 14;
            case 21 -> 47;
            case 22 -> 46;
            case 23 -> 34;
            case 24 -> 32;
            case 25 -> 8;
            case 26 -> 61;
            case 27 -> 23;
            case 28 -> 52;
            case 29 -> 53;
            case 30 -> 44;
            case 31 -> 59;
            case 32 -> 19;
            case 33 -> 49;
            case 34 -> 2;
            case 35 -> 36;
            case 36 -> 58;
            case 37 -> 11;
            case 38 -> 16;
            case 39 -> 48;
            case 40 -> 21;
            case 41 -> 42;
            case 42 -> 56;
            case 43 -> 6;
            case 44 -> 13;
            case 45 -> 20;
            case 46 -> 60;
            case 47 -> 28;
            case 48 -> 7;
            case 49 -> 9;
            case 50 -> 62;
            case 51 -> 17;
            case 52 -> 5;
            case 53 -> 10;
            case 54 -> 55;
            case 55 -> 29;
            case 56 -> 1;
            case 57 -> 27;
            case 58 -> 41;
            case 59 -> 31;
            case 60 -> 3;
            case 61 -> 63;
            case 62 -> 24;
            default -> 22;
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
        ce_0.L[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = K;
        K[0] = "\u0013|,\u000bd:\u0005|)Qw-\u00127*W{9\u0003p=@0+?";
        objectArray[1] = "rw\u001aB'&\u0007W\u0011M6izO\u0002J? \u0012";
        objectArray[2] = "C\u0003=\u0010-7U\u00038J> BH;L24S\u000f,[y$B";
        objectArray[3] = "\u000e\f\u0010kU\t\u0005\u0003\u0001$6\u0004\u0010\u000e\u000eO\u0003\u0006\u0001\u001d\u0012c\u0014\u000b";
        objectArray[4] = "&M3\r%\b&M$Q)\u0007<\u0006$O)\u0012;wt\u0012x";
        objectArray[5] = "0L#%\rs0L4y\u0001|*\u00074g\u0001i-v`?V";
        objectArray[6] = "\u0011\u0019[!Y7\u0011\u0019L}U8\u000bRLcU-\f#\u001e8\rg";
        objectArray[7] = "=>d9G\u0001=>seK\u000e'us{K\u001b \u0004! \u0013Z";
        objectArray[8] = "g7-jo\u001cg7:6c\u0013}|:(c\u0006z\rhr4D";
        objectArray[9] = Integer.TYPE;
        ce_0.L[9] = "java/lang/Integer";
        objectArray[10] = "*xl[.k*x{\u0007\"d03{\u0019\"q7B)Ms0";
        objectArray[11] = "#L\\PF\u001c5LY\nU\u000b\"\u0007Z\fY\u001f3@M\u001b\u0012\u000es";
        objectArray[12] = "{33B4o\u000e\u00138M% o\u001d3F!z\u001b";
        objectArray[13] = Void.TYPE;
        ce_0.L[13] = "java/lang/Void";
        objectArray[14] = "W/;\n\\YA/>PONVd=VCZG#*A\bMr";
        objectArray[15] = "bO}f+x\u0017ovi:7va}b>m\u0002";
        objectArray[16] = "Pr=e\u0001JFr8?\u0012]Q9;9\u001eI@~,.UYZ";
        objectArray[17] = "Z\u0013\u001cJM /3\u0017E\\oN=\u001cNX5:";
        objectArray[18] = Float.TYPE;
        ce_0.L[18] = "java/lang/Float";
        objectArray[19] = "5Os8fX@ox7w\u0017!as<sMU";
        objectArray[20] = "\ta~>\u000e\u0011\u001fa{d\u001d\u0006\b*xb\u0011\u0012\u0019mouZ\u0000(";
        objectArray[21] = "z\u000e.LDU\u000f.%CU\u001an .HQ@\u001a";
        objectArray[22] = "auF#\u0018f|`\u001e\u0001Ykdf";
        objectArray[23] = "e\u00017!\u0007Sn\u000e&nzK}\t/'";
        objectArray[24] = Character.TYPE;
        ce_0.L[24] = "java/lang/Character";
        objectArray[25] = "\u000flJ\r1f\u0004c[BRk\u0011e";
        objectArray[26] = Double.TYPE;
        ce_0.L[26] = "java/lang/Double";
        objectArray[27] = "a]\u001c~PFw]\u0019$CQ`\u0016\u001a\"OEqQ\r5\u0004UiQ\u000f>^\u0018UJ\u000f#^_b]";
        objectArray[28] = "&lD\u0013iu0lAIzb''BOvv6`UX=f\u0001";
        objectArray[29] = "H&H/\u0001*^&Mu\u0012=ImNs\u001e)X*YdU9m";
        objectArray[30] = "O\u001a\u0002c\nn::\tl\u001b![4\u0002g\u001f{/";
        objectArray[31] = "RH\u0016.n 'h\u001d!\u007foFf\u0016*{52";
        objectArray[32] = Boolean.TYPE;
        ce_0.L[32] = "java/lang/Boolean";
        objectArray[33] = "mWk\u00005H{WnZ&_l\u001cm\\*K}[zKa\\K";
        objectArray[34] = "]\b7eOo((<j^ I&7aZz=";
        objectArray[35] = "\r6-!\u0010ex\u0016&.\u0001*\u0019\u0018-%\u0005pm";
        objectArray[36] = "|U\u0002V\u000e#\tu\tY\u001flh{\u0002R\u001b6\u001c";
        objectArray[37] = "'?\u0003\u001fU0R\u001f\b\u0010D\u007f3\u0011\u0003\u001b@%G";
        objectArray[38] = "\bG\u0013~C\u0000}g\u0018qRO\u001ci\u0013zV\u0015h";
        objectArray[39] = "\u0001-'pilt\r,\u007fx#\u0015\u0003't|ya";
        objectArray[40] = "B0\u0016q:\"T0\u0013+)5C{\u0010-%!R<\u0007:n6M";
        objectArray[41] = "90dBRHL\u0010oMC\u0007-\u001edFG]Y";
        objectArray[42] = "\u0007\u0019HtU\u000f\u0011\u0019M.F\u0018\u0006RN(J\f\u0017\u0015Y?\u0001\u001b\u0007";
        objectArray[43] = "3g\u0017.<\u0018FG\u001c!-W'I\u0017*)\rS";
        objectArray[44] = "1\u000f\thp0D/\u0002ga\u007f%!\tle%Q";
        objectArray[45] = "7\\uVxK<Sd\u0019\u0005^.IfZ";
        objectArray[46] = Long.TYPE;
        ce_0.L[46] = "java/lang/Long";
        objectArray[47] = "Q\u001b\u0002d&+$;\tk7dE5\u0002`3>1";
        objectArray[48] = "aV@\u00064;wVE\\',`\u001dFZ+8qZQM`(W";
        objectArray[49] = "'H&(K\nRh-'ZE3f&,^\u001fG";
        objectArray[50] = "\u0015O\u0015T{\n\u001e@\u0004\u001b\u001a\u0004\u0015K\u0000A";
        objectArray[51] = "/_r\u0016T`/_eJXo5\u0014eTXz2e0\u000b\u0001";
        objectArray[52] = "\u0002\u001fdkc6w?odry\u00161dov#b";
        objectArray[53] = "\f6Dsm\u007fC3Lg\u0014q|a\u0005id~\u0004>\\i)i|i\f8-w\u001b>D0h\u0018";
        objectArray[54] = "\rh$059\u001f,*\u000f$\u0000_,?6$q\u001fr6cN";
        objectArray[55] = "#\u0010Nq\t\u0012#E\u001d)8IJ\u0010\u001dxHK2ODx\u0005\\J\u0018\u0014)\u0001B-O\\!D-";
        objectArray[56] = "?\u0013@\u0006u\u007fi\u001f\u001e\u0006\u001cweNJ\u0005K ;\u0019\u0012i'xgNE\u0014'~eI";
        objectArray[57] = "g\bCk[P1\u0004\u001dk2X=UIhe\u000fb\b\u0012\u0004@I1ZF=\u000e\b&C";
        objectArray[58] = "w\u001fmap-w\u001eaq\u0017>)\u00108t@`rMc\u0018*01\u0001-\"nh7E";
        objectArray[59] = "\u0006Y\u0003'\u0010>\u0002\\\u0005{nfl\u001aPx\u001ei\u0014E\txS~lOQ%R}\u0014G\na\u000f\u000f";
        objectArray[60] = "g\b}\u0000A'h_<\b=?WX:\u0001M8/\u0007c\u0001\u0000/WP3P\u000410\u0007{XA^";
        objectArray[61] = ";$O@',`o^SV4jhTW:\u00068%\f\u0001VlgmHAl(?k\f0";
        objectArray[62] = "3KU\u0014=\u00158XHG\u0005D^\u0010\u0011MuN&OHM8Y^GP\u00114D#L[\u001c}(";
        objectArray[63] = "Lg}nD'\u0013j}r|?Jjld;/#n+d\f+Dewx\u0004ALg}nD'\u0013j}r|";
        objectArray[64] = "^LsfrW^Jqa\u0019D\u0004@tgN\u0014]\u0014*\u000b'Z_W-y&F\fD";
        objectArray[65] = "U\u000ebB:\u0017PY{\u001eB\u001bT\u0002\u0018\u001e~\u0003\r\u0005h\u0003<\u0000^dyC?FT\u0014d\u0001<\u00155\u0005$\u0002z\u001fE\u0018f\u0001)~";
        objectArray[66] = "D\u00048Rb[D\u0002:U\tC\u0012\u0019;XeqD\\f\u00039&B\u0001=[4\u0017FT0X\t";
        objectArray[67] = "\u0019DkYy\u001b\u0003\u0005{\u0016\u000b\u0015{\u001eqPq\u0003\u0003CfTo";
        objectArray[68] = "\nXd?'M\nYh/@^TW1*\u0017\u0000\t\u0004nF}PLF$|9\bJ\u0002";
        objectArray[69] = "C&\u0016vg\u000b\u001ej\u001az\u001cO !\u0013dlWX~Jd!@ )\u001a5%^G~R=`1";
        objectArray[70] = "\u0014\u000e2T\by\u001bYs\\tl$^uU\u0004f\\\u0001,UIq$\u0002sI\u001f9]\u001f)P\u001b\u0000";
        objectArray[71] = "c\n@#\u000f,dD\u001cve=\u0005\u0003D*\u00151}\\\u001d*X&\u0005T\u0005vT;x_\u000e{\u001dW";
        objectArray[72] = "\u001dy[+R>\u001dxW;5-Cv\u000e>bs\u0018+ZR\b#[g\u001bhL{]#";
        objectArray[73] = "\u001b\u001eP$\u0006\u0006F\tT:{\u0017yAP>\u000b\u0018\u0001\u001e\t>F\u000fy\u001bVc\t\u0005CF\u001ao\u0005~";
        objectArray[74] = "I*<f[N@\u007f;d0Pp|e\u007f@L\b#<\u007f\r[ptl.\tE\u0017#$&L*";
        objectArray[75] = ".\u007fZ|_\u0006.~Vl8\u0015pp\u000fioK*%R\u0005\u0005\u001bha\u001a?ACn%";
        objectArray[76] = "\u0017ikV\u001f\\\u0012>r\ngO\u001ee}\f\u00025\u0016?lS\u0006E\u000b}o\u0000g";
        objectArray[77] = "$Fj\u0004d\u0002+\u0011+\f\u0018\u0012\u0014\u0016-\u0005h\u001dlIt\u0005%\n\u0014\u001e$T!\u0014sIl\\d{";
        objectArray[78] = "Z]:kI\u0012\u0005P:wq\u0010XR9p\u0011t\u000bDlvL\u0006\nX?eq";
        objectArray[79] = "'GH.PR2\fU2>A#\fD;UO!\u0007-8\u0005Gi\u000bLv\\O4v\u0013:\u0004Rd\u0004\u0012&WAY\u0004\u0016%\u000eU8JO-S(g\u0006\u00170\u0003Zf\u001aD#>\u0016)LWwL\u00175\u001fDJ\u000f\u0019hOB-XQ`\n-";
        objectArray[80] = "x6h\u0016+_';h\n\u0013G~;y\u001cTW\u0017atKi\u0004e`h\u0018z9x6h\u0016+_';h\n\u0013";
        objectArray[81] = "/\u0004:#7Z5E*lEAML(k?F*\u0003-c+";
        objectArray[82] = "\u0019Qz\u00074KD\u001dv\u000bO\u001azV\u007f\u0015?\u0017\u0002\t&\u0015r\u0000z\u0003~Hs\u0003\u0002\u000b%\f.q";
        objectArray[83] = "O%]\u000f3\u0003Hk\u0001ZY\u0011),Y\u0006)\u001eQs\u0000\u0006d\t)p_\u001a2APm\u0005\u00036x";
        objectArray[84] = "\t\fFW\u001dnT@J[f=j\u000bCE\u00162\u0012T\u001aE[%j^B\u0018Z&\u0012V\u0019\\\u0007T";
        objectArray[85] = "\u000fjyi~g\u0006?~k\u0015j6?(a-fV~c-/\u0003\f5i(pcM~%*\u0015";
        objectArray[86] = "g\u0013:7]*g\u001580621\u000e9=Z\u0000bJfk6kl\t)+K0'\u0018:Z";
        objectArray[87] = ".cFP\u0005C;,\u001c\n5\u0019T%\u001aTE\u0014,zCT\b\u0003T-\u0013\u0005\f\u001d3z[\rIr";
        objectArray[88] = "-3MSp\u0014nrLP\u001a\u0019Qq\u0016^j\u0012).O^'\u0005Qy\u001f\u000f#\u001b6.W\u0007ft";
        objectArray[89] = "\u0011FIt(?\u0015\u0013Dw\u0015kA^OwyY\u0011\u001e\u0014 \u00150\\\u0018U-g1@KF\u0010)>WR^mruFA/";
        objectArray[90] = "5/;\nht0x\"V\u0010f4#AV,`m$1Knc>E \u000bm%45=InvU";
        objectArray[91] = "k0%V\t\u0013dgd^u\u0001[`bW\u0005\f#?;WH\u001b[<dK\u001eS\"!>R\u001aj";
        objectArray[92] = "tTt^UK}\u0001s\\>FM\u0002-GNI5]tG\u0003^M\u0005e\u001dD\u0012?\u0004yNW/";
        objectArray[93] = "K(\u0016Iky\u0010c\u0007Z\u001aa\u001ad\r^vSH)Q\u0006\u001a:\u0007\"\u0017\u0004h;\u001bq\u00049";
        objectArray[94] = "i)B%v\u000e|b_9\u0018\u001fjb],~\bKyB,]\u0015s|F:\u0018\nef[&&N+}FA";
        objectArray[95] = "\u000e\u0012H\u0001\u0006FS^D\r}\u0003m\u0015M\u0013\r\u001a\u0015J\u0014\u0013@\rm\u001dDBD\u0013\nJ\fJ\u0001|";
        Object[] objectArray2 = objectArray;
        objectArray[96] = "MW gG\u0003\u0012Z {\u007f\u000eBW6I\u0003e\u001cNvzB\u0017\u001dR%i\u007f\u0005\u0018S<j\u0018\u000eDO4\u0000";
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

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ce_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == 'c' || c == '\u00c8' || c == '\u00c9') {
                field = ce_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ce_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'b' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ce" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ce_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53B0;
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
                throw new RuntimeException("dev/zprestige/prestige/ce", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ce_0.C[n2] = n3;
        }
        return C[n2];
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ce_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ce_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ce_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ce_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Object[] objectArray) {
        Object object;
        block34: {
            float f;
            float f10;
            float f11;
            Object object2;
            float f12;
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            CallSite callSite4;
            CallSite callSite5;
            CallSite callSite6;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            long l9;
            long l10;
            long l11;
            Matrix4f matrix4f;
            gK gK2;
            aq_0 aq_02;
            block30: {
                void var38_26;
                aq_02 = (aq_0)objectArray[0];
                gK2 = (gK)objectArray[1];
                matrix4f = (Matrix4f)objectArray[2];
                l11 = (Long)objectArray[3];
                long l12 = l11;
                l10 = l12 ^ 0x7876565874AFL;
                l9 = l12 ^ 0x56B4B80BF914L;
                l8 = l12 ^ 0x194A66AD9C40L;
                l7 = l12 ^ 0x51117395139CL;
                l6 = l12 ^ 0x5D6649FEB165L;
                l5 = l12 ^ 0x77FE815D5D37L;
                l4 = l12 ^ 0x29CA0C560F0CL;
                l3 = l12 ^ 0x3A9DFE20EA8BL;
                long l13 = l12 ^ 0x178CB649295DL;
                long l14 = l12 ^ 0x31240AA31D80L;
                l2 = l12 ^ 0x57D19E355E96L;
                l = l12 ^ 0x5BE4B21DC642L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l13;
                ce_0.g("\u00d9", (Object)this, (Object)objectArray2, (long)-6312642370994244270L, (long)l11);
                callSite6 = ce_0.a("i", (int)2419, (long)(0xA452C0F0BAF9342L ^ l11));
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l5;
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l14;
                callSite5 = ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray3, (long)-6312896140120088096L, (long)l11), (Object)objectArray4, (long)-6313237778183891001L, (long)l11);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = Float.valueOf(1.0f);
                objectArray5[0] = Float.valueOf((float)callSite5);
                callSite4 = ce_0.g("b", (Object)objectArray5, (long)-6307131724136290092L, (long)l11);
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = Float.valueOf(0.9f);
                objectArray6[0] = Float.valueOf((float)callSite5);
                callSite3 = ce_0.g("b", (Object)objectArray6, (long)-6307131724136290092L, (long)l11);
                callSite2 = ce_0.g("b", (long)-6306218477422614222L, (long)l11);
                Object[] objectArray7 = new Object[1];
                objectArray7[0] = l5;
                Object[] objectArray8 = new Object[2];
                objectArray8[1] = l6;
                objectArray8[0] = callSite6;
                callSite = ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray7, (long)-6312896140120088096L, (long)l11), (Object)objectArray8, (long)-6313106747280317961L, (long)l11);
                f12 = 5.5f + callSite + 5.5f;
                boolean n = false;
                while (var38_26 < a.length) {
                    block29: {
                        block31: {
                            Object[] objectArray9 = new Object[1];
                            objectArray9[0] = l5;
                            Object[] objectArray10 = new Object[2];
                            objectArray10[1] = l6;
                            objectArray10[0] = ce_0.g("b", (int)this.j[var38_26], (long)-6313369656188339253L, (long)l11);
                            reference callSite7 = ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray9, (long)-6312896140120088096L, (long)l11), (Object)objectArray10, (long)-6313106747280317961L, (long)l11) * 0.9f;
                            float callSite8 = 18.1f + callSite7 + 5.5f;
                            try {
                                try {
                                    if (callSite2 != null) break block29;
                                    object2 = callSite8;
                                    f11 = f12;
                                    if (callSite2 != null) break block30;
                                }
                                catch (MatchException matchException) {
                                    throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                                }
                                if (!(object2 > f11)) break block31;
                            }
                            catch (MatchException matchException) {
                                throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                            }
                            f12 = callSite8;
                        }
                        ++var38_26;
                    }
                    if (callSite2 == null) continue;
                }
                object2 = callSite4 + 3.0f + callSite3 * (float)a.length;
                f11 = 3.0f;
            }
            reference var38_27 = object2 + f11;
            CallSite callSite7 = ce_0.g("\u00d9", (Object)this, (Object)new Object[0], (long)-6311804664727949331L, (long)l11);
            CallSite callSite8 = ce_0.g("\u00d9", (Object)this, (Object)new Object[0], (long)-6313848538197841377L, (long)l11);
            Object[] objectArray11 = new Object[2];
            objectArray11[1] = Float.valueOf((float)var38_27);
            objectArray11[0] = Float.valueOf(f12);
            ce_0.g("\u00d9", (Object)this, (Object)objectArray11, (long)-6306914413982317299L, (long)l11);
            float f13 = this.e;
            float f14 = this.f;
            Object[] objectArray12 = new Object[10];
            objectArray12[9] = l9;
            objectArray12[8] = Float.valueOf(4.0f);
            objectArray12[7] = 5;
            objectArray12[6] = Float.valueOf((float)var38_27);
            objectArray12[5] = Float.valueOf(f12);
            objectArray12[4] = Float.valueOf(f14);
            objectArray12[3] = Float.valueOf(f13);
            objectArray12[2] = matrix4f;
            objectArray12[1] = gK2;
            objectArray12[0] = aq_02;
            ce_0.g("b", (Object)objectArray12, (long)-6313922401199525143L, (long)l11);
            Object[] objectArray13 = new Object[10];
            objectArray13[9] = l10;
            objectArray13[8] = Float.valueOf(4.0f);
            objectArray13[7] = cn_0.r;
            objectArray13[6] = Float.valueOf((float)var38_27);
            objectArray13[5] = Float.valueOf(f12);
            objectArray13[4] = Float.valueOf(f14);
            objectArray13[3] = Float.valueOf(f13);
            objectArray13[2] = matrix4f;
            objectArray13[1] = gK2;
            objectArray13[0] = aq_02;
            ce_0.g("b", (Object)objectArray13, (long)-6313006777032389771L, (long)l11);
            float f15 = f14 + 3.0f;
            try {
                f10 = callSite8 != false ? f13 + f12 - 5.5f - callSite : f13 + 5.5f;
            }
            catch (MatchException matchException) {
                throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
            }
            float f16 = f = f10;
            for (int f18 = 0; f18 < ce_0.g("\u00d9", (Object)callSite6, (long)-6312373668864983717L, (long)l11); ++f18) {
                reference v19;
                CallSite callSite10;
                block32: {
                    block33: {
                        callSite10 = ce_0.g("b", (char)ce_0.g("\u00d9", (Object)callSite6, (int)f18, (long)-6309992411885098609L, (long)l11), (long)-6306824383664021360L, (long)l11);
                        try {
                            try {
                                v19 = callSite8;
                                if (callSite2 != null) break block32;
                                if (v19 == false) break block33;
                            }
                            catch (MatchException matchException) {
                                throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                            }
                            v19 = ce_0.g("\u00d9", (Object)callSite6, (long)-6312373668864983717L, (long)l11) - true - f18;
                            break block32;
                        }
                        catch (MatchException matchException) {
                            throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                        }
                    }
                    v19 = (reference)f18;
                }
                Object object3 = v19;
                Object[] objectArray14 = new Object[1];
                objectArray14[0] = l5;
                Object[] objectArray15 = new Object[1];
                objectArray15[0] = l8;
                Object[] objectArray16 = new Object[4];
                objectArray16[3] = l4;
                objectArray16[2] = (int)(ce_0.c("g", (int)17651, (long)(0x45EF55818ACF3F34L ^ l11)) + object3);
                objectArray16[1] = (int)ce_0.c("g", (int)8555, (long)(0x779FB6ABB998DAA4L ^ l11));
                objectArray16[0] = ce_0.g("b", (Object)objectArray15, (long)-6306756482304095316L, (long)l11);
                Object[] objectArray17 = new Object[6];
                objectArray17[5] = l2;
                objectArray17[4] = ce_0.g("b", (Object)objectArray16, (long)-6311893343658225390L, (long)l11);
                objectArray17[3] = Float.valueOf(f15);
                objectArray17[2] = Float.valueOf(f16);
                objectArray17[1] = callSite10;
                objectArray17[0] = matrix4f;
                ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray14, (long)-6312896140120088096L, (long)l11), (Object)objectArray17, (long)-6312014551201674467L, (long)l11);
                Object[] objectArray18 = new Object[1];
                objectArray18[0] = l5;
                Object[] objectArray19 = new Object[2];
                objectArray19[1] = l6;
                objectArray19[0] = callSite10;
                f16 += ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray18, (long)-6312896140120088096L, (long)l11), (Object)objectArray19, (long)-6313106747280317961L, (long)l11);
                if (callSite2 == null) continue;
            }
            float f17 = f14 + callSite4 - 0.5f;
            Object[] objectArray20 = new Object[7];
            objectArray20[6] = l7;
            objectArray20[5] = cn_0.v;
            objectArray20[4] = Float.valueOf(f17 + 0.5f);
            objectArray20[3] = Float.valueOf(f13 + f12 - 5.5f);
            objectArray20[2] = Float.valueOf(f17);
            objectArray20[1] = Float.valueOf(f13 + 5.5f);
            objectArray20[0] = matrix4f;
            ce_0.g("b", (Object)objectArray20, (long)-6306292702656689077L, (long)l11);
            CallSite callSite9 = ce_0.g("b", (long)-6313493127818659335L, (long)l11);
            int n = (int)ce_0.g("b", (double)255.0, (double)(170.0 + 85.0 * ce_0.g("b", (double)((double)callSite9 * 0.012), (long)-6313806999710996627L, (long)l11)), (long)-6312289691161866134L, (long)l11);
            float f18 = f14 + callSite4 + 3.0f;
            for (int i = 0; i < a.length; ++i) {
                float f19;
                float f20;
                float f21;
                float f22;
                CallSite callSite10;
                Color color;
                block39: {
                    block38: {
                        Color color2;
                        int n2;
                        block37: {
                            block36: {
                                block35: {
                                    try {
                                        try {
                                            try {
                                                object = this.n;
                                                if (callSite2 != null) break block34;
                                                if (callSite2 != null) break block35;
                                            }
                                            catch (MatchException matchException) {
                                                throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                                            }
                                            if (object == false) break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                                        }
                                        n2 = this.j[i];
                                    }
                                    catch (MatchException matchException) {
                                        throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block37;
                                        if (n2 >= d[i]) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                                    }
                                    n2 = 1;
                                    break block37;
                                }
                                catch (MatchException matchException) {
                                    throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                                }
                            }
                            n2 = 0;
                        }
                        int n3 = n2;
                        try {
                            color2 = n3 != 0 ? new Color((int)ce_0.c("g", (int)32619, (long)(0x5C8F773ABB9704A9L ^ l11)), (int)ce_0.c("g", (int)23961, (long)(0x5E8936B4257B2659L ^ l11)), (int)ce_0.c("g", (int)15951, (long)(0x696FDF496109458EL ^ l11)), n) : cn_0.s;
                        }
                        catch (MatchException matchException) {
                            throw ce_0.g("b", (Object)matchException, (long)-6313139157015588917L, (long)l11);
                        }
                        color = color2;
                        callSite10 = ce_0.g("b", (int)this.j[i], (long)-6313369656188339253L, (long)l11);
                        Object[] objectArray21 = new Object[1];
                        objectArray21[0] = l5;
                        Object[] objectArray22 = new Object[2];
                        objectArray22[1] = l6;
                        objectArray22[0] = callSite10;
                        reference var55_48 = ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray21, (long)-6312896140120088096L, (long)l11), (Object)objectArray22, (long)-6313106747280317961L, (long)l11) * 0.9f;
                        f22 = f18 + (callSite3 - callSite5 * 0.9f) / 2.0f;
                        f21 = f18 + (callSite3 - 9.6f) / 2.0f;
                        if (callSite8 == false) break block38;
                        f20 = f13 + f12 - 5.5f - 9.6f;
                        f19 = f20 - 3.0f - var55_48;
                        if (callSite2 == null) break block39;
                    }
                    f20 = f13 + 5.5f;
                    f19 = f20 + 9.6f + 3.0f;
                }
                Object[] objectArray23 = new Object[6];
                objectArray23[5] = l3;
                objectArray23[4] = matrix4f;
                objectArray23[3] = Float.valueOf(0.6f);
                objectArray23[2] = Float.valueOf(f21);
                objectArray23[1] = Float.valueOf(f20);
                objectArray23[0] = this.m[i];
                ce_0.g("b", (Object)objectArray23, (long)-6313311426376280721L, (long)l11);
                Object[] objectArray24 = new Object[1];
                objectArray24[0] = l5;
                Object[] objectArray25 = new Object[7];
                objectArray25[6] = l;
                objectArray25[5] = color;
                objectArray25[4] = Float.valueOf(0.9f);
                objectArray25[3] = Float.valueOf(f22);
                objectArray25[2] = Float.valueOf(f19);
                objectArray25[1] = callSite10;
                objectArray25[0] = matrix4f;
                ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)-6312170496411043739L, (long)l11), (Object)objectArray24, (long)-6312896140120088096L, (long)l11), (Object)objectArray25, (long)-6313565624850704883L, (long)l11);
                f18 += callSite3;
                if (callSite2 == null) continue;
            }
            object = callSite7;
        }
        if (object != false) {
            // empty if block
        }
    }

    private static Method l(long l, long l2) {
        int n = ce_0.i(l, l2);
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
                clazz3 = ce_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ce_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ce_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ce_0.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ce_0.j(3564334898431646L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ce_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ce_0.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ce_0.j(3564334898431646L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/ce" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = ce_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7751;
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
                throw new RuntimeException("dev/zprestige/prestige/ce", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            ce_0.I[n2] = l4;
        }
        return I[n2];
    }

    private static int a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        int n;
        long l;
        class_1792 class_17922;
        block7: {
            class_17922 = (class_1792)objectArray[0];
            l = (Long)objectArray[1];
            l = v ^ l;
            n = 0;
            CallSite callSite3 = ce_0.g("b", (long)351724582742312360L, (long)l);
            int n2 = 0;
            while (n2 <= ce_0.c("g", (int)31578, (long)(0x7660F81087D82C04L ^ l))) {
                block6: {
                    block8: {
                        CallSite callSite4 = ce_0.g("\u00d9", (Object)ce_0.g("\u00d9", (Object)ce_0.g("X", (Object)b, (long)351900642696942535L, (long)l), (long)359314427018940335L, (long)l), (int)n2, (long)358735927501251289L, (long)l);
                        try {
                            try {
                                if (callSite3 != null) break block6;
                                callSite2 = callSite4;
                                if (callSite3 != null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw ce_0.g("b", (Object)matchException, (long)358429187874399057L, (long)l);
                            }
                            if (ce_0.g("\u00d9", (Object)callSite2, (long)352216652649660905L, (long)l) != class_17922) break block8;
                        }
                        catch (MatchException matchException) {
                            throw ce_0.g("b", (Object)matchException, (long)358429187874399057L, (long)l);
                        }
                        n += ce_0.g("\u00d9", (Object)callSite4, (long)359002872755167529L, (long)l);
                    }
                    ++n2;
                }
                if (callSite3 == null) continue;
            }
            callSite2 = ce_0.g("\u00d9", (Object)ce_0.g("X", (Object)b, (long)351900642696942535L, (long)l), (long)358522713890044149L, (long)l);
        }
        if (ce_0.g("\u00d9", (Object)(callSite = callSite2), (long)352216652649660905L, (long)l) == class_17922) {
            n += ce_0.g("\u00d9", (Object)callSite, (long)359002872755167529L, (long)l);
        }
        return n;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3246;
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
                throw new RuntimeException("dev/zprestige/prestige/ce", exception);
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
            ce_0.x[n2] = ce_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block45: {
            block44: {
                block43: {
                    block42: {
                        block41: {
                            block40: {
                                v0 = var2_2 = ce_0.v ^ 121797211908810L;
                                var4_3 = v0 ^ 75004687216166L;
                                var6_4 = v0 ^ 114649049863664L;
                                var8_5 = ce_0.g("b", (long)4274635624672262683L, (long)var2_2);
                                try {
                                    try {
                                        v1 = ce_0.b;
                                        if (var8_5 != null) break block40;
                                        if (ce_0.g("X", (Object)v1, (long)4274248177166576756L, (long)var2_2) != null) {
                                        }
                                        ** GOTO lbl22
                                    }
                                    catch (MatchException v2) {
                                        throw ce_0.g("b", (Object)v2, (long)4272359849155861730L, (long)var2_2);
                                    }
                                    v1 = ce_0.b;
                                }
                                catch (MatchException v3) {
                                    throw ce_0.g("b", (Object)v3, (long)4272359849155861730L, (long)var2_2);
                                }
                            }
                            try {
                                if (ce_0.g("X", (Object)v1, (long)4274324278621520552L, (long)var2_2) != null) break block41;
lbl22:
                                // 2 sources

                                return;
                            }
                            catch (MatchException v4) {
                                throw ce_0.g("b", (Object)v4, (long)4272359849155861730L, (long)var2_2);
                            }
                        }
                        for (var9_6 = 0; var9_6 < ce_0.a.length; ++var9_6) {
                            try {
                                v5 = new Object[2];
                                v5[1] = var4_3;
                                v5[0] = ce_0.a[var9_6];
                                this.j[var9_6] = (int)ce_0.g("b", (Object)v5, (long)4271686734633506451L, (long)var2_2);
                                if (var8_5 == null) {
                                    if (var8_5 == null) continue;
                                    break;
                                }
                                break block42;
                            }
                            catch (MatchException v6) {
                                throw ce_0.g("b", (Object)v6, (long)4272359849155861730L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                v7 /* !! */  = ce_0.g("X", (Object)ce_0.g("X", (Object)ce_0.b, (long)4274248177166576756L, (long)var2_2), (long)4273704885539382288L, (long)var2_2);
                                if (var8_5 != null) break block43;
                                if (v7 /* !! */  >= ce_0.c("g", (int)29117, (long)(8483163656341395799L ^ var2_2))) break block42;
                            }
                            catch (MatchException v8) {
                                throw ce_0.g("b", (Object)v8, (long)4272359849155861730L, (long)var2_2);
                            }
                            ce_0.g("b", (Object)this.j, (int)0, (Object)this.k, (int)0, (int)this.j.length, (long)4273033087402366102L, (long)var2_2);
                            this.n = 0;
                            return;
                        }
                        catch (MatchException v9) {
                            throw ce_0.g("b", (Object)v9, (long)4272359849155861730L, (long)var2_2);
                        }
                    }
                    try {
                        v10 = this;
                        if (var8_5 != null) break block44;
                        v7 /* !! */  = (CallSite)v10.n;
                    }
                    catch (MatchException v11) {
                        throw ce_0.g("b", (Object)v11, (long)4272359849155861730L, (long)var2_2);
                    }
                }
                try {
                    if (v7 /* !! */  != false) break block45;
                    ce_0.g("b", (Object)this.j, (int)0, (Object)this.k, (int)0, (int)this.j.length, (long)4273033087402366102L, (long)var2_2);
                    v10 = this;
                }
                catch (MatchException v12) {
                    throw ce_0.g("b", (Object)v12, (long)4272359849155861730L, (long)var2_2);
                }
            }
            v10.n = 1;
            return;
        }
        var9_7 = ce_0.g("b", (long)4271865132274297552L, (long)var2_2);
        var11_8 = 0;
        while (var11_8 < ce_0.a.length) {
            block48: {
                block49: {
                    block50: {
                        block47: {
                            block46: {
                                var12_9 = ce_0.d[var11_8];
                                try {
                                    try {
                                        try {
                                            v13 = this.k[var11_8];
                                            v14 = var12_9;
                                            if (var8_5 != null) break block46;
                                            if (v13 >= v14) {
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        catch (MatchException v15) {
                                            throw ce_0.g("b", (Object)v15, (long)4272359849155861730L, (long)var2_2);
                                        }
                                        v13 = this.j[var11_8];
                                        if (var8_5 != null) break block47;
                                    }
                                    catch (MatchException v16) {
                                        throw ce_0.g("b", (Object)v16, (long)4272359849155861730L, (long)var2_2);
                                    }
                                    v14 = var12_9;
                                }
                                catch (MatchException v17) {
                                    throw ce_0.g("b", (Object)v17, (long)4272359849155861730L, (long)var2_2);
                                }
                            }
                            if (v13 < v14) {
                                v13 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v13 = 0;
                            }
                        }
                        var13_10 = v13;
                        try {
                            try {
                                try {
                                    try {
                                        if (var8_5 != null) break block48;
                                        if (var13_10 == 0) break block49;
                                    }
                                    catch (MatchException v18) {
                                        throw ce_0.g("b", (Object)v18, (long)4272359849155861730L, (long)var2_2);
                                    }
                                    v19 = var9_7;
                                    v20 = this.l[var11_8];
                                    if (var8_5 != null) break block50;
                                }
                                catch (MatchException v21) {
                                    throw ce_0.g("b", (Object)v21, (long)4272359849155861730L, (long)var2_2);
                                }
                                if (v19 >= v20) {
                                }
                                break block49;
                            }
                            catch (MatchException v22) {
                                throw ce_0.g("b", (Object)v22, (long)4272359849155861730L, (long)var2_2);
                            }
                            v23 = new Object[5];
                            v23[4] = var6_4;
                            v23[3] = x_0.WARNING;
                            v23[2] = (long)ce_0.d("e", (int)2838, (long)(5934104436263307035L ^ var2_2));
                            v23[1] = ce_0.c[var11_8] + (String)ce_0.a("i", (int)20921, (long)(4152375033715415200L ^ var2_2)) + this.j[var11_8] + "/" + var12_9;
                            v23[0] = ce_0.a("i", (int)10417, (long)(330042763246674350L ^ var2_2));
                            ce_0.g("\u00d9", (Object)ce_0.g("\u00c8", (long)4272641265751950518L, (long)var2_2), (Object)v23, (long)4274586995919757024L, (long)var2_2);
                            v19 = ce_0.d("e", (int)15382, (long)(851968940900053017L ^ var2_2));
                            v20 = (long)(ce_0.g("b", (long)4272819513445362223L, (long)var2_2) * 5000.0);
                        }
                        catch (MatchException v24) {
                            throw ce_0.g("b", (Object)v24, (long)4272359849155861730L, (long)var2_2);
                        }
                    }
                    var14_11 = v19 + v20;
                    this.l[var11_8] = (long)(var9_7 + var14_11);
                }
                this.k[var11_8] = this.j[var11_8];
                ++var11_8;
            }
            if (var8_5 == null) continue;
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ce_0.a(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/ce" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(220.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        ce_0.g("\u00d9", (Object)this, (Object)objectArray2, (long)-3383767513558142916L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = ce_0.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = ce_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ce_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ce_0.e(clazz3, string2, clazz2)) != null) {
                    ce_0.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ce_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ce_0.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ce_0.j(3564334898431646L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/ce" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ce_0.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                ce_0.K[n] = clazz = Class.forName(L[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void r(Object[] objectArray) {
        block8: {
            int n;
            CallSite callSite;
            long l;
            block6: {
                int n2;
                block7: {
                    l = (Long)objectArray[0];
                    l = v ^ l;
                    callSite = ce_0.g("b", (long)5815134309270196730L, (long)l);
                    try {
                        n2 = this.q;
                        if (callSite != null) break block6;
                        if (n2 == 0) break block7;
                    }
                    catch (MatchException matchException) {
                        throw ce_0.g("b", (Object)matchException, (long)5812870647415502595L, (long)l);
                    }
                    return;
                }
                n2 = n = 0;
            }
            while (n < a.length) {
                try {
                    this.m[n] = new class_1799((class_1935)a[n]);
                    ++n;
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block8;
                }
                catch (MatchException matchException) {
                    throw ce_0.g("b", (Object)matchException, (long)5812870647415502595L, (long)l);
                }
            }
            this.q = 1;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ce_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ce_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(ce_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ce_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bW;
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
import net.minecraft.class_310;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b_
extends b4 {
    private static final int a;
    private static final long c;
    private static final float m = 100.0f;
    private bW d;
    private final float[] g;
    private int h;
    private long i;
    private long j;
    private float k;
    private float l;
    private float o;
    private float p;
    private float t;
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

    public b_(long l) {
        long l2 = (l = v ^ l) ^ 0x3960C3CC5FADL;
        super((String)((Object)b_.a("w", (int)11358, (long)(0x7CE5AA91A6E23BFBL ^ l))), (String)((Object)b_.a("w", (int)25599, (long)(0xD31ADC214A27459L ^ l))), l2);
        this.g = new float[b_.c("o", (int)25689, (long)(0x79526A37ED4FDD4L ^ l))];
        this.h = 0;
        this.i = (long)b_.d("e", (int)24778, (long)(0x2A0113387ECF65E4L ^ l));
        this.j = (long)b_.d("e", (int)24778, (long)(0x2A0113387ECF65E4L ^ l));
        this.k = -1.0f;
        this.l = 96.0f;
        this.o = 220.0f;
        this.p = 130.0f;
        this.t = 0.0f;
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
                                b_.v = hc.a(8470271067790842676L, 9219793314940114175L, MethodHandles.lookup().lookupClass()).a(136312468875383L);
                                b_.K = new Object[84];
                                b_.L = new String[84];
                                b_.b();
                                b_.y = new HashMap<K, V>(13);
                                var22 = b_.v ^ 21387126458043L;
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
                                var31_3 = new String[5];
                                var29_4 = 0;
                                var28_5 = "\u0085\u00a3\u00e9\u009e\u009aJ\u00be_F\u000e\u00ea\u00e0\u00d1\u00d9\u00ba\u00d1\u0010\u0011s N\u0085\u00ed\u00b6s\u00d2X\u00a2\u00b4\u001f\u00c7\u00cb\u00da\u0010Gl:\u00bd\u00c6\u00d5\u008b\u00cd\u00f8\u00da\u00beL\u00b6Q\u0082;";
                                var30_6 = "\u0085\u00a3\u00e9\u009e\u009aJ\u00be_F\u000e\u00ea\u00e0\u00d1\u00d9\u00ba\u00d1\u0010\u0011s N\u0085\u00ed\u00b6s\u00d2X\u00a2\u00b4\u001f\u00c7\u00cb\u00da\u0010Gl:\u00bd\u00c6\u00d5\u008b\u00cd\u00f8\u00da\u00beL\u00b6Q\u0082;".length();
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
                                    var31_3[var29_4++] = b_.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = " \u00c5\u00fc\tJ\u0012\u00ee~\u00f0a\u00c8O\u001d\u000e\u00f9v\u001b\u008b\u00b5\u00c7\u00b6V\u00fd\u00a3.Y@x\u00b4Uk{\u0000\u00a1\u001d\u00bf\u00c5J\u00c7\u00a7\u009b\u00d3ar\u00b27\u00aa\r\u0017\u00ce\u00aa\u001cP\u009b\u00cc\u0006\u0084\u00b3\u0094\u00ccIu\u00fa\u007f@\u00c4\u00e5j\u00fft\u00f10\u0000\u001ft.~\u00b3\u0083\u001c\u009d(\u0015\u00c7\u00a5\u008f.\u00f9BT{\u00b0;\u00bf\u0098\u0083\u00e5d\u00e8\u0004Q\u000b,\u00afi\u00ef\u00cf)t=x\u00cf\u001b\u009f\u00fc\u0001:\u00a8\u00e5\u001d\u00fa\u00da\u00ee\u00b4\u00c7\u0003\u00f6\u00a3\u0012";
                                    var30_6 = " \u00c5\u00fc\tJ\u0012\u00ee~\u00f0a\u00c8O\u001d\u000e\u00f9v\u001b\u008b\u00b5\u00c7\u00b6V\u00fd\u00a3.Y@x\u00b4Uk{\u0000\u00a1\u001d\u00bf\u00c5J\u00c7\u00a7\u009b\u00d3ar\u00b27\u00aa\r\u0017\u00ce\u00aa\u001cP\u009b\u00cc\u0006\u0084\u00b3\u0094\u00ccIu\u00fa\u007f@\u00c4\u00e5j\u00fft\u00f10\u0000\u001ft.~\u00b3\u0083\u001c\u009d(\u0015\u00c7\u00a5\u008f.\u00f9BT{\u00b0;\u00bf\u0098\u0083\u00e5d\u00e8\u0004Q\u000b,\u00afi\u00ef\u00cf)t=x\u00cf\u001b\u009f\u00fc\u0001:\u00a8\u00e5\u001d\u00fa\u00da\u00ee\u00b4\u00c7\u0003\u00f6\u00a3\u0012".length();
                                    var27_7 = 64;
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
                                    var31_3[var29_4++] = b_.b(var32_9).intern();
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
                        b_.w = var31_3;
                        b_.x = new String[5];
                        b_.D = new HashMap<K, V>(13);
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
                        var17_12 = new long[19];
                        var14_13 = 0;
                        var15_14 = "\u00eb\u00e9\u00d4\n\u00bc\u009b\u009b\u00de\u00f22\u00fc\u00d1\u009e%\u00f2\u00ae!\u0016\u0099~\u00df\u0006\u008dQ\u0006\u009a\u009aj\u0004\u001f\u0004\u0000Iep\u00eb\u0018\u00dbT\u00dc\u00a2G\u0098\u0096\u0090\u009cC\u00cdT\u00c1\u00f9\u00fe\u0004Uu%\u0082M\u008c\u00a8}\u00f4\u00e2\u00ff\u0080\u00a3\u0013r<\u0003\u001d\u00ca\u0013\u00fb\u00e4\u001f\u001f^o\u00ae\u00bd\u00a6c0\u00ad\u00fel-#\u009f>\u0084\u0084\u009f\u00a4\u00c7\rG\u00e0\u00e1\u001a\u00c4p5\u00f2\u00c8\u0018\u00f6\u0000_\u001f\u00c4\u000b{U)\u008d\u0010\u000f^\u0014!\b+\u00b1{\u007fYkS\u00c3\u00bd\u00b3\u00fc\u0017J";
                        var16_15 = "\u00eb\u00e9\u00d4\n\u00bc\u009b\u009b\u00de\u00f22\u00fc\u00d1\u009e%\u00f2\u00ae!\u0016\u0099~\u00df\u0006\u008dQ\u0006\u009a\u009aj\u0004\u001f\u0004\u0000Iep\u00eb\u0018\u00dbT\u00dc\u00a2G\u0098\u0096\u0090\u009cC\u00cdT\u00c1\u00f9\u00fe\u0004Uu%\u0082M\u008c\u00a8}\u00f4\u00e2\u00ff\u0080\u00a3\u0013r<\u0003\u001d\u00ca\u0013\u00fb\u00e4\u001f\u001f^o\u00ae\u00bd\u00a6c0\u00ad\u00fel-#\u009f>\u0084\u0084\u009f\u00a4\u00c7\rG\u00e0\u00e1\u001a\u00c4p5\u00f2\u00c8\u0018\u00f6\u0000_\u001f\u00c4\u000b{U)\u008d\u0010\u000f^\u0014!\b+\u00b1{\u007fYkS\u00c3\u00bd\u00b3\u00fc\u0017J".length();
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
                            var15_14 = "\u00cb\u00dbAm\u001ap\u0002n\u00e2/q\u008eG*pf";
                            var16_15 = "\u00cb\u00dbAm\u001ap\u0002n\u00e2/q\u008eG*pf".length();
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
                b_.B = var17_12;
                b_.C = new Integer[19];
                b_.a = (int)b_.c("o", (int)7743, (long)(var22 ^ 954908583642342715L));
                b_.J = new HashMap<K, V>(13);
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
                var6_22 = new long[4];
                var3_23 = 0;
                var4_24 = "\u00a3\u00f2\u008ff\u0016W-\u009bQ\u00ed\u000f\u00d5\u00f7\u00b1\u00b3\u00f1";
                var5_25 = "\u00a3\u00f2\u008ff\u0016W-\u009bQ\u00ed\u000f\u00d5\u00f7\u00b1\u00b3\u00f1".length();
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
                    var4_24 = "\u0089\u0000\u00af\u00da\u00ca\"\u008d\u00dc\u00b2.i_/\u001duA";
                    var5_25 = "\u0089\u0000\u00af\u00da\u00ca\"\u008d\u00dc\u00b2.i_/\u001duA".length();
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
        b_.H = var6_22;
        b_.I = new Long[4];
        b_.c = (long)b_.d("e", (int)19573, (long)(var22 ^ 507537090439900118L));
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
            case 0 -> 2;
            case 1 -> 29;
            case 2 -> 48;
            case 3 -> 44;
            case 4 -> 58;
            case 5 -> 42;
            case 6 -> 12;
            case 7 -> 50;
            case 8 -> 55;
            case 9 -> 34;
            case 10 -> 0;
            case 11 -> 37;
            case 12 -> 39;
            case 13 -> 35;
            case 14 -> 40;
            case 15 -> 43;
            case 16 -> 36;
            case 17 -> 38;
            case 18 -> 53;
            case 19 -> 45;
            case 20 -> 10;
            case 21 -> 14;
            case 22 -> 63;
            case 23 -> 57;
            case 24 -> 23;
            case 25 -> 56;
            case 26 -> 31;
            case 27 -> 17;
            case 28 -> 5;
            case 29 -> 7;
            case 30 -> 32;
            case 31 -> 49;
            case 32 -> 13;
            case 33 -> 54;
            case 34 -> 1;
            case 35 -> 19;
            case 36 -> 20;
            case 37 -> 18;
            case 38 -> 28;
            case 39 -> 3;
            case 40 -> 33;
            case 41 -> 61;
            case 42 -> 52;
            case 43 -> 24;
            case 44 -> 22;
            case 45 -> 60;
            case 46 -> 15;
            case 47 -> 16;
            case 48 -> 25;
            case 49 -> 21;
            case 50 -> 9;
            case 51 -> 59;
            case 52 -> 62;
            case 53 -> 8;
            case 54 -> 47;
            case 55 -> 6;
            case 56 -> 27;
            case 57 -> 26;
            case 58 -> 11;
            case 59 -> 41;
            case 60 -> 51;
            case 61 -> 30;
            case 62 -> 4;
            default -> 46;
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
        b_.L[n3] = new String(cArray);
        return n3;
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

    private static void b() {
        Object[] objectArray = K;
        K[0] = "GC}('CQCxr4TF\b{t8@WOlcsQ\u0017";
        objectArray[1] = "%\u0015\u0004C1\u0014P5\u000fL [1;\u0004G$\u0001E";
        objectArray[2] = Void.TYPE;
        b_.L[2] = "java/lang/Void";
        objectArray[3] = "T\u0010k\u001f\n[B\u0010nE\u0019LU[mC\u0015XD\u001czT^Io";
        objectArray[4] = "u\u001e22\u000bI~\u0011#}hDk\u001c,\u0016]Fz\u000f0:JK";
        objectArray[5] = "5F\u000eswG#F\u000b)dP4\r\b/hD%J\u001f8#V\u0019";
        objectArray[6] = "k\u001a|\u001c*3\u001e:w\u0013;|c\"d\u001425\u000b";
        objectArray[7] = "\u0004M\u000b\u00106&\u000fB\u001a_U+\u001aD";
        objectArray[8] = Integer.TYPE;
        b_.L[8] = "java/lang/Integer";
        objectArray[9] = "GPSY*jZE\u000b{kgBC";
        objectArray[10] = "\u0012'6`1-\u0004'3:\":\u0013l0<..\u0002+'+e97";
        objectArray[11] = "r\u0011\bxkW\u00071\u0003wz\u0018f?\b|~B\u0012";
        objectArray[12] = "/\u0003%j\t\u0019/\u000326\u0005\u00165H2(\u0005\u000329buT";
        objectArray[13] = "h\u0015i0E\u0001h\u0015~lI\u000er^~rI\u001bu/**\u001e";
        objectArray[14] = Float.TYPE;
        b_.L[14] = "java/lang/Float";
        objectArray[15] = "Bo\u0005 @cTo\u0000zStC$\u0003|_`Rc\u0014k\u0014pH";
        objectArray[16] = "hhp6-\n\u001dH{9<E|Fp28\u001f\b";
        objectArray[17] = ": \u007f\b@\tO\u0000t\u0007QF.\u000e\u007f\fU\u001cZ";
        objectArray[18] = "3n\r\u001a-\u0017%n\b@>\u00002%\u000bF2\u0014#b\u001cQy\u0006\u0012";
        objectArray[19] = "k!Pl7z\u001e\u0001[c&5\u007f\u000fPh\"o\u000b";
        objectArray[20] = "\"\u0007II9N\"\u0007^\u00155A8L^\u000b5T?=\u000bT`";
        objectArray[21] = "Vn\u0002\r\b1Hf\u0018Bs\u0011uK";
        objectArray[22] = "B.0CbQB.'\u001fn^Xe'\u0001nK_\u0014rY?";
        objectArray[23] = "j\u0018\u001a\u000b41j\u0018\rW8>pS\rI8+w\"Z\u0016n";
        objectArray[24] = "a\u000f\u0014\u0000\\<\u0014/\u001f\u000fMsu!\u0014\u0004I)\u0001";
        objectArray[25] = " :jl+>6:o68)!ql04=06{'\u007f-(6y,%`\u0014-y1%'#:";
        objectArray[26] = "u`\u001fr\u0006\nc`\u001a(\u0015\u001dt+\u0019.\u0019\tel\u000e9R\u0019R";
        objectArray[27] = "\u001d{^x%gh[Uw4(\tU^|0r}";
        objectArray[28] = "v{\u001c\u001aBb`{\u0019@Quw0\u001aF]afw\rQ\u0016qS";
        objectArray[29] = "\u0017#7|&&\u0001#2&51\u0016h1 9%\u0007/&7r2\u001e";
        objectArray[30] = "\na\u0013)zm\u007fA\u0018&k\"\u001eO\u0013-oxj";
        objectArray[31] = "r!5\\}~d!0\u0006nisj3\u0000b}b-$\u0017)lA";
        objectArray[32] = "T=9+&J_2(d[RL5!-";
        objectArray[33] = "c\u001a\u0018dfN\u0016:\u0013kw\u0001w4\u0018`s[\u0003";
        objectArray[34] = "d\u001crvTx\u0011<yyE7p2rrAm\u0004";
        objectArray[35] = "Gc\u001a\u0013!RQc\u001fI2EF(\u001cO>QWo\u000bXuFH";
        objectArray[36] = "G\b95gN2(2:v\u0001S&91r['";
        objectArray[37] = "+[N\u0019B\r=[KCQ\u001a*\u0010HE]\u000e;W_R\u0016\u0019+";
        objectArray[38] = "fF]tqX\u0013fV{`\u0017rh]pdM\u0006";
        objectArray[39] = "~X[\u0013\u0001Y\u000bxP\u001c\u0010\u0016jv[\u0017\u0014L\u001e";
        objectArray[40] = "\u0019\bQ/p\\\u000f\bTucK\u0018CWso_\t\u0004@d$H\u0011";
        objectArray[41] = "\u0015F\u0007q\u0016\u0012`f\f~\u0007]\u0001h\u0007u\u0003\u0007u";
        objectArray[42] = "^z\u0001\u0006Aw+Z\n\tP8JT\u0001\u0002Tb>";
        objectArray[43] = "I\u0005C5/V<%H:>\u0019]+C1:C)";
        objectArray[44] = Boolean.TYPE;
        b_.L[44] = "java/lang/Boolean";
        objectArray[45] = "\tlJ@z7\u0002c[\u000f\u0007\"\u0010yYL";
        objectArray[46] = Long.TYPE;
        b_.L[46] = "java/lang/Long";
        objectArray[47] = "YUH\\gb,uCSv-M{HXrw9";
        objectArray[48] = "36\\\t]X89MF<V32I\u001c";
        objectArray[49] = "\u007f!\u0000)\u001av/uA+v\",94(\u001b 'EEo\n({u\u0001/\u0018,A";
        objectArray[50] = "[\f\u007fd\u0004A\u0011\u0014\u007f4a\u0012`Rcf\u0011\u0005\u000eT96\u0018x";
        objectArray[51] = "$\u0010/AcP|P\u007fA\u001bJ\u001a\u0010w\u0013|Q\u007fZuA%.#\u0006>BtL \t2Z\u001b";
        objectArray[52] = "+GMY5\u0006x\u0018\u0014\u0004MTzLO\r\u001a\u0003$\u001b\u0017a|\u0004cCP\r|\u0005&L";
        objectArray[53] = "H'>u{;\u0018s\u007fw\u0017o\u001b?\u001fc{\u0000H~9k-0\f>+o\u0017";
        objectArray[54] = "t9F\u00124\u00026\u007f\u001dL^Y u,Oc@,?\u001c\u000b#R(\u0005\u0012L\"Ys5V\f0]I;\u0011\r;\u0006y\u007fQ\u001f?<";
        objectArray[55] = "%\u0014B5\u0000\u001cgR\u0019kjX\u007fUN:jKu\u0010Q4RMcP\u0019VT\u001fdM\u0012f\u0010_vI(";
        objectArray[56] = "T\u000eAl7]\u0007\u000f\u000be\rE=\u0013\t=jPXY\u000bo3/T\u000e\t\u007fo\u0017R\u0018I7\r";
        objectArray[57] = "\u0007Dk\u0003Ij\u000f\b<eC\u0011\u001d\r>\u0002]tW\u000fl[\"(\u000bDo\n@+\u0004Hwe";
        objectArray[58] = "\f\u0001?'j&\u001c\n6w\u0006(g\u0014vra;\u0002^t 8DY\u000052j\u007f\tTt0\u0006";
        objectArray[59] = "`#21z`b~=5\u0019~``82uL7,gl\u0019u3f=ikitq3Uw{g|43{jneX";
        objectArray[60] = "rhc\u0004Ah!7:Y9:#caPnm}38<Vk%j<R_?=1";
        objectArray[61] = "X%\u0002u}%\u0001y\u001b-Dsbk\\*#e\u0007!^xz\u001a\\\u007f\u001fj(!\f+^hD";
        objectArray[62] = "r1PM2\u0016!n\t\u0010JO/+V\u0012&}{j\bOJG}=R\u00161E 2Vu";
        objectArray[63] = "{@\n\u001fF%qOQ\u0010+w\u001bA\bVWm#J]CJ";
        objectArray[64] = "jCF>\u0019(a\u0016S#hy\u000bW\u0007y\u000fon\u001d\u0005+V\u0010i@\u0002rVz0@\\/h";
        objectArray[65] = "i\fg\u0017fvc\u001e-\u0010\u0014b\n\u001c/NstoV-\u001c*\u000bn\tg\u001b$spR'D\u0014";
        objectArray[66] = "wxV$...$O|\u0017xM}\u000b'yr*%P}u\u0011v}W.tv.&\r\"\u0017";
        objectArray[67] = "\u000bc#pOq\u0007r*i#r\b\u007f)wO@_2t!#)X\u007f,*\u0013m\u0018m(\u0010";
        objectArray[68] = "nd\bX*ef(_>(\u001et-]Y>{>/\u000f\u0000A'bd\fQ#$mh\u0014>";
        objectArray[69] = ",}`F't4n*\u0014\u0019s w,A^cI-lP|7yi,Bx\r,}`F't4n*\u0014\u0019";
        objectArray[70] = "R )ni\u001b\u000b w3W\u001a07,e0\u000eU}.7iqY*,'5I_<loW";
        objectArray[71] = "\u0015\u0003c\u007f.rL\u0003=\"\u0010qw\u0014ftwg\u0012^d&.\u0018\u001e\tf6r \u0018\u001f&~\u0010";
        objectArray[72] = "IY\u0018\u0016\u001a@KS\bG$\u001b.R[AC\u000fK\u0018Y\u0013\u001ap\u0017D\u0012\u0010K\u0012\u0014K\u001e\b$";
        objectArray[73] = "3fG\u0002\u0002C{rZ]m\u001eKi\u0010\t\n\f.#\u0012[Ssr\u007fYX\u0002\u0011qpU@m";
        objectArray[74] = "\u001a\u001b@N\rEJO\u0001La\u0011I\u0003qQ\u001c\u0013$A\u0006I\u0004D\u0014\u0005F[\u0000~";
        objectArray[75] = "\u0019c t\u0007f\u0019be{|oE!8q\u0010]\u0015cf)|d\u0016'=*\u000exQ03\u0016";
        objectArray[76] = "\u0001)'\"g^\u0011\".r\u000bVj<nwlC\u000fvl%5<\u0003!n5i\u0004\u00057.}\u000b";
        objectArray[77] = "7h`-Lz}5~!paLt=|\u0017u)>?.N\nubt-\u001fhvmx5p";
        objectArray[78] = "\u007f\n_\u0001\u0001V&VFY8\u0000ED\u0001^_\u0016 \u000e\u0003\f\u0006i{\tE\u0000\u0002Y?IW\u00048";
        objectArray[79] = "\u0019`1C\f+\u0011,f%\fP\u0003)dB\u00185I+6\u001bg-\u000b-<T\u0016iJ)4%";
        objectArray[80] = "t(Q*\u001e\u0002: S\"sXw7\u00116\u0015OV,\u000e66Rn)\n sL71\r5BAo1\u0004[";
        objectArray[81] = "\u000b\b'7-BIN|iG\u0019WRMjz\u0000S\u000e}.:\u0012W4si;\u0019\f\u00047))\u001d6\np(\"F\u0006N0:&|";
        objectArray[82] = "q?`w\u0011T(?>*/A\u0013(e|HAvbg.\u0011>*>,-@\\)1 5/";
        Object[] objectArray2 = objectArray;
        objectArray[83] = "\u0006c\u00016BGD%Zh(\u001cR/k<EAB=S:S\u0001\n_\u00028\u0010\u0000Yg\u0004.PH;6\u0006mQ\u001b\u00030\u0010-\u0019y";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b_.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD39;
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
                throw new RuntimeException("dev/zprestige/prestige/b_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b_.C[n2] = n3;
        }
        return C[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = b_.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == 'g' || c == '\u00f8' || c == '\u00d4') {
                field = b_.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b_.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = b_.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b_.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b_.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b_.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = b_.i(l, l2);
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
                clazz3 = b_.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b_.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b_.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        b_.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b_.j(3399793477193438L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b_.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b_.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b_.j(3399793477193438L, 0L);
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

    @Override
    public void l(Object[] objectArray) {
        block83: {
            int n;
            float f;
            float f10;
            float f11;
            float f12;
            float f13;
            CallSite callSite;
            float f14;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            Matrix4f matrix4f;
            block81: {
                int n2;
                float f15;
                float f16;
                float f17;
                float f18;
                float f19;
                float f20;
                CallSite callSite3;
                float f21;
                reference var46_32;
                reference var45_31;
                CallSite callSite4;
                Color color;
                long l4;
                long l5;
                block90: {
                    reference var43_29;
                    block89: {
                        float f22;
                        float f23;
                        float f24;
                        float f25;
                        float f26;
                        reference var44_30;
                        long l6;
                        long l7;
                        long l8;
                        long l9;
                        gK gK2;
                        aq_0 aq_02;
                        block79: {
                            block77: {
                                block78: {
                                    Object object;
                                    float f27;
                                    long l10;
                                    long l11;
                                    long l12;
                                    long l13;
                                    block76: {
                                        float f28;
                                        float f29;
                                        block74: {
                                            Object object2;
                                            block75: {
                                                CallSite callSite5;
                                                block71: {
                                                    CallSite callSite6;
                                                    block73: {
                                                        class_310 class_3102;
                                                        block72: {
                                                            block70: {
                                                                float f30;
                                                                block69: {
                                                                    Object object3;
                                                                    Object object4;
                                                                    block67: {
                                                                        block68: {
                                                                            block66: {
                                                                                long l14;
                                                                                block65: {
                                                                                    aq_02 = (aq_0)objectArray[0];
                                                                                    gK2 = (gK)objectArray[1];
                                                                                    matrix4f = (Matrix4f)objectArray[2];
                                                                                    l3 = (Long)objectArray[3];
                                                                                    long l15 = l3;
                                                                                    l9 = l15 ^ 0x56B4B80BF914L;
                                                                                    l8 = l15 ^ 0x194A66AD9C40L;
                                                                                    l13 = l15 ^ 0x31240AA31D80L;
                                                                                    l14 = l15 ^ 0x33F5EE405241L;
                                                                                    l7 = l15 ^ 0x7876565874AFL;
                                                                                    l2 = l15 ^ 0x63A1E4D5E7D8L;
                                                                                    l = l15 ^ 0x51117395139CL;
                                                                                    l12 = l15 ^ 0x5D6649FEB165L;
                                                                                    l11 = l15 ^ 0x5784D74479BL;
                                                                                    l5 = l15 ^ 0x77FE815D5D37L;
                                                                                    l6 = l15 ^ 0x1190C45D2788L;
                                                                                    l10 = l15 ^ 0x62D4985F6C9EL;
                                                                                    l4 = l15 ^ 0x5BE4B21DC642L;
                                                                                    callSite2 = b_.g("Q", (long)-6306507163067165450L, (long)l3);
                                                                                    try {
                                                                                        b_ b_2;
                                                                                        try {
                                                                                            b_2 = this;
                                                                                            if (callSite2 != null) break block65;
                                                                                            if (b_2.d != null) break block66;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                                        }
                                                                                        b_2 = this;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                                    }
                                                                                }
                                                                                Object[] objectArray2 = new Object[2];
                                                                                objectArray2[1] = l14;
                                                                                objectArray2[0] = b_.a("w", (int)28021, (long)(0x3A000215D80FC61DL ^ l3));
                                                                                b_2.d = b_.g("Q", (Object)objectArray2, (long)-6312310305055243574L, (long)l3);
                                                                            }
                                                                            callSite5 = b_.g("Q", (long)-6313409167508560088L, (long)l3);
                                                                            try {
                                                                                try {
                                                                                    object4 = this.j;
                                                                                    object3 = b_.d("e", (int)20804, (long)(0x4C3B1A2E6B49E8A1L ^ l3));
                                                                                    if (callSite2 != null) break block67;
                                                                                    if (object4 != object3) break block68;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                                }
                                                                                f30 = 1.0f;
                                                                                break block69;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                            }
                                                                        }
                                                                        object4 = callSite5;
                                                                        object3 = this.j;
                                                                    }
                                                                    f30 = (float)(object4 - object3) * 0.005f;
                                                                }
                                                                f27 = f30;
                                                                this.j = (long)callSite5;
                                                                object2 = false;
                                                                try {
                                                                    try {
                                                                        class_3102 = b;
                                                                        if (callSite2 != null) break block70;
                                                                        if (b_.g("X", (Object)class_3102, (long)-6306789662024548028L, (long)l3) == null) break block71;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                    }
                                                                    class_3102 = b;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite2 != null) break block72;
                                                                    if (b_.g("Y", (Object)class_3102, (long)-6306336286324009062L, (long)l3) == null) break block71;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                                }
                                                                class_3102 = b;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                            }
                                                        }
                                                        CallSite callSite7 = b_.g("X", (Object)b_.g("X", (Object)class_3102, (long)-6306789662024548028L, (long)l3), (Object)b_.g("X", (Object)b_.g("Y", (Object)b, (long)-6306336286324009062L, (long)l3), (long)-6312718225375297589L, (long)l3), (long)-6307103567476923409L, (long)l3);
                                                        try {
                                                            callSite6 = callSite7;
                                                            if (callSite2 != null) break block73;
                                                            if (callSite6 == null) break block71;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                        }
                                                        callSite6 = callSite7;
                                                    }
                                                    object2 = b_.g("X", (Object)callSite6, (long)-6312192200694019252L, (long)l3);
                                                }
                                                try {
                                                    if (callSite5 - this.i >= b_.d("e", (int)22914, (long)(0x54B35F6D8D33E066L ^ l3))) {
                                                        this.g[this.h] = (float)object2;
                                                        this.h = (this.h + 1) % b_.c("o", (int)31246, (long)(0x73B119C7AE05F4EL ^ l3));
                                                        this.i = (long)callSite5;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                }
                                                try {
                                                    try {
                                                        b_ b_3 = this;
                                                        f29 = this.k;
                                                        f28 = 0.0f;
                                                        if (callSite2 != null) break block74;
                                                        if (!(f29 < f28)) break block75;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                    }
                                                    object = (float)object2;
                                                    break block76;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                }
                                            }
                                            f29 = this.k;
                                            f28 = (float)object2;
                                        }
                                        Object[] objectArray3 = new Object[4];
                                        objectArray3[3] = l11;
                                        objectArray3[2] = Float.valueOf(f27);
                                        objectArray3[1] = Float.valueOf(f28);
                                        objectArray3[0] = Float.valueOf(f29);
                                        object = b_.g("Q", (Object)objectArray3, (long)-6312527124532611432L, (long)l3);
                                    }
                                    b_3.k = object;
                                    CallSite callSite8 = b_.g("Q", (int)0, (int)b_.g("Q", (float)this.k, (long)-6306300633820634453L, (long)l3), (long)-6306187317049700058L, (long)l3);
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l2;
                                    objectArray4[0] = Float.valueOf((float)callSite8);
                                    CallSite callSite9 = b_.g("Q", (Object)objectArray4, (long)-6307008253507108369L, (long)l3);
                                    Object[] objectArray5 = new Object[4];
                                    objectArray5[3] = l11;
                                    objectArray5[2] = Float.valueOf(f27);
                                    objectArray5[1] = Float.valueOf((float)b_.g("X", (Object)callSite9, (long)-6306381161956094397L, (long)l3));
                                    objectArray5[0] = Float.valueOf(this.l);
                                    this.l = (float)b_.g("Q", (Object)objectArray5, (long)-6312527124532611432L, (long)l3);
                                    Object[] objectArray6 = new Object[4];
                                    objectArray6[3] = l11;
                                    objectArray6[2] = Float.valueOf(f27);
                                    objectArray6[1] = Float.valueOf((float)b_.g("X", (Object)callSite9, (long)-6306692745178993115L, (long)l3));
                                    objectArray6[0] = Float.valueOf(this.o);
                                    this.o = (float)b_.g("Q", (Object)objectArray6, (long)-6312527124532611432L, (long)l3);
                                    Object[] objectArray7 = new Object[4];
                                    objectArray7[3] = l11;
                                    objectArray7[2] = Float.valueOf(f27);
                                    objectArray7[1] = Float.valueOf((float)b_.g("X", (Object)callSite9, (long)-6312669119009466628L, (long)l3));
                                    objectArray7[0] = Float.valueOf(this.p);
                                    this.p = (float)b_.g("Q", (Object)objectArray7, (long)-6312527124532611432L, (long)l3);
                                    Object[] objectArray8 = new Object[2];
                                    objectArray8[1] = l10;
                                    objectArray8[0] = Float.valueOf(this.l);
                                    Object[] objectArray9 = new Object[2];
                                    objectArray9[1] = l10;
                                    objectArray9[0] = Float.valueOf(this.o);
                                    Object[] objectArray10 = new Object[2];
                                    objectArray10[1] = l10;
                                    objectArray10[0] = Float.valueOf(this.p);
                                    color = new Color((int)b_.g("Q", (Object)objectArray8, (long)-6312372128666592415L, (long)l3), (int)b_.g("Q", (Object)objectArray9, (long)-6312372128666592415L, (long)l3), (int)b_.g("Q", (Object)objectArray10, (long)-6312372128666592415L, (long)l3));
                                    callSite4 = b_.g("Q", (int)callSite8, (long)-6312013036848875708L, (long)l3);
                                    Object[] objectArray11 = new Object[1];
                                    objectArray11[0] = l5;
                                    Object[] objectArray12 = new Object[1];
                                    objectArray12[0] = l13;
                                    CallSite callSite10 = b_.g("X", (Object)b_.g("X", (Object)b_.g("\u00f8", (long)-6306853278757782546L, (long)l3), (Object)objectArray11, (long)-6312270158373835722L, (long)l3), (Object)objectArray12, (long)-6311810746683776295L, (long)l3);
                                    Object[] objectArray13 = new Object[1];
                                    objectArray13[0] = l5;
                                    Object[] objectArray14 = new Object[2];
                                    objectArray14[1] = l12;
                                    objectArray14[0] = callSite4;
                                    var43_29 = b_.g("X", (Object)b_.g("X", (Object)b_.g("\u00f8", (long)-6306853278757782546L, (long)l3), (Object)objectArray13, (long)-6312270158373835722L, (long)l3), (Object)objectArray14, (long)-6311888549725870240L, (long)l3) * 1.0f;
                                    Object[] objectArray15 = new Object[1];
                                    objectArray15[0] = l5;
                                    Object[] objectArray16 = new Object[2];
                                    objectArray16[1] = l12;
                                    objectArray16[0] = b_.a("w", (int)24157, (long)(0x4F4D8A4C5C5E7530L ^ l3));
                                    var44_30 = b_.g("X", (Object)b_.g("X", (Object)b_.g("\u00f8", (long)-6306853278757782546L, (long)l3), (Object)objectArray15, (long)-6312270158373835722L, (long)l3), (Object)objectArray16, (long)-6311888549725870240L, (long)l3) * 0.65f;
                                    var45_31 = callSite10 * 1.0f;
                                    var46_32 = callSite10 * 0.65f;
                                    f26 = 7.5f;
                                    f25 = 5.5f + f26 + 5.5f;
                                    f21 = f25 + 0.5f + 5.5f;
                                    CallSite callSite11 = b_.g("Q", (float)(var43_29 + 3.0f + var44_30), (float)28.0f, (long)-6313326098615567869L, (long)l3);
                                    f14 = f21 + callSite11 + 5.5f;
                                    callSite = b_.g("Q", (Object)new Object[]{Float.valueOf((float)callSite10)}, (long)-6307216510064132552L, (long)l3);
                                    callSite3 = b_.g("X", (Object)this, (Object)new Object[0], (long)-6312433332660290203L, (long)l3);
                                    boolean bl = b_.g("Y", (Object)b, (long)-6306929218978625935L, (long)l3) instanceof g8;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block77;
                                                        if (callSite3 == false) break block78;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                    }
                                                    f24 = this.t;
                                                    if (callSite2 != null) break block79;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                }
                                                if (!(f24 > 0.0f)) break block78;
                                            }
                                            catch (MatchException matchException) {
                                                throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                            }
                                            if (bl) break block78;
                                        }
                                        catch (MatchException matchException) {
                                            throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                        }
                                        this.e -= f14 - this.t;
                                    }
                                    catch (MatchException matchException) {
                                        throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                    }
                                }
                                this.t = f14;
                            }
                            f24 = this.e;
                        }
                        f20 = f24;
                        float f31 = this.f;
                        try {
                            Object[] objectArray17 = new Object[10];
                            objectArray17[9] = l9;
                            objectArray17[8] = Float.valueOf(4.0f);
                            objectArray17[7] = 5;
                            objectArray17[6] = Float.valueOf((float)callSite);
                            objectArray17[5] = Float.valueOf(f14);
                            objectArray17[4] = Float.valueOf(f31);
                            objectArray17[3] = Float.valueOf(f20);
                            objectArray17[2] = matrix4f;
                            objectArray17[1] = gK2;
                            objectArray17[0] = aq_02;
                            b_.g("Q", (Object)objectArray17, (long)-6312880607550922765L, (long)l3);
                            Object[] objectArray18 = new Object[10];
                            objectArray18[9] = l7;
                            objectArray18[8] = Float.valueOf(4.0f);
                            objectArray18[7] = cn_0.r;
                            objectArray18[6] = Float.valueOf((float)callSite);
                            objectArray18[5] = Float.valueOf(f14);
                            objectArray18[4] = Float.valueOf(f31);
                            objectArray18[3] = Float.valueOf(f20);
                            objectArray18[2] = matrix4f;
                            objectArray18[1] = gK2;
                            objectArray18[0] = aq_02;
                            b_.g("Q", (Object)objectArray18, (long)-6312828352312714791L, (long)l3);
                            f23 = callSite3 != false ? f20 + f14 - 5.5f - f26 : f20 + 5.5f;
                        }
                        catch (MatchException matchException) {
                            throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                        }
                        float f32 = f23;
                        try {
                            f22 = callSite3 != false ? f20 + f14 - f25 - 0.5f : f20 + f25;
                        }
                        catch (MatchException matchException) {
                            throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                        }
                        float f33 = f22;
                        Object[] objectArray19 = new Object[1];
                        objectArray19[0] = l8;
                        Object[] objectArray20 = new Object[10];
                        objectArray20[9] = l6;
                        objectArray20[8] = b_.g("Q", (Object)objectArray19, (long)-6307076066440131202L, (long)l3);
                        objectArray20[7] = Float.valueOf(f26);
                        objectArray20[6] = Float.valueOf(f26);
                        objectArray20[5] = Float.valueOf(f31 + callSite / 2.0f - f26 / 2.0f);
                        objectArray20[4] = Float.valueOf(f32);
                        objectArray20[3] = this.d;
                        objectArray20[2] = matrix4f;
                        objectArray20[1] = gK2;
                        objectArray20[0] = aq_02;
                        b_.g("Q", (Object)objectArray20, (long)-6312612602154275611L, (long)l3);
                        Object[] objectArray21 = new Object[7];
                        objectArray21[6] = l;
                        objectArray21[5] = cn_0.v;
                        objectArray21[4] = Float.valueOf(f31 + callSite - 3.0f);
                        objectArray21[3] = Float.valueOf(f33 + 0.5f);
                        objectArray21[2] = Float.valueOf(f31 + 3.0f);
                        objectArray21[1] = Float.valueOf(f33);
                        objectArray21[0] = matrix4f;
                        b_.g("Q", (Object)objectArray21, (long)-6306577832279865182L, (long)l3);
                        f19 = f31 + 3.0f;
                        if (callSite3 == false) break block89;
                        f13 = f20 + f14 - f21;
                        f18 = f13 - var44_30;
                        f17 = f18 - 3.0f - var43_29;
                        if (callSite2 == null) break block90;
                    }
                    f17 = f20 + f21;
                    f18 = f17 + var43_29 + 3.0f;
                }
                Object[] objectArray22 = new Object[1];
                objectArray22[0] = l5;
                Object[] objectArray23 = new Object[7];
                objectArray23[6] = l4;
                objectArray23[5] = color;
                objectArray23[4] = Float.valueOf(1.0f);
                objectArray23[3] = Float.valueOf(f19);
                objectArray23[2] = Float.valueOf(f17);
                objectArray23[1] = callSite4;
                objectArray23[0] = matrix4f;
                b_.g("X", (Object)b_.g("X", (Object)b_.g("\u00f8", (long)-6306853278757782546L, (long)l3), (Object)objectArray22, (long)-6312270158373835722L, (long)l3), (Object)objectArray23, (long)-6313259704598432848L, (long)l3);
                Object[] objectArray24 = new Object[1];
                objectArray24[0] = l5;
                Object[] objectArray25 = new Object[7];
                objectArray25[6] = l4;
                objectArray25[5] = cn_0.u;
                objectArray25[4] = Float.valueOf(0.65f);
                objectArray25[3] = Float.valueOf(f19 + (var45_31 - var46_32) - 0.5f);
                objectArray25[2] = Float.valueOf(f18);
                objectArray25[1] = b_.a("w", (int)25842, (long)(0x50541B550D1CCF9CL ^ l3));
                objectArray25[0] = matrix4f;
                b_.g("X", (Object)b_.g("X", (Object)b_.g("\u00f8", (long)-6306853278757782546L, (long)l3), (Object)objectArray24, (long)-6312270158373835722L, (long)l3), (Object)objectArray25, (long)-6313259704598432848L, (long)l3);
                f13 = f19 + var45_31 + 1.0f + 4.0f;
                try {
                    f16 = callSite3 != false ? f20 + 5.5f : f20 + f21;
                }
                catch (MatchException matchException) {
                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                }
                f12 = f16;
                try {
                    f15 = callSite3 != false ? f20 + f14 - f21 : f20 + f14 - 5.5f;
                }
                catch (MatchException matchException) {
                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                }
                float f34 = f15;
                f11 = (f34 - f12) / 24.0f;
                f10 = 100.0f;
                float[] fArray = this.g;
                int n3 = fArray.length;
                int n4 = 0;
                while (n4 < n3) {
                    block80: {
                        block82: {
                            f = fArray[n4];
                            try {
                                try {
                                    if (callSite2 != null) break block80;
                                    n2 = f == f10 ? 0 : (f > f10 ? 1 : -1);
                                    if (callSite2 != null) break block81;
                                }
                                catch (MatchException matchException) {
                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                }
                                if (n2 <= 0) break block82;
                            }
                            catch (MatchException matchException) {
                                throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                            }
                            f10 = f;
                        }
                        ++n4;
                    }
                    if (callSite2 == null) continue;
                }
                n2 = n = 0;
            }
            while (n < b_.c("o", (int)25689, (long)(0x7957A009B7CC11DL ^ l3))) {
                block86: {
                    Object object;
                    CallSite callSite12;
                    float f35;
                    block87: {
                        block88: {
                            float f31;
                            float f32;
                            float f38;
                            block84: {
                                f38 = this.g[(this.h + n) % b_.c("o", (int)25689, (long)(0x7957A009B7CC11DL ^ l3))];
                                try {
                                    block85: {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != null) break block83;
                                                    f32 = f38;
                                                    f31 = 0.0f;
                                                    if (callSite2 != null) break block84;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                                }
                                                if (!(f32 <= f31)) break block85;
                                            }
                                            catch (MatchException matchException) {
                                                throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                            }
                                            if (callSite2 == null) break block86;
                                        }
                                        catch (MatchException matchException) {
                                            throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                        }
                                    }
                                    f32 = 0.5f;
                                    f31 = f38 / f10 * 3.5f;
                                }
                                catch (MatchException matchException) {
                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                }
                            }
                            f35 = f32 + f31;
                            f = f12 + (float)n * f11;
                            Object[] objectArray26 = new Object[2];
                            objectArray26[1] = l2;
                            objectArray26[0] = Float.valueOf(f38);
                            callSite12 = b_.g("Q", (Object)objectArray26, (long)-6307008253507108369L, (long)l3);
                            try {
                                try {
                                    object = n;
                                    if (callSite2 != null) break block87;
                                    if (object != b_.c("o", (int)2071, (long)(0x2357867F69E2AD48L ^ l3))) break block88;
                                }
                                catch (MatchException matchException) {
                                    throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                                }
                                object = b_.c("o", (int)12114, (long)(0x248E3E0623878A11L ^ l3));
                                break block87;
                            }
                            catch (MatchException matchException) {
                                throw b_.g("Q", (Object)matchException, (long)-6312079833419810708L, (long)l3);
                            }
                        }
                        object = b_.c("o", (int)12064, (long)(0x3297E2D5FE4A0A69L ^ l3));
                    }
                    int n5 = object;
                    Object[] objectArray27 = new Object[7];
                    objectArray27[6] = l;
                    objectArray27[5] = new Color((int)b_.g("X", (Object)callSite12, (long)-6306381161956094397L, (long)l3), (int)b_.g("X", (Object)callSite12, (long)-6306692745178993115L, (long)l3), (int)b_.g("X", (Object)callSite12, (long)-6312669119009466628L, (long)l3), n5);
                    objectArray27[4] = Float.valueOf(f13);
                    objectArray27[3] = Float.valueOf(f + f11 - 0.2f);
                    objectArray27[2] = Float.valueOf(f13 - f35);
                    objectArray27[1] = Float.valueOf(f + 0.2f);
                    objectArray27[0] = matrix4f;
                    b_.g("Q", (Object)objectArray27, (long)-6306577832279865182L, (long)l3);
                }
                ++n;
                if (callSite2 == null) continue;
            }
            Object[] objectArray28 = new Object[2];
            objectArray28[1] = Float.valueOf((float)callSite);
            objectArray28[0] = Float.valueOf(f14);
            b_.g("X", (Object)this, (Object)objectArray28, (long)-6307235480764399543L, (long)l3);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = b_.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1192;
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
                throw new RuntimeException("dev/zprestige/prestige/b_", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            b_.I[n2] = l4;
        }
        return I[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x31A;
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
                throw new RuntimeException("dev/zprestige/prestige/b_", exception);
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
            b_.x[n2] = b_.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static int a(Object[] objectArray) {
        Object object;
        block6: {
            int n;
            long l;
            block4: {
                float f;
                block5: {
                    f = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    CallSite callSite = b_.g("Q", (long)-5445832809035347744L, (long)l);
                    try {
                        try {
                            float f10 = f - 0.0f;
                            n = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                            if (callSite != null) break block4;
                            if (n >= 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw b_.g("Q", (Object)matchException, (long)-5444651725569792902L, (long)l);
                        }
                        object = 0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw b_.g("Q", (Object)matchException, (long)-5444651725569792902L, (long)l);
                    }
                }
                n = (int)f;
            }
            object = b_.g("Q", (int)n, (int)b_.c("o", (int)17115, (long)(0x7219E57F1119FB86L ^ l)), (long)-5443635535591979931L, (long)l);
        }
        return object;
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
                        callSite = b_.g("Q", (long)4551593982820172710L, (long)l);
                        try {
                            try {
                                float f11 = f10 - 60.0f;
                                f = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                if (callSite != null) break block11;
                                if (f >= 0) break block12;
                            }
                            catch (MatchException matchException) {
                                throw b_.g("Q", (Object)matchException, (long)4555029761561947964L, (long)l);
                            }
                            return new Color((int)b_.c("o", (int)17935, (long)(0x6DB68CB5FDFA7402L ^ l)), (int)b_.c("o", (int)1397, (long)(0x7BD390C605EFB76BL ^ l)), (int)b_.c("o", (int)19569, (long)(0x785CEE69B2297E67L ^ l)));
                        }
                        catch (MatchException matchException) {
                            throw b_.g("Q", (Object)matchException, (long)4555029761561947964L, (long)l);
                        }
                    }
                    float f12 = f10 - 120.0f;
                    f = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                }
                try {
                    try {
                        if (callSite != null) break block13;
                        if (f >= 0) break block14;
                    }
                    catch (MatchException matchException) {
                        throw b_.g("Q", (Object)matchException, (long)4555029761561947964L, (long)l);
                    }
                    return new Color((int)b_.c("o", (int)26818, (long)(0x5C6AC13C0BF65ACCL ^ l)), (int)b_.c("o", (int)12795, (long)(0x72F3A01334A283E6L ^ l)), (int)b_.c("o", (int)466, (long)(0x3DDFDC0DEE933CEL ^ l)));
                }
                catch (MatchException matchException) {
                    throw b_.g("Q", (Object)matchException, (long)4555029761561947964L, (long)l);
                }
            }
            float f13 = f10 - 200.0f;
            f = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
        }
        try {
            if (f <= 0) {
                return new Color((int)b_.c("o", (int)27797, (long)(0x13434C178205E87L ^ l)), (int)b_.c("o", (int)16757, (long)(0x6012F4D0E9E3736DL ^ l)), (int)b_.c("o", (int)15382, (long)(0x2989F1F565668E03L ^ l)));
            }
        }
        catch (MatchException matchException) {
            throw b_.g("Q", (Object)matchException, (long)4555029761561947964L, (long)l);
        }
        return new Color((int)b_.c("o", (int)31975, (long)(0x64D7D523471BCEFDL ^ l)), (int)b_.c("o", (int)24104, (long)(0x472A268BE4B2EC3FL ^ l)), (int)b_.c("o", (int)8072, (long)(0x48865B572C9D2D97L ^ l)));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b_.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(23.0f);
        objectArray2[0] = Float.valueOf(65.0f);
        b_.g("X", (Object)this, (Object)objectArray2, (long)-3384385456938027903L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = b_.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = b_.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b_.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b_.e(clazz3, string2, clazz2)) != null) {
                    b_.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b_.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b_.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b_.j(3399793477193438L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/b_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = b_.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                b_.K[n] = clazz = Class.forName(L[n]);
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
            return MethodHandles.lookup().findStatic(b_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b_.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(b_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.ah_0;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.n_0;
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Renamed from dev.zprestige.prestige.cg
 */
public class cg_0
extends b4 {
    private static final long a;
    private static final long c;
    private final ah_0 d;
    private bW g;
    private class_2960 h;
    private String i;
    private float k;
    private float l;
    private float o;
    private float p;
    private float t;
    private float u;
    private float j;
    private UUID m;
    private long n;
    private Iterable q;
    private class_1799 r;
    private class_1799 s;
    private long v;
    private long w;
    private static final long x;
    private static final String[] y;
    private static final String[] B;
    private static final Map C;
    private static final long[] D;
    private static final Integer[] H;
    private static final Map I;
    private static final long[] J;
    private static final Long[] K;
    private static final Map L;
    private static final Object[] O;
    private static final String[] P;

    public cg_0(long l) {
        long l2 = l = x ^ l;
        long l3 = l2 ^ 0xD831EC536C8L;
        long l4 = l2 ^ 0x4E607393D2FDL;
        super((String)((Object)cg_0.a("g", (int)21885, (long)(0xF211F73D6C8BD6L ^ l))), (String)((Object)cg_0.a("g", (int)14588, (long)(0x1C7A67625E4F6650L ^ l))), l4);
        this.d = new ah_0(500.0f, false, n_0.BACK_IN_OUT, l3);
        this.i = "";
        this.k = 0.0f;
        this.l = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.j = 0.0f;
        this.n = (long)cg_0.d("i", (int)20758, (long)(0x16E572961FE32B2EL ^ l));
        this.r = cg_0.g("\u00d3", (long)1871138856455175728L, (long)l);
        this.s = cg_0.g("\u00d3", (long)1871138856455175728L, (long)l);
        this.v = (long)cg_0.d("i", (int)9047, (long)(0x460452CEEB7BD96DL ^ l));
        this.w = (long)cg_0.d("i", (int)9047, (long)(0x460452CEEB7BD96DL ^ l));
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
                                cg_0.x = hc.a(506824808904383014L, -5956931756464305661L, MethodHandles.lookup().lookupClass()).a(101526158232761L);
                                cg_0.O = new Object[147];
                                cg_0.P = new String[147];
                                cg_0.b();
                                cg_0.C = new HashMap<K, V>(13);
                                var22 = cg_0.x ^ 74484614031419L;
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
                                var28_5 = "\u0001\u00f0\u00cf\bQk\u00b2YS\u0014\u00acn\u00e2\u0004S\u00b8\u0010\u00e9N\u00f7\f\u0001s\u00b14E\u00af\u00f8\u001c\u00db\u0018\u00c8E\u0010@\t\u00e4\u00aa\u00b2\u00c2,Ck 1\u001f<\u000b\u00e3\u0094";
                                var30_6 = "\u0001\u00f0\u00cf\bQk\u00b2YS\u0014\u00acn\u00e2\u0004S\u00b8\u0010\u00e9N\u00f7\f\u0001s\u00b14E\u00af\u00f8\u001c\u00db\u0018\u00c8E\u0010@\t\u00e4\u00aa\u00b2\u00c2,Ck 1\u001f<\u000b\u00e3\u0094".length();
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
                                    var31_3[var29_4++] = cg_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00aa\u00d4\\\u00cf\u008cSW}\u0084\u00fb\u00efC\u00c9n\u00ea\u00cd\u0091\u009c\u001fx(X{\r\u00ba?$\u0006\u009d0\u00ec\u0092U\u0001,\u00be\u0005\u00fe\u00b96k\u00ad\u00cdV\u00eb\u00edo\u00ber\u00f5\u000e\u00fd\u00d2\u0087\u0089\u00b7\u00c4j\u00ee\u0097\u00b1\u00a8\u00d2!|\u00bb\u00a3p>\u00be\u0093\u0096\u00db#\u00bf\u00f1\u00d5\u00cb\u0082\u0084\u0010\u0018\u00ea%\u00b9C\u00ff\u00de\u00cd!^m@j\u001aT?";
                                    var30_6 = "\u00aa\u00d4\\\u00cf\u008cSW}\u0084\u00fb\u00efC\u00c9n\u00ea\u00cd\u0091\u009c\u001fx(X{\r\u00ba?$\u0006\u009d0\u00ec\u0092U\u0001,\u00be\u0005\u00fe\u00b96k\u00ad\u00cdV\u00eb\u00edo\u00ber\u00f5\u000e\u00fd\u00d2\u0087\u0089\u00b7\u00c4j\u00ee\u0097\u00b1\u00a8\u00d2!|\u00bb\u00a3p>\u00be\u0093\u0096\u00db#\u00bf\u00f1\u00d5\u00cb\u0082\u0084\u0010\u0018\u00ea%\u00b9C\u00ff\u00de\u00cd!^m@j\u001aT?".length();
                                    var27_7 = 80;
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
                                    var31_3[var29_4++] = cg_0.b(var32_9).intern();
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
                        cg_0.y = var31_3;
                        cg_0.B = new String[5];
                        cg_0.I = new HashMap<K, V>(13);
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
                        var15_14 = "\u00db@\u0011+)\u00ed\u00dc\u0017\u0001\"\u00b3.\u00a0\u00bc_I\u00ad\u0099\u00cb\u00ef\u00f37N\u0082l\u00ab\u00ac\u00e6K~4\u0090uL\u009d\u00f6\u0017\u0092zPU!\u00af#\u001c|p`'\u0091-\u0091\u0086:\u00e8\u00cee\u00b7r1\u00df\u00d4\u009b2\u00ce\u0080@\u001cr\u008e\u00c1\u00bb*@/V\f\u00ea\u00e3\u00a1\u00f9=K\"\u00c9\u00a2\u00930\u00cc\u00e0\u00d9\u008e\u00e6q!$\u00bb\u0002\u00105:KWd\u00d9\u00c8\u00fa\u00eb\u00d4\u00daa&u[\u0091\u0011\u008a\u009b\u0082\u00ccQ\u00eb]\u00a3+!\u001b\u0092";
                        var16_15 = "\u00db@\u0011+)\u00ed\u00dc\u0017\u0001\"\u00b3.\u00a0\u00bc_I\u00ad\u0099\u00cb\u00ef\u00f37N\u0082l\u00ab\u00ac\u00e6K~4\u0090uL\u009d\u00f6\u0017\u0092zPU!\u00af#\u001c|p`'\u0091-\u0091\u0086:\u00e8\u00cee\u00b7r1\u00df\u00d4\u009b2\u00ce\u0080@\u001cr\u008e\u00c1\u00bb*@/V\f\u00ea\u00e3\u00a1\u00f9=K\"\u00c9\u00a2\u00930\u00cc\u00e0\u00d9\u008e\u00e6q!$\u00bb\u0002\u00105:KWd\u00d9\u00c8\u00fa\u00eb\u00d4\u00daa&u[\u0091\u0011\u008a\u009b\u0082\u00ccQ\u00eb]\u00a3+!\u001b\u0092".length();
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
                            var15_14 = "F~\u00e9J4>v\u00e9B!\u00bc/\u0018\u00e6\u0092W";
                            var16_15 = "F~\u00e9J4>v\u00e9B!\u00bc/\u0018\u00e6\u0092W".length();
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
                cg_0.D = var17_12;
                cg_0.H = new Integer[18];
                cg_0.L = new HashMap<K, V>(13);
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
                var6_22 = new long[6];
                var3_23 = 0;
                var4_24 = "m\u00bc@3&\u00a2\u00c8?\u0015\u00d6\u0085\u0081\u00b7\u00ed\u00b1\u0016GO4u\u00e9\u0081c`\u00e6\u00ec\u0011\\\u0085\u00d8\u009e\u00b3";
                var5_25 = "m\u00bc@3&\u00a2\u00c8?\u0015\u00d6\u0085\u0081\u00b7\u00ed\u00b1\u0016GO4u\u00e9\u0081c`\u00e6\u00ec\u0011\\\u0085\u00d8\u009e\u00b3".length();
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
lbl173:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "\u00a7U^\u00ae\n\u00fb0\u001dl\u00b0\u00ebB\u00dc\u0012\u0086\u00ec";
                    var5_25 = "\u00a7U^\u00ae\n\u00fb0\u001dl\u00b0\u00ebB\u00dc\u0012\u0086\u00ec".length();
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
lbl192:
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
lbl205:
                // 1 sources

                ** continue;
            }
        }
        cg_0.J = var6_22;
        cg_0.K = new Long[6];
        cg_0.c = (long)cg_0.d("i", (int)4854, (long)(var22 ^ 6657028552509704730L));
        cg_0.a = (long)cg_0.d("i", (int)22799, (long)(var22 ^ 574309989396152801L));
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
        if (P[n3] != null) {
            return n3;
        }
        Object object = O[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 33;
            case 2 -> 45;
            case 3 -> 15;
            case 4 -> 5;
            case 5 -> 26;
            case 6 -> 34;
            case 7 -> 18;
            case 8 -> 16;
            case 9 -> 20;
            case 10 -> 47;
            case 11 -> 17;
            case 12 -> 8;
            case 13 -> 63;
            case 14 -> 24;
            case 15 -> 40;
            case 16 -> 39;
            case 17 -> 14;
            case 18 -> 38;
            case 19 -> 52;
            case 20 -> 4;
            case 21 -> 61;
            case 22 -> 13;
            case 23 -> 60;
            case 24 -> 1;
            case 25 -> 57;
            case 26 -> 51;
            case 27 -> 2;
            case 28 -> 58;
            case 29 -> 29;
            case 30 -> 23;
            case 31 -> 36;
            case 32 -> 10;
            case 33 -> 42;
            case 34 -> 54;
            case 35 -> 32;
            case 36 -> 41;
            case 37 -> 59;
            case 38 -> 37;
            case 39 -> 7;
            case 40 -> 55;
            case 41 -> 35;
            case 42 -> 12;
            case 43 -> 46;
            case 44 -> 0;
            case 45 -> 56;
            case 46 -> 25;
            case 47 -> 3;
            case 48 -> 28;
            case 49 -> 43;
            case 50 -> 6;
            case 51 -> 11;
            case 52 -> 48;
            case 53 -> 22;
            case 54 -> 49;
            case 55 -> 30;
            case 56 -> 21;
            case 57 -> 27;
            case 58 -> 50;
            case 59 -> 31;
            case 60 -> 53;
            case 61 -> 9;
            case 62 -> 62;
            default -> 44;
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
        cg_0.P[n3] = new String(cArray);
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
        Object[] objectArray = O;
        O[0] = "WR\rY\u007fRWR\u001a\u0005s]M\u0019\u001a\u001bsHJhJF\"";
        objectArray[1] = "+CS\u007fI;+CD#E41\bD=E!6y\u0016a\u0010c";
        objectArray[2] = "!Fa\u001fp;7FdEc, \rgCo81JpT$)q";
        objectArray[3] = "?/G\u0011boJ\u000fL\u001es +\u0001G\u0015wz_";
        objectArray[4] = Void.TYPE;
        cg_0.P[4] = "java/lang/Void";
        objectArray[5] = "o&\u001bM\r9y&\u001e\u0017\u001e.nm\u001d\u0011\u0012:\u007f*\n\u0006Y.3";
        objectArray[6] = "6%\u0011$\u001fFC\u0005\u001a+\u000e\t\"\u000b\u0011 \nSV";
        objectArray[7] = Float.TYPE;
        cg_0.P[7] = "java/lang/Float";
        objectArray[8] = Integer.TYPE;
        cg_0.P[8] = "java/lang/Integer";
        objectArray[9] = "\u001b\u00036\u0007<\u001d\r\u00033]/\n\u001aH0[#\u001e\u000b\u000f'Lh\f:";
        objectArray[10] = "#X\u001c\u0012\u0007hVx\u0017\u001d\u0016'7v\u001c\u0016\u0012}C";
        objectArray[11] = "v@\u0019\u007fD\"v@\u000e#H-l\u000b\u000e=H8kz\\g\u001c|";
        objectArray[12] = "\u001b\rGspn\u001b\rP/|a\u0001FP1|t\u00067\u0002j$>";
        objectArray[13] = "H\u000fJ\u0011\u001d\u0016^\u000fOK\u000e\u0001IDLM\u0002\u0015X\u0003[ZI\u0007d";
        objectArray[14] = "\u000e\u001f)\u0003_V{?\"\fN\u0019\u0006'1\u000bGPn";
        objectArray[15] = "B$[^\u000eA7\u0004PQ\u001f\u000eV\n[Z\u001bT\"";
        objectArray[16] = "CGh[\u000fT^R0yNYFT";
        objectArray[17] = "[!\u0000\b]mM!\u0005RNzZj\u0006TBnK-\u0011C\t~X";
        objectArray[18] = ";$i\u0016GM0+xY$@%&w2\u0011B45k\u001e\u0006O";
        objectArray[19] = "fhSU\u0016\u0000fhD\t\u001a\u000f|#D\u0017\u001a\u001a{R\u0015BMY";
        objectArray[20] = "UTs\u0001\bE^[bNiKUPf\u0014";
        objectArray[21] = Boolean.TYPE;
        cg_0.P[21] = "java/lang/Boolean";
        objectArray[22] = "y\u0010$UsUy\u00103\t\u007fZc[3\u0017\u007fOd*gO(";
        objectArray[23] = "2CH\u0000>\u000e9LYOC\u0016*KP\u0006";
        objectArray[24] = "y!Cqh{y!T-dtcjT3dad\u001b\u0001k5";
        objectArray[25] = "Ot[\u0012\u0014DOtLN\u0018KU?LP\u0018^RN\u0017\nA\u0018";
        objectArray[26] = "jm\u001fNOw\u001fM\u0014A^8~C\u001fJZb\n";
        objectArray[27] = "\u0012Z@JvI\u0012ZW\u0016zF\b\u0011W\bzS\u000f`\u0002W/";
        objectArray[28] = "9\u00117o\u001e\u0017'\u0019- e7\u001a4";
        objectArray[29] = ".\u0007e\u0014Zb.\u0007rHVm4LrVVx3=%\t\u0000";
        objectArray[30] = "W\u00050\u0019\n8W\u0005'E\u00067MN'[\u0006\"J?u\u0004We";
        objectArray[31] = "u\u0006_1\u000fMk\u000eE~hLz\u0015H$NJ";
        objectArray[32] = "n`#\u000e\u0002\n\u001b@(\u0001\u0013EzN#\n\u0017\u001f\u000e";
        objectArray[33] = "e\u0012I\u001dIBs\u0012LGZUdYOAVAu\u001eXV\u001dPV";
        objectArray[34] = "TMQ\u0012\u007f6!mZ\u001dny@cQ\u0016j#4";
        objectArray[35] = "IC\u000f\u001fg+_C\nEt<H\b\tCx(YO\u001eT3=\u001d";
        objectArray[36] = "N0\u00044P[;\u0010\u000f;A\u0014Z\u001e\u00040EN.";
        objectArray[37] = "\u0017I{\fkY\u0017IlPgV\r\u0002lNgC\ns>\u00106\u0007@\blNgC\ns>\u00106\bH";
        objectArray[38] = "CC&C\nHCC1\u001f\u0006GY\b1\u0001\u0006R^yc_^\u0016";
        objectArray[39] = "\nB0LGN\u001cB5\u0016TY\u000b\t6\u0010XM\u001aN!\u0007\u0013]\u0002N#\fI\u0010>U#\u0011IW\tB";
        objectArray[40] = ">D15?>(D4o,)?\u000f7i =.H ~k-\u0019";
        objectArray[41] = "\u0014vQw\u00181\u0002vT-\u000b&\u0015=W+\u00072\u0004z@<L%1";
        objectArray[42] = "\u0004-2\u0006\u0013\u001cq\r9\t\u0002S\u0010\u00032\u0002\u0006\td";
        objectArray[43] = ")\u001f*9.L?\u001f/c=[(T,e1O9\u0013;rz_\f";
        objectArray[44] = "\u001a\u00059\u000f|\u0015o%2\u0000mZ\u000e+9\u000bi\u0000z";
        objectArray[45] = "\u00126A\u0012?h\u0010(\bq4s\u000f-^\b3";
        objectArray[46] = "\u0000g?8:#\u0000g(d6,\u001a,(z69\u001d]r$`~";
        objectArray[47] = ",\\\u0003\u001f9\u007f:\\\u0006E*h-\u0017\u0005C&|<P\u0012Tmk\n";
        objectArray[48] = "l~\r\u0015B\u0003\u0019^\u0006\u001aSLxP\r\u0011W\u0016\f";
        objectArray[49] = "`\u001bP\u0004I3`\u001bGXE<zPGFE)}!\u0016\u001f\u0012k";
        objectArray[50] = "\u0018xO6}5\u0006pUy\u0010/\u001eu\\4')\u001dwJ";
        objectArray[51] = "\u0001)F\u0016>h\u001f!\\Y\\t\u0018<";
        objectArray[52] = "'J\t\u001a\u001eA1J\f@\rV&\u0001\u000fF\u0001B7F\u0018QJP+";
        objectArray[53] = "lw\u0006\u0000\u001f!\u0019W\r\u000f\u000enxY\u0006\u0004\n4\f";
        objectArray[54] = "$x/\u00174(QX$\u0018%g0V/\u0013!=D";
        objectArray[55] = "S=ST<\u0007&\u001dX[-HG\u0013SP)\u00123";
        objectArray[56] = "\u000fpgUsS\u0004\u007fv\u001a\u000eF\u0016etY";
        objectArray[57] = Long.TYPE;
        cg_0.P[57] = "java/lang/Long";
        objectArray[58] = "zv\"\u0017j.lv'My9{=$Ku-jz3\\>:z";
        objectArray[59] = "kE{6\u001f0\u001eep9\u000e\u007f\u007fk{2\n%\u000b";
        objectArray[60] = "Qqz\u0011FJZ~k^!R^bm\u0012\u0004C";
        objectArray[61] = "\u0007\u0004}(|\u0011r$v'm^\u0013*},i\u0004g";
        objectArray[62] = "tP\n9/YvNCZ$BiK\u0015##U";
        objectArray[63] = "\u0004W\u001eR\u0004g\u000fX\u000f\u001dic\u000fD;V[~\u000bX\u000bV";
        objectArray[64] = "#c\u0018\u0007b\u0013VC\u0013\bs\\7M\u0018\u0003w\u0006C";
        objectArray[65] = "^:kJ\u0011f+\u001a`E\u0000)J\u0014kN\u0004s>";
        objectArray[66] = "\u0003\n9+<\u0016v*2$-Y\u0017$9/)\u0003c";
        objectArray[67] = "dmG\u0014k\u0001\u0011ML\u001bzNpCG\u0010~\u0014\u0004";
        objectArray[68] = "cQcu\u001e\u0002\u0016qhz\u000fMw\u007fcq\u000b\u0017\u0003";
        objectArray[69] = ".IqN09[izA!v:gqJ%,N";
        objectArray[70] = "KK\u001c;F'@D\rt%*UB";
        objectArray[71] = Double.TYPE;
        cg_0.P[71] = "java/lang/Double";
        objectArray[72] = ":\u0018l:5\u0013O8g5$\\.6l> \u0006Z";
        objectArray[73] = "$:7X\tyQ\u001a<W\u001860\u00147\\\u001clD";
        objectArray[74] = "\u0018kD+|pmKO$m?\fED/iex";
        objectArray[75] = ">38b\u001f\b$!B~M\u0011.7.L\u001aWp`y\u001bY\\*a$vB\u000b\"P";
        objectArray[76] = "7am-Q98xr<20\"`u I]6&f.L<&bl:23bbr:M34gaD";
        objectArray[77] = "2Wio;z(E\u0013xer&XD/;%~4}s:g~\u0005}d`q";
        objectArray[78] = "\u0005X!!6~\u0005Wy'\t{\u0003S?0Nkj\n+%k:R\fslm\u0005\u0005X!!6~\u0005Wy'\t";
        objectArray[79] = "Gw8\u001fhGFo|J\u0014\\El'\u0012xn\u0015*wL,9Hi>NqZ\u0017(-\f\u0014";
        objectArray[80] = "\u0016>\",!z\fic/Pk\u0015.98*\u0007\u0016>\",!z\fic/P";
        objectArray[81] = "[-/\u0003V,\t-o@$<b{:\u001a]d\u0005?.JY?bx%O@a\u001b?)\u001aC]";
        objectArray[82] = "\\iEu],\u000b+\\\u007f:w\u0001/[tVERk\u0007,:\"\u001c9\u0001oW\"\u000fbA\u0013";
        objectArray[83] = "\\SpG\u0006^\u0019\u0013g\u0019eF`Rw\u0014\u001c\u0015\u0007\u0016cD\u0018N`Vp\u0007\u0007\u0013XP(N\u0001,";
        objectArray[84] = ")~\u0003MLD-(\u0007O3^&9\u0018R_lquG\f3Y/<\u001f\rV@w/\u00025\\\\4/\u0004K]Dpzx";
        objectArray[85] = "J>\u000e~4eP,tijm^1#>4=\u0007]\u00178r=_'\bxud";
        objectArray[86] = "n\u0003o\u0010KPk]1\u0007\"XgFn\u000fNj7\u000b4S\"ReYrWYRj\u0001th";
        objectArray[87] = "9T/\rap0Y+C\u0006/4_\u0015\u0010v3]Jj\u0002h1\"J<\u0007{O";
        objectArray[88] = "\u0019\u0004\u0004Y\u001d\u0018\u0011\n[@\u007f\u001dsOQW\u0006M\u0014\u000bE\u0007\u0002\u0016s\u001cUD\u0006\u0005\u000e\u0006\u0002\u0005\u0005t";
        objectArray[89] = "\u001f>\u0005\u0019n^\u001e?H\u0016^]ygZ\u0019'\b\u001e#NI#Sy8TC5\u0001\u00169U\u000e:1";
        objectArray[90] = "\u00109\u0019p\u0003\u0018\u001c4Npy\u000fwo\u001ay\u0000_\u0010+\u000e)\u0004\u0004wfNl\u001f\u0001I1\fu\u0015f";
        objectArray[91] = "f\u000bHLYt9J[\u000e<|a\u0017I \u0005)<L1\u000fMwj\u000fK\u001dF(>r";
        objectArray[92] = " zWcEOw8Ni\"\u0014}<IbN&-\u007f\u00124\"\bh#\u0010}\u0013\u001fo!F\u0005\u001f\u0018h\"\u0016=\u0019@!$)";
        objectArray[93] = "qWL\u0005\u001c\u001bwBXZu\f\u000bFYD\f\u001ajL\t\u0005\u0010";
        objectArray[94] = "\u001fiB\u0010hN\u0019w\u0003\u001a\u000fZd-T\u001ev\u001e\u0003i@NrEd.KKk\u001b\u001diG\u001eh'";
        objectArray[95] = "~\u000f\f\r\f+:\u0015J\t1d\u0002I\u001a\u000bH#e\r\u000e[Lx\u0002J\u0005^U&{\r\t\u000bV\u001a";
        objectArray[96] = "e2sb\u0018\u0006g!'`\"\u0015a#(kF\u0000g'N-K\u0011yuv+\u0013X\u007fJsyZ\u000b$ru!\u0013\r\u001bw'h@V#q\u007f!Fie2sb\u0018\u0006g!'`\"";
        objectArray[97] = "\u0015(f\u0002*XP/c\u0001QU\u000b~z\u0001\u0006\u0007[)$QQDQkq\u00162\u0001Vnr";
        objectArray[98] = ">\u0004k`\u001a\u0012iFrj}IcBua\u0011{0\u0006.<}\u0011gFw9E\u0017?\u000fq\u0006";
        objectArray[99] = "`rs\u0011G&`a(Q;%1o}Gl{h9&+\u000b;:8eF\u000b(ax";
        objectArray[100] = "7^<FC\u0019?Pc_!\u001c]Gd\u001c\u001e\u000e$Q`\u001eSu6O8\u001cZ\f K:Q!";
        objectArray[101] = "qHjy\u0017S?\t60m\u001b\u000e\n>)\u0014ZiN*y\u0010\u0001\u000e\t!|\t_wN-)\nc";
        objectArray[102] = "v9%v\u001bO!{<||\u0014+\u007f;w\u0010&{?d/|\u0000~>ch\u0001\n\u007fe \u0010";
        objectArray[103] = "ZR\u0001=g.\bRA~\u00156c\u0004\u0014$lf\u0004@\u0000th=c\u0007\u000bqqc\u001a@\u0007$r_";
        objectArray[104] = "\tY\u0001-\u0012x\u0013\u000e@.co\u0019R\u00164\u001fh\u00193\u0013>\u001b|\u0012N\tiZ\u007fc";
        objectArray[105] = "\nBKSpZ\nPJY\u000fI\u0016@\\\u0012t^{LM\u0005j\b\u001e\u000e]\u0004h3AO\u000f\f3J\u0006CZ\u000f\u000f";
        objectArray[106] = "y36\u0014\u000b*\u007f&\"Kb0\u0003>'I\u0000,}2*\u001e\u0000";
        objectArray[107] = ")Nl@<N~\fuJ[\u0015t\brA7''L-\u0017[@i\u001e(Z6@zEh&";
        objectArray[108] = "T2Hi$]Qr\u0011kq<\u0004\n\u0012\u007fvETmVk&A\u000f\n\u0011`#XQsVlv[m";
        objectArray[109] = "F*d{aeCj=y4\u0004\u0016\u0012>m3}Fuzycy\u001d\u0012:j f@*<2i`\u007f";
        objectArray[110] = "\u0005\u0012H.c7@\u0015M-\u00185\u0006DJ(d3\u0000)T1d$\u001d\u0016]<`jz";
        objectArray[111] = "\n\u000f:\u001dP4\u0005_a\u001f9a4Vl\r@3S\u0012x]Dh4Rk\u001e[5\fT3W]\n";
        objectArray[112] = "E\u001cm\u0014(\u0000\u0019B|Ne;\u0017[j\u0004y]\u0000zq\u001by~\u001dBt\u001fo;E\u001db\u0007)\u0004\u0006Xh\u0002v;";
        objectArray[113] = "H:Ao$\u0016H5\u0019i\u001b\u0000^(Kw`mJnXye\fZ*Rm\u001b\u0003\u001e*Lmd\u0003H/_\u0013";
        objectArray[114] = "[\u00163G\u00021@A;v\u00011^G0\u001a3`\u001e\u0017fvZgKW9\u0017]9[\u0017W";
        objectArray[115] = "\u001e)\u0017XFa_q\u0006\u001dY\u001bK\u0015U\u000fSb\u001er\u0011\u001b\u0003fE\u0015V\u0010\u0006\u007f\u001bl\u0011\u001cS|'";
        objectArray[116] = "s\f\u001c8M\u0013|\\G:$DMUJ(]\u0014*\u0011^xYOMQM;F\u0012uW\u0015r@-";
        objectArray[117] = "8KH\u0013Jjg\u000eBL\u0007\f`\nW\f\u001fpf\f:\u0012\u0006pq\u0011\u0005\u001b\u000bt?v";
        objectArray[118] = "w\u0016%T@c!F#\u0002={FL5\u0019G}y\u00144\bB\u0011";
        objectArray[119] = "\u0003,J_\u001f\u000f\t-\u0011\u001cg\u001d\u001fh,\u001b\u001d\u0013\u0014{w\b\b\u0011\u000e+\f\b\u0007I\b\u0014";
        objectArray[120] = "\u0013f]<sj\u001c6\u0006>\u001a8-?\u000b,cmJ{\u001f|g6-l\u000f?c%PvX~`T";
        objectArray[121] = "q\u001e[H9iq\r\u0000\bEa,\u0012Q\u0015)S~_\u000fJEjx\u0011_\f:j.\u0014Lr";
        objectArray[122] = "\r<|>\bs\u001f7#jub\u0012(d\u0005N7Or\u001c>\tx\u001c.x1\u0010g\rM";
        objectArray[123] = "\u0017\u0005V0C \r\u0017,,\u00119\u0007\u0001@\u001eExY\\,+G>\u001f\u0019S/\u0011:\u001df";
        objectArray[124] = "?wU\u0010a@q6\tY\u001b\u0014@5\u0001@bI'q\u0015\u0010f\u0012@6\u001e\u0015\u007fL9q\u0012@|p";
        objectArray[125] = "s82\u0019\u0001\u001aq+f\u001b;\u0010p$\u000fR\u0004\u001f\u007f/7\u001a\u0001Db<\u000f\u0015CH\u007fz`\u0017P\u001c}@q\u0013\u0006\u00077/s\u0000R\u0005\r";
        objectArray[126] = "\u0004R\u0006'g#\u0004]^!X\"\u0006E\u0001235k\u0004U1e\"UP\u0014e7>k\u0004U1e\"UP\u0014e7>kR\n8$g\u0010R\u0005`\"X";
        objectArray[127] = "W\u001c\u0005\t\u001d!\u0019]Y@ga(^QY\u001e(O\u001aE\t\u001as(]N\f\u0003-Q\u001aBY\u0000\u0011";
        objectArray[128] = "F7CO-\u0000\u0011uZEJ[\u001bq]N&iH5\u0003\u0016J\u0003\u001fu_\u0016r\u0005G<Y)";
        objectArray[129] = "\u000flI$\u0002*\u0014;A\u0015\u0001*\n=Jy3{Ke\u0013\u0015Z|\u001f-Ct]\"\u000fm-";
        objectArray[130] = "\u001cOi\u0000W\u007f\u0016\u001f(\u001c*wg\u001dv\u0012S'\u0000YbBW|gXg\u0001G#V\u001c}GC\u001e";
        objectArray[131] = ")%I\u0002\u001da (MLz8 %Ir\u0017e7?K\u0013\u0007!=+5";
        objectArray[132] = "U<1\u0017\u0012\u0002W/e\u0015(\u0016@-h\b(PB<nZ\u0010V\u001auhe\u0015\u0004S&3]\u0013\\\u001a \fXA\u0015I{4^\u0019\\ODr\u001d\u0015\u001f\u0011+p\u000eA\u001d+";
        objectArray[133] = ";X0D\u0010\u001a=FqNw\u001a@\u001c&J\u000eJ'X2\u001a\n\u0011@O\"Y\u000e\u0002=Uu\u0018\rs";
        objectArray[134] = "OC\u00181d]\u000bY^5Y\u00073\u0005\u000e7 UTA\u001ag$\u000e3\u0001\t$;S\u000b\u0007Qm=l";
        objectArray[135] = "\u0017\u0012\u007f\u0003r\u0005\rE>\u0000\u0003'=9[7\u0003\u0012\u0017\u0000~\u000b~\b@A}";
        objectArray[136] = "zy\u0004\b4\u000048XANY\u0005;PX7\tb\u007fD\b3R\u0005l\u0007L NzlQI30";
        objectArray[137] = "wI\rZB\u000fn\u0011\u001eGz\u0007lP\u001dY\u0001jx\u0016\u000eW\u0004\u000bhR\u0004Cz\u0004,R\u001aC\u0005\u0004zW\t=";
        objectArray[138] = "$|\u0007'v\u001cs>\u001e-\u0011Gy:\u0019&}u)xG~\u0011@p?\u001eytY(,\u0003A";
        objectArray[139] = "\"cTt{\u000e`sUv@\u0002<s9|{\u0011:aXl?\u001b.\u001fW(?\u0005.`W~:\u0016P";
        objectArray[140] = "/w\u0011-E;x5\b'\"`r1\u000f,NR!tV{\"a&,\u0017\"Odxr\u0000K\u0012uuw\u0013&\u0012f.7o";
        objectArray[141] = "ib:d!n-x|`\u001c6\u0015$,befr`82a=\u0015 +q~`-&s8x_";
        objectArray[142] = "\u001a9\u001bN\u0010?A4\u0015\u001bF\u000eH?\u000b\u0015,7O*\fOQpE2\u0007\f,7O*\fOQpE2\u0007\f,";
        objectArray[143] = "FB\u0017[XFI\u0012LY1\u0012x\u001bAKHA\u001f_U\u001bL\u001ax\u001fFXSG@\u0019\u001e\u0011Ux";
        objectArray[144] = "cLt\u0012\u000fAkB+\u000bmF\t\u0007!\u001c\u0014\u0014nC5L\u0010O\t\u0003&\u000f\u000f\u00121\u0005~F\t-";
        objectArray[145] = "\u0006+>G\u0006>B1xC;pzm(AB6\u001d)<\u0011Fmzn7\u0014_3\u0003);A\\\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[146] = "\rX?c\u001bCVU16MrQZ>\\\u001a\u001bLQqd\u001cC\u0005WNaN\nV\fvg\u0016CP3s5_\u0010\u000b\u000bum\u0016\u00164";
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1BBE;
        if (H[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = D[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])I.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    I.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cg_0.H[n2] = n3;
        }
        return H[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cg_0.c(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/cg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cg_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == 's' || c == '\u00d3' || c == 'P') {
                field = cg_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cg_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00db' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private float c(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = x ^ l) ^ 0x5D021D7A8B18L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(1.0f);
        objectArray2[1] = Float.valueOf(0.0f);
        objectArray2[0] = Float.valueOf((float)((cg_0.g("\u00e4", (Object)class_16572, (long)6454487718143054670L, (long)l) + cg_0.g("\u00e4", (Object)class_16572, (long)6461112606201669725L, (long)l)) / 20.0f));
        return (float)cg_0.g("\u00db", (Object)objectArray2, (long)6455727113930914227L, (long)l);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cg_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cg_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = cg_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cg_0.f(classArray[i], string, clazz2);
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
        block93: {
            block114: {
                block94: {
                    block118: {
                        block119: {
                            block116: {
                                block112: {
                                    block113: {
                                        block111: {
                                            block109: {
                                                block107: {
                                                    block108: {
                                                        block105: {
                                                            block106: {
                                                                block121: {
                                                                    block103: {
                                                                        block102: {
                                                                            block101: {
                                                                                block99: {
                                                                                    block122: {
                                                                                        block98: {
                                                                                            block97: {
                                                                                                block95: {
                                                                                                    block96: {
                                                                                                        block92: {
                                                                                                            block91: {
                                                                                                                block90: {
                                                                                                                    block89: {
                                                                                                                        block88: {
                                                                                                                            block87: {
                                                                                                                                block120: {
                                                                                                                                    block86: {
                                                                                                                                        block85: {
                                                                                                                                            var2_2 = (aq_0)var1_1[0];
                                                                                                                                            var4_3 = (gK)var1_1[1];
                                                                                                                                            var3_4 = (Matrix4f)var1_1[2];
                                                                                                                                            var5_5 = (Long)var1_1[3];
                                                                                                                                            v0 = var5_5;
                                                                                                                                            var7_6 = v0 ^ 13977059902564L;
                                                                                                                                            var9_7 = v0 ^ 62047849716439L;
                                                                                                                                            var11_8 = v0 ^ 121708693431506L;
                                                                                                                                            var13_9 = v0 ^ 117880139760215L;
                                                                                                                                            var15_10 = v0 ^ 54030867045760L;
                                                                                                                                            var17_11 = v0 ^ 91799118475102L;
                                                                                                                                            var19_12 = v0 ^ 93148276620004L;
                                                                                                                                            var21_13 = v0 ^ 27786335669325L;
                                                                                                                                            var23_14 = v0 ^ 102693909475685L;
                                                                                                                                            var25_15 = v0 ^ 67219672616543L;
                                                                                                                                            var27_16 = v0 ^ 96836794377851L;
                                                                                                                                            var29_17 = v0 ^ 131934975778103L;
                                                                                                                                            var31_18 = v0 ^ 6014253680539L;
                                                                                                                                            var33_19 = v0 ^ 51003133856837L;
                                                                                                                                            var35_20 = v0 ^ 64450247846539L;
                                                                                                                                            var37_21 = v0 ^ 64771341888446L;
                                                                                                                                            var39_22 = v0 ^ 96557814079126L;
                                                                                                                                            var41_23 = v0 ^ 101037798966850L;
                                                                                                                                            var43_24 = v0 ^ 132551805609406L;
                                                                                                                                            var45_25 = v0 ^ 26251524285181L;
                                                                                                                                            this.w = (long)(cg_0.g("\u00db", (long)-6311120695340926770L, (long)var5_5) - this.v);
                                                                                                                                            this.v = (long)cg_0.g("\u00db", (long)-6311120695340926770L, (long)var5_5);
                                                                                                                                            var47_26 = cg_0.g("\u00db", (long)-6310685330443089995L, (long)var5_5);
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v1 = cg_0.b;
                                                                                                                                                    if (var47_26 != null) break block85;
                                                                                                                                                    if (!(cg_0.g("I", (Object)v1, (long)-6313150441361268637L, (long)var5_5) instanceof g8)) break block86;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v2) {
                                                                                                                                                    throw cg_0.g("\u00db", (Object)v2, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                                                }
                                                                                                                                                v1 = cg_0.b;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v3) {
                                                                                                                                                throw cg_0.g("\u00db", (Object)v3, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v4 = cg_0.g("I", (Object)v1, (long)-6312637254138954558L, (long)var5_5);
                                                                                                                                        break block120;
                                                                                                                                    }
                                                                                                                                    v4 = cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6310411190010621805L, (long)var5_5), (Object)new Object[0], (long)-6313796878133756321L, (long)var5_5);
                                                                                                                                }
                                                                                                                                var48_27 = v4;
                                                                                                                                try {
                                                                                                                                    v5 = var48_27;
                                                                                                                                    if (var47_26 != null) break block87;
                                                                                                                                    if (v5 == null) break block88;
                                                                                                                                }
                                                                                                                                catch (MatchException v6) {
                                                                                                                                    throw cg_0.g("\u00db", (Object)v6, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                                }
                                                                                                                                v5 = var48_27;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (cg_0.g("\u00e4", (Object)v5, (long)-6317159571566343774L, (long)var5_5) != null && cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.b, (long)-6311642901244545009L, (long)var5_5), (Object)cg_0.g("\u00e4", (Object)var48_27, (long)-6317159571566343774L, (long)var5_5), (long)-6313126677338011187L, (long)var5_5) != null) break block88;
                                                                                                                            }
                                                                                                                            catch (MatchException v7) {
                                                                                                                                throw cg_0.g("\u00db", (Object)v7, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                            }
                                                                                                                            var48_27 = null;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v8 = this.d;
                                                                                                                                if (cg_0.g("I", (Object)cg_0.b, (long)-6313150441361268637L, (long)var5_5) instanceof g8 || var48_27 == null) break block89;
                                                                                                                            }
                                                                                                                            catch (MatchException v9) {
                                                                                                                                throw cg_0.g("\u00db", (Object)v9, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                            }
                                                                                                                            v10 = true;
                                                                                                                            break block90;
                                                                                                                        }
                                                                                                                        catch (MatchException v11) {
                                                                                                                            throw cg_0.g("\u00db", (Object)v11, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v10 = false;
                                                                                                                }
                                                                                                                v12 = new Object[2];
                                                                                                                v12[1] = var7_6;
                                                                                                                v12[0] = v10;
                                                                                                                cg_0.g("\u00e4", (Object)v8, (Object)v12, (long)-6310293733971395918L, (long)var5_5);
                                                                                                                var49_28 = 130.0f;
                                                                                                                var50_29 = 40.0f;
                                                                                                                try {
                                                                                                                    if (!(cg_0.g("I", (Object)cg_0.b, (long)-6313150441361268637L, (long)var5_5) instanceof g8)) break block91;
                                                                                                                    v13 /* !! */  = 1.0f;
                                                                                                                    break block92;
                                                                                                                }
                                                                                                                catch (MatchException v14) {
                                                                                                                    throw cg_0.g("\u00db", (Object)v14, (long)-6309699942126744216L, (long)var5_5);
                                                                                                                }
                                                                                                            }
                                                                                                            v15 = new Object[1];
                                                                                                            v15[0] = var9_7;
                                                                                                            v13 /* !! */  = (float)cg_0.g("\u00e4", (Object)this.d, (Object)v15, (long)-6310376256399257018L, (long)var5_5);
                                                                                                        }
                                                                                                        var51_30 = v13 /* !! */ ;
                                                                                                        try {
                                                                                                            if (var47_26 != null) break block93;
                                                                                                            if (!(var51_30 > 0.01f)) break block94;
                                                                                                        }
                                                                                                        catch (MatchException v16) {
                                                                                                            throw cg_0.g("\u00db", (Object)v16, (long)-6309699942126744216L, (long)var5_5);
                                                                                                        }
                                                                                                        var52_31 /* !! */  = new Matrix4f();
                                                                                                        cg_0.g("\u00e4", (Object)var52_31 /* !! */ , (float)(this.e + var49_28 / 2.0f), (float)(this.f + var50_29 / 2.0f), (float)0.0f, (long)-6309987503258323451L, (long)var5_5);
                                                                                                        cg_0.g("\u00e4", (Object)var52_31 /* !! */ , (float)var51_30, (float)var51_30, (float)var51_30, (long)-6316461976004890367L, (long)var5_5);
                                                                                                        cg_0.g("\u00e4", (Object)var52_31 /* !! */ , (float)(-this.e - var49_28 / 2.0f), (float)(-this.f - var50_29 / 2.0f), (float)0.0f, (long)-6309987503258323451L, (long)var5_5);
                                                                                                        var52_31 /* !! */  = cg_0.g("\u00e4", (Object)var3_4, (Object)var52_31 /* !! */ , (Object)new Matrix4f(), (long)-6311443310971271979L, (long)var5_5);
                                                                                                        v17 = new Object[10];
                                                                                                        v17[9] = var25_15;
                                                                                                        v17[8] = new Vector4f(4.0f);
                                                                                                        v17[7] = 5;
                                                                                                        v17[6] = Float.valueOf(var50_29);
                                                                                                        v17[5] = Float.valueOf(var49_28);
                                                                                                        v17[4] = Float.valueOf(this.f);
                                                                                                        v17[3] = Float.valueOf(this.e);
                                                                                                        v17[2] = var52_31 /* !! */ ;
                                                                                                        v17[1] = var4_3;
                                                                                                        v17[0] = var2_2;
                                                                                                        cg_0.g("\u00db", (Object)v17, (long)-6311072829604786728L, (long)var5_5);
                                                                                                        v18 = new Object[8];
                                                                                                        v18[7] = var13_9;
                                                                                                        v18[6] = new Vector4f(4.0f);
                                                                                                        v18[5] = cn_0.r;
                                                                                                        v18[4] = Float.valueOf(this.f + var50_29);
                                                                                                        v18[3] = Float.valueOf(this.e + var49_28);
                                                                                                        v18[2] = Float.valueOf(this.f);
                                                                                                        v18[1] = Float.valueOf(this.e);
                                                                                                        v18[0] = var52_31 /* !! */ ;
                                                                                                        cg_0.g("\u00db", (Object)v18, (long)-6313508486646223040L, (long)var5_5);
                                                                                                        if (var48_27 == null) break block121;
                                                                                                        var53_32 = cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.b, (long)-6311642901244545009L, (long)var5_5), (Object)cg_0.g("\u00e4", (Object)var48_27, (long)-6317159571566343774L, (long)var5_5), (long)-6313126677338011187L, (long)var5_5), (long)-6312428400291579583L, (long)var5_5), (long)-6313874175894955225L, (long)var5_5), (long)-6311526736107815971L, (long)var5_5);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var47_26 != null) break block95;
                                                                                                                if (cg_0.g("\u00e4", (Object)var53_32, (Object)this.h, (long)-6312564292365481685L, (long)var5_5) != false) break block96;
                                                                                                            }
                                                                                                            catch (MatchException v19) {
                                                                                                                throw cg_0.g("\u00db", (Object)v19, (long)-6309699942126744216L, (long)var5_5);
                                                                                                            }
                                                                                                            this.h = var53_32;
                                                                                                            v20 = new Object[2];
                                                                                                            v20[1] = var43_24;
                                                                                                            v20[0] = var53_32;
                                                                                                            this.g = cg_0.g("\u00db", (Object)v20, (long)-6314005665866644149L, (long)var5_5);
                                                                                                        }
                                                                                                        catch (MatchException v21) {
                                                                                                            throw cg_0.g("\u00db", (Object)v21, (long)-6309699942126744216L, (long)var5_5);
                                                                                                        }
                                                                                                    }
                                                                                                    this.i = cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)var48_27, (long)-6309559423524657323L, (long)var5_5), (long)-6310766054216865828L, (long)var5_5);
                                                                                                }
                                                                                                var54_34 = cg_0.g("\u00e4", (Object)var48_27, (long)-6309829139821813070L, (long)var5_5) + cg_0.g("\u00e4", (Object)var48_27, (long)-6316735966866826847L, (long)var5_5);
                                                                                                try {
                                                                                                    this.k = (float)cg_0.g("\u00db", (double)((double)var54_34), (long)-6316917749942831383L, (long)var5_5);
                                                                                                    v22 = new Object[2];
                                                                                                    v22[1] = var45_25;
                                                                                                    v22[0] = var48_27;
                                                                                                    this.o = (float)cg_0.g("\u00e4", (Object)this, (Object)v22, (long)-6317852752048614846L, (long)var5_5);
                                                                                                    v23 = this;
                                                                                                    v24 = cg_0.g("I", (Object)cg_0.b, (long)-6312637254138954558L, (long)var5_5);
                                                                                                    if (var47_26 != null) break block97;
                                                                                                    if (v24 == null) break block98;
                                                                                                }
                                                                                                catch (MatchException v25) {
                                                                                                    throw cg_0.g("\u00db", (Object)v25, (long)-6309699942126744216L, (long)var5_5);
                                                                                                }
                                                                                                v24 = var48_27;
                                                                                            }
                                                                                            v26 /* !! */  = (float)cg_0.g("\u00e4", (Object)v24, (Object)cg_0.g("I", (Object)cg_0.b, (long)-6312637254138954558L, (long)var5_5), (long)-6313627977420241968L, (long)var5_5);
                                                                                            break block122;
                                                                                        }
                                                                                        v26 /* !! */  = 0.0f;
                                                                                    }
                                                                                    try {
                                                                                        block100: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v23.j = v26 /* !! */ ;
                                                                                                        v27 = this;
                                                                                                        if (var47_26 != null) break block99;
                                                                                                        if (v27.m == null) break block100;
                                                                                                    }
                                                                                                    catch (MatchException v28) {
                                                                                                        throw cg_0.g("\u00db", (Object)v28, (long)-6309699942126744216L, (long)var5_5);
                                                                                                    }
                                                                                                    v29 = cg_0.g("\u00e4", (Object)this.m, (Object)cg_0.g("\u00e4", (Object)var48_27, (long)-6317159571566343774L, (long)var5_5), (long)-6317393157615863069L, (long)var5_5);
                                                                                                    if (var47_26 != null) break block101;
                                                                                                }
                                                                                                catch (MatchException v30) {
                                                                                                    throw cg_0.g("\u00db", (Object)v30, (long)-6309699942126744216L, (long)var5_5);
                                                                                                }
                                                                                                if (v29 == false) {
                                                                                                }
                                                                                                ** GOTO lbl215
                                                                                            }
                                                                                            catch (MatchException v31) {
                                                                                                throw cg_0.g("\u00db", (Object)v31, (long)-6309699942126744216L, (long)var5_5);
                                                                                            }
                                                                                        }
                                                                                        this.m = cg_0.g("\u00e4", (Object)var48_27, (long)-6317159571566343774L, (long)var5_5);
                                                                                        this.l = this.k;
                                                                                        this.p = this.o;
                                                                                        this.t = this.o;
                                                                                        v27 = this;
                                                                                    }
                                                                                    catch (MatchException v32) {
                                                                                        throw cg_0.g("\u00db", (Object)v32, (long)-6309699942126744216L, (long)var5_5);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v27.n = (long)cg_0.d("i", (int)9047, (long)(5045290994817067252L ^ var5_5));
                                                                                    if (var47_26 == null) break block102;
lbl215:
                                                                                    // 2 sources

                                                                                    v29 = (cfr_temp_0 = var54_34 - (this.u - 0.05f)) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                                }
                                                                                catch (MatchException v33) {
                                                                                    throw cg_0.g("\u00db", (Object)v33, (long)-6309699942126744216L, (long)var5_5);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (v29 < 0) {
                                                                                    this.n = (long)cg_0.g("\u00db", (long)-6311120695340926770L, (long)var5_5);
                                                                                }
                                                                            }
                                                                            catch (MatchException v34) {
                                                                                throw cg_0.g("\u00db", (Object)v34, (long)-6309699942126744216L, (long)var5_5);
                                                                            }
                                                                        }
                                                                        this.u = (float)var54_34;
                                                                        var55_35 = new ArrayList<E>();
                                                                        var56_38 = cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6310068520314985722L, (long)var5_5), (long)-6310131128093334635L, (long)var5_5);
                                                                        while (cg_0.g("\u00e4", (Object)var56_38, (long)-6312995294072643013L, (long)var5_5) != false) {
                                                                            block104: {
                                                                                var57_41 = (class_1304)cg_0.g("\u00e4", (Object)var56_38, (long)-6316685237677151206L, (long)var5_5);
                                                                                try {
                                                                                    try {
                                                                                        if (var47_26 != null) break block103;
                                                                                        v35 = cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)var57_41, (long)-6312931211715923383L, (long)var5_5), (Object)cg_0.a("g", (int)7760, (long)(6456409042347094375L ^ var5_5)), (long)-6311199009371649170L, (long)var5_5);
                                                                                        if (var47_26 != null) break block104;
                                                                                    }
                                                                                    catch (MatchException v36) {
                                                                                        throw cg_0.g("\u00db", (Object)v36, (long)-6309699942126744216L, (long)var5_5);
                                                                                    }
                                                                                    if (v35 != false) {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                catch (MatchException v37) {
                                                                                    throw cg_0.g("\u00db", (Object)v37, (long)-6309699942126744216L, (long)var5_5);
                                                                                }
                                                                                v35 = cg_0.g("\u00e4", var55_35, (Object)cg_0.g("\u00e4", (Object)var48_27, (Object)var57_41, (long)-6317046298858195605L, (long)var5_5), (long)-6317219888404266600L, (long)var5_5);
                                                                            }
                                                                            if (var47_26 == null) continue;
                                                                        }
                                                                        cg_0.g("\u00db", var55_35, (long)-6310612983679343937L, (long)var5_5);
                                                                        this.q = var55_35;
                                                                        this.r = cg_0.g("\u00e4", (Object)var48_27, (long)-6313230250801527371L, (long)var5_5);
                                                                    }
                                                                    this.s = cg_0.g("\u00e4", (Object)var48_27, (long)-6310506799508562075L, (long)var5_5);
                                                                }
                                                                var53_33 = cg_0.g("\u00db", (long)-6311120695340926770L, (long)var5_5) - this.n;
                                                                try {
                                                                    try {
                                                                        v38 = this;
                                                                        if (var47_26 != null) break block105;
                                                                        if (v38.n == cg_0.d("i", (int)9047, (long)(5045290994817067252L ^ var5_5))) break block106;
                                                                    }
                                                                    catch (MatchException v39) {
                                                                        throw cg_0.g("\u00db", (Object)v39, (long)-6309699942126744216L, (long)var5_5);
                                                                    }
                                                                    if (var53_33 >= cg_0.d("i", (int)10377, (long)(6641007064502821678L ^ var5_5))) break block106;
                                                                }
                                                                catch (MatchException v40) {
                                                                    throw cg_0.g("\u00db", (Object)v40, (long)-6309699942126744216L, (long)var5_5);
                                                                }
                                                                var55_36 = 1.0f - (float)var53_33 / 350.0f;
                                                                v41 = new Object[4];
                                                                v41[3] = var19_12;
                                                                v41[2] = Float.valueOf(1.0f);
                                                                v41[1] = Float.valueOf(0.0f);
                                                                v41[0] = Float.valueOf(var51_30);
                                                                var56_39 = (int)(55.0f * var55_36 * cg_0.g("\u00db", (Object)v41, (long)-6310862290434439089L, (long)var5_5));
                                                                v42 = new Object[8];
                                                                v42[7] = var13_9;
                                                                v42[6] = new Vector4f(4.0f);
                                                                v42[5] = new Color((int)cg_0.c("o", (int)31851, (long)(2098942356982353834L ^ var5_5)), (int)cg_0.c("o", (int)22558, (long)(1106173558087281619L ^ var5_5)), (int)cg_0.c("o", (int)27384, (long)(741093954818890042L ^ var5_5)), var56_39);
                                                                v42[4] = Float.valueOf(this.f + var50_29);
                                                                v42[3] = Float.valueOf(this.e + var49_28);
                                                                v42[2] = Float.valueOf(this.f);
                                                                v42[1] = Float.valueOf(this.e);
                                                                v42[0] = var52_31 /* !! */ ;
                                                                cg_0.g("\u00db", (Object)v42, (long)-6313508486646223040L, (long)var5_5);
                                                            }
                                                            v38 = this;
                                                        }
                                                        try {
                                                            try {
                                                                if (var47_26 != null) break block107;
                                                                if (v38.g == null) break block108;
                                                            }
                                                            catch (MatchException v43) {
                                                                throw cg_0.g("\u00db", (Object)v43, (long)-6309699942126744216L, (long)var5_5);
                                                            }
                                                            v44 = new Object[4];
                                                            v44[3] = var19_12;
                                                            v44[2] = Float.valueOf(1.0f);
                                                            v44[1] = Float.valueOf(0.0f);
                                                            v44[0] = Float.valueOf(var51_30);
                                                            v45 = new Object[3];
                                                            v45[2] = var37_21;
                                                            v45[1] = Float.valueOf((float)cg_0.g("\u00db", (Object)v44, (long)-6310862290434439089L, (long)var5_5));
                                                            v45[0] = cg_0.g("\u00d3", (long)-6316401036834981648L, (long)var5_5);
                                                            v46 = new Object[13];
                                                            v46[12] = var21_13;
                                                            v46[11] = cg_0.g("\u00db", (Object)v45, (long)-6316577968968096146L, (long)var5_5);
                                                            v46[10] = this.g;
                                                            v46[9] = var52_31 /* !! */ ;
                                                            v46[8] = Float.valueOf(0.0f);
                                                            v46[7] = Float.valueOf(3.75f);
                                                            v46[6] = Float.valueOf(3.75f);
                                                            v46[5] = Float.valueOf(22.5f);
                                                            v46[4] = Float.valueOf(3.75f);
                                                            v46[3] = Float.valueOf(30.0f);
                                                            v46[2] = Float.valueOf(30.0f);
                                                            v46[1] = Float.valueOf(this.f + 5.0f);
                                                            v46[0] = Float.valueOf(this.e + 5.0f);
                                                            cg_0.g("\u00db", (Object)v46, (long)-6311351526363370174L, (long)var5_5);
                                                            v47 = new Object[8];
                                                            v47[7] = var11_8;
                                                            v47[6] = Float.valueOf(0.0f);
                                                            v47[5] = new Color((int)cg_0.c("o", (int)2434, (long)(3868780784706828874L ^ var5_5)), (int)cg_0.c("o", (int)26752, (long)(7303640325481028419L ^ var5_5)), (int)cg_0.c("o", (int)26752, (long)(7303640325481028419L ^ var5_5)), (int)cg_0.c("o", (int)3901, (long)(7753147986164268281L ^ var5_5)));
                                                            v47[4] = Float.valueOf(this.f + 35.0f);
                                                            v47[3] = Float.valueOf(this.e + 35.0f);
                                                            v47[2] = Float.valueOf(this.f + 5.0f);
                                                            v47[1] = Float.valueOf(this.e + 5.0f);
                                                            v47[0] = var52_31 /* !! */ ;
                                                            cg_0.g("\u00db", (Object)v47, (long)-6311427775366005274L, (long)var5_5);
                                                        }
                                                        catch (MatchException v48) {
                                                            throw cg_0.g("\u00db", (Object)v48, (long)-6309699942126744216L, (long)var5_5);
                                                        }
                                                    }
                                                    v49 = new Object[1];
                                                    v49[0] = var29_17;
                                                    v50 = new Object[6];
                                                    v50[5] = var39_22;
                                                    v50[4] = cn_0.s;
                                                    v50[3] = Float.valueOf(this.f + 3.0f);
                                                    v50[2] = Float.valueOf(this.e + 40.0f);
                                                    v50[1] = this.i;
                                                    v50[0] = var52_31 /* !! */ ;
                                                    cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6313760923553225350L, (long)var5_5), (Object)v49, (long)-6316585872335779520L, (long)var5_5), (Object)v50, (long)-6313560378545255829L, (long)var5_5);
                                                    v38 = this;
                                                }
                                                v51 = new Object[3];
                                                v51[2] = var27_16;
                                                v51[1] = 1;
                                                v51[0] = Float.valueOf(v38.j);
                                                var55_37 = (String)cg_0.g("\u00e4", (Object)cg_0.g("\u00db", (float)cg_0.g("\u00db", (Object)v51, (long)-6310224299961070751L, (long)var5_5), (long)-6312425765230349133L, (long)var5_5), (Object)cg_0.a("g", (int)13539, (long)(2248097716163992535L ^ var5_5)), (Object)"", (long)-6311273231109531896L, (long)var5_5) + "m";
                                                v52 = new Object[1];
                                                v52[0] = var29_17;
                                                v53 = new Object[2];
                                                v53[1] = var23_14;
                                                v53[0] = var55_37;
                                                var56_40 = cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6313760923553225350L, (long)var5_5), (Object)v52, (long)-6316585872335779520L, (long)var5_5), (Object)v53, (long)-6317139387745357694L, (long)var5_5) * 0.75f;
                                                v54 = new Object[1];
                                                v54[0] = var29_17;
                                                v55 = new Object[1];
                                                v55[0] = var15_10;
                                                var57_42 = cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6313760923553225350L, (long)var5_5), (Object)v54, (long)-6316585872335779520L, (long)var5_5), (Object)v55, (long)-6316323822561770467L, (long)var5_5);
                                                try {
                                                    block110: {
                                                        try {
                                                            try {
                                                                v56 = new Object[1];
                                                                v56[0] = var29_17;
                                                                v57 = new Object[7];
                                                                v57[6] = var41_23;
                                                                v57[5] = cn_0.u;
                                                                v57[4] = Float.valueOf(0.75f);
                                                                v57[3] = Float.valueOf(this.f + 3.0f + (var57_42 - var57_42 * 0.75f) * 0.5f);
                                                                v57[2] = Float.valueOf(this.e + var49_28 - 5.5f - var56_40);
                                                                v57[1] = var55_37;
                                                                v57[0] = var52_31 /* !! */ ;
                                                                cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6313760923553225350L, (long)var5_5), (Object)v56, (long)-6316585872335779520L, (long)var5_5), (Object)v57, (long)-6317963701810859394L, (long)var5_5);
                                                                v58 = new Object[4];
                                                                v58[3] = var31_18;
                                                                v58[2] = Float.valueOf((float)this.w * 0.008f);
                                                                v58[1] = Float.valueOf(this.o);
                                                                v58[0] = Float.valueOf(this.p);
                                                                this.p = (float)cg_0.g("\u00db", (Object)v58, (long)-6316963864868614160L, (long)var5_5);
                                                                v59 = new Object[4];
                                                                v59[3] = var31_18;
                                                                v59[2] = Float.valueOf((float)this.w * 0.01f);
                                                                v59[1] = Float.valueOf(this.k);
                                                                v59[0] = Float.valueOf(this.l);
                                                                this.l = (float)cg_0.g("\u00db", (Object)v59, (long)-6316963864868614160L, (long)var5_5);
                                                                cfr_temp_1 = this.o - this.t;
                                                                v60 /* !! */  = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                if (var47_26 != null) break block109;
                                                                if (v60 /* !! */  < 0) break block110;
                                                            }
                                                            catch (MatchException v61) {
                                                                throw cg_0.g("\u00db", (Object)v61, (long)-6309699942126744216L, (long)var5_5);
                                                            }
                                                            this.t = this.o;
                                                            if (var47_26 == null) break block111;
                                                        }
                                                        catch (MatchException v62) {
                                                            throw cg_0.g("\u00db", (Object)v62, (long)-6309699942126744216L, (long)var5_5);
                                                        }
                                                    }
                                                    v60 /* !! */  = (cfr_temp_2 = cg_0.g("\u00db", (long)-6311120695340926770L, (long)var5_5) - this.n - cg_0.d("i", (int)14491, (long)(1511787988137538365L ^ var5_5))) == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                }
                                                catch (MatchException v63) {
                                                    throw cg_0.g("\u00db", (Object)v63, (long)-6309699942126744216L, (long)var5_5);
                                                }
                                            }
                                            try {
                                                if (v60 /* !! */  > 0) {
                                                    v64 = new Object[4];
                                                    v64[3] = var31_18;
                                                    v64[2] = Float.valueOf((float)this.w * 0.003f);
                                                    v64[1] = Float.valueOf(this.o);
                                                    v64[0] = Float.valueOf(this.t);
                                                    this.t = (float)cg_0.g("\u00db", (Object)v64, (long)-6316963864868614160L, (long)var5_5);
                                                }
                                            }
                                            catch (MatchException v65) {
                                                throw cg_0.g("\u00db", (Object)v65, (long)-6309699942126744216L, (long)var5_5);
                                            }
                                        }
                                        var58_43 = this.e + 40.0f;
                                        var59_44 = 65.0f;
                                        try {
                                            try {
                                                v66 = new Object[8];
                                                v66[7] = var13_9;
                                                v66[6] = new Vector4f(1.5f);
                                                v66[5] = new Color((int)cg_0.c("o", (int)19741, (long)(5582010045219208916L ^ var5_5)), (int)cg_0.c("o", (int)2129, (long)(2918597974454745993L ^ var5_5)), (int)cg_0.c("o", (int)2129, (long)(2918597974454745993L ^ var5_5)), (int)cg_0.c("o", (int)23695, (long)(393475389006376771L ^ var5_5)));
                                                v66[4] = Float.valueOf(this.f + 35.0f);
                                                v66[3] = Float.valueOf(var58_43 + var59_44);
                                                v66[2] = Float.valueOf(this.f + 28.0f);
                                                v66[1] = Float.valueOf(var58_43);
                                                v66[0] = var52_31 /* !! */ ;
                                                cg_0.g("\u00db", (Object)v66, (long)-6313508486646223040L, (long)var5_5);
                                                v67 = this;
                                                if (var47_26 != null) break block112;
                                                if (!(v67.t > this.p + 0.005f)) break block113;
                                            }
                                            catch (MatchException v68) {
                                                throw cg_0.g("\u00db", (Object)v68, (long)-6309699942126744216L, (long)var5_5);
                                            }
                                            v69 = new Object[8];
                                            v69[7] = var13_9;
                                            v69[6] = new Vector4f(1.5f);
                                            v69[5] = new Color((int)cg_0.c("o", (int)31851, (long)(2098942356982353834L ^ var5_5)), (int)cg_0.c("o", (int)22501, (long)(297846612801414178L ^ var5_5)), (int)cg_0.c("o", (int)26069, (long)(6947583017463993875L ^ var5_5)), (int)cg_0.c("o", (int)19230, (long)(6154145018050803920L ^ var5_5)));
                                            v69[4] = Float.valueOf(this.f + 35.0f);
                                            v69[3] = Float.valueOf(var58_43 + var59_44 * this.t);
                                            v69[2] = Float.valueOf(this.f + 28.0f);
                                            v69[1] = Float.valueOf(var58_43);
                                            v69[0] = var52_31 /* !! */ ;
                                            cg_0.g("\u00db", (Object)v69, (long)-6313508486646223040L, (long)var5_5);
                                        }
                                        catch (MatchException v70) {
                                            throw cg_0.g("\u00db", (Object)v70, (long)-6309699942126744216L, (long)var5_5);
                                        }
                                    }
                                    v67 = this;
                                }
                                v71 = new Object[2];
                                v71[1] = var33_19;
                                v71[0] = Float.valueOf(this.p);
                                var60_45 = cg_0.g("\u00e4", (Object)v67, (Object)v71, (long)-6313925682252667672L, (long)var5_5);
                                var61_46 = cg_0.g("\u00db", (float)(var59_44 * this.p), (float)2.5f, (long)-6317752588770321593L, (long)var5_5);
                                v72 = new Object[11];
                                v72[10] = var17_11;
                                v72[9] = cg_0.g("\u00e4", (Object)var60_45, (long)-6310575253880597013L, (long)var5_5);
                                v72[8] = cg_0.g("\u00e4", (Object)var60_45, (long)-6313366253608936105L, (long)var5_5);
                                v72[7] = cg_0.g("\u00e4", (Object)var60_45, (long)-6310575253880597013L, (long)var5_5);
                                v72[6] = cg_0.g("\u00e4", (Object)var60_45, (long)-6313366253608936105L, (long)var5_5);
                                v72[5] = Float.valueOf(1.5f);
                                v72[4] = Float.valueOf(this.f + 35.0f);
                                v72[3] = Float.valueOf(var58_43 + var61_46);
                                v72[2] = Float.valueOf(this.f + 28.0f);
                                v72[1] = Float.valueOf(var58_43);
                                v72[0] = var52_31 /* !! */ ;
                                cg_0.g("\u00db", (Object)v72, (long)-6309763464263569820L, (long)var5_5);
                                v73 = new Object[3];
                                v73[2] = var27_16;
                                v73[1] = 1;
                                v73[0] = Float.valueOf(this.l);
                                var62_47 = cg_0.g("\u00e4", (Object)cg_0.g("\u00db", (float)cg_0.g("\u00db", (Object)v73, (long)-6310224299961070751L, (long)var5_5), (long)-6312425765230349133L, (long)var5_5), (Object)cg_0.a("g", (int)4707, (long)(7529876051862125909L ^ var5_5)), (Object)"", (long)-6311273231109531896L, (long)var5_5);
                                try {
                                    v74 = this.p > 0.6f ? cn_0.s : var60_45;
                                }
                                catch (MatchException v75) {
                                    throw cg_0.g("\u00db", (Object)v75, (long)-6309699942126744216L, (long)var5_5);
                                }
                                var63_48 = v74;
                                try {
                                    v76 = new Object[1];
                                    v76[0] = var29_17;
                                    v77 = new Object[1];
                                    v77[0] = var29_17;
                                    v78 = new Object[2];
                                    v78[1] = var23_14;
                                    v78[0] = var62_47;
                                    v79 = new Object[6];
                                    v79[5] = var39_22;
                                    v79[4] = var63_48;
                                    v79[3] = Float.valueOf(this.f + 26.0f);
                                    v79[2] = Float.valueOf(this.e + var49_28 - cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6313760923553225350L, (long)var5_5), (Object)v77, (long)-6316585872335779520L, (long)var5_5), (Object)v78, (long)-6317139387745357694L, (long)var5_5) - 5.5f);
                                    v79[1] = var62_47;
                                    v79[0] = var52_31 /* !! */ ;
                                    cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)cg_0.g("\u00d3", (long)-6313760923553225350L, (long)var5_5), (Object)v76, (long)-6316585872335779520L, (long)var5_5), (Object)v79, (long)-6313560378545255829L, (long)var5_5);
                                    v80 = this;
                                    if (var47_26 != null) break block114;
                                    if (v80.q == null) break block94;
                                }
                                catch (MatchException v81) {
                                    throw cg_0.g("\u00db", (Object)v81, (long)-6309699942126744216L, (long)var5_5);
                                }
                                var64_49 = -2.5f;
                                var65_50 = cg_0.g("\u00e4", (Object)this.q, (long)-6310931820770397237L, (long)var5_5);
                                while (cg_0.g("\u00e4", (Object)var65_50, (long)-6312995294072643013L, (long)var5_5) != false) {
                                    block115: {
                                        block117: {
                                            var66_51 = (class_1799)cg_0.g("\u00e4", (Object)var65_50, (long)-6316685237677151206L, (long)var5_5);
                                            try {
                                                try {
                                                    try {
                                                        if (var47_26 != null) break block115;
                                                        v82 = cg_0.g("\u00e4", (Object)var66_51, (long)-6311756586534212289L, (long)var5_5);
                                                        if (var47_26 != null) break block116;
                                                    }
                                                    catch (MatchException v83) {
                                                        throw cg_0.g("\u00db", (Object)v83, (long)-6309699942126744216L, (long)var5_5);
                                                    }
                                                    if (v82 != false) break block117;
                                                }
                                                catch (MatchException v84) {
                                                    throw cg_0.g("\u00db", (Object)v84, (long)-6309699942126744216L, (long)var5_5);
                                                }
                                                v85 = new Object[6];
                                                v85[5] = var35_20;
                                                v85[4] = var52_31 /* !! */ ;
                                                v85[3] = Float.valueOf(0.8f);
                                                v85[2] = Float.valueOf(this.f + 13.0f);
                                                v85[1] = Float.valueOf(this.e + 40.5f + var64_49);
                                                v85[0] = var66_51;
                                                cg_0.g("\u00db", (Object)v85, (long)-6317341594820255978L, (long)var5_5);
                                            }
                                            catch (MatchException v86) {
                                                throw cg_0.g("\u00db", (Object)v86, (long)-6309699942126744216L, (long)var5_5);
                                            }
                                        }
                                        var64_49 += 15.0f;
                                    }
                                    if (var47_26 == null) continue;
                                }
                                v82 = cg_0.g("\u00e4", (Object)this.r, (long)-6311756586534212289L, (long)var5_5);
                            }
                            try {
                                try {
                                    try {
                                        if (var47_26 != null) break block118;
                                        if (v82 != false) break block119;
                                    }
                                    catch (MatchException v87) {
                                        throw cg_0.g("\u00db", (Object)v87, (long)-6309699942126744216L, (long)var5_5);
                                    }
                                    v88 = new Object[6];
                                    v88[5] = var35_20;
                                    v88[4] = var52_31 /* !! */ ;
                                    v88[3] = Float.valueOf(0.8f);
                                    v88[2] = Float.valueOf(this.f + 13.0f);
                                    v88[1] = Float.valueOf(this.e + 40.5f + var64_49);
                                    v88[0] = this.r;
                                    v82 = cg_0.g("\u00db", (Object)v88, (long)-6317341594820255978L, (long)var5_5);
                                    if (var47_26 != null) break block118;
                                }
                                catch (MatchException v89) {
                                    throw cg_0.g("\u00db", (Object)v89, (long)-6309699942126744216L, (long)var5_5);
                                }
                                if (v82 == false) break block119;
                            }
                            catch (MatchException v90) {
                                throw cg_0.g("\u00db", (Object)v90, (long)-6309699942126744216L, (long)var5_5);
                            }
                            var64_49 += 15.0f;
                        }
                        try {
                            v80 = this;
                            if (var47_26 != null) break block114;
                            v82 = cg_0.g("\u00e4", (Object)v80.s, (long)-6311756586534212289L, (long)var5_5);
                        }
                        catch (MatchException v91) {
                            throw cg_0.g("\u00db", (Object)v91, (long)-6309699942126744216L, (long)var5_5);
                        }
                    }
                    try {
                        if (v82 == false) {
                            v92 = new Object[6];
                            v92[5] = var35_20;
                            v92[4] = var52_31 /* !! */ ;
                            v92[3] = Float.valueOf(0.8f);
                            v92[2] = Float.valueOf(this.f + 13.0f);
                            v92[1] = Float.valueOf(this.e + 40.5f + var64_49);
                            v92[0] = this.s;
                            cg_0.g("\u00db", (Object)v92, (long)-6317341594820255978L, (long)var5_5);
                        }
                    }
                    catch (MatchException v93) {
                        throw cg_0.g("\u00db", (Object)v93, (long)-6309699942126744216L, (long)var5_5);
                    }
                }
                v80 = this;
            }
            v94 = new Object[2];
            v94[1] = Float.valueOf(var50_29);
            v94[0] = Float.valueOf(var49_28);
            cg_0.g("\u00e4", (Object)v80, (Object)v94, (long)-6313419859272935297L, (long)var5_5);
        }
    }

    private static Method l(long l, long l2) {
        int n = cg_0.i(l, l2);
        Object object = O[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = P[n];
                int n3 = string2.indexOf(8);
                clazz3 = cg_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cg_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cg_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        cg_0.O[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cg_0.j(1432444406243395L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cg_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cg_0.O[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cg_0.j(1432444406243395L, 0L);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63D5;
        if (K[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = J[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])L.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    L.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cg", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cg_0.K[n2] = l4;
        }
        return K[n2];
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = cg_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cg_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4740;
        if (B[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])C.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    C.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = y[n2].getBytes("ISO-8859-1");
            cg_0.B[n2] = cg_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return B[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private Color a(Object[] objectArray) {
        float f;
        long l;
        block7: {
            float f10;
            block8: {
                f10 = ((Float)objectArray[0]).floatValue();
                l = (Long)objectArray[1];
                long l2 = (l = x ^ l) ^ 0x297C814DC304L;
                CallSite callSite = cg_0.g("\u00db", (long)-635076720150734607L, (long)l);
                try {
                    try {
                        float f11 = f10 - 0.6f;
                        f = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (callSite != null) break block7;
                        if (f <= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw cg_0.g("\u00db", (Object)matchException, (long)-636343025364381140L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    return cg_0.g("\u00db", (Object)objectArray2, (long)-636024468343348158L, (long)l);
                }
                catch (MatchException matchException) {
                    throw cg_0.g("\u00db", (Object)matchException, (long)-636343025364381140L, (long)l);
                }
            }
            float f12 = f10 - 0.3f;
            f = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        }
        try {
            if (f > 0) {
                return new Color((int)cg_0.c("o", (int)13557, (long)(0x727C8D182BDED871L ^ l)), (int)cg_0.c("o", (int)3878, (long)(0x7DAAF3EA1C063BBL ^ l)), (int)cg_0.c("o", (int)9815, (long)(0x4D1345169DBD4AD8L ^ l)));
            }
        }
        catch (MatchException matchException) {
            throw cg_0.g("\u00db", (Object)matchException, (long)-636343025364381140L, (long)l);
        }
        return new Color((int)cg_0.c("o", (int)3377, (long)(0x2CDCBE677E1BFL ^ l)), (int)cg_0.c("o", (int)2642, (long)(0x3E8153D06B85E6D9L ^ l)), (int)cg_0.c("o", (int)27951, (long)(0x593A3FA14FEB01AEL ^ l)));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x6543AA8EC91CL;
        long l4 = l2 ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        float f = (float)cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)b, (long)-3383364348008746470L, (long)l), (long)-3385090045737571769L, (long)l) / cg_0.g("\u00db", (Object)objectArray2, (long)-3382827136011474380L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        float f10 = (float)cg_0.g("\u00e4", (Object)cg_0.g("\u00e4", (Object)b, (long)-3383364348008746470L, (long)l), (long)-3370584211538390785L, (long)l) / cg_0.g("\u00db", (Object)objectArray3, (long)-3382827136011474380L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l4;
        objectArray4[1] = Float.valueOf(f10 / 2.0f + 80.0f);
        objectArray4[0] = Float.valueOf(f / 2.0f - 65.0f);
        cg_0.g("\u00e4", (Object)this, (Object)objectArray4, (long)-3386465992258138773L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = cg_0.i(l, l2);
        Object object = O[n];
        if (object instanceof String) {
            String string = P[n];
            int n2 = string.indexOf(8);
            Class clazz = cg_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cg_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cg_0.e(clazz3, string2, clazz2)) != null) {
                    cg_0.O[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cg_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cg_0.O[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cg_0.j(1432444406243395L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/cg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cg_0.i(l, l2);
            object = O[n];
            try {
                if (!(object instanceof String)) break block2;
                cg_0.O[n] = clazz = Class.forName(P[n]);
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
            return MethodHandles.lookup().findStatic(cg_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cg_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(cg_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cg_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


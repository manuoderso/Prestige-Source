/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b8
extends b4 {
    private static final int a;
    private static final long c;
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

    public b8(long l) {
        long l2 = (l = v ^ l) ^ 0x478D4C0E5FA3L;
        super((String)((Object)b8.a("c", (int)6528, (long)(0x3FFEADA4092114C3L ^ l))), (String)((Object)b8.a("c", (int)19188, (long)(0x4821F4FABEA0C7B6L ^ l))), l2);
        this.g = new float[b8.c("j", (int)2288, (long)(0x52572AEFFE30CCC5L ^ l))];
        this.h = 0;
        this.i = (long)b8.d("f", (int)1927, (long)(0x98D0746711B2AFFL ^ l));
        this.j = (long)b8.d("f", (int)7477, (long)(0x25E32CF02A8304FL ^ l));
        this.k = -1.0f;
        this.l = -1.0f;
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
                                b8.v = hc.a(-6213435033032835163L, 1179776134807778761L, MethodHandles.lookup().lookupClass()).a(271398696929463L);
                                b8.K = new Object[75];
                                b8.L = new String[75];
                                b8.b();
                                b8.y = new HashMap<K, V>(13);
                                var22 = b8.v ^ 71462450908743L;
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
                                var28_5 = "\u009d\u0095\u0014\u00f2\u00e0\u00cb\u0006\u00b9\u00e0P\u0012\u00e4\u00ad\u0091\u00a0P\u0010\u00c90\u00afN\u00ce\u00ba\u00de\u008b\u0099T\u00bd\u0080H:m\u00d9\u0010\u00a10\u00b6\u0014\u00c0\u001b\u00d5\u00d4s\u0096\u00b2\u00f2\u008eT\u00a6\u00c7";
                                var30_6 = "\u009d\u0095\u0014\u00f2\u00e0\u00cb\u0006\u00b9\u00e0P\u0012\u00e4\u00ad\u0091\u00a0P\u0010\u00c90\u00afN\u00ce\u00ba\u00de\u008b\u0099T\u00bd\u0080H:m\u00d9\u0010\u00a10\u00b6\u0014\u00c0\u001b\u00d5\u00d4s\u0096\u00b2\u00f2\u008eT\u00a6\u00c7".length();
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
                                    var31_3[var29_4++] = b8.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00a3v\u0083d8\u00a4\u009eG]4\u00b0\r\u009d]\u009d\u00edN\u00ba\u009c\u00baI\u00be(\u00e9i\u0007\u00ec\u0094\u00c2k\u00ea\u00d2\u008b$\u00f0\u0084\u00ec\u0005\u00f4\u00ca@0)E\u0002\u00ed\u0086\u009c\u00f6\u0011$\u00fe\u00af\u00ff)\u00a84\u00b1\u00e4\\\u00e8E\u00dc0\u00a8~A&\u00dd\u00cf\u00ae\u00b6@\u00f2\u00dd|\u00cb\u00ad\u009e\u0013/\u00fc\u001cN20\u00fb\u00ef\u0017k~\u00d9\u00d2\u00fd\u00e0\u00f3\u00ba\u00c5\u00b9\u00ef\u0082Y\u00ca\"^";
                                    var30_6 = "\u00a3v\u0083d8\u00a4\u009eG]4\u00b0\r\u009d]\u009d\u00edN\u00ba\u009c\u00baI\u00be(\u00e9i\u0007\u00ec\u0094\u00c2k\u00ea\u00d2\u008b$\u00f0\u0084\u00ec\u0005\u00f4\u00ca@0)E\u0002\u00ed\u0086\u009c\u00f6\u0011$\u00fe\u00af\u00ff)\u00a84\u00b1\u00e4\\\u00e8E\u00dc0\u00a8~A&\u00dd\u00cf\u00ae\u00b6@\u00f2\u00dd|\u00cb\u00ad\u009e\u0013/\u00fc\u001cN20\u00fb\u00ef\u0017k~\u00d9\u00d2\u00fd\u00e0\u00f3\u00ba\u00c5\u00b9\u00ef\u0082Y\u00ca\"^".length();
                                    var27_7 = 40;
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
                                    var31_3[var29_4++] = b8.b(var32_9).intern();
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
                        b8.w = var31_3;
                        b8.x = new String[5];
                        b8.D = new HashMap<K, V>(13);
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
                        var15_14 = "\u00a1{\u00dd\u001f\f\u00ea\u00e7\u00f8\u00b7\u00d8\u00e6w\u00c0\u00aa\u00030\u0088\u00c2\u001f\u0007\u0085\u009ak\u00d1QU\u0098\u001d\u00b2\u0097\u0082\u0083X\u0015\u00bb(w\u00f7\u00fb\u00daB\u0004\u0010\u000b\u000b\u00c1q\u009c\u0018e\u0085\u00f4\fb\u008b%0\u008d2\u00e2&\u00f5]O\u00bb1xej9\u00870\t\u00f5\u009d\u00e0\u00c6\u00ddu\u00c1_o\u00b5\u00ac\u0093\u00db\u009d\u00cd\u00cf\t\u00c4\u00f5\r\u0083\u00e6u\u0097\u00d6\u0080\u00ac\u00abq!\u00ae\u00dc\u00d4\u008f\u00da\u00be\u0099}\u00fd\u0095x0\"\u0015\u0005\u008b~\u00ed\u00e9\u009f\u008eP\u00f6+\u00a2";
                        var16_15 = "\u00a1{\u00dd\u001f\f\u00ea\u00e7\u00f8\u00b7\u00d8\u00e6w\u00c0\u00aa\u00030\u0088\u00c2\u001f\u0007\u0085\u009ak\u00d1QU\u0098\u001d\u00b2\u0097\u0082\u0083X\u0015\u00bb(w\u00f7\u00fb\u00daB\u0004\u0010\u000b\u000b\u00c1q\u009c\u0018e\u0085\u00f4\fb\u008b%0\u008d2\u00e2&\u00f5]O\u00bb1xej9\u00870\t\u00f5\u009d\u00e0\u00c6\u00ddu\u00c1_o\u00b5\u00ac\u0093\u00db\u009d\u00cd\u00cf\t\u00c4\u00f5\r\u0083\u00e6u\u0097\u00d6\u0080\u00ac\u00abq!\u00ae\u00dc\u00d4\u008f\u00da\u00be\u0099}\u00fd\u0095x0\"\u0015\u0005\u008b~\u00ed\u00e9\u009f\u008eP\u00f6+\u00a2".length();
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
                            var15_14 = "J(\u00dcgA,j\u0081\u0097\n%w\u00df\u00f6V\u009a";
                            var16_15 = "J(\u00dcgA,j\u0081\u0097\n%w\u00df\u00f6V\u009a".length();
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
                b8.B = var17_12;
                b8.C = new Integer[18];
                b8.a = (int)b8.c("j", (int)16067, (long)(var22 ^ 7114040978268352658L));
                b8.J = new HashMap<K, V>(13);
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
                var4_24 = ">\u00a9r\u0099\u0098\u0099\u00ac\u00f4\u008e\u0003`\u00c6\u00c9\u00b3\u00e9\u00c2";
                var5_25 = ">\u00a9r\u0099\u0098\u0099\u00ac\u00f4\u008e\u0003`\u00c6\u00c9\u00b3\u00e9\u00c2".length();
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
                    var4_24 = "\u00a3\u008dn\u0019\u0097Q{\u00bex\u00c6\u00c8\u0095!\tjx";
                    var5_25 = "\u00a3\u008dn\u0019\u0097Q{\u00bex\u00c6\u00c8\u0095!\tjx".length();
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
        b8.H = var6_22;
        b8.I = new Long[4];
        b8.c = (long)b8.d("f", (int)17737, (long)(var22 ^ 8679716068566360659L));
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
            case 1 -> 28;
            case 2 -> 21;
            case 3 -> 32;
            case 4 -> 41;
            case 5 -> 16;
            case 6 -> 45;
            case 7 -> 44;
            case 8 -> 29;
            case 9 -> 1;
            case 10 -> 26;
            case 11 -> 55;
            case 12 -> 14;
            case 13 -> 56;
            case 14 -> 57;
            case 15 -> 50;
            case 16 -> 4;
            case 17 -> 31;
            case 18 -> 23;
            case 19 -> 58;
            case 20 -> 3;
            case 21 -> 33;
            case 22 -> 53;
            case 23 -> 5;
            case 24 -> 13;
            case 25 -> 30;
            case 26 -> 24;
            case 27 -> 27;
            case 28 -> 43;
            case 29 -> 22;
            case 30 -> 18;
            case 31 -> 60;
            case 32 -> 51;
            case 33 -> 11;
            case 34 -> 59;
            case 35 -> 10;
            case 36 -> 34;
            case 37 -> 54;
            case 38 -> 48;
            case 39 -> 49;
            case 40 -> 19;
            case 41 -> 39;
            case 42 -> 46;
            case 43 -> 6;
            case 44 -> 7;
            case 45 -> 20;
            case 46 -> 25;
            case 47 -> 42;
            case 48 -> 40;
            case 49 -> 0;
            case 50 -> 15;
            case 51 -> 63;
            case 52 -> 37;
            case 53 -> 12;
            case 54 -> 62;
            case 55 -> 61;
            case 56 -> 47;
            case 57 -> 9;
            case 58 -> 8;
            case 59 -> 38;
            case 60 -> 35;
            case 61 -> 36;
            case 62 -> 17;
            default -> 52;
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
        b8.L[n3] = new String(cArray);
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
        K[0] = "\r\u0005\u000f|]Z\u001b\u0005\n&NM\fN\t BY\u001d\t\u001e7\tH]";
        objectArray[1] = "&d\u001aYA.SD\u0011VPa2J\u001a]T;F";
        objectArray[2] = Void.TYPE;
        b8.L[2] = "java/lang/Void";
        objectArray[3] = ":ozJ0i1`k\u0005Mq\"gbL";
        objectArray[4] = "JE+pd ?e \u007fuoB}3x|&*";
        objectArray[5] = "BQL\u0016j\u001dI^]Y\r\u001f\\U]\u00126";
        objectArray[6] = Integer.TYPE;
        b8.L[6] = "java/lang/Integer";
        objectArray[7] = "\\JM]-4A_\u0015\u007fl9YY";
        objectArray[8] = "4g$+\\\u000e\"g!qO\u00195,\"wC\r$k5`\b\u001f\u0018";
        objectArray[9] = "S7\u0016\ns9&\u0017\u001d\u0005bv[\u000f\u000e\u0002k?3";
        objectArray[10] = "\u001a:|*7r\f:yp$e\u001bqzv(q\n6macf?";
        objectArray[11] = "'Kh7[\u0004Rkc8JK3eh3N\u0011G";
        objectArray[12] = "TU\u0019\u0019~\u0001BU\u001cCm\u0016U\u001e\u001fEa\u0002DY\bR*\u0012^";
        objectArray[13] = "K)qm\u001b;>\tzb\nt_\u0007qi\u000e.+";
        objectArray[14] = Float.TYPE;
        b8.L[14] = "java/lang/Float";
        objectArray[15] = "W\f7[N\u0018\",<T_WC\"7_[\r7";
        objectArray[16] = "5m\u0004DL\u0018#m\u0001\u001e_\u000f4&\u0002\u0018S\u001b%a\u0015\u000f\u0018\t\u0014";
        objectArray[17] = "k\r?R?C\u001e-4].\f\u007f#?V*V\u000b";
        objectArray[18] = "/l $5L/l7x9C5'7f9V2Vg;h";
        objectArray[19] = "(\u0002MNrd(\u0002Z\u0012~k2IZ\f~~58\rS(";
        objectArray[20] = "_R|B\rLIRy\u0018\u001e[^\u0019z\u001e\u0012OO^m\tY_W^o\u0002\u0003\u0012kEo\u001f\u0003U\\R";
        objectArray[21] = "8_6_Tr._3\u0005Ge9\u00140\u0003Kq(S'\u0014\u0000a\u001f";
        objectArray[22] = "y\"\u0018'_%\f\u0002\u0013(Njm\f\u0018#J0\u0019";
        objectArray[23] = "Pdc|IdFdf&ZsQ/e Vg@hr7\u001dwu";
        objectArray[24] = "b\u001f=2|]t\u001f8hoJcT;nc^r\u0013,y(O>";
        objectArray[25] = "6\u0010\\!p%=\u001fMn\u0013((\u0012B\u0005&*9\u0001^)1'";
        objectArray[26] = "x\u0001\u001b\r7Bn\u0001\u001eW$UyJ\u001dQ(Ah\r\nFcVq";
        objectArray[27] = "S\n%2RU&*.=C\u001aG$%6G@3";
        objectArray[28] = "O$L\u0006\u0000XY$I\\\u0013ONoJZ\u001f[_(]MTJ|";
        objectArray[29] = "r\fr,tK\u0007,y#e\u0004f\"r(a^\u0012";
        objectArray[30] = "#r9\u0015^\nVR2\u001aOE7\\9\u0011K\u001fC";
        objectArray[31] = "\u0017\u0010G\u001fsn\u0001\u0010BE`y\u0016[AClm\u0007\u001cVT'z\u0018";
        objectArray[32] = "wV\u0015`\u000bY\u0002v\u001eo\u001a\u0016cx\u0015d\u001eL\u0017";
        objectArray[33] = "BOgqR TOb+A7C\u0004a-M#RCv:\u00064B";
        objectArray[34] = "\u00045u\u0004\u001dLq\u0015~\u000b\f\u0003\u0010\u001bu\u0000\bYd";
        objectArray[35] = "IYr\u001a-\u001a<yy\u0015<U]wr\u001e8\u000f)";
        objectArray[36] = "C\u0016\"i2\u0005U\u0016'3!\u0012B]$5-\u0006S\u001a3\"f\u0011K";
        objectArray[37] = "\u0015vCh?9`VHg.v\u0001XCl*,u";
        objectArray[38] = "\u0005erv\u0011IpEyy\u0000\u0006\u0011Krr\u0004\\e";
        objectArray[39] = Boolean.TYPE;
        b8.L[39] = "java/lang/Boolean";
        objectArray[40] = "\thOqY'\u0002g^>$2\u0010}\\}";
        objectArray[41] = Long.TYPE;
        b8.L[41] = "java/lang/Long";
        objectArray[42] = "8(\f\u0001\u0016\u0013M\b\u0007\u000e\u0007\\,\u0006\f\u0005\u0003\u0006X";
        objectArray[43] = "fOV\u000b`\u001a\u0013o]\u0004qUraV\u000fu\u000f\u0006";
        objectArray[44] = "$-o\fQr/\"~C2\u007f:$";
        objectArray[45] = "d5{*p3o:je\u0011=d1n?";
        objectArray[46] = "U=M\u00165\u0003\u0013a\u001e\u0015PT\u0005qh\u0000=V\u000e\r\u001b\u001e>\u0006\u0003n\u001d\u0010-Fh";
        objectArray[47] = "NNF}\"\b\u000e\u0016Lq\u0018\u0006pMG\u007fuUL\u0010[\")l";
        objectArray[48] = "B-,HvYD*:\u0013\u0013\u0001}4wL\"\u0014\u0006)>\u001aueD/xK|\u0000\u0010&$\u000f\u0013";
        objectArray[49] = "$]\u0006sUAb\u0001Up0\u0016t\u00116r\\y%\t\u0002\"[\u001a#\u0007\u0011b0";
        objectArray[50] = "\u0012Ub:B\u0010S]}-;\u0011PXc8;PA\\|=A\u0011ICkD\u0005\u000bLQ;xX\u0017\u0011\r\u0002";
        objectArray[51] = "i_O}$PcYLcZ\u0001Y@\u0001'k\u001a\"]Hq<k0TU##P3ZJnZ";
        objectArray[52] = "\u0012@>\u0016Iv\u0011G~(D\u0012S\u0017y\u0019TiN^/N%+H\u0018~G@\u007fAD:(";
        objectArray[53] = "7-ar8\u001c8y#|^L]?/4oQ&\"fb8 `rt`;\u0018&.'c^";
        objectArray[54] = "v\u001e0D_\bwAhO`\fwX9L\f>&\u001bd\u001aQi&@7\u0016\u000b\n N$V`";
        objectArray[55] = "J/=;W%Kpe0h*Gx08?}\u0019(iT\u0004-\u001dy>.\u0016u\u001br";
        objectArray[56] = "\u0007\f;K0'\u0014\u0012e@\r'j\u0000gYw)P\u0012:[p";
        objectArray[57] = "\u001c2\"Dea\u000eo C\u00002rwo\u00061*\tj&Pf[\u001d7fL1$\u000fm;N\u0000";
        objectArray[58] = "-\u0012:\\wg;\u0010'\u000b\u001c`B\b,Tpt3\u0012<Os\t\"\u0005'^ax8\u0015<]\u001c";
        objectArray[59] = "k-z+8\u001cc )h[\u000b\na!lj\u0013q|h:=bh\u007f(.+\u0005v{ql[";
        objectArray[60] = "*5\u007fD\u001fI)2?z\u001a-kb8K\u0002Vv+n\u001cs\u0014pm?\u0015\u0016@y1{z";
        objectArray[61] = "Fp;L4\u0010\u0007x$[M\u0014\u0015}&_\n\u0004|%?\\p\u0001\u001f#1O0jFp;L4\u0010\u0007x$[M";
        objectArray[62] = "9\u001d\u0007A \t+GZC\u0011\u001dV]\u000e\u000b \u0007-@G]wv?IZ\u000fhM<GEB\u0011";
        objectArray[63] = ":=BR`Sa=GA\u0019Uh%\u0004SXK}_EWySx%\u0004_fD\u0001c\u001bP$Fbe\u0015Cd-";
        objectArray[64] = "E@?\u0006\u0005\fW\u001ab\u00044\u001a*\u00006L\u0005\u0002Q\u001d\u007f\u001aRsC\u0014bHMH@\u001a}\u00054";
        objectArray[65] = "\u0017SimAb\u0011\fbj'lsK:6\u0016v\bVs`A\u0007JP51Hb\u001eYiu'";
        objectArray[66] = "@r&\u001f&\u0014[%b\u0003T\u0018&6iAe\u0004]+ \u00172u\u001f-fF;\u0010K$:\u0002T";
        objectArray[67] = "\u0004-\n-GLBqY.\"\u001bTa*%_\u00199!\u0004/\u001f\u001fZ'\n<_t";
        objectArray[68] = "\u0019F+dw_\u0016\u0012ij\u0011\tsTe\" \u0012\bI,twc\u001a@1&hX\u0019N.k\u0011";
        objectArray[69] = "u\f-=ARbQ0.?^\r\u0013qn\u000eDv\u000e88Y54\b~iPP`\u0001\"-?";
        objectArray[70] = "=\u0011RV,\u0015>\u0016\u0012h+q|F\u0015Y1\na\u000fC\u000e@\u000bh\u001aQ\u0013\u007fM:\u0015Sh";
        objectArray[71] = "\u001aX>P?s\u0018_zU[e\u001d]xG=r<FgG\u001eo\u0004CcQ[u\u0018YzI4tX\u0018~*";
        objectArray[72] = "$\u000ejYfR2\fw\u000e\rUK\t \u000f<M0\u0014iYk<vD{[h\u00040\u0018(X\r";
        objectArray[73] = "x1oD\n#jk2F;#\u0017qf\u000e\n-ll/X]\\.ji\tT9zc5M;";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "\u0002?tR=\u000eB56\u0015^\u0006\u0016+\tC7\u0006C\"2@9\u0019\u000e[`C;_\u0006`cM$\u0012\u007f2`Ob\u001aD1nP/c";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b8.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x508D;
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
                throw new RuntimeException("dev/zprestige/prestige/b8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b8.C[n2] = n3;
        }
        return C[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = b8.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d4' || c == '\u00e3' || c == 'x' || c == '\u00eb') {
                field = b8.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b8.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Field field = b8.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b8.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b8.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b8.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = b8.i(l, l2);
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
                clazz3 = b8.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b8.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b8.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        b8.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b8.j(3235111254478107L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b8.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b8.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b8.j(3235111254478107L, 0L);
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
        block72: {
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
            block70: {
                int n2;
                float f15;
                float f16;
                float f17;
                float f18;
                float f19;
                float f20;
                CallSite callSite3;
                float f21;
                reference var43_29;
                reference var42_28;
                CallSite callSite4;
                Color color;
                long l4;
                long l5;
                block79: {
                    reference var40_26;
                    block78: {
                        float f22;
                        float f23;
                        float f24;
                        float f25;
                        float f26;
                        reference var41_27;
                        long l6;
                        long l7;
                        long l8;
                        long l9;
                        gK gK2;
                        aq_0 aq_02;
                        block68: {
                            block66: {
                                block67: {
                                    CallSite callSite5;
                                    long l10;
                                    long l11;
                                    block65: {
                                        CallSite callSite6;
                                        float f27;
                                        long l12;
                                        block63: {
                                            Object object;
                                            block62: {
                                                float f28;
                                                float f29;
                                                block60: {
                                                    block61: {
                                                        block58: {
                                                            b8 b82;
                                                            block59: {
                                                                block57: {
                                                                    long l13;
                                                                    block56: {
                                                                        aq_02 = (aq_0)objectArray[0];
                                                                        gK2 = (gK)objectArray[1];
                                                                        matrix4f = (Matrix4f)objectArray[2];
                                                                        l3 = (Long)objectArray[3];
                                                                        long l14 = l3;
                                                                        l13 = l14 ^ 0x33F5EE405241L;
                                                                        l9 = l14 ^ 0x7876565874AFL;
                                                                        l8 = l14 ^ 0x56B4B80BF914L;
                                                                        l7 = l14 ^ 0x194A66AD9C40L;
                                                                        l2 = l14 ^ 0x51117395139CL;
                                                                        l11 = l14 ^ 0x5D6649FEB165L;
                                                                        l12 = l14 ^ 0x5784D74479BL;
                                                                        l5 = l14 ^ 0x77FE815D5D37L;
                                                                        l10 = l14 ^ 0x31240AA31D80L;
                                                                        l6 = l14 ^ 0x1190C45D2788L;
                                                                        l = l14 ^ 0x10CA1995C648L;
                                                                        l4 = l14 ^ 0x5BE4B21DC642L;
                                                                        callSite2 = b8.g("\u00d9", (long)-6305709212585532390L, (long)l3);
                                                                        try {
                                                                            b8 b83;
                                                                            try {
                                                                                b83 = this;
                                                                                if (callSite2 != null) break block56;
                                                                                if (b83.d != null) break block57;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                                            }
                                                                            b83 = this;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                                        }
                                                                    }
                                                                    Object[] objectArray2 = new Object[2];
                                                                    objectArray2[1] = l13;
                                                                    objectArray2[0] = b8.a("c", (int)6540, (long)(0xF79A014B136A80EL ^ l3));
                                                                    b83.d = b8.g("\u00d9", (Object)objectArray2, (long)-6307124782235489937L, (long)l3);
                                                                }
                                                                callSite5 = b8.g("\u00c7", (Object)b, (long)-6306171966516375267L, (long)l3);
                                                                CallSite callSite7 = b8.g("\u00d9", (long)-6311869783984774861L, (long)l3);
                                                                f27 = (float)(callSite7 - this.j) * 0.005f;
                                                                try {
                                                                    try {
                                                                        b82 = this;
                                                                        if (callSite2 != null) break block58;
                                                                        b82.j = (long)callSite7;
                                                                        if (callSite7 - this.i < b8.d("f", (int)755, (long)(0x37446A98279A134FL ^ l3))) break block59;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                                    }
                                                                    this.g[this.h] = (float)callSite5;
                                                                    this.h = (this.h + 1) % b8.c("j", (int)16504, (long)(0x52B92B43AEBEB880L ^ l3));
                                                                    this.i = (long)callSite7;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                                }
                                                            }
                                                            b82 = this;
                                                        }
                                                        try {
                                                            try {
                                                                f29 = this.k;
                                                                f28 = 0.0f;
                                                                if (callSite2 != null) break block60;
                                                                if (!(f29 < f28)) break block61;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                            }
                                                            object = (float)callSite5;
                                                            break block62;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                        }
                                                    }
                                                    f29 = this.k;
                                                    f28 = (float)callSite5;
                                                }
                                                Object[] objectArray3 = new Object[4];
                                                objectArray3[3] = l12;
                                                objectArray3[2] = Float.valueOf(f27 * 0.5f);
                                                objectArray3[1] = Float.valueOf(f28);
                                                objectArray3[0] = Float.valueOf(f29);
                                                object = b8.g("\u00d9", (Object)objectArray3, (long)-6311975795164528556L, (long)l3);
                                            }
                                            b82.k = object;
                                            Object[] objectArray4 = new Object[2];
                                            objectArray4[1] = l;
                                            objectArray4[0] = Float.valueOf(this.k);
                                            callSite6 = b8.g("\u00d9", (Object)objectArray4, (long)-6312822704869919203L, (long)l3);
                                            try {
                                                b8 b84;
                                                block64: {
                                                    try {
                                                        try {
                                                            b84 = this;
                                                            if (callSite2 != null) break block63;
                                                            if (!(b84.l < 0.0f)) break block64;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                        }
                                                        this.l = (float)b8.g("\u00c7", (Object)callSite6, (long)-6306665962771000995L, (long)l3);
                                                        this.o = (float)b8.g("\u00c7", (Object)callSite6, (long)-6305661030499374805L, (long)l3);
                                                        this.p = (float)b8.g("\u00c7", (Object)callSite6, (long)-6312177152371257385L, (long)l3);
                                                        if (callSite2 == null) break block65;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                    }
                                                }
                                                Object[] objectArray5 = new Object[4];
                                                objectArray5[3] = l12;
                                                objectArray5[2] = Float.valueOf(f27);
                                                objectArray5[1] = Float.valueOf((float)b8.g("\u00c7", (Object)callSite6, (long)-6306665962771000995L, (long)l3));
                                                objectArray5[0] = Float.valueOf(this.l);
                                                this.l = (float)b8.g("\u00d9", (Object)objectArray5, (long)-6311975795164528556L, (long)l3);
                                                Object[] objectArray6 = new Object[4];
                                                objectArray6[3] = l12;
                                                objectArray6[2] = Float.valueOf(f27);
                                                objectArray6[1] = Float.valueOf((float)b8.g("\u00c7", (Object)callSite6, (long)-6305661030499374805L, (long)l3));
                                                objectArray6[0] = Float.valueOf(this.o);
                                                this.o = (float)b8.g("\u00d9", (Object)objectArray6, (long)-6311975795164528556L, (long)l3);
                                                b84 = this;
                                            }
                                            catch (MatchException matchException) {
                                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                            }
                                        }
                                        Object[] objectArray7 = new Object[4];
                                        objectArray7[3] = l12;
                                        objectArray7[2] = Float.valueOf(f27);
                                        objectArray7[1] = Float.valueOf((float)b8.g("\u00c7", (Object)callSite6, (long)-6312177152371257385L, (long)l3));
                                        objectArray7[0] = Float.valueOf(this.p);
                                        b84.p = (float)b8.g("\u00d9", (Object)objectArray7, (long)-6311975795164528556L, (long)l3);
                                    }
                                    color = new Color((int)this.l, (int)this.o, (int)this.p);
                                    callSite4 = b8.g("\u00d9", (int)callSite5, (long)-6307003091464892293L, (long)l3);
                                    Object[] objectArray8 = new Object[1];
                                    objectArray8[0] = l5;
                                    Object[] objectArray9 = new Object[1];
                                    objectArray9[0] = l10;
                                    CallSite callSite8 = b8.g("\u00c7", (Object)b8.g("\u00c7", (Object)b8.g("x", (long)-6307209635617082496L, (long)l3), (Object)objectArray8, (long)-6307278829128512903L, (long)l3), (Object)objectArray9, (long)-6306738855723463097L, (long)l3);
                                    Object[] objectArray10 = new Object[1];
                                    objectArray10[0] = l5;
                                    Object[] objectArray11 = new Object[2];
                                    objectArray11[1] = l11;
                                    objectArray11[0] = callSite4;
                                    var40_26 = b8.g("\u00c7", (Object)b8.g("\u00c7", (Object)b8.g("x", (long)-6307209635617082496L, (long)l3), (Object)objectArray10, (long)-6307278829128512903L, (long)l3), (Object)objectArray11, (long)-6312265477289150838L, (long)l3) * 1.0f;
                                    Object[] objectArray12 = new Object[1];
                                    objectArray12[0] = l5;
                                    Object[] objectArray13 = new Object[2];
                                    objectArray13[1] = l11;
                                    objectArray13[0] = b8.a("c", (int)13016, (long)(0x16D70208533B835FL ^ l3));
                                    var41_27 = b8.g("\u00c7", (Object)b8.g("\u00c7", (Object)b8.g("x", (long)-6307209635617082496L, (long)l3), (Object)objectArray12, (long)-6307278829128512903L, (long)l3), (Object)objectArray13, (long)-6312265477289150838L, (long)l3) * 0.65f;
                                    var42_28 = callSite8 * 1.0f;
                                    var43_29 = callSite8 * 0.65f;
                                    f26 = 7.5f;
                                    f25 = 5.5f + f26 + 5.5f;
                                    f21 = f25 + 0.5f + 5.5f;
                                    CallSite callSite9 = b8.g("\u00d9", (float)(var40_26 + 3.0f + var41_27), (float)28.0f, (long)-6312667691545422725L, (long)l3);
                                    f14 = f21 + callSite9 + 5.5f;
                                    callSite = b8.g("\u00d9", (Object)new Object[]{Float.valueOf((float)callSite8)}, (long)-6306562408544917276L, (long)l3);
                                    callSite3 = b8.g("\u00c7", (Object)this, (Object)new Object[0], (long)-6311809988424482318L, (long)l3);
                                    boolean bl = b8.g("\u00d4", (Object)b, (long)-6306305611321005562L, (long)l3) instanceof g8;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block66;
                                                        if (callSite3 == false) break block67;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                    }
                                                    f24 = this.t;
                                                    if (callSite2 != null) break block68;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                }
                                                if (!(f24 > 0.0f)) break block67;
                                            }
                                            catch (MatchException matchException) {
                                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                            }
                                            if (bl) break block67;
                                        }
                                        catch (MatchException matchException) {
                                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                        }
                                        this.e -= f14 - this.t;
                                    }
                                    catch (MatchException matchException) {
                                        throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                    }
                                }
                                this.t = f14;
                            }
                            f24 = this.e;
                        }
                        f20 = f24;
                        float f30 = this.f;
                        Object[] objectArray14 = new Object[10];
                        objectArray14[9] = l8;
                        objectArray14[8] = Float.valueOf(4.0f);
                        objectArray14[7] = 5;
                        objectArray14[6] = Float.valueOf((float)callSite);
                        objectArray14[5] = Float.valueOf(f14);
                        objectArray14[4] = Float.valueOf(f30);
                        objectArray14[3] = Float.valueOf(f20);
                        objectArray14[2] = matrix4f;
                        objectArray14[1] = gK2;
                        objectArray14[0] = aq_02;
                        b8.g("\u00d9", (Object)objectArray14, (long)-6312138690783700494L, (long)l3);
                        Object[] objectArray15 = new Object[10];
                        objectArray15[9] = l9;
                        objectArray15[8] = Float.valueOf(4.0f);
                        objectArray15[7] = cn_0.r;
                        objectArray15[6] = Float.valueOf((float)callSite);
                        objectArray15[5] = Float.valueOf(f14);
                        objectArray15[4] = Float.valueOf(f30);
                        objectArray15[3] = Float.valueOf(f20);
                        objectArray15[2] = matrix4f;
                        objectArray15[1] = gK2;
                        objectArray15[0] = aq_02;
                        b8.g("\u00d9", (Object)objectArray15, (long)-6312292617634145089L, (long)l3);
                        Object[] objectArray16 = new Object[1];
                        objectArray16[0] = l7;
                        CallSite callSite10 = b8.g("\u00d9", (Object)objectArray16, (long)-6306382423690633196L, (long)l3);
                        try {
                            f23 = callSite3 != false ? f20 + f14 - 5.5f - f26 : f20 + 5.5f;
                        }
                        catch (MatchException matchException) {
                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                        }
                        float f31 = f23;
                        try {
                            f22 = callSite3 != false ? f20 + f14 - f25 - 0.5f : f20 + f25;
                        }
                        catch (MatchException matchException) {
                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                        }
                        float f32 = f22;
                        Object[] objectArray17 = new Object[10];
                        objectArray17[9] = l6;
                        objectArray17[8] = callSite10;
                        objectArray17[7] = Float.valueOf(f26);
                        objectArray17[6] = Float.valueOf(f26);
                        objectArray17[5] = Float.valueOf(f30 + callSite / 2.0f - f26 / 2.0f);
                        objectArray17[4] = Float.valueOf(f31);
                        objectArray17[3] = this.d;
                        objectArray17[2] = matrix4f;
                        objectArray17[1] = gK2;
                        objectArray17[0] = aq_02;
                        b8.g("\u00d9", (Object)objectArray17, (long)-6312008154094383326L, (long)l3);
                        Object[] objectArray18 = new Object[7];
                        objectArray18[6] = l2;
                        objectArray18[5] = cn_0.v;
                        objectArray18[4] = Float.valueOf(f30 + callSite - 3.0f);
                        objectArray18[3] = Float.valueOf(f32 + 0.5f);
                        objectArray18[2] = Float.valueOf(f30 + 3.0f);
                        objectArray18[1] = Float.valueOf(f32);
                        objectArray18[0] = matrix4f;
                        b8.g("\u00d9", (Object)objectArray18, (long)-6306599284372986215L, (long)l3);
                        f19 = f30 + 3.0f;
                        if (callSite3 == false) break block78;
                        f13 = f20 + f14 - f21;
                        f18 = f13 - var41_27;
                        f17 = f18 - 3.0f - var40_26;
                        if (callSite2 == null) break block79;
                    }
                    f17 = f20 + f21;
                    f18 = f17 + var40_26 + 3.0f;
                }
                Object[] objectArray19 = new Object[1];
                objectArray19[0] = l5;
                Object[] objectArray20 = new Object[7];
                objectArray20[6] = l4;
                objectArray20[5] = color;
                objectArray20[4] = Float.valueOf(1.0f);
                objectArray20[3] = Float.valueOf(f19);
                objectArray20[2] = Float.valueOf(f17);
                objectArray20[1] = callSite4;
                objectArray20[0] = matrix4f;
                b8.g("\u00c7", (Object)b8.g("\u00c7", (Object)b8.g("x", (long)-6307209635617082496L, (long)l3), (Object)objectArray19, (long)-6307278829128512903L, (long)l3), (Object)objectArray20, (long)-6312884617527475709L, (long)l3);
                Object[] objectArray21 = new Object[1];
                objectArray21[0] = l5;
                Object[] objectArray22 = new Object[7];
                objectArray22[6] = l4;
                objectArray22[5] = cn_0.t;
                objectArray22[4] = Float.valueOf(0.65f);
                objectArray22[3] = Float.valueOf(f19 + (var42_28 - var43_29) - 0.5f);
                objectArray22[2] = Float.valueOf(f18);
                objectArray22[1] = b8.a("c", (int)6820, (long)(0x286972C66B4E2B22L ^ l3));
                objectArray22[0] = matrix4f;
                b8.g("\u00c7", (Object)b8.g("\u00c7", (Object)b8.g("x", (long)-6307209635617082496L, (long)l3), (Object)objectArray21, (long)-6307278829128512903L, (long)l3), (Object)objectArray22, (long)-6312884617527475709L, (long)l3);
                f13 = f19 + var42_28 + 1.0f + 4.0f;
                try {
                    f16 = callSite3 != false ? f20 + 5.5f : f20 + f21;
                }
                catch (MatchException matchException) {
                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                }
                f12 = f16;
                try {
                    f15 = callSite3 != false ? f20 + f14 - f21 : f20 + f14 - 5.5f;
                }
                catch (MatchException matchException) {
                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                }
                float f33 = f15;
                f11 = (f33 - f12) / 24.0f;
                f10 = 60.0f;
                float[] fArray = this.g;
                int n3 = fArray.length;
                int n4 = 0;
                while (n4 < n3) {
                    block69: {
                        block71: {
                            f = fArray[n4];
                            try {
                                try {
                                    if (callSite2 != null) break block69;
                                    n2 = f == f10 ? 0 : (f > f10 ? 1 : -1);
                                    if (callSite2 != null) break block70;
                                }
                                catch (MatchException matchException) {
                                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                }
                                if (n2 <= 0) break block71;
                            }
                            catch (MatchException matchException) {
                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                            }
                            f10 = f;
                        }
                        ++n4;
                    }
                    if (callSite2 == null) continue;
                }
                n2 = n = 0;
            }
            while (n < b8.c("j", (int)2288, (long)(0x525708A1945AF002L ^ l3))) {
                block75: {
                    Object object;
                    CallSite callSite11;
                    float f34;
                    block76: {
                        block77: {
                            float f30;
                            float f31;
                            float f37;
                            block73: {
                                f37 = this.g[(this.h + n) % b8.c("j", (int)2288, (long)(0x525708A1945AF002L ^ l3))];
                                try {
                                    block74: {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != null) break block72;
                                                    f31 = f37;
                                                    f30 = 0.0f;
                                                    if (callSite2 != null) break block73;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                                }
                                                if (!(f31 <= f30)) break block74;
                                            }
                                            catch (MatchException matchException) {
                                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                            }
                                            if (callSite2 == null) break block75;
                                        }
                                        catch (MatchException matchException) {
                                            throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                        }
                                    }
                                    f31 = 0.5f;
                                    f30 = f37 / f10 * 3.5f;
                                }
                                catch (MatchException matchException) {
                                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                }
                            }
                            f34 = f31 + f30;
                            f = f12 + (float)n * f11;
                            Object[] objectArray23 = new Object[2];
                            objectArray23[1] = l;
                            objectArray23[0] = Float.valueOf(f37);
                            callSite11 = b8.g("\u00d9", (Object)objectArray23, (long)-6312822704869919203L, (long)l3);
                            try {
                                try {
                                    object = n;
                                    if (callSite2 != null) break block76;
                                    if (object != b8.c("j", (int)32074, (long)(0x158F959FC6E185B5L ^ l3))) break block77;
                                }
                                catch (MatchException matchException) {
                                    throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                                }
                                object = b8.c("j", (int)30329, (long)(0xB39B5FF80438E84L ^ l3));
                                break block76;
                            }
                            catch (MatchException matchException) {
                                throw b8.g("\u00d9", (Object)matchException, (long)-6307027052369680390L, (long)l3);
                            }
                        }
                        object = b8.c("j", (int)30782, (long)(0x19A1BD83737480C4L ^ l3));
                    }
                    int n5 = object;
                    Object[] objectArray24 = new Object[7];
                    objectArray24[6] = l2;
                    objectArray24[5] = new Color((int)b8.g("\u00c7", (Object)callSite11, (long)-6306665962771000995L, (long)l3), (int)b8.g("\u00c7", (Object)callSite11, (long)-6305661030499374805L, (long)l3), (int)b8.g("\u00c7", (Object)callSite11, (long)-6312177152371257385L, (long)l3), n5);
                    objectArray24[4] = Float.valueOf(f13);
                    objectArray24[3] = Float.valueOf(f + f11 - 0.2f);
                    objectArray24[2] = Float.valueOf(f13 - f34);
                    objectArray24[1] = Float.valueOf(f + 0.2f);
                    objectArray24[0] = matrix4f;
                    b8.g("\u00d9", (Object)objectArray24, (long)-6306599284372986215L, (long)l3);
                }
                ++n;
                if (callSite2 == null) continue;
            }
            Object[] objectArray25 = new Object[2];
            objectArray25[1] = Float.valueOf((float)callSite);
            objectArray25[0] = Float.valueOf(f14);
            b8.g("\u00c7", (Object)this, (Object)objectArray25, (long)-6306368501543914018L, (long)l3);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = b8.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39C8;
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
                throw new RuntimeException("dev/zprestige/prestige/b8", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            b8.I[n2] = l4;
        }
        return I[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19F0;
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
                throw new RuntimeException("dev/zprestige/prestige/b8", exception);
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
            b8.x[n2] = b8.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static int a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = v ^ l;
        try {
            return (int)b8.g("\u00d9", (Object)b8.g("\u00c7", string, (Object)" ", (long)3509931759814820780L, (long)l)[0], (long)3510135959560741005L, (long)l);
        }
        catch (Exception exception) {
            return 0;
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
                        callSite = b8.g("\u00d9", (long)4512885612295877319L, (long)l);
                        try {
                            try {
                                float f11 = f10 - 120.0f;
                                f = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                if (callSite != null) break block11;
                                if (f < 0) break block12;
                            }
                            catch (MatchException matchException) {
                                throw b8.g("\u00d9", (Object)matchException, (long)4514175981460287783L, (long)l);
                            }
                            return new Color((int)b8.c("j", (int)958, (long)(0x2FB32A932B9DED9FL ^ l)), (int)b8.c("j", (int)3781, (long)(0x55ABC588BB00E0EEL ^ l)), (int)b8.c("j", (int)11145, (long)(0x4739EEF2485145BEL ^ l)));
                        }
                        catch (MatchException matchException) {
                            throw b8.g("\u00d9", (Object)matchException, (long)4514175981460287783L, (long)l);
                        }
                    }
                    float f12 = f10 - 60.0f;
                    f = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (callSite != null) break block13;
                        if (f < 0) break block14;
                    }
                    catch (MatchException matchException) {
                        throw b8.g("\u00d9", (Object)matchException, (long)4514175981460287783L, (long)l);
                    }
                    return new Color((int)b8.c("j", (int)5776, (long)(0x7855D2552DE9F8BEL ^ l)), (int)b8.c("j", (int)17069, (long)(0x38BEAFFB4C56AC80L ^ l)), (int)b8.c("j", (int)695, (long)(0x402D0CB4BC6C6C81L ^ l)));
                }
                catch (MatchException matchException) {
                    throw b8.g("\u00d9", (Object)matchException, (long)4514175981460287783L, (long)l);
                }
            }
            float f13 = f10 - 30.0f;
            f = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
        }
        try {
            if (f >= 0) {
                return new Color((int)b8.c("j", (int)1601, (long)(0x1A2BF270E245E865L ^ l)), (int)b8.c("j", (int)18208, (long)(0x401025CDA6D6A903L ^ l)), (int)b8.c("j", (int)27596, (long)(0x4BFDF4C6682305E5L ^ l)));
            }
        }
        catch (MatchException matchException) {
            throw b8.g("\u00d9", (Object)matchException, (long)4514175981460287783L, (long)l);
        }
        return new Color((int)b8.c("j", (int)17365, (long)(0x4CD92EA57AF02DFFL ^ l)), (int)b8.c("j", (int)10259, (long)(0x2A0211FDA6C6C63FL ^ l)), (int)b8.c("j", (int)18989, (long)(0x43D4656E3856A40BL ^ l)));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b8.a(n, l);
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
        objectArray2[0] = Float.valueOf(2.0f);
        b8.g("\u00c7", (Object)this, (Object)objectArray2, (long)-3380512638064474162L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = b8.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = b8.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b8.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b8.e(clazz3, string2, clazz2)) != null) {
                    b8.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b8.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b8.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b8.j(3235111254478107L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/b8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = b8.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                b8.K[n] = clazz = Class.forName(L[n]);
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
            return MethodHandles.lookup().findStatic(b8.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b8.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(b8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b8.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


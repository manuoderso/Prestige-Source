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
import dev.zprestige.prestige.cA;
import dev.zprestige.prestige.cn_0;
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
 * Renamed from dev.zprestige.prestige.ch
 */
public class ch_0
extends b4 {
    private bW a;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long[] B;
    private static final Integer[] C;
    private static final Map D;
    private static final long H;
    private static final Object[] I;
    private static final String[] J;

    public ch_0(long l) {
        long l2 = (l = v ^ l) ^ 0x5FE047892469L;
        super((String)((Object)ch_0.a("t", (int)6592, (long)(0x25D22FE37DCEF771L ^ l))), (String)((Object)ch_0.a("t", (int)22670, (long)(0x7713EC80FE6BB63CL ^ l))), l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            ch_0.v = hc.a(5385774621090333611L, 7018042964065732520L, MethodHandles.lookup().lookupClass()).a(31407661210846L);
                            ch_0.I = new Object[93];
                            ch_0.J = new String[93];
                            ch_0.b();
                            ch_0.y = new HashMap<K, V>(13);
                            var16 = ch_0.v ^ 67875263374641L;
                            var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var16 >>> 56);
                            for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                                v2 = v2;
                                v2[var19_2] = (byte)(var16 << var19_2 * 8 >>> 56);
                            }
                            var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var25_3 = new String[5];
                            var23_4 = 0;
                            var22_5 = "W\u00c8xiy\u00aa\u0019&j\u00c0o\u00ef\u00a8n\u00bb\u00fe(0a'\u0013\u00bc\u00859\u00f6\u00853\u00f2\u00f2\u00fa\u0000\u00e1\u00b6\u00db\u0098C\u00a1q,\u00e9\u00bcf\u0003r{T\u0002\u00f5}H\u0000\u008d7^\u00ae7\f\u0010\u00e24\u0099\u00ec\u009f\u00fa\u00e8aG\u0012\u00e0\u00a5%-%\u00e7";
                            var24_6 = "W\u00c8xiy\u00aa\u0019&j\u00c0o\u00ef\u00a8n\u00bb\u00fe(0a'\u0013\u00bc\u00859\u00f6\u00853\u00f2\u00f2\u00fa\u0000\u00e1\u00b6\u00db\u0098C\u00a1q,\u00e9\u00bcf\u0003r{T\u0002\u00f5}H\u0000\u008d7^\u00ae7\f\u0010\u00e24\u0099\u00ec\u009f\u00fa\u00e8aG\u0012\u00e0\u00a5%-%\u00e7".length();
                            var21_7 = 16;
                            var20_8 = -1;
lbl32:
                            // 2 sources

                            while (true) {
                                v3 = ++var20_8;
                                v4 = var22_5.substring(v3, v3 + var21_7);
                                v5 = -1;
                                break block20;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = ch_0.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "\u0093\u00b2\u00ae\u00a9R\u007fz\u00eb+\u00a1\u0015\u00fd&\u00af\u00b8\u00cb\u00bf\u008aE^\u00eem-\u001d`\b\f\u00eb\u00de\u00e6W\u00f599\u00c9\u001d\u00f2\u00af\u001b\u00b1\u00fe\u00b7\u0090Cn\u00d1\u008aN\u0092A\n\u008aQ\u0015L\u00b2l\u00b9\u00a6+\u00c5\u00c9\u00f8S\u0010\u00e09\u00c7\u00ec]\u00a9T\u008f\u00ee!l\rR\u00d3\u00fcL";
                                var24_6 = "\u0093\u00b2\u00ae\u00a9R\u007fz\u00eb+\u00a1\u0015\u00fd&\u00af\u00b8\u00cb\u00bf\u008aE^\u00eem-\u001d`\b\f\u00eb\u00de\u00e6W\u00f599\u00c9\u001d\u00f2\u00af\u001b\u00b1\u00fe\u00b7\u0090Cn\u00d1\u008aN\u0092A\n\u008aQ\u0015L\u00b2l\u00b9\u00a6+\u00c5\u00c9\u00f8S\u0010\u00e09\u00c7\u00ec]\u00a9T\u008f\u00ee!l\rR\u00d3\u00fcL".length();
                                var21_7 = 64;
                                var20_8 = -1;
lbl46:
                                // 2 sources

                                while (true) {
                                    v6 = ++var20_8;
                                    v4 = var22_5.substring(v6, v6 + var21_7);
                                    v5 = 0;
                                    break block20;
                                    break;
                                }
                                break;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = ch_0.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                break block21;
                                break;
                            }
                        }
                        var26_9 = var18_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                    ch_0.w = var25_3;
                    ch_0.x = new String[5];
                    ch_0.D = new HashMap<K, V>(13);
                    var5_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var16 >>> 56);
                    for (var6_11 = 1; var6_11 < 8; ++var6_11) {
                        v9 = v9;
                        v9[var6_11] = (byte)(var16 << var6_11 * 8 >>> 56);
                    }
                    var5_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                    var11_12 = new long[6];
                    var8_13 = 0;
                    var9_14 = "j\u00b7\u00b2\u0081.Z\u00af\u000b\u0005\u000e\u00c7\u00cf\u007f\u00ffW\u0016\u007f\u009a\u00a8CR\u009a\u00b3\u00b2g\u00b8\u00b2\u00cb\u00c0r\t\u001e";
                    var10_15 = "j\u00b7\u00b2\u0081.Z\u00af\u000b\u0005\u000e\u00c7\u00cf\u007f\u00ffW\u0016\u007f\u009a\u00a8CR\u009a\u00b3\u00b2g\u00b8\u00b2\u00cb\u00c0r\t\u001e".length();
                    var7_16 = 0;
                    while (true) {
                        var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                        v10 = var11_12;
                        v11 = var8_13++;
                        v12 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                        v13 = -1;
                        break block22;
                        break;
                    }
lbl102:
                    // 1 sources

                    while (true) {
                        v10[v11] = v14;
                        if (var7_16 < var10_15) ** continue;
                        var9_14 = "\u00bc\u00b9XP\u009fn\u008c\u00ef\u00f1\u00f9r\u00c5\u00dej\u00b1\u0010";
                        var10_15 = "\u00bc\u00b9XP\u009fn\u008c\u00ef\u00f1\u00f9r\u00c5\u00dej\u00b1\u0010".length();
                        var7_16 = 0;
                        while (true) {
                            var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                            v10 = var11_12;
                            v11 = var8_13++;
                            v12 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                            v13 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl121:
                    // 1 sources

                    while (true) {
                        v10[v11] = v14;
                        if (var7_16 < var10_15) ** continue;
                        break block23;
                        break;
                    }
                }
                var13_18 = v12;
                var15_19 = var5_10.doFinal(new byte[]{(byte)(var13_18 >>> 56), (byte)(var13_18 >>> 48), (byte)(var13_18 >>> 40), (byte)(var13_18 >>> 32), (byte)(var13_18 >>> 24), (byte)(var13_18 >>> 16), (byte)(var13_18 >>> 8), (byte)var13_18});
                v14 = ((long)var15_19[0] & 255L) << 56 | ((long)var15_19[1] & 255L) << 48 | ((long)var15_19[2] & 255L) << 40 | ((long)var15_19[3] & 255L) << 32 | ((long)var15_19[4] & 255L) << 24 | ((long)var15_19[5] & 255L) << 16 | ((long)var15_19[6] & 255L) << 8 | (long)var15_19[7] & 255L;
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
            ch_0.B = var11_12;
            ch_0.C = new Integer[6];
            var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v15 = SecretKeyFactory.getInstance("DES");
            v16 = new byte[8];
            v17 = v16;
            v16[0] = (byte)(var16 >>> 56);
            for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                v17 = v17;
                v17[var1_21] = (byte)(var16 << var1_21 * 8 >>> 56);
            }
            break block24;
lbl154:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
        var2_22 = 5453468975120303359L;
        var4_23 = var0_20.doFinal(new byte[]{(byte)(var2_22 >>> 56), (byte)(var2_22 >>> 48), (byte)(var2_22 >>> 40), (byte)(var2_22 >>> 32), (byte)(var2_22 >>> 24), (byte)(var2_22 >>> 16), (byte)(var2_22 >>> 8), (byte)var2_22});
        ** while (true)
        ch_0.H = ((long)var4_23[0] & 255L) << 56 | ((long)var4_23[1] & 255L) << 48 | ((long)var4_23[2] & 255L) << 40 | ((long)var4_23[3] & 255L) << 32 | ((long)var4_23[4] & 255L) << 24 | ((long)var4_23[5] & 255L) << 16 | ((long)var4_23[6] & 255L) << 8 | (long)var4_23[7] & 255L;
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
        if (J[n3] != null) {
            return n3;
        }
        Object object = I[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 11;
            case 1 -> 49;
            case 2 -> 43;
            case 3 -> 59;
            case 4 -> 34;
            case 5 -> 51;
            case 6 -> 24;
            case 7 -> 7;
            case 8 -> 48;
            case 9 -> 1;
            case 10 -> 38;
            case 11 -> 39;
            case 12 -> 58;
            case 13 -> 20;
            case 14 -> 47;
            case 15 -> 22;
            case 16 -> 50;
            case 17 -> 28;
            case 18 -> 23;
            case 19 -> 15;
            case 20 -> 35;
            case 21 -> 62;
            case 22 -> 30;
            case 23 -> 13;
            case 24 -> 40;
            case 25 -> 3;
            case 26 -> 8;
            case 27 -> 2;
            case 28 -> 55;
            case 29 -> 25;
            case 30 -> 61;
            case 31 -> 44;
            case 32 -> 17;
            case 33 -> 36;
            case 34 -> 57;
            case 35 -> 45;
            case 36 -> 33;
            case 37 -> 60;
            case 38 -> 12;
            case 39 -> 10;
            case 40 -> 32;
            case 41 -> 31;
            case 42 -> 0;
            case 43 -> 53;
            case 44 -> 46;
            case 45 -> 29;
            case 46 -> 18;
            case 47 -> 4;
            case 48 -> 54;
            case 49 -> 42;
            case 50 -> 37;
            case 51 -> 14;
            case 52 -> 41;
            case 53 -> 63;
            case 54 -> 52;
            case 55 -> 5;
            case 56 -> 26;
            case 57 -> 27;
            case 58 -> 21;
            case 59 -> 16;
            case 60 -> 9;
            case 61 -> 19;
            case 62 -> 56;
            default -> 6;
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
        ch_0.J[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = I;
        I[0] = "~\u0017\u0016=Cwh\u0017\u0013gP`\u007f\\\u0010a\\tn\u001b\u0007v\u0017d[";
        objectArray[1] = "<Qzv\u0006*Iqqy\u0017e(\u007fzr\u0013?\\";
        objectArray[2] = Float.TYPE;
        ch_0.J[2] = "java/lang/Float";
        objectArray[3] = "S\u00171oMF&7:`\\\tG91kXS3";
        objectArray[4] = Void.TYPE;
        ch_0.J[4] = "java/lang/Void";
        objectArray[5] = "ca\u007fi>0uaz3-'b*y5!3smn\"j\"3";
        objectArray[6] = "\u0018\r\u001a20pm-\u0011=!?\f#\u001a6%ex";
        objectArray[7] = "U\u0006H\u0003p@V\n[L\u0012[\\\u0006R67YZ";
        objectArray[8] = Integer.TYPE;
        ch_0.J[8] = "java/lang/Integer";
        objectArray[9] = "e\u00035\u001d77x\u0016m?v:`\u0010";
        objectArray[10] = "k/\u0006\u001a.,}/\u0003@=;jd\u0000F1/{#\u0017Qz=G";
        objectArray[11] = "\u0011VR*kjdvY%z%\u0019nJ\"slq";
        objectArray[12] = "f0.6a4p0+lr#g{(j~7v<?}5 C";
        objectArray[13] = "\u0014nb\u001aeoaNi\u0015t \u0000@b\u001epzt";
        objectArray[14] = "\u001dbmh\u00029\u000bbh2\u0011.\u001c)k4\u001d:\rn|#V*\u0011";
        objectArray[15] = "\tc\u007fj\u0019e|Cte\b*\u001dM\u007fn\fpi";
        objectArray[16] = "\u000f B\u001e@\u0015z\u0000I\u0011QZ\u001b\u000eB\u001aU\u0000o";
        objectArray[17] = "k\u0016\u001e`>F`\u0019\u000f/YDu\u0012\u000fdb";
        objectArray[18] = "RrPE}jY}A\n\u0000rJzHC";
        objectArray[19] = "\n\u001fs8\u00069\u0014\u0017iwd#\u0003\u001fi<";
        objectArray[20] = "*lFDNR<lC\u001e]E+'@\u0018QQ:`W\u000f\u001aC\u000b";
        objectArray[21] = "Co*pOo6O!\u007f^ WA*tZz#";
        objectArray[22] = Character.TYPE;
        ch_0.J[22] = "java/lang/Character";
        objectArray[23] = "\u0018H#>GL\u001bD0q-Y\u000bf3\b\f]\u0019";
        objectArray[24] = "\u0004\rcs\u0019B\u0007\u0001p<QY\u001c\u0001tf\u0019b\u000b\u0014aACO\u0002\t";
        objectArray[25] = "U5g(u!V9tg\u0017:\\5}\r:!Z";
        objectArray[26] = "_\n^(25I\n[r!\"^AXt-6O\u0006Ocf&W\u0006Mh<kk\u001dMu<,\\\n";
        objectArray[27] = "(@0~\u0013\u001c>@5$\u0000\u000b)\u000b6\"\f\u001f8L!5G\u000f\u000f";
        objectArray[28] = "\u0007\u001f\r8PC\u0011\u001f\bbCT\u0006T\u000bdO@\u0017\u0013\u001cs\u0004W(";
        objectArray[29] = "PE";
        objectArray[30] = "V\u001b\u0001\u0011z\u0005#;\n\u001ekJB5\u0001\u0015o\u00106";
        objectArray[31] = "\u0015`&^Fd\u0003`#\u0004Us\u0014+ \u0002Yg\u0005l7\u0015\u0012p\u001c";
        objectArray[32] = "@veBT[5VnME\u0014TXeFAN ";
        objectArray[33] = "=56\u0003w\u000f+53Yd\u0018<~0_h\f-9'H#\u001d\u000e";
        objectArray[34] = "\u0004tA`5\u0003\u000f{P/V\u000e\u001av_Dc\f\u000beCht\u0001";
        objectArray[35] = "4#*\u0016XvA\u0003!\u0019I9 \r*\u0012McT";
        objectArray[36] = "!hGWs!THLXbn5FGSf4A";
        objectArray[37] = ">O<9_c(O9cLt?\u0004:e@`.C-r\u000bw1";
        objectArray[38] = "c&x\u0007\be\u0016\u0006s\b\u0019*w\bx\u0003\u001dp\u0003";
        objectArray[39] = "-56\u001d/2;53G<%,~0A01=9'V{&-";
        objectArray[40] = "\u0010\u0017e\u0012|{e7n\u001dm4\u00049e\u0016inp";
        objectArray[41] = "\u0005JyH,r\u0013J|\u0012?e\u0004\u0001\u007f\u00143q\u0015Fh\u0003xf\r";
        objectArray[42] = "XzkH*\u0010-Z`G;_LTkL?\u00058";
        objectArray[43] = ",W78T+'X&w7&2^";
        objectArray[44] = Double.TYPE;
        ch_0.J[44] = "java/lang/Double";
        objectArray[45] = ">\u0003\u007fDb&K#tKsi*-\u007f@w3^";
        objectArray[46] = Boolean.TYPE;
        ch_0.J[46] = "java/lang/Boolean";
        objectArray[47] = "%{9oy\u0010.t( \u0004\u0005<n*c";
        objectArray[48] = Long.TYPE;
        ch_0.J[48] = "java/lang/Long";
        objectArray[49] = "\u0016\u0014\n\"L\\c4\u0001-]\u0013\u001e,\u0012*TZv";
        objectArray[50] = "KK\rlP\u0004@D\u001c#1\nKO\u0018y";
        objectArray[51] = "uZ\u0004+2B5N\u0004o\rD%M&yfL.]}*1Yy\f\u0014s3\u001181";
        objectArray[52] = "]\u0019l\u0012r1_\u0003p\u0012Nd\u000e\u001d^\u0017#f\u0005a/Q<:^\bvSt{c";
        objectArray[53] = "HM<Q\b\u0001\u0016\fgT5\u0017w\u0000`JX\u0007\u0014\u00175]I}";
        objectArray[54] = "=+ u4\u001cmp4}\u000b\u0001\r7!og\f` 6yle6y1qs\bfp\"i\u000b";
        objectArray[55] = "U[Y^5\u0019WAE^\tL\u0006_~Le#U\u001fV\u00104J\f\u001d\u001eQ\t";
        objectArray[56] = "\u0016S\u0007%\u0013GN\r\u0007&kB\u007f\u0013\f7\u0007Q\u0012\u0004\u001b!\f8D]\u001c)\u0013U\u0014T\u000f1k";
        objectArray[57] = "s\nMM_%3\u001eM\t`##\u001dt\u0015\u001d6N_\b\u0000Qq'\u0006\nH\u0010L";
        objectArray[58] = "\u0019q\u0013 /\u0007D'\u0016\"][%7V 1SH A6::\u001eyF>%WNpU&]";
        objectArray[59] = ",\u0001T8\u001bd~B\u0014(aq.\\S*&aG\u0006\u00125P2._\u0010}\u0011\u000f,\u0001T8\u001bd~B\u0014(a";
        objectArray[60] = "-OKn\u0000@}K\u000f68G!q\u0012,UA\r\\\u000e>8W#DL5BG4\\DSSAx\bM(\u0003E<Pu";
        objectArray[61] = "W\u001cj]*FWU$AI\u0014:RoX%\u0011WExN.x\u0004Ti_uB\u0006Nu_I";
        objectArray[62] = "~c@L<~.g\u0004\u0014\u0004{|}\u0003\u001cCk\u0015w\u0010\u0001~5pd\u001fLv\u0005~c@L<~.g\u0004\u0014\u0004";
        objectArray[63] = "\u0011I?5*\u0000N\u001fn+\u0016\u0010\u0013\\I6m\u0007\u001aIt\u0011\u007f\u001a\u0013 j-j\u0004OQfkx\u001b~L`&/\u0019\u0004\\w>'\u007f\u0015Z;j.\u0004E^\u007f2\u0016";
        objectArray[64] = "E\u0016'PeP\u0005\u0002'\u0014ZV\u0015\u0001\u001b\u000e<D\u0004\u0010^QfKI@7\bd\u0003\b}";
        objectArray[65] = "(&\u0006VWKh2\u0006\u0012hMx19\u0000\u000eE\u0015sC\u001bY\u001f|*AS\u0018\"";
        objectArray[66] = "\u0010UJqwIAJ@z\u0019\u0016\u001dXvvh>\u001e{Wrzy\u001fM\u0000}%\u0006@\u001bQc\u0019";
        objectArray[67] = "P}>M=\u000f^r:T\u0000\t1r Rm\u0005LrfQe";
        objectArray[68] = "\u000b;\tJ?U\u0000~\\FTVi\"VKeS\u0004-WJj<";
        objectArray[69] = "4\rF\u0004q\f4KE\f\u0016\u0018U\u000b\\\u0011z\u00188\u001cK\u0007qqo\u0015\u001b\f(\u0010l\u001f\\i";
        objectArray[70] = "\u0019X\u0005X<<\u001aU\b\u0015\u0000/}DC\u0010l/\u0010ST\u0006gF\u001b\u0007I\u0003=vMJ\u0003\u0018\u0000";
        objectArray[71] = "--\t5\u0014$!k\u001b*%\u001b\u001f\u00131NJ/>,D?Fi,3";
        objectArray[72] = "Y&MU1XI1U]Wos\fx-\fb5/Y\u001dnDO?N\u0005f";
        objectArray[73] = "1+\u0007\u0019P\fl}\u0002\u001b\"X\rmB\u0019NX`zU\u000fE16#R\u0007Z\\f*A\u001f\"";
        objectArray[74] = "@'`y8\f\u00003`=\u0007\u0003\u001a3\u0019{l\u001cBsp;x\u001c\u0006L";
        objectArray[75] = "`b&.\u001b88<&-c.\t;j$\u00075q9=y\u0004Gn`6 \u0011?l7k#c";
        objectArray[76] = "zT/\u0012+\ry^hw~l>Ok\u001b|\u0001)X}\u0010\u0015VxDb\u0011y\u0005=J)w";
        objectArray[77] = "yZ>\u001fR>zPyz\u0005_=Az\u0016\u00052*Vl\u001dle{Js\u001c\u00006>D8z";
        objectArray[78] = "`\u0003\u0004\fj\u00030\u0007@TR\u0003v\u0013AM(\u0019m\u0016:\u000fn\n:DSVlB{yQKlE3\u0002\u0001O(\u001d\u000b";
        objectArray[79] = "9\u001e*|\u0001<i\u001an$9)5\u001eq(EG9\u001e*|\u0001<i\u001an$99)\u001cx(T.>\nsAR=lY,:\u00029(\u0001\u0014";
        objectArray[80] = "5\t,\u0015\u001eRd\u0016&\u001ep\u00042\u0007\\\u001b\u0001\u0012;\u0016lJ\u001e\u00180x";
        objectArray[81] = "\u001dA-\u001fo TF(T\u0014-d\u0002h\u001dx/\t\u0015\u007f\u000bsF_Lx\u0003l+\u000fEk\u001b\u0014";
        objectArray[82] = "\\\u00183\u0015~\u0012\u001a\u00110\u0015\u0018\u0004&V0Tt\u0000KA'B\u007fi\u001d\u0018 J`\u0004M\u00113R\u0018";
        objectArray[83] = "(:\u001c*8B* \u0000*\u0004\u0017{>+1y\u0015\u0016|]'5E\u007f%_otx";
        objectArray[84] = "lfR;J(<b\u0016cr/`A\u0014~\u001f)Lu\u0017kr?bmU`\b/uu]\u0006\u0019)9!T}I-}yl";
        objectArray[85] = "[.$8{\\Np:)C\u0007 3&!/\u0005M$17$l\u001b}6?;\u0001Kt%'C";
        objectArray[86] = "sY>G1ow\u0007*\u001a\fro\u0000E]ppdZ#Xf47f8\\uc2\u0000=J10\u000e";
        objectArray[87] = "\u0016xoW\"(K.jUP~*>*W<|G)=A7\u0015U)/C+/Z.;\u0013P";
        objectArray[88] = "u: Q\t\u007f~ja\u00115%xp BS2Yk?Bp/an;T5>xaj\u0012H,?1*/";
        objectArray[89] = "WD+\u001c\u000b3TNlyJR\u0013_o\u0015\\?\u0004Hy\u001e5i]Oq\u0001X9T\\iy";
        objectArray[90] = "n`\n\u001fP00!Q\u001am&Q-V\u0004\u000062:\u0003\u0013\u0011LjlP\u001c\u0015!:eC\u0004m";
        objectArray[91] = "\u0012NIHq!\u0016\u0010]\u0015L\"\u0006\u00012\u0015t7\u001e\u0017^F19Uq\b\u0017<6\t\u001d[R2}oK\n_=!\u0003\u0018OQvG";
        Object[] objectArray2 = objectArray;
        objectArray[92] = "?\u001fp\u00158>o\u001b4M\u0000>)\u000f5Tz$2\nN\u0016<7eX'O>\u007f$ep\u0014rti\f)\u0016:5T\u000e4\u0016=}/^0ReE";
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ch" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ch_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == 'T' || c == 'P' || c == '\u00fd') {
                field = ch_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ch_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ch_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53C3;
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
                throw new RuntimeException("dev/zprestige/prestige/ch", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ch_0.C[n2] = n3;
        }
        return C[n2];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ch_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ch_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ch_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ch_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = ch_0.i(l, l2);
        Object object = I[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = J[n];
                int n3 = string2.indexOf(8);
                clazz3 = ch_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ch_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ch_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ch_0.I[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ch_0.j(3543650394070308L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ch_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ch_0.I[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ch_0.j(3543650394070308L, 0L);
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
        float f;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Object object;
        Object object2;
        String string;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        CallSite callSite4;
        CallSite callSite5;
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
        Matrix4f matrix4f;
        gK gK2;
        aq_0 aq_02;
        block23: {
            CallSite callSite6;
            long l11;
            block22: {
                long l12;
                block21: {
                    aq_02 = (aq_0)objectArray[0];
                    gK2 = (gK)objectArray[1];
                    matrix4f = (Matrix4f)objectArray[2];
                    l10 = (Long)objectArray[3];
                    long l13 = l10;
                    l12 = l13 ^ 0x33F5EE405241L;
                    l9 = l13 ^ 0x7876565874AFL;
                    l8 = l13 ^ 0x28FF21DFFB5CL;
                    l7 = l13 ^ 0x56B4B80BF914L;
                    l6 = l13 ^ 0x194A66AD9C40L;
                    l5 = l13 ^ 0x51117395139CL;
                    l4 = l13 ^ 0x5D6649FEB165L;
                    l11 = l13 ^ 0x77FE815D5D37L;
                    l3 = l13 ^ 0x31240AA31D80L;
                    l2 = l13 ^ 0x1190C45D2788L;
                    l = l13 ^ 0x5BE4B21DC642L;
                    callSite6 = ch_0.d("\u00f4", (long)-6306438802693664166L, (long)l10);
                    try {
                        ch_0 ch_02;
                        try {
                            ch_02 = this;
                            if (callSite6 != null) break block21;
                            if (ch_02.a != null) break block22;
                        }
                        catch (MatchException matchException) {
                            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
                        }
                        ch_02 = this;
                    }
                    catch (MatchException matchException) {
                        throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
                    }
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l12;
                objectArray2[0] = ch_0.a("t", (int)5573, (long)(0x10D8FEB383C5BC78L ^ l10));
                ch_02.a = ch_0.d("\u00f4", (Object)objectArray2, (long)-6311840729586418664L, (long)l10);
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l11;
            callSite5 = ch_0.d("Y", (Object)ch_0.d("P", (long)-6312202331354806188L, (long)l10), (Object)objectArray3, (long)-6312038716515858879L, (long)l10);
            callSite4 = ch_0.d("\u00f4", (long)-6312639754845729712L, (long)l10);
            callSite3 = ch_0.d("\u00f4", (Object)ch_0.a("t", (int)14418, (long)(0x473D88592C5391E8L ^ l10)), (Object)new Object[]{ch_0.d("\u00f4", (int)ch_0.d("Y", (Object)callSite4, (long)-6307291169507481429L, (long)l10), (long)-6307148387404736916L, (long)l10)}, (long)-6312435176760838229L, (long)l10);
            callSite2 = ch_0.d("\u00f4", (Object)ch_0.a("t", (int)7364, (long)(0x2C33C78D0F6AB57AL ^ l10)), (Object)new Object[]{ch_0.d("\u00f4", (int)ch_0.d("Y", (Object)callSite4, (long)-6312245195967901147L, (long)l10), (long)-6307148387404736916L, (long)l10)}, (long)-6312435176760838229L, (long)l10);
            callSite = ch_0.d("\u00f4", (Object)ch_0.a("t", (int)7364, (long)(0x2C33C78D0F6AB57AL ^ l10)), (Object)new Object[]{ch_0.d("\u00f4", (int)ch_0.d("Y", (Object)callSite4, (long)-6306525377816550969L, (long)l10), (long)-6307148387404736916L, (long)l10)}, (long)-6312435176760838229L, (long)l10);
            CallSite callSite7 = ch_0.d("Y", (Object)ch_0.d("Y", (Object)ch_0.d("\u00f4", (long)-6313379308116187290L, (long)l10), (long)-6312080969895921816L, (long)l10), (Object)ch_0.d("P", (long)-6311926375962136171L, (long)l10), (Object)ch_0.d("P", (long)-6312829425212598179L, (long)l10), (long)-6306804460713410957L, (long)l10);
            string = (String)((Object)ch_0.d("Y", (Object)ch_0.d("Y", (Object)callSite7, (int)0, (int)1, (long)-6313625732423978610L, (long)l10), (Object)ch_0.d("P", (long)-6312829425212598179L, (long)l10), (long)-6313106469996249731L, (long)l10)) + (String)((Object)ch_0.d("Y", (Object)ch_0.d("Y", (Object)callSite7, (int)1, (long)-6312416246937172222L, (long)l10), (Object)ch_0.d("P", (long)-6312829425212598179L, (long)l10), (long)-6306895122685479988L, (long)l10));
            object2 = 0.0f;
            for (Object object3 = ch_0.c("o", (int)6373, (long)(0x55344E8BBF2C6352L ^ l10)); object3 <= ch_0.c("o", (int)12520, (long)(0x4134D82E362D4B59L ^ l10)); object3 = (Object)((char)(object3 + true))) {
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l4;
                objectArray4[0] = ch_0.d("\u00f4", (char)object3, (long)-6306771806044616524L, (long)l10);
                object = ch_0.d("\u00f4", (float)object2, (float)ch_0.d("Y", (Object)callSite5, (Object)objectArray4, (long)-6312595173732298606L, (long)l10), (long)-6313900024702660946L, (long)l10);
                if (callSite6 == null) {
                    object2 = object;
                    if (callSite6 == null) continue;
                }
                break block23;
            }
            object = object2 * 1.0f;
        }
        float f16 = object;
        float f17 = object2 * 0.65f;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = ":";
        reference var40_29 = ch_0.d("Y", (Object)callSite5, (Object)objectArray5, (long)-6312595173732298606L, (long)l10) * 1.0f + 1.6f;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l3;
        CallSite callSite8 = ch_0.d("Y", (Object)callSite5, (Object)objectArray6, (long)-6312524277754545635L, (long)l10);
        reference var42_31 = callSite8 * 0.65f;
        reference var43_32 = callSite8 * 1.0f;
        reference var44_33 = callSite8 * 0.65f;
        float f18 = f16 * 2.0f + var40_29 + f16 * 2.0f + 3.0f + f17 * 2.0f;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l4;
        objectArray7[0] = string;
        reference var46_35 = ch_0.d("Y", (Object)callSite5, (Object)objectArray7, (long)-6312595173732298606L, (long)l10) * 0.65f;
        CallSite callSite9 = ch_0.d("\u00f4", (float)f18, (float)var46_35, (long)-6313900024702660946L, (long)l10);
        float f19 = 7.5f;
        float f20 = 5.5f + f19 + 5.5f;
        float f21 = f20 + 0.5f + 5.5f;
        float f22 = f21 + callSite9 + 5.5f;
        float f23 = 3.0f + var42_31 + 1.0f + var43_32 + 1.0f + 4.0f + 3.0f;
        float f24 = this.e;
        float f25 = this.f;
        CallSite callSite10 = ch_0.d("Y", (Object)this, (Object)new Object[0], (long)-6313012764564623833L, (long)l10);
        Object[] objectArray8 = new Object[10];
        objectArray8[9] = l7;
        objectArray8[8] = Float.valueOf(4.0f);
        objectArray8[7] = 5;
        objectArray8[6] = Float.valueOf(f23);
        objectArray8[5] = Float.valueOf(f22);
        objectArray8[4] = Float.valueOf(f25);
        objectArray8[3] = Float.valueOf(f24);
        objectArray8[2] = matrix4f;
        objectArray8[1] = gK2;
        objectArray8[0] = aq_02;
        ch_0.d("\u00f4", (Object)objectArray8, (long)-6313225188682816227L, (long)l10);
        Object[] objectArray9 = new Object[10];
        objectArray9[9] = l9;
        objectArray9[8] = Float.valueOf(4.0f);
        objectArray9[7] = cn_0.r;
        objectArray9[6] = Float.valueOf(f23);
        objectArray9[5] = Float.valueOf(f22);
        objectArray9[4] = Float.valueOf(f25);
        objectArray9[3] = Float.valueOf(f24);
        objectArray9[2] = matrix4f;
        objectArray9[1] = gK2;
        objectArray9[0] = aq_02;
        ch_0.d("\u00f4", (Object)objectArray9, (long)-6313432392979024614L, (long)l10);
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l6;
        CallSite callSite11 = ch_0.d("\u00f4", (Object)objectArray10, (long)-6306947224051564535L, (long)l10);
        try {
            f15 = callSite10 != false ? f24 + f22 - 5.5f - f19 : f24 + 5.5f;
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
        float f26 = f15;
        try {
            f14 = callSite10 != false ? f24 + f22 - f20 - 0.5f : f24 + f20;
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
        float f27 = f14;
        Object[] objectArray11 = new Object[10];
        objectArray11[9] = l2;
        objectArray11[8] = callSite11;
        objectArray11[7] = Float.valueOf(f19);
        objectArray11[6] = Float.valueOf(f19);
        objectArray11[5] = Float.valueOf(f25 + f23 / 2.0f - f19 / 2.0f);
        objectArray11[4] = Float.valueOf(f26);
        objectArray11[3] = this.a;
        objectArray11[2] = matrix4f;
        objectArray11[1] = gK2;
        objectArray11[0] = aq_02;
        ch_0.d("\u00f4", (Object)objectArray11, (long)-6313197723035457171L, (long)l10);
        Object[] objectArray12 = new Object[7];
        objectArray12[6] = l5;
        objectArray12[5] = cn_0.v;
        objectArray12[4] = Float.valueOf(f25 + f23 - 3.0f);
        objectArray12[3] = Float.valueOf(f27 + 0.5f);
        objectArray12[2] = Float.valueOf(f25 + 3.0f);
        objectArray12[1] = Float.valueOf(f27);
        objectArray12[0] = matrix4f;
        ch_0.d("\u00f4", (Object)objectArray12, (long)-6306224007836308601L, (long)l10);
        float f28 = f25 + 3.0f;
        try {
            f13 = callSite10 != false ? f24 + f22 - f21 - var46_35 : f24 + f21;
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
        float f29 = f13;
        Object[] objectArray13 = new Object[7];
        objectArray13[6] = l;
        objectArray13[5] = callSite11;
        objectArray13[4] = Float.valueOf(0.65f);
        objectArray13[3] = Float.valueOf(f28);
        objectArray13[2] = Float.valueOf(f29);
        objectArray13[1] = string;
        objectArray13[0] = matrix4f;
        ch_0.d("Y", (Object)callSite5, (Object)objectArray13, (long)-6313995010064038514L, (long)l10);
        float f30 = f28 + var42_31 + 1.0f;
        float f31 = f30 + (var43_32 - var44_33) - 0.5f;
        try {
            f12 = callSite10 != false ? f24 + f22 - f21 - f18 : f24 + f21;
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
        float f32 = f12;
        float f33 = (float)(ch_0.d("\u00f4", (long)-6313950976030187904L, (long)l10) % H) / 1000.0f;
        float f34 = 0.5f + 0.5f * (float)ch_0.d("\u00f4", (double)(f33 * ((float)Math.PI * 2)), (long)-6312947330798912812L, (long)l10);
        Color color = new Color((int)ch_0.c("o", (int)31669, (long)(0x3B28578E5D588003L ^ l10)), (int)ch_0.c("o", (int)7783, (long)(0x1310DB53953DE5D7L ^ l10)), (int)ch_0.c("o", (int)7783, (long)(0x1310DB53953DE5D7L ^ l10)), (int)(ch_0.c("o", (int)7626, (long)(0x3A92499BADFFE67FL ^ l10)) + (int)(170.0f * f34)));
        float f35 = f32;
        Object[] objectArray14 = new Object[9];
        objectArray14[8] = l8;
        objectArray14[7] = cn_0.s;
        objectArray14[6] = Float.valueOf(1.0f);
        objectArray14[5] = Float.valueOf(f30);
        objectArray14[4] = Float.valueOf(f16 * 2.0f);
        objectArray14[3] = Float.valueOf(f35);
        objectArray14[2] = callSite3;
        objectArray14[1] = matrix4f;
        objectArray14[0] = callSite5;
        ch_0.d("\u00f4", (Object)objectArray14, (long)-6307164146996174313L, (long)l10);
        f35 += f16 * 2.0f;
        Object[] objectArray15 = new Object[9];
        objectArray15[8] = l8;
        objectArray15[7] = color;
        objectArray15[6] = Float.valueOf(1.0f);
        objectArray15[5] = Float.valueOf(f30);
        objectArray15[4] = Float.valueOf((float)var40_29);
        objectArray15[3] = Float.valueOf(f35);
        objectArray15[2] = ":";
        objectArray15[1] = matrix4f;
        objectArray15[0] = callSite5;
        ch_0.d("\u00f4", (Object)objectArray15, (long)-6307164146996174313L, (long)l10);
        f35 += var40_29;
        Object[] objectArray16 = new Object[9];
        objectArray16[8] = l8;
        objectArray16[7] = cn_0.s;
        objectArray16[6] = Float.valueOf(1.0f);
        objectArray16[5] = Float.valueOf(f30);
        objectArray16[4] = Float.valueOf(f16 * 2.0f);
        objectArray16[3] = Float.valueOf(f35);
        objectArray16[2] = callSite2;
        objectArray16[1] = matrix4f;
        objectArray16[0] = callSite5;
        ch_0.d("\u00f4", (Object)objectArray16, (long)-6307164146996174313L, (long)l10);
        f35 += f16 * 2.0f + 3.0f;
        Object[] objectArray17 = new Object[9];
        objectArray17[8] = l8;
        objectArray17[7] = cn_0.u;
        objectArray17[6] = Float.valueOf(0.65f);
        objectArray17[5] = Float.valueOf(f31);
        objectArray17[4] = Float.valueOf(f17 * 2.0f);
        objectArray17[3] = Float.valueOf(f35);
        objectArray17[2] = callSite;
        objectArray17[1] = matrix4f;
        objectArray17[0] = callSite5;
        ch_0.d("\u00f4", (Object)objectArray17, (long)-6307164146996174313L, (long)l10);
        float f36 = f11 = f30 + var43_32 + 1.0f;
        float f37 = f11 + 1.5f;
        try {
            f10 = callSite10 != false ? f24 + 5.5f : f24 + f21;
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
        float f38 = f10;
        try {
            f = callSite10 != false ? f24 + f22 - f21 : f24 + f22 - 5.5f;
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
        float f39 = f;
        Object[] objectArray18 = new Object[7];
        objectArray18[6] = l5;
        objectArray18[5] = cn_0.v;
        objectArray18[4] = Float.valueOf(f37);
        objectArray18[3] = Float.valueOf(f39);
        objectArray18[2] = Float.valueOf(f36);
        objectArray18[1] = Float.valueOf(f38);
        objectArray18[0] = matrix4f;
        ch_0.d("\u00f4", (Object)objectArray18, (long)-6306224007836308601L, (long)l10);
        float f40 = ((float)ch_0.d("Y", (Object)callSite4, (long)-6306525377816550969L, (long)l10) + (float)ch_0.d("Y", (Object)callSite4, (long)-6312335949427533349L, (long)l10) / 1.0E9f) / 60.0f;
        float f41 = (float)(ch_0.d("\u00f4", (double)((double)ch_0.d("\u00f4", (long)-6313950976030187904L, (long)l10) * 0.0031415926535897933), (long)-6312947330798912812L, (long)l10) * 0.5 + 0.5);
        Color color2 = new Color((int)ch_0.d("Y", (Object)callSite11, (long)-6306287333673425360L, (long)l10), (int)ch_0.d("Y", (Object)callSite11, (long)-6306310706318759736L, (long)l10), (int)ch_0.d("Y", (Object)callSite11, (long)-6313294621855178621L, (long)l10), (int)(ch_0.c("o", (int)3823, (long)(0xBCE18E51125755BL ^ l10)) + (int)(70.0f * f41)));
        try {
            Object[] objectArray19 = new Object[7];
            objectArray19[6] = l5;
            objectArray19[5] = color2;
            objectArray19[4] = Float.valueOf(f37);
            objectArray19[3] = Float.valueOf(f38 + (f39 - f38) * f40);
            objectArray19[2] = Float.valueOf(f36);
            objectArray19[1] = Float.valueOf(f38);
            objectArray19[0] = matrix4f;
            ch_0.d("\u00f4", (Object)objectArray19, (long)-6306224007836308601L, (long)l10);
            Object[] objectArray20 = new Object[2];
            objectArray20[1] = Float.valueOf(f23);
            objectArray20[0] = Float.valueOf(f22);
            ch_0.d("Y", (Object)this, (Object)objectArray20, (long)-6307057565463965020L, (long)l10);
            if (ch_0.d("\u00f4", (long)-6311947142250144823L, (long)l10) != null) {
                ch_0.d("\u00f4", (Object)new String[5], (long)-6313820457207753824L, (long)l10);
            }
        }
        catch (MatchException matchException) {
            throw ch_0.d("\u00f4", (Object)matchException, (long)-6312709847790591998L, (long)l10);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ch" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ch" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ch_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C8;
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
                throw new RuntimeException("dev/zprestige/prestige/ch", exception);
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
            ch_0.x[n2] = ch_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(3.0f);
        objectArray2[0] = Float.valueOf(85.0f);
        ch_0.d("Y", (Object)this, (Object)objectArray2, (long)-3383489295024588859L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = ch_0.i(l, l2);
        Object object = I[n];
        if (object instanceof String) {
            String string = J[n];
            int n2 = string.indexOf(8);
            Class clazz = ch_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ch_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ch_0.e(clazz3, string2, clazz2)) != null) {
                    ch_0.I[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ch_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ch_0.I[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ch_0.j(3543650394070308L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ch_0.i(l, l2);
            object = I[n];
            try {
                if (!(object instanceof String)) break block2;
                ch_0.I[n] = clazz = Class.forName(J[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void r(Object[] objectArray) {
        cA cA2 = (cA)objectArray[0];
        Matrix4f matrix4f = (Matrix4f)objectArray[1];
        String string = (String)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        Color color = (Color)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = l = v ^ l;
        long l3 = l2 ^ 0x1310383B3317L;
        long l4 = l2 ^ 0x1592C3D84430L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = string;
        reference var15_12 = ch_0.d("Y", (Object)cA2, (Object)objectArray2, (long)3033005388830266080L, (long)l) * f12;
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = l4;
        objectArray3[5] = color;
        objectArray3[4] = Float.valueOf(f12);
        objectArray3[3] = Float.valueOf(f11);
        objectArray3[2] = Float.valueOf(f + (f10 - var15_12) / 2.0f);
        objectArray3[1] = string;
        objectArray3[0] = matrix4f;
        ch_0.d("Y", (Object)cA2, (Object)objectArray3, (long)3031591652349102076L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ch_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ch_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ch_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3966
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aV;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bP;
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
import net.minecraft.class_1309;
import net.minecraft.class_3966;
import org.joml.Matrix4f;

public class b7
extends b4 {
    private long a;
    private float g;
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

    public b7(long l) {
        long l2 = (l = v ^ l) ^ 0x52402D8149F1L;
        super((String)((Object)b7.a("v", (int)32532, (long)(0x3E588D80B0F5E875L ^ l))), (String)((Object)b7.a("v", (int)17357, (long)(0x7496E1CDA4C254ADL ^ l))), l2);
        this.a = H;
        this.g = 0.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        b7.v = hc.a(-2452385177278088075L, 7340016257738695309L, MethodHandles.lookup().lookupClass()).a(263442549965950L);
                        b7.I = new Object[56];
                        b7.J = new String[56];
                        b7.b();
                        b7.y = new HashMap<K, V>(13);
                        var16 = b7.v ^ 37773065236924L;
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
                        var25_3 = new String[2];
                        var23_4 = 0;
                        var22_5 = "\u009bv\u00a4T\u0086\u00f5\u00ea\u00e7\u0082\u00f4m\u00a7 H\u00fe.d/\u00c3\u0080V\u00b2t\u00ef-\u0010r\u008f\u00b3\u00df\u00fd\u00af\u0090\u00abF\u00e8\u00cf\u00cd\u0084\u00c2\u00f8\u0084-:\u00cc\u00b9 \u00e5\u00d2\u00d1\u0099\u00a2$\u00cf\f\u00abY\u00ad\u00a0B\u00e9y\u00e8E\u0018\u0098\u0085\u0094),JnJ\u00c5\u00c0\u00cd t$.e\u00e7~\u00b6T\u0081\u009c\u00f4\u008e";
                        var24_6 = "\u009bv\u00a4T\u0086\u00f5\u00ea\u00e7\u0082\u00f4m\u00a7 H\u00fe.d/\u00c3\u0080V\u00b2t\u00ef-\u0010r\u008f\u00b3\u00df\u00fd\u00af\u0090\u00abF\u00e8\u00cf\u00cd\u0084\u00c2\u00f8\u0084-:\u00cc\u00b9 \u00e5\u00d2\u00d1\u0099\u00a2$\u00cf\f\u00abY\u00ad\u00a0B\u00e9y\u00e8E\u0018\u0098\u0085\u0094),JnJ\u00c5\u00c0\u00cd t$.e\u00e7~\u00b6T\u0081\u009c\u00f4\u008e".length();
                        var21_7 = 64;
                        var20_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var25_3[var23_4++] = b7.b(var26_9).intern();
                            if ((var20_8 += var21_7) < var24_6) {
                                var21_7 = var22_5.charAt(var20_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                        v3 = ++var20_8;
                        var26_9 = var18_1.doFinal(var22_5.substring(v3, v3 + var21_7).getBytes("ISO-8859-1"));
                        ** while (true)
                    }
                    b7.w = var25_3;
                    b7.x = new String[2];
                    b7.D = new HashMap<K, V>(13);
                    var5_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v4 = SecretKeyFactory.getInstance("DES");
                    v5 = new byte[8];
                    v6 = v5;
                    v5[0] = (byte)(var16 >>> 56);
                    for (var6_11 = 1; var6_11 < 8; ++var6_11) {
                        v6 = v6;
                        v6[var6_11] = (byte)(var16 << var6_11 * 8 >>> 56);
                    }
                    var5_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                    var11_12 = new long[6];
                    var8_13 = 0;
                    var9_14 = "\u00e1SFc\r\u00dd\u0010Ctkw.\u00aaE^|\u00a1\u00f4n\u00d7\u0088\u00c9\u00d8\u00e5\n\u00cf6\u00ffe\u0095\u00e5\u00f1";
                    var10_15 = "\u00e1SFc\r\u00dd\u0010Ctkw.\u00aaE^|\u00a1\u00f4n\u00d7\u0088\u00c9\u00d8\u00e5\n\u00cf6\u00ffe\u0095\u00e5\u00f1".length();
                    var7_16 = 0;
                    while (true) {
                        var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                        v7 = var11_12;
                        v8 = var8_13++;
                        v9 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                        v10 = -1;
                        break block15;
                        break;
                    }
lbl85:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var7_16 < var10_15) ** continue;
                        var9_14 = "\u00c3\u0016b'\u00cd\u008b\u0010\u00d9\u0015\u0013\u001a\u00db^\u00a4}\u0005";
                        var10_15 = "\u00c3\u0016b'\u00cd\u008b\u0010\u00d9\u0015\u0013\u001a\u00db^\u00a4}\u0005".length();
                        var7_16 = 0;
                        while (true) {
                            var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                            v7 = var11_12;
                            v8 = var8_13++;
                            v9 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                            v10 = 0;
                            break block15;
                            break;
                        }
                        break;
                    }
lbl104:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var7_16 < var10_15) ** continue;
                        break block16;
                        break;
                    }
                }
                var13_18 = v9;
                var15_19 = var5_10.doFinal(new byte[]{(byte)(var13_18 >>> 56), (byte)(var13_18 >>> 48), (byte)(var13_18 >>> 40), (byte)(var13_18 >>> 32), (byte)(var13_18 >>> 24), (byte)(var13_18 >>> 16), (byte)(var13_18 >>> 8), (byte)var13_18});
                v11 = ((long)var15_19[0] & 255L) << 56 | ((long)var15_19[1] & 255L) << 48 | ((long)var15_19[2] & 255L) << 40 | ((long)var15_19[3] & 255L) << 32 | ((long)var15_19[4] & 255L) << 24 | ((long)var15_19[5] & 255L) << 16 | ((long)var15_19[6] & 255L) << 8 | (long)var15_19[7] & 255L;
                switch (v10) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl117:
                    // 1 sources

                    ** continue;
                }
            }
            b7.B = var11_12;
            b7.C = new Integer[6];
            var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v12 = SecretKeyFactory.getInstance("DES");
            v13 = new byte[8];
            v14 = v13;
            v13[0] = (byte)(var16 >>> 56);
            for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                v14 = v14;
                v14[var1_21] = (byte)(var16 << var1_21 * 8 >>> 56);
            }
            break block17;
lbl137:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
        var2_22 = -6953426444111249178L;
        var4_23 = var0_20.doFinal(new byte[]{(byte)(var2_22 >>> 56), (byte)(var2_22 >>> 48), (byte)(var2_22 >>> 40), (byte)(var2_22 >>> 32), (byte)(var2_22 >>> 24), (byte)(var2_22 >>> 16), (byte)(var2_22 >>> 8), (byte)var2_22});
        ** while (true)
        b7.H = ((long)var4_23[0] & 255L) << 56 | ((long)var4_23[1] & 255L) << 48 | ((long)var4_23[2] & 255L) << 40 | ((long)var4_23[3] & 255L) << 32 | ((long)var4_23[4] & 255L) << 24 | ((long)var4_23[5] & 255L) << 16 | ((long)var4_23[6] & 255L) << 8 | (long)var4_23[7] & 255L;
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
            case 0 -> 41;
            case 1 -> 9;
            case 2 -> 1;
            case 3 -> 17;
            case 4 -> 34;
            case 5 -> 58;
            case 6 -> 4;
            case 7 -> 20;
            case 8 -> 16;
            case 9 -> 63;
            case 10 -> 44;
            case 11 -> 59;
            case 12 -> 46;
            case 13 -> 51;
            case 14 -> 5;
            case 15 -> 33;
            case 16 -> 54;
            case 17 -> 55;
            case 18 -> 37;
            case 19 -> 50;
            case 20 -> 61;
            case 21 -> 21;
            case 22 -> 57;
            case 23 -> 53;
            case 24 -> 10;
            case 25 -> 12;
            case 26 -> 48;
            case 27 -> 47;
            case 28 -> 22;
            case 29 -> 31;
            case 30 -> 49;
            case 31 -> 24;
            case 32 -> 3;
            case 33 -> 8;
            case 34 -> 42;
            case 35 -> 0;
            case 36 -> 45;
            case 37 -> 35;
            case 38 -> 15;
            case 39 -> 62;
            case 40 -> 36;
            case 41 -> 38;
            case 42 -> 18;
            case 43 -> 6;
            case 44 -> 7;
            case 45 -> 19;
            case 46 -> 25;
            case 47 -> 60;
            case 48 -> 23;
            case 49 -> 29;
            case 50 -> 28;
            case 51 -> 13;
            case 52 -> 27;
            case 53 -> 2;
            case 54 -> 26;
            case 55 -> 56;
            case 56 -> 11;
            case 57 -> 14;
            case 58 -> 32;
            case 59 -> 43;
            case 60 -> 30;
            case 61 -> 40;
            case 62 -> 39;
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
        b7.J[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = I;
        I[0] = "lT\u0016t9azT\u0013.*vm\u001f\u0010(&b|X\u0007?mp@";
        objectArray[1] = "O`-~\"S:@&q3\u001c[N-z7F/";
        objectArray[2] = Void.TYPE;
        b7.J[2] = "java/lang/Void";
        objectArray[3] = "\b\u0010\r]11\u0015\u0005U\u007fp<\r\u0003";
        objectArray[4] = Integer.TYPE;
        b7.J[4] = "java/lang/Integer";
        objectArray[5] = "r/s\u0014\u0018Nr/dH\u0014AhddV\u0014To\u00154\u000bE";
        objectArray[6] = "}\b!4hl}\b6hdcgC6vdv`2d*14";
        objectArray[7] = "w\u000fCkWau\u0011\n\b\\zj\u0014\\q[";
        objectArray[8] = Float.TYPE;
        b7.J[8] = "java/lang/Float";
        objectArray[9] = "a]6Ac?\u0014}=Nrpie.I{9\u0001";
        objectArray[10] = "\u0018o0o$Z\u0018o'3(U\u0002$'-(@\u0005Uvrp";
        objectArray[11] = "i>cQGw\u007f>f\u000bT`hue\rXty2r\u001a\u0013e9";
        objectArray[12] = "<\u00062\nW|I&9\u0005F3((2\u000eBi\\";
        objectArray[13] = "\u00192\u00112&D\u000f2\u0014h5S\u0018y\u0017n9G\t>\u0000yrU8";
        objectArray[14] = "hVZl\f0\u001dvQc\u001d\u007f|xZh\u0019%\b";
        objectArray[15] = "~C,n\u0000ehC)4\u0013r\u007f\b*2\u001ffnO=%TqX";
        objectArray[16] = "\u0011\u001fl)o!d?g&~n\u00051l-z4q";
        objectArray[17] = "B/p\u0000\u0011,T/uZ\u0002;Cdv\\\u000e/R#aKE>\u0011";
        objectArray[18] = "=\u001d\u00063\\&6\u0012\u0017|?+#\u001f\u0018\u0017\n)2\f\u0004;\u001d$";
        objectArray[19] = "%\u0015&%\u0005d%\u00151y\tk?^1g\t~8/c8X4";
        objectArray[20] = ".KX\u001dj\u000e.KOAf\u00014\u0000O_f\u00143q\u001f\n1Q";
        objectArray[21] = "W\u0006@\u0014jqW\u0006WHf~MMWVfkJ<\u0005\b>/";
        objectArray[22] = "tx9dzI\u0001X2kk\u0006`V9`o\\\u0014";
        objectArray[23] = "8\u000bTI\u0016o3\u0004E\u0006ub&\u0002";
        objectArray[24] = Double.TYPE;
        b7.J[24] = "java/lang/Double";
        objectArray[25] = "38DE HF\u0018OJ1\u0007'\u0016DA5]S";
        objectArray[26] = "G(z\u0016n\\L'kY\u0013I^=i\u001a";
        objectArray[27] = Long.TYPE;
        b7.J[27] = "java/lang/Long";
        objectArray[28] = "d5]CEv\u0011\u0015VLT9p\u001b]GPc\u0004";
        objectArray[29] = "G2B@nhL=S\u000f\u000ffG6WU";
        objectArray[30] = "\u0003Z\u0011v\u00010RZYpyaT\u001b.v\u0014c_g[|\u001b>I\u001f\u0011uA39";
        objectArray[31] = "\u0004_\u0005\u007f\u0002 \u0000\u0006\u0018ez)U\u001a\u001d\u007f\u0016\u001b\u0002\\C(AL\u0004\u001f\u0010#\u0013+V\u0002\u0006\u007fz";
        objectArray[32] = "<m\b\u001cB10<\tG3:9nq\u0011Ko`6\n^A\"0W";
        objectArray[33] = "Dn('{lCwhNt\u0000\u0019w.2xp\u0018s2q\u001e";
        objectArray[34] = "\u000bO7z\u0007:\u000f\u0016*`\u007f8V\u001b+q(o\bHr\u001d@6PLw|BiOH";
        objectArray[35] = "H\u001dE\u0004\u000e\u0014\u0019\u001d\r\u0002vE\u001f\\o\u0013\u001a*HPWN\u0006R\u0002Y\rCv";
        objectArray[36] = "fP\u0013tx\baIS\u001dtdgAUz!^n[\u0006b\u001d]`]\u0003 q\ni@\u000e\u001d";
        objectArray[37] = "\u000ei\u0016Kx>\u00028\u0017\u0010\t5\u000bioFq`R2\u0014\t{-\u0002S";
        objectArray[38] = "Ih}RTv\u0004ot\u00197fy2g\u001aP;C;}IH\u0007@5{L\nk\u0017<fA7";
        objectArray[39] = "&QAl$\u0013f\u0013M7\u0015\u0010\u0017\b^ir@-\u0001D:j|-WM)mB|W\u0005/\u0015";
        objectArray[40] = "f\u001e=]*\u00064\u0003+\u0001C\u00047\u001b0\u0001/6f[`XC[*\u0005`\u0016;\u0011#_mf";
        objectArray[41] = "\fDdYEiUH7[7meVe\u001fP<__\u007fLH\u0000\\QyI\nl\u000bXdD7";
        objectArray[42] = "Uc{&M{F2 =?c>6y#Q7]cv&\u0001\nU8e4\u0002i\u00007`d?";
        objectArray[43] = "l89m!\u001fm8|i\u0019HajanN\u0018:<8\u0002#Vb7uzi_8:";
        objectArray[44] = " d>XX>,5?\u0003)5%fGUQ`|?<\u001a[-,^";
        objectArray[45] = "9g{{{\u0011kzm'\u0012\u0013hbv'~!9#.z\u0012Lu|&0j\u0006|&+@";
        objectArray[46] = "OC\u0012>e\f\u0012DIx\f\fN@O#`>\u001a\u0003\u0010t6iNYV<k\u0002\u001b^J{\f";
        objectArray[47] = "|5\u0003S\r\u001c12\n\u0018n\u0004Lo\u0019\u001b\tQvf\u0003H\u0011muh\u0005MS\u0001\"a\u0018@n";
        objectArray[48] = "\u001dNb5R1M\u001a:5o.\u000bP&\u000b\u0000+O\u0013:6\u001e+\rFZd\u0011hKJgz\u0011*\u001e*";
        objectArray[49] = "\u001ebf5\u0011sOb.3i\"I#\\+\u0014 $ef-Y=\\/owTM";
        objectArray[50] = "W=f&te\u0017\u007fj}E`fdy#\"6\\mcp:\n[~*x$q\u0014tg(E";
        objectArray[51] = "ZJ3\\Y\f\n\u001ek\\d\u0013TH\u000b\r\u001aU\fN6\u0013\u001a\u0017Y.d\u001cYQU\u0013z\u001c\u001b\u00045";
        objectArray[52] = "; \u000eiY\rk/\u00055#\r'1\u000e=E\u001a\u0006*\u0011=f\u0007>/\u0015+#\u0007$+\u0019kC\u0000= \u0014P";
        objectArray[53] = "\r!xJ\u0001a]u J<`\u0003#@NLgR58\u0004E=_Ez\u0004^5\u0012=0\r\u00048b\u007f0\u0016\fu\u001a59L\u0001\u0005";
        objectArray[54] = "mN\u0015\u00062]4BF\u0004@_\u0004\\\u0014@'\b>U\u000e\u0013?4=[\b\u0016}XjR\u0015\u001b@";
        Object[] objectArray2 = objectArray;
        objectArray[55] = "G\u0010pVK\u0016\u0017D(Vv\u0017A\u0004HU\u000eBI\u00153\u001a\u0004\u000f\u0019tu\u0010F\u0013I\u000f:\u001a\u000bC(I0X\u0017\u0013S\u0006:\u0015Gr";
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
            throw new RuntimeException("dev/zprestige/prestige/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b7.c(n, l);
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
            if (c == '\u00e0' || c == '\u00a4' || c == '\u00cd' || c == 'E') {
                field = b7.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b7.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = b7.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD2C;
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
                throw new RuntimeException("dev/zprestige/prestige/b7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b7.C[n2] = n3;
        }
        return C[n2];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = b7.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b7.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b7.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b7.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = b7.i(l, l2);
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
                clazz3 = b7.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b7.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b7.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        b7.I[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b7.j(2074849530198713L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b7.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b7.I[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b7.j(2074849530198713L, 0L);
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
        Object object;
        Object object2;
        Object object3;
        float f12;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        Matrix4f matrix4f;
        block17: {
            block15: {
                CallSite callSite;
                CallSite callSite2;
                block16: {
                    CallSite callSite3;
                    block14: {
                        aq_0 aq_02 = (aq_0)objectArray[0];
                        gK gK2 = (gK)objectArray[1];
                        matrix4f = (Matrix4f)objectArray[2];
                        l5 = (Long)objectArray[3];
                        long l6 = l5;
                        long l7 = l6 ^ 0x20DBFF63F348L;
                        l4 = l6 ^ 0x194A66AD9C40L;
                        l3 = l6 ^ 0x5784D74479BL;
                        l2 = l6 ^ 0x250161839BBFL;
                        l = l6 ^ 0x19DC53EF8FC2L;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = Float.valueOf(0.0f);
                        objectArray2[0] = Float.valueOf(0.0f);
                        b7.d("S", (Object)this, (Object)objectArray2, (long)-6305058277067239576L, (long)l5);
                        CallSite callSite4 = b7.d("\u00c7", (long)-6305587150241575985L, (long)l5);
                        float f13 = (float)b7.d("\u00c7", (double)((double)(b7.d("S", (Object)matrix4f, (long)-6305801070003566321L, (long)l5) * b7.d("S", (Object)matrix4f, (long)-6305801070003566321L, (long)l5) + b7.d("S", (Object)matrix4f, (long)-6305488382070290801L, (long)l5) * b7.d("S", (Object)matrix4f, (long)-6305488382070290801L, (long)l5) + b7.d("S", (Object)matrix4f, (long)-6305298072962863724L, (long)l5) * b7.d("S", (Object)matrix4f, (long)-6305298072962863724L, (long)l5))), (long)-6306616155735724919L, (long)l5);
                        Object[] objectArray3 = new Object[3];
                        objectArray3[2] = l7;
                        objectArray3[1] = Float.valueOf((float)b7.d("S", (Object)b7.d("S", (Object)b, (long)-6309099877581248476L, (long)l5), (long)-6305818903579324858L, (long)l5) / 2.0f / f13);
                        objectArray3[0] = Float.valueOf((float)b7.d("S", (Object)b7.d("S", (Object)b, (long)-6309099877581248476L, (long)l5), (long)-6306065821919417518L, (long)l5) / 2.0f / f13);
                        b7.d("S", (Object)this, (Object)objectArray3, (long)-6305728066213859590L, (long)l5);
                        callSite2 = callSite4;
                        f12 = (float)(b7.d("\u00c7", (long)-6306366042795487623L, (long)l5) - this.a) * 0.005f;
                        this.a = (long)b7.d("\u00c7", (long)-6306366042795487623L, (long)l5);
                        object3 = b7.d("\u00e0", (Object)b, (long)-6305346196418563350L, (long)l5);
                        try {
                            try {
                                callSite3 = object3;
                                if (callSite2 != null) break block14;
                                if (!(callSite3 instanceof class_3966)) break block15;
                            }
                            catch (MatchException matchException) {
                                throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
                            }
                            callSite3 = object3;
                        }
                        catch (MatchException matchException) {
                            throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
                        }
                    }
                    object2 = (class_3966)callSite3;
                    object3 = b7.d("S", (Object)object2, (long)-6305658753677924724L, (long)l5);
                    try {
                        try {
                            callSite = object3;
                            if (callSite2 != null) break block16;
                            if (!(callSite instanceof class_1309)) break block15;
                        }
                        catch (MatchException matchException) {
                            throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
                        }
                        callSite = object3;
                    }
                    catch (MatchException matchException) {
                        throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
                    }
                }
                class_1309 class_13092 = (class_1309)callSite;
                try {
                    object = b7.d("\u00e0", (Object)class_13092, (long)-6306016034876637254L, (long)l5);
                    if (callSite2 != null) break block17;
                    if (object <= 0) break block15;
                }
                catch (MatchException matchException) {
                    throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
                }
                object = 1;
                break block17;
            }
            object = 0;
        }
        int n = object;
        try {
            b7 b72 = this;
            f11 = this.g;
            f10 = n != 0 ? 1.0f : 0.0f;
        }
        catch (MatchException matchException) {
            throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
        }
        try {
            f = n != 0 ? f12 * 3.0f : f12;
        }
        catch (MatchException matchException) {
            throw b7.d("\u00c7", (Object)matchException, (long)-6305922768056513310L, (long)l5);
        }
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = l3;
        objectArray4[2] = Float.valueOf(f);
        objectArray4[1] = Float.valueOf(f10);
        objectArray4[0] = Float.valueOf(f11);
        b72.g = (float)b7.d("\u00c7", (Object)objectArray4, (long)-6306514011651205021L, (long)l5);
        float f14 = ((float)b7.d("\u00c7", (double)((double)b7.d("\u00c7", (long)-6306366042795487623L, (long)l5) * 0.003), (long)-6306534585087202165L, (long)l5) + 1.0f) * 0.5f;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l4;
        object2 = b7.d("\u00c7", (Object)objectArray5, (long)-6305179280384439574L, (long)l5);
        object3 = new Color((int)(b7.d("S", (Object)object2, (long)-6305431126234039109L, (long)l5) + (int)((float)(b7.c("o", (int)3037, (long)(0x5DB7A9AF1B70AE84L ^ l5)) - b7.d("S", (Object)object2, (long)-6305431126234039109L, (long)l5)) * this.g)), (int)(b7.d("S", (Object)object2, (long)-6309001127980668829L, (long)l5) + (int)((float)(b7.c("o", (int)27785, (long)(0x2E277D7B373749D7L ^ l5)) - b7.d("S", (Object)object2, (long)-6309001127980668829L, (long)l5)) * this.g)), (int)(b7.d("S", (Object)object2, (long)-6306677989370714872L, (long)l5) + (int)((float)(b7.c("o", (int)27785, (long)(0x2E277D7B373749D7L ^ l5)) - b7.d("S", (Object)object2, (long)-6306677989370714872L, (long)l5)) * this.g)));
        float f15 = this.e - 0.5f;
        float f16 = this.f - 0.5f;
        float f17 = 1.5f + f14 * 0.3f + this.g * 1.25f;
        CallSite callSite = b7.d("\u00c7", (int)b7.c("o", (int)27785, (long)(0x2E277D7B373749D7L ^ l5)), (int)(b7.c("o", (int)25171, (long)(0x19F751961BFCC708L ^ l5)) + (int)(65.0f * b7.d("\u00c7", (float)(f14 * 0.5f), (float)this.g, (long)-6306262993783593757L, (long)l5))), (long)-6306385412086293195L, (long)l5);
        Object[] objectArray6 = new Object[6];
        objectArray6[5] = l;
        objectArray6[4] = new Color(0, 0, 0, (int)b7.c("o", (int)23310, (long)(0x1D9229A257A77E51L ^ l5)));
        objectArray6[3] = Float.valueOf(0.9f);
        objectArray6[2] = Float.valueOf(f16);
        objectArray6[1] = Float.valueOf(f15);
        objectArray6[0] = matrix4f;
        b7.d("\u00c7", (Object)objectArray6, (long)-6306190984157549812L, (long)l5);
        Object[] objectArray7 = new Object[6];
        objectArray7[5] = l;
        objectArray7[4] = object3;
        objectArray7[3] = Float.valueOf(0.5f);
        objectArray7[2] = Float.valueOf(f16);
        objectArray7[1] = Float.valueOf(f15);
        objectArray7[0] = matrix4f;
        b7.d("\u00c7", (Object)objectArray7, (long)-6306190984157549812L, (long)l5);
        Object[] objectArray8 = new Object[6];
        objectArray8[5] = l2;
        objectArray8[4] = new Color(0, 0, 0, (int)b7.c("o", (int)17954, (long)(0x4BDB384F1988637AL ^ l5)));
        objectArray8[3] = Float.valueOf(f17 - 0.5f);
        objectArray8[2] = Float.valueOf(f16);
        objectArray8[1] = Float.valueOf(f15);
        objectArray8[0] = matrix4f;
        b7.d("\u00c7", (Object)objectArray8, (long)-6306153506315582506L, (long)l5);
        Object[] objectArray9 = new Object[6];
        objectArray9[5] = l2;
        objectArray9[4] = new Color(0, 0, 0, (int)b7.c("o", (int)14598, (long)(0x463AD2CDB8521C5CL ^ l5)));
        objectArray9[3] = Float.valueOf(f17 + 0.5f);
        objectArray9[2] = Float.valueOf(f16);
        objectArray9[1] = Float.valueOf(f15);
        objectArray9[0] = matrix4f;
        b7.d("\u00c7", (Object)objectArray9, (long)-6306153506315582506L, (long)l5);
        Object[] objectArray10 = new Object[6];
        objectArray10[5] = l2;
        objectArray10[4] = new Color((int)b7.d("S", (Object)object3, (long)-6305431126234039109L, (long)l5), (int)b7.d("S", (Object)object3, (long)-6309001127980668829L, (long)l5), (int)b7.d("S", (Object)object3, (long)-6306677989370714872L, (long)l5), (int)callSite);
        objectArray10[3] = Float.valueOf(f17);
        objectArray10[2] = Float.valueOf(f16);
        objectArray10[1] = Float.valueOf(f15);
        objectArray10[0] = matrix4f;
        b7.d("\u00c7", (Object)objectArray10, (long)-6306153506315582506L, (long)l5);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b7.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1583;
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
                throw new RuntimeException("dev/zprestige/prestige/b7", exception);
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
            b7.x[n2] = b7.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(aV aV2) {
        long l = v ^ 0x20251FB8B66FL;
        b7.d("S", (Object)aV2, (Object)new Object[0], (long)5452553246484123823L, (long)l);
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf((float)b7.d("S", (Object)b7.d("S", (Object)b, (long)-3378022025370250933L, (long)l), (long)-3381514103462463703L, (long)l) / 2.0f);
        objectArray2[0] = Float.valueOf((float)b7.d("S", (Object)b7.d("S", (Object)b, (long)-3378022025370250933L, (long)l), (long)-3381337725661507011L, (long)l) / 2.0f);
        b7.d("S", (Object)this, (Object)objectArray2, (long)-3381424382519814251L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = b7.i(l, l2);
        Object object = I[n];
        if (object instanceof String) {
            String string = J[n];
            int n2 = string.indexOf(8);
            Class clazz = b7.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b7.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b7.e(clazz3, string2, clazz2)) != null) {
                    b7.I[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b7.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b7.I[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b7.j(2074849530198713L, 0L);
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
            int n = b7.i(l, l2);
            object = I[n];
            try {
                if (!(object instanceof String)) break block2;
                b7.I[n] = clazz = Class.forName(J[n]);
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
            return MethodHandles.lookup().findStatic(b7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


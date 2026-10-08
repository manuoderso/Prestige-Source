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
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.gA;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;

public class b9
extends b4 {
    private static final float m = 1.5f;
    private static final float a = 8.0f;
    private static final float c = 7.5f;
    private static final float d = 70.0f;
    private final Map g;
    private bW h;
    private float k;
    private float l;
    private long i;
    private float o;
    private float p;
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

    public b9(long l) {
        long l2 = (l = v ^ l) ^ 0x70037234B4D3L;
        super((String)((Object)b9.a("e", (int)30719, (long)(0x5C2951E8737F27B7L ^ l))), (String)((Object)b9.a("e", (int)23939, (long)(0x42FC7017305F8DC8L ^ l))), l2);
        this.g = new HashMap();
        this.k = 70.0f;
        this.l = 0.0f;
        this.i = H;
        this.o = 0.0f;
        this.p = 0.0f;
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
                            b9.v = hc.a(-705662555657315487L, 7968307024577239105L, MethodHandles.lookup().lookupClass()).a(227222470498303L);
                            b9.I = new Object[115];
                            b9.J = new String[115];
                            b9.b();
                            b9.y = new HashMap<K, V>(13);
                            var16 = b9.v ^ 72815321312547L;
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
                            var22_5 = "\u0091\u0000+\u00d0\u00c5D\u00a9e\u00b8L\u0000\u008e\u0019\u0083\u00ce\u00b28\u0011\u00d8\u007f!\u00f3NB\u00d2\u00d3\"\u00941!\u0085\u00df\u00cf\u00ca\u00cd\u00e3\u00f2\u00a3\u00a3\u00e4\u00ff\fC\u008e\u00d24\u008d\u00cf\u008c\u009d\u00f0x:8DR\u00ee\u00a8\u00cf\u00b6`\u00c5\u00dexs\u00d1\u0006\u00c9A\u00bf\u00a2\u0098b hu\u00a1\u0082\u0094\u00c8AsA\u00bb\u00bfg\u00c1\u00day\u0086\u00e0\u0001\u00f4z\u0095\u00d3\u00fd=\u00b7\u00a5\u008fj&/\u0006\u00ea";
                            var24_6 = "\u0091\u0000+\u00d0\u00c5D\u00a9e\u00b8L\u0000\u008e\u0019\u0083\u00ce\u00b28\u0011\u00d8\u007f!\u00f3NB\u00d2\u00d3\"\u00941!\u0085\u00df\u00cf\u00ca\u00cd\u00e3\u00f2\u00a3\u00a3\u00e4\u00ff\fC\u008e\u00d24\u008d\u00cf\u008c\u009d\u00f0x:8DR\u00ee\u00a8\u00cf\u00b6`\u00c5\u00dexs\u00d1\u0006\u00c9A\u00bf\u00a2\u0098b hu\u00a1\u0082\u0094\u00c8AsA\u00bb\u00bfg\u00c1\u00day\u0086\u00e0\u0001\u00f4z\u0095\u00d3\u00fd=\u00b7\u00a5\u008fj&/\u0006\u00ea".length();
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
                                var25_3[var23_4++] = b9.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "{\u000fRP\u00de\u00c5[\u0085\u008a\u00c2\u00fd\u00e0TK\u00be\u0006PF\u00f6\u00bcup\u0080\b<B!\u00ca\u0087\u00fb\u00ee\u001b\u00a3\u00fb}%~T~YX\u00b3\u00ad\u00ae&\u00c4n\u0010\u00e7\u0011\u00d8\u00b1\u00a7\u0099\u001aV\u00deL\u008a\u00ab\u0093\u0095P\u0091M\u008e\u0099&\u00ff\u00d19X I\u0084\u00d0\u0089q\u0092\u009aq\u00d3;\u009do^nNW&\u00f9Y\u00b7;u\u00c5v\u0010b\u0084FVtB<";
                                var24_6 = "{\u000fRP\u00de\u00c5[\u0085\u008a\u00c2\u00fd\u00e0TK\u00be\u0006PF\u00f6\u00bcup\u0080\b<B!\u00ca\u0087\u00fb\u00ee\u001b\u00a3\u00fb}%~T~YX\u00b3\u00ad\u00ae&\u00c4n\u0010\u00e7\u0011\u00d8\u00b1\u00a7\u0099\u001aV\u00deL\u008a\u00ab\u0093\u0095P\u0091M\u008e\u0099&\u00ff\u00d19X I\u0084\u00d0\u0089q\u0092\u009aq\u00d3;\u009do^nNW&\u00f9Y\u00b7;u\u00c5v\u0010b\u0084FVtB<".length();
                                var21_7 = 72;
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
                                var25_3[var23_4++] = b9.b(var26_9).intern();
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
                    b9.w = var25_3;
                    b9.x = new String[5];
                    b9.D = new HashMap<K, V>(13);
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
                    var11_12 = new long[4];
                    var8_13 = 0;
                    var9_14 = "\u0087^\u001dt\u0011TN\u00e3\u009b\u00f9wJ\u00da\u0016\u0086\u00d4";
                    var10_15 = "\u0087^\u001dt\u0011TN\u00e3\u009b\u00f9wJ\u00da\u0016\u0086\u00d4".length();
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
                        var9_14 = "\u009aQ3;\n\u0012Tn\u00e2\u00da`\u0015A\u00ec~Z";
                        var10_15 = "\u009aQ3;\n\u0012Tn\u00e2\u00da`\u0015A\u00ec~Z".length();
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
            b9.B = var11_12;
            b9.C = new Integer[4];
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
        var2_22 = -2213137311720346289L;
        var4_23 = var0_20.doFinal(new byte[]{(byte)(var2_22 >>> 56), (byte)(var2_22 >>> 48), (byte)(var2_22 >>> 40), (byte)(var2_22 >>> 32), (byte)(var2_22 >>> 24), (byte)(var2_22 >>> 16), (byte)(var2_22 >>> 8), (byte)var2_22});
        ** while (true)
        b9.H = ((long)var4_23[0] & 255L) << 56 | ((long)var4_23[1] & 255L) << 48 | ((long)var4_23[2] & 255L) << 40 | ((long)var4_23[3] & 255L) << 32 | ((long)var4_23[4] & 255L) << 24 | ((long)var4_23[5] & 255L) << 16 | ((long)var4_23[6] & 255L) << 8 | (long)var4_23[7] & 255L;
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
            case 0 -> 27;
            case 1 -> 31;
            case 2 -> 49;
            case 3 -> 32;
            case 4 -> 23;
            case 5 -> 3;
            case 6 -> 33;
            case 7 -> 34;
            case 8 -> 16;
            case 9 -> 2;
            case 10 -> 24;
            case 11 -> 7;
            case 12 -> 25;
            case 13 -> 54;
            case 14 -> 9;
            case 15 -> 4;
            case 16 -> 11;
            case 17 -> 46;
            case 18 -> 30;
            case 19 -> 51;
            case 20 -> 58;
            case 21 -> 35;
            case 22 -> 61;
            case 23 -> 15;
            case 24 -> 5;
            case 25 -> 26;
            case 26 -> 48;
            case 27 -> 59;
            case 28 -> 21;
            case 29 -> 1;
            case 30 -> 40;
            case 31 -> 19;
            case 32 -> 12;
            case 33 -> 6;
            case 34 -> 43;
            case 35 -> 47;
            case 36 -> 56;
            case 37 -> 29;
            case 38 -> 53;
            case 39 -> 60;
            case 40 -> 44;
            case 41 -> 62;
            case 42 -> 8;
            case 43 -> 10;
            case 44 -> 28;
            case 45 -> 42;
            case 46 -> 38;
            case 47 -> 36;
            case 48 -> 41;
            case 49 -> 45;
            case 50 -> 63;
            case 51 -> 13;
            case 52 -> 20;
            case 53 -> 50;
            case 54 -> 14;
            case 55 -> 52;
            case 56 -> 0;
            case 57 -> 55;
            case 58 -> 37;
            case 59 -> 39;
            case 60 -> 18;
            case 61 -> 17;
            case 62 -> 22;
            default -> 57;
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
        b9.J[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = I;
        I[0] = "\u0012Q[\u0012j\u007f\u000fD\u00030+r\u0017B";
        objectArray[1] = Integer.TYPE;
        b9.J[1] = "java/lang/Integer";
        objectArray[2] = "_C\u0010\u0019hrIC\u0015C{e^\b\u0016EwqOO\u0001R<aWO\u0003Yf,kT\u0003Dfk\\C";
        objectArray[3] = "b\u000e\u001f4B|t\u000e\u001anQkcE\u0019h]\u007fr\u0002\u000e\u007f\u0016oL";
        objectArray[4] = "fz|jk}pzy0xjg1z6t~vvm!?o6";
        objectArray[5] = "Kob%}<>Oi*ls_Ab!h)+";
        objectArray[6] = Void.TYPE;
        b9.J[6] = "java/lang/Void";
        objectArray[7] = "y*05 ]g\"*zCIc";
        objectArray[8] = "xmD\u0014C?sbU[\"1xiQ\u0001";
        objectArray[9] = "`4S\b+6k;BGV.x<K\u000e";
        objectArray[10] = Character.TYPE;
        b9.J[10] = "java/lang/Character";
        objectArray[11] = ">]*\u00005\u0002>]=\\9\r$\u0016=B9\u0018#gm\u001fh";
        objectArray[12] = "8QG6\u0007b8QPj\u000bm\"\u001aPt\u000bx%k\u0007+]";
        objectArray[13] = "\u001bM\u000e-ba\u0010B\u001fb\u000fe\u0010^+)=x\u0014B\u001b)";
        objectArray[14] = Boolean.TYPE;
        b9.J[14] = "java/lang/Boolean";
        objectArray[15] = "[\u0012\u0007.ZXE\u001a\u001da=YT\u0001\u0010;\u001b_";
        objectArray[16] = "hj\u001cX8\u0002vb\u0006\u0017Z\u001eq\u007f";
        objectArray[17] = ")^a`&\n4K9d~\u000e-K9Jm\u0012\u0006Iro|";
        objectArray[18] = "\u0013s8\u000eDc\u0005s=TWt\u00128>R[`\u0003\u007f)E\u0010p4";
        objectArray[19] = "Tj\u000f(g%Bj\nrt2U!\ttx&Df\u001ec36q";
        objectArray[20] = "?uv\u0000'$JU}\u000f6k+[v\u000421_";
        objectArray[21] = "ijsw2'\u001cJxx#h}Dss'2\t";
        objectArray[22] = "\u000eYH\u00029\u0007\u0018YMX*\u0010\u000f\u0012N^&\u0004\u001eUYIm\u0013(";
        objectArray[23] = "\u001cT\f\b\bpit\u0007\u0007\u0019?\bz\f\f\u001de|";
        objectArray[24] = "D\rSC\u001cuR\rV\u0019\u000fbEFU\u001f\u0003vT\u0001B\bHaM";
        objectArray[25] = "0E]'\u0003CEeV(\u0012\f$k]#\u0016VP";
        objectArray[26] = "$B\u0015tJk2B\u0010.Y|%\t\u0013(Uh4N\u0004?\u001ey\u0017";
        objectArray[27] = "=zMi%N+zH36Y<1K5:M-v\\\"qZ\u000f";
        objectArray[28] = ".@\\LHY[`WCY\u0016:n\\H]LN";
        objectArray[29] = "*gr5wx<gwodo+,tih{:kc~#l%";
        objectArray[30] = "Y<neeT,\u001cejt\u001bM\u0012napA9";
        objectArray[31] = "Q'\u001b\u0002\tUG'\u001eX\u001aBPl\u001d^\u0016VA+\nI]AY";
        objectArray[32] = "\r\ns\u001f<Xx*x\u0010-\u0017\u0019$s\u001b)Mm";
        objectArray[33] = "*\u001b,e[W_;'jJ\u0018>5,aNBJ";
        objectArray[34] = "\u0014&-\r\u001c@\u001f)<BaU\r3>\u0001";
        objectArray[35] = Long.TYPE;
        b9.J[35] = "java/lang/Long";
        objectArray[36] = "x\\Y6T/n\\\\lG8y\u0017_jK,hPH}\u0000>T";
        objectArray[37] = "VFn~$N#feq5\u0001^~vv<H6";
        objectArray[38] = "<\u001e7<\u0014:*\u001e2f\u0007-=U1`\u000b9,\u0012&w@.\u0019";
        objectArray[39] = "|\u0003\u0011^=>\t#\u001aQ,qh-\u0011Z(+\u001c";
        objectArray[40] = "5b^^\u0013w#b[\u0004\u0000`4)X\u0002\ft%nO\u0015Gd?";
        objectArray[41] = "\bh\u0011s!u}H\u001a|0:\u001cF\u0011w4`h";
        objectArray[42] = Float.TYPE;
        b9.J[42] = "java/lang/Float";
        objectArray[43] = "]BU&Z}KBP|Ij\\\tSzE~MNDm\u000el|";
        objectArray[44] = "1^&\tz\u0013D~-\u0006k\\%p&\ro\u0006Q";
        objectArray[45] = "$Q\b[K~2Q\r\u0001Xi%\u001a\u000e\u0007T}4]\u0019\u0010\u001fi\u0001";
        objectArray[46] = "\\.j\\m5J.o\u0006~\"]el\u0000r6L\"{\u00179'\u0001";
        objectArray[47] = "L8\u001b(F\u0012G7\ng%\u001fR:\u0005\f\u0010\u001dC)\u0019 \u0007\u0010";
        objectArray[48] = "R\u0013\u0007LN@'3\fC_\u000fF=\u0007H[U2";
        objectArray[49] = "3H\r\u0018u\u00148G\u001cW\u001d\u00146H\u000f";
        objectArray[50] = "0\b|J\"2E(wE3}$&|N7'P";
        objectArray[51] = "\u0010\fw%_\"e,|*Nm\u0004\"w!J7p";
        objectArray[52] = "\fBE(\u0015@ybN'\u0004\u000f\u0018lE,\u0000Ul";
        objectArray[53] = "_\u000b\u0007#\u0018\u0001*+\f,\tNK%\u0007'\r\u0014?";
        objectArray[54] = "b1p=(dt1ug;sczva7gr=av|pb";
        objectArray[55] = "\u0011g\u00070]jdG\f?L%\u0005I\u00074H\u007fq";
        objectArray[56] = "\u0014Zx>\b\u0017azs1\u0019X\u0000tx:\u001d\u0002t";
        objectArray[57] = "%H^+\u0013LPhU$\u0002\u00031f^/\u0006YE";
        objectArray[58] = "J\u0010t\u0005\u0016\u0012A\u001feJu\u001fT\u0019";
        objectArray[59] = "R\ti`h\u0004')boyKF'id}\u00112";
        objectArray[60] = "F\te\fNVA\u000f`qD@T'e\u001cFK(\u0012$\fBSPT{I+";
        objectArray[61] = "X~$\u001eUI\u0013vq\u000f>\u001fa> \u0003\u0007\u0003\u001b`/IZ";
        objectArray[62] = "\u0018\u001f:ae.\\D;a\t5#\u0019`stm]\\9 01#\u001c>hf4Q\u00100~jT";
        objectArray[63] = "gV-\r\u0019O7_*\u0000yW'FWL\u0007\u0014>\n6\u001dA_::j\u000fBKj[;I\tOZ\u0007)J\u001d\u001f;Vo\u0001\u0019/";
        objectArray[64] = ")\u0002\u0013Xd1r\n\u0011\u0018\u0001)~\b\r\u000eF9\u0017SM\u001f83xRM^oW)\u0002\u0013Xd1r\n\u0011\u0018\u0001";
        objectArray[65] = "\u0019x\u000e\u000e\u0012IF;@V~CH)\u0018\u0000)\u0014\u0016yAlNV\u0018(\u001fQ\u0001D@>";
        objectArray[66] = "b\u0001':A\u00129\t%z$\u001f;\t8hE\u0012'ou<IO$\u001e\"{\u0015\u001f\\\u0006.kD\u0006;\u0003>|Mt";
        objectArray[67] = "0/\rTb9%=^Q\r80-\"D}$Y?\u000eCm*>:\u001eTdX";
        objectArray[68] = "J!\u000ea\u000fT\u001fe\u000e2k\u0010Am\u001e\n\u0011P]v\rrW\u000f\u0018\u001f";
        objectArray[69] = "w\u0011\rd\u000e\u0004#Z\u0002h1\rqT#n@>qX\u001c\u0003KYaA\u001e{\r\u0006$(^mRYyN\u0005eP\u0019\u001c";
        objectArray[70] = "Gb>`vj\fjkq\u001d;~t`2!2\u0012\"kq$";
        objectArray[71] = "B&=[TvO'cV&a.p9^[&P5`\r\u001fz.ugEI\u007f\\yiSE\u001f";
        objectArray[72] = "Z&%w#\u0013\u0001.'7F\u0014\u001f\u0005#4:\u0004d!,&&\u0007\u0003$<1/u";
        objectArray[73] = "@Q0Ic\u0019\u0004\n1I\u000f\u000f{Wj[rZ\u0005\u00123\b6\u0006{\u0007=[o\u0011\u001c\u0002-Lfc";
        objectArray[74] = "l*c\u0018DL?v8\t#\u0016\u0002w?\u0019^E|2fJ\u001a\u0019\u0002 c\t^\u0019y'e\f#";
        objectArray[75] = "$;S\u007fm37.Yx\fjK{\u0014(q:5>M{5fK#Fy}8t'I35\u0003";
        objectArray[76] = "]XB\u0015kx\u0019\u0003C\u0015\u0007kf^\u0018\u0007z;\u0018\u001bAT>gf[F\u001chb\u0014WH\nd\u0002";
        objectArray[77] = "T\u0007ge\"vD\u0000}k\u001c`5E%ea3K\u0000|6%o5\u0006#rutM@|7\u001c";
        objectArray[78] = "p\u0003\u000bq\u001cW`\u0004\u0011\u007f\"A\u0011F\u001ax\u0019Nw\u001d\u0012zY+";
        objectArray[79] = "\u0002I}\u0002tC\b\b?\u001d\u001d\u0012aO;\u0016`@\u001f\nbE$\u001caJe\rr\u0019\u0013Fk\u001b~y";
        objectArray[80] = "pXrU%8l\npVI\"\u0015]w\u00074pk\u0018.Tp,\u0015X)\u001c&)gT'\n*I";
        objectArray[81] = "9(3\u000b\u0007^}s2\u000bkO\u0002.i\u0019\u0016\u001d|k0JRA\u0002~>\u0019\u000bVe{.\u000e\u0002$";
        objectArray[82] = "@j%\u000fx\bLn<\tIX[i-\u0007/Ozr2\u0007\fRBw6\u0011ITL~*\u000byNAc-j";
        objectArray[83] = "\u000e\u0011\u0012w/b^\u0018\u0015zOm^\u0001/q\u0003o]\u0014\u0015o3\u0002\u000e\u0003So\u007fc_E\u0018kO?MF\f;.n\u000b\r\b\u000br|\b\u0019Xj#:C\u001dh";
        objectArray[84] = "\u000e{+2oeJ70 8\u0003R&&^{8J.>&=g\u000fG:e|jI?|:9\u0003M|=7\u007f{\u000b#x^";
        objectArray[85] = "w+,^,z,#.\u001eIw),5,5\u001c3~2\f7du!wev!5|+\nw!t+O";
        objectArray[86] = "u\u001ae\u00140\r1\u00112\u000f\r\t\r\u0000(Sv\\\u007f\u0001,Z0c";
        objectArray[87] = "us\u000eqZVhv\u001a{bU\u000frI+\u001f\bq7\u0010x[T\u000fw\u00170\rQ}{\u0019&\u00011";
        objectArray[88] = "$\u0010t`\u000e}#\u0016q\u001d\u0004k6+cqk|q\fgc\u0013:.I\u000e";
        objectArray[89] = "@#\u0007\u001fL0P$\u001d\u0011r%!1\u0012\u001f\u0012>F4\u0002\b\u001bL";
        objectArray[90] = "+\u0013NbNL\"Q\u0004$5AP\u0015\u0002tH\u0011.P['\fMPP\u000e JQ?]\\nX(";
        objectArray[91] = "mR\u001f 5Kv\u0000E.\u0005\\\u0010RE.x\tn\u0017\u001c}<U\u0010\u0005\u0019>xUk\u0002\u001f;\u0005";
        objectArray[92] = "\u0000*\fL\u001b\u0016\u0012$\u0016\u0010x\u0002\u0014D\u0010EF\u0017\u0007+\u001d\u0017\b\u0005~";
        objectArray[93] = "\u0003a]d\n\u0013\u0001jZ|p\u0017|\u007fM)\u000e\u001e\u0013`\u000bg@~\u0003|\u000eh\u0010\u0011\u001c:@&p";
        objectArray[94] = "\u001d]~W\u0011{\u000fSd\u000bro\n3 \u0001\u0011>\u0006U{\t\u0013~c";
        objectArray[95] = "\u001a lr\u0011%L+/ws v\"o$\u000ep\bg6wJ,vw=w\u001c;\u001fz<)\u0011I";
        objectArray[96] = "\u0014;1Y\u0015T\u0013=4$\u001fB\u0006\u0013/\\\u0010Fz pY\u0019Q\u0002f/\u001cp";
        objectArray[97] = "\n.\u0014\u000bC2\u0005-\u000b@#%\u00138\u0016\\d5z Z\u000f\\\"\u0015-\bAN[\n.\u0014\u000bC2\u0005-\u000b@#";
        objectArray[98] = "8]Q\u00030\u001a-O\u0002\u0006_\u001d<TD~b\u0005j@\b\u001f3C!D8";
        objectArray[99] = "=eB',\ffm@gI\u000enmN`)jy0\\u7\u0012?o\u0019\u001c";
        objectArray[100] = "tH\\tyDvC[l\u0003@\u000b\u0010\rl~\u0010uUT?:L\u000bS\u000b{jWs\u0015T>\u0003";
        objectArray[101] = "\u000e\u0006NzP}\u001c\bT&3j'hO9LiN\u0014_>Vgp";
        objectArray[102] = "h&92>\u0018e'g?L\u001a\u0004p=71Hz5ddu\u0014\u000451c3\bk8c-!q";
        objectArray[103] = "7TKLt\u0000b\u0010K\u001f\u0010V1\u00066\u001an\u00049ZWK(O=j_Mz_/\rZ]mV]";
        objectArray[104] = "#EW\u000fv\u00048\u0017\r\u0001F\u0016^E\r\u0001;F \u0000TR\u007f\u001a^B^\b}\u001a8\u0019V\n=\u007f";
        objectArray[105] = "w*\u0019\u000f)V)%SRYEM!VK2Hrt\u0012Ka,";
        objectArray[106] = "\u0012,\bC\r=\u001f-VN\u007f=~z\fF\u0002m\u0000?U\u0015F1~?\u0000\u0012\u0000-\u00112R\\\u0012T";
        objectArray[107] = "\u0015cZe*$B \u000b%nZAYY&{'\u0015'\u001c\u007f(cIY\\x`5L+Pvv9,";
        objectArray[108] = "Z\f\"^G\u000f]\n'#M\u0019H'<^OtNV%J\\\f\b\t`#";
        objectArray[109] = "|a1\u0015\u0010\ng3k\u001b \u001b\u0001ak\u001b]H\u007f$2H\u0019\u0014\u0001$gO_\bn)5\u0001Mq";
        objectArray[110] = "\u001bSk\u0001?\u0017N\u0017kR[I\r\u0000l\u0003'O\u000bm\u007f\u00132U\u001e\fj\u0001aPq";
        objectArray[111] = ")\u0001,\u0013\u0005~&\u00023Xey=\u0014:U;~=\u000e>)\u0019&g\f*F\u0014t)\u001eS";
        objectArray[112] = "Wmr6 \u0014\u0002)reDDP/\u000f'\u007fVT-wa \u0013=nqf \u001b\\?7-$+";
        objectArray[113] = "\u0012@+RhY\u001fAu_\u001aO~\u0016/Wg\t\u0000Sv\u0004#U~\u0013qLuP\f\u001f\u007fZy0";
        Object[] objectArray2 = objectArray;
        objectArray[114] = "\u0012G\bqm@V\u000b\u0013c:&N\u0012\u0013\u001d\u007f\u0017\u0015\u0004\u001arrE[\u0016ca2\u0018T\u0002\fl`VF{\u001f,=YR\u0014\u0012~sK+";
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
            throw new RuntimeException("dev/zprestige/prestige/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b9.c(n, l);
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
            if (c == 'L' || c == '\u00b5' || c == 'R' || c == '\u00c3') {
                field = b9.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b9.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = b9.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x126F;
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
                throw new RuntimeException("dev/zprestige/prestige/b9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b9.C[n2] = n3;
        }
        return C[n2];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = b9.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b9.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b9.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b9.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = b9.i(l, l2);
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
                clazz3 = b9.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b9.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b9.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        b9.I[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b9.j(595535509964789L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b9.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b9.I[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b9.j(595535509964789L, 0L);
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

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Object[] objectArray) {
        float f;
        float f10;
        CallSite callSite;
        float f11;
        CallSite callSite2;
        CallSite callSite3;
        ArrayList arrayList;
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
        Matrix4f matrix4f;
        gK gK2;
        aq_0 aq_02;
        block93: {
            float f12;
            reference var42_25;
            block92: {
                float f13;
                block91: {
                    void var61_60;
                    CallSite callSite7;
                    float f14;
                    float f15;
                    float f16;
                    reference var56_50;
                    CallSite callSite8;
                    long l9;
                    long l10;
                    long l11;
                    block98: {
                        void var61_58;
                        float f17;
                        float f18;
                        reference var47_34;
                        long l12;
                        block90: {
                            block85: {
                                block86: {
                                    Object object;
                                    block89: {
                                        block87: {
                                            block88: {
                                                block84: {
                                                    long l13;
                                                    long l14;
                                                    long l15;
                                                    long l16;
                                                    block74: {
                                                        long l17;
                                                        block73: {
                                                            aq_02 = (aq_0)objectArray[0];
                                                            gK2 = (gK)objectArray[1];
                                                            matrix4f = (Matrix4f)objectArray[2];
                                                            l8 = (Long)objectArray[3];
                                                            long l18 = l8;
                                                            l16 = l18 ^ 0x42F359CFEEA4L;
                                                            l12 = l18 ^ 0x194A66AD9C40L;
                                                            l7 = l18 ^ 0x56B4B80BF914L;
                                                            l6 = l18 ^ 0x29CA0C560F0CL;
                                                            l15 = l18 ^ 0x31240AA31D80L;
                                                            l17 = l18 ^ 0x33F5EE405241L;
                                                            l5 = l18 ^ 0x7876565874AFL;
                                                            l11 = l18 ^ 0x51117395139CL;
                                                            l4 = l18 ^ 0x5D6649FEB165L;
                                                            l14 = l18 ^ 0x7D34CF311808L;
                                                            l3 = l18 ^ 0x77FE815D5D37L;
                                                            l13 = l18 ^ 0x5784D74479BL;
                                                            l10 = l18 ^ 0x1190C45D2788L;
                                                            l9 = l18 ^ 0x57D19E355E96L;
                                                            l2 = l18 ^ 0x5BE4B21DC642L;
                                                            l = l18 ^ 0x5D6476AF26C5L;
                                                            callSite6 = b9.d("N", (long)-6312957547207561595L, (long)l8);
                                                            try {
                                                                b9 b92;
                                                                try {
                                                                    b92 = this;
                                                                    if (callSite6 != null) break block73;
                                                                    if (b92.h != null) break block74;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                }
                                                                b92 = this;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                            }
                                                        }
                                                        Object[] objectArray2 = new Object[2];
                                                        objectArray2[1] = l17;
                                                        objectArray2[0] = b9.a("e", (int)10744, (long)(0x3000740426C2AE06L ^ l8));
                                                        b92.h = b9.d("N", (Object)objectArray2, (long)-6312740060364069783L, (long)l8);
                                                    }
                                                    float f19 = (float)(b9.d("N", (long)-6313250403231523183L, (long)l8) - this.i) * 0.005f;
                                                    this.i = (long)b9.d("N", (long)-6313250403231523183L, (long)l8);
                                                    Object[] objectArray3 = new Object[1];
                                                    objectArray3[0] = l3;
                                                    Object[] objectArray4 = new Object[1];
                                                    objectArray4[0] = l15;
                                                    callSite5 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray3, (long)-6313582189242077277L, (long)l8), (Object)objectArray4, (long)-6309605042702460829L, (long)l8);
                                                    Object[] objectArray5 = new Object[2];
                                                    objectArray5[1] = Float.valueOf(1.0f);
                                                    objectArray5[0] = Float.valueOf((float)callSite5);
                                                    var42_25 = b9.d("N", (Object)objectArray5, (long)-6313810538453787462L, (long)l8);
                                                    Object[] objectArray6 = new Object[2];
                                                    objectArray6[1] = Float.valueOf(0.75f);
                                                    objectArray6[0] = Float.valueOf((float)callSite5);
                                                    callSite4 = b9.d("N", (Object)objectArray6, (long)-6313810538453787462L, (long)l8);
                                                    arrayList = new ArrayList();
                                                    CallSite callSite9 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6306979269953859392L, (long)l8), (long)-6310600810279493708L, (long)l8), (long)-6310124097727796189L, (long)l8);
                                                    while (b9.d("\u00ea", (Object)callSite9, (long)-6312210499867745388L, (long)l8) != false) {
                                                        block83: {
                                                            CallSite callSite10;
                                                            CallSite callSite11;
                                                            CallSite callSite12;
                                                            reference var48_35;
                                                            dV dV2;
                                                            block82: {
                                                                CallSite callSite13;
                                                                block81: {
                                                                    CallSite callSite14;
                                                                    block79: {
                                                                        block80: {
                                                                            block78: {
                                                                                float f20;
                                                                                block77: {
                                                                                    block76: {
                                                                                        CallSite callSite15;
                                                                                        block75: {
                                                                                            dV2 = (dV)((Object)b9.d("\u00ea", (Object)callSite9, (long)-6309884972732901919L, (long)l8));
                                                                                            try {
                                                                                                try {
                                                                                                    callSite15 = b9.d("\u00ea", (Object)dV2, (long)-6314010916295760239L, (long)l8);
                                                                                                    if (callSite6 != null) break block75;
                                                                                                    if (callSite15 == false) break block76;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                                                }
                                                                                                Object[] objectArray7 = new Object[1];
                                                                                                objectArray7[0] = l14;
                                                                                                callSite15 = b9.d("\u00ea", (Object)dV2, (Object)objectArray7, (long)-6312573090301611690L, (long)l8);
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (callSite15 == -1) break block76;
                                                                                            f20 = 1.0f;
                                                                                            break block77;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                                        }
                                                                                    }
                                                                                    f20 = 0.0f;
                                                                                }
                                                                                float f21 = f20;
                                                                                Object[] objectArray8 = new Object[4];
                                                                                objectArray8[3] = l13;
                                                                                objectArray8[2] = Float.valueOf(f19);
                                                                                objectArray8[1] = Float.valueOf(f21);
                                                                                objectArray8[0] = Float.valueOf((float)b9.d("\u00ea", (Object)((Float)((Object)b9.d("\u00ea", (Object)this.g, (Object)dV2, (Object)b9.d("N", (float)0.0f, (long)-6310068309211508992L, (long)l8), (long)-6313275704572630209L, (long)l8))), (long)-6310214521453993678L, (long)l8));
                                                                                var48_35 = b9.d("N", (Object)objectArray8, (long)-6310376476117322246L, (long)l8);
                                                                                try {
                                                                                    b9.d("\u00ea", (Object)this.g, (Object)dV2, (Object)b9.d("N", (float)var48_35, (long)-6310068309211508992L, (long)l8), (long)-6306857246669914858L, (long)l8);
                                                                                    reference cfr_temp_0 = var48_35 - 0.05f;
                                                                                    callSite14 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                                    if (callSite6 != null) break block78;
                                                                                    if (callSite14 < 0) {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                                }
                                                                                Object[] objectArray9 = new Object[1];
                                                                                objectArray9[0] = l14;
                                                                                callSite14 = b9.d("\u00ea", (Object)b9.d("N", (int)b9.d("\u00ea", (Object)dV2, (Object)objectArray9, (long)-6312573090301611690L, (long)l8), (long)-6312049290879888813L, (long)l8), (Object)b9.a("e", (int)31829, (long)(0x6B6948F4EF2A7BA8L ^ l8)), (long)-6312095419706435385L, (long)l8);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite6 != null) break block79;
                                                                                    if (callSite14 == false) break block80;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                                }
                                                                                Object[] objectArray10 = new Object[1];
                                                                                objectArray10[0] = l14;
                                                                                Object[] objectArray11 = new Object[2];
                                                                                objectArray11[1] = l16;
                                                                                objectArray11[0] = (int)b9.d("\u00ea", (Object)dV2, (Object)objectArray10, (long)-6312573090301611690L, (long)l8);
                                                                                callSite13 = b9.d("N", (Object)objectArray11, (long)-6310572157079256440L, (long)l8);
                                                                                break block81;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                            }
                                                                        }
                                                                        Object[] objectArray12 = new Object[1];
                                                                        objectArray12[0] = l14;
                                                                        callSite14 = b9.d("\u00ea", (Object)dV2, (Object)objectArray12, (long)-6312573090301611690L, (long)l8);
                                                                    }
                                                                    callSite13 = b9.d("N", (int)callSite14, (long)-6312049290879888813L, (long)l8);
                                                                }
                                                                callSite12 = callSite13;
                                                                try {
                                                                    callSite11 = callSite12;
                                                                    if (callSite6 != null) break block82;
                                                                    if (callSite11 == null) continue;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                }
                                                                callSite11 = callSite12;
                                                            }
                                                            try {
                                                                callSite10 = b9.d("\u00ea", (Object)callSite11, (long)-6312822383814491406L, (long)l8);
                                                                if (callSite6 != null) break block83;
                                                                if (callSite10 != false) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                            }
                                                            callSite10 = b9.d("\u00ea", arrayList, (Object)new gA(dV2, (String)((Object)callSite12), (float)var48_35), (long)-6309620079843099982L, (long)l8);
                                                        }
                                                        if (callSite6 == null) continue;
                                                    }
                                                    Object object2 = 0.0f;
                                                    Object object3 = 70.0f;
                                                    CallSite callSite16 = b9.d("\u00ea", arrayList, (long)-6310124097727796189L, (long)l8);
                                                    while (b9.d("\u00ea", (Object)callSite16, (long)-6312210499867745388L, (long)l8) != false) {
                                                        gA gA2 = (gA)((Object)b9.d("\u00ea", (Object)callSite16, (long)-6309884972732901919L, (long)l8));
                                                        Object[] objectArray13 = new Object[1];
                                                        objectArray13[0] = l3;
                                                        Object[] objectArray14 = new Object[2];
                                                        objectArray14[1] = l4;
                                                        objectArray14[0] = b9.d("\u00ea", (Object)gA2, (long)-6313542428692682937L, (long)l8);
                                                        reference var49_40 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray13, (long)-6313582189242077277L, (long)l8), (Object)objectArray14, (long)-6310405398159491481L, (long)l8) * 0.75f + 5.5f;
                                                        Object[] objectArray15 = new Object[1];
                                                        objectArray15[0] = l3;
                                                        Object[] objectArray16 = new Object[2];
                                                        objectArray16[1] = l4;
                                                        objectArray16[0] = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)gA2, (long)-6309777413129712276L, (long)l8), (long)-6312416066863280335L, (long)l8);
                                                        reference var50_43 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray15, (long)-6313582189242077277L, (long)l8), (Object)objectArray16, (long)-6310405398159491481L, (long)l8) * 0.75f;
                                                        object2 = b9.d("N", (float)object2, (float)(var49_40 * b9.d("\u00ea", (Object)gA2, (long)-6313680418909858657L, (long)l8)), (long)-6310954230203501777L, (long)l8);
                                                        object3 = b9.d("N", (float)object3, (float)((5.5f + var49_40 + 3.0f + var50_43 + 5.5f) * b9.d("\u00ea", (Object)gA2, (long)-6313680418909858657L, (long)l8)), (long)-6310954230203501777L, (long)l8);
                                                        try {
                                                            if (callSite6 == null) {
                                                                if (callSite6 == null) continue;
                                                                break;
                                                            }
                                                            break block84;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                        }
                                                    }
                                                    Object[] objectArray17 = new Object[4];
                                                    objectArray17[3] = l13;
                                                    objectArray17[2] = Float.valueOf(f19 * 2.0f);
                                                    objectArray17[1] = Float.valueOf(object3);
                                                    objectArray17[0] = Float.valueOf(this.k);
                                                    this.k = (float)b9.d("N", (Object)objectArray17, (long)-6310376476117322246L, (long)l8);
                                                    Object[] objectArray18 = new Object[4];
                                                    objectArray18[3] = l13;
                                                    objectArray18[2] = Float.valueOf(f19 * 2.0f);
                                                    objectArray18[1] = Float.valueOf(object2);
                                                    objectArray18[0] = Float.valueOf(this.l);
                                                    this.l = (float)b9.d("N", (Object)objectArray18, (long)-6310376476117322246L, (long)l8);
                                                }
                                                var47_34 = var42_25;
                                                CallSite callSite17 = b9.d("\u00ea", arrayList, (long)-6310124097727796189L, (long)l8);
                                                while (b9.d("\u00ea", (Object)callSite17, (long)-6312210499867745388L, (long)l8) != false) {
                                                    gA gA3 = (gA)((Object)b9.d("\u00ea", (Object)callSite17, (long)-6309884972732901919L, (long)l8));
                                                    var47_34 += (callSite4 + 1.5f) * b9.d("\u00ea", (Object)gA3, (long)-6313680418909858657L, (long)l8);
                                                    if (callSite6 == null) continue;
                                                }
                                                callSite3 = b9.d("\u00ea", (Object)this, (Object)new Object[0], (long)-6313472688248908983L, (long)l8);
                                                callSite2 = b9.d("\u00ea", (Object)this, (Object)new Object[0], (long)-6312900396182636301L, (long)l8);
                                                boolean bl = b9.d("L", (Object)b, (long)-6312353473714072624L, (long)l8) instanceof g8;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (callSite6 != null) break block85;
                                                                        if (bl) break block86;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                    }
                                                                    object = callSite2;
                                                                    if (callSite6 != null) break block87;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                                }
                                                                if (object == false) break block88;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                            }
                                                            float f21 = this.o - 0.0f;
                                                            object = f21 == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                                                            if (callSite6 != null) break block87;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                        }
                                                        if (object <= 0) break block88;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                    }
                                                    this.f -= var47_34 - this.o;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                }
                                            }
                                            object = callSite3;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (callSite6 != null) break block89;
                                                    if (object == false) break block86;
                                                }
                                                catch (MatchException matchException) {
                                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                                }
                                                f18 = this.p;
                                                if (callSite6 != null) break block90;
                                            }
                                            catch (MatchException matchException) {
                                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                            }
                                            float f22 = f18 - 0.0f;
                                            object = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                                        }
                                        catch (MatchException matchException) {
                                            throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                        }
                                    }
                                    try {
                                        if (object > 0) {
                                            this.e -= this.k - this.p;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                    }
                                }
                                this.o = (float)var47_34;
                                this.p = this.k;
                            }
                            f18 = this.e;
                        }
                        f11 = f18;
                        f12 = this.f;
                        Object[] objectArray19 = new Object[2];
                        objectArray19[1] = Float.valueOf((float)var47_34);
                        objectArray19[0] = Float.valueOf(this.k);
                        b9.d("\u00ea", (Object)this, (Object)objectArray19, (long)-6306742159931511916L, (long)l8);
                        Object[] objectArray20 = new Object[1];
                        objectArray20[0] = l12;
                        callSite = b9.d("N", (Object)objectArray20, (long)-6313847762016931049L, (long)l8);
                        try {
                            f17 = callSite2 != false ? f12 + var47_34 - var42_25 : f12;
                        }
                        catch (MatchException matchException) {
                            throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                        }
                        f13 = f17;
                        Object[] objectArray21 = new Object[10];
                        objectArray21[9] = l7;
                        objectArray21[8] = Float.valueOf(4.0f);
                        objectArray21[7] = 5;
                        objectArray21[6] = Float.valueOf((float)var42_25);
                        objectArray21[5] = Float.valueOf(this.k);
                        objectArray21[4] = Float.valueOf(f13);
                        objectArray21[3] = Float.valueOf(f11);
                        objectArray21[2] = matrix4f;
                        objectArray21[1] = gK2;
                        objectArray21[0] = aq_02;
                        b9.d("N", (Object)objectArray21, (long)-6310511510931964002L, (long)l8);
                        Object[] objectArray22 = new Object[10];
                        objectArray22[9] = l5;
                        objectArray22[8] = Float.valueOf(4.0f);
                        objectArray22[7] = cn_0.r;
                        objectArray22[6] = Float.valueOf((float)var42_25);
                        objectArray22[5] = Float.valueOf(this.k);
                        objectArray22[4] = Float.valueOf(f13);
                        objectArray22[3] = Float.valueOf(f11);
                        objectArray22[2] = matrix4f;
                        objectArray22[1] = gK2;
                        objectArray22[0] = aq_02;
                        b9.d("N", (Object)objectArray22, (long)-6312457847763714829L, (long)l8);
                        callSite8 = b9.a("e", (int)1773, (long)(0x5DEBDDBBFEF78114L ^ l8));
                        var56_50 = (var42_25 - 7.5f) / 2.0f;
                        f16 = f13 + (var42_25 - callSite5) / 2.0f;
                        if (callSite3 == false) break block98;
                        f10 = f11 + this.k - 5.5f - 7.5f;
                        Object[] objectArray23 = new Object[10];
                        objectArray23[9] = l10;
                        objectArray23[8] = callSite;
                        objectArray23[7] = Float.valueOf(7.5f);
                        objectArray23[6] = Float.valueOf(7.5f);
                        objectArray23[5] = Float.valueOf(f13 + var56_50);
                        objectArray23[4] = Float.valueOf(f10);
                        objectArray23[3] = this.h;
                        objectArray23[2] = matrix4f;
                        objectArray23[1] = gK2;
                        objectArray23[0] = aq_02;
                        b9.d("N", (Object)objectArray23, (long)-6313393432229230155L, (long)l8);
                        f15 = f10 - 3.0f - 0.5f;
                        Object[] objectArray24 = new Object[7];
                        objectArray24[6] = l11;
                        objectArray24[5] = cn_0.v;
                        objectArray24[4] = Float.valueOf(f13 + var42_25 - var56_50);
                        objectArray24[3] = Float.valueOf(f15 + 0.5f);
                        objectArray24[2] = Float.valueOf(f13 + var56_50);
                        objectArray24[1] = Float.valueOf(f15);
                        objectArray24[0] = matrix4f;
                        b9.d("N", (Object)objectArray24, (long)-6313054728267868611L, (long)l8);
                        Object[] objectArray25 = new Object[1];
                        objectArray25[0] = l3;
                        Object[] objectArray26 = new Object[2];
                        objectArray26[1] = l4;
                        objectArray26[0] = callSite8;
                        f14 = f15 - 3.0f - b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray25, (long)-6313582189242077277L, (long)l8), (Object)objectArray26, (long)-6310405398159491481L, (long)l8);
                        boolean n = false;
                        while (var61_58 < b9.d("\u00ea", (Object)callSite8, (long)-6309935106284430209L, (long)l8)) {
                            callSite7 = b9.d("N", (char)b9.d("\u00ea", (Object)callSite8, (int)var61_58, (long)-6313165116520228287L, (long)l8), (long)-6312238113233322634L, (long)l8);
                            Object[] objectArray27 = new Object[1];
                            objectArray27[0] = l3;
                            Object[] objectArray28 = new Object[4];
                            objectArray28[3] = l6;
                            objectArray28[2] = (int)(b9.c("s", (int)23638, (long)(0x6DF5918F5002664CL ^ l8)) + (b9.d("\u00ea", (Object)callSite8, (long)-6309935106284430209L, (long)l8) - true - var61_58));
                            objectArray28[1] = (int)b9.c("s", (int)24336, (long)(0x1E73AFC29239E50BL ^ l8));
                            objectArray28[0] = callSite;
                            Object[] objectArray29 = new Object[6];
                            objectArray29[5] = l9;
                            objectArray29[4] = b9.d("N", (Object)objectArray28, (long)-6312701050278294554L, (long)l8);
                            objectArray29[3] = Float.valueOf(f16);
                            objectArray29[2] = Float.valueOf(f14);
                            objectArray29[1] = callSite7;
                            objectArray29[0] = matrix4f;
                            b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray27, (long)-6313582189242077277L, (long)l8), (Object)objectArray29, (long)-6311904008482012726L, (long)l8);
                            Object[] objectArray30 = new Object[1];
                            objectArray30[0] = l3;
                            Object[] objectArray31 = new Object[2];
                            objectArray31[1] = l4;
                            objectArray31[0] = callSite7;
                            f14 += b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray30, (long)-6313582189242077277L, (long)l8), (Object)objectArray31, (long)-6310405398159491481L, (long)l8);
                            try {
                                ++var61_58;
                                if (callSite6 == null) {
                                    if (callSite6 == null) continue;
                                    break;
                                }
                                break block91;
                            }
                            catch (MatchException matchException) {
                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                            }
                        }
                        if (callSite6 == null) break block91;
                    }
                    f10 = f11 + 5.5f;
                    Object[] objectArray32 = new Object[10];
                    objectArray32[9] = l10;
                    objectArray32[8] = callSite;
                    objectArray32[7] = Float.valueOf(7.5f);
                    objectArray32[6] = Float.valueOf(7.5f);
                    objectArray32[5] = Float.valueOf(f13 + var56_50);
                    objectArray32[4] = Float.valueOf(f10);
                    objectArray32[3] = this.h;
                    objectArray32[2] = matrix4f;
                    objectArray32[1] = gK2;
                    objectArray32[0] = aq_02;
                    b9.d("N", (Object)objectArray32, (long)-6313393432229230155L, (long)l8);
                    f15 = f10 + 7.5f + 3.0f;
                    Object[] objectArray33 = new Object[7];
                    objectArray33[6] = l11;
                    objectArray33[5] = cn_0.v;
                    objectArray33[4] = Float.valueOf(f13 + var42_25 - var56_50);
                    objectArray33[3] = Float.valueOf(f15 + 0.5f);
                    objectArray33[2] = Float.valueOf(f13 + var56_50);
                    objectArray33[1] = Float.valueOf(f15);
                    objectArray33[0] = matrix4f;
                    b9.d("N", (Object)objectArray33, (long)-6313054728267868611L, (long)l8);
                    f14 = f15 + 0.5f + 3.0f;
                    boolean bl = false;
                    while (var61_60 < b9.d("\u00ea", (Object)callSite8, (long)-6309935106284430209L, (long)l8)) {
                        callSite7 = b9.d("N", (char)b9.d("\u00ea", (Object)callSite8, (int)var61_60, (long)-6313165116520228287L, (long)l8), (long)-6312238113233322634L, (long)l8);
                        Object[] objectArray34 = new Object[1];
                        objectArray34[0] = l3;
                        Object[] objectArray35 = new Object[4];
                        objectArray35[3] = l6;
                        objectArray35[2] = (int)(b9.c("s", (int)23638, (long)(0x6DF5918F5002664CL ^ l8)) + var61_60);
                        objectArray35[1] = (int)b9.c("s", (int)23638, (long)(0x6DF5918F5002664CL ^ l8));
                        objectArray35[0] = callSite;
                        Object[] objectArray36 = new Object[6];
                        objectArray36[5] = l9;
                        objectArray36[4] = b9.d("N", (Object)objectArray35, (long)-6312701050278294554L, (long)l8);
                        objectArray36[3] = Float.valueOf(f16);
                        objectArray36[2] = Float.valueOf(f14);
                        objectArray36[1] = callSite7;
                        objectArray36[0] = matrix4f;
                        b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray34, (long)-6313582189242077277L, (long)l8), (Object)objectArray36, (long)-6311904008482012726L, (long)l8);
                        Object[] objectArray37 = new Object[1];
                        objectArray37[0] = l3;
                        Object[] objectArray38 = new Object[2];
                        objectArray38[1] = l4;
                        objectArray38[0] = callSite7;
                        f14 += b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray37, (long)-6313582189242077277L, (long)l8), (Object)objectArray38, (long)-6310405398159491481L, (long)l8);
                        try {
                            ++var61_60;
                            if (callSite6 == null) {
                                if (callSite6 == null) continue;
                                break;
                            }
                            break block92;
                        }
                        catch (MatchException matchException) {
                            throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                        }
                    }
                }
                try {
                    if (callSite2 == false) break block92;
                    f = f13 - 1.5f - callSite4;
                    break block93;
                }
                catch (MatchException matchException) {
                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                }
            }
            f = f12 + var42_25 + 1.5f;
        }
        f10 = f;
        for (int i = 0; i < b9.d("\u00ea", arrayList, (long)-6311952271074596492L, (long)l8); ++i) {
            reference var61_61;
            block97: {
                block96: {
                    float f23;
                    float f24;
                    CallSite callSite16;
                    CallSite callSite17;
                    gA gA4;
                    block94: {
                        block95: {
                            gA4 = (gA)((Object)b9.d("\u00ea", arrayList, (int)i, (long)-6311130161444824499L, (long)l8));
                            var61_61 = b9.d("\u00ea", (Object)gA4, (long)-6313680418909858657L, (long)l8);
                            Object[] objectArray39 = new Object[2];
                            objectArray39[1] = l;
                            objectArray39[0] = (int)(255.0f * var61_61);
                            callSite17 = b9.d("N", (Object)objectArray39, (long)-6309701659765014988L, (long)l8);
                            try {
                                try {
                                    reference cfr_temp_3 = var61_61 - 0.7f;
                                    callSite16 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                                    if (callSite6 != null) break block94;
                                    if (callSite16 <= 0) break block95;
                                }
                                catch (MatchException matchException) {
                                    throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                                }
                                Object[] objectArray40 = new Object[10];
                                objectArray40[9] = l7;
                                objectArray40[8] = Float.valueOf(4.0f);
                                objectArray40[7] = 5;
                                objectArray40[6] = Float.valueOf((float)callSite4);
                                objectArray40[5] = Float.valueOf(this.k);
                                objectArray40[4] = Float.valueOf(f10);
                                objectArray40[3] = Float.valueOf(f11);
                                objectArray40[2] = matrix4f;
                                objectArray40[1] = gK2;
                                objectArray40[0] = aq_02;
                                b9.d("N", (Object)objectArray40, (long)-6310511510931964002L, (long)l8);
                            }
                            catch (MatchException matchException) {
                                throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                            }
                        }
                        Object[] objectArray41 = new Object[2];
                        objectArray41[1] = l;
                        objectArray41[0] = (int)((float)b9.d("\u00ea", (Object)cn_0.r, (long)-6310021104154580794L, (long)l8) * var61_61);
                        Object[] objectArray42 = new Object[10];
                        objectArray42[9] = l5;
                        objectArray42[8] = Float.valueOf(4.0f);
                        objectArray42[7] = new Color((int)b9.d("\u00ea", (Object)cn_0.r, (long)-6313912601765615144L, (long)l8), (int)b9.d("\u00ea", (Object)cn_0.r, (long)-6306908789485814438L, (long)l8), (int)b9.d("\u00ea", (Object)cn_0.r, (long)-6310289647771307787L, (long)l8), (int)b9.d("N", (Object)objectArray41, (long)-6309701659765014988L, (long)l8));
                        objectArray42[6] = Float.valueOf((float)callSite4);
                        objectArray42[5] = Float.valueOf(this.k);
                        objectArray42[4] = Float.valueOf(f10);
                        objectArray42[3] = Float.valueOf(f11);
                        objectArray42[2] = matrix4f;
                        objectArray42[1] = gK2;
                        objectArray42[0] = aq_02;
                        b9.d("N", (Object)objectArray42, (long)-6312457847763714829L, (long)l8);
                        callSite16 = callSite3;
                    }
                    try {
                        f24 = callSite16 != false ? f11 + this.k - 5.5f - this.l : f11 + 5.5f;
                    }
                    catch (MatchException matchException) {
                        throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                    }
                    float f25 = f24;
                    float f26 = f10 + (callSite4 - 8.0f) / 2.0f;
                    Object[] objectArray43 = new Object[2];
                    objectArray43[1] = l;
                    objectArray43[0] = (int)(25.0f * var61_61);
                    Object[] objectArray44 = new Object[10];
                    objectArray44[9] = l5;
                    objectArray44[8] = Float.valueOf(3.0f);
                    objectArray44[7] = new Color((int)b9.c("s", (int)19682, (long)(0x782661AEDD4AF6FBL ^ l8)), (int)b9.c("s", (int)19682, (long)(0x782661AEDD4AF6FBL ^ l8)), (int)b9.c("s", (int)19682, (long)(0x782661AEDD4AF6FBL ^ l8)), (int)b9.d("N", (Object)objectArray43, (long)-6309701659765014988L, (long)l8));
                    objectArray44[6] = Float.valueOf(8.0f);
                    objectArray44[5] = Float.valueOf(this.l);
                    objectArray44[4] = Float.valueOf(f26);
                    objectArray44[3] = Float.valueOf(f25);
                    objectArray44[2] = matrix4f;
                    objectArray44[1] = gK2;
                    objectArray44[0] = aq_02;
                    b9.d("N", (Object)objectArray44, (long)-6312457847763714829L, (long)l8);
                    Object[] objectArray45 = new Object[4];
                    objectArray45[3] = l6;
                    objectArray45[2] = (int)(b9.c("s", (int)23638, (long)(0x6DF5918F5002664CL ^ l8)) + i);
                    objectArray45[1] = (int)b9.c("s", (int)23638, (long)(0x6DF5918F5002664CL ^ l8));
                    objectArray45[0] = callSite;
                    CallSite callSite18 = b9.d("N", (Object)objectArray45, (long)-6312701050278294554L, (long)l8);
                    Color color = new Color((int)b9.d("\u00ea", (Object)callSite18, (long)-6313912601765615144L, (long)l8), (int)b9.d("\u00ea", (Object)callSite18, (long)-6306908789485814438L, (long)l8), (int)b9.d("\u00ea", (Object)callSite18, (long)-6310289647771307787L, (long)l8), (int)callSite17);
                    Object[] objectArray46 = new Object[1];
                    objectArray46[0] = l3;
                    Object[] objectArray47 = new Object[2];
                    objectArray47[1] = l4;
                    objectArray47[0] = b9.d("\u00ea", (Object)gA4, (long)-6313542428692682937L, (long)l8);
                    reference var67_68 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray46, (long)-6313582189242077277L, (long)l8), (Object)objectArray47, (long)-6310405398159491481L, (long)l8) * 0.75f;
                    float f27 = f25 + (this.l - var67_68) / 2.0f;
                    float f28 = f26 + (8.0f - callSite5 * 0.75f) / 2.0f;
                    Object[] objectArray48 = new Object[1];
                    objectArray48[0] = l3;
                    Object[] objectArray49 = new Object[7];
                    objectArray49[6] = l2;
                    objectArray49[5] = color;
                    objectArray49[4] = Float.valueOf(0.75f);
                    objectArray49[3] = Float.valueOf(f28);
                    objectArray49[2] = Float.valueOf(f27);
                    objectArray49[1] = b9.d("\u00ea", (Object)gA4, (long)-6313542428692682937L, (long)l8);
                    objectArray49[0] = matrix4f;
                    b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray48, (long)-6313582189242077277L, (long)l8), (Object)objectArray49, (long)-6311196931985913570L, (long)l8);
                    CallSite callSite19 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)gA4, (long)-6309777413129712276L, (long)l8), (long)-6312416066863280335L, (long)l8);
                    Object[] objectArray50 = new Object[1];
                    objectArray50[0] = l3;
                    Object[] objectArray51 = new Object[2];
                    objectArray51[1] = l4;
                    objectArray51[0] = callSite19;
                    reference var71_72 = b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray50, (long)-6313582189242077277L, (long)l8), (Object)objectArray51, (long)-6310405398159491481L, (long)l8) * 0.75f;
                    try {
                        f23 = callSite3 != false ? f25 - 3.0f - var71_72 : f25 + this.l + 3.0f;
                    }
                    catch (MatchException matchException) {
                        throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                    }
                    float f29 = f23;
                    float f30 = f10 + (callSite4 - callSite5 * 0.75f) / 2.0f;
                    try {
                        Object[] objectArray52 = new Object[1];
                        objectArray52[0] = l3;
                        Object[] objectArray53 = new Object[2];
                        objectArray53[1] = l;
                        objectArray53[0] = (int)(220.0f * var61_61);
                        Object[] objectArray54 = new Object[7];
                        objectArray54[6] = l2;
                        objectArray54[5] = new Color((int)b9.c("s", (int)19682, (long)(0x782661AEDD4AF6FBL ^ l8)), (int)b9.c("s", (int)19682, (long)(0x782661AEDD4AF6FBL ^ l8)), (int)b9.c("s", (int)19682, (long)(0x782661AEDD4AF6FBL ^ l8)), (int)b9.d("N", (Object)objectArray53, (long)-6309701659765014988L, (long)l8));
                        objectArray54[4] = Float.valueOf(0.75f);
                        objectArray54[3] = Float.valueOf(f30);
                        objectArray54[2] = Float.valueOf(f29);
                        objectArray54[1] = callSite19;
                        objectArray54[0] = matrix4f;
                        b9.d("\u00ea", (Object)b9.d("\u00ea", (Object)b9.d("R", (long)-6311835693714036844L, (long)l8), (Object)objectArray52, (long)-6313582189242077277L, (long)l8), (Object)objectArray54, (long)-6311196931985913570L, (long)l8);
                        if (callSite6 != null) break block96;
                        if (callSite2 == false) break block97;
                    }
                    catch (MatchException matchException) {
                        throw b9.d("N", (Object)matchException, (long)-6313757880853696771L, (long)l8);
                    }
                    f10 -= (callSite4 + 1.5f) * var61_61;
                }
                if (callSite6 == null) continue;
            }
            f10 += (callSite4 + 1.5f) * var61_61;
            if (callSite6 == null) continue;
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b9.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F8B;
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
                throw new RuntimeException("dev/zprestige/prestige/b9", exception);
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
            b9.x[n2] = b9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(Object[] objectArray) {
        Object object;
        block6: {
            int n;
            long l;
            block4: {
                int n2;
                block5: {
                    n2 = (Integer)objectArray[0];
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    CallSite callSite = b9.d("N", (long)-8374783833470907104L, (long)l);
                    try {
                        try {
                            n = n2;
                            if (callSite != null) break block4;
                            if (n >= 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw b9.d("N", (Object)matchException, (long)-8375549204512223912L, (long)l);
                        }
                        object = 0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw b9.d("N", (Object)matchException, (long)-8375549204512223912L, (long)l);
                    }
                }
                n = n2;
            }
            object = b9.d("N", (int)n, (int)b9.c("s", (int)25541, (long)(0x1FF15BE8872CFA78L ^ l)), (long)-8374917600218883337L, (long)l);
        }
        return object;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(63.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        b9.d("\u00ea", (Object)this, (Object)objectArray2, (long)-3383875596694829766L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = b9.i(l, l2);
        Object object = I[n];
        if (object instanceof String) {
            String string = J[n];
            int n2 = string.indexOf(8);
            Class clazz = b9.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b9.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b9.e(clazz3, string2, clazz2)) != null) {
                    b9.I[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b9.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b9.I[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b9.j(595535509964789L, 0L);
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
            int n = b9.i(l, l2);
            object = I[n];
            try {
                if (!(object instanceof String)) break block2;
                b9.I[n] = clazz = Class.forName(J[n]);
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
            return MethodHandles.lookup().findStatic(b9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


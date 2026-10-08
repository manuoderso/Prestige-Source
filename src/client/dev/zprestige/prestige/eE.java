/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.aC;
import dev.zprestige.prestige.aD;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.k_0;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.y_0;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eE
extends dV
implements dF {
    private dR a;
    private dO c;
    private dM d;
    private dO e;
    private static final double f = 0.4;
    private static final int g;
    private static final int h;
    private static final float i = 1.5f;
    private static final double j = 0.03;
    private static final double k = 0.99;
    private static final float l = 1.5f;
    private static final double m = 0.99;
    private static final double n = 0.0;
    private static final double o = 0.08;
    private static final double p = 0.98;
    private static final double q = 0.91;
    private k_0 r;
    private int s;
    private List t;
    private aC u;
    private f5 v;
    private boolean w;
    private dC x;
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    private Object C;
    private Object D;
    private static final long E;
    private static final String[] F;
    private static final String[] G;
    private static final Map H;
    private static final long[] I;
    private static final Integer[] J;
    private static final Map K;
    private static final Object[] L;
    private static final String[] M;

    public eE() {
        long l = E ^ 0x41E1F9A5DA02L;
        long l2 = l ^ 0x51808CFD6A83L;
        this.r = k_0.IDLE;
        this.v = new f5(l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        eE.E = hc.a(-3019764156060569958L, 414128418584859578L, MethodHandles.lookup().lookupClass()).a(271779117658816L);
                        eE.L = new Object[169];
                        eE.M = new String[169];
                        eE.f();
                        eE.H = new HashMap<K, V>(13);
                        var11 = eE.E ^ 84197288043628L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "f\u00f3\u00cfk\u00f7KV'\u00de(X@\u00a9\u0019\u00f5\u00ecg[9=\u00e8\u00cb~\u0006)ym\u0096\u00f4\u0091\u00f0\u008d\u0010M\u00f0oP\u00c6\u0085\u00d5\u00a7\u00e2#\u00f0\u00b4w\u00cf\u001bV";
                        var19_6 = "f\u00f3\u00cfk\u00f7KV'\u00de(X@\u00a9\u0019\u00f5\u00ecg[9=\u00e8\u00cb~\u0006)ym\u0096\u00f4\u0091\u00f0\u008d\u0010M\u00f0oP\u00c6\u0085\u00d5\u00a7\u00e2#\u00f0\u00b4w\u00cf\u001bV".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = eE.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00d0\u00bd\u00865\u00ea\u00eb`xsq]\u0003\u00d9=\u008f\u00df\u00c7\u0089_\u00df\u00a6\u0004\u00aeH\u0010e\u00e8+\u00c4\u00c8\u00a8\u00f2_X\u000feF\u009bkU#";
                            var19_6 = "\u00d0\u00bd\u00865\u00ea\u00eb`xsq]\u0003\u00d9=\u008f\u00df\u00c7\u0089_\u00df\u00a6\u0004\u00aeH\u0010e\u00e8+\u00c4\u00c8\u00a8\u00f2_X\u000feF\u009bkU#".length();
                            var16_7 = 24;
                            var15_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = eE.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                eE.F = var20_3;
                eE.G = new String[4];
                eE.K = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u00f3\u00b13k\u00cb\u0015q&\u00ae\u009a\u00a6\u00a8\u00dehKKN\rd\u00f6\u009f\\\"M\u00d6y\u001eX\u00b7u\u00cf6";
                var5_15 = "\u00f3\u00b13k\u00cb\u0015q&\u00ae\u009a\u00a6\u00a8\u00dehKKN\rd\u00f6\u009f\\\"M\u00d6y\u001eX\u00b7u\u00cf6".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl102:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "#\f1\u001a\u00f1\u00ae5\u0010\u00fe\u00c3\u00e0\u00c6\u00b0\u00cc\u00cd\u001a";
                    var5_15 = "#\f1\u001a\u00f1\u00ae5\u0010\u00fe\u00c3\u00e0\u00c6\u00b0\u00cc\u00cd\u001a".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl121:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
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
        eE.I = var6_12;
        eE.J = new Integer[6];
        eE.g = (int)eE.c("j", (int)17138, (long)(var11 ^ 5047452112168428868L));
        eE.h = (int)eE.c("j", (int)22746, (long)(var11 ^ 2506026713340657514L));
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x7FAB131DDD11L;
        long l4 = l2 ^ 0x5E6D9DCDE20DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        eE.d("D", (Object)this, (Object)objectArray2, (long)3985105932934164482L, (long)l);
        this.D = null;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = this;
        eE.d("D", (Object)eE.d("O", (long)3982292989272275530L, (long)l), (Object)objectArray3, (long)3982539031042705458L, (long)l);
    }

    private dC e(Object[] objectArray) {
        dC dC2;
        block4: {
            long l;
            long l2;
            block5: {
                block6: {
                    reference var10_7;
                    dC dC3;
                    block7: {
                        dC3 = (dC)objectArray[0];
                        l2 = (Long)objectArray[1];
                        long l3 = l2 = E ^ l2;
                        l = l3 ^ 0x66D24C2A6ACEL;
                        long l4 = l3 ^ 0x2C6E1E5F93DAL;
                        CallSite callSite = eE.d("E", (long)8247436508842507254L, (long)l2);
                        try {
                            dC2 = this.x;
                            if (callSite != null) break block4;
                            if (dC2 != null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)8247591236688528517L, (long)l2);
                        }
                        var10_7 = eE.d("D", (Object)dC3, (Object)new Object[0], (long)8236056608232303150L, (long)l2);
                        try {
                            if (callSite != null) break block6;
                            if (eE.d("\u00c7", (Object)b, (long)8250548669214883917L, (long)l2) == null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)8247591236688528517L, (long)l2);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = Float.valueOf((float)(var10_7 - eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)8250548669214883917L, (long)l2), (long)8235013597892655767L, (long)l2)));
                        var10_7 = eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)8250548669214883917L, (long)l2), (long)8235013597892655767L, (long)l2) + eE.d("E", (Object)objectArray2, (long)8235700317966408698L, (long)l2);
                    }
                    this.x = new dC((float)var10_7, (float)eE.d("D", (Object)dC3, (Object)new Object[0], (long)8246509383046934713L, (long)l2));
                    this.y = 0;
                    this.z = 0;
                    this.A = 0;
                }
                this.C = eE.d("\u00c7", (Object)b, (long)8247401362288112684L, (long)l2);
            }
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l;
            objectArray3[1] = this.x;
            objectArray3[0] = this;
            eE.d("D", (Object)eE.d("O", (long)8236407479663820612L, (long)l2), (Object)objectArray3, (long)8250280864363503167L, (long)l2);
            dC2 = this.x;
        }
        return dC2;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
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

    private dC b(Object[] objectArray) {
        eE eE2;
        long l;
        long l2;
        block29: {
            block30: {
                CallSite callSite;
                block27: {
                    block28: {
                        CallSite callSite2;
                        block25: {
                            block26: {
                                l2 = (Long)objectArray[0];
                                l = (l2 = E ^ l2) ^ 0x54FBDD2065DEL;
                                callSite = eE.d("E", (long)-8903406065306382862L, (long)l2);
                                try {
                                    try {
                                        callSite2 = eE.d("D", (String)((Object)eE.d("D", (Object)this.a, (long)-8902902751040721921L, (long)l2)), (Object)eE.b("q", (int)20392, (long)(0x4023F1BEFAE0D48BL ^ l2)), (long)-8903255162663760300L, (long)l2);
                                        if (callSite != null) break block25;
                                        if (callSite2 != false) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                                    }
                                    return null;
                                }
                                catch (MatchException matchException) {
                                    throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                                }
                            }
                            callSite2 = eE.d("D", (Object)((Boolean)((Object)eE.d("D", (Object)this.d, (long)-8902902751040721921L, (long)l2))), (long)-8902484696666306507L, (long)l2);
                        }
                        try {
                            if (callSite2 == false) {
                                return null;
                            }
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                        }
                        try {
                            if (eE.d("\u00c7", (Object)b, (long)-8900327991974824375L, (long)l2) == null) {
                                return null;
                            }
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                        }
                        try {
                            try {
                                eE2 = this;
                                if (callSite != null) break block27;
                                if (eE2.u != null) break block28;
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                            }
                            return null;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                        }
                    }
                    eE2 = this;
                }
                try {
                    try {
                        try {
                            try {
                                if (callSite != null) break block29;
                                if (eE2.r == k_0.WAIT_FOR_LAUNCH) break block30;
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                            }
                            eE2 = this;
                            if (callSite != null) break block29;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                        }
                        if (eE2.r == k_0.THROW_WIND_CHARGE) break block30;
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
                }
            }
            eE2 = this;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = Float.valueOf(eE2.u.b - eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-8900327991974824375L, (long)l2), (long)-8913505841372935021L, (long)l2));
        CallSite callSite = eE.d("E", (float)eE.d("E", (Object)objectArray2, (long)-8912784911819444738L, (long)l2), (long)-8902625785975844265L, (long)l2);
        try {
            if (callSite > eE.d("D", (Object)((Float)((Object)eE.d("D", (Object)this.e, (long)-8902902751040721921L, (long)l2))), (long)-8914980299743341042L, (long)l2)) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw eE.d("E", (Object)matchException, (long)-8903286481107406207L, (long)l2);
        }
        return new dC(this.u.b, this.u.c);
    }

    private aC b(Object[] objectArray) {
        double d;
        int n;
        Object object;
        long l;
        float f;
        float f10;
        int n2;
        block11: {
            Object object2;
            aD aD2 = (aD)objectArray[0];
            List list = (List)objectArray[1];
            n2 = (Integer)objectArray[2];
            int n3 = (Integer)objectArray[3];
            f10 = ((Float)objectArray[4]).floatValue();
            f = ((Float)objectArray[5]).floatValue();
            l = (Long)objectArray[6];
            long l2 = (l = E ^ l) ^ 0x16DEDBAE2F69L;
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = l2;
            objectArray2[3] = n3 + 4;
            objectArray2[2] = Float.valueOf(f);
            objectArray2[1] = Float.valueOf(f10);
            objectArray2[0] = aD2;
            CallSite callSite = eE.d("D", (Object)this, (Object)objectArray2, (long)-8032190704130861918L, (long)l);
            CallSite callSite2 = eE.d("E", (long)-8032493552632211196L, (long)l);
            object = Double.MAX_VALUE;
            n = n2;
            int n4 = 1;
            while (n4 < eE.d("D", (Object)callSite, (long)-8030437639150895175L, (long)l)) {
                block13: {
                    block14: {
                        int n5 = n2 + n4;
                        try {
                            try {
                                d = n5;
                                if (callSite2 != null) break block11;
                                if (d >= eE.d("D", (Object)list, (long)-8030437639150895175L, (long)l)) {
                                    break;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)-8032369028139243913L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-8032369028139243913L, (long)l);
                        }
                        CallSite callSite3 = eE.d("D", (Object)((class_243)eE.d("D", (Object)callSite, (int)n4, (long)-8020862014831852626L, (long)l)), (Object)((class_243)eE.d("D", (Object)list, (int)n5, (long)-8020862014831852626L, (long)l)), (long)-8030995538190663448L, (long)l);
                        try {
                            if (callSite2 != null) break block13;
                            if (!(callSite3 < object)) break block14;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-8032369028139243913L, (long)l);
                        }
                        object = callSite3;
                        n = n5;
                    }
                    ++n4;
                }
                if (callSite2 == null) continue;
            }
            d = (object2 = object - Double.MAX_VALUE) == 0.0 ? 0 : (object2 > 0.0 ? 1 : -1);
        }
        try {
            if (d == false) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw eE.d("E", (Object)matchException, (long)-8032369028139243913L, (long)l);
        }
        return new aC(n2, f10, f, (double)eE.d("E", (double)object, (long)-8033789896461886718L, (long)l), n);
    }

    private List b(Object[] objectArray) {
        ArrayList arrayList;
        block4: {
            class_243 class_2432 = (class_243)objectArray[0];
            class_243 class_2433 = (class_243)objectArray[1];
            boolean bl = (Boolean)objectArray[2];
            int n = (Integer)objectArray[3];
            long l = (Long)objectArray[4];
            l = E ^ l;
            ArrayList arrayList2 = new ArrayList(n + 1);
            Object object = class_2432;
            CallSite callSite = eE.d("E", (long)7692099731634660157L, (long)l);
            class_243 class_2434 = class_2433;
            boolean bl2 = bl;
            eE.d("D", arrayList2, (Object)new aD((class_243)object, class_2434, bl2), (long)7675850210345887222L, (long)l);
            for (int i = 0; i < n; ++i) {
                object = eE.d("D", (Object)object, (Object)class_2434, (long)7689599164562386416L, (long)l);
                reference var14_13 = (eE.d("\u00c7", (Object)class_2434, (long)7689821030370113968L, (long)l) - 0.08) * 0.98;
                reference var16_14 = eE.d("\u00c7", (Object)class_2434, (long)7676886826743348630L, (long)l) * 0.91;
                reference var18_15 = eE.d("\u00c7", (Object)class_2434, (long)7675641700478927503L, (long)l) * 0.91;
                class_2434 = new class_243((double)var16_14, (double)var14_13, (double)var18_15);
                bl2 = false;
                try {
                    arrayList = arrayList2;
                    if (callSite == null) {
                        eE.d("D", arrayList, (Object)new aD((class_243)object, class_2434, bl2), (long)7675850210345887222L, (long)l);
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)7691656361651919950L, (long)l);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private static class_243 b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = E ^ l;
        float f11 = (float)eE.d("E", (double)f, (long)1998225864036824942L, (long)l);
        float f12 = (float)eE.d("E", (double)f10, (long)1998225864036824942L, (long)l);
        double d = (double)(-eE.d("E", (double)f11, (long)1983298684836600572L, (long)l) * eE.d("E", (double)f12, (long)1998410988667834542L, (long)l));
        double d10 = (double)(-eE.d("E", (double)f12, (long)1983298684836600572L, (long)l));
        double d11 = (double)(eE.d("E", (double)f11, (long)1998410988667834542L, (long)l) * eE.d("E", (double)f12, (long)1998410988667834542L, (long)l));
        CallSite callSite = eE.d("E", (double)(d * d + d10 * d10 + d11 * d11), (long)1982740558307119108L, (long)l);
        try {
            if (callSite < 1.0E-9) {
                return new class_243(0.0, 0.0, 1.0);
            }
        }
        catch (MatchException matchException) {
            throw eE.d("E", (Object)matchException, (long)1981979943999548785L, (long)l);
        }
        return new class_243(d / callSite, d10 / callSite, d11 / callSite);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eE.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1F4C;
        if (G[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])H.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    H.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eE", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = F[n2].getBytes("ISO-8859-1");
            eE.G[n2] = eE.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return G[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eE.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private List c(Object[] objectArray) {
        ArrayList arrayList;
        block8: {
            aD aD2 = (aD)objectArray[0];
            float f = ((Float)objectArray[1]).floatValue();
            float f10 = ((Float)objectArray[2]).floatValue();
            long l = (Long)objectArray[3];
            long l2 = l = E ^ l;
            long l3 = l2 ^ 0xA6FEE8D0E76L;
            long l4 = l2 ^ 0x6030C7355D88L;
            CallSite callSite = eE.c("j", (int)28504, (long)(0x52B6A755EE9E2A94L ^ l));
            CallSite callSite2 = eE.d("E", (long)942550556054340758L, (long)l);
            ArrayList arrayList2 = new ArrayList((int)(callSite + 1));
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l4;
            objectArray2[1] = Float.valueOf(f10);
            objectArray2[0] = Float.valueOf(f);
            CallSite callSite3 = eE.d("E", (Object)objectArray2, (long)942989380861500581L, (long)l);
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = l3;
            objectArray3[3] = aD2.c;
            objectArray3[2] = aD2.b;
            objectArray3[1] = 1.5;
            objectArray3[0] = callSite3;
            CallSite callSite4 = eE.d("E", (Object)objectArray3, (long)949791615136427954L, (long)l);
            Object object = aD2.a;
            eE.d("D", arrayList2, (Object)object, (long)949510024420868701L, (long)l);
            int n = 0;
            while (n < callSite) {
                block9: {
                    object = eE.d("D", (Object)object, (Object)callSite4, (long)945121494283897435L, (long)l);
                    callSite4 = eE.d("D", (Object)eE.d("D", (Object)callSite4, (double)0.99, (long)942423350829592017L, (long)l), (double)0.0, (double)0.03, (double)0.0, (long)941512423085780128L, (long)l);
                    try {
                        try {
                            try {
                                arrayList = arrayList2;
                                if (callSite2 != null) break block8;
                                eE.d("D", arrayList, (Object)object, (long)949510024420868701L, (long)l);
                                if (callSite2 != null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)942677264596974565L, (long)l);
                            }
                            if (eE.d("\u00c7", (Object)object, (long)944898522275683867L, (long)l) < eE.d("\u00c7", (Object)aD2.a, (long)944898522275683867L, (long)l) - 256.0) {
                                break;
                            }
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)942677264596974565L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)942677264596974565L, (long)l);
                    }
                    ++n;
                }
                if (callSite2 == null) continue;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x48C2;
        if (J[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = I[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])K.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    K.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eE.J[n2] = n3;
        }
        return J[n2];
    }

    private aC c(Object[] objectArray) {
        double d;
        int n;
        Object object;
        long l;
        float f;
        float f10;
        int n2;
        block14: {
            Object object2;
            aD aD2 = (aD)objectArray[0];
            List list = (List)objectArray[1];
            n2 = (Integer)objectArray[2];
            f10 = ((Float)objectArray[3]).floatValue();
            f = ((Float)objectArray[4]).floatValue();
            l = (Long)objectArray[5];
            long l2 = (l = E ^ l) ^ 0x17D7B6DCE8ADL;
            reference var12_9 = eE.d("D", (Object)list, (long)6289882207113263229L, (long)l) - n2;
            CallSite callSite = eE.d("E", (long)6287826222538759872L, (long)l);
            try {
                if (var12_9 <= 1) {
                    return null;
                }
            }
            catch (MatchException matchException) {
                throw eE.d("E", (Object)matchException, (long)6287952949270012339L, (long)l);
            }
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = l2;
            objectArray2[3] = (int)var12_9;
            objectArray2[2] = Float.valueOf(f);
            objectArray2[1] = Float.valueOf(f10);
            objectArray2[0] = aD2;
            CallSite callSite2 = eE.d("D", (Object)this, (Object)objectArray2, (long)6288129079768453990L, (long)l);
            object = Double.MAX_VALUE;
            n = n2;
            int n3 = 1;
            while (n3 < eE.d("D", (Object)callSite2, (long)6289882207113263229L, (long)l)) {
                block16: {
                    block17: {
                        int n4 = n2 + n3;
                        try {
                            try {
                                d = n4;
                                if (callSite != null) break block14;
                                if (d >= eE.d("D", (Object)list, (long)6289882207113263229L, (long)l)) {
                                    break;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)6287952949270012339L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)6287952949270012339L, (long)l);
                        }
                        CallSite callSite3 = eE.d("D", (Object)((class_243)eE.d("D", (Object)callSite2, (int)n3, (long)6301711767738565738L, (long)l)), (Object)((class_243)eE.d("D", (Object)list, (int)n4, (long)6301711767738565738L, (long)l)), (long)6289326438245254956L, (long)l);
                        try {
                            if (callSite != null) break block16;
                            if (!(callSite3 < object)) break block17;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)6287952949270012339L, (long)l);
                        }
                        object = callSite3;
                        n = n4;
                    }
                    ++n3;
                }
                if (callSite == null) continue;
            }
            d = (object2 = object - Double.MAX_VALUE) == 0.0 ? 0 : (object2 > 0.0 ? 1 : -1);
        }
        try {
            if (d == false) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw eE.d("E", (Object)matchException, (long)6287952949270012339L, (long)l);
        }
        return new aC(n2, f10, f, (double)eE.d("E", (double)object, (long)6288783946229914822L, (long)l), n);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private dC c(Object[] objectArray) {
        CallSite callSite;
        block2: {
            long l;
            long l2;
            block3: {
                l2 = (Long)objectArray[0];
                long l3 = l2 = E ^ l2;
                long l4 = l3 ^ 0x640B1015B082L;
                l = l3 ^ 0x7FC9EC55C24AL;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l4;
                CallSite callSite2 = eE.d("D", (Object)this, (Object)objectArray2, (long)9215972266404618781L, (long)l2);
                CallSite callSite3 = eE.d("E", (long)9218548310117398124L, (long)l2);
                try {
                    callSite = callSite2;
                    if (callSite3 != null) break block2;
                    if (callSite == null) break block3;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)9218674504338229535L, (long)l2);
                }
                callSite = callSite2;
                break block2;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l;
            callSite = eE.d("D", (Object)this, (Object)objectArray3, (long)9217806828870277753L, (long)l2);
        }
        return callSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eE.m(l, l2);
            object = L[n];
            try {
                if (!(object instanceof String)) break block2;
                eE.L[n] = clazz = Class.forName(M[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = E ^ l) ^ 0x5D05520A5689L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eE.d("D", (Object)eE.d("O", (long)-4784056271046594414L, (long)l), (Object)objectArray2, (long)-4781251496561387575L, (long)l);
        this.x = null;
        this.C = null;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eE.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eE.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eE.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eE.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = L;
        L[0] = "P,bi\u0016\u000bF,g3\u0005\u001cQgd5\t\b@ s\"B\u001a|";
        objectArray[1] = ">yk}\u007f-KY`rnb6Asug+^";
        objectArray[2] = "\f%r\u001bY7\f%eGU8\u0016neYU-\u0011\u001f5\u0004\u0004";
        objectArray[3] = "Ui\u0015?\u0002)Ui\u0002c\u000e&O\"\u0002}\u000e3HSV%Y";
        objectArray[4] = "\u0005bTfi\u000e\u0013bQ<z\u0019\u0004)R:v\r\u0015nE-=\u001a%";
        objectArray[5] = "|\u0013\u001f`\u0004[\t3\u0014o\u0015\u0014h=\u001fd\u0011N\u001c";
        objectArray[6] = Boolean.TYPE;
        eE.M[6] = "java/lang/Boolean";
        objectArray[7] = "\"~a64j\"~vj8e85vt8p?D#+a";
        objectArray[8] = "a\r_O>Rw\rZ\u0015-E`FY\u0013!Qq\u0001N\u0004jG@";
        objectArray[9] = "yZ\u0005?De\fz\u000e0U*mt\u0005;Qp\u0019";
        objectArray[10] = Void.TYPE;
        eE.M[10] = "java/lang/Void";
        objectArray[11] = ";N\u00024M6;N\u0015hA9!\u0005\u0015vA,&tB)\u0017";
        objectArray[12] = "vdZH}\\`d_\u0012nKw/\\\u0014b_fhK\u0003)O~hI\bs\u0002BsI\u0015sEud";
        objectArray[13] = "8a1Qsi.a4\u000b`~9*7\rlj(m \u001a'}\n";
        objectArray[14] = "_pv]]G*P}RL\bK^vYHR?";
        objectArray[15] = "B cw#A7\u0000hx2\u000eV\u000ecs6T\"";
        objectArray[16] = Integer.TYPE;
        eE.M[16] = "java/lang/Integer";
        objectArray[17] = "\u0012B\u0014UjCgb\u001fZ{\f\u0006l\u0014Q\u007fVr";
        objectArray[18] = "9QM_0XLqFP!\u0017-\u007fM[%MY";
        objectArray[19] = "\u0013[O_k\u0012\u0005[J\u0005x\u0005\u0012\u0010I\u0003t\u0011\u0003W^\u0014?\u0006<";
        objectArray[20] = "S\u0006\b:_\u0003X\t\u0019u>\rS\u0002\u001d/";
        objectArray[21] = "3\u0002mnK\u00048\r|!(\t-\u0000sJ\u001d\u000b<\u0013of\n\u0006";
        objectArray[22] = "^fv\u001e54+F}\u0011${JHv\u001a !>";
        objectArray[23] = "b\u00039Vs\u0001i\f(\u0019\u000e\u0019z\u000b!P";
        objectArray[24] = "\n60\u001cMs\n6'@A|\u0010}'^Ai\u0017\fv\u0006\u0013";
        objectArray[25] = Double.TYPE;
        eE.M[25] = "java/lang/Double";
        objectArray[26] = "v\tiqe%\u0003)b~tjb'iup0\u0016";
        objectArray[27] = ">i1\\\u0006e a+\u0013dy'|";
        objectArray[28] = "J`}m\u000fi?@vb\u001e&^N}i\u001a|*";
        objectArray[29] = "\t[jj9>\u001f[o0*)\b\u0010l6&=\u0019W{!m*.";
        objectArray[30] = "9}0lPQL];cA\u001e-S0hEDY";
        objectArray[31] = Float.TYPE;
        eE.M[31] = "java/lang/Float";
        objectArray[32] = "1$$\u001eV*D\u0004/\u0011Ge%\n$\u001aC?Q";
        objectArray[33] = "X_\\IYO-\u007fWFH\u0000Lq\\MLZ8";
        objectArray[34] = "\u001dX\u0010:~\u0004\u000bX\u0015`m\u0013\u001c\u0013\u0016fa\u0007\rT\u0001q*\u0015:";
        objectArray[35] = "J\u001dpw~\f?={xoC^3psk\u0019*";
        objectArray[36] = "'\u001bUz\u0003,R;^u\u0012c35U~\u00169G";
        objectArray[37] = "c$zi\u0012\u001b},`&o\u000b}";
        objectArray[38] = "(\u007f1#\u0005Q]_:,\u0014\u001e<Q1'\u0010DH";
        objectArray[39] = "\u001dD\u0005h\u0011\u000e\u000bD\u00002\u0002\u0019\u001c\u000f\u00034\u000e\r\rH\u0014#E\u001a>";
        objectArray[40] = "\u0003H=\u001bYFvh6\u0014H\t\u0017f=\u001fLSc";
        objectArray[41] = "z\u001f\u001aiZ@\u000f?\u0011fK\u000fn1\u001amOU\u001a";
        objectArray[42] = "\u0005\u0013mV\u00067p3fY\u0017x\u0011=mR\u0013\"e";
        objectArray[43] = "JOw\u001c\u001cM\\OrF\u000fZK\u0004q@\u0003NZCfWH[\u001b";
        objectArray[44] = "I\fYiJ\u0012<,Rf[]]\"Ym_\u0007)";
        objectArray[45] = "jc\u001bU\u0004 \u001fC\u0010Z\u0015o~M\u001bQ\u00115\n";
        objectArray[46] = "z@1]\r)\u000f`:R\u001cfnn1Y\u0018<\u001a";
        objectArray[47] = "6neo\\*=at 4*3ng";
        objectArray[48] = "8\u0015`r*rM5k};=,;`v?gX";
        objectArray[49] = "\u001a\u0010[\r(\u0015\u0011\u001fJBD\u0016\u001f\u001dH\rh";
        objectArray[50] = "8pG<y\u007f3\u007fVs\u001ar&y";
        objectArray[51] = "ElajP\u0002Elv6\\\r_'v(\\\u0018XV&q\u000eY";
        objectArray[52] = "4uKH bAU@G1- [KL5wT";
        objectArray[53] = "1i;\u001f\u0015\u0000DI0\u0010\u0004O%G;\u001b\u0000\u0015Q";
        objectArray[54] = "e3^\u0015\u0010c\u0010\u0013U\u001a\u0001,q\u001d^\u0011\u0005v\u0005";
        objectArray[55] = "V8Co\u0018 #\u0018H`\toB\u0016Ck\r56";
        objectArray[56] = "F\u0017\u0019\u001by137\u0012\u0014h~R9\u0019\u001fl$&";
        objectArray[57] = "F\u000b$\u0000\ng3+/\u000f\u001b(R%$\u0004\u001fr&";
        objectArray[58] = "PT\u000buf@%t\u0000zw\u000fDz\u000bqsU0";
        objectArray[59] = "\\&Xq1])\u0006S~ \u0012H\bXu$H<";
        objectArray[60] = "nMGs)q\u001bmL|8>zcGw<d\u000e";
        objectArray[61] = "TpYJZOBp\\\u0010IXU;_\u0016ELD|H\u0001\u000e]T";
        objectArray[62] = "\u000e&Yd\fq{\u0006Rk\u001d>\u001a\bY`\u0019dn";
        objectArray[63] = "NpxoHN;Ps`Y\u0001Z^xk][.";
        objectArray[64] = "0+|\rR=E\u000bw\u0002Cr$\u0005|\tG(P";
        objectArray[65] = "h\u001aup\"[~\u001ap*1LiQs,=Xx\u0016d;vR";
        objectArray[66] = "F0\u0000q\u001ftF0\u0017-\u0013{\\{\u00173\u0013n[\nEhK$";
        objectArray[67] = "c6@\u0012|\u0015u6EHo\u0002b}FNc\u0016s:QY(\u0006u";
        objectArray[68] = "m0v4\b\u0001\u0018\u0010};\u0019Ny\u001ev0\u001d\u0014\r";
        objectArray[69] = "YDBsl&YDU/`)C\u000fU1`<D~\u0007j8}";
        objectArray[70] = "\u001c\u001bp\u000b\u001a#\u001c\u001bgW\u0016,\u0006PgI\u00169\u0001!5\u001dGx";
        objectArray[71] = "zuV\u007fDtzuA#H{`>A=HngO\u0013g\u001f,";
        objectArray[72] = "\u0012:0F^,\f2*\t\u0016,\u001682N\u001f7V\u000b4B\u00140\u001b:2B";
        objectArray[73] = "e^G\u000eM\u0010\u0010~L\u0001\\_qpG\nX\u0005\u0005";
        objectArray[74] = "Hs*,\u0018d^s/v\u000bsI8,p\u0007gX\u007f;gL\u007f";
        objectArray[75] = "MmX+_Q8MS$N\u001eYCX/JD-";
        objectArray[76] = " i\u000fp\u001b<UI\u0004\u007f\ns4G\u000ft\u000e)@";
        objectArray[77] = "\u0005\u0019GO\u000e6\u0013\u0019B\u0015\u001d!\u0004RA\u0013\u00115\u0015\u0015V\u0004Z%\u000e";
        objectArray[78] = "FX8[\f\"3x3T\u001dmRv8_\u00197&";
        objectArray[79] = "Q7\u001bpCP$\u0017\u0010\u007fR\u001fE\u0019\u001btVE1";
        objectArray[80] = "\tr#\u0017{N\tr4KwA\u001394UwT\u0014Hf\u000b \u001f";
        objectArray[81] = "\u0004mnPe#Kh~ZZ*93|]7=\bu$\u0000k'9irZ(&Ggl\u000f7A";
        objectArray[82] = "s\u0011\u007f\u007fMMr\u00178x5\u0019(E!.bNv\u0012yB\u000f\u001a3A!}XL'C";
        objectArray[83] = "L8I\u0015\u0000\u0002\u0003=Y\u001f?\nqf[\u0018R\u001c@ \u0003E\u000e\u0006q<U\u001fM\u0007\u000f2KJR`";
        objectArray[84] = "X\u0017Q./EL\u001c\u0015tD\u001d%BIs)\b\u0014\u0004\u0011.u\u0012%G@)+\u0013E\u0016D)\u007ft";
        objectArray[85] = "7VIN}\bm^\u001f\u0001\u0019\u000f:\u001aO\u0014u=n^\u0015N\u0019\ng\u0000\u0012\u0017{PoV]sy\u0016/X\u0013\u001a Q1\u000f/";
        objectArray[86] = "}5QgAE=3Sz8MF3\u000f7UXwuWj\tBF6\u0006mWC&g\u0002m\u0003$";
        objectArray[87] = "tm_,;\u000216L2e=&\r\u00196gP1<_n:\f+\r\u001c?=R*mM;=\u0006M";
        objectArray[88] = "z\nGm\u0010\u0001{\f\u0000jhU!^\u0019<?\u0002\u007f\u000e@PX\u0003$K\u001a(\u000f\n{O";
        objectArray[89] = "\u0014V'8FsUH`?:#%\n\u007f8W6\u0014L'e\u000b,%\f!tF*DJq>JJ";
        objectArray[90] = "\u0012a<\u0010\u0014PHij_pW\u001f-:J\u001ceKic\u001cpRB7gI\u0012\bJa(-\u0010\u0002\u0014l>OJ\nB#Z";
        objectArray[91] = "vhC?.&=.T-J#{|[hJ*{m\u0003n#s<sTR*6\u007f+\u0001;sqa|=2629)Tkq,n\u0015";
        objectArray[92] = "\u0007WG48`]_\u0011{\\g\n\u001bAn0U^_\u001b1\\bW\u0001\u001cm>8_WS\t<2\u0001ZEkf:W\u0015!";
        objectArray[93] = "\u0015)\u0014?T\u0011\fi\u001155\f\u0015&@T_FD2Bn\u000b\u0012\fk-";
        objectArray[94] = "\"\u001e\t?n\u0017uH\u001d=\nMu\u000f\u00131f\u007f#MOk4(|\u0015\b+wW\"\u001f\u001a*\n\u0017$\u0002\u000f6kQtH\u0003V";
        objectArray[95] = "-Dq#NfwL'l*j,\u0019sr}=vI.\u001eJx5J+w\u0013?+\u001d";
        objectArray[96] = "\u0001jXiXs\u0004~E.\u0015\r@\u0003\u001bvX`D2].\u0005<^\u0003\u001e\u007f\u0002b_cO{\u000268";
        objectArray[97] = "Xi\u0013\u001aXsYoT\u001d ,\u000f,I@L\u001e[m\u0017\u0016 u\t7F@@$\r7\u0012'";
        objectArray[98] = "\"\u001a\u007f\u001770x\u0012)XS7/VyM?\u0005{\u0012\"\u0013S2>R'\u0016:kyLp*3.:\u0014%Cji$C\u0019J/*|\u0016p\u0013h4+*y\u001a5o&H#\u0012c B";
        objectArray[99] = "r\u001fcjM52\u0019aw4?I\u0019=:Y(x_eg\u00052I\u001fcvH4(Y3<DT";
        objectArray[100] = "\u001d~JWB1R{Z]}6  XZ\u0010/\u0011f\u0000\u0007L5 &\u0006\u0016\u00013A`V\\\rS";
        objectArray[101] = "XM~\u001a>_V@~\u001fPTGLq\u0018<f\u0013\r*@l1JLiAlX\u0013\u000bw\u0016PULKl\u0002/\u000bFYm\u007f";
        objectArray[102] = "U\u0002\u00173,!\u0015\u0004\u0015.U+n\u0004Ic8<_B\u0011>d&n\u0001@9:'\u000ePD9n@";
        objectArray[103] = "Sq1P\u0017z\u001ct!Z(qn/#]Ed_i{\u0000\u0019~n**\u0007G\u007f\u000e{.\u0007\u0013\u0018";
        objectArray[104] = "f#6q0Zh=cnWN\u0005vn>:X406cfB\u0005+jx*Yzu`j+$";
        objectArray[105] = "\r]u5:\u0010M[w(C\u001b6[+e.\r\u0007\u001ds8r\u00176^\"?,\u0016V\u000f&?xq";
        objectArray[106] = "n\bU\u001b\u0001v4\u0000\u0003TeqcDSA\tC7\u0000\t\u0019etr@\r\u001a\f-5^Z&";
        objectArray[107] = "\u0015u\n\u0019m\u0018\u0012'\b\\f(Ka\u0006B1AH\u001b\u0000\u0012gNC!TF/\u0017,";
        objectArray[108] = "\n\u0013o\u0006\u0007\\\u0018\u00073XzV\u001c\u001f:[\u0013Z%\u0011:K\u0017<G\u00139Y\u001d\\\u0016\u00179\rz";
        objectArray[109] = "\u0003\u0007.!48HA93P/\u000b\u0000,L0(\nDl%io\u0014\u0013P,,,LF9uk2\u001bz";
        objectArray[110] = "\u001d)\u0019\u0012Sr\t\"]H8*`|\u0001OU?Q:Y\u0012\t%`!\u0005\tE>\u001f\u007f\u000f\u001bDC";
        objectArray[111] = "M4CFf\u0018\u0017<\u0015\t\u0002\u001f@xE\u001cn-\u0014<\u001f@\u0002\u001aQ|\u001bGkC\u0016bL{b\u0006U:\u0019\u0012;AKm%\u001b~\u0002\u00138LB9\u001cD\u0004EKdGIf\u001fC2\b-";
        objectArray[112] = "g\rH\u0019\u00120(\bX\u0013-;ZSZ\u0014@.k\u0015\u0002I\u001c4Z\u0000\t\u0019K=`T]Q\u0012R";
        objectArray[113] = "&OY2\u001a\riJI8%\f\u001b\u0011K?H\u0013*W\u0013b\u0014\t\u001b\u0017\u0015sY\u000fzQE9Uo";
        objectArray[114] = "x\u0002\u000bLvB3D\u001c^\u0012Gc\u0004uEtUt\u0002\n\u001b~Gu\u007f\u0011GiSt\u0000OM{R\t";
        objectArray[115] = "X<J\u0001gX_?I\f&d\u0004=\t\u0010}\b6mIK*d\u000baE\u0016u^_5\rO\u001a]P)\u000b\u001f+\u0002\u001ak\u000eM\u001a";
        objectArray[116] = "%y\u0006xH`j|\u0016rwh\u0018'\u0014u\u001a~)aL(Fd\u0018~F.Jfz$Nx\u0005\u0002";
        objectArray[117] = "xM.0;#7H>:\u0004-E\u0013<=i=tUd`5'EI2:v&;G,oiA";
        objectArray[118] = "c&<\u0011<pkt%\u0004^f\u000fz:\u001a:ohs-\u001b.\u000f";
        objectArray[119] = "q2\u0006\u001d'I&d\u0012\u001fC\u0013&#\u001c\u0013/!qcLNsvw4\u001b\u001b$\u0016&0\u001bOC";
        objectArray[120] = "K\u000b\u0010<\fV\u0004\u000e\u000063]v\u0001\u001e}\n\u0005OW\u00024\t4\u001b\u0012\u00115\u0002\rM\u000eX63";
        objectArray[121] = "v#A\bf_$wX\u0013\rI`0L\u001dv$t \\\u001dmC}7]\t\r\u0018r*J\u001emIv*\u001ey";
        objectArray[122] = "p\u0017L\u0004HX?\u0012\\\u000ewVMI^\t\u001aF|\u000f\u0006TF\\M\u0011A\r\u001c[+\b\u0001\b\u0016:";
        objectArray[123] = "rJ9\u00050K%\u001c-\u0007T\u0011%[#\u000b8#s\u0019\u007fQkt,A8\u0011)\u000brK*\u0010TKtV?\f5\r$\u001c3l";
        objectArray[124] = "\"[X\u0005q\\xS\u000eJ\u0015[/\u0017^_yi{S\u0004\u0001\u0015^>\u0013\u0000\u0004|\u0007y\rW8u\u000e$VZZ/\u0006r\u0019>";
        objectArray[125] = "C9B\u0006}>\u0014oV\u0004\u0019d\u0014(X\buVBo\u0005P \u0001\u0019d^R}cCl\b\u001d\u0019";
        objectArray[126] = "m\u0001m\u0000'$*\u0016;mq\u0015iM{\u001fg\u007f(\u001d|\u0017\u001b";
        objectArray[127] = "\rbmm\u0000\u0019\fd*jxMV63</\u001a\tkhPENW9mo\u001dGN%";
        objectArray[128] = "fJ\u001fEzf'TXB\u00066W\u0013N\u001fi87BJ\u001f=_";
        objectArray[129] = "\u001a|1\u0019E\u000bX)!O+\u0003`+<BF\u0015Qmd\u001f\u001a\u000f`v8\u0004V\u0014\u001f(2\u0016Wi";
        objectArray[130] = "\f\u0005d#~8C\u0000t)A<1[v.,&\u0000\u001d.sp<1](b=:P\u001bx(1Z";
        objectArray[131] = "?}\u0013V$~`7QSvOc!\u0016H,#Qs[\u0010zO?'SNr1e|\u0011P$O";
        objectArray[132] = "Bt\u0018XOv\rq\bRp\u007f\u007f*\nU\u001dhNlR\bAr\u007ftQ\u000eNp\u0002|\u0003\u000e\u000f\u0014";
        objectArray[133] = ",/f\u0018GAse$\u001d\u0015ppsc\u0006O\u001cB!.X\u0010p)ux\tO\u0010xqx](";
        objectArray[134] = "t(J\u001bqB;-Z\u0011NJIvX\u0016#\\x0\u0000K\u007fFI(\u0003MpD4 QM1 ";
        objectArray[135] = " \n\u000eC\u0010S`\f\f^i\\\u001b\fP\u0013\u0004N*J\bNXT\u001b\n\u000e_\u0015RzL^\u0015\u00192";
        objectArray[136] = "Hv\u0010@l\u0010\u0018 D]\u007f)\u001f{@Ir~A$\u0016\u0011\u001e\u0010\u001a#K\u0014`JAaUB";
        objectArray[137] = "V)/J\u000eM\u0016&-[\u001b?\u0001*\"G\thR{w\u0013e\u0006\r+&H\u0017F\u0002)7]";
        objectArray[138] = "vn[O9@9kKE\u0006FK0IBk^zv\u0011\u001f7DK6\u0017\u000ezB*pGDv\"";
        objectArray[139] = ";\u000eWgMYlXCe)\u0003l\u001fMiE1:Z\u00102\u0019f8\u000f\u0012\u007fTZ?\f\u0011r\u0015f";
        objectArray[140] = "\u001e\u0017$ f(Q\u00124*Y&#I6-46\u0012\u000fnph,#L?w6-C\u001d;wbJ";
        objectArray[141] = "C9dV%\u0012\u000bv3\b=(\u0011\u00074TqE\u00066r\f,\u0019\u001c\u00072\n=T\u001aftZwXz";
        objectArray[142] = "ky23\u0015\u0011\u007frvi~I\u0016,*n\u0013\\'jr3OF\u0016*t\"\u0002@wl$h\u000e ";
        objectArray[143] = "XSh0\u0019W\u000f\u0005|2}\r\u000fBr>\u0011?Y\u0000.dAh\u0006Xi$\u0000\u0017XR{%}";
        objectArray[144] = "o}\u0016ibk/{\u0014t\u001bfT{H9vve=\u0010d*lT~Actm4/Ec \n";
        objectArray[145] = "zb\b\u001evV1$\u001f\f\u0012FlE\u001f\u001fsSmdv\u0013nB5#\u001fJ)\\b\u001f\u0016\u000fj\u00047vOHtS\u000b";
        objectArray[146] = "H\u001aW_lCF\u0017WZ\u0002HW\u001bX]nz\u0003Z\u0003\u00048-Z\u001b@\u0004>D\u0003\\^S\u0002I\\\u001cEG}\u0017V\u000eD:";
        objectArray[147] = "{)G{\u0018$0oPi|4m\u0018Ty\u0006%g/9v\u000004hP/G.cTYj\u0004v6=\u0000-\u001a!\n";
        objectArray[148] = "cc\u001f\u0014\u007f\u00189kI[\u001b\u0014b>\u001dELC8nA){\u0006{mE@\"Ae:";
        objectArray[149] = "Sgz|\u001dt\u001cbjv\"\u007fn9hqOj_\u007f0,\u0013pn`:*\u001fr\f:2|P\u0016";
        objectArray[150] = "\t\u0011`{ #I\u0017bfY/2\u0017>+4>\u0003Qfvh$2\u0011`g%\"SW0-)B";
        objectArray[151] = "tmM R\u0013#;Y\"6I#|W.Z{u>\u000bt\u000b,*fL4KStl^56";
        objectArray[152] = "mm\u0013v=\\%\"D(%f>SCti\u000b(b\u0005,4W2SE*%\u001a42\u0003zo\u0016T";
        objectArray[153] = "\u0003@_ijU\u001a\u0000Zc\u000bZ\u000eQfofJ\u0006]\u0001fqK\u0012=Zil\\\u0005]\u000bml\bb";
        objectArray[154] = "r_nX\u001ey%\tzZz#%NtV\u0016\u0011q\u0002+\u0000JF(\u0002r\f\u001e$r\n$Cz";
        objectArray[155] = "\u0010\u000bZ52zG\u001dIw\u000bw W\n1fiA\u0017\f3{";
        objectArray[156] = "\u00042\u0003qjl\n,Vn\r{gg[>`nV!\u0003c<tg:_xpo\u0018dUjq\u0012";
        objectArray[157] = "M^1}p<HJ,:=B\u001d7rbp/\b\u00064:-s\u00127t<<>\u0014V2lv2t";
        objectArray[158] = " \u001f\u0017%b#o\u001a\u0007/](\u001dA\u0005(0=,\u0007]ul'\u001d\u001f^sc%`\u0017\fs\"A";
        objectArray[159] = "\u000b[&w-\u0005D^6}\u0012\n6\u00054z\u007f\u001b\u0007Cl'#\u00016_:}`\u0000HQ$(\u007fg";
        objectArray[160] = "g>\u000fr\n[(;\u001fx5SZ`\u001d\u007fXEk&E\"\u0004_Z8\u0002{^X<!B~T9";
        objectArray[161] = "1j0..s5m39Lf&U%*5e(2,=4qH,w?%c:(p<2\u0001";
        objectArray[162] = "l&>Lt|`{9V\u0019(x\u007f9LG/xe=0} ge-O#*udP";
        objectArray[163] = "ys[+@:6vK!\u007f:D-I&\u0012$uk\u0011{N>D+\u0017j\u00038%mG \u000fX";
        objectArray[164] = "aCUN\u0002\u0006.FED=\u000f\\\u001dGCP\u0018m[\u001f\u001e\f\u0002\\EXGV\u0005:\\\u0018B\\d";
        objectArray[165] = ":g3\u0018~F#'6\u0012\u001fO6f\n\u0019.\u0010=u0MzXd\u001ag\u001efD;}n\tgP[";
        objectArray[166] = "<5l DZf=:o V=hnqw\u0001g80\u001d@D$;6t\u0019\u0003:l";
        objectArray[167] = ">\u0006\u00042B5y\u0011R_\u0017\u0004:\u0015T2\u00025|M\tn\u0018\u0004:FX4A>z\u001dP<\u0011\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[168] = "N=]..\u001c\u000fk^osv\u000b=Gl\u0012\u001b\u001a)Xpu\u0012\r(L\u0010.\u001d\u0010?[p\u007f\u0019\u0010k<";
    }

    /*
     * Exception decompiling
     */
    private void l(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 20[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eE.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x5EEF097F86EL;
        long l4 = l2 ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        eE.d("D", (Object)this, (Object)objectArray2, (long)3255727837802244705L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this;
        eE.d("D", (Object)eE.d("O", (long)3251785695538192425L, (long)l), (Object)objectArray3, (long)3252670133151931610L, (long)l);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == '\u00d5' || c == 'O' || c == '\u00fb') {
                field = eE.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eE.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'D' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private List d(Object[] objectArray) {
        ArrayList arrayList;
        block4: {
            aD aD2 = (aD)objectArray[0];
            float f = ((Float)objectArray[1]).floatValue();
            float f10 = ((Float)objectArray[2]).floatValue();
            int n = (Integer)objectArray[3];
            long l = (Long)objectArray[4];
            long l2 = l = E ^ l;
            long l3 = l2 ^ 0x5E2EFCF5F791L;
            long l4 = l2 ^ 0x3471D54DA46FL;
            ArrayList arrayList2 = new ArrayList(n + 1);
            CallSite callSite = eE.d("E", (long)-796071717107679887L, (long)l);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l4;
            objectArray2[1] = Float.valueOf(f10);
            objectArray2[0] = Float.valueOf(f);
            CallSite callSite2 = eE.d("E", (Object)objectArray2, (long)-796715361489656510L, (long)l);
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = l3;
            objectArray3[3] = aD2.c;
            objectArray3[2] = aD2.b;
            objectArray3[1] = 1.5;
            objectArray3[0] = callSite2;
            CallSite callSite3 = eE.d("E", (Object)objectArray3, (long)-808112252876941739L, (long)l);
            Object object = aD2.a;
            eE.d("D", arrayList2, (Object)object, (long)-807830884441932870L, (long)l);
            for (int i = 0; i < n; ++i) {
                object = eE.d("D", (Object)object, (Object)callSite3, (long)-794064287712136260L, (long)l);
                callSite3 = eE.d("D", (Object)callSite3, (double)0.99, (long)-796154951053880266L, (long)l);
                try {
                    arrayList = arrayList2;
                    if (callSite == null) {
                        eE.d("D", arrayList, (Object)object, (long)-807830884441932870L, (long)l);
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)-796473323958877694L, (long)l);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private boolean d(Object[] objectArray) {
        int n;
        CallSite callSite;
        long l;
        long l2;
        long l3;
        block14: {
            int n2;
            block15: {
                int n3;
                block13: {
                    block16: {
                        CallSite callSite2;
                        block17: {
                            long l4;
                            dC dC2;
                            block12: {
                                Object object;
                                block11: {
                                    n2 = (Integer)objectArray[0];
                                    dC2 = (dC)objectArray[1];
                                    l3 = (Long)objectArray[2];
                                    long l5 = l3 = E ^ l3;
                                    l2 = l5 ^ 0x3D026B804725L;
                                    l = l5 ^ 0xD02829CBA70L;
                                    l4 = l5 ^ 0x55819590A425L;
                                    callSite2 = eE.d("E", (long)-7111863550864665393L, (long)l3);
                                    try {
                                        object = eE.d("D", (Object)eE.d("O", (long)-7100827512062111619L, (long)l3), (Object)new Object[0], (long)-7100487324534338368L, (long)l3);
                                        if (callSite2 != null) break block11;
                                        if (object == false) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw eE.d("E", (Object)matchException, (long)-7112302559364305988L, (long)l3);
                                    }
                                    object = 0;
                                }
                                return (boolean)object;
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l4;
                            objectArray2[0] = dC2;
                            callSite = eE.d("D", (Object)this, (Object)objectArray2, (long)-7100504637493349001L, (long)l3);
                            n3 = this.y;
                            if (callSite2 != null) break block13;
                            if (n3 == 0) break block16;
                            break block17;
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)-7112302559364305988L, (long)l3);
                            }
                        }
                        try {
                            block18: {
                                n = this.A;
                                if (callSite2 != null) break block14;
                                break block18;
                                catch (MatchException matchException) {
                                    throw eE.d("E", (Object)matchException, (long)-7112302559364305988L, (long)l3);
                                }
                            }
                            if (n == 0) break block15;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-7112302559364305988L, (long)l3);
                        }
                    }
                    n3 = 0;
                }
                return n3 != 0;
            }
            n = n2;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = n;
        eE.d("E", (Object)objectArray3, (long)-7100695343522366842L, (long)l3);
        CallSite callSite3 = eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7113853133252661388L, (long)l3), (long)-7101623328360901202L, (long)l3);
        CallSite callSite4 = eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7113853133252661388L, (long)l3), (long)-7099972903524340460L, (long)l3);
        try {
            eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7113853133252661388L, (long)l3), (float)eE.d("D", (Object)callSite, (Object)new Object[0], (long)-7100756248336988905L, (long)l3), (long)-7114123174044741993L, (long)l3);
            eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7113853133252661388L, (long)l3), (float)eE.d("D", (Object)callSite, (Object)new Object[0], (long)-7113384352943382656L, (long)l3), (long)-7112087901379337023L, (long)l3);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l;
            objectArray4[0] = eE.d("O", (long)-7102097014418267026L, (long)l3);
            CallSite callSite5 = eE.d("E", (Object)objectArray4, (long)-7113452259170313927L, (long)l3);
            this.A = 1;
            CallSite callSite6 = callSite5;
            return (boolean)callSite6;
        }
        finally {
            eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7113853133252661388L, (long)l3), (float)callSite3, (long)-7114123174044741993L, (long)l3);
            eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7113853133252661388L, (long)l3), (float)callSite4, (long)-7112087901379337023L, (long)l3);
        }
    }

    private dC d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = E ^ l;
        return new dC((float)eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-669992795844410239L, (long)l), (long)-683203079484948901L, (long)l), (float)eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-669992795844410239L, (long)l), (long)-683732281575405855L, (long)l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bd_0 var1_1) {
        block41: {
            block37: {
                block39: {
                    block40: {
                        block38: {
                            block35: {
                                block36: {
                                    block33: {
                                        block34: {
                                            block32: {
                                                block29: {
                                                    block30: {
                                                        block31: {
                                                            v0 = var2_2 = eE.E ^ 112485549899857L;
                                                            var4_3 = v0 ^ 81490867442664L;
                                                            var6_4 = v0 ^ 50141821156844L;
                                                            var8_5 = v0 ^ 10347059387617L;
                                                            var10_6 = v0 ^ 119896408945849L;
                                                            var12_7 = eE.d("E", (long)-3795713146271071536L, (long)var2_2);
                                                            try {
                                                                if (this.x == null) {
                                                                    return;
                                                                }
                                                            }
                                                            catch (MatchException v1) {
                                                                throw eE.d("E", (Object)v1, (long)-3795557810755895901L, (long)var2_2);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        v2 = eE.d("D", (Object)var1_1, (Object)new Object[0], (long)-3790714397514172962L, (long)var2_2);
                                                                        v3 = y_0.PRE;
                                                                        if (var12_7 != null) break block29;
                                                                        if (v2 != v3) break block30;
                                                                    }
                                                                    catch (MatchException v4) {
                                                                        throw eE.d("E", (Object)v4, (long)-3795557810755895901L, (long)var2_2);
                                                                    }
                                                                    v5 = new Object[3];
                                                                    v5[2] = var4_3;
                                                                    v5[1] = this.x;
                                                                    v5[0] = this;
                                                                    if (eE.d("D", (Object)eE.d("O", (long)-3788736503578507678L, (long)var2_2), (Object)v5, (long)-3794055687784863975L, (long)var2_2) != false) break block31;
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw eE.d("E", (Object)v6, (long)-3795557810755895901L, (long)var2_2);
                                                                }
                                                                this.z = 0;
                                                                return;
                                                            }
                                                            catch (MatchException v7) {
                                                                throw eE.d("E", (Object)v7, (long)-3795557810755895901L, (long)var2_2);
                                                            }
                                                        }
                                                        eE.d("D", (Object)var1_1, (Object)new Object[]{Float.valueOf((float)eE.d("D", (Object)this.x, (Object)new Object[0], (long)-3789087396483607800L, (long)var2_2))}, (long)-3788835779454498342L, (long)var2_2);
                                                        eE.d("D", (Object)var1_1, (Object)new Object[]{Float.valueOf((float)eE.d("D", (Object)this.x, (Object)new Object[0], (long)-3794475820749256289L, (long)var2_2))}, (long)-3788053213380041482L, (long)var2_2);
                                                        this.z = 1;
                                                        return;
                                                    }
                                                    v2 = eE.d("D", (Object)var1_1, (Object)new Object[0], (long)-3790714397514172962L, (long)var2_2);
                                                    v3 = y_0.POST;
                                                }
                                                try {
                                                    try {
                                                        if (v2 != v3) break block32;
                                                        v8 /* !! */  = this.z;
                                                        if (var12_7 != null) break block33;
                                                    }
                                                    catch (MatchException v9) {
                                                        throw eE.d("E", (Object)v9, (long)-3795557810755895901L, (long)var2_2);
                                                    }
                                                    if (v8 /* !! */ ) break block34;
                                                }
                                                catch (MatchException v10) {
                                                    throw eE.d("E", (Object)v10, (long)-3795557810755895901L, (long)var2_2);
                                                }
                                            }
                                            return;
                                        }
                                        this.z = 0;
                                        v11 = new Object[2];
                                        v11[1] = var10_6;
                                        v11[0] = this;
                                        v8 /* !! */  = eE.d("D", (Object)eE.d("O", (long)-3788736503578507678L, (long)var2_2), (Object)v11, (long)-3794551205825991631L, (long)var2_2);
                                    }
                                    try {
                                        if (var12_7 != null) break block35;
                                        if (v8 /* !! */ ) break block36;
                                    }
                                    catch (MatchException v12) {
                                        throw eE.d("E", (Object)v12, (long)-3795557810755895901L, (long)var2_2);
                                    }
                                    return;
                                }
                                try {
                                    v13 = this;
                                    if (var12_7 != null) break block37;
                                    v8 /* !! */  = v13.A;
                                }
                                catch (MatchException v14) {
                                    throw eE.d("E", (Object)v14, (long)-3795557810755895901L, (long)var2_2);
                                }
                            }
                            if (!v8 /* !! */ ) ** GOTO lbl119
                            var13_8 = this.B;
                            try {
                                try {
                                    try {
                                        v15 = new Object[1];
                                        v15[0] = var6_4;
                                        eE.d("D", (Object)this, (Object)v15, (long)-3788094387617354603L, (long)var2_2);
                                        v16 /* !! */  = var13_8;
                                        if (var12_7 != null) break block38;
                                        if (!v16 /* !! */ ) break block39;
                                    }
                                    catch (MatchException v17) {
                                        throw eE.d("E", (Object)v17, (long)-3795557810755895901L, (long)var2_2);
                                    }
                                    v18 = this;
                                    if (var12_7 != null) break block40;
                                }
                                catch (MatchException v19) {
                                    throw eE.d("E", (Object)v19, (long)-3795557810755895901L, (long)var2_2);
                                }
                                v16 /* !! */  = eE.d("D", (Object)v18, (long)-3788255767116961341L, (long)var2_2);
                            }
                            catch (MatchException v20) {
                                throw eE.d("E", (Object)v20, (long)-3795557810755895901L, (long)var2_2);
                            }
                        }
                        if (!v16 /* !! */ ) break block39;
                        v18 = this;
                    }
                    v21 = new Object[1];
                    v21[0] = var8_5;
                    eE.d("D", (Object)v18, (Object)v21, (long)-3793407527351521642L, (long)var2_2);
                }
                try {
                    if (var12_7 == null) break block41;
lbl119:
                    // 2 sources

                    v13 = this;
                }
                catch (MatchException v22) {
                    throw eE.d("E", (Object)v22, (long)-3795557810755895901L, (long)var2_2);
                }
            }
            v13.y = 1;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block82: {
            block80: {
                block78: {
                    block79: {
                        block74: {
                            block77: {
                                block76: {
                                    block72: {
                                        block73: {
                                            block75: {
                                                block70: {
                                                    block71: {
                                                        block68: {
                                                            block83: {
                                                                block69: {
                                                                    block66: {
                                                                        block65: {
                                                                            block64: {
                                                                                block63: {
                                                                                    block62: {
                                                                                        v0 = var2_2 = eE.E ^ 24001072585660L;
                                                                                        var4_3 = v0 ^ 103357165954561L;
                                                                                        var6_4 = v0 ^ 30424330654687L;
                                                                                        var8_5 = v0 ^ 135184742991628L;
                                                                                        var10_6 = v0 ^ 118272429868488L;
                                                                                        var12_7 = v0 ^ 25651644678352L;
                                                                                        var14_8 = v0 ^ 112603279335352L;
                                                                                        var16_9 = v0 ^ 63762298514653L;
                                                                                        var18_10 = eE.d("E", (long)-8016521019178952387L, (long)var2_2);
                                                                                        try {
                                                                                            try {
                                                                                                v1 = this;
                                                                                                if (var18_10 != null) break block62;
                                                                                                if (v1.D == eE.d("\u00c7", (Object)eE.b, (long)-8016415573342251289L, (long)var2_2)) break block63;
                                                                                            }
                                                                                            catch (MatchException v2) {
                                                                                                throw eE.d("E", (Object)v2, (long)-8016957239112358322L, (long)var2_2);
                                                                                            }
                                                                                            v1 = this;
                                                                                        }
                                                                                        catch (MatchException v3) {
                                                                                            throw eE.d("E", (Object)v3, (long)-8016957239112358322L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    v4 = new Object[1];
                                                                                    v4[0] = var10_6;
                                                                                    eE.d("D", (Object)v1, (Object)v4, (long)-8031953024346679353L, (long)var2_2);
                                                                                }
                                                                                try {
                                                                                    v5 = new Object[1];
                                                                                    v5[0] = var6_4;
                                                                                    if (eE.d("D", (Object)eE.d("O", (long)-8032513382357885553L, (long)var2_2), (Object)v5, (long)-8018212245384794425L, (long)var2_2) == false) {
                                                                                        v6 = new Object[1];
                                                                                        v6[0] = var10_6;
                                                                                        eE.d("D", (Object)this, (Object)v6, (long)-8031953024346679353L, (long)var2_2);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                catch (MatchException v7) {
                                                                                    throw eE.d("E", (Object)v7, (long)-8016957239112358322L, (long)var2_2);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        v8 = eE.b;
                                                                                        if (var18_10 != null) break block64;
                                                                                        if (eE.d("\u00c7", (Object)v8, (long)-8019634296997813626L, (long)var2_2) != null) {
                                                                                        }
                                                                                        ** GOTO lbl83
                                                                                    }
                                                                                    catch (MatchException v9) {
                                                                                        throw eE.d("E", (Object)v9, (long)-8016957239112358322L, (long)var2_2);
                                                                                    }
                                                                                    v8 = eE.b;
                                                                                }
                                                                                catch (MatchException v10) {
                                                                                    throw eE.d("E", (Object)v10, (long)-8016957239112358322L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var18_10 != null) break block65;
                                                                                    if (eE.d("\u00c7", (Object)v8, (long)-8016415573342251289L, (long)var2_2) != null) {
                                                                                    }
                                                                                    ** GOTO lbl83
                                                                                }
                                                                                catch (MatchException v11) {
                                                                                    throw eE.d("E", (Object)v11, (long)-8016957239112358322L, (long)var2_2);
                                                                                }
                                                                                v8 = eE.b;
                                                                            }
                                                                            catch (MatchException v12) {
                                                                                throw eE.d("E", (Object)v12, (long)-8016957239112358322L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                block67: {
                                                                                    try {
                                                                                        try {
                                                                                            v13 /* !! */  = eE.d("D", (Object)v8, (long)-8018555662792854529L, (long)var2_2);
                                                                                            if (var18_10 != null) break block66;
                                                                                            if (!v13 /* !! */ ) break block67;
                                                                                        }
                                                                                        catch (MatchException v14) {
                                                                                            throw eE.d("E", (Object)v14, (long)-8016957239112358322L, (long)var2_2);
                                                                                        }
                                                                                        if (eE.d("\u00c7", (Object)eE.b, (long)-8019153523610510133L, (long)var2_2) == null) break block68;
                                                                                    }
                                                                                    catch (MatchException v15) {
                                                                                        throw eE.d("E", (Object)v15, (long)-8016957239112358322L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                v16 = this;
                                                                                if (var18_10 != null) break block69;
                                                                            }
                                                                            catch (MatchException v17) {
                                                                                throw eE.d("E", (Object)v17, (long)-8016957239112358322L, (long)var2_2);
                                                                            }
                                                                            v13 /* !! */  = v16.A;
                                                                        }
                                                                        catch (MatchException v18) {
                                                                            throw eE.d("E", (Object)v18, (long)-8016957239112358322L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    if (v13 /* !! */ ) break block83;
                                                                    v16 = this;
                                                                }
                                                                v19 = new Object[1];
                                                                v19[0] = var4_3;
                                                                eE.d("D", (Object)v16, (Object)v19, (long)-8034263801896110216L, (long)var2_2);
                                                            }
                                                            return;
                                                        }
                                                        v20 = new Object[2];
                                                        v20[1] = var12_7;
                                                        v20[0] = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$3(net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)();
                                                        var19_11 = eE.d("D", (Object)this, (Object)v20, (long)-8017482741385071522L, (long)var2_2);
                                                        try {
                                                            try {
                                                                v21 = var19_11;
                                                                if (var18_10 != null) break block70;
                                                                if (v21 != -1) break block71;
                                                            }
                                                            catch (MatchException v22) {
                                                                throw eE.d("E", (Object)v22, (long)-8016957239112358322L, (long)var2_2);
                                                            }
                                                            v23 = new Object[1];
                                                            v23[0] = var8_5;
                                                            eE.d("D", (Object)this, (Object)v23, (long)-8019107282116528773L, (long)var2_2);
                                                            return;
                                                        }
                                                        catch (MatchException v24) {
                                                            throw eE.d("E", (Object)v24, (long)-8016957239112358322L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        v25 = this;
                                                        if (var18_10 != null) break block72;
                                                        v21 = eE.d("D", (String)eE.d("D", (Object)v25.a, (long)-8017059492314824912L, (long)var2_2), (Object)eE.b("q", (int)17858, (long)(7935802055828884013L ^ var2_2)), (long)-8016847854402561381L, (long)var2_2);
                                                    }
                                                    catch (MatchException v26) {
                                                        throw eE.d("E", (Object)v26, (long)-8016957239112358322L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (v21 == false) break block73;
                                                            v27 = this.w;
                                                            if (var18_10 != null) break block74;
                                                        }
                                                        catch (MatchException v28) {
                                                            throw eE.d("E", (Object)v28, (long)-8016957239112358322L, (long)var2_2);
                                                        }
                                                        if (v27 != 0) break block75;
                                                    }
                                                    catch (MatchException v29) {
                                                        throw eE.d("E", (Object)v29, (long)-8016957239112358322L, (long)var2_2);
                                                    }
                                                    v27 = 1;
                                                    break block74;
                                                }
                                                catch (MatchException v30) {
                                                    throw eE.d("E", (Object)v30, (long)-8016957239112358322L, (long)var2_2);
                                                }
                                            }
                                            v27 = 0;
                                            break block74;
                                        }
                                        v25 = this;
                                    }
                                    try {
                                        try {
                                            v31 = v25.r;
                                            v32 = k_0.IDLE;
                                            if (var18_10 != null) break block76;
                                            if (v31 != v32) {
                                            }
                                            ** GOTO lbl174
                                        }
                                        catch (MatchException v33) {
                                            throw eE.d("E", (Object)v33, (long)-8016957239112358322L, (long)var2_2);
                                        }
                                        v31 = this.r;
                                        v32 = k_0.THROW_PEARL;
                                    }
                                    catch (MatchException v34) {
                                        throw eE.d("E", (Object)v34, (long)-8016957239112358322L, (long)var2_2);
                                    }
                                }
                                try {
                                    if (v31 != v32) break block77;
lbl174:
                                    // 2 sources

                                    v27 = 1;
                                    break block74;
                                }
                                catch (MatchException v35) {
                                    throw eE.d("E", (Object)v35, (long)-8016957239112358322L, (long)var2_2);
                                }
                            }
                            v27 = 0;
                        }
                        var20_12 = v27;
                        var21_13 /* !! */  = -1;
                        try {
                            v36 /* !! */  = var20_12;
                            if (var18_10 != null) break block78;
                            if (v36 /* !! */  == 0) break block79;
                        }
                        catch (MatchException v37) {
                            throw eE.d("E", (Object)v37, (long)-8016957239112358322L, (long)var2_2);
                        }
                        v38 = new Object[2];
                        v38[1] = var12_7;
                        v38[0] = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$4(net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)();
                        var21_13 /* !! */  = (int)eE.d("D", (Object)this, (Object)v38, (long)-8017482741385071522L, (long)var2_2);
                        try {
                            try {
                                v36 /* !! */  = var21_13 /* !! */ ;
                                if (var18_10 != null) break block78;
                                if (v36 /* !! */  != -1) break block79;
                            }
                            catch (MatchException v39) {
                                throw eE.d("E", (Object)v39, (long)-8016957239112358322L, (long)var2_2);
                            }
                            v40 = new Object[1];
                            v40[0] = var8_5;
                            eE.d("D", (Object)this, (Object)v40, (long)-8019107282116528773L, (long)var2_2);
                            return;
                        }
                        catch (MatchException v41) {
                            throw eE.d("E", (Object)v41, (long)-8016957239112358322L, (long)var2_2);
                        }
                    }
                    try {
                        v42 = this;
                        if (var18_10 != null) break block80;
                        v36 /* !! */  = (int)eE.d("D", (String)eE.d("D", (Object)v42.a, (long)-8017059492314824912L, (long)var2_2), (Object)eE.b("q", (int)16993, (long)(2882861439817829772L ^ var2_2)), (long)-8016847854402561381L, (long)var2_2);
                    }
                    catch (MatchException v43) {
                        throw eE.d("E", (Object)v43, (long)-8016957239112358322L, (long)var2_2);
                    }
                }
                try {
                    block81: {
                        try {
                            if (v36 /* !! */  == 0) break block81;
                            v44 = new Object[3];
                            v44[2] = var14_8;
                            v44[1] = (int)var19_11;
                            v44[0] = var21_13 /* !! */ ;
                            eE.d("D", (Object)this, (Object)v44, (long)-8017401638474564815L, (long)var2_2);
                            if (var18_10 == null) break block82;
                        }
                        catch (MatchException v45) {
                            throw eE.d("E", (Object)v45, (long)-8016957239112358322L, (long)var2_2);
                        }
                    }
                    v42 = this;
                }
                catch (MatchException v46) {
                    throw eE.d("E", (Object)v46, (long)-8016957239112358322L, (long)var2_2);
                }
            }
            v47 = new Object[3];
            v47[2] = var16_9;
            v47[1] = (int)var19_11;
            v47[0] = var21_13 /* !! */ ;
            eE.d("D", (Object)v42, (Object)v47, (long)-8033663452719909434L, (long)var2_2);
        }
    }

    @bP
    public void a(a5 a52) {
        long l = E ^ 0x3B245588F872L;
        long l2 = l ^ 0x456108C46606L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        eE.d("D", (Object)this, (Object)objectArray, (long)-5528472317281291255L, (long)l);
    }

    private int a(Object[] objectArray) {
        Object object;
        block8: {
            Predicate predicate = (Predicate)objectArray[0];
            long l = (Long)objectArray[1];
            l = E ^ l;
            int n = 0;
            CallSite callSite = eE.d("E", (long)-7245297533439323407L, (long)l);
            while (n < eE.c("j", (int)23229, (long)(0x2B46C661BA058910L ^ l))) {
                block7: {
                    block9: {
                        CallSite callSite2 = eE.d("D", (Object)eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)-7243870932780914358L, (long)l), (long)-7255582297539657197L, (long)l), (int)n, (long)-7246068737258159774L, (long)l);
                        try {
                            try {
                                try {
                                    if (callSite != null) break block7;
                                    object = eE.d("D", (Object)predicate, (Object)callSite2, (long)-7258074614110992947L, (long)l);
                                    if (callSite != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw eE.d("E", (Object)matchException, (long)-7245699158554628734L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)-7245699158554628734L, (long)l);
                            }
                            return n;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-7245699158554628734L, (long)l);
                        }
                    }
                    ++n;
                }
                if (callSite == null) continue;
            }
            object = -1;
        }
        return object;
    }

    private static class_243 a(Object[] objectArray) {
        Object object;
        CallSite callSite;
        CallSite callSite2;
        class_243 class_2432 = (class_243)objectArray[0];
        double d = (Double)objectArray[1];
        class_243 class_2433 = (class_243)objectArray[2];
        boolean bl = (Boolean)objectArray[3];
        long l = (Long)objectArray[4];
        l = E ^ l;
        try {
            callSite2 = eE.d("D", (Object)class_2432, (double)d, (long)5223653214425606331L, (long)l);
            callSite = eE.d("\u00c7", (Object)class_2433, (long)5208559536590921559L, (long)l);
            object = bl ? 0.0 : (Object)eE.d("\u00c7", (Object)class_2433, (long)5221635508464638833L, (long)l);
        }
        catch (MatchException matchException) {
            throw eE.d("E", (Object)matchException, (long)5223896417351958159L, (long)l);
        }
        return eE.d("D", (Object)callSite2, (double)callSite, (double)object, (double)eE.d("\u00c7", (Object)class_2433, (long)5207315509836046414L, (long)l), (long)5222386692055742978L, (long)l);
    }

    private boolean a(Object[] objectArray) {
        boolean bl;
        dC dC2 = (dC)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = E ^ l;
        long l3 = l2 ^ 0x3E928BE80EC7L;
        long l4 = l2 ^ 0x71DDBF69696CL;
        long l5 = l2 ^ 0x771B850E241EL;
        CallSite callSite = eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)3418227076887960925L, (long)l), (long)3414881326769846873L, (long)l);
        CallSite callSite2 = eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)3418227076887960925L, (long)l), (long)3413155340687519130L, (long)l);
        CallSite callSite3 = eE.d("D", (Object)eE.d("\u00c7", (Object)b, (long)3418227076887960925L, (long)l), (long)3415605390805342683L, (long)l);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = (int)eE.c("j", (int)10528, (long)(0x6BF903FBEC1BCE99L ^ l));
        objectArray2[2] = (boolean)callSite3;
        objectArray2[1] = callSite2;
        objectArray2[0] = callSite;
        CallSite callSite4 = eE.d("D", (Object)this, (Object)objectArray2, (long)3410148603996722717L, (long)l);
        aD aD2 = (aD)((Object)eE.d("D", (Object)callSite4, (int)0, (long)3409822210888154188L, (long)l));
        try {
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l4;
            objectArray3[2] = Float.valueOf((float)eE.d("D", (Object)dC2, (Object)new Object[0], (long)3414099812576357801L, (long)l));
            objectArray3[1] = Float.valueOf((float)eE.d("D", (Object)dC2, (Object)new Object[0], (long)3412731252222375742L, (long)l));
            objectArray3[0] = aD2;
            this.t = eE.d("D", (Object)this, (Object)objectArray3, (long)3409865750630584076L, (long)l);
            Object[] objectArray4 = new Object[3];
            objectArray4[2] = l5;
            objectArray4[1] = this.t;
            objectArray4[0] = callSite4;
            this.u = eE.d("D", (Object)this, (Object)objectArray4, (long)3412849739454103978L, (long)l);
            bl = this.u != null;
        }
        catch (MatchException matchException) {
            throw eE.d("E", (Object)matchException, (long)3415269686740687253L, (long)l);
        }
        return bl;
    }

    private aC a(Object[] objectArray) {
        CallSite callSite;
        block61: {
            CallSite callSite2;
            block62: {
                CallSite callSite3;
                long l;
                block57: {
                    CallSite callSite4;
                    Object object;
                    long l2;
                    List list;
                    block55: {
                        List list2;
                        block56: {
                            block52: {
                                list2 = (List)objectArray[0];
                                list = (List)objectArray[1];
                                l = (Long)objectArray[2];
                                long l3 = l = E ^ l;
                                l2 = l3 ^ 0x45509EC35C38L;
                                long l4 = l3 ^ 0x4459F3B19BFCL;
                                callSite2 = null;
                                double d = Double.MAX_VALUE;
                                CallSite callSite5 = eE.c("j", (int)13770, (long)(0x61CC8B223B33D70L ^ l));
                                CallSite callSite6 = eE.d("D", (Object)list, (long)4642758572568358745L, (long)l);
                                CallSite callSite7 = eE.d("D", (Object)list2, (long)4642758572568358745L, (long)l);
                                int n = 2;
                                callSite3 = eE.d("E", (long)4640566317480413668L, (long)l);
                                block38: while (true) {
                                    Object object2 = n;
                                    block39: while (object2 <= callSite5) {
                                        CallSite callSite8;
                                        int n2;
                                        block46: {
                                            try {
                                                try {
                                                    n2 = n;
                                                    callSite8 = callSite6 - 1;
                                                    if (callSite3 != null) break block46;
                                                    if (n2 >= callSite8) break block38;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                }
                                                n2 = n;
                                                callSite8 = callSite7;
                                            }
                                            catch (MatchException matchException) {
                                                throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                            }
                                        }
                                        if (n2 >= callSite8) break block38;
                                        aD aD2 = (aD)((Object)eE.d("D", (Object)list2, (int)n, (long)4634326814195176270L, (long)l));
                                        for (int i = n + 1; i < callSite6; ++i) {
                                            float f;
                                            class_243 class_2432;
                                            CallSite callSite9;
                                            int n3;
                                            block50: {
                                                aD aD3;
                                                block48: {
                                                    block49: {
                                                        boolean bl;
                                                        block47: {
                                                            object = (class_243)eE.d("D", (Object)list, (int)i, (long)4634326814195176270L, (long)l);
                                                            n3 = i - n;
                                                            callSite9 = eE.d("D", (Object)object, (Object)aD2.a, (long)4642653130813767628L, (long)l);
                                                            reference cfr_temp_0 = eE.d("D", (Object)callSite9, (long)4639716494955644482L, (long)l) - 1.0E-6;
                                                            object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                            if (callSite3 != null) continue block39;
                                                            try {
                                                                if (callSite3 != null) break block47;
                                                                if (object2 < 0) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                            }
                                                            try {
                                                                aD3 = aD2;
                                                                if (callSite3 != null) break block48;
                                                                bl = aD3.c;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            if (!bl) break block49;
                                                            class_2432 = new class_243((double)eE.d("\u00c7", (Object)aD2.b, (long)4634360611844626255L, (long)l), 0.0, (double)eE.d("\u00c7", (Object)aD2.b, (long)4637602592424126550L, (long)l));
                                                            break block50;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                        }
                                                    }
                                                    aD3 = aD2;
                                                }
                                                class_2432 = aD3.b;
                                            }
                                            class_243 class_2433 = class_2432;
                                            CallSite callSite10 = eE.d("D", (Object)callSite9, (Object)eE.d("D", (Object)class_2433, (double)n3, (long)4640449025250451619L, (long)l), (long)4642653130813767628L, (long)l);
                                            float f10 = (float)eE.d("E", (double)eE.d("E", (double)(-eE.d("\u00c7", (Object)callSite10, (long)4634360611844626255L, (long)l)), (double)eE.d("\u00c7", (Object)callSite10, (long)4637602592424126550L, (long)l), (long)4643165834989779338L, (long)l), (long)4638141901151425807L, (long)l);
                                            CallSite callSite11 = eE.d("E", (double)(eE.d("\u00c7", (Object)callSite10, (long)4634360611844626255L, (long)l) * eE.d("\u00c7", (Object)callSite10, (long)4634360611844626255L, (long)l) + eE.d("\u00c7", (Object)callSite10, (long)4637602592424126550L, (long)l) * eE.d("\u00c7", (Object)callSite10, (long)4637602592424126550L, (long)l)), (long)4639408512138054626L, (long)l);
                                            float f11 = (float)eE.d("E", (double)(-eE.d("E", (double)eE.d("\u00c7", (Object)callSite10, (long)4642915400406782825L, (long)l), (double)callSite11, (long)4643165834989779338L, (long)l)), (long)4638141901151425807L, (long)l);
                                            float f12 = f = f11 - 5.0f;
                                            while (f <= f11 + 5.0f) {
                                                f12 = f10 - 5.0f;
                                                if (callSite3 != null) continue;
                                                float f13 = f12;
                                                while (f13 <= f10 + 5.0f) {
                                                    block51: {
                                                        block53: {
                                                            double d10;
                                                            CallSite callSite12;
                                                            block54: {
                                                                Object[] objectArray2 = new Object[7];
                                                                objectArray2[6] = l4;
                                                                objectArray2[5] = Float.valueOf(f);
                                                                objectArray2[4] = Float.valueOf(f13);
                                                                objectArray2[3] = n3;
                                                                objectArray2[2] = n;
                                                                objectArray2[1] = list;
                                                                objectArray2[0] = aD2;
                                                                callSite12 = eE.d("D", (Object)this, (Object)objectArray2, (long)4636603257096301762L, (long)l);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite3 != null) break block51;
                                                                                    callSite4 = callSite12;
                                                                                    if (callSite3 != null) break block52;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                                                }
                                                                                if (callSite4 == null) break block53;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                                            }
                                                                            d10 = ((aC)((Object)callSite12)).d;
                                                                            if (callSite3 != null) break block54;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                                        }
                                                                        if (!(d10 < d)) break block53;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                                    }
                                                                    d10 = ((aC)((Object)callSite12)).d;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                                }
                                                            }
                                                            d = d10;
                                                            callSite2 = callSite12;
                                                        }
                                                        f13 += 0.5f;
                                                    }
                                                    if (callSite3 == null) continue;
                                                }
                                                f += 0.5f;
                                                if (callSite3 == null) continue;
                                            }
                                            if (callSite3 == null) continue;
                                        }
                                        ++n;
                                        if (callSite3 == null) continue block38;
                                    }
                                    break;
                                }
                                callSite4 = callSite2;
                            }
                            try {
                                try {
                                    if (callSite3 != null) break block55;
                                    if (callSite4 != null) break block56;
                                }
                                catch (MatchException matchException) {
                                    throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                }
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                            }
                        }
                        callSite4 = eE.d("D", (Object)list2, (int)((aC)((Object)callSite2)).a, (long)4634326814195176270L, (long)l);
                    }
                    aD aD4 = (aD)((Object)callSite4);
                    for (float f = ((aC)((Object)callSite2)).c - 0.5f; f <= ((aC)((Object)callSite2)).c + 0.5f; f += 0.05f) {
                        callSite = callSite2;
                        if (callSite3 != null) break block57;
                        float f14 = ((aC)((Object)callSite)).b - 1.0f;
                        while (f14 <= ((aC)((Object)callSite2)).b + 1.0f) {
                            block58: {
                                block59: {
                                    Object object3;
                                    block60: {
                                        Object[] objectArray3 = new Object[6];
                                        objectArray3[5] = l2;
                                        objectArray3[4] = Float.valueOf(f);
                                        objectArray3[3] = Float.valueOf(f14);
                                        objectArray3[2] = ((aC)((Object)callSite2)).a;
                                        objectArray3[1] = list;
                                        objectArray3[0] = aD4;
                                        object = eE.d("D", (Object)this, (Object)objectArray3, (long)4636497158100095664L, (long)l);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block58;
                                                            callSite = object;
                                                            if (callSite3 != null) break block57;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                        }
                                                        if (callSite == null) break block59;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                    }
                                                    object3 = object;
                                                    if (callSite3 != null) break block60;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                                }
                                                if (!(object3.d < ((aC)((Object)callSite2)).d)) break block59;
                                            }
                                            catch (MatchException matchException) {
                                                throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                            }
                                            object3 = object;
                                        }
                                        catch (MatchException matchException) {
                                            throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                                        }
                                    }
                                    callSite2 = object3;
                                }
                                f14 += 0.1f;
                            }
                            if (callSite3 == null) continue;
                        }
                        if (callSite3 == null) continue;
                    }
                    callSite = callSite2;
                }
                try {
                    try {
                        if (callSite3 != null) break block61;
                        if (!(((aC)((Object)callSite)).d > 0.4)) break block62;
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)4640688096416167575L, (long)l);
                }
            }
            callSite = callSite2;
        }
        return callSite;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eE.d("E", (Object)((Object)q_0.Mace), (long)-2438582826170520406L, (long)l);
    }

    @Override
    public dC a(Object[] objectArray) {
        block64: {
            eE eE2;
            long l;
            long l2;
            long l3;
            block63: {
                k_0 k_02;
                k_0 k_03;
                block56: {
                    CallSite callSite;
                    block57: {
                        block60: {
                            CallSite callSite2;
                            eE eE3;
                            block61: {
                                long l4;
                                block62: {
                                    CallSite callSite3;
                                    block59: {
                                        long l5;
                                        block54: {
                                            block55: {
                                                eE eE4;
                                                block47: {
                                                    block48: {
                                                        CallSite callSite4;
                                                        block53: {
                                                            block52: {
                                                                Object object;
                                                                block49: {
                                                                    block51: {
                                                                        block50: {
                                                                            Object object2;
                                                                            long l6;
                                                                            block45: {
                                                                                block46: {
                                                                                    long l7;
                                                                                    long l8;
                                                                                    block44: {
                                                                                        eE eE5;
                                                                                        block43: {
                                                                                            l3 = (Long)objectArray[0];
                                                                                            long l9 = l3;
                                                                                            l8 = l9 ^ 0x467D846EACC6L;
                                                                                            l7 = l9 ^ 0x3647412E3AD1L;
                                                                                            l5 = l9 ^ 0x7D9E872120CAL;
                                                                                            l4 = l9 ^ 0x665C7B615202L;
                                                                                            l2 = l9 ^ 0x50B445ED6CEL;
                                                                                            l6 = l9 ^ 0x660A570C714BL;
                                                                                            l = l9 ^ 0x1E1D0428DB54L;
                                                                                            callSite = eE.d("E", (long)-1178037317765978588L, (long)l3);
                                                                                            try {
                                                                                                try {
                                                                                                    eE5 = this;
                                                                                                    if (callSite != null) break block43;
                                                                                                    if (eE5.D == eE.d("\u00c7", (Object)b, (long)-1178072470435665410L, (long)l3)) break block44;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                                }
                                                                                                eE5 = this;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                            }
                                                                                        }
                                                                                        Object[] objectArray2 = new Object[1];
                                                                                        objectArray2[0] = l7;
                                                                                        eE.d("D", (Object)eE5, (Object)objectArray2, (long)-1183997475393607458L, (long)l3);
                                                                                    }
                                                                                    try {
                                                                                        Object[] objectArray3 = new Object[1];
                                                                                        objectArray3[0] = l8;
                                                                                        if (eE.d("D", (Object)eE.d("O", (long)-1180054749140360554L, (long)l3), (Object)objectArray3, (long)-1179719180910095906L, (long)l3) == false) {
                                                                                            Object[] objectArray4 = new Object[1];
                                                                                            objectArray4[0] = l7;
                                                                                            eE.d("D", (Object)this, (Object)objectArray4, (long)-1183997475393607458L, (long)l3);
                                                                                            return null;
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            object2 = this.x;
                                                                                            if (callSite != null) break block45;
                                                                                            if (object2 == null) break block46;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                        }
                                                                                        return this.x;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    eE4 = this;
                                                                                    if (callSite != null) break block47;
                                                                                    object2 = eE.d("D", (Object)eE4.a, (long)-1178549986738847703L, (long)l3);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (eE.d("D", (String)object2, (Object)eE.b("q", (int)16993, (long)(0x2801A6E2AA063295L ^ l3)), (long)-1177917184400235134L, (long)l3) == false) break block48;
                                                                                            object = this.w;
                                                                                            if (callSite != null) break block49;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                        }
                                                                                        if (object == 0) break block50;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                    }
                                                                                    Object[] objectArray5 = new Object[1];
                                                                                    objectArray5[0] = l6;
                                                                                    reference cfr_temp_0 = eE.d("D", (Object)this.v, (Object)objectArray5, (long)-1179116235770678419L, (long)l3) + 55.0f - eE.d("D", (Object)((Float)((Object)eE.d("D", (Object)this.c, (long)-1178549986738847703L, (long)l3))), (long)-1183924774585483816L, (long)l3);
                                                                                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                    if (callSite != null) break block49;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                                }
                                                                                if (object < 0) break block51;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                            }
                                                                        }
                                                                        object = 1;
                                                                        break block49;
                                                                    }
                                                                    object = 0;
                                                                }
                                                                int n = object;
                                                                try {
                                                                    if (n == 0) break block52;
                                                                    Object[] objectArray6 = new Object[1];
                                                                    objectArray6[0] = l4;
                                                                    Object[] objectArray7 = new Object[2];
                                                                    objectArray7[1] = l2;
                                                                    objectArray7[0] = eE.d("D", (Object)this, (Object)objectArray6, (long)-1178777703297381839L, (long)l3);
                                                                    callSite4 = eE.d("D", (Object)this, (Object)objectArray7, (long)-1180329940713764964L, (long)l3);
                                                                    break block53;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                                }
                                                            }
                                                            callSite4 = null;
                                                        }
                                                        return callSite4;
                                                    }
                                                    eE4 = this;
                                                }
                                                try {
                                                    try {
                                                        k_0 k_02 = eE4.r;
                                                        k_02 = k_0.THROW_PEARL;
                                                        if (callSite != null) break block54;
                                                        if (k_03 != k_02) break block55;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                    }
                                                    Object[] objectArray8 = new Object[1];
                                                    objectArray8[0] = l4;
                                                    Object[] objectArray9 = new Object[2];
                                                    objectArray9[1] = l2;
                                                    objectArray9[0] = eE.d("D", (Object)this, (Object)objectArray8, (long)-1178777703297381839L, (long)l3);
                                                    return eE.d("D", (Object)this, (Object)objectArray9, (long)-1180329940713764964L, (long)l3);
                                                }
                                                catch (MatchException matchException) {
                                                    throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                }
                                            }
                                            k_0 k_02 = this.r;
                                            k_02 = k_0.WAIT_FOR_LAUNCH;
                                        }
                                        try {
                                            if (callSite != null) break block56;
                                            if (k_03 != k_02) break block57;
                                        }
                                        catch (MatchException matchException) {
                                            throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                        }
                                        Object[] objectArray10 = new Object[1];
                                        objectArray10[0] = l5;
                                        callSite3 = eE.d("D", (Object)this, (Object)objectArray10, (long)-1176094368322112939L, (long)l3);
                                        try {
                                            block58: {
                                                try {
                                                    try {
                                                        if (callSite3 != null) break block58;
                                                        eE3 = this;
                                                        if (callSite != null) break block59;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                    }
                                                    if (eE3.s > 2) break block60;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                                }
                                            }
                                            eE3 = this;
                                        }
                                        catch (MatchException matchException) {
                                            throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                        }
                                    }
                                    try {
                                        callSite2 = callSite3;
                                        if (callSite != null) break block61;
                                        if (callSite2 == null) break block62;
                                    }
                                    catch (MatchException matchException) {
                                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                                    }
                                    callSite2 = callSite3;
                                    break block61;
                                }
                                Object[] objectArray11 = new Object[1];
                                objectArray11[0] = l4;
                                callSite2 = eE.d("D", (Object)this, (Object)objectArray11, (long)-1178777703297381839L, (long)l3);
                            }
                            Object[] objectArray12 = new Object[2];
                            objectArray12[1] = l2;
                            objectArray12[0] = callSite2;
                            return eE.d("D", (Object)eE3, (Object)objectArray12, (long)-1180329940713764964L, (long)l3);
                        }
                        return null;
                    }
                    try {
                        eE2 = this;
                        if (callSite != null) break block63;
                        k_0 k_02 = eE2.r;
                        k_02 = k_0.THROW_WIND_CHARGE;
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)-1177878168326678185L, (long)l3);
                    }
                }
                if (k_03 != k_02) break block64;
                eE2 = this;
            }
            Object[] objectArray13 = new Object[1];
            objectArray13[0] = l;
            Object[] objectArray14 = new Object[2];
            objectArray14[1] = l2;
            objectArray14[0] = eE.d("D", (Object)this, (Object)objectArray13, (long)-1176215231903072145L, (long)l3);
            return eE.d("D", (Object)eE2, (Object)objectArray14, (long)-1180329940713764964L, (long)l3);
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (M[n3] != null) {
            return n3;
        }
        Object object = L[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 44;
            case 2 -> 55;
            case 3 -> 52;
            case 4 -> 47;
            case 5 -> 43;
            case 6 -> 50;
            case 7 -> 16;
            case 8 -> 35;
            case 9 -> 11;
            case 10 -> 53;
            case 11 -> 56;
            case 12 -> 38;
            case 13 -> 45;
            case 14 -> 41;
            case 15 -> 36;
            case 16 -> 27;
            case 17 -> 26;
            case 18 -> 21;
            case 19 -> 30;
            case 20 -> 1;
            case 21 -> 5;
            case 22 -> 48;
            case 23 -> 10;
            case 24 -> 14;
            case 25 -> 42;
            case 26 -> 3;
            case 27 -> 63;
            case 28 -> 13;
            case 29 -> 33;
            case 30 -> 25;
            case 31 -> 15;
            case 32 -> 8;
            case 33 -> 31;
            case 34 -> 0;
            case 35 -> 46;
            case 36 -> 37;
            case 37 -> 19;
            case 38 -> 39;
            case 39 -> 6;
            case 40 -> 60;
            case 41 -> 51;
            case 42 -> 22;
            case 43 -> 40;
            case 44 -> 18;
            case 45 -> 2;
            case 46 -> 12;
            case 47 -> 9;
            case 48 -> 59;
            case 49 -> 49;
            case 50 -> 34;
            case 51 -> 7;
            case 52 -> 62;
            case 53 -> 23;
            case 54 -> 32;
            case 55 -> 24;
            case 56 -> 4;
            case 57 -> 58;
            case 58 -> 28;
            case 59 -> 54;
            case 60 -> 20;
            case 61 -> 29;
            case 62 -> 57;
            default -> 17;
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
        eE.M[n3] = new String(cArray);
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    private void m(Object[] var1_1) {
        block14: {
            block13: {
                block11: {
                    var4_2 = (Integer)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    v0 = var2_3 = eE.E ^ var2_3;
                    var5_4 = v0 ^ 69271851807271L;
                    var7_5 = v0 ^ 87032334136261L;
                    var9_6 = v0 ^ 6839964455270L;
                    v1 = new Object[1];
                    v1[0] = var9_6;
                    v2 = new Object[3];
                    v2[2] = var7_5;
                    v2[1] = eE.d("D", (Object)this, (Object)v1, (long)-1900758324193949091L, (long)var2_3);
                    v2[0] = var4_2;
                    var12_7 = eE.d("D", (Object)this, (Object)v2, (long)-1898141764492457018L, (long)var2_3);
                    var11_8 = eE.d("E", (long)-1903653301444301802L, (long)var2_3);
                    try {
                        block12: {
                            try {
                                try {
                                    try {
                                        if (var11_8 != null) break block11;
                                        if (var12_7 != false) break block12;
                                    }
                                    catch (MatchException v3) {
                                        throw eE.d("E", (Object)v3, (long)-1903529306311797915L, (long)var2_3);
                                    }
                                    v4 = this;
                                    if (var11_8 != null) break block13;
                                }
                                catch (MatchException v5) {
                                    throw eE.d("E", (Object)v5, (long)-1903529306311797915L, (long)var2_3);
                                }
                                if (v4.A) {
                                }
                                ** GOTO lbl46
                            }
                            catch (MatchException v6) {
                                throw eE.d("E", (Object)v6, (long)-1903529306311797915L, (long)var2_3);
                            }
                        }
                        this.B = 1;
                    }
                    catch (MatchException v7) {
                        throw eE.d("E", (Object)v7, (long)-1903529306311797915L, (long)var2_3);
                    }
                }
                try {
                    if (var11_8 == null) break block14;
lbl46:
                    // 2 sources

                    v4 = this;
                }
                catch (MatchException v8) {
                    throw eE.d("E", (Object)v8, (long)-1903529306311797915L, (long)var2_3);
                }
            }
            v9 = new Object[1];
            v9[0] = var5_4;
            eE.d("D", (Object)v4, (Object)v9, (long)-1901313327104442288L, (long)var2_3);
        }
    }

    private static Field o(long l, long l2) {
        int n = eE.m(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            String string = M[n];
            int n2 = string.indexOf(8);
            Class clazz = eE.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eE.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eE.g(clazz3, string2, clazz2)) != null) {
                    eE.L[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eE.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eE.L[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eE.n(1463419182009237L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eE.m(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = M[n];
                int n3 = string2.indexOf(8);
                clazz3 = eE.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eE.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eE.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eE.L[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eE.n(1463419182009237L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eE.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eE.L[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eE.n(1463419182009237L, 0L);
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

    private void k(Object[] objectArray) {
        block21: {
            int n;
            block20: {
                eE eE2;
                Object object;
                long l;
                block18: {
                    CallSite callSite;
                    long l2;
                    long l3;
                    int n2;
                    block19: {
                        block14: {
                            long l4;
                            block15: {
                                block17: {
                                    int n3;
                                    long l5;
                                    block16: {
                                        int n4 = (Integer)objectArray[0];
                                        n2 = (Integer)objectArray[1];
                                        l = (Long)objectArray[2];
                                        long l6 = l = E ^ l;
                                        l3 = l6 ^ 0x6B359CBC124AL;
                                        l5 = l6 ^ 0x26AE7CC8DB99L;
                                        l2 = l6 ^ 0x5A6BA50F79BFL;
                                        l4 = l6 ^ 0x71FA258FE308L;
                                        callSite = eE.d("E", (long)-4315581512032875111L, (long)l);
                                        try {
                                            eE eE3;
                                            try {
                                                try {
                                                    try {
                                                        object = this.w;
                                                        if (callSite != null) break block14;
                                                        if (object) break block15;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                                                    }
                                                    eE3 = this;
                                                    n3 = n4;
                                                    if (callSite != null) break block16;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                                                }
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l2;
                                                Object[] objectArray3 = new Object[3];
                                                objectArray3[2] = l3;
                                                objectArray3[1] = eE.d("D", (Object)this, (Object)objectArray2, (long)-4316383741264977524L, (long)l);
                                                objectArray3[0] = n3;
                                                if (eE.d("D", (Object)eE3, (Object)objectArray3, (long)-4312383502504416695L, (long)l) == false) break block17;
                                            }
                                            catch (MatchException matchException) {
                                                throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                                            }
                                            eE3 = this;
                                            n3 = 1;
                                        }
                                        catch (MatchException matchException) {
                                            throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                                        }
                                    }
                                    eE3.w = n3;
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l5;
                                    eE.d("D", (Object)this.v, (Object)objectArray4, (long)-4312243714447421217L, (long)l);
                                }
                                return;
                            }
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = l4;
                            objectArray5[0] = Float.valueOf((float)eE.d("D", (Object)((Float)((Object)eE.d("D", (Object)this.c, (long)-4316190894676120684L, (long)l))), (long)-4310817273987066267L, (long)l));
                            object = eE.d("D", (Object)this.v, (Object)objectArray5, (long)-4318533441513700300L, (long)l);
                        }
                        try {
                            if (callSite != null) break block18;
                            if (object) break block19;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                        }
                        return;
                    }
                    try {
                        eE2 = this;
                        n = n2;
                        if (callSite != null) break block20;
                        Object[] objectArray6 = new Object[1];
                        objectArray6[0] = l2;
                        Object[] objectArray7 = new Object[3];
                        objectArray7[2] = l3;
                        objectArray7[1] = eE.d("D", (Object)this, (Object)objectArray6, (long)-4316383741264977524L, (long)l);
                        objectArray7[0] = n;
                        object = eE.d("D", (Object)eE2, (Object)objectArray7, (long)-4312383502504416695L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                    }
                }
                try {
                    if (!object) break block21;
                    eE2 = this;
                    n = 1;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)-4316020486105632022L, (long)l);
                }
            }
            eE2.B = n;
        }
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = E ^ l;
        long l3 = l2 ^ 0x3219561E68D5L;
        long l4 = l2 ^ 0x2B56709481E9L;
        this.r = k_0.IDLE;
        this.s = 0;
        this.t = null;
        this.u = null;
        this.w = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        eE.d("D", (Object)this.v, (Object)objectArray2, (long)-7036917537842459985L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        eE.d("D", (Object)this, (Object)objectArray3, (long)-7037749928176322132L, (long)l);
        this.D = eE.d("\u00c7", (Object)b, (long)-7031362997046896589L, (long)l);
    }

    private boolean lambda$new$0(Float f) {
        long l = E ^ 0x26FA77960F60L;
        return (boolean)eE.d("D", (String)((Object)eE.d("D", (Object)this.a, (long)4927393123209276396L, (long)l)), (Object)eE.b("q", (int)16993, (long)(0x2801C81AC1F29950L ^ l)), (long)4927602611202969159L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = E ^ 0x3C362FAF7A26L;
                    callSite = eE.d("E", (long)3541431816280504487L, (long)l);
                    try {
                        try {
                            object = eE.d("D", (String)((Object)eE.d("D", (Object)this.a, (long)3541948324551466666L, (long)l)), (Object)eE.b("q", (int)20392, (long)(0x4023FF9CDD1061DEL ^ l)), (long)3541032980207319809L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)3540992864756336596L, (long)l);
                        }
                        object = eE.d("D", (Object)((Boolean)((Object)eE.d("D", (Object)this.d, (long)3541948324551466666L, (long)l))), (long)3540123391361695072L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)3540992864756336596L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)3540992864756336596L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(Boolean bl) {
        long l = E ^ 0x2A5C10666B1AL;
        return (boolean)eE.d("D", (String)((Object)eE.d("D", (Object)this.a, (long)2313602632379731862L, (long)l)), (Object)eE.b("q", (int)1317, (long)(0x37AFD5A46E83BA6DL ^ l)), (long)2312687270537865789L, (long)l);
    }

    private static boolean lambda$onTick$3(class_1799 class_17992) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = E ^ 0x74F507ED54B1L;
                    long l2 = l ^ 0x24A30EF395D4L;
                    callSite = eE.d("E", (long)2284162538657044016L, (long)l);
                    try {
                        try {
                            object = eE.d("D", (Object)class_17992, (long)2273221031922323030L, (long)l);
                            if (callSite != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)2284287070727612739L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = class_17992;
                        object = eE.d("E", (Object)objectArray, (long)2284855604680280815L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)2284287070727612739L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)2284287070727612739L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$onTick$4(class_1799 class_17992) {
        int n;
        block8: {
            block7: {
                class_1799 class_17993;
                long l;
                block6: {
                    l = E ^ 0x76BB4D6C44A3L;
                    CallSite callSite = eE.d("E", (long)1126176933833950754L, (long)l);
                    try {
                        try {
                            class_17993 = class_17992;
                            if (callSite != null) break block6;
                            if (eE.d("D", (Object)class_17993, (long)1125363561211387460L, (long)l) != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw eE.d("E", (Object)matchException, (long)1126296498707741009L, (long)l);
                        }
                        class_17993 = class_17992;
                    }
                    catch (MatchException matchException) {
                        throw eE.d("E", (Object)matchException, (long)1126296498707741009L, (long)l);
                    }
                }
                try {
                    if (eE.d("D", (Object)class_17993, (long)1125778579699346548L, (long)l) != eE.d("O", (long)1125127810621559288L, (long)l)) break block7;
                    n = 1;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw eE.d("E", (Object)matchException, (long)1126296498707741009L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eE.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eE.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eE.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


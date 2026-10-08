/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1701
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2846
 *  net.minecraft.class_2886
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.N;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.d_0;
import dev.zprestige.prestige.e_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1701;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2846;
import net.minecraft.class_2886;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d_
extends dV
implements dF {
    private dP a;
    private dP c;
    private dP d;
    private dP e;
    private dL f;
    private dP g;
    private dL h;
    private dQ i;
    private dM j;
    private dR k;
    private dM l;
    private dM m;
    private dO n;
    private dP o;
    private dM p;
    private dM q;
    private dM r;
    private dO s;
    private dM t;
    private dN u;
    private static final class_1792[] v;
    private static final class_2248[] w;
    private static final Set x;
    private e_0 y;
    private d_0 z;
    private int A;
    private int B;
    private int C;
    private class_2338 D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private boolean N;
    private f5 O;
    private int P;
    private boolean Q;
    private class_2338 R;
    private boolean S;
    private class_1701 T;
    private boolean U;
    private dC V;
    private boolean W;
    private int X;
    private static final long Y;
    private static final String[] Z;
    private static final String[] ab;
    private static final Map bb;
    private static final long[] hb;
    private static final Integer[] ib;
    private static final Map jb;
    private static final Object[] kb;
    private static final String[] lb;

    public d_() {
        long l;
        long l2 = l = Y ^ 0x27C73D7457E4L;
        long l3 = l2 ^ 0x7833BD4AB07L;
        long l4 = l2 ^ 0x31DA0C8BD80DL;
        long l5 = l2 ^ 0x39EC1FBECFD4L;
        long l6 = l2 ^ 0x40B05266DF9DL;
        long l7 = l2 ^ 0x4B2CD30DD432L;
        long l8 = l2 ^ 0x7F6CB9C90D50L;
        long l9 = l2 ^ 0x64A1A56FB33FL;
        this.y = e_0.IDLE;
        this.z = d_0.PASSIVE;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = new f5(l4);
        this.P = 0;
        this.Q = 0;
        this.R = null;
        this.S = 0;
        this.U = 0;
        this.W = 0;
        this.X = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = this::lambda$new$0;
        d_.d("\u00d3", (Object)this.h, (Object)objectArray, (long)2571551372142859046L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l9;
        objectArray2[0] = this::lambda$new$2;
        d_.d("\u00d3", (Object)this.j, (Object)objectArray2, (long)2584453907027317732L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = this::lambda$new$1;
        d_.d("\u00d3", (Object)this.i, (Object)objectArray3, (long)2574192898689622877L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l9;
        objectArray4[0] = this::lambda$new$5;
        d_.d("\u00d3", (Object)this.r, (Object)objectArray4, (long)2584453907027317732L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l5;
        objectArray5[0] = this::lambda$new$6;
        d_.d("\u00d3", (Object)this.s, (Object)objectArray5, (long)2574057144963288299L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l9;
        objectArray6[0] = this::lambda$new$7;
        d_.d("\u00d3", (Object)this.t, (Object)objectArray6, (long)2584453907027317732L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l5;
        objectArray7[0] = this::lambda$new$3;
        d_.d("\u00d3", (Object)this.n, (Object)objectArray7, (long)2574057144963288299L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l8;
        objectArray8[0] = this::lambda$new$4;
        d_.d("\u00d3", (Object)this.o, (Object)objectArray8, (long)2581080470557067262L, (long)l);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l7;
        objectArray9[0] = this::lambda$new$8;
        d_.d("\u00d3", (Object)this.u, (Object)objectArray9, (long)2575048805528700618L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    d_.Y = hc.a(-4420095344866935320L, 8248882167538325600L, MethodHandles.lookup().lookupClass()).a(106750163275638L);
                    var20 = d_.Y ^ 122180217018931L;
                    d_.kb = new Object[322];
                    d_.lb = new String[322];
                    d_.f();
                    d_.bb = new HashMap<K, V>(13);
                    var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var20 >>> 56);
                    for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                        v2 = v2;
                        v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                    }
                    var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_3 = new String[2];
                    var16_4 = 0;
                    var15_5 = "X>HR\u0083\u00ae\u00f9\u007f=c\u0018<\u0093\u00ff\u00a5\u00ec\u00fe\u0086\u0099\u0015\u00deC\u00d8? \u00c3\u000b\u00ec\u00c1x\u00d6\u0096\u00eb]\u00cf6[\u0006\u008fzOP]&\u00c8\u0083k\u0015\u0011s+\u00e0\u00dc\u00f4\u00dd\u00beO";
                    var17_6 = "X>HR\u0083\u00ae\u00f9\u007f=c\u0018<\u0093\u00ff\u00a5\u00ec\u00fe\u0086\u0099\u0015\u00deC\u00d8? \u00c3\u000b\u00ec\u00c1x\u00d6\u0096\u00eb]\u00cf6[\u0006\u008fzOP]&\u00c8\u0083k\u0015\u0011s+\u00e0\u00dc\u00f4\u00dd\u00beO".length();
                    var14_7 = 24;
                    var13_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var18_3[var16_4++] = d_.b(var19_9).intern();
                        if ((var13_8 += var14_7) < var17_6) {
                            var14_7 = var15_5.charAt(var13_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_8;
                    var19_9 = var11_1.doFinal(var15_5.substring(v3, v3 + var14_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                d_.Z = var18_3;
                d_.ab = new String[2];
                d_.jb = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u00e2\u00e6\u00fd\u00dd\u00c4\u0098\u00b5\u008e\u001dW\u00020\u0081#\u00b5\u00cb@gSHJH\u00f8;w\u00c0/5\u0089dE\u00aem;r\u001c\u00d8\u00ae\u00f9s\u0090\fC\u0019\u0099a\u007f\u0018Z\u00d5\u00d0\u00b6#|-\u00f4";
                var5_15 = "\u00e2\u00e6\u00fd\u00dd\u00c4\u0098\u00b5\u008e\u001dW\u00020\u0081#\u00b5\u00cb@gSHJH\u00f8;w\u00c0/5\u0089dE\u00aem;r\u001c\u00d8\u00ae\u00f9s\u0090\fC\u0019\u0099a\u007f\u0018Z\u00d5\u00d0\u00b6#|-\u00f4".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "y| \u00878\u00d0g\u00cbA[\u0019K\u00a9\u008aM\u00da";
                    var5_15 = "y| \u00878\u00d0g\u00cbA[\u0019K\u00a9\u008aM\u00da".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
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
        d_.hb = var6_12;
        d_.ib = new Integer[9];
        d_.v = new class_1792[]{d_.d("\u00ff", (long)7929620841975771651L, (long)var20), d_.d("\u00ff", (long)7928252304743909414L, (long)var20), d_.d("\u00ff", (long)7927399722994710990L, (long)var20), d_.d("\u00ff", (long)7956297786024532848L, (long)var20)};
        d_.w = new class_2248[]{d_.d("\u00ff", (long)7953378286538352638L, (long)var20), d_.d("\u00ff", (long)7929963493578935721L, (long)var20), d_.d("\u00ff", (long)7960348396387093478L, (long)var20), d_.d("\u00ff", (long)7927918430184692331L, (long)var20)};
        d_.x = d_.d("y", (Object)d_.d("\u00ff", (long)7956338145319881192L, (long)var20), (Object)d_.d("\u00ff", (long)7954246433636351864L, (long)var20), (Object)d_.d("\u00ff", (long)7929004595649744841L, (long)var20), (Object)d_.d("\u00ff", (long)7961279725210026551L, (long)var20), (Object)d_.d("\u00ff", (long)7961418005857920717L, (long)var20), (Object)d_.d("\u00ff", (long)7929265550164580863L, (long)var20), (Object)d_.d("\u00ff", (long)7929829738843221248L, (long)var20), (long)7954087682511890608L, (long)var20);
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x7FAB131DDD11L;
        long l4 = l2 ^ 0x6D2E957EC64FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)3982169937829088713L, (long)l);
        d_.d("\u00d3", (Object)this, (Object)new Object[0], (long)3974025475228439254L, (long)l);
        this.T = null;
        this.U = 0;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = this;
        d_.d("\u00d3", (Object)d_.d("\u00ff", (long)3985848373324317974L, (long)l), (Object)objectArray3, (long)3987255943520650187L, (long)l);
    }

    private int e(Object[] objectArray) {
        Object object;
        block8: {
            long l = (Long)objectArray[0];
            l = Y ^ l;
            int n = 0;
            CallSite callSite = d_.d("y", (long)-1511312148820161465L, (long)l);
            while (n < d_.c("a", (int)6434, (long)(0x6B6B77B57D92330CL ^ l))) {
                block7: {
                    block9: {
                        CallSite callSite2 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-1507500776102191202L, (long)l), (long)-1483155931510003141L, (long)l), (int)n, (long)-1481962157722393388L, (long)l);
                        try {
                            try {
                                try {
                                    if (callSite != null) break block7;
                                    object = d_.d("\u00d3", (Object)x, (Object)d_.d("\u00d3", (Object)callSite2, (long)-1482841146027561960L, (long)l), (long)-1505360986584835437L, (long)l);
                                    if (callSite != null) break block8;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)-1507416520813534746L, (long)l);
                                }
                                if (object == 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-1507416520813534746L, (long)l);
                            }
                            return n;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-1507416520813534746L, (long)l);
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

    private boolean e(Object[] objectArray) {
        boolean bl;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    class_1799 class_17992 = (class_1799)objectArray[0];
                    l = (Long)objectArray[1];
                    l = Y ^ l;
                    CallSite callSite2 = d_.d("y", (long)-8051057747650414843L, (long)l);
                    try {
                        try {
                            callSite = d_.d("\u00d3", (Object)class_17992, (long)-8058703433009080486L, (long)l);
                            if (callSite2 != null) break block6;
                            if (callSite != d_.d("\u00ff", (long)-8044775617864102679L, (long)l)) break block7;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-8046018765106783580L, (long)l);
                        }
                        callSite = d_.d("\u00d3", (Object)class_17992, (Object)d_.d("\u00ff", (long)-8059259305299848299L, (long)l), (long)-8045729807523509720L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-8046018765106783580L, (long)l);
                    }
                }
                try {
                    if (callSite == null) break block7;
                    bl = true;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-8046018765106783580L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean i(Object[] objectArray) {
        boolean bl;
        CallSite callSite;
        long l;
        block12: {
            block13: {
                CallSite callSite2;
                block10: {
                    block11: {
                        l = (Long)objectArray[0];
                        l = Y ^ l;
                        callSite2 = d_.d("y", (long)1422175070814172413L, (long)l);
                        try {
                            try {
                                callSite = d_.d("Z", (Object)b, (long)1418177780672194340L, (long)l);
                                if (callSite2 != null) break block10;
                                if (callSite != null) break block11;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)1418279306039548252L, (long)l);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)1418279306039548252L, (long)l);
                        }
                    }
                    callSite = d_.d("Z", (Object)b, (long)1418177780672194340L, (long)l);
                }
                try {
                    try {
                        if (callSite2 != null) break block12;
                        if (d_.d("\u00d3", (Object)callSite, (long)1419217027066793860L, (long)l) != false) break block13;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)1418279306039548252L, (long)l);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)1418279306039548252L, (long)l);
                }
            }
            callSite = d_.d("Z", (Object)b, (long)1418177780672194340L, (long)l);
        }
        try {
            bl = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)callSite, (long)1428245639076610983L, (long)l), (long)1428145753555817634L, (long)l) == d_.d("\u00ff", (long)1429861013572078990L, (long)l);
        }
        catch (MatchException matchException) {
            throw d_.d("y", (Object)matchException, (long)1418279306039548252L, (long)l);
        }
        return bl;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private float b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = Y ^ l;
        long l3 = l2 ^ 0xF6DEC67F021L;
        long l4 = l2 ^ 0x3C4E594F7800L;
        long l5 = l2 ^ 0x5D04D4A0245DL;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            if (d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)4688418484071792093L, (long)l) != -1) {
                return 1.0500001f;
            }
        }
        catch (MatchException matchException) {
            throw d_.d("y", (Object)matchException, (long)4687963752819067900L, (long)l);
        }
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l3;
            objectArray3[0] = d_.d("\u00ff", (long)4717415840022175534L, (long)l);
            if (d_.d("y", (Object)objectArray3, (long)4685320999271101509L, (long)l) != null) {
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l5;
                return (float)d_.d("y", (int)d_.d("\u00d3", (Object)this, (Object)objectArray4, (long)4715511834322264271L, (long)l), (long)4715390598863145161L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw d_.d("y", (Object)matchException, (long)4687963752819067900L, (long)l);
        }
        return -1.0f;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d_.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19B2;
        if (ab[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])bb.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    bb.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = Z[n2].getBytes("ISO-8859-1");
            d_.ab[n2] = d_.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return ab[n2];
    }

    private dC b(Object[] objectArray) {
        Object object;
        CallSite callSite;
        CallSite callSite2;
        long l;
        block30: {
            float f;
            block31: {
                double d;
                double d10;
                Object object2;
                ArrayList arrayList;
                float f10;
                CallSite callSite3;
                long l2;
                long l3;
                float f11;
                class_243 class_2432;
                block25: {
                    block20: {
                        class_2432 = (class_243)objectArray[0];
                        f11 = ((Float)objectArray[1]).floatValue();
                        l = (Long)objectArray[2];
                        long l4 = l = Y ^ l;
                        l3 = l4 ^ 0x158E8735F564L;
                        l2 = l4 ^ 0x560C62383774L;
                        CallSite callSite4 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-8403415775109316629L, (long)l), (long)-8422506273870966776L, (long)l);
                        reference var12_8 = d_.d("Z", (Object)class_2432, (long)-8423983764314445984L, (long)l) - d_.d("Z", (Object)callSite4, (long)-8423983764314445984L, (long)l);
                        reference var14_9 = d_.d("Z", (Object)class_2432, (long)-8400382201049198621L, (long)l) - d_.d("Z", (Object)callSite4, (long)-8400382201049198621L, (long)l);
                        callSite3 = d_.d("y", (long)-8398117657048781774L, (long)l);
                        f10 = (float)d_.d("y", (double)d_.d("y", (double)var14_9, (double)var12_8, (long)-8402504058452636228L, (long)l), (long)-8425578846740993847L, (long)l) - 90.0f;
                        arrayList = new ArrayList();
                        object2 = Double.MAX_VALUE;
                        float f12 = -89.0f;
                        while (f12 <= 60.0f) {
                            block24: {
                                block23: {
                                    CallSite callSite5;
                                    block21: {
                                        CallSite callSite6;
                                        block22: {
                                            Object[] objectArray2 = new Object[4];
                                            objectArray2[3] = l2;
                                            objectArray2[2] = Float.valueOf(f11);
                                            objectArray2[1] = Float.valueOf(f12);
                                            objectArray2[0] = Float.valueOf(f10);
                                            callSite6 = d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)-8399018246793973847L, (long)l);
                                            try {
                                                try {
                                                    if (callSite3 != null) break block20;
                                                    callSite5 = callSite6;
                                                    if (callSite3 != null) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                                                }
                                                if (callSite5 != null) break block22;
                                                break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                                            }
                                        }
                                        callSite5 = callSite6;
                                    }
                                    CallSite callSite7 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)callSite5, (long)-8395347850209656451L, (long)l), (Object)class_2432, (long)-8395772631284886649L, (long)l);
                                    try {
                                        d_.d("\u00d3", arrayList, (Object)new float[]{f12, (float)callSite7}, (long)-8425166338768290034L, (long)l);
                                        if (callSite3 != null) break block24;
                                        if (!(callSite7 < object2)) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                                    }
                                    object2 = callSite7;
                                }
                                f12 += 0.5f;
                            }
                            if (callSite3 == null) continue;
                        }
                        try {
                            try {
                                d10 = object2;
                                d = 4.0;
                                if (callSite3 != null) break block25;
                                if (!(d10 > d)) break block20;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                            }
                            return null;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                        }
                    }
                    d10 = object2;
                    d = 0.25;
                }
                double d11 = d10 + d;
                d_.d("\u00d3", arrayList, arg_0 -> d_.lambda$solveShotRotation$9(d11, arg_0), (long)-8428395081058436156L, (long)l);
                CallSite callSite8 = d_.d("y", (int)((int)d_.d("y", (double)((double)d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.e, (long)-8398733770740769827L, (long)l))), (long)-8400085488642905068L, (long)l) / 100.0 * (double)(d_.d("\u00d3", arrayList, (long)-8402308304183562827L, (long)l) - 1)), (long)-8423977048360085568L, (long)l)), (int)(d_.d("\u00d3", arrayList, (long)-8402308304183562827L, (long)l) - 1), (long)-8422915263071291293L, (long)l);
                f = ((float[])d_.d("\u00d3", arrayList, (int)callSite8, (long)-8399236090456387045L, (long)l))[0];
                float f13 = f - 0.5f;
                while (f13 <= f + 0.5f) {
                    block29: {
                        block28: {
                            CallSite callSite6;
                            block26: {
                                block27: {
                                    Object[] objectArray3 = new Object[4];
                                    objectArray3[3] = l2;
                                    objectArray3[2] = Float.valueOf(f11);
                                    objectArray3[1] = Float.valueOf(f13);
                                    objectArray3[0] = Float.valueOf(f10);
                                    callSite2 = d_.d("\u00d3", (Object)this, (Object)objectArray3, (long)-8399018246793973847L, (long)l);
                                    try {
                                        callSite6 = callSite2;
                                        if (callSite3 != null) break block26;
                                        if (callSite6 != null) break block27;
                                        break block28;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                                    }
                                }
                                callSite6 = callSite2;
                            }
                            CallSite callSite10 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)callSite6, (long)-8395347850209656451L, (long)l), (Object)class_2432, (long)-8395772631284886649L, (long)l);
                            try {
                                if (callSite3 != null) break block29;
                                if (!(callSite10 < object2)) break block28;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                            }
                            object2 = callSite10;
                            f = f13;
                        }
                        f13 += 0.05f;
                    }
                    if (callSite3 == null) continue;
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l3;
                objectArray4[0] = class_2432;
                callSite = d_.d("\u00d3", (Object)d_.d("\u00ff", (long)-8399861174771500757L, (long)l), (Object)objectArray4, (long)-8397265659065006961L, (long)l);
                try {
                    try {
                        object = callSite;
                        if (callSite3 != null) break block30;
                        if (object != null) break block31;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                    }
                    return new dC(f10, f);
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-8403209690625425005L, (long)l);
                }
            }
            object = new dC((float)d_.d("\u00d3", (Object)callSite, (Object)new Object[0], (long)-8425082587392275018L, (long)l), f);
        }
        callSite2 = object;
        d_.d("\u00d3", (Object)callSite2, (Object)new Object[]{(boolean)d_.d("\u00d3", (Object)callSite, (Object)new Object[0], (long)-8398647309072918166L, (long)l)}, (long)-8426056415676972161L, (long)l);
        return callSite2;
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

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4102;
        if (ib[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])jb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            d_.ib[n2] = n3;
        }
        return ib[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = d_.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d_.m(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                d_.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void n(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        float f;
        d_ d_2;
        long l;
        long l2;
        block9: {
            block7: {
                CallSite callSite3;
                block6: {
                    CallSite callSite4;
                    CallSite callSite5;
                    block8: {
                        block5: {
                            CallSite callSite6;
                            block4: {
                                float f10 = ((Float)objectArray[0]).floatValue();
                                l2 = (Long)objectArray[1];
                                l = (l2 = Y ^ l2) ^ 0x15B61D4244A8L;
                                callSite5 = d_.d("\u00d3", (Object)d_.d("\u00ff", (long)502897651048428732L, (long)l2), (Object)new Object[0], (long)498791424546725010L, (long)l2);
                                callSite4 = d_.d("y", (long)496785774852923813L, (long)l2);
                                try {
                                    d_2 = this;
                                    f = f10;
                                    callSite6 = callSite5;
                                    if (callSite4 != null) break block4;
                                    if (callSite6 == null) break block5;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)501827230744071172L, (long)l2);
                                }
                                callSite6 = callSite5;
                            }
                            callSite2 = d_.d("\u00d3", (Object)callSite6, (Object)new Object[0], (long)469232519554727969L, (long)l2);
                            break block8;
                        }
                        callSite2 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)501594575711335036L, (long)l2), (long)504077205161482959L, (long)l2);
                    }
                    try {
                        callSite3 = callSite5;
                        if (callSite4 != null) break block6;
                        if (callSite3 == null) break block7;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)501827230744071172L, (long)l2);
                    }
                    callSite3 = callSite5;
                }
                callSite = d_.d("\u00d3", (Object)callSite3, (Object)new Object[0], (long)497908069272493471L, (long)l2);
                break block9;
            }
            callSite = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)501594575711335036L, (long)l2), (long)503158435307587408L, (long)l2);
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l;
        objectArray2[2] = Float.valueOf((float)callSite);
        objectArray2[1] = Float.valueOf((float)callSite2);
        objectArray2[0] = Float.valueOf(f);
        d_.d("\u00d3", (Object)d_2, (Object)objectArray2, (long)495570939496462985L, (long)l2);
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d_.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d_.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean h(Object[] objectArray) {
        boolean bl;
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            class_2338 class_23382;
            block9: {
                block10: {
                    class_23382 = (class_2338)objectArray[0];
                    l = (Long)objectArray[1];
                    l = Y ^ l;
                    callSite2 = d_.d("y", (long)-6297209398334599206L, (long)l);
                    try {
                        try {
                            callSite = d_.d("Z", (Object)b, (long)-6296749514933339456L, (long)l);
                            if (callSite2 != null) break block9;
                            if (callSite != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-6302233146611015045L, (long)l);
                        }
                        return false;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-6302233146611015045L, (long)l);
                    }
                }
                callSite = d_.d("Z", (Object)b, (long)-6296749514933339456L, (long)l);
            }
            CallSite callSite3 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)callSite, null, (Object)new class_238(class_23382), (long)-6297619415922898049L, (long)l), (long)-6269343375681678185L, (long)l);
            while (d_.d("\u00d3", (Object)callSite3, (long)-6301613654449215710L, (long)l) != false) {
                block13: {
                    int n;
                    block12: {
                        class_1297 class_12972 = (class_1297)d_.d("\u00d3", (Object)callSite3, (long)-6304141399747082783L, (long)l);
                        try {
                            try {
                                bl = class_12972 instanceof class_1701;
                                if (callSite2 != null) break block11;
                                if (callSite2 != null) break block12;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-6302233146611015045L, (long)l);
                            }
                            if (!bl) break block13;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-6302233146611015045L, (long)l);
                        }
                        n = 1;
                    }
                    return n != 0;
                }
                if (callSite2 == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d_.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d_.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = kb;
        kb[0] = "\nr\u0016\u0016F~\u001cr\u0013LUi\u000b9\u0010JY}\u001a~\u0007]\u0012j*";
        objectArray[1] = "qPp-gT\u0004p{\"v\u001be~p)rA\u0011";
        objectArray[2] = "$\u007fj|Q72\u007fo&B %4l N44s{7\u0005#\u0003";
        objectArray[3] = "\"UW\u0002+??@\u000f j2'F";
        objectArray[4] = Integer.TYPE;
        d_.lb[4] = "java/lang/Integer";
        objectArray[5] = "Ds\u0013:+gRs\u0016`8pE8\u0015f4dT\u007f\u0002q\u007fvh";
        objectArray[6] = "_?-c\ro*\u001f&l\u001c W\u00075k\u0015i?";
        objectArray[7] = ",I;7\u0007\u001e,I,k\u000b\u00116\u0002,u\u000b\u00041s|(Z";
        objectArray[8] = "V\u0003Ruh@V\u0003E)dOLHE7dZK9\u0011o3";
        objectArray[9] = "D\u0005\u001d\u0003r5D\u0005\n_~:^N\nA~/Y?_\u001e'";
        objectArray[10] = "&A\u00005\u0005N0A\u0005o\u0016Y'\n\u0006i\u001aM6M\u0011~QZ\u001d";
        objectArray[11] = "8''q\bo3(6>kb&%9U^`76%yIm";
        objectArray[12] = "^(\\M_\"^(K\u0011S-DcK\u000fS8C\u0012\u0019T\u000br";
        objectArray[13] = "hx'\\7Rhx0\u0000;]r30\u001e;HuBbEc\t";
        objectArray[14] = "J7;/@4\\7>uS#K|=s_7Z;*d\u0014 o";
        objectArray[15] = "*8|dl\u0007_\u0018wk}H>\u0016|`y\u0012J";
        objectArray[16] = Void.TYPE;
        d_.lb[16] = "java/lang/Void";
        objectArray[17] = Boolean.TYPE;
        d_.lb[17] = "java/lang/Boolean";
        objectArray[18] = "0CY\u0001\u001220CN]\u001e=*\bNC\u001e(-y\u001c\u0018Jh";
        objectArray[19] = Float.TYPE;
        d_.lb[19] = "java/lang/Float";
        objectArray[20] = ",O\r-\u0010\u007f,O\u001aq\u001cp6\u0004\u001ao\u001ce1uK0N.";
        objectArray[21] = "@(AO^R5\bJ@O\u001dT\u0006AKKG ";
        objectArray[22] = "pU\u001a\u0003z+\u0005u\u0011\fkdd{\u001a\u0007o>\u0010";
        objectArray[23] = "\u0005\u0002\t\t3b\u0005\u0002\u001eU?m\u001fI\u001eK?x\u00188L\u001fn9";
        objectArray[24] = "kmG\u007f'#\u001eMLp6l\u007fCG{26\u000b";
        objectArray[25] = "\\Rk#B;)r`,StH|k'W.<";
        objectArray[26] = "}?qhp\u000bv0`'\u001c\bx2bh0";
        objectArray[27] = "bv$eVgtv!?Epc=\"9Idrz5.\u0002tjz7%X9Va78X~av";
        objectArray[28] = "aD\u00194q]\u0014d\u0012;`\u0012uj\u00190dH\u0001";
        objectArray[29] = "\u000bv8;l\\~V34}\u0013\u001fX8?yIk";
        objectArray[30] = "LTcB[JZTf\u0018H]M\u001fe\u001eDI\\Xr\t\u000f^c";
        objectArray[31] = "0T<\u0001\u0019y;[-Nxw0P)\u0014";
        objectArray[32] = "\u0016#XDr|\u001d,I\u000b\u000fd\u000e+@B";
        objectArray[33] = "py\u0001$n.{v\u0010k\r#np";
        objectArray[34] = "ED\tCn#NK\u0018\f\t![@\u0018G2";
        objectArray[35] = "Xm|\u0001WsNmy[DdY&z]HpHamJ\u0003ae";
        objectArray[36] = "\u0018by\u0005\fz\u000eb|_\u001fm\u0019)\u007fY\u0013y\bnhNXi\u000e";
        objectArray[37] = "\u0013\u0015\f#&lf5\u0007,7#\u0007;\f'3ys";
        objectArray[38] = "AH[)\u0004<AHLu\b3[\u0003Lk\b&\\r\u001e1_d";
        objectArray[39] = "\u0001]/\nJ^t}$\u0005[\u0011\u0015s/\u000e_Ka";
        objectArray[40] = "\u0004C\u001a(W>qc\u0011'Fq\u0010m\u001a,B+d";
        objectArray[41] = "4j'6whAJ,9f' D'2b}T";
        objectArray[42] = "W\u0011d>\u0006%W\u0011sb\n*MZs|\n?J+)#X}";
        objectArray[43] = "\u000bE^1Ae\u000bEImMj\u0011\u000eIsM\u007f\u0016\u007f\u0013,\u001f8";
        objectArray[44] = ":@q&5x$HkiHh$";
        objectArray[45] = ":\u001e,_(>:\u001e;\u0003$1 U;\u001d$$'$jB|";
        objectArray[46] = "`\f~_\u0003/`\fi\u0003\u000f zGi\u001d\u000f5}69HXs";
        objectArray[47] = "$\\\u001d-\u0018S$\\\nq\u0014\\>\u0017\no\u0014I9f[0@\n";
        objectArray[48] = "&`OCz\u001eS@DLkQ2NOGo\u000bF";
        objectArray[49] = "0-yz\u0013\u001eE\rru\u0002Q$\u0003y~\u0006\u000bP";
        objectArray[50] = "\u0018I<Ys\u001a\u0018I+\u0005\u007f\u0015\u0002\u0002+\u001b\u007f\u0000\u0005syE(J";
        objectArray[51] = "lUdDY\f\u0019uoKHCx{d@L\u0019\f";
        objectArray[52] = "\u0011y=W\u0018\u0017\u0011y*\u000b\u0014\u0018\u000b2*\u0015\u0014\r\fC\u007fJC";
        objectArray[53] = "8\u00120&;s8\u0012'z7|\"Y'd7i%(u:`\"";
        objectArray[54] = "-)E@ii(<N@br$,\f)IX\u0015";
        objectArray[55] = Long.TYPE;
        d_.lb[55] = "java/lang/Long";
        objectArray[56] = "*\u0012J^~1*\u0012]\u0002r>0Y]\u001cr+7(\u000f@'i";
        objectArray[57] = "hf#{s~~f&!`ii-%'l}xj20'@";
        objectArray[58] = "-y\u0010!0MXY\u001b.!\u00029W\u0010%%XM";
        objectArray[59] = "\t_|F\u0005_\t_k\u001a\tP\u0013\u0014k\u0004\tE\u0014e;^_\u0003CYd\t\u001bE8\t8^";
        objectArray[60] = "\u001anI\r2\u000e\u001an^Q>\u0001\u0000%^O>\u0014\u0007T\u000e\u0012j";
        objectArray[61] = "48n@ +48y\u001c,$.sy\u0002,1)\u0002)^y";
        objectArray[62] = "`i'(\f5`i0t\u0000:z\"0j\u0000/}Sa>Uj";
        objectArray[63] = "]`9\u001dO3]`.AC<G+._C)@Z\u007f\u000b\u0016l\u0017f!RQ)l7u\u0007\u0015";
        objectArray[64] = "08Ud[]E\u0018^kJ\u0012$\u0016U`NHP";
        objectArray[65] = "\u0013Q8j{nfq3ej!\u0007\u007f8nn{s";
        objectArray[66] = "O,\u0000\u0007~IO,\u0017[rFUg\u0017ErSR\u0016F\u001f+\u0010";
        objectArray[67] = "3O6\\r7Fo=Scx'a6Xg\"S";
        objectArray[68] = "6F@ c>CfK/rq\"h@$v+V";
        objectArray[69] = "XqF\rFw-QM\u0002W8L_F\tSb8";
        objectArray[70] = "c:LE\u0001\u0001u:I\u001f\u0012\u0016bqJ\u0019\u001e\u0002s6]\u000eU\u0013o";
        objectArray[71] = "\u0006#{,\u001bhs\u0003p#\n'\u0012\r{(\u000e}f";
        objectArray[72] = "AG\rn.{AG\u001a2\"t[\f\u001a,\"a\\}Kuz$";
        objectArray[73] = "q&$N3X\u0004\u0006/A\"\u0017e\b$J&M\u0011";
        objectArray[74] = "\tQ/,\u0012,|q$#\u0003c\u001d\u007f/(\u00079i";
        objectArray[75] = "\u0015hE`j\u001d\u0003h@:y\n\u0014#C<u\u001e\u0005dT+>\t=";
        objectArray[76] = "\u0017Ht\bsObh\u007f\u0007b\u0000\u0003ft\ffZw";
        objectArray[77] = "T\nl'g\u001b!*g(vT@$l#r\u000e4";
        objectArray[78] = "g6|x\u0003*\u0012\u0016ww\u0012es\u0018||\u0016?\u0007";
        objectArray[79] = "\u000e'4\u0007?Q\u000e'#[3^\u0014l#E3K\u0013\u001dq\u001fg\u000f";
        objectArray[80] = ")12{\u007fj?17!l}(z4'`i9=#0+~\u001c";
        objectArray[81] = "\u000f;ZYf\u001dz\u001bQVwR\u001b\u0015Z]s\bo";
        objectArray[82] = "\u000e\tk'f\u001b{)`(wT\u001a'k#s\u000en";
        objectArray[83] = "\u001aU\u001fZ\u0004oou\u0014U\u0015 \u000e{\u001f^\u0011zz";
        objectArray[84] = "ug}*\\uugjvPzo,jhPoh];0\u0002";
        objectArray[85] = Double.TYPE;
        d_.lb[85] = "java/lang/Double";
        objectArray[86] = "\u000f17@8\u000ez\u0011<O)A\u001b\u001f7D-\u001bo";
        objectArray[87] = "\"]~<hBW}u3y\r6s~8}WB";
        objectArray[88] = "$n*riF2n/(zQ%%,.vE4b;9=Pu";
        objectArray[89] = "wo\u0001fS/\u0002O\niB`cA\u0001bF:\u0017";
        objectArray[90] = "T3\u0007\u0001NL!\u0013\f\u000e_\u0003@\u001d\u0007\u0005[Y4";
        objectArray[91] = "y\u000731`\u000bo\u00076ks\u001cxL5m\u007f\bi\u000b\"z4\u0018%";
        objectArray[92] = "`@nrh3\u0015`e}y|tnnv}&\u0000";
        objectArray[93] = "&n,9B\u000bSN'6SD2@,=W\u001eF";
        objectArray[94] = "}Es!| \bex.moiks%i5\u001d";
        objectArray[95] = "\u001fR\u0019ykXjr\u0012vz\u0017\u000b|\u0019}~M\u007f";
        objectArray[96] = "\u007f_\u001d^.-\n\u007f\u0016Q?bkq\u001dZ;8\u001f";
        objectArray[97] = "j,4\u0010Wn\u001f\f?\u001fF!~\u00024\u0014B{\n";
        objectArray[98] = "4X.\u001d6\u0004\"X+G%\u00135\u0013(A)\u0007$T?Vb\u0011";
        objectArray[99] = "\u001d|\u0001.b\th\\\n!sF\tR\u0001*w\u001c}";
        objectArray[100] = "8D\b\"F Md\u0003-Wo,j\b&S5X";
        objectArray[101] = "\u0001xmM~f\u0001xz\u0011ri\u001b3z\u000fr|\u001cB(T#>";
        objectArray[102] = "4Sl'\u0001m\"Si}\u0012z5\u0018j{\u001en$_}lU~?";
        objectArray[103] = "u\u0015\u0011\u00123t\u00005\u001a\u001d\";a;\u0011\u0016&a\u0015";
        objectArray[104] = "M\u0001q9UD8!z6D\u000bY/q=@Q-";
        objectArray[105] = "+%X4\u0015\u001b^\u0005S;\u0004T?\u000bX0\u0000\u000eK";
        objectArray[106] = "91h'L]L\u0011c(]\u0012-\u001fh#YHY";
        objectArray[107] = "\u0014Qsh\fM\u0014Qd4\u0000B\u000e\u001ad*\u0000W\tk5tU\u0012";
        objectArray[108] = "\tXXq+g\tXO-'h\u0013\u0013O3'}\u0014b\u001emr6";
        objectArray[109] = ":1\u0005CXE,1\u0000\u0019KR;z\u0003\u001fGF*=\u0014\b\fQ\u0010";
        objectArray[110] = "uAT~\u0001T\u0000a_q\u0010\u001baoTz\u0014A\u0015";
        objectArray[111] = "KVRz\bz>vYu\u00195_xR~\u001do+";
        objectArray[112] = "\u0015O\u000f!M|\u0003O\n{^k\u0014\u0004\t}R\u007f\u0005C\u001ej\u0019h>";
        objectArray[113] = "\u0011H,VI\u001ddh'YXR\u0005f,R\\\bq";
        objectArray[114] = "J H'$\u0018\\ M}7\u000fKkN{;\u001bZ,Ylp\f~";
        objectArray[115] = "`\" tc\u000f\u0015\u0002+{r@t\f pv\u001a\u0000";
        objectArray[116] = "\u001eq\"=\u0002_kQ)2\u0013\u0010\n_\"9\u0017J~";
        objectArray[117] = "`\u0001P\bsWv\u0001UR`@aJVTlTp\rAC'CI";
        objectArray[118] = "\u0007\u001fN/oTr?E ~\u001b\u00131N+zAg";
        objectArray[119] = "a)E%u \u007f!_j\u0012!n:R04'";
        objectArray[120] = "<`/\t\u0015X\"h5FwD%u";
        objectArray[121] = "pE\u000f\":\"pE\u0018~6-j\u000e\u0018`68m\u007fJ>n|";
        objectArray[122] = "As\b6\u000fcAs\u001fj\u0003l[8\u001ft\u0003y\\IN+Z";
        objectArray[123] = "\u001fR<k,]\tR91?J\u001e\u0019:73^\u000f^- xI<";
        objectArray[124] = "Hza\u0011D:=Zj\u001eUu\\Ta\u0015Q/(";
        objectArray[125] = "?gS\u0019\u0003tJGX\u0016\u0012;+IS\u001d\u0016a_";
        objectArray[126] = "/U\u00133b\u0012Zu\u0018<s];{\u00137w\u0007O";
        objectArray[127] = ";\u001e7\u000bKgN><\u0004Z(/07\u000f^r[";
        objectArray[128] = "\r!`lg\u0000x\u0001kcvO\u0019\u000f`hr\u0015m";
        objectArray[129] = "_\u001cI+x%T\u0013Xd\u0010%Z\u001cK";
        objectArray[130] = "\fGTW\u000eTyg_X\u001f\u001b\u0018iTS\u001bAl";
        objectArray[131] = "3E3t\u000f\u0007Fe8{\u001eH'k3p\u001a\u0012S";
        objectArray[132] = "WZ'l\u007fX\"z,cn\u0017Ct'hjM7";
        objectArray[133] = "5\u0010)\b~w+\u00183G6w1\u0012+\u0000?lq!-\f4k<\u0010+\f";
        objectArray[134] = "o\u00071$\u0011[o\u0007&x\u001dTuL&f\u001dAr=v3I\u000b";
        objectArray[135] = "t\u0014i+Jft\u0014~wFin_~iF|i..0\u0014=";
        objectArray[136] = "0,\u0019 6F0,\u000e|:I*g\u000eb:\\-\u0016_=b\u000b=%\f}(pl}]";
        objectArray[137] = "/>U'\u001ff/>B{\u0013i5uBe\u0013|2\u0004\u00120G6e8Mh\u0001|\u001ei\u0015;";
        objectArray[138] = "\u001bKc\u001ax\u0003\u001bKtFt\f\u0001\u0000tXt\u0019\u0006q$\r SQM{Uf\u0019*\u001d.\u0002%";
        objectArray[139] = "\u0002\u0019uy=\u0006\t\u0016d6Z\u001e\r\nbz\u007f\u000f";
        objectArray[140] = "TG\u001cc)\\\u0003FC\u0019r1\u0007]\u001a!~_SVM%f1\u0004Q\u0011$jS\u0006\u0001\u001fx\u0018";
        objectArray[141] = "7\u001a\u0011Fq6oF\u0016H\u001c\"g]\u001f^p\u00100\u001bA\t'G3\u001b\rKe=0\\\u0013S&G";
        objectArray[142] = "1\u0001h|\u00110l\u00068&p5S\n8&\u00144!\u001f)#\u0011";
        objectArray[143] = "*f\u000f]8b 0O\u0001Jf5#\u0014^&TbdJ\u0007w\u00033g\u001a\b8}90\u0010ZJ";
        objectArray[144] = "G\u0012^WN>C\u0018\u000f\u000fCR\u001b\u001a\u0012\u000eC>)NVT\u0019RG\u0012^WN>C\u0018\u000f\u000fCRG\u0011\u0004\u0015_o\u0010K\u0010\nZR";
        objectArray[145] = "h&v\r\u0018|7=vQgjf!i_0>=p7\ng5euqA\u001dil!6";
        objectArray[146] = "b%\u0011\u0018d?6-I\u0017\u0006>]&\u0012\u0014>93r\u0019C:!]wH\u001c7-#}\u001f\u0016e_";
        objectArray[147] = "C(bwe)\u0010*xds\u0014\u001f}~{}x-*3\"+\u0014Cqxg&~\u0015v3|t\u0014C)kv~u\u0003,e&c\u0014\b)y\u007fhu\u0002\u007f9#\u001a";
        objectArray[148] = "/I_\u0014Z8v\u001a\u000e\nKQ|*^\bGipD\n\u0003\u0010mh*\u000e\u0010PkiV\u0002\u0012Qh\u0016";
        objectArray[149] = "F(8UZi\u0002k!\u0012\"h\u0016(<ONZEme\u0015\"fC:mZ\\l\u00140?(";
        objectArray[150] = "\u0011\u0011\u000bm\n\u0012FH\u0004i`\u0014\u0011\r\u000e5\f&@OSoPqE\u0014^k\n\u001dA\u001e\u000f3\u0007q";
        objectArray[151] = "]\u0004y-\u0013(\u001e\u0017fto>Ng{6\u000f:\u0010Xe(\u001f; \u0003c*\fi\u001f\u001d}:\rYD\u001b\u007f)_fZ\u0005o(o=\\\u0007|zP#B\u0017}J\u000b%@\u0004/u\u0015;P\u0005\u001f.\u00139CW 0\r)Bg{6\u000f:\u0010Xe(\u001f; \u001a|,\b%QYo3QY";
        objectArray[152] = "SCB\u0006Y\u0002GUOThS+\u0017N\rP_ECEZTG+GV\u001aRFWKT\u001bQ9";
        objectArray[153] = "u2\u0004b!\u001cq8U:,p\"6Y?''ul\tbKI*=O v\u001ep)P%";
        objectArray[154] = "6\u0011.DV\u001bb\u0019vK4\u0018\t\u0012-H\f\u001dgF&\u001f\b\u0005\tB5_\u000e\u0004uN7^\r{";
        objectArray[155] = "c }\u007fX(apsq\"wqbmhNE%!2?\u0019\u0012&{<}Golyq4Y\u0012";
        objectArray[156] = "_Q\u001dQ\u0012\u0012T\u001f\bBv\u001fR\u0006\u001e:O\u0010S\u001a\u001e\u0007\u0018JG\u0005\u001b:O\u0010S\u001a\u001e\u0007\u0018JG\u0005\u001b:";
        objectArray[157] = "K^\u0017\u001an0\u0010\t\u000b_%\n\u001f\u0005\u001bE8]H\\O\u001fk\nK^\bF?p\u0014\u0005\u000fK>";
        objectArray[158] = "\u001f\u00183\u00167&K\u0010k\u0019U( \u001b0\u001am NO;Mi8 \u001ak\u000edzYA)@*F";
        objectArray[159] = "\u000b2aUV,\tbo\t$$2fn\u000e\u001c(\\2eY\u0018020p\u000f@0\u0003cj\u0015AN";
        objectArray[160] = "B<B+\u0019\u0013\u0010:JzAh\u0015c\u001e/J?B3Kw&QE~\u001f+E\u000b\u0011?\u0003&";
        objectArray[161] = "ca\u00023m\u0013gkSk`\u007f?iNj`\u0013\r=\n06\u007fca\u00023m\u0013gkSk`\u007f";
        objectArray[162] = "uj[Kf\\!b\u0003D\u0004UJiXG<Z$=S\u00108BJ>ZD;V)i\u0003K?<";
        objectArray[163] = "'z\u0013=$\u0015vx\u0010}>ltD\u0015&)T{*A-~PcD\u0015zs\u0015v=DxpUlD";
        objectArray[164] = "\u0016\u0007o\u001a\u0018\u001e\u001dIz\t|\u0001\tMkqE\u001c\u001aLlL\u0012F\u000eSiqE\u001c\u001aLlL\u0012F\u000eSiq";
        objectArray[165] = "@P>Q ~\u0019\u0003oO1\u0017\u00103?M=/\u001f]kFj+\u00073<L`i\u0002Ze\u001f1w\u00133";
        objectArray[166] = "$\ri\u0001 \u0007q^aF\u001a\u0017@Y{\u001cyN\u007fGe\fx~";
        objectArray[167] = ">\n\u00132\u0019\u001dzI\nua\u001cn\n\u0017(\r.9JGuQyhN\u0019~\u0013\u0007b\u0019\u0013,a";
        objectArray[168] = "Sl8l\u0001cQ<60shj877Kg\u0004l<`O\u007fjim?Bs\u0014c:5\u0010\u0001";
        objectArray[169] = "w\u0005!COZ$\u0017\"M/B$\u0005>ACpyBe\u001b/\u001d\"\u0018:YN['Ef\u001c/\u001d%D%B\u0012D.\u0002dA/\u001d#\u0001?^AY)\b3\u001e/";
        objectArray[170] = "oTB\u0017l\u0019:_F\rm|<%\u0003\u0015wD0KW\u001e @(%U\u000bv\u0018(\u0014\u0006\u0011l\u0019V";
        objectArray[171] = "8Mv\u001cS#o\u0014y\u00189%8QsDU\u0017l\u0015)\u001d\u0005@n\u0014a\u0012\u000595V/\\9";
        objectArray[172] = "\u0003hf`\\\u0016\u0007l9gFk_l'm]\u0007m;e7\u0002W:;as]\u0000@d:tP\u0001:";
        objectArray[173] = "deJ;D\u0019k3X+{\u001bu7W9,L-b\bk{\u0005+#]j\u0017\n}1M";
        objectArray[174] = "aI8\u0017:`h\u000b5K%\u000f7\u0014'\u000e\u000eb$5.\f:b\u0012\r5\r&iXIs\u0013>ka\r%\u001b#3XKp\u0003p3!\u00102M>\u000fcI;@}v8\u000bu\u000eA";
        objectArray[175] = "\u0016^\"-|WS\u0005*%\u001cR*X$!xE\u0016^$1p8";
        objectArray[176] = "o4u+'Zdz`8CPmcj:C\u0007onv;~P5zi>C\u0007onv;~P5zi>C";
        objectArray[177] = "\b\u0018\u007f)[TO\u001a';D;[${+M\u0003TJ/ \u001a\u0007L${u\u0015[BK<wMI]$";
        objectArray[178] = "D=r->Q\u001cau#SN\u0018kx>\u0004\u0019F8!R-@H7a.?D\u001e7";
        objectArray[179] = "l[b#B4gZa\"0!;@Ww\\Nm\u0005\u007f+\f76G1e0";
        objectArray[180] = "\tT~!'mVO~}X{\u0007Sas\u000f%X\u00038\u001fiw_Bwe5~\u000b\u0005";
        objectArray[181] = "Ep nu%\u001d,'`\u0018:\u0019&*}OmF{q\u0011&(\u0007..lu:\u0004 ";
        objectArray[182] = "\n@\u0016BM\u001d\u001eV\u001b\u0010|Hr\u0014\u001aID@\u001c@\u0011\u001e@XrE@AMT\fO\u0017K\u001f&";
        objectArray[183] = "\u001b.U\u0000m\nD5U\\\u0012\u001c\u0015)JREBNt\u0017>#\u0010M8\\D\u007f\u0019\u0019\u007f";
        objectArray[184] = "YW5\u001c\u000f[\r_m\u0013mWfT6\u0010U]\b\u0000=GQEfUm\u0004\\\u0007\u001f\u000e/J\u0012;";
        objectArray[185] = "J|]@\\\u0013\rqK\u0000\u001f,\u001a\u0010\f\\D\u0014\u0016~XW\u0013\u0010\u000e\u0010ZBEH\u000e!\tX_Ip";
        objectArray[186] = "!(\u001aT'{ek\u0003\u0013_zq(\u001eN3H!dD\u0019_s`3\u001aWn z)\u001b)fz,m\u0014Ebp}5\u0019)";
        objectArray[187] = "i\u001a/lVB>\u001bp\u0016\u000e/:\u0000).\u0001An\u000b~*\u0019/9\f\"+\u0015M;\\,wg";
        objectArray[188] = "YQ\u007fE=>YAl\u0002E+\u0004_s\u001a)\u0019V\u0012-EE%QM\"\u000f;/\u0006Gp}";
        objectArray[189] = "O5\t?Bl\u00184VE\u001c\u0001\u001c/\u000f}\u0015oH$Xy\r\u0001L7\u0018\u007f\f}@5\u0019|s";
        objectArray[190] = "McV)P`\u0019k\u000e&2er`U%\nf\u001c4^r\u000e~r0M2\b\u007f\u000e<O3\u000b\u0000";
        objectArray[191] = "G.\u0004a&UC$U9+9\u001b&H8+U)r\fbr9G.\u0004a&UC$U9+9G-^#7\u0004\u0010wJ<29";
        objectArray[192] = "X|UiT>\ft\rf62g\u007fVe\u000e8\t+]2\n g.\fm\u0007,\u0019$[gU^";
        objectArray[193] = "A>;\u0005T=\u0001;5UI\\\u0016f?\f\\\u000bE7jX0eAn?\fQ%D`o\u0011";
        objectArray[194] = "\u0000\u001f5\u0003czW\u001ejy<\u0017S\u00053A4y\u0007\u000edE,\u0017\u0003\u001d$C-k\u000f\u001f%@R";
        objectArray[195] = "Eb`^(nOrj]Tnt(zYlh\u001a|q\u000ehptxbNnq\bt`Om\u000e";
        objectArray[196] = "/D\f\f\u007f\u000e{LT\u0003\u001d\u0004\u0010G\u000f\u0000%\b~\u0013\u0004W!\u0010\u0010\u0011\u0011\u0001y\u0010!B\u000b\u001bxn";
        objectArray[197] = "'u>2R\u0003s}f=0\n\u0018v=>\b\u0005v\"6i\f\u001d\u0018+b?Y\u0011ju52_c";
        objectArray[198] = "|JY\u0019*\u0015\u007fJ\u0000\u0000{q,2\\\u001d,I#\\\b\u0016{M;2\f\u0005;K:N\u0000\u0007:HE";
        objectArray[199] = "#|\r6Q\u0005g?\u0014q)\u0004s|\t,E6%>Uv\u0015ar|\u000e/WP!f\u0014.)";
        objectArray[200] = "O_M\u001fI\u0015\u001bW\u0015\u0010+\u0018p\\N\u0013\u0013\u0013\u001e\bED\u0017\u000bp]\u0015\u0007\u001aI\t\u0006WITu";
        objectArray[201] = "'\u0001\u0017\t\u001f\u0016pX\u0018\ru\u0010'\u001d\u0012Q\u0019\"sYH\bMuqX\u0000\u0007I\f*\u001aNIu";
        objectArray[202] = "#5\u0006\u0019we7#\u000bKF7[a\n\u0012~855\u0001Ez [<U\u0013/,)b\u0002\u001e)^";
        objectArray[203] = "\u001bX.V\u001aZHJ-XzBHX1T\u0016p\u001c\u001bn\u000f@'\u001fG.\\CLLUj]K'Z\u001a!C\u0000\u001dXJ/Mz";
        objectArray[204] = "vJk\"DK0Nj0O%*M!!>A0@2m\u0001_.P3]";
        objectArray[205] = "U\\v\u001eC\u001c_L|\u001d?\u0013d\u0016l\u0019\u0007\u001a\nBgN\u0003\u0002dFt\u000e\u0005\u0003\u0018Jv\u000f\u0006|";
        objectArray[206] = "w2F@\f\u0013vmZ\u0016\\o(;FLT\u0003\u001ao\u0007\u0017\rUMo\\FH\u0014p8\u0006RW\u0011M:FKW\u0011|i\\QVo";
        objectArray[207] = "\fL,b\u0015M\bF}:\u0018![Hq?\u0013v\f\u0012!c\u007f\u0018SCg BO\tWx%";
        objectArray[208] = "\u0003\u001bGdx,\\\u0000G8\u0007:\r\u001cX6PdW@\rZ66U\rN j?\u0001J";
        objectArray[209] = "\u001cq\u0004;]\u001aKp[A\u0001wOk\u0002y\n\u0019\u001b`U}\u0012w\u001fs\u0015{\u0013\u000b\u0013q\u0014xl";
        objectArray[210] = "S\t\u000bd8\b\u0017J\u0012#@\t\u0003\t\u000f~,;UKS$}l\u0002\t\b}>]Q\u0013\u0012|@";
        objectArray[211] = ">\u0001t\u001bnh`Vy\u001d\u001c{?@M\u001bxg4<(Kn+eEs\t eY";
        objectArray[212] = "Vs$\u0003[s\u0002{|\f9pip'\u000f\u0001u\u0007$,X\u0005mi!}\u0007\ba\u0017+*\rZ\u0013";
        objectArray[213] = "\u0014*Oz\trPiV=qsD*K`\u001dA\u0010f\u00146A\u0016\u00103\u001b>\u001bz\u00149Jf\u0016\u0016";
        objectArray[214] = "$\u0000IONFy\u0007\u0019\u0015/YF\u0005\u000b\u0011U\u000f+R\nN";
        objectArray[215] = "\u0004.<Z\u0018(Q%8@\u0019MT_}X\u0003u[1)STqC_,\u0002\u000b|O!&U\u0001.=";
        objectArray[216] = "$\u0000G v\u000bp\b\u001f/\u0014\u0006\u001b\u0003D,,\ruWO{(\u0015\u001bR\u001e$%\u0019eXI.wk";
        objectArray[217] = "A\u0013\u0000\u000f<OE\u0019QW1#\u001d\u001bLV1O/O\b\fl#A\u0013\u0000\u000f<OE\u0019QW1#A\u0010ZM-\u001e\u0016JNR(#";
        objectArray[218] = "\u000b\u0003g@CkH\u0010x\u0019?q\u0011\u0006}N^|\r`e[_yF_{EOxv\u000b9I\u000eh\b\u0001nC\\\u001a";
        objectArray[219] = "&fi8f:~:n6\u000b%z0c+\\r$c>G2s{1xzaqa\"n";
        objectArray[220] = "JrTlZN\u000e1M+\"O\u001arPvN}I7\b-\"\u0013Ng]uCSKi\rh\"@\r\u007f\nn^L\u000f~\t\u0011";
        objectArray[221] = "0p\u0011\tStsc\u000eP/b#\u0013\u0013\u0012Of},\r\f_gMn\u0014\bHy<-\u0007\u0017\u0011\u0005";
        objectArray[222] = "\u0007:p* xS2(%Bw89s&z~Vmxq~f8h).sjFb~$!\u0018";
        objectArray[223] = "9?<$ru}55(2\u001bl88E1\"qdx<j`?*D!v{`e{?hkaU";
        objectArray[224] = "{oF^a'0f\u001fZe[)\u0000DRdc$n\u0010Y3g<\u0000\u0015\blj0~\u001f_f8B";
        objectArray[225] = "RRw@\u000b\u0014\u0006Z/Oi\u0013mQtLQ\u0012\u0003\u0005\u007f\u001bU\nm\u0001l[S\u000b\u0011\rnZPt";
        objectArray[226] = "~F\u007fl\u00147uG|mf\")]_/\u000b \"!+l\u0014|xXp.Z2D";
        objectArray[227] = "H l#QLH0\u007fd)Y\u0015.`|EkEb>*\u0015<\u000491}CS\u00193yu)X\u00042c+\u0016F\u001a\"b\u001b";
        objectArray[228] = "YSG\u0011\u0003I\u0001\u000f@\u001fnV\u0005\u0005M\u00029\u0001[R\u0015nSD\u0000\u0015Q\n\u0017\u0007\u0019R";
        objectArray[229] = "\u0017Dbg\\\u0012\u0014\u0003|\u007f\u001fhK\u0013luB\u0004yB,$\u001dh\u0017DrjAQS\u0012zw\u0019h";
        objectArray[230] = "\u0005\u0001\u000frLS_UNnA0YR\u000f~K\\k\u0006O%\u00100W\u0007\u001d/^N]P\u0017},";
        objectArray[231] = "k@#u\u001dE?H{z\u007fLTF9.\u0015H:\u0005|$@%k\u0002su\u0012K(Gy \u007f";
        objectArray[232] = "==\u000651\u0018i5^:S\u001c\u0002>\u00059k\u001elj\u000eno\u0006\u0002n\u001d.i\u0007~b\u001f/jx";
        objectArray[233] = "\u0014mS\u0018NiJ:^\u001e<e\u001a4I\u001c{usk\r\u0003\r'\n0OMC\u001b\u0014mS\u0018NiJ:^\u001e<";
        objectArray[234] = "\u0007u#\u000ba/Pi6Er\u0017Sr5\u001f}@\u0004,eF \u0017\u0007u#\u000ba/Pi6Er";
        objectArray[235] = "os7\u0013=X0h7OBNat(A\u0015\u00108'}-sB9e>W/Km\"";
        objectArray[236] = "dL&!NI0D~.,O[O%-\u0014O5\u001b.z\u0010W[\u001f=:\u0016V'\u0013?;\u0015)";
        objectArray[237] = ",\u0011\u001faN!s\n\u001f=17\"\u0016\u00003fcsKZa1h!B\u0018-K4(\u0016_";
        objectArray[238] = "E\"\u001d(Oc\u0001a\u0004o7b\u0015\"\u00192[PFfEe7<A,HiNg\u0003b\u0006U";
        objectArray[239] = "E Ajv\n\u001a;A6\t\u001cK'^8^H\u001br\u0000i\tCHsF&s\u001fA'\u0001";
        objectArray[240] = ": K@lw|$JRg\u0019`#\ny{i|J\u001a\u0007x(r4\u0010Prz\u0000";
        objectArray[241] = "|\u0005\u0011p\u0002)wK\u0004cf$f\\\u000f!ft|_\u0012`[#&K\reft|_\u0012`[#&K\reft|_\u0012`[#&K\ref";
        objectArray[242] = "e@u\u0003z\u0018d\u001fiU*d:Iu\u000f\"\b\b\u001d4T{__Hu\b!\u001an\u001bo\u0012 d3Xn\u000b;U`Bt\nE\b#Cm\u0011t[9Ylo)\u00188@w^z\u0002\"A\t";
        objectArray[243] = "0X\u0003`%\u001c4RR8(plPO9(\u001c^\u0004\u000bcwp0X\u0003`%\u001c4RR8(p0X\u0003`%\u001c4RR8(p";
        objectArray[244] = "un&UT\"1d/Y\u0014L4e,Y,wvvo\bU,48!4";
        objectArray[245] = "7,\"Tyn3(}Sc\u0013k(cYx\u007fYy\"\u0005 /\u000e.'W.ap$p]|\u0013";
        objectArray[246] = "4Mq|\u0015.m\ry3\u001e\u001fc\u0013n'\u0015H4H2|E\u001f4Mq|\u0015.m\ry3\u001e";
        objectArray[247] = "P\\im|_\u0007\u0005fi\u0016YP@l5zk\u0004\u00044b*<P\\im|_\u0007\u0005fi\u0016";
        objectArray[248] = "[k\u0006)v\r_aWq{a\u0007cJp{\r57\u000e+%a[h\\kg\\\f2Htba[h\\kg\\\f2Htba[h\\kg\\\f2Htba[k\u0006)v\r_aWq{a";
        objectArray[249] = "Vl\u0018Z x\u0002d@UBxio\u001bVz~\u0007;\u0010\u0001~fi>A^sj\u00174\u0016T!\u0018";
        objectArray[250] = "#G*\u0010\u00198tFujCUp],RN;$V{VVUsQ'WZ7q\u0001)\u000b(";
        objectArray[251] = "$UVy*T%\nJ/z({\\VurDI\b\u0017.*\u0014\u001e\bL\u007fnS#_\u0016kqV\u001e]VrqV/\u000eLhp(";
        objectArray[252] = "H9I\n\u0018|\u0003:L\bFF\u0018\u0005I\u0015A~\u0017k\u001d\u001e\u0016z\u000f\u0005JJD(\u000euM\f\u0019*\u001a\u0005";
        objectArray[253] = "\u0014=rd\u0013\u0006\u0017=+}BbGEw`\u0015ZK+#kB^SE&:\u001dS_;,m\u0017\u0001-";
        objectArray[254] = "G,9\u000f\u00079\u001c{%JL\u0003\u0013w5PQTD.`\u000e\u0000\u0003G,&SVy\u0018w!^W";
        objectArray[255] = "\u0005t^J#iN}\u0007N'\u0015U\u001b\\F&-Zu\bMq)B\u001b_Kx{_g\u0014B!\u007f[\u001b";
        objectArray[256] = "Qo.9y\u0018Z!;*\u001d\u0006P\"0>\u001dEQ5-) \u0012\u000b!2,\u001dE\r=)6$\u0001[54n\u001d";
        objectArray[257] = "'{~C>ap\"qGTg'g{\u001b8Us#!Bo\u0002q\"iMh{*`'\u0003T";
        objectArray[258] = "x\t7\u0002F~'\u00127^9hv\u000e(Pn6.[v<\bd.\u001f>FTmzX";
        objectArray[259] = "po ~\u001d7*:?.SI \u0004~q\u0004q/j*zSu7\u0004}~\u00008.v4m]%+\u0004";
        objectArray[260] = "@\u0002=\u0015l.\u001f\u00067B\u0013{F\f2Dzw\u007f\u00022T~\u0011JS8\u0018ao@\u00042J\u0013";
        objectArray[261] = "n:S\u0015C\u0015=8I\u0006U(2oO\u0019[D\u00008\u0003H\u0002(j~W\u0004DL.=NC<\u0011nk^\u001d]Qke\u000e\u0000<WirC\u0003\u0006U9|MyN\u0011,fA\u0018DGl:3";
        objectArray[262] = "V+|^=/\t0|\u0002B9X,c\f\u0015g\t}7`s5\u0000=u\u001a/<Tz";
        objectArray[263] = "'N6FQ9g\u000bk\u001fRUtq1GYm{\u001feL\u000eicq1\u001a\u00026s\u001dq__opq";
        objectArray[264] = "\u0007>_+~m\fpJ8\u001a`\u000bu',fn\u0005p\u0016\u007f|t\u0004\u000eK<}m\u001f?\u0018&gla";
        objectArray[265] = "\u001dR_\u0002|(_IJP\f3\tLVU`\u0001Y\f\r\u0002\fm]B\u0007\u000eu6\u001f\fI2<$\b\bNB<4\u001bO6";
        objectArray[266] = "\u0019h-#'\u0007\fy(&[\u001c~8+!c\u0013\u0010l vg\u000b~iq)j\u0007\u0000c&#8u";
        objectArray[267] = "!t}de)z#a!.\u0013u/q;3D\"v!ca\u0013!tb84i~/e55";
        objectArray[268] = "fzS\u0004`\"z&Q\u0004\u0019+za\\\u0018bFg`U\u001f)yy~E\u001e\u0019-;r\u0004\u000eg'lxV|";
        objectArray[269] = "N\"*d8?Lr$jB`\\`:s.R\b#e+}\u0005\\|?+(f\u000b%0/B";
        objectArray[270] = "m%`5d\u001e9-8:\u0006\u001cR&c9>\u0018<rhn:\u0000Rv{.<\u0001.zy/?~";
        objectArray[271] = "KU\u001a\u0010:G@\u001b\u000f\u0003^FL\u0003b@gQ\u001cY\u001b\u001b%\u001fReYB,\u0012\u0011\u001c\u0002\u0000b\\-^[\to\u001fT\u0005\u0019G!#";
        objectArray[272] = "\u000fB0E>\u001aNR'V|{\\8eDdCPV1O3GH8fC2B\\TbIc\u001aQ8";
        objectArray[273] = "\r\"-2\u001f2\ndp0\u000bBQr2<\u0007.c&r`\\B\u000f&<m\\;Tdr#`";
        objectArray[274] = "D\"i*\u0001 \u001b9iv~6J%vx)h\u0011q+\u0014O:\u00124`n\u00133Fs";
        objectArray[275] = "\u0006\u001b-%I`\f\u00107qB\n]\u0000;;Rv[\u0006V{Q0C\u00068=U1Q\rV";
        objectArray[276] = "\u0018<]`]+\\\u007fD'%*H<YzI\u0018\u001e{\u0004\"\u001cO\u001c%\t$O#\u0018/X|BO";
        objectArray[277] = "]OSwhD\u0019\fJ0\u0010E\rOWm|w^\u000b\f2\u0010\u0010\u0012_\u000fr`\u0010\u0002LH\n";
        objectArray[278] = "\u001a@\u000e1BX\u0011\u000e\u001b\"&Y\u0015\u0000va\u001fNML\u000f:]\u0000\u0003pMcT\r@\t\u0016!\u001aC|KO(\u0017\u0000\u0005\u0010\rfY<";
        objectArray[279] = "\f\u000e\u0016K^fX\u0006ND<o3\r\u0015G\u0004`]Y\u001e\u0010\u0000x3HIQL|\tJ\u0019_B\u0006";
        objectArray[280] = "z\u0017\\T\u0004\u001a2U\u000bY\\+&E\u001c\b^G\u0014\u0011ZS\u0007\u0010C\u0011_\u001a\u0006GrH\u001f\u0012ILC";
        objectArray[281] = "?#v&h0k+.)\n>\u0000 u*26nt~}6.\u0000q/\";\"~{x(iP";
        objectArray[282] = "Qb\u0007]\u0012qQr\u0014\u001ajd\fl\u000b\u0002\u0006V^!STj0\u0003)\u0017\u0017\u0010l\n}Pe";
        objectArray[283] = "\u0006G8{NmUE\"hXPZ\u0012$wV<hEh&\u000eP\u0006\u001e\"k\r:P\u0019ip_PU\u0005)-N,Y\u0007(.1";
        objectArray[284] = "P\u000246+.\u0014A-qS/\u0000\u00020,?\u001dSFltSz\u001f\u0012h3#z\u000f\u0001/K";
        objectArray[285] = "!Ctu\u0006(z[g2y1'Edm\u0015\u0003u\u0006>0yosK56\u000041\u0005{\n\u0015(-]z;F27\\\u0004";
        objectArray[286] = "d\u0000+\u000b\u0005e C2L}d4\u0000/\u0011\u0011VbErJM\u0001 \u001e&F\r\u007fb\u00053\u0014}";
        objectArray[287] = "X\ntw|#\f\u0002,x\u001e,g\tw{&%\t]|,\"=g\b,o/\u007f\u001eSn!aC";
        objectArray[288] = "nd+3|S:ls<\u001eQQg(?&U?3#h\"MQ6r7/A/<%=}3";
        objectArray[289] = "Vu\u0010\u0006@\\\u000e)\u0017\b-C\n#\u001a\u0015z\u0014U\u007fFy\u0014\u0013Z.A\u0002F\u0015R\u007f\u0019";
        objectArray[290] = "Q\u001d2S-\u0004SM<\u000f_\rhI=\bg\u0000\u0006\u001d6_c\u0018h\u0019%\u001fe\u0019\u0014\u0015'\u001eff";
        objectArray[291] = "yX>Y\u0007\u0004}H=Ix\u0005eU0X/W5\u0006h\u0005x\u0017o\t2^\u0017\neA:";
        objectArray[292] = "w\toP\u0016&|\blQd3 \u0012I\r\u001c<$n;P\u0016mq\u0017`\u0012X#M";
        objectArray[293] = "\u001ab \u0014o\u001fIp#\u001a\u000f\u0007Ib?\u0016c5\u0014%eI\u000f\u000fD{`\u001blX\u001dtdq6\u000b\u0019s9\f2\u000fFt#q";
        objectArray[294] = "\u0016C#\u0019v~\u001f\u0001.Ei\u0011@\u001e<\u0000B|S9?\u000e\r(\u0015\u0018-\u001b4lC\u00100C\r*\u0016\bcCtqTF-\u007f6(]Kn\u0006mj\u0013\u0005R";
        objectArray[295] = "av\u0004\u0002\u0007{:6\u0007E\t\u001b?s\u0007\u001c\u001fr<\tPD\u000b*dp\u000b\u0006EdX";
        objectArray[296] = "\u0006},tiy\r39g\ra\u0007\u0017=slt\u00066T&kw\u001b6iq1c\u00043T&kw\u001b6iq1c\u00043T";
        objectArray[297] = "P\u000f\u000e\u0011Se[A\u001b\u00027}Qs\u001b\u0015Ml[DvCQkMDK\u0014\u000b\u007fRAvCQkMDK\u0014\u000b\u007fRAv";
        objectArray[298] = "3\u0002m\u0018)\u0019y\u0000 Q7dg\u00061\u000e 30\\gPL^lV.\u000f1\u0014n\u001bg\u0011";
        objectArray[299] = "\bA>qz,M],zdM\\F>~z\u001a\u000b\u001co*\u0016wTJ8vw2HX3h";
        objectArray[300] = "\u0017\u0010\u001en*nH\u000b\u001e2Ux\u0019\u0017\u0001<\u0002,CCYiU'\u001aC\u0019\"/{\u0013\u0017^";
        objectArray[301] = "T/G%NU\u0000'\u001f*,_k,D)\u0014S\u0005xO~\u0010Kk/H\"\u0011G\t-\u0018,M5";
        objectArray[302] = "TL\u0015~;\u0002\u000f\u001b\t;p8\u0000\u0017\u0019!moWNH\u007f<8TL\n\"jB\u000b\u0017\r/k";
        objectArray[303] = "*U\u0000{( n_\twhNyS\u0014\u001a42p\\H%*,`]xqh !M\u0006{?*s?";
        objectArray[304] = "\b\r\u001b#\t>\n]\u0015\u007f{51Y\u0014xC:_\r\u001f/G\"1\u000f\ny\u001f\"\u0000\\\u0010c\u001e\\";
        objectArray[305] = "*Z [\u0001\u000b>L-\t0YR\u000e,P\bV<Z'\u0007\fNR^4G\nO.R6F\t0";
        objectArray[306] = "V;od(b\u000237kJki8lhrd\u0007lg?v|i;\u007fa,=\n3n2$`i";
        objectArray[307] = "5\u000b=\u0011FMj\u0010=M9[;\f\"Cn\u0005c[w/\bWc\u001d4UT^7Z";
        objectArray[308] = "3\u001b\b\r1\u007fl\u0000\bQNi=\u001c\u0017_\u00197`OM3\u007fee\r\u0001I#l1J";
        objectArray[309] = "cD{\u000en%hEx\u000f\u001c04_^Sa2Y\u0018-E-c Co\u000bc_";
        objectArray[310] = "6\u0006\u000f{%\u001c\"\u0010\u0002)\u0014NNR\u0003p,A \u0006\b'(YNSXd%\u001b7\b\u001a*k'";
        objectArray[311] = "NW:C@;\u000f\u001a*\u001e\u0003F\u001dfoGT~\u0012\b;L\u0003z\nfo\u0014] \u0006\u001b.YM}Ef";
        objectArray[312] = "B\u001c\u007fv7{\u001d\u0007\u007f*HmL\u001b`$\u001f9\u0017N=xH2OOx:2nF\u001b?";
        objectArray[313] = "6#\u0011\u0000ltw3\u0006\u0013.\u0015fYD\u00016-i7\u0010\na)qYG\u0006`,e5C\f1thY";
        objectArray[314] = "\u0019I)?|\u000bMAq0\u001e\u0002&J*3&\rH\u001e!d\"\u0015&\u001bp;/\u0019X\u0011'1}k";
        objectArray[315] = "\u0010\u000f\u0016\u000fN\u000bT\u0005\u001f\u0003\u000eeK\u0019\u0003\u0014_\u0019M\u001fnT\\_U\u001f\u0000\u0012X^G\u0014n";
        objectArray[316] = "$rP*h \u007ft\u000186\u0010pvX )NwvB$U|bu[7d/xoZI";
        objectArray[317] = "\u0018JIJ%+KXJDE3KJVH)\u0001\u001f\u0006\u000f\u0016\u007fV\u001cQMK7<\u0016ZW\u001f<V";
        objectArray[318] = "Pl\u0001\u000e\u0003_R<\u000f\u0000y\u0000B.\u0011\u0019\u00152\u0016mNNAe_m\b\u0010F\tP;\u001a\u0000y";
        objectArray[319] = ";&eDAg?,4\u001cL\u000bl\"8\u0019G\\;xhG+2d).\u0006\u0016e>=1\u0003";
        objectArray[320] = "b\u001d*\u0011\u0014m8Ik\r\u0019\u000e>N*\u001d\u0013b\f\u0019mAD7[Hn\u0013E|%B9\u0019\u0017\u000e1Y'G\u000br=[&Dt";
        Object[] objectArray2 = objectArray;
        objectArray[321] = "\u0016m2.<aRg;\"|\u000fVj/(:bmiJu'uL`q?#hN;J$|a\u001du4.+kO\u0007";
    }

    private int f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = Y ^ l;
        CallSite callSite = d_.d("y", (long)5577966222626597417L, (long)l);
        for (int i = 0; i < d_.c("a", (int)6434, (long)(0x6B6B2097398C9562L ^ l)); ++i) {
            CallSite callSite2;
            block8: {
                CallSite callSite3 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)5582808934971030000L, (long)l), (long)5549721906511055957L, (long)l), (int)i, (long)5548809016022139578L, (long)l);
                try {
                    try {
                        callSite2 = d_.d("\u00d3", (Object)callSite3, (long)5550041092187949686L, (long)l);
                        if (callSite != null) break block8;
                        if (callSite2 != d_.d("\u00ff", (long)5581992014957138373L, (long)l)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)5582989691730528136L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)5582989691730528136L, (long)l);
                }
                callSite2 = d_.d("\u00d3", (Object)callSite3, (Object)d_.d("\u00ff", (long)5551756674571538105L, (long)l), (long)5583298353545926404L, (long)l);
            }
            try {
                if (callSite2 == null) continue;
                return i;
            }
            catch (MatchException matchException) {
                throw d_.d("y", (Object)matchException, (long)5582989691730528136L, (long)l);
            }
        }
        return -1;
    }

    private boolean f(Object[] objectArray) {
        double d;
        block2: {
            block3: {
                class_2338 class_23382 = (class_2338)objectArray[0];
                long l = (Long)objectArray[1];
                long l2 = (l = Y ^ l) ^ 0x6AD0D0CB2C7EL;
                CallSite callSite = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-2683744389959143861L, (long)l), (long)-2684916713583787608L, (long)l);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                double d10 = (double)d_.d("y", (Object)objectArray2, (long)-2678797621948365585L, (long)l);
                double d11 = (double)d_.d("\u00d3", (Object)class_23382, (long)-2686364955133644832L, (long)l) + 0.5 - d_.d("Z", (Object)callSite, (long)-2686535490733508928L, (long)l);
                CallSite callSite2 = d_.d("y", (long)-2678628930145763950L, (long)l);
                double d12 = (double)d_.d("\u00d3", (Object)class_23382, (long)-2678885244305556194L, (long)l) + 1.0 - d_.d("Z", (Object)callSite, (long)-2675696640061249577L, (long)l);
                double d13 = (double)d_.d("\u00d3", (Object)class_23382, (long)-2681280653552053270L, (long)l) + 0.5 - d_.d("Z", (Object)callSite, (long)-2680866946550161853L, (long)l);
                try {
                    double d14 = d11 * d11 + d12 * d12 + d13 * d13 - d10 * d10;
                    d = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                    if (callSite2 != null) break block2;
                    if (d > 0) break block3;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-2683670266464268237L, (long)l);
                }
                d = 1;
                break block2;
            }
            d = 0;
        }
        return (boolean)d;
    }

    private void l(Object[] objectArray) {
        block12: {
            block10: {
                long l = (Long)objectArray[0];
                l = Y ^ l;
                this.N = 0;
                CallSite callSite = d_.d("y", (long)-7281301314755691086L, (long)l);
                try {
                    d_ d_2;
                    block11: {
                        try {
                            try {
                                try {
                                    try {
                                        d_2 = this;
                                        if (callSite != null) break block10;
                                        if (d_2.z != d_0.BOW) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)-7286342359000035309L, (long)l);
                                    }
                                    d_2 = this;
                                    if (callSite != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)-7286342359000035309L, (long)l);
                                }
                                if (d_2.Q) break block11;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-7286342359000035309L, (long)l);
                            }
                            this.G = (int)d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.a, (long)-7281811153852413347L, (long)l))), (long)-7283273097786180204L, (long)l);
                            this.y = e_0.SWITCH_WEAPON;
                            if (callSite == null) break block12;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-7286342359000035309L, (long)l);
                        }
                    }
                    this.G = (int)d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.c, (long)-7281811153852413347L, (long)l))), (long)-7283273097786180204L, (long)l);
                    d_2 = this;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-7286342359000035309L, (long)l);
                }
            }
            d_2.y = e_0.WAIT_BACK;
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d_.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00ee' || c == '\u00ff' || c == '\u00f6') {
                field = d_.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d_.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void d(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        block17: {
            block16: {
                CallSite callSite;
                block15: {
                    Object object2;
                    long l3;
                    block14: {
                        block13: {
                            block12: {
                                l2 = (Long)objectArray[0];
                                long l4 = l2;
                                l3 = l4 ^ 0x6618D673620BL;
                                l = l4 ^ 0x52D6E774439DL;
                                CallSite callSite2 = d_.d("y", (long)3255432658888903276L, (long)l2);
                                d_.d("\u00d3", (Object)this, (Object)new Object[0], (long)3262234086667847861L, (long)l2);
                                callSite = callSite2;
                                try {
                                    try {
                                        d_ d_2 = this;
                                        object2 = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.f, (long)3256048240004955523L, (long)l2))), (long)3256837544790854218L, (long)l2);
                                        if (callSite != null) break block12;
                                        if (object2 == -1) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)3260526912829286349L, (long)l2);
                                    }
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l3;
                                    object2 = d_.d("\u00d3", (Object)this.f, (Object)objectArray2, (long)3260134548925742838L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)3260526912829286349L, (long)l2);
                                }
                            }
                            try {
                                if (callSite != null) break block14;
                                if (object2 == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)3260526912829286349L, (long)l2);
                            }
                            object2 = 1;
                            break block14;
                        }
                        object2 = 0;
                    }
                    try {
                        try {
                            d_2.J = object2;
                            d_ d_3 = this;
                            object = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.h, (long)3256048240004955523L, (long)l2))), (long)3256837544790854218L, (long)l2);
                            if (callSite != null) break block15;
                            if (object == -1) break block16;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)3260526912829286349L, (long)l2);
                        }
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l3;
                        object = d_.d("\u00d3", (Object)this.h, (Object)objectArray3, (long)3260134548925742838L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)3260526912829286349L, (long)l2);
                    }
                }
                try {
                    if (callSite != null) break block17;
                    if (object == false) break block16;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)3260526912829286349L, (long)l2);
                }
                object = 1;
                break block17;
            }
            object = 0;
        }
        d_3.K = object;
        this.T = null;
        this.U = 0;
        this.S = 0;
        this.W = 0;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = this;
        d_.d("\u00d3", (Object)d_.d("\u00ff", (long)3257167378236743541L, (long)l2), (Object)objectArray4, (long)3256705995222412839L, (long)l2);
    }

    private boolean d(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        l = Y ^ l;
        CallSite callSite = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-6350567224917494397L, (long)l), (Object)class_23382, (long)-6360697965368710643L, (long)l), (long)-6352320406211458433L, (long)l);
        class_2248[] class_2248Array = w;
        int n = class_2248Array.length;
        CallSite callSite2 = d_.d("y", (long)-6352078757292490599L, (long)l);
        int n2 = 0;
        while (n2 < n) {
            block5: {
                block6: {
                    class_2248 class_22482 = class_2248Array[n2];
                    try {
                        try {
                            if (callSite2 != null) break block5;
                            if (callSite != class_22482) break block6;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-6356044495807845064L, (long)l);
                        }
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-6356044495807845064L, (long)l);
                    }
                }
                ++n2;
            }
            if (callSite2 == null) continue;
        }
        return false;
    }

    private int d(Object[] objectArray) {
        Object object;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = Y ^ l) ^ 0x44B28A49E6BFL;
            CallSite callSite = d_.d("y", (long)-2049484335532768049L, (long)l);
            for (int i = 0; i < d_.c("a", (int)2254, (long)(0x5A83355824F6AA6BL ^ l)); ++i) {
                int n;
                block6: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-2045705951284193514L, (long)l), (long)-2025849312821042509L, (long)l), (int)i, (long)-2024515342677398436L, (long)l), (long)-2025605443322010480L, (long)l);
                            object = d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)-2023312635290881451L, (long)l);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-2045498548243748498L, (long)l);
                        }
                        if (object == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-2045498548243748498L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_2338 a(Object[] objectArray) {
        void var28_19;
        double d;
        reference var13_10;
        reference var11_9;
        reference var9_8;
        CallSite callSite;
        long l;
        block29: {
            CallSite callSite2;
            Object object;
            block30: {
                Object object2;
                Object object3;
                double d10;
                float f;
                block27: {
                    CallSite callSite3;
                    block28: {
                        class_310 class_3102;
                        float f10;
                        float f11;
                        block25: {
                            block26: {
                                block24: {
                                    f11 = ((Float)objectArray[0]).floatValue();
                                    f10 = ((Float)objectArray[1]).floatValue();
                                    f = ((Float)objectArray[2]).floatValue();
                                    l = (Long)objectArray[3];
                                    l = Y ^ l;
                                    callSite = d_.d("y", (long)-4002658260658639054L, (long)l);
                                    try {
                                        try {
                                            class_3102 = b;
                                            if (callSite != null) break block24;
                                            if (d_.d("Z", (Object)class_3102, (long)-4007845122255176469L, (long)l) == null) return null;
                                        }
                                        catch (MatchException matchException) {
                                            throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                                        }
                                        class_3102 = b;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite != null) break block25;
                                        if (d_.d("Z", (Object)class_3102, (long)-4002273710984422872L, (long)l) != null) break block26;
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                                }
                            }
                            class_3102 = b;
                        }
                        CallSite callSite4 = d_.d("\u00d3", (Object)d_.d("Z", (Object)class_3102, (long)-4007845122255176469L, (long)l), (long)-4026947233551265016L, (long)l);
                        var9_8 = d_.d("Z", (Object)callSite4, (long)-4028565942083361696L, (long)l);
                        var11_9 = d_.d("Z", (Object)callSite4, (long)-3999708017430203017L, (long)l) - 0.1;
                        var13_10 = d_.d("Z", (Object)callSite4, (long)-4004950086660289309L, (long)l);
                        CallSite callSite5 = d_.d("y", (double)f11, (long)-4030041161727946938L, (long)l);
                        CallSite callSite6 = d_.d("y", (double)f10, (long)-4030041161727946938L, (long)l);
                        d = (double)(-d_.d("y", (double)((float)callSite5), (long)-4006304467443274104L, (long)l) * d_.d("y", (double)((float)callSite6), (long)-4004871982048270510L, (long)l));
                        double d11 = (double)(-d_.d("y", (double)((float)callSite6), (long)-4006304467443274104L, (long)l));
                        d10 = (double)(d_.d("y", (double)((float)callSite5), (long)-4004871982048270510L, (long)l) * d_.d("y", (double)((float)callSite6), (long)-4004871982048270510L, (long)l));
                        callSite3 = d_.d("y", (double)(d * d + d11 * d11 + d10 * d10), (long)-4003332887036555436L, (long)l);
                        try {
                            try {
                                Object object2 = callSite3;
                                object2 = 0.0;
                                if (callSite != null) break block27;
                                if (object3 != object2) break block28;
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                        }
                    }
                    d /= callSite3;
                    d11 /= callSite3;
                    Object object2 = d10;
                    object2 = callSite3;
                }
                d10 = (double)(object3 / object2);
                reference var27_17 = d_.d("y", (float)f, (float)0.0f, (float)1.05f, (long)-4006837537240505184L, (long)l) * 3.0f;
                d *= (double)var27_17;
                d11 *= (double)var27_17;
                d10 *= (double)var27_17;
                d += d_.d("Z", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-4007845122255176469L, (long)l), (long)-4004518347319779831L, (long)l), (long)-4028565942083361696L, (long)l);
                d10 += d_.d("Z", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-4007845122255176469L, (long)l), (long)-4004518347319779831L, (long)l), (long)-4004950086660289309L, (long)l);
                try {
                    object = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-4007845122255176469L, (long)l), (long)-4003251264211022889L, (long)l);
                    if (callSite != null) break block29;
                    if (object != false) break block30;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                }
                d11 += d_.d("Z", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-4007845122255176469L, (long)l), (long)-4004518347319779831L, (long)l), (long)-3999708017430203017L, (long)l);
            }
            object = callSite2 = (Object)0;
        }
        while (var28_19 < d_.c("a", (int)8277, (long)(0x6215DE8E190CA908L ^ l))) {
            block32: {
                CallSite callSite7;
                CallSite callSite8;
                block31: {
                    class_243 class_2432 = new class_243((double)var9_8, (double)var11_9, (double)var13_10);
                    d *= 0.99;
                    d11 *= 0.99;
                    class_243 class_2433 = new class_243((double)(var9_8 += d), (double)(var11_9 += (d11 -= 0.05)), (double)(var13_10 += (d10 *= 0.99)));
                    callSite8 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-4002273710984422872L, (long)l), (Object)new class_3959(class_2432, class_2433, (class_3959.class_3960)d_.d("\u00ff", (long)-4007403613129452006L, (long)l), (class_3959.class_242)d_.d("\u00ff", (long)-4029971692398239326L, (long)l), (class_1297)d_.d("Z", (Object)b, (long)-4007845122255176469L, (long)l)), (long)-4005234311096989159L, (long)l);
                    try {
                        callSite7 = callSite8;
                        if (callSite != null) break block31;
                        if (callSite7 == null) break block32;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                    }
                    callSite7 = callSite8;
                }
                try {
                    try {
                        if (callSite != null) return d_.d("\u00d3", (Object)callSite7, (long)-4027589501534605995L, (long)l);
                        if (d_.d("\u00d3", (Object)callSite7, (long)-3999562521813403124L, (long)l) != d_.d("\u00ff", (long)-4029899167346495424L, (long)l)) break block32;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                    }
                    callSite7 = callSite8;
                    return d_.d("\u00d3", (Object)callSite7, (long)-4027589501534605995L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
                }
            }
            try {
                if (var11_9 < -65.0) {
                    return null;
                }
            }
            catch (MatchException matchException) {
                throw d_.d("y", (Object)matchException, (long)-4007752085622390125L, (long)l);
            }
            ++var28_19;
            if (callSite == null) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bt_0 bt_02) {
        CallSite callSite;
        long l;
        long l2;
        long l3;
        block40: {
            CallSite callSite2;
            block41: {
                Object object;
                CallSite callSite3;
                CallSite callSite4;
                CallSite callSite5;
                long l4;
                block39: {
                    CallSite callSite6;
                    long l5;
                    block36: {
                        CallSite callSite7;
                        block37: {
                            block38: {
                                CallSite callSite8;
                                block43: {
                                    block35: {
                                        CallSite callSite9;
                                        block34: {
                                            CallSite callSite10;
                                            CallSite callSite11;
                                            block42: {
                                                block33: {
                                                    CallSite callSite12;
                                                    block32: {
                                                        class_310 class_3102;
                                                        long l6;
                                                        block31: {
                                                            CallSite callSite13;
                                                            block29: {
                                                                block30: {
                                                                    long l7 = l3 = Y ^ 0x55FD00884ED8L;
                                                                    l2 = l7 ^ 0x369D62D43DB5L;
                                                                    l = l7 ^ 0x383747804722L;
                                                                    l5 = l7 ^ 0x52BDEC2BDEB7L;
                                                                    l6 = l7 ^ 0x53D6CD9321E8L;
                                                                    l4 = l7 ^ 0x49BB1208680L;
                                                                    callSite5 = d_.d("y", (long)4217540699688754630L, (long)l3);
                                                                    try {
                                                                        callSite13 = d_.d("\u00d3", (Object)((Boolean)((Object)d_.d("\u00d3", (Object)this.t, (long)4217030293664819753L, (long)l3))), (long)4246131482168254495L, (long)l3);
                                                                        if (callSite5 != null) break block29;
                                                                        if (callSite13 != false) break block30;
                                                                        return;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                                                    }
                                                                }
                                                                callSite13 = d_.d("\u00d3", (String)((Object)d_.d("\u00d3", (Object)this.k, (long)4217030293664819753L, (long)l3)), (Object)d_.b("y", (int)1990, (long)(0x53D7831BCCF6A4D8L ^ l3)), (long)4246706923276410974L, (long)l3);
                                                            }
                                                            if (callSite13 == false) {
                                                                return;
                                                            }
                                                            try {
                                                                try {
                                                                    class_3102 = b;
                                                                    if (callSite5 != null) break block31;
                                                                    if (d_.d("Z", (Object)class_3102, (long)4221354407929400863L, (long)l3) == null) return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                                                }
                                                                class_3102 = b;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                                            }
                                                        }
                                                        try {
                                                            if (d_.d("Z", (Object)class_3102, (long)4215672908300183772L, (long)l3) == null) {
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                                        }
                                                        try {
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l6;
                                                            if (d_.d("\u00d3", (Object)this, (Object)objectArray, (long)4222542448610286996L, (long)l3) == false) {
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                                        }
                                                        callSite11 = d_.d("\u00d3", (Object)d_.d("\u00ff", (long)4222652775948781791L, (long)l3), (Object)new Object[0], (long)4219686777364832497L, (long)l3);
                                                        try {
                                                            callSite12 = callSite11;
                                                            if (callSite5 != null) break block32;
                                                            if (callSite12 == null) break block33;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                                        }
                                                        callSite12 = callSite11;
                                                    }
                                                    callSite10 = d_.d("\u00d3", (Object)callSite12, (Object)new Object[0], (long)4242472837832457282L, (long)l3);
                                                    break block42;
                                                }
                                                callSite10 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)4221354407929400863L, (long)l3), (long)4223691867719837356L, (long)l3);
                                            }
                                            callSite4 = callSite10;
                                            try {
                                                callSite9 = callSite11;
                                                if (callSite5 != null) break block34;
                                                if (callSite9 == null) break block35;
                                            }
                                            catch (MatchException matchException) {
                                                throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                            }
                                            callSite9 = callSite11;
                                        }
                                        callSite8 = d_.d("\u00d3", (Object)callSite9, (Object)new Object[0], (long)4218652582839165436L, (long)l3);
                                        break block43;
                                    }
                                    callSite8 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)4221354407929400863L, (long)l3), (long)4222358856625306419L, (long)l3);
                                }
                                callSite3 = callSite8;
                                callSite6 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)4221354407929400863L, (long)l3), (long)4245561077292766697L, (long)l3);
                                try {
                                    try {
                                        if (d_.d("\u00d3", (Object)callSite6, (long)4245461396647935385L, (long)l3) != d_.d("\u00ff", (long)4245981161376769205L, (long)l3)) break block36;
                                        callSite7 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)4221354407929400863L, (long)l3), (long)4217955334703589055L, (long)l3);
                                        if (callSite5 != null) break block37;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                    }
                                    if (callSite7 != false) break block38;
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                                }
                            }
                            callSite7 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)4221354407929400863L, (long)l3), (long)4222124291921763135L, (long)l3);
                        }
                        object = d_.d("y", (int)callSite7, (long)4245503759187850066L, (long)l3);
                        try {
                            if (object < 0.05f) {
                                return;
                            }
                            break block39;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l5;
                    objectArray[0] = callSite6;
                    if (d_.d("\u00d3", (Object)this, (Object)objectArray, (long)4222812588436349992L, (long)l3) == false) return;
                    object = 1.0500001f;
                    try {
                        if (callSite5 != null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                    }
                }
                Object[] objectArray = new Object[4];
                objectArray[3] = l4;
                objectArray[2] = Float.valueOf((float)object);
                objectArray[1] = Float.valueOf((float)callSite3);
                objectArray[0] = Float.valueOf((float)callSite4);
                callSite2 = d_.d("\u00d3", (Object)this, (Object)objectArray, (long)4216745772580511325L, (long)l3);
                try {
                    callSite = callSite2;
                    if (callSite5 != null) break block40;
                    if (callSite != null) break block41;
                    return;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)4221455980795162727L, (long)l3);
                }
            }
            callSite = d_.d("\u00d3", (Object)callSite2, (long)4220364468926996301L, (long)l3);
        }
        CallSite callSite14 = callSite;
        float f = (float)d_.d("\u00d3", (Object)callSite14, (long)4245824124558217140L, (long)l3);
        float f10 = (float)d_.d("\u00d3", (Object)callSite14, (long)4217233842014084426L, (long)l3);
        float f11 = (float)d_.d("\u00d3", (Object)callSite14, (long)4223816482146481086L, (long)l3);
        float f12 = f + 1.0f;
        float f13 = f10 + 1.0f;
        float f14 = f11 + 1.0f;
        Color color = (Color)((Object)d_.d("\u00d3", (Object)this.u, (long)4217030293664819753L, (long)l3));
        Color color2 = new Color((int)d_.d("\u00d3", (Object)color, (long)4215522691976404980L, (long)l3), (int)d_.d("\u00d3", (Object)color, (long)4221258014569625565L, (long)l3), (int)d_.d("\u00d3", (Object)color, (long)4242679758072247539L, (long)l3), (int)d_.d("y", (int)d_.c("a", (int)18611, (long)(0x149D88758ADA331BL ^ l3)), (int)(d_.d("\u00d3", (Object)color, (long)4243903470431089705L, (long)l3) + d_.c("a", (int)2897, (long)(0x533BCD66D561F0FBL ^ l3))), (long)4246781912019093911L, (long)l3));
        Object[] objectArray = new Object[10];
        objectArray[9] = l2;
        objectArray[8] = color;
        objectArray[7] = Float.valueOf(f14);
        objectArray[6] = Float.valueOf(f13);
        objectArray[5] = Float.valueOf(f12);
        objectArray[4] = Float.valueOf(f11);
        objectArray[3] = Float.valueOf(f10);
        objectArray[2] = Float.valueOf(f);
        objectArray[1] = bt_02.a;
        objectArray[0] = bt_02.b;
        d_.d("y", (Object)objectArray, (long)4223435524412754364L, (long)l3);
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l;
        objectArray2[8] = color2;
        objectArray2[7] = Float.valueOf(f14);
        objectArray2[6] = Float.valueOf(f13);
        objectArray2[5] = Float.valueOf(f12);
        objectArray2[4] = Float.valueOf(f11);
        objectArray2[3] = Float.valueOf(f10);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = bt_02.a;
        objectArray2[0] = bt_02.b;
        d_.d("y", (Object)objectArray2, (long)4224138318560813400L, (long)l3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Integer a(Object[] var1_1) {
        block50: {
            block51: {
                block53: {
                    block52: {
                        block48: {
                            block49: {
                                block46: {
                                    block43: {
                                        block42: {
                                            block44: {
                                                block41: {
                                                    block40: {
                                                        var2_2 = (Long)var1_1[0];
                                                        v0 = var2_2 = d_.Y ^ var2_2;
                                                        var4_3 = v0 ^ 113928845082917L;
                                                        var6_4 = v0 ^ 43141582264215L;
                                                        var8_5 = v0 ^ 13999251216337L;
                                                        var10_6 = v0 ^ 39877035164204L;
                                                        v1 = new Object[2];
                                                        v1[1] = var4_3;
                                                        v1[0] = d_.d("\u00ff", (long)-1150193793138913941L, (long)var2_2);
                                                        var13_7 = d_.d("y", (Object)v1, (long)-1152373483153668799L, (long)var2_2);
                                                        var12_8 = d_.d("y", (long)-1145955064866826407L, (long)var2_2);
                                                        try {
                                                            try {
                                                                v2 = var13_7;
                                                                if (var12_8 != null) break block40;
                                                                if (v2 == null) break block41;
                                                            }
                                                            catch (MatchException v3) {
                                                                throw d_.d("y", (Object)v3, (long)-1149940994024621320L, (long)var2_2);
                                                            }
                                                            this.X = -1;
                                                            v2 = var13_7;
                                                        }
                                                        catch (MatchException v4) {
                                                            throw d_.d("y", (Object)v4, (long)-1149940994024621320L, (long)var2_2);
                                                        }
                                                    }
                                                    return v2;
                                                }
                                                var14_9 /* !! */  = -1;
                                                for (var15_10 = d_.c("a", (int)6434, (long)(7740409982977845266L ^ var2_2)); var15_10 < d_.c("a", (int)5981, (long)(3123056203400062575L ^ var2_2)); ++var15_10) {
                                                    try {
                                                        if (var12_8 != null) break block42;
                                                        if (d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.b, (long)-1150024922910194560L, (long)var2_2), (long)-1120050630257331931L, (long)var2_2), (int)var15_10, (long)-1121113526757703734L, (long)var2_2), (long)-1119740723782240506L, (long)var2_2) != d_.d("\u00ff", (long)-1150193793138913941L, (long)var2_2)) continue;
                                                    }
                                                    catch (MatchException v5) {
                                                        throw d_.d("y", (Object)v5, (long)-1149940994024621320L, (long)var2_2);
                                                    }
                                                    var14_9 /* !! */  = (int)var15_10;
                                                    try {
                                                        if (var12_8 == null) break;
                                                        if (var12_8 == null) continue;
                                                        break;
                                                    }
                                                    catch (MatchException v6) {
                                                        throw d_.d("y", (Object)v6, (long)-1149940994024621320L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        v7 = var14_9 /* !! */ ;
                                                        if (var12_8 != null) break block43;
                                                        if (v7 != -1) break block44;
                                                    }
                                                    catch (MatchException v8) {
                                                        throw d_.d("y", (Object)v8, (long)-1149940994024621320L, (long)var2_2);
                                                    }
                                                    return null;
                                                }
                                                catch (MatchException v9) {
                                                    throw d_.d("y", (Object)v9, (long)-1149940994024621320L, (long)var2_2);
                                                }
                                            }
                                            v10 = new Object[1];
                                            v10[0] = var6_4;
                                            var15_10 = d_.d("y", (Object)v10, (long)-1117225639838294690L, (long)var2_2);
                                        }
                                        v7 = -1;
                                    }
                                    var16_11 = v7;
                                    for (var17_12 = 0; var17_12 < d_.c("a", (int)6434, (long)(7740409982977845266L ^ var2_2)); ++var17_12) {
                                        block47: {
                                            block45: {
                                                try {
                                                    try {
                                                        v11 /* !! */  = var17_12;
                                                        if (var12_8 != null) break block45;
                                                        v12 /* !! */  = (int)var15_10;
                                                        if (var12_8 != null) break block46;
                                                    }
                                                    catch (MatchException v13) {
                                                        throw d_.d("y", (Object)v13, (long)-1149940994024621320L, (long)var2_2);
                                                    }
                                                    if (v11 /* !! */  == v12 /* !! */ ) {
                                                        continue;
                                                    }
                                                }
                                                catch (MatchException v14) {
                                                    throw d_.d("y", (Object)v14, (long)-1149940994024621320L, (long)var2_2);
                                                }
                                                v11 /* !! */  = (int)d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.b, (long)-1150024922910194560L, (long)var2_2), (long)-1120050630257331931L, (long)var2_2), (int)var17_12, (long)-1121113526757703734L, (long)var2_2), (long)-1144942041515799716L, (long)var2_2);
                                            }
                                            try {
                                                if (var12_8 != null) break block47;
                                                if (v11 /* !! */  == 0) continue;
                                            }
                                            catch (MatchException v15) {
                                                throw d_.d("y", (Object)v15, (long)-1149940994024621320L, (long)var2_2);
                                            }
                                            v11 /* !! */  = var17_12;
                                        }
                                        var16_11 = v11 /* !! */ ;
                                        try {
                                            if (var12_8 == null) break;
                                            if (var12_8 == null) continue;
                                            break;
                                        }
                                        catch (MatchException v16) {
                                            throw d_.d("y", (Object)v16, (long)-1149940994024621320L, (long)var2_2);
                                        }
                                    }
                                    v17 = var16_11;
                                    v12 /* !! */  = -1;
                                }
                                try {
                                    try {
                                        if (var12_8 != null) break block48;
                                        if (v17 != v12 /* !! */ ) break block49;
                                    }
                                    catch (MatchException v18) {
                                        throw d_.d("y", (Object)v18, (long)-1149940994024621320L, (long)var2_2);
                                    }
                                    return null;
                                }
                                catch (MatchException v19) {
                                    throw d_.d("y", (Object)v19, (long)-1149940994024621320L, (long)var2_2);
                                }
                            }
                            v17 = this.X;
                            v12 /* !! */  = -1;
                        }
                        try {
                            try {
                                try {
                                    if (var12_8 != null) break block50;
                                    if (v17 == v12 /* !! */ ) break block51;
                                }
                                catch (MatchException v20) {
                                    throw d_.d("y", (Object)v20, (long)-1149940994024621320L, (long)var2_2);
                                }
                                v21 = d_.d("\u00ff", (long)-1148143357014497078L, (long)var2_2);
                                if (var12_8 != null) break block52;
                            }
                            catch (MatchException v22) {
                                throw d_.d("y", (Object)v22, (long)-1149940994024621320L, (long)var2_2);
                            }
                            if (v21 != null) {
                            }
                            ** GOTO lbl147
                        }
                        catch (MatchException v23) {
                            throw d_.d("y", (Object)v23, (long)-1149940994024621320L, (long)var2_2);
                        }
                        v21 = d_.d("\u00ff", (long)-1148143357014497078L, (long)var2_2);
                    }
                    try {
                        block54: {
                            try {
                                try {
                                    v24 = new Object[1];
                                    v24[0] = var8_5;
                                    v25 /* !! */  = (int)d_.d("\u00d3", (Object)v21, (Object)v24, (long)-1120853993143516865L, (long)var2_2);
                                    if (var12_8 != null) break block53;
                                    if (v25 /* !! */  != 0) break block54;
                                }
                                catch (MatchException v26) {
                                    throw d_.d("y", (Object)v26, (long)-1149940994024621320L, (long)var2_2);
                                }
lbl147:
                                // 2 sources

                                this.X = -1;
                                if (var12_8 == null) break block51;
                            }
                            catch (MatchException v27) {
                                throw d_.d("y", (Object)v27, (long)-1149940994024621320L, (long)var2_2);
                            }
                        }
                        v25 /* !! */  = this.X;
                    }
                    catch (MatchException v28) {
                        throw d_.d("y", (Object)v28, (long)-1149940994024621320L, (long)var2_2);
                    }
                }
                return d_.d("y", (int)v25 /* !! */ , (long)-1150333472136783360L, (long)var2_2);
            }
            v17 = var14_9 /* !! */ ;
            v12 /* !! */  = var16_11;
        }
        v29 = new Object[3];
        v29[2] = var10_6;
        v29[1] = v12 /* !! */ ;
        v29[0] = v17;
        d_.d("y", (Object)v29, (long)-1144224844116478601L, (long)var2_2);
        this.X = var16_11;
        return d_.d("y", (int)var16_11, (long)-1150333472136783360L, (long)var2_2);
    }

    private boolean a(Object[] objectArray) {
        class_1792 class_17922 = (class_1792)objectArray[0];
        long l = (Long)objectArray[1];
        l = Y ^ l;
        class_1792[] class_1792Array = v;
        int n = class_1792Array.length;
        CallSite callSite = d_.d("y", (long)8162072409414112772L, (long)l);
        int n2 = 0;
        while (n2 < n) {
            block5: {
                block6: {
                    class_1792 class_17923 = class_1792Array[n2];
                    try {
                        try {
                            if (callSite != null) break block5;
                            if (class_17922 != class_17923) break block6;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)8167181915454454693L, (long)l);
                        }
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)8167181915454454693L, (long)l);
                    }
                }
                ++n2;
            }
            if (callSite == null) continue;
        }
        return false;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return d_.d("y", (Object)((Object)q_0.Cart), (long)-2434365724343012165L, (long)l);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bG var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [56[TRYBLOCK]], but top level block is 153[SWITCH]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public dC a(Object[] var1_1) {
        block157: {
            block163: {
                block161: {
                    block160: {
                        block159: {
                            block158: {
                                block156: {
                                    block148: {
                                        block146: {
                                            block147: {
                                                block155: {
                                                    block154: {
                                                        block150: {
                                                            block153: {
                                                                block152: {
                                                                    block151: {
                                                                        block149: {
                                                                            block139: {
                                                                                block141: {
                                                                                    block140: {
                                                                                        block145: {
                                                                                            block144: {
                                                                                                block142: {
                                                                                                    block133: {
                                                                                                        block134: {
                                                                                                            block138: {
                                                                                                                block137: {
                                                                                                                    block135: {
                                                                                                                        block136: {
                                                                                                                            block131: {
                                                                                                                                block132: {
                                                                                                                                    block130: {
                                                                                                                                        var2_2 = (Long)var1_1[0];
                                                                                                                                        v0 = var2_2;
                                                                                                                                        var4_3 = v0 ^ 587706608428L;
                                                                                                                                        var6_4 = v0 ^ 125420266980053L;
                                                                                                                                        var8_5 = v0 ^ 51598816251400L;
                                                                                                                                        var10_6 = v0 ^ 61766210848858L;
                                                                                                                                        var12_7 = v0 ^ 135924364663546L;
                                                                                                                                        var14_8 = v0 ^ 101816702374277L;
                                                                                                                                        var16_9 = v0 ^ 80128468979861L;
                                                                                                                                        var18_10 = d_.d("y", (long)-1183693085981374253L, (long)var2_2);
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v1 = d_.b;
                                                                                                                                                if (var18_10 != null) break block130;
                                                                                                                                                if (d_.d("Z", (Object)v1, (long)-1188852493478225142L, (long)var2_2) != null) {
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl35
                                                                                                                                            }
                                                                                                                                            catch (MatchException v2) {
                                                                                                                                                throw d_.d("y", (Object)v2, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            v1 = d_.b;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v3) {
                                                                                                                                            throw d_.d("y", (Object)v3, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v4 = d_.d("Z", (Object)v1, (long)-1183303553700741687L, (long)var2_2);
                                                                                                                                            if (var18_10 != null) break block131;
                                                                                                                                            if (v4 != null) break block132;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v5) {
                                                                                                                                            throw d_.d("y", (Object)v5, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                        }
lbl35:
                                                                                                                                        // 2 sources

                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v6) {
                                                                                                                                        throw d_.d("y", (Object)v6, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    v7 = this;
                                                                                                                                    if (var18_10 != null) break block133;
                                                                                                                                    v4 = d_.d("\u00d3", (Object)v7.m, (long)-1184168290193359044L, (long)var2_2);
                                                                                                                                }
                                                                                                                                catch (MatchException v8) {
                                                                                                                                    throw d_.d("y", (Object)v8, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (d_.d("\u00d3", (Object)((Boolean)v4), (long)-1155083602679024374L, (long)var2_2) == false) break block134;
                                                                                                                                                        v7 = this;
                                                                                                                                                        if (var18_10 != null) break block133;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v9) {
                                                                                                                                                        throw d_.d("y", (Object)v9, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                    if (v7.y != e_0.IDLE) break block134;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v10) {
                                                                                                                                                    throw d_.d("y", (Object)v10, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                                v7 = this;
                                                                                                                                                if (var18_10 != null) break block133;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v11) {
                                                                                                                                                throw d_.d("y", (Object)v11, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            v12 = new Object[1];
                                                                                                                                            v12[0] = var10_6;
                                                                                                                                            if (d_.d("\u00d3", (Object)v7, (Object)v12, (long)-1180559866233386197L, (long)var2_2) == false) break block134;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v13) {
                                                                                                                                            throw d_.d("y", (Object)v13, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        v14 = this;
                                                                                                                                        if (var18_10 != null) break block135;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v15) {
                                                                                                                                        throw d_.d("y", (Object)v15, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    if (v14.T == null) break block136;
                                                                                                                                }
                                                                                                                                catch (MatchException v16) {
                                                                                                                                    throw d_.d("y", (Object)v16, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                }
                                                                                                                                v17 /* !! */  = this.T;
                                                                                                                                break block137;
                                                                                                                            }
                                                                                                                            catch (MatchException v18) {
                                                                                                                                throw d_.d("y", (Object)v18, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v14 = this;
                                                                                                                    }
                                                                                                                    v19 = new Object[1];
                                                                                                                    v19[0] = var4_3;
                                                                                                                    v17 /* !! */  = d_.d("\u00d3", (Object)v14, (Object)v19, (long)-1155789654385061508L, (long)var2_2);
                                                                                                                }
                                                                                                                var19_11 = v17 /* !! */ ;
                                                                                                                try {
                                                                                                                    v20 = var19_11;
                                                                                                                    if (var18_10 != null) break block138;
                                                                                                                    if (v20 == null) break block134;
                                                                                                                }
                                                                                                                catch (MatchException v21) {
                                                                                                                    throw d_.d("y", (Object)v21, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                }
                                                                                                                v20 = var19_11;
                                                                                                            }
                                                                                                            v22 = new Object[2];
                                                                                                            v22[1] = var6_4;
                                                                                                            v22[0] = v20;
                                                                                                            var20_15 = d_.d("\u00d3", (Object)d_.d("y", (Object)v22, (long)-1155429740870528378L, (long)var2_2), (double)0.0, (double)0.25, (double)0.0, (long)-1186844592670101459L, (long)var2_2);
                                                                                                            v7 = this;
                                                                                                            if (var18_10 == null) {
                                                                                                                v23 = new Object[3];
                                                                                                                v23[2] = var16_9;
                                                                                                                v23[1] = Float.valueOf(1.0f);
                                                                                                                v23[0] = var20_15;
                                                                                                                var21_17 = d_.d("\u00d3", (Object)v7, (Object)v23, (long)-1156818895846178356L, (long)var2_2);
                                                                                                                if (var21_17 != null) {
                                                                                                                    v24 = new Object[2];
                                                                                                                    v24[1] = var8_5;
                                                                                                                    v24[0] = Float.valueOf((float)(d_.d("\u00d3", (Object)var21_17, (Object)new Object[0], (long)-1155928587900884649L, (long)var2_2) - d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.b, (long)-1188852493478225142L, (long)var2_2), (long)-1186545792364022855L, (long)var2_2)));
                                                                                                                    var22_19 = d_.d("y", (float)d_.d("y", (Object)v24, (long)-1182437580643546371L, (long)var2_2), (long)-1154216013619804028L, (long)var2_2);
                                                                                                                    try {
                                                                                                                        if (var22_19 <= d_.d("\u00d3", (Object)((Float)d_.d("\u00d3", (Object)this.s, (long)-1184168290193359044L, (long)var2_2)), (long)-1155659605542278928L, (long)var2_2)) {
                                                                                                                            return var21_17;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    catch (MatchException v25) {
                                                                                                                        throw d_.d("y", (Object)v25, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    ** GOTO lbl133
                                                                                                                }
                                                                                                            }
                                                                                                            break block133;
                                                                                                        }
                                                                                                        v7 = this;
                                                                                                    }
                                                                                                    try {
                                                                                                        block143: {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v26 /* !! */  = v7.z;
                                                                                                                                                        v27 = d_0.BOW;
                                                                                                                                                        if (var18_10 != null) break block139;
                                                                                                                                                        if (v26 /* !! */  != v27) break block140;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v28) {
                                                                                                                                                        throw d_.d("y", (Object)v28, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                    v29 = this;
                                                                                                                                                    if (var18_10 != null) break block141;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v30) {
                                                                                                                                                    throw d_.d("y", (Object)v30, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                                if (!v29.Q) break block140;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v31) {
                                                                                                                                                throw d_.d("y", (Object)v31, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            v29 = this;
                                                                                                                                            if (var18_10 != null) break block141;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v32) {
                                                                                                                                            throw d_.d("y", (Object)v32, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        if (v29.R == null) break block140;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v33) {
                                                                                                                                        throw d_.d("y", (Object)v33, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    v34 = this;
                                                                                                                                    if (var18_10 != null) break block142;
                                                                                                                                }
                                                                                                                                catch (MatchException v35) {
                                                                                                                                    throw d_.d("y", (Object)v35, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                                }
                                                                                                                                if (v34.y == e_0.USE_WEAPON) break block143;
                                                                                                                            }
                                                                                                                            catch (MatchException v36) {
                                                                                                                                throw d_.d("y", (Object)v36, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                            }
                                                                                                                            v34 = this;
                                                                                                                            if (var18_10 != null) break block142;
                                                                                                                        }
                                                                                                                        catch (MatchException v37) {
                                                                                                                            throw d_.d("y", (Object)v37, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                        }
                                                                                                                        if (v34.y == e_0.CHARGE_BOW) break block143;
                                                                                                                    }
                                                                                                                    catch (MatchException v38) {
                                                                                                                        throw d_.d("y", (Object)v38, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                    }
                                                                                                                    v29 = this;
                                                                                                                    if (var18_10 != null) break block141;
                                                                                                                }
                                                                                                                catch (MatchException v39) {
                                                                                                                    throw d_.d("y", (Object)v39, (long)-1188804777623706254L, (long)var2_2);
                                                                                                                }
                                                                                                                if (v29.y != e_0.RELEASE_BOW) break block140;
                                                                                                            }
                                                                                                            catch (MatchException v40) {
                                                                                                                throw d_.d("y", (Object)v40, (long)-1188804777623706254L, (long)var2_2);
                                                                                                            }
                                                                                                        }
                                                                                                        v34 = this;
                                                                                                    }
                                                                                                    catch (MatchException v41) {
                                                                                                        throw d_.d("y", (Object)v41, (long)-1188804777623706254L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                v42 = new Object[1];
                                                                                                v42[0] = var12_7;
                                                                                                var19_12 = d_.d("\u00d3", (Object)v34, (Object)v42, (long)-1186571623610572078L, (long)var2_2);
                                                                                                try {
                                                                                                    if (!(var19_12 > 0.0f)) break block144;
                                                                                                    v43 = new Object[3];
                                                                                                    v43[2] = var16_9;
                                                                                                    v43[1] = Float.valueOf((float)var19_12);
                                                                                                    v43[0] = d_.d("\u00d3", (Object)this.R, (long)-1180802332636519012L, (long)var2_2);
                                                                                                    v44 = d_.d("\u00d3", (Object)this, (Object)v43, (long)-1156818895846178356L, (long)var2_2);
                                                                                                    break block145;
                                                                                                }
                                                                                                catch (MatchException v45) {
                                                                                                    throw d_.d("y", (Object)v45, (long)-1188804777623706254L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            v44 = null;
                                                                                        }
                                                                                        var20_15 = v44;
                                                                                        try {
                                                                                            v29 = this;
                                                                                            if (var18_10 != null) break block141;
                                                                                            v29.V = var20_15;
                                                                                            if (var20_15 == null) break block140;
                                                                                        }
                                                                                        catch (MatchException v46) {
                                                                                            throw d_.d("y", (Object)v46, (long)-1188804777623706254L, (long)var2_2);
                                                                                        }
                                                                                        v47 = new Object[2];
                                                                                        v47[1] = var8_5;
                                                                                        v47[0] = Float.valueOf((float)(d_.d("\u00d3", var20_15, (Object)new Object[0], (long)-1155928587900884649L, (long)var2_2) - d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.b, (long)-1188852493478225142L, (long)var2_2), (long)-1186545792364022855L, (long)var2_2)));
                                                                                        var21_18 = d_.d("y", (float)d_.d("y", (Object)v47, (long)-1182437580643546371L, (long)var2_2), (long)-1154216013619804028L, (long)var2_2);
                                                                                        try {
                                                                                            if (var21_18 <= d_.d("\u00d3", (Object)((Float)d_.d("\u00d3", (Object)this.s, (long)-1184168290193359044L, (long)var2_2)), (long)-1155659605542278928L, (long)var2_2)) {
                                                                                                return var20_15;
                                                                                            }
                                                                                        }
                                                                                        catch (MatchException v48) {
                                                                                            throw d_.d("y", (Object)v48, (long)-1188804777623706254L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    v29 = this;
                                                                                }
                                                                                try {
                                                                                    v26 /* !! */  = v29.z;
                                                                                    if (var18_10 != null) break block146;
                                                                                    v27 = d_0.BOW;
                                                                                }
                                                                                catch (MatchException v49) {
                                                                                    throw d_.d("y", (Object)v49, (long)-1188804777623706254L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (v26 /* !! */  != v27) break block147;
                                                                                                v50 = this.Q;
                                                                                                if (var18_10 != null) break block148;
                                                                                            }
                                                                                            catch (MatchException v51) {
                                                                                                throw d_.d("y", (Object)v51, (long)-1188804777623706254L, (long)var2_2);
                                                                                            }
                                                                                            if (v50 != false) break block147;
                                                                                        }
                                                                                        catch (MatchException v52) {
                                                                                            throw d_.d("y", (Object)v52, (long)-1188804777623706254L, (long)var2_2);
                                                                                        }
                                                                                        v26 /* !! */  = this.y;
                                                                                        v53 = e_0.SWITCH_SAFE;
                                                                                        if (var18_10 != null) break block149;
                                                                                    }
                                                                                    catch (MatchException v54) {
                                                                                        throw d_.d("y", (Object)v54, (long)-1188804777623706254L, (long)var2_2);
                                                                                    }
                                                                                    if (v26 /* !! */  == v53) break block150;
                                                                                }
                                                                                catch (MatchException v55) {
                                                                                    throw d_.d("y", (Object)v55, (long)-1188804777623706254L, (long)var2_2);
                                                                                }
                                                                                v26 /* !! */  = this.y;
                                                                                v53 = e_0.SWITCH_WEAPON;
                                                                            }
                                                                            catch (MatchException v56) {
                                                                                throw d_.d("y", (Object)v56, (long)-1188804777623706254L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var18_10 != null) break block151;
                                                                                if (v26 /* !! */  == v53) break block150;
                                                                            }
                                                                            catch (MatchException v57) {
                                                                                throw d_.d("y", (Object)v57, (long)-1188804777623706254L, (long)var2_2);
                                                                            }
                                                                            v26 /* !! */  = this.y;
                                                                            v53 = e_0.USE_WEAPON;
                                                                        }
                                                                        catch (MatchException v58) {
                                                                            throw d_.d("y", (Object)v58, (long)-1188804777623706254L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var18_10 != null) break block152;
                                                                            if (v26 /* !! */  == v53) break block150;
                                                                        }
                                                                        catch (MatchException v59) {
                                                                            throw d_.d("y", (Object)v59, (long)-1188804777623706254L, (long)var2_2);
                                                                        }
                                                                        v26 /* !! */  = this.y;
                                                                        v53 = e_0.CHARGE_BOW;
                                                                    }
                                                                    catch (MatchException v60) {
                                                                        throw d_.d("y", (Object)v60, (long)-1188804777623706254L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var18_10 != null) break block153;
                                                                            if (v26 /* !! */  == v53) break block150;
                                                                        }
                                                                        catch (MatchException v61) {
                                                                            throw d_.d("y", (Object)v61, (long)-1188804777623706254L, (long)var2_2);
                                                                        }
                                                                        v26 /* !! */  = this.y;
                                                                        if (var18_10 != null) break block146;
                                                                    }
                                                                    catch (MatchException v62) {
                                                                        throw d_.d("y", (Object)v62, (long)-1188804777623706254L, (long)var2_2);
                                                                    }
                                                                    v53 = e_0.RELEASE_BOW;
                                                                }
                                                                catch (MatchException v63) {
                                                                    throw d_.d("y", (Object)v63, (long)-1188804777623706254L, (long)var2_2);
                                                                }
                                                            }
                                                            if (v26 /* !! */  != v53) break block147;
                                                        }
                                                        var19_13 = new class_243((double)this.A + 0.5, (double)this.B + 0.5, (double)this.C + 0.5);
                                                        v64 = new Object[1];
                                                        v64[0] = var12_7;
                                                        var20_16 = d_.d("\u00d3", (Object)this, (Object)v64, (long)-1186571623610572078L, (long)var2_2);
                                                        try {
                                                            if (!(var20_16 > 0.0f)) break block154;
                                                            v65 = new Object[3];
                                                            v65[2] = var16_9;
                                                            v65[1] = Float.valueOf((float)var20_16);
                                                            v65[0] = var19_13;
                                                            v66 = d_.d("\u00d3", (Object)this, (Object)v65, (long)-1156818895846178356L, (long)var2_2);
                                                            break block155;
                                                        }
                                                        catch (MatchException v67) {
                                                            throw d_.d("y", (Object)v67, (long)-1188804777623706254L, (long)var2_2);
                                                        }
                                                    }
                                                    v66 = null;
                                                }
                                                var21_17 = v66;
                                                try {
                                                    this.V = var21_17;
                                                    v26 /* !! */  = var21_17;
                                                    if (var18_10 != null) break block146;
                                                    if (v26 /* !! */  == null) break block147;
                                                }
                                                catch (MatchException v68) {
                                                    throw d_.d("y", (Object)v68, (long)-1188804777623706254L, (long)var2_2);
                                                }
                                                v69 = new Object[2];
                                                v69[1] = var8_5;
                                                v69[0] = Float.valueOf((float)(d_.d("\u00d3", var21_17, (Object)new Object[0], (long)-1155928587900884649L, (long)var2_2) - d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.b, (long)-1188852493478225142L, (long)var2_2), (long)-1186545792364022855L, (long)var2_2)));
                                                var22_19 = d_.d("y", (float)d_.d("y", (Object)v69, (long)-1182437580643546371L, (long)var2_2), (long)-1154216013619804028L, (long)var2_2);
                                                try {
                                                    try {
                                                        cfr_temp_0 = var22_19 - d_.d("\u00d3", (Object)((Float)d_.d("\u00d3", (Object)this.s, (long)-1184168290193359044L, (long)var2_2)), (long)-1155659605542278928L, (long)var2_2);
                                                        v50 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                        if (var18_10 != null) break block148;
                                                        if (v50 > 0) break block147;
                                                    }
                                                    catch (MatchException v70) {
                                                        throw d_.d("y", (Object)v70, (long)-1188804777623706254L, (long)var2_2);
                                                    }
                                                    return var21_17;
                                                }
                                                catch (MatchException v71) {
                                                    throw d_.d("y", (Object)v71, (long)-1188804777623706254L, (long)var2_2);
                                                }
                                            }
                                            v26 /* !! */  = d_.d("\u00d3", (Object)this.r, (long)-1184168290193359044L, (long)var2_2);
                                        }
                                        v50 = d_.d("\u00d3", (Object)((Boolean)v26 /* !! */ ), (long)-1155083602679024374L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            if (var18_10 != null) break block156;
                                            if (v50 == false) break block157;
                                        }
                                        catch (MatchException v72) {
                                            throw d_.d("y", (Object)v72, (long)-1188804777623706254L, (long)var2_2);
                                        }
                                        v50 = d_.d("\u00d3", (String)d_.d("\u00d3", (Object)this.k, (long)-1184168290193359044L, (long)var2_2), (Object)d_.b("y", (int)1990, (long)(6041465206238573005L ^ var2_2)), (long)-1154523557416864437L, (long)var2_2);
                                    }
                                    catch (MatchException v73) {
                                        throw d_.d("y", (Object)v73, (long)-1188804777623706254L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var18_10 != null) break block158;
                                            if (v50 == false) break block157;
                                        }
                                        catch (MatchException v74) {
                                            throw d_.d("y", (Object)v74, (long)-1188804777623706254L, (long)var2_2);
                                        }
                                        v75 = this;
                                        if (var18_10 != null) break block159;
                                    }
                                    catch (MatchException v76) {
                                        throw d_.d("y", (Object)v76, (long)-1188804777623706254L, (long)var2_2);
                                    }
                                    v50 = v75.E;
                                }
                                catch (MatchException v77) {
                                    throw d_.d("y", (Object)v77, (long)-1188804777623706254L, (long)var2_2);
                                }
                            }
                            if (v50 == false) break block157;
                            v75 = this;
                        }
                        try {
                            try {
                                if (var18_10 != null) break block160;
                                if (v75.D == null) break block157;
                            }
                            catch (MatchException v78) {
                                throw d_.d("y", (Object)v78, (long)-1188804777623706254L, (long)var2_2);
                            }
                            v75 = this;
                        }
                        catch (MatchException v79) {
                            throw d_.d("y", (Object)v79, (long)-1188804777623706254L, (long)var2_2);
                        }
                    }
                    try {
                        block162: {
                            try {
                                try {
                                    try {
                                        if (var18_10 != null) break block161;
                                        if (v75.y == e_0.SWITCH_RAIL) break block162;
                                    }
                                    catch (MatchException v80) {
                                        throw d_.d("y", (Object)v80, (long)-1188804777623706254L, (long)var2_2);
                                    }
                                    v75 = this;
                                    if (var18_10 != null) break block161;
                                }
                                catch (MatchException v81) {
                                    throw d_.d("y", (Object)v81, (long)-1188804777623706254L, (long)var2_2);
                                }
                                if (v75.y != e_0.SWITCH_CART) break block157;
                            }
                            catch (MatchException v82) {
                                throw d_.d("y", (Object)v82, (long)-1188804777623706254L, (long)var2_2);
                            }
                        }
                        v75 = this;
                    }
                    catch (MatchException v83) {
                        throw d_.d("y", (Object)v83, (long)-1188804777623706254L, (long)var2_2);
                    }
                }
                var19_14 = d_.d("\u00d3", (Object)v75.D, (long)-1187643409223972264L, (long)var2_2);
                var20_15 = new class_243((double)d_.d("\u00d3", (Object)var19_14, (long)-1154846712500692319L, (long)var2_2) + 0.5, (double)d_.d("\u00d3", (Object)var19_14, (long)-1183456769074231201L, (long)var2_2) + 0.5, (double)d_.d("\u00d3", (Object)var19_14, (long)-1185826359603485013L, (long)var2_2) + 0.5);
                v84 = new Object[2];
                v84[1] = var14_8;
                v84[0] = var20_15;
                var21_17 = d_.d("\u00d3", (Object)d_.d("\u00ff", (long)-1185295728575816246L, (long)var2_2), (Object)v84, (long)-1182297933592305554L, (long)var2_2);
                try {
                    v85 = var21_17;
                    if (var18_10 != null) break block163;
                    if (v85 == null) break block157;
                }
                catch (MatchException v86) {
                    throw d_.d("y", (Object)v86, (long)-1188804777623706254L, (long)var2_2);
                }
                v85 = var21_17;
            }
            v87 = new Object[2];
            v87[1] = var8_5;
            v87[0] = Float.valueOf((float)(d_.d("\u00d3", (Object)v85, (Object)new Object[0], (long)-1155928587900884649L, (long)var2_2) - d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.b, (long)-1188852493478225142L, (long)var2_2), (long)-1186545792364022855L, (long)var2_2)));
            var22_19 = d_.d("y", (float)d_.d("y", (Object)v87, (long)-1182437580643546371L, (long)var2_2), (long)-1154216013619804028L, (long)var2_2);
            try {
                if (var22_19 <= d_.d("\u00d3", (Object)((Float)d_.d("\u00d3", (Object)this.s, (long)-1184168290193359044L, (long)var2_2)), (long)-1155659605542278928L, (long)var2_2)) {
                    return var21_17;
                }
            }
            catch (MatchException v88) {
                throw d_.d("y", (Object)v88, (long)-1188804777623706254L, (long)var2_2);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bh_0 bh_02) {
        long l;
        long l2;
        block96: {
            CallSite callSite;
            block95: {
                d_ d_2;
                long l3;
                block89: {
                    CallSite callSite2;
                    block93: {
                        CallSite callSite3;
                        long l4;
                        block94: {
                            block91: {
                                block92: {
                                    block90: {
                                        d_ d_3;
                                        Object object;
                                        long l5;
                                        long l6;
                                        block88: {
                                            d_ d_4;
                                            long l7;
                                            block87: {
                                                Object object2;
                                                block85: {
                                                    long l8;
                                                    block86: {
                                                        block83: {
                                                            int n;
                                                            block84: {
                                                                CallSite callSite4;
                                                                long l9;
                                                                block78: {
                                                                    CallSite callSite5;
                                                                    block80: {
                                                                        block79: {
                                                                            CallSite callSite6;
                                                                            block81: {
                                                                                CallSite callSite7;
                                                                                block82: {
                                                                                    class_310 class_3102;
                                                                                    block76: {
                                                                                        block77: {
                                                                                            block75: {
                                                                                                d_ d_5;
                                                                                                block73: {
                                                                                                    block74: {
                                                                                                        block72: {
                                                                                                            Object object3;
                                                                                                            block70: {
                                                                                                                block71: {
                                                                                                                    long l10 = l2 = Y ^ 0x4F345146854EL;
                                                                                                                    l4 = l10 ^ 0x34F82D555FB6L;
                                                                                                                    l9 = l10 ^ 0x4874BDE51521L;
                                                                                                                    l8 = l10 ^ 0x690CC71166EBL;
                                                                                                                    l7 = l10 ^ 0x12269ECB757DL;
                                                                                                                    l = l10 ^ 0x3F301E230FB9L;
                                                                                                                    l6 = l10 ^ 0x1E52E0EE4D16L;
                                                                                                                    l3 = l10 ^ 0x34EEE7DF969EL;
                                                                                                                    l5 = l10 ^ 0x7CBCA8C52DFEL;
                                                                                                                    callSite = d_.d("y", (long)-1075889569917987248L, (long)l2);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            object3 = this.S;
                                                                                                                            if (callSite != null) break block70;
                                                                                                                            if (!object3) break block71;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                                        }
                                                                                                                        this.S = 0;
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    d_5 = this;
                                                                                                                    if (callSite != null) break block72;
                                                                                                                    object3 = d_.d("\u00d3", (Object)((Boolean)((Object)d_.d("\u00d3", (Object)d_5.l, (long)-1075238273196154433L, (long)l2))), (long)-1046153568216470647L, (long)l2);
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                                }
                                                                                                            }
                                                                                                            if (!object3) {
                                                                                                                return;
                                                                                                            }
                                                                                                            d_5 = this;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (callSite != null) break block73;
                                                                                                                if (d_5.y == e_0.IDLE) break block74;
                                                                                                                return;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                            }
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                        }
                                                                                                    }
                                                                                                    d_5 = this;
                                                                                                }
                                                                                                try {
                                                                                                    if (d_5.W) {
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        class_3102 = b;
                                                                                                        if (callSite != null) break block75;
                                                                                                        if (d_.d("Z", (Object)class_3102, (long)-1079920810066999927L, (long)l2) == null) return;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                    }
                                                                                                    class_3102 = b;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (callSite != null) break block76;
                                                                                                    if (d_.d("Z", (Object)class_3102, (long)-1074373605137669302L, (long)l2) != null) break block77;
                                                                                                    return;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                            }
                                                                                        }
                                                                                        class_3102 = b;
                                                                                    }
                                                                                    callSite4 = d_.d("\u00d3", (Object)d_.d("Z", (Object)class_3102, (long)-1079920810066999927L, (long)l2), (long)-1045581101628891521L, (long)l2);
                                                                                    CallSite callSite8 = d_.d("\u00d3", (Object)callSite4, (long)-1045694464445925873L, (long)l2);
                                                                                    n = 0;
                                                                                    object = 1.0f;
                                                                                    CallSite callSite9 = d_.d("\u00d3", (Object)bh_02, (Object)new Object[0], (long)-1046378578034051739L, (long)l2);
                                                                                    try {
                                                                                        object2 = callSite9 instanceof class_2846;
                                                                                        if (callSite != null) break block78;
                                                                                        if (object2 == 0) break block79;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                    }
                                                                                    class_2846 class_28462 = (class_2846)callSite9;
                                                                                    try {
                                                                                        try {
                                                                                            callSite5 = class_28462;
                                                                                            if (callSite != null) break block80;
                                                                                            if (d_.d("\u00d3", (Object)callSite5, (long)-1045859536614430061L, (long)l2) != d_.d("\u00ff", (long)-1078643129512085623L, (long)l2)) break block79;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                        }
                                                                                        if (callSite8 != d_.d("\u00ff", (long)-1046282517812728029L, (long)l2)) break block79;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                    }
                                                                                    callSite7 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-1079920810066999927L, (long)l2), (long)-1080330212962103127L, (long)l2);
                                                                                    try {
                                                                                        try {
                                                                                            callSite6 = callSite7;
                                                                                            if (callSite != null) break block81;
                                                                                            if (callSite6 >= 4) break block82;
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                                    }
                                                                                }
                                                                                n = 1;
                                                                                callSite6 = callSite7;
                                                                            }
                                                                            object = d_.d("y", (int)callSite6, (long)-1045655462181799740L, (long)l2);
                                                                            break block84;
                                                                        }
                                                                        callSite5 = d_.d("\u00d3", (Object)bh_02, (Object)new Object[0], (long)-1046378578034051739L, (long)l2);
                                                                    }
                                                                    object2 = callSite5 instanceof class_2886;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (callSite != null) break block83;
                                                                            if (object2 == 0) break block84;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                        }
                                                                        Object[] objectArray = new Object[2];
                                                                        objectArray[1] = l9;
                                                                        objectArray[0] = callSite4;
                                                                        object2 = d_.d("\u00d3", (Object)this, (Object)objectArray, (long)-1077368126376169538L, (long)l2);
                                                                        if (callSite != null) break block83;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                    }
                                                                    if (object2 == 0) break block84;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                                }
                                                                n = 1;
                                                                object = 1.0500001f;
                                                            }
                                                            object2 = n;
                                                        }
                                                        try {
                                                            if (callSite != null) break block85;
                                                            if (object2 != 0) break block86;
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                        }
                                                    }
                                                    try {
                                                        d_4 = this;
                                                        if (callSite != null) break block87;
                                                        Object[] objectArray = new Object[1];
                                                        objectArray[0] = l8;
                                                        object2 = d_.d("\u00d3", (Object)d_4, (Object)objectArray, (long)-1075095866022824217L, (long)l2);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                    }
                                                }
                                                try {
                                                    if (object2 == -1) {
                                                        return;
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                }
                                                d_4 = this;
                                            }
                                            try {
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l7;
                                                if (d_.d("\u00d3", (Object)d_4, (Object)objectArray, (long)-1077736980644325446L, (long)l2) == null) {
                                                    return;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                            }
                                            Object var25_19 = null;
                                            try {
                                                try {
                                                    d_3 = this;
                                                    if (callSite != null) break block88;
                                                    if (d_.d("\u00d3", (String)((Object)d_.d("\u00d3", (Object)d_3.k, (long)-1075238273196154433L, (long)l2)), (Object)d_.b("y", (int)1990, (long)(0x53D799D29D386F4EL ^ l2)), (long)-1046717773627266104L, (long)l2) == false) break block89;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                                }
                                                d_3 = this;
                                            }
                                            catch (MatchException matchException) {
                                                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                            }
                                        }
                                        Object[] objectArray = new Object[4];
                                        objectArray[3] = l6;
                                        objectArray[2] = Float.valueOf(object);
                                        objectArray[1] = Float.valueOf((float)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-1079920810066999927L, (long)l2), (long)-1076694790064639835L, (long)l2));
                                        objectArray[0] = Float.valueOf((float)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-1079920810066999927L, (long)l2), (long)-1077614125813895878L, (long)l2));
                                        callSite3 = d_.d("\u00d3", (Object)d_3, (Object)objectArray, (long)-1075523337594841653L, (long)l2);
                                        try {
                                            if (callSite3 == null) {
                                                return;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                        }
                                        try {
                                            try {
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l5;
                                                objectArray2[0] = d_.d("\u00d3", (Object)callSite3, (long)-1078711244760017701L, (long)l2);
                                                callSite2 = d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)-1079705511285368798L, (long)l2);
                                                if (callSite != null) break block90;
                                                if (callSite2 != false) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                            }
                                            Object[] objectArray3 = new Object[2];
                                            objectArray3[1] = l5;
                                            objectArray3[0] = callSite3;
                                            callSite2 = d_.d("\u00d3", (Object)this, (Object)objectArray3, (long)-1079705511285368798L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                        }
                                    }
                                    try {
                                        if (callSite != null) break block91;
                                        if (callSite2 == false) break block92;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                                    }
                                }
                                callSite2 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-1074373605137669302L, (long)l2), (Object)d_.d("\u00d3", (Object)callSite3, (long)-1078711244760017701L, (long)l2), (long)-1048480260152181564L, (long)l2), (long)-1078864866838812918L, (long)l2);
                            }
                            try {
                                if (callSite != null) break block93;
                                if (callSite2 != false) break block94;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                            }
                        }
                        try {
                            d_2 = this;
                            if (callSite != null) break block95;
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l4;
                            objectArray[0] = callSite3;
                            callSite2 = d_.d("\u00d3", (Object)d_2, (Object)objectArray, (long)-1045939185062887479L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                        }
                    }
                    if (callSite2 == false) {
                        return;
                    }
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                this.F = (int)d_.d("y", (Object)objectArray, (long)-1047154115072041897L, (long)l2);
                d_2 = this;
            }
            try {
                void var25_21;
                try {
                    d_2.z = d_0.PASSIVE;
                    if (callSite != null) return;
                    if (var25_21 == null) break block96;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
                }
                this.D = var25_21;
                this.E = 1;
            }
            catch (MatchException matchException) {
                throw d_.d("y", (Object)matchException, (long)-1079873179793441807L, (long)l2);
            }
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        this.L = d_.d("\u00d3", (Object)this, (Object)objectArray, (long)-1048686296951215761L, (long)l2);
        this.M = 0;
        this.y = e_0.SWITCH_RAIL;
        this.G = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_1701 a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        block22: {
            block23: {
                class_310 class_3102;
                block21: {
                    l2 = (Long)objectArray[0];
                    l = (l2 = Y ^ l2) ^ 0x736DAFC65D8DL;
                    callSite2 = d_.d("y", (long)-5707560371958655093L, (long)l2);
                    try {
                        try {
                            class_3102 = b;
                            if (callSite2 != null) break block21;
                            if (d_.d("Z", (Object)class_3102, (long)-5707170324265180527L, (long)l2) == null) return null;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                    }
                }
                try {
                    try {
                        callSite = d_.d("Z", (Object)class_3102, (long)-5703710484288191406L, (long)l2);
                        if (callSite2 != null) break block22;
                        if (callSite != null) break block23;
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                }
            }
            callSite = d_.d("Z", (Object)b, (long)-5703710484288191406L, (long)l2);
        }
        CallSite callSite3 = d_.d("\u00d3", (Object)callSite, (long)-5718314494631269455L, (long)l2);
        CallSite callSite4 = d_.d("\u00d3", (Object)((Float)((Object)d_.d("\u00d3", (Object)this.n, (long)-5708035129494052764L, (long)l2))), (long)-5715555241843083352L, (long)l2);
        class_1701 class_17012 = null;
        Object object = Double.MAX_VALUE;
        CallSite callSite5 = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-5703710484288191406L, (long)l2), (float)1.0f, (long)-5706068978095801675L, (long)l2);
        CallSite callSite6 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-5707170324265180527L, (long)l2), (long)-5715616705229602797L, (long)l2), (long)-5717986216497856173L, (long)l2);
        while (d_.d("\u00d3", (Object)callSite6, (long)-5702306193339269261L, (long)l2) != false) {
            block26: {
                reference v12;
                class_1701 class_17013;
                block25: {
                    class_1297 class_12972;
                    block24: {
                        class_1297 class_12973 = (class_1297)d_.d("\u00d3", (Object)callSite6, (long)-5705412349927563856L, (long)l2);
                        try {
                            class_12972 = class_12973;
                            if (callSite2 != null) break block24;
                            if (!(class_12972 instanceof class_1701)) continue;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                        }
                        class_12972 = class_12973;
                    }
                    class_17013 = (class_1701)class_12972;
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l;
                    objectArray2[0] = class_17013;
                    CallSite callSite7 = d_.d("\u00d3", (Object)callSite3, (Object)d_.d("y", (Object)objectArray2, (long)-5715323315589100066L, (long)l2), (long)-5704031011124955464L, (long)l2);
                    try {
                        if (callSite7 > (double)callSite4) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l;
                    objectArray3[0] = class_17013;
                    CallSite callSite8 = d_.d("\u00d3", (Object)d_.d("y", (Object)objectArray3, (long)-5715323315589100066L, (long)l2), (Object)callSite3, (long)-5702217382235141436L, (long)l2);
                    CallSite callSite9 = d_.d("y", (double)(d_.d("Z", (Object)callSite8, (long)-5715429603971687207L, (long)l2) * d_.d("Z", (Object)callSite8, (long)-5715429603971687207L, (long)l2) + d_.d("Z", (Object)callSite8, (long)-5705338839538076582L, (long)l2) * d_.d("Z", (Object)callSite8, (long)-5705338839538076582L, (long)l2)), (long)-5708221942102067219L, (long)l2);
                    try {
                        if (callSite9 < 1.0E-6) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                    }
                    CallSite callSite10 = d_.d("\u00d3", (Object)callSite8, (long)-5708002686215167251L, (long)l2);
                    CallSite callSite11 = d_.d("\u00d3", (Object)callSite5, (Object)callSite10, (long)-5706448232434954874L, (long)l2);
                    CallSite callSite12 = d_.d("y", (double)((double)d_.d("y", (float)((float)callSite11), (float)-1.0f, (float)1.0f, (long)-5702183931224105959L, (long)l2)), (long)-5708748757311196830L, (long)l2);
                    reference var26_19 = callSite12 * 8.0 + callSite7 * 0.05;
                    try {
                        try {
                            v12 = var26_19;
                            if (callSite2 != null) break block25;
                            if (!(v12 < object)) break block26;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                        }
                        v12 = var26_19;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-5703662527867258326L, (long)l2);
                    }
                }
                object = v12;
                class_17012 = class_17013;
            }
            if (callSite2 == null) continue;
        }
        return class_17012;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_3965 a(Object[] objectArray) {
        class_3965 class_39652;
        class_3965 class_39653;
        CallSite callSite;
        long l;
        block23: {
            block24: {
                CallSite callSite2;
                CallSite callSite3;
                block22: {
                    block20: {
                        block21: {
                            d_ d_2;
                            block19: {
                                l = (Long)objectArray[0];
                                l = Y ^ l;
                                callSite3 = d_.d("y", (long)7553557894084759442L, (long)l);
                                try {
                                    try {
                                        d_2 = this;
                                        if (callSite3 != null) break block19;
                                        if (!d_2.E) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                                    }
                                    d_2 = this;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite3 != null) break block21;
                                    if (d_2.D == null) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                                }
                                this.A = (int)d_.d("\u00d3", (Object)this.D, (long)7545821317076213216L, (long)l);
                                this.B = (int)(d_.d("\u00d3", (Object)this.D, (long)7553251103139630878L, (long)l) + 1);
                                d_2 = this;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                            }
                        }
                        d_2.C = (int)d_.d("\u00d3", (Object)this.D, (long)7550870539354612202L, (long)l);
                        return new class_3965(new class_243((double)this.A + 0.5, (double)d_.d("\u00d3", (Object)this.D, (long)7553251103139630878L, (long)l) + 1.0, (double)this.C + 0.5), (class_2350)d_.d("\u00ff", (long)7553411749739405927L, (long)l), this.D, false);
                    }
                    callSite = d_.d("Z", (Object)b, (long)7553897640056593355L, (long)l);
                    try {
                        try {
                            callSite2 = callSite;
                            if (callSite3 != null) break block22;
                            if (!(callSite2 instanceof class_3965)) return null;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                        }
                        callSite2 = callSite;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                    }
                }
                class_39653 = (class_3965)callSite2;
                try {
                    if (callSite3 != null) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                }
                try {
                    try {
                        class_39652 = class_39653;
                        if (callSite3 != null) break block23;
                        if (d_.d("\u00d3", (Object)class_39652, (long)7545741207801272194L, (long)l) == d_.d("\u00ff", (long)7553411749739405927L, (long)l)) break block24;
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)7548465980381864499L, (long)l);
                }
            }
            class_39652 = class_39653;
        }
        callSite = d_.d("\u00d3", (Object)class_39652, (long)7546682540992646645L, (long)l);
        this.A = (int)d_.d("\u00d3", (Object)callSite, (long)7545821317076213216L, (long)l);
        this.B = (int)(d_.d("\u00d3", (Object)callSite, (long)7553251103139630878L, (long)l) + 1);
        this.C = (int)d_.d("\u00d3", (Object)callSite, (long)7550870539354612202L, (long)l);
        return class_39653;
    }

    private void m(Object[] objectArray) {
        CallSite callSite;
        block24: {
            d_ d_2;
            CallSite callSite2;
            block25: {
                block20: {
                    d_ d_3;
                    long l;
                    block22: {
                        block21: {
                            CallSite callSite3;
                            block23: {
                                float f = ((Float)objectArray[0]).floatValue();
                                float f10 = ((Float)objectArray[1]).floatValue();
                                float f11 = ((Float)objectArray[2]).floatValue();
                                l = (Long)objectArray[3];
                                long l2 = l = Y ^ l;
                                long l3 = l2 ^ 0x7C9FBF42989FL;
                                long l4 = l2 ^ 0x563572F98A3FL;
                                long l5 = l2 ^ 0x34DB3AD2EAD7L;
                                Object[] objectArray2 = new Object[4];
                                objectArray2[3] = l4;
                                objectArray2[2] = Float.valueOf(f);
                                objectArray2[1] = Float.valueOf(f11);
                                objectArray2[0] = Float.valueOf(f10);
                                callSite2 = d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)3907912121527276258L, (long)l);
                                CallSite callSite4 = d_.d("y", (long)3907123663851901305L, (long)l);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite4 != null) break block20;
                                                                    if (callSite2 == null) break block21;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                                                }
                                                                d_3 = this;
                                                                if (callSite4 != null) break block22;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                                            }
                                                            Object[] objectArray3 = new Object[2];
                                                            objectArray3[1] = l5;
                                                            objectArray3[0] = d_.d("\u00d3", (Object)callSite2, (long)3904319271488705522L, (long)l);
                                                            if (d_.d("\u00d3", (Object)d_3, (Object)objectArray3, (long)3903870912488414987L, (long)l) != false) break block21;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                                        }
                                                        d_3 = this;
                                                        if (callSite4 != null) break block22;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                                    }
                                                    Object[] objectArray4 = new Object[2];
                                                    objectArray4[1] = l5;
                                                    objectArray4[0] = callSite2;
                                                    if (d_.d("\u00d3", (Object)d_3, (Object)objectArray4, (long)3903870912488414987L, (long)l) != false) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                                }
                                                callSite3 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)3908639052636709987L, (long)l), (Object)d_.d("\u00d3", (Object)callSite2, (long)3904319271488705522L, (long)l), (long)3916518304525155309L, (long)l), (long)3904148607451504675L, (long)l);
                                                if (callSite4 != null) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                            }
                                            if (callSite3 == false) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                        }
                                        d_2 = this;
                                        callSite = callSite2;
                                        if (callSite4 != null) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                    }
                                    Object[] objectArray5 = new Object[2];
                                    objectArray5[1] = l3;
                                    objectArray5[0] = callSite;
                                    callSite3 = d_.d("\u00d3", (Object)d_2, (Object)objectArray5, (long)3915136321659468000L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)3903157941979020504L, (long)l);
                                }
                            }
                            if (callSite3 != false) break block25;
                        }
                        d_3 = this;
                    }
                    d_.d("\u00d3", (Object)d_3, (Object)new Object[0], (long)3913823901128266656L, (long)l);
                }
                return;
            }
            d_2 = this;
            callSite = callSite2;
        }
        d_2.D = callSite;
        this.E = 1;
        this.y = e_0.SWITCH_RAIL;
        this.G = 0;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n3] != null) {
            return n3;
        }
        Object object = kb[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 36;
            case 1 -> 41;
            case 2 -> 49;
            case 3 -> 47;
            case 4 -> 6;
            case 5 -> 3;
            case 6 -> 1;
            case 7 -> 26;
            case 8 -> 40;
            case 9 -> 33;
            case 10 -> 60;
            case 11 -> 29;
            case 12 -> 42;
            case 13 -> 43;
            case 14 -> 9;
            case 15 -> 5;
            case 16 -> 20;
            case 17 -> 51;
            case 18 -> 31;
            case 19 -> 39;
            case 20 -> 8;
            case 21 -> 21;
            case 22 -> 34;
            case 23 -> 27;
            case 24 -> 63;
            case 25 -> 14;
            case 26 -> 56;
            case 27 -> 32;
            case 28 -> 0;
            case 29 -> 52;
            case 30 -> 46;
            case 31 -> 55;
            case 32 -> 59;
            case 33 -> 35;
            case 34 -> 12;
            case 35 -> 62;
            case 36 -> 50;
            case 37 -> 11;
            case 38 -> 13;
            case 39 -> 37;
            case 40 -> 2;
            case 41 -> 57;
            case 42 -> 4;
            case 43 -> 28;
            case 44 -> 15;
            case 45 -> 61;
            case 46 -> 22;
            case 47 -> 44;
            case 48 -> 7;
            case 49 -> 23;
            case 50 -> 30;
            case 51 -> 16;
            case 52 -> 54;
            case 53 -> 19;
            case 54 -> 25;
            case 55 -> 18;
            case 56 -> 58;
            case 57 -> 24;
            case 58 -> 45;
            case 59 -> 48;
            case 60 -> 17;
            case 61 -> 38;
            case 62 -> 53;
            default -> 10;
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
        d_.lb[n3] = new String(cArray);
        return n3;
    }

    private void o(Object[] objectArray) {
        block5: {
            class_310 class_3102;
            long l;
            block4: {
                class_3965 class_39652 = (class_3965)objectArray[0];
                l = (Long)objectArray[1];
                l = Y ^ l;
                CallSite callSite = d_.d("y", (long)5392386081127607700L, (long)l);
                try {
                    try {
                        class_3102 = b;
                        if (callSite != null) break block4;
                        if (d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.d("Z", (Object)class_3102, (long)5388707956957593770L, (long)l), (Object)d_.d("Z", (Object)b, (long)5388397586237701709L, (long)l), (Object)d_.d("\u00ff", (long)5390251628303138165L, (long)l), (Object)class_39652, (long)5386057875785296848L, (long)l), (long)5394642985122867165L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)5388472981327577141L, (long)l);
                    }
                    class_3102 = b;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)5388472981327577141L, (long)l);
                }
            }
            d_.d("\u00d3", (Object)d_.d("Z", (Object)class_3102, (long)5388397586237701709L, (long)l), (Object)d_.d("\u00ff", (long)5390251628303138165L, (long)l), (long)5388976085191877429L, (long)l);
            d_.d("\u00d3", (Object)d_.d("\u00ff", (long)5389625861581502605L, (long)l), (Object)new Object[]{true}, (long)5391141278350557920L, (long)l);
        }
    }

    private static Field o(long l, long l2) {
        int n = d_.m(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = d_.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d_.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d_.g(clazz3, string2, clazz2)) != null) {
                    d_.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d_.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d_.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d_.n(2215947500561575L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d_.m(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = d_.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d_.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d_.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d_.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d_.n(2215947500561575L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d_.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d_.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d_.n(2215947500561575L, 0L);
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void k(Object[] var1_1) {
        block16: {
            block17: {
                block13: {
                    block14: {
                        block15: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (var2_2 = d_.Y ^ var2_2) ^ 60332513002826L;
                            v0 = new Object[1];
                            v0[0] = var4_3;
                            var7_4 = d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)new N((class_304)d_.d("Z", (Object)d_.d("Z", (Object)d_.b, (long)-8856844981215381702L, (long)var2_2), (long)-8829729791859807787L, (long)var2_2)), (Object)v0, (long)-8835652852746969331L, (long)var2_2), (long)-8855701278105423596L, (long)var2_2);
                            var6_5 = d_.d("y", (long)-8829965022062386636L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        try {
                                            v1 = var7_4;
                                            v2 /* !! */  = d_.c("a", (int)11006, (long)(643240038210367143L ^ var2_2));
                                            if (var6_5 != null) break block13;
                                            if (v1 < v2 /* !! */ ) {
                                            }
                                            ** GOTO lbl42
                                        }
                                        catch (MatchException v3) {
                                            throw d_.d("y", (Object)v3, (long)-8833950672466096235L, (long)var2_2);
                                        }
                                        v4 /* !! */  = d_.d("y", (long)d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.b, (long)-8827869831421834487L, (long)var2_2), (long)-8834037338778998576L, (long)var2_2), (int)var7_4, (long)-8829932650795546981L, (long)var2_2);
                                        if (var6_5 != null) break block14;
                                    }
                                    catch (MatchException v5) {
                                        throw d_.d("y", (Object)v5, (long)-8833950672466096235L, (long)var2_2);
                                    }
                                    if (v4 /* !! */  != 1) break block15;
                                }
                                catch (MatchException v6) {
                                    throw d_.d("y", (Object)v6, (long)-8833950672466096235L, (long)var2_2);
                                }
                                v4 /* !! */  = (CallSite)1;
                                break block14;
                            }
                            catch (MatchException v7) {
                                throw d_.d("y", (Object)v7, (long)-8833950672466096235L, (long)var2_2);
                            }
                        }
                        v4 /* !! */  = (CallSite)0;
                    }
                    var8_6 = v4 /* !! */ ;
                    try {
                        try {
                            if (var6_5 == null) break block16;
lbl42:
                            // 2 sources

                            v1 = d_.d("y", (long)d_.d("\u00d3", (Object)d_.d("\u00d3", (Object)d_.b, (long)-8827869831421834487L, (long)var2_2), (long)-8834037338778998576L, (long)var2_2), (int)var7_4, (long)-8856352627323648315L, (long)var2_2);
                            if (var6_5 != null) break block17;
                        }
                        catch (MatchException v8) {
                            throw d_.d("y", (Object)v8, (long)-8833950672466096235L, (long)var2_2);
                        }
                        v2 /* !! */  = (CallSite)1;
                    }
                    catch (MatchException v9) {
                        throw d_.d("y", (Object)v9, (long)-8833950672466096235L, (long)var2_2);
                    }
                }
                v1 = v1 == v2 /* !! */  ? (Object)1 : (Object)0;
            }
            var8_6 = v1;
        }
        d_.d("\u00d3", (Object)d_.d("Z", (Object)d_.d("Z", (Object)d_.b, (long)-8856844981215381702L, (long)var2_2), (long)-8829729791859807787L, (long)var2_2), (boolean)var8_6, (long)-8859006461482592529L, (long)var2_2);
    }

    private boolean k(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        block7: {
            block8: {
                l2 = (Long)objectArray[0];
                l = (l2 = Y ^ l2) ^ 0x9FF6038B2BL;
                CallSite callSite2 = d_.d("y", (long)8006244317282371674L, (long)l2);
                try {
                    try {
                        callSite = d_.d("Z", (Object)b, (long)8000945273956277123L, (long)l2);
                        if (callSite2 != null) break block7;
                        if (callSite != null) break block8;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)8001152691727640059L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)8001152691727640059L, (long)l2);
                }
            }
            callSite = d_.d("Z", (Object)b, (long)8000945273956277123L, (long)l2);
        }
        CallSite callSite3 = d_.d("\u00d3", (Object)callSite, (long)8031907617442545781L, (long)l2);
        try {
            if (d_.d("\u00d3", (Object)callSite3, (long)8031812076810610693L, (long)l2) == d_.d("\u00ff", (long)8030080299154321705L, (long)l2)) {
                return true;
            }
        }
        catch (MatchException matchException) {
            throw d_.d("y", (Object)matchException, (long)8001152691727640059L, (long)l2);
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = callSite3;
        return (boolean)d_.d("\u00d3", (Object)this, (Object)objectArray2, (long)8000120884702720436L, (long)l2);
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

    private int g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = Y ^ l;
        return (int)d_.d("y", (int)d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.d, (long)1240701759570493851L, (long)l))), (long)1236952023988647506L, (long)l), (int)3, (long)1250835876981105903L, (long)l);
    }

    private boolean g(Object[] objectArray) {
        double d;
        block2: {
            block3: {
                double d10 = (Double)objectArray[0];
                double d11 = (Double)objectArray[1];
                double d12 = (Double)objectArray[2];
                long l = (Long)objectArray[3];
                long l2 = (l = Y ^ l) ^ 0x70E70CBA06BFL;
                CallSite callSite = d_.d("\u00d3", (Object)d_.d("Z", (Object)b, (long)-1152791188504804214L, (long)l), (long)-1117921512391349399L, (long)l);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                double d13 = (double)d_.d("y", (Object)objectArray2, (long)-1147320632457138642L, (long)l);
                CallSite callSite2 = d_.d("y", (long)-1147710808241563821L, (long)l);
                double d14 = d10 - d_.d("Z", (Object)callSite, (long)-1119540315982111743L, (long)l);
                double d15 = d11 - d_.d("Z", (Object)callSite, (long)-1144162645494969066L, (long)l);
                double d16 = d12 - d_.d("Z", (Object)callSite, (long)-1149896195867691902L, (long)l);
                try {
                    double d17 = d14 * d14 + d15 * d15 + d16 * d16 - d13 * d13;
                    d = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                    if (callSite2 != null) break block2;
                    if (d > 0) break block3;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-1152734401378927886L, (long)l);
                }
                d = 1;
                break block2;
            }
            d = 0;
        }
        return (boolean)d;
    }

    private void j(Object[] objectArray) {
        this.y = e_0.IDLE;
        this.z = d_0.PASSIVE;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.D = null;
        this.E = 0;
        this.V = null;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = null;
    }

    private boolean j(Object[] objectArray) {
        Object object;
        block13: {
            block11: {
                CallSite callSite;
                long l;
                block12: {
                    int n;
                    long l2;
                    block10: {
                        l = (Long)objectArray[0];
                        l2 = (l = Y ^ l) ^ 0x6A3FA7D1C5FAL;
                        callSite = d_.d("y", (long)-8440710084406415971L, (long)l);
                        try {
                            try {
                                try {
                                    object = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.g, (long)-8440094555903796622L, (long)l))), (long)-8447749757014069829L, (long)l);
                                    n = 1;
                                    if (callSite != null) break block10;
                                    if (object <= n) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw d_.d("y", (Object)matchException, (long)-8444605729072431044L, (long)l);
                                }
                                object = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.h, (long)-8440094555903796622L, (long)l))), (long)-8447749757014069829L, (long)l);
                                if (callSite != null) break block12;
                            }
                            catch (MatchException matchException) {
                                throw d_.d("y", (Object)matchException, (long)-8444605729072431044L, (long)l);
                            }
                            n = -1;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)-8444605729072431044L, (long)l);
                        }
                    }
                    try {
                        if (object == n) break block11;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        object = d_.d("\u00d3", (Object)this.h, (Object)objectArray2, (long)-8444426055916136185L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-8444605729072431044L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block13;
                    if (object == false) break block11;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-8444605729072431044L, (long)l);
                }
                object = 1;
                break block13;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$0(Integer n) {
        Object object;
        block4: {
            block5: {
                long l = Y ^ 0x751FB04617AEL;
                CallSite callSite = d_.d("y", (long)7201702244784080048L, (long)l);
                try {
                    try {
                        object = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.g, (long)7202318306668032863L, (long)l))), (long)7200856361692841110L, (long)l);
                        if (callSite != null) break block4;
                        if (object <= 1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)7197806892191590673L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)7197806892191590673L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$solveShotRotation$9(double d, float[] fArray) {
        double d10;
        block2: {
            block3: {
                long l = Y ^ 0x765DE0BB96F2L;
                CallSite callSite = d_.d("y", (long)-2112868499226327572L, (long)l);
                try {
                    double d11 = (double)fArray[1] - d;
                    d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                    if (callSite != null) break block2;
                    if (d10 <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-2107758869319145395L, (long)l);
                }
                d10 = 1;
                break block2;
            }
            d10 = 0;
        }
        return (boolean)d10;
    }

    private boolean lambda$new$2(Boolean bl) {
        Object object;
        block4: {
            block5: {
                long l = Y ^ 0x1FF4994E7081L;
                CallSite callSite = d_.d("y", (long)350995869236290463L, (long)l);
                try {
                    try {
                        object = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.g, (long)350344794703516784L, (long)l))), (long)342834729094489017L, (long)l);
                        if (callSite != null) break block4;
                        if (object <= 1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)345886363749994046L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)345886363749994046L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$1(Float f) {
        Object object;
        block4: {
            block5: {
                long l = Y ^ 0x270C16D7A004L;
                CallSite callSite = d_.d("y", (long)-3144704296005881062L, (long)l);
                try {
                    try {
                        object = d_.d("\u00d3", (Object)((Integer)((Object)d_.d("\u00d3", (Object)this.g, (long)-3145319842770582283L, (long)l))), (long)-3151175422251502788L, (long)l);
                        if (callSite != null) break block4;
                        if (object <= 1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)-3149725707301445957L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)-3149725707301445957L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$3(Float f) {
        long l = Y ^ 0x6AAA9E428665L;
        return (boolean)d_.d("\u00d3", (Object)((Boolean)((Object)d_.d("\u00d3", (Object)this.m, (long)-992804152977841516L, (long)l))), (long)-986159393828034398L, (long)l);
    }

    private boolean lambda$new$4(Integer n) {
        long l = Y ^ 0x4ECB8DFC2BF1L;
        return (boolean)d_.d("\u00d3", (Object)((Boolean)((Object)d_.d("\u00d3", (Object)this.m, (long)6894163869108244224L, (long)l))), (long)6900729729155433782L, (long)l);
    }

    private boolean lambda$new$5(Boolean bl) {
        long l = Y ^ 0x4006035D9B0BL;
        return (boolean)d_.d("\u00d3", (String)((Object)d_.d("\u00d3", (Object)this.k, (long)-1200504731778793478L, (long)l)), (Object)d_.b("y", (int)1990, (long)(0x53D796E0CF23710BL ^ l)), (long)-1208019641398397555L, (long)l);
    }

    private boolean lambda$new$6(Float f) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = Y ^ 0x4895607B1DE2L;
                    callSite = d_.d("y", (long)7619434727438552828L, (long)l);
                    try {
                        try {
                            object = d_.d("\u00d3", (String)((Object)d_.d("\u00d3", (Object)this.k, (long)7620086025234200851L, (long)l)), (Object)d_.b("y", (int)1990, (long)(0x53D79E73AC05F7E2L ^ l)), (long)7626080821533111140L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)7615449192882578269L, (long)l);
                        }
                        object = d_.d("\u00d3", (Object)((Boolean)((Object)d_.d("\u00d3", (Object)this.r, (long)7620086025234200851L, (long)l))), (long)7626660694411096869L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)7615449192882578269L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)7615449192882578269L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$8(Color color) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = Y ^ 0x593EF4EB6A29L;
                    callSite = d_.d("y", (long)2195146550606330167L, (long)l);
                    try {
                        try {
                            object = d_.d("\u00d3", (String)((Object)d_.d("\u00d3", (Object)this.k, (long)2194636712583417560L, (long)l)), (Object)d_.b("y", (int)23027, (long)(0x5D7D44F82AE25E1DL ^ l)), (long)2170270690126988463L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw d_.d("y", (Object)matchException, (long)2190037062417994902L, (long)l);
                        }
                        object = d_.d("\u00d3", (Object)((Boolean)((Object)d_.d("\u00d3", (Object)this.t, (long)2194636712583417560L, (long)l))), (long)2169687005361784046L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d_.d("y", (Object)matchException, (long)2190037062417994902L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw d_.d("y", (Object)matchException, (long)2190037062417994902L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$7(Boolean bl) {
        long l = Y ^ 0x7F7D7F1A5365L;
        return (boolean)d_.d("\u00d3", (String)((Object)d_.d("\u00d3", (Object)this.k, (long)2826233298129385364L, (long)l)), (Object)d_.b("y", (int)1990, (long)(0x53D7A99BB364B965L ^ l)), (long)2833467793541119459L, (long)l);
    }

    private void lambda$onTick$10(class_3965 class_39652) {
        long l = Y ^ 0xDCB018A47D0L;
        long l2 = l ^ 0x75BB71550D2EL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_39652;
        d_.d("\u00d3", (Object)this, (Object)objectArray, (long)3718958264414093072L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(d_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(d_.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1743
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aO;
import dev.zprestige.prestige.aS;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.be_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.e7;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.y_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1743;
import net.minecraft.class_243;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fx
 */
public class fx_0
extends dV
implements dF {
    private dM d;
    private dM a;
    private dM c;
    private dO e;
    private dO f;
    private dS g;
    private dM h;
    private dO i;
    private dN j;
    private boolean k;
    private boolean l;
    private class_243 m;
    private class_1297 n;
    private static final String[] o;
    private static final double[] p;
    private static final long q;
    private static final long[] r;
    private static final Integer[] s;
    private static final Map t;
    private static final Object[] u;
    private static final String[] v;

    public fx_0() {
        long l;
        long l2 = l = q ^ 0x6C680E5623D7L;
        long l3 = l2 ^ 0x67718AD0B504L;
        long l4 = l2 ^ 0x15B14663AEE2L;
        this.k = 0;
        this.l = 0;
        this.m = null;
        this.n = null;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$1;
        fx_0.c("g", (Object)this.j, (Object)objectArray, (long)6438701791094022146L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = this::lambda$new$0;
        fx_0.c("g", (Object)this.i, (Object)objectArray2, (long)6437744698050936715L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fx_0.q = hc.a(4370055770603080010L, -7923325079370393992L, MethodHandles.lookup().lookupClass()).a(161575114237623L);
                        var20 = fx_0.q ^ 115453350272895L;
                        fx_0.u = new Object[147];
                        fx_0.v = new String[147];
                        fx_0.f();
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[7];
                        var17_4 = 0;
                        var16_5 = "\\\u00c07K\u00b5\u00d8\u00d1\u00db\b\u00ad\u007f\u0081\u00fe\u00a4\u00a5\u00fb]\b\u00c7\u00bf\u00a4\u00c4\u001f\u00c2R;\b\u000ef\u00d1\rq\u00cb\u001a\u00d6\b\u00cf\u0098os\u0019\u00ba\u00f7,";
                        var18_6 = "\\\u00c07K\u00b5\u00d8\u00d1\u00db\b\u00ad\u007f\u0081\u00fe\u00a4\u00a5\u00fb]\b\u00c7\u00bf\u00a4\u00c4\u001f\u00c2R;\b\u000ef\u00d1\rq\u00cb\u001a\u00d6\b\u00cf\u0098os\u0019\u00ba\u00f7,".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = fx_0.b(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00dd\u008en\u00e5\u00c2\u00e1\u00fc!\bCU\u00cf\u00d8\u008d\u00ff\u00cc\u0093";
                            var18_6 = "\u00dd\u008en\u00e5\u00c2\u00e1\u00fc!\bCU\u00cf\u00d8\u008d\u00ff\u00cc\u0093".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl45:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl50:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = fx_0.b(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl62:
                        // 1 sources

                        ** continue;
                    }
                }
                fx_0.t = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u00cf\u00f3F2\u00ac\u00f1e\u00c2\u007f\u008b\u000e\u00fa\u00dc\u0016\u00ec!\u00f6\u0010uM\u00d1\u00da\u0086\u008e\u009d\u0087\u00bc\u00d6}\u00b1H\u00cf";
                var5_15 = "\u00cf\u00f3F2\u00ac\u00f1e\u00c2\u007f\u008b\u000e\u00fa\u00dc\u0016\u00ec!\u00f6\u0010uM\u00d1\u00da\u0086\u008e\u009d\u0087\u00bc\u00d6}\u00b1H\u00cf".length();
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
lbl99:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "%k\u00b8\u00f6s\u0098\u00c9\u00dd2\u00f3&\u00d7\u00b7\u008a\u0098\u00c2";
                    var5_15 = "%k\u00b8\u00f6s\u0098\u00c9\u00dd2\u00f3&\u00d7\u00b7\u008a\u0098\u00c2".length();
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
lbl118:
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
lbl131:
                // 1 sources

                ** continue;
            }
        }
        fx_0.r = var6_12;
        fx_0.s = new Integer[6];
        v15 = new String[fx_0.b("h", (int)22090, (long)(2776655305065882556L ^ var20))];
        v15[0] = var11_3[3];
        v15[1] = var11_3[0];
        v15[2] = var11_3[4];
        v15[3] = var11_3[6];
        v15[4] = var11_3[2];
        v15[5] = var11_3[5];
        v15[fx_0.b("h", (int)9467, (long)(2487027485857485067L ^ var20))] = var11_3[1];
        fx_0.o = v15;
        v16 = new double[fx_0.b("h", (int)19266, (long)(5930875341704724147L ^ var20))];
        v16[0] = 0.95;
        v16[1] = 0.85;
        v16[2] = 0.7;
        v16[3] = 0.65;
        v16[4] = 0.35;
        v16[5] = 0.2;
        v16[fx_0.b("h", (int)11869, (long)(1315498348481059752L ^ var20))] = 0.05;
        fx_0.p = v16;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        this.m = null;
        this.n = null;
        this.k = 0;
        this.l = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fx_0.c("g", (Object)fx_0.c("P", (long)3983213804011488116L, (long)l), (Object)objectArray2, (long)3997121657199766254L, (long)l);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fx_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x101C;
        if (s[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])t.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fx_0.s[n2] = n3;
        }
        return s[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private dC b(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        class_1297 class_12972;
        block56: {
            CallSite callSite2;
            long l5;
            block55: {
                block54: {
                    Object object;
                    block53: {
                        block52: {
                            block49: {
                                CallSite callSite3;
                                CallSite callSite4;
                                long l6;
                                block51: {
                                    CallSite callSite5;
                                    CallSite callSite6;
                                    block50: {
                                        class_310 class_3102;
                                        block47: {
                                            block48: {
                                                class_12972 = (class_1297)objectArray[0];
                                                l4 = (Long)objectArray[1];
                                                long l7 = l4 = q ^ l4;
                                                l5 = l7 ^ 0xF517E8F23AAL;
                                                l6 = l7 ^ 0x532EE8F62D85L;
                                                l3 = l7 ^ 0x36301BA07EE6L;
                                                l2 = l7 ^ 0x22F6F0060B15L;
                                                l = l7 ^ 0x677FC7E0F6DAL;
                                                long l8 = l7 ^ 0x5E77A846DC86L;
                                                callSite2 = fx_0.c("k", (long)-747507575095566781L, (long)l4);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            class_3102 = b;
                                                                            if (callSite2 != null) break block47;
                                                                            Object[] objectArray2 = new Object[2];
                                                                            objectArray2[1] = l6;
                                                                            objectArray2[0] = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)class_3102, (long)-745040010454249165L, (long)l4), (long)-745403688260429273L, (long)l4);
                                                                            if (fx_0.c("k", (Object)objectArray2, (long)-746735598481468905L, (long)l4) != false) break block48;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                                        }
                                                                        class_3102 = b;
                                                                        if (callSite2 != null) break block47;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                                    }
                                                                    if (fx_0.c("g", (Object)fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)class_3102, (long)-745040010454249165L, (long)l4), (long)-745403688260429273L, (long)l4), (long)-745674291465983098L, (long)l4) instanceof class_1743) break block48;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                                }
                                                                class_3102 = b;
                                                                if (callSite2 != null) break block47;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                            }
                                                            Object[] objectArray3 = new Object[2];
                                                            objectArray3[1] = l8;
                                                            objectArray3[0] = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)class_3102, (long)-745040010454249165L, (long)l4), (long)-745403688260429273L, (long)l4);
                                                            if (fx_0.c("k", (Object)objectArray3, (long)-746293929734974066L, (long)l4) != false) break block48;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                        }
                                                        if (fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.a, (long)-746826273097666265L, (long)l4))), (long)-743943131230100947L, (long)l4) == false) break block48;
                                                        return null;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                                }
                                            }
                                            class_3102 = b;
                                        }
                                        callSite6 = fx_0.c("\u00fe", (Object)class_3102, (long)-747321248049026891L, (long)l4);
                                        try {
                                            try {
                                                if (fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.c, (long)-746826273097666265L, (long)l4))), (long)-743943131230100947L, (long)l4) != false) break block49;
                                                callSite5 = callSite6;
                                                if (callSite2 != null) break block50;
                                            }
                                            catch (MatchException matchException) {
                                                throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                            }
                                            if (callSite5 == null) return null;
                                        }
                                        catch (MatchException matchException) {
                                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                        }
                                        callSite5 = callSite6;
                                    }
                                    try {
                                        try {
                                            CallSite callSite3 = fx_0.c("g", (Object)callSite5, (long)-748146518011320341L, (long)l4);
                                            callSite3 = fx_0.c("P", (long)-747220378690835499L, (long)l4);
                                            if (callSite2 != null) break block51;
                                            if (callSite4 == callSite3) break block49;
                                        }
                                        catch (MatchException matchException) {
                                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                        }
                                        CallSite callSite3 = fx_0.c("g", (Object)callSite6, (long)-748146518011320341L, (long)l4);
                                        callSite3 = fx_0.c("P", (long)-749111401898711351L, (long)l4);
                                    }
                                    catch (MatchException matchException) {
                                        throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (callSite4 != callSite3) return null;
                                            object = fx_0.c("\u00fe", (Object)b, (long)-745040010454249165L, (long)l4);
                                            if (callSite2 != null) break block52;
                                        }
                                        catch (MatchException matchException) {
                                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                        }
                                        Object[] objectArray4 = new Object[2];
                                        objectArray4[1] = l6;
                                        objectArray4[0] = fx_0.c("g", (Object)object, (long)-745403688260429273L, (long)l4);
                                        if (fx_0.c("k", (Object)objectArray4, (long)-746735598481468905L, (long)l4) != false) break block49;
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                                }
                            }
                            object = class_12972;
                        }
                        try {
                            if (callSite2 != null) break block53;
                            if (object == null) return null;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                        }
                        object = class_12972;
                    }
                    try {
                        try {
                            callSite = fx_0.c("g", (Object)object, (long)-743840873222705687L, (long)l4);
                            if (callSite2 != null) break block54;
                            if (callSite == false) return null;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                        }
                        reference cfr_temp_0 = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)-745040010454249165L, (long)l4), (Object)class_12972, (long)-746612090168571470L, (long)l4) - 3.0f;
                        callSite = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block55;
                        if (callSite > 0) return null;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                    }
                    callSite = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)-745040010454249165L, (long)l4), (Object)class_12972, (long)-744824800549874496L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                }
            }
            try {
                try {
                    if (callSite2 != null) break block56;
                    if (callSite == false) return null;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
                }
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l5;
                objectArray5[0] = class_12972;
                callSite = fx_0.c("k", (Object)objectArray5, (long)-746008804658919117L, (long)l4);
            }
            catch (MatchException matchException) {
                throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
            }
        }
        try {
            if (callSite != false) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
        }
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l3;
        objectArray6[0] = class_12972;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l2;
        objectArray7[0] = fx_0.c("g", (Object)this, (Object)objectArray6, (long)-743642316864336434L, (long)l4);
        CallSite callSite7 = fx_0.c("k", (Object)objectArray7, (long)-749360567247461356L, (long)l4);
        try {
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l;
            objectArray8[0] = callSite7;
            if (fx_0.c("g", (Object)this, (Object)objectArray8, (long)-745619466823865252L, (long)l4) == false) return callSite7;
            return null;
        }
        catch (MatchException matchException) {
            throw fx_0.c("k", (Object)matchException, (long)-744038155670342190L, (long)l4);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fx_0.m(l, l2);
            object = u[n];
            try {
                if (!(object instanceof String)) break block2;
                fx_0.u[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fx_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fx_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fx_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fx_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = u;
        u[0] = "\u0013?0aH9\u0013?'=D6\tt'#D#\u000e\u0005s{\u0013";
        objectArray[1] = "{]-`1\u0001{]:<=\u000ea\u0016:\"=\u001bfgh|e_";
        objectArray[2] = Float.TYPE;
        fx_0.v[2] = "java/lang/Float";
        objectArray[3] = "m\u0011Y<xr{\u0011\\fkelZ_`gq}\u001dHw,cA";
        objectArray[4] = "1eM-\u00193DEF\"\b|9]U%\u00015Q";
        objectArray[5] = "\u007f\u001cdR\u0012[i\u001ca\b\u0001L~Wb\u000e\rXo\u0010u\u0019FJt";
        objectArray[6] = "\u0012om.2cgOf!#,\u0006Am*'vr";
        objectArray[7] = Boolean.TYPE;
        fx_0.v[7] = "java/lang/Boolean";
        objectArray[8] = "GDI]IaGD^\u0001En]\u000f^\u001fE{Z~\u000eB\u0014";
        objectArray[9] = "\u00121)yjI\u00121>%fF\bz>;fS\u000f\u000bod>";
        objectArray[10] = "C+?\u000f\u00147C+(S\u00188Y`(M\u0018-^\u0011y\u0012@zN\"*R\n\u0001\u001fz{";
        objectArray[11] = "\n\u007fAlDe\u001c\u007fD6Wr\u000b4G0[f\u001asP'\u0010s\u0016";
        objectArray[12] = "Q\u0003\u0003M\u0019l$#\bB\b#E-\u0003I\fy1";
        objectArray[13] = "g\u0007\n\u0010:Yg\u0007\u001dL6V}L\u001dR6Cz=L\nd";
        objectArray[14] = "|@\u0003~t!|@\u0014\"x.f\u000b\u0014<x;azFg q";
        objectArray[15] = "@\u0011R+4E@\u0011Ew8JZZEi8_]+\u00172`\u001e";
        objectArray[16] = "awQ\u0000d\u0010\u0014WZ\u000fu_uYQ\u0004q\u0005\u0001";
        objectArray[17] = ":{n%Mq1t\u007fj.|$yp\u0001\u001b~5jl-\fs";
        objectArray[18] = "%T\u0013\u000fF:.[\u0002@*9 Y\u0000\u000f\u0006";
        objectArray[19] = "'*\tt\u0019!1*\f.\n6&a\u000f(\u0006\"7&\u0018?M21";
        objectArray[20] = "^jPbo/+J[m~`JDPfz:>";
        objectArray[21] = "&*#`O\u001f0*&:\\\b'a%<P\u001c6&2+\u001b\u000b\t";
        objectArray[22] = "Q\u0010l<f\u0007Z\u001f}s\u0007\tQ\u0014y)";
        objectArray[23] = "q\u00067\n\u00018g\u00062P\u0012/pM1V\u001e;a\n&AU,R";
        objectArray[24] = "\f|5F\u0004Ty\\>I\u0015\u001b\u0018R5B\u0011Al";
        objectArray[25] = "\u001d3VJ5W\u000b3S\u0010&@\u001cxP\u0016*T\r?G\u0001aC:";
        objectArray[26] = "t}@cm?\u0001]Kl|p`S@gx*\u0014";
        objectArray[27] = "+\u0017U3(k=\u0017Pi;|*\\So7h;\u001bDx|\u007f\u0019";
        objectArray[28] = "z\u00143|2d\u000f48s#+n:3x'q\u001a";
        objectArray[29] = "h<\u0015V\u0006\u0016~<\u0010\f\u0015\u0001iw\u0013\n\u0019\u0015x0\u0004\u001dR\u0005c";
        objectArray[30] = "\t`N\u001fkp|@E\u0010z?\u001dNN\u001b~ei";
        objectArray[31] = Void.TYPE;
        fx_0.v[31] = "java/lang/Void";
        objectArray[32] = "U4Hj\u000e{ \u0014Ce\u001f4A\u001aHn\u001bn5";
        objectArray[33] = "\u0005uA\u0003X\u000fpUJ\fI@\u0011[A\u0007M\u001ae";
        objectArray[34] = "q5C\u0017;\u0012\u0004\u0015H\u0018*]e\u001bC\u0013.\u0007\u0011";
        objectArray[35] = "\u000e2.eg8{\u0012%jvw\u001a\u001c.ar-n";
        objectArray[36] = "f\u0019kG)\u0002p\u0019n\u001d:\u0015gRm\u001b6\u0001v\u0015z\f}\u0016L";
        objectArray[37] = "SB`+\u0002-&bk$\u0013bGl`/\u001783";
        objectArray[38] = "&8xuP\u001208}/C\u0005's~)O\u001164i>\u0004\u0006\r";
        objectArray[39] = "d8IxPo\u0011\u0018BwA p\u0016I|Ez\u0004";
        objectArray[40] = "\u000bA\u0003\u0002[d~a\b\rJ+\u001fo\u0003\u0006Nqk";
        objectArray[41] = "R}nAC\f']eNRCFSnEV\u00192";
        objectArray[42] = "V\"\fou0#\u0002\u0007`d\u007fB\f\fk`%6";
        objectArray[43] = ".5d\f*\b%:uCI\u00050<";
        objectArray[44] = "SZ \u000ej\u0015XU1A\u0002\u0015VZ\"";
        objectArray[45] = "l<4B.#\u0019\u001c?M?lx\u00124F;6\f";
        objectArray[46] = "Es6GS.Es!\u001b_!_8!\u0005_4XIvZ\t";
        objectArray[47] = "b;[k\t\u0013t;^1\u001a\u0004cp]7\u0016\u0010r7J ]\u0001B";
        objectArray[48] = "z:\u0002zC,\u000f\u001a\tuRcn\u0014\u0002~V9\u001a";
        objectArray[49] = "\u0003FAgW\u0002vfJhFM\u0017hAcB\u0017c";
        objectArray[50] = "\u001eGJo\u0017?\bGO5\u0004(\u001f\fL3\b<\u000eK[$C6";
        objectArray[51] = "8A\tB:x&I\u0013\rGh&";
        objectArray[52] = "\u0001\u0001\u0012B{\u0005\u0001\u0001\u0005\u001ew\n\u001bJ\u0005\u0000w\u001f\u001c;T_.";
        objectArray[53] = Double.TYPE;
        fx_0.v[53] = "java/lang/Double";
        objectArray[54] = "Ko\u0004HbMKo\u0013\u0014nBQ$\u0013\nnWVUCS<\u0016";
        objectArray[55] = "\u0015ZZ\u0010p\u001a\u0003Z_Jc\r\u0014\u0011\\Lo\u0019\u0005VK[$\u000e\"";
        objectArray[56] = ">\\ \u0002<WK|+\r-\u0018*r \u0006)B^";
        objectArray[57] = "\u0001$n<=W\u0017$kf.@\u0000oh`\"T\u0011(\u007fwiE\u0000";
        objectArray[58] = "L\u001c\r\u000eqA9<\u0006\u0001`\u000eX2\r\ndT,";
        objectArray[59] = Integer.TYPE;
        fx_0.v[59] = "java/lang/Integer";
        objectArray[60] = "Qs.\u0011n`$S%\u001e\u007f/E].\u0015{u1";
        objectArray[61] = "\u0015h\u0006e\u0010\u000f\u0003h\u0003?\u0003\u0018\u0014#\u00009\u000f\f\u0005d\u0017.D\u001c<";
        objectArray[62] = "_h/Ej\u0015*H$J{ZKF/A\u007f\u0000?";
        objectArray[63] = "\u0005hxBI\u0005\u0013h}\u0018Z\u0012\u0004#~\u001eV\u0006\u0015di\t\u001d\u0016\rdk\u0002G[1\u007fk\u001fG\u001c\u0006h";
        objectArray[64] = "\n\u0010{GF\u001c\u001c\u0010~\u001dU\u000b\u000b[}\u001bY\u001f\u001a\u001cj\f\u0012\b*";
        objectArray[65] = ")X[3H4\\xP<Y{=v[7]!I";
        objectArray[66] = "-[=x%~;[8\"6i,\u0010;$:}=W,3qhx";
        objectArray[67] = "J\u007f\u0019YMJ?_\u0012V\\\u0005^Q\u0019]X_*";
        objectArray[68] = "WRt0F{\"r\u007f?W4C|t4Sn7";
        objectArray[69] = "&Z\u0018|k+&Z\u000f g$<\u0011\u000f>g1;`]d3u";
        objectArray[70] = "\u00132\u001c\u00007\u0003f\u0012\u0017\u000f&L\u0007\u001c\u001c\u0004\"\u0016s";
        objectArray[71] = "\u001b\u000b\f\u0000*f\u0006\u001eT\"kk\u001e\u0018";
        objectArray[72] = "}U\u001fH>wkU\u001a\u0012-`|\u001e\u0019\u0014!tmY\u000e\u0003jcX";
        objectArray[73] = "uJ\u001b*9_\u0000j\u0010%(\u0010ad\u001b.,J\u0015";
        objectArray[74] = "5,:p\u000fm@\f1\u007f\u001e\"!\u0002:t\u001axU";
        objectArray[75] = "2\u000eL\u00197=rR\\XgWd\u000f[l#:f\u0004'\u001admq\u000f_]'ov\t'";
        objectArray[76] = "0\u0011\u000eiJ\u00180\u000bC1&\bl\r\u0016eq_2ZN\t\u001d\u0005mQIn\u001bZj";
        objectArray[77] = "8\nO'\u001bf?UB9|m\u0002\u0002@/\u0013i{\u0001Q)Cv\u0002\u0006\u0016x\fis[K-L\u0007";
        objectArray[78] = "oaIn\u0006^h>DpaVUiFf\u000eQ,jW`^NU4Ro\n_71\u0014{\u0001?";
        objectArray[79] = "\bFob\u00162\u000e\u0019hSH8OEh?zk\u000b\u00180S\u0014lMK`kM$\u000bB\u000fn\u0015mCK~3H8\u0003%";
        objectArray[80] = "zmy5\u0010\u001c.+k&a\fJo{4\u000e\u000b3lj2^\u0014Jg%'\u0000Y 3yc\u0005e";
        objectArray[81] = "<\u0017Qi\u007fl<\r\u001c1\u0013|`\u000bIeD+>[\u0010\tl{9_\u0017sx~?\u0017";
        objectArray[82] = "=*\u007fAhB4n\u007f@z9m\u0014wH~VjmtYx\u0006u\u0014s\u001e)Ije.C|\t\u0004";
        objectArray[83] = "'we&rw'g/uBn;\u00051)!0*i6\":`Uk9,{v9l27+\t'we&rw'g/uB";
        objectArray[84] = "\u000f\u0018E:\u0018#\f\u001bBz\b[XAP\"\u001f\f\u000f\u001b\u0007\u007fsb\u000f\u0011L#\tfYE\u0006<";
        objectArray[85] = "fX\u001ea\n\u001e2\u0004Zd6\u001a6\u0005\u0006laMlU[\u0000\u000fMf\u0019\u0007z\u000b\u001b2S\u0018";
        objectArray[86] = "\u0018n@?\u0013F\u0018t\rg\u007f]Hc\\8\u0013o\u001c\"\u0002n\u007f\u0005\u001d'L1\u000eX@r\f_";
        objectArray[87] = "[\u0004b|`5\u0002Tes~\r\u0007Pxwba5\u00049,85b\u0004=&th\u0018\u0000kr>wb\u0004=&th\u0018\u0000kr>wb\u0004=&th\u0018\u0000kr>wb\u0004=&th\u0018\u0000kr>wb";
        objectArray[88] = "![@k)/u\u001dRxX:\u0011YBj78hZSlg'\u0011]\u0014=(8`\u0000IhhV";
        objectArray[89] = ":m\\4\u0001{0h\u000b1<\u007fZ:\ncS{#9\u001be\u0003dZ:\u0018cSx#z\u000bjN\u0015";
        objectArray[90] = "\u0019&X\u0002\"2M`J\u0011S\")v\u0005Rc&\u0013|S\u001dhKB,\n\\>qHzEWS";
        objectArray[91] = "s\u001e+\u0018Nd#\u001cy^#q\u007f\u0003!\nJ}F\r!\u001aN\u001b%\\}\u0017Mjx\u0001(W#";
        objectArray[92] = "tU\u0019\u0002b\u007fgY\u001e\u0002\u0007l\r\u000f\u0012Whkt\f\u0003Q8t\rO\u001f]=`w\\\u0013Z=\u0005";
        objectArray[93] = "\r<\u0001\u000e\u001f+TtG\u0007pvYy\u001f\u0007\u001cD\t5G]p.\f=\u000f\u000e\u0001sQhO`";
        objectArray[94] = "Tr\u001ci+7\r:Z`Dj\u00007\u0002`(XP{X6D6U3\u001el<5V4^|D";
        objectArray[95] = "_x~v\u001bb\\{y6\u000b\u001a\b!kn\u001cM_{<1p#_qwo\n'\t%=p";
        objectArray[96] = "\u001f\u0017\u007ff[<\r\u0005akc'\t\u001d\u0019<\u001f!\f\u000b`|\f(\u0011f y\f!\u000e\u001f`j\u0005<c";
        objectArray[97] = "\u0001</TCB\u0005i8TS}Q\rg\u0002S\u0012Vtd\u0013UBI\rgUB\u0013W5>\u001d\u0004\u001a8";
        objectArray[98] = "!y\u001a4\u0011y|3\u0010<vsLg\u00151Oe `\u001e*\u001f\u001a";
        objectArray[99] = "$\u0011nz0\u0012'\u0012i: jsH{b7=$\u0012,:[S$\u0018gc!WrL-|";
        objectArray[100] = "qGx,+@mR-p@G\u001d\u001b{!/@d\u0018j'\u007f_\u001d\u001f-v0@lBp#p.";
        objectArray[101] = "\u001a_M\u000es\u0001\bMS\u0003K\u0016\u0007H+TvI\u001cCS\u00135K\u001bE+TvI\u001cCS\u00135K\u001bE+TvI\u001cCS\u00135K\u001bE+";
        objectArray[102] = "U-\u0012{FjSr\u0015J\u0018`\u0012.\u0015&*0QuCJD4\u0010 \u001dr\u001d|V)rs\u0001b\u0001#\u000b3\u0012k\u001cN";
        objectArray[103] = "6^\u0003\u0015\u001dL0\u0001\u0004$CFq]\u0004Hq\u00106\u0000\\\u001d&\u001a=A\u0002\u0018LNa\u0005\u0007$";
        objectArray[104] = "\u0013\u0018\u007fo\u0003s\u0010\u001bx/\u0013\u000bDAjw\u0004\\\u0013\u001b=.h2\u0013\u0011vv\u00126EE<i";
        objectArray[105] = "\t\u0015ksX0\u000eJfm?;3\u001eq-S(\\V7}\u0002Q";
        objectArray[106] = "][\u0017aYOWU\u0019,g^%\u000e\u001e3\bY\\\r\u000f5XF%O\u001c;Z\t]E\u00125\u00177";
        objectArray[107] = "1'\u0001aR}1=L9>mm;\u0019mi:3h@\u0001\u0000jn+\u0017qRgg:";
        objectArray[108] = "/uW\u0019}g{3E\n\fw\u001fwU\u0018cpftD\u001e3o\u001fw\u0002\tbq'.JOk\u001e";
        objectArray[109] = "`\f\u001ab{6<YD2\u001a#>\u0005\u00111MtdSN]%)0W\u0014&y|n\u0007";
        objectArray[110] = "T\u0015\u001bU-\bW\u0016\u001c\u0015=p\u0003L\u000eM*'T\u0016Y\u0013FIT\u001c\u0012L<M\u0002HXS";
        objectArray[111] = ".\u0012z7CcnNjv\u0013\tx\u0013mW@e\u0017G,7Wdo\u0000o5Pb\u0017";
        objectArray[112] = "-\u0014u\u001bR\u000e-Z3DXi~(t\u0012G\u0006zQw\u0003AVe(tA\u0012\u0013yP3\u0002\u0010\u0014\u007f(";
        objectArray[113] = "7\u0018\\PO?9\u0000\u0018\u001b=gV\\\u001c\u0019M`'\u0001AL\r\u000e";
        objectArray[114] = "EX\\#F-GZ\u001c!77*_\n6X3S\\\u001b0\b,*_\u00186X0S\u001f\u000b?E]";
        objectArray[115] = "\u000e\u0002\u0018\u0016\u0017\u0016ME\u001fT'BR\u0001\u0011NKp\u0000LI\u0018'N@C\u0013EXEQ\u0019\u0000)";
        objectArray[116] = "@|\u0000.R/\u0014:\u0012=#?p~\u0002/L8\t}\u0013)\u001c'pzTxS8\u0001'\t-\u0013V";
        objectArray[117] = "?\u001aoXii<\u0019h\u0018y\u0011hCz@nF?\u0019-\u001c\u0002(?\u0013fAx,iG,^";
        objectArray[118] = "\u001fq\u0012y\u0004/^}\u000e'\u0017FHAKs\u0019)H8Hb\u001fyWA\u0016g\u0010-F#\u0013!\u0004&&";
        objectArray[119] = "]TG\u000evl[\u000b@?(f\u001aW@S\u001a5^\u000b\u0018?|t\u000f\b\u0017\u000e?3\bJ'";
        objectArray[120] = "\f\u0012lT^\u0002K\u0010(\u001dVzU\u007foJ_\u0015[\u0006l[YED\u007f2^V\u0011U\u001d7\u0018B\u001a5";
        objectArray[121] = "\u0018\u0006\u0016nY;L@\u0004}( (\u0004\u0014oG,Q\u0007\u0005i\u00173(Y\u0000fC\"J\\FrHB";
        objectArray[122] = "q9$m`\u0011m,q1\u000b\u0018\u001de'`d\u0011df6f4\u000e\u001daq7{\u0011l<,b;\u007f";
        objectArray[123] = "\u0010q\u0013:L_Rt\u0004\u007f3_o6\u0010j\\[\u00165\u0001l\fDok\u0004cXU\rnBwS5";
        objectArray[124] = "\u0016\u0011u6eq\u0010Nr\u0007;{Q\u0012rk\t-\u0013N(;^/Q\u001dzj'oB\u0014g\u0007";
        objectArray[125] = "4\u0005d\u0010+OtYtQ{%b\u0004sc!]m\u0000\u000f\u0013x\u001fw\u0004wT;\u001dp\u0002\u000f";
        objectArray[126] = "i63'm\u00160\u007f7k\\\u0005R\u007fbx3\u0002+|s~c\u001dR{4/,\u0002#&izll";
        objectArray[127] = "Q4j{j$\u00166.2b\\\u0007Yiek3\u0006 jtmc\u0019Y4qb7\b;17v<h";
        objectArray[128] = "\u0016c\u0015Wv2\u0016-S\b|UF_\u0014^c:A&\u0017Oej^_\u0014\r6/B'SN4(D_";
        objectArray[129] = "2>v_\u0011Efb2Z-AbcnRz\u0016832>\u0014\u00162\u007foD\u0010@f5p";
        objectArray[130] = "y9\u0003J\u0006O%l]\u001agZ'0\b\u00190\r}fVuXP)b\r\u000e\u0004\u0005w2";
        objectArray[131] = "&>!3#Upe?:;(v\u0004w8,Gq}t)*\u0017n\u0004sn{Xqu.3.\u0018\u001f";
        objectArray[132] = "R\u00100h&t\u0013\u001c,65\u001d\u0006 ib;r\u0005Yjs=\"\u001a 4v2v\u000bB10&}k";
        objectArray[133] = "g\u001e\r\u0006f\u0014aA\n78\u001e \u001d\n[\nHbAP\n]J \u0012\u0002Z$\n3\u001b\u001f7";
        objectArray[134] = "nd\u0006\rWQ7,@\u00048\f:!\u0018\u0004T>lfE\\\u0001ifm\u0004\u0002\u0004\u000321@\u00078";
        objectArray[135] = "[r|'Y4Qw+\"d3;%*p\u000b4B&;v[+;%8p\u000b7Be+y\u0016Z";
        objectArray[136] = "ZB'L6\n\u001dL<\\|e\u0004}e\u0016,\u0001\u0011\u0014$\u001a0_\u0002";
        objectArray[137] = "\u000f=(y\u007fl[{:j\u000e\u007f??*xa{F<;~1d?f*/6(Ql/x3\u0015";
        objectArray[138] = "\u001d3sgs\u0010\u001c$y|\u0014\u0003~p~v{\u0004\u0007sop+\u001b~-j\u007f\u007f\n\u001c(,ktj";
        objectArray[139] = ")9Q\u0003=?ieABmU\u007f8Fs7(}U\u0003\u0004i/}-DGk({U";
        objectArray[140] = "\n\\^N%L\u000e\tIN5sZm\u0016\u00185\u001c]\u0014\u0015\t3LBm\u0016\u001d7\u0015R\u0013\u0016\r7HVm";
        objectArray[141] = "\u001a)yB-L]'bRg#Z\u0016;\u0016fDZm2RfEH";
        objectArray[142] = "\u0002a_Pa[\u0000c\u001fR\u0010Bmf\tE\u007fE\u0014e\u0018C/Zm?\t\u0012(\u0016\u00035\fE-+";
        objectArray[143] = "1\u0010n\f\u007fnr\t9\u0019\u0004z(\u0014?\u001eZ}(\u000e;b=h#\u001c;\u001b}{*\u0001V";
        objectArray[144] = "F| J\u007f2\u0014q)[\u0015'\u0015i\"Py\u0015A*}\u0007.BGq-\bt9\u001b$sX\u0015";
        objectArray[145] = "TU\u0014h\b<S\n\u0019vo4n]\u001b`\u00003\u0017^\nfP,n\u0015\nk\n\"V\u0001\u0010h\u0016]";
        Object[] objectArray2 = objectArray;
        objectArray[146] = "&_}\u0011\u000f6r\u00039\u001432v\u0002e\u001cde,R;p\ne&\u001ed\n\u000e3rT{";
    }

    private boolean d(Object[] objectArray) {
        int n;
        block6: {
            block5: {
                e7 e72;
                CallSite callSite;
                long l;
                block4: {
                    l = (Long)objectArray[0];
                    l = q ^ l;
                    callSite = fx_0.c("k", (long)-2365134090884287282L, (long)l);
                    try {
                        e72 = e7.a;
                        if (callSite != null) break block4;
                        if (e72 == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-2368418431570436257L, (long)l);
                    }
                    e72 = e7.a;
                }
                try {
                    n = fx_0.c("g", (Object)e72, (long)-2365690121506477171L, (long)l);
                    if (callSite != null) break block6;
                    if (n == false) break block5;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-2368418431570436257L, (long)l);
                }
                n = 1;
                break block6;
            }
            n = false;
        }
        return n != 0;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fx_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == 'c' || c == 'P' || c == '\u00df') {
                field = fx_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fx_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        this.m = null;
        this.n = null;
        this.k = 0;
        this.l = 0;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fx_0.c("g", (Object)fx_0.c("P", (long)3252843967386196247L, (long)l), (Object)objectArray2, (long)3253705964853718726L, (long)l);
    }

    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        block57: {
            CallSite callSite2;
            Object object;
            long l;
            long l2;
            long l3;
            block58: {
                fx_0 fx_02;
                CallSite callSite3;
                long l4;
                block55: {
                    block56: {
                        block54: {
                            Object object2;
                            block44: {
                                block45: {
                                    block51: {
                                        block53: {
                                            fx_0 fx_03;
                                            block52: {
                                                block50: {
                                                    CallSite callSite4;
                                                    block49: {
                                                        block48: {
                                                            class_1297 class_12972;
                                                            block46: {
                                                                block47: {
                                                                    long l5;
                                                                    block42: {
                                                                        block43: {
                                                                            block41: {
                                                                                fx_0 fx_04;
                                                                                long l6;
                                                                                block39: {
                                                                                    block40: {
                                                                                        l3 = (Long)objectArray[0];
                                                                                        long l7 = l3;
                                                                                        l4 = l7 ^ 0x7C421D456094L;
                                                                                        l2 = l7 ^ 0x452E3F968B39L;
                                                                                        l5 = l7 ^ 0x1562191DEA24L;
                                                                                        l6 = l7 ^ 0x7683706A4A19L;
                                                                                        l = l7 ^ 0x5EB4771264E5L;
                                                                                        object = this.n;
                                                                                        callSite3 = fx_0.c("k", (long)-1179035634649414592L, (long)l3);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    fx_04 = this;
                                                                                                    if (callSite3 != null) break block39;
                                                                                                    fx_04.n = null;
                                                                                                    if (object == null) break block40;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                                                }
                                                                                                object2 = fx_0.c("g", (Object)object, (long)-1175949474903164950L, (long)l3);
                                                                                                if (callSite3 != null) break block41;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                                            }
                                                                                            if (object2 != false) break block40;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                                        }
                                                                                        object = null;
                                                                                    }
                                                                                    fx_04 = this;
                                                                                }
                                                                                Object[] objectArray2 = new Object[1];
                                                                                objectArray2[0] = l6;
                                                                                object2 = fx_0.c("g", (Object)fx_04, (Object)objectArray2, (long)-1175599457878965281L, (long)l3);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite3 != null) break block42;
                                                                                    if (object2 == false) break block43;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                                }
                                                                                this.k = 0;
                                                                                this.m = null;
                                                                                return null;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                            }
                                                                        }
                                                                        object2 = fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.c, (long)-1179426390699168988L, (long)l3))), (long)-1175559154001889234L, (long)l3);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (callSite3 != null) break block44;
                                                                                if (object2 == false) break block45;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                            }
                                                                            class_12972 = object;
                                                                            if (callSite3 != null) break block46;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                        }
                                                                        if (class_12972 != null) break block47;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                                    }
                                                                    Object[] objectArray3 = new Object[1];
                                                                    objectArray3[0] = l5;
                                                                    object = fx_0.c("g", (Object)this, (Object)objectArray3, (long)-1179308534889607443L, (long)l3);
                                                                }
                                                                class_12972 = object;
                                                            }
                                                            try {
                                                                if (class_12972 == null) break block48;
                                                                Object[] objectArray4 = new Object[2];
                                                                objectArray4[1] = l4;
                                                                objectArray4[0] = object;
                                                                callSite4 = fx_0.c("g", (Object)this, (Object)objectArray4, (long)-1181328422601166737L, (long)l3);
                                                                break block49;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                            }
                                                        }
                                                        callSite4 = null;
                                                    }
                                                    callSite2 = callSite4;
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block50;
                                                            if (callSite2 == null) break block51;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                        }
                                                        Object[] objectArray5 = new Object[2];
                                                        objectArray5[1] = l;
                                                        objectArray5[0] = object;
                                                        this.m = fx_0.c("g", (Object)this, (Object)objectArray5, (long)-1176172031496398899L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        fx_03 = this;
                                                        if (callSite3 != null) break block52;
                                                        if (!fx_03.k) break block53;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                    }
                                                    this.k = 0;
                                                    fx_03 = this;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                                }
                                            }
                                            Object[] objectArray6 = new Object[2];
                                            objectArray6[1] = l2;
                                            objectArray6[0] = object;
                                            fx_0.c("g", (Object)fx_03, (Object)objectArray6, (long)-1177961899781551794L, (long)l3);
                                        }
                                        return callSite2;
                                    }
                                    this.m = null;
                                }
                                try {
                                    fx_02 = this;
                                    if (callSite3 != null) break block54;
                                    object2 = fx_02.k;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                                }
                            }
                            try {
                                if (object2 == false) {
                                    return null;
                                }
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                            }
                            fx_02 = this;
                        }
                        try {
                            try {
                                if (callSite3 != null) break block55;
                                fx_02.k = 0;
                                if (object != null) break block56;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                            }
                            return null;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                        }
                    }
                    fx_02 = this;
                }
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = l4;
                objectArray7[0] = object;
                callSite2 = fx_0.c("g", (Object)fx_02, (Object)objectArray7, (long)-1181328422601166737L, (long)l3);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block57;
                        if (callSite != null) break block58;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-1175494782674489391L, (long)l3);
                }
            }
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l;
            objectArray8[0] = object;
            this.m = fx_0.c("g", (Object)this, (Object)objectArray8, (long)-1176172031496398899L, (long)l3);
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = l2;
            objectArray9[0] = object;
            fx_0.c("g", (Object)this, (Object)objectArray9, (long)-1177961899781551794L, (long)l3);
            callSite = callSite2;
        }
        return callSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(be_0 be_02) {
        block39: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            block40: {
                long l7;
                block38: {
                    block36: {
                        block37: {
                            block34: {
                                long l8;
                                block35: {
                                    block33: {
                                        class_310 class_3102;
                                        block32: {
                                            long l9 = l6 = q ^ 0x6A875528BBAL;
                                            l5 = l9 ^ 0x664E0F9F2912L;
                                            l4 = l9 ^ 0x488692C6F4B0L;
                                            l7 = l9 ^ 0x66D27BDA5295L;
                                            l8 = l9 ^ 0x2B67FBB1548DL;
                                            l3 = l9 ^ 0x350FCC97A71L;
                                            l2 = l9 ^ 0x1796176F0F82L;
                                            l = l9 ^ 0x521F2089F24DL;
                                            callSite2 = fx_0.c("k", (long)-1065272067946259756L, (long)l6);
                                            try {
                                                try {
                                                    class_3102 = b;
                                                    if (callSite2 != null) break block32;
                                                    if (fx_0.c("\u00fe", (Object)class_3102, (long)-1064709922017569815L, (long)l6) != null) break block33;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                                                }
                                                class_3102 = b;
                                            }
                                            catch (MatchException matchException) {
                                                throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                                            }
                                        }
                                        try {
                                            callSite = fx_0.c("g", (Object)class_3102, (long)-1064893939979918004L, (long)l6);
                                            if (callSite2 != null) break block34;
                                            if (callSite != false) break block35;
                                        }
                                        catch (MatchException matchException) {
                                            throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                                        }
                                    }
                                    return;
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l8;
                                callSite = fx_0.c("g", (Object)this, (Object)objectArray, (long)-1064200395219231413L, (long)l6);
                            }
                            try {
                                if (callSite2 != null) break block36;
                                if (callSite == false) break block37;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                            }
                            return;
                        }
                        callSite = fx_0.c("g", (Object)be_02, (Object)new Object[0], (long)-1077139744943885111L, (long)l6);
                    }
                    try {
                        try {
                            if (callSite2 != null) break block38;
                            if (callSite != false) break block39;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                        }
                        callSite = fx_0.c("g", (Object)be_02, (Object)new Object[0], (long)-1067015232832215740L, (long)l6);
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block40;
                        if (callSite != 1) break block39;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l7;
                    objectArray[0] = (int)fx_0.c("g", (Object)be_02, (Object)new Object[0], (long)-1077139744943885111L, (long)l6);
                    callSite = fx_0.c("g", (Object)fx_0.c("P", (long)-1076816872370375176L, (long)l6), (Object)objectArray, (long)-1064667191635631343L, (long)l6);
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                }
            }
            if (callSite == false) {
                block43: {
                    fx_0 fx_02;
                    CallSite callSite3;
                    block44: {
                        CallSite callSite4;
                        block42: {
                            CallSite callSite5;
                            block41: {
                                CallSite callSite6 = fx_0.c("\u00fe", (Object)b, (long)-1065156114925573086L, (long)l6);
                                try {
                                    callSite5 = callSite6;
                                    if (callSite2 != null) break block41;
                                    if (callSite5 == null) break block39;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                                }
                                callSite5 = callSite6;
                            }
                            try {
                                try {
                                    try {
                                        if (fx_0.c("g", (Object)callSite5, (long)-1078267051764325508L, (long)l6) != fx_0.c("P", (long)-1077017514895416738L, (long)l6)) break block39;
                                        callSite4 = fx_0.c("\u00fe", (Object)b, (long)-1063373505753328220L, (long)l6);
                                        if (callSite2 != null) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l5;
                                    objectArray[0] = fx_0.c("g", (Object)callSite4, (long)-1067073648406192464L, (long)l6);
                                    if (fx_0.c("k", (Object)objectArray, (long)-1066162834243152256L, (long)l6) == false) break block39;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                callSite4 = fx_0.c("g", (Object)this, (Object)objectArray, (long)-1065632623846846343L, (long)l6);
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                            }
                        }
                        callSite3 = callSite4;
                        try {
                            if (callSite3 == null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l3;
                        objectArray[0] = callSite3;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l2;
                        objectArray2[0] = fx_0.c("g", (Object)this, (Object)objectArray, (long)-1064758125460764327L, (long)l6);
                        CallSite callSite7 = fx_0.c("k", (Object)objectArray2, (long)-1076771630632492925L, (long)l6);
                        try {
                            try {
                                fx_02 = this;
                                if (callSite2 != null) break block43;
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = l;
                                objectArray3[0] = callSite7;
                                if (fx_0.c("g", (Object)fx_02, (Object)objectArray3, (long)-1067297674510604085L, (long)l6) == false) break block44;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-1064098155009167035L, (long)l6);
                        }
                    }
                    this.n = callSite3;
                    fx_02 = this;
                }
                fx_02.k = 1;
                fx_0.c("g", (Object)be_02, (Object)new Object[0], (long)-1063242076660416832L, (long)l6);
            }
        }
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block6: {
            block8: {
                block7: {
                    dC dC2 = (dC)objectArray[0];
                    long l = (Long)objectArray[1];
                    long l2 = (l = q ^ l) ^ 0x35D013B89846L;
                    CallSite callSite = fx_0.c("k", (long)8785716293468967438L, (long)l);
                    try {
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l2;
                                objectArray2[0] = Float.valueOf((float)(fx_0.c("g", (Object)dC2, (Object)new Object[0], (long)8779361901486206054L, (long)l) - fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)8783257011668934014L, (long)l), (long)8784398325532700845L, (long)l)));
                                reference cfr_temp_0 = fx_0.c("k", (float)fx_0.c("k", (Object)objectArray2, (long)8785377718783525627L, (long)l), (long)8786333786030043782L, (long)l) - fx_0.c("g", (Object)((Float)((Object)fx_0.c("g", (Object)this.e, (long)8786468788976631146L, (long)l))), (long)8778833846874911570L, (long)l);
                                object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                if (callSite != null) break block6;
                                if (object > 0) break block7;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)8782536614967064991L, (long)l);
                            }
                            reference cfr_temp_1 = fx_0.c("k", (float)(fx_0.c("g", (Object)dC2, (Object)new Object[0], (long)8782345705404780450L, (long)l) - fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)8783257011668934014L, (long)l), (long)8779249421153386308L, (long)l)), (long)8786333786030043782L, (long)l) - fx_0.c("g", (Object)((Float)((Object)fx_0.c("g", (Object)this.f, (long)8786468788976631146L, (long)l))), (long)8778833846874911570L, (long)l);
                            object = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)8782536614967064991L, (long)l);
                        }
                        if (object <= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)8782536614967064991L, (long)l);
                    }
                }
                object = 1;
                break block6;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bD bD2) {
        long l;
        block60: {
            fx_0 fx_02;
            CallSite callSite;
            block61: {
                CallSite callSite2;
                CallSite callSite3;
                long l2;
                long l3;
                long l4;
                block59: {
                    long l5;
                    block58: {
                        CallSite callSite4;
                        CallSite callSite5;
                        long l6;
                        block57: {
                            CallSite callSite6;
                            CallSite callSite7;
                            block56: {
                                class_310 class_3102;
                                block54: {
                                    block55: {
                                        Object object;
                                        long l7;
                                        block52: {
                                            block53: {
                                                block50: {
                                                    long l8;
                                                    block51: {
                                                        class_310 class_3103;
                                                        block49: {
                                                            long l9 = l = q ^ 0x1AD9EDEF72C6L;
                                                            l6 = l9 ^ 0x7A3F9722D06EL;
                                                            l5 = l9 ^ 0x54F70A7B0DCCL;
                                                            l8 = l9 ^ 0x3716630CADF1L;
                                                            l4 = l9 ^ 0x1F216474830DL;
                                                            l3 = l9 ^ 0xBE78FD2F6FEL;
                                                            l2 = l9 ^ 0x4E6EB8340B31L;
                                                            l7 = l9 ^ 0x7766D792216DL;
                                                            callSite3 = fx_0.c("k", (long)597704155952784296L, (long)l);
                                                            try {
                                                                try {
                                                                    class_3103 = b;
                                                                    if (callSite3 != null) break block49;
                                                                    if (fx_0.c("\u00fe", (Object)class_3103, (long)596022739567045269L, (long)l) != null) return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                                }
                                                                class_3103 = b;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            if (fx_0.c("g", (Object)class_3103, (long)595777982178139184L, (long)l) == false) {
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                        }
                                                        try {
                                                            if (fx_0.c("g", (Object)bD2, (Object)new Object[0], (long)609523611211091626L, (long)l) != y_0.PRE) {
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                        }
                                                        try {
                                                            try {
                                                                object = this.l;
                                                                if (callSite3 != null) break block50;
                                                                if (!object) break block51;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                            }
                                                            fx_0.c("g", (Object)bD2, (Object)new Object[]{true}, (long)598945857669292678L, (long)l);
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                        }
                                                    }
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l8;
                                                    object = fx_0.c("g", (Object)this, (Object)objectArray, (long)596497223993091127L, (long)l);
                                                }
                                                try {
                                                    if (callSite3 != null) break block52;
                                                    if (!object) break block53;
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                }
                                            }
                                            try {
                                                class_3102 = b;
                                                if (callSite3 != null) break block54;
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = l6;
                                                objectArray[0] = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)class_3102, (long)595107506074627288L, (long)l), (long)598101726795163596L, (long)l);
                                                object = fx_0.c("k", (Object)objectArray, (long)596769816691044348L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (object) break block55;
                                                                class_3102 = b;
                                                                if (callSite3 != null) break block54;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                            }
                                                            if (fx_0.c("g", (Object)fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)class_3102, (long)595107506074627288L, (long)l), (long)598101726795163596L, (long)l), (long)598411676191266413L, (long)l) instanceof class_1743) break block55;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                        }
                                                        class_3102 = b;
                                                        if (callSite3 != null) break block54;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l7;
                                                    objectArray[0] = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)class_3102, (long)595107506074627288L, (long)l), (long)598101726795163596L, (long)l);
                                                    if (fx_0.c("k", (Object)objectArray, (long)598847421141297253L, (long)l) != false) break block55;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                                }
                                                if (fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.a, (long)597171597262015692L, (long)l))), (long)596677165884694470L, (long)l) == false) break block55;
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                        }
                                    }
                                    class_3102 = b;
                                }
                                callSite7 = fx_0.c("\u00fe", (Object)class_3102, (long)597802658257655134L, (long)l);
                                try {
                                    callSite6 = callSite7;
                                    if (callSite3 != null) break block56;
                                    if (callSite6 == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                }
                                callSite6 = callSite7;
                            }
                            try {
                                try {
                                    CallSite callSite4 = fx_0.c("g", (Object)callSite6, (long)609434718771452416L, (long)l);
                                    callSite4 = fx_0.c("P", (long)597428538784077374L, (long)l);
                                    if (callSite3 != null) break block57;
                                    if (callSite5 == callSite4) break block58;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                }
                                CallSite callSite4 = fx_0.c("g", (Object)callSite7, (long)609434718771452416L, (long)l);
                                callSite4 = fx_0.c("P", (long)608467773612694306L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (callSite5 != callSite4) return;
                                    callSite2 = fx_0.c("\u00fe", (Object)b, (long)595107506074627288L, (long)l);
                                    if (callSite3 != null) break block59;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                                }
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l6;
                                objectArray[0] = fx_0.c("g", (Object)callSite2, (long)598101726795163596L, (long)l);
                                if (fx_0.c("k", (Object)objectArray, (long)596769816691044348L, (long)l) != false) break block58;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l5;
                    callSite2 = fx_0.c("g", (Object)this, (Object)objectArray, (long)597290690085873925L, (long)l);
                }
                callSite = callSite2;
                try {
                    if (callSite == null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l4;
                objectArray[0] = callSite;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = fx_0.c("g", (Object)this, (Object)objectArray, (long)595922459372204069L, (long)l);
                CallSite callSite8 = fx_0.c("k", (Object)objectArray2, (long)608713387019557375L, (long)l);
                try {
                    try {
                        fx_02 = this;
                        if (callSite3 != null) break block60;
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l2;
                        objectArray3[0] = callSite8;
                        if (fx_0.c("g", (Object)fx_02, (Object)objectArray3, (long)597903543521513911L, (long)l) == false) break block61;
                        return;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)596599597065455673L, (long)l);
                }
            }
            this.n = callSite;
            fx_02 = this;
        }
        fx_02.k = 1;
        fx_0.c("g", (Object)bD2, (Object)new Object[0], (long)595186017138755516L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_1297 a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        block26: {
            CallSite callSite4;
            long l2;
            block25: {
                block24: {
                    CallSite callSite5;
                    block23: {
                        CallSite callSite6;
                        block22: {
                            long l3;
                            block21: {
                                l = (Long)objectArray[0];
                                long l4 = l = q ^ l;
                                l2 = l4 ^ 0x66717AD7A91AL;
                                long l5 = l4 ^ 0x4147642CC112L;
                                l3 = l4 ^ 0x6C15168A37C4L;
                                callSite4 = fx_0.c("k", (long)9155880655079036147L, (long)l);
                                try {
                                    if (fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.d, (long)9156614458889288599L, (long)l))), (long)9159356863260174493L, (long)l) == false) break block21;
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l5;
                                    callSite6 = fx_0.c("k", (Object)objectArray2, (long)9162965109118931848L, (long)l);
                                    break block22;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                                }
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l3;
                            callSite6 = fx_0.c("k", (Object)objectArray3, (long)9156443306892547359L, (long)l);
                        }
                        callSite3 = callSite6;
                        try {
                            callSite5 = callSite3;
                            if (callSite4 != null) break block23;
                            if (callSite5 == null) return null;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                        }
                        callSite5 = callSite3;
                    }
                    try {
                        try {
                            callSite2 = fx_0.c("g", (Object)callSite5, (long)9159531688911202137L, (long)l);
                            if (callSite4 != null) break block24;
                            if (callSite2 == false) return null;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                        }
                        reference cfr_temp_0 = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)9158491156356750211L, (long)l), (Object)callSite3, (long)9156919076506108674L, (long)l) - 3.0f;
                        callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite4 != null) break block25;
                        if (callSite2 > 0) return null;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                    }
                    callSite2 = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)9158491156356750211L, (long)l), (Object)callSite3, (long)9158545837428203120L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                }
            }
            try {
                try {
                    try {
                        if (callSite4 != null) break block26;
                        if (callSite2 == false) return null;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                    }
                    callSite = callSite3;
                    if (callSite4 != null) return callSite;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l2;
                objectArray4[0] = callSite;
                callSite2 = fx_0.c("k", (Object)objectArray4, (long)9157451718393676675L, (long)l);
            }
            catch (MatchException matchException) {
                throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
            }
        }
        try {
            if (callSite2 != false) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw fx_0.c("k", (Object)matchException, (long)9159420168361099106L, (long)l);
        }
        callSite = callSite3;
        return callSite;
    }

    @bP
    public void a(bt_0 bt_02) {
        Object object;
        class_243 class_2432;
        long l;
        long l2;
        long l3;
        block8: {
            block9: {
                fx_0 fx_02;
                CallSite callSite;
                block6: {
                    block7: {
                        long l4 = l3 = q ^ 0x767746676472L;
                        l2 = l4 ^ 0x25827719FCL;
                        l = l4 ^ 0xE8FA723636BL;
                        callSite = fx_0.c("k", (long)2233526402674537756L, (long)l3);
                        try {
                            try {
                                fx_02 = this;
                                if (callSite != null) break block6;
                                if (fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)fx_02.h, (long)2233214536566528632L, (long)l3))), (long)2230335243211819378L, (long)l3) != false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)2230373092041055885L, (long)l3);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)2230373092041055885L, (long)l3);
                        }
                    }
                    fx_02 = this;
                }
                class_2432 = fx_02.m;
                try {
                    object = class_2432;
                    if (callSite != null) break block8;
                    if (object != null) break block9;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)2230373092041055885L, (long)l3);
                }
                return;
            }
            object = fx_0.c("g", (Object)this.i, (long)2233214536566528632L, (long)l3);
        }
        CallSite callSite = fx_0.c("g", (Object)((Float)object), (long)2217627926372602944L, (long)l3);
        float f = (float)(fx_0.c("\u00fe", (Object)class_2432, (long)2216315555480466326L, (long)l3) - (double)callSite);
        float f10 = (float)(fx_0.c("\u00fe", (Object)class_2432, (long)2229288171172395118L, (long)l3) - (double)callSite);
        float f11 = (float)(fx_0.c("\u00fe", (Object)class_2432, (long)2217230388861514302L, (long)l3) - (double)callSite);
        float f12 = (float)(fx_0.c("\u00fe", (Object)class_2432, (long)2216315555480466326L, (long)l3) + (double)callSite);
        float f13 = (float)(fx_0.c("\u00fe", (Object)class_2432, (long)2229288171172395118L, (long)l3) + (double)callSite);
        float f14 = (float)(fx_0.c("\u00fe", (Object)class_2432, (long)2217230388861514302L, (long)l3) + (double)callSite);
        Color color = (Color)((Object)fx_0.c("g", (Object)this.j, (long)2233214536566528632L, (long)l3));
        Color color2 = new Color((int)fx_0.c("g", (Object)color, (long)2233375943803702243L, (long)l3), (int)fx_0.c("g", (Object)color, (long)2231399608083246868L, (long)l3), (int)fx_0.c("g", (Object)color, (long)2217890771183396874L, (long)l3), (int)fx_0.c("k", (int)fx_0.b("h", (int)19299, (long)(0x7CADCFCACF65C599L ^ l3)), (int)(fx_0.c("g", (Object)color, (long)2232153471778481587L, (long)l3) + fx_0.b("h", (int)16025, (long)(0x73A67BF6EBE6B060L ^ l3))), (long)2232697494592008433L, (long)l3));
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
        fx_0.c("k", (Object)objectArray, (long)2232474001613734422L, (long)l3);
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
        fx_0.c("k", (Object)objectArray2, (long)2232240251181041938L, (long)l3);
    }

    @bP
    public void a(aO aO2) {
        block26: {
            CallSite callSite;
            long l;
            long l2;
            long l3;
            long l4;
            block27: {
                CallSite callSite2;
                CallSite callSite3;
                long l5;
                long l6;
                block25: {
                    CallSite callSite4;
                    block23: {
                        long l7;
                        block24: {
                            block22: {
                                class_310 class_3102;
                                block21: {
                                    long l8 = l4 = q ^ 0x6393E0BEB487L;
                                    l6 = l8 ^ 0x3759A73162FL;
                                    l5 = l8 ^ 0x2DBD072ACB8DL;
                                    l7 = l8 ^ 0x4E5C6E5D6BB0L;
                                    l3 = l8 ^ 0x666B6925454CL;
                                    l2 = l8 ^ 0x72AD828330BFL;
                                    l = l8 ^ 0x3724B565CD70L;
                                    callSite3 = fx_0.c("k", (long)-3600063262780627479L, (long)l4);
                                    try {
                                        try {
                                            class_3102 = b;
                                            if (callSite3 != null) break block21;
                                            if (fx_0.c("\u00fe", (Object)class_3102, (long)-3601746328333112108L, (long)l4) != null) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                                        }
                                        class_3102 = b;
                                    }
                                    catch (MatchException matchException) {
                                        throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                                    }
                                }
                                try {
                                    callSite4 = fx_0.c("g", (Object)class_3102, (long)-3601233040997885327L, (long)l4);
                                    if (callSite3 != null) break block23;
                                    if (callSite4 != false) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                                }
                            }
                            return;
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l7;
                        callSite4 = fx_0.c("g", (Object)this, (Object)objectArray, (long)-3601095904992648586L, (long)l4);
                    }
                    if (callSite4 != false) {
                        return;
                    }
                    CallSite callSite5 = fx_0.c("\u00fe", (Object)b, (long)-3599876850841906401L, (long)l4);
                    try {
                        callSite2 = callSite5;
                        if (callSite3 != null) break block25;
                        if (callSite2 == null) break block26;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                    }
                    callSite2 = callSite5;
                }
                try {
                    try {
                        try {
                            if (fx_0.c("g", (Object)callSite2, (long)-3588140817858405311L, (long)l4) != fx_0.c("P", (long)-3589140765858275997L, (long)l4)) break block26;
                            callSite = fx_0.c("\u00fe", (Object)b, (long)-3601957943329756519L, (long)l4);
                            if (callSite3 != null) break block27;
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l6;
                        objectArray[0] = fx_0.c("g", (Object)callSite, (long)-3599050034034925171L, (long)l4);
                        if (fx_0.c("k", (Object)objectArray, (long)-3600241189571614275L, (long)l4) == false) break block26;
                    }
                    catch (MatchException matchException) {
                        throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l5;
                    callSite = fx_0.c("g", (Object)this, (Object)objectArray, (long)-3599649345870844092L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
                }
            }
            CallSite callSite6 = callSite;
            try {
                if (callSite6 == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l3;
            objectArray[0] = callSite6;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = fx_0.c("g", (Object)this, (Object)objectArray, (long)-3601651428124297628L, (long)l4);
            CallSite callSite7 = fx_0.c("k", (Object)objectArray2, (long)-3588264083914055746L, (long)l4);
            try {
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l;
                objectArray3[0] = callSite7;
                if (fx_0.c("g", (Object)this, (Object)objectArray3, (long)-3599124522116196362L, (long)l4) != false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw fx_0.c("k", (Object)matchException, (long)-3600921032570204552L, (long)l4);
            }
            fx_0.c("g", (Object)aO2, (Object)new Object[0], (long)-3601754018960637443L, (long)l4);
        }
    }

    private class_243 a(Object[] objectArray) {
        CallSite callSite;
        block19: {
            long l;
            class_1297 class_12972;
            block15: {
                Object object;
                CallSite callSite2;
                CallSite callSite3;
                CallSite callSite4;
                CallSite callSite5;
                CallSite callSite6;
                long l2;
                block13: {
                    block14: {
                        class_12972 = (class_1297)objectArray[0];
                        l = (Long)objectArray[1];
                        l2 = (l = q ^ l) ^ 0x2E7D9DFD7921L;
                        callSite6 = fx_0.c("g", (Object)fx_0.c("\u00fe", (Object)b, (long)-1020007072701557438L, (long)l), (long)-1021508013153777879L, (long)l);
                        callSite5 = fx_0.c("k", (long)-1021909040674579918L, (long)l);
                        callSite4 = fx_0.c("g", (Object)class_12972, (long)-1018731474084794251L, (long)l);
                        callSite3 = fx_0.c("\u00fe", (Object)callSite4, (long)-1021981892752391857L, (long)l) - fx_0.c("\u00fe", (Object)callSite4, (long)-1022117735063122205L, (long)l);
                        try {
                            try {
                                callSite2 = callSite3;
                                object = 0.0;
                                if (callSite5 != null) break block13;
                                if (!(callSite2 <= object)) break block14;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1018508634134826589L, (long)l);
                            }
                            return fx_0.c("g", (Object)class_12972, (long)-1014843390252842276L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fx_0.c("k", (Object)matchException, (long)-1018508634134826589L, (long)l);
                        }
                    }
                    callSite2 = fx_0.c("\u00fe", (Object)callSite6, (long)-1013441819224171336L, (long)l);
                    object = fx_0.c("\u00fe", (Object)callSite4, (long)-1018699257028653091L, (long)l);
                }
                CallSite callSite7 = fx_0.c("k", (double)callSite2, (double)object, (double)fx_0.c("\u00fe", (Object)callSite4, (long)-1020544782597624186L, (long)l), (long)-1018164165263535629L, (long)l);
                CallSite callSite8 = fx_0.c("k", (double)fx_0.c("\u00fe", (Object)callSite6, (long)-1014638112527000304L, (long)l), (double)fx_0.c("\u00fe", (Object)callSite4, (long)-1018351261752787396L, (long)l), (double)fx_0.c("\u00fe", (Object)callSite4, (long)-1021221740883768626L, (long)l), (long)-1018164165263535629L, (long)l);
                reference var16_11 = (fx_0.c("\u00fe", (Object)callSite6, (long)-1013441819224171336L, (long)l) - callSite7) * (fx_0.c("\u00fe", (Object)callSite6, (long)-1013441819224171336L, (long)l) - callSite7) + (fx_0.c("\u00fe", (Object)callSite6, (long)-1014638112527000304L, (long)l) - callSite8) * (fx_0.c("\u00fe", (Object)callSite6, (long)-1014638112527000304L, (long)l) - callSite8);
                Object object2 = Double.POSITIVE_INFINITY;
                CallSite callSite9 = null;
                int n = 0;
                while (n < o.length) {
                    block18: {
                        block17: {
                            block16: {
                                try {
                                    try {
                                        if (callSite5 != null) break block15;
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l2;
                                        objectArray2[0] = o[n];
                                        if (fx_0.c("g", (Object)this.g, (Object)objectArray2, (long)-1014471772571126636L, (long)l) != false) break block16;
                                        break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw fx_0.c("k", (Object)matchException, (long)-1018508634134826589L, (long)l);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fx_0.c("k", (Object)matchException, (long)-1018508634134826589L, (long)l);
                                }
                            }
                            reference var22_15 = fx_0.c("\u00fe", (Object)callSite4, (long)-1022117735063122205L, (long)l) + p[n] * callSite3;
                            reference var24_16 = fx_0.c("\u00fe", (Object)callSite6, (long)-1018268101722106048L, (long)l) - var22_15;
                            reference var26_17 = var16_11 + var24_16 * var24_16;
                            try {
                                if (callSite5 != null) break block18;
                                if (!(var26_17 < object2)) break block17;
                            }
                            catch (MatchException matchException) {
                                throw fx_0.c("k", (Object)matchException, (long)-1018508634134826589L, (long)l);
                            }
                            object2 = var26_17;
                            callSite9 = new class_243((double)callSite7, (double)var22_15, (double)callSite8);
                        }
                        ++n;
                    }
                    if (callSite5 == null) continue;
                }
                try {
                    callSite = callSite9;
                    if (callSite5 != null) break block19;
                    if (callSite == null) break block15;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)-1018508634134826589L, (long)l);
                }
                callSite = callSite9;
                break block19;
            }
            callSite = fx_0.c("g", (Object)class_12972, (long)-1014843390252842276L, (long)l);
        }
        return callSite;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fx_0.c("k", (Object)((Object)q_0.Crystal), (Object)((Object)q_0.Mace), (long)-2444107372804181610L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n3] != null) {
            return n3;
        }
        Object object = u[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 43;
            case 1 -> 19;
            case 2 -> 40;
            case 3 -> 62;
            case 4 -> 36;
            case 5 -> 39;
            case 6 -> 22;
            case 7 -> 17;
            case 8 -> 8;
            case 9 -> 60;
            case 10 -> 7;
            case 11 -> 34;
            case 12 -> 27;
            case 13 -> 1;
            case 14 -> 59;
            case 15 -> 0;
            case 16 -> 25;
            case 17 -> 45;
            case 18 -> 30;
            case 19 -> 52;
            case 20 -> 41;
            case 21 -> 53;
            case 22 -> 57;
            case 23 -> 33;
            case 24 -> 16;
            case 25 -> 15;
            case 26 -> 46;
            case 27 -> 10;
            case 28 -> 42;
            case 29 -> 32;
            case 30 -> 38;
            case 31 -> 56;
            case 32 -> 37;
            case 33 -> 61;
            case 34 -> 54;
            case 35 -> 31;
            case 36 -> 50;
            case 37 -> 12;
            case 38 -> 11;
            case 39 -> 24;
            case 40 -> 2;
            case 41 -> 3;
            case 42 -> 14;
            case 43 -> 49;
            case 44 -> 48;
            case 45 -> 44;
            case 46 -> 55;
            case 47 -> 6;
            case 48 -> 23;
            case 49 -> 51;
            case 50 -> 58;
            case 51 -> 47;
            case 52 -> 28;
            case 53 -> 21;
            case 54 -> 63;
            case 55 -> 4;
            case 56 -> 35;
            case 57 -> 18;
            case 58 -> 5;
            case 59 -> 26;
            case 60 -> 13;
            case 61 -> 20;
            case 62 -> 9;
            default -> 29;
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
        fx_0.v[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fx_0.m(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = fx_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fx_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fx_0.g(clazz3, string2, clazz2)) != null) {
                    fx_0.u[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fx_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fx_0.u[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fx_0.n(1589856295200238L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fx_0.m(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = fx_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fx_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fx_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fx_0.u[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fx_0.n(1589856295200238L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fx_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fx_0.u[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fx_0.n(1589856295200238L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private void j(Object[] objectArray) {
        class_1297 class_12972;
        long l;
        long l2;
        block2: {
            long l3;
            class_1297 class_12973;
            block3: {
                class_12973 = (class_1297)objectArray[0];
                l2 = (Long)objectArray[1];
                long l4 = l2 = q ^ l2;
                l3 = l4 ^ 0x710B7FA59A9FL;
                l = l4 ^ 0x2E81E132331L;
                CallSite callSite = fx_0.c("k", (long)2165502161177294318L, (long)l2);
                try {
                    class_12972 = class_12973;
                    if (callSite != null) break block2;
                    if (class_12972 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw fx_0.c("k", (Object)matchException, (long)2162181169653571199L, (long)l2);
                }
                return;
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            fx_0.c("g", (Object)new aS(), (Object)objectArray2, (long)2162971609202496568L, (long)l2);
            this.l = 1;
            class_12972 = class_12973;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = class_12972;
        fx_0.c("k", (Object)objectArray3, (long)2176823594801876863L, (long)l2);
        this.l = 0;
    }

    private boolean lambda$new$0(Float f) {
        long l = q ^ 0x1F998AADBDCL;
        return (boolean)fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.h, (long)-6821951474734144042L, (long)l))), (long)-6819072602282035492L, (long)l);
    }

    private boolean lambda$new$1(Color color) {
        long l = q ^ 0x2C589C5E7237L;
        return (boolean)fx_0.c("g", (Object)((Boolean)((Object)fx_0.c("g", (Object)this.h, (long)628431257506696253L, (long)l))), (long)627940135414390583L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fx_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fx_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


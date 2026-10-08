/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1684
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.p_0;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.y_0;
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
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1684;
import net.minecraft.class_1799;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eN
extends dV
implements dF {
    private static final float a = 1500.0f;
    private dR c;
    private dO d;
    private dO e;
    private dO f;
    private dO g;
    private dM h;
    private dM i;
    private dO j;
    private boolean k;
    private boolean l;
    private f5 m;
    private boolean n;
    private boolean o;
    private float p;
    private float q;
    private dC r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private Object w;
    private Object x;
    private int y;
    private p_0 z;
    private int A;
    private int B;
    private static final long C;
    private static final String[] D;
    private static final String[] E;
    private static final Map F;
    private static final long[] G;
    private static final Integer[] H;
    private static final Map I;
    private static final Object[] J;
    private static final String[] K;

    public eN() {
        long l;
        long l2 = l = C ^ 0x253346AC90C6L;
        long l3 = l2 ^ 0x380EFC91552FL;
        long l4 = l2 ^ 0x3038EFA442F6L;
        long l5 = l2 ^ 0x6D7555753E1DL;
        this.m = new f5(l3);
        this.y = (int)eN.c("d", (int)6279, (long)(0x2A92D6100FA7BCAEL ^ l));
        this.z = p_0.PREP;
        this.B = -1;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$0;
        eN.d("W", (Object)this.d, (Object)objectArray, (long)-5859285681637394071L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$2;
        eN.d("W", (Object)this.f, (Object)objectArray2, (long)-5859285681637394071L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this::lambda$new$1;
        eN.d("W", (Object)this.e, (Object)objectArray3, (long)-5859285681637394071L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = this::lambda$new$4;
        eN.d("W", (Object)this.i, (Object)objectArray4, (long)-5865660718049719885L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = this::lambda$new$5;
        eN.d("W", (Object)this.j, (Object)objectArray5, (long)-5859285681637394071L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l5;
        objectArray6[0] = this::lambda$new$3;
        eN.d("W", (Object)this.h, (Object)objectArray6, (long)-5865660718049719885L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        eN.C = hc.a(8511696587437263478L, 4879855288267779165L, MethodHandles.lookup().lookupClass()).a(122547387032357L);
                        eN.J = new Object[180];
                        eN.K = new String[180];
                        eN.f();
                        eN.F = new HashMap<K, V>(13);
                        var11 = eN.C ^ 108370788935053L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "fa\u00c2\u00fc%\u00e7C,\u00d1\u0081\u0089@\u00ae\u00c7\u00dc\u00e7\u0010\t\u00ca\u0085\u00ae\u009a\u00df\u00fd\u0002\u00c2T\u001e\u00017a\u0013\u00ee\u0010O?\u00b09\u000e\u00e6\u00d9TR\u00aa!\tAx2\u00a8";
                        var19_6 = "fa\u00c2\u00fc%\u00e7C,\u00d1\u0081\u0089@\u00ae\u00c7\u00dc\u00e7\u0010\t\u00ca\u0085\u00ae\u009a\u00df\u00fd\u0002\u00c2T\u001e\u00017a\u0013\u00ee\u0010O?\u00b09\u000e\u00e6\u00d9TR\u00aa!\tAx2\u00a8".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = eN.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "B5\u00fa\r\u00aa\u00bbm\u00bd\u00b8\u0081\u00b3M'[+\u00ef(\u00dfb\u0099-\t]\u0099\u00194Z\u0002\"\u0014\u00d5\u00f5u\u00a3\u00ba\u009a\u00a7g\u00e1cX$So\u00ba\u009d\u0016\u0001\u00c2\u00a0\u00ec\u0000\u00b4#\u00f78\u00ac";
                            var19_6 = "B5\u00fa\r\u00aa\u00bbm\u00bd\u00b8\u0081\u00b3M'[+\u00ef(\u00dfb\u0099-\t]\u0099\u00194Z\u0002\"\u0014\u00d5\u00f5u\u00a3\u00ba\u009a\u00a7g\u00e1cX$So\u00ba\u009d\u0016\u0001\u00c2\u00a0\u00ec\u0000\u00b4#\u00f78\u00ac".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = eN.b(var21_9).intern();
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
                eN.D = var20_3;
                eN.E = new String[5];
                eN.I = new HashMap<K, V>(13);
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
                var4_14 = "Tc\u0005\u00d5\u00d0\u00f3\u00cdk\u008b\u00c1\u00f9Y\u00f4\n\u00c9{H\u0005B\u00e6\u00db\u0081\u00b4\u00cc\u00b2\u00f1bg4\u00fax6";
                var5_15 = "Tc\u0005\u00d5\u00d0\u00f3\u00cdk\u008b\u00c1\u00f9Y\u00f4\n\u00c9{H\u0005B\u00e6\u00db\u0081\u00b4\u00cc\u00b2\u00f1bg4\u00fax6".length();
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
                    var4_14 = "d\u00d32\u008a/6qd\u00d2(^\u0090a\u00ec\u0015'";
                    var5_15 = "d\u00d32\u008a/6qd\u00d2(^\u0090a\u00ec\u0015'".length();
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
        eN.G = var6_12;
        eN.H = new Integer[6];
    }

    private boolean e(Object[] objectArray) {
        Object object;
        block26: {
            long l;
            block27: {
                Object object2;
                Object object3;
                CallSite callSite;
                block24: {
                    CallSite callSite2;
                    block25: {
                        block22: {
                            block23: {
                                Object object4;
                                block20: {
                                    l = (Long)objectArray[0];
                                    l = C ^ l;
                                    callSite2 = eN.d("\u00aa", (Object)eN.d("\u00aa", (Object)b, (long)-5026908830175694357L, (long)l), (long)-5041420055107321197L, (long)l);
                                    callSite = eN.d("\u00dc", (long)-5041029494454426309L, (long)l);
                                    try {
                                        block21: {
                                            try {
                                                try {
                                                    try {
                                                        object4 = eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)-5026908830175694357L, (long)l), (long)-5029646402710730916L, (long)l);
                                                        if (callSite != null) break block20;
                                                        if (object4 != false) break block21;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                                                    }
                                                    object3 = eN.d("W", (Object)eN.d("\u00aa", (Object)eN.d("\u00aa", (Object)b, (long)-5039710505028991669L, (long)l), (long)-5028571520337923822L, (long)l), (long)-5026646003547420906L, (long)l);
                                                    if (callSite != null) break block22;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                                                }
                                                if (object3 == false) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                                            }
                                        }
                                        this.y = (int)callSite2;
                                        object4 = 1;
                                    }
                                    catch (MatchException matchException) {
                                        throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                                    }
                                }
                                return (boolean)object4;
                            }
                            object3 = this.y;
                        }
                        try {
                            try {
                                object2 = eN.c("d", (int)25131, (long)(0x25287F313255299L ^ l));
                                if (callSite != null) break block24;
                                if (object3 != object2) break block25;
                            }
                            catch (MatchException matchException) {
                                throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                        }
                    }
                    object3 = callSite2;
                    object2 = this.y;
                }
                reference var6_5 = object3 - object2;
                try {
                    try {
                        try {
                            try {
                                object = var6_5;
                                if (callSite != null) break block26;
                                if (object < 0) break block27;
                            }
                            catch (MatchException matchException) {
                                throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                            }
                            object = var6_5;
                            if (callSite != null) break block26;
                        }
                        catch (MatchException matchException) {
                            throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                        }
                        if (object > 1) break block27;
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                    }
                    return true;
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)-5042194945457143506L, (long)l);
                }
            }
            this.y = (int)eN.c("d", (int)6279, (long)(0x2A928EC1120AA836L ^ l));
            object = 0;
        }
        return (boolean)object;
    }

    private int e(Object[] objectArray) {
        Object object;
        block9: {
            long l = (Long)objectArray[0];
            long l2 = (l = C ^ l) ^ 0x11C58C29B0D0L;
            CallSite callSite = eN.d("\u00dc", (long)933869458312549316L, (long)l);
            for (int i = 0; i < eN.c("d", (int)9485, (long)(0x6B2E17CED2A12342L ^ l)); ++i) {
                Object object2;
                block11: {
                    block10: {
                        try {
                            try {
                                try {
                                    object = eN.d("W", (Object)eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)919783517025650452L, (long)l), (long)932623000494200926L, (long)l), (int)i, (long)922033612268981146L, (long)l), (long)934445332900891629L, (long)l);
                                    if (callSite != null) break block9;
                                    if (callSite != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw eN.d("\u00dc", (Object)matchException, (long)935034963337246673L, (long)l);
                                }
                                if (object != 0) continue;
                            }
                            catch (MatchException matchException) {
                                throw eN.d("\u00dc", (Object)matchException, (long)935034963337246673L, (long)l);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)919783517025650452L, (long)l), (long)932623000494200926L, (long)l), (int)i, (long)922033612268981146L, (long)l);
                            object2 = eN.d("\u00dc", (Object)objectArray2, (long)935816093646277613L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eN.d("\u00dc", (Object)matchException, (long)935034963337246673L, (long)l);
                        }
                    }
                    try {
                        if (callSite != null) break block11;
                        if (object2 == false) continue;
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)935034963337246673L, (long)l);
                    }
                    object2 = i;
                }
                return object2;
            }
            object = -1;
        }
        return object;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x64514453951CL;
        long l4 = l2 ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        eN.d("W", (Object)this, (Object)objectArray2, (long)3982341557349145531L, (long)l);
        this.x = null;
        this.y = (int)eN.c("d", (int)6279, (long)(0x2A92DE5746EF2579L ^ l));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = this;
        eN.d("W", (Object)eN.d("\u00f9", (long)3984609531085844072L, (long)l), (Object)objectArray3, (long)3981504406963817980L, (long)l);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6E86;
        if (E[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])F.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    F.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eN", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = D[n2].getBytes("ISO-8859-1");
            eN.E[n2] = eN.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return E[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eN.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    /*
     * Exception decompiling
     */
    private dC b(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 36[SWITCH]
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

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA99;
        if (H[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = G[n2];
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
                throw new RuntimeException("dev/zprestige/prestige/eN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eN.H[n2] = n3;
        }
        return H[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eN.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private dC c(Object[] objectArray) {
        dC dC2;
        block4: {
            long l;
            long l2;
            block5: {
                dC dC3 = (dC)objectArray[0];
                l2 = (Long)objectArray[1];
                l = (l2 = C ^ l2) ^ 0x75D3CE6B3CA7L;
                CallSite callSite = eN.d("\u00dc", (long)2603787969991244563L, (long)l2);
                try {
                    try {
                        dC2 = this.r;
                        if (callSite != null) break block4;
                        if (dC2 != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)2607214025557434118L, (long)l2);
                    }
                    this.r = new dC((float)eN.d("W", (Object)dC3, (Object)new Object[0], (long)2606229204258892545L, (long)l2), (float)eN.d("W", (Object)dC3, (Object)new Object[0], (long)2602557723496433017L, (long)l2));
                    this.s = 0;
                    this.t = 0;
                    this.u = 0;
                    this.w = eN.d("\u00aa", (Object)b, (long)2604145525509075116L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)2607214025557434118L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l;
            objectArray2[1] = this.r;
            objectArray2[0] = this;
            eN.d("W", (Object)eN.d("\u00f9", (long)2606270170626391311L, (long)l2), (Object)objectArray2, (long)2600035128546198990L, (long)l2);
            dC2 = this.r;
        }
        return dC2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eN.m(l, l2);
            object = J[n];
            try {
                if (!(object instanceof String)) break block2;
                eN.J[n] = clazz = Class.forName(K[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eN.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eN.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eN.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eN.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = J;
        J[0] = "\u001bSHoof\rSM5|q\u001a\u0018N3pe\u000b_Y$;s1";
        objectArray[1] = "\"\u0010\u0018@W=W0\u0013OFr6>\u0018DB(B";
        objectArray[2] = Void.TYPE;
        eN.K[2] = "java/lang/Void";
        objectArray[3] = "+Ju\u007f(%=Jp%;2*\u0001s#7&;Fd4|4\u0007";
        objectArray[4] = "\u0019&\u0002Hu\u001dl\u0006\tGdR\u0011\u001e\u001a@m\u001by";
        objectArray[5] = "]\u0013\u0018.g'(3\u0013!vhI=\u0018*r2=";
        objectArray[6] = "\r\\-Wc6\u0006S<\u0018\u0000;\u0013^3s59\u0002M/_\"4";
        objectArray[7] = "\u001d|_{D~\u001d|H'Hq\u00077H9Hd\u0000F\u0018d\u0019";
        objectArray[8] = ">\u001bDC\u0003v>\u001bS\u001f\u000fy$PS\u0001\u000fl#!\u0007YX";
        objectArray[9] = "-Kz\u007fu`;K\u007f%fw,\u0000|#jc=Gk4!s;";
        objectArray[10] = "p\u000b^\u0011l\\\u0005+U\u001e}\u0013d%^\u0015yI\u0010";
        objectArray[11] = Boolean.TYPE;
        eN.K[11] = "java/lang/Boolean";
        objectArray[12] = "0r\u001d33\u0013ER\u0016<\"\\$\\\u001d7&\u0006P";
        objectArray[13] = "Vv2*\tnVv%v\u0005aL=%h\u0005tKLt7Q7";
        objectArray[14] = "aFHX\u000bPwFM\u0002\u0018G`\rN\u0004\u0014SqJY\u0013_DA";
        objectArray[15] = "1N^\t\u0010jDnU\u0006\u0001%%`^\r\u0005\u007fQ";
        objectArray[16] = "?\u001bx3L\")\u001b}i_5>P~oS!/\u0017ix\u00186\r";
        objectArray[17] = "w\u0018I\u0016\u0013I\u00028B\u0019\u0002\u0006c6I\u0012\u0006\\\u0017";
        objectArray[18] = "K:E7 oK:Rk,`QqRu,uV\u0000\u0000+{>";
        objectArray[19] = "\u0005.\u0007!TZ\u000e!\u0016n7W\u001b'";
        objectArray[20] = Double.TYPE;
        eN.K[20] = "java/lang/Double";
        objectArray[21] = "LxD8\u001d\u00049XO7\fKXVD<\b\u0011,";
        objectArray[22] = Integer.TYPE;
        eN.K[22] = "java/lang/Integer";
        objectArray[23] = "\u00195/(4f\u000f5*r'q\u0018~)t+e\t9>c`pH";
        objectArray[24] = "\u007f\u0007E\f4Q\n'N\u0003%\u001ek)E\b!D\u001f";
        objectArray[25] = "\u0014r\u0004Hl;aR\u000fG}t\u0000\\\u0004Ly.t";
        objectArray[26] = "='\\v\u0012}+'Y,\u0001j<lZ*\r~-+M=Fi\u001a";
        objectArray[27] = "M\u007f?ii\n8_4fxEYQ?m|\u001f-";
        objectArray[28] = "\u001e(dKsBk\boDb\r\n\u0006dOfW~";
        objectArray[29] = "&6-\u00053\u001b&6:Y?\u0014<}:G?\u0001;\fh\u0013n@";
        objectArray[30] = "TH/nQ5TH82]:N\u00038,]/Irjw\u0005n";
        objectArray[31] = "\u0014\u0015HYn'\u0014\u0015_\u0005b(\u000e^_\u001bb=\t/\u000eC0";
        objectArray[32] = "#\u0001M'o\u0010#\u0001Z{c\u001f9JZec\n>;\u000b:1A";
        objectArray[33] = "quo\u0014QT\u0004Ud\u001b@\u001be[o\u0010DA\u0011";
        objectArray[34] = "V8[\brh#\u0018P\u0007c'B\u0016[\fg}6";
        objectArray[35] = Float.TYPE;
        eN.K[35] = "java/lang/Float";
        objectArray[36] = "t\u0014#R\u0017C\u00014(]\u0006\f`:#V\u0002V\u0014";
        objectArray[37] = "L\u0004rPwX9$y_f\u0017X*rTbM,";
        objectArray[38] = "g\u0012\u000b\ro\"q\u0012\u000eW|5fY\rQp!w\u001e\u001aF;1o\u001e\u0018Ma|S\u0005\u0018Pa;d\u0012";
        objectArray[39] = "j\u0018er\u0017S\u001f8n}\u0006\u001c~6ev\u0002F\n";
        objectArray[40] = "Az$EwjAz3\u0019{e[13\u0007{p\\@bS.5\u000b|<\nipp-h_-";
        objectArray[41] = "Hc3@F\u0017=C8OWX\\M3DS\u0002(";
        objectArray[42] = "!\u000bp+c;7\u000buqp, @vw|81\u0007a`7/\u000e";
        objectArray[43] = "K\b\n\rkQ@\u0007\u001bB\n_K\f\u001f\u0018";
        objectArray[44] = "%\u0010VNB\u0012P0]AS]1>VJW\u0007E";
        objectArray[45] = "\u0010\u0007\bO'e\u0010\u0007\u001f\u0013+j\nL\u001f\r+\u007f\r=MWr8";
        objectArray[46] = "b\u0001\u0016A.(t\u0001\u0013\u001b=?cJ\u0010\u001d1+r\r\u0007\nz(";
        objectArray[47] = "+9uuJw=9p/Y`*rs)Ut;5d>\u001ed|";
        objectArray[48] = "2\u007fv\u001fL]G_}\u0010]\u0012&Qv\u001bYHR";
        objectArray[49] = "q}\u0018\u000fo\fzr\t@\u0007\ft}\u001a";
        objectArray[50] = "^a0\n9q^a'V5~D*'H5kC[u\u0013m!";
        objectArray[51] = " \u00046iyDU$=fh\u000b4*6mlQ@";
        objectArray[52] = "9z\u0013s3\t9z\u0004/?\u0006#1\u00041?\u0013$@VkhQ";
        objectArray[53] = ";\u0011\u001d'\"\"0\u001e\fh_:#\u0019\u0005!";
        objectArray[54] = "\u001f87.uP\u00147&a\u0019S\u001a5$.5";
        objectArray[55] = "P\u0004hc>\u0005%$cl/JD*hg+\u00100";
        objectArray[56] = "wRQJ;\u0005\u0002rZE*Jc|QN.\u0010\u0017";
        objectArray[57] = "$BrWJ\u00022Bw\rY\u0015%\tt\u000bU\u00014Nc\u001c\u001e\u0010$";
        objectArray[58] = "\\\u000e\u0013)w1).\u0018&f~H \u0013-b$<";
        objectArray[59] = "9XsMJPLxxB[\u001f-vsI_EY";
        objectArray[60] = "k\u001bgidI\u001e;lfu\u0006\u007f5gmq\\\u000b";
        objectArray[61] = "V\u0006U-n\u0001@\u0006Pw}\u0016WMSqq\u0002F\nDf:\b";
        objectArray[62] = "z(i\f\u0015fz(~P\u0019i`c~N\u0019|g\u0012+\u0011@";
        objectArray[63] = ".3\u0018-^c[\u0013\u0013\"O,:\u001d\u0018)KvN";
        objectArray[64] = "M\u0018w\u00029\u001888|\r(WY6w\u0006,\r-";
        objectArray[65] = ");\rg\rJ?;\b=\u001e](p\u000b;\u0012I97\u001c,Y^\n";
        objectArray[66] = "b.{\r3I\u0017\u000ep\u0002\"\u0006v\u0000{\t&\\\u0002";
        objectArray[67] = "\u000ea(/ \u0016{A# 1Y\u001aO(+5\u0003n";
        objectArray[68] = "v2y\"lfh:cm\u0011vh";
        objectArray[69] = ".f`C+0%iq\fL(!uw@i9";
        objectArray[70] = "q=z|[Qo5`3<P~.mi\u001aV";
        objectArray[71] = "4H \u0015%)4H7I)&.\u00037W)3)re\tqw";
        objectArray[72] = "\u0019XW\u000bhk\u000fXRQ{|\u0018\u0013QWwh\tTF@<x*";
        objectArray[73] = "sQ=.]\u001d\u0006q6!LRg\u007f=*H\b\u0013";
        objectArray[74] = "{cZd1\u0018{cM8=\u0017a(M&=\u0002fY\u0018yj";
        objectArray[75] = "k{K}\u000bu\u001e[@r\u001a:\u007fUKy\u001e`\u000b";
        objectArray[76] = "!\u0011c\f\u0012(!\u0011tP\u001e';ZtN\u001e2<+$\u0012K";
        objectArray[77] = "d\u0005;krcd\u0005,7~l~N,)~yy?|t*";
        objectArray[78] = "\u00122\u0011\u0010q*g\u0012\u001a\u001f`e\u0006\u001c\u0011\u0014d?r";
        objectArray[79] = "\u0019K\u0005'X{\u0019K\u0012{Tt\u0003\u0000\u0012eTa\u0004qE:\u0002";
        objectArray[80] = "\u0012Ei1b\u0011geb>s^\u0006ki5w\u0004r";
        objectArray[81] = "_F6PaZ*f=_p\u0015Kh6TtO?";
        objectArray[82] = "\u000eIx'E\u001e\u000eIo{I\u0011\u0014\u0002oeI\u0004\u0013s=;\u001eN";
        objectArray[83] = "\u007fgG\u0016\u001cs\u007fgPJ\u0010|e,PT\u0010ib]\u0002\u000eD-";
        objectArray[84] = "jXT\u0005zG\u001fx_\nk\b~vT\u0001oR\n";
        objectArray[85] = "!\u0005\r\u0017t=T%\u0006\u0018er5+\r\u0013a(A";
        objectArray[86] = "g\\\"1>>q\\'k-)f\u0017$m!=wP3zj*L";
        objectArray[87] = "\u0000a%?\u0006,uA.0\u0017c\u0014O%;\u00139`";
        objectArray[88] = "~B\u001a$ <hB\u001f~3+\u007f\t\u001cx??nN\u000bot(W";
        objectArray[89] = "4E$\u0010\u001f3Ae/\u001f\u000e| k$\u0014\n&T";
        objectArray[90] = "\u001b&#\u001fF_\u0018g<\u0007vNG{&\u0016!\u0019\u0019,~zKD\u0016i?F\u001fJGg";
        objectArray[91] = "[2\\i\u0005!\u000e&IqM\u001d\u0007;It\u001bq5l\u000e*B biDv\u0001a\u001b2Uz\u0006\u001d";
        objectArray[92] = "J\u001d\u0003\u000eF8\u0014OL_ :%N\nA\u0019>G\u001eBFIk%H\u0003\\]/\\\u0013\u0012PZS";
        objectArray[93] = "1\"YPg gr\u0011E\u0007yX SU>}:p\u001bRn(X&ZHzl!}KD}\u0010";
        objectArray[94] = "n|\u0011)\u0017\u0006+bJ \u0003?2qS\"\u001aS\u0000%\u0013yA?hmM?\u0001F3|A8}";
        objectArray[95] = "kn'snM{j-K56=+\"r:Tmc%\"o6=\"&-mIf9'!W";
        objectArray[96] = "l5[vQCl9\u0002\u007f(I<8\u0003}\u007f\u001edm\\*(\u0016=i\u0000hL\u001610\t";
        objectArray[97] = "(_s/\u0003ks\fb:\u0006St\\r>\u001f?F\u000b?gIS(Uo<A-jHj'\tSzTe5\u001eckX7=xjuXs'D?aMkox";
        objectArray[98] = "?O,\u001e^\u001d<\u000e3\u0006n\fc\u0012)\u00179[=Bp{W\u0000>\u001e&\u0000\u0005\u0004:E!";
        objectArray[99] = "l\u0018a0p}zM!e\u0010m\u0006\u001ea#)idN)$y<\u0006\u001eh'v>yEs&z\u0004";
        objectArray[100] = "\u0007NGh\u0003PX\u001bYf\u000ea^LM\u0010\u0000\u0011B%\t'\u000f\u001cB\\R6\u0003\u001b>";
        objectArray[101] = "e6V*<q18\u0007$A(5.\u00062-\u001afk_hAr)0\u001b)8)8<\u001cU";
        objectArray[102] = "*&5x\t'~(dvt~z>e`\u0018L,|9:J\u001bp2d>\u0012+.%\u007fit\"f9c=\u000by}8o\u0007";
        objectArray[103] = "B]c\u001dmYRYi%9\"\u0014\u0018f\u001c9@DPaLl\"C\nrL*OK\u0011tIT";
        objectArray[104] = "\u0019Q}F'uEG#\u0018x\u0012J<+P?+M^{\u00188{\u0018<o\u0012:iNGlL}n ";
        objectArray[105] = "Lo+\u0002\u007f=O.4\u001aO'\u001c#*\u0000#\u0015HbtVO}\u0000=7\u001b6&\u001110g";
        objectArray[106] = "YH8\u001e4\u0017IL2&fl\u000f\r=\u001f`\u000e_E:O5lWE+\u001em\u0006\u000f\rs\\\r";
        objectArray[107] = "x<\u0001\u0012;\u001a.lI\u0007[A\u0011>\u000b\u0017bGsnC\u00102\u0012\u0011>\u0002\u0013=\u0010ne\u0019\u00121*";
        objectArray[108] = "Q-4\u000e\u00193A)>6LH\u0007h1\u000fM*W 6_\u0018H\u0001a,K\\1Zp L ";
        objectArray[109] = "\u000eGwN*uX\u0017?[J.gE}Ks(\u0005\u00155L#}gCtV79\u001e\u0018eZ0E";
        objectArray[110] = "\u0017&~\u001f-$\t+<\u0006P(\u0015vf\u0010\u0007zE#3LP\"Kba\u001ca6\u0010d>";
        objectArray[111] = "i\u0007!T\fFa\u0002#^1\u0018m\u0001{TfO4]/\u00001\u0013gRs\u0005\u0001\u001bbPy";
        objectArray[112] = "9/xQ'()+riwSoj}Ps1?\"z\u0000&Sic`\u0014b*2rl\u0013\u001e";
        objectArray[113] = " uk/T\u0017x=3m4\u0017A|zh\r\u0010#,2o]EA\"rv\r\u001bq|emZ}";
        objectArray[114] = "D4Rb?_\rm\u0017>t8\u00135BdjoDe\u0017<\u0006\u0001\u001djDj?D\u00031M~";
        objectArray[115] = "o\t*'le9Yb2\f?\u0006\u000b \"58d[h%em\u0006\r)?q)\u007fV83vU";
        objectArray[116] = "1\n\u0014\u0012\u0011Y,SO\nhP9NK\t\u0004bm\n\u0011_hPl\rW\u0017\u0004M5VOn";
        objectArray[117] = "_6M#TN\u0018v\u001b*S5\fk\u0013+A\\\u0000R\u001d+QXf3\u0005-QI\u001fh\u0014!V5";
        objectArray[118] = ")\u001aP\u0014g0zF\u0001G~Ay}RUjx}\u001f\u0002\u001dm((}RJ.xb\f\u0001\u0016\u007f+{}";
        objectArray[119] = "J,p\u0012 bZ(z*u\u0019\u001ciu\u0013t{L!rC!\u0019K{aCgtC`gF\u0019";
        objectArray[120] = "ic\u0017p\u001a\u000bfg\u000bu$Yvd\t}s\t/0W\u0011J]|`\u0013|BFze";
        objectArray[121] = "coNQ{TskDi//5*KP/MebL\u0000z/3#V\u0014>Vh2Z\u0013B";
        objectArray[122] = "M\\+V@X\u0010\u001e.G\u0016>\u0011\t8\\\u001aR#Yx\u0007M>\u001a\u000e/U\u0003S\u0012\u0015)P}O\t\nxX\u0007\u000e\t\u000b=<";
        objectArray[123] = "\u001a:\u0014t`~\n>\u001eL3\u0005L\u007f\u0011u4g\u001c7\u0016%a\u0005\u00147\u0007t9oL\u007f_6Y";
        objectArray[124] = "=\rP4V6+S\u0019d59A\u0016[uN>:\u0015\u00052IP";
        objectArray[125] = "Xi\u0012\u001etrK%WT\u0012*\\wJ\u0003{)&uA\u000e{3K}Z\b~M";
        objectArray[126] = "k\u0014\u00124=>aF\u001e(\u0003xf\u0019s?oag\u0007\u0011,s{j\u007f\u001e>ac\u007f\u001d\r\"{n\u0007";
        objectArray[127] = "^\f'W_.USq\u0006/<.\u0004oF\u00168LT'AFm.\u0004fBIoQ_}CEU";
        objectArray[128] = "V?z+{q\u0017?ua'N\u0002\u007f79.5o{p*1 \u0014x.m6NPw(-67\u000bf$*J";
        objectArray[129] = "og>J4G;ioDI\u001e?\u007fnR%,i=2\bv{5so\f/Kkdt[IB#xh\u000f6\u00198yd5";
        objectArray[130] = "j\n)b\u00157*Zh0I\\2\u001c4%B 4\u001aYf@-m\u000eh9\u00153c\u0003Y";
        objectArray[131] = "5pv4\u007f\u0018}lv5\u0013\f\u000f-nnw\u0017fzj!bf";
        objectArray[132] = "l\u001e\u0010\u0013\u000e7|\u001a\u001a+SL:[\u0015\u0012Z.j\u0013\u0012B\u000fL:R\u0011M\r3aI\u0010A7";
        objectArray[133] = "-zex[\u0018q(0s \u0010\u0013(y7\u0019\u0018qx10IM\u0013.p*]\tjua&Zu";
        objectArray[134] = "\rpy!)a\u000e1f9\u0019pQ-|(N'\u000ep'D !R%h%tbJqt";
        objectArray[135] = "M\r&0\u001bW[Xfe{G'\r/>\u0006R^V>2\u0001.";
        objectArray[136] = "5L{6Y\t:Hg3gP&Za0\u000bbq\u001a0m^5rJ{<^^{\u001bc7\u00015";
        objectArray[137] = "{ee\u0015\u001eW:edPzHgdkN\u0016z5)3\u0018zI5ahIK]ng7)";
        objectArray[138] = "r\u0002\u000e5P\u0016$RF 0I\u001b\u0000\u00040\tKyPL7Y\u001e\u001b\u0000\r4V\u001cd[\u00165Z&";
        objectArray[139] = "l\\H0mY-\\Iu\tFp]Fket\"\u0010\u00184\t\u001clC[ppG}O\\\f";
        objectArray[140] = "O=$=\u001d\u0004\u001b3u3`V\u00134p.7\u0006J`.B\u000eR\u00190j/\u0006I\u001f5";
        objectArray[141] = "T`\u0011gP\"Dd\u001b_\fY\u0002%\u0014f\u0004;Rm\u00136QY\u0002,\u00109S&Y7\u00115i";
        objectArray[142] = "kF*w$;zJx\u007fBeaN%p\u001560\u001bq\u001c)nkH',8b9@";
        objectArray[143] = "\u0019DO_\u0005L\u0007I\rFx@\u001b\u0014WP/\u001eDB\u000f<\u001c\u0011\u0003\u001aS\r\bJ\u0005E";
        objectArray[144] = "zPY\u0010W[,\u0000\u0011\u00057\u0005\u0013RS\u0015\u000e\u0006q\u0002\u001b\u0012^S\u0013RZ\u0011QQl\tA\u0010]k";
        objectArray[145] = "u\u0003\u001c9\u0001b!\rM7|;%\u001bL!\u0010\ts^\u0011zL^q_C,A8,\u001dF=\u0017^";
        objectArray[146] = "y\u0016m\n/ysDa\u0016\u0011/r\u0006\f\u0001}&u\u0005n\u0012a<x}a\u0000s$m\u001fr\u001ci)\u0015";
        objectArray[147] = "\u001a\u0005pt|EFTi`%}H>7bdDN\\g*c\u0014\u001b>7k`\u001b\u0019Alpa\u0017#";
        objectArray[148] = "\u001aR;\u0010l@\u0019\u0013$\b\\QF\u000f>\u0019\u000b\u0006\u0019Sbue_Z\u0000c\u0012,\u0006\u001f\\(";
        objectArray[149] = ")kUe='w9\u001a4[%F8\\*b!$h\u0014-2tF8U.=v9cN/1L";
        objectArray[150] = "&N/SOxr@~]2!vV\u007fK^\u0013 \u0014#\u0011\u000eD|Z~\u0015Tt\"MeB2";
        objectArray[151] = "]A/\u0012&*\u000b\u0011g\u0007Fv4C%\u0017\u007fwV\u0013m\u0010/\"4E,\n;fM\u001e=\u0006<\u001a";
        objectArray[152] = "H\u0012j\u001fV\u000eX\u0016`'\fu\u001eWo\u001e\u0002\u0017N\u001fhNWu\u001e^kAU\nEEjMo";
        objectArray[153] = "B{|\u0007\u001bO\u001a0u\r\u000f5\u0010J/\u0005\u000f\f\u0016(\u007fM\b\\CJ)\f\u0012H\u00073r\u001d\u001eO{";
        objectArray[154] = "bq\u0007\u007f\u0011P=$\u0019q\u001ca=w\u0006=\u007f\u001ca`\r/\u0004\u001f?'\nA";
        objectArray[155] = "O:\u001d'G-LdZ );K}\u000e8RVO:\u001d'G-LdZ )iCb\u001a P2Rn\u001d\\";
        objectArray[156] = "e\"`OU\u0017t.2G3Io*oHd\u001a>~3$XBe,m\u0014IN7$";
        objectArray[157] = "\u0014H\u00152N&\u001e\u001a\u0019.pg\u001fy\u001d8\u0011r\u001eXt9\u001cy\u0018[\u0016*\u0000c\u0015#\u00198\u0012{\u0000A\n$\bvx";
        objectArray[158] = "i}mf{Kt$6~\u0002Im(6vU\u001e7xj\u001aoKn%*x|Wt(";
        objectArray[159] = "(^_{6A~\u000e\u0017nV\u001cA\\U~o\u001c#\f\u001dy?IA\\\\z0K>\u0007G{<q";
        objectArray[160] = "uXTbq\r!V\u0005l\fT%@\u0004z`fs\u0002X 11/L\u0005$j\u0001q[\u001es\f";
        objectArray[161] = "\u0019*]*\f?E{D>U\u0007J\u0011\u001a<\u0014>MsJt\u0013n\u0018\u0011\u001a5\u0010a\u001anA.\u0011m ";
        objectArray[162] = "?\u000e|disk\u0000-j\u0014*o\u0016,|x\u0018;Zs*$OgRsgm#z\u000b(\u007f\u0014";
        objectArray[163] = "\u001f\u000fiOv2C]<D\r6!]u\u000042C\r=\u0007dg!]|\u0004ke^\u0006g\u0005g_";
        objectArray[164] = "L\u0000r2&V\u0005K&f\u001b\u00015\u0018&.a\u0006\u0005Nvft";
        objectArray[165] = "hsvn\u0002-0;.,b.\tzg)[*k*/.\u000b\u007f\t$o7[!9zx,\fG";
        objectArray[166] = "!fl#mu1bf\u001b:\u000ew#i\"9l'knrl\u000eq*tf(w*;xaT";
        objectArray[167] = "J\u0018A\u000f`\u001e_\u0000\u001e\u001d\u0018\u0010Q\nB\u001cOG\nV\u0018A\u0018\u0004O\u0000Y\bx\u0011W_K";
        objectArray[168] = "\u0001\u00059x\u0017H]\u0013g&H/Shon\u000f\u0016U\n?&\bF\u0000ho{\u001fA_\u000f3mA\u001f\u0000h";
        objectArray[169] = "++fZpQwy3Q\u000bU\u0015yz\u00152Qw)2\u0012b\u0004\u0015.h\u0001bBx&s\u0007g<";
        objectArray[170] = "_\u0003_Q%5\\B@I\u0015$\u0003^ZXBs]\r\u00074,$\u001fBE\fww\u000eW@";
        objectArray[171] = "\n,GU\u0015bZ*\u0016[T\\ZTOMVe^6\u001f\u0005Q5\u000bTOM\u0018<\u000fj\u001fKI2NT";
        objectArray[172] = "V%\u00056~\u0013F!\u000f\u000e.h\u0000`\u00007*\nP(\u0007g\u007fhGr\u0005oyTHv\u0019jG";
        objectArray[173] = "4\u001a$|O\u0000`\u0014ur2Yd\u0002td^k7G,?2Wl\u0015\u007fe\u0002F`Gw\u0003\u000bMr\u0018.|PVs\u0014\u0014";
        objectArray[174] = "\t@U\u0010\u0005!\u0000BBU?/\u001cDS\u0013a(\u001c^WoX1\u0019\u001a\\_\u0006&\u0002M:";
        objectArray[175] = "-|C#n=ymH!}[sx#<;!oxX?efh\u0016\u001a+a9{pN:j;h\u0016";
        objectArray[176] = ")GC7v)}\u0004[cjHu\u0015]2a$GA\u0011k?r\u0010AK\";v{\u0001\u001bci*\u0010";
        objectArray[177] = "GR\u0004y2uZ\u000b_aKwC\u0007_i\u001c \u0019W\u0001\u0005&u@\nCg5iZ\u0007";
        objectArray[178] = "\u0007eR@(MOyRADZ=;NU}^_k\u0006R-\u000b=;\bJ}\b\u0005sN\u0013~X=";
        Object[] objectArray2 = objectArray;
        objectArray[179] = "wn8zj\u001agj2B:a$<.\"j\nr3z#S]w?\"{8\u000bxk#B";
    }

    public static boolean f(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        l = C ^ l;
        return (boolean)eN.d("W", (Object)eN.d("W", (Object)class_17992, (long)-9055793857860830114L, (long)l), (Object)eN.d("\u00f9", (long)-9049240472815142250L, (long)l), (long)-9054518943763050480L, (long)l);
    }

    private void l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = C ^ l) ^ 0x5FF481F37739L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eN.d("W", (Object)eN.d("\u00f9", (long)-7195551792096393984L, (long)l), (Object)objectArray2, (long)-7199121899451357368L, (long)l);
        this.r = null;
        this.w = null;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eN.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00ef' || c == '\u00f9' || c == '\u00e2') {
                field = eN.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eN.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = C ^ l) ^ 0x279C27DE488FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(1500.0f);
        return (boolean)eN.d("W", (Object)this.m, (Object)objectArray2, (long)8040063749355816582L, (long)l);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x6D61ED1736CDL;
        long l4 = l2 ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this;
        eN.d("W", (Object)eN.d("\u00f9", (long)3255951634300924939L, (long)l), (Object)objectArray2, (long)3252065199365464240L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        eN.d("W", (Object)this, (Object)objectArray3, (long)3253031849838437767L, (long)l);
    }

    private int d(Object[] objectArray) {
        Object object;
        block10: {
            long l = (Long)objectArray[0];
            l = C ^ l;
            CallSite callSite = eN.d("\u00dc", (long)-7089308472670371156L, (long)l);
            for (int i = 0; i < eN.c("d", (int)13712, (long)(0x1E266FB40A3BA2B4L ^ l)); ++i) {
                CallSite callSite2;
                block9: {
                    try {
                        try {
                            try {
                                callSite2 = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)-7085348662522653060L, (long)l), (long)-7090594909521032906L, (long)l), (int)i, (long)-7087598749184304398L, (long)l);
                                if (callSite != null) break block9;
                                object = eN.d("W", (Object)callSite2, (long)-7088767215519212923L, (long)l);
                                if (callSite != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw eN.d("\u00dc", (Object)matchException, (long)-7092716919172110663L, (long)l);
                            }
                            if (object != 0) continue;
                        }
                        catch (MatchException matchException) {
                            throw eN.d("\u00dc", (Object)matchException, (long)-7092716919172110663L, (long)l);
                        }
                        callSite2 = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)-7085348662522653060L, (long)l), (long)-7090594909521032906L, (long)l), (int)i, (long)-7087598749184304398L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)-7092716919172110663L, (long)l);
                    }
                }
                try {
                    if (eN.d("W", (Object)callSite2, (long)-7088891536674102382L, (long)l) != eN.d("\u00f9", (long)-7089077604759411692L, (long)l)) continue;
                    return i;
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)-7092716919172110663L, (long)l);
                }
            }
            object = -1;
        }
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private boolean a(Object[] objectArray) {
        CallSite callSite;
        block30: {
            CallSite callSite2;
            long l;
            class_1268 class_12682;
            block29: {
                Object object;
                long l2;
                block28: {
                    int n;
                    block26: {
                        block27: {
                            boolean bl;
                            block25: {
                                block24: {
                                    block34: {
                                        block33: {
                                            block32: {
                                                eN eN2;
                                                block23: {
                                                    n = (Integer)objectArray[0];
                                                    class_12682 = (class_1268)objectArray[1];
                                                    l = (Long)objectArray[2];
                                                    l2 = (l = C ^ l) ^ 0x355598CDF336L;
                                                    callSite2 = eN.d("\u00dc", (long)2981886544849368656L, (long)l);
                                                    eN2 = this;
                                                    if (callSite2 != null) break block23;
                                                    try {
                                                        block31: {
                                                            if (eN2.r == null) break block24;
                                                            break block31;
                                                            catch (MatchException matchException) {
                                                                throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                                            }
                                                        }
                                                        eN2 = this;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                                    }
                                                }
                                                bl = eN2.s;
                                                if (callSite2 != null) break block25;
                                                if (!bl) break block24;
                                                break block32;
                                                catch (MatchException matchException) {
                                                    throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                                }
                                            }
                                            bl = this.u;
                                            if (callSite2 != null) break block25;
                                            break block33;
                                            catch (MatchException matchException) {
                                                throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                            }
                                        }
                                        if (bl) break block24;
                                        break block34;
                                        catch (MatchException matchException) {
                                            throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                        }
                                    }
                                    try {
                                        block35: {
                                            object = eN.d("W", (Object)eN.d("\u00f9", (long)2983667421382045772L, (long)l), (Object)new Object[0], (long)2982730606464324084L, (long)l);
                                            if (callSite2 != null) break block26;
                                            break block35;
                                            catch (MatchException matchException) {
                                                throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                            }
                                        }
                                        if (object == false) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                                    }
                                }
                                bl = false;
                            }
                            return bl;
                        }
                        object = n;
                    }
                    try {
                        if (callSite2 != null) break block28;
                        if (object < 0) break block29;
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                    }
                    object = n;
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = (int)object;
                eN.d("\u00dc", (Object)objectArray2, (long)2984151632805161878L, (long)l);
            }
            CallSite callSite3 = eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (long)2982666689215596565L, (long)l);
            CallSite callSite4 = eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (long)2983970325956747524L, (long)l);
            try {
                eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (float)eN.d("W", (Object)this.r, (Object)new Object[0], (long)2983747969890231874L, (long)l), (long)2979287741828229978L, (long)l);
                eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (float)eN.d("W", (Object)this.r, (Object)new Object[0], (long)2980658558228777018L, (long)l), (long)2981765989446454587L, (long)l);
                callSite = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2984686449245175699L, (long)l), (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (Object)class_12682, (long)2979543033237774650L, (long)l), (long)2979126899438327128L, (long)l);
                eN.d("W", (Object)eN.d("\u00f9", (long)2983667421382045772L, (long)l), (Object)new Object[]{true}, (long)2982427708614836614L, (long)l);
                this.u = 1;
                if (callSite2 != null) break block30;
                try {
                    block36: {
                        if (callSite == false) break block30;
                        break block36;
                        catch (MatchException matchException) {
                            throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                        }
                    }
                    eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (Object)class_12682, (long)2984310940032491049L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)2985295053293113925L, (long)l);
                }
            }
            finally {
                eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (float)callSite3, (long)2979287741828229978L, (long)l);
                eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2979049157506884224L, (long)l), (float)callSite4, (long)2981765989446454587L, (long)l);
            }
        }
        return (boolean)callSite;
    }

    @bP
    public void a(a5 a52) {
        long l = C ^ 0x5635494C3E28L;
        long l2 = l ^ 0x4DA3C6E51B97L;
        this.y = (int)eN.c("d", (int)6279, (long)(0x2A92A51600471240L ^ l));
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        eN.d("W", (Object)this, (Object)objectArray, (long)35808865825376477L, (long)l);
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
                                                            v0 = var2_2 = eN.C ^ 1255592551438L;
                                                            var4_3 = v0 ^ 35369580675807L;
                                                            var6_4 = v0 ^ 79169611528195L;
                                                            var8_5 = v0 ^ 109262117440982L;
                                                            var10_6 = v0 ^ 7958635439502L;
                                                            var12_7 = eN.d("\u00dc", (long)-2712619824921279125L, (long)var2_2);
                                                            try {
                                                                if (this.r == null) {
                                                                    return;
                                                                }
                                                            }
                                                            catch (MatchException v1) {
                                                                throw eN.d("\u00dc", (Object)v1, (long)-2713706094174822018L, (long)var2_2);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        v2 = eN.d("W", (Object)var1_1, (Object)new Object[0], (long)-2713791938799446007L, (long)var2_2);
                                                                        v3 = y_0.PRE;
                                                                        if (var12_7 != null) break block29;
                                                                        if (v2 != v3) break block30;
                                                                    }
                                                                    catch (MatchException v4) {
                                                                        throw eN.d("\u00dc", (Object)v4, (long)-2713706094174822018L, (long)var2_2);
                                                                    }
                                                                    v5 = new Object[3];
                                                                    v5[2] = var4_3;
                                                                    v5[1] = this.r;
                                                                    v5[0] = this;
                                                                    if (eN.d("W", (Object)eN.d("\u00f9", (long)-2714824975470034057L, (long)var2_2), (Object)v5, (long)-2707371649146455114L, (long)var2_2) != false) break block31;
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw eN.d("\u00dc", (Object)v6, (long)-2713706094174822018L, (long)var2_2);
                                                                }
                                                                this.t = 0;
                                                                return;
                                                            }
                                                            catch (MatchException v7) {
                                                                throw eN.d("\u00dc", (Object)v7, (long)-2713706094174822018L, (long)var2_2);
                                                            }
                                                        }
                                                        eN.d("W", (Object)var1_1, (Object)new Object[]{Float.valueOf((float)eN.d("W", (Object)this.r, (Object)new Object[0], (long)-2714691597870017159L, (long)var2_2))}, (long)-2715026862498521139L, (long)var2_2);
                                                        eN.d("W", (Object)var1_1, (Object)new Object[]{Float.valueOf((float)eN.d("W", (Object)this.r, (Object)new Object[0], (long)-2709353274450527487L, (long)var2_2))}, (long)-2711468187503474189L, (long)var2_2);
                                                        this.t = 1;
                                                        return;
                                                    }
                                                    v2 = eN.d("W", (Object)var1_1, (Object)new Object[0], (long)-2713791938799446007L, (long)var2_2);
                                                    v3 = y_0.POST;
                                                }
                                                try {
                                                    try {
                                                        if (v2 != v3) break block32;
                                                        v8 /* !! */  = this.t;
                                                        if (var12_7 != null) break block33;
                                                    }
                                                    catch (MatchException v9) {
                                                        throw eN.d("\u00dc", (Object)v9, (long)-2713706094174822018L, (long)var2_2);
                                                    }
                                                    if (v8 /* !! */ ) break block34;
                                                }
                                                catch (MatchException v10) {
                                                    throw eN.d("\u00dc", (Object)v10, (long)-2713706094174822018L, (long)var2_2);
                                                }
                                            }
                                            return;
                                        }
                                        this.t = 0;
                                        v11 = new Object[2];
                                        v11[1] = var10_6;
                                        v11[0] = this;
                                        v8 /* !! */  = eN.d("W", (Object)eN.d("\u00f9", (long)-2714824975470034057L, (long)var2_2), (Object)v11, (long)-2709263530176785776L, (long)var2_2);
                                    }
                                    try {
                                        if (var12_7 != null) break block35;
                                        if (v8 /* !! */ ) break block36;
                                    }
                                    catch (MatchException v12) {
                                        throw eN.d("\u00dc", (Object)v12, (long)-2713706094174822018L, (long)var2_2);
                                    }
                                    return;
                                }
                                try {
                                    v13 = this;
                                    if (var12_7 != null) break block37;
                                    v8 /* !! */  = v13.u;
                                }
                                catch (MatchException v14) {
                                    throw eN.d("\u00dc", (Object)v14, (long)-2713706094174822018L, (long)var2_2);
                                }
                            }
                            if (!v8 /* !! */ ) ** GOTO lbl119
                            var13_8 = this.v;
                            try {
                                try {
                                    try {
                                        v15 = new Object[1];
                                        v15[0] = var6_4;
                                        eN.d("W", (Object)this, (Object)v15, (long)-2712518428663236956L, (long)var2_2);
                                        v16 /* !! */  = var13_8;
                                        if (var12_7 != null) break block38;
                                        if (!v16 /* !! */ ) break block39;
                                    }
                                    catch (MatchException v17) {
                                        throw eN.d("\u00dc", (Object)v17, (long)-2713706094174822018L, (long)var2_2);
                                    }
                                    v18 = this;
                                    if (var12_7 != null) break block40;
                                }
                                catch (MatchException v19) {
                                    throw eN.d("\u00dc", (Object)v19, (long)-2713706094174822018L, (long)var2_2);
                                }
                                v16 /* !! */  = eN.d("W", (Object)v18, (long)-2712299862062850757L, (long)var2_2);
                            }
                            catch (MatchException v20) {
                                throw eN.d("\u00dc", (Object)v20, (long)-2713706094174822018L, (long)var2_2);
                            }
                        }
                        if (!v16 /* !! */ ) break block39;
                        v18 = this;
                    }
                    v21 = new Object[1];
                    v21[0] = var8_5;
                    eN.d("W", (Object)v18, (Object)v21, (long)-2710336792606437657L, (long)var2_2);
                }
                try {
                    if (var12_7 == null) break block41;
lbl119:
                    // 2 sources

                    v13 = this;
                }
                catch (MatchException v22) {
                    throw eN.d("\u00dc", (Object)v22, (long)-2713706094174822018L, (long)var2_2);
                }
            }
            v13.s = 1;
        }
    }

    /*
     * Exception decompiling
     */
    private class_1684 a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[DOLOOP]], but top level block is 11[TRYBLOCK]
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
    @bP
    public void a(bl_0 var1_1) {
        block43: {
            block44: {
                block45: {
                    block46: {
                        block41: {
                            block39: {
                                block40: {
                                    block37: {
                                        block38: {
                                            block36: {
                                                block35: {
                                                    block33: {
                                                        block34: {
                                                            v0 = var2_2 = eN.C ^ 118681210475333L;
                                                            var4_3 = v0 ^ 10494114216605L;
                                                            var6_4 = v0 ^ 31639281133935L;
                                                            var8_5 = v0 ^ 123583670875898L;
                                                            var10_6 = v0 ^ 76887312154286L;
                                                            var12_7 = v0 ^ 85547602848947L;
                                                            var14_8 = eN.d("\u00dc", (long)7859270017796485664L, (long)var2_2);
                                                            try {
                                                                try {
                                                                    v1 = this.x;
                                                                    if (var14_8 != null) break block33;
                                                                    if (v1 == eN.d("\u00aa", (Object)eN.b, (long)7859053628240460191L, (long)var2_2)) break block34;
                                                                }
                                                                catch (MatchException v2) {
                                                                    throw eN.d("\u00dc", (Object)v2, (long)7862599385360897589L, (long)var2_2);
                                                                }
                                                                v3 = new Object[1];
                                                                v3[0] = var8_5;
                                                                eN.d("W", (Object)this, (Object)v3, (long)7859355554970117552L, (long)var2_2);
                                                            }
                                                            catch (MatchException v4) {
                                                                throw eN.d("\u00dc", (Object)v4, (long)7862599385360897589L, (long)var2_2);
                                                            }
                                                        }
                                                        v1 = eN.d("W", (Object)this.i, (long)7867336671875682594L, (long)var2_2);
                                                    }
                                                    try {
                                                        try {
                                                            v5 /* !! */  = eN.d("W", (Object)((Boolean)v1), (long)7866673470388602716L, (long)var2_2);
                                                            if (var14_8 != null) break block35;
                                                            if (v5 /* !! */  == false) break block36;
                                                        }
                                                        catch (MatchException v6) {
                                                            throw eN.d("\u00dc", (Object)v6, (long)7862599385360897589L, (long)var2_2);
                                                        }
                                                        v5 /* !! */  = eN.d("W", (String)eN.d("W", (Object)this.c, (long)7867336671875682594L, (long)var2_2), (Object)eN.b("y", (int)29717, (long)(6196786664307554209L ^ var2_2)), (long)7859148240071809857L, (long)var2_2);
                                                    }
                                                    catch (MatchException v7) {
                                                        throw eN.d("\u00dc", (Object)v7, (long)7862599385360897589L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    if (var14_8 != null) break block37;
                                                    if (v5 /* !! */  != false) break block38;
                                                }
                                                catch (MatchException v8) {
                                                    throw eN.d("\u00dc", (Object)v8, (long)7862599385360897589L, (long)var2_2);
                                                }
                                            }
                                            return;
                                        }
                                        v9 = new Object[1];
                                        v9[0] = var6_4;
                                        v5 /* !! */  = eN.d("W", (Object)this, (Object)v9, (long)7867560521132168171L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            if (var14_8 != null) break block39;
                                            if (v5 /* !! */  == false) break block40;
                                        }
                                        catch (MatchException v10) {
                                            throw eN.d("\u00dc", (Object)v10, (long)7862599385360897589L, (long)var2_2);
                                        }
                                        v11 = new Object[1];
                                        v11[0] = var12_7;
                                        eN.d("W", (Object)this, (Object)v11, (long)7860864318326701065L, (long)var2_2);
                                        return;
                                    }
                                    catch (MatchException v12) {
                                        throw eN.d("\u00dc", (Object)v12, (long)7862599385360897589L, (long)var2_2);
                                    }
                                }
                                v5 /* !! */  = (CallSite)this.k;
                            }
                            try {
                                try {
                                    block42: {
                                        try {
                                            try {
                                                try {
                                                    if (var14_8 != null) break block41;
                                                    if (v5 /* !! */  != false) break block42;
                                                }
                                                catch (MatchException v13) {
                                                    throw eN.d("\u00dc", (Object)v13, (long)7862599385360897589L, (long)var2_2);
                                                }
                                                v14 = new Object[5];
                                                v14[4] = var10_6;
                                                v14[3] = Float.valueOf(0.2f);
                                                v14[2] = Float.valueOf(0.0f);
                                                v14[1] = Float.valueOf((float)(eN.d("W", (Object)((Float)eN.d("W", (Object)this.j, (long)7867336671875682594L, (long)var2_2)), (long)7861874553983435988L, (long)var2_2) / 2.0f));
                                                v14[0] = new dC(this.q, (float)(-eN.d("W", (Object)((Float)eN.d("W", (Object)this.d, (long)7867336671875682594L, (long)var2_2)), (long)7861874553983435988L, (long)var2_2)));
                                                if (eN.d("\u00dc", (Object)v14, (long)7860804535331551425L, (long)var2_2) == false) break block43;
                                            }
                                            catch (MatchException v15) {
                                                throw eN.d("\u00dc", (Object)v15, (long)7862599385360897589L, (long)var2_2);
                                            }
                                            this.n = 1;
                                            if (var14_8 == null) break block43;
                                        }
                                        catch (MatchException v16) {
                                            throw eN.d("\u00dc", (Object)v16, (long)7862599385360897589L, (long)var2_2);
                                        }
                                    }
                                    v17 = this;
                                    if (var14_8 != null) break block44;
                                }
                                catch (MatchException v18) {
                                    throw eN.d("\u00dc", (Object)v18, (long)7862599385360897589L, (long)var2_2);
                                }
                                v5 /* !! */  = (CallSite)v17.l;
                            }
                            catch (MatchException v19) {
                                throw eN.d("\u00dc", (Object)v19, (long)7862599385360897589L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                if (v5 /* !! */  != false) {
                                    v20 /* !! */  = this.u;
                                    if (var14_8 != null) break block45;
                                }
                                ** GOTO lbl143
                            }
                            catch (MatchException v21) {
                                throw eN.d("\u00dc", (Object)v21, (long)7862599385360897589L, (long)var2_2);
                            }
                            if (!v20 /* !! */ ) break block46;
                        }
                        catch (MatchException v22) {
                            throw eN.d("\u00dc", (Object)v22, (long)7862599385360897589L, (long)var2_2);
                        }
                        return;
                    }
                    v23 = new Object[5];
                    v23[4] = var10_6;
                    v23[3] = Float.valueOf(0.2f);
                    v23[2] = Float.valueOf(0.0f);
                    v23[1] = Float.valueOf((float)(eN.d("W", (Object)((Float)eN.d("W", (Object)this.j, (long)7867336671875682594L, (long)var2_2)), (long)7861874553983435988L, (long)var2_2) / 2.0f));
                    v23[0] = new dC(this.q, this.p);
                    v20 /* !! */  = eN.d("\u00dc", (Object)v23, (long)7860804535331551425L, (long)var2_2);
                }
                try {
                    try {
                        if (!v20 /* !! */ ) break block43;
                        v24 = new Object[1];
                        v24[0] = var4_3;
                        eN.d("W", (Object)this, (Object)v24, (long)7865987380514404780L, (long)var2_2);
                        if (var14_8 == null) break block43;
                    }
                    catch (MatchException v25) {
                        throw eN.d("\u00dc", (Object)v25, (long)7862599385360897589L, (long)var2_2);
                    }
lbl143:
                    // 2 sources

                    v17 = this;
                }
                catch (MatchException v26) {
                    throw eN.d("\u00dc", (Object)v26, (long)7862599385360897589L, (long)var2_2);
                }
            }
            v17.o = 1;
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eN.d("\u00dc", (Object)((Object)q_0.Mace), (long)-2437578408495443737L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public dC a(Object[] var1_1) {
        block259: {
            block255: {
                block244: {
                    block248: {
                        block249: {
                            block258: {
                                block242: {
                                    block241: {
                                        block240: {
                                            block238: {
                                                block239: {
                                                    block237: {
                                                        block235: {
                                                            block236: {
                                                                block234: {
                                                                    block232: {
                                                                        block233: {
                                                                            block230: {
                                                                                block231: {
                                                                                    block203: {
                                                                                        block204: {
                                                                                            block257: {
                                                                                                block229: {
                                                                                                    block218: {
                                                                                                        block222: {
                                                                                                            block223: {
                                                                                                                block213: {
                                                                                                                    block214: {
                                                                                                                        block216: {
                                                                                                                            block215: {
                                                                                                                                block211: {
                                                                                                                                    block212: {
                                                                                                                                        block210: {
                                                                                                                                            block208: {
                                                                                                                                                block209: {
                                                                                                                                                    block207: {
                                                                                                                                                        block205: {
                                                                                                                                                            block206: {
                                                                                                                                                                block200: {
                                                                                                                                                                    block201: {
                                                                                                                                                                        block256: {
                                                                                                                                                                            block202: {
                                                                                                                                                                                block198: {
                                                                                                                                                                                    block197: {
                                                                                                                                                                                        block196: {
                                                                                                                                                                                            block195: {
                                                                                                                                                                                                block194: {
                                                                                                                                                                                                    block193: {
                                                                                                                                                                                                        block191: {
                                                                                                                                                                                                            block192: {
                                                                                                                                                                                                                block189: {
                                                                                                                                                                                                                    block190: {
                                                                                                                                                                                                                        var2_2 = (Long)var1_1[0];
                                                                                                                                                                                                                        v0 = var2_2;
                                                                                                                                                                                                                        var4_3 = v0 ^ 43040229079061L;
                                                                                                                                                                                                                        var6_4 = v0 ^ 52277468023920L;
                                                                                                                                                                                                                        var8_5 = v0 ^ 29247161167908L;
                                                                                                                                                                                                                        var10_6 = v0 ^ 77721887434032L;
                                                                                                                                                                                                                        var12_7 = v0 ^ 55425823108071L;
                                                                                                                                                                                                                        var14_8 = v0 ^ 120434008667598L;
                                                                                                                                                                                                                        var16_9 = v0 ^ 102640691698968L;
                                                                                                                                                                                                                        var18_10 = v0 ^ 109265412501051L;
                                                                                                                                                                                                                        var20_11 = v0 ^ 30056340190671L;
                                                                                                                                                                                                                        var22_12 = v0 ^ 13724982201792L;
                                                                                                                                                                                                                        var24_13 = v0 ^ 77504906702022L;
                                                                                                                                                                                                                        var26_14 = v0 ^ 106126499036750L;
                                                                                                                                                                                                                        var28_15 = v0 ^ 90200738560140L;
                                                                                                                                                                                                                        var30_16 = v0 ^ 104214641439858L;
                                                                                                                                                                                                                        var32_17 = eN.d("\u00dc", (long)-1181751942196449112L, (long)var2_2);
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v1 = this;
                                                                                                                                                                                                                                if (var32_17 != null) break block189;
                                                                                                                                                                                                                                if (v1.x == eN.d("\u00aa", (Object)eN.b, (long)-1181956254299849961L, (long)var2_2)) break block190;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v2) {
                                                                                                                                                                                                                                throw eN.d("\u00dc", (Object)v2, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v3 = new Object[1];
                                                                                                                                                                                                                            v3[0] = var30_16;
                                                                                                                                                                                                                            eN.d("W", (Object)this, (Object)v3, (long)-1181591739037702344L, (long)var2_2);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException v4) {
                                                                                                                                                                                                                            throw eN.d("\u00dc", (Object)v4, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v1 = this;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v5 = new Object[1];
                                                                                                                                                                                                                v5[0] = var12_7;
                                                                                                                                                                                                                var33_18 = eN.d("W", (Object)v1, (Object)v5, (long)-1177939576050953885L, (long)var2_2);
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        v6 = new Object[1];
                                                                                                                                                                                                                        v6[0] = var24_13;
                                                                                                                                                                                                                        v7 /* !! */  = eN.d("W", (Object)eN.d("\u00f9", (long)-1184370375968803148L, (long)var2_2), (Object)v6, (long)-1179336146475201034L, (long)var2_2);
                                                                                                                                                                                                                        if (var32_17 != null) break block191;
                                                                                                                                                                                                                        if (v7 /* !! */  != false) break block192;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (MatchException v8) {
                                                                                                                                                                                                                        throw eN.d("\u00dc", (Object)v8, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v9 = new Object[1];
                                                                                                                                                                                                                    v9[0] = var30_16;
                                                                                                                                                                                                                    eN.d("W", (Object)this, (Object)v9, (long)-1181591739037702344L, (long)var2_2);
                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (MatchException v10) {
                                                                                                                                                                                                                    throw eN.d("\u00dc", (Object)v10, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v7 /* !! */  = var33_18;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    if (var32_17 != null) break block193;
                                                                                                                                                                                                                    if (v7 /* !! */  == false) break block194;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (MatchException v11) {
                                                                                                                                                                                                                    throw eN.d("\u00dc", (Object)v11, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v12 = new Object[1];
                                                                                                                                                                                                                v12[0] = var18_10;
                                                                                                                                                                                                                eN.d("W", (Object)this, (Object)v12, (long)-1180144464849240447L, (long)var2_2);
                                                                                                                                                                                                                v13 = this;
                                                                                                                                                                                                                if (var32_17 == null) {
                                                                                                                                                                                                                }
                                                                                                                                                                                                                ** GOTO lbl88
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (MatchException v14) {
                                                                                                                                                                                                                throw eN.d("\u00dc", (Object)v14, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v7 /* !! */  = (CallSite)v13.u;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v15) {
                                                                                                                                                                                                            throw eN.d("\u00dc", (Object)v15, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (v7 /* !! */  != false) {
                                                                                                                                                                                                        v13 = this;
lbl88:
                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                        v16 = v13.r;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        v16 = null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return v16;
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        v17 = this;
                                                                                                                                                                                                        if (var32_17 != null) break block195;
                                                                                                                                                                                                        if (v17.r == null) break block196;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v18) {
                                                                                                                                                                                                        throw eN.d("\u00dc", (Object)v18, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v17 = this;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v19) {
                                                                                                                                                                                                    throw eN.d("\u00dc", (Object)v19, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v20 /* !! */  = v17.u;
                                                                                                                                                                                                    if (var32_17 != null) break block197;
                                                                                                                                                                                                    if (!v20 /* !! */ ) break block196;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v21) {
                                                                                                                                                                                                    throw eN.d("\u00dc", (Object)v21, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                }
                                                                                                                                                                                                return this.r;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException v22) {
                                                                                                                                                                                                throw eN.d("\u00dc", (Object)v22, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        v20 /* !! */  = eN.d("W", (Object)eN.b, (long)-1179046699960820653L, (long)var2_2);
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            block199: {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (var32_17 != null) break block198;
                                                                                                                                                                                                            if (!v20 /* !! */ ) break block199;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v23) {
                                                                                                                                                                                                            throw eN.d("\u00dc", (Object)v23, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v24 = eN.d("\u00aa", (Object)eN.b, (long)-1179416526166709323L, (long)var2_2);
                                                                                                                                                                                                        if (var32_17 != null) break block200;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v25) {
                                                                                                                                                                                                        throw eN.d("\u00dc", (Object)v25, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (v24 == null) break block201;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v26) {
                                                                                                                                                                                                    throw eN.d("\u00dc", (Object)v26, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            v27 = this;
                                                                                                                                                                                            if (var32_17 != null) break block202;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v28) {
                                                                                                                                                                                            throw eN.d("\u00dc", (Object)v28, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                        }
                                                                                                                                                                                        v20 /* !! */  = v27.u;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v29) {
                                                                                                                                                                                        throw eN.d("\u00dc", (Object)v29, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if (v20 /* !! */ ) break block256;
                                                                                                                                                                                v27 = this;
                                                                                                                                                                            }
                                                                                                                                                                            v30 = new Object[1];
                                                                                                                                                                            v30[0] = var22_12;
                                                                                                                                                                            eN.d("W", (Object)v27, (Object)v30, (long)-1182064443342617753L, (long)var2_2);
                                                                                                                                                                        }
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                    v24 = eN.d("W", (Object)this.i, (long)-1178171052888534102L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        v31 /* !! */  = eN.d("W", (Object)((Boolean)v24), (long)-1178773798415825452L, (long)var2_2);
                                                                                                                                                                                        if (var32_17 != null) break block203;
                                                                                                                                                                                        if (v31 /* !! */  == false) break block204;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v32) {
                                                                                                                                                                                        throw eN.d("\u00dc", (Object)v32, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                    }
                                                                                                                                                                                    v31 /* !! */  = eN.d("W", (String)eN.d("W", (Object)this.c, (long)-1178171052888534102L, (long)var2_2), (Object)eN.b("y", (int)29717, (long)(6196748637935924521L ^ var2_2)), (long)-1181804571211703863L, (long)var2_2);
                                                                                                                                                                                    if (var32_17 != null) break block203;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v33) {
                                                                                                                                                                                    throw eN.d("\u00dc", (Object)v33, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                                }
                                                                                                                                                                                if (v31 /* !! */  == false) break block204;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v34) {
                                                                                                                                                                                throw eN.d("\u00dc", (Object)v34, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                            }
                                                                                                                                                                            v35 = this;
                                                                                                                                                                            if (var32_17 != null) break block205;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v36) {
                                                                                                                                                                            throw eN.d("\u00dc", (Object)v36, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                        }
                                                                                                                                                                        if (!v35.k) break block206;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v37) {
                                                                                                                                                                        throw eN.d("\u00dc", (Object)v37, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                    }
                                                                                                                                                                    v38 /* !! */  = -1;
                                                                                                                                                                    break block207;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v39) {
                                                                                                                                                                    throw eN.d("\u00dc", (Object)v39, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v35 = this;
                                                                                                                                                        }
                                                                                                                                                        v40 = new Object[1];
                                                                                                                                                        v40[0] = var6_4;
                                                                                                                                                        v38 /* !! */  = (int)eN.d("W", (Object)v35, (Object)v40, (long)-1178660096331847896L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                    var34_19 = v38 /* !! */ ;
                                                                                                                                                    v41 = new Object[1];
                                                                                                                                                    v41[0] = var16_9;
                                                                                                                                                    var35_21 = eN.d("W", (Object)this, (Object)v41, (long)-1179770359446475922L, (long)var2_2);
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v42 = this.k;
                                                                                                                                                                if (var32_17 != null) break block208;
                                                                                                                                                                if (v42 != false) break block209;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v43) {
                                                                                                                                                                throw eN.d("\u00dc", (Object)v43, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                            }
                                                                                                                                                            v42 = var34_19;
                                                                                                                                                            v44 = -1;
                                                                                                                                                            if (var32_17 != null) break block210;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v45) {
                                                                                                                                                            throw eN.d("\u00dc", (Object)v45, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                        }
                                                                                                                                                        if (v42 != v44) {
                                                                                                                                                        }
                                                                                                                                                        ** GOTO lbl241
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v46) {
                                                                                                                                                        throw eN.d("\u00dc", (Object)v46, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v42 = var35_21;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (var32_17 != null) break block211;
                                                                                                                                                v44 = -1;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v47) {
                                                                                                                                                throw eN.d("\u00dc", (Object)v47, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (v42 != v44) break block212;
lbl241:
                                                                                                                                            // 2 sources

                                                                                                                                            v48 = new Object[1];
                                                                                                                                            v48[0] = var4_3;
                                                                                                                                            eN.d("W", (Object)this, (Object)v48, (long)-1179459907625698524L, (long)var2_2);
                                                                                                                                            return null;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v49) {
                                                                                                                                            throw eN.d("\u00dc", (Object)v49, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v42 = (int)this.n;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var32_17 != null) break block213;
                                                                                                                                    if (v42 == 0) break block214;
                                                                                                                                }
                                                                                                                                catch (MatchException v50) {
                                                                                                                                    throw eN.d("\u00dc", (Object)v50, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                }
                                                                                                                                v51 = new Object[2];
                                                                                                                                v51[1] = var20_11;
                                                                                                                                v51[0] = new dC(this.q, (float)(-eN.d("W", (Object)((Float)eN.d("W", (Object)this.d, (long)-1178171052888534102L, (long)var2_2)), (long)-1183650728749693348L, (long)var2_2)));
                                                                                                                                var36_23 = eN.d("W", (Object)this, (Object)v51, (long)-1178837870332403516L, (long)var2_2);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v52 = this;
                                                                                                                                        v53 = var34_19;
                                                                                                                                        if (var32_17 != null) break block215;
                                                                                                                                        v54 = new Object[3];
                                                                                                                                        v54[2] = var28_15;
                                                                                                                                        v54[1] = eN.d("\u00f9", (long)-1181386905790228068L, (long)var2_2);
                                                                                                                                        v54[0] = v53;
                                                                                                                                        if (eN.d("W", (Object)v52, (Object)v54, (long)-1178408498860625859L, (long)var2_2) == false) break block216;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v55) {
                                                                                                                                        throw eN.d("\u00dc", (Object)v55, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    this.k = true;
                                                                                                                                    v52 = this;
                                                                                                                                    v53 = 0;
                                                                                                                                }
                                                                                                                                catch (MatchException v56) {
                                                                                                                                    throw eN.d("\u00dc", (Object)v56, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v52.n = v53;
                                                                                                                            v57 = new Object[1];
                                                                                                                            v57[0] = var8_5;
                                                                                                                            eN.d("W", (Object)this.m, (Object)v57, (long)-1181028899816100275L, (long)var2_2);
                                                                                                                        }
                                                                                                                        return var36_23;
                                                                                                                    }
                                                                                                                    v42 = (int)this.o;
                                                                                                                }
                                                                                                                if (v42 == 0) break block257;
                                                                                                                var36_24 = null;
                                                                                                                var37_27 = eN.c("d", (int)12104, (long)(3859810852784556653L ^ var2_2));
                                                                                                                var38_29 = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)eN.b, (long)-1181956254299849961L, (long)var2_2), (long)-1182935332100267150L, (long)var2_2), (long)-1181693501737946285L, (long)var2_2);
                                                                                                                while (eN.d("W", (Object)var38_29, (long)-1179809139572731193L, (long)var2_2) != false) {
                                                                                                                    block219: {
                                                                                                                        block221: {
                                                                                                                            block220: {
                                                                                                                                block217: {
                                                                                                                                    var39_31 = (class_1297)eN.d("W", (Object)var38_29, (long)-1179990024089071544L, (long)var2_2);
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v58 = var39_31;
                                                                                                                                            if (var32_17 != null) break block217;
                                                                                                                                            v59 /* !! */  = v58 instanceof class_1684;
                                                                                                                                            if (var32_17 != null) break block218;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v60) {
                                                                                                                                            throw eN.d("\u00dc", (Object)v60, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        if (!v59 /* !! */ ) break block219;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v61) {
                                                                                                                                        throw eN.d("\u00dc", (Object)v61, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    v58 = var39_31;
                                                                                                                                }
                                                                                                                                var40_35 = (class_1684)v58;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v62 = var40_35;
                                                                                                                                        if (var32_17 != null) break block220;
                                                                                                                                        if (eN.d("W", (Object)v62, (long)-1181221396122915986L, (long)var2_2) != eN.d("\u00aa", (Object)eN.b, (long)-1175459629176707976L, (long)var2_2)) break block219;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v63) {
                                                                                                                                        throw eN.d("\u00dc", (Object)v63, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    v62 = var40_35;
                                                                                                                                }
                                                                                                                                catch (MatchException v64) {
                                                                                                                                    throw eN.d("\u00dc", (Object)v64, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v65 = eN.d("\u00aa", (Object)v62, (long)-1177851966595857708L, (long)var2_2);
                                                                                                                                    if (var32_17 != null) break block221;
                                                                                                                                    if (v65 >= var37_27) break block219;
                                                                                                                                }
                                                                                                                                catch (MatchException v66) {
                                                                                                                                    throw eN.d("\u00dc", (Object)v66, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                }
                                                                                                                                v65 = eN.d("\u00aa", (Object)var40_35, (long)-1177851966595857708L, (long)var2_2);
                                                                                                                            }
                                                                                                                            catch (MatchException v67) {
                                                                                                                                throw eN.d("\u00dc", (Object)v67, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var37_27 = v65;
                                                                                                                        var36_24 = var40_35;
                                                                                                                    }
                                                                                                                    if (var32_17 == null) continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    v68 = var36_24;
                                                                                                                    if (var32_17 != null) break block222;
                                                                                                                    if (v68 != null) break block223;
                                                                                                                }
                                                                                                                catch (MatchException v69) {
                                                                                                                    throw eN.d("\u00dc", (Object)v69, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                }
                                                                                                                var38_29 = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)eN.b, (long)-1181956254299849961L, (long)var2_2), (long)-1182935332100267150L, (long)var2_2), (long)-1181693501737946285L, (long)var2_2);
                                                                                                                while (eN.d("W", (Object)var38_29, (long)-1179809139572731193L, (long)var2_2) != false) {
                                                                                                                    block224: {
                                                                                                                        var39_31 = (class_1297)eN.d("W", (Object)var38_29, (long)-1179990024089071544L, (long)var2_2);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v70 = var39_31;
                                                                                                                                if (var32_17 != null) break block224;
                                                                                                                                v59 /* !! */  = v70 instanceof class_1684;
                                                                                                                                if (var32_17 != null) break block218;
                                                                                                                            }
                                                                                                                            catch (MatchException v71) {
                                                                                                                                throw eN.d("\u00dc", (Object)v71, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                            }
                                                                                                                            if (v59 /* !! */ ) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl382
                                                                                                                        }
                                                                                                                        catch (MatchException v72) {
                                                                                                                            throw eN.d("\u00dc", (Object)v72, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                        }
                                                                                                                        v70 = var39_31;
                                                                                                                    }
                                                                                                                    var40_35 = (class_1684)v70;
                                                                                                                    try {
                                                                                                                        v68 = var40_35;
                                                                                                                        if (var32_17 != null) break block222;
                                                                                                                        if (eN.d("W", (Object)v68, (long)-1181221396122915986L, (long)var2_2) != eN.d("\u00aa", (Object)eN.b, (long)-1175459629176707976L, (long)var2_2)) break;
                                                                                                                    }
                                                                                                                    catch (MatchException v73) {
                                                                                                                        throw eN.d("\u00dc", (Object)v73, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                    }
                                                                                                                    var36_24 = var40_35;
                                                                                                                    try {
                                                                                                                        if (var32_17 == null) break;
lbl382:
                                                                                                                        // 2 sources

                                                                                                                        if (var32_17 == null) continue;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    catch (MatchException v74) {
                                                                                                                        throw eN.d("\u00dc", (Object)v74, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            v68 = var36_24;
                                                                                                        }
                                                                                                        if (v68 != null) {
                                                                                                            block226: {
                                                                                                                block228: {
                                                                                                                    block227: {
                                                                                                                        block225: {
                                                                                                                            var38_29 = eN.d("W", (Object)eN.d("\u00aa", (Object)eN.b, (long)-1175459629176707976L, (long)var2_2), (long)-1183928711108870666L, (long)var2_2);
                                                                                                                            var39_32 = this.q;
                                                                                                                            var40_36 = eN.d("\u00dc", (double)var39_32, (long)-1180448630236622688L, (long)var2_2);
                                                                                                                            var42_39 = eN.d("W", (Object)new class_243((double)(-eN.d("\u00dc", (double)var40_36, (long)-1177991694484619875L, (long)var2_2)), 0.0, (double)eN.d("\u00dc", (double)var40_36, (long)-1180507576261631768L, (long)var2_2)), (long)-1178689385162419474L, (long)var2_2);
                                                                                                                            var43_41 = (float)(eN.d("\u00aa", (Object)var38_29, (long)-1182988910019109368L, (long)var2_2) * eN.d("\u00aa", (Object)var42_39, (long)-1182988910019109368L, (long)var2_2) + eN.d("\u00aa", (Object)var38_29, (long)-1180278846942725527L, (long)var2_2) * eN.d("\u00aa", (Object)var42_39, (long)-1180278846942725527L, (long)var2_2));
                                                                                                                            v75 = new Object[2];
                                                                                                                            v75[1] = var20_11;
                                                                                                                            v75[0] = new dC(this.q, (float)(-eN.d("W", (Object)((Float)eN.d("W", (Object)this.g, (long)-1178171052888534102L, (long)var2_2)), (long)-1183650728749693348L, (long)var2_2) + var43_41 * 1.6f));
                                                                                                                            var44_43 = eN.d("W", (Object)this, (Object)v75, (long)-1178837870332403516L, (long)var2_2);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v76 = new Object[3];
                                                                                                                                    v76[2] = var28_15;
                                                                                                                                    v76[1] = eN.d("\u00f9", (long)-1181386905790228068L, (long)var2_2);
                                                                                                                                    v76[0] = (int)var35_21;
                                                                                                                                    v77 /* !! */  = eN.d("W", (Object)this, (Object)v76, (long)-1178408498860625859L, (long)var2_2);
                                                                                                                                    if (var32_17 != null) break block225;
                                                                                                                                    if (v77 /* !! */  == false) break block226;
                                                                                                                                }
                                                                                                                                catch (MatchException v78) {
                                                                                                                                    throw eN.d("\u00dc", (Object)v78, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                                }
                                                                                                                                this.l = true;
                                                                                                                                this.o = false;
                                                                                                                                v77 /* !! */  = eN.d("W", (Object)((Boolean)eN.d("W", (Object)this.h, (long)-1178171052888534102L, (long)var2_2)), (long)-1178773798415825452L, (long)var2_2);
                                                                                                                            }
                                                                                                                            catch (MatchException v79) {
                                                                                                                                throw eN.d("\u00dc", (Object)v79, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (var32_17 != null) break block227;
                                                                                                                                if (v77 /* !! */  == false) break block226;
                                                                                                                            }
                                                                                                                            catch (MatchException v80) {
                                                                                                                                throw eN.d("\u00dc", (Object)v80, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                            }
                                                                                                                            v77 /* !! */  = (CallSite)this.A;
                                                                                                                        }
                                                                                                                        catch (MatchException v81) {
                                                                                                                            throw eN.d("\u00dc", (Object)v81, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var32_17 != null) break block228;
                                                                                                                            if (v77 /* !! */  == var35_21) break block226;
                                                                                                                        }
                                                                                                                        catch (MatchException v82) {
                                                                                                                            throw eN.d("\u00dc", (Object)v82, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                        }
                                                                                                                        v77 /* !! */  = (CallSite)this.A;
                                                                                                                    }
                                                                                                                    catch (MatchException v83) {
                                                                                                                        throw eN.d("\u00dc", (Object)v83, (long)-1182829501256067907L, (long)var2_2);
                                                                                                                    }
                                                                                                                }
                                                                                                                v84 = new Object[2];
                                                                                                                v84[1] = var14_8;
                                                                                                                v84[0] = (int)v77 /* !! */ ;
                                                                                                                eN.d("\u00dc", (Object)v84, (long)-1184008253218804370L, (long)var2_2);
                                                                                                            }
                                                                                                            return new dC((float)eN.d("W", (Object)var44_43, (Object)new Object[0], (long)-1184378371382288198L, (long)var2_2), (float)eN.d("W", (Object)var44_43, (Object)new Object[0], (long)-1178476389335593278L, (long)var2_2));
                                                                                                        }
                                                                                                        try {
                                                                                                            v85 = this;
                                                                                                            if (var32_17 != null) break block229;
                                                                                                            v86 = new Object[1];
                                                                                                            v86[0] = var26_14;
                                                                                                            v59 /* !! */  = eN.d("W", (Object)v85, (Object)v86, (long)-1179269484234046378L, (long)var2_2);
                                                                                                        }
                                                                                                        catch (MatchException v87) {
                                                                                                            throw eN.d("\u00dc", (Object)v87, (long)-1182829501256067907L, (long)var2_2);
                                                                                                        }
                                                                                                    }
                                                                                                    if (!v59 /* !! */ ) break block257;
                                                                                                    v85 = this;
                                                                                                }
                                                                                                v88 = new Object[1];
                                                                                                v88[0] = var4_3;
                                                                                                eN.d("W", (Object)v85, (Object)v88, (long)-1179459907625698524L, (long)var2_2);
                                                                                            }
                                                                                            return null;
                                                                                        }
                                                                                        v31 /* !! */  = eN.d("W", (String)eN.d("W", (Object)this.c, (long)-1178171052888534102L, (long)var2_2), (Object)eN.b("y", (int)13907, (long)(8822381213480269677L ^ var2_2)), (long)-1181804571211703863L, (long)var2_2);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var32_17 != null) break block230;
                                                                                            if (v31 /* !! */  == false) break block231;
                                                                                        }
                                                                                        catch (MatchException v89) {
                                                                                            throw eN.d("\u00dc", (Object)v89, (long)-1182829501256067907L, (long)var2_2);
                                                                                        }
                                                                                        v90 = new Object[1];
                                                                                        v90[0] = var10_6;
                                                                                        return eN.d("W", (Object)this, (Object)v90, (long)-1177828565940954211L, (long)var2_2);
                                                                                    }
                                                                                    catch (MatchException v91) {
                                                                                        throw eN.d("\u00dc", (Object)v91, (long)-1182829501256067907L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v92 = this;
                                                                                    if (var32_17 != null) break block232;
                                                                                    v31 /* !! */  = (CallSite)v92.k;
                                                                                }
                                                                                catch (MatchException v93) {
                                                                                    throw eN.d("\u00dc", (Object)v93, (long)-1182829501256067907L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (v31 /* !! */  == false) break block233;
                                                                                v94 /* !! */  = -1;
                                                                                break block234;
                                                                            }
                                                                            catch (MatchException v95) {
                                                                                throw eN.d("\u00dc", (Object)v95, (long)-1182829501256067907L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        v92 = this;
                                                                    }
                                                                    v96 = new Object[1];
                                                                    v96[0] = var6_4;
                                                                    v94 /* !! */  = (int)eN.d("W", (Object)v92, (Object)v96, (long)-1178660096331847896L, (long)var2_2);
                                                                }
                                                                var34_20 = v94 /* !! */ ;
                                                                v97 = new Object[1];
                                                                v97[0] = var16_9;
                                                                var35_22 = eN.d("W", (Object)this, (Object)v97, (long)-1179770359446475922L, (long)var2_2);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v98 = this.k;
                                                                            if (var32_17 != null) break block235;
                                                                            if (v98 != false) break block236;
                                                                        }
                                                                        catch (MatchException v99) {
                                                                            throw eN.d("\u00dc", (Object)v99, (long)-1182829501256067907L, (long)var2_2);
                                                                        }
                                                                        v98 = var34_20;
                                                                        v100 = -1;
                                                                        if (var32_17 != null) break block237;
                                                                    }
                                                                    catch (MatchException v101) {
                                                                        throw eN.d("\u00dc", (Object)v101, (long)-1182829501256067907L, (long)var2_2);
                                                                    }
                                                                    if (v98 != v100) {
                                                                    }
                                                                    ** GOTO lbl547
                                                                }
                                                                catch (MatchException v102) {
                                                                    throw eN.d("\u00dc", (Object)v102, (long)-1182829501256067907L, (long)var2_2);
                                                                }
                                                            }
                                                            v98 = var35_22;
                                                        }
                                                        try {
                                                            if (var32_17 != null) break block238;
                                                            v100 = -1;
                                                        }
                                                        catch (MatchException v103) {
                                                            throw eN.d("\u00dc", (Object)v103, (long)-1182829501256067907L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        if (v98 != v100) break block239;
lbl547:
                                                        // 2 sources

                                                        v104 = new Object[1];
                                                        v104[0] = var4_3;
                                                        eN.d("W", (Object)this, (Object)v104, (long)-1179459907625698524L, (long)var2_2);
                                                        return null;
                                                    }
                                                    catch (MatchException v105) {
                                                        throw eN.d("\u00dc", (Object)v105, (long)-1182829501256067907L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    v106 = this;
                                                    if (var32_17 != null) break block240;
                                                    v98 = (int)v106.k;
                                                }
                                                catch (MatchException v107) {
                                                    throw eN.d("\u00dc", (Object)v107, (long)-1182829501256067907L, (long)var2_2);
                                                }
                                            }
                                            if (v98 != 0) break block258;
                                            v106 = this;
                                        }
                                        v108 = new Object[2];
                                        v108[1] = var20_11;
                                        v108[0] = new dC(this.q, (float)(-eN.d("W", (Object)((Float)eN.d("W", (Object)this.d, (long)-1178171052888534102L, (long)var2_2)), (long)-1183650728749693348L, (long)var2_2)));
                                        var36_25 = eN.d("W", (Object)v106, (Object)v108, (long)-1178837870332403516L, (long)var2_2);
                                        try {
                                            try {
                                                v109 = this;
                                                v110 = var34_20;
                                                if (var32_17 != null) break block241;
                                                v111 = new Object[3];
                                                v111[2] = var28_15;
                                                v111[1] = eN.d("\u00f9", (long)-1181386905790228068L, (long)var2_2);
                                                v111[0] = v110;
                                                if (eN.d("W", (Object)v109, (Object)v111, (long)-1178408498860625859L, (long)var2_2) == false) break block242;
                                            }
                                            catch (MatchException v112) {
                                                throw eN.d("\u00dc", (Object)v112, (long)-1182829501256067907L, (long)var2_2);
                                            }
                                            v109 = this;
                                            v110 = 1;
                                        }
                                        catch (MatchException v113) {
                                            throw eN.d("\u00dc", (Object)v113, (long)-1182829501256067907L, (long)var2_2);
                                        }
                                    }
                                    v109.k = v110;
                                    v114 = new Object[1];
                                    v114[0] = var8_5;
                                    eN.d("W", (Object)this.m, (Object)v114, (long)-1181028899816100275L, (long)var2_2);
                                }
                                return var36_25;
                            }
                            var36_26 = null;
                            var37_28 = eN.c("d", (int)8582, (long)(8228148864018826402L ^ var2_2));
                            var38_30 = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)eN.b, (long)-1181956254299849961L, (long)var2_2), (long)-1182935332100267150L, (long)var2_2), (long)-1181693501737946285L, (long)var2_2);
                            while (eN.d("W", (Object)var38_30, (long)-1179809139572731193L, (long)var2_2) != false) {
                                block245: {
                                    block247: {
                                        block246: {
                                            block243: {
                                                var39_33 = (class_1297)eN.d("W", (Object)var38_30, (long)-1179990024089071544L, (long)var2_2);
                                                try {
                                                    try {
                                                        v115 = var39_33;
                                                        if (var32_17 != null) break block243;
                                                        v116 /* !! */  = v115 instanceof class_1684;
                                                        if (var32_17 != null) break block244;
                                                    }
                                                    catch (MatchException v117) {
                                                        throw eN.d("\u00dc", (Object)v117, (long)-1182829501256067907L, (long)var2_2);
                                                    }
                                                    if (!v116 /* !! */ ) break block245;
                                                }
                                                catch (MatchException v118) {
                                                    throw eN.d("\u00dc", (Object)v118, (long)-1182829501256067907L, (long)var2_2);
                                                }
                                                v115 = var39_33;
                                            }
                                            var40_37 = (class_1684)v115;
                                            try {
                                                try {
                                                    v119 = var40_37;
                                                    if (var32_17 != null) break block246;
                                                    if (eN.d("W", (Object)v119, (long)-1181221396122915986L, (long)var2_2) != eN.d("\u00aa", (Object)eN.b, (long)-1175459629176707976L, (long)var2_2)) break block245;
                                                }
                                                catch (MatchException v120) {
                                                    throw eN.d("\u00dc", (Object)v120, (long)-1182829501256067907L, (long)var2_2);
                                                }
                                                v119 = var40_37;
                                            }
                                            catch (MatchException v121) {
                                                throw eN.d("\u00dc", (Object)v121, (long)-1182829501256067907L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                v122 = eN.d("\u00aa", (Object)v119, (long)-1177851966595857708L, (long)var2_2);
                                                if (var32_17 != null) break block247;
                                                if (v122 >= var37_28) break block245;
                                            }
                                            catch (MatchException v123) {
                                                throw eN.d("\u00dc", (Object)v123, (long)-1182829501256067907L, (long)var2_2);
                                            }
                                            v122 = eN.d("\u00aa", (Object)var40_37, (long)-1177851966595857708L, (long)var2_2);
                                        }
                                        catch (MatchException v124) {
                                            throw eN.d("\u00dc", (Object)v124, (long)-1182829501256067907L, (long)var2_2);
                                        }
                                    }
                                    var37_28 = v122;
                                    var36_26 = var40_37;
                                }
                                if (var32_17 == null) continue;
                            }
                            try {
                                v125 = var36_26;
                                if (var32_17 != null) break block248;
                                if (v125 != null) break block249;
                            }
                            catch (MatchException v126) {
                                throw eN.d("\u00dc", (Object)v126, (long)-1182829501256067907L, (long)var2_2);
                            }
                            var38_30 = eN.d("W", (Object)eN.d("W", (Object)eN.d("\u00aa", (Object)eN.b, (long)-1181956254299849961L, (long)var2_2), (long)-1182935332100267150L, (long)var2_2), (long)-1181693501737946285L, (long)var2_2);
                            while (eN.d("W", (Object)var38_30, (long)-1179809139572731193L, (long)var2_2) != false) {
                                block250: {
                                    var39_33 = (class_1297)eN.d("W", (Object)var38_30, (long)-1179990024089071544L, (long)var2_2);
                                    try {
                                        try {
                                            v127 = var39_33;
                                            if (var32_17 != null) break block250;
                                            v116 /* !! */  = v127 instanceof class_1684;
                                            if (var32_17 != null) break block244;
                                        }
                                        catch (MatchException v128) {
                                            throw eN.d("\u00dc", (Object)v128, (long)-1182829501256067907L, (long)var2_2);
                                        }
                                        if (v116 /* !! */ ) {
                                        }
                                        ** GOTO lbl687
                                    }
                                    catch (MatchException v129) {
                                        throw eN.d("\u00dc", (Object)v129, (long)-1182829501256067907L, (long)var2_2);
                                    }
                                    v127 = var39_33;
                                }
                                var40_37 = (class_1684)v127;
                                try {
                                    v125 = var40_37;
                                    if (var32_17 != null) break block248;
                                    if (eN.d("W", (Object)v125, (long)-1181221396122915986L, (long)var2_2) != eN.d("\u00aa", (Object)eN.b, (long)-1175459629176707976L, (long)var2_2)) break;
                                }
                                catch (MatchException v130) {
                                    throw eN.d("\u00dc", (Object)v130, (long)-1182829501256067907L, (long)var2_2);
                                }
                                var36_26 = var40_37;
                                try {
                                    if (var32_17 == null) break;
lbl687:
                                    // 2 sources

                                    if (var32_17 == null) continue;
                                    break;
                                }
                                catch (MatchException v131) {
                                    throw eN.d("\u00dc", (Object)v131, (long)-1182829501256067907L, (long)var2_2);
                                }
                            }
                        }
                        v125 = var36_26;
                    }
                    if (v125 != null) {
                        block252: {
                            block253: {
                                block254: {
                                    block251: {
                                        var38_30 = eN.d("W", (Object)eN.d("\u00aa", (Object)eN.b, (long)-1175459629176707976L, (long)var2_2), (long)-1183928711108870666L, (long)var2_2);
                                        var39_34 = this.q;
                                        var40_38 = eN.d("\u00dc", (double)var39_34, (long)-1180448630236622688L, (long)var2_2);
                                        var42_40 = eN.d("W", (Object)new class_243((double)(-eN.d("\u00dc", (double)var40_38, (long)-1177991694484619875L, (long)var2_2)), 0.0, (double)eN.d("\u00dc", (double)var40_38, (long)-1180507576261631768L, (long)var2_2)), (long)-1178689385162419474L, (long)var2_2);
                                        var43_42 = (float)(eN.d("\u00aa", (Object)var38_30, (long)-1182988910019109368L, (long)var2_2) * eN.d("\u00aa", (Object)var42_40, (long)-1182988910019109368L, (long)var2_2) + eN.d("\u00aa", (Object)var38_30, (long)-1180278846942725527L, (long)var2_2) * eN.d("\u00aa", (Object)var42_40, (long)-1180278846942725527L, (long)var2_2));
                                        v132 = new Object[2];
                                        v132[1] = var20_11;
                                        v132[0] = new dC(this.q, (float)(-eN.d("W", (Object)((Float)eN.d("W", (Object)this.g, (long)-1178171052888534102L, (long)var2_2)), (long)-1183650728749693348L, (long)var2_2) + var43_42 * 1.6f));
                                        var44_44 = eN.d("W", (Object)this, (Object)v132, (long)-1178837870332403516L, (long)var2_2);
                                        try {
                                            try {
                                                try {
                                                    v133 = new Object[3];
                                                    v133[2] = var28_15;
                                                    v133[1] = eN.d("\u00f9", (long)-1181386905790228068L, (long)var2_2);
                                                    v133[0] = (int)var35_22;
                                                    v134 = eN.d("W", (Object)this, (Object)v133, (long)-1178408498860625859L, (long)var2_2);
                                                    if (var32_17 != null) break block251;
                                                    if (v134 == false) break block252;
                                                }
                                                catch (MatchException v135) {
                                                    throw eN.d("\u00dc", (Object)v135, (long)-1182829501256067907L, (long)var2_2);
                                                }
                                                v136 = this;
                                                if (var32_17 != null) break block253;
                                            }
                                            catch (MatchException v137) {
                                                throw eN.d("\u00dc", (Object)v137, (long)-1182829501256067907L, (long)var2_2);
                                            }
                                            v134 = eN.d("W", (Object)((Boolean)eN.d("W", (Object)v136.h, (long)-1178171052888534102L, (long)var2_2)), (long)-1178773798415825452L, (long)var2_2);
                                        }
                                        catch (MatchException v138) {
                                            throw eN.d("\u00dc", (Object)v138, (long)-1182829501256067907L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (v134 == false) break block254;
                                                v136 = this;
                                                if (var32_17 != null) break block253;
                                            }
                                            catch (MatchException v139) {
                                                throw eN.d("\u00dc", (Object)v139, (long)-1182829501256067907L, (long)var2_2);
                                            }
                                            if (v136.A == var35_22) break block254;
                                        }
                                        catch (MatchException v140) {
                                            throw eN.d("\u00dc", (Object)v140, (long)-1182829501256067907L, (long)var2_2);
                                        }
                                        v141 = new Object[2];
                                        v141[1] = var14_8;
                                        v141[0] = this.A;
                                        eN.d("\u00dc", (Object)v141, (long)-1184008253218804370L, (long)var2_2);
                                    }
                                    catch (MatchException v142) {
                                        throw eN.d("\u00dc", (Object)v142, (long)-1182829501256067907L, (long)var2_2);
                                    }
                                }
                                v136 = this;
                            }
                            v136.v = true;
                        }
                        return new dC((float)eN.d("W", (Object)var44_44, (Object)new Object[0], (long)-1184378371382288198L, (long)var2_2), (float)eN.d("W", (Object)var44_44, (Object)new Object[0], (long)-1178476389335593278L, (long)var2_2));
                    }
                    try {
                        v143 = this;
                        if (var32_17 != null) break block255;
                        v144 = new Object[1];
                        v144[0] = var26_14;
                        v116 /* !! */  = eN.d("W", (Object)v143, (Object)v144, (long)-1179269484234046378L, (long)var2_2);
                    }
                    catch (MatchException v145) {
                        throw eN.d("\u00dc", (Object)v145, (long)-1182829501256067907L, (long)var2_2);
                    }
                }
                if (!v116 /* !! */ ) break block259;
                v143 = this;
            }
            v146 = new Object[1];
            v146[0] = var4_3;
            eN.d("W", (Object)v143, (Object)v146, (long)-1179459907625698524L, (long)var2_2);
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
        if (K[n3] != null) {
            return n3;
        }
        Object object = J[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 59;
            case 2 -> 31;
            case 3 -> 30;
            case 4 -> 11;
            case 5 -> 39;
            case 6 -> 62;
            case 7 -> 15;
            case 8 -> 46;
            case 9 -> 12;
            case 10 -> 47;
            case 11 -> 42;
            case 12 -> 9;
            case 13 -> 21;
            case 14 -> 26;
            case 15 -> 41;
            case 16 -> 40;
            case 17 -> 1;
            case 18 -> 7;
            case 19 -> 53;
            case 20 -> 51;
            case 21 -> 38;
            case 22 -> 10;
            case 23 -> 55;
            case 24 -> 32;
            case 25 -> 2;
            case 26 -> 48;
            case 27 -> 49;
            case 28 -> 52;
            case 29 -> 19;
            case 30 -> 6;
            case 31 -> 14;
            case 32 -> 33;
            case 33 -> 22;
            case 34 -> 37;
            case 35 -> 18;
            case 36 -> 34;
            case 37 -> 24;
            case 38 -> 8;
            case 39 -> 28;
            case 40 -> 25;
            case 41 -> 56;
            case 42 -> 16;
            case 43 -> 58;
            case 44 -> 5;
            case 45 -> 50;
            case 46 -> 60;
            case 47 -> 29;
            case 48 -> 0;
            case 49 -> 63;
            case 50 -> 13;
            case 51 -> 23;
            case 52 -> 45;
            case 53 -> 61;
            case 54 -> 36;
            case 55 -> 35;
            case 56 -> 3;
            case 57 -> 20;
            case 58 -> 4;
            case 59 -> 57;
            case 60 -> 27;
            case 61 -> 43;
            case 62 -> 17;
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
        eN.K[n3] = new String(cArray);
        return n3;
    }

    private void m(Object[] objectArray) {
        long l;
        long l2;
        block10: {
            block9: {
                int n;
                l2 = (Long)objectArray[0];
                long l3 = l2 = C ^ l2;
                long l4 = l3 ^ 0x5867986787C6L;
                long l5 = l3 ^ 0x4E85A2713A22L;
                l = l3 ^ 0x61B8EE8B421BL;
                CallSite callSite = eN.d("\u00dc", (long)2711104040046394030L, (long)l2);
                try {
                    n = this.x != eN.d("\u00aa", (Object)b, (long)2710759127909413137L, (long)l2) ? 1 : 0;
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)2707765953798627003L, (long)l2);
                }
                int n2 = n;
                try {
                    eN eN2;
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        eN.d("W", (Object)this, (Object)objectArray2, (long)2710642211475048801L, (long)l2);
                        this.k = 0;
                        this.l = 0;
                        this.n = 0;
                        this.o = 0;
                        this.z = p_0.PREP;
                        this.B = -1;
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l5;
                        eN.d("W", (Object)this.m, (Object)objectArray3, (long)2709601705249104971L, (long)l2);
                        eN2 = this;
                        if (callSite != null) break block9;
                        eN2.x = eN.d("\u00aa", (Object)b, (long)2710759127909413137L, (long)l2);
                        if (n2 == 0) break block10;
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)2707765953798627003L, (long)l2);
                    }
                    eN2 = this;
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)2707765953798627003L, (long)l2);
                }
            }
            eN2.y = (int)eN.c("d", (int)6279, (long)(0x2A92E2619ADB37A3L ^ l2));
        }
        try {
            if (eN.d("\u00aa", (Object)b, (long)2713904407238143614L, (long)l2) != null) {
                this.p = (float)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2713904407238143614L, (long)l2), (long)2708701812636085754L, (long)l2);
                this.q = (float)eN.d("W", (Object)eN.d("\u00aa", (Object)b, (long)2713904407238143614L, (long)l2), (long)2709622489000051947L, (long)l2);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l;
                this.A = (int)eN.d("\u00dc", (Object)objectArray4, (long)2708196065343814747L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw eN.d("\u00dc", (Object)matchException, (long)2707765953798627003L, (long)l2);
        }
    }

    private static Field o(long l, long l2) {
        int n = eN.m(l, l2);
        Object object = J[n];
        if (object instanceof String) {
            String string = K[n];
            int n2 = string.indexOf(8);
            Class clazz = eN.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eN.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eN.g(clazz3, string2, clazz2)) != null) {
                    eN.J[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eN.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eN.J[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eN.n(3054618657699041L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eN.m(l, l2);
        Object object = J[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = K[n];
                int n3 = string2.indexOf(8);
                clazz3 = eN.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eN.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eN.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eN.J[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eN.n(3054618657699041L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eN.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eN.J[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eN.n(3054618657699041L, 0L);
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
        block4: {
            eN eN2;
            block5: {
                long l = (Long)objectArray[0];
                long l2 = (l = C ^ l) ^ 0x65CF92D05D8FL;
                CallSite callSite = eN.d("\u00dc", (long)-11545513608306457L, (long)l);
                try {
                    try {
                        eN2 = this;
                        if (callSite != null) break block4;
                        if (eN2.u) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eN.d("\u00dc", (Object)matchException, (long)-10459233583135502L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    eN.d("W", (Object)this, (Object)objectArray2, (long)-11506308208291032L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eN.d("\u00dc", (Object)matchException, (long)-10459233583135502L, (long)l);
                }
            }
            this.n = 0;
            eN2 = this;
        }
        eN2.o = 0;
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
        long l2 = l = C ^ l;
        long l3 = l2 ^ 0x54E7C6D1B985L;
        long l4 = l2 ^ 0x488161DBFCE8L;
        try {
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = l3;
            objectArray2[2] = new Class[0];
            objectArray2[1] = eN.b("y", (int)24216, (long)(0x16408C719A405180L ^ l));
            objectArray2[0] = eN.d("\u00aa", (Object)b, (long)7039355458698114888L, (long)l);
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l4;
            objectArray3[1] = new Object[0];
            objectArray3[0] = eN.d("\u00aa", (Object)b, (long)7039355458698114888L, (long)l);
            eN.d("W", (Object)eN.d("\u00dc", (Object)objectArray2, (long)7039263602050414712L, (long)l), (Object)objectArray3, (long)7025718836803423164L, (long)l);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private boolean lambda$new$0(Float f) {
        long l = C ^ 0x1F7A9230E6FFL;
        return (boolean)eN.d("W", (String)((Object)eN.d("W", (Object)this.c, (long)-2840626158367054696L, (long)l)), (Object)eN.b("y", (int)29717, (long)(0x55FF1C29AFB9421BL ^ l)), (long)-2834108708285747461L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        long l = C ^ 0x6AB724887768L;
        return (boolean)eN.d("W", (String)((Object)eN.d("W", (Object)this.c, (long)5261159026953155855L, (long)l)), (Object)eN.b("y", (int)14706, (long)(0x73522881A8AE9EEAL ^ l)), (long)5277177426805391212L, (long)l);
    }

    private boolean lambda$new$1(Float f) {
        long l = C ^ 0x19E6351F22A8L;
        return (boolean)eN.d("W", (String)((Object)eN.d("W", (Object)this.c, (long)2072525626274128079L, (long)l)), (Object)eN.b("y", (int)13907, (long)(0x7A6F3840988AC408L ^ l)), (long)2088614394834889388L, (long)l);
    }

    private boolean lambda$new$3(Boolean bl) {
        long l = C ^ 0x36A59C7B2802L;
        return (boolean)eN.d("W", (String)((Object)eN.d("W", (Object)this.c, (long)1614883858251164261L, (long)l)), (Object)eN.b("y", (int)23469, (long)(0x504A51AD0512235DL ^ l)), (long)1609492584059805702L, (long)l);
    }

    private boolean lambda$new$4(Boolean bl) {
        long l = C ^ 0x3CE3D7E0DEFAL;
        return (boolean)eN.d("W", (String)((Object)eN.d("W", (Object)this.c, (long)-2264974065657095011L, (long)l)), (Object)eN.b("y", (int)29717, (long)(0x55FF3FB0EA697A1EL ^ l)), (long)-2256836968407542018L, (long)l);
    }

    private boolean lambda$new$5(Float f) {
        long l = C ^ 0x63A59B1D9611L;
        return (boolean)eN.d("W", (Object)((Boolean)((Object)eN.d("W", (Object)this.i, (long)-6306608137210948490L, (long)l))), (long)-6307289618077629944L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eN.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eN.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eN.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


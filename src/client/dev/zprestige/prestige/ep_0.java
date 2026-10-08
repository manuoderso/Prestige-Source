/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.cb_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.x_0;
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
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ep
 */
public class ep_0
extends dV
implements dF {
    private dR a;
    private dM d;
    private dO c;
    private dM e;
    private dQ f;
    private dQ g;
    private dM h;
    private dM i;
    private dO j;
    private int k;
    private int l;
    private boolean m;
    private f5 n;
    private f5 o;
    private f5 p;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;
    private static final long[] u;
    private static final Integer[] v;
    private static final Map w;
    private static final long x;
    private static final Object[] y;
    private static final String[] z;

    public ep_0() {
        long l;
        long l2 = l = q ^ 0x11423E74206FL;
        long l3 = l2 ^ 0x69D5085701A0L;
        long l4 = l2 ^ 0x5F8C3F0872AAL;
        long l5 = l2 ^ 0x57BA2C3D6573L;
        long l6 = l2 ^ 0xAF796EC1998L;
        this.k = -1;
        this.l = -1;
        this.m = 0;
        this.n = new f5(l4);
        this.o = new f5(l4);
        this.p = new f5(l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = this::lambda$new$0;
        ep_0.d("\u00e1", (Object)this.d, (Object)objectArray, (long)-8563069354820685876L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = this::lambda$new$4;
        ep_0.d("\u00e1", (Object)this.g, (Object)objectArray2, (long)-8561589792334289844L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l6;
        objectArray3[0] = this::lambda$new$5;
        ep_0.d("\u00e1", (Object)this.h, (Object)objectArray3, (long)-8563069354820685876L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = this::lambda$new$6;
        ep_0.d("\u00e1", (Object)this.i, (Object)objectArray4, (long)-8563069354820685876L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l5;
        objectArray5[0] = this::lambda$new$7;
        ep_0.d("\u00e1", (Object)this.j, (Object)objectArray5, (long)-8565582256321227236L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l5;
        objectArray6[0] = this::lambda$new$1;
        ep_0.d("\u00e1", (Object)this.c, (Object)objectArray6, (long)-8565582256321227236L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l3;
        objectArray7[0] = this::lambda$new$3;
        ep_0.d("\u00e1", (Object)this.f, (Object)objectArray7, (long)-8561589792334289844L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l6;
        objectArray8[0] = this::lambda$new$2;
        ep_0.d("\u00e1", (Object)this.e, (Object)objectArray8, (long)-8563069354820685876L, (long)l);
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
                            ep_0.q = hc.a(900694826698695901L, -8139911981718322933L, MethodHandles.lookup().lookupClass()).a(254952258560337L);
                            ep_0.y = new Object[131];
                            ep_0.z = new String[131];
                            ep_0.f();
                            ep_0.t = new HashMap<K, V>(13);
                            var16 = ep_0.q ^ 47090243895726L;
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
                            var22_5 = "\u00f1ha\u00a1\u00b2T\u0000\u007fE\u00e5\u0017\u007f\u0000pg\u00c3\u00dcy\f1\u00c3Z\u00e5\u00a4\"\u000e\u00dd Od\u00d7u(T\u00acmr\u00fe\u0097U\u00b6\u0005\u00d1\u00aa\u0090\u0080\u00c0\u00a4\u0095\u009dd\u00ab\u008d\u0019\u00da0c\u00ab\u0098\u00b8\u00f7\u00e3\u008f\u00b19g\u00f7\u00ac\u0017!X\u00d4\u00c8(\u00813L0#\u00f13O\u00afRp\u0005\u00f6\u00f9\u0010\u00f7\u001e8 T]T\u00c1\u00cc\u00ae^\u009c\u00fd\u00e3\u00d5\u0004\u0005l\u001c\u00f7\u0098j\u00d8,\u00b0";
                            var24_6 = "\u00f1ha\u00a1\u00b2T\u0000\u007fE\u00e5\u0017\u007f\u0000pg\u00c3\u00dcy\f1\u00c3Z\u00e5\u00a4\"\u000e\u00dd Od\u00d7u(T\u00acmr\u00fe\u0097U\u00b6\u0005\u00d1\u00aa\u0090\u0080\u00c0\u00a4\u0095\u009dd\u00ab\u008d\u0019\u00da0c\u00ab\u0098\u00b8\u00f7\u00e3\u008f\u00b19g\u00f7\u00ac\u0017!X\u00d4\u00c8(\u00813L0#\u00f13O\u00afRp\u0005\u00f6\u00f9\u0010\u00f7\u001e8 T]T\u00c1\u00cc\u00ae^\u009c\u00fd\u00e3\u00d5\u0004\u0005l\u001c\u00f7\u0098j\u00d8,\u00b0".length();
                            var21_7 = 32;
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
                                var25_3[var23_4++] = ep_0.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "\u00bc\u00b2\u00baVq\u001d\u00b6\u00c5\u0010\u009e\u00a8G&\u00a8\u00f1m \u001c\tH\u0082\u00e0\u0011\u0097H\u0096e\u009f\u00c0\u001d\u00df_\u0093\u0093\u0086\u00c51\u009b!\u00ac\u0015(\u00c1\u00b1\u00b5f\u001b\u009b\u00e3";
                                var24_6 = "\u00bc\u00b2\u00baVq\u001d\u00b6\u00c5\u0010\u009e\u00a8G&\u00a8\u00f1m \u001c\tH\u0082\u00e0\u0011\u0097H\u0096e\u009f\u00c0\u001d\u00df_\u0093\u0093\u0086\u00c51\u009b!\u00ac\u0015(\u00c1\u00b1\u00b5f\u001b\u009b\u00e3".length();
                                var21_7 = 16;
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
                                var25_3[var23_4++] = ep_0.b(var26_9).intern();
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
                    ep_0.r = var25_3;
                    ep_0.s = new String[5];
                    ep_0.w = new HashMap<K, V>(13);
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
                    var9_14 = "\u00d2\u00bc\u00dc\u00e9-\u0018\fF^\u008d\u00b5\u0015\u001b\u0085\u00a7^";
                    var10_15 = "\u00d2\u00bc\u00dc\u00e9-\u0018\fF^\u008d\u00b5\u0015\u001b\u0085\u00a7^".length();
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
                        var9_14 = "\u00cd\u009c\u00b3\u008b-\u0014\u0091h\u00d6\u0088\u00c0\u000f\u00fa\u00a1\u0088y";
                        var10_15 = "\u00cd\u009c\u00b3\u008b-\u0014\u0091h\u00d6\u0088\u00c0\u000f\u00fa\u00a1\u0088y".length();
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
            ep_0.u = var11_12;
            ep_0.v = new Integer[4];
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
        var2_22 = -5781299651187252641L;
        var4_23 = var0_20.doFinal(new byte[]{(byte)(var2_22 >>> 56), (byte)(var2_22 >>> 48), (byte)(var2_22 >>> 40), (byte)(var2_22 >>> 32), (byte)(var2_22 >>> 24), (byte)(var2_22 >>> 16), (byte)(var2_22 >>> 8), (byte)var2_22});
        ** while (true)
        ep_0.x = ((long)var4_23[0] & 255L) << 56 | ((long)var4_23[1] & 255L) << 48 | ((long)var4_23[2] & 255L) << 40 | ((long)var4_23[3] & 255L) << 32 | ((long)var4_23[4] & 255L) << 24 | ((long)var4_23[5] & 255L) << 16 | ((long)var4_23[6] & 255L) << 8 | (long)var4_23[7] & 255L;
    }

    /*
     * WARNING - void declaration
     */
    private int e(Object[] objectArray) {
        int n;
        block5: {
            void var5_4;
            long l = (Long)objectArray[0];
            l = q ^ l;
            CallSite callSite = ep_0.c("g", (int)11958, (long)(0x4C19B9B48F731B4FL ^ l));
            CallSite callSite2 = ep_0.d("\u00fb", (long)-1176985242045331969L, (long)l);
            while (var5_4 <= ep_0.c("g", (int)7105, (long)(0x6A80D0043AE5AE39L ^ l))) {
                block7: {
                    void v3;
                    block6: {
                        try {
                            try {
                                n = ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-1179650027948400438L, (long)l), (long)-1177515893377841253L, (long)l), (int)var5_4, (long)-1176786960578818083L, (long)l), (long)-1177254903243547982L, (long)l) instanceof class_1743;
                                if (callSite2 != null) break block5;
                                if (callSite2 != null) break block6;
                            }
                            catch (MatchException matchException) {
                                throw ep_0.d("\u00fb", (Object)matchException, (long)-1179711309229417708L, (long)l);
                            }
                            if (n == 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)-1179711309229417708L, (long)l);
                        }
                        v3 = var5_4;
                    }
                    return (int)v3;
                }
                ++var5_4;
                if (callSite2 == null) continue;
            }
            n = -1;
        }
        return n;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        ep_0.d("\u00e1", (Object)ep_0.d("e", (long)3997015258167861699L, (long)l), (Object)objectArray2, (long)3998665566308380472L, (long)l);
        this.k = -1;
        this.l = -1;
        this.m = 0;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ep" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ep_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C98;
        if (s[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])t.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ep", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = r[n2].getBytes("ISO-8859-1");
            ep_0.s[n2] = ep_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ep_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A4A;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = u[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])w.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ep", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ep_0.v[n2] = n3;
        }
        return v[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ep" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ep_0.m(l, l2);
            object = y[n];
            try {
                if (!(object instanceof String)) break block2;
                ep_0.y[n] = clazz = Class.forName(z[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ep_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ep_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ep_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ep_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = y;
        y[0] = "x&JL[en&O\u0016HrymL\u0010Dfh*[\u0007\u000ftT";
        objectArray[1] = "1'BVlnD\u0007IY}!9\u001fZ^thQ";
        objectArray[2] = "VD!\u0003)\u0006VD6_%\tL\u000f6A%\u001cK~f\u001ct";
        objectArray[3] = "\u001fCX\u0010\u00121\u001fCOL\u001e>\u0005\bOR\u001e+\u0002y\u001b\nI";
        objectArray[4] = "c\u0003rVI0c\u0003e\nE?yHe\u0014E*~97O\u001d`";
        objectArray[5] = "S\u001a4z\u001a1S\u001a#&\u0016>IQ#8\u0016+N qcNj";
        objectArray[6] = "u<'}\u0013ec<\"'\u0000rtw!!\ffe066Gpa";
        objectArray[7] = "'ZZ\u0001&M,UKNE@9XD%pB(KX\tgO";
        objectArray[8] = "\u0000\u0015W\u007fD`\u0000\u0015@#Ho\u001a^@=Hz\u001d/\u0012g\u001f8";
        objectArray[9] = Integer.TYPE;
        ep_0.z[9] = "java/lang/Integer";
        objectArray[10] = "f=\u001a'#rp=\u001f}0egv\u001c{<qv1\u000blwfI";
        objectArray[11] = "c\u000f\u0013 \u0005|h\u0000\u0002odrc\u000b\u00065";
        objectArray[12] = "\u0012.\u0011T+.\u0019!\u0000\u001bV6\n&\tR";
        objectArray[13] = Boolean.TYPE;
        ep_0.z[13] = "java/lang/Boolean";
        objectArray[14] = "y:.-\"ao:+w1vxq(q=bi6?fvw(";
        objectArray[15] = "E,\u0000Tu 0\f\u000b[doQ\u0002\u0000P`5%";
        objectArray[16] = "Qc\u001c\u0010\bWGc\u0019J\u001b@P(\u001aL\u0017TAo\r[\\DG";
        objectArray[17] = "ZAy#\u000fm/ar,\u001e\"Noy'\u001ax:";
        objectArray[18] = "?b=\u000ezGJB6\u0001k\b+L=\noR_";
        objectArray[19] = "Q-\n\u0004!hZ\"\u001bKMkT \u0019\u0004a";
        objectArray[20] = "iO++HYiO<wDVs\u0004<iDCtuk6\u0012";
        objectArray[21] = "\rVWRcJxv\\]r\u0005\u0019xWVv_m";
        objectArray[22] = Void.TYPE;
        ep_0.z[22] = "java/lang/Void";
        objectArray[23] = "#SDnr\u0004#SS2~\u000b9\u0018S,~\u001e>i\u0001r&Z";
        objectArray[24] = "c\u001913\u001a\u0018u\u00194i\t\u000fbR7o\u0005\u001bs\u0015 xN\fV";
        objectArray[25] = "\u0017u\u0015\u0012\u0014~bU\u001e\u001d\u00051\u0003[\u0015\u0016\u0001kw";
        objectArray[26] = Float.TYPE;
        ep_0.z[26] = "java/lang/Float";
        objectArray[27] = "pY2\u0013\u001b\u0006fY7I\b\u0011q\u00124O\u0004\u0005`U#XO\u0015{";
        objectArray[28] = "Bh'}~k7H,ro$VF'yk~\"";
        objectArray[29] = Double.TYPE;
        ep_0.z[29] = "java/lang/Double";
        objectArray[30] = "[%8Y\u0018\"E-\"\u0016e2E";
        objectArray[31] = "aN9FlhaN.\u001a`g{\u0005.\u0004`r|t|^46";
        objectArray[32] = "f\u0013XIdPf\u0013O\u0015h_|XO\u000bhJ{)\u001d_9\u000b";
        objectArray[33] = "p\u0006:\u001db_p\u0006-AnPjM-_nEm<|\u00069\u0007";
        objectArray[34] = "?:Q^\u001aq):T\u0004\tf>qW\u0002\u0005r/6@\u0015Nb76B\u001e\u0014/\u000b-B\u0003\u0014h<:";
        objectArray[35] = "\u0004BW_{1\u0012BR\u0005h&\u0005\tQ\u0003d2\u0014NF\u0014/'6";
        objectArray[36] = "JnV\u0015F0?N]\u001aW\u007f^@V\u0011S%*";
        objectArray[37] = "^u,\u000b|[+U'\u0004m\u0014J[,\u000fiN>";
        objectArray[38] = "@@=eI/5`6jX`Tn=a\\: ";
        objectArray[39] = "\u0001C\u0015nv3\u0017C\u00104e$\u0000\b\u00132i0\u0011O\u0004%\"\"\f";
        objectArray[40] = "K[>uQ\b>{5z@G_u>qD\u001d+";
        objectArray[41] = "JPs\u0014/e?px\u001b>*^~s\u0010:p*";
        objectArray[42] = "&cd<\u001300caf\u0000''(b`\f36ouwG#\u0010";
        objectArray[43] = "92\\5;\u0013L\u0012W:*\\-\u001c\\1.\u0006Y";
        objectArray[44] = "\u007fm&${8\nM-+jwkC& n-\u001f";
        objectArray[45] = "\u001cx5s`KiX>|q\u0004\bV5wu^|";
        objectArray[46] = "LCYBKB9cRMZ\rXmYF^W,";
        objectArray[47] = "VVy\u0000f^#vr\u000fw\u0011Bxy\u0004sK6";
        objectArray[48] = "^*\r4en+\n\u0006;t!J\u0004\r0p{>";
        objectArray[49] = "bSS\u0014\u000b\u0012i\\B[c\u0012gSQ";
        objectArray[50] = "\u000eIm>d\u0000\u0018Ihdw\u0017\u000f\u0002kb{\u0003\u001eE|u0\u0012^";
        objectArray[51] = "y:DV\u0018?\f\u001aOY\tpm\u0014DR\r*\u0019";
        objectArray[52] = "g\u0019h=\u0000\u0015q\u0019mg\u0013\u0002fRna\u001f\u0016w\u0015yvT\u0001m";
        objectArray[53] = "3>\u0007\u000fmxF\u001e\f\u0000|7'\u0010\u0007\u000bxmS";
        objectArray[54] = "@\u0019_\u0001;RV\u0019Z[(EARY]$QP\u0015NJoF`";
        objectArray[55] = "`Iyy\n\u0013\u0015irv\u001b\\tgy}\u001f\u0006\u0000";
        objectArray[56] = "j+Gi\u0010I|+B3\u0003^k`A5\u000fJz'V\"D_?";
        objectArray[57] = "3(,o\u00067F\b'`\u0017x'\u0006,k\u0013\"S";
        objectArray[58] = "\u001bVi\u001f'(\rVlE4?\u001a\u001doC8+\u000bZxTs<<";
        objectArray[59] = "^p\u0000%\u00114+P\u000b*\u0000{J^\u0000!\u0004!>";
        objectArray[60] = "\u001c[K|\t\f\u0017TZ3j\u0001\u0002R";
        objectArray[61] = "Hd2BR\r^d7\u0018A\u001aI/4\u001eM\u000eXh#\t\u0006\u0019k";
        objectArray[62] = "QT\u000b\f,z$t\u0000\u0003=5Ez\u000b\b9o1";
        objectArray[63] = "\"/[e63\"/L9:<8dL':)?\u0015\u001d\u007fh";
        objectArray[64] = "T\u0011\u0011\u0001o?T\u0011\u0006]c0NZ\u0006Cc%I+V\u001a1d";
        objectArray[65] = "OZtx5R:z\u007fw$\u001d[tt| G/";
        objectArray[66] = "Ejy\u007f\u000eQSj|%\u001dFD!\u007f#\u0011RUfh4ZEn";
        objectArray[67] = ")17^7\u0014\\\u0011<Q&[=\u001f7Z\"\u0001I";
        objectArray[68] = "k\u0019@R>U\u001e9K]/\u001a\u007f7@V+@\u000b";
        objectArray[69] = ":MS\u007fH],MV%[J;\u0006U#W^*AB4\u001cI\u0013";
        objectArray[70] = "X~xb\u0013^-^sm\u0002\u0011LPxf\u0006K8";
        objectArray[71] = "1^\u0016\"[Ar\u0005Kh\"\u0017M\fJeK\u0000(KK \u001b\u0007M[I8PG=V@`_~";
        objectArray[72] = "(cB/a\u0005uqEo\u0005\u000epp_>RY.'\u0007R?\u0007ogD0j\u001a,y";
        objectArray[73] = "\u0000d\u0016Xf\u007f\u000f7\u0006FWti`\u0014\u0000>c\f'\u0015EndihG]h,\u0011dE\u00026\u001d";
        objectArray[74] = "9J{O@eeF&R}<0F|H\u0011\u000ec\u0003%\u0012}hb[#\u001e\u0005d`\u0004}/";
        objectArray[75] = "/Aa{\u001fuz\\\"e`rxZ\u007ff\f@+\u001e\">`x.A'|^(*\u001c\u007f\u0001Q(t\u0019.y]*+G\u001f";
        objectArray[76] = "\u0018[icR7\u001f\\-'#=\u007f\u00054#Z5B[kdB";
        objectArray[77] = "u\u0001BGQ/(\u0013E\u00075$-\u0012_VbssB\u0006:Y;)\u0005Z\u000bP4 \u0007";
        objectArray[78] = "v\u0002HRl\u0002,\u0002\u0011M\u0006\u0002\u0016RC\fo\u0016s\u0015BI?\u0011\u0016\u0005@QtQf\bI\t{h";
        objectArray[79] = "\"<E\bgqf4]\bV}\u001enIJ?dl4[\u0014(\u0014\"\"\t\u0013&fx0W\u0004V";
        objectArray[80] = "\u007f%\u0005C8\u001ax\"A\u0007I\u001e\u0018fPM*\u0000|p_Bt";
        objectArray[81] = "\u0002w\u0016F\u0012^WjUXmYUl\b[\u0001k\u0006)Q\u0001m\r\u0007qW\r\u0015\u0001\u0005.\t<";
        objectArray[82] = "Ya{\b\u0001l\u001dic\b0de6kFYw\u0000qj\u0003\tpe1c\u0007Oh\u000f59E\b\t";
        objectArray[83] = ")w'Uh\u0011u{zHUH { R9zv<}\nl-t7}R(O<7|\fn-";
        objectArray[84] = "Cj%ano\u001ex\"!\no\u0017h<{f]C)b-\n;Euc-r7G*=\u001c";
        objectArray[85] = "\u000e\\m@\u00101RP0]-h\u0007PjGAZT\u00141\u0018-6VJp\u0011Fj\u0006Sv ";
        objectArray[86] = "&s1oB\\;}x5-J\"u%=z\u0014y%|Q\u0016\\*z!lIK{b";
        objectArray[87] = "|wZr(\u0003 {\u0007o\u0015Zu{]uyh%;\u0002-\u0015Y%h]ue@'|\u0002\u0012";
        objectArray[88] = "bc$u8\u00178(!cm,1Y`\u007f8E%<'~}\u0015\"Y=ccLfeao>Q[";
        objectArray[89] = "\u001f8\"\u0001R;\u0010k2\u001fc3v< Y\n'\u0013{!\u001cZ v4s\u0004\\h\u000e8q[\u0002Y";
        objectArray[90] = "}Hn\u0010\u0013_9@v\u0010\"VA\u001f~^KD$X\u007f\u001b\u001bCA\u0017-\u0003\u001d\u000b9\u001b/\\C:";
        objectArray[91] = "|hRWC\u000e{o\u0016\u00132\u0015\u001b-\u0003YI\u0012$nX\u0004\u0003";
        objectArray[92] = ".(+\u0003tkpwl\u001b\u0013?Iv9Fz(,18\u0003*/I~j\u001b,g1rhDrV";
        objectArray[93] = "P^/{(\u0007\u0002G1i\u0010\n[A+fy\u0006bO+v}`\r\u0019.4!\u0018\u0001\u001bqj\u0010";
        objectArray[94] = "VB1/t8_[~.(\u0004\u0006+6!+m\u0011Nq n=\u0016+6$)f\f\u0017?=fgP+";
        objectArray[95] = "Cu\u001cn\u0017\u0005D-\u001e;_e\u0013\"\u001dR\u000e\b\u0007r\u001e=\u000f\u001e\u001b0f3\u0002\u0018@0\t2\u0014\u0004\u0002H";
        objectArray[96] = "$Q^\u0010w/![G\u001e\u0016!w\u0017G\u0007z\u0013'W\u001cP\u0016z~\u0016X\u0001|~$T\u001f`-x|\u0011\u0016\u000bq(e\u0017'";
        objectArray[97] = "7^\"h5\u001am^{w_\u0019W\u000e)66\u000e2I(sf\tWW,m=\u001a=\r,4\"p";
        objectArray[98] = "\u0000.\u0002\"D@\\,Y3z\u0013?-\u000fl\u0018\u0000\u0006j\r?@z";
        objectArray[99] = "th7\u0013ML;/rC/\u001a=m#\u001eTw{wt\u0018UN<u'@/F{quKWJy.+z";
        objectArray[100] = "z\u0000fUf_r\u001aa\u001e\u001aL\u000b_n\u0012s_n\u0018oW#X\u000bW=O%\u0010s[?\u0010{!";
        objectArray[101] = "\u0006vEI\u000e Sk\u0006Wq'Qm[T\u001d\u0015\u0001.\u0000\u0002q-\u0007v\u0003NO}\u0003+[3\u0010/A+C\\\u00119]i;";
        objectArray[102] = "\u001e/6D4\u0005Xa6u'5\u001ea%\u00056\r^$1\u0013M";
        objectArray[103] = "\f7 \"OO[g|62Of2-{[_\u0003u,>\u000bXf:~&\r\u0010\u001e6|yS!";
        objectArray[104] = "\u001fze\\3mJg&BLjHa{A X\u0018-#\u001bL>\u001a|$\u001742\u0018#z&";
        objectArray[105] = "%'5M\u0003^<%!\u0012dA.f\u0001Q\u001eO%uZ\u001d\u001cS*xaR[\u0016z\u001a";
        objectArray[106] = "V)\u001e Q\u001c\ny\u0007&`\u0012\u0000i\u0018=\f R$@k`L\u0015|\u001a:]\u0013\u0002-\u0002Z";
        objectArray[107] = "^bz3|I\u0003p}s\u0018B\u0006qg\"O\u0015Y-9Nw\u0017\u0000$~p'\u0013]|";
        objectArray[108] = "%\u0010_TLU$S]Q\u0010)r)\u001aB@@bL]C\u0005\u0010e)MA\u001d[%Y@HET\u001c";
        objectArray[109] = "M>IP\u0019f\u0018#\nNfa\u001a%WM\nSIa\u000b\u0015f?K?M\u001b\rc\u001b&K*";
        objectArray[110] = "U+?IZo\u00006|W%h\u00020!TIZTu|\u000f\u0015\rQv8CDfT|!M%";
        objectArray[111] = "8<[F^57oKXo>Q8Y\u001e\u0006)4\u007fX[V.QoZC\u001dn!bS\u001b\u0012W";
        objectArray[112] = "^l;'\bY\u000bqx9w^\tw%:\u001bl_5y`K;\u0005f8g\u000fT\u0004p$%w";
        objectArray[113] = "LL\"U.0M\u000f PrL\u0018ugC\"%\u000b\u0010 Bgu\fu0@\u007f>L\u0005=I'1u";
        objectArray[114] = "D`+h\u00067\u0000h3h7>x7;&^,\u001dp:c\u000e+x03gH3\u00124i%\u000fR";
        objectArray[115] = ";>@Xf5ln\u001cL\u001b2Q;M\u0001r%4|LD\"\"QlN\\ib!aG\u0004f[";
        objectArray[116] = "Q\u0017Y}g0\u0015\u001fA}V<m@I3?+\b\u0007Hvo,mH\u001anid\u0015D\u001817U";
        objectArray[117] = "2-4\na|5*pN\u0010~U-7Hj)),tJou";
        objectArray[118] = "q \u0003\u00014\u0018vd\u0004\u0004ut!\u001c^V3\u001d6y\u0019WvM1\u001c\u0006WrN0s\u0007An\fH";
        objectArray[119] = "3\u0018\u001fYrU6S\u000fV\u0011[Q\u001a\u0003\u0005xL4]\u0002@(KQM\u0000Xc\u000b!@\t\u0000l2";
        objectArray[120] = "\u00013gBg!Vc;V\u001a&k6j\u001bs1\u000eqk^#6k1bZe.\u000158\u0018\"O";
        objectArray[121] = "J8dW\u0002,\\7k\t}!0n8\b\u00146U)9MD10fkUByHji\n\u001cH";
        objectArray[122] = "\u0005\u001aN\u0006-\u0013\f\r\rV;rUqMQx\u001bB\u0014\nP=KEqMV~IU\u0010DA=\u0019Cq";
        objectArray[123] = "\u0004\u001d\u0015\r\u0014#^\u001dL\u0012~$dM\u001eS\u00177\u0001\n\u001f\u0016G0d\u0015\u001f\u0012D1\u000b\u0014\t\u000e\u0006I";
        objectArray[124] = "?\u001a)\u0004\u0014\n`G-X\u00011o$sQXXxA4P\u001d\b\u007f$s\u0001\u0000\n=HtE\u0007\u000f|$";
        objectArray[125] = ";$j{\u0002[>oztaQY&v'\bB<awbXEY.%z^\r!\"'%\u0000<";
        objectArray[126] = "mB\u0016\u000fu\u0012t\r\tZ\u001b\u0016`0R\u0002%\u0013t\t\u0015\u0000vK\u000eS\u001f\u001eq\u001fmJP\u0001$q";
        objectArray[127] = "{K&y%\fxA7|T\u0018nA,=\n\u001fn[(A5\u001bw\u001c=.4\rk^E";
        objectArray[128] = "NO8Ec2\b\u000eo\u0010#\\\u0012\u0013}\u001c|0 G<G*gw\u001fl\u0001!$\u0018\u001ez\u001dc\\\u0016\u0013|Fc3\u0017\u0005`\u0004\u001b";
        objectArray[129] = "\u000fNH,\rRZS\u000b2r^TDR:%\u000e\r\u0010\tV\u0011HZGXk\u0002RMK";
        Object[] objectArray2 = objectArray;
        objectArray[130] = "B*:\u0006oo\u0005\u007f?\u0014e\u0014\u0012\u0012:\u00146}\u0005w}\u0015s-\u0002\u0012=\u001cwk\u001ax9F5,{";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == '\u00c6' || c == 'e' || c == '\u00e5') {
                field = ep_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ep_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ep" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ep_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int d(Object[] objectArray) {
        int n;
        block5: {
            long l = (Long)objectArray[0];
            l = q ^ l;
            CallSite callSite = ep_0.d("\u00fb", (long)-641293083595383476L, (long)l);
            for (int i = 0; i <= ep_0.c("g", (int)194, (long)(0x1C445FBC0841AD8BL ^ l)); ++i) {
                int n2;
                block6: {
                    try {
                        try {
                            n = ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-643412271758296967L, (long)l), (long)-640717351260168408L, (long)l), (int)i, (long)-641728859573561490L, (long)l), (long)-641017919467699711L, (long)l) instanceof class_1743;
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)-642893594377747545L, (long)l);
                        }
                        if (n == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)-642893594377747545L, (long)l);
                    }
                    n2 = i;
                }
                return n2;
            }
            n = -1;
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d(Object[] objectArray) {
        Object object;
        block90: {
            long l;
            long l2;
            long l3;
            block102: {
                Object object2;
                CallSite callSite;
                long l4;
                block100: {
                    long l5;
                    block101: {
                        long l6;
                        class_1657 class_16572;
                        block98: {
                            block99: {
                                block91: {
                                    long l7;
                                    block92: {
                                        block97: {
                                            int n;
                                            long l8;
                                            long l9;
                                            long l10;
                                            block95: {
                                                Object object3;
                                                long l11;
                                                block93: {
                                                    long l12;
                                                    block94: {
                                                        block88: {
                                                            long l13;
                                                            block89: {
                                                                block86: {
                                                                    long l14;
                                                                    block87: {
                                                                        block84: {
                                                                            long l15;
                                                                            block85: {
                                                                                block82: {
                                                                                    block83: {
                                                                                        Object object4;
                                                                                        block81: {
                                                                                            long l16;
                                                                                            block79: {
                                                                                                block80: {
                                                                                                    block77: {
                                                                                                        long l17;
                                                                                                        block78: {
                                                                                                            class_310 class_3102;
                                                                                                            block76: {
                                                                                                                block74: {
                                                                                                                    block75: {
                                                                                                                        class_16572 = (class_1657)objectArray[0];
                                                                                                                        l3 = (Long)objectArray[1];
                                                                                                                        long l18 = l3 = q ^ l3;
                                                                                                                        l15 = l18 ^ 0x5A88899AB4A7L;
                                                                                                                        l14 = l18 ^ 0x7D6091FDA112L;
                                                                                                                        l2 = l18 ^ 0x19023CBACAB0L;
                                                                                                                        l11 = l18 ^ 0x6E1324520F5AL;
                                                                                                                        l4 = l18 ^ 0x1372BF47FB82L;
                                                                                                                        l13 = l18 ^ 0x7B95F5A5A54BL;
                                                                                                                        l = l18 ^ 0x7FFBA9BE9BCCL;
                                                                                                                        l10 = l18 ^ 0x363F7040B289L;
                                                                                                                        l9 = l18 ^ 0x36E82A1B93C6L;
                                                                                                                        l6 = l18 ^ 0x509BCE6EE80BL;
                                                                                                                        l12 = l18 ^ 0x1F963F788B75L;
                                                                                                                        l17 = l18 ^ 0x43EAF3C98DC2L;
                                                                                                                        l16 = l18 ^ 0x142E0C01B714L;
                                                                                                                        l7 = l18 ^ 0x1D895BF2B740L;
                                                                                                                        l5 = l18 ^ 0x41DA3E4774A2L;
                                                                                                                        l8 = l18 ^ 0x3547466B2732L;
                                                                                                                        callSite = ep_0.d("\u00fb", (long)-3083578267188199583L, (long)l3);
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                class_3102 = b;
                                                                                                                                if (callSite != null) break block74;
                                                                                                                                if (!(ep_0.d("$", (Object)ep_0.d("$", (Object)class_3102, (long)-3080632279614612908L, (long)l3), (long)-3094773850726562874L, (long)l3) > 2.0)) break block75;
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    class_3102 = b;
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (callSite != null) break block76;
                                                                                                                        if (ep_0.d("$", (Object)class_3102, (long)-3081008972947014280L, (long)l3) != null) return false;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                                    }
                                                                                                                    class_3102 = b;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    object4 = ep_0.d("\u00e1", (Object)class_3102, (long)-3082625353732176627L, (long)l3);
                                                                                                                    if (callSite != null) break block77;
                                                                                                                    if (object4 != false) break block78;
                                                                                                                    return false;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                                }
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                            }
                                                                                                        }
                                                                                                        Object[] objectArray2 = new Object[1];
                                                                                                        objectArray2[0] = l17;
                                                                                                        object4 = ep_0.d("\u00fb", (Object)objectArray2, (long)-3084389794092130954L, (long)l3);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite != null) break block79;
                                                                                                            if (object4 == false) break block80;
                                                                                                            return false;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                    }
                                                                                                }
                                                                                                object4 = ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-3080632279614612908L, (long)l3), (long)-3082420740913097866L, (long)l3);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (callSite != null) return (boolean)object4;
                                                                                                                if (object4 != false) break block81;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                            }
                                                                                                            Object[] objectArray3 = new Object[3];
                                                                                                            objectArray3[2] = l16;
                                                                                                            objectArray3[1] = (int)ep_0.c("g", (int)3840, (long)(0x5ECB957B71D00065L ^ l3));
                                                                                                            objectArray3[0] = 0;
                                                                                                            float f = (float)ep_0.d("\u00fb", (Object)objectArray3, (long)-3094543091619034888L, (long)l3) - ep_0.d("\u00e1", (Object)((Float)((Object)ep_0.d("\u00e1", (Object)this.c, (long)-3083340038719795034L, (long)l3))), (long)-3084239643041357529L, (long)l3);
                                                                                                            object4 = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                                                                                            if (callSite != null) return (boolean)object4;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                        }
                                                                                                        if (object4 > 0) break block81;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                    }
                                                                                                    Object[] objectArray4 = new Object[2];
                                                                                                    objectArray4[1] = l7;
                                                                                                    objectArray4[0] = this.g;
                                                                                                    object = ep_0.d("\u00e1", (Object)this.n, (Object)objectArray4, (long)-3081828163235685847L, (long)l3);
                                                                                                    if (callSite != null) break block82;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                                }
                                                                                                if (object != false) break block83;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                            }
                                                                                        }
                                                                                        object4 = false;
                                                                                        return (boolean)object4;
                                                                                    }
                                                                                    object = ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)-3083340038719795034L, (long)l3)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA082E04AABCBCL ^ l3)), (long)-3083392535394169690L, (long)l3);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite != null) break block84;
                                                                                        if (object != false) break block85;
                                                                                        return false;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                                }
                                                                            }
                                                                            Object[] objectArray5 = new Object[2];
                                                                            objectArray5[1] = l15;
                                                                            objectArray5[0] = ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)class_16572, (long)-3082541526043441262L, (long)l3), (long)-3082960670968243103L, (long)l3);
                                                                            object = ep_0.d("\u00e1", (Object)ep_0.d("e", (long)-3080950439731671988L, (long)l3), (Object)objectArray5, (long)-3082015420018460763L, (long)l3);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite != null) break block86;
                                                                                if (object == false) break block87;
                                                                                return false;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                        }
                                                                    }
                                                                    Object[] objectArray6 = new Object[2];
                                                                    objectArray6[1] = l14;
                                                                    objectArray6[0] = class_16572;
                                                                    object = ep_0.d("\u00e1", (Object)ep_0.d("e", (long)-3082321302105392091L, (long)l3), (Object)objectArray6, (long)-3084051463457010346L, (long)l3);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite != null) break block88;
                                                                        if (object != false) break block89;
                                                                        return false;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                }
                                                            }
                                                            Object[] objectArray7 = new Object[2];
                                                            objectArray7[1] = l13;
                                                            objectArray7[0] = class_16572;
                                                            object = ep_0.d("\u00e1", (Object)this, (Object)objectArray7, (long)-3084842011404037338L, (long)l3);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (callSite != null) return (boolean)object;
                                                                                if (object == false) break block90;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                            }
                                                                            object2 = ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-3080632279614612908L, (long)l3), (long)-3083223053263630204L, (long)l3), (long)-3082745654960201684L, (long)l3) instanceof class_1743;
                                                                            if (callSite != null) break block91;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                        }
                                                                        if (object2) break block92;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                    }
                                                                    object3 = this.m;
                                                                    if (callSite != null) break block93;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                                }
                                                                if (object3 == 0) break block94;
                                                                return false;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                        }
                                                    }
                                                    Object[] objectArray8 = new Object[1];
                                                    objectArray8[0] = l12;
                                                    object3 = ep_0.d("\u00e1", (Object)this, (Object)objectArray8, (long)-3084415528053327276L, (long)l3);
                                                }
                                                int n2 = object3;
                                                try {
                                                    block96: {
                                                        try {
                                                            try {
                                                                n = n2;
                                                                if (callSite != null) break block95;
                                                                if (n == -1 != 0) break block96;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                            }
                                                            Object[] objectArray9 = new Object[1];
                                                            objectArray9[0] = l10;
                                                            this.k = (int)ep_0.d("\u00fb", (Object)objectArray9, (long)-3083992757887815122L, (long)l3);
                                                            this.l = -1;
                                                            Object[] objectArray10 = new Object[2];
                                                            objectArray10[1] = l11;
                                                            objectArray10[0] = n2;
                                                            ep_0.d("\u00fb", (Object)objectArray10, (long)-3084518000987825422L, (long)l3);
                                                            this.m = true;
                                                            Object[] objectArray11 = new Object[1];
                                                            objectArray11[0] = l2;
                                                            ep_0.d("\u00e1", (Object)this.p, (Object)objectArray11, (long)-3083088704855806016L, (long)l3);
                                                            if (callSite == null) break block97;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                        }
                                                    }
                                                    n = ep_0.d("\u00e1", (Object)((Boolean)((Object)ep_0.d("\u00e1", (Object)this.e, (long)-3083340038719795034L, (long)l3))), (long)-3082117166262613469L, (long)l3);
                                                }
                                                catch (MatchException matchException) {
                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                }
                                            }
                                            try {
                                                if (callSite != null) return n != 0;
                                                if (n == false) break block97;
                                            }
                                            catch (MatchException matchException) {
                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                            }
                                            Object[] objectArray12 = new Object[1];
                                            objectArray12[0] = l9;
                                            CallSite callSite2 = ep_0.d("\u00e1", (Object)this, (Object)objectArray12, (long)-3082206817048564460L, (long)l3);
                                            try {
                                                try {
                                                    n = callSite2;
                                                    if (callSite != null) return n != 0;
                                                    if (n == -1) break block97;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                                }
                                                Object[] objectArray13 = new Object[1];
                                                objectArray13[0] = l10;
                                                this.k = (int)ep_0.d("\u00fb", (Object)objectArray13, (long)-3083992757887815122L, (long)l3);
                                                this.l = (int)callSite2;
                                                Object[] objectArray14 = new Object[3];
                                                objectArray14[2] = l8;
                                                objectArray14[1] = this.k;
                                                objectArray14[0] = (int)callSite2;
                                                ep_0.d("\u00fb", (Object)objectArray14, (long)-3083685348746839456L, (long)l3);
                                                this.m = true;
                                                Object[] objectArray15 = new Object[1];
                                                objectArray15[0] = l2;
                                                ep_0.d("\u00e1", (Object)this.p, (Object)objectArray15, (long)-3083088704855806016L, (long)l3);
                                            }
                                            catch (MatchException matchException) {
                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                            }
                                        }
                                        Object[] objectArray16 = new Object[1];
                                        objectArray16[0] = l2;
                                        ep_0.d("\u00e1", (Object)this.o, (Object)objectArray16, (long)-3083088704855806016L, (long)l3);
                                        Object[] objectArray17 = new Object[1];
                                        objectArray17[0] = l;
                                        ep_0.d("\u00e1", (Object)this.f, (Object)objectArray17, (long)-3080772522966169765L, (long)l3);
                                        return 0 != 0;
                                    }
                                    Object[] objectArray18 = new Object[2];
                                    objectArray18[1] = l7;
                                    objectArray18[0] = this.f;
                                    object2 = ep_0.d("\u00e1", (Object)this.o, (Object)objectArray18, (long)-3081828163235685847L, (long)l3);
                                }
                                try {
                                    try {
                                        if (callSite != null) break block98;
                                        if (object2) break block99;
                                        return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                                }
                            }
                            Object[] objectArray19 = new Object[2];
                            objectArray19[1] = l6;
                            objectArray19[0] = class_16572;
                            ep_0.d("\u00fb", (Object)objectArray19, (long)-3084812868352473879L, (long)l3);
                            object2 = ep_0.d("\u00e1", (Object)((Boolean)((Object)ep_0.d("\u00e1", (Object)this.d, (long)-3083340038719795034L, (long)l3))), (long)-3082117166262613469L, (long)l3);
                        }
                        try {
                            try {
                                if (callSite != null) break block100;
                                if (!object2) break block101;
                            }
                            catch (MatchException matchException) {
                                throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                            }
                            Object[] objectArray20 = new Object[2];
                            objectArray20[1] = l6;
                            objectArray20[0] = class_16572;
                            ep_0.d("\u00fb", (Object)objectArray20, (long)-3084812868352473879L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                        }
                    }
                    Object[] objectArray21 = new Object[1];
                    objectArray21[0] = l5;
                    object2 = ep_0.d("\u00e1", (Object)cb_0.a, (Object)objectArray21, (long)-3083732603967671180L, (long)l3);
                }
                try {
                    try {
                        if (callSite != null) return object2;
                        if (!object2) break block102;
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                    }
                    Object[] objectArray22 = new Object[5];
                    objectArray22[4] = l4;
                    objectArray22[3] = x_0.INFO;
                    objectArray22[2] = x;
                    objectArray22[1] = ep_0.b("t", (int)28353, (long)(0xC3EE319062776L ^ l3));
                    objectArray22[0] = ep_0.b("t", (int)7492, (long)(0x1C00F292855054F0L ^ l3));
                    ep_0.d("\u00e1", (Object)ep_0.d("e", (long)-3081683567571816100L, (long)l3), (Object)objectArray22, (long)-3081439064227005389L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)-3080817153042177654L, (long)l3);
                }
            }
            this.m = false;
            Object[] objectArray23 = new Object[1];
            objectArray23[0] = l2;
            ep_0.d("\u00e1", (Object)this.n, (Object)objectArray23, (long)-3083088704855806016L, (long)l3);
            Object[] objectArray24 = new Object[1];
            objectArray24[0] = l;
            ep_0.d("\u00e1", (Object)this.g, (Object)objectArray24, (long)-3080772522966169765L, (long)l3);
            return 1;
        }
        object = false;
        return (boolean)object;
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        ep_0.d("\u00e1", (Object)ep_0.d("e", (long)3250221999572876192L, (long)l), (Object)objectArray2, (long)3249959803959931756L, (long)l);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ep_0.d("\u00fb", (Object)((Object)q_0.Sword), (long)-2441036095388183301L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private boolean a(Object[] objectArray) {
        int n;
        block8: {
            block7: {
                class_1657 class_16572;
                long l;
                block6: {
                    class_1657 class_16573 = (class_1657)objectArray[0];
                    l = (Long)objectArray[1];
                    l = q ^ l;
                    CallSite callSite = ep_0.d("\u00fb", (long)-2799040677902748814L, (long)l);
                    try {
                        try {
                            class_16572 = class_16573;
                            if (callSite != null) break block6;
                            if (ep_0.d("\u00e1", (Object)class_16572, (long)-2797590113072608579L, (long)l) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)-2797404226733429351L, (long)l);
                        }
                        class_16572 = class_16573;
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)-2797404226733429351L, (long)l);
                    }
                }
                try {
                    if (ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)class_16572, (long)-2798136084313590522L, (long)l), (long)-2799900196892644289L, (long)l) != ep_0.d("e", (long)-2797890398588811653L, (long)l)) break block7;
                    n = 1;
                    break block8;
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)-2797404226733429351L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(aL aL2) {
        Object object;
        long l;
        long l2;
        block50: {
            int n;
            CallSite callSite;
            long l3;
            block49: {
                CallSite callSite2;
                CallSite callSite3;
                block48: {
                    long l4;
                    block46: {
                        class_1657 class_16572;
                        long l5;
                        block47: {
                            block44: {
                                long l6;
                                block45: {
                                    CallSite callSite4;
                                    long l7;
                                    block43: {
                                        class_310 class_3102;
                                        block41: {
                                            block42: {
                                                block40: {
                                                    block39: {
                                                        long l8 = l2 = q ^ 0x5242D7DA9F64L;
                                                        l7 = l8 ^ 0x1DFCA81A57B6L;
                                                        l6 = l8 ^ 0x3A14B07D4203L;
                                                        l4 = l8 ^ 0x58E21EF86864L;
                                                        l = l8 ^ 0x296705D2EC4BL;
                                                        l5 = l8 ^ 0x3CE1D425465AL;
                                                        l3 = l8 ^ 0x714B51C05198L;
                                                        callSite3 = ep_0.d("\u00fb", (long)3901712202312260720L, (long)l2);
                                                        try {
                                                            if (ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)3901386002318422967L, (long)l2)), (Object)ep_0.b("t", (int)10032, (long)(0x1B9DB67A792B8D97L ^ l2)), (long)3901473694433521591L, (long)l2) == false) {
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                        }
                                                        try {
                                                            try {
                                                                class_3102 = b;
                                                                if (callSite3 != null) break block39;
                                                                if (ep_0.d("$", (Object)class_3102, (long)3902044570637154832L, (long)l2) == null) return;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                            }
                                                            class_3102 = b;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block40;
                                                            if (ep_0.d("$", (Object)class_3102, (long)3904420618043612777L, (long)l2) != null) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                        }
                                                        class_3102 = b;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite3 != null) break block41;
                                                        if (ep_0.d("\u00e1", (Object)class_3102, (long)3902676831365408284L, (long)l2) != false) break block42;
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                                }
                                            }
                                            class_3102 = b;
                                        }
                                        CallSite callSite5 = ep_0.d("$", (Object)class_3102, (long)3902044570637154832L, (long)l2);
                                        try {
                                            try {
                                                callSite4 = callSite5;
                                                if (callSite3 != null) break block43;
                                                if (!(callSite4 instanceof class_1657)) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                            }
                                            callSite4 = callSite5;
                                        }
                                        catch (MatchException matchException) {
                                            throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                        }
                                    }
                                    class_16572 = (class_1657)callSite4;
                                    try {
                                        if (callSite3 != null) {
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                    }
                                    try {
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l7;
                                        objectArray[0] = ep_0.d("\u00e1", (Object)ep_0.d("\u00e1", (Object)class_16572, (long)3902892050710439043L, (long)l2), (long)3901903909608816496L, (long)l2);
                                        callSite2 = ep_0.d("\u00e1", (Object)ep_0.d("e", (long)3904344427815317341L, (long)l2), (Object)objectArray, (long)3903279722389640372L, (long)l2);
                                        if (callSite3 != null) break block44;
                                        if (callSite2 == false) break block45;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                                    }
                                }
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l6;
                                objectArray[0] = class_16572;
                                callSite2 = ep_0.d("\u00e1", (Object)ep_0.d("e", (long)3902406939029774132L, (long)l2), (Object)objectArray, (long)3900813253434928711L, (long)l2);
                            }
                            try {
                                if (callSite3 != null) break block46;
                                if (callSite2 != false) break block47;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                            }
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l5;
                        objectArray[0] = class_16572;
                        callSite2 = ep_0.d("\u00e1", (Object)this, (Object)objectArray, (long)3900460311166021687L, (long)l2);
                    }
                    try {
                        try {
                            if (callSite3 != null) break block48;
                            if (callSite2 == false) return;
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        callSite2 = ep_0.d("\u00e1", (Object)this, (Object)objectArray, (long)3900314224893516101L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                    }
                }
                callSite = callSite2;
                try {
                    try {
                        try {
                            object = callSite;
                            n = -1;
                            if (callSite3 != null) break block49;
                            if (object == n) return;
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                        }
                        object = this.k;
                        if (callSite3 != null) break block50;
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                    }
                    n = -1;
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
                }
            }
            try {
                if (object == n) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    this.k = (int)ep_0.d("\u00fb", (Object)objectArray, (long)3900736959642390847L, (long)l2);
                    this.l = -1;
                }
            }
            catch (MatchException matchException) {
                throw ep_0.d("\u00fb", (Object)matchException, (long)3904614741158216347L, (long)l2);
            }
            object = callSite;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = (int)object;
        ep_0.d("\u00fb", (Object)objectArray, (long)3900346303587187171L, (long)l2);
    }

    @bP
    public void a(bd_0 bd_02) {
        block60: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block58: {
                block59: {
                    class_310 class_3102;
                    block52: {
                        block51: {
                            block54: {
                                ep_0 ep_02;
                                block55: {
                                    int n;
                                    long l3;
                                    block56: {
                                        CallSite callSite3;
                                        long l4;
                                        block53: {
                                            Object object;
                                            long l5;
                                            block50: {
                                                block48: {
                                                    block49: {
                                                        long l6;
                                                        block46: {
                                                            block47: {
                                                                block44: {
                                                                    block45: {
                                                                        long l7 = l2 = q ^ 0x2FF0290F90D9L;
                                                                        l5 = l7 ^ 0x792C2C9C616EL;
                                                                        l3 = l7 ^ 0x54D5FB07E3F6L;
                                                                        l6 = l7 ^ 0x7490BAA81E8DL;
                                                                        l = l7 ^ 0x63E1386D45F4L;
                                                                        l4 = l7 ^ 0xF81993ECB9EL;
                                                                        callSite2 = ep_0.d("\u00fb", (long)4150303595846439885L, (long)l2);
                                                                        try {
                                                                            try {
                                                                                object = ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)4148764709370066680L, (long)l2), (long)4150988358103664320L, (long)l2);
                                                                                if (callSite2 != null) break block44;
                                                                                if (object != false) break block45;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                                            }
                                                                            this.k = -1;
                                                                            this.l = -1;
                                                                            this.m = 0;
                                                                            return;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                                        }
                                                                    }
                                                                    reference cfr_temp_0 = ep_0.d("$", (Object)ep_0.d("$", (Object)b, (long)4148764709370066680L, (long)l2), (long)4152632571585589098L, (long)l2) - 2.0;
                                                                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                }
                                                                try {
                                                                    if (callSite2 != null) break block46;
                                                                    if (object <= 0) break block47;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                                }
                                                                return;
                                                            }
                                                            object = this.m;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (callSite2 != null) break block48;
                                                                        if (object == false) break block49;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                                    }
                                                                    Object[] objectArray = new Object[2];
                                                                    objectArray[1] = l6;
                                                                    objectArray[0] = Float.valueOf((float)(ep_0.d("\u00e1", (Object)this.f, (Object)new Object[0], (long)4152204079220531327L, (long)l2) + 400.0f));
                                                                    object = ep_0.d("\u00e1", (Object)this.p, (Object)objectArray, (long)4148715277082819261L, (long)l2);
                                                                    if (callSite2 != null) break block48;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                                }
                                                                if (object == false) break block49;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                            }
                                                            this.m = 0;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                        }
                                                    }
                                                    object = this.k;
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block50;
                                                        if (object == -1) break block51;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                    }
                                                    object = this.m;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (object != false) break block51;
                                                                    class_3102 = b;
                                                                    if (callSite2 != null) break block52;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                                }
                                                                if (ep_0.d("$", (Object)class_3102, (long)4148435859834032596L, (long)l2) != null) break block51;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l5;
                                                            callSite3 = ep_0.d("\u00fb", (Object)objectArray, (long)4151809869140832730L, (long)l2);
                                                            if (callSite2 != null) break block53;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                        }
                                                        if (callSite3 != false) break block51;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                    }
                                                    ep_02 = this;
                                                    if (callSite2 != null) break block54;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                }
                                                callSite3 = ep_0.d("\u00e1", (Object)((Boolean)((Object)ep_0.d("\u00e1", (Object)ep_02.h, (long)4150625973350169610L, (long)l2))), (long)4149543699885155983L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                            }
                                        }
                                        try {
                                            block57: {
                                                try {
                                                    try {
                                                        try {
                                                            if (callSite3 == false) break block55;
                                                            n = this.l;
                                                            if (callSite2 != null) break block56;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                        }
                                                        if (n == -1) break block57;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                    }
                                                    Object[] objectArray = new Object[3];
                                                    objectArray[2] = l4;
                                                    objectArray[1] = this.k;
                                                    objectArray[0] = this.l;
                                                    ep_0.d("\u00fb", (Object)objectArray, (long)4150267467103196876L, (long)l2);
                                                    if (callSite2 == null) break block55;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                                }
                                            }
                                            n = this.k;
                                        }
                                        catch (MatchException matchException) {
                                            throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                                        }
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l3;
                                    objectArray[0] = n;
                                    ep_0.d("\u00fb", (Object)objectArray, (long)4151665740766213726L, (long)l2);
                                }
                                this.k = -1;
                                ep_02 = this;
                            }
                            ep_02.l = -1;
                        }
                        class_3102 = b;
                    }
                    try {
                        callSite = ep_0.d("$", (Object)class_3102, (long)4151093373622859181L, (long)l2);
                        if (callSite2 != null) break block58;
                        if (callSite != null) break block59;
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                    }
                    return;
                }
                callSite = ep_0.d("$", (Object)b, (long)4151093373622859181L, (long)l2);
            }
            try {
                Object object;
                try {
                    object = callSite instanceof class_1657;
                    if (callSite2 != null || !object) break block60;
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l;
                objectArray[0] = (class_1657)ep_0.d("$", (Object)b, (long)4151093373622859181L, (long)l2);
                object = ep_0.d("\u00e1", (Object)this, (Object)objectArray, (long)4150032444508990514L, (long)l2);
            }
            catch (MatchException matchException) {
                throw ep_0.d("\u00fb", (Object)matchException, (long)4148527575417244966L, (long)l2);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block34: {
            CallSite callSite3;
            long l2;
            block35: {
                CallSite callSite4;
                CallSite callSite5;
                long l3;
                block32: {
                    long l4;
                    block33: {
                        block31: {
                            CallSite callSite6;
                            block30: {
                                reference v1;
                                long l5;
                                block28: {
                                    block29: {
                                        l = (Long)objectArray[0];
                                        long l6 = l;
                                        l4 = l6 ^ 0x7EFB0FE19B86L;
                                        l3 = l6 ^ 0x4A729CB41116L;
                                        l5 = l6 ^ 0x2C3B49F35D85L;
                                        l2 = l6 ^ 0x5ABC792493CCL;
                                        callSite5 = ep_0.d("\u00fb", (long)-1179680882450119179L, (long)l);
                                        try {
                                            try {
                                                v1 = ep_0.d("\u00e1", (Object)((Boolean)((Object)ep_0.d("\u00e1", (Object)this.i, (long)-1179444981991855566L, (long)l))), (long)-1175970155569303369L, (long)l);
                                                if (callSite5 != null) break block28;
                                                if (v1 != false) break block29;
                                                return null;
                                            }
                                            catch (MatchException matchException) {
                                                throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                                        }
                                    }
                                    try {
                                        callSite6 = ep_0.d("$", (Object)b, (long)-1176733795837796160L, (long)l);
                                        if (callSite5 != null) break block30;
                                        reference v1 = ep_0.d("$", (Object)callSite6, (long)-1181873777120986798L, (long)l) - 2.0;
                                        v1 = v1 == 0 ? 0 : (v1 > 0 ? 1 : -1);
                                    }
                                    catch (MatchException matchException) {
                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                                    }
                                }
                                try {
                                    if (v1 > 0) {
                                        return null;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l5;
                                objectArray2[0] = Float.valueOf((float)ep_0.d("\u00e1", (Object)((Float)((Object)ep_0.d("\u00e1", (Object)this.j, (long)-1179444981991855566L, (long)l))), (long)-1178087156199220301L, (long)l));
                                callSite6 = ep_0.d("\u00fb", (Object)objectArray2, (long)-1175602666145025430L, (long)l);
                            }
                            callSite3 = callSite6;
                            try {
                                try {
                                    try {
                                        if (callSite3 == null) return null;
                                        reference cfr_temp_1 = ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-1176733795837796160L, (long)l), (Object)callSite3, (long)-1179928051603117596L, (long)l) - 3.0f;
                                        callSite4 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                        if (callSite5 != null) break block31;
                                    }
                                    catch (MatchException matchException) {
                                        throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                                    }
                                    if (callSite4 > 0) return null;
                                }
                                catch (MatchException matchException) {
                                    throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                                }
                                callSite4 = ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-1176733795837796160L, (long)l), (Object)callSite3, (long)-1176659061729717100L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite5 != null) break block32;
                                if (callSite4 != false) break block33;
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l4;
                    objectArray3[0] = callSite3;
                    callSite4 = ep_0.d("\u00e1", (Object)ep_0.d("e", (long)-1176171224133318991L, (long)l), (Object)objectArray3, (long)-1177906724468475966L, (long)l);
                }
                try {
                    if (callSite4 == false) {
                        return null;
                    }
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l3;
                objectArray4[0] = ep_0.d("\u00e1", (Object)callSite3, (long)-1176120086651692280L, (long)l);
                callSite2 = ep_0.d("\u00fb", (Object)objectArray4, (long)-1178128430883527970L, (long)l);
                CallSite callSite7 = ep_0.d("\u00fb", (float)(ep_0.d("\u00e1", (Object)callSite2, (Object)new Object[0], (long)-1178560670540644690L, (long)l) - ep_0.d("\u00e1", (Object)ep_0.d("$", (Object)b, (long)-1176733795837796160L, (long)l), (long)-1178400245671707804L, (long)l)), (long)-1181821739125278901L, (long)l);
                try {
                    try {
                        reference cfr_temp_2 = ep_0.d("\u00fb", (float)callSite7, (long)-1175826022687894077L, (long)l) - ep_0.d("\u00e1", (Object)((Float)((Object)ep_0.d("\u00e1", (Object)this.j, (long)-1179444981991855566L, (long)l))), (long)-1178087156199220301L, (long)l);
                        callSite = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                        if (callSite5 != null) break block34;
                        if (callSite <= 0) break block35;
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
                }
            }
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l2;
            objectArray5[0] = callSite3;
            callSite = ep_0.d("\u00e1", (Object)this, (Object)objectArray5, (long)-1175481453903594998L, (long)l);
        }
        try {
            if (callSite == false) return null;
            return callSite2;
        }
        catch (MatchException matchException) {
            throw ep_0.d("\u00fb", (Object)matchException, (long)-1176918874820338914L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (z[n3] != null) {
            return n3;
        }
        Object object = y[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 63;
            case 1 -> 5;
            case 2 -> 45;
            case 3 -> 7;
            case 4 -> 32;
            case 5 -> 34;
            case 6 -> 55;
            case 7 -> 30;
            case 8 -> 20;
            case 9 -> 47;
            case 10 -> 17;
            case 11 -> 48;
            case 12 -> 58;
            case 13 -> 42;
            case 14 -> 60;
            case 15 -> 46;
            case 16 -> 19;
            case 17 -> 39;
            case 18 -> 43;
            case 19 -> 44;
            case 20 -> 38;
            case 21 -> 3;
            case 22 -> 49;
            case 23 -> 37;
            case 24 -> 62;
            case 25 -> 21;
            case 26 -> 51;
            case 27 -> 4;
            case 28 -> 59;
            case 29 -> 24;
            case 30 -> 26;
            case 31 -> 29;
            case 32 -> 56;
            case 33 -> 18;
            case 34 -> 25;
            case 35 -> 54;
            case 36 -> 52;
            case 37 -> 1;
            case 38 -> 50;
            case 39 -> 41;
            case 40 -> 15;
            case 41 -> 27;
            case 42 -> 22;
            case 43 -> 2;
            case 44 -> 16;
            case 45 -> 57;
            case 46 -> 31;
            case 47 -> 35;
            case 48 -> 36;
            case 49 -> 10;
            case 50 -> 40;
            case 51 -> 28;
            case 52 -> 8;
            case 53 -> 23;
            case 54 -> 12;
            case 55 -> 0;
            case 56 -> 61;
            case 57 -> 14;
            case 58 -> 53;
            case 59 -> 13;
            case 60 -> 11;
            case 61 -> 6;
            case 62 -> 33;
            default -> 9;
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
        ep_0.z[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ep_0.m(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            String string = z[n];
            int n2 = string.indexOf(8);
            Class clazz = ep_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ep_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ep_0.g(clazz3, string2, clazz2)) != null) {
                    ep_0.y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ep_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ep_0.y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ep_0.n(779139513768602L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ep_0.m(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = z[n];
                int n3 = string2.indexOf(8);
                clazz3 = ep_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ep_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ep_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ep_0.y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ep_0.n(779139513768602L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ep_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ep_0.y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ep_0.n(779139513768602L, 0L);
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

    private boolean lambda$new$0(Boolean bl) {
        long l = q ^ 0x1CDC99118111L;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)2905331350025661890L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA01C46BE141D8L ^ l)), (long)2905278302731547074L, (long)l);
    }

    private boolean lambda$new$2(Boolean bl) {
        long l = q ^ 0x5C948371BB7L;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)-5550732249651775644L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA18D1BAC7DB7EL ^ l)), (long)-5550820488301761692L, (long)l);
    }

    private boolean lambda$new$1(Float f) {
        long l = q ^ 0x1EEE50C03D02L;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)-7763417087627472431L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA03F6A230FDCBL ^ l)), (long)-7763470132799140399L, (long)l);
    }

    private boolean lambda$new$3(Float f) {
        long l = q ^ 0x4645761931E9L;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)-7446255712359064262L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA5B5D84E9F120L ^ l)), (long)-7446203214254440134L, (long)l);
    }

    private boolean lambda$new$4(Float f) {
        long l = q ^ 0x45FF730EDE06L;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)8594722259338965717L, (long)l)), (Object)ep_0.b("t", (int)18647, (long)(0x1E2CE3D91BCD2311L ^ l)), (long)8594774757577715413L, (long)l);
    }

    private boolean lambda$new$5(Boolean bl) {
        long l = q ^ 0x58D77970E1D6L;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)5230521345983679749L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA45CF8B80211FL ^ l)), (long)5230609028649308421L, (long)l);
    }

    private boolean lambda$new$6(Boolean bl) {
        long l = q ^ 0x467B3643A0DBL;
        return (boolean)ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)692311756739431432L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA5B63C4B36012L ^ l)), (long)692364252687929352L, (long)l);
    }

    private boolean lambda$new$7(Float f) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = q ^ 0x3AB782983C7DL;
                    callSite = ep_0.d("\u00fb", (long)-7693060319041306775L, (long)l);
                    try {
                        try {
                            object = ep_0.d("\u00e1", (String)((Object)ep_0.d("\u00e1", (Object)this.a, (long)-7692736319145094994L, (long)l)), (Object)ep_0.b("t", (int)29965, (long)(0x3EAA27AF7068FCB4L ^ l)), (long)-7692788825893958482L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw ep_0.d("\u00fb", (Object)matchException, (long)-7694801705170378366L, (long)l);
                        }
                        object = ep_0.d("\u00e1", (Object)((Boolean)((Object)ep_0.d("\u00e1", (Object)this.i, (long)-7692736319145094994L, (long)l))), (long)-7696034640128456149L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw ep_0.d("\u00fb", (Object)matchException, (long)-7694801705170378366L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw ep_0.d("\u00fb", (Object)matchException, (long)-7694801705170378366L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ep_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ep_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ep_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


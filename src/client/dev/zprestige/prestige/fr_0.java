/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_239
 *  net.minecraft.class_2626
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dJ;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
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
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2626;
import net.minecraft.class_2885;
import net.minecraft.class_310;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fr
 */
public class fr_0
extends dV
implements dF {
    private dR a;
    private dM d;
    private dO c;
    private dO e;
    private dR f;
    private dQ g;
    private dR h;
    private dR i;
    private dP j;
    private dO k;
    private HashMap l;
    private HashMap m;
    private class_2338 n;
    private int o;
    private ArrayList p;
    private ArrayList q;
    private f5 r;
    private static boolean s;
    private static final long t;
    private static final long u;
    private static final String[] v;
    private static final String[] w;
    private static final Map x;
    private static final long[] y;
    private static final Integer[] z;
    private static final Map A;
    private static final Object[] B;
    private static final String[] C;

    public fr_0() {
        long l;
        long l2 = l = u ^ 0x762990A07AEFL;
        long l3 = l2 ^ 0xCD9F75F9441L;
        long l4 = l2 ^ 0x4EFE46A8398L;
        long l5 = l2 ^ 0x491523152552L;
        long l6 = l2 ^ 0x59A25EBBFF73L;
        this.l = new HashMap();
        this.m = new HashMap();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new f5(l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = l5;
        objectArray[0] = this::lambda$new$1;
        fr_0.d("\u00ed", (Object)this.f, (Object)objectArray, (long)8053112235602861484L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$2;
        fr_0.d("\u00ed", (Object)this.k, (Object)objectArray2, (long)8053257974016690678L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l6;
        objectArray3[0] = this::lambda$new$0;
        fr_0.d("\u00ed", (Object)this.d, (Object)objectArray3, (long)8065768426725842906L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            fr_0.u = hc.a(-9108645067535853431L, 8923494981698339414L, MethodHandles.lookup().lookupClass()).a(111533394387411L);
                            fr_0.B = new Object[213];
                            fr_0.C = new String[213];
                            fr_0.f();
                            fr_0.x = new HashMap<K, V>(13);
                            var18 = fr_0.u ^ 69095058882582L;
                            var20_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var18 >>> 56);
                            for (var21_2 = 1; var21_2 < 8; ++var21_2) {
                                v2 = v2;
                                v2[var21_2] = (byte)(var18 << var21_2 * 8 >>> 56);
                            }
                            var20_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var27_3 = new String[12];
                            var25_4 = 0;
                            var24_5 = "i\u00dc\u00f5\u00b4\u00f0\u00d0\u00ba\u00a8P%w\u00b8\u00ecn>\u00ba \u00a1\u00adO\u00e2\u0010j\u0081\u00b1\u0083#\u00f4\u00e0j\u00da\u00a6\u00d6u\u0002\u0016\u00a7Bsw\u00e7\u00b3\u00f1U\u00bd\u00ba\u0002\u001c\u00c3\u0010\u00c5d\u00e0\u00a6\u00f7\u00d1f\u00e0\u0098\u00d8M.\f\u0003\u00dd\u00ac\u00180\n[TP&\u00b0\u00d8\u00e4\u001ct\u00e7z\nG\u0093^@%W:\u00c1|\u0017\u0010\u00bf\u0082\u00b5\u00fc/\u00d8sry_b\b+|\u00dcN\u0010\u00d9\\C\u00fd\u00cd\u00bbj?\u00ef\u00e5'f\u0097\u00b0\u00a8\u00b1 \u00d9\u00c5\u00cf,\u008bz\u00db\u00c3\u00fa\u0092\u00d1cz\u0002\u00ef\u00c5Hi\u0090\u00bb\u00c3Sc-\u0097Hsn\u00db_\u00fc.\u0010\f\u00f4\u00d6\u00df\u0005\u00b0\r\u00e6}~\u0004\u00f7\u009aE\u001d'\u0010H\u00c9\u00dfXt\u0005\u0003N,\u001b\u00a2\u0018\u00bc\u009a\u0090\u0094\u0010%\u007f\r\u00a6\u0013c4r\u00c1m\u00ab\u0015\u00e4^\u009c\u009b";
                            var26_6 = "i\u00dc\u00f5\u00b4\u00f0\u00d0\u00ba\u00a8P%w\u00b8\u00ecn>\u00ba \u00a1\u00adO\u00e2\u0010j\u0081\u00b1\u0083#\u00f4\u00e0j\u00da\u00a6\u00d6u\u0002\u0016\u00a7Bsw\u00e7\u00b3\u00f1U\u00bd\u00ba\u0002\u001c\u00c3\u0010\u00c5d\u00e0\u00a6\u00f7\u00d1f\u00e0\u0098\u00d8M.\f\u0003\u00dd\u00ac\u00180\n[TP&\u00b0\u00d8\u00e4\u001ct\u00e7z\nG\u0093^@%W:\u00c1|\u0017\u0010\u00bf\u0082\u00b5\u00fc/\u00d8sry_b\b+|\u00dcN\u0010\u00d9\\C\u00fd\u00cd\u00bbj?\u00ef\u00e5'f\u0097\u00b0\u00a8\u00b1 \u00d9\u00c5\u00cf,\u008bz\u00db\u00c3\u00fa\u0092\u00d1cz\u0002\u00ef\u00c5Hi\u0090\u00bb\u00c3Sc-\u0097Hsn\u00db_\u00fc.\u0010\f\u00f4\u00d6\u00df\u0005\u00b0\r\u00e6}~\u0004\u00f7\u009aE\u001d'\u0010H\u00c9\u00dfXt\u0005\u0003N,\u001b\u00a2\u0018\u00bc\u009a\u0090\u0094\u0010%\u007f\r\u00a6\u0013c4r\u00c1m\u00ab\u0015\u00e4^\u009c\u009b".length();
                            var23_7 = 16;
                            var22_8 = -1;
lbl32:
                            // 2 sources

                            while (true) {
                                v3 = ++var22_8;
                                v4 = var24_5.substring(v3, v3 + var23_7);
                                v5 = -1;
                                break block15;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                var27_3[var25_4++] = fr_0.b(var28_9).intern();
                                if ((var22_8 += var23_7) < var26_6) {
                                    var23_7 = var24_5.charAt(var22_8);
                                    ** continue;
                                }
                                var24_5 = "\u00a6R\u00e9\u0085\u0091\u009d\u0007v\u00d1\u0004jn^>/\u00fe\u0018\u00d7A\u0014\u00edKL\u0088\u0002o\u0095\u0012;\u009e\u00a7\u00b3\u00d4\u0006\u00b9\u00e0d\u00dc\u00e1\u00b1f";
                                var26_6 = "\u00a6R\u00e9\u0085\u0091\u009d\u0007v\u00d1\u0004jn^>/\u00fe\u0018\u00d7A\u0014\u00edKL\u0088\u0002o\u0095\u0012;\u009e\u00a7\u00b3\u00d4\u0006\u00b9\u00e0d\u00dc\u00e1\u00b1f".length();
                                var23_7 = 16;
                                var22_8 = -1;
lbl46:
                                // 2 sources

                                while (true) {
                                    v6 = ++var22_8;
                                    v4 = var24_5.substring(v6, v6 + var23_7);
                                    v5 = 0;
                                    break block15;
                                    break;
                                }
                                break;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var27_3[var25_4++] = fr_0.b(var28_9).intern();
                                if ((var22_8 += var23_7) < var26_6) {
                                    var23_7 = var24_5.charAt(var22_8);
                                    ** continue;
                                }
                                break block16;
                                break;
                            }
                        }
                        var28_9 = var20_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                    fr_0.v = var27_3;
                    fr_0.w = new String[12];
                    fr_0.A = new HashMap<K, V>(13);
                    var7_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var18 >>> 56);
                    for (var8_11 = 1; var8_11 < 8; ++var8_11) {
                        v9 = v9;
                        v9[var8_11] = (byte)(var18 << var8_11 * 8 >>> 56);
                    }
                    var7_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                    var13_12 = new long[3];
                    var10_13 = 0;
                    var11_14 = "\u00dcX!\u00be\u00f4;\u0095\u00f3\u00ad\u00d9\r\u00fa \u00dc]\u00d1\u00a6\u00d5\u008f\u00ac\u00ab\u0010Mx";
                    var12_15 = "\u00dcX!\u00be\u00f4;\u0095\u00f3\u00ad\u00d9\r\u00fa \u00dc]\u00d1\u00a6\u00d5\u008f\u00ac\u00ab\u0010Mx".length();
                    var9_16 = 0;
                    while (true) {
                        break block17;
                        break;
                    }
lbl94:
                    // 1 sources

                    while (true) {
                        var13_12[v10] = ((long)var17_19[0] & 255L) << 56 | ((long)var17_19[1] & 255L) << 48 | ((long)var17_19[2] & 255L) << 40 | ((long)var17_19[3] & 255L) << 32 | ((long)var17_19[4] & 255L) << 24 | ((long)var17_19[5] & 255L) << 16 | ((long)var17_19[6] & 255L) << 8 | (long)var17_19[7] & 255L;
                        if (var9_16 < var12_15) ** continue;
                        break block18;
                        break;
                    }
                }
                var14_17 = var11_14.substring(var9_16, var9_16 += 8).getBytes("ISO-8859-1");
                v10 = var10_13++;
                var15_18 = ((long)var14_17[0] & 255L) << 56 | ((long)var14_17[1] & 255L) << 48 | ((long)var14_17[2] & 255L) << 40 | ((long)var14_17[3] & 255L) << 32 | ((long)var14_17[4] & 255L) << 24 | ((long)var14_17[5] & 255L) << 16 | ((long)var14_17[6] & 255L) << 8 | (long)var14_17[7] & 255L;
                var17_19 = var7_10.doFinal(new byte[]{(byte)(var15_18 >>> 56), (byte)(var15_18 >>> 48), (byte)(var15_18 >>> 40), (byte)(var15_18 >>> 32), (byte)(var15_18 >>> 24), (byte)(var15_18 >>> 16), (byte)(var15_18 >>> 8), (byte)var15_18});
                ** while (true)
            }
            fr_0.y = var13_12;
            fr_0.z = new Integer[3];
            var2_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v11 = SecretKeyFactory.getInstance("DES");
            v12 = new byte[8];
            v13 = v12;
            v12[0] = (byte)(var18 >>> 56);
            for (var3_21 = 1; var3_21 < 8; ++var3_21) {
                v13 = v13;
                v13[var3_21] = (byte)(var18 << var3_21 * 8 >>> 56);
            }
            break block19;
lbl126:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_20.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
        var4_23 = 5899955316364193605L;
        var6_24 = var2_20.doFinal(new byte[]{(byte)(var4_23 >>> 56), (byte)(var4_23 >>> 48), (byte)(var4_23 >>> 40), (byte)(var4_23 >>> 32), (byte)(var4_23 >>> 24), (byte)(var4_23 >>> 16), (byte)(var4_23 >>> 8), (byte)var4_23});
        ** while (true)
        fr_0.t = var0_22 = ((long)var6_24[0] & 255L) << 56 | ((long)var6_24[1] & 255L) << 48 | ((long)var6_24[2] & 255L) << 40 | ((long)var6_24[3] & 255L) << 32 | ((long)var6_24[4] & 255L) << 24 | ((long)var6_24[5] & 255L) << 16 | ((long)var6_24[6] & 255L) << 8 | (long)var6_24[7] & 255L;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)3982113506847376243L, (long)l), (Object)objectArray2, (long)3982918650290470956L, (long)l);
        fr_0.d("\u00ed", (Object)this.l, (long)3986111942037814994L, (long)l);
        fr_0.d("\u00ed", (Object)this.m, (long)3986111942037814994L, (long)l);
        fr_0.d("\u00ed", (Object)this.p, (long)3984284212817803765L, (long)l);
        this.n = null;
        this.o = 0;
        s = 0;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fr_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6757;
        if (w[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])x.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    x.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = v[n2].getBytes("ISO-8859-1");
            fr_0.w[n2] = fr_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return w[n2];
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x125A;
        if (z[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = y[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])A.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fr_0.z[n2] = n3;
        }
        return z[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fr_0.c(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/fr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fr_0.m(l, l2);
            object = B[n];
            try {
                if (!(object instanceof String)) break block2;
                fr_0.B[n] = clazz = Class.forName(C[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fr_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fr_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fr_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fr_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = B;
        B[0] = "Dt\t\u0013\u0011gDt\u001eO\u001dh^?\u001eQ\u001d}YNJ\tJ";
        objectArray[1] = Double.TYPE;
        fr_0.C[1] = "java/lang/Double";
        objectArray[2] = "\u0019\fCZXL\u000f\fF\u0000K[\u0018GE\u0006GO\t\u0000R\u0011\f]5";
        objectArray[3] = "\"\u0018W4_%W8\\;Nj* O<G#B";
        objectArray[4] = "p\u001fTdy\u001dp\u001fC8u\u0012jTC&u\u0007m%\u0012x L";
        objectArray[5] = "\u0001'\u0018\bs^\u0001'\u000fT\u007fQ\u001bl\u000fJ\u007fD\u001c\u001d]\u0011'\u0005";
        objectArray[6] = "yS\\2\u001c}ySKn\u0010rc\u0018Kp\u0010gdi\u001b-A";
        objectArray[7] = "\u0018rLoUL\u000erI5F[\u00199J3JO\b~]$\u0001ZI";
        objectArray[8] = "\u0007;\r\u0006Wsr\u001b\u0006\tF<\u0013\u0015\r\u0002Bfg";
        objectArray[9] = Boolean.TYPE;
        fr_0.C[9] = "java/lang/Boolean";
        objectArray[10] = "n\u007fE7\u0017$x\u007f@m\u00043o4Ck\b'~sT|C2x";
        objectArray[11] = "!c\n\u0018I#*l\u001bW*.?a\u0014<\u001f,.r\b\u0010\b!";
        objectArray[12] = "O\u0002\u000e:#ZO\u0002\u0019f/UUI\u0019x/@R8H&z\u0005";
        objectArray[13] = "\u00102&\u001f s\u000e:<PFg\t;\u001d\u001f~";
        objectArray[14] = "Ou:\u0012q=Dz+]\u00103Oq/\u0007";
        objectArray[15] = "8#\t\u0016Ur.#\fLFe9h\u000fJJq(/\u0018]\u0001c3";
        objectArray[16] = "\u000b,D!i\u0000~\fO.xO\u001f\u0002D%|\u0015k";
        objectArray[17] = Integer.TYPE;
        fr_0.C[17] = "java/lang/Integer";
        objectArray[18] = "1=/d[J:2>+<H/9>`\u0007";
        objectArray[19] = "]r7\u00027JKr2X$]\\91^(IM~&Ic^s";
        objectArray[20] = "!U;u'=Tu0z6r5{;q2(A";
        objectArray[21] = "/{qn\u0006a1sk!{q1";
        objectArray[22] = "X-]c$\u0013F%G,C\u0012W>Jve\u0014";
        objectArray[23] = "\\T4^;NJT1\u0004(Y]\u001f2\u0002$MLX%\u0015oZi";
        objectArray[24] = "EW\u000fcn\u00120w\u0004l\u007f]Qy\u000fg{\u0007%";
        objectArray[25] = Void.TYPE;
        fr_0.C[25] = "java/lang/Void";
        objectArray[26] = "cmr!\u0002yumw{\u0011nb&t}\u001dzsacjVhF";
        objectArray[27] = "i>sAo+\u001c\u001exN~d}\u0010sEz>\t";
        objectArray[28] = ";_lB/S-_i\u0018<D:\u0014j\u001e0P+S}\t{@3S\u007f\u0002!\r\u000fH\u007f\u001f!J8_";
        objectArray[29] = "\u0005\u0011fEdn\u0005\u0011q\u0019ha\u001fZq\u0007ht\u0018+ X:?";
        objectArray[30] = "bm)\u000bR\u0017bm>W^\u0018x&>I^\r\u007fWo\u0011\f";
        objectArray[31] = "&,Zr*5-#K=W->$Bt";
        objectArray[32] = "HSg}Z8=slrKw\\}gyO-(";
        objectArray[33] = "\u0006SmW%ZssfX4\u0015\u0012}mS0Of";
        objectArray[34] = "\u0002\u0017c\f-U\u001c\u001fyCBR\u001a\u0017l!jS\u001c";
        objectArray[35] = "Ej'S%:Ne6\u001cI9@g4Se";
        objectArray[36] = "\u0011i<\u0005\u0010w\u0007i9_\u0003`\u0010\":Y\u000ft\u0001e-NDd\u0007";
        objectArray[37] = "\u0001\u0007w?Iht'|0X'\u0015)w;\\}a";
        objectArray[38] = "7b\"6m*!b'l~=6)$jr)'n3}9>\u0018";
        objectArray[39] = "H:/bF;=\u001a$mWt\\\u0014/fS.(";
        objectArray[40] = Float.TYPE;
        fr_0.C[40] = "java/lang/Float";
        objectArray[41] = "\u007f\u0014wi%u\n4|f4:k:wm0`\u001f";
        objectArray[42] = "u_qBeS~P`\r\rSp_s";
        objectArray[43] = "/\roXLo9\rj\u0002_x.Fi\u0004Sl?\u0001~\u0013\u0018|$";
        objectArray[44] = "v\u0017m^EH\u00037fQT\u0007b9mZP]\u0016";
        objectArray[45] = "\u0015D\u0011Ly&\u0003D\u0014\u0016j1\u0014\u000f\u0017\u0010f%\u0005H\u0000\u0007-5I";
        objectArray[46] = "e;\u0012\u0005O\u0000\u0010\u001b\u0019\n^Oq\u0015\u0012\u0001Z\u0015\u0005";
        objectArray[47] = "JAc\"'\u0010JAt~+\u001fP\nt`+\nW{!?r";
        objectArray[48] = "@>DHi\u000b@>S\u0014e\u0004ZuS\ne\u0011]\u0004\u0002P<R";
        objectArray[49] = "4@}\"8\u001b4@j~4\u0014.\u000bj`4\u0001)z=?b";
        objectArray[50] = "us7L^Ek{-\u0003\u0016Eqq5D\u001f^1B3H\u0014Y|s5H";
        objectArray[51] = "V\f*!\u0016?V\f=}\u001a0LG=c\u001a%K6l<Lb";
        objectArray[52] = "\u0000\u001c\n&\u001f-u<\u0001)\u000eb\u00142\n\"\n8`";
        objectArray[53] = "\u000fg(1\u0015\u0002\u0011o2~]\u0002\u000be*9T\u0019KD7\u0016N\u0019\u0006r7?U";
        objectArray[54] = "eIq\"\b\u0001sItx\u001b\u0016d\u0002w~\u0017\u0002uE`i\\\u00124";
        objectArray[55] = "7%u\u001c\u001b-B\u0005~\u0013\nb#\u000bu\u0018\u000e8W";
        objectArray[56] = "7k +c<BK+$rs#E /v)W";
        objectArray[57] = "\u0014Vu\u0019\u007fJav~\u0016n\u0005\u0000xu\u001dj_t";
        objectArray[58] = "bX\u0000;.MbX\u0017g\"Bx\u0013\u0017y\"W\u007fbG,u\u0011";
        objectArray[59] = "\u0000h\u0014\u0005N\n\u0000h\u0003YB\u0005\u001a#\u0003GB\u0010\u001dRR\u0018\u0016S";
        objectArray[60] = "/a'2+kZA,=:$;O'6>~O";
        objectArray[61] = "6cH\u0017z\u00176c_Kv\u0018,(_Uv\r+Y\u000e\n.";
        objectArray[62] = "\u001d<(\u0017G\r\u000b<-MT\u001a\u001cw.KX\u000e\r09\\\u0013\u0019=";
        objectArray[63] = "r\u001fP\\XW\u0007?[SI\u0018f1PXMB\u0012";
        objectArray[64] = "35\u0014\u0003m\u0005F\u0015\u001f\f|J'\u001b\u0014\u0007x\u0010S";
        objectArray[65] = "@T3w\u0000\u007f@T$+\fpZ\u001f$5\fe]nuo_ ";
        objectArray[66] = "3[6Y|-%[3\u0003o:2\u00100\u0005c.#W'\u0012(?0";
        objectArray[67] = "\n\n.Z\u0011B\u007f*%U\u0000\r\u001e$.^\u0004Wj";
        objectArray[68] = "\u001c\u0007\u0007~Ay\u001c\u0007\u0010\"Mv\u0006L\u0010<Mc\u0001=Ae\u0015&";
        objectArray[69] = "\tO1u\u0014\t|o:z\u0005F\u001da1q\u0001\u001ci";
        objectArray[70] = "\u0002\u0003BnD;w#IaUt\u0016-BjQ.b";
        objectArray[71] = "R\u0002\u001b\u001d@<D\u0002\u001eGS+SI\u001dA_?B\u000e\nV\u0014(d";
        objectArray[72] = "Fw\n\u0002KN3W\u0001\rZ\u0001RY\n\u0006^[&";
        objectArray[73] = "\u0014\ti\ng{\u0002\tlPtl\u0015BoVxx\u0004\u0005xA3o?";
        objectArray[74] = "\u000fD:\u0011J|zd1\u001e[3\u001bj:\u0015_io";
        objectArray[75] = "bRkDOftRn\u001e\\qc\u0019m\u0018Per^z\u000f\u001brK";
        objectArray[76] = "b|a\u0015&`\u0017\\j\u001a7/vRa\u00113u\u0002";
        objectArray[77] = "d\u001eNeb\u0013\u0011>Ejs\\p0Naw\u0006\u0004";
        objectArray[78] = "sU\b;\u000f1\u0006u\u00034\u001e~g{\b?\u001a$\u0013";
        objectArray[79] = "E\u0011Cj9\u001d[\u0019Y%q\u001dA\u0013Abx\u0006\u00016@et\u001cF\u001f[";
        objectArray[80] = "\u007f:iEeDi:l\u001fvS~qo\u0019zGo6x\u000e1P\\";
        objectArray[81] = "x&XY<>\r\u0006SV-ql\bX])+\u0018";
        objectArray[82] = "z]A=w?\u000f}J2fpnsA9b*\u001a";
        objectArray[83] = "1Sp|8{/[j3Zg(F";
        objectArray[84] = "\u001c;\u0003mrTi\u001b\bbc\u001b\b\u0015\u0003igA|";
        objectArray[85] = "A\u0014z`OIW\u0014\u007f:\\^@_|<PJQ\u0018k+\u001b]f";
        objectArray[86] = "^Z15\r*+z::\u001ceJt11\u0018?>";
        objectArray[87] = "\u0006\u0000$D\u001cKs /K\r\u0004\u0012.$@\t^f";
        objectArray[88] = "CE\u001cL`xUE\u0019\u0016soB\u000e\u001a\u0010\u007f{SI\r\u00074k\u0010";
        objectArray[89] = "HV31dj=v8>u%\\x35q\u007f(";
        objectArray[90] = " -\rBS\u0006U\r\u0006MBI4\u0003\rFF\u0013@";
        objectArray[91] = "b\u000e]\u0010Vcb\u000eJLZlxEJRZy\u007f4\u001a\u000b\b8";
        objectArray[92] = "<%S\u0003`UI\u0005X\fq\u001a(\u000bS\u0007u@\\";
        objectArray[93] = "\u007f2l&a-\n\u0012g)pbk\u001cl\"t8\u001f";
        objectArray[94] = "\u007f\u0002]8^oi\u0002XbMx~I[dAlo\u000eLs\n~|";
        objectArray[95] = "\u000e\u0013\u0000m\u0003p{3\u000bb\u0012?\u001a=\u0000i\u0016en";
        objectArray[96] = "J%\t\u0014c-?\u0005\u0002\u001brb^\u000b\t\u0010v8*";
        objectArray[97] = "6;\t8X&6;\u001edT),p\u001ezT<+\u0001L!\fv";
        objectArray[98] = "#8fI\u0016\u0017#8q\u0015\u001a\u00189sq\u000b\u001a\r>\u0002 _CK";
        objectArray[99] = "S\u0012=0]\tS\u0012*lQ\u0006IY*rQ\u0013N(x,\u0006X";
        objectArray[100] = "u4a]3.u4v\u0001?!o\u007fv\u001f?4h\u000e$Knu";
        objectArray[101] = "#.qSoX5.t\t|O\"ew\u000fp[3\"`\u0018;J/";
        objectArray[102] = "\u0011\u0016\t`\u0013\u001fd6\u0002o\u0002P\u00058\td\u0006\nq";
        objectArray[103] = "iEi60\blFg*\u0000W\u0000\u0012z*9\u0003nJ{hg\t\u0000\u0015o$|Vi\u0010t){8";
        objectArray[104] = "/@XA\u000e&~\u0017\u0012^iu\u0015A\u0012JP'{\u0019\u0013\b\u000e-\u0015\u0018\u0006A\u0006srF\u001aV\f\u001c";
        objectArray[105] = "PeYD7}\u001cd\u0001\u0019Kw\u00060E\u00027q ;t\u00150q\u0007)=N7&\b-Z\u001e:~\u001aU\u0004\u001dzb\u0000i\u0007\u0015rv\u000fU\f\u0003qu\u00192\\\u000e)ga";
        objectArray[106] = "8luOx|tm-\u0012\u0004rd \u0011Ex'`$v\u0015u\u007fr\\ \b>tq;p\u0005ff\t";
        objectArray[107] = "_\u0002g~0QO\u000e'}\\\n0Plne[^\bm,;Q0\txe3\u000fWWdr9`";
        objectArray[108] = "Kt]\"\u0004J\u0011d]R]\u001aWo\n>oI\u00126PR\u0006\u0013Ws\u0003;\u0003\bZtm";
        objectArray[109] = "6\u001e/y?\f<\u0010&q\u0002\nWE8a;R9\u001d9#eXWE%-a\u0019l\u0005*z\u007fi";
        objectArray[110] = "eG)\u000e\u007f$7\u0015vO\u0010\"kQ(W|\u0010:\u0013u\r GbG(\\b){R4\f\u0010";
        objectArray[111] = "\u0019D*SM\u0013C[.\u0004!\u001e\u0004C?\nZ2\u0012X1\u0014L8\u0014E;nE\t\u0001\u0003:\u000e\u001f\u0016\u0005TVPE\u000f\u0001P?U^\u0002\u0006>";
        objectArray[112] = "\u0004?'\u000bFzH>\u007fV:xX~\u0018]F\u001b[?'OC{\u00051/]:";
        objectArray[113] = "\u0006VqaS>XXys*$\u0005\u0003r`G\u001f\u0006fg'L?\u0013\u0016,{VghXqbV0\u0001]joQ^";
        objectArray[114] = "\u001e\u0004yt~0O\u000e~p\u00103I\u0003$||\u0001\u0015Bz'\u0010&KO*kpl\u0018\u0011$\u001b";
        objectArray[115] = "\b\\l\u0013E>Z\u000e3R*8\u0006JmJF\nR\u00072\u0012\u0012]\u0019K4SV3\u0017F`I*d\u0007\bn]\u0011$\b_p-";
        objectArray[116] = "$\u0013xr%Jf\u001cc!{*tq<3h\u0013&\u001fd2*M,q<||Sf\ru:\"Txq";
        objectArray[117] = "4\u001apWH\u00061\u0019~Kx_]McKA\r3\u0015b\t\u001f\u0007]MvI\u0004\u000bc\u0012hR\b\b]";
        objectArray[118] = "%l>1e~<fv!\u0000q$m;*a|8\u000bv?:s;l&2baC5#?|t*082{\u001a";
        objectArray[119] = "\u0013\u0019LOVM\u0016\u001aBSf\u0014zN_S_F\u0014\u0016^\u0011\u0001LzMU\u001c\t\u0013\u001c\u001c_\u001b\r}";
        objectArray[120] = "Yr\b%\"E\u00053N?\u007f \t\u000eI%0\u0019[`\u0011$rGQ\u000eN0>\\\u000egK+3[`";
        objectArray[121] = "<\u0000H=\u0006$:\u001dH{\u000eJll\u0014uLs>\u0002Lt\u000e-4l\u0014h[s=\u0002\u0012u[55l";
        objectArray[122] = "\u0005\u00029iYBWPf(6D\u000b\u001480Zv_P`i\u0007!\f\u0018)jJG\u0016\u0010466K\u0016\u0019e+PQ\u001e\u00049W\\Q\u0017U$1FY\n\tX4\\@X\u0007;f\u000e\u001f\u0019h";
        objectArray[123] = "40;`=\u0014<80d-/d]rr3\u001663*sqH<]rn1Lqfzf:Ha]";
        objectArray[124] = "iw\u0006-\u000b\u001c%v^pw\u00185=\r{wL$}\u000bn\u0010\u001c)%\u0019\u0016F\u0001b.\u001aq\u0016\f:<b/O\u0002<9\u0018w\b\u000225b'\u000bG1?\u0005w\u0006\u001f#G";
        objectArray[125] = "0Y$Q{|m\u000fnG~Dcc'Po}2\r\u007fQ-#8c Ea8g\n%^l?\t";
        objectArray[126] = "e<:2eG!%xa\u0005\u001a\u001dn{\"<Es6z`bO\u001din,y\u0010tlu!~~";
        objectArray[127] = "m\u0004`PwAy\u001chS\u000b\u0014\u0014Lm\u000fb\u0005s\u001c`Wp}";
        objectArray[128] = "}ud}\u001cJ'ed\rE\u001aan3awM!>n= Iyr(cILb\u007f/\r";
        objectArray[129] = "S\u0004!\u001eiuV\u0007/\u0002Y/:S2\u0002`~T\u000b3@>t:T'\f%+SQ<\u0001\"E";
        objectArray[130] = "~h0\\\u0006Q=w1G\u0005=.\u000egK\u000f\u0004|`?JMZv\u000e`^\u0001A)geE\fFG";
        objectArray[131] = "\u000bxI?/zJ|]kLkw?@vu:\u0019gA4+0w}\f8 e\u0014a\u0001at\u0001";
        objectArray[132] = "\u0010\u000fJV09B]\u0015\u0017_?\u001e\u0019K\u000f3\rJ]\u0011VcZ\u0019\u0015ZU#<\u0003\u001dG\t_";
        objectArray[133] = ",7c#\fb5=+3io&<\u001a`\u0015<#(}0\u0018d1P$5\u0015z$9!.\u0018}J";
        objectArray[134] = "#47S4migi]Dh>'gZ(Zie=\u0005x\ri :R*k8*=VD";
        objectArray[135] = "vAt9)*'\u0016>&NzLC&&' #\u0010?&v\u0010";
        objectArray[136] = "o)p6\u0005f>#w2ke8.->\u0007Wei}hk;5c.+\u0019rn *Y";
        objectArray[137] = ":V\u001aR\u007f\u000b8\u0018\r\u0011N\u0006g\u0004\fA\u0019Q9WU-wV`\u0010\u0013Q>\u0010>\u0017\r";
        objectArray[138] = "9\u0007sl\u0010H;Id/!EdUe\u007fv\u0012;\b>\u0013^Qg\u0005e,\\B>]";
        objectArray[139] = "\u0006ez2+t^f,+hJVZ,*'s\u00044t+e-\u000eZ,=;,D6o\":7GZ";
        objectArray[140] = "Vo\u0017\u0019J!\u000elA\u0000\t\u001f\u0001PA\u0001F&T>\u0019\u0000\u0004x^P\u0018\u0015Mp\u00007F\tZzo";
        objectArray[141] = "`JugN\fbI6rCa7T`sC6d\u00055'/X&M}vBZ%\u000eh{";
        objectArray[142] = "\u001as{jo]\u00036r8\u0011Mxlza{\u001e\u001dfths";
        objectArray[143] = "pdA\u000f8@0%\u000f\u0017#2,5C\u0017'^\u001ea\u0007N|\u0002I2O\u0006}N/(G\u001b!2";
        objectArray[144] = "\u0012H\n^[>W\u0013\u0007\u001e5'/H\u0012U\fuA\u0010\u0013\u0017R\u007f/\u0011\u0006^Z!HO\u001aIPN";
        objectArray[145] = "\"9\u000eVGJx)\u000e&\u001e\u001a>\"YJ,L|~\u0003\u001a{\f\u007f~RB\u0018\u0010r'\u0006&";
        objectArray[146] = "\u0002`2|1?Zcder\u0001W_dd=8\u00001<e\u007ff\n_cq3}U6fj>z;";
        objectArray[147] = "A#!Z\u0015 \u001b3!*Lp]8vF~ \u001e`.*MwA4cDTb]d\u0011\u0013E#B(*SJt\\X";
        objectArray[148] = "\u0007D-NBl\u000bW4\u0019}f\u0004L4(L|SU0O\u001cq\u000bGH";
        objectArray[149] = "O|t\f\rj\u0017\u007f\"\u0015NT\u001bC\"\u0014\u0001mM-z\u0015C3GC{\u0000\n;\u0019$%\u001c\u001d1v";
        objectArray[150] = "\\;3\u0017z\u0001\u001cz}\u000fas\u0000j1\u000fe\u001f2>uV<Nem=\u001e?\u000f\u0003w5\u0003cs";
        objectArray[151] = "Zq=>V]Q4?p-\u0001Wq\u001aiI\u001d\\\r.p\\]Mk4xA\u00011";
        objectArray[152] = "}k\u000b%j!4-U\"t]!8\u0011<v1\u0013lRc!aD1\u0007<}/*(\u0012 -]";
        objectArray[153] = ";\u001a\u0007c_!\"_\u000e1!8Y][aH!g\u0005X7Qb";
        objectArray[154] = "\u0016~>\u001bE\u0003W69\u0015BjJ\"!\u0004@\u0006xvd_\u001f[/,7\u0005\u0019\u0005L~eZXj";
        objectArray[155] = "0W:<'\fqS.hD\u001eL\u00103u}L\"H27#FL\u0017&{8\u0019%\u0012=v?w";
        objectArray[156] = "&w\u001f8\u00112.q@7YCv\u001e\u001f#\u001bz$pG\"Y$.\u001e\u001f8X*/l\u0017>\t n\u001e";
        objectArray[157] = "PJ{v26\nZ{\u0006kfLQ,jY5\b\u000ez\u00067uY\u000f-~~a_\rs\u0006";
        objectArray[158] = "\u0019Cv70S\u0000VjgBX\u0010Uv<.jD\u0011,aBY\u0017Iz),@\u0002U*[{QCJf`;^\u0014T\u0016";
        objectArray[159] = "hj4\u001dk;xft\u001e\u0007d\u00078?\r>1i`>O`;\u0007zsCkndf~\u001a?\n";
        objectArray[160] = " \u0017=!pO0\u001b}\"\u001c\u0013OE61%E!\u001d7s{OO\u0007z\u007fp\u001a,\u001bw&$~";
        objectArray[161] = "\f\\0\u0002X&RR8\u0010!!\fle\u0001\u001b/\u001a\u000b5\fC=b\u0002d\u0019^?\u0002\\j\u0011LF";
        objectArray[162] = "\u0002\u0000W\u00129XZ\u0003\u0001\u000bzfQ?\u0001\n5_\u0000QY\u000bw\u0001\n?X\u001e>\tTX\u0006\u0002)\u0003;";
        objectArray[163] = "\u0011\u001e18'\u0014\u0013\u001dr-*yE\u00184!\"\u0002(P5r/\u0001O\u00008*=y\u0016\u000554(\u0010\u0013\u001e83F";
        objectArray[164] = "\tkV$o\u0007Ej\u000ey\u0013\tU'ue_\u000bV2O{of\t'\bvk\u0001Y*Pd\u0013WDa[gt\u0007I9I\u001f\"\u001a\u00022Jxr\u0017Z 2";
        objectArray[165] = "\f\u000b4'\u0002\\V\u001b4W[\f\u0010\u0010c;i[WK=g>X\u0000Ng'\u0005\u0018\u000f\u0019yW";
        objectArray[166] = "3\u0006-v\u001f\u001b1\u0015t.{A!\u0000/,\u0017s|Awr{G&\u001dq$\u0018\u0015tB0K\u000bK|\u0012?+A\u0018\"\u001cOu\u001fX0\u0012&p\u0004U7|";
        objectArray[167] = "PkyV7\u001aR%n\u0015\u0006\u0017\r9oEQ@Sn7)f\u0002\\$7\u0014<\u0012\\";
        objectArray[168] = "&E{,\u0012(c\u001evl|1\u001bEc'Ecu\u001dbe\u001bi\u001bBv)\u00006rGm$\u0007X";
        objectArray[169] = ".^\u001e^\u0017_$P\u0017V*^O\u0005\tF\u0013\u0001!]\b\u0004M\u000bO\u0005\u0014\nIJtE\u001b]W:";
        objectArray[170] = ";{\nc)Z>x\u0004\u007f\u0019\u0003R,\u0019\u007f Q<t\u0018=~[R\u007f\u0018|$\u00164e\u0010axj";
        objectArray[171] = "\u0005\b*VO\u0015\u000eM(\u00184V\u0007\u0010.\u0005sFn\u001e#\u0019\tT\b\u0004+\u0004U(\u0005\b*VO\u0015\u000eM(\u00184";
        objectArray[172] = "q~\u00103w)$i\u0013#Oq\u001d:\u000e(v#sb\u000fj()\u001d=\u001b&3vt8\u0000+4\u0018";
        objectArray[173] = "N-CZ08LcT\u0019\u00015\u0013\u007fUIVbM/\f%pc\rk[Ja'\u001d`";
        objectArray[174] = "\u0017\u0010B\u0014N~\u001b\u0003[Cqr\u0010\u0013a\u001f\u0001nyVC\u000e\r|\u0010SX\u0003\n\u0012";
        objectArray[175] = "\u00126\u0004\u0007\u0007\u0010PjU\n|AC:[\u0017+\u0015\u0019n\u0002A|\u0015YjP\u0015\u001aDSmT";
        objectArray[176] = "t\u007f\u000b@\u0015R&-T\u0001zTzi\n\u0019\u0016f.-RNF1t\u007f\u000b@\u0015R&-T\u0001z";
        objectArray[177] = "u\u0017~^u30Ls\u001e\u001b)H\u0017fU\"x&Og\u0017|rH\u0010s[g-!\u0015hV`C";
        objectArray[178] = "\u0006\u0007\u0016|i3\u0003\u0004\u0018`YnoP\u0005``8\u0001\b\u0004\">2oW\u0010n%m\u0006R\u000bc\"\u0003";
        objectArray[179] = "!$I\t>mcx\u0018\u0004E<p(\u0016\u0019\u0012k)}IKEhjx\u001d\u001b#9`\u007f\u0019";
        objectArray[180] = "O0\u0011!p\u0007\r;F;,~\u001fA\u0011*:GM/I+x\u0019GA\u00111y\u0017F3\u00197(\u001d\u0007A";
        objectArray[181] = "/\u001a\u0002h-#+Z\u0007jJx/\u0006\rk#t\u0016\b\r{'\u0012v\u0005\u0015z${s\u001e\u0018}J";
        objectArray[182] = "Yq7h|\"\u0004'}~y\u001a\tK4ih#[%lh*}QK3|ff\u000e\"6gka`";
        objectArray[183] = "#4K\u0003<Fb|L\r;/\u007fhT\u001c9CM<\u0011Gf\u001f\u001auGL0_z?\u0014\u0012>/";
        objectArray[184] = "\\\u001c~n\u001a\u0006E\u00166~\u007f\t^\u0016nf\u007f\u0002_\u0002hs\u0018\\C\u0015b\u001c";
        objectArray[185] = "\br^xJy\u0011x\u0016h/g\u0003p@tB\u001d_i\u001dcWz\u000fdEq/#\ni[dF&\u0011d\\\n";
        objectArray[186] = "h7]\u00048\u0002/o\u0003\u000e\u0001\u0019W?\u0017\u00128@9g\u0016PfJWf\u0003\u0019n\u001408\u001f\u000ed{";
        objectArray[187] = "\u0000uH\nWNZjL];C\u001dr]S@.Us\u000e^CI\u0005~VL;\u0010\u0000sHYR\u0015\u001b~O7";
        objectArray[188] = "\u0011&\th=1B$\u0015it\u000eMw\t4(b\u007f#Jkp1(y\u001f5qaK+Mj0\u000e";
        objectArray[189] = "8r\u001bBbvypC\u001b1\u001ad`XKgvV4\u001e\u0016<!\u00014\u0018W<h>g\u001aK=!\u0001";
        objectArray[190] = "d*fbe1v=hx\u0000\"\u001ah(`9st0)\"gy\u001a53rl:t,&n<H";
        objectArray[191] = "\u001d\f\\XF\u001b]M\u0012@]iA]^@Y\u0005s\t\u001a\u0019\u0000U$ZRQ\u0003\u0015B@ZL_i";
        objectArray[192] = "5\b\u0010!uSq\u0011Rr\u0015\tMZQ1,Q#\u0002Psr[M]D?i\u0004$X_2nj";
        objectArray[193] = "\"G{r}\u0011e\u001f%xD\u0001\u001dFyq}\u0019sH2k\u007fh-O'/5\u0006#\u0004=-D";
        objectArray[194] = "~`Iu8q,2\u00164W\u007fdwA/,\u0012,v\u0012\"/u|{J0W,yvT%>)b{SK";
        objectArray[195] = "e{\u0005\u000eN2''T\u00035c4wZ\u001eb4m#\u0001K57.'Q\u001cSf$ U";
        objectArray[196] = "tDH\u0012\u001dE=PN\u0010C=(W]L\u001cQ\u001a\u0005\u0010\u0014J=vZ\u0010O\tO?\u0001SK{";
        objectArray[197] = "\u0017\u0007Le=]I\tDwD\\\u0005ZRs8Z\u00037Fb![F[Jq8\fy";
        objectArray[198] = "s)$o<\u0013!l#elp Qvq Iq?.pb\u0017{Q+j2\u001c8?2\u007f.LJ";
        objectArray[199] = "\u007f,o\u0011\u0006\r>.7HUa#>,\u0018\u0003\r\u0011jjEX_Fj/\u0000\u0014\u0000+h,C\u0001\rF";
        objectArray[200] = "\u0005`kz`'_pk\n9w\u0019{<f\u000b$]'d\ned\f%=r,p\n'c\n";
        objectArray[201] = "#=+s\nE!.r+n\u001f1;))\u0002-l|svn\u00196&w!\rKdy6N\u001e\u0015l)9.TF2'I";
        objectArray[202] = "HH\u0001[Cg\n\u0014PV86\u0019D^Koa@\u0014\u0006\u001f8b\u0003\u0014UI^3\t\u0013Q";
        objectArray[203] = "\nal8\u0019yUxr-N\u0010]p`.OG\t*4v\u001a\u0010\bq<)QbA*\u007f-";
        objectArray[204] = "Q\u0017\u0016t\u0004\"\u0012\b\u0017o\u0007N\u0001qAc\rwS\u001f\u0019bO)Yq\u0003/C\"\f\u0012\u001f\"\u001avh";
        objectArray[205] = "`\u0004`#/i)Q1cf\r0kb-%4b\u0005:,gjhkb3lr!\u000f+f=2hk";
        objectArray[206] = "(s\u0001D\"-1yITG(2y\u0002_;.4\u0014\u0016N\"/qx\u001a];xN";
        objectArray[207] = "i<\u0013k<J6\"\bg?t1$\u000emh\b7\"cyy\u00116g\u000fuj\baX";
        objectArray[208] = "\r6AtMV\u000b(_  \b\u00155Wg~\u000f\u0015/S\u001b[[M>ZxGV\u0014j>";
        objectArray[209] = ".kJ^ t7a\u0002NEj%iTR(Q&\fA\u0015#q3|\nI9)H2WP9~!7L]>\u0010";
        objectArray[210] = "D*[ z[\b+\u0003}\u0006Q\u0011wVa\u0006Z\u0010cPta\u0004\ftZ\u001b";
        objectArray[211] = "cM1:|m0O-;5R?\u001c1fi>\rHr9>jZHqxv*(\b06n1Z";
        Object[] objectArray2 = objectArray;
        objectArray[212] = ",\u0019\b\n}8w\u0013\\\u00022\u0006p\u000eO\u0018+jBZ\u000eC}=\u0015\u0018\u000eD bv\u0004\u0003\u001dt\u0006n^\u000f\u0014(erSV@L";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fr_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'c' || c == '\u00f6' || c == '\u00ef' || c == 'A') {
                field = fr_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'c' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fr_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static boolean d(Object[] objectArray) {
        return s;
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)3251621615027771664L, (long)l), (Object)objectArray2, (long)3252449352892907150L, (long)l);
    }

    @bP
    public void a(a9 a92) {
        long l = u ^ 0x51FACA01C689L;
        long l2 = l ^ 0x3760269AB4B3L;
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            if (fr_0.d("\u00c2", (Object)objectArray, (long)-3196389387788836737L, (long)l) != false) {
                fr_0.d("\u00ed", (Object)a92, (Object)new Object[0], (long)-3197553825706318824L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fr_0.d("\u00c2", (Object)matchException, (long)-3203670214534729802L, (long)l);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bg_0 bg_02) {
        CallSite callSite;
        class_2626 class_26262;
        long l;
        block12: {
            CallSite callSite2;
            CallSite callSite3;
            block11: {
                l = u ^ 0x1345E03B8D3CL;
                CallSite callSite4 = fr_0.d("\u00ed", (Object)bg_02, (Object)new Object[0], (long)-7482607562869468686L, (long)l);
                callSite3 = fr_0.d("\u00c2", (long)-7480873307412518597L, (long)l);
                try {
                    try {
                        callSite2 = callSite4;
                        if (callSite3 != null) break block11;
                        if (!(callSite2 instanceof class_2626)) return;
                    }
                    catch (MatchException matchException) {
                        throw fr_0.d("\u00c2", (Object)matchException, (long)-7476252085523962877L, (long)l);
                    }
                    callSite2 = callSite4;
                }
                catch (MatchException matchException) {
                    throw fr_0.d("\u00c2", (Object)matchException, (long)-7476252085523962877L, (long)l);
                }
            }
            class_26262 = (class_2626)callSite2;
            try {
                try {
                    callSite = fr_0.d("\u00ed", (Object)class_26262, (long)-7484221305065382445L, (long)l);
                    if (callSite3 != null) break block12;
                    if (callSite == null) return;
                }
                catch (MatchException matchException) {
                    throw fr_0.d("\u00c2", (Object)matchException, (long)-7476252085523962877L, (long)l);
                }
                callSite = fr_0.d("\u00ed", (Object)class_26262, (long)-7484221305065382445L, (long)l);
            }
            catch (MatchException matchException) {
                throw fr_0.d("\u00c2", (Object)matchException, (long)-7476252085523962877L, (long)l);
            }
        }
        try {
            if (fr_0.d("\u00ed", (Object)callSite, (long)-7480810051754730418L, (long)l) == fr_0.d("\u00ef", (long)-7483703078646899787L, (long)l)) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw fr_0.d("\u00c2", (Object)matchException, (long)-7476252085523962877L, (long)l);
        }
        fr_0.d("\u00ed", (Object)this.q, (Object)fr_0.d("\u00ed", (Object)class_26262, (long)-7482193140598245888L, (long)l), (long)-7484631553884067235L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        void var43_26;
        class_2338 class_23382;
        long l;
        long l2;
        long l3;
        block143: {
            Object object;
            CallSite callSite;
            CallSite callSite2;
            long l4;
            block144: {
                CallSite callSite3;
                block145: {
                    void v72;
                    CallSite callSite4;
                    class_2338 class_23383;
                    CallSite callSite5;
                    long l5;
                    long l6;
                    block125: {
                        CallSite callSite6;
                        CallSite callSite7;
                        long l7;
                        long l8;
                        long l9;
                        long l10;
                        long l11;
                        long l12;
                        long l13;
                        long l14;
                        long l15;
                        long l16;
                        long l17;
                        block118: {
                            block119: {
                                CallSite callSite8;
                                long l18;
                                block121: {
                                    block120: {
                                        block116: {
                                            block117: {
                                                block114: {
                                                    long l19;
                                                    block115: {
                                                        class_310 class_3102;
                                                        block113: {
                                                            CallSite callSite9;
                                                            block111: {
                                                                block112: {
                                                                    l3 = (Long)objectArray[0];
                                                                    long l20 = l3;
                                                                    l17 = l20 ^ 0x4D6B5F93A658L;
                                                                    l2 = l20 ^ 0x1A99A2A6F024L;
                                                                    l = l20 ^ 0x7C6037A2A158L;
                                                                    l16 = l20 ^ 0x24011C3221C4L;
                                                                    l18 = l20 ^ 0x741122B52DE7L;
                                                                    l15 = l20 ^ 0x23D15DA5FF0EL;
                                                                    l14 = l20 ^ 0x6A372CEC5E83L;
                                                                    l13 = l20 ^ 0x14F5A88C0443L;
                                                                    l12 = l20 ^ 0xB6A87586E7L;
                                                                    l11 = l20 ^ 0x449CCBE402BEL;
                                                                    l19 = l20 ^ 0x1E12C5EE8DD4L;
                                                                    l6 = l20 ^ 0x67CB372F24A5L;
                                                                    l5 = l20 ^ 0x7C64BD1022D1L;
                                                                    l10 = l20 ^ 0x5E9623A6193FL;
                                                                    l9 = l20 ^ 0x5C9A0C609185L;
                                                                    l4 = l20 ^ 0x34807C242354L;
                                                                    l8 = l20 ^ 0x6756F4112EEAL;
                                                                    l7 = l20 ^ 0x1E3006AA8C57L;
                                                                    callSite3 = fr_0.d("\u00c2", (long)-1182009590132777331L, (long)l3);
                                                                    try {
                                                                        try {
                                                                            callSite9 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-1180181661060457553L, (long)l3), (Object)new Object[0], (long)-1180569976957583207L, (long)l3);
                                                                            if (callSite3 != null) break block111;
                                                                            if (callSite9 == false) break block112;
                                                                            return null;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                        }
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                    }
                                                                }
                                                                callSite9 = fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.a, (long)-1178071127506899904L, (long)l3)), (Object)fr_0.b("h", (int)5816, (long)(0x972E76F8E3F1E5CL ^ l3)), (long)-1179203778180171845L, (long)l3);
                                                            }
                                                            try {
                                                                if (callSite9 == false) {
                                                                    return null;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                            }
                                                            try {
                                                                try {
                                                                    class_3102 = b;
                                                                    if (callSite3 != null) break block113;
                                                                    if (fr_0.d("c", (Object)class_3102, (long)-1183874598526686483L, (long)l3) != null) return null;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                }
                                                                class_3102 = b;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                callSite7 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)class_3102, (long)-1184249019492223316L, (long)l3), (long)-1179281366307666913L, (long)l3);
                                                                if (callSite3 != null) break block114;
                                                                if (callSite7 == false) break block115;
                                                                return null;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                        }
                                                    }
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[1] = l19;
                                                    objectArray2[0] = this.g;
                                                    callSite7 = fr_0.d("\u00ed", (Object)this.r, (Object)objectArray2, (long)-1182981123227504562L, (long)l3);
                                                }
                                                try {
                                                    try {
                                                        if (callSite3 != null) break block116;
                                                        if (callSite7 != false) break block117;
                                                        return null;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                }
                                            }
                                            callSite7 = fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.h, (long)-1178071127506899904L, (long)l3)), (Object)fr_0.b("h", (int)20862, (long)(0x16CB47EE517DD990L ^ l3)), (long)-1182322582892395010L, (long)l3);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (callSite3 != null) break block118;
                                                    if (callSite7 == false) break block119;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                }
                                                if (fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.i, (long)-1178071127506899904L, (long)l3)), (Object)fr_0.b("h", (int)28605, (long)(0x72A9708737FD6758L ^ l3)), (long)-1182322582892395010L, (long)l3) == false) break block120;
                                            }
                                            catch (MatchException matchException) {
                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                            }
                                            callSite8 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-1186266970516356961L, (long)l3), (long)-1181235762922442977L, (long)l3);
                                            break block121;
                                        }
                                        catch (MatchException matchException) {
                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                        }
                                    }
                                    callSite8 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-1185612844062097084L, (long)l3), (long)-1181235762922442977L, (long)l3);
                                }
                                try {
                                    try {
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l18;
                                        objectArray3[0] = callSite8;
                                        callSite7 = fr_0.d("\u00c2", (Object)objectArray3, (long)-1178019463109397608L, (long)l3);
                                        if (callSite3 != null) break block118;
                                        if (callSite7 != false) break block119;
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                }
                            }
                            callSite7 = fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.i, (long)-1178071127506899904L, (long)l3)), (Object)fr_0.b("h", (int)28605, (long)(0x72A9708737FD6758L ^ l3)), (long)-1182322582892395010L, (long)l3);
                        }
                        try {
                            callSite6 = callSite7 != false ? fr_0.d("\u00ef", (long)-1186266970516356961L, (long)l3) : fr_0.d("\u00ef", (long)-1185612844062097084L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                        }
                        callSite2 = callSite6;
                        fr_0.d("\u00ed", (Object)this.p, (long)-1182356207838404311L, (long)l3);
                        Object[] objectArray4 = new Object[3];
                        objectArray4[2] = l11;
                        objectArray4[1] = fr_0::lambda$calculate$7;
                        objectArray4[0] = (int)fr_0.c("b", (int)18321, (long)(0x715776EFDF473A70L ^ l3));
                        callSite5 = fr_0.d("\u00ed", (Object)fr_0.d("\u00c2", (Object)objectArray4, (long)-1178750253433836561L, (long)l3), (long)-1185994588914877534L, (long)l3);
                        while (fr_0.d("\u00ed", (Object)callSite5, (long)-1183628403993931610L, (long)l3) != false) {
                            block123: {
                                class_2338 class_23384;
                                block122: {
                                    class_23384 = (class_2338)fr_0.d("\u00ed", (Object)callSite5, (long)-1180976095343565156L, (long)l3);
                                    try {
                                        CallSite callSite10;
                                        try {
                                            Object[] objectArray5 = new Object[1];
                                            objectArray5[0] = l16;
                                            reference cfr_temp_0 = fr_0.d("\u00ed", (Object)fr_0.d("\u00c2", (Object)objectArray5, (long)-1182527357082291638L, (long)l3), (Object)fr_0.d("\u00ed", (Object)class_23384, (long)-1179166189663946278L, (long)l3), (long)-1180244302985597623L, (long)l3) - 10.0;
                                            callSite10 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                            if (callSite3 != null) break block122;
                                            if (callSite10 > 0) break block123;
                                        }
                                        catch (MatchException matchException) {
                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                        }
                                        callSite10 = fr_0.d("\u00ed", (Object)this.p, (Object)class_23384, (long)-1182184357552955722L, (long)l3);
                                    }
                                    catch (MatchException matchException) {
                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                    }
                                }
                                fr_0.d("\u00ed", (Object)this.m, (Object)class_23384, this::lambda$calculate$8, (long)-1179036980625880668L, (long)l3);
                            }
                            if (callSite3 == null) continue;
                        }
                        callSite5 = null;
                        Object var43_25 = null;
                        class_23382 = null;
                        Object object2 = Double.MAX_VALUE;
                        callSite = fr_0.d("\u00ed", (Object)this.p, (long)-1185914555182132144L, (long)l3);
                        block99: while (true) {
                            reference v28 = fr_0.d("\u00ed", (Object)callSite, (long)-1183628403993931610L, (long)l3);
                            block100: while (v28 != false) {
                                reference v39;
                                block130: {
                                    block129: {
                                        block128: {
                                            dJ dJ2;
                                            block127: {
                                                Object object3;
                                                block124: {
                                                    block126: {
                                                        class_23383 = (class_2338)fr_0.d("\u00ed", (Object)callSite, (long)-1180976095343565156L, (long)l3);
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            object3 = this.q;
                                                                            if (callSite3 != null) break block124;
                                                                            callSite4 = fr_0.d("\u00ed", (Object)object3, (Object)class_23383, (long)-1178562557347205008L, (long)l3);
                                                                            if (callSite3 != null) break block125;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                        }
                                                                        if (callSite4 != false) break block126;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                    }
                                                                    object3 = (Boolean)((Object)fr_0.d("\u00ed", (Object)this.d, (long)-1178071127506899904L, (long)l3));
                                                                    if (callSite3 != null) break block124;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                }
                                                                if (fr_0.d("\u00ed", (Object)object3, (long)-1183266943225702415L, (long)l3) != false) {
                                                                    continue block99;
                                                                }
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                        }
                                                    }
                                                    object3 = fr_0.d("\u00ed", (Object)this.m, (Object)class_23383, (long)-1178879547245183467L, (long)l3);
                                                }
                                                dJ dJ3 = (dJ)object3;
                                                try {
                                                    dJ2 = dJ3;
                                                    if (callSite3 != null) break block127;
                                                    if (dJ2 == null) continue block99;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                }
                                                dJ2 = dJ3;
                                            }
                                            try {
                                                Object[] objectArray6 = new Object[1];
                                                objectArray6[0] = l8;
                                                v39 = fr_0.d("\u00ed", (Object)dJ2, (Object)objectArray6, (long)-1183750616214999689L, (long)l3);
                                                if (callSite3 != null) break block128;
                                                if (v39 == false) {
                                                    continue block99;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                            }
                                            Object[] objectArray7 = new Object[3];
                                            objectArray7[2] = l15;
                                            objectArray7[1] = fr_0.d("\u00ed", (Object)class_23383, (long)-1179166189663946278L, (long)l3);
                                            objectArray7[0] = fr_0.d("c", (Object)b, (long)-1184249019492223316L, (long)l3);
                                            reference v39 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-1181416812555388666L, (long)l3), (Object)objectArray7, (long)-1179354587160932958L, (long)l3) - (double)fr_0.d("\u00ed", (Object)((Float)((Object)fr_0.d("\u00ed", (Object)this.c, (long)-1178071127506899904L, (long)l3))), (long)-1185185930976594368L, (long)l3);
                                            v39 = v39 == 0 ? 0 : (v39 < 0 ? -1 : 1);
                                        }
                                        try {
                                            if (callSite3 != null) break block129;
                                            if (v39 < 0) {
                                                continue block99;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                        }
                                        v39 = fr_0.d("\u00ed", (Object)((Integer)((Object)fr_0.d("\u00ed", (Object)this.l, (Object)class_23383, (Object)fr_0.d("\u00c2", (int)0, (long)-1183412663625939712L, (long)l3), (long)-1184375668290582247L, (long)l3))), (long)-1180922796502318428L, (long)l3);
                                    }
                                    try {
                                        try {
                                            if (callSite3 != null) break block130;
                                            if (v39 >= fr_0.d("\u00ed", (Object)((Integer)((Object)fr_0.d("\u00ed", (Object)this.j, (long)-1178071127506899904L, (long)l3))), (long)-1180922796502318428L, (long)l3)) {
                                                continue block99;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                    }
                                    v39 = fr_0.c("b", (int)30650, (long)(0x617B1F4F9AE60A58L ^ l3));
                                }
                                reference var50_33 = v39;
                                block101: while (true) {
                                    reference v45 = var50_33;
                                    block102: while (v45 <= 5) {
                                        v28 = fr_0.c("b", (int)19107, (long)(0x21F34C5E36DFB740L ^ l3));
                                        if (callSite3 != null) continue block100;
                                        reference var51_34 = v28;
                                        while (var51_34 <= 5) {
                                            block132: {
                                                block133: {
                                                    Object[] objectArray8 = new Object[1];
                                                    objectArray8[0] = l16;
                                                    Object[] objectArray9 = new Object[1];
                                                    objectArray9[0] = l10;
                                                    reference v45 = fr_0.d("\u00ed", (Object)fr_0.d("\u00c2", (Object)objectArray8, (long)-1182527357082291638L, (long)l3), (Object)fr_0.d("\u00ed", (Object)class_23383, (long)-1179166189663946278L, (long)l3), (long)-1180244302985597623L, (long)l3) - (double)fr_0.d("\u00c2", (Object)objectArray9, (long)-1181733400038733271L, (long)l3);
                                                    v45 = v45 == 0 ? 0 : (v45 > 0 ? 1 : -1);
                                                    if (callSite3 != null) continue block102;
                                                    if (v45 <= 0) {
                                                        CallSite callSite11;
                                                        CallSite callSite12;
                                                        block142: {
                                                            CallSite callSite13;
                                                            CallSite callSite14;
                                                            block140: {
                                                                CallSite callSite15;
                                                                block138: {
                                                                    block139: {
                                                                        CallSite callSite16;
                                                                        block137: {
                                                                            block136: {
                                                                                CallSite callSite17;
                                                                                block135: {
                                                                                    CallSite callSite18;
                                                                                    block134: {
                                                                                        callSite17 = fr_0.d("\u00ed", (Object)class_23383, (int)var50_33, (int)-1, (int)var51_34, (long)-1177757695170443644L, (long)l3);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (callSite3 != null) break block132;
                                                                                                        Object[] objectArray10 = new Object[2];
                                                                                                        objectArray10[1] = l13;
                                                                                                        objectArray10[0] = callSite17;
                                                                                                        if (fr_0.d("\u00c2", (Object)objectArray10, (long)-1182784811496199173L, (long)l3) == false) break block133;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                                    }
                                                                                                    callSite18 = fr_0.d("\u00ed", (Object)callSite17, (long)-1182918764187229210L, (long)l3);
                                                                                                    if (callSite3 != null) break block134;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                                }
                                                                                                Object[] objectArray11 = new Object[2];
                                                                                                objectArray11[1] = l12;
                                                                                                objectArray11[0] = callSite18;
                                                                                                if (fr_0.d("\u00c2", (Object)objectArray11, (long)-1179758483209459315L, (long)l3) != false) break block133;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                            }
                                                                                            callSite18 = fr_0.d("\u00ed", (Object)class_23383, (int)var50_33, (int)0, (int)var51_34, (long)-1177757695170443644L, (long)l3);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                        }
                                                                                    }
                                                                                    CallSite callSite19 = callSite18;
                                                                                    Object[] objectArray12 = new Object[5];
                                                                                    objectArray12[4] = l7;
                                                                                    objectArray12[3] = fr_0.d("\u00ed", (Object)callSite2, (long)-1178278419128327846L, (long)l3);
                                                                                    objectArray12[2] = callSite19;
                                                                                    objectArray12[1] = fr_0.d("\u00ed", (Object)class_23383, (long)-1179166189663946278L, (long)l3);
                                                                                    objectArray12[0] = fr_0.d("c", (Object)b, (long)-1184249019492223316L, (long)l3);
                                                                                    callSite14 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-1181416812555388666L, (long)l3), (Object)objectArray12, (long)-1183597847142512155L, (long)l3);
                                                                                    try {
                                                                                        if (!(callSite14 > (double)fr_0.d("\u00ed", (Object)((Float)((Object)fr_0.d("\u00ed", (Object)this.e, (long)-1178071127506899904L, (long)l3))), (long)-1185185930976594368L, (long)l3))) break block135;
                                                                                        break block133;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                    }
                                                                                }
                                                                                Object[] objectArray13 = new Object[2];
                                                                                objectArray13[1] = l17;
                                                                                objectArray13[0] = callSite17;
                                                                                callSite16 = fr_0.d("\u00c2", (Object)objectArray13, (long)-1186447523239090410L, (long)l3);
                                                                                try {
                                                                                    if (callSite16 != null) break block136;
                                                                                    break block133;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                }
                                                                            }
                                                                            Object[] objectArray14 = new Object[2];
                                                                            objectArray14[1] = l9;
                                                                            objectArray14[0] = callSite16;
                                                                            callSite12 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-1180181661060457553L, (long)l3), (Object)objectArray14, (long)-1181191380276467381L, (long)l3);
                                                                            CallSite callSite20 = fr_0.d("\u00c2", (float)(fr_0.d("\u00ed", (Object)callSite12, (Object)new Object[0], (long)-1186042763673393702L, (long)l3) - fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)b, (long)-1184249019492223316L, (long)l3), (long)-1180750219999783624L, (long)l3)), (long)-1185452121305425267L, (long)l3);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (callSite3 != null) break block132;
                                                                                        if (callSite20 > fr_0.d("\u00ed", (Object)((Float)((Object)fr_0.d("\u00ed", (Object)this.k, (long)-1178071127506899904L, (long)l3))), (long)-1185185930976594368L, (long)l3)) break block133;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                    }
                                                                                    if (!(callSite20 < -fr_0.d("\u00ed", (Object)((Float)((Object)fr_0.d("\u00ed", (Object)this.k, (long)-1178071127506899904L, (long)l3))), (long)-1185185930976594368L, (long)l3))) break block137;
                                                                                    break block133;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                }
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                            }
                                                                        }
                                                                        Object[] objectArray15 = new Object[2];
                                                                        objectArray15[1] = l14;
                                                                        objectArray15[0] = callSite12;
                                                                        callSite15 = fr_0.d("\u00c2", (Object)objectArray15, (long)-1178707858006744683L, (long)l3);
                                                                        try {
                                                                            try {
                                                                                callSite13 = callSite15;
                                                                                if (callSite3 != null) break block138;
                                                                                if (!(fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite13, (long)-1180095572604470307L, (long)l3), (Object)callSite16, (long)-1180244302985597623L, (long)l3) > 0.5)) break block139;
                                                                                break block133;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                        }
                                                                    }
                                                                    callSite13 = callSite5;
                                                                }
                                                                try {
                                                                    block141: {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite3 != null) break block140;
                                                                                    if (callSite13 == null) break block141;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                                }
                                                                                callSite11 = callSite14;
                                                                                if (callSite3 != null) break block142;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                            }
                                                                            if (!(callSite11 < object2)) break block133;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                        }
                                                                    }
                                                                    callSite13 = callSite15;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                                                                }
                                                            }
                                                            callSite5 = callSite13;
                                                            callSite11 = callSite14;
                                                        }
                                                        object2 = callSite11;
                                                        CallSite callSite21 = callSite12;
                                                        class_23382 = class_23383;
                                                    }
                                                }
                                                ++var51_34;
                                            }
                                            if (callSite3 == null) continue;
                                        }
                                        ++var50_33;
                                        if (callSite3 == null) continue block101;
                                    }
                                    break;
                                }
                                if (callSite3 != null) break block99;
                                continue block99;
                            }
                            break;
                        }
                        try {
                            try {
                                if (callSite5 == null) return null;
                                v72 = var43_26;
                                if (callSite3 != null) return v72;
                            }
                            catch (MatchException matchException) {
                                throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                            }
                            callSite4 = fr_0.d("\u00ed", (Object)v72, (Object)new Object[0], (long)-1181658643863127595L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                        }
                    }
                    if (callSite4 != false) {
                        v72 = var43_26;
                        return v72;
                    }
                    callSite = callSite5;
                    try {
                        object = callSite instanceof class_3965;
                        if (callSite3 != null) break block143;
                        if (!object) break block144;
                    }
                    catch (MatchException matchException) {
                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                    }
                    class_23383 = (class_3965)callSite;
                    try {
                        try {
                            Object[] objectArray16 = new Object[2];
                            objectArray16[1] = l6;
                            objectArray16[0] = fr_0.d("\u00ed", (Object)class_23383, (long)-1182618302505761237L, (long)l3);
                            object = fr_0.d("\u00c2", (Object)objectArray16, (long)-1183092223760944114L, (long)l3);
                            if (callSite3 != null) break block145;
                            if (object) return var43_26;
                        }
                        catch (MatchException matchException) {
                            throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                        }
                        Object[] objectArray17 = new Object[2];
                        objectArray17[1] = l5;
                        objectArray17[0] = fr_0.d("\u00ed", (Object)class_23383, (long)-1182618302505761237L, (long)l3);
                        object = fr_0.d("\u00c2", (Object)objectArray17, (long)-1178212985831373390L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                    }
                }
                try {
                    try {
                        if (callSite3 != null) break block143;
                        if (!object) break block144;
                        return var43_26;
                    }
                    catch (MatchException matchException) {
                        throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                    }
                }
                catch (MatchException matchException) {
                    throw fr_0.d("\u00c2", (Object)matchException, (long)-1186358202394192971L, (long)l3);
                }
            }
            Object[] objectArray18 = new Object[4];
            objectArray18[3] = l4;
            objectArray18[2] = (boolean)fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.h, (long)-1178071127506899904L, (long)l3)), (Object)fr_0.b("h", (int)13787, (long)(0x15EA1820B1D0BD32L ^ l3)), (long)-1182322582892395010L, (long)l3);
            objectArray18[1] = () -> fr_0.lambda$calculate$9((class_239)callSite);
            objectArray18[0] = callSite2;
            object = fr_0.d("\u00c2", (Object)objectArray18, (long)-1186309318297011115L, (long)l3);
        }
        fr_0.d("\u00ed", (Object)this.l, class_23382, (Object)fr_0.d("\u00c2", (int)1, (long)-1183412663625939712L, (long)l3), Integer::sum, (long)-1178135239546897118L, (long)l3);
        Object[] objectArray19 = new Object[1];
        objectArray19[0] = l2;
        fr_0.d("\u00ed", (Object)this.r, (Object)objectArray19, (long)-1180693330373262630L, (long)l3);
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l;
        fr_0.d("\u00ed", (Object)this.g, (Object)objectArray20, (long)-1178908439737951944L, (long)l3);
        return var43_26;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block156: {
            block157: {
                block152: {
                    block154: {
                        block155: {
                            block150: {
                                block151: {
                                    block148: {
                                        block149: {
                                            block147: {
                                                block159: {
                                                    block146: {
                                                        block145: {
                                                            block143: {
                                                                block144: {
                                                                    block141: {
                                                                        block139: {
                                                                            block140: {
                                                                                block137: {
                                                                                    block138: {
                                                                                        block135: {
                                                                                            block136: {
                                                                                                block134: {
                                                                                                    block133: {
                                                                                                        block158: {
                                                                                                            block132: {
                                                                                                                block131: {
                                                                                                                    block130: {
                                                                                                                        block129: {
                                                                                                                            block128: {
                                                                                                                                block127: {
                                                                                                                                    block125: {
                                                                                                                                        block126: {
                                                                                                                                            block124: {
                                                                                                                                                block122: {
                                                                                                                                                    block123: {
                                                                                                                                                        block120: {
                                                                                                                                                            block121: {
                                                                                                                                                                block118: {
                                                                                                                                                                    block119: {
                                                                                                                                                                        block116: {
                                                                                                                                                                            block117: {
                                                                                                                                                                                block113: {
                                                                                                                                                                                    block115: {
                                                                                                                                                                                        block114: {
                                                                                                                                                                                            block111: {
                                                                                                                                                                                                block112: {
                                                                                                                                                                                                    v0 = var2_2 = fr_0.u ^ 17381121324994L;
                                                                                                                                                                                                    var4_3 = v0 ^ 49139549630782L;
                                                                                                                                                                                                    var6_4 = v0 ^ 56414674649244L;
                                                                                                                                                                                                    var8_5 = v0 ^ 82011903830509L;
                                                                                                                                                                                                    var10_6 = v0 ^ 89307005726617L;
                                                                                                                                                                                                    var12_7 = v0 ^ 54920117243564L;
                                                                                                                                                                                                    var14_8 = v0 ^ 127319858222199L;
                                                                                                                                                                                                    var16_9 = v0 ^ 116428913397711L;
                                                                                                                                                                                                    var18_10 = v0 ^ 28439821037084L;
                                                                                                                                                                                                    var20_11 = v0 ^ 65451659431736L;
                                                                                                                                                                                                    var22_12 = v0 ^ 10294121737356L;
                                                                                                                                                                                                    var24_13 = v0 ^ 98187113078959L;
                                                                                                                                                                                                    var26_14 = v0 ^ 15996755636806L;
                                                                                                                                                                                                    v1 = fr_0.d("\u00c2", (long)-2103033865264311355L, (long)var2_2);
                                                                                                                                                                                                    v2 = new Object[1];
                                                                                                                                                                                                    v2[0] = var20_11;
                                                                                                                                                                                                    fr_0.d("\u00ed", (Object)this, (Object)v2, (long)-2098741239295793783L, (long)var2_2);
                                                                                                                                                                                                    var28_15 = v1;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            v3 = fr_0.d("\u00ed", (Object)((Boolean)fr_0.d("\u00ed", (Object)this.d, (long)-2094583047830331128L, (long)var2_2)), (long)-2099770726723888455L, (long)var2_2);
                                                                                                                                                                                                            if (var28_15 != null) break block111;
                                                                                                                                                                                                            if (v3 == false) break block112;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v4) {
                                                                                                                                                                                                            throw fr_0.d("\u00c2", (Object)v4, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        fr_0.d("\u00ed", (Object)this.q, (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$3(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)(), (long)-2106240712278497372L, (long)var2_2);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v5) {
                                                                                                                                                                                                        throw fr_0.d("\u00c2", (Object)v5, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)this.l, (long)-2094907584012713131L, (long)var2_2), (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$4(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)(), (long)-2094994508290509010L, (long)var2_2);
                                                                                                                                                                                                fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)this.m, (long)-2094907584012713131L, (long)var2_2), (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$5(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)(), (long)-2094994508290509010L, (long)var2_2);
                                                                                                                                                                                                v3 = fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.a, (long)-2094583047830331128L, (long)var2_2), (Object)fr_0.b("h", (int)5738, (long)(8380881746870965193L ^ var2_2)), (long)-2095707419852162317L, (long)var2_2);
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if (v3 == false) break block113;
                                                                                                                                                                                                        v6 = fr_0.b;
                                                                                                                                                                                                        if (var28_15 != null) break block114;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v7) {
                                                                                                                                                                                                        throw fr_0.d("\u00c2", (Object)v7, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (fr_0.d("c", (Object)v6, (long)-2100325530170595419L, (long)var2_2) != null) break block113;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v8) {
                                                                                                                                                                                                    throw fr_0.d("\u00c2", (Object)v8, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                                }
                                                                                                                                                                                                v6 = fr_0.b;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException v9) {
                                                                                                                                                                                                throw fr_0.d("\u00c2", (Object)v9, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                v10 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)v6, (long)-2100754853201069084L, (long)var2_2), (long)-2095734558858901161L, (long)var2_2);
                                                                                                                                                                                                if (var28_15 != null) break block115;
                                                                                                                                                                                                if (v10 != false) break block113;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException v11) {
                                                                                                                                                                                                throw fr_0.d("\u00c2", (Object)v11, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                            }
                                                                                                                                                                                            v10 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2), (long)-2102813590070805512L, (long)var2_2);
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v12) {
                                                                                                                                                                                            throw fr_0.d("\u00c2", (Object)v12, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        if (var28_15 != null) break block116;
                                                                                                                                                                                        if (v10 != false) break block117;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v13) {
                                                                                                                                                                                        throw fr_0.d("\u00c2", (Object)v13, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            v10 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-2101199336942233881L, (long)var2_2), (Object)new Object[0], (long)-2101518007267635759L, (long)var2_2);
                                                                                                                                                                        }
                                                                                                                                                                        if (v10 != false) {
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            v14 = this.n;
                                                                                                                                                                            if (var28_15 != null) break block118;
                                                                                                                                                                            if (v14 != null) break block119;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v15) {
                                                                                                                                                                            throw fr_0.d("\u00c2", (Object)v15, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        v16 = this;
                                                                                                                                                                        if (var28_15 != null) break block120;
                                                                                                                                                                        v14 = v16.n;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v17) {
                                                                                                                                                                        throw fr_0.d("\u00c2", (Object)v17, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        v18 = new Object[3];
                                                                                                                                                                        v18[2] = var12_7;
                                                                                                                                                                        v18[1] = fr_0.d("\u00ef", (long)-2100200007503879861L, (long)var2_2);
                                                                                                                                                                        v18[0] = v14;
                                                                                                                                                                        if (fr_0.d("\u00c2", (Object)v18, (long)-2102893064700829584L, (long)var2_2) == false) break block121;
                                                                                                                                                                        v19 = new Object[1];
                                                                                                                                                                        v19[0] = var22_12;
                                                                                                                                                                        v20 = new Object[1];
                                                                                                                                                                        v20[0] = var14_8;
                                                                                                                                                                        cfr_temp_0 = fr_0.d("\u00ed", (Object)fr_0.d("\u00c2", (Object)v19, (long)-2098962201566527742L, (long)var2_2), (Object)fr_0.d("\u00ed", (Object)this.n, (long)-2095599048262683502L, (long)var2_2), (long)-2101277416732794879L, (long)var2_2) - (double)fr_0.d("\u00c2", (Object)v20, (long)-2102742432474986655L, (long)var2_2);
                                                                                                                                                                        v21 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                                                                                        if (var28_15 != null) break block122;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v22) {
                                                                                                                                                                        throw fr_0.d("\u00c2", (Object)v22, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                    }
                                                                                                                                                                    if (v21 <= 0) break block123;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v23) {
                                                                                                                                                                    throw fr_0.d("\u00c2", (Object)v23, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v16 = this;
                                                                                                                                                        }
                                                                                                                                                        v16.n = null;
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        v24 = this;
                                                                                                                                                        if (var28_15 != null) break block124;
                                                                                                                                                        v25 = new Object[2];
                                                                                                                                                        v25[1] = var6_4;
                                                                                                                                                        v25[0] = this.g;
                                                                                                                                                        v21 = fr_0.d("\u00ed", (Object)v24.r, (Object)v25, (long)-2099493597056189178L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v26) {
                                                                                                                                                        throw fr_0.d("\u00c2", (Object)v26, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (v21 == false) {
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                v24 = this;
                                                                                                                                            }
                                                                                                                                            var29_16 = v24.n;
                                                                                                                                            try {
                                                                                                                                                cfr_temp_1 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2), (long)-2100874025861311024L, (long)var2_2) - (double)fr_0.d("\u00ed", (Object)var29_16, (long)-2103089866109627601L, (long)var2_2);
                                                                                                                                                v27 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                                                                                                if (var28_15 != null) break block125;
                                                                                                                                                if (v27 >= 0) break block126;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v28) {
                                                                                                                                                throw fr_0.d("\u00c2", (Object)v28, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        v27 = fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.i, (long)-2094583047830331128L, (long)var2_2), (Object)fr_0.b("h", (int)17440, (long)(5378823233081983360L ^ var2_2)), (long)-2098775567136667466L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        v29 = v27 != false ? fr_0.d("\u00ef", (long)-2107221574970896937L, (long)var2_2) : fr_0.d("\u00ef", (long)-2106569464433357812L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    catch (MatchException v30) {
                                                                                                                                        throw fr_0.d("\u00c2", (Object)v30, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    var30_17 = v29;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v31 = fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.h, (long)-2094583047830331128L, (long)var2_2), (Object)fr_0.b("h", (int)9653, (long)(8777790977444552730L ^ var2_2)), (long)-2098775567136667466L, (long)var2_2);
                                                                                                                                            if (var28_15 != null) break block127;
                                                                                                                                            if (v31 == false) break block128;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v32) {
                                                                                                                                            throw fr_0.d("\u00c2", (Object)v32, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        v33 = new Object[2];
                                                                                                                                        v33[1] = var24_13;
                                                                                                                                        v33[0] = fr_0.d("\u00ed", (Object)var30_17, (long)-2102260696794324393L, (long)var2_2);
                                                                                                                                        v31 = fr_0.d("\u00c2", (Object)v33, (long)-2094463170091139376L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    catch (MatchException v34) {
                                                                                                                                        throw fr_0.d("\u00c2", (Object)v34, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (v31 == false) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var32_18 = fr_0.d("c", (Object)fr_0.b, (long)-2102331352456978459L, (long)var2_2);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v35 = var32_18;
                                                                                                                                    if (var28_15 != null) break block129;
                                                                                                                                    if (v35 instanceof class_3965) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl204
                                                                                                                                }
                                                                                                                                catch (MatchException v36) {
                                                                                                                                    throw fr_0.d("\u00c2", (Object)v36, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                                }
                                                                                                                                v35 = var32_18;
                                                                                                                            }
                                                                                                                            catch (MatchException v37) {
                                                                                                                                throw fr_0.d("\u00c2", (Object)v37, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var31_19 = (class_3965)v35;
                                                                                                                        try {
                                                                                                                            if (var28_15 == null) break block130;
lbl204:
                                                                                                                            // 2 sources

                                                                                                                            return;
                                                                                                                        }
                                                                                                                        catch (MatchException v38) {
                                                                                                                            throw fr_0.d("\u00c2", (Object)v38, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v39 = new Object[2];
                                                                                                                                v39[1] = var8_5;
                                                                                                                                v39[0] = fr_0.d("\u00ed", (Object)var31_19, (long)-2099148332020610205L, (long)var2_2);
                                                                                                                                v40 = fr_0.d("\u00c2", (Object)v39, (long)-2099554038315370170L, (long)var2_2);
                                                                                                                                if (var28_15 != null) break block131;
                                                                                                                                if (v40 != false) break block132;
                                                                                                                            }
                                                                                                                            catch (MatchException v41) {
                                                                                                                                throw fr_0.d("\u00c2", (Object)v41, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                            }
                                                                                                                            v42 = fr_0.d("\u00ed", (Object)var31_19, (long)-2099148332020610205L, (long)var2_2);
                                                                                                                            if (var28_15 != null) break block133;
                                                                                                                        }
                                                                                                                        catch (MatchException v43) {
                                                                                                                            throw fr_0.d("\u00c2", (Object)v43, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                        }
                                                                                                                        v44 = new Object[2];
                                                                                                                        v44[1] = var10_6;
                                                                                                                        v44[0] = v42;
                                                                                                                        v40 = fr_0.d("\u00c2", (Object)v44, (long)-2094727061723756294L, (long)var2_2);
                                                                                                                    }
                                                                                                                    catch (MatchException v45) {
                                                                                                                        throw fr_0.d("\u00c2", (Object)v45, (long)-2107375809061298435L, (long)var2_2);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (v40 == false) break block158;
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        v42 = fr_0.d("\u00ed", (Object)var31_19, (long)-2099148332020610205L, (long)var2_2);
                                                                                                    }
                                                                                                    var32_18 = v42;
                                                                                                    try {
                                                                                                        try {
                                                                                                            v46 = fr_0.d("\u00ed", (Object)var29_16, (Object)var32_18, (long)-2107153539438550834L, (long)var2_2);
                                                                                                            if (var28_15 != null) break block134;
                                                                                                            if (v46 != false) break block135;
                                                                                                        }
                                                                                                        catch (MatchException v47) {
                                                                                                            throw fr_0.d("\u00c2", (Object)v47, (long)-2107375809061298435L, (long)var2_2);
                                                                                                        }
                                                                                                        v46 = fr_0.d("\u00ed", (Object)((Integer)fr_0.d("\u00ed", (Object)this.l, (Object)var29_16, (Object)fr_0.d("\u00c2", (int)0, (long)-2099942766591440824L, (long)var2_2), (long)-2100808524574063535L, (long)var2_2)), (long)-2101868600039338004L, (long)var2_2);
                                                                                                    }
                                                                                                    catch (MatchException v48) {
                                                                                                        throw fr_0.d("\u00c2", (Object)v48, (long)-2107375809061298435L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var28_15 != null) break block136;
                                                                                                        if (v46 >= fr_0.d("\u00ed", (Object)((Integer)fr_0.d("\u00ed", (Object)this.j, (long)-2094583047830331128L, (long)var2_2)), (long)-2101868600039338004L, (long)var2_2)) break block135;
                                                                                                    }
                                                                                                    catch (MatchException v49) {
                                                                                                        throw fr_0.d("\u00c2", (Object)v49, (long)-2107375809061298435L, (long)var2_2);
                                                                                                    }
                                                                                                    v46 = fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.f, (long)-2094583047830331128L, (long)var2_2), (Object)fr_0.b("h", (int)15762, (long)(2689809849817315383L ^ var2_2)), (long)-2098775567136667466L, (long)var2_2);
                                                                                                }
                                                                                                catch (MatchException v50) {
                                                                                                    throw fr_0.d("\u00c2", (Object)v50, (long)-2107375809061298435L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var28_15 != null) break block137;
                                                                                                        if (v46 == false) break block138;
                                                                                                    }
                                                                                                    catch (MatchException v51) {
                                                                                                        throw fr_0.d("\u00c2", (Object)v51, (long)-2107375809061298435L, (long)var2_2);
                                                                                                    }
                                                                                                    v52 = new Object[2];
                                                                                                    v52[1] = var4_3;
                                                                                                    v52[0] = var29_16;
                                                                                                    v46 = fr_0.d("\u00c2", (Object)v52, (long)-2099849151801327255L, (long)var2_2);
                                                                                                    if (var28_15 != null) break block137;
                                                                                                }
                                                                                                catch (MatchException v53) {
                                                                                                    throw fr_0.d("\u00c2", (Object)v53, (long)-2107375809061298435L, (long)var2_2);
                                                                                                }
                                                                                                if (v46 != false) break block138;
                                                                                            }
                                                                                            catch (MatchException v54) {
                                                                                                throw fr_0.d("\u00c2", (Object)v54, (long)-2107375809061298435L, (long)var2_2);
                                                                                            }
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    v55 = new Object[3];
                                                                                    v55[2] = var26_14;
                                                                                    v55[1] = fr_0.d("\u00ed", (Object)var29_16, (long)-2095599048262683502L, (long)var2_2);
                                                                                    v55[0] = fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2);
                                                                                    cfr_temp_2 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-2102355332230794162L, (long)var2_2), (Object)v55, (long)-2095798777318113046L, (long)var2_2) - (double)fr_0.d("\u00ed", (Object)((Float)fr_0.d("\u00ed", (Object)this.c, (long)-2094583047830331128L, (long)var2_2)), (long)-2106150871278322936L, (long)var2_2);
                                                                                    v46 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                                                                }
                                                                                try {
                                                                                    if (var28_15 != null) break block139;
                                                                                    if (v46 >= 0) break block140;
                                                                                }
                                                                                catch (MatchException v56) {
                                                                                    throw fr_0.d("\u00c2", (Object)v56, (long)-2107375809061298435L, (long)var2_2);
                                                                                }
                                                                                return;
                                                                            }
                                                                            v57 = new Object[3];
                                                                            v57[2] = var12_7;
                                                                            v57[1] = fr_0.d("\u00ef", (long)-2099369868398392785L, (long)var2_2);
                                                                            v57[0] = fr_0.d("\u00ed", (Object)var31_19, (long)-2099148332020610205L, (long)var2_2);
                                                                            v46 = fr_0.d("\u00c2", (Object)v57, (long)-2102893064700829584L, (long)var2_2);
                                                                        }
                                                                        try {
                                                                            block142: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var28_15 != null) break block141;
                                                                                            if (v46 != false) break block142;
                                                                                        }
                                                                                        catch (MatchException v58) {
                                                                                            throw fr_0.d("\u00c2", (Object)v58, (long)-2107375809061298435L, (long)var2_2);
                                                                                        }
                                                                                        v59 = new Object[1];
                                                                                        v59[0] = var16_9;
                                                                                        v60 = new Object[3];
                                                                                        v60[2] = var12_7;
                                                                                        v60[1] = fr_0.d("\u00c2", (Object)v59, (long)-2095125568337499160L, (long)var2_2);
                                                                                        v60[0] = fr_0.d("\u00ed", (Object)var31_19, (long)-2099148332020610205L, (long)var2_2);
                                                                                        v46 = fr_0.d("\u00c2", (Object)v60, (long)-2102893064700829584L, (long)var2_2);
                                                                                        if (var28_15 != null) break block143;
                                                                                    }
                                                                                    catch (MatchException v61) {
                                                                                        throw fr_0.d("\u00c2", (Object)v61, (long)-2107375809061298435L, (long)var2_2);
                                                                                    }
                                                                                    if (v46 == false) break block144;
                                                                                }
                                                                                catch (MatchException v62) {
                                                                                    throw fr_0.d("\u00c2", (Object)v62, (long)-2107375809061298435L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v46 = fr_0.d("\u00ed", (Object)var32_18, (long)-2103089866109627601L, (long)var2_2);
                                                                        }
                                                                        catch (MatchException v63) {
                                                                            throw fr_0.d("\u00c2", (Object)v63, (long)-2107375809061298435L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v64 = fr_0.d("\u00ed", (Object)var29_16, (long)-2103089866109627601L, (long)var2_2);
                                                                        if (var28_15 != null) break block145;
                                                                        if (v46 > v64) {
                                                                        }
                                                                        ** GOTO lbl366
                                                                    }
                                                                    catch (MatchException v65) {
                                                                        throw fr_0.d("\u00c2", (Object)v65, (long)-2107375809061298435L, (long)var2_2);
                                                                    }
                                                                }
                                                                v46 = fr_0.d("\u00ed", (Object)var32_18, (long)-2103089866109627601L, (long)var2_2);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        v64 = fr_0.d("\u00ed", (Object)var29_16, (long)-2103089866109627601L, (long)var2_2);
                                                                        if (var28_15 != null) break block145;
                                                                        if (v46 >= v64) break block146;
                                                                    }
                                                                    catch (MatchException v66) {
                                                                        throw fr_0.d("\u00c2", (Object)v66, (long)-2107375809061298435L, (long)var2_2);
                                                                    }
lbl366:
                                                                    // 2 sources

                                                                    v46 = fr_0.d("\u00ed", (Object)var32_18, (long)-2103089866109627601L, (long)var2_2);
                                                                    if (var28_15 != null) break block147;
                                                                }
                                                                catch (MatchException v67) {
                                                                    throw fr_0.d("\u00c2", (Object)v67, (long)-2107375809061298435L, (long)var2_2);
                                                                }
                                                                v64 = fr_0.d("\u00ed", (Object)var29_16, (long)-2103089866109627601L, (long)var2_2) - true;
                                                            }
                                                            catch (MatchException v68) {
                                                                throw fr_0.d("\u00c2", (Object)v68, (long)-2107375809061298435L, (long)var2_2);
                                                            }
                                                        }
                                                        if (v46 >= v64) break block159;
                                                    }
                                                    return;
                                                }
                                                cfr_temp_3 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2), (Object)fr_0.d("\u00ed", (Object)var29_16, (long)-2095599048262683502L, (long)var2_2), (long)-2101572050196990356L, (long)var2_2) - fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2), (Object)fr_0.d("\u00ed", (Object)this.n, (long)-2095599048262683502L, (long)var2_2), (long)-2101572050196990356L, (long)var2_2);
                                                v46 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                                            }
                                            try {
                                                if (var28_15 != null) break block148;
                                                if (v46 <= 0) break block149;
                                            }
                                            catch (MatchException v69) {
                                                throw fr_0.d("\u00c2", (Object)v69, (long)-2107375809061298435L, (long)var2_2);
                                            }
                                            return;
                                        }
                                        cfr_temp_4 = fr_0.d("\u00ed", (Object)var29_16, (Object)fr_0.d("\u00ed", (Object)this.n, (long)-2095599048262683502L, (long)var2_2), (long)-2094857846251392983L, (long)var2_2) - fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2), (Object)fr_0.d("\u00ed", (Object)this.n, (long)-2095599048262683502L, (long)var2_2), (long)-2101572050196990356L, (long)var2_2);
                                        v46 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 > 0 ? 1 : -1);
                                    }
                                    try {
                                        if (var28_15 != null) break block150;
                                        if (v46 <= 0) break block151;
                                    }
                                    catch (MatchException v70) {
                                        throw fr_0.d("\u00c2", (Object)v70, (long)-2107375809061298435L, (long)var2_2);
                                    }
                                    return;
                                }
                                try {
                                    v71 = var32_18;
                                    if (var28_15 != null) break block152;
                                    v72 = new Object[3];
                                    v72[2] = var12_7;
                                    v72[1] = fr_0.d("\u00ef", (long)-2099369868398392785L, (long)var2_2);
                                    v72[0] = v71;
                                    v46 = fr_0.d("\u00c2", (Object)v72, (long)-2102893064700829584L, (long)var2_2);
                                }
                                catch (MatchException v73) {
                                    throw fr_0.d("\u00c2", (Object)v73, (long)-2107375809061298435L, (long)var2_2);
                                }
                            }
                            try {
                                block153: {
                                    try {
                                        try {
                                            if (v46 != false) break block153;
                                            v74 = var32_18;
                                            if (var28_15 != null) break block154;
                                        }
                                        catch (MatchException v75) {
                                            throw fr_0.d("\u00c2", (Object)v75, (long)-2107375809061298435L, (long)var2_2);
                                        }
                                        v76 = new Object[1];
                                        v76[0] = var16_9;
                                        v77 = new Object[3];
                                        v77[2] = var12_7;
                                        v77[1] = fr_0.d("\u00c2", (Object)v76, (long)-2095125568337499160L, (long)var2_2);
                                        v77[0] = v74;
                                        if (fr_0.d("\u00c2", (Object)v77, (long)-2102893064700829584L, (long)var2_2) == false) break block155;
                                    }
                                    catch (MatchException v78) {
                                        throw fr_0.d("\u00c2", (Object)v78, (long)-2107375809061298435L, (long)var2_2);
                                    }
                                }
                                v71 = var32_18;
                                break block152;
                            }
                            catch (MatchException v79) {
                                throw fr_0.d("\u00c2", (Object)v79, (long)-2107375809061298435L, (long)var2_2);
                            }
                        }
                        v74 = var32_18;
                    }
                    v71 = fr_0.d("\u00ed", (Object)v74, (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)var31_19, (long)-2106112325839966692L, (long)var2_2), (long)-2102467468213353265L, (long)var2_2), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)var31_19, (long)-2106112325839966692L, (long)var2_2), (long)-2099046341492568709L, (long)var2_2), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)var31_19, (long)-2106112325839966692L, (long)var2_2), (long)-2101810808123982245L, (long)var2_2), (long)-2094192792922747956L, (long)var2_2);
                }
                var33_20 = v71;
                var34_21 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2102086728177891911L, (long)var2_2), (Object)var33_20, (long)-2106802406746213538L, (long)var2_2);
                fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2102086728177891911L, (long)var2_2), (Object)var33_20, (Object)fr_0.d("\u00ed", (Object)var30_17, (long)-2094799068469203950L, (long)var2_2), (long)-2100695004597275117L, (long)var2_2);
                v80 = new Object[3];
                v80[2] = var26_14;
                v80[1] = fr_0.d("\u00ed", (Object)var29_16, (long)-2095599048262683502L, (long)var2_2);
                v80[0] = fr_0.d("c", (Object)fr_0.b, (long)-2100754853201069084L, (long)var2_2);
                var35_22 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-2102355332230794162L, (long)var2_2), (Object)v80, (long)-2095798777318113046L, (long)var2_2);
                try {
                    fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-2102086728177891911L, (long)var2_2), (Object)var33_20, (Object)var34_21, (long)-2100695004597275117L, (long)var2_2);
                    cfr_temp_5 = var35_22 - (double)fr_0.d("\u00ed", (Object)((Float)fr_0.d("\u00ed", (Object)this.e, (long)-2094583047830331128L, (long)var2_2)), (long)-2106150871278322936L, (long)var2_2);
                    v81 = cfr_temp_5 == 0 ? 0 : (cfr_temp_5 > 0 ? 1 : -1);
                    if (var28_15 != null) break block156;
                    if (v81 <= 0) break block157;
                }
                catch (MatchException v82) {
                    throw fr_0.d("\u00c2", (Object)v82, (long)-2107375809061298435L, (long)var2_2);
                }
                return;
            }
            fr_0.d("\u00ed", (Object)this.l, (Object)var29_16, (Object)fr_0.d("\u00c2", (int)1, (long)-2099942766591440824L, (long)var2_2), (BiFunction<Integer, Integer, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, sum(int int ), (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;)(), (long)-2094664895971331990L, (long)var2_2);
            fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-2101199336942233881L, (long)var2_2), (Object)new Object[0], (long)-2100426192235634220L, (long)var2_2);
            v83 = new Object[4];
            v83[3] = var18_10;
            v83[2] = (boolean)fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.h, (long)-2094583047830331128L, (long)var2_2), (Object)fr_0.b("h", (int)24240, (long)(1997941048704588574L ^ var2_2)), (long)-2098775567136667466L, (long)var2_2);
            v83[1] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onTick$6(net.minecraft.class_3965 ), ()V)((class_3965)var31_19);
            v83[0] = var30_17;
            v81 = fr_0.d("\u00c2", (Object)v83, (long)-2107318865986735843L, (long)var2_2);
        }
    }

    @bP
    public void a(a5 a52) {
        long l = u ^ 0x1C29616E743AL;
        fr_0.d("\u00ed", (Object)this.l, (long)7006990935507822782L, (long)l);
        fr_0.d("\u00ed", (Object)this.m, (long)7006990935507822782L, (long)l);
        fr_0.d("\u00ed", (Object)this.p, (long)7000656442310782873L, (long)l);
        fr_0.d("\u00ed", (Object)this.q, (long)7000656442310782873L, (long)l);
        this.n = null;
        this.o = 0;
        s = 0;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fr_0.d("\u00c2", (Object)((Object)q_0.Crystal), (long)-2438574130965181488L, (long)l);
    }

    @bP
    public void a(bh_0 bh_02) {
        block58: {
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            class_2885 class_28852;
            CallSite callSite4;
            CallSite callSite5;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            block57: {
                Object object;
                block48: {
                    CallSite callSite6;
                    block50: {
                        block49: {
                            CallSite callSite7;
                            ArrayList arrayList;
                            block54: {
                                block56: {
                                    block53: {
                                        block62: {
                                            block52: {
                                                CallSite callSite8;
                                                block51: {
                                                    CallSite callSite9;
                                                    long l6 = l5 = u ^ 0x1D93CAEB5937L;
                                                    l4 = l6 ^ 0x259966885399L;
                                                    l3 = l6 ^ 0x23AE0770E059L;
                                                    l2 = l6 ^ 0x7BB92962E13AL;
                                                    l = l6 ^ 0x4360F38C02E5L;
                                                    callSite5 = fr_0.d("\u00ed", (Object)bh_02, (Object)new Object[0], (long)5488050878201163947L, (long)l5);
                                                    callSite4 = fr_0.d("\u00c2", (long)5486958342518177072L, (long)l5);
                                                    try {
                                                        object = callSite5 instanceof class_2885;
                                                        if (callSite4 != null) break block48;
                                                        if (!object) break block49;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                    }
                                                    class_28852 = (class_2885)callSite5;
                                                    try {
                                                        callSite9 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)class_28852, (long)5491464781549106281L, (long)l5), (Object)fr_0.d("\u00ef", (long)5487381117298802476L, (long)l5), (long)5488948128296336899L, (long)l5) != false ? fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)b, (long)5489198321381741841L, (long)l5), (long)5491653586844665172L, (long)l5) : fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)b, (long)5489198321381741841L, (long)l5), (long)5486258688920596166L, (long)l5);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                    }
                                                    callSite5 = callSite9;
                                                    try {
                                                        callSite6 = fr_0.d("\u00ed", (Object)callSite5, (long)5491387506796708063L, (long)l5);
                                                        if (callSite4 != null) break block50;
                                                        if (callSite6 != fr_0.d("\u00ef", (long)5491756765199115845L, (long)l5)) break block49;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                    }
                                                    callSite3 = fr_0.d("\u00ed", (Object)class_28852, (long)5488512260200007952L, (long)l5);
                                                    callSite2 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5490037077772337385L, (long)l5), (long)5487524713228970554L, (long)l5), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5490037077772337385L, (long)l5), (long)5488658847744926606L, (long)l5), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5490037077772337385L, (long)l5), (long)5485890575239860398L, (long)l5), (long)5483973247647917369L, (long)l5);
                                                    try {
                                                        try {
                                                            try {
                                                                callSite8 = fr_0.d("\u00ed", (Object)((Boolean)((Object)fr_0.d("\u00ed", (Object)this.d, (long)5484145805761712125L, (long)l5))), (long)5487935192624493644L, (long)l5);
                                                                if (callSite4 != null) break block51;
                                                                if (callSite8 == false) break block52;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                            }
                                                            arrayList = this.q;
                                                            callSite7 = callSite2;
                                                            if (callSite4 != null) break block53;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                        }
                                                        callSite8 = fr_0.d("\u00ed", (Object)arrayList, (Object)callSite7, (long)5483652176894022605L, (long)l5);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                    }
                                                }
                                                if (callSite8 == false) break block62;
                                            }
                                            return;
                                        }
                                        arrayList = this.q;
                                        callSite7 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                    }
                                    try {
                                        block55: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite4 != null) break block54;
                                                                Object[] objectArray = new Object[3];
                                                                objectArray[2] = l3;
                                                                objectArray[1] = fr_0.d("\u00ef", (long)5489753141271449534L, (long)l5);
                                                                objectArray[0] = callSite7;
                                                                if (fr_0.d("\u00c2", (Object)objectArray, (long)5486536338586685061L, (long)l5) != false) break block55;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                            }
                                                            callSite7 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                                            if (callSite4 != null) break block54;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                        }
                                                        Object[] objectArray = new Object[3];
                                                        objectArray[2] = l3;
                                                        objectArray[1] = fr_0.d("\u00ef", (long)5487803715518735578L, (long)l5);
                                                        objectArray[0] = callSite7;
                                                        if (fr_0.d("\u00c2", (Object)objectArray, (long)5486536338586685061L, (long)l5) != false) break block55;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                    }
                                                    callSite7 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                                    if (callSite4 != null) break block54;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l2;
                                                Object[] objectArray2 = new Object[3];
                                                objectArray2[2] = l3;
                                                objectArray2[1] = fr_0.d("\u00c2", (Object)objectArray, (long)5483568195359147293L, (long)l5);
                                                objectArray2[0] = callSite7;
                                                if (fr_0.d("\u00c2", (Object)objectArray2, (long)5486536338586685061L, (long)l5) == false) break block56;
                                            }
                                            catch (MatchException matchException) {
                                                throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                            }
                                        }
                                        callSite7 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                        break block54;
                                    }
                                    catch (MatchException matchException) {
                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                    }
                                }
                                callSite7 = callSite2;
                            }
                            fr_0.d("\u00ed", (Object)arrayList, (Object)callSite7, (long)5486851746831990027L, (long)l5);
                        }
                        callSite6 = fr_0.d("\u00ed", (Object)this.a, (long)5484145805761712125L, (long)l5);
                    }
                    object = fr_0.d("\u00ed", (String)((Object)callSite6), (Object)fr_0.b("h", (int)1765, (long)(0x5CB8CBA388172DB2L ^ l5)), (long)5485278147029701638L, (long)l5);
                }
                if (!object) {
                    return;
                }
                callSite5 = fr_0.d("\u00ed", (Object)bh_02, (Object)new Object[0], (long)5488050878201163947L, (long)l5);
                try {
                    try {
                        callSite = callSite5;
                        if (callSite4 != null) break block57;
                        if (!(callSite instanceof class_2885)) break block58;
                    }
                    catch (MatchException matchException) {
                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                    }
                    callSite = callSite5;
                }
                catch (MatchException matchException) {
                    throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                }
            }
            class_28852 = (class_2885)callSite;
            try {
                CallSite callSite10 = callSite5 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)class_28852, (long)5491464781549106281L, (long)l5), (Object)fr_0.d("\u00ef", (long)5487381117298802476L, (long)l5), (long)5488948128296336899L, (long)l5) != false ? fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)b, (long)5489198321381741841L, (long)l5), (long)5491653586844665172L, (long)l5) : fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)b, (long)5489198321381741841L, (long)l5), (long)5486258688920596166L, (long)l5);
            }
            catch (MatchException matchException) {
                throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
            }
            if (fr_0.d("\u00ed", (Object)callSite5, (long)5491387506796708063L, (long)l5) == fr_0.d("\u00ef", (long)5491756765199115845L, (long)l5)) {
                CallSite callSite11;
                block59: {
                    block61: {
                        callSite3 = fr_0.d("\u00ed", (Object)class_28852, (long)5488512260200007952L, (long)l5);
                        callSite2 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5490037077772337385L, (long)l5), (long)5487524713228970554L, (long)l5), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5490037077772337385L, (long)l5), (long)5488658847744926606L, (long)l5), (int)fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)callSite3, (long)5490037077772337385L, (long)l5), (long)5485890575239860398L, (long)l5), (long)5483973247647917369L, (long)l5);
                        try {
                            block60: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    fr_0 fr_02 = this;
                                                    callSite11 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                                    if (callSite4 != null) break block59;
                                                    Object[] objectArray = new Object[3];
                                                    objectArray[2] = l3;
                                                    objectArray[1] = fr_0.d("\u00ef", (long)5489753141271449534L, (long)l5);
                                                    objectArray[0] = callSite11;
                                                    if (fr_0.d("\u00c2", (Object)objectArray, (long)5486536338586685061L, (long)l5) != false) break block60;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                                }
                                                callSite11 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                                if (callSite4 != null) break block59;
                                            }
                                            catch (MatchException matchException) {
                                                throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                            }
                                            Object[] objectArray = new Object[3];
                                            objectArray[2] = l3;
                                            objectArray[1] = fr_0.d("\u00ef", (long)5487803715518735578L, (long)l5);
                                            objectArray[0] = callSite11;
                                            if (fr_0.d("\u00c2", (Object)objectArray, (long)5486536338586685061L, (long)l5) != false) break block60;
                                        }
                                        catch (MatchException matchException) {
                                            throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                        }
                                        callSite11 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                                        if (callSite4 != null) break block59;
                                    }
                                    catch (MatchException matchException) {
                                        throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l2;
                                    Object[] objectArray3 = new Object[3];
                                    objectArray3[2] = l3;
                                    objectArray3[1] = fr_0.d("\u00c2", (Object)objectArray, (long)5483568195359147293L, (long)l5);
                                    objectArray3[0] = callSite11;
                                    if (fr_0.d("\u00c2", (Object)objectArray3, (long)5486536338586685061L, (long)l5) == false) break block61;
                                }
                                catch (MatchException matchException) {
                                    throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                                }
                            }
                            callSite11 = fr_0.d("\u00ed", (Object)callSite3, (long)5488553051313300886L, (long)l5);
                            break block59;
                        }
                        catch (MatchException matchException) {
                            throw fr_0.d("\u00c2", (Object)matchException, (long)5491025394398326792L, (long)l5);
                        }
                    }
                    callSite11 = callSite2;
                }
                fr_02.n = callSite11;
                this.o = 0;
                Object[] objectArray = new Object[1];
                objectArray[0] = l4;
                fr_0.d("\u00ed", (Object)this.r, (Object)objectArray, (long)5485501629518274919L, (long)l5);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l;
                fr_0.d("\u00ed", (Object)this.g, (Object)objectArray4, (long)5484981950359485061L, (long)l5);
            }
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (C[n3] != null) {
            return n3;
        }
        Object object = B[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 0;
            case 1 -> 17;
            case 2 -> 57;
            case 3 -> 50;
            case 4 -> 11;
            case 5 -> 39;
            case 6 -> 29;
            case 7 -> 16;
            case 8 -> 38;
            case 9 -> 30;
            case 10 -> 32;
            case 11 -> 10;
            case 12 -> 12;
            case 13 -> 62;
            case 14 -> 15;
            case 15 -> 14;
            case 16 -> 61;
            case 17 -> 1;
            case 18 -> 42;
            case 19 -> 18;
            case 20 -> 56;
            case 21 -> 49;
            case 22 -> 58;
            case 23 -> 27;
            case 24 -> 34;
            case 25 -> 52;
            case 26 -> 63;
            case 27 -> 2;
            case 28 -> 24;
            case 29 -> 9;
            case 30 -> 44;
            case 31 -> 46;
            case 32 -> 37;
            case 33 -> 40;
            case 34 -> 23;
            case 35 -> 20;
            case 36 -> 6;
            case 37 -> 45;
            case 38 -> 43;
            case 39 -> 51;
            case 40 -> 59;
            case 41 -> 5;
            case 42 -> 55;
            case 43 -> 60;
            case 44 -> 26;
            case 45 -> 54;
            case 46 -> 35;
            case 47 -> 47;
            case 48 -> 21;
            case 49 -> 33;
            case 50 -> 53;
            case 51 -> 31;
            case 52 -> 41;
            case 53 -> 8;
            case 54 -> 22;
            case 55 -> 48;
            case 56 -> 25;
            case 57 -> 28;
            case 58 -> 4;
            case 59 -> 7;
            case 60 -> 3;
            case 61 -> 19;
            case 62 -> 13;
            default -> 36;
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
        fr_0.C[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fr_0.m(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            String string = C[n];
            int n2 = string.indexOf(8);
            Class clazz = fr_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fr_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fr_0.g(clazz3, string2, clazz2)) != null) {
                    fr_0.B[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fr_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fr_0.B[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fr_0.n(996031846333288L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fr_0.m(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = C[n];
                int n3 = string2.indexOf(8);
                clazz3 = fr_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fr_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fr_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fr_0.B[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fr_0.n(996031846333288L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fr_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fr_0.B[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fr_0.n(996031846333288L, 0L);
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void j(Object[] var1_1) {
        block105: {
            block85: {
                block103: {
                    block104: {
                        block99: {
                            block100: {
                                block102: {
                                    block101: {
                                        block97: {
                                            block98: {
                                                block95: {
                                                    block96: {
                                                        block93: {
                                                            block94: {
                                                                block91: {
                                                                    block92: {
                                                                        block88: {
                                                                            block90: {
                                                                                block89: {
                                                                                    block86: {
                                                                                        block87: {
                                                                                            var2_2 = (Long)var1_1[0];
                                                                                            v0 = var2_2 = fr_0.u ^ var2_2;
                                                                                            var4_3 = v0 ^ 107042677122919L;
                                                                                            var6_4 = v0 ^ 134344802069301L;
                                                                                            var8_5 = v0 ^ 111951408962199L;
                                                                                            var10_6 = v0 ^ 113720823272615L;
                                                                                            var12_7 = v0 ^ 41048373857916L;
                                                                                            var14_8 = v0 ^ 8397830927899L;
                                                                                            var16_9 = v0 ^ 59436072296438L;
                                                                                            var18_10 = v0 ^ 105288676554375L;
                                                                                            var20_11 = v0 ^ 17395971078820L;
                                                                                            var22_12 = v0 ^ 96835133630541L;
                                                                                            var24_13 = v0 ^ 31428524456361L;
                                                                                            fr_0.s = false;
                                                                                            var26_14 = fr_0.d("\u00c2", (long)-514585421361985074L, (long)var2_2);
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v1 = this;
                                                                                                        if (var26_14 != null) break block85;
                                                                                                        if (fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)v1.a, (long)-511759653699929341L, (long)var2_2), (Object)fr_0.b("h", (int)1765, (long)(6681247690726152524L ^ var2_2)), (long)-512887358784429832L, (long)var2_2) != false) {
                                                                                                        }
                                                                                                        ** GOTO lbl238
                                                                                                    }
                                                                                                    catch (MatchException v2) {
                                                                                                        throw fr_0.d("\u00c2", (Object)v2, (long)-519516755929578250L, (long)var2_2);
                                                                                                    }
                                                                                                    v3 = this.n;
                                                                                                    if (var26_14 != null) break block86;
                                                                                                }
                                                                                                catch (MatchException v4) {
                                                                                                    throw fr_0.d("\u00c2", (Object)v4, (long)-519516755929578250L, (long)var2_2);
                                                                                                }
                                                                                                if (v3 != null) break block87;
                                                                                            }
                                                                                            catch (MatchException v5) {
                                                                                                throw fr_0.d("\u00c2", (Object)v5, (long)-519516755929578250L, (long)var2_2);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        try {
                                                                                            v6 = this;
                                                                                            if (var26_14 != null) break block88;
                                                                                            v3 = v6.n;
                                                                                        }
                                                                                        catch (MatchException v7) {
                                                                                            throw fr_0.d("\u00c2", (Object)v7, (long)-519516755929578250L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v8 = new Object[3];
                                                                                                v8[2] = var10_6;
                                                                                                v8[1] = fr_0.d("\u00ef", (long)-517419559902807232L, (long)var2_2);
                                                                                                v8[0] = v3;
                                                                                                if (fr_0.d("\u00c2", (Object)v8, (long)-515007430060541317L, (long)var2_2) != false) {
                                                                                                    v9 = new Object[1];
                                                                                                    v9[0] = var18_10;
                                                                                                    v10 = new Object[1];
                                                                                                    v10[0] = var12_7;
                                                                                                    cfr_temp_0 = fr_0.d("\u00ed", (Object)fr_0.d("\u00c2", (Object)v9, (long)-516319247635995383L, (long)var2_2), (Object)fr_0.d("\u00ed", (Object)this.n, (long)-512925084601160039L, (long)var2_2), (long)-514090078133978614L, (long)var2_2) - (double)fr_0.d("\u00c2", (Object)v10, (long)-514861194698154646L, (long)var2_2);
                                                                                                    v11 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                    if (var26_14 != null) break block89;
                                                                                                }
                                                                                                ** GOTO lbl100
                                                                                            }
                                                                                            catch (MatchException v12) {
                                                                                                throw fr_0.d("\u00c2", (Object)v12, (long)-519516755929578250L, (long)var2_2);
                                                                                            }
                                                                                            if (v11 <= 0) {
                                                                                            }
                                                                                            ** GOTO lbl100
                                                                                        }
                                                                                        catch (MatchException v13) {
                                                                                            throw fr_0.d("\u00c2", (Object)v13, (long)-519516755929578250L, (long)var2_2);
                                                                                        }
                                                                                        cfr_temp_1 = fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)fr_0.b, (long)-516849587049750033L, (long)var2_2), (long)-516958846784958501L, (long)var2_2) - (double)fr_0.d("\u00ed", (Object)this.n, (long)-514812825795966684L, (long)var2_2);
                                                                                        v11 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                                    }
                                                                                    catch (MatchException v14) {
                                                                                        throw fr_0.d("\u00c2", (Object)v14, (long)-519516755929578250L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var26_14 != null) break block90;
                                                                                        if (v11 >= 0) {
                                                                                        }
                                                                                        ** GOTO lbl100
                                                                                    }
                                                                                    catch (MatchException v15) {
                                                                                        throw fr_0.d("\u00c2", (Object)v15, (long)-519516755929578250L, (long)var2_2);
                                                                                    }
                                                                                    v11 = fr_0.d("\u00ed", (Object)((Integer)fr_0.d("\u00ed", (Object)this.l, (Object)this.n, (Object)fr_0.d("\u00c2", (int)0, (long)-517676803482414525L, (long)var2_2), (long)-517004276078961062L, (long)var2_2)), (long)-513411206358657561L, (long)var2_2);
                                                                                }
                                                                                catch (MatchException v16) {
                                                                                    throw fr_0.d("\u00c2", (Object)v16, (long)-519516755929578250L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var26_14 != null) break block91;
                                                                                    if (v11 < fr_0.d("\u00ed", (Object)((Integer)fr_0.d("\u00ed", (Object)this.j, (long)-511759653699929341L, (long)var2_2)), (long)-513411206358657561L, (long)var2_2)) break block92;
                                                                                }
                                                                                catch (MatchException v17) {
                                                                                    throw fr_0.d("\u00c2", (Object)v17, (long)-519516755929578250L, (long)var2_2);
                                                                                }
lbl100:
                                                                                // 4 sources

                                                                                v6 = this;
                                                                            }
                                                                            catch (MatchException v18) {
                                                                                throw fr_0.d("\u00c2", (Object)v18, (long)-519516755929578250L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        v6.o = 0;
                                                                        return;
                                                                    }
                                                                    v19 = new Object[2];
                                                                    v19[1] = var6_4;
                                                                    v19[0] = this.n;
                                                                    v11 = fr_0.d("\u00c2", (Object)v19, (long)-517772340002022558L, (long)var2_2);
                                                                }
                                                                var27_15 = v11;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v20 = var27_15;
                                                                                if (var26_14 != null) break block93;
                                                                                if (v20 <= 0) break block94;
                                                                            }
                                                                            catch (MatchException v21) {
                                                                                throw fr_0.d("\u00c2", (Object)v21, (long)-519516755929578250L, (long)var2_2);
                                                                            }
                                                                            v20 = (reference)this.o;
                                                                            if (var26_14 != null) break block93;
                                                                        }
                                                                        catch (MatchException v22) {
                                                                            throw fr_0.d("\u00c2", (Object)v22, (long)-519516755929578250L, (long)var2_2);
                                                                        }
                                                                        if (v20 != false) break block94;
                                                                    }
                                                                    catch (MatchException v23) {
                                                                        throw fr_0.d("\u00c2", (Object)v23, (long)-519516755929578250L, (long)var2_2);
                                                                    }
                                                                    v24 = new Object[1];
                                                                    v24[0] = var4_3;
                                                                    fr_0.d("\u00ed", (Object)this.r, (Object)v24, (long)-513922280637213287L, (long)var2_2);
                                                                    v25 = new Object[1];
                                                                    v25[0] = var14_8;
                                                                    fr_0.d("\u00ed", (Object)this.g, (Object)v25, (long)-513174210140598661L, (long)var2_2);
                                                                }
                                                                catch (MatchException v26) {
                                                                    throw fr_0.d("\u00c2", (Object)v26, (long)-519516755929578250L, (long)var2_2);
                                                                }
                                                            }
                                                            this.o = (int)var27_15;
                                                            v20 = fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.f, (long)-511759653699929341L, (long)var2_2), (Object)fr_0.b("h", (int)1719, (long)(5292942850053544219L ^ var2_2)), (long)-516524022131928387L, (long)var2_2);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var26_14 != null) break block95;
                                                                    if (v20 != false) break block96;
                                                                }
                                                                catch (MatchException v27) {
                                                                    throw fr_0.d("\u00c2", (Object)v27, (long)-519516755929578250L, (long)var2_2);
                                                                }
                                                                v20 = var27_15;
                                                                if (var26_14 != null) break block95;
                                                            }
                                                            catch (MatchException v28) {
                                                                throw fr_0.d("\u00c2", (Object)v28, (long)-519516755929578250L, (long)var2_2);
                                                            }
                                                            if (v20 != false) break block96;
                                                        }
                                                        catch (MatchException v29) {
                                                            throw fr_0.d("\u00c2", (Object)v29, (long)-519516755929578250L, (long)var2_2);
                                                        }
                                                        return;
                                                    }
                                                    v30 = new Object[2];
                                                    v30[1] = var16_9;
                                                    v30[0] = Float.valueOf((float)(fr_0.d("\u00ed", (Object)this.g, (Object)new Object[0], (long)-517285570727535662L, (long)var2_2) + 250.0f));
                                                    v20 = fr_0.d("\u00ed", (Object)this.r, (Object)v30, (long)-517859627285775845L, (long)var2_2);
                                                }
                                                try {
                                                    if (var26_14 != null) break block97;
                                                    if (v20 == false) break block98;
                                                }
                                                catch (MatchException v31) {
                                                    throw fr_0.d("\u00c2", (Object)v31, (long)-519516755929578250L, (long)var2_2);
                                                }
                                                return;
                                            }
                                            v20 = fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.h, (long)-511759653699929341L, (long)var2_2), (Object)fr_0.b("h", (int)20862, (long)(1642472653671747283L ^ var2_2)), (long)-516524022131928387L, (long)var2_2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var26_14 != null) break block99;
                                                    if (v20 == false) break block100;
                                                }
                                                catch (MatchException v32) {
                                                    throw fr_0.d("\u00c2", (Object)v32, (long)-519516755929578250L, (long)var2_2);
                                                }
                                                if (fr_0.d("\u00ed", (String)fr_0.d("\u00ed", (Object)this.i, (long)-511759653699929341L, (long)var2_2), (Object)fr_0.b("h", (int)28605, (long)(8262147379246231579L ^ var2_2)), (long)-516524022131928387L, (long)var2_2) == false) break block101;
                                            }
                                            catch (MatchException v33) {
                                                throw fr_0.d("\u00c2", (Object)v33, (long)-519516755929578250L, (long)var2_2);
                                            }
                                            v34 = fr_0.d("\u00ef", (long)-519334823471343652L, (long)var2_2);
                                            break block102;
                                        }
                                        catch (MatchException v35) {
                                            throw fr_0.d("\u00c2", (Object)v35, (long)-519516755929578250L, (long)var2_2);
                                        }
                                    }
                                    v34 = fr_0.d("\u00ef", (long)-519989126052588025L, (long)var2_2);
                                }
                                try {
                                    v36 = new Object[2];
                                    v36[1] = var20_11;
                                    v36[0] = fr_0.d("\u00ed", (Object)v34, (long)-515640620470159268L, (long)var2_2);
                                    v20 = fr_0.d("\u00c2", (Object)v36, (long)-511811352591457061L, (long)var2_2);
                                    if (var26_14 != null) break block99;
                                    if (v20 != false) break block100;
                                }
                                catch (MatchException v37) {
                                    throw fr_0.d("\u00c2", (Object)v37, (long)-519516755929578250L, (long)var2_2);
                                }
                                return;
                            }
                            v38 = new Object[3];
                            v38[2] = var22_12;
                            v38[1] = fr_0.d("\u00ed", (Object)this.n, (long)-512925084601160039L, (long)var2_2);
                            v38[0] = fr_0.d("c", (Object)fr_0.b, (long)-516849587049750033L, (long)var2_2);
                            cfr_temp_2 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-515177923763884475L, (long)var2_2), (Object)v38, (long)-513009572343735583L, (long)var2_2) - (double)fr_0.d("\u00ed", (Object)((Float)fr_0.d("\u00ed", (Object)this.c, (long)-511759653699929341L, (long)var2_2)), (long)-518436845168533245L, (long)var2_2);
                            v20 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                        }
                        try {
                            if (var26_14 != null) break block103;
                            if (v20 < 0) break block104;
                        }
                        catch (MatchException v39) {
                            throw fr_0.d("\u00c2", (Object)v39, (long)-519516755929578250L, (long)var2_2);
                        }
                        v20 = (reference)true;
                        break block103;
                    }
                    v20 = (reference)false;
                }
                try {
                    fr_0.s = v20;
                    if (var26_14 == null) break block105;
lbl238:
                    // 2 sources

                    v1 = this;
                }
                catch (MatchException v40) {
                    throw fr_0.d("\u00c2", (Object)v40, (long)-519516755929578250L, (long)var2_2);
                }
            }
            var27_16 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)v1.m, (long)-511666289564673698L, (long)var2_2), (long)-519218192307798770L, (long)var2_2);
            while (fr_0.d("\u00ed", (Object)var27_16, (long)-517469755859728411L, (long)var2_2) != false) {
                block115: {
                    block116: {
                        block114: {
                            block111: {
                                block113: {
                                    block112: {
                                        block110: {
                                            block109: {
                                                block107: {
                                                    block108: {
                                                        block106: {
                                                            var28_17 = (class_2338)fr_0.d("\u00ed", (Object)var27_16, (long)-513639344124612129L, (long)var2_2);
                                                            try {
                                                                v41 = new Object[3];
                                                                v41[2] = var10_6;
                                                                v41[1] = fr_0.d("\u00ef", (long)-517419559902807232L, (long)var2_2);
                                                                v41[0] = var28_17;
                                                                v42 = fr_0.d("\u00c2", (Object)v41, (long)-515007430060541317L, (long)var2_2);
                                                                if (var26_14 != null) break block106;
                                                                if (v42 == false) {
                                                                    continue;
                                                                }
                                                            }
                                                            catch (MatchException v43) {
                                                                throw fr_0.d("\u00c2", (Object)v43, (long)-519516755929578250L, (long)var2_2);
                                                            }
                                                            v42 = fr_0.d("\u00ed", (Object)((Boolean)fr_0.d("\u00ed", (Object)this.d, (long)-511759653699929341L, (long)var2_2)), (long)-515860926062542670L, (long)var2_2);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var26_14 != null) break block107;
                                                                    if (v42 == false) break block108;
                                                                }
                                                                catch (MatchException v44) {
                                                                    throw fr_0.d("\u00c2", (Object)v44, (long)-519516755929578250L, (long)var2_2);
                                                                }
                                                                v42 = fr_0.d("\u00ed", (Object)this.q, (Object)var28_17, (long)-511268120751085773L, (long)var2_2);
                                                                if (var26_14 != null) break block107;
                                                            }
                                                            catch (MatchException v45) {
                                                                throw fr_0.d("\u00c2", (Object)v45, (long)-519516755929578250L, (long)var2_2);
                                                            }
                                                            if (v42 == false) {
                                                                continue;
                                                            }
                                                        }
                                                        catch (MatchException v46) {
                                                            throw fr_0.d("\u00c2", (Object)v46, (long)-519516755929578250L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        v47 = (Integer)fr_0.d("\u00ed", (Object)this.l, (Object)var28_17, (Object)fr_0.d("\u00c2", (int)0, (long)-517676803482414525L, (long)var2_2), (long)-517004276078961062L, (long)var2_2);
                                                        if (var26_14 != null) break block109;
                                                        v42 = fr_0.d("\u00ed", (Object)v47, (long)-513411206358657561L, (long)var2_2);
                                                    }
                                                    catch (MatchException v48) {
                                                        throw fr_0.d("\u00c2", (Object)v48, (long)-519516755929578250L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    if (v42 >= fr_0.d("\u00ed", (Object)((Integer)fr_0.d("\u00ed", (Object)this.j, (long)-511759653699929341L, (long)var2_2)), (long)-513411206358657561L, (long)var2_2)) {
                                                        continue;
                                                    }
                                                }
                                                catch (MatchException v49) {
                                                    throw fr_0.d("\u00c2", (Object)v49, (long)-519516755929578250L, (long)var2_2);
                                                }
                                                v47 = fr_0.d("\u00ed", (Object)this.m, (Object)var28_17, (long)-513203033889167018L, (long)var2_2);
                                            }
                                            var29_18 = (dJ)v47;
                                            try {
                                                v50 = var29_18;
                                                if (var26_14 != null) break block110;
                                                if (v50 != null) {
                                                }
                                                ** GOTO lbl319
                                            }
                                            catch (MatchException v51) {
                                                throw fr_0.d("\u00c2", (Object)v51, (long)-519516755929578250L, (long)var2_2);
                                            }
                                            v50 = var29_18;
                                        }
                                        try {
                                            try {
                                                try {
                                                    v52 = new Object[1];
                                                    v52[0] = var24_13;
                                                    v53 /* !! */  = fr_0.d("\u00ed", (Object)v50, (Object)v52, (long)-517629366511666636L, (long)var2_2);
                                                    if (var26_14 != null) break block111;
                                                    if (v53 /* !! */  == false) break block112;
                                                }
                                                catch (MatchException v54) {
                                                    throw fr_0.d("\u00c2", (Object)v54, (long)-519516755929578250L, (long)var2_2);
                                                }
lbl319:
                                                // 2 sources

                                                v55 = new Object[2];
                                                v55[1] = var8_5;
                                                v55[0] = this.g;
                                                v53 /* !! */  = fr_0.d("\u00ed", (Object)this.r, (Object)v55, (long)-516138053332359411L, (long)var2_2);
                                                if (var26_14 != null) break block111;
                                            }
                                            catch (MatchException v56) {
                                                throw fr_0.d("\u00c2", (Object)v56, (long)-519516755929578250L, (long)var2_2);
                                            }
                                            if (v53 /* !! */  != false) break block113;
                                        }
                                        catch (MatchException v57) {
                                            throw fr_0.d("\u00c2", (Object)v57, (long)-519516755929578250L, (long)var2_2);
                                        }
                                    }
                                    v53 /* !! */  = (CallSite)true;
                                    break block111;
                                }
                                v53 /* !! */  = (CallSite)false;
                            }
                            var30_19 /* !! */  = v53 /* !! */ ;
                            try {
                                try {
                                    v58 = var30_19 /* !! */ ;
                                    if (var26_14 != null) break block114;
                                    if (v58 == false) break block115;
                                }
                                catch (MatchException v59) {
                                    throw fr_0.d("\u00c2", (Object)v59, (long)-519516755929578250L, (long)var2_2);
                                }
                                v60 = new Object[3];
                                v60[2] = var22_12;
                                v60[1] = fr_0.d("\u00ed", (Object)var28_17, (long)-512925084601160039L, (long)var2_2);
                                v60[0] = fr_0.d("c", (Object)fr_0.b, (long)-516849587049750033L, (long)var2_2);
                                cfr_temp_3 = fr_0.d("\u00ed", (Object)fr_0.d("\u00ef", (long)-515177923763884475L, (long)var2_2), (Object)v60, (long)-513009572343735583L, (long)var2_2) - (double)fr_0.d("\u00ed", (Object)((Float)fr_0.d("\u00ed", (Object)this.c, (long)-511759653699929341L, (long)var2_2)), (long)-518436845168533245L, (long)var2_2);
                                v58 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                            }
                            catch (MatchException v61) {
                                throw fr_0.d("\u00c2", (Object)v61, (long)-519516755929578250L, (long)var2_2);
                            }
                        }
                        try {
                            if (var26_14 != null) break block116;
                            if (v58 < 0) break block115;
                        }
                        catch (MatchException v62) {
                            throw fr_0.d("\u00c2", (Object)v62, (long)-519516755929578250L, (long)var2_2);
                        }
                        v58 = (reference)true;
                    }
                    fr_0.s = v58;
                    return;
                }
                if (var26_14 == null) continue;
            }
        }
    }

    private boolean lambda$new$0(Boolean bl) {
        long l = u ^ 0x3108F757297AL;
        return (boolean)fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.a, (long)4347861600214745008L, (long)l)), (Object)fr_0.b("h", (int)5816, (long)(0x972F4F477ADCDACL ^ l)), (long)4352615223175419406L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        long l = u ^ 0x74807A716BF6L;
        return (boolean)fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.a, (long)9140882956850183484L, (long)l)), (Object)fr_0.b("h", (int)925, (long)(0x1C134322DFA59A0DL ^ l)), (long)9145647505939256450L, (long)l);
    }

    private boolean lambda$new$1(String string) {
        long l = u ^ 0x507BD34D560BL;
        return (boolean)fr_0.d("\u00ed", (String)((Object)fr_0.d("\u00ed", (Object)this.a, (long)4839069858132263105L, (long)l)), (Object)fr_0.b("h", (int)1765, (long)(0x5CB8864B91B1228EL ^ l)), (long)4834325066429655423L, (long)l);
    }

    private static boolean lambda$onTick$3(class_2338 class_23382) {
        boolean bl;
        long l = u ^ 0x5759AF6960D8L;
        try {
            bl = fr_0.d("\u00ed", (Object)fr_0.d("\u00ed", (Object)fr_0.d("c", (Object)b, (long)8487521498322588323L, (long)l), (Object)class_23382, (long)8491953575571924036L, (long)l), (long)8487762443247694250L, (long)l) != fr_0.d("\u00ef", (long)8485010048619378257L, (long)l);
        }
        catch (MatchException matchException) {
            throw fr_0.d("\u00c2", (Object)matchException, (long)8492452211060689383L, (long)l);
        }
        return bl;
    }

    private static void lambda$calculate$9(class_239 class_2392) {
        long l = u ^ 0x7B6732F924CEL;
        long l2 = l ^ 0x41B610D60A7FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (class_3965)class_2392;
        fr_0.d("\u00c2", (Object)objectArray, (long)3592690174637326568L, (long)l);
    }

    private static boolean lambda$onTick$5(class_2338 class_23382) {
        Object object;
        block2: {
            block3: {
                long l = u ^ 0x28B72819993DL;
                long l2 = l ^ 0x168AE5822053L;
                CallSite callSite = fr_0.d("\u00c2", (long)-8345272714308895430L, (long)l);
                try {
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l2;
                    objectArray[1] = fr_0.d("\u00ef", (long)-8348072538879619148L, (long)l);
                    objectArray[0] = class_23382;
                    object = fr_0.d("\u00c2", (Object)objectArray, (long)-8345694989849096561L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw fr_0.d("\u00c2", (Object)matchException, (long)-8341159486115794942L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static void lambda$onTick$6(class_3965 class_39652) {
        long l = u ^ 0x2BE202A13215L;
        long l2 = l ^ 0x1133208E1CA4L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_39652;
        fr_0.d("\u00c2", (Object)objectArray, (long)2810417867371271731L, (long)l);
    }

    private static boolean lambda$calculate$7(class_2338 class_23382) {
        long l = u ^ 0x49304CE6C62CL;
        long l2 = l ^ 0x770D817D7F42L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = fr_0.d("\u00ef", (long)-3227724380757012315L, (long)l);
        objectArray[0] = class_23382;
        return (boolean)fr_0.d("\u00c2", (Object)objectArray, (long)-3224785035085819490L, (long)l);
    }

    private dJ lambda$calculate$8(class_2338 class_23382) {
        long l;
        long l2 = l = u ^ 0x4C9451D3634EL;
        long l3 = l2 ^ 0x6225E78BBB74L;
        long l4 = l2 ^ 0x2141835677C0L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        return new dJ((float)fr_0.d("\u00ed", (Object)this.g, (Object)objectArray, (long)8528379599544807006L, (long)l), l3);
    }

    private static boolean lambda$onTick$4(class_2338 class_23382) {
        Object object;
        block2: {
            block3: {
                long l = u ^ 0x2EC50876E169L;
                long l2 = l ^ 0x10F8C5ED5807L;
                CallSite callSite = fr_0.d("\u00c2", (long)-829888440082053778L, (long)l);
                try {
                    Object[] objectArray = new Object[3];
                    objectArray[2] = l2;
                    objectArray[1] = fr_0.d("\u00ef", (long)-832684123233683488L, (long)l);
                    objectArray[0] = class_23382;
                    object = fr_0.d("\u00c2", (Object)objectArray, (long)-830310577109272869L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw fr_0.d("\u00c2", (Object)matchException, (long)-834791188977465258L, (long)l);
                }
                object = 1;
                break block2;
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
            return MethodHandles.lookup().findStatic(fr_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fr_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fr_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


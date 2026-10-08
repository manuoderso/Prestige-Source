/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.ge_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.ref.Cleaner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bT
implements cF,
AutoCloseable {
    public ge_0 a;
    private final bS b;
    private final bS c;
    private final Cleaner.Cleanable d;
    private ByteBuffer e;
    private ByteBuffer f;
    private final Vector4f g;
    private int h;
    private static final long i;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final long[] r;
    private static final Long[] s;
    private static final Map t;
    private static final Object[] w;
    private static final String[] x;

    public bT(ge_0 ge_02, bS bS2, bS bS3, long l) {
        long l2 = (l = i ^ l) ^ 0x3628D18F31F5L;
        this.g = new Vector4f();
        this.h = 0;
        this.a = ge_02;
        this.b = bS2;
        this.c = bS3;
        Object[] objectArray = new Object[4];
        objectArray[3] = l2;
        objectArray[2] = (int)bT.b("m", (int)17150, (long)(0x1FA0694D35EE229CL ^ l));
        objectArray[1] = (long)bT.e("\u00d6", (Object)bT.e("\u00d6", (Object)bS2, (Object)new Object[0], (long)-4289606514223433937L, (long)l), (long)-4289407031811320905L, (long)l);
        objectArray[0] = (long)bT.c("f", (int)8927, (long)(0x50089CA4F479E196L ^ l));
        this.e = bT.e("\u00d6", (Object)bS2, (Object)objectArray, (long)-4287487438916318751L, (long)l);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = (int)bT.b("m", (int)17150, (long)(0x1FA0694D35EE229CL ^ l));
        objectArray2[1] = (long)bT.e("\u00d6", (Object)bT.e("\u00d6", (Object)bS3, (Object)new Object[0], (long)-4289606514223433937L, (long)l), (long)-4289407031811320905L, (long)l);
        objectArray2[0] = (long)bT.c("f", (int)8927, (long)(0x50089CA4F479E196L ^ l));
        this.f = bT.e("\u00d6", (Object)bS3, (Object)objectArray2, (long)-4287487438916318751L, (long)l);
        this.d = bT.e("\u00d6", (Object)dp_0.a, (Object)this, () -> bT.lambda$new$1(bS2, bS3), (long)-4289647772484768230L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        bT.i = hc.a(3549429246988342148L, -6267308596997230581L, MethodHandles.lookup().lookupClass()).a(236852160549260L);
                        bT.w = new Object[75];
                        bT.x = new String[75];
                        bT.b();
                        bT.q = new HashMap<K, V>(13);
                        var11 = bT.i ^ 55732752175603L;
                        var13_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new long[4];
                        var16_4 = 0;
                        var17_5 = "\u00aaK';\u00f2\u00d0\u00a6\u00cd\u001dn\u00c9\u009c\u0095\u001f\u00bd\u008b";
                        var18_6 = "\u00aaK';\u00f2\u00d0\u00a6\u00cd\u001dn\u00c9\u009c\u0095\u001f\u00bd\u008b".length();
                        var15_7 = 0;
                        while (true) {
                            var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                            v3 = var19_3;
                            v4 = var16_4++;
                            v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            var17_5 = "\u00bbg\u0094\u00cf9\u00c8g\u0000\u0091W;\u0080\u008bP\u0095v";
                            var18_6 = "\u00bbg\u0094\u00cf9\u00c8g\u0000\u0091W;\u0080\u008bP\u0095v".length();
                            var15_7 = 0;
                            while (true) {
                                var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                                v3 = var19_3;
                                v4 = var16_4++;
                                v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var21_9 = v5;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    v7 = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl73:
                        // 1 sources

                        ** continue;
                    }
                }
                bT.o = var19_3;
                bT.p = new Integer[4];
                bT.t = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u00f8\u00bey\u00f1'\u00dd\u00e0\u008c\u00fc\u00d3r\u00c7\u0011B\u00da\u0082";
                var5_16 = "\u00f8\u00bey\u00f1'\u00dd\u00e0\u008c\u00fc\u00d3r\u00c7\u0011B\u00da\u0082".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        bT.r = var6_13;
        bT.s = new Long[2];
    }

    @Override
    public bT e(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x39FD3AB52696L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = 4;
        bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)5225512279991071697L, (long)l);
        bT.e("\u00d6", (Object)this.e, (int)n, (long)5231853665377015175L, (long)l);
        return this;
    }

    @Override
    public cF e(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x248F0CA9EED5L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-4171009016711311517L, (long)l);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (x[n3] != null) {
            return n3;
        }
        Object object = w[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 5;
            case 1 -> 48;
            case 2 -> 51;
            case 3 -> 0;
            case 4 -> 38;
            case 5 -> 34;
            case 6 -> 26;
            case 7 -> 1;
            case 8 -> 21;
            case 9 -> 45;
            case 10 -> 20;
            case 11 -> 31;
            case 12 -> 62;
            case 13 -> 25;
            case 14 -> 52;
            case 15 -> 8;
            case 16 -> 17;
            case 17 -> 57;
            case 18 -> 43;
            case 19 -> 16;
            case 20 -> 19;
            case 21 -> 3;
            case 22 -> 28;
            case 23 -> 37;
            case 24 -> 4;
            case 25 -> 55;
            case 26 -> 24;
            case 27 -> 14;
            case 28 -> 30;
            case 29 -> 46;
            case 30 -> 9;
            case 31 -> 22;
            case 32 -> 41;
            case 33 -> 42;
            case 34 -> 58;
            case 35 -> 2;
            case 36 -> 12;
            case 37 -> 47;
            case 38 -> 61;
            case 39 -> 10;
            case 40 -> 40;
            case 41 -> 32;
            case 42 -> 49;
            case 43 -> 63;
            case 44 -> 6;
            case 45 -> 18;
            case 46 -> 35;
            case 47 -> 44;
            case 48 -> 11;
            case 49 -> 54;
            case 50 -> 23;
            case 51 -> 13;
            case 52 -> 7;
            case 53 -> 53;
            case 54 -> 39;
            case 55 -> 59;
            case 56 -> 60;
            case 57 -> 29;
            case 58 -> 50;
            case 59 -> 33;
            case 60 -> 15;
            case 61 -> 56;
            case 62 -> 27;
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
        bT.x[n3] = new String(cArray);
        return n3;
    }

    @Override
    public bT i(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        this.h = n;
        return this;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public cF b(Object[] objectArray) {
        float[] fArray = (float[])objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x5E4496DAD15L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = fArray;
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)3182194465840610803L, (long)l);
    }

    @Override
    public void b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l;
        long l3 = l2 ^ 0x628E5ADD9B81L;
        long l4 = l2 ^ 0x3FA73CA65B84L;
        long l5 = l2 ^ 0xF30A3D78B47L;
        try {
            if (bT.e("\u00d6", (Object)this.e, (long)7931497479831690668L, (long)l) >= n) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw bT.e("\u00cb", (Object)matchException, (long)7930434158882914416L, (long)l);
        }
        CallSite callSite = bT.e("\u00d6", (Object)this.e, (long)7929319969697381296L, (long)l);
        CallSite callSite2 = bT.e("\u00cb", (int)(callSite << 1), (int)(callSite + (n - bT.e("\u00d6", (Object)this.e, (long)7931497479831690668L, (long)l))), (long)7929227848317836466L, (long)l);
        CallSite callSite3 = bT.e("\u00d6", (Object)this.e, (long)7930519775110416911L, (long)l);
        CallSite callSite4 = bT.e("\u00cb", (int)callSite3, (long)7929655524258283845L, (long)l);
        bT.e("\u00d6", (Object)this.e, (long)7930769571646790241L, (long)l);
        bT.e("\u00cb", (Object)this.e, (Object)callSite4, (long)7931301243329365109L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        bT.e("\u00d6", (Object)this.b, (Object)objectArray2, (long)7931167854103869879L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l4;
        objectArray3[1] = (long)callSite2;
        objectArray3[0] = (int)bT.e("\u00d6", (Object)this.b, (Object)new Object[0], (long)7930145830503710216L, (long)l);
        bT.e("\u00d6", (Object)this.b, (Object)objectArray3, (long)7931345587856250253L, (long)l);
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = l3;
        objectArray4[2] = (int)bT.b("m", (int)17150, (long)(0x1FA03DEBBEBC88E8L ^ l));
        objectArray4[1] = (long)callSite2;
        objectArray4[0] = (long)bT.c("f", (int)8927, (long)(0x5008C8027F2B4BE2L ^ l));
        this.e = bT.e("\u00d6", (Object)this.b, (Object)objectArray4, (long)7929603391148467093L, (long)l);
        bT.e("\u00cb", (Object)callSite4, (Object)this.e, (long)7931301243329365109L, (long)l);
        bT.e("\u00d6", (Object)this.e, (int)callSite3, (long)7929087007687056391L, (long)l);
        bT.e("\u00cb", (Object)callSite4, (long)7930332318242906182L, (long)l);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bT.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2417;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bT.p[n2] = n3;
        }
        return p[n2];
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bT.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ff' || c == '\u00df' || c == '\u00e9' || c == 'K') {
                field = bT.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bT.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = w;
        w[0] = "\u0013(5uxo\u0010&mV/u\u001c\u000b6r0d\u000b";
        objectArray[1] = Integer.TYPE;
        bT.x[1] = "java/lang/Integer";
        objectArray[2] = ",4g?a2:4ber%-\u007fac~1<8vt5 \u001c";
        objectArray[3] = "}CT`x\u0011\bc_oi^imTdm\u0004\u001d";
        objectArray[4] = Void.TYPE;
        bT.x[4] = "java/lang/Void";
        objectArray[5] = "\u00198\u001fT$kl\u0018\u0014[5$\r\u0016\u001fP1~y";
        objectArray[6] = "\u0001!GuiE\u0017!B/zR\u0000jA)vF\u0011-V>=W6";
        objectArray[7] = "D\u0017[%|\u000317P*mLP9[!i\u0016$";
        objectArray[8] = "'9+XhK,6:\u0017\u000bF90";
        objectArray[9] = "!W1\u001b\u0013ETw:\u0014\u0002\n5y1\u001f\u0006PA";
        objectArray[10] = "\u0016M90PU\u0013X20O[\nK;s\u0012o\u001cR1lEw\rV2";
        objectArray[11] = "\u0005kTE\u0006\u001fpK_J\u0017P\u0011ETA\u0013\ne";
        objectArray[12] = "R5->p\b'\u0015&1aGF\u001b-:e\u001d2";
        objectArray[13] = "\u0002\b\u0017]-g\u0001\u0006O~vo\u000e\f\u0013";
        objectArray[14] = "\u001bTJk_!\u0010[[$<,\u0005VTO\t.\u0014EHc\u001e#";
        objectArray[15] = "i,\\T\u0014$\u007f,Y\u000e\u00073hgZ\b\u000b'y M\u001f@5E";
        objectArray[16] = "\u0016P<\u001dqncp7\u0012`!\u001eh$\u0015ihv";
        objectArray[17] = "t\r\u0015d}\u0018\u0001-\u001eklW`#\u0015`h\r\u0014";
        objectArray[18] = "yr\u0019y\u0017\u0005\fR\u0012v\u0006Jm\\\u0019}\u0002\u0010\u0019";
        objectArray[19] = Float.TYPE;
        bT.x[19] = "java/lang/Float";
        objectArray[20] = "U[Z@M\u0010 {QO\\_AuZDX\u00055";
        objectArray[21] = "\u0019i\\\u0003I\u001d\u000fiYYZ\n\u0018\"Z_V\u001e\teMH\u001d\t\r";
        objectArray[22] = "k\nET\u0010_\u001e*N[\u0001\u0010\u007f$EP\u0005J\u000b";
        objectArray[23] = ":\u00000\u0017\reO ;\u0018\u001c*..0\u0013\u0018pZ";
        objectArray[24] = "\")pn#KW\t{a2\u00046\u0007pj6^B";
        objectArray[25] = "2tT\"mEGT_-|\n&ZT&xPR";
        objectArray[26] = "ZHnSp%D@t\u001c=?^Jm@,5^]6S*?]@{\u001c\u001f$_DqQ\u0012?^N";
        objectArray[27] = "p'gHSk{(v\u0007\u000fb|hRE\u0018ft#c";
        objectArray[28] = "HIbh\u0002OCFs'cAHMw}";
        objectArray[29] = "8\u0011:eU\u00143\u001e+*)\r<\u001e-f\u0017\u001d";
        objectArray[30] = "\u0001(e\u000fZ7\n't@\u0006>\rgP\u0002\u0011:\u0005,aJ77\u000e(}\u000f\u00167\u000e";
        objectArray[31] = Long.TYPE;
        bT.x[31] = "java/lang/Long";
        objectArray[32] = "e<N666g\"\u0007N9:~![,:";
        objectArray[33] = "\u0010\u001b7B\u000eA\u0012\u0005~!\u0005Z\r\u0000(X\u0002";
        objectArray[34] = "@[>\u0003?\n5{5\f.ETu>\u0007*\u001f ";
        objectArray[35] = "\u0004ni1b7qNb>sx\u0010@i5w\"d";
        objectArray[36] = "gO\u0013T)\u001b\u0012o\u0018[8Tsa\u0013P<\u000e\u0007";
        objectArray[37] = "d\u0007\u0017S[\u001c\u0011'\u001c\\JSp)\u0017WN\t\u0004";
        objectArray[38] = "\u001f!\u00036\u0004l\u00164]3nvv9^ \u000bs\u0006/_ S\u001c";
        objectArray[39] = "\u0010WZI+\u0006\u0011@@2)\u0013PPWS6\u0012+\b\u0011I:\u0015D\u000fDM+t\u0010WZI+\u0006\u0011@@2";
        objectArray[40] = "*bou\u0001Zkc)5{B\u0013{<%\u0017Iop(?\u0001(*bou\u0001Zkc)5{";
        objectArray[41] = "/I\t\"#Km\n\u0002v\\L{K3wfRyZ\\p3Vh;\nt'BsT\r!#S\u0012\u0002\t57H}\u0005\\1&)";
        objectArray[42] = "\u0010A*LS\\\u0011V07MONF'7\u0010\u0014PL:X\u0017AT][";
        objectArray[43] = "`w*~oK!vl>\u0015UYny.yX%em4o9`w*~oK!vl>\u0015";
        objectArray[44] = "\u001f8\u0004L'\u0019^9B\f]\u0000&!W\u001c1\nZ*C\u0006'k\u001f8\u0004L'\u0019^9B\f]";
        objectArray[45] = "\\rkswWB,zr\tH9}\u007fei\u0000Sizog";
        objectArray[46] = "\f\u001am\u00132k\u000eI;\u001eV90\\j\u0007:1LW~\u001d,P\u000bCq\u0017,\"\nTkl";
        objectArray[47] = "LV])0B\u0013SNeYU\u001eW}p=W\u00182\r.\"[\u0012]\n{&Js\tRe\"J\u0001\bE\u007fY";
        objectArray[48] = "\u0000|!0,\u0006\u0002/w=HT<:&$$\\@12>2=]~0(/A\u000722*H";
        objectArray[49] = "2q0q=h>m+gL,>c4{0;)\f69%&+t.i'iSo>?\"*8f5psV7a?lwo#}*}L";
        objectArray[50] = "\u0000>Lc`WZrNa\u0007D\f\u007f0`bAYq@myI\u0002\u0003";
        objectArray[51] = "5ueT9\u001ett#\u0014C\u0005\fl6\u0004/\rpg\"\u001e9l7*7\b)\u001c2g?\fC";
        objectArray[52] = "\u0012_%{WZS^c;-G+Fv+AIWMb1W(\u0012_%{WZS^c;-";
        objectArray[53] = "(1\u0005\bCr)&\u001fsA}o\u0016\u0012\u000f99),\u001f\u0012V>|(\u000es\u0002fb,\u000e\u0001\u0003qxW";
        objectArray[54] = "xW\u001e\u0007r5z\u0004H\n\u0016dD\u0011\u0019\u0013zo8\u001a\r\tl\u000e}R\b\u0013waz\u0007\f\u0002\u0016";
        objectArray[55] = "v(i?M\u0000|h\"x=Ei0u>S^i<\u0013)VWscy=S]}Y\u007f.SY)3k+YW\u00135x+]\u0003y!}!S9\u007f2}%\u0007Sk7w+=\\p&k;PB.7jEXZl!m(F\u0004} \u0013";
        objectArray[56] = "6hI]bWimZ\u0011\u000b@din\u001afH\t=\u0011\fjTim\u001dYl%23K\u0007aU7~C\u0003\u000b";
        objectArray[57] = "70\u0013;?\u0004v1U{E\u0018\u000e)@k)\u0017r\"Tq?v70\u0013;?\u0004v1U{E";
        objectArray[58] = "}\u0005!\u0004PL<\u0004gD*TDTj\u0003U\u000e?\u0004uF\u0010>u\u0017$@\u001aE%\ba\u0005*";
        objectArray[59] = "\u0017qC,S\u0012\u0016fYWQ\u0007WvN6N\u0006,.\b,B\u0001C)](S`";
        objectArray[60] = "xH\nZ(%(\u000e\u0012UPz\u0016\u000b\u001dL<uj\u0000\tV*\u0014-M\u001c@:d(\u0000\u0014DP";
        objectArray[61] = "*\toF\ng4W~GtzO\u0006{P\u00140%\u0012~Z\u001a";
        objectArray[62] = " ]\rsJ4>\u0003\u001cr4(ER\u0019eTc/F\u001coZ";
        objectArray[63] = "\u0019iX\u007f@Q\u0018~B\u0004TGCw)?\\RYu[>KH\"";
        objectArray[64] = "AV\u0012\u000f\u001b\u0000\u0000WTOa\u0013xOA_\r\u0013\u0004DUE\u001brAV\u0012\u000f\u001b\u0000\u0000WTOa";
        objectArray[65] = "\u000b';=\u0014X\u001f;.,/\n\u000b'87/ZP!6;__\u001d)2Q";
        objectArray[66] = "\u0001Km\u00047\u0016@J+DM\r8R>T!\u0005DY*N7d\u0001Km\u00047\u0016@J+DM";
        objectArray[67] = "'\u0005\u0000U\u0005)f\u0004F\u0015\u007f6\u001e\u001cS\u0005\u0013:b\u0017G\u001f\u0005['\u0005\u0000U\u0005)f\u0004F\u0015\u007f";
        objectArray[68] = "NkvS|+L8 ^\u0018|r-qGtq\u000e&e]b\u0010IkpKr`L&xO\u0018";
        objectArray[69] = "(\u0019\"$B\u000ei\u0018dd8\u001c\u0011\u0000qtT\u001dm\u000benB|(\u0019\"$B\u000ei\u0018dd8";
        objectArray[70] = "|._KM7#+L\u0007$ ./}\u0011\\4CqP\u0007_?1pG\u001d$~%;M\fV\u007f2!6M\u001b.$ FHV& J";
        objectArray[71] = "y5\b\u000f\fE{f^\u0002h\u0017Es\u000f\u001b\u0004\u001f9x\u001b\u0001\u0012~~5\u000e\u0017\u0002\u000e{x\u0006\u0013h";
        objectArray[72] = "fLlRC\u000eg[v)A\u0001!dyNP\u0000]FvGYF7RsMW|fLlRC\u000eg[v)";
        objectArray[73] = ">[\"Q&c?L8*&|`T2L=wj=j\u0010'zdRmE#k\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "=F\u0003/?d|GEoE|\u0004_P\u007f)wxTDe?\u0016?\u0019Qs/f:TYwE";
    }

    @Override
    public int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)(bT.e("\u00d6", (Object)this.f, (long)6585544834020999013L, (long)l) / 4);
    }

    @Override
    public bT b(Object[] objectArray) {
        float[] fArray = (float[])objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x132112708F78L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = 4 * fArray.length;
        bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-2203784794900620737L, (long)l);
        for (float f : fArray) {
            bT.e("\u00d6", (Object)this.e, (float)f, (long)-2203937553051846643L, (long)l);
        }
        return this;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public cF c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = l ^ 0x9BE5916A195L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(f11);
        objectArray2[1] = Float.valueOf(f10);
        objectArray2[0] = Float.valueOf(f);
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-7206824848759361260L, (long)l);
    }

    @Override
    public int c(Object[] objectArray) {
        return this.h;
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = bT.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x73D;
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
                throw new RuntimeException("dev/zprestige/prestige/bT", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            bT.s[n2] = l4;
        }
        return s[n2];
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = i ^ l;
        bT.e("\u00d6", (Object)this.e, (int)0, (long)-7481398716746503646L, (long)l);
        bT.e("\u00d6", (Object)this.f, (int)0, (long)-7481398716746503646L, (long)l);
        this.h = 0;
    }

    @Override
    public bT c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = i ^ l) ^ 0x4FAFD0F0342CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)bT.b("m", (int)2834, (long)(0x14A162C69D7C752BL ^ l));
        bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)6502856916548067691L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)f, (long)6502730527365383001L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)f10, (long)6502730527365383001L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)f11, (long)6502730527365383001L, (long)l);
        return this;
    }

    private static Method h(long l, long l2) {
        int n = bT.e(l, l2);
        Object object = w[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = x[n];
                int n3 = string2.indexOf(8);
                clazz3 = bT.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bT.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bT.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        bT.w[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bT.f(2034877273698391L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bT.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bT.w[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bT.f(2034877273698391L, 0L);
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
    public cF h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return bT.e("\u00d6", (Object)this, (Object)new Object[0], (long)-5158495286584927745L, (long)l);
    }

    @Override
    public bT h(Object[] objectArray) {
        this.h = 0;
        return this;
    }

    @Override
    public bT f(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x216323E653E1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = 4;
        bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-5654671796916505963L, (long)l);
        bT.e("\u00d6", (Object)this.f, (int)(this.h + n), (long)-5654492331729572709L, (long)l);
        return this;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bT.e(l, l2);
            object = w[n];
            try {
                if (!(object instanceof String)) break block2;
                bT.w[n] = clazz = Class.forName(x[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public cF f(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x25CECF9E0DABL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-2566688238868633355L, (long)l);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bT.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bT.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void d(Object[] objectArray) {
        ge_0 ge_02 = (ge_0)objectArray[0];
        this.a = ge_02;
    }

    @Override
    public bT d(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        long l2 = (l = i ^ l) ^ 0x6BB8457907A8L;
        bT.e("\u00d6", (Object)matrix4f, (float)f, (float)f10, (float)f11, (float)1.0f, (Object)this.g, (long)7612660942019698497L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)bT.b("m", (int)6468, (long)(0x14946A7C926C54FBL ^ l));
        bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)7618663398812881647L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)bT.e("\u00ff", (Object)this.g, (long)7613066485757980689L, (long)l), (long)7618528033099149533L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)bT.e("\u00ff", (Object)this.g, (long)7613333657003068917L, (long)l), (long)7618528033099149533L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)bT.e("\u00ff", (Object)this.g, (long)7611970366333386741L, (long)l), (long)7618528033099149533L, (long)l);
        return this;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bT.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bT.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public cF d(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        long l2 = l ^ 0x7C73501A1532L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)2080243329021836087L, (long)l);
    }

    @Override
    public int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)(bT.e("\u00d6", (Object)this.e, (long)-5700570222287907614L, (long)l) / this.a.b);
    }

    @Override
    public bT a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x2A0C0F45EACAL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = 4;
        bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-8874153629091627123L, (long)l);
        bT.e("\u00d6", (Object)this.e, (float)f, (long)-8874286621574947393L, (long)l);
        return this;
    }

    @Override
    public cF a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x69C9FB690E06L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(f);
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-1544003640705083378L, (long)l);
    }

    @Override
    public void a(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        int n;
        block4: {
            block5: {
                n = (Integer)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4;
                l3 = l5 ^ 0x80EF40717EAL;
                l2 = l5 ^ 0x5527927CD7EFL;
                l = l5 ^ 0x65B00D0D072CL;
                CallSite callSite2 = bT.e("\u00cb", (long)-2133918581114542761L, (long)l4);
                try {
                    try {
                        callSite = bT.e("\u00d6", (Object)this.f, (long)-2127602897480019513L, (long)l4);
                        if (callSite2 != null) break block4;
                        if (callSite < n) break block5;
                    }
                    catch (MatchException matchException) {
                        throw bT.e("\u00cb", (Object)matchException, (long)-2133046678007215077L, (long)l4);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw bT.e("\u00cb", (Object)matchException, (long)-2133046678007215077L, (long)l4);
                }
            }
            callSite = bT.e("\u00d6", (Object)this.f, (long)-2134160861732554789L, (long)l4);
        }
        CallSite callSite3 = callSite;
        CallSite callSite4 = bT.e("\u00cb", (int)(callSite3 << 1), (int)(callSite3 + (n - bT.e("\u00d6", (Object)this.f, (long)-2127602897480019513L, (long)l4))), (long)-2134376132776816423L, (long)l4);
        CallSite callSite5 = bT.e("\u00d6", (Object)this.f, (long)-2133097401346406812L, (long)l4);
        CallSite callSite6 = bT.e("\u00cb", (int)callSite5, (long)-2134529000062874322L, (long)l4);
        bT.e("\u00d6", (Object)this.f, (long)-2133392957001083382L, (long)l4);
        bT.e("\u00cb", (Object)this.f, (Object)callSite6, (long)-2127160318800410594L, (long)l4);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        bT.e("\u00d6", (Object)this.c, (Object)objectArray2, (long)-2127315697942841892L, (long)l4);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = (long)callSite4;
        objectArray3[0] = (int)bT.e("\u00d6", (Object)this.c, (Object)new Object[0], (long)-2132767658428501405L, (long)l4);
        bT.e("\u00d6", (Object)this.c, (Object)objectArray3, (long)-2127205033231377946L, (long)l4);
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = l3;
        objectArray4[2] = (int)bT.b("m", (int)11581, (long)(0x28C6E5F3D0C2EB42L ^ l4));
        objectArray4[1] = (long)callSite4;
        objectArray4[0] = (long)bT.c("f", (int)24386, (long)(0x73CA9AEA82AE3A15L ^ l4));
        this.f = bT.e("\u00d6", (Object)this.c, (Object)objectArray4, (long)-2134434893814714370L, (long)l4);
        bT.e("\u00cb", (Object)callSite6, (Object)this.f, (long)-2127160318800410594L, (long)l4);
        bT.e("\u00d6", (Object)this.f, (int)callSite5, (long)-2133954023328280468L, (long)l4);
        bT.e("\u00cb", (Object)callSite6, (long)-2133200190315582419L, (long)l4);
    }

    @Override
    public cF g(Object[] objectArray) {
        int[] nArray = (int[])objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x279E0206938L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = nArray;
        return bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-3690007589771434614L, (long)l);
    }

    @Override
    public bT g(Object[] objectArray) {
        bT bT2;
        block4: {
            int[] nArray = (int[])objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = i ^ l) ^ 0x4645838E27DAL;
            CallSite callSite = bT.e("\u00cb", (long)-4199454787806051699L, (long)l);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = 4 * nArray.length;
            bT.e("\u00d6", (Object)this, (Object)objectArray2, (long)-4197927889406572882L, (long)l);
            int[] nArray2 = nArray;
            int n = nArray2.length;
            CallSite callSite2 = callSite;
            for (int i = 0; i < n; ++i) {
                int n2 = nArray2[i];
                try {
                    bT2 = this;
                    if (callSite2 == null) {
                        bT.e("\u00d6", (Object)bT2.f, (int)(this.h + n2), (long)-4198390556180686688L, (long)l);
                        if (callSite2 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw bT.e("\u00cb", (Object)matchException, (long)-4197456984758047807L, (long)l);
                }
            }
            bT2 = this;
        }
        return bT2;
    }

    private static Field g(long l, long l2) {
        int n = bT.e(l, l2);
        Object object = w[n];
        if (object instanceof String) {
            String string = x[n];
            int n2 = string.indexOf(8);
            Class clazz = bT.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bT.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bT.c(clazz3, string2, clazz2)) != null) {
                    bT.w[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bT.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bT.w[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bT.f(2034877273698391L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public cF j(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        return bT.e("\u00d6", (Object)this, (Object)new Object[]{n}, (long)-1966892101588119073L, (long)l);
    }

    @Override
    public void close() {
        long l = i ^ 0xA0E6DE67D07L;
        bT.e("\u00d6", (Object)this.d, (long)2114780312093175147L, (long)l);
    }

    private static void lambda$new$0(bS bS2, bS bS3) {
        long l = i ^ 0x5C216F4F171EL;
        long l2 = l ^ 0x2E8E80FC9217L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        bT.e("\u00d6", (Object)bS2, (Object)objectArray, (long)8593161221731033319L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        bT.e("\u00d6", (Object)bS3, (Object)objectArray2, (long)8593161221731033319L, (long)l);
    }

    private static void lambda$new$1(bS bS2, bS bS3) {
        long l = i ^ 0x3EA68A5552CBL;
        long l2 = l ^ 0x58391DC3BCC0L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = () -> bT.lambda$new$0(bS2, bS3);
        bT.e("\u00cb", (Object)objectArray, (long)3641799999298673700L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bT.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


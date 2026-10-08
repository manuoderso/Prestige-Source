/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.ap_0;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.az_0;
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dc_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.dz_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gf_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
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
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dd
 */
public class dd_0
extends dc_0 {
    private static final dd_0 a;
    private static final Map b;
    private static final Map c;
    private final int d;
    private final int e;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    private dd_0(long l) {
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x1F5B57CC3D06L;
        long l4 = l2 ^ 0x442F448B2ECCL;
        long l5 = l2 ^ 0x15B88D7A192CL;
        super((String)((Object)dd_0.a("t", (int)29675, (long)(0x55B4E3B433F0A339L ^ l))), (String)((Object)dd_0.a("t", (int)14972, (long)(0x4096D9FF32EEAA9L ^ l))), l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = dd_0.a("t", (int)30402, (long)(0x5B3947DEC7CA2614L ^ l));
        this.d = (int)dd_0.c("U", (Object)dd_0.c("U", (Object)this, (Object)new Object[0], (long)-1933236223753936563L, (long)l), (Object)objectArray, (long)-1932554032690016648L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = dd_0.a("t", (int)9719, (long)(0x6C92C45097937523L ^ l));
        this.e = (int)dd_0.c("U", (Object)dd_0.c("U", (Object)this, (Object)new Object[0], (long)-1933236223753936563L, (long)l), (Object)objectArray2, (long)-1932554032690016648L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l5;
        objectArray3[1] = 0;
        objectArray3[0] = dd_0.a("t", (int)9823, (long)(0x1E8911ADC6317688L ^ l));
        dd_0.c("U", (Object)dd_0.c("U", (Object)this, (Object)new Object[0], (long)-1933236223753936563L, (long)l), (Object)objectArray3, (long)-1933862316595251030L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        dd_0.f = hc.a(-4217630077611330152L, -806175165131134687L, MethodHandles.lookup().lookupClass()).a(73659548358023L);
                        v0 = var20 = dd_0.f ^ 92443167151489L;
                        var22_1 = v0 ^ 42350046534158L;
                        var24_2 = v0 ^ 54294522900664L;
                        dd_0.m = new Object[94];
                        dd_0.n = new String[94];
                        dd_0.b();
                        dd_0.i = new HashMap<K, V>(13);
                        var11_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v1 = SecretKeyFactory.getInstance("DES");
                        v2 = new byte[8];
                        v3 = v2;
                        v2[0] = (byte)(var20 >>> 56);
                        for (var12_4 = 1; var12_4 < 8; ++var12_4) {
                            v3 = v3;
                            v3[var12_4] = (byte)(var20 << var12_4 * 8 >>> 56);
                        }
                        var11_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                        var18_5 = new String[5];
                        var16_6 = 0;
                        var15_7 = "_\u00c8\u0098\u00a0\u009cuh\u008d\u0099r\u00f3\u008c\u00057\u00a4\u00feA\u00b8!\u00ff|/=\u0093\u00d8\u000ef\u00d3j\u00e3\u001f` \u00e8\u00d2\u00811\u00f2s\u00eb$w\u0086\u00ba\u0089\u001e\u009f\u00e9\u00c8>\u0080N\u00a0\u00ca\u0091\u0003\u00d8\u00d1\u0096ZXQ\u00b8\u00b4%\u0018\u009c\u00b0O\u00d5}\u0093\u00ec\u00ca\u00f29?>\u00c0\u00ab?7\u00c4\u00a8~~\fwpA";
                        var17_8 = "_\u00c8\u0098\u00a0\u009cuh\u008d\u0099r\u00f3\u008c\u00057\u00a4\u00feA\u00b8!\u00ff|/=\u0093\u00d8\u000ef\u00d3j\u00e3\u001f` \u00e8\u00d2\u00811\u00f2s\u00eb$w\u0086\u00ba\u0089\u001e\u009f\u00e9\u00c8>\u0080N\u00a0\u00ca\u0091\u0003\u00d8\u00d1\u0096ZXQ\u00b8\u00b4%\u0018\u009c\u00b0O\u00d5}\u0093\u00ec\u00ca\u00f29?>\u00c0\u00ab?7\u00c4\u00a8~~\fwpA".length();
                        var14_9 = 32;
                        var13_10 = -1;
lbl35:
                        // 2 sources

                        while (true) {
                            v4 = ++var13_10;
                            v5 = var15_7.substring(v4, v4 + var14_9);
                            v6 = -1;
                            break block18;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var18_5[var16_6++] = dd_0.a(var19_11).intern();
                            if ((var13_10 += var14_9) < var17_8) {
                                var14_9 = var15_7.charAt(var13_10);
                                ** continue;
                            }
                            var15_7 = "\u00ae\u0004\u00edX\u00c6\u00b1\\\u0012\u00f4\u0013\u00ac\u00e1\u00df\u001e\u00e5-x3X\u0090\u00f3\u009f0/\"\u00a8\u008flj\u00a8\u00ca\u008f\u00e5\u00c5\u0093\u001b\u00cd\u00f0\u0098e\u0003\u00aeL\u00e7\t\u0007\u00b7\u00fd\u00e9\u00caeA\u00b9\u00c8cF8\u00c6}\u00b2\u0007\u001e #4R\u00ea\u0096=x\u00ca\u00cf\u00c7\u00ef\u0013)\u001eH\u00c3\u00d6<\u00ca^4d+\u008a\u0081\u00ad\u00909j\u00eb\u00c0\u00d8\u00e7\u00d3\u009b\u00db\u0085\u00d7mtt\u00ffG\u008a\u00c1]\u00d0\u00cc\u0013%";
                            var17_8 = "\u00ae\u0004\u00edX\u00c6\u00b1\\\u0012\u00f4\u0013\u00ac\u00e1\u00df\u001e\u00e5-x3X\u0090\u00f3\u009f0/\"\u00a8\u008flj\u00a8\u00ca\u008f\u00e5\u00c5\u0093\u001b\u00cd\u00f0\u0098e\u0003\u00aeL\u00e7\t\u0007\u00b7\u00fd\u00e9\u00caeA\u00b9\u00c8cF8\u00c6}\u00b2\u0007\u001e #4R\u00ea\u0096=x\u00ca\u00cf\u00c7\u00ef\u0013)\u001eH\u00c3\u00d6<\u00ca^4d+\u008a\u0081\u00ad\u00909j\u00eb\u00c0\u00d8\u00e7\u00d3\u009b\u00db\u0085\u00d7mtt\u00ffG\u008a\u00c1]\u00d0\u00cc\u0013%".length();
                            var14_9 = 56;
                            var13_10 = -1;
lbl49:
                            // 2 sources

                            while (true) {
                                v7 = ++var13_10;
                                v5 = var15_7.substring(v7, v7 + var14_9);
                                v6 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            var18_5[var16_6++] = dd_0.a(var19_11).intern();
                            if ((var13_10 += var14_9) < var17_8) {
                                var14_9 = var15_7.charAt(var13_10);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_11 = var11_3.doFinal(v5.getBytes("ISO-8859-1"));
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl66:
                        // 1 sources

                        ** continue;
                    }
                }
                dd_0.g = var18_5;
                dd_0.h = new String[5];
                dd_0.l = new HashMap<K, V>(13);
                var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var20 >>> 56);
                for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                    v10 = v10;
                    v10[var1_13] = (byte)(var20 << var1_13 * 8 >>> 56);
                }
                var0_12.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_14 = new long[8];
                var3_15 = 0;
                var4_16 = "\u00b1\u00da\u009c\u00a6T\u000f\u00a6\u0098Y\u00da\u00ba%^\u0099q\u00e9y(Dk\u0098Q\"\u00c6\u00ec\u00ffuG\u00a2\u0005\u0085\u0013hz\u00f4s\u00f7\u00fa\u008b\u009b\u00df\u00ab\u00ed\u00be\u00d6T\u009c\u0007";
                var5_17 = "\u00b1\u00da\u009c\u00a6T\u000f\u00a6\u0098Y\u00da\u00ba%^\u0099q\u00e9y(Dk\u0098Q\"\u00c6\u00ec\u00ffuG\u00a2\u0005\u0085\u0013hz\u00f4s\u00f7\u00fa\u008b\u009b\u00df\u00ab\u00ed\u00be\u00d6T\u009c\u0007".length();
                var2_18 = 0;
                while (true) {
                    var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                    v11 = var6_14;
                    v12 = var3_15++;
                    v13 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                    v14 = -1;
                    break block20;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_18 < var5_17) ** continue;
                    var4_16 = "\u00da4\f;\u001c\u001d\u0082!d+$\u00ab\u0091\u00d1\u0084\u009d";
                    var5_17 = "\u00da4\f;\u001c\u001d\u0082!d+$\u00ab\u0091\u00d1\u0084\u009d".length();
                    var2_18 = 0;
                    while (true) {
                        var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                        v11 = var6_14;
                        v12 = var3_15++;
                        v13 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                        v14 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_18 < var5_17) ** continue;
                    break block21;
                    break;
                }
            }
            var8_20 = v13;
            var10_21 = var0_12.doFinal(new byte[]{(byte)(var8_20 >>> 56), (byte)(var8_20 >>> 48), (byte)(var8_20 >>> 40), (byte)(var8_20 >>> 32), (byte)(var8_20 >>> 24), (byte)(var8_20 >>> 16), (byte)(var8_20 >>> 8), (byte)var8_20});
            v15 = ((long)var10_21[0] & 255L) << 56 | ((long)var10_21[1] & 255L) << 48 | ((long)var10_21[2] & 255L) << 40 | ((long)var10_21[3] & 255L) << 32 | ((long)var10_21[4] & 255L) << 24 | ((long)var10_21[5] & 255L) << 16 | ((long)var10_21[6] & 255L) << 8 | (long)var10_21[7] & 255L;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        dd_0.j = var6_14;
        dd_0.k = new Integer[8];
        dd_0.a = new dd_0(var24_2);
        v16 = new Object[2];
        v16[1] = var22_1;
        v16[0] = 4;
        dd_0.b = dd_0.c("\u00e4", (Object)v16, (long)-5887645959789842087L, (long)var20);
        v17 = new Object[2];
        v17[1] = var22_1;
        v17[0] = 4;
        dd_0.c = dd_0.c("\u00e4", (Object)v17, (long)-5887645959789842087L, (long)var20);
    }

    public static void e(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        int n = (Integer)objectArray[7];
        float f13 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = (l = dd_0.f ^ l) ^ 0x5F9B1BD4054DL;
        ap_0 ap_02 = (ap_0)((Object)dd_0.c("U", (Object)b, (Object)dd_0.c("\u00e4", (int)n, (long)3073715946927707502L, (long)l), arg_0 -> dd_0.lambda$draw$4(n, arg_0), (long)3074016812917845092L, (long)l));
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = ap_02;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dd_0.c("U", (Object)a, (Object)objectArray2, (long)3077686400952131438L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (dd_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 43;
            case 2 -> 38;
            case 3 -> 3;
            case 4 -> 7;
            case 5 -> 39;
            case 6 -> 41;
            case 7 -> 45;
            case 8 -> 36;
            case 9 -> 11;
            case 10 -> 0;
            case 11 -> 42;
            case 12 -> 29;
            case 13 -> 48;
            case 14 -> 17;
            case 15 -> 31;
            case 16 -> 54;
            case 17 -> 32;
            case 18 -> 1;
            case 19 -> 49;
            case 20 -> 5;
            case 21 -> 55;
            case 22 -> 61;
            case 23 -> 33;
            case 24 -> 21;
            case 25 -> 60;
            case 26 -> 47;
            case 27 -> 15;
            case 28 -> 62;
            case 29 -> 20;
            case 30 -> 25;
            case 31 -> 13;
            case 32 -> 58;
            case 33 -> 16;
            case 34 -> 34;
            case 35 -> 22;
            case 36 -> 53;
            case 37 -> 51;
            case 38 -> 8;
            case 39 -> 46;
            case 40 -> 28;
            case 41 -> 63;
            case 42 -> 59;
            case 43 -> 12;
            case 44 -> 10;
            case 45 -> 9;
            case 46 -> 52;
            case 47 -> 24;
            case 48 -> 26;
            case 49 -> 14;
            case 50 -> 27;
            case 51 -> 19;
            case 52 -> 56;
            case 53 -> 37;
            case 54 -> 2;
            case 55 -> 44;
            case 56 -> 35;
            case 57 -> 18;
            case 58 -> 57;
            case 59 -> 50;
            case 60 -> 30;
            case 61 -> 4;
            case 62 -> 23;
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
        dd_0.n[n3] = new String(cArray);
        return n3;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dd_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void b(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        int n = (Integer)objectArray[6];
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = (l = dd_0.f ^ l) ^ 0x668AA889780BL;
        ap_0 ap_02 = (ap_0)((Object)dd_0.c("U", (Object)b, (Object)dd_0.c("\u00e4", (int)n, (long)6336055944992598056L, (long)l), arg_0 -> dd_0.lambda$draw$1(n, arg_0), (long)6336321754857115938L, (long)l));
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = ap_02;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dd_0.c("U", (Object)a, (Object)objectArray2, (long)6336593709715431976L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62B6;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])dd_0.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    dd_0.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dd_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "R\f\u0004\u000f@\u0011W\u0019\u000f\u000fC\u0016X\u0010\u0004M\u0002!qOP";
        objectArray[1] = Integer.TYPE;
        dd_0.n[1] = "java/lang/Integer";
        objectArray[2] = Void.TYPE;
        dd_0.n[2] = "java/lang/Void";
        objectArray[3] = "8\u0010zW}t.\u0010\u007f\rnc9[|\u000bbw(\u001ck\u001c)e,";
        objectArray[4] = "%1\f\u0001\u001eJP\u0011\u0007\u000e\u000f\u00051\u001f\f\u0005\u000b_E";
        objectArray[5] = "?K\u0011vG'=UX\u000eH+$V\u0004lK";
        objectArray[6] = Float.TYPE;
        dd_0.n[6] = "java/lang/Float";
        objectArray[7] = "\u001c\u0015Ogp:i5Dhau\b;Oce/|";
        objectArray[8] = "\u001d\u0006l\u001fqA\u0018\u0013g\u001frF\u0017\u001al]3q>F;";
        objectArray[9] = ":\u001c.%K\u0002?\t%%H\u00050\u0000.g\t2\u0019_x";
        objectArray[10] = "G83[\u0001&Y0)\u0014b2]";
        objectArray[11] = "\u0000P!:\u0002U\u000b_0uc[\u0000T4/";
        objectArray[12] = "7<qK\u0002>)4k\u0004J>3>sCC%s\u001brDO?42i";
        objectArray[13] = "Zl9s\u001a;Qc(<}9Dh(wF";
        objectArray[14] = "r:\u0006c%rd:\u000396esq\u0000?:qb6\u0017(qfr";
        objectArray[15] = "u\u0013M@\u0017\t\u00003FO\u0006Fa=MD\u0002\u001c\u0015";
        objectArray[16] = "\u000f\u001d--5Xz=&\"$\u0017\u001b3-) Mo";
        objectArray[17] = "q\f\u0007\u000b\u0018Kg\f\u0002Q\u000b\\pG\u0001W\u0007Ha\u0000\u0016@L_e";
        objectArray[18] = "QK\u000f\u001f\u000e\u0010$k\u0004\u0010\u001f_Ee\u000f\u001b\u001b\u00051";
        objectArray[19] = Long.TYPE;
        dd_0.n[19] = "java/lang/Long";
        objectArray[20] = "S4b~}\u0002E4g$n\u0015R\u007fd\"b\u0001C8s5)\u0016T";
        objectArray[21] = "]\f4=\u000f\u0000(,?2\u001eOI\"49\u001a\u0015=";
        objectArray[22] = "\u0010\u0018!\u0016\u000e7\u0006\u0018$L\u001d \u0011S'J\u00114\u0000\u00140]Z! ";
        objectArray[23] = "B\u001co2E#7<d=TlV2o6P6\"";
        objectArray[24] = "3S[\u000bA.FsP\u0004Pa'}[\u000fT;S";
        objectArray[25] = "\u0017{;^B$\u0001{>\u0004Q3\u00160=\u0002]'\u0007w*\u0015\u001675";
        objectArray[26] = "bK8qt\u0013\u0017k3~e\\ve8ua\u0006\u0002";
        objectArray[27] = "c3U\u00196M\u0016\u0013^\u0016'\u0002w\u001dU\u001d#X\u0003";
        objectArray[28] = "KgA5\u0018\u001b>GJ:\tT_IA1\r\u000e+";
        objectArray[29] = "1U+>M+Du 1\\d%{+:X>Q";
        objectArray[30] = "\u0015g[F5^\u001ehJ\t]^\u0010gY";
        objectArray[31] = "\u0010\u0003\u0004w6Se#\u000fx'\u001c\u0004-\u0004s#Fp";
        objectArray[32] = "tw\u0012e#\u0014bw\u0017?0\u0003u<\u00149<\u0017d{\u0003.w\u0003r";
        objectArray[33] = "T\u0015\u000fcF!!5\u0004lWn@;\u000fgS44";
        objectArray[34] = "yuNTEgouK\u000eVpx>H\bZdiy_\u001f\u0011vU";
        objectArray[35] = ")U\\_L(\\uWP]g!mDWT.I";
        objectArray[36] = "x\u000flNR5\r/gACzl!lJG \u0018";
        objectArray[37] = "\u0001#%\u0006/u\u0017# \\<b\u0000h#Z0v\u0011/4M{c2";
        objectArray[38] = "c\u001fX\u000f\r0\u0016?S\u0000\u001c\u007fw1X\u000b\u0018%\u0003";
        objectArray[39] = "XPE\u001c+\u0001S_TSH\fFR[8}\u000eWAG\u0014j\u0003";
        objectArray[40] = "a;\u00122F^\u0014\u001b\u0019=W\u0011u\u0015\u00126SK\u0001";
        objectArray[41] = ">\u001e\u001drwwK>\u0016}f8*0\u001dvbb^";
        objectArray[42] = "/`I\u0014n^9`LN}I.+OHq]?lX_:I\u001f";
        objectArray[43] = "\u001eA7]\"\u001fka<R3P\no7Y7\n~";
        objectArray[44] = ",\u0013@Yd^:\u0013E\u0003wI-XF\u0005{]<\u001fQ\u00120I\u0007";
        objectArray[45] = "PfZx,'%FQw=hDHZ|920";
        objectArray[46] = "<\u0001dO=4*\u0001a\u0015.#=Jb\u0013\"7,\ru\u0004i#\t";
        objectArray[47] = "\u0018RX\\\"\u0011mrSS3^\f|XX7\u0004x";
        objectArray[48] = "\u001b\u00189>Bm\r\u0018<dQz\u001aS?b]n\u000b\u0014(u\u0016z,";
        objectArray[49] = ",\u0013q\u0005gFY3z\nv\t8=q\u0001rSL";
        objectArray[50] = "#}\r\u0012o\f5}\bH|\u001b\"6\u000bNp\u000f3q\u001cY;\u00183";
        objectArray[51] = "\u0019[\u0012lw\u001d\u000f[\u00176d\n\u0018\u0010\u00140h\u001e\tW\u0003'#\n\u001c";
        objectArray[52] = "\u0016l$`XxcL/oI7\u0002B$dMmv";
        objectArray[53] = "KjyJ\u0016k]j|\u0010\u0005|J!\u007f\u0016\th[fh\u0001B\u007fn";
        objectArray[54] = "P\u001a\u0000\u0001\u000f=%:\u000b\u000e\u001erD4\u0000\u0005\u001a(0";
        objectArray[55] = "4ZCq@\th\u0018\u000e<)X\u000eS\u0007|D\rjV[fD]\u000eSDy@BlQ\u000fbY2";
        objectArray[56] = "U\\~D`}MVj\u000e\u001aj3@~Mti]\u001b{\t+\u0000";
        objectArray[57] = "i=d\r 2=8d\u0004Gf1a~H;`\u0017jO_<`0x\u0006\u0005|s0kt\f+p$\u00046N$608|M;mV4=K!b$=jH5\r";
        objectArray[58] = "K!i)|\u0013\u0000:0:\u0018\u0014pa<2(\u0014\u0011l6vd";
        objectArray[59] = "\u0001o\u0012oN}\u001cf\u0005}0vd.D~] \u0000+\u0018d]pd(Dc\bx[|Ac\u0001\u001f";
        objectArray[60] = "M\u0003rvHO_\u0002rx(@-X4mE\u001eI]hwEN-\u0001omLAC\u0013nmB!";
        objectArray[61] = "{\u001a0\nSC1Pq\u0006bB#D6\u0015%RJQu\u001a\u0002\rzC \u0017b\rp[9I\u001dG:\u001a5x";
        objectArray[62] = "#qLs8\u0004hj\u0015`\\\u000e\u00181\u0019hl\u0003y<\u0013, ";
        objectArray[63] = "\u0004+.WErP..^\"5FnL_\u00193]}>VN0I\u0012|T\\+T`u\u0003_?;\"w\u0011D\"I+ \u0012PM";
        objectArray[64] = "Q\u0000NA\u001a4\u0005\u0005NH}d\u0003E,IFu\bV^@\u0011v\u001c9\u001cB\u0003m\u0001K\u0015\u0015\u0000yn";
        objectArray[65] = "rm7++}`l7%K\u007f\u00126q0&,v3-*&|\u0012o*0/s|}+0!\u0013";
        objectArray[66] = "MoM\u0017\u0003}\r:\t\u0006xm4l\u000e\u0002\u0015;PiR\u0018\u0015k4,\r\u0007\u0012\u007fMlXC\u0003\u0004";
        objectArray[67] = "I\u000b6zd\u001bB\u000f#r\u0001\u0000'MfglVCH:}l\u0006'M%bh\u0019EOnyqi";
        objectArray[68] = "Ro%=0d\fm)/Hy\b\u000f. &q\u00167r/HgR0(pxu\u0007=H}%n\\-)p/*\u0010Rt,0&\u00133y&tjlk2;!f\u000eiy 8\u0016";
        objectArray[69] = "\u000b;\u001d\u0015\b1K;\u001c\u0019b/:sT\u0017\u000f\u007f^v\b\r\u000f/:s\u0017\u0012\u000b0Xq\\\t\u0012@";
        objectArray[70] = "+V%Md\u0013k\u0003a\\\u001f\u0003RUfXrU6P:Br\u0005R\u0012g\u001d!\u0003nR0K#j";
        objectArray[71] = "\u0011\tz\u00109&Q\\>\u0001B6h\n9\u0005/`\f\u000fe\u001f/0hC1\u0000?d\u0018P\u007f\u0007._";
        objectArray[72] = "\u0012\r\u000fj\u0018\u001a\u001e\u001e\u001e\u0003\u001e\u0000<\u0007\u001ab\u000f\t)\u0001\u0016\u007f\f\u001e\u0018l\u0017=\u0013\u0004D\\\u0005h\u001edL\u0016\u001cj\u0001\u0006N]\u0007sq";
        objectArray[73] = ")\u0003\u0004xy.uAI5\u0010|\u0013\n@u}*w\u000f\u001co}z\u0013BGhp$#P\u0012e\u0010";
        objectArray[74] = "wM\u0012^:\u0004tR\u0012\u0013AT\u001b\u0004NQ,\u0002\u007f\u0001\u0012K,R\u001bS\bG#XiX\fR+=";
        objectArray[75] = "\u0019!\u0002\bo\u0001R:[\u001b\u000b\t\"aW\u0013;\u0006Cl]Ww";
        objectArray[76] = "-p\u001e-\u000e\u0001fkG>j\b\u00160K6Z\u0006w=Ar\u0016";
        objectArray[77] = "\u0010g\u000f&eUL%Bk\f\u0004*nK+aQNk\u00171a\u0001*&L6l_\u001a4\u0019;\f";
        objectArray[78] = "hMo6{;uDx$\u00050\r\f9'hfi\te=h6\r\u000e|`f=uEg9uY";
        objectArray[79] = "\nbqf&\u0011JbpjL\t;*8d!__/d~!\u000f;a8r(]\u000b-|%w`";
        objectArray[80] = "7r\u0019+Y)w']:\":NqZ>Oo*t\u0006$O?N1Y;H+7q\f\u007fYP";
        objectArray[81] = "\u001a^%k\u0003(\nE's::p\u0016xoWl\u0014\u0013$uW<pC;\u007f@8\u0017K3/]S";
        objectArray[82] = "QA{HtbSY(E\u000eh#\u001b)[c=G\u001euAcm#\u001bj^grA\u0019!E~\u0002";
        objectArray[83] = ";}\u0016`8N{}\u0017lRV\nv\u0006e>GveWp/?pl\u001eq*Cc=\u000b`R";
        objectArray[84] = "IzTM7\u0019\u0017xX_O\u0004\u0013\u001a_P!\f\r\"\u0005_O\u001aI%Y\u0000\u007f\b\u001c(9\r\"\u0013G8X\u0000(W\u000bG\u0005\\7[\b&\bVs\u0017w{TI\u007f\u0014\u0016v^\r3kK*A\u00010\nF \u0005MOR\r=PA-PF&I1";
        objectArray[85] = "}L\nqznoM\n\u007f\u001aj\u001d\u0017Ljw?y\u0012\u0010pwo\u001dN\u0017j~`s\\\u0016jp\u0000";
        objectArray[86] = "(\u0014\u001f\t\u0018\u000fmP\u001bH\u0018cx-\u001fO\u0004\u000e.I\u001a\u0013\u001e\u000e~-T\u0015\u0010\u000fkMV\rC\u0002\u0011";
        objectArray[87] = "qg3\u001cWpcf3\u00127~\u0011<u\u0007Z!u9)\u001dZq\u0011e.\u0007S~\u007fw/\u0007]\u001e";
        objectArray[88] = ">:JG\u0013g8n\u0012Fyy>lGW'~>vC+Ez\";QJHpfw.";
        objectArray[89] = "}_@BV\u0001o^@L6\f\u001d\u0004\u0006Y[Py\u0001ZC[\u0000\u001d]]YR\u000fsO\\Y\\o";
        objectArray[90] = "U[6\u0013Qb\nC'Dof\u000fr*\u0018\u0003U\u0006H7\u0003\u0015dkIu\u001c\u000f8[[ \u0011oxUZ+O_j\u0000WKG\u0015s\u0002H)E^h\u001b8";
        objectArray[91] = ")X\u0013RP2i\rWC+\"P[PGFt4^\f]F$P\u001e\u0013\u0000G9o[\u0004EBK";
        objectArray[92] = "D\fRDXD\u0004Y\u0016U#T=\u000f\u0011QN\u0002Y\nMKNR=I\u0019VQ\fC\u000fUBM=";
        Object[] objectArray2 = objectArray;
        objectArray[93] = "\b\u0019G!rp\u0003\u001dR)\u0017nf_\u0017<z=\u0002ZK&zmf\u0017\u0010!w3V\u0005E,\u0017";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == 'j' || c == '$' || c == 'h') {
                field = dd_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dd_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dd_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void c(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        int n = (Integer)objectArray[6];
        Vector4f vector4f = (Vector4f)objectArray[7];
        long l = (Long)objectArray[8];
        long l2 = (l = dd_0.f ^ l) ^ 0x451B7402466L;
        ap_0 ap_02 = (ap_0)((Object)dd_0.c("U", (Object)b, (Object)dd_0.c("\u00e4", (int)n, (long)829598655672513605L, (long)l), arg_0 -> dd_0.lambda$draw$2(n, arg_0), (long)829297623857876303L, (long)l));
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = ap_02;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dd_0.c("U", (Object)a, (Object)objectArray2, (long)836957816464440901L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = dd_0.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = dd_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = dd_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dd_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dd_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dd_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dd_0.f(823423364460395L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dd_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dd_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dd_0.f(823423364460395L, 0L);
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

    public static void f(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        ap_0 ap_02 = (ap_0)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = (l = dd_0.f ^ l) ^ 0x3B28F47CB636L;
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = new Vector4f(f13);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = ap_02;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dd_0.c("U", (Object)a, (Object)objectArray2, (long)-7364150881204966379L, (long)l);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dd_0.e(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                dd_0.m[n] = clazz = Class.forName(dd_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dd_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dd_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void d(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        int n = (Integer)objectArray[7];
        Vector4f vector4f = (Vector4f)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = (l = dd_0.f ^ l) ^ 0x340D6F6AB206L;
        ap_0 ap_02 = (ap_0)((Object)dd_0.c("U", (Object)b, (Object)dd_0.c("\u00e4", (int)n, (long)-7069697278832090587L, (long)l), arg_0 -> dd_0.lambda$draw$3(n, arg_0), (long)-7069963570268251345L, (long)l));
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = vector4f;
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = ap_02;
        objectArray2[2] = matrix4f;
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dd_0.c("U", (Object)a, (Object)objectArray2, (long)-7062408445983201243L, (long)l);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dd_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dd_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private dt_0 a(Object[] objectArray) {
        dt_0 dt_02;
        block2: {
            dt_0 dt_03;
            block3: {
                ap_0 ap_02 = (ap_0)objectArray[0];
                Vector4f vector4f = (Vector4f)objectArray[1];
                long l = (Long)objectArray[2];
                long l2 = l = f ^ l;
                long l3 = l2 ^ 0x2F897EA53190L;
                long l4 = l2 ^ 0x78FB16AC40C6L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = vector4f;
                CallSite callSite = dd_0.c("\u00e4", (Object)objectArray2, (long)2638187520242431590L, (long)l);
                Map map = (Map)((Object)dd_0.c("U", (Object)c, (Object)ap_02, dd_0::lambda$getRenderLayer$6, (long)2630512968482153036L, (long)l));
                dt_03 = (dt_0)((Object)dd_0.c("U", (Object)map, (Object)callSite, (long)2638866342241772673L, (long)l));
                CallSite callSite2 = dd_0.c("\u00e4", (long)2630453043587609878L, (long)l);
                try {
                    dt_02 = dt_03;
                    if (callSite2 != null) break block2;
                    if (dt_02 != null) break block3;
                }
                catch (MatchException matchException) {
                    throw dd_0.c("\u00e4", (Object)matchException, (long)2637967331325070260L, (long)l);
                }
                fW[] fWArray = new fW[dd_0.b("q", (int)21288, (long)(0x4D1AA6D1AFC61517L ^ l))];
                fWArray[0] = dd_0.c("\u00e4", (Object)new Object[]{arg_0 -> dd_0.lambda$getRenderLayer$7(ap_02, arg_0)}, (long)2637714320479367764L, (long)l);
                fWArray[1] = fW.a;
                fWArray[2] = dd_0.c("\u00e4", (Object)new Object[]{dd_0.c("U", (Object)this, (Object)new Object[0], (long)2638445175569408251L, (long)l)}, (long)2638807773849838879L, (long)l);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = true;
                objectArray3[0] = (int)dd_0.b("q", (int)9131, (long)(0x5DBC5A2843F0E591L ^ l));
                fWArray[3] = dd_0.c("\u00e4", (Object)objectArray3, (long)2636901223363740502L, (long)l);
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = true;
                objectArray4[0] = true;
                fWArray[4] = dd_0.c("\u00e4", (Object)objectArray4, (long)2637387722263739994L, (long)l);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = (int)dd_0.b("q", (int)1997, (long)(0x63C4B6EB7C9641F1L ^ l));
                objectArray5[0] = (int)dd_0.b("q", (int)11125, (long)(0x4AAC90014A93ED4EL ^ l));
                fWArray[5] = dd_0.c("\u00e4", (Object)objectArray5, (long)2638724230650957742L, (long)l);
                fWArray[dd_0.b("q", (int)3323, (long)(0x31E111A30D464AC6L ^ l))] = dd_0.c("\u00e4", (Object)new Object[]{arg_0 -> this.lambda$getRenderLayer$8(ap_02, (Vector4f)callSite, arg_0)}, (long)2639020075071123784L, (long)l);
                dt_03 = new dt_0(gf_0.g, 4, false, fWArray, l4);
                dd_0.c("U", (Object)map, (Object)callSite, (Object)dt_03, (long)2630325717783525975L, (long)l);
            }
            dt_02 = dt_03;
        }
        return dt_02;
    }

    public static void a(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        float f12 = ((Float)objectArray[5]).floatValue();
        int n = (Integer)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = (l = dd_0.f ^ l) ^ 0x75416C9F9C1DL;
        ap_0 ap_02 = (ap_0)((Object)dd_0.c("U", (Object)b, (Object)dd_0.c("\u00e4", (int)n, (long)-5478590995788477378L, (long)l), arg_0 -> dd_0.lambda$draw$0(n, arg_0), (long)-5478293753208736460L, (long)l));
        Object[] objectArray2 = new Object[10];
        objectArray2[9] = l2;
        objectArray2[8] = new Vector4f(0.0f);
        objectArray2[7] = Float.valueOf(f12);
        objectArray2[6] = Float.valueOf(f11);
        objectArray2[5] = Float.valueOf(f10);
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = ap_02;
        objectArray2[2] = new Matrix4f();
        objectArray2[1] = gK2;
        objectArray2[0] = aq_02;
        dd_0.c("U", (Object)a, (Object)objectArray2, (long)-5483684897278736834L, (long)l);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x35EF;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dd", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            dd_0.h[n2] = dd_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dd_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(byte[] byArray) {
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

    private static Field g(long l, long l2) {
        int n = dd_0.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = dd_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = dd_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dd_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dd_0.c(clazz3, string2, clazz2)) != null) {
                    dd_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dd_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dd_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dd_0.f(823423364460395L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void g(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        ap_0 ap_02 = (ap_0)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        float f12 = ((Float)objectArray[7]).floatValue();
        Vector4f vector4f = (Vector4f)objectArray[8];
        long l = (Long)objectArray[9];
        long l2 = l = dd_0.f ^ l;
        long l3 = l2 ^ 0x1BBE8E01F50FL;
        long l4 = l2 ^ 0x6727E93B19F3L;
        long l5 = l2 ^ 0x3001AB300B65L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l5;
        objectArray2[1] = vector4f;
        objectArray2[0] = ap_02;
        CallSite callSite = dd_0.c("U", (Object)this, (Object)objectArray2, (long)6069926223952018348L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = new az_0((dt_0)((Object)callSite), (arg_0, arg_1) -> dd_0.lambda$drawInternal$5(matrix4f, f, f10, f12, f11, arg_0, arg_1));
        dd_0.c("U", (Object)dd_0.c("\u00e4", (Object)objectArray3, (long)6069420369823598385L, (long)l), (Object)objectArray4, (long)6069658034356247309L, (long)l);
    }

    private void lambda$getRenderLayer$8(ap_0 ap_02, Vector4f vector4f, dy_0 dy_02) {
        long l = f ^ 0x3689B0EEE01CL;
        dd_0.c("\u00e4", (int)dd_0.b("q", (int)10487, (long)(0x673C832AA6E45198L ^ l)), (long)-7220554159106611786L, (long)l);
        dd_0.c("\u00e4", (int)dd_0.b("q", (int)24908, (long)(0x1395EB2FF3DC1822L ^ l)), (int)ap_02.c.a, (long)-7219283441676999346L, (long)l);
        dd_0.c("\u00e4", (int)this.e, (float)(1.0f / (float)dd_0.c("U", (Object)ap_02, (Object)new Object[0], (long)-7220619465969871033L, (long)l)), (float)(1.0f / (float)dd_0.c("U", (Object)ap_02, (Object)new Object[0], (long)-7220911840090634684L, (long)l)), (long)-7221407232470767588L, (long)l);
        dd_0.c("\u00e4", (int)this.d, (float)dd_0.c("\u00ce", (Object)vector4f, (long)-7220520902036239530L, (long)l), (float)dd_0.c("\u00ce", (Object)vector4f, (long)-7220877367944342792L, (long)l), (float)dd_0.c("\u00ce", (Object)vector4f, (long)-7217360415293901532L, (long)l), (float)dd_0.c("\u00ce", (Object)vector4f, (long)-7217087950311518302L, (long)l), (long)-7220277301608923981L, (long)l);
    }

    private static void lambda$drawInternal$5(Matrix4f matrix4f, float f, float f10, float f11, float f12, Float f13, cF cF2) {
        long l;
        long l2 = l = dd_0.f ^ 0x55CF73C0A204L;
        long l3 = l2 ^ 0x7A66EBF19D12L;
        long l4 = l2 ^ 0x19C142A861B9L;
        long l5 = l2 ^ 0x1DAE496125FEL;
        long l6 = l2 ^ 0x752B7CF1C515L;
        long l7 = l2 ^ 0x7425328FF5E2L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l6;
        objectArray2[3] = Float.valueOf((float)dd_0.c("U", (Object)f13, (long)-2749681304107611890L, (long)l));
        objectArray2[2] = Float.valueOf(f10 + f11);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = matrix4f;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l7;
        objectArray3[0] = new float[]{0.0f, 0.0f};
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l7;
        objectArray4[0] = new float[]{f12, f11};
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l6;
        objectArray5[3] = Float.valueOf((float)dd_0.c("U", (Object)f13, (long)-2749681304107611890L, (long)l));
        objectArray5[2] = Float.valueOf(f10 + f11);
        objectArray5[1] = Float.valueOf(f + f12);
        objectArray5[0] = matrix4f;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = new float[]{f12, 0.0f};
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l7;
        objectArray7[0] = new float[]{f12, f11};
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = l6;
        objectArray8[3] = Float.valueOf((float)dd_0.c("U", (Object)f13, (long)-2749681304107611890L, (long)l));
        objectArray8[2] = Float.valueOf(f10);
        objectArray8[1] = Float.valueOf(f + f12);
        objectArray8[0] = matrix4f;
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l7;
        objectArray9[0] = new float[]{f12, f11};
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l7;
        objectArray10[0] = new float[]{f12, f11};
        Object[] objectArray11 = new Object[5];
        objectArray11[4] = l6;
        objectArray11[3] = Float.valueOf((float)dd_0.c("U", (Object)f13, (long)-2749681304107611890L, (long)l));
        objectArray11[2] = Float.valueOf(f10);
        objectArray11[1] = Float.valueOf(f);
        objectArray11[0] = matrix4f;
        Object[] objectArray12 = new Object[2];
        objectArray12[1] = l7;
        objectArray12[0] = new float[]{0.0f, f11};
        Object[] objectArray13 = new Object[2];
        objectArray13[1] = l7;
        objectArray13[0] = new float[]{f12, f11};
        Object[] objectArray14 = new Object[2];
        objectArray14[1] = l5;
        objectArray14[0] = m_0.QUADS;
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l4;
        dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)dd_0.c("U", (Object)cF2, (Object)objectArray, (long)-2749590321982197699L, (long)l), (Object)objectArray2, (long)-2751336581619424109L, (long)l), (Object)objectArray3, (long)-2750493092315136642L, (long)l), (Object)objectArray4, (long)-2750493092315136642L, (long)l), (Object)objectArray5, (long)-2751336581619424109L, (long)l), (Object)objectArray6, (long)-2750493092315136642L, (long)l), (Object)objectArray7, (long)-2750493092315136642L, (long)l), (Object)objectArray8, (long)-2751336581619424109L, (long)l), (Object)objectArray9, (long)-2750493092315136642L, (long)l), (Object)objectArray10, (long)-2750493092315136642L, (long)l), (Object)objectArray11, (long)-2751336581619424109L, (long)l), (Object)objectArray12, (long)-2750493092315136642L, (long)l), (Object)objectArray13, (long)-2750493092315136642L, (long)l), (Object)objectArray14, (long)-2752239061530379634L, (long)l), (Object)objectArray15, (long)-2750333475555279003L, (long)l);
    }

    private static Map lambda$getRenderLayer$6(ap_0 ap_02) {
        long l = f ^ 0x24632C0427E3L;
        long l2 = l ^ 0x56F4D55D286CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (int)dd_0.b("q", (int)7671, (long)(0x3B257C80A9FEA360L ^ l));
        return dd_0.c("\u00e4", (Object)objectArray, (long)6640717359542797115L, (long)l);
    }

    private static void lambda$getRenderLayer$7(ap_0 ap_02, dz_0 dz_02) {
        long l = f ^ 0x25B6B194CC38L;
        long l2 = l ^ 0x6F95A3FE4E0CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (long)dd_0.c("\u00e4", (Object)new Object[0], (long)-5194594809763933687L, (long)l);
        dd_0.c("U", (Object)ap_02, (Object)objectArray, (long)-5192448882157427135L, (long)l);
    }

    private static ap_0 lambda$draw$2(int n, Integer n2) {
        long l = f ^ 0x5E679E39A586L;
        long l2 = l ^ 0x5C2BE534C660L;
        return new ap_0(n, n * 2, l2);
    }

    private static ap_0 lambda$draw$4(int n, Integer n2) {
        long l = f ^ 0x6D77EA26A599L;
        long l2 = l ^ 0x6F3B912BC67FL;
        return new ap_0(n, n * 2, l2);
    }

    private static ap_0 lambda$draw$3(int n, Integer n2) {
        long l = f ^ 0x685B3D27917BL;
        long l2 = l ^ 0x6A17462AF29DL;
        return new ap_0(n, n * 2, l2);
    }

    private static ap_0 lambda$draw$0(int n, Integer n2) {
        long l = f ^ 0x4B8CE703532DL;
        long l2 = l ^ 0x49C09C0E30CBL;
        return new ap_0(n, n * 2, l2);
    }

    private static ap_0 lambda$draw$1(int n, Integer n2) {
        long l = f ^ 0x75102B2C01F3L;
        long l2 = l ^ 0x775C50216215L;
        return new ap_0(n, n * 2, l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dd_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dd_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dd_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.dz_0;
import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gd_0;
import dev.zprestige.prestige.hc;
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
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntSupplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dy
 */
public class dy_0 {
    private final IntSupplier a;
    private final OptionalInt b;
    private final OptionalDouble c;
    public final fT d;
    private final int e;
    private final int f;
    private static final long g;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final long[] k;
    private static final Integer[] l;
    private static final Map m;
    private static final long[] n;
    private static final Long[] o;
    private static final Map p;
    private static final Object[] q;
    private static final String[] r;

    private dy_0(dz_0 dz_02, long l) {
        l = g ^ l;
        this.a = (IntSupplier)((Object)dy_0.d("\u00fe", (Object)dz_02.a, (Object)dy_0.a("y", (int)29473, (long)(0x5F03E15AD584CE41L ^ l)), (long)5319798321000629847L, (long)l));
        this.b = (OptionalInt)((Object)dy_0.d("\u00fe", (Object)dz_02.b, (Object)dy_0.a("y", (int)11853, (long)(0x5653E50022B4932CL ^ l)), (long)5319798321000629847L, (long)l));
        this.c = (OptionalDouble)((Object)dy_0.d("\u00fe", (Object)dz_02.c, (Object)dy_0.a("y", (int)5289, (long)(0x336258E9B0B729CBL ^ l)), (long)5319798321000629847L, (long)l));
        this.d = (fT)((Object)dy_0.d("\u00fe", (Object)dz_02.d, (Object)dy_0.a("y", (int)9978, (long)(0x2F7D5EDBDD09B99L ^ l)), (long)5319798321000629847L, (long)l));
        this.e = (int)dy_0.d("\u00c7", (Object)dz_02.d, (Object)new Object[0], (long)5320847880830932167L, (long)l);
        this.f = (int)dy_0.d("\u00c7", (Object)dz_02.d, (Object)new Object[0], (long)5320703783871020952L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                dy_0.g = hc.a(1633911854664618800L, -3723552999891371763L, MethodHandles.lookup().lookupClass()).a(8848032811325L);
                                dy_0.q = new Object[75];
                                dy_0.r = new String[75];
                                dy_0.a();
                                dy_0.j = new HashMap<K, V>(13);
                                var22 = dy_0.g ^ 136785399827072L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[4];
                                var29_4 = 0;
                                var28_5 = "\u00b0!@\u0017\u0085\u00de\u00d9\u008a\u0002eC\u00a3<\r\u0019fP\u00cc\u00eb\u0092\u00a1\u00ce\u001e\f'\u00c9\u00af\u00ec\u00f6\u000f@\u008f\u00c4\u00d6I\u00f9\u0005\u00d0\u00d2\u009c\u001aWB'b\u00f9\u00c8\u0017G\u00d1z\u00d4\u0003q\u0017\u00a60\u0007\u00eag\u008au\u00ace5\u00b3\u00cc\u0094\u0081\u00d6\u00b6s\u00dfl\u0003\u00b9\u0088\u00ca\u007f\u0090\u0004+\u00c4\u0018\u00c9?\u00ecR\u0082\u0003\u00fb7\u00cc\u00e6\u00d1\u00900\u00e6]\u00e1\u00a5/\u0000\u00d2D";
                                var30_6 = "\u00b0!@\u0017\u0085\u00de\u00d9\u008a\u0002eC\u00a3<\r\u0019fP\u00cc\u00eb\u0092\u00a1\u00ce\u001e\f'\u00c9\u00af\u00ec\u00f6\u000f@\u008f\u00c4\u00d6I\u00f9\u0005\u00d0\u00d2\u009c\u001aWB'b\u00f9\u00c8\u0017G\u00d1z\u00d4\u0003q\u0017\u00a60\u0007\u00eag\u008au\u00ace5\u00b3\u00cc\u0094\u0081\u00d6\u00b6s\u00dfl\u0003\u00b9\u0088\u00ca\u007f\u0090\u0004+\u00c4\u0018\u00c9?\u00ecR\u0082\u0003\u00fb7\u00cc\u00e6\u00d1\u00900\u00e6]\u00e1\u00a5/\u0000\u00d2D".length();
                                var27_7 = 56;
                                var26_8 = -1;
lbl32:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = dy_0.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u0001\u00bc\u00f2\u001axI\u00b61\u00beX\u0002\u00ad\u0097Z\u00c4[q\u00a4\u00e0r\u0007X\u00ad\u0017\u0095Z\u00d6\u00c7\u00c91\u00ac$\u00ea6)Y)\u0007\u00e0\u00ed+\"b>/Z\u0003\u00b0'\u00d4N\u00cb\u009e8\u00e1\u00d6@\u00ces\u00e0\u00fa/\u00e5\u00a1\\4:\u0089d\u0003M\u00b50\u0085\u00f1:\u00a2*\u00db\u008d\u00d0M%T\u00f6iV\u009e\u00dczB\u0094(\u0016?\u000b\u0012\\<\u00e6G\u00f10[\u00df\u0091\u00ceU\u00db\u0004\u00cf]\u00064\u00a2\u00c8\u0089U\u001a7\u00d5";
                                    var30_6 = "\u0001\u00bc\u00f2\u001axI\u00b61\u00beX\u0002\u00ad\u0097Z\u00c4[q\u00a4\u00e0r\u0007X\u00ad\u0017\u0095Z\u00d6\u00c7\u00c91\u00ac$\u00ea6)Y)\u0007\u00e0\u00ed+\"b>/Z\u0003\u00b0'\u00d4N\u00cb\u009e8\u00e1\u00d6@\u00ces\u00e0\u00fa/\u00e5\u00a1\\4:\u0089d\u0003M\u00b50\u0085\u00f1:\u00a2*\u00db\u008d\u00d0M%T\u00f6iV\u009e\u00dczB\u0094(\u0016?\u000b\u0012\\<\u00e6G\u00f10[\u00df\u0091\u00ceU\u00db\u0004\u00cf]\u00064\u00a2\u00c8\u0089U\u001a7\u00d5".length();
                                    var27_7 = 72;
                                    var26_8 = -1;
lbl46:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = dy_0.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        dy_0.h = var31_3;
                        dy_0.i = new String[4];
                        dy_0.m = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[10];
                        var14_13 = 0;
                        var15_14 = "\u00cd\u00d4Af\u00c3\u00c5\u00bf\\\u0006\u0018\bYd\u00ca\u00d2\u0011\u00c0z\f\"X[6\u0086\u009e\u00a8\u00d3\u00d9\u00ff\u00df\u00d3g\u0010\u00e0\u00c5\u00c6r\u0003\u00bdN`j\u009f3D\u00bc;\u00cf\n<o\u00e0\u00b7f+\u00baIk\u00ed\u00ce\u00b0%\u009dK";
                        var16_15 = "\u00cd\u00d4Af\u00c3\u00c5\u00bf\\\u0006\u0018\bYd\u00ca\u00d2\u0011\u00c0z\f\"X[6\u0086\u009e\u00a8\u00d3\u00d9\u00ff\u00df\u00d3g\u0010\u00e0\u00c5\u00c6r\u0003\u00bdN`j\u009f3D\u00bc;\u00cf\n<o\u00e0\u00b7f+\u00baIk\u00ed\u00ce\u00b0%\u009dK".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl102:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "5\u008b\u00cag\u00e4\u00aa\u00a2\u00c0,\u00eea\u00db\u00b4\u0081DV";
                            var16_15 = "5\u008b\u00cag\u00e4\u00aa\u00a2\u00c0,\u00eea\u00db\u00b4\u0081DV".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl121:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
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
                dy_0.k = var17_12;
                dy_0.l = new Integer[10];
                dy_0.p = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u00a0\u00c8\u00b0\u0099 \u009cn\u00aa0\u00a6J\u0080u\u00cc\u00e8\u00a6";
                var5_25 = "\u00a0\u00c8\u00b0\u0099 \u009cn\u00aa0\u00a6J\u0080u\u00cc\u00e8\u00a6".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl165:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        dy_0.n = var6_22;
        dy_0.o = new Long[2];
    }

    private void e(Object[] objectArray) {
        block13: {
            Object object;
            long l;
            block12: {
                CallSite callSite;
                int n;
                block10: {
                    block11: {
                        block8: {
                            block9: {
                                l = (Long)objectArray[0];
                                long l2 = l = g ^ l;
                                long l3 = l2 ^ 0x61A94C5CD607L;
                                long l4 = l2 ^ 0x69ACF81C7ED9L;
                                long l5 = l2 ^ 0x3D693ECCA58CL;
                                long l6 = l2 ^ 0x25B48BFC3107L;
                                n = 0;
                                callSite = dy_0.d("\u00fe", (long)-927946599335363566L, (long)l);
                                try {
                                    object = dy_0.d("\u00c7", (Object)this.b, (long)-928824610342402450L, (long)l);
                                    if (callSite != null) break block8;
                                    if (object == false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw dy_0.d("\u00fe", (Object)matchException, (long)-928478213141640140L, (long)l);
                                }
                                CallSite callSite2 = dy_0.d("\u00c7", (Object)this.b, (long)-928960078057644633L, (long)l);
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l4;
                                objectArray2[0] = (int)callSite2;
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = l6;
                                objectArray3[0] = (int)callSite2;
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l5;
                                objectArray4[0] = (int)callSite2;
                                Object[] objectArray5 = new Object[2];
                                objectArray5[1] = l3;
                                objectArray5[0] = (int)callSite2;
                                dy_0.d("\u00fe", (float)dy_0.d("\u00fe", (Object)objectArray2, (long)-929214699825344065L, (long)l), (float)dy_0.d("\u00fe", (Object)objectArray3, (long)-934651597980169603L, (long)l), (float)dy_0.d("\u00fe", (Object)objectArray4, (long)-935361123739576817L, (long)l), (float)dy_0.d("\u00fe", (Object)objectArray5, (long)-927822636588976784L, (long)l), (long)-929246623413225047L, (long)l);
                                n |= dy_0.b("k", (int)20921, (long)(0x686247E3EBBD506FL ^ l));
                            }
                            object = dy_0.d("\u00c7", (Object)this.c, (long)-928656076974176139L, (long)l);
                        }
                        try {
                            if (callSite != null) break block10;
                            if (object == false) break block11;
                        }
                        catch (MatchException matchException) {
                            throw dy_0.d("\u00fe", (Object)matchException, (long)-928478213141640140L, (long)l);
                        }
                        dy_0.d("\u00fe", (double)dy_0.d("\u00c7", (Object)this.c, (long)-929529143432603115L, (long)l), (long)-929336924691867185L, (long)l);
                        n |= dy_0.b("k", (int)18595, (long)(0x2C7ED2A19EE4C97AL ^ l));
                    }
                    object = n;
                }
                try {
                    try {
                        if (callSite != null) break block12;
                        if (object == false) break block13;
                    }
                    catch (MatchException matchException) {
                        throw dy_0.d("\u00fe", (Object)matchException, (long)-928478213141640140L, (long)l);
                    }
                    dy_0.d("\u00fe", (int)dy_0.b("k", (int)9652, (long)(0xEE508E9EE28A46FL ^ l)), (long)-934966735176026099L, (long)l);
                    dy_0.d("\u00fe", (boolean)true, (long)-935562502454435634L, (long)l);
                    dy_0.d("\u00fe", (boolean)true, (boolean)true, (boolean)true, (boolean)true, (long)-934859246380213138L, (long)l);
                    object = n;
                }
                catch (MatchException matchException) {
                    throw dy_0.d("\u00fe", (Object)matchException, (long)-928478213141640140L, (long)l);
                }
            }
            dy_0.d("\u00fe", (int)object, (long)-928929340398548136L, (long)l);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x72C8;
        if (dy_0.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dy_0.l[n2] = n3;
        }
        return dy_0.l[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dy_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dy_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dy_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dy_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dy_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dy_0.a(l, l2);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                dy_0.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    public void b(Object[] var1_1) {
        block22: {
            block21: {
                block20: {
                    var4_2 = (gK)var1_1[0];
                    var2_3 = (Long)var1_1[1];
                    var2_3 = dy_0.g ^ var2_3;
                    var6_4 = dy_0.d("\u00c7", (Object)this.d, (Object)new Object[0], (long)3840187046441226967L, (long)var2_3);
                    var5_5 = dy_0.d("\u00fe", (long)3842533204900952670L, (long)var2_3);
                    var7_6 = dy_0.d("\u00fe", (long)3839458331029334031L, (long)var2_3);
                    try {
                        block19: {
                            block17: {
                                block18: {
                                    var8_7 = dy_0.d("\u00c7", (Object)var7_6, (int)dy_0.b("k", (int)31814, (long)(8231247607019584468L ^ var2_3)), (long)3841715978829486561L, (long)var2_3);
                                    var9_9 = dy_0.d("\u00c7", (Object)var7_6, (int)dy_0.b("k", (int)28071, (long)(896417376197847607L ^ var2_3)), (long)3841715978829486561L, (long)var2_3);
                                    v0 = this.e;
                                    if (var5_5 != null) break block17;
                                    try {
                                        block24: {
                                            if (v0 < 0) break block18;
                                            break block24;
                                            catch (Throwable v1) {
                                                throw dy_0.d("\u00fe", (Object)v1, (long)3841938918934448760L, (long)var2_3);
                                            }
                                        }
                                        dy_0.d("\u00c7", (Object)dy_0.d("\u00c7", (Object)var4_2, (long)3839899423491010071L, (long)var2_3), (Object)var8_7, (long)3842794741638094905L, (long)var2_3);
                                        dy_0.d("\u00c7", (Object)var8_7, (long)3843677348426888836L, (long)var2_3);
                                        dy_0.d("\u00fe", (int)this.e, (boolean)false, (Object)var8_7, (long)3842982828923442436L, (long)var2_3);
                                    }
                                    catch (Throwable v2) {
                                        throw dy_0.d("\u00fe", (Object)v2, (long)3841938918934448760L, (long)var2_3);
                                    }
                                }
                                v0 = this.f;
                            }
                            if (var5_5 != null) break block19;
                            try {
                                block25: {
                                    if (v0 < 0) break block20;
                                    break block25;
                                    catch (Throwable v3) {
                                        throw dy_0.d("\u00fe", (Object)v3, (long)3841938918934448760L, (long)var2_3);
                                    }
                                }
                                dy_0.d("\u00c7", (Object)dy_0.d("\u00c7", (Object)var4_2, (long)3843542300497697840L, (long)var2_3), (Object)var9_9, (long)3842794741638094905L, (long)var2_3);
                                dy_0.d("\u00c7", (Object)var9_9, (long)3843677348426888836L, (long)var2_3);
                                v0 = this.f;
                            }
                            catch (Throwable v4) {
                                throw dy_0.d("\u00fe", (Object)v4, (long)3841938918934448760L, (long)var2_3);
                            }
                        }
                        dy_0.d("\u00fe", (int)v0, (boolean)false, (Object)var9_9, (long)3842982828923442436L, (long)var2_3);
                    }
                    catch (Throwable var8_8) {
                        block23: {
                            try {
                                v5 = var7_6;
                                if (var5_5 == null) {
                                    if (v5 == null) break block23;
                                }
                                ** GOTO lbl60
                            }
                            catch (Throwable v6) {
                                throw dy_0.d("\u00fe", (Object)v6, (long)3841938918934448760L, (long)var2_3);
                            }
                            try {
                                v5 = var7_6;
lbl60:
                                // 2 sources

                                dy_0.d("\u00c7", (Object)v5, (long)3842437669603437353L, (long)var2_3);
                            }
                            catch (Throwable var9_10) {
                                dy_0.d("\u00c7", (Object)var8_8, (Object)var9_10, (long)3842650453699159570L, (long)var2_3);
                            }
                        }
                        throw var8_8;
                    }
                }
                try {
                    v7 = var7_6;
                    if (var5_5 != null) break block21;
                    if (v7 == null) break block22;
                }
                catch (Throwable v8) {
                    throw dy_0.d("\u00fe", (Object)v8, (long)3841938918934448760L, (long)var2_3);
                }
                v7 = var7_6;
            }
            dy_0.d("\u00c7", (Object)v7, (long)3842437669603437353L, (long)var2_3);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void c(Object[] objectArray) {
        gd_0 gd_02 = (gd_0)objectArray[0];
        bS bS2 = (bS)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        l = g ^ l;
        dy_0.d("\u00fe", (int)dy_0.d("\u00c7", (Object)gd_02, (Object)new Object[0], (long)-5745988547168101810L, (long)l), (long)-5744370185765618125L, (long)l);
        dy_0.d("\u00fe", (int)dy_0.b("k", (int)24640, (long)(0x7780E81CBE7B22C5L ^ l)), (int)dy_0.d("\u00c7", (Object)bS2, (Object)new Object[0], (long)-5739671720930908437L, (long)l), (long)-5739344197676515645L, (long)l);
        dy_0.d("\u00fe", (int)n, (int)n2, (int)dy_0.b("k", (int)28660, (long)(0x7FD119F193FCAD73L ^ l)), (long)dy_0.c("v", (int)13631, (long)(0x7FA736B54E3A354L ^ l)), (int)n3, (long)-5744582529745136070L, (long)l);
        dy_0.d("\u00fe", (int)0, (long)-5744370185765618125L, (long)l);
        dy_0.d("\u00fe", (int)dy_0.b("k", (int)24640, (long)(0x7780E81CBE7B22C5L ^ l)), (int)0, (long)-5739344197676515645L, (long)l);
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = dy_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static Field c(long l, long l2) {
        int n = dy_0.a(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = dy_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dy_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dy_0.a(clazz3, string2, clazz2)) != null) {
                    dy_0.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dy_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dy_0.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dy_0.b(2205579960620023L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2623;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = dy_0.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])p.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dy", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            dy_0.o[n2] = l4;
        }
        return o[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void d(Object[] objectArray) {
        gd_0 gd_02 = (gd_0)objectArray[0];
        bS bS2 = (bS)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        l = g ^ l;
        dy_0.d("\u00fe", (int)dy_0.d("\u00c7", (Object)gd_02, (Object)new Object[0], (long)9066722096246216671L, (long)l), (long)9067636836745982882L, (long)l);
        dy_0.d("\u00fe", (int)dy_0.b("k", (int)16457, (long)(0x5422FE48069ECF5AL ^ l)), (int)dy_0.d("\u00c7", (Object)bS2, (Object)new Object[0], (long)9063991862979406714L, (long)l), (long)9063655556449792850L, (long)l);
        dy_0.d("\u00fe", (int)n, (int)n2, (int)dy_0.b("k", (int)12545, (long)(0x553C75795600BE18L ^ l)), (long)dy_0.c("v", (int)29328, (long)(0x678AC478BAB9A96BL ^ l)), (long)9067904243477323180L, (long)l);
        dy_0.d("\u00fe", (int)0, (long)9067636836745982882L, (long)l);
        dy_0.d("\u00fe", (int)dy_0.b("k", (int)24640, (long)(0x7780BA75E31EEF54L ^ l)), (int)0, (long)9063655556449792850L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = dy_0.a(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = dy_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dy_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dy_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dy_0.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dy_0.b(2205579960620023L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dy_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dy_0.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dy_0.b(2205579960620023L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dy_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = g ^ l) ^ 0x2909AE4FBA0L;
        dy_0.d("\u00fe", (int)dy_0.b("k", (int)9769, (long)(0x6B7E58E29B26C6CBL ^ l)), (int)dy_0.d("\u00c7", (Object)this.a, (long)1308100179130796303L, (long)l), (long)1307233183867013279L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        dy_0.d("\u00c7", (Object)this, (Object)objectArray2, (long)1306324617832001759L, (long)l);
        dy_0.d("\u00fe", (int)dy_0.d("\u00c7", (Object)this.d, (Object)new Object[0], (long)1313467734426957222L, (long)l), (long)1313507680893820432L, (long)l);
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static dz_0 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = g ^ l) ^ 0x690A0A51C625L;
        return new dz_0(l2);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dc' || c == 'L' || c == '\u00df' || c == '\u00f8') {
                field = dy_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dy_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fe' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dy_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x74BF;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dy", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            dy_0.i[n2] = dy_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n3] != null) {
            return n3;
        }
        Object object = q[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 7;
            case 1 -> 53;
            case 2 -> 15;
            case 3 -> 11;
            case 4 -> 36;
            case 5 -> 22;
            case 6 -> 49;
            case 7 -> 31;
            case 8 -> 24;
            case 9 -> 25;
            case 10 -> 4;
            case 11 -> 13;
            case 12 -> 50;
            case 13 -> 28;
            case 14 -> 3;
            case 15 -> 63;
            case 16 -> 58;
            case 17 -> 35;
            case 18 -> 47;
            case 19 -> 40;
            case 20 -> 0;
            case 21 -> 33;
            case 22 -> 34;
            case 23 -> 2;
            case 24 -> 32;
            case 25 -> 43;
            case 26 -> 1;
            case 27 -> 19;
            case 28 -> 21;
            case 29 -> 57;
            case 30 -> 29;
            case 31 -> 52;
            case 32 -> 42;
            case 33 -> 62;
            case 34 -> 44;
            case 35 -> 55;
            case 36 -> 54;
            case 37 -> 48;
            case 38 -> 59;
            case 39 -> 56;
            case 40 -> 45;
            case 41 -> 16;
            case 42 -> 18;
            case 43 -> 60;
            case 44 -> 8;
            case 45 -> 26;
            case 46 -> 41;
            case 47 -> 10;
            case 48 -> 9;
            case 49 -> 17;
            case 50 -> 37;
            case 51 -> 20;
            case 52 -> 38;
            case 53 -> 12;
            case 54 -> 27;
            case 55 -> 61;
            case 56 -> 6;
            case 57 -> 30;
            case 58 -> 46;
            case 59 -> 51;
            case 60 -> 5;
            case 61 -> 14;
            case 62 -> 39;
            default -> 23;
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
        dy_0.r[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = q;
        q[0] = "\n\u001a[J\u001d|\u000f\u000fPJ\u001e{\u0000\u0006[\b_L)[\f";
        objectArray[1] = Integer.TYPE;
        dy_0.r[1] = "java/lang/Integer";
        objectArray[2] = Long.TYPE;
        dy_0.r[2] = "java/lang/Long";
        objectArray[3] = Void.TYPE;
        dy_0.r[3] = "java/lang/Void";
        objectArray[4] = "F\u00155s\u0011\u0005P\u00150)\u0002\u0012G^3/\u000e\u0006V\u0019$8E\u0012F";
        objectArray[5] = "_!+^\u0016\u001e*\u0001 Q\u0007QK\u000f+Z\u0003\u000b?";
        objectArray[6] = ";!MQiH-!H\u000bz_:jK\rvK+-\\\u001a=Z\f";
        objectArray[7] = "I\u000b?\n!4<+4\u00050{]%?\u000e4!)";
        objectArray[8] = "@,=u7fV,8/$qAg;)(eP ,>cwl";
        objectArray[9] = "t]K wn\u0001}@/f!|eS(oh\u0014";
        objectArray[10] = "deg(w%zm}g\u0016 zm~'8<Jkd+55";
        objectArray[11] = Double.TYPE;
        dy_0.r[11] = "java/lang/Double";
        objectArray[12] = "?BR\u000f\u0005\u0013)BWU\u0016\u0004>\tTS\u001a\u0010/NCDQ\u00049";
        objectArray[13] = "\u0012[@=Sxg{K2B7\u0006u@9Fmr";
        objectArray[14] = Float.TYPE;
        dy_0.r[14] = "java/lang/Float";
        objectArray[15] = ":3lUsD$;v\u001a\u0012A$;uZ<]\u0019<n";
        objectArray[16] = Boolean.TYPE;
        dy_0.r[16] = "java/lang/Boolean";
        objectArray[17] = "\u0002p\u0004Y\u0005;\u0014p\u0001\u0003\u0016,\u0003;\u0002\u0005\u001a8\u0012|\u0015\u0012Q/\u001f";
        objectArray[18] = "h\u001b$2|\u001dc\u00145}\u0006\u0019p\u0015%20\u001dg";
        objectArray[19] = "/\u0005\u0014,9FZ%\u001f#(\t;+\u0014(,SO";
        objectArray[20] = ":\u000eV6\u000ebO.]9\u001f-. V2\u001bwZ";
        objectArray[21] = "\u0010\u0003brd_e#i}u\u0010\u0004-bvqJp";
        objectArray[22] = "Yuuc^M\\`~cACEsw \u001cwSj}?KiBfq&";
        objectArray[23] = "VBZWg\u0013@B_\rt\u0004W\t\\\u000bx\u0010FNK\u001c3\u0004y";
        objectArray[24] = "\u00191Vq3c\u001b/\u001f\u00128x\u0004*Ik?";
        objectArray[25] = "s54\u0006-Op;l!oNx \u0000\u0012eG|&";
        objectArray[26] = ")+\"\u001bvM?+'AeZ(`$GiN9'3P\"[\u0019";
        objectArray[27] = "L\\\u0016\u001cQ\r9|\u001d\u0013@BXr\u0016\u0018D\u0018,";
        objectArray[28] = "G'2WWQ2\u00079XF\u001eS\t2SBD'";
        objectArray[29] = "\u0011r\u001e5,\u0015dR\u0015:=Z\u0005\\\u001e19\u0000q";
        objectArray[30] = ".\u0019qiq\u000f0\u0011k&\u0010\u0018.\u001dd|,";
        objectArray[31] = "X<2#5\u0007S3#lT\tX8'6";
        objectArray[32] = "W\u0004\u000bi\u0000U\\\u000b\u001a&}MO\f\u0013o";
        objectArray[33] = "\u0000!(Ar?\u00054#Aq8\n=(\u00030\u000f#`~,";
        objectArray[34] = "%1\u0003\ry\u0007P\u0011\b\u0002hH1\u001f\u0003\tl\u0012E";
        objectArray[35] = "K7\nq\u00055U?\u0010>M5O5\byD.\u000f\u001f\u0012dx5Q&\u0010yN2";
        objectArray[36] = "SY4\ns\u001a\u001c[`\u0005\u0019\u0015n\u0004w\u001a$\u0019\u0001\u0004~\u001f'\u007f";
        objectArray[37] = "q\u00007MJDy\u00127\u001f4\u0010{\u0018<J4At\u0013;BD@g\u0004\u007f'";
        objectArray[38] = "sM&P\u001bhx\u0007c_xstS\u0001F\u0000bbR!@\u0015v\u0018T(G\u0013yj_b\u0002\u001c\u001a\"T6G\u001dj#G!\u0003x";
        objectArray[39] = "fhe\u00067B)u:JGKVreY*\u00119j(C !?$(\u0001-F2hgXG";
        objectArray[40] = "v\u0000Kq)KwVJ)\u0016\u001c\u0017\n\u0015/{Fx\u0012X5qv.\u0001\u001ar|Ov\u0007\u0012-\u0016";
        objectArray[41] = ";-\u0003q8 = FxJ9)\u0005\u0006x154!|\u007fq;6%\u001e{&<4]";
        objectArray[42] = "\u007f\u0017\u0003r\u000eb?H_ol8; \u0014a\u00174&\u0004nfW:$\u0000\fb\u0000=&x";
        objectArray[43] = "du\f$&\u0005lg\fvX_cn\u0018)3tnm\u00152X\u0003f:B$a[`2\u001dN8Vu6A*:Xlm|";
        objectArray[44] = "7QK|\u0018'-SP,gr\\S^9\fx.X\u0014|\u0003\u001b7JP.\u0004i<\u0000\u0015!g";
        objectArray[45] = "\u001d\u0011@dt-H[F9\u0013/'\u0006Gj~vH\u001e\nptF\u001e\rH7y\u007fF\u000b@h\u0013";
        objectArray[46] = "nwBkm\u0006o!C3RP\u000f}\u001c5?\u000b`eQ/5;6v\u0013h8\u0002np\u001b7R";
        objectArray[47] = "KK\u001e97[QI\u0005iH\n EFc%WO]\u000by/g\u001aI\u0015|-\u0017\u001bZ\u00028H";
        objectArray[48] = "5\u0010\u0001.glg\f\u0007OqvG\n\t&d^a\u0016\u0018/\u001e\"0\t\u001d!rhc\u000fZO$y`\u0012\u0001?%jwVd";
        objectArray[49] = "'V.\u0011\u001d\u000fz\u0010i\u001at\r-V\u0019\b5\u0004<*i\u001fD\\*\u00131\u0019L\u0003@";
        objectArray[50] = "$;.|q\u0006k&q0\u0001\u000e\u0014!.#lU{9c9fe}wc{k\u0002p;,\"\u0001";
        objectArray[51] = "\u001au?Np]Hi9/fGho7FshDo=U\tJ\u0012yaEnG^68/`\u0012Q00Hm^\u001eiZF8Q\u0018a=Kt\u001eA\u000b3\u001e{\u0018Il>R4A#11CuFS0\"T1#";
        objectArray[52] = "iS~q17k]g*\f)d@`+`SiS~q17k]g*\f";
        objectArray[53] = "`wv}Erm9cz'%EFd}\u001asowx/N0\u000f";
        objectArray[54] = "\\1\u001a\u001fEd\u000e-\u001c~S~.+\u0012\u0017F\u001a\\#O@V#\u0004%G\u001f< \u000e#\u0003\u001bL!\u001d4G~";
        objectArray[55] = "C=;G.XE0~N\\OG1\rX\u001dFVM}Ol\u001e@t%IdA*";
        objectArray[56] = "xN\u001b\u0018c}d\u001cO[\u0003#u\r&Do3$LBFa*\u007fqFH|p%\u0015DFe+\u0018";
        objectArray[57] = "`\u001a\u0016^}Q{\\QA\u001b]bl\u0015Wd\u007fbM\nS}N}a\tEg[`K\u0002R\u001b\u000bj\u0010QT\"Sl\u0018\u000e>\"^6\u001e\u0005\u0007zX>Ao\u0007w\u00028JV_q\ng VO$JgCR\u0002&I\u0006\u0019\u0003\u000e%X?A\u0005\u0006z2<K\u0003B~B=X\u0014\u0006\u001b";
        objectArray[58] = "`<f\u001cs\u00162 `}e\f\u0013#e\u0011T\u0005#>n\rC\u0012#+r}3\u0004i|iDk\u0002a#\u0003Ga\u0004%'sFr\u0013aB";
        objectArray[59] = ">RA\fq\u001ce\u0015V\b\u0000\u00017\u0017E\fz\u0016\u001c\t^+}\u001f>n\\\u0015|J5T\u0005\u001fi\u0005Z\u000b_\\1\u0014!\u0013XTa{>\u0016D\\oAg\u001cQ\u0013\u0000";
        objectArray[60] = "fE\u0011\u0011hn4Y\u0017p~t\u0015Z\u0012\u001c_j6^\u0019\u001al~1V\u000ep(|o\u0005\u001eIpzgZtI} aQM\u0011{(>;N\u001b}l:KO\bj(_";
        objectArray[61] = "f/5\u0002wR433caH\u000271\riV:\u00149\u001ftM/m>\u001d\u000e\u00153an\t7M5i1cd\u0017<5(\u0001`@;7P\u0003bScl4\u0001lJ8Qj\bbP:!k\u001bu\u0014_";
        objectArray[62] = "\u0002ldb_\u0014Ppb\u0003I\u000ewhh|k\u000eVwleZ\u0011;+m3\u0018\u0000\u0002sk;Gj\u0002~1=LSZx9b&SW\"?i\u001f\u000bQ*`\u0003\u001f\u001b\u0004j``\u001bV\u0006i\u00019M\u0006Gwq8^\u0011\u0003\u0012";
        objectArray[63] = "2_\u0000\u000bT\\r\u0000\\\u00166\b`L$\u000ez\u0000pZ\t\u00186W1W\u0014\u001bZ\u001dbQSu";
        objectArray[64] = ":\u001a1o&*h\u00067\u000e00O\u0005/g50ndmboji]5dg5\u0003^?b#1s_,ugT";
        objectArray[65] = "\u00047'2\u007f\u0019\ty25\u001dN\"\u000652 \u0018\u000b7)`t[k";
        objectArray[66] = "#\u0018pg\u0016\"q\u0004v\u0006\u00008P\u0007sj%!t\bx|oevV+lV=p^t\u0006V0*X\u007f?\u000e6\"\u0007\u0015<\u00040f\u0003e=\u0017'\"f";
        objectArray[67] = "d57yPM6)1\u0018FW\u0016,6\u007fSv401\u0018C\b>/*zG_9-Rr\u0012P930vEW;K8#JW%)<tMU]!i{MK?%>|O3g >dLCf3) )";
        objectArray[68] = "=T\u001a*9QrIEfI^\rN\u001au$\u0002bVWo.2d\u0018W-#UiT\u0018tI";
        objectArray[69] = "Ps\u0015\u000fx8Q%\u0014WGl1yKQ*5^a\u0006K \u0005\brD\f-<PtLSG";
        objectArray[70] = "\u0012X5D\u001dy@D3%\u000bcv]=}\u001e`D\\9@d>G\u0016nO]fA\u001e1%^lGZ5U_\u007fP\u001eP";
        objectArray[71] = "O_m=/z\u001fX<%\u0014psSo/y)\u001cK\"5s\u0019JX`r~ \u0012^h-\u0014";
        objectArray[72] = "8\u001dONAe0\u000fO\u001c?!*\u000bTGg'-\u0002?J@*<\u001c\u0000BR*nb";
        objectArray[73] = "4A|(T f]zIB:ARa5M\u001bdDzIGen[a+C2iY\u0019sF2qZirU%5?";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "f|p\u0002t0)a/N\u0004>Vfp]ic9~=GcS?0=\u0005n42|r\\\u0004";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dy_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dy_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(dy_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(dy_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


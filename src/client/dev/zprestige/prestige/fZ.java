/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bU;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.c9;
import dev.zprestige.prestige.cp_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gO;
import dev.zprestige.prestige.gQ;
import dev.zprestige.prestige.gS;
import dev.zprestige.prestige.gT;
import dev.zprestige.prestige.gU;
import dev.zprestige.prestige.gf_0;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class fZ
implements cz_0 {
    private static final fT a;
    private bU c;
    private bW d;
    private int e;
    private int f;
    private boolean g;
    private dt_0 h;
    private c9 i;
    private int j;
    private float k;
    private float l;
    private static final long m;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final long[] q;
    private static final Integer[] r;
    private static final Map s;
    private static final Object[] t;
    private static final String[] u;

    private fZ(long l) {
        long l2 = l = m ^ l;
        long l3 = l2 ^ 0x67A3A136619FL;
        long l4 = l2 ^ 0x7FDAB97715B4L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        this.c = fZ.c("Z", (Object)objectArray, (long)1837717408082222761L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = (int)fZ.b("s", (int)850, (long)(0x409C8388850EC69BL ^ l));
        this.d = fZ.c("Z", (Object)objectArray2, (long)1838165247389310451L, (long)l);
        this.g = 0;
        this.j = (int)fZ.b("s", (int)21315, (long)(0x5ABF1C09E4151696L ^ l));
        this.k = 15.0f;
        this.l = 0.3f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fZ.m = hc.a(932737866541019625L, -5847397427252014939L, MethodHandles.lookup().lookupClass()).a(223749826317773L);
                        var20 = fZ.m ^ 71672911299427L;
                        var22_1 = var20 ^ 6074652357854L;
                        fZ.t = new Object[63];
                        fZ.u = new String[63];
                        fZ.a();
                        fZ.p = new HashMap<K, V>(13);
                        var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                            v2 = v2;
                            v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                        }
                        var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_4 = new String[7];
                        var16_5 = 0;
                        var15_6 = "\n\u00cc\u00914n\u00ec\u00f7\u00b1:\u0084\u00d8>\u0010\tft\u0010\u0015H\u0013\u00ed\u0012H\u00f0\u00fa\u00f7\u00a0\u0096\u00fa\u00d3=q)(e\u00dd\u00a5o\u008a\u001d\u00ed\u0014\u0010\u00b0\u00e2\u00d7\u00c9Uv\"~\u0097\u000b\u001f\u0001&\u0099\u00fcW\u0003\u008f\u00d0\u00bb\u0000P\u00f6\u00fa\u00c8\u00ae\u0015l\u00b1\u00c7d \u0011\u009am.\u00c8\u0092\u00dby{0\u00ad]A\u00b4&\u00d1\u0097\u00f6\u00c0\u00e4E\u0098\u0093\u00fb]k\u00b7\u00b6!\u00cf\u0007w\u0010\u00c1\u00eeL\u001c&\u00afmj\u0019\u001dD7\u00e3\u0097\u00ed\u0001";
                        var17_7 = "\n\u00cc\u00914n\u00ec\u00f7\u00b1:\u0084\u00d8>\u0010\tft\u0010\u0015H\u0013\u00ed\u0012H\u00f0\u00fa\u00f7\u00a0\u0096\u00fa\u00d3=q)(e\u00dd\u00a5o\u008a\u001d\u00ed\u0014\u0010\u00b0\u00e2\u00d7\u00c9Uv\"~\u0097\u000b\u001f\u0001&\u0099\u00fcW\u0003\u008f\u00d0\u00bb\u0000P\u00f6\u00fa\u00c8\u00ae\u0015l\u00b1\u00c7d \u0011\u009am.\u00c8\u0092\u00dby{0\u00ad]A\u00b4&\u00d1\u0097\u00f6\u00c0\u00e4E\u0098\u0093\u00fb]k\u00b7\u00b6!\u00cf\u0007w\u0010\u00c1\u00eeL\u001c&\u00afmj\u0019\u001dD7\u00e3\u0097\u00ed\u0001".length();
                        var14_8 = 16;
                        var13_9 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_9;
                            v4 = var15_6.substring(v3, v3 + var14_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = fZ.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "\u00a8\u00b4\u00e7\u00f9E\"\u00c3~J\u0004vGD\u0013{P\u00ccIy\u0093\u00fe\u0082\u00b0\u00b8\u00de\u00dd\u00cb\u008a\u00b9zZ\u0095>0\u00bb>\u00ea\u00cb\u00calB\u00da1\u000e\u00c6%\u001dk\u001es\u00ae?=\u009eg\u00f7\u0018\u00b6\u0015\u00e1\bWV\u00b3\u001b=\u00ad\u0007\u009a\u00cf\u00d2\u0004A:\u00e7\u00c6`'Q\u00cf\u0088";
                            var17_7 = "\u00a8\u00b4\u00e7\u00f9E\"\u00c3~J\u0004vGD\u0013{P\u00ccIy\u0093\u00fe\u0082\u00b0\u00b8\u00de\u00dd\u00cb\u008a\u00b9zZ\u0095>0\u00bb>\u00ea\u00cb\u00calB\u00da1\u000e\u00c6%\u001dk\u001es\u00ae?=\u009eg\u00f7\u0018\u00b6\u0015\u00e1\bWV\u00b3\u001b=\u00ad\u0007\u009a\u00cf\u00d2\u0004A:\u00e7\u00c6`'Q\u00cf\u0088".length();
                            var14_8 = 56;
                            var13_9 = -1;
lbl48:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_9;
                                v4 = var15_6.substring(v6, v6 + var14_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl53:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = fZ.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var11_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl65:
                        // 1 sources

                        ** continue;
                    }
                }
                fZ.n = var18_4;
                fZ.o = new String[7];
                fZ.s = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[27];
                var3_14 = 0;
                var4_15 = "G\u00d1c\u00db\u00bc{\u009a\u00dc\u001dp~7\u00d6(\u009c\u008b\u0095\u0093Z \u00b5\u0096M!\u00c0>\u00dc\u00b7P\u00b2\u0011\u00e4\u00ef\u00e1\u00dc>\u00b2\u0096\u001d\u00f9\u0090\u00abNR\n\u008bL\u00fb\u0014\u00b36\u00f4r\u0004m\u009bI\u00be\u00ae$\u00926\u00f8\u00e7\u00bdj\u00a6\u007fT\u00cf\u00d4\u008c\u00aeN\u00d9\u00cc\u00f3\u00f0\u00a9\u00d2W\u00d2-\u00aa5/^%\u00a0\u007fP\u00a0\u00c3\u008f\u00f6\u008aEg\u00bause8\u00a6\u00b9\u00d6\u00d2M}\u00e3{\u00d0\u00e2\u000fEX\u00d2\u00d1=z\u0005\u007f\u0003\u00ff\\\u00a0p\u00fev\u00d7M\u00cb\u0094\u00ec|U\u009f\u00e5\u00edGv\u00ca\u00e0\u009e\n\u0007\u00dd1\u00b7G\n\t\u0005\u0010M\u00b7\u00cf2\u00f1\u00b34\n\u00ec-\u001a2\u00db\u00b8lo\u00a4p\u008aJ\u0018\u00d0W^v\u00aaG\u00ed\u00b3\u0007$p\u00c7.\u00c5\u0084CS\u001b\u00beW#1\u00d0\u00b7\u00e4";
                var5_16 = "G\u00d1c\u00db\u00bc{\u009a\u00dc\u001dp~7\u00d6(\u009c\u008b\u0095\u0093Z \u00b5\u0096M!\u00c0>\u00dc\u00b7P\u00b2\u0011\u00e4\u00ef\u00e1\u00dc>\u00b2\u0096\u001d\u00f9\u0090\u00abNR\n\u008bL\u00fb\u0014\u00b36\u00f4r\u0004m\u009bI\u00be\u00ae$\u00926\u00f8\u00e7\u00bdj\u00a6\u007fT\u00cf\u00d4\u008c\u00aeN\u00d9\u00cc\u00f3\u00f0\u00a9\u00d2W\u00d2-\u00aa5/^%\u00a0\u007fP\u00a0\u00c3\u008f\u00f6\u008aEg\u00bause8\u00a6\u00b9\u00d6\u00d2M}\u00e3{\u00d0\u00e2\u000fEX\u00d2\u00d1=z\u0005\u007f\u0003\u00ff\\\u00a0p\u00fev\u00d7M\u00cb\u0094\u00ec|U\u009f\u00e5\u00edGv\u00ca\u00e0\u009e\n\u0007\u00dd1\u00b7G\n\t\u0005\u0010M\u00b7\u00cf2\u00f1\u00b34\n\u00ec-\u001a2\u00db\u00b8lo\u00a4p\u008aJ\u0018\u00d0W^v\u00aaG\u00ed\u00b3\u0007$p\u00c7.\u00c5\u0084CS\u001b\u00beW#1\u00d0\u00b7\u00e4".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u0013[\u0007\u00be\u00c2\u00ee\u00ca\u00e5)r\u00b3\u0091|\u00cb\u0019\u0006";
                    var5_16 = "\u0013[\u0007\u00be\u00c2\u00ee\u00ca\u00e5)r\u00b3\u0091|\u00cb\u0019\u0006".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl123:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        fZ.q = var6_13;
        fZ.r = new Integer[27];
        v15 = new Object[4];
        v15[3] = var22_1;
        v15[2] = false;
        v15[1] = fZ.a("a", (int)24702, (long)(250494284212649310L ^ var20));
        v15[0] = fZ.a("a", (int)7885, (long)(3205570557799646186L ^ var20));
        fZ.a = fZ.c("Z", (Object)v15, (long)8338581448897067130L, (long)var20);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (u[n3] != null) {
            return n3;
        }
        Object object = t[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 5;
            case 2 -> 0;
            case 3 -> 62;
            case 4 -> 16;
            case 5 -> 11;
            case 6 -> 8;
            case 7 -> 24;
            case 8 -> 35;
            case 9 -> 28;
            case 10 -> 14;
            case 11 -> 20;
            case 12 -> 48;
            case 13 -> 9;
            case 14 -> 36;
            case 15 -> 23;
            case 16 -> 39;
            case 17 -> 53;
            case 18 -> 21;
            case 19 -> 22;
            case 20 -> 56;
            case 21 -> 19;
            case 22 -> 60;
            case 23 -> 46;
            case 24 -> 31;
            case 25 -> 6;
            case 26 -> 4;
            case 27 -> 27;
            case 28 -> 37;
            case 29 -> 26;
            case 30 -> 33;
            case 31 -> 57;
            case 32 -> 1;
            case 33 -> 52;
            case 34 -> 47;
            case 35 -> 34;
            case 36 -> 63;
            case 37 -> 43;
            case 38 -> 55;
            case 39 -> 2;
            case 40 -> 44;
            case 41 -> 58;
            case 42 -> 51;
            case 43 -> 59;
            case 44 -> 45;
            case 45 -> 18;
            case 46 -> 15;
            case 47 -> 17;
            case 48 -> 29;
            case 49 -> 50;
            case 50 -> 13;
            case 51 -> 38;
            case 52 -> 12;
            case 53 -> 25;
            case 54 -> 49;
            case 55 -> 42;
            case 56 -> 10;
            case 57 -> 7;
            case 58 -> 41;
            case 59 -> 40;
            case 60 -> 61;
            case 61 -> 54;
            case 62 -> 30;
            default -> 3;
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
        fZ.u[n3] = new String(cArray);
        return n3;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C58;
        if (r[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = q[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])s.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    s.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fZ.r[n2] = n3;
        }
        return r[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fZ.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == 'R' || c == 'Y' || c == '\u00df') {
                field = fZ.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fZ.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fZ.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void b(Object[] objectArray) {
        long l;
        long l2;
        block21: {
            CallSite callSite;
            block20: {
                CallSite callSite2;
                block18: {
                    CallSite callSite3;
                    block19: {
                        block16: {
                            CallSite callSite4;
                            block17: {
                                long l3;
                                float f;
                                block14: {
                                    fZ fZ2;
                                    float f10;
                                    int n;
                                    block15: {
                                        n = (Integer)objectArray[0];
                                        f10 = ((Float)objectArray[1]).floatValue();
                                        f = ((Float)objectArray[2]).floatValue();
                                        l2 = (Long)objectArray[3];
                                        long l4 = l2 = m ^ l2;
                                        long l5 = l4 ^ 0x5891D2BB4093L;
                                        l3 = l4 ^ 0x27AC55331E9CL;
                                        l = l4 ^ 0x1DBCA1AAA3B8L;
                                        CallSite callSite5 = fZ.c("Z", (long)-7528674038466150094L, (long)l2);
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l5;
                                        fZ.c("b", (Object)this, (Object)objectArray2, (long)-7528164567586393462L, (long)l2);
                                        callSite2 = callSite5;
                                        try {
                                            try {
                                                fZ2 = this;
                                                if (callSite2 != null) break block14;
                                                if (fZ2.i != null) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                                            }
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                                        }
                                    }
                                    this.j = n;
                                    this.k = f10;
                                    fZ2 = this;
                                }
                                fZ2.l = f;
                                callSite4 = fZ.c("Z", (int)fZ.b("s", (int)591, (long)(0xB223E46D3A2C992L ^ l2)), (long)-7529185096359027484L, (long)l2);
                                callSite3 = fZ.c("Z", (int)fZ.b("s", (int)25283, (long)(0x1281730AD70D2907L ^ l2)), (long)-7529185096359027484L, (long)l2);
                                CallSite callSite6 = fZ.c("Z", (int)fZ.b("s", (int)11476, (long)(0x4E7F0A62231E6701L ^ l2)), (long)-7529185096359027484L, (long)l2);
                                try {
                                    try {
                                        fZ.c("Z", (int)fZ.b("s", (int)591, (long)(0xB223E46D3A2C992L ^ l2)), (long)-7529860185694169739L, (long)l2);
                                        fZ.c("Z", (int)fZ.b("s", (int)27066, (long)(0x6FF343A1969A266L ^ l2)), (long)-7529413611637825588L, (long)l2);
                                        fZ.c("Z", (int)fZ.b("s", (int)552, (long)(0x3CC136204B4F49EDL ^ l2)), (int)fZ.b("s", (int)1988, (long)(0x4874E9388F37CC02L ^ l2)), (long)-7528118139546758933L, (long)l2);
                                        fZ.c("Z", (int)fZ.b("s", (int)11476, (long)(0x4E7F0A62231E6701L ^ l2)), (long)-7529860185694169739L, (long)l2);
                                        Object[] objectArray3 = new Object[1];
                                        objectArray3[0] = l3;
                                        fZ.c("b", (Object)this.i, (Object)objectArray3, (long)-7528443776412998782L, (long)l2);
                                        callSite = callSite6;
                                        if (callSite2 != null) break block16;
                                        if (callSite == false) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                                    }
                                    fZ.c("Z", (int)fZ.b("s", (int)11476, (long)(0x4E7F0A62231E6701L ^ l2)), (long)-7529413611637825588L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                                }
                            }
                            callSite = callSite4;
                        }
                        try {
                            try {
                                if (callSite2 != null) break block18;
                                if (callSite == false) break block19;
                            }
                            catch (MatchException matchException) {
                                throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                            }
                            fZ.c("Z", (int)fZ.b("s", (int)591, (long)(0xB223E46D3A2C992L ^ l2)), (long)-7529413611637825588L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                        }
                    }
                    callSite = callSite3;
                }
                try {
                    if (callSite2 != null) break block20;
                    if (callSite != false) break block21;
                }
                catch (MatchException matchException) {
                    throw fZ.c("Z", (Object)matchException, (long)-7529503701307475876L, (long)l2);
                }
                callSite = fZ.b("s", (int)27066, (long)(0x6FF343A1969A266L ^ l2));
            }
            fZ.c("Z", (int)callSite, (long)-7529860185694169739L, (long)l2);
        }
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l;
        objectArray4[3] = Float.valueOf(0.0f);
        objectArray4[2] = Float.valueOf(0.0f);
        objectArray4[1] = Float.valueOf(0.0f);
        objectArray4[0] = Float.valueOf(0.0f);
        fZ.c("b", (Object)this.c, (Object)objectArray4, (long)-7529692376058158170L, (long)l2);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = fZ.e(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = u[n];
                int n3 = string2.indexOf(8);
                clazz3 = fZ.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fZ.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fZ.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        fZ.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fZ.f(2265580065557348L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fZ.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fZ.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fZ.f(2265580065557348L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fZ.e(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                fZ.t[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fZ.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fZ.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = fZ.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fZ.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E96;
        if (o[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])p.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fZ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fZ.n[n2].getBytes("ISO-8859-1");
            fZ.o[n2] = fZ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    public dt_0 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = m ^ l) ^ 0x24FE81DA7686L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        fZ.c("b", (Object)this, (Object)objectArray2, (long)-6803836942422801249L, (long)l);
        return this.h;
    }

    private void a(Object[] objectArray) {
        block28: {
            fZ fZ2;
            long l;
            long l2;
            block29: {
                Object object;
                CallSite callSite;
                CallSite callSite2;
                CallSite callSite3;
                long l3;
                long l4;
                long l5;
                long l6;
                block26: {
                    long l7;
                    long l8;
                    long l9;
                    block24: {
                        block25: {
                            block23: {
                                block22: {
                                    CallSite callSite4;
                                    block20: {
                                        block21: {
                                            l2 = (Long)objectArray[0];
                                            long l10 = l2 = m ^ l2;
                                            l6 = l10 ^ 0x218DA862B3E9L;
                                            l9 = l10 ^ 0x16253E72D936L;
                                            l5 = l10 ^ 0x7A94657818EAL;
                                            l8 = l10 ^ 0xCFDD991C386L;
                                            l4 = l10 ^ 0x57BB048A0857L;
                                            l = l10 ^ 0x10DCB41A93FBL;
                                            l3 = l10 ^ 0x1FCE6A59CCD2L;
                                            l7 = l10 ^ 0x45E4F8E26FC5L;
                                            callSite3 = fZ.c("Z", (long)-6356888349986967183L, (long)l2);
                                            try {
                                                callSite4 = fZ.c("b", (Object)b, (long)-6357053870643457774L, (long)l2);
                                                if (callSite3 != null) break block20;
                                                if (callSite4 != null) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                                            }
                                            return;
                                        }
                                        callSite4 = fZ.c("b", (Object)b, (long)-6357053870643457774L, (long)l2);
                                    }
                                    callSite2 = fZ.c("b", (Object)callSite4, (long)-6358838242529823792L, (long)l2);
                                    callSite = fZ.c("b", (Object)fZ.c("b", (Object)b, (long)-6357053870643457774L, (long)l2), (long)-6357766543286226437L, (long)l2);
                                    try {
                                        object = callSite2;
                                        if (callSite3 != null) break block22;
                                        if (object <= 0) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                                    }
                                    object = callSite;
                                }
                                try {
                                    if (callSite3 != null) break block24;
                                    if (object > 0) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                                }
                            }
                            return;
                        }
                        object = this.g;
                    }
                    try {
                        try {
                            block27: {
                                try {
                                    try {
                                        if (callSite3 != null) break block26;
                                        if (object != false) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                                    }
                                    this.e = (int)callSite2;
                                    this.f = (int)callSite;
                                    Object[] objectArray2 = new Object[4];
                                    objectArray2[3] = l9;
                                    objectArray2[2] = this.f;
                                    objectArray2[1] = this.e;
                                    objectArray2[0] = (int)fZ.b("s", (int)32365, (long)(0x20D66AB90E405EEL ^ l2));
                                    fZ.c("b", (Object)this.d, (Object)objectArray2, (long)-6357561855683014502L, (long)l2);
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l5;
                                    objectArray3[0] = (int)fZ.b("s", (int)30665, (long)(0x786D7214201A8C48L ^ l2));
                                    fZ.c("b", (Object)this.d, (Object)objectArray3, (long)-6358601433470343918L, (long)l2);
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l3;
                                    objectArray4[0] = (int)fZ.b("s", (int)10881, (long)(0x5591B9534FBA510FL ^ l2));
                                    fZ.c("b", (Object)this.d, (Object)objectArray4, (long)-6358172287095830067L, (long)l2);
                                    Object[] objectArray5 = new Object[3];
                                    objectArray5[2] = l6;
                                    objectArray5[1] = this.d;
                                    objectArray5[0] = (int)fZ.b("s", (int)12489, (long)(0x41EA0055EFF2CB5BL ^ l2));
                                    fZ.c("b", (Object)this.c, (Object)objectArray5, (long)-6357360642873635658L, (long)l2);
                                    Object[] objectArray6 = new Object[5];
                                    objectArray6[4] = l;
                                    objectArray6[3] = Float.valueOf(0.0f);
                                    objectArray6[2] = Float.valueOf(0.0f);
                                    objectArray6[1] = Float.valueOf(0.0f);
                                    objectArray6[0] = Float.valueOf(0.0f);
                                    fZ.c("b", (Object)this.c, (Object)objectArray6, (long)-6358478159269719067L, (long)l2);
                                    fW[] fWArray = new fW[fZ.b("s", (int)14321, (long)(0x798000385A7E4C7CL ^ l2))];
                                    fWArray[0] = new gU(this.c.a);
                                    fWArray[1] = new gS(cp_0.a);
                                    fWArray[2] = new gQ((int)fZ.b("s", (int)26749, (long)(0x624948E1CC5793E1L ^ l2)), false);
                                    fWArray[3] = new gT(true, true);
                                    fWArray[4] = new gO((int)fZ.b("s", (int)18174, (long)(0x114EFF88C876BD6EL ^ l2)), (int)fZ.b("s", (int)5973, (long)(0x33FD6BB27E6AECC8L ^ l2)));
                                    fWArray[5] = new gQ((int)fZ.b("s", (int)15419, (long)(0x3F45B9171417C7A2L ^ l2)), false);
                                    this.h = new dt_0(gf_0.b, 4, false, fWArray, l8);
                                    Object[] objectArray7 = new Object[4];
                                    objectArray7[3] = l7;
                                    objectArray7[2] = dp_0::a;
                                    objectArray7[1] = this::lambda$initOrResize$0;
                                    objectArray7[0] = a;
                                    this.i = fZ.c("b", (Object)new c9(), (Object)objectArray7, (long)-6358397618002877236L, (long)l2);
                                    this.g = 1;
                                    if (callSite3 == null) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                                }
                            }
                            fZ2 = this;
                            if (callSite3 != null) break block29;
                        }
                        catch (MatchException matchException) {
                            throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                        }
                        object = fZ2.e;
                    }
                    catch (MatchException matchException) {
                        throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                    }
                }
                try {
                    block30: {
                        try {
                            try {
                                if (object != callSite2) break block30;
                                fZ2 = this;
                                if (callSite3 != null) break block29;
                            }
                            catch (MatchException matchException) {
                                throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                            }
                            if (fZ2.f == callSite) break block28;
                        }
                        catch (MatchException matchException) {
                            throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                        }
                    }
                    this.e = (int)callSite2;
                    this.f = (int)callSite;
                    Object[] objectArray8 = new Object[3];
                    objectArray8[2] = l4;
                    objectArray8[1] = this.f;
                    objectArray8[0] = this.e;
                    this.d = fZ.c("b", (Object)this.d, (Object)objectArray8, (long)-6357278641821432234L, (long)l2);
                    Object[] objectArray9 = new Object[2];
                    objectArray9[1] = l5;
                    objectArray9[0] = (int)fZ.b("s", (int)29251, (long)(0x654503C4D3B009D6L ^ l2));
                    fZ.c("b", (Object)this.d, (Object)objectArray9, (long)-6358601433470343918L, (long)l2);
                    Object[] objectArray10 = new Object[2];
                    objectArray10[1] = l3;
                    objectArray10[0] = (int)fZ.b("s", (int)29663, (long)(0x255C991731E6884BL ^ l2));
                    fZ.c("b", (Object)this.d, (Object)objectArray10, (long)-6358172287095830067L, (long)l2);
                    Object[] objectArray11 = new Object[3];
                    objectArray11[2] = l6;
                    objectArray11[1] = this.d;
                    objectArray11[0] = (int)fZ.b("s", (int)11398, (long)(0x4BD33A7A248D5706L ^ l2));
                    fZ.c("b", (Object)this.c, (Object)objectArray11, (long)-6357360642873635658L, (long)l2);
                    fZ2 = this;
                }
                catch (MatchException matchException) {
                    throw fZ.c("Z", (Object)matchException, (long)-6358280963421370337L, (long)l2);
                }
            }
            Object[] objectArray12 = new Object[5];
            objectArray12[4] = l;
            objectArray12[3] = Float.valueOf(0.0f);
            objectArray12[2] = Float.valueOf(0.0f);
            objectArray12[1] = Float.valueOf(0.0f);
            objectArray12[0] = Float.valueOf(0.0f);
            fZ.c("b", (Object)fZ2.c, (Object)objectArray12, (long)-6358478159269719067L, (long)l2);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fZ.a(n, l);
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

    private static void a() {
        Object[] objectArray = t;
        t[0] = "i#\b\u0015\u0015\u0012\u007f#\rO\u0006\u0005hh\u000eI\n\u0011y/\u0019^A\u0005G";
        objectArray[1] = "\u0014\u001bnL\u00112\u001f\u0014\u007f\u0003l*\f\u0013vJ";
        objectArray[2] = Float.TYPE;
        fZ.u[2] = "java/lang/Float";
        objectArray[3] = ".I^=-R+\\U=.U$U^\u007fob\r\n\n";
        objectArray[4] = Integer.TYPE;
        fZ.u[4] = "java/lang/Integer";
        objectArray[5] = Void.TYPE;
        fZ.u[5] = "java/lang/Void";
        objectArray[6] = "Vk\u001afw\rS~\u0011ft\n\\w\u001a$5=u*M";
        objectArray[7] = "w9\u0019[\u0005La9\u001c\u0001\u0016[vr\u001f\u0007\u001aOg5\b\u0010QZG";
        objectArray[8] = "\u0002\u0002\"]QAw\")R@\u000e\u0016,\"YDTb";
        objectArray[9] = "\u0015J1i@>\u0003J43S)\u0014\u000175_=\u0005F \"\u0014/9";
        objectArray[10] = ",iypz\u0015YIr\u007fkZ$Qaxb\u0013L";
        objectArray[11] = "JXo<\u001a1\\Xjf\t&K\u0013i`\u00052ZT~wN#{";
        objectArray[12] = "g\u0000w?I^\u0012 |0X\u0011s.w;\\K\u0007";
        objectArray[13] = "\u001b0\u0002cVC\r0\u00079ET\u001a{\u0004?I@\u000b<\u0013(\u0002U%";
        objectArray[14] = ":h+Gb:1g:\b\u00017$j5c455y)O#8";
        objectArray[15] = "iMN2$G\u007fMKh7Ph\u0006Hn;DyA_ypT4";
        objectArray[16] = "DWhf\u001cp1wci\r?Pyhb\te$";
        objectArray[17] = "\u000eJ \u0007\u0013\u0016{j+\b\u0002Y\u001ad \u0003\u0006\u0003n";
        objectArray[18] = Boolean.TYPE;
        fZ.u[18] = "java/lang/Boolean";
        objectArray[19] = "~t K\n@\u000bT+D\u001b\u000fjZ O\u001fU\u001e";
        objectArray[20] = "u\u000b.&\u0019Nc\u000b+|\nYt@(z\u0006Me\u0007?mM\\F";
        objectArray[21] = "x'#=\u0019=\r\u0007(2\brl\t#9\f(\u0018";
        objectArray[22] = "EO.iq*0o%f`eQa.md?%";
        objectArray[23] = "\u001bQA$\u0000\"\u001bQVx\f-\u0001\u001aVf\f8\u0006k\u0006;]";
        objectArray[24] = "7`b\u001c\nN7`u@\u0006A-+u^\u0006T*Z'\u0002S\u0016";
        objectArray[25] = "S>\u001dZ?|&\u001e\u0016U.3G\u0010\u001d^*i3";
        objectArray[26] = "s]bc\u0012\u0003\u0006}il\u0003Lgsbg\u0007\u0016\u0013";
        objectArray[27] = "A\u001b\u001d7w\u00064;\u00168fIU5\u001d3b\u0013!";
        objectArray[28] = "\u0002OMg\u0015bwoFh\u0004-\u0016aMc\u0000wb";
        objectArray[29] = "{w\u0001%\u0002w\u000eW\n*\u00138oY\u0001!\u0017b\u001b";
        objectArray[30] = "1\u000e\u0015pYw'\u000e\u0010*J`0E\u0013,Ft!\u0002\u0004;\ra\u0006";
        objectArray[31] = "\u0013gpt6>fG{{'q\u0007Ipp#+s";
        objectArray[32] = "9(\f5vJ2'\u001dz\u0017D9,\u0019 ";
        objectArray[33] = "2\u00022\u0019P\u001f,]2\u00010E0F/\u0019\\wg\u0000qN\u000b =\u0007s\u001c[@?E4\u00140";
        objectArray[34] = "\u007fKC<*W(CQ3\u0016MADV`|G}\u0001\u0003&p'";
        objectArray[35] = "@B/JL,GMq2N^\u000f\u001etN\u0016 \u0005\u001c$2\u001dd\u001cO!\t@g\u0012E\u001e\b\u001d?\u0014\u0019%U\u001e1\u001e&#V\u0016&\u0016T$YH^";
        objectArray[36] = "JIow_']\fs53r'\u00152aHcY\u000b|vW\u0019JIow_']\fs53";
        objectArray[37] = "xQx5K47\u001b\"03<GF&0H,9Xh'WV{\u001ep0^5\u007fJg13";
        objectArray[38] = "\u001fPHR|tP\u001a\u0012W\u0004\u007f G\u0016W\u007fl^YX@`\u0016\u001fPHR|tP\u001a\u0012W\u0004";
        objectArray[39] = "eY^P\u0017>fFZ\fif\fQ\u0005\u0005\u0012urOK\u0012\r\u000f0\tS\u0005\u0004l4]D\u0004i";
        objectArray[40] = "Zr{\u0012\u0007|M7gPk)7.&\u0004\u00108I0h\u0013\u000fB\u000bvp\u0004\u0006!\u000f\"g\u0005k";
        objectArray[41] = "T9n8#RS60@! S#f\"+ZP<%|H\u001d\rl'+:\u001a\u00022_";
        objectArray[42] = "H8}2\u00163O|c'u1\u0010Lu4\u00132:{w2ud\n?s:\u000fg\u0015|-YO Mdr#L?\u000e:\u0011eH4\u001ekra\u001c#\u001f\u0006";
        objectArray[43] = "%9`\u0004\u0017;f:<\u001c)<\u00149<\u0015R/j'r\u0002MU(aj\u0015D6,5}\u0014)";
        objectArray[44] = "2\"\u0010\u0019gC%g\f[\u000b\u0014_~M\u000fp\u0007!`\u0003\u0018o}2\"\u0010\u0019gC%g\f[\u000b";
        objectArray[45] = "\u0005W\u001d\u001e3q\u0002\u0013\u0003\u000bPs]#\u0010\u0013<@T\u0019\r\b*q9S\u000fL2\u007fCP\u0010\u000fl\u001c\u0003\u0017H\u00173f\u0000\b\u000bIP \u0004\u0003\u001b\u00183$P\u0014\u001au";
        objectArray[46] = "\u0002P0\u0019z'^D{J\u001e)fZ}Oe:\u0018D3Xz@[R(Ke'\u0014U:]\u001e";
        objectArray[47] = "\rH$\bab\u000f\nc\u0000\ng\u0000\tx\rfUQH T\n8\u0013Lz\tp;\f\u000f$j";
        objectArray[48] = "\u0004c\bB#g\u0003lV:!\u0015K?SFykA=\u0003:r/Xn\u0006\u0001/,Vd9\u0007,$AlK\u0000#z9";
        objectArray[49] = "^\u001d\rs#[IX\u00111O\b3APe4\u001fM_\u001er+e\u000f\u0019\u0006e\"\u0006\u000bM\u0011dO";
        objectArray[50] = "p\u0013~xQ\u0013:\u0019kw2D.agjSU'tafNV0E\f,L\u0012(Kv/SQv(0+XA'K4\u007fO@J";
        objectArray[51] = "ne\u0015g64i!\u000brU66\u0017\u0018w<366y6+`08\u000354#n[E1?3?8Ae(2R";
        objectArray[52] = "WM\b\u0003\u0018RTR\f_f\t>ESV\u001d\u0019@[\u001dA\u0002cWM\b\u0003\u0018RTR\f_f";
        objectArray[53] = "4Nrp%}{\u0004(u]r\u000bY,u&euGbb9\u001f7\u0001zu0|3Umt]";
        objectArray[54] = "a-<\u001c\u001a{\".`\u0004$|P!g\u000bNx+'a\fK\u00159s0\rIn?u7\b$";
        objectArray[55] = "I>V}HnNzHh+l\u0011OWpFy\u001c|WSJ{\u0010iB\u0016\u0011}LbYl\u0012b\u000f<:*\u0016i\u001fmY.B~\u001e\u0000";
        objectArray[56] = "[MxlMW\u0014Jjz6YfE-hMJ\u0018[c\u007fR0\\^(`UJ_Ak>6";
        objectArray[57] = "=\u000b9\r?a:O'\u0018\\cex3\u000f6hl5o\u0018enbOl\u0007&0\u0001\th\f6ab\r<\u001b7\f";
        objectArray[58] = "'Bn\t\f\\ \u0006p\u001co^\u007f3o\u001e%V|\u0018o\u000b\t1!\u0002;\u0000\fK\"\u001dx^oZaF>\u0005QSj\u0011cb";
        objectArray[59] = "\r\u00048G7\u001d\u001aA$\u0005[I`XeQ Y\u001eF+F?#\\\u00003Q6@XT$P[";
        objectArray[60] = "j\u0003vR\u000bOm\f(*\t=%_-VQC/]}*ZCn\u0005$PY\\-[G\u0017\u0004\f/\f5\u0010\u000bRW";
        objectArray[61] = "\u00031 \u001d:,\u0004u>\bY.[S!\u0006\u0001(Ef)\u001b%,EnLL'x]l6O8;\u0003\u000fv\b`#\\uu\u0017#}?52O;\"E6-\feA\u00032&\u001c4\"\u0007f1\u001dY";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "C\u00061Y\u000e\fADvQe\tNGm\\\t;\u001f\u0007=\neV]\u0002oX\u001fUBA1;";
    }

    private static Field g(long l, long l2) {
        int n = fZ.e(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = fZ.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fZ.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fZ.c(clazz3, string2, clazz2)) != null) {
                    fZ.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fZ.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fZ.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fZ.f(2265580065557348L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void lambda$initOrResize$0(dy_0 dy_02) {
        long l = m ^ 0x3EC714E4B468L;
        fZ.c("Z", (int)fZ.b("s", (int)25775, (long)(0x24571330E25CFC5AL ^ l)), (long)-4272552334030194840L, (long)l);
        fZ.c("Z", (int)fZ.b("s", (int)30615, (long)(0x5A91F435B506EF71L ^ l)), (int)this.d.a, (long)-4273018436776259864L, (long)l);
        fZ.c("Z", (int)fZ.b("s", (int)30615, (long)(0x5A91F435B506EF71L ^ l)), (int)fZ.b("s", (int)6178, (long)(0x55F7A422BF3080C2L ^ l)), (int)4, (long)-4271904631440083097L, (long)l);
        fZ.c("Z", (int)fZ.b("s", (int)30615, (long)(0x5A91F435B506EF71L ^ l)), (int)fZ.b("s", (int)23644, (long)(0x301F1DDF787244AFL ^ l)), (int)fZ.b("s", (int)12313, (long)(0x2581C2977598A8F4L ^ l)), (long)-4271904631440083097L, (long)l);
        fZ.c("Z", (int)fZ.b("s", (int)30615, (long)(0x5A91F435B506EF71L ^ l)), (long)-4272361208742518517L, (long)l);
        fZ.c("Z", (int)fZ.b("s", (int)30615, (long)(0x5A91F435B506EF71L ^ l)), (int)fZ.b("s", (int)2870, (long)(0x38CA2DCDBFED93D9L ^ l)), (int)fZ.b("s", (int)29663, (long)(0x255C835813C5EB3CL ^ l)), (long)-4271904631440083097L, (long)l);
        fZ.c("Z", (int)fZ.b("s", (int)30615, (long)(0x5A91F435B506EF71L ^ l)), (int)fZ.b("s", (int)21043, (long)(0x6731144F424C4ADFL ^ l)), (int)fZ.b("s", (int)29663, (long)(0x255C835813C5EB3CL ^ l)), (long)-4271904631440083097L, (long)l);
        fZ.c("b", (Object)fZ.c("b", (Object)fZ.c("b", (Object)fZ.c("b", (Object)fZ.c("b", (Object)fZ.c("Z", (int)fZ.c("b", (Object)a, (Object)new Object[0], (long)-4272094407554407440L, (long)l), (long)-4273287134278846248L, (long)l), (Object)fZ.a("a", (int)11958, (long)(0xF4B44C57DA0C49BL ^ l)), (int)0, (long)-4271844079645148154L, (long)l), (Object)fZ.a("a", (int)3426, (long)(0x134BAB63BE77E74CL ^ l)), (int)this.j, (long)-4271844079645148154L, (long)l), (Object)fZ.a("a", (int)1248, (long)(0x10C9B40B834A6ECAL ^ l)), (float)this.k, (long)-4272668617866074598L, (long)l), (Object)fZ.a("a", (int)6199, (long)(0xCA74DC821CBF218L ^ l)), (float)this.l, (long)-4272668617866074598L, (long)l), (Object)fZ.a("a", (int)11704, (long)(0x6B4DB325BB574790L ^ l)), (float)(1.0f / (float)this.e), (float)(1.0f / (float)this.f), (long)-4273736665327068453L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fZ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fZ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fZ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


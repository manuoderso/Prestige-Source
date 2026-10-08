/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.c9;
import dev.zprestige.prestige.cp_0;
import dev.zprestige.prestige.de_0;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gJ;
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
 * Renamed from dev.zprestige.prestige.di
 */
public class di_0
extends de_0 {
    private final float a;
    private final float c;
    private final float f;
    private final float i;
    private static final long m;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;
    private static final long[] v;
    private static final Integer[] w;
    private static final Map x;
    private static final Object[] y;
    private static final String[] z;

    public di_0(long l) {
        long l2 = (l = m ^ l) ^ 0x4340CB369DD4L;
        super((String)((Object)di_0.a("q", (int)7199, (long)(0x9CADBA7D814FC79L ^ l))), (String)((Object)di_0.a("q", (int)27830, (long)(0x62BABD9BB360CD1L ^ l))), l2);
        this.a = 0.5f;
        this.c = 0.2f;
        this.f = 1.0f;
        this.i = 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        di_0.m = hc.a(8552140410861503417L, -7867628230686818371L, MethodHandles.lookup().lookupClass()).a(165233643766807L);
                        var20 = di_0.m ^ 23384079734298L;
                        var22_1 = var20 ^ 35023489466831L;
                        di_0.y = new Object[60];
                        di_0.z = new String[60];
                        di_0.c();
                        di_0.r = new HashMap<K, V>(13);
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
                        var18_4 = new String[9];
                        var16_5 = 0;
                        var15_6 = "\u00e1\u00aa\u00ecgU\u009c\u00f0!\u0081&\u00ce\u00a8\u00ca\u001a\u00cd\u0084\u00c7v\u00bb\u00ac\u00c6P\u00c1\u000f \u0087\u0081\u00d6\u00d5+\u00a3\u00d7\u0082\u00d5\u000f}W\".\u00d7\u0005R\u0082\u001f\u00b1w\fB\u00b8F\u00bfO\u00a2{\u0080\u009a\b\u0018\u0019o\u00a2\u00ec\u0094\u000e\u0018\u00b7\u00af=\u0013!t\u008d\u00ad\u001c\u00fe=\u00a5u\u008fS\u00f5\u00f2\u0010?\u00db\u00a7\u00b2\u00f4\u00c4\u00e7{\u0013HX\u009a\u0012\u0014\u00e1\u00df\u0018\"\u00ee\u00d1I\u00fc\u00a8\u00a0\u00e0\u00ceqGm\u00185\u00bdC\u009aA\u00b8\u00e3N\u00b6\u00ad) \b\u00c5\u00b40D\u00ae\u00c5\u0001\u009d\u00f8\u0091zq\u00eb\u00bd\u0006,\u0002\u00ea\u00e2g\u00f5]\u00bf\u001b\u00be\u00c4\u0006\u00d4\u00aa\u00a9\u00108\u00ca\u008aI\u001f\u00f4\u00ce\u00bd\u00f1?\u00f5\u009d\u00d6f)\u00dev\u00a6?]\u00a4\u00d2\u0004\u00b9\u00b9\u00c4\u0017\u00c3\t\u00e4\u00d7\u00d0\u00e8\u0081\u008b.q\u001d\u0099\u001fH\u00be\u00fe\u0003ISx\u00d0\u00d2\u00c0P\u00ed\u0098&\u009em\u00f9";
                        var17_7 = "\u00e1\u00aa\u00ecgU\u009c\u00f0!\u0081&\u00ce\u00a8\u00ca\u001a\u00cd\u0084\u00c7v\u00bb\u00ac\u00c6P\u00c1\u000f \u0087\u0081\u00d6\u00d5+\u00a3\u00d7\u0082\u00d5\u000f}W\".\u00d7\u0005R\u0082\u001f\u00b1w\fB\u00b8F\u00bfO\u00a2{\u0080\u009a\b\u0018\u0019o\u00a2\u00ec\u0094\u000e\u0018\u00b7\u00af=\u0013!t\u008d\u00ad\u001c\u00fe=\u00a5u\u008fS\u00f5\u00f2\u0010?\u00db\u00a7\u00b2\u00f4\u00c4\u00e7{\u0013HX\u009a\u0012\u0014\u00e1\u00df\u0018\"\u00ee\u00d1I\u00fc\u00a8\u00a0\u00e0\u00ceqGm\u00185\u00bdC\u009aA\u00b8\u00e3N\u00b6\u00ad) \b\u00c5\u00b40D\u00ae\u00c5\u0001\u009d\u00f8\u0091zq\u00eb\u00bd\u0006,\u0002\u00ea\u00e2g\u00f5]\u00bf\u001b\u00be\u00c4\u0006\u00d4\u00aa\u00a9\u00108\u00ca\u008aI\u001f\u00f4\u00ce\u00bd\u00f1?\u00f5\u009d\u00d6f)\u00dev\u00a6?]\u00a4\u00d2\u0004\u00b9\u00b9\u00c4\u0017\u00c3\t\u00e4\u00d7\u00d0\u00e8\u0081\u008b.q\u001d\u0099\u001fH\u00be\u00fe\u0003ISx\u00d0\u00d2\u00c0P\u00ed\u0098&\u009em\u00f9".length();
                        var14_8 = 24;
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
                            var18_4[var16_5++] = di_0.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "\u00ff\u00d6=FQ\u00b9\u0011,X f.\u00d2v\u00e7\u009a\u00f2\u00da^L\u009b$\f&c\"\u00ba\u00bd\u00e21\u001f\u00ec\u0095\u00b9\u0095K\u008c\u009b\u00f8\u00d3\u0010\u0088\u00c9\u0016\u00f6C\u00b5\u00b1\u0083\u00ac\u001d\u0086&q\u000b\u00a6K";
                            var17_7 = "\u00ff\u00d6=FQ\u00b9\u0011,X f.\u00d2v\u00e7\u009a\u00f2\u00da^L\u009b$\f&c\"\u00ba\u00bd\u00e21\u001f\u00ec\u0095\u00b9\u0095K\u008c\u009b\u00f8\u00d3\u0010\u0088\u00c9\u0016\u00f6C\u00b5\u00b1\u0083\u00ac\u001d\u0086&q\u000b\u00a6K".length();
                            var14_8 = 40;
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
                            var18_4[var16_5++] = di_0.a(var19_10).intern();
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
                di_0.p = var18_4;
                di_0.q = new String[9];
                di_0.x = new HashMap<K, V>(13);
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
                var6_13 = new long[8];
                var3_14 = 0;
                var4_15 = "\u00d0\u00d7\u00a1\u00d4Jk\u0087\f\f\u000f\u00abN\u00a5\u00d2\u00ab\u00c9H\u00d4\u00bf\u00ca\u00df\u008e\u00a0sptI)\u00cc[l\u00ac4\u0096,u\u00c2\u00ab\u00c8\u00cc=\u00c5\u00cd\u009b\u00b2\u00cbE\u0001";
                var5_16 = "\u00d0\u00d7\u00a1\u00d4Jk\u0087\f\f\u000f\u00abN\u00a5\u00d2\u00ab\u00c9H\u00d4\u00bf\u00ca\u00df\u008e\u00a0sptI)\u00cc[l\u00ac4\u0096,u\u00c2\u00ab\u00c8\u00cc=\u00c5\u00cd\u009b\u00b2\u00cbE\u0001".length();
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
                    var4_15 = "\u00d6e\u009f\u00c7\u00bd]\u00a6<\u00b6\u0092\u00d6\u0015\u0087\u00c6\u00fd\u00b8";
                    var5_16 = "\u00d6e\u009f\u00c7\u00bd]\u00a6<\u00b6\u0092\u00d6\u0015\u0087\u00c6\u00fd\u00b8".length();
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
        di_0.v = var6_13;
        di_0.w = new Integer[8];
        v15 = new Object[3];
        v15[2] = var22_1;
        v15[1] = 0;
        v15[0] = di_0.a("q", (int)5168, (long)(5781165324440555530L ^ var20));
        di_0.d("\u00ea", (Object)cp_0.b, (Object)v15, (long)-155528060874362730L, (long)var20);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int i(long l, long l2) {
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
            case 0 -> 43;
            case 1 -> 37;
            case 2 -> 52;
            case 3 -> 14;
            case 4 -> 38;
            case 5 -> 0;
            case 6 -> 18;
            case 7 -> 34;
            case 8 -> 25;
            case 9 -> 30;
            case 10 -> 41;
            case 11 -> 7;
            case 12 -> 59;
            case 13 -> 50;
            case 14 -> 31;
            case 15 -> 22;
            case 16 -> 17;
            case 17 -> 35;
            case 18 -> 1;
            case 19 -> 3;
            case 20 -> 4;
            case 21 -> 2;
            case 22 -> 29;
            case 23 -> 12;
            case 24 -> 19;
            case 25 -> 28;
            case 26 -> 62;
            case 27 -> 39;
            case 28 -> 45;
            case 29 -> 15;
            case 30 -> 46;
            case 31 -> 56;
            case 32 -> 6;
            case 33 -> 13;
            case 34 -> 60;
            case 35 -> 10;
            case 36 -> 11;
            case 37 -> 8;
            case 38 -> 33;
            case 39 -> 47;
            case 40 -> 9;
            case 41 -> 63;
            case 42 -> 57;
            case 43 -> 20;
            case 44 -> 32;
            case 45 -> 49;
            case 46 -> 48;
            case 47 -> 27;
            case 48 -> 23;
            case 49 -> 42;
            case 50 -> 55;
            case 51 -> 21;
            case 52 -> 53;
            case 53 -> 36;
            case 54 -> 58;
            case 55 -> 26;
            case 56 -> 61;
            case 57 -> 54;
            case 58 -> 40;
            case 59 -> 44;
            case 60 -> 51;
            case 61 -> 24;
            case 62 -> 16;
            default -> 5;
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
        di_0.z[n3] = new String(cArray);
        return n3;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    @Override
    protected bT b(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x6F71286D06BCL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (dt_0)((Object)di_0.d("\u00ea", (Object)this.j, (Object)di_0.d("Z", (int)n, (long)-2443932798651283716L, (long)l), arg_0 -> this.lambda$createBuffer$1(n, arg_0), (long)-2444443471256580548L, (long)l));
        return di_0.d("\u00ea", (Object)aq_02, (Object)objectArray2, (long)-2444286856949300896L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/di" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5522;
        if (w[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])x.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    x.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/di", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            di_0.w[n2] = n3;
        }
        return w[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = di_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void c() {
        Object[] objectArray = y;
        y[0] = "tWm~\u0014\u0014qBf~\u0017\u0013~Km<V$W\u00149";
        objectArray[1] = Integer.TYPE;
        di_0.z[1] = "java/lang/Integer";
        objectArray[2] = Void.TYPE;
        di_0.z[2] = "java/lang/Void";
        objectArray[3] = "+RQZB\u000f=RT\u0000Q\u0018*\u0019W\u0006]\f;^@\u0011\u0016\u001b*";
        objectArray[4] = "9\u001fpD\u0006\u0017L?{K\u0017X-1p@\u0013\u0002Y";
        objectArray[5] = "b6&b\u001a%t6#8\t2c} >\u0005&r:7)N1e";
        objectArray[6] = "gUaz`P\u0012ujuq\u001fs{a~uE\u0007";
        objectArray[7] = "o\u007f\t;\u001aYy\u007f\fa\tNn4\u000fg\u0005Z\u007fs\u0018pNO_";
        objectArray[8] = "\u0014Vfs^\u0014\u0002Vc)M\u0003\u0015\u001d`/A\u0017\u0004Zw8\n\u0003:";
        objectArray[9] = "4_zzk\u001b?Pk5\u0016\u0003,Wb|";
        objectArray[10] = Float.TYPE;
        di_0.z[10] = "java/lang/Float";
        objectArray[11] = "!/fy[z7/c#Hm d`%Dy1#w2\u000fn,";
        objectArray[12] = "\u001eVaUP\u0006\u0015Yp\u001a3\u000b\u0000T\u007fq\u0006\t\u0011Gc]\u0011\u0004";
        objectArray[13] = "L$\u0005dkB9\u0004\u000ekz\rX\n\u0005`~W,";
        objectArray[14] = "<zsDV\u00069oxDU\u00016fs\u0006\u00146\u001f9%";
        objectArray[15] = "j0Q\u0015R\u0019\u001f\u0010Z\u001aCV~\u001eQ\u0011G\f\n";
        objectArray[16] = "|\u000b2?\u0006\u0010w\u0004#p{\u0005e\u001e!3";
        objectArray[17] = Long.TYPE;
        di_0.z[17] = "java/lang/Long";
        objectArray[18] = "\u000fs\u001e4\u001f(\u0011{\u0004{|<\u0015";
        objectArray[19] = "dT\u000f\u0016hao[\u001eY\todP\u001a\u0003";
        objectArray[20] = "\u0011\u0014{Mn`\u000f\u001ca\u0002&`\u0015\u0016yE/{U3xB#a\u0012\u001ac";
        objectArray[21] = "]\u007f\fL\u0011pVp\u001d\u0003vrC{\u001dHM";
        objectArray[22] = "\u0014/y[o\u001c\u0002/|\u0001|\u000b\u0015d\u007f\u0007p\u001f\u0004#h\u0010;\r\u0001";
        objectArray[23] = "\r*2[m*x\n9T|e\u0019\u00042_x?m";
        objectArray[24] = "\\\nX&%iJ\n]|6~]A^z:jL\u0006Imq{l";
        objectArray[25] = "vy]DBK`yX\u001eQ\\w2[\u0018]HfuL\u000f\u0016X+";
        objectArray[26] = "\u001f|Mk87j\\Fd)x\u000bRMo-\"\u007f";
        objectArray[27] = ",\\\u0011\u0010&Q:\\\u0014J5F-\u0017\u0017L9R<P\u0000[rG\u001f";
        objectArray[28] = "\u0014j}N'}aJvA62\u0000D}J2ht";
        objectArray[29] = "Ev\n\r\u001e^Sv\u000fW\rID=\fQ\u0001]Uz\u001bFJIp";
        objectArray[30] = "\u0001]\"\u0019swt})\u0016b8\u0015s\"\u001dfba";
        objectArray[31] = "\u0000ume@\u0001uUfjQN\u0014[maU\u0014`";
        objectArray[32] = "i\u001d\nZ\tr\u007f\u001d\u000f\u0000\u001aehV\f\u0006\u0016qy\u0011\u001b\u0011]eY";
        objectArray[33] = "\u001c\u001b-\u0000\u001e\u0006i;&\u000f\u000fI\b5-\u0004\u000b\u0013|";
        objectArray[34] = "BbPZ`\u0002TbU\u0000s\u0015C)V\u0006\u007f\u0001RnA\u00114\u0015i";
        objectArray[35] = "f^\u0017\u0018'*\u0013~\u001c\u00176erp\u0017\u001c2?\u0006";
        objectArray[36] = "/3\u001aM0\u001d93\u001f\u0017#\n.x\u001c\u0011/\u001e??\u000b\u0006d\n\u001e";
        objectArray[37] = "v-z\u0015j\u0003\u0003\rq\u001a{Lb\u0003z\u0011\u007f\u0016\u0016";
        objectArray[38] = "5\u000b7\u000elP#\u000b2T\u007fG4@1RsS%\u0007&E8G\u0002";
        objectArray[39] = "\u001cH-<H\u0014DW41:\u0002!\r55\\\u0019P\u000e) Fk\u001e\u000fh3H\u0002ZM:7:VZK3(E\u000eER>Z";
        objectArray[40] = "qMYmJa+\rD\u001dG`\b\u001aF|Vi\u001d\u001cJaU~,q\u0003 Ib(\u0018WzK|AHZc\u0016=&\u000f\u0004q\u0011\u0004";
        objectArray[41] = "\u0017Z0|cpJ\fp%Sw-L~`,k\u0016T0ul\u001a\u0014U>&j}S\u000b,!S";
        objectArray[42] = "\u0016\u0004S6\u000f\u007f\u001c\u001eJ:vj-\u0007\u0010>\tr\u0016\u001f^+I\u0003\u0011\u0000\u00168\u0018iHCB=v";
        objectArray[43] = "\u0010\u0002\u0015>\u0012\r\u0003]\u001e.~\u0018\u001b^\f2\u0002\u001e=U=%\u0005\u001e\u001aGt#\u0002\u0011\u0000F\u0019q\u0013\u0016\u0005;\u00181\u0015M\u0003E\u0017/\u0007C|W\b-\u0002\u000e\u0011\u0005\u0019*\u0007s";
        objectArray[44] = ",M\u001d~c\u001avY\u001d}\f\rNX_?s\u0016u@\u0011*3g-\u001a\u0013x`\b\"BX=\f";
        objectArray[45] = "\u000f\u001932Mf\u001e\u0005 65po\u001cc7JkT\u0004-\"\n\u001a\u000f\u001932Mf\u001e\u0005 65";
        objectArray[46] = "(\u000e\"%\u001e\bp\u0011;(l\u001e\u0015K:,\n\u0005dH&9\u0010w*Ig*\u001e\u001en\u000b5.lH)H31\u0005\fk\u001a7CQ\fm\u0013(<\t\u0013t\u001eZ";
        objectArray[47] = "!!2\u0003nfkefA\u000eh\u0011*4\u00077}l#<\\d\u0002!vg\u0001q\u007f(~<R\u000e";
        objectArray[48] = "5\u0003\u000b\u0012+!1\b\u0014\u0011\u001a01\u0016\bD] XKHH|'1\u001f\u0012JbN5\u0003\u000b\u0012+!1\b\u0014\u0011\u001a";
        objectArray[49] = "]~(8sY\u0007j(;\u001cM?kjycU\u0004s$l#$]~(8sY\u0007j(;\u001c";
        objectArray[50] = "LZ%\\86\u0014E<QJ q\u0018`[, \u0018L:Y2ILZ%\\86\u0014E<QJ";
        objectArray[51] = "(hN)owq+\u001a,\u0001t\u0014oH/~l/w\u0006:>\u001d-+\u00171htyq\u0015/\u0001";
        objectArray[52] = "e0trnX<s w\u0000[Y7rt\u007fCb/<a?2`.229U'p 5\u0000";
        objectArray[53] = "{6\u001a9X_x\"\u0013>'\u000b\u00155C~X\u0013.-\rk\u0018bu%\u000fjM\u0003s(\u001c`'";
        objectArray[54] = "6]\u0015Xf#m\u0018\u001f\fV-ch\u0010R:\u001ejR\rI,/\u0007\u001bLU0+nO\u0016W.B>\u001f\u0010R?+jE\u0012LV{g\\O\r1<9NH4";
        objectArray[55] = "\u0010\u00056alMJ\u00116b\u0003Yr\u0010t |AI\b:5<0\u0017\u001111gML\u0017((\u0003";
        objectArray[56] = " l,u\u0003Ezx,vlQByn4\u0013Iya !S8$c5'\tD&95#l";
        objectArray[57] = "\u0019y\u0016y\u001d~\u0017.\nvl{\u000e>\u0000w\nl/%\u001fw)q\u0017 \u001balz\u00019\u0006x\u001c.\u001c|\u001f\u001a";
        objectArray[58] = "cM{\\\u001fl9Y{_px\u0001X9\u001d\u000f`:@w\bO\u0011y\u001f`\u001fKkb\u001ai\u0015p";
        Object[] objectArray2 = objectArray;
        objectArray[59] = "\u0002YIeUNXMIf:Z`L\u000b$EB[TE1\u00053\u0019XV:BO\u0000LW,:";
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00cc' || c == '\u00e2' || c == '\u00c1') {
                field = di_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = di_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = di_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void c(Object[] objectArray) {
        gJ gJ2 = (gJ)objectArray[0];
        long l = (Long)objectArray[1];
        di_0.d("\u00ea", (Object)di_0.d("\u00ea", (Object)di_0.d("\u00ea", (Object)di_0.d("\u00ea", (Object)di_0.d("\u00ea", (Object)gJ2, (Object)di_0.a("q", (int)10860, (long)(0x505C39B9F711647EL ^ l)), (float)((float)(di_0.d("Z", (long)8646413532576353879L, (long)l) - b) / 1000.0f), (long)8645084912659567624L, (long)l), (Object)di_0.a("q", (int)31423, (long)(0x6E9AF3E8E5AEB4AAL ^ l)), (float)0.5f, (long)8645084912659567624L, (long)l), (Object)di_0.a("q", (int)3213, (long)(0x2287E1E63F42429CL ^ l)), (float)0.2f, (long)8645084912659567624L, (long)l), (Object)di_0.a("q", (int)31956, (long)(0x7C66F58EB2D2B2C0L ^ l)), (float)1.0f, (long)8645084912659567624L, (long)l), (Object)di_0.a("q", (int)12441, (long)(0x7AC84E4750017E80L ^ l)), (float)1.0f, (long)8645084912659567624L, (long)l);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = di_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = di_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = di_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = di_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = di_0.i(l, l2);
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
                clazz3 = di_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = di_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = di_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        di_0.y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = di_0.j(1403645507610002L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = di_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        di_0.y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = di_0.j(1403645507610002L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/di" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/di" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39E1;
        if (q[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])r.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/di", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n2].getBytes("ISO-8859-1");
            di_0.q[n2] = di_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
    }

    @Override
    public c9 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x59EB766A2C2FL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = dp_0::a;
        objectArray2[1] = this::lambda$getPipeline$2;
        objectArray2[0] = di_0.d("\u00ea", (Object)this, (Object)new Object[0], (long)-2004160842133161233L, (long)l);
        return di_0.d("\u00ea", (Object)new c9(), (Object)objectArray2, (long)-2004600769697367119L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = di_0.a(n, l);
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

    private static Field k(long l, long l2) {
        int n = di_0.i(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            String string = z[n];
            int n2 = string.indexOf(8);
            Class clazz = di_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = di_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = di_0.e(clazz3, string2, clazz2)) != null) {
                    di_0.y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = di_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        di_0.y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = di_0.j(1403645507610002L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = di_0.i(l, l2);
            object = y[n];
            try {
                if (!(object instanceof String)) break block2;
                di_0.y[n] = clazz = Class.forName(z[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void lambda$getPipeline$2(dy_0 dy_02) {
        float f;
        float f10;
        CallSite callSite;
        CallSite callSite2;
        long l = m ^ 0x3B77B80D069DL;
        long l2 = l ^ 0x5A7FACB1D7FFL;
        try {
            di_0.d("Z", (int)di_0.c("u", (int)31698, (long)(0xD929AE83A60C3ABL ^ l)), (long)-1344497992989838856L, (long)l);
            di_0.d("Z", (int)di_0.c("u", (int)7742, (long)(0x31178B648D5CA646L ^ l)), (int)this.h.a, (long)-1346302654425470425L, (long)l);
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            di_0.d("\u00ea", (Object)this, (Object)objectArray, (long)-1344587891221478709L, (long)l);
            callSite2 = di_0.d("Z", (int)di_0.d("\u00ea", (Object)di_0.d("\u00ea", (Object)this, (Object)new Object[0], (long)-1344353073600547945L, (long)l), (Object)new Object[0], (long)-1346140156170870153L, (long)l), (long)-1346060442269104108L, (long)l);
            callSite = di_0.a("q", (int)24715, (long)(0x4851D5F064183435L ^ l));
            f10 = this.d > 0 ? 1.0f / (float)this.d : 0.0f;
        }
        catch (MatchException matchException) {
            throw di_0.d("Z", (Object)matchException, (long)-1344678726040049454L, (long)l);
        }
        try {
            f = this.e > 0 ? 1.0f / (float)this.e : 0.0f;
        }
        catch (MatchException matchException) {
            throw di_0.d("Z", (Object)matchException, (long)-1344678726040049454L, (long)l);
        }
        di_0.d("\u00ea", (Object)callSite2, (Object)callSite, (float)f10, (float)f, (long)-1344663239849984666L, (long)l);
    }

    private dt_0 lambda$createBuffer$1(int n, Integer n2) {
        long l = m ^ 0x335178E71DB9L;
        long l2 = l ^ 0x348127419230L;
        fW[] fWArray = new fW[di_0.c("u", (int)21042, (long)(0x3144D1BC302BF16CL ^ l))];
        fWArray[0] = di_0.d("Z", (Object)new Object[]{this.g.a}, (long)-686823586958051621L, (long)l);
        fWArray[1] = di_0.d("Z", (Object)new Object[]{cp_0.b}, (long)-686879855403684423L, (long)l);
        Object[] objectArray = new Object[3];
        objectArray[2] = true;
        objectArray[1] = false;
        objectArray[0] = (int)di_0.c("u", (int)20305, (long)(0x4F2C0BB99883EC0EL ^ l));
        fWArray[2] = di_0.d("Z", (Object)objectArray, (long)-688362270232188937L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = true;
        objectArray2[0] = true;
        fWArray[3] = di_0.d("Z", (Object)objectArray2, (long)-687722067982014190L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (int)di_0.c("u", (int)13749, (long)(0x153A9084E4AB16EDL ^ l));
        objectArray3[0] = (int)di_0.c("u", (int)18652, (long)(0x6D73612B0A60EB87L ^ l));
        fWArray[4] = di_0.d("Z", (Object)objectArray3, (long)-686994107282312532L, (long)l);
        fWArray[5] = di_0.d("Z", (Object)new Object[]{arg_0 -> di_0.lambda$createBuffer$0(n, arg_0)}, (long)-687583478315970531L, (long)l);
        return new dt_0(gf_0.c, 4, true, fWArray, l2);
    }

    private static void lambda$createBuffer$0(int n, dy_0 dy_02) {
        long l = m ^ 0x27D0A2265DD8L;
        di_0.d("Z", (int)di_0.c("u", (int)9901, (long)(0x488DE15D85C24595L ^ l)), (long)-5327056226570851651L, (long)l);
        di_0.d("Z", (int)di_0.c("u", (int)30286, (long)(0x5EC5596753601575L ^ l)), (int)n, (long)-5326099774059400862L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(di_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(di_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(di_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


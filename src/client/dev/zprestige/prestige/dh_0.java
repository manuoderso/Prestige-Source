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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.dh
 */
public class dh_0
extends de_0 {
    private final Color a;
    private static final long m;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;
    private static final long[] v;
    private static final Integer[] w;
    private static final Map x;
    private static final Object[] y;
    private static final String[] z;

    public dh_0(long l) {
        long l2 = (l = m ^ l) ^ 0x46FDC20ACFE0L;
        super((String)((Object)dh_0.a("h", (int)2076, (long)(0x393C1CE91B4F3387L ^ l))), (String)((Object)dh_0.a("h", (int)27001, (long)(0x3A0979AD03052E3L ^ l))), l2);
        this.a = dh_0.d("T", (long)845120602990780425L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        dh_0.m = hc.a(-7496703965450180921L, 5631059590647541375L, MethodHandles.lookup().lookupClass()).a(132421663691780L);
                        var20 = dh_0.m ^ 30741225927896L;
                        var22_1 = var20 ^ 17435985792291L;
                        dh_0.y = new Object[63];
                        dh_0.z = new String[63];
                        dh_0.c();
                        dh_0.r = new HashMap<K, V>(13);
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
                        var18_4 = new String[5];
                        var16_5 = 0;
                        var15_6 = "\u00f5\u007f\u00bc\u008e\u0097I\u0001l\\7\n(Hz\u00d1\u00e4\u00d5-\u00aa\u00baEN&\u00a7\u000b\u00d3\u0097\u00ab\u0090\u00f7~ \u0010\u00f1Kq\u0081 e\u0097\u007fX\u0006\u00e5dE\u0017\u0000\u00ac(\u0003\u007f\u0090\u00e3\u00f7\u00d3\u0090\u0095\u00b0\u0084\u0085q\u0095\u00e3L\u0017{\u00df\u000b\u0084\u0089\u0083VEQ\u0083]\u008aK \u00cc\u0094\u001ak\u000bu\u0082$\u0018\u00cc";
                        var17_7 = "\u00f5\u007f\u00bc\u008e\u0097I\u0001l\\7\n(Hz\u00d1\u00e4\u00d5-\u00aa\u00baEN&\u00a7\u000b\u00d3\u0097\u00ab\u0090\u00f7~ \u0010\u00f1Kq\u0081 e\u0097\u007fX\u0006\u00e5dE\u0017\u0000\u00ac(\u0003\u007f\u0090\u00e3\u00f7\u00d3\u0090\u0095\u00b0\u0084\u0085q\u0095\u00e3L\u0017{\u00df\u000b\u0084\u0089\u0083VEQ\u0083]\u008aK \u00cc\u0094\u001ak\u000bu\u0082$\u0018\u00cc".length();
                        var14_8 = 32;
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
                            var18_4[var16_5++] = dh_0.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "B\u00f0/\u00ce\u00eeJ\u00a4J@\u00af\u00d1\u008a\u00dbzC\u00f8\u0015\u00eb\u001f\u009b\u00079\u00ac\u00a8v:\u00fa\u0002\u009e\u00b1zz\u0083#\u00abn\u000f\u00ab\u0083\u00e0\u009b\u00ef\u00f8\u00df4\u00e3\u00a5\u00ec \u00fd2\u0095\u00b8\u0087R\u00d47\u001d\u00d7\u00f0\u00ff\u00e4\u00dcv{D8r\u00d2\u00c0\u00fa\u00d0\u00c1p\u0081G\u00eaj+\u008ae";
                            var17_7 = "B\u00f0/\u00ce\u00eeJ\u00a4J@\u00af\u00d1\u008a\u00dbzC\u00f8\u0015\u00eb\u001f\u009b\u00079\u00ac\u00a8v:\u00fa\u0002\u009e\u00b1zz\u0083#\u00abn\u000f\u00ab\u0083\u00e0\u009b\u00ef\u00f8\u00df4\u00e3\u00a5\u00ec \u00fd2\u0095\u00b8\u0087R\u00d47\u001d\u00d7\u00f0\u00ff\u00e4\u00dcv{D8r\u00d2\u00c0\u00fa\u00d0\u00c1p\u0081G\u00eaj+\u008ae".length();
                            var14_8 = 48;
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
                            var18_4[var16_5++] = dh_0.a(var19_10).intern();
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
                dh_0.p = var18_4;
                dh_0.q = new String[5];
                dh_0.x = new HashMap<K, V>(13);
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
                var4_15 = "\u0019XY\u0099\u00d7\u008e\u0002\u00a4\u0098\u0092\u00f9\u00c9\u0085\u008f:o\"\u007f\u00a0,H\u0010\u00f1N\u00ed\u00fb)\u0083\u008a\u00d2h\u009c\u00f9e\u00ccF-\u00a3oh\u007f\u0015\u001d\u00f7\u00c5O\u0094\u00b9";
                var5_16 = "\u0019XY\u0099\u00d7\u008e\u0002\u00a4\u0098\u0092\u00f9\u00c9\u0085\u008f:o\"\u007f\u00a0,H\u0010\u00f1N\u00ed\u00fb)\u0083\u008a\u00d2h\u009c\u00f9e\u00ccF-\u00a3oh\u007f\u0015\u001d\u00f7\u00c5O\u0094\u00b9".length();
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
                    var4_15 = "\u0091\u00db\u00ba[\u009d8\u00c9\u008cT\u0083\u00043G:\u007f\u00c7";
                    var5_16 = "\u0091\u00db\u00ba[\u009d8\u00c9\u008cT\u0083\u00043G:\u007f\u00c7".length();
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
        dh_0.v = var6_13;
        dh_0.w = new Integer[8];
        v15 = new Object[3];
        v15[2] = var22_1;
        v15[1] = 0;
        v15[0] = dh_0.a("h", (int)30025, (long)(4257447320528647255L ^ var20));
        dh_0.d("a", (Object)cp_0.b, (Object)v15, (long)-5675220270442690224L, (long)var20);
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
            case 0 -> 2;
            case 1 -> 61;
            case 2 -> 24;
            case 3 -> 38;
            case 4 -> 47;
            case 5 -> 8;
            case 6 -> 36;
            case 7 -> 56;
            case 8 -> 40;
            case 9 -> 57;
            case 10 -> 15;
            case 11 -> 34;
            case 12 -> 58;
            case 13 -> 10;
            case 14 -> 32;
            case 15 -> 14;
            case 16 -> 43;
            case 17 -> 23;
            case 18 -> 63;
            case 19 -> 48;
            case 20 -> 49;
            case 21 -> 45;
            case 22 -> 41;
            case 23 -> 21;
            case 24 -> 22;
            case 25 -> 20;
            case 26 -> 26;
            case 27 -> 59;
            case 28 -> 13;
            case 29 -> 18;
            case 30 -> 62;
            case 31 -> 30;
            case 32 -> 44;
            case 33 -> 12;
            case 34 -> 53;
            case 35 -> 17;
            case 36 -> 37;
            case 37 -> 11;
            case 38 -> 50;
            case 39 -> 54;
            case 40 -> 1;
            case 41 -> 29;
            case 42 -> 25;
            case 43 -> 19;
            case 44 -> 4;
            case 45 -> 9;
            case 46 -> 31;
            case 47 -> 7;
            case 48 -> 3;
            case 49 -> 6;
            case 50 -> 27;
            case 51 -> 46;
            case 52 -> 39;
            case 53 -> 42;
            case 54 -> 51;
            case 55 -> 33;
            case 56 -> 28;
            case 57 -> 0;
            case 58 -> 35;
            case 59 -> 5;
            case 60 -> 52;
            case 61 -> 60;
            case 62 -> 55;
            default -> 16;
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
        dh_0.z[n3] = new String(cArray);
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
        objectArray2[0] = (dt_0)((Object)dh_0.d("a", (Object)this.j, (Object)dh_0.d("w", (int)n, (long)-2444773505408770053L, (long)l), arg_0 -> this.lambda$createBuffer$1(n, arg_0), (long)-2444497475793515712L, (long)l));
        return dh_0.d("a", (Object)aq_02, (Object)objectArray2, (long)-2443915148529273979L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x184E;
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
                throw new RuntimeException("dev/zprestige/prestige/dh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            dh_0.w[n2] = n3;
        }
        return w[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = dh_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void c() {
        Object[] objectArray = y;
        y[0] = "07\u0013-\u0018\u0016&7\u0016w\u000b\u00011|\u0015q\u0007\u0015 ;\u0002fL\u0000\u0000";
        objectArray[1] = "eo\u000e\u0016Pk\u0010O\u0005\u0019A$qA\u000e\u0012E~\u0005";
        objectArray[2] = Void.TYPE;
        dh_0.z[2] = "java/lang/Void";
        objectArray[3] = "Tc'S\u0006GBc\"\t\u0015PU(!\u000f\u0019DDo6\u0018RSS";
        objectArray[4] = "\u0015<nQhR`\u001ce^y\u001d\u0001\u0012nU}Gu";
        objectArray[5] = "\u001dJ\u000eL\u0000?\u000bJ\u000b\u0016\u0013(\u001c\u0001\b\u0010\u001f<\rF\u001f\u0007T,@";
        objectArray[6] = "xa\u0007j\u001d_\rA\fe\f\u0010lO\u0007n\bJ\u0018";
        objectArray[7] = "\rK1\u0007v\u0014\b^:\u0007u\u0013\u0007W1E4$.\be";
        objectArray[8] = Integer.TYPE;
        dh_0.z[8] = "java/lang/Integer";
        objectArray[9] = "\u001ax\u001de6c\fx\u0018?%t\u001b3\u001b9)`\nt\f.bw\u001b";
        objectArray[10] = "R\u0001'K\"X'!,D3\u0017F/'O7M2";
        objectArray[11] = "~\u0019|hI\u0003h\u0019y2Z\u0014\u007fRz4V\u0000n\u0015m#\u001d\u0014P";
        objectArray[12] = "\nO\u0001xU\u000b\u0001@\u00107(\u0013\u0012G\u0019~";
        objectArray[13] = Float.TYPE;
        dh_0.z[13] = "java/lang/Float";
        objectArray[14] = ":c7QECOC<^T\f.M7UPVZ";
        objectArray[15] = ":2\u0018yXg,2\u001d#Kp;y\u001e%Gd*>\t2\fs6";
        objectArray[16] = "{}'\u0007J\u0006pr6H)\u000be\u007f9#\u001c\ttl%\u000f\u000b\u0004";
        objectArray[17] = "*'JB1^/2AB2Y ;J\u0000sn\td\u001c";
        objectArray[18] = ";\u0011\u000180\u000e&\u0004Y\u001aq\u0003>\u0002";
        objectArray[19] = "I%\u007fufO_%z/uXHny)yLY)n>2Yz";
        objectArray[20] = "8B[\u0017\u001dBMbP\u0018\f\r,l[\u0013\bWX";
        objectArray[21] = "\u0011r9k+I\u0007r<18^\u00109?74J\u0001~( \u007f^$";
        objectArray[22] = "\u001cU`\bX#iuk\u0007Il\b{`\fM6|";
        objectArray[23] = "`\u0016l^j\u0013\u00156gQ{\\t8lZ\u007f\u0006\u0000";
        objectArray[24] = "@E\u00152)\"VE\u0010h:5A\u000e\u0013n6!PI\u0004y}5p";
        objectArray[25] = "L\u001aS\u0016,L9:X\u0019=\u0003X4S\u00129Y,";
        objectArray[26] = "~,\u0018\\d2h,\u001d\u0006w%\u007fg\u001e\u0000{1n \t\u00170%U";
        objectArray[27] = "\u0002a\u0000l}?wA\u000bclp\u0016O\u0000hh*b";
        objectArray[28] = "b\u0014J\u0019 ,t\u0014OC3;c_LE?/r\u0018[Rt;S";
        objectArray[29] = "VW&u\u0013p#w-z\u0002?By&q\u0006e6";
        objectArray[30] = "kp{&\u0000|}p~|\u0013kj;}z\u001f\u007f{|jmTk\\";
        objectArray[31] = "PQqX@\u0006NYk\u0017#\u0012J";
        objectArray[32] = "\u0019z\u0016y6>\u0012u\u00076W0\u0019~\u0003l";
        objectArray[33] = "\u001aygm|N\u0004q}\"4N\u001e{ee=U^^db1O\u0019w\u007f";
        objectArray[34] = "5\u001f:Z\u001f9>\u0010+\u0015x;+\u001b+^C";
        objectArray[35] = " Y.\u001e:\u00046Y+D)\u0013!\u0012(B%\u00070U?Un\u00155";
        objectArray[36] = "%n\u0016p8IPN\u001d\u007f)\u00061@\u0016t-\\E";
        objectArray[37] = "\u0016>\"e\u001f~\u0000>'?\fi\u0017u$9\u0000}\u000623.Kl&";
        objectArray[38] = "b;\u001e8t\u0017{i]#\u0018Id$o\"uKoX\u001d&tDl8N\"`A\t";
        objectArray[39] = "T&]\u000f\u00156\r5WMyjj!RL\u0004m\u000e8TW\u0016\u0007S+\u0013W\u0013cZ:\u0001Ey";
        objectArray[40] = "t\b\u001c\u0000\u00165\u007fHQ\u0014(,w\u001d\u0016\u0010T*Q\u0016'\u0007S*v\u0004n\bC:iC\u001c\u0001T|-x\b\u0003D(}\u0011\u0001\u0017\u0017<\u0010\u001d\u0005\u0010Q|b\u0014\u0012V\u0015G";
        objectArray[41] = "D\u0019k+KW]K(0'\tB\u0006\u000f&Kf\u0012\u00049)B\u0006A\u0000-,'";
        objectArray[42] = "\u0015:\u0007nhaI6Cp\u0007h*{Qp}=S'[qe\u0001\u001brUq~yZ*\u0001\u007f\u00070\u0013!Av\u007fqKuO\u000f8p\u0012*Pod|V4?";
        objectArray[43] = "*\";Y\u0005\u000fv.\u007fGj\u0006\u0015cmG\u0010Sl?gF\bo$jiF\u0013\u0017e2=Hj^,9}A\u0012\u001ftms8[V\u007f-z@\u001a\u000e+#\u0003\tS\u0005k*{H\u000bQeS<IR\u000ez3`E\u0016\u0010\u0015";
        objectArray[44] = "\f/cG\f.\by|\u0001k4\u0002plU,$k)oT\t/\u000bzk@\fJ\f/cG\f.\by|\u0001k";
        objectArray[45] = "|rL8vNhu\u0007}\u001b\u001f\u0010j\b<f\u001cts\u000e'tv|rL8vNhu\u0007}\u001b";
        objectArray[46] = "hK\u000e?V#4GJ!9*W\u0007H2[&7TL&^ChK\u000e?V#4GJ!9";
        objectArray[47] = "/L\u0016P_\u0015,\u0016@<\ni0\u0017RA\t\r)\u0011IScP:VIV\u0007Y+D[<";
        objectArray[48] = "03;Dy44#fZDlW!dF9o38b]+\u0005.`b\u0006=d2` ND";
        objectArray[49] = "1H\fd1{%OG!\\*]PH`!)9IN{3C<D\u001cs$2m\u0011\u0015&\\";
        objectArray[50] = "\u0019\u001et\u001a\b\b\r\u0019?_eYu\u00060\u001e\u0018Z\u0011\u001f6\u0005\n0\u0017\u001cj\u0017\u0005K\u001b\u0006v\u000ee";
        objectArray[51] = "\ffiL/p\u0018a\"\tB!`~-H?\"\u0004g+S-H\u0004l#\t<x\u0001kk\u0001B";
        objectArray[52] = "AWY\u000e\u0012\u001fX\u0005\u001a\u0015~AGH.\n\u0006NC4Z\u0010\u0012LOT\t\u0014\u0006I*";
        objectArray[53] = "\u0007U|`jxG_1$Qq_n&!0`V{ --cAJM`/rYB-3+f\\'t//|QC}>=n;";
        objectArray[54] = "siK k|5t@iZ|Iq\u001bb'\u007f-h\u001dy5\u0015.m\u0019wfi-7O\u001b";
        objectArray[55] = "\u001e]m)\"!\nZ&lOsrE)-2s\u0016\\/6 \u0019\u001f[u-$(CM/hO";
        objectArray[56] = "\nKU_\u000b|_O\u0016^1g6\nVGLgR\u0013P\\^\r\nKU_\u000b|_O\u0016^1";
        objectArray[57] = "\u001ai\u0017:]&\u0003;T!1H1Ku\u00171|\u00124I6\u0000e@wR";
        objectArray[58] = "\u0003UGK7\u0004\u0000\u000f\u0011'bx\u001c\u000e\u0003Za\u001c\u0005\b\u0018H\u000bE\u001a]\u0018Bk\u0016\u001eI\u001d'";
        objectArray[59] = "2\u0010Yi\u001bk+B\u001arw54\u000f-m\n7YN\u0019e\u0015?9\u001d\u001dq\u0010Z";
        objectArray[60] = "3}*>`S&|\u007fg\u0002[Zt&'mM*b(5e10};6~A&s)>\u0002";
        objectArray[61] = "L-%=P\b\u001d3(`o\\B\u001b)>\u0003oK!4%\u0015^&l64\rVF?2 \b3\u001b/$:\nSH+0?o\nT/*2\u000b\u0003E=8X";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "\u000f_;\n\\E\u001bXpO1\u0014cG\u007f\u000eL\u0017\u0007^y\u0015^}\u0003\u0006<\u0017J\u0003\u0000R%\u00151";
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == '\u00d3' || c == 'T' || c == 't') {
                field = dh_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dh_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dh_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void c(Object[] objectArray) {
        gJ gJ2 = (gJ)objectArray[0];
        long l = (Long)objectArray[1];
        dh_0.d("a", (Object)gJ2, (Object)dh_0.a("h", (int)31630, (long)(0x3A250F40C43DBC53L ^ l)), (float)((float)dh_0.d("a", (Object)this.a, (long)8645243298973636083L, (long)l) / 255.0f), (float)((float)dh_0.d("a", (Object)this.a, (long)8645172552096928916L, (long)l) / 255.0f), (float)((float)dh_0.d("a", (Object)this.a, (long)8646529445923481221L, (long)l) / 255.0f), (float)((float)dh_0.d("a", (Object)this.a, (long)8646156808627937454L, (long)l) / 255.0f), (long)8645378686804854042L, (long)l);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = dh_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dh_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dh_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dh_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = dh_0.i(l, l2);
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
                clazz3 = dh_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dh_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dh_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        dh_0.y[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dh_0.j(2270580127687553L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dh_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dh_0.y[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dh_0.j(2270580127687553L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/dh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x302C;
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
                throw new RuntimeException("dev/zprestige/prestige/dh", exception);
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
            dh_0.q[n2] = dh_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
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
        objectArray2[0] = dh_0.d("a", (Object)this, (Object)new Object[0], (long)-2006125595475194437L, (long)l);
        return dh_0.d("a", (Object)new c9(), (Object)objectArray2, (long)-2005426963457565413L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dh_0.a(n, l);
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
        int n = dh_0.i(l, l2);
        Object object = y[n];
        if (object instanceof String) {
            String string = z[n];
            int n2 = string.indexOf(8);
            Class clazz = dh_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dh_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dh_0.e(clazz3, string2, clazz2)) != null) {
                    dh_0.y[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dh_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dh_0.y[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dh_0.j(2270580127687553L, 0L);
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
            int n = dh_0.i(l, l2);
            object = y[n];
            try {
                if (!(object instanceof String)) break block2;
                dh_0.y[n] = clazz = Class.forName(z[n]);
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
        long l = m ^ 0x2A71DD8CB682L;
        long l2 = l ^ 0x55C91A36C9CEL;
        try {
            dh_0.d("w", (int)dh_0.c("j", (int)24571, (long)(0x3444B881883834DDL ^ l)), (long)-909443963846346838L, (long)l);
            dh_0.d("w", (int)dh_0.c("j", (int)31534, (long)(0x9EAF1B4AB78900DL ^ l)), (int)this.h.a, (long)-908864508132815556L, (long)l);
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            dh_0.d("a", (Object)this, (Object)objectArray, (long)-908149382308151595L, (long)l);
            callSite2 = dh_0.d("w", (int)dh_0.d("a", (Object)dh_0.d("a", (Object)this, (Object)new Object[0], (long)-909185592219870478L, (long)l), (Object)new Object[0], (long)-908944703598563511L, (long)l), (long)-907500126169394172L, (long)l);
            callSite = dh_0.a("h", (int)31373, (long)(0x7AC90DDD7444B9CDL ^ l));
            f10 = this.d > 0 ? 1.0f / (float)this.d : 0.0f;
        }
        catch (MatchException matchException) {
            throw dh_0.d("w", (Object)matchException, (long)-908778687922311292L, (long)l);
        }
        try {
            f = this.e > 0 ? 1.0f / (float)this.e : 0.0f;
        }
        catch (MatchException matchException) {
            throw dh_0.d("w", (Object)matchException, (long)-908778687922311292L, (long)l);
        }
        dh_0.d("a", (Object)callSite2, (Object)callSite, (float)f10, (float)f, (long)-907795643794527934L, (long)l);
    }

    private dt_0 lambda$createBuffer$1(int n, Integer n2) {
        long l = m ^ 0x6EE84D6B3744L;
        long l2 = l ^ 0x7788C1CB16E3L;
        fW[] fWArray = new fW[dh_0.c("j", (int)7619, (long)(0x143D42B25434F725L ^ l))];
        fWArray[0] = dh_0.d("w", (Object)new Object[]{this.g.a}, (long)8261495089728752150L, (long)l);
        fWArray[1] = dh_0.d("w", (Object)new Object[]{cp_0.b}, (long)8261566444023385566L, (long)l);
        Object[] objectArray = new Object[3];
        objectArray[2] = true;
        objectArray[1] = false;
        objectArray[0] = (int)dh_0.c("j", (int)28814, (long)(0xC3E1A25F4671A6FL ^ l));
        fWArray[2] = dh_0.d("w", (Object)objectArray, (long)8261808236960220824L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = true;
        objectArray2[0] = true;
        fWArray[3] = dh_0.d("w", (Object)objectArray2, (long)8261175127238706433L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = (int)dh_0.c("j", (int)26829, (long)(0x6A9579E15F81022FL ^ l));
        objectArray3[0] = (int)dh_0.c("j", (int)6035, (long)(0x3E04BF280DA1FD70L ^ l));
        fWArray[4] = dh_0.d("w", (Object)objectArray3, (long)8261428245052686839L, (long)l);
        fWArray[5] = dh_0.d("w", (Object)new Object[]{arg_0 -> dh_0.lambda$createBuffer$0(n, arg_0)}, (long)8259993768574604691L, (long)l);
        return new dt_0(gf_0.c, 4, true, fWArray, l2);
    }

    private static void lambda$createBuffer$0(int n, dy_0 dy_02) {
        long l = m ^ 0x30C7C377249EL;
        dh_0.d("w", (int)dh_0.c("j", (int)1891, (long)(0x1F41B8FBC792FE5EL ^ l)), (long)7024800949439505846L, (long)l);
        dh_0.d("w", (int)dh_0.c("j", (int)28315, (long)(0x153E72E11FC817A5L ^ l)), (int)n, (long)7025345203199483680L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dh_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(dh_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dh_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


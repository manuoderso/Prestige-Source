/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cH;
import dev.zprestige.prestige.cU;
import dev.zprestige.prestige.cY;
import dev.zprestige.prestige.gD;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cW
extends cU {
    private final Method a;
    private final MethodHandle b;
    private final boolean c;
    private final Object d;
    private volatile MethodHandle e;
    private volatile boolean f;
    private static final Object[] g;
    private static final ConcurrentHashMap h;
    private static final long i;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final long[] t;
    private static final Integer[] u;
    private static final Map v;
    private static final Object[] B;
    private static final String[] C;

    private cW(Method method, MethodHandle methodHandle, boolean bl, Object object) {
        this.a = method;
        this.b = methodHandle;
        this.c = bl;
        this.d = object;
    }

    private cW(cY cY2, Object object) {
        this(cY2.a, cY2.b, cY2.c, object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        cW.i = hc.a(-8026197432639627820L, 1431898693512326614L, MethodHandles.lookup().lookupClass()).a(175893917039356L);
                        cW.B = new Object[63];
                        cW.C = new String[63];
                        cW.c();
                        cW.p = new HashMap<K, V>(13);
                        var11 = cW.i ^ 115951378897745L;
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
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "\u00e1\u009a\u001dAA\u00c87\u00e2M,\u00f2\u00cb\u0007I^\u00be\u00e3(\b+\u00b9\u008a|0\u00fc\u001e!\u001d3\u00c0\u00d8Bh\u008f\u00e3\u00ae\u00dc\u0084\u00e8\u0097(\u0086?\u00ceHn)\u00a2\u00e3f\u001e\u00a1\u00cc\u0093&\u001fN\u007f.K)0\"\u000b\u0006TY\u00c3\u00cc\u0019`K\u0086\u0094n\u00b5\u00fb\u00d6\u001b\u0005R\u00b4iRk\u00ab\u00a4\u00ccR\u007f\u00c6z\u00ee\u00c6\u0012\u0002P\u0094\u00899y\u00ce\u0004\u00f02\u00d8\u00fdQ=\u00c8c\u00b0v\u0015&\u00c9=%\u00be\u00b7y\u00b8\u00bc\u009b\u0018Y\u001f\u00fbF\u009f\u0086\u0002J\u00ca\u00ad\u00d4W\u00ed0!n\u0004\u00dcs\u00c9H\u00e5\u00f0\u00d3F\u00ad\u00bd\u00f5N\u0003a1\u00e8/\u00ccD\u009e\u00ab\u0098\u00a1FW\u0002\u00c2\u0016\u00ec\u0082\u00f1\u009f\u008f\u00b3:@\u007fWZ\u00b8\u000e\u00cb\u008dZ\r\u0087\u00a2VN\u00b3\u009f\u00a9B\u00b2Z\u00a0\u00eeAxX\u009f\u00cc\u0081\u00f32\u007f\u00cbu\u00a6j\u00d6\u00cb\u0006\u00c8\u00a3\u00c6\u00a1&\u0012\u009d\u00f4\u00a9\u00b9\u00d9\u00c1\u009b\u00d0\u0082\u0007Ng\\\u0002cX\u00fa\u00cd\u00ad\u00e0\u00bd(3\u00a6\u00ac\u00d9\u00b22\u009cZ\u00c4U\u0097\u00d3\u00c4i~\u00004\u00bbp\u00d5\u0000\u0083\u00adX\u009e\u0013\u00e6\u00a7O\u00e7\u0084\u0013\u0096\u00a5\u00ae<\u00a1?zo0c\u0084SY\u00fag\u00b8B\u00e8l\"\u00ed\u00a31\u0097\u00ddBJ\u008c\u008a3\u0095\u00b9\u0095\u00a3\u008a\u008aH\u00car\u0004\u0094\u00be\u00d1\u00b6\u00c5C\u00eb\u0080\u00f2\u00a0\u0090>\u0012\u00a7,T\u00d0@\u0011I\u00f5\u00ca\u00b2\u009by\u00b0\u0006$\u00e7O\u00ad?R\u00ae\u00b5\u00d1\u00f1|\u00f1\u0015&#\u00cd9\u0095KX\u00cb\u00fb\u00dc\u008e\u00e6]\u0094\u00cf\u00d6\u00d9|\u00f5\u00d0\u00ceO\u00e9\u001f\u00b6\u001cB~\u000b\u00db\u00ad\r\u00d1Sq\u00991\u00ffN\u009eW:";
                        var19_6 = "\u00e1\u009a\u001dAA\u00c87\u00e2M,\u00f2\u00cb\u0007I^\u00be\u00e3(\b+\u00b9\u008a|0\u00fc\u001e!\u001d3\u00c0\u00d8Bh\u008f\u00e3\u00ae\u00dc\u0084\u00e8\u0097(\u0086?\u00ceHn)\u00a2\u00e3f\u001e\u00a1\u00cc\u0093&\u001fN\u007f.K)0\"\u000b\u0006TY\u00c3\u00cc\u0019`K\u0086\u0094n\u00b5\u00fb\u00d6\u001b\u0005R\u00b4iRk\u00ab\u00a4\u00ccR\u007f\u00c6z\u00ee\u00c6\u0012\u0002P\u0094\u00899y\u00ce\u0004\u00f02\u00d8\u00fdQ=\u00c8c\u00b0v\u0015&\u00c9=%\u00be\u00b7y\u00b8\u00bc\u009b\u0018Y\u001f\u00fbF\u009f\u0086\u0002J\u00ca\u00ad\u00d4W\u00ed0!n\u0004\u00dcs\u00c9H\u00e5\u00f0\u00d3F\u00ad\u00bd\u00f5N\u0003a1\u00e8/\u00ccD\u009e\u00ab\u0098\u00a1FW\u0002\u00c2\u0016\u00ec\u0082\u00f1\u009f\u008f\u00b3:@\u007fWZ\u00b8\u000e\u00cb\u008dZ\r\u0087\u00a2VN\u00b3\u009f\u00a9B\u00b2Z\u00a0\u00eeAxX\u009f\u00cc\u0081\u00f32\u007f\u00cbu\u00a6j\u00d6\u00cb\u0006\u00c8\u00a3\u00c6\u00a1&\u0012\u009d\u00f4\u00a9\u00b9\u00d9\u00c1\u009b\u00d0\u0082\u0007Ng\\\u0002cX\u00fa\u00cd\u00ad\u00e0\u00bd(3\u00a6\u00ac\u00d9\u00b22\u009cZ\u00c4U\u0097\u00d3\u00c4i~\u00004\u00bbp\u00d5\u0000\u0083\u00adX\u009e\u0013\u00e6\u00a7O\u00e7\u0084\u0013\u0096\u00a5\u00ae<\u00a1?zo0c\u0084SY\u00fag\u00b8B\u00e8l\"\u00ed\u00a31\u0097\u00ddBJ\u008c\u008a3\u0095\u00b9\u0095\u00a3\u008a\u008aH\u00car\u0004\u0094\u00be\u00d1\u00b6\u00c5C\u00eb\u0080\u00f2\u00a0\u0090>\u0012\u00a7,T\u00d0@\u0011I\u00f5\u00ca\u00b2\u009by\u00b0\u0006$\u00e7O\u00ad?R\u00ae\u00b5\u00d1\u00f1|\u00f1\u0015&#\u00cd9\u0095KX\u00cb\u00fb\u00dc\u008e\u00e6]\u0094\u00cf\u00d6\u00d9|\u00f5\u00d0\u00ceO\u00e9\u001f\u00b6\u001cB~\u000b\u00db\u00ad\r\u00d1Sq\u00991\u00ffN\u009eW:".length();
                        var16_7 = 96;
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
                            var20_3[var18_4++] = cW.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "X\u00dc*\u0084\u0090\u00d3$\u001ff\u0096]A\u00c1\u009eZ\u008d#|\u00e7\u00c4\u00af4+\u00b2\u00f5\f\u00e0\u0095I\u009f\u00d1\b\u009c\u00ed\u00fe\u00b5\u008aTW\u0012[\u00b4#4K\u001e*\u000es5\u0019\u00f7z\u00ac\u00ef\u0013\u0000W\u00b9/\u0095\u00da\u00deP\u00c7\u00e3\n\u00193G\u0083U\u00aa|(\u0090W\u00f3\u00ce\u00aa\u0080[@\u00ff\u0098\u0000}\u00c8\u0081\u00fc\u0004\u00c7#%T\u00dcP\u00fe\u001e-*\u00ae49\u00f1\u00d3\u0007\u00f5&\"\u00b5\u00bfR\u0085\u00a1k\u00c6\u0011\u00c7\u00cf\u00a1I\u0094\u000f4\u00b3\u00f7Aj\u00aed\u00f4W\u00e7E\u0001\\w\u00fb\u009f\u0085k\u000f\u00c9K\u008c\u00f9\u00d1\u0081\u0001\u00ba\u0096u\u0000\u00d9\u00b6\u00b9\u00c9\u00bd\u00f4\u0010\u00e1\u0018i\u00a7\u00a8\r\u009dA![\u0093Y\u0014\u00a7\u0095\u00a6";
                            var19_6 = "X\u00dc*\u0084\u0090\u00d3$\u001ff\u0096]A\u00c1\u009eZ\u008d#|\u00e7\u00c4\u00af4+\u00b2\u00f5\f\u00e0\u0095I\u009f\u00d1\b\u009c\u00ed\u00fe\u00b5\u008aTW\u0012[\u00b4#4K\u001e*\u000es5\u0019\u00f7z\u00ac\u00ef\u0013\u0000W\u00b9/\u0095\u00da\u00deP\u00c7\u00e3\n\u00193G\u0083U\u00aa|(\u0090W\u00f3\u00ce\u00aa\u0080[@\u00ff\u0098\u0000}\u00c8\u0081\u00fc\u0004\u00c7#%T\u00dcP\u00fe\u001e-*\u00ae49\u00f1\u00d3\u0007\u00f5&\"\u00b5\u00bfR\u0085\u00a1k\u00c6\u0011\u00c7\u00cf\u00a1I\u0094\u000f4\u00b3\u00f7Aj\u00aed\u00f4W\u00e7E\u0001\\w\u00fb\u009f\u0085k\u000f\u00c9K\u008c\u00f9\u00d1\u0081\u0001\u00ba\u0096u\u0000\u00d9\u00b6\u00b9\u00c9\u00bd\u00f4\u0010\u00e1\u0018i\u00a7\u00a8\r\u009dA![\u0093Y\u0014\u00a7\u0095\u00a6".length();
                            var16_7 = 96;
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
                            var20_3[var18_4++] = cW.b(var21_9).intern();
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
                cW.n = var20_3;
                cW.o = new String[8];
                cW.v = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u0096>\u008fKH\u00f4\u00ee\u00a8j.\u0005\u0099\u0007\u00c1\u001f\u00a3";
                var5_15 = "\u0096>\u008fKH\u00f4\u00ee\u00a8j.\u0005\u0099\u0007\u00c1\u001f\u00a3".length();
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
                    var4_14 = "|:\u00a3\u0097:\u009f\u000bm\u00c7\u0091\u00b5\u009a\u00da\r\u00c8\u00fe";
                    var5_15 = "|:\u00a3\u0097:\u009f\u000bm\u00c7\u0091\u00b5\u009a\u00da\r\u00c8\u00fe".length();
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
        cW.t = var6_12;
        cW.u = new Integer[4];
        cW.g = new Object[0];
        cW.h = new ConcurrentHashMap<K, V>();
    }

    private static int e(long l, long l2) {
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
            case 0 -> 59;
            case 1 -> 9;
            case 2 -> 42;
            case 3 -> 61;
            case 4 -> 38;
            case 5 -> 22;
            case 6 -> 52;
            case 7 -> 40;
            case 8 -> 43;
            case 9 -> 41;
            case 10 -> 16;
            case 11 -> 62;
            case 12 -> 63;
            case 13 -> 11;
            case 14 -> 0;
            case 15 -> 57;
            case 16 -> 10;
            case 17 -> 14;
            case 18 -> 33;
            case 19 -> 20;
            case 20 -> 1;
            case 21 -> 7;
            case 22 -> 37;
            case 23 -> 28;
            case 24 -> 31;
            case 25 -> 48;
            case 26 -> 23;
            case 27 -> 2;
            case 28 -> 29;
            case 29 -> 34;
            case 30 -> 39;
            case 31 -> 44;
            case 32 -> 49;
            case 33 -> 24;
            case 34 -> 51;
            case 35 -> 15;
            case 36 -> 53;
            case 37 -> 32;
            case 38 -> 25;
            case 39 -> 36;
            case 40 -> 60;
            case 41 -> 45;
            case 42 -> 27;
            case 43 -> 3;
            case 44 -> 46;
            case 45 -> 47;
            case 46 -> 21;
            case 47 -> 58;
            case 48 -> 18;
            case 49 -> 55;
            case 50 -> 54;
            case 51 -> 8;
            case 52 -> 30;
            case 53 -> 56;
            case 54 -> 5;
            case 55 -> 17;
            case 56 -> 50;
            case 57 -> 26;
            case 58 -> 4;
            case 59 -> 12;
            case 60 -> 35;
            case 61 -> 13;
            case 62 -> 19;
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
        cW.C[n3] = new String(cArray);
        return n3;
    }

    public cH e(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x22821C5A8177L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = object;
        return cW.g("\u00e4", (Object)this, (Object)objectArray2, (long)8578576375335717859L, (long)l);
    }

    public static cW e(Object[] objectArray) {
        Object object;
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        Class clazz2 = (Class)objectArray[2];
        Class[] classArray = (Class[])objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = i ^ l) ^ 0x4DE1777CE9E2L;
        gD gD2 = new gD(clazz, string, clazz2, classArray, clazz);
        cW cW2 = (cW)((Object)cW.g("\u00e4", (Object)h, (Object)gD2, (long)6610249081993247756L, (long)l));
        try {
            if (cW2 != null) {
                return cW2;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cW.g("\u00cf", (Object)illegalArgumentException, (long)6611099251805693519L, (long)l);
        }
        CallSite callSite = cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00cf", (long)6610671225722354102L, (long)l), (long)6611258628050463697L, (long)l), (long)6610798171732869179L, (long)l), (Object)cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)clazz, (long)6609961148280726627L, (long)l), (char)cW.d("z", (int)6454, (long)(0x55A73E5CF22AE45BL ^ l)), (char)cW.d("z", (int)2001, (long)(0xD126773D8587ABFL ^ l)), (long)6609640638143300649L, (long)l), (long)6609541579588271596L, (long)l);
        CallSite callSite2 = cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00cf", (long)6610671225722354102L, (long)l), (long)6611258628050463697L, (long)l), (long)6610798171732869179L, (long)l), (Object)cW.g("\u00cf", (Object)clazz2, (Object)classArray, (long)6610466021212895865L, (long)l), (long)6609285734954826599L, (long)l);
        CallSite callSite3 = cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00cf", (long)6610671225722354102L, (long)l), (long)6611258628050463697L, (long)l), (Object)callSite, (Object)string, (Object)callSite2, (long)6609749141589316948L, (long)l);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = classArray;
        objectArray2[1] = callSite3;
        objectArray2[0] = clazz;
        CallSite callSite4 = cW.g("\u00cf", (Object)objectArray2, (long)6609810306632392586L, (long)l);
        cW cW3 = (cW)((Object)cW.g("\u00e4", (Object)h, (Object)gD2, (Object)callSite4, (long)6610970273494577109L, (long)l));
        try {
            object = cW3 != null ? cW3 : callSite4;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cW.g("\u00cf", (Object)illegalArgumentException, (long)6611099251805693519L, (long)l);
        }
        return object;
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

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    private static Object[] b(Object object) {
        return new Object[]{object};
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cW.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/cW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f3' || c == '\u00d1' || c == 'n' || c == '\u00e2') {
                field = cW.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cW.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cW.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x861;
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
                throw new RuntimeException("dev/zprestige/prestige/cW", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = cW.n[n2].getBytes("ISO-8859-1");
            cW.o[n2] = cW.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    public static cH b(Object[] objectArray) {
        Object object = objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = i ^ l;
        long l3 = l2 ^ 0x12A7F09C48C7L;
        long l4 = l2 ^ 0x39AAAEEF150EL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = object;
        CallSite callSite = cW.g("\u00cf", (Object)objectArray2, (long)1174816434159013281L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        return cW.g("\u00e4", (Object)callSite, (Object)objectArray3, (long)1175180569785482406L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public Object b(Object[] var1_1) throws Throwable {
        block34: {
            block35: {
                block29: {
                    block33: {
                        block32: {
                            block30: {
                                block31: {
                                    block26: {
                                        block27: {
                                            block28: {
                                                var4_2 = var1_1[0];
                                                var5_3 = (Object[])var1_1[1];
                                                var2_4 = (Long)var1_1[2];
                                                var6_5 = (var2_4 = cW.i ^ var2_4) ^ 57593098132257L;
                                                var8_6 = cW.g("\u00cf", (long)1060746201167698006L, (long)var2_4);
                                                try {
                                                    try {
                                                        try {
                                                            v0 = this;
                                                            if (var8_6 != null) break block26;
                                                            if (v0.c) {
                                                            }
                                                            ** GOTO lbl35
                                                        }
                                                        catch (Throwable v1) {
                                                            throw cW.g("\u00cf", (Object)v1, (long)1061801795698684748L, (long)var2_4);
                                                        }
                                                        v2 = var5_3;
                                                        if (var8_6 != null) break block27;
                                                    }
                                                    catch (Throwable v3) {
                                                        throw cW.g("\u00cf", (Object)v3, (long)1061801795698684748L, (long)var2_4);
                                                    }
                                                    if (v2 != null) break block28;
                                                }
                                                catch (Throwable v4) {
                                                    throw cW.g("\u00cf", (Object)v4, (long)1061801795698684748L, (long)var2_4);
                                                }
                                                v2 = cW.g;
                                                break block27;
                                            }
                                            v2 = var5_3;
                                        }
                                        var9_7 = v2;
                                        try {
                                            if (var8_6 == null) break block29;
lbl35:
                                            // 2 sources

                                            v0 = var4_2;
                                        }
                                        catch (Throwable v5) {
                                            throw cW.g("\u00cf", (Object)v5, (long)1061801795698684748L, (long)var2_4);
                                        }
                                    }
                                    try {
                                        if (v0 == null) {
                                            throw new IllegalArgumentException((String)cW.b("t", (int)1566, (long)(5879244961348845768L ^ var2_4)));
                                        }
                                    }
                                    catch (Throwable v6) {
                                        throw cW.g("\u00cf", (Object)v6, (long)1061801795698684748L, (long)var2_4);
                                    }
                                    try {
                                        try {
                                            v7 = var5_3;
                                            if (var8_6 != null) break block30;
                                            if (v7 != null) break block31;
                                        }
                                        catch (Throwable v8) {
                                            throw cW.g("\u00cf", (Object)v8, (long)1061801795698684748L, (long)var2_4);
                                        }
                                        v9 = 0;
                                        break block32;
                                    }
                                    catch (Throwable v10) {
                                        throw cW.g("\u00cf", (Object)v10, (long)1061801795698684748L, (long)var2_4);
                                    }
                                }
                                v7 = var5_3;
                            }
                            v9 = v7.length;
                        }
                        var10_8 = v9;
                        var9_7 = new Object[var10_8 + 1];
                        try {
                            try {
                                v11 = var9_7;
                                v12 = 0;
                                if (var8_6 != null) break block33;
                                v11[v12] = var4_2;
                                if (var10_8 <= 0) break block29;
                            }
                            catch (Throwable v13) {
                                throw cW.g("\u00cf", (Object)v13, (long)1061801795698684748L, (long)var2_4);
                            }
                            v11 = var5_3;
                            v12 = 0;
                        }
                        catch (Throwable v14) {
                            throw cW.g("\u00cf", (Object)v14, (long)1061801795698684748L, (long)var2_4);
                        }
                    }
                    cW.g("\u00cf", (Object)v11, (int)v12, (Object)var9_7, (int)1, (int)var10_8, (long)1062060445694994651L, (long)var2_4);
                }
                v15 = new Object[1];
                v15[0] = var6_5;
                var10_9 = cW.g("\u00e4", (Object)this, (Object)v15, (long)1061532167305538055L, (long)var2_4);
                try {
                    try {
                        v16 = var10_9;
                        if (var8_6 != null) break block34;
                        if (v16 == null) break block35;
                    }
                    catch (Throwable v17) {
                        throw cW.g("\u00cf", (Object)v17, (long)1061801795698684748L, (long)var2_4);
                    }
                    return var10_9.invoke(var9_7);
                }
                catch (Throwable v18) {
                    throw cW.g("\u00cf", (Object)v18, (long)1061801795698684748L, (long)var2_4);
                }
            }
            try {
                v16 = cW.h(1060965641895322537L, var2_4).invoke((Object)this.b, cW.b((Object)var9_7));
            }
            catch (InvocationTargetException v19) {
                throw v19.getTargetException();
            }
        }
        return v16;
    }

    public static cW b(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = i ^ l) ^ 0x7D5502B56551L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = clazz;
        CallSite callSite = cW.g("\u00cf", (Object)objectArray2, (long)-6098975314008861338L, (long)l);
        return new cW((cY)((Object)callSite), null);
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

    private static void c() {
        Object[] objectArray = B;
        B[0] = "gi\u0018\u0000{zqi\u001dZhmf\"\u001e\\dywe\tK/iT";
        objectArray[1] = "\u0015\u0019pKNe\u001e\u0016a\u00044a\r\u0017qK\u0002e\u001a";
        objectArray[2] = "Od?\u001cS\rYd:F@\u001aN/9@L\u000e_h.W\u0007\u001cc";
        objectArray[3] = "kY0\\+L\u001ey;S:\u0003ca(T3J\u000b";
        objectArray[4] = "tW?;nQbW:a}Fu\u001c9gqRd[.p:BE";
        objectArray[5] = "\u0000uLoC\nuUG`RE\u0014[LkV\u001f`";
        objectArray[6] = "\u001fKeo\u0004\u0017\tK`5\u0017\u0000\u001e\u0000c3\u001b\u0014\u000fGt$P\u0004\"";
        objectArray[7] = "t\b\u0000\u0010GJ\u007f\u0007\u0011_*J\u007f\u001a\u0005";
        objectArray[8] = "S\tn}+vX\u0006\u007f2VnK\u0001v{";
        objectArray[9] = "gG\u000ffc/gL\u0012x;\u007f8\f\u0018$n9zV\t)a9oM\t%!'hR\u000b!a-z\f:\u0005n:yG\t";
        objectArray[10] = "^4Lm\u0006p^?Qs^ \u0001\u007f[/\u000bfC%J\"\u0004fV>J.D`D8T0DxQ!H*\u0004rC\u007fu\"\u001aGU<Y3\u001apB";
        objectArray[11] = Character.TYPE;
        cW.C[11] = "java/lang/Character";
        objectArray[12] = "\\/9>j\u0015B'#q'\u000fX-:-6\u0005X:a\u001c+\u000eU;=-!\u000eB\u0006.,,-W>";
        objectArray[13] = "\u001d\u0010KDKK\u0016\u001fZ\u000b*E\u001d\u0014^Q";
        objectArray[14] = "\u001b\u001a3+.A\u001b\u0011.5v\u0011DQ$i#W\u0006\u000b5d,W\u0013\u00105hlQ\u0001\u0016+vle&2\u0012q+H\u0006";
        objectArray[15] = "\u0000\b$J^eu(/EO*\u0018(/X[?";
        objectArray[16] = "\u001f\u000e\u0015\u0011W4j.\u001e\u001eF{\u000b \u0015\u0015B!\u007f";
        objectArray[17] = "1\u0000-V%\u00161\u000b0H}FnK:\u0014(\u0000,\u0011+\u0019'\u00009\n+\u0015g'-\u00047\u000b/\u001c-\b<\n\u0004\u00121\u0004>\u001d;";
        objectArray[18] = "!7T\nI\u0005T\u0017_\u0005XJ5\u0019T\u000e\\\u0010A";
        objectArray[19] = "(3Ov_5]\u0013DyNz<\u001dOrJ H";
        objectArray[20] = "L+\u0017P\u0007VZ+\u0012\n\u0014AM`\u0011\f\u0018U\\'\u0006\u001bSE`";
        objectArray[21] = "C?p\u001e{F6\u001f{\u0011j\tW\u0011p\u001anS#";
        objectArray[22] = "2.z\u0015-bG\u000eq\u001a<-&\u0000z\u00118wR";
        objectArray[23] = "\u001aSs*0+osx%!d\u000e}s.%>z";
        objectArray[24] = "c$t;`\u0002\u0016\u0004\u007f4qMw\nt?u\u0017\u0003";
        objectArray[25] = "xf+5)#si:zn!dh61)\u0002ws5;c\u0007si98b";
        objectArray[26] = "\u0001T\u0001is)\n[\u0010&4+\u001dZ\u001cms\b\u000eA\u001fg9\u0011\u0012E\u0012";
        objectArray[27] = Integer.TYPE;
        cW.C[27] = "java/lang/Integer";
        objectArray[28] = "NG{C}8EHj\f\u0000-WRhO";
        objectArray[29] = Void.TYPE;
        cW.C[29] = "java/lang/Void";
        objectArray[30] = "\u007f,i\u0007%0\n\fb\b4\u007fk\u0002i\u00030%\u001f";
        objectArray[31] = "o$ss\u0011-\u001a\u0004x|\u0000b{\nsw\u00048\u000f";
        objectArray[32] = "1l\u0002ESmDL\tJB\"%B\u0002AFxQ";
        objectArray[33] = "\u0003$\u0002sG!G7\\tv(S1!p\u0013*>s[\u007f\u0015:L&_wGG";
        objectArray[34] = "\u0012\u0013WM\u0019]SVKFrQ+WXQ\u0000PV\b\nR\u0003;";
        objectArray[35] = "S%V^R9\u0000!W<LY\u000f;DUK=\bbX] `\u00122[N@3\u001639";
        objectArray[36] = "Jv*\u007fAu\u001fr\"-<}\u00192(uWjtzp}Em\u00137<\"Y\u0007Dv-eV`\t:ry<9H,/aNlL$}\u001c";
        objectArray[37] = "1O/}3y<\\.!Xf7@t#5X0Bs\t\"h,[~&$|Q[u=1l5\\,!9\u0007`\u0005t/660Zt'X";
        objectArray[38] = "\u000e\u007fxcO Q-c?u*XlX7\t/Vx[3\u0010\"1*!<\u00162C\u007f%4DO\u000f({9\b=Z,skuq\rr~'\u0007$\tz,ZKsWw`(\u001ew_%\u001d";
        objectArray[39] = "\rL\t~\r@^H\b\u001c\u0016 QR\u001bu\u0014DV\u000b\u0007}\u007f\u0019L[\u0004n\u001fJHZf";
        objectArray[40] = "\u0017nR\u0005JRDjSgT2Kp@\u000eSVL)\\\u00068_\u0015x^\u000b\u0003W\u001e+\rg";
        objectArray[41] = "@\u0013S[g \u0019^\n\u0018Wqz\nS\u0018>p\u001e\r\n\u00046\u001bF\u0004U\u001d:b\u0013\u000fQ\u0002W";
        objectArray[42] = "9@$.50`\u0014+-O05Iv8.4XNt}#%7\u0017 r _";
        objectArray[43] = "\u0013R,?\u001c&L\u00007c&,EAI8\u001a/OD;m\u001e'\u001d9w:@*QK\">Hx,";
        objectArray[44] = "\u0007w7R\u001b\u0010\nd6\u000ep\u0007\u001c]s\u0015\u001d\u0007\u000bkqoM\u0007\u0002l:\t\t\u0014\\k\u000b\u000e\u000b\u0017\u0006\u007ft\u0003\u0011\u0014Z\u0006k\u001eLS\fxf\rM\u000fg";
        objectArray[45] = "^\\)\u0000Ws\rX(bL\u0013\u0002B;\u000bNw\u0005\u001b'\u0003%s\u0016\u0018{\t[~\u0005\u0019'b";
        objectArray[46] = "3/Uh\u000bKj{Zkq\\;:\u0003a\u001cX?:!c\fB.@\u000b\u007f\bE+?\u0006e\u000b\u0019R";
        objectArray[47] = "b~e&\u001c&=,~z&,4mErZ):yLr]\"]+<yE4/~8q\u0017Ic)f|[;6-n.&";
        objectArray[48] = "q/J\u0002y\u0005\"+K`ae-1X\t`\u0001*hD\u0001\u000bTs0J\u000e:\u0004,0B`";
        objectArray[49] = "\u0002;2, 3Q?3N8S\u0002\u007f&1<,A:;rRj\u00078\" -)B%aN";
        objectArray[50] = "RI\u0012EdQ\u0001M\u0013'\u007f1\u000eW\u0000N}U\t\u000e\u001cF\u0016\u0000PV\u0012I'P\u000fV\u001a'";
        objectArray[51] = "\u001e`;\u00150fQe4Q[2M~\u001fA>4Xz(V[bKg|\u00164=\u0019| ,";
        objectArray[52] = ")t</&C)i7?\u001bS1\u007f>0p]3tWp ]$kf \u007f],\u00056:b[2z; a\u0007K4l&tTzd3&|:*~. bE'd-|\u001b[0|68dV*\u007fjAx\u00014h.&\"K(wW";
        objectArray[53] = "N\u0016\u001a\u001b \u0004\u0011D\u0001G\u001a\u0011\u001c\u0003\u0012Xa\u0006qB\u0014G#Q\u001e\u001dF\\\u007fk";
        objectArray[54] = "\u0011q\u0002X'&H<[\u001b\u0017t+h\u0002\u001b~vOo[\u0007v\u001d\u0017f\u0004\u001ezdBm\u0000\u0001\u0017";
        objectArray[55] = "P\u000ek\u0015Z\u0010\u0010\u0015\"\u001aj\u0010\u001d\u0019RK#\u0002\u001b\buYjY[\u0002|K[\t\u0004\u0002t%[S\u0007\n}\u0014\u000b\f\u0007\u0002\u0013\u0014Q\u000f\u000f\u000b\"D\u000e\u000f\u0007e";
        objectArray[56] = "NK\u000em~\u0011J\u0003\u0019`\u0011T@?\rtzRF\u000b\u001chk(\u001a\u001a\u0005e N^\t[b\u0011A^\u001eZhqS@\u0017\u0010\u000f/\u0014A\u0010\u001d}z\u0010IB`";
        objectArray[57] = "Q#Qk\u0011:\u0002'P\t\bZ\r=C`\b>\nd_hc7S5]eX?Xf\u000e\t";
        objectArray[58] = "\u0017Y=&F\u0015\u001aJ<z-\u0002\ftpc@k\u0016G>wW\u0004O\u00131t-\u000b\u0006\u0014<pS\u0006\u0015\u0015`\u001b";
        objectArray[59] = "\u0006u\u0002\u0002U\u001b\r*\nM4\u001a\u00007i^Q\u001c\u00153^I4K\u000f5\nX\u000f\u0004\n:N3";
        objectArray[60] = "\u000eHG$\u001d\"]LFF\u0004BRVU/\u0004&U\u000fI'o{O_J4\u000f(K^(";
        objectArray[61] = "gTG%\u0003['O\u000e*3L:C?$\bD8Q\u000etWD0?\u000e.TL9\u000e^qTDW";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "_I{4\u0015IRZzh~KN@*\t\u001fX\u0000T=fF\f\u000fWG";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static cW c(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        Class[] classArray;
        String string;
        Object object2;
        block4: {
            block5: {
                object2 = objectArray[0];
                string = (String)objectArray[1];
                classArray = (Class[])objectArray[2];
                l2 = (Long)objectArray[3];
                l = (l2 = i ^ l2) ^ 0xB33E2040D37L;
                CallSite callSite = cW.g("\u00cf", (long)5464444604104858939L, (long)l2);
                try {
                    try {
                        object = object2;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cW.g("\u00cf", (Object)illegalArgumentException, (long)5463248415967655457L, (long)l2);
                    }
                    throw new IllegalArgumentException((String)((Object)cW.b("t", (int)28168, (long)(0x13359888CAD3ADB0L ^ l2))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cW.g("\u00cf", (Object)illegalArgumentException, (long)5463248415967655457L, (long)l2);
                }
            }
            object = object2;
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l;
        objectArray2[2] = classArray;
        objectArray2[1] = string;
        objectArray2[0] = object.getClass();
        CallSite callSite = cW.g("\u00cf", (Object)objectArray2, (long)5463024546639178340L, (long)l2);
        return new cW((cY)((Object)callSite), object2);
    }

    public cH c(Object[] objectArray) {
        Object object;
        long l;
        Object object2;
        block7: {
            block8: {
                object2 = objectArray[0];
                l = (Long)objectArray[1];
                l = i ^ l;
                CallSite callSite = cW.g("\u00cf", (long)7331552400328258384L, (long)l);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block7;
                        if (!((cW)object).c) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cW.g("\u00cf", (Object)illegalArgumentException, (long)7330215354476894282L, (long)l);
                    }
                    throw new IllegalStateException((String)((Object)cW.b("t", (int)13530, (long)(0x36FD903D0A1AD908L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cW.g("\u00cf", (Object)illegalArgumentException, (long)7330215354476894282L, (long)l);
                }
            }
            object = object2;
        }
        try {
            if (object == null) {
                throw new IllegalArgumentException((String)((Object)cW.b("t", (int)1203, (long)(0x5E258A6DA478E965L ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cW.g("\u00cf", (Object)illegalArgumentException, (long)7330215354476894282L, (long)l);
        }
        return new cH(this, object2);
    }

    public Object c(Object[] objectArray) throws Throwable {
        Object object;
        block4: {
            long l;
            long l2;
            Object[] objectArray2;
            block5: {
                objectArray2 = (Object[])objectArray[0];
                l2 = (Long)objectArray[1];
                l = (l2 = i ^ l2) ^ 0x139980A77181L;
                CallSite callSite = cW.g("\u00cf", (long)-2220920394268018749L, (long)l2);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (((cW)object).c) break block5;
                    }
                    catch (Throwable throwable) {
                        throw cW.g("\u00cf", (Object)throwable, (long)-2222116588814590759L, (long)l2);
                    }
                    throw new IllegalStateException((String)((Object)cW.b("t", (int)22548, (long)(0x123A5B2E2185B150L ^ l2))));
                }
                catch (Throwable throwable) {
                    throw cW.g("\u00cf", (Object)throwable, (long)-2222116588814590759L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l;
            objectArray3[1] = objectArray2;
            objectArray3[0] = null;
            object = cW.g("\u00e4", (Object)this, (Object)objectArray3, (long)-2222049717345159187L, (long)l2);
        }
        return object;
    }

    private static Method h(long l, long l2) {
        int n = cW.e(l, l2);
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
                clazz3 = cW.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cW.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cW.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cW.B[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cW.f(924419431170888L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cW.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cW.B[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cW.f(924419431170888L, 0L);
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
            int n = cW.e(l, l2);
            object = B[n];
            try {
                if (!(object instanceof String)) break block2;
                cW.B[n] = clazz = Class.forName(C[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cW.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cW.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public cH d(Object[] objectArray) {
        Object object;
        long l;
        block7: {
            block8: {
                l = (Long)objectArray[0];
                l = i ^ l;
                CallSite callSite = cW.g("\u00cf", (long)-7601584200025997201L, (long)l);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block7;
                        if (!((cW)object).c) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-7600528717232379019L, (long)l);
                    }
                    throw new IllegalStateException((String)((Object)cW.b("t", (int)29872, (long)(0x266E1378E960EA5AL ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-7600528717232379019L, (long)l);
                }
            }
            object = this.d;
        }
        try {
            if (object == null) {
                throw new IllegalStateException((String)((Object)cW.b("t", (int)24126, (long)(0x42FFEB6F09AEC0D0L ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-7600528717232379019L, (long)l);
        }
        return new cH(this, this.d);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cW.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cW.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object[] d() {
        return new Object[0];
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26DC;
        if (u[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = t[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])v.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cW.u[n2] = n3;
        }
        return u[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cW.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static cW d(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        String string;
        String string2;
        Object object2;
        block4: {
            block5: {
                object2 = objectArray[0];
                string2 = (String)objectArray[1];
                string = (String)objectArray[2];
                l2 = (Long)objectArray[3];
                l = (l2 = i ^ l2) ^ 0x5A473C80547L;
                CallSite callSite = cW.g("\u00cf", (long)-3798623022348640858L, (long)l2);
                try {
                    try {
                        object = object2;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-3797567563110140228L, (long)l2);
                    }
                    throw new IllegalArgumentException((String)((Object)cW.b("t", (int)1212, (long)(0x7851732A1FB1479EL ^ l2))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-3797567563110140228L, (long)l2);
                }
            }
            object = object2;
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l;
        objectArray2[2] = string;
        objectArray2[1] = string2;
        objectArray2[0] = object.getClass();
        CallSite callSite = cW.g("\u00cf", (Object)objectArray2, (long)-3798101610121562768L, (long)l2);
        return new cW((cY)((Object)callSite), object2);
    }

    private static Object[] a(Object object, int n) {
        return new Object[]{object, n};
    }

    public static cH a(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        Object object2;
        block6: {
            CallSite callSite;
            block7: {
                CallSite callSite2;
                gD gD2;
                long l3;
                Class[] classArray;
                Class clazz;
                Class clazz2;
                String string;
                block5: {
                    cW cW2;
                    block4: {
                        object2 = objectArray[0];
                        string = (String)objectArray[1];
                        clazz2 = (Class)objectArray[2];
                        clazz = (Class)objectArray[3];
                        classArray = (Class[])objectArray[4];
                        l2 = (Long)objectArray[5];
                        long l4 = l2 = i ^ l2;
                        l3 = l4 ^ 0x2D77E7F46186L;
                        l = l4 ^ 0x5E0DDC364FEDL;
                        gD2 = new gD(clazz2, string, clazz, classArray, object2.getClass());
                        cW cW3 = (cW)((Object)cW.g("\u00e4", (Object)h, (Object)gD2, (long)-5073782552746861018L, (long)l2));
                        callSite2 = cW.g("\u00cf", (long)-5075125173157843073L, (long)l2);
                        try {
                            cW2 = cW3;
                            if (callSite2 != null) break block4;
                            if (cW2 == null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-5074069570104900507L, (long)l2);
                        }
                        cW2 = cW3;
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l;
                    objectArray2[0] = object2;
                    return cW.g("\u00e4", (Object)cW2, (Object)objectArray2, (long)-5073510258830391943L, (long)l2);
                }
                CallSite callSite3 = cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00cf", (long)-5073360683896251492L, (long)l2), (long)-5073877191313143301L, (long)l2), (long)-5074331050586578415L, (long)l2), (Object)cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)clazz2, (long)-5075183467183339959L, (long)l2), (char)cW.d("z", (int)1902, (long)(0x6162FBB894949828L ^ l2)), (char)cW.d("z", (int)13533, (long)(0x35B0350679AEAB98L ^ l2)), (long)-5075497380187904509L, (long)l2), (long)-5074483458165334074L, (long)l2);
                CallSite callSite4 = cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00cf", (long)-5073360683896251492L, (long)l2), (long)-5073877191313143301L, (long)l2), (long)-5074331050586578415L, (long)l2), (Object)cW.g("\u00cf", (Object)clazz, (Object)classArray, (long)-5073576625894664109L, (long)l2), (long)-5074719528752768691L, (long)l2);
                CallSite callSite5 = cW.g("\u00e4", (Object)cW.g("\u00e4", (Object)cW.g("\u00cf", (long)-5073360683896251492L, (long)l2), (long)-5073877191313143301L, (long)l2), (Object)callSite3, (Object)string, (Object)callSite4, (long)-5075393017169168514L, (long)l2);
                Object[] objectArray3 = new Object[4];
                objectArray3[3] = l3;
                objectArray3[2] = classArray;
                objectArray3[1] = callSite5;
                objectArray3[0] = object2;
                callSite = cW.g("\u00cf", (Object)objectArray3, (long)-5073817534493512943L, (long)l2);
                cW cW4 = (cW)((Object)cW.g("\u00e4", (Object)h, (Object)gD2, (Object)callSite, (long)-5074152368846516737L, (long)l2));
                try {
                    object = cW4;
                    if (callSite2 != null) break block6;
                    if (object == null) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cW.g("\u00cf", (Object)illegalArgumentException, (long)-5074069570104900507L, (long)l2);
                }
                object = cW4;
                break block6;
            }
            object = callSite;
        }
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = object2;
        return cW.g("\u00e4", (Object)object, (Object)objectArray4, (long)-5073510258830391943L, (long)l2);
    }

    /*
     * Loose catch block
     */
    private MethodHandle a(Object[] objectArray) {
        long l;
        block18: {
            cW cW2;
            block19: {
                l = (Long)objectArray[0];
                l = i ^ l;
                CallSite callSite = cW.g("\u00cf", (long)5069801916852162741L, (long)l);
                cW2 = this;
                if (callSite != null) break block19;
                try {
                    block20: {
                        if (!cW2.f) break block18;
                        break block20;
                        catch (Throwable throwable) {
                            throw cW.g("\u00cf", (Object)throwable, (long)5070857382467124143L, (long)l);
                        }
                    }
                    cW2 = this;
                }
                catch (Throwable throwable) {
                    throw cW.g("\u00cf", (Object)throwable, (long)5070857382467124143L, (long)l);
                }
            }
            return cW2.e;
        }
        MethodHandle methodHandle = null;
        try {
            MethodHandle methodHandle2;
            Object object;
            Object object2;
            Object object3;
            int n;
            Object object4;
            try {
                object4 = cW.h(5070130433864867370L, l).invoke((Object)this.b, cW.d());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                n = (Integer)cW.h(5069002649488709001L, l).invoke(object4, cW.d());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            int n2 = n;
            try {
                object3 = cW.h(5070130433864867370L, l).invoke((Object)this.b, cW.d());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = cW.h(5069240460927056729L, l).invoke(object3, cW.d());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = cW.h(5070384167960467759L, l).invoke((Object)this.b, cW.b(object2));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                methodHandle2 = (MethodHandle)cW.h(5068808108228206578L, l).invoke(object, cW.a(Object[].class, n2));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            methodHandle = methodHandle2;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.e = methodHandle;
        this.f = 1;
        return methodHandle;
    }

    @Override
    public Method a(Object[] objectArray) {
        return this.a;
    }

    public Object a(Object[] objectArray) throws Throwable {
        Object object = objectArray[0];
        Object[] objectArray2 = (Object[])objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = i ^ l) ^ 0x203E5CEE9E14L;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = objectArray2;
        objectArray3[0] = object;
        return cW.g("\u00e4", (Object)this, (Object)objectArray3, (long)246050135737549854L, (long)l);
    }

    public static cW a(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        Class[] classArray = (Class[])objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = i ^ l) ^ 0x748770716779L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = classArray;
        objectArray2[1] = string;
        objectArray2[0] = clazz;
        CallSite callSite = cW.g("\u00cf", (Object)objectArray2, (long)2422637901459193898L, (long)l);
        return new cW((cY)((Object)callSite), null);
    }

    private static Field g(long l, long l2) {
        int n = cW.e(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            String string = C[n];
            int n2 = string.indexOf(8);
            Class clazz = cW.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cW.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cW.c(clazz3, string2, clazz2)) != null) {
                    cW.B[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cW.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cW.B[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cW.f(924419431170888L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cW.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cW.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cW.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


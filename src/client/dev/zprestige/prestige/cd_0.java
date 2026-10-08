/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_6880
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.c_;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_6880;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.cd
 */
public class cd_0
extends b4 {
    private static final float m = 0.65f;
    private final Map a;
    private bW c;
    private float g;
    private float h;
    private float k;
    private static long d;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long[] B;
    private static final Integer[] C;
    private static final Map D;
    private static final Object[] H;
    private static final String[] I;

    public cd_0(long l) {
        long l2 = (l = v ^ l) ^ 0x29CD2933E58EL;
        super((String)((Object)cd_0.a("u", (int)23750, (long)(0x6E9AA2386070DC73L ^ l))), (String)((Object)cd_0.a("u", (int)24007, (long)(0x3828003977725D71L ^ l))), l2);
        this.a = new LinkedHashMap();
        this.g = 70.0f;
        this.h = 0.0f;
        this.k = 0.0f;
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
                            cd_0.v = hc.a(1132563410905346172L, -5521923812157661418L, MethodHandles.lookup().lookupClass()).a(239088735091851L);
                            var27 = cd_0.v ^ 94983170590849L;
                            cd_0.H = new Object[136];
                            cd_0.I = new String[136];
                            cd_0.b();
                            cd_0.y = new HashMap<K, V>(13);
                            var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var27 >>> 56);
                            for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                                v2 = v2;
                                v2[var19_2] = (byte)(var27 << var19_2 * 8 >>> 56);
                            }
                            var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var25_3 = new String[15];
                            var23_4 = 0;
                            var22_5 = "\u00f8\u00d8$|\u009eV_\u001e\u0095_\u00bb\u00c4\u008a\u009c\u00d5 \u0010\r\u0099YH\u00d1\u001a\u00db\u00fa\u001cx\u00bcr\u0089:\u0017t\u0010\u0018\u00be,mNT\u00fb\u00e2\u00db\u0081\u00a6\u00fb\u00ee\u0016\u00aap@\u00ddZ\u0085m^2\u00a48\u00b3\u00b4W@\u00dd\u00d3\u00d1>\u0097n\u00e2\u00c9%\u00c1\u00f2\u00bb\u0017f\u008b\u0005\u00c0\u00a72\u0016'\u00b7\u00a4\u0088\u00ab\u008cS'\u00a6j\u00e4\\\u0013~\u008c\u00a2\u00e8\u00fc\u00b7%i\u00e7\u008f\u0015\u0000$\u00ec\u009b\u0006\u00a1KE\u0010\u009b4-\u00ff\u00ce#&\u00cf\u0091\u0098\u00c0\u001dZ\u00ce\u00ee\u00ab\u0010v\u001f\u00a6@\r\u0000}\u000f\u00ba\u0099\u00be\u008aa(\u009b+\u0010]\u009f\u00a2\u00d6\u001bC|\u00d9\u00e2m\u00ae\u0011\u00aa\u0099\u001eu\u0010C\u00b0\u001f\u009a\u00ce\u009e\u00074x+W\u0018\u0099Q\u0087L\u0010\u00a6\u00e1@:\u00b2\u0004\u00b7\u00f8\u00e7\u001d\u0080\u00d9\u00d6}\u009e\u001a\u0010u\u0000w\u001f\u001b.U\u00bf+\u00bb7\u00ae\u0019\u001cC*\u0010#\u00c3\u00bbe\u00fc$l\n{m\u008eR\u00f8\u00c1\u0090\u00c7\u0010\u009d\u00cbz\u00ad\u0001\u000fhVX\u001enY@%\u0091/\u0010\u009b\u0010N\u008b\u00d6\u00a7\u00f4\u00c8\u00e6\\Yn\u00e3:a\u00a8";
                            var24_6 = "\u00f8\u00d8$|\u009eV_\u001e\u0095_\u00bb\u00c4\u008a\u009c\u00d5 \u0010\r\u0099YH\u00d1\u001a\u00db\u00fa\u001cx\u00bcr\u0089:\u0017t\u0010\u0018\u00be,mNT\u00fb\u00e2\u00db\u0081\u00a6\u00fb\u00ee\u0016\u00aap@\u00ddZ\u0085m^2\u00a48\u00b3\u00b4W@\u00dd\u00d3\u00d1>\u0097n\u00e2\u00c9%\u00c1\u00f2\u00bb\u0017f\u008b\u0005\u00c0\u00a72\u0016'\u00b7\u00a4\u0088\u00ab\u008cS'\u00a6j\u00e4\\\u0013~\u008c\u00a2\u00e8\u00fc\u00b7%i\u00e7\u008f\u0015\u0000$\u00ec\u009b\u0006\u00a1KE\u0010\u009b4-\u00ff\u00ce#&\u00cf\u0091\u0098\u00c0\u001dZ\u00ce\u00ee\u00ab\u0010v\u001f\u00a6@\r\u0000}\u000f\u00ba\u0099\u00be\u008aa(\u009b+\u0010]\u009f\u00a2\u00d6\u001bC|\u00d9\u00e2m\u00ae\u0011\u00aa\u0099\u001eu\u0010C\u00b0\u001f\u009a\u00ce\u009e\u00074x+W\u0018\u0099Q\u0087L\u0010\u00a6\u00e1@:\u00b2\u0004\u00b7\u00f8\u00e7\u001d\u0080\u00d9\u00d6}\u009e\u001a\u0010u\u0000w\u001f\u001b.U\u00bf+\u00bb7\u00ae\u0019\u001cC*\u0010#\u00c3\u00bbe\u00fc$l\n{m\u008eR\u00f8\u00c1\u0090\u00c7\u0010\u009d\u00cbz\u00ad\u0001\u000fhVX\u001enY@%\u0091/\u0010\u009b\u0010N\u008b\u00d6\u00a7\u00f4\u00c8\u00e6\\Yn\u00e3:a\u00a8".length();
                            var21_7 = 16;
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
                                var25_3[var23_4++] = cd_0.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "W\u00e4\u00bf\f\u0000&\u00c9\u0002{\u00f5\u00d2\u008b5rZ\u009a)\u001f\u00bc\u00d5/\u00c5y,\u0006W\u00c5\u00b2\u008a\u00e0\u0097\u0005Xk\"\u00d6\u00d7z\u00ce\u00f5\u001c\u008dx\u00ebT\u00f6\u00ab\u0010\u00d9\u0096e\u00e0\u00c0\u0088\u0087\u00ad\u0090\u0090\u0094M \u0088\u0001\u001eO\u00ca\u0006\u00b8C\u00df\u001d\u009f\u00140\u00ca\u0090\u0000'q\u00f8\t\u00acW\u009a\u00b5\u00bf\u0090V\u008f\u00df \u00e12\u00dcC:5t\u0096\u001e\u000fP\u00b42\u00d5\u00ab\u008b\u00d1|\u0016\u0089\u0007\u00cd\u0015\u00a7\u00d9\u00b8\u00e6\u00e5\u0001:";
                                var24_6 = "W\u00e4\u00bf\f\u0000&\u00c9\u0002{\u00f5\u00d2\u008b5rZ\u009a)\u001f\u00bc\u00d5/\u00c5y,\u0006W\u00c5\u00b2\u008a\u00e0\u0097\u0005Xk\"\u00d6\u00d7z\u00ce\u00f5\u001c\u008dx\u00ebT\u00f6\u00ab\u0010\u00d9\u0096e\u00e0\u00c0\u0088\u0087\u00ad\u0090\u0090\u0094M \u0088\u0001\u001eO\u00ca\u0006\u00b8C\u00df\u001d\u009f\u00140\u00ca\u0090\u0000'q\u00f8\t\u00acW\u009a\u00b5\u00bf\u0090V\u008f\u00df \u00e12\u00dcC:5t\u0096\u001e\u000fP\u00b42\u00d5\u00ab\u008b\u00d1|\u0016\u0089\u0007\u00cd\u0015\u00a7\u00d9\u00b8\u00e6\u00e5\u0001:".length();
                                var21_7 = 32;
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
                                var25_3[var23_4++] = cd_0.b(var26_9).intern();
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
                    cd_0.w = var25_3;
                    cd_0.x = new String[15];
                    cd_0.D = new HashMap<K, V>(13);
                    var7_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var27 >>> 56);
                    for (var8_11 = 1; var8_11 < 8; ++var8_11) {
                        v9 = v9;
                        v9[var8_11] = (byte)(var27 << var8_11 * 8 >>> 56);
                    }
                    var7_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                    var13_12 = new long[17];
                    var10_13 = 0;
                    var11_14 = "\u00f8\u00b2\u00b6\u0093\u009fn\u00e7\u00f7\u0002\u0018\u0096\u007f|\u00cf\u00cd\u00f0)\u00c8\u00a6\u00d1\u00de\u008as\u00ac/\u0096\u00a4\u0004\u00cf\u00bfr\u00fe\u00dc&\t\u0093g\u0001%\u00a4i\u00e6nI\u0093\u001beF\u00df\u00d6\u00f8\u00eb\u00f7\u00a0\u0000\u0012\u0098\u0013\u00cd\u009el\u00ddt7!\u00bb;\u00a7:\u0095\u00bb~\u00fb\u001a\u00a4\u0080:\u0012\u0096%\u0085(\u00eaM\u0098\u00f8\u008b\u00cf7Qx\u00fe\u00c8\u0010+\u00aeG\u00cb+\u008a\u0016\u00ea\u00e5\u00c8l\u008b|\u00a3\"\u00ad\u00baP\u00b8\u00e8\u000e\u00aa\u009b\u00a7G-";
                    var12_15 = "\u00f8\u00b2\u00b6\u0093\u009fn\u00e7\u00f7\u0002\u0018\u0096\u007f|\u00cf\u00cd\u00f0)\u00c8\u00a6\u00d1\u00de\u008as\u00ac/\u0096\u00a4\u0004\u00cf\u00bfr\u00fe\u00dc&\t\u0093g\u0001%\u00a4i\u00e6nI\u0093\u001beF\u00df\u00d6\u00f8\u00eb\u00f7\u00a0\u0000\u0012\u0098\u0013\u00cd\u009el\u00ddt7!\u00bb;\u00a7:\u0095\u00bb~\u00fb\u001a\u00a4\u0080:\u0012\u0096%\u0085(\u00eaM\u0098\u00f8\u008b\u00cf7Qx\u00fe\u00c8\u0010+\u00aeG\u00cb+\u008a\u0016\u00ea\u00e5\u00c8l\u008b|\u00a3\"\u00ad\u00baP\u00b8\u00e8\u000e\u00aa\u009b\u00a7G-".length();
                    var9_16 = 0;
                    while (true) {
                        var14_17 = var11_14.substring(var9_16, var9_16 += 8).getBytes("ISO-8859-1");
                        v10 = var13_12;
                        v11 = var10_13++;
                        v12 = ((long)var14_17[0] & 255L) << 56 | ((long)var14_17[1] & 255L) << 48 | ((long)var14_17[2] & 255L) << 40 | ((long)var14_17[3] & 255L) << 32 | ((long)var14_17[4] & 255L) << 24 | ((long)var14_17[5] & 255L) << 16 | ((long)var14_17[6] & 255L) << 8 | (long)var14_17[7] & 255L;
                        v13 = -1;
                        break block22;
                        break;
                    }
lbl102:
                    // 1 sources

                    while (true) {
                        v10[v11] = v14;
                        if (var9_16 < var12_15) ** continue;
                        var11_14 = "\u001d\u00d6\u001c\u00abr\u00bbm\u0087\u00ca\u001e\u0001\u00f1\u00e6\u00d6\u00c8l";
                        var12_15 = "\u001d\u00d6\u001c\u00abr\u00bbm\u0087\u00ca\u001e\u0001\u00f1\u00e6\u00d6\u00c8l".length();
                        var9_16 = 0;
                        while (true) {
                            var14_17 = var11_14.substring(var9_16, var9_16 += 8).getBytes("ISO-8859-1");
                            v10 = var13_12;
                            v11 = var10_13++;
                            v12 = ((long)var14_17[0] & 255L) << 56 | ((long)var14_17[1] & 255L) << 48 | ((long)var14_17[2] & 255L) << 40 | ((long)var14_17[3] & 255L) << 32 | ((long)var14_17[4] & 255L) << 24 | ((long)var14_17[5] & 255L) << 16 | ((long)var14_17[6] & 255L) << 8 | (long)var14_17[7] & 255L;
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
                        if (var9_16 < var12_15) ** continue;
                        break block23;
                        break;
                    }
                }
                var15_18 = v12;
                var17_19 = var7_10.doFinal(new byte[]{(byte)(var15_18 >>> 56), (byte)(var15_18 >>> 48), (byte)(var15_18 >>> 40), (byte)(var15_18 >>> 32), (byte)(var15_18 >>> 24), (byte)(var15_18 >>> 16), (byte)(var15_18 >>> 8), (byte)var15_18});
                v14 = ((long)var17_19[0] & 255L) << 56 | ((long)var17_19[1] & 255L) << 48 | ((long)var17_19[2] & 255L) << 40 | ((long)var17_19[3] & 255L) << 32 | ((long)var17_19[4] & 255L) << 24 | ((long)var17_19[5] & 255L) << 16 | ((long)var17_19[6] & 255L) << 8 | (long)var17_19[7] & 255L;
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
            cd_0.B = var13_12;
            cd_0.C = new Integer[17];
            var2_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v15 = SecretKeyFactory.getInstance("DES");
            v16 = new byte[8];
            v17 = v16;
            v16[0] = (byte)(var27 >>> 56);
            for (var3_21 = 1; var3_21 < 8; ++var3_21) {
                v17 = v17;
                v17[var3_21] = (byte)(var27 << var3_21 * 8 >>> 56);
            }
            break block24;
lbl154:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
        var4_23 = 5624887942911382931L;
        var6_24 = var2_20.doFinal(new byte[]{(byte)(var4_23 >>> 56), (byte)(var4_23 >>> 48), (byte)(var4_23 >>> 40), (byte)(var4_23 >>> 32), (byte)(var4_23 >>> 24), (byte)(var4_23 >>> 16), (byte)(var4_23 >>> 8), (byte)var4_23});
        ** while (true)
        var0_22 = ((long)var6_24[0] & 255L) << 56 | ((long)var6_24[1] & 255L) << 48 | ((long)var6_24[2] & 255L) << 40 | ((long)var6_24[3] & 255L) << 32 | ((long)var6_24[4] & 255L) << 24 | ((long)var6_24[5] & 255L) << 16 | ((long)var6_24[6] & 255L) << 8 | (long)var6_24[7] & 255L;
        cd_0.d = var0_22;
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
        if (I[n3] != null) {
            return n3;
        }
        Object object = H[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 60;
            case 2 -> 32;
            case 3 -> 35;
            case 4 -> 7;
            case 5 -> 59;
            case 6 -> 17;
            case 7 -> 0;
            case 8 -> 49;
            case 9 -> 5;
            case 10 -> 50;
            case 11 -> 54;
            case 12 -> 61;
            case 13 -> 42;
            case 14 -> 8;
            case 15 -> 16;
            case 16 -> 56;
            case 17 -> 12;
            case 18 -> 47;
            case 19 -> 3;
            case 20 -> 62;
            case 21 -> 29;
            case 22 -> 9;
            case 23 -> 30;
            case 24 -> 63;
            case 25 -> 40;
            case 26 -> 28;
            case 27 -> 1;
            case 28 -> 45;
            case 29 -> 38;
            case 30 -> 14;
            case 31 -> 22;
            case 32 -> 43;
            case 33 -> 31;
            case 34 -> 55;
            case 35 -> 25;
            case 36 -> 26;
            case 37 -> 57;
            case 38 -> 18;
            case 39 -> 15;
            case 40 -> 53;
            case 41 -> 2;
            case 42 -> 44;
            case 43 -> 13;
            case 44 -> 58;
            case 45 -> 23;
            case 46 -> 21;
            case 47 -> 34;
            case 48 -> 51;
            case 49 -> 36;
            case 50 -> 24;
            case 51 -> 39;
            case 52 -> 37;
            case 53 -> 33;
            case 54 -> 41;
            case 55 -> 27;
            case 56 -> 11;
            case 57 -> 20;
            case 58 -> 6;
            case 59 -> 4;
            case 60 -> 19;
            case 61 -> 10;
            case 62 -> 52;
            default -> 48;
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
        cd_0.I[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = H;
        H[0] = "\u0017c(\u0002\u0012}\u0001c-X\u0001j\u0016(.^\r~\u0007o9IFoG";
        objectArray[1] = "$\u000e)|3MQ.\"s\"\u00020 )x&XD";
        objectArray[2] = Void.TYPE;
        cd_0.I[2] = "java/lang/Void";
        objectArray[3] = "\u0005yC\u0002R9\u0013yFXA.\u00042E^M:\u0015uRI\u0006()";
        objectArray[4] = "\u0015W\u000bZOc`w\u0000U^,\u001do\u0013RWeu";
        objectArray[5] = "0S\u0010\\\u0019w;\\\u0001\u0013do([\bZ";
        objectArray[6] = Integer.TYPE;
        cd_0.I[6] = "java/lang/Integer";
        objectArray[7] = "\u0019Um\u001f:A\u000fUhE)V\u0018\u001ekC%B\tY|TnR\u0019";
        objectArray[8] = "\u001bgVLIn\u0010hG\u0003*c\u0005eHh\u001fa\u0014vTD\bl";
        objectArray[9] = "\u007f\u007fr$s~bj*\u00062szl";
        objectArray[10] = ":g\u0011EV\u00101h\u0000\n1\u0012$c\u0000A\n";
        objectArray[11] = "e\u001f\u001bUYA\u0010?\u0010ZH\u000eq1\u001bQLT\u0005";
        objectArray[12] = "3[:m3m8T+\"P`-R";
        objectArray[13] = "7N\fZ\"!Bn\u0007U3n#`\f^74W";
        objectArray[14] = "\u001eq<{\b\u0006\bq9!\u001b\u0011\u001f::'\u0017\u0005\u000e}-0\\\u0015;";
        objectArray[15] = "G}\u0015I\u0017N2]\u001eF\u0006\u0001SS\u0015M\u0002['";
        objectArray[16] = Float.TYPE;
        cd_0.I[16] = "java/lang/Float";
        objectArray[17] = "x>9,!Wn><v2@yu?p>Th2(guDp2*l/\tL)*q/N{>";
        objectArray[18] = "\u00117S\u0001>~\u00077V[-i\u0010|U]!}\u0001;BJjm6";
        objectArray[19] = "8\u0004i\u00050\fM$b\n!C,*i\u0001%\u0019X";
        objectArray[20] = "|\">j1\u001f\t\u00025e Ph\f>n$\n\u001c";
        objectArray[21] = "\u0019(Upl\f\u0019(B,`\u0003\u0003cB2`\u0016\u0004\u0012\u0010l8T";
        objectArray[22] = "[MZBu\"EE@\r\u00166A";
        objectArray[23] = "\u0013#&vB\\\u0018,79#R\u0013'3c";
        objectArray[24] = "/'\u0019rl!1/\u0003=$!+%\u001bz-:k\u0000\u001a}! ,)\u0001";
        objectArray[25] = "\u0000s2*6*\u0000s%v:%\u001a8%h:0\u001dIu5k";
        objectArray[26] = "\u000eC6B\r#\u000eC!\u001e\u0001,\u0014\b!\u0000\u00019\u0013yuXV";
        objectArray[27] = "77\u0010yCS)?\n6$R8$\u0007l\u0002T";
        objectArray[28] = "&\u0015Sv\u001bES5Xy\n\n2;Sr\u000ePF";
        objectArray[29] = Character.TYPE;
        cd_0.I[29] = "java/lang/Character";
        objectArray[30] = "]\u0014\u0003cQ/C\u001c\u0019,<5[\u0019\u0010a\u000b3X\u001b";
        objectArray[31] = "AQ8G9nAQ/\u001b5a[\u001a/\u00055t\\kxZc";
        objectArray[32] = "\u0010yHz\u000fMeYCu\u001e\u0002\u0004WH~\u001aXp";
        objectArray[33] = Boolean.TYPE;
        cd_0.I[33] = "java/lang/Boolean";
        objectArray[34] = "9\u0003\u001dP$2/\u0003\u0018\n7%8H\u001b\f;1)\u000f\f\u001bp&\u001c";
        objectArray[35] = "]f@S-k(FK\\<$IH@W8~=";
        objectArray[36] = "-\u0006q|_ZX&zsN\u00159(qxJOM";
        objectArray[37] = "\u0018\u0004'+\u000exm$,$\u001f7\f*'/\u001bmx";
        objectArray[38] = "]\u0002\u001cudKK\u0002\u0019/w\\\\I\u001a){HM\u000e\r>0_{";
        objectArray[39] = "|HW/Ak\th\\ P$hfW+T~\u001c";
        objectArray[40] = "4DW1\u001cW\"DRk\u000f@5\u000fQm\u0003T$HFzHC=";
        objectArray[41] = "\u0002Td\u0011\\\u0000wto\u001eMO\u0016zd\u0015I\u0015b";
        objectArray[42] = "\"g}Ds.4gx\u001e`9#,{\u0018l-2kl\u000f'<\u0011";
        objectArray[43] = ">u\u0013KCPKU\u0018DR\u001f*[\u0013OVE^";
        objectArray[44] = "{S#\u001em6mS&D~!z\u0018%Br5k_2U9\"t";
        objectArray[45] = "h~\u001d\u0005s_\u001d^\u0016\nb\u0010|P\u001d\u0001fJ\b";
        objectArray[46] = "\u0012BD`\u000fx\u0004BA:\u001co\u0013\tB<\u0010{\u0002NU+[l\u001a";
        objectArray[47] = "\"n!\"F\u001fWN*-WP6@!&S\nB";
        objectArray[48] = Double.TYPE;
        cd_0.I[48] = "java/lang/Double";
        objectArray[49] = "r\u000br\f\tWr\u000beP\u0005Xh@eN\u0005Mo17\u0010]\r";
        objectArray[50] = "x2)Z6;\r\u0012\"U'tl\u001c)^#.\u0018";
        objectArray[51] = "q3/Yd\"z<>\u0016\u00197h&<U";
        objectArray[52] = Long.TYPE;
        cd_0.I[52] = "java/lang/Long";
        objectArray[53] = ".\u0013l7\u0018\u001a[3g8\tU:=l3\r\u000fN";
        objectArray[54] = "\u0017aksW%\u0001an)D2\u0016*m/H&\u0007mz8\u000346";
        objectArray[55] = "C3\u0005\u00059n6\u0013\u000e\n(!W\u001d\u0005\u0001,{#";
        objectArray[56] = "U-R{Y< \rYtHsA\u0003R\u007fL)5";
        objectArray[57] = "x0%ftrn0 <gey{#:kqh<4- ar";
        objectArray[58] = ",+*j~IY\u000b!eo\u00068\u0005*nk\\L";
        objectArray[59] = "S7\u007f)8@S7hu4OI|hk4ZN\r92c\u0018";
        objectArray[60] = "^\u000b8 4+++3/%dJ%8$!>>";
        objectArray[61] = ",\u00070\u0000;\\2\u000f*OFL2";
        objectArray[62] = "F\u0001\u0006##M3!\r,2\u0002R/\u0006'6X&";
        objectArray[63] = "e\u0016X\u001c\u0003\u0006\u00106S\u0013\u0012Iq8X\u0018\u0016\u0013\u0005";
        objectArray[64] = "\b\u0010ad%\u000f\u0016\u0018{+F\u001b\u0012URk\u007f\b\u001b";
        objectArray[65] = "\\\u000b81~ J\u000b=km7]@>ma#L\u0007)z*4\\";
        objectArray[66] = "QbU\u0000;Y$B^\u000f*\u0016ELU\u0004.L1";
        objectArray[67] = "Zt6kP)Zt!7\\&@?!)\\3GNt}\u0005p";
        objectArray[68] = "|Q/X\fU\tq$W\u001d\u001ah\u007f/\\\u0019@\u001c";
        objectArray[69] = "<\u001a\r'3oI:\u0006(\" (4\r#&z\\";
        objectArray[70] = "r\u0010>:EI\"\u001a%k?NOE4kFT)A.a\u0000IOB64_\u0018pD;=A$";
        objectArray[71] = "%\u001b\ttW^#\u0016\u0000jk\u000ev\u000e)n\u0006\f}rZ}\u0010Q{\u0018]n[\u001d\u001b";
        objectArray[72] = ",]5=\u0014P#\u0001c<qL,B8b\u001d~|\u0003e;q\u0015(Ehe\u001b\u0012;\u000e$\u0005";
        objectArray[73] = "U|8]`@\u0005v#\f\u001aFh)2\fc]\u000e-(\u0006%@h++]c\u0012\u0014*=\\y-";
        objectArray[74] = "\u0016!R\u001c\u0000\u0007\u001e;\u0005Wf\u0003\u001f\"G\u0013\u001a\u00059)v\u0004\u001d\u0005\u001e;?\u0001[\u0014\u001f:X\u0001\u001aPAG_V\u0005\u0006\u001f>\u0001\u0003\u0003\u0004x(\u0002\u0012\u0001\u0015\u001f(CV_h";
        objectArray[75] = "qU\u0014!C\ro\u0014\u0017.8\u0005p@\u000f}oR.\u0017W\u0011Y\trB\u0006|\u0006\u0013u\u0015";
        objectArray[76] = "&HQm\u0017a>\u0005X,ge)\u001cU.\n\u001f~A_m\u0004q=\u0003\u000e5g";
        objectArray[77] = "\u0006}tK\u0019\u007fZvbXc1PwqY$!9/eOS/S(v\u0004\u001fO\u0006}tK\u0019\u007fZvbXc";
        objectArray[78] = "n\u001f\u00041Q+t_\u0004PKV<\u000bE)Z08\u0011OoGV?X\u0018mI8|\u001aI5*";
        objectArray[79] = "7\u0000\u001c1!D6\u0016\u001d+\u001eFe\u0016\u0000%YV\f\u0011\u0017, Ww\u0000C#|87\u0000\u001c1!D6\u0016\u001d+\u001e";
        objectArray[80] = "kMk=X?cW<v>.lO{\"EPa\u0015=*\u0004\"zTt=>";
        objectArray[81] = "^\t\u0002RWR@H\u0001],Z_\u001c\u0019\u000e{\r\u0001L@bI\u000e\u0001\u000e\u0005\b^[C\t";
        objectArray[82] = "Fg6$$\u001d\u0016m-u^\u001b{2<u'\u0000\u001d6&\u007fa\u001d{a2 ;\t\u0010d(./p";
        objectArray[83] = "\u0013F:{\u0003W\u000b\u000b3:sI\u0018\f\u001f+\u0003Uq\u0011h'BUKIb\"\u001f)";
        objectArray[84] = "Vwy\u0014h=PrmX\u0001:=\"=\u0005y`V\">\u0007<";
        objectArray[85] = "J\u0006\n4\fEM\u0006Ll0\u0003,M\u001a5I\u000eJI\u0000?\u000f\u0013,NIh\r\u001dB\r\u000b9U~";
        objectArray[86] = "\u001f\u001a\u0007F%B\u0007@\u0006]_\u0000v\u0012\u000b\r&\u000e\u0010\u0016\u0011\u0007`\u0013v\u0011XPb\u001d\u0018R\u001a\u0001:~";
        objectArray[87] = "PW=nxDJ\u0017=\u000fo9\u0002C|vs_\u0006Yv0n9]\u0019->\u007f\u0003\u0005\u0013(c\u0003";
        objectArray[88] = "\u001dc)\u0017K`\u0019&+[)jd#'\u0017Pp\u0002'=\u001d\u0016md$%HI<[\"(AW\u0000";
        objectArray[89] = "k`]\u0001\u001e[a'IP\"R\u0010a_X[KveER\u001dV\u0010$LQ\u0012F =K\u001a\u0013;";
        objectArray[90] = "f\u0018\u0017\u000b!h6\u0012\fZ[l[M\u001dZ\"u=I\u0007Pdh[J\u001f\u0005;9dL\u0012\f%\u0005";
        objectArray[91] = "Y2\u001f\u0003YRCr\u001fbK/\u000b&^\u001bRI\u000f<T]O/\bu\u0003_AAK7R\u0007\"";
        objectArray[92] = "\b\u0001Z2\"zX\u000bAcX~5S\u0007n4xO\u000b\u0006,#\u0017\u000bQ\u0006?7mSPD(X";
        objectArray[93] = "A;\t~\u0012\u001a@-\bd-\b\u001d3\rnQfA;\t~\u0012\u001a@-\bd-_\u0011y\u0011wK[\u000bsWj-]\b(\u00118Q\\\u001e)\u000b\u0007";
        objectArray[94] = "jp%\u000f\u0004x{.vNt\"\u0017*q\u0003\r9q.k\tK$\u0017)\"^I*yj`\u000f\u0011I";
        objectArray[95] = "\f#V`\"n\u0000mY:@frj\r`9}\u0014n\u0017j\u007f`ri^=}n\u001c*\u001cl%\r";
        objectArray[96] = "^x:\u0018d^\to6[\u0016\u001c\u000fg[Vo\u001c\u000bh0\u001e']\r\u0001+_m\u0002\u0007jc\u0017,\u0004n";
        objectArray[97] = ".7zm\\D?!ty7\u001f2&{g[-bg+<7F6!+`]A%jg\u0000";
        objectArray[98] = "_Yi\u001b3<E\u0019iz#A\rM(\u00038'\tW\"E%AR\u0017yK4{\n\u001d|\u0016H";
        objectArray[99] = "D#e\u001b0^U5k\u000f[\u0005X2d\u001177\t~9Kj`S\u007feG'Z\u000bu`\u001a[";
        objectArray[100] = "D0l\u0006 l\u00060t\fFzK,n\u0005 mj7q\u0005\u0003pR2u\u0013F(\u000e0(\t)hK)y\u000eF";
        objectArray[101] = "/mTVusxzX\u0015\u0007/~r5Tn1/t_S}zc\u0014\t\u0001|z\u007f~\u000e\u001276\u001f(\\\u00137*u/OX{J";
        objectArray[102] = "M&~Cx-\u001d,e\u0012\u0002,pst\u0012{0\u0016wn\u0018=-pqmC{\u007f\fp{Ba@";
        objectArray[103] = "9$V50y82W/\u000fnb?M\u0005s\u0005>?L|oo9,\u00070\u000ffh2\t#tw<=UL";
        objectArray[104] = "w*rgD3-o~gHN'\u0013,`\u001a7>u(z\u0010q#\u0013\u007fnO+7xztA?N";
        objectArray[105] = "z[RBR#z\u000b^J)1@^E\u001dP<:^X\u0011E[";
        objectArray[106] = "o\u0000\u0014Za\u0006h\u0000R\u0002]Y\tK\u0004[$MoO\u001eQbP\tHW\u0006`^g\u000b\u0015W8=";
        objectArray[107] = "NL*\u0003y\u001bHA#\u001dEK\u001dY\u001f\u000e)$LL>S%NK_u\u001fE";
        objectArray[108] = "0\u001fz\u001f&xg\bv\\T$i\u0016\u001b\u001d=:0\u0006q\u001a.q|f'H/q`\f [d=\u0000ZrZd!j]a\u0011(A";
        objectArray[109] = "\rbqdF]\u001ct\u007fp-\u0006\u0011spnA4A2/9-_\u0015t iGX\u0006?l\t";
        objectArray[110] = "\"NpqK( \u000f;-\u0010Rru8 \u001a+k\u0013<:\u0010mvuk.O7b\u001en4A#\u001b";
        objectArray[111] = "o9.o\u0019s2|vcT\u00149i1X\u0015n7b\"\u0003Rf7}r\u007fSp6gM";
        objectArray[112] = "\u0019ZV6W\rC\u001fZ6[pLc\b1\t\tP\u0005\f+\u0003OMc\u000f3V\u0010\u001c\\\t>_\u000e ";
        objectArray[113] = "\bu9DGB\u000fw{\\\u0018#P7.Z\u0014_V1CBL@\f;=Z\u0001IMK";
        objectArray[114] = "&8f\u007f':)d0~B&&'k .\u0014vf5\u007fBzv8g7%'3`kzB";
        objectArray[115] = "\u0011qVC\u001c\b\n0\u001fT&\u001b\t\"\u0017OZ\u001d\u000fO\u000f\u0017EG\u00051\u0017ZL\u0006u";
        objectArray[116] = "E##Fn\u0006E !\u0003_\u0004)#%\u000e&\u001dO'?\u0004`\u0000)s\u007fY$\u0017\u0015k%X?m";
        objectArray[117] = "\u0012uj\u007f\b?\u0014xca4oA`L{L`E\u001c9vO0Lv>e\u0004|,";
        objectArray[118] = "y\u00162F5ta[;\u0007ElvW-{*7g@,\u001c*v#\u001eQ";
        objectArray[119] = "\u001e|\u000bYzT\u001fj\nCELHh\u0005\\%(\u0019g\u0011\u0010%B\u001etZ\\E";
        objectArray[120] = "N\u0015sFL\u001f\u001e\u001fh\u00176\u0018s@y\u0017O\u0002\u0015Dc\u001d\t\u001fsB`FOM\u000fCvGUr";
        objectArray[121] = "[xU\u0002g\u001d\u0004bRU\n\u0015WfV\nf'\u0004\"\u0006]\n\u001e\\wD\u000be\u0016F \u000fm";
        objectArray[122] = "BL\u007f#\u0006\u0001CZ~99\u0003\u0010Zc7~\u0013y\u0002w!\t\u001d\u0013\u0005djE}BL\u007f#\u0006\u0001CZ~99";
        objectArray[123] = "RrCmk:Zh\u0014&\r8ZhTnV8@\u0014\u0017!w1\u0006u\u0010#5)Y\u0014";
        objectArray[124] = "P\u0012&<U$HH''/s9\u001a*wVh_\u001e0}\u0010u9I$\"JaRL>,^\u0018";
        objectArray[125] = "a\u0011\u0016wTebF\u000f)U]7L\rHQ9%Lqy\u0005!?\\\u0016yDea!";
        objectArray[126] = "=q-Z@&%+,A:sTy!\u0011Cj2};\u001b\u0005wT*/D_c?/5JK\u001a";
        objectArray[127] = "\u001cSw\u0004[\u0001\u001a^~\u001agQOFR\u0000\u001aS\"\u0006q\u001fW^H\u0001bT\u001b>";
        objectArray[128] = "a\\\u000bv\r~bRZp\t@5m^tD9(\u000bZnN\u007f5m]'\u0019};\u0003\u001eeH%X";
        objectArray[129] = "/O\u000exscqW\t|t\u0004}A\u000f8E?*\u0017j//xq[\r/n</&";
        objectArray[130] = "M\u0014\u0003k)]J\u0016Asv<\u001fM\u001fsz]\u0012Qy`.@\u0013W\u001e`o\u0004M*\u001f>r\r\b\u0010G4wPt";
        objectArray[131] = "ID,M8a\u0013\u0001 M4\u001c\u001a}rJfe\u0000\u001bvPl#\u001d}!D3y\t\u0016$^=mp";
        objectArray[132] = "\u001cZ\u0002gS\u0016\u001f\r\u001b9R.J\u0007\u0019ER_%\u0005XzXSB\u0005\u0019>\u0006.";
        objectArray[133] = "xOw'J1\u007fM5?\u0015P(\u001daC\u001fm=\u0016p$\u001f,yH\r%A1p\r7}K4-q";
        objectArray[134] = "<\u0010@hk6$JAs\u0011uU\u0018L#hz3\u001cV).gU\u001b\u001f~,i;X]/t\n";
        Object[] objectArray2 = objectArray;
        objectArray[135] = "Z\u0019ruwi\r\u000e~6\u00055\u0003\u0010\u0013!`5\u000f\u0019x$z;\u001b`y.`5\u0013\u000b|4n!j\nv.`)\u0001\u000fl tP";
    }

    /*
     * Exception decompiling
     */
    protected String b(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[SWITCH]
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

    private static Color b(Object[] objectArray) {
        reference var7_9;
        reference var6_7;
        reference var5_4;
        block5: {
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            CallSite callSite4;
            CallSite callSite5;
            long l;
            block4: {
                Color color = (Color)objectArray[0];
                l = (Long)objectArray[1];
                l = v ^ l;
                callSite5 = cd_0.d("\u00fc", (Object)color, (long)889958002172016644L, (long)l);
                CallSite callSite6 = cd_0.d("\u00c1", (long)889814993517009183L, (long)l);
                callSite4 = cd_0.d("\u00fc", (Object)color, (long)888012560912664415L, (long)l);
                callSite3 = cd_0.d("\u00fc", (Object)color, (long)890865546369371529L, (long)l);
                CallSite callSite7 = callSite5 * 3 + callSite4 * 4 + callSite3 >> 3;
                try {
                    try {
                        callSite2 = callSite7;
                        callSite = cd_0.c("p", (int)13119, (long)(0x3286E8029CC7865FL ^ l));
                        if (callSite6 != null) break block4;
                        if (callSite2 >= callSite) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cd_0.d("\u00c1", (Object)matchException, (long)888403867616880359L, (long)l);
                    }
                    callSite2 = cd_0.c("p", (int)15122, (long)(0x7983CE68929A8E7DL ^ l));
                    callSite = callSite7;
                }
                catch (MatchException matchException) {
                    throw cd_0.d("\u00c1", (Object)matchException, (long)888403867616880359L, (long)l);
                }
            }
            float f = (float)(callSite2 - callSite) / 90.0f * 0.6f;
            var5_4 = callSite5 + (int)((float)(cd_0.c("p", (int)9317, (long)(0x6B2C917196931106L ^ l)) - callSite5) * f);
            var6_7 = callSite4 + (int)((float)(cd_0.c("p", (int)9317, (long)(0x6B2C917196931106L ^ l)) - callSite4) * f);
            var7_9 = callSite3 + (int)((float)(cd_0.c("p", (int)9317, (long)(0x6B2C917196931106L ^ l)) - callSite3) * f);
        }
        return new Color((int)var5_4, (int)var6_7, (int)var7_9);
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

    private float c(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = v ^ l;
        long l3 = l2 ^ 0x545BECAFB2B5L;
        long l4 = l2 ^ 0x7EC3240C5EE7L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = string;
        return (float)(cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6074434299751062713L, (long)l), (Object)objectArray2, (long)-6072130102380195805L, (long)l), (Object)objectArray3, (long)-6072602439988965617L, (long)l) * 0.65f + 4.0f);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x392E;
        if (C[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = B[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])D.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cd_0.C[n2] = n3;
        }
        return C[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cd_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected String c(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = v ^ l;
        int n2 = n / cd_0.c("p", (int)2684, (long)(0x3E5BDCDCD257D256L ^ l));
        int n3 = n2 / cd_0.c("p", (int)15818, (long)(0x71AC74A0907665EEL ^ l));
        int n4 = n2 % cd_0.c("p", (int)24091, (long)(0x72E29654F67D8636L ^ l));
        try {
            if (n3 > 0) {
                return cd_0.d("\u00c1", (Object)cd_0.a("u", (int)2844, (long)(0x6085661D282E443EL ^ l)), (Object)new Object[]{cd_0.d("\u00c1", (int)n3, (long)6994942798281579344L, (long)l), cd_0.d("\u00c1", (int)n4, (long)6994942798281579344L, (long)l)}, (long)6996086622158506781L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw cd_0.d("\u00c1", (Object)matchException, (long)6996193238846098340L, (long)l);
        }
        return cd_0.d("\u00c1", (Object)cd_0.a("u", (int)8349, (long)(0x73252094EEF16FB0L ^ l)), (Object)new Object[]{cd_0.d("\u00c1", (int)n4, (long)6994942798281579344L, (long)l)}, (long)6996086622158506781L, (long)l);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == 'Y' || c == 'F' || c == '\u00ce') {
                field = cd_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cd_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cd_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cd_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cd_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = cd_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cd_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l(Object[] var1_1) {
        block172: {
            block171: {
                block170: {
                    block169: {
                        block168: {
                            block163: {
                                block164: {
                                    block167: {
                                        block165: {
                                            block166: {
                                                block158: {
                                                    block147: {
                                                        block146: {
                                                            block145: {
                                                                block144: {
                                                                    var2_2 = (aq_0)var1_1[0];
                                                                    var6_3 = (gK)var1_1[1];
                                                                    var3_4 = (Matrix4f)var1_1[2];
                                                                    var4_5 = (Long)var1_1[3];
                                                                    v0 = var4_5;
                                                                    var7_6 = v0 ^ 95334181894420L;
                                                                    var9_7 = v0 ^ 27807340928064L;
                                                                    var11_8 = v0 ^ 96488322041274L;
                                                                    var13_9 = v0 ^ 45947767099148L;
                                                                    var15_10 = v0 ^ 54030867045760L;
                                                                    var17_11 = v0 ^ 92326280031513L;
                                                                    var19_12 = v0 ^ 117880139760215L;
                                                                    var21_13 = v0 ^ 93148276620004L;
                                                                    var23_14 = v0 ^ 57131357196865L;
                                                                    var25_15 = v0 ^ 132449650111663L;
                                                                    var27_16 = v0 ^ 33779468439083L;
                                                                    var29_17 = v0 ^ 89135395443612L;
                                                                    var31_18 = v0 ^ 102693909475685L;
                                                                    var33_19 = v0 ^ 63614044077481L;
                                                                    var35_20 = v0 ^ 53426174796383L;
                                                                    var37_21 = v0 ^ 6014253680539L;
                                                                    var39_22 = v0 ^ 131934975778103L;
                                                                    var41_23 = v0 ^ 19313467402120L;
                                                                    var43_24 = v0 ^ 96557814079126L;
                                                                    var45_25 = v0 ^ 101037798966850L;
                                                                    var47_26 = cd_0.d("\u00c1", (long)-6310620125935010518L, (long)var4_5);
                                                                    try {
                                                                        try {
                                                                            v1 = this;
                                                                            if (var47_26 != null) break block144;
                                                                            if (v1.c != null) break block145;
                                                                        }
                                                                        catch (MatchException v2) {
                                                                            throw cd_0.d("\u00c1", (Object)v2, (long)-6313676177467735342L, (long)var4_5);
                                                                        }
                                                                        v1 = this;
                                                                    }
                                                                    catch (MatchException v3) {
                                                                        throw cd_0.d("\u00c1", (Object)v3, (long)-6313676177467735342L, (long)var4_5);
                                                                    }
                                                                }
                                                                v4 = new Object[2];
                                                                v4[1] = var23_14;
                                                                v4[0] = cd_0.a("u", (int)24722, (long)(1465329969319372483L ^ var4_5));
                                                                v1.c = cd_0.d("\u00c1", (Object)v4, (long)-6313989757828091063L, (long)var4_5);
                                                            }
                                                            var48_27 = (float)(cd_0.d("\u00c1", (long)-6309688116715675825L, (long)var4_5) - cd_0.d) * 0.005f;
                                                            cd_0.d = (long)cd_0.d("\u00c1", (long)-6309688116715675825L, (long)var4_5);
                                                            var49_28 = new HashSet<E>();
                                                            try {
                                                                try {
                                                                    v5 = cd_0.d("M", (Object)cd_0.b, (long)-6312737065789881602L, (long)var4_5);
                                                                    if (var47_26 != null) break block146;
                                                                    if (v5 == null) break block147;
                                                                }
                                                                catch (MatchException v6) {
                                                                    throw cd_0.d("\u00c1", (Object)v6, (long)-6313676177467735342L, (long)var4_5);
                                                                }
                                                                v5 = cd_0.d("M", (Object)cd_0.b, (long)-6312737065789881602L, (long)var4_5);
                                                            }
                                                            catch (MatchException v7) {
                                                                throw cd_0.d("\u00c1", (Object)v7, (long)-6313676177467735342L, (long)var4_5);
                                                            }
                                                        }
                                                        var50_29 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)v5, (long)-6311794727760266136L, (long)var4_5), (long)-6311594914365164442L, (long)var4_5), (long)-6311212205880858971L, (long)var4_5);
                                                        block114: while (true) {
                                                            v8 = var50_29;
                                                            while (cd_0.d("\u00fc", (Object)v8, (long)-6313335842019414206L, (long)var4_5) != false) {
                                                                block154: {
                                                                    block153: {
                                                                        block151: {
                                                                            block152: {
                                                                                block149: {
                                                                                    block150: {
                                                                                        block148: {
                                                                                            v8 = var50_29;
                                                                                            if (var47_26 != null) continue;
                                                                                            var51_30 = (Map.Entry)cd_0.d("\u00fc", (Object)v8, (long)-6310695855786828822L, (long)var4_5);
                                                                                            var52_32 = (class_1291)cd_0.d("\u00fc", (Object)((class_6880)cd_0.d("\u00fc", (Object)var51_30, (long)-6316461689138367536L, (long)var4_5)), (long)-6316844373397128084L, (long)var4_5);
                                                                                            var53_34 = (class_1293)cd_0.d("\u00fc", (Object)var51_30, (long)-6311507853601782028L, (long)var4_5);
                                                                                            try {
                                                                                                v9 = var52_32;
                                                                                                if (var47_26 == null) {
                                                                                                    if (v9 == null) continue block114;
                                                                                                }
                                                                                                ** GOTO lbl167
                                                                                            }
                                                                                            catch (MatchException v10) {
                                                                                                throw cd_0.d("\u00c1", (Object)v10, (long)-6313676177467735342L, (long)var4_5);
                                                                                            }
                                                                                            try {
                                                                                                v11 = var53_34;
                                                                                                if (var47_26 != null) break block148;
                                                                                                if (v11 == null) {
                                                                                                    continue block114;
                                                                                                }
                                                                                            }
                                                                                            catch (MatchException v12) {
                                                                                                throw cd_0.d("\u00c1", (Object)v12, (long)-6313676177467735342L, (long)var4_5);
                                                                                            }
                                                                                            v11 = var53_34;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v13 = cd_0.d("\u00fc", (Object)v11, (long)-6309910384520195078L, (long)var4_5);
                                                                                                    if (var47_26 != null) break block149;
                                                                                                    if (v13 != false) break block150;
                                                                                                }
                                                                                                catch (MatchException v14) {
                                                                                                    throw cd_0.d("\u00c1", (Object)v14, (long)-6313676177467735342L, (long)var4_5);
                                                                                                }
                                                                                                v13 = cd_0.d("\u00fc", (Object)var53_34, (long)-6310045993763564580L, (long)var4_5);
                                                                                                if (var47_26 != null) break block149;
                                                                                            }
                                                                                            catch (MatchException v15) {
                                                                                                throw cd_0.d("\u00c1", (Object)v15, (long)-6313676177467735342L, (long)var4_5);
                                                                                            }
                                                                                            if (v13 <= 0) {
                                                                                                continue block114;
                                                                                            }
                                                                                        }
                                                                                        catch (MatchException v16) {
                                                                                            throw cd_0.d("\u00c1", (Object)v16, (long)-6313676177467735342L, (long)var4_5);
                                                                                        }
                                                                                    }
                                                                                    v13 = cd_0.d("\u00fc", var49_28, (Object)var52_32, (long)-6316517801482054227L, (long)var4_5);
                                                                                }
                                                                                var54_37 = (c_)cd_0.d("\u00fc", (Object)this.a, (Object)var52_32, (Function<class_1291, c_>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$renderNew$0(net.minecraft.class_1291 ), (Lnet/minecraft/class_1291;)Ldev/zprestige/prestige/c_;)(), (long)-6312676656619444870L, (long)var4_5);
                                                                                try {
                                                                                    try {
                                                                                        v17 = var54_37;
                                                                                        v18 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)var52_32, (long)-6310953537565546252L, (long)var4_5), (long)-6310201500255578559L, (long)var4_5);
                                                                                        if (var47_26 != null) break block151;
                                                                                        v17.a = v18;
                                                                                        v17 = var54_37;
                                                                                        if (cd_0.d("\u00fc", (Object)var53_34, (long)-6310349659272443522L, (long)var4_5) <= 0) break block152;
                                                                                    }
                                                                                    catch (MatchException v19) {
                                                                                        throw cd_0.d("\u00c1", (Object)v19, (long)-6313676177467735342L, (long)var4_5);
                                                                                    }
                                                                                    v20 = new Object[2];
                                                                                    v20[1] = var27_16;
                                                                                    v20[0] = (int)(cd_0.d("\u00fc", (Object)var53_34, (long)-6310349659272443522L, (long)var4_5) + true);
                                                                                    v18 = cd_0.d("\u00fc", (Object)this, (Object)v20, (long)-6311679160814962932L, (long)var4_5);
                                                                                    break block151;
                                                                                }
                                                                                catch (MatchException v21) {
                                                                                    throw cd_0.d("\u00c1", (Object)v21, (long)-6313676177467735342L, (long)var4_5);
                                                                                }
                                                                            }
                                                                            v18 = null;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v17.b = v18;
                                                                                v22 = new Object[2];
                                                                                v22[1] = var35_20;
                                                                                v22[0] = new Color((int)cd_0.d("\u00fc", (Object)var52_32, (long)-6312782599741512521L, (long)var4_5));
                                                                                var54_37.c = cd_0.d("\u00c1", (Object)v22, (long)-6311852043813089737L, (long)var4_5);
                                                                                var54_37.f = cd_0.d("\u00fc", (Object)var53_34, (long)-6309910384520195078L, (long)var4_5);
                                                                                var54_37.d = (int)cd_0.d("\u00fc", (Object)var53_34, (long)-6310045993763564580L, (long)var4_5);
                                                                                v23 = var54_37;
                                                                                if (var47_26 != null) break block153;
                                                                                if (v23.d <= var54_37.e) break block154;
                                                                            }
                                                                            catch (MatchException v24) {
                                                                                throw cd_0.d("\u00c1", (Object)v24, (long)-6313676177467735342L, (long)var4_5);
                                                                            }
                                                                            v23 = var54_37;
                                                                        }
                                                                        catch (MatchException v25) {
                                                                            throw cd_0.d("\u00c1", (Object)v25, (long)-6313676177467735342L, (long)var4_5);
                                                                        }
                                                                    }
                                                                    v23.e = var54_37.d;
                                                                }
                                                                if (var47_26 != null) break block114;
                                                                continue block114;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    var50_29 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)this.a, (long)-6311594914365164442L, (long)var4_5), (long)-6311212205880858971L, (long)var4_5);
                                                    while (cd_0.d("\u00fc", (Object)var50_29, (long)-6313335842019414206L, (long)var4_5) != false) {
                                                        block156: {
                                                            block155: {
                                                                var51_30 = (Map.Entry)cd_0.d("\u00fc", (Object)var50_29, (long)-6310695855786828822L, (long)var4_5);
                                                                v9 = cd_0.d("\u00fc", (Object)var51_30, (long)-6311507853601782028L, (long)var4_5);
lbl167:
                                                                // 2 sources

                                                                var52_32 = (c_)v9;
                                                                try {
                                                                    v26 = cd_0.d("\u00fc", var49_28, (Object)cd_0.d("\u00fc", (Object)var51_30, (long)-6316461689138367536L, (long)var4_5), (long)-6316595081618836187L, (long)var4_5) != false ? 1.0f : 0.0f;
                                                                }
                                                                catch (MatchException v27) {
                                                                    throw cd_0.d("\u00c1", (Object)v27, (long)-6313676177467735342L, (long)var4_5);
                                                                }
                                                                var53_35 = v26;
                                                                try {
                                                                    try {
                                                                        v28 = new Object[4];
                                                                        v28[3] = var37_21;
                                                                        v28[2] = Float.valueOf(var48_27);
                                                                        v28[1] = Float.valueOf(var53_35);
                                                                        v28[0] = Float.valueOf(var52_32.g);
                                                                        var52_32.g = (float)cd_0.d("\u00c1", (Object)v28, (long)-6316683134444628029L, (long)var4_5);
                                                                        cfr_temp_0 = var53_35 - 0.0f;
                                                                        v29 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                        if (var47_26 != null) break block155;
                                                                        if (v29 != false) break block156;
                                                                    }
                                                                    catch (MatchException v30) {
                                                                        throw cd_0.d("\u00c1", (Object)v30, (long)-6313676177467735342L, (long)var4_5);
                                                                    }
                                                                    cfr_temp_1 = var52_32.g - 0.02f;
                                                                    v29 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                }
                                                                catch (MatchException v31) {
                                                                    throw cd_0.d("\u00c1", (Object)v31, (long)-6313676177467735342L, (long)var4_5);
                                                                }
                                                            }
                                                            try {
                                                                if (v29 < 0) {
                                                                    cd_0.d("\u00fc", (Object)var50_29, (long)-6312536964932683585L, (long)var4_5);
                                                                }
                                                            }
                                                            catch (MatchException v32) {
                                                                throw cd_0.d("\u00c1", (Object)v32, (long)-6313676177467735342L, (long)var4_5);
                                                            }
                                                        }
                                                        if (var47_26 == null) continue;
                                                    }
                                                    v33 = new Object[1];
                                                    v33[0] = var39_22;
                                                    v34 = new Object[1];
                                                    v34[0] = var15_10;
                                                    var51_31 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v33, (long)-6310813107073772557L, (long)var4_5), (Object)v34, (long)-6311436884167124421L, (long)var4_5);
                                                    v35 = new Object[2];
                                                    v35[1] = Float.valueOf(1.0f);
                                                    v35[0] = Float.valueOf((float)var51_31);
                                                    var52_33 = cd_0.d("\u00c1", (Object)v35, (long)-6310171405483260318L, (long)var4_5);
                                                    v36 = new Object[2];
                                                    v36[1] = Float.valueOf(0.9f);
                                                    v36[0] = Float.valueOf((float)var51_31);
                                                    var53_36 = cd_0.d("\u00c1", (Object)v36, (long)-6310171405483260318L, (long)var4_5);
                                                    var54_38 = 23.0f;
                                                    v37 = new Object[1];
                                                    v37[0] = var39_22;
                                                    v38 = new Object[2];
                                                    v38[1] = var31_18;
                                                    v38[0] = cd_0.a("u", (int)1235, (long)(2898496773752062593L ^ var4_5));
                                                    var55_39 = var54_38 + cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v37, (long)-6310813107073772557L, (long)var4_5), (Object)v38, (long)-6311300661860856609L, (long)var4_5) + 5.5f;
                                                    var56_40 /* !! */  = cd_0.d("\u00c1", (float)70.0f, (float)var55_39, (long)-6316433378719746019L, (long)var4_5);
                                                    var57_41 /* !! */  = var52_33;
                                                    var58_42 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)this.a, (long)-6313397640050804970L, (long)var4_5), (long)-6311061581400362752L, (long)var4_5);
                                                    while (cd_0.d("\u00fc", (Object)var58_42, (long)-6313335842019414206L, (long)var4_5) != false) {
                                                        block161: {
                                                            block162: {
                                                                block159: {
                                                                    block160: {
                                                                        block157: {
                                                                            var59_44 = (c_)cd_0.d("\u00fc", (Object)var58_42, (long)-6310695855786828822L, (long)var4_5);
                                                                            try {
                                                                                try {
                                                                                    v39 = var59_44.g;
                                                                                    v40 /* !! */  = 0.02f;
                                                                                    if (var47_26 != null) break block157;
                                                                                    cfr_temp_2 = v39 - v40 /* !! */ ;
                                                                                    v41 /* !! */  = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                                                                    if (var47_26 != null) break block158;
                                                                                }
                                                                                catch (MatchException v42) {
                                                                                    throw cd_0.d("\u00c1", (Object)v42, (long)-6313676177467735342L, (long)var4_5);
                                                                                }
                                                                                if (v41 /* !! */  < 0) {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                            catch (MatchException v43) {
                                                                                throw cd_0.d("\u00c1", (Object)v43, (long)-6313676177467735342L, (long)var4_5);
                                                                            }
                                                                            v39 = 5.5f;
                                                                            v44 = new Object[1];
                                                                            v44[0] = var39_22;
                                                                            v45 = new Object[2];
                                                                            v45[1] = var31_18;
                                                                            v45[0] = var59_44.a;
                                                                            v40 /* !! */  = (float)(cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v44, (long)-6310813107073772557L, (long)var4_5), (Object)v45, (long)-6311300661860856609L, (long)var4_5) * 0.9f);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var47_26 != null) break block159;
                                                                                v39 = v39 + v40 /* !! */ ;
                                                                                if (var59_44.b == null) break block160;
                                                                            }
                                                                            catch (MatchException v46) {
                                                                                throw cd_0.d("\u00c1", (Object)v46, (long)-6313676177467735342L, (long)var4_5);
                                                                            }
                                                                            v47 = new Object[2];
                                                                            v47[1] = var11_8;
                                                                            v47[0] = var59_44.b;
                                                                            v40 /* !! */  = 3.0f + cd_0.d("\u00fc", (Object)this, (Object)v47, (long)-6313225409798366479L, (long)var4_5);
                                                                            break block159;
                                                                        }
                                                                        catch (MatchException v48) {
                                                                            throw cd_0.d("\u00c1", (Object)v48, (long)-6313676177467735342L, (long)var4_5);
                                                                        }
                                                                    }
                                                                    v40 /* !! */  = 0.0f;
                                                                }
                                                                v49 = new Object[1];
                                                                v49[0] = var39_22;
                                                                v50 = new Object[2];
                                                                v50[1] = var17_11;
                                                                v50[0] = var59_44;
                                                                v51 = new Object[2];
                                                                v51[1] = var31_18;
                                                                v51[0] = cd_0.d("\u00fc", (Object)this, (Object)v50, (long)-6309551875238792571L, (long)var4_5);
                                                                var60_46 = v39 + v40 /* !! */  + 8.0f + cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v49, (long)-6310813107073772557L, (long)var4_5), (Object)v51, (long)-6311300661860856609L, (long)var4_5) * 0.9f + 5.5f;
                                                                try {
                                                                    v52 /* !! */  = var60_46;
                                                                    v53 = var56_40 /* !! */ ;
                                                                    if (var47_26 != null) break block161;
                                                                    if (!(v52 /* !! */  > v53)) break block162;
                                                                }
                                                                catch (MatchException v54) {
                                                                    throw cd_0.d("\u00c1", (Object)v54, (long)-6313676177467735342L, (long)var4_5);
                                                                }
                                                                var56_40 /* !! */  = (reference)var60_46;
                                                            }
                                                            v52 /* !! */  = (float)var57_41 /* !! */ ;
                                                            v53 = (var53_36 + 3.0f) * var59_44.g;
                                                        }
                                                        var57_41 /* !! */  = (CallSite)(v52 /* !! */  + v53);
                                                        if (var47_26 == null) continue;
                                                    }
                                                    v55 = new Object[4];
                                                    v55[3] = var37_21;
                                                    v55[2] = Float.valueOf(var48_27 * 2.0f);
                                                    v55[1] = Float.valueOf((float)var56_40 /* !! */ );
                                                    v55[0] = Float.valueOf(this.g);
                                                    this.g = (float)cd_0.d("\u00c1", (Object)v55, (long)-6316683134444628029L, (long)var4_5);
                                                    v41 /* !! */  = (float)cd_0.d("\u00fc", (Object)this, (Object)new Object[0], (long)-6313027245452828479L, (long)var4_5);
                                                }
                                                var58_43 = v41 /* !! */ ;
                                                var59_45 = cd_0.d("\u00fc", (Object)this, (Object)new Object[0], (long)-6309889046531041931L, (long)var4_5);
                                                var60_47 = cd_0.d("M", (Object)cd_0.b, (long)-6313418655926060087L, (long)var4_5) instanceof g8;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var47_26 != null) break block163;
                                                                        if (var60_47) break block164;
                                                                    }
                                                                    catch (MatchException v56) {
                                                                        throw cd_0.d("\u00c1", (Object)v56, (long)-6313676177467735342L, (long)var4_5);
                                                                    }
                                                                    v57 = var58_43;
                                                                    if (var47_26 != null) break block165;
                                                                }
                                                                catch (MatchException v58) {
                                                                    throw cd_0.d("\u00c1", (Object)v58, (long)-6313676177467735342L, (long)var4_5);
                                                                }
                                                                if (v57 == false) break block166;
                                                            }
                                                            catch (MatchException v59) {
                                                                throw cd_0.d("\u00c1", (Object)v59, (long)-6313676177467735342L, (long)var4_5);
                                                            }
                                                            cfr_temp_3 = this.h - 0.0f;
                                                            v57 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                            if (var47_26 != null) break block165;
                                                        }
                                                        catch (MatchException v60) {
                                                            throw cd_0.d("\u00c1", (Object)v60, (long)-6313676177467735342L, (long)var4_5);
                                                        }
                                                        if (v57 <= 0) break block166;
                                                    }
                                                    catch (MatchException v61) {
                                                        throw cd_0.d("\u00c1", (Object)v61, (long)-6313676177467735342L, (long)var4_5);
                                                    }
                                                    this.f -= var57_41 /* !! */  - this.h;
                                                }
                                                catch (MatchException v62) {
                                                    throw cd_0.d("\u00c1", (Object)v62, (long)-6313676177467735342L, (long)var4_5);
                                                }
                                            }
                                            v57 = (float)var59_45;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var47_26 != null) break block167;
                                                    if (v57 == false) break block164;
                                                }
                                                catch (MatchException v63) {
                                                    throw cd_0.d("\u00c1", (Object)v63, (long)-6313676177467735342L, (long)var4_5);
                                                }
                                                v64 = this.k;
                                                if (var47_26 != null) break block168;
                                            }
                                            catch (MatchException v65) {
                                                throw cd_0.d("\u00c1", (Object)v65, (long)-6313676177467735342L, (long)var4_5);
                                            }
                                            cfr_temp_4 = v64 - 0.0f;
                                            v57 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                        }
                                        catch (MatchException v66) {
                                            throw cd_0.d("\u00c1", (Object)v66, (long)-6313676177467735342L, (long)var4_5);
                                        }
                                    }
                                    try {
                                        if (v57 > 0) {
                                            this.e -= this.g - this.k;
                                        }
                                    }
                                    catch (MatchException v67) {
                                        throw cd_0.d("\u00c1", (Object)v67, (long)-6313676177467735342L, (long)var4_5);
                                    }
                                }
                                this.h = (float)var57_41 /* !! */ ;
                                this.k = this.g;
                                v68 = new Object[2];
                                v68[1] = Float.valueOf((float)var57_41 /* !! */ );
                                v68[0] = Float.valueOf(this.g);
                                cd_0.d("\u00fc", (Object)this, (Object)v68, (long)-6312381990902337381L, (long)var4_5);
                            }
                            v64 = this.e;
                        }
                        var61_48 = v64;
                        try {
                            v69 = var58_43 != false ? this.f + var57_41 /* !! */  - var52_33 : this.f;
                        }
                        catch (MatchException v70) {
                            throw cd_0.d("\u00c1", (Object)v70, (long)-6313676177467735342L, (long)var4_5);
                        }
                        var62_49 = v69;
                        v71 = new Object[10];
                        v71[9] = var7_6;
                        v71[8] = Float.valueOf(4.0f);
                        v71[7] = 5;
                        v71[6] = Float.valueOf((float)var52_33);
                        v71[5] = Float.valueOf(this.g);
                        v71[4] = Float.valueOf(var62_49);
                        v71[3] = Float.valueOf(var61_48);
                        v71[2] = var3_4;
                        v71[1] = var6_3;
                        v71[0] = var2_2;
                        cd_0.d("\u00c1", (Object)v71, (long)-6316773123640284997L, (long)var4_5);
                        v72 = new Object[10];
                        v72[9] = var25_15;
                        v72[8] = Float.valueOf(4.0f);
                        v72[7] = cn_0.r;
                        v72[6] = Float.valueOf((float)var52_33);
                        v72[5] = Float.valueOf(this.g);
                        v72[4] = Float.valueOf(var62_49);
                        v72[3] = Float.valueOf(var61_48);
                        v72[2] = var3_4;
                        v72[1] = var6_3;
                        v72[0] = var2_2;
                        cd_0.d("\u00c1", (Object)v72, (long)-6313544292182792427L, (long)var4_5);
                        var63_50 = cd_0.a("u", (int)24821, (long)(3027978994649654946L ^ var4_5));
                        var64_51 = var62_49 + (var52_33 - 7.5f) / 2.0f;
                        var65_52 = var62_49 + 3.0f;
                        try {
                            if (var47_26 != null) break block169;
                            if (var59_45 != false) {
                            }
                            ** GOTO lbl505
                        }
                        catch (MatchException v73) {
                            throw cd_0.d("\u00c1", (Object)v73, (long)-6313676177467735342L, (long)var4_5);
                        }
                        v74 = new Object[1];
                        v74[0] = var9_7;
                        v75 = new Object[10];
                        v75[9] = var41_23;
                        v75[8] = cd_0.d("\u00c1", (Object)v74, (long)-6311106844961333566L, (long)var4_5);
                        v75[7] = Float.valueOf(7.5f);
                        v75[6] = Float.valueOf(7.5f);
                        v75[5] = Float.valueOf(var64_51);
                        v75[4] = Float.valueOf(var61_48 + this.g - 5.5f - 7.5f);
                        v75[3] = this.c;
                        v75[2] = var3_4;
                        v75[1] = var6_3;
                        v75[0] = var2_2;
                        cd_0.d("\u00c1", (Object)v75, (long)-6313558592077733926L, (long)var4_5);
                        var66_53 = var61_48 + this.g - 18.0f;
                        v76 = new Object[7];
                        v76[6] = var29_17;
                        v76[5] = cn_0.v;
                        v76[4] = Float.valueOf(var62_49 + var52_33 - 3.0f);
                        v76[3] = Float.valueOf(var66_53);
                        v76[2] = Float.valueOf(var62_49 + 3.0f);
                        v76[1] = Float.valueOf(var66_53 - 0.5f);
                        v76[0] = var3_4;
                        cd_0.d("\u00c1", (Object)v76, (long)-6310415849121914951L, (long)var4_5);
                        v77 = new Object[1];
                        v77[0] = var39_22;
                        v78 = new Object[2];
                        v78[1] = var31_18;
                        v78[0] = var63_50;
                        var67_54 = var61_48 + this.g - var54_38 - cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v77, (long)-6310813107073772557L, (long)var4_5), (Object)v78, (long)-6311300661860856609L, (long)var4_5);
                        for (var68_56 = 0; var68_56 < cd_0.d("\u00fc", (Object)var63_50, (long)-6310784287029050275L, (long)var4_5); ++var68_56) {
                            var69_58 = cd_0.d("\u00c1", (char)cd_0.d("\u00fc", (Object)var63_50, (int)var68_56, (long)-6309671507973524533L, (long)var4_5), (long)-6312478630092096206L, (long)var4_5);
                            v79 = new Object[1];
                            v79[0] = var39_22;
                            v80 = new Object[1];
                            v80[0] = var9_7;
                            v81 = new Object[4];
                            v81[3] = var13_9;
                            v81[2] = (int)(cd_0.c("p", (int)8732, (long)(3922465085610832719L ^ var4_5)) + (cd_0.d("\u00fc", (Object)var63_50, (long)-6310784287029050275L, (long)var4_5) - true - var68_56));
                            v81[1] = (int)cd_0.c("p", (int)6154, (long)(4939530797405440346L ^ var4_5));
                            v81[0] = cd_0.d("\u00c1", (Object)v80, (long)-6311106844961333566L, (long)var4_5);
                            v82 = new Object[6];
                            v82[5] = var43_24;
                            v82[4] = cd_0.d("\u00c1", (Object)v81, (long)-6313907579475244834L, (long)var4_5);
                            v82[3] = Float.valueOf(var65_52);
                            v82[2] = Float.valueOf(var67_54);
                            v82[1] = var69_58;
                            v82[0] = var3_4;
                            cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v79, (long)-6310813107073772557L, (long)var4_5), (Object)v82, (long)-6312944372894033037L, (long)var4_5);
                            v83 = new Object[1];
                            v83[0] = var39_22;
                            v84 = new Object[2];
                            v84[1] = var31_18;
                            v84[0] = var69_58;
                            var67_54 += cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v83, (long)-6310813107073772557L, (long)var4_5), (Object)v84, (long)-6311300661860856609L, (long)var4_5);
                            try {
                                if (var47_26 == null) {
                                    if (var47_26 == null) continue;
                                    break;
                                }
                                break block170;
                            }
                            catch (MatchException v85) {
                                throw cd_0.d("\u00c1", (Object)v85, (long)-6313676177467735342L, (long)var4_5);
                            }
                        }
                        try {
                            if (var47_26 == null) break block170;
lbl505:
                            // 2 sources

                            v86 = new Object[1];
                            v86[0] = var9_7;
                            v87 = new Object[10];
                            v87[9] = var41_23;
                            v87[8] = cd_0.d("\u00c1", (Object)v86, (long)-6311106844961333566L, (long)var4_5);
                            v87[7] = Float.valueOf(7.5f);
                            v87[6] = Float.valueOf(7.5f);
                            v87[5] = Float.valueOf(var64_51);
                            v87[4] = Float.valueOf(var61_48 + 5.5f);
                            v87[3] = this.c;
                            v87[2] = var3_4;
                            v87[1] = var6_3;
                            v87[0] = var2_2;
                            cd_0.d("\u00c1", (Object)v87, (long)-6313558592077733926L, (long)var4_5);
                        }
                        catch (MatchException v88) {
                            throw cd_0.d("\u00c1", (Object)v88, (long)-6313676177467735342L, (long)var4_5);
                        }
                    }
                    var66_53 = var61_48 + 5.5f + 7.5f + 5.0f;
                    v89 = new Object[7];
                    v89[6] = var29_17;
                    v89[5] = cn_0.v;
                    v89[4] = Float.valueOf(var62_49 + var52_33 - 3.0f);
                    v89[3] = Float.valueOf(var66_53 + 0.5f);
                    v89[2] = Float.valueOf(var62_49 + 3.0f);
                    v89[1] = Float.valueOf(var66_53);
                    v89[0] = var3_4;
                    cd_0.d("\u00c1", (Object)v89, (long)-6310415849121914951L, (long)var4_5);
                    var67_54 = var61_48 + var54_38;
                    for (var68_56 = 0; var68_56 < cd_0.d("\u00fc", (Object)var63_50, (long)-6310784287029050275L, (long)var4_5); ++var68_56) {
                        var69_58 = cd_0.d("\u00c1", (char)cd_0.d("\u00fc", (Object)var63_50, (int)var68_56, (long)-6309671507973524533L, (long)var4_5), (long)-6312478630092096206L, (long)var4_5);
                        v90 = new Object[1];
                        v90[0] = var39_22;
                        v91 = new Object[1];
                        v91[0] = var9_7;
                        v92 = new Object[4];
                        v92[3] = var13_9;
                        v92[2] = (int)(cd_0.c("p", (int)8732, (long)(3922465085610832719L ^ var4_5)) + var68_56);
                        v92[1] = (int)cd_0.c("p", (int)8732, (long)(3922465085610832719L ^ var4_5));
                        v92[0] = cd_0.d("\u00c1", (Object)v91, (long)-6311106844961333566L, (long)var4_5);
                        v93 = new Object[6];
                        v93[5] = var43_24;
                        v93[4] = cd_0.d("\u00c1", (Object)v92, (long)-6313907579475244834L, (long)var4_5);
                        v93[3] = Float.valueOf(var65_52);
                        v93[2] = Float.valueOf(var67_54);
                        v93[1] = var69_58;
                        v93[0] = var3_4;
                        cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v90, (long)-6310813107073772557L, (long)var4_5), (Object)v93, (long)-6312944372894033037L, (long)var4_5);
                        v94 = new Object[1];
                        v94[0] = var39_22;
                        v95 = new Object[2];
                        v95[1] = var31_18;
                        v95[0] = var69_58;
                        var67_54 += cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v94, (long)-6310813107073772557L, (long)var4_5), (Object)v95, (long)-6311300661860856609L, (long)var4_5);
                        try {
                            if (var47_26 == null) {
                                if (var47_26 == null) continue;
                                break;
                            }
                            break block171;
                        }
                        catch (MatchException v96) {
                            throw cd_0.d("\u00c1", (Object)v96, (long)-6313676177467735342L, (long)var4_5);
                        }
                    }
                }
                try {
                    if (var58_43 == false) break block171;
                    v97 = var62_49 - 3.0f - var53_36;
                    break block172;
                }
                catch (MatchException v98) {
                    throw cd_0.d("\u00c1", (Object)v98, (long)-6313676177467735342L, (long)var4_5);
                }
            }
            v97 = var62_49 + var52_33 + 3.0f;
        }
        var66_53 = v97;
        var67_55 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)this.a, (long)-6313397640050804970L, (long)var4_5), (long)-6311061581400362752L, (long)var4_5);
        while (cd_0.d("\u00fc", (Object)var67_55, (long)-6313335842019414206L, (long)var4_5) != false) {
            block193: {
                block191: {
                    block190: {
                        block189: {
                            block186: {
                                block188: {
                                    block187: {
                                        block184: {
                                            block185: {
                                                block183: {
                                                    block196: {
                                                        block182: {
                                                            block181: {
                                                                block179: {
                                                                    block180: {
                                                                        block177: {
                                                                            block178: {
                                                                                block195: {
                                                                                    block194: {
                                                                                        block175: {
                                                                                            block176: {
                                                                                                block173: {
                                                                                                    var68_57 = (c_)cd_0.d("\u00fc", (Object)var67_55, (long)-6310695855786828822L, (long)var4_5);
                                                                                                    try {
                                                                                                        try {
                                                                                                            v99 = var68_57.g;
                                                                                                            if (var47_26 != null) break block173;
                                                                                                            if (v99 < 0.02f) {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        catch (MatchException v100) {
                                                                                                            throw cd_0.d("\u00c1", (Object)v100, (long)-6313676177467735342L, (long)var4_5);
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException v101) {
                                                                                                        throw cd_0.d("\u00c1", (Object)v101, (long)-6313676177467735342L, (long)var4_5);
                                                                                                    }
                                                                                                    v99 = var68_57.g;
                                                                                                }
                                                                                                var69_59 = v99;
                                                                                                var70_60 = (int)(255.0f * var69_59);
                                                                                                var71_61 = var66_53;
                                                                                                var72_62 = (1.0f - var69_59) * 6.0f;
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var47_26 != null) break block175;
                                                                                                        if (!(var69_59 > 0.7f)) break block176;
                                                                                                    }
                                                                                                    catch (MatchException v102) {
                                                                                                        throw cd_0.d("\u00c1", (Object)v102, (long)-6313676177467735342L, (long)var4_5);
                                                                                                    }
                                                                                                    v103 = new Object[10];
                                                                                                    v103[9] = var7_6;
                                                                                                    v103[8] = Float.valueOf(4.0f);
                                                                                                    v103[7] = 5;
                                                                                                    v103[6] = Float.valueOf((float)var53_36);
                                                                                                    v103[5] = Float.valueOf(this.g);
                                                                                                    v103[4] = Float.valueOf(var71_61);
                                                                                                    v103[3] = Float.valueOf(var61_48);
                                                                                                    v103[2] = var3_4;
                                                                                                    v103[1] = var6_3;
                                                                                                    v103[0] = var2_2;
                                                                                                    cd_0.d("\u00c1", (Object)v103, (long)-6316773123640284997L, (long)var4_5);
                                                                                                }
                                                                                                catch (MatchException v104) {
                                                                                                    throw cd_0.d("\u00c1", (Object)v104, (long)-6313676177467735342L, (long)var4_5);
                                                                                                }
                                                                                            }
                                                                                            v105 = new Object[3];
                                                                                            v105[2] = var33_19;
                                                                                            v105[1] = (int)((float)cd_0.d("\u00fc", (Object)cn_0.r, (long)-6310945584627213117L, (long)var4_5) * var69_59);
                                                                                            v105[0] = cn_0.r;
                                                                                            v106 = new Object[10];
                                                                                            v106[9] = var25_15;
                                                                                            v106[8] = Float.valueOf(4.0f);
                                                                                            v106[7] = cd_0.d("\u00c1", (Object)v105, (long)-6313820588576777132L, (long)var4_5);
                                                                                            v106[6] = Float.valueOf((float)var53_36);
                                                                                            v106[5] = Float.valueOf(this.g);
                                                                                            v106[4] = Float.valueOf(var71_61);
                                                                                            v106[3] = Float.valueOf(var61_48);
                                                                                            v106[2] = var3_4;
                                                                                            v106[1] = var6_3;
                                                                                            v106[0] = var2_2;
                                                                                            cd_0.d("\u00c1", (Object)v106, (long)-6313544292182792427L, (long)var4_5);
                                                                                        }
                                                                                        v107 = new Object[2];
                                                                                        v107[1] = var17_11;
                                                                                        v107[0] = var68_57;
                                                                                        var73_63 = cd_0.d("\u00fc", (Object)this, (Object)v107, (long)-6309551875238792571L, (long)var4_5);
                                                                                        v108 = new Object[1];
                                                                                        v108[0] = var39_22;
                                                                                        v109 = new Object[2];
                                                                                        v109[1] = var31_18;
                                                                                        v109[0] = var68_57.a;
                                                                                        var74_64 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v108, (long)-6310813107073772557L, (long)var4_5), (Object)v109, (long)-6311300661860856609L, (long)var4_5) * 0.9f;
                                                                                        v110 = new Object[1];
                                                                                        v110[0] = var39_22;
                                                                                        v111 = new Object[2];
                                                                                        v111[1] = var31_18;
                                                                                        v111[0] = var73_63;
                                                                                        var75_65 = cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v110, (long)-6310813107073772557L, (long)var4_5), (Object)v111, (long)-6311300661860856609L, (long)var4_5) * 0.9f;
                                                                                        var76_66 = var71_61 + (var53_36 - 2.0f - var51_31 * 0.9f) / 2.0f;
                                                                                        if (var59_45 == false) break block194;
                                                                                        var77_67 = var61_48 + this.g - 5.5f - var74_64 - var72_62;
                                                                                        var78_68 = var61_48 + 5.5f;
                                                                                        if (var47_26 == null) break block195;
                                                                                    }
                                                                                    var77_67 = var61_48 + 5.5f + var72_62;
                                                                                    var78_68 = var61_48 + this.g - 5.5f - var75_65;
                                                                                }
                                                                                try {
                                                                                    v112 = new Object[1];
                                                                                    v112[0] = var39_22;
                                                                                    v113 = new Object[3];
                                                                                    v113[2] = var33_19;
                                                                                    v113[1] = var70_60;
                                                                                    v113[0] = cn_0.s;
                                                                                    v114 = new Object[7];
                                                                                    v114[6] = var45_25;
                                                                                    v114[5] = cd_0.d("\u00c1", (Object)v113, (long)-6313820588576777132L, (long)var4_5);
                                                                                    v114[4] = Float.valueOf(0.9f);
                                                                                    v114[3] = Float.valueOf(var76_66);
                                                                                    v114[2] = Float.valueOf(var77_67);
                                                                                    v114[1] = var68_57.a;
                                                                                    v114[0] = var3_4;
                                                                                    cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v112, (long)-6310813107073772557L, (long)var4_5), (Object)v114, (long)-6316340593708319879L, (long)var4_5);
                                                                                    v115 = var68_57;
                                                                                    if (var47_26 != null) break block177;
                                                                                    if (v115.b == null) break block178;
                                                                                }
                                                                                catch (MatchException v116) {
                                                                                    throw cd_0.d("\u00c1", (Object)v116, (long)-6313676177467735342L, (long)var4_5);
                                                                                }
                                                                                v117 = new Object[2];
                                                                                v117[1] = var11_8;
                                                                                v117[0] = var68_57.b;
                                                                                var79_70 = cd_0.d("\u00fc", (Object)this, (Object)v117, (long)-6313225409798366479L, (long)var4_5);
                                                                                var80_72 = var51_31 * 0.65f + 1.5f;
                                                                                try {
                                                                                    v118 = var59_45 != false ? var77_67 - 3.0f - var79_70 : var77_67 + var74_64 + 3.0f;
                                                                                }
                                                                                catch (MatchException v119) {
                                                                                    throw cd_0.d("\u00c1", (Object)v119, (long)-6313676177467735342L, (long)var4_5);
                                                                                }
                                                                                var81_73 = v118;
                                                                                var82_76 = var71_61 + (var53_36 - 2.0f - var80_72) / 2.0f;
                                                                                v120 = new Object[3];
                                                                                v120[2] = var33_19;
                                                                                v120[1] = (int)(70.0f * var69_59);
                                                                                v120[0] = var68_57.c;
                                                                                v121 = new Object[8];
                                                                                v121[7] = var19_12;
                                                                                v121[6] = new Vector4f(3.0f);
                                                                                v121[5] = cd_0.d("\u00c1", (Object)v120, (long)-6313820588576777132L, (long)var4_5);
                                                                                v121[4] = Float.valueOf(var82_76 + var80_72);
                                                                                v121[3] = Float.valueOf(var81_73 + var79_70);
                                                                                v121[2] = Float.valueOf(var82_76);
                                                                                v121[1] = Float.valueOf(var81_73);
                                                                                v121[0] = var3_4;
                                                                                cd_0.d("\u00c1", (Object)v121, (long)-6313184097212180376L, (long)var4_5);
                                                                                v122 = new Object[1];
                                                                                v122[0] = var39_22;
                                                                                v123 = new Object[3];
                                                                                v123[2] = var33_19;
                                                                                v123[1] = var70_60;
                                                                                v123[0] = var68_57.c;
                                                                                v124 = new Object[7];
                                                                                v124[6] = var45_25;
                                                                                v124[5] = cd_0.d("\u00c1", (Object)v123, (long)-6313820588576777132L, (long)var4_5);
                                                                                v124[4] = Float.valueOf(0.65f);
                                                                                v124[3] = Float.valueOf(var82_76 + 0.75f);
                                                                                v124[2] = Float.valueOf(var81_73 + 2.0f);
                                                                                v124[1] = var68_57.b;
                                                                                v124[0] = var3_4;
                                                                                cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v122, (long)-6310813107073772557L, (long)var4_5), (Object)v124, (long)-6316340593708319879L, (long)var4_5);
                                                                            }
                                                                            v115 = var68_57;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v125 = v115.f;
                                                                                if (var47_26 != null) break block179;
                                                                                if (v125 == 0) break block180;
                                                                            }
                                                                            catch (MatchException v126) {
                                                                                throw cd_0.d("\u00c1", (Object)v126, (long)-6313676177467735342L, (long)var4_5);
                                                                            }
                                                                            v127 /* !! */  = (int)cd_0.c("p", (int)7372, (long)(3759490641970367876L ^ var4_5));
                                                                            break block181;
                                                                        }
                                                                        catch (MatchException v128) {
                                                                            throw cd_0.d("\u00c1", (Object)v128, (long)-6313676177467735342L, (long)var4_5);
                                                                        }
                                                                    }
                                                                    v125 = var68_57.d;
                                                                }
                                                                v127 /* !! */  = v125 / cd_0.c("p", (int)23851, (long)(5099448443444612212L ^ var4_5));
                                                            }
                                                            var79_69 /* !! */  = v127 /* !! */ ;
                                                            try {
                                                                v129 /* !! */  = var79_69 /* !! */ ;
                                                                v130 /* !! */  = 5;
                                                                if (var47_26 != null) break block182;
                                                                if (v129 /* !! */  <= v130 /* !! */ ) {
                                                                }
                                                                ** GOTO lbl785
                                                            }
                                                            catch (MatchException v131) {
                                                                throw cd_0.d("\u00c1", (Object)v131, (long)-6313676177467735342L, (long)var4_5);
                                                            }
                                                            var81_74 = (int)(170.0 + 85.0 * cd_0.d("\u00c1", (double)((double)cd_0.d("\u00c1", (long)-6309688116715675825L, (long)var4_5) * 0.012), (long)-6310020744960722175L, (long)var4_5));
                                                            var80_71 = new Color((int)cd_0.c("p", (int)2252, (long)(6890370719735945617L ^ var4_5)), (int)cd_0.c("p", (int)17871, (long)(2927995863281587351L ^ var4_5)), (int)cd_0.c("p", (int)8044, (long)(1663308242630610493L ^ var4_5)), (int)((float)cd_0.d("\u00c1", (int)var81_74, (int)cd_0.c("p", (int)9317, (long)(7722827948230751539L ^ var4_5)), (long)-6309802198160158857L, (long)var4_5) * var69_59));
                                                            try {
                                                                if (var47_26 == null) break block183;
lbl785:
                                                                // 2 sources

                                                                v129 /* !! */  = var79_69 /* !! */ ;
                                                                v130 /* !! */  = (int)cd_0.c("p", (int)8732, (long)(3922465085610832719L ^ var4_5));
                                                            }
                                                            catch (MatchException v132) {
                                                                throw cd_0.d("\u00c1", (Object)v132, (long)-6313676177467735342L, (long)var4_5);
                                                            }
                                                        }
                                                        if (v129 /* !! */  > v130 /* !! */ ) break block196;
                                                        var80_71 = new Color((int)cd_0.c("p", (int)9317, (long)(7722827948230751539L ^ var4_5)), (int)cd_0.c("p", (int)28858, (long)(683319352132329966L ^ var4_5)), (int)cd_0.c("p", (int)27579, (long)(4520168664903678690L ^ var4_5)), var70_60);
                                                        if (var47_26 == null) break block183;
                                                    }
                                                    var80_71 = new Color((int)cd_0.c("p", (int)12486, (long)(3565105228711109016L ^ var4_5)), (int)cd_0.c("p", (int)12486, (long)(3565105228711109016L ^ var4_5)), (int)cd_0.c("p", (int)12486, (long)(3565105228711109016L ^ var4_5)), var70_60);
                                                }
                                                try {
                                                    try {
                                                        v133 = new Object[1];
                                                        v133[0] = var39_22;
                                                        v134 = new Object[7];
                                                        v134[6] = var45_25;
                                                        v134[5] = var80_71;
                                                        v134[4] = Float.valueOf(0.9f);
                                                        v134[3] = Float.valueOf(var76_66);
                                                        v134[2] = Float.valueOf(var78_68);
                                                        v134[1] = var73_63;
                                                        v134[0] = var3_4;
                                                        cd_0.d("\u00fc", (Object)cd_0.d("\u00fc", (Object)cd_0.d("F", (long)-6313115333197389673L, (long)var4_5), (Object)v133, (long)-6310813107073772557L, (long)var4_5), (Object)v134, (long)-6316340593708319879L, (long)var4_5);
                                                        v135 = var68_57.f;
                                                        if (var47_26 != null) break block184;
                                                        if (v135 == 0) break block185;
                                                    }
                                                    catch (MatchException v136) {
                                                        throw cd_0.d("\u00c1", (Object)v136, (long)-6313676177467735342L, (long)var4_5);
                                                    }
                                                    v137 /* !! */  = 1.0f;
                                                    break block186;
                                                }
                                                catch (MatchException v138) {
                                                    throw cd_0.d("\u00c1", (Object)v138, (long)-6313676177467735342L, (long)var4_5);
                                                }
                                            }
                                            v135 = var68_57.e;
                                        }
                                        try {
                                            try {
                                                if (var47_26 != null) break block187;
                                                if (v135 <= 0) break block188;
                                            }
                                            catch (MatchException v139) {
                                                throw cd_0.d("\u00c1", (Object)v139, (long)-6313676177467735342L, (long)var4_5);
                                            }
                                            v135 = var68_57.d;
                                        }
                                        catch (MatchException v140) {
                                            throw cd_0.d("\u00c1", (Object)v140, (long)-6313676177467735342L, (long)var4_5);
                                        }
                                    }
                                    v141 = new Object[4];
                                    v141[3] = var21_13;
                                    v141[2] = Float.valueOf(1.0f);
                                    v141[1] = Float.valueOf(0.0f);
                                    v141[0] = Float.valueOf((float)v135 / (float)var68_57.e);
                                    v137 /* !! */  = (float)cd_0.d("\u00c1", (Object)v141, (long)-6310540034457681918L, (long)var4_5);
                                    break block186;
                                }
                                v137 /* !! */  = 0.0f;
                            }
                            var81_73 = v137 /* !! */ ;
                            var82_76 = var71_61 + var53_36 - 1.9f;
                            var83_77 = var71_61 + var53_36 - 1.15f;
                            var84_78 = (this.g - 4.0f) * var81_73;
                            try {
                                if (var79_69 /* !! */  > 5) break block189;
                                v142 = new Object[3];
                                v142[2] = var33_19;
                                v142[1] = (int)(200.0f * var69_59);
                                v142[0] = new Color((int)cd_0.c("p", (int)12486, (long)(3565105228711109016L ^ var4_5)), (int)cd_0.c("p", (int)8044, (long)(1663308242630610493L ^ var4_5)), (int)cd_0.c("p", (int)8044, (long)(1663308242630610493L ^ var4_5)));
                                v143 = cd_0.d("\u00c1", (Object)v142, (long)-6313820588576777132L, (long)var4_5);
                                break block190;
                            }
                            catch (MatchException v144) {
                                throw cd_0.d("\u00c1", (Object)v144, (long)-6313676177467735342L, (long)var4_5);
                            }
                        }
                        v145 = new Object[3];
                        v145[2] = var33_19;
                        v145[1] = (int)(160.0f * var69_59);
                        v145[0] = var68_57.c;
                        v143 = cd_0.d("\u00c1", (Object)v145, (long)-6313820588576777132L, (long)var4_5);
                    }
                    var85_79 = v143;
                    try {
                        block192: {
                            try {
                                try {
                                    v146 = var3_4;
                                    v147 = var61_48 + 2.0f;
                                    v148 = var82_76;
                                    v149 = var61_48 + this.g - 2.0f;
                                    v150 = var83_77;
                                    v151 = new Color((int)cd_0.c("p", (int)9317, (long)(7722827948230751539L ^ var4_5)), (int)cd_0.c("p", (int)9317, (long)(7722827948230751539L ^ var4_5)), (int)cd_0.c("p", (int)9317, (long)(7722827948230751539L ^ var4_5)), (int)(18.0f * var69_59));
                                    if (var47_26 != null) break block191;
                                    v152 = new Object[7];
                                    v152[6] = var29_17;
                                    v152[5] = v151;
                                    v152[4] = Float.valueOf(v150);
                                    v152[3] = Float.valueOf(v149);
                                    v152[2] = Float.valueOf(v148);
                                    v152[1] = Float.valueOf(v147);
                                    v152[0] = v146;
                                    cd_0.d("\u00c1", (Object)v152, (long)-6310415849121914951L, (long)var4_5);
                                    if (var59_45 == false) break block192;
                                }
                                catch (MatchException v153) {
                                    throw cd_0.d("\u00c1", (Object)v153, (long)-6313676177467735342L, (long)var4_5);
                                }
                                v154 = new Object[7];
                                v154[6] = var29_17;
                                v154[5] = var85_79;
                                v154[4] = Float.valueOf(var83_77);
                                v154[3] = Float.valueOf(var61_48 + this.g - 2.0f);
                                v154[2] = Float.valueOf(var82_76);
                                v154[1] = Float.valueOf(var61_48 + this.g - 2.0f - var84_78);
                                v154[0] = var3_4;
                                cd_0.d("\u00c1", (Object)v154, (long)-6310415849121914951L, (long)var4_5);
                                if (var47_26 == null) break block193;
                            }
                            catch (MatchException v155) {
                                throw cd_0.d("\u00c1", (Object)v155, (long)-6313676177467735342L, (long)var4_5);
                            }
                        }
                        v146 = var3_4;
                        v147 = var61_48 + 2.0f;
                        v148 = var82_76;
                        v149 = var61_48 + 2.0f + var84_78;
                        v150 = var83_77;
                        v151 = var85_79;
                    }
                    catch (MatchException v156) {
                        throw cd_0.d("\u00c1", (Object)v156, (long)-6313676177467735342L, (long)var4_5);
                    }
                }
                v157 = new Object[7];
                v157[6] = var29_17;
                v157[5] = v151;
                v157[4] = Float.valueOf(v150);
                v157[3] = Float.valueOf(v149);
                v157[2] = Float.valueOf(v148);
                v157[1] = Float.valueOf(v147);
                v157[0] = v146;
                cd_0.d("\u00c1", (Object)v157, (long)-6310415849121914951L, (long)var4_5);
            }
            try {
                v158 = var66_53;
                v159 = var58_43 != false ? -1.0f : 1.0f;
            }
            catch (MatchException v160) {
                throw cd_0.d("\u00c1", (Object)v160, (long)-6313676177467735342L, (long)var4_5);
            }
            var66_53 = v158 + v159 * (var53_36 + 3.0f) * var69_59;
            if (var47_26 == null) continue;
        }
    }

    private static Method l(long l, long l2) {
        int n = cd_0.i(l, l2);
        Object object = H[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = I[n];
                int n3 = string2.indexOf(8);
                clazz3 = cd_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cd_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cd_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        cd_0.H[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cd_0.j(1641391514846929L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cd_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cd_0.H[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cd_0.j(1641391514846929L, 0L);
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

    private String d(Object[] objectArray) {
        CallSite callSite;
        block3: {
            long l;
            long l2;
            c_ c_2;
            block2: {
                c_2 = (c_)objectArray[0];
                l2 = (Long)objectArray[1];
                l = (l2 = v ^ l2) ^ 0x7BA14946246FL;
                try {
                    if (!c_2.f) break block2;
                    callSite = cd_0.a("u", (int)13192, (long)(0x3F94D62051655EA2L ^ l2));
                    break block3;
                }
                catch (MatchException matchException) {
                    throw cd_0.d("\u00c1", (Object)matchException, (long)4833028650281953697L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = c_2.d;
            callSite = cd_0.d("\u00fc", (Object)this, (Object)objectArray2, (long)4834390983766608301L, (long)l2);
        }
        return callSite;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = v ^ l;
        return new Color((int)cd_0.d("\u00fc", (Object)color, (long)6030264214452365298L, (long)l), (int)cd_0.d("\u00fc", (Object)color, (long)6027175247010896041L, (long)l), (int)cd_0.d("\u00fc", (Object)color, (long)6028899549419885183L, (long)l), (int)cd_0.d("\u00c1", (int)0, (int)cd_0.d("\u00c1", (int)n, (int)cd_0.c("p", (int)26258, (long)(0x2821536765C28C06L ^ l)), (long)6029320940086146228L, (long)l), (long)6029818613699548366L, (long)l));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E24;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cd", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            cd_0.x[n2] = cd_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cd_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(100.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        cd_0.d("\u00fc", (Object)this, (Object)objectArray2, (long)-3382233880191878967L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = cd_0.i(l, l2);
        Object object = H[n];
        if (object instanceof String) {
            String string = I[n];
            int n2 = string.indexOf(8);
            Class clazz = cd_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cd_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cd_0.e(clazz3, string2, clazz2)) != null) {
                    cd_0.H[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cd_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cd_0.H[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cd_0.j(1641391514846929L, 0L);
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
            int n = cd_0.i(l, l2);
            object = H[n];
            try {
                if (!(object instanceof String)) break block2;
                cd_0.H[n] = clazz = Class.forName(I[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static c_ lambda$renderNew$0(class_1291 class_12912) {
        long l = v ^ 0xD85B755818BL;
        long l2 = l ^ 0x1CBED3F633D3L;
        return new c_(l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cd_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cd_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cd_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


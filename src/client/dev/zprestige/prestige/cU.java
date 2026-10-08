/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cX;
import dev.zprestige.prestige.cY;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.VarHandle;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import sun.misc.Unsafe;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class cU {
    public static final Unsafe a;
    private static final Map b;
    private static final Map c;
    private static final long j;
    private static final String[] k;
    private static final String[] l;
    private static final Map m;
    private static final long[] q;
    private static final Integer[] r;
    private static final Map s;
    private static final long[] w;
    private static final Long[] x;
    private static final Map y;
    private static final Object[] z;
    private static final String[] A;

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                cU.j = hc.a(3321537380041781443L, 7945999420547717237L, MethodHandles.lookup().lookupClass()).a(226049620002047L);
                                var31 = cU.j ^ 79346810498198L;
                                cU.z = new Object[122];
                                cU.A = new String[122];
                                cU.a();
                                cU.m = new HashMap<K, V>(13);
                                var22_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var31 >>> 56);
                                for (var23_2 = 1; var23_2 < 8; ++var23_2) {
                                    v2 = v2;
                                    v2[var23_2] = (byte)(var31 << var23_2 * 8 >>> 56);
                                }
                                var22_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var29_3 = new String[15];
                                var27_4 = 0;
                                var26_5 = "l\f\u00c2\u009d\u00da\u00e2\u00f9\u0096w\u00bds\u00a6\u001e\u0083F\u00f4\f\u00b1X\u00af\"\u0000\u00dei\u0005\u00e6\u00f9\b\u00ff\u0016\u0012J\u00a0\u00aex-\u0004O\u00d1Z\u00c4_\u00ba\u00f0Z\u00f1\u007fy\u000eq\u00c1{sY\u009f'0\u0012n\u00fe\u00c5'\u00e1\u00d8`\u00cb\u00c0\u00b8b\u00a0&!o\u00c0\u0093\u0081{\u000e\u009dC\u0014\b\\\u001f\u0018\u00a2\u00e6\u0097\u000f\u0007u\u001d\u00fb\u009e\u0081!\u001d\u0081\u00abPO\u00f9\u008b \u008a \u0082\u0080\u0002k\u00a65Ge\u00d3\u008f\u00c9\u00b4u+*\u00f7\u00d7eX\u008c\"\u00d5Z\u0093\u0014\u00b7\u0013\u00ebr\u00fe\u00c1$0fps_:sqH1\u008b4,\u008b\u001b%\u0018Kh-#,\u00a4\u00a5#uaj \u0010\u0083\u00a3\u0089\u00d4\u009c\u00ed\u00f3Fhme\u00c9\t\u00d2i$\u0088\u009e\u0097 \u0087W\u00bbe\u009cI\u00a3W\f\u007f\u0094\\\u00a0\u00b3\u00b1\\N\u0000\u0084F\u00bb%\u00ccA56\u0081\u00d2\u00eaX,\u0006@\u00cc\u00d2\u00f9\u009cz\u00c3\\/\u0084\u0085\u00b2\u00d9\u0089\u009bS\u000b\u0089\u00be0\u00cd\u008ci_\u00ab\u001f\u00dcA\u00ed\u001bk\u00b2\u00ef\u00d6\u00a1\u00d4\u009d\u00fb%\u00f5\u00c3\u00d5e\u00fa\u0090\u00d5\u009a5\u001e\u00e37\u0005n\u00e1d\u0091\u00fd\u00bf\u00bc\u00f7P\u00c0\u0010 ]\u0010\u00fe3Y\u0087\u00af\u00aa\u00e2w.\u00e4s\u00cb\u00d3\u00e3{\u0087(g\u00ac\u00a14\u00eb\u00a8F\u00a4l\u0092\u0015.6\u00c5E\u00ca\u00cd\u0086\u00ddB\u0083n\u00df\u00ddz\u001f\u00fb\u00929\u00d6D\u00c6\u008c\u00d8\u0087p\u009f\u008d\u008c\u00bc 3K\u00f5\u00b8\u0091\u0081\u0013?3\u0093SQVb\u0003zK\u00ef 3\u0003[\u009d\u00ab\u00a77Rxf\u00c4\u00a9\u00fa8i\u00de\u0002\u00ce\u008c\u008a|a\u008e*E@*\u00e6\u0010\\\u00dc6\u001b7\u009e\u00cf\u009dmV$\u00a0OC\u008b\u008a\u00eej\u00b8:Z\u0019j\u00a07S\u00e6\u0015x\u00d0\u00cd*\u00a6m\u00b9^\u00b6\u0085a\u00fa\u00d8 \u00cb\u0004Vv\u00d48Y\u009b\u00c0Y,\u00dc\u00f2\u0099\u00dd\u00aa\u0014\u00f19\u00f1\u0003\u00b3\u008f\u00bb\u00cb\u00ddO\u0096\u00cf\u00e6\u00ff0 \u0082w\u000eNO\u00b9\u0093k\n\u0013)A\u0002\u00df.\u00c0&gj\u0092\u00a8\u00b0\u00ecP;}$}\u00c6\u008f\u0088C(\u0084\u00cd\u00db\u00f1\u0091\u001b$I\u00d2\u0003\u0096<\u00e5\u00ac\u0013\u001b\u0094\u00f5\u00df\u0010qQ\u00c9\u001b\u00c6\u00bf\u00fe\u00057\u00d7\u00a3\u00e3\u001a\u0099OS\u00d9\u001b\u00b0\u00cf";
                                var28_6 = "l\f\u00c2\u009d\u00da\u00e2\u00f9\u0096w\u00bds\u00a6\u001e\u0083F\u00f4\f\u00b1X\u00af\"\u0000\u00dei\u0005\u00e6\u00f9\b\u00ff\u0016\u0012J\u00a0\u00aex-\u0004O\u00d1Z\u00c4_\u00ba\u00f0Z\u00f1\u007fy\u000eq\u00c1{sY\u009f'0\u0012n\u00fe\u00c5'\u00e1\u00d8`\u00cb\u00c0\u00b8b\u00a0&!o\u00c0\u0093\u0081{\u000e\u009dC\u0014\b\\\u001f\u0018\u00a2\u00e6\u0097\u000f\u0007u\u001d\u00fb\u009e\u0081!\u001d\u0081\u00abPO\u00f9\u008b \u008a \u0082\u0080\u0002k\u00a65Ge\u00d3\u008f\u00c9\u00b4u+*\u00f7\u00d7eX\u008c\"\u00d5Z\u0093\u0014\u00b7\u0013\u00ebr\u00fe\u00c1$0fps_:sqH1\u008b4,\u008b\u001b%\u0018Kh-#,\u00a4\u00a5#uaj \u0010\u0083\u00a3\u0089\u00d4\u009c\u00ed\u00f3Fhme\u00c9\t\u00d2i$\u0088\u009e\u0097 \u0087W\u00bbe\u009cI\u00a3W\f\u007f\u0094\\\u00a0\u00b3\u00b1\\N\u0000\u0084F\u00bb%\u00ccA56\u0081\u00d2\u00eaX,\u0006@\u00cc\u00d2\u00f9\u009cz\u00c3\\/\u0084\u0085\u00b2\u00d9\u0089\u009bS\u000b\u0089\u00be0\u00cd\u008ci_\u00ab\u001f\u00dcA\u00ed\u001bk\u00b2\u00ef\u00d6\u00a1\u00d4\u009d\u00fb%\u00f5\u00c3\u00d5e\u00fa\u0090\u00d5\u009a5\u001e\u00e37\u0005n\u00e1d\u0091\u00fd\u00bf\u00bc\u00f7P\u00c0\u0010 ]\u0010\u00fe3Y\u0087\u00af\u00aa\u00e2w.\u00e4s\u00cb\u00d3\u00e3{\u0087(g\u00ac\u00a14\u00eb\u00a8F\u00a4l\u0092\u0015.6\u00c5E\u00ca\u00cd\u0086\u00ddB\u0083n\u00df\u00ddz\u001f\u00fb\u00929\u00d6D\u00c6\u008c\u00d8\u0087p\u009f\u008d\u008c\u00bc 3K\u00f5\u00b8\u0091\u0081\u0013?3\u0093SQVb\u0003zK\u00ef 3\u0003[\u009d\u00ab\u00a77Rxf\u00c4\u00a9\u00fa8i\u00de\u0002\u00ce\u008c\u008a|a\u008e*E@*\u00e6\u0010\\\u00dc6\u001b7\u009e\u00cf\u009dmV$\u00a0OC\u008b\u008a\u00eej\u00b8:Z\u0019j\u00a07S\u00e6\u0015x\u00d0\u00cd*\u00a6m\u00b9^\u00b6\u0085a\u00fa\u00d8 \u00cb\u0004Vv\u00d48Y\u009b\u00c0Y,\u00dc\u00f2\u0099\u00dd\u00aa\u0014\u00f19\u00f1\u0003\u00b3\u008f\u00bb\u00cb\u00ddO\u0096\u00cf\u00e6\u00ff0 \u0082w\u000eNO\u00b9\u0093k\n\u0013)A\u0002\u00df.\u00c0&gj\u0092\u00a8\u00b0\u00ecP;}$}\u00c6\u008f\u0088C(\u0084\u00cd\u00db\u00f1\u0091\u001b$I\u00d2\u0003\u0096<\u00e5\u00ac\u0013\u001b\u0094\u00f5\u00df\u0010qQ\u00c9\u001b\u00c6\u00bf\u00fe\u00057\u00d7\u00a3\u00e3\u001a\u0099OS\u00d9\u001b\u00b0\u00cf".length();
                                var25_7 = 56;
                                var24_8 = -1;
lbl32:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_8;
                                    v4 = var26_5.substring(v3, v3 + var25_7);
                                    v5 = -1;
                                    break block23;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = cU.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    var26_5 = ";\u001ap\u0003\u00f0_q\u00ac\u0089j\u00b2\u00ad\u00c32\u00d7M(.B\u0081c\u00fb9\u0001\u00c4\u0012\u00ed\u00c5\u009a^\u009a\u00c5\u00b07>\u0007\u0004\u0085\u00cf|\u00f5\u00df\u001eG^\u00f8(\u00f3\u00ae\u00b0\u0081\u000ex\u00db\u0003\u00970";
                                    var28_6 = ";\u001ap\u0003\u00f0_q\u00ac\u0089j\u00b2\u00ad\u00c32\u00d7M(.B\u0081c\u00fb9\u0001\u00c4\u0012\u00ed\u00c5\u009a^\u009a\u00c5\u00b07>\u0007\u0004\u0085\u00cf|\u00f5\u00df\u001eG^\u00f8(\u00f3\u00ae\u00b0\u0081\u000ex\u00db\u0003\u00970".length();
                                    var25_7 = 16;
                                    var24_8 = -1;
lbl46:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_8;
                                        v4 = var26_5.substring(v6, v6 + var25_7);
                                        v5 = 0;
                                        break block23;
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = cU.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    break block24;
                                    break;
                                }
                            }
                            var30_9 = var22_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        cU.k = var29_3;
                        cU.l = new String[15];
                        cU.s = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[15];
                        var14_13 = 0;
                        var15_14 = "*\u00c4L\u00ce\u00ea\u00ae\u0015\u00ac*0\u0006\u0014\u00ec\u00b2\u00e0\u0003\u00eeP1\n-\u00bc\u00b6\u008a[kl\u00cd}p\u00b3y.\u008cW](I\u007f0\u00d6C\u00c8\u00afy\u0012:BQ\u00c5\u00ddv\u0091\u009c\u00fe\u00a4\u00bcpz\u008a\u00a2C\u00daB\u0017W\u00c6Q\u000bF=,+\u00a9x #\u00b8\u00c5\u00f2\u0090\u00e4=\u00d6;\u00e3\u008f\u0083\u0095\u00c3\u000fX\u00ea\u0007\u00a2\u00e8\u00dc\u001c\u001f\\\u00bbu]\u00a9";
                        var16_15 = "*\u00c4L\u00ce\u00ea\u00ae\u0015\u00ac*0\u0006\u0014\u00ec\u00b2\u00e0\u0003\u00eeP1\n-\u00bc\u00b6\u008a[kl\u00cd}p\u00b3y.\u008cW](I\u007f0\u00d6C\u00c8\u00afy\u0012:BQ\u00c5\u00ddv\u0091\u009c\u00fe\u00a4\u00bcpz\u008a\u00a2C\u00daB\u0017W\u00c6Q\u000bF=,+\u00a9x #\u00b8\u00c5\u00f2\u0090\u00e4=\u00d6;\u00e3\u008f\u0083\u0095\u00c3\u000fX\u00ea\u0007\u00a2\u00e8\u00dc\u001c\u001f\\\u00bbu]\u00a9".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block25;
                            break;
                        }
lbl102:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "A\u0017\u0090 \u00e0A`\r\u00f8\u00c6\u000f\u00fbX\u00fd\u00af\u0099";
                            var16_15 = "A\u0017\u0090 \u00e0A`\r\u00f8\u00c6\u000f\u00fbX\u00fd\u00af\u0099".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block25;
                                break;
                            }
                            break;
                        }
lbl121:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block26;
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
                cU.q = var17_12;
                cU.r = new Integer[15];
                cU.y = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[3];
                var3_23 = 0;
                var4_24 = "\u00fb\u00fa\u00ddR\u00d9\u008e9\u001b>w\u00b1\u0013\u00e9\u00dd\u00d6_]dD\u00ebE\r6B";
                var5_25 = "\u00fb\u00fa\u00ddR\u00d9\u008e9\u001b>w\u00b1\u0013\u00e9\u00dd\u00d6_]dD\u00ebE\r6B".length();
                var2_26 = 0;
                while (true) {
                    break block27;
                    break;
                }
lbl165:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block28;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        cU.w = var6_22;
        cU.x = new Long[3];
        cU.b = new ConcurrentHashMap<K, V>();
        cU.c = new ConcurrentHashMap<K, V>();
        var33_30 = null;
        try {
            var34_31 = cU.f("H", Unsafe.class, (Object)cU.a("r", (int)25899, (long)(7336565688438154858L ^ var31)), (long)-4678978751895749309L, (long)var31);
            cU.f("H", (Object)var34_31, (boolean)true, (long)-4677494380025438087L, (long)var31);
            var33_30 = (Unsafe)cU.f("H", (Object)var34_31, null, (long)-4676540270436551825L, (long)var31);
        }
        catch (Throwable var34_32) {
            cU.f("H", (Object)var34_32, (Object)cU.f("x", (long)-4678593680098556493L, (long)var31), (long)-4677029666436313772L, (long)var31);
        }
        cU.a = var33_30;
    }

    private static long e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = cU.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x386A;
        if (x[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])y.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cU", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cU.x[n2] = l4;
        }
        return x[n2];
    }

    protected static cX b(Object[] objectArray) {
        CallSite callSite;
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = j ^ l;
        long l3 = l2 ^ 0x13D936274115L;
        long l4 = l2 ^ 0x1D039EF33F67L;
        long l5 = l2 ^ 0x3C78DEA8FD1EL;
        String string3 = (String)((Object)cU.f("H", (Object)clazz, (long)-7720998892468125199L, (long)l)) + "#" + string + ":" + string2;
        cX cX2 = (cX)((Object)cU.f("H", (Object)b, (Object)string3, (long)-7720527031698661940L, (long)l));
        try {
            if (cX2 != null) {
                return cX2;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw cU.f("T", (Object)classNotFoundException, (long)-7725922886140691519L, (long)l);
        }
        Object object = clazz;
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l5;
            objectArray2[1] = cU.f("H", (Object)clazz, (long)-7725991938328226534L, (long)l);
            objectArray2[0] = string2;
            callSite = cU.f("T", (Object)objectArray2, (long)-7726771339817160515L, (long)l);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException((String)((Object)cU.a("r", (int)5947, (long)(0x14F3DDFD82B5BFA1L ^ l))) + string2, classNotFoundException);
        }
        while (object != null) {
            try {
                Object object2;
                VarHandle varHandle;
                CallSite callSite2;
                CallSite callSite3;
                block24: {
                    callSite3 = cU.f("H", (Object)object, (Object)string, (long)-7726620558630513002L, (long)l);
                    if (cU.f("H", (Object)cU.f("H", (Object)callSite3, (long)-7724288105969029907L, (long)l), (Object)callSite, (long)-7724036147663305302L, (long)l) == false) {
                        CallSite callSite4 = cU.f("T", (Object)cU.f("H", (Object)callSite3, (long)-7724288105969029907L, (long)l), (long)-7727491308743667487L, (long)l);
                        CallSite callSite5 = cU.f("T", (Object)callSite, (long)-7727491308743667487L, (long)l);
                        String string4 = string;
                        CallSite callSite6 = cU.f("T", (Object)object, (long)-7727491308743667487L, (long)l);
                        throw new RuntimeException((String)((Object)cU.a("r", (int)24758, (long)(0x542654E1F6B8482AL ^ l))) + (String)((Object)callSite6) + "." + string4 + (String)((Object)cU.a("r", (int)28700, (long)(0x528AEDEEC0EBD887L ^ l))) + (String)((Object)callSite5) + (String)((Object)cU.a("r", (int)17635, (long)(0x150E043CD14B6C76L ^ l))) + (String)((Object)callSite4));
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = callSite3;
                    cU.f("T", (Object)objectArray3, (long)-7725413106530114298L, (long)l);
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l4;
                    objectArray4[0] = callSite3;
                    cU.f("T", (Object)objectArray4, (long)-7727997450017774002L, (long)l);
                    callSite2 = cU.f("T", (int)cU.f("H", (Object)callSite3, (long)-7724724499698595110L, (long)l), (long)-7726869528990476948L, (long)l);
                    varHandle = null;
                    try {
                        VarHandle varHandle2;
                        MethodHandles.Lookup lookup;
                        Object object3;
                        try {
                            object3 = cU.d(-7724615314015291361L, l).invoke(null, cU.b());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            lookup = (MethodHandles.Lookup)cU.d(-7720862603190347684L, l).invoke(null, cU.a(object, object3));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        object2 = lookup;
                        if (callSite2 != false) {
                            VarHandle varHandle3;
                            try {
                                varHandle3 = (VarHandle)cU.d(-7726214209308419419L, l).invoke(object2, cU.a(object, (Object)string, cU.f("H", (Object)callSite3, (long)-7724288105969029907L, (long)l)));
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            varHandle = varHandle3;
                            break block24;
                        }
                        try {
                            varHandle2 = (VarHandle)cU.d(-7724789998938391704L, l).invoke(object2, cU.a(object, (Object)string, cU.f("H", (Object)callSite3, (long)-7724288105969029907L, (long)l)));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        varHandle = varHandle2;
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (a == null) {
                    cX2 = new cX((Field)((Object)callSite3), (boolean)callSite2, null, (long)cU.e("y", (int)598, (long)(0x5D234689E714AEE9L ^ l)), varHandle);
                } else if (callSite2 != false) {
                    object2 = cU.f("H", (Object)a, (Object)callSite3, (long)-7725492414795383358L, (long)l);
                    CallSite callSite7 = cU.f("H", (Object)a, (Object)callSite3, (long)-7720321027493863847L, (long)l);
                    cX2 = new cX((Field)((Object)callSite3), true, object2, (long)callSite7, varHandle);
                } else {
                    CallSite callSite8 = cU.f("H", (Object)a, (Object)callSite3, (long)-7726492647824753019L, (long)l);
                    cX2 = new cX((Field)((Object)callSite3), false, null, (long)callSite8, varHandle);
                }
                cU.f("H", (Object)b, (Object)string3, (Object)cX2, (long)-7720629786405113410L, (long)l);
                return cX2;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                object = cU.f("H", (Object)object, (long)-7720391209988692553L, (long)l);
            }
        }
        throw new RuntimeException((String)((Object)cU.a("r", (int)30244, (long)(0x4869A57932025EBCL ^ l))) + (String)((Object)cU.f("T", (Object)clazz, (long)-7727491308743667487L, (long)l)) + "." + string);
    }

    private static Class b(Object[] objectArray) {
        Class<?> clazz = (Class<?>)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = j ^ l;
        try {
            if (n == 0) {
                return clazz;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cU.f("T", (Object)runtimeException, (long)289712758176049932L, (long)l);
        }
        Class<?> clazz2 = clazz;
        for (int i = 0; i < n; ++i) {
            clazz2 = cU.f("T", (Object)clazz2, (int)0, (long)294972037458684590L, (long)l).getClass();
        }
        return clazz2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cU.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cU.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object[] b() {
        return new Object[0];
    }

    protected static cY b(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = j ^ l;
        long l3 = l2 ^ 0x56637B540743L;
        long l4 = l2 ^ 0x2539B9E01B7AL;
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l3;
            objectArray2[1] = cU.f("H", (Object)clazz, (long)6738504416962796638L, (long)l);
            objectArray2[0] = string2;
            CallSite callSite = cU.f("T", (Object)objectArray2, (long)6737498759572245133L, (long)l);
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l4;
            objectArray3[2] = callSite;
            objectArray3[1] = string;
            objectArray3[0] = clazz;
            return cU.f("T", (Object)objectArray3, (long)6738433663809566148L, (long)l);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException((String)((Object)cU.a("r", (int)31525, (long)(0x900AFDB8F5B1AFFL ^ l))) + string2, classNotFoundException);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cU.a(l, l2);
            object = z[n];
            try {
                if (!(object instanceof String)) break block2;
                cU.z[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cU.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cU.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D98;
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
                throw new RuntimeException("dev/zprestige/prestige/cU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cU.r[n2] = n3;
        }
        return r[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cU.c(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/cU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = cU.a(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = cU.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cU.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cU.a(clazz3, string2, clazz2)) != null) {
                    cU.z[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cU.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cU.z[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cU.b(940151290468754L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Exception decompiling
     */
    private static Class c(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = cU.a(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = cU.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cU.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cU.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cU.z[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cU.b(940151290468754L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cU.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cU.z[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cU.b(940151290468754L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fa' || c == '\u00d5' || c == 'x' || c == '\u00c6') {
                field = cU.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cU.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    protected static cY a(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        Class[] classArray = (Class[])objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = j ^ l;
        long l3 = l2 ^ 0x2B0CF8C700BCL;
        long l4 = l2 ^ 0x9F7943E7661L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = classArray;
        String string2 = (String)((Object)cU.f("H", (Object)clazz, (long)-3066748211572998056L, (long)l)) + "#" + string + ":" + (String)((Object)cU.f("T", (Object)objectArray2, (long)-3070148844474632171L, (long)l));
        cY cY2 = (cY)((Object)cU.f("H", (Object)c, (Object)string2, (long)-3066365014179013531L, (long)l));
        try {
            if (cY2 != null) {
                return cY2;
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw cU.f("T", (Object)noSuchMethodException, (long)-3071108855935681944L, (long)l);
        }
        Object object = clazz;
        while (object != null) {
            try {
                MethodHandle methodHandle;
                MethodHandles.Lookup lookup;
                Object object2;
                CallSite callSite = cU.f("H", (Object)object, (Object)string, (Object)classArray, (long)-3069729429449386634L, (long)l);
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l3;
                objectArray3[0] = callSite;
                cU.f("T", (Object)objectArray3, (long)-3071198346723957585L, (long)l);
                try {
                    object2 = cU.d(-3069872088359421514L, l).invoke(null, cU.b());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lookup = (MethodHandles.Lookup)cU.d(-3066735243754104331L, l).invoke(null, cU.a(object, object2));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                MethodHandles.Lookup lookup2 = lookup;
                try {
                    methodHandle = (MethodHandle)cU.d(-3068921724437047187L, l).invoke((Object)lookup2, cU.a(callSite));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                MethodHandle methodHandle2 = methodHandle;
                CallSite callSite2 = cU.f("T", (int)cU.f("H", (Object)callSite, (long)-3071365758299383700L, (long)l), (long)-3067622254820207419L, (long)l);
                cY2 = new cY((Method)((Object)callSite), methodHandle2, (boolean)callSite2);
                cU.f("H", (Object)c, (Object)string2, (Object)cY2, (long)-3065850972834779113L, (long)l);
                return cY2;
            }
            catch (IllegalAccessException | NoSuchMethodException reflectiveOperationException) {
                for (CallSite callSite : cU.f("H", (Object)object, (long)-3071454389886295144L, (long)l)) {
                    try {
                        if (cU.f("H", (Object)cU.f("H", (Object)callSite, (long)-3068354292860665901L, (long)l), (Object)string, (long)-3068118043381883347L, (long)l) == false) {
                            continue;
                        }
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        throw cU.f("T", (Object)noSuchMethodException, (long)-3071108855935681944L, (long)l);
                    }
                    try {
                        if (cU.f("H", (Object)callSite, (long)-3068808963731104221L, (long)l) != classArray.length) {
                            continue;
                        }
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        throw cU.f("T", (Object)noSuchMethodException, (long)-3071108855935681944L, (long)l);
                    }
                    int n = 1;
                    CallSite callSite3 = cU.f("H", (Object)callSite, (long)-3067790282397727417L, (long)l);
                    int n2 = 0;
                    while (true) {
                        block33: {
                            try {
                                if (n2 >= ((CallSite)callSite3).length) break;
                                if (cU.f("H", (Object)callSite3[n2], (Object)classArray[n2], (long)-3068916254455576012L, (long)l) != false) break block33;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                throw cU.f("T", (Object)noSuchMethodException, (long)-3071108855935681944L, (long)l);
                            }
                            n = 0;
                            break;
                        }
                        ++n2;
                    }
                    try {
                        if (n == 0) {
                            continue;
                        }
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        throw cU.f("T", (Object)noSuchMethodException, (long)-3071108855935681944L, (long)l);
                    }
                    try {
                        MethodHandle methodHandle;
                        MethodHandles.Lookup lookup;
                        Object object3;
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l3;
                        objectArray4[0] = callSite;
                        cU.f("T", (Object)objectArray4, (long)-3071198346723957585L, (long)l);
                        try {
                            object3 = cU.d(-3069872088359421514L, l).invoke(null, cU.b());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            lookup = (MethodHandles.Lookup)cU.d(-3066735243754104331L, l).invoke(null, cU.a(object, object3));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        MethodHandles.Lookup lookup3 = lookup;
                        try {
                            methodHandle = (MethodHandle)cU.d(-3068921724437047187L, l).invoke((Object)lookup3, cU.a(callSite));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        MethodHandle methodHandle3 = methodHandle;
                        CallSite callSite4 = cU.f("T", (int)cU.f("H", (Object)callSite, (long)-3071365758299383700L, (long)l), (long)-3067622254820207419L, (long)l);
                        cY2 = new cY((Method)((Object)callSite), methodHandle3, (boolean)callSite4);
                        cU.f("H", (Object)c, (Object)string2, (Object)cY2, (long)-3065850972834779113L, (long)l);
                        return cY2;
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                object = cU.f("H", (Object)object, (long)-3066228088251407330L, (long)l);
            }
        }
        CallSite callSite = cU.f("T", (Object)classArray, (long)-3068075970721579573L, (long)l);
        String string3 = string;
        CallSite callSite5 = cU.f("T", (Object)clazz, (long)-3068262732638056120L, (long)l);
        throw new RuntimeException((String)((Object)cU.a("r", (int)4682, (long)(0x5B733E41C3837B74L ^ l))) + (String)((Object)callSite5) + "." + string3 + (String)((Object)callSite));
    }

    public static void a(Object[] objectArray) {
        Field field = (Field)objectArray[0];
        long l = (Long)objectArray[1];
        l = j ^ l;
        try {
            CallSite callSite = cU.f("H", Field.class, (Object)cU.a("r", (int)9912, (long)(0x2D2FAC98417B22D5L ^ l)), (long)4050352559455976038L, (long)l);
            cU.f("H", (Object)callSite, (boolean)true, (long)4049686078274283356L, (long)l);
            CallSite callSite2 = cU.f("H", (Object)field, (long)4052248204960065066L, (long)l);
            try {
                if ((callSite2 & cU.c("j", (int)8856, (long)(0x4D5983F8B082F72CL ^ l))) != 0) {
                    cU.f("H", (Object)callSite, (Object)field, (int)(callSite2 & cU.c("j", (int)22522, (long)(0x3217F2E1CA628246L ^ l))), (long)4050528405246383125L, (long)l);
                }
            }
            catch (Throwable throwable) {
                throw cU.f("T", (Object)throwable, (long)4051053470318024497L, (long)l);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
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

    /*
     * Unable to fully structure code
     */
    protected static cX a(Object[] var0) {
        block21: {
            block20: {
                var1_1 = (Class)var0[0];
                var4_2 = (String)var0[1];
                var2_3 = (Long)var0[2];
                v0 = var2_3 = cU.j ^ var2_3;
                var5_4 = v0 ^ 133172850120418L;
                var7_5 = v0 ^ 131683977832592L;
                var10_6 = (String)cU.f("H", (Object)var1_1, (long)229378662897243654L, (long)var2_3) + "#" + var4_2;
                var11_7 = (cX)cU.f("H", (Object)cU.b, (Object)var10_6, (long)228636117166410299L, (long)var2_3);
                var9_8 = cU.f("T", (long)230998681990102846L, (long)var2_3);
                try {
                    v1 = var11_7;
                    if (var9_8 != null) break block20;
                    if (v1 == null) break block21;
                }
                catch (Throwable v2) {
                    throw cU.f("T", (Object)v2, (long)234020974378249270L, (long)var2_3);
                }
                v1 = var11_7;
            }
            return v1;
        }
        try {
            block23: {
                block24: {
                    block22: {
                        var12_9 = cU.f("H", (Object)var1_1, (Object)var4_2, (long)230507448582177121L, (long)var2_3);
                        v3 = new Object[2];
                        v3[1] = var5_4;
                        v3[0] = var12_9;
                        cU.f("T", (Object)v3, (long)233830330655290097L, (long)var2_3);
                        v4 = new Object[2];
                        v4[1] = var7_5;
                        v4[0] = var12_9;
                        cU.f("T", (Object)v4, (long)231875474620117433L, (long)var2_3);
                        var13_11 = cU.f("T", (int)cU.f("H", (Object)var12_9, (long)232825131099938093L, (long)var2_3), (long)230756556922159771L, (long)var2_3);
                        var14_12 = null;
                        try {
                            try {
                                v5 = cU.d(233005806849159144L, var2_3).invoke(null, cU.b());
                            }
                            catch (InvocationTargetException v6) {
                                throw v6.getTargetException();
                            }
                            try {
                                v7 = (MethodHandles.Lookup)cU.d(229286215041830827L, var2_3).invoke(null, cU.a(var1_1, v5));
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                            var15_13 = v7;
                            if (var13_11 != false) {
                                try {
                                    v9 = (VarHandle)cU.d(230127625548533074L, var2_3).invoke(var15_13, cU.a((Object)var1_1, (Object)var4_2, cU.f("H", (Object)var12_9, (long)232702990429682458L, (long)var2_3)));
                                }
                                catch (InvocationTargetException v10) {
                                    throw v10.getTargetException();
                                }
                                var14_12 = v9;
                                break block22;
                            }
                            try {
                                v11 = (VarHandle)cU.d(232888296521526431L, var2_3).invoke(var15_13, cU.a((Object)var1_1, (Object)var4_2, cU.f("H", (Object)var12_9, (long)232702990429682458L, (long)var2_3)));
                            }
                            catch (InvocationTargetException v12) {
                                throw v12.getTargetException();
                            }
                            var14_12 = v11;
                        }
                        catch (Throwable var15_14) {
                            // empty catch block
                        }
                    }
                    if (cU.a != null) ** GOTO lbl73
                    var11_7 = new cX((Field)var12_9, (boolean)var13_11, null, (long)cU.e("y", (int)5331, (long)(1584579081060036504L ^ var2_3)), var14_12);
                    try {
                        if (var9_8 == null) break block23;
lbl73:
                        // 2 sources

                        if (var13_11 == false) break block24;
                    }
                    catch (Throwable v13) {
                        throw cU.f("T", (Object)v13, (long)234020974378249270L, (long)var2_3);
                    }
                    var15_13 = cU.f("H", (Object)cU.a, (Object)var12_9, (long)233874176483453493L, (long)var2_3);
                    var16_16 = cU.f("H", (Object)cU.a, (Object)var12_9, (long)228700800043731374L, (long)var2_3);
                    var11_7 = new cX((Field)var12_9, true, var15_13, (long)var16_16, var14_12);
                    if (var9_8 == null) break block23;
                }
                var15_15 = cU.f("H", (Object)cU.a, (Object)var12_9, (long)230406063499209074L, (long)var2_3);
                var11_7 = new cX((Field)var12_9, false, null, (long)var15_15, var14_12);
            }
            cU.f("H", (Object)cU.b, (Object)var10_6, (Object)var11_7, (long)229044605378520649L, (long)var2_3);
            return var11_7;
        }
        catch (NoSuchFieldException var12_10) {
            throw new RuntimeException((String)cU.a("r", (int)1224, (long)(3038913218593438638L ^ var2_3)) + (String)cU.f("T", (Object)var1_1, (long)231096862787094294L, (long)var2_3) + "." + var4_2, var12_10);
        }
    }

    private static Object[] a(Object object) {
        return new Object[]{object};
    }

    private static Object[] a(Object object, Object object2) {
        return new Object[]{object, object2};
    }

    private static Object[] a(Object object, Object object2, Object object3) {
        return new Object[]{object, object2, object3};
    }

    public static AccessibleObject a(Object[] objectArray) {
        AccessibleObject accessibleObject = (AccessibleObject)objectArray[0];
        long l = (Long)objectArray[1];
        l = j ^ l;
        try {
            if (a == null) {
                cU.f("H", (Object)accessibleObject, (boolean)true, (long)5066373353533043701L, (long)l);
                return accessibleObject;
            }
        }
        catch (Throwable throwable) {
            throw cU.f("T", (Object)throwable, (long)5064919487438858563L, (long)l);
        }
        try {
            cU.f("H", (Object)a, (Object)accessibleObject, (long)cU.e("y", (int)2963, (long)(0x5339772886B075AFL ^ l)), (boolean)true, (long)5062502079128816223L, (long)l);
            return accessibleObject;
        }
        catch (Throwable throwable) {
            try {
                cU.f("H", (Object)accessibleObject, (boolean)true, (long)5066373353533043701L, (long)l);
            }
            catch (Throwable throwable2) {
                // empty catch block
            }
            return accessibleObject;
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cU.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static Class a(Object[] objectArray) throws ClassNotFoundException {
        String string = (String)objectArray[0];
        ClassLoader classLoader = (ClassLoader)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = j ^ l;
        long l3 = l2 ^ 0x28F80CFFD8F5L;
        long l4 = l2 ^ 0x7A5EB2D66DD3L;
        try {
            if (string == null) {
                throw new IllegalArgumentException((String)((Object)cU.a("r", (int)31597, (long)(0x71BD988886C0BD77L ^ l))));
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw cU.f("T", (Object)classNotFoundException, (long)-414020202700696248L, (long)l);
        }
        int n = 0;
        int n2 = 0;
        try {
            while (true) {
                try {
                    if (n >= cU.f("H", string, (long)-412099203548371861L, (long)l) || cU.f("H", string, (int)n, (long)-411465959408558612L, (long)l) != cU.c("j", (int)15929, (long)(0x4F49FDB6B09EA9FBL ^ l))) break;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw cU.f("T", (Object)classNotFoundException, (long)-414020202700696248L, (long)l);
                }
                ++n2;
                ++n;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw cU.f("T", (Object)classNotFoundException, (long)-414020202700696248L, (long)l);
        }
        CallSite callSite = cU.f("H", string, (int)n, (long)-411465959408558612L, (long)l);
        if (callSite == cU.c("j", (int)1477, (long)(0x2FB939D7CE279205L ^ l))) {
            CallSite callSite2 = cU.f("H", string, (int)cU.c("j", (int)7224, (long)(0x6198F3B7BA120BF3L ^ l)), (int)n, (long)-408886536880283823L, (long)l);
            CallSite callSite3 = cU.f("H", string, (int)(n + 1), (int)callSite2, (long)-413384597961440040L, (long)l);
            CallSite callSite4 = cU.f("H", (Object)callSite3, (char)cU.c("j", (int)13572, (long)(0x5CA30E5A000C22C5L ^ l)), (char)cU.c("j", (int)11719, (long)(0x491C05263774BA01L ^ l)), (long)-408923062310884758L, (long)l);
            CallSite callSite5 = cU.f("T", (Object)callSite4, (long)-413452141295120815L, (long)l);
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l4;
            objectArray2[1] = n2;
            objectArray2[0] = callSite5;
            return cU.f("T", (Object)objectArray2, (long)-412510336881341633L, (long)l);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        CallSite callSite6 = cU.f("T", (Object)objectArray3, (long)-413863409135035325L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l4;
        objectArray4[1] = n2;
        objectArray4[0] = callSite6;
        return cU.f("T", (Object)objectArray4, (long)-412510336881341633L, (long)l);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C4B;
        if (cU.l[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cU", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            cU.l[n2] = cU.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return cU.l[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cU.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static String a(Object[] objectArray) {
        long l;
        Class[] classArray;
        block7: {
            classArray = (Class[])objectArray[0];
            l = (Long)objectArray[1];
            l = j ^ l;
            try {
                try {
                    if (classArray != null && classArray.length != 0) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw cU.f("T", (Object)runtimeException, (long)3501293122082987934L, (long)l);
                }
                return cU.a("r", (int)27037, (long)(0x488F951154F8655BL ^ l));
            }
            catch (RuntimeException runtimeException) {
                throw cU.f("T", (Object)runtimeException, (long)3501293122082987934L, (long)l);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Class clazz : classArray) {
            CallSite callSite;
            StringBuilder stringBuilder2;
            try {
                stringBuilder2 = stringBuilder;
                callSite = clazz == null ? cU.a("r", (int)13232, (long)(0x6C31C2C710ECBF7DL ^ l)) : cU.f("H", (Object)clazz, (long)3496647021182543278L, (long)l);
            }
            catch (RuntimeException runtimeException) {
                throw cU.f("T", (Object)runtimeException, (long)3501293122082987934L, (long)l);
            }
            cU.f("H", (Object)cU.f("H", (Object)stringBuilder2, (Object)callSite, (long)3499676118521053662L, (long)l), (char)cU.c("j", (int)27068, (long)(0x67D4C7794CF34A4L ^ l)), (long)3501620595551901655L, (long)l);
        }
        return cU.f("H", (Object)stringBuilder, (long)3503372992395269896L, (long)l);
    }

    private static void a() {
        Object[] objectArray = z;
        z[0] = "\u001e\u001dc\u001f{g\b\u001dfEhp\u001fVeCdd\u000e\u0011rT/v2";
        objectArray[1] = "##OG#\u000eV\u0003DH2A+\u001bWO;\bC";
        objectArray[2] = "\u001fwnG]4\u0001\u007ft\b?(\u0006b";
        objectArray[3] = "P-H\n\u0006\u0014%\rC\u0005\u0017[D\u0003H\u000e\u0013\u00010";
        objectArray[4] = "\u0001I\u000eTq\u0018ti\u0005[`W\u0015g\u000ePd\ra";
        objectArray[5] = "|,.#[\u0016w#?l&\u000ed$6%";
        objectArray[6] = Integer.TYPE;
        cU.A[6] = "java/lang/Integer";
        objectArray[7] = Character.TYPE;
        cU.A[7] = "java/lang/Character";
        objectArray[8] = "(K\u001bn\u000f)#D\n!b)#Y\u001e";
        objectArray[9] = Boolean.TYPE;
        cU.A[9] = "java/lang/Boolean";
        objectArray[10] = "ne\u0002wyMej\u00138\u0014Mew\u0007Z8@`a\u0006";
        objectArray[11] = "9#\u001c+J\r/#\u0019qY\u001a8h\u001awU\u000e)/\r`\u001e\u001e\b";
        objectArray[12] = "\fJ\u0017K$\u001ayj\u001cD5U\u0018d\u0017O1\u000fl";
        objectArray[13] = " \tSY5\u0016+\u0006B\u0016T\u0018 \rFL";
        objectArray[14] = "=*b+z~6%sd\u0000z%$c+6~2";
        objectArray[15] = "zx)|\u0019\u001d\u000fX\"s\bRnV)x\f\b\u001a";
        objectArray[16] = "]~\u0019^2>Vq\b\u0011u<Ap\u0004Z2\u001fRk\u0007Px\u001aVq\u000bSy!\u0013S\u0000Pw'G";
        objectArray[17] = "\"\u0007\u0001O4\u007f)\b\u0010\u0000s}>\t\u001cK4E)\u0014?Otw$\u0003";
        objectArray[18] = "\u0007\u0018\u001dD\u007f;\f\u0017\f\u000b89\u001b\u0016\u0000@\u007f\u001a\b\r\u0003J5\u001f\f\u0017\u000fI4$";
        objectArray[19] = "\u0014\u0018{OB_\u001f\u0017j\u0000\u001eV\u0018\u0015hM\u0018\u001d8\u0010hB\b";
        objectArray[20] = "\u0002s9!'U\u001c{#nDA\u0018";
        objectArray[21] = "zXmXZ}zN-#YghKf";
        objectArray[22] = Long.TYPE;
        cU.A[22] = "java/lang/Long";
        objectArray[23] = "@\u001ceR\u0000|5<n]\u00113T2eV\u0015i ";
        objectArray[24] = Void.TYPE;
        cU.A[24] = "java/lang/Void";
        objectArray[25] = "2\u001a`u\u0002XG:kz\u0013\u0017&4`q\u0017MR";
        objectArray[26] = "N3\u001a\u0011\u000bWE<\u000b^W^B>\t\u0013Q\u0015e1\u000f\u0015VHM0\u0000\u0015jYN7\u000f\u0004";
        objectArray[27] = "L\u0001\u0018'\u0000?G\u000e\th\\6@\f\u000b%Z}k\u000f\n/H:C\u0012";
        objectArray[28] = "2\u0015riQ]9\u001ac&)^1\u0010";
        objectArray[29] = "k(;r\u000eF`'*=sBn;9";
        objectArray[30] = "\u0003J_oUc\bEN 2a\u001dNNk\t";
        objectArray[31] = "\u001b\u0011h\u0016=\u0002\u0010\u001eyY_\u0001\u001f\u0017";
        objectArray[32] = "^r$x\u0004\u001aU}57l\u001a[r&";
        objectArray[33] = "6:Vo\u000b+=5G a()9Lk";
        objectArray[34] = "\u001b5((<Y\u0010:9gPZ\u001e8;(|";
        objectArray[35] = "(d2c_\u0007#k#,3\u00126`";
        objectArray[36] = "4\fy6x1?\u0003hy\u00155?\u001fn4\"8,";
        objectArray[37] = "Lv:j\u0000'9V1e\u0011hXX:n\u00152,";
        objectArray[38] = "y\u0003Q\tWRo\u0003TSDExHWUHQi\u000f@B\u0003AD";
        objectArray[39] = "t\u0006d)*n\u0001&o&;!`(d-?{\u0014";
        objectArray[40] = "z\u000e7\"\u001fS\u000f.<-\u000e\u001cb.<0\u001a\t";
        objectArray[41] = "jTv4\u00028\u001ft};\u0013w~zv0\u0017-\n";
        objectArray[42] = "\u0014\u0005-\u00064T\u001f\n<IIA\r\u0010>\n";
        objectArray[43] = "e:FTw\f`u`G0\u000b{\bDG<\u0004b";
        objectArray[44] = "\n\u000f`D3[\u0001\u0000q\u000bNC\u0012\u0007xB_B\t\u0002r@o";
        objectArray[45] = "IU\u0003L\r|BZ\u0012\u0003QuEX\u0010NW>bF\u0007LZ";
        objectArray[46] = "}oA\u007f/`\bOJp>/eOJm*:";
        objectArray[47] = "~\f\u0001h\u0014Su\u0003\u0010'HZr\u0001\u0012jN\u0011Y\b\u0003aU[";
        objectArray[48] = "g\u0013)k8\u000f\u00123\"d)@\u007f3\"y=U";
        objectArray[49] = "6Y\u000b0\u000b\u007fCy\u0000?\u001a0\u001fp\u0007=\u0018}\u0019;,4\tv\u0002qZ";
        objectArray[50] = "E^fg,?0~mh=pQpfc9*%";
        objectArray[51] = "\b_\u0011*0n\u0003P\u0000ewl\u0014Q\f.0O\u0007J\u000f$zJ\u0003P\u0003'{";
        objectArray[52] = "g\u0017_hb]y\u001fE'\rZ\u007f\u0017Pz";
        objectArray[53] = "G\u0017q\u001b3|27z\u0014\"3S9q\u001f&i'";
        objectArray[54] = ")\u0003w)\u0003Q/\u0001*jd\u0000zFT~\u0001\u0002\u0017\u0001h.USu\\-([o";
        objectArray[55] = "'T#'s\u0001'U{q\n\u00016Mbsv\u0014\bK{yw\u0001\rJ\u001c$3\u001crK\"\"1A1,vppAr\u0010#}u\tLFv`2Gp\u0013{ezy";
        objectArray[56] = "'xEP,Ez=C^\u0010]qz\u0018\b{J\u001c?@\u0003}NexC\u0004z'!>\u001e\fy^f=\u0019\u000b\u0010\u001cf;M]rA#=Ca";
        objectArray[57] = "+\u000eG#\u001b\u001bvKA-'\u0018v\u0018\u0013b`\u0017\u0010H\u001am\u0016\t`D\u0018+[y,\u0010\u0001#W\t \u0012Gn'Et\u000bObWIvM\u0002\u0012";
        objectArray[58] = "N\u001d?\u007f\u0000}R\u001em39e]\u0003GiB\u007fY\u001amb9=\t\u00198h\u0007;\u000bD{\u000f\u0005gOMv\u007f\te\t\u0000\u0006>\b2\u000f\u001eidF?\n|";
        objectArray[59] = "Ig$RU;[&+Z+3Y*\u001b\u001b\u001az\u001b4tATw\u001eV*\u001b\u001atF9pU\u0017q$g*\u001b\u0014)K=d\u0016\u0011K";
        objectArray[60] = "?\u007fK\u0015|h->D\u001d\u0002w?2t\\3)m,\u001b\u0006}$hNE\\3'0!\u001f\u0012>\"R";
        objectArray[61] = "`\\\u007f\u001c!&~\u000fg\u0015B\u0010RkVw|uf\r|Izw;N";
        objectArray[62] = "r&RR\\\u0002t$\u000f\u0011;S!cl\u0011CQ6tS\u0005@GL!\u000e\t\u0005[r'\fTF<";
        objectArray[63] = "L\u0005+\u0011\u0015ZD\u0019}\u000ey\u001a]\tk\u0014\u0012/@\rs\u0019>\u000fO\u001bz\ty\rB\u0007)KB\u001c\u001c\u001fiu\u0017P_Xi\u000f\b\u0019\u001f\u0019\u0017";
        objectArray[64] = "L\u0019foHq\u0000E\u007f\"w~Q[F6\rxYJb2\rMM_s$wa[A}4\u000ej\u0005M%_";
        objectArray[65] = "imjK\u0011\u0015hgh\u001f}\u0005V/,V\u0012]*+lZ\u0017]VfsA\u001e\u0007/m-MFl";
        objectArray[66] = "S\u0001\u000f\u0000?\u000fNG\u000b\u0019A\u0017JdI\u0017=\u0017Z?\t\u001a>GAO\u0005\u0018x\n1\u0001U\u0011:\rL\u000eR\u0013|v";
        objectArray[67] = "2`AHU#3jC\u001c93\r\"\u0007UVkq&GYSk\r%\u0006A\u0007=3#\u0004\u001cDZ";
        objectArray[68] = "\u000e`8k\u0015oL>u?P\u000eK?_rSoQ7\u00047\u0011\u007fXix3Qs]i\u00045S7\u0006dfh\u00161\bX";
        objectArray[69] = "6\u0017+2\u007f\u000f!\u0011\u007f(\u001e:\u0000.]I _4Hww&]i\u000b";
        objectArray[70] = "]\r]2!:[\u000f\u0000qFk\u000eHta-`\nNU`\be\u000ePT\f}~Z\u0005\u0004n ;\\\u000b8`%c]\n\u0003q{{\u001d4";
        objectArray[71] = "t}I\u007f^\u0004|a\u001f`2Xsz\u0018pNqxu\u0011wuQwc\u0018g2Sz\u007fK%\tB$g\u000b\u001b\\\u000eg \u000baCG'au";
        objectArray[72] = "\"s6lNJ1tpwvl\u0010\u0012\u0004\u000bH\t$t.5N\u000by7";
        objectArray[73] = "\u0003\n\u0015M-G\u0012T\r\r\u0013\u0007\u0002\u00153\u0015o|^XCLq\u0013\u0004\u0016NI\u0013@\u000b\u0016C\u0003cL\tP\u000essL\u0017\u0018\f\t\"\r\tVr";
        objectArray[74] = "i\u0010/F;\u000f9N`\fUI7>*\u0004<DPNh\u000f:\u0004,J(\u0003?\u0004PNh\u000f:\u0004,J(\u0003?\u0004P";
        objectArray[75] = ";\u001d\u0016\u00124cn\u0010\u0013Z\n10\u0011\u0000qv6-\u0016\u0007tc%\u0011\u001e\nFn2QIUO48oOW\u0012w_j\rU\u001b6=7HS\u0015\nah\u0012RM4gjO\u0011*ao.\u001c\u001cXi9!\tl";
        objectArray[76] = "Cj rph\\\"b~LdEhX?7{\u0002p?x'eN";
        objectArray[77] = "9\u0014fk:;z\u0003m?C8<\u0015lc/QyQch*(>RdoC,=\no|)o*\u0001;\u0005";
        objectArray[78] = "9XY\u0013vg8R[G\u001aw\u0006\u001a\u001f\u000eu/z\u001e_\u0002p/\u0006ZA\u0014a$?F\u001d\u001be\u001e";
        objectArray[79] = ",B>n\n\u0006*@c-mW\u007f\u0007\u00104\u0004Ci?<9\u0001Uh{dm\u001dYs\u0019&+\u0000E\u0012";
        objectArray[80] = "\u0000\rg\rr\u001e\u0006\u000f:N\u0015AE}yHtOX]hWxnDSg3+\u0019[\ne\r-\u001b\u0006I\u0002\ruOEO\u007f\u0002rM\u00034";
        objectArray[81] = "\u0019mV7jMU1OzUB\u0004/vn/D\f>Rj/f\u000e.H{U\u0011\r,\u001fw%\u001d\u000fjR\u0007";
        objectArray[82] = "(!\u000b`(p)+\t4D`\u0017cM}+8kg\rq.8\u0017:Et5wmk\u0004j{\t";
        objectArray[83] = "\u000f{V\\xYQy_F\u0013\u007f8Li:-\u001a\f*C\u0004+\u0018Qi";
        objectArray[84] = "r%do\u0013\u007ff2ng(RE\u0001L\u0006\u00167qgf8\u00105,$";
        objectArray[85] = "\u0013d8=^\u0001Ps3i'\u0017\tF#)F\r\u0001\u001dd)\u001eZR\u007f9l\u0018Tn";
        objectArray[86] = "O\u0019\u001aOf\u0010\u0012\\\u001cAZ\u0013\u0012\u000fN\u000e\u001d\u001ct_G\u0001k\u0002\u0004SEG&rH\u0007\\O*\u0002D\u0005\u001a\u0002Z";
        objectArray[87] = "AG\u000f1?K\u0014J\ny\u0001\nMW\u0018ge\u001a@Quy?\u000f\u001b\u0012\u00155c\u0016V-L18N\u0012AIdk\u0005\u0013-";
        objectArray[88] = "QhA<\u0003e\u001d4Xq<jL*\u007feYh!mC5\r9C0\u00063\u0003\u0005";
        objectArray[89] = "0Mxn\\\u007fm\b~``cbS<2's\u000b\u0006pn_\u007fd\\>cZ\u001d0Mxn\\\u007fm\b~``";
        objectArray[90] = "4Q|I1.c\u0000|\fV?'\u000fkN\r;4\u0005nn,.6\u0003\rN-5`\fj\t=+,nm\u0002.6#\u0014<C0x]";
        objectArray[91] = "iSB$n~4\u0016D*Rq+T\u0012q)\u001cc\u0018J*0s9VG/R\"2F\u0000n/-5DF\u0015";
        objectArray[92] = "R+\u000b#\bt\u000fn\r-4}\t8H[H\u0016U5M#DfY7\u000bn4+U3_{MlV4X\u0012";
        objectArray[93] = "69\rn\u001cW'g\u0015.\"\u00177&#;I\u0001!!\u000b:F\u0001Zd\n?Y\u0017'k\r=\u001fl:j\u0012!\\\u0016k+\fo\"";
        objectArray[94] = "RJg\u0011\riZV1\u000ea*BS\u0011\u0012\u00066RF=uPc\u000e\u00109\u001a\n-\u0003\u0015[\u001bP,\u0007Q!\u0004\u0019lF/e\u0015\u000e)DRj\u0012\fo?Ok\r\u0010,E\u001e*\u0013^R";
        objectArray[95] = "\u001cmhz\u001f~N64\u0000\u0005\u0004\ng78\u001du\u0014>:\u0000";
        objectArray[96] = "1hHAc\u0006deM\t]T:d^'4@\u001bkT\u00159W[<\u000b\u001cc]e:\tA :`x\u000bHaX==\rF]\u0004bg\f\u001ec\u0002`:Oy6\n$iB\u000b>\\+|2";
        objectArray[97] = "\u001fn\u0004a>i\u000e0\u001c!\u0000=\u001eq&8l3\u001dl\u000e%{ROi\u001cnp\"CkZ#\u0000";
        objectArray[98] = "\u001c*#lna\u001c+{:\u0017}\u00105\u007f,o\u0019\u001d8fi)%H5c!\u0017";
        objectArray[99] = "\u0003Di|7d\u0012\u001aq<\t0\u0002[\u000es8nPEa)vcU'?s8`\rHe=5eo";
        objectArray[100] = "SHMO^uUJ\u0010\f9%\n\u000bn\u0018\\&mJRH\bw\u000f\u0017\u0017N\u0006KS\u0011G\nB6\\\u0016EL9tP\u0001I\u0010[6\u0016\u001cUq\u0007r\bOOO\u0001pU\f(";
        objectArray[101] = "y2:\u0014\u0007\u0004t01L8\u001bur\u0013NS\rcu;O\\\r\u00180:JC\u001be?=H\u0005`x>\"TF\u001a)\u007f<\u001a8";
        objectArray[102] = "\u0013D\u0011$,'\u0012N\u0013p@7,\u0006W9/oP\u0002\u00175*o,\u0004\u0015qqbNYPw\u007f^";
        objectArray[103] = "A\u001fq@\u007f!PAi\u0000Au@\u0000J\u000f9w-B/\u001b\u007f}\u0013D-F<\u001a";
        objectArray[104] = "\u0013GJOY,\u0014\fD\u0017>H:%fu\u0000-\u000eCLK\u0006/S\u0000";
        objectArray[105] = "\u0011CDm6XRTO9O[\u0014BNe#2W@\u001a2sP\n\u0005\u001c<OO\u0015]Mz%\f\u0002V\u0019\u0003";
        objectArray[106] = "\\\\}\u0007\u001c5\u0006\u0012p\u0002~7\u0014\u0010%\\\u0005Z\\\\}\u0007\u001c5\u0006\u0012p\u0002~d\r\u00027C\u0003k\n\u0000q8";
        objectArray[107] = "g\u0012zL.~:W|B\u0012x1\u000e,\u0001r\u001c`\f<Lbll\u000ez\u0001\u0012";
        objectArray[108] = "l&;\u001d\u00162j$f^qc?c\u0012N\u001ah;e3O4a.\u007f9Oq7(&o\u001f\u0013jm a#\u0001k4|5Z\n58$^SOtb >\u001f\u0013m/\u001f";
        objectArray[109] = "s+\u001c\u001f9,r!\u001eKU?LiZ\u0002:d0m\u001a\u000e?dLn[\u0016k2rhYK(U";
        objectArray[110] = "\u001c\u000f%-%n\u0004T\u007fh\u0019O)jWQ'*\u001d\f}o!(@O";
        objectArray[111] = "\u000b;.G\\V[ea\r2\u0005^0QN\u0003]\r>>\u0014MP\b\\o\u001f]\u0017I!`\u0018_Q2";
        objectArray[112] = "]QpER\u001c\\[r\u0011>\fbC1XE\u0002\u000b\u0014`X\u0000e\u000b\u0015\u007fRY\f\\D\u007f\u0017>";
        objectArray[113] = "\u001aFv)\u0004F\u0000\u001c2:z{.%\u0005BD\u001e\u001aC/|B\u001cG\u0000";
        objectArray[114] = "hy\u0014\f\"iis\u0016XN{W;R\u0011!!+?\u0012\u001d$!W<S\u0005pwi:QX3\u0010";
        objectArray[115] = ",LBe97-K\u0007b\u0007\b\u0018ts\u001a9m,\u0012Y$?oqQ";
        objectArray[116] = "\u001cY0\u0014R\u0003\u001a[mW5RO\u001c\u0019G^YK\u001a8FpP^\u00002FN=S](\u001bZY\u001a\u0007?N5";
        objectArray[117] = "V-T+h>\u001aqMfW1Koi|;?HrAa,^\u001awS*'.\u0016u\u0015gW";
        objectArray[118] = "\u0007v\u007f'6%\u000fj)8Ze\u0016z?\"1P\u000b~'/\u0010w\u0011~C/9yT-x>ga\u0014\u0013rrk!\b|(<f$j";
        objectArray[119] = "\b\u0015zSXZ\t\u001fx\u00074J7W<N[\u0012KS|B^\u00127\u000f8_\u0005\u001cS\u0002:T]#";
        objectArray[120] = " -\u0001f7J&/\\%P\u001ayn\"15\u0019\u001e/\u001eaaH|r[got -\u0001f7J&/\\%P";
        Object[] objectArray2 = objectArray;
        objectArray[121] = "\u001a\u0011<If0GT:GZ)\\\u0001~\u0004 3G\u0004\u0005D>-\u0010\u001buH<k]k9\u001c%cQ\u001b5\u001ec.!P\u007fAknC\r:GeR";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n3] != null) {
            return n3;
        }
        Object object = z[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 16;
            case 1 -> 40;
            case 2 -> 22;
            case 3 -> 10;
            case 4 -> 56;
            case 5 -> 15;
            case 6 -> 4;
            case 7 -> 7;
            case 8 -> 35;
            case 9 -> 49;
            case 10 -> 8;
            case 11 -> 9;
            case 12 -> 19;
            case 13 -> 12;
            case 14 -> 33;
            case 15 -> 48;
            case 16 -> 43;
            case 17 -> 52;
            case 18 -> 27;
            case 19 -> 2;
            case 20 -> 3;
            case 21 -> 24;
            case 22 -> 57;
            case 23 -> 20;
            case 24 -> 61;
            case 25 -> 5;
            case 26 -> 32;
            case 27 -> 59;
            case 28 -> 11;
            case 29 -> 50;
            case 30 -> 38;
            case 31 -> 14;
            case 32 -> 54;
            case 33 -> 62;
            case 34 -> 31;
            case 35 -> 0;
            case 36 -> 13;
            case 37 -> 53;
            case 38 -> 29;
            case 39 -> 18;
            case 40 -> 58;
            case 41 -> 25;
            case 42 -> 42;
            case 43 -> 47;
            case 44 -> 44;
            case 45 -> 6;
            case 46 -> 21;
            case 47 -> 28;
            case 48 -> 17;
            case 49 -> 30;
            case 50 -> 1;
            case 51 -> 63;
            case 52 -> 55;
            case 53 -> 39;
            case 54 -> 46;
            case 55 -> 51;
            case 56 -> 37;
            case 57 -> 60;
            case 58 -> 45;
            case 59 -> 36;
            case 60 -> 34;
            case 61 -> 41;
            case 62 -> 23;
            default -> 26;
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
        cU.A[n3] = new String(cArray);
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Class[] a(Object[] var0) throws ClassNotFoundException {
        block29: {
            block28: {
                block27: {
                    block25: {
                        block26: {
                            var4_1 = (String)var0[0];
                            var3_2 = (ClassLoader)var0[1];
                            var1_3 = (Long)var0[2];
                            v0 = var1_3 = cU.j ^ var1_3;
                            var5_4 = v0 ^ 136026464906220L;
                            var7_5 = v0 ^ 45155662388938L;
                            var9_6 = cU.f("T", (long)-3939649825736903335L, (long)var1_3);
                            try {
                                try {
                                    v1 = var4_1;
                                    if (var9_6 != null) break block25;
                                    if (v1 != null) break block26;
                                }
                                catch (ClassNotFoundException v2) {
                                    throw cU.f("T", (Object)v2, (long)-3938316928668293551L, (long)var1_3);
                                }
                                return new Class[0];
                            }
                            catch (ClassNotFoundException v3) {
                                throw cU.f("T", (Object)v3, (long)-3938316928668293551L, (long)var1_3);
                            }
                        }
                        v1 = var4_1;
                    }
                    var10_7 = cU.f("H", v1, (int)cU.c("j", (int)31999, (long)(4074637983654893610L ^ var1_3)), (long)-3940143245024506508L, (long)var1_3);
                    var11_8 = cU.f("H", var4_1, (int)cU.c("j", (int)17809, (long)(6884424647659544911L ^ var1_3)), (long)-3940143245024506508L, (long)var1_3);
                    try {
                        v4 = var10_7;
                        if (var9_6 != null) break block27;
                        if (v4 >= 0) {
                        }
                        ** GOTO lbl47
                    }
                    catch (ClassNotFoundException v5) {
                        throw cU.f("T", (Object)v5, (long)-3938316928668293551L, (long)var1_3);
                    }
                    v4 = var11_8;
                }
                try {
                    if (var9_6 != null) break block28;
                    if (v4 >= 0) {
                    }
                    ** GOTO lbl47
                }
                catch (ClassNotFoundException v6) {
                    throw cU.f("T", (Object)v6, (long)-3938316928668293551L, (long)var1_3);
                }
                v4 = var11_8;
            }
            try {
                if (v4 >= var10_7) break block29;
lbl47:
                // 3 sources

                throw new IllegalArgumentException((String)cU.a("r", (int)26871, (long)(1463369329867857393L ^ var1_3)) + var4_1);
            }
            catch (ClassNotFoundException v7) {
                throw cU.f("T", (Object)v7, (long)-3938316928668293551L, (long)var1_3);
            }
        }
        var12_9 = cU.f("H", var4_1, (int)(var10_7 + 1), (int)var11_8, (long)-3937817697755777087L, (long)var1_3);
        var13_10 = new ArrayList<E>();
        var14_11 /* !! */  = 0;
        block18: while (true) {
            v8 = var14_11 /* !! */ ;
            v9 = cU.f("H", (Object)var12_9, (long)-3936499317704616078L, (long)var1_3);
            block19: while (v8 < v9) {
                block31: {
                    block30: {
                        var15_12 = 0;
                        while (var14_11 /* !! */  < cU.f("H", (Object)var12_9, (long)-3936499317704616078L, (long)var1_3)) {
                            try {
                                v10 = cU.f("H", (Object)var12_9, (int)var14_11 /* !! */ , (long)-3939665967630995723L, (long)var1_3);
                                if (var9_6 != null) break block30;
                                v9 = cU.c("j", (int)2682, (long)(3639243635644804768L ^ var1_3));
                                if (var9_6 != null) continue block19;
                            }
                            catch (ClassNotFoundException v11) {
                                throw cU.f("T", (Object)v11, (long)-3938316928668293551L, (long)var1_3);
                            }
                            try {
                                if (v10 != v9) break;
                                ++var15_12;
                                ++var14_11 /* !! */ ;
                                if (var9_6 == null) continue;
                                break;
                            }
                            catch (ClassNotFoundException v12) {
                                throw cU.f("T", (Object)v12, (long)-3938316928668293551L, (long)var1_3);
                            }
                        }
                        v10 = cU.f("H", (Object)var12_9, (int)var14_11 /* !! */ , (long)-3939665967630995723L, (long)var1_3);
                    }
                    var16_13 = v10;
                    try {
                        v13 = var16_13;
                        if (var9_6 != null) break block31;
                        if (v13 == cU.c("j", (int)4850, (long)(8533940202753668642L ^ var1_3))) {
                        }
                        ** GOTO lbl102
                    }
                    catch (ClassNotFoundException v14) {
                        throw cU.f("T", (Object)v14, (long)-3938316928668293551L, (long)var1_3);
                    }
                    var17_14 = cU.f("H", (Object)var12_9, (int)cU.c("j", (int)31427, (long)(538038306126454290L ^ var1_3)), (int)var14_11 /* !! */ , (long)-3942333493292389304L, (long)var1_3);
                    var18_16 = cU.f("H", (Object)var12_9, (int)(var14_11 /* !! */  + 1), (int)var17_14, (long)-3937817697755777087L, (long)var1_3);
                    var19_17 = cU.f("H", (Object)var18_16, (char)cU.c("j", (int)3928, (long)(9216362594841832325L ^ var1_3)), (char)cU.c("j", (int)2584, (long)(1985461346987323086L ^ var1_3)), (long)-3942226463287174797L, (long)var1_3);
                    var20_18 = cU.f("T", (Object)var19_17, (boolean)false, (Object)var3_2, (long)-3936851089069905134L, (long)var1_3);
                    v15 = new Object[3];
                    v15[2] = var7_5;
                    v15[1] = var15_12;
                    v15[0] = var20_18;
                    var21_19 = cU.f("T", (Object)v15, (long)-3936379961364711386L, (long)var1_3);
                    cU.f("H", var13_10, (Object)var21_19, (long)-3936266598594543661L, (long)var1_3);
                    var14_11 /* !! */  = (int)(var17_14 + 1);
                    try {
                        if (var9_6 == null) continue block18;
lbl102:
                        // 2 sources

                        v13 = var16_13;
                    }
                    catch (ClassNotFoundException v16) {
                        throw cU.f("T", (Object)v16, (long)-3938316928668293551L, (long)var1_3);
                    }
                }
                v17 = new Object[2];
                v17[1] = var5_4;
                v17[0] = (int)v13;
                var17_15 = cU.f("T", (Object)v17, (long)-3938122844879687846L, (long)var1_3);
                v18 = new Object[3];
                v18[2] = var7_5;
                v18[1] = var15_12;
                v18[0] = var17_15;
                var18_16 = cU.f("T", (Object)v18, (long)-3936379961364711386L, (long)var1_3);
                cU.f("H", var13_10, (Object)var18_16, (long)-3936266598594543661L, (long)var1_3);
                ++var14_11 /* !! */ ;
                if (var9_6 == null) continue block18;
            }
            break;
        }
        return (Class[])cU.f("H", var13_10, (Object)new Class[0], (long)-3938683771118880633L, (long)var1_3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cU.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(cU.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


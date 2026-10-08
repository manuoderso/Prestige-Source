/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_759
 *  net.minecraft.class_759$class_5773
 */
package dev.zprestige.prestige;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class M {
    private final class_759 a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    public M(class_759 class_7592) {
        this.a = class_7592;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        M.b = hc.a(-786231147704650434L, -521789611942335890L, MethodHandles.lookup().lookupClass()).a(122631243159273L);
                        M.i = new Object[100];
                        M.j = new String[100];
                        M.a();
                        M.e = new HashMap<K, V>(13);
                        var11 = M.b ^ 19253404621546L;
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
                        var20_3 = new String[14];
                        var18_4 = 0;
                        var17_5 = "\u008b\u00c7\u008b\u00877\u00f6\u00b6p98\u00af\u0019Yh\u00dd\u00b2\u00a6L\u0019l\u00bcN{\u00f0}\u00c6b\u0018\u00037\u0017X \u000b\u0019oY&\u00a2&R\u00a7\u00c8\u00f124\u0092\u00fd1\u0003m7\u00dc\u0011K\u008a9\u0094J8\u0081\u00a4\u00b1D\u00820u\u00cdW\u0099\u00bb\u00b7\b/\u00b9W\u009bD\u00e3s\u000b3\u0084\u00fa\u008e\u00873\u00d1\u001e/\u00e4\u00a6\u00cc5\u0080\u0088\"\u00fb*{\u00b5\u00a1\u00e9^\u009c\u0088;\u00c1L\u00d2!\u0014>\u00f78\u00cd\u0005\u0003\u00f6\u008cu\r,\u00feM\u001d\u00f6\u00f4\u00e2\u00cf\u00b8#\u0082\u001c>d\u00bc\n\u0099w,Q\u008a\u009fc\u0013\u0089\u00b5\u001e\u0086=\u00f2oT\u0011~\u0016\u00a4\u0080V\u00bc\u00f7\u0004\r\"\u00b3\u00b8\u00cc_\u009b\\( \u00ad\"\u001b\u00f7~-g\u0001\r\u001fe\u00fc{l\u00dbt\u001d\u009c\u00f6\u001e\u00ad;\u0017\u00ccu\u00b5(\u00f3\u00f2NL\u00c2k\f\u0007\u0095\u000b[\u00b50Vq\u00d4\u00db0\u009b\u00cc3\u00be\u0016\u00d0,\u00d7\u00d4\n\u0018\u0001*\u0013\u008e\u00b8\u00c2\u00db\u00af)\u00ce\u0006\u0095\u00ebd\u00c0\u00f0\u00c2\u001f[\u00cb\u008a\u00de\u00b4\u00c4\u00b4&\u0017\u00b4)\u00e9%\u0095(\u00f0\u00ae\u00f6L\u0089\u00e7\u00e3`\b\u00a7E\u0015\u0091\u00danC\u00b7\u0098\u001c\u00af0\u000b{\u00dc\u00a8\u0097n\u00df\u0089\u0081\u0098e\u00efkEm\u0082H\u00ae\u00f5\u0010\u00cb~8H\u00f9e\u00dck\u0089\u0084cQ\u00d5'\u000e\u00058\u00faF\u00a5\u00d4\u0013(MpB\u00ca\u00d2\u0094\u00ed\u00ce\u0018\u0094)\u00e2\u0005\u00f4<W\u001b\u00e2\u00a7\u00b8\u00eaQQ\u0083\u00be~\u00d98\u00ed\u00e2\u00e6\u00de\u00e4LipCZ\u00eb.\u0016\u0017+\u0096\u00c8\u00da\u00b1\u00e3\u00d2#\u0010\u008f\u00fc\u00aa9\u00a3\u0014Y\u00e4\u00e0\u0084Q\u00c1*\u00f3\u0016H(\u00bcP\u00b1\u00002\u0006\u0091l\u00a4+1\u0090\u00efi\u0082A\u009e\u00fe\u0090\u007f\u0098N\u00f5D`\"\u00a9\u00e3\u008e\u00f5\u0016\u00cb\u00a5\u00ca\u0012\u00de0\u00cd\u00ed\u00d2(&\f\u00cd$3\u00f3%&\u009a\u0005\u00f8$\u0086\u0084O\u008c\u0095\u000b\u0083\u000e\u00b5\u0089\u0017e\u00cbT\u0088\u00fd\u00bb\u0001}\u008c\u0092\u00b32\u00cc\u0080\u00f6D\u00fc";
                        var19_6 = "\u008b\u00c7\u008b\u00877\u00f6\u00b6p98\u00af\u0019Yh\u00dd\u00b2\u00a6L\u0019l\u00bcN{\u00f0}\u00c6b\u0018\u00037\u0017X \u000b\u0019oY&\u00a2&R\u00a7\u00c8\u00f124\u0092\u00fd1\u0003m7\u00dc\u0011K\u008a9\u0094J8\u0081\u00a4\u00b1D\u00820u\u00cdW\u0099\u00bb\u00b7\b/\u00b9W\u009bD\u00e3s\u000b3\u0084\u00fa\u008e\u00873\u00d1\u001e/\u00e4\u00a6\u00cc5\u0080\u0088\"\u00fb*{\u00b5\u00a1\u00e9^\u009c\u0088;\u00c1L\u00d2!\u0014>\u00f78\u00cd\u0005\u0003\u00f6\u008cu\r,\u00feM\u001d\u00f6\u00f4\u00e2\u00cf\u00b8#\u0082\u001c>d\u00bc\n\u0099w,Q\u008a\u009fc\u0013\u0089\u00b5\u001e\u0086=\u00f2oT\u0011~\u0016\u00a4\u0080V\u00bc\u00f7\u0004\r\"\u00b3\u00b8\u00cc_\u009b\\( \u00ad\"\u001b\u00f7~-g\u0001\r\u001fe\u00fc{l\u00dbt\u001d\u009c\u00f6\u001e\u00ad;\u0017\u00ccu\u00b5(\u00f3\u00f2NL\u00c2k\f\u0007\u0095\u000b[\u00b50Vq\u00d4\u00db0\u009b\u00cc3\u00be\u0016\u00d0,\u00d7\u00d4\n\u0018\u0001*\u0013\u008e\u00b8\u00c2\u00db\u00af)\u00ce\u0006\u0095\u00ebd\u00c0\u00f0\u00c2\u001f[\u00cb\u008a\u00de\u00b4\u00c4\u00b4&\u0017\u00b4)\u00e9%\u0095(\u00f0\u00ae\u00f6L\u0089\u00e7\u00e3`\b\u00a7E\u0015\u0091\u00danC\u00b7\u0098\u001c\u00af0\u000b{\u00dc\u00a8\u0097n\u00df\u0089\u0081\u0098e\u00efkEm\u0082H\u00ae\u00f5\u0010\u00cb~8H\u00f9e\u00dck\u0089\u0084cQ\u00d5'\u000e\u00058\u00faF\u00a5\u00d4\u0013(MpB\u00ca\u00d2\u0094\u00ed\u00ce\u0018\u0094)\u00e2\u0005\u00f4<W\u001b\u00e2\u00a7\u00b8\u00eaQQ\u0083\u00be~\u00d98\u00ed\u00e2\u00e6\u00de\u00e4LipCZ\u00eb.\u0016\u0017+\u0096\u00c8\u00da\u00b1\u00e3\u00d2#\u0010\u008f\u00fc\u00aa9\u00a3\u0014Y\u00e4\u00e0\u0084Q\u00c1*\u00f3\u0016H(\u00bcP\u00b1\u00002\u0006\u0091l\u00a4+1\u0090\u00efi\u0082A\u009e\u00fe\u0090\u007f\u0098N\u00f5D`\"\u00a9\u00e3\u008e\u00f5\u0016\u00cb\u00a5\u00ca\u0012\u00de0\u00cd\u00ed\u00d2(&\f\u00cd$3\u00f3%&\u009a\u0005\u00f8$\u0086\u0084O\u008c\u0095\u000b\u0083\u000e\u00b5\u0089\u0017e\u00cbT\u0088\u00fd\u00bb\u0001}\u008c\u0092\u00b32\u00cc\u0080\u00f6D\u00fc".length();
                        var16_7 = 32;
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
                            var20_3[var18_4++] = M.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0014\\#'\u00af\u0082Bx\u00c9FP\u00f6g\u00d3\u00b9\u00c3\u00d4\u00f0\u00ee$\u00a0\u00ca\u00b4\u00c3\u0097y\u00ec\u00f7\u00aa.DZ\u00e6\u00f6\r\u008a\u0005PP\u00f48\u00de\u00d9\u0019\u00bc\u0081\u008c>L\u000f\u00f9S\u0013\u008fc\u00d2kF\u00ef<FB\u0091Re\u00b8\u0010\u0097\u0098\u00b8\u00b2_\u000f\u0099\u00ca\u0085\u00f6\u00e2%\u001c\u00a1G\u00cb\u000f\u00fb\u0096\u00d3'_\u00e6\u0093\u00e3\u00d8\u00d0e|/";
                            var19_6 = "\u0014\\#'\u00af\u0082Bx\u00c9FP\u00f6g\u00d3\u00b9\u00c3\u00d4\u00f0\u00ee$\u00a0\u00ca\u00b4\u00c3\u0097y\u00ec\u00f7\u00aa.DZ\u00e6\u00f6\r\u008a\u0005PP\u00f48\u00de\u00d9\u0019\u00bc\u0081\u008c>L\u000f\u00f9S\u0013\u008fc\u00d2kF\u00ef<FB\u0091Re\u00b8\u0010\u0097\u0098\u00b8\u00b2_\u000f\u0099\u00ca\u0085\u00f6\u00e2%\u001c\u00a1G\u00cb\u000f\u00fb\u0096\u00d3'_\u00e6\u0093\u00e3\u00d8\u00d0e|/".length();
                            var16_7 = 40;
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
                            var20_3[var18_4++] = M.a(var21_9).intern();
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
                M.c = var20_3;
                M.d = new String[14];
                M.h = new HashMap<K, V>(13);
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
                var6_12 = new long[12];
                var3_13 = 0;
                var4_14 = "S\u009b*p\u00b8\u0094\u00ca\u009d\u00c8\u00d0\u00ac\u00bfP#\u00dbf%\u0096\u0080\u00d2-\u00b7\u00e0\u00a6\u009a\u0082\u00d3fX\u00bb^6\u0002\u00eeH\u00b9m*S@\u00de\u0003%\u00c1\u00c2\u0081ab\b\u0089U*z\u00b1\u001a\u00f89P\u00cb\u007f\u00f6\t\u00e1a\u0085=\u00edL\u00afabJ\u00a4\u00b3S\u00d79/\u00f0\u0093";
                var5_15 = "S\u009b*p\u00b8\u0094\u00ca\u009d\u00c8\u00d0\u00ac\u00bfP#\u00dbf%\u0096\u0080\u00d2-\u00b7\u00e0\u00a6\u009a\u0082\u00d3fX\u00bb^6\u0002\u00eeH\u00b9m*S@\u00de\u0003%\u00c1\u00c2\u0081ab\b\u0089U*z\u00b1\u001a\u00f89P\u00cb\u007f\u00f6\t\u00e1a\u0085=\u00edL\u00afabJ\u00a4\u00b3S\u00d79/\u00f0\u0093".length();
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
                    var4_14 = "\u00cd\u00c35/y\u0091\u00fb\u000fmqt\u0082\u00ca\u0000\u008d\r";
                    var5_15 = "\u00cd\u00c35/y\u0091\u00fb\u000fmqt\u0082\u00ca\u0000\u008d\r".length();
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
        M.f = var6_12;
        M.g = new Integer[12];
    }

    public void e(Object[] objectArray) {
        class_742 class_7422 = (class_742)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        class_1268 class_12682 = (class_1268)objectArray[3];
        float f11 = ((Float)objectArray[4]).floatValue();
        class_1799 class_17992 = (class_1799)objectArray[5];
        float f12 = ((Float)objectArray[6]).floatValue();
        class_4587 class_45872 = (class_4587)objectArray[7];
        class_4597 class_45972 = (class_4597)objectArray[8];
        int n = (Integer)objectArray[9];
        long l = (Long)objectArray[10];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x1624048D2F0BL;
        long l4 = l2 ^ 0x5E4A8113CEDEL;
        Class[] classArray = new Class[M.b("o", (int)28371, (long)(0xD6A368B217813B7L ^ l))];
        classArray[0] = class_746.class;
        classArray[1] = M.c("q", (long)-1976517090527217177L, (long)l);
        classArray[2] = M.c("q", (long)-1976517090527217177L, (long)l);
        classArray[3] = class_1268.class;
        classArray[4] = M.c("q", (long)-1976517090527217177L, (long)l);
        classArray[5] = class_1799.class;
        classArray[M.b("o", (int)14188, (long)(0x8C57011B268CA09L ^ l))] = M.c("q", (long)-1976517090527217177L, (long)l);
        classArray[M.b("o", (int)7079, (long)(0x1B37C3D24892E6CAL ^ l))] = class_4587.class;
        classArray[M.b("o", (int)197, (long)(0x232ED6513084FDABL ^ l))] = class_4597.class;
        classArray[M.b("o", (int)16931, (long)(0x4216E4D80A01BF44L ^ l))] = M.c("q", (long)-1976087103844686381L, (long)l);
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l4;
        objectArray2[4] = classArray;
        objectArray2[3] = Void.class;
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)5271, (long)(0x639BBE45867A8267L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)-1978612247270749846L, (long)l);
        Object[] objectArray3 = new Object[M.b("o", (int)26191, (long)(0x3EB78AC6B7151B20L ^ l))];
        objectArray3[0] = class_7422;
        objectArray3[1] = M.c("\u00f3", (float)f, (long)-1976590284329469094L, (long)l);
        objectArray3[2] = M.c("\u00f3", (float)f10, (long)-1976590284329469094L, (long)l);
        objectArray3[3] = class_12682;
        objectArray3[4] = M.c("\u00f3", (float)f11, (long)-1976590284329469094L, (long)l);
        objectArray3[5] = class_17992;
        objectArray3[M.b("o", (int)15767, (long)(0x3D4C96ED43E640F5L ^ l))] = M.c("\u00f3", (float)f12, (long)-1976590284329469094L, (long)l);
        objectArray3[M.b("o", (int)25263, (long)(0x28C02C6DF2C49FCEL ^ l))] = class_45872;
        objectArray3[M.b("o", (int)9874, (long)(0x7513A41BAC15BF2L ^ l))] = class_45972;
        objectArray3[M.b("o", (int)11309, (long)(0x1BFCC1D73B55514EL ^ l))] = M.c("\u00f3", (int)n, (long)-1979116615128566494L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l3;
        objectArray4[0] = objectArray3;
        M.c("M", (Object)callSite, (Object)objectArray4, (long)-1978646140234590896L, (long)l);
    }

    public float e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x49A4DD8C1D2L;
        long l4 = l2 ^ 0x711286232C24L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)-7739972719641064989L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)1252, (long)(0x1F3A5315EB68621BL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)-7741536162424319262L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (float)M.c("M", (Object)((Float)((Object)M.c("M", (Object)callSite, (Object)objectArray3, (long)-7742273867116157095L, (long)l))), (long)-7738880543519841509L, (long)l);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19E1;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/M", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            M.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = M.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public class_1799 b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x46C76D53C366L;
        long l4 = l2 ^ 0x334FA6A82E90L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1799.class;
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)11676, (long)(0x366460233A75C9D3L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)-7627747854935617450L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_1799)M.c("M", (Object)callSite, (Object)objectArray3, (long)-7621875433158777363L, (long)l);
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x125146BB7E38L;
        long l4 = l2 ^ 0x250FAB5CAA3CL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)1337080687121600507L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)30297, (long)(0x5202FDEF6CA796BFL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)1335561369346643194L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = M.c("\u00f3", (float)f, (long)1337004467513740614L, (long)l);
        M.c("M", (Object)callSite, (Object)objectArray3, (long)1335991069129384416L, (long)l);
    }

    public float b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0xFA748B9878CL;
        long l4 = l2 ^ 0x7A2F83426A7AL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)-3258322526841483331L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)7255, (long)(0x2E2567F0244FBCFFL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)-3256521593035500356L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (float)M.c("M", (Object)((Float)((Object)M.c("M", (Object)callSite, (Object)objectArray3, (long)-3255009834375765753L, (long)l))), (long)-3258369616708098747L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = M.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = M.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = M.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = M.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = M.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                M.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = M.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = M.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = M.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = M.a(clazz3, string2, clazz2)) != null) {
                    M.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = M.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        M.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = M.b(691212364488424L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public float c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x620F28AA4DDBL;
        long l4 = l2 ^ 0x1787E351A02DL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)1774261318164284906L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)15642, (long)(0x2BB4BF6C49C157E9L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)1772711214332845803L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (float)M.c("M", (Object)((Float)((Object)M.c("M", (Object)callSite, (Object)objectArray3, (long)1766691320492125008L, (long)l))), (long)1770090233986281234L, (long)l);
    }

    public void c(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x5030FCD2C1C6L;
        long l4 = l2 ^ 0x676E113515C2L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1799.class;
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)28254, (long)(0x67C18DFA454F314AL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)-5947390761341441276L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = class_17992;
        M.c("M", (Object)callSite, (Object)objectArray3, (long)-5948086682558095842L, (long)l);
    }

    public void f(Object[] objectArray) {
        block14: {
            Object object;
            float f;
            Object object2;
            CallSite callSite;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            int n;
            class_746 class_7462;
            class_4597 class_45972;
            class_4587 class_45872;
            float f10;
            block16: {
                block15: {
                    CallSite callSite2;
                    class_1268 class_12682;
                    CallSite callSite3;
                    block10: {
                        CallSite callSite4;
                        block11: {
                            Object object3;
                            long l6;
                            long l7;
                            long l8;
                            block13: {
                                block12: {
                                    f10 = ((Float)objectArray[0]).floatValue();
                                    class_45872 = (class_4587)objectArray[1];
                                    class_45972 = (class_4597)objectArray[2];
                                    class_7462 = (class_746)objectArray[3];
                                    n = (Integer)objectArray[4];
                                    l5 = (Long)objectArray[5];
                                    long l9 = l5 = b ^ l5;
                                    l8 = l9 ^ 0x6B4E8AEB0309L;
                                    l7 = l9 ^ 0x11CE2F288F0L;
                                    l4 = l9 ^ 0x5F22EC7688B3L;
                                    l3 = l9 ^ 0x5A5FF0B77E1CL;
                                    long l10 = l9 ^ 0xF77A6FEB2C0L;
                                    l2 = l9 ^ 0xA8380CBFA03L;
                                    l = l9 ^ 0x43E3A521BEE9L;
                                    l6 = l9 ^ 0x48DEA040F8B7L;
                                    callSite3 = M.c("M", (Object)class_7462, (float)f10, (long)8636008821428954352L, (long)l5);
                                    class_12682 = (class_1268)M.c("\u00f3", (Object)M.c("\u00fc", (Object)class_7462, (long)8637094776283970562L, (long)l5), (Object)M.c("q", (long)8636528531727007513L, (long)l5), (long)8637824938109202688L, (long)l5);
                                    callSite = M.c("M", (Object)class_7462, (float)f10, (long)8636098811095801048L, (long)l5);
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l10;
                                    objectArray2[0] = class_7462;
                                    callSite4 = M.c("M", (Object)this, (Object)objectArray2, (long)8636225535483811553L, (long)l5);
                                    CallSite callSite5 = M.c("\u00f3", (float)f10, (float)M.c("\u00fc", (Object)class_7462, (long)8635937636248300465L, (long)l5), (float)M.c("\u00fc", (Object)class_7462, (long)8633653492051634485L, (long)l5), (long)8636370704282697529L, (long)l5);
                                    CallSite callSite6 = M.c("\u00f3", (long)8636305306866561362L, (long)l5);
                                    CallSite callSite7 = M.c("\u00f3", (float)f10, (float)M.c("\u00fc", (Object)class_7462, (long)8637143161201155190L, (long)l5), (float)M.c("\u00fc", (Object)class_7462, (long)8637870541613739626L, (long)l5), (long)8636370704282697529L, (long)l5);
                                    try {
                                        try {
                                            try {
                                                M.c("M", (Object)class_45872, (Object)M.c("M", (Object)M.c("q", (long)8637407137827540319L, (long)l5), (float)((M.c("M", (Object)class_7462, (float)f10, (long)8633457558319195369L, (long)l5) - callSite5) * 0.1f), (long)8630805292173594967L, (long)l5), (long)8636878098002152127L, (long)l5);
                                                M.c("M", (Object)class_45872, (Object)M.c("M", (Object)M.c("q", (long)8633529471215406951L, (long)l5), (float)((M.c("M", (Object)class_7462, (float)f10, (long)8636457168773785907L, (long)l5) - callSite7) * 0.1f), (long)8630805292173594967L, (long)l5), (long)8636878098002152127L, (long)l5);
                                                callSite2 = M.c("\u00fc", (Object)callSite4, (long)8635796627893948195L, (long)l5);
                                                if (callSite6 != null) break block10;
                                                if (callSite2 == false) break block11;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw M.c("\u00f3", (Object)runtimeException, (long)8637229735657922896L, (long)l5);
                                            }
                                            if (class_12682 != M.c("q", (long)8636528531727007513L, (long)l5)) break block12;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw M.c("\u00f3", (Object)runtimeException, (long)8637229735657922896L, (long)l5);
                                        }
                                        object3 = callSite3;
                                        break block13;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw M.c("\u00f3", (Object)runtimeException, (long)8637229735657922896L, (long)l5);
                                    }
                                }
                                object3 = 0.0f;
                            }
                            object2 = object3;
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l6;
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l7;
                            f = 1.0f - M.c("\u00f3", (float)f10, (float)M.c("M", (Object)this, (Object)objectArray3, (long)8636691577896360108L, (long)l5), (float)M.c("M", (Object)this, (Object)objectArray4, (long)8630354639628576198L, (long)l5), (long)8636370704282697529L, (long)l5);
                            Object[] objectArray5 = new Object[1];
                            objectArray5[0] = l8;
                            Object[] objectArray6 = new Object[11];
                            objectArray6[10] = l4;
                            objectArray6[9] = n;
                            objectArray6[8] = class_45972;
                            objectArray6[7] = class_45872;
                            objectArray6[6] = Float.valueOf(f);
                            objectArray6[5] = M.c("M", (Object)this, (Object)objectArray5, (long)8630633354461141473L, (long)l5);
                            objectArray6[4] = Float.valueOf(object2);
                            objectArray6[3] = M.c("q", (long)8636528531727007513L, (long)l5);
                            objectArray6[2] = Float.valueOf((float)callSite);
                            objectArray6[1] = Float.valueOf(f10);
                            objectArray6[0] = class_7462;
                            M.c("M", (Object)this, (Object)objectArray6, (long)8636816070762044259L, (long)l5);
                        }
                        callSite2 = M.c("\u00fc", (Object)callSite4, (long)8636934808657151145L, (long)l5);
                    }
                    try {
                        try {
                            if (callSite2 == false) break block14;
                            if (class_12682 != M.c("q", (long)8637306456459859963L, (long)l5)) break block15;
                        }
                        catch (RuntimeException runtimeException) {
                            throw M.c("\u00f3", (Object)runtimeException, (long)8637229735657922896L, (long)l5);
                        }
                        object = callSite3;
                        break block16;
                    }
                    catch (RuntimeException runtimeException) {
                        throw M.c("\u00f3", (Object)runtimeException, (long)8637229735657922896L, (long)l5);
                    }
                }
                object = 0.0f;
            }
            object2 = object;
            Object[] objectArray7 = new Object[1];
            objectArray7[0] = l3;
            Object[] objectArray8 = new Object[1];
            objectArray8[0] = l;
            f = 1.0f - M.c("\u00f3", (float)f10, (float)M.c("M", (Object)this, (Object)objectArray7, (long)8637650585554926967L, (long)l5), (float)M.c("M", (Object)this, (Object)objectArray8, (long)8635927129101121186L, (long)l5), (long)8636370704282697529L, (long)l5);
            Object[] objectArray9 = new Object[1];
            objectArray9[0] = l2;
            Object[] objectArray10 = new Object[11];
            objectArray10[10] = l4;
            objectArray10[9] = n;
            objectArray10[8] = class_45972;
            objectArray10[7] = class_45872;
            objectArray10[6] = Float.valueOf(f);
            objectArray10[5] = M.c("M", (Object)this, (Object)objectArray9, (long)8630997460027319881L, (long)l5);
            objectArray10[4] = Float.valueOf(object2);
            objectArray10[3] = M.c("q", (long)8637306456459859963L, (long)l5);
            objectArray10[2] = Float.valueOf((float)callSite);
            objectArray10[1] = Float.valueOf(f10);
            objectArray10[0] = class_7462;
            M.c("M", (Object)this, (Object)objectArray10, (long)8636816070762044259L, (long)l5);
        }
    }

    public float f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x161B1D2F4779L;
        long l4 = l2 ^ 0x6393D6D4AA8FL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)1314212509605105480L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)3863, (long)(0x6BBC2781FE92EF4CL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)1313814558265840713L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (float)M.c("M", (Object)((Float)((Object)M.c("M", (Object)callSite, (Object)objectArray3, (long)1308005908096737778L, (long)l))), (long)1311369534156236208L, (long)l);
    }

    public void d(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x27CBCC3206C6L;
        long l4 = l2 ^ 0x109521D5D2C2L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1799.class;
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)14372, (long)(0x13CB01D5EF0BA037L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)7671574547726691332L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = class_17992;
        M.c("M", (Object)callSite, (Object)objectArray3, (long)7670845495128119582L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = M.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = M.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = M.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = M.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        M.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = M.b(691212364488424L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = M.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        M.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = M.b(691212364488424L, 0L);
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

    public float d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x14F92D942835L;
        long l4 = l2 ^ 0x6171E66FC5C3L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)9039014391195394052L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)4853, (long)(0x7306B6B21C119DE3L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)9040863565134134021L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (float)M.c("M", (Object)((Float)((Object)M.c("M", (Object)callSite, (Object)objectArray3, (long)9037311112823738046L, (long)l))), (long)9042921590880045820L, (long)l);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public float a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4D580F6AB195L;
        long l4 = l2 ^ 0x38D0C4915C63L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)-1958680924813592156L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)11747, (long)(0x3735B84F2D5D3B5DL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)-1956884260062633307L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (float)M.c("M", (Object)((Float)((Object)M.c("M", (Object)callSite, (Object)objectArray3, (long)-1960575250769766626L, (long)l))), (long)-1954930679248383140L, (long)l);
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
        MethodHandle methodHandle = M.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == 'E' || c == 'q' || c == 'Z') {
                field = M.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = M.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x5E8F8AE3084EL;
        long l4 = l2 ^ 0x69D16704DC4AL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = M.c("q", (long)7275581768868264333L, (long)l);
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)10661, (long)(0x7FFF4086663BBF3CL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)7277413629802865292L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = M.c("\u00f3", (float)f, (long)7276606042289224496L, (long)l);
        M.c("M", (Object)callSite, (Object)objectArray3, (long)7276735156886787990L, (long)l);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = M.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7273;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/M", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            M.d[n2] = M.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    public class_1799 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x270A67733A6CL;
        long l4 = l2 ^ 0x5282AC88D79AL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1799.class;
        objectArray2[2] = class_759.class;
        objectArray2[1] = M.a("e", (int)21499, (long)(0x6F715C544AEC4EB6L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = M.c("\u00f3", (Object)objectArray2, (long)8011528186299967836L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_1799)M.c("M", (Object)callSite, (Object)objectArray3, (long)8012969576284003559L, (long)l);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\"c+\u00128&)l:]P&'c)";
        objectArray[1] = Float.TYPE;
        M.j[1] = "java/lang/Float";
        objectArray[2] = "PU\u0007W!3[Z\u0016\u0018L3[G\u0002";
        objectArray[3] = "HK$\u00134a^K!I'vI\u0000\"O+bXG5X`s}";
        objectArray[4] = "g6UjS6\u0012\u0016^eBys\u0018UnF#\u0007";
        objectArray[5] = Void.TYPE;
        M.j[5] = "java/lang/Void";
        objectArray[6] = "z,(}nFl,-'}Q{g.!qEj 96:UH";
        objectArray[7] = "p]5\u00199:\u0005}>\u0016(uds5\u001d,/\u0010";
        objectArray[8] = "\u001aqz)k\u0000oQq&zO\u000e_z-~\u0015z";
        objectArray[9] = "~\u0017--\u0013\u0004u\u0018<br\n~\u001388";
        objectArray[10] = "\u001d\u000f0=\u00059\u0016\u0000!rx!\u0005\u0007(;";
        objectArray[11] = "\u001cl\u001d\u007fI-\u001cg\u0000a\u0011}C'\n=D;\u0001}\u001b0K;\u0014f\u001b<\u000b%\u0013y\u00198K/\u0001'(\u001cD8\u0002l\u001b";
        objectArray[12] = "IP0'U,I[-9\r|\u0016\u001b'eX:TA6hW:AZ6d\u0017<S\\(z\u0017$FE4`W.T\u001b\thI\u001bBX%yI,U";
        objectArray[13] = Character.TYPE;
        M.j[13] = "java/lang/Character";
        objectArray[14] = "q)8]\tyz&)\u0012Up}$+_S;V-:THq";
        objectArray[15] = " ~s;5*U^x4$e4Ps? ?@";
        objectArray[16] = "'(\u0002\u00107b'#\u001f\u000eo2xc\u0015R:t:9\u0004_5t/\"\u0004Sur=$\u001aMuF\u001a\u0000#J2k:";
        objectArray[17] = "4\u000e{\u0005~<A.p\nos,.p\u0017{f";
        objectArray[18] = "R@xe[&RKe{\u0003v\r\u000bo'V0OQ~*Y0ZJ~&\u0019\u0017NDb8Q,NHi9z\"RDk.E";
        objectArray[19] = "3\u0005toi5F%\u007f`xz+%\u007f}lo";
        objectArray[20] = Boolean.TYPE;
        M.j[20] = "java/lang/Boolean";
        objectArray[21] = "k\u007f0\u0002H\u001b}\u007f5X[\fj46^W\u0018{s!I\u001c\nG";
        objectArray[22] = "L\u001a=\u0006\t\u00019:6\t\u0018ND\"%\u000e\u0011\u0007,";
        objectArray[23] = "pvmnx2fvh4k%q=k2g1`z|%,\u000f";
        objectArray[24] = "n\u0007:+|E\u001b'1$m\nz):/iP\u000e";
        objectArray[25] = "Gb~\u0006J_GbiZFP])iDFEZX9\u001d\u0014\u0004";
        objectArray[26] = "\u001b=0`<b\u001b='<0m\u0001v'\"0x\u0006\u0007szg";
        objectArray[27] = "%m)Z\u0015C%m>\u0006\u0019L?&>\u0018\u0019Y8WlFN\u0012";
        objectArray[28] = "\u0006qv4HXsQ};Y\u0017\u0012_v0]Mf";
        objectArray[29] = "\u000ePI0\u001c1{pB?\r~\u001a~I4\t$n";
        objectArray[30] = "//en]F//r2QI5dr,Q\\2\u0015 w\t\u0016";
        objectArray[31] = "\fru\u007fM\u0003yR~p\\L\u0018\\u{X\u0016l";
        objectArray[32] = ") NR$\u001f) Y\u000e(\u00103kY\u0010(\u00054\u001a\u000eIqA";
        objectArray[33] = "NU\u001dIDELKT6[KUB\b\tGEOA\u0019";
        objectArray[34] = "\u001fL\u0007I)f\u001fL\u0010\u0015%i\u0005\u0007\u0010\u000b%|\u0002vD_w<";
        objectArray[35] = "tE.i/\u000bv[g\u00160\u0005oR;),\u000buQ";
        objectArray[36] = "|a-MI.|a:\u0011E!f*:\u000fE4a[nV\u001dcqh8\u0010W\u0018'3nP";
        objectArray[37] = "\u001fnsD\u0005;jNxK\u0014t\u000b@s@\u0010.\u007f";
        objectArray[38] = "&VJ\u0019\t{-Y[Vub\"CU\u0015BR4TY\bS~#Y";
        objectArray[39] = "M} 8]g8]+7L(YS <Hr-";
        objectArray[40] = "\u001eXgwxG\u0012Pf<1K\u0012Zg6q\u0006\u001fVy<1e\u0012Eo\u0016}B\u0018T~*";
        objectArray[41] = "+pM\u00077*^PF\b&e?^M\u0003\"?K";
        objectArray[42] = "q5[M\u007ft\u0004\u0015PBn;e\u001b[Ija\u0011";
        objectArray[43] = "oj\u0018Kp\u0014yj\u001d\u0011c\u0003n!\u001e\u0017o\u0017\u007ff\t\u0000$\u0007C";
        objectArray[44] = "K3?\u0006\u00141>\u00134\t\u0005~_\u001d?\u0002\u0001$+";
        objectArray[45] = "@\u0012\u0015dC\u0007V\u0012\u0010>P\u0010AY\u00138\\\u0004P\u001e\u0004/\u0017\u0014s";
        objectArray[46] = "DV4C>11v?L/~Px4G+$$";
        objectArray[47] = "P\u00101||\u0017[\u001f 3\u001b\u0015N\u0014 x ";
        objectArray[48] = Integer.TYPE;
        M.j[48] = "java/lang/Integer";
        objectArray[49] = "tIZ\u001b}\u00103\nRE\u0004\u0001 OuKa\u0003M\f\u0002^g\u000fr\rMSyn";
        objectArray[50] = "NJ{K\u001ca\u0013D%Hn6tZ~\u0011_5\u000bD!\u0017\u0012_JY|\u0017\r%D]\"\rn";
        objectArray[51] = ")\bb\u0013\u000e&(Go\roc{Az\u0019\u0004t\u0016\b#\u0010Se&G.\u001b\u001f\u0019'\u0004~L\u0013)h\tu\u0000o&'E}\u0011P'hHcp";
        objectArray[52] = "#?t(\fQ 6~qq\u0002L+)w@\u000135vq\rku8o.O\nw>zsq";
        objectArray[53] = "%6pi\u001d7,bqvao|*U`\u001djr>Vd\u0004g\u0015m!q\u0002k*ln|\u001c\n*cln\u00005+,apa5$.sl^4k#m\r^;i1q2_td/\u0010";
        objectArray[54] = "h(y'%pua'o\u001a`q}?3]p\u0018i+nf{ucy<a\u001eh(y'%pua'o\u001a";
        objectArray[55] = "C\u0016jX $JBkG\\|\u001a\n\n\u0003me\u0010\u00135\u0002\"h\u000er5\r z\u0012M4B-ds";
        objectArray[56] = "^\ny\t,\u0014]\u0003sPQG1\u001e$V`DN\u0000{P-.U\u000ed^8\\\u000f\b'\bQ";
        objectArray[57] = "!Z}\u000f\u0012\u000f(\u000e|\u0010nWxFX\u0006\u0012RvRQ\u0006\u0015Y\u0011\u0001,\u0017\rS.\u0000c\u001a\u00132.\u000fa\b\u000f\r/@l\u0016n";
        objectArray[58] = "k^EY\u001e,hY\u001c@z:o\u001e7Y\u0011,y\u0019\u001fX\u001e,\u0002\u000e\u000fJD}r\u0005GK\u0018A>^G\\D13\b\u0015^z";
        objectArray[59] = "y\u0018av0xo\rw\u007fLdx\u0015g:-yy%c)6sr\u0012\u000e\u007f b!Wo}&w|ii% cx\u0006|7wn\u001f";
        objectArray[60] = "U[~>.{VSonU.(\u001c>8d-W\u0002a>)G\u0016\u001f<>6=\u0018\u001bb$U";
        objectArray[61] = "\u001dA\u001ehwR\u001eH\u00141\n\u0002rUC7;\u0002\rK\u001c1vh\u0016E\u0003?c\u001aLC@i\n";
        objectArray[62] = "`3\\\u001f\u0016\u00035`A\u001f*\u0012=\u007f}CO\u0014({JT*M4cCR\u0017D`b\\.";
        objectArray[63] = "<\u001cQE%F.\u0007\u0001\u0014\u0015PB\u001fWH$S=\u0001\bNi9?X\u0017Nn\u0005<P\u0006\u001e\u0015";
        objectArray[64] = "4\u001bzmV\u001a7\u001c#t2\u0016;Y&e_wc[ygQ\rm_'}2\bg@plM\u00168F=\u0006\f\u000beF\"|\u0002\u000f;\\A";
        objectArray[65] = "KX*(\u0017\"YEk}g<Fv<h\f:@B-t\u001d@\u0018@8*\u001e>_\u00030tg,X\u0000kl\f=Z\u0006>\u0013Xq]Y0,Y>PGQ";
        objectArray[66] = "t>XI5*(#\t\u0018G/r\"\\\u001d\u0010{#t\bNG-b7\u0006M7&*6Z";
        objectArray[67] = "*\u001cJP\u0010\u007f)\u0015@\tm/E\b\u0017\u000f\\/:\u0016H\t\u0011E|\u001bQVS$~\u001dD\u000bm";
        objectArray[68] = "c6u\u001dsgb5#\u000f\u00158c:,\u0018Bm3ntt,:~iv\u0015.<k4";
        objectArray[69] = "B@kd\u001a?CC=v|kN]6j\u0010Y\u001d\u0019k0|7O]h3\u001d5IH5\rEb_\u001fhlGdJBV";
        objectArray[70] = "\u000eKMfIX\u000fH\u001bt/\f\u0002V\u0010hC>Q\u0013L6\u0013iVF\f1\u0011\bT@\u0019l/P\u0003VN1NR\u0005C\u0013\u000f";
        objectArray[71] = "]\u0012T $\u001dXL\u0013b^Oa\u0003\u00155oO\u001e\u001dJ3\"%[\u0013\u0010o,\u001b\u0006\u001dNl^";
        objectArray[72] = "\u0016\u0012F\u0002@.\u0015\u001bL[=}y\u0006\u001b]\f~\u0006\u0018D[A\u0014\u001e\bA\u0002O\u007fB\u0015\u0010S=";
        objectArray[73] = "H\u001f&[<)O\u001f=\tZ=%\t'_7/\u0015\b*\r7W";
        objectArray[74] = "\u000fS}\"\u00153QF|=w2\u0002D\u007f \u001b\u0000V\u0006#|FWVTcyI6TRv$wn\u0003D!y\u0016l\u0005Q|GN;\u0013\u0006!&L=\u0006[\u001f~\u001b+Q\u0006~|\u001d>\f8";
        objectArray[75] = "\\\u0005B\u001fpe]\u0006\u0014\r\u00161P\u0018\u001f\u0011z\u0003\u0000[GK\u0016mQ\u0018AHwoW\r\u001cv/8AZA\u0017->T\u0007\u007f";
        objectArray[76] = "U}S2jr\r=Fn\n$UaH2]w\u00044\u001c^k;K`Lf3{^<";
        objectArray[77] = "-{M/6ipu\u0013,D>\u0017kHuu=hu\u0017s8W+(K|z'&~\u0019~D";
        objectArray[78] = "3l\u0012|5t0e\u0018%H#\\xO#y$#f\u0010%4Nek\tzv/gm\u001c'H";
        objectArray[79] = "W<c\u001fi~\u0010\u007fkA\u0010o\u0003:OKl`\t*\n\u0019!|\r'5\u0018nq\u0013Ff_*:\u0011-w],on/6\u001d{d\u0003,1Db\u0000";
        objectArray[80] = "\u0010MQ=@5\u0013D[d=b\u007fY\fb\fe\u0000GSdA\u000fC\u001a\u000fk\u0003\u007fNL]i=";
        objectArray[81] = "\u00046_\u000f1!\u000beSS]?\f&P\u000f1\r[`\u0001PbZ\u00076\u000b\u000b/0\u00184_\u0012]f]c^V-k\u000b1\\h";
        objectArray[82] = "f\\\b\n.,:AY[\\)`@\f^\u000b}1\u0016X\u0002\\+pUV\u000e, 8T\n";
        objectArray[83] = "\u0001\"WxN=P \u0017\u0000@7\n9DGP^W(U>\u0000?U.@c>1\b:Qp]`\nz)";
        objectArray[84] = "ud;If\u0002tgm[\u0000]uhbLW\r.;8 aBkif\u00189\u0002~5";
        objectArray[85] = "\u0005,ejvF\u0004/3x\u0010\u0019\u0005 <oGLUva\u0003)\u001b\u0018sfb+\u001d\r.";
        objectArray[86] = "\u00038\u0002\u0016dN\u00001\bO\u0019\u001dl*\u0000M'E\t1Z\u0015et\u00156\u0006\u0010(\u0011\u000el^R\u0019";
        objectArray[87] = "ws\\_kF/3I\u0003\u000b\u0010woG_\\C&;\u001b3j\u000finC\u000b2O|2";
        objectArray[88] = "B8JW8\u0000T-\\^D\bE$A\u000b\u0013Z\u001cv\u001c[D\u0000U&\u0015\u001b\"\u0016@0\u001c";
        objectArray[89] = "\u0014GO@xH\u001d\u0013N_\u0004\u000fI]B^\u007f\u0018$\u0013KD`\t\u0019\u001a\u001fE\u007fu";
        objectArray[90] = "\u001dQ\u0018/2\"\u0007\u0016\u001eoI-\u001bV$},+\u000eR\u0013jIrFQO,7'\u0015LO\u0010";
        objectArray[91] = "{b\u0011c}xf+O+BJZ\u000bg\u001a{lbjSd</j4";
        objectArray[92] = "\u0003\u0017\u001ar\u000b\u001a\u0000\u001e\u0010+vNl\u0003G-GJ\u0013\u001d\u0018+\n U\u0010\u0001tHAW\u0016\u0014)v";
        objectArray[93] = "2CMXN5cA\r b\u0007\u0005h3\u0019D?d\\M^\u00077:";
        objectArray[94] = "7|\u0002hMV(!\u001b0tQ->\u0001s2X*\u0002\u0007k\u0010?r8Bn\u0017E|<\u001ctt\u00010|\u001bl\u000e\u000f4\"\u0001\u000fJCt%\u0019uDG*?z";
        objectArray[95] = "TV\u001c\u007f\u0018\\UUJm~\u0003TZEz)V\u0004\f\u001b\u0016G\u0001I\t\u001fwE\u0007\\T";
        objectArray[96] = "qa^\u001bx(pb\b\t\u001e|}|\u0003\u0015rN->RO\u001e ||]L\u007f\"zi\u0000r'ul>]\u0013%sycc";
        objectArray[97] = "5Fj,$`#S|%Xh2Zap\u000f:k\b<\"X`\"X5`>v7N<";
        objectArray[98] = "?-,|8\u0000n/l\u0004&\u00077\".Z!\u0007-&R=$\u001fnu3?\"\n3K";
        Object[] objectArray2 = objectArray;
        objectArray[99] = "\t\u0019|\u000bi~\b\u001a*\u0019\u000f!\t\u0015%\u000eXtYA\u007fb6#\u0014F\u007f\u00034%\u0001\u001b";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 15;
            case 2 -> 24;
            case 3 -> 6;
            case 4 -> 13;
            case 5 -> 14;
            case 6 -> 27;
            case 7 -> 7;
            case 8 -> 2;
            case 9 -> 41;
            case 10 -> 16;
            case 11 -> 5;
            case 12 -> 3;
            case 13 -> 43;
            case 14 -> 36;
            case 15 -> 40;
            case 16 -> 37;
            case 17 -> 26;
            case 18 -> 59;
            case 19 -> 52;
            case 20 -> 63;
            case 21 -> 35;
            case 22 -> 39;
            case 23 -> 50;
            case 24 -> 4;
            case 25 -> 57;
            case 26 -> 38;
            case 27 -> 33;
            case 28 -> 46;
            case 29 -> 0;
            case 30 -> 32;
            case 31 -> 11;
            case 32 -> 28;
            case 33 -> 60;
            case 34 -> 10;
            case 35 -> 47;
            case 36 -> 53;
            case 37 -> 18;
            case 38 -> 34;
            case 39 -> 1;
            case 40 -> 17;
            case 41 -> 42;
            case 42 -> 30;
            case 43 -> 49;
            case 44 -> 20;
            case 45 -> 8;
            case 46 -> 48;
            case 47 -> 22;
            case 48 -> 55;
            case 49 -> 31;
            case 50 -> 19;
            case 51 -> 25;
            case 52 -> 45;
            case 53 -> 21;
            case 54 -> 58;
            case 55 -> 9;
            case 56 -> 29;
            case 57 -> 56;
            case 58 -> 51;
            case 59 -> 62;
            case 60 -> 12;
            case 61 -> 44;
            case 62 -> 61;
            default -> 54;
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
        M.j[n3] = new String(cArray);
        return n3;
    }

    public class_759.class_5773 a(Object[] objectArray) {
        class_746 class_7462 = (class_746)objectArray[0];
        long l = (Long)objectArray[1];
        l = b ^ l;
        CallSite callSite = M.c("M", (Object)M.c("M", (Object)M.c("M", (Object)M.c("\u00f3", (long)-2386711676556873712L, (long)l), (long)-2379691845948590756L, (long)l), (long)-2386810878609242155L, (long)l), (Object)M.c("M", (Object)M.c("M", class_759.class, (long)-2379505651135245049L, (long)l), (char)M.b("o", (int)25976, (long)(0x2084834203B3A267L ^ l)), (char)M.b("o", (int)23730, (long)(0x1B42C6F2766B1BA7L ^ l)), (long)-2379356978785510184L, (long)l), (long)-2379094073159848213L, (long)l);
        CallSite callSite2 = M.c("M", (Object)M.c("M", (Object)M.c("M", (Object)M.c("\u00f3", (long)-2386711676556873712L, (long)l), (long)-2379691845948590756L, (long)l), (long)-2386810878609242155L, (long)l), (Object)M.c("\u00f3", class_759.class_5773.class, (Object)new Class[]{class_746.class}, (long)-2385094953784978277L, (long)l), (long)-2380037271832012777L, (long)l);
        CallSite callSite3 = M.c("M", (Object)M.c("M", (Object)M.c("\u00f3", (long)-2386711676556873712L, (long)l), (long)-2379691845948590756L, (long)l), (Object)callSite, (Object)M.a("e", (int)16215, (long)(0x12B524BD163A93D8L ^ l)), (Object)callSite2, (long)-2379225117935232428L, (long)l);
        try {
            CallSite callSite4 = M.c("M", class_759.class, (Object)callSite3, (Object)new Class[]{class_746.class}, (long)-2385226108842701971L, (long)l);
            M.c("M", (Object)callSite4, (boolean)true, (long)-2379941870890676722L, (long)l);
            return (class_759.class_5773)M.c("M", (Object)callSite4, null, (Object)new Object[]{class_7462}, (long)-2385155319485925407L, (long)l);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(M.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(M.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(M.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bQ;
import dev.zprestige.prestige.bR;
import dev.zprestige.prestige.cU;
import dev.zprestige.prestige.cX;
import dev.zprestige.prestige.gy_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
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
public class cV
extends cU {
    private final Field b;
    private final boolean c;
    private final Object d;
    private final long e;
    private final VarHandle f;
    private final Object g;
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

    private cV(Field field, boolean bl, Object object, long l, VarHandle varHandle, Object object2) {
        this.b = field;
        this.c = bl;
        this.d = object;
        this.e = l;
        this.f = varHandle;
        this.g = object2;
    }

    private cV(cX cX2, Object object) {
        this(cX2.a, cX2.b, cX2.c, cX2.d, cX2.e, object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        cV.i = hc.a(3541792625525462616L, -7645726684853323736L, MethodHandles.lookup().lookupClass()).a(144574079291987L);
                        cV.B = new Object[112];
                        cV.C = new String[112];
                        cV.c();
                        cV.p = new HashMap<K, V>(13);
                        var11 = cV.i ^ 80316232807854L;
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
                        var17_5 = "4R@\u0094\u00d1\u00a2-n\u000eJ\u00f9\u00bbt\u00f1Q\u00a9\u00f0!\u00e5\u008bZ\u000ec\u00b2\u00ee\u00c5\u0093\u00b3:\u0010XVEC5\u0085\u00b4\u0000\u00e7\u00fav\u000b&>IR\u00d36\u0088\u0098\u00011^\u001f\u0089\u00bb[\u0085\u0089\u00fa\u00af\t{&]\u00a0\b\u009a\"\u0088\u0001\u00e9\u00ed\u0016\u00e3\u00a9\u00c7\u00a4\u00e5+\u0090\u0004*\u0010\u00cd\u00aa\u00ecd@S\u00f1\u00d5\u0088\u00f0\u0004|\u00af\u0011\u00cab\u0081\u0013\u00dcd+\u00c5\u00ed\u00e2\u00c7Q\u00d53k\u00c8\u0094b\u00f6\u0090\u0091\u00d4E\u00bde\bL\u00ae\u001d\u00b9\u0005\u00c5\u00aa\u00de\u00d8\u00fch\u00a1YM\u00f4\u008aJhmM(\u00db_\u00d9\u00b4\u00b7\u00da#\u0007\u00f9\u00ea\u00e6\u00c3UR\u00be\u00b7\u0014\u007f#B\u00ac\u0013\u0091\u00b0\u00c4\u00a3Y09=\u00d2\u0093\u00bc\u00e1,\u00c9\u00a9\u008bF\u0097\u00a0\u0096\u00a2\u00cd3.\u001fX\u00b8\u00d1\u0010\u00d1\u0088;V\t\u00d3rfB?\u00fb\u00feU\u00f75jm\u00d4u\u00ebNl\u0082\r\u0091\u0086\u00e8\u00df\bK6\f\u00e2\u00b0\u00ba3\u0016\u00b8H\u00f7c7i3or{kB\u00c4\u0012\u00981\u00bd\u00f2Gf`\u0098V\u00ae\u00d3\u00bc\u00c4'\u0003\u0097\u009f\u00d2O\u00d9\u00e3\u00a9N\u000b\u009fF\u00df\u00f4\u00e0\u00e6\u00f3j\u0016\f\u00ebHr\u00b2f9\u0006-\u00aejo\u009e\u00da\u00eb\u00da\u008e\u000f\u00d9\u00ca\u00c4\u00cc\u00d3\u00d5u\u00dbcs\u0084\u00c3\u009f\u00e5!v\u00f4B\u0000\u001d\u00c6\u001cc\u00f6\u00a9Tr)\u00fd#Y&\u00e8E\b\u0010\u00b6\u001a\u00dc\u0017&D\u00e4~'\u00cb\u00adW@\u001cg7\u00c4\u00c9\u00e8\u00d8\u0089^\u00f1\u00d14\u00e8\u00c9p\u008d\u0000t\u00eb\u00cf\u00f0>\u00a6\u008b\u00b1\u0016R\u0087\u001f\u00c2\u0017\u00e3,\u0095a\u00eda\u00a2e\u00ff\u00a2n\u00fb\u0006(\u00d5\u0003(\u00a5\u0011tu@\u0092VX\u0000\u0007\u00b2\u00db\u009bW\u00a3R`\u00129\u0099\u00be\u00fb\u00d5\u00a1\u00fd\u0018>}}P\u00b2g5\u00b8a\u0012\u00ea\u0088\u0001\u009d\u00e5\u00107\u00aeX\u00c5D\u00e8N\u00db\u00a5V*\u00e1\t\u00c0\u00eb\u0005(\r\u000f\u00a10}\u0003w\u0083~\u0087\u009ad\u00b5P\u00a1g\u00b6\u0003\u0018jhW\u00dfn\u0098\u007fH\u00e5\u00b2\u0084\u00d0\u0018r\u00b7\u00d9M>/\u00fb\u00ce\u00ca\u0010\u00db\u00d5r\u00f0\u00b6\u00ee\u00b8t\u00fd60\u001ex\u0085\u00a8\u00f3\u00b3\u00a5\u00f2\u00d7\u00e3y\u00a5eC1\u00a8*\u00c0x\u00ce\u001e%\u00dfxp\u0016\u009a\u0092\u0098]K\u0002\u00abH\u001c\u00ca8a\u00ac\u0082\u00f9\u00a3\u00b4\u008b&\b\u00ffjc\u0006,\u00d3\u00e1\u00b7?r\u0096\u00eb\u00adK\u000b'\u001dK\u00ba:\u00f8\u00d0\u00a2\u00fdP,\u009d]\u00bc\u00bf\u00ady\u00b4!\u00aa\u00ca\u0083\u00c6\u00b6M\u00fab*\u0098\u00cc\u00004\u00b6\u007fw\u0091\u009e\u00c8;p\u00a3\u0003:\u00e3\u00ebc\u00c8\u00a6t\u00d8\u0006\r2+.\u00d6~\u00dd\u0011\u00dav";
                        var19_6 = "4R@\u0094\u00d1\u00a2-n\u000eJ\u00f9\u00bbt\u00f1Q\u00a9\u00f0!\u00e5\u008bZ\u000ec\u00b2\u00ee\u00c5\u0093\u00b3:\u0010XVEC5\u0085\u00b4\u0000\u00e7\u00fav\u000b&>IR\u00d36\u0088\u0098\u00011^\u001f\u0089\u00bb[\u0085\u0089\u00fa\u00af\t{&]\u00a0\b\u009a\"\u0088\u0001\u00e9\u00ed\u0016\u00e3\u00a9\u00c7\u00a4\u00e5+\u0090\u0004*\u0010\u00cd\u00aa\u00ecd@S\u00f1\u00d5\u0088\u00f0\u0004|\u00af\u0011\u00cab\u0081\u0013\u00dcd+\u00c5\u00ed\u00e2\u00c7Q\u00d53k\u00c8\u0094b\u00f6\u0090\u0091\u00d4E\u00bde\bL\u00ae\u001d\u00b9\u0005\u00c5\u00aa\u00de\u00d8\u00fch\u00a1YM\u00f4\u008aJhmM(\u00db_\u00d9\u00b4\u00b7\u00da#\u0007\u00f9\u00ea\u00e6\u00c3UR\u00be\u00b7\u0014\u007f#B\u00ac\u0013\u0091\u00b0\u00c4\u00a3Y09=\u00d2\u0093\u00bc\u00e1,\u00c9\u00a9\u008bF\u0097\u00a0\u0096\u00a2\u00cd3.\u001fX\u00b8\u00d1\u0010\u00d1\u0088;V\t\u00d3rfB?\u00fb\u00feU\u00f75jm\u00d4u\u00ebNl\u0082\r\u0091\u0086\u00e8\u00df\bK6\f\u00e2\u00b0\u00ba3\u0016\u00b8H\u00f7c7i3or{kB\u00c4\u0012\u00981\u00bd\u00f2Gf`\u0098V\u00ae\u00d3\u00bc\u00c4'\u0003\u0097\u009f\u00d2O\u00d9\u00e3\u00a9N\u000b\u009fF\u00df\u00f4\u00e0\u00e6\u00f3j\u0016\f\u00ebHr\u00b2f9\u0006-\u00aejo\u009e\u00da\u00eb\u00da\u008e\u000f\u00d9\u00ca\u00c4\u00cc\u00d3\u00d5u\u00dbcs\u0084\u00c3\u009f\u00e5!v\u00f4B\u0000\u001d\u00c6\u001cc\u00f6\u00a9Tr)\u00fd#Y&\u00e8E\b\u0010\u00b6\u001a\u00dc\u0017&D\u00e4~'\u00cb\u00adW@\u001cg7\u00c4\u00c9\u00e8\u00d8\u0089^\u00f1\u00d14\u00e8\u00c9p\u008d\u0000t\u00eb\u00cf\u00f0>\u00a6\u008b\u00b1\u0016R\u0087\u001f\u00c2\u0017\u00e3,\u0095a\u00eda\u00a2e\u00ff\u00a2n\u00fb\u0006(\u00d5\u0003(\u00a5\u0011tu@\u0092VX\u0000\u0007\u00b2\u00db\u009bW\u00a3R`\u00129\u0099\u00be\u00fb\u00d5\u00a1\u00fd\u0018>}}P\u00b2g5\u00b8a\u0012\u00ea\u0088\u0001\u009d\u00e5\u00107\u00aeX\u00c5D\u00e8N\u00db\u00a5V*\u00e1\t\u00c0\u00eb\u0005(\r\u000f\u00a10}\u0003w\u0083~\u0087\u009ad\u00b5P\u00a1g\u00b6\u0003\u0018jhW\u00dfn\u0098\u007fH\u00e5\u00b2\u0084\u00d0\u0018r\u00b7\u00d9M>/\u00fb\u00ce\u00ca\u0010\u00db\u00d5r\u00f0\u00b6\u00ee\u00b8t\u00fd60\u001ex\u0085\u00a8\u00f3\u00b3\u00a5\u00f2\u00d7\u00e3y\u00a5eC1\u00a8*\u00c0x\u00ce\u001e%\u00dfxp\u0016\u009a\u0092\u0098]K\u0002\u00abH\u001c\u00ca8a\u00ac\u0082\u00f9\u00a3\u00b4\u008b&\b\u00ffjc\u0006,\u00d3\u00e1\u00b7?r\u0096\u00eb\u00adK\u000b'\u001dK\u00ba:\u00f8\u00d0\u00a2\u00fdP,\u009d]\u00bc\u00bf\u00ady\u00b4!\u00aa\u00ca\u0083\u00c6\u00b6M\u00fab*\u0098\u00cc\u00004\u00b6\u007fw\u0091\u009e\u00c8;p\u00a3\u0003:\u00e3\u00ebc\u00c8\u00a6t\u00d8\u0006\r2+.\u00d6~\u00dd\u0011\u00dav".length();
                        var16_7 = 48;
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
                            var20_3[var18_4++] = cV.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "'d\u00c8\u0080\u0006-5V\r\u00b8a\u0080\u009a\u00c4\u00e1\u00ad\u008bv\u00ef\u00ab\u00b3\u00f3F\u000e\u00dd\u00b4\u00db\u0089\u0015&\u0017\u00a5\b\u00c6\u00a6CV\u0093\u00c6\u0092^-m\u008d=\u00bf\u001d\u0001~\u0011\u00c9\u00ee\u00c9\u0013\u00e5YAZp\"e\u00b5\u0002\u0085\u00dfi\u00da\u00beg H \u00b6\u00f6%\u009c\u00d6d\u0088|\u00071\u009ci>\u00e6\u0085\u00e0\u008a\u0002-:\u0002\u00b3\u00b4\u001c\u00c2QTW\u00d2\u00c5\u00a9K\u00c0\u0010\u00d3D\u00d3\u00c1m\u00a2\u00a2\u00a8;\u00fbx\u00a4/li\u00f1\u000fh\u001a\u00a8\u0097v\u00f2\u00f6\u00f2\u00c7\u00f0]\u0086,\u0017\u00acc\u00beD\u00ff\u00f4`\\\u0088\u009a\u00a2Z\u00b6E'(C\u00be;\u00c6\u0015)\u00d7\u00ff\u0004\u0090&m\r;\u00cdF\u00cb\u00a8\u00fb\u00e6#\u00d9IO\u0090\u001e\u00fe\u008eJ\u00bf\u00d2t:\u00ef3\u00cfZFd\u0086";
                            var19_6 = "'d\u00c8\u0080\u0006-5V\r\u00b8a\u0080\u009a\u00c4\u00e1\u00ad\u008bv\u00ef\u00ab\u00b3\u00f3F\u000e\u00dd\u00b4\u00db\u0089\u0015&\u0017\u00a5\b\u00c6\u00a6CV\u0093\u00c6\u0092^-m\u008d=\u00bf\u001d\u0001~\u0011\u00c9\u00ee\u00c9\u0013\u00e5YAZp\"e\u00b5\u0002\u0085\u00dfi\u00da\u00beg H \u00b6\u00f6%\u009c\u00d6d\u0088|\u00071\u009ci>\u00e6\u0085\u00e0\u008a\u0002-:\u0002\u00b3\u00b4\u001c\u00c2QTW\u00d2\u00c5\u00a9K\u00c0\u0010\u00d3D\u00d3\u00c1m\u00a2\u00a2\u00a8;\u00fbx\u00a4/li\u00f1\u000fh\u001a\u00a8\u0097v\u00f2\u00f6\u00f2\u00c7\u00f0]\u0086,\u0017\u00acc\u00beD\u00ff\u00f4`\\\u0088\u009a\u00a2Z\u00b6E'(C\u00be;\u00c6\u0015)\u00d7\u00ff\u0004\u0090&m\r;\u00cdF\u00cb\u00a8\u00fb\u00e6#\u00d9IO\u0090\u001e\u00fe\u008eJ\u00bf\u00d2t:\u00ef3\u00cfZFd\u0086".length();
                            var16_7 = 152;
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
                            var20_3[var18_4++] = cV.b(var21_9).intern();
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
                cV.n = var20_3;
                cV.o = new String[8];
                cV.v = new HashMap<K, V>(13);
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
                var4_14 = "\u0099wv\u0098f\b2}\u00c0p\u00ea\u00f9\u00bc/\u00b0\u00dd";
                var5_15 = "\u0099wv\u0098f\b2}\u00c0p\u00ea\u00f9\u00bc/\u00b0\u00dd".length();
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
                    var4_14 = "\u0005\u0095F\u007f\u0012R\u0093\u00aeJ\u00ee\u00ac\",\u0006\u00a9\u00de";
                    var5_15 = "\u0005\u0095F\u007f\u0012R\u0093\u00aeJ\u00ee\u00ac\",\u0006\u00a9\u00de".length();
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
        cV.t = var6_12;
        cV.u = new Integer[4];
        cV.h = new ConcurrentHashMap<K, V>();
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
            case 0 -> 35;
            case 1 -> 1;
            case 2 -> 49;
            case 3 -> 9;
            case 4 -> 53;
            case 5 -> 14;
            case 6 -> 12;
            case 7 -> 32;
            case 8 -> 22;
            case 9 -> 34;
            case 10 -> 17;
            case 11 -> 4;
            case 12 -> 52;
            case 13 -> 7;
            case 14 -> 23;
            case 15 -> 8;
            case 16 -> 31;
            case 17 -> 59;
            case 18 -> 29;
            case 19 -> 47;
            case 20 -> 26;
            case 21 -> 56;
            case 22 -> 25;
            case 23 -> 46;
            case 24 -> 36;
            case 25 -> 30;
            case 26 -> 27;
            case 27 -> 15;
            case 28 -> 39;
            case 29 -> 55;
            case 30 -> 61;
            case 31 -> 20;
            case 32 -> 50;
            case 33 -> 5;
            case 34 -> 28;
            case 35 -> 41;
            case 36 -> 18;
            case 37 -> 6;
            case 38 -> 10;
            case 39 -> 21;
            case 40 -> 33;
            case 41 -> 11;
            case 42 -> 58;
            case 43 -> 44;
            case 44 -> 54;
            case 45 -> 24;
            case 46 -> 19;
            case 47 -> 13;
            case 48 -> 43;
            case 49 -> 37;
            case 50 -> 48;
            case 51 -> 45;
            case 52 -> 60;
            case 53 -> 38;
            case 54 -> 63;
            case 55 -> 0;
            case 56 -> 3;
            case 57 -> 16;
            case 58 -> 51;
            case 59 -> 40;
            case 60 -> 57;
            case 61 -> 62;
            case 62 -> 2;
            default -> 42;
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
        cV.C[n3] = new String(cArray);
        return n3;
    }

    public bQ e(Object[] objectArray) {
        Object object;
        long l;
        block7: {
            block8: {
                l = (Long)objectArray[0];
                l = i ^ l;
                CallSite callSite = cV.g("B", (long)-6000761709436047882L, (long)l);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block7;
                        if (!((cV)object).c) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cV.g("B", (Object)illegalArgumentException, (long)-6006030637784322748L, (long)l);
                    }
                    throw new IllegalStateException((String)((Object)cV.b("i", (int)316, (long)(0x6258E476637EA60L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)-6006030637784322748L, (long)l);
                }
            }
            object = this.g;
        }
        try {
            if (object == null) {
                throw new IllegalStateException((String)((Object)cV.b("i", (int)26186, (long)(0x103638CEA130D14L ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cV.g("B", (Object)illegalArgumentException, (long)-6006030637784322748L, (long)l);
        }
        return new bQ(this, this.g);
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47F7;
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
                throw new RuntimeException("dev/zprestige/prestige/cV", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = cV.n[n2].getBytes("ISO-8859-1");
            cV.o[n2] = cV.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    /*
     * Unable to fully structure code
     */
    public void b(Object[] var1_1) {
        block22: {
            block19: {
                block21: {
                    block20: {
                        var2_2 = var1_1[0];
                        var5_3 = var1_1[1];
                        var3_4 = (Long)var1_1[2];
                        var6_5 = (var3_4 = cV.i ^ var3_4) ^ 37363395543600L;
                        var8_6 = cV.g("B", (long)-4535651304909897663L, (long)var3_4);
                        if (!this.c) break block19;
                        try {
                            block23: {
                                if (cV.a == null) break block20;
                                break block23;
                                catch (IllegalAccessException v0) {
                                    throw cV.g("B", (Object)v0, (long)-4534728058866515725L, (long)var3_4);
                                }
                            }
                            v1 = new Object[3];
                            v1[2] = var6_5;
                            v1[1] = var5_3;
                            v1[0] = null;
                            cV.g("c", (Object)this, (Object)v1, (long)-4537307515660600217L, (long)var3_4);
                            return;
                        }
                        catch (IllegalAccessException v2) {
                            throw cV.g("B", (Object)v2, (long)-4534728058866515725L, (long)var3_4);
                        }
                    }
                    v3 = this;
                    if (var8_6 != null) ** GOTO lbl42
                    try {
                        block24: {
                            if (v3.f == null) break block21;
                            break block24;
                            catch (IllegalAccessException v4) {
                                throw cV.g("B", (Object)v4, (long)-4534728058866515725L, (long)var3_4);
                            }
                        }
                        this.f.set(var5_3);
                        return;
                    }
                    catch (IllegalAccessException v5) {
                        throw cV.g("B", (Object)v5, (long)-4534728058866515725L, (long)var3_4);
                    }
                }
                try {
                    v3 = this;
lbl42:
                    // 2 sources

                    cV.g("c", (Object)v3.b, null, (Object)var5_3, (long)-4535422207145308138L, (long)var3_4);
                }
                catch (IllegalAccessException var9_7) {
                    throw new RuntimeException(var9_7);
                }
                return;
            }
            try {
                if (cV.a != null) {
                    v6 = new Object[3];
                    v6[2] = var6_5;
                    v6[1] = var5_3;
                    v6[0] = var2_2;
                    cV.g("c", (Object)this, (Object)v6, (long)-4537307515660600217L, (long)var3_4);
                    return;
                }
            }
            catch (IllegalAccessException v7) {
                throw cV.g("B", (Object)v7, (long)-4534728058866515725L, (long)var3_4);
            }
            v8 = this;
            if (var8_6 != null) ** GOTO lbl76
            try {
                block25: {
                    if (v8.f == null) break block22;
                    break block25;
                    catch (IllegalAccessException v9) {
                        throw cV.g("B", (Object)v9, (long)-4534728058866515725L, (long)var3_4);
                    }
                }
                this.f.set(var2_2, var5_3);
                return;
            }
            catch (IllegalAccessException v10) {
                throw cV.g("B", (Object)v10, (long)-4534728058866515725L, (long)var3_4);
            }
        }
        try {
            v8 = this;
lbl76:
            // 2 sources

            cV.g("c", (Object)v8.b, (Object)var2_2, (Object)var5_3, (long)-4535422207145308138L, (long)var3_4);
        }
        catch (IllegalAccessException var9_8) {
            throw new RuntimeException(var9_8);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cV.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'J' || c == 'Q' || c == 'o' || c == '\u00e4') {
                field = cV.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'J' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cV.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cV.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    public static cV b(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        String string;
        Object object2;
        block4: {
            block5: {
                object2 = objectArray[0];
                string = (String)objectArray[1];
                l2 = (Long)objectArray[2];
                l = (l2 = i ^ l2) ^ 0x4B579DD477F9L;
                CallSite callSite = cV.g("B", (long)-1776363978702641642L, (long)l2);
                try {
                    try {
                        object = object2;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cV.g("B", (Object)illegalArgumentException, (long)-1781631395438926172L, (long)l2);
                    }
                    throw new IllegalArgumentException((String)((Object)cV.b("i", (int)19331, (long)(0xDCE5C491AEAEB3EL ^ l2))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)-1781631395438926172L, (long)l2);
                }
            }
            object = object2;
        }
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l;
        objectArray2[1] = string;
        objectArray2[0] = object.getClass();
        CallSite callSite = cV.g("B", (Object)objectArray2, (long)-1776674669993196991L, (long)l2);
        return new cV((cX)((Object)callSite), object2);
    }

    public static bQ b(Object[] objectArray) {
        cV cV2;
        long l;
        long l2;
        Object object;
        block4: {
            cV cV3;
            block5: {
                object = objectArray[0];
                String string = (String)objectArray[1];
                Class clazz = (Class)objectArray[2];
                Class clazz2 = (Class)objectArray[3];
                l2 = (Long)objectArray[4];
                long l3 = l2 = i ^ l2;
                l = l3 ^ 0x3704192DFCF1L;
                long l4 = l3 ^ 0x6FF7F90B7A86L;
                Class<?> clazz3 = object.getClass();
                gy_0 gy_02 = new gy_0(clazz, string, clazz2, clazz3);
                CallSite callSite = cV.g("B", (long)9066124524884704414L, (long)l2);
                cV3 = (cV)((Object)cV.g("c", (Object)h, (Object)gy_02, (long)9069703225990260355L, (long)l2));
                try {
                    cV2 = cV3;
                    if (callSite != null) break block4;
                    if (cV2 != null) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)9065202653196811308L, (long)l2);
                }
                CallSite callSite2 = cV.g("B", (Object)clazz2, (long)9066991699301546768L, (long)l2);
                CallSite callSite3 = cV.g("c", (Object)cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)9069337685530038085L, (long)l2), (long)9067202567282885793L, (long)l2), (long)9069232299185319657L, (long)l2), (Object)cV.g("c", (Object)cV.g("c", (Object)clazz, (long)9065316936749573718L, (long)l2), (char)cV.d("e", (int)10827, (long)(0x3AD9650AACFF8733L ^ l2)), (char)cV.d("e", (int)8175, (long)(0x269384D9BF56B294L ^ l2)), (long)9064017912370084562L, (long)l2), (long)9064548209230897907L, (long)l2);
                CallSite callSite4 = cV.g("c", (Object)cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)9069337685530038085L, (long)l2), (long)9067202567282885793L, (long)l2), (long)9069232299185319657L, (long)l2), (Object)callSite2, (long)9069422960894767964L, (long)l2);
                CallSite callSite5 = cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)9069337685530038085L, (long)l2), (long)9067202567282885793L, (long)l2), (Object)callSite3, (Object)string, (Object)callSite4, (long)9066572733309198685L, (long)l2);
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = l4;
                objectArray2[2] = callSite2;
                objectArray2[1] = callSite5;
                objectArray2[0] = clazz3;
                CallSite callSite6 = cV.g("B", (Object)objectArray2, (long)9063975637473058548L, (long)l2);
                cV3 = new cV((cX)((Object)callSite6), null);
                cV cV4 = (cV)((Object)cV.g("c", (Object)h, (Object)gy_02, (Object)cV3, (long)9067431729178238805L, (long)l2));
                try {
                    cV2 = cV4;
                    if (callSite != null) break block4;
                    if (cV2 == null) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)9065202653196811308L, (long)l2);
                }
                cV3 = cV4;
            }
            cV2 = cV3;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = object;
        return cV.g("c", (Object)cV2, (Object)objectArray3, (long)9070191793840526446L, (long)l2);
    }

    public Object b(Object[] objectArray) {
        Object object;
        block8: {
            long l;
            long l2;
            block9: {
                Object object2;
                block10: {
                    block11: {
                        l2 = (Long)objectArray[0];
                        l = (l2 = i ^ l2) ^ 0x3E935DA96635L;
                        CallSite callSite = cV.g("B", (long)-5390445825005882242L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        object = this;
                                        if (callSite != null) break block8;
                                        if (((cV)object).c) break block9;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw cV.g("B", (Object)illegalArgumentException, (long)-5391367422101572404L, (long)l2);
                                    }
                                    object2 = this.g;
                                    if (callSite != null) break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw cV.g("B", (Object)illegalArgumentException, (long)-5391367422101572404L, (long)l2);
                                }
                                if (object2 != null) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cV.g("B", (Object)illegalArgumentException, (long)-5391367422101572404L, (long)l2);
                            }
                            throw new IllegalStateException((String)((Object)cV.b("i", (int)26047, (long)(0x5BDAFCC285831768L ^ l2))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cV.g("B", (Object)illegalArgumentException, (long)-5391367422101572404L, (long)l2);
                        }
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l;
                    objectArray2[0] = this.g;
                    object2 = cV.g("c", (Object)this, (Object)objectArray2, (long)-5389749477819972852L, (long)l2);
                }
                return object2;
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l;
            objectArray3[0] = null;
            object = cV.g("c", (Object)this, (Object)objectArray3, (long)-5389749477819972852L, (long)l2);
        }
        return object;
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

    public static bQ c(Object[] objectArray) {
        cV cV2;
        long l;
        long l2;
        Object object;
        block4: {
            cV cV3;
            block5: {
                object = objectArray[0];
                String string = (String)objectArray[1];
                Class clazz = (Class)objectArray[2];
                String string2 = (String)objectArray[3];
                l2 = (Long)objectArray[4];
                long l3 = l2 = i ^ l2;
                l = l3 ^ 0x6EF304A560B9L;
                long l4 = l3 ^ 0x3600E483E6CEL;
                Class<?> clazz2 = object.getClass();
                CallSite callSite = cV.g("B", (long)-2190717752774418218L, (long)l2);
                gy_0 gy_02 = new gy_0(clazz, string, string2, clazz2);
                cV3 = (cV)((Object)cV.g("c", (Object)h, (Object)gy_02, (long)-2191468576541132085L, (long)l2));
                try {
                    cV2 = cV3;
                    if (callSite != null) break block4;
                    if (cV2 != null) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)-2195988330641760156L, (long)l2);
                }
                String string3 = "L" + string2 + ";";
                CallSite callSite2 = cV.g("c", (Object)cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)-2191956257112567027L, (long)l2), (long)-2189464896081454871L, (long)l2), (long)-2192061909342604639L, (long)l2), (Object)cV.g("c", (Object)cV.g("c", (Object)clazz, (long)-2196032247528490466L, (long)l2), (char)cV.d("e", (int)5969, (long)(0x31B8B57750E32660L ^ l2)), (char)cV.d("e", (int)15785, (long)(0x372F23303700C9BL ^ l2)), (long)-2197328136162498918L, (long)l2), (long)-2196657764177740101L, (long)l2);
                CallSite callSite3 = cV.g("c", (Object)cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)-2191956257112567027L, (long)l2), (long)-2189464896081454871L, (long)l2), (long)-2192061909342604639L, (long)l2), (Object)string3, (long)-2191764457750794476L, (long)l2);
                CallSite callSite4 = cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)-2191956257112567027L, (long)l2), (long)-2189464896081454871L, (long)l2), (Object)callSite2, (Object)string, (Object)callSite3, (long)-2190237976608654059L, (long)l2);
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = l4;
                objectArray2[2] = string3;
                objectArray2[1] = callSite4;
                objectArray2[0] = clazz2;
                CallSite callSite5 = cV.g("B", (Object)objectArray2, (long)-2197215492510793028L, (long)l2);
                cV3 = new cV((cX)((Object)callSite5), null);
                cV cV4 = (cV)((Object)cV.g("c", (Object)h, (Object)gy_02, (Object)cV3, (long)-2189412515290627299L, (long)l2));
                try {
                    cV2 = cV4;
                    if (callSite != null) break block4;
                    if (cV2 == null) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)-2195988330641760156L, (long)l2);
                }
                cV3 = cV4;
            }
            cV2 = cV3;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = object;
        return cV.g("c", (Object)cV2, (Object)objectArray3, (long)-2191121518852863962L, (long)l2);
    }

    private static void c() {
        Object[] objectArray = B;
        B[0] = "BbK_z^ImZ\u0010\u0017^IpN";
        objectArray[1] = "$R9*u7/](e\b/<Z!,";
        objectArray[2] = "h\u001dJxy0h\u0016Wf!`7V]:t&u\fL7{&`\u0017L;; r\u0011R%;8g\bN?{2uVs7e\u0007c\u0015_&e0t";
        objectArray[3] = "X0\n\u0005\u00075X;\u0017\u001b_e\u0007{\u001dG\n#E!\fJ\u0005#P:\fFE=W%\u000eB\u00057E{?f\n F0\f";
        objectArray[4] = Character.TYPE;
        cV.C[4] = "java/lang/Character";
        objectArray[5] = "s9cOR\u0011e9f\u0015A\u0006rre\u0013M\u0012c5r\u0004\u0006\u0002B";
        objectArray[6] = "8\u000e\u000b7)eM.\u000088*, \u000b3<pX";
        objectArray[7] = "76Yl-_!6\\6>H6}_02\\':H'yL\u000b";
        objectArray[8] = "4c\u001e\u0010)}4h\u0003\u000eq-k(\tR$k)r\u0018_+k<i\u0018SkL(g\u0004M#w(k\u000fL\by4g\r[7";
        objectArray[9] = "\u0014gy\u001cCd\u0014ld\u0002\u001b4K,n^Nr\tv\u007fSAr\u001cm\u007f_\u0001t\u000ekaA\u0001@)OXFFm\t";
        objectArray[10] = "*5\u0018J\u001cc<5\u001d\u0010\u000ft+~\u001e\u0016\u0003`:9\t\u0001Hp\u0018";
        objectArray[11] = "\u0006|\u0018Da)\rs\t\u000b\n=\u000fx\u001eQ&*\u0002";
        objectArray[12] = "BJ{C\u001a$TJ~\u0019\t3C\u0001}\u001f\u0005'RFj\bN5n";
        objectArray[13] = "=\u001eE)(^H>N&9\u00115&]!0X]";
        objectArray[14] = "\\D\t!\u0019\u001f)d\u0002.\bPHj\t%\f\n<";
        objectArray[15] = "O\u0005%\u001egQD\n4Q;XC\b6\u001c=\u0013c\r6\u0013-";
        objectArray[16] = "\u0000\u0011uYe\u001b\u000b\u001ed\u0016\u0004\u0015\u0000\u0015`L";
        objectArray[17] = Void.TYPE;
        cV.C[17] = "java/lang/Void";
        objectArray[18] = "6\u0001dX\u0011fC!oW\u0000)\"/d\\\u0004sV";
        objectArray[19] = "K\u001d\u0013K\u0005C>=\u0018D\u0014\f_3\u0013O\u0010V+";
        objectArray[20] = "\u0004@\u0000\u0019a2q`\u000b\u0016p}\u0010n\u0000\u001dt'd";
        objectArray[21] = "mO~\u001c\u0001T{O{F\u0012Cl\u0004x@\u001eW}CoWUFX";
        objectArray[22] = "[2Ec0([$\u0005\u001832I!N";
        objectArray[23] = Long.TYPE;
        cV.C[23] = "java/lang/Long";
        objectArray[24] = Float.TYPE;
        cV.C[24] = "java/lang/Float";
        objectArray[25] = Short.TYPE;
        cV.C[25] = "java/lang/Short";
        objectArray[26] = "@\fH/{2K\u0003Y`\u0017'^\b";
        objectArray[27] = Byte.TYPE;
        cV.C[27] = "java/lang/Byte";
        objectArray[28] = "E%\u0018Z\f\u001eN*\t\u0015q\u001a@6\u001a";
        objectArray[29] = "?\u0015GP;~4\u001aV\u001f\\|!\u0011VTg";
        objectArray[30] = Integer.TYPE;
        cV.C[30] = "java/lang/Integer";
        objectArray[31] = Boolean.TYPE;
        cV.C[31] = "java/lang/Boolean";
        objectArray[32] = Double.TYPE;
        cV.C[32] = "java/lang/Double";
        objectArray[33] = "?mH\u000b\u001194bYD|=4~_\tK0'";
        objectArray[34] = "#\u001dB\u000b'9(\u0012SDM:<\u001eX\u000f";
        objectArray[35] = "N\u0004AP\u0002[E\u000bP\u001fnXK\tRPB";
        objectArray[36] = "T&\u000e\r-D_)\u001fBEDQ&\f";
        objectArray[37] = "uc@\u0004C\u0012~lQK!\u0011qe";
        objectArray[38] = "_\u000b\f$?HA\u0003\u0016krR[\t\u000f7cX[\u001eT\u0006~SV\u001f\b7tSA\"\u001b6ypT\u001a";
        objectArray[39] = "\u0002F(%\u0014#wf#*\u0005l\u0016h(!\u00016b";
        objectArray[40] = "e D0g\u000f\u0010\u0000O?v@q\u000eD4r\u001a\u0005";
        objectArray[41] = "N\u0001\u001f{\u0004w;!\u0014t\u00158Z/\u001f\u007f\u0011b.";
        objectArray[42] = "n1igT]\u001b\u0011bhE\u0012z\u001ficAH\u000e";
        objectArray[43] = "{\u00191>b_p\u0016 q\u0002F|\u001a\"-";
        objectArray[44] = "`Q@H\u0003n7\\G-Wis~@HU\u00046\u0001EOTg>A\u0015U8";
        objectArray[45] = "e\u001b[H1]`DQD]ZZDXJ7_ O[A`3jM\u0011P1IaN\u001a\u0007]";
        objectArray[46] = "&RwwSb3[e96d5\u001fE Kv,\u000e\t-Zc&\u00183~YsscfvUcx\fw=LmH\u0006g\u007fTu\"\n0y\f\u001c#Yg)W~:^`}6";
        objectArray[47] = "TVM,vTR\u0005\u0019=\u0019EX\u0017I\u0002pKT\u0006$=aH\u0012\u0011B\"gBYk";
        objectArray[48] = "y3ILU0l:[\u00020!z~y\u0018W'k\u0002]\u0010O l8\u000e\u0013_u\u0017m\u0006\u001fO~x|M\u0006ANxd[\u0000W!vyH\u00020";
        objectArray[49] = "44\u0010\\1\u000e2gDM^\u000e)n\u0003P\u0000\u001c-t\u0014,>\f/b\u001f@f\fvky";
        objectArray[50] = ".f ?\u0018n&&p%twz'(4\u001f`\u0017dt2\u001a0p5(g\u000e\r,g#3Ij};v't4.3.1\u0017<nc4]";
        objectArray[51] = "5\u0006\u0019hvKf@MaLM\tB@ws\\`^Gn#'5N]f NiT]xL";
        objectArray[52] = "Q)Ns;]Q:[;\u0000RZ4Y'GB30],kJ_h]ub,Q)Ns;]Q:[;\u0000";
        objectArray[53] = "[\n+\u00010`E\u0006iV\f{QR-WKk8U/G}cTRi\u0004o\u0005[\n+\u00010`E\u0006iV\f";
        objectArray[54] = "\u001b\u0019^\u001bTR\u001dJ\n\n;M\u0001BX5RM\u001bI7\u0004\nJ\u0019\u0014X\u0015AS\u0017$";
        objectArray[55] = "\u00151,>\u0017`\u0015\"9v,M&\u0010\u000b\u0007Cx\u001e-}m\u0014u\u0019";
        objectArray[56] = "z'\u0018EY\u0011o.\n\u000b<\u0000yj'\u0013@o~z\u0019\u001bGU-y\tN<\u0000%u\u0019ES\u0011nl\u0017u_\u0010ig\u0000\u0019XV*uf";
        objectArray[57] = "k\u001eTQ\u0010\u0010v\u001bOP`@n\bM6\tOs\f7SXD`\\P\u0002\u0004\u0011ta";
        objectArray[58] = "\\\u0015&\u0012*7YJ,\u001eF3c\u0006{\u001dy\"\n\u001a|\u0004)Y\b@r\u000e';\u0011GuZF";
        objectArray[59] = "\u00002\u0014\u000e5\u0007Cl\u001aB\r\u0010Ssu\n4\u0019Xg\u0016\u0002tIB\u000bL\na\u0017VhDJ1\r:";
        objectArray[60] = "PQpep'V\u0002$t\u001f2I\u000bpiA5I\u0011t\u0015p:A\u0010~z~'R\u0012\u0019";
        objectArray[61] = "RV\u0011WY2G_\u0003\u0019<#Q\u001b#\u0000A&X\no\rP3R\u001cU^S#\u0007g\u0000V_3\f\b\u0011\u001dF=<\u0002\u0001_^%V\u000eVY\u0006L";
        objectArray[62] = "X\u0012a~sgM\u001bs0\u0016aK_T.\u007fc6Is1xb\f\u001ap!-\u0019Y\u0012|1&vHYe?\u0016\"\u000eLqsqsR\u0019eN}#XM~,d$_\u0019\u001f";
        objectArray[63] = "F\u001eL\"tZ^ULs\u000b~vvqKdKNK\u0007!3FI";
        objectArray[64] = "q!6\u0001\\\u001er+.\f3\u000b\u007f/+Qt\u001b\u0016/*ZC\u0016oq,\u0004]uq!6\u0001\\\u001er+.\f3";
        objectArray[65] = "9xRfy%dtAnF'nmgd#!{iPsFr:p\u0000141d~L\t";
        objectArray[66] = "\u0016y|U6(\u0002$#\u000f\u0007*\u0011=\u0007\u0000N8\u0017, \u0012\u00078\u0000>(\u0015=k\u0003.}nm>\u0013/=T>=\u0003zF\u0004k-\u0002:|Wh=WA";
        objectArray[67] = "e\u0005##\bEcVw2gR\u007fE 7\n`q\\7>g[v\u0000(:\rW!\u0006pS";
        objectArray[68] = "8IXf\u001f\n9I\u001f#\u007fKaf\u0003t\u001b[JE\u0019r\u0005V~T\u0005c\u007fXoA\u0007\"\u0015\u000fbFb F[dD\u0001(\u0006\u000b~(";
        objectArray[69] = "G\u007fd\f9\u0006Du|\u0001V\u0007Gr`\\?\u000b~|`L;mDibA5\u0014\u001ao<_V";
        objectArray[70] = "\n\u0003&[Uw\u000f\\,W9t5\u0010{T\u0006b\\\f|MV\u0019X\u0017qTUv\u0004\bzF9";
        objectArray[71] = " %*d\u0018*$>&<v\u0016\u0017\u0002ZY\u0019#/?,3N.(";
        objectArray[72] = "8d\u0004y-*=;\u000euA(\u0007wYv~?nk^o.Dl1Pe &u6W1A";
        objectArray[73] = "{37W+=x9/ZD\nM\u0001\u001aj+?u<l\u0000|2r";
        objectArray[74] = "WIbBsgB@p\f\u0016vT\u0004W\u0012\u007fc9\u0012p\rxb\u0003As\u001d-\u0019VI\u007f\r&vG\u0002f\u0003\u0016\"\u0001\u0017rOqs]Bfr";
        objectArray[75] = "2bY?rV'kKq\u0017G1/m~kE\\9KpySfjH`,(3bDp'G\")]~\u0017I$4\u001cuqV\">W\u000f";
        objectArray[76] = "'\tc\\\u0001\u00102\u0000q\u0012d\u00164DZ\u0006\u0006\u0003\"D\u001d\u0006\b\u0011'C'U\u000b\u0001r8r]\u0007\u0011yWc\u0016\u001e\u001fIRq\u0013\n\u0015s\u0001r\u0003_n\"\u0002s\u0002\u0005\f;\u0005tVd";
        objectArray[77] = "nt\u0004=\u0004<sq\u001f<tybo\u001ai3i\u000b0_k\u001a:la\u0003>\u000e\u0007nt\u0004=\u0004<sq\u001f<t";
        objectArray[78] = "/{NvM\u001e*$Dz!\u001a\u0010h\u0013y\u001e\u000byt\u0014`Np/{NvM\u001e*$Dz!";
        objectArray[79] = "p\u0004TK\u0011-e\rF\u0005t+cI`\u001c\u00137s\\L{\u001e?a[QAM<q\u000e*\u0014E0a\u0005E\u0005\u000e)o5N\u0007\u0012#}L\u0010\u0001L=\u001e^\u0010\u0015\u001a2|G\u0017\u0012NS";
        objectArray[80] = "\bxYt\u0012)Tt\u000e5|/8%_s\u00115_z\u00042LE";
        objectArray[81] = "gcs\u000b\u000eKrjaEkZd.V[\fOuRgW\u0014[rh4T\u0004\u000e\t=<X\u0014\u0005f,wA\u001a5i+kP\rY1+2Yk";
        objectArray[82] = ".\u0013]1T\u000e;\u001aO\u007f1\b=^ipM\u001d@HO~_\u000bz\u001bLn\np/\u0013@~\u0001\u001f>XYp1\u00118E\u0018{W\u000e>OS\u0001ZJ.LBcCM)\u0018#";
        objectArray[83] = "gG\u0012\u001f\u0012\u0004b\u001aIZu\u0014`\u0001sN\u0019\u0010c\u0006I\u001d\u001a\u00006}\u0019H\n\u0001vGJK\u001aT\r\u0016IJ\u001b\u000eo\u000fNMOo";
        objectArray[84] = "yMn-[\u0014|\u00105h<\u0010~\u000b\u000f|P\u0000}\f5/S\u0010(wezC\u0011hM6ySD\u0013";
        objectArray[85] = "d.!4\u0005\u007f|e!ezylz,0=i\u0005\u007f):A}c`/0\n\u0007d.!4\u0005\u007f|e!ez";
        objectArray[86] = "Dx0X\f\u001cQq\"\u0016i\rG5\u0004\u000f\u000e\u0006G (h\u0003\u000eU'5RP\rErN\u0007X\u0001Uy!\u0016\u0013\u0018[I*\u0014\u000f\u0012I0t\u0012Q\f*";
        objectArray[87] = "\u0001#a7(H\u0014*syMN\u0012nDg*L\u0013\u0012uk2X\u0014(&h\"\ro}.d2\u0006\u0000le}<6\u000fkyl+ZWk eM]U|qf/DR{%\u0007";
        objectArray[88] = "\u0015\u0006,m5\u000b\u0000\u000f>#P\r\u0006K\u001c97\u001c\u0007781/\u001b\u0000\rk2?N{Xc>/E\u0014I('!u\u0014Q>!7\u001a\u001aL-#P\u001eAY<<2\u0007F^h]";
        objectArray[89] = "\b\u0006c\u0006$%\r[8CC!\u000f@^L;#bSkT&u\b\u0004fSC";
        objectArray[90] = "LbCa3rI=Im_usq\u001en`g\u001am\u0019w0\u001c\u0019a\u0006}$&Jb\u0016(_";
        objectArray[91] = "}(t\u007f8\u0016`-o~HqI\u000fZF'Dq2,,pIv";
        objectArray[92] = "; \u001a\u001e'8?;\u0016FI&4;ZN\u000e6]:I\u001b+176\u001e\u001dsX; \u001a\u001e'8?;\u0016FI";
        objectArray[93] = "JNJY~\u001eO\u0011@U\u0012\u001bu]\u0017V-\u000b\u001cA\u0010O}p\u001fM\u000fEiJLN\u001f\u0010\u0012";
        objectArray[94] = "\u0013~\u0003](\rP \r\u0011\u0010\u001a@?,\u0001}\u001bE\u0001\u000b\u0005}\u007f\u0010~\u000e\u0002|\u001c\u0018>^\u0018\u0010F\u0010+\u0000\fsNP{\u001a`)FE%\u000e\u0003!\u0006\u0015?bY)\u0013K+\u0001QiCQG";
        objectArray[95] = ",\u0013f\u0005=\u001e9\u001atKX\u000f/^__:\r)^\u0018_4\u001f,Y\"\f7\u000fy\"w\u0004;\u001frMfO\"\u0011BHtJ6\u001bx\u001bwZc`";
        objectArray[96] = "vIV\u0005_65\u0017\\\u00108)g\u0010N\u0001\u007f9\u000e\u001bU\u0000D0a\u0015H\u0013FWvIV\u0005_65\u0017\\\u00108";
        objectArray[97] = "=<f__\u0011~bh\u0013g\u0006n}K\u000f\u001c\b\u0007<>\u000e\u0005\u000fd4~^\u001fc><k\u0000\u000b\u00006|;\u001ag";
        objectArray[98] = "Khrj\u001cJM;&{sPP)Es\u0017L[Uxe\u000e@P9\u007f#MR6";
        objectArray[99] = "\u0010m`\u0007\u001bl\u0005drI~j\u0003 _Q\u0002\u0012\u00140aY\u0005(G3q\f~}O?a\u0007\u0011l\u0004&o7\u001dm\u0003-x[\u001a+@?\u001e\\D|\u0010=|EC{D\\";
        objectArray[100] = "X\u0004\u0014v\u0012R\u001bZ\u001a:*Z\u000fC\u00181QMb\u0007L*\u0017\u0018\u0010D\u0012$[ ";
        objectArray[101] = "WX|\u0007blU\u0018w\u0016\u000e,G\u0000d\u000bI<.\u000b(\u0005qbA\u001ac\u001c\u007fRWX|\u0007blU\u0018w\u0016\u000e";
        objectArray[102] = "w\u0015_APgv\u0017X\u001440'\u0011kHQ62\u0015\\_4e#\u0002^\u001aY8/\u0011V%";
        objectArray[103] = "\\\f\u0018~G5B\u0000Z){\fnh.E\u00149VUX/C4Q";
        objectArray[104] = "3^Zm\u0017?1\u001eQ|{]\u001b:r\f\u0014h#\u0007\u0004fCe$";
        objectArray[105] = ":G\u001cgWMy\u0019\u0016r0p\u0013\"4\u000e_E+\u001fBd\bH,";
        objectArray[106] = "gW\u0003n*@b\b\tbFBXD^ayU1XYx).5CTa*Ai\\_sF";
        objectArray[107] = ">;\u001eCznm}JJ@k\u0002\u007fG\\\u007fykc@E/\u0002>sZM,kbiZS@";
        objectArray[108] = "\u0006\u0018\u0003\u001f$wQ\u0015\u0004z~f1\u000b\u000b\u001f~a\b\u000f\u0007z{a\u000f\u0001\t\u0003%gQ\u001fj";
        objectArray[109] = "H\u000f[a.U\\R\u0004;\u001f@_Ka0sP\\L[cp@\t7\u000b6`AI\rX5p\u00142";
        objectArray[110] = " +3\u001a~\b5\"!T\u001b\u0019#f\tM}\u0019Np!Uu\rt#\"E v!+.U+\u00190`7[\u001b\u0019\u007fy2\u001at\b4`<*";
        Object[] objectArray2 = objectArray;
        objectArray[111] = "OIY#/4Z@KmJ2\\\u0004ct,%!\u0012Kl$1\u001bAH|qJNIDlz%_\u0002]bJ%\u0010\u001bX#%4[\u0002V\u0013!pO\u0016Fq8wHB'";
    }

    public void c(Object[] objectArray) {
        cV cV2;
        long l;
        long l2;
        Object object;
        block8: {
            block9: {
                cV cV3;
                block10: {
                    block11: {
                        object = objectArray[0];
                        l2 = (Long)objectArray[1];
                        l = (l2 = i ^ l2) ^ 0x7051FE775725L;
                        CallSite callSite = cV.g("B", (long)6001918110421324292L, (long)l2);
                        try {
                            try {
                                try {
                                    try {
                                        cV2 = this;
                                        if (callSite != null) break block8;
                                        if (cV2.c) break block9;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw cV.g("B", (Object)illegalArgumentException, (long)6004513576179028662L, (long)l2);
                                    }
                                    cV3 = this;
                                    if (callSite != null) break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw cV.g("B", (Object)illegalArgumentException, (long)6004513576179028662L, (long)l2);
                                }
                                if (cV3.g != null) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cV.g("B", (Object)illegalArgumentException, (long)6004513576179028662L, (long)l2);
                            }
                            throw new IllegalStateException((String)((Object)cV.b("i", (int)22414, (long)(0x1422A7696C95C327L ^ l2))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cV.g("B", (Object)illegalArgumentException, (long)6004513576179028662L, (long)l2);
                        }
                    }
                    cV3 = this;
                }
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l;
                objectArray2[1] = object;
                objectArray2[0] = this.g;
                cV.g("c", (Object)cV3, (Object)objectArray2, (long)6003783543360151606L, (long)l2);
                return;
            }
            cV2 = this;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l;
        objectArray3[1] = object;
        objectArray3[0] = null;
        cV.g("c", (Object)cV2, (Object)objectArray3, (long)6003783543360151606L, (long)l2);
    }

    public static cV c(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = i ^ l) ^ 0x6DF1AE98CDFL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = string2;
        objectArray2[1] = string;
        objectArray2[0] = clazz;
        CallSite callSite = cV.g("B", (Object)objectArray2, (long)-8389963142183868243L, (long)l);
        return new cV((cX)((Object)callSite), null);
    }

    private Object c(Object[] objectArray) {
        CallSite callSite;
        block56: {
            CallSite callSite2;
            cV cV2;
            long l;
            block54: {
                CallSite callSite3;
                CallSite callSite4;
                block55: {
                    block52: {
                        block53: {
                            block50: {
                                block51: {
                                    block48: {
                                        block49: {
                                            block46: {
                                                block47: {
                                                    block44: {
                                                        block45: {
                                                            block42: {
                                                                block43: {
                                                                    Object object;
                                                                    CallSite callSite5;
                                                                    block40: {
                                                                        Object object2;
                                                                        block41: {
                                                                            object2 = objectArray[0];
                                                                            l = (Long)objectArray[1];
                                                                            l = i ^ l;
                                                                            callSite4 = cV.g("c", (Object)this.b, (long)8343020609509805739L, (long)l);
                                                                            callSite5 = cV.g("c", (Object)callSite4, (long)8342143065632079431L, (long)l);
                                                                            callSite3 = cV.g("B", (long)8343485890065445509L, (long)l);
                                                                            try {
                                                                                try {
                                                                                    object = this;
                                                                                    if (callSite3 != null) break block40;
                                                                                    if (!((cV)object).c) break block41;
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                                                }
                                                                                object = this.d;
                                                                                break block40;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                                            }
                                                                        }
                                                                        object = object2;
                                                                    }
                                                                    cV2 = object;
                                                                    try {
                                                                        if (callSite5 == false) {
                                                                            return cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8343461889220054732L, (long)l);
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            callSite = callSite4;
                                                                            callSite2 = cV.g("o", (long)8342885614871438799L, (long)l);
                                                                            if (callSite3 != null) break block42;
                                                                            if (callSite != callSite2) break block43;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                                        }
                                                                        return cV.g("B", (int)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8345208874095937477L, (long)l), (long)8346150432293403766L, (long)l);
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                                    }
                                                                }
                                                                callSite = callSite4;
                                                                callSite2 = cV.g("o", (long)8341839743178749694L, (long)l);
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite3 != null) break block44;
                                                                    if (callSite != callSite2) break block45;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                                }
                                                                return cV.g("B", (long)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8342248428175339001L, (long)l), (long)8342754337137332809L, (long)l);
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                            }
                                                        }
                                                        callSite = callSite4;
                                                        callSite2 = cV.g("o", (long)8344163519219680172L, (long)l);
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block46;
                                                            if (callSite != callSite2) break block47;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                        }
                                                        return cV.g("B", (boolean)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8343938218898699981L, (long)l), (long)8344612252006078293L, (long)l);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                    }
                                                }
                                                callSite = callSite4;
                                                callSite2 = cV.g("o", (long)8345665553838287928L, (long)l);
                                            }
                                            try {
                                                try {
                                                    if (callSite3 != null) break block48;
                                                    if (callSite != callSite2) break block49;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                                }
                                                return cV.g("B", (byte)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8344262001665118488L, (long)l), (long)8343864030928069472L, (long)l);
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                            }
                                        }
                                        callSite = callSite4;
                                        callSite2 = cV.g("o", (long)8343143989889913851L, (long)l);
                                    }
                                    try {
                                        try {
                                            if (callSite3 != null) break block50;
                                            if (callSite != callSite2) break block51;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                        }
                                        return cV.g("B", (char)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8344207435071660616L, (long)l), (long)8344406109756864886L, (long)l);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                    }
                                }
                                callSite = callSite4;
                                callSite2 = cV.g("o", (long)8346252835329841559L, (long)l);
                            }
                            try {
                                try {
                                    if (callSite3 != null) break block52;
                                    if (callSite != callSite2) break block53;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                                }
                                return cV.g("B", (short)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8343579338539889540L, (long)l), (long)8346035644368692761L, (long)l);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                            }
                        }
                        callSite = callSite4;
                        callSite2 = cV.g("o", (long)8341886892185291265L, (long)l);
                    }
                    try {
                        try {
                            if (callSite3 != null) break block54;
                            if (callSite != callSite2) break block55;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                        }
                        return cV.g("B", (float)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8345777549600855043L, (long)l), (long)8342418566254695214L, (long)l);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                    }
                }
                try {
                    callSite = callSite4;
                    if (callSite3 != null) break block56;
                    callSite2 = cV.g("o", (long)8345106763986280886L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
                }
            }
            try {
                if (callSite == callSite2) {
                    return cV.g("B", (double)cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8345529266549065122L, (long)l), (long)8343246661437480889L, (long)l);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw cV.g("B", (Object)illegalArgumentException, (long)8346662997507797559L, (long)l);
            }
            callSite = cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)8343461889220054732L, (long)l);
        }
        return callSite;
    }

    private static Method h(long l, long l2) {
        int n = cV.e(l, l2);
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
                clazz3 = cV.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cV.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cV.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cV.B[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cV.f(1156375953615747L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cV.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cV.B[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cV.f(1156375953615747L, 0L);
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
            int n = cV.e(l, l2);
            object = B[n];
            try {
                if (!(object instanceof String)) break block2;
                cV.B[n] = clazz = Class.forName(C[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public bQ f(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x4E2B6BD2979EL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = object;
        return cV.g("c", (Object)this, (Object)objectArray2, (long)1635002713323896577L, (long)l);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static cV d(Object[] objectArray) {
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
                l = (l2 = i ^ l2) ^ 0x44823AF77BF4L;
                CallSite callSite = cV.g("B", (long)8981148857811975660L, (long)l2);
                try {
                    try {
                        object = object2;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cV.g("B", (Object)illegalArgumentException, (long)8988123541279178078L, (long)l2);
                    }
                    throw new IllegalArgumentException((String)((Object)cV.b("i", (int)27533, (long)(0x5B4187CBE47750CDL ^ l2))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)8988123541279178078L, (long)l2);
                }
            }
            object = object2;
        }
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l;
        objectArray2[2] = string;
        objectArray2[1] = string2;
        objectArray2[0] = object.getClass();
        CallSite callSite = cV.g("B", (Object)objectArray2, (long)8987951910700736390L, (long)l2);
        return new cV((cX)((Object)callSite), object2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cV.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cV.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cV.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cV.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public bQ d(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = i ^ l;
        try {
            if (object == null) {
                throw new IllegalArgumentException((String)((Object)cV.b("i", (int)12972, (long)(0xFC1A2C40586B10CL ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cV.g("B", (Object)illegalArgumentException, (long)4926778627456583101L, (long)l);
        }
        try {
            if (this.c) {
                throw new IllegalStateException((String)((Object)cV.b("i", (int)6901, (long)(0x41538C7B5A959954L ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw cV.g("B", (Object)illegalArgumentException, (long)4926778627456583101L, (long)l);
        }
        return new bQ(this, object);
    }

    private void d(Object[] objectArray) {
        block59: {
            CallSite callSite;
            CallSite callSite2;
            cV cV2;
            long l;
            Object object;
            block70: {
                CallSite callSite3;
                CallSite callSite4;
                block68: {
                    block66: {
                        block64: {
                            block62: {
                                block60: {
                                    block57: {
                                        block55: {
                                            block56: {
                                                Object object2;
                                                block53: {
                                                    Object object3;
                                                    block54: {
                                                        object3 = objectArray[0];
                                                        object = objectArray[1];
                                                        l = (Long)objectArray[2];
                                                        l = i ^ l;
                                                        callSite4 = cV.g("c", (Object)this.b, (long)5069945074452036415L, (long)l);
                                                        callSite3 = cV.g("B", (long)5070570573855819537L, (long)l);
                                                        try {
                                                            try {
                                                                object2 = this;
                                                                if (callSite3 != null) break block53;
                                                                if (!((cV)object2).c) break block54;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                            }
                                                            object2 = this.d;
                                                            break block53;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                        }
                                                    }
                                                    object2 = object3;
                                                }
                                                cV2 = object2;
                                                try {
                                                    try {
                                                        callSite2 = callSite4;
                                                        if (callSite3 != null) break block55;
                                                        if (cV.g("c", (Object)callSite2, (long)5066958388975422419L, (long)l) != false) break block56;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                    }
                                                    cV.g("c", (Object)a, (Object)cV2, (long)this.e, (Object)object, (long)5069191343469132836L, (long)l);
                                                    return;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                }
                                            }
                                            callSite2 = callSite4;
                                        }
                                        try {
                                            block58: {
                                                try {
                                                    try {
                                                        callSite = cV.g("o", (long)5067586866309288027L, (long)l);
                                                        if (callSite3 != null) break block57;
                                                        if (callSite2 != callSite) break block58;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                    }
                                                    cV.g("c", (Object)a, (Object)cV2, (long)this.e, (int)cV.g("c", (Object)((Number)object), (long)5067380469488866735L, (long)l), (long)5067286181481797263L, (long)l);
                                                    if (callSite3 == null) break block59;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                }
                                            }
                                            callSite2 = callSite4;
                                            callSite = cV.g("o", (long)5066661906392777578L, (long)l);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                        }
                                    }
                                    try {
                                        block61: {
                                            try {
                                                try {
                                                    if (callSite3 != null) break block60;
                                                    if (callSite2 != callSite) break block61;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                                }
                                                cV.g("c", (Object)a, (Object)cV2, (long)this.e, (long)cV.g("c", (Object)((Number)object), (long)5064257630933310060L, (long)l), (long)5067009698045898790L, (long)l);
                                                if (callSite3 == null) break block59;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                            }
                                        }
                                        callSite2 = callSite4;
                                        callSite = cV.g("o", (long)5068838379872908856L, (long)l);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                    }
                                }
                                try {
                                    block63: {
                                        try {
                                            try {
                                                if (callSite3 != null) break block62;
                                                if (callSite2 != callSite) break block63;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                            }
                                            cV.g("c", (Object)a, (Object)cV2, (long)this.e, (boolean)cV.g("c", (Object)((Boolean)object), (long)5069653414791216564L, (long)l), (long)5069283721621066180L, (long)l);
                                            if (callSite3 == null) break block59;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                        }
                                    }
                                    callSite2 = callSite4;
                                    callSite = cV.g("o", (long)5063611406018058668L, (long)l);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                }
                            }
                            try {
                                block65: {
                                    try {
                                        try {
                                            if (callSite3 != null) break block64;
                                            if (callSite2 != callSite) break block65;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                        }
                                        cV.g("c", (Object)a, (Object)cV2, (long)this.e, (byte)cV.g("c", (Object)((Number)object), (long)5062523892725340805L, (long)l), (long)5070749598812024538L, (long)l);
                                        if (callSite3 == null) break block59;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                    }
                                }
                                callSite2 = callSite4;
                                callSite = cV.g("o", (long)5070068452828309103L, (long)l);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                            }
                        }
                        try {
                            block67: {
                                try {
                                    try {
                                        if (callSite3 != null) break block66;
                                        if (callSite2 != callSite) break block67;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                    }
                                    cV.g("c", (Object)a, (Object)cV2, (long)this.e, (char)cV.g("c", (Object)((Character)object), (long)5063235380920370443L, (long)l), (long)5063725101119007233L, (long)l);
                                    if (callSite3 == null) break block59;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                }
                            }
                            callSite2 = callSite4;
                            callSite = cV.g("o", (long)5064180819380317187L, (long)l);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                        }
                    }
                    try {
                        block69: {
                            try {
                                try {
                                    if (callSite3 != null) break block68;
                                    if (callSite2 != callSite) break block69;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                                }
                                cV.g("c", (Object)a, (Object)cV2, (long)this.e, (short)cV.g("c", (Object)((Number)object), (long)5063764530922426098L, (long)l), (long)5070982472859771403L, (long)l);
                                if (callSite3 == null) break block59;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                            }
                        }
                        callSite2 = callSite4;
                        callSite = cV.g("o", (long)5066576837121752981L, (long)l);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                    }
                }
                try {
                    block71: {
                        try {
                            try {
                                if (callSite3 != null) break block70;
                                if (callSite2 != callSite) break block71;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                            }
                            cV.g("c", (Object)a, (Object)cV2, (long)this.e, (float)cV.g("c", (Object)((Number)object), (long)5063569382396152081L, (long)l), (long)5069998186950572631L, (long)l);
                            if (callSite3 == null) break block59;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                        }
                    }
                    callSite2 = callSite4;
                    callSite = cV.g("o", (long)5069798943784735778L, (long)l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
                }
            }
            try {
                if (callSite2 == callSite) {
                    cV.g("c", (Object)a, (Object)cV2, (long)this.e, (double)cV.g("c", (Object)((Number)object), (long)5069571571169558387L, (long)l), (long)5062584883553283430L, (long)l);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw cV.g("B", (Object)illegalArgumentException, (long)5062328428627576739L, (long)l);
            }
        }
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x50BC;
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
                throw new RuntimeException("dev/zprestige/prestige/cV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cV.u[n2] = n3;
        }
        return u[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cV.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static bR a(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        Class clazz2 = (Class)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = i ^ l;
        long l3 = l2 ^ 0x7B7BF630B768L;
        long l4 = l2 ^ 0x4883047AFD74L;
        long l5 = l2 ^ 0x362CFC884F2BL;
        try {
            CallSite callSite = cV.g("B", (Object)clazz2, (long)-421566374625067806L, (long)l);
            CallSite callSite2 = cV.g("c", (Object)cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)-419144938565580617L, (long)l), (long)-421355098927955117L, (long)l), (long)-419320967068571365L, (long)l), (Object)cV.g("c", (Object)cV.g("c", (Object)clazz, (long)-415352828073352796L, (long)l), (char)cV.d("e", (int)5969, (long)(0x31B8CBF4B01A3DDAL ^ l)), (char)cV.d("e", (int)15785, (long)(0x3728CB0E3891721L ^ l)), (long)-415462355449070304L, (long)l), (long)-416132281696131839L, (long)l);
            CallSite callSite3 = cV.g("c", (Object)cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)-419144938565580617L, (long)l), (long)-421355098927955117L, (long)l), (long)-419320967068571365L, (long)l), (Object)callSite, (long)-419055400221477714L, (long)l);
            CallSite callSite4 = cV.g("c", (Object)cV.g("c", (Object)cV.g("B", (long)-419144938565580617L, (long)l), (long)-421355098927955117L, (long)l), (Object)callSite2, (Object)string, (Object)callSite3, (long)-423117733470493009L, (long)l);
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = l4;
            objectArray2[2] = callSite;
            objectArray2[1] = callSite4;
            objectArray2[0] = clazz;
            CallSite callSite5 = cV.g("B", (Object)objectArray2, (long)-415577302142691066L, (long)l);
            return new bR((cX)((Object)callSite5), l3);
        }
        catch (Throwable throwable) {
            return new bR(clazz, string, clazz2, l5);
        }
    }

    public static cV a(Object[] objectArray) {
        Class clazz = (Class)objectArray[0];
        String string = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = i ^ l) ^ 0x96ADE60F005L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = string;
        objectArray2[0] = clazz;
        CallSite callSite = cV.g("B", (Object)objectArray2, (long)6965865690279151037L, (long)l);
        return new cV((cX)((Object)callSite), null);
    }

    /*
     * Loose catch block
     */
    public Object a(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x70B1BFF5A0CEL;
        CallSite callSite = cV.g("B", (long)1613481936812889899L, (long)l);
        try {
            Object object2;
            block20: {
                block21: {
                    block16: {
                        block17: {
                            Object object3;
                            block18: {
                                block19: {
                                    block23: {
                                        block15: {
                                            Object object4;
                                            block14: {
                                                object4 = a;
                                                if (callSite != null) break block14;
                                                try {
                                                    block22: {
                                                        if (object4 == null) break block15;
                                                        break block22;
                                                        catch (IllegalAccessException illegalAccessException) {
                                                            throw cV.g("B", (Object)illegalAccessException, (long)1620016815276103577L, (long)l);
                                                        }
                                                    }
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[1] = l2;
                                                    objectArray2[0] = object;
                                                    object4 = cV.g("c", (Object)this, (Object)objectArray2, (long)1614348468773535173L, (long)l);
                                                }
                                                catch (IllegalAccessException illegalAccessException) {
                                                    throw cV.g("B", (Object)illegalAccessException, (long)1620016815276103577L, (long)l);
                                                }
                                            }
                                            return object4;
                                        }
                                        object2 = this;
                                        if (callSite != null) break block16;
                                        if (((cV)object2).f == null) break block17;
                                        break block23;
                                        catch (IllegalAccessException illegalAccessException) {
                                            throw cV.g("B", (Object)illegalAccessException, (long)1620016815276103577L, (long)l);
                                        }
                                    }
                                    try {
                                        block24: {
                                            object3 = this;
                                            if (callSite != null) break block18;
                                            break block24;
                                            catch (IllegalAccessException illegalAccessException) {
                                                throw cV.g("B", (Object)illegalAccessException, (long)1620016815276103577L, (long)l);
                                            }
                                        }
                                        if (!((cV)object3).c) break block19;
                                    }
                                    catch (IllegalAccessException illegalAccessException) {
                                        throw cV.g("B", (Object)illegalAccessException, (long)1620016815276103577L, (long)l);
                                    }
                                    return this.f.get();
                                }
                                object3 = this.f.get(object);
                            }
                            return object3;
                        }
                        object2 = this;
                    }
                    try {
                        if (callSite != null) break block20;
                        if (!((cV)object2).c) break block21;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw cV.g("B", (Object)illegalAccessException, (long)1620016815276103577L, (long)l);
                    }
                    return cV.g("c", (Object)this.b, null, (long)1613734337312384216L, (long)l);
                }
                object2 = cV.g("c", (Object)this.b, (Object)object, (long)1613734337312384216L, (long)l);
            }
            return object2;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    public static bQ a(Object[] objectArray) {
        Object object = objectArray[0];
        String string = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = i ^ l;
        long l3 = l2 ^ 0x6CB708CB7FBCL;
        long l4 = l2 ^ 0x79ECB626345CL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = string;
        objectArray2[0] = object;
        CallSite callSite = cV.g("B", (Object)objectArray2, (long)1613035721393340815L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return cV.g("c", (Object)callSite, (Object)objectArray3, (long)1612478970337670487L, (long)l);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public Field a(Object[] objectArray) {
        return this.b;
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = cV.e(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            String string = C[n];
            int n2 = string.indexOf(8);
            Class clazz = cV.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cV.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cV.c(clazz3, string2, clazz2)) != null) {
                    cV.B[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cV.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cV.B[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cV.f(1156375953615747L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cV.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cV.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cV.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


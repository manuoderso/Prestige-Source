/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

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
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.cx
 */
class cx_0 {
    private static final Map a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    private cx_0() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                cx_0.b = hc.a(2040244872391219718L, 5261804392131582793L, MethodHandles.lookup().lookupClass()).a(28853386187543L);
                var11 = cx_0.b ^ 21907191961647L;
                cx_0.c = new Object[16];
                cx_0.d = new String[16];
                cx_0.a();
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[108];
                var4_4 = 0;
                var5_5 = "L\u0096yiB-R\u00e7\u00a2CG\u00b1\u00f1v\u00b9,H0\u00ba\u00ac6\u0082|\u00de\u0012\u008ae=\u0006\u0002BtU\u00a6j\f\u00ba\u00be>\u0092\u008b\u00e5\u0017\u00b9\u00ff\u0093'\u0000\u0095\u007fPw\u00c4\b\u00e7\u00ba\u0018r\b\u00f2j9R\u00d4\u000b\n\u00c4\u009c6!T\u0084\u00f9\u0080\u00eb\u00c0\u00f9\u00a7\b\u00d8\u008f\u00c8\u0095\u00d5\u001f\u0095E\u0089\u008f^\u00d3~37\u0000-\u00c6\u00b6\u00b9\u0082\u00fdv\u0097\u00f1\u00d6\u00ce<\u00c0\u00e7\u001fB\u0004\u00cd\u00c5\u0012\u0099\u00ec\u00a2o\u00a6.6\u00baX||\u001a\u00b4K.\u00d5\u00fdM\u00b1\u00b6\u008eyQ\u00aa\u000f\u0095\u007fyW\u00f1\u00e5O\u0080\u00ce\u00d4\"\u00e5\u008a\u0010\u00d6\u00bbubxS\u00c3\u00f5\u00a9\u00a1\u0000\u00d6!\u00d9\u00e2,D%9\u00bc\u00c9\u0011\u0094\u0007\u00c9\u00a5\u00ba\u0011+5h\u00e3[\u00ba\u00c7\u00a2M<\u00151\u00bavU\u008b6f\u00c9\u00c3\u0006\u00ca\u0090\u008d\u00cb\u008a\u0094\u00e0\u0099\u00fbqTnJ\u00c9U\u0097\u00b3,\u00b1b\"\u00fa\u00ec\u0003`\u0080\u0084\u0016.7\u009cYK\u008e\u00f2\u00fd\u00cf\u0019\"Q\u009dR\u00b6\u0095p\u00e2\u00c1\u009e\u00b98\u009b\"\u0011\u00d1\u00f3\u00b3\u00ad\u0003\u0015\u0095\u000b\u00dfV1f\u00e5\u0004\u00b1\u00e1\u00c1\u0085\u00f5\u00b3G\u0015+\u0019g\u00f9\u00f9\u00a2~\u00b5iM'^{\u0095\u00c3\u0014\r\f5\u00a3\u0012\u00bd\u00ee@\u0086[\u00cc*SJ\u00d6\u001d\u0005\u00bd\u00b8\u00f5)\u00d1\u00a9pq\u00cbYE\u00f6\u0010e\u0019\u00cd\u00e9\u00d42x\u0019_\u00fdp\u00e9\u009f|\u00da\u0015@\\\u0000\u00f3\u00c4\u0099\u00ed\u00f4U\u008fM\u0011\u0087w\u00f5\u00da=\u00edG\u009d*\u0085\u00a6\u00f6\u0090f\u00fd\u0016\u00c5/C8X<j\u008eR\u00eb\u0018l\u00e4;\u00a3\u00f1`b\u00a7\u0086g\u00c3-(\u009d\u00fe\u0016\u00fa\u009fO\u00bf\u00eb&6\u00bf\u0010\u00f2=\u00f0\u00f9h\u00a8W5\u00fc\u00a7}\u00cd\u00a6\u00bb0S\u00a2\u001e\u00a6\u00e9o@r\u0082\u00a4\u0014(Zlc3\u00a5koR\u00b8BU\u00a6l0J3\u00d2\u00b6zn\u0018Sx\u000e9\u00b5\u0089C\r\u00d4\u0098\u0013'\u00bb\u00b6\u00b3\u00df\u00a04H\u008bd\u0010=CF\u0082T\u00e2\u00a1\u00e3?\u008b=\u00eb\u00c8\u00ab\u00a3)\u00c7\u00e9\u0098m\u009d\u00b6o\u00f2\u0084\u00a3\u007fO\u0082\u0013\u00ee\u00cfY\u00c8Y\u0092\u00c1\u00ac?B\u0085\u001c\u0082\u001f\u0087aQt\u00cd\u0080\u00a3}3\u00117\u001b|\u0085\u00c6,\u00aa{Uh\u0099>\u000e\u00e8?\u009b\u0001[\u00c9\u00ca\u00ed\u00b7+ss2\u00c9\u008b\u0089\u0015\u00de:p\u0083*\t#\\\u00c0c{\u00b7S\u00d9\u009d\u0098\u0013\u008b\u00ac\u008a\u009bV}`\u00f2)\u00c5Ub\u00c9\u00d2@\u0006\u00a1\u001c\u00f6\u00bd\u00f8Z\u00c5\u00c93=AMm\u00bb*\u00de\u0099\u00bf-\u0095\u00bd\u0012Bw\u0096i\u001e\u009a\u00a2V\u008e\u00f4\u0002\u00d7\u0011$\u00de\u00e0z\r\u0018lS\u000f:):j\u001b\u00cboh\u009f\u00b3\u00e6bH\u00ba\u00b5S\u001d\u0092Ru\u00e6+\u00e1@e\u00d5/\u00f3\u009b\u0000\u0017\u009c\u0007\u00df\u00b7.\u0006TW\u0080z\u00fdQ\u00ec)?4\u000b\u0090\u00eeWG\u00af\u0018\u00a0\u00a6\u00dd0`\u00a6\u0005\u0095Z\u00fd\u00de1K\b\u009fm\\O\u0001\u009d\u0091\u00ac\u0088\u00dfE\u008b\u0089\u0013\u00e9\u00a1L\u008b\u00d3!\u00cc\u00e0\u00c5\u00c5\u00cbv;\u00f6\u00b9\u00ed\u0092\u00951\u00b4\u0092\u00e6b\u00b2\u00fa|9\u007f?<(\u000b\u00aeK\u009cig\u0098\u00f5\u00ce\u00a7\u0014\u00bflu\u00b5]\r\u00018>H\u00b3l@\u0091\u0082M\u00f1i\u0011bw\u00d2\u00d3\u00a5~\u00ad\u00df\u0099\u00cbnGNb\u00e4\u00a4j\u00efp\u0080d\u00a0\u00bf\u00e7\u0010lT\u00dd\u008e\u00f4\u00b6\u00a8\u0005H\u0014Z\u0011\u00baO\u00c6\u00e2yW\u00b8\u0016\u000b}\u00d1\n;n\\\f\u00e7\u0094Y\u00d2\u0086*\u00b2\u00a7\u00c9\u00c9]H\u0007\u0085\u00a7\u0084\u0096";
                var6_6 = "L\u0096yiB-R\u00e7\u00a2CG\u00b1\u00f1v\u00b9,H0\u00ba\u00ac6\u0082|\u00de\u0012\u008ae=\u0006\u0002BtU\u00a6j\f\u00ba\u00be>\u0092\u008b\u00e5\u0017\u00b9\u00ff\u0093'\u0000\u0095\u007fPw\u00c4\b\u00e7\u00ba\u0018r\b\u00f2j9R\u00d4\u000b\n\u00c4\u009c6!T\u0084\u00f9\u0080\u00eb\u00c0\u00f9\u00a7\b\u00d8\u008f\u00c8\u0095\u00d5\u001f\u0095E\u0089\u008f^\u00d3~37\u0000-\u00c6\u00b6\u00b9\u0082\u00fdv\u0097\u00f1\u00d6\u00ce<\u00c0\u00e7\u001fB\u0004\u00cd\u00c5\u0012\u0099\u00ec\u00a2o\u00a6.6\u00baX||\u001a\u00b4K.\u00d5\u00fdM\u00b1\u00b6\u008eyQ\u00aa\u000f\u0095\u007fyW\u00f1\u00e5O\u0080\u00ce\u00d4\"\u00e5\u008a\u0010\u00d6\u00bbubxS\u00c3\u00f5\u00a9\u00a1\u0000\u00d6!\u00d9\u00e2,D%9\u00bc\u00c9\u0011\u0094\u0007\u00c9\u00a5\u00ba\u0011+5h\u00e3[\u00ba\u00c7\u00a2M<\u00151\u00bavU\u008b6f\u00c9\u00c3\u0006\u00ca\u0090\u008d\u00cb\u008a\u0094\u00e0\u0099\u00fbqTnJ\u00c9U\u0097\u00b3,\u00b1b\"\u00fa\u00ec\u0003`\u0080\u0084\u0016.7\u009cYK\u008e\u00f2\u00fd\u00cf\u0019\"Q\u009dR\u00b6\u0095p\u00e2\u00c1\u009e\u00b98\u009b\"\u0011\u00d1\u00f3\u00b3\u00ad\u0003\u0015\u0095\u000b\u00dfV1f\u00e5\u0004\u00b1\u00e1\u00c1\u0085\u00f5\u00b3G\u0015+\u0019g\u00f9\u00f9\u00a2~\u00b5iM'^{\u0095\u00c3\u0014\r\f5\u00a3\u0012\u00bd\u00ee@\u0086[\u00cc*SJ\u00d6\u001d\u0005\u00bd\u00b8\u00f5)\u00d1\u00a9pq\u00cbYE\u00f6\u0010e\u0019\u00cd\u00e9\u00d42x\u0019_\u00fdp\u00e9\u009f|\u00da\u0015@\\\u0000\u00f3\u00c4\u0099\u00ed\u00f4U\u008fM\u0011\u0087w\u00f5\u00da=\u00edG\u009d*\u0085\u00a6\u00f6\u0090f\u00fd\u0016\u00c5/C8X<j\u008eR\u00eb\u0018l\u00e4;\u00a3\u00f1`b\u00a7\u0086g\u00c3-(\u009d\u00fe\u0016\u00fa\u009fO\u00bf\u00eb&6\u00bf\u0010\u00f2=\u00f0\u00f9h\u00a8W5\u00fc\u00a7}\u00cd\u00a6\u00bb0S\u00a2\u001e\u00a6\u00e9o@r\u0082\u00a4\u0014(Zlc3\u00a5koR\u00b8BU\u00a6l0J3\u00d2\u00b6zn\u0018Sx\u000e9\u00b5\u0089C\r\u00d4\u0098\u0013'\u00bb\u00b6\u00b3\u00df\u00a04H\u008bd\u0010=CF\u0082T\u00e2\u00a1\u00e3?\u008b=\u00eb\u00c8\u00ab\u00a3)\u00c7\u00e9\u0098m\u009d\u00b6o\u00f2\u0084\u00a3\u007fO\u0082\u0013\u00ee\u00cfY\u00c8Y\u0092\u00c1\u00ac?B\u0085\u001c\u0082\u001f\u0087aQt\u00cd\u0080\u00a3}3\u00117\u001b|\u0085\u00c6,\u00aa{Uh\u0099>\u000e\u00e8?\u009b\u0001[\u00c9\u00ca\u00ed\u00b7+ss2\u00c9\u008b\u0089\u0015\u00de:p\u0083*\t#\\\u00c0c{\u00b7S\u00d9\u009d\u0098\u0013\u008b\u00ac\u008a\u009bV}`\u00f2)\u00c5Ub\u00c9\u00d2@\u0006\u00a1\u001c\u00f6\u00bd\u00f8Z\u00c5\u00c93=AMm\u00bb*\u00de\u0099\u00bf-\u0095\u00bd\u0012Bw\u0096i\u001e\u009a\u00a2V\u008e\u00f4\u0002\u00d7\u0011$\u00de\u00e0z\r\u0018lS\u000f:):j\u001b\u00cboh\u009f\u00b3\u00e6bH\u00ba\u00b5S\u001d\u0092Ru\u00e6+\u00e1@e\u00d5/\u00f3\u009b\u0000\u0017\u009c\u0007\u00df\u00b7.\u0006TW\u0080z\u00fdQ\u00ec)?4\u000b\u0090\u00eeWG\u00af\u0018\u00a0\u00a6\u00dd0`\u00a6\u0005\u0095Z\u00fd\u00de1K\b\u009fm\\O\u0001\u009d\u0091\u00ac\u0088\u00dfE\u008b\u0089\u0013\u00e9\u00a1L\u008b\u00d3!\u00cc\u00e0\u00c5\u00c5\u00cbv;\u00f6\u00b9\u00ed\u0092\u00951\u00b4\u0092\u00e6b\u00b2\u00fa|9\u007f?<(\u000b\u00aeK\u009cig\u0098\u00f5\u00ce\u00a7\u0014\u00bflu\u00b5]\r\u00018>H\u00b3l@\u0091\u0082M\u00f1i\u0011bw\u00d2\u00d3\u00a5~\u00ad\u00df\u0099\u00cbnGNb\u00e4\u00a4j\u00efp\u0080d\u00a0\u00bf\u00e7\u0010lT\u00dd\u008e\u00f4\u00b6\u00a8\u0005H\u0014Z\u0011\u00baO\u00c6\u00e2yW\u00b8\u0016\u000b}\u00d1\n;n\\\f\u00e7\u0094Y\u00d2\u0086*\u00b2\u00a7\u00c9\u00c9]H\u0007\u0085\u00a7\u0084\u0096".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block20;
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00e8\u00a3\\\u00b8\u0095\u0082\u00aa8P\u00f4\u00c9\u00c3\u00de\u00f7%\u00d1";
                    var6_6 = "\u00e8\u00a3\\\u00b8\u0095\u0082\u00aa8P\u00f4\u00c9\u00c3\u00de\u00f7%\u00d1".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl59:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block21;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl72:
                // 1 sources

                ** continue;
            }
        }
        cx_0.a = new HashMap<K, V>();
        try {
            for (var13_11 = 0; var13_11 < (int)var0_3[34]; ++var13_11) {
                cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[59] + var13_11), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[2] + var13_11), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
            }
        }
        catch (MatchException v8) {
            throw cx_0.a("X", (Object)v8, (long)7025779749678318464L, (long)var11);
        }
        try {
            for (var13_11 = 0; var13_11 < (int)var0_3[18]; ++var13_11) {
                cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[47] + var13_11), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[9] + var13_11), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
            }
        }
        catch (MatchException v9) {
            throw cx_0.a("X", (Object)v9, (long)7025779749678318464L, (long)var11);
        }
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[63]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[97]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[26]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[20]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[71]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[13]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[25]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[105]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[99]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[56]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[3]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[4]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[68]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[96]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[41]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[49]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[46]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[88]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[30]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[43]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[91]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[86]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[5]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[60]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[44]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[14]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[54]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[61]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[27]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[0]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[35]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[45]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[76]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[67]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[10]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[11]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[29]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[33]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[90]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[87]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[93]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[79]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[82]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[80]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[102]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[16]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[36]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[77]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[52]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[106]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[1]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[23]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[40]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[73]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[38]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[69]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[42]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[64]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[103]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[39]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[57]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[31]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[101]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[53]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        try {
            for (var13_11 = 0; var13_11 < (int)var0_3[104]; ++var13_11) {
                cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[107] + var13_11), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[17] + var13_11), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
            }
        }
        catch (MatchException v10) {
            throw cx_0.a("X", (Object)v10, (long)7025779749678318464L, (long)var11);
        }
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[70]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[48]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[94]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[24]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[58]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[55]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[6]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[66]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[85]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[74]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[37]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[51]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[92]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[83]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[89]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[75]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[32]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[95]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[28]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[15]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[72]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[12]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        try {
            for (var13_11 = 0; var13_11 < (int)var0_3[78]; ++var13_11) {
                cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[7] + var13_11), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[100] + var13_11), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
            }
        }
        catch (MatchException v11) {
            throw cx_0.a("X", (Object)v11, (long)7025779749678318464L, (long)var11);
        }
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[65]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[50]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[21]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[62]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[19]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[84]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[8]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[81]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
        cx_0.a("\u00dc", (Object)cx_0.a, (Object)cx_0.a("X", (int)((int)var0_3[22]), (long)7025910508105461568L, (long)var11), (Object)cx_0.a("X", (int)((int)var0_3[98]), (long)7025910508105461568L, (long)var11), (long)7026101322674548983L, (long)var11);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cx_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cx_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cx_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cx_0.b(classArray[i], string, clazz2);
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
            int n = cx_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                cx_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = cx_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = cx_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cx_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cx_0.a(clazz3, string2, clazz2)) != null) {
                    cx_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cx_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cx_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cx_0.b(556555060483545L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cx_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = cx_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cx_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cx_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cx_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cx_0.b(556555060483545L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cx_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cx_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cx_0.b(556555060483545L, 0L);
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

    public static int a(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l;
            int n;
            block5: {
                n = (Integer)objectArray[0];
                l = (Long)objectArray[1];
                l = b ^ l;
                CallSite callSite2 = cx_0.a("X", (long)3766275178621111865L, (long)l);
                try {
                    try {
                        callSite = cx_0.a("\u00dc", (Object)a, (Object)cx_0.a("X", (int)n, (long)3766463482033617540L, (long)l), (long)3766366650084085814L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw cx_0.a("X", (Object)matchException, (long)3766332551814370884L, (long)l);
                    }
                    return n;
                }
                catch (MatchException matchException) {
                    throw cx_0.a("X", (Object)matchException, (long)3766332551814370884L, (long)l);
                }
            }
            callSite = cx_0.a("\u00dc", (Object)((Integer)((Object)cx_0.a("\u00dc", (Object)a, (Object)cx_0.a("X", (int)n, (long)3766463482033617540L, (long)l), (Object)cx_0.a("X", (int)n, (long)3766463482033617540L, (long)l), (long)3766535387859352588L, (long)l))), (long)3766663555933007205L, (long)l);
        }
        return (int)callSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == '\u00d8' || c == '\u00fc' || c == '\u00a2') {
                field = cx_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cx_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cx_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "j\u0000)dU6|\u0000,>F!kK/8J5z\f8/\u0001'F";
        objectArray[1] = "m4\u0012i$W\u0018\u0014\u0019f5\u0018e\f\na<Q\r";
        objectArray[2] = "&,\"\u000eeJ0,'Tv]'g$RzI6 3E1Y:";
        objectArray[3] = "X=\u0019O\u0000 S2\b\u0000c-F?\u0007kV/W,\u001bGA\"";
        objectArray[4] = "tA\u007feCo\u007fNn*$mjEna\u001f";
        objectArray[5] = Integer.TYPE;
        cx_0.d[5] = "java/lang/Integer";
        objectArray[6] = "`\u0019&\u0012,5~\u0011<]O!z";
        objectArray[7] = "A6\r}?SJ9\u001c2^]A2\u0018h";
        objectArray[8] = Boolean.TYPE;
        cx_0.d[8] = "java/lang/Boolean";
        objectArray[9] = "/]m,C\u001c+U+T\u0016wsS;?L\u0006w^8:|";
        objectArray[10] = "\u0003\u0005\"8/nH\t!>\u0016=:B;ep(V\u0002`4dT\u0000\u0019j3j8@B;'\u0016";
        objectArray[11] = "q\u001e>, XpH)f\u001d^*\u001f?5|S6:.-\u001d\b-\u0010~\" \u000b5D'\\ I)\u0015|>`\u00046EC";
        objectArray[12] = "\r\u0014JOQt\tQ\u0002\u001dip_OFI.`6\u0010[M\t`Y\u0012]M\u0019\u000e\r\u0014JOQt\tQ\u0002\u001di";
        objectArray[13] = "gZ\u0014Y9#f\f\u0003\u0013\u0004!6A.SH#5T\u0014MxNf]\u0000\u0014zseETM\u0004s;TTW9p#\u0000\r)9.2\u0000\u0017\u0014:6fYi";
        objectArray[14] = "\u0001nq\u001b9:\u00008fQ\u0004/@u\fVd>\u0000w1U|jY\t1\u000bmjC42\u001393=4l\u00029)\u00007tV`W";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "=\u0012o\u001f7\n9W'M\u000f\u0011`Q@\u001dk\rk-%\u0014f\u0010hB'\u0012f\u0000\u0006";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 1;
            case 2 -> 56;
            case 3 -> 53;
            case 4 -> 54;
            case 5 -> 17;
            case 6 -> 33;
            case 7 -> 9;
            case 8 -> 36;
            case 9 -> 61;
            case 10 -> 18;
            case 11 -> 62;
            case 12 -> 45;
            case 13 -> 46;
            case 14 -> 55;
            case 15 -> 60;
            case 16 -> 6;
            case 17 -> 5;
            case 18 -> 44;
            case 19 -> 50;
            case 20 -> 28;
            case 21 -> 40;
            case 22 -> 42;
            case 23 -> 52;
            case 24 -> 29;
            case 25 -> 8;
            case 26 -> 0;
            case 27 -> 31;
            case 28 -> 21;
            case 29 -> 41;
            case 30 -> 14;
            case 31 -> 4;
            case 32 -> 12;
            case 33 -> 20;
            case 34 -> 22;
            case 35 -> 39;
            case 36 -> 47;
            case 37 -> 13;
            case 38 -> 59;
            case 39 -> 49;
            case 40 -> 16;
            case 41 -> 38;
            case 42 -> 34;
            case 43 -> 2;
            case 44 -> 30;
            case 45 -> 15;
            case 46 -> 7;
            case 47 -> 10;
            case 48 -> 37;
            case 49 -> 51;
            case 50 -> 25;
            case 51 -> 19;
            case 52 -> 3;
            case 53 -> 57;
            case 54 -> 32;
            case 55 -> 35;
            case 56 -> 11;
            case 57 -> 63;
            case 58 -> 23;
            case 59 -> 24;
            case 60 -> 58;
            case 61 -> 43;
            case 62 -> 26;
            default -> 27;
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
        cx_0.d[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cx_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


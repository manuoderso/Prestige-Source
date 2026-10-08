/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dK;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dT;
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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.gc
 */
public final class gc_0 {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    private gc_0() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        gc_0.a = hc.a(7916320163549845479L, -2211638183182152206L, MethodHandles.lookup().lookupClass()).a(176808495535985L);
                        gc_0.h = new Object[97];
                        gc_0.i = new String[97];
                        gc_0.a();
                        gc_0.d = new HashMap<K, V>(13);
                        var11 = gc_0.a ^ 56797941076823L;
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
                        var20_3 = new String[33];
                        var18_4 = 0;
                        var17_5 = "oB\u00ba\u00f9\u00f6\u00f3\u00f3\"woU\u0092\u00fb}\u00c1\u00a6\u008c\u0080\u00cd\u00aeU\u0081\u00a6\"\u0010A<\rD\u00a8UJ@\u00ee\u0097\u0013\u00a1\u00beW\u0005\u00d9\u0010\u00b0\u001b\u00ab\u00faN\u00a8y\u00a5N\u00a9\u000e\u00dd\bC\u0018\u0088(\u008d\u00b2\u00e6n\u000f\u00d5\u00f7\u00a41\u00e6|\u0095\u0012\u00ceyj:1\u00fdY\u00af\u007f\u00de\u00cf\u009e\u00cf:@E\u0017Z\u001d\u0097\u00bb\u0097\u009aU\u009b\u00ef\b(\u008et\u00db\u00c6\u00c6\u00b3\u0004zP\u008f\u001d\u0098\u009f%\u00d1\u00c1\u00c6\u0091\u00e2\u0002\u00ec \f\u008f6\u0012 MOs^\u00bad#\u00c1\u0013\u00ba\u00ee\u00c2\u00d8@\u0004/\u00a1\u001e{\u0014\u00f9\u00e7|K@\u0007\u0084\u0011\"z\u001aTGa\u0086\u0084V\u00f8Go\u009b\u00b5Wf\u00a2m\u0007J{[\u009c\u00c6\u0016\u007f\u00d7R\u00c3FX\u00ce\u00e0\u00110]>\u00df\u00a39\u001d\u008c\u0081G\u00e5\u0093\u00b9pN\u00828\u00e5\u00ed\u00dd$\u00c5\u0099-\u00f6\u0013\u00d4u\u0092z\u00e9\u00b7\u00a6\u00d1\u00bcp\u00ce\u008a\u0001\u0082\u0092\u00ac\u00faF\u0014\u0080\u0013]&\u00d7\u00e7\u00f7\u00ee\u00fc\u00fd\u00d1\u001d\"\u00e5<\u00e0\u00ff\u00ac\u00e0MMt\u0091\u00caV\u0001\u00dc\u00198T|\u0005{\u00dc\u00d0\u00a2b\u00f7}\u0007!?P\u00b3\u00c0\u00b3<@\u00ce\u00c1\u0087\u00d9\u0089<@|\u008f=X\u009b\u00e4\u0085*\u00dc\u0091\u0002\u00d4\u00980\u00aaq\u00a5Q~\u00ecx\u001aw`kE\u00c0+\u001d.(\u001c\u00b3o\u00d7\u0091\u0015r<\u0000f\u0004u9G\u0016= \u00f0\u008b\u00ff\u00caob$\u00cd>o\u00e4\u001a(J\f14\u00ad\u00b3\u00b7v\r\u008c\u0010\"\u001eD\u00f4\u00b1\u000eB\u00de\u008a\u00ec\u0093\u00b1>U\u0096\u00b5\u001036\u00b6;\u00e3\u00c2\u00a8\u00c7,\u00b0\u00ae\u00d6\u00ad\u00feU\u000b\u0018k\u0012\u00ef\u00f0\u00c4>\u00ebf!\\\u00a0\u00ccW\u00e9\u00e9\u00d0\u009c\u00df\u00a15\u00a0\u00b6\u001c\u0095 \u008fS\f\u0083F\u00f5\u0017^\u00bb_\u001c\u00e1,}\u00be>L_R\u00a1.\u00df\u00d1\u00aa\u000e\u00f5?[&\u001be\u00b0\u0010\u009eH\f\u0081\u00d8H\u00bf}\u00b1\u008a\u0006\u00d4\u00fe\u00b7\u0086\f8\u008ew[\u008c\u00f7\u00e7\u00bd\u001e\u00c2%Gd\u00eb\u008d\u00c4\fq\b\u0004\u001a d\u000f\u00f0\u00d2\u00ff\u00ac\u00de\u00d8\u00bc\u008e\u0004\u0091\u00c4e:\u001a\u00f0\u00e7_e-Ru\u00e3\u00f2I\u008c\u00ca.i\u00ce\r7\u00b2\u00f7@Wv3\u00b7e3H-\u0082m\b#1\u00afG\u000f\u001f\u0096\u0014t\u00aa\u0010\u00e8\u008ei\u00f7}\u00f5\u0013K*/ng\u00dc\u00c0p\u00c9\u000e\u001ds/\u0092\u00c5\u00ecG\u00b9\u0094\u00b6\u00e9|%w\u00b5\u00f2\u00a5`7\u00e4\u00b1\u008f\u00e1(9 \u00dav\u0097b\u00c8CZ\u00bb\u0011Z\u00e0\u00e4\u0013\u0091\u00df\u00a5\u00cb\u00c4\u00e3\u0014f\u00b6\u00cb\u00b8U\u00b6\u00e6Q_4w\"(T\u00cd\u00fc6:,\u009dr+\u0001w\u00cd?\u0011{\u00f2o\u00f2`\u008a\b\u00eb\u00f2\u00b4\u0093n\u0085Si!\u00d8\u00bd#\u00e6\u008em\u00ae\u0096>\u0098\u0010Z<\u00b4Lb\u00b6FNn\u0090;\u00e2\u0091\u00f0+\u00baH/l\u0011FMc)\u00fd\u00dcU\u00ce\u008eO\u00b8\u001d\u001fQ\u00bbF?Sdy-=\u00a2\u00ad\u00d8\u00ae\u0018V\u00e2\u009b\u00e4A\u0097\u00d4\u0098\u00f5e2\u001d\u0097\u00e5\u0097\"\u0093\u0001\u0091\u009eR\u00da\u0014\u00a4c\u00ce\u00fd@^\u001a?$\u00c1\u00ec\u00c0\u00a3%\u00c6^I1\u009e\u0010\u001d'\u00ed\u00faj\u00d6R\u0018\u00c0%\u00ed\u00d0\u00e8\u00c3\u00af\u00b7\u0010\u00bf\u0095$-nW\u008a\u00f7\u00fde\u00b74\u00e7_\u0098\u00b2\u0010m\u009b\u00e0\u009d\u0003\u0017\u0095\u00ed.\u00b3\u008d\u001c\u000e\u001eyx\u0010g\u00d2t\u00a4)\u00862\u00c0\u00d2|\u00d4\u001e\u008c\u00aedG(W\r\u001cm\u00cb\u0007u\u001d\u00fe\u00db\u0091+\u008bs\u00c9y/\u000bs\u00bf\u0012\u00c4w\u00f2\u0082\u0012T>\u00b0S\u00ab\u008c\u00e8\u00fe\u00f0\u00e7=\u00c0/\u00a2\u0010\u00ee\u0010\u009f\u001a\u00ad\u00af\f\u00f4\u00cb7\u00aeu\u009e\u009d\u00cc\u00c0\u0010\u001b\u0091\u0007*\u00d8\u0088q\u0093\u00c8\u00fa\u00a9\r\u00ef\u008e\u000b\u00010}\u0015\u001a\u0007\u00d0\u00a8\u00a5\u00d8?\u009e\u00b5\u00dfB\u00a1\u00c6\u00f2I\u00e6\u0011|\u009b/\u00d7\\\u008e]\u00d03Rov\u00e6\u00eb\u0005\u0082P\u00d4\u00f1\u001dmS)\u00e0\u00bc\u00df\u00c4\u00f4u(\u00cf\u00ecU\u000b\u00de\u00f6\u00f4\u00d3)\u001a\n$\u00e2\u0081K},\u00eb\u000b\u007f't}\u00e9l\u0094\u0006\u0018w\u00c5\u0095\u009b\u008d\u0088\u0019\u0081\u0082+T\u00d50E8L\u00e2+L@\u0094\u001e\u00ce\u00fc\u007fq\u00c0&NR\u0001\u0098\u0096\u00c6\u0087\u00b5\u001a\u0085\u0082,\u00a1\u00da\u0085\u001f:]\u0006\u001c\u00c5\u009dFW\u00a2;\u0091\u00cd-}\u009c7\u00c3 }\u00126u\u00b9\u00e94F\u0093\u0019\u00e7\u00b0\u001c\u00a3\u0000\u00dd\u00f1s5\u00c6\u00df3\u0094Pb\u0019\u0017\u0089t\u00ae\u0012}";
                        var19_6 = "oB\u00ba\u00f9\u00f6\u00f3\u00f3\"woU\u0092\u00fb}\u00c1\u00a6\u008c\u0080\u00cd\u00aeU\u0081\u00a6\"\u0010A<\rD\u00a8UJ@\u00ee\u0097\u0013\u00a1\u00beW\u0005\u00d9\u0010\u00b0\u001b\u00ab\u00faN\u00a8y\u00a5N\u00a9\u000e\u00dd\bC\u0018\u0088(\u008d\u00b2\u00e6n\u000f\u00d5\u00f7\u00a41\u00e6|\u0095\u0012\u00ceyj:1\u00fdY\u00af\u007f\u00de\u00cf\u009e\u00cf:@E\u0017Z\u001d\u0097\u00bb\u0097\u009aU\u009b\u00ef\b(\u008et\u00db\u00c6\u00c6\u00b3\u0004zP\u008f\u001d\u0098\u009f%\u00d1\u00c1\u00c6\u0091\u00e2\u0002\u00ec \f\u008f6\u0012 MOs^\u00bad#\u00c1\u0013\u00ba\u00ee\u00c2\u00d8@\u0004/\u00a1\u001e{\u0014\u00f9\u00e7|K@\u0007\u0084\u0011\"z\u001aTGa\u0086\u0084V\u00f8Go\u009b\u00b5Wf\u00a2m\u0007J{[\u009c\u00c6\u0016\u007f\u00d7R\u00c3FX\u00ce\u00e0\u00110]>\u00df\u00a39\u001d\u008c\u0081G\u00e5\u0093\u00b9pN\u00828\u00e5\u00ed\u00dd$\u00c5\u0099-\u00f6\u0013\u00d4u\u0092z\u00e9\u00b7\u00a6\u00d1\u00bcp\u00ce\u008a\u0001\u0082\u0092\u00ac\u00faF\u0014\u0080\u0013]&\u00d7\u00e7\u00f7\u00ee\u00fc\u00fd\u00d1\u001d\"\u00e5<\u00e0\u00ff\u00ac\u00e0MMt\u0091\u00caV\u0001\u00dc\u00198T|\u0005{\u00dc\u00d0\u00a2b\u00f7}\u0007!?P\u00b3\u00c0\u00b3<@\u00ce\u00c1\u0087\u00d9\u0089<@|\u008f=X\u009b\u00e4\u0085*\u00dc\u0091\u0002\u00d4\u00980\u00aaq\u00a5Q~\u00ecx\u001aw`kE\u00c0+\u001d.(\u001c\u00b3o\u00d7\u0091\u0015r<\u0000f\u0004u9G\u0016= \u00f0\u008b\u00ff\u00caob$\u00cd>o\u00e4\u001a(J\f14\u00ad\u00b3\u00b7v\r\u008c\u0010\"\u001eD\u00f4\u00b1\u000eB\u00de\u008a\u00ec\u0093\u00b1>U\u0096\u00b5\u001036\u00b6;\u00e3\u00c2\u00a8\u00c7,\u00b0\u00ae\u00d6\u00ad\u00feU\u000b\u0018k\u0012\u00ef\u00f0\u00c4>\u00ebf!\\\u00a0\u00ccW\u00e9\u00e9\u00d0\u009c\u00df\u00a15\u00a0\u00b6\u001c\u0095 \u008fS\f\u0083F\u00f5\u0017^\u00bb_\u001c\u00e1,}\u00be>L_R\u00a1.\u00df\u00d1\u00aa\u000e\u00f5?[&\u001be\u00b0\u0010\u009eH\f\u0081\u00d8H\u00bf}\u00b1\u008a\u0006\u00d4\u00fe\u00b7\u0086\f8\u008ew[\u008c\u00f7\u00e7\u00bd\u001e\u00c2%Gd\u00eb\u008d\u00c4\fq\b\u0004\u001a d\u000f\u00f0\u00d2\u00ff\u00ac\u00de\u00d8\u00bc\u008e\u0004\u0091\u00c4e:\u001a\u00f0\u00e7_e-Ru\u00e3\u00f2I\u008c\u00ca.i\u00ce\r7\u00b2\u00f7@Wv3\u00b7e3H-\u0082m\b#1\u00afG\u000f\u001f\u0096\u0014t\u00aa\u0010\u00e8\u008ei\u00f7}\u00f5\u0013K*/ng\u00dc\u00c0p\u00c9\u000e\u001ds/\u0092\u00c5\u00ecG\u00b9\u0094\u00b6\u00e9|%w\u00b5\u00f2\u00a5`7\u00e4\u00b1\u008f\u00e1(9 \u00dav\u0097b\u00c8CZ\u00bb\u0011Z\u00e0\u00e4\u0013\u0091\u00df\u00a5\u00cb\u00c4\u00e3\u0014f\u00b6\u00cb\u00b8U\u00b6\u00e6Q_4w\"(T\u00cd\u00fc6:,\u009dr+\u0001w\u00cd?\u0011{\u00f2o\u00f2`\u008a\b\u00eb\u00f2\u00b4\u0093n\u0085Si!\u00d8\u00bd#\u00e6\u008em\u00ae\u0096>\u0098\u0010Z<\u00b4Lb\u00b6FNn\u0090;\u00e2\u0091\u00f0+\u00baH/l\u0011FMc)\u00fd\u00dcU\u00ce\u008eO\u00b8\u001d\u001fQ\u00bbF?Sdy-=\u00a2\u00ad\u00d8\u00ae\u0018V\u00e2\u009b\u00e4A\u0097\u00d4\u0098\u00f5e2\u001d\u0097\u00e5\u0097\"\u0093\u0001\u0091\u009eR\u00da\u0014\u00a4c\u00ce\u00fd@^\u001a?$\u00c1\u00ec\u00c0\u00a3%\u00c6^I1\u009e\u0010\u001d'\u00ed\u00faj\u00d6R\u0018\u00c0%\u00ed\u00d0\u00e8\u00c3\u00af\u00b7\u0010\u00bf\u0095$-nW\u008a\u00f7\u00fde\u00b74\u00e7_\u0098\u00b2\u0010m\u009b\u00e0\u009d\u0003\u0017\u0095\u00ed.\u00b3\u008d\u001c\u000e\u001eyx\u0010g\u00d2t\u00a4)\u00862\u00c0\u00d2|\u00d4\u001e\u008c\u00aedG(W\r\u001cm\u00cb\u0007u\u001d\u00fe\u00db\u0091+\u008bs\u00c9y/\u000bs\u00bf\u0012\u00c4w\u00f2\u0082\u0012T>\u00b0S\u00ab\u008c\u00e8\u00fe\u00f0\u00e7=\u00c0/\u00a2\u0010\u00ee\u0010\u009f\u001a\u00ad\u00af\f\u00f4\u00cb7\u00aeu\u009e\u009d\u00cc\u00c0\u0010\u001b\u0091\u0007*\u00d8\u0088q\u0093\u00c8\u00fa\u00a9\r\u00ef\u008e\u000b\u00010}\u0015\u001a\u0007\u00d0\u00a8\u00a5\u00d8?\u009e\u00b5\u00dfB\u00a1\u00c6\u00f2I\u00e6\u0011|\u009b/\u00d7\\\u008e]\u00d03Rov\u00e6\u00eb\u0005\u0082P\u00d4\u00f1\u001dmS)\u00e0\u00bc\u00df\u00c4\u00f4u(\u00cf\u00ecU\u000b\u00de\u00f6\u00f4\u00d3)\u001a\n$\u00e2\u0081K},\u00eb\u000b\u007f't}\u00e9l\u0094\u0006\u0018w\u00c5\u0095\u009b\u008d\u0088\u0019\u0081\u0082+T\u00d50E8L\u00e2+L@\u0094\u001e\u00ce\u00fc\u007fq\u00c0&NR\u0001\u0098\u0096\u00c6\u0087\u00b5\u001a\u0085\u0082,\u00a1\u00da\u0085\u001f:]\u0006\u001c\u00c5\u009dFW\u00a2;\u0091\u00cd-}\u009c7\u00c3 }\u00126u\u00b9\u00e94F\u0093\u0019\u00e7\u00b0\u001c\u00a3\u0000\u00dd\u00f1s5\u00c6\u00df3\u0094Pb\u0019\u0017\u0089t\u00ae\u0012}".length();
                        var16_7 = 24;
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
                            var20_3[var18_4++] = gc_0.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "e\u00a9\";T\u00e8\u0005\u00cf\u0002I|\u00a7\u0014\u0097_\u00a9\u0019\u00e2\u00abLt\u00d5u\u0012\u00e5o-\u008f\u00d4^\u008cl6\u00c0\u008d\u001a\u00da\u00b57\u00df0\u00c2\u0000\u00e8\u00f0\n?v\u0019\u00c2~\u00f7\u00dd\u00e2\u001aa9\u00c9\u00d2\u008a\u00dc\u0000\u001b\u00dc\u009e\u00b7\u0001\n\u00b479\u00a7DC?\r\u008a\u000bh\"\u00fe\u00c2\u001f\u00b9\f0y\b\u0095";
                            var19_6 = "e\u00a9\";T\u00e8\u0005\u00cf\u0002I|\u00a7\u0014\u0097_\u00a9\u0019\u00e2\u00abLt\u00d5u\u0012\u00e5o-\u008f\u00d4^\u008cl6\u00c0\u008d\u001a\u00da\u00b57\u00df0\u00c2\u0000\u00e8\u00f0\n?v\u0019\u00c2~\u00f7\u00dd\u00e2\u001aa9\u00c9\u00d2\u008a\u00dc\u0000\u001b\u00dc\u009e\u00b7\u0001\n\u00b479\u00a7DC?\r\u008a\u000bh\"\u00fe\u00c2\u001f\u00b9\f0y\b\u0095".length();
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
                            var20_3[var18_4++] = gc_0.a(var21_9).intern();
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
                gc_0.b = var20_3;
                gc_0.c = new String[33];
                gc_0.g = new HashMap<K, V>(13);
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
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "yXDX\u00f3\u00e35f\u00b4\u0098\u00d5\u00939\u00a6\u00ae\"{YW\u0002\u001c^\u0092\u001a\u00aa\u00b6;\u00c4\u00b9\u0093\u00af75\u00cfW\u00ff\"a7\u0095";
                var5_15 = "yXDX\u00f3\u00e35f\u00b4\u0098\u00d5\u00939\u00a6\u00ae\"{YW\u0002\u001c^\u0092\u001a\u00aa\u00b6;\u00c4\u00b9\u0093\u00af75\u00cfW\u00ff\"a7\u0095".length();
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
                    var4_14 = "9\u0016\u0001\u00ebf\u00d1\u0097\u00d3\u009a3E=\u00a4\u0081h\u0000";
                    var5_15 = "9\u0016\u0001\u00ebf\u00d1\u0097\u00d3\u009a3E=\u00a4\u0081h\u0000".length();
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
        gc_0.e = var6_12;
        gc_0.f = new Integer[7];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D41;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gc_0.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gc_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gc_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gc_0.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = gc_0.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                gc_0.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gc_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gc_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int b(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        block7: {
            CallSite callSite3;
            long l;
            String string;
            block6: {
                String string2 = (String)objectArray[0];
                string = (String)objectArray[1];
                l = (Long)objectArray[2];
                long l2 = (l = a ^ l) ^ 0x1FF1D243CD06L;
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l2;
                objectArray2[1] = string + (String)((Object)gc_0.a("h", (int)28923, (long)(0x2606E406345C5EACL ^ l)));
                objectArray2[0] = string2;
                callSite2 = gc_0.c("F", (Object)objectArray2, (long)6614212520364939341L, (long)l);
                callSite3 = gc_0.c("F", (long)6616936182413040387L, (long)l);
                try {
                    callSite = callSite2;
                    if (callSite3 != null) break block6;
                    if (callSite < 0) throw new IllegalArgumentException(string + (String)((Object)gc_0.a("h", (int)11281, (long)(0x59AC56104E530248L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw gc_0.c("F", (Object)illegalArgumentException, (long)6614605310426876557L, (long)l);
                }
                callSite = callSite2;
            }
            try {
                try {
                    if (callSite3 != null) return (int)callSite;
                    if (callSite <= gc_0.b("q", (int)2558, (long)(0x4DC551CB78C88F78L ^ l))) break block7;
                    throw new IllegalArgumentException(string + (String)((Object)gc_0.a("h", (int)11281, (long)(0x59AC56104E530248L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw gc_0.c("F", (Object)illegalArgumentException, (long)6614605310426876557L, (long)l);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw gc_0.c("F", (Object)illegalArgumentException, (long)6614605310426876557L, (long)l);
            }
        }
        callSite = callSite2;
        return (int)callSite;
    }

    private static Field c(long l, long l2) {
        int n = gc_0.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = gc_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gc_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gc_0.a(clazz3, string2, clazz2)) != null) {
                    gc_0.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gc_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gc_0.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gc_0.b(107116489129441L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = gc_0.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = gc_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gc_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gc_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gc_0.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gc_0.b(107116489129441L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gc_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gc_0.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gc_0.b(107116489129441L, 0L);
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

    private static String a(Object[] objectArray) {
        Object object;
        block4: {
            long l;
            int n;
            String string;
            block5: {
                string = (String)objectArray[0];
                n = (Integer)objectArray[1];
                l = (Long)objectArray[2];
                l = a ^ l;
                CallSite callSite = gc_0.c("F", (long)954266184146931177L, (long)l);
                try {
                    try {
                        object = string;
                        if (callSite != null) break block4;
                        if (gc_0.c("w", (Object)object, (long)953582595577000284L, (long)l) > n) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw gc_0.c("F", (Object)illegalArgumentException, (long)946288173162323047L, (long)l);
                    }
                    return string;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw gc_0.c("F", (Object)illegalArgumentException, (long)946288173162323047L, (long)l);
                }
            }
            object = (String)((Object)gc_0.c("w", string, (int)0, (int)(n - 3), (long)952260014759757804L, (long)l)) + (String)((Object)gc_0.a("h", (int)10767, (long)(0x78818472F0C4D2B3L ^ l)));
        }
        return object;
    }

    public static boolean a(Object[] objectArray) {
        long l;
        block15: {
            Object object;
            block14: {
                CallSite callSite;
                block12: {
                    CallSite callSite2;
                    block13: {
                        Object object2;
                        block10: {
                            Object object3;
                            block11: {
                                object3 = objectArray[0];
                                l = (Long)objectArray[1];
                                l = a ^ l;
                                callSite = gc_0.c("F", (long)7050682448277053710L, (long)l);
                                try {
                                    try {
                                        object2 = object3;
                                        if (callSite != null) break block10;
                                        if (object2 != null) break block11;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)7045554276338380928L, (long)l);
                                    }
                                    throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)2638, (long)(0x401048BCDE379E01L ^ l))));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)7045554276338380928L, (long)l);
                                }
                            }
                            object2 = object3;
                        }
                        callSite2 = gc_0.c("w", (Object)gc_0.c("w", (Object)object2, (long)7052582328143199010L, (long)l), (long)7050506734956667874L, (long)l);
                        try {
                            try {
                                object = gc_0.c("w", (Object)gc_0.a("h", (int)19374, (long)(0x830F811AB7D5FE5L ^ l)), (Object)callSite2, (long)7045182379893724834L, (long)l);
                                if (callSite != null) break block12;
                                if (object == false) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw gc_0.c("F", (Object)illegalArgumentException, (long)7045554276338380928L, (long)l);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw gc_0.c("F", (Object)illegalArgumentException, (long)7045554276338380928L, (long)l);
                        }
                    }
                    object = gc_0.c("w", (Object)gc_0.a("h", (int)20224, (long)(0x13E71DC07C8DB46L ^ l)), (Object)callSite2, (long)7045182379893724834L, (long)l);
                }
                try {
                    if (callSite != null) break block14;
                    if (object == false) break block15;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw gc_0.c("F", (Object)illegalArgumentException, (long)7045554276338380928L, (long)l);
                }
                object = 0;
            }
            return (boolean)object;
        }
        throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)13756, (long)(0x7204900695CA1F1L ^ l))));
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static float a(Object[] var0) {
        block11: {
            block12: {
                block10: {
                    var1_1 = var0[0];
                    var2_2 = (Long)var0[1];
                    var2_2 = gc_0.a ^ var2_2;
                    var4_3 = gc_0.c("F", (long)837988036342762358L, (long)var2_2);
                    v0 = var1_1;
                    if (var4_3 != null) ** GOTO lbl21
                    try {
                        block13: {
                            if (v0 != null) break block10;
                            break block13;
                            catch (NumberFormatException v1) {
                                throw gc_0.c("F", (Object)v1, (long)846388315635342072L, (long)var2_2);
                            }
                        }
                        throw new IllegalArgumentException((String)gc_0.a("h", (int)2638, (long)(4616303166783878265L ^ var2_2)));
                    }
                    catch (NumberFormatException v2) {
                        throw gc_0.c("F", (Object)v2, (long)846388315635342072L, (long)var2_2);
                    }
                }
                try {
                    v0 = var1_1;
lbl21:
                    // 2 sources

                    var5_4 = gc_0.c("F", (Object)gc_0.c("w", (Object)gc_0.c("w", (Object)v0, (long)839888051549393242L, (long)var2_2), (long)837741533368748442L, (long)var2_2), (long)838446668927555272L, (long)var2_2);
                }
                catch (NumberFormatException var6_5) {
                    throw new IllegalArgumentException((String)gc_0.a("h", (int)2477, (long)(3373022099280852864L ^ var2_2)), var6_5);
                }
                try {
                    try {
                        v3 = var5_4;
                        if (var4_3 != null) break block11;
                        if (gc_0.c("F", (float)v3, (long)838626657786482677L, (long)var2_2) != false) break block12;
                    }
                    catch (NumberFormatException v4) {
                        throw gc_0.c("F", (Object)v4, (long)846388315635342072L, (long)var2_2);
                    }
                    throw new IllegalArgumentException((String)gc_0.a("h", (int)23460, (long)(8556164716419851662L ^ var2_2)));
                }
                catch (NumberFormatException v5) {
                    throw gc_0.c("F", (Object)v5, (long)846388315635342072L, (long)var2_2);
                }
            }
            v3 = var5_4;
        }
        return (float)v3;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == '\u00fd' || c == '\u00ca' || c == '\u00e0') {
                field = gc_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gc_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Object[] objectArray) {
        dK dK2;
        CallSite callSite;
        long l;
        block102: {
            boolean bl;
            dK dK3;
            block94: {
                CallSite callSite2;
                block95: {
                    CallSite callSite3;
                    CallSite callSite4;
                    CallSite callSite5;
                    dQ dQ2;
                    block100: {
                        block101: {
                            CallSite callSite6;
                            block98: {
                                block99: {
                                    CallSite callSite7;
                                    CallSite callSite8;
                                    long l2;
                                    block96: {
                                        block97: {
                                            block92: {
                                                block93: {
                                                    long l3;
                                                    block88: {
                                                        block89: {
                                                            dR dR2;
                                                            block90: {
                                                                dR dR3;
                                                                block91: {
                                                                    long l4;
                                                                    block86: {
                                                                        block87: {
                                                                            long l5;
                                                                            block84: {
                                                                                block85: {
                                                                                    block80: {
                                                                                        block81: {
                                                                                            Object object;
                                                                                            CallSite callSite9;
                                                                                            dN dN2;
                                                                                            long l6;
                                                                                            block82: {
                                                                                                block83: {
                                                                                                    block72: {
                                                                                                        block73: {
                                                                                                            CallSite callSite10;
                                                                                                            int n;
                                                                                                            dL dL2;
                                                                                                            block78: {
                                                                                                                Object object2;
                                                                                                                int n2;
                                                                                                                block79: {
                                                                                                                    block77: {
                                                                                                                        block76: {
                                                                                                                            Object object3;
                                                                                                                            CallSite callSite11;
                                                                                                                            long l7;
                                                                                                                            block74: {
                                                                                                                                block75: {
                                                                                                                                    block70: {
                                                                                                                                        block71: {
                                                                                                                                            Object object4;
                                                                                                                                            block68: {
                                                                                                                                                Object object5;
                                                                                                                                                block69: {
                                                                                                                                                    block66: {
                                                                                                                                                        block67: {
                                                                                                                                                            dK3 = (dK)objectArray[0];
                                                                                                                                                            object5 = objectArray[1];
                                                                                                                                                            l = (Long)objectArray[2];
                                                                                                                                                            long l8 = l = a ^ l;
                                                                                                                                                            l3 = l8 ^ 0x30B00B1AE266L;
                                                                                                                                                            l2 = l8 ^ 0x7265E821B257L;
                                                                                                                                                            l4 = l8 ^ 0x6FC1D723B4C8L;
                                                                                                                                                            l7 = l8 ^ 0x5D9CA9BFD82FL;
                                                                                                                                                            l6 = l8 ^ 0x47AE5635E222L;
                                                                                                                                                            l5 = l8 ^ 0x53A9CC57341AL;
                                                                                                                                                            callSite2 = gc_0.c("F", (long)-6717021819834179041L, (long)l);
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    object4 = dK3;
                                                                                                                                                                    if (callSite2 != null) break block66;
                                                                                                                                                                    if (object4 != null) break block67;
                                                                                                                                                                    throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)18355, (long)(0x159A87F385B090EBL ^ l))));
                                                                                                                                                                }
                                                                                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        object4 = object5;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            if (callSite2 != null) break block68;
                                                                                                                                                            if (object4 != null) break block69;
                                                                                                                                                            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)874, (long)(0x414AA38AA3542AL ^ l))));
                                                                                                                                                        }
                                                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                object4 = object5;
                                                                                                                                            }
                                                                                                                                            callSite = gc_0.c("w", (Object)object4, (long)-6715262696734656461L, (long)l);
                                                                                                                                            try {
                                                                                                                                                bl = dK3 instanceof dM;
                                                                                                                                                if (callSite2 != null) break block70;
                                                                                                                                                if (!bl) break block71;
                                                                                                                                            }
                                                                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                            }
                                                                                                                                            dM dM2 = (dM)dK3;
                                                                                                                                            Object[] objectArray2 = new Object[2];
                                                                                                                                            objectArray2[1] = l7;
                                                                                                                                            objectArray2[0] = callSite;
                                                                                                                                            gc_0.c("w", (Object)dM2, (Object)gc_0.c("F", (boolean)gc_0.c("F", (Object)objectArray2, (long)-6715385585178071882L, (long)l), (long)-6712638836390331942L, (long)l), (long)-6716278679343441990L, (long)l);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        bl = dK3 instanceof dL;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (callSite2 != null) break block72;
                                                                                                                                        if (!bl) break block73;
                                                                                                                                    }
                                                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                    }
                                                                                                                                    dL2 = (dL)dK3;
                                                                                                                                    callSite11 = gc_0.c("w", (Object)callSite, (Object)gc_0.a("h", (int)8849, (long)(0x4E0BF62F1B1D75C7L ^ l)), (int)-1, (long)-6716357325720732367L, (long)l);
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            object3 = ((CallSite)callSite11).length;
                                                                                                                                            if (callSite2 != null) break block74;
                                                                                                                                            if (object3 == 2) break block75;
                                                                                                                                            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)2445, (long)(0x3F421E056DF05ED2L ^ l))));
                                                                                                                                        }
                                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                Object[] objectArray3 = new Object[3];
                                                                                                                                objectArray3[2] = l5;
                                                                                                                                objectArray3[1] = gc_0.a("h", (int)17427, (long)(0x64CC00175D69347L ^ l));
                                                                                                                                objectArray3[0] = callSite11[0];
                                                                                                                                object3 = gc_0.c("F", (Object)objectArray3, (long)-6713130475325497007L, (long)l);
                                                                                                                            }
                                                                                                                            n = object3;
                                                                                                                            Object[] objectArray4 = new Object[2];
                                                                                                                            objectArray4[1] = l7;
                                                                                                                            objectArray4[0] = callSite11[1];
                                                                                                                            callSite10 = gc_0.c("F", (Object)objectArray4, (long)-6715385585178071882L, (long)l);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    n2 = n;
                                                                                                                                    object2 = -1;
                                                                                                                                    if (callSite2 != null) break block76;
                                                                                                                                    if (n2 < object2) throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)8114, (long)(0x52D80612AF7948FDL ^ l))));
                                                                                                                                }
                                                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                                }
                                                                                                                                n2 = n;
                                                                                                                                object2 = gc_0.b("q", (int)21957, (long)(0x39CE1EF9AF672A58L ^ l));
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (callSite2 != null) break block77;
                                                                                                                                if (n2 <= object2) break block78;
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                            }
                                                                                                                            n2 = n;
                                                                                                                            object2 = gc_0.b("q", (int)25492, (long)(0x3D060DC3ED179C0CL ^ l));
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (callSite2 != null) break block79;
                                                                                                                            if (n2 < object2) throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)8114, (long)(0x52D80612AF7948FDL ^ l))));
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                        }
                                                                                                                        n2 = n;
                                                                                                                        object2 = gc_0.b("q", (int)26057, (long)(0x150AFC37CE299A55L ^ l));
                                                                                                                    }
                                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (n2 > object2) {
                                                                                                                        throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)8114, (long)(0x52D80612AF7948FDL ^ l))));
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                                }
                                                                                                            }
                                                                                                            gc_0.c("w", (Object)dL2, (Object)gc_0.c("F", (int)n, (long)-6713416281777208800L, (long)l), (long)-6716278679343441990L, (long)l);
                                                                                                            gc_0.c("w", (Object)dL2, (boolean)callSite10, (long)-6716143042386860977L, (long)l);
                                                                                                            return;
                                                                                                        }
                                                                                                        bl = dK3 instanceof dN;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (callSite2 != null) break block80;
                                                                                                        if (!bl) break block81;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                    }
                                                                                                    dN2 = (dN)dK3;
                                                                                                    callSite9 = gc_0.c("w", (Object)callSite, (Object)gc_0.a("h", (int)26684, (long)(0x77603CC5E961BF65L ^ l)), (int)-1, (long)-6716357325720732367L, (long)l);
                                                                                                    try {
                                                                                                        try {
                                                                                                            object = ((CallSite)callSite9).length;
                                                                                                            if (callSite2 != null) break block82;
                                                                                                            if (object == 4) break block83;
                                                                                                            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)4092, (long)(0x299C015E486D58BBL ^ l))));
                                                                                                        }
                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                        }
                                                                                                    }
                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                                    }
                                                                                                }
                                                                                                Object[] objectArray5 = new Object[3];
                                                                                                objectArray5[2] = l6;
                                                                                                objectArray5[1] = gc_0.a("h", (int)6132, (long)(0x64AA431BF40140A6L ^ l));
                                                                                                objectArray5[0] = callSite9[0];
                                                                                                object = gc_0.c("F", (Object)objectArray5, (long)-6713065265175429540L, (long)l);
                                                                                            }
                                                                                            int n = object;
                                                                                            Object[] objectArray6 = new Object[3];
                                                                                            objectArray6[2] = l6;
                                                                                            objectArray6[1] = gc_0.a("h", (int)20722, (long)(0x1E7E4B7CB6E607B3L ^ l));
                                                                                            objectArray6[0] = callSite9[1];
                                                                                            CallSite callSite12 = gc_0.c("F", (Object)objectArray6, (long)-6713065265175429540L, (long)l);
                                                                                            Object[] objectArray7 = new Object[3];
                                                                                            objectArray7[2] = l6;
                                                                                            objectArray7[1] = gc_0.a("h", (int)28309, (long)(0x1902B1ECDD1A39D7L ^ l));
                                                                                            objectArray7[0] = callSite9[2];
                                                                                            CallSite callSite13 = gc_0.c("F", (Object)objectArray7, (long)-6713065265175429540L, (long)l);
                                                                                            Object[] objectArray8 = new Object[3];
                                                                                            objectArray8[2] = l6;
                                                                                            objectArray8[1] = gc_0.a("h", (int)9697, (long)(0x4E87FEFF2F8672ACL ^ l));
                                                                                            objectArray8[0] = callSite9[3];
                                                                                            CallSite callSite14 = gc_0.c("F", (Object)objectArray8, (long)-6713065265175429540L, (long)l);
                                                                                            gc_0.c("w", (Object)dN2, (Object)new Color(n, (int)callSite12, (int)callSite13, (int)callSite14), (long)-6716278679343441990L, (long)l);
                                                                                            return;
                                                                                        }
                                                                                        bl = dK3 instanceof dO;
                                                                                    }
                                                                                    try {
                                                                                        if (callSite2 != null) break block84;
                                                                                        if (!bl) break block85;
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                                    }
                                                                                    dO dO2 = (dO)dK3;
                                                                                    Object[] objectArray9 = new Object[2];
                                                                                    objectArray9[1] = l2;
                                                                                    objectArray9[0] = callSite;
                                                                                    CallSite callSite15 = gc_0.c("F", (Object)objectArray9, (long)-6716048534816690557L, (long)l);
                                                                                    gc_0.c("w", (Object)dO2, (Object)gc_0.c("F", (float)gc_0.c("F", (float)callSite15, (float)gc_0.c("w", (Object)dO2, (long)-6715436647597411756L, (long)l), (float)gc_0.c("w", (Object)dO2, (long)-6713342284096231037L, (long)l), (long)-6713621796680534067L, (long)l), (long)-6715579459597577434L, (long)l), (long)-6716278679343441990L, (long)l);
                                                                                    return;
                                                                                }
                                                                                bl = dK3 instanceof dP;
                                                                            }
                                                                            try {
                                                                                if (callSite2 != null) break block86;
                                                                                if (!bl) break block87;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                            }
                                                                            dP dP2 = (dP)dK3;
                                                                            Object[] objectArray10 = new Object[3];
                                                                            objectArray10[2] = l5;
                                                                            objectArray10[1] = gc_0.a("h", (int)5872, (long)(0x7A035335CDB7C1A5L ^ l));
                                                                            objectArray10[0] = callSite;
                                                                            CallSite callSite16 = gc_0.c("F", (Object)objectArray10, (long)-6713130475325497007L, (long)l);
                                                                            gc_0.c("w", (Object)dP2, (Object)gc_0.c("F", (int)gc_0.c("F", (long)((long)callSite16), (int)gc_0.c("w", (Object)dP2, (long)-6716604825643129424L, (long)l), (int)gc_0.c("w", (Object)dP2, (long)-6716722172475656399L, (long)l), (long)-6712773269655259231L, (long)l), (long)-6713416281777208800L, (long)l), (long)-6716278679343441990L, (long)l);
                                                                            return;
                                                                        }
                                                                        bl = dK3 instanceof dR;
                                                                    }
                                                                    try {
                                                                        if (callSite2 != null) break block88;
                                                                        if (!bl) break block89;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                    }
                                                                    dR3 = (dR)dK3;
                                                                    try {
                                                                        try {
                                                                            dR2 = dR3;
                                                                            if (callSite2 != null) break block90;
                                                                            CallSite callSite18 = gc_0.c("F", (Object)gc_0.c("w", (Object)dR2, (long)-6713599361480786228L, (long)l), (long)-6714245687279280679L, (long)l);
                                                                            callSite18 = callSite;
                                                                            gc_0.c("F", (Object)callSite18, (long)-6716661362540185251L, (long)l);
                                                                            if (gc_0.c("w", (Object)callSite17, ((String)((Object)callSite18))::equals, (long)-6716955272668828806L, (long)l) == false) break block91;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                        }
                                                                        Object[] objectArray11 = new Object[3];
                                                                        objectArray11[2] = l4;
                                                                        objectArray11[1] = (int)gc_0.b("q", (int)28734, (long)(0x11B98CA0FF1D0FA0L ^ l));
                                                                        objectArray11[0] = callSite;
                                                                        throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)1635, (long)(0xC940D31F671512FL ^ l))) + (String)((Object)gc_0.c("F", (Object)objectArray11, (long)-6715043944670765271L, (long)l)) + "'");
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                                    }
                                                                }
                                                                dR2 = dR3;
                                                            }
                                                            gc_0.c("w", (Object)dR2, (Object)callSite, (long)-6716278679343441990L, (long)l);
                                                            return;
                                                        }
                                                        bl = dK3 instanceof dS;
                                                    }
                                                    try {
                                                        if (callSite2 != null) break block92;
                                                        if (!bl) break block93;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                    }
                                                    dS dS2 = (dS)dK3;
                                                    Object[] objectArray12 = new Object[3];
                                                    objectArray12[2] = l3;
                                                    objectArray12[1] = callSite;
                                                    objectArray12[0] = dS2;
                                                    CallSite callSite19 = gc_0.c("F", (Object)objectArray12, (long)-6716466836126038582L, (long)l);
                                                    CallSite callSite20 = gc_0.c("w", (Object)gc_0.c("w", (Object)callSite19, (long)-6715753422832923595L, (long)l), (long)-6716240840635311348L, (long)l);
                                                    while (gc_0.c("w", (Object)callSite20, (long)-6713248661250072620L, (long)l) != false) {
                                                        Map.Entry entry = (Map.Entry)((Object)gc_0.c("w", (Object)callSite20, (long)-6715665268580677071L, (long)l));
                                                        gc_0.c("w", (Object)dS2, (Object)((String)((Object)gc_0.c("w", (Object)entry, (long)-6715003728476142625L, (long)l))), (boolean)gc_0.c("w", (Object)((Boolean)((Object)gc_0.c("w", (Object)entry, (long)-6715830365980636390L, (long)l))), (long)-6712902659926318971L, (long)l), (long)-6715216032953540216L, (long)l);
                                                        if (callSite2 == null) continue;
                                                    }
                                                    return;
                                                }
                                                bl = dK3 instanceof dQ;
                                            }
                                            try {
                                                if (callSite2 != null) break block94;
                                                if (!bl) break block95;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                            }
                                            dQ2 = (dQ)dK3;
                                            callSite8 = gc_0.c("w", (Object)callSite, (Object)gc_0.a("h", (int)17066, (long)(0x243C8AA8550795E3L ^ l)), (int)-1, (long)-6716357325720732367L, (long)l);
                                            try {
                                                try {
                                                    callSite7 = callSite8;
                                                    if (callSite2 != null) break block96;
                                                    if (((CallSite)callSite7).length == 2) break block97;
                                                    throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)7942, (long)(0x23D64E62A637C848L ^ l))));
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                                }
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                            }
                                        }
                                        callSite7 = callSite8;
                                    }
                                    Object[] objectArray13 = new Object[2];
                                    objectArray13[1] = l2;
                                    objectArray13[0] = callSite7[0];
                                    CallSite callSite21 = gc_0.c("F", (Object)objectArray13, (long)-6716048534816690557L, (long)l);
                                    Object[] objectArray14 = new Object[2];
                                    objectArray14[1] = l2;
                                    objectArray14[0] = callSite8[1];
                                    CallSite callSite22 = gc_0.c("F", (Object)objectArray14, (long)-6716048534816690557L, (long)l);
                                    callSite5 = gc_0.c("F", (float)callSite21, (float)gc_0.c("w", (Object)dQ2, (long)-6714228264040580648L, (long)l), (float)gc_0.c("w", (Object)dQ2, (long)-6715910837073159059L, (long)l), (long)-6713621796680534067L, (long)l);
                                    callSite4 = gc_0.c("F", (float)callSite22, (float)gc_0.c("w", (Object)dQ2, (long)-6714228264040580648L, (long)l), (float)gc_0.c("w", (Object)dQ2, (long)-6715910837073159059L, (long)l), (long)-6713621796680534067L, (long)l);
                                    try {
                                        try {
                                            callSite6 = callSite5;
                                            if (callSite2 != null) break block98;
                                            if (!(callSite6 > callSite4)) break block99;
                                            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)5419, (long)(0x226283197F55424BL ^ l))));
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                    }
                                }
                                callSite6 = gc_0.c("w", (Object)dQ2, (Object)new Object[0], (long)-6714914667214768254L, (long)l);
                            }
                            CallSite callSite23 = callSite6;
                            try {
                                try {
                                    callSite3 = callSite23;
                                    if (callSite2 != null) break block100;
                                    if (gc_0.c("F", (float)callSite3, (long)-6716521727191816548L, (long)l) == false) break block101;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                                }
                                callSite3 = gc_0.c("F", (float)callSite23, (float)callSite5, (float)callSite4, (long)-6713621796680534067L, (long)l);
                                break block100;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                            }
                        }
                        callSite3 = callSite5;
                    }
                    CallSite callSite24 = callSite3;
                    gc_0.c("w", (Object)dQ2, (float)callSite5, (long)-6714149427216471490L, (long)l);
                    gc_0.c("w", (Object)dQ2, (float)callSite4, (long)-6713835678934552986L, (long)l);
                    gc_0.c("w", (Object)dQ2, (Object)new Object[]{Float.valueOf((float)callSite24)}, (long)-6717113984372734469L, (long)l);
                    return;
                }
                try {
                    dK2 = dK3;
                    if (callSite2 != null) break block102;
                    bl = dK2 instanceof dT;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw gc_0.c("F", (Object)illegalArgumentException, (long)-6712755827742280815L, (long)l);
                }
            }
            if (!bl) throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)29711, (long)(0x14ECFE59ECCDA349L ^ l))) + (String)((Object)gc_0.c("w", dK3.getClass(), (long)-6716852545840878589L, (long)l)));
            dK2 = dK3;
        }
        dT dT2 = (dT)dK2;
        gc_0.c("w", (Object)dT2, (Object)callSite, (long)-6716278679343441990L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = gc_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = gc_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7599;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            gc_0.c[n2] = gc_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
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

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "ks4\u001aFJu{.U']kw!\u000f\u001b";
        objectArray[1] = "d@\u0015br.oO\u0004-\u0013 dD\u0000w";
        objectArray[2] = "#+i\u0010\"/5+lJ18\"`oL=,3'x[v>\u000f";
        objectArray[3] = "\u0012\u0017TR\u00045g7_]\u0015z\u001a/LZ\u001c3r";
        objectArray[4] = "s_h\u0000{\u001be_mZh\fr\u0014n\\d\u0018cSyK/\u000fF";
        objectArray[5] = Float.TYPE;
        gc_0.i[5] = "java/lang/Float";
        objectArray[6] = Void.TYPE;
        gc_0.i[6] = "java/lang/Void";
        objectArray[7] = "ed!c\u0014\u0016\u0010D*l\u0005YqJ!g\u0001\u0003\u0005";
        objectArray[8] = "\u0015\u001f\\;\u007f8\u000b\u0017Ft\u0010?\r\u001fS)";
        objectArray[9] = "L\u0012Ce5:92Hj$uX<Ca /,";
        objectArray[10] = "$%\u001ei)3:-\u0004&t2<!\te)\u0015:6\rij";
        objectArray[11] = "\u0007v+\u001b_d\fy:T2d\fd.";
        objectArray[12] = "\u0018{x/9\u0000\u0013ti`D\u0018\u0000s`)";
        objectArray[13] = ".9\t\bY\u001c01\u0013G\u0011\u001c*;\u000b\u0000\u0018\u0007j\b\r\f\u0013\u0000'9\u000b\f";
        objectArray[14] = Boolean.TYPE;
        gc_0.i[14] = "java/lang/Boolean";
        objectArray[15] = "V0yd\u0014s@0|>\u0007dW{\u007f8\u000bpF<h/@g}";
        objectArray[16] = "x{9>\u0000ast(qgcf\u007f(:\\";
        objectArray[17] = Integer.TYPE;
        gc_0.i[17] = "java/lang/Integer";
        objectArray[18] = "\f},ADx\u001a})\u001bWo\r6*\u001d[{\u001cq=\n\u0010l$";
        objectArray[19] = "%siw\u0016\u0005;{s8k\u0015;";
        objectArray[20] = "E'E{A~[/_4&\u007fJ4Rn\u0000y";
        objectArray[21] = "Yqi\u0003$\u000bOqlY7\u001cX:o_;\bI}xHp\u001c^";
        objectArray[22] = "?-\u0005?|nJ\r\u000e0m!+\u0003\u0005;i{_";
        objectArray[23] = "5\u0004)/RH>\u000b8`1E+\r";
        objectArray[24] = "V\u0017rjsy#7yeb6B9rnfl6";
        objectArray[25] = "A\u0016`k\u0010J_\u001ez$s^[";
        objectArray[26] = "gu\b>SOqu\rd@Xf>\u000ebLLwy\u0019u\u0007[Q";
        objectArray[27] = "6\\\u0002Qp\u0001C|\t^aN>d\u001aYh\u0007V";
        objectArray[28] = "wf\u0011\u001eMx|i\u0000Q%xrf\u0013";
        objectArray[29] = Long.TYPE;
        gc_0.i[29] = "java/lang/Long";
        objectArray[30] = ">rF\b\u0001\u001f5}WGm\u001c;\u007fU\bA";
        objectArray[31] = "Sd\u0005jCJXk\u0014%$JU`\u0014j\u0001gKb\u0006f\bHM@\u000bh\bVMl\u001ce";
        objectArray[32] = "@.4\u0010wuV.1JdbAe2LhvP\"%[#ao";
        objectArray[33] = "\u0002J?yW~wj4vF1\nr'qOxb";
        objectArray[34] = "x\u0005\n\r?\u000b\r%\u0001\u0002.Dl+\n\t*\u001e\u0018";
        objectArray[35] = "\u0001MX$oWtmS+~\u0018\u0015cX zBa";
        objectArray[36] = "/-<q\fE1%&>oQ5h\u000f~VB<";
        objectArray[37] = "\u0010iEFr\u0006eINIcI\u0004GEBg\u0013p";
        objectArray[38] = "\u0018aQ!\u000bl\u000eaT{\u0018{\u0019*W}\u0014o\bm@j_x,";
        objectArray[39] = "Ya\t-Z\u0017,A\u0002\"KXMO\t)O\u00029";
        objectArray[40] = "!\u007fwOOQT_|@^\u001e5QwKZDA";
        objectArray[41] = "Zi>sR(Li;)A?[\"8/M+Je/8\u0006<m";
        objectArray[42] = "vJ06[\u0012\u0003j;9J]~r(>C\u0014\u0016";
        objectArray[43] = "sOY\u0013iNqU\u0007B\fHH\u0019RG~\u001avCU\u001el\"tGQ\u0018a@sD\u0001@\f";
        objectArray[44] = "S&0!f2Q<np\u00035hp;uqfV*<,c^";
        objectArray[45] = "$!HI)l}-E\u0018Q(e'C\u00184Sb6\u001f\u0000l>%6^\u001bQlybJ\u0014+!s>@q";
        objectArray[46] = "\n\b,9\u000e5G\u0002p3k&S\u0019V4\u0017$Uh\"9\u0011?\u0004\n*3\b&5\u0001z$\r,E\u0004+2\u0004O";
        objectArray[47] = "O\u007f\u0000\u000e`\u0007Me^_\u0005\u0002t)\u000bZwSJs\f\u0003ekHw\b\u0005h\tOtX]\u0005";
        objectArray[48] = "[R\t=w/CYVy\u000b%2\u001cP\u007fyw\fFW&kO";
        objectArray[49] = "\u0016-\u0011WL\u0019\u0000(\u0015\u00152\u0004\u0015/\u0017\u0004u\u0014| \u0000U[ADu\t\u0007Nz\u0016-\u0011WL\u0019\u0000(\u0015\u00152";
        objectArray[50] = "+\u0001\u0007\ny\u00115]\u001e\u000b\u001d\u00046\u001ec\\$\r4\u0007\u001d\u0014x\u0018'bZ\\l\u0003.\u001c\u0012\u0000y\u0010K[Z\u0014b\u00195\u0013\u0006\u0001q|";
        objectArray[51] = "\f|-5\u0019>\u0007w|8re\tuW%\u0002y`gx1\u0014f\u0010b)'\u001d\u0005";
        objectArray[52] = ")\u0015s\u0017M)=G6\u0014|=\"\u0013l\t|j|D{IB0{\u001diq@lx\b1O\u001ak!\u001a\tMFh4B7\u0017A1&z5KB$~DoL\u001b6F";
        objectArray[53] = "\nD{n\u0010E\u0014\u0018botC\rAch\u0015N\u0011drpt\u0011SV`d\nY\u000fCs\u0001\u001dA\u0013A|q\u0018\u0010\u0005H\u001f";
        objectArray[54] = "p\u0002\u00036?0 \u001fK%U<9\u001dR,.\u0010/\u0006\\28\u001a)\u001bVHe3x\u001eQ)5.0\r;!<(&\u0003K$m>/`";
        objectArray[55] = ">\u0003PYgY \u0004[\u001d\f\u0000_\u001bPX0\u0000%\nF\u000ehi";
        objectArray[56] = "\u00113;X:&\u0005a~[\u000b2\u001a5$F\u000b:\u00150/R5<\u00032z>`3B5z\u00065:\u0010 AUae\u0017gy\u0000h7\u0002\\*T70Ed\u007f]e%~";
        objectArray[57] = ",x6\u0007\u001b\u0011|e~\u0014q\u0011gWk\u0001\r\u0001\u001csg\u0000\u0017\u0013lv6\u0016\u001ep";
        objectArray[58] = "ZpP2\u001cA\\$Pr \u0003WzO g\u0013>w[4F\u001eNr\n\"O}ZpP2\u001cA\\$Pr ";
        objectArray[59] = ";GZ.^a/\u001b]&fuU\u001bA\"\u0018!*\u0018B&\u000f\u001c1\u0002S3[c2\u0001W$f";
        objectArray[60] = "s%rF;\"gyuN\u00035\u001df\u007f\u0014rbp!\u007fUi_vw(L8g#~zY\u0003";
        objectArray[61] = "X\u0007@Q|8L[GYD,6DM\u00035x[\u0003MB.E]U\u001a[\u007f}\b\\HND";
        objectArray[62] = "N\u0011o]T\fHEo\u001dhZM\u0018iO\u0001Vt\u0016i_\u00050C\u0016tD\u000b@FGbMh";
        objectArray[63] = "a\r\rG}&w\b\t\u0005\u0003=b\u0011\r\u0014B#wkF\u001b;;a\n\u0016\u0006s(\u000b\u0000\u001cEj~3U\u0015\u0017\u007fE";
        objectArray[64] = "\u000bT%km2\u001fHs(\u00107rNvoyfJ\u001b\u007f=l]";
        objectArray[65] = "h[\u001b\u0002.\u001b8FS\u0011D\u0006\"XF|t\u0018`GI\u001d$\u0005(T#";
        objectArray[66] = "\u0018)%\\\b?\f5s\u001fu9a3vX\u001ckYf\u007f\n\tP";
        objectArray[67] = "\u001f0\u0016K&Z\u00104\n-g\u0007\u0004r\u0011Wp,\u001ai6Py\u000e}6I\\b\u000f\u0003~\u0015IqjD6\u0001Rx\u0014\fj\u0014A\u001d";
        objectArray[68] = "3\u0013a\u001a\u0004\u0004h\u0012i\u001byT\n\u0015`ZEWp\u0004v\f\u001d>";
        objectArray[69] = "\\f,\tH\u001d^|rX-\u001agwvR\\L\n0v\u0013Gq[n$\u0002@\u0013\\mtZ-";
        objectArray[70] = "\u0001)?4yqLp>%\u000b'\\m\u0005:n0U|\u00182n%1!<cu\"Pq!+fH";
        objectArray[71] = "@T\r\u001c\u0010\u007f\r^Q\u0016uc\u0018R_=\u001cy\u0014T2I\u0011\u007f\u000f\u0005PA\u001bf\u00164[\u0011\fc\u001cD^@\u001aj\u007f";
        objectArray[72] = "^s\u0013f97\f-Y'X85~\u0001a>2E{Pw7Q\tuQy53\u000ev\u0001!X";
        objectArray[73] = "pchLw\u0012 neAKL`b.C7Jf\u000f8XwPw43S&]\u001c";
        objectArray[74] = "W>l >%Cbk(\u000619}arweT:a3lX\u0005<41>f_;m#\u0006";
        objectArray[75] = "\b3\\x.>R9\f'\u0016,\u0003(HtX0\r;O\u0019&6R,Yxv+\u001a?3%,j\u0018j\r\u007f+3\nR";
        objectArray[76] = "8\u0006\u0011\u0005\u0012\u0012,Z\u0016\r*\u0006VE\u001cW[R;\u0002\u001c\u0016@o6]\u0013\tN\u0002(\u0001\n\b*";
        objectArray[77] = "-\u001e`\u0014hww\u00140KP|41n\u00131a\"\u007f3OnowAiH7}O\u0016f\f6~?\u00137\u001a?\u001d";
        objectArray[78] = "2\t^Z\u000f\t:\f\u0012S0PWTYPO\\)\u001c\u0005E\\9k\u000fY@][l\f\t\u00180";
        objectArray[79] = "<|\u001bH_\u000flaS[5\u0015tzBJ5^n&]\\T\u000esnN6^\u00040w\u0018\u000e\u000b\rbb#J_W0wY[I\u0001h\u001e";
        objectArray[80] = "m77mf\u00107=g2^\u0004f2%a\u0019\u0014\u000fjb2,B10ek>zm77mf\u00107=g2^";
        objectArray[81] = "~efru\u001eun7\u007f\u001eC\u007fg&\u000f'\u001cch?qo@v{Z";
        objectArray[82] = "fm&Q\t\u0001~fy\u0015u\b\u000f#\u007f\u0013\u0007Y1yxJ\u0015a";
        objectArray[83] = "|5|+\u00017,(48k2!1+)\u000bV'=x<Pnr4*)k";
        objectArray[84] = "%x(e>n'bv4[n\u001e.#1): t$h;\u0002";
        objectArray[85] = "\u0012t\tF<CBiAUVFKmMy0NOfvVVIH*X\u0003n\u001cAxM8=H\u001e\u007f\n\u0000hALj1";
        objectArray[86] = "a/\u0002k[#\u007fs\u001bj?#g0\u001cud#}L\nh\u0003(=sZe\u000e%\u0001";
        objectArray[87] = "Gh\u0017v/e\u0003;\u0002|\u0014kR{#ypyR\u0007D)e{Zy\fuph?";
        objectArray[88] = "(\u001e32c=<B4:[)F]>`*}+\u001a>!1@vDm/1!&Y%<[";
        objectArray[89] = "\u001eh4\u000f8\u0005Nu|\u001cR\u001fS`w\r(\u0005He\f\u001a8XG14O1\nR\n<\u0013j\u001aDkl\u000e\"\t.";
        objectArray[90] = "S(V!g_Q2\bp\u0002^h9\fzs\u000e\u0005~\f;h3TxY9:\r\u000e\u007f\u0000+\u0002";
        objectArray[91] = "\\R36=;\u0018\u0001&<\u00065IA\u001a=wZ\u001d\u0004(/c$UX=<\u0006";
        objectArray[92] = "Vz$TV\u0019\u001dg ^+\b-y+\u0015\u0017\bWh=COa";
        objectArray[93] = "8]\r\u001eQA,\u0001\n\u0016iUV\u001e\u0000L\u0018\u0001;Y\u0000\r\u0003<?\f\u0012\u001b\nL:]\u0004\u0012i";
        objectArray[94] = "GpFc\u0001O\fmBi|^<?A#\u0002]]o\\k\u00117UfZ}\u001fGP7Lt|\u000b^6Bv\u001e\f]f\u001a\u001b";
        objectArray[95] = "RY\u0018ceK\u001a\u0005\rp\u0000I\f;\u0015faS\u0004`Y~8K\u0001\u0001\tcpXk";
        Object[] objectArray2 = objectArray;
        objectArray[96] = "O\u0002\u0011MmT\u001f\u001fY^\u0007N\u0002\nRO}T\u0019\u000f)Xm\t\u0016[\u0011\rd[\u0003`BY;\\DX\u0017PiI\u007fPK\u000by_\u001e\u0000VCj5";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 19;
            case 2 -> 46;
            case 3 -> 12;
            case 4 -> 6;
            case 5 -> 13;
            case 6 -> 61;
            case 7 -> 39;
            case 8 -> 23;
            case 9 -> 42;
            case 10 -> 43;
            case 11 -> 29;
            case 12 -> 40;
            case 13 -> 16;
            case 14 -> 63;
            case 15 -> 44;
            case 16 -> 25;
            case 17 -> 59;
            case 18 -> 7;
            case 19 -> 20;
            case 20 -> 47;
            case 21 -> 56;
            case 22 -> 37;
            case 23 -> 11;
            case 24 -> 31;
            case 25 -> 58;
            case 26 -> 41;
            case 27 -> 3;
            case 28 -> 48;
            case 29 -> 33;
            case 30 -> 15;
            case 31 -> 8;
            case 32 -> 60;
            case 33 -> 14;
            case 34 -> 53;
            case 35 -> 35;
            case 36 -> 50;
            case 37 -> 36;
            case 38 -> 51;
            case 39 -> 26;
            case 40 -> 10;
            case 41 -> 1;
            case 42 -> 5;
            case 43 -> 18;
            case 44 -> 9;
            case 45 -> 38;
            case 46 -> 32;
            case 47 -> 17;
            case 48 -> 24;
            case 49 -> 21;
            case 50 -> 49;
            case 51 -> 34;
            case 52 -> 0;
            case 53 -> 28;
            case 54 -> 2;
            case 55 -> 30;
            case 56 -> 4;
            case 57 -> 27;
            case 58 -> 57;
            case 59 -> 52;
            case 60 -> 62;
            case 61 -> 45;
            case 62 -> 22;
            default -> 55;
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
        gc_0.i[n3] = new String(cArray);
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map a(Object[] objectArray) {
        CallSite callSite;
        int n;
        int n2;
        CallSite callSite2;
        CallSite callSite3;
        LinkedHashMap linkedHashMap;
        long l;
        long l2;
        block36: {
            Object object;
            String string;
            long l3;
            dS dS2;
            block34: {
                String string2;
                block35: {
                    dS2 = (dS)objectArray[0];
                    string2 = (String)objectArray[1];
                    l2 = (Long)objectArray[2];
                    long l4 = l2 = a ^ l2;
                    l = l4 ^ 0x548794184D90L;
                    l3 = l4 ^ 0x66DAEA842177L;
                    linkedHashMap = new LinkedHashMap();
                    callSite3 = gc_0.c("F", (long)6597882821195832135L, (long)l2);
                    try {
                        try {
                            string = string2;
                            if (callSite3 != null) break block34;
                            if (gc_0.c("w", string, (long)6597560168785889952L, (long)l2) == false) break block35;
                            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)30544, (long)(0x7FE2C2A7F221D953L ^ l2))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                    }
                }
                string = string2;
            }
            callSite2 = gc_0.c("w", string, (Object)"&", (int)-1, (long)6598494590195025001L, (long)l2);
            n2 = ((CallSite)callSite2).length;
            for (n = 0; n < n2; ++n) {
                CallSite callSite4;
                LinkedHashMap linkedHashMap2;
                void var15_12;
                block42: {
                    CallSite callSite5;
                    CallSite callSite6;
                    block40: {
                        block41: {
                            void v10;
                            block39: {
                                CallSite callSite7;
                                block37: {
                                    callSite = callSite2[n];
                                    try {
                                        block38: {
                                            try {
                                                try {
                                                    try {
                                                        object = gc_0.c("w", (Object)callSite, (long)6597560168785889952L, (long)l2);
                                                        if (callSite3 != null) break block36;
                                                        if (callSite3 != null) break block37;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                                                    }
                                                    if (object == 0) break block38;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                                                }
                                                if (callSite3 == null) continue;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                                            }
                                        }
                                        callSite7 = gc_0.c("w", (Object)callSite, (int)gc_0.b("q", (int)1678, (long)(0x29C03BD9FD0C004FL ^ l2)), (long)6598958335889417544L, (long)l2);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                                    }
                                }
                                var15_12 = callSite7;
                                try {
                                    v10 = var15_12;
                                    if (callSite3 != null) break block39;
                                    if (v10 <= 0) throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)2122, (long)(0x28F413A93114A641L ^ l2))));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                                }
                                v10 = var15_12;
                            }
                            try {
                                if (v10 == gc_0.c("w", (Object)callSite, (long)6599340397173270514L, (long)l2) - 1) {
                                    throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)2122, (long)(0x28F413A93114A641L ^ l2))));
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                            }
                            callSite6 = gc_0.c("w", (Object)callSite, (int)0, (int)var15_12, (long)6600381504095326530L, (long)l2);
                            CallSite callSite9 = gc_0.c("F", (Object)gc_0.c("w", (Object)dS2, (long)6599600209448844437L, (long)l2), (long)6596100378448553089L, (long)l2);
                            callSite9 = callSite6;
                            gc_0.c("F", (Object)callSite9, (long)6598225720630607877L, (long)l2);
                            CallSite callSite10 = gc_0.c("w", (Object)callSite8, ((String)((Object)callSite9))::equals, (long)6596296704061282410L, (long)l2);
                            try {
                                try {
                                    callSite5 = callSite10;
                                    if (callSite3 != null) break block40;
                                    if (callSite5 != false) break block41;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                                }
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l;
                                objectArray2[1] = (int)gc_0.b("q", (int)30373, (long)(0x62FEDFD4DD727066L ^ l2));
                                objectArray2[0] = callSite6;
                                throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)11239, (long)(0x74212F41C9CE85E2L ^ l2))) + (String)((Object)gc_0.c("F", (Object)objectArray2, (long)6599854118556739185L, (long)l2)) + "'");
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                            }
                        }
                        try {
                            linkedHashMap2 = linkedHashMap;
                            callSite4 = callSite6;
                            if (callSite3 != null) break block42;
                            callSite5 = gc_0.c("w", linkedHashMap2, (Object)callSite4, (long)6596687076854584640L, (long)l2);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                        }
                    }
                    try {
                        if (callSite5 != false) {
                            Object[] objectArray3 = new Object[3];
                            objectArray3[2] = l;
                            objectArray3[1] = (int)gc_0.b("q", (int)30373, (long)(0x62FEDFD4DD727066L ^ l2));
                            objectArray3[0] = callSite6;
                            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)8483, (long)(0x55B1C499F4260F33L ^ l2))) + (String)((Object)gc_0.c("F", (Object)objectArray3, (long)6599854118556739185L, (long)l2)) + "'");
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                    }
                    linkedHashMap2 = linkedHashMap;
                    callSite4 = callSite6;
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l3;
                objectArray4[0] = gc_0.c("w", (Object)callSite, (int)(var15_12 + 1), (long)6599797572705292711L, (long)l2);
                gc_0.c("w", linkedHashMap2, (Object)callSite4, (Object)gc_0.c("F", (boolean)gc_0.c("F", (Object)objectArray4, (long)6599483356052018670L, (long)l2), (long)6597722659001041026L, (long)l2), (long)6597171123141607080L, (long)l2);
                if (callSite3 == null) continue;
            }
            callSite2 = gc_0.c("w", (Object)dS2, (long)6599600209448844437L, (long)l2);
            n2 = ((CallSite)callSite2).length;
            object = n = 0;
        }
        while (n < n2) {
            block43: {
                block44: {
                    callSite = callSite2[n];
                    try {
                        try {
                            try {
                                if (callSite3 != null) break block43;
                                if (gc_0.c("w", (Object)callSite, (long)6597560168785889952L, (long)l2) != false) break block44;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                            }
                            if (gc_0.c("w", linkedHashMap, (Object)callSite, (long)6596687076854584640L, (long)l2) != false) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                        }
                        Object[] objectArray5 = new Object[3];
                        objectArray5[2] = l;
                        objectArray5[1] = (int)gc_0.b("q", (int)30373, (long)(0x62FEDFD4DD727066L ^ l2));
                        objectArray5[0] = callSite;
                        throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)24612, (long)(0x1BA2F49A197D4E2DL ^ l2))) + (String)((Object)gc_0.c("F", (Object)objectArray5, (long)6599854118556739185L, (long)l2)) + "'");
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw gc_0.c("F", (Object)illegalArgumentException, (long)6597698024477493961L, (long)l2);
                    }
                }
                ++n;
            }
            if (callSite3 == null) continue;
        }
        return linkedHashMap;
    }

    private static int a(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        l = a ^ l;
        try {
            return (int)gc_0.c("F", (Object)gc_0.c("w", string, (long)-8219807434600902697L, (long)l), (long)-8218263278858653701L, (long)l);
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException((String)((Object)gc_0.a("h", (int)14343, (long)(0x73A2EBA55B21C073L ^ l))) + string2, numberFormatException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gc_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(gc_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gc_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


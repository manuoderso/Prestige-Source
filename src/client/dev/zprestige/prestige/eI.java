/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2583
 *  net.minecraft.class_3545
 *  net.minecraft.class_8685
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bA;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bb_0;
import dev.zprestige.prestige.bc_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dT;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_2583;
import net.minecraft.class_3545;
import net.minecraft.class_8685;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eI
extends dV {
    private dT a;
    private dT c;
    private dR d;
    private dM e;
    private class_8685 f = null;
    private class_1657 g;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        eI.k = hc.a(-8496508462401296681L, 8136646835197158282L, MethodHandles.lookup().lookupClass()).a(267658584907087L);
                        eI.r = new Object[146];
                        eI.s = new String[146];
                        eI.f();
                        eI.n = new HashMap<K, V>(13);
                        var11 = eI.k ^ 90325120271334L;
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
                        var20_3 = new String[35];
                        var18_4 = 0;
                        var17_5 = "\u00bdd\tx'\u00e5`U\u00cc\u00ee\u0094\u00e4\u00b7\u0002\u0083\u00ea\u0010m\u00ba\\\u0013k\u0094\u00ebU\u00e6\u00c3\u0015\u00b9\u00b96\u00edD\u0010g\u0092F\u0005\u00ef&\u00da\u0097\u00ec\u001c\u00bb.\u00be\u00a2\u00f1#\u0010\u00d7\u00ac\u00b0e\u001e2\u00f6\u001c4/\u00ad\u0084\u00dc\u00d5\u00178\u0010\u00a77\u00b7<y\u0082x\u00e1\u008c\u00e9-\u00a1\u0081\u00c77\u00f0\u00106Z\u009f\u0084\bv\u00c1L\u0084^/9\u00c1\u00ec\u00ce\u00a7\u0010\u00fas\u0091\u00f9\u00fe\u00d7\u00a0\u00c3\u0014\u00af\u00efU_\u0013\u0006\u0082\u0010C8\u008f\u00bbB#\u0010\u00da\u0097\u00f2\u0081i1)\u00b6s -\u00fa\u00a8\u00c1\u00fd\u0019\u00e3i\u001cZr#n\u00de\u00c0\u00f0C&\u00bc#\u0019\"\u00fa\u00c7rZ\u0085o\u0099V\\=\u0010\u00b0ru\u0006a\u00f7\u009et1I\u0015\u00a9\u00c4^\u00e8!\u0010\u009e\u00ad\u0095\"\u0088\u00e02\u00ddl\\\u0095j\u009c\u00e4T.\u0010\u00b8\u00d1\u00ea\u00ecB]\u00bdY\n\u00ceQN\u00bb\u00be\u0094\u00df \u00a3\u0016\u00d4HKO\u00ad\u00d6\u001c\u00d6\u00ecF\u0010+\u00a3\u00b3\f\u00cb\u00a4\u00ae\u00f2\u0092\u00d4\u008e:~\u00a7f\t<\u001f\u0098(P&|\u00d4\u00fd\u000eH\u00a7\u008bh\u008c%\u00c1{$\u00e3-\u00bal\u001e\u0016\u00d4\u00e3\u00d4|\u00aa\u00017\u0011hVX/\u0088T\u0091\u00dc\\ \u00b9\u0010-'\u0091\u00d7\u0090\u0012\u009c\u00ba\u00d0\u00bb\u00baL$^\u0005*\u00102\u0015\u0016=\u00c3\u00ca\u008d\u00b2\u00c6\rd\u00bc*n\u00d6\u00cf\u0010\u00e3\u0094U\u00b3\u00f3c\u00f3\u0094\u00ed\u00f2{;\u007f\u00e4\u001c\u00af\u0010\u0014l'\u00e3\u00f3\u007f\u00fa \u00a7B\u009a\u0012\u00fe%_:\u0010\u00d6\u00f9K@\u0003\u00d2\u00d7\u00c6\u00cfol\r\u008a\u0082\u0019F\u0018\u00ea\u0015\u00c8\u00a7T\u00f3\u00d97c\u00c7\u00d7\u00ff4\u00b9\u00c3\u00e3\u00b4\u008e0z\tH1x\u0018\u00afb\u0090\u0011\u00dc\u00fb\u009f\u001d\u0097\u0095\u0083\u00d8\u0091K\u0096\u00e6\u00cd\u00df\u00cc\u00e5t\u00fbG\u00a2\u0010\u00c0\u00e5\u00a8\u00c8S\u00ba\u00a0\u00a1\u00b8\u0096\u00abuuP\u00ef\u00ff\u0010\u0087\u00a0a\u00aaZ\u00cd\u00e3\u0091+\u00e4\u00dd\u0088\u00c8\u009dC\u00a4\u0010\u00bfy0\u00b1\u00b7\u0014J\u0006,\u00ad\u00f9\u00ebc\u00df\"R\u0010\u0098\u00b1\u0013P\u00f7\u00f3\t\f\u00f7\u0091\u00f7V\u00ab.\u000368\u00c9\u0003.\u00deF\u00a0\u00f1\u008f\u00ed\u00e6];wqY\u00ed\u00187\u0088\u0014\u00f3\u00ee\u00c9u\u0017/\u0096@hp\"\u0083\u00b6\u0019\"\u00ea\u0094O-\u00e0\u001b\u001ed:\u0005p_\u00e0\u0010i\u00c5\u00bb\u000b;B\u0096\u0010H~\u001c\u00f0\u00f2\u009f\u00dd\u00db\u000b7\u00e7\u00b7\u00f4\u0018\u00e0\u00f1\u0010\u007fI\u0002t\u00cc\u001aF+g\u00af\u0011\u00cd\u00a4/}\u00c6\u0010\u00b3\u00dc\u00f3\u0010z\u001e\u00d5\u008e8\u0005\u0080\u00dc\u00dc\u00dd+v\u0010$\u009e\u00da\u0095p\u00dfu\u00beU4\u00bd\u00d7\u0096y\u00d9\"\u0010\u00fe\u00820n`9\u008c;\u00ea,\u00eb\u00fa\u00a8\u00f6\u000e\u001f\u0010Z\u00b9\u001e\u00be\u00ec\u00f4U\u00d6B@\u009f\u00ac\u00cclj\u00d4\u0010|\u00e79WZ\u001f\u0004c%\u00f8~\u008fp\u0017\u001b\u00bb";
                        var19_6 = "\u00bdd\tx'\u00e5`U\u00cc\u00ee\u0094\u00e4\u00b7\u0002\u0083\u00ea\u0010m\u00ba\\\u0013k\u0094\u00ebU\u00e6\u00c3\u0015\u00b9\u00b96\u00edD\u0010g\u0092F\u0005\u00ef&\u00da\u0097\u00ec\u001c\u00bb.\u00be\u00a2\u00f1#\u0010\u00d7\u00ac\u00b0e\u001e2\u00f6\u001c4/\u00ad\u0084\u00dc\u00d5\u00178\u0010\u00a77\u00b7<y\u0082x\u00e1\u008c\u00e9-\u00a1\u0081\u00c77\u00f0\u00106Z\u009f\u0084\bv\u00c1L\u0084^/9\u00c1\u00ec\u00ce\u00a7\u0010\u00fas\u0091\u00f9\u00fe\u00d7\u00a0\u00c3\u0014\u00af\u00efU_\u0013\u0006\u0082\u0010C8\u008f\u00bbB#\u0010\u00da\u0097\u00f2\u0081i1)\u00b6s -\u00fa\u00a8\u00c1\u00fd\u0019\u00e3i\u001cZr#n\u00de\u00c0\u00f0C&\u00bc#\u0019\"\u00fa\u00c7rZ\u0085o\u0099V\\=\u0010\u00b0ru\u0006a\u00f7\u009et1I\u0015\u00a9\u00c4^\u00e8!\u0010\u009e\u00ad\u0095\"\u0088\u00e02\u00ddl\\\u0095j\u009c\u00e4T.\u0010\u00b8\u00d1\u00ea\u00ecB]\u00bdY\n\u00ceQN\u00bb\u00be\u0094\u00df \u00a3\u0016\u00d4HKO\u00ad\u00d6\u001c\u00d6\u00ecF\u0010+\u00a3\u00b3\f\u00cb\u00a4\u00ae\u00f2\u0092\u00d4\u008e:~\u00a7f\t<\u001f\u0098(P&|\u00d4\u00fd\u000eH\u00a7\u008bh\u008c%\u00c1{$\u00e3-\u00bal\u001e\u0016\u00d4\u00e3\u00d4|\u00aa\u00017\u0011hVX/\u0088T\u0091\u00dc\\ \u00b9\u0010-'\u0091\u00d7\u0090\u0012\u009c\u00ba\u00d0\u00bb\u00baL$^\u0005*\u00102\u0015\u0016=\u00c3\u00ca\u008d\u00b2\u00c6\rd\u00bc*n\u00d6\u00cf\u0010\u00e3\u0094U\u00b3\u00f3c\u00f3\u0094\u00ed\u00f2{;\u007f\u00e4\u001c\u00af\u0010\u0014l'\u00e3\u00f3\u007f\u00fa \u00a7B\u009a\u0012\u00fe%_:\u0010\u00d6\u00f9K@\u0003\u00d2\u00d7\u00c6\u00cfol\r\u008a\u0082\u0019F\u0018\u00ea\u0015\u00c8\u00a7T\u00f3\u00d97c\u00c7\u00d7\u00ff4\u00b9\u00c3\u00e3\u00b4\u008e0z\tH1x\u0018\u00afb\u0090\u0011\u00dc\u00fb\u009f\u001d\u0097\u0095\u0083\u00d8\u0091K\u0096\u00e6\u00cd\u00df\u00cc\u00e5t\u00fbG\u00a2\u0010\u00c0\u00e5\u00a8\u00c8S\u00ba\u00a0\u00a1\u00b8\u0096\u00abuuP\u00ef\u00ff\u0010\u0087\u00a0a\u00aaZ\u00cd\u00e3\u0091+\u00e4\u00dd\u0088\u00c8\u009dC\u00a4\u0010\u00bfy0\u00b1\u00b7\u0014J\u0006,\u00ad\u00f9\u00ebc\u00df\"R\u0010\u0098\u00b1\u0013P\u00f7\u00f3\t\f\u00f7\u0091\u00f7V\u00ab.\u000368\u00c9\u0003.\u00deF\u00a0\u00f1\u008f\u00ed\u00e6];wqY\u00ed\u00187\u0088\u0014\u00f3\u00ee\u00c9u\u0017/\u0096@hp\"\u0083\u00b6\u0019\"\u00ea\u0094O-\u00e0\u001b\u001ed:\u0005p_\u00e0\u0010i\u00c5\u00bb\u000b;B\u0096\u0010H~\u001c\u00f0\u00f2\u009f\u00dd\u00db\u000b7\u00e7\u00b7\u00f4\u0018\u00e0\u00f1\u0010\u007fI\u0002t\u00cc\u001aF+g\u00af\u0011\u00cd\u00a4/}\u00c6\u0010\u00b3\u00dc\u00f3\u0010z\u001e\u00d5\u008e8\u0005\u0080\u00dc\u00dc\u00dd+v\u0010$\u009e\u00da\u0095p\u00dfu\u00beU4\u00bd\u00d7\u0096y\u00d9\"\u0010\u00fe\u00820n`9\u008c;\u00ea,\u00eb\u00fa\u00a8\u00f6\u000e\u001f\u0010Z\u00b9\u001e\u00be\u00ec\u00f4U\u00d6B@\u009f\u00ac\u00cclj\u00d4\u0010|\u00e79WZ\u001f\u0004c%\u00f8~\u008fp\u0017\u001b\u00bb".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = eI.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "r\u008f\"\u0093\u009e(s\u0019\u00fc\u00fb\u00fe\u00e3\u00f0\u00fa\u00fe\u00b1\u0010'\u00f6\u00cd\u00fd\u00ef\u00de\u00f6\u00f4\u00c5\u00d9\u00da\u00d8$\u00c0w\u0005";
                            var19_6 = "r\u008f\"\u0093\u009e(s\u0019\u00fc\u00fb\u00fe\u00e3\u00f0\u00fa\u00fe\u00b1\u0010'\u00f6\u00cd\u00fd\u00ef\u00de\u00f6\u00f4\u00c5\u00d9\u00da\u00d8$\u00c0w\u0005".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = eI.b(var21_9).intern();
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
                eI.l = var20_3;
                eI.m = new String[35];
                eI.q = new HashMap<K, V>(13);
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
                var6_12 = new long[61];
                var3_13 = 0;
                var4_14 = "\u00be\u00f1\u00d4p27\u0091\b~\u0005\u00cdi\u00a1\u0018\u0095r\u008f/\u00967aUu\u00f0A(\u0007~\u00f7\u00f9\u00c6\u00af\u0010\u0091\u00c1\u00bd,\u00b8\u00a4g\u00ee\u00d0\u00a5\u008c\u00deM\u00eebAc$\u00d72\u00e6\u0087\u00ce\u0095e\u00db\u00dd\u0083\u00ff{[\u000b\u0014\u00cf\u0019\u008ey\u00f3\u0012\u00fa$\u00ef\u00d4\u00b1\u0086\u00ba\u00d8\u00f5\u00ec\u0095>\u0087p\u0098\u00c6\u00a5\u0088A\u00df\u0010<\u001ct\\\u009d\u00d8][o\u00ca\u00c5\u00ac~\u00d5pQ\u00d1]\u00f6,M\u00c0\u00ea\u00f2m\u00fe\u00cd\u007f \u009d\u0091=\u00f4f\u00d2\u009c\u00f7\u00ff\u00b3\u00cd\u00d0\u00e9\u00fb\u00fe\u0003\u00a7\u00d4@\u0016\u009eoy\u00c7w\u0016\u00b5ST\u00be{\u00f79\u00f1y\r\u00aa\u00cd\u0098\u00a9P\u00e5\u00d6\u00b6\u009b+f\u0017M\u00c9e\u001b\u0085\u007fl\u0098s\u00a4\u00cd\u00e8\u0088\u00e75\u0093\u008d{v\u00c6\u00e8\u00b7NC\u00cd\u00ab\u00bfM\u00bbv`E\u0080Ds\u00ad\u00a02\u00ce\u00abX\u007fK\u00c5`8\u00d1\u008e\u00ba#\u0010\u00c3?P\u0094\u00fa\u00a5t\u00bf\u00a1\u001e\u00a0\u00ea3\u00a8\u0085\u00ec\u00cf\u00fc$Rn\u00d0\u001c\u00b5\u00ed\u00e6\u00dd}\u00b2\u00e9\u0092\u0003\u00dc\t!\u0088\u00dd\u00c9\u00e9\u00a1\u0090\u008f^\u00a1\u00db8\u00dfd\u0083\u008ck\u0013\u009a\u00ffb\u009b\u00cc\u00cfRJ9M-&\u0018Uz\u0018\u00d73YL\u0090K\u001a6\u00ec\u00fa{\u00db\u00cd\u00bb\u00f1_y^S?\u009e;\u00f9Q\u00bf\\\u00f41.{\u00b2\t\u00ca\u0093\u00a7\u0014\u001d\u00e5\u007f7\u00e3'\u00931\n4\u00dbv\u0090^\u0088\u0011\u0017\u00db\u0097\u00bb/z=\u0016R\u00f2\u00ac\u00a8\u00c1\u0092\u00130\u00c9\t\u00beN\u00a8\u00b6\u008eOyc\u008bA\u00c9\u00b07\u0099\u00a1\u00cf\u009fla\u00df\u00be\u0092\u00ffvC\u00a4\u0012\u00ed\\\u00df\u00e5S\u00cf\u00a6\u00e07\u00e7zVM\u00f8D\u008e\u00d5\u009a\u00e1\u00ea\u00c4\u00cf\u00e5\u00f1\u00e4\u00dav\u0092\u00bb\u00e3A{\u00fe\u0082\u00bb\u001c\u0092Oy\u00b7\u00b3\u00b2\u0007\u00d6?\u00a5\u00ae\u00adcV\u001f\u0004\u009f\u009a\u00c7\u0013.N\u009a\u009d\u00d5\u008d\u00a5U\u00b7\u009a\u00e6c8\u0098\u00e6\u001e\u00fa\u0006x,\b\u00a4l\u00fe\u00d6@$U2\u0005";
                var5_15 = "\u00be\u00f1\u00d4p27\u0091\b~\u0005\u00cdi\u00a1\u0018\u0095r\u008f/\u00967aUu\u00f0A(\u0007~\u00f7\u00f9\u00c6\u00af\u0010\u0091\u00c1\u00bd,\u00b8\u00a4g\u00ee\u00d0\u00a5\u008c\u00deM\u00eebAc$\u00d72\u00e6\u0087\u00ce\u0095e\u00db\u00dd\u0083\u00ff{[\u000b\u0014\u00cf\u0019\u008ey\u00f3\u0012\u00fa$\u00ef\u00d4\u00b1\u0086\u00ba\u00d8\u00f5\u00ec\u0095>\u0087p\u0098\u00c6\u00a5\u0088A\u00df\u0010<\u001ct\\\u009d\u00d8][o\u00ca\u00c5\u00ac~\u00d5pQ\u00d1]\u00f6,M\u00c0\u00ea\u00f2m\u00fe\u00cd\u007f \u009d\u0091=\u00f4f\u00d2\u009c\u00f7\u00ff\u00b3\u00cd\u00d0\u00e9\u00fb\u00fe\u0003\u00a7\u00d4@\u0016\u009eoy\u00c7w\u0016\u00b5ST\u00be{\u00f79\u00f1y\r\u00aa\u00cd\u0098\u00a9P\u00e5\u00d6\u00b6\u009b+f\u0017M\u00c9e\u001b\u0085\u007fl\u0098s\u00a4\u00cd\u00e8\u0088\u00e75\u0093\u008d{v\u00c6\u00e8\u00b7NC\u00cd\u00ab\u00bfM\u00bbv`E\u0080Ds\u00ad\u00a02\u00ce\u00abX\u007fK\u00c5`8\u00d1\u008e\u00ba#\u0010\u00c3?P\u0094\u00fa\u00a5t\u00bf\u00a1\u001e\u00a0\u00ea3\u00a8\u0085\u00ec\u00cf\u00fc$Rn\u00d0\u001c\u00b5\u00ed\u00e6\u00dd}\u00b2\u00e9\u0092\u0003\u00dc\t!\u0088\u00dd\u00c9\u00e9\u00a1\u0090\u008f^\u00a1\u00db8\u00dfd\u0083\u008ck\u0013\u009a\u00ffb\u009b\u00cc\u00cfRJ9M-&\u0018Uz\u0018\u00d73YL\u0090K\u001a6\u00ec\u00fa{\u00db\u00cd\u00bb\u00f1_y^S?\u009e;\u00f9Q\u00bf\\\u00f41.{\u00b2\t\u00ca\u0093\u00a7\u0014\u001d\u00e5\u007f7\u00e3'\u00931\n4\u00dbv\u0090^\u0088\u0011\u0017\u00db\u0097\u00bb/z=\u0016R\u00f2\u00ac\u00a8\u00c1\u0092\u00130\u00c9\t\u00beN\u00a8\u00b6\u008eOyc\u008bA\u00c9\u00b07\u0099\u00a1\u00cf\u009fla\u00df\u00be\u0092\u00ffvC\u00a4\u0012\u00ed\\\u00df\u00e5S\u00cf\u00a6\u00e07\u00e7zVM\u00f8D\u008e\u00d5\u009a\u00e1\u00ea\u00c4\u00cf\u00e5\u00f1\u00e4\u00dav\u0092\u00bb\u00e3A{\u00fe\u0082\u00bb\u001c\u0092Oy\u00b7\u00b3\u00b2\u0007\u00d6?\u00a5\u00ae\u00adcV\u001f\u0004\u009f\u009a\u00c7\u0013.N\u009a\u009d\u00d5\u008d\u00a5U\u00b7\u009a\u00e6c8\u0098\u00e6\u001e\u00fa\u0006x,\b\u00a4l\u00fe\u00d6@$U2\u0005".length();
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
                    var4_14 = "\u00da%^|\u0084\u0000}\u00c5\u0092''\u00bd\u00b3\u00c1^\u00a4";
                    var5_15 = "\u00da%^|\u0084\u0000}\u00c5\u0092''\u00bd\u00b3\u00c1^\u00a4".length();
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
        eI.o = var6_12;
        eI.p = new Integer[61];
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6CE1;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eI.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eI.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eI", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eI.l[n2].getBytes("ISO-8859-1");
            eI.m[n2] = eI.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eI.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x448;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eI.p[n2] = n3;
        }
        return p[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eI.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eI.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                eI.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eI.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eI.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eI.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eI.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = ":2\u001f\"\u000f7,2\u001ax\u001c ;y\u0019~\u00104*>\u000ei[&\u0016";
        objectArray[1] = "Io\u000bWbB<O\u0000Xs\rAW\u0013_zD)";
        objectArray[2] = "RKG;\u007f\u0007RKPgs\bH\u0000Pys\u001dOq\u0002'&";
        objectArray[3] = "\u00190M *A\u0012?\\oWY\u00018U&";
        objectArray[4] = "Q\\P8+\u0007Q\\Gd'\bK\u0017Gz'\u001dLf\u0011$s_";
        objectArray[5] = Integer.TYPE;
        eI.s[5] = "java/lang/Integer";
        objectArray[6] = "F)a%(0P)d\u007f;'Gbgy73V%pn|%k";
        objectArray[7] = "[W\u000b\u000b>|PX\u001aD]qEU\u0015/hsTF\t\u0003\u007f~";
        objectArray[8] = ">S~'\u0015\r(S{}\u0006\u001a?\u0018x{\n\u000e._olA\u0019\u0011";
        objectArray[9] = "MH|v3\u0016FGm9R\u0018MLic";
        objectArray[10] = Boolean.TYPE;
        eI.s[10] = "java/lang/Boolean";
        objectArray[11] = ".3s\u0005H\u000b%<bJ%\u000f% d\u0007\u0012\u00026";
        objectArray[12] = Character.TYPE;
        eI.s[12] = "java/lang/Character";
        objectArray[13] = "g\u0019\u0019\u0011\u007f'g\u0019\u000eMs(}R\u000eSs=z#\\\t'y";
        objectArray[14] = "036\u001f-n03!C!a*x!]!t-\tp\u0004v6";
        objectArray[15] = "\u0001ti)=LtTb&,\u0003\u0015Zi-(Ya";
        objectArray[16] = Void.TYPE;
        eI.s[16] = "java/lang/Void";
        objectArray[17] = "\u0015HT?\"+\u0003HQe1<\u0014\u0003Rc=(\u0005DEtv9\u0012";
        objectArray[18] = ",\u0015:rp\u0001Y51}aN8;:ve\u0014L";
        objectArray[19] = "\u000fize\u0005\u000e\u0004fk*h\n\u0004z_aZ\u0017\u0000foa";
        objectArray[20] = "5/9D2~@\u000f2K#1!\u00019@'kU";
        objectArray[21] = "\u0002WeZ)\rwwnU8B\u0016ye^<\u0018b";
        objectArray[22] = "!%C\u0012\u0001\u0016!%TN\r\u0019;nTP\r\f<\u001f\u0006\u000eUH";
        objectArray[23] = "\n\u0004\u000fvrx\n\u0004\u0018*~w\u0010O\u00184~b\u0017>Hm+$";
        objectArray[24] = "U\u0004Sz\u0018MU\u0004D&\u0014BOOD8\u0014WH>\u0012f@\u0014";
        objectArray[25] = "\u0014\u0018I\u0001F2\n\u0010SN\u000e2\u0010\u001aK\t\u0007)P,Q\u0001\u001a>1\tZ\u0012\t3\u0011\u000b";
        objectArray[26] = "kj\u0012ch<\u001eJ\u0019lys\u007fD\u0012g})\u000b";
        objectArray[27] = "\u0019\u0002\u001b&_X\u000f\u0002\u001e|LO\u0018I\u001dz@[\t\u000e\nm\u000bJ\u001f";
        objectArray[28] = "z$\u0016n<$\u000f\u0004\u001da-kn\n\u0016j)1\u001a";
        objectArray[29] = "HD*;x\u0014=d!4i[\\j*?m\u0001(";
        objectArray[30] = "\u00124\u0006\u0002*<\u00124\u0011^&3\b\u007f\u0011@&&\u000f\u000e@\u0019\u007ff";
        objectArray[31] = "\u0006\u001c2Gl\u0017\u0006\u001c%\u001b`\u0018\u001cW%\u0005`\r\u001b&uX1";
        objectArray[32] = "`vJ4\u000b\r`v]h\u0007\u0002z=]v\u0007\u0017}L\t.P";
        objectArray[33] = "&\u007f>@Hc8w$\u000f)f8w'O\u0007z";
        objectArray[34] = "ERryd\u001bSRw#w\fD\u0019t%{\u0018U^c20\t`";
        objectArray[35] = "\nif`\u0011F\u007fImo\u0000\t\u001eGfd\u0004Sj";
        objectArray[36] = ")*\u0013\u0011n6\\\n\u0018\u001e\u007fy=\u0004\u0013\u0015{#I";
        objectArray[37] = "\u001f\f9uQF\u001f\f.)]I\u0005G.7]\\\u00026{o\f";
        objectArray[38] = "a\u0002x2Q_h\f{{\u0012Qw\u0019}pUR,*tqY`p\u0002suPU";
        objectArray[39] = "<&\u0017pa4I\u0006\u001c\u007fp{(\b\u0017tt!\\";
        objectArray[40] = "\r\u001ek\u000fY\r\r\u001e|SU\u0002\u0017U|MU\u0017\u0010$'\u0017\fQ";
        objectArray[41] = "&\u007fgC%E8w}\f^e\u0005Z";
        objectArray[42] = "[F\u0007\u0005Zh[F\u0010YVgA\r\u0010GVrF|E\u0018\u0003";
        objectArray[43] = "\u0007keGl\u0013\u0011k`\u001d\u007f\u0004\u0006 c\u001bs\u0010\u0017gt\f8\u0000[";
        objectArray[44] = "\u0000QM(wjuqF'f%\u0014\u007fM,b\u007f`";
        objectArray[45] = "3P~\u0014\u001fs3PiH\u0013|)\u001biV\u0013i.j<\tJ";
        objectArray[46] = "\u000e!L\u001eIR\u0010)VQ+N\u00174";
        objectArray[47] = "}t\u001eH\u0003lkt\u001b\u0012\u0010{|?\u0018\u0014\u001comx\u000f\u0003W}_";
        objectArray[48] = "n8\f-\u001cp\u001b\u0018\u0007\"\r?z\u0016\f)\te\u000e";
        objectArray[49] = "Ts\\\u0005}YTsKYqVN8KGqCII\u0019\u0019)\u0007\u001euDJcCe#\u001d\u0019)";
        objectArray[50] = "fyXY\u0016$xqB\u0016[>b{[JJ4bl\u0000{W<|tKLY3`}hML$~}";
        objectArray[51] = "R?0eBoL7**\noV=2m\u0003t\u0016\u001d)j\u001foU;4";
        objectArray[52] = "_\u0018'\u001fP\u001aA\u0010=P7\u001bP\u000b0\n\u0011\u001d";
        objectArray[53] = "^g~!|\u000e^gi}p\u0001D,icp\u0014C];?&V";
        objectArray[54] = "\u0014/\u0016\u0012o'\u001f \u0007]\u0003$\u0011\"\u0005\u0012/";
        objectArray[55] = "\u0018\u0003\u001b\u001fhdm#\u0010\u0010y+\f-\u001b\u001b}qx";
        objectArray[56] = "<2\u0011g\t{I\u0012\u001ah\u00184(\u001c\u0011c\u001cn\\";
        objectArray[57] = "$\u0018~/ol2\u0018{u|{%Sxspo4\u0014od;\u007f,\u0014moa2\u0010\u000fmrau'\u0018";
        objectArray[58] = "$;b`;S2;g:(D%pd<$P47s+oE\u0016";
        objectArray[59] = "\u001a\u0003m\f\u0003)o#f\u0003\u0012f\u000e-m\b\u0016<z";
        objectArray[60] = Double.TYPE;
        eI.s[60] = "java/lang/Double";
        objectArray[61] = "Zu\t\u0010A(Lu\fJR?[>\u000fL^+Jy\u0018[\u00159W";
        objectArray[62] = "1KV\u0000V\u007fDk]\u000fG0%eV\u0004CjQ";
        objectArray[63] = "ow\u001a\u0014\u0002xq\u007f\u0000[m\u007fww\u00159E~q";
        objectArray[64] = "\u0005*kZc,p\n`Urc\u0011\u0004k^v9e";
        objectArray[65] = " \u0012\bs@\u0004.\u0013\\m:\u0013%\u0002R\u007fmD{U\n\u0013_M*\u000eP/\\\u0010z\u000b";
        objectArray[66] = "]C\fW\u0014sEE\t\u0015)q:GPYRwYG\u001e\u0016\u0013\u007f:D]PP{G\u0001PR\u0014\u0018";
        objectArray[67] = "\u00107zmD\u001dA8&\u0000W'Bge{QDB)*:Y'\u0011h&`@]\u001b(qd>";
        objectArray[68] = "R\bll\u0011Z\u0012\u0013)h-\\-TceVZNT-*\u0017R-\u0016.{PE_\r?)\u00115";
        objectArray[69] = "z\f\u000e*\u001cehP\u00022faj\u0005\n8155Y_ef~o\b\u0010.\fl3\u0004\b";
        objectArray[70] = "\\X(\b\u001b\u0001\u001fTr\u0010jEN_%9\u0001RCJ?p\u0018\\DL;\r\u001a]CLC\u0002\u0000RVC{A\f\bN2";
        objectArray[71] = "'EO!!S|\u000e\\0 4q~\nef\rtO\u0003>\u007fUf";
        objectArray[72] = "b7O\\#\u00167iVS\u0012\u00104pKE~\"c3\u0014\u001b\"u`bA\u001fv\u000735V_\u0012NbhU\u0013q\u001b<qZ\"";
        objectArray[73] = "\nVt\u0013LZ\u0012PqQqXmR(\u001d\n^\u000eRfRKVm\u0010\"\u0006M\u0001\u0006\u0004%\u0004O1";
        objectArray[74] = "\u0014/6\u001b^\\\u0019%*C$\b\u0005=7EH:Rqh\u001b$\u0016\u0015-*RV\r\u0004\u007fk\"\\\u0012\u0015<5@\\\b\u000e W";
        objectArray[75] = "\u0014I\u001a\u0014]EQD\u0018P>SI\u0012\u001d\u0004_^Ut\r\nLV\u0013\b[\u000fY\t.K^ULUBMP\u0001W8";
        objectArray[76] = "(6N8\u0015\u0013ed\u0012=r\rtrC!\u001e?$>\u001b{rW&6Q+\u001eQ(bJF";
        objectArray[77] = "\u001d\rPCiDJ\fKR&{D\\H{v\u000bX5\f\u0002#\tIY\n\fw\u0012$";
        objectArray[78] = "bs)\b\u001eNlr}\u0016dRkrw\u000f\b`?3'Rd\u000e?5}\u0013_\t{wx\u0013d";
        objectArray[79] = "\u0004\b-\f-q_C>\u001d,\u0016\\3hJhw\u0000_=\u0019.w_";
        objectArray[80] = "V\u0012+E\u00043\u0005E<\u0005`/\u000e\u0011%\u00147xWC\u007fxY/\u0005A%\n\nx\u0012\u0001";
        objectArray[81] = "\u001b`OpmB^mM4\u000e^Z\u0010QqrN!b\u000b1|RMd\u0005eg?";
        objectArray[82] = "\u001f\u0017lm`}\u0015Gxo\u001a \u0016Uwdv\u0012B\u0011&<%EBG}>~7\u0011\u0010j~\u001a!ERyy\"+\u0015F{\u0003";
        objectArray[83] = "\u0016U?\u001dT\u0014\u0002E!Wd\u001a\u000bd8K\u001f\u0016\u0016@B\u0019[C\u0002Q.\u001fU\u0017\u0019<";
        objectArray[84] = "Q\u0012sn?L\t\u0012ya./\u0016Bv-\"h\u0006+-ow]\u0005G+a#Fh\u0012+1q_\u000bJ+;~Nh";
        objectArray[85] = "o\u0005E\u000f9-<RRO]17\u0006K^\nfn[\u00172d1<VK@7f+\u0016";
        objectArray[86] = "B\u0018{2|[\u000fJ'7\u001bE\u001e\\v+wwN\u001c)s\u001b\u0011\u000b@\u007f,!@\u0012\u001e)L";
        objectArray[87] = "/2\u0001\u0005Cg%b\u0015\u00079:&p\u001a\fU\bq3ES\u0007_rb\u0010V]-!5\u0007\u00169;uw\u0014\u0011\u00011%c\u0016k";
        objectArray[88] = "\u001cs*\u001bT\\Q!v\u001e3JT6.\u0001H'\u0013-w\u0015XBQ5}\u00003\u0018\u0012s5\b_\u001e\u001c'.e";
        objectArray[89] = "f'i\u000eD|5p~N `>$g_w7gw:3\u0019`5tgAJ7\"4";
        objectArray[90] = "8 +MQ\u0002?diHQ9dtlGMUV$*\u0017\u0014\u0002\u0001`v\u001cOPdt,\u0018F9ss{_[\u00010\u007f!G*";
        objectArray[91] = "\u0002GT\u0007TbUW\u001eW7b\u0000U\u000f\u0001[PT\u0014SZ\r\u0007SO_\u0016\\b\u0011WU\u00037";
        objectArray[92] = "\u0007\\O\u0011\u0005pX\u0013\u0019\u0000{i\n\u0010E\u000b\u0017[]S\u001b]G\f\u0007\u000eJ\u001d\u0006k\u0015QU\u0017{lW\u0006X\u0012\u00073\u0018PIl";
        objectArray[93] = "~!&:t\u0011/8xl\u0014N\"%&4x|sbzl,+ud=*wV0i?n\u0014K\u007f3;-h\u00140e*S";
        objectArray[94] = ";Ao]%Ah\u0016x\u001dA]cBa\f\u0016\n:\u00118`x]h\u0012a\u0012+\n\u007fR";
        objectArray[95] = "\u0010\u0005\u00024\u0017u\u0019^\u001bl\u0005D@9C=\u000f?FZCs@~N9E2E6DUC<\u0011-)";
        objectArray[96] = "\u000fU4x\u0018lWU>w\t\u000f\\\u000b2\"\u0005fP2<\"\u0015b6Sj~\u001abZUd*\u0001\u000f";
        objectArray[97] = "E+}R'\u0019\u00142#\u0004GF\u0019/}\\+tOk$\u0005|#NnfB$^\u000bcd\u0006G\u0012\f3t[}C\u0015m\";";
        objectArray[98] = "VlH\u0010\u0016*Ry\u000b\ft8<+E\u0013\u000f=_+\u000b\\N5<xJP\u0014,Fr\n\u0007\u0010R";
        objectArray[99] = ".N04o!v\u00190w_/\u0013\u0017f{/-vU~q:F";
        objectArray[100] = "[wbt\u007f\u001d\u001ez`0\u001c\u001e\b.d`[\u000eat\u007f=l\u000b\u00046g7y`[wbt\u007f\u001d\u001ez`0\u001c";
        objectArray[101] = "\u001cD\f\u001f+\"Q\u0016P\u001aL<@\u0000\u0001\u0006 \u000e\u0010B[QLbM\u0005Q\\|5FAYa";
        objectArray[102] = "M\u0004\u0005oi\u0000LH@m\u0019Qq\u0003OtbW\u0012\u0003\u0001;#_q\u0001\u001f\u007f)\u0005AV\u0014;!8";
        objectArray[103] = "\u0012\t\u007f&#FA^hfGZJ\nqw\u0010\r\u0013Y%\u001b~ZAZqi-\rV\u001a";
        objectArray[104] = "L\u000e\u0005\u0018,\u0010\t\u0003\u0007\\O\u0000\u000fN\u0017\u00054mHUN\u0011$\b\nMD\u0004ORI\u000b\f\f#TG_\u0017a";
        objectArray[105] = "MoH=\u0016xL#\r?f)qh\u0002&\u001d/\u0012hLi\\'q`\n9\u0018'\n-Xe\u001d@";
        objectArray[106] = "Cm\u001d`Sx\u0010:\n 7d\u001bn\u00131`3B=O]\u000ed\u0010>\u0013/]3\u0007~";
        objectArray[107] = "K\u0018-\u001aQg\u001eF4\u0015`a\u001d_)\u0003\fSJ\u001cv]_\u0004KC0T]4\u001cHt\\`?KG7U\u0003j\u0015^8d";
        objectArray[108] = "5\u001e\u0003<8\u001fe\u001e\u0000!J\u0000c\u0006\u001c*\r\u0010\nR\u0018x0\u001b5\u0007\u0010#1~5\u001e\u0003<8\u001fe\u001e\u0000!J";
        objectArray[109] = "%-=\u000b\u0004N=+8I9OB)a\u0005BJ!)/J\u0003BBznFY[8p.\u0011]%";
        objectArray[110] = "And\u0012a\u0017\u0010a8\u007fq-Qat\rcGLix\u007f";
        objectArray[111] = "#Gk\\?u!O4_Q} _:\u0005=Op\u001fe]Q)5C3\u0002kx,\u001deb";
        objectArray[112] = "#{CvT11jP*&60n\\pJ\u0004d\"\u0000*\u0018S\"xR'B0 cZ&&";
        objectArray[113] = "j\u001d\u001b\u001aA('OG\u001f&66Y\u0016\u0003J\u0004a\u0014K\\\u001aSd\u001aN\u0016K?b\u0014\u001a\r&";
        objectArray[114] = "$\u001dB%d\u0007*\u001c\u0016;\u001e\u0010!\r\u0018)IG~PCE`\u0017?\u0001\u000e'r\u0006,]";
        objectArray[115] = "3^dm2p`\ts-Vlk]j<\u0001;2\u000e5Pol`\rj\"<;wM";
        objectArray[116] = "DvX+GvDlC7%qQuE1IC\u00068\u001bh%mZ2@?@y\u00006IV";
        objectArray[117] = "/Bt\"\u0014\u000e~[*tt[sFO7\u000eUxU\u0014qIOgYi4DM#:";
        objectArray[118] = "5$@\\S}6y\u0010Y5$=hNZY\u0016o/\u0013\u00065p(tG]\u000f!1*\u0011=\n~hfCQ\fp<}.W\np0jT]J'4\u0014";
        objectArray[119] = "Z/ SFBT.tM<^S.~TPl\u0007o \t<GP3'I\rJZ/\u007f3";
        objectArray[120] = "w\u0015S\u0012bZu\u001d\f\u0011\fZ`\f\u000bHw7'\u0017R\\gRe\u000fXI\f\b&I\u0010A`\u000e(\u001d\u000b,";
        objectArray[121] = "lAa$nl)Lc`\rq?\u0007z\u0016j};|!=t!kLv60)V";
        objectArray[122] = "\u001d\u001eB\u001b\u000bZX\u0013@_h[@xE\u0018\tAH#\u0003_\u0013^D^FR\u0011\u001a'";
        objectArray[123] = "]U\\ey{\u0004P\u0005&\u0002*?W\u000e+y/\\W@d8'?\u0004\u0001hb>E\u000eA?f@";
        objectArray[124] = ";#W;\u000eu?6\u0014'lfQdZ8\u0017b2d\u0014wVjQ7U{\fs+=\u0015,\b\r";
        objectArray[125] = "A\u001av0mXS\u000bel\u001f_R\u000fi6sm\u0005B5l\u001f\u0001_\n9l/VTN1Qn^_\rs;|\u0002S\u0015\t; \u000b_\rs1`\\[s";
        objectArray[126] = "M)~hsl\u0015~~+Cbpp('3`\u001520-&\u000b\u001aq\u007fw=q\u00101(sC";
        objectArray[127] = "}i?~\r)=rzz1/\u000250wJ)a5~8\u000b!\u0002uf>T/ga<:]F";
        objectArray[128] = "BY4)ZB\u0015X/8\u0015}\u001d\f'+(C\u001dQ'<M\u0001\u0005[2W";
        objectArray[129] = "~ %4\u001cDtp16f\u0019wb>=\n+! gaW|!~'j[Lvucbf\u0018$e0 ^\u0012tq2Z";
        objectArray[130] = "[b3\u0007L\t\b5$G(\u0015\u0003a=V\u007fBZ3d:\u0011\u0015\b1=HBB\u001fq";
        objectArray[131] = "8$z\u0015\u001eM})xQ}To\u007fn\u0010\u001d09yx\\@\u0000nr<T}";
        objectArray[132] = "@\u0014k;0j\u0005\u0019i\u007fSk\u001dmw=>m1@k/S-GRi!.hJP-B";
        objectArray[133] = "$+aN\fG >\"RnUNllM\u0015P-l\"\u0002TXNoaD\u0017\\3*lFS?";
        objectArray[134] = "r\b%v_\u0007#\u0011{ ?X.\f%xSj\u007fKy \u0004=#@/bAA|\u000fys?";
        objectArray[135] = "M\u0005\u0016\u00149E\u0012J@\u0005G\\@I\u001c\u000e+n\u0014\rLT}9\u001cM\u001c\u0000'\u0003MTBVGY\u001d_\u0001\u0017;\u0006R\t\u0010i";
        objectArray[136] = "Y}2\u0001\u0006\t\u0014/n\u0004a\u0017\u00059?\u0018\r%U{a@a\t\u0015)\"\u000f\u0013\u0012\u0004{c\u007f";
        objectArray[137] = "`-*\u000bA&cpz\u000e'\u007fha$\rKM8-yZ'ta,z\u0004Jvisyj\u001e'ug)\u000eNxdv\u007fj";
        objectArray[138] = " xKkfn!4\u000ei\u0016?\u001c\u007f\u0001pm9\u007f\u007fO?,1\u001c)_9w5y~Os'V";
        objectArray[139] = "\u001f8;Ow%\u001et~M\u0007t#;*W>\"\u001f<>Mh\u001d\u001em0\u001f8!\u0019y*I\u0007";
        objectArray[140] = "eKb.\u001a[0\u0018$.E75u!\u007fUL3\u0016!1\u001a\r;u'p\u001fE1\u0019!~K^\\";
        objectArray[141] = "r\u0016B\u0017LW+\u0013\u001bT7\u0005\u0010\u0014\u0010YL\u0003s\u0014^\u0016\r\u000b\u0010CD\u001a\t\u0002}ALE\nl";
        objectArray[142] = "k\u0003{K+w\u007f\u0013e\u0001\u001bw`\u0016\u0006N}(}\u0001c\fe\"hj";
        objectArray[143] = "F!_;q\u0001DcUn}q\u001emX*}\r\u0018k5i,\u0012\u0001c\n>-\t\u0010,5";
        objectArray[144] = "VRV^\u001c\u0005TI^_x\u0007UUB\u0007\u0004\u0001S8\u0001V\u001b\u0018[\u0007VW\u0000\t\u00148";
        Object[] objectArray2 = objectArray;
        objectArray[145] = "f_x\u0003K\u000f+]5\u0017s\u0002\u001b\b9\u001b\b\u0004x\bwTI\f\u001b\u000b4\u0012\n\bfN9\u0010Nk";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eI.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'Z' || c == '\u00c1' || c == 'Y') {
                field = eI.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eI.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static class_1657 a(Object[] objectArray) {
        class_1657 class_16572;
        block19: {
            long l = (Long)objectArray[0];
            long l2 = l = k ^ l;
            long l3 = l2 ^ 0xD41995EAE02L;
            long l4 = l2 ^ 0x2AA98139BBB7L;
            class_1657 class_16573 = null;
            CallSite callSite = eI.d("B", new ArrayList(eI.d("B", (Object)eI.d("\u00e4", (Object)b, (long)-3488956720829722474L, (long)l), (long)-3489101810038822923L, (long)l)), (long)-3482431857836612040L, (long)l);
            CallSite callSite2 = eI.d("W", (long)-3489236882045201851L, (long)l);
            while (eI.d("B", (Object)callSite, (long)-3487107224580832780L, (long)l) != false) {
                block25: {
                    Object object;
                    block23: {
                        CallSite callSite3;
                        class_1657 class_16574;
                        block22: {
                            block21: {
                                block20: {
                                    class_16574 = (class_1657)eI.d("B", (Object)callSite, (long)-3483504413689730409L, (long)l);
                                    try {
                                        try {
                                            class_16572 = class_16574;
                                            if (callSite2 != null) break block19;
                                            callSite3 = eI.d("B", (Object)class_16572, (Object)eI.d("\u00e4", (Object)b, (long)-3487958638164238167L, (long)l), (long)-3486334290044552728L, (long)l);
                                            if (callSite2 != null) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                                        }
                                        if (callSite3 != false) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l3;
                                    objectArray2[0] = eI.d("B", (Object)eI.d("B", (Object)class_16574, (long)-3486467898106117957L, (long)l), (long)-3488747626968332455L, (long)l);
                                    callSite3 = eI.d("B", (Object)eI.d("\u00c1", (long)-3487529450168724141L, (long)l), (Object)objectArray2, (long)-3485800493563481383L, (long)l);
                                }
                                try {
                                    if (callSite2 != null) break block21;
                                    if (callSite3 != false) continue;
                                }
                                catch (MatchException matchException) {
                                    throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                                }
                                callSite3 = eI.d("B", (Object)eI.d("B", (Object)eI.d("B", (Object)class_16574, (long)-3486467898106117957L, (long)l), (long)-3488747626968332455L, (long)l), (long)-3483271144354844106L, (long)l);
                            }
                            try {
                                if (callSite2 != null) break block22;
                                if (callSite3 < 3) continue;
                            }
                            catch (MatchException matchException) {
                                throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l4;
                            objectArray3[0] = class_16574;
                            callSite3 = eI.d("B", (Object)eI.d("\u00c1", (long)-3486962875990141123L, (long)l), (Object)objectArray3, (long)-3482649883383666966L, (long)l);
                        }
                        try {
                            if (callSite3 == false && callSite2 == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                        }
                        try {
                            block24: {
                                try {
                                    try {
                                        try {
                                            object = class_16573;
                                            if (callSite2 != null) break block23;
                                            if (object == null) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                                        }
                                        object = eI.d("\u00e4", (Object)b, (long)-3487958638164238167L, (long)l);
                                        if (callSite2 != null) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                                    }
                                    if (!(eI.d("B", (Object)object, (Object)class_16574, (long)-3482836350903046737L, (long)l) < eI.d("B", (Object)eI.d("\u00e4", (Object)b, (long)-3487958638164238167L, (long)l), (Object)class_16573, (long)-3482836350903046737L, (long)l))) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                                }
                            }
                            object = class_16574;
                        }
                        catch (MatchException matchException) {
                            throw eI.d("W", (Object)matchException, (long)-3482719181798763086L, (long)l);
                        }
                    }
                    class_16573 = object;
                }
                if (callSite2 == null) continue;
            }
            class_16572 = class_16573;
        }
        return class_16572;
    }

    /*
     * Exception decompiling
     */
    private static int a(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 22[SWITCH]
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

    /*
     * Exception decompiling
     */
    private class_3545 a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 44[SWITCH]
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

    @bP
    public void a(bb_0 bb_02) {
        block13: {
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            CallSite callSite4;
            CallSite callSite5;
            CallSite callSite6;
            long l;
            block14: {
                block15: {
                    Object object;
                    CallSite callSite7;
                    block12: {
                        long l2;
                        block10: {
                            block11: {
                                l = k ^ 0x42A8C715DB2AL;
                                l2 = l ^ 0x74734F6D2737L;
                                callSite7 = eI.d("W", (long)-3485515675753180554L, (long)l);
                                try {
                                    object = this.g;
                                    if (callSite7 != null) break block10;
                                    if (object != null) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw eI.d("W", (Object)matchException, (long)-3487566064557091455L, (long)l);
                                }
                                return;
                            }
                            object = eI.d("B", (Object)bb_02, (Object)new Object[0], (long)-3487992585149123932L, (long)l);
                        }
                        try {
                            try {
                                if (callSite7 != null) break block12;
                                if (eI.d("B", (Object)object, (Object)this.g, (long)-3484283674160424621L, (long)l) == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw eI.d("W", (Object)matchException, (long)-3487566064557091455L, (long)l);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l2;
                            object = eI.d("B", (Object)eI.d("B", (Object)this, (Object)objectArray, (long)-3487498383740053033L, (long)l), (long)-3481947429379263235L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eI.d("W", (Object)matchException, (long)-3487566064557091455L, (long)l);
                        }
                    }
                    callSite6 = eI.d("W", (Object)eI.d("W", (Object)object, (long)-3485131654704328535L, (long)l), (long)-3482402764243084009L, (long)l);
                    callSite5 = eI.d("B", (Object)eI.d("W", (Object)eI.d("B", (String)((Object)eI.d("B", (Object)this.d, (long)-3484775122259532683L, (long)l)), (long)-3484105191184088874L, (long)l), (long)-3482402764243084009L, (long)l), this::lambda$onLabel$0, (long)-3482271995447463248L, (long)l);
                    callSite4 = eI.d("B", (Object)eI.d("W", (Object)eI.b("h", (int)30710, (long)(0x36DE7E60A4BCD4ABL ^ l)), (long)-3482402764243084009L, (long)l), eI::lambda$onLabel$1, (long)-3482271995447463248L, (long)l);
                    callSite3 = eI.d("B", (Object)eI.d("W", (Object)eI.d("B", (String)((Object)eI.d("B", (Object)this.a, (long)-3484775122259532683L, (long)l)), (long)-3484105191184088874L, (long)l), (long)-3482402764243084009L, (long)l), eI::lambda$onLabel$2, (long)-3482271995447463248L, (long)l);
                    try {
                        callSite2 = eI.d("B", (String)((Object)eI.d("B", (Object)this.a, (long)-3484775122259532683L, (long)l)), (long)-3481543121223152766L, (long)l);
                        if (callSite7 != null) break block14;
                        if (callSite2 == false) break block15;
                    }
                    catch (MatchException matchException) {
                        throw eI.d("W", (Object)matchException, (long)-3487566064557091455L, (long)l);
                    }
                    callSite3 = eI.d("B", (Object)eI.d("W", (Object)eI.d("B", (Object)eI.d("B", (Object)eI.d("B", (Object)bb_02, (Object)new Object[0], (long)-3487992585149123932L, (long)l), (long)-3485588535113480970L, (long)l), (long)-3484041207355750550L, (long)l), (long)-3482402764243084009L, (long)l), eI::lambda$onLabel$3, (long)-3482271995447463248L, (long)l);
                }
                callSite2 = eI.d("B", (String)((Object)eI.d("B", (Object)this.d, (long)-3484775122259532683L, (long)l)), (Object)eI.b("h", (int)31016, (long)(0x3F618CB765BEDA60L ^ l)), (long)-3485430513111662917L, (long)l);
            }
            try {
                callSite = callSite2 != false ? eI.d("W", (long)-3487218297657381512L, (long)l) : eI.d("B", (Object)eI.d("B", (Object)callSite6, (Object)callSite5, (long)-3487331152970079230L, (long)l), (Object)callSite4, (long)-3487331152970079230L, (long)l);
            }
            catch (MatchException matchException) {
                throw eI.d("W", (Object)matchException, (long)-3487566064557091455L, (long)l);
            }
            CallSite callSite8 = eI.d("B", (Object)callSite, (Object)callSite3, (long)-3487331152970079230L, (long)l);
            eI.d("B", (Object)bb_02, (Object)new Object[]{callSite8}, (long)-3484209615867945116L, (long)l);
            eI.d("B", (Object)bb_02, (Object)new Object[0], (long)-3482518430734800515L, (long)l);
        }
    }

    @bP
    public void a(bc_0 bc_02) {
        block15: {
            bc_0 bc_03;
            long l;
            block14: {
                CallSite callSite;
                block12: {
                    CallSite callSite2;
                    block13: {
                        block11: {
                            Object object;
                            block10: {
                                l = k ^ 0x77BD9322F549L;
                                callSite2 = eI.d("W", (long)-2178685722459227115L, (long)l);
                                try {
                                    try {
                                        object = this.g;
                                        if (callSite2 != null) break block10;
                                        if (object == null) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw eI.d("W", (Object)matchException, (long)-2163249333914747934L, (long)l);
                                    }
                                    object = eI.d("B", (Object)this.a, (long)-2179563651555587562L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eI.d("W", (Object)matchException, (long)-2163249333914747934L, (long)l);
                                }
                            }
                            try {
                                callSite = eI.d("B", (String)object, (long)-2176320610437880351L, (long)l);
                                if (callSite2 != null) break block12;
                                if (callSite == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw eI.d("W", (Object)matchException, (long)-2163249333914747934L, (long)l);
                            }
                        }
                        return;
                    }
                    try {
                        bc_03 = bc_02;
                        if (callSite2 != null) break block14;
                        callSite = eI.d("B", (Object)eI.d("B", (Object)bc_03, (Object)new Object[0], (long)-2163629307098795218L, (long)l), (Object)eI.d("B", (Object)eI.d("B", (Object)this.g, (long)-2175820806132715797L, (long)l), (long)-2178326123957720823L, (long)l), (long)-2176755243602311020L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eI.d("W", (Object)matchException, (long)-2163249333914747934L, (long)l);
                    }
                }
                try {
                    if (callSite == false) break block15;
                    eI.d("B", (Object)bc_02, (Object)new Object[]{eI.d("B", (Object)eI.d("B", (Object)this.g, (long)-2175820806132715797L, (long)l), (long)-2178326123957720823L, (long)l)}, (long)-2179479125526257091L, (long)l);
                    eI.d("B", (Object)bc_02, (Object)new Object[]{eI.d("B", (String)((Object)eI.d("B", (Object)this.a, (long)-2179563651555587562L, (long)l)), (long)-2177827022538543435L, (long)l)}, (long)-2177668356081783065L, (long)l);
                    bc_03 = bc_02;
                }
                catch (MatchException matchException) {
                    throw eI.d("W", (Object)matchException, (long)-2163249333914747934L, (long)l);
                }
            }
            eI.d("B", (Object)bc_03, (Object)new Object[0], (long)-2177298119510063330L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block29: {
            block30: {
                block28: {
                    block26: {
                        block27: {
                            block22: {
                                v0 = var2_2 = eI.k ^ 132314274063448L;
                                var4_3 = v0 ^ 109465041578960L;
                                var6_4 = v0 ^ 59286349060370L;
                                var8_5 = v0 ^ 49279619003887L;
                                var11_6 = eI.d("B", (Object)eI.d("B", (Object)eI.d("\u00e4", (Object)eI.b, (long)-1092739906128597033L, (long)var2_2), (long)-1092884997796095820L, (long)var2_2), (long)-1086084174692069709L, (long)var2_2);
                                var10_7 = eI.d("W", (long)-1093584110494601980L, (long)var2_2);
                                while (eI.d("B", (Object)var11_6, (long)-1091492936109162827L, (long)var2_2) != false) {
                                    block24: {
                                        block25: {
                                            block23: {
                                                var12_8 /* !! */  = (class_1657)eI.d("B", (Object)var11_6, (long)-1087221628285184554L, (long)var2_2);
                                                try {
                                                    try {
                                                        try {
                                                            v1 = eI.d("B", (Object)var12_8 /* !! */ , (Object)eI.d("\u00e4", (Object)eI.b, (long)-1091777008246775832L, (long)var2_2), (long)-1090011924406122839L, (long)var2_2);
                                                            if (var10_7 != null) break block22;
                                                            if (var10_7 != null) break block23;
                                                        }
                                                        catch (MatchException v2) {
                                                            throw eI.d("W", (Object)v2, (long)-1086607920624948493L, (long)var2_2);
                                                        }
                                                        if (v1 != false) break block24;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw eI.d("W", (Object)v3, (long)-1086607920624948493L, (long)var2_2);
                                                    }
                                                    v4 = eI.d("B", (Object)var12_8 /* !! */ , (long)-1092917457486308031L, (long)var2_2);
                                                }
                                                catch (MatchException v5) {
                                                    throw eI.d("W", (Object)v5, (long)-1086607920624948493L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var10_7 != null) break block25;
                                                    if (v4 == false) {
                                                    }
                                                    ** GOTO lbl43
                                                }
                                                catch (MatchException v6) {
                                                    throw eI.d("W", (Object)v6, (long)-1086607920624948493L, (long)var2_2);
                                                }
                                                v4 = eI.d("B", (Object)var12_8 /* !! */ , (long)-1091433056539891876L, (long)var2_2);
                                            }
                                            catch (MatchException v7) {
                                                throw eI.d("W", (Object)v7, (long)-1086607920624948493L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            if (v4 != false) break block24;
lbl43:
                                            // 2 sources

                                            eI.d("B", (Object)eI.d("\u00e4", (Object)eI.b, (long)-1092739906128597033L, (long)var2_2), (int)eI.d("B", (Object)var12_8 /* !! */ , (long)-1094330290334592102L, (long)var2_2), (Object)eI.d("\u00c1", (long)-1092073596455436931L, (long)var2_2), (long)-1092680848768631300L, (long)var2_2);
                                        }
                                        catch (MatchException v8) {
                                            throw eI.d("W", (Object)v8, (long)-1086607920624948493L, (long)var2_2);
                                        }
                                    }
                                    if (var10_7 == null) continue;
                                }
                                v9 = new Object[1];
                                v9[0] = var4_3;
                                this.g = eI.d("W", (Object)v9, (long)-1093476851840178610L, (long)var2_2);
                                v1 = eI.d("B", (Object)((Boolean)eI.d("B", (Object)this.e, (long)-1093902454748996857L, (long)var2_2)), (long)-1093962331355592998L, (long)var2_2);
                            }
                            try {
                                if (var10_7 != null) break block26;
                                if (v1 != false) break block27;
                            }
                            catch (MatchException v10) {
                                throw eI.d("W", (Object)v10, (long)-1086607920624948493L, (long)var2_2);
                            }
                            return;
                        }
                        try {
                            eI.d("B", (Object)this.e, (Object)eI.d("W", (boolean)false, (long)-1090858660148507503L, (long)var2_2), (long)-1092446202819132183L, (long)var2_2);
                            v11 = (String)eI.d("B", (Object)this.a, (long)-1093902454748996857L, (long)var2_2);
                            if (var10_7 != null) break block28;
                            v1 = eI.d("B", (Object)v11, (long)-1090671536117762832L, (long)var2_2);
                        }
                        catch (MatchException v12) {
                            throw eI.d("W", (Object)v12, (long)-1086607920624948493L, (long)var2_2);
                        }
                    }
                    if (v1 != false) {
                        return;
                    }
                    v11 = eI.d("B", (String)eI.d("B", (Object)this.a, (long)-1093902454748996857L, (long)var2_2), (long)-1092190839624892508L, (long)var2_2);
                }
                v13 = new Object[2];
                v13[1] = var6_4;
                v13[0] = v11;
                var11_6 = eI.d("W", (Object)v13, (long)-1092040028791336170L, (long)var2_2);
                try {
                    v14 = var11_6;
                    if (var10_7 != null) break block29;
                    if (v14 != null) break block30;
                }
                catch (MatchException v15) {
                    throw eI.d("W", (Object)v15, (long)-1086607920624948493L, (long)var2_2);
                }
                return;
            }
            v14 = var11_6;
        }
        v16 = new Object[2];
        v16[1] = var8_5;
        v16[0] = v14;
        var12_8 /* !! */  = eI.d("W", (Object)v16, (long)-1092543877141336166L, (long)var2_2);
        var13_9 = eI.d("B", (Object)eI.d("B", (Object)eI.b, (long)-1091301116396379458L, (long)var2_2), (Object)var12_8 /* !! */ , (long)-1089936652198899578L, (long)var2_2);
        eI.d("B", (Object)var13_9, (Consumer<Optional>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$onTick$4(java.util.Optional ), (Ljava/util/Optional;)V)((eI)this), (long)-1091881823696875769L, (long)var2_2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bA bA2) {
        bA bA3;
        long l;
        block31: {
            CallSite callSite;
            CallSite callSite2;
            long l2;
            block30: {
                CallSite callSite3;
                block29: {
                    bA bA4;
                    block28: {
                        eI eI2;
                        block27: {
                            l = k ^ 0x1F09E1D5C315L;
                            l2 = l ^ 0xCC288B33A84L;
                            callSite2 = eI.d("W", (long)-2909421752953271735L, (long)l);
                            try {
                                try {
                                    eI2 = this;
                                    if (callSite2 != null) break block27;
                                    if (eI2.g == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                                }
                                eI2 = this;
                            }
                            catch (MatchException matchException) {
                                throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (eI2.f == null) return;
                                    bA4 = bA2;
                                    if (callSite2 != null) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                                }
                                if (eI.d("B", (Object)bA4, (Object)new Object[0], (long)-2912547664528917684L, (long)l) == null) return;
                            }
                            catch (MatchException matchException) {
                                throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                            }
                            bA4 = bA2;
                        }
                        catch (MatchException matchException) {
                            throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                        }
                    }
                    try {
                        try {
                            callSite3 = eI.d("B", (Object)bA4, (Object)new Object[0], (long)-2912050253365210545L, (long)l);
                            if (callSite2 != null) break block29;
                            if (callSite3 == null) return;
                        }
                        catch (MatchException matchException) {
                            throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                        }
                        callSite3 = eI.d("B", (Object)this.a, (long)-2910228211111936950L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                    }
                }
                try {
                    try {
                        try {
                            if (eI.d("B", (String)((Object)callSite3), (long)-2913741706454494275L, (long)l) != false) return;
                            callSite = eI.d("B", (Object)eI.d("B", (Object)b, (long)-2911057459814826410L, (long)l), (Object)eI.d("B", (Object)this.g, (long)-2907625200298041689L, (long)l), (long)-2911931304585252090L, (long)l);
                            if (callSite2 != null) break block30;
                        }
                        catch (MatchException matchException) {
                            throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                        }
                        if (callSite == null) return;
                    }
                    catch (MatchException matchException) {
                        throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                    }
                    callSite = eI.d("B", (Object)eI.d("B", (Object)b, (long)-2911057459814826410L, (long)l), (Object)eI.d("B", (Object)this.g, (long)-2907625200298041689L, (long)l), (long)-2911931304585252090L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                }
            }
            try {
                if (eI.d("B", (Object)callSite, (long)-2911285870813561663L, (long)l) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
            }
            try {
                try {
                    bA3 = bA2;
                    if (callSite2 != null) break block31;
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = eI.d("B", (Object)eI.d("B", (Object)eI.d("B", (Object)b, (long)-2911057459814826410L, (long)l), (Object)eI.d("B", (Object)this.g, (long)-2907625200298041689L, (long)l), (long)-2911931304585252090L, (long)l), (long)-2911285870813561663L, (long)l);
                    if (eI.d("B", (Object)eI.d("B", (Object)bA3, (Object)new Object[0], (long)-2912547664528917684L, (long)l), (Object)eI.d("W", (Object)objectArray, (long)-2909190003681226121L, (long)l), (long)-2909854451497179516L, (long)l) == false) return;
                }
                catch (MatchException matchException) {
                    throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
                }
                eI.d("B", (Object)bA2, (Object)new Object[]{this.f}, (long)-2909525770298591010L, (long)l);
                bA3 = bA2;
            }
            catch (MatchException matchException) {
                throw eI.d("W", (Object)matchException, (long)-2907372054298882626L, (long)l);
            }
        }
        eI.d("B", (Object)bA3, (Object)new Object[0], (long)-2912485007361756862L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (s[n3] != null) {
            return n3;
        }
        Object object = r[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 42;
            case 1 -> 41;
            case 2 -> 22;
            case 3 -> 39;
            case 4 -> 27;
            case 5 -> 49;
            case 6 -> 53;
            case 7 -> 12;
            case 8 -> 34;
            case 9 -> 10;
            case 10 -> 36;
            case 11 -> 7;
            case 12 -> 38;
            case 13 -> 57;
            case 14 -> 58;
            case 15 -> 35;
            case 16 -> 2;
            case 17 -> 45;
            case 18 -> 15;
            case 19 -> 26;
            case 20 -> 44;
            case 21 -> 9;
            case 22 -> 63;
            case 23 -> 18;
            case 24 -> 21;
            case 25 -> 20;
            case 26 -> 60;
            case 27 -> 3;
            case 28 -> 47;
            case 29 -> 16;
            case 30 -> 59;
            case 31 -> 17;
            case 32 -> 56;
            case 33 -> 19;
            case 34 -> 11;
            case 35 -> 32;
            case 36 -> 43;
            case 37 -> 54;
            case 38 -> 1;
            case 39 -> 25;
            case 40 -> 50;
            case 41 -> 40;
            case 42 -> 62;
            case 43 -> 30;
            case 44 -> 29;
            case 45 -> 51;
            case 46 -> 14;
            case 47 -> 52;
            case 48 -> 46;
            case 49 -> 0;
            case 50 -> 23;
            case 51 -> 33;
            case 52 -> 8;
            case 53 -> 31;
            case 54 -> 13;
            case 55 -> 24;
            case 56 -> 61;
            case 57 -> 4;
            case 58 -> 5;
            case 59 -> 48;
            case 60 -> 55;
            case 61 -> 6;
            case 62 -> 28;
            default -> 37;
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
        eI.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eI.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = eI.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eI.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eI.g(clazz3, string2, clazz2)) != null) {
                    eI.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eI.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eI.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eI.n(674944778950798L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eI.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = s[n];
                int n3 = string2.indexOf(8);
                clazz3 = eI.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eI.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eI.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eI.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eI.n(674944778950798L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eI.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eI.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eI.n(674944778950798L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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
    private void lambda$onTick$4(Optional var1_1) {
        block9: {
            block8: {
                var2_2 = eI.k ^ 26101742010619L;
                var4_3 = eI.d("W", (long)-7750236598960698969L, (long)var2_2);
                try {
                    try {
                        if (var4_3 != null) break block8;
                        if (eI.d("B", (Object)var1_1, (long)-7746474930664763291L, (long)var2_2) != false) {
                        }
                        ** GOTO lbl19
                    }
                    catch (MatchException v0) {
                        throw eI.d("W", (Object)v0, (long)-7761681064522396080L, (long)var2_2);
                    }
                    this.f = (class_8685)eI.d("B", (Object)var1_1, (long)-7761510393480269652L, (long)var2_2);
                    eI.d("B", (Object)eI.d("\u00e4", (Object)eI.b, (long)-7747786252606145717L, (long)var2_2), (Object)eI.d("W", (String)eI.b("h", (int)10019, (long)(1500200224661528485L ^ var2_2)) + (String)eI.d("B", (Object)this.a, (long)-7749918253505282140L, (long)var2_2), (long)-7750027093470342400L, (long)var2_2), (boolean)false, (long)-7748519197532296041L, (long)var2_2);
                }
                catch (MatchException v1) {
                    throw eI.d("W", (Object)v1, (long)-7761681064522396080L, (long)var2_2);
                }
            }
            try {
                if (var4_3 == null) break block9;
lbl19:
                // 2 sources

                eI.d("B", (Object)eI.d("\u00e4", (Object)eI.b, (long)-7747786252606145717L, (long)var2_2), (Object)eI.d("W", (String)eI.b("h", (int)14079, (long)(5225047753508408941L ^ var2_2)) + (String)eI.d("B", (Object)this.a, (long)-7749918253505282140L, (long)var2_2), (long)-7750027093470342400L, (long)var2_2), (boolean)false, (long)-7748519197532296041L, (long)var2_2);
            }
            catch (MatchException v2) {
                throw eI.d("W", (Object)v2, (long)-7761681064522396080L, (long)var2_2);
            }
        }
    }

    private static class_2583 lambda$onLabel$1(class_2583 class_25832) {
        long l = k ^ 0x23B35AEDD701L;
        return eI.d("B", (Object)class_25832, (Object)eI.d("\u00c1", (long)-4358003577828376170L, (long)l), (long)-4358193198722572571L, (long)l);
    }

    private class_2583 lambda$onLabel$0(class_2583 class_25832) {
        long l = k ^ 0x62B486BE9573L;
        long l2 = l ^ 0x78B33228B08DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = eI.d("B", (String)((Object)eI.d("B", (Object)this.d, (long)-9080744071228462548L, (long)l)), (long)-9080144337084641649L, (long)l);
        return eI.d("B", (Object)class_25832, (int)eI.d("W", (Object)objectArray, (long)-9080449750550227281L, (long)l), (long)-9096692210940150169L, (long)l);
    }

    private static class_2583 lambda$onLabel$3(class_2583 class_25832) {
        long l = k ^ 0x1EB81DE0F9C4L;
        return eI.d("B", (Object)class_25832, (Object)eI.d("\u00c1", (long)-1347462875463853554L, (long)l), (long)-1350841682037357277L, (long)l);
    }

    private static class_2583 lambda$onLabel$2(class_2583 class_25832) {
        long l = k ^ 0x2F8EA85352B9L;
        return eI.d("B", (Object)class_25832, (Object)eI.d("\u00c1", (long)5058079569509151091L, (long)l), (long)5061458373936737886L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eI.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eI.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eI.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


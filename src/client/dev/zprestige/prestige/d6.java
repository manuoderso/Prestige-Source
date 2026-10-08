/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10255
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1511
 *  net.minecraft.class_1531
 *  net.minecraft.class_1533
 *  net.minecraft.class_1688
 *  net.minecraft.class_2604
 *  net.minecraft.class_2693
 *  net.minecraft.class_310
 *  net.minecraft.class_7743
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.i_0;
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
import net.minecraft.class_10255;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1511;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1688;
import net.minecraft.class_2604;
import net.minecraft.class_2693;
import net.minecraft.class_310;
import net.minecraft.class_7743;

public class d6
extends dV {
    private static final String a;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private dS g;
    private dO h;
    private dM i;
    private dM j;
    private dM k;
    private static final long l;
    private static final String[] m;
    private static final String[] n;
    private static final Map o;
    private static final Object[] p;
    private static final String[] q;

    public d6() {
        long l = d6.l ^ 0x2A32FC535CF0L;
        super((String)((Object)d6.b("r", (int)9188, (long)(0x42A99685E36B6071L ^ l))), (String)((Object)d6.b("r", (int)28964, (long)(0x63F2480EE8B232BCL ^ l))), i_0.Misc.ordinal());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                d6.l = hc.a(2929145187693367012L, -2230310186863123586L, MethodHandles.lookup().lookupClass()).a(146104434941408L);
                d6.p = new Object[93];
                d6.q = new String[93];
                d6.f();
                d6.o = new HashMap<K, V>(13);
                var0 = d6.l ^ 7506990670359L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[17];
                var7_4 = 0;
                var6_5 = "\u00d3qI\u009c\u0006\u009a\u0011\u00a2\u0093J\u00aanqK\u0081$X\u00c1\u00c6o\u00a0^\u00a3\u009eG\u0099\u0007\u00af=\u00fb\nI \u00f61\u0016\u00c0P\u00e1\u00b8\u00b1\u00be\u00a5W.H\u00b9\u0099\u009fH\u00bas\u00d3v\u00f2\u00ff':\u00ca\u0098\u00da\u00a3\u00a1\u0092\u00a3x\u0001\u0094@\u00f3\u00ff\u00f3\u0080\u0002\u00c57\u00fe\u00ba5\u000b\u00f4\u00cd\u00eap\u0090\u0013pEg`k\u001eW%#\u0019\u001a\u00e0\u0083k\u0001\u00c5\u0086\u0013y\u00820\u00cf\u00b6O\u001c\u00826qiSk\u00e4`r'\u008c'Sn5\u00b0\u001c \u0012*\u00adKKK\u00f0\u00a8\u00d8+\u009c6\u00c5\u00c0\u008f\u00d8\u00e4\u00e8\u00ccj\u0092\u00eb\u001c/c\u00c3\u00ca;\u0013\u00b5\u001dUo\u009a\u00a1\u00ed\fr\u00ab3\u00f2l\u0095Bls\u00e8\u0014\u0004bn@\u00dd\u00b1\u00e8\u0082\u00be '\u00a5~!\u00abEa \u00bf|\u0094p\rv\u008c\u00f6t\u009f\u00ad\u00f0k\u00dcNu\u0005\u00e4\u008e\u00fd\u00a9\u00c5\u00a7@\u0018g\u0011\u000f2^\u00e1j\u0000!<\u00ce{\u001b\u001b\u00df\u00e0v\u00aa\u00f9e\u00d4/\b\u00df\u0010]\u0015\u0003\u0011\u00f6\u0019\u008b\u00f3\u00e2)\u00f0f*\u00bd\u00c0\u0094\u0010\u00ef-t\u00f0\u00d1\u00c7\u001e\u0013@\u00c4.{d\u0000\u00f5+ N\u008d\u00e2\u0086\u00f1m\u0087\u00d0w\u009eCUi\u008d\u00b5\u00cd\u00f1r\"\u00dc\u00c6\u00c8h9\u0017\u0090u\u00ad\u0086\u009b\u0007m p\u00e7\u00b9d\u00b6\u00a6F\u0095\u00b7Lp\u00ebv~a\u0095\u00c5\u00a9\u00b8tN\u00b2\u0015\u008e\u0014\u00b5\u0089k\u00de\u0090!\u0093 \b\u00ca\u00059\u00bb\u0012N\u00c4n\r\u0004m\u00c3\u00ec+]\u00f4dDG\u00d1U\u00c9]R8\u0091?R\u00b4\u0015\u0003\u0018\u00ef$2#_\u0006 \u00a2\u00f6\u00b5\u0004\u00bdOaP\u008b\u00e9\u008b\u00b2\u00d2\u00c6\u009e\u00df\u0003 \u00c7C3\\\u001b\u00a5\u00bf\u00854]\u00d0v\u00f5\u00cf\u00car\u00be\u000bw\u001b\u00b5\u00b9&\u00baU\u00051[\u00e3\u008bH\u000b \u0094R\u008e\u009d\u0092q\u00dd\t\u00c1?\u00c0\u0084\u001e~X\u00cc{*\u00a9a\f\n\u00f7 \u000f\u00df7\u00e3\u00d8\u0085\u00f0\u00f3 \u00d7B\u00a2\u0094e\u00a0)m\u00d8#b\u009a%\u00a1\u00d3\u00c6V\u00edX\u001a\u00dd\u00e61\u00e9I9n\u001d\u001b\u001c\u00edC\u0010y3\u0013\u00e4OB\u001e\u00c7\u0090\u00ee\u00df'\u00b9\u00cc\u00fc<";
                var8_6 = "\u00d3qI\u009c\u0006\u009a\u0011\u00a2\u0093J\u00aanqK\u0081$X\u00c1\u00c6o\u00a0^\u00a3\u009eG\u0099\u0007\u00af=\u00fb\nI \u00f61\u0016\u00c0P\u00e1\u00b8\u00b1\u00be\u00a5W.H\u00b9\u0099\u009fH\u00bas\u00d3v\u00f2\u00ff':\u00ca\u0098\u00da\u00a3\u00a1\u0092\u00a3x\u0001\u0094@\u00f3\u00ff\u00f3\u0080\u0002\u00c57\u00fe\u00ba5\u000b\u00f4\u00cd\u00eap\u0090\u0013pEg`k\u001eW%#\u0019\u001a\u00e0\u0083k\u0001\u00c5\u0086\u0013y\u00820\u00cf\u00b6O\u001c\u00826qiSk\u00e4`r'\u008c'Sn5\u00b0\u001c \u0012*\u00adKKK\u00f0\u00a8\u00d8+\u009c6\u00c5\u00c0\u008f\u00d8\u00e4\u00e8\u00ccj\u0092\u00eb\u001c/c\u00c3\u00ca;\u0013\u00b5\u001dUo\u009a\u00a1\u00ed\fr\u00ab3\u00f2l\u0095Bls\u00e8\u0014\u0004bn@\u00dd\u00b1\u00e8\u0082\u00be '\u00a5~!\u00abEa \u00bf|\u0094p\rv\u008c\u00f6t\u009f\u00ad\u00f0k\u00dcNu\u0005\u00e4\u008e\u00fd\u00a9\u00c5\u00a7@\u0018g\u0011\u000f2^\u00e1j\u0000!<\u00ce{\u001b\u001b\u00df\u00e0v\u00aa\u00f9e\u00d4/\b\u00df\u0010]\u0015\u0003\u0011\u00f6\u0019\u008b\u00f3\u00e2)\u00f0f*\u00bd\u00c0\u0094\u0010\u00ef-t\u00f0\u00d1\u00c7\u001e\u0013@\u00c4.{d\u0000\u00f5+ N\u008d\u00e2\u0086\u00f1m\u0087\u00d0w\u009eCUi\u008d\u00b5\u00cd\u00f1r\"\u00dc\u00c6\u00c8h9\u0017\u0090u\u00ad\u0086\u009b\u0007m p\u00e7\u00b9d\u00b6\u00a6F\u0095\u00b7Lp\u00ebv~a\u0095\u00c5\u00a9\u00b8tN\u00b2\u0015\u008e\u0014\u00b5\u0089k\u00de\u0090!\u0093 \b\u00ca\u00059\u00bb\u0012N\u00c4n\r\u0004m\u00c3\u00ec+]\u00f4dDG\u00d1U\u00c9]R8\u0091?R\u00b4\u0015\u0003\u0018\u00ef$2#_\u0006 \u00a2\u00f6\u00b5\u0004\u00bdOaP\u008b\u00e9\u008b\u00b2\u00d2\u00c6\u009e\u00df\u0003 \u00c7C3\\\u001b\u00a5\u00bf\u00854]\u00d0v\u00f5\u00cf\u00car\u00be\u000bw\u001b\u00b5\u00b9&\u00baU\u00051[\u00e3\u008bH\u000b \u0094R\u008e\u009d\u0092q\u00dd\t\u00c1?\u00c0\u0084\u001e~X\u00cc{*\u00a9a\f\n\u00f7 \u000f\u00df7\u00e3\u00d8\u0085\u00f0\u00f3 \u00d7B\u00a2\u0094e\u00a0)m\u00d8#b\u009a%\u00a1\u00d3\u00c6V\u00edX\u001a\u00dd\u00e61\u00e9I9n\u001d\u001b\u001c\u00edC\u0010y3\u0013\u00e4OB\u001e\u00c7\u0090\u00ee\u00df'\u00b9\u00cc\u00fc<".length();
                var5_7 = 32;
                var4_8 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = d6.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ef\u0017\u00b3\u00ac\u00e1\u001f\u00ab,\u00d6\u00c4\u00e4\u00da\u007fn\u00ee\u00df<\u00cedF\u00c0Z\u00e0\u00f5 \u00a5Z\u0081\u00ea\u009b\u0097AAU\u00d4\u0016\u00c94\u00d8\u00bc\u0001\u009d\u00da\u00f3b\u009f\u001d\u0019\u00f2\u0019W\u009b\u00c9\u00d5\bOt";
                    var8_6 = "\u00ef\u0017\u00b3\u00ac\u00e1\u001f\u00ab,\u00d6\u00c4\u00e4\u00da\u007fn\u00ee\u00df<\u00cedF\u00c0Z\u00e0\u00f5 \u00a5Z\u0081\u00ea\u009b\u0097AAU\u00d4\u0016\u00c94\u00d8\u00bc\u0001\u009d\u00da\u00f3b\u009f\u001d\u0019\u00f2\u0019W\u009b\u00c9\u00d5\bOt".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = d6.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        d6.m = var9_3;
        d6.n = new String[17];
        d6.c = d6.b("r", (int)19608, (long)(8127459262493815285L ^ var0));
        d6.d = d6.b("r", (int)26181, (long)(2250207540709677877L ^ var0));
        d6.e = d6.b("r", (int)16058, (long)(1323787576685593545L ^ var0));
        d6.a = d6.b("r", (int)18876, (long)(5852454994371507403L ^ var0));
        d6.f = d6.b("r", (int)28312, (long)(4628879615267460066L ^ var0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean e(Object[] objectArray) {
        CallSite callSite;
        class_1299 class_12992;
        long l;
        block31: {
            CallSite callSite2;
            class_1299 class_12993;
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                class_12993 = (class_1299)objectArray[0];
                                l = (Long)objectArray[1];
                                l = d6.l ^ l;
                                callSite2 = d6.c("\u00e7", (long)-7395591227031440239L, (long)l);
                                try {
                                    try {
                                        class_12992 = class_12993;
                                        callSite = d6.c("\u00ea", (long)-7395389188808713815L, (long)l);
                                        if (callSite2 != null) break block26;
                                        if (class_12992 == callSite) return 1 != 0;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                                    }
                                    class_12992 = class_12993;
                                    callSite = d6.c("\u00ea", (long)-7395219875617834176L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block27;
                                    if (class_12992 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                                }
                                class_12992 = class_12993;
                                callSite = d6.c("\u00ea", (long)-7402412857784241647L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block28;
                                if (class_12992 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                            }
                            class_12992 = class_12993;
                            callSite = d6.c("\u00ea", (long)-7403810532381725963L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite2 != null) break block29;
                            if (class_12992 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                        }
                        class_12992 = class_12993;
                        callSite = d6.c("\u00ea", (long)-7403349325338722850L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block30;
                        if (class_12992 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                    }
                    class_12992 = class_12993;
                    callSite = d6.c("\u00ea", (long)-7403877048721507225L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                }
            }
            try {
                try {
                    if (callSite2 != null) break block31;
                    if (class_12992 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
                }
                class_12992 = class_12993;
                callSite = d6.c("\u00ea", (long)-7396076002683705488L, (long)l);
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
            }
        }
        try {
            if (class_12992 != callSite) return 0 != 0;
            return 1 != 0;
        }
        catch (MatchException matchException) {
            throw d6.c("\u00e7", (Object)matchException, (long)-7396526759088537848L, (long)l);
        }
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x742C;
        if (d6.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = m[n2].getBytes("ISO-8859-1");
            d6.n[n2] = d6.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d6.n[n2];
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
            throw new RuntimeException("dev/zprestige/prestige/d6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d6.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d6.m(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                d6.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d6.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d6.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d6.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d6.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = p;
        p[0] = "r\u001da5DId\u001ddoW^sVgi[Jb\u0011p~\u0010X^";
        objectArray[1] = "\u0018P'(\u0001]mp,'\u0010\u0012\u0010h? \u0019[x";
        objectArray[2] = "F\u0014Yk\baP\u0014\\1\u001bvG__7\u0017bV\u0018H \\uq";
        objectArray[3] = "Ov\bgMd:V\u0003h\\+[X\bcXq/";
        objectArray[4] = Boolean.TYPE;
        d6.q[4] = "java/lang/Boolean";
        objectArray[5] = "c\u0015z\u0004\fgu\u0015\u007f^\u001fpb^|X\u0013ds\u0019kOXs1";
        objectArray[6] = "ki>T~6`f/\u001b\u001d;uk p(9dx<\\?4";
        objectArray[7] = "faNcCe\u0013AElR*rONgVp\u0006";
        objectArray[8] = "*\u0003\u0000Z`\u0006*\u0003\u0017\u0006l\t0H\u0017\u0018l\u001c79EF4V";
        objectArray[9] = "kE\f%Tn\u001ee\u0007*E!\u007fk\f!A{\u000b";
        objectArray[10] = "\u0010M\u0015+D>\u0010M\u0002wH1\n\u0006\u0002iH$\rwV1\u001f";
        objectArray[11] = Double.TYPE;
        d6.q[11] = "java/lang/Double";
        objectArray[12] = "iR<#NCb]-l)[fA+ \fJ";
        objectArray[13] = "Be;1\u001d;\\m!~z:Mv,$\\<";
        objectArray[14] = "\u001d}C}\u0004\u0011\u0016rR2e\u001f\u001dyVh";
        objectArray[15] = "Et't%UEt0()Z_?06)OXNbhq\u000b";
        objectArray[16] = "\u001d?[9*h\u001d?Le&g\u0007tL{&r\u0000\u0005\u001c&w";
        objectArray[17] = "7lBy|`7lU%po-'U;pz*V\u0000d)";
        objectArray[18] = "\u0004^!S|m\u0004^6\u000fpb\u001e\u00156\u0011pw\u0019daN&";
        objectArray[19] = Void.TYPE;
        d6.q[19] = "java/lang/Void";
        objectArray[20] = "`I\u000eX-\u0001kF\u001f\u0017A\u0002eD\u001dXm";
        objectArray[21] = "Z1L\u0014\u0014M/\u0011G\u001b\u0005\u0002N\u001fL\u0010\u0001X:";
        objectArray[22] = "D7b].KR7g\u0007=\\E|d\u00011HT;s\u0016z_k";
        objectArray[23] = "\u0000,\u0017^\u0007]\u000b#\u0006\u0011o]\u0005,\u0015";
        objectArray[24] = Float.TYPE;
        d6.q[24] = "java/lang/Float";
        objectArray[25] = "Ls<\u007f_\u0018Ls+#S\u0017V8+=S\u0002QIzg\u0002E";
        objectArray[26] = "b7sA\u0007Z\u0017\u0017xN\u0016\u0015v\u0019sE\u0012O\u0002";
        objectArray[27] = "7/\u0019'm1B\u000f\u0012(|~#\u0001\u0019#x$W";
        objectArray[28] = "6G2a\u0003\u007f G7;\u0010h7\f4=\u001c|&K#*Wm5";
        objectArray[29] = "&.aX\u007f\bS\u000ejWnG2\u0000a\\j\u001dF";
        objectArray[30] = "=x^;I\\=xIgES'3IyEF B\u0018 \u001d\u0003";
        objectArray[31] = "O\u0013!z\u0006e\u000bBr=a=\u001d\u0000.a\r\u000fJGu?QX@B-t\u0001b\u0001\u00171ka";
        objectArray[32] = ".u+i=!~|v3[?r}w4\fo*+-Xf4+!u(6=v{";
        objectArray[33] = "DO\u0002\rtE\u0014F_W\u0012[\u0018G^PE\bE\u0016\u0000\u0004\u0012\b\u001c\u0012\u000bZbX\u0015OQ";
        objectArray[34] = "o>P4,Wa \u00061\u0013\rb,\f2\u007f?6iUk\"h25Tdu\u0018b<\t>\u0013";
        objectArray[35] = "A_<^1pKZ(XMuJ\\)Q\u001a\"\u0014\u000bq=rtDM*\u00006%\u0017\n";
        objectArray[36] = "#\nreE:s\u0003/?#$\u007f\u0002.8tw\"Rto#w{W{2S'r\n!";
        objectArray[37] = "\u0015\u001aF1L_\u0019M~<uW\\YC)\u0014E\u0001\u0012\u0017U\u0019O\u0004F\u0004k\u001aY\u0002Q~";
        objectArray[38] = "]w^\f1A\u0005-S]Q\u001cft\n\u0017l\r\u0007fW\\8q]|J\u00194H\b/_\u0005Q";
        objectArray[39] = "\u001f \u0014pO4O)I*)*C(H-~y\u001ey\u0015p)yG}\u001d'Y)N G";
        objectArray[40] = "\u0013<m|j\u000f\u00199yz\u0016\n\u0018?xsA]Fo!\u001f}\u0018\u001a*lg(\u0007C(";
        objectArray[41] = "~*p\u0017\u001e3.#-Mx-\"\",J/~\u007fsr\u001fx~&wy@\b./*#";
        objectArray[42] = "K\u001c0M\u00049\u0018\u0003e\u0017>4\u0013\u0000G\u0018N(z@j\u000eB1C\u00159\u001b^T";
        objectArray[43] = "zK\r\u0007\u00134*BP]u*&CQZ\"y{\u0012\f\u0006uy\"\u0016\u0004P\u0005)+K^";
        objectArray[44] = "/Wg!\"\t\u007f^:{D\u0017s_;|\u0013G*\u000ed\u0010y\u001c*\u00039`)\u0015wY";
        objectArray[45] = "P!|}vB\u0000(!'\u0010\\\f)  G\u000fQx}v\u0010\u000f\b|u*`_\u0001!/";
        objectArray[46] = "tXcI\u0017\t$Q>\u0013q\u0017(P?\u0014&Du\u0000eBqD,\u0005j\u001e\u0001\u0014%X0";
        objectArray[47] = "\u0018$\u0005\u001by&H-XA\u001f8D,YFHk\u0019}\u0007\u0011\u001fk@y\fLo;I$V";
        objectArray[48] = "M\\nWS2\u001dU3\r5,\u0011T2\nb\u007fL\u0005nW5\u007f\u0015\u0001g\u0000E/\u001c\\=";
        objectArray[49] = "C=:19\u0001\u00134gk_\u001f\u001f5fl\bOGa:\u0000b\u0014Fidp2\u001d\u001b3";
        objectArray[50] = "D66$^\u0000\u0014?k~8\u001e\u0018>jyoJIo6,8M\u001ck?sH\u001d\u00156e";
        objectArray[51] = "]\t_TRu\r\u0000\u0002\u000e4k\u0001\u0001\u0003\tc8\\P]_48\u0005TV\u0003Dh\f\t\f";
        objectArray[52] = "\u001dY\u0001V9PMP\\\f_NAQ]\u000b\b\u001e\u0018\f\u0001gbE\u0018\r_\u00172LEW";
        objectArray[53] = "(%@EQgx,\u001d\u001f7yt-\u001c\u0018`),|Bt\nr-q\u001e\u0004Z{p+";
        objectArray[54] = "pUgf\u0003f~K1c<<}G;`P\u000e)\u0002b8\u0001Y \u00058u\\caP$j<";
        objectArray[55] = "8\u001a\b/bb-I\u0014>_d2D\u0002#6h\u000bJ\u000232\u000enH\u001d2:7;\u001b\b._";
        objectArray[56] = "\n>E\u0019+=\u001ct\\\u001eK \u000e8XA'\u0012Y\u007f\u0003\u001f{ESz[T+\u007f\u0012/GKK";
        objectArray[57] = "\u0005F4~)fUOi$OxYNh#\u0018+\u0004\u001f5qO+]\u001b=)?{TFg";
        objectArray[58] = "82f,\u001c-.x\u007f+|0<4{t\u0010\u0002jq',FU=3x~\u0006k>%~i|";
        objectArray[59] = "Iz\u0016:8:\u0019sK`^$\u0015rJg\twH#\u00172^w\u0011'\u001fm.'\u0018zE";
        objectArray[60] = "\u0010\u001c\u000e%j?@\u0015S\u007f\f!L\u0014Rx[r\u0011E\u000f)\frHA\u0007r|\"A\u001c]";
        objectArray[61] = ">u\u0003CE\rn|^\u0019#\u0013b}_\u001etC;-\u000br\u001e\u0018;!]\u0002N\u0011f{";
        objectArray[62] = "(D[\u0006\u0015\u0005>I\u001f\fo\u000fFGQ\u0011\u0002X\"\\\u001aFQf";
        objectArray[63] = "<]=\u001f\f0lT`Ej.`UaB=}=\u0004<\u0016j}d\u00004H\u001a-m]n";
        objectArray[64] = "|V\u0017lKRrHAit\bqDKj\u0018:%\u0001\u00122Hm,\u0006H\u007f\u0014WmST`t";
        objectArray[65] = "d0[l\tR4%\u001c/sV(6\u001b\u007f\u000fP.[PqB\u000fn6\u0003n\u0017UT";
        objectArray[66] = "9\u0019w?\u0010f/Sn8p{=\u001fjg\u001cIjX1:I\u001e`]ir\u0010$!\bump";
        objectArray[67] = "\u0016\u0002T\r\u0001R\u001aUl\u00038C\u0000J\u0001WW\u0000]Ml";
        objectArray[68] = "\u001dNHoZh\u0017K\\i&m\u0016M]`q:I\u0010\u0006\fM<\bE]4H|\u000f\u001a";
        objectArray[69] = "\u0012x(#\u007f>\u0018}<%\u00030\u0015j9'o\u0002A+a\u007f\u0003>\u0004u!0{k\u001b,#@o.\u001b{#~l8\u001dlY";
        objectArray[70] = "l\u001eWR\bN<\u0017\n\bnP0\u0016\u000b\u000f9\u0003mGV_n\u00034C^\u0005\u001eS=\u001e\u0004";
        objectArray[71] = "TRV\u0007\u0019NZL\u0000\u0002&\u0014Y@\n\u0001J&\r\u0005SY\u0018q\u0004\u0002\t\u0014FKEW\u0015\u000b&";
        objectArray[72] = "\u000eS\u0004$\u001erV\t\tu~.5PP?C>TB\rt\u0017B\u000eX\u00101\u001b{[\u000b\u0005-~";
        objectArray[73] = "pxB*l*f2[-\f7t~_r`\u0005#9\u0004,3R)<\\glhhi@x\f";
        objectArray[74] = "/\"\u0007\u001e0<\u007f+ZDV\"s*[C\u0001q.{\u0007\u0010Vqw\u007f\u000eI&!~\"T";
        objectArray[75] = "'\bDc*\u000et\u0017\u00119\u0010\u0005{\u001f\t[yRq\u0002K?b\u0019&Qu";
        objectArray[76] = "1;XW\b1a2\u0005\rn/m3\u0004\n9\u007f4o^fS$4o\u0006\u0016\u0003-i5";
        objectArray[77] = ">\u0016GJ*/hLCLN7\u0007\u0016\u0007[s\"f\u0004Z\u0010'^<\u001eGU+giMRIN";
        objectArray[78] = "\u0000q\f:t\u001bPxQ`\u0012\u0005\\yPgEU\u0004.\n\u000b/\u000e\u0005%R{\u007f\u0007X\u007f";
        objectArray[79] = "r\f\u001b\u001d6c\"\u0005FGP}.\u0004G@\u0007.sU\u001a\u0013P.*Q\u0012J ~#\fH";
        objectArray[80] = "\u0013m9$H\u000eW<jc/VA~6?Cd\u00169mb\u00163\u001c<5*O\t]i)5/";
        objectArray[81] = "\u001f$K8[4O-\u0016b=*C,\u0017ejz\u001bzJ\t\u0000!\u001ap\u0015yP(G*";
        objectArray[82] = "h{#JV\u0019k3~V.\u001c\u000b )]\u0013\tj2t\u0016Guo-b\u0011W\u001a7{,T.";
        objectArray[83] = "|*\u0019u\u001cn,#D/zp \"E(-#}s\u0019tz#$w\u0010\"\ns-*J";
        objectArray[84] = ">q#A[\u001af+.\u0010;C\u0005rwZ\u0006Vd`*\u0011R*>z7T^\u0013k)\"H;";
        objectArray[85] = ":R6\u00164\u0015j[kLR\u000bfZjK\u0005X;\u000b6\u0019RXb\u000f?A\"\bkRe";
        objectArray[86] = "nQ*7qxf\br!\u0000ke\u000b$4^le\u0011 Hoc|\u001e#)ao0\rM";
        objectArray[87] = "\u0017B\u00140wJ\u0012\u0002\u0013o\u0013\u0017\u0011\u0001\u000b2\u007f%EMRl)rL\u0016Q/i\u0017\u001c\u0003\u0016l\u0013";
        objectArray[88] = "laY\\\fy(0\n\u001bk!>rVG\u0007\u0013i5\r\u0019TDc0UR\u000b~\"eIMk";
        objectArray[89] = "r$~\u001a\u0005z*~sKe$I'*\u0001X6(5wJ\fJr/j\u000f\u0000s'|\u007f\u0013e";
        objectArray[90] = "N\u0002Kh\u0001H\u001e\u000b\u00162gV\u0012\n\u001750\u0006KZHYZ]KV\u0015)\nT\u0016\f";
        objectArray[91] = ")0V\ro\u0006y9\u000bW\t\u0018u8\nP^K(iW\u0007\tKqm_Zy\u001bx0\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[92] = "\rz$#(\u0001U )rHX6&,3u\u0001Vg,q!1\n}2wxQK}p#H";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f(Object[] objectArray) {
        CallSite callSite;
        class_1299 class_12992;
        long l;
        block96: {
            CallSite callSite2;
            class_1299 class_12993;
            block95: {
                block94: {
                    block93: {
                        block92: {
                            block91: {
                                block90: {
                                    block89: {
                                        block88: {
                                            block87: {
                                                block86: {
                                                    block85: {
                                                        block84: {
                                                            block83: {
                                                                block82: {
                                                                    block81: {
                                                                        block80: {
                                                                            block79: {
                                                                                block78: {
                                                                                    class_12993 = (class_1299)objectArray[0];
                                                                                    l = (Long)objectArray[1];
                                                                                    l = d6.l ^ l;
                                                                                    callSite2 = d6.c("\u00e7", (long)-7039991459316452480L, (long)l);
                                                                                    try {
                                                                                        try {
                                                                                            class_12992 = class_12993;
                                                                                            callSite = d6.c("\u00ea", (long)-7038022261141415761L, (long)l);
                                                                                            if (callSite2 != null) break block78;
                                                                                            if (class_12992 == callSite) return 1 != 0;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                                        }
                                                                                        class_12992 = class_12993;
                                                                                        callSite = d6.c("\u00ea", (long)-7038474841131288070L, (long)l);
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite2 != null) break block79;
                                                                                        if (class_12992 == callSite) return 1 != 0;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                                    }
                                                                                    class_12992 = class_12993;
                                                                                    callSite = d6.c("\u00ea", (long)-7037885409169131219L, (long)l);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite2 != null) break block80;
                                                                                    if (class_12992 == callSite) return 1 != 0;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                                }
                                                                                class_12992 = class_12993;
                                                                                callSite = d6.c("\u00ea", (long)-7037064899048468962L, (long)l);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite2 != null) break block81;
                                                                                if (class_12992 == callSite) return 1 != 0;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                            }
                                                                            class_12992 = class_12993;
                                                                            callSite = d6.c("\u00ea", (long)-7041159137224483208L, (long)l);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (callSite2 != null) break block82;
                                                                            if (class_12992 == callSite) return 1 != 0;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                        }
                                                                        class_12992 = class_12993;
                                                                        callSite = d6.c("\u00ea", (long)-7040972596246271780L, (long)l);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite2 != null) break block83;
                                                                        if (class_12992 == callSite) return 1 != 0;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                    }
                                                                    class_12992 = class_12993;
                                                                    callSite = d6.c("\u00ea", (long)-7039828054066128767L, (long)l);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite2 != null) break block84;
                                                                    if (class_12992 == callSite) return 1 != 0;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                                }
                                                                class_12992 = class_12993;
                                                                callSite = d6.c("\u00ea", (long)-7038878103415098247L, (long)l);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (callSite2 != null) break block85;
                                                                if (class_12992 == callSite) return 1 != 0;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                            }
                                                            class_12992 = class_12993;
                                                            callSite = d6.c("\u00ea", (long)-7036976487260202404L, (long)l);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite2 != null) break block86;
                                                            if (class_12992 == callSite) return 1 != 0;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                        }
                                                        class_12992 = class_12993;
                                                        callSite = d6.c("\u00ea", (long)-7037666173598011095L, (long)l);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite2 != null) break block87;
                                                        if (class_12992 == callSite) return 1 != 0;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                    }
                                                    class_12992 = class_12993;
                                                    callSite = d6.c("\u00ea", (long)-7037443247007092129L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (callSite2 != null) break block88;
                                                    if (class_12992 == callSite) return 1 != 0;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                                }
                                                class_12992 = class_12993;
                                                callSite = d6.c("\u00ea", (long)-7038341416146260593L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite2 != null) break block89;
                                                if (class_12992 == callSite) return 1 != 0;
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                            }
                                            class_12992 = class_12993;
                                            callSite = d6.c("\u00ea", (long)-7039166753970049159L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                        }
                                    }
                                    try {
                                        try {
                                            if (callSite2 != null) break block90;
                                            if (class_12992 == callSite) return 1 != 0;
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                        }
                                        class_12992 = class_12993;
                                        callSite = d6.c("\u00ea", (long)-7037356379216851748L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        if (callSite2 != null) break block91;
                                        if (class_12992 == callSite) return 1 != 0;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                    }
                                    class_12992 = class_12993;
                                    callSite = d6.c("\u00ea", (long)-7040568742281440566L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block92;
                                    if (class_12992 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                                }
                                class_12992 = class_12993;
                                callSite = d6.c("\u00ea", (long)-7038281172357735147L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null) break block93;
                                if (class_12992 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                            }
                            class_12992 = class_12993;
                            callSite = d6.c("\u00ea", (long)-7039508217931060339L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite2 != null) break block94;
                            if (class_12992 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                        }
                        class_12992 = class_12993;
                        callSite = d6.c("\u00ea", (long)-7039117172794087976L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite2 != null) break block95;
                        if (class_12992 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                    }
                    class_12992 = class_12993;
                    callSite = d6.c("\u00ea", (long)-7036922440120366420L, (long)l);
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                }
            }
            try {
                try {
                    if (callSite2 != null) break block96;
                    if (class_12992 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
                }
                class_12992 = class_12993;
                callSite = d6.c("\u00ea", (long)-7037166803152139096L, (long)l);
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
            }
        }
        try {
            if (class_12992 != callSite) return 0 != 0;
            return 1 != 0;
        }
        catch (MatchException matchException) {
            throw d6.c("\u00e7", (Object)matchException, (long)-7040467627172939751L, (long)l);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d(Object[] objectArray) {
        Object object;
        block48: {
            CallSite callSite;
            long l;
            class_1299 class_12992;
            block46: {
                long l2;
                block47: {
                    long l3;
                    block43: {
                        block44: {
                            CallSite callSite2;
                            class_1299 class_12993;
                            block45: {
                                block41: {
                                    block42: {
                                        long l4;
                                        block39: {
                                            block40: {
                                                class_12992 = (class_1299)objectArray[0];
                                                l = (Long)objectArray[1];
                                                long l5 = l = d6.l ^ l;
                                                l4 = l5 ^ 0x3A8E9B9C3B2BL;
                                                l3 = l5 ^ 0x4369C6FF3C3AL;
                                                l2 = l5 ^ 0x22EBB5741CAL;
                                                callSite = d6.c("\u00e7", (long)-3949431379655990020L, (long)l);
                                                try {
                                                    try {
                                                        try {
                                                            Object[] objectArray2 = new Object[2];
                                                            objectArray2[1] = l2;
                                                            objectArray2[0] = d6.b("r", (int)12970, (long)(0x14850A6C46B28FA2L ^ l));
                                                            object = d6.c("R", (Object)this.g, (Object)objectArray2, (long)-3948688117682426242L, (long)l);
                                                            if (callSite != null) break block39;
                                                            if (object == false) break block40;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                                        }
                                                        if (class_12992 != d6.c("\u00ea", (long)-3948394984480953150L, (long)l)) break block40;
                                                        return true;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                                    }
                                                }
                                                catch (MatchException matchException) {
                                                    throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                                }
                                            }
                                            Object[] objectArray3 = new Object[2];
                                            objectArray3[1] = l2;
                                            objectArray3[0] = d6.b("r", (int)7039, (long)(0x254254D0C2EDA670L ^ l));
                                            object = d6.c("R", (Object)this.g, (Object)objectArray3, (long)-3948688117682426242L, (long)l);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite != null) break block41;
                                                        if (object == false) break block42;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                                    }
                                                    Object[] objectArray4 = new Object[2];
                                                    objectArray4[1] = l4;
                                                    objectArray4[0] = class_12992;
                                                    object = d6.c("R", (Object)this, (Object)objectArray4, (long)-3951432515950659905L, (long)l);
                                                    if (callSite != null) break block41;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                                }
                                                if (object == false) break block42;
                                                return true;
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                        }
                                    }
                                    Object[] objectArray5 = new Object[2];
                                    objectArray5[1] = l2;
                                    objectArray5[0] = d6.b("r", (int)17572, (long)(0xACD60396ED179A9L ^ l));
                                    object = d6.c("R", (Object)this.g, (Object)objectArray5, (long)-3948688117682426242L, (long)l);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block43;
                                                if (object == false) break block44;
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                            }
                                            class_12993 = class_12992;
                                            callSite2 = d6.c("\u00ea", (long)-3951001580154919135L, (long)l);
                                            if (callSite != null) break block45;
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                        }
                                        if (class_12993 == callSite2) return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                    }
                                    class_12993 = class_12992;
                                    callSite2 = d6.c("\u00ea", (long)-3950601334995967172L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                }
                            }
                            try {
                                if (class_12993 == callSite2) {
                                    return true;
                                }
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                            }
                        }
                        Object[] objectArray6 = new Object[2];
                        objectArray6[1] = l2;
                        objectArray6[0] = d6.b("r", (int)19785, (long)(0x16D76851C7A37043L ^ l));
                        object = d6.c("R", (Object)this.g, (Object)objectArray6, (long)-3948688117682426242L, (long)l);
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (callSite != null) break block46;
                                    if (object == false) break block47;
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                                }
                                Object[] objectArray7 = new Object[2];
                                objectArray7[1] = l3;
                                objectArray7[0] = class_12992;
                                object = d6.c("R", (Object)this, (Object)objectArray7, (long)-3947836603039338010L, (long)l);
                                if (callSite != null) break block46;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                            }
                            if (object == false) break block47;
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                        }
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                    }
                }
                Object[] objectArray8 = new Object[2];
                objectArray8[1] = l2;
                objectArray8[0] = d6.b("r", (int)4317, (long)(0x178535CD581FADDAL ^ l));
                object = d6.c("R", (Object)this.g, (Object)objectArray8, (long)-3948688117682426242L, (long)l);
            }
            try {
                try {
                    try {
                        if (callSite != null) return (boolean)object;
                        if (object == false) break block48;
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                    }
                    if (class_12992 != d6.c("\u00ea", (long)-3950662076559114704L, (long)l)) break block48;
                    return true;
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-3947655786624028827L, (long)l);
            }
        }
        object = 0;
        return (boolean)object;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == 'N' || c == '\u00ea' || c == '\u00ec') {
                field = d6.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d6.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'R' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d6.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block48: {
            block49: {
                CallSite callSite;
                long l;
                class_1297 class_12972;
                block46: {
                    long l2;
                    block47: {
                        block44: {
                            block45: {
                                block42: {
                                    block43: {
                                        block40: {
                                            block41: {
                                                class_12972 = (class_1297)objectArray[0];
                                                l = (Long)objectArray[1];
                                                l2 = (l = d6.l ^ l) ^ 0x1502DB811F2EL;
                                                callSite = d6.c("\u00e7", (long)-7506134737652237800L, (long)l);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                Object[] objectArray2 = new Object[2];
                                                                objectArray2[1] = l2;
                                                                objectArray2[0] = d6.b("r", (int)29475, (long)(0x391CFE7B148F10C7L ^ l));
                                                                object = d6.c("R", (Object)this.g, (Object)objectArray2, (long)-7505417830663327590L, (long)l);
                                                                if (callSite != null) break block40;
                                                                if (object == false) break block41;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                                            }
                                                            object = class_12972 instanceof class_1531;
                                                            if (callSite != null) break block40;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                                        }
                                                        if (object == false) break block41;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                                    }
                                                    return true;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                                }
                                            }
                                            Object[] objectArray3 = new Object[2];
                                            objectArray3[1] = l2;
                                            objectArray3[0] = d6.b("r", (int)4889, (long)(0x61905204FB4670F1L ^ l));
                                            object = d6.c("R", (Object)this.g, (Object)objectArray3, (long)-7505417830663327590L, (long)l);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite != null) break block42;
                                                        if (object == false) break block43;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                                    }
                                                    object = class_12972 instanceof class_1688;
                                                    if (callSite != null) break block42;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                                }
                                                if (object == false) break block43;
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                            }
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                        }
                                    }
                                    Object[] objectArray4 = new Object[2];
                                    objectArray4[1] = l2;
                                    objectArray4[0] = d6.b("r", (int)16311, (long)(0x65C0B7621E875C57L ^ l));
                                    object = d6.c("R", (Object)this.g, (Object)objectArray4, (long)-7505417830663327590L, (long)l);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block44;
                                                if (object == false) break block45;
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                            }
                                            object = class_12972 instanceof class_1533;
                                            if (callSite != null) break block44;
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                        }
                                        if (object == false) break block45;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                    }
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                }
                            }
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = l2;
                            objectArray5[0] = d6.b("r", (int)18873, (long)(0x5523983A94A8AA54L ^ l));
                            object = d6.c("R", (Object)this.g, (Object)objectArray5, (long)-7505417830663327590L, (long)l);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (callSite != null) break block46;
                                        if (object == false) break block47;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                    }
                                    object = class_12972 instanceof class_10255;
                                    if (callSite != null) break block46;
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                                }
                                if (object == false) break block47;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                        }
                    }
                    Object[] objectArray6 = new Object[2];
                    objectArray6[1] = l2;
                    objectArray6[0] = d6.b("r", (int)14867, (long)(0x11E1FE20B19E59F2L ^ l));
                    object = d6.c("R", (Object)this.g, (Object)objectArray6, (long)-7505417830663327590L, (long)l);
                }
                try {
                    try {
                        try {
                            try {
                                if (callSite != null) break block48;
                                if (object == false) break block49;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                            }
                            object = class_12972 instanceof class_1511;
                            if (callSite != null) break block48;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                        }
                        if (object == false) break block49;
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                    }
                    return true;
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7506642039995092607L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    @bP
    public void a(bG bG2) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        block28: {
            block29: {
                block27: {
                    class_310 class_3102;
                    block26: {
                        Object object;
                        block24: {
                            block25: {
                                l2 = d6.l ^ 0x50C77156B4E4L;
                                l = l2 ^ 0x6E40BEB12320L;
                                callSite2 = d6.c("\u00e7", (long)-2327561575739624834L, (long)l2);
                                try {
                                    try {
                                        try {
                                            try {
                                                object = d6.c("R", (Object)((Boolean)((Object)d6.c("R", (Object)this.k, (long)-2329047359897695089L, (long)l2))), (long)-2328395568620507342L, (long)l2);
                                                if (callSite2 != null) break block24;
                                                if (object == false) break block25;
                                            }
                                            catch (MatchException matchException) {
                                                throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                                            }
                                            object = d6.c("E", (Object)b, (long)-2330604058162789468L, (long)l2) instanceof class_7743;
                                            if (callSite2 != null) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                                        }
                                        if (object == false) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                                    }
                                    d6.c("R", (Object)b, null, (long)-2327443021482443340L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                                }
                            }
                            object = d6.c("R", (Object)((Boolean)((Object)d6.c("R", (Object)this.j, (long)-2329047359897695089L, (long)l2))), (long)-2328395568620507342L, (long)l2);
                        }
                        if (object == false) {
                            return;
                        }
                        try {
                            try {
                                class_3102 = b;
                                if (callSite2 != null) break block26;
                                if (d6.c("E", (Object)class_3102, (long)-2327508446046028921L, (long)l2) == null) break block27;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                            }
                            class_3102 = b;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                        }
                    }
                    try {
                        callSite = d6.c("E", (Object)class_3102, (long)-2329804796212725189L, (long)l2);
                        if (callSite2 != null) break block28;
                        if (callSite != null) break block29;
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                    }
                }
                return;
            }
            callSite = d6.c("R", (Object)this.h, (long)-2329047359897695089L, (long)l2);
        }
        CallSite callSite3 = d6.c("R", (Object)((Float)((Object)callSite)), (long)-2326189600727643249L, (long)l2);
        double d = (double)(callSite3 * callSite3);
        CallSite callSite4 = d6.c("R", (Object)d6.c("E", (Object)b, (long)-2329804796212725189L, (long)l2), (long)-2327221943077038375L, (long)l2);
        CallSite callSite5 = d6.c("R", (Object)d6.c("E", (Object)b, (long)-2329804796212725189L, (long)l2), (long)-2331243029402054747L, (long)l2);
        CallSite callSite6 = d6.c("R", (Object)d6.c("E", (Object)b, (long)-2329804796212725189L, (long)l2), (long)-2326662047717378872L, (long)l2);
        CallSite callSite7 = d6.c("R", (Object)d6.c("R", (Object)d6.c("E", (Object)b, (long)-2327508446046028921L, (long)l2), (long)-2326176344056596845L, (long)l2), (long)-2327687454970503960L, (long)l2);
        while (d6.c("R", (Object)callSite7, (long)-2330463331420833705L, (long)l2) != false) {
            block30: {
                class_1297 class_12972 = (class_1297)d6.c("R", (Object)callSite7, (long)-2328134942947721295L, (long)l2);
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l;
                    objectArray[0] = class_12972;
                    if (d6.c("R", (Object)this, (Object)objectArray, (long)-2326339697453322767L, (long)l2) == false) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                }
                reference var18_12 = d6.c("R", (Object)class_12972, (long)-2328257616355799969L, (long)l2) - callSite4;
                reference var20_13 = d6.c("R", (Object)class_12972, (long)-2329474271612197154L, (long)l2) - callSite5;
                reference var22_14 = d6.c("R", (Object)class_12972, (long)-2327600544572535011L, (long)l2) - callSite6;
                try {
                    try {
                        if (callSite2 != null) break block30;
                        if (var18_12 * var18_12 + var20_13 * var20_13 + var22_14 * var22_14 > d) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-2326951452148205081L, (long)l2);
                }
                d6.c("R", (Object)class_12972, (long)-2329323431145020858L, (long)l2);
            }
            if (callSite2 == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bg_0 bg_02) {
        long l;
        block29: {
            CallSite callSite;
            CallSite callSite2;
            long l2;
            block28: {
                Object object;
                block26: {
                    block27: {
                        l = d6.l ^ 0x318CA7C6F344L;
                        l2 = l ^ 0x182708F73A64L;
                        callSite2 = d6.c("\u00e7", (long)-7488722707003951650L, (long)l);
                        try {
                            try {
                                try {
                                    try {
                                        object = d6.c("R", (Object)((Boolean)((Object)d6.c("R", (Object)this.k, (long)-7490068303832102097L, (long)l))), (long)-7489624878680135534L, (long)l);
                                        if (callSite2 != null) break block26;
                                        if (object == false) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                                    }
                                    object = d6.c("R", (Object)bg_02, (Object)new Object[0], (long)-7487521953269546354L, (long)l) instanceof class_2693;
                                    if (callSite2 != null) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                                }
                                if (object == false) break block27;
                            }
                            catch (MatchException matchException) {
                                throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                            }
                            d6.c("R", (Object)bg_02, (Object)new Object[0], (long)-7490851165872237096L, (long)l);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                        }
                    }
                    object = d6.c("R", (Object)((Boolean)((Object)d6.c("R", (Object)this.i, (long)-7490068303832102097L, (long)l))), (long)-7489624878680135534L, (long)l);
                }
                if (object == false) {
                    return;
                }
                CallSite callSite3 = d6.c("R", (Object)bg_02, (Object)new Object[0], (long)-7487521953269546354L, (long)l);
                try {
                    try {
                        callSite = callSite3;
                        if (callSite2 != null) break block28;
                        if (!(callSite instanceof class_2604)) return;
                    }
                    catch (MatchException matchException) {
                        throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                    }
                    callSite = callSite3;
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                }
            }
            class_2604 class_26042 = (class_2604)callSite;
            try {
                if (callSite2 != null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
            }
            try {
                if (d6.c("E", (Object)b, (long)-7490964291648127589L, (long)l) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
            }
            try {
                Object[] objectArray = new Object[2];
                objectArray[1] = l2;
                objectArray[0] = d6.c("R", (Object)class_26042, (long)-7490924346452622338L, (long)l);
                if (d6.c("R", (Object)this, (Object)objectArray, (long)-7489361149115299339L, (long)l) == false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
            }
            reference var8_6 = d6.c("R", (Object)class_26042, (long)-7489522443184278409L, (long)l) - d6.c("R", (Object)d6.c("E", (Object)b, (long)-7490964291648127589L, (long)l), (long)-7488242964318760583L, (long)l);
            reference var10_8 = d6.c("R", (Object)class_26042, (long)-7488840403212675323L, (long)l) - d6.c("R", (Object)d6.c("E", (Object)b, (long)-7490964291648127589L, (long)l), (long)-7492402518309025787L, (long)l);
            reference var12_9 = d6.c("R", (Object)class_26042, (long)-7488482816829929592L, (long)l) - d6.c("R", (Object)d6.c("E", (Object)b, (long)-7490964291648127589L, (long)l), (long)-7487682457060478104L, (long)l);
            CallSite callSite4 = d6.c("R", (Object)((Float)((Object)d6.c("R", (Object)this.h, (long)-7490068303832102097L, (long)l))), (long)-7487278731023905745L, (long)l);
            try {
                try {
                    if (callSite2 != null) return;
                    if (!(var8_6 * var8_6 + var10_8 * var10_8 + var12_9 * var12_9 > (double)(callSite4 * callSite4))) break block29;
                    return;
                }
                catch (MatchException matchException) {
                    throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw d6.c("\u00e7", (Object)matchException, (long)-7487972494462140857L, (long)l);
            }
        }
        d6.c("R", (Object)bg_02, (Object)new Object[0], (long)-7490851165872237096L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (q[n3] != null) {
            return n3;
        }
        Object object = p[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 58;
            case 1 -> 5;
            case 2 -> 2;
            case 3 -> 50;
            case 4 -> 16;
            case 5 -> 20;
            case 6 -> 34;
            case 7 -> 49;
            case 8 -> 45;
            case 9 -> 51;
            case 10 -> 3;
            case 11 -> 44;
            case 12 -> 12;
            case 13 -> 26;
            case 14 -> 47;
            case 15 -> 27;
            case 16 -> 53;
            case 17 -> 23;
            case 18 -> 0;
            case 19 -> 62;
            case 20 -> 22;
            case 21 -> 11;
            case 22 -> 8;
            case 23 -> 4;
            case 24 -> 52;
            case 25 -> 33;
            case 26 -> 61;
            case 27 -> 35;
            case 28 -> 57;
            case 29 -> 30;
            case 30 -> 19;
            case 31 -> 9;
            case 32 -> 41;
            case 33 -> 32;
            case 34 -> 39;
            case 35 -> 36;
            case 36 -> 21;
            case 37 -> 42;
            case 38 -> 38;
            case 39 -> 48;
            case 40 -> 31;
            case 41 -> 7;
            case 42 -> 15;
            case 43 -> 13;
            case 44 -> 28;
            case 45 -> 25;
            case 46 -> 54;
            case 47 -> 63;
            case 48 -> 17;
            case 49 -> 60;
            case 50 -> 1;
            case 51 -> 14;
            case 52 -> 10;
            case 53 -> 37;
            case 54 -> 46;
            case 55 -> 18;
            case 56 -> 56;
            case 57 -> 43;
            case 58 -> 24;
            case 59 -> 6;
            case 60 -> 55;
            case 61 -> 59;
            case 62 -> 29;
            default -> 40;
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
        d6.q[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d6.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = d6.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d6.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d6.g(clazz3, string2, clazz2)) != null) {
                    d6.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d6.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d6.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d6.n(1042901170479510L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d6.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n];
                int n3 = string2.indexOf(8);
                clazz3 = d6.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d6.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d6.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d6.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d6.n(1042901170479510L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d6.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d6.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d6.n(1042901170479510L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(d6.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


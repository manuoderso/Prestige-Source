/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1959
 *  net.minecraft.class_2975
 *  net.minecraft.class_3124
 *  net.minecraft.class_5321
 *  net.minecraft.class_5539
 *  net.minecraft.class_5868
 *  net.minecraft.class_5875
 *  net.minecraft.class_6017
 *  net.minecraft.class_6122
 *  net.minecraft.class_6793
 *  net.minecraft.class_6795
 *  net.minecraft.class_6796
 *  net.minecraft.class_6797
 *  net.minecraft.class_6799
 *  net.minecraft.class_6880
 *  net.minecraft.class_6885
 *  net.minecraft.class_7225$class_7226
 *  net.minecraft.class_7510$class_6827
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.F;
import dev.zprestige.prestige.L;
import dev.zprestige.prestige.X;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1959;
import net.minecraft.class_2975;
import net.minecraft.class_3124;
import net.minecraft.class_5321;
import net.minecraft.class_5539;
import net.minecraft.class_5868;
import net.minecraft.class_5875;
import net.minecraft.class_6017;
import net.minecraft.class_6122;
import net.minecraft.class_6793;
import net.minecraft.class_6795;
import net.minecraft.class_6796;
import net.minecraft.class_6797;
import net.minecraft.class_6799;
import net.minecraft.class_6880;
import net.minecraft.class_6885;
import net.minecraft.class_7225;
import net.minecraft.class_7510;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c0 {
    public int a;
    public int b;
    public String c;
    public class_6017 d;
    public class_6122 e;
    public class_5868 f;
    public float g;
    public float h;
    public int i;
    public List j;
    public Color k;
    public boolean l;
    private static final long m;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final long[] q;
    private static final Integer[] r;
    private static final Map s;
    private static final Object[] t;
    private static final String[] u;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private c0(class_6796 class_67962, int n, int n2, String string, Color color, long l) {
        CallSite callSite;
        class_6797 class_67972;
        CallSite callSite2;
        block33: {
            CallSite callSite3;
            CallSite callSite4;
            block27: {
                long l2 = l = m ^ l;
                long l3 = l2 ^ 0x7B3D3B76DD6L;
                long l4 = l2 ^ 0x636A43CA3509L;
                long l5 = l2 ^ 0x2289CB5D9B75L;
                CallSite callSite5 = c0.c("\u00c1", (long)5646687254112333863L, (long)l);
                this.d = c0.c("\u00c1", (int)1, (long)5648665865721749436L, (long)l);
                this.g = 1.0f;
                this.j = c0.c("\u00c1", (long)5647349971783394819L, (long)l);
                callSite2 = callSite5;
                this.a = n;
                this.b = n2;
                this.c = string;
                this.k = color;
                CallSite callSite6 = c0.c("\u00cc", (Object)c0.c("\u00a3", (Object)c0.c("\u00c1", (long)5646918769354808772L, (long)l), (long)5647001869160238541L, (long)l), (long)5649451950847101870L, (long)l);
                CallSite callSite7 = c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)c0.c("\u00a3", (Object)c0.c("\u00c1", (long)5646918769354808772L, (long)l), (long)5647001869160238541L, (long)l), (long)5644678779080095781L, (long)l), (long)5646271501010809304L, (long)l);
                this.f = new class_5868(null, (class_5539)c0.c("\u00c1", (int)callSite6, (int)callSite7, (long)5646869758242783877L, (long)l));
                callSite4 = c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)class_67962, (long)5645714705017223826L, (long)l), (long)5647547008547944188L, (long)l);
                while (c0.c("\u00cc", (Object)callSite4, (long)5644446645477507943L, (long)l) != false) {
                    block30: {
                        boolean bl;
                        block31: {
                            block28: {
                                class_67972 = (class_6797)c0.c("\u00cc", (Object)callSite4, (long)5646064835567779560L, (long)l);
                                try {
                                    block29: {
                                        try {
                                            try {
                                                try {
                                                    callSite3 = class_67972;
                                                    if (callSite2 != null) break block27;
                                                    bl = callSite3 instanceof class_6793;
                                                    if (callSite2 != null) break block28;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                                                }
                                                if (!bl) break block29;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l4;
                                            this.d = c0.c("\u00cc", (Object)new F((class_6793)class_67972), (Object)objectArray, (long)5649737615158026883L, (long)l);
                                            if (callSite2 == null) break block30;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                                        }
                                    }
                                    bl = class_67972 instanceof class_6795;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                                }
                            }
                            try {
                                block32: {
                                    try {
                                        try {
                                            if (callSite2 != null) break block31;
                                            if (!bl) break block32;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l5;
                                        this.e = c0.c("\u00cc", (Object)new L((class_6795)class_67972), (Object)objectArray, (long)5646326814313098982L, (long)l);
                                        if (callSite2 == null) break block30;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                                    }
                                }
                                bl = class_67972 instanceof class_6799;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                            }
                        }
                        try {
                            if (bl) {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l3;
                                this.g = (float)c0.c("\u00cc", (Object)new X((class_6799)class_67972), (Object)objectArray, (long)5646225111677233741L, (long)l);
                            }
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                        }
                    }
                    if (callSite2 == null) continue;
                }
                callSite3 = c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)class_67962, (long)5647251387232440343L, (long)l), (long)5649570180791843021L, (long)l);
            }
            callSite4 = c0.c("\u00cc", (Object)((class_2975)callSite3), (long)5641706644010768106L, (long)l);
            try {
                try {
                    callSite = callSite4;
                    if (callSite2 != null) break block33;
                    if (!(callSite instanceof class_3124)) throw new IllegalStateException((String)((Object)c0.a("f", (int)2652, (long)(0x2C2BA73F7290ADEFL ^ l))) + (String)((Object)c0.c("\u00c1", (Object)class_67962, (long)5643836202808394515L, (long)l)) + (String)((Object)c0.a("f", (int)13080, (long)(0x34BC77BEF43314A4L ^ l))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
                }
                callSite = callSite4;
            }
            catch (IllegalStateException illegalStateException) {
                throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
            }
        }
        class_67972 = (class_3124)callSite;
        try {
            this.h = (float)c0.c("\u00a3", (Object)class_67972, (long)5649127414774283196L, (long)l);
            this.i = (int)c0.c("\u00a3", (Object)class_67972, (long)5648836643752537270L, (long)l);
            this.j = c0.c("\u00c1", (Object)c0.c("\u00a3", (Object)class_67972, (long)5643398181482295799L, (long)l), (long)5646448506165642900L, (long)l);
            if (callSite2 != null) {
                throw new IllegalStateException((String)((Object)c0.a("f", (int)2652, (long)(0x2C2BA73F7290ADEFL ^ l))) + (String)((Object)c0.c("\u00c1", (Object)class_67962, (long)5643836202808394515L, (long)l)) + (String)((Object)c0.a("f", (int)13080, (long)(0x34BC77BEF43314A4L ^ l))));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
        }
        try {
            if (!(c0.c("\u00cc", (Object)((class_2975)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)class_67962, (long)5647251387232440343L, (long)l), (long)5649570180791843021L, (long)l)), (long)5649503640829842269L, (long)l) instanceof class_5875)) return;
            this.l = 1;
            return;
        }
        catch (IllegalStateException illegalStateException) {
            throw c0.c("\u00c1", (Object)illegalStateException, (long)5641840862890214288L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        c0.m = hc.a(450278425342387728L, 7154122919574666601L, MethodHandles.lookup().lookupClass()).a(184249385796762L);
                        c0.t = new Object[148];
                        c0.u = new String[148];
                        c0.a();
                        c0.p = new HashMap<K, V>(13);
                        var11 = c0.m ^ 72715148102292L;
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
                        var20_3 = new String[23];
                        var18_4 = 0;
                        var17_5 = "\u00db\u00e0S\u00d1\u00e9\u00d2\u0002Q\u0098[%1y\u00aa\u007f\u00bau\u00aa#H\u00c2Jx\u00a1\u00aeqS\u00ac{S*v?8\u009b\u00d6\u0097\u00a7\u00a6O\u008f\u00c0\u008d\u009e\u00b8{\u001d(qs1\u00aeBz\u00d0\r\u0010\u0006\u0090\u007fT%\u0093\u0099\\P\u00e8\u00d8\u00a88\u007fH\u00ea\u0010x/>\u00c6\u00ce\u00c5E\u00cd \u00a96\u00b0\u0094\u00a7\u00e2A\u0010\u00c2\u0013dx\u00eaN3\u008fN,hK\u0005'\u000b\u008a\u0018\u00b8\u00ed\u00ae\u0000\u00af\"k\u00e7\u00df\u00bf\u00f4\u00e6\u00be\u00dc\u00a4e\u0015m\u0098\u0088k\u00f4\u0086\u00fb\u0010\u00e2s\u0016\u00cd\u0090\u0006Z\u0015\u00fd\u00b1w\u00bd\u00d1~D@\u0010\u00c5\u0010\u00b7\u0013\u0096\u00dcn\u00d8\u001b\u00eb\u00c5\u008aK\u00a7\u00dah\u0010(M\u0096\u0082\u0090[\u0099j\u00c0]8\u0082\u0015\u00125\u00a4\u0010\u0097\r7\u00cf\u00b4\u00fa_\u00da\u00f0\u001b\u00c3\u000b\u00aaP=z\u0010\u000fu\u0097~`\u0000z\u00c2\u00e9\u0087\u00f3\u00cc\u00d1*A? \u00c5\u009f\n\u00a5\u00f9\u00e2I?j\u00d5\u00cd~\u0002\u00ba\u009d\u001c\"\u00dcb\u00af\u00df\u00f9\u000ed\u00df6\u00b3\u00ada\u00f0$2 \u0013\u0096B\u00a2\"2\u0084\u0089`\u00d0\u00aduiN\u00ca\u00faF\u00da_{\u00d9\u00a6\u001f\u009a6\u008aq\u009aYR\u00b6\u001b \b\u0091\u00f3C\u00e1\u00f9\u00cc\u0092\u00e7\u00196\u001b#Vf\u00bfc\u00b2\u007f\u00c0\b\u001f\u00eaD$\u00d0\u00d9\u00d8\u00d2\u00fc\u0098\u00bd\u0010\u00d5\u000b\u00a5\u0007#\fI\r\u00b1\u001d\u000b\u0083\u0011g\u00a0\u00a7\u0010q;\u00c3\u00b0\u0089\u00f9\u00b4b\u00dc\u00d6H\u00896\u0004\u00a3\u00ad .\u00ae\u00c21\u00f6\u0017\u0001y\u0085Jn\u00e8\u00b2\u00ce6\t\u00fa\u0084\u009cr\u0080\u0088\u00f6\u00e2\u00c0\u00a3\u00e1\u001ddv)s\u0010\u0018'\u008e\u0001oyuYg\u00ab%\u001e\u001eLY\u0018\u0018\u00aa\u00bc/\u0089\u00eex6\u0018\u0004\u00b4\u009c\u00d1\u0098\u0094\u0015(A\u0097\u00ac\u00dd\u00d2\u00a9&.\u0010\u00c6\u00c8\u0082\u00f5zK\u00a4\u0082M\u0083\u00dfL\u0000\u00e9\u00ac\u009f\u0010\u0000\u00c6\u0093\u00b8\u0087\u00d1\u00bb\u0099\u00ac3w,\u00cd\u001b\\\u00e6\u0010\u00ce\u00d4\u0010Y\u0097%8\u008c\u00f1t\u0085\u00b7\u00b6\u0086pR";
                        var19_6 = "\u00db\u00e0S\u00d1\u00e9\u00d2\u0002Q\u0098[%1y\u00aa\u007f\u00bau\u00aa#H\u00c2Jx\u00a1\u00aeqS\u00ac{S*v?8\u009b\u00d6\u0097\u00a7\u00a6O\u008f\u00c0\u008d\u009e\u00b8{\u001d(qs1\u00aeBz\u00d0\r\u0010\u0006\u0090\u007fT%\u0093\u0099\\P\u00e8\u00d8\u00a88\u007fH\u00ea\u0010x/>\u00c6\u00ce\u00c5E\u00cd \u00a96\u00b0\u0094\u00a7\u00e2A\u0010\u00c2\u0013dx\u00eaN3\u008fN,hK\u0005'\u000b\u008a\u0018\u00b8\u00ed\u00ae\u0000\u00af\"k\u00e7\u00df\u00bf\u00f4\u00e6\u00be\u00dc\u00a4e\u0015m\u0098\u0088k\u00f4\u0086\u00fb\u0010\u00e2s\u0016\u00cd\u0090\u0006Z\u0015\u00fd\u00b1w\u00bd\u00d1~D@\u0010\u00c5\u0010\u00b7\u0013\u0096\u00dcn\u00d8\u001b\u00eb\u00c5\u008aK\u00a7\u00dah\u0010(M\u0096\u0082\u0090[\u0099j\u00c0]8\u0082\u0015\u00125\u00a4\u0010\u0097\r7\u00cf\u00b4\u00fa_\u00da\u00f0\u001b\u00c3\u000b\u00aaP=z\u0010\u000fu\u0097~`\u0000z\u00c2\u00e9\u0087\u00f3\u00cc\u00d1*A? \u00c5\u009f\n\u00a5\u00f9\u00e2I?j\u00d5\u00cd~\u0002\u00ba\u009d\u001c\"\u00dcb\u00af\u00df\u00f9\u000ed\u00df6\u00b3\u00ada\u00f0$2 \u0013\u0096B\u00a2\"2\u0084\u0089`\u00d0\u00aduiN\u00ca\u00faF\u00da_{\u00d9\u00a6\u001f\u009a6\u008aq\u009aYR\u00b6\u001b \b\u0091\u00f3C\u00e1\u00f9\u00cc\u0092\u00e7\u00196\u001b#Vf\u00bfc\u00b2\u007f\u00c0\b\u001f\u00eaD$\u00d0\u00d9\u00d8\u00d2\u00fc\u0098\u00bd\u0010\u00d5\u000b\u00a5\u0007#\fI\r\u00b1\u001d\u000b\u0083\u0011g\u00a0\u00a7\u0010q;\u00c3\u00b0\u0089\u00f9\u00b4b\u00dc\u00d6H\u00896\u0004\u00a3\u00ad .\u00ae\u00c21\u00f6\u0017\u0001y\u0085Jn\u00e8\u00b2\u00ce6\t\u00fa\u0084\u009cr\u0080\u0088\u00f6\u00e2\u00c0\u00a3\u00e1\u001ddv)s\u0010\u0018'\u008e\u0001oyuYg\u00ab%\u001e\u001eLY\u0018\u0018\u00aa\u00bc/\u0089\u00eex6\u0018\u0004\u00b4\u009c\u00d1\u0098\u0094\u0015(A\u0097\u00ac\u00dd\u00d2\u00a9&.\u0010\u00c6\u00c8\u0082\u00f5zK\u00a4\u0082M\u0083\u00dfL\u0000\u00e9\u00ac\u009f\u0010\u0000\u00c6\u0093\u00b8\u0087\u00d1\u00bb\u0099\u00ac3w,\u00cd\u001b\\\u00e6\u0010\u00ce\u00d4\u0010Y\u0097%8\u008c\u00f1t\u0085\u00b7\u00b6\u0086pR".length();
                        var16_7 = 56;
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
                            var20_3[var18_4++] = c0.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c8BYu\u000b\u0080\u0006\u00c2\u0007\u008a\u008ep\u00e3w\u00ac[\u0018\u00eb\u00f0\u00e6b+ R3x\u00b6]<Jl\u00a3\u009b\u001byJ\u00aet]\u00cf\u00aa";
                            var19_6 = "\u00c8BYu\u000b\u0080\u0006\u00c2\u0007\u008a\u008ep\u00e3w\u00ac[\u0018\u00eb\u00f0\u00e6b+ R3x\u00b6]<Jl\u00a3\u009b\u001byJ\u00aet]\u00cf\u00aa".length();
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
                            var20_3[var18_4++] = c0.a(var21_9).intern();
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
                c0.n = var20_3;
                c0.o = new String[23];
                c0.s = new HashMap<K, V>(13);
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
                var6_12 = new long[14];
                var3_13 = 0;
                var4_14 = "K\u00cd\u0090.\u00d4u*\u00b2y\u0013\u008c\u00caM=\u00dc\u00d2Jy7\u00d4\u00c5\u00cd\u00a5Z\u00d9\u00a6?\u00c3o\u00d8\u0002x\u00ec\u00b9\u00a1N\u00d1]\u00defGJ{\u00e2g\u00dd\u00d5K\u0001dMO\u000e\u00d8\u00e9/9~\u00b1Q\b6\u00b8\u00b9/l\u0001\b\u00fb\u00b7\u0096\u00c4\u0004\u0018\u00bd9\u0001\u00b5j\u00c47\u00bf^\u0086\u00d0Y\u009d5*4\u0018\u00e1\u0090\u00e9\u000e\u00fb";
                var5_15 = "K\u00cd\u0090.\u00d4u*\u00b2y\u0013\u008c\u00caM=\u00dc\u00d2Jy7\u00d4\u00c5\u00cd\u00a5Z\u00d9\u00a6?\u00c3o\u00d8\u0002x\u00ec\u00b9\u00a1N\u00d1]\u00defGJ{\u00e2g\u00dd\u00d5K\u0001dMO\u000e\u00d8\u00e9/9~\u00b1Q\b6\u00b8\u00b9/l\u0001\b\u00fb\u00b7\u0096\u00c4\u0004\u0018\u00bd9\u0001\u00b5j\u00c47\u00bf^\u0086\u00d0Y\u009d5*4\u0018\u00e1\u0090\u00e9\u000e\u00fb".length();
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
                    var4_14 = "\u001bo\u000b\u0087\u00f2_NI\u00c9C(\n\u00d6Y]\u009b";
                    var5_15 = "\u001bo\u000b\u0087\u00f2_NI\u00c9C(\n\u00d6Y]\u009b".length();
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
        c0.q = var6_12;
        c0.r = new Integer[14];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = c0.a(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                c0.t[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x419C;
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
                throw new RuntimeException("dev/zprestige/prestige/c0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            c0.r[n2] = n3;
        }
        return r[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = c0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = c0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = c0.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = c0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c0.a(clazz3, string2, clazz2)) != null) {
                    c0.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c0.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c0.b(104267221545653L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = c0.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = u[n];
                int n3 = string2.indexOf(8);
                clazz3 = c0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        c0.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c0.b(104267221545653L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c0.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c0.b(104267221545653L, 0L);
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

    private static void a(Object[] objectArray) {
        Map map = (Map)objectArray[0];
        List list = (List)objectArray[1];
        class_7225.class_7226 class_72262 = (class_7225.class_7226)objectArray[2];
        class_5321 class_53212 = (class_5321)objectArray[3];
        int n = (Integer)objectArray[4];
        String string = (String)objectArray[5];
        Color color = (Color)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = (l = m ^ l) ^ 0x4C200361AD4L;
        class_6796 class_67962 = (class_6796)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)class_72262, (Object)class_53212, (long)3421315343292000786L, (long)l), (long)3419917086795487882L, (long)l);
        CallSite callSite = c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)((class_7510.class_6827)c0.c("\u00cc", (Object)list, (int)n, (long)3405929764632699691L, (long)l)), (long)3421954766059853052L, (long)l), (Object)class_67962, (long)3420696297850103834L, (long)l);
        c0 c02 = new c0(class_67962, n, (int)callSite, string, color, l2);
        c0.c("\u00cc", (Object)map, (Object)class_67962, (Object)c02, (long)3418240019607117237L, (long)l);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static Map a(Object[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 6[SWITCH]
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == '\u00e2' || c == '\u00df' || c == '\u00fe') {
                field = c0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = c0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (u[n3] != null) {
            return n3;
        }
        Object object = t[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 50;
            case 1 -> 40;
            case 2 -> 26;
            case 3 -> 37;
            case 4 -> 46;
            case 5 -> 13;
            case 6 -> 61;
            case 7 -> 20;
            case 8 -> 52;
            case 9 -> 55;
            case 10 -> 11;
            case 11 -> 57;
            case 12 -> 47;
            case 13 -> 59;
            case 14 -> 21;
            case 15 -> 6;
            case 16 -> 54;
            case 17 -> 43;
            case 18 -> 31;
            case 19 -> 23;
            case 20 -> 4;
            case 21 -> 38;
            case 22 -> 19;
            case 23 -> 39;
            case 24 -> 49;
            case 25 -> 28;
            case 26 -> 27;
            case 27 -> 17;
            case 28 -> 12;
            case 29 -> 14;
            case 30 -> 35;
            case 31 -> 42;
            case 32 -> 16;
            case 33 -> 41;
            case 34 -> 9;
            case 35 -> 60;
            case 36 -> 63;
            case 37 -> 1;
            case 38 -> 2;
            case 39 -> 22;
            case 40 -> 3;
            case 41 -> 62;
            case 42 -> 32;
            case 43 -> 8;
            case 44 -> 36;
            case 45 -> 44;
            case 46 -> 5;
            case 47 -> 45;
            case 48 -> 30;
            case 49 -> 53;
            case 50 -> 34;
            case 51 -> 56;
            case 52 -> 33;
            case 53 -> 18;
            case 54 -> 58;
            case 55 -> 24;
            case 56 -> 51;
            case 57 -> 15;
            case 58 -> 48;
            case 59 -> 0;
            case 60 -> 29;
            case 61 -> 10;
            case 62 -> 25;
            default -> 7;
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
        c0.u[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c0.a(n, l);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x69F8;
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
                throw new RuntimeException("dev/zprestige/prestige/c0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c0.n[n2].getBytes("ISO-8859-1");
            c0.o[n2] = c0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = t;
        t[0] = "AQr\u0002;|_YhMZkAUg\u0017f";
        objectArray[1] = "YCXF\u0010bRLI\tqlYGMS";
        objectArray[2] = "@D\u0014)\u0002C^L\u000ef_BX@\u0003%\u0002e^W\u0007)A";
        objectArray[3] = " NLoBs>FV \ns$LNg\u0003hdlU`\u001fs'JH";
        objectArray[4] = Void.TYPE;
        c0.u[4] = "java/lang/Void";
        objectArray[5] = "SBrPTYMJh\u001f7MI";
        objectArray[6] = "6k\u0015\u000b6F(c\u000fDTZ/~";
        objectArray[7] = "\u0018\u0013<\"Zr\u0018\u0013+~V}\u0002X+`Vh\u0005)}8\u000f.";
        objectArray[8] = "ac\u0019\u0015%$ac\u000eI)+{(\u000eW)>|Y\\\u0002}t";
        objectArray[9] = ",5<V3P2=&\u0019{P(7>^rKh\u0012?Y~Q/;$";
        objectArray[10] = "EO\u001b\u0014P\rEO\fH\\\u0002_\u0004\fV\\\u0017XuY\u0002\u0005T";
        objectArray[11] = "\u0006QX\u0006a\u0013\u0018YBI\u0000\u0016\u0018YA\t.\n";
        objectArray[12] = "y!B82[g)Xwz[}#@0s@=\u0010F<xGp!@<";
        objectArray[13] = "\u0007\u000f}ZR$\u0011\u000fx\u0000A3\u0006D{\u0006M'\u0017\u0003l\u0011\u00065+";
        objectArray[14] = "\u0011\u0007\u0019SVxd'\u0012\\G7\u0019?\u0001[N~q";
        objectArray[15] = ";a(a\u00199;a?=\u00156!*?#\u0015#&[izGi";
        objectArray[16] = Integer.TYPE;
        c0.u[16] = "java/lang/Integer";
        objectArray[17] = "\n\u0019?V\u001fh\n\u0019(\n\u0013g\u0010R(\u0014\u0013r\u0017#xIB";
        objectArray[18] = "\u001cv\u007fmfU\u001cvh1jZ\u0006=h/jO\u0001L=p3";
        objectArray[19] = "\u001cv`1\u0007\u0017\u001cvwm\u000b\u0018\u0006=ws\u000b\r\u0001L\"(SH";
        objectArray[20] = ":\"H\u0006`~:\"_Zlq i_Dld'\u0018\u000e\u0011:\"";
        objectArray[21] = ",U+-\u0004C,U<q\bL6\u001e<o\bY1ol3Z\u001d";
        objectArray[22] = "\u00108`qTz\u00068e+Gm\u0011sf-Ky\u00004q:\u0000iD";
        objectArray[23] = "@0yXd\u001aK?h\u0017\u0003\u001aF4hX&%^0{\\\u000f\u000eI4\u007fM#\u0019D";
        objectArray[24] = "@m\u001bRUp^e\u0001\u001d2qO~\fG\u0014w";
        objectArray[25] = Boolean.TYPE;
        c0.u[25] = "java/lang/Boolean";
        objectArray[26] = "\u0014C]l\rz\u0014CJ0\u0001u\u000e\bJ.\u0001`\ty\u001bzW'";
        objectArray[27] = "\n1\n\u0015\u001eU\u001c1\u000fO\rB\u000bz\fI\u0001V\u001a=\u001b^J}";
        objectArray[28] = "q3\u0013ZI8\u0004\u0013\u0018UXwe\u001d\u0013^\\-\u0011";
        objectArray[29] = "\u0007~^~\u001cS\u0011~[$\u000fD\u00065X\"\u0003P\u0017rO5Ho";
        objectArray[30] = "\u0016$$L4-c\u0004/C%b\u0002\n$H!8v";
        objectArray[31] = "}\u0016ikpn}\u0016~7|ag]~)|t`,+t/5";
        objectArray[32] = "XS`o4*XSw38%B\u0018w-80Ei\"qhu";
        objectArray[33] = "L\u0016_[c\u0003L\u0016H\u0007o\fV]H\u0019o\u0019Q,\u0018D<^";
        objectArray[34] = Float.TYPE;
        c0.u[34] = "java/lang/Float";
        objectArray[35] = "D\u007fU\u000f\u001dDD\u007fBS\u0011K^4BM\u0011^YE\u0012\u0011C\u001c";
        objectArray[36] = "g7\u0004`h\u0001q7\u0001:{\u0016f|\u0002<w\u0002w;\u0015+<7";
        objectArray[37] = "\u000e\u0017\u0014(Y\u0003{7\u001f'HL\u001a9\u0014,L\u0016n";
        objectArray[38] = "bN\u001b#*fbN\f\u007f&ix\u0005\fa&|\u007ftY=v8";
        objectArray[39] = "\u001fPwv\ft\u0014_f9ql\u0007Xop";
        objectArray[40] = "Kg\u0003{\\4Uo\u001941.Mj\u0010y\u0006(Nh";
        objectArray[41] = "\\K^Vp'BCD\u00198'XI\\^1<\u0018~G~0&p_FT*;YD";
        objectArray[42] = "\\]U/%g\\]Bs)hF\u0016Bm)}Ag\u00163z;\u0016[M`;}m\u000f\u00133~";
        objectArray[43] = "ib|iQhibk5]gs)k+]rtX=t\u000e0";
        objectArray[44] = "oK\u001b\u000e\u0013XoK\fR\u001fWu\u0000\fL\u001fBrqY\u0018F\u0001%M\u0003A\rB^\u0018W\u0018M";
        objectArray[45] = "/1\u000bZ[d/1\u001c\u0006Wk5z\u001c\u0018W~2\u000bHA\u0007=e7\u0013\u0015E~\u001ebGF\u0001";
        objectArray[46] = "\u0011\bdRge\u0011\bs\u000ekj\u000bCs\u0010k\u007f\f2&D;:";
        objectArray[47] = "\u0007\b8d|c\u0007\b/8pl\u001dC/&py\u001a2{x#?M\u000e +by6Zt}%";
        objectArray[48] = "\u0013\u000b\u001cp\u0000\"\u0013\u000b\u000b,\f-\t@\u000b2\f8\u000e1_oY~";
        objectArray[49] = "M\u0016b\u0019\u000f\u0018M\u0016uE\u0003\u0017W]u[\u0003\u0002P,!\u0000PB";
        objectArray[50] = "\u001cDE\"fC\u001cDR~jL\u0006\u000fR`jY\u0001~\u00005=\u001c";
        objectArray[51] = "St\u001bIB\tM|\u0001\u0006?\u0019M";
        objectArray[52] = "Gp*\u001cqVGp=@}Y];=^}LZJk\u0001*\f";
        objectArray[53] = "u\u0000n\u001b=vu\u0000yG1yoKyY1lh:(\u0002i+";
        objectArray[54] = "\u0015jdiF;\u0015js5J4\u000f!s+J!\bP'r\u001ab";
        objectArray[55] = "vr}gfHvrj;jGl9j%jRkH>q3\u0016";
        objectArray[56] = "C\u000025(|C\u0000%i$sYK%w$f^:q\"w!";
        objectArray[57] = "+Y\u0005\u0014\b8^y\u000e\u001b\u0019w?w\u0005\u0010\u001d-K";
        objectArray[58] = "S~J\\X\u0003S~]\u0000T\fI5]\u001eT\u0019ND\u000bA\u0004]";
        objectArray[59] = "\u0001o=g\u000fADsb7nD\u001er6f9\u0011A'n2nW\u0015fnx\u0013\u0010\rmh";
        objectArray[60] = "|xv\fP,efg\t6qn|x\u000fZC?>'V\f\u0014~jaTDi9rjR6h2fcT\u000eyie\"h";
        objectArray[61] = "'\u000f\u0015\u000eakw\u001c\u0015\u0001\u001dq,\u0017\u001c6&!pr\t\u0004e\u007f{\b\u0018Qw+K";
        objectArray[62] = "t\u0003I2z|8\u000f\u0002=Fii\u0019X3*[8X\u0005hx\fu\u0006Hn%fm\bV3F";
        objectArray[63] = "\f\u001b\u0019%\u0003C\u0019\u001c\u00055`@b\u0019\u0005;\t\u0017\u001b\u0018\u0013 \u0003)\f\u0006\u00106^P\r\u0010\u000b<`";
        objectArray[64] = "d\u00116sh\u007f Fs`W?%TK0o6:Ptm('8(r1&% \u0017/v7'X\u0011sx5?gL4i7G";
        objectArray[65] = ">/x\u001b\f\u0003zx=\b3Toj\u0005X\u000bJ`n:\u0005L[b\u0016<YBYz)a\u001eS[\u0002";
        objectArray[66] = "\u007f\u0011\rl\u0006k:\rR<gn`\f\u0006m0;?Y_>g}k\u0018^s\u001a:s\u0013X";
        objectArray[67] = "I j\u0006I\u0013\f<5V(\u0016V=a\u0007\u007fC\th9R(\u0005])9\u0019UBE\"?";
        objectArray[68] = "@\u001b\u0011t\u0015\u001bN\u0018\t5n\u0007IZ)d\u001e\u001b A\u000ek\u0007\u000bNM\u0006`_g";
        objectArray[69] = "`\u0015W8B\u0004%\t\bh#\u0001\u007f\b\\9tT ]\u0007m#\u0012t\u001c\u0004'^Ul\u0017\u0002";
        objectArray[70] = "\u000b\u0003-;N\u0002N\u001frk/\u0007\u0014\u001e&:xRKK\u007fh/\u0014\u001f\n~$RS\u0007\u0001x";
        objectArray[71] = "EI\u0002! $LH\u00174R\"CJ\u0019<>\u0010\u001e\u000bHdR&NN\u001c$b6N_\u000b[";
        objectArray[72] = "YIUi\u00147\u0010HSaw7EM\u000ft\u001b\u0005\u0012\u0001S/LRZPQkHkB\n^+w";
        objectArray[73] = "3w\u0010K!8lu[U%Xa(DR\ta2v\u001a*g`pw\u001bI1ct7Q*";
        objectArray[74] = "F8Lz<F\u0002oA{;$\u001alQ&:H(=\u0011|d\u001c\u007f=T\u007faN\u0000k\u0013 f$Ah\u0015{aJ\u0006|\u0016(]D\u001ecD*3H\u0016h\u001cFa]F=G97\u001a\u0019:-";
        objectArray[75] = "t}m\u000fV41a2_71k`f\u000e`d45=^7\"`t>\u0010Jex\u007f8";
        objectArray[76] = "7Y\u001f1_\u0016rE@a>\u0013(D\u00140iAt\u0017N`>\u0000#PL.CG;[J";
        objectArray[77] = ".W\u000e9i\u001fuT\u0012/ofr\u0000\u00134w\n@QQd)Y\u0017\u0012\u0017:t\u0000/\u000b\t+qf";
        objectArray[78] = "#t;[q\u001c+/oD/st.=X,$&vj\u0000}sg%)\u00002\u000e =\"\u0006";
        objectArray[79] = "TD\u0006\rz\u0001\u0002\u0003Y\n\u0010\u0005\u0014GRXu~QYRM}\u0013Q\r\u000fU\u0010";
        objectArray[80] = "\u0006<`\u001fS\u0010\u000eg4\u0000\r\u007fQff\u001c\u000e(\u0003>1EZ\u007fBmrD\u0010\u0002\u0005uyB";
        objectArray[81] = "a^o\u000f\u0015`$B0_te~Cd\u000e#0!\u0016<StvuW<\u0010\t1m\\:";
        objectArray[82] = "\u007fB:qM\u000e|L9.}\u001a/R8q\u0011(y\u0016i&F\u007f~Wa*\u0017\u0000(\u0010>-}";
        objectArray[83] = "\u0005V\u0014|3\u001a\u0007\u0007M\u007fHFWC\u0014#$t\u0006\u0007N\u007fp#\n\u0003\t&:EW^\u001bzH";
        objectArray[84] = "=\u00163\u000fE(=Bn\u0017(9c6?\bTE8\u000bgOB:nL8H(";
        objectArray[85] = "\u0000u@\u0017\u0005GZsK\u0010dF\u0007rDA3\u0012W'\u001e\u0016d\u0014\u001f&\u001cG\u001bBXy\u001b";
        objectArray[86] = "r<vl&>7 )<G;m!}m\u0010n2t'0G(f5%s:o~>#";
        objectArray[87] = "q/^r\\Guh\\l>VhvTY\u0005\u0001>\u0013\u00156O_w,Hq^]\u000f";
        objectArray[88] = "\u0014\u0002K%[<Q\u001e\u0014u:9\u000b\u001f@$mlTJ\u001bu:*\u0000\u000b\u0018:Gm\u0018\u0000\u001e";
        objectArray[89] = "?mE%]Rzq\u001au<W pN$k\u0002\u007f%\u0017p<D+d\u0016:A\u00033o\u0010";
        objectArray[90] = "Uu[!A\u0018\u0010i\u0004q \u001dJhP wH\u0015=\bv \u000eA|\b>]IYw\u000e";
        objectArray[91] = "\u0011\u001f;%>(ZVfd\u00003\u0002K!3G#k\u0016d/b5TK#>`M\u0011\u001f;%>(ZVfd\u0000";
        objectArray[92] = "z1lV\u001fH%3'H\u001b(-h0S\f\u007fy4a\u000e[(>c$\u000b\u0012Uy{/\r";
        objectArray[93] = "NU\u0005S\u001b.N\u0001XKv-\u0013X\u0014j\u001f;w\u000f\u0001\u0017K\u007f\u0019H\u0015\u0014\u0018CNU\u0005S\u001b.N\u0001XKv";
        objectArray[94] = "\u0004\u0010DSR\u0003A\f\u001b\u00033\u0006\u001b\rORdSDX\u0017\u000e3\u0015\u0010\u0019\u0017LNR\b\u0012\u0011";
        objectArray[95] = "\\M}\u001d\u0014f\u0017\u0004 \\*n_\u0000s\u0002Q\u0003\u001fEk\u0004R<B\u0002z\u0006*cG\u001fs\nDoO\u0014+f";
        objectArray[96] = "eQ!\u0015\u000e\\3\u0016~\u0012dH>Pin\n##T|\u0013\u000eO(B(Cd\u001f \u0011$C\u001bIgN#)";
        objectArray[97] = "3\u0004x]/\u0013v\u0018'\rN\u0016,\u0019s\\\u0019CsL(\u000fN\u0005'\r+B3B?\u0006-";
        objectArray[98] = "XM$es^ZV%\u0001kMCLt{|f]WS|uD:\b-psX\u0005Ujaq \u0003\tdci\u001f^Nua\u0011";
        objectArray[99] = "\u000eR\u0004s\u0006T\u0013I\u0010h}\u0000\rK\u001da4\u00124U\u0005\u0010DQ\u0004Q\u0001/\u0019\u0016\u0015Syz\u0014\u0007\r\f\u0013\u007f\u000fX\u00193";
        objectArray[100] = ">\u001eJ\t\u001f>5\u0017\t\u0003y:\u000f\u0011\b\u0002\u001ekk\t\f\u0005HP";
        objectArray[101] = ",wf\u0017\u000e>ik9Go;3jm\u00168nl?2Ko(8~5\b\u0012o u3";
        objectArray[102] = "t4t\n5ff6x\u001bUhsrr\u00169Z%?*Ji\rtg|\tjgq|#\u001dUgw`jN?bl?~q?7xur\u001a-5td\u0012";
        objectArray[103] = "e%!\u001c\u0004'ssxBe+c0$D\t\u00197qy\u001ae%g){B\f31p%#";
        objectArray[104] = "2Och\u0013\u001d$\u0019:6r\u001a8Kb;%Mg\u00169W\u0019\u000b\"\\t4\u0010\n7I";
        objectArray[105] = "\\*<\u001e3K\u00196cNRNC77\u001f\u0005\u001b\u001cblMR]H#o\u0001/\u001aP(i";
        objectArray[106] = "aGX3n\u0007yIFn\r\u0006wAP^4U)\u0018(54\u0010j\u001b\u0010qcUy$";
        objectArray[107] = "\nq>Rf\n\u001b*=\u0013ZW\u001b<8N6eJ~g\u0015e2\u000b*!\u0015(OL2*\u0013ZLJ2$K H\r0:)";
        objectArray[108] = "AWG(S;FU\u0000*9+JH@B\u0002{\u0011-\u0007|YxV\u0014\u0005-\u0000{-";
        objectArray[109] = "r5/\u0001.4$rp\u0006D, L*D}w$3|\u0003\"pN";
        objectArray[110] = "|8m$e**\u007f2#\u000f;';\u0019qd5@{ii592qkemUz<2ye?2:ky\u000f";
        objectArray[111] = "\u001c}V?&X\u001f~\u0005~^LO8U'2~\u0019|\u0004\u007ff)\u001f(W'nX\u001c&Tx^";
        objectArray[112] = "\u0015o\t(\u00111\u0000h\u00158r2{:_/\u0015b\u0014l\u001am\u001d\"{9\u00194\u00131\u0011q\u001fm\u0013[";
        objectArray[113] = "\u001d| :\u0014\u0018\u0005&/z+Z\u0013gs+N!Vys>FLV-.&+";
        objectArray[114] = "\u0015\f\\kZ)P\u0010\u0003;;,\n\u0011WjlyUD\f=;?\u0001\u0005\u000ftFx\u0019\u000e\t";
        objectArray[115] = "s\u0014cVm,s@>N\u0000$#\b\u000e\u0014iywL`S}z$p7Nm='\u001d7\u001a0%J";
        objectArray[116] = "$'|\u001et\u000e=$'\u000bM\t=,e6vZfIf\u00000\u0001!t{\u001b$\u001aZ";
        objectArray[117] = "?s\t\u0010E:i3\u0016\u0016JYh.\u001d\u0011K\u000e<rHH\u001fY{%\tIU$<=\u0002O";
        objectArray[118] = "\u0006~\u001bk\u0004 \u0001|\\in0\ra\u001c\u0001U`W\u0004X/Wg\u0000{\u000eh\b`j";
        objectArray[119] = "\u0013}&\u000e^\fVay^?\t\f`-\u000fh\\S5vY?\u001a\u0007tu\u0011B]\u001f\u007fs";
        objectArray[120] = "Z\u0006\ta^E\u0011OT `@IM\u000eQ\u0007LM6\u0004s\u000eX\u001f\\\u0001hQL ";
        objectArray[121] = "+A(4}mn]wd\u001ch4\\#5K=k\t{f\u001c{?H{+a<'C}";
        objectArray[122] = "\u001fAT\u001b\u001dj\u001f\u0015\t\u0003piGAE\n\n\u0007\u0016\\\b\u0002Ob\u001eO\u0000\u0007p>BHE\n\u001d>\u0016\u0015]g";
        objectArray[123] = "LTB|]\rBWZ=&\u0017A\u001e@\u0001\u001fI]\fD>B\u000eL\u000e<";
        objectArray[124] = "Tvn\u0004\u0007:\u0011j1Tf?Kke\u00051j\u0014><Tf,@\u007f=\u001b\u001bkXt;";
        objectArray[125] = "\u0002S\u0000-s<\u0010W\u0003$Ld`WU5+4\u000f\u0001\u0010w#t`\u0004\u0007&42\n\u0001\u001cy \r";
        objectArray[126] = "'\u00180P\u0000,7\u0018!G\u007fw!\u001d0bA!}x\"\\\u0011dy\u0012'GNpF";
        objectArray[127] = "\u0014s00Gn\u000b 0),dwtj-K4\u0018\"/oCtw)*7Qv\u0019q=mV\r";
        objectArray[128] = "G2\u0006?\tYM<\u0019*bRO,\u0017'\u000e`\u0019lFqR7H9\u00198]]M\"F,bR@!\b+\fXN>\u001d@";
        objectArray[129] = "0!P\u0002C#0u\r\u001a. n?p\u0017E.\t\u007f\u0000\u000f\u0014\"{u\u0002\u0003LN38[\u001fD${>\u0002\u001f.";
        objectArray[130] = ".Tx\u0015U\u000etRs\u00124\u000f)S|CcXs\u0001\"\u00144\u000b!P`\u0010^\u000e:\u000ft";
        objectArray[131] = "\\\u000fz8d%\u0019\u0013%h\u0005 C\u0012q9Ru\u001cG)k\u00053H\u0006)'xtP\r/";
        objectArray[132] = "(`|bC|m|#2\"y7}wcu,h(/4\"j<i/}_-$b)";
        objectArray[133] = "(8e\u0001In~;aA\u0003\rtmcY\u0014aF9%\u0001B=\u0011qg\u0003\tnt8f\u0005\u0001\r";
        objectArray[134] = "\u0006\u0016-\t2\u000f\\\u0010&\u000eS\u000e\u0001\u0011)_\u0004ZQDs\u000fS\u0006\u0005\u001d7V1\u0018\\\u001d+";
        objectArray[135] = "V\u0013\u0015R,6\u0013\u000fJ\u0002M3I\u000e\u001eS\u001af\u0016[E\u0006M B\u001aFM0gZ\u0011@";
        objectArray[136] = "~-\u001a\u0004\u00115!/Q\u001a\u0015U)tF\u0001\u0002\u0002}(\u0017\\RU:\u007fRY\u001c(}gY_";
        objectArray[137] = "vun6L\u0003 211&\u0015&`W3\u001e\r(thnY\u001c*\f7kD\u0015&b;cOMJ";
        objectArray[138] = "\u001e\u0019\b`\u0011\u0000[\u0005W0p\u0005\u0001\u0004\u0003a'P^Q[1p\u0016\n\u0010[\u007f\rQ\u0012\u001b]";
        objectArray[139] = "h\u001cWY+[a\u001dBLY]n\u001fLD5o8Z\u0012\u001bf8i\nB[fRl\u0011\u001dOY";
        objectArray[140] = "s?\u0012r[w#,\u0012}'mx'\u001bJ\u001c=%B\u0004r\u0019et/\u001ceZ8\u001f";
        objectArray[141] = "snv5,Jq?/6W\u0018+bnZlO}\u0007/5&\u001148rr7\u0013L";
        objectArray[142] = "R\" G\u001c)\u000f\u007f2\u001bn \u000fb]\u001cV>\u0000fbA\u0011/\u0002\u001e";
        objectArray[143] = "3N}^9\\&\u000e0LINKJ7\\.\u001e$\u001cr\u001e&^K\np\u0010v\u001a0NlNv'";
        objectArray[144] = "),\u0011[Xv\u007fkN\\2hi8R\u000eNnoUH]Ltn)F^T5\u0015";
        objectArray[145] = "q\u00107.nH'Wh)\u0004X \u0015\u000exmY5Vd}v\u0006!i7*uU5VjmdWM";
        objectArray[146] = "\u0019\u0002t\u001aQjF\u0000?\u0004U\nN[(\u001fB]\u001a\u0007yB\u0014\n]P<G\\w\u001aH7A";
        Object[] objectArray2 = objectArray;
        objectArray[147] = "b\"Ik \u0014'>\u0016;A\u0011}?Bj\u0016D\"j\u001b:A\u0002v+\u001at<En \u001c";
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static List lambda$getRegistry$0(class_6880 class_68802) {
        long l = m ^ 0x4CA1ACB37D6EL;
        return c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)((class_1959)c0.c("\u00cc", (Object)class_68802, (long)485614547469398039L, (long)l)), (long)469980504175405110L, (long)l), (long)471444028481714273L, (long)l);
    }

    private static void lambda$getRegistry$2(Map map, Map map2, class_6880 class_68802) {
        long l = m ^ 0x7E0787E89872L;
        c0.c("\u00cc", (Object)map, (Object)((class_5321)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)class_68802, (long)-2047301475427221456L, (long)l), (long)-2044119119512562483L, (long)l)), new ArrayList(), (long)-2048498609660227241L, (long)l);
        CallSite callSite = c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)((class_1959)c0.c("\u00cc", (Object)class_68802, (long)-2044337922962418421L, (long)l)), (long)-2046456802851156694L, (long)l), (long)-2047214240456352387L, (long)l), (long)-2048653936289236842L, (long)l), class_6885::method_40239, (long)-2047682113465408819L, (long)l), class_6880::comp_349, (long)-2045011407111243928L, (long)l);
        Map map3 = map2;
        c0.c("\u00c1", (Object)map3, (long)-2046070568031865796L, (long)l);
        c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)callSite, map3::containsKey, (long)-2045534482767466055L, (long)l), arg_0 -> c0.lambda$getRegistry$1(map, class_68802, map2, arg_0), (long)-2044045469433055147L, (long)l);
    }

    private static void lambda$getRegistry$1(Map map, class_6880 class_68802, Map map2, class_6796 class_67962) {
        long l = m ^ 0x3FCAEFCB295BL;
        c0.c("\u00cc", (Object)((List)((Object)c0.c("\u00cc", (Object)map, (Object)c0.c("\u00cc", (Object)c0.c("\u00cc", (Object)class_68802, (long)5962704243006943513L, (long)l), (long)5947167894763546084L, (long)l), (long)5961463065159481700L, (long)l))), (Object)((c0)((Object)c0.c("\u00cc", (Object)map2, (Object)class_67962, (long)5961463065159481700L, (long)l))), (long)5947364292364062635L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(c0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(c0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


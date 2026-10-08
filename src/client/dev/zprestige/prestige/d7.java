/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.b_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.x_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d7
extends dV
implements dF {
    private dR a;
    private dQ c;
    private dR d;
    private dM e;
    private dM f;
    private static final int g;
    private static final int h;
    private b_0 i;
    private class_2338 j;
    private class_2338 k;
    private int l;
    private int m;
    private int n;
    private f5 o;
    private f5 p;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;
    private static final long[] u;
    private static final Integer[] v;
    private static final Map w;
    private static final Object[] x;
    private static final String[] y;

    public d7() {
        long l;
        long l2 = l = q ^ 0xC867B7DBEECL;
        long l3 = l2 ^ 0x4A954AF82E49L;
        long l4 = l2 ^ 0x1FEEE31C457BL;
        this.i = b_0.IDLE;
        this.l = -1;
        this.o = new f5(l3);
        this.p = new f5(l3);
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$0;
        d7.d("\u00ec", (Object)this.e, (Object)objectArray, (long)-3029813575395475651L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        d7.q = hc.a(3832272607698336901L, 2026491034085969487L, MethodHandles.lookup().lookupClass()).a(3542578728088L);
                        d7.x = new Object[160];
                        d7.y = new String[160];
                        d7.f();
                        d7.t = new HashMap<K, V>(13);
                        var11 = d7.q ^ 37029237703595L;
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
                        var20_3 = new String[9];
                        var18_4 = 0;
                        var17_5 = "\u00be\u00f8\u00f7oJC\u00b6K\u00a1\\\u0098Y3\u00da\u00c4\u00ae\u0010}\u0092\u00d1\u00d7XTQ\u007f\u00de\u00c3\u008c\u00c6\u001b\u00f3\u00feL8\u009e\u001b\u0090u\u008d\n~\u0016\u00fe\u0017\u0005\u00e5\u00e4\u00dd!T-W,]\u000eP\u00e2\u00fc\u0001\u001b=6R\u00e8\u00c8d\u00f9\u008dz\u00b3\u00db\u00ec\u000f\u0004\u00e5\u00a3\u00af8\u0088\u00c9\u00f0}x\u00d21;\u00a2\u008aQa@\u009dI\u0003M)\u008cp\u0083\u00c0l!\u00e9\u008b\u0010\u00914\u00b5V\u00c4\u001aRw\u0005nN\u00e1\u00a56\u00e8\u00e6\u0088\u00f9[\u00ae\u00ef\u008b\u00ca_b\u00077|\u00856N\u00f1\u0087Ud\u0086)\u00d0\u001d\u00d1t\rkB\u000e[\u00a6\u00922|\u0010\u0089\u009b\u00054\u00ab\u001e\r;\u0019\u00cc\u00e2\u000b\u0005\u0018tr8\u00a0\u00c3\u00b3\u00a2\f%\u007fvFlq\u00a4\u00c0\u00af\u00bb\u00cd\u0083$X:k\u00a2\u00c0!{\u00db4\u0099\u00c9\u00af}\u0003M\u00fc2\u00d2\u00fd\u00a3\f\u0080$N\"\u0010\u008e\u00f6\bk\u00c2\u00e6\u0014\u0016\u0095b\u00ac\u001f@2\u0083\u00f1\u0016\u00f9`>B\u00e7\u00c8C\r\u00e1\u00b0\u0080\u00dc\u00c5\\K\u0096#\u009a\u00bc\u00dd\u00c1\u00e7e\u0098\u00ca\u0086\u00a1\u001a\n\u0090\u00aa\u0096\u000bb8\u00c9e\u001f\u0083\ra\u00d2\u009f\u00a7\u0089\u00e2\u00c9r\n\u00f9\u0082d\u00da\u00f7\u007f`\u00f8\u0086\u00fb\r";
                        var19_6 = "\u00be\u00f8\u00f7oJC\u00b6K\u00a1\\\u0098Y3\u00da\u00c4\u00ae\u0010}\u0092\u00d1\u00d7XTQ\u007f\u00de\u00c3\u008c\u00c6\u001b\u00f3\u00feL8\u009e\u001b\u0090u\u008d\n~\u0016\u00fe\u0017\u0005\u00e5\u00e4\u00dd!T-W,]\u000eP\u00e2\u00fc\u0001\u001b=6R\u00e8\u00c8d\u00f9\u008dz\u00b3\u00db\u00ec\u000f\u0004\u00e5\u00a3\u00af8\u0088\u00c9\u00f0}x\u00d21;\u00a2\u008aQa@\u009dI\u0003M)\u008cp\u0083\u00c0l!\u00e9\u008b\u0010\u00914\u00b5V\u00c4\u001aRw\u0005nN\u00e1\u00a56\u00e8\u00e6\u0088\u00f9[\u00ae\u00ef\u008b\u00ca_b\u00077|\u00856N\u00f1\u0087Ud\u0086)\u00d0\u001d\u00d1t\rkB\u000e[\u00a6\u00922|\u0010\u0089\u009b\u00054\u00ab\u001e\r;\u0019\u00cc\u00e2\u000b\u0005\u0018tr8\u00a0\u00c3\u00b3\u00a2\f%\u007fvFlq\u00a4\u00c0\u00af\u00bb\u00cd\u0083$X:k\u00a2\u00c0!{\u00db4\u0099\u00c9\u00af}\u0003M\u00fc2\u00d2\u00fd\u00a3\f\u0080$N\"\u0010\u008e\u00f6\bk\u00c2\u00e6\u0014\u0016\u0095b\u00ac\u001f@2\u0083\u00f1\u0016\u00f9`>B\u00e7\u00c8C\r\u00e1\u00b0\u0080\u00dc\u00c5\\K\u0096#\u009a\u00bc\u00dd\u00c1\u00e7e\u0098\u00ca\u0086\u00a1\u001a\n\u0090\u00aa\u0096\u000bb8\u00c9e\u001f\u0083\ra\u00d2\u009f\u00a7\u0089\u00e2\u00c9r\n\u00f9\u0082d\u00da\u00f7\u007f`\u00f8\u0086\u00fb\r".length();
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
                            var20_3[var18_4++] = d7.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "F\u00bdY\u00cbUv\nO)\u00b3\u00835~\u00ba\u00d1\u00108\u00ae\u00dbc\u008d\u0089n\"*7\u00a6T\"hK\u00ab\u00ac\u00d5\b\u00c2\u0015\u00d4\u00c6\u00db\u00b7\u00f8\u0099L\u00dc\u001e\u00ee\u00f2\u008c\u00a39\u00fex,c<\u00e2 \u008aI\u00bfG\u00c3\u0019\u0000z\u00989\u001a\u00dc\u00e8J\u00aa";
                            var19_6 = "F\u00bdY\u00cbUv\nO)\u00b3\u00835~\u00ba\u00d1\u00108\u00ae\u00dbc\u008d\u0089n\"*7\u00a6T\"hK\u00ab\u00ac\u00d5\b\u00c2\u0015\u00d4\u00c6\u00db\u00b7\u00f8\u0099L\u00dc\u001e\u00ee\u00f2\u008c\u00a39\u00fex,c<\u00e2 \u008aI\u00bfG\u00c3\u0019\u0000z\u00989\u001a\u00dc\u00e8J\u00aa".length();
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
                            var20_3[var18_4++] = d7.b(var21_9).intern();
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
                d7.r = var20_3;
                d7.s = new String[9];
                d7.w = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "wT\u0000(\u00a6O\u000fD\rP\u00c1\u0018\f\u0018\u00e6\t\u0098\u008e<\u00f3\u00a6\u00d4,?";
                var5_15 = "wT\u0000(\u00a6O\u000fD\rP\u00c1\u0018\f\u0018\u00e6\t\u0098\u008e<\u00f3\u00a6\u00d4,?".length();
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
                    var4_14 = "n\u00ee\u0092\u0093\u00ddt<\u00aeL\u00f6AW\u00d4{?\u00f6";
                    var5_15 = "n\u00ee\u0092\u0093\u00ddt<\u00aeL\u00f6AW\u00d4{?\u00f6".length();
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
        d7.u = var6_12;
        d7.v = new Integer[5];
        d7.h = (int)d7.c("b", (int)22037, (long)(var11 ^ 6975230981179063916L));
        d7.g = (int)d7.c("b", (int)17109, (long)(var11 ^ 428835354641705641L));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean e(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = q ^ l;
        long l3 = l2 ^ 0x6A07261CEFAFL;
        long l4 = l2 ^ 0x19F917999384L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = class_2432;
        objectArray2[0] = d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l);
        CallSite callSite = d7.d("\u00aa", (Object)objectArray2, (long)-5422699015472264379L, (long)l);
        CallSite callSite2 = d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l), (long)-5438808401756665785L, (long)l);
        CallSite callSite3 = d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l), (long)-5440272562756042586L, (long)l);
        d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l), (float)d7.d("\u00ec", (Object)callSite, (Object)new Object[0], (long)-5440028340085626254L, (long)l), (long)-5426740465824605103L, (long)l);
        d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l), (float)d7.d("\u00ec", (Object)callSite, (Object)new Object[0], (long)-5422553364115512247L, (long)l), (long)-5423851058994105569L, (long)l);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l4;
            objectArray3[0] = d7.d("\u00f1", (long)-5438140890330784654L, (long)l);
            CallSite callSite4 = d7.d("\u00aa", (Object)objectArray3, (long)-5426213417460153921L, (long)l);
            return (boolean)callSite4;
        }
        finally {
            d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l), (float)callSite2, (long)-5426740465824605103L, (long)l);
            d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-5425291124866181514L, (long)l), (float)callSite3, (long)-5423851058994105569L, (long)l);
        }
    }

    @Override
    public void e(Object[] objectArray) {
        d7 d72;
        long l;
        long l2;
        long l3;
        block14: {
            block15: {
                block18: {
                    Object object;
                    long l4;
                    block16: {
                        l3 = (Long)objectArray[0];
                        long l5 = l3;
                        long l6 = l5 ^ 0x4B64345D78F2L;
                        l2 = l5 ^ 0x7FAB131DDD11L;
                        l4 = l5 ^ 0x5A266ADED12L;
                        l = l5 ^ 0x36FC1816D13DL;
                        CallSite callSite = d7.d("\u00aa", (long)3998036524037061559L, (long)l3);
                        try {
                            block17: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        d72 = this;
                                                        if (callSite != null) break block14;
                                                        if (d7.d("\u00ec", (Object)((Boolean)((Object)d7.d("\u00ec", (Object)d72.e, (long)3999181885712485036L, (long)l3))), (long)3998334350610337617L, (long)l3) == false) break block15;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                                                    }
                                                    d72 = this;
                                                    if (callSite != null) break block14;
                                                }
                                                catch (MatchException matchException) {
                                                    throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                                                }
                                                if (d72.l == -1) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                                            }
                                            object = d7.d("\u00ec", (Object)d7.d("\u00f1", (long)3982250017317836353L, (long)l3), (Object)new Object[0], (long)3981533115853355711L, (long)l3);
                                            if (callSite != null) break block16;
                                        }
                                        catch (MatchException matchException) {
                                            throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                                        }
                                        if (object == false) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l6;
                                    objectArray2[0] = this.l;
                                    d7.d("\u00ec", (Object)d7.d("\u00f1", (long)3982250017317836353L, (long)l3), (Object)objectArray2, (long)3997639593427218230L, (long)l3);
                                    if (callSite == null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                                }
                            }
                            object = this.l;
                        }
                        catch (MatchException matchException) {
                            throw d7.d("\u00aa", (Object)matchException, (long)3981255294269741088L, (long)l3);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l4;
                    objectArray3[0] = (int)object;
                    d7.d("\u00aa", (Object)objectArray3, (long)3982173158981784300L, (long)l3);
                }
                this.l = -1;
            }
            d72 = this;
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l;
        d7.d("\u00ec", (Object)d72, (Object)objectArray4, (long)3996632648329298792L, (long)l3);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l2;
        objectArray5[0] = this;
        d7.d("\u00ec", (Object)d7.d("\u00f1", (long)3982250017317836353L, (long)l3), (Object)objectArray5, (long)3983158814911322374L, (long)l3);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d7.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19C6;
        if (s[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])t.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = r[n2].getBytes("ISO-8859-1");
            d7.s[n2] = d7.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x40EB;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = u[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])w.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            d7.v[n2] = n3;
        }
        return v[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = d7.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d7.m(l, l2);
            object = x[n];
            try {
                if (!(object instanceof String)) break block2;
                d7.x[n] = clazz = Class.forName(y[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void n(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = q ^ l;
        long l3 = l2 ^ 0x6B8A3B9B8045L;
        long l4 = l2 ^ 0xD73AE9FD139L;
        this.i = b_0.BACK;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        d7.d("\u00ec", (Object)this.o, (Object)objectArray2, (long)-6918898022084782227L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        d7.d("\u00ec", (Object)this.c, (Object)objectArray3, (long)-6931971195308652574L, (long)l);
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d7.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d7.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d7.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d7.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean f(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = q ^ l) ^ 0x7D9DA7431AL;
        CallSite callSite = d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)7217977125083236072L, (long)l), (long)7213465982023276761L, (long)l);
        CallSite callSite2 = d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)7217977125083236072L, (long)l), (long)7214306358741536824L, (long)l);
        d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)7217977125083236072L, (long)l), (float)d7.d("\u00ec", (Object)dC2, (Object)new Object[0], (long)7214549486530312940L, (long)l), (long)7218779583938006223L, (long)l);
        d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)7217977125083236072L, (long)l), (float)d7.d("\u00ec", (Object)dC2, (Object)new Object[0], (long)7215085416162358487L, (long)l), (long)7216039521030857601L, (long)l);
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = d7.d("\u00f1", (long)7213022952415055084L, (long)l);
            CallSite callSite3 = d7.d("\u00aa", (Object)objectArray2, (long)7218195025843884321L, (long)l);
            return (boolean)callSite3;
        }
        finally {
            d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)7217977125083236072L, (long)l), (float)callSite, (long)7218779583938006223L, (long)l);
            d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)7217977125083236072L, (long)l), (float)callSite2, (long)7216039521030857601L, (long)l);
        }
    }

    private static void f() {
        Object[] objectArray = x;
        x[0] = ";&HjN5-&M0]\":mN6Q6+*Y!\u001a'";
        objectArray[1] = Integer.TYPE;
        d7.y[1] = "java/lang/Integer";
        objectArray[2] = "S\u001f\u001d5\u000blE\u001f\u0018o\u0018{RT\u001bi\u0014oC\u0013\f~_}\u007f";
        objectArray[3] = "\u0006\u0014 \"Ris4+-C&\u000e,8*Jof";
        objectArray[4] = "a9p\u001ahZw9u@{M`rvFwYq5aQ<N2";
        objectArray[5] = "\u0005?p,\u0006=p\u001f{#\u0017r\u0011\u0011p(\u0013(e";
        objectArray[6] = Void.TYPE;
        d7.y[6] = "java/lang/Void";
        objectArray[7] = "3ngO\u0011\f3np\u0013\u001d\u0003)%p\r\u001d\u0016.T PL";
        objectArray[8] = "Rx\f0]DRx\u001blQKH3\u001brQ^OBO*\u0006";
        objectArray[9] = "$/blR82/g6A/%dd0M;4#s'\u0006.u";
        objectArray[10] = "W3M| 1\"\u0013Fs1~C\u001dMx5$7";
        objectArray[11] = Boolean.TYPE;
        d7.y[11] = "java/lang/Boolean";
        objectArray[12] = "Gmm0dsGmzlh|]&zrhiZW/-1";
        objectArray[13] = "\u0000\u0007[c$7\u000b\bJ,G:\u001e\u0005EGr8\u000f\u0016Yke5";
        objectArray[14] = "}*\u0015l{.\b\n\u001ecjai\u0004\u0015hn;\u001d";
        objectArray[15] = "\u001cZPK (iz[D1g\btPO5=|";
        objectArray[16] = "Q\tb66\u0003Z\u0006syZ\u0000T\u0004q6v";
        objectArray[17] = "Y\u001blf\u000e|O\u001bi<\u001dkXPj:\u0011\u007fI\u0017}-Zhl";
        objectArray[18] = "fy\\\u0004@\u001b\u0013YW\u000bQTrW\\\u0000U\u000e\u0006";
        objectArray[19] = "fn\u001f9imfn\beeb|%\b{ew{T_$3";
        objectArray[20] = "\u001c+\t{1\u0005\n+\f!\"\u0012\u001d`\u000f'.\u0006\f'\u00180e\u0016\n";
        objectArray[21] = "Jf}k=??Fvd,p^H}o(**";
        objectArray[22] = "\u0011(.g@\u0012\u0007(+=S\u0005\u0010c(;_\u0011\u0001$?,\u0014\u0001\u0019$='NL%?=:N\u000b\u0012(";
        objectArray[23] = ">\u00134\u0002@:(\u00131XS-?X2^_9.\u001f%I\u0014.\u001e";
        objectArray[24] = "_sY{\"ZT|H4_BG{A}";
        objectArray[25] = "@XuktdVXp1gsA\u0013s7kgPTd  po";
        objectArray[26] = " \u001cD\u001b\u00063+\u0013UTg= \u0018Q\u000e";
        objectArray[27] = "\nd\"#Z\u0012\u007fD),K]\u001eJ\"'O\u0007j";
        objectArray[28] = "\u0013>dcM7f\u001eol\\x\u0007\u0010dgX\"s";
        objectArray[29] = " \u0010\u0006nG7U0\raVx4>\u0006jR\"@";
        objectArray[30] = "\t5\u001fR\u0002\u001d|\u0015\u0014]\u0013R\u001d\u001b\u001fV\u0017\bi";
        objectArray[31] = "$u7SFzQU<\\W50[7WSoD";
        objectArray[32] = "|nc!\u001d<jnf{\u000e+}%e}\u0002?lbrjI(_";
        objectArray[33] = "\u001f=#h>\u0016j\u001d(g/Y\u000b\u0013#l+\u0003\u007f";
        objectArray[34] = "F\b\u001d\u0010\u0004PP\b\u0018J\u0017GGC\u001bL\u001bSV\u0004\f[PDa";
        objectArray[35] = "J|\u007f\b*+\\|zR9<K7yT5(ZpnC~8A";
        objectArray[36] = "N8\u0018$_\u000b;\u0018\u0013+NDZ\u0016\u0018 J\u001e.";
        objectArray[37] = "\u0000<v8x>u\u001c}7iq\u0014\u0012v<m+`";
        objectArray[38] = Float.TYPE;
        d7.y[38] = "java/lang/Float";
        objectArray[39] = "No\u0005t\u001ej;O\u000e{\u000f%ZA\u0005p\u000b\u007f.";
        objectArray[40] = "~\u0016m\u0016C ~\u0016zJO/d]zTO:c,(\n\u0018q";
        objectArray[41] = "a\u0019\u0014,Jc\u007f\u0011\u000ec7s\u007f";
        objectArray[42] = "\u0012W\r(r7\u0004W\bra \u0013\u001c\u000btm4\u0002[\u001cc&$\u0014";
        objectArray[43] = "mX\u0012\u001cQ/\u0018x\u0019\u0013@`yv\u0012\u0018D:\r";
        objectArray[44] = "3^K3lSF~@<}\u001c'pK7yFS";
        objectArray[45] = "\u0006\u0019Gn^x\r\u0016V!=u\u0018\u0010";
        objectArray[46] = Double.TYPE;
        d7.y[46] = "java/lang/Double";
        objectArray[47] = "9\u000bD@F\u00149\u000bS\u001cJ\u001b#@S\u0002J\u000e$1\u0002]\u0018E";
        objectArray[48] = "zgp+~wzggwrx`,girmg]61 ";
        objectArray[49] = "\u000b2m\u0004u,~\u0012f\u000bdc\u001f\u001cm\u0000`9k";
        objectArray[50] = ">\u00025$t K\">+eo*,5 a5^";
        objectArray[51] = "\u0019`,YFY\u0019`;\u0005JV\u0003+;\u001bJC\u0004ZiO\u001b\u0002";
        objectArray[52] = "/7WU\u000fe/7@\t\u0003j5|@\u0017\u0003\u007f2\r\u0012L[>";
        objectArray[53] = "\u0015HP$RY\u0015HGx^V\u000f\u0003Gf^C\br\u00169\u0006";
        objectArray[54] = "\u000e\u0018\b/-\u0014\u000e\u0018\u001fs!\u001b\u0014S\u001fm!\u000e\u0013\"O7qM";
        objectArray[55] = "}GK/}3\bg@ l|iiK+h&\u001d";
        objectArray[56] = "2\t!b\u000f\u007fG)*m\u001e0&'!f\u001ajR";
        objectArray[57] = "b\\J%\"d\u0017|A*3+vrJ!7q\u0002";
        objectArray[58] = "9\u0001H\u00107\u00039\u0001_L;\f#J_R;\u0019$;\u000f\u0007l_";
        objectArray[59] = "0x/\u007f\u0005\u0013EX$p\u0014\\$V/{\u0010\u0006P";
        objectArray[60] = "lWD[c\u0017lWS\u0007o\u0018v\u001cS\u0019o\rqm\u0002F6";
        objectArray[61] = "\u0011G\u0003~eq\u0011G\u0014\"i~\u000b\f\u0014<ik\f}Ef0(";
        objectArray[62] = "\u00064&|y\u0017s\u0014-shX\u0012\u001a&xl\u0002f";
        objectArray[63] = "\u000f\u0001wgL\u0000\u0004\u000ef(+\u0002\u0011\u0005fc\u0010";
        objectArray[64] = "x`*j\u00175\r@!e\u0006zlN*n\u0002 \u0018";
        objectArray[65] = "D3&\u0012[`1\u0013-\u001dJ/P\u001d&\u0016Nu$";
        objectArray[66] = "6\u0001L\n.UC!G\u0005?\u001a\"/L\u000e;@V";
        objectArray[67] = "s`&bm(\u0006@-m|ggN&fx=\u0013";
        objectArray[68] = "\n\"\bcG1\u007f\u0002\u0003lV~\u001e\f\bgR$j";
        objectArray[69] = "t$O|#{t$X /tnoX>/ai\u001e\t`z$";
        objectArray[70] = "X_KFz}X_\\\u001avrB\u0014\\\u0004vgEe\rZ#,";
        objectArray[71] = "\u0010A\u007fKk\u000b\u0006Az\u0011x\u001c\u0011\ny\u0017t\b\u0000Mn\u0000?\u001f9";
        objectArray[72] = "E\n|\u00167\u00070*w\u0019&HQ$|\u0012\"\u0012%";
        objectArray[73] = "j=9&Y9\u001f\u001d2)Hv~\u00139\"L,\n";
        objectArray[74] = "\u0016]F@0Qc}MO!\u001e\u0002sFD%Dv";
        objectArray[75] = "<mn<m=IMe3|r(Cn8x(\\";
        objectArray[76] = "I\u0016\u0006OQ4<6\r@@{]8\u0006KD!)";
        objectArray[77] = "\u0017\u000f\n^\u0001sZ\u000fHU>'K^TUip\u0015\t\f9\u0000qG^HBO#@H";
        objectArray[78] = "=>/<G9r~;x&6\u0003y>x\u001b$:}?<D?\u0003pa`B/`9n9\u0019_";
        objectArray[79] = "QY\u0013`0\b\u0000\u001cSaP\u0017j[@ m\u000eS_Ad2\u0015j^M'o\u000eQ\u0006P8+u";
        objectArray[80] = "d\u0018(r\u0004p<\u0018asbz\u0003[|u_j:_}1\u0000q\u0003R#m\u0006a`\u001b,4]\u0011";
        objectArray[81] = "tD\u000e\u001d]\u0007%\u0001N\u001c=\u001dOF]]\u0000\u0001vB\\\u0019_\u001aOCPZ\u0002\u0001t\u001bMEFz";
        objectArray[82] = "q\u0012p\"\u0000\u0010}Q64|\u001c\u001a\u0010b5A\r#\u0014cq\u001e\u0016\u001a\u0015o2C\r!Mr-\u0007v";
        objectArray[83] = "#olNO`no.Ep4\u007f>2E'c!nk)\u001cd.i8\u0014\u00151}o";
        objectArray[84] = "n|S\u001ejw?9\u0013\u001f\ncU~\u0000^7qlz\u0001\u001ahjUw_Fnz6>P\u001f5\n";
        objectArray[85] = "r\u001a!'\u00128=H&1j&!^,-\u0006\u0014r\u001buwjs|@(:\t:s\u0019sJ";
        objectArray[86] = "r\u0002\f\u0011\u0016\u0003\"MS\n(Td\u000e\u0006\u001cSxr\u0015\b\u0002Ert\b\u0002xGH~\u001aQB\u0017\u0007!\u0001oH\u0018[y\u0003\f\u0001\u0017\u0002\"s";
        objectArray[87] = "yp\u0016+9s:~\u000brZ*kk\u000bt6\u0018:)V.jOvz\u0004wk\u007fo+\u0019-Z";
        objectArray[88] = "\u000bb\u001fN$\u0010T.\u0017\u001a3vW1\u001b\u0011(\u001ae`ZMpJ2lW\u0013+\u0006Q%XJpv";
        objectArray[89] = "df.*] +4)<%>7\"# I\fa`\u007fz\u001b[#!3\"H069y8%g8#|<\u001e?%<8G";
        objectArray[90] = "X$=Pdi\u001f'.I;\u000b\u000fx(Wi\\X\"\u007f\n\u0005u\u001e| Kad\u0000 ~";
        objectArray[91] = "x}.AI?7/)W1!+9#K]\u0013|y~\u0015\fD9\">\u0014Rxz,#M1";
        objectArray[92] = "D\u007fL<`n\t\u007f\u000e7_1\u0014?\u0016<3\u0003@~Hj_dI!\u0012+<-FxI[";
        objectArray[93] = ">NUNf\b'\u001fH\u0014W]#_ZM;ow\u001b\u0001\u0013WF1F_R3W/\u001a\u0001*)G+FBN8Yw\u0018:T(]+[^E6\u0001u#JG8\\\u007f\u0013S\u0016%\u0006N";
        objectArray[94] = "\ra\"eGoNo?<$6\u001fz?:H\u0004K>gm\u0018S\ra\"eGoNo?<$";
        objectArray[95] = "I.)fP|\u0018kig0hr,z&\rzK({bRarex3T0B|).\u000e\u0001";
        objectArray[96] = "Nml%t\f\u0001?k3\f\u0012\u001d)a/` Me;y\fNM-b)n\tN>{v\f";
        objectArray[97] = "5HLIK)+\u0003O\u00122?I\nAV\u000f?p\u000e@\u0012P$I\u000fLQ\r?rWQNID";
        objectArray[98] = "\u0002eO\u0006\u000fg\ng^\u001df4g ^\u001c[!^$_X\u0004:g\u007fK\b\u0014j\b`V\\\u0007Z";
        objectArray[99] = "dGP\u0010U\u001a+\u0007DT4\u0016Z\u0000AT\t\u0007c\u0004@\u0010V\u001cZ\t\u001eLP\f9@\u0011\u0015\u000b|";
        objectArray[100] = "'\tq*A 8\u0014%9q%AJp\"L4xNqf\u0013/A\n`(\u0014\"*\u001fxb\u000eO";
        objectArray[101] = "Q `dO|\u0012.}=,%C;};@\u0017\u0017\u007f'b\u0017@\u0017-l\"N~V+p',";
        objectArray[102] = "S\u001co/:a\u0010\u0012rvY8A\u0007rp5\n\u0015C*)h]\u0015\u0011ci;cT\u0017\u007flYdF\nlug%@\u0016i\u0017`7]\u0005p)!1A\u0000\u0012h> \u0014\u0018.+0=M{";
        objectArray[103] = "\u0012],\u0005<*\u0014\u0013x\u0019_y\u001f\u0005q\n6u&\u000bq\u001a2\u0013HRw\u0003/p\u0001].X_";
        objectArray[104] = "[$\u000fk[L\naOj;\\`&\\+\u0006JY\"]oYQ`/\u00033_A\u0003f\fj\u00041";
        objectArray[105] = "y\n`X/$>\tsApF.Vu_\"\u0011y\f\"\u0000N8?R}C*)!\u000e#";
        objectArray[106] = "G)][\u0016YTy\u0013]h\u0002*yMLU\u001d\u0013}L\b\n\u0006*p\u0012T\f\u0016I9\u001d\rWf";
        objectArray[107] = "lJ[ nE0[\u0014\"TK\fGBc1M2MFv-\"";
        objectArray[108] = "#(](W$:1T=m9<79&\u0012'8)]7\f{fQG'\b'%5V9Ty]";
        objectArray[109] = "\u0001\\/'5\u0003F_<>jaV\u0000: 86\u0001ZmxT\u001fG\u00042<0\u000eYXl";
        objectArray[110] = "\u000f\u001b{Flo\u0010\u0006/U\\iiXzNa{P\\{\n>`iQ%V8p\n\u0018*\u000fc\u0000";
        objectArray[111] = "\u000fm~\u0010v][l1A)`S<2\u001b \fahqDx_6.)\u0006\u007f\u0003\nm'\u001b&`";
        objectArray[112] = "\u00118%vC/Awzm}x\u00074/{\u0006\u0015\u001f.9z\u0012+\u0015*,f}%N+\"o\u001elAry\u001f";
        objectArray[113] = "cS3.\u0012_2\u0016s/rNXQ`nOYaUa*\u0010BXX?v\u0016R;\u00110/M\"";
        objectArray[114] = "@>o |E\u000flh6\u0004[\u0013zb*hiE8>p;>\u0007yr(iU\u0012a82\u0004\u0002\u001c{=6?Z\u0001dyM";
        objectArray[115] = "P\u0016)K\u001bE\u0013\u00184\u0012x\u001cB\r4\u0014\u0014.\u0016InMDy\u0016\u001b%\r\u001aGW\u001d9\bx";
        objectArray[116] = "fMw\u000f\u001folKrJ%1;Un\u0011I\u0003f\u00127H%+1T6\u0015\u0019h?Iov\u001cm7\u00155\fOi<P>v";
        objectArray[117] = "$n Q\u001dJu+`P}X\u001fls\u0011@L&hrU\u001fW\u001fe,\t\u0019G|,#PB7";
        objectArray[118] = "\u0018EIw)PI\u0000\tvIC#G\u001a7tV\u001aC\u001bs+M#NE/-]@\u0007Jvv-";
        objectArray[119] = "\u0002\u0010<-2j]\\4y%\f^C8r>`l\u0014z(a0;\u0017/ueu\nE%q\"s;";
        objectArray[120] = "Z_rP89\u001f\\1;?}\b\u0005/R<\u0007]\u000e8E:9\u001c\b$@X";
        objectArray[121] = "n\rIF\u0011|{Y\u000bGoq}\u000b\u0012L8/#^K V'|\u0014\u0017\u0010P}aY\f";
        objectArray[122] = "b;`-^&%8s4\u0001D5gu*S\u0013b=\"s?:$c}6[+:?#";
        objectArray[123] = ",$\u0000\u001c\u0004w\u007f)S\u001cix\u0015lPE\u0004{+2Z\u0018\u0012\u0012";
        objectArray[124] = "dFf\u0015_\u00165\u0003&\u0014?\u000e_D5U\u0002\u0010f@4\u0011]\u000b_A8R\u0000\u0010d\u0019%MDk";
        objectArray[125] = "\u000f\u0019f-K?^D1`,.`Be*\u00114YFdnN/`Gh-\u00134[\u001fu2WO";
        objectArray[126] = "ezM)\u0010\u0010(z\u000f\"/D9+\u0013\"x\u0013gxJN\u0016\u0013e\"\tsJP=~\u0013";
        objectArray[127] = ">p\u0000!m\u000f}~\u001dx\u000e^8j\u0014}u3 p\u0002|a\r*t\u0017`\u000e\u0003qu\u0019imJ~,B\u0019";
        objectArray[128] = "\n!O\u0019=]M\"\\\u0000b?]}Z\u001e0h\n'\r@\\ALyR\u00028PR%\f";
        objectArray[129] = "K!\u0001WQ8\u0006!C\\nl\u0017p_\\9;H-\u00040^f\u000fd\u0001\u000bT`\n!";
        objectArray[130] = "{6'5B}hfi3<\"\u0016f7\"\u00019/b6f^\"\u0016oh:X2u&gc\u0003B";
        objectArray[131] = "\"\u001f'\u001dy\u0014q\u001b,Xrn~K:A%\u0002L\u001f{\u001e}W\u001b\u0016vC&\u001ex_y\u001a}n";
        objectArray[132] = "<\n\u0016pnmmWA=\ttSQ\u0015w4fjU\u00143k}S\u000e\u0000c{-<\u0011\u001d7h\u001d";
        objectArray[133] = "3t*\u0013 @tw9\n\u007f\"d(?\u0014-u3rhHA\\u,7\b%Mkpi";
        objectArray[134] = "h\u0014\\n0<7\u001d\u0006?/M?\u001eQ0%\u001ahG\u0007hrMh\u0014[h0|:\u001e_/6";
        objectArray[135] = "(8\u0012PVF>!\u0004K)B3*\u000bX~\u0011b\u007f_4SS/#\u0010^EJ98";
        objectArray[136] = "vX\tAp^'\u0005^\f\u0017@\u0019\u0003\nF*U \u0007\u000b\u0002uN\u0019\u0006\u0007A(U\"^\u001a^l.";
        objectArray[137] = "FF\u001b&sS__\u00123I^_D\u007f(6P]G\u001b9(\f\u0003?\u0001),P@[\u00107p\u000e8";
        objectArray[138] = "9%\u000b\u0000(Lz+\u0016YK\u0015+>\u0016_''\u007fzN\u0007wp9%\u000b\u0000(Lz+\u0016YK";
        objectArray[139] = "i-\u0006\u0007]\u00158hF\u0006=\fR/UG\u0000\u0013k+T\u0003_\bR*X@\u0002\u0013irE_Fh";
        objectArray[140] = "G\u0000\u0002r\u001dv\b@\u00166|yyG\u00136Ak@C\u0012r\u001epyB\u001e1CkB\u001a\u0003.\u0007\u0010";
        objectArray[141] = "U3\u001d0\u001f$\u001aa\u001a&g:\u0006w\u0010:\u000b\bP5L`[_\u0012t\u00008\n4\u0007lJ\"g";
        objectArray[142] = "|\u0019aFbhiM#G\u001ceo\u001f:LK;3Of %3n\u0000?\u0010#isM$";
        objectArray[143] = "c\u001c,\u0001sO2Yl\u0000\u0013QX\u001e\u007fA.Ia\u001a~\u0005qRX\u001brF,IcCoYh2";
        objectArray[144] = "\t\\\u0011M\u0002TX\u0001F\u0000eHf\u0007\u0012JX__\u0003\u0013\u000e\u0007Df\u000eMR\u0001T\u0005GB\u000bZ$";
        objectArray[145] = "\u000f&xdO\fL(e=,U\u001d=e;@gIy?b\u00140I+t\"N\u000e\b-h',";
        objectArray[146] = "\r5MC\r\u001e\u001ee\u0003EsH`e]TNZYa\\\u0010\u0011A`e\u0002\u0017\u000f\u001eX?M\u0016KP`";
        objectArray[147] = "\u0010I\u000e:p\u0004\u001aO\u000b\u007fJZMQ\u0017$&h\u0010\u0016M{J@GPO v\u0003IM\u0016Cs\u0001X\u0012\u001c%,MPF\u000bC";
        objectArray[148] = "KoN\u0013F]RvG\u0006|GRLC\u000f\u001dRSm*\u001d\u0003^PnN\f\u001d\u0002\u000e\u0016T\u001c\u0019^MrE\u0002E\u00005";
        objectArray[149] = "ZcRYHr\u000b&\u0012X(faiW\u001e\u00160\u000bi\f\\\u0015\u000fPa\u0013]\u0017eP:Q^(";
        objectArray[150] = "(v(\u0013\u0016fy+\u007f^q\u007fG-+\u0014Lm~)*P\u0013vG(&\u0013Nm|p;\f\n\u0016";
        objectArray[151] = "}\fv\u0007i1,I6\u0006\t*F\u000e%G47\u007f\n$\u0003k,F\u000b(@67}S5_rL";
        objectArray[152] = "9n4'.\u0006h3cjI\u001bV57 t\ro16d+\u0016V0:'v\rmh'82v";
        objectArray[153] = "\r\r\u001fa1*B_\u0018wI4^I\u0012k%\u0006\b\u000bN1tQJJ\u0002i$:_RHsI";
        objectArray[154] = "#M$vO@0\u001djp1\u0016N\u001d4a\f\u0004w\u00195%S\u001fN\u00189f\u000e\u0004u@$yJ\u007f";
        objectArray[155] = "\u0019eYtLw\u001d`A?,iww\\!Qi\u0007&\u0001v\u001c";
        objectArray[156] = "\u001d /J*N\u0002={Y\u001aH{c.B'ZBg/\u0006xA{#>H\u007fL\u00106&\u0002e!";
        objectArray[157] = ".\u0018\u0001Ra\u001c=HOT\u001fJCH\u0011E\"XzL\u0010\u0001}CCH\u0014NaA}\t\u0012Rd#";
        objectArray[158] = "\t\u0013 S>\u0015_\u001c=\nimY\u007f\u007f\u0005#PKF{\u0004g\u000fP\u007f\u007f\u0006?TW\u0007)\t\"\r\u0000\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[159] = "0Vj}\u001bu1Jww*u%,h`Uw$\u0012bd@kKWsdP#,VoyZ\u0012";
    }

    /*
     * Exception decompiling
     */
    private void l(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [58[DOLOOP]], but top level block is 20[TRYBLOCK]
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d7.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == '\u00e6' || c == '\u00f1' || c == 'u') {
                field = d7.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d7.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = q ^ l) ^ 0x214BF0A0BC77L;
        class_2338 class_23382 = this.k;
        CallSite callSite = d7.d("\u00aa", (long)5007391918621870513L, (long)l);
        while (true) {
            Object object;
            block12: {
                Object object2;
                block11: {
                    block10: {
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l2;
                                objectArray2[0] = class_23382;
                                if (d7.d("\u00ec", (Object)this, (Object)objectArray2, (long)5005255688902575086L, (long)l) == false) break block10;
                                object2 = false;
                                if (callSite != null) break block11;
                            }
                            catch (MatchException matchException) {
                                throw d7.d("\u00aa", (Object)matchException, (long)4991809156803275302L, (long)l);
                            }
                            return object2;
                        }
                        catch (MatchException matchException) {
                            throw d7.d("\u00aa", (Object)matchException, (long)4991809156803275302L, (long)l);
                        }
                    }
                    try {
                        object = class_23382;
                        if (callSite != null) break block12;
                        object2 = d7.d("\u00ec", (Object)object, (Object)this.j, (long)5007102349667671560L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw d7.d("\u00aa", (Object)matchException, (long)4991809156803275302L, (long)l);
                    }
                }
                try {
                    if (object2) {
                        return true;
                    }
                }
                catch (MatchException matchException) {
                    throw d7.d("\u00aa", (Object)matchException, (long)4991809156803275302L, (long)l);
                }
                object = d7.d("\u00ec", (Object)class_23382, (long)5004804781156562677L, (long)l);
            }
            class_23382 = object;
        }
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x52D6E774439DL;
        long l4 = l2 ^ 0x6D7F754CCB5EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        d7.d("\u00ec", (Object)this, (Object)objectArray2, (long)3248713488587004171L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = this;
        d7.d("\u00ec", (Object)d7.d("\u00f1", (long)3251758127487372322L, (long)l), (Object)objectArray3, (long)3251718264717660467L, (long)l);
    }

    private boolean a(Object[] objectArray) {
        int n;
        block5: {
            block4: {
                class_2338 class_23382 = (class_2338)objectArray[0];
                long l = (Long)objectArray[1];
                l = q ^ l;
                try {
                    try {
                        if (class_23382 == null || d7.d("\u00ec", (Object)d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)-7922923655905546317L, (long)l), (Object)class_23382, (long)-7923942159733397177L, (long)l), (long)-7912400895718649708L, (long)l) != d7.d("\u00f1", (long)-7922409090559299629L, (long)l)) break block4;
                    }
                    catch (MatchException matchException) {
                        throw d7.d("\u00aa", (Object)matchException, (long)-7923794046941856407L, (long)l);
                    }
                    n = 1;
                    break block5;
                }
                catch (MatchException matchException) {
                    throw d7.d("\u00aa", (Object)matchException, (long)-7923794046941856407L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    private class_243 a(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        l = q ^ l;
        float f = (float)d7.d("\u00aa", (double)((double)d7.d("\u00ec", (Object)d7.d("q", (Object)b, (long)3875639404446947082L, (long)l), (long)3889156681341782331L, (long)l)), (long)3890910579600045596L, (long)l);
        return d7.d("\u00ec", (Object)d7.d("\u00ec", (Object)class_23382, (long)3877504061136670012L, (long)l), (double)(-d7.d("\u00aa", (double)f, (long)3873469573504171439L, (long)l) * 0.25), (double)0.0, (double)(d7.d("\u00aa", (double)f, (long)3888922296380562953L, (long)l) * 0.25), (long)3876815299628994066L, (long)l);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bG var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    public void a(a5 a52) {
        long l = q ^ 0xBB623BE724BL;
        long l2 = l ^ 0x4B10BFF4FF2BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        d7.d("\u00ec", (Object)this, (Object)objectArray, (long)1828630615973932414L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return d7.d("\u00aa", (Object)((Object)q_0.UHC), (long)-2438742058476686510L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public dC a(Object[] var1_1) {
        block93: {
            block100: {
                block98: {
                    block96: {
                        block97: {
                            block94: {
                                block95: {
                                    block92: {
                                        block90: {
                                            block91: {
                                                block88: {
                                                    block89: {
                                                        block86: {
                                                            block87: {
                                                                block85: {
                                                                    block84: {
                                                                        block82: {
                                                                            block83: {
                                                                                block81: {
                                                                                    block80: {
                                                                                        block78: {
                                                                                            block79: {
                                                                                                block77: {
                                                                                                    var2_2 = (Long)var1_1[0];
                                                                                                    v0 = var2_2;
                                                                                                    var4_3 = v0 ^ 29247161167908L;
                                                                                                    var6_4 = v0 ^ 106952455144116L;
                                                                                                    var8_5 = v0 ^ 33065978990036L;
                                                                                                    var10_6 = v0 ^ 108292967674203L;
                                                                                                    var12_7 = v0 ^ 101816702374277L;
                                                                                                    var14_8 = v0 ^ 136752692109656L;
                                                                                                    var16_9 = v0 ^ 133051409312800L;
                                                                                                    var18_10 = v0 ^ 13258986938553L;
                                                                                                    var20_11 = v0 ^ 36186424613721L;
                                                                                                    var22_12 = d7.d("\u00aa", (long)-1177821990314581141L, (long)var2_2);
                                                                                                    try {
                                                                                                        if (d7.d("\u00ec", (String)d7.d("\u00ec", (Object)this.a, (long)-1178928706946461072L, (long)var2_2), (Object)d7.b("g", (int)10134, (long)(5337686251076866542L ^ var2_2)), (long)-1176329726806225553L, (long)var2_2) == false) {
                                                                                                            return null;
                                                                                                        }
                                                                                                    }
                                                                                                    catch (MatchException v1) {
                                                                                                        throw d7.d("\u00aa", (Object)v1, (long)-1181022056474181380L, (long)var2_2);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            v2 = d7.b;
                                                                                                            if (var22_12 != null) break block77;
                                                                                                            if (d7.d("q", (Object)v2, (long)-1177064554496078487L, (long)var2_2) != null) {
                                                                                                            }
                                                                                                            ** GOTO lbl42
                                                                                                        }
                                                                                                        catch (MatchException v3) {
                                                                                                            throw d7.d("\u00aa", (Object)v3, (long)-1181022056474181380L, (long)var2_2);
                                                                                                        }
                                                                                                        v2 = d7.b;
                                                                                                    }
                                                                                                    catch (MatchException v4) {
                                                                                                        throw d7.d("\u00aa", (Object)v4, (long)-1181022056474181380L, (long)var2_2);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var22_12 != null) break block78;
                                                                                                        if (d7.d("q", (Object)v2, (long)-1181857282750836186L, (long)var2_2) != null) break block79;
                                                                                                    }
                                                                                                    catch (MatchException v5) {
                                                                                                        throw d7.d("\u00aa", (Object)v5, (long)-1181022056474181380L, (long)var2_2);
                                                                                                    }
lbl42:
                                                                                                    // 2 sources

                                                                                                    return null;
                                                                                                }
                                                                                                catch (MatchException v6) {
                                                                                                    throw d7.d("\u00aa", (Object)v6, (long)-1181022056474181380L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            v2 = d7.b;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var22_12 != null) break block80;
                                                                                                if (d7.d("q", (Object)v2, (long)-1176126988718265381L, (long)var2_2) == null) {
                                                                                                }
                                                                                                ** GOTO lbl82
                                                                                            }
                                                                                            catch (MatchException v7) {
                                                                                                throw d7.d("\u00aa", (Object)v7, (long)-1181022056474181380L, (long)var2_2);
                                                                                            }
                                                                                            v2 = d7.b;
                                                                                        }
                                                                                        catch (MatchException v8) {
                                                                                            throw d7.d("\u00aa", (Object)v8, (long)-1181022056474181380L, (long)var2_2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            v9 = d7.d("\u00ec", (Object)v2, (long)-1175885263012910281L, (long)var2_2);
                                                                                            if (var22_12 != null) break block81;
                                                                                            if (v9 != false) {
                                                                                            }
                                                                                            ** GOTO lbl82
                                                                                        }
                                                                                        catch (MatchException v10) {
                                                                                            throw d7.d("\u00aa", (Object)v10, (long)-1181022056474181380L, (long)var2_2);
                                                                                        }
                                                                                        v9 = d7.d("\u00ec", (Object)d7.d("q", (Object)d7.b, (long)-1177064554496078487L, (long)var2_2), (long)-1176541343471887763L, (long)var2_2);
                                                                                    }
                                                                                    catch (MatchException v11) {
                                                                                        throw d7.d("\u00aa", (Object)v11, (long)-1181022056474181380L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var22_12 != null) break block82;
                                                                                        if (v9 == false) break block83;
                                                                                    }
                                                                                    catch (MatchException v12) {
                                                                                        throw d7.d("\u00aa", (Object)v12, (long)-1181022056474181380L, (long)var2_2);
                                                                                    }
lbl82:
                                                                                    // 3 sources

                                                                                    return null;
                                                                                }
                                                                                catch (MatchException v13) {
                                                                                    throw d7.d("\u00aa", (Object)v13, (long)-1181022056474181380L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            v9 = d7.d("\u00ec", (Object)d7.d("\u00f1", (long)-1180044942926016867L, (long)var2_2), (Object)new Object[0], (long)-1180691402526858653L, (long)var2_2);
                                                                        }
                                                                        try {
                                                                            if (v9 != false) {
                                                                                return null;
                                                                            }
                                                                        }
                                                                        catch (MatchException v14) {
                                                                            throw d7.d("\u00aa", (Object)v14, (long)-1181022056474181380L, (long)var2_2);
                                                                        }
                                                                        var23_13 = this.i;
                                                                        try {
                                                                            try {
                                                                                v15 = var23_13;
                                                                                v16 = b_0.PLACE;
                                                                                if (var22_12 != null) break block84;
                                                                                if (v15 == v16) break block85;
                                                                            }
                                                                            catch (MatchException v17) {
                                                                                throw d7.d("\u00aa", (Object)v17, (long)-1181022056474181380L, (long)var2_2);
                                                                            }
                                                                            v15 = var23_13;
                                                                            v16 = b_0.SCOOP;
                                                                        }
                                                                        catch (MatchException v18) {
                                                                            throw d7.d("\u00aa", (Object)v18, (long)-1181022056474181380L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v15 != v16) {
                                                                            return null;
                                                                        }
                                                                    }
                                                                    catch (MatchException v19) {
                                                                        throw d7.d("\u00aa", (Object)v19, (long)-1181022056474181380L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        v20 = this;
                                                                        if (var22_12 != null) break block86;
                                                                        v21 = new Object[2];
                                                                        v21[1] = var8_5;
                                                                        v21[0] = this.c;
                                                                        if (d7.d("\u00ec", (Object)v20.o, (Object)v21, (long)-1179494469283642838L, (long)var2_2) != false) break block87;
                                                                    }
                                                                    catch (MatchException v22) {
                                                                        throw d7.d("\u00aa", (Object)v22, (long)-1181022056474181380L, (long)var2_2);
                                                                    }
                                                                    return null;
                                                                }
                                                                catch (MatchException v23) {
                                                                    throw d7.d("\u00aa", (Object)v23, (long)-1181022056474181380L, (long)var2_2);
                                                                }
                                                            }
                                                            v20 = this;
                                                        }
                                                        try {
                                                            v24 /* !! */  = var23_13 == b_0.PLACE ? this.j : d7.d("\u00ec", (Object)this.j, (long)-1175723013044511697L, (long)var2_2);
                                                        }
                                                        catch (MatchException v25) {
                                                            throw d7.d("\u00aa", (Object)v25, (long)-1181022056474181380L, (long)var2_2);
                                                        }
                                                        v26 = new Object[2];
                                                        v26[1] = var10_6;
                                                        v26[0] = v24 /* !! */ ;
                                                        var24_14 = d7.d("\u00ec", (Object)v20, (Object)v26, (long)-1175791586009264978L, (long)var2_2);
                                                        v27 = new Object[2];
                                                        v27[1] = var12_7;
                                                        v27[0] = var24_14;
                                                        var25_15 = d7.d("\u00ec", (Object)d7.d("\u00f1", (long)-1180044942926016867L, (long)var2_2), (Object)v27, (long)-1182076276598163842L, (long)var2_2);
                                                        try {
                                                            try {
                                                                if (var22_12 != null) break block88;
                                                                if (d7.d("\u00ec", (Object)var25_15, (Object)new Object[0], (long)-1179099326981134214L, (long)var2_2) == false) break block89;
                                                            }
                                                            catch (MatchException v28) {
                                                                throw d7.d("\u00aa", (Object)v28, (long)-1181022056474181380L, (long)var2_2);
                                                            }
                                                            return var25_15;
                                                        }
                                                        catch (MatchException v29) {
                                                            throw d7.d("\u00aa", (Object)v29, (long)-1181022056474181380L, (long)var2_2);
                                                        }
                                                    }
                                                    d7.d("\u00ec", (Object)d7.d("\u00f1", (long)-1180044942926016867L, (long)var2_2), (Object)new Object[]{var25_15}, (long)-1180835705805594374L, (long)var2_2);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var23_13 == b_0.PLACE) {
                                                                v30 = new Object[2];
                                                                v30[1] = var16_9;
                                                                v30[0] = d7.d("\u00f1", (long)-1177927593255010964L, (long)var2_2);
                                                                v31 = d7.d("\u00ec", (Object)this, (Object)v30, (long)-1178792407940607759L, (long)var2_2);
                                                                if (var22_12 != null) break block90;
                                                            }
                                                            ** GOTO lbl217
                                                        }
                                                        catch (MatchException v32) {
                                                            throw d7.d("\u00aa", (Object)v32, (long)-1181022056474181380L, (long)var2_2);
                                                        }
                                                        if (v31 != false) break block91;
                                                    }
                                                    catch (MatchException v33) {
                                                        throw d7.d("\u00aa", (Object)v33, (long)-1181022056474181380L, (long)var2_2);
                                                    }
                                                    return null;
                                                }
                                                catch (MatchException v34) {
                                                    throw d7.d("\u00aa", (Object)v34, (long)-1181022056474181380L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                v35 = this;
                                                if (var22_12 != null) break block92;
                                                v36 = new Object[2];
                                                v36[1] = var18_10;
                                                v36[0] = var25_15;
                                                v31 = d7.d("\u00ec", (Object)v35, (Object)v36, (long)-1178599520177168911L, (long)var2_2);
                                            }
                                            catch (MatchException v37) {
                                                throw d7.d("\u00aa", (Object)v37, (long)-1181022056474181380L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            if (v31 == false) break block93;
                                            this.i = b_0.WAIT;
                                            this.m = 0;
                                            v38 = new Object[1];
                                            v38[0] = var4_3;
                                            d7.d("\u00ec", (Object)this.o, (Object)v38, (long)-1181539611553913076L, (long)var2_2);
                                            v35 = this;
                                        }
                                        catch (MatchException v39) {
                                            throw d7.d("\u00aa", (Object)v39, (long)-1181022056474181380L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                v40 = new Object[1];
                                                v40[0] = var14_8;
                                                d7.d("\u00ec", (Object)v35.c, (Object)v40, (long)-1176070625247217789L, (long)var2_2);
                                                if (var22_12 == null) break block93;
lbl217:
                                                // 2 sources

                                                v41 = new Object[2];
                                                v41[1] = var16_9;
                                                v41[0] = d7.d("\u00f1", (long)-1181419085378369658L, (long)var2_2);
                                                v42 /* !! */  = d7.d("\u00ec", (Object)this, (Object)v41, (long)-1178792407940607759L, (long)var2_2);
                                                if (var22_12 != null) break block94;
                                            }
                                            catch (MatchException v43) {
                                                throw d7.d("\u00aa", (Object)v43, (long)-1181022056474181380L, (long)var2_2);
                                            }
                                            if (v42 /* !! */  != false) break block95;
                                        }
                                        catch (MatchException v44) {
                                            throw d7.d("\u00aa", (Object)v44, (long)-1181022056474181380L, (long)var2_2);
                                        }
                                        return null;
                                    }
                                    catch (MatchException v45) {
                                        throw d7.d("\u00aa", (Object)v45, (long)-1181022056474181380L, (long)var2_2);
                                    }
                                }
                                v42 /* !! */  = d7.d("\u00ec", (Object)d7.d("\u00ec", (Object)d7.d("q", (Object)d7.b, (long)-1181857282750836186L, (long)var2_2), (Object)d7.d("\u00ec", (Object)this.j, (long)-1175723013044511697L, (long)var2_2), (long)-1178699487201017801L, (long)var2_2), (long)-1181722435663589213L, (long)var2_2);
                            }
                            try {
                                try {
                                    if (var22_12 != null) break block96;
                                    if (v42 /* !! */  != false) break block97;
                                }
                                catch (MatchException v46) {
                                    throw d7.d("\u00aa", (Object)v46, (long)-1181022056474181380L, (long)var2_2);
                                }
                                v47 = new Object[1];
                                v47[0] = var20_11;
                                d7.d("\u00ec", (Object)this, (Object)v47, (long)-1180923080696044828L, (long)var2_2);
                                return null;
                            }
                            catch (MatchException v48) {
                                throw d7.d("\u00aa", (Object)v48, (long)-1181022056474181380L, (long)var2_2);
                            }
                        }
                        v49 = new Object[2];
                        v49[1] = var18_10;
                        v49[0] = var25_15;
                        v42 /* !! */  = d7.d("\u00ec", (Object)this, (Object)v49, (long)-1178599520177168911L, (long)var2_2);
                    }
                    try {
                        try {
                            block99: {
                                try {
                                    try {
                                        if (var22_12 != null) break block98;
                                        if (v42 /* !! */  == false) break block99;
                                    }
                                    catch (MatchException v50) {
                                        throw d7.d("\u00aa", (Object)v50, (long)-1181022056474181380L, (long)var2_2);
                                    }
                                    v51 = new Object[1];
                                    v51[0] = var20_11;
                                    d7.d("\u00ec", (Object)this, (Object)v51, (long)-1180923080696044828L, (long)var2_2);
                                    if (var22_12 == null) break block93;
                                }
                                catch (MatchException v52) {
                                    throw d7.d("\u00aa", (Object)v52, (long)-1181022056474181380L, (long)var2_2);
                                }
                            }
                            v53 = this;
                            if (var22_12 != null) break block100;
                        }
                        catch (MatchException v54) {
                            throw d7.d("\u00aa", (Object)v54, (long)-1181022056474181380L, (long)var2_2);
                        }
                        v55 = v53.n + 1;
                        v42 /* !! */  = (CallSite)v55;
                        v53.n = v55;
                    }
                    catch (MatchException v56) {
                        throw d7.d("\u00aa", (Object)v56, (long)-1181022056474181380L, (long)var2_2);
                    }
                }
                try {
                    if (v42 /* !! */  <= d7.c("b", (int)19093, (long)(2127684713084020164L ^ var2_2))) break block93;
                    v57 = new Object[2];
                    v57[1] = var6_4;
                    v57[0] = d7.b("g", (int)19048, (long)(4822614512790813727L ^ var2_2));
                    d7.d("\u00ec", (Object)this, (Object)v57, (long)-1181491152593210781L, (long)var2_2);
                    v53 = this;
                }
                catch (MatchException v58) {
                    throw d7.d("\u00aa", (Object)v58, (long)-1181022056474181380L, (long)var2_2);
                }
            }
            v59 = new Object[1];
            v59[0] = var20_11;
            d7.d("\u00ec", (Object)v53, (Object)v59, (long)-1180923080696044828L, (long)var2_2);
        }
        return var25_15;
    }

    /*
     * Exception decompiling
     */
    private void m(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 21[SWITCH]
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

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (y[n3] != null) {
            return n3;
        }
        Object object = x[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 42;
            case 1 -> 34;
            case 2 -> 8;
            case 3 -> 20;
            case 4 -> 55;
            case 5 -> 33;
            case 6 -> 46;
            case 7 -> 29;
            case 8 -> 61;
            case 9 -> 50;
            case 10 -> 43;
            case 11 -> 11;
            case 12 -> 40;
            case 13 -> 19;
            case 14 -> 47;
            case 15 -> 0;
            case 16 -> 41;
            case 17 -> 22;
            case 18 -> 24;
            case 19 -> 39;
            case 20 -> 36;
            case 21 -> 1;
            case 22 -> 9;
            case 23 -> 12;
            case 24 -> 23;
            case 25 -> 62;
            case 26 -> 5;
            case 27 -> 2;
            case 28 -> 10;
            case 29 -> 15;
            case 30 -> 63;
            case 31 -> 21;
            case 32 -> 13;
            case 33 -> 45;
            case 34 -> 35;
            case 35 -> 60;
            case 36 -> 58;
            case 37 -> 3;
            case 38 -> 37;
            case 39 -> 6;
            case 40 -> 18;
            case 41 -> 51;
            case 42 -> 57;
            case 43 -> 4;
            case 44 -> 59;
            case 45 -> 28;
            case 46 -> 17;
            case 47 -> 7;
            case 48 -> 16;
            case 49 -> 56;
            case 50 -> 25;
            case 51 -> 32;
            case 52 -> 53;
            case 53 -> 31;
            case 54 -> 44;
            case 55 -> 48;
            case 56 -> 52;
            case 57 -> 54;
            case 58 -> 49;
            case 59 -> 30;
            case 60 -> 14;
            case 61 -> 26;
            case 62 -> 27;
            default -> 38;
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
        d7.y[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d7.m(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            String string = y[n];
            int n2 = string.indexOf(8);
            Class clazz = d7.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d7.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d7.g(clazz3, string2, clazz2)) != null) {
                    d7.x[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d7.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d7.x[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d7.n(1898342378395622L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void o(Object[] objectArray) {
        d7 d72;
        long l;
        long l2;
        block12: {
            block13: {
                Object object;
                long l3;
                block14: {
                    l2 = (Long)objectArray[0];
                    long l4 = l2 = q ^ l2;
                    l3 = l4 ^ 0xAD0813A45F7L;
                    l = l4 ^ 0x398EFF8179D8L;
                    CallSite callSite = d7.d("\u00aa", (long)-6944851359655816366L, (long)l2);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            d72 = this;
                                            if (callSite != null) break block12;
                                            if (d7.d("\u00ec", (Object)((Boolean)((Object)d7.d("\u00ec", (Object)d72.e, (long)-6945960412222954935L, (long)l2))), (long)-6946273996018505804L, (long)l2) == false) break block13;
                                        }
                                        catch (MatchException matchException) {
                                            throw d7.d("\u00aa", (Object)matchException, (long)-6943057581753438011L, (long)l2);
                                        }
                                        d72 = this;
                                        if (callSite != null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw d7.d("\u00aa", (Object)matchException, (long)-6943057581753438011L, (long)l2);
                                    }
                                    if (d72.l == -1) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw d7.d("\u00aa", (Object)matchException, (long)-6943057581753438011L, (long)l2);
                                }
                                object = d7.d("\u00ec", (Object)d7.d("\u00f1", (long)-6942646029161169244L, (long)l2), (Object)new Object[0], (long)-6943371721567956390L, (long)l2);
                                if (callSite != null) break block14;
                            }
                            catch (MatchException matchException) {
                                throw d7.d("\u00aa", (Object)matchException, (long)-6943057581753438011L, (long)l2);
                            }
                            if (object != false) break block13;
                        }
                        catch (MatchException matchException) {
                            throw d7.d("\u00aa", (Object)matchException, (long)-6943057581753438011L, (long)l2);
                        }
                        object = this.l;
                    }
                    catch (MatchException matchException) {
                        throw d7.d("\u00aa", (Object)matchException, (long)-6943057581753438011L, (long)l2);
                    }
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = (int)object;
                d7.d("\u00aa", (Object)objectArray2, (long)-6942709968438822391L, (long)l2);
                this.l = -1;
            }
            d72 = this;
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l;
        d7.d("\u00ec", (Object)d72, (Object)objectArray3, (long)-6947951118199411827L, (long)l2);
    }

    private static Method p(long l, long l2) {
        int n = d7.m(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = y[n];
                int n3 = string2.indexOf(8);
                clazz3 = d7.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d7.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d7.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d7.x[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d7.n(1898342378395622L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d7.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d7.x[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d7.n(1898342378395622L, 0L);
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

    private void k(Object[] objectArray) {
        block5: {
            f5 f52;
            long l;
            long l2;
            block4: {
                String string = (String)objectArray[0];
                l2 = (Long)objectArray[1];
                long l3 = l2 = q ^ l2;
                long l4 = l3 ^ 0x1A26000CDC31L;
                l = l3 ^ 0x2A26BA7F59A8L;
                long l5 = l3 ^ 0x7D72E3386139L;
                CallSite callSite = d7.d("\u00aa", (long)5056339090522131175L, (long)l2);
                try {
                    try {
                        f52 = this.p;
                        if (callSite != null) break block4;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l5;
                        objectArray2[0] = Float.valueOf(3000.0f);
                        if (d7.d("\u00ec", (Object)f52, (Object)objectArray2, (long)5054942729832963307L, (long)l2) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d7.d("\u00aa", (Object)matchException, (long)5048563827351562608L, (long)l2);
                    }
                    Object[] objectArray3 = new Object[4];
                    objectArray3[3] = l4;
                    objectArray3[2] = x_0.INFO;
                    objectArray3[1] = string;
                    objectArray3[0] = this;
                    d7.d("\u00aa", (Object)objectArray3, (long)5056725212658137663L, (long)l2);
                    f52 = this.p;
                }
                catch (MatchException matchException) {
                    throw d7.d("\u00aa", (Object)matchException, (long)5048563827351562608L, (long)l2);
                }
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l;
            d7.d("\u00ec", (Object)f52, (Object)objectArray4, (long)5050333178630180480L, (long)l2);
        }
    }

    private boolean g(Object[] objectArray) {
        int n;
        block17: {
            long l;
            long l2;
            class_1792 class_17922;
            block18: {
                CallSite callSite;
                long l3;
                long l4;
                long l5;
                block16: {
                    Object object;
                    block15: {
                        block13: {
                            block14: {
                                class_17922 = (class_1792)objectArray[0];
                                l2 = (Long)objectArray[1];
                                long l6 = l2 = q ^ l2;
                                l5 = l6 ^ 0x5DFEC69819B7L;
                                l4 = l6 ^ 0x1D5C4860CF05L;
                                long l7 = l6 ^ 0x5CE984896AFFL;
                                l3 = l6 ^ 0x1E5A4A895C19L;
                                l = l6 ^ 0x5512DB94A95EL;
                                callSite = d7.d("\u00aa", (long)-6287128591664962445L, (long)l2);
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l7;
                                        objectArray2[0] = class_17922;
                                        object = d7.d("\u00aa", (Object)objectArray2, (long)-6288197596922190584L, (long)l2);
                                        if (callSite != null) break block13;
                                        if (object == false) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw d7.d("\u00aa", (Object)matchException, (long)-6303911058108528668L, (long)l2);
                                    }
                                    return true;
                                }
                                catch (MatchException matchException) {
                                    throw d7.d("\u00aa", (Object)matchException, (long)-6303911058108528668L, (long)l2);
                                }
                            }
                            object = d7.d("\u00ec", (String)((Object)d7.d("\u00ec", (Object)this.d, (long)-6288236265136564888L, (long)l2)), (Object)d7.b("g", (int)8464, (long)(0x676BC8E3D61B1077L ^ l2)), (long)-6287733235020488293L, (long)l2);
                        }
                        try {
                            if (callSite != null) break block15;
                            if (object != false) break block16;
                        }
                        catch (MatchException matchException) {
                            throw d7.d("\u00aa", (Object)matchException, (long)-6303911058108528668L, (long)l2);
                        }
                        object = 0;
                    }
                    return (boolean)object;
                }
                try {
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l5;
                    objectArray3[0] = class_17922;
                    if (d7.d("\u00aa", (Object)objectArray3, (long)-6303351600418096913L, (long)l2) == null) {
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l3;
                        d7.d("\u00ec", (Object)this, (Object)objectArray4, (long)-6290071230283035093L, (long)l2);
                        return false;
                    }
                }
                catch (MatchException matchException) {
                    throw d7.d("\u00aa", (Object)matchException, (long)-6303911058108528668L, (long)l2);
                }
                try {
                    try {
                        n = this.l;
                        if (callSite != null) break block17;
                        if (n != -1) break block18;
                    }
                    catch (MatchException matchException) {
                        throw d7.d("\u00aa", (Object)matchException, (long)-6303911058108528668L, (long)l2);
                    }
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l4;
                    this.l = (int)d7.d("\u00aa", (Object)objectArray5, (long)-6303326601986508780L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw d7.d("\u00aa", (Object)matchException, (long)-6303911058108528668L, (long)l2);
                }
            }
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l;
            objectArray6[0] = class_17922;
            d7.d("\u00aa", (Object)objectArray6, (long)-6304531730902491614L, (long)l2);
            n = 0;
        }
        return n != 0;
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void j(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = q ^ l;
        long l3 = l2 ^ 0x15B5B19292FDL;
        long l4 = l2 ^ 0x734C2496C381L;
        this.i = b_0.IDLE;
        this.j = null;
        this.k = null;
        this.m = 0;
        this.n = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        d7.d("\u00ec", (Object)this.o, (Object)objectArray2, (long)-8267662409507617323L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        d7.d("\u00ec", (Object)this.c, (Object)objectArray3, (long)-8253744810282035878L, (long)l);
    }

    private boolean lambda$new$0(Boolean bl) {
        long l = q ^ 0x4E473045F840L;
        return (boolean)d7.d("\u00ec", (String)((Object)d7.d("\u00ec", (Object)this.d, (long)-7826470408537215311L, (long)l)), (Object)d7.b("g", (int)5426, (long)(0x5283C2DFEC09F8DL ^ l)), (long)-7826126816306161086L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(d7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(d7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


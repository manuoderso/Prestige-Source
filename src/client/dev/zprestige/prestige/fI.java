/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f8;
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
import net.minecraft.class_243;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fI
extends dV {
    private dM d;
    private dR a;
    private dP c;
    private dO e;
    private dM f;
    private dN g;
    private static bW h;
    private static final int i;
    private Map j;
    private List k;
    private static final long l;
    private static final String[] m;
    private static final String[] n;
    private static final Map o;
    private static final long[] p;
    private static final Integer[] q;
    private static final Map r;
    private static final Object[] s;
    private static final String[] t;

    public fI() {
        long l = fI.l ^ 0x4CE4B1B83A99L;
        long l2 = l ^ 0x228A9441E1FBL;
        this.j = new HashMap();
        this.k = new ArrayList();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        fI.d("\u00f1", (Object)this.g, (Object)objectArray, (long)1603718129897598238L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        fI.l = hc.a(-7606732212744704587L, 2296796238061534929L, MethodHandles.lookup().lookupClass()).a(97738334508532L);
                        fI.s = new Object[135];
                        fI.t = new String[135];
                        fI.f();
                        fI.o = new HashMap<K, V>(13);
                        var11 = fI.l ^ 131482446412355L;
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
                        var20_3 = new String[7];
                        var18_4 = 0;
                        var17_5 = "2o\u00f6\u00a8\u00d1\u00f1\u0007\u00bfm\u00b8\u0081\u0003\u00f9\u00e1\u00fa9\u0018\u0013\u001eq*\u00b4\u00dd\u008e#\u00a3\u00aa\u00b7:\u0089\u0001\u00bd\u0096\u00caU\u0081u\u00ab G) \u0087\u001c\u00e0\u00b2\\\u00efD!\u009f9w\u00b2\u00ef9\u0010\u00f8\u00ea\u00ed_\u00f3(\u0007\u0016\u00c6\u00cdf7\u00dc2M\u0013\u00e6@\u000fk#X\u00c2\u00abV\u00f2\u00db\u00b1\u00e6\u0098\u00ef\f\b\u00ed;\u000bP\u009b\u00d6I\u00fc\u009d ,z\u0010\u008b\u00cd\u00c2\u00fe<o\u00bc\f\u00a4\u00d3D\u00ab\u00f2w\u0089\u00f7\u00c9pL\u00cf\u00b8\u00ed\u00e7g\u0089\u00fd((zB\u00fe\u0006u\u0098\u0006\u0090\u0018\u00abvK'\u00e0#y[G\u00c0\u00aa\u00fc\u00bcX\u00c4xD\u00f63\u00a2\u001f\u00be\u0006\u0085";
                        var19_6 = "2o\u00f6\u00a8\u00d1\u00f1\u0007\u00bfm\u00b8\u0081\u0003\u00f9\u00e1\u00fa9\u0018\u0013\u001eq*\u00b4\u00dd\u008e#\u00a3\u00aa\u00b7:\u0089\u0001\u00bd\u0096\u00caU\u0081u\u00ab G) \u0087\u001c\u00e0\u00b2\\\u00efD!\u009f9w\u00b2\u00ef9\u0010\u00f8\u00ea\u00ed_\u00f3(\u0007\u0016\u00c6\u00cdf7\u00dc2M\u0013\u00e6@\u000fk#X\u00c2\u00abV\u00f2\u00db\u00b1\u00e6\u0098\u00ef\f\b\u00ed;\u000bP\u009b\u00d6I\u00fc\u009d ,z\u0010\u008b\u00cd\u00c2\u00fe<o\u00bc\f\u00a4\u00d3D\u00ab\u00f2w\u0089\u00f7\u00c9pL\u00cf\u00b8\u00ed\u00e7g\u0089\u00fd((zB\u00fe\u0006u\u0098\u0006\u0090\u0018\u00abvK'\u00e0#y[G\u00c0\u00aa\u00fc\u00bcX\u00c4xD\u00f63\u00a2\u001f\u00be\u0006\u0085".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = fI.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c2,X\u00e5\u009cb\u00c7O\u00bb\u00e6\u00d6\u00a0\u00e4\u00aa@\u00d3 ,\u00fc\u00bc\u008d\u009c\u009b\u0011 v\u00b6\"\u00f3\u00ccM\u0098\u00e5\u00b43 ;o\u00d7\u0019\u0097O\u00a7\u0083\u00ef\u009d\u00b4\u00ae\u00cb";
                            var19_6 = "\u00c2,X\u00e5\u009cb\u00c7O\u00bb\u00e6\u00d6\u00a0\u00e4\u00aa@\u00d3 ,\u00fc\u00bc\u008d\u009c\u009b\u0011 v\u00b6\"\u00f3\u00ccM\u0098\u00e5\u00b43 ;o\u00d7\u0019\u0097O\u00a7\u0083\u00ef\u009d\u00b4\u00ae\u00cb".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = fI.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                fI.m = var20_3;
                fI.n = new String[7];
                fI.r = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "M OZj9\u00ef\u0081a\u0099\u00eb\u0003\u00ecE\u0098\f\u0004\u001f\u00fa`\u00caqJ\u0085";
                var5_15 = "M OZj9\u00ef\u0081a\u0099\u00eb\u0003\u00ecE\u0098\f\u0004\u001f\u00fa`\u00caqJ\u0085".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        fI.p = var6_12;
        fI.q = new Integer[3];
        fI.i = (int)fI.c("m", (int)25833, (long)(var11 ^ 3600206755834992870L));
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fI.d("\u00f1", (Object)this.k, (long)3995017149127265071L, (long)l);
        fI.d("\u00f1", (Object)this.j, (long)3995106553975883348L, (long)l);
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

    private static float b(Object[] objectArray) {
        float f;
        float f10;
        block11: {
            float f11;
            long l;
            float f12;
            block9: {
                CallSite callSite;
                block10: {
                    f12 = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = fI.l ^ l;
                    callSite = fI.d("U", (long)1769500076299017798L, (long)l);
                    try {
                        try {
                            float f13 = f12 - 0.0f;
                            f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                            if (callSite != null) break block9;
                            if (f11 > 0) break block10;
                        }
                        catch (MatchException matchException) {
                            throw fI.d("U", (Object)matchException, (long)1769456758178288650L, (long)l);
                        }
                        return 0.0f;
                    }
                    catch (MatchException matchException) {
                        throw fI.d("U", (Object)matchException, (long)1769456758178288650L, (long)l);
                    }
                }
                try {
                    f10 = f12;
                    f = 1.0f;
                    if (callSite != null) break block11;
                    float f14 = f10 - f;
                    f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)1769456758178288650L, (long)l);
                }
            }
            try {
                if (f11 >= 0) {
                    return 1.0f;
                }
            }
            catch (MatchException matchException) {
                throw fI.d("U", (Object)matchException, (long)1769456758178288650L, (long)l);
            }
            f10 = f12 * f12 * f12;
            f = f12 * (f12 * 6.0f - 15.0f) + 10.0f;
        }
        return f10 * f;
    }

    private static Color b(Object[] objectArray) {
        int n;
        long l;
        long l2;
        float f;
        Color color;
        block6: {
            block7: {
                CallSite callSite;
                block4: {
                    float f10;
                    block5: {
                        color = (Color)objectArray[0];
                        f = ((Float)objectArray[1]).floatValue();
                        l2 = (Long)objectArray[2];
                        l = (l2 = fI.l ^ l2) ^ 0x2BF2637050A0L;
                        callSite = fI.d("U", (long)7021870918515042234L, (long)l2);
                        try {
                            float f11 = f - 0.0f;
                            n = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                            if (callSite != null) break block4;
                            if (n >= 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw fI.d("U", (Object)matchException, (long)7021792553230527990L, (long)l2);
                        }
                        f = 0.0f;
                    }
                    n = (f10 = f - 1.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                }
                try {
                    if (callSite != null) break block6;
                    if (n <= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)7021792553230527990L, (long)l2);
                }
                f = 1.0f;
            }
            n = (int)((float)fI.d("\u00f1", (Object)color, (long)7022039001162142652L, (long)l2) + (float)(fI.c("m", (int)19566, (long)(0x375EC1118EEA4789L ^ l2)) - fI.d("\u00f1", (Object)color, (long)7022039001162142652L, (long)l2)) * f);
        }
        float f12 = n;
        int n2 = (int)((float)fI.d("\u00f1", (Object)color, (long)7017903671768966006L, (long)l2) + (float)(fI.c("m", (int)18127, (long)(0x26B17DBBC459CD2AL ^ l2)) - fI.d("\u00f1", (Object)color, (long)7017903671768966006L, (long)l2)) * f);
        int n3 = (int)((float)fI.d("\u00f1", (Object)color, (long)7022649996225148335L, (long)l2) + (float)(fI.c("m", (int)18127, (long)(0x26B17DBBC459CD2AL ^ l2)) - fI.d("\u00f1", (Object)color, (long)7022649996225148335L, (long)l2)) * f);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = (int)f12;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = n2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = n3;
        return new Color((int)fI.d("U", (Object)objectArray2, (long)7021274117651201305L, (long)l2), (int)fI.d("U", (Object)objectArray3, (long)7021274117651201305L, (long)l2), (int)fI.d("U", (Object)objectArray4, (long)7021274117651201305L, (long)l2), (int)fI.d("\u00f1", (Object)color, (long)7022879292590903770L, (long)l2));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fI.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x20B3;
        if (fI.n[n2] == null) {
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
                throw new RuntimeException("dev/zprestige/prestige/fI", exception);
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
            fI.n[n2] = fI.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return fI.n[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fI.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Color c(Object[] objectArray) {
        float f;
        float f10;
        long l;
        long l2;
        float f11;
        Color color;
        Color color2;
        block7: {
            float f12;
            block5: {
                CallSite callSite;
                block6: {
                    color2 = (Color)objectArray[0];
                    color = (Color)objectArray[1];
                    f11 = ((Float)objectArray[2]).floatValue();
                    l2 = (Long)objectArray[3];
                    l = (l2 = fI.l ^ l2) ^ 0x57AB8BEE4315L;
                    callSite = fI.d("U", (long)8270805999730963471L, (long)l2);
                    try {
                        float f13 = f11 - 0.0f;
                        f12 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                        if (callSite != null) break block5;
                        if (f12 >= 0) break block6;
                    }
                    catch (MatchException matchException) {
                        throw fI.d("U", (Object)matchException, (long)8270604830865096259L, (long)l2);
                    }
                    f11 = 0.0f;
                }
                try {
                    f10 = f11;
                    f = 1.0f;
                    if (callSite != null) break block7;
                    float f14 = f10 - f;
                    f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)8270604830865096259L, (long)l2);
                }
            }
            if (f12 > 0) {
                f11 = 1.0f;
            }
            f10 = 1.0f;
            f = f11;
        }
        float f15 = f10 - f;
        int n = (int)((float)fI.d("\u00f1", (Object)color2, (long)8270358365816438793L, (long)l2) * f15 + (float)fI.d("\u00f1", (Object)color, (long)8270358365816438793L, (long)l2) * f11);
        int n2 = (int)((float)fI.d("\u00f1", (Object)color2, (long)8273647346670956739L, (long)l2) * f15 + (float)fI.d("\u00f1", (Object)color, (long)8273647346670956739L, (long)l2) * f11);
        int n3 = (int)((float)fI.d("\u00f1", (Object)color2, (long)8268620663367656986L, (long)l2) * f15 + (float)fI.d("\u00f1", (Object)color, (long)8268620663367656986L, (long)l2) * f11);
        int n4 = (int)((float)fI.d("\u00f1", (Object)color2, (long)8269519140080697967L, (long)l2) * f15 + (float)fI.d("\u00f1", (Object)color, (long)8269519140080697967L, (long)l2) * f11);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = n;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = n2;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l;
        objectArray4[0] = n3;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l;
        objectArray5[0] = n4;
        return new Color((int)fI.d("U", (Object)objectArray2, (long)8270279924378529452L, (long)l2), (int)fI.d("U", (Object)objectArray3, (long)8270279924378529452L, (long)l2), (int)fI.d("U", (Object)objectArray4, (long)8270279924378529452L, (long)l2), (int)fI.d("U", (Object)objectArray5, (long)8270279924378529452L, (long)l2));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A8D;
        if (q[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fI.q[n2] = n3;
        }
        return q[n2];
    }

    private static float c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return 1.0f - (1.0f - f) * (1.0f - f);
    }

    private static void n(Object[] objectArray) {
        block5: {
            Object object;
            block4: {
                long l = (Long)objectArray[0];
                long l2 = (l = fI.l ^ l) ^ 0x7EE8EF79C154L;
                CallSite callSite = fI.d("U", (long)4286203708870786483L, (long)l);
                try {
                    try {
                        object = h;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fI.d("U", (Object)matchException, (long)4286159013982353407L, (long)l);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = fI.b("q", (int)12248, (long)(0x34FEDDBC4D92340BL ^ l));
                    object = fI.d("U", (Object)objectArray2, (long)4282958535226434141L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)4286159013982353407L, (long)l);
                }
            }
            h = object;
        }
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fI.m(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                fI.s[n] = clazz = Class.forName(t[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fI.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fI.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fI.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fI.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = s;
        s[0] = "J\u001f@Es\tJ\u001fW\u0019\u007f\u0006PTW\u0007\u007f\u0013W%\u0006_-";
        objectArray[1] = Double.TYPE;
        fI.t[1] = "java/lang/Double";
        objectArray[2] = "48c0\u0010b\"8fj\u0003u5sel\u000fa$4r{Dt\u0019";
        objectArray[3] = "\u007f(]r\u000e\u0011\n\bV}\u001f^k\u0006]v\u001b\u0004\u001f";
        objectArray[4] = "p\u0000\n5F\u0013m\u0015R\u0017\u0007\u001eu\u0013";
        objectArray[5] = "uq!ctlcq$9g{t:'?koe}0( xP";
        objectArray[6] = "9%\u0000\fU=L\u0005\u000b\u0003Dr-\u000b\u0000\b@(Y";
        objectArray[7] = Void.TYPE;
        fI.t[7] = "java/lang/Void";
        objectArray[8] = "toA6=/\u0001OJ9,``AA2(:\u0014";
        objectArray[9] = Float.TYPE;
        fI.t[9] = "java/lang/Float";
        objectArray[10] = "\u0005\u007fMX%`\u000ep\\\u0017Fm\u001b}S|so\nnOPdb";
        objectArray[11] = "\u0010\u0012Q`yA\u0006\u0012T:jV\u0011YW<fB\u0000\u001e@+-P<";
        objectArray[12] = "\u0015\u0004\u0014gFU`$\u001fhW\u001a\u001d<\fo^Su";
        objectArray[13] = "AN\"+\u007fmAN5wsb[\u00055isw\\tg3'3";
        objectArray[14] = "\u0015DS'\u0005\"\u0015DD{\t-\u000f\u000fDe\t8\b~\u00148X";
        objectArray[15] = "_nn'\\\u0016_ny{P\u0019E%yeP\fBT-=\u0007";
        objectArray[16] = "A\f9i:gA\f.56h[G.+6}\\6{to";
        objectArray[17] = "\nd\u0010]U\b\u0014l\n\u00127\u0014\u0013q";
        objectArray[18] = "N\u0005I\rPgE\nXB7eP\u0001X\t\f";
        objectArray[19] = Integer.TYPE;
        fI.t[19] = "java/lang/Integer";
        objectArray[20] = "/%wH\u0018-1-m\u0007{95";
        objectArray[21] = "S\u0017q\u0010[PX\u0018`_:^S\u0013d\u0005";
        objectArray[22] = "\u0012&\u000ej4~\f.\u0014%In\f";
        objectArray[23] = ":\u0019C&8\"$\u0011Yi_#5\nT3y%";
        objectArray[24] = Boolean.TYPE;
        fI.t[24] = "java/lang/Boolean";
        objectArray[25] = "|`8\u0006\u0018Uwo)IeMdh \u0000";
        objectArray[26] = "<zX0\u001ch7uI\u007f\u007fe\"s";
        objectArray[27] = "\u0003+`}0f\u001d#z2]|\u0005&s\u007fjz\u0006$";
        objectArray[28] = ")&\u0000V\u0015*\")\u0011\u0019y),+\u0013VU";
        objectArray[29] = "\u000b\u0013\u0018\\B\u0019\u001d\u0013\u001d\u0006Q\u000e\nX\u001e\u0000]\u001a\u001b\u001f\t\u0017\u0016\r$";
        objectArray[30] = "\u0015lu\u0016\u00053\u0017r<n\n?\u000eq`\u000b\u000b";
        objectArray[31] = "{\u0019r\f\r^m\u0019wV\u001eIzRtP\u0012]k\u0015cGYJo";
        objectArray[32] = "\u0005dmyDwpDfvU8\u0011Jm}Qbe";
        objectArray[33] = "x&\r%0\u007f\r\u0006\u0006*!0l\b\r!%j\u0018";
        objectArray[34] = "=dP$Px?z\u0019G[c \u007fO>\\";
        objectArray[35] = "*K\u000eA\u00189<K\u000b\u001b\u000b.+\u0000\b\u001d\u0007::G\u001f\nL-\"";
        objectArray[36] = "\u0014/\u00100c!a\u000f\u001b?rn\u0000\u0001\u00104v4t";
        objectArray[37] = "BQ\u0006F9*7q\rI(eV\u007f\u0006B,?\"";
        objectArray[38] = ",`\u0019V\u001bs:`\u001c\f\bd-+\u001f\n\u0004p<l\b\u001dOg%";
        objectArray[39] = "VRSr`j#rX}q%B|Svu\u007f6";
        objectArray[40] = "\u0003pe\fmn\u0015p`V~y\u0002;cPrm\u0013|tG9|0";
        objectArray[41] = "Oh\u0013'|\u0012Oh\u0004{p\u001dU#\u0004ep\bRRS8)O";
        objectArray[42] = "M]^\\@$[][\u0006S3L\u0016X\u0000_']QO\u0017\u00143b";
        objectArray[43] = "z\u0003\u0013\u0013@Kl\u0003\u0016IS\\{H\u0015O_Hj\u000f\u0002X\u0014_P";
        objectArray[44] = "G8\u007f}K<2\u0018trZsS\u0016\u007fy^)'";
        objectArray[45] = "|\u0011{\u0015el\t1p\u001at#h?{\u0011py\u001c";
        objectArray[46] = "A&0]\u001e\u0007W&5\u0007\r\u0010@m6\u0001\u0001\u0004Q*!\u0016J\u0016`";
        objectArray[47] = ")G{O5x\\gp@$7=i{K mI";
        objectArray[48] = "mDs^tp\u0018dxQe?yjsZae\r";
        objectArray[49] = "IiI\b[\u001f<IB\u0007JP]GI\fN\n)";
        objectArray[50] = "k}P\u0002Z?\u001e][\rKp\u007fSP\u0006O*\u000b";
        objectArray[51] = "\u001dot=g2hO\u007f2v}\tAt9r'}";
        objectArray[52] = "q=\rRGz\u0004\u001d\u0006]V5e\u0013\rVRo\u0011";
        objectArray[53] = "\u0017\u0002}x1\u001c\u001c\rl7Y\u001c\u0012\u0002\u007f";
        objectArray[54] = "0w\u001d~^Z;x\f1#O)b\u000er";
        objectArray[55] = Long.TYPE;
        fI.t[55] = "java/lang/Long";
        objectArray[56] = "6?ne~.(7t*6.2=lm?5r\u000eja42??la";
        objectArray[57] = "\fc)\u0001{dyC\"\u000ej+\u0018M)\u0005nql";
        objectArray[58] = "J?\"{\u00178O7?o}j\u001d2\u0015m\u0010h\u0016N6pF}\u000e\"'zF{p";
        objectArray[59] = "\u0016WF&\u0012)\u001d\u000e_-/vJ\u0017ApCD\u001cU\u001d*\u0013\u0013\u0019\u0010\u001cnAjH\u0013\u0010o/";
        objectArray[60] = "G\f9D\u0011iU\u000fyWugO_-U\"0\u0011\bu9\u001cp\u0010\b&Z\u00157\u0015I";
        objectArray[61] = "\u001f;b]ei\u001a3\u007fI\u000f8L0y\\uT\u001f;b]ei\u001a3\u007fI\u000f";
        objectArray[62] = "*NX\u0000\u0015t;M\u0005\fzu<QT\f\u0016Gh\u001c\u000fQK\u0010oV\t\u0012\u0014i>U\u0005\u0013z";
        objectArray[63] = "\u0001%\u001fkZ\u0011\\2I8a\u0005e1\u001ai\\\u0019\u0005y\u00178";
        objectArray[64] = "q]@\t#9dXS\u0002BysBPT\u0005i\u001aJJ\u0002:yv[@\u0002<\u0007q]@\t#9dXS\u0002B";
        objectArray[65] = "O#P~X\rZ8Nj<\u0012_55u\u0002\tM6WfU\u000fDI[%_\u0005]+HrY\f\"'\u000bxS\u0015@4\\~Zj";
        objectArray[66] = "*F\u007fAg\b?]aU\u0003\u0000*P\u001aJ=\f(SxYj\n!,t\u001a`\u00008NgMf\tG";
        objectArray[67] = "\f\tU\u0011\"\t_\u0016\u0012\nLR5M\u0010\u0014<^\rO\u0010\trF5I\u001b\u0016qWZ\u0010@Ju4";
        objectArray[68] = ",jGwxS9qYc\u001cW,qy\u007f`4/gEye\t1oNj\u001c";
        objectArray[69] = "j\tw\u0018\u00005lV#@|,fY(\u001c|iv\r5\u001f\u00058u\u00014q\u001bn6Y0\u0013\u001d1b\u0001L";
        objectArray[70] = "3JG~d\u007f`U\u0000e\n&\n\u000e\u0002{z(2\f\u0002f40\n\n\ty7!eSR%3B";
        objectArray[71] = "HC~[\\\u000b\u001b\\9@2Uq\u0007;^B\\I\u0005;C\fDq\u00030\\\u000fU\u001eZk\u0000\u000b6";
        objectArray[72] = "\\\u0014o\u001aC~]\u0013}\u0005.!Z\u0001[\u0017^=3\u0015e\n\u001e$\n\u0014pAWA";
        objectArray[73] = "QH\u001dd1.P^\rZ!-QS\n\rvw\u0001\u000ef##'\u0001[\u0006k.v";
        objectArray[74] = "H\u001eKaRLI\b[_ICY\u0001W3{\u0017\u001dZ\t_UBN\\\\?\u001dO\u001faI3G\u0013I\u0001\u0001>\u0016.\\\r[b@N\u0014\u0000\n_AQ^_N=@GNa";
        objectArray[75] = "5R\u0003L\u0015^3\rW\u0014i@(\u0002^^\rU.\u00068\u001b\u0012\u0001+\u0005AJ\u0011\r*k\u0006^TE<\u0012W]XDRUC\u0018\u0010R+\u0004@\u0014\u0011<5R\u0003L\u0015^3\rW\u0014i";
        objectArray[76] = "=g!Urz!zrJ\noD tEzl|\"tX4tDbv\u001d699}2Jr\u0006";
        objectArray[77] = "\u0017\u0004\u0018wl%\u001c]\u0001|QzKD\u001f!=H\u001c\u0003D\u007fn\u001f_T\u0014{=\u007f\u0017YEF";
        objectArray[78] = "_K2x\u001e\u000f[V>kx\u001e;\u0016ev\b\u001d\u0003\u0014ekF\u0005;K3~\u0011L_\u0016$(Bw";
        objectArray[79] = "n\u0004*^D@k\f7J.\u0017.\u0014=RR\u0010.uhCV\u0011>HmKK\u0005T";
        objectArray[80] = "\u0013\u001fMHI\u007f\u0016\u001ePO7r\u001cH\\\r7$HF\b\u0014X}\u0013\u001a\fw";
        objectArray[81] = "#T.iYk6O0}=g*S\"v=1~]voRh%\u0001r\f";
        objectArray[82] = "B\\x\f\u001d4L\u001c Q'#GJ}\u0004N/~D}\u0014JIOUiYBpN@\"\u0010'";
        objectArray[83] = ";9+[\u0014!h&l@zv\u0002}n^\nv:\u007fnCDn\u0002~$G\u0016v?{,Z\u0002\u001c";
        objectArray[84] = "s(P\u001aNw*)P\b$vkmPh]ay*@\b\u0015l(\u0017U\u0004O0~w\u001d\t\u001e\r";
        objectArray[85] = "R%<.|4\u0013/ b\u001c5igjsl1Qejn\")icaq!8\u0006::-%[";
        objectArray[86] = "$sN\u001c`lwl\t\u0007\u000e:\u001d7\u000b\u0019~;%5\u000b\u00040#\u001d0KEw?daHIvQ";
        objectArray[87] = "UF[5\u0014\u0000^\u001fB>)_\t\u0006\\cEm^A\u0007>\u0010:\u001d\u0016W9EZU\u001b\u0006\u0004";
        objectArray[88] = "AhPg4x\u001c\u007f\u00064\u000fn%|Ue2pE4X4";
        objectArray[89] = "E7:0WEJ9;/nH&4a=\u0001^D'6;\b!";
        objectArray[90] = "\tzy?m~P{y-\u0007\u007f\t#\u00054koU)e|f>h<i&:h\btdw\u0007";
        objectArray[91] = "5\u0006*3@n>_38}1iF-e\u0011\u00039\u0004w2}8c\u00015|\u0011)i\u00013\u0002";
        objectArray[92] = "P%\r=\u0001\u0000Ay\bh~\u0007I?\u000b3\u0005j^|\u00018\u0001\bM+\u00071~\u0005H2R2G\u0004]y\u001bW";
        objectArray[93] = "4\u0007Zzt+5Y\u0004#/Bf@\u0018a&$qa\u0003~&\u0007lY\u0006z0B4\u0007^a6+g\u0004\u0000{7B";
        objectArray[94] = "\u0013hRnx\u001eJiR|\u0012\u0001\u00131.pu_\n)Ba\u007f_\fWB{)\u001c\f;Sq)\u001ar;I'j\u001a\u001e*C'ld";
        objectArray[95] = "t]]S\u0016()J\u000b\u0000-=\u0010IXQ\u0010 p\u0001U\u0000";
        objectArray[96] = "N\ruGk\u0002O\u001beyp\r_\u0012i\u0015BY\u001bH7yl\fHOb\u0019$\u0001\u0019rc\u0006n^]\u0010b\u0010~`";
        objectArray[97] = "?'hBc=l8/Y\ri\u0006dfTwjg1lC7\u00008*d\\gam s\u001c\r";
        objectArray[98] = ">PG~j?y^\u001d%\u0001.\u0001\u0007\u0018)8>|I\u001fgfD";
        objectArray[99] = "D\u0010\t\n=[\b\u001a^\u0014YC9FY\u0019)@\u0001DY\u0004gX9\u0002\r\u0013+NHN\u0007D5*";
        objectArray[100] = "\u0013\b'.D,\u0001Sr7{v\u0014E}(\u0017D@\t!rE\u0013\u0012\u0003ep\u0005u\u0017\u0002xw{";
        objectArray[101] = "F^\u0000\u001fR\u0014CV\u001d\u000b8F\u0011S\"\u001eT)\u0010HC\u000bFE\u0001BC\r8";
        objectArray[102] = "rR#6Dn`Qc% `z\u00017'w7%\\lKJ?!\rltXdt\u0014";
        objectArray[103] = "\ns\u0010O\"'Sr\u0010]H8\u0002<lQ/f\u00132\u0000@%f\u0015L\u0000Zs%\u0015 \u0011Ps#k \u000b\u00060#\u00071\u0001\u00066]";
        objectArray[104] = "\u000ft\u0017\u0010\u000b~HvK\u0003n/p/K\u001f\u001e)H-K\u0002P1p,\u0001\u0006\u0002)M)\t\u001b\u0016C";
        objectArray[105] = "Fq \u0014K1Wr}\u0018$0Pn,\u0018H\u0002\u0004#wD\u001cU\u0003iq\u0006J,Rj}\u0007$";
        objectArray[106] = ">Md\u0015semR#\u000e\u001d1\u0007\t!\u0010m2?\u000b!\r#*\u0007\\}Je&kMwJcX";
        objectArray[107] = "VgL0\u0011`\u0005x\u000b+\u007f8o#\t5\u000f7W!\t(A/o'\u00027B>\u0000~YkF]";
        objectArray[108] = "}\u001fT?\u001e\rlCQja\u0007t\u0003[\u001e\u0006\u000bpxW2Z\u001fc\u0014F8Z\u0019\u001d";
        objectArray[109] = ".\bg:Fm%Q~1{2rH`l\u0017\u0000%\u000f;2KWfXk6\u00177.U:\u000b";
        objectArray[110] = "X\u0015Q\u0003a\u001d\u0001\u0014Q\u0011\u000b\f^Q-\bg\f\u0004FM@j]9SA\u001a6\u000bY\u001bLK\u000b";
        objectArray[111] = "dpN9`'aqS>\u001e t\u0007S~b0\u000f%Nv.$6$[=gA";
        objectArray[112] = "z\u0019\r\u0004i\n|FY\\\u0015\u0012z\\_\u0011x8\u001d\u001eMPl\u0006dON\\mhz\u0019\r\u0004i\n|FY\\\u0015";
        objectArray[113] = "@?W\u000f@DE7J\u001b*\u0016\u00172f\u0007R\u0019\u0013NC\u0004\u0011\u0001\u0004\"R\u000e\u0011\u0007z";
        objectArray[114] = ";qV\u0007g\u0013bpV\u0015\r\u00133(F\u0012hi#\"AHa\tk/\u0010u";
        objectArray[115] = "+9F0s\u0003*>T/\u001eZ)'HPp\u0002'8K2cU!14";
        objectArray[116] = "\u0005n?,\u007fU\\o?>\u0015S\u0003\u000b*2tF\u0002*C'yDY=#ot\u0015d(/5(C\u0004`\"d\u0015";
        objectArray[117] = "\u0014GxKhMGX?P\u0006\u001b-\u0003=Nv\u001a\u0015\u0001=S8\u0002-\u0000wWj\u001a\u0010\u0005\u007fJ~p";
        objectArray[118] = "HSG\u0017'AIEW)7BHHP~`\u0018\u0018\u0014<P5H\u0018@\\\u00188\u0019";
        objectArray[119] = "JHuHNMT@~[7\nIS{BQ9@K\u0012BL\u0001\u001a\u0014hBXIU/}[G@A\u0016|N\f\t$";
        objectArray[120] = "\u000b\fT2C<\u001e\tG9\"c\u0006\u000bgkF\u007f\rwUe\u0019z\u001e\u001bDo\u0019|`";
        objectArray[121] = "\u0006c\u0010\n0OU|W\u0011^\u0018?'U\u000f.\u0018\u0007%U\u0012`\u0000? \u0015S'\u001cFq\u0016_&r";
        objectArray[122] = "\u000b8=:f\n\u000e9 =\u0018\u0005\fnEk&\u000f\u000f}'xq\t\u0006\u0002*}h\\\u0005;+h#\u0015`";
        objectArray[123] = "D6N\u001a3@OoW\u0011\u000e\u001f\u0018vILb-O6\u0019\u0011>z\u001arY\u001bkC\u001bg\u0012R\u000e";
        objectArray[124] = "Q \u0006.G]\u0002?A5)\thdC+Y\nPfC6\u0017\u0012hg\t2E\nUb\u0001/Q`";
        objectArray[125] = "&\u0012P\u0003|\u000f#\u001aM\u0017\u0016]q\u001fb\u000bk_\u001c\u000fOTnLp\u001eETh2";
        objectArray[126] = "~_c<Go=Fbx&<I8|aJ=m\\mb\u00171\u0002";
        objectArray[127] = "\u0017\u000fPi_4D\u0010\u0017r1k.K\u0015lAc\u0016I\u0015q\u000f{.O\u001en\fjA\u0016E2\b\t";
        objectArray[128] = "*)Cix\u0000/(^n\u0006\u0007=~A?z\u0001;\u0013T8t\u0006,,U?f\u0019A";
        objectArray[129] = "0x\u00005=g.p\u000b&D32sg0z91`\u0005#-?8\u001f\b&4j;&\t3\u007f#^";
        objectArray[130] = "\u001dk\u0010E]\u0002\u001b4D\u001d!\u001a\u001d.BPL1zlP\u0011X\u000e\u0003=S\u001dY`\u001dk\u0010E]\u0002\u001b4D\u001d!";
        objectArray[131] = ";gog\t\u0004{?:>[~l:4h\u0016 k:.lj@yc*o\u0013\u0011zo+\u0001";
        objectArray[132] = "'\u001d}d7\u001e&\u000bmZ'\u001d'\u0006j\rpGwX\u0006#%\u0017w\u000efk(F";
        objectArray[133] = "\u001dg^\u0012/,\u0017>Z\u0012Iwz9\u0000\u00119xB;\u0000\fw`z=\u000b\u0013tq\u0015dPOp\u0012";
        Object[] objectArray2 = objectArray;
        objectArray[134] = "\"O5m%\u001b'N(j[\u0007$\u0010*,6<'uth%\u000f(\u001a.-0\u0012pu\"*+M,L#?`\u0004I";
    }

    private void l(Object[] objectArray) {
        bt_0 bt_02 = (bt_0)objectArray[0];
        f8 f82 = (f8)objectArray[1];
        Color color = (Color)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        long l = (Long)objectArray[6];
        long l2 = l = fI.l ^ l;
        long l3 = l2 ^ 0x4D1ECA1BDDCEL;
        long l4 = l2 ^ 0x2D7410CDCC5CL;
        long l5 = l2 ^ 0x14602A073115L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        fI.d("U", (Object)objectArray2, (long)2785159363074396497L, (long)l);
        float f12 = (float)f82.c * f11 / 50.0f;
        CallSite callSite = fI.d("\u00f1", (Object)f82.g, (double)f12, (long)2787234199844239537L, (long)l);
        double d = 9.0E-4 * (double)f12 * (double)f12;
        CallSite callSite2 = fI.d("\u00f1", (Object)f82.a, (double)fI.d("\u00a2", (Object)callSite, (long)2780695026186673813L, (long)l), (double)(fI.d("\u00a2", (Object)callSite, (long)2784445922972814305L, (long)l) - d + 0.05), (double)fI.d("\u00a2", (Object)callSite, (long)2786465796215825513L, (long)l), (long)2784558947067704337L, (long)l);
        float f13 = (1.6f - 0.5f * f11) * 2.5f * f10;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l3;
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = color;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l4;
        objectArray4[3] = fI.d("U", (Object)objectArray3, (long)2785827191430399665L, (long)l);
        objectArray4[2] = Float.valueOf(f13);
        objectArray4[1] = callSite2;
        objectArray4[0] = bt_02;
        fI.d("\u00f1", (Object)this, (Object)objectArray4, (long)2786862364816664780L, (long)l);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a2' || c == '\u00ca' || c == 'Z' || c == '\u00ba') {
                field = fI.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fI.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fI.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = fI.l ^ l;
        CallSite callSite = fI.d("U", (int)0, (int)fI.d("U", (int)fI.c("m", (int)18127, (long)(0x26B13130E6CD7BF8L ^ l)), (int)((int)((float)fI.d("\u00f1", (Object)color, (long)-2908187318076086520L, (long)l) * f)), (long)-2904874588919828328L, (long)l), (long)-2908864921335012030L, (long)l);
        return new Color((int)fI.d("\u00f1", (Object)color, (long)-2909035297496767122L, (long)l), (int)fI.d("\u00f1", (Object)color, (long)-2902896790256331356L, (long)l), (int)fI.d("\u00f1", (Object)color, (long)-2907290722066414723L, (long)l), (int)callSite);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bG var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 30[SWITCH]
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
    @bP
    public void a(bt_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 15[SWITCH]
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

    private static int a(Object[] objectArray) {
        Object object;
        block10: {
            int n;
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    block9: {
                        n = (Integer)objectArray[0];
                        l = (Long)objectArray[1];
                        l = fI.l ^ l;
                        callSite = fI.d("U", (long)2094907093138496474L, (long)l);
                        try {
                            try {
                                object = n;
                                if (callSite != null) break block8;
                                if (object >= 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fI.d("U", (Object)matchException, (long)2094811117103780246L, (long)l);
                            }
                            object = 0;
                            break block10;
                        }
                        catch (MatchException matchException) {
                            throw fI.d("U", (Object)matchException, (long)2094811117103780246L, (long)l);
                        }
                    }
                    object = n;
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object <= fI.c("m", (int)18127, (long)(0x26B15538BB12B14AL ^ l))) break block11;
                    }
                    catch (MatchException matchException) {
                        throw fI.d("U", (Object)matchException, (long)2094811117103780246L, (long)l);
                    }
                    object = fI.c("m", (int)18127, (long)(0x26B15538BB12B14AL ^ l));
                    break block10;
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)2094811117103780246L, (long)l);
                }
            }
            object = n;
        }
        return object;
    }

    private void m(Object[] objectArray) {
        bt_0 bt_02 = (bt_0)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = fI.l ^ l;
        long l3 = l2 ^ 0xA82B414CB72L;
        long l4 = l2 ^ 0x6C4AD5639735L;
        try {
            if (fI.d("\u00f1", (Object)color, (long)-4164022745277827430L, (long)l) <= 0) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw fI.d("U", (Object)matchException, (long)-4165187548084483402L, (long)l);
        }
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = (double)fI.d("\u00a2", (Object)class_2432, (long)-4163668127817759499L, (long)l);
        objectArray2[2] = (double)fI.d("\u00a2", (Object)class_2432, (long)-4163444997202203779L, (long)l);
        objectArray2[1] = (double)fI.d("\u00a2", (Object)class_2432, (long)-4176194331390263799L, (long)l);
        objectArray2[0] = bt_02.b;
        CallSite callSite = fI.d("U", (Object)objectArray2, (long)-4163105246252428263L, (long)l);
        Matrix4f matrix4f = new Matrix4f();
        fI.d("\u00f1", (Object)matrix4f, (float)((float)fI.d("\u00a2", (Object)callSite, (long)-4168665035779982048L, (long)l)), (float)((float)fI.d("\u00a2", (Object)callSite, (long)-4161893626712662278L, (long)l)), (float)((float)fI.d("\u00a2", (Object)callSite, (long)-4162426387439271498L, (long)l)), (long)-4163355199170950067L, (long)l);
        fI.d("\u00f1", (Object)matrix4f, (float)0.04f, (long)-4162619912357915970L, (long)l);
        fI.d("\u00f1", (Object)matrix4f, (float)((float)fI.d("U", (double)((double)(-fI.d("\u00f1", (Object)fI.d("\u00f1", (Object)bt_02.b, (long)-4164233656242475478L, (long)l), (long)-4165726317767890272L, (long)l))), (long)-4163841939703092664L, (long)l)), (long)-4176320307864904752L, (long)l);
        fI.d("\u00f1", (Object)matrix4f, (float)((float)fI.d("U", (double)((double)fI.d("\u00f1", (Object)fI.d("\u00f1", (Object)bt_02.b, (long)-4164233656242475478L, (long)l), (long)-4168769105607945628L, (long)l)), (long)-4163841939703092664L, (long)l)), (long)-4164075093229137702L, (long)l);
        Object[] objectArray3 = new Object[13];
        objectArray3[12] = l3;
        objectArray3[11] = Float.valueOf(0.0f);
        objectArray3[10] = color;
        objectArray3[9] = Float.valueOf(0.0f);
        objectArray3[8] = Float.valueOf(f);
        objectArray3[7] = Float.valueOf(f);
        objectArray3[6] = Float.valueOf(0.0f);
        objectArray3[5] = Float.valueOf(0.0f);
        objectArray3[4] = Float.valueOf(0.0f);
        objectArray3[3] = h;
        objectArray3[2] = matrix4f;
        objectArray3[1] = bt_02.b;
        objectArray3[0] = bt_02.a;
        fI.d("U", (Object)objectArray3, (long)-4176124170954104055L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (t[n3] != null) {
            return n3;
        }
        Object object = s[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 25;
            case 2 -> 38;
            case 3 -> 59;
            case 4 -> 31;
            case 5 -> 8;
            case 6 -> 48;
            case 7 -> 55;
            case 8 -> 17;
            case 9 -> 36;
            case 10 -> 26;
            case 11 -> 47;
            case 12 -> 46;
            case 13 -> 29;
            case 14 -> 16;
            case 15 -> 27;
            case 16 -> 6;
            case 17 -> 20;
            case 18 -> 58;
            case 19 -> 49;
            case 20 -> 30;
            case 21 -> 56;
            case 22 -> 11;
            case 23 -> 45;
            case 24 -> 10;
            case 25 -> 53;
            case 26 -> 63;
            case 27 -> 9;
            case 28 -> 28;
            case 29 -> 7;
            case 30 -> 19;
            case 31 -> 33;
            case 32 -> 62;
            case 33 -> 5;
            case 34 -> 39;
            case 35 -> 54;
            case 36 -> 1;
            case 37 -> 40;
            case 38 -> 3;
            case 39 -> 4;
            case 40 -> 21;
            case 41 -> 60;
            case 42 -> 34;
            case 43 -> 52;
            case 44 -> 0;
            case 45 -> 15;
            case 46 -> 18;
            case 47 -> 35;
            case 48 -> 37;
            case 49 -> 23;
            case 50 -> 51;
            case 51 -> 61;
            case 52 -> 32;
            case 53 -> 24;
            case 54 -> 42;
            case 55 -> 41;
            case 56 -> 44;
            case 57 -> 14;
            case 58 -> 50;
            case 59 -> 13;
            case 60 -> 43;
            case 61 -> 22;
            case 62 -> 12;
            default -> 2;
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
        fI.t[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fI.m(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = t[n];
            int n2 = string.indexOf(8);
            Class clazz = fI.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fI.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fI.g(clazz3, string2, clazz2)) != null) {
                    fI.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fI.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fI.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fI.n(1541930089514063L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fI.m(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = t[n];
                int n3 = string2.indexOf(8);
                clazz3 = fI.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fI.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fI.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fI.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fI.n(1541930089514063L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fI.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fI.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fI.n(1541930089514063L, 0L);
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
        bt_0 bt_02 = (bt_0)objectArray[0];
        f8 f82 = (f8)objectArray[1];
        Color color = (Color)objectArray[2];
        Color color2 = (Color)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        long l = (Long)objectArray[7];
        long l2 = l = fI.l ^ l;
        long l3 = l2 ^ 0x78F3AFB73DC5L;
        long l4 = l2 ^ 0x540451EF5617L;
        float f12 = (0.05f + 0.55f * fI.d("U", (Object)new Object[]{Float.valueOf(f11)}, (long)-4131881561709976406L, (long)l)) * f10;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = color2;
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l3;
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = color;
        Object[] objectArray4 = new Object[11];
        objectArray4[10] = l4;
        objectArray4[9] = fI.d("U", (Object)objectArray3, (long)-4133729415702403398L, (long)l);
        objectArray4[8] = fI.d("U", (Object)objectArray2, (long)-4133729415702403398L, (long)l);
        objectArray4[7] = Float.valueOf(0.12f);
        objectArray4[6] = Float.valueOf(0.018f);
        objectArray4[5] = Float.valueOf(f12);
        objectArray4[4] = Float.valueOf((float)fI.d("\u00a2", (Object)f82.a, (long)-4134104287761103774L, (long)l));
        objectArray4[3] = Float.valueOf((float)fI.d("\u00a2", (Object)f82.a, (long)-4129973219317208086L, (long)l) + 0.01f);
        objectArray4[2] = Float.valueOf((float)fI.d("\u00a2", (Object)f82.a, (long)-4135370393024086370L, (long)l));
        objectArray4[1] = bt_02.a;
        objectArray4[0] = bt_02.b;
        fI.d("U", (Object)objectArray4, (long)-4131948554024758566L, (long)l);
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

    private void j(Object[] objectArray) {
        bt_0 bt_02 = (bt_0)objectArray[0];
        f8 f82 = (f8)objectArray[1];
        Color color = (Color)objectArray[2];
        Color color2 = (Color)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        long l = (Long)objectArray[6];
        long l2 = l = fI.l ^ l;
        long l3 = l2 ^ 0x47729A0DEBC4L;
        long l4 = l2 ^ 0x2EEBE8F41DE4L;
        long l5 = l2 ^ 0x4823898341A3L;
        long l6 = l2 ^ 0x1E0C7A11071FL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        fI.d("U", (Object)objectArray2, (long)1201570236226152283L, (long)l);
        CallSite callSite = fI.d("\u00f1", (Object)f82.a, (double)0.0, (double)0.02, (double)0.0, (long)1202100424724513307L, (long)l);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l5;
        objectArray3[3] = (double)fI.d("\u00a2", (Object)callSite, (long)1198390212563980899L, (long)l);
        objectArray3[2] = (double)fI.d("\u00a2", (Object)callSite, (long)1202000113732582891L, (long)l);
        objectArray3[1] = (double)fI.d("\u00a2", (Object)callSite, (long)1197123008340912287L, (long)l);
        objectArray3[0] = bt_02.b;
        CallSite callSite2 = fI.d("U", (Object)objectArray3, (long)1202331069138846351L, (long)l);
        Matrix4f matrix4f = new Matrix4f();
        fI.d("\u00f1", (Object)matrix4f, (float)((float)fI.d("\u00a2", (Object)callSite2, (long)1203526895944002486L, (long)l)), (float)((float)fI.d("\u00a2", (Object)callSite2, (long)1201299626699032684L, (long)l)), (float)((float)fI.d("\u00a2", (Object)callSite2, (long)1200828498883155744L, (long)l)), (long)1202160832553884379L, (long)l);
        fI.d("\u00f1", (Object)matrix4f, (float)(-f82.e), (long)1197006044318305606L, (long)l);
        fI.d("\u00f1", (Object)matrix4f, (float)((float)fI.d("U", (double)90.0, (long)1198287046339165406L, (long)l)), (long)1197992318282909260L, (long)l);
        fI.d("\u00f1", (Object)matrix4f, (float)0.04f, (long)1201690720143967272L, (long)l);
        float f11 = 4.0f * f10;
        float f12 = 7.5f * f10;
        float f13 = f11 * 1.55f;
        float f14 = f12 * 1.4f;
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l3;
        objectArray4[1] = Float.valueOf(f * 0.45f);
        objectArray4[0] = color;
        Object[] objectArray5 = new Object[13];
        objectArray5[12] = l4;
        objectArray5[11] = Float.valueOf(0.0f);
        objectArray5[10] = fI.d("U", (Object)objectArray4, (long)1198860742280048827L, (long)l);
        objectArray5[9] = Float.valueOf(0.0f);
        objectArray5[8] = Float.valueOf(f14);
        objectArray5[7] = Float.valueOf(f13);
        objectArray5[6] = Float.valueOf(0.0f);
        objectArray5[5] = Float.valueOf(-f14);
        objectArray5[4] = Float.valueOf(-f13);
        objectArray5[3] = h;
        objectArray5[2] = matrix4f;
        objectArray5[1] = bt_02.b;
        objectArray5[0] = bt_02.a;
        fI.d("U", (Object)objectArray5, (long)1197193718537090463L, (long)l);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l3;
        objectArray6[1] = Float.valueOf(f);
        objectArray6[0] = color2;
        Object[] objectArray7 = new Object[13];
        objectArray7[12] = l4;
        objectArray7[11] = Float.valueOf(0.0f);
        objectArray7[10] = fI.d("U", (Object)objectArray6, (long)1198860742280048827L, (long)l);
        objectArray7[9] = Float.valueOf(0.0f);
        objectArray7[8] = Float.valueOf(f12);
        objectArray7[7] = Float.valueOf(f11);
        objectArray7[6] = Float.valueOf(0.0f);
        objectArray7[5] = Float.valueOf(-f12);
        objectArray7[4] = Float.valueOf(-f11);
        objectArray7[3] = h;
        objectArray7[2] = matrix4f;
        objectArray7[1] = bt_02.b;
        objectArray7[0] = bt_02.a;
        fI.d("U", (Object)objectArray7, (long)1197193718537090463L, (long)l);
    }

    private boolean lambda$new$0(Color color) {
        Object object;
        block2: {
            block3: {
                long l = fI.l ^ 0x5FAFC8E7953EL;
                CallSite callSite = fI.d("U", (long)-5051138057353691346L, (long)l);
                try {
                    object = fI.d("\u00f1", (Object)((Boolean)((Object)fI.d("\u00f1", (Object)this.f, (long)-5050761014338344547L, (long)l))), (long)-5050006859968831302L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)-5051321582269745822L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$onRenderWorld$1(long l, f8 f82) {
        long l2;
        block2: {
            block3: {
                long l3 = fI.l ^ 0x1A939D120D6L;
                CallSite callSite = fI.d("U", (long)868806274510179014L, (long)l3);
                try {
                    long l4 = l - f82.b - (long)f82.c;
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != null) break block2;
                    if (l2 < 0) break block3;
                }
                catch (MatchException matchException) {
                    throw fI.d("U", (Object)matchException, (long)868710729354215562L, (long)l3);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fI.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fI.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fI.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


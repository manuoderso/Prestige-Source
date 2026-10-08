/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_4604
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bJ;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bb_0;
import dev.zprestige.prestige.bo_0;
import dev.zprestige.prestige.bq_0;
import dev.zprestige.prestige.cN;
import dev.zprestige.prestige.cO;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_4604;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Renamed from dev.zprestige.prestige.fc
 */
public class fc_0
extends dV {
    private dO a;
    private dP c;
    private dO d;
    private dM e;
    private dM f;
    private dM g;
    private dM h;
    private dM i;
    private dM j;
    private static final float k = 0.15f;
    private static final Color l;
    private static final Color m;
    private static final Color n;
    private static final Color o;
    private static final Color p;
    private static final Color q;
    private class_4604 r;
    private Map s;
    private List t;
    private Map u;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final Object[] z;
    private static final String[] A;

    public fc_0() {
        long l = v ^ 0x750BC56A29C4L;
        long l2 = l ^ 0x6B1A256DFB79L;
        this.s = new HashMap();
        this.t = new ArrayList();
        this.u = new LinkedHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        fc_0.c("\u00ef", (Object)this.j, (Object)objectArray, (long)7780885785413293166L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    fc_0.v = hc.a(-1963116142414622795L, 3705257054251710315L, MethodHandles.lookup().lookupClass()).a(83796531438668L);
                    var20 = fc_0.v ^ 43659217615674L;
                    fc_0.z = new Object[188];
                    fc_0.A = new String[188];
                    fc_0.f();
                    fc_0.y = new HashMap<K, V>(13);
                    var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var20 >>> 56);
                    for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                        v2 = v2;
                        v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                    }
                    var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_3 = new String[2];
                    var16_4 = 0;
                    var15_5 = "\b\u00c0\u00a9\u00e3\u001c\u0098\u00b5\u00d6\u0005|\u00a1\u000e\u00a2\u00cc\u0001\u009b\u0010W\u0004\u009f\u0081i\u008cs\u0000\\\u0092\u0088\u008e\"JZ%";
                    var17_6 = "\b\u00c0\u00a9\u00e3\u001c\u0098\u00b5\u00d6\u0005|\u00a1\u000e\u00a2\u00cc\u0001\u009b\u0010W\u0004\u009f\u0081i\u008cs\u0000\\\u0092\u0088\u008e\"JZ%".length();
                    var14_7 = 16;
                    var13_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var18_3[var16_4++] = fc_0.b(var19_9).intern();
                        if ((var13_8 += var14_7) < var17_6) {
                            var14_7 = var15_5.charAt(var13_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_8;
                    var19_9 = var11_1.doFinal(var15_5.substring(v3, v3 + var14_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                fc_0.w = var18_3;
                fc_0.x = new String[2];
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v6 = v6;
                    v6[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[16];
                var4_13 = 0;
                var5_14 = "?+A\u0014]K\t\u00cb\u000en\u008d\u00f3\u00ac\u00f5\u00bf4tU\u0092\u00c9\u00eb\u00ea\u0007\u00e9\u00ce\u00cc@\u00d1_:\u001b\u00c4+\u0017\u0080\u00dd\u00a0\u00e8iC6\u00e4N\u00c3%\u008c:;\u00dak\u00ec8\u00b7\u008b\u0086\u00d1\u0088\u00e7A\u0082'\u00aa0\u00bf\u00b6\u00c0B\u0092#:e\u00b7\u00a0\u00cck\u00b0\u00c8\"\u00d0Y1\u00fb\u009d\u00d1\u00ee]\u00d2T\u0002$[\u00a2\u00ba\u008f\u00fb\u00a4iH\u00ca\u0084?\u00de\u0099\u00c9\u00e3\u00b3\u0090\u0094V\u00ef\u0003,";
                var6_15 = "?+A\u0014]K\t\u00cb\u000en\u008d\u00f3\u00ac\u00f5\u00bf4tU\u0092\u00c9\u00eb\u00ea\u0007\u00e9\u00ce\u00cc@\u00d1_:\u001b\u00c4+\u0017\u0080\u00dd\u00a0\u00e8iC6\u00e4N\u00c3%\u008c:;\u00dak\u00ec8\u00b7\u008b\u0086\u00d1\u0088\u00e7A\u0082'\u00aa0\u00bf\u00b6\u00c0B\u0092#:e\u00b7\u00a0\u00cck\u00b0\u00c8\"\u00d0Y1\u00fb\u009d\u00d1\u00ee]\u00d2T\u0002$[\u00a2\u00ba\u008f\u00fb\u00a4iH\u00ca\u0084?\u00de\u0099\u00c9\u00e3\u00b3\u0090\u0094V\u00ef\u0003,".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v7 = var0_12;
                    v8 = var4_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl84:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00d5\u0001y\u009d\u001e\u0089\n\u001fi_\u00d1\\\u00cc\u00bc\u0007\u0010";
                    var6_15 = "\u00d5\u0001y\u009d\u001e\u0089\n\u001fi_\u00d1\\\u00cc\u00bc\u0007\u0010".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v7 = var0_12;
                        v8 = var4_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var3_16 < var6_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl116:
                // 1 sources

                ** continue;
            }
        }
        fc_0.l = new Color((int)var0_12[7], (int)var0_12[11], (int)var0_12[8]);
        fc_0.m = new Color((int)var0_12[10], (int)var0_12[13], (int)var0_12[6]);
        fc_0.n = new Color((int)var0_12[14], (int)var0_12[9], (int)var0_12[9], (int)var0_12[15]);
        fc_0.o = new Color((int)var0_12[3], (int)var0_12[1], (int)var0_12[4], (int)var0_12[2]);
        fc_0.p = new Color((int)var0_12[3], (int)var0_12[6], (int)var0_12[6]);
        fc_0.q = new Color((int)var0_12[5], (int)var0_12[0], (int)var0_12[12]);
    }

    private List b(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        ArrayList arrayList;
        long l;
        class_1799 class_17992;
        block14: {
            block15: {
                class_17992 = (class_1799)objectArray[0];
                l = (Long)objectArray[1];
                l = v ^ l;
                arrayList = new ArrayList();
                callSite3 = fc_0.c("\u00f3", (long)305706126119154564L, (long)l);
                callSite2 = fc_0.c("\u00f3", (Object)class_17992, (long)292001046255299837L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block14;
                        if (fc_0.c("\u00ef", (Object)callSite, (long)292714674897061587L, (long)l) == false) break block15;
                    }
                    catch (MatchException matchException) {
                        throw fc_0.c("\u00f3", (Object)matchException, (long)290934488495985087L, (long)l);
                    }
                    return arrayList;
                }
                catch (MatchException matchException) {
                    throw fc_0.c("\u00f3", (Object)matchException, (long)290934488495985087L, (long)l);
                }
            }
            callSite = callSite2;
        }
        CallSite callSite4 = fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)callSite, (long)291800853081615079L, (long)l), (long)291934207259948679L, (long)l);
        while (fc_0.c("\u00ef", (Object)callSite4, (long)290200929674193415L, (long)l) != false) {
            Object object;
            Object object2;
            class_6880 class_68802;
            block18: {
                block19: {
                    CallSite callSite5;
                    block16: {
                        class_68802 = (class_6880)fc_0.c("\u00ef", (Object)callSite4, (long)304006870612135631L, (long)l);
                        try {
                            try {
                                callSite5 = fc_0.c("\u00ef", (Object)class_68802, (long)288259353003906327L, (long)l);
                                if (callSite3 != null) break block16;
                                if (fc_0.c("\u00ef", (Object)callSite5, (long)289268720988943475L, (long)l) != false) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw fc_0.c("\u00f3", (Object)matchException, (long)290934488495985087L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fc_0.c("\u00f3", (Object)matchException, (long)290934488495985087L, (long)l);
                        }
                        callSite5 = fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)class_68802, (long)288259353003906327L, (long)l), fc_0::lambda$getEnchantmentData$2, (long)292535547695897831L, (long)l), (Object)fc_0.b("c", (int)28395, (long)(0x7B4B3732253A5700L ^ l)), (long)304650813878068203L, (long)l);
                    }
                    object2 = (String)((Object)callSite5);
                    try {
                        try {
                            object = object2;
                            if (callSite3 != null) break block18;
                            if (fc_0.c("\u00ef", (Object)object, (long)292474802053525662L, (long)l) <= 3) break block19;
                        }
                        catch (MatchException matchException) {
                            throw fc_0.c("\u00f3", (Object)matchException, (long)290934488495985087L, (long)l);
                        }
                        object = fc_0.c("\u00ef", (Object)object2, (int)0, (int)3, (long)289777449522126890L, (long)l);
                        break block18;
                    }
                    catch (MatchException matchException) {
                        throw fc_0.c("\u00f3", (Object)matchException, (long)290934488495985087L, (long)l);
                    }
                }
                object = object2;
            }
            object2 = object;
            object2 = (String)object2 + " " + (int)fc_0.c("\u00ef", (Object)callSite2, (Object)class_68802, (long)290337389353889716L, (long)l);
            fc_0.c("\u00ef", arrayList, (Object)new cO(class_17992, (String)object2), (long)290856833420255650L, (long)l);
            if (callSite3 == null) continue;
        }
        return arrayList;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3DCE;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            fc_0.x[n2] = fc_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fc_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fc_0.m(l, l2);
            object = z[n];
            try {
                if (!(object instanceof String)) break block2;
                fc_0.z[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fc_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fc_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fc_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fc_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = z;
        z[0] = "4\u0013\u0019xx0?\u001c\b7\u001431\u001e\nx8";
        objectArray[1] = Boolean.TYPE;
        fc_0.A[1] = "java/lang/Boolean";
        objectArray[2] = "mMz6\n|{M\u007fl\u0019kl\u0006|j\u0015\u007f}Ak}^hB";
        objectArray[3] = "\u0003\bL\u0014N#\b\u0007][/-\u0003\fY\u0001";
        objectArray[4] = "Nwm+V\u0003NwzwZ\fT<ziZ\u0019SM 6\u000b^";
        objectArray[5] = ".cOA~<0kU\u000e\u0003,0";
        objectArray[6] = "&.@<\u0019>8&Zs~?)=W)X9";
        objectArray[7] = "OI5z\u0015\u0018YI0 \u0006\u000fN\u00023&\n\u001b_E$1A\tc";
        objectArray[8] = "Ml %F\u000e8L+*WAET8-^\b-";
        objectArray[9] = "+HMXpA5@W\u0017\u0011D5@TW?X";
        objectArray[10] = "GFu*\u0003\u0018LIde~\u0000_Nm,";
        objectArray[11] = Integer.TYPE;
        fc_0.A[11] = "java/lang/Integer";
        objectArray[12] = "Z'\u0000derD/\u001a+-r^%\u0002l$i\u001e\u0000\u0003k(sY)\u0018";
        objectArray[13] = "\u001dBjr\u0001\u000e\u0003Jp=c\u0012\u0004W";
        objectArray[14] = "21fRr421q\u000e~;(zq\u0010~./\u000b#D&m";
        objectArray[15] = "d\u00004_H\nd\u0000#\u0003D\u0005~K#\u001dD\u0010y:qF\u001cZ";
        objectArray[16] = "j7]\u0000$zj7J\\(up|JB(`w\r\u001f\u0016q#";
        objectArray[17] = "E;@4A\u0015S;EnR\u0002DpFh^\u0016U7Q\u007f\u0015\u0003B";
        objectArray[18] = "g[8}\u0016glT)2ujyY&Y@hhJ:uWe";
        objectArray[19] = "q\"=($g\u0004\u00026'5(e\f=,1r\u0011";
        objectArray[20] = Void.TYPE;
        fc_0.A[20] = "java/lang/Void";
        objectArray[21] = "\u0014y.KM\f\u0002y+\u0011^\u001b\u00152(\u0017R\u000f\u0004u?\u0000\u0019\u001f\u001cu=\u000bCR n=\u0016C\u0015\u0017y";
        objectArray[22] = "\u001b\u0012y\\U$\r\u0012|\u0006F3\u001aY\u007f\u0000J'\u000b\u001eh\u0017\u00015\u0016";
        objectArray[23] = ";l\u0003\u007ffVNL\bpw\u0019/B\u0003{sC[";
        objectArray[24] = "\u0005{/d@`\u0013{*>Sw\u00040)8_c\u0015w>/\u0014r\u0010";
        objectArray[25] = "Dy\u000e13}1Y\u0005>\"2PW\u000e5&h$";
        objectArray[26] = "\u0004OUS_\u001d\u0004OB\u000fS\u0012\u001e\u0004B\u0011S\u0007\u0019u\u0010O\u000bC";
        objectArray[27] = "n\\es\u0003\u001cx\\`)\u0010\u000bo\u0017c/\u001c\u001f~Pt8W\u000e@";
        objectArray[28] = "r4mwU\u0012\u0007\u0014fxD]f\u001ams@\u0007\u0012";
        objectArray[29] = "7vM\u0014Q67vZH]9-=ZV],*L\r\f\fk";
        objectArray[30] = "ob^\u0003STobI__[u)IA_NrX\u0019\u001c\u000e";
        objectArray[31] = "\u0000\r:\f \u0019\u0000\r-P,\u0016\u001aF-N,\u0003\u001d7y\u0016{";
        objectArray[32] = "\u001eBm[-b\u001eBz\u0007!m\u0004\tz\u0019!x\u0003x+@v:";
        objectArray[33] = "g=h#&qg=\u007f\u007f*~}v\u007fa*kz\u0007)?~(";
        objectArray[34] = "f\u001c\"\u0018y\u000fp\u001c'Bj\u0018gW$Df\fv\u00103S-\u001d`";
        objectArray[35] = "&FbU\":SfiZ3u2hbQ7/F";
        objectArray[36] = "(j(s$V]J#|5\u0019<D(w1CH";
        objectArray[37] = "lP%=sQlP2a\u007f^v\u001b2\u007f\u007fKqjd ,\t";
        objectArray[38] = "7x\u000bf\u0010\u00067x\u001c:\u001c\t-3\u001c$\u001c\u001c*BMqK_";
        objectArray[39] = "c\u00182\u001f\u0002xu\u00187E\u0011obS4C\u001d{s\u0014#TViB";
        objectArray[40] = "cY\u0011]l\u0002\u0016y\u001aR}Mww\u0011Yy\u0017\u0003";
        objectArray[41] = Float.TYPE;
        fc_0.A[41] = "java/lang/Float";
        objectArray[42] = "\u0004+hk`\n\u0004+\u007f7l\u0005\u001e`\u007f)l\u0010\u0019\u0011-s8T";
        objectArray[43] = "q\u0004\u0014\u0001\u0002(q\u0004\u0003]\u000e'kO\u0003C\u000e2l>R\u001cW";
        objectArray[44] = "h\u000b\u0019\u000f3/c\u0004\b@P\"v\u0002";
        objectArray[45] = "KF,Dr;]F)\u001ea,J\r*\u0018m8[J=\u000f&(A";
        objectArray[46] = "#z\bp\u0013iVZ\u0003\u007f\u0002&7T\bt\u0006|C";
        objectArray[47] = "\u007f.5\u0004[9i.0^H.~e3XD:o\"$O\u000f*X";
        objectArray[48] = "\u001a\u0017\u001c\"\u0016\u0018\f\u0017\u0019x\u0005\u000f\u001b\\\u001a~\t\u001b\n\u001b\riB\f?";
        objectArray[49] = "7 \u001a*dwB\u0000\u0011%u8#\u000e\u001a.qbW";
        objectArray[50] = "4(\u0010=\u0013\u00154(\u0007a\u001f\u001a.c\u0007\u007f\u001f\u000f)\u0012V'M";
        objectArray[51] = Double.TYPE;
        fc_0.A[51] = "java/lang/Double";
        objectArray[52] = "5\u0001r\\R]#\u0001w\u0006AJ4Jt\u0000M^%\rc\u0017\u0006N\u0010";
        objectArray[53] = "n\u0002thd.\u001b\"\u007fguaz,tlq;\u000e";
        objectArray[54] = "{\t\u0013\r*j\u000e)\u0018\u0002;%o'\u0013\t?\u007f\u001b";
        objectArray[55] = ":qW~\u0000+8o\u001e\u001d\u000b0'jHd\f";
        objectArray[56] = "h\u0018\u0015yg\u000ev\u0010\u000f6\u0004\u001ar";
        objectArray[57] = ">lrytc(lw#gt?'t%k`.`c2 w\u0018";
        objectArray[58] = "\u0010\u000eCe8\re.Hj)B\u0004 Ca-\u0018p";
        objectArray[59] = "l>-VG4\u0019\u001e&YV{x\u0010-RR!\f";
        objectArray[60] = "\u0007\u0016%mF`r6.bW/\u00138%iSug";
        objectArray[61] = "qDm6E!zK|y\"#o@|2\u0019";
        objectArray[62] = "[\"\u001f5B1E*\u0005z!%Ag,:\u00186H";
        objectArray[63] = "-2]Sj<X\u0012V\\{s9\u001c]W\u007f)M";
        objectArray[64] = "&}p\u0002-\u001e0}uX>\t'6v^2\u001d6qaIy\n)";
        objectArray[65] = "\u001fV)t2!jv\"{#n\u000bx)p'4\u007f";
        objectArray[66] = "nl&BYKxl#\u0018J\\o' \u001eFH~`7\t\r_n";
        objectArray[67] = "!Somy\bTsdbhG5}oil\u001dA";
        objectArray[68] = "\u0004<4\u0005/S\u000f3%JGS\u0001<6";
        objectArray[69] = "_\r\u0019\u000eL3*-\u0012\u0001]|K#\u0019\nY&?";
        objectArray[70] = "\fa\u0011,fVyA\u001a#w\u0019\u0018O\u0011(sCl";
        objectArray[71] = "j4\"q_\u0005\u001f\u0014)~NJ~\u001a\"uJ\u0010\n";
        objectArray[72] = "\"\f\u001d\u001e\u000e<?\u0019E<O1'\u001f";
        objectArray[73] = "aP&\u000b\u0012\u000faP1W\u001e\u0000{\u001b1I\u001e\u0015|jd\u0016G";
        objectArray[74] = "YWj\u000b4-OWoQ':X\u001clW+.I[{@`>w";
        objectArray[75] = "\u001aGD?4\r\fGAe'\u001a\u001b\fBc+\u000e\nKUt`\u001bH";
        objectArray[76] = "L0dMCd9\u0010oBR+X\u001edIVq,";
        objectArray[77] = "N V\b8<X SR++OkPT'?^,GCl*|";
        objectArray[78] = "-\u0010V\b\u0013n3\u0018LG~t+\u001dE\nIr(\u001f";
        objectArray[79] = "zE3*\u001aulE6p\tb{\u000e5v\u0005vjI\"aN`A";
        objectArray[80] = ".GmjR{[gfeC4:imnGnN";
        objectArray[81] = "S@j/7zE@ou$mR\u000bls(yCL{dcny";
        objectArray[82] = "$n-\u0013=bQN&\u001c,-0@-\u0017(wD";
        objectArray[83] = "@7\u0015Z\u00165@7\u0002\u0006\u001a:Z|\u0002\u0018\u001a/]\rXFLh";
        objectArray[84] = "O\txef}:)sjw2['xash/";
        objectArray[85] = "\u0005GwU>\u001b\u001bOm\u001aS\u0001\u0002V`Fq\u001a\u0000T";
        objectArray[86] = "F\rnbf)F\ry>j&\\Fy j3[7+\u007f;t";
        objectArray[87] = "8i/(n{MI$'\u007f4,G/,{nX";
        objectArray[88] = "}21=Gik24gT~|y7aXjm> v\u0013}T";
        objectArray[89] = "\t,b\u0007(0|\fi\b9\u007f\u001d\u0002b\u0003=%i";
        objectArray[90] = "dS\u00119.\u00132^\u0015h\u001e\u0018Y\u0001\fs~\b>X\u0018za\u001dYUH<$\b$FD;rq";
        objectArray[91] = "\u0019'.fDi\u001c7/`L\u0013IH}{PsY/$oYlLH{x^nC#\u007fs\u001d} ";
        objectArray[92] = "8xo^kh/7*_\u0011yFqo^qj!({Wn\u007fF4,C}t#%v\u001fl\u0013";
        objectArray[93] = "e\u0014LbhX6L\u000ev\u0013Y\u000b\u0017WwsImG\u0007rjK";
        objectArray[94] = "{\u0019\\ ~\u0002\u007fSS(%g-O\u001e\u0018%Z=^\u0013|!X9\u0018b\"\"\u0018>S\u0006& \u001cx\"";
        objectArray[95] = "xV{>.e.\u0010;3S~\u0013Qz\u007f3mt\bnv,x\u0013Y3h.+r\u0017r59\u0014";
        objectArray[96] = "?g\rhgT/w\u000bu\u0017NO.JtwJ(w^}h_Oz\u000e;-J2i\u0002<{3";
        objectArray[97] = "?]\u0005&9js\u001dH(S~/J\u001c4\u0004)u\u001aAX!n-HDb,! C";
        objectArray[98] = "/IC-Be\u007f\u0013\u0018vL\u0006hq\u001d?Qfo\u0016D+XyzqI{\u001e<o\fZw\u0019j\u0016";
        objectArray[99] = "yW)y%\\xC3fd;.R\"dtl|\u0002u:$;yW)y%\\xC3fd";
        objectArray[100] = "> R;&\u0007>k\u0012lY\u0019/&\u000b15+\u007ffTiY\u0019|0[5a\u0013(d\u0010V";
        objectArray[101] = "228*\u00144ndij\u001fS`?b*M)fX{iH?l=j3\u0014.\u000b$<>H4n5fbYS4#x/G80(;<$";
        objectArray[102] = "\u001e(`\f\u0002{\u001ec [}e\u000f.9\u0006\u0011W\\jfP}i\u0018o7\r\u0010\u007f\u0018h2a";
        objectArray[103] = "ipL1\u001faj9^m\u001c\u0004;@\n(\u0007d)'S<\u000e{<@^lH>)=M`OhP";
        objectArray[104] = "*E}?}cy\u001d?+\u0006wDFi,ch>Cy-e`";
        objectArray[105] = "Nz:\u001bGE\b\u007fn\u0012!^w\"n\u0004]F\u0013&l\u0000\u001b7";
        objectArray[106] = "&\u0002CbbD6\u0010Im\u000b_\\RP,kO;\u000bD%tZ\\\u0017\u00131gQ9\u0006Imv6";
        objectArray[107] = "FA\u0001l\rV\\C\u0002 tNR\u0001\\y\u0018|\u0005L\u0005!K+F\r\f\u007fIQ[\u001a@bt";
        objectArray[108] = "!mZx\u0002\u0006w`^)2\u000e\u001c;Y H]c?\u0006 \td";
        objectArray[109] = "ZtJoxl\fuW/-\u000e\u0006tIv'b4 \u0005*}0c(\u0004p=1\u0002fE-*\u000e";
        objectArray[110] = "$S\u001dl!=g\u0000\u001ao}TrS\u0002Lq8\u001d\u0001\u0005ia7v\u0005\u000e*rT";
        objectArray[111] = "z\n[f\u0013Bb\r\u0017hcW\u007f^C44\u0000 \u0003\u0018XZTaJ\u001f:\fU|\nJ";
        objectArray[112] = "\u0015R%Msm[\u0013xZLeH\u000f\nT(\f\u001d\u0002\u007f\n4f\u0014\t|J=\f\u001dY-O(`\\^9ML";
        objectArray[113] = "\u0000\u0010t Dr\u0016\u0010s%(z\u0004\u0016))DHV[wv(&S\u00046*DgT\u00104N";
        objectArray[114] = ",\u007fI\u0006\u001a=?$YP )S#QF@94zEO_,S#\u0011PJ\"0sK\u000b\u0011,S";
        objectArray[115] = "3$\u0002}U!}e_jj!yX\u0001x\u00161\u0002,^n\u0015$nmYz\u0017@";
        objectArray[116] = "YDL;P]\u001bM\rmlW\b^NTV\f\u001aRC0R\u000e\u001e\u00142";
        objectArray[117] = "u:Y`\u0017#'`O0)x{%VfEJ,b\u000e0\u0012\u001dk0XpS,jc\t9)$,7IeEe+#K\u0001";
        objectArray[118] = "\u0002\u0019^pR\u001dNY\u0013~8\t\u0012\u000eGbo^H^\u001b\u000eJ\u0019\u0010\f\u001f4GV\u001d\u0007";
        objectArray[119] = ">|]6\u0005\u001c:6R>^yj!\u001ft\u0015\"j;c5\u0001\u001aiy\u0004q\u001fEcG";
        objectArray[120] = "U\u001c=\u001bY\r\u0005Ff@Wn\u0007$c\tJ\u000e\u0015C:\u001dC\u0011\u0000$&JW\u0002\u000bA7\u0010\u000b\u0013l";
        objectArray[121] = "p@tq\u001fip\u001e5q\fU(\u0018uP\f14\u0013\t1\u001e*4\u001db5\u0015i'~";
        objectArray[122] = "\\ dg9C\\k$0F]M&=m*o\u001ecd:F\u0001F*7l8Q\u001e785FQZg3f+GZ`6\n";
        objectArray[123] = "As2t\u0007o\u0015dw`\r\u0010\u0015\u001a5t\rp\u0001}l`\u0004o\u0014\u001aa0B*\u0001gr<E|x";
        objectArray[124] = "\u00139\u0015\u0018;8\u0000o\u0011S\u0003?}nW\u0019c/\u001a7C\u0010|:}n\u0015\u0006|2\u0011/\u0012\u0012~V";
        objectArray[125] = "\u0017tfSJBJc0\u0000%CSTh\u0014H$\u0013$s\u0013T@\u0017&wU%\u001e\u0014fp\u001eA\u001a\u0016b6o";
        objectArray[126] = "0G\bD\u0000p~\u0006US?~l\nn\u0006Dn|\u0015\u0005\u0002O-ovT\u0004@mp\u0012P\u0006D+\u0001";
        objectArray[127] = "\"{uQLjr!.\nB\tdC+C_ib$rWVvwC\u007f\u0007\u00103b>l\u000b\u0017e\u001b";
        objectArray[128] = "\u001ef\u0019UeiK=\nWw\u0012N]B\u0012~r^:\u001b\u0006wmK]\n\u0010rlM'FP?b'";
        objectArray[129] = "f\u0002EQ\u001aG`\u0013\u001cH&\u0006$\u000bW_\\\u001c?\u000e,\u001c]\u0002$\u0002G\u0018VA7a\u0013XY\u0000:\n\u0017S\u001a\u0013Y^OJTAcX^\u0013M}";
        objectArray[130] = "V'7\u001c\u0019+VlwKf5G!n\u0016\n\u0007\u0014e0Jf,\u00111b\u0016\u0003=Kmsq";
        objectArray[131] = "&JjWM:e\u0019mT\u0011SpJub\n>rA\t\u0012\u000b,bDb\u0016\u0000oq'";
        objectArray[132] = "\u0007\u0003YhHN\u001f\u0004\u0015f8[\u0002WA:o\f\\\u0000\u0019V\\U\tCH2\bP\u001fY";
        objectArray[133] = "\u000fT,)p$\\\fn=\u000b&aW9!;1]\u001e0jgr";
        objectArray[134] = "4,\u0019(\\\u00074gY\u007f#\u0019%*@\"O+vn\u001cz#\u00152kN)N\u00032lKE";
        objectArray[135] = "I6\u0015\u001c<TM|\u001a\u0014g1\bpW$g\f\u000fqZ@c\u000e\u000b7+\u001e`N\f|O\u001abJJ\r\u0011\u0019\"M\u0001i\u0015\u001b&\u000bp";
        objectArray[136] = "kf'\u001d\u001b\u0011)ofK'\u001d>w\u001f\u001fW\u0001W5c\u001cX\u0019;td\bZ}";
        objectArray[137] = "Ua3d\b\r\u0000:1-5\u001a\u0003#.rY(S`s.\u000b\u007f\u0004a1~J\r\u0015%2.5@\u0015 3v^D\u001ec \u0015";
        objectArray[138] = "3%2'xo`}p3\u0003`]q'ds93bq`8";
        objectArray[139] = "C/\u0001\u0004?G\rn\\\u0013\u0000]\u0013l\ny?]\rc\u0004\u0012;VNpg";
        objectArray[140] = "`_\u001f><=3\u0007]*G8\u000e\u001a\u0001'vis\tZ7 ";
        objectArray[141] = "i|>`Asomgy}(-R2j\u00018V&m|\u0002-:gjh\u0000I";
        objectArray[142] = "=saVEuq3,X/j!u|OCXu1'\u0011/}2js\u0014\u0015p}gx(]q/f \u0012P>\"m\u001cZQl#5&W\u001ea(\tmRRq&s!\u0012\u001f\u007fL";
        objectArray[143] = "8DV7\u001aE8\u000f\u0016`e[)B\u000f=\tiz\u0006T`eB\u007fR\u0003=\u0000S%\u000e\u0012Z";
        objectArray[144] = "0$\u000e\u001a\u0010\u0019~eS\r/\u0013ex\u0001\u001d/\u0015=+R\u001eR\u00061,\u0004g";
        objectArray[145] = "\u001b[5\u000bF\u001f\u001f\u0011:\u0003\u001dzI\u0004fZ]zO\\5\t^\u0007\\P2_'";
        objectArray[146] = "bAIx\u007f%2\u0011La}C2!\u001c`q#\"FEtx<7!\u001c\"n<?M]%z>[";
        objectArray[147] = "\u001e=\b+}]J5YPoW\u0013a\n9cn\u001da\u001a=\u0005\tNk\u00184iHI\u007f\u001aP";
        objectArray[148] = "i%\u0011<\u001b\u0006xa\u0012ld\u0011ng\u000e0\b#?#Tl\\t=v\u0004k\u000b\u0012`aR8d";
        objectArray[149] = "K}y>o6Jic!.Q\u0013er=;-\u0015c\u001f{8/\u001d%s91nK\u0019";
        objectArray[150] = "s\u001d\u001c5\u0014\u001a:\u0014WiW&#sT}\u001eF3\u0014\ri\u0017Y&sTgT](\u001c\u0007n\u000fY/s";
        objectArray[151] = "1(JAk\u0014'nA\u001d\t\u001a^lY\ri\n95M\u0004v\u001f^4G\fsL`kPBks";
        objectArray[152] = "+\t\u0007\u001ce\u001b}OG\u0011\u0018\u0003@\u000e\u0006]x\u0013'W\u0012Tg\u0006@\u000e\u0013ObW)M@Ha\u000b@";
        objectArray[153] = "\u0007?Es[9S:Si68\u000e#OmZ\n^`\u0014;6<\u0005/U5\bc\u0012aM\nJf\u000f3Ho[<S\"/";
        objectArray[154] = "y6\"/IJ$!t|&M<\u0016-kZ]Gbr}YH+#ui[,";
        objectArray[155] = "\u0010@O]s>\u0010\u000b\u000f\n\f \u0001F\u0016W`\u0012Q\nL\u0001\f8\u0005T\u0007J=9V\u0005N0";
        objectArray[156] = "(\u001ej8\u0017\u0004/\u001f)5s\u00041[q2s\u0002mJ{9\u0016\u00137\u0016j^L\u0005)[t5H\u000ejH\u0017";
        objectArray[157] = "dk)va\u000ed i!\u001e\u0010ump|r\"!..+$ud*|wy\u0010up f\u001e";
        objectArray[158] = ";Ji\u001eXk1\u001e=U;<3\bXRA28\u001b\u0003\u0011X:,H9\u0017Ic5t";
        objectArray[159] = "TC73\u0019uIT{.$j@Og5HX\u0014\t7i\u001e\u000f\u0012Pn \u00185\u0014A79$";
        objectArray[160] = "Ul?%\u0004\u0000\u0011r`/:\u0006\u0012d&\"F\u0000\u0014\t`!D\bRe\"(\u0005^n";
        objectArray[161] = "{=ht-?+e)oM!\u007fz7x!\u0013/9j$wD{|jq!)m|mtM\u007f,{&\"?*wyo\u001f";
        objectArray[162] = "t]T:5X'T\u000f>27'?V9&W4X\u000f-/H!?V\"3\u000bpTVq(Uu?";
        objectArray[163] = "S\u0006!WbcW\u0006`\u0006\u000f45N&Jo'R\u00172Cp25\u001ab\u00055'H\tn\u0002c^";
        objectArray[164] = "sF\u0012\"`Cs\rRu\u001f]b@K(so1\u0004\u0015p\u001fD4PG(zUn\fVO";
        objectArray[165] = "Q[0Ot\u000e\u0012\b7L(g\u0007[/|-\u001f\b_S\n2\u0018\u0015U8\u000e9[\u00066";
        objectArray[166] = "j(\tQcA?s\u000b\u0018^V<j\u0014G2dl)I\u001bb3js\u0017N`T.mHD^";
        objectArray[167] = "\u0004e\bX\u00103^$\u000f\u0004-\"fl\u0017KM2\u00015\u0003BR'f6\fULuXdVC\u001cK";
        objectArray[168] = "yDDU\u00004\u007fU\u001dL<j+AB[\\\u000ey\\RZ_e}W\u0011I<";
        objectArray[169] = "\u000b\u0007PQ\u0013kV\u0010\u0006\u0002|h\\\u0012:]\u0000wU\u0005Z\u0016GuYj\u0004\u0000\u00161Z\fY\u0017@b5";
        objectArray[170] = "4\u0012[D\u001eJp\u0015\u0006\u0019\u0014$vC\u000f\u0010\u001a$q\u0013\n\u0018\u0010A`IV\twX6D\n\u0013\u0012Il\u0018\u001bt\u000b\u001faD\u0001\u0011\u001aE=UfMM\u0019=A\b\tJD`Kf";
        objectArray[171] = "+\"lWl0~yn\u001eQ'}`qA=\u0015-#,\u001ajB)&\u007fY5.h!k[Q";
        objectArray[172] = "\u000bw)R\b\u001d\u0001#}\u0019k@\u00035#\u0005\u0007rRr\u007f]P%\bu9\b\u001a]\u0013w~\rk";
        objectArray[173] = "\u0015*f5X^@qu7J%F\u0011=rCEUvdfJZ@\u0011upO[Fk90\u0002U,";
        objectArray[174] = "]B2\r'E\b\u0019!\u000f5>\ryiJ<^\u001d\u001e0^5A\byi\b#A\u0000\u0015(\u000f7Cd";
        objectArray[175] = "lXJ&5D+\u0019\u001c.,(:\n\f\u001f=L(\np{iW)\u0016\u0014\u007fkSog";
        objectArray[176] = "%yS'F$k8\u000e0y>s2IZ@#zvUk\u0017u+)NZ\u0014y*rL'\u0007u-$5";
        objectArray[177] = "BN#:\u001e\f\f\u000f~-!\u0004\u001f\u0013E}\u001c\u0012\u000f\u000e!y\u001e\u0016I\u007f|}O\u0012\u0017\u0013=z[\u0010s";
        objectArray[178] = "K\u0015\t\\\u0018%\u001dSIQe= @\u0011\u0015\u0019.PL\u0014U\u001cTKJ\t\u0010\u001f$GOI\u0015e";
        objectArray[179] = "%S\b\b\r\u001du\tSS\u0003~ukV\u001a\u001e\u001ee\f\u000f\u000e\u0017\u0001pk\u0013Y\u0003\u0012{\u000e\u0002\u0003_\u0003\u001c";
        objectArray[180] = "\u0017\u0017(VC\u0006TD/U\u001foA\u00177f\u001a\u0012CztW\u0001\u0012M\u0011p\\B\u0001.";
        objectArray[181] = "jM(h5ecG\u007f.h\u001e:5*+$~*Rs?-a?5*+n%3N#!9cn5";
        objectArray[182] = "$*B9`' *\u0003h\rsBbE$mc%;Q-rvB:[%w%|eLko\u001a";
        objectArray[183] = "C$[\u001f_`\re\u0006\b``\u000exG\u000b\u001cf\b\u0015\u0001\b\u001enNyC\u0001_8r";
        objectArray[184] = "H n\raI\u000fa8\u0005x%\u001er()mTq%i\u0015|T\u0015!k\u0011:%";
        objectArray[185] = "*:+hM\u0006vlz(Fa}4sy\u0001?z4i}}\u001d(<xw\u0018\fr`i\u0010";
        objectArray[186] = "x'\u0019'l)4gT)\u0006=h0\u00005Qj2`^Yt-j2Xcybg9";
        Object[] objectArray2 = objectArray;
        objectArray[187] = "\u001d\u0010m\f$@\u001a\u0011.\u0001@_\nX\u0010\u0016{V\u000fOu\u0007!\n\u001e(lQ,V\u0004M}\u000bpGcT+\u0006,]\u0006EqZ=:";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fc_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == 'k' || c == '\u00e8' || c == 'f') {
                field = fc_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fc_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ef' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(bq_0 bq_02) {
        long l = v ^ 0x6224537F03EBL;
        long l2 = l ^ 0xFD67C4735C6L;
        CallSite callSite = fc_0.c("\u00ef", (Object)bq_02, (Object)new Object[0], (long)4745881279650187380L, (long)l);
        try {
            if (callSite == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw fc_0.c("\u00f3", (Object)matchException, (long)4743866634480964707L, (long)l);
        }
        try {
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = callSite;
            if (fc_0.c("\u00ef", (Object)fc_0.c("\u00e8", (long)4745542478023708014L, (long)l), (Object)objectArray, (long)4748531127568604904L, (long)l) != false) {
                fc_0.c("\u00ef", (Object)bq_02, (Object)new Object[0], (long)4751218462493969669L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fc_0.c("\u00f3", (Object)matchException, (long)4743866634480964707L, (long)l);
        }
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bG var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [77[DOLOOP]], but top level block is 79[WHILELOOP]
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

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = v ^ l) ^ 0x336FE85358CEL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(1.0f);
        objectArray2[1] = Float.valueOf(0.0f);
        objectArray2[0] = Float.valueOf(f);
        CallSite callSite = fc_0.c("\u00f3", (float)((float)fc_0.c("\u00ef", (Object)color, (long)-8469790141983432029L, (long)l) * fc_0.c("\u00f3", (Object)objectArray2, (long)-8482893100613670240L, (long)l)), (long)-8468171800819236144L, (long)l);
        return new Color((int)fc_0.c("\u00ef", (Object)color, (long)-8482629392101310206L, (long)l), (int)fc_0.c("\u00ef", (Object)color, (long)-8467674308091618987L, (long)l), (int)fc_0.c("\u00ef", (Object)color, (long)-8470963259653186237L, (long)l), (int)callSite);
    }

    @bP
    public void a(bJ bJ2) {
        long l = v ^ 0x1D1E2DE94513L;
        this.r = fc_0.c("\u00ef", (Object)bJ2, (Object)new Object[0], (long)515818576498777681L, (long)l);
    }

    @bP
    public void a(bb_0 bb_02) {
        block9: {
            CallSite callSite;
            long l;
            long l2;
            block8: {
                l2 = v ^ 0x56971EBEEC37L;
                l = l2 ^ 0x3B653186DA1AL;
                CallSite callSite2 = fc_0.c("\u00f3", (long)-5891235697865942652L, (long)l2);
                try {
                    try {
                        callSite = fc_0.c("\u00ef", (Object)bb_02, (Object)new Object[0], (long)-5906292531118764440L, (long)l2);
                        if (callSite2 != null) break block8;
                        if (callSite == null) break block9;
                    }
                    catch (MatchException matchException) {
                        throw fc_0.c("\u00f3", (Object)matchException, (long)-5905999071963694145L, (long)l2);
                    }
                    callSite = fc_0.c("\u00ef", (Object)bb_02, (Object)new Object[0], (long)-5906292531118764440L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw fc_0.c("\u00f3", (Object)matchException, (long)-5905999071963694145L, (long)l2);
                }
            }
            try {
                try {
                    if (callSite == fc_0.c("q", (Object)b, (long)-5907541380972346300L, (long)l2)) break block9;
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l;
                    objectArray[0] = fc_0.c("\u00ef", (Object)bb_02, (Object)new Object[0], (long)-5906292531118764440L, (long)l2);
                    if (fc_0.c("\u00ef", (Object)fc_0.c("\u00e8", (long)-5906548912585399630L, (long)l2), (Object)objectArray, (long)-5892362709938376396L, (long)l2) == false) break block9;
                }
                catch (MatchException matchException) {
                    throw fc_0.c("\u00f3", (Object)matchException, (long)-5905999071963694145L, (long)l2);
                }
                fc_0.c("\u00ef", (Object)bb_02, (Object)new Object[]{fc_0.c("\u00f3", (long)-5904774800796227203L, (long)l2)}, (long)-5904811932410822828L, (long)l2);
                fc_0.c("\u00ef", (Object)bb_02, (Object)new Object[0], (long)-5894212767292136743L, (long)l2);
            }
            catch (MatchException matchException) {
                throw fc_0.c("\u00f3", (Object)matchException, (long)-5905999071963694145L, (long)l2);
            }
        }
    }

    @bP
    public void a(bo_0 bo_02) {
        Object object;
        Object object2;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        CallSite callSite4;
        CallSite callSite5;
        CallSite callSite6;
        CallSite callSite7;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        block113: {
            block112: {
                block111: {
                    Object object3;
                    block108: {
                        block110: {
                            block109: {
                                long l13 = l12 = v ^ 0x78A6170ECF0AL;
                                l11 = l13 ^ 0x470608ADC7AL;
                                l10 = l13 ^ 0x664F98FDF503L;
                                long l14 = l13 ^ 0x63E0D22238EEL;
                                l9 = l13 ^ 0x39F2C35A6739L;
                                l8 = l13 ^ 0x6731D715F8AL;
                                l7 = l13 ^ 0x2AB28ED951C1L;
                                l6 = l13 ^ 0x699F5A854556L;
                                l5 = l13 ^ 0xFA2917F940BL;
                                long l15 = l13 ^ 0x253A59DC7859L;
                                l4 = l13 ^ 0x630C64540BC1L;
                                l3 = l13 ^ 0x685926A1CFE5L;
                                l2 = l13 ^ 0x51546B47BF8L;
                                l = l13 ^ 0x9206A9CE32CL;
                                callSite7 = fc_0.c("\u00f3", (long)-8285763043063121223L, (long)l12);
                                try {
                                    if (fc_0.c("q", (Object)b, (long)-8270548072874301575L, (long)l12) == null) {
                                        return;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l15;
                                callSite6 = fc_0.c("\u00ef", (Object)fc_0.c("\u00e8", (long)-8269992529449349868L, (long)l12), (Object)objectArray, (long)-8285344274996948543L, (long)l12);
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l14;
                                callSite5 = fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray2, (long)-8284920258221688573L, (long)l12);
                                callSite4 = fc_0.c("\u00f3", (Object)new Object[]{Float.valueOf((float)callSite5)}, (long)-8282352592376337449L, (long)l12);
                                callSite3 = fc_0.c("\u00ef", (Object)((Float)((Object)fc_0.c("\u00ef", (Object)this.d, (long)-8285923490438686765L, (long)l12))), (long)-8271286106446590483L, (long)l12);
                                callSite2 = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.e, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                                callSite = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.f, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                                try {
                                    try {
                                        try {
                                            object3 = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.h, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                                            if (callSite7 != null) break block108;
                                            if (object3 != false) break block109;
                                        }
                                        catch (MatchException matchException) {
                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                        }
                                        object3 = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.i, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                                        if (callSite7 != null) break block108;
                                    }
                                    catch (MatchException matchException) {
                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                    }
                                    if (object3 == false) break block110;
                                }
                                catch (MatchException matchException) {
                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                }
                            }
                            object3 = true;
                            break block108;
                        }
                        object3 = false;
                    }
                    object2 = object3;
                    try {
                        try {
                            object = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.j, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                            if (callSite7 != null) break block111;
                            if (object == false) break block112;
                        }
                        catch (MatchException matchException) {
                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                        }
                        object = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.i, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                    }
                    catch (MatchException matchException) {
                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                    }
                }
                try {
                    if (callSite7 != null) break block113;
                    if (object == false) break block112;
                }
                catch (MatchException matchException) {
                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                }
                object = true;
                break block113;
            }
            object = false;
        }
        Object object4 = object;
        CallSite callSite8 = fc_0.c("\u00ef", (Object)((Integer)((Object)fc_0.c("\u00ef", (Object)this.c, (long)-8285923490438686765L, (long)l12))), (long)-8284821228833632529L, (long)l12);
        int n = 0;
        CallSite callSite9 = fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)this.u, (long)-8285004279351380498L, (long)l12), (long)-8273058712552980550L, (long)l12);
        block94: while (true) {
            CallSite callSite10 = callSite9;
            block95: while (fc_0.c("\u00ef", (Object)callSite10, (long)-8270271073977605318L, (long)l12) != false) {
                CallSite callSite11 = fc_0.c("\u00ef", (Object)callSite9, (long)-8285193052574005262L, (long)l12);
                block96: while (true) {
                    int n2;
                    float f;
                    float f10;
                    Object object5;
                    CallSite callSite12;
                    float f11;
                    cN cN2;
                    block152: {
                        Object object6;
                        block143: {
                            Object object7;
                            Object object8;
                            block146: {
                                block147: {
                                    class_1657 class_16572;
                                    block144: {
                                        block145: {
                                            block142: {
                                                block141: {
                                                    block140: {
                                                        Object object9;
                                                        float f12;
                                                        float f13;
                                                        block139: {
                                                            block138: {
                                                                block136: {
                                                                    block137: {
                                                                        float f14;
                                                                        reference var67_53;
                                                                        block134: {
                                                                            block135: {
                                                                                float f15;
                                                                                Vector4f vector4f;
                                                                                float f16;
                                                                                block132: {
                                                                                    float f17;
                                                                                    block133: {
                                                                                        block131: {
                                                                                            CallSite callSite13;
                                                                                            block130: {
                                                                                                CallSite callSite14;
                                                                                                float f18;
                                                                                                float f19;
                                                                                                float f20;
                                                                                                float f21;
                                                                                                String string;
                                                                                                block128: {
                                                                                                    block129: {
                                                                                                        float f22;
                                                                                                        float f23;
                                                                                                        float f24;
                                                                                                        float f25;
                                                                                                        block151: {
                                                                                                            block127: {
                                                                                                                float f26;
                                                                                                                float f27;
                                                                                                                block126: {
                                                                                                                    float f28;
                                                                                                                    float f29;
                                                                                                                    Object object10;
                                                                                                                    block125: {
                                                                                                                        block124: {
                                                                                                                            Object object11;
                                                                                                                            block150: {
                                                                                                                                block123: {
                                                                                                                                    CallSite callSite15;
                                                                                                                                    block122: {
                                                                                                                                        Object object12;
                                                                                                                                        reference var48_34;
                                                                                                                                        CallSite callSite16;
                                                                                                                                        reference var45_31;
                                                                                                                                        block149: {
                                                                                                                                            block121: {
                                                                                                                                                Object object13;
                                                                                                                                                reference v27;
                                                                                                                                                block120: {
                                                                                                                                                    reference v25;
                                                                                                                                                    block118: {
                                                                                                                                                        block119: {
                                                                                                                                                            CallSite callSite17;
                                                                                                                                                            block117: {
                                                                                                                                                                reference v21;
                                                                                                                                                                block116: {
                                                                                                                                                                    block115: {
                                                                                                                                                                        class_4604 class_46042;
                                                                                                                                                                        block114: {
                                                                                                                                                                            Map.Entry entry = (Map.Entry)((Object)callSite11);
                                                                                                                                                                            if (n >= callSite8) break block94;
                                                                                                                                                                            class_16572 = (class_1657)fc_0.c("\u00ef", (Object)entry, (long)-8271360745817861041L, (long)l12);
                                                                                                                                                                            cN2 = (cN)((Object)fc_0.c("\u00ef", (Object)entry, (long)-8272030607137017818L, (long)l12));
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    class_46042 = this.r;
                                                                                                                                                                                    if (callSite7 != null) break block114;
                                                                                                                                                                                    if (class_46042 == null) break block115;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                                                }
                                                                                                                                                                                class_46042 = this.r;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            if (fc_0.c("\u00ef", (Object)class_46042, (Object)fc_0.c("\u00ef", (Object)class_16572, (long)-8268912732009871934L, (long)l12), (long)-8285103913785274185L, (long)l12) == false) {
                                                                                                                                                                                continue block94;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    var45_31 = fc_0.c("\u00ef", (Object)fc_0.c("q", (Object)b, (long)-8270548072874301575L, (long)l12), (Object)class_16572, (long)-8269061868999499401L, (long)l12);
                                                                                                                                                                    try {
                                                                                                                                                                        if (var45_31 > callSite3) {
                                                                                                                                                                            continue block94;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                                    }
                                                                                                                                                                    Object[] objectArray = new Object[2];
                                                                                                                                                                    objectArray[1] = l4;
                                                                                                                                                                    objectArray[0] = class_16572;
                                                                                                                                                                    CallSite callSite18 = fc_0.c("\u00f3", (Object)objectArray, (long)-8272190569893775291L, (long)l12);
                                                                                                                                                                    Object[] objectArray3 = new Object[2];
                                                                                                                                                                    objectArray3[1] = l10;
                                                                                                                                                                    objectArray3[0] = fc_0.c("\u00ef", (Object)callSite18, (double)0.0, (double)((double)fc_0.c("\u00ef", (Object)class_16572, (long)-8268764597367166290L, (long)l12) + 0.5 * (double)(var45_31 / 10.0f)), (double)0.0, (long)-8269845882577071610L, (long)l12);
                                                                                                                                                                    callSite16 = fc_0.c("\u00f3", (Object)objectArray3, (long)-8270808775883222826L, (long)l12);
                                                                                                                                                                    try {
                                                                                                                                                                        reference v21 = fc_0.c("q", (Object)callSite16, (long)-8285021372864730474L, (long)l12) - 0.0;
                                                                                                                                                                        v21 = v21 == 0 ? 0 : (v21 < 0 ? -1 : 1);
                                                                                                                                                                        if (callSite7 != null) break block116;
                                                                                                                                                                        if (v21 < 0) continue block94;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        callSite17 = callSite16;
                                                                                                                                                                        if (callSite7 != null) break block117;
                                                                                                                                                                        reference v21 = fc_0.c("q", (Object)callSite17, (long)-8285021372864730474L, (long)l12) - 1.0;
                                                                                                                                                                        v21 = v21 == 0 ? 0 : (v21 > 0 ? 1 : -1);
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (v21 >= 0) continue block94;
                                                                                                                                                                ++n;
                                                                                                                                                                callSite17 = fc_0.c("\u00ef", (Object)this.a, (long)-8285923490438686765L, (long)l12);
                                                                                                                                                            }
                                                                                                                                                            var48_34 = fc_0.c("\u00ef", (Object)((Float)((Object)callSite17)), (long)-8271286106446590483L, (long)l12) * 0.8f - var45_31 / 300.0f;
                                                                                                                                                            try {
                                                                                                                                                                reference v25 = var48_34 - 0.15f;
                                                                                                                                                                v25 = v25 == 0 ? 0 : (v25 < 0 ? -1 : 1);
                                                                                                                                                                if (callSite7 != null) break block118;
                                                                                                                                                                if (v25 >= 0) break block119;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                            }
                                                                                                                                                            var48_34 = (reference)0.15f;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            v27 = var45_31;
                                                                                                                                                            object13 = callSite3 - 10.0f;
                                                                                                                                                            if (callSite7 != null) break block120;
                                                                                                                                                            reference v25 = v27 - object13;
                                                                                                                                                            v25 = v25 == 0 ? 0 : (v25 > 0 ? 1 : -1);
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        if (v25 <= 0) break block121;
                                                                                                                                                        v27 = (callSite3 - var45_31) / 10.0f;
                                                                                                                                                        object13 = 0.0f;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                Object[] objectArray = new Object[4];
                                                                                                                                                objectArray[3] = l8;
                                                                                                                                                objectArray[2] = Float.valueOf(1.0f);
                                                                                                                                                objectArray[1] = Float.valueOf((float)object13);
                                                                                                                                                objectArray[0] = Float.valueOf((float)v27);
                                                                                                                                                object12 = fc_0.c("\u00f3", (Object)objectArray, (long)-8285918838199063068L, (long)l12);
                                                                                                                                                break block149;
                                                                                                                                            }
                                                                                                                                            object12 = 1.0f;
                                                                                                                                        }
                                                                                                                                        f11 = object12;
                                                                                                                                        f13 = (float)fc_0.c("q", (Object)callSite16, (long)-8271237032992740075L, (long)l12) / var48_34;
                                                                                                                                        f25 = (float)fc_0.c("q", (Object)callSite16, (long)-8286483994091012420L, (long)l12) / var48_34;
                                                                                                                                        callSite12 = fc_0.c("\u00ef", (Object)new Matrix4f(), (float)var48_34, (float)var48_34, (float)var48_34, (long)-8272373199026107337L, (long)l12);
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                callSite15 = callSite2;
                                                                                                                                                if (callSite7 != null) break block122;
                                                                                                                                                if (callSite15 == false) break block123;
                                                                                                                                            }
                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                            }
                                                                                                                                            callSite15 = fc_0.c("\u00f3", (float)var45_31, (long)-8268829359376005740L, (long)l12);
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    object11 = (int)callSite15 + "m";
                                                                                                                                    break block150;
                                                                                                                                }
                                                                                                                                object11 = "";
                                                                                                                            }
                                                                                                                            string = object11;
                                                                                                                            try {
                                                                                                                                if (fc_0.c("\u00ef", string, (long)-8269933808505999137L, (long)l12) == false) break block124;
                                                                                                                                object10 = 0.0f;
                                                                                                                                break block125;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        Object[] objectArray = new Object[2];
                                                                                                                        objectArray[1] = l5;
                                                                                                                        objectArray[0] = string;
                                                                                                                        object10 = fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray, (long)-8271765225696867319L, (long)l12) * 0.65f;
                                                                                                                    }
                                                                                                                    f21 = object10;
                                                                                                                    try {
                                                                                                                        float f28 = cN2.i;
                                                                                                                        f28 = fc_0.c("\u00ef", cN2.d, (long)-8269933808505999137L, (long)l12) != false ? 0.0f : 3.0f + cN2.j;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                    }
                                                                                                                    f24 = f29 + f28;
                                                                                                                    float f30 = 0.0f;
                                                                                                                    if (fc_0.c("\u00ef", string, (long)-8269933808505999137L, (long)l12) == false) {
                                                                                                                        f30 = f21;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            float f26 = f24;
                                                                                                                            f26 = f30;
                                                                                                                            f26 = 0.0f;
                                                                                                                            if (callSite7 != null) break block126;
                                                                                                                            if (!(f27 > f26)) break block127;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                        }
                                                                                                                        float f26 = 6.0f;
                                                                                                                        f26 = f30;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                                    }
                                                                                                                }
                                                                                                                f22 = f27 + f26;
                                                                                                                break block151;
                                                                                                            }
                                                                                                            f22 = 0.0f;
                                                                                                        }
                                                                                                        float f31 = f23 + f22;
                                                                                                        float f32 = 60.0f;
                                                                                                        CallSite callSite19 = fc_0.c("\u00f3", (float)f31, (float)f32, (long)-8271150546802016297L, (long)l12);
                                                                                                        if (callSite != false) {
                                                                                                            callSite19 = fc_0.c("\u00f3", (float)callSite19, (float)(f24 + 6.0f + cN2.k), (long)-8271150546802016297L, (long)l12);
                                                                                                        }
                                                                                                        reference var60_46 = callSite19 + 11.0f;
                                                                                                        float f33 = f13 - var60_46 / 2.0f;
                                                                                                        f12 = f25 - callSite4 / 2.0f;
                                                                                                        Object[] objectArray = new Object[10];
                                                                                                        objectArray[9] = l11;
                                                                                                        objectArray[8] = Float.valueOf(4.0f);
                                                                                                        objectArray[7] = 5;
                                                                                                        objectArray[6] = Float.valueOf((float)callSite4);
                                                                                                        objectArray[5] = Float.valueOf((float)var60_46);
                                                                                                        objectArray[4] = Float.valueOf(f12);
                                                                                                        objectArray[3] = Float.valueOf(f33);
                                                                                                        objectArray[2] = callSite12;
                                                                                                        objectArray[1] = bo_02.b;
                                                                                                        objectArray[0] = bo_02.a;
                                                                                                        fc_0.c("\u00f3", (Object)objectArray, (long)-8284719455057219195L, (long)l12);
                                                                                                        Object[] objectArray4 = new Object[3];
                                                                                                        objectArray4[2] = l6;
                                                                                                        objectArray4[1] = Float.valueOf(f11);
                                                                                                        objectArray4[0] = cn_0.r;
                                                                                                        Object[] objectArray5 = new Object[10];
                                                                                                        objectArray5[9] = l7;
                                                                                                        objectArray5[8] = Float.valueOf(4.0f);
                                                                                                        objectArray5[7] = fc_0.c("\u00f3", (Object)objectArray4, (long)-8269167661347295744L, (long)l12);
                                                                                                        objectArray5[6] = Float.valueOf((float)callSite4);
                                                                                                        objectArray5[5] = Float.valueOf((float)var60_46);
                                                                                                        objectArray5[4] = Float.valueOf(f12);
                                                                                                        objectArray5[3] = Float.valueOf(f33);
                                                                                                        objectArray5[2] = callSite12;
                                                                                                        objectArray5[1] = bo_02.b;
                                                                                                        objectArray5[0] = bo_02.a;
                                                                                                        fc_0.c("\u00f3", (Object)objectArray5, (long)-8286087149118978500L, (long)l12);
                                                                                                        f20 = f12 + 3.0f;
                                                                                                        f19 = f33 + 5.5f;
                                                                                                        f18 = f33 + var60_46 - 5.5f;
                                                                                                        Object[] objectArray6 = new Object[3];
                                                                                                        objectArray6[2] = l6;
                                                                                                        objectArray6[1] = Float.valueOf(f11);
                                                                                                        objectArray6[0] = cN2.b;
                                                                                                        Object[] objectArray7 = new Object[6];
                                                                                                        objectArray7[5] = l2;
                                                                                                        objectArray7[4] = fc_0.c("\u00f3", (Object)objectArray6, (long)-8269167661347295744L, (long)l12);
                                                                                                        objectArray7[3] = Float.valueOf(f20);
                                                                                                        objectArray7[2] = Float.valueOf(f19);
                                                                                                        objectArray7[1] = cN2.a;
                                                                                                        objectArray7[0] = callSite12;
                                                                                                        fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray7, (long)-8286435680068181928L, (long)l12);
                                                                                                        float f34 = f19 + cN2.i + 3.0f;
                                                                                                        try {
                                                                                                            callSite14 = fc_0.c("\u00ef", cN2.d, (long)-8269933808505999137L, (long)l12);
                                                                                                            if (callSite7 != null) break block128;
                                                                                                            if (callSite14 != false) break block129;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                        }
                                                                                                        var67_53 = callSite5 - callSite5 * 0.75f;
                                                                                                        Object[] objectArray8 = new Object[3];
                                                                                                        objectArray8[2] = l6;
                                                                                                        objectArray8[1] = Float.valueOf(f11);
                                                                                                        objectArray8[0] = p;
                                                                                                        Object[] objectArray9 = new Object[7];
                                                                                                        objectArray9[6] = l;
                                                                                                        objectArray9[5] = fc_0.c("\u00f3", (Object)objectArray8, (long)-8269167661347295744L, (long)l12);
                                                                                                        objectArray9[4] = Float.valueOf(0.75f);
                                                                                                        objectArray9[3] = Float.valueOf(f20 + var67_53);
                                                                                                        objectArray9[2] = Float.valueOf(f34);
                                                                                                        objectArray9[1] = cN2.d;
                                                                                                        objectArray9[0] = callSite12;
                                                                                                        fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray9, (long)-8284378510003426170L, (long)l12);
                                                                                                    }
                                                                                                    callSite14 = fc_0.c("\u00ef", string, (long)-8269933808505999137L, (long)l12);
                                                                                                }
                                                                                                if (callSite14 == false) {
                                                                                                    var67_53 = callSite5 - callSite5 * 0.65f;
                                                                                                    Object[] objectArray = new Object[3];
                                                                                                    objectArray[2] = l6;
                                                                                                    objectArray[1] = Float.valueOf(f11);
                                                                                                    objectArray[0] = cn_0.u;
                                                                                                    Object[] objectArray10 = new Object[7];
                                                                                                    objectArray10[6] = l;
                                                                                                    objectArray10[5] = fc_0.c("\u00f3", (Object)objectArray, (long)-8269167661347295744L, (long)l12);
                                                                                                    objectArray10[4] = Float.valueOf(0.65f);
                                                                                                    objectArray10[3] = Float.valueOf(f20 + var67_53);
                                                                                                    objectArray10[2] = Float.valueOf(f18 - f21);
                                                                                                    objectArray10[1] = string;
                                                                                                    objectArray10[0] = callSite12;
                                                                                                    fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray10, (long)-8284378510003426170L, (long)l12);
                                                                                                }
                                                                                                var67_53 = (reference)(f20 + callSite5 + 1.0f);
                                                                                                f16 = f19;
                                                                                                f14 = f18;
                                                                                                try {
                                                                                                    try {
                                                                                                        callSite13 = callSite;
                                                                                                        if (callSite7 != null) break block130;
                                                                                                        if (callSite13 == false) break block131;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                    }
                                                                                                    callSite13 = fc_0.c("\u00ef", cN2.h, (long)-8269933808505999137L, (long)l12);
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                                }
                                                                                            }
                                                                                            if (callSite13 == false) {
                                                                                                f14 -= cN2.k + 3.0f;
                                                                                            }
                                                                                        }
                                                                                        float f35 = f14 - f16;
                                                                                        vector4f = new Vector4f(1.5f, 1.5f, 1.5f, 1.5f);
                                                                                        Object[] objectArray = new Object[3];
                                                                                        objectArray[2] = l6;
                                                                                        objectArray[1] = Float.valueOf(f11);
                                                                                        objectArray[0] = fc_0.n;
                                                                                        Object[] objectArray11 = new Object[8];
                                                                                        objectArray11[7] = l9;
                                                                                        objectArray11[6] = vector4f;
                                                                                        objectArray11[5] = fc_0.c("\u00f3", (Object)objectArray, (long)-8269167661347295744L, (long)l12);
                                                                                        objectArray11[4] = Float.valueOf((float)(var67_53 + 4.0f));
                                                                                        objectArray11[3] = Float.valueOf(f16 + f35);
                                                                                        objectArray11[2] = Float.valueOf((float)var67_53);
                                                                                        objectArray11[1] = Float.valueOf(f16);
                                                                                        objectArray11[0] = callSite12;
                                                                                        fc_0.c("\u00f3", (Object)objectArray11, (long)-8286605992937314456L, (long)l12);
                                                                                        float f36 = f16 + f35 * cN2.f;
                                                                                        f15 = f16 + f35 * cN2.e;
                                                                                        try {
                                                                                            try {
                                                                                                float f30 = cN2.f - (cN2.e + 0.001f);
                                                                                                object9 = f30 == 0.0f ? 0 : (f30 > 0.0f ? 1 : -1);
                                                                                                if (callSite7 != null) break block132;
                                                                                                if (object9 <= 0) break block133;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                            }
                                                                                            Object[] objectArray12 = new Object[3];
                                                                                            objectArray12[2] = l6;
                                                                                            objectArray12[1] = Float.valueOf(f11);
                                                                                            objectArray12[0] = o;
                                                                                            Object[] objectArray13 = new Object[8];
                                                                                            objectArray13[7] = l9;
                                                                                            objectArray13[6] = vector4f;
                                                                                            objectArray13[5] = fc_0.c("\u00f3", (Object)objectArray12, (long)-8269167661347295744L, (long)l12);
                                                                                            objectArray13[4] = Float.valueOf((float)(var67_53 + 4.0f));
                                                                                            objectArray13[3] = Float.valueOf(f36);
                                                                                            objectArray13[2] = Float.valueOf((float)var67_53);
                                                                                            objectArray13[1] = Float.valueOf(f15);
                                                                                            objectArray13[0] = callSite12;
                                                                                            fc_0.c("\u00f3", (Object)objectArray13, (long)-8286605992937314456L, (long)l12);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                        }
                                                                                    }
                                                                                    object9 = (f17 = cN2.e - 0.001f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite7 != null) break block134;
                                                                                        if (object9 <= 0) break block135;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                    }
                                                                                    Object[] objectArray = new Object[3];
                                                                                    objectArray[2] = l6;
                                                                                    objectArray[1] = Float.valueOf(f11);
                                                                                    objectArray[0] = cN2.g;
                                                                                    Object[] objectArray14 = new Object[8];
                                                                                    objectArray14[7] = l9;
                                                                                    objectArray14[6] = vector4f;
                                                                                    objectArray14[5] = fc_0.c("\u00f3", (Object)objectArray, (long)-8269167661347295744L, (long)l12);
                                                                                    objectArray14[4] = Float.valueOf((float)(var67_53 + 4.0f));
                                                                                    objectArray14[3] = Float.valueOf(f15);
                                                                                    objectArray14[2] = Float.valueOf((float)var67_53);
                                                                                    objectArray14[1] = Float.valueOf(f16);
                                                                                    objectArray14[0] = callSite12;
                                                                                    fc_0.c("\u00f3", (Object)objectArray14, (long)-8286605992937314456L, (long)l12);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                }
                                                                            }
                                                                            object9 = callSite;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (callSite7 != null) break block136;
                                                                                    if (object9 == false) break block137;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                                }
                                                                                object9 = fc_0.c("\u00ef", cN2.h, (long)-8269933808505999137L, (long)l12);
                                                                                if (callSite7 != null) break block136;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                            }
                                                                            if (object9 != false) break block137;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                        }
                                                                        reference var74_60 = var67_53 + 2.0f - callSite5 * 0.75f / 2.0f;
                                                                        Object[] objectArray = new Object[3];
                                                                        objectArray[2] = l6;
                                                                        objectArray[1] = Float.valueOf(f11);
                                                                        objectArray[0] = cN2.g;
                                                                        Object[] objectArray15 = new Object[7];
                                                                        objectArray15[6] = l;
                                                                        objectArray15[5] = fc_0.c("\u00f3", (Object)objectArray, (long)-8269167661347295744L, (long)l12);
                                                                        objectArray15[4] = Float.valueOf(0.75f);
                                                                        objectArray15[3] = Float.valueOf((float)var74_60);
                                                                        objectArray15[2] = Float.valueOf(f14 + 3.0f);
                                                                        objectArray15[1] = cN2.h;
                                                                        objectArray15[0] = callSite12;
                                                                        fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray15, (long)-8284378510003426170L, (long)l12);
                                                                    }
                                                                    object9 = object2;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite7 != null) break block138;
                                                                        if (object9 == false) break;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                    }
                                                                    object9 = fc_0.c("\u00ef", (Object)cN2.l, (long)-8285267299883855885L, (long)l12);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite7 != null) break block139;
                                                                    if (object9 != false) break;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                                }
                                                                object9 = fc_0.c("\u00ef", (Object)cN2.l, (long)-8270059965309697960L, (long)l12);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                            }
                                                        }
                                                        object5 = object9;
                                                        float f38 = 9.6f;
                                                        f10 = f12 - f38 - 2.0f;
                                                        f = f13 - (float)object5 * 12.0f / 2.0f + 1.0f;
                                                        for (n2 = 0; n2 < object5; ++n2) {
                                                            try {
                                                                Object[] objectArray = new Object[6];
                                                                objectArray[5] = l3;
                                                                objectArray[4] = callSite12;
                                                                objectArray[3] = Float.valueOf(0.6f);
                                                                objectArray[2] = Float.valueOf(f10);
                                                                objectArray[1] = Float.valueOf(f + (float)n2 * 12.0f);
                                                                objectArray[0] = (class_1799)fc_0.c("\u00ef", (Object)cN2.l, (int)n2, (long)-8284448040461945280L, (long)l12);
                                                                fc_0.c("\u00f3", (Object)objectArray, (long)-8272095999117149242L, (long)l12);
                                                                if (callSite7 != null) break block96;
                                                                if (callSite7 == null) continue;
                                                                break;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                object8 = object4;
                                                                if (callSite7 != null) break block140;
                                                                if (object8 == false) break;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                            }
                                                            object8 = fc_0.c("\u00ef", (Object)cN2.m, (long)-8285267299883855885L, (long)l12);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite7 != null) break block141;
                                                            if (object8 != false) break;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                        }
                                                        object8 = fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.h, (long)-8285923490438686765L, (long)l12))), (long)-8269518420899800511L, (long)l12);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (callSite7 != null) break block142;
                                                        if (object8 == false) break block143;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                    }
                                                    object8 = fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)class_16572, (long)-8270400863485453713L, (long)l12), (long)-8285383089072271319L, (long)l12);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                                }
                                            }
                                            try {
                                                if (callSite7 != null) break block144;
                                                if (object8 == false) break block145;
                                            }
                                            catch (MatchException matchException) {
                                                throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                            }
                                            object8 = false;
                                            break block144;
                                        }
                                        object8 = true;
                                    }
                                    try {
                                        object7 = fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)class_16572, (long)-8286137965162031265L, (long)l12), (long)-8285383089072271319L, (long)l12);
                                        if (callSite7 != null) break block146;
                                        if (object7 == false) break block147;
                                    }
                                    catch (MatchException matchException) {
                                        throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                    }
                                    object7 = false;
                                    break block146;
                                }
                                object7 = true;
                            }
                            object6 = object8 + object7;
                            break block152;
                        }
                        object6 = 0;
                    }
                    for (int i = n2 = (v3058006); i < object5; ++i) {
                        float f39 = f + (float)i * 12.0f;
                        float f40 = 0.0f;
                        class_1799 class_17992 = (class_1799)fc_0.c("\u00ef", (Object)cN2.l, (int)i, (long)-8284448040461945280L, (long)l12);
                        callSite10 = fc_0.c("\u00ef", (Object)cN2.m, (long)-8271458512002420604L, (long)l12);
                        if (callSite7 != null) continue block95;
                        CallSite callSite20 = callSite10;
                        while (fc_0.c("\u00ef", (Object)callSite20, (long)-8270271073977605318L, (long)l12) != false) {
                            block148: {
                                cO cO2 = (cO)((Object)fc_0.c("\u00ef", (Object)callSite20, (long)-8285193052574005262L, (long)l12));
                                try {
                                    if (callSite7 != null) break block148;
                                    callSite11 = cO2.a;
                                    if (callSite7 != null) continue block96;
                                }
                                catch (MatchException matchException) {
                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                }
                                try {
                                    if (callSite11 != class_17992) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fc_0.c("\u00f3", (Object)matchException, (long)-8271842495019542398L, (long)l12);
                                }
                                Object[] objectArray = new Object[3];
                                objectArray[2] = l6;
                                objectArray[1] = Float.valueOf(f11);
                                objectArray[0] = cn_0.t;
                                Object[] objectArray16 = new Object[7];
                                objectArray16[6] = l;
                                objectArray16[5] = fc_0.c("\u00f3", (Object)objectArray, (long)-8269167661347295744L, (long)l12);
                                objectArray16[4] = Float.valueOf(0.5f);
                                objectArray16[3] = Float.valueOf(f10 - callSite5 * 0.5f - f40);
                                objectArray16[2] = Float.valueOf(f39);
                                objectArray16[1] = cO2.b;
                                objectArray16[0] = callSite12;
                                fc_0.c("\u00ef", (Object)callSite6, (Object)objectArray16, (long)-8284378510003426170L, (long)l12);
                                f40 += callSite5 * 0.5f;
                            }
                            if (callSite7 == null) continue;
                        }
                        if (callSite7 == null) continue;
                    }
                    break;
                }
                if (callSite7 != null) break block94;
                continue block94;
            }
            break;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
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
            case 0 -> 25;
            case 1 -> 56;
            case 2 -> 52;
            case 3 -> 43;
            case 4 -> 22;
            case 5 -> 51;
            case 6 -> 15;
            case 7 -> 42;
            case 8 -> 55;
            case 9 -> 54;
            case 10 -> 53;
            case 11 -> 58;
            case 12 -> 49;
            case 13 -> 1;
            case 14 -> 36;
            case 15 -> 45;
            case 16 -> 26;
            case 17 -> 10;
            case 18 -> 9;
            case 19 -> 28;
            case 20 -> 16;
            case 21 -> 57;
            case 22 -> 12;
            case 23 -> 60;
            case 24 -> 48;
            case 25 -> 20;
            case 26 -> 34;
            case 27 -> 6;
            case 28 -> 38;
            case 29 -> 61;
            case 30 -> 39;
            case 31 -> 47;
            case 32 -> 0;
            case 33 -> 3;
            case 34 -> 37;
            case 35 -> 50;
            case 36 -> 7;
            case 37 -> 31;
            case 38 -> 11;
            case 39 -> 63;
            case 40 -> 32;
            case 41 -> 62;
            case 42 -> 59;
            case 43 -> 17;
            case 44 -> 14;
            case 45 -> 2;
            case 46 -> 40;
            case 47 -> 23;
            case 48 -> 24;
            case 49 -> 19;
            case 50 -> 4;
            case 51 -> 13;
            case 52 -> 44;
            case 53 -> 46;
            case 54 -> 8;
            case 55 -> 29;
            case 56 -> 33;
            case 57 -> 5;
            case 58 -> 41;
            case 59 -> 27;
            case 60 -> 30;
            case 61 -> 35;
            case 62 -> 21;
            default -> 18;
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
        fc_0.A[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fc_0.m(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = fc_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fc_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fc_0.g(clazz3, string2, clazz2)) != null) {
                    fc_0.z[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fc_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fc_0.z[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fc_0.n(219798334224866L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fc_0.m(l, l2);
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
                clazz3 = fc_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fc_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fc_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fc_0.z[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fc_0.n(219798334224866L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fc_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fc_0.z[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fc_0.n(219798334224866L, 0L);
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

    private boolean lambda$new$0(Boolean bl) {
        long l = v ^ 0x2A50594EE632L;
        return (boolean)fc_0.c("\u00ef", (Object)((Boolean)((Object)fc_0.c("\u00ef", (Object)this.i, (long)-6612921931625234709L, (long)l))), (long)-6628007579673431175L, (long)l);
    }

    private static String lambda$getEnchantmentData$2(class_5321 class_53212) {
        long l = v ^ 0x688595C60CL;
        return fc_0.c("\u00ef", (Object)fc_0.c("\u00ef", (Object)class_53212, (long)-8933857494638129071L, (long)l), (long)-8918896799772414290L, (long)l);
    }

    private static int lambda$onTick$1(Map.Entry entry, Map.Entry entry2) {
        long l = v ^ 0x3B8B7E27424DL;
        return (int)fc_0.c("\u00f3", (float)fc_0.c("\u00ef", (Object)fc_0.c("q", (Object)b, (long)35570806329223742L, (long)l), (Object)((class_1297)fc_0.c("\u00ef", (Object)entry2, (long)31940901928638728L, (long)l)), (long)34101524022373424L, (long)l), (float)fc_0.c("\u00ef", (Object)fc_0.c("q", (Object)b, (long)35570806329223742L, (long)l), (Object)((class_1297)fc_0.c("\u00ef", (Object)entry, (long)31940901928638728L, (long)l)), (long)34101524022373424L, (long)l), (long)19759221600219851L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fc_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fc_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


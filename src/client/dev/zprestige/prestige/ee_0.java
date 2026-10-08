/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_239
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
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
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_239;
import net.minecraft.class_3965;

/*
 * Renamed from dev.zprestige.prestige.ee
 */
public class ee_0
extends dV {
    public static boolean a;
    private dM d;
    private dM c;
    private dM e;
    private dQ f;
    private dM g;
    private dR h;
    private dQ i;
    private dM j;
    private f5 k;
    private int l;
    private static final long m;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final long[] q;
    private static final Integer[] r;
    private static final Map s;
    private static final Object[] t;
    private static final String[] u;

    public ee_0() {
        long l;
        long l2 = l = m ^ 0x1E4CCC2C100AL;
        long l3 = l2 ^ 0x582AE92F912L;
        long l4 = l2 ^ 0x33DB99CD8A18L;
        this.k = new f5(l4);
        this.l = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = this::lambda$new$0;
        ee_0.d("\u00df", (Object)this.i, (Object)objectArray, (long)8187515910538323472L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        ee_0.m = hc.a(4150881502962414527L, -5937142592618194777L, MethodHandles.lookup().lookupClass()).a(247455358003845L);
                        ee_0.t = new Object[158];
                        ee_0.u = new String[158];
                        ee_0.f();
                        ee_0.p = new HashMap<K, V>(13);
                        var11 = ee_0.m ^ 50940451505609L;
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
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "%|@\u00fcGD\u0010IZ\u00d0\u00c9\u001e\u00aa\u00bb\u00b2\u00ffI&\u00d2\u00edu\u00e1\u0011\u00ad\u009e\u0016N\u00a7\u00bd8\u00fc\u00e0 :&\u007f\u00fd\u00a8\u00ec\u0004q#\u0010r\u00825\b\u00f8\u00d7>\u00f1\u00c8{\u00a0\u008b\u0010\u00c2\u0092@\u0091\u009c\u009dv\u00b8\u000f \u00e5\u008dZ\u0002\u0007\u00ca\u000f\u00cb\u00efi\u00d4\u00e4\u00ed\u0097\u00bc\u00002YS!0\u008bc\u0089\u00f7\u00cb\u000b\u00f2\u00b7O\u00cf\u0019 \u0019\u008dJzo#\u00b4\u008d7w)\u00afGp\r\u00c4y\u00a7\u0099\f\u00aa\u009a\u00dc\u00dd\b\u0007\u00d4+#<|\u0010";
                        var19_6 = "%|@\u00fcGD\u0010IZ\u00d0\u00c9\u001e\u00aa\u00bb\u00b2\u00ffI&\u00d2\u00edu\u00e1\u0011\u00ad\u009e\u0016N\u00a7\u00bd8\u00fc\u00e0 :&\u007f\u00fd\u00a8\u00ec\u0004q#\u0010r\u00825\b\u00f8\u00d7>\u00f1\u00c8{\u00a0\u008b\u0010\u00c2\u0092@\u0091\u009c\u009dv\u00b8\u000f \u00e5\u008dZ\u0002\u0007\u00ca\u000f\u00cb\u00efi\u00d4\u00e4\u00ed\u0097\u00bc\u00002YS!0\u008bc\u0089\u00f7\u00cb\u000b\u00f2\u00b7O\u00cf\u0019 \u0019\u008dJzo#\u00b4\u008d7w)\u00afGp\r\u00c4y\u00a7\u0099\f\u00aa\u009a\u00dc\u00dd\b\u0007\u00d4+#<|\u0010".length();
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
                            var20_3[var18_4++] = ee_0.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "V\u00e5)\u001b\u00ee@Y\u00d2\u00a2W\u00fc\u008e\u008b\u00fdj\u009a\u0010\u00e30\u0095\u00b9O\u00d9\u009a\u00c2\u00e6-\f\u00edL\u0090\u00cf6";
                            var19_6 = "V\u00e5)\u001b\u00ee@Y\u00d2\u00a2W\u00fc\u008e\u008b\u00fdj\u009a\u0010\u00e30\u0095\u00b9O\u00d9\u009a\u00c2\u00e6-\f\u00edL\u0090\u00cf6".length();
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
                            var20_3[var18_4++] = ee_0.b(var21_9).intern();
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
                ee_0.n = var20_3;
                ee_0.o = new String[6];
                ee_0.s = new HashMap<K, V>(13);
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
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u0099\u00d02\u00c2\u0004rG\u00bby\u00ea\u0098V \u00f3\u00dd\u0019\u00bc\u0003\u0083p\u00c5\u00ef\u00a0j\u0082\u00caQ\u00cb\u009e\u00ac\u00f8H";
                var5_15 = "\u0099\u00d02\u00c2\u0004rG\u00bby\u00ea\u0098V \u00f3\u00dd\u0019\u00bc\u0003\u0083p\u00c5\u00ef\u00a0j\u0082\u00caQ\u00cb\u009e\u00ac\u00f8H".length();
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
                    var4_14 = "!\u00eb\u008a\u008e\u00b6<\u000f8j\u00b4sK\u00f7\u00af\u00d4@";
                    var5_15 = "!\u00eb\u008a\u008e\u00b6<\u000f8j\u00b4sK\u00f7\u00af\u00d4@".length();
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
        ee_0.q = var6_12;
        ee_0.r = new Integer[6];
        ee_0.a = 0;
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        a = 0;
        this.l = 0;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x341;
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
                throw new RuntimeException("dev/zprestige/prestige/ee", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = ee_0.n[n2].getBytes("ISO-8859-1");
            ee_0.o[n2] = ee_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
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
        String string2 = ee_0.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/ee" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (boolean)ee_0.d("\u00df", (Object)ee_0.b("k", (int)27497, (long)(0x2DE92BC41484FE64L ^ l)), (Object)ee_0.d("\u00df", (Object)this.h, (long)1609838165426212822L, (long)l), (long)1609933220557637367L, (long)l);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ee_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7CA9;
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
                throw new RuntimeException("dev/zprestige/prestige/ee", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ee_0.r[n2] = n3;
        }
        return r[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ee" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ee_0.m(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                ee_0.t[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ee_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ee_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ee_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ee_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = t;
        t[0] = "v!\u0013K]Mh)\t\u0004 ]h";
        objectArray[1] = "5:\t>\b\u0004>5\u0018qi\n5>\u001c+";
        objectArray[2] = "HTHU$.^TM\u000f79I\u001fN\t;-XXY\u001ep:}";
        objectArray[3] = "5_N\u0002U\u0005@\u007fE\rDJ!qN\u0006@\u0010U";
        objectArray[4] = Void.TYPE;
        ee_0.u[4] = "java/lang/Void";
        objectArray[5] = "\u0006jF\u001eqO\u0010jCDbX\u0007!@BnL\u0016fWU%YW";
        objectArray[6] = "ZT)\u000e?p/t\"\u0001.?Nz)\n*e:";
        objectArray[7] = ";nRFa<-nW\u001cr+:%T\u001a~?+bC\r5(\u0014";
        objectArray[8] = "\u001a\u001a\"\u0006_T\u0011\u00153I\"L\u0002\u0012:\u0000";
        objectArray[9] = Boolean.TYPE;
        ee_0.u[9] = "java/lang/Boolean";
        objectArray[10] = "\u0014l\b[YG\u0014l\u001f\u0007UH\u000e'\u001f\u0019U]\tVMM\u0004\u001c";
        objectArray[11] = ">z+b\"\n>z<>.\u0005$1< .\u0010#@n{vQ";
        objectArray[12] = "Z_#fb/L_&<q8[\u0014%:},JS2-6>v";
        objectArray[13] = "/[6\u0013KBZ{=\u001cZ\r'c.\u001bSDO";
        objectArray[14] = "aiEM!\u001caiR\u0011-\u0013{\"R\u000f-\u0006|S\u0003QxM";
        objectArray[15] = "\u000e\f%\u001e1\u000f\u000e\f2B=\u0000\u0014G2\\=\u0015\u00136c\u0002hP";
        objectArray[16] = "]6?=*6]6(a&9G}(\u007f&,@\fx\"w";
        objectArray[17] = "x h}gXx \u007f!kWbk\u007f?kBe\u001a+g<";
        objectArray[18] = "\u0007,a\u0018Q-r\fj\u0017@b\u0013\u0002a\u001cD8g";
        objectArray[19] = "?/F%I\\)/C\u007fZK>d@yV_/#Wn\u001dH\r";
        objectArray[20] = "9S^e&qLsUj7>-}^a3dY";
        objectArray[21] = Integer.TYPE;
        ee_0.u[21] = "java/lang/Integer";
        objectArray[22] = "[F$N\u0005m[F3\u0012\tbA\r3\f\twF|aWQ=";
        objectArray[23] = "`0q`qav0t:bva{w<nbp<`+%ta";
        objectArray[24] = "\rq{\u00198D\u0006~jV[I\u0013se=nK\u0002`y\u0011yF";
        objectArray[25] = "M]n\u0015Ds[]kOWdL\u0016hI[p]Q\u007f^\u0010`[";
        objectArray[26] = "\f\u000b.<9\ty+%3(F\u0018%.8,\u001cl";
        objectArray[27] = "\u0006}{\u0003}_s]p\fl\u0010\u0012S{\u0007hJf";
        objectArray[28] = "WR#4(cWR4h$lM\u00194v$yJhe)|";
        objectArray[29] = "W{\u0017lE\n\"[\u001ccTECU\u0017hP\u001f7";
        objectArray[30] = "\u0018\f\u0014yu7\u000e\f\u0011#f \u0019G\u0012%j4\b\u0000\u00052!&\u0013";
        objectArray[31] = "\u0014~r\"8ma^y-)\"\u0000Pr&-xt";
        objectArray[32] = "\"\u0004ql-$\"\u0004f0!+8Of.!>?>3qx";
        objectArray[33] = "z}F:I \u000f]M5XonSF>\\5\u001a";
        objectArray[34] = "a\u007f\u000b4,wa\u007f\u001ch x{4\u001cv m|EM)r&";
        objectArray[35] = "!\u001c-\u001eP\u0007!\u001c:B\\\b;W:\\\\\u001d<&k\u0003\b^";
        objectArray[36] = "1-Yx;v1-N$7y+fN:7l,\u0017\u0019ea";
        objectArray[37] = "Zp]\u0017E\u0015/PV\u0018TZN^]\u0013P\u0000:";
        objectArray[38] = "e\u000f95\b\u001de\u000f.i\u0004\u0012\u007fD.w\u0004\u0007x5|-PC";
        objectArray[39] = "\u001fQ yd\u000b\u001fQ7%h\u0004\u0005\u001a7;h\u0011\u0002kee0U";
        objectArray[40] = Float.TYPE;
        ee_0.u[40] = "java/lang/Float";
        objectArray[41] = "\u001d\u001d\u0004E)L\u000b\u001d\u0001\u001f:[\u001cV\u0002\u00196O\r\u0011\u0015\u000e}X=";
        objectArray[42] = "pu)\u001be\u000f\u0005U\"\u0014t@d[)\u001fp\u001a\u0010";
        objectArray[43] = "Jl ZOG?L+U^\b^B ^ZR*";
        objectArray[44] = "PA|\u00161\u001aPAkJ=\u0015J\nkT=\u0000M{;\u0001jE";
        objectArray[45] = "O\u007f?#)\bO\u007f(\u007f%\u0007U4(a%\u0012REy;|Q";
        objectArray[46] = "rd1T\u0004\u000e\u0007D:[\u0015AfJ1P\u0011\u001b\u0012";
        objectArray[47] = "\u0006K\u00079~T\u0006K\u0010er[\u001c\u0000\u0010{rN\u001bqA$*\u0019\u000bB\u0012d`bZ\u001aC";
        objectArray[48] = "\r\u0017ht\u001dFx7c{\f\t\u00199hp\bSm";
        objectArray[49] = "\u0011n\u0006\u0012EudN\r\u001dT:\u0005@\u0006\u0016P`q";
        objectArray[50] = "\u0018#~W}\u0017\u0013,o\u0018\u0011\u0014\u001d.mW=";
        objectArray[51] = "eR~<drsR{fwed\u0019x`{qu^ow0am^m|j,QEmajkfR";
        objectArray[52] = "vzt/\u0014\b`zqu\u0007\u001fw1rs\u000b\u000bfved@\u001b}";
        objectArray[53] = "\u0018Y+^\u0000Ymy Q\u0011\u0016\fw+Z\u0015Lx";
        objectArray[54] = ">M\u0014\u001dc\u0015Km\u001f\u0012rZ*c\u0014\u0019v\u0000^";
        objectArray[55] = "S!\u0017\r\u000baE!\u0012W\u0018vRj\u0011Q\u0014bC-\u0006F_w\u0006";
        objectArray[56] = "\u000bW9Iq\u000b~w2F`D\u001fy9Md\u001ek";
        objectArray[57] = "'\u001esF4\bR>xI%G30sB!\u001dG";
        objectArray[58] = "64\u001a|\u0000\"64\r \f-,\u007f\r>\f8+\u000e]k[~";
        objectArray[59] = "~;#c\u001b0\u000b\u001b(l\n\u007fj\u0015#g\u000e%\u001e";
        objectArray[60] = "\u001fN%\"\rn\tN x\u001ey\u001e\u0005#~\u0012m\u000fB4iYy\u0013";
        objectArray[61] = "zMB|\r\u0013\u000fmIs\u001c\\ncBx\u0018\u0006\u001a";
        objectArray[62] = "M\u0007Z\u007fLRF\bK0+JB\u0014M|\u000e[";
        objectArray[63] = "P\u0001{_k\u0012N\ta\u0010\f\u0013_\u0012lJ*\u0015";
        objectArray[64] = "\fD\f\u007fR6\fD\u001b#^9\u0016\u000f\u001b=^,\u0011~Je\f";
        objectArray[65] = "D=\u0002\u000f0\u007fD=\u0015S<p^v\u0015M<eY\u0007D\u0012e";
        objectArray[66] = Double.TYPE;
        ee_0.u[66] = "java/lang/Double";
        objectArray[67] = "4vI\u001b*\b\"vLA9\u001f5=OG5\u000b$zXP~\u001a4";
        objectArray[68] = "{Xs\u0011\u0013\b\u000exx\u001e\u0002Govs\u0015\u0006\u001d\u001b";
        objectArray[69] = "$G#M\u000b\u00142G&\u0017\u0018\u0003%\f%\u0011\u0014\u00174K2\u0006_\u0000\u0007";
        objectArray[70] = "\u00074+1!Cr\u0014 >0\f\u0013\u001a+54Vg";
        objectArray[71] = "]YRWosKYW\r|d\\\u0012T\u000bppMUC\u001c;gz";
        objectArray[72] = "Q\u000b\u001ae\u0000\bZ\u0004\u000b*c\u0005O\u0002";
        objectArray[73] = "IN\u0016\u001fO?<n\u001d\u0010^p]`\u0016\u001bZ*)";
        objectArray[74] = "]O\u0004\u000146KO\u0001['!\\\u0004\u0002]+5MC\u0015J`%\u0001";
        objectArray[75] = "\u001f4zk\tQj\u0014qd\u0018\u001e\u000b\u001azo\u001cD\u007f";
        objectArray[76] = "lI<A]\u000f\u0019i7NL@xg<EH\u001a\f";
        objectArray[77] = "~\u00156moV\u000b5=b~\u0019j;6izC\u001e";
        objectArray[78] = "O[\u00197\u0005j\u0013DJyny/\u0002D!PdO\u0001I4\u0011x/\u0005_+\u0005w\u0014[\u001a{\r\u001b";
        objectArray[79] = "k3,\u001czpg+|\u000e\u0001$`?y\u001dVs>h!qj'n6d\u0001l4p0";
        objectArray[80] = "'w\fI\u0014\u0002*hP\f{\u001a\u0017(]\u0010E\fw+P\u0005\u0004\u0010\u0017*S\u0015\u0007\u0018x\u007f\u0001J\u0018s";
        objectArray[81] = "W\n&UR`\u000b\u0015u\u001b9p7S{C\u0007nWPvVFr7T`IR}\f\n%\u0019Z\u0011";
        objectArray[82] = "HgYA\tN@9[\u001e0^,oG\u001e\u000eNLlJ\u000bOR,h\\\u0014[]\u00176\u0019DS1";
        objectArray[83] = "&G/\u000b'\u0011&])\t\u001b\u0016\u001f\u0006-\u0007%\u0003\u007f\u0005 \u0012d\u001f\u001f\u0004#\u0002g\u0017pQq]x|";
        objectArray[84] = "H\u0017ok YD\u000f?y[\rC\u001b:j\fZ\u001dKc\u0006#\nK\u0004/z8[[\u001d";
        objectArray[85] = "\u001f58\u001e\u0004j\u0017n?\u0002n>sk=\u0017P(\u0013h0\u0002\u00114si3\u0012\u0012<\u001c<aM\rW";
        objectArray[86] = "9)\b\u0010x\u001bq'\u000b\u0014,e`\u007f\u000e9+\u0015|\u0016K\u0004+\u000el-\u0015A{\u0006\u0000";
        objectArray[87] = "\nh52ff\f{+4\u001fs\fy:1sA_<ck\u001f(\u001ah1:$v_89V";
        objectArray[88] = "G\u0012ra\u0015\u001dOWp|(\u0012L\u0015izD \u001dW4 \u0018w\u0018YvfD\u0012SQplVw";
        objectArray[89] = "#\u001b=w?:(Xs{T27\u001d#`8\u0000g^x6T-g\n~u-o?^r\u0007/<<\b(mdi%\u0004C";
        objectArray[90] = "UB\u001e\u0006eL\u0017IBE3/\u0002\u0012\u0014Z0xUHC\u0007\\\u0016\u0005L\u001dQl\u0013\u0011\u000f\u001fU";
        objectArray[91] = "CN\u00153;$\bF\u00139)A\u0014\u001f\u0007,;\u0016CEWqWx\u0013A\u000e'g}\u0007\u0002\f#";
        objectArray[92] = "O,[1\u0003gC4\u000b#x8H1\n;\u0014\n\u001cpTmxc^ \u00010C=\u001bp\t\\";
        objectArray[93] = "R\u0000\u0017a\b\tZE\u0015|5\u0006Y\u0007\fzY4\rCT-\tcR\u0000\u0017a\b\tZE\u0015|5";
        objectArray[94] = "X&\u0006 ?JY>\u001d0PF\u0006/\u000b!\u0007\u0018\\zVMoN\u0016#\u000b43T\b~";
        objectArray[95] = "gJJ/\")e[\u001a#Z1wU\u001556\u0003#\u0016Jb`T`\u0014\u001eo(-\"LJcZ";
        objectArray[96] = "^@(O[fV\u001b/S112\u001e-F\u000f$R\u001d SN82J?SQ$YVvGN[";
        objectArray[97] = "0+Jvn%5qTx\u00101\u000bvFq.$kuKdo8\u000bq]{{70/\u0018+s[";
        objectArray[98] = "H|^\u001b2\u0003\u0018uRY28\u001b\u0017\bB8\u0006\u000ew\u000bO-G\u0012\u0017\bN$\u0004Hv\u0000\u001e6B\u0003\u0017";
        objectArray[99] = "3x~frc;(l 9\u0002`\u0014<:,<ut?79}i\u0014~1-ka~5d4g\n";
        objectArray[100] = "{\u0001\t\"/9n\u0007K\"^!n\\\u001207-WR\u0012 3K7@\u001b62pi\u0005K>^";
        objectArray[101] = "h\u000b\u00055G.5\u001fZg\u001aE*\u001fG'+|8YY4\u001by,\u001a[0+|8YY4\u001by,\u001a[0+";
        objectArray[102] = "c>X45_!f\f8GCt\u007fSn+q$3\t8G\u001f(d\u000b0$]#8HfG";
        objectArray[103] = "\rG{2.\u000bOL'qxhZ\u0017qn{?\rM&1\u0017Q]Ixe'TI\nza";
        objectArray[104] = "f\u001c\u001e\bjv:\u0003MF\u0001c\u0006EC\u001e?xfFN\u000b~d\u0006BX\u0014jk=\u001c\u001dDb\u0007";
        objectArray[105] = "L)!94\u0013\u000equ5F\u000f[h*c*=\f(w={jPo1x{\u0000X*3eF";
        objectArray[106] = "kU\u0018\u0002Ho`\u0016V\u000e#lsB\u0002\u001et<(\u0014[rNp`O\u0019\u0019R9tP";
        objectArray[107] = "\u0017[3[=\n\u0017A5Y\u0001\u000e.\u001a1W?\u0018N\u0019<B~\u0004.\u001a)Rj[C\u001a3Thg";
        objectArray[108] = "\rMJ`MW@\u0017Jxw\u00070]Mk\u0005\u0007JA\u0016 w";
        objectArray[109] = "7\u0004\u0003xc\"1\u0017\u001d~\u001a71\u0015\f{v\u0005fU\\&*Rb\u0012\u0001wvi<WQ\u007f\u001a";
        objectArray[110] = "nz\"\tO*,q~J\u0019I9*(U\u001a\u001enp\u007f\rvp>t!^Fu*7#Z";
        objectArray[111] = "\u001b\u000e2\u0004zB\u0019U4\r\u0015R_\u0015g\rn?WP\u007f\u001b|EK\u000b4i+DK\u0003bRu\u0001\u001b\u000b\u000e";
        objectArray[112] = "\n<\u000e(7YQl\n*\"5Vm\u0010!<Yd9S~d\n3f\u0017:'\bYnR8:5";
        objectArray[113] = "dWe1\u0001W8H6\u007fjO\u0004\u000e8'TYd\r52\u0015E\u0004\t#-\u0001J?Wf}\t&";
        objectArray[114] = "m.\u001b [\u0013u|\u001bg4\u0019~;\u00119X+)yKf\b|z-\noWAn:\u0001 4";
        objectArray[115] = "a\u0002V\fg\u0014?\u0000GZ*%9AW\u0019>Y?G:ZhX7\u0003D\u0012f[3W:";
        objectArray[116] = "2\u0001p\u00119i4\u0012n\u0017@|4\u0010\u007f\u0012,NbW\"Jy\u0019`\\`\u000e,|+Tf\u0004>\u0019";
        objectArray[117] = "$)&KO\u0017f\"z\b\u0019tsy,\u0017\u001a#$#{NvMt'%\u001cFH`d'\u0018";
        objectArray[118] = "\u0014>\u000f\u007f\u000b5\u0019!S:d.$iY~\u0014}Nh\u000e.\u0018D";
        objectArray[119] = "^4f\u0019~\u0018J#mV\u001d@Z\"}Oqr\u0007e-\u0019\u001d\u001aQ/|LdFK1!(";
        objectArray[120] = "gJKV];;U\u0018\u00186)\u0007\u0013\u0016@\b5g\u0010\u001bUI)\u0007\u0014\rJ]&<JH\u001aUJ";
        objectArray[121] = "j]g~\u0001'fE7lzsaQ2\u007f-$?\u0002k\u0013\u0018g{Bg-\u0010`~B";
        objectArray[122] = "(\u000f~S\\cj\u0004\"\u0010\n\u0000\u007f_t\u000f\tW(\u0005#Qe9x\u0001}\u0004U<lB\u007f\u0000";
        objectArray[123] = ",'\u0004B\u001c; ?TPgo'+QC08xv\n/\u0002o#4\u000b\u0014\u001ez)v";
        objectArray[124] = "+`,\u0007U'w\u007f\u007fI>6K9q\u0011\u0000)+:|\u0004A5K>j\u001bU:p`/K]V";
        objectArray[125] = "\u001e&8D\u0018)\u0016c:Y%&\u0015!#_I\u0014Ae{\t\u001eC\u001f=3\u0002^8B'%T%%\u0003&?\u0005O-F$\"8";
        objectArray[126] = "Fp2S\u00101B{;Wp$E|9\f\u001c\u0016\u00171aZp~Nq8\u000f\t\"Toek";
        objectArray[127] = "\u0007E<X4\u000eQ@|\u0006\fVh\u001e:\u0007pQ\u0015\u000e>R|?\bDe\u001ebB\u0018@0\u0012\f";
        objectArray[128] = "\u0005n-\u0010)N\u0004v6\u0000FB[g \u0011\u0011\u0012\u00011uEF\u0013\\{%\u0019?OFex";
        objectArray[129] = "tsa\u001b0)6x=XfJ##kGe\u001dty<\u001b\ts$}bL9v0>`H";
        objectArray[130] = "Er-\u0000?ICa3\u0006F\\Cc\"\u0003*n\u0010'~[FW^tz\u00046SU}~d";
        objectArray[131] = "~\u000fiJnO'X~\r2%,f7\u0016n\u001b8\u00064\u001b{Z$f5\u0018kY,\t`J4FG";
        objectArray[132] = "\u0014c$&\u0013\u0006\u00119:(m\u0011/>(!S\u0007O=%4\u0012\u001b/<&$\u0011\u0013@it{\u000ex";
        objectArray[133] = "#\u0019)c#<'\\;-O<_\u00180tq/?\u001b=a03_\u001f+~$<dAn.,P";
        objectArray[134] = "jhl\u000fR(b6nPk<\u000e`rPU(nc\u007fE\u00144\u000egiZ\u0000;59,\n\bW";
        objectArray[135] = "']=>\u0015p;\u0006vL\u0011s+\f(7|{n\u0014>%\u0006g5_Lr\u0007g=\tw,B75e";
        objectArray[136] = "\u0012b*\u0004\u0019w\u000ew F')\u001ap/\u0011K\u001bG7uN'*\fw3KM\"Iu.vY%\u001dr \u0019Aw\u001d5O";
        objectArray[137] = "\u000f{q\u0001BhGur\u0005\u0016\u0016P)|\u0012|g\u000e5~\u0007\u0006{U~\f";
        objectArray[138] = "U\u0003\u0005\u000fu7XY\u0003\u0002\u0014=^W\u0001SCj\u0007\u0007Y\u0007\u0014:UAT\\).BJ\u001b";
        objectArray[139] = "F9\u0010AS(\r1\u0016KAM\u0011h\u0002^S\u001aF2R\u0002?t\u00166\u000bU\u000fq\u0002u\tQ";
        objectArray[140] = "!)Eu\fK`3\u0016%3\u001c?:NudKel\u0010\u0019L\f1;\u0015 \r\u0016bk";
        objectArray[141] = "5T\u0002gr\u007fh@]5/\u0014iPJ\t'}3]U9\"ip_Q\t'}3]U9\"ip_Q\t'}3]U9\"ip_Q\t";
        objectArray[142] = "K(BU|a\n2\u0011\u0005C6U;IU\u0014a\u000fm\u00149<&[:\u0012\u0000}<\bj";
        objectArray[143] = "\u0012VTU\u0011jDS\u0014\u000b)8}T\b\b\u0017$\u001dW\u0005\u001dV8}V\u0006\rU0\u0012\u0003TRJ[";
        objectArray[144] = "uT\nk8D#QJ5\u0000\u0017\u001aVV6>\nzU[#\u007f\u0016\u001aTX3|\u001eu\u0001\nlcu";
        objectArray[145] = "\u001e\u0001=.IF\u001e\tjt\"Pl\u0004klR[\u0000\u0000.~\u001c";
        objectArray[146] = "!T+\u001c~^h\u0014cI~eqlj\u0017\u007f[g\fi\u001aj\u001a{lm\fu\u000etW3I%\u0006\u0018";
        objectArray[147] = "]X:u\u000f8\u0014\u0018r \u000f\u0003\r`{~\u000e=\u001b\u0000xs\u001b|\u0007`yp\u000b\u007f\u000f\u000f,\"T`d";
        objectArray[148] = "*1ZbNLa9\\h\\)vlYyEED8\u001d#\u0018)*1ZbNLa9\\h\\)*h\u001a}M\u0019/|Y\u007fI)";
        objectArray[149] = "\u0016b\u001fd\u0000\u0006K4@/\u0002gFXHu\u001aYP8Kx\u000f\u0018LX\bo\u0003\u0017D5\u0003,M\u001b/";
        objectArray[150] = "FyZ!\u007fs\u000f|I!~\u001d\u0016\u0017\u001c1!#\u0000w\u001f<4b\u001c\u0017\u001ca9f\u0013rWi?l\u0001\u0017";
        objectArray[151] = "djk14fdoxC*k\u000b~,2?lqbwyMjnpf:.jkc\u0014";
        objectArray[152] = "s\u001b\u00164+D:[^a+\u007f'#W?*A5CT2?\u0000)#P$ \u0014&\u0018\u000eap\u001cJ";
        objectArray[153] = "Ox:f\nNG\u007f?f;\u0015@~!\u007fW'\u0014=~(\u0000pR|.t\u0004I\u0013f}$;";
        objectArray[154] = "\u001fdIsCf\u0003qC1}8\u0017vLf\u0011\nC:\u00158G]C5@nMl\u001d7Q8\u0000]";
        objectArray[155] = "wbL->\",2H/+N+3R$5\"\u0019g\u0011{bvN9N4h55dT\">N";
        objectArray[156] = "y[vN\u001d+2SpD\u000fN.\ndQ\u001d\u0019yP4\u000fqw)TmZAr=\u0017o^";
        Object[] objectArray2 = objectArray;
        objectArray[157] = "\u0002:P[\u007f2Zg\u001cM`\u0003R\u0007\u0015Ku=Dg\u0016F`|X\u0007\u0012P\u007fhW<L\u0015/`;";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ee" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ee_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00eb' || c == '\u00e8' || c == 'y') {
                field = ee_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ee_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void d(Object[] objectArray) {
        block13: {
            Object object;
            block12: {
                CallSite callSite;
                long l;
                block10: {
                    block11: {
                        l = (Long)objectArray[0];
                        long l2 = l;
                        long l3 = l2 ^ 0x148CA4297AAAL;
                        long l4 = l2 ^ 0x77F691DE9D78L;
                        long l5 = l2 ^ 0x73D8DC6C75E9L;
                        callSite = ee_0.d("\u00c2", (long)3250423193961014775L, (long)l);
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l4;
                                        object = ee_0.d("\u00df", (Object)this, (Object)objectArray2, (long)3251136305858583674L, (long)l);
                                        if (callSite != null) break block10;
                                        if (object != ee_0.c("s", (int)25803, (long)(0x19A307109833560L ^ l))) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw ee_0.d("\u00c2", (Object)matchException, (long)3249831643353053166L, (long)l);
                                    }
                                    Object[] objectArray3 = new Object[1];
                                    objectArray3[0] = l5;
                                    object = ee_0.d("\u00c2", (Object)objectArray3, (long)3251685685565603979L, (long)l);
                                    if (callSite != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw ee_0.d("\u00c2", (Object)matchException, (long)3249831643353053166L, (long)l);
                                }
                                if (object == false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw ee_0.d("\u00c2", (Object)matchException, (long)3249831643353053166L, (long)l);
                            }
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l3;
                            ee_0.d("\u00df", (Object)this, (Object)objectArray4, (long)3247941450614947103L, (long)l);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw ee_0.d("\u00c2", (Object)matchException, (long)3249831643353053166L, (long)l);
                        }
                    }
                    object = ee_0.d("\u00df", (String)((Object)ee_0.d("\u00df", (Object)this.h, (long)3250832875107824796L, (long)l)), (Object)ee_0.b("k", (int)22533, (long)(0x460E6D6847E0F646L ^ l)), (long)3250945501073145277L, (long)l);
                }
                try {
                    if (callSite != null) break block12;
                    if (object != false) break block13;
                }
                catch (MatchException matchException) {
                    throw ee_0.d("\u00c2", (Object)matchException, (long)3249831643353053166L, (long)l);
                }
                object = 1;
            }
            a = object;
        }
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bd_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[TRYBLOCK]], but top level block is 102[SWITCH]
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ee_0.d("\u00c2", (Object)((Object)q_0.Crystal), (long)-2439297797227500621L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(a9 var1_1) {
        block13: {
            block14: {
                block12: {
                    var2_2 = ee_0.m ^ 101038216038605L;
                    var4_3 = var2_2 ^ 116891129813308L;
                    var6_4 = ee_0.d("\u00c2", (long)-6242042868837965389L, (long)var2_2);
                    try {
                        try {
                            v0 = new Object[1];
                            v0[0] = var4_3;
                            v1 = ee_0.d("\u00df", (Object)this, (Object)v0, (long)-6243600383658682306L, (long)var2_2);
                            if (var6_4 != null) break block12;
                            if (v1 != ee_0.c("s", (int)6748, (long)(3762377312057216951L ^ var2_2))) break block13;
                        }
                        catch (MatchException v2) {
                            throw ee_0.d("\u00c2", (Object)v2, (long)-6242652020084673622L, (long)var2_2);
                        }
                        v1 = ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)ee_0.d("Y", (Object)ee_0.b, (long)-6246034313545285974L, (long)var2_2), (long)-6241179601884543107L, (long)var2_2), (long)-6242591714310555083L, (long)var2_2), (Object)ee_0.d("\u00e8", (long)-6244849603572721173L, (long)var2_2), (long)-6240971964553266441L, (long)var2_2);
                    }
                    catch (MatchException v3) {
                        throw ee_0.d("\u00c2", (Object)v3, (long)-6242652020084673622L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var6_4 != null) break block14;
                        if (v1 == false) {
                        }
                        ** GOTO lbl36
                    }
                    catch (MatchException v4) {
                        throw ee_0.d("\u00c2", (Object)v4, (long)-6242652020084673622L, (long)var2_2);
                    }
                    v1 = ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)ee_0.d("Y", (Object)ee_0.b, (long)-6246034313545285974L, (long)var2_2), (long)-6241179601884543107L, (long)var2_2), (long)-6242591714310555083L, (long)var2_2), (Object)ee_0.d("\u00df", (Object)ee_0.d("\u00e8", (long)-6241729706804153551L, (long)var2_2), (long)-6242122103564157565L, (long)var2_2), (long)-6240971964553266441L, (long)var2_2);
                }
                catch (MatchException v5) {
                    throw ee_0.d("\u00c2", (Object)v5, (long)-6242652020084673622L, (long)var2_2);
                }
            }
            try {
                if (v1 == false) break block13;
lbl36:
                // 2 sources

                ee_0.d("\u00df", (Object)var1_1, (Object)new Object[0], (long)-6244675620482280642L, (long)var2_2);
            }
            catch (MatchException v6) {
                throw ee_0.d("\u00c2", (Object)v6, (long)-6242652020084673622L, (long)var2_2);
            }
        }
    }

    private static int m(long l, long l2) {
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
            case 0 -> 63;
            case 1 -> 31;
            case 2 -> 53;
            case 3 -> 61;
            case 4 -> 43;
            case 5 -> 1;
            case 6 -> 59;
            case 7 -> 21;
            case 8 -> 17;
            case 9 -> 41;
            case 10 -> 57;
            case 11 -> 5;
            case 12 -> 22;
            case 13 -> 40;
            case 14 -> 52;
            case 15 -> 55;
            case 16 -> 42;
            case 17 -> 50;
            case 18 -> 28;
            case 19 -> 32;
            case 20 -> 19;
            case 21 -> 10;
            case 22 -> 6;
            case 23 -> 13;
            case 24 -> 7;
            case 25 -> 62;
            case 26 -> 18;
            case 27 -> 2;
            case 28 -> 0;
            case 29 -> 30;
            case 30 -> 26;
            case 31 -> 58;
            case 32 -> 14;
            case 33 -> 33;
            case 34 -> 24;
            case 35 -> 54;
            case 36 -> 48;
            case 37 -> 60;
            case 38 -> 8;
            case 39 -> 16;
            case 40 -> 47;
            case 41 -> 36;
            case 42 -> 25;
            case 43 -> 37;
            case 44 -> 34;
            case 45 -> 9;
            case 46 -> 46;
            case 47 -> 44;
            case 48 -> 38;
            case 49 -> 49;
            case 50 -> 3;
            case 51 -> 56;
            case 52 -> 4;
            case 53 -> 11;
            case 54 -> 23;
            case 55 -> 39;
            case 56 -> 15;
            case 57 -> 20;
            case 58 -> 45;
            case 59 -> 35;
            case 60 -> 29;
            case 61 -> 12;
            case 62 -> 27;
            default -> 51;
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
        ee_0.u[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ee_0.m(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = ee_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ee_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ee_0.g(clazz3, string2, clazz2)) != null) {
                    ee_0.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ee_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ee_0.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ee_0.n(95993881843826L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ee_0.m(l, l2);
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
                clazz3 = ee_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ee_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ee_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ee_0.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ee_0.n(95993881843826L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ee_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ee_0.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ee_0.n(95993881843826L, 0L);
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
        long l = (Long)objectArray[0];
        long l2 = l = m ^ l;
        long l3 = l2 ^ 0x3AEA65AE4D2BL;
        long l4 = l2 ^ 0x5C13F0AA1C57L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        ee_0.d("\u00df", (Object)this.i, (Object)objectArray2, (long)5954495775382112935L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        ee_0.d("\u00df", (Object)this.f, (Object)objectArray3, (long)5954495775382112935L, (long)l);
        ++this.l;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        ee_0.d("\u00df", (Object)this.k, (Object)objectArray4, (long)5951314549517261969L, (long)l);
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
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        bd_0 bd_02;
        block43: {
            block44: {
                block41: {
                    CallSite callSite4;
                    block40: {
                        bd_02 = (bd_0)objectArray[0];
                        l9 = (Long)objectArray[1];
                        long l10 = l9 = m ^ l9;
                        l8 = l10 ^ 0x20B6A1D176D6L;
                        l7 = l10 ^ 0x5493E4331C5CL;
                        l6 = l10 ^ 0x1D0A16E73EE7L;
                        l5 = l10 ^ 0x75821A37CC16L;
                        l4 = l10 ^ 0x7BF383E36F9BL;
                        l3 = l10 ^ 0x4CD88B788443L;
                        l2 = l10 ^ 0x1D9EC0EC1243L;
                        l = l10 ^ 0x72E2D1974E27L;
                        callSite3 = null;
                        callSite2 = ee_0.d("\u00c2", (long)2407146059387414923L, (long)l9);
                        try {
                            try {
                                callSite4 = ee_0.d("Y", (Object)b, (long)2406075336469291986L, (long)l9);
                                if (callSite2 != null) break block40;
                                if (ee_0.d("\u00df", (Object)callSite4, (long)2403803119739930850L, (long)l9) != ee_0.d("\u00e8", (long)2403057844569873225L, (long)l9)) break block41;
                            }
                            catch (MatchException matchException) {
                                throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                            }
                            callSite4 = ee_0.d("Y", (Object)b, (long)2406075336469291986L, (long)l9);
                        }
                        catch (MatchException matchException) {
                            throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                        }
                    }
                    callSite3 = ee_0.d("\u00df", (Object)((class_3965)callSite4), (long)2406697685924255782L, (long)l9);
                }
                try {
                    block42: {
                        try {
                            try {
                                if (callSite3 == null) break block42;
                                callSite = ee_0.d("Y", (Object)b, (long)2406191673680173174L, (long)l9);
                                if (callSite2 != null) break block43;
                            }
                            catch (MatchException matchException) {
                                throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                            }
                            if (ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)callSite, (Object)callSite3, (long)2402777994078901511L, (long)l9), (long)2406889488160179079L, (long)l9) == ee_0.d("\u00e8", (long)2402884142859352841L, (long)l9)) break block44;
                        }
                        catch (MatchException matchException) {
                            throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                        }
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l8;
                    ee_0.d("\u00df", (Object)this, (Object)objectArray2, (long)2409203357757714787L, (long)l9);
                    return;
                }
                catch (MatchException matchException) {
                    throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                }
            }
            callSite = ee_0.d("Y", (Object)b, (long)2406191673680173174L, (long)l9);
        }
        CallSite callSite5 = ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)callSite, (long)2404061395910062329L, (long)l9), (long)2406754548913049674L, (long)l9);
        while (ee_0.d("\u00df", (Object)callSite5, (long)2409383872611933799L, (long)l9) != false) {
            block48: {
                class_1297 class_12972;
                class_1297 class_12973;
                block45: {
                    block46: {
                        class_12973 = (class_1297)ee_0.d("\u00df", (Object)callSite5, (long)2402682901150510642L, (long)l9);
                        try {
                            try {
                                class_12972 = class_12973;
                                if (callSite2 != null) break block45;
                                if (class_12972 instanceof class_1511) break block46;
                            }
                            catch (MatchException matchException) {
                                throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                            }
                            if (callSite2 == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                        }
                    }
                    class_12972 = class_12973;
                }
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = l5;
                objectArray3[0] = class_12972;
                CallSite callSite6 = ee_0.d("\u00c2", (Object)objectArray3, (long)2404892503219148992L, (long)l9);
                if (ee_0.d("\u00df", (Object)callSite6, (Object)ee_0.d("\u00df", (Object)ee_0.d("\u00df", (Object)callSite3, (long)2408605913751979010L, (long)l9), (long)2408394382936226798L, (long)l9), (long)2404722973432550810L, (long)l9) < 1.0) {
                    block55: {
                        ee_0 ee_02;
                        block53: {
                            Object object;
                            block51: {
                                block52: {
                                    block50: {
                                        CallSite callSite7;
                                        block49: {
                                            block47: {
                                                CallSite callSite8 = ee_0.d("\u00df", (Object)class_12973, (long)2406024025860152871L, (long)l9);
                                                CallSite callSite9 = ee_0.d("\u00df", (Object)ee_0.d("Y", (Object)b, (long)2407606526523537042L, (long)l9), (long)2406993654137034950L, (long)l9);
                                                CallSite callSite10 = ee_0.d("\u00c2", (double)(ee_0.d("Y", (Object)callSite8, (long)2405950120602779769L, (long)l9) - ee_0.d("Y", (Object)callSite9, (long)2404165740717489019L, (long)l9)), (double)ee_0.d("\u00c2", (double)0.0, (double)(ee_0.d("Y", (Object)callSite9, (long)2404165740717489019L, (long)l9) - ee_0.d("Y", (Object)callSite8, (long)2403253435390714546L, (long)l9)), (long)2403019005464476480L, (long)l9), (long)2403019005464476480L, (long)l9);
                                                CallSite callSite11 = ee_0.d("\u00c2", (double)(ee_0.d("Y", (Object)callSite8, (long)2406260950341641178L, (long)l9) - ee_0.d("Y", (Object)callSite9, (long)2408458582129039898L, (long)l9)), (double)ee_0.d("\u00c2", (double)0.0, (double)(ee_0.d("Y", (Object)callSite9, (long)2408458582129039898L, (long)l9) - ee_0.d("Y", (Object)callSite8, (long)2406932795772395780L, (long)l9)), (long)2403019005464476480L, (long)l9), (long)2403019005464476480L, (long)l9);
                                                CallSite callSite12 = ee_0.d("\u00c2", (double)(ee_0.d("Y", (Object)callSite8, (long)2408538200806433581L, (long)l9) - ee_0.d("Y", (Object)callSite9, (long)2402851595041262610L, (long)l9)), (double)ee_0.d("\u00c2", (double)0.0, (double)(ee_0.d("Y", (Object)callSite9, (long)2402851595041262610L, (long)l9) - ee_0.d("Y", (Object)callSite8, (long)2405476455385002265L, (long)l9)), (long)2403019005464476480L, (long)l9), (long)2403019005464476480L, (long)l9);
                                                reference var34_16 = ee_0.d("\u00c2", (double)(callSite10 * callSite10 + callSite11 * callSite11 + callSite12 * callSite12), (long)2405824366259228669L, (long)l9);
                                                try {
                                                    try {
                                                        reference cfr_temp_0 = var34_16 - (double)2.7f;
                                                        callSite7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                        if (callSite2 != null) break block47;
                                                        if (callSite7 > 0) break block48;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                                    }
                                                    callSite7 = ee_0.d("\u00df", (Object)((Boolean)((Object)ee_0.d("\u00df", (Object)this.e, (long)2405330655577553120L, (long)l9))), (long)2405843515463149818L, (long)l9);
                                                }
                                                catch (MatchException matchException) {
                                                    throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (callSite2 != null) break block49;
                                                    if (callSite7 == false) break block50;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                                }
                                                Object[] objectArray4 = new Object[2];
                                                objectArray4[1] = l;
                                                objectArray4[0] = ee_0.d("\u00df", (Object)class_12973, (long)2404978114254247174L, (long)l9);
                                                callSite7 = ee_0.d("\u00c2", (Object)objectArray4, (long)2404110695650325359L, (long)l9);
                                            }
                                            catch (MatchException matchException) {
                                                throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                            }
                                        }
                                        try {
                                            if (callSite7 != false && callSite2 == null) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                        }
                                    }
                                    Object[] objectArray5 = new Object[4];
                                    objectArray5[3] = l3;
                                    objectArray5[2] = Float.valueOf((float)ee_0.d("Y", (Object)callSite6, (long)2402851595041262610L, (long)l9));
                                    objectArray5[1] = Float.valueOf((float)(ee_0.d("Y", (Object)callSite6, (long)2408458582129039898L, (long)l9) + (double)0.45f));
                                    objectArray5[0] = Float.valueOf((float)ee_0.d("Y", (Object)callSite6, (long)2404165740717489019L, (long)l9));
                                    CallSite callSite13 = ee_0.d("\u00c2", (Object)objectArray5, (long)2405745687989623982L, (long)l9);
                                    try {
                                        try {
                                            ee_0.d("\u00df", (Object)bd_02, (Object)new Object[]{Float.valueOf((float)ee_0.d("\u00df", (Object)callSite13, (Object)new Object[0], (long)2405649343502701643L, (long)l9))}, (long)2403431311232695066L, (long)l9);
                                            Object[] objectArray6 = new Object[2];
                                            objectArray6[1] = l7;
                                            objectArray6[0] = class_12973;
                                            ee_0.d("\u00c2", (Object)objectArray6, (long)2404548119029504352L, (long)l9);
                                            object = ee_0.d("\u00df", (String)((Object)ee_0.d("\u00df", (Object)this.h, (long)2405330655577553120L, (long)l9)), (Object)ee_0.b("k", (int)27497, (long)(0x2DE913F09592C952L ^ l9)), (long)2405372517505462721L, (long)l9);
                                            if (callSite2 != null) break block51;
                                            if (object == false) break block52;
                                        }
                                        catch (MatchException matchException) {
                                            throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                        }
                                        this.l = (int)ee_0.c("s", (int)31815, (long)(0x34148EAD04CA191L ^ l9));
                                        Object[] objectArray7 = new Object[1];
                                        objectArray7[0] = l4;
                                        ee_0.d("\u00df", (Object)this.f, (Object)objectArray7, (long)2409067069799561579L, (long)l9);
                                        Object[] objectArray8 = new Object[1];
                                        objectArray8[0] = l6;
                                        ee_0.d("\u00df", (Object)this.k, (Object)objectArray8, (long)2403645587852259165L, (long)l9);
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                    }
                                }
                                try {
                                    ee_02 = this;
                                    if (callSite2 != null) break block53;
                                    object = ee_02.l;
                                }
                                catch (MatchException matchException) {
                                    throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                }
                            }
                            try {
                                block54: {
                                    try {
                                        try {
                                            try {
                                                if (object == ee_0.c("s", (int)2130, (long)(0x732CB2BF41D35583L ^ l9))) break block54;
                                                ee_02 = this;
                                                if (callSite2 != null) break block53;
                                            }
                                            catch (MatchException matchException) {
                                                throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                            }
                                            if (ee_0.d("\u00df", (String)((Object)ee_0.d("\u00df", (Object)ee_02.h, (long)2405330655577553120L, (long)l9)), (Object)ee_0.b("k", (int)9695, (long)(0x79FA649F03F407E7L ^ l9)), (long)2405372517505462721L, (long)l9) == false) break block54;
                                        }
                                        catch (MatchException matchException) {
                                            throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                        }
                                        Object[] objectArray9 = new Object[1];
                                        objectArray9[0] = l2;
                                        ee_0.d("\u00df", (Object)this, (Object)objectArray9, (long)2403110751142198544L, (long)l9);
                                        if (callSite2 == null) break block55;
                                    }
                                    catch (MatchException matchException) {
                                        throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                                    }
                                }
                                ee_02 = this;
                            }
                            catch (MatchException matchException) {
                                throw ee_0.d("\u00c2", (Object)matchException, (long)2406484140164250514L, (long)l9);
                            }
                        }
                        Object[] objectArray10 = new Object[1];
                        objectArray10[0] = l8;
                        ee_0.d("\u00df", (Object)ee_02, (Object)objectArray10, (long)2409203357757714787L, (long)l9);
                    }
                    return;
                }
            }
            if (callSite2 == null) continue;
        }
    }

    private boolean lambda$new$0(Float f) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l = m ^ 0x43782D2448A9L;
                    CallSite callSite = ee_0.d("\u00c2", (long)2971205365913002455L, (long)l);
                    try {
                        try {
                            try {
                                object = ee_0.d("\u00df", (String)((Object)ee_0.d("\u00df", (Object)this.h, (long)2971604322517823676L, (long)l)), (Object)ee_0.b("k", (int)9695, (long)(0x79FA5580A64A0FBBL ^ l)), (long)2971716669318658461L, (long)l);
                                if (callSite != null) break block6;
                                if (object != false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw ee_0.d("\u00c2", (Object)matchException, (long)2970613842140722126L, (long)l);
                            }
                            object = ee_0.d("\u00df", (String)((Object)ee_0.d("\u00df", (Object)this.h, (long)2971604322517823676L, (long)l)), (Object)ee_0.b("k", (int)27497, (long)(0x2DE922EF302CC10EL ^ l)), (long)2971716669318658461L, (long)l);
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw ee_0.d("\u00c2", (Object)matchException, (long)2970613842140722126L, (long)l);
                        }
                        if (object == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw ee_0.d("\u00c2", (Object)matchException, (long)2970613842140722126L, (long)l);
                    }
                }
                object = 1;
                break block6;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static void lambda$onMotionUpdate$1(class_239 class_2392) {
        long l = m ^ 0x59E2EC20AEB6L;
        long l2 = l ^ 0x3454FC11F4BBL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (class_3965)class_2392;
        ee_0.d("\u00c2", (Object)objectArray, (long)-3522409282909339582L, (long)l);
    }

    private static void lambda$onMotionUpdate$2(class_239 class_2392) {
        long l = m ^ 0x47271D760826L;
        long l2 = l ^ 0x2A910D47522BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = (class_3965)class_2392;
        ee_0.d("\u00c2", (Object)objectArray, (long)7606014271678326482L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ee_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ee_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ee_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


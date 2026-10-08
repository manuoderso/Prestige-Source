/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.gg_0;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fO
extends dV {
    private dR a;
    private dP c;
    private dP d;
    private dO e;
    private dO f;
    private dM g;
    private dN h;
    private static bW i;
    private ArrayList j;
    private f5 k;
    private class_243 l;
    private static final long m;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;
    private static final long[] q;
    private static final Integer[] r;
    private static final Map s;
    private static final Object[] t;
    private static final String[] u;

    public fO() {
        long l;
        long l2 = l = m ^ 0x3F51FED990D7L;
        long l3 = l2 ^ 0x463357823B92L;
        long l4 = l2 ^ 0x3CC5880437ADL;
        this.j = new ArrayList();
        this.k = new f5(l3);
        this.l = null;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$0;
        fO.d("\u00f8", (Object)this.h, (Object)objectArray, (long)-4604887796178621277L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        fO.m = hc.a(-6452429245273338207L, -2685369380114037491L, MethodHandles.lookup().lookupClass()).a(246448621354323L);
                        fO.t = new Object[123];
                        fO.u = new String[123];
                        fO.f();
                        fO.p = new HashMap<K, V>(13);
                        var11 = fO.m ^ 6686260900080L;
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
                        var17_5 = "_G\u00f2\u0007:L\u007f0\u0097}\u00ce\u00bdnP\u00bd\u00ea\u0010\fq\u00a6\u00be\u00e2\u00bf{\u00a5q<Kv\u00d2\u009bc\u0011\u0010\u00e6\u00f5\u00e9\u00e8\u00aa\u00a4\"\u00daNz6H\u00e2\u00f3\u008a\u0001 \u001c\u00fa\u00c6\u00cb\u0083\u00d4r\u00fa=\u0005J\u0018\u00f4\u007fa^`\u0096\u00c4/\u00a9\u0086\u00e0y+\u001d\r\u00c1\u00aa\u00a7\u00d9\u007f\u001045r\u008f\u00e2\u00c5\u00a9\u00cd@r\u00fas;\u00c1\u00da\n\u0010-\u0084$\u00d6\u0004:\u00f3Ni\u0083\u009e\u0001%\u0096\b8@\u00d4\u00ddH\u0013,\u00b2K\u00d0U\u00bd\u00d8\u00fa\u00b1\u0080bgV\u00bc\u00c5\"\u00f2P\u00fe\u00b1>\u00ed\u00d3\u0085\u00d0\u00fe\u00ddY\u0018\u00a2\u009d\u00fc\u0088\u001a\u00e4W\u00cb@\u008a\u00a2B\u00a2J/\u0015s\u007f\u00cf\u000f\u008f\u00e00\u0010\u00b8\u00ebf\u00da0\u00cf\b";
                        var19_6 = "_G\u00f2\u0007:L\u007f0\u0097}\u00ce\u00bdnP\u00bd\u00ea\u0010\fq\u00a6\u00be\u00e2\u00bf{\u00a5q<Kv\u00d2\u009bc\u0011\u0010\u00e6\u00f5\u00e9\u00e8\u00aa\u00a4\"\u00daNz6H\u00e2\u00f3\u008a\u0001 \u001c\u00fa\u00c6\u00cb\u0083\u00d4r\u00fa=\u0005J\u0018\u00f4\u007fa^`\u0096\u00c4/\u00a9\u0086\u00e0y+\u001d\r\u00c1\u00aa\u00a7\u00d9\u007f\u001045r\u008f\u00e2\u00c5\u00a9\u00cd@r\u00fas;\u00c1\u00da\n\u0010-\u0084$\u00d6\u0004:\u00f3Ni\u0083\u009e\u0001%\u0096\b8@\u00d4\u00ddH\u0013,\u00b2K\u00d0U\u00bd\u00d8\u00fa\u00b1\u0080bgV\u00bc\u00c5\"\u00f2P\u00fe\u00b1>\u00ed\u00d3\u0085\u00d0\u00fe\u00ddY\u0018\u00a2\u009d\u00fc\u0088\u001a\u00e4W\u00cb@\u008a\u00a2B\u00a2J/\u0015s\u007f\u00cf\u000f\u008f\u00e00\u0010\u00b8\u00ebf\u00da0\u00cf\b".length();
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
                            var20_3[var18_4++] = fO.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00e5MF\u0083~U\u00beT\u009a3D\u001f\u0019\u00d4\u008c\u0006\u00ba\u00cd\u00cb\u009bxZ\u00bb\u008e, \u00b4T\u0015\u0087Y\u00cd\u0010\u008e\u00ed`\u00c7\u0014\u00b3\u00f7\u0096\u00a5\u00d7\u001c\u00aa\u00e0yM\u0015";
                            var19_6 = "\u00e5MF\u0083~U\u00beT\u009a3D\u001f\u0019\u00d4\u008c\u0006\u00ba\u00cd\u00cb\u009bxZ\u00bb\u008e, \u00b4T\u0015\u0087Y\u00cd\u0010\u008e\u00ed`\u00c7\u0014\u00b3\u00f7\u0096\u00a5\u00d7\u001c\u00aa\u00e0yM\u0015".length();
                            var16_7 = 32;
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
                            var20_3[var18_4++] = fO.b(var21_9).intern();
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
                fO.n = var20_3;
                fO.o = new String[9];
                fO.s = new HashMap<K, V>(13);
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
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "\u00f9\u00b6U0)lj!\u00dc\u00ea\u0094{$;$\u00cf\u00974\u0006iMO-\u008a\u00f92ps\u00e0\u00d3)\u00b4\u000ft%2\u00b7\u0001\u00e9\u0083>\u00f5K\u00e0yc\u00f5\u00c4";
                var5_15 = "\u00f9\u00b6U0)lj!\u00dc\u00ea\u0094{$;$\u00cf\u00974\u0006iMO-\u008a\u00f92ps\u00e0\u00d3)\u00b4\u000ft%2\u00b7\u0001\u00e9\u0083>\u00f5K\u00e0yc\u00f5\u00c4".length();
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
                    var4_14 = "\u0013\u0090\u0010{\u0080\u00e6\u00f9z2\u00b4\u0086\u00c0q\u00c8\u00e6\t";
                    var5_15 = "\u0013\u0090\u0010{\u0080\u00e6\u00f9z2\u00b4\u0086\u00c0q\u00c8\u00e6\t".length();
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
        fO.q = var6_12;
        fO.r = new Integer[8];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x72B37E4528F8L;
        fO.d("\u00f8", (Object)this.j, (long)3995199439790272570L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        fO.d("\u00f8", (Object)this.k, (Object)objectArray2, (long)3998307821548771966L, (long)l);
        this.l = null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fO.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x473D;
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
                throw new RuntimeException("dev/zprestige/prestige/fO", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fO.n[n2].getBytes("ISO-8859-1");
            fO.o[n2] = fO.b(((Cipher)objectArray[0]).doFinal(byArray2));
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fO.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39D4;
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
                throw new RuntimeException("dev/zprestige/prestige/fO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fO.r[n2] = n3;
        }
        return r[n2];
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fO.m(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                fO.t[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fO.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fO.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fO.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fO.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = t;
        t[0] = "\u001by+>?\r\u001by<b3\u0002\u00012<|3\u0017\u0006Cm&jT";
        objectArray[1] = "W^goh\rW^p3d\u0002M\u0015p-d\u0017Jd w4T";
        objectArray[2] = "o5!\u001c\u00194d:0Sz9q<";
        objectArray[3] = Double.TYPE;
        fO.u[3] = "java/lang/Double";
        objectArray[4] = "|HNv\u001f:|HY*\u00135f\u0003Y4\u0013 ar\fkJ";
        objectArray[5] = "!\\\u0000WxL!\\\u0017\u000btC;\u0017\u0017\u0015tV<fFJ&\u001d";
        objectArray[6] = " \u000fD\u0017Ai6\u000fAMR~!DBK^j0\u0003U\\\u0015x\f";
        objectArray[7] = "V\nHn`>#*Caqq^2Pfx86";
        objectArray[8] = "'@:y\"t'@-%.{=\u000b-;.n:z|n\u007f/mF\"6<n\u0016\u0017wg|";
        objectArray[9] = "\u007f*a\u0002l\n\u007f*v^`\u0005eav@`\u0010b\u0010&\u00192Q";
        objectArray[10] = Integer.TYPE;
        fO.u[10] = "java/lang/Integer";
        objectArray[11] = "\b\u000eS\u0015\u00191\b\u000eDI\u0015>\u0012EDW\u0015+\u00154\u0014\nD";
        objectArray[12] = "\u0011^\u0018>\u0019\n\u0011^\u000fb\u0015\u0005\u000b\u0015\u000f|\u0015\u0010\fd^$G";
        objectArray[13] = Boolean.TYPE;
        fO.u[13] = "java/lang/Boolean";
        objectArray[14] = "\u00156gi\u0002\u0014\u001e9v&\u007f\f\r>\u007fo";
        objectArray[15] = "ZdC4wjZdTh{e@/Tv{pG^\u0005)-7";
        objectArray[16] = "v\u0007\u0013\t\u0015\b}\b\u0002Ft\u0006v\u0003\u0006\u001c";
        objectArray[17] = "PsH\u001bR1FsMAA&Q8NGM2@\u007fYP\u0006'{";
        objectArray[18] = "\u0013'm\u0014\u001fF\u0018(|[|K\r%s0II\u001c6o\u001c^D";
        objectArray[19] = "bm\b\nB_bm\u001fVNPx&\u001fHNE\u007fWK\u0010\u0019";
        objectArray[20] = "\u0017\u0018\u0000m\tG\t\u0010\u001a\"nF\u0018\u000b\u0017xH@";
        objectArray[21] = Void.TYPE;
        fO.u[21] = "java/lang/Void";
        objectArray[22] = "(QeoV9]qn`Gv<\u007fekC,H";
        objectArray[23] = "Q+\u001bBx\nG+\u001e\u0018k\u001dP`\u001d\u001eg\tA'\n\t,\u001dR";
        objectArray[24] = "\t/{\fE\u0005\u0017'aC*\u0002\u0011/t!\u0002\u0003\u0017";
        objectArray[25] = "C\rG!X`U\rB{KwBFA}GcS\u0001Vj\fv\u0012";
        objectArray[26] = "_)ciBS*\thfS\u001cK\u0007cmWF?";
        objectArray[27] = "u^\u00066\u001e\u0014\u0000~\r9\u000f[ap\u00062\u000b\u0001\u0015";
        objectArray[28] = Float.TYPE;
        fO.u[28] = "java/lang/Float";
        objectArray[29] = "z+3\u0011fMq$\"^\u0001Od/\"\u0015:";
        objectArray[30] = "\u0013\u001a\u001eE\"zf:\u0015J35\u00074\u001eA7os";
        objectArray[31] = "b\u0012>K\fQ\u001725D\u001d\u001ev<>O\u0019D\u0002";
        objectArray[32] = "]TWY7.KTR\u0003$9\\\u001fQ\u0005(-MXF\u0012c:r";
        objectArray[33] = "UD}cxh^Kl,\u0010hPD\u007f";
        objectArray[34] = "lWxS2xzW}\t!om\u001c~\u000f-{|[i\u0018fk0";
        objectArray[35] = "\u0007\b=$'%r(6+6j\u0013&= 20g";
        objectArray[36] = ":\u007fN/_\u001e8a\u0007WP\u0012!b[2Q";
        objectArray[37] = "Yr\u000fc6mDgWAw`\\a";
        objectArray[38] = "\",A\u000e\t}\",VR\u0005r8gVL\u0005g?\u0016\u0001\u0011\\ ";
        objectArray[39] = ",\\)\u0017'\":\\,M45-\u0017/K8!<P8\\s3\r";
        objectArray[40] = "\u0016\u001axwj\u000fc:sx{@\u00024xs\u007f\u001av";
        objectArray[41] = "\u00005K8\u0000\u000f\u0002+\u0002[\u000b\u0014\u001d.T\"\f";
        objectArray[42] = "9g\u007f\u001aS>/gz@@)8,yFL=)knQ\u0007*0";
        objectArray[43] = " [3\u001b$iU{8\u00145&4u3\u001f1|@";
        objectArray[44] = "\u0005\b\b\rrg\u0013\b\rWap\u0004C\u000eQmd\u0015\u0004\u0019F&u6";
        objectArray[45] = "[K!0Q>MK$jB)Z\u0000'lN=KG0{\u0005*O";
        objectArray[46] = "s!\u00026\u0015+\u0006\u0001\t9\u0004dg\u000f\u00022\u0000>\u0013";
        objectArray[47] = "aY=\u0004r;jV,K\u001e8dT.\u00042";
        objectArray[48] = "sF(*\u0006\u0005eF-p\u0015\u0012r\r.v\u0019\u0006cJ9aR\u0012\\";
        objectArray[49] = "\u001e}-%(\u0019k]&*9V\nS-!=\f~";
        objectArray[50] = "]F8Z)@KF=\u0000:W\\\r>\u00066CMJ)\u0011}TU";
        objectArray[51] = ",x\u0005 u'YX\u000e/dh8V\u0005$`2L";
        objectArray[52] = "vn}D\u00048`nx\u001e\u0017/w%{\u0018\u001b;fbl\u000fP,\\";
        objectArray[53] = "\u0003\u0005?Y\u0018gv%4V\t(\u0017+?]\rrc";
        objectArray[54] = "'I}3&\u001b3\u001bfaHI3\nB%%K8v2c+\u001b,\rr-8[^";
        objectArray[55] = "\u0003\\1lr9\u0004\u001ae?\u0019>_LkkNi\u0005\u0018>8\u0019mC\u001fdlpj\u0005K7";
        objectArray[56] = "v?\u0001M)P|u\u0015\bE\u0004'j\u001e\u001b\u0012Sy=Fw)\f?8\u001eJ$Q?8";
        objectArray[57] = "3\u000be2\tv;\u0002#>qjn\u0013<(\u001dX:Wfrq?gV!7\b7n\u0010-OKws\u0013b5Klz\u0014\\";
        objectArray[58] = "Pz>\u0013#\nD(%AM[@?-\u001277Pz>\u0013#\nD(%AM";
        objectArray[59] = "\u001d\u0006gA\u001fA\r\u00197C|\u001f\t\u0015gF\u0010-]X<\u001bMz\u0006\u00188[FC\u0015PmG|";
        objectArray[60] = ")&'\u001b>\t58iT\\N(1>T14+n+\u001a9\r;.hP\\";
        objectArray[61] = "=\u001d8(u\u0011g\u001f6}\u0014\u0010ZU~`h^ Ueio";
        objectArray[62] = ".JnAj3%B;K\u00169>B1M\u0016 $\u0014/\u001a/3lA3 m#nJ)Qf+;@U";
        objectArray[63] = "8\"kOD8$<%\u0000&e=+S\u0013VyTa-\u0015Ku;9wO_\u0005";
        objectArray[64] = "\u00189Ad\r\u007f@)K|c|K9\u001ac\u000fN\u001fxA:X\u0019D4E~Y W|\u0010bc{Wz\u0000>Zh\u001f/\u001c\u0004\u0001h\u0019?@=\u0012 L#zf\u0012&\\\u007fCuZs@E";
        objectArray[65] = "&9/dyOz}l2\u001eM=Nq!b]F2,2s\\)jvhg,";
        objectArray[66] = "aa-s\u0001<ghm\n\u001d*~m2f/{?1j6xv:f8z\u0017.`<,\n";
        objectArray[67] = ";om(_A3f+$'Vjf09p\u000106mU\u001d@{wj/\u001d[rp";
        objectArray[68] = "y\bW!R\u0015r\u0000\u0002+.\u0018x\u0000\n;J\r~\u0004l\"_[xSU1\u0017\u000edi\u000e1\u0011\u001e8P\u001dyD\u0002\u0002\u000b\u001d\u007fT^;\u0018U*Hdy\bW!R\u0015r\u0000\u0002+.";
        objectArray[69] = "[\u000fi\"\u0007:[H1i6h1Ji*V6\\\u0001(cV{1\u001dk*\u0006o\b\r+iL\n";
        objectArray[70] = "B\u000b;]\u001agD\u0002{$\u0006q]\u0007$H4&\u001f]y\u001bc%\u0011\u001c1X\u0001f^\u0001/$";
        objectArray[71] = "bfWq=\u0016\"m\u0018.V\u0014\u001e?\u001d96Ast\\p6\f\u001e{\\57Az?Ov7}";
        objectArray[72] = "K\u000b^\u0006'\f\u0013\u001bT\u001eI\u000f\u0018\u000b\u0005\u0001%=LJ^[vjO\u000f\u0015\u001aw\u0010O\u0014\u001c\u001dIUI\u0014X\u00142\u0015\u0007\u0007\u0018f";
        objectArray[73] = "=fiFEV)|(EtXC?oZ\u0014\r.t.\u0013\u0014@Ca%\u0016LP2;'\u0018\u00191";
        objectArray[74] = "MQAK\u001evY\u0003Z\u0019p!N\u000f^G\f&NnH\u0018\u0000'ZS\\J\u001bu4";
        objectArray[75] = ")\u0004r\"uHi\u000e+.\u0019\u0011~\u0003/\"u##Auy\u0019InA$.pN(\u0015wE&HpB=>f\u0006c\u0002Oz%\u0017.\r4:k\u0004n\u007fpyzIa\u000407i\t\u0013";
        objectArray[76] = "Sjz\u001ct\u0016^ev\u0003\n\u000eKs{\u001ec\u0002r}{\u000egd\u001d,t\u001ez\u000bEv.\n\n";
        objectArray[77] = "\tT0\u000b@\u001fJ\u001b-\u0015<\u0018]\u0018+\u001eP*\tYtG\r}\u0001\\ \u0014L\u0012Y\u0006z\u0000<";
        objectArray[78] = "/O_pz\u001esVOj\u0006\u0019oVC\u0011<\u001afP\u0001k<\u0001oW?+~\u0012j\u0012E+e\u001bm,";
        objectArray[79] = "a\nW\u000e`\u0019a\t\u0018V\r\u0014\u0001M_@mAl\u0006\u001e\tm\f\u0001\u0016\u0016\rwG8\u0005^Xk}";
        objectArray[80] = "_\u0010kvN4\u0005\u0012e#/78X->S{BX67T";
        objectArray[81] = "Ah_!J_\u0002\"O;.\u0000\u0010/N,B2Ab\u0010p\u001ee\u0014<\\4Q\u001dG+Ws.YF\"D/\u0014\u001a\f2^K";
        objectArray[82] = "'\u00126B^9'\u00177\u0006=jH\u0012r\b]?%Y3A]rHEp\b\rfqU0KG\u0003";
        objectArray[83] = "T_J\u0019\bS\b\u001b\tOo[P\b\u0018^o^\u000e\u0017AAVNNT\u000b$";
        objectArray[84] = "\r'vWW>\u0002t-P>jh/z\u0012X~\u000f4pOR\u0003";
        objectArray[85] = "\t>`$\u0012Y\u000f7 ]\u000eO\u00162\u007f1<\u0018Th!`k\u0013R9u-\u0004K\bca]";
        objectArray[86] = "bZ\u0005=\\o>C\u0015' h:_efXc'\u0007\u001ffCj 9_$PoeC_?Yh[";
        objectArray[87] = "\u001f`\u0000\u0016mM\u001f'X]\\\u0014u%\u0000\u001e<A\u0018nAW<\fue\u0007\u001c0\u0013HqU\u0007b}";
        objectArray[88] = "\u00182=`S!A2e'c&\b%n>\u0018K\u001b7;<\u001e,\u0000=f6czI3j*\f\"\u0013i~Z";
        objectArray[89] = "L%'\u001263\u0010adDQ9@s\u001cE>lJb{^41@\u001f-\u0017:=\\puM`),";
        objectArray[90] = "\u0004,A%V\u0011X#D<.\u0018bp\u0015<NN\u000f;TuN\u0003byIwS\n\u001bq@1_r";
        objectArray[91] = "37hIc'i5f\u001c\u0002'T\u007f.\u0001~h.\u007f5\by";
        objectArray[92] = "cq\u0018%[\u0006<rZxfS_&AeYR2&Ve\u001b9";
        objectArray[93] = "j2WR:Z:q\u0006\b-*:\n\u0004R5JogO\u0013|J\"\n\u0004R-\u0012.zT\u0011|H9\n";
        objectArray[94] = "\u0000C'\u0012\u0012\u0018\u0014\u0011<@|J\u0014\u0000\r\u0013\u0010%F@4C\u000e^\u0006\u000e'\u0003|";
        objectArray[95] = "<_f\u000b6=6\u0015rNZim\ny]\r>2W\"1`|1\u0000q\r vh\f";
        objectArray[96] = "'\u0003Uxl3{\u001aEb\u0010*w\u00105&,,#\u0012Nfb?c`\n%srl\u001bJk`2\u001e_\tz-=e\u001fGimO";
        objectArray[97] = "\u001c-w\f1\\\u001cj/G\u0000\u0005vhw\u0004`P\u001b#6M`\u001dv>v\n8\u000fL>s\u000b|l";
        objectArray[98] = "\r::s,_K9>c\u001dSw>>}}\u0003\u001au\u007f4}Nw~9\u007fqQJjkd#?";
        objectArray[99] = "_w>K\u00148\u00033}\u001ds ^?hvLg\\pw\r\f)O0\u0005";
        objectArray[100] = "\u0019\u0000\u001dK\\\u0000\t\u001fMI?^\r\u0013\u001dLSlY^F\u0010\u0007;\u0002\u001eBQ\u0005\u0002\u0011V\u0017M?";
        objectArray[101] = "\u001b\u001fD\u001f__B\u001f\u001cXoU\u001b\u000e\u001en\bY\u001fuA\u0019\f\b\u0000\u000e\u0001W\u001fHr";
        objectArray[102] = "I7\u0002hd\r\u0015.\u0012r\u0018\u001a\u0017/b3`\u0001\fj\u00183{\b\u000bTXqh\rN.Xja\np";
        objectArray[103] = "3=\u0003AL\u00063>L\u0019!\u000bSz\u000b\u000fA^>1JFA\u0013S-\t\u000f\u0011\u0007j=IL[b";
        objectArray[104] = "%s\u0018yN\n}c\u0012a \tvsC~L;\"2\u0018%\u0018l$3@$R\u0017d}Sd S'l\u001ek[\u0013i\u007f^\u0019\u001fPx2Qb_\u001ekr#&\u001c\u000f&}XfR\u001cf\u000f";
        objectArray[105] = "f\u0006N\u000f$vfA\u0016D\u0015/\f\u0011\u0015\u0011s6r\u0007\u000e\u0013yFg\u0019\u0012\u0013e8q\u0002\u0010\u0019\u0015";
        objectArray[106] = "\u0014u/\u0016fKHl?\f\u001aRLpO\u0015k\bW,v\u0006#]K\u0016-\u0006%M\u0017/>NpQ-t>H`\r\u0014gv\u001d|7";
        objectArray[107] = "S&6\\\t\u001bX.cVu\u0010O;dA\u0018:(%|\u0002\u000fP\u001164W\u0013jS&6\\\t\u001bX.cVu";
        objectArray[108] = ";}X$HjgdH>4lkxT\"Q\u00168fH9\nl8}A>4";
        objectArray[109] = "\u0003{Q@4,Cq\bLXuT|\f@4G\t;V\u001fX,\u0002q\u0006CboHa\u001c';|Ay\u0015\\=u\u0001\u0000";
        objectArray[110] = "Bu]\u0006Ec^k\u0013I'8Cw_7M1\u0012a^PV;Ok#";
        objectArray[111] = "<p8f+K`i(|WKbI1k6^chX=/Gy-\"=4N~\u0013b\u007f'K;ibd.L\u0005";
        objectArray[112] = "\u0001-H\b\u0012V\t$\u000e\u0004jAP$\u0015\u0019=\u0016\ntIuPWA5O\u000fPLH2";
        objectArray[113] = "\u0017\u000bd\u001a*U\u0016Ky\u0001TJ\u0012LE\b0V\u00190$]7\u0016\u0006Kd\u0013$Vt";
        objectArray[114] = "59E4dsi U.\u0018da;AU\"w|&\u001b/\"lu!%o`\u007fpd_o{vwZ";
        objectArray[115] = "7G{1g\u0016?N==\u001f\nj_\"+s8>\u001bxv\u001f_c\u001a?4fWj\\3L%\u0017w_|6%\f~XB";
        objectArray[116] = "'\u001b9VBw3I\"\u0004,%3X\u0003^Q'^\u001buY\u00118%[;JQJ";
        objectArray[117] = "_S\u0001Oz\u007fCI\u001dTB/d3\u0016F\"%L\b\u0006Yr'/";
        objectArray[118] = "-3*04\u001fqwifS\u001d1dkd/\u001b7\t}\u007f-M/4aac\u0002M";
        objectArray[119] = "Ug\u0006\u0004\u0015yH8S\np*W:_\u0014.-W [h\u00125\f'\fQ\u0001}Y;6";
        objectArray[120] = "!\u001fNe\u000fe*\u0017\u001bosn=\u0002\u001cx\u001eEZ\u001c\u0004;\t.c\u000fLn\u0015\u0014!\u001fNe\u000fe*\u0017\u001bos";
        objectArray[121] = "\n%\rm|\u000e\u0002,Ka\u0004\u0019[,P|SN\u0001|\u000e\u0010>\u000fJ=\nj>\u0014C:";
        Object[] objectArray2 = objectArray;
        objectArray[122] = "%!%H\u0012X,b6XyTW&aX\u0019\r:m \u0011\u0019@WqcXITna#\u001b\u00031";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fO.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d4' || c == 'Q' || c == 'O' || c == '\u00e8') {
                field = fO.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fO.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        Color color2 = (Color)objectArray[1];
        Object object = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        l = m ^ l;
        object = fO.d("k", (float)object, (float)0.0f, (float)1.0f, (long)-6711095160608270121L, (long)l);
        float f = 1.0f - object;
        int n = (int)((float)fO.d("\u00f8", (Object)color, (long)-6711786087213764307L, (long)l) * f + (float)fO.d("\u00f8", (Object)color2, (long)-6711786087213764307L, (long)l) * object);
        int n2 = (int)((float)fO.d("\u00f8", (Object)color, (long)-6719113568017758469L, (long)l) * f + (float)fO.d("\u00f8", (Object)color2, (long)-6719113568017758469L, (long)l) * object);
        int n3 = (int)((float)fO.d("\u00f8", (Object)color, (long)-6714739342873232894L, (long)l) * f + (float)fO.d("\u00f8", (Object)color2, (long)-6714739342873232894L, (long)l) * object);
        return new Color((int)fO.d("k", (int)n, (int)0, (int)fO.c("w", (int)17960, (long)(0x656423AE5AFDD37L ^ l)), (long)-6712792721958877237L, (long)l), (int)fO.d("k", (int)n2, (int)0, (int)fO.c("w", (int)21953, (long)(0x10C1060877514EDAL ^ l)), (long)-6712792721958877237L, (long)l), (int)fO.d("k", (int)n3, (int)0, (int)fO.c("w", (int)21953, (long)(0x10C1060877514EDAL ^ l)), (long)-6712792721958877237L, (long)l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bt_0 var1_1) {
        block67: {
            block64: {
                block61: {
                    block57: {
                        block60: {
                            block58: {
                                block59: {
                                    block56: {
                                        block55: {
                                            v0 = var2_2 = fO.m ^ 52135683889706L;
                                            var4_3 = v0 ^ 23032469673327L;
                                            var6_4 = v0 ^ 72008856319056L;
                                            var8_5 = v0 ^ 78145712816288L;
                                            var10_6 = v0 ^ 114767423788032L;
                                            var12_7 = v0 ^ 46635102536847L;
                                            var14_8 = v0 ^ 95638207915560L;
                                            var16_9 = fO.d("k", (long)5396802401821831750L, (long)var2_2);
                                            try {
                                                try {
                                                    v1 = fO.b;
                                                    if (var16_9 != null) break block55;
                                                    if (fO.d("\u00d4", (Object)v1, (long)5403332478444057466L, (long)var2_2) != null) {
                                                    }
                                                    ** GOTO lbl26
                                                }
                                                catch (MatchException v2) {
                                                    throw fO.d("k", (Object)v2, (long)5397613186140499595L, (long)var2_2);
                                                }
                                                v1 = fO.b;
                                            }
                                            catch (MatchException v3) {
                                                throw fO.d("k", (Object)v3, (long)5397613186140499595L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            if (fO.d("\u00d4", (Object)v1, (long)5396870469509020760L, (long)var2_2) != null) break block56;
lbl26:
                                            // 2 sources

                                            return;
                                        }
                                        catch (MatchException v4) {
                                            throw fO.d("k", (Object)v4, (long)5397613186140499595L, (long)var2_2);
                                        }
                                    }
                                    v5 = new Object[1];
                                    v5[0] = var10_6;
                                    var17_10 = fO.d("k", (float)(fO.d("\u00f8", (Object)this.k, (Object)v5, (long)5395787563064529364L, (long)var2_2) / 50.0f), (float)4.0f, (long)5397836130208458883L, (long)var2_2);
                                    v6 = new Object[1];
                                    v6[0] = var4_3;
                                    fO.d("\u00f8", (Object)this.k, (Object)v6, (long)5398603768667170793L, (long)var2_2);
                                    var18_11 = (String)fO.d("\u00f8", (Object)this.a, (long)5397412728188628973L, (long)var2_2);
                                    var19_12 = fO.d("\u00f8", (Object)((Integer)fO.d("\u00f8", (Object)this.c, (long)5397412728188628973L, (long)var2_2)), (long)5399312194964339167L, (long)var2_2);
                                    var20_13 = fO.d("\u00f8", (Object)((Integer)fO.d("\u00f8", (Object)this.d, (long)5397412728188628973L, (long)var2_2)), (long)5399312194964339167L, (long)var2_2);
                                    v7 = new Object[1];
                                    v7[0] = var12_7;
                                    var21_14 = fO.d("k", (Object)v7, (long)5396694226231900743L, (long)var2_2);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v8 = fO.d("\u00f8", (Object)this.j, (long)5395939571284907962L, (long)var2_2);
                                                    if (var16_9 != null) break block57;
                                                    if (v8 != false) break block58;
                                                }
                                                catch (MatchException v9) {
                                                    throw fO.d("k", (Object)v9, (long)5397613186140499595L, (long)var2_2);
                                                }
                                                v10 = this.l;
                                                if (var16_9 != null) break block59;
                                            }
                                            catch (MatchException v11) {
                                                throw fO.d("k", (Object)v11, (long)5397613186140499595L, (long)var2_2);
                                            }
                                            if (v10 == null) break block60;
                                        }
                                        catch (MatchException v12) {
                                            throw fO.d("k", (Object)v12, (long)5397613186140499595L, (long)var2_2);
                                        }
                                        v10 = this.l;
                                    }
                                    catch (MatchException v13) {
                                        throw fO.d("k", (Object)v13, (long)5397613186140499595L, (long)var2_2);
                                    }
                                }
                                try {
                                    cfr_temp_0 = fO.d("\u00f8", (Object)v10, (Object)var21_14, (long)5403212857557371644L, (long)var2_2) - 256.0;
                                    v8 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                    if (var16_9 != null) break block57;
                                    if (v8 <= 0) break block60;
                                }
                                catch (MatchException v14) {
                                    throw fO.d("k", (Object)v14, (long)5397613186140499595L, (long)var2_2);
                                }
                            }
                            v8 = (reference)1;
                            break block57;
                        }
                        v8 = (reference)0;
                    }
                    var22_15 /* !! */  = v8;
                    try {
                        this.l = var21_14;
                        v15 = var22_15 /* !! */ ;
                        if (var16_9 != null) break block61;
                        if (v15 != 0) {
                        }
                        ** GOTO lbl121
                    }
                    catch (MatchException v16) {
                        throw fO.d("k", (Object)v16, (long)5397613186140499595L, (long)var2_2);
                    }
                    var23_16 = (reference)0;
                    var24_18 /* !! */  = (int)(var19_12 * fO.c("w", (int)4447, (long)(7320539409457341048L ^ var2_2)));
                    while (fO.d("\u00f8", (Object)this.j, (long)5398323533153541366L, (long)var2_2) < var19_12 && var23_16 < var24_18 /* !! */ ) {
                        block62: {
                            block63: {
                                v17 = new Object[4];
                                v17[3] = var8_5;
                                v17[2] = (int)var20_13;
                                v17[1] = var21_14;
                                v17[0] = var18_11;
                                var25_20 = fO.d("\u00f8", (Object)this, (Object)v17, (long)5398172520693171465L, (long)var2_2);
                                try {
                                    try {
                                        if (var16_9 != null) break block62;
                                        if (var25_20 == null) break block63;
                                    }
                                    catch (MatchException v18) {
                                        throw fO.d("k", (Object)v18, (long)5397613186140499595L, (long)var2_2);
                                    }
                                    fO.d("\u00f8", (Object)this.j, (Object)var25_20, (long)5396503821287863310L, (long)var2_2);
                                }
                                catch (MatchException v19) {
                                    throw fO.d("k", (Object)v19, (long)5397613186140499595L, (long)var2_2);
                                }
                            }
                            ++var23_16;
                        }
                        if (var16_9 == null) continue;
                    }
                    try {
                        if (var16_9 == null) break block64;
lbl121:
                        // 2 sources

                        v15 = (int)fO.d("k", (double)((double)(var17_10 * (float)fO.d("k", (int)1, (int)(var19_12 / fO.c("w", (int)5519, (long)(4010801181240977068L ^ var2_2))), (long)5398220834033747006L, (long)var2_2))), (long)5399532024241521397L, (long)var2_2);
                    }
                    catch (MatchException v20) {
                        throw fO.d("k", (Object)v20, (long)5397613186140499595L, (long)var2_2);
                    }
                }
                var23_16 = v15;
                var24_18 /* !! */  = 0;
                while (fO.d("\u00f8", (Object)this.j, (long)5398323533153541366L, (long)var2_2) < var19_12 && var24_18 /* !! */  < var23_16) {
                    block65: {
                        block66: {
                            v21 = new Object[4];
                            v21[3] = var8_5;
                            v21[2] = (int)var20_13;
                            v21[1] = var21_14;
                            v21[0] = var18_11;
                            var25_20 = fO.d("\u00f8", (Object)this, (Object)v21, (long)5398172520693171465L, (long)var2_2);
                            try {
                                try {
                                    if (var16_9 != null) break block65;
                                    if (var25_20 == null) break block66;
                                }
                                catch (MatchException v22) {
                                    throw fO.d("k", (Object)v22, (long)5397613186140499595L, (long)var2_2);
                                }
                                fO.d("\u00f8", (Object)this.j, (Object)var25_20, (long)5396503821287863310L, (long)var2_2);
                            }
                            catch (MatchException v23) {
                                throw fO.d("k", (Object)v23, (long)5397613186140499595L, (long)var2_2);
                            }
                        }
                        ++var24_18 /* !! */ ;
                    }
                    if (var16_9 == null) continue;
                }
            }
            var23_17 = fO.d("\u00f8", (Object)this.j, (long)5399766509852767102L, (long)var2_2);
            while (fO.d("\u00f8", (Object)var23_17, (long)5403670330390455628L, (long)var2_2) != false) {
                block71: {
                    block72: {
                        block70: {
                            block68: {
                                block69: {
                                    var24_19 = (gg_0)fO.d("\u00f8", (Object)var23_17, (long)5398074412689893660L, (long)var2_2);
                                    try {
                                        try {
                                            try {
                                                v24 = new Object[2];
                                                v24[1] = var6_4;
                                                v24[0] = Float.valueOf((float)(var17_10 * fO.d("\u00f8", (Object)((Float)fO.d("\u00f8", (Object)this.e, (long)5397412728188628973L, (long)var2_2)), (long)5399678349355735178L, (long)var2_2)));
                                                fO.d("\u00f8", (Object)var24_19, (Object)v24, (long)5397233347451087953L, (long)var2_2);
                                                if (var16_9 != null) break block67;
                                                cfr_temp_1 = var24_19.c - (float)var24_19.d;
                                                v25 /* !! */  = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                if (var16_9 != null) break block68;
                                            }
                                            catch (MatchException v26) {
                                                throw fO.d("k", (Object)v26, (long)5397613186140499595L, (long)var2_2);
                                            }
                                            if (v25 /* !! */  <= 0) break block69;
                                        }
                                        catch (MatchException v27) {
                                            throw fO.d("k", (Object)v27, (long)5397613186140499595L, (long)var2_2);
                                        }
                                        fO.d("\u00f8", (Object)var23_17, (long)5403574660457837353L, (long)var2_2);
                                        if (var16_9 == null) continue;
                                    }
                                    catch (MatchException v28) {
                                        throw fO.d("k", (Object)v28, (long)5397613186140499595L, (long)var2_2);
                                    }
                                }
                                v25 /* !! */  = (cfr_temp_2 = fO.d("\u00f8", (Object)var24_19.a, (Object)var21_14, (long)5403212857557371644L, (long)var2_2) - (double)var20_13 * 1.6 * ((double)var20_13 * 1.6)) == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                            }
                            try {
                                if (v25 /* !! */  > 0) {
                                    fO.d("\u00f8", (Object)var23_17, (long)5403574660457837353L, (long)var2_2);
                                    if (var16_9 == null) continue;
                                }
                            }
                            catch (MatchException v29) {
                                throw fO.d("k", (Object)v29, (long)5397613186140499595L, (long)var2_2);
                            }
                            var25_20 = fO.d("\u00f8", (Object)fO.d("\u00d4", (Object)fO.b, (long)5396870469509020760L, (long)var2_2), (Object)fO.d("k", (Object)var24_19.a, (long)5397064075306708963L, (long)var2_2), (long)5397875220795329210L, (long)var2_2);
                            try {
                                try {
                                    v30 = fO.d("\u00f8", (Object)var25_20, (long)5397293336940449568L, (long)var2_2);
                                    if (var16_9 != null) break block70;
                                    if (v30 != false) break block71;
                                }
                                catch (MatchException v31) {
                                    throw fO.d("k", (Object)v31, (long)5397613186140499595L, (long)var2_2);
                                }
                                v30 = fO.d("\u00f8", (Object)var25_20, (long)5396154243890868925L, (long)var2_2);
                            }
                            catch (MatchException v32) {
                                throw fO.d("k", (Object)v32, (long)5397613186140499595L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                if (var16_9 != null) break block72;
                                if (v30 != false) break block71;
                            }
                            catch (MatchException v33) {
                                throw fO.d("k", (Object)v33, (long)5397613186140499595L, (long)var2_2);
                            }
                            v30 = fO.d("\u00f8", (Object)fO.d("\u00f8", (Object)var25_20, (long)5396420668495214037L, (long)var2_2), (long)5395658702085760747L, (long)var2_2);
                        }
                        catch (MatchException v34) {
                            throw fO.d("k", (Object)v34, (long)5397613186140499595L, (long)var2_2);
                        }
                    }
                    try {
                        if (v30 != false) {
                            fO.d("\u00f8", (Object)var23_17, (long)5403574660457837353L, (long)var2_2);
                        }
                    }
                    catch (MatchException v35) {
                        throw fO.d("k", (Object)v35, (long)5397613186140499595L, (long)var2_2);
                    }
                }
                if (var16_9 == null) continue;
            }
            v36 = new Object[3];
            v36[2] = var14_8;
            v36[1] = var18_11;
            v36[0] = var1_1;
            fO.d("\u00f8", (Object)this, (Object)v36, (long)5396226566798632686L, (long)var2_2);
        }
    }

    /*
     * Exception decompiling
     */
    private gg_0 a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 20[SWITCH]
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
        if (u[n3] != null) {
            return n3;
        }
        Object object = t[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 33;
            case 2 -> 3;
            case 3 -> 29;
            case 4 -> 9;
            case 5 -> 5;
            case 6 -> 31;
            case 7 -> 35;
            case 8 -> 17;
            case 9 -> 16;
            case 10 -> 34;
            case 11 -> 61;
            case 12 -> 46;
            case 13 -> 20;
            case 14 -> 45;
            case 15 -> 38;
            case 16 -> 28;
            case 17 -> 58;
            case 18 -> 40;
            case 19 -> 62;
            case 20 -> 7;
            case 21 -> 32;
            case 22 -> 48;
            case 23 -> 21;
            case 24 -> 11;
            case 25 -> 6;
            case 26 -> 23;
            case 27 -> 43;
            case 28 -> 37;
            case 29 -> 10;
            case 30 -> 36;
            case 31 -> 26;
            case 32 -> 57;
            case 33 -> 51;
            case 34 -> 47;
            case 35 -> 4;
            case 36 -> 24;
            case 37 -> 54;
            case 38 -> 12;
            case 39 -> 8;
            case 40 -> 30;
            case 41 -> 60;
            case 42 -> 59;
            case 43 -> 63;
            case 44 -> 19;
            case 45 -> 50;
            case 46 -> 2;
            case 47 -> 0;
            case 48 -> 44;
            case 49 -> 53;
            case 50 -> 27;
            case 51 -> 55;
            case 52 -> 42;
            case 53 -> 22;
            case 54 -> 25;
            case 55 -> 18;
            case 56 -> 14;
            case 57 -> 56;
            case 58 -> 39;
            case 59 -> 41;
            case 60 -> 49;
            case 61 -> 15;
            case 62 -> 52;
            default -> 1;
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
        fO.u[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fO.m(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = fO.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fO.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fO.g(clazz3, string2, clazz2)) != null) {
                    fO.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fO.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fO.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fO.n(1162662660433525L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fO.m(l, l2);
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
                clazz3 = fO.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fO.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fO.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fO.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fO.n(1162662660433525L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fO.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fO.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fO.n(1162662660433525L, 0L);
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
     * Exception decompiling
     */
    private void j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[TRYBLOCK]], but top level block is 26[SWITCH]
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

    private boolean lambda$new$0(Color color) {
        Object object;
        block2: {
            block3: {
                long l = m ^ 0x75989A02CFDFL;
                CallSite callSite = fO.d("k", (long)-6985063494152788045L, (long)l);
                try {
                    object = fO.d("\u00f8", (Object)((Boolean)((Object)fO.d("\u00f8", (Object)this.g, (long)-6984470912922600936L, (long)l))), (long)-6983916131199890667L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw fO.d("k", (Object)matchException, (long)-6981293649712137346L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fO.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fO.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fO.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


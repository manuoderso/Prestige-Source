/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2777
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.aI;
import dev.zprestige.prestige.aJ;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
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
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_2777;

public class d4
extends dV {
    private dS a;
    private dP c;
    private dP d;
    private dP e;
    private static final UUID f;
    private Map g;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Long[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public d4() {
        long l = k ^ 0x5E8954EB5B52L;
        long l2 = l ^ 0x616FC549B3E5L;
        this.g = new IdentityHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$2;
        d4.d("O", (Object)this.e, (Object)objectArray, (long)-7118659751782945420L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this::lambda$new$1;
        d4.d("O", (Object)this.d, (Object)objectArray2, (long)-7118659751782945420L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = this::lambda$new$0;
        d4.d("O", (Object)this.c, (Object)objectArray3, (long)-7118659751782945420L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        d4.k = hc.a(-5843254533834480076L, -1920964837643387003L, MethodHandles.lookup().lookupClass()).a(87898564912699L);
                        var20 = d4.k ^ 103810158561779L;
                        d4.r = new Object[71];
                        d4.s = new String[71];
                        d4.f();
                        d4.n = new HashMap<K, V>(13);
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
                        var18_3 = new String[7];
                        var16_4 = 0;
                        var15_5 = "\u0003m\t\u0084\u001dE\u0080\u00e5\u008c\u00b9r\u001f\u00fdV\u0014i\u0018!.\u00c8\u00cbjV<\u001cS\u00be\u00e1@l,\u00a9\u00c1|\u007fsK)K\u00e27\u0010\u0089|\u00f8\u00b1\u00d0Tb\u0016\u00eb)\u00bc\u00ca\u00aaz\u0086e\u0010\u00bc\u00bd\u00d3\u008d\u00c6U\u00d8\u0010\u0006\u00f3,\u00c5ej\u00a6~\u0010\u00e0`\u009e]\u00a4\u009aD9\u00b8>'i\u00d1v\u001d\u00ec";
                        var17_6 = "\u0003m\t\u0084\u001dE\u0080\u00e5\u008c\u00b9r\u001f\u00fdV\u0014i\u0018!.\u00c8\u00cbjV<\u001cS\u00be\u00e1@l,\u00a9\u00c1|\u007fsK)K\u00e27\u0010\u0089|\u00f8\u00b1\u00d0Tb\u0016\u00eb)\u00bc\u00ca\u00aaz\u0086e\u0010\u00bc\u00bd\u00d3\u008d\u00c6U\u00d8\u0010\u0006\u00f3,\u00c5ej\u00a6~\u0010\u00e0`\u009e]\u00a4\u009aD9\u00b8>'i\u00d1v\u001d\u00ec".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = d4.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00bd\u00a8eU8\u00bf#\u0086\u00b0\t\u0084\u00a9\u00e9\u00cb\u00c7g\u0010J\u00cd\u00b8\u00fc\u0092\u00bf\u009d1\u00c6\u00066\u0086\u00e9\u00c2=2";
                            var17_6 = "\u00bd\u00a8eU8\u00bf#\u0086\u00b0\t\u0084\u00a9\u00e9\u00cb\u00c7g\u0010J\u00cd\u00b8\u00fc\u0092\u00bf\u009d1\u00c6\u00066\u0086\u00e9\u00c2=2".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = d4.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                d4.l = var18_3;
                d4.m = new String[7];
                d4.q = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u00b7\u00e0A\u00d4V\u009a`\u00ab\u00b8@\u00a2h\u00ba\u00f9\u00faQ";
                var5_15 = "\u00b7\u00e0A\u00d4V\u009a`\u00ab\u00b8@\u00a2h\u00ba\u00f9\u00faQ".length();
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
                    var4_14 = "C\u0018\u0088\u00e2\u00a4G\u0003\u0093\u0019\u0084\u00fe\u00c72\u001f\u0093\u00a6";
                    var5_15 = "C\u0018\u0088\u00e2\u00a4G\u0003\u0093\u0019\u0084\u00fe\u00c72\u001f\u0093\u00a6".length();
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
        d4.o = var6_12;
        d4.p = new Long[4];
        d4.f = new UUID((long)d4.c("f", (int)26546, (long)(8606698683271063792L ^ var20)), (long)d4.c("f", (int)5429, (long)(1890875879142939253L ^ var20)));
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x50FA;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])d4.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    d4.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/d4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d4.l[n2].getBytes("ISO-8859-1");
            d4.m[n2] = d4.b(((Cipher)objectArray[0]).doFinal(byArray2));
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
            throw new RuntimeException("dev/zprestige/prestige/d4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d4.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = d4.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC4;
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
                throw new RuntimeException("dev/zprestige/prestige/d4", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            d4.p[n2] = l4;
        }
        return p[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d4.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                d4.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d4.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d4.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d4.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d4.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "i&*G8X\u007f&/\u001d+Ohm,\u001b'[y*;\flL^";
        objectArray[1] = "\u000f\"\"\bW}z\u0002)\u0007F2\u001b\f\"\fBho";
        objectArray[2] = Boolean.TYPE;
        d4.s[2] = "java/lang/Boolean";
        objectArray[3] = "%\u0013+b\u0013<;\u001b1-p(?";
        objectArray[4] = Void.TYPE;
        d4.s[4] = "java/lang/Void";
        objectArray[5] = "<;_\u000f]T*;ZUNC=pYSBW,7ND\tE\u0010";
        objectArray[6] = "x\u00001>hb\r :1y-l.1:}w\u0018";
        objectArray[7] = "Q\u0007\u0019dS#G\u0007\u001c>@4PL\u001f8L A\u000b\b/\u00077e";
        objectArray[8] = "\f_Dj&%y\u007fOe7j\u0018qDn30l";
        objectArray[9] = "i\rZ\u001c9\u0002i\rM@5\rsFM^5\u0018t7\u001f\u000bg_";
        objectArray[10] = "O1\b\u0018\u0007|:\u0011\u0003\u0017\u00163G\t\u0010\u0010\u001fz/";
        objectArray[11] = "q\u0013K\u0015(cq\u0013\\I$lkX\\W$yl)\t\u000fu";
        objectArray[12] = Integer.TYPE;
        d4.s[12] = "java/lang/Integer";
        objectArray[13] = "wG.7\u000f\u001biO4xt;Tb";
        objectArray[14] = "\u000e}',ZK\u0018}\"vI\\\u000f6!pEH\u001eq6g\u000eZ#";
        objectArray[15] = "\t8&{K6|\u0018-tZy\u001d\u0016&\u007f^#i";
        objectArray[16] = "1\u000b\u001e0kt1\u000b\tlg{+@\trgn,1[(3*";
        objectArray[17] = "A\u00077;\u001aIJ\b&t}K_\u0003&?F";
        objectArray[18] = "\u0002=dh@Z\t2u'!T\u00029q}";
        objectArray[19] = "l@+\u0004w`l@<X{ov\u000b<F{zqzi\u0019.";
        objectArray[20] = "Av/\u0015!aWv*O2v@=)I>bQz>^uu\u0011";
        objectArray[21] = "kC%\u0011nR`L4^\r_uA;58]dR'\u0019/P";
        objectArray[22] = "^lv5t\u0015^laix\u001aD'awx\u000fCV1*)";
        objectArray[23] = "'2*Y\u001bP12/\u0003\bG&y,\u0005\u0004S7>;\u0012OD\b";
        objectArray[24] = "Qd:B\u0010AOl \rmQO";
        objectArray[25] = "zf\b(Axdn\u0012g\tx~d\n \u0000c>W\f,\u000bdsf\n,";
        objectArray[26] = "jt]\u0011oT|tXK|Ck?[MpWzxLZ;Eg";
        objectArray[27] = "j\u0001}b0>\u001f!vm!q~/}f%+\n";
        objectArray[28] = "l)\u00133\u000b]l)\u0004o\u0007Rvb\u0004q\u0007Gq\u0013Q.^";
        objectArray[29] = "%LZ!#r3L_{0e$\u0007\\}<q5@Kjw`&";
        objectArray[30] = "EnLGo\u00140NGH~[Q@LCz\u0001%";
        objectArray[31] = "*Po\bkZ*PxTgU0\u001bxJg@7j)\u0013?\u0005";
        objectArray[32] = "\u001b:cT+K\r:f\u000e8\\\u001aqe\b4H\u000b6r\u001f\u007fX\u00136p\u0014%\u0015/-p\t%R\u0018:";
        objectArray[33] = "+\u0000\\;T\u001a+\u0000KgX\u00151KKyX\u00006:\u0019'\u0000D";
        objectArray[34] = "s \u0001;M\u0003\u0006\u0000\n4\\Lg\u000e\u0001?X\u0016\u0013";
        objectArray[35] = "\t9,f%G\t9;:)H\u0013r;$)]\u0014\u0003j\u007f\u007f\u0019";
        objectArray[36] = "b{Qo\u001e,<yOi\"!Y#\u0001w\\7cq\u0005.FK";
        objectArray[37] = "uis\rj?+km\u000bV1Ni%\u000ek&$pu\fnXudd\b2*-d \u001aV";
        objectArray[38] = "+\u001ai\u0016\u0018-}Mj\u0001%~$\u0011u\nr){L.fGh Dc\u0018A.y\u001b";
        objectArray[39] = "Zx\u0011\nZ{O|Q\u00023cX!\u0014\u0004ts1u\u0018\u0014Pr\f8\u0018\u0018\f\u001dZx\u0011\nZ{O|Q\u00023";
        objectArray[40] = "\u0007U\u001fJe+GNJX\u001c<@N{D!>[H\u0015\u0011|6\u00012\u0017\u0015f\"G\\BHnx=^FRz>S\u000b\u001bZ D";
        objectArray[41] = "@wS\u007f`;\u0000l\u0006m\u00197\u0017alpeT\u001a+Spu$\u000bkYv\u0019";
        objectArray[42] = "S\n\u001cK\u0013~]_QG(%RHMMD\u0017\u0005\u0004\u0012\u0013(qSNWC\u0016?\u0006\u000bU*\u00178\u0005NC[L~Q_-";
        objectArray[43] = "-WM`!n7I\u0012xZe*M\u001dm6Wz\u0001E7Z9)N\u00062 ~6SL\n";
        objectArray[44] = "ewv\u0018P93 u\u000fmafmn\u000f\u0001S2,0Rmh5 oSSf`mch";
        objectArray[45] = "\u0005\u0001o\u0014\f\f\u0001S;_c\u001d`\nf\\]@P\n`\r\r";
        objectArray[46] = "a\u0010\u001c@5\u001fgVE\u001fG\u0004n\u0014\u0019\u001f+63TGIGQr\u0015\u001a\u0017z\u001cr\u0019Fx!\b?\u0001\u0013\u0001?\u001a=\u001ay";
        objectArray[47] = ">\u007f\u0010Y\u0006i$aOA}i5tD_*9l \u001a3Mv)zO\u000e\u0000v%&";
        objectArray[48] = "&[LuJ\u007f&]\u001d%v&GZO1K1-C\u001f3NO|W\u000e7\u0012=$WJ%v";
        objectArray[49] = "G\u000b;R\u0014?VK1Tx5JU8A\u0015\u000eI0?O\u00024\u0019Jn\u0007\u001b&'\t1@\u0003w]N.]IO";
        objectArray[50] = "\u0005\u0006&7(CE\u001ds%QMD,'--]?X,**\u0014E\u001f37`,";
        objectArray[51] = "A_3]6.NI7\u0003U2\u001eKi_\u0002mE\u001f33k%AHnAd3E\u0016";
        objectArray[52] = "\u000e\u0014%\u0002\u001f.\u000e\u0012tR#wo\u0015&F\u001e`\u0005\fvD\u001b\u001e\u000fI{QOn\u001e\tqW#";
        objectArray[53] = "\u0019zV\u0003\u000e@Ya\u0003\u0011wUNxU\u001f\u001a/O H\u0007\rA\u001a}@]wC\u001egT\u001b\u0019\u0016Co\u000ea";
        objectArray[54] = "o:naB;4|:p,/=>4|@\u001djsi*,z!?7t\u00117!3k\u001b";
        objectArray[55] = "=+'E\u0016\u0011fmsTx\u0005o/}X\u001478b \u000fx^{ms\\\nQmi-?";
        objectArray[56] = "\u0002@+R\u0010\u001a\rV/\fs\u0006]TqP$Y\u0006\u0000(<M\u0011\u0002WvNB\u0007\u0006\t";
        objectArray[57] = "At4]\u000fR\u000f!q_f\u0012\u001db5F\u0001\np(?Z\u0005\u0003Me?VYl";
        objectArray[58] = "!*;)[qa1n;\"u\u007f 61\"%q5#/P}qq1K";
        objectArray[59] = "ua\u000bn9+x:\r\u00142\u0017peM)%}i5O,[.y#L,!if>\u0006\u0014";
        objectArray[60] = ")APH4JyQWMFF\u0018Z\u0015]{QrCE_~/r[\u001cM=AhECUF";
        objectArray[61] = "\f\u001bIdKb\u0019\u001f\tl\"e\u0001ZonFy\n&\u0001v_g\b\u001bLvS;g";
        objectArray[62] = "|q\u0000\f\u0000X2$E\u000ei\u000b4`\u0013\u0012\u0012f! \u0000\u0010\u0013\bt}\bJi_#b\u0001N\u0013\u0018<\u007fKv";
        objectArray[63] = ";*{\fMc!4$\u00146h<0+\u0001ZZlruY6<=61\u000f\brhs3f";
        objectArray[64] = "\rw}1\u0000\u0006\u001fw,e{W`$b.KQ\n0'!\u0007>\r6ol\u0014T\u0019s` {";
        objectArray[65] = "%%88+ h<)2U/\u0018)n\"h8r0> mF%%88+ h<)2U";
        objectArray[66] = "\u001f`m\u0005\u000fv\u0002f|F>v|g>D\u0003a\u0016~nF\u0006\u001f\u0019=}\\CyMyyP>";
        objectArray[67] = "$\u0001!Rb!5A+T\u000e:#\\9Vo7?:)\u0002t7>T|_|mD\u0003+@ui>D4]?Q";
        objectArray[68] = "t7>2>\u000e\u007f g6Y\u0003\u001b><'?\u0010uka/ej";
        objectArray[69] = "\u0004\u00131\t'tD\bd\u001b^tS\b\u0012\u0011\u0012vP\u001d(\u000f\"\u001bRI/\r$u\u0007\u0014'W^w\u0003\u000e3\u00110\"^\u0006ik2&D\u0012/\u0005g{LHU";
        Object[] objectArray2 = objectArray;
        objectArray[70] = "u&Tjd)mx]h\u001a u-\u001cO!q)wd(k6q'Yek:-H";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d4.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == '\u00e5' || c == '\u00c1' || c == '\u00cd') {
                field = d4.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d4.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(aI var1_1) {
        block56: {
            block62: {
                block61: {
                    block60: {
                        block59: {
                            block58: {
                                block57: {
                                    block54: {
                                        block55: {
                                            block63: {
                                                block53: {
                                                    block52: {
                                                        block50: {
                                                            block51: {
                                                                block49: {
                                                                    var2_2 = d4.k ^ 139374325002421L;
                                                                    var4_3 = var2_2 ^ 57167287926312L;
                                                                    var7_4 = d4.d("O", (Object)var1_1, (Object)new Object[0], (long)3948818357219084281L, (long)var2_2);
                                                                    var8_5 = d4.d("O", (Object)var7_4, (long)3949049938033531998L, (long)var2_2);
                                                                    var6_6 = d4.d("g", (long)3948319150453647380L, (long)var2_2);
                                                                    try {
                                                                        try {
                                                                            v0 = new Object[2];
                                                                            v0[1] = var4_3;
                                                                            v0[0] = d4.b("q", (int)21729, (long)(9186515229321704157L ^ var2_2));
                                                                            v1 = d4.d("O", (Object)this.a, (Object)v0, (long)3948800795355192673L, (long)var2_2);
                                                                            if (var6_6 != null) break block49;
                                                                            if (v1 == false) break block50;
                                                                        }
                                                                        catch (MatchException v2) {
                                                                            throw d4.d("g", (Object)v2, (long)3950238333254592161L, (long)var2_2);
                                                                        }
                                                                        v1 = d4.d("O", (Object)var8_5, (Object)d4.f, (long)3948960988051305175L, (long)var2_2);
                                                                    }
                                                                    catch (MatchException v3) {
                                                                        throw d4.d("g", (Object)v3, (long)3950238333254592161L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var6_6 != null) break block51;
                                                                        if (v1 == false) {
                                                                        }
                                                                        ** GOTO lbl39
                                                                    }
                                                                    catch (MatchException v4) {
                                                                        throw d4.d("g", (Object)v4, (long)3950238333254592161L, (long)var2_2);
                                                                    }
                                                                    v1 = d4.d("O", (Object)var8_5, (long)3948667840320032174L, (long)var2_2);
                                                                }
                                                                catch (MatchException v5) {
                                                                    throw d4.d("g", (Object)v5, (long)3950238333254592161L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                if (v1 == 4) break block50;
lbl39:
                                                                // 2 sources

                                                                d4.d("O", (Object)var1_1, (Object)new Object[0], (long)3948385358989360197L, (long)var2_2);
                                                                return;
                                                            }
                                                            catch (MatchException v6) {
                                                                throw d4.d("g", (Object)v6, (long)3950238333254592161L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v7 = d4.d("O", (Object)d4.b, (long)3947688643392519294L, (long)var2_2);
                                                                if (var6_6 != null) break block52;
                                                                if (v7 == null) break block53;
                                                            }
                                                            catch (MatchException v8) {
                                                                throw d4.d("g", (Object)v8, (long)3950238333254592161L, (long)var2_2);
                                                            }
                                                            v7 = d4.d("O", (Object)d4.b, (long)3947688643392519294L, (long)var2_2);
                                                        }
                                                        catch (MatchException v9) {
                                                            throw d4.d("g", (Object)v9, (long)3950238333254592161L, (long)var2_2);
                                                        }
                                                    }
                                                    v10 = d4.d("O", (Object)v7, (Object)var8_5, (long)3947553015251555629L, (long)var2_2);
                                                    break block63;
                                                }
                                                v10 = null;
                                            }
                                            var9_7 = v10;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v11 = new Object[2];
                                                                v11[1] = var4_3;
                                                                v11[0] = d4.b("q", (int)31914, (long)(1900711945010977431L ^ var2_2));
                                                                v12 /* !! */  = d4.d("O", (Object)this.a, (Object)v11, (long)3948800795355192673L, (long)var2_2);
                                                                if (var6_6 != null) break block54;
                                                                if (v12 /* !! */  == false) break block55;
                                                            }
                                                            catch (MatchException v13) {
                                                                throw d4.d("g", (Object)v13, (long)3950238333254592161L, (long)var2_2);
                                                            }
                                                            cfr_temp_0 = (long)d4.d("\u00f2", (Object)var7_4, (long)3947900993547957603L, (long)var2_2) * d4.c("f", (int)24878, (long)(4907964666777589547L ^ var2_2)) - (long)d4.d("O", (Object)((Integer)d4.d("O", (Object)this.d, (long)3950517699649486563L, (long)var2_2)), (long)3948927002652677221L, (long)var2_2);
                                                            v12 /* !! */  = (CallSite)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                            if (var6_6 != null) break block54;
                                                        }
                                                        catch (MatchException v14) {
                                                            throw d4.d("g", (Object)v14, (long)3950238333254592161L, (long)var2_2);
                                                        }
                                                        if (v12 /* !! */  < 0) break block55;
                                                    }
                                                    catch (MatchException v15) {
                                                        throw d4.d("g", (Object)v15, (long)3950238333254592161L, (long)var2_2);
                                                    }
                                                    if (var9_7 != null) break block55;
                                                }
                                                catch (MatchException v16) {
                                                    throw d4.d("g", (Object)v16, (long)3950238333254592161L, (long)var2_2);
                                                }
                                                d4.d("O", (Object)var1_1, (Object)new Object[0], (long)3948385358989360197L, (long)var2_2);
                                                return;
                                            }
                                            catch (MatchException v17) {
                                                throw d4.d("g", (Object)v17, (long)3950238333254592161L, (long)var2_2);
                                            }
                                        }
                                        v18 = new Object[2];
                                        v18[1] = var4_3;
                                        v18[0] = d4.b("q", (int)18947, (long)(803937123191368765L ^ var2_2));
                                        v12 /* !! */  = d4.d("O", (Object)this.a, (Object)v18, (long)3948800795355192673L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            if (v12 /* !! */  == false) break block56;
                                            v19 = var9_7;
                                            if (var6_6 != null) break block57;
                                        }
                                        catch (MatchException v20) {
                                            throw d4.d("g", (Object)v20, (long)3950238333254592161L, (long)var2_2);
                                        }
                                        if (v19 == null) break block56;
                                    }
                                    catch (MatchException v21) {
                                        throw d4.d("g", (Object)v21, (long)3950238333254592161L, (long)var2_2);
                                    }
                                    v19 = var9_7;
                                }
                                var10_8 = d4.d("O", (Object)v19, (long)3949619742238073316L, (long)var2_2);
                                try {
                                    try {
                                        v22 = var10_8;
                                        v23 = d4.d("\u00c1", (long)3948559936313913523L, (long)var2_2);
                                        if (var6_6 != null) break block58;
                                        if (v22 != v23) {
                                        }
                                        ** GOTO lbl136
                                    }
                                    catch (MatchException v24) {
                                        throw d4.d("g", (Object)v24, (long)3950238333254592161L, (long)var2_2);
                                    }
                                    v22 = var10_8;
                                    v23 = d4.d("\u00c1", (long)3949337832698116944L, (long)var2_2);
                                }
                                catch (MatchException v25) {
                                    throw d4.d("g", (Object)v25, (long)3950238333254592161L, (long)var2_2);
                                }
                            }
                            try {
                                if (v22 != v23) break block59;
lbl136:
                                // 2 sources

                                v26 = 1;
                                break block60;
                            }
                            catch (MatchException v27) {
                                throw d4.d("g", (Object)v27, (long)3950238333254592161L, (long)var2_2);
                            }
                        }
                        v26 = 0;
                    }
                    var11_9 = v26;
                    try {
                        try {
                            v28 /* !! */  = var11_9;
                            if (var6_6 != null) break block61;
                            if (v28 /* !! */  == 0) break block56;
                        }
                        catch (MatchException v29) {
                            throw d4.d("g", (Object)v29, (long)3950238333254592161L, (long)var2_2);
                        }
                        v28 /* !! */  = (int)d4.d("O", (Object)var9_7, (long)3949564264060655395L, (long)var2_2);
                    }
                    catch (MatchException v30) {
                        throw d4.d("g", (Object)v30, (long)3950238333254592161L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var6_6 != null) break block62;
                        if (v28 /* !! */  != 0) break block56;
                    }
                    catch (MatchException v31) {
                        throw d4.d("g", (Object)v31, (long)3950238333254592161L, (long)var2_2);
                    }
                    cfr_temp_1 = (long)d4.d("\u00f2", (Object)var7_4, (long)3947900993547957603L, (long)var2_2) * d4.c("f", (int)5410, (long)(6162292053465932581L ^ var2_2)) - (long)d4.d("O", (Object)((Integer)d4.d("O", (Object)this.e, (long)3950517699649486563L, (long)var2_2)), (long)3948927002652677221L, (long)var2_2);
                    v28 /* !! */  = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                }
                catch (MatchException v32) {
                    throw d4.d("g", (Object)v32, (long)3950238333254592161L, (long)var2_2);
                }
            }
            try {
                if (v28 /* !! */  >= 0) {
                    d4.d("O", (Object)var1_1, (Object)new Object[0], (long)3948385358989360197L, (long)var2_2);
                }
            }
            catch (MatchException v33) {
                throw d4.d("g", (Object)v33, (long)3950238333254592161L, (long)var2_2);
            }
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(aJ aJ2) {
        long l = k ^ 0x40404A8620DAL;
        d4.d("O", (Object)aJ2, (Object)new Object[0], (long)-1827259603829773270L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bg_0 var1_1) {
        block29: {
            block35: {
                block34: {
                    block33: {
                        block31: {
                            block32: {
                                block30: {
                                    block28: {
                                        v0 = var2_2 = d4.k ^ 139198983828863L;
                                        var4_3 = v0 ^ 56784286497762L;
                                        var6_4 = v0 ^ 72526416193594L;
                                        var8_5 = d4.d("g", (long)3675288050653687262L, (long)var2_2);
                                        try {
                                            try {
                                                v1 = new Object[2];
                                                v1[1] = var4_3;
                                                v1[0] = d4.b("q", (int)17965, (long)(4933874537534432732L ^ var2_2));
                                                v2 /* !! */  = d4.d("O", (Object)this.a, (Object)v1, (long)3676895790337824939L, (long)var2_2);
                                                if (var8_5 != null) break block28;
                                                if (v2 /* !! */  == false) break block29;
                                            }
                                            catch (MatchException v3) {
                                                throw d4.d("g", (Object)v3, (long)3681710901257266027L, (long)var2_2);
                                            }
                                            v2 /* !! */  = (CallSite)(d4.d("O", (Object)var1_1, (Object)new Object[0], (long)3681859790970056086L, (long)var2_2) instanceof class_2777);
                                        }
                                        catch (MatchException v4) {
                                            throw d4.d("g", (Object)v4, (long)3681710901257266027L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (v2 /* !! */  == false) break block29;
                                                v5 = d4.d("\u00f2", (Object)d4.b, (long)3675367762040609079L, (long)var2_2);
                                                if (var8_5 != null) break block30;
                                            }
                                            catch (MatchException v6) {
                                                throw d4.d("g", (Object)v6, (long)3681710901257266027L, (long)var2_2);
                                            }
                                            if (v5 == null) break block29;
                                        }
                                        catch (MatchException v7) {
                                            throw d4.d("g", (Object)v7, (long)3681710901257266027L, (long)var2_2);
                                        }
                                        v5 = d4.d("\u00f2", (Object)d4.b, (long)3675367762040609079L, (long)var2_2);
                                    }
                                    catch (MatchException v8) {
                                        throw d4.d("g", (Object)v8, (long)3681710901257266027L, (long)var2_2);
                                    }
                                }
                                var9_6 = d4.d("O", (Object)v5, (int)d4.d("O", (Object)((class_2777)d4.d("O", (Object)var1_1, (Object)new Object[0], (long)3681859790970056086L, (long)var2_2)), (long)3682134102130500187L, (long)var2_2), (long)3675950013424174987L, (long)var2_2);
                                try {
                                    v9 = var9_6;
                                    if (var8_5 != null) break block31;
                                    if (v9 != null) break block32;
                                }
                                catch (MatchException v10) {
                                    throw d4.d("g", (Object)v10, (long)3681710901257266027L, (long)var2_2);
                                }
                                return;
                            }
                            v9 = var9_6;
                        }
                        try {
                            try {
                                if (var8_5 != null) break block33;
                                if (!(v9 instanceof class_1657)) break block29;
                            }
                            catch (MatchException v11) {
                                throw d4.d("g", (Object)v11, (long)3681710901257266027L, (long)var2_2);
                            }
                            v9 = var9_6;
                        }
                        catch (MatchException v12) {
                            throw d4.d("g", (Object)v12, (long)3681710901257266027L, (long)var2_2);
                        }
                    }
                    var10_7 = (class_1657)v9;
                    try {
                        try {
                            v13 = d4.d("O", (Object)d4.d("O", (Object)d4.d("\u00c1", (long)3675906110421115556L, (long)var2_2), (Object)new Object[0], (long)3676376707805495623L, (long)var2_2), (Object)var9_6, (long)3681929350620167672L, (long)var2_2);
                            if (var8_5 != null) break block34;
                            if (v13 != false) break block29;
                        }
                        catch (MatchException v14) {
                            throw d4.d("g", (Object)v14, (long)3681710901257266027L, (long)var2_2);
                        }
                        v13 = d4.d("O", (Object)((Integer)d4.d("O", (Object)this.c, (long)3681990326179478313L, (long)var2_2)), (long)3677022470643487151L, (long)var2_2);
                    }
                    catch (MatchException v15) {
                        throw d4.d("g", (Object)v15, (long)3681710901257266027L, (long)var2_2);
                    }
                }
                var11_8 = v13;
                var12_9 = d4.d("O", (Object)((Integer)d4.d("O", (Object)this.g, (Object)var10_7, (Object)d4.d("g", (int)0, (long)3675459247807764774L, (long)var2_2), (long)3682112503865007123L, (long)var2_2)), (long)3677022470643487151L, (long)var2_2) + 1;
                try {
                    try {
                        if (var8_5 != null) break block35;
                        if (var12_9 >= var11_8) {
                        }
                        ** GOTO lbl102
                    }
                    catch (MatchException v16) {
                        throw d4.d("g", (Object)v16, (long)3681710901257266027L, (long)var2_2);
                    }
                    v17 = new Object[2];
                    v17[1] = var6_4;
                    v17[0] = var10_7;
                    d4.d("O", (Object)d4.d("\u00c1", (long)3675906110421115556L, (long)var2_2), (Object)v17, (long)3676116241321486963L, (long)var2_2);
                    d4.d("O", (Object)this.g, (Object)var10_7, (long)3676440418623827562L, (long)var2_2);
                }
                catch (MatchException v18) {
                    throw d4.d("g", (Object)v18, (long)3681710901257266027L, (long)var2_2);
                }
            }
            try {
                if (var8_5 == null) break block29;
lbl102:
                // 2 sources

                d4.d("O", (Object)this.g, (Object)var10_7, (Object)d4.d("g", (int)var12_9, (long)3675459247807764774L, (long)var2_2), (long)3675528922240606677L, (long)var2_2);
            }
            catch (MatchException v19) {
                throw d4.d("g", (Object)v19, (long)3681710901257266027L, (long)var2_2);
            }
        }
    }

    @bP
    public void a(bG bG2) {
        block4: {
            long l = k ^ 0x8F283E6DDF0L;
            CallSite callSite = d4.d("g", (long)1985605201984111953L, (long)l);
            try {
                CallSite callSite2;
                try {
                    callSite2 = d4.d("O", (Object)this.g, (long)1984959238520475878L, (long)l);
                    if (callSite != null || callSite2 != false) break block4;
                }
                catch (MatchException matchException) {
                    throw d4.d("g", (Object)matchException, (long)1988170897076407268L, (long)l);
                }
                callSite2 = d4.d("O", (Object)d4.d("O", (Object)this.g, (long)1985253564710475619L, (long)l), d4::lambda$onTick$3, (long)1984707567426621062L, (long)l);
            }
            catch (MatchException matchException) {
                throw d4.d("g", (Object)matchException, (long)1988170897076407268L, (long)l);
            }
        }
    }

    @bP
    public void a(a5 a52) {
        long l = k ^ 0x22CB9FE6FB4DL;
        d4.d("O", (Object)this.g, (long)4410393668099822596L, (long)l);
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
            case 0 -> 17;
            case 1 -> 57;
            case 2 -> 45;
            case 3 -> 50;
            case 4 -> 47;
            case 5 -> 63;
            case 6 -> 48;
            case 7 -> 20;
            case 8 -> 38;
            case 9 -> 19;
            case 10 -> 52;
            case 11 -> 21;
            case 12 -> 22;
            case 13 -> 60;
            case 14 -> 46;
            case 15 -> 42;
            case 16 -> 1;
            case 17 -> 9;
            case 18 -> 3;
            case 19 -> 59;
            case 20 -> 36;
            case 21 -> 14;
            case 22 -> 12;
            case 23 -> 41;
            case 24 -> 55;
            case 25 -> 8;
            case 26 -> 56;
            case 27 -> 37;
            case 28 -> 27;
            case 29 -> 58;
            case 30 -> 13;
            case 31 -> 35;
            case 32 -> 26;
            case 33 -> 33;
            case 34 -> 16;
            case 35 -> 7;
            case 36 -> 61;
            case 37 -> 6;
            case 38 -> 40;
            case 39 -> 39;
            case 40 -> 15;
            case 41 -> 28;
            case 42 -> 30;
            case 43 -> 2;
            case 44 -> 31;
            case 45 -> 34;
            case 46 -> 43;
            case 47 -> 10;
            case 48 -> 25;
            case 49 -> 62;
            case 50 -> 0;
            case 51 -> 23;
            case 52 -> 5;
            case 53 -> 51;
            case 54 -> 18;
            case 55 -> 54;
            case 56 -> 32;
            case 57 -> 53;
            case 58 -> 49;
            case 59 -> 4;
            case 60 -> 29;
            case 61 -> 44;
            case 62 -> 11;
            default -> 24;
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
        d4.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d4.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = d4.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d4.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d4.g(clazz3, string2, clazz2)) != null) {
                    d4.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d4.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d4.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d4.n(1336552542501952L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d4.m(l, l2);
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
                clazz3 = d4.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d4.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d4.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d4.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d4.n(1336552542501952L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d4.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d4.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d4.n(1336552542501952L, 0L);
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

    private boolean lambda$new$0(Integer n) {
        long l = k ^ 0x46A4ED0C6701L;
        long l2 = l ^ 0xB983BCE299CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = d4.b("q", (int)19296, (long)(0x71EAEFB2673ABAECL ^ l));
        return (boolean)d4.d("O", (Object)this.a, (Object)objectArray, (long)-6811469033699767595L, (long)l);
    }

    private boolean lambda$new$2(Integer n) {
        long l = k ^ 0x145C006E42CFL;
        long l2 = l ^ 0x5960D6AC0C52L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = d4.b("q", (int)14071, (long)(0x5DE1E32EC6FDE2B7L ^ l));
        return (boolean)d4.d("O", (Object)this.a, (Object)objectArray, (long)-8883737326188843237L, (long)l);
    }

    private boolean lambda$new$1(Integer n) {
        long l = k ^ 0x65DDF633C7AEL;
        long l2 = l ^ 0x28E120F18933L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = d4.b("q", (int)403, (long)(0x3E3090C42AD150B1L ^ l));
        return (boolean)d4.d("O", (Object)this.a, (Object)objectArray, (long)132836920660011642L, (long)l);
    }

    private static boolean lambda$onTick$3(class_1657 class_16572) {
        Object object;
        block2: {
            block3: {
                long l = k ^ 0x4C8D1DACC3E9L;
                CallSite callSite = d4.d("g", (long)402805082600790856L, (long)l);
                try {
                    object = d4.d("O", (Object)class_16572, (long)402180504841793726L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw d4.d("g", (Object)matchException, (long)400295462630348285L, (long)l);
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
            return MethodHandles.lookup().findStatic(d4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(d4.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(d4.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


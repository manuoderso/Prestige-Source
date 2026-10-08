/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dR;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e_
extends dV {
    private final dL f;
    private final dR b;
    private final dM d;
    private final dN c;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public e_() {
        long l;
        long l2 = l = k ^ 0x7A89982ECAAL;
        long l3 = l2 ^ 0x28CA7408E4D2L;
        long l4 = l2 ^ 0x6A7F2A2A9D91L;
        long l5 = l2 ^ 0x5B688BA5E28DL;
        long l6 = l2 ^ 0x5A7821A6C8FBL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l6;
        objectArray[1] = (int)e_.c("d", (int)16799, (long)(0x685D5DCDBAB111E6L ^ l));
        objectArray[0] = e_.b("r", (int)31257, (long)(0x12B6A6679F4A5774L ^ l));
        this.f = e_.d("\u00c9", (Object)this, (Object)objectArray, (long)3767122470493281219L, (long)l);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l4;
        objectArray2[2] = new String[]{e_.b("r", (int)30292, (long)(0x2D3F18B411E0DB3BL ^ l)), e_.b("r", (int)18868, (long)(0x59ACC475472F64DCL ^ l))};
        objectArray2[1] = e_.b("r", (int)17210, (long)(0x2807D965BB0DEE56L ^ l));
        objectArray2[0] = e_.b("r", (int)19795, (long)(0x43E7B1D3DBACE03DL ^ l));
        this.b = e_.d("\u00c9", (Object)this, (Object)objectArray2, (long)3766785318708582445L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l5;
        objectArray3[1] = false;
        objectArray3[0] = e_.b("r", (int)30549, (long)(0x39A73CFD4D4FDA3FL ^ l));
        this.d = e_.d("\u00c9", (Object)this, (Object)objectArray3, (long)3766721093207386123L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l3;
        objectArray4[1] = new Color((int)e_.c("d", (int)14927, (long)(0x3D89F2E9A7D6A37L ^ l)), (int)e_.c("d", (int)21562, (long)(0x1B028BC746F40441L ^ l)), (int)e_.c("d", (int)47, (long)(0xFB7FBE82A885055L ^ l)));
        objectArray4[0] = e_.b("r", (int)29138, (long)(0x7AC502CFCFF1DCB9L ^ l));
        this.c = e_.d("\u00c9", (Object)this, (Object)objectArray4, (long)3767196904742011102L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        e_.k = hc.a(-5272258940797737243L, -589556879832025489L, MethodHandles.lookup().lookupClass()).a(201308385362343L);
                        e_.r = new Object[14];
                        e_.s = new String[14];
                        e_.f();
                        e_.n = new HashMap<K, V>(13);
                        var11 = e_.k ^ 2529199004213L;
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
                        var17_5 = "\n\u0091iQ\u0002E\u009c\u00e4\u00c3\u00f5\u00c0\u00a2\u00aeea\u0007\u00a4K\u00c8z\u00a2_Y\u00f5\u0010\u0016\u00fcKf\u00ea\u00f5\u00a9`\u0082\u009f\u009fcL\u0084O\u00a2\u0010\u00a0\u00c1\u0081\u0093\t\u00faK\u000eD\u00a7b\u00fc[\u00e8l\u00c2 \u00a8f\u008f\u009f\u0003\u00b8\u00e5\"\fX\u00e5\u0000)\u00ed\u0006=hsL\\\u009dG\u00b5\u00cb\u00db88:0\"\u00f6@\u0010vXs\u00e6|\u00e5'\u00bcn\b\r\u0085s\u00c2\u001aM";
                        var19_6 = "\n\u0091iQ\u0002E\u009c\u00e4\u00c3\u00f5\u00c0\u00a2\u00aeea\u0007\u00a4K\u00c8z\u00a2_Y\u00f5\u0010\u0016\u00fcKf\u00ea\u00f5\u00a9`\u0082\u009f\u009fcL\u0084O\u00a2\u0010\u00a0\u00c1\u0081\u0093\t\u00faK\u000eD\u00a7b\u00fc[\u00e8l\u00c2 \u00a8f\u008f\u009f\u0003\u00b8\u00e5\"\fX\u00e5\u0000)\u00ed\u0006=hsL\\\u009dG\u00b5\u00cb\u00db88:0\"\u00f6@\u0010vXs\u00e6|\u00e5'\u00bcn\b\r\u0085s\u00c2\u001aM".length();
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
                            var20_3[var18_4++] = e_.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "b\u0005N\u00e4_\u0084$]\u009e<z\u00f9\u0019\u00bc7.CVP?\u00a8\u00bb\u00e8\u008c_b\u0081\u00b6YP0\u00d0 \u00b44o31O\u0018cM\u000e\u00e8zA\u0086\u00fb\u00bf\u00f9\u00ff\u00a0Q\u00c7a][\u0089\u00e0*\u0015\u00caG\u0091p";
                            var19_6 = "b\u0005N\u00e4_\u0084$]\u009e<z\u00f9\u0019\u00bc7.CVP?\u00a8\u00bb\u00e8\u008c_b\u0081\u00b6YP0\u00d0 \u00b44o31O\u0018cM\u000e\u00e8zA\u0086\u00fb\u00bf\u00f9\u00ff\u00a0Q\u00c7a][\u0089\u00e0*\u0015\u00caG\u0091p".length();
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
                            var20_3[var18_4++] = e_.b(var21_9).intern();
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
                e_.l = var20_3;
                e_.m = new String[7];
                e_.q = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "b\u00fe\u0017\u0094\u00c3<k\u00ce4\u0006\u00bfo\u00ad\u00f4\u00be-";
                var5_15 = "b\u00fe\u0017\u0094\u00c3<k\u00ce4\u0006\u00bfo\u00ad\u00f4\u00be-".length();
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
                    var4_14 = "\u00dc\u00ff\u00d5\u008aP\u00e5\u0098\u001dHA*Ij\u00e3\u0089,";
                    var5_15 = "\u00dc\u00ff\u00d5\u008aP\u00e5\u0098\u001dHA*Ij\u00e3\u0089,".length();
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
        e_.o = var6_12;
        e_.p = new Integer[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x192B;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])e_.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e_.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e_.l[n2].getBytes("ISO-8859-1");
            e_.m[n2] = e_.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e_.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/e_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public dR b(Object[] objectArray) {
        return this.b;
    }

    public dN b(Object[] objectArray) {
        return this.c;
    }

    public dM b(Object[] objectArray) {
        return this.d;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e_.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x643F;
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
                throw new RuntimeException("dev/zprestige/prestige/e_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e_.p[n2] = n3;
        }
        return p[n2];
    }

    public dL c(Object[] objectArray) {
        return this.f;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e_.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                e_.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e_.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e_.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e_.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e_.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "Y\u0012a\b\u0003\u0007O\u0012dR\u0010\u0010XYgT\u001c\u0004I\u001epCW\u0013h";
        objectArray[1] = "\u00147\u0003Wc\u0006a\u0017\bXrI\u0000\u0019\u0003Sv\u0013t";
        objectArray[2] = "i}>\u00016\u001c\u007f};[%\u000bh68])\u001fyq/Jb\bC";
        objectArray[3] = "Y\\Cw\u000eO,|Hx\u001f\u0000MrCs\u001bZ9";
        objectArray[4] = "|\u0012A,l1j\u0012Dv\u007f&}YGps2l\u001ePg8%T";
        objectArray[5] = "\"SQsc#WsZ|rl6}Qwv6B";
        objectArray[6] = "5E\u001e&0Z#E\u001b|#M4\u000e\u0018z/Y%I\u000fmdN\u001c";
        objectArray[7] = "\u0010r@(IieRK'X&\u0004\\@,\\|p";
        objectArray[8] = "\rkKH\u001c=\u001bkN\u0012\u000f*\f M\u0014\u0003>\u001dgZ\u0003H);";
        objectArray[9] = "\u001cV\u0019\u0000gG\u0017Y\bO\u0006I\u001cR\f\u0015";
        objectArray[10] = "\u001d[l \u0010;M\u001dcGFF\u0010\u0017c\u007f\u0013>LJ}\u007f/}\u0014En|_*_J1G";
        objectArray[11] = "\u0005]v5eqU\u001byR3\f\b\u0011yjftTLgjZ5[Xf(gu\n[~R";
        objectArray[12] = "z\bgRIa*Nh5\u001f\u001cwDh\rJd+\u0019v\rv -NfN\u0007%0Ob5";
        Object[] objectArray2 = objectArray;
        objectArray[13] = ":f\fBf\u0014j \u0003%0i7*\u0003\u001de\u0011kw\u001d\u001dYTidZN$\t;#Z%";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e_.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'r' || c == '\u00ef' || c == '\u00aa' || c == '\u00e4') {
                field = e_.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'r' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e_.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 5;
            case 1 -> 1;
            case 2 -> 17;
            case 3 -> 36;
            case 4 -> 4;
            case 5 -> 25;
            case 6 -> 12;
            case 7 -> 62;
            case 8 -> 57;
            case 9 -> 10;
            case 10 -> 3;
            case 11 -> 26;
            case 12 -> 58;
            case 13 -> 46;
            case 14 -> 48;
            case 15 -> 19;
            case 16 -> 29;
            case 17 -> 54;
            case 18 -> 16;
            case 19 -> 2;
            case 20 -> 22;
            case 21 -> 55;
            case 22 -> 49;
            case 23 -> 61;
            case 24 -> 11;
            case 25 -> 43;
            case 26 -> 7;
            case 27 -> 63;
            case 28 -> 15;
            case 29 -> 59;
            case 30 -> 6;
            case 31 -> 52;
            case 32 -> 40;
            case 33 -> 9;
            case 34 -> 37;
            case 35 -> 18;
            case 36 -> 39;
            case 37 -> 8;
            case 38 -> 33;
            case 39 -> 28;
            case 40 -> 42;
            case 41 -> 56;
            case 42 -> 21;
            case 43 -> 24;
            case 44 -> 32;
            case 45 -> 35;
            case 46 -> 60;
            case 47 -> 45;
            case 48 -> 47;
            case 49 -> 50;
            case 50 -> 27;
            case 51 -> 30;
            case 52 -> 38;
            case 53 -> 13;
            case 54 -> 41;
            case 55 -> 53;
            case 56 -> 23;
            case 57 -> 0;
            case 58 -> 14;
            case 59 -> 44;
            case 60 -> 51;
            case 61 -> 20;
            case 62 -> 31;
            default -> 34;
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
        e_.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e_.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = e_.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e_.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e_.g(clazz3, string2, clazz2)) != null) {
                    e_.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e_.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e_.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e_.n(639257910050785L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e_.m(l, l2);
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
                clazz3 = e_.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e_.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e_.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e_.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e_.n(639257910050785L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e_.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e_.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e_.n(639257910050785L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(e_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(e_.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


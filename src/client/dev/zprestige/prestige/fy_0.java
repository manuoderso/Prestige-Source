/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.ah_0;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bo_0;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.n_0;
import dev.zprestige.prestige.q_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;

/*
 * Renamed from dev.zprestige.prestige.fy
 */
public class fy_0
extends dV {
    private static final float a = 20.0f;
    private static final float c = 4.0f;
    private ah_0 d;
    private float e;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final Object[] r;
    private static final String[] s;

    public fy_0() {
        long l = k ^ 0x785D8422575DL;
        long l2 = l ^ 0x6B9EC7EAAF7L;
        this.d = new ah_0(500.0f, false, n_0.BACK_IN_OUT, l2);
        this.e = 0.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    fy_0.k = hc.a(2112633500893637992L, -7350835657012200727L, MethodHandles.lookup().lookupClass()).a(40532854431115L);
                    fy_0.r = new Object[80];
                    fy_0.s = new String[80];
                    fy_0.f();
                    fy_0.n = new HashMap<K, V>(13);
                    var11 = fy_0.k ^ 51383498759651L;
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
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "\u0016u\u00c1\"G\u00e7\u00ca\u008a\u00f5!\u00a3\u00e1C\u00b7\u00d50\u00a40\u00fdk\u009e\u00a4\u008d\u0080\u00cc\u00fd\nh$\u00c3_\u00a9\u0010\u0006\u00c4\u0081\u00ee\u008b\\\u008d\u00d9\u00c6\u00b3\u00e6\u00efP\r\u00007\u0010K\u00bev\u00be{\u00b0\u00a5y0\u00e4\u00ea\u00df\u0006\u00c7\u0017\u0093";
                    var19_6 = "\u0016u\u00c1\"G\u00e7\u00ca\u008a\u00f5!\u00a3\u00e1C\u00b7\u00d50\u00a40\u00fdk\u009e\u00a4\u008d\u0080\u00cc\u00fd\nh$\u00c3_\u00a9\u0010\u0006\u00c4\u0081\u00ee\u008b\\\u008d\u00d9\u00c6\u00b3\u00e6\u00efP\r\u00007\u0010K\u00bev\u00be{\u00b0\u00a5y0\u00e4\u00ea\u00df\u0006\u00c7\u0017\u0093".length();
                    var16_7 = 32;
                    var15_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = fy_0.b(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                fy_0.l = var20_3;
                fy_0.m = new String[3];
                fy_0.q = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u0010\u00f7}\u0000W\u00e5\u001b\u00bc|\u000fw,k\u00e9/\t\u0086\u00f6\u009d\u00d5\u00d6\u00b5\u00eb\u00bd";
                var5_15 = "\u0010\u00f7}\u0000W\u00e5\u001b\u00bc|\u000fw,k\u00e9/\t\u0086\u00f6\u009d\u00d5\u00d6\u00b5\u00eb\u00bd".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "f.>\u00a5\u00f8%\n\u009c\u00fd*;\u00f5QR\u00dc}";
                    var5_15 = "f.>\u00a5\u00f8%\n\u009c\u00fd*;\u00f5QR\u00dc}".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl117:
                // 1 sources

                ** continue;
            }
        }
        fy_0.o = var6_12;
        fy_0.p = new Integer[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3430;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])fy_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fy_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fy", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fy_0.l[n2].getBytes("ISO-8859-1");
            fy_0.m[n2] = fy_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fy_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1281;
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
                throw new RuntimeException("dev/zprestige/prestige/fy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fy_0.p[n2] = n3;
        }
        return p[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fy_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fy_0.m(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                fy_0.r[n] = clazz = Class.forName(s[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fy_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fy_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fy_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fy_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = r;
        r[0] = "$\u000f\u0013\u001a2I:\u0007\tUOY:";
        objectArray[1] = "\f\\2\u0000\u000be\u0007S#Ojk\fX'\u0015";
        objectArray[2] = "\u0011np!a\u0001\u0011ng}m\u000e\u000b%gcm\u001b\fT7><";
        objectArray[3] = "&dI+I#&d^wE,</^iE9;^\f5\u0010{";
        objectArray[4] = "\u0017\u001f}QcX\u0001\u001fx\u000bpO\u0016T{\r|[\u0007\u0013l\u001a7I;";
        objectArray[5] = "\u0003l.dw!vL%kfn\u000bT6lo'c";
        objectArray[6] = "\u001eF=V\u0015V\u001eF*\n\u0019Y\u0004\r*\u0014\u0019L\u0003|~LN";
        objectArray[7] = "PD\u0019`L\u001bPD\u000e<@\u0014J\u000f\u000e\"@\u0001M~[v\u0019B";
        objectArray[8] = Double.TYPE;
        fy_0.s[8] = "java/lang/Double";
        objectArray[9] = "\u001f]O~\u001f\u001f\u001f]X\"\u0013\u0010\u0005\u0016X<\u0013\u0005\u0002g\tdA";
        objectArray[10] = "\u0007K\u0015RDS\u0011K\u0010\bWD\u0006\u0000\u0013\u000e[P\u0017G\u0004\u0019\u0010B&";
        objectArray[11] = "uIBAK*\u0000iINZeagBE^?\u0015";
        objectArray[12] = "Vr*DLEKgrf\rHSa";
        objectArray[13] = Integer.TYPE;
        fy_0.s[13] = "java/lang/Integer";
        objectArray[14] = "g\"*L.Hg\"=\u0010\"G}i=\u000e\"Rz\u0018kSp\u0015";
        objectArray[15] = "CjF\u001eS@CjQB_OY!Q\\_Z^P\u0003\b\u000e\u001b";
        objectArray[16] = "\u000eh\t\u001a%\u0003\u000eh\u001eF)\f\u0014#\u001eX)\u0019\u0013RL\u0003qX";
        objectArray[17] = "Y\u0004:q\u0016CY\u0004--\u001aLCO-3\u001aYD>}jH\u0018";
        objectArray[18] = Float.TYPE;
        fy_0.s[18] = "java/lang/Float";
        objectArray[19] = Boolean.TYPE;
        fy_0.s[19] = "java/lang/Boolean";
        objectArray[20] = "qX&)k]gX#sxJp\u0013 ut^aT7b?Kl";
        objectArray[21] = "q?g'~Lz0vh\u001dAo=y\u0003(C~.e/?N";
        objectArray[22] = "FZkw\u0015/PZn-\u00068G\u0011m+\n,VVz<A<NVx7\u001bqrMx*\u001b6EZ";
        objectArray[23] = ")|{1hF?|~k{Q(7}mwE9pjz<U\u000e";
        objectArray[24] = "\u007fq,\u0006WUiq)\\DB~:*ZHVo}=M\u0003FZ";
        objectArray[25] = "h\\+q7\f\u001d| ~&C|r+u\"\u0019\b";
        objectArray[26] = Void.TYPE;
        fy_0.s[26] = "java/lang/Void";
        objectArray[27] = "\u0007-\u0010sLS\u00053Y\u0010GH\u001a6\u000fi@";
        objectArray[28] = "|iT*\u000fJjiQp\u001c]}\"Rv\u0010IleEa[^Z";
        objectArray[29] = "-68Ho\u0016X\u00163G~Y9\u00188Lz\u0003M";
        objectArray[30] = "=\u0001_\u0005G\u0014H!T\nV[)/_\u0001R\u0001]";
        objectArray[31] = "^#\u0014\u0018;6U,\u0005WX;@*";
        objectArray[32] = "$h=;U\u001c2h8aF\u000b%#;gJ\u001f4d,p\u0001\r(";
        objectArray[33] = "w\u00195k?Y\u00029>d.\u0016c75o*L\u0017";
        objectArray[34] = "r\u0011g*\u007ft\u00071l%n;f?g.ja\u0012";
        objectArray[35] = "_ux)kT*Us&z\u001bK[x-~A?";
        objectArray[36] = "6d\u0018\u0010Ll d\u001dJ_{7/\u001eLSo&h\t[\u0018\u007f ";
        objectArray[37] = "k&4\u0006W\u0019\u001e\u0006?\tFV\u007f\b4\u0002B\f\u000b";
        objectArray[38] = "\u001fXU7B\u0016\tXPmQ\u0001\u001e\u0013Sk]\u0015\u000fTD|\u0016\u0002\u0010";
        objectArray[39] = "Md}m!-8Dvb0bYJ}i48-";
        objectArray[40] = "\u0011#\\\u0011*T\u0007#YK9C\u0010hZM5W\u0001/MZ~@\u0011";
        objectArray[41] = "V:.j1_#\u001a%e \u0010B\u0014.n$J6";
        objectArray[42] = "\u0018!asQ7\u000e!d)B \u0019jg/N4\b-p8\u0005!M";
        objectArray[43] = "aU{m\u0002W\u0014upb\u0013\u0018u{{i\u0017B\u0001";
        objectArray[44] = "P^;*lXP^,v`WJ\u0015,h`BMd~24\u0006";
        objectArray[45] = "\u0007PK\u001f)\u0016rp@\u00108Y\u0013~K\u001b<\u0003g";
        objectArray[46] = "1\u0016*^\u000131\u0016=\u0002\r<+]=\u001c\r),,oB]hl";
        objectArray[47] = "\u007f\u000f\u0006*\u0019S\u007f\u000f\u0011v\u0015\\eD\u0011h\u0015Ib5C6M\r";
        objectArray[48] = "9\u001dH#O0\u007f\u001aJ93jm\u0007X;_X:A\u0006l\b\u000f:\u0017C%Tip\u001c\tf3";
        objectArray[49] = "_o\bs-IYo\b|U\u0018e!Qr:\r\u000ft\u0014#>r";
        objectArray[50] = "{\t;kno=\u000e9q\u0012>#\u0002/xEi}Uw\u0014.5:\u0013./~\"!P";
        objectArray[51] = "\t2\u0003&)gY%\u0018eL9X+\u001b= \u000b\tj@`r\\\bmE116\u00058\u0015gLaS4B7v:V9\u000bZ";
        objectArray[52] = "\u0003E\u0016\u0015\taSR\rVl?R\\\u000e\u000e\u0000\r\u0002\u001fTQldVA\u0001\t\u00039]MTi";
        objectArray[53] = "\n`\rMg#\\!SP\u001d.5!J^y+_/L\u0012dB\u0005/\bPt0\u0005!J\\\u001d";
        objectArray[54] = "WwS_R\u0019\u001d|\u0019\u001c5\u001a\u0000gHAY(Q'\u0018\u00185N\u0000vFV\u0004\u0004\n|X&";
        objectArray[55] = "\u0000\u001aJfQU]\u0011F31_S\u000fKn]m\u0007K\u001171\u0004W\u0012Di^Y\\\u001e\u0011\t\f\\]JF3WYP\u0003+";
        objectArray[56] = "[ s8A3N*3&$gS$*,s3\tvty$4\bw%=N9]'s";
        objectArray[57] = "kgdJ\u0005Ni~~\u001ewCcnaB \u0013984\u0016wGkaeIMS`n8";
        objectArray[58] = "B_@\u0002aAN\u001aH\u0016\u0011\u0019D\u0018X\n}+\u0010Y\u0003S*|B\u001cU\u000b,\u0007B\u0015]]\u0011\u0017Q\t^Pj\u0017X\u0001\bmz\u0004D\u0002\u0005\u0016z\rLT8\u0006i\u0011OYC\u0006`\u0019\u0019d";
        objectArray[59] = "\u001exG#KyNo\\`.'Oa_8B\u0015\u001c$\u0006b..@wX>D(\u0013qY_";
        objectArray[60] = "\u001bleuSA\u0014fej!Lv3:g\u0019E\rcv;_%\u0018ae<A^H-9z!";
        objectArray[61] = "K-zCH\u001d\u001c<?\u001f.\u0013%<|GB\u0003I?!\u001f@";
        objectArray[62] = "M(\"P\u000b%X2-\u001672\"*i\u001bS%H$oWNLCk}\u0014YvY6|\u00157";
        objectArray[63] = ")uFO \u0012c~\f\fG\u0011~e]Q+#/$\u0005\fGE~tSFv\u000ft~M6";
        objectArray[64] = "/~\u000f{c\u0006|%\u0002\u007f\u000e\u00077,\u000e9j\u00121(h)v\u0016+x\u0013)\u007f\u001e}E\u0003:c\u001dp>\u00033kKM.\u0010/hF6.\u0019'>{/~\u000f{c\u0006|%\u0002\u007f\u000e";
        objectArray[65] = "tq0aD!p:ah *\u00175qwD*};w;YC|3fc\u001d8|:n5 ";
        objectArray[66] = "_t/I\u0005^\\)wK~[004W\u001a[Z>2\u001b\u00072_2\u007f\u001cB[J(pZ~";
        objectArray[67] = "1-s6?M=h{\"O\u00157jk>#'c+0dppgph`\"J<ue)OA7{e)~\u000b=q{Y";
        objectArray[68] = "Chf|V\u0011\u00103kx;\u0017J:e(;\u0007Y>gx@\u0007P61EP\u0014L5<>P\u001dDc\u0001.C\u0001Gnz.J\t\u0011Sc~\\UL.0%QQ!";
        objectArray[69] = "ZxXl~-S,D:\u001e)V0>=x/\u0006-\u0004f}\"O@\u0003f}uRzXcp<?}Xc'!\u0005&]nnL";
        objectArray[70] = "dlS.1.jc^7\u000f:\u0001pX5k:k~^yvS`1L:aizlM;\u000f";
        objectArray[71] = "\u001dZ2\u000f\u0019\u0003\u0013U?\u0016'\u0017xF9\u0014C\u0017\u0012H?X^~\u0013@.\u0000\u001a\u0005\u0013I&V'";
        objectArray[72] = "\u0015*\u0019XD\u001d\u00000\u0016\u001ex\u001dz(R\u0013\u001c\u001d\u0010&T_\u0001t\u0011.E\u0007E\u000f\u0011'MQx";
        objectArray[73] = "K\u0002m\u001b@0\u000bCe\u001d:m3BfT^`YL`\u0018C\t_^vA[cY\rp@:";
        objectArray[74] = "W\u001fU3#\u000fUQ\u0017f\u0018T.\u0011U{|VD\u001fS7a?OPAtv\u0005U\r@u\u0018";
        objectArray[75] = "t#Yrw\"6cWt\u001b!\u000fb\u0012i\u007f%el\u0014%bLn#\u0006fuvt~\u0007g\u001b";
        objectArray[76] = "ww@8i=v$R)\u000f%\u000b9J:k%a7LvvLv$S!~rk;V7\u000f";
        objectArray[77] = "?H\u0000&J~i\t^;0u\u0000\tG5Tvj\u0007AyI\u001fk\u000fP!\rdk\u0006Xw0";
        objectArray[78] = "^Bt%g[\u0005W{E`Xo\u0017\"7`TSLt?f6^Bt%g[\u0005W{E";
        Object[] objectArray2 = objectArray;
        objectArray[79] = "`[@Zh]n\u0001\u0006\u0003\u0010Dr\u001a\u001a\\|v [@\u0001!!`\u001e\bP C\"\u000f\u0006\u0000\u0010\u001fv\u0007\u0015[\u007fB}\u000b@;";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fy_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == 'z' || c == 'R' || c == 'N') {
                field = fy_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fy_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/fy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @bP
    public void a(bo_0 bo_02) {
        float f;
        float f10;
        CallSite callSite;
        float f11;
        Matrix4f matrix4f;
        long l;
        long l2;
        long l3;
        long l4;
        block31: {
            CallSite callSite2;
            float f12;
            float f13;
            block32: {
                CallSite callSite3;
                float f14;
                CallSite callSite4;
                long l5;
                long l6;
                block30: {
                    int n;
                    block28: {
                        block29: {
                            Object object;
                            boolean bl;
                            ah_0 ah_02;
                            CallSite callSite5;
                            long l7;
                            long l8;
                            long l9;
                            long l10;
                            long l11;
                            block27: {
                                block26: {
                                    Object object2;
                                    long l12;
                                    block25: {
                                        block24: {
                                            block23: {
                                                long l13 = l4 = k ^ 0x1BBC9F47DL;
                                                l11 = l13 ^ 0x5473D1174AE2L;
                                                l10 = l13 ^ 0x60AB3CAD1451L;
                                                l6 = l13 ^ 0x20B3CEFFFA29L;
                                                l9 = l13 ^ 0xE7120AC7792L;
                                                l3 = l13 ^ 0x418FFE0A12C6L;
                                                l5 = l13 ^ 0x5A3D1593FE3L;
                                                l8 = l13 ^ 0x2EA8DDDBB0F3L;
                                                l7 = l13 ^ 0x5DBDD5D3C91DL;
                                                l2 = l13 ^ 0x2F3B19FAD3B1L;
                                                l = l13 ^ 0xF140692D010L;
                                                l12 = l13 ^ 0x214D7B3798E8L;
                                                long l14 = l13 ^ 0x15BF5544E4AEL;
                                                callSite4 = fy_0.d("D", (long)2809224928874590175L, (long)l4);
                                                try {
                                                    try {
                                                        Object[] objectArray = new Object[2];
                                                        objectArray[1] = l14;
                                                        objectArray[0] = fy_0.d("R", (long)2809796455332769478L, (long)l4);
                                                        object2 = fy_0.d("D", (Object)objectArray, (long)2801938946655765862L, (long)l4);
                                                        if (callSite4 != null) break block23;
                                                        if (object2 == false) break block24;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                                                    }
                                                    object2 = fy_0.d("\u00d6", (Object)fy_0.d("E", (Object)b, (long)2809310114015082031L, (long)l4), (long)2809928775569634238L, (long)l4);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                                                }
                                            }
                                            try {
                                                if (callSite4 != null) break block25;
                                                if (object2 == false) break block24;
                                            }
                                            catch (MatchException matchException) {
                                                throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                                            }
                                            object2 = true;
                                            break block25;
                                        }
                                        object2 = false;
                                    }
                                    Object object3 = object2;
                                    try {
                                        if (object3 == false) break block26;
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l12;
                                        callSite5 = fy_0.d("D", (Object)objectArray, (long)2802100175549857437L, (long)l4);
                                        break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                                    }
                                }
                                callSite5 = null;
                            }
                            CallSite callSite6 = callSite5;
                            try {
                                ah_02 = this.d;
                                bl = callSite6 != null;
                            }
                            catch (MatchException matchException) {
                                throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l11;
                            objectArray[0] = bl;
                            fy_0.d("\u00d6", (Object)ah_02, (Object)objectArray, (long)2801704679351910263L, (long)l4);
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l10;
                            CallSite callSite7 = fy_0.d("\u00d6", (Object)this.d, (Object)objectArray2, (long)2801747047903806973L, (long)l4);
                            try {
                                if (callSite7 <= 0.01f) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                            }
                            CallSite callSite8 = fy_0.d("\u00d6", (Object)fy_0.d("E", (Object)b, (long)2809310114015082031L, (long)l4), (long)2809411536577095044L, (long)l4);
                            CallSite callSite9 = fy_0.d("\u00d6", (Object)callSite8, (Object)fy_0.d("D", (Object)fy_0.d("E", (Object)b, (long)2809310114015082031L, (long)l4), (long)2802311355686564144L, (long)l4), (long)2809622739848432039L, (long)l4);
                            CallSite callSite10 = fy_0.d("\u00d6", (Object)fy_0.d("E", (Object)b, (long)2809310114015082031L, (long)l4), (Object)fy_0.d("R", (long)2809728895454008652L, (long)l4), (long)2809354790183607540L, (long)l4);
                            try {
                                object = callSite6 == null ? 0.0 : (Object)fy_0.d("\u00d6", (Object)callSite8, (Object)fy_0.d("D", (Object)callSite6, (long)2802311355686564144L, (long)l4), (long)2809622739848432039L, (long)l4);
                            }
                            catch (MatchException matchException) {
                                throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                            }
                            double d = object;
                            CallSite callSite11 = fy_0.d("D", (double)0.0, (double)(callSite9 - d), (long)2801613501744247085L, (long)l4);
                            float f15 = (float)callSite10 + (float)fy_0.d("D", (double)(callSite11 / 2.0), (long)2801518416761920983L, (long)l4);
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l8;
                            Object[] objectArray4 = new Object[4];
                            objectArray4[3] = l7;
                            objectArray4[2] = Float.valueOf((float)(fy_0.d("D", (Object)objectArray3, (long)2801352912532978220L, (long)l4) / 5.0f));
                            objectArray4[1] = Float.valueOf(f15);
                            objectArray4[0] = Float.valueOf(this.e);
                            this.e = (float)fy_0.d("D", (Object)objectArray4, (long)2802196565280096856L, (long)l4);
                            matrix4f = new Matrix4f();
                            f13 = 64.0f;
                            f14 = 20.0f;
                            f12 = (float)fy_0.d("\u00d6", (Object)fy_0.d("\u00d6", (Object)b, (long)2809158113729083640L, (long)l4), (long)2809585013116998227L, (long)l4) / 2.0f - f13 / 2.0f;
                            f11 = (float)fy_0.d("\u00d6", (Object)fy_0.d("\u00d6", (Object)b, (long)2809158113729083640L, (long)l4), (long)2810194182892856644L, (long)l4) / 2.0f + 30.0f;
                            try {
                                try {
                                    fy_0.d("\u00d6", (Object)matrix4f, (float)(f12 + f13 / 2.0f), (float)(f11 + f14 / 2.0f), (float)0.0f, (long)2801293510195559125L, (long)l4);
                                    fy_0.d("\u00d6", (Object)matrix4f, (float)callSite7, (float)callSite7, (float)callSite7, (long)2801525479022106337L, (long)l4);
                                    fy_0.d("\u00d6", (Object)matrix4f, (float)(-f12 - f13 / 2.0f), (float)(-f11 - f14 / 2.0f), (float)0.0f, (long)2801293510195559125L, (long)l4);
                                    Object[] objectArray5 = new Object[10];
                                    objectArray5[9] = l9;
                                    objectArray5[8] = Float.valueOf(5.0f);
                                    objectArray5[7] = 5;
                                    objectArray5[6] = Float.valueOf(f14);
                                    objectArray5[5] = Float.valueOf(f13);
                                    objectArray5[4] = Float.valueOf(f11);
                                    objectArray5[3] = Float.valueOf(f12);
                                    objectArray5[2] = matrix4f;
                                    objectArray5[1] = bo_02.b;
                                    objectArray5[0] = bo_02.a;
                                    fy_0.d("D", (Object)objectArray5, (long)2802048217023975153L, (long)l4);
                                    Object[] objectArray6 = new Object[10];
                                    objectArray6[9] = l6;
                                    objectArray6[8] = Float.valueOf(5.0f);
                                    objectArray6[7] = new Color((int)fy_0.c("s", (int)27486, (long)(0x5BDBDD915E495F2FL ^ l4)), (int)fy_0.c("s", (int)22855, (long)(0x666FF003BD37ED32L ^ l4)), (int)fy_0.c("s", (int)22855, (long)(0x666FF003BD37ED32L ^ l4)), (int)fy_0.c("s", (int)29301, (long)(0x3DD5B6A4D10BC607L ^ l4)));
                                    objectArray6[6] = Float.valueOf(f14);
                                    objectArray6[5] = Float.valueOf(f13);
                                    objectArray6[4] = Float.valueOf(f11);
                                    objectArray6[3] = Float.valueOf(f12);
                                    objectArray6[2] = matrix4f;
                                    objectArray6[1] = bo_02.b;
                                    objectArray6[0] = bo_02.a;
                                    fy_0.d("D", (Object)objectArray6, (long)2801994651031907662L, (long)l4);
                                    float f16 = this.e - 20.0f;
                                    n = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                    if (callSite4 != null) break block28;
                                    if (n < 0) break block29;
                                }
                                catch (MatchException matchException) {
                                    throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                                }
                                callSite3 = fy_0.b("z", (int)6372, (long)(0x33C6692160A68A25L ^ l4));
                                break block30;
                            }
                            catch (MatchException matchException) {
                                throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                            }
                        }
                        n = (int)this.e;
                    }
                    callSite3 = (String)((Object)fy_0.b("z", (int)28605, (long)(0x7529144341227D7DL ^ l4))) + n + (String)((Object)fy_0.b("z", (int)11764, (long)(0x533F34DC94983F36L ^ l4)));
                }
                callSite = callSite3;
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = l5;
                objectArray7[0] = callSite;
                callSite2 = fy_0.d("\u00d6", (Object)fy_0.d("\u00d6", (Object)fy_0.d("R", (long)2810087368351215881L, (long)l4), (Object)objectArray, (long)2801425008870225556L, (long)l4), (Object)objectArray7, (long)2801865871003294075L, (long)l4);
                float f17 = 7.0f;
                CallSite callSite12 = fy_0.d("D", (float)(this.e / 20.0f), (float)0.0f, (float)1.0f, (long)2809827503174511366L, (long)l4);
                float f18 = f12 + f17;
                float f19 = f11 + f14 - 4.0f - 3.0f;
                float f20 = f13 - f17 * 2.0f;
                float f21 = f20 * callSite12;
                Color color = new Color(0, 0, 0, (int)fy_0.c("s", (int)11569, (long)(0x1063E836504C9941L ^ l4)));
                Color color2 = new Color((int)((1.0f - callSite12) * 255.0f), (int)(callSite12 * 255.0f), 0, (int)fy_0.c("s", (int)22925, (long)(0x323369725BCEEDFEL ^ l4)));
                try {
                    try {
                        Object[] objectArray8 = new Object[10];
                        objectArray8[9] = l6;
                        objectArray8[8] = Float.valueOf(2.0f);
                        objectArray8[7] = color;
                        objectArray8[6] = Float.valueOf(4.0f);
                        objectArray8[5] = Float.valueOf(f20);
                        objectArray8[4] = Float.valueOf(f19);
                        objectArray8[3] = Float.valueOf(f18);
                        objectArray8[2] = matrix4f;
                        objectArray8[1] = bo_02.b;
                        objectArray8[0] = bo_02.a;
                        fy_0.d("D", (Object)objectArray8, (long)2801994651031907662L, (long)l4);
                        f10 = f21;
                        f = 0.0f;
                        if (callSite4 != null) break block31;
                        if (!(f10 > f)) break block32;
                    }
                    catch (MatchException matchException) {
                        throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                    }
                    Object[] objectArray9 = new Object[10];
                    objectArray9[9] = l6;
                    objectArray9[8] = Float.valueOf(2.0f);
                    objectArray9[7] = color2;
                    objectArray9[6] = Float.valueOf(4.0f);
                    objectArray9[5] = Float.valueOf(f21);
                    objectArray9[4] = Float.valueOf(f19);
                    objectArray9[3] = Float.valueOf(f18);
                    objectArray9[2] = matrix4f;
                    objectArray9[1] = bo_02.b;
                    objectArray9[0] = bo_02.a;
                    fy_0.d("D", (Object)objectArray9, (long)2801994651031907662L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw fy_0.d("D", (Object)matchException, (long)2810033040375214272L, (long)l4);
                }
            }
            f10 = f12;
            f = (f13 - callSite2) / 2.0f;
        }
        float f22 = f10 + f;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l3;
        Object[] objectArray11 = new Object[6];
        objectArray11[5] = l;
        objectArray11[4] = fy_0.d("D", (Object)objectArray10, (long)2809472985379781658L, (long)l4);
        objectArray11[3] = Float.valueOf(f11 + 3.0f);
        objectArray11[2] = Float.valueOf(f22);
        objectArray11[1] = callSite;
        objectArray11[0] = matrix4f;
        fy_0.d("\u00d6", (Object)fy_0.d("\u00d6", (Object)fy_0.d("R", (long)2810087368351215881L, (long)l4), (Object)objectArray, (long)2801425008870225556L, (long)l4), (Object)objectArray11, (long)2810109008155231798L, (long)l4);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fy_0.d("D", (Object)((Object)q_0.Spear), (long)-2444414925323168064L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 24;
            case 1 -> 59;
            case 2 -> 36;
            case 3 -> 1;
            case 4 -> 3;
            case 5 -> 15;
            case 6 -> 51;
            case 7 -> 50;
            case 8 -> 41;
            case 9 -> 34;
            case 10 -> 45;
            case 11 -> 40;
            case 12 -> 30;
            case 13 -> 57;
            case 14 -> 13;
            case 15 -> 0;
            case 16 -> 9;
            case 17 -> 52;
            case 18 -> 17;
            case 19 -> 38;
            case 20 -> 21;
            case 21 -> 27;
            case 22 -> 26;
            case 23 -> 6;
            case 24 -> 28;
            case 25 -> 20;
            case 26 -> 29;
            case 27 -> 32;
            case 28 -> 53;
            case 29 -> 11;
            case 30 -> 25;
            case 31 -> 16;
            case 32 -> 7;
            case 33 -> 42;
            case 34 -> 44;
            case 35 -> 55;
            case 36 -> 54;
            case 37 -> 39;
            case 38 -> 58;
            case 39 -> 19;
            case 40 -> 12;
            case 41 -> 22;
            case 42 -> 8;
            case 43 -> 2;
            case 44 -> 14;
            case 45 -> 46;
            case 46 -> 10;
            case 47 -> 49;
            case 48 -> 5;
            case 49 -> 63;
            case 50 -> 62;
            case 51 -> 61;
            case 52 -> 47;
            case 53 -> 35;
            case 54 -> 33;
            case 55 -> 60;
            case 56 -> 23;
            case 57 -> 37;
            case 58 -> 43;
            case 59 -> 31;
            case 60 -> 4;
            case 61 -> 18;
            case 62 -> 48;
            default -> 56;
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
        fy_0.s[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fy_0.m(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = s[n];
            int n2 = string.indexOf(8);
            Class clazz = fy_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fy_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fy_0.g(clazz3, string2, clazz2)) != null) {
                    fy_0.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fy_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fy_0.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fy_0.n(124103871016254L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fy_0.m(l, l2);
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
                clazz3 = fy_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fy_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fy_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fy_0.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fy_0.n(124103871016254L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fy_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fy_0.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fy_0.n(124103871016254L, 0L);
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
            return MethodHandles.lookup().findStatic(fy_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fy_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fy_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


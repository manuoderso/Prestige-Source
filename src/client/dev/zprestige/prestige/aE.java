/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

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
public class aE {
    protected float a;
    protected float b;
    protected float c;
    protected float d;
    protected String e;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    public aE(float f, float f10, float f11, float f12, String string) {
        this.a = f;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        aE.f = hc.a(-5171612911232331142L, 1962624761687099670L, MethodHandles.lookup().lookupClass()).a(188598317030427L);
                        aE.m = new Object[56];
                        aE.n = new String[56];
                        aE.a();
                        aE.i = new HashMap<K, V>(13);
                        var11 = aE.f ^ 8484559953754L;
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
                        var20_3 = new String[11];
                        var18_4 = 0;
                        var17_5 = "\u0089\u008d\u00e5jiF\u00c1l%\u00b1\u008d\u008a\u0089A\u00b42\u0018f\u0094\u0088/\u0094\u00bak\u00ddc<\u00c8\u00c9j\u00b3@\u00e9\u00b5g`&\u0015\u00bd9\u0099\u0010\u001b\u0016_\u008ce\u00b0\u0084\u00df\u0007\u00dd\u0014\u001d\u00b1s\u00ca!\u0010\u00edz\u009d\u0014\u000bf\u00f5\u00f0\u00f6\u0094-XM\u0019N\u008c\u0018\u00d40\u00e6\u009a b\u0092\"\u00fb\u001dg\u008dowd\u0010\u0014\bc}\u00ae4\u0092\u00af\u0010m\u00e05\u0006\u008b\u00c5\u009bQA\u00b1,\u0000 Br[\u0010\u00d0\u00f9\u0014 \u00f8\u00125PT\u00fd\u00d9O\u0019\u00fa\u00f1\u00fb\u0010\u0014c\u0011\b\u00e6\u00d6\u00d4\u0091us\u008f\u0093\u0096\u0080\u00b2\u00a5\u0010T\u00da8,\u00e4\u00e3X\u00feq\r\u0082l\u00a7\u00fa`f";
                        var19_6 = "\u0089\u008d\u00e5jiF\u00c1l%\u00b1\u008d\u008a\u0089A\u00b42\u0018f\u0094\u0088/\u0094\u00bak\u00ddc<\u00c8\u00c9j\u00b3@\u00e9\u00b5g`&\u0015\u00bd9\u0099\u0010\u001b\u0016_\u008ce\u00b0\u0084\u00df\u0007\u00dd\u0014\u001d\u00b1s\u00ca!\u0010\u00edz\u009d\u0014\u000bf\u00f5\u00f0\u00f6\u0094-XM\u0019N\u008c\u0018\u00d40\u00e6\u009a b\u0092\"\u00fb\u001dg\u008dowd\u0010\u0014\bc}\u00ae4\u0092\u00af\u0010m\u00e05\u0006\u008b\u00c5\u009bQA\u00b1,\u0000 Br[\u0010\u00d0\u00f9\u0014 \u00f8\u00125PT\u00fd\u00d9O\u0019\u00fa\u00f1\u00fb\u0010\u0014c\u0011\b\u00e6\u00d6\u00d4\u0091us\u008f\u0093\u0096\u0080\u00b2\u00a5\u0010T\u00da8,\u00e4\u00e3X\u00feq\r\u0082l\u00a7\u00fa`f".length();
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
                            var20_3[var18_4++] = aE.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0080\u000bh94X\u00cb\u00b4\u000f\u00dbi\u0087\u0084\u001d?c\u0010\u0089\u008b\u00ef_k\u0016`\u00f3\"\u00c5e!\u00dd\u007f\u00bc\u00ce";
                            var19_6 = "\u0080\u000bh94X\u00cb\u00b4\u000f\u00dbi\u0087\u0084\u001d?c\u0010\u0089\u008b\u00ef_k\u0016`\u00f3\"\u00c5e!\u00dd\u007f\u00bc\u00ce".length();
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
                            var20_3[var18_4++] = aE.a(var21_9).intern();
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
                aE.g = var20_3;
                aE.h = new String[11];
                aE.l = new HashMap<K, V>(13);
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
                var6_12 = new long[13];
                var3_13 = 0;
                var4_14 = "Rwz\u00a0\u00a5\u0004\u008c\u0092\u008b\u00d3\u008eH1\u00c0\u00a3\u00b2L\u00cf\u00a7\u0014\u00db\u00f7;\u000e\u00b0#1\u00d2\u0014HJ\u00e3\u00b2\u00d1>\u00ab6\u001c\u0082\u00cc\u00cc\u00d7[\u00ef\u0086k\u008b\u0018\u00c6&\u00ca\\\u00ed\u0085'JDH\u0088\u00b5\u00a9\u00f9\u00c1\u00af\u0001\u0096\u0013\u00c7*6\"\u00cfo\u0094%\u008aq>\u00a4\u00dc\u00b7q\u00c3\u00f2\u00cc@]\u00a2";
                var5_15 = "Rwz\u00a0\u00a5\u0004\u008c\u0092\u008b\u00d3\u008eH1\u00c0\u00a3\u00b2L\u00cf\u00a7\u0014\u00db\u00f7;\u000e\u00b0#1\u00d2\u0014HJ\u00e3\u00b2\u00d1>\u00ab6\u001c\u0082\u00cc\u00cc\u00d7[\u00ef\u0086k\u008b\u0018\u00c6&\u00ca\\\u00ed\u0085'JDH\u0088\u00b5\u00a9\u00f9\u00c1\u00af\u0001\u0096\u0013\u00c7*6\"\u00cfo\u0094%\u008aq>\u00a4\u00dc\u00b7q\u00c3\u00f2\u00cc@]\u00a2".length();
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
                    var4_14 = "I\u00abrHn\nP\\\u008c\u009b(\u0094\u0085\u0093\u009f\u00f4";
                    var5_15 = "I\u00abrHn\nP\\\u008c\u009b(\u0094\u0085\u0093\u009f\u00f4".length();
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
        aE.j = var6_12;
        aE.k = new Integer[13];
    }

    public static float e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x7C16A44A5E9FL;
        long l4 = l2 ^ 0x3ACC2FB41E28L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        return (float)aE.c("k", (Object)aE.c("k", (Object)aE.c("\u00f3", (long)-6064958863782924910L, (long)l), (Object)objectArray2, (long)-6064858829780445707L, (long)l), (Object)objectArray3, (long)-6064689554867180252L, (long)l);
    }

    public void e(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        int n = (Integer)objectArray[2];
    }

    public float i(Object[] objectArray) {
        return this.d;
    }

    public void i(Object[] objectArray) {
        this.e = null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = aE.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aE.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public String b(Object[] objectArray) {
        return this.e;
    }

    public static Color b(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = aE.f ^ l;
        return new Color((float)aE.c("k", (Object)color, (long)-5072754451989874430L, (long)l) / 255.0f, (float)aE.c("k", (Object)color, (long)-5072991154243450222L, (long)l) / 255.0f, (float)aE.c("k", (Object)color, (long)-5071770978033639295L, (long)l) / 255.0f, (float)aE.c("\u00ff", (float)f, (float)0.0f, (float)1.0f, (long)-5072459355699183078L, (long)l));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aE.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aE.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26EE;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])aE.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    aE.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/aE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            aE.k[n2] = n3;
        }
        return k[n2];
    }

    public static float b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = aE.f ^ l) ^ 0x4B24CD7518D5L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(1.0f);
        objectArray2[1] = Float.valueOf(0.0f);
        objectArray2[0] = Float.valueOf(f11);
        f -= (f - f10) * aE.c("\u00ff", (Object)objectArray2, (long)-3868842218518730067L, (long)l);
        return f;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = aE.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void b(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = aE.f ^ l;
        long l3 = l2 ^ 0x8B40B1B6BD5L;
        long l4 = l2 ^ 0x7F2F05915F87L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l4;
        objectArray3[4] = color;
        objectArray3[3] = Float.valueOf(0.8f);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = string;
        aE.c("k", (Object)aE.c("k", (Object)aE.c("\u00f3", (long)-7017025283625740072L, (long)l), (Object)objectArray2, (long)-7016819719447863105L, (long)l), (Object)objectArray3, (long)-7018392471371705494L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = aE.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                aE.m[n] = clazz = Class.forName(aE.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = aE.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = aE.n[n];
            int n2 = string.indexOf(8);
            Class clazz = aE.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aE.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aE.a(clazz3, string2, clazz2)) != null) {
                    aE.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aE.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aE.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aE.b(701419000821281L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void c(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = aE.f ^ l;
        long l3 = l2 ^ 0x5B5A786DE60EL;
        long l4 = l2 ^ 0x2CC176E7D25CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l4;
        objectArray3[4] = color;
        objectArray3[3] = Float.valueOf(0.9f);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = string;
        aE.c("k", (Object)aE.c("k", (Object)aE.c("\u00f3", (long)1388752733732541699L, (long)l), (Object)objectArray2, (long)1388353650793655652L, (long)l), (Object)objectArray3, (long)1387947428101725873L, (long)l);
    }

    public static Color c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = aE.f ^ l;
        return new Color(f, f, f, (float)aE.c("\u00ff", (float)f10, (float)0.0f, (float)1.0f, (long)8867380143184822414L, (long)l));
    }

    public static float c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = aE.f ^ l;
        try {
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw aE.c("\u00ff", (Object)illegalArgumentException, (long)7758148828658623955L, (long)l);
        }
        CallSite callSite = aE.c("\u00ff", (double)f, (long)7755413042540696322L, (long)l);
        callSite = aE.c("k", (Object)callSite, (int)n, (Object)aE.c("\u00f3", (long)7758293561872191361L, (long)l), (long)7758054148765192235L, (long)l);
        return (float)aE.c("k", (Object)callSite, (long)7759077263184693685L, (long)l);
    }

    public void n(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.e = string;
    }

    public float h(Object[] objectArray) {
        return this.c;
    }

    public void h(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
    }

    public void f(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        int n = (Integer)objectArray[2];
    }

    public float f(Object[] objectArray) {
        return this.a;
    }

    public void l(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.c = f;
    }

    public static Color d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        return (Color)((Object)aE.c("k", (Object)aE.c("k", (Object)aE.c("k", (Object)aE.c("\u00f3", (long)1267005376331935071L, (long)l), (Object)new Object[0], (long)1265755230732591280L, (long)l), (Object)new Object[0], (long)1267221077378031157L, (long)l), (long)1265666528421093625L, (long)l));
    }

    public void d(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
    }

    private static Method d(long l, long l2) {
        int n = aE.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = aE.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = aE.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aE.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aE.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        aE.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aE.b(701419000821281L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aE.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aE.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aE.b(701419000821281L, 0L);
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

    public static float d(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x2B10153AD631L;
        long l4 = l2 ^ 0x188DD993A63L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = string;
        return (float)aE.c("k", (Object)aE.c("k", (Object)aE.c("\u00f3", (long)-3519407448520668818L, (long)l), (Object)objectArray2, (long)-3519221605071261431L, (long)l), (Object)objectArray3, (long)-3517806234365183535L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aE.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static float a(Object[] objectArray) {
        float f;
        float f10;
        long l;
        block4: {
            float f11;
            float f12;
            block5: {
                f12 = ((Float)objectArray[0]).floatValue();
                float f13 = ((Float)objectArray[1]).floatValue();
                f11 = ((Float)objectArray[2]).floatValue();
                l = (Long)objectArray[3];
                l = aE.f ^ l;
                CallSite callSite = aE.c("\u00ff", (long)-634804123222911569L, (long)l);
                try {
                    try {
                        f10 = f12;
                        f = f13;
                        if (callSite != null) break block4;
                        if (!(f10 < f)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw aE.c("\u00ff", (Object)illegalArgumentException, (long)-633468351413880500L, (long)l);
                    }
                    return f13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw aE.c("\u00ff", (Object)illegalArgumentException, (long)-633468351413880500L, (long)l);
                }
            }
            f10 = f12;
            f = f11;
        }
        return (float)aE.c("\u00ff", (float)f10, (float)f, (long)-634084588281075796L, (long)l);
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "QW5'/_ZB+hC[\\r&%h_ZZ";
        objectArray[1] = Double.TYPE;
        aE.n[1] = "java/lang/Double";
        objectArray[2] = Integer.TYPE;
        aE.n[2] = "java/lang/Integer";
        objectArray[3] = "\u0012\u0014\u0015F\u0014d\u0019\u0001\u000b\thf\r\u001b\u0007NTn5\u001a\u0007B";
        objectArray[4] = "\u0005A$|}\f\u0013A!&n\u001b\u0004\n\" b\u000f\u0015M57)\u001d$";
        objectArray[5] = "\u001e\u0012\u000eu4\u0015\u0015\u001d\u001f:S\u0015\u0018\u0016\u001fuv8\u0006\u0014\ry\u007f\u0017\u00006\u0000w\u007f\t\u0000\u001a\u0017z";
        objectArray[6] = Float.TYPE;
        aE.n[6] = "java/lang/Float";
        objectArray[7] = "4C,JxO?L=\u0005\u001fM*G=N$";
        objectArray[8] = "e+fos\u0015{#| \u0010\u0001\u007f";
        objectArray[9] = "o$\r.\u001a\u0005d+\u001ca{\u000bo \u0018;";
        objectArray[10] = "\u0000U9\u0007B\u0019\u001d@a%\u0003\u0014\u0005F";
        objectArray[11] = "Sq\u001fo-\u0006Sq\b3!\tI:\b-!\u001cNKXts]";
        objectArray[12] = "\u007f#g+\u001b\u0015i#bq\b\u0002~haw\u0004\u0016o/v`O\u0004S";
        objectArray[13] = "6\u001e\u0005\u001b?xC>\u000e\u0014.7>&\u001d\u0013'~V";
        objectArray[14] = "\u0012'5kFn\u0019($$%c\f.";
        objectArray[15] = ". 06'a8 5l4v/k6j8b>,!}sr\u000b";
        objectArray[16] = "u\u0018\u007f(?)\u00008t'.fa6\u007f,*<\u0015";
        objectArray[17] = "{iU10cmiPk#tz\"Sm/`keDzdpseFq>=O~Fl>zxi";
        objectArray[18] = "S:\"[WSE:'\u0001DDRq$\u0007HPC63\u0010\u0003@t";
        objectArray[19] = "Vq./\fA#Q% \u001d\u000eB_.+\u0019T6";
        objectArray[20] = "\u0004J&+4qqj-$%>\u0010d&/!dd";
        objectArray[21] = Void.TYPE;
        aE.n[21] = "java/lang/Void";
        objectArray[22] = "\f\u001750K=\u001a\u00170jX*\r\\3lT>\u001c\u001b${\u001f.\"";
        objectArray[23] = "ll\u000b#\u0001p\u0019L\u0000,\u0010?xB\u000b'\u0014e\f";
        objectArray[24] = "]4\fn#\u001bK4\t40\f\\\u007f\n2<\u0018M8\u001d%w\u000ef";
        objectArray[25] = "]Rv7\u0011i(r}8\u0000&I|v3\u0004|=";
        objectArray[26] = "+7a]N\b=7d\u0007]\u001f*|g\u0001Q\u000b;;p\u0016\u001a\u001c\u0001";
        objectArray[27] = "h!?U;\f~!:\u000f(\u001bij9\t$\u000fx-.\u001eo\u0018G";
        objectArray[28] = "\n\u000bd~[V\u007f+oqJ\u0019\u001e%dzNCj";
        objectArray[29] = "C^\u0011f_e6~\u001aiN*Wp\u0011bJp#";
        objectArray[30] = "C\u00114\u000e(A61?\u00019\u000eW?4\n=T#";
        objectArray[31] = "FL!u\f\t\u0018\n|\u0010I\u0012C\u000ftWY{\\\bf*^\u0019C\u0014a\u0010VE\u001f\u0017\"b\b\u0003Br";
        objectArray[32] = "J \u001d(S.\u0019%\u0001p/#\u0018d5lB!\u0013\u0018C{Jq\tf\u0011xMwu";
        objectArray[33] = "\u0017<WIU7Eg^\u001e/1,a\u0007\u0017UaR}\u0005MIX\u0010\u007f\\\u001c\u0011&Vg^\u001b/";
        objectArray[34] = "E[\u001e53?\u0014IF>\u0003?u\u0017D4s'\u0016L\u0005f3U";
        objectArray[35] = "\\*\u0004\u000e\u0011\u001d\u000f/\u0018Vm\u0010\u000en9]\u0001\u007fZ\u007f\u0006\r\u0011\u0001\b|\u0001\u000bm";
        objectArray[36] = "\u0015?cw\u001a\u000f\u000e&46{Y\u007f,;%C[\u0005=1\"\u0000";
        objectArray[37] = "Kq,8\u0004AGts+x^\u001f/n6?Nvr~>E\\\b }9C Kq,8\u0004AGts+x";
        objectArray[38] = "i\u007f!Q\u0007l.\u007fj\u0011`u)~[\u0011\u001fh.l&]\u0002=4\u0002eP\u0005w:\u007f)MPmT<$J\u001ac)p9\u001f\u0000\r";
        objectArray[39] = "\u0000TduH\u001bGT/5/\u0015PU\u001e5P\u001fGGcyMJ]) tJ\u0000STli\u001f\u001a=";
        objectArray[40] = ">bM\u0001+gb1\u001f\u0007B3c&\u0015\\.\u00017gN\u0005yV2 \u0013R|(t8\u0011UBjt<\u001c\u0005<,l>\u001b;~,h3KE84j4u\u000780gd\u000bA 2`Z";
        objectArray[41] = "P\f/a\b\u0005\u0002\u0001\"lk\u000f?\u0015\"s\u0011\\A\t )\re^\tuaU\u001f\u0003\u0014\"!k";
        objectArray[42] = "\rV:o2)\u0016Om.Sxg@{7+z^Ll+6";
        objectArray[43] = "\u0018/GA\fwFi\u001a$Ya\u001ex\u0003z^a\u0004|\u007f\u0018Mc\u0010/\u0001^Ua\u0017\u0011";
        objectArray[44] = "M\u001d*M\b)A\n6Pay&\u0004sW\u001b)X\u0018q\r\u0007\u0010O\u00102E\u0018)\u001c\u0004\u007f\u000fa";
        objectArray[45] = "#bD_\u0011>/2GUa1+:>\b\u001b2#b@N\u00030$\\\u0002N\u0007=t\"DV\u0005:J`DR\bj4&\\P\u000fT";
        objectArray[46] = "q\f\u0007..}\"\u0018JdW/\u0018\u0018F<-}f\u0004Df1D$\u0006\u001d7i:b\u001e\u001f0W";
        objectArray[47] = "\u001d0\u0000u\u00045N$M?}vt$Ag\u00075\n8C=\u001b\f\u0019'\u0010z\r<Iy\u0007y}";
        objectArray[48] = "\u0011/zzE\u000bB;70<[x;;hF\u000b\u0006'92Z2D%`c\u0002L\u0002=bd<";
        objectArray[49] = "\u0001R){\u00008RW5#|5S\u0016\u0004!\u00017>S# A&@\u0001 'GZ";
        objectArray[50] = "z8QA\u0007Yk2V\u0002iJ\u00148\u0002\u001b\u0013\u001aj$\u0000A\u000f#{!\u000f\t\nC),\u0002\u0004i";
        objectArray[51] = "\u0018\u001a&E#>\u0006\ty]C/yZ`D9(\u0004\u0016}\u0011#F";
        objectArray[52] = "\u0019;i\u000fs/G}4j30\u0004^:\u0003,0x<<\u000fu!\u0006n?\bs]B5l\r9l\b\u007f+\u0003H<F=4Q:b\u0000`Q";
        objectArray[53] = "sB\u00071\u0003.!\u0019\u000efy(H@\u0018u@?xEU=\u0013As\t\u00124\u0007qvDZgy";
        objectArray[54] = "\n\u001a\f_\u0005fY\u000eA\u0015|$c\u000eMM\u0006f\u001d\u0012O\u0017\u001a_\u000e\r\u001cP\fo^S\u000bS|";
        Object[] objectArray2 = objectArray;
        objectArray[55] = "y%nPM+3o)^<T\u0007R\u0014m< s(4F\rj9o:";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = aE.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == 'i' || c == '\u00f3' || c == 'T') {
                field = aE.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aE.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'k' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static Color a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = f ^ l;
        return new Color((int)(aE.b("y", (int)15980, (long)(0x1D4BAD0C32DAC83AL ^ l)) + n), (int)(aE.b("y", (int)25523, (long)(0x3CF0ADAB64A095EBL ^ l)) + n), (int)(aE.b("y", (int)25523, (long)(0x3CF0ADAB64A095EBL ^ l)) + n));
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (aE.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 47;
            case 2 -> 45;
            case 3 -> 2;
            case 4 -> 55;
            case 5 -> 63;
            case 6 -> 52;
            case 7 -> 10;
            case 8 -> 53;
            case 9 -> 22;
            case 10 -> 38;
            case 11 -> 24;
            case 12 -> 25;
            case 13 -> 19;
            case 14 -> 6;
            case 15 -> 57;
            case 16 -> 4;
            case 17 -> 11;
            case 18 -> 14;
            case 19 -> 43;
            case 20 -> 54;
            case 21 -> 16;
            case 22 -> 37;
            case 23 -> 59;
            case 24 -> 3;
            case 25 -> 60;
            case 26 -> 51;
            case 27 -> 17;
            case 28 -> 34;
            case 29 -> 26;
            case 30 -> 62;
            case 31 -> 56;
            case 32 -> 58;
            case 33 -> 30;
            case 34 -> 31;
            case 35 -> 49;
            case 36 -> 41;
            case 37 -> 27;
            case 38 -> 46;
            case 39 -> 29;
            case 40 -> 39;
            case 41 -> 12;
            case 42 -> 1;
            case 43 -> 40;
            case 44 -> 8;
            case 45 -> 0;
            case 46 -> 7;
            case 47 -> 36;
            case 48 -> 48;
            case 49 -> 42;
            case 50 -> 20;
            case 51 -> 61;
            case 52 -> 18;
            case 53 -> 9;
            case 54 -> 35;
            case 55 -> 15;
            case 56 -> 33;
            case 57 -> 13;
            case 58 -> 21;
            case 59 -> 44;
            case 60 -> 5;
            case 61 -> 50;
            case 62 -> 23;
            default -> 28;
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
        aE.n[n3] = new String(cArray);
        return n3;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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

    public static void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = aE.f ^ l;
        long l3 = l2 ^ 0x2F775620CF2EL;
        long l4 = l2 ^ 0x4B40D121EE7CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l3;
        objectArray3[3] = color;
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = string;
        aE.c("k", (Object)aE.c("k", (Object)aE.c("\u00f3", (long)1961255354112613745L, (long)l), (Object)objectArray2, (long)1960891373143991574L, (long)l), (Object)objectArray3, (long)1960959557428618804L, (long)l);
    }

    public static String a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = f ^ l;
        HashMap hashMap = new HashMap();
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)2307, (long)(0x315673A1A3ECC91L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)20722, (long)(0x3ECDC6E3636143BFL ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)14405, (long)(0x46B0E219A0607DD5L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)28927, (long)(0xCDACE781BD563B9L ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)30135, (long)(0x343DB36D30233028L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)4067, (long)(0x64C09FF191D91CAFL ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)11967, (long)(0x4FC640DFE85DEB2EL ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)14056, (long)(0x744A118456EF25A0L ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)4272, (long)(0x23EB5F2002DDD52EL ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)25494, (long)(0x2477F880060470D3L ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)9048, (long)(0x42788E57A282E6CFL ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)10634, (long)(0x1026761893FABAC3L ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)5959, (long)(0x2A20164ED6EBD2D2L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)32211, (long)(0x3A2DCF7D00FEE98L ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)4653, (long)(0x1590D30B42DA57B1L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)25305, (long)(0x41CAE1B6234E7197L ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)1972, (long)(0x743E47D40409C229L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)2608, (long)(0x3FCBFD776294197AL ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)16585, (long)(0x1A365DB6629B055FL ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)797, (long)(0x1E700CA0E0E905AL ^ l)), (long)7165665585102447828L, (long)l);
        aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)aE.b("y", (int)31155, (long)(0x2B43FEADE52BC20L ^ l)), (long)7165600079925262104L, (long)l), (Object)aE.a("m", (int)21139, (long)(0x54A0E9FF0A4E41DCL ^ l)), (long)7165665585102447828L, (long)l);
        return (String)((Object)aE.c("k", hashMap, (Object)aE.c("\u00ff", (int)n, (long)7165600079925262104L, (long)l), (long)7165742244202347633L, (long)l));
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7037;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/aE", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            aE.h[n2] = aE.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    public void m(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.d = f;
    }

    public void k(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.b = f;
    }

    public void g(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
    }

    public float g(Object[] objectArray) {
        return this.b;
    }

    public void j(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.a = f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aE.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(aE.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(aE.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


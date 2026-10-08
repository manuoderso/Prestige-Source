/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.g2;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.gb
 */
public final class gb_0 {
    private static final long a;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    private gb_0(long l) {
        l = a ^ l;
        throw new UnsupportedOperationException(b);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    gb_0.a = hc.a(-3479176511829014574L, -110122153225578194L, MethodHandles.lookup().lookupClass()).a(249151096112883L);
                    gb_0.f = new Object[23];
                    gb_0.g = new String[23];
                    gb_0.a();
                    var11 = gb_0.a ^ 136648356580416L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl22:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("\u00e5\u00daCf\u009fMv;\u00f5\u00d6\u0016N^\u0002\u00ddwh]\u00c0;\u0099m\u00fa\u00a6\u00ef\u0006\u001e\u0000\u00d6Y\u0088\u00b1\u00017j\u0003{\u00db\"Y\u00ef7\u0096\u000em\u009c\u00fdc\u0084\u00b2\u00a0\u009e\u009cj\u00e4/".getBytes("ISO-8859-1"));
                ** while (true)
                gb_0.b = gb_0.a(var15_3).intern();
                gb_0.e = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[6];
                var3_7 = 0;
                var4_8 = "\u0092\u0012J\u00e0F\u00feU\u00ea\u00ed\u00b3\u008b\u0013\u00b8\u00e0\u00fbN\u00ee\u0087\u0011\u00b8\u009abkw9\u00ff\rq\u00e4F\u00ca\u0091";
                var5_9 = "\u0092\u0012J\u00e0F\u00feU\u00ea\u00ed\u00b3\u008b\u0013\u00b8\u00e0\u00fbN\u00ee\u0087\u0011\u00b8\u009abkw9\u00ff\rq\u00e4F\u00ca\u0091".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "\u0006x\u0087\u00fb9\u00ad\u00b0\u008d0\u008d\u0082\u0086\u00af\u0088\u0083\u0082";
                    var5_9 = "\u0006x\u0087\u00fb9\u00ad\u00b0\u008d0\u008d\u0082\u0086\u00af\u0088\u0083\u0082".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        gb_0.c = var6_6;
        gb_0.d = new Integer[6];
    }

    public static float e(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x26BE805D82D9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return (float)gb_0.b("i", (Object)new Object[]{(int)gb_0.b("i", (Object)objectArray2, (long)5255654005664228103L, (long)l)}, (long)5253958086497652473L, (long)l);
    }

    public static float b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x60CFB4A4DABL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return (float)gb_0.b("i", (Object)new Object[]{(int)gb_0.b("i", (Object)objectArray2, (long)4279548453104610989L, (long)l)}, (long)4279145097937534322L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gb_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                gb_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gb_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gb_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gb_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gb_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static int b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return n >> gb_0.a("o", (int)28421, (long)(0x5D6123740678792L ^ l)) & gb_0.a("o", (int)20947, (long)(0x3B1AA092D271B947L ^ l));
    }

    private static Field c(long l, long l2) {
        int n = gb_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = gb_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gb_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gb_0.a(clazz3, string2, clazz2)) != null) {
                    gb_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gb_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gb_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gb_0.b(813214676399594L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static int c(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return n >> gb_0.a("o", (int)1899, (long)(0x397949F3479ECD0EL ^ l)) & gb_0.a("o", (int)16414, (long)(0x7EFEEA0CC6700A7DL ^ l));
    }

    public static float c(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x35B3D5491BADL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return (float)gb_0.b("i", (Object)new Object[]{(int)gb_0.b("i", (Object)objectArray2, (long)-7801481572645689342L, (long)l)}, (long)-7801189142147426900L, (long)l);
    }

    private static float f(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        return (float)n / 255.0f;
    }

    private static Method d(long l, long l2) {
        int n = gb_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = gb_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gb_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gb_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gb_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gb_0.b(813214676399594L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gb_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gb_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gb_0.b(813214676399594L, 0L);
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

    public static int d(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return n & gb_0.a("o", (int)20947, (long)(0x3B1AE75A41B5FB66L ^ l));
    }

    public static float d(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x1AA353757686L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = n;
        return (float)gb_0.b("i", (Object)new Object[]{(int)gb_0.b("i", (Object)objectArray2, (long)-2566353169214870529L, (long)l)}, (long)-2566251520449619342L, (long)l);
    }

    public static Map a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return new g2((int)gb_0.a("o", (int)6762, (long)(0x4161016405A8EA3L ^ l)), 0.75f, true, n);
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

    public static float a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        l = a ^ l;
        return (float)gb_0.b("i", (float)(f * 4.0f), (long)3268745394965690128L, (long)l) * 0.25f;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == 'V' || c == '\u00dd' || c == 'F') {
                field = gb_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gb_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = gb_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7EF6;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gb_0.d[n2] = n3;
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gb_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static int a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        return n >>> gb_0.a("o", (int)25176, (long)(0x664FFD3AAA427415L ^ l));
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Vector4f a(Object[] objectArray) {
        Vector4f vector4f = (Vector4f)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x12E4A5A53847L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf((float)gb_0.b("\u00ee", (Object)vector4f, (long)823289010272312872L, (long)l));
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = Float.valueOf((float)gb_0.b("\u00ee", (Object)vector4f, (long)822816569149785655L, (long)l));
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l2;
        objectArray4[0] = Float.valueOf((float)gb_0.b("\u00ee", (Object)vector4f, (long)822608043315828126L, (long)l));
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l2;
        objectArray5[0] = Float.valueOf((float)gb_0.b("\u00ee", (Object)vector4f, (long)822891521994292833L, (long)l));
        return new Vector4f((float)gb_0.b("i", (Object)objectArray2, (long)823108932557637592L, (long)l), (float)gb_0.b("i", (Object)objectArray3, (long)823108932557637592L, (long)l), (float)gb_0.b("i", (Object)objectArray4, (long)823108932557637592L, (long)l), (float)gb_0.b("i", (Object)objectArray5, (long)823108932557637592L, (long)l));
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "K:O<\u0011,I$\u0006D\u001e P'Z&\u001d";
        objectArray[1] = Float.TYPE;
        gb_0.g[1] = "java/lang/Float";
        objectArray[2] = "\\\u0012]\u0013|\bJ\u0012XIo\u001f]Y[Oc\u000bL\u001eLX(\u001fZ";
        objectArray[3] = "TX4`)E!x?o8\n@v4d<P4";
        objectArray[4] = "t9.}\u0007\u000f\u0001\u0019%r\u0016@`\u0017.y\u0012\u001a\u0014";
        objectArray[5] = "e'~T@<\u0010\u0007u[Qsq\t~PU)\u0005";
        objectArray[6] = Integer.TYPE;
        gb_0.g[6] = "java/lang/Integer";
        objectArray[7] = ":Al4!9Oag;0v.ol04,Z";
        objectArray[8] = "bS\u00136j\u0017i\\\u0002y\t\u001a|Z";
        objectArray[9] = "_\u000f\u0017\u0012G{*/\u001c\u001dV4K!\u0017\u0016Rn?";
        objectArray[10] = ",O\ft\u0018IYo\u0007{\t\u00068a\fp\r\\L";
        objectArray[11] = "W\u007f_\u0011\u001bX\\pN^zVW{J\u0004";
        objectArray[12] = "b\u0001!\u0000W~'Dz\u0004nv[Dx\u0005RseDy\u000e\u0002\u001dg\u001bw\u0012\u0015 <\u001c Bn";
        objectArray[13] = " \u001bTV9Me^\u000fR\u0000G\u0019^\rS<@'^\fXl.g\u0006\u000eSd_\"\u0004\u0012)";
        objectArray[14] = "\u0002f^LD\u0017G#\u0005H}\u001a;#\u0007IA\u001a\u0005#\u0006B\u0011tE{\u0004I\u0019\u0005\u0000y\u00183";
        objectArray[15] = "\\^\u000ej\u0002t\u000bO\u0016T\u0000\u001d\u001fP\t.\u0014lZR\u0015";
        objectArray[16] = "n2[nr'9#CPqN-<\\*d?h>@";
        objectArray[17] = "~ywO0\u000f)hoq=f=wp\u000b&\u0017xul";
        objectArray[18] = "Q},|\u007f\u007f\u00148wxFvh8uyzrV8tr*\u001cTgzn=!\u000f`->F";
        objectArray[19] = "\u001d\u0011xc7GY\u0012z%\u0006PDQgp\u0006TDO{xw\u0011FS\u0001 fENW<{a\u0012\u001e,";
        objectArray[20] = "U=!\t\u0019\"\u0010xz\r (lxx\f\u001c/Rxy\u0007LAP'w\u001b[|\u000b  K ";
        objectArray[21] = "$\u0011'vg0s\u0000?HgYg\u001f 2q(\"\u001d<";
        Object[] objectArray2 = objectArray;
        objectArray[22] = "t'Jk)E1b\u0011o\u0010JMb\u0013n,Hsb\u0012e|&q=\u001cyk\u001b*:K)\u0010";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 7;
            case 2 -> 3;
            case 3 -> 14;
            case 4 -> 18;
            case 5 -> 45;
            case 6 -> 20;
            case 7 -> 43;
            case 8 -> 48;
            case 9 -> 39;
            case 10 -> 1;
            case 11 -> 27;
            case 12 -> 16;
            case 13 -> 9;
            case 14 -> 22;
            case 15 -> 36;
            case 16 -> 19;
            case 17 -> 11;
            case 18 -> 52;
            case 19 -> 33;
            case 20 -> 62;
            case 21 -> 32;
            case 22 -> 47;
            case 23 -> 28;
            case 24 -> 12;
            case 25 -> 60;
            case 26 -> 40;
            case 27 -> 17;
            case 28 -> 58;
            case 29 -> 24;
            case 30 -> 4;
            case 31 -> 44;
            case 32 -> 63;
            case 33 -> 15;
            case 34 -> 61;
            case 35 -> 26;
            case 36 -> 41;
            case 37 -> 56;
            case 38 -> 23;
            case 39 -> 21;
            case 40 -> 0;
            case 41 -> 51;
            case 42 -> 2;
            case 43 -> 25;
            case 44 -> 42;
            case 45 -> 13;
            case 46 -> 6;
            case 47 -> 46;
            case 48 -> 50;
            case 49 -> 37;
            case 50 -> 10;
            case 51 -> 55;
            case 52 -> 38;
            case 53 -> 8;
            case 54 -> 59;
            case 55 -> 30;
            case 56 -> 54;
            case 57 -> 34;
            case 58 -> 5;
            case 59 -> 53;
            case 60 -> 31;
            case 61 -> 49;
            case 62 -> 35;
            default -> 29;
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
        gb_0.g[n3] = new String(cArray);
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gb_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gb_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


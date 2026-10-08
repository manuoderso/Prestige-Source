/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1747
 *  net.minecraft.class_2338
 *  net.minecraft.class_2626
 *  net.minecraft.class_2637
 *  net.minecraft.class_2664
 *  net.minecraft.class_2680
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.c5;
import dev.zprestige.prestige.cz_0;
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
import net.minecraft.class_1747;
import net.minecraft.class_2338;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2664;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_310;

final class c6
implements cz_0 {
    private static final long a = hc.a(8392967357975190701L, -8725339297114841410L, MethodHandles.lookup().lookupClass()).a(36076902186406L);
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final long[] f;
    private static final Long[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    private c6() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[80];
        j = new String[80];
        c6.a();
        e = new HashMap(13);
        long l = a ^ 0x796992B5DDD1L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "@\u00f8\u0085\u0088\u00809\u00f5\u00a4\u00a8\u001d\u0095w\u0088s\\\u00b0\u009c\u00b5m\u00b8\u00b86B5";
        int n2 = "@\u00f8\u0085\u0088\u00809\u00f5\u00a4\u00a8\u001d\u0095w\u0088s\\\u00b0\u009c\u00b5m\u00b8\u00b86B5".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[3];
        h = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray5 = new byte[8];
        byte[] byArray6 = byArray5;
        byArray5[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray6 = byArray6;
            byArray6[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray6)), new IvParameterSpec(new byte[8]));
        long[] lArray2 = new long[2];
        int n5 = 0;
        String string2 = "B\u00f8\u0002\u00ecC\u0007\u009b\u00ebA\u00ca.\u00ec\u009eX!(";
        int n6 = "B\u00f8\u0002\u00ecC\u0007\u009b\u00ebA\u00ca.\u00ec\u009eX!(".length();
        int n7 = 0;
        do {
            byte[] byArray7 = string2.substring(n7, n7 += 8).getBytes("ISO-8859-1");
            int n8 = n5++;
            long l3 = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
            byte[] byArray8 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray2[n8] = ((long)byArray8[0] & 0xFFL) << 56 | ((long)byArray8[1] & 0xFFL) << 48 | ((long)byArray8[2] & 0xFFL) << 40 | ((long)byArray8[3] & 0xFFL) << 32 | ((long)byArray8[4] & 0xFFL) << 24 | ((long)byArray8[5] & 0xFFL) << 16 | ((long)byArray8[6] & 0xFFL) << 8 | (long)byArray8[7] & 0xFFL;
        } while (n7 < n6);
        f = lArray2;
        g = new Long[2];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 53;
            case 2 -> 24;
            case 3 -> 38;
            case 4 -> 6;
            case 5 -> 3;
            case 6 -> 47;
            case 7 -> 52;
            case 8 -> 50;
            case 9 -> 36;
            case 10 -> 23;
            case 11 -> 35;
            case 12 -> 25;
            case 13 -> 48;
            case 14 -> 58;
            case 15 -> 29;
            case 16 -> 21;
            case 17 -> 2;
            case 18 -> 37;
            case 19 -> 19;
            case 20 -> 51;
            case 21 -> 26;
            case 22 -> 16;
            case 23 -> 12;
            case 24 -> 22;
            case 25 -> 33;
            case 26 -> 34;
            case 27 -> 60;
            case 28 -> 8;
            case 29 -> 56;
            case 30 -> 57;
            case 31 -> 11;
            case 32 -> 55;
            case 33 -> 14;
            case 34 -> 40;
            case 35 -> 61;
            case 36 -> 44;
            case 37 -> 1;
            case 38 -> 62;
            case 39 -> 17;
            case 40 -> 5;
            case 41 -> 46;
            case 42 -> 45;
            case 43 -> 59;
            case 44 -> 4;
            case 45 -> 42;
            case 46 -> 10;
            case 47 -> 63;
            case 48 -> 13;
            case 49 -> 43;
            case 50 -> 54;
            case 51 -> 0;
            case 52 -> 30;
            case 53 -> 49;
            case 54 -> 27;
            case 55 -> 39;
            case 56 -> 20;
            case 57 -> 15;
            case 58 -> 31;
            case 59 -> 32;
            case 60 -> 18;
            case 61 -> 41;
            case 62 -> 7;
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
        c6.j[n3] = new String(cArray);
        return n3;
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = c6.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6812;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/c6", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            c6.g[n2] = l4;
        }
        return g[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = c6.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cd' || c == 'J' || c == 'D' || c == 't') {
                field = c6.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c6.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = c6.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = c6.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c6.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c6.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        c6.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c6.f(727083157279923L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c6.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c6.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c6.f(727083157279923L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = c6.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                c6.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c6.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c6.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = c6.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c6.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = c6.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55E8;
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
                throw new RuntimeException("dev/zprestige/prestige/c6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            c6.d[n2] = n3;
        }
        return d[n2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bh_0 bh_02) {
        CallSite callSite;
        long l;
        long l2;
        block29: {
            class_310 class_3102;
            class_2885 class_28852;
            CallSite callSite2;
            CallSite callSite3;
            block27: {
                block28: {
                    block26: {
                        CallSite callSite4;
                        block25: {
                            l2 = a ^ 0x38A12EE7D921L;
                            l = l2 ^ 0x88208C91355L;
                            callSite3 = c6.c("W", (Object)bh_02, (Object)new Object[0], (long)5594982369598175518L, (long)l2);
                            callSite2 = c6.c("L", (long)5602105612053544648L, (long)l2);
                            try {
                                try {
                                    callSite4 = callSite3;
                                    if (callSite2 != null) break block25;
                                    if (!(callSite4 instanceof class_2885)) return;
                                }
                                catch (MatchException matchException) {
                                    throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                                }
                                callSite4 = callSite3;
                            }
                            catch (MatchException matchException) {
                                throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                            }
                        }
                        class_28852 = (class_2885)callSite4;
                        try {
                            if (callSite2 != null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                        }
                        try {
                            try {
                                class_3102 = b;
                                if (callSite2 != null) break block26;
                                if (c6.c("\u00cd", (Object)class_3102, (long)5602399464527736086L, (long)l2) == null) return;
                            }
                            catch (MatchException matchException) {
                                throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                            }
                            class_3102 = b;
                        }
                        catch (MatchException matchException) {
                            throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite2 != null) break block27;
                            if (c6.c("\u00cd", (Object)class_3102, (long)5600320929259995274L, (long)l2) != null) break block28;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                        }
                    }
                    catch (MatchException matchException) {
                        throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                    }
                }
                class_3102 = b;
            }
            try {
                if (!(c6.c("W", (Object)c6.c("W", (Object)c6.c("\u00cd", (Object)class_3102, (long)5602399464527736086L, (long)l2), (Object)c6.c("W", (Object)class_28852, (long)5600648375236493447L, (long)l2), (long)5600496264131198798L, (long)l2), (long)5600645533874639676L, (long)l2) instanceof class_1747)) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
            }
            callSite3 = c6.c("W", (Object)class_28852, (long)5595668934826304482L, (long)l2);
            CallSite callSite5 = c6.c("W", (Object)callSite3, (long)5595452296726914178L, (long)l2);
            try {
                if (c6.c("W", (Object)c6.c("W", (Object)c6.c("\u00cd", (Object)b, (long)5600320929259995274L, (long)l2), (Object)callSite5, (long)5601112458791807644L, (long)l2), (long)5595610548738006646L, (long)l2) == c6.c("D", (long)5600760258096624546L, (long)l2)) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
            }
            callSite = c6.c("L", (long)5595322761017083814L, (long)l2);
            try {
                try {
                    c6.c("W", (Object)c5.h, (Object)c6.c("W", (Object)c6.c("W", (Object)callSite5, (Object)c6.c("W", (Object)callSite3, (long)5595516731530682081L, (long)l2), (long)5600234082189047179L, (long)l2), (long)5600906279757941231L, (long)l2), (Object)c6.c("L", (long)callSite, (long)5601346553356595466L, (long)l2), (long)5600402784996179035L, (long)l2);
                    if (callSite2 != null) return;
                    if (c6.c("W", (Object)c6.c("W", (Object)c6.c("\u00cd", (Object)b, (long)5600320929259995274L, (long)l2), (Object)callSite5, (long)5601112458791807644L, (long)l2), (long)5601041927390946185L, (long)l2) == false) break block29;
                }
                catch (MatchException matchException) {
                    throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
                }
                c6.c("W", (Object)c5.h, (Object)c6.c("W", (Object)callSite5, (long)5600906279757941231L, (long)l2), (Object)c6.c("L", (long)callSite, (long)5601346553356595466L, (long)l2), (long)5600402784996179035L, (long)l2);
            }
            catch (MatchException matchException) {
                throw c6.c("L", (Object)matchException, (long)5602312318029705305L, (long)l2);
            }
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = (long)callSite;
        c6.c("L", (Object)objectArray, (long)5595039774341903770L, (long)l2);
    }

    @bP
    public void a(bg_0 bg_02) {
        block22: {
            CallSite callSite;
            long l;
            long l2;
            block23: {
                boolean bl;
                CallSite callSite2;
                block26: {
                    CallSite callSite3;
                    block27: {
                        block20: {
                            block21: {
                                class_2626 class_26262;
                                long l3;
                                block24: {
                                    long l4 = l2 = a ^ 0x1628A25317F0L;
                                    l = l4 ^ 0x260B847DDD84L;
                                    l3 = l4 ^ 0x757CC9D634B7L;
                                    callSite = c6.c("L", (long)-8973498199358568073L, (long)l2);
                                    callSite2 = c6.c("W", (Object)bg_02, (Object)new Object[0], (long)-8973579586479944364L, (long)l2);
                                    callSite3 = c6.c("L", (long)-8975810573084610535L, (long)l2);
                                    try {
                                        bl = callSite2 instanceof class_2626;
                                        if (callSite3 != null) break block20;
                                        if (!bl) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                    }
                                    class_2626 class_26263 = (class_2626)callSite2;
                                    try {
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (callSite3 != null) break block22;
                                                                if (c6.c("W", (Object)class_26263, (long)-8974295229209321554L, (long)l2) == null) break block23;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                                            }
                                                            class_26262 = class_26263;
                                                            if (callSite3 != null) break block24;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                                        }
                                                        if (c6.c("W", (Object)c6.c("W", (Object)class_26262, (long)-8974295229209321554L, (long)l2), (long)-8973684692176214743L, (long)l2) != false) break block25;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                                    }
                                                    class_26262 = class_26263;
                                                    if (callSite3 != null) break block24;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                                }
                                                if (c6.c("W", (Object)c6.c("W", (Object)class_26262, (long)-8974295229209321554L, (long)l2), (long)-8973786555617259353L, (long)l2) != c6.c("D", (long)-8973999416715028660L, (long)l2)) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                            }
                                        }
                                        class_26262 = class_26263;
                                    }
                                    catch (MatchException matchException) {
                                        throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                                    }
                                }
                                Object[] objectArray = new Object[3];
                                objectArray[2] = l3;
                                objectArray[1] = (long)callSite;
                                objectArray[0] = c6.c("W", (Object)class_26262, (long)-8974536519938334767L, (long)l2);
                                c6.c("L", (Object)objectArray, (long)-8975723576438892204L, (long)l2);
                                if (callSite3 == null) break block23;
                            }
                            callSite2 = c6.c("W", (Object)bg_02, (Object)new Object[0], (long)-8973579586479944364L, (long)l2);
                            bl = callSite2 instanceof class_2637;
                        }
                        try {
                            if (callSite3 != null) break block26;
                            if (!bl) break block27;
                        }
                        catch (MatchException matchException) {
                            throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                        }
                        class_2637 class_26372 = (class_2637)callSite2;
                        c6.c("W", (Object)class_26372, (arg_0, arg_1) -> c6.lambda$onPacketReceive$0((long)callSite, arg_0, arg_1), (long)-8976181732865592114L, (long)l2);
                        if (callSite3 == null) break block23;
                    }
                    callSite2 = c6.c("W", (Object)bg_02, (Object)new Object[0], (long)-8973579586479944364L, (long)l2);
                    try {
                        if (callSite3 != null) break block22;
                        bl = callSite2 instanceof class_2664;
                    }
                    catch (MatchException matchException) {
                        throw c6.c("L", (Object)matchException, (long)-8976158016541786488L, (long)l2);
                    }
                }
                if (bl) {
                    class_2664 class_26642 = (class_2664)callSite2;
                    callSite2 = c6.c("W", (Object)class_26642, (long)-8974193211738818518L, (long)l2);
                    CallSite callSite4 = c6.c("\u00cd", (Object)callSite2, (long)-8973433648730098037L, (long)l2);
                    CallSite callSite5 = c6.c("\u00cd", (Object)callSite2, (long)-8976905212059750378L, (long)l2);
                    CallSite callSite6 = c6.c("\u00cd", (Object)callSite2, (long)-8977203523585821796L, (long)l2);
                    c6.c("W", (Object)c5.g, (Object)c6.c("L", (double)callSite4, (double)callSite5, (double)callSite6, (long)-8977863771960598965L, (long)l2), (Object)c6.c("L", (long)callSite, (long)-8977128114969018405L, (long)l2), (long)-8977488111236091254L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (long)callSite;
            c6.c("L", (Object)objectArray, (long)-8974339738225837237L, (long)l2);
        }
    }

    private static void a(Object[] objectArray) {
        block17: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block15: {
                CallSite callSite3;
                block16: {
                    block13: {
                        block14: {
                            l2 = (Long)objectArray[0];
                            l = (Long)objectArray[1];
                            l = a ^ l;
                            callSite3 = c6.c("L", (long)-3855428173806372600L, (long)l);
                            try {
                                try {
                                    callSite2 = c6.c("W", (Object)c5.f, (long)-3855199749014028875L, (long)l);
                                    callSite = c6.a("v", (int)21337, (long)(0x2AF4EC41C8CCCC5L ^ l));
                                    if (callSite3 != null) break block13;
                                    if (callSite2 <= callSite) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw c6.c("L", (Object)matchException, (long)-3855362201025759335L, (long)l);
                                }
                                c6.c("W", (Object)c6.c("W", (Object)c5.f, (long)-3862872117416379098L, (long)l), arg_0 -> c6.lambda$prune$1(l2, arg_0), (long)-3856426019870229351L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw c6.c("L", (Object)matchException, (long)-3855362201025759335L, (long)l);
                            }
                        }
                        callSite2 = c6.c("W", (Object)c5.g, (long)-3855199749014028875L, (long)l);
                        callSite = c6.a("v", (int)28785, (long)(0x5018ADE446B9EFECL ^ l));
                    }
                    try {
                        try {
                            if (callSite3 != null) break block15;
                            if (callSite2 <= callSite) break block16;
                        }
                        catch (MatchException matchException) {
                            throw c6.c("L", (Object)matchException, (long)-3855362201025759335L, (long)l);
                        }
                        c6.c("W", (Object)c6.c("W", (Object)c5.g, (long)-3862872117416379098L, (long)l), arg_0 -> c6.lambda$prune$2(l2, arg_0), (long)-3856426019870229351L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw c6.c("L", (Object)matchException, (long)-3855362201025759335L, (long)l);
                    }
                }
                try {
                    callSite2 = c6.c("W", (Object)c5.h, (long)-3855199749014028875L, (long)l);
                    if (callSite3 != null) break block17;
                    callSite = c6.a("v", (int)3271, (long)(0x22369197F1C91359L ^ l));
                }
                catch (MatchException matchException) {
                    throw c6.c("L", (Object)matchException, (long)-3855362201025759335L, (long)l);
                }
            }
            try {
                if (callSite2 > callSite) {
                    callSite2 = c6.c("W", (Object)c6.c("W", (Object)c5.h, (long)-3862872117416379098L, (long)l), arg_0 -> c6.lambda$prune$3(l2, arg_0), (long)-3856426019870229351L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw c6.c("L", (Object)matchException, (long)-3855362201025759335L, (long)l);
            }
        }
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\u001c8\u001c};q\n8\u0019'(f\u001ds\u001a!$r\f4\r6o`0";
        objectArray[1] = "\fE\\X\u000fOyeWW\u001e\u0000\u0004}DP\u0017Il";
        objectArray[2] = "hz78~%~z2bm2i11da&xv&s*6:";
        objectArray[3] = "\u0019G-\u0002\u000b\u0012\u0012H<Mh\u001f\u0007E3&]\u001d\u0016V/\nJ\u0010";
        objectArray[4] = "qDe(\\YoL\u007fg?Mk";
        objectArray[5] = Integer.TYPE;
        c6.j[5] = "java/lang/Integer";
        objectArray[6] = "|4\\P=~b<F\u001f@nb";
        objectArray[7] = ">\u0010_.\u0000y \u0018EaHy:\u0012]&Abz![*Je7\u0010]*";
        objectArray[8] = Boolean.TYPE;
        c6.j[8] = "java/lang/Boolean";
        objectArray[9] = "O I\u001fX/Q(SP;;Uez\u0010\u0002(\\";
        objectArray[10] = "M\u0013\u001f_\u0006^F\u001c\u000e\u0010gPM\u0017\nJ";
        objectArray[11] = "H\u0011aC/MC\u001ep\fMNL\u0017";
        objectArray[12] = Long.TYPE;
        c6.j[12] = "java/lang/Long";
        objectArray[13] = "k.%YWD}. \u0003DSje#\u0005HG{\"4\u0012\u0003W:";
        objectArray[14] = "F ^ kO3\u0000U/z\u0000R\u000e^$~Z&";
        objectArray[15] = Void.TYPE;
        c6.j[15] = "java/lang/Void";
        objectArray[16] = "\"( \u0016^-\"(7JR\"8c7TR7?\u0012f\u000e\u0000s";
        objectArray[17] = "pG\u00077]JnO\u001dx\u0015JtE\u0005?\u001cQ4d\u0018\u0015\u001cQiS\u001c3\u0001";
        objectArray[18] = ">X!}7[>X6!;T$\u00136?;A#bggi";
        objectArray[19] = Double.TYPE;
        c6.j[19] = "java/lang/Double";
        objectArray[20] = "_mBZ?m_mU\u00063bE&U\u00183wBW\u0004Bd0";
        objectArray[21] = "\u000e&\u001bRr\u0013\u000e&\f\u000e~\u001c\u0014m\f\u0010~\t\u0013\u001c]N+L";
        objectArray[22] = "hk{a\n\u0011hkl=\u0006\u001er l#\u0006\u000buQ=}S@";
        objectArray[23] = "\u001a\u0000\u0004`s\u001c\u001a\u0000\u0013<\u007f\u0013\u0000K\u0013\"\u007f\u0006\u0007:B}-M";
        objectArray[24] = "-$\u0003\u0005*I-$\u0014Y&F7o\u0014G&S0\u001eE\u001du\u0016";
        objectArray[25] = "a5\u001bO\u0012Xa5\f\u0013\u001eW{~\f\r\u001eB|\u000f]WG\u0001";
        objectArray[26] = "*x9=\u0004-_X22\u0015b>V99\u00118J";
        objectArray[27] = "\u001fR>cK)\tR;9X>\u001e\u00198?T*\u000f^/(\u001f;\u001c";
        objectArray[28] = "79Jbm@B\u0019Am|\u000f#\u0017JfxUW";
        objectArray[29] = ")\\ybT+)\\n>X$3\u0017n X14f?y\u0000t";
        objectArray[30] = "\u001f\u0002wK<(\u0014\rf\u0004A=\u0006\u0017dG";
        objectArray[31] = "\u0000xy+4\u0007\u0000xnw8\b\u001a3ni8\u001d\u001dB;6a";
        objectArray[32] = "0zp=I\u00110zgaE\u001e*1g\u007fE\u000b-@7\"\u0014";
        objectArray[33] = "z\r~:\u001c\u0017z\rif\u0010\u0018`Fix\u0010\rg7= G";
        objectArray[34] = "@6\u001c\u0012i;@6\u000bNe4Z}\u000bPe!]\fZ\u000f1b";
        objectArray[35] = "u\u000f\u0015c;Nu\u000f\u0002?7AoD\u0002!7Th5P\u007f`\u001f";
        objectArray[36] = "\n\u0018i\u0007Y,\n\u0018~[U#\u0010S~EU6\u0017\",\u001e\r|";
        objectArray[37] = "B2d#\u001f}B2s\u007f\u0013rXysa\u0013g_\b!:K&";
        objectArray[38] = "?dC\\5S)dF\u0006&D>/E\u0000*P/hR\u0017aA3";
        objectArray[39] = "\u001eZa&Pbkzj)A-\nta\"Ew~";
        objectArray[40] = "5$uE8)5$b\u00194&/ob\u000743(\u001e3Smu";
        objectArray[41] = ">\u0011'C~X>\u00110\u001frW$Z0\u0001rB#+`T%\u0004";
        objectArray[42] = ";b,Jhwoz-C\u000e`\nqw\u0018kldik\u0006r\u000bczr\u001diz:{x\u0019\u000e";
        objectArray[43] = "^!U'\u0004<\\(Q\u0017_[Z$Yj\\7\u0002aKm5";
        objectArray[44] = "JxD}\u00121\u001dz\u0019{j5s:\u001fuPl\u0019y\u001e#Q\\If\u0016 Z6\ng@!j";
        objectArray[45] = "F\u007f-\u0013\t\u001f\u0011n8\u0018eDAy7\u000f\tv\u0017=iR\\!F~2\u0002\b\u001dFi<\u000beH]c1\u000f\u0014\u0011\\i5h";
        objectArray[46] = "m\u0012\u0004_&ai\r\bNI`7\u000e\u0014>rio\u0007A\u0001)ioCy";
        objectArray[47] = "zp\u000b\u0017O8\u007f>\u0004\u000f%h~\"\u001d\u0007r? uEkC>v?\u001d\u001aLm\"3";
        objectArray[48] = ">Ix\u001e\u0016.;\u0007w\u0006|~:\u001bn\u000e+)eF5b\u0019)'Nx\bMh=\u001c";
        objectArray[49] = "+,d\"P\u00045.m7l^)1n=\u0000l}u6kW;\"(b!UD\u007f225lT%'vfSJ'.cZ";
        objectArray[50] = "!f*zFF.5~v\"R*\"#mN`zor:\"P97{5^\u0007+2*\nZ\r#8}eL\t).C";
        objectArray[51] = "\u00103aS;\u001a\u0014,mBT\u0018V!\u001c\ri\u0019\u001a0'\u000eo\tQ]#\u000f-QFf \t=\u001a+b!Ke\r\u0010a'[.`";
        objectArray[52] = "\u001d\u0010\u001e\u0014/\u0003\u000b\u0014\u0014\u0002\u0011\t\bV\u001a\u0015};Z\u001bBC\u0011\u0014\u001eF\u0013L-V\u0005VAr";
        objectArray[53] = "*y\n%\u0013,4{\u00030/v(d\u0000:CDy)^f\u0010\u0013){\u00073Hp~q^f/\u007f&\u007f\u000e:L(,&[]Cp\"v\u0007>\u0014z{#`2Ny=$_,Lp(\u0018";
        objectArray[54] = "-\f\";\u000e?|\u000e<m51!\u0011?9be{Efo51!\re8Gg&\u001a2";
        objectArray[55] = "W$\u001de\u0017}Sq\u001c:wuA`\u0000e\u001bG\u0015&]>I\u0010Kb\t:Hl\u001cp\fkw";
        objectArray[56] = "3z)\b[u-x \u001dg/1g#\u0017\u000b\u001de#{N]J3z)\b[u-x \u001dg";
        objectArray[57] = "ocq\u0014-S`2\"]\u0016V89us\u007fV\"2\u001a\u001dlOb8k\u0010'\u000e\"_";
        objectArray[58] = "*\u001a<\u001e)\u000e4\u0005-\u0004\u0015\u0013'\u00145\u0004y!vUi\\)vtU9\n{\u001b Yi\b\u0015";
        objectArray[59] = "V)\u000e@Z3C!KL=$\\5QRjs\u0006e\f>Q)Z6R]\u0006#\u0003c";
        objectArray[60] = "6[CXe4uJ\u0002\u000e]'g^\u001e\u001b0\u001cd;D]71tUF]ga\n\u0005D\t43gQHY6]";
        objectArray[61] = "\u001cg\b\u000f9\u007fH&\u0012]Kp\u0014\"\u0014P'BIeN\u000fKz\u00184\f\u000btd\u001a=\u00197+g\u0010#HO5x\u00019t";
        objectArray[62] = "bB\u0000{GPm\u0013S2|O;\u001a\u0016/;_RN\u0011?AV#CZ~\u00011bB\u0000{GPm\u0013S2|";
        objectArray[63] = "\u0002\bh\r=\u001b\u0017\u0000-\u0001Z\f\b\u00147\u001f\r[RDks6\u0001\u000e\u00174\u0010a\u000bWB";
        objectArray[64] = "a\"\u001e<0/u!J.N|k(\f\u0012t'<vt.?,r*\r;7i~M";
        objectArray[65] = "\u0005\"Kr?N\u0001=GcPYX0Lb\u000bYBL\nsj\t\u0006%Ib+_>";
        objectArray[66] = "\u001b&\n\u007f)sJ$\u0014)\u0012}\u0017;\u0017}E*NnH/\u0012}\u0017'M|`+\u00100\u001a";
        objectArray[67] = "D\u0010\f_/&\u0005\u0005\u0019\u0011\u00112\u0017\u0016(\tu \u0017jI]hl\u0017QJ[x'z";
        objectArray[68] = "AA\u000f\u0010\rEF\u0007\\P<\u00148DR\u000eY\u001aV\\N\u0010@}[T\n\f^\u0014\u0000@IT<";
        objectArray[69] = "V|RbZBG2Zi&DTp_hJv\u00005\u00047\u0017!VmUw\u001a\u001eHo\\b&";
        objectArray[70] = "dmr@ytu#zK\u0005rfa\u007fJi@2$$\u00155\u0017kovP9oupgJ\u0005";
        objectArray[71] = "\u0018\n8\u001aJ\u001dO\be\u001c2\u0019!\bf\u001eW\u0017O\u0010z\u0000NpH\u0003c\u001bU\u0001\u0011\u0002i\u001f2";
        objectArray[72] = "T$q~_\u0018\t\"'8o\u001d6c\u007f \n\u0013X{c>\u0013tUs'\"\r\u001d\u000egdzo";
        objectArray[73] = "KYkY\u001f[UFzC#FFWbCOt\u0011\u00158\u001d\u001e#\u0015\u0016nMMNA\u001a>O#";
        objectArray[74] = "@Js\u000b[FUB6\u0007<QJV,\u0019k\u0006\u0010\u0006ruP\\LU/\u0016\u0007V\u0015\u0000";
        objectArray[75] = "XHq@\"c\u0004UvB\u001cqFBoOzfgYpOY{_\\tY\u001c*AE(Em'\n\u0004h\"";
        objectArray[76] = "\u0002R4RBO\u001e\u000b=\u0007zL\u0014LdZ\u0016~@\u000f;\rB)\u001fUhFCVBO8Rz";
        objectArray[77] = "5\u0015\u0002}/m)L\u000b(\u0017n#\u000bRu{\\wH\r-(\u000b!\u0016Xj+4?\u0014Q\u007f\u0017";
        objectArray[78] = "$\u0001q\u001d30 TpBS82El\u001d?\nf\u00031Fh]$[<\u0015k;8\u00025@S";
        Object[] objectArray2 = objectArray;
        objectArray[79] = "\u0006rLU.E\u0018m]O\u0012X\u000b|EO~j\\>\u001f\u0010.=\baT\u0016\u007fO^fCA\u0012";
    }

    private static Field g(long l, long l2) {
        int n = c6.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = c6.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c6.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c6.c(clazz3, string2, clazz2)) != null) {
                    c6.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c6.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c6.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c6.f(727083157279923L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean lambda$prune$1(long l, Map.Entry entry) {
        long l2;
        block2: {
            block3: {
                long l3 = a ^ 0x5889701A1EADL;
                CallSite callSite = c6.c("L", (long)-8488496436012271292L, (long)l3);
                try {
                    long l4 = l - c6.c("W", (Object)((Long)((Object)c6.c("W", (Object)entry, (long)-8491266331585706259L, (long)l3))), (long)-8487524611415334453L, (long)l3) - c6.b("t", (int)2060, (long)(0x7D481CFE15D8EA26L ^ l3));
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != null) break block2;
                    if (l2 <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw c6.c("L", (Object)matchException, (long)-8488430467399714859L, (long)l3);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    private static boolean lambda$prune$3(long l, Map.Entry entry) {
        long l2;
        block2: {
            block3: {
                long l3 = a ^ 0x75527D1A3BA6L;
                CallSite callSite = c6.c("L", (long)-5820374013333889969L, (long)l3);
                try {
                    long l4 = l - c6.c("W", (Object)((Long)((Object)c6.c("W", (Object)entry, (long)-5826572040133827610L, (long)l3))), (long)-5819375783143799616L, (long)l3) - c6.b("t", (int)2060, (long)(0x7D48312518D8CF2DL ^ l3));
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != null) break block2;
                    if (l2 <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw c6.c("L", (Object)matchException, (long)-5820862190126017826L, (long)l3);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    private static boolean lambda$prune$2(long l, Map.Entry entry) {
        long l2;
        block2: {
            block3: {
                long l3 = a ^ 0x4EB663E07BDAL;
                CallSite callSite = c6.c("L", (long)-1205316222067155917L, (long)l3);
                try {
                    long l4 = l - c6.c("W", (Object)((Long)((Object)c6.c("W", (Object)entry, (long)-1197992146110258278L, (long)l3))), (long)-1206587109665782596L, (long)l3) - c6.b("t", (int)9213, (long)(0x649E57894E6AA4A1L ^ l3));
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != null) break block2;
                    if (l2 <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw c6.c("L", (Object)matchException, (long)-1205804398715661662L, (long)l3);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    /*
     * Unable to fully structure code
     */
    private static void lambda$onPacketReceive$0(long var0, class_2338 var2_1, class_2680 var3_2) {
        block9: {
            block8: {
                var4_3 = c6.a ^ 115553258514416L;
                var6_4 = var4_3 ^ 11322564019383L;
                var8_5 = c6.c("L", (long)-5516912953721978855L, (long)var4_3);
                try {
                    try {
                        v0 = var3_2;
                        if (var8_5 != null) break block8;
                        if (c6.c("W", (Object)v0, (long)-5514817852164025047L, (long)var4_3) == false) {
                        }
                        ** GOTO lbl21
                    }
                    catch (MatchException v1) {
                        throw c6.c("L", (Object)v1, (long)-5517409926328201592L, (long)var4_3);
                    }
                    v0 = var3_2;
                }
                catch (MatchException v2) {
                    throw c6.c("L", (Object)v2, (long)-5517409926328201592L, (long)var4_3);
                }
            }
            try {
                if (c6.c("W", (Object)v0, (long)-5514996819387490137L, (long)var4_3) != c6.c("D", (long)-5515348085139740852L, (long)var4_3)) break block9;
lbl21:
                // 2 sources

                v3 = new Object[3];
                v3[2] = var6_4;
                v3[1] = var0;
                v3[0] = var2_1;
                c6.c("L", (Object)v3, (long)-5516999950359271084L, (long)var4_3);
            }
            catch (MatchException v4) {
                throw c6.c("L", (Object)v4, (long)-5517409926328201592L, (long)var4_3);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(c6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(c6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


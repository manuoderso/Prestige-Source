/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.c6;
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
import net.minecraft.class_2338;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c5
implements cz_0 {
    private static final long a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final double e = 6.5;
    private static final Map f;
    private static final Map g;
    private static final Map h;
    private static boolean i;
    private static final long j;
    private static final long[] k;
    private static final Long[] l;
    private static final Map m;
    private static final Object[] n;
    private static final String[] o;

    private c5() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                c5.j = hc.a(2328803545205649129L, -2410683976396098144L, MethodHandles.lookup().lookupClass()).a(218283527270033L);
                c5.n = new Object[39];
                c5.o = new String[39];
                c5.a();
                c5.m = new HashMap<K, V>(13);
                var0 = c5.j ^ 14658356520078L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00fe\r\u00d4\u001b\u0080\u009f\u0017MF\u0098i]Z#\u00eb\u00c8\u0016\u00bf\u00bd\u00eb\u00c4e\"z\u0004=RWW\u0081\u00d2[I+\u0002;\n:\u00ea\u00ab";
                var7_6 = "\u00fe\r\u00d4\u001b\u0080\u009f\u0017MF\u0098i]Z#\u00eb\u00c8\u0016\u00bf\u00bd\u00eb\u00c4e\"z\u0004=RWW\u0081\u00d2[I+\u0002;\n:\u00ea\u00ab".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0083\u0087\u00b8\\\u00af3\u00958\u00c3]\u00fc\u009b\u009f\u000b\u00dd ";
                    var7_6 = "\u0083\u0087\u00b8\\\u00af3\u00958\u00c3]\u00fc\u009b\u009f\u000b\u00dd ".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        c5.k = var8_3;
        c5.l = new Long[7];
        c5.b = (long)c5.a("m", (int)26547, (long)(var0 ^ 685265178660147233L));
        c5.d = (long)c5.a("m", (int)17220, (long)(var0 ^ 8368976816918115539L));
        c5.a = (long)c5.a("m", (int)10266, (long)(var0 ^ 5714517569988255628L));
        c5.c = (long)c5.a("m", (int)15144, (long)(var0 ^ 833637791145446587L));
        c5.f = new HashMap<K, V>();
        c5.g = new HashMap<K, V>();
        c5.h = new HashMap<K, V>();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = c5.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 37;
            case 1 -> 43;
            case 2 -> 40;
            case 3 -> 57;
            case 4 -> 33;
            case 5 -> 15;
            case 6 -> 17;
            case 7 -> 58;
            case 8 -> 20;
            case 9 -> 4;
            case 10 -> 32;
            case 11 -> 5;
            case 12 -> 36;
            case 13 -> 53;
            case 14 -> 55;
            case 15 -> 47;
            case 16 -> 28;
            case 17 -> 35;
            case 18 -> 27;
            case 19 -> 1;
            case 20 -> 48;
            case 21 -> 9;
            case 22 -> 56;
            case 23 -> 42;
            case 24 -> 54;
            case 25 -> 12;
            case 26 -> 60;
            case 27 -> 52;
            case 28 -> 45;
            case 29 -> 21;
            case 30 -> 31;
            case 31 -> 25;
            case 32 -> 62;
            case 33 -> 34;
            case 34 -> 24;
            case 35 -> 51;
            case 36 -> 7;
            case 37 -> 18;
            case 38 -> 16;
            case 39 -> 46;
            case 40 -> 22;
            case 41 -> 2;
            case 42 -> 30;
            case 43 -> 29;
            case 44 -> 38;
            case 45 -> 11;
            case 46 -> 8;
            case 47 -> 14;
            case 48 -> 61;
            case 49 -> 49;
            case 50 -> 26;
            case 51 -> 10;
            case 52 -> 0;
            case 53 -> 3;
            case 54 -> 44;
            case 55 -> 39;
            case 56 -> 50;
            case 57 -> 59;
            case 58 -> 63;
            case 59 -> 23;
            case 60 -> 41;
            case 61 -> 13;
            case 62 -> 6;
            default -> 19;
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
        c5.o[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a4' || c == 'q' || c == 'm' || c == '$') {
                field = c5.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c5.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = c5.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void b(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = j ^ l) ^ 0x6A2BB098E7CEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        c5.b("\u00a2", (Object)objectArray2, (long)-8498017623987271067L, (long)l);
        c5.b("\u00e2", (Object)g, (Object)c5.b("\u00e2", (Object)class_23382, (long)-8498116886013776505L, (long)l), (Object)c5.b("\u00a2", (long)c5.b("\u00a2", (long)-8497746262170076896L, (long)l), (long)-8494195439824242249L, (long)l), (long)-8494036924173385216L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static boolean b(Object[] objectArray) {
        int n;
        block5: {
            block4: {
                class_2338 class_23382 = (class_2338)objectArray[0];
                long l = (Long)objectArray[1];
                long l2 = (l = j ^ l) ^ 0x35F34E8EA3FBL;
                CallSite callSite = c5.b("\u00a2", (long)-3591399203860179608L, (long)l);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                c5.b("\u00a2", (Object)objectArray2, (long)-3592282444861239728L, (long)l);
                CallSite callSite2 = callSite;
                Long l3 = (Long)((Object)c5.b("\u00e2", (Object)h, (Object)class_23382, (long)-3590852507112186702L, (long)l));
                try {
                    try {
                        if (l3 == null) break block4;
                        reference cfr_temp_0 = c5.b("\u00a2", (long)-3592554098712068843L, (long)l) - c5.b("\u00e2", (Object)l3, (long)-3592692253512503974L, (long)l) - c5.a("m", (int)15279, (long)(0x7AFAAA2452DAA5DCL ^ l));
                        n = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (callSite2 != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw c5.b("\u00a2", (Object)matchException, (long)-3590602694587392301L, (long)l);
                    }
                    if (n >= 0) break block4;
                }
                catch (MatchException matchException) {
                    throw c5.b("\u00a2", (Object)matchException, (long)-3590602694587392301L, (long)l);
                }
                n = 1;
                break block5;
            }
            n = false;
        }
        return n != 0;
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

    private static void c(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = j ^ l2;
        c5.b("\u00e2", (Object)f, (Object)c5.b("\u00e2", (Object)class_23382, (long)-5431357054977420536L, (long)l2), (Object)c5.b("\u00a2", (long)l, (long)-5435316439191107784L, (long)l2), (long)-5435721240579130225L, (long)l2);
    }

    private static Method h(long l, long l2) {
        int n = c5.e(l, l2);
        Object object = c5.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = c5.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c5.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c5.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        c5.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c5.f(361957854316351L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c5.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c5.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c5.f(361957854316351L, 0L);
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
            int n = c5.e(l, l2);
            object = c5.n[n];
            try {
                if (!(object instanceof String)) break block2;
                c5.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = c5.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c5.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c5.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c5.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = c5.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x505C;
        if (c5.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/c5", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            c5.l[n2] = l4;
        }
        return c5.l[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static boolean a(Object[] objectArray) {
        int n;
        block14: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            class_2338 class_23382;
            block12: {
                Object object;
                block13: {
                    class_23382 = (class_2338)objectArray[0];
                    l = (Long)objectArray[1];
                    long l2 = (l = j ^ l) ^ 0x2E5CC4B1A58FL;
                    CallSite callSite3 = c5.b("\u00a2", (long)-4009097725035146468L, (long)l);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    c5.b("\u00a2", (Object)objectArray2, (long)-4012217394099156956L, (long)l);
                    callSite2 = c5.b("\u00a2", (long)-4012508551126992031L, (long)l);
                    callSite = callSite3;
                    Long l3 = (Long)((Object)c5.b("\u00e2", (Object)f, (Object)class_23382, (long)-4008589579576747322L, (long)l));
                    try {
                        try {
                            if (l3 == null) break block12;
                            reference cfr_temp_0 = callSite2 - c5.b("\u00e2", (Object)l3, (long)-4012660256882955474L, (long)l) - c5.a("m", (int)923, (long)(0x356AB0705A939B9DL ^ l));
                            object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (callSite != null) break block13;
                        }
                        catch (MatchException matchException) {
                            throw c5.b("\u00a2", (Object)matchException, (long)-4008337327579342681L, (long)l);
                        }
                        if (object >= 0) break block12;
                    }
                    catch (MatchException matchException) {
                        throw c5.b("\u00a2", (Object)matchException, (long)-4008337327579342681L, (long)l);
                    }
                    object = 1;
                }
                return (boolean)object;
            }
            CallSite callSite4 = c5.b("\u00e2", (Object)c5.b("\u00e2", (Object)g, (long)-4008735961722547144L, (long)l), (long)-4008546120673379633L, (long)l);
            while (c5.b("\u00e2", (Object)callSite4, (long)-4012289623119650444L, (long)l) != false) {
                block17: {
                    Object object;
                    block16: {
                        block15: {
                            Map.Entry entry = (Map.Entry)((Object)c5.b("\u00e2", (Object)callSite4, (long)-4009177808747196508L, (long)l));
                            try {
                                try {
                                    reference cfr_temp_1 = callSite2 - c5.b("\u00e2", (Object)((Long)((Object)c5.b("\u00e2", (Object)entry, (long)-4012401358561497501L, (long)l))), (long)-4012660256882955474L, (long)l) - c5.a("m", (int)12914, (long)(0x79D27A2E52F82A71L ^ l));
                                    n = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                    if (callSite != null) break block14;
                                    if (callSite != null) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw c5.b("\u00a2", (Object)matchException, (long)-4008337327579342681L, (long)l);
                                }
                                if (n > 0) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw c5.b("\u00a2", (Object)matchException, (long)-4008337327579342681L, (long)l);
                            }
                            reference cfr_temp_2 = c5.b("\u00e2", (Object)((class_2338)c5.b("\u00e2", (Object)entry, (long)-4012603145282768809L, (long)l)), (Object)class_23382, (long)-4009252680902364463L, (long)l) - 42.25;
                            object = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                        }
                        try {
                            if (callSite != null) break block16;
                            if (object > 0) break block17;
                        }
                        catch (MatchException matchException) {
                            throw c5.b("\u00a2", (Object)matchException, (long)-4008337327579342681L, (long)l);
                        }
                        object = 1;
                    }
                    return (boolean)object;
                }
                if (callSite == null) continue;
            }
            n = false;
        }
        return n != 0;
    }

    private static void a(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        block5: {
            block6: {
                block4: {
                    l2 = (Long)objectArray[0];
                    l = (l2 = j ^ l2) ^ 0x60DD5125A795L;
                    CallSite callSite2 = c5.b("\u00a2", (long)7968831919641048534L, (long)l2);
                    try {
                        try {
                            if (i) break block4;
                            callSite = c5.b("m", (long)7968282799174873485L, (long)l2);
                            if (callSite2 != null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw c5.b("\u00a2", (Object)matchException, (long)7968467277777108589L, (long)l2);
                        }
                        if (callSite != null) break block6;
                    }
                    catch (MatchException matchException) {
                        throw c5.b("\u00a2", (Object)matchException, (long)7968467277777108589L, (long)l2);
                    }
                }
                return;
            }
            i = 1;
            callSite = c5.b("m", (long)7968282799174873485L, (long)l2);
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = new c6();
        c5.b("\u00e2", (Object)callSite, (Object)objectArray2, (long)7968381865922323490L, (long)l2);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "Ua>\u0007ncCa;]}tT*8[q`Em/L:ry";
        objectArray[1] = "I\u000e><\u0000{<.53\u00114A6&4\u0018})";
        objectArray[2] = "/^1T\u0016<9^4\u000e\u0005+.\u00157\b\t??R \u001fB/~";
        objectArray[3] = "E+\u0006\u001a\u001fTN$\u0017U|Y[)\u0018>I[J:\u0004\u0012^V";
        objectArray[4] = "XAgy`*FI}6\u0003>B";
        objectArray[5] = "ar\u0019V]Hj}\b\u0019<Fav\fC";
        objectArray[6] = "\u001a\u001a`#x=o:k,ir\u000e4`'m(z";
        objectArray[7] = Void.TYPE;
        c5.o[7] = "java/lang/Void";
        objectArray[8] = "\u0001HX\u001c;\u001f\nGISY\u001c\u0005N";
        objectArray[9] = Long.TYPE;
        c5.o[9] = "java/lang/Long";
        objectArray[10] = "wCa|w<|Lp3\n)nVrp";
        objectArray[11] = "\u0015C)\\)\u0003\u0015C>\u0000%\f\u000f\b>\u001e%\u0019\byoAwR";
        objectArray[12] = "o38`\u000bzo3/<\u0007uux/\"\u0007`r\t~}^!";
        objectArray[13] = Double.TYPE;
        c5.o[13] = "java/lang/Double";
        objectArray[14] = " IH4W\u0018>AR{0\u0019/Z_!\u0016\u001f";
        objectArray[15] = "mN\u0012?A_sF\bp<Os";
        objectArray[16] = "lC\u0013M \u0016rK\t\u0002C\u0002v\u0006 Bz\u0011\u007f";
        objectArray[17] = Boolean.TYPE;
        c5.o[17] = "java/lang/Boolean";
        objectArray[18] = "[Q]J:mMQX\u0010)zZ\u001a[\u0016%nK]L\u0001n~S]N\n43oFN\u00174tXQ";
        objectArray[19] = "\u0002X4G4~\u0014X1\u001d'i\u0003\u00132\u001b+}\u0012T%\f`l)";
        objectArray[20] = "!OVoc,To]`rc5aVkv9A";
        objectArray[21] = "\u001bU?<V:J\u0017$'1!IW'<]\u0013\u001d\u0013}e\u000bD\u0014S)j^;\u001c\u0012\u007fd1uMQ gQ8O\u00179[";
        objectArray[22] = "**\"b>\rc=?f\u0005\u0015v&<[>\u0010r&}gw\u001c|(@";
        objectArray[23] = "\u0018\u0003W\u0002@\u0000\u001f\u0003\u001cdA:J\u0002T\n\u0014KIAF\u0019+";
        objectArray[24] = "\u0014\u001a$d\u007f\u001a\r\n~m\u0011\u001b\u007f\u0017&o\u007f\u000fB\u0014 9a";
        objectArray[25] = "1[p(\u007f\u00102]&6\u0001D]U *8S?\u0003g<`-aJ%7oP%D%6\u0001";
        objectArray[26] = "L\n<'4\u0002\u0016\b1<\u000b\u0001uTx(6\t\u0017\be(jhO\u0016j\u007fj\n\u0013\u000bj#\u000b";
        objectArray[27] = "mW\u0004\u001dD\u001fa\u000f\t\u0006$\u00029V\u0006\u0015c\u0012P\f\u0005\b_\u001d*H\n\u0001G|mW\u0004\u001dD\u001fa\u000f\t\u0006$";
        objectArray[28] = "GVNEl\u0018\u0004U\u0016\u0007\u000bI\u001a\u0017\u000fMPI\u0000k\u001cY1]\u0018\u0015\u0015QyT|";
        objectArray[29] = "2\u0006B$\u00147q\u0005\u001afsstGyf\u0010by\u0006E/\u001clw;B>\u001a{4\u0007\u000b2\u0014u\t\u0000\u001a4\u000365I\u0016:\r\u000b";
        objectArray[30] = "q$:P\u001dX2'b\u0012z\u000b'e\u0001\u0012\u0019\r:$=[\u0015\u00034\u0019:J\u0013\u0014w%sF\u001d\u001aJ";
        objectArray[31] = "h\u001fGmF-a\u0017\u000fd\"2}\u0017\u0007}^4{zLh@j:\u0004\u0005\u007f]n\u0001";
        objectArray[32] = "9fMw,i<&E2\u001dd>*qcyv>V\u0014it{nj]ezuS";
        objectArray[33] = "\u001cwQYzRU`L]ALDpu\r1P-`Z\u0010:OP;\t\u0018!,";
        objectArray[34] = "l{x7N\u00146yu,q\u0017Urx>H\u00007$?(\u0010~im}#\u001f\u0003-c}\"q";
        objectArray[35] = "\u0017\u000b$i-dFI?rJ\u007fE\t<i&M\u0011Md0p\u001a\u0017\u000b$i-dFI?rJ";
        objectArray[36] = "W\u001eH0s'[FE+\u0013 \r\u001dX\u000bz \u0017\u00167km4\u0011\u001aM/b=\t{";
        objectArray[37] = "4FJ\u001fz\u000b1\u0006BZK\u00063\nk\u000f:ie\u0015A\u0012vU,\u0019O\u001cK";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "\u0005GdA8XS\u0015t\u0004^KGSwT8\\fHhT\u001bA^MlB^\u001eDYvX$ZKPn9";
    }

    private static Field g(long l, long l2) {
        int n = c5.e(l, l2);
        Object object = c5.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = c5.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c5.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c5.c(clazz3, string2, clazz2)) != null) {
                    c5.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c5.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c5.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c5.f(361957854316351L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c5.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(c5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


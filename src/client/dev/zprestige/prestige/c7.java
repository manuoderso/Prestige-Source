/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2338
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 */
package dev.zprestige.prestige;

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
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3959;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c7
implements cz_0 {
    private static final double a = 4.25;
    private static final double c = 8.0;
    private static final long d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                c7.d = hc.a(3340329912744268170L, 974579759337800553L, MethodHandles.lookup().lookupClass()).a(278396529161404L);
                c7.h = new Object[57];
                c7.i = new String[57];
                c7.a();
                c7.g = new HashMap<K, V>(13);
                var0 = c7.d ^ 95581071799230L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u0088%>0\u0016Q\u00da\u00ae\u00da\u00db\u00b1\b*[jm\u0002\u00f4,\u0007\u00c7\u00bf\u00ea3\u0011t\u00db\u00a5\u00a4\r\u00f4\u009d}\u00e7\u00ea\u00d4~Pw\u00a1\u00aeN\u0015\u00a0\u00061\u0012\u0002";
                var7_6 = "\u0088%>0\u0016Q\u00da\u00ae\u00da\u00db\u00b1\b*[jm\u0002\u00f4,\u0007\u00c7\u00bf\u00ea3\u0011t\u00db\u00a5\u00a4\r\u00f4\u009d}\u00e7\u00ea\u00d4~Pw\u00a1\u00aeN\u0015\u00a0\u00061\u0012\u0002".length();
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
                    var6_5 = "\u00fcu\u00a4\u00db\u0084\u0001y\u009d'\u00e5\u00ed\u0091\u00a6P\u00ce\u00b9";
                    var7_6 = "\u00fcu\u00a4\u00db\u0084\u0001y\u009d'\u00e5\u00ed\u0091\u00a6P\u00ce\u00b9".length();
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
        c7.e = var8_3;
        c7.f = new Integer[8];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 36;
            case 1 -> 1;
            case 2 -> 17;
            case 3 -> 31;
            case 4 -> 50;
            case 5 -> 55;
            case 6 -> 21;
            case 7 -> 18;
            case 8 -> 14;
            case 9 -> 22;
            case 10 -> 46;
            case 11 -> 16;
            case 12 -> 7;
            case 13 -> 42;
            case 14 -> 10;
            case 15 -> 60;
            case 16 -> 33;
            case 17 -> 6;
            case 18 -> 9;
            case 19 -> 57;
            case 20 -> 49;
            case 21 -> 40;
            case 22 -> 0;
            case 23 -> 63;
            case 24 -> 39;
            case 25 -> 20;
            case 26 -> 25;
            case 27 -> 28;
            case 28 -> 2;
            case 29 -> 26;
            case 30 -> 54;
            case 31 -> 51;
            case 32 -> 53;
            case 33 -> 56;
            case 34 -> 59;
            case 35 -> 41;
            case 36 -> 48;
            case 37 -> 12;
            case 38 -> 35;
            case 39 -> 5;
            case 40 -> 47;
            case 41 -> 52;
            case 42 -> 11;
            case 43 -> 58;
            case 44 -> 38;
            case 45 -> 3;
            case 46 -> 24;
            case 47 -> 62;
            case 48 -> 32;
            case 49 -> 44;
            case 50 -> 37;
            case 51 -> 15;
            case 52 -> 8;
            case 53 -> 4;
            case 54 -> 23;
            case 55 -> 34;
            case 56 -> 30;
            case 57 -> 29;
            case 58 -> 27;
            case 59 -> 19;
            case 60 -> 61;
            case 61 -> 13;
            case 62 -> 43;
            default -> 45;
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
        c7.i[n3] = new String(cArray);
        return n3;
    }

    public static class_243 b(Object[] objectArray) {
        CallSite callSite;
        block33: {
            Object object;
            CallSite callSite2;
            long l;
            long l2;
            long l3;
            class_2338 class_23382;
            block31: {
                block32: {
                    class_23382 = (class_2338)objectArray[0];
                    l3 = (Long)objectArray[1];
                    long l4 = l3 = d ^ l3;
                    l2 = l4 ^ 0x51A0CFCE12C2L;
                    l = l4 ^ 0x46BB6AE6F1C5L;
                    callSite2 = c7.b("\u00c9", (long)4593598116104880706L, (long)l3);
                    try {
                        try {
                            reference cfr_temp_0 = c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (long)4593490100735577686L, (long)l3), (long)4590353341301435645L, (long)l3) - ((double)c7.b("V", (Object)class_23382, (long)4590774481726847529L, (long)l3) + 1.0);
                            object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (callSite2 != null) break block31;
                            if (object >= 0) break block32;
                        }
                        catch (MatchException matchException) {
                            throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                        }
                        return null;
                    }
                    catch (MatchException matchException) {
                        throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                    }
                }
                object = 5;
            }
            class_243[] class_243Array = new class_243[object];
            class_243Array[0] = new class_243(0.5, 1.0, 0.5);
            class_243Array[1] = new class_243(0.1, 1.0, 0.1);
            class_243Array[2] = new class_243(0.9, 1.0, 0.1);
            class_243Array[3] = new class_243(0.1, 1.0, 0.9);
            class_243Array[4] = new class_243(0.9, 1.0, 0.9);
            class_243[] class_243Array2 = class_243Array;
            CallSite callSite3 = null;
            int n = 0;
            while (n < class_243Array2.length) {
                block37: {
                    block36: {
                        CallSite callSite4;
                        block39: {
                            class_243 class_2432;
                            block38: {
                                class_243 class_2433;
                                block34: {
                                    class_243 class_2434 = class_243Array2[n];
                                    class_2432 = new class_243((double)c7.b("V", (Object)class_23382, (long)4590112434258753029L, (long)l3) + c7.b("\u00c8", (Object)class_2434, (long)4590691095349785167L, (long)l3), (double)c7.b("V", (Object)class_23382, (long)4590774481726847529L, (long)l3) + c7.b("\u00c8", (Object)class_2434, (long)4589689233571806483L, (long)l3), (double)c7.b("V", (Object)class_23382, (long)4589813728930413971L, (long)l3) + c7.b("\u00c8", (Object)class_2434, (long)4589955648986328488L, (long)l3));
                                    try {
                                        block35: {
                                            try {
                                                try {
                                                    try {
                                                        callSite = c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (long)4593490100735577686L, (long)l3);
                                                        if (callSite2 != null) break block33;
                                                        if (callSite2 != null) break block34;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                                    }
                                                    if (!(c7.b("V", (Object)callSite, (Object)class_2432, (long)4590584091746067735L, (long)l3) > 4.25)) break block35;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                                }
                                                if (callSite2 == null) break block36;
                                            }
                                            catch (MatchException matchException) {
                                                throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                            }
                                        }
                                        class_2433 = class_2432;
                                    }
                                    catch (MatchException matchException) {
                                        throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                    }
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l2;
                                objectArray2[0] = class_2433;
                                CallSite callSite5 = c7.b("\u00c9", (Object)objectArray2, (long)4590881609395663663L, (long)l3);
                                try {
                                    try {
                                        if (callSite2 != null) break block37;
                                        if (callSite5 == null) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                    }
                                    if (!(c7.b("V", (Object)c7.b("V", (Object)callSite5, (long)4590159597136727879L, (long)l3), (Object)class_2432, (long)4590584091746067735L, (long)l3) < (double)0.1f)) break block36;
                                }
                                catch (MatchException matchException) {
                                    throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                }
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l;
                                CallSite callSite6 = c7.b("\u00c9", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (float)1.0f, (long)4589442374450901954L, (long)l3), (Object)class_2432, (Object)c7.b("V", (Object)c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (long)4589786920711010308L, (long)l3), (Object)c7.b("V", (Object)class_2432, (Object)c7.b("\u00c9", (Object)objectArray3, (long)4590856489681642830L, (long)l3), (long)4589491625646477780L, (long)l3), (long)4589539832907852476L, (long)l3), (double)1.0, (double)1.0, (double)1.0, (long)4590261037203880199L, (long)l3), c7::lambda$interactTopFace$2, (double)c7.b("V", (Object)class_2432, (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (float)1.0f, (long)4589442374450901954L, (long)l3), (long)4590584091746067735L, (long)l3), (long)4590455287198668391L, (long)l3);
                                try {
                                    try {
                                        try {
                                            if (callSite6 != null && callSite2 == null) break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                        }
                                        if (n != 0) break block38;
                                    }
                                    catch (MatchException matchException) {
                                        throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                    }
                                    return class_2432;
                                }
                                catch (MatchException matchException) {
                                    throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                }
                            }
                            try {
                                block40: {
                                    try {
                                        try {
                                            try {
                                                callSite4 = callSite3;
                                                if (callSite2 != null) break block39;
                                                if (callSite4 == null) break block40;
                                            }
                                            catch (MatchException matchException) {
                                                throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                            }
                                            callSite4 = c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (long)4593490100735577686L, (long)l3);
                                            if (callSite2 != null) break block39;
                                        }
                                        catch (MatchException matchException) {
                                            throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                        }
                                        if (!(c7.b("V", (Object)callSite4, (Object)class_2432, (long)4590584091746067735L, (long)l3) < c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)4593650225175522191L, (long)l3), (long)4593490100735577686L, (long)l3), (Object)callSite3, (long)4590584091746067735L, (long)l3))) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                                    }
                                }
                                callSite4 = class_2432;
                            }
                            catch (MatchException matchException) {
                                throw c7.b("\u00c9", (Object)matchException, (long)4593436553280903404L, (long)l3);
                            }
                        }
                        callSite3 = callSite4;
                    }
                    ++n;
                }
                if (callSite2 == null) continue;
            }
            callSite = callSite3;
        }
        return callSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == 'Q' || c == '\u00f0' || c == '\u00e1') {
                field = c7.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c7.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = c7.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Method h(long l, long l2) {
        int n = c7.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = c7.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c7.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c7.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        c7.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c7.f(1918941468586999L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c7.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c7.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c7.f(1918941468586999L, 0L);
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
            int n = c7.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                c7.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c7.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c7.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = c7.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c7.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static class_239 a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l = (Long)objectArray[1];
        l = d ^ l;
        return c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)6569561470199652272L, (long)l), (Object)new class_3959((class_243)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)6567535764479119124L, (long)l), (long)6567414396750359245L, (long)l), class_2432, (class_3959.class_3960)c7.b("\u00f0", (long)6569299244478023555L, (long)l), (class_3959.class_242)c7.b("\u00f0", (long)6568621489852209493L, (long)l), (class_1297)c7.b("\u00c8", (Object)b, (long)6567535764479119124L, (long)l)), (long)6569017879003143959L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x32C9;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/c7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            c7.f[n2] = n3;
        }
        return f[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = c7.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static class_243 a(Object[] objectArray) {
        CallSite callSite;
        block65: {
            Object object;
            Object object2;
            CallSite callSite2;
            CallSite callSite3;
            class_243[] class_243Array;
            long l;
            long l2;
            long l3;
            class_2338 class_23382;
            block55: {
                CallSite callSite4;
                block64: {
                    class_23382 = (class_2338)objectArray[0];
                    l3 = (Long)objectArray[1];
                    long l4 = l3 = d ^ l3;
                    l2 = l4 ^ 0x37A81E533E92L;
                    l = l4 ^ 0x20B3BB7BDD95L;
                    class_243[] class_243Array2 = new class_243[c7.a("g", (int)32114, (long)(0x5A7DB42DA7E1DC50L ^ l3))];
                    class_243Array2[0] = new class_243(0.5, 1.0, 0.5);
                    class_243Array2[1] = new class_243(0.5, 0.5, 0.0);
                    class_243Array2[2] = new class_243(0.0, 0.5, 0.5);
                    class_243Array2[3] = new class_243(1.0, 0.5, 0.5);
                    class_243Array2[4] = new class_243(0.5, 0.5, 1.0);
                    class_243Array2[5] = new class_243(1.0, 0.0, 1.0);
                    class_243Array2[c7.a("g", (int)15153, (long)(0x62E28CEC4D061A10L ^ l3))] = new class_243(0.0, 0.0, 1.0);
                    class_243Array2[c7.a("g", (int)6287, (long)(0x2867FE55961BB9AAL ^ l3))] = new class_243(1.0, 0.0, 0.0);
                    class_243Array2[c7.a("g", (int)22472, (long)(0x68E4DC467945F6EFL ^ l3))] = new class_243(0.0, 0.0, 0.0);
                    class_243Array2[c7.a("g", (int)17971, (long)(0x1D2680CF0BF16717L ^ l3))] = new class_243(1.0, 1.0, 1.0);
                    class_243Array2[c7.a("g", (int)15490, (long)(0x49C5325737B61DA1L ^ l3))] = new class_243(0.0, 1.0, 1.0);
                    class_243Array2[c7.a("g", (int)19864, (long)(0x76D999011521ECBEL ^ l3))] = new class_243(1.0, 1.0, 0.0);
                    class_243Array2[c7.a("g", (int)25367, (long)(0x65630D60F8F84237L ^ l3))] = new class_243(0.0, 1.0, 0.0);
                    class_243Array = class_243Array2;
                    callSite3 = c7.b("\u00c9", (long)1436607800507166226L, (long)l3);
                    callSite2 = null;
                    int n = 0;
                    while (n < class_243Array.length) {
                        block60: {
                            block59: {
                                Object object3;
                                class_243 class_2432;
                                block63: {
                                    block62: {
                                        CallSite callSite5;
                                        block61: {
                                            CallSite callSite6;
                                            block57: {
                                                class_243 class_2433;
                                                block56: {
                                                    class_2433 = class_243Array[n];
                                                    try {
                                                        try {
                                                            if (callSite3 != null) break block55;
                                                            if (n <= 4) break block56;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                        }
                                                        if (callSite3 == null) break;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                    }
                                                }
                                                class_2432 = new class_243((double)c7.b("V", (Object)class_23382, (long)1433056143667993173L, (long)l3) + c7.b("\u00c8", (Object)class_2433, (long)1433568765324451359L, (long)l3), (double)c7.b("V", (Object)class_23382, (long)1433784163447379577L, (long)l3) + c7.b("\u00c8", (Object)class_2433, (long)1432632876442472771L, (long)l3), (double)c7.b("V", (Object)class_23382, (long)1432757436225589699L, (long)l3) + c7.b("\u00c8", (Object)class_2433, (long)1432894895407596024L, (long)l3));
                                                try {
                                                    block58: {
                                                        try {
                                                            try {
                                                                callSite6 = c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1436433739260568070L, (long)l3);
                                                                if (callSite3 != null) break block57;
                                                                if (!(c7.b("\u00c9", (double)c7.b("V", (Object)callSite6, (Object)class_2432, (long)1432160284390690284L, (long)l3), (long)1433469359439387912L, (long)l3) > 4.25)) break block58;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                            }
                                                            if (callSite3 == null) break block59;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                        }
                                                    }
                                                    callSite6 = class_2432;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                }
                                            }
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l2;
                                            objectArray2[0] = callSite6;
                                            object2 = c7.b("\u00c9", (Object)objectArray2, (long)1433957264481050495L, (long)l3);
                                            try {
                                                try {
                                                    if (callSite3 != null) break block60;
                                                    if (object2 == null) break block59;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                }
                                                if (!(c7.b("V", (Object)c7.b("V", (Object)object2, (long)1433239647583101719L, (long)l3), (Object)class_2432, (long)1433659671180757319L, (long)l3) < (double)0.1f)) break block59;
                                            }
                                            catch (MatchException matchException) {
                                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                            }
                                            Object[] objectArray3 = new Object[1];
                                            objectArray3[0] = l;
                                            object = c7.b("\u00c9", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (float)1.0f, (long)1432320117493489554L, (long)l3), (Object)class_2432, (Object)c7.b("V", (Object)c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1432800996163818580L, (long)l3), (Object)c7.b("V", (Object)class_2432, (Object)c7.b("\u00c9", (Object)objectArray3, (long)1433721036437211422L, (long)l3), (long)1432496911500508548L, (long)l3), (long)1432483475225003756L, (long)l3), (double)1.0, (double)1.0, (double)1.0, (long)1433134375201363287L, (long)l3), c7::lambda$interact$0, (double)c7.b("V", (Object)class_2432, (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (float)1.0f, (long)1432320117493489554L, (long)l3), (long)1433659671180757319L, (long)l3), (long)1433539738410121783L, (long)l3);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (object != null && callSite3 == null) break block59;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                        }
                                                        callSite5 = callSite2;
                                                        if (callSite3 != null) break block61;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                    }
                                                    if (callSite5 == null) break block62;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                }
                                                callSite5 = c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1436433739260568070L, (long)l3);
                                            }
                                            catch (MatchException matchException) {
                                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                            }
                                        }
                                        try {
                                            reference cfr_temp_0 = c7.b("V", (Object)callSite5, (Object)class_2432, (long)1433659671180757319L, (long)l3) - c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1436433739260568070L, (long)l3), (Object)callSite2, (long)1433659671180757319L, (long)l3);
                                            object3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                            if (callSite3 != null) break block63;
                                            if (object3 >= 0) break block59;
                                        }
                                        catch (MatchException matchException) {
                                            throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                        }
                                    }
                                    object3 = n;
                                }
                                try {
                                    if (object3 == 0) {
                                        return class_2432;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                }
                                callSite2 = class_2432;
                            }
                            ++n;
                        }
                        if (callSite3 == null) continue;
                    }
                    try {
                        callSite4 = callSite2;
                        if (callSite3 != null) break block64;
                        if (callSite4 == null) break block55;
                    }
                    catch (MatchException matchException) {
                        throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                    }
                    callSite4 = callSite2;
                }
                return callSite4;
            }
            class_243[] class_243Array3 = class_243Array;
            int n = class_243Array3.length;
            int n2 = 0;
            while (n2 < n) {
                block69: {
                    block68: {
                        CallSite callSite7;
                        block70: {
                            class_243 class_2432;
                            block66: {
                                object2 = class_243Array3[n2];
                                object = new class_243((double)c7.b("V", (Object)class_23382, (long)1433056143667993173L, (long)l3) + c7.b("\u00c8", (Object)object2, (long)1433568765324451359L, (long)l3), (double)c7.b("V", (Object)class_23382, (long)1433784163447379577L, (long)l3) + c7.b("\u00c8", (Object)object2, (long)1432632876442472771L, (long)l3), (double)c7.b("V", (Object)class_23382, (long)1432757436225589699L, (long)l3) + c7.b("\u00c8", (Object)object2, (long)1432894895407596024L, (long)l3));
                                try {
                                    block67: {
                                        try {
                                            try {
                                                try {
                                                    callSite = c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1436433739260568070L, (long)l3);
                                                    if (callSite3 != null) break block65;
                                                    if (callSite3 != null) break block66;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                }
                                                if (!(c7.b("\u00c9", (double)c7.b("V", (Object)callSite, (Object)object, (long)1432160284390690284L, (long)l3), (long)1433469359439387912L, (long)l3) > 4.25)) break block67;
                                            }
                                            catch (MatchException matchException) {
                                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                            }
                                            if (callSite3 == null) break block68;
                                        }
                                        catch (MatchException matchException) {
                                            throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                        }
                                    }
                                    class_2432 = object;
                                }
                                catch (MatchException matchException) {
                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                }
                            }
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l2;
                            objectArray4[0] = class_2432;
                            CallSite callSite8 = c7.b("\u00c9", (Object)objectArray4, (long)1433957264481050495L, (long)l3);
                            try {
                                try {
                                    if (callSite3 != null) break block69;
                                    if (callSite8 == null) break block68;
                                }
                                catch (MatchException matchException) {
                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                }
                                if (!(c7.b("V", (Object)c7.b("V", (Object)callSite8, (long)1433239647583101719L, (long)l3), (Object)object, (long)1433659671180757319L, (long)l3) < (double)0.1f)) break block68;
                            }
                            catch (MatchException matchException) {
                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                            }
                            Object[] objectArray5 = new Object[1];
                            objectArray5[0] = l;
                            CallSite callSite9 = c7.b("\u00c9", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (float)1.0f, (long)1432320117493489554L, (long)l3), (Object)object, (Object)c7.b("V", (Object)c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1432800996163818580L, (long)l3), (Object)c7.b("V", (Object)object, (Object)c7.b("\u00c9", (Object)objectArray5, (long)1433721036437211422L, (long)l3), (long)1432496911500508548L, (long)l3), (long)1432483475225003756L, (long)l3), (double)1.0, (double)1.0, (double)1.0, (long)1433134375201363287L, (long)l3), c7::lambda$interact$1, (double)c7.b("V", (Object)object, (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (float)1.0f, (long)1432320117493489554L, (long)l3), (long)1433659671180757319L, (long)l3), (long)1433539738410121783L, (long)l3);
                            try {
                                block71: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite9 != null && callSite3 == null) break block68;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                    }
                                                    callSite7 = callSite2;
                                                    if (callSite3 != null) break block70;
                                                }
                                                catch (MatchException matchException) {
                                                    throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                                }
                                                if (callSite7 == null) break block71;
                                            }
                                            catch (MatchException matchException) {
                                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                            }
                                            callSite7 = c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1436433739260568070L, (long)l3);
                                            if (callSite3 != null) break block70;
                                        }
                                        catch (MatchException matchException) {
                                            throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                        }
                                        if (!(c7.b("V", (Object)callSite7, (Object)object, (long)1433659671180757319L, (long)l3) < c7.b("V", (Object)c7.b("V", (Object)c7.b("\u00c8", (Object)b, (long)1436519099057817567L, (long)l3), (long)1436433739260568070L, (long)l3), (Object)callSite2, (long)1433659671180757319L, (long)l3))) break block68;
                                    }
                                    catch (MatchException matchException) {
                                        throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                                    }
                                }
                                callSite7 = object;
                            }
                            catch (MatchException matchException) {
                                throw c7.b("\u00c9", (Object)matchException, (long)1436450633598596284L, (long)l3);
                            }
                        }
                        callSite2 = callSite7;
                    }
                    ++n2;
                }
                if (callSite3 == null) continue;
            }
            callSite = callSite2;
        }
        return callSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0019%#>\\\r\u000f%&dO\u001a\u0018n%bC\u000e\t)2u\b\u001eJ";
        objectArray[1] = "t\u001c!\u000fWo\u007f\u00130@4bj\u001e?+\u0001`{\r#\u0007\u0016m";
        objectArray[2] = "34\t7\u001f\u001334\u001ek\u0013\u001c)\u007f\u001eu\u0013\t.\u000eJ-D";
        objectArray[3] = "U3?\":IU3(~6FOx(`6SH\ty8d";
        objectArray[4] = "q\\k\nm6g\\nP~!p\u0017mVr5aPzA9']";
        objectArray[5] = "wH\r\u0002)b\u0002h\u0006\r8-\u007fp\u0015\n1d\u0017";
        objectArray[6] = "\u0019C\bf&p\u0019C\u001f:*\u007f\u0003\b\u001f$*j\u0004yOy{";
        objectArray[7] = Double.TYPE;
        c7.i[7] = "java/lang/Double";
        objectArray[8] = "-fI*T3-f^vX<7-^hX)0\\\u000f7\nb";
        objectArray[9] = Integer.TYPE;
        c7.i[9] = "java/lang/Integer";
        objectArray[10] = "F\u000bB$G^F\u000bUxKQ\\@UfKD[1\u00049\u0013";
        objectArray[11] = "G_9*\"\u000bG_.v.\u0004]\u0014.h.\u0011Ze\u007f7w";
        objectArray[12] = "7g! \u0006R7g6|\n]-,6b\nH*]d8\\\u000e";
        objectArray[13] = "Ugj\n\u001c\u007fUg}V\u0010pO,}H\u0010eH]/\u0016H!";
        objectArray[14] = "<3_\u001fQI\";EP\u0019I81]\u0017\u0010Rx\u0002[\u001b\u001bU53]\u001b";
        objectArray[15] = "V17\u001dAOV1 AM@Lz _MUK\u000bp\n\u001a\u0010";
        objectArray[16] = Float.TYPE;
        c7.i[16] = "java/lang/Float";
        objectArray[17] = "L\u0005K<\u000eYZ\u0005Nf\u001dNMNM`\u0011Z\\\tZwZJ\u0010";
        objectArray[18] = "ZZ/\u0007o\u0006/z$\b~INt/\u0003z\u0013:";
        objectArray[19] = "mRx\u0006\f\\\u0018rs\t\u001d\u0013y|x\u0002\u0019I\r";
        objectArray[20] = Boolean.TYPE;
        c7.i[20] = "java/lang/Boolean";
        objectArray[21] = "}Ow>4\u0018v@fqW\u0015cF";
        objectArray[22] = "6b\u0006c\u0014\u000e6b\u0011?\u0018\u0001,)\u0011!\u0018\u0014+XD~A";
        objectArray[23] = "6^o\u0017E\r6^xKI\u0002,\u0015xUI\u0017+d(\u0000\u001d]";
        objectArray[24] = "\u001bN\u00199\u0001\u000e\u001bN\u000ee\r\u0001\u0001\u0005\u000e{\r\u0014\u0006t^.ZR";
        objectArray[25] = "=|7\u0007\u0005c=| [\tl'7 E\ty Fp\u0010]3wz/H\u001by\f+w\u001b";
        objectArray[26] = "5\u001d|&2\u000b5\u001dkz>\u0004/Vkd>\u0011(';1j[\u007f\u001bdi,\u0011\u0004K1>o";
        objectArray[27] = "J_\n(q\u0003AP\u001bg\u0010\rJ[\u001f=";
        objectArray[28] = "0i1*5b<bxH,[.\"\u007fs%$*3pH<+(i`78:'R";
        objectArray[29] = "P\u001c5\u0005~:\u000e\r6RA9\u0004\u001d/Y-\u000bRZr\u0001x\\S\f1O:b\u0003\u000ep\u0000A";
        objectArray[30] = "a\u0006c?$,k\ro&C(Z\f}5\"20St|;B";
        objectArray[31] = "#3uEab#bp\u0015\u0000q~`.GW& 7v+9be6uMgsfa";
        objectArray[32] = "Sb\\`\u0003\t\t>Mh2\u0006\u000f!@a^4_m\u001e=2\u000e\u000b0]`R[\u000e<\u001d\u0006";
        objectArray[33] = ")l)EEHynh\n>\u0013~}7SR!*9m\t>L~\u007f&O\u0000\u001c|>i4\u0003L*bhWFFwmW";
        objectArray[34] = "\u0003IP \u0014r\u0003\u0018Upua^\u001a\u000b\"\"6\u0001GPN\u001bkU\u0013\bv\bbTI";
        objectArray[35] = "#\u001eI\n#\u0018}\u000fJ]\u001c\u001bw\u001fSVp)'S\b\u000f\u001c\u0014x\u0007\t\u000fe\u0010%\u001eI1&\u0013d\u0012H\u000fv\u0011%]3";
        objectArray[36] = "inX\u00078m9l\u0019HC6>\u007fF\u0011/\u0004j;\u001cNCi>}W\r}9<<\u0018vy>-r]H)<l=&";
        objectArray[37] = "\u0007\b}h\u0015\"^\u0016ag\u007f<U\u0013oa\u0013\u000e\u0001_?>CY\u0002\u0002qw\u0004gR\u000008\u007ff_\u001dal\u0004?A\u0001n\u0006";
        objectArray[38] = "\u0012\n\u0007\\1\r\u000b\u0001]B\t\u000e\u0012\u000b_J^YL[\u0006\u0016\t\u0001\u001fZA\u001ed\u0018\u0014\u0000_";
        objectArray[39] = "hyWA\u000b(8{\u0016\u000epx3yM\\'/i)\u00100M,kw\u0016S\b&6x";
        objectArray[40] = "Y{\fSJD\u0007j\u000f\u0004uG\rz\u0016\u000f\u0019u]6LYu\u001d\u0007t\u0018\u0002\u000eD\u0019h\u0017h";
        objectArray[41] = "\f\u001e9Y\tyH\u00171\u0004xz_[!]\u0014H\u000b\u001f{\u0004@\u001f\fL%U\u0018&\u0002W1[x";
        objectArray[42] = "\u0018JZi?L\u000bC[3X\u0011\u001bRPj4#O\u0011\u000f1bt\u0019L\u000fb#L\u0013E@aX\u001b\fMH4#J\u0013\u0012U\r";
        objectArray[43] = "=\u0015\u001cuuDm\u0017]:\u000e\u0014f\u0015\u0006hYC<EZ\u00043@>\u001b]gvJc\u0014";
        objectArray[44] = "\u00021\"t$\u000b\u000f;zu@\\\u0003.| \u0017\u000bY\u007f(L @X{|u-J\u0000z";
        objectArray[45] = "h\\K[\u0000M,UC\u0006qN;\u0019S_\u001d|o]\t\u0006J+h\u000eWW\u0011\u0012f\u0015CYq";
        objectArray[46] = "&)\u001bz!M u\u0019o^\u0019t9\u001de2+ zB2b|#(\u0003s%Bs*B<^";
        objectArray[47] = "b\f&T\u001cC;\u0012:[v]0\u00174]\u001aodSl\u000bv\u0005gR7\u0005\u0015@m\u000f8:K\u0002d\bkY\u000e\b9\u0007T\u0007L\u0001>T7BF\\1kk]\u0004V7\u00102C\u0018Y]";
        objectArray[48] = "`Ox|b\u00060M93\u0019]7^fjuoc\u001a<4%8g\u0018?n&[\"\u0012ba\u0019";
        objectArray[49] = "\b\u001bO\u0003i\\RG^\u000bXSTXS\u00024a\u0006\u001f\tXX[PIN\u00038\u000eUE\u000ee";
        objectArray[50] = "x\u0017\u001a1&L'\u0013\u00076\u001dL%\u000b\u0015,q~qGMt )yH\t-,C#\u0014\u0018%\u001d\u0013%\t\u00040#C'HKK'D6\u0006\u000euwFwIutz[&\u001d\u000e-dG)w\u001c `\u0018.\u0016E%yLHJOr~\u0016+\u000fE/q)!\u0005D1 I4\bNt\u001d";
        objectArray[51] = "4\u001fz:AC7[`px@ \u001cvAE\u0001`\u00055\"\u0000\u000b=\n\n|B\u0002:Yi9H_5f";
        objectArray[52] = "\u001f1I6t7O3\by\u000flH W c^\u001cd\r}\u000f3H\"F<1cJc\tG23\u001c?\b$w9A07";
        objectArray[53] = "ID{6fG\u0019F:y\u001d\u0017\u0012Da+J@H\u0014?G CJJ:$eI\u0017E";
        objectArray[54] = "WDD`\u0011\u0000\u0013ML=`\u0003\u0004\u0001\\d\f1PE\u0006=\\fW\u0016Xl\u0000_Y\rLb`";
        objectArray[55] = "(\u0002o\\\\] \u0019{\u0003%\fB\u0015b\\T\u0000,\u0018yFLfx\u0014aL^X(\u0016 \u0003%";
        Object[] objectArray2 = objectArray;
        objectArray[56] = "\u00036!Cw<\u000f=h!n\u0005\bpqPak\u0005kkH\u0007:\bkh^6<Ti}!";
    }

    private static Field g(long l, long l2) {
        int n = c7.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = c7.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c7.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c7.c(clazz3, string2, clazz2)) != null) {
                    c7.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c7.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c7.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c7.f(1918941468586999L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean lambda$interact$0(class_1297 class_12972) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = d ^ 0x3D63C889D49EL;
                    callSite = c7.b("\u00c9", (long)-6719227002761420995L, (long)l);
                    try {
                        try {
                            object = c7.b("V", (Object)class_12972, (long)-6716153923515276490L, (long)l);
                            if (callSite != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw c7.b("\u00c9", (Object)matchException, (long)-6719346766954707565L, (long)l);
                        }
                        object = c7.b("V", (Object)class_12972, (long)-6715138296182848185L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw c7.b("\u00c9", (Object)matchException, (long)-6719346766954707565L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw c7.b("\u00c9", (Object)matchException, (long)-6719346766954707565L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$interact$1(class_1297 class_12972) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = d ^ 0xC059119499L;
                    callSite = c7.b("\u00c9", (long)-2105504261727510726L, (long)l);
                    try {
                        try {
                            object = c7.b("V", (Object)class_12972, (long)-2104218739244342479L, (long)l);
                            if (callSite != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw c7.b("\u00c9", (Object)matchException, (long)-2105670231163239020L, (long)l);
                        }
                        object = c7.b("V", (Object)class_12972, (long)-2105374621070129856L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw c7.b("\u00c9", (Object)matchException, (long)-2105670231163239020L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw c7.b("\u00c9", (Object)matchException, (long)-2105670231163239020L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$interactTopFace$2(class_1297 class_12972) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = d ^ 0x77CEDF71A0F9L;
                    callSite = c7.b("\u00c9", (long)-2979192687488849062L, (long)l);
                    try {
                        try {
                            object = c7.b("V", (Object)class_12972, (long)-2977962123335903407L, (long)l);
                            if (callSite != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw c7.b("\u00c9", (Object)matchException, (long)-2979308062016884236L, (long)l);
                        }
                        object = c7.b("V", (Object)class_12972, (long)-2979056518489558752L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw c7.b("\u00c9", (Object)matchException, (long)-2979308062016884236L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw c7.b("\u00c9", (Object)matchException, (long)-2979308062016884236L, (long)l);
                }
                object = 1;
                break block8;
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
            return MethodHandles.lookup().findStatic(c7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(c7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


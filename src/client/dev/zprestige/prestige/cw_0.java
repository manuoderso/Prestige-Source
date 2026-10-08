/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a_;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.be_0;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.cz_0;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.cw
 */
public class cw_0
implements cz_0 {
    private static Double a;
    private static final Map c;
    private long d;
    private static final long e;
    private static final long[] f;
    private static final Long[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    public cw_0(long l) {
        long l2 = (l = e ^ l) ^ 0x3FCBDEC90BF0L;
        this.d = (long)cw_0.a("p", (int)9463, (long)(0x9383F30D39BC7A9L ^ l));
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)-4397102764572656296L, (long)l), (Object)objectArray, (long)-4402646697809748736L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        cw_0.e = hc.a(-9090662435298823354L, 3078024303056758466L, MethodHandles.lookup().lookupClass()).a(164008043629145L);
                        var22 = cw_0.e ^ 36946756628773L;
                        cw_0.i = new Object[85];
                        cw_0.j = new String[85];
                        cw_0.a();
                        var12_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var22 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var22 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new long[5];
                        var15_4 = 0;
                        var16_5 = "\u00df\u00fa\u00f75T\u0092\u00ef\u00c8\u00fd3\u00e2\u0090d\u00f9\u0092\u00e3N\u00cf#9\u0084\u00b5\u009fn";
                        var17_6 = "\u00df\u00fa\u00f75T\u0092\u00ef\u00c8\u00fd3\u00e2\u0090d\u00f9\u0092\u00e3N\u00cf#9\u0084\u00b5\u009fn".length();
                        var14_7 = 0;
                        while (true) {
                            var18_8 = var16_5.substring(var14_7, var14_7 += 8).getBytes("ISO-8859-1");
                            v3 = var11_3;
                            v4 = var15_4++;
                            v5 = ((long)var18_8[0] & 255L) << 56 | ((long)var18_8[1] & 255L) << 48 | ((long)var18_8[2] & 255L) << 40 | ((long)var18_8[3] & 255L) << 32 | ((long)var18_8[4] & 255L) << 24 | ((long)var18_8[5] & 255L) << 16 | ((long)var18_8[6] & 255L) << 8 | (long)var18_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var14_7 < var17_6) ** continue;
                            var16_5 = "Sc\u00de\u00ed\u00e7\u00ab\u00db\u00a3\u0086G\u00ba\u001c\u00a2+\u0099\u00c5";
                            var17_6 = "Sc\u00de\u00ed\u00e7\u00ab\u00db\u00a3\u0086G\u00ba\u001c\u00a2+\u0099\u00c5".length();
                            var14_7 = 0;
                            while (true) {
                                var18_8 = var16_5.substring(var14_7, var14_7 += 8).getBytes("ISO-8859-1");
                                v3 = var11_3;
                                v4 = var15_4++;
                                v5 = ((long)var18_8[0] & 255L) << 56 | ((long)var18_8[1] & 255L) << 48 | ((long)var18_8[2] & 255L) << 40 | ((long)var18_8[3] & 255L) << 32 | ((long)var18_8[4] & 255L) << 24 | ((long)var18_8[5] & 255L) << 16 | ((long)var18_8[6] & 255L) << 8 | (long)var18_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl59:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var14_7 < var17_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var19_9 = v5;
                    var21_10 = var12_1.doFinal(new byte[]{(byte)(var19_9 >>> 56), (byte)(var19_9 >>> 48), (byte)(var19_9 >>> 40), (byte)(var19_9 >>> 32), (byte)(var19_9 >>> 24), (byte)(var19_9 >>> 16), (byte)(var19_9 >>> 8), (byte)var19_9});
                    v7 = ((long)var21_10[0] & 255L) << 56 | ((long)var21_10[1] & 255L) << 48 | ((long)var21_10[2] & 255L) << 40 | ((long)var21_10[3] & 255L) << 32 | ((long)var21_10[4] & 255L) << 24 | ((long)var21_10[5] & 255L) << 16 | ((long)var21_10[6] & 255L) << 8 | (long)var21_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl72:
                        // 1 sources

                        ** continue;
                    }
                }
                cw_0.h = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var22 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var22 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u00b8G\u009a\u009cYz\u00a0?\u00bcD\u000e\u00ee\u00a9\u0098\u00fd\u0089";
                var5_16 = "\u00b8G\u009a\u009cYz\u00a0?\u00bcD\u000e\u00ee\u00a9\u0098\u00fd\u0089".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl101:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        cw_0.f = var6_13;
        cw_0.g = new Long[2];
        cw_0.a = null;
        cw_0.c = cw_0.b("q", (Object)cw_0.b("q", (int)((int)var11_3[1]), (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)0, (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)((int)var11_3[3]), (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)1, (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)((int)var11_3[2]), (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)2, (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)((int)var11_3[4]), (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)3, (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)((int)var11_3[0]), (long)3689580076496119003L, (long)var22), (Object)cw_0.b("q", (int)4, (long)3689580076496119003L, (long)var22), (long)3686405693723027157L, (long)var22);
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
            case 0 -> 18;
            case 1 -> 61;
            case 2 -> 4;
            case 3 -> 5;
            case 4 -> 60;
            case 5 -> 32;
            case 6 -> 7;
            case 7 -> 44;
            case 8 -> 38;
            case 9 -> 57;
            case 10 -> 12;
            case 11 -> 51;
            case 12 -> 2;
            case 13 -> 15;
            case 14 -> 25;
            case 15 -> 56;
            case 16 -> 45;
            case 17 -> 49;
            case 18 -> 35;
            case 19 -> 1;
            case 20 -> 40;
            case 21 -> 27;
            case 22 -> 26;
            case 23 -> 16;
            case 24 -> 63;
            case 25 -> 3;
            case 26 -> 22;
            case 27 -> 62;
            case 28 -> 37;
            case 29 -> 30;
            case 30 -> 55;
            case 31 -> 59;
            case 32 -> 33;
            case 33 -> 36;
            case 34 -> 48;
            case 35 -> 34;
            case 36 -> 13;
            case 37 -> 31;
            case 38 -> 29;
            case 39 -> 6;
            case 40 -> 14;
            case 41 -> 46;
            case 42 -> 19;
            case 43 -> 28;
            case 44 -> 20;
            case 45 -> 11;
            case 46 -> 24;
            case 47 -> 21;
            case 48 -> 17;
            case 49 -> 39;
            case 50 -> 8;
            case 51 -> 41;
            case 52 -> 23;
            case 53 -> 52;
            case 54 -> 0;
            case 55 -> 58;
            case 56 -> 54;
            case 57 -> 10;
            case 58 -> 43;
            case 59 -> 47;
            case 60 -> 42;
            case 61 -> 50;
            case 62 -> 9;
            default -> 53;
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
        cw_0.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00db' || c == '\u00f9' || c == '\u00c1' || c == 'b') {
                field = cw_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cw_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cw_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = cw_0.e(l, l2);
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
                clazz3 = cw_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cw_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cw_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        cw_0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cw_0.f(75846082699804L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cw_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cw_0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cw_0.f(75846082699804L, 0L);
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
            int n = cw_0.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                cw_0.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cw_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cw_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cw_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cw_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @bP
    public void a(bl_0 bl_02) {
        long l = e ^ 0x622E4EDBF84EL;
        CallSite callSite = cw_0.b("q", (long)4204879323177798445L, (long)l);
        if (cw_0.b("\u00db", (Object)b, (long)4206294850542968426L, (long)l) == null) {
            block13: {
                block14: {
                    CallSite callSite2;
                    block12: {
                        CallSite callSite3 = cw_0.b("q", (long)4198558237204893950L, (long)l);
                        try {
                            try {
                                try {
                                    reference cfr_temp_0 = callSite3 - this.d - cw_0.a("p", (int)9242, (long)(0x2AC791D0076E3FE2L ^ l));
                                    callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                    if (callSite != null) break block12;
                                    if (callSite2 < 0) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw cw_0.b("q", (Object)matchException, (long)4205683732109276187L, (long)l);
                                }
                                this.d = (long)callSite3;
                                if (callSite != null) break block14;
                            }
                            catch (MatchException matchException) {
                                throw cw_0.b("q", (Object)matchException, (long)4205683732109276187L, (long)l);
                            }
                            callSite2 = cw_0.b("q", (long)4198144725144280905L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw cw_0.b("q", (Object)matchException, (long)4205683732109276187L, (long)l);
                        }
                    }
                    try {
                        if (callSite2 == false) break block13;
                        cw_0.b("\u00c9", (Object)b, (Object)cw_0.b("\u00c1", (long)4198407642790931331L, (long)l), (long)4205261128687957850L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw cw_0.b("q", (Object)matchException, (long)4205683732109276187L, (long)l);
                    }
                }
                cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)4198407642790931331L, (long)l), (Object)new Object[0], (long)4198039128277082715L, (long)l);
            }
            try {
                if (a != null) {
                    cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)b, (long)4204889794152123625L, (long)l), (int)((int)cw_0.b("q", (double)cw_0.b("\u00c9", (Object)a, (long)4205412895353416999L, (long)l), (long)4197571181191618825L, (long)l)), (long)4205486629222260148L, (long)l);
                    a = null;
                }
            }
            catch (MatchException matchException) {
                throw cw_0.b("q", (Object)matchException, (long)4205683732109276187L, (long)l);
            }
        }
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "M2\u001ayr;S:\u00006\u0015:B!\rl3<";
        objectArray[1] = "\u0004bSr=\u0007\u000fmB=\\\t\u0004fFg";
        objectArray[2] = "3~\u001fxlb%~\u001a\"\u007fu25\u0019$sa#r\u000e38s\u001f";
        objectArray[3] = "r\u000fk1\u0016}\u0007/`>\u00072z7s9\u000e{\u0012";
        objectArray[4] = "<r\ba^\u001e*r\r;M\t=9\u000e=A\u001d,~\u0019*\n\n\u000e";
        objectArray[5] = " \u000425_]U$9:N\u00124*21JH@";
        objectArray[6] = Integer.TYPE;
        cw_0.j[6] = "java/lang/Integer";
        objectArray[7] = "t\bf\u00141nb\bcN\"yuC`H.md\u0004w_e}|\u0004uT?0@\u001fuI?ww\b";
        objectArray[8] = "^\u0000J(f\u0006H\u0000Oru\u0011_KLty\u0005N\f[c2\u0015p";
        objectArray[9] = "z<+?Z[l<.eIL{w-cEXj0:t\u000eI{";
        objectArray[10] = "?lb\u00166\u0015JLi\u0019'Z+Bb\u0012#\u0000_";
        objectArray[11] = "#o7\u0015I|VO<\u001aX37A7\u0011\\iC";
        objectArray[12] = "m\u001ey\u00179\u0007{\u001e|M*\u0010lU\u007fK&\u0004}\u0012h\\m\u0014~";
        objectArray[13] = "\u001alxU|<\u0011ci\u001a\u001f1\u0004nfq*3\u0015}z]=>";
        objectArray[14] = Boolean.TYPE;
        cw_0.j[14] = "java/lang/Boolean";
        objectArray[15] = ",~\u007f\u000f/u'qn@Hw2zn\u000bs";
        objectArray[16] = "e\u0019C/O;{\u0011Y`,/\u007f";
        objectArray[17] = ",\u0010G\u0007\u0013\n,\u0010P[\u001f\u00056[PE\u001f\u00101*\u0000\u0018N";
        objectArray[18] = "=x\"N5S=x5\u00129\\'35\f9I BbSo";
        objectArray[19] = "/ly\u001a>:1dcU\\&6y";
        objectArray[20] = "\tBk?+,|b`0:c\u001dlk;>9i";
        objectArray[21] = "\u001fQ:F^3\tQ?\u001cM$\u001e\u001a<\u001aA0\u000f]+\r\n'7";
        objectArray[22] = "\fo\u0004Tc\u0010yO\u000f[r_\u0018A\u0004Pv\u0005l";
        objectArray[23] = Void.TYPE;
        cw_0.j[23] = "java/lang/Void";
        objectArray[24] = ".u\u0000I \n8u\u0005\u00133\u001d/>\u0006\u0015?\t>y\u0011\u0002t\u0019\u0007";
        objectArray[25] = "y\u0002@2X`\f\"K=I/m,@6Mu\u0019";
        objectArray[26] = "\u0010jS:O#\u0006jV`\\4\u0011!UfP \u0000fBq\u001b0\f";
        objectArray[27] = "*4bz\f%_\u0014iu\u001dj>\u001ab~\u00190J";
        objectArray[28] = "R\u0007cs\u001a\u000fD\u0007f)\t\u0018SLe/\u0005\fB\u000br8N\u0018\u000f";
        objectArray[29] = "L1]>j\u000e9\u0011V1{AX\u001f]:\u007f\u001b,";
        objectArray[30] = "YX\\_(:OXY\u0005;-X\u0013Z\u000379ITM\u0014|/b";
        objectArray[31] = "~h}B'\u0016\u000bHvM6YjF}F2\u0003\u001e";
        objectArray[32] = "4,B\u001faiA\fI\u0010p& \u0002B\u001bt|T";
        objectArray[33] = "{B+})YmB.':Nz\t-!6ZkN:6}MT";
        objectArray[34] = "-CVX\u001bq;CS\u0002\bf,\bP\u0004\u0004r=OG\u0013O`\u0016";
        objectArray[35] = "j\u0016\u001e\u0001'\t\u001f6\u0015\u000e6F~8\u001e\u00052\u001c\n";
        objectArray[36] = "J2nI\u001fW?\u0012eF\u000e\u0018^\u001cnM\nB*";
        objectArray[37] = "6bJ7]\u0016 bOmN\u00017)LkB\u0015&n[|\t\u0004\u001d";
        objectArray[38] = "d&\u0013d\u0013+\u0011\u0006\u0018k\u0002dp\b\u0013`\u0006>\u0004";
        objectArray[39] = "EbSg\nkEbD;\u0006d_)D%\u0006qXX\u0016yS3";
        objectArray[40] = "\u0000\u0015\nTi0\u000b\u001a\u001b\u001b\n=\u001e\u001c";
        objectArray[41] = Double.TYPE;
        cw_0.j[41] = "java/lang/Double";
        objectArray[42] = Long.TYPE;
        cw_0.j[42] = "java/lang/Long";
        objectArray[43] = "d>\u0001\u001981o1\u0010VR2{=\u001b\u001d";
        objectArray[44] = "L\"\u0017h{yZ\"\u00122hnMi\u00114dz\\.\u0006#/GI3\b0d";
        objectArray[45] = ">RP\")+5]AmT>'GC.";
        objectArray[46] = "wr\u001at\rAm3\u001c!j@ppB-\u0006r'6\u001czQ%g0@(RB{7\u001e#j";
        objectArray[47] = "xK\u0015Mo\u0006-J\u0013\u001cR\u0016A\u0015@A-\u0012=I\u0014Z9|";
        objectArray[48] = "l:\u0003N]}7(\u000b\u0019e~Q,\u0003N\u001et)d\u0019D\u001f";
        objectArray[49] = ",GS)}PwU[~EU\u0011\u0014W&$\u0001kXM<>";
        objectArray[50] = ":o'!X98q/;6*\u0004i(\"\t~m}$(W@8i$*X9x-/%6";
        objectArray[51] = "k\u0001\rzc)d\u0002\t/\u001a![MVu}*%CM+hHj\u0019Pqx6d\u0002\u000ed\u001a";
        objectArray[52] = "y! \u001b\u001c!}#6\u001bu9Brh\u0003M0<k8\u0004HP";
        objectArray[53] = "\u0004]9Gxd\u001e\u001c?\u0012\u001fe\u0003_a\u001esWW\u001e9F\u001fk\u0017\u001dh\u0013{m\u0011\u0012eyp8\u0005Yb\u0005\u007fm\u0001\u0012\u0001";
        objectArray[54] = "K\u001e\u0013\u000br7W\u0019M\u0000J5\\^\u0011\u000e&\u0007\b\u001f@XuP\r[\u0003\u0005$)M\u001f\b\nJ?\tI\u000b\n60\\M@i";
        objectArray[55] = "d.p`f&f.7&\u001f;~me}r\tptrt\u001f,})c$d6)ud\u0019";
        objectArray[56] = "\be\t)I>\f:W$($\bg\u001a5o4a?\u001e*D4\u0018\u007fZ!KZ\be\t)I>\f:W$(";
        objectArray[57] = "B\u0003\b\u0010\u000fYPZPKc\u000bE\u001d0\f\u001d\u001a\u0017\u0003[\u0013\u001aX(\u0018N\u000b\\\u0006C\u0007IIc";
        objectArray[58] = "-NHB[K7\u000fN\u0017<A&]\u0014\u0010k\u0016x\rM|WVyY\u001a\u0018QPvT";
        objectArray[59] = "=Z\"C\u001ef|Zm<\u00023wlpL\u001eZe\u001b|\u0004\u0002$|K{\u0001b";
        objectArray[60] = "\rZVY#\u0007\tX@YJ\u001f6\u0019QDuH_\r]N+vYXDZ)\nV\r@\u0011J";
        objectArray[61] = "2~Y\"BQ '\u0001y.\u0007?z\u001d.O\n#_\f6.\u0015&b^%E\n! a.\u001f\r`|\u001f7O\ne\u001c";
        objectArray[62] = "KN u\u00175DCb7ec$Ef*Z4MQj \u0004\nM\ryv\u0005tT]~se";
        objectArray[63] = "tqL\u007f.yl.DuUp\u00107Tzj%y#Xp4\u001b}-@/4ys,\u0017uU";
        objectArray[64] = "-^x\r+R%Aq\u0019ZUKYw\u000fe\u0002\"M{\u0005;<wY{\u00074E7\u001dp\bZ";
        objectArray[65] = "\u0017\u0016[\u0017R4\u001f\tR\u0003#0q\u0011T\u0015\u001cd\u0018\u0005X\u001fBZM\u0011X\u001dM#\rUS\u0012#";
        objectArray[66] = "\"\u0012#L\u0011\tc\u0012l3\u000bXc\u001e\u001cJ\u0013K,\u0000wU\u0014\t\u0013";
        objectArray[67] = "\u000bs\ru}<Ci\u0007t\u001d-sm\u001cj\"z\u001ay\u0010`|D\u001c,\tt~8\u0013y\r?\u001d";
        objectArray[68] = "T\u001fBG\u0003\u000bP\u001dTGj\u0010o\\EZUD\u0006HIP\u000bzS\\IR\u0004\u0003\u0013\u0018B]j";
        objectArray[69] = "\u0001vZEna\u0003hR_\u0000q?pUF?&VdYLa\u0018\u0003pYNnaC4RA\u0000";
        objectArray[70] = "nxt\u0019\u001e4d**\u001a#?ror\u0014#>q+xEX$%w\u007fx_'one\u001fG({}\u0014";
        objectArray[71] = "\u0011\u0015X\u0017_@\u0015J\u0006\u001a>E\u001e\u000fh\u000fZY\u0015s\n\u001fLH\u0016\nJ[GGx";
        objectArray[72] = "%KfS\nuiQ|I2f\u0018D~@IfwLcQ\u0003\u000f";
        objectArray[73] = "$\u0004@T~H)S\u0012N\u0005CEA\u0005P:\u0014,U\tZd*yA\tXkS9\u0005\u0002W\u0005";
        objectArray[74] = "\u0007q\u0001imx\u0015(Y2\u0001\"\u0003\u0013@r\u007fz\u000fx_u=E\u0014mG3c.\u000bj\u0005\fx;\u0013,[gg<Q\u0013@r\u007fz\u000fx_u=E\u0014mG3c.\u000bj\u0005\fx;\u0013,[gg<Q\u0013@r\u007fz\u000fx_u=E\u0014mG3c.\u000bj\u0005\fx;\u0013,[gg<Q\u0013@r\u007fz\u000fx_u=E\u0007q\u0001imx\u0015(Y2\u0001";
        objectArray[75] = "Sxu2JH\bj}erBntp!\t\u001bSq#1\r";
        objectArray[76] = "\"X,v6k'\u000b<r\f?@C.i3h)W\"cmV/\u0002;wo* W?<\f";
        objectArray[77] = "u\u000fT2E\u000bq\rB2,\u0010NLS/\u0013D'X_%Mz#VGzM\u0018-W\u0010 ,";
        objectArray[78] = "+&w\u0014\\36j5I=iV?<L\u0005k(&lK\u0000\u000b";
        objectArray[79] = "<(q?Oyp2k%wj\u00012o:H=h&c0\u0016\u0003etw?\fa}+\u007f5w";
        objectArray[80] = "amWIm\u0010:\u007f_\u001eU\u0000\\lB\u001en\u000bccO\\,";
        objectArray[81] = "t\u000f\u001bWsAr\u0003\u0005\\IP\u0012\u001c\tPv[y\u0003\u000e\u0012I";
        objectArray[82] = "G]'\n[xO@6@2vWH/\u0018NpQ%d\u0001\rhW\u0019%\u0001B\u0017";
        objectArray[83] = "EP<\u0014|\rKQkN\u001d\u0005(ZgD%\u000fVC7C o";
        Object[] objectArray2 = objectArray;
        objectArray[84] = "\u0017+ys#Y\u0003)$uNC\u0014:=\u007f(T5!\"\u007f\u000bI\r$&iNT\u000b:;c)L\u0004.(\u0012";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(a_ var1_1) {
        block54: {
            block53: {
                v0 = var2_2 = cw_0.e ^ 67209201269918L;
                var4_3 = v0 ^ 77361924909357L;
                var6_4 = v0 ^ 40845407047423L;
                var8_5 = v0 ^ 30691900371818L;
                var10_6 = cw_0.b("q", (long)-105020431350689795L, (long)var2_2);
                try {
                    try {
                        v1 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103175161877781661L, (long)var2_2);
                        if (var10_6 != null) break block53;
                        if (v1 != false) break block54;
                    }
                    catch (MatchException v2) {
                        throw cw_0.b("q", (Object)v2, (long)-104207192562208565L, (long)var2_2);
                    }
                    v1 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103265369988672200L, (long)var2_2);
                }
                catch (MatchException v3) {
                    throw cw_0.b("q", (Object)v3, (long)-104207192562208565L, (long)var2_2);
                }
            }
            try {
                v4 = new Object[2];
                v4[1] = var8_5;
                v4[0] = (int)cw_0.b("\u00c9", (Object)((Integer)cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)-104338884216636691L, (long)var2_2), (Object)new Object[0], (long)-102766407991395054L, (long)var2_2), (Object)new Object[0], (long)-103902866729337540L, (long)var2_2), (long)-102096854844648122L, (long)var2_2)), (long)-103348338155445964L, (long)var2_2);
                if (v1 == cw_0.b("q", (Object)v4, (long)-102618354560687154L, (long)var2_2)) {
                    cw_0.b("\u00c9", (Object)cw_0.b, (Object)cw_0.b("\u00c1", (long)-102489259057057965L, (long)var2_2), (long)-104627631319747702L, (long)var2_2);
                    cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)-102489259057057965L, (long)var2_2), (Object)new Object[0], (long)-102965594958092661L, (long)var2_2);
                }
            }
            catch (MatchException v5) {
                throw cw_0.b("q", (Object)v5, (long)-104207192562208565L, (long)var2_2);
            }
        }
        var11_7 = cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)-104338884216636691L, (long)var2_2), (long)-102704962342166392L, (long)var2_2), (long)-102026674599569357L, (long)var2_2);
        while (cw_0.b("\u00c9", (Object)var11_7, (long)-103610755906222117L, (long)var2_2) != false) {
            block60: {
                block63: {
                    block62: {
                        block61: {
                            block58: {
                                block59: {
                                    block56: {
                                        block57: {
                                            block55: {
                                                var12_8 = (dV)cw_0.b("\u00c9", (Object)var11_7, (long)-103099883177246757L, (long)var2_2);
                                                v6 = new Object[1];
                                                v6[0] = var6_4;
                                                v7 = new Object[2];
                                                v7[1] = var8_5;
                                                v7[0] = (int)cw_0.b("\u00c9", (Object)var12_8, (Object)v6, (long)-103512503264251473L, (long)var2_2);
                                                var13_9 = cw_0.b("q", (Object)v7, (long)-102618354560687154L, (long)var2_2);
                                                try {
                                                    try {
                                                        v8 = cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)var12_8, (Object)new Object[0], (long)-102896389245688701L, (long)var2_2), (long)-101963704700707689L, (long)var2_2);
                                                        if (var10_6 != null) break block55;
                                                        if (v8 != false) {
                                                        }
                                                        ** GOTO lbl148
                                                    }
                                                    catch (MatchException v9) {
                                                        throw cw_0.b("q", (Object)v9, (long)-104207192562208565L, (long)var2_2);
                                                    }
                                                    v8 = cw_0.b("\u00c9", (Object)var12_8, (long)-104650992544400162L, (long)var2_2);
                                                }
                                                catch (MatchException v10) {
                                                    throw cw_0.b("q", (Object)v10, (long)-104207192562208565L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var10_6 != null) break block56;
                                                        if (v8 == false) break block57;
                                                    }
                                                    catch (MatchException v11) {
                                                        throw cw_0.b("q", (Object)v11, (long)-104207192562208565L, (long)var2_2);
                                                    }
                                                    if (cw_0.b("\u00db", (Object)cw_0.b, (long)-103690614949684550L, (long)var2_2) == null) break block57;
                                                }
                                                catch (MatchException v12) {
                                                    throw cw_0.b("q", (Object)v12, (long)-104207192562208565L, (long)var2_2);
                                                }
                                                v13 = new Object[1];
                                                v13[0] = var4_3;
                                                cw_0.b("\u00c9", (Object)var12_8, (Object)v13, (long)-104109537133814526L, (long)var2_2);
                                                if (var10_6 == null) continue;
                                            }
                                            catch (MatchException v14) {
                                                throw cw_0.b("q", (Object)v14, (long)-104207192562208565L, (long)var2_2);
                                            }
                                        }
                                        v8 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103175161877781661L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var10_6 != null) break block58;
                                                if (v8 == false) {
                                                }
                                                ** GOTO lbl111
                                            }
                                            catch (MatchException v15) {
                                                throw cw_0.b("q", (Object)v15, (long)-104207192562208565L, (long)var2_2);
                                            }
                                            v16 = cw_0.b("\u00c9", (Object)var12_8, (long)-104650992544400162L, (long)var2_2);
                                            if (var10_6 != null) break block59;
                                        }
                                        catch (MatchException v17) {
                                            throw cw_0.b("q", (Object)v17, (long)-104207192562208565L, (long)var2_2);
                                        }
                                        if (v16 == false) break block60;
                                    }
                                    catch (MatchException v18) {
                                        throw cw_0.b("q", (Object)v18, (long)-104207192562208565L, (long)var2_2);
                                    }
                                    v16 = var13_9;
                                }
                                try {
                                    try {
                                        if (v16 != cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103265369988672200L, (long)var2_2)) break block60;
                                        v19 = new Object[1];
                                        v19[0] = var4_3;
                                        cw_0.b("\u00c9", (Object)var12_8, (Object)v19, (long)-104109537133814526L, (long)var2_2);
                                        if (var10_6 == null) break block60;
                                    }
                                    catch (MatchException v20) {
                                        throw cw_0.b("q", (Object)v20, (long)-104207192562208565L, (long)var2_2);
                                    }
lbl111:
                                    // 2 sources

                                    v8 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103175161877781661L, (long)var2_2);
                                }
                                catch (MatchException v21) {
                                    throw cw_0.b("q", (Object)v21, (long)-104207192562208565L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (v8 != 1 || cw_0.b("\u00db", (Object)cw_0.b, (long)-103690614949684550L, (long)var2_2) != null) break block60;
                                    }
                                    catch (MatchException v22) {
                                        throw cw_0.b("q", (Object)v22, (long)-104207192562208565L, (long)var2_2);
                                    }
                                    v23 = cw_0.b("\u00c9", (Object)var12_8, (long)-104650992544400162L, (long)var2_2);
                                    if (var10_6 != null) break block61;
                                }
                                catch (MatchException v24) {
                                    throw cw_0.b("q", (Object)v24, (long)-104207192562208565L, (long)var2_2);
                                }
                                if (v23 != false) break block60;
                            }
                            catch (MatchException v25) {
                                throw cw_0.b("q", (Object)v25, (long)-104207192562208565L, (long)var2_2);
                            }
                            v23 = var13_9;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (v23 != cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103265369988672200L, (long)var2_2)) break block60;
                                            v26 = new Object[1];
                                            v26[0] = var4_3;
                                            cw_0.b("\u00c9", (Object)var12_8, (Object)v26, (long)-104109537133814526L, (long)var2_2);
                                            if (var10_6 == null) break block60;
                                        }
                                        catch (MatchException v27) {
                                            throw cw_0.b("q", (Object)v27, (long)-104207192562208565L, (long)var2_2);
                                        }
lbl148:
                                        // 2 sources

                                        if (cw_0.b("\u00db", (Object)cw_0.b, (long)-103690614949684550L, (long)var2_2) != null) break block60;
                                    }
                                    catch (MatchException v28) {
                                        throw cw_0.b("q", (Object)v28, (long)-104207192562208565L, (long)var2_2);
                                    }
                                    v29 = new Object[1];
                                    v29[0] = var6_4;
                                    v30 = cw_0.b("\u00c9", (Object)var12_8, (Object)v29, (long)-103512503264251473L, (long)var2_2);
                                    v31 /* !! */  = -1;
                                    if (var10_6 != null) break block62;
                                }
                                catch (MatchException v32) {
                                    throw cw_0.b("q", (Object)v32, (long)-104207192562208565L, (long)var2_2);
                                }
                                if (v30 == v31 /* !! */ ) break block60;
                            }
                            catch (MatchException v33) {
                                throw cw_0.b("q", (Object)v33, (long)-104207192562208565L, (long)var2_2);
                            }
                            v30 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103175161877781661L, (long)var2_2);
                            v31 /* !! */  = 1;
                        }
                        catch (MatchException v34) {
                            throw cw_0.b("q", (Object)v34, (long)-104207192562208565L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            if (var10_6 != null) break block63;
                            if (v30 != v31 /* !! */ ) break block60;
                        }
                        catch (MatchException v35) {
                            throw cw_0.b("q", (Object)v35, (long)-104207192562208565L, (long)var2_2);
                        }
                        v30 = var13_9;
                        v31 /* !! */  = (int)cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)-103265369988672200L, (long)var2_2);
                    }
                    catch (MatchException v36) {
                        throw cw_0.b("q", (Object)v36, (long)-104207192562208565L, (long)var2_2);
                    }
                }
                try {
                    if (v30 == v31 /* !! */ ) {
                        v37 = new Object[1];
                        v37[0] = var4_3;
                        cw_0.b("\u00c9", (Object)var12_8, (Object)v37, (long)-104109537133814526L, (long)var2_2);
                    }
                }
                catch (MatchException v38) {
                    throw cw_0.b("q", (Object)v38, (long)-104207192562208565L, (long)var2_2);
                }
            }
            if (var10_6 == null) continue;
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = cw_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(be_0 var1_1) {
        v0 = var2_2 = cw_0.e ^ 49231488926430L;
        var4_3 = v0 ^ 96460669736813L;
        var6_4 = v0 ^ 58002627604671L;
        var8_5 = v0 ^ 83189664424825L;
        var10_6 = cw_0.b("q", (long)57128011141935549L, (long)var2_2);
        try {
            v1 = new Object[2];
            v1[1] = var8_5;
            v1[0] = (int)cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)58646597878236498L, (long)var2_2);
            if (cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)59976246667555900L, (long)var2_2), (Object)v1, (long)58143619604972639L, (long)var2_2) != false) {
                return;
            }
        }
        catch (MatchException v2) {
            throw cw_0.b("q", (Object)v2, (long)57942040367861387L, (long)var2_2);
        }
        var11_7 = cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)cw_0.b("\u00c1", (long)57774597280908461L, (long)var2_2), (long)59408293773516488L, (long)var2_2), (long)60119790070081139L, (long)var2_2);
        while (cw_0.b("\u00c9", (Object)var11_7, (long)58537413986040219L, (long)var2_2) != false) {
            block48: {
                block55: {
                    block54: {
                        block52: {
                            block51: {
                                block50: {
                                    block49: {
                                        block47: {
                                            var12_8 = (dV)cw_0.b("\u00c9", (Object)var11_7, (long)59011704212423067L, (long)var2_2);
                                            try {
                                                try {
                                                    v3 = new Object[1];
                                                    v3[0] = var6_4;
                                                    v4 = cw_0.b("\u00c9", (Object)var12_8, (Object)v3, (long)58597424111194095L, (long)var2_2);
                                                    if (var10_6 != null) break block47;
                                                    if (v4 == -1) break block48;
                                                }
                                                catch (MatchException v5) {
                                                    throw cw_0.b("q", (Object)v5, (long)57942040367861387L, (long)var2_2);
                                                }
                                                v6 = new Object[1];
                                                v6[0] = var6_4;
                                                v4 = cw_0.b("\u00c9", (Object)cw_0.c, (Object)cw_0.b("q", (int)cw_0.b("\u00c9", (Object)var12_8, (Object)v6, (long)58597424111194095L, (long)var2_2), (long)58275030207682336L, (long)var2_2), (long)58111998780941382L, (long)var2_2);
                                            }
                                            catch (MatchException v7) {
                                                throw cw_0.b("q", (Object)v7, (long)57942040367861387L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var10_6 != null) break block49;
                                                if (v4 == false) break block48;
                                            }
                                            catch (MatchException v8) {
                                                throw cw_0.b("q", (Object)v8, (long)57942040367861387L, (long)var2_2);
                                            }
                                            v9 = new Object[1];
                                            v9[0] = var6_4;
                                            v4 = cw_0.b("\u00c9", (Object)((Integer)cw_0.b("\u00c9", (Object)cw_0.c, (Object)cw_0.b("q", (int)cw_0.b("\u00c9", (Object)var12_8, (Object)v9, (long)58597424111194095L, (long)var2_2), (long)58275030207682336L, (long)var2_2), (long)58394021800839118L, (long)var2_2)), (long)58763249392803700L, (long)var2_2);
                                        }
                                        catch (MatchException v10) {
                                            throw cw_0.b("q", (Object)v10, (long)57942040367861387L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var10_6 != null) break block50;
                                            if (v4 != cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)58646597878236498L, (long)var2_2)) break block48;
                                        }
                                        catch (MatchException v11) {
                                            throw cw_0.b("q", (Object)v11, (long)57942040367861387L, (long)var2_2);
                                        }
                                        v4 = cw_0.b("\u00c9", (Object)cw_0.b("\u00c9", (Object)var12_8, (Object)new Object[0], (long)59217092241447619L, (long)var2_2), (long)60184430830756567L, (long)var2_2);
                                    }
                                    catch (MatchException v12) {
                                        throw cw_0.b("q", (Object)v12, (long)57942040367861387L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var10_6 != null) break block51;
                                        if (v4 != false) {
                                        }
                                        ** GOTO lbl145
                                    }
                                    catch (MatchException v13) {
                                        throw cw_0.b("q", (Object)v13, (long)57942040367861387L, (long)var2_2);
                                    }
                                    v4 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)57845443025103132L, (long)var2_2);
                                }
                                catch (MatchException v14) {
                                    throw cw_0.b("q", (Object)v14, (long)57942040367861387L, (long)var2_2);
                                }
                            }
                            try {
                                block53: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var10_6 != null) break block52;
                                                        if (v4 != 1) break block53;
                                                    }
                                                    catch (MatchException v15) {
                                                        throw cw_0.b("q", (Object)v15, (long)57942040367861387L, (long)var2_2);
                                                    }
                                                    if (cw_0.b("\u00db", (Object)cw_0.b, (long)58419293223134458L, (long)var2_2) != null) break block53;
                                                }
                                                catch (MatchException v16) {
                                                    throw cw_0.b("q", (Object)v16, (long)57942040367861387L, (long)var2_2);
                                                }
                                                v4 = cw_0.b("\u00c9", (Object)var12_8, (long)57462250650616478L, (long)var2_2);
                                                if (var10_6 != null) break block52;
                                            }
                                            catch (MatchException v17) {
                                                throw cw_0.b("q", (Object)v17, (long)57942040367861387L, (long)var2_2);
                                            }
                                            if (v4 != false) break block53;
                                        }
                                        catch (MatchException v18) {
                                            throw cw_0.b("q", (Object)v18, (long)57942040367861387L, (long)var2_2);
                                        }
                                        v19 = new Object[1];
                                        v19[0] = var4_3;
                                        cw_0.b("\u00c9", (Object)var12_8, (Object)v19, (long)58037771479114562L, (long)var2_2);
                                        if (var10_6 == null) break block48;
                                    }
                                    catch (MatchException v20) {
                                        throw cw_0.b("q", (Object)v20, (long)57942040367861387L, (long)var2_2);
                                    }
                                }
                                v4 = cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)57845443025103132L, (long)var2_2);
                            }
                            catch (MatchException v21) {
                                throw cw_0.b("q", (Object)v21, (long)57942040367861387L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var10_6 != null) break block54;
                                    if (v4 != false) break block48;
                                }
                                catch (MatchException v22) {
                                    throw cw_0.b("q", (Object)v22, (long)57942040367861387L, (long)var2_2);
                                }
                                v23 = var12_8;
                                if (var10_6 != null) break block55;
                            }
                            catch (MatchException v24) {
                                throw cw_0.b("q", (Object)v24, (long)57942040367861387L, (long)var2_2);
                            }
                            v4 = cw_0.b("\u00c9", (Object)v23, (long)57462250650616478L, (long)var2_2);
                        }
                        catch (MatchException v25) {
                            throw cw_0.b("q", (Object)v25, (long)57942040367861387L, (long)var2_2);
                        }
                    }
                    if (v4 == false) break block48;
                    v23 = var12_8;
                }
                try {
                    try {
                        v26 = new Object[1];
                        v26[0] = var4_3;
                        cw_0.b("\u00c9", (Object)v23, (Object)v26, (long)58037771479114562L, (long)var2_2);
                        if (var10_6 == null) break block48;
lbl145:
                        // 2 sources

                        if (cw_0.b("\u00db", (Object)cw_0.b, (long)58419293223134458L, (long)var2_2) != null) {
                            continue;
                        }
                    }
                    catch (MatchException v27) {
                        throw cw_0.b("q", (Object)v27, (long)57942040367861387L, (long)var2_2);
                    }
                }
                catch (MatchException v28) {
                    throw cw_0.b("q", (Object)v28, (long)57942040367861387L, (long)var2_2);
                }
                try {
                    if (cw_0.b("\u00c9", (Object)var1_1, (Object)new Object[0], (long)57845443025103132L, (long)var2_2) == 1) {
                        v29 = new Object[1];
                        v29[0] = var4_3;
                        cw_0.b("\u00c9", (Object)var12_8, (Object)v29, (long)58037771479114562L, (long)var2_2);
                    }
                }
                catch (MatchException v30) {
                    throw cw_0.b("q", (Object)v30, (long)57942040367861387L, (long)var2_2);
                }
            }
            if (var10_6 == null) continue;
        }
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x21A9;
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
                throw new RuntimeException("dev/zprestige/prestige/cw", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cw_0.g[n2] = l4;
        }
        return g[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = cw_0.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = cw_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cw_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cw_0.c(clazz3, string2, clazz2)) != null) {
                    cw_0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cw_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cw_0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cw_0.f(75846082699804L, 0L);
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
            return MethodHandles.lookup().findStatic(cw_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cw_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


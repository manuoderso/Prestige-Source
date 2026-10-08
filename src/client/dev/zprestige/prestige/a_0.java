/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.a
 */
final class a_0
extends Enum {
    public static final a_0 IDLE;
    public static final a_0 WAIT;
    public static final a_0 PLACE_ANCHOR;
    public static final a_0 SAFE_COVER;
    public static final a_0 CHARGE_ANCHOR;
    public static final a_0 DETONATE;
    private static final a_0[] a;
    private static final long b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    a_0.b = hc.a(-4942862710919510420L, 6944792025042823776L, MethodHandles.lookup().lookupClass()).a(231867443873588L);
                    var14 = a_0.b ^ 85176678828588L;
                    var16_1 = var14 ^ 33307243336629L;
                    a_0.d = new Object[9];
                    a_0.e = new String[9];
                    a_0.a();
                    var6_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var7_3 = 1; var7_3 < 8; ++var7_3) {
                        v2 = v2;
                        v2[var7_3] = (byte)(var14 << var7_3 * 8 >>> 56);
                    }
                    var6_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var5_4 = new String[6];
                    var11_5 = 0;
                    var10_6 = "-\u0083\u00c91\u00de\u00c2\u00a7\u00e2^a|f\u00e6\u00f7\u0083\u00d2\u0010\b\u00da*\u00a0\u00b2)\u008b\u0083T\u00bam\u00e3w8P?\bM~\u00b8\u0092\u00c6Kx\u0015\b(\u001dA\u0011PsFa";
                    var12_7 = "-\u0083\u00c91\u00de\u00c2\u00a7\u00e2^a|f\u00e6\u00f7\u0083\u00d2\u0010\b\u00da*\u00a0\u00b2)\u008b\u0083T\u00bam\u00e3w8P?\bM~\u00b8\u0092\u00c6Kx\u0015\b(\u001dA\u0011PsFa".length();
                    var9_8 = 16;
                    var8_9 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v3 = ++var8_9;
                        v4 = var10_6.substring(v3, v3 + var9_8);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var5_4[var11_5++] = a_0.a(var13_10).intern();
                        if ((var8_9 += var9_8) < var12_7) {
                            var9_8 = var10_6.charAt(var8_9);
                            ** continue;
                        }
                        var10_6 = "\u001cD=B\u009c0T,\u00cbV\u0012t\u00a3\u00e9[\u0093\u0010\u00c7\u0094\u00c1\u00f6\u0013i#\u009d\u009e/V@\u00cb\u001btK";
                        var12_7 = "\u001cD=B\u009c0T,\u00cbV\u0012t\u00a3\u00e9[\u0093\u0010\u00c7\u0094\u00c1\u00f6\u0013i#\u009d\u009e/V@\u00cb\u001btK".length();
                        var9_8 = 16;
                        var8_9 = -1;
lbl47:
                        // 2 sources

                        while (true) {
                            v6 = ++var8_9;
                            v4 = var10_6.substring(v6, v6 + var9_8);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl52:
                    // 1 sources

                    while (true) {
                        var5_4[var11_5++] = a_0.a(var13_10).intern();
                        if ((var8_9 += var9_8) < var12_7) {
                            var9_8 = var10_6.charAt(var8_9);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_10 = var6_2.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl64:
                    // 1 sources

                    ** continue;
                }
            }
            var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                v9 = v9;
                v9[var1_12] = (byte)(var14 << var1_12 * 8 >>> 56);
            }
            break block14;
lbl79:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_13 = -4014468084549138220L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        a_0.c = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
        a_0.IDLE = new a_0(var5_4[2], 0);
        a_0.WAIT = new a_0(var5_4[3], 1);
        a_0.PLACE_ANCHOR = new a_0(var5_4[5], 2);
        a_0.SAFE_COVER = new a_0(var5_4[0], 3);
        a_0.CHARGE_ANCHOR = new a_0(var5_4[1], 4);
        a_0.DETONATE = new a_0(var5_4[4], 5);
        v10 = new Object[1];
        v10[0] = var16_1;
        a_0.a = a_0.a("m", (Object)v10, (long)134327170098110603L, (long)var14);
    }

    public static a_0[] values() {
        return (a_0[])a.clone();
    }

    public static a_0 valueOf(String string, long l) {
        l = b ^ l;
        return (a_0)((Object)a_0.a("m", a_0.class, (Object)string, (long)6539382288993077010L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = a_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = a_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = a_0.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                a_0.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = a_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = a_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = a_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = a_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = a_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a_0.a(clazz3, string2, clazz2)) != null) {
                    a_0.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = a_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        a_0.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a_0.b(445241224236647L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = a_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = a_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = a_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        a_0.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a_0.b(445241224236647L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = a_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        a_0.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a_0.b(445241224236647L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == 'c' || c == '\u00a3' || c == 'o') {
                field = a_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'm' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = a_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static a_0[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        a_0[] a_0Array = new a_0[(int)c];
        a_0Array[0] = IDLE;
        a_0Array[1] = WAIT;
        a_0Array[2] = PLACE_ANCHOR;
        a_0Array[3] = SAFE_COVER;
        a_0Array[4] = CHARGE_ANCHOR;
        a_0Array[5] = DETONATE;
        return a_0Array;
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 35;
            case 1 -> 21;
            case 2 -> 59;
            case 3 -> 18;
            case 4 -> 57;
            case 5 -> 5;
            case 6 -> 22;
            case 7 -> 32;
            case 8 -> 29;
            case 9 -> 2;
            case 10 -> 30;
            case 11 -> 16;
            case 12 -> 48;
            case 13 -> 12;
            case 14 -> 43;
            case 15 -> 6;
            case 16 -> 4;
            case 17 -> 52;
            case 18 -> 42;
            case 19 -> 28;
            case 20 -> 51;
            case 21 -> 44;
            case 22 -> 63;
            case 23 -> 58;
            case 24 -> 0;
            case 25 -> 54;
            case 26 -> 37;
            case 27 -> 33;
            case 28 -> 60;
            case 29 -> 53;
            case 30 -> 11;
            case 31 -> 38;
            case 32 -> 17;
            case 33 -> 47;
            case 34 -> 3;
            case 35 -> 62;
            case 36 -> 23;
            case 37 -> 45;
            case 38 -> 41;
            case 39 -> 61;
            case 40 -> 7;
            case 41 -> 36;
            case 42 -> 8;
            case 43 -> 10;
            case 44 -> 56;
            case 45 -> 9;
            case 46 -> 26;
            case 47 -> 34;
            case 48 -> 13;
            case 49 -> 39;
            case 50 -> 25;
            case 51 -> 14;
            case 52 -> 50;
            case 53 -> 19;
            case 54 -> 46;
            case 55 -> 15;
            case 56 -> 1;
            case 57 -> 31;
            case 58 -> 20;
            case 59 -> 40;
            case 60 -> 55;
            case 61 -> 27;
            case 62 -> 49;
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
        a_0.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "0[\u0002z+\u0018;T\u00135@\u001a/W";
        objectArray[1] = "K;=&a\u0006@4,i\f\u0006@)8";
        objectArray[2] = "&m^\u0016\u001eQ-bOYcI>eF\u0010";
        objectArray[3] = "\\W<\ft\u0005JW9Vg\u0012]\u001c:Pk\u0006L[-G \u0014";
        objectArray[4] = " \u0003XO2zU#S@#54-XK'o@";
        objectArray[5] = "Y\u00198RpFx%.Ru\u001ck29\u0019v\u001ag&(^a\r,4g";
        objectArray[6] = "\u001b\u000eM<AV\u0010\u0001\\s X\u001b\nX)";
        objectArray[7] = "(\u007fS=Q_7c\f]T[(}\u000f\u001aD2uj\b6\u0011J6n\u001b!*\u000b+pZa\u0011H!}\u0013]NM}`\u00190QQ\"\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "_CN[g_\n^\u0010W\u001fHe\u0014W\u0005s\u001e\u0004IM\u001a/!Y\u0012O\u0001bD\bPS\u001e\u001f";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(a_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


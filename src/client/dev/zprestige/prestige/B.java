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

final class B
extends Enum {
    public static final B IDLE;
    public static final B SWITCH_RAIL;
    public static final B SWITCH_CART;
    public static final B SWITCH_FIRE;
    public static final B SWITCH_XBOW;
    public static final B FIRE;
    private static final B[] a;
    private static final long b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private B() {
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
                    B.b = hc.a(3706480913232997417L, 6509723989828557918L, MethodHandles.lookup().lookupClass()).a(52483992292030L);
                    var14 = B.b ^ 100419275581975L;
                    var16_1 = var14 ^ 128888087891149L;
                    B.d = new Object[9];
                    B.e = new String[9];
                    B.a();
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
                    var10_6 = "z\u0098\u00d1 [E\u00b9\u00e7\u00ad\u00d1,\u00e1\u0099\u008c+\u00a5\b\u00f1\u0084\u0095\u00fac\u0081}(\u0010\u0003\u008d\u00b2\u00e5\u0092\u00edb\u00929\u00b8\u000f\u0094\u00d8\u00ae;\u0082\u0010F\u001fiWjFpO\u00c6\u0092\u0092@Nh6\u0088";
                    var12_7 = "z\u0098\u00d1 [E\u00b9\u00e7\u00ad\u00d1,\u00e1\u0099\u008c+\u00a5\b\u00f1\u0084\u0095\u00fac\u0081}(\u0010\u0003\u008d\u00b2\u00e5\u0092\u00edb\u00929\u00b8\u000f\u0094\u00d8\u00ae;\u0082\u0010F\u001fiWjFpO\u00c6\u0092\u0092@Nh6\u0088".length();
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
                        var5_4[var11_5++] = B.a(var13_10).intern();
                        if ((var8_9 += var9_8) < var12_7) {
                            var9_8 = var10_6.charAt(var8_9);
                            ** continue;
                        }
                        var10_6 = "\u00bb:\u00ad\u0002\u00f4e\u00b1\u0095\u0088\u000b\u00da\u0098W\u0080\u000b\u00e9\b\r/\u00d5\u008a?\u00a1\u001f\u00da";
                        var12_7 = "\u00bb:\u00ad\u0002\u00f4e\u00b1\u0095\u0088\u000b\u00da\u0098W\u0080\u000b\u00e9\b\r/\u00d5\u008a?\u00a1\u001f\u00da".length();
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
                        var5_4[var11_5++] = B.a(var13_10).intern();
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
        var2_13 = 634322566007731008L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        B.c = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
        B.IDLE = new B(var5_4[1], 0);
        B.SWITCH_RAIL = new B(var5_4[4], 1);
        B.SWITCH_CART = new B(var5_4[0], 2);
        B.SWITCH_FIRE = new B(var5_4[2], 3);
        B.SWITCH_XBOW = new B(var5_4[3], 4);
        B.FIRE = new B(var5_4[5], 5);
        v10 = new Object[1];
        v10[0] = var16_1;
        B.a = B.a("\u00dc", (Object)v10, (long)4608016468001122974L, (long)var14);
    }

    public static B[] values() {
        return (B[])a.clone();
    }

    public static B valueOf(String string, long l) {
        l = b ^ l;
        return (B)((Object)B.a("\u00dc", B.class, (Object)string, (long)2149922418811020617L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = B.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = B.b(classArray[i], string, clazz2);
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
            int n = B.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                B.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = B.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = B.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = B.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = B.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = B.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = B.a(clazz3, string2, clazz2)) != null) {
                    B.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = B.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        B.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = B.b(433964071962599L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = B.a(l, l2);
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
                clazz3 = B.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = B.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = B.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        B.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = B.b(433964071962599L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = B.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        B.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = B.b(433964071962599L, 0L);
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
            if (c == 'v' || c == '\u00de' || c == 'V' || c == 'A') {
                field = B.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = B.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = B.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/B" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static B[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        B[] bArray = new B[(int)c];
        bArray[0] = IDLE;
        bArray[1] = SWITCH_RAIL;
        bArray[2] = SWITCH_CART;
        bArray[3] = SWITCH_FIRE;
        bArray[4] = SWITCH_XBOW;
        bArray[5] = FIRE;
        return bArray;
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
            case 0 -> 21;
            case 1 -> 20;
            case 2 -> 31;
            case 3 -> 32;
            case 4 -> 8;
            case 5 -> 30;
            case 6 -> 35;
            case 7 -> 7;
            case 8 -> 44;
            case 9 -> 6;
            case 10 -> 40;
            case 11 -> 28;
            case 12 -> 2;
            case 13 -> 48;
            case 14 -> 61;
            case 15 -> 24;
            case 16 -> 59;
            case 17 -> 12;
            case 18 -> 58;
            case 19 -> 51;
            case 20 -> 41;
            case 21 -> 42;
            case 22 -> 54;
            case 23 -> 13;
            case 24 -> 23;
            case 25 -> 47;
            case 26 -> 3;
            case 27 -> 53;
            case 28 -> 5;
            case 29 -> 36;
            case 30 -> 45;
            case 31 -> 38;
            case 32 -> 50;
            case 33 -> 43;
            case 34 -> 60;
            case 35 -> 26;
            case 36 -> 39;
            case 37 -> 10;
            case 38 -> 19;
            case 39 -> 29;
            case 40 -> 27;
            case 41 -> 17;
            case 42 -> 62;
            case 43 -> 55;
            case 44 -> 4;
            case 45 -> 15;
            case 46 -> 25;
            case 47 -> 1;
            case 48 -> 34;
            case 49 -> 37;
            case 50 -> 14;
            case 51 -> 52;
            case 52 -> 63;
            case 53 -> 56;
            case 54 -> 46;
            case 55 -> 22;
            case 56 -> 0;
            case 57 -> 18;
            case 58 -> 11;
            case 59 -> 16;
            case 60 -> 33;
            case 61 -> 49;
            case 62 -> 57;
            default -> 9;
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
        B.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "{b4h\u000eemb12\u001drz)24\u0011fkn%#ZW";
        objectArray[1] = "M='i\u0007Y8\u001d,f\u0016\u0016Y\u0013'm\u0012L-";
        objectArray[2] = "\u001f,C\u0010t\u000f>\u0010U\u0010qU-\u0007B[rS!\u0013S\u001ceDj\"\u001c";
        objectArray[3] = "l\t&<:Ug\u00067sQWs\u0005";
        objectArray[4] = "\u0002l\u0007\f,\r\tc\u0016CA\r\t~\u0002";
        objectArray[5] = "\u0003\u000bmo`f\b\u0004| \u001d~\u001b\u0003ui";
        objectArray[6] = "p' N}G{(1\u0001\u001cIp#5[";
        objectArray[7] = "\u0000kH>6{Du\u0018Xd@\u0004hNglyR>\u0004!\ryAeI=c\u007fGvOX";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "J\u0004s0;CK_x)A\u0003\u0019\u0006t%\u0006\u0013pY5q!\u001f\u001f\u000fq+q}LZs9y\u0004\u001c\u0006r&AG\u0016\u0018q2\u007fFM\u0013hH";
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
            return MethodHandles.lookup().findStatic(B.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


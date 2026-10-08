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
 * Renamed from dev.zprestige.prestige.m
 */
public final class m_0
extends Enum {
    public static final m_0 QUADS;
    public static final m_0 TRIANGLES;
    public static final m_0 TRIANGLES_FAN;
    public static final m_0 DEBUG_LINE_STRIP;
    public static final m_0 QUAD_STRIP;
    public static final m_0 LINES;
    private static final /* synthetic */ m_0[] a;
    private static final long b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m_0() {
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
                    m_0.b = hc.a(4056236476881594394L, 2146034221731768848L, MethodHandles.lookup().lookupClass()).a(60396976968851L);
                    var14 = m_0.b ^ 105049536153970L;
                    var16_1 = var14 ^ 35431077755246L;
                    m_0.d = new Object[9];
                    m_0.e = new String[9];
                    m_0.a();
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
                    var10_6 = "\u00a3R\u0019,\u00ea<\u00a1ZW'5\u00b3\u00c6\u001e\u0099\u0089\u0018\u00db\u00a4,\u00d5\u00ed\u00ac\u008d\u00ed\u00d4\u0019\u00e4\u0000/\u0018\u0011\u0003\u00a1\u00cc\u00bf\u0018\u00fa\u00f4Xg\u0010\u0011G\u00b4*TVHM\u00ed\u00bd\u00b0\u00d7\u00d8\u00fe\u0082\u00f2\b\u00e3K\u0004\u00a76\u00c0\u00a5w";
                    var12_7 = "\u00a3R\u0019,\u00ea<\u00a1ZW'5\u00b3\u00c6\u001e\u0099\u0089\u0018\u00db\u00a4,\u00d5\u00ed\u00ac\u008d\u00ed\u00d4\u0019\u00e4\u0000/\u0018\u0011\u0003\u00a1\u00cc\u00bf\u0018\u00fa\u00f4Xg\u0010\u0011G\u00b4*TVHM\u00ed\u00bd\u00b0\u00d7\u00d8\u00fe\u0082\u00f2\b\u00e3K\u0004\u00a76\u00c0\u00a5w".length();
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
                        var5_4[var11_5++] = m_0.a(var13_10).intern();
                        if ((var8_9 += var9_8) < var12_7) {
                            var9_8 = var10_6.charAt(var8_9);
                            ** continue;
                        }
                        var10_6 = "\u00bc\u008a\u000f\u00be\u00d2\u00a6/M\u0010\u00a3R\u0019,\u00ea<\u00a1Z5y\u00b19\u009b\u0013\f\u00f1";
                        var12_7 = "\u00bc\u008a\u000f\u00be\u00d2\u00a6/M\u0010\u00a3R\u0019,\u00ea<\u00a1Z5y\u00b19\u009b\u0013\f\u00f1".length();
                        var9_8 = 8;
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
                        var5_4[var11_5++] = m_0.a(var13_10).intern();
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
        var2_13 = -5207738496118875110L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        m_0.c = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
        m_0.QUADS = new m_0(var5_4[4], 0);
        m_0.TRIANGLES = new m_0(var5_4[5], 1);
        m_0.TRIANGLES_FAN = new m_0(var5_4[0], 2);
        m_0.DEBUG_LINE_STRIP = new m_0(var5_4[1], 3);
        m_0.QUAD_STRIP = new m_0(var5_4[2], 4);
        m_0.LINES = new m_0(var5_4[3], 5);
        v10 = new Object[1];
        v10[0] = var16_1;
        m_0.a = m_0.a("\u00f3", (Object)v10, (long)2559323596166755074L, (long)var14);
    }

    public static m_0[] values() {
        return (m_0[])a.clone();
    }

    public static m_0 valueOf(String string, long l) {
        l = b ^ l;
        return (m_0)((Object)m_0.a("\u00f3", m_0.class, (Object)string, (long)-3086059529925122875L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = m_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = m_0.b(classArray[i], string, clazz2);
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
            int n = m_0.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                m_0.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = m_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = m_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = m_0.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = m_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = m_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m_0.a(clazz3, string2, clazz2)) != null) {
                    m_0.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = m_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        m_0.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m_0.b(440349923458134L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = m_0.a(l, l2);
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
                clazz3 = m_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = m_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        m_0.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m_0.b(440349923458134L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = m_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        m_0.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m_0.b(440349923458134L, 0L);
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
            if (c == 'B' || c == 'G' || c == 'P' || c == '\u00c9') {
                field = m_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'D' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = m_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static /* synthetic */ m_0[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        m_0[] m_0Array = new m_0[(int)c];
        m_0Array[0] = QUADS;
        m_0Array[1] = TRIANGLES;
        m_0Array[2] = TRIANGLES_FAN;
        m_0Array[3] = DEBUG_LINE_STRIP;
        m_0Array[4] = QUAD_STRIP;
        m_0Array[5] = LINES;
        return m_0Array;
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
            case 0 -> 57;
            case 1 -> 42;
            case 2 -> 27;
            case 3 -> 21;
            case 4 -> 60;
            case 5 -> 54;
            case 6 -> 34;
            case 7 -> 28;
            case 8 -> 63;
            case 9 -> 22;
            case 10 -> 40;
            case 11 -> 5;
            case 12 -> 35;
            case 13 -> 9;
            case 14 -> 2;
            case 15 -> 41;
            case 16 -> 20;
            case 17 -> 16;
            case 18 -> 30;
            case 19 -> 55;
            case 20 -> 19;
            case 21 -> 33;
            case 22 -> 10;
            case 23 -> 61;
            case 24 -> 37;
            case 25 -> 1;
            case 26 -> 51;
            case 27 -> 53;
            case 28 -> 15;
            case 29 -> 14;
            case 30 -> 44;
            case 31 -> 59;
            case 32 -> 25;
            case 33 -> 45;
            case 34 -> 17;
            case 35 -> 6;
            case 36 -> 7;
            case 37 -> 48;
            case 38 -> 24;
            case 39 -> 12;
            case 40 -> 38;
            case 41 -> 8;
            case 42 -> 26;
            case 43 -> 18;
            case 44 -> 23;
            case 45 -> 43;
            case 46 -> 3;
            case 47 -> 46;
            case 48 -> 31;
            case 49 -> 39;
            case 50 -> 58;
            case 51 -> 47;
            case 52 -> 0;
            case 53 -> 13;
            case 54 -> 36;
            case 55 -> 11;
            case 56 -> 52;
            case 57 -> 49;
            case 58 -> 50;
            case 59 -> 56;
            case 60 -> 4;
            case 61 -> 32;
            case 62 -> 29;
            default -> 62;
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
        m_0.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "y0IpD o0L*W7x{O,[#i<X;\u0010=";
        objectArray[1] = "\u0005\u0007(\u001c\"*p'#\u00133e\u0011)(\u00187?e";
        objectArray[2] = "Ku?R<HjI)R9\u0012y^>\u0019:\u0014uJ/^-\u0003>T`";
        objectArray[3] = "\u0019r<^}9\u0012}-\u0011\u0016;\u0006~";
        objectArray[4] = "0g\u000bbZ\f;h\u001a-7\f;u\u000e";
        objectArray[5] = "DJCj\"kOER%_s\\B[l";
        objectArray[6] = "b\tif_#i\u0006x)>-b\r|s";
        objectArray[7] = "d\u001bnk\u0018(kC}\u0001\bG?\u0010zz\u0010veF&`a~iD\"z\u0005?l\u001ae\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "A\nvA#\u000f\u001d\b?CR\u0014\u0012RsI\u0015\u0004{\r2\u00186\rCOrA1j@Hd]k\bAI1ORPGNkU7\fE\u0007i$";
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
            return MethodHandles.lookup().findStatic(m_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


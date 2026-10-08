/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.fT;
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
 * Renamed from dev.zprestige.prestige.cp
 */
public class cp_0 {
    public static final fT a;
    public static final fT b;
    public static final fT c;
    public static final fT d;
    public static final fT e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = hc.a(-4159374506803938578L, 4179520929095728336L, MethodHandles.lookup().lookupClass()).a(16404477540578L) ^ 7660989053756L;
                var11_1 = var9 ^ 119714246719332L;
                cp_0.f = new Object[5];
                cp_0.g = new String[5];
                cp_0.a();
                var1_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_3 = 1; var2_3 < 8; ++var2_3) {
                    v2 = v2;
                    v2[var2_3] = (byte)(var9 << var2_3 * 8 >>> 56);
                }
                var1_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_4 = new String[10];
                var6_5 = 0;
                var5_6 = "3\u0081\u0091)\u00a4\u00d51\u000f~_\u0007@V\u00daN\u0014{\u0097\u00ba C\t{U\u00183\u0081\u0091)\u00a4\u00d51\u000f\u001dv\u00b1hn\u00d4\u00e9-\u00c7?\u0080S\u00b7\u00adav 3\u0081\u0091)\u00a4\u00d51\u000f\u00f7\u00c3\u00c8:\u008c\u0080\u00e3\u00ff\u00c7m\u0092\u0000\u00f1\u00b3\u001f\u00d16}`|Kz\n\t\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00fa\u001d- (\u00c8%\u00a4\u0019&p\u001a\u0092\u008c\bA\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00fa\u001d- (\u00c8%\u00a4\u0019&p\u001a\u0092\u008c\bA\u00183\u0081\u0091)\u00a4\u00d51\u000f\u001dv\u00b1hn\u00d4\u00e9-\u0012=\u00e1\u00ff\u008a\u000f\u001c{ 3\u0081\u0091)\u00a4\u00d51\u000f\u00f7\u00c3\u00c8:\u008c\u0080\u00e3\u00ff\u00c7m\u0092\u0000\u00f1\u00b3\u001f\u00d1%\u00f03\u00c1\u0095\u00f4\u00f4\u00db\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00c1Ea\r\u00fd\u00ce\u009b\u00d0\u0088:\u0099\u00c9\u00f5\u00c9\u000f-";
                var7_7 = "3\u0081\u0091)\u00a4\u00d51\u000f~_\u0007@V\u00daN\u0014{\u0097\u00ba C\t{U\u00183\u0081\u0091)\u00a4\u00d51\u000f\u001dv\u00b1hn\u00d4\u00e9-\u00c7?\u0080S\u00b7\u00adav 3\u0081\u0091)\u00a4\u00d51\u000f\u00f7\u00c3\u00c8:\u008c\u0080\u00e3\u00ff\u00c7m\u0092\u0000\u00f1\u00b3\u001f\u00d16}`|Kz\n\t\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00fa\u001d- (\u00c8%\u00a4\u0019&p\u001a\u0092\u008c\bA\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00fa\u001d- (\u00c8%\u00a4\u0019&p\u001a\u0092\u008c\bA\u00183\u0081\u0091)\u00a4\u00d51\u000f\u001dv\u00b1hn\u00d4\u00e9-\u0012=\u00e1\u00ff\u008a\u000f\u001c{ 3\u0081\u0091)\u00a4\u00d51\u000f\u00f7\u00c3\u00c8:\u008c\u0080\u00e3\u00ff\u00c7m\u0092\u0000\u00f1\u00b3\u001f\u00d1%\u00f03\u00c1\u0095\u00f4\u00f4\u00db\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00c1Ea\r\u00fd\u00ce\u009b\u00d0\u0088:\u0099\u00c9\u00f5\u00c9\u000f-".length();
                var4_8 = 24;
                var3_9 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var3_9;
                    v4 = var5_6.substring(v3, v3 + var4_8);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_4[var6_5++] = cp_0.a(var8_10).intern();
                    if ((var3_9 += var4_8) < var7_7) {
                        var4_8 = var5_6.charAt(var3_9);
                        ** continue;
                    }
                    var5_6 = "3\u0081\u0091)\u00a4\u00d51\u000f\u00fa\u001d- (\u00c8%\u00a4\u0080I:\u009a\u00d0\u0083\u00b1\t\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00a9\u00fe\u00a0\u00b9\u00c9\u0080\u0005\u00b79\u00b1\u00b50\u009aTov";
                    var7_7 = "3\u0081\u0091)\u00a4\u00d51\u000f\u00fa\u001d- (\u00c8%\u00a4\u0080I:\u009a\u00d0\u0083\u00b1\t\u00183\u0081\u0091)\u00a4\u00d51\u000f\u00a9\u00fe\u00a0\u00b9\u00c9\u0080\u0005\u00b79\u00b1\u00b50\u009aTov".length();
                    var4_8 = 24;
                    var3_9 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_9;
                        v4 = var5_6.substring(v6, v6 + var4_8);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var0_4[var6_5++] = cp_0.a(var8_10).intern();
                    if ((var3_9 += var4_8) < var7_7) {
                        var4_8 = var5_6.charAt(var3_9);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_10 = var1_2.doFinal(v4.getBytes("ISO-8859-1"));
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
        v7 = new Object[4];
        v7[3] = var11_1;
        v7[2] = false;
        v7[1] = var0_4[1];
        v7[0] = var0_4[5];
        cp_0.a = cp_0.a("\u00d2", (Object)v7, (long)-1150590023842198638L, (long)var9);
        v8 = new Object[4];
        v8[3] = var11_1;
        v8[2] = false;
        v8[1] = var0_4[8];
        v8[0] = var0_4[4];
        cp_0.b = cp_0.a("\u00d2", (Object)v8, (long)-1150590023842198638L, (long)var9);
        v9 = new Object[4];
        v9[3] = var11_1;
        v9[2] = false;
        v9[1] = var0_4[6];
        v9[0] = var0_4[2];
        cp_0.c = cp_0.a("\u00d2", (Object)v9, (long)-1150590023842198638L, (long)var9);
        v10 = new Object[4];
        v10[3] = var11_1;
        v10[2] = false;
        v10[1] = var0_4[9];
        v10[0] = var0_4[0];
        cp_0.d = cp_0.a("\u00d2", (Object)v10, (long)-1150590023842198638L, (long)var9);
        v11 = new Object[4];
        v11[3] = var11_1;
        v11[2] = false;
        v11[1] = var0_4[7];
        v11[0] = var0_4[3];
        cp_0.e = cp_0.a("\u00d2", (Object)v11, (long)-1150590023842198638L, (long)var9);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cp_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cp_0.b(classArray[i], string, clazz2);
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
            int n = cp_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                cp_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cp_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cp_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = cp_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = cp_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cp_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cp_0.a(clazz3, string2, clazz2)) != null) {
                    cp_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cp_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cp_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cp_0.b(279241475431030L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cp_0.a(l, l2);
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
                clazz3 = cp_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cp_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cp_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cp_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cp_0.b(279241475431030L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cp_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cp_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cp_0.b(279241475431030L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'F' || c == 'B' || c == 'Z' || c == '\u00a4') {
                field = cp_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cp_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cp_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "k^DECD}^A\u001fPSj\u0015B\u0019\\G{RU\u000e\u0017R\\";
        objectArray[1] = "L`u\u0004\u000359@~\u000b\u0012zXNu\u0000\u0016 ,";
        objectArray[2] = "$8\"[2\u000228'\u0001!\u0015%s$\u0007-\u0001443\u0010f\u0014\u0014";
        objectArray[3] = "J\u0000_O84A\u000fN\u0000Y:J\u0004JZ";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "|\u000b\r,eF)U\u0014P1|a\u0005\fa$\u0010k\u0003\u000bPa\u000eu\tA1h\u0007#\tp";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 63;
            case 1 -> 49;
            case 2 -> 16;
            case 3 -> 38;
            case 4 -> 34;
            case 5 -> 0;
            case 6 -> 25;
            case 7 -> 1;
            case 8 -> 42;
            case 9 -> 56;
            case 10 -> 26;
            case 11 -> 51;
            case 12 -> 60;
            case 13 -> 39;
            case 14 -> 37;
            case 15 -> 14;
            case 16 -> 24;
            case 17 -> 29;
            case 18 -> 61;
            case 19 -> 10;
            case 20 -> 59;
            case 21 -> 13;
            case 22 -> 28;
            case 23 -> 40;
            case 24 -> 50;
            case 25 -> 41;
            case 26 -> 53;
            case 27 -> 5;
            case 28 -> 45;
            case 29 -> 44;
            case 30 -> 58;
            case 31 -> 22;
            case 32 -> 46;
            case 33 -> 35;
            case 34 -> 52;
            case 35 -> 4;
            case 36 -> 31;
            case 37 -> 18;
            case 38 -> 19;
            case 39 -> 12;
            case 40 -> 33;
            case 41 -> 21;
            case 42 -> 7;
            case 43 -> 3;
            case 44 -> 47;
            case 45 -> 36;
            case 46 -> 62;
            case 47 -> 8;
            case 48 -> 2;
            case 49 -> 27;
            case 50 -> 43;
            case 51 -> 32;
            case 52 -> 9;
            case 53 -> 15;
            case 54 -> 17;
            case 55 -> 6;
            case 56 -> 54;
            case 57 -> 20;
            case 58 -> 48;
            case 59 -> 11;
            case 60 -> 57;
            case 61 -> 23;
            case 62 -> 55;
            default -> 30;
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
        cp_0.g[n3] = new String(cArray);
        return n3;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cp_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


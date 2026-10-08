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
 * Renamed from dev.zprestige.prestige.c
 */
final class c_0
extends Enum {
    public static final c_0 IDLE;
    public static final c_0 PLACE_ANCHOR;
    public static final c_0 SAFE_COVER;
    public static final c_0 CHARGE_ANCHOR;
    public static final c_0 DETONATE;
    private static final c_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                c_0.b = hc.a(5480845894410840774L, 7710299590155906203L, MethodHandles.lookup().lookupClass()).a(267426642008288L);
                var9 = c_0.b ^ 118454278244238L;
                c_0.c = new Object[9];
                c_0.d = new String[9];
                c_0.a();
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "\u00b9\u0080E\u00f6{\u00069<\u0010\u00ee7\u00d3\u0016$\u0014n\u009d\u00d8/3\u0019)P4\u009c\u0010\u00f0\u0013\u00f8\u00a2\u00e0s\u00fc9\u00ff\u0080l\u0015#\u00d2P\u00bb";
                var7_6 = "\u00b9\u0080E\u00f6{\u00069<\u0010\u00ee7\u00d3\u0016$\u0014n\u009d\u00d8/3\u0019)P4\u009c\u0010\u00f0\u0013\u00f8\u00a2\u00e0s\u00fc9\u00ff\u0080l\u0015#\u00d2P\u00bb".length();
                var4_7 = 8;
                var3_8 = -1;
lbl31:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = c_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00a2'\u00acB\u001f_\u00d1\u00d5$'\u00d4\u00a9\u008b\u00fb7\u00a9\u0010\u0095\u008f\t\u00c5q\u00ef\u0089\u00f4\u0013\u00fb\u000e\u00c7g@\b$";
                    var7_6 = "\u00a2'\u00acB\u001f_\u00d1\u00d5$'\u00d4\u00a9\u008b\u00fb7\u00a9\u0010\u0095\u008f\t\u00c5q\u00ef\u0089\u00f4\u0013\u00fb\u000e\u00c7g@\b$".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl45:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = c_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl62:
                // 1 sources

                ** continue;
            }
        }
        c_0.IDLE = new c_0(var0_3[0], 0);
        c_0.PLACE_ANCHOR = new c_0(var0_3[2], 1);
        c_0.SAFE_COVER = new c_0(var0_3[3], 2);
        c_0.CHARGE_ANCHOR = new c_0(var0_3[4], 3);
        c_0.DETONATE = new c_0(var0_3[1], 4);
        c_0.a = c_0.a("\u00c6", (Object)new Object[0], (long)3166408453763714318L, (long)var9);
    }

    public static c_0[] values() {
        return (c_0[])a.clone();
    }

    public static c_0 valueOf(String string, long l) {
        l = b ^ l;
        return (c_0)((Object)c_0.a("\u00c6", c_0.class, (Object)string, (long)-5422338989532696247L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = c_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c_0.b(classArray[i], string, clazz2);
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
            int n = c_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                c_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = c_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = c_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c_0.a(clazz3, string2, clazz2)) != null) {
                    c_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c_0.b(490452745676560L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = c_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = c_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        c_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c_0.b(490452745676560L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c_0.b(490452745676560L, 0L);
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
            if (c == '\u00fe' || c == '\u00ec' || c == 'w' || c == 'e') {
                field = c_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = c_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static c_0[] a(Object[] objectArray) {
        return new c_0[]{IDLE, PLACE_ANCHOR, SAFE_COVER, CHARGE_ANCHOR, DETONATE};
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
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 11;
            case 1 -> 45;
            case 2 -> 44;
            case 3 -> 36;
            case 4 -> 53;
            case 5 -> 57;
            case 6 -> 37;
            case 7 -> 60;
            case 8 -> 22;
            case 9 -> 8;
            case 10 -> 3;
            case 11 -> 48;
            case 12 -> 19;
            case 13 -> 26;
            case 14 -> 16;
            case 15 -> 34;
            case 16 -> 25;
            case 17 -> 59;
            case 18 -> 27;
            case 19 -> 51;
            case 20 -> 31;
            case 21 -> 35;
            case 22 -> 43;
            case 23 -> 62;
            case 24 -> 9;
            case 25 -> 2;
            case 26 -> 4;
            case 27 -> 28;
            case 28 -> 61;
            case 29 -> 47;
            case 30 -> 40;
            case 31 -> 52;
            case 32 -> 12;
            case 33 -> 5;
            case 34 -> 42;
            case 35 -> 38;
            case 36 -> 49;
            case 37 -> 56;
            case 38 -> 20;
            case 39 -> 33;
            case 40 -> 29;
            case 41 -> 1;
            case 42 -> 58;
            case 43 -> 6;
            case 44 -> 39;
            case 45 -> 17;
            case 46 -> 50;
            case 47 -> 10;
            case 48 -> 15;
            case 49 -> 32;
            case 50 -> 24;
            case 51 -> 21;
            case 52 -> 63;
            case 53 -> 7;
            case 54 -> 0;
            case 55 -> 13;
            case 56 -> 30;
            case 57 -> 14;
            case 58 -> 46;
            case 59 -> 54;
            case 60 -> 23;
            case 61 -> 18;
            case 62 -> 41;
            default -> 55;
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
        c_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "m_.\u0005d\u007f{_+_whl\u0014(Y{|}S?N0l";
        objectArray[1] = "uD^[c8\u0000dUTrwaj^_v-\u0015";
        objectArray[2] = "\u0003jmR\u0011/\"V{R\u0014u1Al\u0019\u0017s=U}^\u0000dvE2";
        objectArray[3] = "$B\rj\u0018q/M\u001c%ss;N";
        objectArray[4] = "T\u001c{lO[_\u0013j#\"[_\u000e~";
        objectArray[5] = "\\\u001fTG?\u0010W\u0010E\bB\bD\u0017LA";
        objectArray[6] = "R\u001d\u0015RjjY\u0012\u0004\u001d\u000bdR\u0019\u0000G";
        objectArray[7] = "\u0007kPUD\n@4\u001bQ|\u0016To_Z;\u0006=1YQ\fSB4CPFh\u0006z\\\u0006A\u0016\u00074[\u000f|R]y@\u000f\u001e\u0015\u00022D7";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "46o\u0014X3h\u007f\u0006\u0005 i;|y\u0006Niu2bl\u00194{qo\u000e\u0010hgb\u0006";
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
            return MethodHandles.lookup().findStatic(c_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


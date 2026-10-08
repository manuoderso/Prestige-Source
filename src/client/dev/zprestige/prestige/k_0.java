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
 * Renamed from dev.zprestige.prestige.k
 */
final class k_0
extends Enum {
    public static final k_0 IDLE;
    public static final k_0 THROW_PEARL;
    public static final k_0 WAIT_FOR_LAUNCH;
    public static final k_0 THROW_WIND_CHARGE;
    private static final k_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                k_0.b = hc.a(6358940591725805582L, 5594090081094993130L, MethodHandles.lookup().lookupClass()).a(130087528299155L);
                var9 = k_0.b ^ 32140467384927L;
                k_0.c = new Object[9];
                k_0.d = new String[9];
                k_0.a();
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
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "\u00dfS`\u00fc\u00a92Oj\u0096J\u00ec#\u00a4|5\u00b4\b@\u00ed\u00f0\u008e\u0088;T\u000f";
                var7_6 = "\u00dfS`\u00fc\u00a92Oj\u0096J\u00ec#\u00a4|5\u00b4\b@\u00ed\u00f0\u008e\u0088;T\u000f".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = k_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00fa\u0097\u00cch\u00cd\n\u00d1\u00ec\u00b7\u00bf\u0083\u0011mJ\u00c2M\u00a4\u00a1\u000b\u00d3\u00cd\fj\u00dc\u0010\u00bf4#\u0000\u00c1\u0082\u00ba3\u00fad \u00d3\u0085\u00fd\u00fd\u00eb";
                    var7_6 = "\u00fa\u0097\u00cch\u00cd\n\u00d1\u00ec\u00b7\u00bf\u0083\u0011mJ\u00c2M\u00a4\u00a1\u000b\u00d3\u00cd\fj\u00dc\u0010\u00bf4#\u0000\u00c1\u0082\u00ba3\u00fad \u00d3\u0085\u00fd\u00fd\u00eb".length();
                    var4_7 = 24;
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
                    var0_3[var6_4++] = k_0.a(var8_9).intern();
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
        k_0.IDLE = new k_0(var0_3[1], 0);
        k_0.THROW_PEARL = new k_0(var0_3[0], 1);
        k_0.WAIT_FOR_LAUNCH = new k_0(var0_3[3], 2);
        k_0.THROW_WIND_CHARGE = new k_0(var0_3[2], 3);
        k_0.a = k_0.a("T", (Object)new Object[0], (long)-758243630172143554L, (long)var9);
    }

    public static k_0[] values() {
        return (k_0[])a.clone();
    }

    public static k_0 valueOf(String string, long l) {
        l = b ^ l;
        return (k_0)((Object)k_0.a("T", k_0.class, (Object)string, (long)2931764959527603970L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = k_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = k_0.b(classArray[i], string, clazz2);
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
            int n = k_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                k_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = k_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = k_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = k_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = k_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = k_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = k_0.a(clazz3, string2, clazz2)) != null) {
                    k_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = k_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        k_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = k_0.b(432642258899959L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = k_0.a(l, l2);
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
                clazz3 = k_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = k_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = k_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        k_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = k_0.b(432642258899959L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = k_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        k_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = k_0.b(432642258899959L, 0L);
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
            if (c == 'o' || c == '\u00fe' || c == '\u00ea' || c == '\u00cd') {
                field = k_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = k_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = k_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static k_0[] a(Object[] objectArray) {
        return new k_0[]{IDLE, THROW_PEARL, WAIT_FOR_LAUNCH, THROW_WIND_CHARGE};
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
            case 0 -> 45;
            case 1 -> 11;
            case 2 -> 46;
            case 3 -> 52;
            case 4 -> 55;
            case 5 -> 38;
            case 6 -> 16;
            case 7 -> 13;
            case 8 -> 62;
            case 9 -> 34;
            case 10 -> 31;
            case 11 -> 35;
            case 12 -> 22;
            case 13 -> 33;
            case 14 -> 4;
            case 15 -> 41;
            case 16 -> 27;
            case 17 -> 47;
            case 18 -> 60;
            case 19 -> 1;
            case 20 -> 15;
            case 21 -> 5;
            case 22 -> 57;
            case 23 -> 51;
            case 24 -> 19;
            case 25 -> 8;
            case 26 -> 40;
            case 27 -> 0;
            case 28 -> 10;
            case 29 -> 32;
            case 30 -> 63;
            case 31 -> 54;
            case 32 -> 49;
            case 33 -> 43;
            case 34 -> 2;
            case 35 -> 42;
            case 36 -> 23;
            case 37 -> 39;
            case 38 -> 29;
            case 39 -> 50;
            case 40 -> 21;
            case 41 -> 44;
            case 42 -> 18;
            case 43 -> 12;
            case 44 -> 36;
            case 45 -> 26;
            case 46 -> 20;
            case 47 -> 59;
            case 48 -> 48;
            case 49 -> 56;
            case 50 -> 58;
            case 51 -> 17;
            case 52 -> 61;
            case 53 -> 9;
            case 54 -> 53;
            case 55 -> 28;
            case 56 -> 37;
            case 57 -> 3;
            case 58 -> 30;
            case 59 -> 14;
            case 60 -> 7;
            case 61 -> 6;
            case 62 -> 24;
            default -> 25;
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
        k_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "L)\u0016%{oG&\u0007j\u0010mS%";
        objectArray[1] = ";X!C%X0W0\fHX0J$";
        objectArray[2] = "YDq_!HRK`\u0010\\PALiY";
        objectArray[3] = "xSE\u001b$YnS@A7Ny\u0018CG;Zh_TPpB";
        objectArray[4] = "LW{e\u0010j9wpj\u0001%Xy{a\u0005\u007f,";
        objectArray[5] = "i!\u0007~97H\u001d\u0011~<m[\n\u00065?kW\u001e\u0017r(|\u001c\u0006X";
        objectArray[6] = "G%\t\u007f\u000b\u0019L*\u00180j\u0017G!\u001cj";
        objectArray[7] = " 5\u0002Q$B*5\u000210B)8Vv +2.@C1\u0017r4Q1wYv$@\u000b$\u001av\u007f;\\>\u0012-/RV>\u0012M";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "z\bH\u001aL/xZH\\5x@Z\u0019\u0016Wa$\u000eL\u0002_\u0011|X\u0007\tY|+\u001b\u0018\u00065";
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
            return MethodHandles.lookup().findStatic(k_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


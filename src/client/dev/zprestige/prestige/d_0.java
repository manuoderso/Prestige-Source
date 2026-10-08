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
 * Renamed from dev.zprestige.prestige.d
 */
final class d_0
extends Enum {
    public static final d_0 PASSIVE;
    public static final d_0 BOW;
    private static final d_0[] a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d_0() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = hc.a(6888400860701466757L, -911892814197618098L, MethodHandles.lookup().lookupClass()).a(111119523676685L);
        long l = b ^ 0x546F3C0FC822L;
        c = new Object[9];
        d = new String[9];
        d_0.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "^\u00c5$m\u00c1\u00e5Z\u009d\bP1h\u00d0\u0086\u008d/t";
        int n2 = "^\u00c5$m\u00c1\u00e5Z\u009d\bP1h\u00d0\u0086\u008d/t".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = d_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                PASSIVE = new d_0(stringArray[0], 0);
                BOW = new d_0(stringArray[1], 1);
                a = d_0.a("\u00f3", (Object)new Object[0], (long)6763187796156826506L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static d_0[] values() {
        return (d_0[])a.clone();
    }

    public static d_0 valueOf(String string, long l) {
        l = b ^ l;
        return (d_0)((Object)d_0.a("\u00f3", d_0.class, (Object)string, (long)794417836684101009L, (long)l));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = d_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d_0.b(classArray[i], string, clazz2);
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
            int n = d_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                d_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = d_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = d_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d_0.a(clazz3, string2, clazz2)) != null) {
                    d_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d_0.b(456321806151742L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = d_0.a(l, l2);
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
                clazz3 = d_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        d_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d_0.b(456321806151742L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d_0.b(456321806151742L, 0L);
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
            if (c == '\u00f4' || c == '\u00e7' || c == 'K' || c == 'x') {
                field = d_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = d_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static d_0[] a(Object[] objectArray) {
        return new d_0[]{PASSIVE, BOW};
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
            case 0 -> 57;
            case 1 -> 14;
            case 2 -> 38;
            case 3 -> 8;
            case 4 -> 40;
            case 5 -> 49;
            case 6 -> 3;
            case 7 -> 46;
            case 8 -> 37;
            case 9 -> 20;
            case 10 -> 26;
            case 11 -> 16;
            case 12 -> 34;
            case 13 -> 52;
            case 14 -> 25;
            case 15 -> 28;
            case 16 -> 36;
            case 17 -> 42;
            case 18 -> 50;
            case 19 -> 43;
            case 20 -> 56;
            case 21 -> 39;
            case 22 -> 17;
            case 23 -> 10;
            case 24 -> 55;
            case 25 -> 13;
            case 26 -> 11;
            case 27 -> 53;
            case 28 -> 35;
            case 29 -> 59;
            case 30 -> 61;
            case 31 -> 31;
            case 32 -> 63;
            case 33 -> 60;
            case 34 -> 22;
            case 35 -> 21;
            case 36 -> 30;
            case 37 -> 7;
            case 38 -> 18;
            case 39 -> 1;
            case 40 -> 23;
            case 41 -> 51;
            case 42 -> 54;
            case 43 -> 24;
            case 44 -> 0;
            case 45 -> 32;
            case 46 -> 58;
            case 47 -> 5;
            case 48 -> 41;
            case 49 -> 15;
            case 50 -> 6;
            case 51 -> 33;
            case 52 -> 12;
            case 53 -> 45;
            case 54 -> 19;
            case 55 -> 44;
            case 56 -> 4;
            case 57 -> 47;
            case 58 -> 29;
            case 59 -> 27;
            case 60 -> 2;
            case 61 -> 9;
            case 62 -> 48;
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
        d_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "n pL\u0006\u0001x u\u0016\u0015\u0016okv\u0010\u0019\u0002~,a\u0007R\u0015";
        objectArray[1] = "h\u0004G\"\u0012\u001f\u001d$L-\u0003P|*G&\u0007\n\b";
        objectArray[2] = "P\"S6b\u0003q\u001eE6gYb\tR}d_n\u001dC:sH%\n\f";
        objectArray[3] = "&\u0012Z\u001e\\\u0017-\u001dKQ7\u00159\u001e";
        objectArray[4] = "|f\u001dylHwi\f6\u0001Hwt\u0018";
        objectArray[5] = " v\u0003JvJ+y\u0012\u0005\u000bR8~\u001bL";
        objectArray[6] = "5;n@qQ>4\u007f\u000f\u0010_5?{U";
        objectArray[7] = "WY{HyLF\u0019g'n+\u0002\fa\u001bcB]_1\u001e\u0007\u0011\u0002\u00005\u0017=@^Zc'";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "4m\u0011l\u0016Ta2Dfd\u0012ggSa#\u0002\u000e8\u001f`\u0016\u0000clG0Xl29K|\u001e\u0007csSvdV`<N~\\\u0003?iD\f";
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
            return MethodHandles.lookup().findStatic(d_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


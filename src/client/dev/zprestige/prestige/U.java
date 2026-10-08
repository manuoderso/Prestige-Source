/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2886
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bR;
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
import net.minecraft.class_2886;

public class U {
    private static final bR a;
    private static final bR b;
    private final class_2886 c;
    private static final long d;
    private static final Object[] e;
    private static final String[] f;

    public U(class_2886 class_28862) {
        this.c = class_28862;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = hc.a(839899582897192953L, -7736880186246361106L, MethodHandles.lookup().lookupClass()).a(94853062585183L);
        long l = d ^ 0x1ABF62FD2B83L;
        long l2 = l ^ 0x645D2FF9FEB1L;
        e = new Object[11];
        f = new String[11];
        U.a();
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
        String string = "\u00b7\u008f\u00fa+\u00f1\u0093GL\b\f\u00cdWc>\u0016PA";
        int n2 = "\u00b7\u008f\u00fa+\u00f1\u0093GL\b\f\u00cdWc>\u0016PA".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = U.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Object[] objectArray = new Object[4];
                objectArray[3] = l2;
                objectArray[2] = U.a("f", (long)-4475315481453288537L, (long)l);
                objectArray[1] = stringArray[0];
                objectArray[0] = class_2886.class;
                a = U.a("D", (Object)objectArray, (long)-4475209687124740021L, (long)l);
                Object[] objectArray2 = new Object[4];
                objectArray2[3] = l2;
                objectArray2[2] = U.a("f", (long)-4475315481453288537L, (long)l);
                objectArray2[1] = stringArray[1];
                objectArray2[0] = class_2886.class;
                b = U.a("D", (Object)objectArray2, (long)-4475209687124740021L, (long)l);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = U.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                U.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = U.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = U.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = U.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = U.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = (l = d ^ l) ^ 0x38B1FBE34FDEL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = this.c;
        U.a("M", (Object)b, (Object)objectArray2, (long)8619432809318396148L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = U.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = U.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = U.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = U.a(clazz3, string2, clazz2)) != null) {
                    U.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = U.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        U.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = U.b(509267212699951L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = U.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = U.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = U.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = U.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        U.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = U.b(509267212699951L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = U.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        U.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = U.b(509267212699951L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = U.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == 'n' || c == 'f' || c == '\u00c6') {
                field = U.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = U.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = (l = d ^ l) ^ 0x43808CC79017L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = this.c;
        U.a("M", (Object)a, (Object)objectArray2, (long)-6316549949401993411L, (long)l);
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
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 38;
            case 1 -> 36;
            case 2 -> 5;
            case 3 -> 17;
            case 4 -> 25;
            case 5 -> 23;
            case 6 -> 28;
            case 7 -> 43;
            case 8 -> 37;
            case 9 -> 47;
            case 10 -> 21;
            case 11 -> 2;
            case 12 -> 4;
            case 13 -> 62;
            case 14 -> 39;
            case 15 -> 26;
            case 16 -> 9;
            case 17 -> 49;
            case 18 -> 7;
            case 19 -> 18;
            case 20 -> 24;
            case 21 -> 51;
            case 22 -> 13;
            case 23 -> 52;
            case 24 -> 60;
            case 25 -> 8;
            case 26 -> 35;
            case 27 -> 14;
            case 28 -> 44;
            case 29 -> 15;
            case 30 -> 45;
            case 31 -> 30;
            case 32 -> 53;
            case 33 -> 29;
            case 34 -> 63;
            case 35 -> 31;
            case 36 -> 48;
            case 37 -> 58;
            case 38 -> 33;
            case 39 -> 27;
            case 40 -> 55;
            case 41 -> 19;
            case 42 -> 54;
            case 43 -> 10;
            case 44 -> 3;
            case 45 -> 41;
            case 46 -> 59;
            case 47 -> 50;
            case 48 -> 1;
            case 49 -> 16;
            case 50 -> 34;
            case 51 -> 32;
            case 52 -> 56;
            case 53 -> 20;
            case 54 -> 22;
            case 55 -> 0;
            case 56 -> 11;
            case 57 -> 61;
            case 58 -> 40;
            case 59 -> 6;
            case 60 -> 46;
            case 61 -> 12;
            case 62 -> 42;
            default -> 57;
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
        U.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "6/058\u001f /5o+\b7d6i'\u001c&#!~l\r\u0000";
        objectArray[1] = "+Vs\u000749^vx\b%v?xs\u0003!,K";
        objectArray[2] = Void.TYPE;
        U.f[2] = "java/lang/Void";
        objectArray[3] = "xE#Py5nE&\nj\"y\u000e%\ff6hI2\u001b-&J";
        objectArray[4] = "t\u0019\rr(+\u00019\u0006}9d`7\rv=>\u0014";
        objectArray[5] = "[I\u001c|d;PF\r3\f;^I\u001e";
        objectArray[6] = "d\u007ft\t\u001e\u000bopeFs\u000bomq";
        objectArray[7] = "/Q\f}\\c$^\u001d2=m/U\u0019h";
        objectArray[8] = "qps3~x?t/a\u0015N\u001c\u0010]^)rw5b/ojt%";
        objectArray[9] = "\u0019o:\u001e\u001cs\u0018e;r\tM@\u007fiK_5\u0014|?\u0003ct\u001d~*\f_|\u0005+4r";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "a\u001dbb%a5\u0014 3Zm[K3cc8#\u001f05+\u00049\n63%:8\u00007_";
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
            return MethodHandles.lookup().findStatic(U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


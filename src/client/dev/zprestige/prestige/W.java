/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11278
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cW;
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
import net.minecraft.class_11278;
import org.joml.Matrix4f;

public class W {
    private static final cW a;
    private final class_11278 b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    public W(class_11278 class_112782) {
        this.b = class_112782;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = hc.a(-6594191024673784061L, 252197116127825545L, MethodHandles.lookup().lookupClass()).a(5276121102732L);
        long l = c ^ 0x2DE2DF43E450L;
        long l2 = l ^ 0x1CFA6DE53921L;
        d = new Object[11];
        e = new String[11];
        W.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0005\u001d\u00c9\u00cf\u001e\u0083\u009c\u009e6\u00034\u001b-K\u00ea\u0006".getBytes("ISO-8859-1"));
                String string = W.a(byArray3).intern();
                Object[] objectArray = new Object[5];
                objectArray[4] = l2;
                objectArray[3] = new Class[]{W.a("\u00f5", (long)-1057845625307597942L, (long)l), W.a("\u00f5", (long)-1057845625307597942L, (long)l)};
                objectArray[2] = Matrix4f.class;
                objectArray[1] = string;
                objectArray[0] = class_11278.class;
                a = W.a("\u00ca", (Object)objectArray, (long)-1057592330840495534L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = W.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = W.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = W.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = W.b(classArray[i], string, clazz2);
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
            int n = W.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                W.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = W.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = W.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = W.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = W.a(clazz3, string2, clazz2)) != null) {
                    W.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = W.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        W.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = W.b(436834371843625L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = W.a(l, l2);
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
                clazz3 = W.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = W.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = W.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        W.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = W.b(436834371843625L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = W.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        W.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = W.b(436834371843625L, 0L);
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

    public Matrix4f a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = c ^ l) ^ 0x253C7098D5C9L;
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l2;
            objectArray2[1] = new Object[]{W.a("\u00ca", (float)f, (long)5240281916755025419L, (long)l), W.a("\u00ca", (float)f10, (long)5240281916755025419L, (long)l)};
            objectArray2[0] = this.b;
            return (Matrix4f)W.a("M", (Object)a, (Object)objectArray2, (long)5240311878824434009L, (long)l);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/W" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == '\u00e4' || c == '\u00f5' || c == 'c') {
                field = W.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = W.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = W.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "n\u0001V$NKe\u000eGk&Kk\u0001T";
        objectArray[1] = "7<&R\\\"<37\u001d1\"<.#";
        objectArray[2] = "\u0016\u001c\u001co^K\u0000\u001c\u00195M\\\u0017W\u001a3AH\u0006\u0010\r$\nX%";
        objectArray[3] = "m\u00077>nv\u0018'<1\u007f9y)7:{c\r";
        objectArray[4] = Float.TYPE;
        W.e[4] = "java/lang/Float";
        objectArray[5] = "}r\u0012c!+\bR\u0019l0di\\\u0012g4>\u001d";
        objectArray[6] = "\u0004jG`\u001f\u0002\u000feV/~\f\u0004nRu";
        objectArray[7] = "\fROFmX\u0002\u0003\u0019+\ft1r#[j\u001f\u0010N\u001d\u0014/_";
        objectArray[8] = "#[#T\u0010]-\nu9SI\"K\"~C }\u00060XJQ M#\u0005-E+Z\"\u0004PKz\fO";
        objectArray[9] = "&r\u0003rNM|,\u0001/tY\u001f.\u001e.O\u000f'r\fq\u00043#|\u0001s\u0004N.q\u0016rt";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "+O\r{<,q\u0011\u000f&\u0006?\u0012\u0013\u0010'=n*O\u0002xvR+O\r{<,q\u0011\u000f&\u0006";
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
            case 0 -> 47;
            case 1 -> 44;
            case 2 -> 62;
            case 3 -> 36;
            case 4 -> 25;
            case 5 -> 5;
            case 6 -> 37;
            case 7 -> 4;
            case 8 -> 18;
            case 9 -> 52;
            case 10 -> 24;
            case 11 -> 8;
            case 12 -> 63;
            case 13 -> 15;
            case 14 -> 43;
            case 15 -> 31;
            case 16 -> 30;
            case 17 -> 39;
            case 18 -> 6;
            case 19 -> 7;
            case 20 -> 34;
            case 21 -> 61;
            case 22 -> 50;
            case 23 -> 17;
            case 24 -> 16;
            case 25 -> 3;
            case 26 -> 46;
            case 27 -> 10;
            case 28 -> 2;
            case 29 -> 0;
            case 30 -> 57;
            case 31 -> 54;
            case 32 -> 33;
            case 33 -> 20;
            case 34 -> 19;
            case 35 -> 59;
            case 36 -> 40;
            case 37 -> 32;
            case 38 -> 14;
            case 39 -> 22;
            case 40 -> 29;
            case 41 -> 56;
            case 42 -> 11;
            case 43 -> 35;
            case 44 -> 13;
            case 45 -> 53;
            case 46 -> 23;
            case 47 -> 9;
            case 48 -> 26;
            case 49 -> 12;
            case 50 -> 41;
            case 51 -> 28;
            case 52 -> 42;
            case 53 -> 55;
            case 54 -> 38;
            case 55 -> 27;
            case 56 -> 1;
            case 57 -> 49;
            case 58 -> 48;
            case 59 -> 58;
            case 60 -> 21;
            case 61 -> 51;
            case 62 -> 45;
            default -> 60;
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
        W.e[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            return MethodHandles.lookup().findStatic(W.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


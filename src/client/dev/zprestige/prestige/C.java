/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4184
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
import net.minecraft.class_4184;

public class C {
    private static final cW a;
    private static final cW b;
    private final class_4184 c;
    private static final long d;
    private static final Object[] e;
    private static final String[] f;

    public C(class_4184 class_41842) {
        this.c = class_41842;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = hc.a(3996150123411761149L, -7713141107529485939L, MethodHandles.lookup().lookupClass()).a(217247378257038L);
        long l = d ^ 0x1F22087B6E79L;
        long l2 = l ^ 0x2001E5446E68L;
        e = new Object[17];
        f = new String[17];
        C.a();
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
        String string = "ck\u0093\u00c7\u0015\u00f0hb\u0010\u0011N2\u008e1\u00830=\u000f\u0085\u00f6V3\u001bv\r";
        int n2 = "ck\u0093\u00c7\u0015\u00f0hb\u0010\u0011N2\u008e1\u00830=\u000f\u0085\u00f6V3\u001bv\r".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = C.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Object[] objectArray = new Object[5];
                objectArray[4] = l2;
                objectArray[3] = new Class[]{C.a("w", (long)-6477844899892285478L, (long)l), C.a("w", (long)-6477844899892285478L, (long)l), C.a("w", (long)-6477844899892285478L, (long)l)};
                objectArray[2] = C.a("w", (long)-6477432947990861954L, (long)l);
                objectArray[1] = stringArray[0];
                objectArray[0] = class_4184.class;
                a = C.a("\u00ef", (Object)objectArray, (long)-6476971931981578339L, (long)l);
                Object[] objectArray2 = new Object[5];
                objectArray2[4] = l2;
                objectArray2[3] = new Class[]{C.a("w", (long)-6477343687368866128L, (long)l), C.a("w", (long)-6477343687368866128L, (long)l)};
                objectArray2[2] = C.a("w", (long)-6477432947990861954L, (long)l);
                objectArray2[1] = stringArray[1];
                objectArray2[0] = class_4184.class;
                b = C.a("\u00ef", (Object)objectArray2, (long)-6476971931981578339L, (long)l);
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
            int n = C.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                C.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = C.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = C.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = C.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = C.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = d ^ l) ^ 0x3253D368EB74L;
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l2;
            objectArray2[1] = new Object[]{C.a("\u00ef", (float)f, (long)8504309644386699240L, (long)l), C.a("\u00ef", (float)f10, (long)8504309644386699240L, (long)l)};
            objectArray2[0] = this.c;
            C.a("\u00e6", (Object)b, (Object)objectArray2, (long)8504384372192640708L, (long)l);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    private static Field c(long l, long l2) {
        int n = C.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = C.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = C.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = C.a(clazz3, string2, clazz2)) != null) {
                    C.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = C.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        C.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = C.b(588898143613547L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = C.a(l, l2);
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
                clazz3 = C.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = C.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = C.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        C.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = C.b(588898143613547L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = C.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        C.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = C.b(588898143613547L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/C" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = C.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == 'B' || c == 'w' || c == '\u00c7') {
                field = C.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = C.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ef' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        double d11 = (Double)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = C.d ^ l) ^ 0x2DB9AAE98E37L;
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l2;
            objectArray2[1] = new Object[]{C.a("\u00ef", (double)d, (long)1389049995835043712L, (long)l), C.a("\u00ef", (double)d10, (long)1389049995835043712L, (long)l), C.a("\u00ef", (double)d11, (long)1389049995835043712L, (long)l)};
            objectArray2[0] = this.c;
            C.a("\u00e6", (Object)a, (Object)objectArray2, (long)1389003612862913415L, (long)l);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
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
            case 0 -> 52;
            case 1 -> 4;
            case 2 -> 51;
            case 3 -> 3;
            case 4 -> 56;
            case 5 -> 61;
            case 6 -> 9;
            case 7 -> 60;
            case 8 -> 24;
            case 9 -> 42;
            case 10 -> 41;
            case 11 -> 2;
            case 12 -> 14;
            case 13 -> 37;
            case 14 -> 5;
            case 15 -> 12;
            case 16 -> 10;
            case 17 -> 20;
            case 18 -> 17;
            case 19 -> 44;
            case 20 -> 57;
            case 21 -> 45;
            case 22 -> 38;
            case 23 -> 15;
            case 24 -> 21;
            case 25 -> 27;
            case 26 -> 50;
            case 27 -> 46;
            case 28 -> 47;
            case 29 -> 54;
            case 30 -> 40;
            case 31 -> 59;
            case 32 -> 13;
            case 33 -> 43;
            case 34 -> 29;
            case 35 -> 49;
            case 36 -> 33;
            case 37 -> 36;
            case 38 -> 16;
            case 39 -> 0;
            case 40 -> 35;
            case 41 -> 26;
            case 42 -> 34;
            case 43 -> 22;
            case 44 -> 8;
            case 45 -> 18;
            case 46 -> 32;
            case 47 -> 19;
            case 48 -> 62;
            case 49 -> 23;
            case 50 -> 53;
            case 51 -> 28;
            case 52 -> 63;
            case 53 -> 39;
            case 54 -> 6;
            case 55 -> 11;
            case 56 -> 31;
            case 57 -> 48;
            case 58 -> 1;
            case 59 -> 30;
            case 60 -> 25;
            case 61 -> 58;
            case 62 -> 55;
            default -> 7;
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
        C.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\bf*\u0011cG\u0003i;^\u001bD\u000bc";
        objectArray[1] = "z2<+!\u0006q=-dL\u0006q 9";
        objectArray[2] = "\u0015h\u001c(L\u000b\u001eg\rg$\u000b\u0010h\u001e";
        objectArray[3] = "aF'e\u001emjI6*tn~E=a";
        objectArray[4] = "\u001f\u000e[:A=\t\u000e^`R*\u001eE]f^>\u000f\u0002Jq\u0015.,";
        objectArray[5] = "%d\u007frI[PDt}X\u00141J\u007fv\\NE";
        objectArray[6] = Float.TYPE;
        C.f[6] = "java/lang/Float";
        objectArray[7] = "IH\u0007 \u0005^<h\f/\u0014\u0011]f\u0007$\u0010K)";
        objectArray[8] = "\\:~\u0004\tBW5oKhL\\>k\u0011";
        objectArray[9] = Double.TYPE;
        C.f[9] = "java/lang/Double";
        objectArray[10] = "\ny\u0004L\f|Iff`<\u001av\u0004\u0016\\\u0006yFx\u0002CR";
        objectArray[11] = "\u0001\\\u0016\u001f\u000eI\u0003J\u0014F3wiibvCKS\nR\nWT\u0007";
        objectArray[12] = "7PoBb`=Bp\u0006S_\\qL>#cf\u0012|B7|2";
        objectArray[13] = "\u0019\u000e>Q{3\u001b\u0018<\bF/I\u0007zU\u0001? _k]{=PXjI/Q\u0019\u000e>Q{3\u001b\u0018<\bF";
        objectArray[14] = "\u0016`\u001e\u0001\u000eFSg\u000eN\u007fJ-c\u001a\u0016\rECa\b\u001c\u000e \u0010$\u001c\u000fEDQd[\u0002\u007f";
        objectArray[15] = "\u0018E3\u001e{e\u0012W,ZJxKX \u000f\rh\"\u0002'\u000b1`H\u0002aR2\u0006\u0018E3\u001e{e\u0012W,ZJ";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "KM>VHl\u000eJ.\u00199gpN:AKo\u001eL(KH\nKM>VHl\u000eJ.\u00199";
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
            return MethodHandles.lookup().findStatic(C.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


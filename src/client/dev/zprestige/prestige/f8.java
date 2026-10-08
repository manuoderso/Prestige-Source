/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
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
import net.minecraft.class_243;

class f8 {
    class_243 a;
    long b;
    int c;
    String d;
    float e;
    boolean f;
    class_243 g;
    double h;
    float i;
    private static final long j = hc.a(1830585387041611762L, 4173957599514735157L, MethodHandles.lookup().lookupClass()).a(137070715291664L);
    private static final Object[] k = new Object[8];
    private static final String[] l = new String[8];

    f8(class_243 class_2432, String string, int n, float f, boolean bl, class_243 class_2433, long l) {
        l = j ^ l;
        this.a = class_2432;
        this.d = string;
        this.b = (long)f8.a("g", (long)7360715129485128847L, (long)l);
        this.c = n;
        this.e = (float)f8.a("g", (double)f, (long)7360801679417172807L, (long)l);
        this.f = bl;
        this.g = class_2433;
        this.h = (double)f8.a("g", (long)7360635825691970258L, (long)l);
        this.i = (float)f8.a("g", (long)7360635825691970258L, (long)l);
    }

    static {
        f8.a();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = f8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f8.b(classArray[i], string, clazz2);
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
            int n = f8.a(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                f8.k[n] = clazz = Class.forName(f8.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f8.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f8.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = f8.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = f8.l[n];
            int n2 = string.indexOf(8);
            Class clazz = f8.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f8.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f8.a(clazz3, string2, clazz2)) != null) {
                    f8.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f8.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f8.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f8.b(329665922240773L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = f8.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f8.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = f8.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f8.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f8.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        f8.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f8.b(329665922240773L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f8.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f8.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f8.b(329665922240773L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'W' || c == '\u00e8' || c == 'p' || c == 'd') {
                field = f8.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f8.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = f8.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/f8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f8.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 43;
            case 1 -> 55;
            case 2 -> 20;
            case 3 -> 60;
            case 4 -> 61;
            case 5 -> 0;
            case 6 -> 56;
            case 7 -> 39;
            case 8 -> 33;
            case 9 -> 58;
            case 10 -> 49;
            case 11 -> 18;
            case 12 -> 6;
            case 13 -> 1;
            case 14 -> 19;
            case 15 -> 36;
            case 16 -> 24;
            case 17 -> 53;
            case 18 -> 38;
            case 19 -> 42;
            case 20 -> 59;
            case 21 -> 62;
            case 22 -> 45;
            case 23 -> 41;
            case 24 -> 52;
            case 25 -> 17;
            case 26 -> 31;
            case 27 -> 54;
            case 28 -> 14;
            case 29 -> 10;
            case 30 -> 25;
            case 31 -> 30;
            case 32 -> 48;
            case 33 -> 5;
            case 34 -> 15;
            case 35 -> 23;
            case 36 -> 32;
            case 37 -> 8;
            case 38 -> 9;
            case 39 -> 37;
            case 40 -> 3;
            case 41 -> 57;
            case 42 -> 21;
            case 43 -> 13;
            case 44 -> 35;
            case 45 -> 16;
            case 46 -> 27;
            case 47 -> 29;
            case 48 -> 28;
            case 49 -> 46;
            case 50 -> 7;
            case 51 -> 26;
            case 52 -> 22;
            case 53 -> 12;
            case 54 -> 50;
            case 55 -> 34;
            case 56 -> 63;
            case 57 -> 40;
            case 58 -> 2;
            case 59 -> 44;
            case 60 -> 4;
            case 61 -> 51;
            case 62 -> 47;
            default -> 11;
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
        f8.l[n3] = new String(cArray);
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

    private static void a() {
        Object[] objectArray = k;
        k[0] = "yIW)[]rFFf8Pg@";
        objectArray[1] = Double.TYPE;
        f8.l[1] = "java/lang/Double";
        objectArray[2] = "\u001bf\"BI\u0014\u0010i3\r4\u0001\u0002s1N";
        objectArray[3] = Long.TYPE;
        f8.l[3] = "java/lang/Long";
        objectArray[4] = "#u\u0006p_8(z\u0017?>6#q\u0013e";
        objectArray[5] = "I67e&\u000fGf,Ul[J340\u0016\u000bE?h2oB\u00154=U";
        objectArray[6] = ":\u00144EWp4D/u\u001b*\u0005\u0014<\u0014\u000e+$}i\u001c\u0007v8\u0004 L\f#_D9\u0015\\*&\ri\u001e\tM";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "hoO\\BM-`EF+E,tSAMR\roLAnO5jHW+\u0014arQTZ\\j0\u0010,";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


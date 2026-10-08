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

/*
 * Renamed from dev.zprestige.prestige.aj
 */
class aj_0 {
    static final int[] a;
    private static final Object[] b;
    private static final String[] c;

    static {
        long l = hc.a(-3381705040352110024L, -886790620336282559L, MethodHandles.lookup().lookupClass()).a(171291236637943L) ^ 0x75E777F6B4CAL;
        b = new Object[10];
        c = new String[10];
        aj_0.a();
        a = new int[((CallSite)aj_0.a("\u00d3", (long)-4181526575648135318L, (long)l)).length];
        try {
            aj_0.a[aj_0.a("\u00cf", (Object)aj_0.a("\u00c6", (long)-4180706664886476045L, (long)l), (long)-4181506859731070327L, (long)l)] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aj_0.a[aj_0.a("\u00cf", (Object)aj_0.a("\u00c6", (long)-4180640281420333680L, (long)l), (long)-4181506859731070327L, (long)l)] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aj_0.a[aj_0.a("\u00cf", (Object)aj_0.a("\u00c6", (long)-4180557710159108986L, (long)l), (long)-4181506859731070327L, (long)l)] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aj_0.a[aj_0.a("\u00cf", (Object)aj_0.a("\u00c6", (long)-4180493566647122943L, (long)l), (long)-4181506859731070327L, (long)l)] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = aj_0.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                aj_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = aj_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aj_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aj_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aj_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = aj_0.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = aj_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aj_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aj_0.a(clazz3, string2, clazz2)) != null) {
                    aj_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aj_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aj_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aj_0.b(236738186496915L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = aj_0.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = aj_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aj_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aj_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        aj_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aj_0.b(236738186496915L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aj_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aj_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aj_0.b(236738186496915L, 0L);
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
            if (c == '\u00cb' || c == '\u00fb' || c == '\u00c6' || c == '\u00d4') {
                field = aj_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aj_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = aj_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 60;
            case 1 -> 48;
            case 2 -> 40;
            case 3 -> 61;
            case 4 -> 57;
            case 5 -> 42;
            case 6 -> 9;
            case 7 -> 35;
            case 8 -> 10;
            case 9 -> 33;
            case 10 -> 1;
            case 11 -> 55;
            case 12 -> 7;
            case 13 -> 43;
            case 14 -> 18;
            case 15 -> 13;
            case 16 -> 31;
            case 17 -> 12;
            case 18 -> 47;
            case 19 -> 8;
            case 20 -> 16;
            case 21 -> 21;
            case 22 -> 11;
            case 23 -> 54;
            case 24 -> 30;
            case 25 -> 14;
            case 26 -> 28;
            case 27 -> 51;
            case 28 -> 15;
            case 29 -> 3;
            case 30 -> 46;
            case 31 -> 27;
            case 32 -> 41;
            case 33 -> 39;
            case 34 -> 38;
            case 35 -> 20;
            case 36 -> 62;
            case 37 -> 17;
            case 38 -> 45;
            case 39 -> 22;
            case 40 -> 63;
            case 41 -> 59;
            case 42 -> 19;
            case 43 -> 37;
            case 44 -> 36;
            case 45 -> 52;
            case 46 -> 32;
            case 47 -> 56;
            case 48 -> 0;
            case 49 -> 24;
            case 50 -> 34;
            case 51 -> 23;
            case 52 -> 44;
            case 53 -> 25;
            case 54 -> 26;
            case 55 -> 53;
            case 56 -> 49;
            case 57 -> 29;
            case 58 -> 5;
            case 59 -> 6;
            case 60 -> 58;
            case 61 -> 50;
            case 62 -> 4;
            default -> 2;
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
        aj_0.c[n3] = new String(cArray);
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
        Object[] objectArray = b;
        b[0] = "<j\u001f(\"1<j\bt.>&!\bj.+!PZ5\u007fl";
        objectArray[1] = "\u000699bGg0\u001c9bP;<\u0013#)P%<\u0006$X\u0002zmAl";
        objectArray[2] = Integer.TYPE;
        aj_0.c[2] = "java/lang/Integer";
        objectArray[3] = ":\u0004U\u0013P\u00161\u000bD\\1\u0018:\u0000@\u0006";
        objectArray[4] = "MW\f*\u0007TKV\u0012S\u000f\nF\n\u0007\u0004_R\u0014Rk5X\fR\bT3Y\u0012";
        objectArray[5] = "U]\u0010B%1S\\\u000e;-o^\u0000\u001bl}7\rUw]ziJ\u0002H[{w";
        objectArray[6] = "*\u0007*\u0003!p,\u00064z).!Z!-yvr\u0000M\u001c~(5Xr\u001a\u007f6";
        objectArray[7] = "e@2X.McA,!&\u0013n\u001d9vvK<CUGq\u0015z\u001fjAp\u000b";
        objectArray[8] = "l\u001b<\u0004egj\u001a\"}d\"fC=\u0014gX3D2F:e3Me\u0004\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "%\bv\"GC#\th[_\u0015'L| !E{\n{dP\u000e)N\u007f[";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aj_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


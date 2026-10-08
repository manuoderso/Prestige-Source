/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fU
implements cz_0 {
    private static Object a;
    private static int b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    static {
        c = hc.a(-8808510432849199122L, -4077603550827345641L, MethodHandles.lookup().lookupClass()).a(123146824888877L);
        d = new Object[11];
        e = new String[11];
        fU.a();
        b = -1;
    }

    private static int e(long l, long l2) {
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
            case 0 -> 36;
            case 1 -> 42;
            case 2 -> 22;
            case 3 -> 61;
            case 4 -> 21;
            case 5 -> 35;
            case 6 -> 7;
            case 7 -> 8;
            case 8 -> 14;
            case 9 -> 20;
            case 10 -> 43;
            case 11 -> 25;
            case 12 -> 47;
            case 13 -> 5;
            case 14 -> 45;
            case 15 -> 62;
            case 16 -> 10;
            case 17 -> 56;
            case 18 -> 29;
            case 19 -> 63;
            case 20 -> 0;
            case 21 -> 51;
            case 22 -> 11;
            case 23 -> 48;
            case 24 -> 60;
            case 25 -> 13;
            case 26 -> 32;
            case 27 -> 26;
            case 28 -> 3;
            case 29 -> 40;
            case 30 -> 57;
            case 31 -> 1;
            case 32 -> 55;
            case 33 -> 18;
            case 34 -> 2;
            case 35 -> 16;
            case 36 -> 49;
            case 37 -> 37;
            case 38 -> 24;
            case 39 -> 39;
            case 40 -> 53;
            case 41 -> 4;
            case 42 -> 31;
            case 43 -> 30;
            case 44 -> 19;
            case 45 -> 27;
            case 46 -> 46;
            case 47 -> 38;
            case 48 -> 34;
            case 49 -> 54;
            case 50 -> 41;
            case 51 -> 33;
            case 52 -> 9;
            case 53 -> 12;
            case 54 -> 58;
            case 55 -> 17;
            case 56 -> 52;
            case 57 -> 28;
            case 58 -> 15;
            case 59 -> 59;
            case 60 -> 50;
            case 61 -> 44;
            case 62 -> 23;
            default -> 6;
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
        fU.e[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == 'O' || c == '\u00e9' || c == 'J') {
                field = fU.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fU.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'v' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fU.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int b(Object[] objectArray) {
        return b;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(long l, long l2) {
        int n = fU.e(l, l2);
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
                clazz3 = fU.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fU.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fU.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        fU.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fU.f(504537512460960L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fU.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fU.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fU.f(504537512460960L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fU.e(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                fU.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fU.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fU.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = fU.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fU.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static boolean a(Object[] objectArray) {
        boolean bl;
        Object object = objectArray[0];
        try {
            bl = a == object;
        }
        catch (MatchException matchException) {
            throw fU.a(matchException);
        }
        return bl;
    }

    public static void a(Object[] objectArray) {
        block5: {
            block4: {
                Object object = objectArray[0];
                long l = (Long)objectArray[1];
                l = c ^ l;
                CallSite callSite = fU.a("l", (long)6073206490621916525L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (a != object) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fU.a("l", (Object)matchException, (long)6073346816648398272L, (long)l);
                    }
                    a = null;
                }
                catch (MatchException matchException) {
                    throw fU.a("l", (Object)matchException, (long)6073346816648398272L, (long)l);
                }
            }
            b = -1;
        }
    }

    public static int a(Object[] objectArray) {
        block12: {
            Object object;
            block13: {
                CallSite callSite;
                long l;
                Object object2;
                block10: {
                    object2 = objectArray[0];
                    l = (Long)objectArray[1];
                    long l2 = (l = c ^ l) ^ 0x780A6BA3BF62L;
                    callSite = fU.a("l", (long)-2827079417586173471L, (long)l);
                    try {
                        block11: {
                            try {
                                try {
                                    object = a;
                                    if (callSite != null) break block10;
                                    if (object != null) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw fU.a("l", (Object)matchException, (long)-2826936892501833396L, (long)l);
                                }
                                a = object2;
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l2;
                                b = (int)fU.a("l", (Object)objectArray2, (long)-2827009506121648572L, (long)l);
                                if (callSite == null) break block12;
                            }
                            catch (MatchException matchException) {
                                throw fU.a("l", (Object)matchException, (long)-2826936892501833396L, (long)l);
                            }
                        }
                        object = a;
                    }
                    catch (MatchException matchException) {
                        throw fU.a("l", (Object)matchException, (long)-2826936892501833396L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block13;
                        if (object == object2) break block12;
                    }
                    catch (MatchException matchException) {
                        throw fU.a("l", (Object)matchException, (long)-2826936892501833396L, (long)l);
                    }
                    object = object2;
                }
                catch (MatchException matchException) {
                    throw fU.a("l", (Object)matchException, (long)-2826936892501833396L, (long)l);
                }
            }
            a = object;
        }
        return b;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "X[\u0005-o\u0011N[\u0000w|\u0006Y\u0010\u0003qp\u0012HW\u0014f;\u0000t";
        objectArray[1] = "7#i\u0002|-B\u0003b\rmb?\u001bq\nd+W";
        objectArray[2] = "\nm\u0000!>\\\u001cm\u0005{-K\u000b&\u0006}!_\u001aa\u0011jjO\u001c";
        objectArray[3] = "\u0015XN;BH`xE4S\u0007\u0001vN?W]u";
        objectArray[4] = Integer.TYPE;
        fU.e[4] = "java/lang/Integer";
        objectArray[5] = "\u001bp{f(F\rp~<;Q\u001a;}:7E\u000b|j-|P*";
        objectArray[6] = "c(R\t\u0003^h'CF`S}*L-UQl9P\u0001B\\";
        objectArray[7] = "X2FKr\u001bS=W\u0004\u0013\u0015X6S^";
        objectArray[8] = "=?,\u0013`\u000e=`=,qpe8#J%\u00120b5S\u001b";
        objectArray[9] = "Jg$4j\u001e\u0016craR\u001es<t0k\u0011\u001ej($,wHi+ej\u0012\u000e=$'R";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\u001fOl \u007f\u001d\u0018L+c\u0018\u0016$\u001cka\"\u0006\u001dP|.(\u007f\u0018[.eaFTLao\u0018";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = fU.e(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = fU.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fU.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fU.c(clazz3, string2, clazz2)) != null) {
                    fU.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fU.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fU.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fU.f(504537512460960L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fU.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


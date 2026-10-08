/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.dK;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dR
extends dK {
    private final String[] a;
    private static final long f = hc.a(3531573648705082950L, -6732316461788481209L, MethodHandles.lookup().lookupClass()).a(182657600899482L);
    private static final Object[] h = new Object[6];
    private static final String[] i = new String[6];

    public dR(String string, String string2, String[] stringArray) {
        super(string, string2);
        this.a = stringArray;
    }

    static {
        dR.c();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 38;
            case 2 -> 51;
            case 3 -> 24;
            case 4 -> 7;
            case 5 -> 49;
            case 6 -> 30;
            case 7 -> 63;
            case 8 -> 44;
            case 9 -> 46;
            case 10 -> 47;
            case 11 -> 35;
            case 12 -> 6;
            case 13 -> 26;
            case 14 -> 52;
            case 15 -> 45;
            case 16 -> 27;
            case 17 -> 28;
            case 18 -> 36;
            case 19 -> 56;
            case 20 -> 43;
            case 21 -> 61;
            case 22 -> 12;
            case 23 -> 62;
            case 24 -> 58;
            case 25 -> 8;
            case 26 -> 50;
            case 27 -> 11;
            case 28 -> 29;
            case 29 -> 17;
            case 30 -> 4;
            case 31 -> 33;
            case 32 -> 15;
            case 33 -> 32;
            case 34 -> 2;
            case 35 -> 9;
            case 36 -> 39;
            case 37 -> 18;
            case 38 -> 19;
            case 39 -> 25;
            case 40 -> 34;
            case 41 -> 10;
            case 42 -> 53;
            case 43 -> 59;
            case 44 -> 20;
            case 45 -> 14;
            case 46 -> 54;
            case 47 -> 16;
            case 48 -> 48;
            case 49 -> 60;
            case 50 -> 42;
            case 51 -> 3;
            case 52 -> 1;
            case 53 -> 5;
            case 54 -> 37;
            case 55 -> 23;
            case 56 -> 22;
            case 57 -> 31;
            case 58 -> 40;
            case 59 -> 41;
            case 60 -> 0;
            case 61 -> 55;
            case 62 -> 21;
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
        dR.i[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e2' || c == '\u00f2' || c == 'c' || c == '\u00e1') {
                field = dR.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dR.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fe' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dR.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void c() {
        Object[] objectArray = h;
        h[0] = "\u001b\u001a7ww-\r\u001a2-d:\u001aQ1+h.\u000b\u0016&<#9-";
        objectArray[1] = "\u0004\u001cnd\u001fa\u000f\u0013\u007f+by\u001c\u0014vb";
        objectArray[2] = "\nWf'-\u0016\u007fwm(<Y\u001eyf#8\u0003j";
        objectArray[3] = "z}uC?\u0010qrd\f^\u001ezy`V";
        objectArray[4] = "=M&e6\u000ejK6\u001b)^,b9`9I1V(z5UP\u0017hv/\b7\\nb>3=M&e6\u000ejK6\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "[uE%\n \fsU[\u0007\u001d\u000fh\t&\u0015&W{\n&npUdI?S'St7";
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
        int n = dR.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = dR.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dR.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dR.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dR.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dR.f(252319468902427L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dR.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dR.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dR.f(252319468902427L, 0L);
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
            int n = dR.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                dR.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dR.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dR.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dR.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dR.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public dR a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x4505D938947L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        super.a(objectArray2);
        return this;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @cP
    public String[] a() {
        return this.a;
    }

    @Override
    public dK a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x4BC64C39CA20L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        return dR.a("T", (Object)this, (Object)objectArray2, (long)-9174031796635432850L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = dR.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = dR.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dR.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dR.c(clazz3, string2, clazz2)) != null) {
                    dR.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dR.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dR.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dR.f(252319468902427L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    @cP
    public dK setDescription(String string) {
        long l = f ^ 0x5C87EE0036F3L;
        return dR.a("T", (Object)this, (Object)string, (long)8472708289050440570L, (long)l);
    }

    @Override
    @cP
    public dR setDescription(String string) {
        super.setDescription(string);
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dR.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


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

final class dJ {
    private long a;
    private float b;
    private static final long c = hc.a(-578665952515539748L, -8099461184764531000L, MethodHandles.lookup().lookupClass()).a(98313151737501L);
    private static final Object[] d = new Object[10];
    private static final String[] e = new String[10];

    private dJ(float f, long l) {
        l = c ^ l;
        this.a = (long)dJ.a("h", (long)7044287142143136850L, (long)l);
        this.b = f;
    }

    static {
        dJ.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dJ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dJ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dJ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dJ.b(classArray[i], string, clazz2);
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
            int n = dJ.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                dJ.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = dJ.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = dJ.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dJ.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dJ.a(clazz3, string2, clazz2)) != null) {
                    dJ.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dJ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dJ.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dJ.b(455882494411441L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dJ.a(l, l2);
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
                clazz3 = dJ.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dJ.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dJ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dJ.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dJ.b(455882494411441L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dJ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dJ.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dJ.b(455882494411441L, 0L);
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

    private boolean a(Object[] objectArray) {
        float f;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                l = c ^ l;
                CallSite callSite = dJ.a("h", (long)7898112092692214690L, (long)l);
                try {
                    float f10 = (float)(dJ.a("h", (long)7897130808606398472L, (long)l) - this.a) - this.b;
                    f = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    if (callSite != null) break block2;
                    if (f < 0) break block3;
                }
                catch (MatchException matchException) {
                    throw dJ.a("h", (Object)matchException, (long)7897197630663365274L, (long)l);
                }
                f = 1;
                break block2;
            }
            f = 0;
        }
        return (boolean)f;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'd' || c == 'P' || c == 'G' || c == '\u00cf') {
                field = dJ.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dJ.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dJ.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = ")\u0007-yU)?\u0007(#F>(L+%J*9\u000b<2\u00018\u0005";
        objectArray[1] = "Y}yL\bg,]rC\u0019(QEaD\u0010a9";
        objectArray[2] = "SM\u0005=vZEM\u0000geMR\u0006\u0003aiYCA\u0014v\"N}";
        objectArray[3] = "\u0003G\u001ejEI\bH\u000f%&D\u001dE\u0000N\u0013F\fV\u001cb\u0004K";
        objectArray[4] = "~ \u007f\u0006e?u/nI\u0018*g5l\n";
        objectArray[5] = Long.TYPE;
        dJ.e[5] = "java/lang/Long";
        objectArray[6] = "p\\n4b\u0014{S\u007f{\u0003\u001apX{!";
        objectArray[7] = "+rF|\u0000\r-oX\u0007[=v$\u0005?[V-}\u0003|1";
        objectArray[8] = "!|$\\*|do\u007f\u0004A*\u0018(.\u0001<3{(vE#C\"rwE1 \"*3ZA";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "pGu#K>2\u0016|19;6\u0003t._,\u0017\u0018k.|1/\u001do89k7\u000602\u00036,\u0015kC";
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
            case 0 -> 27;
            case 1 -> 52;
            case 2 -> 19;
            case 3 -> 1;
            case 4 -> 20;
            case 5 -> 53;
            case 6 -> 17;
            case 7 -> 44;
            case 8 -> 0;
            case 9 -> 60;
            case 10 -> 7;
            case 11 -> 42;
            case 12 -> 4;
            case 13 -> 16;
            case 14 -> 48;
            case 15 -> 29;
            case 16 -> 28;
            case 17 -> 36;
            case 18 -> 39;
            case 19 -> 18;
            case 20 -> 58;
            case 21 -> 15;
            case 22 -> 23;
            case 23 -> 34;
            case 24 -> 13;
            case 25 -> 2;
            case 26 -> 6;
            case 27 -> 37;
            case 28 -> 55;
            case 29 -> 12;
            case 30 -> 25;
            case 31 -> 5;
            case 32 -> 62;
            case 33 -> 54;
            case 34 -> 21;
            case 35 -> 32;
            case 36 -> 45;
            case 37 -> 31;
            case 38 -> 22;
            case 39 -> 57;
            case 40 -> 46;
            case 41 -> 24;
            case 42 -> 63;
            case 43 -> 11;
            case 44 -> 50;
            case 45 -> 26;
            case 46 -> 8;
            case 47 -> 10;
            case 48 -> 33;
            case 49 -> 40;
            case 50 -> 9;
            case 51 -> 51;
            case 52 -> 30;
            case 53 -> 3;
            case 54 -> 43;
            case 55 -> 41;
            case 56 -> 59;
            case 57 -> 38;
            case 58 -> 14;
            case 59 -> 35;
            case 60 -> 61;
            case 61 -> 49;
            case 62 -> 56;
            default -> 47;
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
        dJ.e[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            return MethodHandles.lookup().findStatic(dJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


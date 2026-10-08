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
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ax
 */
final class ax_0 {
    private final String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private static final long f = hc.a(3443941901207030218L, -4295200223080171602L, MethodHandles.lookup().lookupClass()).a(10627901165226L);
    private static final Object[] g = new Object[7];
    private static final String[] h = new String[7];

    private ax_0(String string) {
        this.a = string;
    }

    static {
        ax_0.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ax_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ax_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ax_0.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ax_0.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ax_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ax_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void b(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        Throwable throwable = (Throwable)objectArray[2];
        ++this.d;
    }

    private void c(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        this.b += n;
    }

    private static Field c(long l, long l2) {
        int n = ax_0.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = ax_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ax_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ax_0.a(clazz3, string2, clazz2)) != null) {
                    ax_0.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ax_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ax_0.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ax_0.b(303409901834426L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ax_0.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = ax_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ax_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ax_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ax_0.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ax_0.b(303409901834426L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ax_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ax_0.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ax_0.b(303409901834426L, 0L);
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

    private void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        Throwable throwable = (Throwable)objectArray[2];
        ++this.e;
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
            if (c == 'm' || c == 'R' || c == '\u00f4' || c == '\u00ca') {
                field = ax_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ax_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ax" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ax_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean a(Object[] objectArray) {
        int n;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                l = f ^ l;
                CallSite callSite = ax_0.a("\u00ed", (long)719803341732718903L, (long)l);
                try {
                    n = this.d;
                    if (callSite != null) break block2;
                    if (n <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw ax_0.a("\u00ed", (Object)matchException, (long)719880763181754052L, (long)l);
                }
                n = 1;
                break block2;
            }
            n = 0;
        }
        return n != 0;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 50;
            case 1 -> 5;
            case 2 -> 63;
            case 3 -> 8;
            case 4 -> 21;
            case 5 -> 29;
            case 6 -> 13;
            case 7 -> 24;
            case 8 -> 39;
            case 9 -> 18;
            case 10 -> 59;
            case 11 -> 53;
            case 12 -> 37;
            case 13 -> 43;
            case 14 -> 26;
            case 15 -> 54;
            case 16 -> 2;
            case 17 -> 3;
            case 18 -> 56;
            case 19 -> 22;
            case 20 -> 61;
            case 21 -> 28;
            case 22 -> 30;
            case 23 -> 15;
            case 24 -> 6;
            case 25 -> 25;
            case 26 -> 19;
            case 27 -> 35;
            case 28 -> 10;
            case 29 -> 9;
            case 30 -> 57;
            case 31 -> 36;
            case 32 -> 16;
            case 33 -> 49;
            case 34 -> 47;
            case 35 -> 41;
            case 36 -> 17;
            case 37 -> 0;
            case 38 -> 32;
            case 39 -> 33;
            case 40 -> 4;
            case 41 -> 1;
            case 42 -> 60;
            case 43 -> 44;
            case 44 -> 12;
            case 45 -> 55;
            case 46 -> 31;
            case 47 -> 45;
            case 48 -> 14;
            case 49 -> 46;
            case 50 -> 52;
            case 51 -> 34;
            case 52 -> 7;
            case 53 -> 42;
            case 54 -> 40;
            case 55 -> 58;
            case 56 -> 48;
            case 57 -> 20;
            case 58 -> 11;
            case 59 -> 27;
            case 60 -> 23;
            case 61 -> 62;
            case 62 -> 38;
            default -> 51;
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
        ax_0.h[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "`K\u0019Jf6vK\u001c\u0010u!a\u0000\u001f\u0016y5pG\b\u00012'L";
        objectArray[1] = "U \u000fVAz \u0000\u0004YP5]\u0018\u0017^Y|5";
        objectArray[2] = "x%\u001a\u0015\t(n%\u001fO\u001a?yn\u001cI\u0016+h)\u000b^]9d";
        objectArray[3] = "63\u0018T:[=<\t\u001bYV(1\u0006plT9\"\u001a\\{Y";
        objectArray[4] = "\u0003}\u0010x\"I\br\u00017CG\u0003y\u0005m";
        objectArray[5] = "=\u0015;Qlvi\u0019>7f\u0006n\u001a0I5g8F3N\f";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "pxU).\u000b8r\u00067VYI9Xg.B5sYfo0s?X#$L9>YbV";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private String a(Object[] objectArray) {
        return this.b + "|" + this.e + "|" + this.d;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ax_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


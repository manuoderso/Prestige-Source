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
import java.util.LinkedHashMap;
import java.util.Map;

class g2
extends LinkedHashMap {
    final int a;
    private static final long b = hc.a(-1322440562898826368L, -5979817596616177475L, MethodHandles.lookup().lookupClass()).a(1868620114277L);
    private static final Object[] c = new Object[9];
    private static final String[] d = new String[9];

    g2(int n, float f, boolean bl, int n2) {
        this.a = n2;
        super(n, f, bl);
    }

    static {
        g2.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g2.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g2.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g2.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g2.b(classArray[i], string, clazz2);
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
            int n = g2.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                g2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = g2.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = g2.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g2.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g2.a(clazz3, string2, clazz2)) != null) {
                    g2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g2.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g2.b(391369029135666L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = g2.a(l, l2);
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
                clazz3 = g2.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g2.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g2.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g2.b(391369029135666L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g2.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g2.b(391369029135666L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/g2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dd' || c == '\u00d1' || c == 'D' || c == '\u00e7') {
                field = g2.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g2.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = g2.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 51;
            case 1 -> 44;
            case 2 -> 3;
            case 3 -> 29;
            case 4 -> 52;
            case 5 -> 33;
            case 6 -> 36;
            case 7 -> 23;
            case 8 -> 43;
            case 9 -> 59;
            case 10 -> 27;
            case 11 -> 57;
            case 12 -> 58;
            case 13 -> 4;
            case 14 -> 12;
            case 15 -> 18;
            case 16 -> 30;
            case 17 -> 5;
            case 18 -> 45;
            case 19 -> 31;
            case 20 -> 7;
            case 21 -> 42;
            case 22 -> 35;
            case 23 -> 55;
            case 24 -> 46;
            case 25 -> 17;
            case 26 -> 19;
            case 27 -> 61;
            case 28 -> 22;
            case 29 -> 37;
            case 30 -> 24;
            case 31 -> 56;
            case 32 -> 9;
            case 33 -> 50;
            case 34 -> 0;
            case 35 -> 11;
            case 36 -> 47;
            case 37 -> 6;
            case 38 -> 41;
            case 39 -> 63;
            case 40 -> 49;
            case 41 -> 2;
            case 42 -> 40;
            case 43 -> 34;
            case 44 -> 48;
            case 45 -> 21;
            case 46 -> 25;
            case 47 -> 10;
            case 48 -> 54;
            case 49 -> 32;
            case 50 -> 62;
            case 51 -> 38;
            case 52 -> 1;
            case 53 -> 14;
            case 54 -> 15;
            case 55 -> 16;
            case 56 -> 53;
            case 57 -> 13;
            case 58 -> 28;
            case 59 -> 26;
            case 60 -> 39;
            case 61 -> 8;
            case 62 -> 20;
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
        g2.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = ":F%\u001fb$,F Eq3;\r#C}'*J4T65\u0016";
        objectArray[1] = "&;Y\tzMS\u001bR\u0006k\u0002.\u0003A\u0001bKF";
        objectArray[2] = "P\u0003\u0018\u001a^*F\u0003\u001d@M=QH\u001eFA)@\u000f\tQ\n=\u0006";
        objectArray[3] = "]!\u0014\u0010\tIV.\u0005_jDC#\n4_FR0\u0016\u0018HK";
        objectArray[4] = Integer.TYPE;
        g2.d[4] = "java/lang/Integer";
        objectArray[5] = ":\u001c\u0007G\u0002h1\u0013\u0016\bcf:\u0018\u0012R";
        objectArray[6] = "q&\nU\n#v!\u0005hPQ.%\u0018\u0014@mrc\u001a\u0005:";
        objectArray[7] = "$\u0015h)x> U`uD5\u001dTcw\">-_2k%\\'\u0001it&l,PusD";
        Object[] objectArray2 = objectArray;
        objectArray[8] = ")C\u001f-o\t-\u0003\u0017qS\u0010qJ\u0016\u0016i\u0015u\b@g*\u000fi\\{";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    protected boolean removeEldestEntry(Map.Entry entry) {
        Object object;
        block4: {
            block5: {
                long l = b ^ 0xF2EF978B94EL;
                CallSite callSite = g2.a("\u00e4", (long)4208224428727376L, (long)l);
                try {
                    try {
                        object = g2.a("\u00c3", (Object)this, (long)3752515897789074L, (long)l);
                        if (callSite != null) break block4;
                        if (object <= this.a) break block5;
                    }
                    catch (MatchException matchException) {
                        throw g2.a("\u00e4", (Object)matchException, (long)4115737096990823L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw g2.a("\u00e4", (Object)matchException, (long)4115737096990823L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


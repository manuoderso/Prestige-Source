/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.du_0;
import dev.zprestige.prestige.dw_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.zprestige.prestige.dv
 */
class dv_0
implements fW {
    final dw_0 a;
    private static final long b = hc.a(-4713209837934056616L, 4578206182303633540L, MethodHandles.lookup().lookupClass()).a(223620351799448L);
    private static final Object[] c = new Object[6];
    private static final String[] d = new String[6];

    dv_0(dw_0 dw_02) {
        this.a = dw_02;
    }

    static {
        dv_0.b();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dv_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dv_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dv_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dv_0.b(classArray[i], string, clazz2);
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
            int n = dv_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                dv_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "t[\u0011$VAqN\u001a$UF~G\u0011f\u0014qW\u001bF";
        objectArray[1] = Integer.TYPE;
        dv_0.d[1] = "java/lang/Integer";
        objectArray[2] = Float.TYPE;
        dv_0.d[2] = "java/lang/Float";
        objectArray[3] = Void.TYPE;
        dv_0.d[3] = "java/lang/Void";
        objectArray[4] = "&Q#R\u0005$-^2\u001dd*&U6G";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "?z\u00143QK= \u001aUN\u001e\rv\u001e;F\u00005,\u0011UZ\u001b=`\u001a+\u0010\u0001m\u0010F8\u001c\u00042t\u0013nXCP)\u0012h_\u00184|D,\u0018zi}B+C\u001e<+\u0006l!C=-\u00017E\u0016kiFU\u001b\u00114v\u001c(\u0018E0}\u007f";
    }

    private static Field c(long l, long l2) {
        int n = dv_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = dv_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dv_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dv_0.a(clazz3, string2, clazz2)) != null) {
                    dv_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dv_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dv_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dv_0.b(284722726002394L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dv_0.a(l, l2);
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
                clazz3 = dv_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dv_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dv_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dv_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dv_0.b(284722726002394L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dv_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dv_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dv_0.b(284722726002394L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dv_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == 'R' || c == '\u00e9' || c == '\u00c2') {
                field = dv_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dv_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/dv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 18;
            case 1 -> 8;
            case 2 -> 47;
            case 3 -> 50;
            case 4 -> 20;
            case 5 -> 45;
            case 6 -> 12;
            case 7 -> 1;
            case 8 -> 27;
            case 9 -> 13;
            case 10 -> 32;
            case 11 -> 58;
            case 12 -> 28;
            case 13 -> 51;
            case 14 -> 30;
            case 15 -> 2;
            case 16 -> 21;
            case 17 -> 46;
            case 18 -> 22;
            case 19 -> 15;
            case 20 -> 35;
            case 21 -> 43;
            case 22 -> 9;
            case 23 -> 24;
            case 24 -> 61;
            case 25 -> 37;
            case 26 -> 33;
            case 27 -> 25;
            case 28 -> 17;
            case 29 -> 11;
            case 30 -> 56;
            case 31 -> 63;
            case 32 -> 54;
            case 33 -> 39;
            case 34 -> 36;
            case 35 -> 29;
            case 36 -> 6;
            case 37 -> 49;
            case 38 -> 10;
            case 39 -> 23;
            case 40 -> 3;
            case 41 -> 62;
            case 42 -> 5;
            case 43 -> 7;
            case 44 -> 59;
            case 45 -> 55;
            case 46 -> 44;
            case 47 -> 34;
            case 48 -> 48;
            case 49 -> 60;
            case 50 -> 52;
            case 51 -> 19;
            case 52 -> 16;
            case 53 -> 53;
            case 54 -> 57;
            case 55 -> 31;
            case 56 -> 4;
            case 57 -> 41;
            case 58 -> 40;
            case 59 -> 26;
            case 60 -> 14;
            case 61 -> 42;
            case 62 -> 38;
            default -> 0;
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
        dv_0.d[n3] = new String(cArray);
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

    @Override
    public void a(dy_0 dy_02) {
        long l = b ^ 0x2A3E670B11BDL;
        dv_0.a("\u00a3", (int)du_0.g, (float)this.a.a, (float)this.a.b, (float)this.a.c, (float)this.a.d, (long)-8382315798498660936L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dv_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


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
public class dT
extends dK {
    private final String a;
    private static final long f = hc.a(-1411491741015124405L, -4234125475523250566L, MethodHandles.lookup().lookupClass()).a(158084829774188L);
    private static final Object[] h = new Object[6];
    private static final String[] i = new String[6];

    public dT(String string, String string2, String string3) {
        super(string, string2);
        this.a = string3;
    }

    static {
        dT.c();
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
            case 0 -> 20;
            case 1 -> 6;
            case 2 -> 35;
            case 3 -> 28;
            case 4 -> 60;
            case 5 -> 49;
            case 6 -> 4;
            case 7 -> 27;
            case 8 -> 51;
            case 9 -> 30;
            case 10 -> 23;
            case 11 -> 50;
            case 12 -> 46;
            case 13 -> 13;
            case 14 -> 34;
            case 15 -> 32;
            case 16 -> 17;
            case 17 -> 38;
            case 18 -> 52;
            case 19 -> 26;
            case 20 -> 0;
            case 21 -> 58;
            case 22 -> 42;
            case 23 -> 22;
            case 24 -> 59;
            case 25 -> 45;
            case 26 -> 2;
            case 27 -> 11;
            case 28 -> 24;
            case 29 -> 37;
            case 30 -> 31;
            case 31 -> 43;
            case 32 -> 1;
            case 33 -> 61;
            case 34 -> 19;
            case 35 -> 40;
            case 36 -> 36;
            case 37 -> 48;
            case 38 -> 53;
            case 39 -> 55;
            case 40 -> 47;
            case 41 -> 3;
            case 42 -> 18;
            case 43 -> 62;
            case 44 -> 44;
            case 45 -> 5;
            case 46 -> 39;
            case 47 -> 21;
            case 48 -> 33;
            case 49 -> 15;
            case 50 -> 14;
            case 51 -> 41;
            case 52 -> 29;
            case 53 -> 56;
            case 54 -> 16;
            case 55 -> 63;
            case 56 -> 25;
            case 57 -> 12;
            case 58 -> 54;
            case 59 -> 7;
            case 60 -> 10;
            case 61 -> 57;
            case 62 -> 8;
            default -> 9;
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
        dT.i[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00da' || c == '\u00a5' || c == '\u00ce') {
                field = dT.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dT.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dT.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void c() {
        Object[] objectArray = h;
        h[0] = "xlhYAqnlm\u0003Rfy'n\u0005^rh`y\u0012\u0015eH";
        objectArray[1] = "6KzKP\u0012=Dk\u0004-\n.CbM";
        objectArray[2] = "|B\u007f\u0002P\f\tbt\rAChl\u007f\u0006E\u0019\u001c";
        objectArray[3] = "~o\u0010\u000b5Qu`\u0001DT_~k\u0005\u001e";
        objectArray[4] = "LElT3?M\u0014\u0005D=|d\u0015~T*aP\u0004dX6\u0000\u0011\u00134A4o\u0017\u0006iGPd\u0015\u0011n\\oeDx";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "\u0010'\n\u0001e(\u0011vc\u0003\u0006.\u0013vRSk}H{\u001ajb*\u001dq\u0000Uc{t";
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

    public String c(Object[] objectArray) {
        return this.a;
    }

    private static Method h(long l, long l2) {
        int n = dT.e(l, l2);
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
                clazz3 = dT.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dT.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dT.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dT.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dT.f(235726659168757L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dT.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dT.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dT.f(235726659168757L, 0L);
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
            int n = dT.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                dT.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dT.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dT.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dT.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dT.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public dT a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x234C2B7AF604L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        super.a(objectArray2);
        return this;
    }

    @Override
    public dK a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x7141F3011E1DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        return dT.a("Z", (Object)this, (Object)objectArray2, (long)-9174032542082332751L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = dT.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = dT.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dT.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dT.c(clazz3, string2, clazz2)) != null) {
                    dT.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dT.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dT.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dT.f(235726659168757L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    @cP
    public dT setDescription(String string) {
        super.setDescription(string);
        return this;
    }

    @Override
    @cP
    public dK setDescription(String string) {
        long l = f ^ 0x411C27D19D8DL;
        return dT.a("Z", (Object)this, (Object)string, (long)8472702629078964890L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


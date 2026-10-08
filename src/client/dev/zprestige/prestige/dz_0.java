/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntSupplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dz
 */
public class dz_0 {
    private IntSupplier a;
    private OptionalInt b;
    private OptionalDouble c;
    private fT d;
    private static final long e = hc.a(-5039130358711363039L, -9196835930288220007L, MethodHandles.lookup().lookupClass()).a(139205704749559L);
    private static final Object[] f = new Object[5];
    private static final String[] g = new String[5];

    public dz_0(long l) {
        l = e ^ l;
        this.a = dz_0::lambda$new$0;
        this.b = dz_0.a("\u00dd", (long)-2319583513206816125L, (long)l);
        this.c = dz_0.a("\u00dd", (long)-2319638743556281934L, (long)l);
    }

    static {
        dz_0.a();
    }

    public dz_0 e(Object[] objectArray) {
        fT fT2 = (fT)objectArray[0];
        this.d = fT2;
        return this;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dz_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dz_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dz_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dz_0.b(classArray[i], string, clazz2);
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
            int n = dz_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                dz_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public dz_0 b(Object[] objectArray) {
        IntSupplier intSupplier = (IntSupplier)objectArray[0];
        this.a = intSupplier;
        return this;
    }

    private static Field c(long l, long l2) {
        int n = dz_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = dz_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dz_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dz_0.a(clazz3, string2, clazz2)) != null) {
                    dz_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dz_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dz_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dz_0.b(146493919907143L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public dz_0 c(Object[] objectArray) {
        OptionalInt optionalInt = (OptionalInt)objectArray[0];
        this.b = optionalInt;
        return this;
    }

    public dz_0 d(Object[] objectArray) {
        OptionalDouble optionalDouble = (OptionalDouble)objectArray[0];
        this.c = optionalDouble;
        return this;
    }

    private static Method d(long l, long l2) {
        int n = dz_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = dz_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dz_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dz_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dz_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dz_0.b(146493919907143L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dz_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dz_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dz_0.b(146493919907143L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c5' || c == '\u00fc' || c == 'b' || c == 'x') {
                field = dz_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dz_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/dz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dz_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public dy_0 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = e ^ l) ^ 0x6FEB787E70FFL;
        return new dy_0(this, l2);
    }

    public dz_0 a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        this.a = () -> dz_0.lambda$targetFramebuffer$1(n);
        return this;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 51;
            case 2 -> 49;
            case 3 -> 5;
            case 4 -> 11;
            case 5 -> 31;
            case 6 -> 19;
            case 7 -> 38;
            case 8 -> 40;
            case 9 -> 6;
            case 10 -> 46;
            case 11 -> 28;
            case 12 -> 42;
            case 13 -> 7;
            case 14 -> 62;
            case 15 -> 54;
            case 16 -> 53;
            case 17 -> 43;
            case 18 -> 33;
            case 19 -> 14;
            case 20 -> 48;
            case 21 -> 56;
            case 22 -> 59;
            case 23 -> 17;
            case 24 -> 36;
            case 25 -> 35;
            case 26 -> 52;
            case 27 -> 18;
            case 28 -> 13;
            case 29 -> 26;
            case 30 -> 8;
            case 31 -> 24;
            case 32 -> 39;
            case 33 -> 15;
            case 34 -> 37;
            case 35 -> 16;
            case 36 -> 55;
            case 37 -> 41;
            case 38 -> 10;
            case 39 -> 22;
            case 40 -> 44;
            case 41 -> 21;
            case 42 -> 61;
            case 43 -> 12;
            case 44 -> 58;
            case 45 -> 50;
            case 46 -> 63;
            case 47 -> 32;
            case 48 -> 2;
            case 49 -> 9;
            case 50 -> 45;
            case 51 -> 20;
            case 52 -> 4;
            case 53 -> 60;
            case 54 -> 30;
            case 55 -> 34;
            case 56 -> 3;
            case 57 -> 47;
            case 58 -> 25;
            case 59 -> 27;
            case 60 -> 1;
            case 61 -> 0;
            case 62 -> 29;
            default -> 23;
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
        dz_0.g[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0007W~\\\rY\u0019_d\u0013l\\\u0019_gSB@)Y}_OI";
        objectArray[1] = "qm\n>U\u0014oe\u0010q4\u0011oe\u00131\u001a\rRb\b";
        objectArray[2] = "rTWM%Ty[F\u0002DZrPBX";
        objectArray[3] = "<\u0017\u0017E^5\"[\u000b7U-$Z\u00057Xy?T\u0012JF5#&";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "AW:lbw\u0006\u0001 \u001ebwF\u0010)\u001ep)\\\u001e5{7\u007fFl";
    }

    private static int lambda$new$0() {
        return 0;
    }

    private static int lambda$targetFramebuffer$1(int n) {
        return n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dz_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


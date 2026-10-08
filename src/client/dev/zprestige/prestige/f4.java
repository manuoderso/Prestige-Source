/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.A;
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
public final class f4 {
    public final A a;
    public final float b;
    public final float c;
    private static final long d = hc.a(814926770736941427L, -2708152456678885650L, MethodHandles.lookup().lookupClass()).a(42460135770192L);
    private static final Object[] e = new Object[10];
    private static final String[] f = new String[10];

    private f4(A a, float f, float f10) {
        this.a = a;
        this.b = f;
        this.c = f10;
    }

    static {
        f4.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f4.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f4.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = f4.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                f4.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean b(Object[] objectArray) {
        float f;
        block2: {
            block3: {
                float f10 = ((Float)objectArray[0]).floatValue();
                long l = (Long)objectArray[1];
                l = d ^ l;
                CallSite callSite = f4.a("P", (long)6196253567494968168L, (long)l);
                try {
                    float f11 = f10 - this.c - 0.0f;
                    f = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (callSite != null) break block2;
                    if (f > 0) break block3;
                }
                catch (MatchException matchException) {
                    throw f4.a("P", (Object)matchException, (long)6196486467525462020L, (long)l);
                }
                f = 1;
                break block2;
            }
            f = 0;
        }
        return (boolean)f;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = f4.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f4.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = f4.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = f4.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f4.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f4.a(clazz3, string2, clazz2)) != null) {
                    f4.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f4.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f4.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f4.b(481029312590360L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = f4.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = f4.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f4.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f4.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        f4.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f4.b(481029312590360L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f4.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f4.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f4.b(481029312590360L, 0L);
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
            if (c == 's' || c == '\u00c3' || c == '\u00b5' || c == '\u00f4') {
                field = f4.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f4.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/f4" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = f4.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean a(Object[] objectArray) {
        boolean bl;
        try {
            bl = this.a != null;
        }
        catch (MatchException matchException) {
            throw f4.a(matchException);
        }
        return bl;
    }

    public float a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        l = d ^ l;
        return (float)f4.a("P", (float)0.0f, (float)(f - this.c), (long)4603266855843301656L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 45;
            case 1 -> 56;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> 48;
            case 5 -> 49;
            case 6 -> 17;
            case 7 -> 9;
            case 8 -> 59;
            case 9 -> 60;
            case 10 -> 23;
            case 11 -> 1;
            case 12 -> 52;
            case 13 -> 26;
            case 14 -> 21;
            case 15 -> 0;
            case 16 -> 63;
            case 17 -> 58;
            case 18 -> 41;
            case 19 -> 50;
            case 20 -> 25;
            case 21 -> 32;
            case 22 -> 6;
            case 23 -> 40;
            case 24 -> 15;
            case 25 -> 18;
            case 26 -> 11;
            case 27 -> 38;
            case 28 -> 39;
            case 29 -> 53;
            case 30 -> 8;
            case 31 -> 31;
            case 32 -> 10;
            case 33 -> 62;
            case 34 -> 4;
            case 35 -> 14;
            case 36 -> 42;
            case 37 -> 22;
            case 38 -> 54;
            case 39 -> 5;
            case 40 -> 20;
            case 41 -> 27;
            case 42 -> 24;
            case 43 -> 34;
            case 44 -> 7;
            case 45 -> 30;
            case 46 -> 13;
            case 47 -> 43;
            case 48 -> 44;
            case 49 -> 36;
            case 50 -> 28;
            case 51 -> 12;
            case 52 -> 33;
            case 53 -> 57;
            case 54 -> 61;
            case 55 -> 46;
            case 56 -> 19;
            case 57 -> 51;
            case 58 -> 37;
            case 59 -> 29;
            case 60 -> 35;
            case 61 -> 16;
            case 62 -> 47;
            default -> 55;
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
        f4.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "F\u001d\u000epajP\u001d\u000b*r}GV\b,~iV\u0011\u001f;5{j";
        objectArray[1] = "m\u0007\u0014\u0013\tj\u0018'\u001f\u001c\u0018%e?\f\u001b\u0011l\r";
        objectArray[2] = "\u001b\u0007\\)\u000eQ\r\u0007Ys\u001dF\u001aLZu\u0011R\u000b\u000bMbZGK";
        objectArray[3] = "\nwYF|(\u0001xH\t\u001f%\u0014uGb*'\u0005f[N=*";
        objectArray[4] = "D\tgqbsO\u0006v>\u0001~Z\u0000";
        objectArray[5] = Float.TYPE;
        f4.f[5] = "java/lang/Float";
        objectArray[6] = "{&:yh\u0016p)+6\t\u0018{\"/l";
        objectArray[7] = "\f\u0012,bHe\t\u0003,\u000b\u0018\t\u000eH{e\u00001Y\u000bsyr";
        objectArray[8] = "\u000f:\u0018BQ=\u0006.X[)?6{Q]\u0015nF/H\u0005\u0016V\f8I\u0000\u0011&X!\u0011\u0003)";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "U$\u0018\u0014\b\u001b\u000enP_o\u001f\u0007la\u001f\u0017\u0016\n,\u0007V\u0001\u0015\u0000\u001cZ\\\u0003\u001e^z\u0013J\u0000\u0014n'\u0019H\u000bJ\bn\u000fK\u0001z";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


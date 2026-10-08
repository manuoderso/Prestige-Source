/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cu_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.zprestige.prestige.cv
 */
final class cv_0 {
    private static final long a = hc.a(4611003657153633792L, -5228034708336972007L, MethodHandles.lookup().lookupClass()).a(229356136101891L);
    private static final Object[] b = new Object[11];
    private static final String[] c = new String[11];

    private cv_0() {
    }

    static {
        cv_0.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cv_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cv_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cv_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cv_0.b(classArray[i], string, clazz2);
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
            int n = cv_0.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                cv_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = cv_0.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = cv_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cv_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cv_0.a(clazz3, string2, clazz2)) != null) {
                    cv_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cv_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cv_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cv_0.b(532141007085452L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cv_0.a(l, l2);
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
                clazz3 = cv_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cv_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cv_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cv_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cv_0.b(532141007085452L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cv_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cv_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cv_0.b(532141007085452L, 0L);
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

    @bP
    public void a(bG bG2) {
        block8: {
            int n;
            long l;
            long l2;
            block7: {
                l2 = a ^ 0x1F11EE845198L;
                l = l2 ^ 0x6D0A06D50BE5L;
                CallSite callSite = cv_0.a("\u00ca", (long)-1993891405299589735L, (long)l2);
                try {
                    try {
                        n = cu_0.a;
                        if (callSite != null) break block7;
                        if (n <= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw cv_0.a("\u00ca", (Object)matchException, (long)-1993906526476416877L, (long)l2);
                    }
                    n = cu_0.a = cu_0.a - 1;
                }
                catch (MatchException matchException) {
                    throw cv_0.a("\u00ca", (Object)matchException, (long)-1993906526476416877L, (long)l2);
                }
            }
            try {
                if (n == 0) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    cv_0.a("\u00ca", (Object)objectArray, (long)-1993692286228822960L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw cv_0.a("\u00ca", (Object)matchException, (long)-1993906526476416877L, (long)l2);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == 'r' || c == 'Y' || c == 't') {
                field = cv_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cv_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cv_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "Kn?%27]n:\u007f! J%9y-4[b.nf&g";
        objectArray[1] = "_\u001e#\f)'*>(\u00038hW&;\u00041!?";
        objectArray[2] = "P3\t_?VF3\f\u0005,AQx\u000f\u0003 U@?\u0018\u0014kEB";
        objectArray[3] = "YU\u0014\u001cygRZ\u0005S\u001ajGW\n8/hVD\u0016\u00148e";
        objectArray[4] = "Yv/\"\u0013\u001cOv*x\u0000\u000bX=)~\f\u001fIz>iG\u000fH";
        objectArray[5] = "aM\u001936\u000e\u0014m\u0012<'Auc\u00197#\u001b\u0001";
        objectArray[6] = Void.TYPE;
        cv_0.c[6] = "java/lang/Void";
        objectArray[7] = "=bCC9\b6mR\fX\u0006=fVV";
        objectArray[8] = "\u001eyg\u001c[`M{.}^\u0010\u001a.nDS(O%!E4";
        objectArray[9] = "\u0000PLxdZ\u0004RMqX]9\u000f@p=_\u0007\u0004_\u007f24\u0003XLt3\n\bGC{X";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\u001c~|n\u001f\u0005]=b>\"\u0013'tz~\u001a\u0012\u001e\"hxMx\u001b!h9X\u0011\u001e*jl\"";
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
            case 0 -> 24;
            case 1 -> 30;
            case 2 -> 23;
            case 3 -> 34;
            case 4 -> 16;
            case 5 -> 50;
            case 6 -> 38;
            case 7 -> 62;
            case 8 -> 11;
            case 9 -> 55;
            case 10 -> 25;
            case 11 -> 19;
            case 12 -> 27;
            case 13 -> 45;
            case 14 -> 46;
            case 15 -> 5;
            case 16 -> 39;
            case 17 -> 28;
            case 18 -> 41;
            case 19 -> 6;
            case 20 -> 61;
            case 21 -> 60;
            case 22 -> 9;
            case 23 -> 44;
            case 24 -> 32;
            case 25 -> 49;
            case 26 -> 7;
            case 27 -> 51;
            case 28 -> 42;
            case 29 -> 31;
            case 30 -> 20;
            case 31 -> 35;
            case 32 -> 0;
            case 33 -> 26;
            case 34 -> 58;
            case 35 -> 47;
            case 36 -> 1;
            case 37 -> 15;
            case 38 -> 22;
            case 39 -> 10;
            case 40 -> 53;
            case 41 -> 4;
            case 42 -> 48;
            case 43 -> 57;
            case 44 -> 54;
            case 45 -> 56;
            case 46 -> 33;
            case 47 -> 8;
            case 48 -> 17;
            case 49 -> 13;
            case 50 -> 29;
            case 51 -> 52;
            case 52 -> 59;
            case 53 -> 43;
            case 54 -> 18;
            case 55 -> 12;
            case 56 -> 40;
            case 57 -> 63;
            case 58 -> 14;
            case 59 -> 21;
            case 60 -> 36;
            case 61 -> 3;
            case 62 -> 2;
            default -> 37;
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
        cv_0.c[n3] = new String(cArray);
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
            return MethodHandles.lookup().findStatic(cv_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


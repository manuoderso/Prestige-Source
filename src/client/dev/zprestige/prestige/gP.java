/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

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

public record gP(boolean bP, boolean bQ) implements fW
{
    private static final long b = hc.a(-1953841065190723421L, -9080108207219019685L, MethodHandles.lookup().lookupClass()).a(116102247798746L);
    private static final Object[] c = new Object[11];
    private static final String[] d = new String[11];

    static {
        gP.b();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gP.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gP.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "L^Z'`BZ^_}sUM\u0015\\{\u007fA\\RKl4S`";
        objectArray[1] = "\tHr5I)|hy:Xf\u0001pj=Q/i";
        objectArray[2] = "x8|\\\u0012#n8y\u0006\u00014ysz\u0000\r h4m\u0017F4L";
        objectArray[3] = "\r?\\)\nG\u00060MfiJ\u0013=B\r\\H\u0002.^!KE";
        objectArray[4] = ".hDj&\u001b+}Oj%\u001c$tD(d+\r+\u0012";
        objectArray[5] = Boolean.TYPE;
        gP.d[5] = "java/lang/Boolean";
        objectArray[6] = Void.TYPE;
        gP.d[6] = "java/lang/Void";
        objectArray[7] = "ub)&n%~m8i\u000f+uf<3";
        objectArray[8] = "L[\u0005\brF\u001dMPbu7_\u0000\u0007\u0005\u007fKBD\u0005b";
        objectArray[9] = "m\u0000%\u001e&\rh\u0018|FOXTK\u007f\u0010>\b-\u00138\u000b+1nO(\bvH6\b3\u001dO";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "QSZw\u0014]WL\\:e\r\u000fb\b?\u0019\u0002.G\u001e$e^QQ\u001a=\u001b\u0002WQ\u0019GY\t\r\u0013\u0019!\n\u0002\u0011\u0011e";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gP.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                gP.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gP.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gP.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = gP.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = gP.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gP.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gP.a(clazz3, string2, clazz2)) != null) {
                    gP.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gP.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gP.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gP.b(547878128612723L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gP.a(l, l2);
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
                clazz3 = gP.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gP.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gP.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gP.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gP.b(547878128612723L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gP.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gP.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gP.b(547878128612723L, 0L);
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

    @Override
    public void a(dy_0 dy_02) {
        long l = b ^ 0x6155E0F1E7C1L;
        gP.a("\u00a3", (boolean)this.bP, (long)-8381230589095273806L, (long)l);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == '\u00d8' || c == 'h' || c == '\u00f1') {
                field = gP.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gP.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = gP.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 43;
            case 1 -> 6;
            case 2 -> 27;
            case 3 -> 18;
            case 4 -> 37;
            case 5 -> 60;
            case 6 -> 21;
            case 7 -> 0;
            case 8 -> 7;
            case 9 -> 23;
            case 10 -> 41;
            case 11 -> 34;
            case 12 -> 51;
            case 13 -> 35;
            case 14 -> 1;
            case 15 -> 63;
            case 16 -> 2;
            case 17 -> 56;
            case 18 -> 11;
            case 19 -> 24;
            case 20 -> 4;
            case 21 -> 47;
            case 22 -> 20;
            case 23 -> 45;
            case 24 -> 31;
            case 25 -> 28;
            case 26 -> 3;
            case 27 -> 32;
            case 28 -> 9;
            case 29 -> 61;
            case 30 -> 57;
            case 31 -> 29;
            case 32 -> 12;
            case 33 -> 50;
            case 34 -> 59;
            case 35 -> 25;
            case 36 -> 44;
            case 37 -> 5;
            case 38 -> 46;
            case 39 -> 36;
            case 40 -> 52;
            case 41 -> 10;
            case 42 -> 19;
            case 43 -> 22;
            case 44 -> 39;
            case 45 -> 8;
            case 46 -> 53;
            case 47 -> 14;
            case 48 -> 26;
            case 49 -> 49;
            case 50 -> 54;
            case 51 -> 48;
            case 52 -> 16;
            case 53 -> 30;
            case 54 -> 33;
            case 55 -> 55;
            case 56 -> 13;
            case 57 -> 17;
            case 58 -> 15;
            case 59 -> 38;
            case 60 -> 42;
            case 61 -> 40;
            case 62 -> 58;
            default -> 62;
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
        gP.d[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void a() {
        block5: {
            boolean bl;
            long l;
            block4: {
                l = b ^ 0x3CC56779E55L;
                CallSite callSite = gP.a("\u00a3", (long)-992160296213797779L, (long)l);
                try {
                    try {
                        bl = this.bQ;
                        if (callSite != null) break block4;
                        if (bl == this.bP) break block5;
                    }
                    catch (MatchException matchException) {
                        throw gP.a("\u00a3", (Object)matchException, (long)-992126894942227893L, (long)l);
                    }
                    bl = this.bQ;
                }
                catch (MatchException matchException) {
                    throw gP.a("\u00a3", (Object)matchException, (long)-992126894942227893L, (long)l);
                }
            }
            gP.a("\u00a3", (boolean)bl, (long)-992056670415690970L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


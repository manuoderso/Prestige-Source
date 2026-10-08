/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.dc
 */
public abstract class dc_0 {
    protected static final class_310 a;
    protected static final long b;
    protected final fT c;
    private static final long o;
    private static final Object[] B;
    private static final String[] C;

    protected dc_0(String string, String string2, boolean bl, long l) {
        long l2 = (l = o ^ l) ^ 0x16BA1D7FE23FL;
        Object[] objectArray = new Object[4];
        objectArray[3] = l2;
        objectArray[2] = bl;
        objectArray[1] = string2;
        objectArray[0] = string;
        this.c = dc_0.e("\u00e1", (Object)objectArray, (long)7300427087011319242L, (long)l);
    }

    protected dc_0(String string, String string2, long l) {
        long l2 = (l = o ^ l) ^ 0x26BF9209AEA7L;
        this(string, string2, false, l2);
    }

    static {
        o = hc.a(-320902995486953408L, -3923300758080057942L, MethodHandles.lookup().lookupClass()).a(84168822287594L);
        long l = o ^ 0x6EE02530B40EL;
        B = new Object[10];
        C = new String[10];
        dc_0.a();
        a = dc_0.e("\u00e1", (long)-6243794992293665190L, (long)l);
        b = (long)dc_0.e("\u00e1", (long)-6243600345756954100L, (long)l);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dc_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dc_0.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = dc_0.a(l, l2);
            object = B[n];
            try {
                if (!(object instanceof String)) break block2;
                dc_0.B[n] = clazz = Class.forName(C[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dc_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dc_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = dc_0.a(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            String string = C[n];
            int n2 = string.indexOf(8);
            Class clazz = dc_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dc_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dc_0.a(clazz3, string2, clazz2)) != null) {
                    dc_0.B[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dc_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dc_0.B[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dc_0.b(441413935791507L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dc_0.a(l, l2);
        Object object = B[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = C[n];
                int n3 = string2.indexOf(8);
                clazz3 = dc_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dc_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dc_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dc_0.B[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dc_0.b(441413935791507L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dc_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dc_0.B[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dc_0.b(441413935791507L, 0L);
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
            if (c == '\u00c8' || c == 'V' || c == '\u00a5' || c == '\u00cf') {
                field = dc_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dc_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'D' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (C[n3] != null) {
            return n3;
        }
        Object object = B[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 48;
            case 1 -> 32;
            case 2 -> 5;
            case 3 -> 10;
            case 4 -> 1;
            case 5 -> 41;
            case 6 -> 19;
            case 7 -> 35;
            case 8 -> 17;
            case 9 -> 29;
            case 10 -> 22;
            case 11 -> 23;
            case 12 -> 57;
            case 13 -> 36;
            case 14 -> 39;
            case 15 -> 8;
            case 16 -> 2;
            case 17 -> 47;
            case 18 -> 3;
            case 19 -> 25;
            case 20 -> 14;
            case 21 -> 49;
            case 22 -> 20;
            case 23 -> 38;
            case 24 -> 56;
            case 25 -> 37;
            case 26 -> 26;
            case 27 -> 15;
            case 28 -> 46;
            case 29 -> 21;
            case 30 -> 6;
            case 31 -> 24;
            case 32 -> 54;
            case 33 -> 28;
            case 34 -> 9;
            case 35 -> 51;
            case 36 -> 30;
            case 37 -> 60;
            case 38 -> 43;
            case 39 -> 0;
            case 40 -> 40;
            case 41 -> 33;
            case 42 -> 44;
            case 43 -> 53;
            case 44 -> 16;
            case 45 -> 27;
            case 46 -> 55;
            case 47 -> 4;
            case 48 -> 31;
            case 49 -> 61;
            case 50 -> 59;
            case 51 -> 58;
            case 52 -> 12;
            case 53 -> 42;
            case 54 -> 18;
            case 55 -> 34;
            case 56 -> 63;
            case 57 -> 52;
            case 58 -> 62;
            case 59 -> 13;
            case 60 -> 45;
            case 61 -> 11;
            case 62 -> 7;
            default -> 50;
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
        dc_0.C[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dc_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = B;
        B[0] = "7\u001cb\u0000W\u001f7\u001cu\\[\u0010-WuB[\u0005*&%\u001f\n";
        objectArray[1] = "\u000f\b\\7S\t\u0004\u0007Mx.\u001c\u0016\u001dO;";
        objectArray[2] = Long.TYPE;
        dc_0.C[2] = "java/lang/Long";
        objectArray[3] = "\u001awR^ad\fwW\u0004rs\u001b<T\u0002~g\n{C\u00155r-";
        objectArray[4] = "\u0012V?ctdgv4le+\u0006x?gaqr";
        objectArray[5] = "l\nU0H\bz\nPj[\u001fmASlW\u000b|\u0006D{\u001c\u001e\\";
        objectArray[6] = "z,\u001e^s\u0019q#\u000f\u0011\u0012\u0017z(\u000bK";
        objectArray[7] = "\u0013\u0002\u000b$E;\u001f\u000759\u0011,O^Y\u000bEm\u0012\u00005`GnW\u0000^lBP";
        objectArray[8] = "j\u0016\u0017\u000f;L\u007fI\u0018h5A`T\u0010\u000e\"`{K\u0010-?X~O\u0006hg_v\u0012F\u00160ZyC}";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "a{G)I\u000bc\u007fWq(\u0006[9\u0006{H\u000573\u0007l\u0012o`s\u0006i\u0016\u0014=s\u0007v(";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public fT a(Object[] objectArray) {
        return this.c;
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
            return MethodHandles.lookup().findStatic(dc_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


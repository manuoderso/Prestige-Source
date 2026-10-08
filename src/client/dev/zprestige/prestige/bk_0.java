/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;
import net.minecraft.class_1297;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.bk
 */
public class bk_0
extends aH {
    private float a;
    private static final long d = hc.a(-316726985518635263L, -1038298106909528129L, MethodHandles.lookup().lookupClass()).a(268022945818926L);
    private static final Object[] e = new Object[11];
    private static final String[] f = new String[11];

    public bk_0(float f) {
        this.a = f;
    }

    static {
        bk_0.c();
    }

    private static int e(long l, long l2) {
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
            case 0 -> 40;
            case 1 -> 36;
            case 2 -> 44;
            case 3 -> 20;
            case 4 -> 13;
            case 5 -> 5;
            case 6 -> 30;
            case 7 -> 22;
            case 8 -> 53;
            case 9 -> 59;
            case 10 -> 51;
            case 11 -> 10;
            case 12 -> 49;
            case 13 -> 18;
            case 14 -> 45;
            case 15 -> 2;
            case 16 -> 29;
            case 17 -> 43;
            case 18 -> 16;
            case 19 -> 46;
            case 20 -> 32;
            case 21 -> 19;
            case 22 -> 7;
            case 23 -> 17;
            case 24 -> 28;
            case 25 -> 4;
            case 26 -> 26;
            case 27 -> 41;
            case 28 -> 33;
            case 29 -> 37;
            case 30 -> 57;
            case 31 -> 3;
            case 32 -> 38;
            case 33 -> 8;
            case 34 -> 11;
            case 35 -> 50;
            case 36 -> 27;
            case 37 -> 6;
            case 38 -> 47;
            case 39 -> 48;
            case 40 -> 63;
            case 41 -> 23;
            case 42 -> 39;
            case 43 -> 31;
            case 44 -> 9;
            case 45 -> 55;
            case 46 -> 1;
            case 47 -> 61;
            case 48 -> 15;
            case 49 -> 62;
            case 50 -> 24;
            case 51 -> 54;
            case 52 -> 42;
            case 53 -> 60;
            case 54 -> 14;
            case 55 -> 34;
            case 56 -> 35;
            case 57 -> 21;
            case 58 -> 56;
            case 59 -> 0;
            case 60 -> 52;
            case 61 -> 25;
            case 62 -> 58;
            default -> 12;
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
        bk_0.f[n3] = new String(cArray);
        return n3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == '\u00d6' || c == 'J' || c == '\u00c5') {
                field = bk_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bk_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = bk_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.a = f;
    }

    private static void c() {
        Object[] objectArray = e;
        e[0] = "s\u0014.J\u001c\u0017e\u0014+\u0010\u000f\u0000r_(\u0016\u0003\u0014c\u0018?\u0001H\u0006_";
        objectArray[1] = "\u0014\u0017\u0019<gua7\u00123v:\u001c/\u00014\u007fst";
        objectArray[2] = "@tWdKr@t@8G}Z?@&Gh]N\u0012x\u001f,";
        objectArray[3] = Boolean.TYPE;
        bk_0.f[3] = "java/lang/Boolean";
        objectArray[4] = "\"@+|Z\u00144@.&I\u0003#\u000b- E\u00172L:7\u000e\u0006-";
        objectArray[5] = "EWB\u0003d\u0015NXSL\u0007\u0018[U\\'2\u001aJF@\u000b%\u0017";
        objectArray[6] = "\"7\"1nO)83~\u000fA\"37$";
        objectArray[7] = "G.\u001cjlwH9\u0001W7O\u001byB%1u\u0012v\u0019j]";
        objectArray[8] = "U#()P)\u0014%dxk&\u0001!:~\u0007\u0014Qmd\"ky\r9g\u007fV'\u0017-j\u0019";
        objectArray[9] = "\u007f]IX\u001fxt\u0000\t\fm-DVV[\u0017:#\u0017UU\nD\u007f\u000fXM\u0013#>\fVPm";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "K\u007f\\[>:\ny\u0010\n\u00055\u001f}N\fi\u0007M:\u0014V\u0005j\u0013e\u0013\r84\tq\u001ek";
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = bk_0.e(l, l2);
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
                clazz3 = bk_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bk_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bk_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        bk_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bk_0.f(488360097578720L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bk_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bk_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bk_0.f(488360097578720L, 0L);
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
            int n = bk_0.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                bk_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bk_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bk_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bk_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bk_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public float a(Object[] objectArray) {
        return this.a;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static Predicate a(Object[] objectArray) {
        return bk_0::lambda$isEntityValid$0;
    }

    private static Field g(long l, long l2) {
        int n = bk_0.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = bk_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bk_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bk_0.c(clazz3, string2, clazz2)) != null) {
                    bk_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bk_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bk_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bk_0.f(488360097578720L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean lambda$isEntityValid$0(class_1297 class_12972) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = d ^ 0x46ABC7B08B67L;
                    callSite = bk_0.b("i", (long)667247212173097110L, (long)l);
                    try {
                        try {
                            object = bk_0.b("\u00f2", (Object)class_12972, (long)667073505494306330L, (long)l);
                            if (callSite != null) break block6;
                            if (object != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw bk_0.b("i", (Object)matchException, (long)666840264745386292L, (long)l);
                        }
                        object = bk_0.b("\u00f2", (Object)class_12972, (long)666938196778059075L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw bk_0.b("i", (Object)matchException, (long)666840264745386292L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw bk_0.b("i", (Object)matchException, (long)666840264745386292L, (long)l);
                }
                object = 1;
                break block8;
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
            return MethodHandles.lookup().findStatic(bk_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


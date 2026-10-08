/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.b0;
import dev.zprestige.prestige.b1;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_243;

public class b3
extends b1 {
    private static final long a = hc.a(3413140273662543975L, -3327137005844321341L, MethodHandles.lookup().lookupClass()).a(269429862174900L);
    private static final Object[] e = new Object[27];
    private static final String[] f = new String[27];

    static {
        b3.b();
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
            case 0 -> 23;
            case 1 -> 9;
            case 2 -> 11;
            case 3 -> 52;
            case 4 -> 59;
            case 5 -> 29;
            case 6 -> 51;
            case 7 -> 38;
            case 8 -> 19;
            case 9 -> 63;
            case 10 -> 43;
            case 11 -> 40;
            case 12 -> 27;
            case 13 -> 7;
            case 14 -> 61;
            case 15 -> 34;
            case 16 -> 30;
            case 17 -> 18;
            case 18 -> 28;
            case 19 -> 3;
            case 20 -> 22;
            case 21 -> 14;
            case 22 -> 25;
            case 23 -> 57;
            case 24 -> 36;
            case 25 -> 44;
            case 26 -> 58;
            case 27 -> 10;
            case 28 -> 12;
            case 29 -> 16;
            case 30 -> 37;
            case 31 -> 60;
            case 32 -> 54;
            case 33 -> 17;
            case 34 -> 8;
            case 35 -> 2;
            case 36 -> 42;
            case 37 -> 26;
            case 38 -> 62;
            case 39 -> 53;
            case 40 -> 45;
            case 41 -> 24;
            case 42 -> 35;
            case 43 -> 1;
            case 44 -> 49;
            case 45 -> 31;
            case 46 -> 32;
            case 47 -> 39;
            case 48 -> 50;
            case 49 -> 4;
            case 50 -> 21;
            case 51 -> 5;
            case 52 -> 20;
            case 53 -> 47;
            case 54 -> 33;
            case 55 -> 55;
            case 56 -> 46;
            case 57 -> 56;
            case 58 -> 15;
            case 59 -> 41;
            case 60 -> 13;
            case 61 -> 48;
            case 62 -> 6;
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
        b3.f[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "{c Vfz{c7\njua(7\u0014j`fYfL8";
        objectArray[1] = Double.TYPE;
        b3.f[1] = "java/lang/Double";
        objectArray[2] = "\t\u0015E*9a\t\u0015Rv5n\u0013^Rh5{\u0014/\u00077l";
        objectArray[3] = "4_1QK)4_&\rG&.\u0014&\u0013G3)ewL\u0015x";
        objectArray[4] = "-\u000e\u0001 ,\u001b-\u000e\u0016| \u00147E\u0016b \u000104G8yB";
        objectArray[5] = "53\f\rwZ#3\tWdM4x\nQhY%?\u001dF#K\u0019";
        objectArray[6] = "f\u0001ysI&\u0013!r|Xin9a{Q \u0006";
        objectArray[7] = "itWRSJit@\u000e_Es?@\u0010_PtN\u0010M\u000e";
        objectArray[8] = "2u\u0000aX\u0014$u\u0005;K\u00033>\u0006=G\u0017\"y\u0011*\f\u0006e";
        objectArray[9] = "se\u0018\"s xj\tm\u0010-mg\u0006\u0006%/|t\u001a*2\"";
        objectArray[10] = "\b\t$%P\u007f\u001e\t!\u007fCh\tB\"yO|\u0018\u00055n\u0004m]";
        objectArray[11] = "9PO\u001d\u0018YLpD\u0012\t\u0016-~O\u0019\rLY";
        objectArray[12] = Boolean.TYPE;
        b3.f[12] = "java/lang/Boolean";
        objectArray[13] = "~\u007fP'\u0006\u007f\u000b_[(\u00170jQP#\u0013j\u001e";
        objectArray[14] = Void.TYPE;
        b3.f[14] = "java/lang/Void";
        objectArray[15] = "-\"M4S\u0019&-\\{2\u0017-&X!";
        objectArray[16] = "6\u0019T\\'HyK\u0011>-UuFHR\u001f\u00011\u001f\u001e>w\u0007rD@N8U7&\u0010\u00013ZfV_Sv8";
        objectArray[17] = "_R\u001b+\u0004X\t\u0015\u000f 8Q\u000bQ\u0004vTcV\u0016^)8\u000e\u0006\u0016\u000e+EW[H\u000b\u0011\u0003^\u0003I\u0006iA]\u001c]d";
        objectArray[18] = "\u001b<6/\u0017DUjn-mJ'<d9\u000f\\U8e0\u0007 ";
        objectArray[19] = "\u001ea?} \\X%1c]\t d$7&\u000eO=%dlc\u001e$`v0\fG%3<]";
        objectArray[20] = "Avsn\ro\u0006qr%=8\u001d\")3joB\u007fr_\u0004)\u0003uq3Rn\u0017~";
        objectArray[21] = "8(P+F|wz\u0015IGmjsG\u001e\u00107:/+p\u00126:j\u00148Nh~";
        objectArray[22] = "A\u0018p*\u0019U\u000eJ5H\u0018D\u0013Cg\u001fO\u001eC\u001d\u000bqM\u001fCZ49\u0011A\u0007";
        objectArray[23] = "rR\b l\u0000=\u0000MBm\u0011 \t\u001f\u0015:KpTs{8Jp\u0010L3d\u00144";
        objectArray[24] = "\u001e\u001bv4i N\u0010,0R+!Es250L\fp7hB\u0011\u0014i52.^\tygR";
        objectArray[25] = "H\u001a:;\fV\u0011Gd>6N\u001f\u0006a6Z|NK?j\t+KA;lK\u0014\u0003\u001de(6\u0012I@<,\tZ\u0015\u001exQ\u000f\u0010HG|nGL\u0016\u0003\u0001kV\u0010\u0018@|2\u000bN\u001dz";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "I$4mlL\u000f`:s\u0011\u0019w.5#v\u0001\u001ag6&+sFfn}iL\u001er-a\u0011";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = b3.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00b5' || c == 'a' || c == '\u00e0' || c == '\u00ba') {
                field = b3.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00b5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b3.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'o' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void b(Object[] objectArray) {
        b0 b02 = (b0)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        b02.c = b3.b("\u00da", (Object)b02.c, (Object)b02.d, (long)-950146848074492307L, (long)l);
        b02.d = new class_243((double)(b3.b("\u00b5", (Object)b02.d, (long)-949716458551676165L, (long)l) / (double)0.999998f), (double)(b3.b("\u00b5", (Object)b02.d, (long)-949774521428794163L, (long)l) - 5.5E-6), (double)(b3.b("\u00b5", (Object)b02.d, (long)-949969293189802908L, (long)l) / (double)0.999998f));
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
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
        int n = b3.e(l, l2);
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
                clazz3 = b3.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b3.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b3.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        b3.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b3.f(1116825670735525L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b3.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b3.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b3.f(1116825670735525L, 0L);
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
            int n = b3.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                b3.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b3.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b3.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b3.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void a(Object[] objectArray) {
        b3 b32;
        long l;
        long l2;
        b0 b02;
        block16: {
            block17: {
                CallSite callSite;
                long l3;
                block15: {
                    block14: {
                        b02 = (b0)objectArray[0];
                        boolean bl = (Boolean)objectArray[1];
                        l2 = (Long)objectArray[2];
                        long l4 = l2;
                        l = l4 ^ 0x7268C3E1EF0EL;
                        l3 = l4 ^ 0x68096BC3F1C0L;
                        callSite = b3.b("o", (long)9029403924183116972L, (long)l2);
                        try {
                            try {
                                if (callSite != null) break block14;
                                if (bl) break block15;
                            }
                            catch (MatchException matchException) {
                                throw b3.b("o", (Object)matchException, (long)9029353342063661114L, (long)l2);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l;
                            objectArray2[0] = b02;
                            b3.b("\u00da", (Object)this, (Object)objectArray2, (long)9028813383763482726L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw b3.b("o", (Object)matchException, (long)9029353342063661114L, (long)l2);
                        }
                    }
                    return;
                }
                CallSite callSite2 = b3.b("\u00da", (Object)b3.b("\u00b5", (Object)cz_0.b, (long)9029523429497627439L, (long)l2), (Object)b3.b("o", (double)b3.b("\u00b5", (Object)b02.c, (long)9029708078884519269L, (long)l2), (double)b3.b("\u00b5", (Object)b02.c, (long)9029615391022295891L, (long)l2), (double)(b3.b("\u00b5", (Object)b02.c, (long)9029468452572175354L, (long)l2) + b3.b("\u00b5", (Object)b02.d, (long)9029468452572175354L, (long)l2)), (long)9028653656155591435L, (long)l2), (long)9029189834979072415L, (long)l2);
                try {
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l3;
                    objectArray3[0] = callSite2;
                    if (b3.b("\u00da", (Object)this, (Object)objectArray3, (long)9028695981193081283L, (long)l2) == false) {
                        b02.d = new class_243((double)b3.b("\u00b5", (Object)b02.d, (long)9029708078884519269L, (long)l2), (double)b3.b("\u00b5", (Object)b02.d, (long)9029615391022295891L, (long)l2), (double)(b3.b("\u00b5", (Object)b02.d, (long)9029468452572175354L, (long)l2) * -0.8));
                    }
                }
                catch (MatchException matchException) {
                    throw b3.b("o", (Object)matchException, (long)9029353342063661114L, (long)l2);
                }
                CallSite callSite3 = b3.b("\u00da", (Object)b3.b("\u00b5", (Object)cz_0.b, (long)9029523429497627439L, (long)l2), (Object)b3.b("o", (double)b3.b("\u00b5", (Object)b02.c, (long)9029708078884519269L, (long)l2), (double)(b3.b("\u00b5", (Object)b02.c, (long)9029615391022295891L, (long)l2) + b3.b("\u00b5", (Object)b02.d, (long)9029615391022295891L, (long)l2)), (double)b3.b("\u00b5", (Object)b02.c, (long)9029468452572175354L, (long)l2), (long)9028653656155591435L, (long)l2), (long)9029189834979072415L, (long)l2);
                try {
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l3;
                    objectArray4[0] = callSite3;
                    if (b3.b("\u00da", (Object)this, (Object)objectArray4, (long)9028695981193081283L, (long)l2) == false) {
                        b02.d = new class_243((double)(b3.b("\u00b5", (Object)b02.d, (long)9029708078884519269L, (long)l2) * (double)0.999f), (double)(b3.b("\u00b5", (Object)b02.d, (long)9029615391022295891L, (long)l2) * -0.6), (double)(b3.b("\u00b5", (Object)b02.d, (long)9029468452572175354L, (long)l2) * (double)0.999f));
                    }
                }
                catch (MatchException matchException) {
                    throw b3.b("o", (Object)matchException, (long)9029353342063661114L, (long)l2);
                }
                CallSite callSite4 = b3.b("\u00da", (Object)b3.b("\u00b5", (Object)cz_0.b, (long)9029523429497627439L, (long)l2), (Object)b3.b("o", (double)(b3.b("\u00b5", (Object)b02.c, (long)9029708078884519269L, (long)l2) + b3.b("\u00b5", (Object)b02.d, (long)9029708078884519269L, (long)l2)), (double)b3.b("\u00b5", (Object)b02.c, (long)9029615391022295891L, (long)l2), (double)b3.b("\u00b5", (Object)b02.c, (long)9029468452572175354L, (long)l2), (long)9028653656155591435L, (long)l2), (long)9029189834979072415L, (long)l2);
                try {
                    try {
                        b32 = this;
                        if (callSite != null) break block16;
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l3;
                        objectArray5[0] = callSite4;
                        if (b3.b("\u00da", (Object)b32, (Object)objectArray5, (long)9028695981193081283L, (long)l2) != false) break block17;
                    }
                    catch (MatchException matchException) {
                        throw b3.b("o", (Object)matchException, (long)9029353342063661114L, (long)l2);
                    }
                    b02.d = new class_243((double)(b3.b("\u00b5", (Object)b02.d, (long)9029708078884519269L, (long)l2) * -0.8), (double)b3.b("\u00b5", (Object)b02.d, (long)9029615391022295891L, (long)l2), (double)b3.b("\u00b5", (Object)b02.d, (long)9029468452572175354L, (long)l2));
                }
                catch (MatchException matchException) {
                    throw b3.b("o", (Object)matchException, (long)9029353342063661114L, (long)l2);
                }
            }
            b32 = this;
        }
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l;
        objectArray6[0] = b02;
        b3.b("\u00da", (Object)b32, (Object)objectArray6, (long)9028813383763482726L, (long)l2);
    }

    private static Field g(long l, long l2) {
        int n = b3.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = b3.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b3.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b3.c(clazz3, string2, clazz2)) != null) {
                    b3.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b3.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b3.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b3.f(1116825670735525L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


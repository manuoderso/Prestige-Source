/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1753
 *  net.minecraft.class_1755
 *  net.minecraft.class_1764
 *  net.minecraft.class_1771
 *  net.minecraft.class_1776
 *  net.minecraft.class_1779
 *  net.minecraft.class_1787
 *  net.minecraft.class_1799
 *  net.minecraft.class_1812
 *  net.minecraft.class_1819
 *  net.minecraft.class_1823
 *  net.minecraft.class_1835
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_9239
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.d0;
import dev.zprestige.prestige.d1;
import dev.zprestige.prestige.d8;
import dev.zprestige.prestige.dY;
import dev.zprestige.prestige.dZ;
import dev.zprestige.prestige.eF;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1753;
import net.minecraft.class_1755;
import net.minecraft.class_1764;
import net.minecraft.class_1771;
import net.minecraft.class_1776;
import net.minecraft.class_1779;
import net.minecraft.class_1787;
import net.minecraft.class_1799;
import net.minecraft.class_1812;
import net.minecraft.class_1819;
import net.minecraft.class_1823;
import net.minecraft.class_1835;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_9239;

/*
 * Renamed from dev.zprestige.prestige.ag
 */
public final class ag_0
implements cz_0 {
    private static final long a = hc.a(-2675734077444577880L, 661300034697022484L, MethodHandles.lookup().lookupClass()).a(171411946923476L);
    private static final Object[] c = new Object[42];
    private static final String[] d = new String[42];

    private ag_0() {
    }

    static {
        ag_0.a();
    }

    private static int e(long l, long l2) {
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
            case 0 -> 46;
            case 1 -> 57;
            case 2 -> 51;
            case 3 -> 53;
            case 4 -> 10;
            case 5 -> 2;
            case 6 -> 59;
            case 7 -> 52;
            case 8 -> 63;
            case 9 -> 3;
            case 10 -> 50;
            case 11 -> 11;
            case 12 -> 30;
            case 13 -> 24;
            case 14 -> 47;
            case 15 -> 4;
            case 16 -> 25;
            case 17 -> 6;
            case 18 -> 21;
            case 19 -> 33;
            case 20 -> 43;
            case 21 -> 16;
            case 22 -> 9;
            case 23 -> 62;
            case 24 -> 1;
            case 25 -> 54;
            case 26 -> 44;
            case 27 -> 58;
            case 28 -> 22;
            case 29 -> 48;
            case 30 -> 18;
            case 31 -> 55;
            case 32 -> 8;
            case 33 -> 31;
            case 34 -> 45;
            case 35 -> 37;
            case 36 -> 0;
            case 37 -> 42;
            case 38 -> 29;
            case 39 -> 13;
            case 40 -> 56;
            case 41 -> 12;
            case 42 -> 36;
            case 43 -> 19;
            case 44 -> 38;
            case 45 -> 14;
            case 46 -> 40;
            case 47 -> 35;
            case 48 -> 17;
            case 49 -> 39;
            case 50 -> 61;
            case 51 -> 20;
            case 52 -> 60;
            case 53 -> 7;
            case 54 -> 27;
            case 55 -> 5;
            case 56 -> 32;
            case 57 -> 15;
            case 58 -> 41;
            case 59 -> 23;
            case 60 -> 26;
            case 61 -> 34;
            case 62 -> 49;
            default -> 28;
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
        ag_0.d[n3] = new String(cArray);
        return n3;
    }

    private static boolean b(Object[] objectArray) {
        int n;
        block26: {
            block28: {
                block27: {
                    long l = (Long)objectArray[0];
                    l = a ^ l;
                    CallSite callSite = ag_0.a("\u00f9", (long)-4729052762821978663L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        n = d8.B;
                                                                        if (callSite != null) break block26;
                                                                        if (n != false) break block27;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                                                    }
                                                                    n = dY.o;
                                                                    if (callSite != null) break block26;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                                                }
                                                                if (n != false) break block27;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                                            }
                                                            n = dZ.p;
                                                            if (callSite != null) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                                        }
                                                        if (n != false) break block27;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                                    }
                                                    n = d0.C;
                                                    if (callSite != null) break block26;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                                }
                                                if (n != false) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                            }
                                            n = d1.k;
                                            if (callSite != null) break block26;
                                        }
                                        catch (MatchException matchException) {
                                            throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                        }
                                        if (n != false) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                    }
                                    n = eF.s;
                                    if (callSite != null) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                                }
                                if (n != false) break block27;
                            }
                            catch (MatchException matchException) {
                                throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                            }
                            n = ag_0.a("\u00f9", (Object)new Object[0], (long)-4733111333273383472L, (long)l);
                            if (callSite != null) break block26;
                        }
                        catch (MatchException matchException) {
                            throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                        }
                        if (n == false) break block28;
                    }
                    catch (MatchException matchException) {
                        throw ag_0.a("\u00f9", (Object)matchException, (long)-4732954056282138551L, (long)l);
                    }
                }
                n = true;
                break block26;
            }
            n = 0;
        }
        return n != 0;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ag_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == 'B' || c == '\u00fa' || c == '\u00f8') {
                field = ag_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ag_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static boolean c(Object[] objectArray) {
        int n;
        block49: {
            block50: {
                block48: {
                    class_1799 class_17992 = (class_1799)objectArray[0];
                    long l = (Long)objectArray[1];
                    l = a ^ l;
                    CallSite callSite = ag_0.a("N", (Object)class_17992, (long)8313863032485091510L, (long)l);
                    CallSite callSite2 = ag_0.a("\u00f9", (long)8314046586202118375L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (ag_0.a("N", (Object)class_17992, (Object)ag_0.a("\u00fa", (long)8318135795823539853L, (long)l), (long)8314128513002805525L, (long)l) != null) break block48;
                                                                                                                    n = callSite instanceof class_1753;
                                                                                                                    if (callSite2 != null) break block49;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                                                }
                                                                                                                if (n != 0) break block48;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                                            }
                                                                                                            n = callSite instanceof class_1764;
                                                                                                            if (callSite2 != null) break block49;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                                        }
                                                                                                        if (n != 0) break block48;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                                    }
                                                                                                    n = callSite instanceof class_1776;
                                                                                                    if (callSite2 != null) break block49;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                                }
                                                                                                if (n != 0) break block48;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                            }
                                                                                            n = callSite instanceof class_1823;
                                                                                            if (callSite2 != null) break block49;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                        }
                                                                                        if (n != 0) break block48;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                    }
                                                                                    n = callSite instanceof class_1771;
                                                                                    if (callSite2 != null) break block49;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                                }
                                                                                if (n != 0) break block48;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                            }
                                                                            n = callSite instanceof class_1835;
                                                                            if (callSite2 != null) break block49;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                        }
                                                                        if (n != 0) break block48;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                    }
                                                                    n = callSite instanceof class_9239;
                                                                    if (callSite2 != null) break block49;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                                }
                                                                if (n != 0) break block48;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                            }
                                                            n = callSite instanceof class_1812;
                                                            if (callSite2 != null) break block49;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                        }
                                                        if (n != 0) break block48;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                    }
                                                    n = callSite instanceof class_1779;
                                                    if (callSite2 != null) break block49;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                                }
                                                if (n != 0) break block48;
                                            }
                                            catch (MatchException matchException) {
                                                throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                            }
                                            n = callSite instanceof class_1819;
                                            if (callSite2 != null) break block49;
                                        }
                                        catch (MatchException matchException) {
                                            throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                        }
                                        if (n != 0) break block48;
                                    }
                                    catch (MatchException matchException) {
                                        throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                    }
                                    n = callSite instanceof class_1755;
                                    if (callSite2 != null) break block49;
                                }
                                catch (MatchException matchException) {
                                    throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                                }
                                if (n != 0) break block48;
                            }
                            catch (MatchException matchException) {
                                throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                            }
                            n = callSite instanceof class_1787;
                            if (callSite2 != null) break block49;
                        }
                        catch (MatchException matchException) {
                            throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                        }
                        if (n == 0) break block50;
                    }
                    catch (MatchException matchException) {
                        throw ag_0.a("\u00f9", (Object)matchException, (long)8317939191728428407L, (long)l);
                    }
                }
                n = 1;
                break block49;
            }
            n = 0;
        }
        return n != 0;
    }

    private static Method h(long l, long l2) {
        int n = ag_0.e(l, l2);
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
                clazz3 = ag_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ag_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ag_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ag_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ag_0.f(290740704936650L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ag_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ag_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ag_0.f(290740704936650L, 0L);
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
            int n = ag_0.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                ag_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ag_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ag_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ag_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ag_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "3,{\u0006\u0015;%,~\\\u0006,2g}Z\n8# jMA*\u001f";
        objectArray[1] = "V5/\nU\u0015#\u0015$\u0005DZ^\r7\u0002M\u00136";
        objectArray[2] = "croDD(crx\u0018H'y9x\u0006H2~H*]\u0010x";
        objectArray[3] = "\u0015\u0006\u0018wY(\u0015\u0006\u000f+U'\u000fM\u000f5U2\b<Uj\u0007p";
        objectArray[4] = "0Cfn|{;Lw!\u001du0Gs{";
        objectArray[5] = "\t4zin\u001c\t4m5b\u0013\u0013\u007fm+b\u0006\u0014\u000e?p:G";
        objectArray[6] = "\u001f\u0003g\u0015%\u0015\t\u0003bO6\u0002\u001eHaI:\u0016\u000f\u000fv^q\u0004\u001c";
        objectArray[7] = "LbmMg\rGm|\u0002\u0004\u0000R`si1\u0002CsoE&\u000f";
        objectArray[8] = "lP}>\u001a'lPjb\u0016(v\u001bj|\u0016=qj0#Dz";
        objectArray[9] = "h\u007f?d@=h\u007f(8L2r4(&L'uE}y\u0015";
        objectArray[10] = "\u00149%\u001ej%\u001492Bf*\u000er2\\f?\t\u0003c\u00034t";
        objectArray[11] = "t\u001a\u007ff)Ut\u001ah:%ZnQh$%Oi 9~|\f";
        objectArray[12] = "3[`\u0005\u000b~3[wY\u0007q)\u0010wG\u0007d.a'\u001aV";
        objectArray[13] = "L#,&t\u0010L#;zx\u001fVh;dx\nQ\u0019j; ";
        objectArray[14] = "{k\ftu{{k\u001b(yta \u001b6yafQOn.";
        objectArray[15] = "N\u0019Tf&;;9_i7tZ7Tb3..";
        objectArray[16] = Boolean.TYPE;
        ag_0.d[16] = "java/lang/Boolean";
        objectArray[17] = "#&&L\u0010d#&1\u0010\u001ck9m1\u000e\u001c~>\u001ccZM?";
        objectArray[18] = "R(%T\u0014\nR(2\b\u0018\u0005Hc2\u0016\u0018\u0010O\u0012cHMU";
        objectArray[19] = "Gx\rFw}Gx\u001a\u001a{r]3\u001a\u0004{gZBKZ.,";
        objectArray[20] = "\u0010m\u0011Ex\teM\u001aJiF\u0004C\u0011Am\u001cp";
        objectArray[21] = "\u001f;+]'#\u001f;<\u0001+,\u0005p<\u001f+9\u0002\u0001lJ|\u007f";
        objectArray[22] = "\u0018LS\u001a{X\u000eLV@hO\u0019\u0007UFd[\b@BQ/N\u000e";
        objectArray[23] = "N2\u001c\u001d\u000e8;\u0012\u0017\u0012\u001fwZ\u001c\u001c\u0019\u001b-.";
        objectArray[24] = "2x$vJ72up*r#ay!,\u001e\u0011<>{sryed&2\u001f%hk&KM!uk&\"O(0wA";
        objectArray[25] = "t\u0019@`]<~^\u000eQN]=\u001eAh\u0019%*\u001eNQ";
        objectArray[26] = "KV77V7\u0017Nu//(\u001fJ/-C\u001aO\u0006q{\u0013MH] 3FvBL!%/w\f\fs$Wu\u0016Q6J";
        objectArray[27] = "\u001c-\u0005Ck\u000b^1\u0019\u0004\u0012\bM9\u0003\u0015E_\u0013jZy#\u0001U$X@rXMd";
        objectArray[28] = "|~8H\u001fx>b$\u000ff{-j>\u001e1,s=frWk4l4\u0019\u000fy5~";
        objectArray[29] = "NC~w\u0017Z\nYbux\u0001rI5r\u0001\u000b\u000f_ei\u001dk\u0018@im\u0007\u0014\u0003Ls1x";
        objectArray[30] = "\u0005y\u0005}X.Ge\u0019:!-Tm\u0003+vz\u000b0XG\u001f>P=_6\u001f3\u0004a";
        objectArray[31] = "Q\u00122\u001bWR\r\np\u0003.M\u0005\u000e*\u0001B\u007fWCrW.\u0013\n\u0017p\u0006CN\u0014H8f";
        objectArray[32] = "XK\u000e1#\r\u0003\u001b\r3S\u0011RH\n<\u0004E\b\u001cRiSDQ@T0>\u0019O\u001f\u001c";
        objectArray[33] = "\u0003`\u0004*r`Gz\u0018(\u001d8?8\u001bhs(C4\u0004+\"Q\u0002hM=d-\u000ew\u000el\u001d";
        objectArray[34] = "> Xypf5|V\u007f\u0014y4)Q+C-n}\b}\u0014{-+U>%*%'X";
        objectArray[35] = "&yk`%\u0014id96FKzw21\u0011\u0018#\"i`F\u001fpu/4}\u0015at9";
        objectArray[36] = "7Cb}'=oQcoI3kAzq%\u00018\u0005%'IofEgo33~\u0007\u007f\u0016";
        objectArray[37] = "-\u007f<)6Bum=;XLq}$%4~\"9x}X\u0010|y9;\"Ld;!B";
        objectArray[38] = "r$RP\"@6>NRM\u001aN.\u0019U4\u001138IN(q$'EJ2\u000e?+_\u0016M";
        objectArray[39] = "4 \u0007+O+ 2Q.\"(Z1\u0007j[$''WqGD08[u];+4A)\"";
        objectArray[40] = "P&:Y>s\u00068jKQ|P$3O=N\u0004gl\u0017n\u0019\u000212O(t^<=OQ";
        Object[] objectArray2 = objectArray;
        objectArray[41] = "y<O#\u000bK{5\n?lG+'V*\u0000u|e\fuP\"*#Y-\u0015\u0013{+U l";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ag" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object[] objectArray) {
        Object object;
        block40: {
            CallSite callSite;
            long l;
            block39: {
                class_310 class_3102;
                long l2;
                block37: {
                    block38: {
                        class_310 class_3103;
                        block36: {
                            CallSite callSite2;
                            CallSite callSite3;
                            block35: {
                                block34: {
                                    Object object2;
                                    class_310 class_3104;
                                    long l3;
                                    block33: {
                                        l = (Long)objectArray[0];
                                        long l4 = l = a ^ l;
                                        l3 = l4 ^ 0x5FAB9A8BD950L;
                                        l2 = l4 ^ 0x3568C9C1146EL;
                                        callSite = ag_0.a("\u00f9", (long)-1943558818009067903L, (long)l);
                                        try {
                                            try {
                                                class_3104 = b;
                                                if (callSite != null) break block33;
                                                if (ag_0.a("\u00fc", (Object)class_3104, (long)-1943756065630669859L, (long)l) == null) return false;
                                            }
                                            catch (MatchException matchException) {
                                                throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                            }
                                            class_3104 = b;
                                        }
                                        catch (MatchException matchException) {
                                            throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                        }
                                    }
                                    try {
                                        if (ag_0.a("\u00fc", (Object)class_3104, (long)-1943611545839921790L, (long)l) == null) {
                                            return false;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                    }
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l3;
                                        object2 = ag_0.a("\u00f9", (Object)objectArray2, (long)-1943822285192487451L, (long)l);
                                        if (callSite != null) return (boolean)object2;
                                        if (object2 != false) break block34;
                                    }
                                    catch (MatchException matchException) {
                                        throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                    }
                                    object2 = 0;
                                    return (boolean)object2;
                                }
                                try {
                                    try {
                                        try {
                                            CallSite callSite2 = ag_0.a("N", (Object)ag_0.a("N", (Object)ag_0.a("\u00fc", (Object)b, (long)-1943756065630669859L, (long)l), (long)-1943284455780494032L, (long)l), (long)-1943658662814085424L, (long)l);
                                            callSite2 = ag_0.a("\u00fa", (long)-1942914253467284869L, (long)l);
                                            if (callSite != null) break block35;
                                            if (callSite3 == callSite2) return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                        }
                                        class_3103 = b;
                                        if (callSite != null) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                    }
                                    CallSite callSite2 = ag_0.a("N", (Object)ag_0.a("N", (Object)ag_0.a("\u00fc", (Object)class_3103, (long)-1943756065630669859L, (long)l), (long)-1943174244326978819L, (long)l), (long)-1943658662814085424L, (long)l);
                                    callSite2 = ag_0.a("\u00fa", (long)-1942914253467284869L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                                }
                            }
                            try {
                                if (callSite3 == callSite2) {
                                    return true;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                            }
                            class_3103 = b;
                        }
                        CallSite callSite4 = ag_0.a("\u00fc", (Object)class_3103, (long)-1943375136623935330L, (long)l);
                        try {
                            int n = callSite4 instanceof class_3965;
                            if (callSite != null) return n != 0;
                            if (n == 0) return 0 != 0;
                        }
                        catch (MatchException matchException) {
                            throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                        }
                        class_3965 class_39652 = (class_3965)callSite4;
                        try {
                            if (callSite != null) {
                                return 0 != 0;
                            }
                        }
                        catch (MatchException matchException) {
                            throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                        }
                        try {
                            try {
                                class_3102 = b;
                                if (callSite != null) break block37;
                                if (ag_0.a("N", (Object)ag_0.a("N", (Object)ag_0.a("\u00fc", (Object)class_3102, (long)-1943611545839921790L, (long)l), (Object)ag_0.a("N", (Object)class_39652, (long)-1942371450586913979L, (long)l), (long)-1943512315527431034L, (long)l), (long)-1942416717027387478L, (long)l) == ag_0.a("\u00fa", (long)-1942770403174969514L, (long)l)) break block38;
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                        }
                    }
                    class_3102 = b;
                }
                try {
                    try {
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l2;
                        objectArray3[0] = ag_0.a("N", (Object)ag_0.a("\u00fc", (Object)class_3102, (long)-1943756065630669859L, (long)l), (long)-1943284455780494032L, (long)l);
                        object = ag_0.a("\u00f9", (Object)objectArray3, (long)-1943067942292518920L, (long)l);
                        if (callSite != null) break block39;
                        if (object != false) break block40;
                    }
                    catch (MatchException matchException) {
                        throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                    }
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l2;
                    objectArray4[0] = ag_0.a("N", (Object)ag_0.a("\u00fc", (Object)b, (long)-1943756065630669859L, (long)l), (long)-1943174244326978819L, (long)l);
                    object = ag_0.a("\u00f9", (Object)objectArray4, (long)-1943067942292518920L, (long)l);
                }
                catch (MatchException matchException) {
                    throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
                }
            }
            try {
                if (callSite != null) return (boolean)object;
                if (object != false) break block40;
            }
            catch (MatchException matchException) {
                throw ag_0.a("\u00f9", (Object)matchException, (long)-1942956615911587055L, (long)l);
            }
            object = 1;
            return (boolean)object;
        }
        object = 0;
        return (boolean)object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = ag_0.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = ag_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ag_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ag_0.c(clazz3, string2, clazz2)) != null) {
                    ag_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ag_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ag_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ag_0.f(290740704936650L, 0L);
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
            return MethodHandles.lookup().findStatic(ag_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


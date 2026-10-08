/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_1792
 *  net.minecraft.class_2338
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1792;
import net.minecraft.class_2338;

/*
 * Renamed from dev.zprestige.prestige.gh
 */
public class gh_0
implements cz_0 {
    private static final long a = hc.a(7606333555330668101L, -8092506155075882132L, MethodHandles.lookup().lookupClass()).a(103053314749758L);
    private static final Object[] c = new Object[58];
    private static final String[] d = new String[58];

    static {
        gh_0.a();
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
            case 0 -> 3;
            case 1 -> 9;
            case 2 -> 6;
            case 3 -> 53;
            case 4 -> 32;
            case 5 -> 5;
            case 6 -> 20;
            case 7 -> 42;
            case 8 -> 52;
            case 9 -> 11;
            case 10 -> 35;
            case 11 -> 30;
            case 12 -> 15;
            case 13 -> 57;
            case 14 -> 28;
            case 15 -> 0;
            case 16 -> 19;
            case 17 -> 31;
            case 18 -> 46;
            case 19 -> 2;
            case 20 -> 18;
            case 21 -> 22;
            case 22 -> 54;
            case 23 -> 36;
            case 24 -> 33;
            case 25 -> 44;
            case 26 -> 12;
            case 27 -> 50;
            case 28 -> 58;
            case 29 -> 43;
            case 30 -> 45;
            case 31 -> 55;
            case 32 -> 48;
            case 33 -> 27;
            case 34 -> 1;
            case 35 -> 17;
            case 36 -> 56;
            case 37 -> 62;
            case 38 -> 34;
            case 39 -> 39;
            case 40 -> 14;
            case 41 -> 61;
            case 42 -> 16;
            case 43 -> 49;
            case 44 -> 63;
            case 45 -> 13;
            case 46 -> 23;
            case 47 -> 21;
            case 48 -> 4;
            case 49 -> 38;
            case 50 -> 7;
            case 51 -> 40;
            case 52 -> 60;
            case 53 -> 37;
            case 54 -> 41;
            case 55 -> 26;
            case 56 -> 29;
            case 57 -> 25;
            case 58 -> 47;
            case 59 -> 24;
            case 60 -> 51;
            case 61 -> 59;
            case 62 -> 10;
            default -> 8;
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
        gh_0.d[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'L' || c == '\u00c6' || c == 'i' || c == '\u00cb') {
                field = gh_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gh_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static boolean b(Object[] objectArray) {
        Object object;
        block86: {
            block88: {
                block87: {
                    class_1792 class_17922 = (class_1792)objectArray[0];
                    long l = (Long)objectArray[1];
                    l = a ^ l;
                    CallSite callSite = gh_0.a("\u00fb", (long)-5615700062706851191L, (long)l);
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
                                                                                                                                                                                                object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5613397169631832535L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                                                                if (callSite != null) break block86;
                                                                                                                                                                                                if (object != false) break block87;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                                            }
                                                                                                                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5613674857132126599L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                                                            if (callSite != null) break block86;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                                        }
                                                                                                                                                                                        if (object != false) break block87;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                                    }
                                                                                                                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5611883323814150051L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                                                    if (callSite != null) break block86;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                                }
                                                                                                                                                                                if (object != false) break block87;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                            }
                                                                                                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5611656799887466145L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                                            if (callSite != null) break block86;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                        }
                                                                                                                                                                        if (object != false) break block87;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                    }
                                                                                                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5611504702963335795L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                                    if (callSite != null) break block86;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                                }
                                                                                                                                                                if (object != false) break block87;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                            }
                                                                                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5615332818661431793L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                            if (callSite != null) break block86;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                        }
                                                                                                                                                        if (object != false) break block87;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                    }
                                                                                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5612183509869574655L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                                    if (callSite != null) break block86;
                                                                                                                                                }
                                                                                                                                                catch (MatchException matchException) {
                                                                                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                                }
                                                                                                                                                if (object != false) break block87;
                                                                                                                                            }
                                                                                                                                            catch (MatchException matchException) {
                                                                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                            }
                                                                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5613060616132213950L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                            if (callSite != null) break block86;
                                                                                                                                        }
                                                                                                                                        catch (MatchException matchException) {
                                                                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                        }
                                                                                                                                        if (object != false) break block87;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                    }
                                                                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5611937656561240269L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                                    if (callSite != null) break block86;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                                }
                                                                                                                                if (object != false) break block87;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                            }
                                                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5615155711295426605L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                            if (callSite != null) break block86;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                        }
                                                                                                                        if (object != false) break block87;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                    }
                                                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5613537663159877905L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                                    if (callSite != null) break block86;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                                }
                                                                                                                if (object != false) break block87;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                            }
                                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5612047728202445104L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                            if (callSite != null) break block86;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                        }
                                                                                                        if (object != false) break block87;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                    }
                                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5612584181246834133L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                                    if (callSite != null) break block86;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                                }
                                                                                                if (object != false) break block87;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                            }
                                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5611792683983344436L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                            if (callSite != null) break block86;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                        }
                                                                                        if (object != false) break block87;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                    }
                                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5612434642431164076L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                                    if (callSite != null) break block86;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                                }
                                                                                if (object != false) break block87;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                            }
                                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5612382543176098138L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                            if (callSite != null) break block86;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                        }
                                                                        if (object != false) break block87;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                    }
                                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5615067424466974363L, (long)l), (long)-5612262507194181245L, (long)l);
                                                                    if (callSite != null) break block86;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                                }
                                                                if (object != false) break block87;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                            }
                                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5614879153535922810L, (long)l), (long)-5612262507194181245L, (long)l);
                                                            if (callSite != null) break block86;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                        }
                                                        if (object != false) break block87;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                    }
                                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5615414670110352055L, (long)l), (long)-5612262507194181245L, (long)l);
                                                    if (callSite != null) break block86;
                                                }
                                                catch (MatchException matchException) {
                                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                                }
                                                if (object != false) break block87;
                                            }
                                            catch (MatchException matchException) {
                                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                            }
                                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5612256996355836307L, (long)l), (long)-5612262507194181245L, (long)l);
                                            if (callSite != null) break block86;
                                        }
                                        catch (MatchException matchException) {
                                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                        }
                                        if (object != false) break block87;
                                    }
                                    catch (MatchException matchException) {
                                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                    }
                                    object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5611720881802781402L, (long)l), (long)-5612262507194181245L, (long)l);
                                    if (callSite != null) break block86;
                                }
                                catch (MatchException matchException) {
                                    throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                                }
                                if (object != false) break block87;
                            }
                            catch (MatchException matchException) {
                                throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                            }
                            object = gh_0.a("l", (Object)class_17922, (Object)gh_0.a("i", (long)-5613110474503900747L, (long)l), (long)-5612262507194181245L, (long)l);
                            if (callSite != null) break block86;
                        }
                        catch (MatchException matchException) {
                            throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                        }
                        if (object == false) break block88;
                    }
                    catch (MatchException matchException) {
                        throw gh_0.a("\u00fb", (Object)matchException, (long)-5611622730024647341L, (long)l);
                    }
                }
                object = 1;
                break block86;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = gh_0.b(lookup, mutableCallSite, string, methodType, l, l2);
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

    private static Method h(long l, long l2) {
        int n = gh_0.e(l, l2);
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
                clazz3 = gh_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gh_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gh_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        gh_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gh_0.f(346715582064415L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gh_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gh_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gh_0.f(346715582064415L, 0L);
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
            int n = gh_0.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                gh_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gh_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gh_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = gh_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gh_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static boolean a(Object[] objectArray) {
        int n;
        block20: {
            block21: {
                CallSite callSite;
                long l;
                block16: {
                    class_2338 class_23382 = (class_2338)objectArray[0];
                    l = (Long)objectArray[1];
                    long l2 = (l = a ^ l) ^ 0x6F94C696DD49L;
                    int n2 = 0;
                    CallSite callSite2 = gh_0.a("l", (Object)gh_0.a("l", (Object)gh_0.a("L", (Object)b, (long)7089181360137177812L, (long)l), (long)7091202648706410868L, (long)l), (long)7088986969749919943L, (long)l);
                    callSite = gh_0.a("\u00fb", (long)7089045966731014905L, (long)l);
                    while (gh_0.a("l", (Object)callSite2, (long)7089633351681951345L, (long)l) != false) {
                        block17: {
                            CallSite callSite3;
                            block19: {
                                class_1542 class_15422;
                                block18: {
                                    class_1297 class_12972;
                                    block15: {
                                        class_1297 class_12973 = (class_1297)gh_0.a("l", (Object)callSite2, (long)7092467717736575398L, (long)l);
                                        try {
                                            try {
                                                class_12972 = class_12973;
                                                if (callSite != null) break block15;
                                                n = class_12972 instanceof class_1542;
                                                if (callSite != null) break block16;
                                            }
                                            catch (MatchException matchException) {
                                                throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                                            }
                                            if (n == 0) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                                        }
                                        class_12972 = class_12973;
                                    }
                                    class_15422 = (class_1542)class_12972;
                                    try {
                                        reference cfr_temp_0 = gh_0.a("l", (Object)class_15422, (long)7091070337023027441L, (long)l) - (double)gh_0.a("l", (Object)class_23382, (long)7091457794040100991L, (long)l);
                                        callSite3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                        if (callSite != null) break block18;
                                        if (callSite3 < 0) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l2;
                                    objectArray2[0] = gh_0.a("l", (Object)gh_0.a("l", (Object)class_15422, (long)7091385597555922702L, (long)l), (long)7089448897664044159L, (long)l);
                                    callSite3 = gh_0.a("\u00fb", (Object)objectArray2, (long)7089126068417097071L, (long)l);
                                }
                                try {
                                    if (callSite != null) break block19;
                                    if (callSite3 == false) continue;
                                }
                                catch (MatchException matchException) {
                                    throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                                }
                                reference cfr_temp_1 = gh_0.a("\u00fb", (double)gh_0.a("l", (Object)class_15422, (Object)gh_0.a("l", (Object)class_23382, (long)7092089128495772277L, (long)l), (long)7089757759227889609L, (long)l), (long)7090965871160055145L, (long)l) - 15.0;
                                callSite3 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                            }
                            try {
                                if (callSite3 > 0 && callSite == null) continue;
                            }
                            catch (MatchException matchException) {
                                throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                            }
                            ++n2;
                        }
                        if (callSite == null) continue;
                    }
                    n = n2;
                }
                try {
                    try {
                        if (callSite != null) break block20;
                        if (n <= 3) break block21;
                    }
                    catch (MatchException matchException) {
                        throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                    }
                    n = 1;
                    break block20;
                }
                catch (MatchException matchException) {
                    throw gh_0.a("\u00fb", (Object)matchException, (long)7093131958125679907L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u0014y\u001c7(I\u0002y\u0019m;^\u00152\u001ak7J\u0004u\r||X8";
        objectArray[1] = "(\u0002hKOC]\"cD^\f :pCWEH";
        objectArray[2] = "BMR\u0004\u000b\u0010BMEX\u0007\u001fX\u0006EF\u0007\n_w\u0017\u0012VK";
        objectArray[3] = "\u0019w\u0019@\u0010\u0013\u0019w\u000e\u001c\u001c\u001c\u0003<\u000e\u0002\u001c\t\u0004M\\YDH";
        objectArray[4] = "$%\n0\u001co/*\u001b\u007f}a$!\u001f%";
        objectArray[5] = Boolean.TYPE;
        gh_0.d[5] = "java/lang/Boolean";
        objectArray[6] = "\\*OB?}J*J\u0018,j]aI\u001e ~L&^\tkjP";
        objectArray[7] = "\u0017-\u0011I8c\u001c\"\u0000\u0006[n\t/\u000fmnl\u0018<\u0013Aya";
        objectArray[8] = "<+WHY\\7$F\u0007>D38@K\u001bU";
        objectArray[9] = "\u0017C%|C>\tK?3$?\u0018P2i\u00029";
        objectArray[10] = "Y\tR%`B,)Y*q\rM'R!uW9";
        objectArray[11] = " y&FKn y1\u001aGa:21\u0004Gt=CaY\u0016";
        objectArray[12] = "F@|`7TF@k<;[\\\u000bk\";N[z>}b";
        objectArray[13] = "!1P\u0019P\u0016!1GE\\\u0019;zG[\\\f<\u000b\u0015\u0000\u0004F";
        objectArray[14] = "d\u0006\u001fjmDo\t\u000e%\u000eIz\u000f";
        objectArray[15] = Double.TYPE;
        gh_0.d[15] = "java/lang/Double";
        objectArray[16] = "\u0005\u0003W*c\u0006\u0005\u0003@vo\t\u001fH@ho\u001c\u00189\u00121:]";
        objectArray[17] = "ybTA\u001f.ybC\u001d\u0013!c)C\u0003\u00134dX\u0012[A";
        objectArray[18] = "a{a#\u0006Na{v\u007f\nA{0va\nT|A'>X\u001f";
        objectArray[19] = Integer.TYPE;
        gh_0.d[19] = "java/lang/Integer";
        objectArray[20] = "\u001d\u001f3\"cl_Em`_l_I)6#jY$m2 \u007fF\u001c/d8a#";
        objectArray[21] = "\fIE9mr\u0004VE\u0000m\u0003\u001c\u0005L`<b\u0003QA\u0000";
        objectArray[22] = "<p\b!m\u000fr|\r(\u0006\u0019\u0000*Zoz\u0001rnRays;g\u000b:m\u001aa$Om\u0006";
        objectArray[23] = "\n\u0003~\u0012NtJ\u0018>\u0001?pT\u0015c\u0003h'\u000bH8o\u000fcM\u00166\u000eA#L\u001b";
        objectArray[24] = "\b@<GAvO]7R-~PB2Ez*\u000b\u0017l\u0019-*Q\u0015hO\u0015qPH4";
        objectArray[25] = "{Nkx^W<S`m2_#Leze\u0001x\u0011>\u0016\bQx\u001fg.SP%C";
        objectArray[26] = ":;\\eIW}&Wp%_b9Rgr\u000b9l\f7%\u000bcn\bm\u001dPb3T";
        objectArray[27] = "pXL\u0012a~%WF\nPz,\u0015K\u0011<H~X\u0013GP%!S\u0015\u0010h~ \u000eIv";
        objectArray[28] = "AcU!2?\u0006~^4^7\u0019a[#\tiC2\u0000Od9B2Yw?8\u001fn";
        objectArray[29] = ">c.hqY|56v\u0014\u0001iu\u0017wd\u001d\u00005#%~\nio`a)a";
        objectArray[30] = "z\\e\"&;=An7J3\"^k \u001dm}\b3Lp=y\rit+<$Q";
        objectArray[31] = "[]BE)\u000b[A\u0001D\u0014\u0013\\Y\u001aIx!\f\u001aB\u0011\u0014\u001dX\u001e@CzN\u000b\u0014\u001e.}\n[\u001b\u0001CsI\\@z";
        objectArray[32] = "SQ&E\n7\\Dm\u0003d0UH|\u001b\b\u0002\u0004\n!ATUS]'F\t;\u0000\u000e-\u0018d";
        objectArray[33] = "/_''\nShB,2f[w])%1\u0005+\rsI\\U,\u000e+q\u0007TqR";
        objectArray[34] = "\u00047r(S~C*y=?v\\5|*h(\u0001f#F\u0005x\u0007f~~^yZ:";
        objectArray[35] = "T\t.zOk\u0013\u0014%o#c\f\u000b xt=WVt\u0014\u0019mWX\",Bl\n\u0004";
        objectArray[36] = "<\u001b>\bg\u001a{\u00065\u001d\u000b\u0012d\u00190\n\\L>Lmf1\u001c?J2^j\u001db\u0016";
        objectArray[37] = "\u0015BaA3\u007fKH{\u0013CnWRwH8\u0003\u0015BaA3\u007fKH{\u0013C8\\\u0010tG*b\u001fT#,";
        objectArray[38] = "G#!>Kq\u0005u9 ./\u0014>\"L\u0015$\u0006#.0K.\u001cq^";
        objectArray[39] = "J\u0000@}H7\r\u001dKh$?\u0012\u0002N\u007fskIW\u0010\"$k\u0013U\u0014u\u001c0\u0012\bH";
        objectArray[40] = " \u0010(>\u001fvg\r#+s~x\u0012&<$ \"@}PIp#A$h\u0012q~\u001d";
        objectArray[41] = " Lzt\u0007@gQqakHxNtv<\u001c#\u001b* k\u001cy\u0019.|SGxDr";
        objectArray[42] = ">5^,L-y(U9 %f7P.wq=b\u000e\u007f qg`\n$\u0018*f=V";
        objectArray[43] = "#\u0000W\u001a\u0004+d\u001d\\\u000fh#{\u0002Y\u0018?}!S\rtR- Q[L\t,}\r";
        objectArray[44] = ",)Pp\t|k4[eett+^r2*/v\u0007\u001e_z/x\\&\u0004{r$";
        objectArray[45] = "Y+t$C\u0015\u001e6\u007f1/\u001d\u0001)z&xI[}\"s/I\u0000~ ,\u0017\u0012\u0001#|";
        objectArray[46] = "e~IKll\"cB^\u0000d=|GIW0f)\u0019\u001a\u00000<+\u001dC8k=vA";
        objectArray[47] = "eGb&*V+Kg/ACY\u001f5o9G0Z8);*dIf/,C!D -A";
        objectArray[48] = "bbQ[Y/k6\u0010P2*r\"\u0014j[-af\u0013\u0007Unf=h\u0003N;5#\u0005\r\r<nX";
        objectArray[49] = "@\u001bM\n\"U\u0007\u0006F\u001fN]\u0018\u0019C\b\u0019\u0003AI\u0017dtSCJA\\/R\u001e\u0016";
        objectArray[50] = "\u0005V/&P\u0010\u0005Jl'm\b\u0002Rw*\u0001:U\u0015,t]m\u0006R}s\u0016\u0000\b\u0011z(m";
        objectArray[51] = "\\{Vk\u00180\u001bf]~t8\u0004yXi#fU,\u0006\u0005N6_*Z=\u00157\u0002v";
        objectArray[52] = "\u001e\u001a\n<)cPZ\u000b1\u0018gC\u001b\u00125tU\u0017WKk\"\u0002\u0010\\\u0012/$cR\u0006Lm\u0018";
        objectArray[53] = "]LgXCr\u001aQlM/z\u0005NiZx$T\u001b06\u0015t^\u001dk\u000eNu\u0003A";
        objectArray[54] = "\u0013mpqi)\u0013q3pT1\u0014i(}8\u0003G$x!TeHr,+50Gx4\u001a";
        objectArray[55] = "f\u001e\t^q\u0014i\u000bB\u0018\u001f\u0013`\u0007S\u0000s!4C\tY#va\u0006\n\u0004#\u000bc\u0001I\n\u001f";
        objectArray[56] = "\u000eZ7z7)IG<o[!VX9x\fu\r\rf,[uW\u000fcrc.VR?";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "Rr\\D1\u0001\u0015oWQ]\t\npRF\nW[%\u000f*g\u0007Q#P\u0012<\u0006\f\u007f";
    }

    private static Field g(long l, long l2) {
        int n = gh_0.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = gh_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gh_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gh_0.c(clazz3, string2, clazz2)) != null) {
                    gh_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gh_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gh_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gh_0.f(346715582064415L, 0L);
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
            return MethodHandles.lookup().findStatic(gh_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1747
 *  net.minecraft.class_1812
 *  net.minecraft.class_3965
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
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1747;
import net.minecraft.class_1812;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.co
 */
public class co_0
implements cz_0 {
    private static final long a = hc.a(-3795974615189457820L, -4604779300560228931L, MethodHandles.lookup().lookupClass()).a(83341199013999L);
    private static final Object[] c = new Object[58];
    private static final String[] d = new String[58];

    static {
        co_0.a();
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
            case 0 -> 56;
            case 1 -> 44;
            case 2 -> 41;
            case 3 -> 9;
            case 4 -> 31;
            case 5 -> 60;
            case 6 -> 36;
            case 7 -> 24;
            case 8 -> 21;
            case 9 -> 7;
            case 10 -> 2;
            case 11 -> 43;
            case 12 -> 16;
            case 13 -> 38;
            case 14 -> 42;
            case 15 -> 26;
            case 16 -> 49;
            case 17 -> 28;
            case 18 -> 57;
            case 19 -> 1;
            case 20 -> 14;
            case 21 -> 62;
            case 22 -> 59;
            case 23 -> 40;
            case 24 -> 23;
            case 25 -> 51;
            case 26 -> 4;
            case 27 -> 15;
            case 28 -> 34;
            case 29 -> 47;
            case 30 -> 6;
            case 31 -> 20;
            case 32 -> 13;
            case 33 -> 5;
            case 34 -> 27;
            case 35 -> 18;
            case 36 -> 52;
            case 37 -> 10;
            case 38 -> 54;
            case 39 -> 8;
            case 40 -> 22;
            case 41 -> 35;
            case 42 -> 48;
            case 43 -> 46;
            case 44 -> 3;
            case 45 -> 58;
            case 46 -> 61;
            case 47 -> 39;
            case 48 -> 29;
            case 49 -> 0;
            case 50 -> 63;
            case 51 -> 50;
            case 52 -> 33;
            case 53 -> 37;
            case 54 -> 30;
            case 55 -> 32;
            case 56 -> 25;
            case 57 -> 19;
            case 58 -> 53;
            case 59 -> 55;
            case 60 -> 11;
            case 61 -> 12;
            case 62 -> 17;
            default -> 45;
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
        co_0.d[n3] = new String(cArray);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean e(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        block34: {
            CallSite callSite3;
            long l;
            block33: {
                block32: {
                    block31: {
                        block30: {
                            CallSite callSite4;
                            block28: {
                                block29: {
                                    l = (Long)objectArray[0];
                                    l = a ^ l;
                                    callSite3 = co_0.a("G", (long)-121063016643591315L, (long)l);
                                    try {
                                        try {
                                            callSite4 = co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l);
                                            if (callSite3 != null) break block28;
                                            if (co_0.a("\u00f4", (Object)callSite4, (Object)co_0.a("Z", (long)-118744319010426486L, (long)l), (long)-121546872903139806L, (long)l) == null) break block29;
                                            return true;
                                        }
                                        catch (MatchException matchException) {
                                            throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                                    }
                                }
                                callSite4 = co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            int n = co_0.a("\u00f4", (Object)callSite4, (long)-117209358180504032L, (long)l) instanceof class_1812;
                                            if (callSite3 != null) return n != 0;
                                            if (n != 0) return 1 != 0;
                                        }
                                        catch (MatchException matchException) {
                                            throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                                        }
                                        callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l), (long)-117209358180504032L, (long)l);
                                        callSite = co_0.a("Z", (long)-118088273165072071L, (long)l);
                                        if (callSite3 != null) break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                                    }
                                    if (callSite2 == callSite) return 1 != 0;
                                }
                                catch (MatchException matchException) {
                                    throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                                }
                                callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l), (long)-117209358180504032L, (long)l);
                                callSite = co_0.a("Z", (long)-118061254297626590L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite3 != null) break block31;
                                if (callSite2 == callSite) return 1 != 0;
                            }
                            catch (MatchException matchException) {
                                throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                            }
                            callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l), (long)-117209358180504032L, (long)l);
                            callSite = co_0.a("Z", (long)-117511809991870490L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block32;
                            if (callSite2 == callSite) return 1 != 0;
                        }
                        catch (MatchException matchException) {
                            throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                        }
                        callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l), (long)-117209358180504032L, (long)l);
                        callSite = co_0.a("Z", (long)-117319807307896886L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                    }
                }
                try {
                    try {
                        if (callSite3 != null) break block33;
                        if (callSite2 == callSite) return 1 != 0;
                    }
                    catch (MatchException matchException) {
                        throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                    }
                    callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l), (long)-117209358180504032L, (long)l);
                    callSite = co_0.a("Z", (long)-117405893202055141L, (long)l);
                }
                catch (MatchException matchException) {
                    throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                }
            }
            try {
                try {
                    if (callSite3 != null) break block34;
                    if (callSite2 == callSite) return 1 != 0;
                }
                catch (MatchException matchException) {
                    throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
                }
                callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-121447925506132432L, (long)l), (long)-117873247097614952L, (long)l), (long)-117209358180504032L, (long)l);
                callSite = co_0.a("Z", (long)-118173306625087047L, (long)l);
            }
            catch (MatchException matchException) {
                throw co_0.a("G", (Object)matchException, (long)-121316675178092133L, (long)l);
            }
        }
        if (callSite2 != callSite) return 0 != 0;
        return 1 != 0;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = co_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static float b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (float)co_0.a("G", (Object)new Object[]{(boolean)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)5780819985648326745L, (long)l), (long)5780157498548484284L, (long)l)}, (long)5779446139833823193L, (long)l);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == 'Q' || c == 'Z' || c == '\u00ff') {
                field = co_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = co_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        block10: {
            block11: {
                CallSite callSite;
                long l;
                class_1268 class_12682;
                block8: {
                    CallSite callSite2;
                    block9: {
                        class_3965 class_39652 = (class_3965)objectArray[0];
                        class_12682 = (class_1268)objectArray[1];
                        l = (Long)objectArray[2];
                        l = a ^ l;
                        callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-935244270135247309L, (long)l), (Object)co_0.a("\u00e1", (Object)b, (long)-932335136838403217L, (long)l), (Object)class_12682, (Object)class_39652, (long)-935506883846569614L, (long)l);
                        callSite = co_0.a("G", (long)-932583552298807758L, (long)l);
                        try {
                            try {
                                object = co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-932335136838403217L, (long)l), (long)-934929831402713381L, (long)l);
                                if (callSite != null) break block8;
                                if (object != false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw co_0.a("G", (Object)matchException, (long)-932290474382482236L, (long)l);
                            }
                            co_0.a("\u00f4", (Object)co_0.a("Z", (long)-935620132276621179L, (long)l), (Object)new Object[]{true}, (long)-936470976008067415L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw co_0.a("G", (Object)matchException, (long)-932290474382482236L, (long)l);
                        }
                    }
                    object = co_0.a("\u00f4", (Object)callSite2, (long)-932396088462285369L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw co_0.a("G", (Object)matchException, (long)-932290474382482236L, (long)l);
                    }
                    co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-932335136838403217L, (long)l), (Object)class_12682, (long)-935173139681894895L, (long)l);
                    return true;
                }
                catch (MatchException matchException) {
                    throw co_0.a("G", (Object)matchException, (long)-932290474382482236L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    public static void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-5426363405906674479L, (long)l), (long)-5422948471404626866L, (long)l);
    }

    public static boolean c(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    CallSite callSite2;
                    block9: {
                        class_1268 class_12682 = (class_1268)objectArray[0];
                        l = (Long)objectArray[1];
                        l = a ^ l;
                        callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-9108692617418830687L, (long)l), (Object)co_0.a("\u00e1", (Object)b, (long)-9106953304352962051L, (long)l), (Object)class_12682, (long)-9110134943297683446L, (long)l);
                        callSite = co_0.a("G", (long)-9107131483570373472L, (long)l);
                        try {
                            try {
                                object = co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-9106953304352962051L, (long)l), (long)-9109583183299855287L, (long)l);
                                if (callSite != null) break block8;
                                if (object != false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw co_0.a("G", (Object)matchException, (long)-9106873448492509610L, (long)l);
                            }
                            co_0.a("\u00f4", (Object)co_0.a("Z", (long)-9109033359024340457L, (long)l), (Object)new Object[]{true}, (long)-9109998633628330949L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw co_0.a("G", (Object)matchException, (long)-9106873448492509610L, (long)l);
                        }
                    }
                    object = co_0.a("\u00f4", (Object)callSite2, (long)-9107049569201121451L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw co_0.a("G", (Object)matchException, (long)-9106873448492509610L, (long)l);
                    }
                    co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-9106953304352962051L, (long)l), (Object)co_0.a("Z", (long)-9109819790687583115L, (long)l), (long)-9108621633007948669L, (long)l);
                    return true;
                }
                catch (MatchException matchException) {
                    throw co_0.a("G", (Object)matchException, (long)-9106873448492509610L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
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
        int n = co_0.e(l, l2);
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
                clazz3 = co_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = co_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = co_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        co_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = co_0.f(1539898469425007L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = co_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        co_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = co_0.f(1539898469425007L, 0L);
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

    public static boolean f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-4588325082891843534L, (long)l), (long)-4584871622779751526L, (long)l), (long)-4585245163390726110L, (long)l) instanceof class_1747;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = co_0.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                co_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static boolean d(Object[] objectArray) {
        Object object;
        block16: {
            block13: {
                block15: {
                    CallSite callSite;
                    CallSite callSite2;
                    CallSite callSite3;
                    long l;
                    long l2;
                    block14: {
                        CallSite callSite4;
                        block12: {
                            l2 = (Long)objectArray[0];
                            l = (l2 = a ^ l2) ^ 0x4FAD7F26CFB8L;
                            callSite3 = co_0.a("G", (long)-7543042117401843091L, (long)l2);
                            try {
                                try {
                                    callSite4 = co_0.a("\u00e1", (Object)b, (long)-7543290532470333648L, (long)l2);
                                    if (callSite3 != null) break block12;
                                    if (co_0.a("\u00f4", (Object)callSite4, (long)-7539860636185632254L, (long)l2) == false) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw co_0.a("G", (Object)matchException, (long)-7543351412980465509L, (long)l2);
                                }
                                callSite4 = co_0.a("\u00e1", (Object)b, (long)-7543290532470333648L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw co_0.a("G", (Object)matchException, (long)-7543351412980465509L, (long)l2);
                            }
                        }
                        try {
                            try {
                                callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)callSite4, (long)-7539760166874389352L, (long)l2), (long)-7539087009923807456L, (long)l2);
                                callSite = co_0.a("Z", (long)-7539728779850554117L, (long)l2);
                                if (callSite3 != null) break block14;
                                if (callSite2 == callSite) break block15;
                            }
                            catch (MatchException matchException) {
                                throw co_0.a("G", (Object)matchException, (long)-7543351412980465509L, (long)l2);
                            }
                            callSite2 = co_0.a("\u00f4", (Object)co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-7543290532470333648L, (long)l2), (long)-7540276511810142703L, (long)l2), (long)-7539087009923807456L, (long)l2);
                            callSite = co_0.a("Z", (long)-7539728779850554117L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw co_0.a("G", (Object)matchException, (long)-7543351412980465509L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite2 != callSite) break block13;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l;
                            object = co_0.a("G", (Object)objectArray2, (long)-7540567512848609567L, (long)l2);
                            if (callSite3 != null) break block16;
                        }
                        catch (MatchException matchException) {
                            throw co_0.a("G", (Object)matchException, (long)-7543351412980465509L, (long)l2);
                        }
                        if (object != 0) break block13;
                    }
                    catch (MatchException matchException) {
                        throw co_0.a("G", (Object)matchException, (long)-7543351412980465509L, (long)l2);
                    }
                }
                object = 1;
                break block16;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = co_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = co_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = co_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = co_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/zprestige/prestige/co" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-7236331483354949979L, (long)l), (Object)co_0.a("\u00e1", (Object)b, (long)-7234587840999795719L, (long)l), (Object)class_12972, (long)-7237269308578611116L, (long)l);
        co_0.a("\u00f4", (Object)co_0.a("\u00e1", (Object)b, (long)-7234587840999795719L, (long)l), (Object)co_0.a("Z", (long)-7235202527420064143L, (long)l), (long)-7236261598489250169L, (long)l);
        co_0.a("\u00f4", (Object)co_0.a("Z", (long)-7236659099477485549L, (long)l), (Object)new Object[]{true}, (long)-7235378003169374657L, (long)l);
    }

    public static boolean a(Object[] objectArray) {
        class_3965 class_39652 = (class_3965)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x6085CDB1C88AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = co_0.a("Z", (long)-7119295042316511019L, (long)l);
        objectArray2[0] = class_39652;
        return (boolean)co_0.a("G", (Object)objectArray2, (long)-7118221828475500814L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "A\u0003t\u0005\u001cwW\u0003q_\u000f`@HrY\u0003tQ\u000feNHfm";
        objectArray[1] = "gfJPG\u001f\u0012FA_VPo^RX_\u0019\u0007";
        objectArray[2] = "_boX< _bx\u00040/E)x\u001a0:BX*Dgp";
        objectArray[3] = Boolean.TYPE;
        co_0.d[3] = "java/lang/Boolean";
        objectArray[4] = "oIG\u0000k\u0019oIP\\g\u0016u\u0002PBg\u0003rs\u0000\u001f6";
        objectArray[5] = "kI^r\\4kII.P;q\u0002I0P.vs\u001dh\u0007";
        objectArray[6] = "U\r3sCTC\r6)PCTF5/\\WE\u0001\"8\u0017G^";
        objectArray[7] = "s6[\b\u0005\u0019x9JGf\u0014m4E,S\u0016|'Y\u0000D\u001b";
        objectArray[8] = "d?\u000b>^1d?\u001cbR>~t\u001c|R+y\u0005I#\u0005";
        objectArray[9] = "U>I \rIU>^|\u0001FOu^b\u0001SH\u0004\f8U\u0017";
        objectArray[10] = "\u0013N&E\u0011L\u0013N1\u0019\u001dC\t\u00051\u0007\u001dV\u000etcYJ\u001d";
        objectArray[11] = "\b=8`\u0006\u0000\u001e==:\u0015\u0017\tv><\u0019\u0003\u00181)+R\u0014(";
        objectArray[12] = "R8:j\\$'\u00181eMkF\u0016:nI12";
        objectArray[13] = Void.TYPE;
        co_0.d[13] = "java/lang/Void";
        objectArray[14] = "Yf\u0014&\u0012WOf\u0011|\u0001@X-\u0012z\rTIj\u0005mFDQj\u0007f\u001c\tmq\u0007{\u001cNZf";
        objectArray[15] = "68_o\\l68H3Pc,sH-Pv+\u0002\u0018x\u00070";
        objectArray[16] = "x:]\u007f\\*x:J#P%bqJ=P0e\u0000\u0018f\bz";
        objectArray[17] = "[\u0018Q<8\u0013[\u0018F`4\u001cASF~4\tF\"\u0014%lH";
        objectArray[18] = "W{gF;D\"[lI*\u000bCUgB.Q7";
        objectArray[19] = "O\f\u0005\u0005\u007fuO\f\u0012YszUG\u0012GsoR6@\u0013\".";
        objectArray[20] = "\u0006\u0003\u001d-PB\u0006\u0003\nq\\M\u001cH\no\\X\u001b9P0\u000e\u001a";
        objectArray[21] = "`\u0013\u0012e\u0016\u0005k\u001c\u0003*w\u000b`\u0017\u0007p";
        objectArray[22] = "WXj+\u007foWX}ws`M\u0013}isuJb'6!2";
        objectArray[23] = "/F#\u0012|\u0001Zf(\u001dmN;h#\u0016i\u0014O";
        objectArray[24] = ">6H\u0004}*>6_Xq%$}_Fq0#\f\r\u0018)t";
        objectArray[25] = "(3OqQ\u0004]\u0013D~@K<\u001dOuD\u0011H";
        objectArray[26] = Float.TYPE;
        co_0.d[26] = "java/lang/Float";
        objectArray[27] = ";:\u001c\u001e\u0011[g?\\`\u000b!)b]\u0018\u0001L:i\u001d`";
        objectArray[28] = "?;\u001cyG\u00100i\u00048x\b8-\u0003!\u0014:ha]wDm9/R$\b\u00157n\u001a,x\u0003h,\u0001\"I\u0015ln\u0011F";
        objectArray[29] = "?>OZ\u0017)}%E\u001atsk:O@\u0018A<}\u0011\u0019I\u0016<#Q\u001eLrm!\u0010_t";
        objectArray[30] = "D$\u00077bBDt\u001a>RW\u001ev\u000e?\u0005\u0000@!VSiA\u0014$\r-nB\u0013$";
        objectArray[31] = ",2Y7yF~2I$\u001eR\u0010t\u0019.'J,rZ2!;-uCqo\u0007+6_w\u001e";
        objectArray[32] = "\u0016wkwp\u001c\u0015qg{\u0000\u0014\u001bpjrWJ@-1\u001ekFA,pbi\u0013\u0005'";
        objectArray[33] = "O7'~0j\u000fm0n\nb\u001f,(efPHaq3\n9C,tr7z\r?(\u00025nOaqy6eJ:H;rg\u000f3wyimOP";
        objectArray[34] = "\n\u000eiu2)\u0005\\q4\r1\r\u0018v-a\u0003_U.{\r?\\_'4q=\t\u001b,J";
        objectArray[35] = "\f\\s-\u0006\nJZxkd\u00053Aei\u0006\u0018LDlc\u001bj\u0002Kl}X\u0003WA|wd";
        objectArray[36] = "sZ\u007fGX\u001etYxG?\u0005%^t\u001fS7v\u0012$G\u000f`rGjA\u0007\u0004#E+\u0000?";
        objectArray[37] = "<\u0003w>6\u0018?\bre\u000f\rb\u0007.cX^3Rz\u000f0\n>[st3\u0001;\u0000";
        objectArray[38] = "}\\b\u0013sG~Zn\u001f\u0003Op[c\u0016T\u0011/\r;zh\u001d*\u0007y\u0006jHn\f";
        objectArray[39] = "\u001an`$\u0017q\u0019hl(gy\u0017ia!0'J?;M\f+M5{1\u000e~\t>";
        objectArray[40] = "2%x5\u000f>5&\u007f5h%d!sm\u0004\u00177e/5h*c\",5\u0015%1:m\n";
        objectArray[41] = "PPw\u0019^jWSp\u00199q\u0006T|AUCU\u0011%\u001b9.\u000eV%\u001e]\u007f\f\u0017d&";
        objectArray[42] = "wZT *X%ZD3MLKAS%/W4DZ/2%*N\u00102v\u001e,\u0019O=M";
        objectArray[43] = "\u0018\u001f--2a\u001b\u0019!!Bi\u0015\u0018,(\u00157NHuD);OD68+n\u000bO";
        objectArray[44] = "\u000bO\u001dRq&\bI\u0011^\u0001.\u0006H\u001cWVp^\u0018@;j|\\\u0014\u0006Gh)\u0018\u001f";
        objectArray[45] = "_G\u0014\u001f\u0012\u0004\\A\u0018\u0013b\fR@\u0015\u001a5R\u000e\u0011Jv\t^\b\u001c\u000f\n\u000b\u000bL\u0017";
        objectArray[46] = "\u0010(T3`/\u0013.X?\u0010'\u001d/U6GyLz\nZ{uGsO&y \u0003x";
        objectArray[47] = "e\u001c{%\u0011\u0013b\u001f|%v\b3\u0018p}\u001a:d_.$Gmo\u000ebtJ\u0004:\u0004r~v";
        objectArray[48] = "`|tD\u000b\u0017904]i\b\t}5RW\ri;3Y\u0011";
        objectArray[49] = "* E)\u000e7jzR94?z;J2X\r-w\u001bk4ao,\u00152Jfl+\u0015U\u000b3*v\u0013.\b8/-*?\rko)\u0010:OkvG\u0013-T'txQ6^g\u0017";
        objectArray[50] = "d8\u0007\r\u0015~68\u0017\u001eriX#\u0000\b\u0010q'&\t\u0002\r\u0003b&\u0005KJg3$D\nr";
        objectArray[51] = "!-7\u0019Ob&.0\u0019(yw)<ADK$mc\u0017(vp*c\u0019Uy\"2\"&";
        objectArray[52] = "\u0000$UX<&_u\u0002U\r%\u000f#\u000bKZvVvP\u001a\r'\u0010\u007f\rWu)Q7\u0005";
        objectArray[53] = "bGa33_b\u0017|:\u0003J8\u0015h;T\u001dfF5W>C6\u00046:~\u0019!\u0014";
        objectArray[54] = "{KRVC\u001d|HUV$\u0006-OY\u000eH4~\n\u0001U$\\)\u000e\bP__\"\u000bSi\u0015\t2]\u0005\u0000@\u0003\"W9";
        objectArray[55] = "\u0007]&z\\CU]6i;S;F!\u007fYLDC(uD>\u0001C$<\u0003ZPAe};";
        objectArray[56] = "{aS\u0019Mw;;D\tw\u007f+z\\\u0002\u001bM|7\u0005Uw$wz\u0000\u0015Jg9i\\e\u0017**<\u0002XN##?<T\u001dh(:U\u0001\u0017x\"\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "C.I\u001e%TD-N\u001eBO\u0015*BF.}Gm\u0018\u001cB\u0010\u001d(\u001b\u0019&A\u001fiZ!";
    }

    public static float a(Object[] objectArray) {
        float f;
        boolean bl = (Boolean)objectArray[0];
        try {
            f = bl ? 5.0f : 4.5f;
        }
        catch (MatchException matchException) {
            throw co_0.a(matchException);
        }
        return f;
    }

    private static Field g(long l, long l2) {
        int n = co_0.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = co_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = co_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = co_0.c(clazz3, string2, clazz2)) != null) {
                    co_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = co_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        co_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = co_0.f(1539898469425007L, 0L);
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
            return MethodHandles.lookup().findStatic(co_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


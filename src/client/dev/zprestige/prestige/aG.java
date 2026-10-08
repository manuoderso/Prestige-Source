/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1299
 *  net.minecraft.class_583
 *  net.minecraft.class_897
 *  net.minecraft.class_922
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.cZ;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.de_0;
import dev.zprestige.prestige.dr_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.o_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1299;
import net.minecraft.class_583;
import net.minecraft.class_897;
import net.minecraft.class_922;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aG
implements cz_0 {
    private static de_0 a;
    public static final Map c;
    public static cZ d;
    public static boolean e;
    public static boolean f;
    private static final Map g;
    private static final Class h;
    private static final long i;
    private static final Object[] j;
    private static final String[] k;

    static {
        i = hc.a(-7766564800305732860L, 5018871411404311519L, MethodHandles.lookup().lookupClass()).a(211102163362778L);
        long l = i ^ 0xBB4836EBEC8L;
        long l2 = l ^ 0x6EA3AA7D7B47L;
        j = new Object[63];
        k = new String[63];
        aG.a();
        a = aG.a("\u00c6", (Object)((Object)o_0.NORMAL), (Object)new Object[0], (long)425441043591286431L, (long)l);
        c = new ConcurrentHashMap();
        d = new cZ(new class_1299[0], l2);
        e = 0;
        f = 0;
        g = new ConcurrentHashMap();
        h = Void.class;
        aG.a("\u00c6", (Object)dr_0.c, aG::lambda$static$0, (long)424838605669279214L, (long)l);
        aG.a("\u00c6", (Object)dr_0.b, aG::lambda$static$1, (long)424838605669279214L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 47;
            case 1 -> 45;
            case 2 -> 36;
            case 3 -> 4;
            case 4 -> 46;
            case 5 -> 26;
            case 6 -> 7;
            case 7 -> 51;
            case 8 -> 13;
            case 9 -> 49;
            case 10 -> 57;
            case 11 -> 6;
            case 12 -> 40;
            case 13 -> 55;
            case 14 -> 53;
            case 15 -> 29;
            case 16 -> 60;
            case 17 -> 0;
            case 18 -> 30;
            case 19 -> 27;
            case 20 -> 37;
            case 21 -> 63;
            case 22 -> 59;
            case 23 -> 25;
            case 24 -> 61;
            case 25 -> 23;
            case 26 -> 31;
            case 27 -> 50;
            case 28 -> 18;
            case 29 -> 22;
            case 30 -> 9;
            case 31 -> 14;
            case 32 -> 28;
            case 33 -> 48;
            case 34 -> 58;
            case 35 -> 10;
            case 36 -> 35;
            case 37 -> 1;
            case 38 -> 52;
            case 39 -> 21;
            case 40 -> 33;
            case 41 -> 17;
            case 42 -> 54;
            case 43 -> 24;
            case 44 -> 34;
            case 45 -> 3;
            case 46 -> 44;
            case 47 -> 19;
            case 48 -> 2;
            case 49 -> 5;
            case 50 -> 62;
            case 51 -> 16;
            case 52 -> 12;
            case 53 -> 39;
            case 54 -> 43;
            case 55 -> 11;
            case 56 -> 42;
            case 57 -> 38;
            case 58 -> 32;
            case 59 -> 8;
            case 60 -> 20;
            case 61 -> 41;
            case 62 -> 15;
            default -> 56;
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
        aG.k[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = aG.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean b(Object[] var0) {
        block40: {
            block39: {
                block38: {
                    block49: {
                        block37: {
                            block36: {
                                var1_1 = (class_583)var0[0];
                                var2_2 = (Long)var0[1];
                                v0 = var2_2 = aG.i ^ var2_2;
                                var4_3 = v0 ^ 76965806763794L;
                                var6_4 = v0 ^ 127172186057290L;
                                var9_5 = var1_1.getClass();
                                var8_6 = aG.a("\u00d2", (long)5249611913706527029L, (long)var2_2);
                                var10_7 = (Boolean)aG.a("\u00c6", (Object)aG.c, var9_5, (long)5249452323972875664L, (long)var2_2);
                                try {
                                    v1 = var10_7;
                                    if (var8_6 != null) break block36;
                                    if (v1 == null) break block37;
                                }
                                catch (MatchException v2) {
                                    throw aG.a("\u00d2", (Object)v2, (long)5250251734102637229L, (long)var2_2);
                                }
                                v1 = var10_7;
                            }
                            return (boolean)aG.a("\u00c6", (Object)v1, (long)5250379393744813106L, (long)var2_2);
                        }
                        v3 = new Object[1];
                        v3[0] = var6_4;
                        v4 /* !! */  = aG.a("\u00c6", (Object)aG.d, (Object)v3, (long)5250062318019204718L, (long)var2_2);
                        if (var8_6 != null) break block38;
                        if (v4 /* !! */  != false) ** GOTO lbl39
                        break block49;
                        catch (MatchException v5) {
                            throw aG.a("\u00d2", (Object)v5, (long)5250251734102637229L, (long)var2_2);
                        }
                    }
                    try {
                        block50: {
                            if (aG.a("u", (Object)aG.b, (long)5249240977321552594L, (long)var2_2) != null) break block39;
                            break block50;
                            catch (MatchException v6) {
                                throw aG.a("\u00d2", (Object)v6, (long)5250251734102637229L, (long)var2_2);
                            }
                        }
                        v4 /* !! */  = (CallSite)0;
                    }
                    catch (MatchException v7) {
                        throw aG.a("\u00d2", (Object)v7, (long)5250251734102637229L, (long)var2_2);
                    }
                }
                return (boolean)v4 /* !! */ ;
            }
            var11_8 = aG.a("\u00c6", (Object)aG.d, (long)5249549413395415461L, (long)var2_2);
            while (aG.a("\u00c6", (Object)var11_8, (long)5248957679389871282L, (long)var2_2) != false) {
                block45: {
                    block47: {
                        block48: {
                            block43: {
                                block41: {
                                    block42: {
                                        var12_9 = (class_1299)aG.a("\u00c6", (Object)var11_8, (long)5251196367596618231L, (long)var2_2);
                                        v8 /* !! */  = var12_9;
                                        if (var8_6 != null) break block40;
                                        try {
                                            block51: {
                                                if (var8_6 != null) break block41;
                                                break block51;
                                                catch (MatchException v9) {
                                                    throw aG.a("\u00d2", (Object)v9, (long)5250251734102637229L, (long)var2_2);
                                                }
                                            }
                                            if (v8 /* !! */  != aG.a("\u00e5", (long)5250424896128110016L, (long)var2_2)) break block42;
                                        }
                                        catch (MatchException v10) {
                                            throw aG.a("\u00d2", (Object)v10, (long)5250251734102637229L, (long)var2_2);
                                        }
                                        var13_10 = aG.a("u", (Object)aG.b, (long)5249750066640047943L, (long)var2_2);
                                        var14_11 = 0;
                                        try {
                                            if (var13_10 == null) {
                                                continue;
                                            }
                                            break block43;
                                        }
                                        catch (MatchException v11) {
                                            throw aG.a("\u00d2", (Object)v11, (long)5250251734102637229L, (long)var2_2);
                                        }
                                    }
                                    v12 = var12_9;
                                }
                                var13_10 = aG.a("\u00c6", (Object)v12, (Object)aG.a("u", (Object)aG.b, (long)5249240977321552594L, (long)var2_2), null, (long)5250181712487109557L, (long)var2_2);
                                try {
                                    if (var13_10 == null) {
                                        continue;
                                    }
                                }
                                catch (MatchException v13) {
                                    throw aG.a("\u00d2", (Object)v13, (long)5250251734102637229L, (long)var2_2);
                                }
                                var14_11 = 1;
                            }
                            try {
                                block46: {
                                    block44: {
                                        var15_12 = aG.a("\u00c6", (Object)aG.a("\u00c6", (Object)aG.b, (long)5249028790278111472L, (long)var2_2), (Object)var13_10, (long)5250867486593164281L, (long)var2_2);
                                        v14 = new Object[2];
                                        v14[1] = var4_3;
                                        v14[0] = var15_12;
                                        var16_13 = aG.a("\u00d2", (Object)v14, (long)5250771502159249802L, (long)var2_2);
                                        try {
                                            v15 = var16_13;
                                            if (var8_6 != null) break block44;
                                            if (v15 == null) break block45;
                                        }
                                        catch (MatchException v16) {
                                            throw aG.a("\u00d2", (Object)v16, (long)5250251734102637229L, (long)var2_2);
                                        }
                                        v15 = var16_13;
                                    }
                                    if (var8_6 != null) break block46;
                                    try {
                                        block52: {
                                            if (v15 != var9_5) break block45;
                                            break block52;
                                            catch (MatchException v17) {
                                                throw aG.a("\u00d2", (Object)v17, (long)5250251734102637229L, (long)var2_2);
                                            }
                                        }
                                        v15 = aG.a("\u00c6", (Object)aG.c, var9_5, (Object)aG.a("\u00d2", (boolean)true, (long)5250990479268303604L, (long)var2_2), (long)5249387745411727991L, (long)var2_2);
                                    }
                                    catch (MatchException v18) {
                                        throw aG.a("\u00d2", (Object)v18, (long)5250251734102637229L, (long)var2_2);
                                    }
                                }
                                var17_14 = 1;
                            }
                            catch (Throwable var18_15) {
                                try {
                                    if (var14_11 != 0) {
                                        aG.a("\u00c6", (Object)var13_10, (long)5250556416425698909L, (long)var2_2);
                                    }
                                }
                                catch (MatchException v19) {
                                    throw aG.a("\u00d2", (Object)v19, (long)5250251734102637229L, (long)var2_2);
                                }
                                throw var18_15;
                            }
                            v20 = var14_11;
                            if (var8_6 != null) break block47;
                            try {
                                block53: {
                                    if (v20 == 0) break block48;
                                    break block53;
                                    catch (MatchException v21) {
                                        throw aG.a("\u00d2", (Object)v21, (long)5250251734102637229L, (long)var2_2);
                                    }
                                }
                                aG.a("\u00c6", (Object)var13_10, (long)5250556416425698909L, (long)var2_2);
                            }
                            catch (MatchException v22) {
                                throw aG.a("\u00d2", (Object)v22, (long)5250251734102637229L, (long)var2_2);
                            }
                        }
                        v20 = var17_14;
                    }
                    return (boolean)v20;
                }
                try {
                    if (var14_11 == 0) ** GOTO lbl145
                    aG.a("\u00c6", (Object)var13_10, (long)5250556416425698909L, (long)var2_2);
                }
                catch (MatchException v23) {
                    throw aG.a("\u00d2", (Object)v23, (long)5250251734102637229L, (long)var2_2);
                }
lbl145:
                // 2 sources

                if (var8_6 == null) continue;
            }
            v8 /* !! */  = aG.a("\u00c6", (Object)aG.c, var9_5, (Object)aG.a("\u00d2", (boolean)false, (long)5250990479268303604L, (long)var2_2), (long)5249387745411727991L, (long)var2_2);
        }
        return false;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'u' || c == 'a' || c == '\u00e5' || c == '\u00d6') {
                field = aG.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aG.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    public static boolean c(Object[] objectArray) {
        class_583 class_5832 = (class_583)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = i ^ l) ^ 0x73F0A8F60253L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = d;
        objectArray2[0] = class_5832;
        return (boolean)aG.a("\u00d2", (Object)objectArray2, (long)-7694583028762313178L, (long)l);
    }

    private static Method h(long l, long l2) {
        int n = aG.e(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = aG.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aG.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aG.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        aG.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aG.f(722257712076554L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aG.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aG.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aG.f(722257712076554L, 0L);
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
            int n = aG.e(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                aG.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aG.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aG.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = aG.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aG.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("dev/zprestige/prestige/aG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void a(Object[] objectArray) {
        block11: {
            CallSite callSite;
            block13: {
                o_0 o_02;
                CallSite callSite2;
                long l;
                o_0 o_03;
                block12: {
                    block10: {
                        o_03 = (o_0)((Object)objectArray[0]);
                        l = (Long)objectArray[1];
                        l = i ^ l;
                        callSite2 = aG.a("\u00d2", (long)-6381004791212656995L, (long)l);
                        try {
                            o_02 = o_03;
                            if (callSite2 != null) break block10;
                            if (o_02 == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw aG.a("\u00d2", (Object)matchException, (long)-6380219783760702203L, (long)l);
                        }
                        o_02 = o_03;
                    }
                    try {
                        try {
                            if (callSite2 != null) break block12;
                            if (o_02 == o_0.NONE) break block11;
                        }
                        catch (MatchException matchException) {
                            throw aG.a("\u00d2", (Object)matchException, (long)-6380219783760702203L, (long)l);
                        }
                        o_02 = o_03;
                    }
                    catch (MatchException matchException) {
                        throw aG.a("\u00d2", (Object)matchException, (long)-6380219783760702203L, (long)l);
                    }
                }
                try {
                    try {
                        callSite = aG.a("\u00c6", (Object)((Object)o_02), (Object)new Object[0], (long)-6379816532833342450L, (long)l);
                        if (callSite2 != null) break block13;
                        if (callSite == null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw aG.a("\u00d2", (Object)matchException, (long)-6380219783760702203L, (long)l);
                    }
                    callSite = aG.a("\u00c6", (Object)((Object)o_03), (Object)new Object[0], (long)-6379816532833342450L, (long)l);
                }
                catch (MatchException matchException) {
                    throw aG.a("\u00d2", (Object)matchException, (long)-6380219783760702203L, (long)l);
                }
            }
            a = callSite;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static de_0 a(Object[] objectArray) {
        return a;
    }

    /*
     * Loose catch block
     */
    private static Class a(Object[] objectArray) {
        Class<class_583> clazz;
        block26: {
            Class<class_583> clazz2;
            Class<?> clazz3;
            Map map;
            Class clazz4;
            long l;
            block29: {
                block30: {
                    CallSite callSite;
                    Class<?> clazz5;
                    block32: {
                        class_897 class_8972;
                        block24: {
                            class_897 class_8973;
                            block23: {
                                block22: {
                                    Class clazz6;
                                    Class clazz7;
                                    Class clazz8;
                                    block21: {
                                        class_8972 = (class_897)objectArray[0];
                                        l = (Long)objectArray[1];
                                        l = i ^ l;
                                        clazz5 = class_8972.getClass();
                                        clazz8 = (Class)((Object)aG.a("\u00c6", (Object)g, clazz5, (long)-7139897240660323936L, (long)l));
                                        callSite = aG.a("\u00d2", (long)-7139772890122810107L, (long)l);
                                        try {
                                            clazz7 = clazz8;
                                            if (callSite != null) break block21;
                                            if (clazz7 == null) break block22;
                                        }
                                        catch (IllegalAccessException illegalAccessException) {
                                            throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                        }
                                        clazz7 = clazz8;
                                    }
                                    try {
                                        clazz6 = clazz7 == h ? null : clazz8;
                                    }
                                    catch (IllegalAccessException illegalAccessException) {
                                        throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                    }
                                    return clazz6;
                                }
                                clazz4 = null;
                                class_8973 = class_8972;
                                if (callSite != null) break block23;
                                try {
                                    block31: {
                                        if (!(class_8973 instanceof class_922)) break block24;
                                        break block31;
                                        catch (IllegalAccessException illegalAccessException) {
                                            throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                        }
                                    }
                                    class_8973 = class_8972;
                                }
                                catch (IllegalAccessException illegalAccessException) {
                                    throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                }
                            }
                            class_922 class_9222 = (class_922)class_8973;
                            clazz4 = aG.a("\u00c6", (Object)class_9222, (long)-7138342961441868500L, (long)l).getClass();
                            break block32;
                        }
                        CallSite callSite2 = aG.a("\u00c6", clazz5, (long)-7138829864084207953L, (long)l);
                        int n = ((CallSite)callSite2).length;
                        int n2 = 0;
                        while (n2 < n) {
                            block25: {
                                block27: {
                                    class_583 class_5832;
                                    block28: {
                                        CallSite callSite3 = callSite2[n2];
                                        if (callSite != null) break block25;
                                        try {
                                            block33: {
                                                clazz = class_583.class;
                                                if (callSite != null) break block26;
                                                break block33;
                                                catch (IllegalAccessException illegalAccessException) {
                                                    throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                                }
                                            }
                                            if (aG.a("\u00c6", clazz, (Object)aG.a("\u00c6", (Object)callSite3, (long)-7140217695450249486L, (long)l), (long)-7138617055539807148L, (long)l) == false) break block27;
                                        }
                                        catch (IllegalAccessException illegalAccessException) {
                                            throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                        }
                                        aG.a("\u00c6", (Object)callSite3, (boolean)true, (long)-7139418438137150569L, (long)l);
                                        class_583 class_5833 = (class_583)aG.a("\u00c6", (Object)callSite3, (Object)class_8972, (long)-7140053436974630198L, (long)l);
                                        try {
                                            class_5832 = class_5833;
                                            if (callSite != null) break block28;
                                            if (class_5832 == null) break block27;
                                        }
                                        catch (IllegalAccessException illegalAccessException) {
                                            throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                        }
                                        class_5832 = class_5833;
                                    }
                                    clazz4 = class_5832.getClass();
                                    try {
                                        if (callSite == null) break;
                                    }
                                    catch (IllegalAccessException illegalAccessException) {
                                        throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                                    }
                                    catch (IllegalAccessException illegalAccessException) {
                                        // empty catch block
                                    }
                                }
                                ++n2;
                            }
                            if (callSite == null) continue;
                        }
                    }
                    try {
                        map = g;
                        clazz3 = clazz5;
                        clazz2 = clazz4;
                        if (callSite != null) break block29;
                        if (clazz2 != null) break block30;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw aG.a("\u00d2", (Object)illegalAccessException, (long)-7139168065518424419L, (long)l);
                    }
                    clazz2 = h;
                    break block29;
                }
                clazz2 = clazz4;
            }
            aG.a("\u00c6", (Object)map, clazz3, (Object)clazz2, (long)-7139997556630038969L, (long)l);
            clazz = clazz4;
        }
        return clazz;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean a(Object[] var0) {
        block40: {
            block39: {
                block38: {
                    block49: {
                        block37: {
                            block36: {
                                var3_1 = (class_583)var0[0];
                                var4_2 = (cZ)var0[1];
                                var1_3 = (Long)var0[2];
                                v0 = var1_3 = aG.i ^ var1_3;
                                var5_4 = v0 ^ 36945991568267L;
                                var7_5 = v0 ^ 26166079508179L;
                                var10_6 = var3_1.getClass();
                                var9_7 = aG.a("\u00d2", (long)3189457132651330988L, (long)var1_3);
                                var11_8 = (Boolean)aG.a("\u00c6", (Object)aG.c, var10_6, (long)3188734863618793737L, (long)var1_3);
                                try {
                                    v1 = var11_8;
                                    if (var9_7 != null) break block36;
                                    if (v1 == null) break block37;
                                }
                                catch (MatchException v2) {
                                    throw aG.a("\u00d2", (Object)v2, (long)3190167323574443572L, (long)var1_3);
                                }
                                v1 = var11_8;
                            }
                            return (boolean)aG.a("\u00c6", (Object)v1, (long)3189811155549214891L, (long)var1_3);
                        }
                        v3 = new Object[1];
                        v3[0] = var7_5;
                        v4 /* !! */  = aG.a("\u00c6", (Object)var4_2, (Object)v3, (long)3189273910740038391L, (long)var1_3);
                        if (var9_7 != null) break block38;
                        if (v4 /* !! */  != false) ** GOTO lbl40
                        break block49;
                        catch (MatchException v5) {
                            throw aG.a("\u00d2", (Object)v5, (long)3190167323574443572L, (long)var1_3);
                        }
                    }
                    try {
                        block50: {
                            if (aG.a("u", (Object)aG.b, (long)3188663704225484363L, (long)var1_3) != null) break block39;
                            break block50;
                            catch (MatchException v6) {
                                throw aG.a("\u00d2", (Object)v6, (long)3190167323574443572L, (long)var1_3);
                            }
                        }
                        v4 /* !! */  = (CallSite)0;
                    }
                    catch (MatchException v7) {
                        throw aG.a("\u00d2", (Object)v7, (long)3190167323574443572L, (long)var1_3);
                    }
                }
                return (boolean)v4 /* !! */ ;
            }
            var12_9 = aG.a("\u00c6", (Object)var4_2, (long)3189464450963678524L, (long)var1_3);
            while (aG.a("\u00c6", (Object)var12_9, (long)3188952429906487339L, (long)var1_3) != false) {
                block45: {
                    block47: {
                        block48: {
                            block43: {
                                block41: {
                                    block42: {
                                        var13_10 = (class_1299)aG.a("\u00c6", (Object)var12_9, (long)3190407964679562606L, (long)var1_3);
                                        v8 /* !! */  = var13_10;
                                        if (var9_7 != null) break block40;
                                        try {
                                            block51: {
                                                if (var9_7 != null) break block41;
                                                break block51;
                                                catch (MatchException v9) {
                                                    throw aG.a("\u00d2", (Object)v9, (long)3190167323574443572L, (long)var1_3);
                                                }
                                            }
                                            if (v8 /* !! */  != aG.a("\u00e5", (long)3189715967658895705L, (long)var1_3)) break block42;
                                        }
                                        catch (MatchException v10) {
                                            throw aG.a("\u00d2", (Object)v10, (long)3190167323574443572L, (long)var1_3);
                                        }
                                        var14_11 = aG.a("u", (Object)aG.b, (long)3189603770427223006L, (long)var1_3);
                                        var15_12 = 0;
                                        try {
                                            if (var14_11 == null) {
                                                continue;
                                            }
                                            break block43;
                                        }
                                        catch (MatchException v11) {
                                            throw aG.a("\u00d2", (Object)v11, (long)3190167323574443572L, (long)var1_3);
                                        }
                                    }
                                    v12 = var13_10;
                                }
                                var14_11 = aG.a("\u00c6", (Object)v12, (Object)aG.a("u", (Object)aG.b, (long)3188663704225484363L, (long)var1_3), null, (long)3189956008708257580L, (long)var1_3);
                                try {
                                    if (var14_11 == null) {
                                        continue;
                                    }
                                }
                                catch (MatchException v13) {
                                    throw aG.a("\u00d2", (Object)v13, (long)3190167323574443572L, (long)var1_3);
                                }
                                var15_12 = 1;
                            }
                            try {
                                block46: {
                                    block44: {
                                        var16_13 = aG.a("\u00c6", (Object)aG.a("\u00c6", (Object)aG.b, (long)3188882487526106217L, (long)var1_3), (Object)var14_11, (long)3190712707689924448L, (long)var1_3);
                                        v14 = new Object[2];
                                        v14[1] = var5_4;
                                        v14[0] = var16_13;
                                        var17_14 = aG.a("\u00d2", (Object)v14, (long)3190546045236159763L, (long)var1_3);
                                        try {
                                            v15 = var17_14;
                                            if (var9_7 != null) break block44;
                                            if (v15 == null) break block45;
                                        }
                                        catch (MatchException v16) {
                                            throw aG.a("\u00d2", (Object)v16, (long)3190167323574443572L, (long)var1_3);
                                        }
                                        v15 = var17_14;
                                    }
                                    if (var9_7 != null) break block46;
                                    try {
                                        block52: {
                                            if (v15 != var10_6) break block45;
                                            break block52;
                                            catch (MatchException v17) {
                                                throw aG.a("\u00d2", (Object)v17, (long)3190167323574443572L, (long)var1_3);
                                            }
                                        }
                                        v15 = aG.a("\u00c6", (Object)aG.c, var10_6, (Object)aG.a("\u00d2", (boolean)true, (long)3190272986160084589L, (long)var1_3), (long)3188819232308094702L, (long)var1_3);
                                    }
                                    catch (MatchException v18) {
                                        throw aG.a("\u00d2", (Object)v18, (long)3190167323574443572L, (long)var1_3);
                                    }
                                }
                                var18_15 = 1;
                            }
                            catch (Throwable var19_16) {
                                try {
                                    if (var15_12 != 0) {
                                        aG.a("\u00c6", (Object)var14_11, (long)3189917806868415172L, (long)var1_3);
                                    }
                                }
                                catch (MatchException v19) {
                                    throw aG.a("\u00d2", (Object)v19, (long)3190167323574443572L, (long)var1_3);
                                }
                                throw var19_16;
                            }
                            v20 = var15_12;
                            if (var9_7 != null) break block47;
                            try {
                                block53: {
                                    if (v20 == 0) break block48;
                                    break block53;
                                    catch (MatchException v21) {
                                        throw aG.a("\u00d2", (Object)v21, (long)3190167323574443572L, (long)var1_3);
                                    }
                                }
                                aG.a("\u00c6", (Object)var14_11, (long)3189917806868415172L, (long)var1_3);
                            }
                            catch (MatchException v22) {
                                throw aG.a("\u00d2", (Object)v22, (long)3190167323574443572L, (long)var1_3);
                            }
                        }
                        v20 = var18_15;
                    }
                    return (boolean)v20;
                }
                try {
                    if (var15_12 == 0) ** GOTO lbl146
                    aG.a("\u00c6", (Object)var14_11, (long)3189917806868415172L, (long)var1_3);
                }
                catch (MatchException v23) {
                    throw aG.a("\u00d2", (Object)v23, (long)3190167323574443572L, (long)var1_3);
                }
lbl146:
                // 2 sources

                if (var9_7 == null) continue;
            }
            v8 /* !! */  = aG.a("\u00c6", (Object)aG.c, var10_6, (Object)aG.a("\u00d2", (boolean)false, (long)3190272986160084589L, (long)var1_3), (long)3188819232308094702L, (long)var1_3);
        }
        return false;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "\rD\u0015wq\u0015\u001bD\u0010-b\u0002\f\u000f\u0013+n\u0016\u001dH\u0004<%\u0004.";
        objectArray[1] = "\u00120CJqEg\u0010HE`\n\u0006\u001eCNdPr";
        objectArray[2] = Boolean.TYPE;
        aG.k[2] = "java/lang/Boolean";
        objectArray[3] = "a\"w\u0006v\"w\"r\\e5`iqZi!q.fM\"6`";
        objectArray[4] = "u)o2V\f\u0000\td=GCa\u0007o6C\u0019\u0015";
        objectArray[5] = Void.TYPE;
        aG.k[5] = "java/lang/Void";
        objectArray[6] = "L#$Zm*G,5\u0015\u0006>E'\"O*)H";
        objectArray[7] = "l\u0018-}>Xg\u0017<2bQ`\u0015>\u007fd\u001a@\u0010>pt";
        objectArray[8] = "AAM>JQWAHdYF@\nKbURQM\\u\u001e@m";
        objectArray[9] = "W\u0019\u0011^i$\"9\u001aQxk_!\tVq\"7";
        objectArray[10] = "\u0013yY3%\u000b\u0018vH|D\u0005\u0013}L&";
        objectArray[11] = "!\u0011Qib *\u001e@&\u000f *\u0003T";
        objectArray[12] = "?\u000e5|yA!\u0006/3\u001aU%";
        objectArray[13] = "W\u0000v\u0007hw\" }\by8~)z\n{uxbZ\u000f{zhw";
        objectArray[14] = "NKe\u000b{\u000eNKrWw\u0001T\u0000rIw\u0014Sq(\u0017$";
        objectArray[15] = "z\u0000o\u0007\u0007\u007fz\u0000x[\u000bp`KxE\u000beg:.\u0011Y";
        objectArray[16] = "y\u0003c\ta3o\u0003fSr$xHeU~0i\u000frB5 G";
        objectArray[17] = "*x<m_\u0002_X7bNM>V<iJ\u0017J";
        objectArray[18] = "=A0[bo#I*\u0014\u0005n2R'N#h";
        objectArray[19] = "\u0006t\u001a\u0001\u0015:\u0006t\r]\u00195\u001c?\rC\u0019 \u001bN]\u001eH";
        objectArray[20] = "%.0x\b8%.'$\u00047?e':\u0004\"8\u0014sbS";
        objectArray[21] = "Tfb\f\nUTfuP\u0006ZN-uN\u0006OI\\ \u0011_";
        objectArray[22] = "4l8\u0018n\u0000AL3\u0017\u007fO B8\u001c{\u0015T";
        objectArray[23] = "\u0006t[+HZ\u0006tLwDU\u001c?LiD@\u001bN\u0017<\u001d";
        objectArray[24] = "~\u001d\u001c\n\u0012\u0019~\u001d\u000bV\u001e\u0016dV\u000bH\u001e\u0003c'Y\u0016FG";
        objectArray[25] = "{*?\u001ei\u0011{*(Be\u001eaa(\\e\u000bf\u0010s\t3";
        objectArray[26] = "N\u001b\u0017\u0016\u0019\u0007E\u0014\u0006Yu\u0004K\u0016\u0004\u0016Y";
        objectArray[27] = "J-kpNZJ-|,BUPf|2B@W\u0017.l\u001a\n";
        objectArray[28] = "Uw\u001dcOQUw\n?C^O<\n!CKHMXt\u0011\u000f";
        objectArray[29] = "6Rh\u0004Wc6R\u007fX[l,\u0019\u007fF[y+h/\u001d\t:";
        objectArray[30] = "SK)vB`&k\"yS/Ge)rWu3";
        objectArray[31] = ";5\rT-\u0005-5\b\u000e>\u0012:~\u000b\b2\u0006+9\u001c\u001fy\u001a";
        objectArray[32] = "Fy\u000b\"P\u001e3Y\u0000-AQRW\u000b&E\u000b&";
        objectArray[33] = "\u007f[v[>BsLk\u00165@?Xc\u0017*Jr\u0010c\u00051\rtHg\u001b,\rTHg\u001b,";
        objectArray[34] = "{jsmxc9f/q\u0013\"+y]|x4=~u}w4F<pj\u007f?/\u007fyg+Y}~$evf#~\u007ft\u0013";
        objectArray[35] = "\u0011\u001d*U|~\u000b\u0016.B\u001fq{H$Jm\"\u0014\u001dx@/\u001fBIi@yv\u0001@d\u0014\u001f";
        objectArray[36] = "unl\u00040Voeh\u0013SVc3(\u0014/Pe^9\u0018.Vb -G>\\\u001f";
        objectArray[37] = "<A>\u0005j&<\u0007m\u0016\u0000)\u0002G-\u0004yyk\u0010n\u0001jC";
        objectArray[38] = "0pm\u0013\u0012e6c-Bvm\nv`E\u00049e#<OF\u00041h`Q\u0013;oh;@v";
        objectArray[39] = "?F\u0017\u000f?,(\u0006B\u0005Y02WL\f\u000egl\u0000\u0014`4<1\n\u0014\u0012:,jC";
        objectArray[40] = "\"p\\\u0018\u007f450\t\u0012\u0019(/a\u0007\u001bN\u007fp<\\wt737\u0019\u0010d}rn";
        objectArray[41] = "F\u000fL0R<\u0004\u0003\u0010,9i\u0016\u001c+u\u0005>\u001c\u0005\u0012/_>\u0002`\u0014v\u0001a\u001eYN,\u0001\u007f{";
        objectArray[42] = "4.P(\fjj$Wyqxy(k*M8c1Rp\u00178}TT)Igam\u000esIy\u0004kW-\u0016e=1\r-\b\u0000";
        objectArray[43] = "\rYqMzZSSv\u001c\u0007_P_JO;\bZFs\u0015a\bD#uL?WX\u001a/\u0016?I=";
        objectArray[44] = "\u001eDa1t,\n\u001bq;\t2\u001cZZ=y.u\u0018x-e4\u001c[q 1R";
        objectArray[45] = ":5\u0001v;\u0012-uT|]\u0005;5^~17ot\u0000 ]\u000f<6Da/\u001ek0N\u0019";
        objectArray[46] = "\u0000.\u0002f\u0018Y\u0006=B7|R:(\u000f0\u000e\u0005U}S:L8\u00016\u000f$\u0019\u0007_6T5|";
        objectArray[47] = "q]\u0001\u0010F03Q]\f-e!N:\u001bUgL\r\u0017\u0001J:+LX\u0013C\n";
        objectArray[48] = "51,@u\u0003m!:>|l6n-L(\u0003c2'\u000e\u0015U7#'X|\u0016>.s>";
        objectArray[49] = "Jq:\u000e\u001eXBj<\u000f}\u001eB~z^:\u000e+#cN\u0011\u0006B`jCE`Jq:\u000e\u001eXBj<\u000f}";
        objectArray[50] = "-(t-\nYy4%`:Cq$y7Vq `\"`:L&7dl@\u001b|g#P";
        objectArray[51] = "a6=L\u007fjui-F\u0002rg#<-=(24%\u0014gr2*@";
        objectArray[52] = "M\u0019k4Y%N\u001f{2a))\u00020.\u0013}FWl$Q@\u0013\u0004=x\u0005!\u0015\u0017})a";
        objectArray[53] = ")q\u001d`\b@qa\u000b\u001e\u0001/*.\u001clU@\u007fr\u0016.h\u0010>u\u001d.\u000fQqg\u0014\u001e";
        objectArray[54] = "\u0013J\u0011\u00073nR\u0005\u0003\u000e\u0003hWr\u0001\u001bbfJR\u0010\u0004nGV\\\u001f`<xG\\J\u0007}7UUzYgt@]\u0013\u001any\u0014;";
        objectArray[55] = "\u0005gAl!_\u00140GfYH\u0007q^q5zQ<\u0003-YB\fc\u0004(9\u001cS0D\u00169N\u0007wYk$\u0011\u00112>";
        objectArray[56] = "(U{*.\r N}+M_.Y\"z$S\u0017W\"j 5pZ;{+\\3S6/M";
        objectArray[57] = "[l,\u001b\u001f\u0002Gmm]m\bX>vK:X\u0001b-'\u000fY\u0007o`C\u0013XF)";
        objectArray[58] = "hGj+\u001106\u00189k/5j]dvC\u0007<\u00188.\u0015P<Z4cJobZor/";
        objectArray[59] = "\u007fN\u0019k,C>\u0001\u000bb\u001cK-C>aw@)E\u001f`RE-[\u001ew\u001c\u0015*YK~gNq\u000e\b\f";
        objectArray[60] = "}v\u0007nv*\"3\rv\u000f9v$\bts.aKV37$~r\fi7:\u001bp\u0012?}&$.\u0012dlC";
        objectArray[61] = "<\u0017\u0003,Z< \u0016Bj(=3T]wD\u000fc\u0018\r+(;f\u0013\u0005n\u0018<\"KS\u0010Kg.FZvVc#\u0010=\u007fN6d\u0016]!\u0011e$(";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "\rA;I\t\u001cUQ-7\u0000sWN5J\u0016M\u0012\u0016&YiO\u000bG!HW\nST27";
    }

    private static Field g(long l, long l2) {
        int n = aG.e(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = aG.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aG.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aG.c(clazz3, string2, clazz2)) != null) {
                    aG.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aG.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aG.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aG.f(722257712076554L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void lambda$static$0(aq_0 aq_02, gK gK2) {
        long l;
        long l2;
        block4: {
            l2 = i ^ 0x251F4161588L;
            l = l2 ^ 0x25E9BAE0BB32L;
            try {
                try {
                    if (a != null && e) break block4;
                }
                catch (MatchException matchException) {
                    throw aG.a("\u00d2", (Object)matchException, (long)-5862067382527058732L, (long)l2);
                }
                return;
            }
            catch (MatchException matchException) {
                throw aG.a("\u00d2", (Object)matchException, (long)-5862067382527058732L, (long)l2);
            }
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = l;
        objectArray[1] = gK2;
        objectArray[0] = aq_02;
        aG.a("\u00c6", (Object)a, (Object)objectArray, (long)-5863179824247324938L, (long)l2);
    }

    private static void lambda$static$1(aq_0 aq_02, gK gK2) {
        long l;
        long l2;
        block4: {
            l2 = i ^ 0x781C8F1A2964L;
            l = l2 ^ 0x588179F292E1L;
            try {
                try {
                    if (a != null && e) break block4;
                }
                catch (MatchException matchException) {
                    throw aG.a("\u00d2", (Object)matchException, (long)-7905582563297714120L, (long)l2);
                }
                return;
            }
            catch (MatchException matchException) {
                throw aG.a("\u00d2", (Object)matchException, (long)-7905582563297714120L, (long)l2);
            }
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = l;
        objectArray[1] = gK2;
        objectArray[0] = aq_02;
        aG.a("\u00c6", (Object)a, (Object)objectArray, (long)-7903900025254885506L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aG.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


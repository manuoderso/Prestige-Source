/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_640
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
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_640;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f1
implements cz_0 {
    private static final long a = hc.a(8852311853194882056L, 672785566959243053L, MethodHandles.lookup().lookupClass()).a(129234894594822L);
    private static final Object[] c = new Object[93];
    private static final String[] d = new String[93];

    static {
        f1.a();
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
            case 0 -> 4;
            case 1 -> 7;
            case 2 -> 20;
            case 3 -> 61;
            case 4 -> 33;
            case 5 -> 30;
            case 6 -> 15;
            case 7 -> 16;
            case 8 -> 8;
            case 9 -> 19;
            case 10 -> 52;
            case 11 -> 36;
            case 12 -> 39;
            case 13 -> 51;
            case 14 -> 62;
            case 15 -> 59;
            case 16 -> 63;
            case 17 -> 35;
            case 18 -> 50;
            case 19 -> 57;
            case 20 -> 25;
            case 21 -> 31;
            case 22 -> 26;
            case 23 -> 3;
            case 24 -> 41;
            case 25 -> 5;
            case 26 -> 9;
            case 27 -> 17;
            case 28 -> 44;
            case 29 -> 6;
            case 30 -> 11;
            case 31 -> 60;
            case 32 -> 29;
            case 33 -> 13;
            case 34 -> 53;
            case 35 -> 21;
            case 36 -> 10;
            case 37 -> 47;
            case 38 -> 49;
            case 39 -> 54;
            case 40 -> 48;
            case 41 -> 14;
            case 42 -> 27;
            case 43 -> 2;
            case 44 -> 12;
            case 45 -> 0;
            case 46 -> 43;
            case 47 -> 42;
            case 48 -> 22;
            case 49 -> 28;
            case 50 -> 38;
            case 51 -> 55;
            case 52 -> 18;
            case 53 -> 46;
            case 54 -> 23;
            case 55 -> 56;
            case 56 -> 45;
            case 57 -> 32;
            case 58 -> 40;
            case 59 -> 24;
            case 60 -> 34;
            case 61 -> 37;
            case 62 -> 1;
            default -> 58;
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
        f1.d[n3] = new String(cArray);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(Object[] objectArray) {
        Object object;
        block20: {
            CallSite callSite;
            long l;
            block21: {
                class_1657 class_16572;
                long l2;
                class_1657 class_16573;
                block17: {
                    block18: {
                        CallSite callSite2;
                        block19: {
                            class_16573 = (class_1657)objectArray[0];
                            l = (Long)objectArray[1];
                            l2 = (l = a ^ l) ^ 0x530F86C3C57DL;
                            callSite = f1.a("\u00d8", (long)7556667729827144913L, (long)l);
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                class_16572 = class_16573;
                                                if (callSite != null) break block17;
                                                if (f1.a("k", (Object)f1.a("k", (Object)class_16572, (long)7548972779940629528L, (long)l), (long)7555940557781492350L, (long)l) == f1.a("\u00de", (long)7548429189739590209L, (long)l)) break block18;
                                            }
                                            catch (MatchException matchException) {
                                                throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                                            }
                                            callSite2 = f1.a("k", (Object)f1.a("k", (Object)class_16573, (long)7548051888188275730L, (long)l), (long)7555940557781492350L, (long)l);
                                            if (callSite != null) break block19;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                                        }
                                        if (callSite2 != f1.a("\u00de", (long)7548429189739590209L, (long)l)) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                                    }
                                    class_16572 = class_16573;
                                    if (callSite != null) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                                }
                                callSite2 = f1.a("k", (Object)f1.a("k", (Object)class_16572, (long)7548972779940629528L, (long)l), (Object)f1.a("\u00de", (long)7556772811881861839L, (long)l), (long)7549161807575123842L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                            }
                        }
                        if (callSite2 != null) break block20;
                    }
                    class_16572 = class_16573;
                }
                try {
                    try {
                        object = f1.a("k", (Object)class_16572, (long)7549401944321014546L, (long)l);
                        if (callSite != null) break block21;
                        if (object == false) break block20;
                    }
                    catch (MatchException matchException) {
                        throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = class_16573;
                    object = f1.a("\u00d8", (Object)objectArray2, (long)7555229200639832748L, (long)l);
                }
                catch (MatchException matchException) {
                    throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
                }
            }
            try {
                if (callSite != null) return (boolean)object;
                if (object != false) break block20;
            }
            catch (MatchException matchException) {
                throw f1.a("\u00d8", (Object)matchException, (long)7548332049584696732L, (long)l);
            }
            object = 1;
            return (boolean)object;
        }
        object = 0;
        return (boolean)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == '\u00c7' || c == '\u00de' || c == 'O') {
                field = f1.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f1.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'k' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = f1.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static class_1657 b(Object[] objectArray) {
        class_1657 class_16572;
        block21: {
            float f = ((Float)objectArray[0]).floatValue();
            long l = (Long)objectArray[1];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x53EE7A7E86C9L;
            long l4 = l2 ^ 0x3481130E42E9L;
            long l5 = l2 ^ 0x74066219937CL;
            long l6 = l2 ^ 0x408FF14C19ECL;
            class_1657 class_16573 = null;
            CallSite callSite = f1.a("\u00d8", (long)-1778077452834002083L, (long)l);
            CallSite callSite2 = f1.a("k", (Object)f1.a("k", (Object)f1.a("l", (Object)b, (long)-1778633482329371497L, (long)l), (long)-1778526251930509788L, (long)l), (long)-1777401907830501633L, (long)l);
            while (f1.a("k", (Object)callSite2, (long)-1779402528112151915L, (long)l) != false) {
                block28: {
                    reference v12;
                    class_1657 class_16574;
                    class_1657 class_16575;
                    block27: {
                        block25: {
                            block26: {
                                CallSite callSite3;
                                block24: {
                                    block23: {
                                        block22: {
                                            class_16575 = (class_1657)f1.a("k", (Object)callSite2, (long)-1776771581552646421L, (long)l);
                                            try {
                                                try {
                                                    class_16572 = class_16575;
                                                    if (callSite != null) break block21;
                                                    callSite3 = f1.a("k", (Object)class_16572, (long)-1778947175069078654L, (long)l);
                                                    if (callSite != null) break block22;
                                                }
                                                catch (MatchException matchException) {
                                                    throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                                }
                                                if (callSite3 == false) continue;
                                            }
                                            catch (MatchException matchException) {
                                                throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                            }
                                            callSite3 = f1.a("k", (Object)class_16575, (Object)f1.a("l", (Object)b, (long)-1781153311817792295L, (long)l), (long)-1779530091204410579L, (long)l);
                                        }
                                        try {
                                            if (callSite != null) break block23;
                                            if (callSite3 != false) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                        }
                                        Object[] objectArray2 = new Object[2];
                                        objectArray2[1] = l3;
                                        objectArray2[0] = f1.a("k", (Object)f1.a("k", (Object)class_16575, (long)-1779606391544301412L, (long)l), (long)-1778437832437814999L, (long)l);
                                        callSite3 = f1.a("k", (Object)f1.a("\u00de", (long)-1779112685516168092L, (long)l), (Object)objectArray2, (long)-1780000311833684384L, (long)l);
                                    }
                                    try {
                                        if (callSite != null) break block24;
                                        if (callSite3 != false) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                    }
                                    Object[] objectArray3 = new Object[2];
                                    objectArray3[1] = l5;
                                    objectArray3[0] = class_16575;
                                    callSite3 = f1.a("k", (Object)f1.a("\u00de", (long)-1779248034977542216L, (long)l), (Object)objectArray3, (long)-1777001810891367612L, (long)l);
                                }
                                try {
                                    if (callSite3 == false && callSite == null) continue;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                }
                                try {
                                    try {
                                        try {
                                            class_16574 = class_16573;
                                            if (callSite != null) break block25;
                                            if (class_16574 == null) break block26;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                        }
                                        reference v12 = f1.a("k", (Object)f1.a("l", (Object)b, (long)-1781153311817792295L, (long)l), (Object)class_16575, (long)-1777222418649185101L, (long)l) - f1.a("k", (Object)f1.a("l", (Object)b, (long)-1781153311817792295L, (long)l), (Object)class_16573, (long)-1777222418649185101L, (long)l);
                                        v12 = v12 == 0 ? 0 : (v12 < 0 ? -1 : 1);
                                        if (callSite != null) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                    }
                                    if (v12 >= 0) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                                }
                            }
                            class_16574 = class_16575;
                        }
                        try {
                            if (callSite != null) break block28;
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l6;
                            objectArray4[0] = f1.a("k", (Object)class_16574, (long)-1779287071644289138L, (long)l);
                            Object[] objectArray5 = new Object[2];
                            objectArray5[1] = l4;
                            objectArray5[0] = f1.a("\u00d8", (Object)objectArray4, (long)-1777496493296526920L, (long)l);
                            reference v12 = f1.a("\u00d8", (Object)objectArray5, (long)-1780723359285271647L, (long)l) - f;
                            v12 = v12 == 0 ? 0 : (v12 > 0 ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                        }
                    }
                    try {
                        if (v12 > 0 && callSite == null) continue;
                    }
                    catch (MatchException matchException) {
                        throw f1.a("\u00d8", (Object)matchException, (long)-1779692916403166704L, (long)l);
                    }
                    class_16574 = class_16573 = class_16575;
                }
                if (callSite == null) continue;
            }
            class_16572 = class_16573;
        }
        return class_16572;
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
        block5: {
            Object object;
            block6: {
                block7: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l;
                    long l2;
                    long l3;
                    class_1657 class_16572;
                    block4: {
                        class_16572 = (class_1657)objectArray[0];
                        l3 = (Long)objectArray[1];
                        long l4 = l3 = a ^ l3;
                        l2 = l4 ^ 0x5F9C3BF515A1L;
                        l = l4 ^ 0x98C89B136B0L;
                        callSite2 = f1.a("\u00d8", (long)-514298166841330477L, (long)l3);
                        try {
                            callSite = f1.a("l", (Object)b, (long)-520670368123577513L, (long)l3);
                            if (callSite2 != null) break block4;
                            if (callSite == null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)-521461221153981026L, (long)l3);
                        }
                        callSite = class_16572;
                    }
                    if (callSite == null) break block5;
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l;
                    CallSite callSite3 = f1.a("\u00d8", (Object)objectArray2, (long)-514436629053233428L, (long)l3);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = class_16572;
                    CallSite callSite4 = f1.a("\u00d8", (Object)objectArray3, (long)-515506750322849411L, (long)l3);
                    CallSite callSite5 = f1.a("k", (Object)f1.a("k", (Object)callSite3, (Object)callSite4, (long)-522352293570176761L, (long)l3), (long)-521608063047139409L, (long)l3);
                    CallSite callSite6 = f1.a("k", (Object)class_16572, (long)-520466467197685066L, (long)l3);
                    CallSite callSite7 = f1.a("k", (Object)class_16572, (long)-514240022632350854L, (long)l3);
                    CallSite callSite8 = f1.a("k", (Object)new class_243((double)(-f1.a("\u00d8", (double)f1.a("\u00d8", (double)((double)callSite6), (long)-515557142639852779L, (long)l3), (long)-514033858613441394L, (long)l3) * f1.a("\u00d8", (double)f1.a("\u00d8", (double)((double)callSite7), (long)-515557142639852779L, (long)l3), (long)-515278541658371556L, (long)l3)), (double)(-f1.a("\u00d8", (double)f1.a("\u00d8", (double)((double)callSite7), (long)-515557142639852779L, (long)l3), (long)-514033858613441394L, (long)l3)), (double)(f1.a("\u00d8", (double)f1.a("\u00d8", (double)((double)callSite6), (long)-515557142639852779L, (long)l3), (long)-515278541658371556L, (long)l3) * f1.a("\u00d8", (double)f1.a("\u00d8", (double)((double)callSite7), (long)-515557142639852779L, (long)l3), (long)-515278541658371556L, (long)l3))), (long)-521608063047139409L, (long)l3);
                    reference var15_12 = f1.a("k", (Object)callSite8, (Object)callSite5, (long)-513916560916693928L, (long)l3);
                    try {
                        reference cfr_temp_0 = var15_12 - 0.0;
                        object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (callSite2 != null) break block6;
                        if (object >= 0) break block7;
                    }
                    catch (MatchException matchException) {
                        throw f1.a("\u00d8", (Object)matchException, (long)-521461221153981026L, (long)l3);
                    }
                    object = 1;
                    break block6;
                }
                object = 0;
            }
            return (boolean)object;
        }
        return false;
    }

    private static Method h(long l, long l2) {
        int n = f1.e(l, l2);
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
                clazz3 = f1.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f1.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f1.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        f1.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f1.f(100428125307931L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f1.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f1.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f1.f(100428125307931L, 0L);
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
            int n = f1.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                f1.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = f1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f1.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f1.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f1.d(classArray2[i], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/zprestige/prestige/f1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static class_1657 a(Object[] objectArray) {
        class_1657 class_16572;
        block19: {
            long l = (Long)objectArray[0];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x3F363F4B8AEDL;
            long l4 = l2 ^ 0x18DE272C9F58L;
            class_1657 class_16573 = null;
            CallSite callSite = f1.a("k", (Object)f1.a("k", (Object)f1.a("l", (Object)b, (long)-1480159679021498189L, (long)l), (long)-1480264720839831040L, (long)l), (long)-1481391010568453413L, (long)l);
            CallSite callSite2 = f1.a("\u00d8", (long)-1479833651334633607L, (long)l);
            while (f1.a("k", (Object)callSite, (long)-1483331293037691215L, (long)l) != false) {
                block25: {
                    Object object;
                    block23: {
                        CallSite callSite3;
                        class_1657 class_16574;
                        block22: {
                            block21: {
                                block20: {
                                    class_16574 = (class_1657)f1.a("k", (Object)callSite, (long)-1480611766898611505L, (long)l);
                                    try {
                                        try {
                                            class_16572 = class_16574;
                                            if (callSite2 != null) break block19;
                                            callSite3 = f1.a("k", (Object)class_16572, (long)-1482946377319733338L, (long)l);
                                            if (callSite2 != null) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                                        }
                                        if (callSite3 == false) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                                    }
                                    callSite3 = f1.a("k", (Object)class_16574, (Object)f1.a("l", (Object)b, (long)-1482670918573356803L, (long)l), (long)-1483449993429676279L, (long)l);
                                }
                                try {
                                    if (callSite2 != null) break block21;
                                    if (callSite3 != false) continue;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l3;
                                objectArray2[0] = f1.a("k", (Object)f1.a("k", (Object)class_16574, (long)-1483375660712217416L, (long)l), (long)-1480042781650410227L, (long)l);
                                callSite3 = f1.a("k", (Object)f1.a("\u00de", (long)-1483022760855738304L, (long)l), (Object)objectArray2, (long)-1483856921170240956L, (long)l);
                            }
                            try {
                                if (callSite2 != null) break block22;
                                if (callSite3 != false) continue;
                            }
                            catch (MatchException matchException) {
                                throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l4;
                            objectArray3[0] = class_16574;
                            callSite3 = f1.a("k", (Object)f1.a("\u00de", (long)-1483166906307378276L, (long)l), (Object)objectArray3, (long)-1480911746508187808L, (long)l);
                        }
                        try {
                            if (callSite3 == false && callSite2 == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                        }
                        try {
                            block24: {
                                try {
                                    try {
                                        try {
                                            object = class_16573;
                                            if (callSite2 != null) break block23;
                                            if (object == null) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                                        }
                                        object = f1.a("l", (Object)b, (long)-1482670918573356803L, (long)l);
                                        if (callSite2 != null) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                                    }
                                    if (!(f1.a("k", (Object)object, (Object)class_16574, (long)-1481009760898971497L, (long)l) < f1.a("k", (Object)f1.a("l", (Object)b, (long)-1482670918573356803L, (long)l), (Object)class_16573, (long)-1481009760898971497L, (long)l))) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                                }
                            }
                            object = class_16574;
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)-1483603610213831116L, (long)l);
                        }
                    }
                    class_16573 = object;
                }
                if (callSite2 == null) continue;
            }
            class_16572 = class_16573;
        }
        return class_16572;
    }

    public static boolean a(Object[] objectArray) {
        Object object;
        block20: {
            CallSite callSite;
            long l;
            long l2;
            class_1297 class_12972;
            block19: {
                int n;
                block17: {
                    block15: {
                        block16: {
                            class_12972 = (class_1297)objectArray[0];
                            l2 = (Long)objectArray[1];
                            l = (l2 = a ^ l2) ^ 0x34BD1A04E2BCL;
                            callSite = f1.a("\u00d8", (long)1129714062159594402L, (long)l2);
                            try {
                                try {
                                    n = class_12972 instanceof class_1657;
                                    if (callSite != null) break block15;
                                    if (n == 0) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                                }
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                            }
                        }
                        n = class_12972 instanceof class_1309;
                    }
                    try {
                        block18: {
                            try {
                                try {
                                    if (callSite != null) break block17;
                                    if (n == 0) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                                }
                                if (f1.a("k", (Object)b, (long)1130278402151411133L, (long)l2) != null) break block19;
                            }
                            catch (MatchException matchException) {
                                throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                            }
                        }
                        n = 0;
                    }
                    catch (MatchException matchException) {
                        throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                    }
                }
                return n != 0;
            }
            CallSite callSite2 = f1.a("k", (Object)f1.a("k", (Object)class_12972, (long)1129810042715362529L, (long)l2), (long)1130064001285636566L, (long)l2);
            CallSite callSite3 = f1.a("k", (Object)f1.a("k", (Object)f1.a("k", (Object)b, (long)1130278402151411133L, (long)l2), (long)1128361631857829570L, (long)l2), (long)1128257066016028054L, (long)l2);
            while (f1.a("k", (Object)callSite3, (long)1130748589963385450L, (long)l2) != false) {
                block22: {
                    int n;
                    block21: {
                        class_640 class_6402 = (class_640)f1.a("k", (Object)callSite3, (long)1128381122450837012L, (long)l2);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l;
                                objectArray2[0] = f1.a("k", (Object)class_6402, (long)1130004624495451002L, (long)l2);
                                object = f1.a("k", (Object)f1.a("\u00d8", (Object)objectArray2, (long)1129007890622184404L, (long)l2), (Object)callSite2, (long)1129530653707323553L, (long)l2);
                                if (callSite != null) break block20;
                                if (callSite != null) break block21;
                            }
                            catch (MatchException matchException) {
                                throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                            }
                            if (!object) break block22;
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)1131021117549005551L, (long)l2);
                        }
                        n = 1;
                    }
                    return n != 0;
                }
                if (callSite == null) continue;
            }
            object = false;
        }
        return object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "`d{\"\u0004T~lamcUowl7ES";
        objectArray[1] = ":0-7@m1?<x!c:48\"";
        objectArray[2] = "\u000f\u0014|t)b\u000f\u0014k(%m\u0015_k6%x\u0012.9lq<";
        objectArray[3] = Boolean.TYPE;
        f1.d[3] = "java/lang/Boolean";
        objectArray[4] = "2$lfyJ$$i<j]3oj:fI\"(}--[\u001e";
        objectArray[5] = "r\u0014\u001av\u0017t\u00074\u0011y\u0006;z,\u0002~\u000fr\u0012";
        objectArray[6] = "[AsRY1[Ad\u000eU>A\nd\u0010U+F{5I\u0002i";
        objectArray[7] = "Ms}H@mMsj\u0014LbW8j\nLwPI:W\u001d";
        objectArray[8] = ">R.ZR\u0018>R9\u0006^\u0017$\u00199\u0018^\u0002#hm@\t";
        objectArray[9] = "i!e\f+>i!rP'1sjrN'$t\u001b'\u0011~";
        objectArray[10] = "X\u00147js-F\u001c-%\u00111A\u0001";
        objectArray[11] = "G\u0007q(B@Q\u0007trQWFLwt]CW\u000b`c\u0016SO\u000bbhL\u001es\u0010buLYD\u0007";
        objectArray[12] = "VZWCFu@ZR\u0019UbW\u0011Q\u001fYvFVF\b\u0012cd";
        objectArray[13] = "p\u0013qM\\\u0004{\u001c`\u0002!\u001ch\u001biK";
        objectArray[14] = "pU#yW\u0007\u0005u(vFHd{#}B\u0012\u0010";
        objectArray[15] = "P~\u0004\u0002\u00070P~\u0013^\u000b?J5\u0013@\u000b*MDA\u001eSn";
        objectArray[16] = Double.TYPE;
        f1.d[16] = "java/lang/Double";
        objectArray[17] = "5GAGyZ#GD\u001djM4\fG\u001bfY%KP\f-K8";
        objectArray[18] = "u\\Z@&j\u0000|QO7%arZD3\u007f\u0015";
        objectArray[19] = "S81_A8E84\u0005R/Rs7\u0003^;C4 \u0014\u0015.\u0006";
        objectArray[20] = "s)\n\u0017szx&\u001bX\u0010wm+\u00143%u|8\b\u001f2x";
        objectArray[21] = "\u0018j\u001f\u000e\t>\u0013e\u000eAn&\u0017y\b\rK7";
        objectArray[22] = "\u0010(X\u001bhh\u0010(OGdg\ncOYdr\r\u0012\u001a\u00015";
        objectArray[23] = "Z\u001e\u0018\u0007:FS\u0010\u001bNyHL\u0005\u001dE>K\u00176\u0014D2yK\u001e\u0013@;L";
        objectArray[24] = "kag`\u0011Fkap<\u001dIq*p\"\u001d\\v[%}H";
        objectArray[25] = "6x_\"2B(pEm_X0uL h^3w";
        objectArray[26] = "y@5|Sio@0&@~x\u000b3 LjiL$7\u0007z%";
        objectArray[27] = "\u0019\"Pn#<l\u0002[a2s\r\fPj6)y";
        objectArray[28] = Float.TYPE;
        f1.d[28] = "java/lang/Float";
        objectArray[29] = "&YE\u0006v\u0002-VTI\u0015\u000f8P";
        objectArray[30] = "\u001e`\u0012\u0012'{\u001e`\u0005N+t\u0004+\u0005P+a\u0003ZT\by";
        objectArray[31] = "\u0010;\u0013 ;\u007fe\u001b\u0018/*0\u0004\u0015\u0013$.jp";
        objectArray[32] = "Op\u0007sni:P\f|\u007f&[^\u0007w{|/";
        objectArray[33] = "\u0006\"0\u0018Mz\u0010\"5B^m\u0007i6DRy\u0016.!S\u0019n%";
        objectArray[34] = "\u0000AXK\"\u0012uaSD3]\u0014oXO7\u0007`";
        objectArray[35] = ">\u0019|&:nK9w)+!*7|\"/{^";
        objectArray[36] = "?]\"1!h)]'k2\u007f>\u0016$m>k/Q3zu|\u0018";
        objectArray[37] = "8I\u0019&{c8I\u000ezwl\"\u0002\u000edwy%s\\?/3";
        objectArray[38] = "I\u0019\u007f\"9\tI\u0019h~5\u0006SRh`5\u0013T#2?gQ";
        objectArray[39] = "\nZ\u0014\u000e6\u001b\nZ\u0003R:\u0014\u0010\u0011\u0003L:\u0001\u0017`Q\u0017b@";
        objectArray[40] = "p`DA\tYp`S\u001d\u0005Vj+S\u0003\u0005CmZ\t\\W\u0004";
        objectArray[41] = "6E#UL\u0002Ce(Z]M\"k#QY\u0017V";
        objectArray[42] = "\u0006\u000b;,T\u0004\u0006\u000b,pX\u000b\u001c@,nX\u001e\u001b1~:\t_";
        objectArray[43] = "\tN\u001f\\)_\u001f\u001f_\fYKoT\u0001[$[\u0000K\u0010\u001c%\"\f\u0016X\u0000fI\u001dLYYY";
        objectArray[44] = "\u007f\u001b<\u000b&\u0019cX6\u001fHBkV,\u0000$p;\u001arVt'\u007fK+\u0018x\u0017aO!\u0006HUbIu\u00044XwHL";
        objectArray[45] = "wQd\u001d]\u0014uQkE \u001d+\u0007mLwJuP5 \u001eN)S4[\u0019L8\b";
        objectArray[46] = "J:y\u0019\u0014\f\u001eb\"\\w\u000b\u001e%!D\u001b9Hg}\u001eKn\u0010`yFH\u0005\u0001:x\u001fw";
        objectArray[47] = "\u0004$x/j]P|#j\tZP; reh\u0003~y(\t\u0005\u0002:~jcFF6|\u0015";
        objectArray[48] = "zma$Qx26=q`nJd;h\u0003=)*aq\u0018";
        objectArray[49] = "^\u000b\u000bwar\nSP2\u0002u\n\u0014S*nGYP\u000fr\u0002iV\u0018_#<u\u0015\u0012KM";
        objectArray[50] = "\u001e\u00108}|UJHc8\u001fRJ\u000f` s`\u001aC8z\u001f\r\u0018\u000e>8uN\\\u0002<G";
        objectArray[51] = "Z54?Sm\u0000m?=>h]q.`RZ\r2u=>7\u000fppxTtK|r\u0007";
        objectArray[52] = "_q\\[V`D6\u000b)\u0006xDOWY\u001a\u0011\u00056G\u0017\u0019{FrK\u0015f";
        objectArray[53] = "}\u001b}i\u001bV}B40!]t_$0Mo \u001b~o!\\!\u001azmO\\xS#WE\u0000 \u001d~9EYiDD";
        objectArray[54] = "\u00029x_~\u0000Jb$\nO\u00182k#\buIKa,\u0005.";
        objectArray[55] = "\u001e\u0015h\u001f\u0017BJM3ZtEJ\n0B\u0018w\u001cMm\u001aM CNi\u001bNNC\u0017 Bt";
        objectArray[56] = "\u0016\u000ePo2{B\u0019\u00108\u000b-z\u000eKov{GY\u001co1D\u0017\tL\u007f4y@^L8\u000b";
        objectArray[57] = "Bg+\u000b\u0000bYy\u007f\u001bq4_ou\u0015&j\u0004?,y\u000bjB{c\u001c\t&Fi";
        objectArray[58] = "\\\u0014'MU\u000e\bL|\b6\u0001\u001c\nv\u0013Ml\u0017\u0013|NU\u0010\u001a\u0006}w\fS\u0018I`\u001dO\u0017\u0014K\u001f";
        objectArray[59] = "dAM\tz[0\u0019\u0016L\u0019\\0^\u0015Tun`\u001eJ\f\u0019\u0005&D\nCxP G\u001f3";
        objectArray[60] = "i>UnI<=f\u000e+*;=!\r3F\tneRe*'a-\u0001:\u0014;\"'\u0015T";
        objectArray[61] = "\u0001vq'eyO,h<Ys1gbz$c^xs=%\u001a\u000b#~z&pHgrxY";
        objectArray[62] = "Fq\u001bOC#F(R\u0016y(O5B\u0016\u0015\u001a\u001bq\u0018@y)\u001ap\u001cK\u0017)C9Eq";
        objectArray[63] = "\u001f\u001a +k\u0003EB+)\u0006\u0006\u0018^:tj4H\u0012b.\u0006YJ_dll\u001a\u000eSf\u0013";
        objectArray[64] = "'\u0016fl\u0012\u0010=Ig&m\u0017=Dz1:Dd\u0011!`m\u0000=Nam]\u001e9D\u007f";
        objectArray[65] = "mC9\"\u001dL9\u001bbg~K9\\a\u007f\u0012yo\u001e=%C.7\u00199}AE&C8$~";
        objectArray[66] = ")x\"X<Opd/@E[+\u007fN@x\u001a,#r\u001b~\\0\u0019$\u0017\u007fFp%\u007f\u00119ZJ";
        objectArray[67] = "@R\u0014\u001c\u001ey\u000e]\tXtn\bO\r\u0005\u000f\u0003\u0003V\u0007X\u0017\u007f\u000eC\u0006aN<\f\f\u001b\u000b\rx\u0000\u000ed";
        objectArray[68] = "<\u001a.\r\u001d\f=\u0014:\u001cv\u0001]\b2S\u000b\u00122\u0017#\u0014\nk9KjSL\u00059\u0012#\nv";
        objectArray[69] = "\u0007MB1,IQBWc\u0011\u0016\u0016_]5m\u0010\u00102G$w\u0005ZC\\c w";
        objectArray[70] = "\u0014E\u0016\u0016\u0003\u001aWA\u0000Te\u0011.\u0006VA\u0000DC_\u000bT\u0001{";
        objectArray[71] = "Tg*)A#\u000e?!+,&S#0v@\u0014\u0003co.,\u007fE9/aM*C::\u0011";
        objectArray[72] = "y\u000fp\u0013\u0013,{\u0002*\u001cb2*B{\u001a\u000e\u0000~\u000e'@\\Wx]v\u0017\u00042.Ar\u0007b";
        objectArray[73] = "\u0012YS~mz\u0010Y\\&\u0010sN\u000fZ/G$\u0011R\u0001C.,D\fO8,!\u001e\u0003";
        objectArray[74] = "^\u0019\u0005W\u0016\"\f\\X\u0014q{]\u001a\u0003\r\u001dI\nW]Tqq[\u001a\u0002\u0016\u0014yM\u001c\u001fj";
        objectArray[75] = "Z+\u0003\u0004\u001aY\u000f-\u0000\u0011jW\u000b,>\u0007\u0010Y\u0000?eJ\nH\u001b:\u001f\u0004\u0005U_P";
        objectArray[76] = "p!i\u0014w\u001blbc\u0000\u0019@dly\u001fur6!!I\u0019_9l`\n|]uhrx";
        objectArray[77] = "v+}BB\u001avr4\u001bx\u0011\u007fo$\u001b\u0014#++~Bx\u0010**zF\u0016\u0010sc#|\u0012I(u~@IOniD";
        objectArray[78] = "k\u00065ul9i\u0006:-\u0011;;A8/}\to\u0000fr\u0011>?A6(o#2XbH";
        objectArray[79] = "J{VhD\u001a\u0010#]j)\u0017Y>E4RzR'OiJ\u0006_2NP\u0013E]}S:P\u0001Q\u007f,";
        objectArray[80] = "J\u0002\u0018y[q\u0013\u001e\u0015a\"uN\u0018ta\u001f$OYH:\u0019bSc\u001e6\u0018x\u0013_E0^d)";
        objectArray[81] = "D^\nxRH\u0019A\fxcHXB\u0017x\u001fN^/\ri\u0005[\u0014^\u0016.R)";
        objectArray[82] = "5x^du?(uG0\u0015$8mBmy\u0016o!\u00122\u0015!$vK;t|;pK\n";
        objectArray[83] = "S>No[qHy\u0019\u001d\rmC:(o\u000fc\n%Tb\u001ab3";
        objectArray[84] = "\u001eItmMzGUyu4i\u001arqsU|\u001bS\u0018u\t/\u001b\u0012$.\u000fi\u0007(r\"\u000esG\u0014)$Ho}";
        objectArray[85] = "Wwt[;DPue\u0000\u0006Z\u00046w\u0005jhTz*R\u0006UQ0/\u000ff\u000f\t;-bl\u0002S,-^7\u0004\u00150\u0017";
        objectArray[86] = "Tk@~q)^dM%A9?{Hz<)PdY==P\u0005?Tz>:F{XxA";
        objectArray[87] = ";\u0010Gt(w:\u001eSeCyZ\u0002[*>i5\u001dJm?\u0010>A\u0003*y~>\u0018JsC";
        objectArray[88] = "m1LT%Y;-HDC].?[W?[(RAF%Nb#Z\u0001r<";
        objectArray[89] = "hE>0&)~\u0014~`V=\u000e_ 7+-a@1p*TvN'j79jTpbV";
        objectArray[90] = "3Fc\u000b\u0016agQ#\\/5_PsXR'0Ob\u001fS^e\u0014oXP4&PcZ/";
        objectArray[91] = ";\u001ck_Mv9\u00111P<hhQ`VPZ<\u001d9\b\u0006\rhRe\\\u00013>]p\u000e<";
        Object[] objectArray2 = objectArray;
        objectArray[92] = "7)\u0016@NB6'\u0002Q%LV;\n\u001eX\\9$\u001bYY%g \u001b]O_)/\u0006\u0019%";
    }

    public static class_1297 a(Object[] objectArray) {
        class_1297 class_12972;
        block21: {
            long l = (Long)objectArray[0];
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x12644DED7C3BL;
            long l4 = l2 ^ 0x358C558A698EL;
            class_1297 class_12973 = null;
            CallSite callSite = f1.a("k", (Object)f1.a("k", (Object)f1.a("l", (Object)b, (long)2135629603957880421L, (long)l), (long)2136941983374160155L, (long)l), (long)2134777485727417235L, (long)l);
            CallSite callSite2 = f1.a("\u00d8", (long)2134915611738853807L, (long)l);
            while (f1.a("k", (Object)callSite, (long)2142600022030714983L, (long)l) != false) {
                block28: {
                    Object object;
                    block26: {
                        CallSite callSite3;
                        class_1297 class_12974;
                        block25: {
                            block24: {
                                block23: {
                                    block22: {
                                        class_12974 = (class_1297)f1.a("k", (Object)callSite, (long)2136362239233907737L, (long)l);
                                        try {
                                            try {
                                                class_12972 = class_12974;
                                                if (callSite2 != null) break block21;
                                                callSite3 = f1.a("k", (Object)class_12972, (long)2143376838289082272L, (long)l);
                                                if (callSite2 != null) break block22;
                                            }
                                            catch (MatchException matchException) {
                                                throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                            }
                                            if (callSite3 == false) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                        }
                                        callSite3 = f1.a("k", (Object)class_12974, (Object)f1.a("l", (Object)b, (long)2142116887738514987L, (long)l), (long)2135491300419891608L, (long)l);
                                    }
                                    try {
                                        if (callSite2 != null) break block23;
                                        if (callSite3 != false) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l3;
                                    objectArray2[0] = f1.a("k", (Object)f1.a("k", (Object)class_12974, (long)2134942323235079916L, (long)l), (long)2135825238212891611L, (long)l);
                                    callSite3 = f1.a("k", (Object)f1.a("\u00de", (long)2142890964240899734L, (long)l), (Object)objectArray2, (long)2143267774783450258L, (long)l);
                                }
                                try {
                                    if (callSite2 != null) break block24;
                                    if (callSite3 != false) continue;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                }
                                callSite3 = f1.a("k", (Object)class_12974, (long)2143132876342358684L, (long)l);
                            }
                            try {
                                if (callSite2 != null) break block25;
                                if (callSite3 == false) continue;
                            }
                            catch (MatchException matchException) {
                                throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l4;
                            objectArray3[0] = class_12974;
                            callSite3 = f1.a("k", (Object)f1.a("\u00de", (long)2142753398591190346L, (long)l), (Object)objectArray3, (long)2135994639189795254L, (long)l);
                        }
                        try {
                            if (callSite3 == false && callSite2 == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                        }
                        try {
                            block27: {
                                try {
                                    try {
                                        try {
                                            object = class_12973;
                                            if (callSite2 != null) break block26;
                                            if (object == null) break block27;
                                        }
                                        catch (MatchException matchException) {
                                            throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                        }
                                        object = f1.a("l", (Object)b, (long)2142116887738514987L, (long)l);
                                        if (callSite2 != null) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                    }
                                    if (!(f1.a("k", (Object)object, (Object)class_12974, (long)2135911470353743425L, (long)l) < f1.a("k", (Object)f1.a("l", (Object)b, (long)2142116887738514987L, (long)l), (Object)class_12973, (long)2135911470353743425L, (long)l))) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                                }
                            }
                            object = class_12974;
                        }
                        catch (MatchException matchException) {
                            throw f1.a("\u00d8", (Object)matchException, (long)2143435465012893922L, (long)l);
                        }
                    }
                    class_12973 = object;
                }
                if (callSite2 == null) continue;
            }
            class_12972 = class_12973;
        }
        return class_12972;
    }

    private static Field g(long l, long l2) {
        int n = f1.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = f1.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f1.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f1.c(clazz3, string2, clazz2)) != null) {
                    f1.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f1.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f1.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f1.f(100428125307931L, 0L);
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
            return MethodHandles.lookup().findStatic(f1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


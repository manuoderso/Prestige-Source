/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_332
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.g7;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_11909;
import net.minecraft.class_332;

public class g9
extends g7
implements cz_0 {
    private boolean a = 0;
    private boolean b = 0;
    private static final long c = hc.a(8998037986237408251L, 6523977047684956127L, MethodHandles.lookup().lookupClass()).a(239965619429360L);
    private static final Object[] d = new Object[13];
    private static final String[] e = new String[13];

    static {
        g9.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 55;
            case 1 -> 47;
            case 2 -> 1;
            case 3 -> 45;
            case 4 -> 6;
            case 5 -> 39;
            case 6 -> 48;
            case 7 -> 16;
            case 8 -> 28;
            case 9 -> 7;
            case 10 -> 52;
            case 11 -> 11;
            case 12 -> 14;
            case 13 -> 37;
            case 14 -> 22;
            case 15 -> 26;
            case 16 -> 31;
            case 17 -> 15;
            case 18 -> 20;
            case 19 -> 54;
            case 20 -> 18;
            case 21 -> 35;
            case 22 -> 44;
            case 23 -> 23;
            case 24 -> 17;
            case 25 -> 57;
            case 26 -> 4;
            case 27 -> 9;
            case 28 -> 25;
            case 29 -> 32;
            case 30 -> 61;
            case 31 -> 40;
            case 32 -> 12;
            case 33 -> 34;
            case 34 -> 49;
            case 35 -> 56;
            case 36 -> 3;
            case 37 -> 30;
            case 38 -> 0;
            case 39 -> 29;
            case 40 -> 50;
            case 41 -> 21;
            case 42 -> 43;
            case 43 -> 2;
            case 44 -> 41;
            case 45 -> 10;
            case 46 -> 58;
            case 47 -> 62;
            case 48 -> 59;
            case 49 -> 19;
            case 50 -> 5;
            case 51 -> 46;
            case 52 -> 38;
            case 53 -> 60;
            case 54 -> 53;
            case 55 -> 33;
            case 56 -> 24;
            case 57 -> 27;
            case 58 -> 63;
            case 59 -> 8;
            case 60 -> 42;
            case 61 -> 51;
            case 62 -> 36;
            default -> 13;
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
        g9.e[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == '\u00d9' || c == '\u00e2' || c == 'a') {
                field = g9.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g9.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = g9.b(lookup, mutableCallSite, string, methodType, l, l2);
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
        int n = g9.e(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = g9.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g9.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g9.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        g9.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g9.f(542118883601531L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g9.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g9.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g9.f(542118883601531L, 0L);
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
            int n = g9.e(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                g9.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g9.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g9.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = g9.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g9.d(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/g9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void a(Object[] objectArray) {
        this.b = 0;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\tn?H\u00162\u001fn:\u0012\u0005%\b%9\u0014\t1\u0019b.\u0003B%T";
        objectArray[1] = Void.TYPE;
        g9.e[1] = "java/lang/Void";
        objectArray[2] = "\u000b><xoU\u001d>9\"|B\nu:$pV\u001b2-3;D'";
        objectArray[3] = "0*LM@\u0005E\nGBQJ8\u0012TEX\u0003P";
        objectArray[4] = "[!OY\u00023M!J\u0003\u0011$ZjI\u0005\u001d0K-^\u0012V\r^0P\u0001\u001d";
        objectArray[5] = "$z\u0015?C>/u\u0004p 3:x\u000b\u001b\u00151+k\u00177\u0002<";
        objectArray[6] = Boolean.TYPE;
        g9.e[6] = "java/lang/Boolean";
        objectArray[7] = "s7e\u0007~\u001fx8tH\u001f\u0011s3p\u0012";
        objectArray[8] = "4MG\u0002\u0003\u0015hUD\u0016`O\r\b_\u001c\u001a\u00157\u0002\b\u0017\u0002%";
        objectArray[9] = "\u000fYi3&\rNF 8[\u00024\n40'\u0018ZO\"c&`";
        objectArray[10] = "LB,>F\u0017\r]e5;\u001bw_|o\u0005\u0002\bBv<;";
        objectArray[11] = "}IQ\u00006(qA\u0002oj:jM\f\u0003Xm+\u0011R^\u000f%wFU\u0017p8}\u0015k";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "N,Q\u001b5\u0001B$\u0002te~\u001e*\u0006\u000bc\u000f\u001c7\u0017\u0018\fEG%\u0014\u001b}GZ4\u0007t";
    }

    private static Field g(long l, long l2) {
        int n = g9.e(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = g9.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g9.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g9.c(clazz3, string2, clazz2)) != null) {
                    g9.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g9.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g9.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g9.f(542118883601531L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void method_25394(class_332 class_3322, int n, int n2, float f) {
        block18: {
            Object object;
            long l;
            block19: {
                CallSite callSite;
                block17: {
                    block15: {
                        block16: {
                            l = c ^ 0x49FF7AA39006L;
                            callSite = g9.a("g", (long)2382135723402388292L, (long)l);
                            try {
                                try {
                                    try {
                                        try {
                                            object = this.a;
                                            if (callSite != null) break block15;
                                            if (!object) break block16;
                                        }
                                        catch (MatchException matchException) {
                                            throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                                        }
                                        object = g9.a("g", (long)2382255397928686583L, (long)l);
                                        if (callSite != null) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                                    }
                                    if (object) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                                }
                                g9.a("\u00cf", (Object)this, (long)2382346407499591418L, (long)l);
                                return;
                            }
                            catch (MatchException matchException) {
                                throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                            }
                        }
                        object = this.a;
                    }
                    try {
                        try {
                            if (callSite != null) break block17;
                            if (object) break block18;
                        }
                        catch (MatchException matchException) {
                            throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                        }
                        object = this.b;
                    }
                    catch (MatchException matchException) {
                        throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block19;
                    if (object) break block18;
                }
                catch (MatchException matchException) {
                    throw g9.a("g", (Object)matchException, (long)2381887414609378464L, (long)l);
                }
                object = g9.a("g", (long)2382255397928686583L, (long)l);
            }
            if (!object) {
                g9.a("g", (long)2382323081948776706L, (long)l);
            }
            this.a = 1;
        }
    }

    public void method_25419() {
        block4: {
            block5: {
                long l = c ^ 0x340219B25798L;
                this.b = 1;
                this.a = 0;
                CallSite callSite = g9.a("g", (long)-1832553639273880358L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (g9.a("g", (long)-1832677711691508631L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw g9.a("g", (Object)matchException, (long)-1832872660475692226L, (long)l);
                    }
                    g9.a("g", (long)-1832459522420732260L, (long)l);
                }
                catch (MatchException matchException) {
                    throw g9.a("g", (Object)matchException, (long)-1832872660475692226L, (long)l);
                }
            }
            super.method_25419();
        }
    }

    public void method_25420(class_332 class_3322, int n, int n2, float f) {
        super.method_25420(class_3322, n, n2, f);
    }

    public void method_48267() {
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        long l = c ^ 0x7B63EC3B115FL;
        g9.a("\u00cf", (Object)this, (long)-6893047353806655581L, (long)l);
        return super.method_25402(class_119092, bl);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


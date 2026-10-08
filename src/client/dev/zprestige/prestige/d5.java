/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2720
 *  net.minecraft.class_2856
 *  net.minecraft.class_2856$class_2857
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.minecraft.class_2720;
import net.minecraft.class_2856;

public class d5
extends dV {
    private static final long k = hc.a(-4756148655452173340L, 1934295667687930903L, MethodHandles.lookup().lookupClass()).a(250854068603386L);
    private static final Object[] l = new Object[25];
    private static final String[] m = new String[25];

    static {
        d5.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/d5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d5.m(l, l2);
            object = d5.l[n];
            try {
                if (!(object instanceof String)) break block2;
                d5.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d5.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d5.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d5.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d5.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "qbO\u0019B\u0013gbJCQ\u0004p)IE]\u0010an^R\u0016\u0002]";
        objectArray[1] = "sO[(~l\u0006oP'o#{wC fj\u0013";
        objectArray[2] = "ywx\u001c~!ywo@r.c<o^r;dM?\u0003#";
        objectArray[3] = "\u000e6a+D&\u000e6vwH)\u0014}viH<\u0013\f\"1\u001f";
        objectArray[4] = ":NI\t\nbOnB\u0006\u001b-.`I\r\u001fwZ";
        objectArray[5] = Void.TYPE;
        d5.m[5] = "java/lang/Void";
        objectArray[6] = "Y\u000e~\u007fOCO\u000e{%\\TXEx#P@I\u0002o4\u001bW\b";
        objectArray[7] = "17]L0::8L\u0003S7/5Chf5>&_Dq8";
        objectArray[8] = "\u007fUH!X\u001aiUM{K\r~\u001eN}G\u0019oYYj\f\b|";
        objectArray[9] = "-\r\u0007W[ X-\fXJo9#\u0007SN5M";
        objectArray[10] = "\bXO\n\by\bXXV\u0004v\u0012\u0013XH\u0004c\u0015b\t\u0011\\&";
        objectArray[11] = "\u007f\u0001]dz?a\tG+\u0001\u001f\\$";
        objectArray[12] = "}\u0006\u0015#K6k\u0006\u0010yX!|M\u0013\u007fT5m\n\u0004h\u001f%*";
        objectArray[13] = "99\n\u00198cL\u0019\u0001\u0016),-\u0017\n\u001d-vY";
        objectArray[14] = "PL\u007f\u0002.gPLh^\"hJ\u0007h@\"}Mv9\u0014v8\u001aJgM0}a\u001b3\u0019t";
        objectArray[15] = "D1G\u0019\u0014zO>VVutD5R\f";
        objectArray[16] = "\u0012\u001dB'\u0007\u0004\u001b\u0014{u{E\u001dX\u0015'A\u0010L\u0018A\u001f";
        objectArray[17] = "}\u0016|PY 'UrW50@YfPZ0+QdQOY\u007f\n!WG>z\frU5";
        objectArray[18] = "n<:\n\u0015\u0014j'9\\*\u001b6(#[}Lh\u007f{7\u0010\ff%,Z\u0013\nn(";
        objectArray[19] = "\u0016\u00128+,8\u001f\u001b\u0001zPq\rVnz;y\u000fW{\u0013k%\u001a\u001bp~\"\u007f\u000e\u0016\u0001";
        objectArray[20] = "\u0005PvfVv\u0006V~k=~RU'aQL\u0002\u0017y9=+\u0002X<`W#\u0002Pz\u0006";
        objectArray[21] = " Z\u0015}s\u0013j\u001f\u0014#\u001d\u0017\u0010\u0017P#r\u0017{\u001fR\"g~+CGnl\u0013b\u0019Sc\u001d";
        objectArray[22] = "A\rus Q\n\u0003'&EM\u0011\u001f!v\u0012\u001aKJ|%E\u0012\u000fB,\u007f7Y\u0001\u0010y";
        objectArray[23] = "\u0005\u0018RS8\u0016N\u0016\u0000\u0006]\nU\n\u0006V\n]\u000f_[\u0004]UKW\u000b_/\u001eE\u0005^";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "#>(+n\u0013\u007f +f\u0002\u0014\u001fa,%`E!6)&\u007f}##.;:Ct&-$\u0002";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d5.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == 'L' || c == 'u' || c == '\u00f9') {
                field = d5.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d5.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bg_0 bg_02) {
        block5: {
            bg_0 bg_03;
            long l;
            long l2;
            block4: {
                l2 = k ^ 0x1F320CF5849BL;
                l = l2 ^ 0x57F2D0FD2EDL;
                CallSite callSite = d5.b("\u00c8", (long)-583465135340762980L, (long)l2);
                try {
                    try {
                        bg_03 = bg_02;
                        if (callSite != null) break block4;
                        if (!(d5.b("\u00fe", (Object)bg_03, (Object)new Object[0], (long)-583385120130478613L, (long)l2) instanceof class_2720)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d5.b("\u00c8", (Object)matchException, (long)-584013080506428206L, (long)l2);
                    }
                    bg_03 = bg_02;
                }
                catch (MatchException matchException) {
                    throw d5.b("\u00c8", (Object)matchException, (long)-584013080506428206L, (long)l2);
                }
            }
            d5.b("\u00fe", (Object)bg_03, (Object)new Object[0], (long)-583276986072872440L, (long)l2);
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = new class_2856((UUID)((Object)d5.b("\u00fe", (Object)d5.b("\u00e8", (Object)b, (long)-583354459916325646L, (long)l2), (long)-583723206690914008L, (long)l2)), (class_2856.class_2857)d5.b("u", (long)-583516756229765003L, (long)l2));
            d5.b("\u00c8", (Object)objectArray, (long)-583651875714721854L, (long)l2);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l;
            objectArray2[0] = new class_2856((UUID)((Object)d5.b("\u00fe", (Object)d5.b("\u00e8", (Object)b, (long)-583354459916325646L, (long)l2), (long)-583723206690914008L, (long)l2)), (class_2856.class_2857)d5.b("u", (long)-583578597447508398L, (long)l2));
            d5.b("\u00c8", (Object)objectArray2, (long)-583651875714721854L, (long)l2);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = d5.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 56;
            case 2 -> 17;
            case 3 -> 57;
            case 4 -> 39;
            case 5 -> 15;
            case 6 -> 21;
            case 7 -> 60;
            case 8 -> 52;
            case 9 -> 32;
            case 10 -> 11;
            case 11 -> 31;
            case 12 -> 41;
            case 13 -> 46;
            case 14 -> 59;
            case 15 -> 38;
            case 16 -> 22;
            case 17 -> 43;
            case 18 -> 37;
            case 19 -> 30;
            case 20 -> 55;
            case 21 -> 1;
            case 22 -> 14;
            case 23 -> 10;
            case 24 -> 62;
            case 25 -> 34;
            case 26 -> 7;
            case 27 -> 27;
            case 28 -> 63;
            case 29 -> 0;
            case 30 -> 47;
            case 31 -> 25;
            case 32 -> 6;
            case 33 -> 4;
            case 34 -> 19;
            case 35 -> 44;
            case 36 -> 2;
            case 37 -> 36;
            case 38 -> 18;
            case 39 -> 3;
            case 40 -> 16;
            case 41 -> 28;
            case 42 -> 53;
            case 43 -> 29;
            case 44 -> 58;
            case 45 -> 20;
            case 46 -> 50;
            case 47 -> 61;
            case 48 -> 8;
            case 49 -> 40;
            case 50 -> 24;
            case 51 -> 33;
            case 52 -> 9;
            case 53 -> 23;
            case 54 -> 42;
            case 55 -> 45;
            case 56 -> 54;
            case 57 -> 48;
            case 58 -> 49;
            case 59 -> 12;
            case 60 -> 51;
            case 61 -> 13;
            case 62 -> 5;
            default -> 35;
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
        d5.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d5.m(l, l2);
        Object object = d5.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = d5.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d5.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d5.g(clazz3, string2, clazz2)) != null) {
                    d5.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d5.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d5.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d5.n(1124316045831865L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d5.m(l, l2);
        Object object = d5.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = d5.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d5.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d5.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d5.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d5.n(1124316045831865L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d5.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d5.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d5.n(1124316045831865L, 0L);
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

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d5.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


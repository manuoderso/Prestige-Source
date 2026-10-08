/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.ds_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.fabricmc.fabric.api.event.Event;

/*
 * Renamed from dev.zprestige.prestige.dr
 */
public interface dr_0 {
    public static final Event a;
    public static final Event b;
    public static final Event c;
    public static final long d;
    public static final Object[] e;
    public static final String[] f;

    static {
        d = hc.a(-6476619720041136215L, 8345883534297251393L, MethodHandles.lookup().lookupClass()).a(230944569046159L);
        long l = d ^ 0x7ADC4F90A6DBL;
        long l2 = l ^ 0x5DB0C42DDB5BL;
        e = new Object[17];
        f = new String[17];
        dr_0.a();
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        a = dr_0.a("l", (Object)objectArray, (long)8172559771744804614L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        b = dr_0.a("l", (Object)objectArray2, (long)8172559771744804614L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        c = dr_0.a("l", (Object)objectArray3, (long)8172559771744804614L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dr_0.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                dr_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dr_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dr_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dr_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dr_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = dr_0.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = dr_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dr_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dr_0.a(clazz3, string2, clazz2)) != null) {
                    dr_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dr_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dr_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dr_0.b(880928787272768L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dr_0.a(l, l2);
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
                clazz3 = dr_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dr_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dr_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dr_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dr_0.b(880928787272768L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dr_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dr_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dr_0.b(880928787272768L, 0L);
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
            if (c == '\u00dc' || c == '\u00ec' || c == 'j' || c == '\u00a3') {
                field = dr_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dr_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dr_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
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
            case 0 -> 12;
            case 1 -> 63;
            case 2 -> 35;
            case 3 -> 31;
            case 4 -> 62;
            case 5 -> 6;
            case 6 -> 25;
            case 7 -> 9;
            case 8 -> 49;
            case 9 -> 1;
            case 10 -> 2;
            case 11 -> 52;
            case 12 -> 8;
            case 13 -> 19;
            case 14 -> 43;
            case 15 -> 60;
            case 16 -> 21;
            case 17 -> 16;
            case 18 -> 58;
            case 19 -> 34;
            case 20 -> 11;
            case 21 -> 23;
            case 22 -> 3;
            case 23 -> 5;
            case 24 -> 32;
            case 25 -> 44;
            case 26 -> 20;
            case 27 -> 26;
            case 28 -> 13;
            case 29 -> 48;
            case 30 -> 27;
            case 31 -> 36;
            case 32 -> 59;
            case 33 -> 28;
            case 34 -> 4;
            case 35 -> 22;
            case 36 -> 54;
            case 37 -> 14;
            case 38 -> 50;
            case 39 -> 37;
            case 40 -> 18;
            case 41 -> 47;
            case 42 -> 0;
            case 43 -> 55;
            case 44 -> 61;
            case 45 -> 46;
            case 46 -> 24;
            case 47 -> 51;
            case 48 -> 42;
            case 49 -> 57;
            case 50 -> 29;
            case 51 -> 39;
            case 52 -> 40;
            case 53 -> 33;
            case 54 -> 41;
            case 55 -> 53;
            case 56 -> 17;
            case 57 -> 15;
            case 58 -> 45;
            case 59 -> 38;
            case 60 -> 10;
            case 61 -> 56;
            case 62 -> 7;
            default -> 30;
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
        dr_0.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0002M(Q\u001aV\u0014M-\u000b\tA\u0003\u0006.\r\u0005U\u0012A9\u001aNG.";
        objectArray[1] = "q}k'\u0006\f\u0004]`(\u0017CyEs/\u001e\n\u0011";
        objectArray[2] = "|(\\\u0004^\\j(Y^MK}cZXA_l$MO\nHk";
        objectArray[3] = "\u0002\u0001K`\b\u0004\u0014\u0001N:\u001b\u0013\u0003JM<\u0017\u0007\u0012\rZ+\\\u0015\u0017";
        objectArray[4] = "j\u0003a\b7\u0003|\u0003dR$\u0014kHgT(\u0000z\u000fpCc\u0014E";
        objectArray[5] = Void.TYPE;
        dr_0.f[5] = "java/lang/Void";
        objectArray[6] = "M\u0007Ur\u0016-A\u0010H?\u001d/\r\u0004@>\u0002%@L@,\u0019bF\u0014D2\u0004bf\u0014D2\u0004\nB\u0001U3\u00025";
        objectArray[7] = "Yu\u001dv>\u001aRz\f9S\u001aRg\u0018";
        objectArray[8] = "$\tZ<=P:\u0001@suP \u000bX4|K`.Y3pQ'\u0007B";
        objectArray[9] = "\u0002]=S#g\u000eJ \u001e(eB^(\u001f7o\u000f\u0016(\r,(\tN,\u00131()N,\u00131";
        objectArray[10] = " pfi#k6pc30|!;`5<h0|w\"w\u007f6";
        objectArray[11] = "\u0016~>cm&c^5l|i\u0002P>gx3v";
        objectArray[12] = "\u001fc|nYc\u0014lm!8m\u001fgi{";
        objectArray[13] = "\u0007=@'>N\u001b/\u0007E1/^4\u0010)kB\u001e&\u0016t[";
        objectArray[14] = "P 8\u007f\u0010\u000fS!m8.\u0016\u0016}i;C4\u0016ji6d\u0014\u0007sm+.@\u0006|k*\u001e\u0005\u0003!~G\u0013\f\u000enb}V\u0003\b*\u0000yM\u0006\u0007ok,@\u0010\u001e\u0010";
        objectArray[15] = "k.\u0014~CL>/X2/[T{\u0019|UR71]fO2j(^gPY?%H~/";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\ff>iM\u0013\rm< 6D5<hbVDLxj*N-\u000e7,!P_R{,n6\u0016Ki9/M\u001cN~l\u0010";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Event a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        return dr_0.a("l", ds_0.class, dr_0::lambda$makeSimpleEvent$1, (long)9044267085574317955L, (long)l);
    }

    private static ds_0 lambda$makeSimpleEvent$1(ds_0[] ds_0Array) {
        return (arg_0, arg_1) -> dr_0.lambda$makeSimpleEvent$0(ds_0Array, arg_0, arg_1);
    }

    private static void lambda$makeSimpleEvent$0(ds_0[] ds_0Array, aq_0 aq_02, gK gK2) {
        long l = d ^ 0x6BAC2BADF1A8L;
        ds_0[] ds_0Array2 = ds_0Array;
        int n = ds_0Array2.length;
        CallSite callSite = dr_0.a("l", (long)2745328690613848360L, (long)l);
        for (int i = 0; i < n; ++i) {
            ds_0 ds_02 = ds_0Array2[i];
            dr_0.a("\u00dd", (Object)ds_02, (Object)aq_02, (Object)gK2, (long)2746698902704227639L, (long)l);
            if (callSite == null) continue;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dr_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bk_0;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

/*
 * Renamed from dev.zprestige.prestige.fn
 */
public class fn_0
extends dV {
    private dO a;
    private dQ b;
    private static final long k = hc.a(3212576026138304325L, 96649662024488877L, MethodHandles.lookup().lookupClass()).a(204719029278399L);
    private static final Object[] l = new Object[25];
    private static final String[] m = new String[25];

    static {
        fn_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fn_0.m(l, l2);
            object = fn_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fn_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fn_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fn_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fn_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fn_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "POl\u0011S\bNGv^.\u0018N";
        objectArray[1] = "2137{Z9>\"x\u001aT25&\"";
        objectArray[2] = "\u0015hN8Ku\u0003hKbXb\u0014#HdTv\u0005d_s\u001fd9";
        objectArray[3] = "V\r~ZA\r#-uUPB^5fRY\u000b6";
        objectArray[4] = "k\u000bU\u00171N\u001e+^\u0018 \u0001\u007f%U\u0013$[\u000b";
        objectArray[5] = Void.TYPE;
        fn_0.m[5] = "java/lang/Void";
        objectArray[6] = "\u0001<\bzf\n\u0017<\r u\u001d\u0000w\u000e&y\t\u00110\u001912\u001c\u000b";
        objectArray[7] = "M\fy\u0011-HF\u0003h^NES\u000eg5{GB\u001d{\u0019lJ";
        objectArray[8] = "_\u001e\u0000F>\u0018I\u001e\u0005\u001c-\u000f^U\u0006\u001a!\u001bO\u0012\u0011\rj\fj";
        objectArray[9] = ".\u0012Mmyz[2Fbh5:<MiloN";
        objectArray[10] = Float.TYPE;
        fn_0.m[10] = "java/lang/Float";
        objectArray[11] = "c$*\f!7},0C]#g!3\u0000";
        objectArray[12] = "\u00198uGnB\u000f8p\u001d}U\u0018ss\u001bqA\t4d\f:V6";
        objectArray[13] = "_EMG\u0011{TJ\\\by{ZEO";
        objectArray[14] = "MsE~1\u0003[s@$\"\u0014L8C\".\u0000]\u007fT5e\u0011B";
        objectArray[15] = "\u0011zzV|cdZqYm,\u0005TzRivq";
        objectArray[16] = "\u0003\u0000\u0003Q+tU\rDQ\u0015g:[\u0001\u001cut\u0007\u0010\u0019H{\r";
        objectArray[17] = "-hX\u0016Rwr+\flG N/\f\fMws?T\u0007 7u6ZU\u001d'-=7\u0015\u001b.#o\n\u0005C%N5\t\u0003Z<wjJW ";
        objectArray[18] = "1\u0001\bDsv0\u0001AQ\u0011{\r_]Mqhp\u0010NU \u00120\u000e@\\ko\u007f\u001dX\r\u0011";
        objectArray[19] = "5NH_F\"cC\u000f_x2\fFLB\u0014&kTNC\u0002[7PCA\u001db<\u0015BHx";
        objectArray[20] = "\tR0|\f\\O]:ij[4^un\u0006HSLwo\u00105\u000b\rvh\u0004\r\u0005\bt3j";
        objectArray[21] = "E'&\u0014H9\u0004&1V6.\u00172=cR/\u0013>A\u0012\f5\u0011,y\u001c\t7JB~\u0017K#\u0014zp\u0012Ixz";
        objectArray[22] = "cG\u0014+ /0JJpI,SP\u0013)$|n@K\"I";
        objectArray[23] = "i*1f*\"&,m\"\u0011=<w<!O:<m8].i%{;e l' U";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "M)`L(r\u0015)wJW'$\u007fwN;0CmuO-M\u001fixM2t\u0014,yDW";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fn_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == 'V' || c == '\u00a2' || c == '\u00db') {
                field = fn_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fn_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(bk_0 bk_02) {
        block5: {
            long l;
            block4: {
                l = k ^ 0x3DF7D82100A0L;
                long l2 = l ^ 0x686A5CF6C4FCL;
                CallSite callSite = fn_0.b("F", (long)-4231844815368622727L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (!(fn_0.b("\u00f9", (Object)dn_0.a, (float)100.0f, (long)-4232239877359718101L, (long)l) <= fn_0.b("\u00f9", (Object)((Float)((Object)fn_0.b("\u00f9", (Object)this.a, (long)-4232010621061399489L, (long)l))), (long)-4232100494694769730L, (long)l))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fn_0.b("F", (Object)matchException, (long)-4231697003115029887L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    fn_0.b("\u00f9", (Object)bk_02, (Object)new Object[]{Float.valueOf((float)fn_0.b("\u00f9", (Object)this.b, (Object)objectArray, (long)-4232143671301632980L, (long)l))}, (long)-4231283191251514311L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fn_0.b("F", (Object)matchException, (long)-4231697003115029887L, (long)l);
                }
            }
            fn_0.b("\u00f9", (Object)bk_02, (Object)new Object[0], (long)-4231803154076821944L, (long)l);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fn_0.b("F", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (Object)((Object)q_0.Mace), (long)-2448692828626784512L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fn_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 23;
            case 2 -> 59;
            case 3 -> 48;
            case 4 -> 24;
            case 5 -> 63;
            case 6 -> 4;
            case 7 -> 51;
            case 8 -> 19;
            case 9 -> 47;
            case 10 -> 60;
            case 11 -> 25;
            case 12 -> 62;
            case 13 -> 50;
            case 14 -> 8;
            case 15 -> 15;
            case 16 -> 6;
            case 17 -> 9;
            case 18 -> 21;
            case 19 -> 30;
            case 20 -> 43;
            case 21 -> 40;
            case 22 -> 16;
            case 23 -> 46;
            case 24 -> 58;
            case 25 -> 2;
            case 26 -> 52;
            case 27 -> 29;
            case 28 -> 5;
            case 29 -> 0;
            case 30 -> 42;
            case 31 -> 34;
            case 32 -> 28;
            case 33 -> 22;
            case 34 -> 49;
            case 35 -> 32;
            case 36 -> 33;
            case 37 -> 38;
            case 38 -> 7;
            case 39 -> 1;
            case 40 -> 44;
            case 41 -> 56;
            case 42 -> 12;
            case 43 -> 35;
            case 44 -> 45;
            case 45 -> 18;
            case 46 -> 17;
            case 47 -> 55;
            case 48 -> 14;
            case 49 -> 57;
            case 50 -> 26;
            case 51 -> 31;
            case 52 -> 37;
            case 53 -> 10;
            case 54 -> 53;
            case 55 -> 11;
            case 56 -> 3;
            case 57 -> 36;
            case 58 -> 41;
            case 59 -> 61;
            case 60 -> 13;
            case 61 -> 54;
            case 62 -> 27;
            default -> 20;
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
        fn_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fn_0.m(l, l2);
        Object object = fn_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fn_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fn_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fn_0.g(clazz3, string2, clazz2)) != null) {
                    fn_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fn_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fn_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fn_0.n(73621803838908L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fn_0.m(l, l2);
        Object object = fn_0.l[n];
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
                clazz3 = fn_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fn_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fn_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fn_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fn_0.n(73621803838908L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fn_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fn_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fn_0.n(73621803838908L, 0L);
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
            return MethodHandles.lookup().findStatic(fn_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


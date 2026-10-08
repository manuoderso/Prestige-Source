/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1747
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1747;

public class eL
extends dV {
    private boolean i = 0;
    private static final long k = hc.a(-3589562129518092548L, 9140444372079369432L, MethodHandles.lookup().lookupClass()).a(243174874459416L);
    private static final Object[] l = new Object[37];
    private static final String[] m = new String[37];

    static {
        eL.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eL.m(l, l2);
            object = eL.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eL.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eL.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eL.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eL.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eL.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "F\u0010^P$EF\u0010I\f(J\\[I\u0012(_[*\u0019O|";
        objectArray[1] = "\u0006{\\c\u0016\u000f\u0006{K?\u001a\u0000\u001c0K!\u001a\u0015\u001bA\u001b}O";
        objectArray[2] = "=-r%WU=-ey[Z'feg[O \u001708\u0002";
        objectArray[3] = "tC\u0001\u0018#ctC\u0016D/ln\b\u0016Z/yiyG\u0005}2";
        objectArray[4] = "{jL\u000e\b){j[R\u0004&a![L\u00043fP\n\u0016]p";
        objectArray[5] = "6m0;VB m5aEU7&6gIA&a!p\u0002S\u001a";
        objectArray[6] = "Q1(\u0015P\u001d$\u0011#\u001aARY\t0\u001dH\u001b1";
        objectArray[7] = "E\u0010I-}[E\u0010^qqT_[^oqAX*\u000e2 ";
        objectArray[8] = "h,pyLEh,g%@Jrgg;@_u\u00163c\u0017";
        objectArray[9] = "\u001ar=b\f\u0000\u001ar*>\u0000\u000f\u00009* \u0000\u001a\u0007Hx{XP";
        objectArray[10] = "\u001d\u00191\t^\u000b\u001d\u0019&UR\u0004\u0007R&KR\u0011\u0000#t\u0010\nP";
        objectArray[11] = Float.TYPE;
        eL.m[11] = "java/lang/Float";
        objectArray[12] = "R\u0001!\u001dr>R\u00016A~1HJ6_~$O;g\u0000(c";
        objectArray[13] = Boolean.TYPE;
        eL.m[13] = "java/lang/Boolean";
        objectArray[14] = Void.TYPE;
        eL.m[14] = "java/lang/Void";
        objectArray[15] = "I\u001aP}>U_\u001aU'-BHQV!!VY\u0016A6j@a";
        objectArray[16] = "^I7xICUF&7*N@K)\\\u001fLQX5p\bA";
        objectArray[17] = "G#T_HKQ#Q\u0005[\\FhR\u0003WHW/E\u0014\u001cX\u001b";
        objectArray[18] = ";\u001dTP\t%N=__\u0018j/3TT\u001c0[";
        objectArray[19] = "z\u001d6=\bhz\u001d!a\u0004g`V!\u007f\u0004rg'p'V";
        objectArray[20] = "Q\u001c=ur4Z\u0013,:\u0013:Q\u0018(`";
        objectArray[21] = "qR}\u00129@yCf{gH~\\l,0\u0019(\u0002\u0000B8Jp_gG0Dq";
        objectArray[22] = "Bgnax{Ky1\"\u0016g\u0016|?|zUK;e#\u00168J|2{o2\u0018g3\u001b-i\u0019df -z\u0004<_";
        objectArray[23] = "5g\u0011\u0016x\u0000szPU\u0015\u0011\u000e!\u0011\u0019y\u001carJXk{";
        objectArray[24] = "Jl~]0m\u001bv~QL}\u0016k%P\u001b*H<}<qb\u001cw~\u0000w#\u0016{";
        objectArray[25] = "@/m\u007f]\u0004\u00115ms!\u0014\u001c(6rvCCum\u001e\u0018\u001dL?<g\u0011\u0003\u0013|";
        objectArray[26] = "/KoC\u001b\u0017o\u00158T!\u0016|Xa_M$.\u00159\t!L!_pUZJ(B18";
        objectArray[27] = "gG;\u0012*Na\u00061\u001e\u0015\u00177J0\u0004y%a\bl^(reDh\fuJ8Lj\u001b\u0015";
        objectArray[28] = "sD%\\\u000f<u\u0005/P0e#I.J\\Wp\rq\u001c0>![5\u0017T~\u007f\f\"-";
        objectArray[29] = "\nQO!\u00163\f\u0010E-)jZ\\D7EX\t\u0018\u0018o)1XN_jMq\u0006\u0019HP";
        objectArray[30] = "akU1\u000b\u000bk9N0k\u00176&I;\u0007%gk\u0017g[rk;U'\u0011\f0!B>kHj&D<\u0012B8=E\\";
        objectArray[31] = "\u001ahz6XR\u001a{gna\fL\u007fx5\r>\u001d>$m]i\u0010hhhX\u0007E>eba";
        objectArray[32] = "\u0018OB\\5\u0001\u0012\u001dY]U\u001dO\u0002^V9/\u001bF\u0006\u000eix\u0018OB\\5\u0001\u0012\u001dY]U";
        objectArray[33] = "#>#\u001coxr$#\u0010\u0013h\u007f9x\u0011D? e$}qlc=,\u0014y}x";
        objectArray[34] = "O.nL8<J&`M_>\u001bcmH3\fL$1\u001ff[Gt}\u0015f5\u0012\"p\u001f_j\u0006|i\u001ef5Fft/";
        objectArray[35] = "U.(\u0015\\t]ui\u001f9-<\"qCF;]/j\u0010KDV/&\fF%[4u\u00019";
        Object[] objectArray2 = objectArray;
        objectArray[36] = "\u001b5A\u001b)e\u0001q\u0016GQ4q#ONn`\u000e(UKl^\u001d(\u0012G2gN!REQ";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eL.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'S' || c == 'M' || c == '\u00eb' || c == 'm') {
                field = eL.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eL.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(bG bG2) {
        long l;
        block36: {
            block38: {
                block37: {
                    eL eL2;
                    Object object;
                    block35: {
                        CallSite callSite;
                        block33: {
                            Object object2;
                            block34: {
                                Object object3;
                                block31: {
                                    block32: {
                                        long l2;
                                        block30: {
                                            Object object4;
                                            block29: {
                                                int n;
                                                block28: {
                                                    block27: {
                                                        block26: {
                                                            l = k ^ 0x46B4C795CF2BL;
                                                            l2 = l ^ 0x2317972241EEL;
                                                            callSite = eL.b("p", (long)-8100117728714575995L, (long)l);
                                                            try {
                                                                try {
                                                                    n = eL.b("\u00c9", (Object)eL.b("\u00c9", (Object)eL.b("S", (Object)b, (long)-8100483484934196542L, (long)l), (long)-8100794136842036452L, (long)l), (long)-8100324504110231010L, (long)l) instanceof class_1747;
                                                                    if (callSite != null) break block26;
                                                                    if (n != 0) break block27;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                                }
                                                                n = eL.b("\u00c9", (Object)eL.b("\u00c9", (Object)eL.b("S", (Object)b, (long)-8100483484934196542L, (long)l), (long)-8100743470421478187L, (long)l), (long)-8100324504110231010L, (long)l) instanceof class_1747;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            if (callSite != null) break block28;
                                                            if (n != 0) break block27;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                        }
                                                        n = 1;
                                                        break block28;
                                                    }
                                                    n = 0;
                                                }
                                                object2 = n;
                                                try {
                                                    reference cfr_temp_0 = eL.b("\u00c9", (Object)eL.b("S", (Object)b, (long)-8100483484934196542L, (long)l), (long)-8100419332654212839L, (long)l) - 70.0f;
                                                    object4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                    if (callSite != null) break block29;
                                                    if (object4 >= 0) break block30;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                }
                                                object4 = 1;
                                            }
                                            object2 = object4;
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l2;
                                        CallSite callSite2 = eL.b("\u00c9", (Object)eL.b("p", (Object)eL.b("p", (Object)objectArray, (long)-8099085349482677516L, (long)l), (long)-8100596764605973266L, (long)l), (long)-8098765675485330246L, (long)l);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            object3 = eL.b("\u00c9", (Object)eL.b("\u00c9", (Object)eL.b("S", (Object)b, (long)-8100511792852560023L, (long)l), (Object)callSite2, (long)-8100006139514004093L, (long)l), (long)-8100703226653559966L, (long)l);
                                                            if (callSite != null) break block31;
                                                            if (object3 == false) break block32;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                        }
                                                        object3 = eL.b("\u00c9", (Object)eL.b("\u00c9", (Object)eL.b("S", (Object)b, (long)-8100511792852560023L, (long)l), (Object)eL.b("\u00c9", (Object)callSite2, (long)-8098765675485330246L, (long)l), (long)-8100006139514004093L, (long)l), (long)-8100703226653559966L, (long)l);
                                                        if (callSite != null) break block31;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                    }
                                                    if (object3 == false) break block32;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                                }
                                                object = eL.b("\u00c9", (Object)eL.b("\u00c9", (Object)eL.b("S", (Object)b, (long)-8100511792852560023L, (long)l), (Object)eL.b("\u00c9", (Object)eL.b("\u00c9", (Object)callSite2, (long)-8098765675485330246L, (long)l), (long)-8098765675485330246L, (long)l), (long)-8100006139514004093L, (long)l), (long)-8100703226653559966L, (long)l);
                                                if (callSite != null) break block33;
                                            }
                                            catch (MatchException matchException) {
                                                throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                            }
                                            if (object != 0) break block34;
                                        }
                                        catch (MatchException matchException) {
                                            throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                        }
                                    }
                                    object3 = 1;
                                }
                                object2 = object3;
                            }
                            object = object2;
                        }
                        try {
                            try {
                                try {
                                    if (callSite != null) break block35;
                                    if (object == 0) break block36;
                                }
                                catch (MatchException matchException) {
                                    throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                                }
                                eL2 = this;
                                if (callSite != null) break block37;
                            }
                            catch (MatchException matchException) {
                                throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                            }
                            object = eL2.i;
                        }
                        catch (MatchException matchException) {
                            throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                        }
                    }
                    try {
                        if (object == 0) break block38;
                        eL.b("\u00c9", (Object)eL.b("S", (Object)eL.b("S", (Object)b, (long)-8098860045740041586L, (long)l), (long)-8100249346917445298L, (long)l), (boolean)false, (long)-8098632121926288014L, (long)l);
                        eL2 = this;
                    }
                    catch (MatchException matchException) {
                        throw eL.b("p", (Object)matchException, (long)-8098719626324618683L, (long)l);
                    }
                }
                eL2.i = 0;
            }
            return;
        }
        eL.b("\u00c9", (Object)eL.b("S", (Object)eL.b("S", (Object)b, (long)-8098860045740041586L, (long)l), (long)-8100249346917445298L, (long)l), (boolean)true, (long)-8098632121926288014L, (long)l);
        this.i = 1;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = eL.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 49;
            case 1 -> 54;
            case 2 -> 43;
            case 3 -> 17;
            case 4 -> 44;
            case 5 -> 55;
            case 6 -> 26;
            case 7 -> 30;
            case 8 -> 42;
            case 9 -> 58;
            case 10 -> 62;
            case 11 -> 57;
            case 12 -> 11;
            case 13 -> 20;
            case 14 -> 0;
            case 15 -> 33;
            case 16 -> 4;
            case 17 -> 34;
            case 18 -> 31;
            case 19 -> 52;
            case 20 -> 47;
            case 21 -> 24;
            case 22 -> 15;
            case 23 -> 7;
            case 24 -> 13;
            case 25 -> 32;
            case 26 -> 60;
            case 27 -> 38;
            case 28 -> 25;
            case 29 -> 53;
            case 30 -> 8;
            case 31 -> 22;
            case 32 -> 9;
            case 33 -> 37;
            case 34 -> 27;
            case 35 -> 39;
            case 36 -> 29;
            case 37 -> 18;
            case 38 -> 1;
            case 39 -> 50;
            case 40 -> 61;
            case 41 -> 23;
            case 42 -> 14;
            case 43 -> 3;
            case 44 -> 46;
            case 45 -> 6;
            case 46 -> 59;
            case 47 -> 21;
            case 48 -> 48;
            case 49 -> 5;
            case 50 -> 36;
            case 51 -> 16;
            case 52 -> 35;
            case 53 -> 56;
            case 54 -> 10;
            case 55 -> 2;
            case 56 -> 28;
            case 57 -> 51;
            case 58 -> 40;
            case 59 -> 19;
            case 60 -> 12;
            case 61 -> 45;
            case 62 -> 63;
            default -> 41;
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
        eL.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eL.m(l, l2);
        Object object = eL.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eL.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eL.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eL.g(clazz3, string2, clazz2)) != null) {
                    eL.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eL.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eL.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eL.n(1428517379113988L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eL.m(l, l2);
        Object object = eL.l[n];
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
                clazz3 = eL.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eL.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eL.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eL.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eL.n(1428517379113988L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eL.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eL.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eL.n(1428517379113988L, 0L);
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
            return MethodHandles.lookup().findStatic(eL.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


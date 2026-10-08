/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.fh
 */
public class fh_0
extends dV {
    private dQ a;
    private static final long k = hc.a(2161000700463632396L, 3652591440005523847L, MethodHandles.lookup().lookupClass()).a(26573443331168L);
    private static final Object[] l = new Object[40];
    private static final String[] m = new String[40];

    static {
        fh_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fh_0.m(l, l2);
            object = fh_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fh_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fh_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fh_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fh_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fh_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\n\u001ez\u001d49\n\u001emA86\u0010Um_8#\u0017$9\u0007o";
        objectArray[1] = Boolean.TYPE;
        fh_0.m[1] = "java/lang/Boolean";
        objectArray[2] = "f?d\"\u001c)f?s~\u0010&|ts`\u00103{\u0005#=D";
        objectArray[3] = "zuu\ro\fzubQc\u0003`>bOc\u0016gO2\u00136";
        objectArray[4] = "8O#Xq^3@2\u0017\u0016F7\\4[3W";
        objectArray[5] = "w~tEr\u001aivn\n\u0015\u001bxmcP3\u001d";
        objectArray[6] = "\u001bYkiq\u000b\rYn3b\u001c\u001a\u0012m5n\b\u000bUz\"%\u001a7";
        objectArray[7] = "\u0010YnsEkeye|T$\u0018av{]mp";
        objectArray[8] = "\u0012Z\u0013H\b\u0001\u0012Z\u0004\u0014\u0004\u000e\b\u0011\u0004\n\u0004\u001b\u000f`QU]";
        objectArray[9] = "\u0005?\tx|y\u0005?\u001e$pv\u001ft\u001e:pc\u0018\u0005Ld('";
        objectArray[10] = "P\u0013AF%9P\u0013V\u001a)6JXV\u0004)#M)\u0007[p";
        objectArray[11] = "\u0011\u0016kVP\u0007\u0011\u0016|\n\\\b\u000b]|\u0014\\\u001d\f,,I\r";
        objectArray[12] = "\u007fT\u007f\n$8iTzP7/~\u001fyV;;oXnAp.s";
        objectArray[13] = "s=N8k!x2_w\b,m?P\u001c=.|,L0*#";
        objectArray[14] = Double.TYPE;
        fh_0.m[14] = "java/lang/Double";
        objectArray[15] = ">y\f\u001d0-(y\tG#:?2\nA/..u\u001dVd9\u000b";
        objectArray[16] = "G785*V2\u00173:;\u0019S\u001981?C'";
        objectArray[17] = Float.TYPE;
        fh_0.m[17] = "java/lang/Float";
        objectArray[18] = "*\t\u000e;\u0005\u0001<\t\u000ba\u0016\u0016+B\bg\u001a\u0002:\u0005\u001fpQ\u0012;";
        objectArray[19] = ".wKQ\u0005\b[W@^\u0014G:YKU\u0010\u001dN";
        objectArray[20] = Void.TYPE;
        fh_0.m[20] = "java/lang/Void";
        objectArray[21] = "b\u0014N^N\u0018i\u001b_\u0011/\u0016b\u0010[K";
        objectArray[22] = "\u001dt7/!<J({@(l]rl,\u001a<\u001e+6@tkCql9,:By\u000b";
        objectArray[23] = "B;'cx[\u001e'l=\u001b\u0005\u001a(9iLRK~g\u0005!\u0006\u001951{w\u000e\u0005#";
        objectArray[24] = "\u0015.$>x4\u0010\u007fv8\u0016dR|2)jbT\u0011s:(iCww;jb.";
        objectArray[25] = "@#_&\b\u0016Lz\u001d0vF|\u007f\u0016#F\u0012\u0002-\u0016{\u0010,";
        objectArray[26] = "+8(4'\u001f|!,x\u001c@{>(#pr,zx}&%(##\u007f|\u0014\u007fx\"4\u001c\u001a{~p;sAr?:D'\u001az<&u\"K(:H";
        objectArray[27] = "aHBw\u0015[4\u001f\u0001+r\t0\u001f\u0019*%^nHAFN\u0001m\u001d\u0011{\u0019]!";
        objectArray[28] = "L)<F\u0002:\u0019~\u007f\u001aeh\u001d~g\u001b2?B#<wX|\u001cc8M\u000fe\u0018/";
        objectArray[29] = "n\u001e\u0000Eti8\u0016\u001cS\u0018r9\u000f\u0002Rt@mOY\t\u0018.>\u0011\u0001Ravo\u0010\t5";
        objectArray[30] = "}M~\n0\u000fuW:\u000f@\u001dM\u0018.N}\r*\u0012#\u000f?t|C=\n9\u0013vN|H@";
        objectArray[31] = "\u000f,\u0012?gST%Su\u0018Y]=N`tk\ty\u00166\u0018U[xVyvQ]zT\u0007qW\t9PiuQ\u000b;.ns\u0005H?@ju\u0007JA\u0011j$\u0004O.JceN0";
        objectArray[32] = "A\u0006~o\u0003\u000fE\u0007<dn\t\u0013\u0007\u0006n\u001e\u0015zE*a\r\u000e\u0003\u001d{`\u0005i";
        objectArray[33] = "l&\u0019$\u000br7/Xntx>7E{\u0018Jb{\u0014\u001c\u001dvj3[r\u0019ph1%u\u001f$+5Kq\u0019&)KLwMe-%HqOgStH Lb</Aa\u0006\u001d";
        objectArray[34] = "\b+xpvbT73.\u0015<P8fzBk\u0000m9\u0016/?S%nhy7O3";
        objectArray[35] = "1\u0006B,-Li\u001b\u001abR\\X\u0014\u001f\")_'H\u001e\u007fc23\u0015@t9\u00022H\byR";
        objectArray[36] = "j1>x\u0000%=mr\u0017\tu*7e{;\"jg8'l!<5ap\u0015ym4i\u0017";
        objectArray[37] = "*&{A\"\u0014\u007fq8\u001dEF{q \u001c\u0012\u0011$-|p|V`z'@ J+$";
        objectArray[38] = "\rwt6^_Wn)h3Hf\u007ft<HL\u0019#ua\u0002!\u000by-kUC\u0007yhq3";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "\u0006HGI(KQ\u0014\u000b&!\u001bFN\u001cJ\u0013K\n\u0014J&{\u001b\u0006\u0016\u0004I \u0012G\\{";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fh_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f1' || c == '$' || c == '\u00e3' || c == '\u00c9') {
                field = fh_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fh_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        block25: {
            long l;
            long l2;
            block26: {
                class_310 class_3102;
                CallSite callSite;
                long l3;
                block24: {
                    block27: {
                        block23: {
                            CallSite callSite2;
                            block22: {
                                block20: {
                                    block21: {
                                        block19: {
                                            block18: {
                                                long l4 = l2 = k ^ 0xE1AA9F43FEEL;
                                                l3 = l4 ^ 0x42887D8B0327L;
                                                l = l4 ^ 0x38467F380EFCL;
                                                callSite = fh_0.b("\u00d1", (long)188028908015753035L, (long)l2);
                                                try {
                                                    try {
                                                        callSite2 = fh_0.b("S", (Object)fh_0.b("\u00f1", (Object)b, (long)188199551311156871L, (long)l2), (long)185594829998882224L, (long)l2);
                                                        if (callSite != null) break block18;
                                                        if (callSite2 == false) break block19;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                                                    }
                                                    callSite2 = fh_0.b("S", (Object)fh_0.b("\u00f1", (Object)fh_0.b("\u00f1", (Object)b, (long)185513482357226332L, (long)l2), (long)185439518384214267L, (long)l2), (long)188354035366700864L, (long)l2);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                                                }
                                            }
                                            try {
                                                if (callSite != null) break block20;
                                                if (callSite2 == false) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                                            }
                                        }
                                        return;
                                    }
                                    callSite2 = fh_0.b("S", (Object)fh_0.b("\u00f1", (Object)b, (long)188199551311156871L, (long)l2), (long)189142489627586992L, (long)l2);
                                }
                                try {
                                    try {
                                        try {
                                            if (callSite != null) break block22;
                                            if (callSite2 != false) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                                        }
                                        class_3102 = b;
                                        if (callSite != null) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                                    }
                                    callSite2 = fh_0.b("S", (Object)fh_0.b("\u00f1", (Object)fh_0.b("\u00f1", (Object)class_3102, (long)185513482357226332L, (long)l2), (long)189035753075222146L, (long)l2), (long)188354035366700864L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                                }
                            }
                            if (callSite2 == false) break block27;
                        }
                        return;
                    }
                    class_3102 = b;
                }
                CallSite callSite3 = fh_0.b("S", (Object)fh_0.b("\u00f1", (Object)class_3102, (long)188199551311156871L, (long)l2), (long)185668479652065801L, (long)l2);
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l3;
                CallSite callSite4 = fh_0.b("S", (Object)fh_0.b("S", (Object)callSite3, (double)0.0, (double)-0.5, (double)0.0, (long)185242632152991026L, (long)l2), (double)((double)(-fh_0.b("S", (Object)this.a, (Object)objectArray, (long)185362537202798179L, (long)l2)) / 100.0), (double)0.0, (double)((double)(-fh_0.b("S", (Object)this.a, (Object)objectArray2, (long)185362537202798179L, (long)l2)) / 100.0), (long)188477736605895342L, (long)l2);
                try {
                    try {
                        if (callSite != null) break block25;
                        if (fh_0.b("S", (Object)fh_0.b("S", (Object)fh_0.b("S", (Object)fh_0.b("\u00f1", (Object)b, (long)188427355326724493L, (long)l2), (Object)fh_0.b("\u00f1", (Object)b, (long)188199551311156871L, (long)l2), (Object)callSite4, (long)188289695842065484L, (long)l2), (long)188104270889883523L, (long)l2), (long)185283746163443091L, (long)l2) == false) break block26;
                    }
                    catch (MatchException matchException) {
                        throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw fh_0.b("\u00d1", (Object)matchException, (long)188576141434271493L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            fh_0.b("\u00d1", (Object)objectArray, (long)185767162065743056L, (long)l2);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fh_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 12;
            case 2 -> 25;
            case 3 -> 2;
            case 4 -> 17;
            case 5 -> 16;
            case 6 -> 4;
            case 7 -> 26;
            case 8 -> 62;
            case 9 -> 5;
            case 10 -> 47;
            case 11 -> 9;
            case 12 -> 6;
            case 13 -> 13;
            case 14 -> 3;
            case 15 -> 56;
            case 16 -> 45;
            case 17 -> 49;
            case 18 -> 42;
            case 19 -> 50;
            case 20 -> 38;
            case 21 -> 54;
            case 22 -> 61;
            case 23 -> 19;
            case 24 -> 55;
            case 25 -> 32;
            case 26 -> 59;
            case 27 -> 14;
            case 28 -> 22;
            case 29 -> 29;
            case 30 -> 58;
            case 31 -> 18;
            case 32 -> 31;
            case 33 -> 44;
            case 34 -> 48;
            case 35 -> 10;
            case 36 -> 7;
            case 37 -> 36;
            case 38 -> 8;
            case 39 -> 39;
            case 40 -> 57;
            case 41 -> 11;
            case 42 -> 27;
            case 43 -> 52;
            case 44 -> 41;
            case 45 -> 35;
            case 46 -> 33;
            case 47 -> 15;
            case 48 -> 60;
            case 49 -> 37;
            case 50 -> 63;
            case 51 -> 1;
            case 52 -> 34;
            case 53 -> 53;
            case 54 -> 0;
            case 55 -> 46;
            case 56 -> 21;
            case 57 -> 43;
            case 58 -> 20;
            case 59 -> 24;
            case 60 -> 23;
            case 61 -> 30;
            case 62 -> 28;
            default -> 51;
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
        fh_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fh_0.m(l, l2);
        Object object = fh_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fh_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fh_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fh_0.g(clazz3, string2, clazz2)) != null) {
                    fh_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fh_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fh_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fh_0.n(1479574034253473L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fh_0.m(l, l2);
        Object object = fh_0.l[n];
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
                clazz3 = fh_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fh_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fh_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fh_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fh_0.n(1479574034253473L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fh_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fh_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fh_0.n(1479574034253473L, 0L);
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
            return MethodHandles.lookup().findStatic(fh_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2791
 *  net.minecraft.class_631
 *  net.minecraft.class_631$class_3681
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.D;
import dev.zprestige.prestige.E;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.minecraft.class_2791;
import net.minecraft.class_631;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.as
 */
public class as_0
implements Iterator,
cz_0 {
    private final E a;
    private final boolean c;
    private int d;
    private class_2791 e;
    private static final long f = hc.a(-7720038119500491813L, -8902389126082160562L, MethodHandles.lookup().lookupClass()).a(65420479910980L);
    private static final Object[] g = new Object[36];
    private static final String[] h = new String[36];

    public as_0(boolean bl, long l) {
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x6BFB1D2D679CL;
        long l4 = l2 ^ 0x60B10988F0C7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        this.a = new E((class_631.class_3681)as_0.a("\u00f6", (Object)new D((class_631)as_0.a("\u00f6", (Object)as_0.a("d", (Object)b, (long)8731666619727991839L, (long)l), (long)8731634274187763205L, (long)l)), (Object)objectArray, (long)8729036365076705934L, (long)l));
        this.d = 0;
        this.c = bl;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        as_0.a("\u00f6", (Object)this, (Object)objectArray2, (long)8728953496671294967L, (long)l);
    }

    static {
        as_0.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n3] != null) {
            return n3;
        }
        Object object = g[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 58;
            case 1 -> 35;
            case 2 -> 33;
            case 3 -> 34;
            case 4 -> 48;
            case 5 -> 19;
            case 6 -> 20;
            case 7 -> 22;
            case 8 -> 60;
            case 9 -> 2;
            case 10 -> 62;
            case 11 -> 25;
            case 12 -> 16;
            case 13 -> 49;
            case 14 -> 17;
            case 15 -> 36;
            case 16 -> 57;
            case 17 -> 18;
            case 18 -> 59;
            case 19 -> 55;
            case 20 -> 52;
            case 21 -> 56;
            case 22 -> 45;
            case 23 -> 10;
            case 24 -> 14;
            case 25 -> 29;
            case 26 -> 53;
            case 27 -> 31;
            case 28 -> 54;
            case 29 -> 3;
            case 30 -> 8;
            case 31 -> 43;
            case 32 -> 32;
            case 33 -> 39;
            case 34 -> 42;
            case 35 -> 27;
            case 36 -> 9;
            case 37 -> 5;
            case 38 -> 61;
            case 39 -> 46;
            case 40 -> 1;
            case 41 -> 12;
            case 42 -> 50;
            case 43 -> 41;
            case 44 -> 40;
            case 45 -> 6;
            case 46 -> 0;
            case 47 -> 63;
            case 48 -> 15;
            case 49 -> 11;
            case 50 -> 24;
            case 51 -> 21;
            case 52 -> 38;
            case 53 -> 23;
            case 54 -> 30;
            case 55 -> 26;
            case 56 -> 13;
            case 57 -> 47;
            case 58 -> 7;
            case 59 -> 4;
            case 60 -> 44;
            case 61 -> 51;
            case 62 -> 28;
            default -> 37;
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
        as_0.h[n3] = new String(cArray);
        return n3;
    }

    @Override
    public boolean hasNext() {
        boolean bl;
        try {
            bl = this.e != null;
        }
        catch (MatchException matchException) {
            throw as_0.a(matchException);
        }
        return bl;
    }

    public Object next() {
        long l = f ^ 0x6DE1A5B44C15L;
        long l2 = l ^ 0x4D18A9F8706CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return as_0.a("\u00f6", (Object)this, (Object)objectArray, (long)-1215297936083330342L, (long)l);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = as_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'd' || c == 'r' || c == '\u00d6' || c == '\u00ba') {
                field = as_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = as_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public class_2791 b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = f ^ l) ^ 0x379C676F22CEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return as_0.a("\u00f6", (Object)this, (Object)objectArray2, (long)4355302526136701093L, (long)l);
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
        int n = as_0.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = as_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = as_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = as_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        as_0.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = as_0.f(599015012584241L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = as_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        as_0.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = as_0.f(599015012584241L, 0L);
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
            int n = as_0.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                as_0.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = as_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = as_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = as_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = as_0.d(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/as" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_2791 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x53F20D752307L;
        long l4 = l2 ^ 0x64A623A1F815L;
        class_2791 class_27912 = this.e;
        this.e = null;
        CallSite callSite = as_0.a("\u00e3", (long)-4791011956495975741L, (long)l);
        while (true) {
            Object object;
            block8: {
                as_0 as_02;
                block7: {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    if (this.d >= as_0.a("\u00f6", (Object)as_0.a("\u00f6", (Object)this.a, (Object)objectArray2, (long)-4791468813622433195L, (long)l), (long)-4791403559506969794L, (long)l)) return class_27912;
                    try {
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l3;
                        this.e = (class_2791)as_0.a("\u00f6", (Object)as_0.a("\u00f6", (Object)this.a, (Object)objectArray3, (long)-4791468813622433195L, (long)l), (int)this.d++, (long)-4791093186955016673L, (long)l);
                        as_02 = this;
                        if (callSite != null) break block7;
                        if (as_02.e == null) continue;
                    }
                    catch (MatchException matchException) {
                        throw as_0.a("\u00e3", (Object)matchException, (long)-4791754289609824398L, (long)l);
                    }
                    as_02 = this;
                }
                try {
                    try {
                        object = as_02.c;
                        if (callSite != null) break block8;
                        if (!object) return class_27912;
                    }
                    catch (MatchException matchException) {
                        throw as_0.a("\u00e3", (Object)matchException, (long)-4791754289609824398L, (long)l);
                    }
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l4;
                    objectArray4[0] = this.e;
                    object = as_0.a("\u00f6", (Object)this, (Object)objectArray4, (long)-4791321262777179387L, (long)l);
                }
                catch (MatchException matchException) {
                    throw as_0.a("\u00e3", (Object)matchException, (long)-4791754289609824398L, (long)l);
                }
            }
            if (object) return class_27912;
        }
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block18: {
            block15: {
                CallSite callSite;
                long l;
                block17: {
                    CallSite callSite2;
                    CallSite callSite3;
                    block16: {
                        block14: {
                            class_2791 class_27912 = (class_2791)objectArray[0];
                            l = (Long)objectArray[1];
                            l = f ^ l;
                            callSite3 = as_0.a("d", (Object)as_0.a("\u00f6", (Object)class_27912, (long)-1826913181135571462L, (long)l), (long)-1825477898454948800L, (long)l);
                            callSite2 = as_0.a("d", (Object)as_0.a("\u00f6", (Object)class_27912, (long)-1826913181135571462L, (long)l), (long)-1826435035662147764L, (long)l);
                            callSite = as_0.a("\u00e3", (long)-1826240159839084058L, (long)l);
                            try {
                                try {
                                    object = as_0.a("\u00f6", (Object)as_0.a("\u00f6", (Object)as_0.a("d", (Object)b, (long)-1827313721772782698L, (long)l), (long)-1826789911679024756L, (long)l), (int)(callSite3 + 1), (int)callSite2, (long)-1825608823325275449L, (long)l);
                                    if (callSite != null) break block14;
                                    if (object == false) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                                }
                                object = as_0.a("\u00f6", (Object)as_0.a("\u00f6", (Object)as_0.a("d", (Object)b, (long)-1827313721772782698L, (long)l), (long)-1826789911679024756L, (long)l), (int)(callSite3 - 1), (int)callSite2, (long)-1825608823325275449L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite != null) break block16;
                                if (object == false) break block15;
                            }
                            catch (MatchException matchException) {
                                throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                            }
                            object = as_0.a("\u00f6", (Object)as_0.a("\u00f6", (Object)as_0.a("d", (Object)b, (long)-1827313721772782698L, (long)l), (long)-1826789911679024756L, (long)l), (int)callSite3, (int)(callSite2 + 1), (long)-1825608823325275449L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block17;
                            if (object == false) break block15;
                        }
                        catch (MatchException matchException) {
                            throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                        }
                        object = as_0.a("\u00f6", (Object)as_0.a("\u00f6", (Object)as_0.a("d", (Object)b, (long)-1827313721772782698L, (long)l), (long)-1826789911679024756L, (long)l), (int)callSite3, (int)(callSite2 - 1), (long)-1825608823325275449L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block18;
                    if (object == false) break block15;
                }
                catch (MatchException matchException) {
                    throw as_0.a("\u00e3", (Object)matchException, (long)-1826974226350900137L, (long)l);
                }
                object = 1;
                break block18;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u0014\u0012$\u0010\n\u0010\u0002\u0012!J\u0019\u0007\u0015Y\"L\u0015\u0013\u0004\u001e5[^\u0001\u0003";
        objectArray[1] = "_r\u001c\to\\*R\u0017\u0006~\u0013K\\\u001c\rzI?";
        objectArray[2] = "\u0010'/y\u0005 \u0010'8%\t/\nl8;\t:\r\u001di`Qx";
        objectArray[3] = "Q$!^{H$\u0004*Qj\u0007E\n!Zn]1";
        objectArray[4] = "\u0014Ur\u001f\tt\u0002UwE\u001ac\u0015\u001etC\u0016w\u0004YcT]e8";
        objectArray[5] = "g<x.\u0002\u007f\u0012\u001cs!\u00130o\u0004`&\u001ay\u0007";
        objectArray[6] = "U*D\u000f\u007fqK\"^@2kQ(G\u001c#aQ?\u001c\u000f%kR\"Q@\u0010pP&[\r\u0003aY.@\u000b?gZ\n@\u001c0}";
        objectArray[7] = Integer.TYPE;
        as_0.h[7] = "java/lang/Integer";
        objectArray[8] = "7uZ\ft\u0019<zKC\u0015\u00177qO\u0019";
        objectArray[9] = "\u0015\u0011Xbj\u0011\u0003\u0011]8y\u0006\u0014Z^>u\u0012\u0005\u001dI)>$";
        objectArray[10] = "ZlZ\u0001s\u0010/LQ\u000eb_NBZ\u0005f\u0005:";
        objectArray[11] = "/O*yrlZo!vc#;a*}gyO";
        objectArray[12] = Boolean.TYPE;
        as_0.h[12] = "java/lang/Boolean";
        objectArray[13] = "K%Ek{o@*T$\u0018bU'[O-`D4Gc:m";
        objectArray[14] = "0pf\u0003}|0pq_qs*;qAqf-J#\u0014\"&";
        objectArray[15] = "Y<\u000e\u0004/@Y<\u0019X#OCw\u0019F#ZD\u0006I\u001br";
        objectArray[16] = "\u0018A5cU\u001c\u0018A\"?Y\u0013\u0002\n\"!Y\u0006\u0005{w~\u0000";
        objectArray[17] = "W;o\u0007ZKW;x[VDMpxEVQJ\u0001-\u001a\u0006";
        objectArray[18] = ",vBu\u001dN:vG/\u000eY-=D)\u0002M<zS>Iz";
        objectArray[19] = "Ks\u001f@G7>S\u0014OVx_]\u001fDR\"+";
        objectArray[20] = "q@r\u0012s\u0005q@eN\u007f\nk\u000beP\u007f\u001flz0\u000f/H|IgOm3,\u0013>\r";
        objectArray[21] = ">y\u000e>\u000e\r<*\u0017n2S6.\u00178e\fnsKT\u000eM8#C$L^>r";
        objectArray[22] = "X\u0004C\u0010>\u0006\u0002\tH\u0019\u0001]c\u0003B\u0019xZ\u0004T\u0006Bk7";
        objectArray[23] = "\u0013\u0016)&\u00038T\u0013\u007f.blB\u0003\u0013{\u0012lOOc9\u0001j\u001e\u007f.8\bqWC\u007f<\u001e\u007f/";
        objectArray[24] = "\u0019\b}L\tBA\u00120Dv@'\u0005$_\r[[QsH\u0017)\u001b\u0000xT\u0017\u0012\\\u0005.\\v";
        objectArray[25] = "\u0014s[ByK\u0002lZSD@\u001cc^D\u0013\u0017C>\u0005(.J\u0003r]W?L\fb";
        objectArray[26] = "Mo\u0006H'l\u0016f\r!tR\u001ac\u0017Zo.N4\u0000@\u001db\u0010<\u0000Xq#\u001f;\u001e!";
        objectArray[27] = "R:S'\u0001'\u0015?\u0005/`x\u00035\u0006:\u0000\u001cR#\u0006&Pl\u00100\u0000w`";
        objectArray[28] = "i(\\D\u0016R2!W-Elc}EVU\u0016-?K\u0016,]m \\TV\u0013/.\u001c-";
        objectArray[29] = "\u0003\u007f(\u0003oGXv#j?yTs9\u0011'\u0005\u0000$.\u000bU@\\lo\u0003<G@(:j";
        objectArray[30] = "2h\n4Ay#n\u0005$&c5p\u0014/JQb=Ou&mbjL!]|*rOH";
        objectArray[31] = "a&V>\u001bMf:\u0012krA5>Oe\u001esax\u0017:N$1xRhN\u00143+K8r";
        objectArray[32] = "YvOC\u0004\u000f\u0002\u007fD*W1\u000ez^QLMZ-IK>\b\u0006e\bCW\u000f\u001a!]*";
        objectArray[33] = "a[1dEBp\u0013)g,\\g\u001d7;@n3[nf\u001796\u00118<\u001cIt\u0002>m,\u0005z\u000e7l\\Gi\bf\\\u001c_3\u001c.0]P4\u0002W";
        objectArray[34] = "z&\r,oAn!\u001a\"\u001fD\u00116\u0000/d_mbW8~-}$\u0017?gB~b\u001a$\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[35] = " QRvJc\"\u0002K&v=(\u0006Kp!bp[\u0016\u001cJ#&\u000b\u001fl\b0 Z";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = as_0.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = as_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = as_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = as_0.c(clazz3, string2, clazz2)) != null) {
                    as_0.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = as_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        as_0.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = as_0.f(599015012584241L, 0L);
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
            return MethodHandles.lookup().findStatic(as_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


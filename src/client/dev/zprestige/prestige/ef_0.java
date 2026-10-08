/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dO;
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
import net.minecraft.class_1657;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.ef
 */
public class ef_0
extends dV {
    private dO a;
    private static final long k = hc.a(-2871804431298907272L, 3041192154089650780L, MethodHandles.lookup().lookupClass()).a(199098065247078L);
    private static final Object[] l = new Object[40];
    private static final String[] m = new String[40];

    static {
        ef_0.f();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x65CF745BEBL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        ef_0.b("\u00c3", (Object)objectArray2, (long)3991164728688140461L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ef" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ef_0.m(l, l2);
            object = ef_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                ef_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ef_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ef_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ef_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ef_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u000e@8S6J\u000e@/\u000f:E\u0014\u000b/\u0011:P\u0013z{Im";
        objectArray[1] = Boolean.TYPE;
        ef_0.m[1] = "java/lang/Boolean";
        objectArray[2] = "'\u001alAke1\u001ai\u001bxr&Qj\u001dtf7\u0016}\n?t\u000b";
        objectArray[3] = "e\u001d!|}:\u0010=*slum%9te<\u0005";
        objectArray[4] = "\u0016\f\u0015\u001f\u0007^\u0016\f\u0002C\u000bQ\fG\u0002]\u000bD\u000b6R\u0000Z";
        objectArray[5] = " \u0011nT9m \u0011y\b5b:Zy\u00165w=++Hl6";
        objectArray[6] = "\u001d*Yj,0\u001d*N6 ?\u0007aN( *\u0000\u0010\u001cvxn";
        objectArray[7] = Integer.TYPE;
        ef_0.m[7] = "java/lang/Integer";
        objectArray[8] = "\u0015-;\u0002Ko\u0015-,^G`\u000ff,@Gu\b\u0017{\u001f\u0011";
        objectArray[9] = "V\u0001\u0011N3tH\t\u000b\u0001O`R\u0004\bB";
        objectArray[10] = Float.TYPE;
        ef_0.m[10] = "java/lang/Float";
        objectArray[11] = "94^YSQ/4[\u0003@F8\u007fX\u0005LR)8O\u0012\u0007E\u0016";
        objectArray[12] = "G~>ZDhLq/\u0015%fGz+O";
        objectArray[13] = "=\u00199\nsH6\u0016(E\u001bH8\u0019;";
        objectArray[14] = "^\"aHFsH\"d\u0012Ud_ig\u0014YpN.p\u0003\u0012`O";
        objectArray[15] = "awDi v\u0014WOf19uYDm5c\u0001";
        objectArray[16] = Void.TYPE;
        ef_0.m[16] = "java/lang/Void";
        objectArray[17] = "Gc!z\u007f;Qc$ l,F('&`8Wo01+.E";
        objectArray[18] = "\u001av\u0019&\u00069\u0011y\bie4\u0004t\u0007\u0002P6\u0015g\u001b.G;";
        objectArray[19] = "0tmCQJ.|w\f,Z.";
        objectArray[20] = "\u0011H&KH2dh-DY}\u0005f&O]'q";
        objectArray[21] = "\tN\u001fAv\u001fW\u0013\u001fz~\u001cDK\u0000\u0016LL\b\u0013Vzg\u0015U@\f\bf\r[+";
        objectArray[22] = "a=7!\u0000p9f%?a|Xf;8\u001f/9'l;\u0005\u0016";
        objectArray[23] = "F\u0013_z\u0001T\r\u0001M=zC\u001c\u0017Y,-\u0014B@\u0001@KH\u0005AP.\u0015\u0015\u0005";
        objectArray[24] = "_\r:\u0004L\t\u0001P:?D\n\u0012\b%SvYVX{?\u001a\u0003\u0003\u0003?\u0002BWSRB";
        objectArray[25] = "BLp:jT\u0010Yi$\u0011Ps]*%x@N\nc0z:\u0019]y?jZ\n\np`\u0011";
        objectArray[26] = "^}a=mj\u0006)1l\u00102\bel1|\u0000X$6g\u0010kT%v9/h[ciV";
        objectArray[27] = "Q:\u0014*O\u0013\u000fg\u0014\u0011L\u001c\r;\u0000F\u001cG[bl,\u0012\u001d\u001a9\u001e-[\u001e\u0006";
        objectArray[28] = "\u0000;T\u001a\u007f|^fT!w\u007fM>KME/\u000eo\u001d!nv\\5GSonR^";
        objectArray[29] = "NPzs\t\u0010\u0005Bh4r\u0007\u0014T|%%PJ\u0004%ILW\u000b^&4\u0000X\u0005X";
        objectArray[30] = "WX\u0010\u0012>\n\t\u0005\u0010)=\u0005\u000bY\u0004~m^[\u0001h\u0014c\u0004\u001c[\u001a\u0015*\u0007\u0000";
        objectArray[31] = "!8t|dF\u007f'jy\t^r(m\rm_v$\u0011}{Xn9(y3EnX";
        objectArray[32] = "\u0012\u00198\u0019!GLD8\")D_\u001c'N\u001b\u0017\u001bGq\"0MN\u0017+P1U@|";
        objectArray[33] = "\u0016\u0014\u0001\u0002T*HI\u00019\\)[\u0011\u001eUnz\u001eHD9E J\u001a\u0012KD8Dq";
        objectArray[34] = ">Dm\u0001=s`\u0019m:5psArV\u0007'3\u0011/\nPakL~Q\"`sB\u0015";
        objectArray[35] = "T\u0017\u001f\u0012K]T\u0018[_:Fd\u0018\u0007R\u0001D\u0000B\u0000\u001dC/";
        objectArray[36] = "^\rL:8\u001aC\\\u000bdBD\\3E`=\u0018YW\u001fgrZ2\u0003\u0011{yHVY\u00164;#^\rL:8\u001aC\\\u000bdB";
        objectArray[37] = ">?N\u0014$#w8BT\u001cvk2\u0016\u0010Bqk(\u0012l\"jo$\u001eU&\"r$\u007f";
        objectArray[38] = "UY\u001bnF:\u0007L\u0002p==dHAqT.Y\u001f\bdVT\u000eH\u0012kF4\u001d\u001f\u001b4=";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "1\u0004\u001bYt~b\b\b\u0000\u0011e[\u0012\u0002_(s8@\u000eZ`\f0\u0019Z^nob\u0015_\u0016\u0011";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ef_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == '\u00d6' || c == 'K' || c == '\u00f6') {
                field = ef_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ef_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(bG bG2) {
        block41: {
            Object object;
            long l;
            long l2;
            block43: {
                CallSite callSite;
                block42: {
                    block40: {
                        block38: {
                            block39: {
                                block34: {
                                    CallSite callSite2;
                                    block37: {
                                        CallSite callSite3;
                                        CallSite callSite4;
                                        block36: {
                                            block35: {
                                                class_310 class_3102;
                                                block33: {
                                                    l2 = k ^ 0x63B0F685F1DDL;
                                                    l = l2 ^ 0x3887334E80C3L;
                                                    callSite4 = ef_0.b("\u00f8", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8312719140637665827L, (long)l2);
                                                    callSite = ef_0.b("\u00c3", (long)-8313420402211243263L, (long)l2);
                                                    try {
                                                        try {
                                                            class_3102 = b;
                                                            if (callSite != null) break block33;
                                                            if (ef_0.b("z", (Object)class_3102, (long)-8313070962111772079L, (long)l2) != null) break block34;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                                        }
                                                        class_3102 = b;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        callSite3 = ef_0.b("\u00f8", (Object)ef_0.b("z", (Object)class_3102, (long)-8313466255826812182L, (long)l2), (long)-8309870301872637728L, (long)l2);
                                                        if (callSite != null) break block35;
                                                        if (callSite3 != false) break block34;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                                    }
                                                    callSite3 = ef_0.b("\u00f8", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8309920751412128139L, (long)l2);
                                                }
                                                catch (MatchException matchException) {
                                                    throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (callSite != null) break block36;
                                                    if (callSite3 != false) break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                                }
                                                callSite3 = ef_0.b("\u00f8", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8313002176319382266L, (long)l2);
                                            }
                                            catch (MatchException matchException) {
                                                throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                            }
                                        }
                                        try {
                                            try {
                                                if (callSite3 != false) break block34;
                                                callSite2 = callSite4;
                                                if (callSite != null) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                            }
                                            if (callSite2 == null) break block34;
                                        }
                                        catch (MatchException matchException) {
                                            throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                        }
                                        callSite2 = callSite4;
                                    }
                                    try {
                                        object = ef_0.b("\u00f8", (Object)callSite2, (long)-8312550905203158620L, (long)l2) instanceof class_1657;
                                        if (callSite != null) break block38;
                                        if (object != false) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                                    }
                                }
                                return;
                            }
                            object = ef_0.b("\u00f8", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8309767763686901632L, (long)l2);
                        }
                        try {
                            try {
                                if (callSite != null) break block40;
                                if (object == false) break block41;
                            }
                            catch (MatchException matchException) {
                                throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                            }
                            object = ef_0.b("z", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8312595212680664906L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block42;
                            if (object != ef_0.b("z", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8312828899978277450L, (long)l2)) break block41;
                        }
                        catch (MatchException matchException) {
                            throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                        }
                        object = ef_0.b("\u00f8", (Object)ef_0.b("z", (Object)b, (long)-8313466255826812182L, (long)l2), (long)-8313603436599187051L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block43;
                        if (object != false) break block41;
                    }
                    catch (MatchException matchException) {
                        throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                    }
                    reference cfr_temp_0 = ef_0.b("\u00f8", (Object)dn_0.a, (long)-8312933374757338136L, (long)l2) - ef_0.b("\u00f8", (Object)((Float)((Object)ef_0.b("\u00f8", (Object)this.a, (long)-8309795282264501612L, (long)l2))), (long)-8310220056661737424L, (long)l2) / 100.0f;
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
                }
            }
            try {
                if (object <= 0) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    ef_0.b("\u00c3", (Object)objectArray, (long)-8310017685263292581L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw ef_0.b("\u00c3", (Object)matchException, (long)-8310060288674168158L, (long)l2);
            }
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ef_0.b("\u00c3", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2447416037469443382L, (long)l);
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
        Object object = ef_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 37;
            case 1 -> 20;
            case 2 -> 9;
            case 3 -> 25;
            case 4 -> 1;
            case 5 -> 31;
            case 6 -> 54;
            case 7 -> 13;
            case 8 -> 53;
            case 9 -> 18;
            case 10 -> 36;
            case 11 -> 12;
            case 12 -> 11;
            case 13 -> 15;
            case 14 -> 0;
            case 15 -> 63;
            case 16 -> 62;
            case 17 -> 57;
            case 18 -> 19;
            case 19 -> 50;
            case 20 -> 22;
            case 21 -> 49;
            case 22 -> 8;
            case 23 -> 48;
            case 24 -> 58;
            case 25 -> 55;
            case 26 -> 5;
            case 27 -> 59;
            case 28 -> 33;
            case 29 -> 27;
            case 30 -> 4;
            case 31 -> 45;
            case 32 -> 17;
            case 33 -> 16;
            case 34 -> 41;
            case 35 -> 6;
            case 36 -> 28;
            case 37 -> 44;
            case 38 -> 35;
            case 39 -> 52;
            case 40 -> 34;
            case 41 -> 39;
            case 42 -> 21;
            case 43 -> 56;
            case 44 -> 7;
            case 45 -> 51;
            case 46 -> 23;
            case 47 -> 61;
            case 48 -> 46;
            case 49 -> 29;
            case 50 -> 40;
            case 51 -> 32;
            case 52 -> 60;
            case 53 -> 47;
            case 54 -> 38;
            case 55 -> 43;
            case 56 -> 42;
            case 57 -> 14;
            case 58 -> 24;
            case 59 -> 10;
            case 60 -> 26;
            case 61 -> 2;
            case 62 -> 30;
            default -> 3;
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
        ef_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ef_0.m(l, l2);
        Object object = ef_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = ef_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ef_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ef_0.g(clazz3, string2, clazz2)) != null) {
                    ef_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ef_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ef_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ef_0.n(874237906407482L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ef_0.m(l, l2);
        Object object = ef_0.l[n];
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
                clazz3 = ef_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ef_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ef_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ef_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ef_0.n(874237906407482L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ef_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ef_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ef_0.n(874237906407482L, 0L);
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
            return MethodHandles.lookup().findStatic(ef_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


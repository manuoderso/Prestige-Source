/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1747
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.P;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
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
import net.minecraft.class_1747;

public class eO
extends dV {
    private dM d;
    private dP a;
    private dP c;
    private static final long k = hc.a(3882151802413051814L, 7635650500293907269L, MethodHandles.lookup().lookupClass()).a(27094776891262L);
    private static final Object[] l = new Object[37];
    private static final String[] m = new String[37];

    static {
        eO.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eO.m(l, l2);
            object = eO.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eO.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eO.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eO.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eO.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eO.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = ")1Q~jo79K1\u0017\u007f7";
        objectArray[1] = "e;89\u0014Yn4)vuWe?-,";
        objectArray[2] = "]n)U\u001acKn,\u000f\tt\\%/\t\u0005`Mb8\u001eNrq";
        objectArray[3] = "!amt\u0005 TAf{\u0014o)Yu|\u001d&A";
        objectArray[4] = "\u0001\u001ckl<;\u0001\u001c|004\u001bW|.0!\u001c&,sa";
        objectArray[5] = "o>qb\u001b~o>f>\u0017quuf \u0017dr\u00042x@";
        objectArray[6] = "F\"`A\u0016LP\"e\u001b\u0005[Gif\u001d\tOV.q\nBl";
        objectArray[7] = "\u000e\u001ff\u0016O;{?m\u0019^t\u001a1f\u0012Z.n";
        objectArray[8] = Void.TYPE;
        eO.m[8] = "java/lang/Void";
        objectArray[9] = "d4\u0015?}\u001ad4\u0002cq\u0015~\u007f\u0002}q\u0000y\u000eP&)J";
        objectArray[10] = "Tg@X\u0013nTgW\u0004\u001faN,W\u001a\u001ftI]\u0005AG5";
        objectArray[11] = "?S>\u0012zt4\\/]\u001dv!W/\u0016&";
        objectArray[12] = Integer.TYPE;
        eO.m[12] = "java/lang/Integer";
        objectArray[13] = "K-pv\u0014`@\"a9xcN cvT";
        objectArray[14] = Boolean.TYPE;
        eO.m[14] = "java/lang/Boolean";
        objectArray[15] = "+\u0013})x[=\u0013xskL*X{ugX;\u001flb,O\u0004";
        objectArray[16] = "\u0015~K\u0004*P\u0003~N^9G\u00145MX5S\u0005rZO~E>";
        objectArray[17] = "^l\u0010\u001cR\u001bUc\u0001S1\u0016@n\u000e8\u0004\u0014Q}\u0012\u0014\u0013\u0019";
        objectArray[18] = "\n\u0018%\u0005-a\u0001\u00174JNl\u0014\u0011";
        objectArray[19] = "\nql6A\u0018\u001cqilR\u000f\u000b:jj^\u001b\u001a}}}\u0015\f\u0000";
        objectArray[20] = "Z\u0012T][t/2_RJ;N<TYNa:";
        objectArray[21] = "|rqs\u001e=\tRz|\u000frh\\qw\u000b(\u001c";
        objectArray[22] = "\u0011W nUKEI k8Y(\u0013:aVK\u0010[fuT3";
        objectArray[23] = "?b\u0005Lp\u0019c?\u0006V\u000fOe6ZZX\u0018;a\u000264Fg9YN1E}*";
        objectArray[24] = "]>3y]\u0015\u001b:?8c\u0013a00{[\u001a\f8+&]z\\/4x\u0019J\\d%%c";
        objectArray[25] = "\u000fxb[\",\bli\nLv\\kmW D\u000e&5\u0001L,]nqT>rRuv0";
        objectArray[26] = "\u001e&{\u001f\u0014K\u0012o`\u0016fAHcE\u0004\u0002]C\u001f+\b\u0016Z\u0017uyQ\u001aD.";
        objectArray[27] = "=TUq/4p\u0005\u001e)I>kZ\u0000% 2RT\u00005$Te\u0007T,.eaVU(I";
        objectArray[28] = "\u001dQGzZ\u001e\u0018R]i=\u0003KJD\u007fQ1\u0018\u000e\u001b)=XIYOv\u0002_]R\u001e\u0018";
        objectArray[29] = "\\p\u0003mFJYs\u0019~!W\nk\u0000hMeY/\\0!\f\bx\u000ba\u001e\u000b\u001csZ\u000f";
        objectArray[30] = "\f\u001bpjU!\u001f\u000b0k<weYw+\r|\u001e\u00020qF\u001e";
        objectArray[31] = "c\u0004'S]Ac\u0001{!_E\u0004X'\u0010\tI\u007f\u0003`JB+c\u0004'S]Ac\u0001{!";
        objectArray[32] = "X)!y\u0014\u0000Sz5yr\u00062}jh\fQ\bk%6\u001doY&;wLUOiefr";
        objectArray[33] = "%\u007f=&k-w`z?\u000b%/\u007f\u0003\u007fn04 i-7<*\u00193*{:wsasw$N)f?qy${?3o@";
        objectArray[34] = "!\u007fmT\r\u001e=|lDg\u001dM~t\u0014_\u0014 voIYt}vaW^\u001e//mIg";
        objectArray[35] = "%nSw!\u0003cj_6\u001f\u0005\u0019`Pu'\fthK(!l)hE6&\u0006{1I(\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[36] = "b1~XmJq!>Y\u0004\u001c\u000bsy\u00195\u0017p(>C~u68\"\u0012~E6s3O\u0004";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eO.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == '\u00d2' || c == 'd' || c == '\u00f8') {
                field = eO.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eO.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        long l;
        long l2;
        long l3;
        long l4;
        block17: {
            dP dP2;
            block16: {
                Object object;
                block14: {
                    CallSite callSite;
                    block15: {
                        long l5 = l4 = k ^ 0x255321E9BB99L;
                        l3 = l5 ^ 0x2070E6224228L;
                        l2 = l5 ^ 0x3685A9F37172L;
                        l = l5 ^ 0x6EDEEC1FADB6L;
                        callSite = eO.b("z", (long)1391291803991996585L, (long)l4);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            object = eO.b("B", (Object)((Boolean)((Object)eO.b("B", (Object)this.d, (long)1390698781516091344L, (long)l4))), (long)1390946981718896809L, (long)l4);
                                            if (callSite != null) break block14;
                                            if (object == false) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                                        }
                                        object = eO.b("B", (Object)eO.b("B", (Object)eO.b("\u00c9", (Object)b, (long)1391248259167498668L, (long)l4), (long)1390540742775294607L, (long)l4), (long)1390783012100877850L, (long)l4) instanceof class_1747;
                                        if (callSite != null) break block14;
                                    }
                                    catch (MatchException matchException) {
                                        throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                                    }
                                    if (object != false) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                                }
                                object = eO.b("B", (Object)eO.b("B", (Object)eO.b("\u00c9", (Object)b, (long)1391248259167498668L, (long)l4), (long)1390589623241239136L, (long)l4), (long)1390783012100877850L, (long)l4) instanceof class_1747;
                                if (callSite != null) break block14;
                            }
                            catch (MatchException matchException) {
                                throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                            }
                            if (object != false) break block15;
                        }
                        catch (MatchException matchException) {
                            throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                        }
                        return;
                    }
                    try {
                        dP2 = this.a;
                        if (callSite != null) break block16;
                        object = eO.b("B", (Object)((Integer)((Object)eO.b("B", (Object)dP2, (long)1390698781516091344L, (long)l4))), (long)1391014878553069071L, (long)l4);
                    }
                    catch (MatchException matchException) {
                        throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                    }
                }
                try {
                    if (object <= eO.b("B", (Object)((Integer)((Object)eO.b("B", (Object)this.c, (long)1390698781516091344L, (long)l4))), (long)1391014878553069071L, (long)l4)) break block17;
                    dP2 = this.a;
                }
                catch (MatchException matchException) {
                    throw eO.b("z", (Object)matchException, (long)1388071931121965513L, (long)l4);
                }
            }
            eO.b("B", (Object)dP2, (Object)((Integer)((Object)eO.b("B", (Object)this.c, (long)1390698781516091344L, (long)l4))), (long)1387805980416007879L, (long)l4);
        }
        P p = new P(b);
        Object[] objectArray = new Object[1];
        objectArray[0] = l3;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = (int)eO.b("B", (Object)((Integer)((Object)eO.b("B", (Object)this.c, (long)1390698781516091344L, (long)l4))), (long)1391014878553069071L, (long)l4);
        objectArray2[0] = (int)eO.b("B", (Object)((Integer)((Object)eO.b("B", (Object)this.a, (long)1390698781516091344L, (long)l4))), (long)1391014878553069071L, (long)l4);
        CallSite callSite = eO.b("z", (int)eO.b("B", (Object)p, (Object)objectArray, (long)1388141609432583367L, (long)l4), (int)eO.b("z", (Object)objectArray2, (long)1388212663653067975L, (long)l4), (long)1387976501022952778L, (long)l4);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = (int)callSite;
        eO.b("B", (Object)p, (Object)objectArray3, (long)1390901437588205130L, (long)l4);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eO.b("z", (Object)((Object)q_0.Crystal), (long)-2447729101718178745L, (long)l);
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
        Object object = eO.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 46;
            case 2 -> 31;
            case 3 -> 17;
            case 4 -> 22;
            case 5 -> 15;
            case 6 -> 63;
            case 7 -> 59;
            case 8 -> 50;
            case 9 -> 38;
            case 10 -> 20;
            case 11 -> 24;
            case 12 -> 61;
            case 13 -> 25;
            case 14 -> 23;
            case 15 -> 33;
            case 16 -> 2;
            case 17 -> 14;
            case 18 -> 12;
            case 19 -> 29;
            case 20 -> 58;
            case 21 -> 3;
            case 22 -> 18;
            case 23 -> 10;
            case 24 -> 54;
            case 25 -> 45;
            case 26 -> 21;
            case 27 -> 42;
            case 28 -> 51;
            case 29 -> 55;
            case 30 -> 57;
            case 31 -> 32;
            case 32 -> 16;
            case 33 -> 8;
            case 34 -> 34;
            case 35 -> 28;
            case 36 -> 35;
            case 37 -> 13;
            case 38 -> 48;
            case 39 -> 30;
            case 40 -> 49;
            case 41 -> 43;
            case 42 -> 1;
            case 43 -> 5;
            case 44 -> 39;
            case 45 -> 44;
            case 46 -> 7;
            case 47 -> 11;
            case 48 -> 53;
            case 49 -> 40;
            case 50 -> 52;
            case 51 -> 6;
            case 52 -> 9;
            case 53 -> 26;
            case 54 -> 62;
            case 55 -> 60;
            case 56 -> 47;
            case 57 -> 4;
            case 58 -> 41;
            case 59 -> 37;
            case 60 -> 56;
            case 61 -> 36;
            case 62 -> 19;
            default -> 0;
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
        eO.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eO.m(l, l2);
        Object object = eO.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eO.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eO.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eO.g(clazz3, string2, clazz2)) != null) {
                    eO.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eO.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eO.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eO.n(107928241813611L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eO.m(l, l2);
        Object object = eO.l[n];
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
                clazz3 = eO.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eO.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eO.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eO.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eO.n(107928241813611L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eO.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eO.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eO.n(107928241813611L, 0L);
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
            return MethodHandles.lookup().findStatic(eO.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


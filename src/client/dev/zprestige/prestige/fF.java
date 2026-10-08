/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2583
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
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1657;
import net.minecraft.class_2583;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fF
extends dV {
    private static volatile Set a;
    private static final long k;
    private static final Object[] l;
    private static final String[] m;

    static {
        k = hc.a(5102939357559707114L, 6414396610565000517L, MethodHandles.lookup().lookupClass()).a(277872322691336L);
        l = new Object[40];
        m = new String[40];
        fF.f();
        a = new HashSet();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        a = new HashSet();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fF.m(l, l2);
            object = fF.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fF.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fF.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fF.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fF.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fF.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u000f{Z\r\u000b\u0011\u0011s@Bl\u0010\u0000hM\u0018J\u0016";
        objectArray[1] = "O\fKpL$D\u0003Z?-*O\b^e";
        objectArray[2] = "/H\u001f6iF9H\u001alzQ.\u0003\u0019jvE?D\u000e}=W\u0003";
        objectArray[3] = "HBN\u0019l\u0003=bE\u0016}L@zV\u0011t\u0005(";
        objectArray[4] = "\u000b(C_|u\u000b(T\u0003pz\u0011cT\u001dpo\u0016\u0012\u0006G$+";
        objectArray[5] = "~\u007f\u0010\u000b;Y~\u007f\u0007W7Vd4\u0007I7CcEV\u0010`\u0001";
        objectArray[6] = "\u0001e$(}o\nj5g\u0000w\u0019m<.";
        objectArray[7] = "\u0018G\u0019Gkw\u000eG\u001c\u001dx`\u0019\f\u001f\u001btt\bK\b\f?a:";
        objectArray[8] = "F\"\fe6TM-\u001d*UYX \u0012A`[I3\u000emwV";
        objectArray[9] = "I(+\u0019B+W 1V?;W";
        objectArray[10] = Boolean.TYPE;
        fF.m[10] = "java/lang/Boolean";
        objectArray[11] = ";vr>\u0013h;veb\u001fg!=e|\u001fr&L5!N";
        objectArray[12] = "hUN \n0hUY|\u0006?r\u001eYb\u0006*uo\r:Q";
        objectArray[13] = "GF\u0013\u0004\u0003\u001bGF\u0004X\u000f\u0014]\r\u0004F\u000f\u0001Z|R\u001eVC";
        objectArray[14] = "\u007f\u0012\fWNJ\u007f\u0012\u001b\u000bBEeY\u001b\u0015BPb(MK\u0011\u0017";
        objectArray[15] = "R\n18V1R\n&dZ>HA&zZ+O0w#\u0003k";
        objectArray[16] = "uC;C\r\u0003uC,\u001f\u0001\fo\b,\u0001\u0001\u0019hyz_U[";
        objectArray[17] = "\u0015k\u0019+(4`K\u0012$9{\u0001E\u0019/=!u";
        objectArray[18] = "[~\no\u0004^[~\u001d3\bQA5\u001d-\bDFDHrQ";
        objectArray[19] = "U2@\"\nyK:ZmheL'";
        objectArray[20] = "\u0016\u0014H\u000eh_[\u0017E\u001a\u000eL+AE\u000b2IVM\u0014\u00050 \u0014C\tMvR\u0013D\u0011\u0019\u000e";
        objectArray[21] = "(\u00019\u000f\u0004[1\u001a?3\tL>\u001bCIPC~\\-\u000e\u0004]N";
        objectArray[22] = "= %\u0013gI?z#\u000b\u0002\u001e\u0004}$\u001a|K>>(\u0012:t";
        objectArray[23] = "i\u001f\u000b\u0015\u007fh\"E]\u001a\u0007b?\\\u0002\u001ekPo\u001c]F\u0007<.BSAdg7X\u0005y";
        objectArray[24] = "H,2s;C\u0015(30TQ\u0019~&'\u0003\u0006G)~KdB\u001cw:35\\\bo";
        objectArray[25] = "TjFEI~\u0003=@\u0019&{U-E\u0018JI\u0001a\u0019B\u0018\u001eT+\u001a\u0014]#CmC\r&";
        objectArray[26] = "c~\u001d( C>z\u001ckOQ2,\t|\u0018\u0006mqR\u0010#\u00040{\u0002ptS6'";
        objectArray[27] = "_\u000f\u000b01f\u0014U]?Il\tL\u0002;%^Y\f]bI2\u0018RSd*i\u0001H\u0005\\";
        objectArray[28] = "\u001e'\u0004_aBKf\f\t\u0005]\u001a$T_ioN`\u0005\u0007>8\u001d7\fG~Y\u001cgF_\u0005";
        objectArray[29] = "04.X( k-4\u000e\u0010,f4\u0017\u0015j\"m'LUy,s!>\u0003s?fH";
        objectArray[30] = "Omv]Ki\u0002n{I-\u007frmu\u0018\u0013{\b4:E\u0016\u0016Lmt\u0019@l\u0015\")\u001c-";
        objectArray[31] = "\u001e_\rl|/\u0011\u0003\u0011v\u0010)\\\u0003\u0015{l/Zn\ttjtK\u0014\u0010olH";
        objectArray[32] = "%.RT!S<5Th*@8\u000eE\u00186)|!TQ2[{&L\u0005J";
        objectArray[33] = "Va6p1uW1|hJyEsgk1\u0014F1l?qz\u0001er\u000fu}@7v}rzXc\u000e";
        objectArray[34] = "\u0001\u0013lKG#\u0016U5R<\u007f\u0011\u0004)I@y\u0017i5FF\"\u0006\u0013,]@\u001e";
        objectArray[35] = "%r\u001ccG\u001f*.\u0000y+\u0011w/~g\u0014\u001a+x\u0010 @\u0004\u001b|\u0017a\u0012\u0000i{\u0010yFx";
        objectArray[36] = "n@\u0005JfN8J\u0016_\u000fQ+T\u0003Vt<(\u0016\b\u00024RoB\u001620U.\u0010\u0012@7R6Dj";
        objectArray[37] = "y/@+\u0003\u0007#*@al\u0005#/Ch\u0010l!.Eh\u0015\u0005v?\u0014blS!8\u0017h\u001eT& C\u0010";
        objectArray[38] = "\u0018\u0014'\u0006\"^C\r=P\u001aXN\u0014%Pvj\u0018Pt\f%=\u0012\u0003+\fuVH\u0006+F\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "kO\u007f\u0001\u000b7:Qk\u0019s*6N{\u0002\u001f\u0018f\u000e$[st'P*]\u0010/>J|e";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        a = new HashSet();
    }

    private boolean d(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        l = k ^ l;
        boolean[] blArray = new boolean[]{false};
        fF.b("X", (Object)fF.b("X", (Object)fF.b("X", (Object)class_16572, (long)7381047383011956046L, (long)l), (long)7377452809816127019L, (long)l), (arg_0, arg_1, arg_2) -> fF.lambda$matchesLocalColor$1(blArray, arg_0, arg_1, arg_2), (long)7377236580042694168L, (long)l);
        return blArray[0];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fF.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00db' || c == 'Y' || c == '\u00dd' || c == '\u00ff') {
                field = fF.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fF.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        block9: {
            long l = k ^ 0x499BD9D0ED93L;
            long l2 = l ^ 0x1E6B0EEF8BFBL;
            HashSet hashSet = new HashSet();
            CallSite callSite = fF.b("X", (Object)fF.b("X", (Object)fF.b("\u00db", (Object)b, (long)6283328520431105155L, (long)l), (long)6283116955211742472L, (long)l), (long)6286111101422401040L, (long)l);
            CallSite callSite2 = fF.b("\u00e1", (long)6283018420600789822L, (long)l);
            while (fF.b("X", (Object)callSite, (long)6286022862742906485L, (long)l) != false) {
                block11: {
                    class_1657 class_16572;
                    block10: {
                        class_16572 = (class_1657)fF.b("X", (Object)callSite, (long)6282849114846816522L, (long)l);
                        try {
                            try {
                                if (callSite2 != null) break block9;
                                if (class_16572 != fF.b("\u00db", (Object)b, (long)6283194309923395028L, (long)l)) break block10;
                            }
                            catch (MatchException matchException) {
                                throw fF.b("\u00e1", (Object)matchException, (long)6283629325458913166L, (long)l);
                            }
                            if (callSite2 == null) continue;
                        }
                        catch (MatchException matchException) {
                            throw fF.b("\u00e1", (Object)matchException, (long)6283629325458913166L, (long)l);
                        }
                    }
                    try {
                        CallSite callSite3;
                        try {
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l2;
                            objectArray[0] = class_16572;
                            callSite3 = fF.b("X", (Object)this, (Object)objectArray, (long)6282923654897141973L, (long)l);
                            if (callSite2 != null || callSite3 == false) break block11;
                        }
                        catch (MatchException matchException) {
                            throw fF.b("\u00e1", (Object)matchException, (long)6283629325458913166L, (long)l);
                        }
                        callSite3 = fF.b("X", hashSet, (Object)class_16572, (long)6286076325200673936L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fF.b("\u00e1", (Object)matchException, (long)6283629325458913166L, (long)l);
                    }
                }
                if (callSite2 == null) continue;
            }
            a = hashSet;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static boolean a(Object[] objectArray) {
        Object object;
        block5: {
            String string = (String)objectArray[0];
            long l = (Long)objectArray[1];
            l = k ^ l;
            CallSite callSite = fF.b("X", (Object)a, (long)-5450513262411945287L, (long)l);
            CallSite callSite2 = fF.b("\u00e1", (long)-5451143708469774250L, (long)l);
            while (fF.b("X", (Object)callSite, (long)-5452708894630574819L, (long)l) != false) {
                block7: {
                    int n;
                    block6: {
                        class_1657 class_16572 = (class_1657)fF.b("X", (Object)callSite, (long)-5451238324738291102L, (long)l);
                        try {
                            try {
                                object = fF.b("X", (Object)fF.b("X", (Object)fF.b("X", (Object)class_16572, (long)-5451102964902173967L, (long)l), (long)-5450691400614697590L, (long)l), (Object)string, (long)-5452423956462621252L, (long)l);
                                if (callSite2 != null) break block5;
                                if (callSite2 != null) break block6;
                            }
                            catch (MatchException matchException) {
                                throw fF.b("\u00e1", (Object)matchException, (long)-5450611401513216794L, (long)l);
                            }
                            if (!object) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fF.b("\u00e1", (Object)matchException, (long)-5450611401513216794L, (long)l);
                        }
                        n = 1;
                    }
                    return n != 0;
                }
                if (callSite2 == null) continue;
            }
            object = false;
        }
        return object;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fF.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 1;
            case 2 -> 22;
            case 3 -> 41;
            case 4 -> 44;
            case 5 -> 45;
            case 6 -> 4;
            case 7 -> 32;
            case 8 -> 10;
            case 9 -> 20;
            case 10 -> 7;
            case 11 -> 27;
            case 12 -> 40;
            case 13 -> 42;
            case 14 -> 23;
            case 15 -> 49;
            case 16 -> 51;
            case 17 -> 21;
            case 18 -> 11;
            case 19 -> 39;
            case 20 -> 16;
            case 21 -> 26;
            case 22 -> 29;
            case 23 -> 60;
            case 24 -> 12;
            case 25 -> 53;
            case 26 -> 25;
            case 27 -> 43;
            case 28 -> 38;
            case 29 -> 15;
            case 30 -> 24;
            case 31 -> 2;
            case 32 -> 28;
            case 33 -> 5;
            case 34 -> 47;
            case 35 -> 31;
            case 36 -> 18;
            case 37 -> 33;
            case 38 -> 36;
            case 39 -> 55;
            case 40 -> 46;
            case 41 -> 59;
            case 42 -> 54;
            case 43 -> 14;
            case 44 -> 0;
            case 45 -> 9;
            case 46 -> 8;
            case 47 -> 6;
            case 48 -> 30;
            case 49 -> 61;
            case 50 -> 35;
            case 51 -> 52;
            case 52 -> 48;
            case 53 -> 62;
            case 54 -> 3;
            case 55 -> 56;
            case 56 -> 63;
            case 57 -> 34;
            case 58 -> 37;
            case 59 -> 17;
            case 60 -> 50;
            case 61 -> 19;
            case 62 -> 13;
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
        fF.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fF.m(l, l2);
        Object object = fF.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fF.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fF.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fF.g(clazz3, string2, clazz2)) != null) {
                    fF.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fF.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fF.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fF.n(76760364989405L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fF.m(l, l2);
        Object object = fF.l[n];
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
                clazz3 = fF.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fF.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fF.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fF.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fF.n(76760364989405L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fF.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fF.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fF.n(76760364989405L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static boolean lambda$matchesLocalColor$1(boolean[] blArray, int n, class_2583 class_25832, int n2) {
        long l = k ^ 0x1266EC926071L;
        fF.b("X", (Object)fF.b("X", (Object)fF.b("X", (Object)fF.b("\u00db", (Object)b, (long)-2679580126898825162L, (long)l), (long)-2675198989704560553L, (long)l), (long)-2675251355576726891L, (long)l), (arg_0, arg_1, arg_2) -> fF.lambda$matchesLocalColor$0(class_25832, blArray, arg_0, arg_1, arg_2), (long)-2675324289845173594L, (long)l);
        return false;
    }

    private static boolean lambda$matchesLocalColor$0(class_2583 class_25832, boolean[] blArray, int n, class_2583 class_25833, int n2) {
        Object object;
        block18: {
            block15: {
                CallSite callSite;
                CallSite callSite2;
                long l;
                block17: {
                    block16: {
                        class_2583 class_25834;
                        block14: {
                            l = k ^ 0x514A9B5E378DL;
                            callSite2 = fF.b("\u00e1", (long)-8273153026824634080L, (long)l);
                            try {
                                class_25834 = class_25833;
                                if (callSite2 != null) break block14;
                                if (class_25834 == null) break block15;
                            }
                            catch (MatchException matchException) {
                                throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                            }
                            class_25834 = class_25833;
                        }
                        try {
                            try {
                                callSite = fF.b("X", (Object)class_25834, (long)-8273865216427975186L, (long)l);
                                if (callSite2 != null) break block16;
                                if (callSite == null) break block15;
                            }
                            catch (MatchException matchException) {
                                throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                            }
                            callSite = fF.b("X", (Object)class_25832, (long)-8273865216427975186L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite2 != null) break block17;
                            if (callSite == null) break block15;
                        }
                        catch (MatchException matchException) {
                            throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                        }
                        callSite = fF.b("X", (Object)class_25832, (long)-8273865216427975186L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                    }
                }
                try {
                    try {
                        object = fF.b("X", (Object)callSite, (Object)fF.b("X", (Object)class_25833, (long)-8273865216427975186L, (long)l), (long)-8277020610935086945L, (long)l);
                        if (callSite2 != null) break block18;
                        if (!object) break block15;
                    }
                    catch (MatchException matchException) {
                        throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                    }
                    blArray[0] = 1;
                }
                catch (MatchException matchException) {
                    throw fF.b("\u00e1", (Object)matchException, (long)-8273685064303612528L, (long)l);
                }
            }
            object = false;
        }
        return object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fF.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


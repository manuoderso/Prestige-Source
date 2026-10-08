/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1921
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1921;
import net.minecraft.class_4588;
import net.minecraft.class_4597;

public class c2
implements class_4597 {
    private final class_4597 a;
    private static final long b = hc.a(-8854970948441867593L, 8547982479740551538L, MethodHandles.lookup().lookupClass()).a(76143631525255L);
    private static final Object[] c = new Object[27];
    private static final String[] d = new String[27];

    public c2(class_4597 class_45972) {
        this.a = class_45972;
    }

    static {
        c2.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c2.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c2.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = c2.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c2.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = c2.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                c2.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = c2.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = c2.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c2.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c2.a(clazz3, string2, clazz2)) != null) {
                    c2.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c2.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c2.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c2.b(719184864577349L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = c2.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = c2.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c2.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c2.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        c2.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c2.b(719184864577349L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c2.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c2.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c2.b(719184864577349L, 0L);
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
            if (c == 'o' || c == 'X' || c == '\u00d9' || c == '\u00dc') {
                field = c2.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c2.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = c2.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 5;
            case 1 -> 26;
            case 2 -> 31;
            case 3 -> 11;
            case 4 -> 37;
            case 5 -> 7;
            case 6 -> 32;
            case 7 -> 9;
            case 8 -> 42;
            case 9 -> 55;
            case 10 -> 19;
            case 11 -> 35;
            case 12 -> 22;
            case 13 -> 20;
            case 14 -> 63;
            case 15 -> 27;
            case 16 -> 3;
            case 17 -> 18;
            case 18 -> 49;
            case 19 -> 33;
            case 20 -> 4;
            case 21 -> 23;
            case 22 -> 13;
            case 23 -> 39;
            case 24 -> 1;
            case 25 -> 60;
            case 26 -> 15;
            case 27 -> 17;
            case 28 -> 30;
            case 29 -> 14;
            case 30 -> 24;
            case 31 -> 54;
            case 32 -> 43;
            case 33 -> 61;
            case 34 -> 58;
            case 35 -> 46;
            case 36 -> 56;
            case 37 -> 62;
            case 38 -> 45;
            case 39 -> 2;
            case 40 -> 16;
            case 41 -> 0;
            case 42 -> 6;
            case 43 -> 51;
            case 44 -> 41;
            case 45 -> 57;
            case 46 -> 29;
            case 47 -> 34;
            case 48 -> 50;
            case 49 -> 28;
            case 50 -> 38;
            case 51 -> 12;
            case 52 -> 21;
            case 53 -> 8;
            case 54 -> 48;
            case 55 -> 53;
            case 56 -> 36;
            case 57 -> 25;
            case 58 -> 40;
            case 59 -> 52;
            case 60 -> 10;
            case 61 -> 44;
            case 62 -> 59;
            default -> 47;
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
        c2.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u0014\u0014\u0018[\u0005N\u0002\u0014\u001d\u0001\u0016Y\u0015_\u001e\u0007\u001aM\u0004\u0018\t\u0010Q_8";
        objectArray[1] = "\r\u0012\u0005i\u001a\u0001x2\u000ef\u000bN\u0005*\u001da\u0002\u0007m";
        objectArray[2] = "\u001bk,\u0019r\u000b\u001bk;E~\u0004\u0001 ;[~\u0011\u0006Qi\u000e-S";
        objectArray[3] = "Z'=\u0005$QD/'JETD/$\nkH";
        objectArray[4] = Boolean.TYPE;
        c2.d[4] = "java/lang/Boolean";
        objectArray[5] = "\u00184\u00060N9\u0006<\u001c\u007f\u00069\u001c6\u00048\u000f\"\\\u0013\u0005?\u00038\u001b:\u001e";
        objectArray[6] = "9\u001faHL\u000e/\u001fd\u0012_\u00198Tg\u0014S\r)\u0013p\u0003\u0018\u001dl";
        objectArray[7] = "Yw\bx\t\u0003,W\u0003w\u0018LMY\b|\u001c\u00169";
        objectArray[8] = "f\u0012q*\u0011\u0014f\u0012fv\u001d\u001b|Yfh\u001d\u000e{(11EJ";
        objectArray[9] = "\u0007@kZz\u0011\u0007@|\u0006v\u001e\u001d\u000b|\u0018v\u000b\u001az+A/@";
        objectArray[10] = "\u007f7s9N{t8bv/u\u007f3f,";
        objectArray[11] = "!'\u000er\u001cJ7'\u000b(\u000f] l\b.\u0003I1+\u001f9HYw";
        objectArray[12] = "1}\u0016\u0016t*:r\u0007Y\u0017'/\u007f\b2\"%>l\u0014\u001e5(";
        objectArray[13] = "\u001at\u001fuZX\u0011{\u000e:=Z\u0004p\u000eq\u0006";
        objectArray[14] = Integer.TYPE;
        c2.d[14] = "java/lang/Integer";
        objectArray[15] = "14D\u0015\u00070D\u0014O\u001a\u0016\u007f%\u001aD\u0011\u0012%Q";
        objectArray[16] = "ls0#r0a%2{No<h?$\"]n/c|q\nhh4. sof::N4;d8!(nkm/C";
        objectArray[17] = "hOQu4\\kJV\"YST[[a4\u0002nBVsd:jXE};\\0\bLjY";
        objectArray[18] = "o:c\u007f{s3:uA.\u000b6ly/%sega-D";
        objectArray[19] = "\u00181Kxhr\u001f?El\u0006nL1@rj\\\u001bv\u001a%7\u000b\u001b)\u001fw7y_-\u001bn\u0006";
        objectArray[20] = "N{>1u)\n\u007f:(D:\u000fRd+8*t$<7?9\u000e~z+x[";
        objectArray[21] = ".?r>wFj;v'FQ}#Mg!Qo0wa!\u0004/[w8yV%)3<}O\u0014";
        objectArray[22] = "$-GZ\"\u001a##INL\u0006p-LP 4'm\u0016\u0006qc&lHL.\u0019|*T\u000bL";
        objectArray[23] = "\u0000c=\u0000c\u000bDg9\u0019R\u001e@Jf\u0019?y\u0005=r\r#\u0003Yj8\u001eRF\u0000wm\u0013(\u001aW=~b";
        objectArray[24] = "\u0016\u0018\u000b\u001d@jE\u0018\b\u001a~g)Q\n\u001a\u0011pK\u001eH\\\u0002\u000e\u0019\u001cOM\u0000lV^\t^~";
        objectArray[25] = "C j0q]@%mg\u001cR\u007f4`$q\u0003E-m6!;E91=-I\u0001=5$\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "^/\u0005oTnW,Qf-4\tnfcI(\u0002\u0012\tuH,\u0006o]j\u001d9o";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static class_4588 lambda$getBuffer$0(class_4588 class_45882, Integer n) {
        long l = b ^ 0x638D77375E8AL;
        long l2 = l ^ 0x68C6B0E9722DL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = (int)c2.a("\u00fd", (Object)n, (long)5045133002637978133L, (long)l);
        objectArray[0] = class_45882;
        return c2.a("\u00d1", (Object)objectArray, (long)5044350096918495467L, (long)l);
    }

    public class_4588 method_73477(class_1921 class_19212) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block10: {
            class_1921 class_19213;
            long l2;
            block8: {
                block9: {
                    l = b ^ 0x41201346B89L;
                    l2 = l ^ 0xEA1334507F0L;
                    callSite2 = c2.a("\u00fd", (Object)this.a, (Object)class_19212, (long)8287205560881782046L, (long)l);
                    CallSite callSite3 = c2.a("\u00d1", (long)8287338657175280143L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    class_19213 = class_19212;
                                    if (callSite3 != null) break block8;
                                    if (c2.a("\u00fd", (Object)class_19213, (long)8287657883984923167L, (long)l) != false) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw c2.a("\u00d1", (Object)matchException, (long)8286657501159046055L, (long)l);
                                }
                                callSite = c2.a("\u00fd", (Object)class_19212, (long)8287425785863493560L, (long)l);
                                if (callSite3 != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw c2.a("\u00d1", (Object)matchException, (long)8286657501159046055L, (long)l);
                            }
                            if (c2.a("\u00fd", (Object)callSite, (long)8287492432317350753L, (long)l) == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw c2.a("\u00d1", (Object)matchException, (long)8286657501159046055L, (long)l);
                        }
                        return callSite2;
                    }
                    catch (MatchException matchException) {
                        throw c2.a("\u00d1", (Object)matchException, (long)8286657501159046055L, (long)l);
                    }
                }
                class_19213 = class_19212;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l2;
            objectArray[0] = class_19213;
            callSite = c2.a("\u00d1", (Object)objectArray, (long)8286722859546682701L, (long)l);
        }
        CallSite callSite4 = callSite;
        return (class_4588)c2.a("\u00fd", (Object)c2.a("\u00fd", (Object)callSite4, arg_0 -> c2.lambda$getBuffer$0((class_4588)callSite2, arg_0), (long)8287575536825113529L, (long)l), (Object)callSite2, (long)8287742497208071719L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


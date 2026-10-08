/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2680
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.b0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_2680;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class b1 {
    private static final long b = hc.a(-3510192563747172832L, -3069854499316388147L, MethodHandles.lookup().lookupClass()).a(198944521243269L);
    private static final Object[] c = new Object[14];
    private static final String[] d = new String[14];

    static {
        b1.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b1.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b1.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = b1.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b1.b(classArray[i], string, clazz2);
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
            int n = b1.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                b1.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = b1.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = b1.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b1.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b1.a(clazz3, string2, clazz2)) != null) {
                    b1.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b1.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b1.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b1.b(533961363402867L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = b1.a(l, l2);
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
                clazz3 = b1.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b1.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b1.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        b1.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b1.b(533961363402867L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b1.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b1.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b1.b(533961363402867L, 0L);
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
            if (c == 'C' || c == '\u00c8' || c == '\u00d4' || c == '\u00c1') {
                field = b1.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b1.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00aa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/b1" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = b1.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void a(Object[] objectArray) {
        b0 b02 = (b0)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l = (Long)objectArray[2];
    }

    public boolean a(Object[] objectArray) {
        Object object;
        block10: {
            block12: {
                block11: {
                    class_2680 class_26802 = (class_2680)objectArray[0];
                    long l = (Long)objectArray[1];
                    l = b ^ l;
                    CallSite callSite = b1.a("K", (long)-3604671572139822780L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        object = b1.a("\u00aa", (Object)class_26802, (long)-3605120642991686864L, (long)l);
                                        if (callSite != null) break block10;
                                        if (object != false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw b1.a("K", (Object)matchException, (long)-3605059119461614497L, (long)l);
                                    }
                                    object = b1.a("\u00aa", (Object)class_26802, (long)-3604614929868608368L, (long)l);
                                    if (callSite != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw b1.a("K", (Object)matchException, (long)-3605059119461614497L, (long)l);
                                }
                                if (object != false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw b1.a("K", (Object)matchException, (long)-3605059119461614497L, (long)l);
                            }
                            object = b1.a("\u00aa", (Object)b1.a("\u00aa", (Object)class_26802, (long)-3604835705615086603L, (long)l), (long)-3604734039576195731L, (long)l);
                            if (callSite != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw b1.a("K", (Object)matchException, (long)-3605059119461614497L, (long)l);
                        }
                        if (object != false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw b1.a("K", (Object)matchException, (long)-3605059119461614497L, (long)l);
                    }
                }
                object = 1;
                break block10;
            }
            object = 0;
        }
        return (boolean)object;
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
            case 0 -> 36;
            case 1 -> 18;
            case 2 -> 31;
            case 3 -> 16;
            case 4 -> 10;
            case 5 -> 6;
            case 6 -> 12;
            case 7 -> 23;
            case 8 -> 15;
            case 9 -> 20;
            case 10 -> 17;
            case 11 -> 60;
            case 12 -> 19;
            case 13 -> 29;
            case 14 -> 63;
            case 15 -> 40;
            case 16 -> 49;
            case 17 -> 7;
            case 18 -> 9;
            case 19 -> 13;
            case 20 -> 51;
            case 21 -> 14;
            case 22 -> 54;
            case 23 -> 22;
            case 24 -> 4;
            case 25 -> 56;
            case 26 -> 57;
            case 27 -> 42;
            case 28 -> 43;
            case 29 -> 1;
            case 30 -> 32;
            case 31 -> 26;
            case 32 -> 0;
            case 33 -> 8;
            case 34 -> 44;
            case 35 -> 45;
            case 36 -> 61;
            case 37 -> 11;
            case 38 -> 28;
            case 39 -> 48;
            case 40 -> 58;
            case 41 -> 35;
            case 42 -> 33;
            case 43 -> 52;
            case 44 -> 5;
            case 45 -> 39;
            case 46 -> 27;
            case 47 -> 30;
            case 48 -> 53;
            case 49 -> 46;
            case 50 -> 50;
            case 51 -> 25;
            case 52 -> 62;
            case 53 -> 41;
            case 54 -> 21;
            case 55 -> 34;
            case 56 -> 37;
            case 57 -> 38;
            case 58 -> 59;
            case 59 -> 3;
            case 60 -> 2;
            case 61 -> 55;
            case 62 -> 24;
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
        b1.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u0014\u0005vF]\u0007\u0014\u0005a\u001aQ\b\u000eNa\u0004Q\u001d\t?0^\b^";
        objectArray[1] = "U\u0013D!A\rU\u0013S}M\u0002OXScM\u0017H)\u00039\u001dT";
        objectArray[2] = "v.\n\bL5`.\u000fR_\"we\fTS6f\"\u001bC\u0018$Z";
        objectArray[3] = "@]O\u000f*x5}D\u0000;7HeW\u00072~ ";
        objectArray[4] = "o\u001aUu(0y\u001aP/;'nQS)73\u007f\u0016D>|\":";
        objectArray[5] = ";8R-5u07CbVx%:L\tcz4)P%tw";
        objectArray[6] = Boolean.TYPE;
        b1.d[6] = "java/lang/Boolean";
        objectArray[7] = "db\u0013\t\u0014!om\u0002Fu/df\u0006\u001c";
        objectArray[8] = "ND|\tM\u0019PK&4\u0014\u001eQG'X&I\u0013\u001dz\u000bq\fLZ}Q\u000bIOM@";
        objectArray[9] = "^\n\u007f}\u001ez\u001b\th@\u001em]\u000be,,9\u001cT<q{<Y\u0007b?\u0005a\u0018\ts@";
        objectArray[10] = "\u0010*\u0003 ,hQ;CkAm)}]{}:M Q%*\u0007";
        objectArray[11] = "\f\u0016\u000bc3R\u0012\u0019Q^jU\u0013\u0015P2X\u0004RI\bb\u000f\u0004\u0017\u0019W!qYV\u0017F^";
        objectArray[12] = "laQ\fdLrn\u000b1=Ksb\n]\u000f\u001c18T\fX\u001awn\rN&G6`\u001c1";
        Object[] objectArray2 = objectArray;
        objectArray[13] = ";y\u0019z|xl>\u0005yAk\u0000}\u0002e>o:x\u001ad8\u0002;%\u0011j,8>=\u0010lA";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(b1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_634
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dT;
import dev.zprestige.prestige.dV;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_634;

/*
 * Renamed from dev.zprestige.prestige.er
 */
public class er_0
extends dV {
    private dT a;
    private static final Object[] k = new Object[26];
    private static final String[] l = new String[26];

    static {
        er_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/er" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = er_0.m(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                er_0.k[n] = clazz = Class.forName(er_0.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = er_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = er_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = er_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = er_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = k;
        k[0] = "=\u007f,U\u0005{#w6\u001adl={9@X";
        objectArray[1] = "\u0000)(DZ8\u000b&9\u000b;6\u0000-=Q";
        objectArray[2] = "g\u0002$\u0000x\u001dq\u0002!Zk\nfI\"\\g\u001ew\u000e5K,\fK";
        objectArray[3] = "Z\u000e()\u0018x/.#&\t7R60!\u0000~:";
        objectArray[4] = "T\u0011mNf\bT\u0011z\u0012j\u0007NZz\fj\u0012I+/S?";
        objectArray[5] = "\u001b\b\u0011<H<\u0010\u0007\u0000s5$\u0003\u0000\t:";
        objectArray[6] = Void.TYPE;
        er_0.l[6] = "java/lang/Void";
        objectArray[7] = "~F/co\u0002hF*9|\u0015\u007f\r)?p\u0001nJ>(;\u0016L";
        objectArray[8] = "G5Br;#2\u0015I}*lS\u001bBv.6'";
        objectArray[9] = "&8#=jZ&84afU<s4\u007ff@;\u0002d\"7";
        objectArray[10] = Integer.TYPE;
        er_0.l[10] = "java/lang/Integer";
        objectArray[11] = "ogt\u000e*\u001fygqT9\bn,rR5\u001c\u007fkeE~\u000b@";
        objectArray[12] = "(N\u000fFWm>N\n\u001cDz)\u0005\t\u001aHn8B\u001e\r\u0003x>";
        objectArray[13] = "[$\u0004\u0011Z\u0011P+\u0015^9\u001cE&\u001a5\f\u001eT5\u0006\u0019\u001b\u0013";
        objectArray[14] = Boolean.TYPE;
        er_0.l[14] = "java/lang/Boolean";
        objectArray[15] = "\u0015\u000f\u0012\fB\u0004\u0013\u0004C|]\u0005\b\u0003\u001f\u0006J.\u0016\u00188\u0001C\fqGO\u0012Z\n\tD\u001f\u0010\u0017hHO\u0010\u0001E\u0010K\u001f\u0012L'";
        objectArray[16] = "r \u0013_Q\u0018/!RN5\u000eOrSED\u0005.0SK\rgs|\u0013G\u000f\u000b2%\u000f\u001e5";
        objectArray[17] = ".qu`{\u0016y~ a\u0012\u0001}`$v~3)!z+\u0012^`|'il\u001c(ax\u0011";
        objectArray[18] = "I)?\u0016?\u0004\r`?N_B\u000f:~V%X\u0014?\u0005\u0015c\u0003\u000e :H'[KP>Se\u0005\u0012mz\u001ae]r";
        objectArray[19] = "#\u000f^U\u000eft\u001a\u0001^>}\u001aLZ\u001cU+\"\u001aYCB\u0017";
        objectArray[20] = "=\u0005Q3Q\u001f\u007fMLl)\u0004j\tQ7E6;H\u000ek\u0011a<\f\u000blI\\xE\u000b4)]7\nXjE\u001cn\u0016\u0001P";
        objectArray[21] = "h\n@`}5!\f\u0016a\u0016=XZ\u0017dk6 YGf&T";
        objectArray[22] = "\u0001^P\u0003apE\u0017P[\u00011]|\u0016E`+U'QF;qZ\u001a\u0015\u000f;):";
        objectArray[23] = "/4H\"E@.3\u0004'4@\u001fbQtH\u0016y8PtH).8\u00002\u000bOt9\u000024";
        objectArray[24] = "\f\u007f\u001cvD!N7\u0001)<:[s\u001crP\b\n2C/\r_\rvF)\\bI?Fq<c\u0006p\u0015/P\"_lL\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "+Nci\u001f_o\u0007c1\u007f\u0019l^#)\u0004=qK9UD\u001b*\u000b9h\u0000R*SY<EYm\u000fb;A\u0007`7";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == 'S' || c == '\u00f6' || c == '\u00fa') {
                field = er_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = er_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = er_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l;
        long l2;
        block8: {
            CallSite callSite;
            CallSite callSite2;
            block6: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x148CA4297AAAL;
                callSite2 = er_0.b("m", (String)((Object)er_0.b("m", (Object)this.a, (long)3243440530355145089L, (long)l2)), (long)3243694909309046663L, (long)l2);
                CallSite callSite3 = er_0.b("C", (long)3243310169797823408L, (long)l2);
                try {
                    block7: {
                        try {
                            try {
                                callSite = callSite2;
                                if (callSite3 != null) break block6;
                                if (er_0.b("m", (Object)callSite, (Object)"/", (long)3242659552253617413L, (long)l2) == false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw er_0.b("C", (Object)matchException, (long)3243644981778121285L, (long)l2);
                            }
                            er_0.b("m", (Object)((class_634)er_0.b("C", (Object)er_0.b("m", (Object)b, (long)3243165818247662610L, (long)l2), (long)3244180019681102074L, (long)l2)), (Object)er_0.b("m", (Object)callSite2, (int)1, (long)3243415044873408594L, (long)l2), (long)3243552541189146015L, (long)l2);
                            if (callSite3 == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw er_0.b("C", (Object)matchException, (long)3243644981778121285L, (long)l2);
                        }
                    }
                    callSite = er_0.b("C", (Object)er_0.b("m", (Object)b, (long)3243165818247662610L, (long)l2), (long)3244180019681102074L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw er_0.b("C", (Object)matchException, (long)3243644981778121285L, (long)l2);
                }
            }
            er_0.b("m", (Object)((class_634)callSite), (Object)callSite2, (long)3242701171159341192L, (long)l2);
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        er_0.b("m", (Object)this, (Object)objectArray2, (long)3243264446221539104L, (long)l2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (er_0.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 53;
            case 2 -> 50;
            case 3 -> 27;
            case 4 -> 39;
            case 5 -> 48;
            case 6 -> 7;
            case 7 -> 55;
            case 8 -> 21;
            case 9 -> 22;
            case 10 -> 10;
            case 11 -> 11;
            case 12 -> 5;
            case 13 -> 26;
            case 14 -> 51;
            case 15 -> 6;
            case 16 -> 25;
            case 17 -> 59;
            case 18 -> 58;
            case 19 -> 18;
            case 20 -> 52;
            case 21 -> 13;
            case 22 -> 47;
            case 23 -> 24;
            case 24 -> 0;
            case 25 -> 54;
            case 26 -> 14;
            case 27 -> 37;
            case 28 -> 9;
            case 29 -> 40;
            case 30 -> 31;
            case 31 -> 43;
            case 32 -> 63;
            case 33 -> 56;
            case 34 -> 62;
            case 35 -> 8;
            case 36 -> 35;
            case 37 -> 60;
            case 38 -> 2;
            case 39 -> 49;
            case 40 -> 3;
            case 41 -> 42;
            case 42 -> 44;
            case 43 -> 30;
            case 44 -> 20;
            case 45 -> 29;
            case 46 -> 1;
            case 47 -> 57;
            case 48 -> 34;
            case 49 -> 17;
            case 50 -> 4;
            case 51 -> 41;
            case 52 -> 45;
            case 53 -> 32;
            case 54 -> 28;
            case 55 -> 46;
            case 56 -> 16;
            case 57 -> 15;
            case 58 -> 12;
            case 59 -> 36;
            case 60 -> 23;
            case 61 -> 38;
            case 62 -> 33;
            default -> 61;
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
        er_0.l[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = er_0.m(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = er_0.l[n];
            int n2 = string.indexOf(8);
            Class clazz = er_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = er_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = er_0.g(clazz3, string2, clazz2)) != null) {
                    er_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = er_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        er_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = er_0.n(128191902731900L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = er_0.m(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = er_0.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = er_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = er_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = er_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        er_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = er_0.n(128191902731900L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = er_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        er_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = er_0.n(128191902731900L, 0L);
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
            return MethodHandles.lookup().findStatic(er_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


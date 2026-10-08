/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aH {
    private final y_0 a;
    private boolean b = 0;
    private static String[] c;
    private static final long i;
    private static final Object[] j;
    private static final String[] k;

    public aH(y_0 y_02) {
        this.a = y_02;
    }

    public aH() {
        this(y_0.NONE);
    }

    static {
        i = hc.a(-6890791224470381746L, -7184491210921410714L, MethodHandles.lookup().lookupClass()).a(218063970530228L);
        long l = i ^ 0x10D418FC5462L;
        j = new Object[15];
        k = new String[15];
        aH.a();
        if (aH.a("r", (long)-4710022623866666830L, (long)l) != null) {
            aH.a("r", (Object)new String[2], (long)-4709748767382667706L, (long)l);
        }
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    public static String[] b() {
        return c;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = aH.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                aH.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aH.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aH.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean b(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                l = (l2 = i ^ l2) ^ 0x483490D50F4BL;
                CallSite callSite2 = aH.a("r", (long)7946844386289586264L, (long)l2);
                try {
                    try {
                        callSite = aH.a("\u00d6", (long)7946802225962258205L, (long)l2);
                        if (callSite2 != null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw aH.a("r", (Object)matchException, (long)7946988167407788481L, (long)l2);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw aH.a("r", (Object)matchException, (long)7946988167407788481L, (long)l2);
                }
            }
            callSite = aH.a("\u00d6", (long)7946802225962258205L, (long)l2);
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = this;
        return (boolean)aH.a("\u00a4", (Object)callSite, (Object)objectArray2, (long)7946931468276374609L, (long)l2);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = aH.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aH.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static Field c(long l, long l2) {
        int n = aH.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = aH.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aH.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aH.a(clazz3, string2, clazz2)) != null) {
                    aH.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aH.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aH.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aH.b(648549172927962L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = aH.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = aH.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aH.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aH.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        aH.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aH.b(648549172927962L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aH.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aH.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aH.b(648549172927962L, 0L);
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
            if (c == 't' || c == 'c' || c == '\u00d6' || c == '\u00ed') {
                field = aH.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aH.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = aH.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean a(Object[] objectArray) {
        return this.b;
    }

    public y_0 a(Object[] objectArray) {
        return this.a;
    }

    public void a(Object[] objectArray) {
        this.b = 1;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 52;
            case 2 -> 45;
            case 3 -> 29;
            case 4 -> 55;
            case 5 -> 36;
            case 6 -> 9;
            case 7 -> 28;
            case 8 -> 37;
            case 9 -> 21;
            case 10 -> 42;
            case 11 -> 31;
            case 12 -> 59;
            case 13 -> 44;
            case 14 -> 30;
            case 15 -> 14;
            case 16 -> 46;
            case 17 -> 10;
            case 18 -> 47;
            case 19 -> 16;
            case 20 -> 2;
            case 21 -> 5;
            case 22 -> 26;
            case 23 -> 34;
            case 24 -> 39;
            case 25 -> 62;
            case 26 -> 63;
            case 27 -> 3;
            case 28 -> 43;
            case 29 -> 50;
            case 30 -> 15;
            case 31 -> 40;
            case 32 -> 51;
            case 33 -> 17;
            case 34 -> 27;
            case 35 -> 41;
            case 36 -> 49;
            case 37 -> 0;
            case 38 -> 6;
            case 39 -> 13;
            case 40 -> 53;
            case 41 -> 38;
            case 42 -> 8;
            case 43 -> 33;
            case 44 -> 48;
            case 45 -> 25;
            case 46 -> 20;
            case 47 -> 18;
            case 48 -> 56;
            case 49 -> 54;
            case 50 -> 22;
            case 51 -> 60;
            case 52 -> 61;
            case 53 -> 7;
            case 54 -> 11;
            case 55 -> 32;
            case 56 -> 12;
            case 57 -> 24;
            case 58 -> 23;
            case 59 -> 35;
            case 60 -> 1;
            case 61 -> 58;
            case 62 -> 57;
            default -> 4;
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
        aH.k[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "j(fwrt|(c-ackc`+mwz$w<&eF";
        objectArray[1] = "|\u007f\u000ez1g\t_\u0005u (tG\u0016r)a\u001c";
        objectArray[2] = ")w=u|v\\W6zm9!O%}dpI";
        objectArray[3] = Void.TYPE;
        aH.k[3] = "java/lang/Void";
        objectArray[4] = "\"\u000b\u000ezVy4\u000b\u000b En#@\b&Iz2\u0007\u001f1\u0002j*\u0007\u001d:X'\u0016\u001c\u001d'X`!\u000b";
        objectArray[5] = "\f8A\u007f\u0006\u0001\u001a8D%\u0015\u0016\rsG#\u0019\u0002\u001c4P4R\u0013'";
        objectArray[6] = "\u0004\u001bT\u0017? \u000f\u0014EX\\-\u001a\u0019J3i/\u000b\nV\u001f~\"";
        objectArray[7] = "^\"T\u0012f\u0015+\u0002_\u001dwZJ\fT\u0016s\u0000>";
        objectArray[8] = Boolean.TYPE;
        aH.k[8] = "java/lang/Boolean";
        objectArray[9] = "Ap\u001eX\u0005&J\u007f\u000f\u0017d(At\u000bM";
        objectArray[10] = "\f,\u0012-\u0011f\u0007=T\u0015\u001e\u001aZ;\u001cdN$\r/B%t";
        objectArray[11] = ".?+\u001e\t!h'(\u000761\u0014y/\u0006R>$xhD_";
        objectArray[12] = "\u0007uz>\u0016\u0013\fd<\u0006\u0019oT}\u007f`M\u0010U|(fsS\t&#8\fR\bq%\u0006";
        objectArray[13] = "\u0007)a!Ke\u0006n#,.<<l|{S>U1m8JU\u0001,!,S1_('>.";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "f\t>\u0013\u0014*m\u0018x+\u001bV0\u001e0ZKhg\nn\u001bql`\u000e}Q\no7\u001d1+";
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
            return MethodHandles.lookup().findStatic(aH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


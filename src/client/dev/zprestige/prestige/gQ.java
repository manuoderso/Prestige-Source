/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.hc;
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
public record gQ(int bR, boolean bS, boolean bT) implements fW
{
    private static final long b = hc.a(-666711391822586663L, -4089295312635642203L, MethodHandles.lookup().lookupClass()).a(66652072545249L);
    private static final Object[] c = new Object[12];
    private static final String[] d = new String[12];

    public gQ(int n, boolean bl) {
        this(n, bl, bl);
    }

    static {
        gQ.b();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gQ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gQ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void b() {
        Object[] objectArray = c;
        c[0] = "\u0001\u0000\u00030y\u001d\u0017\u0000\u0006jj\n\u0000K\u0005lf\u001e\u0011\f\u0012{-\f-";
        objectArray[1] = "qe63$7\u0004E=<5xy].;<1\u0011";
        objectArray[2] = "A\fDPE0D\u0019OPF7K\u0010D\u0012\u0007\u0000bO\u0012";
        objectArray[3] = Integer.TYPE;
        gQ.d[3] = "java/lang/Integer";
        objectArray[4] = Void.TYPE;
        gQ.d[4] = "java/lang/Void";
        objectArray[5] = "P\"a+\u000e\u0010F\"dq\u001d\u0007Qigw\u0011\u0013@.p`Z\u0007e";
        objectArray[6] = "R\u0013)tyzY\u001c8;\u001awL\u00117P/u]\u0002+|8x";
        objectArray[7] = "\b\u001cjr\u000e{\u0003\u0013{=ou\b\u0018\u007fg";
        objectArray[8] = "]hm@.\u0005\u000b4{F\u0013\u000f\u0000AfNy\u0004\t\f:\u0019j\f\tg{[m\u000fd7j_z\u0000\u0000i}\u0017y`";
        objectArray[9] = "G,D\u001c&y\u001azV~%\u001c\u0018x[B0cD?GAO";
        objectArray[10] = "\u0005Tf{vqS\bp}K{X|jg\"~X]\u000b&umP]`g7jS00v3}\\Tna{~<";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\u0006Xs}Y2\u000b\u0003s ;::^9{_#\u0001[1qRS\u0006\u0018x$Kh\u0003\u0010r);";
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gQ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gQ.b(classArray[i], string, clazz2);
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
            int n = gQ.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                gQ.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = gQ.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = gQ.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gQ.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gQ.a(clazz3, string2, clazz2)) != null) {
                    gQ.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gQ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gQ.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gQ.b(535945699382819L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gQ.a(l, l2);
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
                clazz3 = gQ.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gQ.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gQ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gQ.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gQ.b(535945699382819L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gQ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gQ.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gQ.b(535945699382819L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = gQ.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == 'm' || c == '\u00e3' || c == 'z') {
                field = gQ.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gQ.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    @Override
    public void a() {
        block11: {
            int n;
            long l;
            block12: {
                CallSite callSite;
                block10: {
                    l = b ^ 0x564F5E39115FL;
                    callSite = gQ.a("\u00f2", (long)-992068222640160502L, (long)l);
                    try {
                        try {
                            n = this.bT;
                            if (callSite != null) break block10;
                            if (n == this.bS) break block11;
                        }
                        catch (MatchException matchException) {
                            throw gQ.a("\u00f2", (Object)matchException, (long)-991918588161518007L, (long)l);
                        }
                        n = this.bT;
                    }
                    catch (MatchException matchException) {
                        throw gQ.a("\u00f2", (Object)matchException, (long)-991918588161518007L, (long)l);
                    }
                }
                try {
                    block13: {
                        try {
                            try {
                                if (callSite != null) break block12;
                                if (n == 0) break block13;
                            }
                            catch (MatchException matchException) {
                                throw gQ.a("\u00f2", (Object)matchException, (long)-991918588161518007L, (long)l);
                            }
                            gQ.a("\u00f2", (int)this.bR, (long)-992179419695398959L, (long)l);
                            if (callSite == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw gQ.a("\u00f2", (Object)matchException, (long)-991918588161518007L, (long)l);
                        }
                    }
                    n = this.bR;
                }
                catch (MatchException matchException) {
                    throw gQ.a("\u00f2", (Object)matchException, (long)-991918588161518007L, (long)l);
                }
            }
            gQ.a("\u00f2", (int)n, (long)-992038395630793739L, (long)l);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(dy_0 dy_02) {
        block8: {
            int n;
            long l;
            block6: {
                l = b ^ 0x34D6E8BF68CBL;
                CallSite callSite = gQ.a("\u00f2", (long)-8381456550449710946L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                n = this.bS;
                                if (callSite != null) break block6;
                                if (n == 0) break block7;
                            }
                            catch (MatchException matchException) {
                                throw gQ.a("\u00f2", (Object)matchException, (long)-8381306842889785379L, (long)l);
                            }
                            gQ.a("\u00f2", (int)this.bR, (long)-8381356640802421179L, (long)l);
                            if (callSite == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw gQ.a("\u00f2", (Object)matchException, (long)-8381306842889785379L, (long)l);
                        }
                    }
                    n = this.bR;
                }
                catch (MatchException matchException) {
                    throw gQ.a("\u00f2", (Object)matchException, (long)-8381306842889785379L, (long)l);
                }
            }
            gQ.a("\u00f2", (int)n, (long)-8381215620831202719L, (long)l);
        }
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
            case 0 -> 60;
            case 1 -> 17;
            case 2 -> 23;
            case 3 -> 25;
            case 4 -> 55;
            case 5 -> 45;
            case 6 -> 9;
            case 7 -> 36;
            case 8 -> 58;
            case 9 -> 24;
            case 10 -> 0;
            case 11 -> 54;
            case 12 -> 4;
            case 13 -> 11;
            case 14 -> 3;
            case 15 -> 27;
            case 16 -> 10;
            case 17 -> 1;
            case 18 -> 19;
            case 19 -> 31;
            case 20 -> 15;
            case 21 -> 16;
            case 22 -> 52;
            case 23 -> 13;
            case 24 -> 44;
            case 25 -> 32;
            case 26 -> 63;
            case 27 -> 56;
            case 28 -> 62;
            case 29 -> 49;
            case 30 -> 34;
            case 31 -> 18;
            case 32 -> 46;
            case 33 -> 53;
            case 34 -> 41;
            case 35 -> 8;
            case 36 -> 59;
            case 37 -> 14;
            case 38 -> 29;
            case 39 -> 47;
            case 40 -> 26;
            case 41 -> 51;
            case 42 -> 48;
            case 43 -> 61;
            case 44 -> 22;
            case 45 -> 40;
            case 46 -> 37;
            case 47 -> 42;
            case 48 -> 28;
            case 49 -> 21;
            case 50 -> 20;
            case 51 -> 43;
            case 52 -> 5;
            case 53 -> 33;
            case 54 -> 2;
            case 55 -> 6;
            case 56 -> 30;
            case 57 -> 12;
            case 58 -> 38;
            case 59 -> 35;
            case 60 -> 50;
            case 61 -> 7;
            case 62 -> 39;
            default -> 57;
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
        gQ.d[n3] = new String(cArray);
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gQ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


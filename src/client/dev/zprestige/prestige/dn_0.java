/*
 * Decompiled with CFR 0.152.
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
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dn
 */
public class dn_0 {
    public static final Random a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    static {
        b = hc.a(-835873860770747940L, -7319719085665765025L, MethodHandles.lookup().lookupClass()).a(179895409274136L);
        c = new Object[12];
        d = new String[12];
        dn_0.a();
        a = new Random();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dn_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                dn_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dn_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dn_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static float b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        l = b ^ l;
        return (float)dn_0.a("E", (float)f10, (float)dn_0.a("E", (float)f11, (float)f, (long)6135836462948911469L, (long)l), (long)6135758178053928434L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dn_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dn_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = dn_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = dn_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dn_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dn_0.a(clazz3, string2, clazz2)) != null) {
                    dn_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dn_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dn_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dn_0.b(438618385493748L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dn_0.a(l, l2);
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
                clazz3 = dn_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dn_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dn_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dn_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dn_0.b(438618385493748L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dn_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dn_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dn_0.b(438618385493748L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/dn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dn_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == '\u00ee' || c == 'T' || c == 'Q') {
                field = dn_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dn_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static float a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = b ^ l) ^ 0x36ABDA490C69L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = Float.valueOf(f + dn_0.a("\u00cc", (Object)a, (long)-2701091372180189491L, (long)l) * (f10 - f));
        return (float)dn_0.a("E", (Object)objectArray2, (long)-2702143923643703048L, (long)l);
    }

    public static int a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = b ^ l;
        return n + dn_0.a("\u00cc", (Object)a, (int)(n2 - n + 1), (long)-2165051429859061405L, (long)l);
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
            case 0 -> 31;
            case 1 -> 1;
            case 2 -> 52;
            case 3 -> 43;
            case 4 -> 19;
            case 5 -> 54;
            case 6 -> 33;
            case 7 -> 53;
            case 8 -> 41;
            case 9 -> 7;
            case 10 -> 35;
            case 11 -> 29;
            case 12 -> 60;
            case 13 -> 42;
            case 14 -> 55;
            case 15 -> 10;
            case 16 -> 11;
            case 17 -> 36;
            case 18 -> 44;
            case 19 -> 28;
            case 20 -> 34;
            case 21 -> 25;
            case 22 -> 57;
            case 23 -> 6;
            case 24 -> 2;
            case 25 -> 9;
            case 26 -> 63;
            case 27 -> 20;
            case 28 -> 38;
            case 29 -> 49;
            case 30 -> 47;
            case 31 -> 21;
            case 32 -> 8;
            case 33 -> 3;
            case 34 -> 15;
            case 35 -> 50;
            case 36 -> 27;
            case 37 -> 59;
            case 38 -> 40;
            case 39 -> 17;
            case 40 -> 30;
            case 41 -> 4;
            case 42 -> 23;
            case 43 -> 37;
            case 44 -> 0;
            case 45 -> 62;
            case 46 -> 61;
            case 47 -> 56;
            case 48 -> 58;
            case 49 -> 48;
            case 50 -> 14;
            case 51 -> 24;
            case 52 -> 16;
            case 53 -> 26;
            case 54 -> 45;
            case 55 -> 46;
            case 56 -> 51;
            case 57 -> 18;
            case 58 -> 32;
            case 59 -> 5;
            case 60 -> 39;
            case 61 -> 12;
            case 62 -> 13;
            default -> 22;
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
        dn_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u000e-s)S\u001f\u0005\"bf0\u0012\u0010$";
        objectArray[1] = Float.TYPE;
        dn_0.d[1] = "java/lang/Float";
        objectArray[2] = "\u0016%\n;rw\u0000%\u000faa`\u0017n\fgmt\u0006)\u001bp&c\u001c";
        objectArray[3] = "iX6\n\u0011 \u001cx=\u0005\u0000o}v6\u000e\u00045\t";
        objectArray[4] = "\u0002,2ewZ\u001c$(*\u000bN\u0006)+i";
        objectArray[5] = Integer.TYPE;
        dn_0.d[5] = "java/lang/Integer";
        objectArray[6] = "Ak@k\u0005.JdQ$d AoU~";
        objectArray[7] = "~C']\u001eI!R(FrO(Xjh\u0016N,T\u0016X\u001fX'\u0015,B\u0014\u0015E";
        objectArray[8] = ".xjp 7)da2[;\u0017>6%%+oz`8fQiiw*fksb:H";
        objectArray[9] = "]<-\u007f<d\u0002-\"dPb\u000b'`E6xfk%h!c\u0002:\u007f|?\u0004Znpu7`\u000b4dkP";
        objectArray[10] = "se_\tgu3{;UeaJ|VAn,pf]\f\fo'sY\r6u,>;Na`(?\u0001Tj-J";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\u001e\r(\u0015rN^\u0013LIxL'\u0014!]{\u0017\u001d\u000e*\u0010\u0019TJ\u001b.\u0011#NAVLRt[EWvH\u007f\u0016'";
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
            return MethodHandles.lookup().findStatic(dn_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


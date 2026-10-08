/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_241
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bR;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_241;

/*
 * Renamed from dev.zprestige.prestige.ac
 */
public class ac_0 {
    private static final bR a;
    private static final bR b;
    private final class_241 c;
    private static final long d;
    private static final Object[] e;
    private static final String[] f;

    public ac_0(class_241 class_2412) {
        this.c = class_2412;
    }

    static {
        d = hc.a(6665325078947719681L, -5852937042992085161L, MethodHandles.lookup().lookupClass()).a(63339520958854L);
        long l = d ^ 0x161CFEADCE0DL;
        long l2 = l ^ 0x16C432B1EE2FL;
        e = new Object[16];
        f = new String[16];
        ac_0.a();
        Object[] objectArray = new Object[4];
        objectArray[3] = l2;
        objectArray[2] = ac_0.a("R", (long)-3352125551217049476L, (long)l);
        objectArray[1] = "x";
        objectArray[0] = class_241.class;
        a = ac_0.a("\u00f1", (Object)objectArray, (long)-3351821069355091048L, (long)l);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = ac_0.a("R", (long)-3352125551217049476L, (long)l);
        objectArray2[1] = "y";
        objectArray2[0] = class_241.class;
        b = ac_0.a("\u00f1", (Object)objectArray2, (long)-3351821069355091048L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ac_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ac_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ac_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ac_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ac_0.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ac_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void b(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = ac_0.d ^ l) ^ 0xD5BBDC8F53EL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf((float)d);
        objectArray2[0] = this.c;
        ac_0.a("b", (Object)b, (Object)objectArray2, (long)-3639108814911640451L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = ac_0.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ac_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ac_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ac_0.a(clazz3, string2, clazz2)) != null) {
                    ac_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ac_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ac_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ac_0.b(772895799898571L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void c(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = ac_0.d ^ l;
        long l3 = l2 ^ 0x1550EA436F9DL;
        long l4 = l2 ^ 0x1E641BDC0706L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = d;
        ac_0.a("b", (Object)this, (Object)objectArray2, (long)-4785185996046984457L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = d10;
        ac_0.a("b", (Object)this, (Object)objectArray3, (long)-4785301299820105402L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = ac_0.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = ac_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ac_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ac_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ac_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ac_0.b(772895799898571L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ac_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ac_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ac_0.b(772895799898571L, 0L);
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
            if (c == 'o' || c == 'w' || c == 'R' || c == '\u00e2') {
                field = ac_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ac_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/ac" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ac_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void a(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = ac_0.d ^ l) ^ 0x66F4C579DA5L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf((float)d);
        objectArray2[0] = this.c;
        ac_0.a("b", (Object)a, (Object)objectArray2, (long)-6492991212559170330L, (long)l);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 32;
            case 2 -> 4;
            case 3 -> 62;
            case 4 -> 42;
            case 5 -> 21;
            case 6 -> 39;
            case 7 -> 35;
            case 8 -> 23;
            case 9 -> 41;
            case 10 -> 2;
            case 11 -> 6;
            case 12 -> 36;
            case 13 -> 53;
            case 14 -> 37;
            case 15 -> 49;
            case 16 -> 60;
            case 17 -> 13;
            case 18 -> 47;
            case 19 -> 29;
            case 20 -> 26;
            case 21 -> 61;
            case 22 -> 54;
            case 23 -> 50;
            case 24 -> 11;
            case 25 -> 31;
            case 26 -> 27;
            case 27 -> 57;
            case 28 -> 52;
            case 29 -> 15;
            case 30 -> 10;
            case 31 -> 7;
            case 32 -> 34;
            case 33 -> 33;
            case 34 -> 1;
            case 35 -> 40;
            case 36 -> 48;
            case 37 -> 58;
            case 38 -> 12;
            case 39 -> 30;
            case 40 -> 38;
            case 41 -> 0;
            case 42 -> 43;
            case 43 -> 17;
            case 44 -> 51;
            case 45 -> 8;
            case 46 -> 46;
            case 47 -> 44;
            case 48 -> 55;
            case 49 -> 22;
            case 50 -> 59;
            case 51 -> 25;
            case 52 -> 20;
            case 53 -> 63;
            case 54 -> 14;
            case 55 -> 45;
            case 56 -> 56;
            case 57 -> 24;
            case 58 -> 19;
            case 59 -> 16;
            case 60 -> 28;
            case 61 -> 18;
            case 62 -> 5;
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
        ac_0.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0017d_b\n3\u0001dZ8\u0019$\u0016/Y>\u00150\u0007hN)^!!";
        objectArray[1] = "=[\u000f.\u007fwH{\u0004!n8)u\u000f*jb]";
        objectArray[2] = Void.TYPE;
        ac_0.f[2] = "java/lang/Void";
        objectArray[3] = "\u001fX!p\u0012\u0004\tX$*\u0001\u0013\u001e\u0013',\r\u0007\u000fT0;F\u0017-";
        objectArray[4] = "!\u0019\u0006.O1T9\r!^~57\u0006*Z$A";
        objectArray[5] = "Qw#s#^Zx2<K^Tw!";
        objectArray[6] = "\n\u000b:L&O\u0001\u0004+\u0003KO\u0001\u0019?";
        objectArray[7] = "\u000f\u0001\u001b33\"\u0019\u0001\u001ei 5\u000eJ\u001do,!\u001f\r\nxg3\b";
        objectArray[8] = "_\u0004I'@1*$B(Q~K*I#U$?";
        objectArray[9] = ".\u0012e\u0011sX[2n\u001eb\u0017:<e\u0015fMN";
        objectArray[10] = "X\u0010\u0006Z\u0019sS\u001f\u0017\u0015x}X\u0014\u0013O";
        objectArray[11] = "\u0006l\u0007Mq\u0003\u0003\u007f\u0010G\u001a lL8!&\u0017\u0006z\u001eCp\u0015Qj";
        objectArray[12] = "/\u0014\u00077\u0005\u0018|PN<|O\u0013TTu\u0000I}ZP2\u0017%*\u0016\u0004wGEv\u0003M(|";
        objectArray[13] = "d-E.Q@z/LUQz9<\u0016)W\u001478Q>;C{l\u0014n[\u001fn%KU";
        objectArray[14] = "H\r\u001f\u0005o\u0006\u001bIV\u000e\u0016RtMLGjW\u001aCH\u0000};M\u000f\u001cE-[\u0011\u001aU\u001a\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "\u0010\u0001\u0000=I;\u0012\u0015\r-7+*T\u0002yK.DZ\u0006>\\BI\u0010\u0003;]xW\u0012\n@";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ac_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


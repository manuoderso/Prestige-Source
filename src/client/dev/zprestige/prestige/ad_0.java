/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
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
import net.minecraft.class_243;

/*
 * Renamed from dev.zprestige.prestige.ad
 */
public class ad_0 {
    private static final bR a;
    private static final bR b;
    private static final bR c;
    private final class_243 d;
    private static final long e;
    private static final Object[] f;
    private static final String[] g;

    public ad_0(class_243 class_2432) {
        this.d = class_2432;
    }

    static {
        e = hc.a(7957278894203925895L, 2307561989984823083L, MethodHandles.lookup().lookupClass()).a(197011434388248L);
        long l = e ^ 0x16DF005B1FA8L;
        long l2 = l ^ 0x53517D155029L;
        f = new Object[11];
        g = new String[11];
        ad_0.a();
        Object[] objectArray = new Object[4];
        objectArray[3] = l2;
        objectArray[2] = ad_0.a("Z", (long)8033414146317671184L, (long)l);
        objectArray[1] = "x";
        objectArray[0] = class_243.class;
        a = ad_0.a("N", (Object)objectArray, (long)8033539074353211027L, (long)l);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = ad_0.a("Z", (long)8033414146317671184L, (long)l);
        objectArray2[1] = "y";
        objectArray2[0] = class_243.class;
        b = ad_0.a("N", (Object)objectArray2, (long)8033539074353211027L, (long)l);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l2;
        objectArray3[2] = ad_0.a("Z", (long)8033414146317671184L, (long)l);
        objectArray3[1] = "z";
        objectArray3[0] = class_243.class;
        c = ad_0.a("N", (Object)objectArray3, (long)8033539074353211027L, (long)l);
    }

    public void e(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = e ^ l) ^ 0x4D6B0DA6C49AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = d;
        objectArray2[0] = this.d;
        ad_0.a("\u00b5", (Object)a, (Object)objectArray2, (long)5752311463224591668L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = d10;
        objectArray3[0] = this.d;
        ad_0.a("\u00b5", (Object)c, (Object)objectArray3, (long)5752311463224591668L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ad_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ad_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ad_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ad_0.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = ad_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                ad_0.f[n] = clazz = Class.forName(g[n]);
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
        long l2 = (l = e ^ l) ^ 0x6F461A12CFBL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = d;
        objectArray2[0] = this.d;
        ad_0.a("\u00b5", (Object)b, (Object)objectArray2, (long)-6362148854909948587L, (long)l);
    }

    public void c(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = e ^ l) ^ 0x43B03232A308L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = d;
        objectArray2[0] = this.d;
        ad_0.a("\u00b5", (Object)c, (Object)objectArray2, (long)2902110463929918118L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = ad_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = ad_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ad_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ad_0.a(clazz3, string2, clazz2)) != null) {
                    ad_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ad_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ad_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ad_0.b(526026092895276L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ad_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = ad_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ad_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ad_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ad_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ad_0.b(526026092895276L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ad_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ad_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ad_0.b(526026092895276L, 0L);
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

    public void d(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d10 = (Double)objectArray[1];
        double d11 = (Double)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = e ^ l) ^ 0x70C84386FC7FL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = d;
        objectArray2[0] = this.d;
        ad_0.a("\u00b5", (Object)a, (Object)objectArray2, (long)8588766288766631377L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = d10;
        objectArray3[0] = this.d;
        ad_0.a("\u00b5", (Object)b, (Object)objectArray3, (long)8588766288766631377L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l2;
        objectArray4[1] = d11;
        objectArray4[0] = this.d;
        ad_0.a("\u00b5", (Object)c, (Object)objectArray4, (long)8588766288766631377L, (long)l);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 31;
            case 1 -> 7;
            case 2 -> 24;
            case 3 -> 48;
            case 4 -> 29;
            case 5 -> 38;
            case 6 -> 10;
            case 7 -> 59;
            case 8 -> 26;
            case 9 -> 13;
            case 10 -> 33;
            case 11 -> 12;
            case 12 -> 23;
            case 13 -> 37;
            case 14 -> 3;
            case 15 -> 18;
            case 16 -> 39;
            case 17 -> 28;
            case 18 -> 63;
            case 19 -> 11;
            case 20 -> 35;
            case 21 -> 46;
            case 22 -> 56;
            case 23 -> 41;
            case 24 -> 34;
            case 25 -> 51;
            case 26 -> 17;
            case 27 -> 36;
            case 28 -> 57;
            case 29 -> 61;
            case 30 -> 8;
            case 31 -> 21;
            case 32 -> 19;
            case 33 -> 47;
            case 34 -> 54;
            case 35 -> 52;
            case 36 -> 4;
            case 37 -> 9;
            case 38 -> 58;
            case 39 -> 53;
            case 40 -> 55;
            case 41 -> 22;
            case 42 -> 25;
            case 43 -> 49;
            case 44 -> 1;
            case 45 -> 2;
            case 46 -> 50;
            case 47 -> 16;
            case 48 -> 27;
            case 49 -> 43;
            case 50 -> 30;
            case 51 -> 62;
            case 52 -> 15;
            case 53 -> 40;
            case 54 -> 6;
            case 55 -> 5;
            case 56 -> 45;
            case 57 -> 20;
            case 58 -> 0;
            case 59 -> 32;
            case 60 -> 44;
            case 61 -> 42;
            case 62 -> 14;
            default -> 60;
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
        ad_0.g[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '$' || c == 'Z' || c == '\u00d8') {
                field = ad_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ad_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00b5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ad_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ad" + " : " + string + " : " + methodType.toString(), exception);
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

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u000bc$mR1\u001dc!7A&\n(\"1M2\u001bo5&\u0006#=";
        objectArray[1] = "(+b6;0]\u000bi9*\u007f<\u0005b2.%H";
        objectArray[2] = Void.TYPE;
        ad_0.g[2] = "java/lang/Void";
        objectArray[3] = "K\t\u0005wB\u0002]\t\u0000-Q\u0015JB\u0003+]\u0001[\u0005\u0014<\u0016\u0011y";
        objectArray[4] = "P=\b\u0003K!%\u001d\u0003\fZnD\u0013\b\u0007^40";
        objectArray[5] = "o{c0\u0006#dtr\u007fl pxy4";
        objectArray[6] = "\u0019H\u0010:v\\\u0012G\u0001u\u001b\\\u0012Z\u0015";
        objectArray[7] = "\"K\u0018\u007f\u001dK)D\t0|E\"O\rj";
        objectArray[8] = "XB\u0005m?P\u0004I\u0002?V05 0\u0000j\u0001\u0015\n\u0012r6S\\I";
        objectArray[9] = "X\u0012m]6\u0013^\u0004q%9-X\u001b{N)]\u001c\u0012rOP\u0014\u001fZc]5_[\n,%";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "Cv\fe\u0010_\u0004!Qvj]y!\u001b}\u0001M\te\u0012t\u00004Ci\u001fl\f\nE\u007f\u0003\u0014";
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

    public void a(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = e ^ l) ^ 0x2CDBC48F39A5L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = d;
        objectArray2[0] = this.d;
        ad_0.a("\u00b5", (Object)a, (Object)objectArray2, (long)-5554291303769884661L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ad_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


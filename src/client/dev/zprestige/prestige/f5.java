/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dQ;
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
public class f5 {
    private long a;
    private static final long b = hc.a(2193087737990763533L, 1320054179505560519L, MethodHandles.lookup().lookupClass()).a(91757236295433L);
    private static final Object[] c = new Object[17];
    private static final String[] d = new String[17];

    public f5(long l) {
        l = b ^ l;
        this.a = (long)f5.a("\u00db", (long)3190040142573676398L, (long)l);
    }

    static {
        f5.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = f5.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = f5.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = f5.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                f5.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = f5.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = f5.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean b(Object[] objectArray) {
        dQ dQ2 = (dQ)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = b ^ l) ^ 0x11D6AB4692BDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf((float)f5.a("\u00e7", (Object)dQ2, (Object)new Object[0], (long)-5354010982094728986L, (long)l));
        return (boolean)f5.a("\u00e7", (Object)this, (Object)objectArray2, (long)-5354119062310747259L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = f5.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = f5.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = f5.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f5.a(clazz3, string2, clazz2)) != null) {
                    f5.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = f5.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        f5.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f5.b(777260133085729L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = f5.a(l, l2);
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
                clazz3 = f5.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = f5.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f5.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        f5.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f5.b(777260133085729L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = f5.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        f5.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f5.b(777260133085729L, 0L);
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
        MethodHandle methodHandle = f5.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean a(Object[] objectArray) {
        float f;
        block2: {
            block3: {
                float f10 = ((Float)objectArray[0]).floatValue();
                long l = (Long)objectArray[1];
                l = b ^ l;
                CallSite callSite = f5.a("\u00db", (long)-1093434768232970906L, (long)l);
                try {
                    float f11 = (float)(f5.a("\u00db", (long)-1093150724309844993L, (long)l) - this.a) - f10;
                    f = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (callSite != null) break block2;
                    if (f <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw f5.a("\u00db", (Object)matchException, (long)-1093356861567967166L, (long)l);
                }
                f = 1;
                break block2;
            }
            f = 0;
        }
        return (boolean)f;
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
            throw new RuntimeException("dev/zprestige/prestige/f5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 'Y' || c == '\u00a4' || c == '\u00d3') {
                field = f5.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f5.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00db' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
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
            case 0 -> 63;
            case 1 -> 40;
            case 2 -> 48;
            case 3 -> 26;
            case 4 -> 33;
            case 5 -> 61;
            case 6 -> 2;
            case 7 -> 47;
            case 8 -> 38;
            case 9 -> 62;
            case 10 -> 0;
            case 11 -> 14;
            case 12 -> 4;
            case 13 -> 21;
            case 14 -> 42;
            case 15 -> 24;
            case 16 -> 37;
            case 17 -> 1;
            case 18 -> 50;
            case 19 -> 25;
            case 20 -> 17;
            case 21 -> 18;
            case 22 -> 46;
            case 23 -> 7;
            case 24 -> 56;
            case 25 -> 35;
            case 26 -> 5;
            case 27 -> 51;
            case 28 -> 8;
            case 29 -> 60;
            case 30 -> 15;
            case 31 -> 53;
            case 32 -> 6;
            case 33 -> 27;
            case 34 -> 41;
            case 35 -> 58;
            case 36 -> 11;
            case 37 -> 16;
            case 38 -> 45;
            case 39 -> 44;
            case 40 -> 31;
            case 41 -> 34;
            case 42 -> 57;
            case 43 -> 36;
            case 44 -> 12;
            case 45 -> 32;
            case 46 -> 10;
            case 47 -> 30;
            case 48 -> 20;
            case 49 -> 22;
            case 50 -> 43;
            case 51 -> 13;
            case 52 -> 55;
            case 53 -> 49;
            case 54 -> 19;
            case 55 -> 54;
            case 56 -> 29;
            case 57 -> 59;
            case 58 -> 23;
            case 59 -> 3;
            case 60 -> 39;
            case 61 -> 52;
            case 62 -> 9;
            default -> 28;
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
        f5.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "n7\u0011>mEx7\u0014d~Ro|\u0017brF~;\u0000u9S?";
        objectArray[1] = "-\u001ezNE!X>qATn90zJP4M";
        objectArray[2] = Boolean.TYPE;
        f5.d[2] = "java/lang/Boolean";
        objectArray[3] = "{\u00068BNJm\u0006=\u0018]]zM>\u001eQIk\n)\t\u001a^N";
        objectArray[4] = "\u0007\u001c\u001ds;(r<\u0016|*g\u00132\u001dw.=g";
        objectArray[5] = Float.TYPE;
        f5.d[5] = "java/lang/Float";
        objectArray[6] = " \u000b<\u0013^\u00176\u000b9IM\u0000!@:OA\u00140\u0007-X\n\u0006\f";
        objectArray[7] = "K@vi\"$>`}f3kCxna:\"+";
        objectArray[8] = "i\u0016\u000bLEob\u0019\u001a\u0003&bw\u0014\u0015h\u0013`f\u0007\tD\u0004m";
        objectArray[9] = "i\u0019>[tdb\u0016/\u0014\tqp\f-W";
        objectArray[10] = Long.TYPE;
        f5.d[10] = "java/lang/Long";
        objectArray[11] = "#jK\u0010~a(eZ_\u001fo#n^\u0005";
        objectArray[12] = "!\rr5H\ro\u00010w&\u001b\u001dWy+\u001f\u0018-R%tIq";
        objectArray[13] = "sDgK\u000b2tR)t[\n,W{J\r{&Fm\u000423s\u0017&\u0006Su+R)t";
        objectArray[14] = "Wie\u0012\u007fxV21\u0014\u0019{mhv\u0018')\u001cbg\u000ei\u0016V,:OenV>w\u001c\u0019";
        objectArray[15] = "eqU\u001fZlbg\u001b \nT=}O_^i9'\u001aYcicu[\u001d^m9 ] ";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\u001b^\nW#TI\nIS\u001cNXI\u0002\u0003zYyR\u001d\u0003YDAW\u0019\u0015\u001c\u001a\u001fB\u001c\f&\\L\rFn";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public float a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (float)(f5.a("\u00db", (long)5272152699970863617L, (long)l) - this.a);
    }

    public void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        this.a = (long)f5.a("\u00db", (long)-4015787681231682706L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cV;
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
public class bQ {
    private final Object a;
    final cV b;
    private static final long c = hc.a(-4778466301992235029L, 695991968009259320L, MethodHandles.lookup().lookupClass()).a(85413411139226L);
    private static final Object[] d = new Object[10];
    private static final String[] e = new String[10];

    private bQ(cV cV2, Object object) {
        this.b = cV2;
        this.a = object;
    }

    static {
        bQ.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bQ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bQ.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = bQ.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                bQ.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bQ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bQ.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = bQ.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = bQ.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bQ.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bQ.a(clazz3, string2, clazz2)) != null) {
                    bQ.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bQ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bQ.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bQ.b(287734800503083L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = bQ.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = bQ.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bQ.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bQ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bQ.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bQ.b(287734800503083L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bQ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bQ.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bQ.b(287734800503083L, 0L);
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
            if (c == '\u00f5' || c == '\u00ec' || c == '\u00e9' || c == '\u00fc') {
                field = bQ.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bQ.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00db' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/bQ" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = bQ.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Object a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = c ^ l) ^ 0x3511FBCB6AC6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this.a;
        CallSite callSite = bQ.a("\u00db", (Object)this.b, (Object)objectArray2, (long)-5056290431737965706L, (long)l);
        return callSite;
    }

    public void a(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = c ^ l) ^ 0x6BA94B25845EL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = object;
        objectArray2[0] = this.a;
        bQ.a("\u00db", (Object)this.b, (Object)objectArray2, (long)-9212736739289333428L, (long)l);
    }

    public Field a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        return bQ.a("\u00db", (Object)this.b, (Object)new Object[0], (long)6562981142167966017L, (long)l);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 59;
            case 1 -> 42;
            case 2 -> 3;
            case 3 -> 8;
            case 4 -> 50;
            case 5 -> 7;
            case 6 -> 28;
            case 7 -> 1;
            case 8 -> 10;
            case 9 -> 37;
            case 10 -> 62;
            case 11 -> 41;
            case 12 -> 61;
            case 13 -> 17;
            case 14 -> 11;
            case 15 -> 32;
            case 16 -> 18;
            case 17 -> 13;
            case 18 -> 9;
            case 19 -> 58;
            case 20 -> 26;
            case 21 -> 51;
            case 22 -> 0;
            case 23 -> 23;
            case 24 -> 60;
            case 25 -> 6;
            case 26 -> 54;
            case 27 -> 31;
            case 28 -> 38;
            case 29 -> 44;
            case 30 -> 40;
            case 31 -> 39;
            case 32 -> 20;
            case 33 -> 52;
            case 34 -> 12;
            case 35 -> 2;
            case 36 -> 30;
            case 37 -> 15;
            case 38 -> 21;
            case 39 -> 25;
            case 40 -> 46;
            case 41 -> 55;
            case 42 -> 63;
            case 43 -> 33;
            case 44 -> 36;
            case 45 -> 29;
            case 46 -> 43;
            case 47 -> 57;
            case 48 -> 45;
            case 49 -> 56;
            case 50 -> 49;
            case 51 -> 27;
            case 52 -> 34;
            case 53 -> 53;
            case 54 -> 22;
            case 55 -> 14;
            case 56 -> 4;
            case 57 -> 16;
            case 58 -> 48;
            case 59 -> 19;
            case 60 -> 5;
            case 61 -> 35;
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
        bQ.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "MoQX$L[oT\u00027[L$W\u0004;O]c@\u0013p_\u007f";
        objectArray[1] = "msT<j \u0018S_3{oy]T8\u007f5\r";
        objectArray[2] = Void.TYPE;
        bQ.e[2] = "java/lang/Void";
        objectArray[3] = "'fD9KiRFO6Z&3HD=^|G";
        objectArray[4] = "f\f\\@Vmm\u0003M\u000f7cf\bIU";
        objectArray[5] = "z\u001e_s& \u000f>T|7on0_w35\u001a";
        objectArray[6] = "YT7&9>R[&ie7UY$$c|u\\$+s";
        objectArray[7] = "Y(\u0016S\u001b3]+\u0005h\u0016R\u0007b\u0016PM/\n+G\u0018|kK+\u0018\u0006Bb\n5\u001eh";
        objectArray[8] = "Y\u001f\u0010\u0015_\u0012]\u001c\u0003.Qs\u0007U\u0010\u0016\t\u000e\n\u001cA^8IG\u001c\u0005LZOX\u0014\u0001.";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "|\u0019&ia8x\u001a5RoY\"S&j7$/\u001aw\"\u0006e/\n9njdl\u0016(R";
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
            return MethodHandles.lookup().findStatic(bQ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


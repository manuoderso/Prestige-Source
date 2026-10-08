/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cW;
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
public class cH {
    private final Object a;
    final cW b;
    private static final long c = hc.a(-6520109391287248278L, 7919603451250197827L, MethodHandles.lookup().lookupClass()).a(14153291478807L);
    private static final Object[] d = new Object[7];
    private static final String[] e = new String[7];

    private cH(cW cW2, Object object) {
        this.b = cW2;
        this.a = object;
    }

    static {
        cH.a();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cH.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                cH.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cH.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cH.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cH.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cH.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = cH.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = cH.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cH.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cH.a(clazz3, string2, clazz2)) != null) {
                    cH.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cH.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cH.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cH.b(179715624102870L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cH.a(l, l2);
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
                clazz3 = cH.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cH.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cH.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cH.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cH.b(179715624102870L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cH.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cH.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cH.b(179715624102870L, 0L);
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

    public Object a(Object[] objectArray) {
        Object[] objectArray2 = (Object[])objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = c ^ l) ^ 0x66AE60209113L;
        CallSite callSite = null;
        try {
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l2;
            objectArray3[1] = objectArray2;
            objectArray3[0] = this.a;
            callSite = cH.a("\u00d0", (Object)this.b, (Object)objectArray3, (long)123331829712633411L, (long)l);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
        return callSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ba' || c == 'C' || c == 'Z' || c == '\u00ea') {
                field = cH.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ba' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cH.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ef' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = cH.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\bAY\u0019k{\u001eA\\Cxl\t\n_Etx\u0018MHR?h;";
        objectArray[1] = "\r-:Z[2x\r1UJ}\u0019\u0003:^N'm";
        objectArray[2] = "R\u001fOf\u000fLY\u0010^)nBR\u001bZs";
        objectArray[3] = "\r\\V\u0001\u001e\"x|]\u000e\u000fm\u0019rV\u0005\u000b7m";
        objectArray[4] = "\t*s\n3s\u0002%bEoz\u0005'`\bi1..q\u0003r{";
        objectArray[5] = "(:,>?\rt>'\u000f+7. yw8Tq786B\u000en>)0?Xe-|\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "d\u0000\u0001N\u001fP8\u0004\n\u007f\u000bjb\u001aT\u0007\u0018\t=\r\u0015FbQb\u0013^\u001d\u0003\u0005&\u0001W\u007f";
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
            case 0 -> 14;
            case 1 -> 61;
            case 2 -> 25;
            case 3 -> 31;
            case 4 -> 45;
            case 5 -> 47;
            case 6 -> 9;
            case 7 -> 1;
            case 8 -> 46;
            case 9 -> 41;
            case 10 -> 35;
            case 11 -> 59;
            case 12 -> 55;
            case 13 -> 11;
            case 14 -> 60;
            case 15 -> 33;
            case 16 -> 38;
            case 17 -> 6;
            case 18 -> 37;
            case 19 -> 26;
            case 20 -> 7;
            case 21 -> 24;
            case 22 -> 12;
            case 23 -> 36;
            case 24 -> 53;
            case 25 -> 4;
            case 26 -> 32;
            case 27 -> 28;
            case 28 -> 22;
            case 29 -> 21;
            case 30 -> 30;
            case 31 -> 43;
            case 32 -> 57;
            case 33 -> 23;
            case 34 -> 19;
            case 35 -> 50;
            case 36 -> 18;
            case 37 -> 17;
            case 38 -> 49;
            case 39 -> 20;
            case 40 -> 54;
            case 41 -> 13;
            case 42 -> 51;
            case 43 -> 40;
            case 44 -> 62;
            case 45 -> 0;
            case 46 -> 44;
            case 47 -> 39;
            case 48 -> 34;
            case 49 -> 29;
            case 50 -> 63;
            case 51 -> 2;
            case 52 -> 48;
            case 53 -> 16;
            case 54 -> 58;
            case 55 -> 52;
            case 56 -> 5;
            case 57 -> 27;
            case 58 -> 10;
            case 59 -> 8;
            case 60 -> 3;
            case 61 -> 42;
            case 62 -> 15;
            default -> 56;
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
        cH.e[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Method a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        return cH.a("\u00d0", (Object)this.b, (Object)new Object[0], (long)170752811794501580L, (long)l);
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
            return MethodHandles.lookup().findStatic(cH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


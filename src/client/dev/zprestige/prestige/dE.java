/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dD;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class dE
implements Runnable {
    final int a;
    final dD b;
    private static final long c = hc.a(5944569702043999055L, 2032183825163213192L, MethodHandles.lookup().lookupClass()).a(244241500070747L);
    private static final Object[] d = new Object[17];
    private static final String[] e = new String[17];

    dE(dD dD2, int n) {
        this.a = n;
        this.b = dD2;
    }

    static {
        dE.a();
    }

    @Override
    public void run() {
        int n;
        long l;
        long l2;
        block7: {
            block8: {
                l2 = c ^ 0x613C70DBFD4FL;
                l = l2 ^ 0x4F68064C35C2L;
                CallSite callSite = dE.a("x", (long)-1173682118004309113L, (long)l2);
                try {
                    if (dE.a("w", (Object)cz_0.b, (long)-1173484649722408744L, (long)l2) == null) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw dE.a("x", (Object)matchException, (long)-1173598344955534672L, (long)l2);
                }
                try {
                    try {
                        n = this.b.i;
                        if (callSite != null) break block7;
                        if (n == 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw dE.a("x", (Object)matchException, (long)-1173598344955534672L, (long)l2);
                    }
                    dE.a("o", (Object)this.b.m, (Object)this, (long)-1175035006762961249L, (long)l2);
                    return;
                }
                catch (MatchException matchException) {
                    throw dE.a("x", (Object)matchException, (long)-1173598344955534672L, (long)l2);
                }
            }
            n = this.a;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = n;
        dE.a("x", (Object)objectArray, (long)-1173635321465253221L, (long)l2);
        this.b.i = 1;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dE.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                dE.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dE.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dE.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dE.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dE.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = dE.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = dE.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dE.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dE.a(clazz3, string2, clazz2)) != null) {
                    dE.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dE.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dE.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dE.b(514645872936022L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dE.a(l, l2);
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
                clazz3 = dE.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dE.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dE.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dE.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dE.b(514645872936022L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dE.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dE.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dE.b(514645872936022L, 0L);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'w' || c == '\u00ee' || c == '\u00e6' || c == '\u00d8') {
                field = dE.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'w' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dE.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dE.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\u0015b!QD\u0017\u0003b$\u000bW\u0000\u0014)'\r[\u0014\u0005n0\u001a\u0010\u00069";
        objectArray[1] = "4D`J~=AdkEor<|xBf;T";
        objectArray[2] = "`\u000e)`xp`\u000e><t\u007fzE>\"tj}4n\u007f%";
        objectArray[3] = "\u0002\nys\u000fq\u0002\nn/\u0003~\u0018An1\u0003k\u001f0:iT";
        objectArray[4] = "P\u0013,]\"NF\u0013)\u00071YQX*\u0001=M@\u001f=\u0016vZq";
        objectArray[5] = "f6K_J\u0019m9Z\u0010)\u0014x4U{\u001c\u0016i'IW\u000b\u001b";
        objectArray[6] = "HTB1\u000fFV\\X~mZQA";
        objectArray[7] = "\u000b\u0015tBIY\u0000\u001ae\r(W\u000b\u0011aW";
        objectArray[8] = Boolean.TYPE;
        dE.e[8] = "java/lang/Boolean";
        objectArray[9] = "R&,A]zD&)\u001bNmSm*\u001dByB*=\n\tiD";
        objectArray[10] = "Oe\nrjN:E\u0001}{\u0001[K\nv\u007f[/";
        objectArray[11] = Void.TYPE;
        dE.e[11] = "java/lang/Void";
        objectArray[12] = "OZZ\u0005%\u001e\u0012\u0000\u0017\u0014J\u0017q\u0006\u0018\u0010'\u0017I\u0001\u0016Cs~A\u0007V\u001c&EK\u0005\u001b\u0003J";
        objectArray[13] = ").z(\rl}azQ\\\u0010|j,.Mq7nv<6";
        objectArray[14] = "kp\u001da.P<qZcOP0'Ah\u0018\u0007np\u0019\u0004u\\/#\\~2B #";
        objectArray[15] = "\\\u001e\u001c\u0015f\u0013\u0005\u0014AO\u0003\u0017f^\u001bEn\u0015\u0004\u001eGH}~]\u0003\u0013Fh\u001c\u001d_\u001eU\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "~|>3ZUxh/2#B.hS7\u0019E.=(xNI+\u0004m7HW9n,tCUB";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 7;
            case 1 -> 56;
            case 2 -> 32;
            case 3 -> 13;
            case 4 -> 2;
            case 5 -> 57;
            case 6 -> 9;
            case 7 -> 34;
            case 8 -> 4;
            case 9 -> 39;
            case 10 -> 1;
            case 11 -> 46;
            case 12 -> 48;
            case 13 -> 42;
            case 14 -> 16;
            case 15 -> 3;
            case 16 -> 40;
            case 17 -> 28;
            case 18 -> 62;
            case 19 -> 11;
            case 20 -> 26;
            case 21 -> 50;
            case 22 -> 61;
            case 23 -> 51;
            case 24 -> 45;
            case 25 -> 30;
            case 26 -> 18;
            case 27 -> 54;
            case 28 -> 58;
            case 29 -> 53;
            case 30 -> 21;
            case 31 -> 29;
            case 32 -> 19;
            case 33 -> 6;
            case 34 -> 63;
            case 35 -> 36;
            case 36 -> 43;
            case 37 -> 25;
            case 38 -> 38;
            case 39 -> 55;
            case 40 -> 41;
            case 41 -> 59;
            case 42 -> 37;
            case 43 -> 35;
            case 44 -> 49;
            case 45 -> 52;
            case 46 -> 27;
            case 47 -> 47;
            case 48 -> 14;
            case 49 -> 23;
            case 50 -> 12;
            case 51 -> 17;
            case 52 -> 24;
            case 53 -> 33;
            case 54 -> 60;
            case 55 -> 44;
            case 56 -> 5;
            case 57 -> 15;
            case 58 -> 10;
            case 59 -> 22;
            case 60 -> 20;
            case 61 -> 31;
            case 62 -> 0;
            default -> 8;
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
        dE.e[n3] = new String(cArray);
        return n3;
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
            return MethodHandles.lookup().findStatic(dE.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


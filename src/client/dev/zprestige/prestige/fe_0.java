/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.O;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import net.minecraft.class_1309;

/*
 * Renamed from dev.zprestige.prestige.fe
 */
public class fe_0
extends dV {
    private static final long k = hc.a(2894701851181186496L, 8933256106013785524L, MethodHandles.lookup().lookupClass()).a(232587429256700L);
    private static final Object[] l = new Object[10];
    private static final String[] m = new String[10];

    static {
        fe_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fe_0.m(l, l2);
            object = fe_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fe_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fe_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fe_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fe_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fe_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u0004v\u001fC(d\u001a~\u0005\fUt\u001a";
        objectArray[1] = "\u000bJ2\u0010O'\u0000E#_.)\u000bN'\u0005";
        objectArray[2] = "\n[6+GN\n[!wKA\u0010\u0010!iKT\u0017aq4\u001a";
        objectArray[3] = "3,wO\u001c\u001a3,`\u0013\u0010\u0015)g`\r\u0010\u0000.\u00164UG";
        objectArray[4] = "'d]7VH1dXmE_&/[kIK7hL|\u0002w";
        objectArray[5] = "S>/,D &\u001e$#UoG\u0010/(Q53";
        objectArray[6] = Void.TYPE;
        fe_0.m[6] = "java/lang/Void";
        objectArray[7] = "-vvZ1\b+v(IP\u0017v\"|[\u0007@(u$7j\u0017u)iL3Av?";
        objectArray[8] = "I|\u007f]%\u0018\u0012z%b \u0011p~$\u0019{\u0013\bas\u0002G\u0003Ay)\u000e?\u001c\u0016b\u0015[9\u0015O`r\u0000?Op";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u00059=3\u0012cAw#*hg?r0b\u00154C8;3\u0017\u000e\u0003v%\"\u0005t\u000f;:7h";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fe_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == '\u00ca' || c == 'm' || c == 'P') {
                field = fe_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fe_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(bG bG2) {
        long l = k ^ 0xAE6D277748FL;
        long l2 = l ^ 0x290E2D6EFFDL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = 0;
        fe_0.b("\u00de", (Object)new O((class_1309)fe_0.b("\u00f2", (Object)b, (long)4189415005361540768L, (long)l)), (Object)objectArray, (long)4188485576471236023L, (long)l);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fe_0.b("Y", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2449361973125469422L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fe_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 43;
            case 2 -> 22;
            case 3 -> 45;
            case 4 -> 62;
            case 5 -> 30;
            case 6 -> 4;
            case 7 -> 32;
            case 8 -> 46;
            case 9 -> 31;
            case 10 -> 13;
            case 11 -> 33;
            case 12 -> 20;
            case 13 -> 55;
            case 14 -> 14;
            case 15 -> 48;
            case 16 -> 42;
            case 17 -> 12;
            case 18 -> 2;
            case 19 -> 9;
            case 20 -> 1;
            case 21 -> 61;
            case 22 -> 52;
            case 23 -> 15;
            case 24 -> 47;
            case 25 -> 0;
            case 26 -> 10;
            case 27 -> 23;
            case 28 -> 16;
            case 29 -> 18;
            case 30 -> 3;
            case 31 -> 38;
            case 32 -> 29;
            case 33 -> 8;
            case 34 -> 49;
            case 35 -> 50;
            case 36 -> 37;
            case 37 -> 26;
            case 38 -> 63;
            case 39 -> 24;
            case 40 -> 36;
            case 41 -> 44;
            case 42 -> 56;
            case 43 -> 28;
            case 44 -> 11;
            case 45 -> 59;
            case 46 -> 51;
            case 47 -> 40;
            case 48 -> 21;
            case 49 -> 6;
            case 50 -> 19;
            case 51 -> 35;
            case 52 -> 60;
            case 53 -> 53;
            case 54 -> 39;
            case 55 -> 25;
            case 56 -> 54;
            case 57 -> 5;
            case 58 -> 17;
            case 59 -> 57;
            case 60 -> 41;
            case 61 -> 7;
            case 62 -> 34;
            default -> 58;
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
        fe_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fe_0.m(l, l2);
        Object object = fe_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fe_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fe_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fe_0.g(clazz3, string2, clazz2)) != null) {
                    fe_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fe_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fe_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fe_0.n(82578679591373L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fe_0.m(l, l2);
        Object object = fe_0.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = fe_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fe_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fe_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fe_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fe_0.n(82578679591373L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fe_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fe_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fe_0.n(82578679591373L, 0L);
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
            return MethodHandles.lookup().findStatic(fe_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


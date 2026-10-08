/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_310;

public class fA
extends dV {
    private static final long k = hc.a(-112513090820720672L, -3171338895445830173L, MethodHandles.lookup().lookupClass()).a(6678036579751L);
    private static final Object[] l = new Object[19];
    private static final String[] m = new String[19];

    static {
        fA.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fA.m(l, l2);
            object = fA.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fA.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fA.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fA.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fA.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fA.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\n\u00137g8\u0013\u001c\u00132=+\u0004\u000bX1;'\u0010\u001a\u001f&,l\u0002&";
        objectArray[1] = "Zr~DmE/RuK|\nRJfLuC:";
        objectArray[2] = "]\u001a\u0007\u0015geK\u001a\u0002Otr\\Q\u0001IxfM\u0016\u0016^3sx";
        objectArray[3] = "$F%gJ3/I4()>:D;C\u001c<+W'o\u000b1";
        objectArray[4] = "6.|r\t`6.k.\u0005o,ek0\u0005z+\u0014;mT";
        objectArray[5] = "\no\u000f\u007f4L\no\u0018#8C\u0010$\u0018=8V\u0017ULeo";
        objectArray[6] = Float.TYPE;
        fA.m[6] = "java/lang/Float";
        objectArray[7] = ".\u0012,\u0018N,.\u0012;DB#4Y;ZB63(k\u0007\u0016";
        objectArray[8] = "41\u001cz,\u000341\u000b& \f.z\u000b8 \u0019)\u000b[du";
        objectArray[9] = Boolean.TYPE;
        fA.m[9] = "java/lang/Boolean";
        objectArray[10] = Void.TYPE;
        fA.m[10] = "java/lang/Void";
        objectArray[11] = "\u001b\u00168/$z\u0010\u0019)`Et\u001b\u0012-:";
        objectArray[12] = "D \u0005I`y\u00032\u0016E_*\u0018&\u001f\u0019\b}IuDub&\u0002vE\u001716\u001c1";
        objectArray[13] = "g<>)+pl-iQ9\u00127x>),#6#17S";
        objectArray[14] = "Q|,'\u001by\u001a+g)$tk~a3EdZy2g\\\u001dQ{48],V(`!$";
        objectArray[15] = "q>C8\u001a{32\u0018ffq+<Be1&uk\u001a\t]`+(O4_!!k";
        objectArray[16] = "n:E\u001b~&l{OX\u0017u4(@\u000e@%ox\u001cb+q>%^\u0018n`-$";
        objectArray[17] = "\u0015\u0002hvM\u0005W\u000e3(1\u000fO\u0000i+fX\u0010\\5G\f\nPQ2zK\u0018C]";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "O\u001abgF\u0019\u001c\n| x\u001e\u001f\u0004y=\u0014,HC%jA{L\u0019t=\u0014\u0005\u0014F#`xD\u001c\u0015t8F\u0001\u0011\u001deZ";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fA.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == '\u00c3' || c == '\u00e5' || c == 'p') {
                field = fA.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fA.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    @bP
    public void a(bG bG2) {
        block9: {
            class_310 class_3102;
            long l;
            block10: {
                CallSite callSite;
                block8: {
                    l = k ^ 0x7CA639C37341L;
                    CallSite callSite2 = fA.b("e", (long)3854080638677988148L, (long)l);
                    try {
                        try {
                            try {
                                callSite = fA.b("H", (Object)b, (long)3854173819748593867L, (long)l);
                                if (callSite2 != null) break block8;
                                if (callSite == null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fA.b("e", (Object)matchException, (long)3854114279552451763L, (long)l);
                            }
                            class_3102 = b;
                            if (callSite2 != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw fA.b("e", (Object)matchException, (long)3854114279552451763L, (long)l);
                        }
                        callSite = fA.b("H", (Object)class_3102, (long)3854173819748593867L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fA.b("e", (Object)matchException, (long)3854114279552451763L, (long)l);
                    }
                }
                try {
                    if (!(fA.b("H", (Object)callSite, (long)3853735384930265554L, (long)l) > 0.0f)) break block9;
                    class_3102 = b;
                }
                catch (MatchException matchException) {
                    throw fA.b("e", (Object)matchException, (long)3854114279552451763L, (long)l);
                }
            }
            fA.b("\u00f0", (Object)fA.b("H", (Object)fA.b("H", (Object)class_3102, (long)3853808273805499120L, (long)l), (long)3853969377048425607L, (long)l), (boolean)true, (long)3853845514754067070L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fA.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 57;
            case 1 -> 62;
            case 2 -> 44;
            case 3 -> 24;
            case 4 -> 30;
            case 5 -> 58;
            case 6 -> 9;
            case 7 -> 10;
            case 8 -> 16;
            case 9 -> 41;
            case 10 -> 61;
            case 11 -> 13;
            case 12 -> 26;
            case 13 -> 18;
            case 14 -> 52;
            case 15 -> 31;
            case 16 -> 46;
            case 17 -> 32;
            case 18 -> 5;
            case 19 -> 40;
            case 20 -> 53;
            case 21 -> 19;
            case 22 -> 20;
            case 23 -> 39;
            case 24 -> 22;
            case 25 -> 21;
            case 26 -> 45;
            case 27 -> 12;
            case 28 -> 4;
            case 29 -> 49;
            case 30 -> 35;
            case 31 -> 38;
            case 32 -> 56;
            case 33 -> 51;
            case 34 -> 37;
            case 35 -> 6;
            case 36 -> 33;
            case 37 -> 55;
            case 38 -> 14;
            case 39 -> 17;
            case 40 -> 2;
            case 41 -> 50;
            case 42 -> 42;
            case 43 -> 60;
            case 44 -> 54;
            case 45 -> 25;
            case 46 -> 48;
            case 47 -> 7;
            case 48 -> 29;
            case 49 -> 28;
            case 50 -> 34;
            case 51 -> 8;
            case 52 -> 11;
            case 53 -> 23;
            case 54 -> 3;
            case 55 -> 47;
            case 56 -> 1;
            case 57 -> 0;
            case 58 -> 59;
            case 59 -> 27;
            case 60 -> 36;
            case 61 -> 43;
            case 62 -> 63;
            default -> 15;
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
        fA.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fA.m(l, l2);
        Object object = fA.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fA.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fA.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fA.g(clazz3, string2, clazz2)) != null) {
                    fA.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fA.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fA.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fA.n(832202245823169L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fA.m(l, l2);
        Object object = fA.l[n];
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
                clazz3 = fA.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fA.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fA.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fA.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fA.n(832202245823169L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fA.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fA.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fA.n(832202245823169L, 0L);
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
            return MethodHandles.lookup().findStatic(fA.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


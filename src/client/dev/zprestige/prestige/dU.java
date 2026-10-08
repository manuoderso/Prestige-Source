/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dT;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dU {
    public final ArrayList a = new ArrayList();
    private static final long db = hc.a(4453334024007971215L, -4153632545621367162L, MethodHandles.lookup().lookupClass()).a(272288397011182L);
    private static final Object[] sb = new Object[4];
    private static final String[] tb = new String[4];

    static {
        dU.e();
    }

    private static void e() {
        Object[] objectArray = sb;
        sb[0] = "u',Mgqk/6\u0002\bvm'#` wk";
        objectArray[1] = "Sv\u0004x6\nXy\u00157W\u0004Sr\u0011m";
        objectArray[2] = Boolean.TYPE;
        dU.tb[2] = "java/lang/Boolean";
        Object[] objectArray2 = objectArray;
        objectArray[3] = "<'o\u0012i\t25/kd\u001daU+Sh\u001218}\u0005d\u0012\rl`[v\u0015t:sWiq";
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (tb[n3] != null) {
            return n3;
        }
        Object object = sb[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 0;
            case 1 -> 54;
            case 2 -> 17;
            case 3 -> 41;
            case 4 -> 14;
            case 5 -> 55;
            case 6 -> 21;
            case 7 -> 30;
            case 8 -> 25;
            case 9 -> 10;
            case 10 -> 40;
            case 11 -> 44;
            case 12 -> 29;
            case 13 -> 20;
            case 14 -> 50;
            case 15 -> 53;
            case 16 -> 35;
            case 17 -> 23;
            case 18 -> 28;
            case 19 -> 32;
            case 20 -> 1;
            case 21 -> 61;
            case 22 -> 3;
            case 23 -> 6;
            case 24 -> 12;
            case 25 -> 8;
            case 26 -> 45;
            case 27 -> 60;
            case 28 -> 43;
            case 29 -> 11;
            case 30 -> 46;
            case 31 -> 15;
            case 32 -> 33;
            case 33 -> 24;
            case 34 -> 18;
            case 35 -> 4;
            case 36 -> 19;
            case 37 -> 26;
            case 38 -> 63;
            case 39 -> 47;
            case 40 -> 34;
            case 41 -> 52;
            case 42 -> 49;
            case 43 -> 37;
            case 44 -> 31;
            case 45 -> 9;
            case 46 -> 57;
            case 47 -> 7;
            case 48 -> 59;
            case 49 -> 48;
            case 50 -> 38;
            case 51 -> 5;
            case 52 -> 27;
            case 53 -> 58;
            case 54 -> 16;
            case 55 -> 36;
            case 56 -> 42;
            case 57 -> 2;
            case 58 -> 22;
            case 59 -> 13;
            case 60 -> 51;
            case 61 -> 56;
            case 62 -> 62;
            default -> 39;
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
        dU.tb[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dU.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'c' || c == '\u00d9' || c == 'd') {
                field = dU.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dU.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = dU.e(l, l2);
        Object object = sb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = tb[n];
                int n3 = string2.indexOf(8);
                clazz3 = dU.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dU.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dU.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dU.sb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dU.f(103327770070892L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dU.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dU.sb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dU.f(103327770070892L, 0L);
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

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dU.e(l, l2);
            object = sb[n];
            try {
                if (!(object instanceof String)) break block2;
                dU.sb[n] = clazz = Class.forName(tb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dU.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dU.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dU.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dU.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public dP a(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        l = db ^ l;
        dP dP2 = new dP(string, n, n2, n3);
        dU.f("\u00ee", (Object)this.a, (Object)dP2, (long)-3589982973330092586L, (long)l);
        return dP2;
    }

    public dQ a(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        long l = (Long)objectArray[5];
        l = db ^ l;
        dQ dQ2 = new dQ(string, f, f10, f11, f12);
        dU.f("\u00ee", (Object)this.a, (Object)dQ2, (long)-1320194426390139306L, (long)l);
        return dQ2;
    }

    public dR a(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        String[] stringArray = (String[])objectArray[2];
        long l = (Long)objectArray[3];
        l = db ^ l;
        dR dR2 = new dR(string, string2, stringArray);
        dU.f("\u00ee", (Object)this.a, (Object)dR2, (long)4763309020714697185L, (long)l);
        return dR2;
    }

    public dT a(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        String string3 = (String)objectArray[2];
        long l = (Long)objectArray[3];
        l = db ^ l;
        dT dT2 = new dT(string, string2, string3);
        dU.f("\u00ee", (Object)this.a, (Object)dT2, (long)38508153071616883L, (long)l);
        return dT2;
    }

    public dO a(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        l = db ^ l;
        dO dO2 = new dO(string, f, f10, f11);
        dU.f("\u00ee", (Object)this.a, (Object)dO2, (long)5636710283913072066L, (long)l);
        return dO2;
    }

    public dM a(Object[] objectArray) {
        String string = (String)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l = (Long)objectArray[2];
        l = db ^ l;
        dM dM2 = new dM(string, bl);
        dU.f("\u00ee", (Object)this.a, (Object)dM2, (long)4397375012673322749L, (long)l);
        return dM2;
    }

    public dL a(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = db ^ l;
        dL dL2 = new dL(string, n);
        dU.f("\u00ee", (Object)this.a, (Object)dL2, (long)1689021754461213835L, (long)l);
        return dL2;
    }

    public dS a(Object[] objectArray) {
        String string = (String)objectArray[0];
        String[] stringArray = (String[])objectArray[1];
        boolean[] blArray = (boolean[])objectArray[2];
        long l = (Long)objectArray[3];
        l = db ^ l;
        dS dS2 = new dS(string, stringArray, blArray);
        dU.f("\u00ee", (Object)this.a, (Object)dS2, (long)-6525033372468205L, (long)l);
        return dS2;
    }

    public dN a(Object[] objectArray) {
        String string = (String)objectArray[0];
        Color color = (Color)objectArray[1];
        long l = (Long)objectArray[2];
        l = db ^ l;
        dN dN2 = new dN(string, color);
        dU.f("\u00ee", (Object)this.a, (Object)dN2, (long)4276711985950718114L, (long)l);
        return dN2;
    }

    private static Field g(long l, long l2) {
        int n = dU.e(l, l2);
        Object object = sb[n];
        if (object instanceof String) {
            String string = tb[n];
            int n2 = string.indexOf(8);
            Class clazz = dU.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dU.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dU.c(clazz3, string2, clazz2)) != null) {
                    dU.sb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dU.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dU.sb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dU.f(103327770070892L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dU.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


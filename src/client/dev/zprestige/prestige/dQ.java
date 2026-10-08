/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.dK;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dQ
extends dK {
    private final float a;
    private final float b;
    private float c;
    private float d;
    private float e;
    private static final long f = hc.a(-5858652728056254128L, 6217827719243715771L, MethodHandles.lookup().lookupClass()).a(118237516192311L);
    private static final Object[] h = new Object[12];
    private static final String[] i = new String[12];

    public dQ(String string, float f, float f10, float f11, float f12) {
        super(string, Float.valueOf(f));
        this.c = f;
        this.d = f10;
        this.a = f11;
        this.b = f12;
        this.e = f;
    }

    static {
        dQ.f();
    }

    public float e(Object[] objectArray) {
        return this.e;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 20;
            case 1 -> 28;
            case 2 -> 41;
            case 3 -> 1;
            case 4 -> 18;
            case 5 -> 8;
            case 6 -> 13;
            case 7 -> 0;
            case 8 -> 44;
            case 9 -> 12;
            case 10 -> 47;
            case 11 -> 63;
            case 12 -> 61;
            case 13 -> 50;
            case 14 -> 48;
            case 15 -> 59;
            case 16 -> 27;
            case 17 -> 52;
            case 18 -> 51;
            case 19 -> 3;
            case 20 -> 58;
            case 21 -> 36;
            case 22 -> 45;
            case 23 -> 32;
            case 24 -> 31;
            case 25 -> 62;
            case 26 -> 15;
            case 27 -> 30;
            case 28 -> 35;
            case 29 -> 57;
            case 30 -> 2;
            case 31 -> 38;
            case 32 -> 49;
            case 33 -> 39;
            case 34 -> 60;
            case 35 -> 21;
            case 36 -> 4;
            case 37 -> 56;
            case 38 -> 34;
            case 39 -> 55;
            case 40 -> 19;
            case 41 -> 5;
            case 42 -> 29;
            case 43 -> 9;
            case 44 -> 10;
            case 45 -> 14;
            case 46 -> 54;
            case 47 -> 17;
            case 48 -> 11;
            case 49 -> 43;
            case 50 -> 16;
            case 51 -> 6;
            case 52 -> 42;
            case 53 -> 26;
            case 54 -> 53;
            case 55 -> 7;
            case 56 -> 37;
            case 57 -> 22;
            case 58 -> 40;
            case 59 -> 33;
            case 60 -> 46;
            case 61 -> 24;
            case 62 -> 25;
            default -> 23;
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
        dQ.i[n3] = new String(cArray);
        return n3;
    }

    public void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = f ^ l) ^ 0x6C1C9E2F5244L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        this.e = (float)dQ.a("\u00f1", (Object)this, (Object)objectArray2, (long)6051606668346745880L, (long)l);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dQ.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == 'W' || c == '\u00c7' || c == '\u00c3') {
                field = dQ.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dQ.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @cP
    public void b(float f) {
        this.d = f;
    }

    @cP
    public float b() {
        return this.d;
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

    @cP
    public float c() {
        return this.a;
    }

    public void c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.e = f;
    }

    private static Method h(long l, long l2) {
        int n = dQ.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = dQ.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dQ.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dQ.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dQ.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dQ.f(539720379224746L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dQ.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dQ.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dQ.f(539720379224746L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dQ.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                dQ.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void f() {
        Object[] objectArray = h;
        h[0] = "\u0001GFnoA\u0017GC4|V\u0000\f@2pB\u0011KW%;U4";
        objectArray[1] = "wB*$\u000fw\u0002b!+\u001e8cl* \u001ab\u0017";
        objectArray[2] = "\u0005M{\u001e\u0004!pmp\u0011\u0015n\u0011c{\u001a\u00114e";
        objectArray[3] = Float.TYPE;
        dQ.i[3] = "java/lang/Float";
        objectArray[4] = "k%Dcx?`*U,\u0005's-\\e";
        objectArray[5] = "'i##-n1i&y>y&\"%\u007f2m7e2hyz-";
        objectArray[6] = "\n{p\u00143'\u007f[{\u001b\"h\u001eUp\u0010&2j";
        objectArray[7] = "Y.\u0015$SnR!\u0004k2`Y*\u00001";
        objectArray[8] = "$\u0018k\n[\u0016{\u0014v\u001f8@\u001fYh\u0015QMeUb\u0003\u0004)%Ub\u0019@Bg\u0004\u007f\u00038";
        objectArray[9] = ":0\u0001){9;r\u0018Qy*$@\u0014*i=9t\u00050e!X7E*p&1m\b2lG:0\u0001){9;r\u0018Q";
        objectArray[10] = "J6Gb:\u001aKt^\u001a*d\u0014eQs'\u001e\u0018oG&C\u0006\u0014rGc=\u0007Vk?";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "|\u0005[\n\u0018-}GBr\u000fS\"VM\u001b\u0005).\\[Nai.\\A\n\n+\u007fA[r";
    }

    public float f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = f ^ l) ^ 0x452C643D45E8L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(this.d);
        objectArray2[0] = Float.valueOf(this.c);
        return (float)dQ.a("\u00fd", (Object)objectArray2, (long)2064713474624467055L, (long)l);
    }

    @cP
    public float d() {
        return this.b;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dQ.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dQ.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dQ.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dQ.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @cP
    public float a() {
        return this.c;
    }

    @cP
    public void a(float f) {
        this.c = f;
    }

    @Override
    public dQ a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = f ^ l) ^ 0x6769DAE11521L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        super.a(objectArray2);
        return this;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public dK a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l ^ 0x3853AF2C0839L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = predicate;
        return dQ.a("\u00f1", (Object)this, (Object)objectArray2, (long)-9174787468754977101L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = dQ.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = dQ.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dQ.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dQ.c(clazz3, string2, clazz2)) != null) {
                    dQ.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dQ.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dQ.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dQ.f(539720379224746L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    @cP
    public dK setDescription(String string) {
        long l = f ^ 0x4C2B8A67688CL;
        return dQ.a("\u00f1", (Object)this, (Object)string, (long)8473059849786714902L, (long)l);
    }

    @Override
    @cP
    public dQ setDescription(String string) {
        super.setDescription(string);
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dQ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


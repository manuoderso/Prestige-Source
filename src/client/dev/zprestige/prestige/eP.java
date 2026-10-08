/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5498
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a3;
import dev.zprestige.prestige.bK;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_5498;

public class eP
extends dV {
    private dM d;
    private float a = 0.0f;
    private float c = 0.0f;
    private class_5498 e = null;
    private static final long k = hc.a(2027247885877632269L, -785947692118700123L, MethodHandles.lookup().lookupClass()).a(259698657210932L);
    private static final Object[] l = new Object[36];
    private static final String[] m = new String[36];

    static {
        eP.f();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        eP.b("\u00ff", (Object)eP.b("F", (Object)b, (long)3993986671426378680L, (long)l), (Object)this.e, (long)3990385278039763824L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eP.m(l, l2);
            object = eP.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eP.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eP.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eP.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eP.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eP.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u000f$\u0001ocW\u0019$\u00045p@\u000eo\u00073|T\u001f(\u0010$7F#";
        objectArray[1] = "\u0018\u0015\"N:|m5)A+3\f;\"J/ix";
        objectArray[2] = Void.TYPE;
        eP.m[2] = "java/lang/Void";
        objectArray[3] = "xx\u0019Dcgnx\u001c\u001eppy3\u001f\u0018|dht\b\u000f7uW";
        objectArray[4] = "QoUirX$O^fc\u0017EAUmgM1";
        objectArray[5] = Double.TYPE;
        eP.m[5] = "java/lang/Double";
        objectArray[6] = ">^O\n`bK~D\u0005q-*pO\u000euw^";
        objectArray[7] = "l<168\u0006l<&j4\tvw&t4\u001cq\u0006v)`";
        objectArray[8] = "@\f`Ji>@\fw\u0016e1ZGw\be$]6!P=o";
        objectArray[9] = "r.9))kr..u%dhe.k%qo\u0014~6t";
        objectArray[10] = "s\u0007!\u0019\u0011\u0007s\u00076E\u001d\biL6[\u001d\u001dn=b\u0003J";
        objectArray[11] = "E_f(q\u0003S_crb\u0014D\u0014`tn\u0000USwc%\u0016q";
        objectArray[12] = ".\bK/w\u000b%\u0007Z`\u0014\u00060\nU\u000b!\u0004!\u0019I'6\t";
        objectArray[13] = Float.TYPE;
        eP.m[13] = "java/lang/Float";
        objectArray[14] = "`k7\u001e\rpkd&Qasef$\u001eM";
        objectArray[15] = Boolean.TYPE;
        eP.m[15] = "java/lang/Boolean";
        objectArray[16] = "\u0019iWbCI\u000fiR8P^\u0018\"Q>\\J\teF)\u0017]6";
        objectArray[17] = "Lc\b?*7Gl\u0019pK9Lg\u001d*";
        objectArray[18] = "\fJx(#2\u001aJ}r0%\r\u0001~t<1\u001cFicw#[";
        objectArray[19] = "ApI\"\u0019'4PB-\bhU^I&\f2!";
        objectArray[20] = "\u001bs2ztsnS9ue<\u000f]2~af{";
        objectArray[21] = "IT\u001d\u001b\u0002zH\n\u0017\u0017ix\u0019I\u0007\u0017\u0005JO\f_LU\u001dII\u0001\u0016\u0019m\u0014H\u0005\ti";
        objectArray[22] = "*Xy<x\u0017+\u0006s0\u0013\u0015zEc0\u007f',\u0000;k(p*Ee1c\u0000wDa.\u0013IwV>=\"\u001e+R~W";
        objectArray[23] = "\u000bS.mtN\u000bJl|\u001dJT]z}J\u001d\n\n\"\u0011\"MW\t' \u007fFJR";
        objectArray[24] = "<\u0006f\u0001\u0019\u0001rHtQk\u0004\u0003IoVT\u0006r\u0007#\u000f\u0007m3\b$S\u0000\u001c}D}\u0000k";
        objectArray[25] = "\u0016\\\u007f\u001bj3\u0015\u0019'~`R\u001d\u000f\u007fNl/\u0010Yy\u0014\tk\u0010\f#\u00148<L\bc~";
        objectArray[26] = "\u0005>G}\u0019\u0018\u00054\u0013et\u001b?:\u0012fD\u0017B7D`\u001er\u00043\u001b;\u000b\u0010\\+\u0002ct";
        objectArray[27] = "F\u0015.\u000eK?F\u001fz\u0016&?|\u0011{\u0015\u00160\u0001\u001c-\u0013LUG\u0018rHY7\u001f\u0000k\u0010&";
        objectArray[28] = "U\u0019\u0011.o\u0002\b\u0018\u00151\u001f\u001c\t\b\u0013$HHV[Iu\u001fO\u0014\u0003\u00118o\u0012\u0015\u0007\u000e";
        objectArray[29] = "bs\u0010_{\u0017?x\r\u0004BC0f\u0012\u0001.qf$N[\u007f&l|\u001d\u0019>EgkI\rB";
        objectArray[30] = "3\u0002wlj55RvaP8=_)h94\u0004Q)x=R3X jnm(F*wP";
        objectArray[31] = "+I\u001a*&&xL\u001b2^v@C\u000b)nx=N]/4\u001dyN\bu4,.\u0012\f5^";
        objectArray[32] = "-Q/^y?)_l@A8G^mKy>+\u00047O;Q";
        objectArray[33] = "\u001d0\u001d\u0017#$\u001d)_\u0006J B>I\u0007\u001dw\u001db\u0015kw/Y8F\fvqS4";
        objectArray[34] = "\u000f\r'N+\t\\\b&VSXd\u00076McW\u0019\n`K92]\n5\u00119\u0003\nV1QS";
        Object[] objectArray2 = objectArray;
        objectArray[35] = "\u0013Wx|\u0019,N\\e' xABz\"LJ\u0017\u0000&x\u001c\u001d\u001dXu:\\~\u0016O!. ";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'F' || c == '\u00e7' || c == '\u00fd' || c == 'X') {
                field = eP.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eP.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eP.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        try {
            this.a = (float)eP.b("\u00ff", (Object)eP.b("F", (Object)b, (long)3243603162228196705L, (long)l), (long)3246689766548528983L, (long)l);
            this.c = (float)eP.b("\u00ff", (Object)eP.b("F", (Object)b, (long)3243603162228196705L, (long)l), (long)3242943407827523422L, (long)l);
            this.e = eP.b("\u00ff", (Object)eP.b("F", (Object)b, (long)3246574386586157531L, (long)l), (long)3243481570997003328L, (long)l);
            if (eP.b("\u00ff", (Object)((Boolean)((Object)eP.b("\u00ff", (Object)this.d, (long)3246605599656002918L, (long)l))), (long)3243118532624358377L, (long)l) != false) {
                eP.b("\u00ff", (Object)eP.b("F", (Object)b, (long)3246574386586157531L, (long)l), (Object)eP.b("\u00fd", (long)3242960844634700170L, (long)l), (long)3243693201233031443L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw eP.b("\u00fc", (Object)matchException, (long)3242689128596036214L, (long)l);
        }
    }

    @bP
    public void a(a3 a32) {
        long l = k ^ 0x627755D9A98CL;
        eP.b("\u00ff", (Object)a32, (Object)new Object[]{Float.valueOf(this.a)}, (long)5400839644221768586L, (long)l);
        eP.b("\u00ff", (Object)a32, (Object)new Object[]{Float.valueOf(this.c)}, (long)5403438006613181225L, (long)l);
        eP.b("\u00ff", (Object)a32, (Object)new Object[0], (long)5403601175089792259L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bK bK2) {
        long l = k ^ 0x51A9A3D1AB01L;
        this.a = (float)((double)this.a + eP.b("\u00ff", (Object)bK2, (Object)new Object[0], (long)5219829586572592099L, (long)l) * (double)0.1f);
        this.c = (float)((double)this.c + eP.b("\u00ff", (Object)bK2, (Object)new Object[0], (long)5219929038037144863L, (long)l) * (double)0.1f);
        eP.b("\u00ff", (Object)bK2, (Object)new Object[0], (long)5219743974642960270L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = eP.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 8;
            case 2 -> 58;
            case 3 -> 48;
            case 4 -> 38;
            case 5 -> 14;
            case 6 -> 15;
            case 7 -> 5;
            case 8 -> 19;
            case 9 -> 11;
            case 10 -> 16;
            case 11 -> 57;
            case 12 -> 18;
            case 13 -> 50;
            case 14 -> 6;
            case 15 -> 7;
            case 16 -> 42;
            case 17 -> 39;
            case 18 -> 1;
            case 19 -> 25;
            case 20 -> 30;
            case 21 -> 49;
            case 22 -> 23;
            case 23 -> 40;
            case 24 -> 13;
            case 25 -> 22;
            case 26 -> 24;
            case 27 -> 10;
            case 28 -> 2;
            case 29 -> 32;
            case 30 -> 56;
            case 31 -> 44;
            case 32 -> 55;
            case 33 -> 33;
            case 34 -> 34;
            case 35 -> 43;
            case 36 -> 3;
            case 37 -> 29;
            case 38 -> 35;
            case 39 -> 27;
            case 40 -> 21;
            case 41 -> 17;
            case 42 -> 51;
            case 43 -> 47;
            case 44 -> 28;
            case 45 -> 4;
            case 46 -> 45;
            case 47 -> 53;
            case 48 -> 37;
            case 49 -> 26;
            case 50 -> 36;
            case 51 -> 9;
            case 52 -> 52;
            case 53 -> 63;
            case 54 -> 46;
            case 55 -> 20;
            case 56 -> 62;
            case 57 -> 0;
            case 58 -> 59;
            case 59 -> 41;
            case 60 -> 60;
            case 61 -> 31;
            case 62 -> 12;
            default -> 61;
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
        eP.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eP.m(l, l2);
        Object object = eP.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eP.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eP.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eP.g(clazz3, string2, clazz2)) != null) {
                    eP.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eP.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eP.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eP.n(1242386447306355L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eP.m(l, l2);
        Object object = eP.l[n];
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
                clazz3 = eP.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eP.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eP.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eP.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eP.n(1242386447306355L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eP.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eP.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eP.n(1242386447306355L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eP.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


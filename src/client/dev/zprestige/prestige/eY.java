/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.g9;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eY
extends dV {
    private static eY a;
    private dO c;
    private static final long k;
    private static final Object[] l;
    private static final String[] m;

    public eY() {
        a = this;
    }

    static {
        k = hc.a(-3312812709881968787L, -3594215934441747723L, MethodHandles.lookup().lookupClass()).a(173878241333353L);
        l = new Object[26];
        m = new String[26];
        eY.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public static float b(Object[] objectArray) {
        Object object;
        block12: {
            Float f;
            long l;
            block10: {
                Float f10;
                block11: {
                    Object object2;
                    CallSite callSite;
                    block8: {
                        eY eY2;
                        block9: {
                            l = (Long)objectArray[0];
                            l = k ^ l;
                            eY2 = a;
                            callSite = eY.b("h", (long)-6884028142522596693L, (long)l);
                            try {
                                try {
                                    object2 = eY2;
                                    if (callSite != null) break block8;
                                    if (object2 != null) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw eY.b("h", (Object)matchException, (long)-6884128042914557891L, (long)l);
                                }
                                return 115.0f;
                            }
                            catch (MatchException matchException) {
                                throw eY.b("h", (Object)matchException, (long)-6884128042914557891L, (long)l);
                            }
                        }
                        object2 = eY.b("Z", (Object)eY2.c, (long)-6883917530305837164L, (long)l);
                    }
                    f10 = (Float)object2;
                    try {
                        try {
                            f = f10;
                            if (callSite != null) break block10;
                            if (f != null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw eY.b("h", (Object)matchException, (long)-6884128042914557891L, (long)l);
                        }
                        object = 115.0f;
                        break block12;
                    }
                    catch (MatchException matchException) {
                        throw eY.b("h", (Object)matchException, (long)-6884128042914557891L, (long)l);
                    }
                }
                f = f10;
            }
            object = eY.b("Z", (Object)f, (long)-6883818423234300174L, (long)l);
        }
        return object;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eY.m(l, l2);
            object = eY.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eY.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eY.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eY.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eY.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eY.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u000b:H$.\n\u001d:M~=\u001d\nqNx1\t\u001b6Yoz\u001f6";
        objectArray[1] = "@xGp\u0000%KwV?c(^zYTV*OiExA'";
        objectArray[2] = "\u0005V\u0006,8#\u0013V\u0003v+4\u0004\u001d\u0000p' \u0015Z\u0017gl2)";
        objectArray[3] = "'|B>4^R\\I1%\u0011/DZ6,XG";
        objectArray[4] = ":9IxH\u0015,9L\"[\u0002;rO$W\u0016*5X3\u001c\u0001\u0015";
        objectArray[5] = "x\u0012)c>zs\u001d8,_tx\u0016<v";
        objectArray[6] = "24L2k,9;]}\u0003,74N";
        objectArray[7] = Float.TYPE;
        eY.m[7] = "java/lang/Float";
        objectArray[8] = "G\u001f^hOwG\u001fI4Cx]TI*CmZ%\u0019w\u0012";
        objectArray[9] = "}+\u000e][8}+\u0019\u0001W7g`\u0019\u001fW\"`\u0011N@\u0001";
        objectArray[10] = Void.TYPE;
        eY.m[10] = "java/lang/Void";
        objectArray[11] = "[q\u0018r=<Mq\u001d(.+Z:\u001e.\"?K}\t9i+\u0006";
        objectArray[12] = "id\u001f\u0000T\u001d\u007fd\u001aZG\nh/\u0019\\K\u001eyh\u000eK\u0000\u000eah\f@ZC]s\f]Z\u0004jd";
        objectArray[13] = "a\u001e\u007f*5\u0000w\u001ezp&\u0017`Uyv*\u0003q\u0012naa\u0017=";
        objectArray[14] = ">\u000bVm1o(\u000bS7\"x?@P1.l.\u0007G&e{\f";
        objectArray[15] = ">\u0018\"\u0015$/K8)\u001a5`*6\"\u00111:^";
        objectArray[16] = "\fo(\u0006\u007f\u001cS+4\bCA<+3Q/MB,1\u000fx";
        objectArray[17] = "\t\u001d%al;VY9oPa9W2,:o\u0002\b=*0";
        objectArray[18] = "l\u0012.iN#g\u0011mUM\u0013'\u001c5iIi,K:UT\"5\u0011:/_u:-";
        objectArray[19] = "n\t'\u007f\u0019\u00021\u0017jl)V_\u001bduN\u0001!\nj9\u0010?`Cm9B^d\u000bhn)";
        objectArray[20] = "\u0013\u0007\u0010\u0001lE\u0013\u0002SF\u0010N*@\u0002\u0014lJX\u0000\u000fEh$";
        objectArray[21] = "hl@8C><cAy%%R(N8E54\u007f\u001a{KL";
        objectArray[22] = "KDn7<\u0001O\u00185!N\u001a\u0018\u00005)\"(LAmqNA\u0013E1>,\u0006\u0012\u0006.NqN\u000eB>/u\u0006\u000b\u0015U";
        objectArray[23] = "1_UEp\u00077\n\u0003K\u001a\u0003i\\\u0001HD\u0004iF\u00054'S5\u0007\tNh\u001f2^h";
        objectArray[24] = "T|\u0012uV+S~L\"90\u0006f\u0015~U\u0002Q'I \bUT+\u000e'R4Pc\u000bp9";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "\no8#\u001d>\u000e3c5o.U:g68y\u000bj>ZQ&\r3s8\u0016'N,";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eY.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00ce' || c == '\u00c8' || c == 'V') {
                field = eY.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eY.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void d(Object[] objectArray) {
        class_310 class_3102;
        long l;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                l = l2 ^ 0x148CA4297AAAL;
                CallSite callSite = eY.b("h", (long)3243509114378162143L, (long)l2);
                try {
                    try {
                        class_3102 = b;
                        if (callSite != null) break block4;
                        if (!(eY.b("o", (Object)class_3102, (long)3242621127983190617L, (long)l2) instanceof g9)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw eY.b("h", (Object)matchException, (long)3243414985344507209L, (long)l2);
                    }
                    eY.b("Z", (Object)eY.b("\u00c8", (long)3243244884078150461L, (long)l2), (long)3242684540491843205L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw eY.b("h", (Object)matchException, (long)3243414985344507209L, (long)l2);
                }
            }
            class_3102 = b;
        }
        eY.b("Z", (Object)class_3102, (Object)eY.b("\u00c8", (long)3243170469743613485L, (long)l2), (long)3243657064823626773L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        eY.b("Z", (Object)this, (Object)objectArray2, (long)3243329967744840911L, (long)l2);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = eY.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 35;
            case 1 -> 37;
            case 2 -> 24;
            case 3 -> 7;
            case 4 -> 8;
            case 5 -> 15;
            case 6 -> 29;
            case 7 -> 51;
            case 8 -> 44;
            case 9 -> 0;
            case 10 -> 38;
            case 11 -> 17;
            case 12 -> 16;
            case 13 -> 25;
            case 14 -> 14;
            case 15 -> 45;
            case 16 -> 48;
            case 17 -> 36;
            case 18 -> 11;
            case 19 -> 53;
            case 20 -> 34;
            case 21 -> 1;
            case 22 -> 39;
            case 23 -> 49;
            case 24 -> 10;
            case 25 -> 23;
            case 26 -> 54;
            case 27 -> 13;
            case 28 -> 30;
            case 29 -> 3;
            case 30 -> 21;
            case 31 -> 46;
            case 32 -> 2;
            case 33 -> 33;
            case 34 -> 60;
            case 35 -> 5;
            case 36 -> 52;
            case 37 -> 9;
            case 38 -> 26;
            case 39 -> 40;
            case 40 -> 50;
            case 41 -> 32;
            case 42 -> 20;
            case 43 -> 63;
            case 44 -> 61;
            case 45 -> 28;
            case 46 -> 57;
            case 47 -> 59;
            case 48 -> 43;
            case 49 -> 42;
            case 50 -> 19;
            case 51 -> 6;
            case 52 -> 4;
            case 53 -> 56;
            case 54 -> 31;
            case 55 -> 58;
            case 56 -> 18;
            case 57 -> 55;
            case 58 -> 62;
            case 59 -> 41;
            case 60 -> 47;
            case 61 -> 12;
            case 62 -> 27;
            default -> 22;
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
        eY.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eY.m(l, l2);
        Object object = eY.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eY.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eY.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eY.g(clazz3, string2, clazz2)) != null) {
                    eY.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eY.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eY.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eY.n(367488182117067L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eY.m(l, l2);
        Object object = eY.l[n];
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
                clazz3 = eY.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eY.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eY.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eY.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eY.n(367488182117067L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eY.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eY.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eY.n(367488182117067L, 0L);
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
            return MethodHandles.lookup().findStatic(eY.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

